package com.thin.downloadmanager;

public interface IDownloadStatusListener {

	/**
	 * Notify download completed event.
	 * 
	 * @param id
	 */
	void onDownloadComplete(int id);

	/**
	 * Notify when download fail. Corresponding error code and error messages are provided.
	 * 
	 * @param id
	 *            download identify.
	 * @param errorCode
	 *            error code.
	 * @param errorMessage
	 *            error message.
	 */
	void onDownloadFailed(int id, int errorCode, String errorMessage);

	/**
	 * Notify when download progress change.
	 * 
	 * @param id
	 *            download identify.
	 * @param totalBytes
	 *            total bytes of downloading file.
	 * @param downloadedBytes
	 *            bytes downloaded.
	 * @param progress
	 *            download percent.
	 */
	void onProgress(int id, long totalBytes, long downloadedBytes, int progress);
}
