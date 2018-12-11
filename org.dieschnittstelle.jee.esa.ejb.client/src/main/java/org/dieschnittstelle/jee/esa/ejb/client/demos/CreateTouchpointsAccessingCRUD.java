package org.dieschnittstelle.jee.esa.ejb.client.demos;

import org.dieschnittstelle.jee.esa.ejb.client.Constants;
import org.dieschnittstelle.jee.esa.ejb.client.ejbclients.EJBProxyFactory;
import org.dieschnittstelle.jee.esa.ejb.ejbmodule.crm.crud.TouchpointCRUDRemote;

/* demonstrate direct access to the CRUD layer */
public class CreateTouchpointsAccessingCRUD {

	public static void main(String[] args) {
		EJBProxyFactory.initialise();

		try {
			TouchpointCRUDRemote tpCRUD = EJBProxyFactory.getInstance().getProxy(TouchpointCRUDRemote.class,"ejb:org.dieschnittstelle.jee.esa.ejb/org.dieschnittstelle.jee.esa.ejb.ejbmodule.crm/TouchpointCRUDStateless!org.dieschnittstelle.jee.esa.ejb.ejbmodule.crm.crud.TouchpointCRUDRemote");
			tpCRUD.createTouchpoint(Constants.TOUCHPOINT_1);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
