var nopCharts = null;

/**
 * 别问怎么写的这里，问就是不会，官网复制过来的，改就行了
 * @type {{yAxis: {type: string}[], xAxis: {data: Array, type: string, boundaryGap: boolean}[], legend: {data: Array}, grid: {left: string, bottom: string, right: string, containLabel: boolean}, series: Array, tooltip: {axisPointer: {label: {backgroundColor: string}, type: string}, trigger: string}, toolbox: {feature: {saveAsImage: {}}}, title: {text: string, subtextStyle: {color: string}}}}
 */
option_nop = {
	title: {
		text: '',
		subtextStyle: {
			color: '#000000'
		}
	},
	tooltip : {
		trigger: 'axis',
		axisPointer: {
			type: 'cross',
			label: {
				backgroundColor: '#6a7985'
			}
		}
	},
	legend: {
		// 这里放的是论文的主题类型
		data:[]
	},
	toolbox: {
		feature: {
			saveAsImage: {}
		}
	},
	grid: {
		left: '3%',
		right: '4%',
		bottom: '3%',
		containLabel: true
	},
	xAxis : [
		{
			type : 'category',
			boundaryGap : false,
			// 年份是按照论文信息里面的来的
			data: []
		}
	],
	yAxis : [
		{
			type : 'value'
		}
	],
	series : [
		// 要改的就是这里的数据
		// {
		// 	areaStyle: "{}",
			// 这里放的是逐年的数据
			// data: [0, 0, 0, 0, 0, 0, 0, 0, 1, 0],
			// 这里是论文主题的名字
		// 	name: "a",
		// 	stack: "总量",
		// 	type: "line"
		// }
	]
};

/**
 * Ajax 加载数据
 */
function getNOPDate() {
	$.ajax({
		"type": "post",
		"dataType": "json",
		"contentType" : "application/json",
		"url": path + "/rest/getChartsData/getNOPData",
		"async": false,
		"success": function (data) {
			// 将后天获取过来的数据放入图标中
			for (var i = 0; i < data.length; i++) {
				option_nop.legend.data.push(data[i].name);
				option_nop.series.push(data[i]);
			}

			// 这里是获取系统当前年份，由于从数据库中读取在传递过来会导致代码逻辑变得复杂混乱
			// 这里直接获取当前系统时间，直接从10年前记录到今年，不再去从数据库获取时间，减轻后台业务处理压力
			// 顺便简化代码逻辑
			var date = new Date;
			var year = date.getFullYear();
			for (var i = year - 9; i <= year; i++) {
				option_nop.xAxis[0].data.push(i);
			}
		},
		"error": function (data) {
			alert("NOP get data error");
		}
	})
}

$(function () {
	getNOPDate();
	nopCharts = echarts.init(document.getElementById('nop-charts'));
	nopCharts.setOption(option_nop);
});
