package cn.edu.nuc.study.entity;

public class Teacher {
    private Integer tid;

    private Integer sid;

    private String tname;

    private String tsex;

    private String tposition;

    private String tstation;
    
	public Integer getTid() {
		return tid;
	}

	public void setTid(Integer tid) {
		this.tid = tid;
	}

	public Integer getSid() {
		return sid;
	}

	public void setSid(Integer sid) {
		this.sid = sid;
	}

	public String getTname() {
		return tname;
	}

	public void setTname(String tname) {
		this.tname = tname;
	}

	public String getTsex() {
		return tsex;
	}

	public void setTsex(String tsex) {
		this.tsex = tsex;
	}

	public String getTposition() {
		return tposition;
	}

	public void setTposition(String tposition) {
		this.tposition = tposition;
	}

	public String getTstation() {
		return tstation;
	}

	public void setTstation(String tstation) {
		this.tstation = tstation;
	}

	@Override
	public String toString() {
		return "Teacher [tid=" + tid + ", sid=" + sid + ", tname=" + tname + ", tsex=" + tsex + ", tposition="
				+ tposition + ", tstation=" + tstation + "]";
	}
    
    
}