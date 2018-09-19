function callRest() {
    $.ajax({
        type: 'POST',
        contentType: 'application/json',
        url: "http://localhost:8080/finder",
        success: function (data) {
            // debugger;
            console.log('[function rest successfully : ' + data + ']');
        },
        error: function (error) {
            // debugger;
            alert('[function error]: ' + error);
            console.log("[function error]");
        }
    });
}


function aaa(data) {

}

$(function () {
    console.log("[start app]");
});