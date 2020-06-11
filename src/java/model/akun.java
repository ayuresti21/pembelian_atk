package model;

public class akun {
private String noakun,namaakun;

public akun(){   
}

public akun(String noakun, String namaakun){
    this.noakun = noakun;
    this.namaakun = namaakun;
} 

    public String getNoakun() {
        return noakun;
    }

    public void setNoakun(String noakun) {
        this.noakun = noakun;
    }

    public String getNamaakun() {
        return namaakun;
    }

    public void setNamaakun(String namaakun) {
        this.namaakun = namaakun;
    }
public String selectAll (){
    String sql = "select * from akun";
    return sql;
}
public String select (){
    String sql = "select * from akun where "
            + "nm_akun='"+namaakun+"'";
    return sql;
}
public String toUpdate (){
    return  "UPDATE akun SET " +
            "nm_akun='" + namaakun +
            "' WHERE no_akun='" + noakun + "'";
}
public String toDelete (){
    return "DELETE FROM akun "
            + " WHERE no_akun='" + noakun + "'";
}
public String toInsert (){
    return "INSERT INTO akun VALUES('"
            + noakun + "','"
            + namaakun + "')";
}   
}

