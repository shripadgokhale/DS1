package com.testproject.service;

import java.io.File;
import java.util.ArrayList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Repository;

import com.testproject.model.DirInfo;

@Repository
public class DirectoryWalker {

	private static final Logger logger = LoggerFactory.getLogger(DirectoryWalker.class);
	
	private ArrayList <DirInfo> filesList = new ArrayList<DirInfo>();
	
	/**
	 * Returns arraylist containing info about directory children.
	 * @return
	 */
	ArrayList <DirInfo> getFilesList() {
		return filesList;
	}

	/**
	 * Reinitializes the file arraylist.
	 * 
	 */
	public void resetFilesList() {
		filesList = new ArrayList<DirInfo>();
	}
	

	/**
	 * Iterates recursively through directory and collects information about directory children.
	 * Caches the data and returns it.
	 * @param path
	 * @return
	 */
	@Cacheable(value = { "DirectoryStructure" } , key="#path")
	public DirInfo walk( String path ) {

	    File root = new File( path );
	    //logger.debug("The directory/file name : " +path);
	    File[] list = root.listFiles();
	    DirInfo fileInfo = new DirInfo(System.currentTimeMillis(), root);
	    if (list == null) return fileInfo;

	    for ( File f : list ) {
	        if ( f.isDirectory() ) {
	            DirInfo dirInfo = walk( f.getAbsolutePath() );
	            fileInfo.addToFileList(dirInfo);
	        }
	        else {
	        	fileInfo.addToFileList(new DirInfo(System.currentTimeMillis(), f));
	        }
	    }
	    return fileInfo;
	    
	}
	
	/**
	 * Clears cache for given path key.
	 * @param path
	 */
	@CacheEvict(value = { "DirectoryStructure" } , key="#path")
	public void clear(String path) {
		
	    logger.debug("Cache cleared for key : " +path);
	}
	
	
}
