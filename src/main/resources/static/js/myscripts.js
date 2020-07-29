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

// $(document).ready(function()
// {
//     $("#dob").nepaliDatePicker();
//
// });




// $('#seeAnotherField').change(function () {
//     if ($(this).val() == "YES") {
//         $('#otherFieldDiv').show();
//         $('#otherFieldDiv').attr('requires', '');
//         $('#otherFieldDiv').attr('data-error', 'This Field is required');
//     } else {
//         $('#otherFieldDiv').hide();
//         $('#otherFieldDiv').removeAttr('required');
//         $('#otherFieldDiv').removeAttr('data-error');
//     }
// });
// $("#seeAnotherField").trigger("change");
//
//
// $('#seeAnotherField1').change(function () {
//     // alert($(this).val());
//     if ($(this).val() == "YES") {
//         $('#otherFieldDiv1').show();
//         $('#otherFieldDiv1').attr('requires', '');
//         $('#otherFieldDiv1').attr('data-error', 'This Field is required');
//     } else {
//         $('#otherFieldDiv1').hide();
//         $('#otherFieldDiv1').removeAttr('required');
//         $('#otherFieldDiv1').removeAttr('data-error');
//     }
// });
// $("#seeAnotherField1").trigger("change");
//
//
//
// $('#seeAnotherField20').change(function () {
//     if ($(this).val() == "YES") {
//         $('#otherFieldDiv20').show();
//         $('#otherFieldDiv20').attr('requires', '');
//         $('#otherFieldDiv20').attr('data-error', 'This Field is required');
//     } else {
//         $('#otherFieldDiv20').hide();
//         $('#otherFieldDiv20').removeAttr('required');
//         $('#otherFieldDiv20').removeAttr('data-error');
//     }
// });
// $("#seeAnotherField20").trigger("change");
//
// $('#seeAnotherField21').change(function () {
//     if ($(this).val() == "YES") {
//         $('#otherFieldDiv21').show();
//         $('#otherFieldDiv21').attr('requires', '');
//         $('#otherFieldDiv21').attr('data-error', 'This Field is required');
//     } else {
//         $('#otherFieldDiv21').hide();
//         $('#otherFieldDiv21').removeAttr('required');
//         $('#otherFieldDiv21').removeAttr('data-error');
//     }
// });
// $("#seeAnotherField21").trigger("change");
//
// $('#seeAnotherField61').change(function () {
//     if ($(this).val() == "OTHER") {
//         $('#otherFieldDiv61').show();
//         $('#otherFieldDiv61').attr('requires', '');
//         $('#otherFieldDiv61').attr('data-error', 'This Field is required');
//     } else {
//         $('#otherFieldDiv61').hide();
//         $('#otherFieldDiv61').removeAttr('required');
//         $('#otherFieldDiv61').removeAttr('data-error');
//     }
// });
// $("#seeAnotherField61").trigger("change");
//
//
// $('#seeAnotherField62').change(function () {
//     if ($(this).val() == "OTHERS") {
//         $('#otherFieldDiv62').show();
//         $('#otherFieldDiv62').attr('requires', '');
//         $('#otherFieldDiv62').attr('data-error', 'This Field is required');
//     } else {
//         $('#otherFieldDiv62').hide();
//         $('#otherFieldDiv62').removeAttr('required');
//         $('#otherFieldDiv62').removeAttr('data-error');
//     }
// });
// $("#seeAnotherField62").trigger("change");
//
// $('#seeAnotherField63').change(function () {
//     if ($(this).val() == "OTHERS") {
//         $('#otherFieldDiv63').show();
//         $('#otherFieldDiv63').attr('requires', '');
//         $('#otherFieldDiv63').attr('data-error', 'This Field is required');
//     } else {
//         $('#otherFieldDiv63').hide();
//         $('#otherFieldDiv63').removeAttr('required');
//         $('#otherFieldDiv63').removeAttr('data-error');
//     }
// });
// $("#seeAnotherField63").trigger("change");
//
//
//     function addRow(tableID) {
//
//         var table = document.getElementById(tableID);
//
//         var rowCount = table.rows.length;
//         var row = table.insertRow(rowCount);
//
//         var colCount = table.rows[0].cells.length;
//
//         for(var i=0; i<colCount; i++) {
//
//             var newcell	= row.insertCell(i);
//
//             newcell.innerHTML = table.rows[0].cells[i].innerHTML;
//             //alert(newcell.childNodes);
//             switch(newcell.childNodes[0].type) {
//                 case "text":
//                     newcell.childNodes[0].value = "";
//                     break;
//                 case "checkbox":
//                     newcell.childNodes[0].checked = false;
//                     break;
//                 case "select-one":
//                     newcell.childNodes[0].selectedIndex =0;
//                     break;
//             }
//         }
//     }
//
// function deleteRow(tableID) {
//     try {
//         var table = document.getElementById(tableID);
//         var rowCount = table.rows.length;
//
//         for(var i=0; i<rowCount; i++) {
//             var row = table.rows[i];
//             var chkbox = row.cells[0].childNodes[0];
//             if(null != chkbox && true == chkbox.checked) {
//                 if(rowCount <= 1) {
//                     alert("Cannot delete all the rows.");
//                     break;
//                 }
//                 table.deleteRow(i);
//                 rowCount--;
//                 i--;
//             }
//
//
//         }
//     }
//     catch(e)
//     {
//         alert(e);
//     }
// }
//
//
//
//
//     function addRow1(tableID) {
//
//         var table = document.getElementById(tableID);
//
//         var rowCount = table.rows.length;
//         var row = table.insertRow(rowCount);
//
//         var colCount = table.rows[0].cells.length;
//
//         for(var i=0; i<colCount; i++) {
//
//             var newcell	= row.insertCell(i);
//
//             newcell.innerHTML = table.rows[0].cells[i].innerHTML;
//             //alert(newcell.childNodes);
//             switch(newcell.childNodes[0].type) {
//                 case "text":
//                     newcell.childNodes[0].value = "";
//                     break;
//                 case "checkbox":
//                     newcell.childNodes[0].checked = false;
//                     break;
//                 case "select-one":
//                     newcell.childNodes[0].selectedIndex =0;
//                     break;
//             }
//         }
//     }
//
// function deleteRow1(tableID) {
//     try {
//         var table = document.getElementById(tableID);
//         var rowCount = table.rows.length;
//
//         for(var i=0; i<rowCount; i++) {
//             var row = table.rows[i];
//             var chkbox = row.cells[0].childNodes[0];
//             if(null != chkbox && true == chkbox.checked) {
//                 if(rowCount <= 1) {
//                     alert("Cannot delete all the rows.");
//                     break;
//                 }
//                 table.deleteRow(i);
//                 rowCount--;
//                 i--;
//             }
//
//
//         }
//     }
//     catch(e)
//     {
//         alert(e);
//     }
// }
//
//
//
//
// const realFileBtn=document.getElementById("real-file");
// const customBtn=document.getElementById("custom-buttom");
// const customTxt=document.getElementById("custom-text");
//
// customBtn.addEventListener("click",function()
// {
//     realFileBtn.click();
// });
// realFileBtn.addEventListener("change",function()
// {
//     if(realFileBtn.value)
//     {
//         customTxt.innerHTML=realFileBtn.value.match(/[\/\\]([\w\d\s\.\-\(\)]+)$/
//         )[1];
//     }
//     else
//     {
//         customTxt.innerHTML="No file chosen,yet.";
//
//     }
// });
//
//
//
// <!--    $(document).ready(function() {-->
// <!--        $('#btn_Client_details').bind("click", function () {-->
//
// <!--            var imgVal = $('#real-file').val();-->
// <!--            if (imgVal == '') {-->
// <!--                 alert("**Please input the image");-->
// <!--                document.getElementById('imageerror').innerHTML = "**Please input the image";-->
// <!--                return false;-->
// <!--            }-->
//
//
// <!--        });-->
// <!--    });-->
//
// const realFileBtn1=document.getElementById("real-file1");
// const customBtn1=document.getElementById("custom-buttom1");
// const customTxt1=document.getElementById("custom-text1");
// customBtn1.addEventListener("click",function()
// {
//     realFileBtn1.click();
// });
// realFileBtn1.addEventListener("change",function()
// {
//     if(realFileBtn1.value)
//     {
//         customTxt1.innerHTML=realFileBtn1.value.match(/[\/\\]([\w\d\s\.\-\(\)]+)$/
//         )[1];
//     }
//     else
//     {
//         customTxt1.innerHTML="No file chosen,yet.";
//
//     }
// });
//
//
// const realFileBtn2=document.getElementById("real-file2");
// const customBtn2=document.getElementById("custom-buttom2");
// const customTxt2=document.getElementById("custom-text2");
// customBtn2.addEventListener("click",function()
// {
//     realFileBtn2.click();
// });
// realFileBtn2.addEventListener("change",function()
// {
//     if(realFileBtn2.value)
//     {
//         customTxt2.innerHTML=realFileBtn2.value.match(/[\/\\]([\w\d\s\.\-\(\)]+)$/
//         )[1];
//     }
//     else
//     {
//         customTxt2.innerHTML="No file chosen,yet.";
//
//     }
// });
//
//
//
//
//
//
//
//
//