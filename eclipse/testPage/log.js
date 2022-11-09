document.getElementById("submit").addEventListener("click", LOGIN);
function LOGIN(e) {
  e.preventDefault();
  var uname = document.getElementById("uname").value;
  var pass = document.getElementById("pass").value;
  var uregex = /^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$/;
  var pregex = /^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*\W)(?!.* ).{8,16}$/;

  if (!pass.match(pregex) && !uname.match(uregex)) {
    document.getElementById("nameerr").innerHTML =
      "Please enter the valid username(Email id)";
    document.getElementById("passerr").innerHTML =
      "please enter valid password";
  }
  if (!pass.match(pregex)) {
    document.getElementById("passerr").innerHTML =
      "please enter valid password";
  }
  if (!uname.match(uregex)) {
    document.getElementById("nameerr").innerHTML =
      "Please enter the valid username(Email id)";
  }
  if (uname.match(uregex)) {
    document.getElementById("nameerr").innerHTML = "";
  }
  if (pass.match(pregex)) {
    document.getElementById("passerr").innerHTML = "";
  }
  if (pass.match(pregex) && uname.match(uregex)) {
    if (uname == "immanuvel@gmail.com" && pass == "Immanuvel*27") {
      document.getElementById("nameerr").innerHTML = "";
      document.getElementById("passerr").innerHTML = "";
      alert("Login successfull");
    } else {
      document.getElementById("nameerr").innerHTML = "";
      document.getElementById("passerr").innerHTML = "";
      alert("Login unsuccessfull");
    }
  }
}
