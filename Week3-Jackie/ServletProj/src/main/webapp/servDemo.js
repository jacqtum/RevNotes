function testStuff(){
	console.log("inside testStuff");
	var xhr = new XMLHttpRequest();
	xhr.onreadstyatechange = function(){};
	xhr.open("GET","test",true); // (method, url, true for asynchronous) // to wait
	xhr.send();
	
}


function testStuff2(){
	console.log("inside testStuff2");
	var xhr = new XMLHttpRequest();
	xhr.onreadstyatechange = function(){};
	xhr.open("POST","test",true); // (method, url, true for asynchronous) // to wait
	xhr.send();
	
}



window.onload = function(){
	
	console.log("in onload");
	document.getElementById("myBtn").addEventListener("click", testStuff, false); //(event-type, method, useCapture)
	document.getElementById("myBtn2").addEventListener("click", testStuff2, false);
};
