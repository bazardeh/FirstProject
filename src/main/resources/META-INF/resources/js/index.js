function callRest() {
    debugger;
    $.ajax({
        type: 'POST',
        contentType: 'application/json',
        url: "/finder",
        success: function (data) {
            debugger;
            successFunction(data);
            filterFunction(data);
            fillDivAllData(data);
        },
        error: function (error) {
            // debugger;
            alert('[function error]: ' + error);
            console.log("[function error]");
        }
    });
}

function fillDivAllData(data) {
    debugger;
    $('#divAllData').css('display', '');
    $('#divAllData').html(data.toString());
}

function successFunction(data) {
    console.log('[function rest successfully : ' + data + ']');
}

function filterFunction(data) {

    var dataItem = [];
    // تبدیل جیسان به متغییر جاوا اسکریپتی
    var myObj = JSON.parse(data);
// تبدیل متغییر جاوا اسکریپت به جیسان
    // var myJSON = JSON.stringify(myObj);
    debugger;
    myObj.filter(function (item) {
        if (item.lastname === "Alizadeh")
            dataItem.push(item)
    });

    console.log('[finish SuccessFunction]');
}

function isLastname(value) {
    return value == 'Alizadeh';
}

function isBigEnough(value) {
    return value >= 10;
}

$(function () {
    console.log("[start app]");
});


// localStorage Sample
// //Storing data:
// myObj = {name: "John", age: 31, city: "New York"};
// myJSON = JSON.stringify(myObj);
// localStorage.setItem("testJSON", myJSON);
//
// //Retrieving data:
// text = localStorage.getItem("testJSON");
// obj = JSON.parse(text);
// document.getElementById("demo").innerHTML = obj.name;