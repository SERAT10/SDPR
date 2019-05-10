var sitmChart = echarts.init(document.getElementById('sitm-chart'));
var option4 = {
    title: {
        sublink: 'http://esa.un.org/wpp/Excel-Data/population.htm',
        left: 'center',
        top: 'top'
    },
    visualMap: {
        min: 0,
        max: 1000,
        text:['High','Low'],
        realtime: false,
        calculable: true,
        color: ['orangered','yellow','lightskyblue']
    }
  
};

function loadSitmChartOut(){
	$.getJSON('../sitm.action',function(data){
		//上面这个url是重点，组成为：项目名/过滤前缀/Controller中mapping值，当页面加载此js时，它会向后台取数据
		if(data){
			
			sitmChart.showLoading({text: '正在努力的读取数据中...'});

			sitmChart.setOption({
				  series: [
				        {
				            name: '',
				            type: 'map',
				            mapType: 'world',
				            roam: true,
				            itemStyle:{
				                emphasis:{label:{show:true}}
				            },
				            data:data.listMap
				        }
				    ]
				
			});
			sitmChart.hideLoading();
		}else{
			alert('提示',data.msg);
		}
	});
}

//载入图表
$(function(){
	sitmChart.setOption(option4);
	loadSitmChartOut();
	//window.addEventListener('resize', function () { chartOutChar.resize(); });
});
