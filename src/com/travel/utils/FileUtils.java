package com.travel.utils;

import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

public class FileUtils {

	public static List<MultipartFile> getFiles(
			MultipartHttpServletRequest multipartrequest) {
		List<MultipartFile> listImages = new ArrayList<MultipartFile>();

		Iterator<String> imagesIterator = multipartrequest.getFileNames();
		while (imagesIterator.hasNext()) {
			MultipartFile image = multipartrequest.getFile(imagesIterator
					.next());
			if (!image.isEmpty()) {
				listImages.add(image);
			}
		}

		return listImages;
	}

	public static List<String> uploadFile(List<MultipartFile> files,
			String folderName, String systemPath) throws Exception {
		List<String> urlList = new ArrayList<String>();

		for (MultipartFile file : files) {
			if (file.isEmpty())
				continue;
			// 重命名文件名
			String oriFilename = file.getOriginalFilename();
			String filename = System.currentTimeMillis()
					+ oriFilename.substring(oriFilename.indexOf("."));
			// 创建文件路径
			String fileAbsolutePath = createPath(systemPath, folderName);
			String fileRelativePath = createPath("", folderName) + filename;
			// 创建文件
			File saveFolder = new File(fileAbsolutePath);
			if (!saveFolder.exists()) {
				saveFolder.mkdirs();
			}
			File saveFile = new File(fileAbsolutePath + filename);

			FileOutputStream fileOutputStream = new FileOutputStream(saveFile);
			fileOutputStream.write(file.getBytes());
			fileOutputStream.flush();
			fileOutputStream.close();

			urlList.add(fileRelativePath.replaceAll("\\\\", "/"));
		}

		return urlList;
	}

	public static String createPath(String systemPath, String folderName) {
		StringBuffer path = new StringBuffer();
		path.append(systemPath);
		path.append(File.separator);
		path.append(folderName);
		path.append(File.separator);
		path.append(DateUtils.getDate("yyyyMMdd"));
		path.append(File.separator);

		return path.toString();
	}
}