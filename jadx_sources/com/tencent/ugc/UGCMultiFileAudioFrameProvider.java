package com.tencent.ugc;

import android.os.Looper;
import com.tencent.liteav.base.util.CustomHandler;
import com.tencent.liteav.base.util.LiteavLog;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class UGCMultiFileAudioFrameProvider implements UGCAudioFrameProvider, UGCFrameQueue.UGCFrameQueueListener {
    private static final String TAG = "UGCMultiFileAudioFrameProvider";
    private final UGCFrameQueue<List<AudioFrame>> mAudioFrameListQueue;
    private final List<Clip> mClipList;
    private final TXVideoJoiner.DurationControlMode mDurationControlMode;
    private final UGCAudioFrameProvider[] mProviderList;
    private final CustomHandler mSingleFileProviderHandler;
    private final CustomHandler mWorkHandler;

    public static /* synthetic */ void lambda$start$0(UGCMultiFileAudioFrameProvider uGCMultiFileAudioFrameProvider) {
        for (int i11 = 0; i11 < uGCMultiFileAudioFrameProvider.mClipList.size(); i11++) {
            UGCSingleFileAudioFrameProvider uGCSingleFileAudioFrameProvider = new UGCSingleFileAudioFrameProvider(uGCMultiFileAudioFrameProvider.mClipList.get(i11), uGCMultiFileAudioFrameProvider.mSingleFileProviderHandler);
            uGCSingleFileAudioFrameProvider.initialize();
            uGCSingleFileAudioFrameProvider.start();
            uGCMultiFileAudioFrameProvider.mProviderList[i11] = uGCSingleFileAudioFrameProvider;
        }
        uGCMultiFileAudioFrameProvider.readFrameToQueue();
    }

    public static /* synthetic */ void lambda$stop$1(UGCMultiFileAudioFrameProvider uGCMultiFileAudioFrameProvider) {
        int i11 = 0;
        while (true) {
            UGCAudioFrameProvider[] uGCAudioFrameProviderArr = uGCMultiFileAudioFrameProvider.mProviderList;
            if (i11 >= uGCAudioFrameProviderArr.length) {
                uGCMultiFileAudioFrameProvider.mAudioFrameListQueue.clear();
                return;
            }
            UGCAudioFrameProvider uGCAudioFrameProvider = uGCAudioFrameProviderArr[i11];
            if (uGCAudioFrameProvider != null) {
                uGCAudioFrameProvider.stop();
                uGCMultiFileAudioFrameProvider.mProviderList[i11].uninitialize();
            }
            uGCMultiFileAudioFrameProvider.mProviderList[i11] = null;
            i11++;
        }
    }

    private boolean hasOneProviderMeetsEndOfStream() {
        for (UGCAudioFrameProvider uGCAudioFrameProvider : this.mProviderList) {
            if (uGCAudioFrameProvider == null) {
                return true;
            }
        }
        return false;
    }

    private boolean isAllProviderEndOfStream() {
        for (UGCAudioFrameProvider uGCAudioFrameProvider : this.mProviderList) {
            if (uGCAudioFrameProvider != null) {
                return false;
            }
        }
        return true;
    }

    private boolean isEndStream() {
        return this.mDurationControlMode == TXVideoJoiner.DurationControlMode.ALIGNS_TO_LONGEST ? isAllProviderEndOfStream() : hasOneProviderMeetsEndOfStream();
    }

    public static /* synthetic */ void lambda$seekTo$2(UGCMultiFileAudioFrameProvider uGCMultiFileAudioFrameProvider, long j11) {
        for (UGCAudioFrameProvider uGCAudioFrameProvider : uGCMultiFileAudioFrameProvider.mProviderList) {
            if (uGCAudioFrameProvider != null) {
                uGCAudioFrameProvider.seekTo(j11);
            }
        }
        uGCMultiFileAudioFrameProvider.mAudioFrameListQueue.clear();
    }

    @Override // com.tencent.ugc.UGCAudioFrameProvider
    public UGCFrameQueue<List<AudioFrame>> getFrameQueue() {
        return this.mAudioFrameListQueue;
    }

    @Override // com.tencent.ugc.UGCAudioFrameProvider
    public void initialize() {
        LiteavLog.m76087i(TAG, "initialize");
    }

    @Override // com.tencent.ugc.UGCFrameQueue.UGCFrameQueueListener
    public void onFrameDequeued() {
        this.mWorkHandler.runOrPost(RunnableC35671fb.m79165a(this));
    }

    public void readFrameToQueue() {
        LinkedList linkedList = new LinkedList();
        int i11 = 0;
        while (true) {
            UGCAudioFrameProvider[] uGCAudioFrameProviderArr = this.mProviderList;
            if (i11 >= uGCAudioFrameProviderArr.length) {
                break;
            }
            UGCAudioFrameProvider uGCAudioFrameProvider = uGCAudioFrameProviderArr[i11];
            if (uGCAudioFrameProvider == null) {
                linkedList.add(new AudioFrame());
            } else {
                List<AudioFrame> listDequeue = uGCAudioFrameProvider.getFrameQueue().dequeue();
                if (listDequeue == UGCAudioFrameProvider.END_OF_STREAM) {
                    uGCAudioFrameProvider.stop();
                    uGCAudioFrameProvider.uninitialize();
                    this.mProviderList[i11] = null;
                    linkedList.add(new AudioFrame());
                } else {
                    linkedList.add(listDequeue.get(0));
                }
            }
            i11++;
        }
        if (isEndStream()) {
            this.mAudioFrameListQueue.queue(UGCAudioFrameProvider.END_OF_STREAM);
        } else {
            this.mAudioFrameListQueue.queue(linkedList);
        }
    }

    @Override // com.tencent.ugc.UGCAudioFrameProvider
    public void seekTo(long j11) {
        this.mWorkHandler.runOrPost(RunnableC35670fa.m79164a(this, j11));
    }

    @Override // com.tencent.ugc.UGCAudioFrameProvider
    public void start() {
        this.mWorkHandler.runOrPost(RunnableC35667ey.m79161a(this));
    }

    @Override // com.tencent.ugc.UGCAudioFrameProvider
    public void stop() {
        this.mWorkHandler.runOrPost(RunnableC35668ez.m79162a(this));
    }

    public UGCMultiFileAudioFrameProvider(List<Clip> list, TXVideoJoiner.DurationControlMode durationControlMode, CustomHandler customHandler) {
        UGCFrameQueue<List<AudioFrame>> uGCFrameQueue = new UGCFrameQueue<>();
        this.mAudioFrameListQueue = uGCFrameQueue;
        this.mProviderList = new UGCAudioFrameProvider[list.size()];
        this.mClipList = list;
        this.mDurationControlMode = durationControlMode;
        this.mSingleFileProviderHandler = customHandler;
        this.mWorkHandler = new CustomHandler(Looper.myLooper());
        uGCFrameQueue.setUGCFrameQueueListener(this);
    }

    @Override // com.tencent.ugc.UGCAudioFrameProvider
    public void uninitialize() {
        stop();
    }

    @Override // com.tencent.ugc.UGCAudioFrameProvider
    public void setPlayEndPts(long j11) {
    }
}
