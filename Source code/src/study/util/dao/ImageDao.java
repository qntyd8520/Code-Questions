package study.util.dao;

import java.util.List;

import study.java.model.ImageItem;

public interface ImageDao {
	public List<ImageItem> getImageSearchList(String keyword);

}
