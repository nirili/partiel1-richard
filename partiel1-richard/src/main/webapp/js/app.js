$(function() {
			
	$("#GETJSON").click(function() {
		$.getJSON("http://localhost:8080/partiel1-richard/api/transfer/all", function(data) {
					
			var items = [];
					
			$.each( data, function(key, val) {
				items.push( "<tr>"
							+ "<th>" + (key + 1) + "</th>" 
							+ "<td>" + val.date  + "</td>"
							+ "<td>" + val.avgAnswers + "</td>" +
							"</tr>");
				});
					
			$( "<tbody>", {
				html: items.join("")
			}).appendTo( "table" );
					
		});
	});
			
});