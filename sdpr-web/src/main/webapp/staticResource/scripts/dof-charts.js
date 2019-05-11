var dofCharts = null;

option_dof = {
    backgroundColor: 'rgba(44, 52, 60, 0.7)',

    tooltip : {
        trigger: 'item',
        formatter: "{a} <br/>{b} : {c} ({d}%)"
    },

    visualMap: {
        show: false,
        // 这里是图表的数值范围
        min: 0,
        max: 0,
        inRange: {
            colorLightness: [0, 1]
        }
    },

    series : [
        {
            name:'访问来源',
            type:'pie',
            radius : '75%',
            center: ['50%', '50%'],
            data:[
                // 这里这里放各个主题对应的论文数量
                // {value:335, name:'直接访问'},
            ].sort(function (a, b) { return a.value - b.value; }),
            roseType: 'radius',
            label: {
                normal: {
                    textStyle: {
                        color: 'rgba(255, 255, 255, 0.7)'
                    }
                }
            },
            labelLine: {
                normal: {
                    lineStyle: {
                        color: 'rgba(255, 255, 255, 0.3)'
                    },
                    smooth: 0.2,
                    length: 10,
                    length2: 20
                }
            },
            itemStyle: {
                normal: {
                    color: '#c23531',
                    shadowBlur: 200,
                    shadowColor: 'rgba(0, 0, 0, 0.5)'
                }
            },

            animationType: 'scale',
            animationEasing: 'elasticOut',
            animationDelay: function (idx) {
                return Math.random() * 200;
            }
        }
    ]
};

function getDOFData() {
    $.ajax({
        "type": "post",
        "dataType": "json",
        "contentType" : "application/json",
        "url": path + "/getChartsData/getDOFData",
        "async": false,
        "success": function (data) {
            var min = data[0].value;
            var max = data[0].value;

            /**
             * 获取后台传递过来的数据，绘制扇形图
             * min 和 max 构成数值范围
             */
            for (var i = 0; i < data.length; i++) {
                if (data[i].value > max) {
                    max = data[i].value;
                }
                if (data[i].value < min) {
                    min = data[i].value;
                }
                option_dof.series[0].data.push(data[i]);
            }

            /**
             * 将数值范围传入图标对象
             * 这里 +5 和 - 5 是为了防止颜色出错
             * 当数值恰好为 max 时，颜色会变成纯白色
             * 恰好为 min 时，颜色变成黑色
             * @type {number}
             */
            option_dof.visualMap.max = max + 5;
            option_dof.visualMap.min = min - 5;
        },
        "error": function (data) {
            alert("DOF get data error")
        }
    })
}

//载入图表
$(function(){
    getDOFData();
    dofCharts = echarts.init(document.getElementById('dof-charts'));
    dofCharts.setOption(option_dof);
});