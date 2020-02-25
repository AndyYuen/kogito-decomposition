package org.acme.kogito.model;

public class NetElement {

	private String name;
    private String param1;
    private String param2;
    private boolean active;

    


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
    }

    
    public String getParam1() {
        return param1;
    }

    public void setParam1(String param1) {
        this.param1 = param1;
    }

    public String getParam2() {
        return param2;
    }

    public void setParam2(String param2) {
        this.param2 = param2;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }



    public NetElement(String name) {
        this.name = name;
    }

	@Override
	public String toString() {
		return "NetElement [name=" + name + ", active=" + active + ", param1=" + param1 + ", param2=" + param2 + "]";
	}

}