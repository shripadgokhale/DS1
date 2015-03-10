package com.testproject.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.testproject.model.FileInfo;
import com.testproject.service.DirectoryService;
 
/**
 * @author sgokhale
 *
 */
@RestController
public class DirectoryStructureController  {

@Autowired
DirectoryService list;	

private static final Logger logger = LoggerFactory.getLogger(DirectoryStructureController.class);
	
/**
 * Displays file information if input parameter is file. 
 * Displays directory and all its children (recursive) information if input paratmeter is directory.
 * Displays error if input parameter path is invalid.
 * 
 * @param path : File or directory path
 * @param com.testproject.model : 
 * @return FileInfo if input path is of file.
 * 		   DirInfo if input path is of directory.
 */
@RequestMapping(value = {"/fileinfo"}, method=RequestMethod.POST)
 public  ModelAndView showInfo(  String path, Model model) {
	FileInfo fileInfo = list.getStructureInfo(path);
	if(fileInfo == null){
		model.addAttribute("message", "Invalid path");
		logger.error("Invalid path entered : " + path);
		return new  ModelAndView("fail");
	}
	model.addAttribute("list", fileInfo);
	return new ModelAndView( "fileinfo");
 }


/**
 * Displays file information in json format if input parameter is file. 
 * Displays directory and all its children (recursive) information  in json format if input paratmeter is directory.
 * Displays error if input parameter path is invalid.
 * Type following url in browser to retrieve json information. http://hostname:portname/fileinfo?name={path}
 * @param name
 * @param com.testproject.model
 * @return FileInfo if input path is of file.
 * 		   DirInfo if input path is of directory.
 */
@RequestMapping(value = {"/fileinfo"}, method=RequestMethod.GET)
public @ResponseBody FileInfo showJsonInfo(@RequestParam(value="name", required=true) String path, Model model) {
	logger.debug("The path is :" + path);
	FileInfo fileInfo = list.getStructureInfo(path);
	return fileInfo;
}


/**
 * Error page displaying cause of failure.
 * @param com.testproject.model
 * @return
 */
@RequestMapping("/fail")
public ModelAndView fail(Model model){
	model.addAttribute("message", "Login Failed");
	//logger.error("Login failed" );
	return new ModelAndView("fail");
}


/**
 * File or directory entry.
 * @return
 */
@RequestMapping("/enterfile")
public ModelAndView enterFile(){
	return new ModelAndView("enterfile");
}
}