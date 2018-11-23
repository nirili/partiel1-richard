$(function() {
			
	$("#GETALL").click(function() {
		$.getJSON("http://localhost:8080/partiel1-richard/api/bank/all/", function(data) {
					
			var items = [];
					
			$.each( data, function(key, val) {
				items.push( "<tr>"
							+ "<th>" + (key + 1) + "</th>" 
							+ "<td>" + val.countryCode  + "</td>"
							+ "<td>" + val.keyControl + "</td>" +
							+ "<td>" + val.rib + "</td>" +
							"</tr>");
				});
					
			$( "<tbody>", {
				html: items.join("")
			}).appendTo( "table" );
					
		});
	});
			
});