var rpofCharts = null;

/**
 * 别问怎么写的这里，问就是不会，官网复制过来的，改就行了
 * @type {{yAxis: {type: string}, xAxis: {data: Array, type: string}, legend: {data: Array}, grid: {left: string, bottom: string, right: string, containLabel: boolean}, series: Array, tooltip: {axisPointer: {type: string}, trigger: string}}}
 */
option_rpof = {
	tooltip : {
		trigger: 'axis',
		axisPointer : {
			type : 'shadow'
		}
	},
	legend: {
		data: []
	},
	grid: {
		left: '3%',
		right: '4%',
		bottom: '3%',
		containLabel: true
	},
	xAxis:  {
		type: 'category',
		data: []
	},
	yAxis: {
		type: 'value'
	},
	series: []
};

/**
 * Ajax 加载数据
 */
function getRPOFData() {
	$.ajax({
		"type": "post",
		"dataType": "json",
		"contentType" : "application/json",
		// 因为这里获取的值和 NOP 图的值是相同的，只不过图标的表示方式不同，所以这里就复用了那里的代码
		"url": path + "/rest/getChartsData/getNOPData",
		"async": false,
		"success": function (data) {
			for (var i = 0; i < data.length; i++) {
				/**
				 * 这个是要加载到图表文件中的数据模板，应为 js 的语法问题，好像是和闭包有关
				 * 不能把这玩意放到循环外面，要不只会加载最后一条数据
				 */
				var data_template = {
					name: '',
					type: 'bar',
					stack: '总量',
					label: {
						normal: {
							show: true,
							position: 'insideRight'
						}
					},
					data: []
				};

				// 添加主题名到图表上方按钮名称
				option_rpof.legend.data.push(data[i].name);

				// 添加主题名和主题对应的文章数到图表数据模板中
				data_template.name = data[i].name;
				data_template.data = data[i].data;

				// 将数据模板添加到图表结构中
				option_rpof.series.push(data_template);
			}

			// 这里是获取系统当前年份，由于从数据库中读取在传递过来会导致代码逻辑变得复杂混乱
			// 这里直接获取当前系统时间，直接从10年前记录到今年，不再去从数据库获取时间，减轻后台业务处理压力
			// 顺便简化代码逻辑
			var date = new Date;
			var year = date.getFullYear();
			for (var i = year - 9; i <= year; i++) {
				option_rpof.xAxis.data.push(i);
			}
		},
		"error": function (data) {
			alert("RPOF get data error")
		}
	});
}

$(function () {
	getRPOFData();
	rpofCharts = echarts.init(document.getElementById('rpof-charts'));
	rpofCharts.setOption(option_rpof);
});
