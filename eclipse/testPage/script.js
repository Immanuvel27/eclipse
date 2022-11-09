document.getElementById("submit").addEventListener("click", LOGIN);
function LOGIN(e) {
  e.preventDefault();
  alert();
  var uname = document.getElementById("uname").value;
  var pass = document.getElementById("pass").value;
  var uregex = /[0-9a-zA-Z]{6,}/;
  var pregex = /[0-9a-zA-Z]{6,}/;
  // var passregex = /^(?=.?[A-Z])(?=.?[a-z])(?=.?[0-9])(?=.?[#?!@$%^&*-]).{6,}$/;

  if (pass.match(pregex) && uname.match(uregex)) {
    document.getElementById("nameerr").style.display = "none";
    document.getElementById("passerr").style.display = "none";
    window.location.href = "dashboard.html";
  } else if (!(pass.match(pregex)) && !(uname.match(uregex))) {
    document.getElementById("nameerr").innerHTML =
      "please enter valid username";
    document.getElementById("passerr").innerHTML =
      "please enter valid password";
  } else if (!uname.match(uregex)) {
    document.getElementById("nameerr").innerHTML =
      "please enter valid username";
  } else if (!pass.match(pregex)) {
    document.getElementById("passerr").innerHTML =
      "please enter valid password";
  } else if (uname.match(uregex)) {
    document.getElementById("nameerr").innerHTML = "";
  } else if (pass.match(pregex)) {
    document.getElementById("passerr").innerHTML = "";
  }
}
