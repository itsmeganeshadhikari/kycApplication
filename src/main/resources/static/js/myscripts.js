function permanent() {
    if(present.checked == true)
     {
        var country11=document.getElementById("country").value;
        var province11=document.getElementById("province").value;
        var district11=document.getElementById("district_p").value;
        var municipality11=document.getElementById("municipality").value;
         var municipality121=document.getElementById("municipality10").value;
        var ward11=document.getElementById("ward").value;
        var tole11=document.getElementById("tole").value;

        var copycountry=country11;
        var copyprovince=province11;
        var copydistrict=district11;
        var copymunicipality=municipality11;
        var copyward=ward11;
        var copytole=tole11;
         var copymunicipality1=municipality121;

        
        document.getElementById("country1").value = copycountry;
        document.getElementById("province1").value = copyprovince;
        document.getElementById("district_m").value = copydistrict;
        document.getElementById("municipality1").value = copymunicipality;
         document.getElementById("municipality20").value = copymunicipality1;
        document.getElementById("ward1").value = copyward;
        document.getElementById("tole1").value = copytole;
    }
else 
 {
     document.getElementById("country1").value='';
     document.getElementById("province1").value='';
     document.getElementById("district_m").value='';
     document.getElementById("municipality1").value='';
     document.getElementById("municipality20").value='';
     document.getElementById("ward1").value='';
     document.getElementById("tole1").value='';
 }
}

function validate0() {
    if (!/^[A-Z]*$/) 
    {
        alert("Invalid characters");
        document.getElementById("firstname").focus();
        return false;
    }
    }
    function validate1() {
      if (!/^[A-Z]*$/) 
    {
        alert("Invalid characters");
        document.getElementById("middlename").focus();
        return false;
    }
    }
    function validate2() {
      if (!/^[A-Z]*$/) 
    {
        alert("Invalid characters");
        document.getElementById("lastname").focus();
        return false;
    }
    }

function kyc(evt, userDetails) {
    var i, tabcontent, tablinks;
    tabcontent = document.getElementsByClassName("tabcontent");
    for (i = 0; i < tabcontent.length; i++) {
        tabcontent[i].style.display = "none";
    }
    tablinks = document.getElementsByClassName("tablinks");
    for (i = 0; i < tablinks.length; i++) {
        tablinks[i].className = tablinks[i].className.replace(" active", "");
    }
    document.getElementById(userDetails).style.display = "block";
    evt.currentTarget.className += " active";
}


function permanent1() {
    if(present.checked == true)
    {

        var district11=document.getElementById("district_p").value;
        var municipality11=document.getElementById("municipality10").value;
        var municipality121=document.getElementById("municipality").value;
        var ward11=document.getElementById("ward").value;
        var tole11=document.getElementById("tole").value;
        var house11=document.getElementById("house").value;



        var copydistrict=district11;
        var copymunicipality=municipality11;
        var copyward=ward11;
        var copytole=tole11;
        var copymunicipality1=municipality121;
        var copyhouse=house11;



        document.getElementById("district_m").value = copydistrict;
        document.getElementById("municipality1").value = copymunicipality;
        document.getElementById("municipality20").value = copymunicipality1;
        document.getElementById("ward1").value = copyward;
        document.getElementById("tole1").value = copytole;
        document.getElementById("house1").value = copyhouse;
    }

    else
    {

        document.getElementById("district_m").value='';
        document.getElementById("municipality1").value='';
        document.getElementById("municipality20").value='';
        document.getElementById("ward1").value='';
        document.getElementById("tole1").value='';
        document.getElementById("house1").value ='';
    }
}

function birth() {
    if(permanent12.checked == true)
    {

        var district111=document.getElementById("district_m").value;
        var municipality111=document.getElementById("municipality1").value;
        var municipality112=document.getElementById("municipality20").value;
        var ward111=document.getElementById("ward1").value;
        var tole111=document.getElementById("tole1").value;



        var copydistrict222=district111;
        var copymunicipality222=municipality111;
        var copyward222=ward111;
        var copytole222=tole111;
        var copymunicipality223=municipality112;




        document.getElementById("district_q").value = copydistrict222;
        document.getElementById("municipality101").value = copymunicipality222;
        document.getElementById("municipality23").value = copymunicipality223;
        document.getElementById("ward10").value = copyward222;
        document.getElementById("tole10").value = copytole222;

    }

    else
    {

        document.getElementById("district_q").value='';
        document.getElementById("municipality101").value='';
        document.getElementById("municipality23").value='';
        document.getElementById("ward10").value='';
        document.getElementById("tole10").value='';

    }
}

