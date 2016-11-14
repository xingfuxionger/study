package cn.edu.nuc.study.entity;

public class Couser {
    private Integer cid;

    private Integer tid;

    private String cname;

    private String ctype;
    
    
	public Integer getCid() {
		return cid;
	}
	
	public void setCid(Integer cid) {
		this.cid = cid;
	}
	
	public Integer getTid() {
		return tid;
	}

	public void setTid(Integer tid) {
		this.tid = tid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public String getCtype() {
		return ctype;
	}

	public void setCtype(String ctype) {
		this.ctype = ctype;
	}
	
	@Override
	public String toString() {
		return "Couser [cid=" + cid + ", tid=" + tid + ", cname=" + cname + ", ctype=" + ctype + "]";
	}
    
}