var noichart = echarts.init(document.getElementById('noi-chart'));

// 指定图表的配置项和数据
/**
 * 这里是提供组合测试的机构的数量
 * 修改dataAxis和data就行
 * @type {string[]}
 */
var dataAxis = [];
var data = [];
var yMax = 100;
var dataShadow = [];

for (var i = 0; i < data.length; i++) {
    dataShadow.push(yMax);
}

option = {
    title: {
        text: 'The Number of New Institutions that Contribute to Combinatorial Testing',
        left: 'center',
        subtextStyle: {
            color: '#000000'
        }
    },
    xAxis: {
        data: dataAxis,
        axisLabel: {
            inside: true,
            textStyle: {
                color: '#000000'
            }
        },
        axisTick: {
            show: false
        },
        axisLine: {
            show: false
        },
        z: 10
    },
    yAxis: {
        axisLine: {
            show: false
        },
        axisTick: {
            show: false
        },
        axisLabel: {
            textStyle: {
                color: '#000000'
            }
        }
    },
    dataZoom: [
        {
            type: 'inside'
        }
    ],
    series: [
        { // For shadow
            type: 'bar',
            itemStyle: {
                normal: {color: 'rgba(0,0,0,0.05)'}
            },
            barGap:'-100%',
            barCategoryGap:'40%',
            data: dataShadow,
            animation: false
        },
        {
            type: 'bar',
            itemStyle: {
                normal: {
                    color: new echarts.graphic.LinearGradient(
                        0, 0, 0, 1,
                        [
                            {offset: 0, color: '#83bff6'},
                            {offset: 0.5, color: '#188df0'},
                            {offset: 1, color: '#188df0'}
                        ]
                    )
                },
                emphasis: {
                    color: new echarts.graphic.LinearGradient(
                        0, 0, 0, 1,
                        [
                            {offset: 0, color: '#2378f7'},
                            {offset: 0.7, color: '#2378f7'},
                            {offset: 1, color: '#83bff6'}
                        ]
                    )
                }
            },
            data: data
        }
    ]
};



// Enable data zoom when user click bar.
var zoomSize = 6;
noichart.on('click', function (params) {
    console.log(dataAxis[Math.max(params.dataIndex - zoomSize / 2, 0)]);
    noichart.dispatchAction({
        type: 'dataZoom',
        startValue: dataAxis[Math.max(params.dataIndex - zoomSize / 2, 0)],
        endValue: dataAxis[Math.min(params.dataIndex + zoomSize / 2, data.length - 1)]
    });
});
function loadNoiChartOut(){
	$.getJSON('../noi.action',function(dataa){
		//上面这个url是重点，组成为：项目名/过滤前缀/Controller中mapping值，当页面加载此js时，它会向后台取数据
		if(dataa){
			
			noichart.showLoading({text: '正在努力的读取数据中...'});

			noichart.setOption({
				xAxis :[
					{
						data:dataa.dataAxis
					}
				],
				series: [
			        
			        {
			            type: 'bar',
			            itemStyle: {
			                normal: {
			                    color: new echarts.graphic.LinearGradient(
			                        0, 0, 0, 1,
			                        [
			                            {offset: 0, color: '#83bff6'},
			                            {offset: 0.5, color: '#188df0'},
			                            {offset: 1, color: '#188df0'}
			                        ]
			                    )
			                },
			                emphasis: {
			                    color: new echarts.graphic.LinearGradient(
			                        0, 0, 0, 1,
			                        [
			                            {offset: 0, color: '#2378f7'},
			                            {offset: 0.7, color: '#2378f7'},
			                            {offset: 1, color: '#83bff6'}
			                        ]
			                    )
			                }
			            },
			            data: dataa.number
			        }
			    ]
				
			});
			noichart.hideLoading();
		}else{
			alert('提示',dataa.msg);
		}
	});
}
//载入图表
$(function(){
	noichart.setOption(option);
	loadNoiChartOut();
	//window.addEventListener('resize', function () { chartOutChar.resize(); });
});
