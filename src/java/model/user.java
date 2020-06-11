package model;

public class user {
private String iduser,nmuser,hakakses,pass;    

public user(){   
}

public user(String iduser, String nmuser, String hakakses, String pass){
    this.iduser = iduser;
    this.nmuser = nmuser;
    this.hakakses = hakakses;
    this.pass = pass;
} 

    public String getIduser() {
        return iduser;
    }

    public void setIduser(String iduser) {
        this.iduser = iduser;
    }

    public String getNmuser() {
        return nmuser;
    }

    public void setNmuser(String nmuser) {
        this.nmuser = nmuser;
    }

    public String getHakakses() {
        return hakakses;
    }

    public void setHakakses(String hakakses) {
        this.hakakses = hakakses;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
public String selectAll (){
    String sql = "select * from user";
    return sql;
}
public String select (){
    String sql = "select * from user where "
            + "nm_user='"+nmuser+"'";
    return sql;
}
public String toUpdate (){
    return  "UPDATE user SET " +
            "nm_user='" + nmuser +
            "', hak_akses='" + hakakses +
            "', pass='" + pass +
            "' WHERE id_user='" + iduser + "'";
}
public String toDelete (){
    return "DELETE FROM user "
            + " WHERE id_user='" + iduser + "'";
}
public String toInsert (){
    return "INSERT INTO user VALUES('"
            + iduser + "','"
            + nmuser + "','"
            + hakakses + "','"
            + pass + "')";
}   
}
