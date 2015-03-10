package com.testproject.service;

import java.io.File;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.testproject.model.DirInfo;
import com.testproject.model.FileInfo;



@Component
public class DirectoryService {

	private static final Logger logger = LoggerFactory.getLogger(DirectoryService.class);
	
	@Autowired
	DirectoryWalker walker;	

	public void setWalker(DirectoryWalker walker) {
		this.walker = walker;
	}

	/**
	 * Returns information of single file if path is file.
	 * Initiates directory iteration if path is directory and returns full rcursive directory information..
	 * Clears the cache if cache contains possible stale information.
	 * @param path
	 * @return
	 */
	public FileInfo getStructureInfo( String path) {
		File file = new File(path);
		if(!file.exists() ){
		    logger.debug("The file does not exist or invalid path : " +path);

			return null;
		}
		
		if( file.isFile()){
		    logger.debug("Its a file. : " + file);

			FileInfo fileInfo = new FileInfo(file);
			fileInfo.initializeFilesStr();
			return fileInfo;
		}
		
		
        walker.resetFilesList();

        //logger.debug("Recursion is starting");
        DirInfo  fileInfo = walker.walk(path);
        
        //Reintialize the file list.
        walker.resetFilesList();
		if ( System.currentTimeMillis() - 60000 > fileInfo.getLastFetchedfromDisk() ){
			
			walker.clear(path);
			fileInfo = walker.walk(path);
		}
		return fileInfo;
	}
	
}
