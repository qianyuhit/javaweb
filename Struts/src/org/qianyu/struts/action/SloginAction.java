/*
 * Generated by MyEclipse Struts
 * Template path: templates/java/JavaClass.vtl
 */
package org.qianyu.struts.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;
import org.qianyu.struts.form.SloginForm;

/** 
 * MyEclipse Struts
 * Creation date: 04-03-2011
 * 
 * XDoclet definition:
 * @struts.action path="/slogin" name="sloginForm" input="/form/slogin.jsp" parameter="status" scope="request" validate="true"
 */
public class SloginAction extends DispatchAction {
	/*
	 * Generated Methods
	 */

	/** 
	 * Method execute
	 * @param mapping
	 * @param form
	 * @param request
	 * @param response
	 * @return ActionForward
	 */
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response) {
		SloginForm sloginForm = (SloginForm) form;// TODO Auto-generated method stub
		return null;
	}
}