(function () {
    console.log("xd")

    var xhttp = new XMLHttpRequest();
    xhttp.addEventListener('load', function() {
        console.log(this.responseText)
        var resp = JSON.parse(this.responseText)
        var elem = document.getElementById('marek')
        elem.innerHTML = resp.test
    });
    xhttp.open("GET", "api", true);
    xhttp.setRequestHeader("Content-type", "application/json");
    xhttp.send();
})();