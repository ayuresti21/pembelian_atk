package model;

public class retur {
private String noretur,tglretur,kdsupplier,kdbarang,qty,subtotal;

public retur() {
}

public retur(String noretur, String tglretur, String kdsupplier, 
        String kdbarang, String qty, String subtotal) {
    this.noretur = noretur;
    this.tglretur = tglretur;
    this.kdsupplier = kdsupplier;
    this.kdbarang = kdbarang;
    this.qty = qty;
    this.subtotal = subtotal;
}

    public String getNoretur() {
        return noretur;
    }

    public void setNoretur(String noretur) {
        this.noretur = noretur;
    }

    public String getTglretur() {
        return tglretur;
    }

    public void setTglretur(String tglretur) {
        this.tglretur = tglretur;
    }

    public String getKdsupplier() {
        return kdsupplier;
    }

    public void setKdsupplier(String kdsupplier) {
        this.kdsupplier = kdsupplier;
    }

    public String getKdbarang() {
        return kdbarang;
    }

    public void setKdbarang(String kdbarang) {
        this.kdbarang = kdbarang;
    }

    public String getQty() {
        return qty;
    }

    public void setQty(String qty) {
        this.qty = qty;
    }

    public String getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(String subtotal) {
        this.subtotal = subtotal;
    }

   
public String selectAll (){
    String sql = "select * from retur";
    return sql;
}
public String select (){
    String sql = "select * from retur where "
            + "no_retur='"+noretur+"'";
    return sql;
}
public String toDelete (){
    return "DELETE FROM sementara_retur "
            + " WHERE no_retur='" + noretur + "'";
}
public String toInsert (){
    return "INSERT INTO sementara_retur VALUES('"
            + noretur + "','"
            + kdbarang + "','"
            + qty + "','"
            + subtotal + "')";
}   
}
