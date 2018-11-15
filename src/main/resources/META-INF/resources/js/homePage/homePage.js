$(document).ready(function () {
    callRestDataTableHomePage();
});

function callRestDataTableHomePage() {
    debugger;
    $.ajax({
        type: 'POST',
        contentType: 'application/json',
        url: "/finderDataTable",
        success: function (data) {
            debugger;
            fillDataTableHomePage(data);
        },
        error: function (error) {
            alert('[function error]: ' + error);
            console.log("[function error]");
        }
    });
}


function fillDataTableHomePage(dataAll) {
    debugger;
    jQuery.each(dataAll, function (i, dataRow) {
        debugger;
        $("#tableData").append("<tr><td>" + dataRow.id.toString() + "</td><td>" + dataRow.codUser.toString()
            + "</td><td>" + dataRow.fromDate.toString() + "</td><td>" + dataRow.toDate.toString() + "</td><td>" + dataRow.statusLogin + "</td></tr>");
        $("#tableDataMin").append("<tr><td>" + dataRow.id.toString() + "</td><td>" + dataRow.codUser.toString()
            + "</td><td>" + dataRow.fromDate.toString() + "</td><td>" + dataRow.toDate.toString() + "</td><td>" + dataRow.statusLogin + "</td></tr>");
    });

    // debugger;
    // $('#tableData').DataTable({
    //     data: data,
    //     "columns": [
    //         {"data": "id"},
    //         {"data": "adress"},
    //         {"data": "lastname"},
    //         {"data": "name"}
    //     ]
    // });
}


// $.extend( true, $.fn.dataTable.defaults, {
//     "searching": false,
//     "ordering": true
// } );


// Set the RowReorder defaults
// $.extend(
//     $.fn.dataTable.RowReorder.defaults,
//     { selector: 'tr' }
// );
//
// // Enable RowReorder by default
// $.fn.dataTable.defaults.rowReorder = true;