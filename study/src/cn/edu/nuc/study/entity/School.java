package cn.edu.nuc.study.entity;

public class School {
    private Integer sid;

    private String sname;

    private Integer ptnum;

    private Integer pnum;

    private Integer pdnum;

    private Integer cnum;

    private Integer bnum;
    
	public Integer getSid() {
		return sid;
	}

	public void setSid(Integer sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public Integer getPtnum() {
		return ptnum;
	}

	public void setPtnum(Integer ptnum) {
		this.ptnum = ptnum;
	}

	public Integer getPnum() {
		return pnum;
	}

	public void setPnum(Integer pnum) {
		this.pnum = pnum;
	}

	public Integer getPdnum() {
		return pdnum;
	}

	public void setPdnum(Integer pdnum) {
		this.pdnum = pdnum;
	}

	public Integer getCnum() {
		return cnum;
	}

	public void setCnum(Integer cnum) {
		this.cnum = cnum;
	}

	public Integer getBnum() {
		return bnum;
	}

	public void setBnum(Integer bnum) {
		this.bnum = bnum;
	}

	@Override
	public String toString() {
		return "School [sid=" + sid + ", sname=" + sname + ", ptnum=" + ptnum + ", pnum=" + pnum + ", pdnum=" + pdnum
				+ ", cnum=" + cnum + ", bnum=" + bnum + "]";
	}
    
    
}