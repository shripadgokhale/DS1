package com.testproject.model;

import java.io.File;

import com.fasterxml.jackson.annotation.JsonIgnore;



public class FileInfo {

	File file;
	double size;
	String fileType;
	String filesStr="";
	
	/**
	 * returns Directory structure recursive html string.
	 * @return
	 */
	@JsonIgnore
	public String getFilesStr() {
		return filesStr;
	}

	/**
	 * Constructor
	 * @param file
	 */
	public FileInfo(File file) {
		super();
		this.file = file;
		size = file.length() ;
		
		if ( file.isFile())
			fileType = "File";
		if ( file.isDirectory())
			fileType = "Directory";
		
	
	}
	
	/**
	 * Initializes file string with information of the file in html format.
	 */
	public void initializeFilesStr(){
		filesStr = "<tr><td> " + file.getAbsolutePath() + "</td>  <td>  "
				+ fileType + "</td>  <td> " + size + "  </tr>";
		
	}
	
	

	/**
	 * @return
	 */
	public File getFile() {
		return file;
	}


	/**
	 * @return
	 */
	public double getSize() {
		return size;
	}

	/**
	 * @return
	 */
	public String getFileType() {
		return fileType;
	}
	
}
