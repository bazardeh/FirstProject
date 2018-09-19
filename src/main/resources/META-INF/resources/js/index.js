function callRest() {
    $.ajax({
        type: 'POST',
        contentType: 'application/json',
        url: "http://localhost:8080/finder",
        success: function(data){
            debugger;
            alert('Stock updated successfully. Status: '+data);
            },
        error: function(error){
            debugger;
            alert('update Stock error: ' + error);
        }
    });
}


function aaa(data) {

}
