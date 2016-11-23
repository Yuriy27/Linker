function cut() {
    $.ajax({
        url: location.origin + "/api?url=" + $("#link").val(),
        type: "GET",
        success: function (resp) {
            var result = document.getElementById("result");
            result.innerHTML = location.origin + "/--/" + resp;
        }
    })
    
}