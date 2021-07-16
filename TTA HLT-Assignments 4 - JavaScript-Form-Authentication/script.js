
function submit() 
{
    var name = document.getElementById("n1").value;
    var email = document.getElementById("em1").value;
    var number = document.getElementById("nm1").value;

   
    if (name == "" || name == null)
     {
    document.getElementById("msg").innerText ="Please enter your name";
    }
     else {
        document.getElementById("msg").innerText ="";
    }

    if (email == "" || email== null)
    {
   document.getElementById("msg2").innerText ="Please enter your email";
   }
    else {
       document.getElementById("msg2").innerText ="";
   }

   if (number == "" || number == null)
   {
  document.getElementById("msg3").innerText ="Please enter your name";
  }
   else {
      document.getElementById("msg3").innerText ="";
  }

}



