function hanyaAngka(evt) {
    var charCode = (evt.which) ? evt.witch : event.keyCode
    if (charCode > 31 && (charCode< 48 || charCode > 57))
        return false;
    return true;
    }
    function validasi_inputBarang(form) {
        if (form.kode.value == "") {
        alert("Kode Barang masih kosong!");
        form.kode.focus();
        return (false);
        } else if (form.nama.value == "") {
        alert("Nama Barang masih kosong!");
        form.nama.focus();
        return (false); 
        } else if (form.harga.value == "") {
        alert("Harga Barang masih kosong!");
        form.harga.focus();
        return (false);
        } else if (form.stok.value == "") {
        alert("Stok Barang masih kosong!");
        form.stok.focus();
        return (false);
       }
    return (true);
    }
    function validasi_inputSupplier(form) {
        if (form.kd_supp.value == "") {
        alert("Kode Supplier masih kosong!");
        form.kd_supp.focus();
        return (false);
        } else if (form.nm_supp.value == "") {
        alert("Nama Supplier masih kosong!");
        form.nm_supp.focus();
        return (false); 
        } else if (form.alamat.value == "") {
        alert("Alamat Supplier masih kosong!");
        form.alamat.focus();
        return (false);
        } else if (form.telp.value == "") {
        alert("Telp Supplier masih kosong!");
        form.telp.focus();
        return (false);
       }
    return (true);
    }
    
    function validasi_inputUser(form) {
        if (form.id.value == "") {
        alert("Id User masih kosong!");
        form.id.focus();
        return (false);
        } else if (form.nama.value == "") {
        alert("Nama User masih kosong!");
        form.nama.focus();
        return (false); 
        } else if (form.hak.value == "") {
        alert("Hak User masih kosong!");
        form.hak.focus();
        return (false);
        } else if (form.pass.value == "") {
        alert("Password User masih kosong!");
        form.pass.focus();
        return (false);
       }
    return (true);
    }
    
    function validasi_inputAkun(form) {
        if (form.no.value == "") {
        alert("No Akun masih kosong!");
        form.kode.focus();
        return (false);
        } else if (form.nama.value == "") {
        alert("Nama Akun masih kosong!");
        form.nama.focus();
        return (false); 
       }
    return (true);
    } 
     
function pesan() {
    document.getElementById("nopesan").value = document.getElementById("nopes").value;
}

function showEmp(emp_value)
{
    if(document.getElementById("emp_id").value != "-1")
    {
        xmlHttp = GetXmlHttpObject()
        if (xmlHttp == null)
        {
            alert("Browser does not support HTTP Request")
            return
        }
        var url = "getbarang.jsp"
        url = url + "?emp_id=" + emp_value
        
        xmlHttp.onreadystatechange = stateChanged
        xmlHttp.open("GET", url, true)
        xmlHttp.send(null)
    } else
    {
        alert("Pilih Kode Barang");
    }
}
    function stateChanged()
    {
        document.getElementById("ename").value = "";
        document.getElementById("emp_id").value = "";
        if(xmlHttp.readyState == 4 || xmlHttp.readyState == "complete")
        {
            var showdata = xmlHttp.responseText;
            var strar = showdata.split(":");
            if (strar.length == 1)
            {
                document.getElementById("emp_id").focus();
                alert("Pilih Kode Barang");
                document.getElementById("ename").value = " ";
                document.getElementById("emp_id").value = " ";
            } else if (strar.length > 1)
            {
                document.getElementById("ename").value = strar[1];
            }
        }
    }
    function GetXmlHttpObject()
    {
        var xmlHttp = null;
        try
        {
            xmlHttp = new XMLHttpRequest();
        } catch (e)
        {
            try
            {
                xmlHttp = new ActiveXObject("Msxml2.XMLHTTP");
            } catch (e)
            {
               xmlHttp = new ActiveXObject("Microsoft.XMLHTTP"); 
            }
        }
        return xmlHttp;
    }
    function sumPesan() {
        var txtFirstNumberValue = document.getElementById('ename').value;
        var txtSecondNumberValue = document.getElementById('jml').value;
        var result = parseFloat(txtFirstNumberValue) * parseFloat(txtSecondNumberValue);
        if (!isNaN(result)) {
            document.getElementById('subtotal').value = result;
        }
}


function validasi_inputRetur(form)
{
document.getElementById("noretur").value = document.getElementById("noret").value;   
}
function showEmp(emp_value)
{
    if (document.getElementById("emp_id").value != "-1")
    {
        xmlHttp = GetXmlHttpObject()
        if (xmlHttp == null)
        {
            alert("Browser does not support HTTP Request")
            return
        }
        var url = "getbarang.jsp"
        url = url + "?emp_id=" + emp_value
        
        xmlHttp.onreadystatechange = stateChanged
        xmlHttp.open("GET", url, true)
        xmlHttp.send(null)
    } else
    {
        alert("Pilih Kode Barang");
    }
}
function stateChanged()
{
    document.getElementById("ename").value = "";
    document.getElementById("emp_id").value = "";
    if (xmlHttp.readyState == 4 || xmlHttp.readyState == "complete")
    {
        
        var showdata = xmlHttp.responseText;
        var strar = showdata.split(":");
        if (strar.length == 1)
        {
            document.getElementById("emp_id").focus();
            alert("Pilih Kode Barang");
            document.getElementById("ename").value = " ";
            document.getElementById("emp_id").value = " ";
        } else if (strar.length > 1)
        {
            document.getElementById("ename").value = strar[1];
        }
    }
}
function GetXmlHttpObject()
{
    var xmlHttp = null;
    try
    {
        xmlHttp = new XMLHttpRequest();
    } catch (e)
    {
        try
        {
            xmlHttp = new ActiveXObject("Msxml2.XMLHTTP");
        } catch (e)
        {
            xmlHttp = new ActiveXObject("Microsoft.XMLHTTP");
        }
    }
    return xmlHttp;
}
function sumvalidasi_inputRetur(form) {
    var txtFirstNumberValue = document.getElementById('ename').value;
    var txtSecondNumberValue = document.getElementById('jml').value;
    var result = parseFloat(txtFirstNumberValue) * parseFloat(txtSecondNumberValue);
    if (!isNaN(result)) {
        document.getElementById('subtotal').value = result;
    }
}


function Hitung(){
kre1 = document.getElementById("kredit1").value;
kre2 = document.getElementById("kredit2").value;
kre3 = document.getElementById("kredit3").value;
kre4 = document.getElementById("kredit4").value;

TotalKre = parseInt(kre1) + parseInt(kre2) + parseInt(kre3) + parseInt(kre4);
document.getElementById("ttlKredit").value = parseInt(TotalKre);

deb1 = document.getElementById("debet1").value;
deb2 = document.getElementById("debet2").value;
deb3 = document.getElementById("debet3").value;
deb4 = document.getElementById("debet4").value;

TotalDeb = parseInt(deb1) + parseInt(deb2) + parseInt(deb3) + parseInt(deb4);
document.getElementById("ttlDebet").value = parseInt(TotalDeb);

Total = parseInt(TotalDeb) - parseInt(TotalKre);
document.getElementById("Balance").value = parseInt(Total);
}

