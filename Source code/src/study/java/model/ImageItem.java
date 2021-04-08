package study.java.model;

public class ImageItem {
	private String collection;
	private String datetime;
	private String displaysitename;
	private String doc_url;
	private int height;
	private String imageUrl;
	private String thumbnailUrl;
	private int width;

	public String getCollection() {
		return collection;
	}

	public void setCollection(String collection) {
		this.collection = collection;
	}

	public String getDatetime() {
		return datetime;
	}

	public void setDatetime(String datetime) {
		this.datetime = datetime;
	}

	public String getDisplaysitename() {
		return displaysitename;
	}

	public void setDisplaysitename(String displaysitename) {
		this.displaysitename = displaysitename;
	}

	public String getDoc_url() {
		return doc_url;
	}

	public void setDoc_url(String doc_url) {
		this.doc_url = doc_url;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public String getThumbnailUrl() {
		return thumbnailUrl;
	}

	public void setThumbnailUrl(String thumbnailUrl) {
		this.thumbnailUrl = thumbnailUrl;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public ImageItem(String collection, String datetime, String displaysitename, String doc_url, int height,
			String imageUrl, String thumbnailUrl, int width) {
		super();
		this.collection = collection;
		this.datetime = datetime;
		this.displaysitename = displaysitename;
		this.doc_url = doc_url;
		this.height = height;
		this.imageUrl = imageUrl;
		this.thumbnailUrl = thumbnailUrl;
		this.width = width;
	}

	@Override
	public String toString() {
		return "ImageItem [collection=" + collection + ", datetime=" + datetime + ", displaysitename=" + displaysitename
				+ ", doc_url=" + doc_url + ", height=" + height + ", imageUrl=" + imageUrl + ", thumbnailUrl="
				+ thumbnailUrl + ", width=" + width + "]";
	}

}
