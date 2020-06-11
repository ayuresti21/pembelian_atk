package model;

public class jurnal {
private String nojurnal,tgljurnal,nobeli,keterangan,sub,noakun,debet,kredit,total,balance;

public jurnal() {
}

public jurnal(String nojurnal, String tgljurnal, String nobeli, 
        String keterangan, String sub, String noakun,
        String debet, String kredit, String total, String balance) {
    this.nojurnal = nojurnal;
    this.tgljurnal = tgljurnal;
    this.nobeli = nobeli;
    this.keterangan = keterangan;
    this.sub = sub;
    this.noakun = noakun;
    this.debet = debet;
    this.kredit = kredit;
    this.total = total;
    this.balance = balance;
}

    public String getNojurnal() {
        return nojurnal;
    }

    public void setNojurnal(String nojurnal) {
        this.nojurnal = nojurnal;
    }

    public String getTgljurnal() {
        return tgljurnal;
    }

    public void setTgljurnal(String tgljurnal) {
        this.tgljurnal = tgljurnal;
    }

    public String getNobeli() {
        return nobeli;
    }

    public void setNobeli(String nobeli) {
        this.nobeli = nobeli;
    }

    public String getKeterangan() {
        return keterangan;
    }

    public void setKeterangan(String keterangan) {
        this.keterangan = keterangan;
    }

    public String getSub() {
        return sub;
    }

    public void setSub(String sub) {
        this.sub = sub;
    }

    public String getNoakun() {
        return noakun;
    }

    public void setNoakun(String noakun) {
        this.noakun = noakun;
    }

    public String getDebet() {
        return debet;
    }

    public void setDebet(String debet) {
        this.debet = debet;
    }

    public String getKredit() {
        return kredit;
    }

    public void setKredit(String kredit) {
        this.kredit = kredit;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public String getBalance() {
        return balance;
    }

    public void setBalance(String balance) {
        this.balance = balance;
    }

public String selectAll (){
    String sql = "select * from jurnal";
    return sql;
}
public String select (){
    String sql = "select * from jurnal where "
            + "no_jurnal='"+nojurnal+"'";
    return sql;
}
public String toDelete (){
    return "DELETE FROM sementara_jurnal "
            + " WHERE noakun='" + noakun + "'";
}
public String toInsert (){
    return "INSERT INTO sementara_jurnal VALUES('"
            + nojurnal + "','"
            + noakun + "','"
            + debet + "','"
            + kredit + "','"
            + total + "','"
            + balance + "')";
}   
}