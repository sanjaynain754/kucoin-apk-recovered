package com.tencent.rtmp;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes56.dex */
public class TXVodPlayConfig {
    String mCacheFolderPath;
    private int mEncryptedMp4Level;
    Map<String, String> mHeaders;
    int mMaxCacheItems;
    String mOverlayIv;
    String mOverlayKey;
    String mPreferAudioTrack;
    int mProgressInterval;
    int mConnectRetryCount = 3;
    int mConnectRetryInterval = 3;
    int mTimeout = 10;
    int mPlayerType = 1;
    boolean mEnableAccurateSeek = true;
    boolean mAutoRotate = true;
    boolean mSmoothSwitchBitrate = false;
    String mCacheMp4ExtName = "mp4";
    float mMaxBufferSize = 0.0f;
    float mMaxPreloadSize = 0.0f;
    int mFirstStartPlayBufferTime = 0;
    int mNextStartPlayBufferTime = 0;
    boolean mEnableRenderProcess = false;
    long mPreferredResolution = -1;
    int mMediaType = 0;
    Map<String, Object> mExtInfoMap = new ConcurrentHashMap();

    public String getCacheFolderPath() {
        return this.mCacheFolderPath;
    }

    public String getCacheMp4ExtName() {
        return this.mCacheMp4ExtName;
    }

    public int getConnectRetryCount() {
        return this.mConnectRetryCount;
    }

    public int getConnectRetryInterval() {
        return this.mConnectRetryInterval;
    }

    public int getEncryptedMp4Level() {
        return this.mEncryptedMp4Level;
    }

    public Map<String, Object> getExtInfoMap() {
        return this.mExtInfoMap;
    }

    public Map<String, String> getHeaders() {
        return this.mHeaders;
    }

    public float getMaxBufferSize() {
        return this.mMaxBufferSize;
    }

    public int getMaxCacheItems() {
        return this.mMaxCacheItems;
    }

    public float getMaxPreloadSize() {
        return this.mMaxPreloadSize;
    }

    public int getMediaType() {
        return this.mMediaType;
    }

    public String getOverlayIv() {
        return this.mOverlayIv;
    }

    public String getOverlayKey() {
        return this.mOverlayKey;
    }

    public int getPlayerType() {
        return this.mPlayerType;
    }

    public String getPreferredAudioTrack() {
        return this.mPreferAudioTrack;
    }

    public long getPreferredResolution() {
        return this.mPreferredResolution;
    }

    public int getProgressInterval() {
        return this.mProgressInterval;
    }

    public int getTimeout() {
        return this.mTimeout;
    }

    public boolean isAutoRotate() {
        return this.mAutoRotate;
    }

    public boolean isEnableAccurateSeek() {
        return this.mEnableAccurateSeek;
    }

    public boolean isEnableRenderProcess() {
        return this.mEnableRenderProcess;
    }

    public boolean isSmoothSwitchBitrate() {
        return this.mSmoothSwitchBitrate;
    }

    public void setAutoRotate(boolean z11) {
        this.mAutoRotate = z11;
    }

    @Deprecated
    public void setCacheFolderPath(String str) {
        this.mCacheFolderPath = str;
    }

    public void setCacheMp4ExtName(String str) {
        this.mCacheMp4ExtName = str;
    }

    public void setConnectRetryCount(int i11) {
        this.mConnectRetryCount = i11;
    }

    public void setConnectRetryInterval(int i11) {
        this.mConnectRetryInterval = i11;
    }

    public void setEnableAccurateSeek(boolean z11) {
        this.mEnableAccurateSeek = z11;
    }

    public void setEnableRenderProcess(boolean z11) {
        this.mEnableRenderProcess = z11;
    }

    public void setEncryptedMp4Level(int i11) {
        this.mEncryptedMp4Level = i11;
    }

    public void setExtInfo(Map<String, Object> map) {
        this.mExtInfoMap.clear();
        this.mExtInfoMap.putAll(map);
    }

    @Deprecated
    public void setFirstStartPlayBufferTime(int i11) {
        this.mFirstStartPlayBufferTime = i11;
    }

    public void setHeaders(Map<String, String> map) {
        this.mHeaders = map;
    }

    public void setMaxBufferSize(float f11) {
        this.mMaxBufferSize = f11;
    }

    @Deprecated
    public void setMaxCacheItems(int i11) {
        this.mMaxCacheItems = i11;
    }

    public void setMaxPreloadSize(float f11) {
        this.mMaxPreloadSize = f11;
    }

    public void setMediaType(int i11) {
        this.mMediaType = i11;
    }

    @Deprecated
    public void setNextStartPlayBufferTime(int i11) {
        this.mNextStartPlayBufferTime = i11;
    }

    public void setOverlayIv(String str) {
        this.mOverlayIv = str;
    }

    public void setOverlayKey(String str) {
        this.mOverlayKey = str;
    }

    public void setPlayerType(int i11) {
        this.mPlayerType = i11;
    }

    public void setPreferredAudioTrack(String str) {
        this.mPreferAudioTrack = str;
    }

    public void setPreferredResolution(long j11) {
        this.mPreferredResolution = j11;
    }

    public void setProgressInterval(int i11) {
        this.mProgressInterval = i11;
    }

    public void setSmoothSwitchBitrate(boolean z11) {
        this.mSmoothSwitchBitrate = z11;
    }

    public void setTimeout(int i11) {
        this.mTimeout = i11;
    }
}
