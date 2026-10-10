package com.tencent.ugc;

import android.content.Context;
import android.graphics.Bitmap;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.os.Looper;
import android.text.TextUtils;
import android.view.TextureView;
import android.widget.FrameLayout;
import androidx.media3.exoplayer.audio.SilenceSkippingAudioProcessor;
import com.tencent.bugly.proguard.C33627eb;
import com.tencent.liteav.base.ContextUtils;
import com.tencent.liteav.base.util.C34741f;
import com.tencent.liteav.base.util.C34743h;
import com.tencent.liteav.base.util.C34748m;
import com.tencent.liteav.base.util.CommonUtil;
import com.tencent.liteav.base.util.CustomHandler;
import com.tencent.liteav.base.util.EnumC34747l;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.liteav.base.util.Size;
import com.tencent.liteav.videobase.base.GLConstants;
import com.tencent.liteav.videobase.common.EnumC34876d;
import com.tencent.liteav.videobase.videobase.DisplayTarget;
import com.tencent.ugc.common.MediaExtractorBuilder;
import com.tencent.ugc.common.UGCTranscodeAudioEncodeParamsDecider;
import com.tencent.ugc.common.UGCTranscodeVideoEncodeParamsDecider;
import com.tencent.ugc.datereport.UGCDataReport;
import com.tencent.ugc.datereport.UGCDataReportDef;
import com.tencent.ugc.encoder.UGCVideoEncoderJNI;
import com.tencent.ugc.encoder.VideoEncodeParams;
import com.tencent.ugc.retriver.FFmpegMediaRetriever;
import com.tencent.ugc.videobase.common.EncodedVideoFrame;
import com.tencent.ugc.videobase.utils.CollectionUtils;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public class TXVideoEditer {
    private static final String AIGC_METADATA_KEY = "AIGC";
    private static final long MIN_SEEK_DIR = 100;
    private static final String TAG = "TXVideoEditer";
    private static final int WAIT_FOR_THUMBNAIL_TIMEOUT = 500;
    private static final HashSet<String> sVideoExtHashSet = new HashSet<>(Arrays.asList("3gpp", "3gp", "3g2", "m4v", "mpeg", "mpg", "mpe", "mp4", "vob", "qt", "mov", "wmv", "avi", "mkv"));
    private final UGCAVSyncer mAVSyncer;
    private final ArrayList<UGCThumbnailGenerator> mAllThumbnailGeneratorList;
    private int mAudioEncodeBitrate;
    private AudioEncodeParams mAudioEncodeParams;
    private UGCAudioProcessor.AudioEncodedFrameListener mAudioEncodedFrameListener;
    private List<MediaFormat> mAudioFormatList;
    private final UGCAudioProcessor mAudioProcessor;
    private MediaFormat mBGMFormat;
    private Size mCanvasSize;
    private CombineFilterInfo mCombineFilterInfo;
    private final Context mContext;
    private long mCutEndTimeMs;
    private long mCutStartTimeMs;
    private int mEncodeProfile;
    private FrameLayout mFrameLayout;
    private boolean mHasBGM;
    private final AtomicBoolean mHasNotifyProcessComplete;
    private boolean mIsAudioEncoderStarted;
    private boolean mIsDecodeError;
    private boolean mIsEncodeError;
    private boolean mIsFullIFrame;
    private boolean mIsGenerateAudioEnd;
    private boolean mIsGenerateVideoEnd;
    private boolean mIsGenerating;
    private boolean mIsPlaying;
    private boolean mIsProcessToFullKeyFrame;
    private final AtomicBoolean mIsRelease;
    private boolean mIsReverse;
    private boolean mIsVideoEncoderStarted;
    private float mLastVideoEncodeProgress;
    private final CustomHandler mMainHandler;
    private final UGCMediaListSource mMediaListSource;
    private final UGCMediaListSource.InterfaceC35480b mMediaListSourceListener;
    private Map<String, String> mMetaData;
    private MP4Writer mMp4Writer;
    private final MP4Writer.MP4WriterListener mMp4WriterListener;
    private boolean mNeedWaitProcessFullI;
    private boolean mNeedWaitThumbnailProcess;
    private UGCVideoProcessor.VideoProcessListener mOnPlayProgressListener;
    private final AtomicReference<Long> mPendingPreviewAtTime;
    private UGCAVSyncer.SyncMode mPreviewSyncMode;
    private String mProcessOutputPath;
    private UGCThumbnailGenerator.UGCThumbnailGenerateParams mProcessThumbnailInfo;
    private TXThumbnailListener mProcessThumbnailListener;
    private String mRecordOutputPath;
    private EnumC34747l mRotation;
    private Runnable mRunnableOnPlayComplete;
    protected final C34748m mSequenceTaskRunner;
    private String mSourcePath;
    private long mSourceRangeEndTimeMs;
    private long mSourceRangeStartTimeMs;
    private final AtomicReference<Long> mTargetSeekPts;
    private int mVideoEncodeBitrate;
    private VideoEncodeParams mVideoEncodeParams;
    private UGCVideoProcessor.VideoEncodedFrameListener mVideoEncodedFrameListener;
    private List<MediaFormat> mVideoFormatList;
    private TXVideoEditConstants.VideoFrameRateLevel mVideoFrameRateLevel;
    private TXVideoGenerateListener mVideoGenerateListener;
    private TXVideoPreviewListener mVideoPreviewListener;
    private TXVideoProcessListener mVideoProcessListener;
    private final UGCVideoProcessor mVideoProcessor;
    private List<String> mVideoSourceList;

    /* JADX INFO: renamed from: com.tencent.ugc.TXVideoEditer$2 */
    public class C354702 implements UGCVideoProcessor.VideoEncodedFrameListener {
        /* JADX INFO: renamed from: a */
        public static /* synthetic */ void m78967a(C354702 c354702, EncodedVideoFrame encodedVideoFrame) {
            if (TXVideoEditer.this.mIsVideoEncoderStarted) {
                TXVideoEditer.this.onVideoEncodedFrame(encodedVideoFrame);
            }
        }

        public C354702() {
        }

        @Override // com.tencent.ugc.UGCVideoProcessor.VideoEncodedFrameListener
        public final void onVideoEncodeStarted() {
            TXVideoEditer.this.mSequenceTaskRunner.mo76133a(RunnableC35556cb.m79055a(this));
        }

        @Override // com.tencent.ugc.UGCVideoProcessor.VideoEncodedFrameListener
        public final void onVideoEncodingCompleted() {
            TXVideoEditer.this.mSequenceTaskRunner.mo76133a(RunnableC35558cd.m79057a(this));
        }

        @Override // com.tencent.ugc.UGCVideoProcessor.VideoEncodedFrameListener
        public final void onVideoFrameEncoded(EncodedVideoFrame encodedVideoFrame) {
            if (encodedVideoFrame == null) {
                LiteavLog.m76093w(TXVideoEditer.TAG, "onVideoEncodedFrame frame is null.");
            } else {
                TXVideoEditer.this.mSequenceTaskRunner.mo76133a(RunnableC35557cc.m79056a(this, encodedVideoFrame));
            }
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ void m78965a(C354702 c354702) {
            if (TXVideoEditer.this.mIsVideoEncoderStarted) {
                TXVideoEditer.this.onVideoEncodedFrameComplete();
            }
        }

        @Override // com.tencent.ugc.UGCVideoProcessor.VideoEncodedFrameListener
        public final void onEncodedFail(UGCVideoEncoderJNI.EncoderType encoderType, UGCVideoEncoderJNI.VideoEncoderError videoEncoderError) {
            LiteavLog.m76087i(TXVideoEditer.TAG, "on encoded fail. encoderType is ".concat(String.valueOf(encoderType)));
            TXVideoEditer.this.mSequenceTaskRunner.mo76133a(RunnableC35559ce.m79058a(this, encoderType, videoEncoderError));
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ void m78966a(C354702 c354702, UGCVideoEncoderJNI.EncoderType encoderType, UGCVideoEncoderJNI.VideoEncoderError videoEncoderError) {
            if (TXVideoEditer.this.mIsVideoEncoderStarted) {
                TXVideoEditer.this.onVideoEncodedFail(encoderType, videoEncoderError);
            }
        }
    }

    /* JADX INFO: renamed from: com.tencent.ugc.TXVideoEditer$3 */
    public class C354713 implements UGCAudioProcessor.AudioEncodedFrameListener {
        /* JADX INFO: renamed from: a */
        public static /* synthetic */ void m78970a(C354713 c354713, AudioFrame audioFrame) {
            if (TXVideoEditer.this.mIsAudioEncoderStarted) {
                TXVideoEditer.this.onAudioEncodedFrame(audioFrame);
            }
        }

        public C354713() {
        }

        /* JADX INFO: renamed from: b */
        public static /* synthetic */ void m78971b(C354713 c354713) {
            LiteavLog.m76087i(TXVideoEditer.TAG, "on audioEncoding started");
            TXVideoEditer.this.mIsAudioEncoderStarted = true;
        }

        @Override // com.tencent.ugc.UGCAudioProcessor.AudioEncodedFrameListener
        public final void onAudioEncodingCompleted() {
            TXVideoEditer.this.mSequenceTaskRunner.mo76133a(RunnableC35562ch.m79061a(this));
        }

        @Override // com.tencent.ugc.UGCAudioProcessor.AudioEncodedFrameListener
        public final void onAudioEncodingStarted() {
            TXVideoEditer.this.mSequenceTaskRunner.mo76133a(RunnableC35560cf.m79059a(this));
        }

        @Override // com.tencent.ugc.UGCAudioProcessor.AudioEncodedFrameListener
        public final void onAudioFrameEncoded(AudioFrame audioFrame) {
            if (audioFrame == null) {
                LiteavLog.m76093w(TXVideoEditer.TAG, "onAudioEncodedFrame frame is null.");
            } else {
                TXVideoEditer.this.mSequenceTaskRunner.mo76133a(RunnableC35561cg.m79060a(this, audioFrame));
            }
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ void m78969a(C354713 c354713) {
            if (TXVideoEditer.this.mIsAudioEncoderStarted) {
                TXVideoEditer.this.onAudioEncodedFrameComplete();
            }
        }
    }

    /* JADX INFO: renamed from: com.tencent.ugc.TXVideoEditer$4 */
    public class C354724 implements UGCVideoProcessor.VideoProcessListener {
        public C354724() {
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ void m78972a(C354724 c354724, long j11) {
            long duration = j11 * 1000;
            if (TXVideoEditer.this.mIsReverse) {
                duration = (TXVideoEditer.this.mMediaListSource.getDuration() * 1000) - duration;
            }
            TXVideoEditer.this.notifyPreviewProgress((int) C34743h.m76116a(duration, 0L, TXVideoEditer.this.mMediaListSource.getDuration() * 1000));
        }

        @Override // com.tencent.ugc.UGCVideoProcessor.VideoProcessListener
        public final void onComplete(TXVideoEditConstants.TXGenerateResult tXGenerateResult) {
            if (tXGenerateResult != null) {
                LiteavLog.m76087i(TXVideoEditer.TAG, "on video progress complete: retCode= " + tXGenerateResult.retCode + ", descMsg= " + tXGenerateResult.descMsg);
            }
            TXVideoEditer tXVideoEditer = TXVideoEditer.this;
            tXVideoEditer.mSequenceTaskRunner.mo76133a(tXVideoEditer.mRunnableOnPlayComplete);
        }

        @Override // com.tencent.ugc.UGCVideoProcessor.VideoProcessListener
        public final void onProgress(long j11) {
            TXVideoEditer.this.mSequenceTaskRunner.mo76133a(RunnableC35563ci.m79062a(this, j11));
        }
    }

    /* JADX INFO: renamed from: com.tencent.ugc.TXVideoEditer$5 */
    public class C354735 implements UGCMediaListSource.InterfaceC35480b {
        public C354735() {
        }

        @Override // com.tencent.ugc.UGCMediaListSource.InterfaceC35480b
        /* JADX INFO: renamed from: a */
        public final void mo78973a() {
            LiteavLog.m76087i(TXVideoEditer.TAG, "on decode fail");
            TXVideoEditer.this.mSequenceTaskRunner.mo76133a(RunnableC35564cj.m79063a(this));
        }
    }

    public interface TXPCMCallbackListener {
        TXAudioFrame onPCMCallback(TXAudioFrame tXAudioFrame);
    }

    public interface TXThumbnailListener {
        void onThumbnail(int i11, long j11, Bitmap bitmap);
    }

    public interface TXVideoCustomProcessListener {
        int onTextureCustomProcess(int i11, int i12, int i13, long j11);

        void onTextureDestroyed();
    }

    public interface TXVideoGenerateListener {
        void onGenerateComplete(TXVideoEditConstants.TXGenerateResult tXGenerateResult);

        void onGenerateProgress(float f11);
    }

    public interface TXVideoPreviewListener {
        void onPreviewFinished();

        void onPreviewProgress(int i11);
    }

    public interface TXVideoPreviewListenerEx extends TXVideoPreviewListener {
        void onPreviewError(TXVideoEditConstants.TXPreviewError tXPreviewError);
    }

    public interface TXVideoProcessListener {
        void onProcessComplete(TXVideoEditConstants.TXGenerateResult tXGenerateResult);

        void onProcessProgress(float f11);
    }

    public TXVideoEditer(Context context) {
        this(context, new C34748m());
        LiteavLog.m76087i(TAG, "version:" + CommonUtil.getSDKVersionStr());
    }

    public void getThumbnail(List<Long> list, int i11, int i12, boolean z11, TXThumbnailListener tXThumbnailListener) {
        this.mSequenceTaskRunner.mo76133a(RunnableC35493ae.m78994a(this, list, i11, i12, z11, tXThumbnailListener));
    }

    public void setFilter(Bitmap bitmap) {
        if (!UGCLicenseChecker.isStandardFunctionSupport() && !UGCLicenseChecker.isIMPluginFunctionSupport()) {
            LiteavLog.m76083e(TAG, "setFilter is not supported in UGSV_Lite license");
        } else {
            UGCDataReport.reportDAU(1023);
            this.mSequenceTaskRunner.mo76133a(RunnableC35545br.m79044a(this, bitmap));
        }
    }

    public boolean setTransitionEffect(int i11, long j11, long j12) {
        return setTransitionEffect(i11, j12, j11, 1000L);
    }

    private float calculateProgress(long j11) {
        long duration = this.mMediaListSource.getDuration();
        if (duration == 0) {
            duration = 1;
        }
        return (j11 * 1.0f) / duration;
    }

    private void cancelAllThumbnailGenerator() {
        if (this.mAllThumbnailGeneratorList.size() <= 0) {
            return;
        }
        for (UGCThumbnailGenerator uGCThumbnailGenerator : this.mAllThumbnailGeneratorList) {
            uGCThumbnailGenerator.stop();
            uGCThumbnailGenerator.uninitialize();
        }
        this.mAllThumbnailGeneratorList.clear();
    }

    private void doStopPlayInner() {
        LiteavLog.m76087i(TAG, "doStopPlayInner");
        this.mVideoProcessor.setProgressListener(null);
        this.mAudioProcessor.setProgressListener(null);
        this.mAVSyncer.stop();
        this.mVideoProcessor.stop();
        this.mAudioProcessor.stop();
        this.mIsPlaying = false;
    }

    private boolean filtInvalidatedFrame(long j11) {
        return this.mTargetSeekPts.get() != null && Math.abs(j11 - this.mTargetSeekPts.get().longValue()) > MIN_SEEK_DIR;
    }

    private String generateVideoPath() {
        File externalFilesDir = this.mContext.getExternalFilesDir(null);
        if (externalFilesDir == null) {
            LiteavLog.m76083e(TAG, "generateVideoPath getExternalFilesDir return null.");
            return null;
        }
        File file = new File(externalFilesDir + File.separator + "liteav");
        if (!file.exists()) {
            file.mkdirs();
        }
        String strValueOf = String.valueOf(System.currentTimeMillis() / 1000);
        return file + "/" + String.format("TXVideo_%s_process.mp4", new SimpleDateFormat("yyyyMMdd_HHmmss", Locale.US).format(new Date(Long.parseLong(strValueOf + "000"))));
    }

    private Map<String, String> getAIGCMetaData() {
        List<String> list = this.mVideoSourceList;
        if (list == null) {
            return null;
        }
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            Map<String, String> aIGCMetaDataFromVideoFile = getAIGCMetaDataFromVideoFile(it.next());
            if (aIGCMetaDataFromVideoFile != null && !aIGCMetaDataFromVideoFile.isEmpty()) {
                return aIGCMetaDataFromVideoFile;
            }
        }
        return null;
    }

    private Map<String, String> getAIGCMetaDataFromVideoFile(String str) {
        FFmpegMediaRetriever fFmpegMediaRetriever = new FFmpegMediaRetriever();
        fFmpegMediaRetriever.setDataSource(str);
        Map<String, String> fileMetaData = fFmpegMediaRetriever.getFileMetaData();
        if (fileMetaData == null) {
            return null;
        }
        HashMap map = new HashMap();
        for (String str2 : fileMetaData.keySet()) {
            if (AIGC_METADATA_KEY.equalsIgnoreCase(str2)) {
                map.put(str2, fileMetaData.get(str2));
                break;
            }
        }
        return map;
    }

    private void handleEncodedCompletedInner() {
        if (this.mIsGenerateAudioEnd && this.mIsGenerateVideoEnd) {
            LiteavLog.m76087i(TAG, "handleEncodedCompleted");
            this.mAVSyncer.stop();
            stopMp4Writer();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleProcessComplete(int i11) {
        TXVideoProcessListener tXVideoProcessListener;
        if (this.mHasNotifyProcessComplete.getAndSet(true) || (tXVideoProcessListener = this.mVideoProcessListener) == null) {
            return;
        }
        TXVideoEditConstants.TXGenerateResult tXGenerateResult = new TXVideoEditConstants.TXGenerateResult();
        tXGenerateResult.retCode = i11;
        tXGenerateResult.descMsg = "";
        tXVideoProcessListener.onProcessComplete(tXGenerateResult);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleThumbnailGeneratedDuringProcessing(UGCThumbnailGenerator uGCThumbnailGenerator, boolean z11, int i11, long j11, Bitmap bitmap) {
        TXVideoProcessListener tXVideoProcessListener;
        TXThumbnailListener tXThumbnailListener = this.mProcessThumbnailListener;
        if (tXThumbnailListener != null) {
            tXThumbnailListener.onThumbnail(i11, j11, bitmap);
        }
        int thumbnailCount = getThumbnailCount();
        if (thumbnailCount == i11) {
            LiteavLog.m76087i(TAG, "mInnerThumbnailListener: notifyProcessComplete");
            if (z11) {
                this.mProcessOutputPath = this.mSourcePath;
            }
            notifyProcessComplete(0, true);
            releaseThumbnailGenerator(uGCThumbnailGenerator);
        }
        if (!z11 || (tXVideoProcessListener = this.mVideoProcessListener) == null) {
            return;
        }
        this.mMainHandler.post(RunnableC35501am.m79002a(this, thumbnailCount, j11, i11, tXVideoProcessListener));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleWriteMP4Completed(int i11, long j11) {
        this.mSequenceTaskRunner.mo76133a(RunnableC35541bn.m79040a(this, i11, j11));
    }

    private int isBGMValid(String str) {
        FFmpegMediaRetriever fFmpegMediaRetriever = new FFmpegMediaRetriever(false);
        return (fFmpegMediaRetriever.setDataSource(str) != 0 || fFmpegMediaRetriever.getAudioDurationMs() <= 0) ? -1001 : 0;
    }

    private boolean isFullIFrame(String str) {
        MediaExtractor mediaExtractorBuild = new MediaExtractorBuilder().setPath(str).setMimeType("video/").build();
        if (mediaExtractorBuild == null) {
            LiteavLog.m76093w("ContentValues", "judgeFullIFrame: extractor is null.");
            return false;
        }
        mediaExtractorBuild.seekTo(0L, 0);
        int i11 = 0;
        for (int i12 = 0; i12 < 7; i12++) {
            if ((mediaExtractorBuild.getSampleFlags() & 1) == 1) {
                i11++;
            }
            mediaExtractorBuild.advance();
        }
        return i11 > 5;
    }

    private boolean isGopEqualOne(String str) {
        MediaExtractor mediaExtractorBuild = new MediaExtractorBuilder().setPath(str).setMimeType("video/").build();
        if (mediaExtractorBuild == null) {
            LiteavLog.m76093w(TAG, "extractor is null.");
            return false;
        }
        mediaExtractorBuild.seekTo(1L, 1);
        long sampleTime = mediaExtractorBuild.getSampleTime();
        mediaExtractorBuild.release();
        return sampleTime > SilenceSkippingAudioProcessor.DEFAULT_MINIMUM_SILENCE_DURATION_US && sampleTime < 1100000;
    }

    public static /* synthetic */ void lambda$cancel$55(TXVideoEditer tXVideoEditer) {
        LiteavLog.m76087i(TAG, "cancel");
        tXVideoEditer.mIsGenerating = false;
        tXVideoEditer.mIsVideoEncoderStarted = false;
        tXVideoEditer.mIsAudioEncoderStarted = false;
        tXVideoEditer.mIsProcessToFullKeyFrame = false;
        tXVideoEditer.mVideoProcessor.setVideoEncodedFrameListener(null);
        tXVideoEditer.mAudioProcessor.setAudioEncodedFrameListener(null);
        tXVideoEditer.mMediaListSource.setVideoSourceRange(0L, 2147483647L);
        tXVideoEditer.mMediaListSource.setTailWaterMarkDurationSecond(0);
        tXVideoEditer.cancelAllThumbnailGenerator();
        if (!tXVideoEditer.mIsPlaying) {
            tXVideoEditer.mAudioProcessor.stop();
            tXVideoEditer.mVideoProcessor.stop();
        }
        MP4Writer mP4Writer = tXVideoEditer.mMp4Writer;
        if (mP4Writer != null) {
            mP4Writer.setListener(null);
        }
        tXVideoEditer.stopMp4Writer();
    }

    public static /* synthetic */ void lambda$deleteAllEffect$30(TXVideoEditer tXVideoEditer) {
        LiteavLog.m76087i(TAG, "deleteAllEffect");
        tXVideoEditer.mVideoProcessor.getEffectProcessor().deleteAllEffect();
    }

    public static /* synthetic */ void lambda$deleteLastEffect$29(TXVideoEditer tXVideoEditer) {
        LiteavLog.m76087i(TAG, "deleteLastEffect");
        tXVideoEditer.mVideoProcessor.getEffectProcessor().deleteLastEffect();
    }

    public static /* synthetic */ void lambda$deleteLastTransitionEffect$26(TXVideoEditer tXVideoEditer) {
        LiteavLog.m76087i(TAG, "deleteLastTransitionEffect");
        tXVideoEditer.mVideoProcessor.getTransitionProcessor().deleteLastTransitionEffect();
    }

    public static /* synthetic */ void lambda$generateVideo$54(TXVideoEditer tXVideoEditer, int i11, String str) {
        LiteavLog.m76087i(TAG, "generateVideo: videoCompressed= " + i11 + ", videoOutputPath= " + str);
        if (!UGCLicenseChecker.isSimpleFunctionSupport() && !UGCLicenseChecker.isIMPluginFunctionSupport()) {
            TXVideoEditConstants.TXGenerateResult tXGenerateResult = new TXVideoEditConstants.TXGenerateResult();
            tXGenerateResult.retCode = -5;
            tXGenerateResult.descMsg = "licence verify failed";
            TXVideoGenerateListener tXVideoGenerateListener = tXVideoEditer.mVideoGenerateListener;
            if (tXVideoGenerateListener != null) {
                tXVideoGenerateListener.onGenerateComplete(tXGenerateResult);
                return;
            }
            return;
        }
        UGCTranscodeVideoEncodeParamsDecider uGCTranscodeVideoEncodeParamsDecider = new UGCTranscodeVideoEncodeParamsDecider();
        uGCTranscodeVideoEncodeParamsDecider.setFullIFrame(tXVideoEditer.mIsFullIFrame);
        uGCTranscodeVideoEncodeParamsDecider.setOutputResolution(i11);
        uGCTranscodeVideoEncodeParamsDecider.setEncodeRotation(tXVideoEditer.mRotation);
        uGCTranscodeVideoEncodeParamsDecider.setEncodeProfile(tXVideoEditer.mEncodeProfile);
        uGCTranscodeVideoEncodeParamsDecider.setInputCanvasSize(tXVideoEditer.mCanvasSize);
        uGCTranscodeVideoEncodeParamsDecider.setInputVideoMediaFormat(tXVideoEditer.mVideoFormatList);
        uGCTranscodeVideoEncodeParamsDecider.setEncodeFramerate(tXVideoEditer.mVideoFrameRateLevel);
        UGCTranscodeAudioEncodeParamsDecider uGCTranscodeAudioEncodeParamsDecider = new UGCTranscodeAudioEncodeParamsDecider();
        uGCTranscodeAudioEncodeParamsDecider.setInputAudioMediaFormat(tXVideoEditer.mAudioFormatList);
        uGCTranscodeAudioEncodeParamsDecider.setBGMMediaFormat(tXVideoEditer.mBGMFormat);
        int i12 = tXVideoEditer.mVideoEncodeBitrate;
        if (i12 != -1) {
            uGCTranscodeVideoEncodeParamsDecider.setEncodeBitrate(i12);
        }
        int i13 = tXVideoEditer.mAudioEncodeBitrate;
        if (i13 != -1) {
            uGCTranscodeAudioEncodeParamsDecider.setEncodeBitrate(i13);
        }
        tXVideoEditer.mVideoEncodeParams = uGCTranscodeVideoEncodeParamsDecider.getDecidedEncodeParams();
        if (uGCTranscodeVideoEncodeParamsDecider.isNeedFilterFrame()) {
            tXVideoEditer.mVideoProcessor.setFilteredFrameRate(tXVideoEditer.mVideoEncodeParams.fps);
        }
        tXVideoEditer.mAudioEncodeParams = uGCTranscodeAudioEncodeParamsDecider.getDecidedEncodeParams();
        tXVideoEditer.mIsProcessToFullKeyFrame = false;
        tXVideoEditer.mRecordOutputPath = str;
        tXVideoEditer.mLastVideoEncodeProgress = 0.0f;
        tXVideoEditer.startProcessVideo(UGCVideoEncoderJNI.EncoderType.HARDWARE);
    }

    public static /* synthetic */ void lambda$getThumbnail$33(TXVideoEditer tXVideoEditer, int i11, int i12, boolean z11, int i13, TXThumbnailListener tXThumbnailListener) {
        LiteavLog.m76087i(TAG, "getThumbnail: width= " + i11 + " height= " + i12 + ",fast= " + z11 + ",count= " + i13);
        FFmpegMediaRetriever fFmpegMediaRetriever = new FFmpegMediaRetriever();
        fFmpegMediaRetriever.setDataSource(tXVideoEditer.mSourcePath);
        List<Long> listCalculateThumbnailList = UGCThumbnailGenerator.calculateThumbnailList(i13, 0L, fFmpegMediaRetriever.getVideoDurationMs(), fFmpegMediaRetriever.getVideoDurationMs());
        if (listCalculateThumbnailList != null) {
            tXVideoEditer.doGetThumbnail(listCalculateThumbnailList, i11, i12, z11, tXThumbnailListener);
        }
    }

    public static /* synthetic */ void lambda$handleWriteMP4Completed$65(TXVideoEditer tXVideoEditer, int i11, long j11) {
        LiteavLog.m76087i(TAG, "handleWriteMP4Completed: mIsProcessToFullKeyFrame=" + tXVideoEditer.mIsProcessToFullKeyFrame + ",resultCode=" + i11 + ",mIsGenerating= " + tXVideoEditer.mIsGenerating);
        if (tXVideoEditer.mIsGenerating) {
            tXVideoEditer.mAVSyncer.stop();
            tXVideoEditer.mVideoProcessor.stop();
            tXVideoEditer.mAudioProcessor.stop();
            tXVideoEditer.stopMp4Writer();
            tXVideoEditer.mIsGenerating = false;
            tXVideoEditer.mIsVideoEncoderStarted = false;
            tXVideoEditer.mIsAudioEncoderStarted = false;
            if (!tXVideoEditer.mIsProcessToFullKeyFrame) {
                tXVideoEditer.notifyGenerateComplete(i11, j11);
                return;
            }
            if (C34741f.m76111a(tXVideoEditer.mProcessOutputPath) && i11 == 0) {
                EnumC34747l enumC34747l = tXVideoEditer.mRotation;
                EnumC34747l enumC34747l2 = EnumC34747l.NORMAL;
                if (enumC34747l != enumC34747l2) {
                    tXVideoEditer.mRotation = enumC34747l2;
                    tXVideoEditer.mVideoProcessor.setRenderRotation(enumC34747l2);
                }
                tXVideoEditer.setMediaSourcePathsInternal(Collections.singletonList(tXVideoEditer.mProcessOutputPath));
            }
            tXVideoEditer.notifyProcessComplete(i11, false);
        }
    }

    public static /* synthetic */ void lambda$initWithPreview$43(TXVideoEditer tXVideoEditer, TXVideoEditConstants.TXPreviewParam tXPreviewParam) {
        FrameLayout frameLayout = tXVideoEditer.mFrameLayout;
        if (frameLayout != null) {
            frameLayout.removeAllViews();
        }
        TextureView textureView = new TextureView(tXVideoEditer.mContext);
        FrameLayout frameLayout2 = tXPreviewParam.videoView;
        tXVideoEditer.mFrameLayout = frameLayout2;
        if (frameLayout2 != null) {
            frameLayout2.addView(textureView);
        }
        tXVideoEditer.mSequenceTaskRunner.mo76133a(RunnableC35551bx.m79050a(tXVideoEditer, tXPreviewParam, new DisplayTarget(textureView)));
    }

    public static /* synthetic */ void lambda$notifyGenerateComplete$72(int i11, TXVideoGenerateListener tXVideoGenerateListener) {
        TXVideoEditConstants.TXGenerateResult tXGenerateResult = new TXVideoEditConstants.TXGenerateResult();
        tXGenerateResult.retCode = i11;
        tXGenerateResult.descMsg = "";
        LiteavLog.m76087i(TAG, "on generate complete.result code is: ".concat(String.valueOf(i11)));
        tXVideoGenerateListener.onGenerateComplete(tXGenerateResult);
    }

    public static /* synthetic */ void lambda$notifyPreviewFinished$67(TXVideoEditer tXVideoEditer, TXVideoPreviewListener tXVideoPreviewListener) {
        if (!tXVideoEditer.mIsDecodeError || !(tXVideoPreviewListener instanceof TXVideoPreviewListenerEx)) {
            tXVideoPreviewListener.onPreviewFinished();
            return;
        }
        TXVideoEditConstants.TXPreviewError tXPreviewError = new TXVideoEditConstants.TXPreviewError();
        tXPreviewError.errorCode = -1;
        ((TXVideoPreviewListenerEx) tXVideoPreviewListener).onPreviewError(tXPreviewError);
    }

    public static /* synthetic */ void lambda$notifyPreviewProgress$66(TXVideoEditer tXVideoEditer, int i11, TXVideoPreviewListener tXVideoPreviewListener) {
        if (tXVideoEditer.filtInvalidatedFrame(i11 / 1000)) {
            return;
        }
        tXVideoPreviewListener.onPreviewProgress(i11);
        tXVideoEditer.mTargetSeekPts.set(null);
    }

    public static /* synthetic */ void lambda$null$42(TXVideoEditer tXVideoEditer, TXVideoEditConstants.TXPreviewParam tXPreviewParam, DisplayTarget displayTarget) {
        GLConstants.GLScaleType gLScaleType = GLConstants.GLScaleType.CENTER_CROP;
        if (tXPreviewParam.renderMode == 2) {
            gLScaleType = GLConstants.GLScaleType.FIT_CENTER;
        }
        tXVideoEditer.mVideoProcessor.setDisplayView(displayTarget, gLScaleType);
    }

    public static /* synthetic */ void lambda$null$63(TXVideoEditer tXVideoEditer, TXThumbnailListener tXThumbnailListener, int i11, long j11, Bitmap bitmap, List list, UGCThumbnailGenerator uGCThumbnailGenerator) {
        if (tXThumbnailListener != null) {
            tXThumbnailListener.onThumbnail(i11, j11, bitmap);
        }
        if (!tXVideoEditer.mIsRelease.get() && i11 == list.size()) {
            LiteavLog.m76087i(TAG, "getThumbnail finished!");
            tXVideoEditer.releaseThumbnailGenerator(uGCThumbnailGenerator);
        }
    }

    public static /* synthetic */ void lambda$pausePlay$45(TXVideoEditer tXVideoEditer) {
        LiteavLog.m76087i(TAG, "pausePlay " + tXVideoEditer.mIsGenerating);
        if (tXVideoEditer.mIsGenerating) {
            return;
        }
        tXVideoEditer.mAVSyncer.stop();
        tXVideoEditer.mVideoProcessor.stop();
        tXVideoEditer.mAudioProcessor.stop();
    }

    public static /* synthetic */ void lambda$previewAtTime$48(TXVideoEditer tXVideoEditer) {
        Long andSet = tXVideoEditer.mPendingPreviewAtTime.getAndSet(null);
        if (andSet == null) {
            return;
        }
        LiteavLog.m76087i(TAG, "previewAtTime time = ".concat(String.valueOf(andSet)));
        tXVideoEditer.mMediaListSource.seekTo(andSet.longValue());
        tXVideoEditer.mVideoProcessor.seekTo(andSet.longValue());
        C34748m c34748m = tXVideoEditer.mSequenceTaskRunner;
        Runnable runnable = tXVideoEditer.mRunnableOnPlayComplete;
        if (runnable != null) {
            c34748m.f73547a.remove(runnable);
            synchronized (c34748m) {
                try {
                    Iterator<C34748m.a> it = c34748m.f73549c.iterator();
                    while (it.hasNext()) {
                        C34748m.a next = it.next();
                        if (next != null && runnable == next.f73550a) {
                            C34748m.this.f73548b.removeCallbacks(next.f73552c);
                            C34748m.this.f73547a.remove(next.f73551b);
                            it.remove();
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        tXVideoEditer.mAVSyncer.resetClock();
    }

    public static /* synthetic */ void lambda$processVideoInternal$36(TXVideoProcessListener tXVideoProcessListener) {
        TXVideoEditConstants.TXGenerateResult tXGenerateResult = new TXVideoEditConstants.TXGenerateResult();
        tXGenerateResult.retCode = -5;
        tXGenerateResult.descMsg = "licence verify failed";
        if (tXVideoProcessListener != null) {
            tXVideoProcessListener.onProcessComplete(tXGenerateResult);
        }
    }

    public static /* synthetic */ void lambda$release$40(TXVideoEditer tXVideoEditer) {
        LiteavLog.m76087i(TAG, "release");
        tXVideoEditer.mIsRelease.set(true);
        tXVideoEditer.cancelAllThumbnailGenerator();
        tXVideoEditer.mVideoProcessor.unInitialize();
        tXVideoEditer.mAudioProcessor.unInitialize();
        tXVideoEditer.mAudioProcessor.destroy();
        tXVideoEditer.mMediaListSource.uninitialize();
        tXVideoEditer.stopMp4Writer();
        UGCInitializer.uninitialize();
    }

    public static /* synthetic */ void lambda$resumePlay$46(TXVideoEditer tXVideoEditer) {
        LiteavLog.m76087i(TAG, "resumePlay " + tXVideoEditer.mIsGenerating);
        if (tXVideoEditer.mIsGenerating) {
            return;
        }
        tXVideoEditer.mAVSyncer.start();
        tXVideoEditer.mVideoProcessor.start(false, UGCVideoEncoderJNI.EncoderType.HARDWARE);
        tXVideoEditer.mAudioProcessor.start(false);
    }

    public static /* synthetic */ void lambda$setAnimatedPasterList$19(TXVideoEditer tXVideoEditer, List list) {
        LiteavLog.m76087i(TAG, "setAnimatedPasterList");
        tXVideoEditer.mVideoProcessor.getWatermarkProcessor().setAnimatedPasterList(list);
    }

    public static /* synthetic */ void lambda$setAudioBitrate$53(TXVideoEditer tXVideoEditer, int i11) {
        LiteavLog.m76087i(TAG, "setAudioBitrate: bitrate= ".concat(String.valueOf(i11)));
        tXVideoEditer.mAudioEncodeBitrate = i11;
    }

    public static /* synthetic */ void lambda$setBGM$10(TXVideoEditer tXVideoEditer, String str, boolean z11) {
        tXVideoEditer.mAudioProcessor.setBGM(str);
        tXVideoEditer.doStopPlayInner();
        if (z11) {
            tXVideoEditer.mBGMFormat = null;
            tXVideoEditer.mHasBGM = false;
            if (CollectionUtils.isEmpty(tXVideoEditer.mAudioFormatList)) {
                tXVideoEditer.mAVSyncer.setAudioExist(false);
                UGCAVSyncer.SyncMode syncMode = UGCAVSyncer.SyncMode.VIDEO_MASTER;
                tXVideoEditer.mPreviewSyncMode = syncMode;
                tXVideoEditer.mAVSyncer.setSyncMode(syncMode);
                return;
            }
            return;
        }
        tXVideoEditer.mHasBGM = true;
        MediaExtractor mediaExtractorBuild = new MediaExtractorBuilder().setPath(str).setMimeType("audio/").build();
        if (mediaExtractorBuild == null) {
            LiteavLog.m76093w(TAG, "setBGM: build extractor fail.");
            return;
        }
        tXVideoEditer.mBGMFormat = mediaExtractorBuild.getTrackFormat(mediaExtractorBuild.getSampleTrackIndex());
        tXVideoEditer.mAVSyncer.setAudioExist(true);
        UGCAVSyncer.SyncMode syncMode2 = UGCAVSyncer.SyncMode.AUDIO_MASTER;
        tXVideoEditer.mPreviewSyncMode = syncMode2;
        tXVideoEditer.mAVSyncer.setSyncMode(syncMode2);
    }

    public static /* synthetic */ void lambda$setBGMAtVideoTime$12(TXVideoEditer tXVideoEditer, long j11) {
        LiteavLog.m76087i(TAG, "setBGMAtVideoTime: videoStartTime= ".concat(String.valueOf(j11)));
        tXVideoEditer.mAudioProcessor.setBGMAtVideoTime(j11);
    }

    public static /* synthetic */ void lambda$setBGMFadeInOutDuration$15(TXVideoEditer tXVideoEditer, long j11, long j12) {
        LiteavLog.m76087i(TAG, "setBGMFadeInOutDuration: fadeInDuration= " + j11 + ",fadeOutDuration= " + j12);
        tXVideoEditer.mAudioProcessor.setFadeInOutDuration(j11, j12);
    }

    public static /* synthetic */ void lambda$setBGMLoop$11(TXVideoEditer tXVideoEditer, boolean z11) {
        LiteavLog.m76087i(TAG, "setBGMLoop: looping= ".concat(String.valueOf(z11)));
        tXVideoEditer.mAudioProcessor.setBGMLoop(z11);
    }

    public static /* synthetic */ void lambda$setBGMStartTime$13(TXVideoEditer tXVideoEditer, long j11, long j12) {
        LiteavLog.m76087i(TAG, "setBGMStartTime: startTime= " + j11 + ", endTime= " + j12);
        tXVideoEditer.mAudioProcessor.setBGMStartTime(j11, j12);
    }

    public static /* synthetic */ void lambda$setBGMVolume$14(TXVideoEditer tXVideoEditer, float f11) {
        LiteavLog.m76087i(TAG, "setBGMVolume: ".concat(String.valueOf(f11)));
        tXVideoEditer.mAudioProcessor.setBGMVolume(f11);
    }

    public static /* synthetic */ void lambda$setBeautyFilter$7(TXVideoEditer tXVideoEditer, int i11, int i12) {
        LiteavLog.m76087i(TAG, "setBeautyFilter: beautyLevel= " + i11 + ",whiteningLevel= " + i12);
        tXVideoEditer.mVideoProcessor.setBeautyFilter(i11, i12);
    }

    public static /* synthetic */ void lambda$setCutFromTime$50(TXVideoEditer tXVideoEditer, long j11, long j12) {
        LiteavLog.m76087i(TAG, "setCutFromTime: startTime= " + j11 + ",endTime= " + j12);
        tXVideoEditer.mCutStartTimeMs = j11;
        tXVideoEditer.mCutEndTimeMs = j12;
    }

    public static /* synthetic */ void lambda$setFilter$6(TXVideoEditer tXVideoEditer, float f11, float f12, float f13, Bitmap bitmap, Bitmap bitmap2) {
        LiteavLog.m76087i(TAG, "setFilter: leftIntensity= " + f11 + ",rightIntensity= " + f12 + ",leftRatio= " + f13);
        tXVideoEditer.mVideoProcessor.setFilter(bitmap, f11, bitmap2, f12, f13);
    }

    public static /* synthetic */ void lambda$setIsSplitScreen$56(TXVideoEditer tXVideoEditer, boolean z11) {
        tXVideoEditer.mMediaListSource.setIsSplitScreenMode(z11);
        if (z11) {
            return;
        }
        tXVideoEditer.mVideoProcessor.setSplitScreenList(null, -1, -1);
        tXVideoEditer.mCanvasSize = null;
    }

    public static /* synthetic */ void lambda$setPasterList$20(TXVideoEditer tXVideoEditer, List list) {
        LiteavLog.m76087i(TAG, "setPasterList");
        tXVideoEditer.mVideoProcessor.getWatermarkProcessor().setPasterList(list);
    }

    public static /* synthetic */ void lambda$setPictureList$8(TXVideoEditer tXVideoEditer, int i11, List list) {
        LiteavLog.m76087i(TAG, "setPictureList: fps= " + i11 + ",bitmapList.size= " + list.size());
        tXVideoEditer.mMediaListSource.setPictureList(list, i11);
    }

    public static /* synthetic */ void lambda$setPictureTransition$9(TXVideoEditer tXVideoEditer, int i11) {
        LiteavLog.m76087i(TAG, "setPictureTransition: ".concat(String.valueOf(i11)));
        tXVideoEditer.mMediaListSource.setPictureTransition(i11);
        tXVideoEditer.mVideoProcessor.setPictureTransition(i11);
    }

    public static /* synthetic */ void lambda$setProfile$3(TXVideoEditer tXVideoEditer, int i11) {
        LiteavLog.m76087i(TAG, "setProfile: ".concat(String.valueOf(i11)));
        tXVideoEditer.mEncodeProfile = i11;
    }

    public static /* synthetic */ void lambda$setRenderRotation$21(TXVideoEditer tXVideoEditer, int i11) {
        LiteavLog.m76087i(TAG, "setRenderRotation: rotation= ".concat(String.valueOf(i11)));
        EnumC34747l enumC34747lM76131a = EnumC34747l.m76131a(i11);
        tXVideoEditer.mRotation = enumC34747lM76131a;
        if (tXVideoEditer.mIsGenerating) {
            return;
        }
        tXVideoEditer.mVideoProcessor.setRenderRotation(enumC34747lM76131a);
    }

    public static /* synthetic */ void lambda$setRepeatPlay$23(TXVideoEditer tXVideoEditer, List list) {
        LiteavLog.m76087i(TAG, "setRepeatPlay");
        tXVideoEditer.mMediaListSource.setRepeatPlay(list);
    }

    public static /* synthetic */ void lambda$setReverse$24(TXVideoEditer tXVideoEditer, boolean z11) {
        LiteavLog.m76087i(TAG, "setReverse: isReverse= ".concat(String.valueOf(z11)));
        tXVideoEditer.mIsReverse = z11;
        tXVideoEditer.mMediaListSource.setReverse(z11);
        tXVideoEditer.mVideoProcessor.setReverse(z11);
        tXVideoEditer.mVideoProcessor.getEffectProcessor().setReverse(z11, tXVideoEditer.mMediaListSource.getDuration());
        tXVideoEditer.mVideoProcessor.getTransitionProcessor().setReverse(z11, tXVideoEditer.mMediaListSource.getDuration());
        tXVideoEditer.mVideoProcessor.getWatermarkProcessor().setReverse(z11, tXVideoEditer.mMediaListSource.getDuration());
        tXVideoEditer.doStopPlayInner();
    }

    public static /* synthetic */ void lambda$setSpecialRatio$4(TXVideoEditer tXVideoEditer, float f11) {
        LiteavLog.m76087i(TAG, "setSpecialRatio: ".concat(String.valueOf(f11)));
        if (tXVideoEditer.mCombineFilterInfo == null) {
            tXVideoEditer.mCombineFilterInfo = new CombineFilterInfo();
        }
        tXVideoEditer.mCombineFilterInfo.setLeftSpecialRatio(f11);
        tXVideoEditer.mCombineFilterInfo.setRightSpecialRatio(0.0f);
        tXVideoEditer.mVideoProcessor.setSpecialRatio(f11);
    }

    public static /* synthetic */ void lambda$setSpeedList$22(TXVideoEditer tXVideoEditer, List list) {
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                TXVideoEditConstants.TXSpeed tXSpeed = (TXVideoEditConstants.TXSpeed) it.next();
                LiteavLog.m76087i(TAG, "setSpeedList " + tXSpeed.startTime + C33627eb.f69716f + tXSpeed.endTime + " speed: " + tXSpeed.speedLevel);
            }
        }
        tXVideoEditer.mVideoProcessor.setSpeedList(list);
        tXVideoEditer.mAudioProcessor.setSpeedList(list);
        tXVideoEditer.mMediaListSource.setSpeedList(list);
    }

    public static /* synthetic */ void lambda$setSplitScreenList$58(TXVideoEditer tXVideoEditer, List list, int i11, int i12) {
        tXVideoEditer.mVideoProcessor.setSplitScreenList(list, i11, i12);
        tXVideoEditer.mCanvasSize = new Size(i11, i12);
    }

    public static /* synthetic */ void lambda$setSubtitleList$18(TXVideoEditer tXVideoEditer, List list) {
        LiteavLog.m76087i(TAG, "setSubtitleList");
        tXVideoEditer.mVideoProcessor.getWatermarkProcessor().setSubtitleList(list);
    }

    public static /* synthetic */ void lambda$setTailWaterMark$17(TXVideoEditer tXVideoEditer, int i11, Bitmap bitmap, TXVideoEditConstants.TXRect tXRect) {
        LiteavLog.m76087i(TAG, "setTailWaterMark: duration= ".concat(String.valueOf(i11)));
        tXVideoEditer.mVideoProcessor.getWatermarkProcessor().setTailWaterMark(bitmap, tXRect, tXVideoEditer.mMediaListSource.getDuration(), i11);
        tXVideoEditer.mMediaListSource.setTailWaterMarkDurationSecond(i11);
    }

    public static /* synthetic */ void lambda$setThumbnail$34(TXVideoEditer tXVideoEditer, TXVideoEditConstants.TXThumbnail tXThumbnail) {
        LiteavLog.m76087i(TAG, "setThumbnail: thumbnail.count= " + tXThumbnail.count + " ,thumbnail.width= " + tXThumbnail.width + " ,thumbnail.height= " + tXThumbnail.height);
        UGCThumbnailGenerator.UGCThumbnailGenerateParams uGCThumbnailGenerateParams = new UGCThumbnailGenerator.UGCThumbnailGenerateParams();
        tXVideoEditer.mProcessThumbnailInfo = uGCThumbnailGenerateParams;
        uGCThumbnailGenerateParams.thumbnailCount = tXThumbnail.count;
        uGCThumbnailGenerateParams.width = tXThumbnail.width;
        uGCThumbnailGenerateParams.height = tXThumbnail.height;
        uGCThumbnailGenerateParams.fast = false;
    }

    public static /* synthetic */ void lambda$setTransitionEffect$25(TXVideoEditer tXVideoEditer, int i11, long j11, long j12, AtomicBoolean atomicBoolean) {
        LiteavLog.m76087i(TAG, "setTransitionEffect: type=" + i11 + " ,startTimeMs= " + j11 + " ,transitionDurationMs= " + j12);
        atomicBoolean.set(tXVideoEditer.mVideoProcessor.getTransitionProcessor().setTransitionEffect(i11, tXVideoEditer.mMediaListSource.getDuration(), j11, j12));
    }

    public static /* synthetic */ void lambda$setVideoBitrate$51(TXVideoEditer tXVideoEditer, int i11) {
        LiteavLog.m76087i(TAG, "setVideoBitrate: bitrate= ".concat(String.valueOf(i11)));
        tXVideoEditer.mVideoEncodeBitrate = i11;
    }

    public static /* synthetic */ void lambda$setVideoVolume$62(TXVideoEditer tXVideoEditer, float f11) {
        LiteavLog.m76087i(TAG, "setVideoVolume: volume= ".concat(String.valueOf(f11)));
        tXVideoEditer.mAudioProcessor.setVideoVolume(f11);
    }

    public static /* synthetic */ void lambda$setWaterMark$16(TXVideoEditer tXVideoEditer, TXVideoEditConstants.TXRect tXRect, Bitmap bitmap) {
        LiteavLog.m76087i(TAG, "setWaterMark: " + tXRect.toString());
        tXVideoEditer.mVideoProcessor.getWatermarkProcessor().setWaterMark(bitmap, tXRect);
    }

    public static /* synthetic */ void lambda$startEffect$27(TXVideoEditer tXVideoEditer, int i11, long j11) {
        LiteavLog.m76087i(TAG, "startEffect: type=" + i11 + ",startTime= " + j11);
        tXVideoEditer.mVideoProcessor.getEffectProcessor().startEffect(i11, j11);
    }

    public static /* synthetic */ void lambda$startPlayFromTime$44(TXVideoEditer tXVideoEditer, long j11, long j12) {
        LiteavLog.m76087i(TAG, "startPlayFromTime: startTime= " + j11 + ", endTime= " + j12);
        tXVideoEditer.doStopPlayInner();
        Size size = tXVideoEditer.mCanvasSize;
        if (size == null) {
            tXVideoEditer.mVideoProcessor.setOutputSize(-1, -1, GLConstants.GLScaleType.FIT_CENTER);
        } else {
            tXVideoEditer.mVideoProcessor.setOutputSize(size.width, size.height, GLConstants.GLScaleType.FIT_CENTER);
        }
        tXVideoEditer.mAVSyncer.setSyncMode(tXVideoEditer.mPreviewSyncMode);
        tXVideoEditer.mAVSyncer.start();
        if (tXVideoEditer.mSourceRangeStartTimeMs != 0 || ((j12 != tXVideoEditer.mSourceRangeEndTimeMs && j12 >= 0) || tXVideoEditer.mIsReverse)) {
            tXVideoEditer.mSourceRangeStartTimeMs = 0L;
            tXVideoEditer.mSourceRangeEndTimeMs = j12;
            if (tXVideoEditer.mIsReverse) {
                tXVideoEditer.mSourceRangeStartTimeMs = j11;
            }
        }
        if (tXVideoEditer.mIsReverse) {
            tXVideoEditer.mMediaListSource.seekTo(j12);
            tXVideoEditer.mMediaListSource.setPlayEndTime(Long.MAX_VALUE);
        } else {
            tXVideoEditer.mMediaListSource.seekTo(j11);
            tXVideoEditer.mMediaListSource.setPlayEndTime(j12);
        }
        tXVideoEditer.mVideoProcessor.setProgressListener(tXVideoEditer.mOnPlayProgressListener);
        tXVideoEditer.mVideoProcessor.setRenderRotation(tXVideoEditer.mRotation);
        tXVideoEditer.mVideoProcessor.start(false, UGCVideoEncoderJNI.EncoderType.HARDWARE);
        tXVideoEditer.mAudioProcessor.start(false);
        tXVideoEditer.mIsProcessToFullKeyFrame = false;
        tXVideoEditer.mIsGenerating = false;
        tXVideoEditer.mIsVideoEncoderStarted = false;
        tXVideoEditer.mIsAudioEncoderStarted = false;
        tXVideoEditer.mIsEncodeError = false;
        tXVideoEditer.mIsDecodeError = false;
        tXVideoEditer.mIsPlaying = true;
        tXVideoEditer.mTargetSeekPts.set(null);
    }

    public static /* synthetic */ void lambda$stopEffect$28(TXVideoEditer tXVideoEditer, int i11, long j11) {
        LiteavLog.m76087i(TAG, "stopEffect");
        tXVideoEditer.mVideoProcessor.getEffectProcessor().stopEffect(i11, j11);
    }

    public static /* synthetic */ void lambda$stopPlay$47(TXVideoEditer tXVideoEditer) {
        LiteavLog.m76087i(TAG, "stopPlay");
        tXVideoEditer.doStopPlayInner();
    }

    private void notifyGenerateComplete(int i11, long j11) {
        TXVideoGenerateListener tXVideoGenerateListener = this.mVideoGenerateListener;
        if (!TextUtils.isEmpty(this.mProcessOutputPath) && new File(this.mProcessOutputPath).exists()) {
            UGCDataReport.reportDAU(1032, (int) new File(this.mProcessOutputPath).length(), "");
            UGCDataReport.reportDAU(1033, (int) j11, "");
        }
        if (tXVideoGenerateListener == null) {
            return;
        }
        this.mMainHandler.post(RunnableC35549bv.m79048a(i11, tXVideoGenerateListener));
    }

    private void notifyGenerateProgress(float f11) {
        TXVideoGenerateListener tXVideoGenerateListener = this.mVideoGenerateListener;
        if (tXVideoGenerateListener != null) {
            this.mMainHandler.post(RunnableC35548bu.m79047a(tXVideoGenerateListener, f11));
        }
    }

    private void notifyPreviewFinished() {
        TXVideoPreviewListener tXVideoPreviewListener = this.mVideoPreviewListener;
        if (tXVideoPreviewListener == null) {
            return;
        }
        this.mMainHandler.post(RunnableC35543bp.m79042a(this, tXVideoPreviewListener));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void notifyPreviewProgress(int i11) {
        TXVideoPreviewListener tXVideoPreviewListener = this.mVideoPreviewListener;
        if (tXVideoPreviewListener != null) {
            this.mMainHandler.post(RunnableC35542bo.m79041a(this, i11, tXVideoPreviewListener));
        }
    }

    private void notifyProcessComplete(int i11, boolean z11) {
        LiteavLog.m76087i(TAG, "notifyProcessComplete: resultCode:" + i11 + " isThumbnailProcessFinish:" + z11);
        this.mHasNotifyProcessComplete.set(false);
        if (z11) {
            this.mNeedWaitThumbnailProcess = false;
        } else {
            this.mNeedWaitProcessFullI = false;
        }
        if (!this.mNeedWaitProcessFullI && !this.mNeedWaitThumbnailProcess) {
            this.mMainHandler.post(RunnableC35546bs.m79045a(this, i11));
        } else if (this.mNeedWaitThumbnailProcess) {
            this.mMainHandler.postDelayed(RunnableC35544bq.m79043a(this, i11), 500L);
        }
    }

    private void notifyProcessProgress(float f11) {
        TXVideoProcessListener tXVideoProcessListener = this.mVideoProcessListener;
        if (tXVideoProcessListener != null) {
            this.mMainHandler.post(RunnableC35547bt.m79046a(tXVideoProcessListener, f11));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onAudioEncodedFrame(AudioFrame audioFrame) {
        MP4Writer mP4Writer = this.mMp4Writer;
        if (mP4Writer != null) {
            mP4Writer.writeAudioFrame(audioFrame);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onAudioEncodedFrameComplete() {
        LiteavLog.m76087i(TAG, "onAudioEncodedFrameComplete end flag = " + this.mIsGenerateAudioEnd);
        if (this.mIsGenerateAudioEnd) {
            return;
        }
        this.mIsGenerateAudioEnd = true;
        this.mAVSyncer.setAudioEos();
        handleEncodedCompletedInner();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onPlayComplete() {
        LiteavLog.m76087i(TAG, "on play complete. playing is " + this.mIsPlaying);
        if (this.mIsPlaying) {
            this.mIsPlaying = false;
            this.mAVSyncer.setVideoEos();
            this.mAVSyncer.setAudioEos();
            this.mAVSyncer.stop();
            notifyPreviewFinished();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:9:0x0030  */
    public void onVideoEncodedFail(UGCVideoEncoderJNI.EncoderType encoderType, UGCVideoEncoderJNI.VideoEncoderError videoEncoderError) {
        LiteavLog.m76087i(TAG, "on video encoded fail. encoder type is " + encoderType + " encode error type is " + videoEncoderError);
        UGCVideoEncoderJNI.EncoderType encoderType2 = UGCVideoEncoderJNI.EncoderType.HARDWARE;
        if (encoderType != encoderType2) {
            this.mIsEncodeError = true;
            onVideoEncodedFrameComplete();
            return;
        }
        UGCVideoEncoderJNI.EncoderType encoderType3 = UGCVideoEncoderJNI.EncoderType.SOFTWARE;
        if (videoEncoderError == UGCVideoEncoderJNI.VideoEncoderError.UNEXPECTED_B_FRAME) {
            VideoEncodeParams videoEncodeParams = this.mVideoEncodeParams;
            EnumC34876d enumC34876d = videoEncodeParams.encoderProfile;
            EnumC34876d enumC34876d2 = EnumC34876d.BASELINE;
            if (enumC34876d != enumC34876d2) {
                videoEncodeParams.encoderProfile = enumC34876d2;
            } else {
                encoderType2 = encoderType3;
            }
        } else {
            encoderType2 = encoderType3;
        }
        startProcessVideo(encoderType2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onVideoEncodedFrame(EncodedVideoFrame encodedVideoFrame) {
        MP4Writer mP4Writer = this.mMp4Writer;
        if (mP4Writer != null) {
            mP4Writer.writeVideoFrame(encodedVideoFrame);
        }
        float fCalculateProgress = calculateProgress(encodedVideoFrame.pts);
        if (fCalculateProgress < this.mLastVideoEncodeProgress) {
            return;
        }
        this.mLastVideoEncodeProgress = fCalculateProgress;
        if (this.mIsProcessToFullKeyFrame) {
            notifyProcessProgress(fCalculateProgress);
        } else {
            notifyGenerateProgress(fCalculateProgress);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onVideoEncodedFrameComplete() {
        LiteavLog.m76087i(TAG, "onVideoEncodedFrameComplete end flag = " + this.mIsGenerateVideoEnd);
        if (this.mIsGenerateVideoEnd) {
            return;
        }
        this.mAVSyncer.setVideoEos();
        this.mIsGenerateVideoEnd = true;
        handleEncodedCompletedInner();
    }

    private void releaseThumbnailGenerator(UGCThumbnailGenerator uGCThumbnailGenerator) {
        if (this.mAllThumbnailGeneratorList.size() > 0 && this.mAllThumbnailGeneratorList.contains(uGCThumbnailGenerator)) {
            uGCThumbnailGenerator.stop();
            uGCThumbnailGenerator.uninitialize();
            this.mAllThumbnailGeneratorList.remove(uGCThumbnailGenerator);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMediaSourcePathsInternal(List<String> list) {
        if (list == null || list.isEmpty()) {
            LiteavLog.m76093w(TAG, "video source is null or empty");
            return;
        }
        Size size = this.mCanvasSize;
        if (size == null) {
            this.mVideoProcessor.setOutputSize(-1, -1, GLConstants.GLScaleType.FIT_CENTER);
        } else {
            this.mVideoProcessor.setOutputSize(size.width, size.height, GLConstants.GLScaleType.FIT_CENTER);
        }
        this.mVideoSourceList = list;
        this.mMediaListSource.setVideoSources(list);
        this.mSourcePath = list.get(0);
        this.mVideoFormatList = new LinkedList();
        this.mAudioFormatList = new LinkedList();
        try {
            getAllMediaFormatFromSource(list);
        } catch (Throwable th2) {
            LiteavLog.m76084e(TAG, "get all media format from source exception.", th2);
        }
        if (!CollectionUtils.isEmpty(this.mVideoFormatList)) {
            this.mAVSyncer.setVideoExist(true);
        }
        if (!CollectionUtils.isEmpty(this.mAudioFormatList)) {
            this.mAVSyncer.setAudioExist(true);
        }
        if (CollectionUtils.isEmpty(this.mAudioFormatList)) {
            this.mPreviewSyncMode = UGCAVSyncer.SyncMode.VIDEO_MASTER;
        } else if (list.size() > 1) {
            this.mPreviewSyncMode = UGCAVSyncer.SyncMode.CLOCK_MASTER;
        } else {
            this.mPreviewSyncMode = UGCAVSyncer.SyncMode.AUDIO_MASTER;
        }
    }

    private void startThumbnailGeneratorByProcess(VideoEncodeParams videoEncodeParams, boolean z11) {
        UGCThumbnailGenerator.UGCThumbnailGenerateParams uGCThumbnailGenerateParams = this.mProcessThumbnailInfo;
        if (uGCThumbnailGenerateParams == null) {
            return;
        }
        if (uGCThumbnailGenerateParams.width == 0 || uGCThumbnailGenerateParams.height == 0) {
            uGCThumbnailGenerateParams.width = videoEncodeParams.width;
            uGCThumbnailGenerateParams.height = videoEncodeParams.height;
        }
        UGCThumbnailGenerator uGCThumbnailGenerator = new UGCThumbnailGenerator();
        uGCThumbnailGenerator.initialize();
        uGCThumbnailGenerator.setVideoSourceList(this.mVideoSourceList);
        uGCThumbnailGenerator.setVideoSourceRange(this.mCutStartTimeMs, this.mCutEndTimeMs);
        UGCThumbnailGenerator.UGCThumbnailGenerateParams uGCThumbnailGenerateParams2 = this.mProcessThumbnailInfo;
        uGCThumbnailGenerateParams2.thumbnailPtsList = UGCThumbnailGenerator.calculateThumbnailList(uGCThumbnailGenerateParams2.thumbnailCount, 0L, this.mCutEndTimeMs - this.mCutStartTimeMs, this.mMediaListSource.getDuration());
        this.mNeedWaitThumbnailProcess = true;
        uGCThumbnailGenerator.start(this.mProcessThumbnailInfo, C35500al.m79001a(this, uGCThumbnailGenerator, z11));
        this.mAllThumbnailGeneratorList.add(uGCThumbnailGenerator);
    }

    private void stopMp4Writer() {
        LiteavLog.m76087i(TAG, "stopMp4Writer");
        MP4Writer mP4Writer = this.mMp4Writer;
        if (mP4Writer != null) {
            mP4Writer.stop();
            this.mMp4Writer = null;
        }
    }

    public void cancel() {
        this.mSequenceTaskRunner.mo76133a(RunnableC35518bc.m79019a(this));
    }

    public void generateVideo(int i11, String str) {
        this.mSequenceTaskRunner.mo76133a(RunnableC35517bb.m79018a(this, i11, str));
    }

    public long getDuration() {
        return this.mMediaListSource.getDuration();
    }

    public void getThumbnail(int i11, int i12, int i13, boolean z11, TXThumbnailListener tXThumbnailListener) {
        this.mSequenceTaskRunner.mo76133a(RunnableC35494af.m78995a(this, i12, i13, z11, i11, tXThumbnailListener));
    }

    public int getThumbnailCount() {
        LiteavLog.m76087i(TAG, "getThumbnailCount");
        List<Long> list = this.mProcessThumbnailInfo.thumbnailPtsList;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    public String getVideoProcessPath() {
        LiteavLog.m76087i(TAG, "getVideoProcessPath: process output path= " + this.mProcessOutputPath);
        return this.mProcessOutputPath;
    }

    public String getVideoSourcePath() {
        LiteavLog.m76087i(TAG, "getVideoSourcePath: sourcePath= " + this.mSourcePath);
        return this.mSourcePath;
    }

    public void initWithPreview(TXVideoEditConstants.TXPreviewParam tXPreviewParam) {
        if (tXPreviewParam == null) {
            LiteavLog.m76087i(TAG, "initWithPreview param is null.");
            return;
        }
        LiteavLog.m76087i(TAG, "initWithPreview: view= " + tXPreviewParam.videoView + " renderMode= " + tXPreviewParam.renderMode);
        this.mMainHandler.runOrPost(RunnableC35504ap.m79005a(this, tXPreviewParam));
    }

    public boolean isHasAudio() {
        return this.mMediaListSource.hasAudioData();
    }

    public void pausePlay() {
        this.mSequenceTaskRunner.mo76133a(RunnableC35506ar.m79007a(this));
    }

    public void previewAtTime(long j11) {
        this.mPendingPreviewAtTime.set(Long.valueOf(j11));
        this.mTargetSeekPts.set(Long.valueOf(j11));
        this.mSequenceTaskRunner.mo76133a(RunnableC35509au.m79010a(this));
    }

    public void processVideo() {
        this.mSequenceTaskRunner.mo76133a(RunnableC35497ai.m78998a(this));
    }

    public void refreshOneFrame() {
        LiteavLog.m76087i(TAG, "refreshOneFrame");
        C34748m c34748m = this.mSequenceTaskRunner;
        UGCVideoProcessor uGCVideoProcessor = this.mVideoProcessor;
        uGCVideoProcessor.getClass();
        c34748m.mo76133a(RunnableC35538bk.m79037a(uGCVideoProcessor));
    }

    public void release() {
        this.mSequenceTaskRunner.mo76133a(RunnableC35502an.m79003a(this));
    }

    public void resumePlay() {
        this.mSequenceTaskRunner.mo76133a(RunnableC35507as.m79008a(this));
    }

    @Deprecated
    public void setAudioBitrate(int i11) {
        this.mSequenceTaskRunner.mo76133a(RunnableC35516ba.m79017a(this, i11));
    }

    public void setCustomVideoProcessListener(TXVideoCustomProcessListener tXVideoCustomProcessListener) {
        this.mSequenceTaskRunner.mo76133a(RunnableC35499ak.m79000a(this, tXVideoCustomProcessListener));
    }

    public void setCutFromTime(long j11, long j12) {
        this.mSequenceTaskRunner.mo76133a(RunnableC35512ax.m79013a(this, j11, j12));
        UGCDataReport.reportDAU(1018);
    }

    public void setIsFullIFrame(boolean z11) {
        this.mSequenceTaskRunner.mo76133a(RunnableC35536bi.m79035a(this, z11));
    }

    public void setIsSplitScreen(boolean z11) {
        this.mSequenceTaskRunner.mo76133a(RunnableC35519bd.m79020a(this, z11));
    }

    public void setMediaSourcePaths(List<String> list) {
        this.mSequenceTaskRunner.mo76133a(RunnableC35537bj.m79036a(this, list));
    }

    public void setProfile(int i11) {
        this.mSequenceTaskRunner.mo76133a(RunnableC35510av.m79011a(this, i11));
    }

    public void setSplitScreenList(List<TXVideoEditConstants.TXAbsoluteRect> list, int i11, int i12) {
        this.mSequenceTaskRunner.mo76133a(RunnableC35533bf.m79032a(this, list, i11, i12));
    }

    public void setTXVideoPreviewListener(TXVideoPreviewListener tXVideoPreviewListener) {
        this.mSequenceTaskRunner.mo76133a(RunnableC35503ao.m79004a(this, tXVideoPreviewListener));
    }

    public void setThumbnail(TXVideoEditConstants.TXThumbnail tXThumbnail) {
        this.mSequenceTaskRunner.mo76133a(RunnableC35495ag.m78996a(this, tXThumbnail));
    }

    public void setThumbnailListener(TXThumbnailListener tXThumbnailListener) {
        this.mSequenceTaskRunner.mo76133a(RunnableC35496ah.m78997a(this, tXThumbnailListener));
    }

    public boolean setTransitionEffect(int i11, long j11, long j12, long j13) {
        if (!UGCLicenseChecker.isStandardFunctionSupport()) {
            LiteavLog.m76083e(TAG, "setTransitionEffect is not supported in UGSV_Lite license");
            return false;
        }
        UGCDataReport.reportDAU(UGCDataReportDef.DR_DAU_EVENT_ID_EDIT_TRANSITION);
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        this.mSequenceTaskRunner.m76135b(RunnableC35850w.m79332a(this, i11, j12, j13, atomicBoolean));
        return atomicBoolean.get();
    }

    public void setVideoBitrate(int i11) {
        this.mSequenceTaskRunner.mo76133a(RunnableC35513ay.m79014a(this, i11));
    }

    public void setVideoFrameRate(TXVideoEditConstants.VideoFrameRateLevel videoFrameRateLevel) {
        this.mSequenceTaskRunner.mo76133a(RunnableC35514az.m79015a(this, videoFrameRateLevel));
    }

    public void setVideoGenerateListener(TXVideoGenerateListener tXVideoGenerateListener) {
        this.mSequenceTaskRunner.mo76133a(RunnableC35511aw.m79012a(this, tXVideoGenerateListener));
    }

    public void setVideoProcessListener(TXVideoProcessListener tXVideoProcessListener) {
        this.mSequenceTaskRunner.mo76133a(RunnableC35492ad.m78993a(this, tXVideoProcessListener));
    }

    public void setVideoVolume(float f11) {
        this.mSequenceTaskRunner.mo76133a(RunnableC35539bl.m79038a(this, f11));
    }

    public void setVideoVolumes(float[] fArr) {
        this.mSequenceTaskRunner.mo76133a(RunnableC35535bh.m79034a(this, fArr));
    }

    public void startPlayFromTime(long j11, long j12) {
        this.mSequenceTaskRunner.mo76133a(RunnableC35505aq.m79006a(this, j11, j12));
    }

    public void stopPlay() {
        this.mSequenceTaskRunner.mo76133a(RunnableC35508at.m79009a(this));
    }

    public TXVideoEditer(Context context, C34748m c34748m) {
        this.mPendingPreviewAtTime = new AtomicReference<>();
        UGCAVSyncer uGCAVSyncer = new UGCAVSyncer();
        this.mAVSyncer = uGCAVSyncer;
        this.mTargetSeekPts = new AtomicReference<>();
        this.mIsRelease = new AtomicBoolean(false);
        this.mAllThumbnailGeneratorList = new ArrayList<>();
        this.mHasNotifyProcessComplete = new AtomicBoolean(false);
        this.mPreviewSyncMode = UGCAVSyncer.SyncMode.VIDEO_MASTER;
        this.mIsGenerating = false;
        this.mIsPlaying = false;
        this.mIsProcessToFullKeyFrame = false;
        this.mHasBGM = false;
        this.mNeedWaitProcessFullI = false;
        this.mNeedWaitThumbnailProcess = false;
        this.mLastVideoEncodeProgress = 0.0f;
        this.mIsDecodeError = false;
        this.mIsEncodeError = false;
        this.mMp4WriterListener = new MP4Writer.MP4WriterListener() { // from class: com.tencent.ugc.TXVideoEditer.1
            @Override // com.tencent.ugc.MP4Writer.MP4WriterListener
            public final void onComplete(long j11) {
                LiteavLog.m76087i(TXVideoEditer.TAG, "on mp4 writer complete. duration is: " + j11 + ", is decode error : " + TXVideoEditer.this.mIsDecodeError + ", is encode error : " + TXVideoEditer.this.mIsEncodeError);
                TXVideoEditer.this.handleWriteMP4Completed((TXVideoEditer.this.mIsDecodeError || TXVideoEditer.this.mIsEncodeError) ? -1 : 0, j11);
            }

            @Override // com.tencent.ugc.MP4Writer.MP4WriterListener
            public final void onError(String str) {
                LiteavLog.m76083e(TXVideoEditer.TAG, "mp4 writer is error. info is ".concat(String.valueOf(str)));
                TXVideoEditer.this.handleWriteMP4Completed(-1, 0L);
            }
        };
        this.mMainHandler = new CustomHandler(Looper.getMainLooper());
        this.mIsGenerateVideoEnd = false;
        this.mIsGenerateAudioEnd = false;
        this.mVideoEncodeBitrate = -1;
        this.mVideoFrameRateLevel = TXVideoEditConstants.VideoFrameRateLevel.VIDEO_FPS_ORIGIN;
        this.mAudioEncodeBitrate = -1;
        this.mEncodeProfile = -1;
        this.mSourceRangeStartTimeMs = 0L;
        this.mSourceRangeEndTimeMs = 2147483647L;
        this.mCutStartTimeMs = 0L;
        this.mCutEndTimeMs = 2147483647L;
        this.mIsReverse = false;
        this.mIsFullIFrame = false;
        this.mRotation = EnumC34747l.NORMAL;
        this.mIsVideoEncoderStarted = false;
        this.mIsAudioEncoderStarted = false;
        this.mVideoEncodedFrameListener = new C354702();
        this.mAudioEncodedFrameListener = new C354713();
        this.mOnPlayProgressListener = new C354724();
        C354735 c354735 = new C354735();
        this.mMediaListSourceListener = c354735;
        this.mRunnableOnPlayComplete = RunnableC35582d.m79078a(this);
        Context applicationContext = context.getApplicationContext();
        this.mContext = applicationContext;
        ContextUtils.initApplicationContext(applicationContext);
        ContextUtils.setDataDirectorySuffix("liteav");
        UGCMediaListSource uGCMediaListSource = new UGCMediaListSource(c354735);
        this.mMediaListSource = uGCMediaListSource;
        this.mVideoProcessor = new UGCVideoProcessor(applicationContext, uGCMediaListSource, uGCAVSyncer, true);
        this.mAudioProcessor = new UGCAudioProcessor(uGCAVSyncer, uGCMediaListSource);
        this.mSequenceTaskRunner = c34748m;
        c34748m.mo76133a(RunnableC35754o.m79248a(this));
        UGCDataReport.reportLicenseIsValid();
    }

    private static boolean checkIsVideoType(String str) {
        String fileExtension = CommonUtil.getFileExtension(str);
        if (!TextUtils.isEmpty(fileExtension) && sVideoExtHashSet.contains(fileExtension.toLowerCase())) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void doGetThumbnail(List<Long> list, int i11, int i12, boolean z11, TXThumbnailListener tXThumbnailListener) {
        if (CollectionUtils.isEmpty(list)) {
            LiteavLog.m76093w(TAG, "Do get thumbnail.thumbnail list is null or empty");
            return;
        }
        LiteavLog.m76087i(TAG, "getThumbnail: width= " + i11 + " height= " + i12 + ",fast= " + z11 + ",list.size= " + list.size());
        UGCThumbnailGenerator.UGCThumbnailGenerateParams uGCThumbnailGenerateParams = new UGCThumbnailGenerator.UGCThumbnailGenerateParams();
        uGCThumbnailGenerateParams.thumbnailPtsList = list;
        uGCThumbnailGenerateParams.width = i11;
        uGCThumbnailGenerateParams.height = i12;
        uGCThumbnailGenerateParams.fast = z11;
        UGCThumbnailGenerator uGCThumbnailGenerator = new UGCThumbnailGenerator();
        uGCThumbnailGenerator.initialize();
        uGCThumbnailGenerator.setVideoSourceList(Collections.singletonList(this.mSourcePath));
        uGCThumbnailGenerator.start(uGCThumbnailGenerateParams, C35540bm.m79039a(this, tXThumbnailListener, list, uGCThumbnailGenerator));
        this.mAllThumbnailGeneratorList.add(uGCThumbnailGenerator);
    }

    private void getAllMediaFormatFromSource(List<String> list) {
        if (!CollectionUtils.isEmpty(list)) {
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                MediaExtractor mediaExtractorBuild = new MediaExtractorBuilder().setPath(it.next()).build();
                if (mediaExtractorBuild != null) {
                    int trackCount = mediaExtractorBuild.getTrackCount();
                    for (int i11 = 0; i11 < trackCount; i11++) {
                        MediaFormat trackFormat = mediaExtractorBuild.getTrackFormat(i11);
                        String string = trackFormat.getString("mime");
                        if (string != null) {
                            if (string.startsWith("video/")) {
                                this.mVideoFormatList.add(trackFormat);
                            }
                            if (string.startsWith("audio/")) {
                                this.mAudioFormatList.add(trackFormat);
                            }
                        }
                    }
                } else {
                    LiteavLog.m76083e(TAG, "build extractor fail.");
                }
            }
        }
    }

    public static int isMediaSourceValid(String str) {
        if (TextUtils.isEmpty(str)) {
            LiteavLog.m76083e(TAG, "checkLegality: path is null.");
            return TXVideoEditConstants.ERR_SOURCE_NO_FOUND;
        }
        if (!MediaExtractorBuilder.isContentUri(str)) {
            if (!new File(str).exists()) {
                LiteavLog.m76083e(TAG, "checkLegality:source no found!");
                return TXVideoEditConstants.ERR_SOURCE_NO_FOUND;
            }
            if (!checkIsVideoType(str)) {
                LiteavLog.m76083e(TAG, "checkLegality:source type error!");
                return TXVideoEditConstants.ERR_SOURCE_DAMAGED;
            }
            return 0;
        }
        return 0;
    }

    public static /* synthetic */ void lambda$new$0(TXVideoEditer tXVideoEditer) {
        UGCInitializer.initialize();
        tXVideoEditer.mVideoProcessor.initialize();
        tXVideoEditer.mAudioProcessor.initialize();
        tXVideoEditer.mMediaListSource.initialize();
        UGCDataReport.reportDAU(1004);
    }

    public static /* synthetic */ void lambda$setCustomVideoProcessListener$2(TXVideoEditer tXVideoEditer, TXVideoCustomProcessListener tXVideoCustomProcessListener) {
        LiteavLog.m76087i(TAG, "setCustomVideoProcessListener: ".concat(String.valueOf(tXVideoCustomProcessListener)));
        tXVideoEditer.mVideoProcessor.setCustomVideoProcessListener(tXVideoCustomProcessListener);
    }

    public static /* synthetic */ void lambda$setFilter$5(TXVideoEditer tXVideoEditer, Bitmap bitmap) {
        float leftSpecialRatio;
        float rightSpecialRatio;
        LiteavLog.m76087i(TAG, "setFilter: ".concat(String.valueOf(bitmap)));
        CombineFilterInfo combineFilterInfo = tXVideoEditer.mCombineFilterInfo;
        if (combineFilterInfo != null) {
            leftSpecialRatio = combineFilterInfo.getLeftSpecialRatio();
            rightSpecialRatio = tXVideoEditer.mCombineFilterInfo.getRightSpecialRatio();
        } else {
            leftSpecialRatio = 0.5f;
            rightSpecialRatio = 0.0f;
        }
        tXVideoEditer.setFilter(bitmap, leftSpecialRatio, null, rightSpecialRatio, 1.0f);
    }

    public static /* synthetic */ void lambda$setTXVideoPreviewListener$41(TXVideoEditer tXVideoEditer, TXVideoPreviewListener tXVideoPreviewListener) {
        LiteavLog.m76087i(TAG, "setTXVideoPreviewListener: listener= ".concat(String.valueOf(tXVideoPreviewListener)));
        tXVideoEditer.mVideoPreviewListener = tXVideoPreviewListener;
    }

    public static /* synthetic */ void lambda$setThumbnailListener$35(TXVideoEditer tXVideoEditer, TXThumbnailListener tXThumbnailListener) {
        LiteavLog.m76087i(TAG, "setThumbnailListener: listener= ".concat(String.valueOf(tXThumbnailListener)));
        tXVideoEditer.mProcessThumbnailListener = tXThumbnailListener;
    }

    public static /* synthetic */ void lambda$setVideoFrameRate$52(TXVideoEditer tXVideoEditer, TXVideoEditConstants.VideoFrameRateLevel videoFrameRateLevel) {
        LiteavLog.m76087i(TAG, "set video frame rate: ".concat(String.valueOf(videoFrameRateLevel)));
        tXVideoEditer.mVideoFrameRateLevel = videoFrameRateLevel;
    }

    public static /* synthetic */ void lambda$setVideoGenerateListener$49(TXVideoEditer tXVideoEditer, TXVideoGenerateListener tXVideoGenerateListener) {
        LiteavLog.m76087i(TAG, "setVideoGenerateListener: listener= ".concat(String.valueOf(tXVideoGenerateListener)));
        tXVideoEditer.mVideoGenerateListener = tXVideoGenerateListener;
    }

    public static /* synthetic */ void lambda$setVideoProcessListener$31(TXVideoEditer tXVideoEditer, TXVideoProcessListener tXVideoProcessListener) {
        LiteavLog.m76087i(TAG, "setVideoProcessListener: listener= ".concat(String.valueOf(tXVideoProcessListener)));
        tXVideoEditer.mVideoProcessListener = tXVideoProcessListener;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void processVideoInternal() {
        if (!UGCLicenseChecker.isSimpleFunctionSupport() && !UGCLicenseChecker.isIMPluginFunctionSupport()) {
            this.mMainHandler.post(RunnableC35498aj.m78999a(this.mVideoProcessListener));
            return;
        }
        UGCDataReport.reportDAU(1034);
        LiteavLog.m76087i(TAG, "processVideoInternal");
        String strGenerateVideoPath = generateVideoPath();
        this.mProcessOutputPath = strGenerateVideoPath;
        this.mRecordOutputPath = strGenerateVideoPath;
        boolean zIsFullIFrame = isFullIFrame(this.mSourcePath);
        UGCTranscodeVideoEncodeParamsDecider uGCTranscodeVideoEncodeParamsDecider = new UGCTranscodeVideoEncodeParamsDecider();
        uGCTranscodeVideoEncodeParamsDecider.setFullIFrame(true);
        uGCTranscodeVideoEncodeParamsDecider.setEncodeRotation(this.mRotation);
        uGCTranscodeVideoEncodeParamsDecider.setOutputResolution(4);
        uGCTranscodeVideoEncodeParamsDecider.setInputVideoMediaFormat(this.mVideoFormatList);
        this.mVideoEncodeParams = uGCTranscodeVideoEncodeParamsDecider.getDecidedEncodeParams();
        UGCTranscodeAudioEncodeParamsDecider uGCTranscodeAudioEncodeParamsDecider = new UGCTranscodeAudioEncodeParamsDecider();
        uGCTranscodeAudioEncodeParamsDecider.setInputAudioMediaFormat(this.mAudioFormatList);
        this.mAudioEncodeParams = uGCTranscodeAudioEncodeParamsDecider.getDecidedEncodeParams();
        LiteavLog.m76087i(TAG, "processVideoInternal: hasIFramePerMinute= " + isGopEqualOne(this.mSourcePath) + ", inputFullIFrame= " + zIsFullIFrame + ",mProcessOutputPath= " + this.mProcessOutputPath);
        this.mIsProcessToFullKeyFrame = true;
        this.mLastVideoEncodeProgress = 0.0f;
        if (!zIsFullIFrame) {
            startProcessVideo(UGCVideoEncoderJNI.EncoderType.HARDWARE);
            this.mNeedWaitProcessFullI = true;
        } else {
            this.mNeedWaitProcessFullI = false;
        }
        startThumbnailGeneratorByProcess(this.mVideoEncodeParams, zIsFullIFrame);
    }

    private void startMP4Writer(String str) {
        LiteavLog.m76087i(TAG, "startMP4Writer ".concat(String.valueOf(str)));
        MP4Writer mP4Writer = new MP4Writer();
        this.mMp4Writer = mP4Writer;
        mP4Writer.setListener(this.mMp4WriterListener);
        if (!CollectionUtils.isEmpty(this.mAudioFormatList) || this.mHasBGM) {
            this.mMp4Writer.setHasAudio(true);
        }
        this.mMp4Writer.setHasVideo(true);
        this.mMp4Writer.setPath(str);
        Map<String, String> map = this.mMetaData;
        if (map != null) {
            this.mMp4Writer.setFileMetaData(map);
        } else {
            this.mMp4Writer.setFileMetaData(getAIGCMetaData());
        }
        this.mMp4Writer.start();
    }

    private void startProcessVideo(UGCVideoEncoderJNI.EncoderType encoderType) {
        doStopPlayInner();
        MP4Writer mP4Writer = this.mMp4Writer;
        if (mP4Writer != null) {
            mP4Writer.setListener(null);
            this.mMp4Writer.stop();
        }
        this.mIsGenerating = true;
        startMP4Writer(this.mRecordOutputPath);
        this.mIsDecodeError = false;
        this.mIsEncodeError = false;
        this.mIsVideoEncoderStarted = false;
        this.mIsAudioEncoderStarted = false;
        this.mVideoProcessor.setVideoEncodedFrameListener(this.mVideoEncodedFrameListener);
        this.mAudioProcessor.setAudioEncodedFrameListener(this.mAudioEncodedFrameListener);
        this.mAVSyncer.setSyncMode(UGCAVSyncer.SyncMode.INTERLEAVE_OUTPUT_WITHOUT_SKIP);
        this.mAVSyncer.start();
        this.mIsGenerateAudioEnd = false;
        this.mIsGenerateVideoEnd = false;
        this.mMediaListSource.setPlayEndTime(Long.MAX_VALUE);
        this.mMediaListSource.setVideoSourceRange(this.mCutStartTimeMs, this.mCutEndTimeMs);
        UGCVideoProcessor uGCVideoProcessor = this.mVideoProcessor;
        VideoEncodeParams videoEncodeParams = this.mVideoEncodeParams;
        uGCVideoProcessor.setOutputSize(videoEncodeParams.width, videoEncodeParams.height, GLConstants.GLScaleType.FIT_CENTER);
        this.mVideoProcessor.setEncodeParams(this.mVideoEncodeParams);
        this.mVideoProcessor.start(true, encoderType);
        this.mAudioProcessor.setEncodeParams(this.mAudioEncodeParams);
        this.mAudioProcessor.start(true);
    }

    public void deleteAllEffect() {
        if (!UGCLicenseChecker.isStandardFunctionSupport()) {
            LiteavLog.m76083e(TAG, "deleteAllEffect is not supported in UGSV_Lite license");
        } else {
            this.mSequenceTaskRunner.mo76133a(RunnableC35491ac.m78992a(this));
        }
    }

    public void deleteLastEffect() {
        if (!UGCLicenseChecker.isStandardFunctionSupport()) {
            LiteavLog.m76083e(TAG, "deleteLastEffect is not supported in UGSV_Lite license");
        } else {
            this.mSequenceTaskRunner.mo76133a(RunnableC35490ab.m78991a(this));
        }
    }

    public void deleteLastTransitionEffect() {
        if (!UGCLicenseChecker.isStandardFunctionSupport()) {
            LiteavLog.m76083e(TAG, "deleteLastTransitionEffect is not supported in UGSV_Lite license");
        } else {
            this.mSequenceTaskRunner.mo76133a(RunnableC35851x.m79333a(this));
        }
    }

    public void setAnimatedPasterList(List<TXVideoEditConstants.TXAnimatedPaster> list) {
        if (!UGCLicenseChecker.isStandardFunctionSupport()) {
            LiteavLog.m76083e(TAG, "setAnimatedPasterList is not supported in UGSV_Lite license");
        } else {
            UGCDataReport.reportDAU(1026);
            this.mSequenceTaskRunner.mo76133a(RunnableC35768q.m79258a(this, list));
        }
    }

    public int setBGM(String str) {
        boolean z11;
        int iIsBGMValid;
        if (!UGCLicenseChecker.isStandardFunctionSupport() && !UGCLicenseChecker.isIMPluginFunctionSupport()) {
            LiteavLog.m76083e(TAG, "setBGM is not supported in UGSV_Lite license");
            return 0;
        }
        LiteavLog.m76087i(TAG, "setBGM: path= ".concat(String.valueOf(str)));
        if (!TextUtils.isEmpty(str)) {
            iIsBGMValid = isBGMValid(str);
            z11 = false;
        } else {
            LiteavLog.m76083e(TAG, " setBGM: bgm path is empty.");
            z11 = true;
            iIsBGMValid = 0;
        }
        if (iIsBGMValid != 0) {
            LiteavLog.m76083e(TAG, " bgm file is invalid. error code  ".concat(String.valueOf(iIsBGMValid)));
            return iIsBGMValid;
        }
        this.mSequenceTaskRunner.mo76133a(RunnableC35696g.m79190a(this, str, z11));
        UGCDataReport.reportDAU(1024);
        return 0;
    }

    public void setBGMAtVideoTime(long j11) {
        if (!UGCLicenseChecker.isStandardFunctionSupport() && !UGCLicenseChecker.isIMPluginFunctionSupport()) {
            LiteavLog.m76083e(TAG, "setBGMAtVideoTime is not supported in UGSV_Lite license");
        } else {
            this.mSequenceTaskRunner.mo76133a(RunnableC35748i.m79242a(this, j11));
        }
    }

    public void setBGMFadeInOutDuration(long j11, long j12) {
        if (!UGCLicenseChecker.isStandardFunctionSupport() && !UGCLicenseChecker.isIMPluginFunctionSupport()) {
            LiteavLog.m76083e(TAG, "setBGMFadeInOutDuration is not supported in UGSV_Lite license");
        } else {
            this.mSequenceTaskRunner.mo76133a(RunnableC35751l.m79245a(this, j11, j12));
        }
    }

    public void setBGMLoop(boolean z11) {
        if (!UGCLicenseChecker.isStandardFunctionSupport() && !UGCLicenseChecker.isIMPluginFunctionSupport()) {
            LiteavLog.m76083e(TAG, "setBGMLoop is not supported in UGSV_Lite license");
        } else {
            this.mSequenceTaskRunner.mo76133a(RunnableC35723h.m79217a(this, z11));
        }
    }

    public void setBGMStartTime(long j11, long j12) {
        if (!UGCLicenseChecker.isStandardFunctionSupport() && !UGCLicenseChecker.isIMPluginFunctionSupport()) {
            LiteavLog.m76083e(TAG, "setBGMStartTime is not supported in UGSV_Lite license");
        } else {
            this.mSequenceTaskRunner.mo76133a(RunnableC35749j.m79243a(this, j11, j12));
        }
    }

    public void setBGMVolume(float f11) {
        if (!UGCLicenseChecker.isStandardFunctionSupport() && !UGCLicenseChecker.isIMPluginFunctionSupport()) {
            LiteavLog.m76083e(TAG, "setBGMVolume is not supported in UGSV_Lite license");
        } else {
            this.mSequenceTaskRunner.mo76133a(RunnableC35750k.m79244a(this, f11));
        }
    }

    public void setBeautyFilter(int i11, int i12) {
        if (!UGCLicenseChecker.isStandardFunctionSupport() && !UGCLicenseChecker.isIMPluginFunctionSupport()) {
            LiteavLog.m76083e(TAG, "setBeautyFilter is not supported in UGSV_Lite license");
        } else {
            this.mSequenceTaskRunner.mo76133a(RunnableC35555ca.m79054a(this, i11, i12));
        }
    }

    public void setDurationControlMode(TXVideoJoiner.DurationControlMode durationControlMode) {
        LiteavLog.m76087i(TAG, "set duration control mode ".concat(String.valueOf(durationControlMode)));
        this.mSequenceTaskRunner.mo76133a(RunnableC35520be.m79021a(this, durationControlMode));
    }

    public void setMetaData(Map<String, String> map) {
        LiteavLog.m76087i(TAG, "set meta data : ".concat(String.valueOf(map)));
        this.mMetaData = map;
    }

    public void setPasterList(List<TXVideoEditConstants.TXPaster> list) {
        if (!UGCLicenseChecker.isStandardFunctionSupport() && !UGCLicenseChecker.isIMPluginFunctionSupport()) {
            LiteavLog.m76083e(TAG, "setPasterList is not supported in UGSV_Lite license");
        } else {
            UGCDataReport.reportDAU(1025);
            this.mSequenceTaskRunner.mo76133a(RunnableC35769r.m79259a(this, list));
        }
    }

    public int setPictureList(List<Bitmap> list, int i11) {
        if (!UGCLicenseChecker.isStandardFunctionSupport()) {
            LiteavLog.m76083e(TAG, "setPictureList is not supported in UGSV_Lite license");
            return -1;
        }
        UGCDataReport.reportDAU(1030);
        this.mSequenceTaskRunner.mo76133a(RunnableC35631e.m79127a(this, i11, list));
        return 0;
    }

    public long setPictureTransition(int i11) {
        if (!UGCLicenseChecker.isStandardFunctionSupport()) {
            LiteavLog.m76083e(TAG, "setPictureTransition is not supported in UGSV_Lite license");
            return 0L;
        }
        this.mSequenceTaskRunner.m76135b(RunnableC35669f.m79163a(this, i11));
        return this.mMediaListSource.getDuration();
    }

    public void setRenderRotation(int i11) {
        if (!UGCLicenseChecker.isStandardFunctionSupport() && !UGCLicenseChecker.isIMPluginFunctionSupport()) {
            LiteavLog.m76083e(TAG, "setRenderRotation is not supported in UGSV_Lite license");
        } else {
            this.mSequenceTaskRunner.mo76133a(RunnableC35803s.m79290a(this, i11));
        }
    }

    public void setRepeatPlay(List<TXVideoEditConstants.TXRepeat> list) {
        if (!UGCLicenseChecker.isStandardFunctionSupport()) {
            LiteavLog.m76083e(TAG, "setRepeatPlay is not supported in UGSV_Lite license");
        } else {
            UGCDataReport.reportDAU(1020);
            this.mSequenceTaskRunner.mo76133a(RunnableC35805u.m79292a(this, list));
        }
    }

    public void setReverse(boolean z11) {
        if (!UGCLicenseChecker.isStandardFunctionSupport()) {
            LiteavLog.m76083e(TAG, "setReverse is not supported in UGSV_Lite license");
        } else {
            UGCDataReport.reportDAU(1021);
            this.mSequenceTaskRunner.mo76133a(RunnableC35806v.m79293a(this, z11));
        }
    }

    public void setSpecialRatio(float f11) {
        if (!UGCLicenseChecker.isStandardFunctionSupport() && !UGCLicenseChecker.isIMPluginFunctionSupport()) {
            LiteavLog.m76083e(TAG, "setSpecialRatio is not supported in UGSV_Lite license");
        } else {
            this.mSequenceTaskRunner.mo76133a(RunnableC35534bg.m79033a(this, f11));
        }
    }

    public void setSpeedList(List<TXVideoEditConstants.TXSpeed> list) {
        if (!UGCLicenseChecker.isStandardFunctionSupport()) {
            LiteavLog.m76083e(TAG, "setSpeedList is not supported in UGSV_Lite license");
        } else {
            UGCDataReport.reportDAU(1019);
            this.mSequenceTaskRunner.mo76133a(RunnableC35804t.m79291a(this, list));
        }
    }

    public void setSubtitleList(List<TXVideoEditConstants.TXSubtitle> list) {
        if (!UGCLicenseChecker.isStandardFunctionSupport() && !UGCLicenseChecker.isIMPluginFunctionSupport()) {
            LiteavLog.m76083e(TAG, "setSubtitleList is not supported in UGSV_Lite license");
        } else {
            UGCDataReport.reportDAU(1027);
            this.mSequenceTaskRunner.mo76133a(RunnableC35755p.m79249a(this, list));
        }
    }

    public void setTailWaterMark(Bitmap bitmap, TXVideoEditConstants.TXRect tXRect, int i11) {
        if (!UGCLicenseChecker.isStandardFunctionSupport()) {
            LiteavLog.m76083e(TAG, "setTailWaterMark is not supported in UGSV_Lite license");
        } else {
            UGCDataReport.reportDAU(1029);
            this.mSequenceTaskRunner.mo76133a(RunnableC35753n.m79247a(this, i11, bitmap, tXRect));
        }
    }

    public int setVideoPath(String str) {
        LiteavLog.m76087i(TAG, "setVideoPath ".concat(String.valueOf(str)));
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        int iIsMediaSourceValid = isMediaSourceValid(str);
        if (iIsMediaSourceValid != 0) {
            LiteavLog.m76083e(TAG, "setVideoPath " + str + " is illegal." + iIsMediaSourceValid);
            return iIsMediaSourceValid;
        }
        this.mSequenceTaskRunner.mo76133a(RunnableC35853z.m79335a(this, str));
        return 0;
    }

    public void setWaterMark(Bitmap bitmap, TXVideoEditConstants.TXRect tXRect) {
        if (!UGCLicenseChecker.isStandardFunctionSupport()) {
            LiteavLog.m76083e(TAG, "setWaterMark is not supported in UGSV_Lite license");
        } else {
            UGCDataReport.reportDAU(1028);
            this.mSequenceTaskRunner.mo76133a(RunnableC35752m.m79246a(this, tXRect, bitmap));
        }
    }

    public void startEffect(int i11, long j11) {
        if (!UGCLicenseChecker.isStandardFunctionSupport()) {
            LiteavLog.m76083e(TAG, "startEffect is not supported in UGSV_Lite license");
        } else {
            UGCDataReport.reportDAU(1022, i11, "");
            this.mSequenceTaskRunner.mo76133a(RunnableC35852y.m79334a(this, i11, j11));
        }
    }

    public void stopEffect(int i11, long j11) {
        if (!UGCLicenseChecker.isStandardFunctionSupport()) {
            LiteavLog.m76083e(TAG, "stopEffect is not supported in UGSV_Lite license");
        } else {
            this.mSequenceTaskRunner.mo76133a(RunnableC35489aa.m78990a(this, i11, j11));
        }
    }

    public void setFilter(Bitmap bitmap, float f11, Bitmap bitmap2, float f12, float f13) {
        if (!UGCLicenseChecker.isStandardFunctionSupport() && !UGCLicenseChecker.isIMPluginFunctionSupport()) {
            LiteavLog.m76083e(TAG, "setFilter is not supported in UGSV_Lite license");
        } else {
            this.mSequenceTaskRunner.mo76133a(RunnableC35553bz.m79052a(this, f11, f12, f13, bitmap, bitmap2));
        }
    }
}
