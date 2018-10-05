$(function(){
    debugger;
    $("#chart").dxChart({
        dataSource: dataSource, 
        series: {
            argumentField: "name",
            valueField: "count",
            name: "Student",
            type: "bar",
            color: '#ffaa66'
        },
        legend: {
            horizontalAlignment: "right",
            position: "inside",
            border: { visible: true }
        }
    });
});

var dataSource = [{
    name: "Monname",
    count: 3
}, {
    name: "Tuesname",
    count: 2
}, {
    name: "Wednesname",
    count: 3
}, {
    name: "Thursname",
    count: 4
}, {
    name: "Friname",
    count: 6
}, {
    name: "Saturname",
    count: 11
}, {
    name: "Sunname",
    count: 4
}];