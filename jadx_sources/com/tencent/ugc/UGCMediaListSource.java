package com.tencent.ugc;

import android.graphics.Bitmap;
import android.os.HandlerThread;
import com.tencent.liteav.base.util.C34743h;
import com.tencent.liteav.base.util.CustomHandler;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.ugc.retriver.FFmpegMediaRetriever;
import com.tencent.ugc.videobase.egl.EGLCore;
import com.tencent.ugc.videobase.frame.GLTexturePool;
import com.tencent.ugc.videobase.frame.PixelFrame;
import com.tencent.ugc.videobase.utils.CollectionUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public class UGCMediaListSource {
    private static final int MAX_FRAME_SIZE = 1;
    private static final int READ_FRAME_TIME_OUT_MS = 5;
    public static final int SEEK_TIME_OUT = 1000;
    private CustomHandler mAudioHandler;
    private List<Bitmap> mBitmapList;
    private FutureTask<Long> mCalculateDurationTask;
    private UGCAudioFrameProvider mCurrentAudioFrameProvider;
    private UGCPixelFrameProvider mCurrentPixelFrameProvider;
    private EGLCore mEGLCore;
    private FutureTask<Boolean> mHasAudioDataTask;
    private final InterfaceC35480b mListener;
    private UGCPixelFrameProvider mNextPixelFrameProvider;
    private List<TXVideoEditConstants.TXRepeat> mRepeatList;
    private List<String> mSources;
    private List<TXVideoEditConstants.TXSpeed> mSpeedList;
    private CustomHandler mVideoHandler;
    private CustomHandler mWorkHandler;
    private final AtomicInteger mCountOfPendingResetInputData = new AtomicInteger();
    private final AtomicReference<Long> mPendingSeekTime = new AtomicReference<>();
    private int mCurrentVideoClipIndex = 0;
    private int mCurrentAudioClipIndex = 0;
    private int mNextVideoClipIndex = 0;
    private long mVideoSeekTimeInClip = Long.MIN_VALUE;
    private long mAudioSeekTimeInClip = Long.MIN_VALUE;
    private long mLastVideoFrameTimestamp = -1;
    private long mLastAudioFrameTimestamp = -1;
    private boolean mIsSplitScreenMode = false;
    private int mFps = 20;
    private int mTransitionType = 1;
    private long mSourceRangeStart = 0;
    private long mSourceRangeEnd = 2147483647L;
    private long mTotalDuration = 0;
    private long mTailWaterMarkDurationMs = 0;
    private boolean mIsPreciseSeek = true;
    private boolean mIsReverse = false;
    private boolean mNeedAudioSource = false;
    private int mMaxBufferFrame = 3;
    private long mPlayEndTime = Long.MAX_VALUE;
    private TXVideoJoiner.DurationControlMode mDurationControlMode = TXVideoJoiner.DurationControlMode.ALIGNS_TO_LONGEST;
    private final UGCPixelFrameProvider.UGCFilePixelFrameProviderListener mPixelFrameProviderListener = new UGCPixelFrameProvider.UGCFilePixelFrameProviderListener() { // from class: com.tencent.ugc.UGCMediaListSource.1
        @Override // com.tencent.ugc.UGCPixelFrameProvider.UGCFilePixelFrameProviderListener
        public final void onDecodeFailed() {
            if (UGCMediaListSource.this.mListener != null) {
                UGCMediaListSource.this.mListener.mo78973a();
            }
        }
    };
    private final List<Clip> mClipList = new ArrayList();
    private final List<C35479a> mMediaInfoList = new ArrayList();
    private final UGCFrameQueue<List<PixelFrame>> mPixelFrameListQueue = new UGCFrameQueue<>();
    private final UGCFrameQueue<List<AudioFrame>> mAudioFrameListQueue = new UGCFrameQueue<>();
    private final List<PixelFrame> mTailPixelFrameList = new ArrayList();
    private final String mTAG = "UGCMediaListSource_" + hashCode();

    /* JADX INFO: renamed from: com.tencent.ugc.UGCMediaListSource$b */
    public interface InterfaceC35480b {
        /* JADX INFO: renamed from: a */
        void mo78973a();
    }

    private void runOnWorkThread(Runnable runnable) {
        runOnWorkThread(runnable, 0);
    }

    private void seekToInternalWithImageSource(long j11) {
        this.mCurrentVideoClipIndex = 0;
        this.mVideoSeekTimeInClip = j11;
        this.mLastVideoFrameTimestamp = -1L;
        this.mLastAudioFrameTimestamp = -1L;
        clearFrameQueue();
        clearTailPixelFrameQueue();
        loadNextVideoFrameInternal(0L);
    }

    public void seekTo(long j11) {
        LiteavLog.m76087i(this.mTAG, "seekTo lineTime = ".concat(String.valueOf(j11)));
        seekTo(j11, true);
    }

    private void addClipToList(long j11, long j12, C35479a c35479a) {
        if (j11 >= j12) {
            return;
        }
        Clip clip = new Clip();
        clip.startInFileTime = j11;
        clip.endInFileTime = j12;
        clip.path = c35479a.f76699e;
        clip.fps = c35479a.f76698d;
        clip.videoMimeType = c35479a.f76700f;
        this.mClipList.add(clip);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0031  */
    private void addVideoTailFrameListToQueue() {
        long j11;
        PixelFrame pixelFrame;
        if (this.mTailWaterMarkDurationMs <= 0 || this.mTailPixelFrameList.isEmpty()) {
            return;
        }
        List<Clip> list = this.mClipList;
        if (list == null || list.isEmpty()) {
            j11 = 40;
        } else {
            float f11 = this.mClipList.get(0).fps;
            if (f11 > 0.0f) {
                j11 = (long) (1000.0f / f11);
            } else {
                j11 = 40;
            }
        }
        int i11 = (int) (this.mTailWaterMarkDurationMs / j11);
        for (int i12 = 0; i12 < i11; i12++) {
            LinkedList linkedList = new LinkedList();
            for (PixelFrame pixelFrame2 : this.mTailPixelFrameList) {
                if (pixelFrame2 instanceof GLTexturePool.TextureFrame) {
                    GLTexturePool.TextureFrame textureFrame = (GLTexturePool.TextureFrame) pixelFrame2;
                    pixelFrame = textureFrame.getGLTexture().wrap(textureFrame.getGLContext());
                } else {
                    LiteavLog.m76093w(this.mTAG, "addVideoTailFrameListToQueue: pixelFrame is not TextureFrame");
                    pixelFrame = new PixelFrame(pixelFrame2);
                }
                pixelFrame.setTimestamp((((long) (i12 + 1)) * j11) + pixelFrame2.getTimestamp());
                linkedList.add(pixelFrame);
            }
            if (!putPixFrameToQueue(linkedList)) {
                return;
            }
        }
    }

    private long calculateAudioFrameDuration(AudioFrame audioFrame) {
        if (audioFrame == null || audioFrame.getData() == null) {
            return 0L;
        }
        long sampleRate = ((long) audioFrame.getSampleRate()) * 2 * ((long) audioFrame.getChannelCount());
        if (sampleRate == 0) {
            return 0L;
        }
        return (((long) audioFrame.getData().limit()) * 1000) / sampleRate;
    }

    private void clearTailPixelFrameQueue() {
        if (this.mTailPixelFrameList.isEmpty()) {
            return;
        }
        ensureEGLCoreCreated();
        if (EGLCore.makeCurrent(this.mEGLCore)) {
            PixelFrame.releasePixelFrames(this.mTailPixelFrameList);
        }
        this.mTailPixelFrameList.clear();
    }

    private void clearVideoFrameQueue() {
        List<List<PixelFrame>> listDequeueAll = this.mPixelFrameListQueue.dequeueAll();
        if (listDequeueAll.isEmpty()) {
            return;
        }
        runOnWorkThread(RunnableC35660er.m79154a(this, listDequeueAll));
    }

    private void closeCurrentAudioFrameProvider() {
        UGCAudioFrameProvider uGCAudioFrameProvider = this.mCurrentAudioFrameProvider;
        if (uGCAudioFrameProvider == null) {
            return;
        }
        uGCAudioFrameProvider.stop();
        this.mCurrentAudioFrameProvider.uninitialize();
        this.mCurrentAudioFrameProvider = null;
    }

    private void closeCurrentPixelFrameProvider() {
        UGCPixelFrameProvider uGCPixelFrameProvider = this.mCurrentPixelFrameProvider;
        if (uGCPixelFrameProvider == null) {
            return;
        }
        uGCPixelFrameProvider.stop();
        this.mCurrentPixelFrameProvider.uninitialize();
        this.mCurrentPixelFrameProvider = null;
    }

    private void closeNextPixelFrameProvider() {
        UGCPixelFrameProvider uGCPixelFrameProvider = this.mNextPixelFrameProvider;
        if (uGCPixelFrameProvider == null) {
            return;
        }
        uGCPixelFrameProvider.stop();
        this.mNextPixelFrameProvider.uninitialize();
        this.mNextPixelFrameProvider = null;
    }

    private UGCPixelFrameProvider createImageProvider() {
        UGCImageProvider uGCImageProvider = new UGCImageProvider(this.mBitmapList, this.mFps);
        uGCImageProvider.initialize();
        uGCImageProvider.start();
        uGCImageProvider.setPictureTransition(this.mTransitionType);
        return uGCImageProvider;
    }

    private UGCAudioFrameProvider createMuteAudioProvider() {
        Clip clip = new Clip();
        clip.path = UGCSingleFileAudioFrameProvider.MUTE_VIRTUAL_FILE_PATH;
        clip.startInClipsTimeline = 0L;
        clip.startTimelineNoSpeed = 0L;
        clip.startInFileTime = 0L;
        clip.endInFileTime = getImageDuration();
        UGCSingleFileAudioFrameProvider uGCSingleFileAudioFrameProvider = new UGCSingleFileAudioFrameProvider(clip, this.mAudioHandler);
        uGCSingleFileAudioFrameProvider.initialize();
        uGCSingleFileAudioFrameProvider.start();
        return uGCSingleFileAudioFrameProvider;
    }

    private TXVideoEditConstants.TXSpeed createTXSpeed(long j11, long j12, int i11) {
        TXVideoEditConstants.TXSpeed tXSpeed = new TXVideoEditConstants.TXSpeed();
        tXSpeed.startTime = j11;
        tXSpeed.endTime = j12;
        tXSpeed.speedLevel = i11;
        return tXSpeed;
    }

    private UGCPixelFrameProvider createVideoFileProvider(int i11, boolean z11) {
        UGCPixelFrameProvider uGCMultiFilePixelFrameProvider;
        if (this.mVideoHandler == null) {
            HandlerThread handlerThread = new HandlerThread("Video-File-Provider");
            handlerThread.start();
            this.mVideoHandler = new CustomHandler(handlerThread.getLooper());
        }
        if (z11) {
            uGCMultiFilePixelFrameProvider = new UGCMultiFilePixelFrameProvider(this.mClipList, this.mDurationControlMode, this.mVideoHandler, this.mPixelFrameProviderListener);
        } else {
            UGCSingleFilePixelFrameProvider uGCSingleFilePixelFrameProvider = new UGCSingleFilePixelFrameProvider(this.mClipList.get(i11), this.mVideoHandler, this.mPixelFrameProviderListener);
            uGCSingleFilePixelFrameProvider.setPlayEndPts(this.mPlayEndTime);
            uGCMultiFilePixelFrameProvider = uGCSingleFilePixelFrameProvider;
        }
        uGCMultiFilePixelFrameProvider.initialize();
        uGCMultiFilePixelFrameProvider.setReverse(this.mIsReverse);
        uGCMultiFilePixelFrameProvider.setMaxBufferFrameCount(this.mMaxBufferFrame);
        uGCMultiFilePixelFrameProvider.start();
        if (this.mVideoSeekTimeInClip == 0) {
            this.mVideoSeekTimeInClip = Long.MIN_VALUE;
        }
        return uGCMultiFilePixelFrameProvider;
    }

    private void cutMultipleFileToClips() {
        for (C35479a c35479a : this.mMediaInfoList) {
            addClipToList(0L, c35479a.f76696b, c35479a);
        }
    }

    private void cutSingleVideoFileToClips() {
        long j11 = this.mSourceRangeStart;
        List<TXVideoEditConstants.TXRepeat> list = this.mRepeatList;
        if (list != null && !list.isEmpty()) {
            Collections.sort(this.mRepeatList, C35662et.m79156a());
            for (TXVideoEditConstants.TXRepeat tXRepeat : this.mRepeatList) {
                if (!isInvalidRepeat(tXRepeat)) {
                    long j12 = tXRepeat.endTime;
                    long j13 = this.mSourceRangeEnd;
                    if (j12 > j13) {
                        j12 = j13;
                    }
                    addClipToList(j11, j12, this.mMediaInfoList.get(0));
                    for (int i11 = 0; i11 < tXRepeat.repeatTimes - 1; i11++) {
                        addClipToList(tXRepeat.startTime, j12, this.mMediaInfoList.get(0));
                    }
                    j11 = j12;
                }
            }
        }
        long j14 = this.mTotalDuration;
        long j15 = this.mSourceRangeEnd;
        if (j14 > j15) {
            j14 = j15;
        }
        if (j11 < j14) {
            addClipToList(j11, j14, this.mMediaInfoList.get(0));
        }
    }

    private void ensureEGLCoreCreated() {
        if (this.mEGLCore == null) {
            this.mEGLCore = EGLCore.create(GlobalContextManager.getInstance().getGLContext());
        }
    }

    private long estimateSourceOpenTime() {
        List<String> list = this.mSources;
        if (list == null || list.size() <= 1) {
            return 1000L;
        }
        return ((long) list.size()) * 1000;
    }

    private long getClipDuration(Clip clip) {
        List<TXVideoEditConstants.TXSpeed> list = clip.speedList;
        if (list == null) {
            return clip.endInFileTime - clip.startInFileTime;
        }
        long speed = 0;
        for (TXVideoEditConstants.TXSpeed tXSpeed : list) {
            speed = (long) (speed + ((tXSpeed.endTime - tXSpeed.startTime) / getSpeed(tXSpeed.speedLevel)));
        }
        return speed;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static C35479a getMediaInfo(String str) {
        C35479a c35479a = new C35479a(0 == true ? 1 : 0);
        FFmpegMediaRetriever fFmpegMediaRetriever = new FFmpegMediaRetriever();
        if (fFmpegMediaRetriever.setDataSource(str) == 0) {
            long audioDurationMs = fFmpegMediaRetriever.getAudioDurationMs();
            c35479a.f76696b = Math.max(audioDurationMs, fFmpegMediaRetriever.getVideoDurationMs());
            c35479a.f76697c = audioDurationMs != 0;
            c35479a.f76698d = fFmpegMediaRetriever.getFPS();
            c35479a.f76700f = fFmpegMediaRetriever.getVideoMimeType();
        }
        return c35479a;
    }

    public static float getSpeed(int i11) {
        if (i11 == 0) {
            return 0.25f;
        }
        if (i11 == 1) {
            return 0.5f;
        }
        if (i11 != 3) {
            return i11 != 4 ? 1.0f : 2.0f;
        }
        return 1.5f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean hasAudioDataInternal() {
        Iterator<C35479a> it = this.mMediaInfoList.iterator();
        while (it.hasNext()) {
            if (it.next().f76697c) {
                return true;
            }
        }
        return false;
    }

    private boolean isImageSource() {
        List<Bitmap> list;
        return (this.mClipList.size() != 0 || (list = this.mBitmapList) == null || list.size() == 0) ? false : true;
    }

    private boolean isInvalidRepeat(TXVideoEditConstants.TXRepeat tXRepeat) {
        if (tXRepeat.repeatTimes <= 0) {
            return true;
        }
        long j11 = tXRepeat.startTime;
        long j12 = tXRepeat.endTime;
        return j11 >= j12 || j11 > this.mSourceRangeEnd || j12 < this.mSourceRangeStart;
    }

    private boolean isResettingInputData() {
        return this.mCountOfPendingResetInputData.get() > 0 || this.mPendingSeekTime.get() != null;
    }

    public static /* synthetic */ int lambda$cutSingleVideoFileToClips$1(TXVideoEditConstants.TXRepeat tXRepeat, TXVideoEditConstants.TXRepeat tXRepeat2) {
        return (int) (tXRepeat.startTime - tXRepeat2.startTime);
    }

    public static /* synthetic */ void lambda$seekTo$11(UGCMediaListSource uGCMediaListSource, boolean z11) {
        Long andSet = uGCMediaListSource.mPendingSeekTime.getAndSet(null);
        if (andSet != null) {
            uGCMediaListSource.seekToInternal(andSet.longValue(), z11);
        }
    }

    public static /* synthetic */ void lambda$setDurationControlMode$3(UGCMediaListSource uGCMediaListSource, TXVideoJoiner.DurationControlMode durationControlMode, FutureTask futureTask) {
        uGCMediaListSource.mDurationControlMode = durationControlMode;
        futureTask.run();
    }

    public static /* synthetic */ void lambda$setIsSplitScreenMode$4(UGCMediaListSource uGCMediaListSource, boolean z11, FutureTask futureTask) {
        uGCMediaListSource.mIsSplitScreenMode = z11;
        uGCMediaListSource.mSourceRangeStart = 0L;
        uGCMediaListSource.mSourceRangeEnd = 2147483647L;
        uGCMediaListSource.updateTimelineToClips();
        futureTask.run();
        uGCMediaListSource.mCountOfPendingResetInputData.decrementAndGet();
    }

    public static /* synthetic */ void lambda$setPlayEndTime$10(UGCMediaListSource uGCMediaListSource, long j11) {
        uGCMediaListSource.mPlayEndTime = j11;
        UGCPixelFrameProvider uGCPixelFrameProvider = uGCMediaListSource.mCurrentPixelFrameProvider;
        if (uGCPixelFrameProvider != null) {
            uGCPixelFrameProvider.setPlayEndPts(j11);
        }
        UGCAudioFrameProvider uGCAudioFrameProvider = uGCMediaListSource.mCurrentAudioFrameProvider;
        if (uGCAudioFrameProvider != null) {
            uGCAudioFrameProvider.setPlayEndPts(j11);
        }
    }

    public static /* synthetic */ void lambda$setRepeatPlay$12(UGCMediaListSource uGCMediaListSource, List list, FutureTask futureTask) {
        uGCMediaListSource.mRepeatList = list;
        uGCMediaListSource.updateClipsInfo();
        uGCMediaListSource.resetReadPositionInternal();
        futureTask.run();
        uGCMediaListSource.mCountOfPendingResetInputData.decrementAndGet();
    }

    public static /* synthetic */ void lambda$setReverse$13(UGCMediaListSource uGCMediaListSource, boolean z11) {
        uGCMediaListSource.mIsReverse = z11;
        uGCMediaListSource.resetReadPositionInternal();
        uGCMediaListSource.mCountOfPendingResetInputData.decrementAndGet();
    }

    public static /* synthetic */ void lambda$setSpeedList$14(UGCMediaListSource uGCMediaListSource, List list, FutureTask futureTask) {
        uGCMediaListSource.mSpeedList = list;
        uGCMediaListSource.updateClipsInfo();
        uGCMediaListSource.resetReadPositionInternal();
        futureTask.run();
        uGCMediaListSource.mCountOfPendingResetInputData.decrementAndGet();
    }

    public static /* synthetic */ void lambda$setVideoSourceRange$5(UGCMediaListSource uGCMediaListSource, long j11, long j12, FutureTask futureTask) {
        if (!uGCMediaListSource.mIsSplitScreenMode) {
            uGCMediaListSource.mSourceRangeStart = j11;
            uGCMediaListSource.mSourceRangeEnd = j12;
            uGCMediaListSource.updateClipsInfo();
        }
        uGCMediaListSource.resetReadPositionInternal();
        futureTask.run();
        uGCMediaListSource.mCountOfPendingResetInputData.decrementAndGet();
    }

    public static /* synthetic */ int lambda$updateSpeedInfoToClips$2(TXVideoEditConstants.TXSpeed tXSpeed, TXVideoEditConstants.TXSpeed tXSpeed2) {
        return (int) (tXSpeed.startTime - tXSpeed2.startTime);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void loadNextAudioFrameInternal(long j11) {
        if (this.mAudioFrameListQueue.size() > 1) {
            return;
        }
        if (!updateCurrentAudioFrameProvider()) {
            if (putAudioFrameToQueue(null)) {
                LiteavLog.m76087i(this.mTAG, "getAudioFrameProvider fail.AudioFrameListQueue put null");
                return;
            } else {
                scheduleTaskOnWorkerThread(RunnableC35640ei.m79136a(this));
                return;
            }
        }
        long j12 = this.mAudioSeekTimeInClip;
        if (j12 != Long.MIN_VALUE) {
            this.mCurrentAudioFrameProvider.seekTo(j12);
            this.mCurrentAudioFrameProvider.setPlayEndPts(this.mPlayEndTime);
            this.mAudioSeekTimeInClip = Long.MIN_VALUE;
        }
        readAudioFrameListToQueue(j11);
        scheduleTaskOnWorkerThread(RunnableC35641ej.m79137a(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void loadNextVideoFrameInternal(long j11) {
        if (this.mPixelFrameListQueue.size() > 0) {
            return;
        }
        if (!updateCurrentPixelFrameProvider()) {
            addVideoTailFrameListToQueue();
            if (putPixFrameToQueue(null)) {
                LiteavLog.m76087i(this.mTAG, "getPixelFrameProvider fail.PixelFrameListQueue put null");
                return;
            } else {
                scheduleTaskOnWorkerThread(RunnableC35642ek.m79138a(this));
                return;
            }
        }
        long j12 = this.mVideoSeekTimeInClip;
        if (j12 != Long.MIN_VALUE) {
            this.mCurrentPixelFrameProvider.seekTo(j12, this.mIsPreciseSeek);
            this.mCurrentPixelFrameProvider.setPlayEndPts(this.mPlayEndTime);
            this.mVideoSeekTimeInClip = Long.MIN_VALUE;
        }
        readVideoFrameListToQueue(j11);
        scheduleTaskOnWorkerThread(RunnableC35643el.m79139a(this));
    }

    private void readAudioFrameListToQueue(long j11) {
        List<AudioFrame> listDequeue = this.mCurrentAudioFrameProvider.getFrameQueue().dequeue(j11);
        if (listDequeue == null) {
            return;
        }
        if (listDequeue != UGCAudioFrameProvider.END_OF_STREAM) {
            if (!this.mIsSplitScreenMode) {
                adjustAudioFrameTimestamp(listDequeue);
            }
            putAudioFrameToQueue(listDequeue);
        } else {
            LiteavLog.m76087i(this.mTAG, "audio frame provider read END_OF_STREAM");
            closeCurrentAudioFrameProvider();
            if (this.mIsReverse) {
                this.mCurrentAudioClipIndex--;
            } else {
                this.mCurrentAudioClipIndex++;
            }
        }
    }

    private void readVideoFrameListToQueue(long j11) {
        List<PixelFrame> listDequeue = this.mCurrentPixelFrameProvider.getFrameQueue().dequeue(j11);
        if (listDequeue == null) {
            return;
        }
        if (listDequeue == UGCPixelFrameProvider.END_OF_STREAM) {
            LiteavLog.m76087i(this.mTAG, "video frame provider read END_OF_STREAM");
            closeCurrentPixelFrameProvider();
            if (this.mIsReverse) {
                this.mCurrentVideoClipIndex--;
                return;
            } else {
                this.mCurrentVideoClipIndex++;
                return;
            }
        }
        if (!this.mIsSplitScreenMode) {
            adjustPixelFrameTimestamp(listDequeue);
        }
        if (isResettingInputData()) {
            PixelFrame.releasePixelFrames(listDequeue);
        } else {
            saveTailVideoFrameToList(listDequeue);
            this.mPixelFrameListQueue.queue(listDequeue);
        }
    }

    private void removeRunnable(Runnable runnable) {
        CustomHandler customHandler = this.mWorkHandler;
        if (customHandler != null) {
            customHandler.removeCallbacks(runnable);
        }
    }

    private void runOnWorkThread(Runnable runnable, int i11) {
        CustomHandler customHandler = this.mWorkHandler;
        if (customHandler != null) {
            customHandler.runOrPost(runnable, i11);
        }
    }

    private void saveTailVideoFrameToList(List<PixelFrame> list) {
        if (this.mTailWaterMarkDurationMs == 0) {
            return;
        }
        Iterator<PixelFrame> it = this.mTailPixelFrameList.iterator();
        while (it.hasNext()) {
            it.next().release();
        }
        this.mTailPixelFrameList.clear();
        for (PixelFrame pixelFrame : list) {
            pixelFrame.retain();
            this.mTailPixelFrameList.add(pixelFrame);
        }
    }

    private void scheduleTaskOnWorkerThread(Runnable runnable) {
        CustomHandler customHandler = this.mWorkHandler;
        if (customHandler != null) {
            customHandler.post(runnable);
        }
    }

    private void seekToInternal(long j11, boolean z11) {
        long jM76116a = C34743h.m76116a(j11, 0L, this.mTotalDuration);
        if (isImageSource()) {
            seekToInternalWithImageSource(jM76116a);
            return;
        }
        if (this.mClipList.isEmpty()) {
            return;
        }
        this.mLastAudioFrameTimestamp = -1L;
        this.mLastVideoFrameTimestamp = -1L;
        if (this.mIsSplitScreenMode) {
            this.mVideoSeekTimeInClip = jM76116a;
            this.mAudioSeekTimeInClip = jM76116a;
            clearFrameQueue();
            clearTailPixelFrameQueue();
            return;
        }
        int i11 = 0;
        while (true) {
            if (i11 >= this.mClipList.size()) {
                i11 = -1;
                break;
            }
            Clip clip = this.mClipList.get(i11);
            if (clip.startInClipsTimeline + (clip.endInFileTime - clip.startInFileTime) >= jM76116a) {
                break;
            } else {
                i11++;
            }
        }
        if (i11 >= 0) {
            this.mVideoSeekTimeInClip = jM76116a - this.mClipList.get(i11).startInClipsTimeline;
        } else {
            this.mVideoSeekTimeInClip = jM76116a;
        }
        long j12 = this.mVideoSeekTimeInClip;
        this.mAudioSeekTimeInClip = j12;
        if (this.mIsReverse) {
            this.mAudioSeekTimeInClip = this.mTotalDuration - j12;
        }
        this.mIsPreciseSeek = z11;
        if (this.mCurrentVideoClipIndex != i11) {
            closeCurrentPixelFrameProvider();
        }
        if (this.mCurrentAudioClipIndex != i11) {
            closeCurrentAudioFrameProvider();
        }
        this.mCurrentVideoClipIndex = i11;
        this.mCurrentAudioClipIndex = i11;
        this.mLastVideoFrameTimestamp = -1L;
        this.mLastAudioFrameTimestamp = -1L;
        clearFrameQueue();
        clearTailPixelFrameQueue();
        loadNextVideoFrameInternal(0L);
        if (this.mNeedAudioSource) {
            loadNextAudioFrameInternal(0L);
        }
    }

    private void updateClipsInfo() {
        LiteavLog.m76087i(this.mTAG, "updateClipsInfo");
        List<String> list = this.mSources;
        if (list == null || list.isEmpty()) {
            return;
        }
        this.mClipList.clear();
        if (this.mSources.size() > 1) {
            cutMultipleFileToClips();
        } else {
            cutSingleVideoFileToClips();
        }
        Iterator<Clip> it = this.mClipList.iterator();
        while (it.hasNext()) {
            updateSpeedInfoToClips(it.next());
        }
        updateTimelineToClips();
    }

    private boolean updateCurrentAudioFrameProvider() {
        int i11;
        if (this.mCurrentAudioFrameProvider != null) {
            return true;
        }
        if (this.mAudioHandler == null) {
            HandlerThread handlerThread = new HandlerThread("Audio-File-Provider");
            handlerThread.start();
            this.mAudioHandler = new CustomHandler(handlerThread.getLooper());
        }
        if (isImageSource() && this.mCurrentAudioClipIndex == 0) {
            this.mCurrentAudioFrameProvider = createMuteAudioProvider();
            return true;
        }
        if (this.mCurrentAudioClipIndex >= this.mClipList.size() || (i11 = this.mCurrentAudioClipIndex) < 0) {
            return false;
        }
        if (this.mIsSplitScreenMode) {
            this.mCurrentAudioFrameProvider = new UGCMultiFileAudioFrameProvider(this.mClipList, this.mDurationControlMode, this.mAudioHandler);
            this.mCurrentAudioClipIndex = this.mClipList.size();
        } else {
            this.mCurrentAudioFrameProvider = new UGCSingleFileAudioFrameProvider(this.mClipList.get(i11), this.mAudioHandler);
        }
        this.mCurrentAudioFrameProvider.initialize();
        this.mCurrentAudioFrameProvider.start();
        if (this.mAudioSeekTimeInClip == 0) {
            this.mAudioSeekTimeInClip = Long.MIN_VALUE;
        }
        return true;
    }

    private boolean updateCurrentPixelFrameProvider() {
        int i11;
        if (this.mCurrentPixelFrameProvider != null) {
            return true;
        }
        if (isImageSource() && this.mCurrentVideoClipIndex == 0) {
            this.mCurrentPixelFrameProvider = createImageProvider();
            return true;
        }
        if (this.mCurrentVideoClipIndex >= this.mClipList.size() || (i11 = this.mCurrentVideoClipIndex) < 0) {
            return false;
        }
        if (this.mIsSplitScreenMode) {
            this.mCurrentPixelFrameProvider = createVideoFileProvider(0, true);
            this.mCurrentVideoClipIndex = this.mClipList.size();
        } else {
            if (i11 == this.mNextVideoClipIndex) {
                this.mCurrentPixelFrameProvider = this.mNextPixelFrameProvider;
                this.mNextPixelFrameProvider = null;
            }
            if (this.mCurrentPixelFrameProvider == null) {
                this.mCurrentPixelFrameProvider = createVideoFileProvider(i11, false);
            }
            removeRunnable(RunnableC35644em.m79140a(this));
            runOnWorkThread(RunnableC35657eo.m79151a(this), 500);
        }
        return true;
    }

    private void updateSpeedInfoToClips(Clip clip) {
        List<TXVideoEditConstants.TXSpeed> list = this.mSpeedList;
        if (list == null || list.isEmpty()) {
            return;
        }
        Collections.sort(this.mSpeedList, C35663eu.m79157a());
        ArrayList arrayList = new ArrayList();
        long j11 = clip.startInFileTime;
        for (TXVideoEditConstants.TXSpeed tXSpeed : this.mSpeedList) {
            long j12 = tXSpeed.startTime;
            long j13 = clip.startInSourceListTimeline;
            long j14 = j12 - j13;
            long j15 = tXSpeed.endTime - j13;
            if (j15 >= clip.startInFileTime) {
                long j16 = clip.endInFileTime;
                if (j14 > j16 || j11 >= j16) {
                    break;
                }
                if (j14 > j11) {
                    arrayList.add(createTXSpeed(j11, j14, 2));
                    j11 = j14;
                }
                TXVideoEditConstants.TXSpeed tXSpeedCreateTXSpeed = createTXSpeed(j11, j15, tXSpeed.speedLevel);
                long j17 = tXSpeedCreateTXSpeed.endTime;
                long j18 = clip.endInFileTime;
                if (j17 > j18) {
                    tXSpeedCreateTXSpeed.endTime = j18;
                }
                arrayList.add(tXSpeedCreateTXSpeed);
                j11 = tXSpeedCreateTXSpeed.endTime;
            }
        }
        long j19 = clip.endInFileTime;
        if (j11 != j19) {
            arrayList.add(createTXSpeed(j11, j19, 2));
        }
        clip.speedList = arrayList;
    }

    private void updateTimelineToClips() {
        long clipDuration = 0;
        long j11 = 0;
        for (Clip clip : this.mClipList) {
            clip.startInClipsTimeline = clipDuration;
            clip.startTimelineNoSpeed = j11;
            if (!this.mIsSplitScreenMode) {
                clipDuration += getClipDuration(clip);
                j11 += clip.endInFileTime - clip.startInFileTime;
            }
        }
    }

    public long getDuration() {
        FutureTask<Long> futureTask = this.mCalculateDurationTask;
        if (futureTask == null) {
            futureTask = new FutureTask<>(CallableC35659eq.m79153a(this));
        }
        Long l11 = 0L;
        try {
            l11 = futureTask.get(estimateSourceOpenTime(), TimeUnit.MILLISECONDS);
        } catch (Exception e11) {
            LiteavLog.m76093w(this.mTAG, "getDuration future task exception: ".concat(String.valueOf(e11)));
        }
        return l11.longValue();
    }

    public boolean hasAudioData() throws ExecutionException, InterruptedException, TimeoutException {
        FutureTask<Boolean> futureTask = this.mHasAudioDataTask;
        if (futureTask == null) {
            return false;
        }
        Boolean bool = Boolean.FALSE;
        try {
            bool = futureTask.get(estimateSourceOpenTime(), TimeUnit.MILLISECONDS);
        } catch (Exception e11) {
            LiteavLog.m76093w(this.mTAG, "hasAudioData future exception ".concat(String.valueOf(e11)));
        }
        return bool.booleanValue();
    }

    public void impreciseSeekTo(long j11) {
        LiteavLog.m76087i(this.mTAG, "impreciseSeekTo lineTime = ".concat(String.valueOf(j11)));
        seekTo(j11, false);
    }

    public void initialize() {
        LiteavLog.m76087i(this.mTAG, "initialize");
        synchronized (this) {
            try {
                if (this.mWorkHandler != null) {
                    LiteavLog.m76093w(this.mTAG, "UGCMediaStreamSpliter is initialized");
                    return;
                }
                HandlerThread handlerThread = new HandlerThread("ugc-media-list-source");
                handlerThread.start();
                this.mWorkHandler = new CustomHandler(handlerThread.getLooper());
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void setDurationControlMode(TXVideoJoiner.DurationControlMode durationControlMode) {
        LiteavLog.m76087i(this.mTAG, "set duration control mode " + this.mDurationControlMode);
        FutureTask<Long> futureTask = new FutureTask<>(CallableC35664ev.m79158a(this));
        this.mCalculateDurationTask = futureTask;
        runOnWorkThread(RunnableC35665ew.m79159a(this, durationControlMode, futureTask));
    }

    public void setIsSplitScreenMode(boolean z11) {
        LiteavLog.m76087i(this.mTAG, "Set split screen mode is ".concat(String.valueOf(z11)));
        FutureTask<Long> futureTask = new FutureTask<>(CallableC35666ex.m79160a(this));
        this.mCalculateDurationTask = futureTask;
        this.mCountOfPendingResetInputData.incrementAndGet();
        runOnWorkThread(RunnableC35623ds.m79119a(this, z11, futureTask));
    }

    public void setMaxFrameSize(int i11) {
        this.mMaxBufferFrame = i11;
        UGCPixelFrameProvider uGCPixelFrameProvider = this.mCurrentPixelFrameProvider;
        if (uGCPixelFrameProvider != null) {
            uGCPixelFrameProvider.setMaxBufferFrameCount(i11);
        }
    }

    public void setNeedAudioSource(boolean z11) {
        this.mNeedAudioSource = z11;
    }

    public void setPictureList(List<Bitmap> list, int i11) {
        LiteavLog.m76087i(this.mTAG, "setPictureList bitmapList size = " + list.size() + " fps = " + i11);
        this.mCountOfPendingResetInputData.incrementAndGet();
        runOnWorkThread(RunnableC35626dv.m79122a(this, list, i11));
    }

    public void setPictureTransition(int i11) {
        LiteavLog.m76087i(this.mTAG, "setPictureTransition type = ".concat(String.valueOf(i11)));
        FutureTask<Long> futureTask = new FutureTask<>(CallableC35627dw.m79123a(this));
        this.mCalculateDurationTask = futureTask;
        this.mCountOfPendingResetInputData.incrementAndGet();
        runOnWorkThread(RunnableC35628dx.m79124a(this, i11, futureTask));
    }

    public void setRepeatPlay(List<TXVideoEditConstants.TXRepeat> list) {
        LiteavLog.m76087i(this.mTAG, "setRepeatPlay");
        FutureTask<Long> futureTask = new FutureTask<>(CallableC35635ed.m79131a(this));
        this.mCalculateDurationTask = futureTask;
        this.mCountOfPendingResetInputData.incrementAndGet();
        runOnWorkThread(RunnableC35636ee.m79132a(this, list, futureTask));
    }

    public void setReverse(boolean z11) {
        LiteavLog.m76087i(this.mTAG, "setReverse isReverse = ".concat(String.valueOf(z11)));
        if (z11 == this.mIsReverse) {
            return;
        }
        this.mCountOfPendingResetInputData.incrementAndGet();
        runOnWorkThread(RunnableC35637ef.m79133a(this, z11));
    }

    public void setSpeedList(List<TXVideoEditConstants.TXSpeed> list) {
        LiteavLog.m76087i(this.mTAG, "setSpeedList");
        FutureTask<Long> futureTask = new FutureTask<>(CallableC35638eg.m79134a(this));
        this.mCalculateDurationTask = futureTask;
        this.mCountOfPendingResetInputData.incrementAndGet();
        runOnWorkThread(RunnableC35639eh.m79135a(this, list, futureTask));
    }

    public void setVideoSourceRange(long j11, long j12) {
        LiteavLog.m76087i(this.mTAG, "setVideoSourceRange startTime = " + j11 + " endTime = " + j12);
        FutureTask<Long> futureTask = new FutureTask<>(CallableC35624dt.m79120a(this));
        this.mCalculateDurationTask = futureTask;
        this.mCountOfPendingResetInputData.incrementAndGet();
        runOnWorkThread(RunnableC35625du.m79121a(this, j11, j12, futureTask));
    }

    public void setVideoSources(List<String> list) {
        LiteavLog.m76087i(this.mTAG, "setVideoSources");
        FutureTask<Boolean> futureTask = new FutureTask<>(CallableC35634ec.m79130a(this));
        this.mHasAudioDataTask = futureTask;
        FutureTask<Long> futureTask2 = new FutureTask<>(CallableC35645en.m79141a(this));
        this.mCalculateDurationTask = futureTask2;
        this.mCountOfPendingResetInputData.incrementAndGet();
        runOnWorkThread(RunnableC35661es.m79155a(this, list, futureTask, futureTask2));
    }

    public void uninitialize() {
        LiteavLog.m76087i(this.mTAG, "unInitialize");
        runOnWorkThread(RunnableC35622dr.m79118a(this));
    }

    public UGCMediaListSource(InterfaceC35480b interfaceC35480b) {
        this.mListener = interfaceC35480b;
    }

    private void adjustAudioFrameTimestamp(List<AudioFrame> list) {
        if (CollectionUtils.isEmpty(list)) {
            return;
        }
        AudioFrame audioFrame = list.get(0);
        long jCalculateAudioFrameDuration = calculateAudioFrameDuration(audioFrame);
        if (this.mLastAudioFrameTimestamp != -1) {
            long timestamp = audioFrame.getTimestamp();
            long j11 = this.mLastAudioFrameTimestamp;
            if (timestamp < j11 + jCalculateAudioFrameDuration) {
                if (jCalculateAudioFrameDuration <= 0) {
                    jCalculateAudioFrameDuration = 1;
                }
                long j12 = j11 + jCalculateAudioFrameDuration;
                this.mLastAudioFrameTimestamp = j12;
                audioFrame.setTimestamp(j12);
                return;
            }
        }
        this.mLastAudioFrameTimestamp = audioFrame.getTimestamp();
    }

    private void adjustPixelFrameTimestamp(List<PixelFrame> list) {
        if (CollectionUtils.isEmpty(list)) {
            return;
        }
        PixelFrame pixelFrame = list.get(0);
        if (this.mLastVideoFrameTimestamp != -1) {
            long timestamp = pixelFrame.getTimestamp();
            long j11 = this.mLastVideoFrameTimestamp;
            if (timestamp <= j11) {
                long j12 = j11 + 1;
                this.mLastVideoFrameTimestamp = j12;
                pixelFrame.setTimestamp(j12);
                return;
            }
        }
        this.mLastVideoFrameTimestamp = pixelFrame.getTimestamp();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long calculateTotalDurationOfClips() {
        long jMin;
        if (isImageSource()) {
            return getImageDuration();
        }
        if (this.mIsSplitScreenMode) {
            if (this.mDurationControlMode == TXVideoJoiner.DurationControlMode.ALIGNS_TO_LONGEST) {
                jMin = getMaxClipDuration(this.mClipList);
            } else {
                jMin = getMinClipDuration(this.mClipList);
            }
        } else {
            Iterator<Clip> it = this.mClipList.iterator();
            long clipDuration = 0;
            while (it.hasNext()) {
                clipDuration += getClipDuration(it.next());
            }
            jMin = Math.min(this.mSourceRangeEnd - this.mSourceRangeStart, clipDuration);
        }
        LiteavLog.m76087i(this.mTAG, "total duration is:".concat(String.valueOf(jMin)));
        return jMin;
    }

    private void clearFrameQueue() {
        clearVideoFrameQueue();
        this.mAudioFrameListQueue.clear();
    }

    private long getImageDuration() {
        if (!isImageSource() || !updateCurrentPixelFrameProvider()) {
            return 0L;
        }
        UGCPixelFrameProvider uGCPixelFrameProvider = this.mCurrentPixelFrameProvider;
        if (!(uGCPixelFrameProvider instanceof UGCImageProvider)) {
            return 0L;
        }
        return ((UGCImageProvider) uGCPixelFrameProvider).getDuration();
    }

    private long getMaxClipDuration(List<Clip> list) {
        long clipDuration = 0;
        for (Clip clip : list) {
            if (clipDuration < getClipDuration(clip)) {
                clipDuration = getClipDuration(clip);
            }
        }
        return clipDuration;
    }

    private long getMinClipDuration(List<Clip> list) {
        long clipDuration = 2147483647L;
        for (Clip clip : list) {
            if (clipDuration > getClipDuration(clip)) {
                clipDuration = getClipDuration(clip);
            }
        }
        return clipDuration;
    }

    public static /* synthetic */ void lambda$clearVideoFrameQueue$20(UGCMediaListSource uGCMediaListSource, List list) {
        uGCMediaListSource.ensureEGLCoreCreated();
        if (EGLCore.makeCurrent(uGCMediaListSource.mEGLCore)) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                PixelFrame.releasePixelFrames((List) it.next());
            }
        }
    }

    public static /* synthetic */ void lambda$setPictureList$6(UGCMediaListSource uGCMediaListSource, List list, int i11) {
        uGCMediaListSource.resetReadPositionInternal();
        uGCMediaListSource.mClipList.clear();
        uGCMediaListSource.mBitmapList = list;
        uGCMediaListSource.mFps = i11;
        uGCMediaListSource.mCountOfPendingResetInputData.decrementAndGet();
    }

    public static /* synthetic */ void lambda$setPictureTransition$7(UGCMediaListSource uGCMediaListSource, int i11, FutureTask futureTask) {
        uGCMediaListSource.resetReadPositionInternal();
        uGCMediaListSource.mTransitionType = i11;
        uGCMediaListSource.updateCurrentPixelFrameProvider();
        futureTask.run();
        uGCMediaListSource.mCountOfPendingResetInputData.decrementAndGet();
    }

    public static /* synthetic */ void lambda$setVideoSources$0(UGCMediaListSource uGCMediaListSource, List list, FutureTask futureTask, FutureTask futureTask2) {
        uGCMediaListSource.setVideoSourcesInternal(list);
        futureTask.run();
        futureTask2.run();
        uGCMediaListSource.mCountOfPendingResetInputData.decrementAndGet();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void prePareNextUGCPixelFrameProvider() {
        int i11;
        closeNextPixelFrameProvider();
        if (this.mIsReverse) {
            this.mNextVideoClipIndex = this.mCurrentVideoClipIndex - 1;
        } else {
            this.mNextVideoClipIndex = this.mCurrentVideoClipIndex + 1;
        }
        if (this.mNextVideoClipIndex < this.mClipList.size() && (i11 = this.mNextVideoClipIndex) >= 0) {
            this.mNextPixelFrameProvider = createVideoFileProvider(i11, false);
        }
    }

    private boolean putPixFrameToQueue(List<PixelFrame> list) {
        if (isResettingInputData()) {
            PixelFrame.releasePixelFrames(list);
            return false;
        }
        this.mPixelFrameListQueue.queue(list);
        return true;
    }

    private void resetReadPositionInternal() {
        int size;
        clearFrameQueue();
        clearTailPixelFrameQueue();
        closeCurrentPixelFrameProvider();
        closeCurrentAudioFrameProvider();
        if (this.mIsReverse) {
            size = this.mClipList.size() - 1;
        } else {
            size = 0;
        }
        this.mCurrentVideoClipIndex = size;
        this.mCurrentAudioClipIndex = 0;
        this.mVideoSeekTimeInClip = Long.MIN_VALUE;
        this.mAudioSeekTimeInClip = Long.MIN_VALUE;
        this.mLastAudioFrameTimestamp = -1L;
        this.mLastVideoFrameTimestamp = -1L;
    }

    private void seekTo(long j11, boolean z11) {
        if (j11 < 0) {
            return;
        }
        this.mPendingSeekTime.set(Long.valueOf(j11));
        runOnWorkThread(RunnableC35633eb.m79129a(this, z11));
    }

    private void setVideoSourcesInternal(List<String> list) {
        resetReadPositionInternal();
        this.mSources = list;
        this.mMediaInfoList.clear();
        clearFrameQueue();
        this.mTotalDuration = 0L;
        for (String str : list) {
            C35479a mediaInfo = getMediaInfo(str);
            LiteavLog.m76087i(this.mTAG, str + " get media Info. duration = " + mediaInfo.f76696b);
            long j11 = this.mTotalDuration;
            mediaInfo.f76695a = j11;
            mediaInfo.f76699e = str;
            this.mTotalDuration = j11 + mediaInfo.f76696b;
            this.mMediaInfoList.add(mediaInfo);
        }
        this.mSourceRangeStart = 0L;
        this.mSourceRangeEnd = this.mTotalDuration;
        updateClipsInfo();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void uninitializeInternal() {
        clearFrameQueue();
        clearTailPixelFrameQueue();
        closeCurrentPixelFrameProvider();
        closeNextPixelFrameProvider();
        closeCurrentAudioFrameProvider();
        CustomHandler customHandler = this.mVideoHandler;
        if (customHandler != null) {
            customHandler.quitLooper();
            this.mVideoHandler = null;
        }
        CustomHandler customHandler2 = this.mAudioHandler;
        if (customHandler2 != null) {
            customHandler2.quitLooper();
            this.mAudioHandler = null;
        }
        EGLCore.destroy(this.mEGLCore);
        this.mEGLCore = null;
        this.mClipList.clear();
        this.mMediaInfoList.clear();
        this.mSources = null;
        this.mRepeatList = null;
        this.mSpeedList = null;
        this.mSourceRangeStart = 0L;
        this.mSourceRangeEnd = 2147483647L;
        this.mCurrentVideoClipIndex = 0;
        this.mCurrentAudioClipIndex = 0;
        this.mVideoSeekTimeInClip = Long.MIN_VALUE;
        this.mAudioSeekTimeInClip = Long.MIN_VALUE;
        this.mLastAudioFrameTimestamp = -1L;
        this.mLastVideoFrameTimestamp = -1L;
        this.mIsReverse = false;
        this.mNextVideoClipIndex = 0;
        CustomHandler customHandler3 = this.mWorkHandler;
        if (customHandler3 != null) {
            customHandler3.quitLooper();
            this.mWorkHandler = null;
        }
    }

    public boolean putAudioFrameToQueue(List<AudioFrame> list) {
        if (isResettingInputData()) {
            return false;
        }
        this.mAudioFrameListQueue.queue(list);
        return true;
    }

    public List<AudioFrame> readNextAudioFrame() {
        if (isResettingInputData()) {
            this.mAudioFrameListQueue.clear();
        }
        runOnWorkThread(RunnableC35629dy.m79125a(this));
        return this.mAudioFrameListQueue.dequeue();
    }

    public List<PixelFrame> readNextVideoFrame() {
        if (isResettingInputData()) {
            clearVideoFrameQueue();
        }
        runOnWorkThread(RunnableC35630dz.m79126a(this));
        return this.mPixelFrameListQueue.dequeue();
    }

    public void setPlayEndTime(long j11) {
        runOnWorkThread(RunnableC35632ea.m79128a(this, j11));
    }

    public void setTailWaterMarkDurationSecond(int i11) {
        runOnWorkThread(RunnableC35658ep.m79152a(this, i11));
    }

    /* JADX INFO: renamed from: com.tencent.ugc.UGCMediaListSource$a */
    public static class C35479a {

        /* JADX INFO: renamed from: a */
        public long f76695a;

        /* JADX INFO: renamed from: b */
        public long f76696b;

        /* JADX INFO: renamed from: c */
        public boolean f76697c;

        /* JADX INFO: renamed from: d */
        public float f76698d;

        /* JADX INFO: renamed from: e */
        public String f76699e;

        /* JADX INFO: renamed from: f */
        public String f76700f;

        private C35479a() {
            this.f76695a = 0L;
            this.f76696b = 0L;
            this.f76697c = false;
            this.f76698d = 25.0f;
        }

        public /* synthetic */ C35479a(byte b11) {
            this();
        }
    }
}
