function loadRooms(){
		//console.log("been here");
		let xhr=new XMLHttpRequest();	
		xhr.onreadystatechange=function(){
			if (this. readyState==4){
				if(this.status==200){
					document.getElementById("rooms").innerHTML=xhr.responseText;
				}else{
					console.log("error");
				}
			}
		};
		
	xhr.open('GET', '/hotel_reservation/RoomsController');
	xhr.send();
}

function logoutSession(){
	//console.log("been here");
	let xhr=new XMLHttpRequest();
	xhr.onreadystatechange=function(){
		if (this. readyState==4){
			if(this.status==200){
				window.location.replace("index.html");
			}else{
				console.log("error");
			}
		}
	};		
	xhr.open('GET', '/hotel_reservation/LogoutSession');
	xhr.send();
}

function getAllUsers(){
	//console.log("been here");
	let xhr=new XMLHttpRequest();
	xhr.onreadystatechange=function(){
		if (this. readyState==4){
			if(this.status==200){
				document.getElementById("guests").innerHTML=xhr.responseText;
			}else{
				console.log("error");
			}
		}
	};		
	xhr.open('GET', '/hotel_reservation/GetAllUsers');
	xhr.send();
}