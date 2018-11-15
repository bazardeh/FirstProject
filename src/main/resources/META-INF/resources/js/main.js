$(document).ready(function () {
    callRestDataTable();
});

function callRestDataTable() {
    $.ajax({
        type: 'POST',
        contentType: 'application/json',
        url: "/finderDataTable",
        success: function (data) {
            debugger;
            fillDataTable(data);
        },
        error: function (error) {
            alert('[function error]: ' + error);
            console.log("[function error]");
        }
    });
}

function fillDataTable(data) {
    debugger;
    $('#example').DataTable({
        "columnDefs": [ {
            "targets": 0,
            "searchable": false
        } ],
        data: data,
        "columns": [
            {"data": "id"},
            {"data": "adress"},
            {"data": "lastname"},
            {"data": "name"}
        ]
    });
}


$.extend( true, $.fn.dataTable.defaults, {
    "searching": false,
    "ordering": true
} );


// Set the RowReorder defaults
$.extend(
    $.fn.dataTable.RowReorder.defaults,
    { selector: 'tr' }
);

// Enable RowReorder by default
$.fn.dataTable.defaults.rowReorder = true;