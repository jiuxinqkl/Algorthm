
function loadScript(url){
    var script = document.createElement("script");
    script.type="text/javascript";
    script.src = url;
    document.body.appendChild(script);
}

function loadStyles(url){
    var link = document.createElement("link");
    link.rel = "stylesheet";
    link.type = url;
    var head = document.getElementsByTagName("head")[0];
    head.appendChild(link);
}