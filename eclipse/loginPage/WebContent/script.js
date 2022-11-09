document.getElementById("submit").addEventListener("click", LOGIN);
function LOGIN(e) {
  e.preventDefault();
//  var v= prompt("Who are you?");  
//  alert("I am "+v);  
  var uname = document.getElementById("uname").value;
  var pass = document.getElementById("pass").value;
  var uregex = /^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$/;
  var pregex = /^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*\W)(?!.* ).{6,}$/;

  if (!pass.match(pregex) && !uname.match(uregex)) {
    document.getElementById("nameerr").innerHTML =
      "Please enter the valid username(Email id)";
    document.getElementById("passerr").innerHTML =
      "Please enter atleast one uppercase,one lowercase,<br/> one special character, one number";
    document.getElementById("uname").style.border="2px solid red";
    document.getElementById("pass").style.border="2px solid red";
  }
  if (!pass.match(pregex)) {
    document.getElementById("passerr").innerHTML =
      "Please enter atleast one uppercase,one lowercase,<br/> one special character, one number";
    document.getElementById("pass").style.border="2px solid red";
  }
  if (!uname.match(uregex)) {
    document.getElementById("nameerr").innerHTML =
      "Please enter the valid username(Email id)";
    document.getElementById("uname").style.border="2px solid red";
  }
  if (uname.match(uregex)) {
    document.getElementById("nameerr").innerHTML = "";
    document.getElementById("uname").style.border="2px solid green";
  }
  if (pass.match(pregex)) {
    document.getElementById("passerr").innerHTML = "";
    document.getElementById("pass").style.border="2px solid green";
  }
  if (pass.match(pregex) && uname.match(uregex)) {
    if (uname == "immanuvel@gmail.com" && pass == "Immanuvel*27") {
      document.getElementById("nameerr").innerHTML = "";
      document.getElementById("passerr").innerHTML = "";
      document.getElementById("uname").style.border="2px solid green";
      document.getElementById("pass").style.border="2px solid green";
      alert("Login successfull");
      window.location.href="dashboard.html";
    } else {
      document.getElementById("nameerr").innerHTML = "";
      document.getElementById("passerr").innerHTML = "";
      document.getElementById("uname").style.border="2px solid green";
      document.getElementById("pass").style.border="2px solid green";     
      alert("Login unsuccessfull");
      
    }
  }
}
