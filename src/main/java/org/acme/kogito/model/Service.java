package org.acme.kogito.model;

import org.acme.kogito.model.NetElement;

public class Service {

	private String name;
    private NetElement hlr;
    private NetElement lte_hss;
    private NetElement smsc;



	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
    }

    public NetElement getHlr() {
        return hlr;
    }

    public void setHlr(NetElement hlr) {
        this.hlr = hlr;
    }

    public NetElement getLte_hss() {
        return lte_hss;
    }

    public void setLte_hss(NetElement lte_hss) {
        this.lte_hss = lte_hss;
    }

    public NetElement getSmsc() {
        return smsc;
    }

    public void setSmsc(NetElement smsc) {
        this.smsc = smsc;
    }


    public Service() {
        hlr = new NetElement("HLR");
        lte_hss = new NetElement("LTE HSS");
        smsc = new NetElement("SMSC");
    }

    @Override
    public String toString() {
        return "Service [name=" + name + ", lte_hss=" + lte_hss + ", hlr=" + hlr + ", smsc=" + smsc + "]";
    }

}