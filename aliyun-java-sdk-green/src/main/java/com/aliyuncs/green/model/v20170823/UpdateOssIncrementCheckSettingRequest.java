/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.green.model.v20170823;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class UpdateOssIncrementCheckSettingRequest extends RpcAcsRequest<UpdateOssIncrementCheckSettingResponse> {
	
	public UpdateOssIncrementCheckSettingRequest() {
		super("Green", "2017-08-23", "UpdateOssIncrementCheckSetting", "green");
	}

	private String imageAutoFreeze;

	private String videoSceneList;

	private String autoFreezeType;

	private String imageSceneList;

	private String bucketConfigList;

	private String sourceIp;

	private String imageScanLimit;

	private String videoAutoFreezeSceneList;

	private Integer videoFrameInterval;

	private Integer videoMaxSize;

	private String lang;

	private Integer videoMaxFrames;

	public String getImageAutoFreeze() {
		return this.imageAutoFreeze;
	}

	public void setImageAutoFreeze(String imageAutoFreeze) {
		this.imageAutoFreeze = imageAutoFreeze;
		if(imageAutoFreeze != null){
			putQueryParameter("ImageAutoFreeze", imageAutoFreeze);
		}
	}

	public String getVideoSceneList() {
		return this.videoSceneList;
	}

	public void setVideoSceneList(String videoSceneList) {
		this.videoSceneList = videoSceneList;
		if(videoSceneList != null){
			putQueryParameter("VideoSceneList", videoSceneList);
		}
	}

	public String getAutoFreezeType() {
		return this.autoFreezeType;
	}

	public void setAutoFreezeType(String autoFreezeType) {
		this.autoFreezeType = autoFreezeType;
		if(autoFreezeType != null){
			putQueryParameter("AutoFreezeType", autoFreezeType);
		}
	}

	public String getImageSceneList() {
		return this.imageSceneList;
	}

	public void setImageSceneList(String imageSceneList) {
		this.imageSceneList = imageSceneList;
		if(imageSceneList != null){
			putQueryParameter("ImageSceneList", imageSceneList);
		}
	}

	public String getBucketConfigList() {
		return this.bucketConfigList;
	}

	public void setBucketConfigList(String bucketConfigList) {
		this.bucketConfigList = bucketConfigList;
		if(bucketConfigList != null){
			putQueryParameter("BucketConfigList", bucketConfigList);
		}
	}

	public String getSourceIp() {
		return this.sourceIp;
	}

	public void setSourceIp(String sourceIp) {
		this.sourceIp = sourceIp;
		if(sourceIp != null){
			putQueryParameter("SourceIp", sourceIp);
		}
	}

	public String getImageScanLimit() {
		return this.imageScanLimit;
	}

	public void setImageScanLimit(String imageScanLimit) {
		this.imageScanLimit = imageScanLimit;
		if(imageScanLimit != null){
			putQueryParameter("ImageScanLimit", imageScanLimit);
		}
	}

	public String getVideoAutoFreezeSceneList() {
		return this.videoAutoFreezeSceneList;
	}

	public void setVideoAutoFreezeSceneList(String videoAutoFreezeSceneList) {
		this.videoAutoFreezeSceneList = videoAutoFreezeSceneList;
		if(videoAutoFreezeSceneList != null){
			putQueryParameter("VideoAutoFreezeSceneList", videoAutoFreezeSceneList);
		}
	}

	public Integer getVideoFrameInterval() {
		return this.videoFrameInterval;
	}

	public void setVideoFrameInterval(Integer videoFrameInterval) {
		this.videoFrameInterval = videoFrameInterval;
		if(videoFrameInterval != null){
			putQueryParameter("VideoFrameInterval", videoFrameInterval.toString());
		}
	}

	public Integer getVideoMaxSize() {
		return this.videoMaxSize;
	}

	public void setVideoMaxSize(Integer videoMaxSize) {
		this.videoMaxSize = videoMaxSize;
		if(videoMaxSize != null){
			putQueryParameter("VideoMaxSize", videoMaxSize.toString());
		}
	}

	public String getLang() {
		return this.lang;
	}

	public void setLang(String lang) {
		this.lang = lang;
		if(lang != null){
			putQueryParameter("Lang", lang);
		}
	}

	public Integer getVideoMaxFrames() {
		return this.videoMaxFrames;
	}

	public void setVideoMaxFrames(Integer videoMaxFrames) {
		this.videoMaxFrames = videoMaxFrames;
		if(videoMaxFrames != null){
			putQueryParameter("VideoMaxFrames", videoMaxFrames.toString());
		}
	}

	@Override
	public Class<UpdateOssIncrementCheckSettingResponse> getResponseClass() {
		return UpdateOssIncrementCheckSettingResponse.class;
	}

}
