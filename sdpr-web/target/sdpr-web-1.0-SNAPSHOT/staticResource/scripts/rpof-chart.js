var rpofCharts = null;

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

				option_rpof.legend.data.push(data[i].name);
				data_template.name = data[i].name;
				data_template.data = data[i].data;
				console.log(data_template);
				option_rpof.series.push(data_template);
			}

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
