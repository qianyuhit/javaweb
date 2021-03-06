/*
 * Generated by MyEclipse Struts
 * Template path: templates/java/JavaClass.vtl
 */
package org.qianyu.struts.action;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.upload.FormFile;
import org.qianyu.struts.form.UploadForm;

/** 
 * MyEclipse Struts
 * Creation date: 03-01-2011
 * 
 * XDoclet definition:
 * @struts.action path="/upload" name="uploadForm" input="/form/upload.jsp" scope="request" validate="true"
 */
public class UploadAction extends Action {
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
		UploadForm uploadForm = (UploadForm) form;// TODO Auto-generated method stub
		System.out.println("**"+uploadForm.getPic().getFileName());
		String uploadpath=this.getServlet().getServletContext().getRealPath("/")+"upload\\"+uploadForm.getName()+"."+(uploadForm.getPic().getFileName().split("\\.")[1]) ;
		System.out.println("**"+uploadpath);
		try {
			OutputStream out=new FileOutputStream(new File(uploadpath));
			FormFile ff=uploadForm.getPic();
			byte[]b=ff.getFileData();
			out.write(b);
			out.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
}