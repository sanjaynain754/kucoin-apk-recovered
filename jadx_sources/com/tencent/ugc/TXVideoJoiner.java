package com.tencent.ugc;

import android.content.Context;
import android.text.TextUtils;
import com.tencent.liteav.base.ContextUtils;
import com.tencent.liteav.base.util.C34748m;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.ugc.datereport.UGCDataReport;
import com.tencent.ugc.videobase.utils.CollectionUtils;
import java.io.File;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class TXVideoJoiner {
    private static final String TAG = "TXVideoJoiner";
    private final Context mContext;
    private Map<String, String> mMetaData;
    private RemuxJoiner mRemuxJoiner;
    private final C34748m mSequenceTaskRunner;
    private List<TXVideoEditConstants.TXAbsoluteRect> mSplitScreenRects;
    private TXVideoEditer mTXVideoEditer;
    private TXVideoJoinerListener mTXVideoJoinerListener;
    private TXVideoPreviewListener mTXVideoPreviewListener;
    private TXVideoEditConstants.TXPreviewParam mTxPreviewParam;
    private String mVideoOutputPath;
    private List<String> mVideoSourceList;
    private float[] mVideoVolumes;
    private boolean mIsNeedEdit = false;
    private int mProfile = -1;
    private int mSplitScreenCanvasWidth = -1;
    private int mSplitScreenCanvasHeight = -1;
    private DurationControlMode mDurationControlMode = DurationControlMode.ALIGNS_TO_LONGEST;
    private final TXVideoEditer.TXVideoPreviewListener mTXEditerVideoPreviewListener = new C354751();
    private final TXVideoEditer.TXVideoGenerateListener mTXEditerVideoJoinerListener = new TXVideoEditer.TXVideoGenerateListener() { // from class: com.tencent.ugc.TXVideoJoiner.2
        @Override // com.tencent.ugc.TXVideoEditer.TXVideoGenerateListener
        public final void onGenerateComplete(TXVideoEditConstants.TXGenerateResult tXGenerateResult) {
            TXVideoJoiner.this.notifyJoinComplete(tXGenerateResult.retCode, tXGenerateResult.descMsg);
        }

        @Override // com.tencent.ugc.TXVideoEditer.TXVideoGenerateListener
        public final void onGenerateProgress(float f11) {
            TXVideoJoiner.this.notifyJoinProgress(f11);
        }
    };
    private final RemuxJoiner.RemuxJoinerListener mRemuxJoinerListener = new C354773();

    /* JADX INFO: renamed from: com.tencent.ugc.TXVideoJoiner$1 */
    public class C354751 implements TXVideoEditer.TXVideoPreviewListener {
        public C354751() {
        }

        @Override // com.tencent.ugc.TXVideoEditer.TXVideoPreviewListener
        public final void onPreviewFinished() {
            TXVideoJoiner.this.mSequenceTaskRunner.mo76133a(RunnableC35586dd.m79082a(this));
            TXVideoPreviewListener tXVideoPreviewListener = TXVideoJoiner.this.mTXVideoPreviewListener;
            if (tXVideoPreviewListener != null) {
                tXVideoPreviewListener.onPreviewFinished();
            }
        }

        @Override // com.tencent.ugc.TXVideoEditer.TXVideoPreviewListener
        public final void onPreviewProgress(int i11) {
            TXVideoPreviewListener tXVideoPreviewListener = TXVideoJoiner.this.mTXVideoPreviewListener;
            if (tXVideoPreviewListener != null) {
                tXVideoPreviewListener.onPreviewProgress(i11);
            }
        }
    }

    /* JADX INFO: renamed from: com.tencent.ugc.TXVideoJoiner$3 */
    public class C354773 implements RemuxJoiner.RemuxJoinerListener {
        public C354773() {
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ void m78978a(C354773 c354773, int i11, String str) {
            TXVideoJoiner.this.notifyJoinComplete(i11, str);
            TXVideoJoiner.this.destroyRemuxJoiner();
        }

        @Override // com.tencent.ugc.RemuxJoiner.RemuxJoinerListener
        public final void onRemuxJoinerComplete(int i11, String str) {
            TXVideoJoiner.this.mSequenceTaskRunner.mo76133a(RunnableC35610df.m79106a(this, i11, str));
        }

        @Override // com.tencent.ugc.RemuxJoiner.RemuxJoinerListener
        public final void onRemuxJoinerProgress(float f11) {
            TXVideoJoiner.this.mSequenceTaskRunner.mo76133a(RunnableC35587de.m79083a(this, f11));
        }
    }

    public enum DurationControlMode {
        ALIGNS_TO_LONGEST,
        ALIGNS_TO_SHORTEST
    }

    public static class SplitScreenParam {
        public int canvasHeight;
        public int canvasWidth;
        public DurationControlMode durationControlMode;
        public List<TXVideoEditConstants.TXAbsoluteRect> rects;
    }

    public interface TXVideoJoinerListener {
        void onJoinComplete(TXVideoEditConstants.TXJoinerResult tXJoinerResult);

        void onJoinProgress(float f11);
    }

    public interface TXVideoPreviewListener {
        void onPreviewFinished();

        void onPreviewProgress(int i11);
    }

    public void setSplitScreenList(List<TXVideoEditConstants.TXAbsoluteRect> list, int i11, int i12) {
        SplitScreenParam splitScreenParam = new SplitScreenParam();
        splitScreenParam.rects = list;
        splitScreenParam.canvasWidth = i11;
        splitScreenParam.canvasHeight = i12;
        splitScreenParam.durationControlMode = this.mDurationControlMode;
        setSplitScreenList(splitScreenParam);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void destroyRemuxJoiner() {
        RemuxJoiner remuxJoiner = this.mRemuxJoiner;
        if (remuxJoiner != null) {
            remuxJoiner.stop();
            this.mRemuxJoiner.uninitialize();
            this.mRemuxJoiner = null;
        }
    }

    private void destroyVideoEditer() {
        TXVideoEditer tXVideoEditer = this.mTXVideoEditer;
        if (tXVideoEditer != null) {
            tXVideoEditer.cancel();
            this.mTXVideoEditer.release();
            this.mTXVideoEditer = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void joinVideoInternal(int i11, String str, boolean z11) {
        List<String> list = this.mVideoSourceList;
        if (list == null || list.isEmpty()) {
            LiteavLog.m76093w(TAG, "video source is null or empty");
            return;
        }
        destroyVideoEditer();
        TXVideoEditer tXVideoEditer = new TXVideoEditer(this.mContext, this.mSequenceTaskRunner);
        this.mTXVideoEditer = tXVideoEditer;
        tXVideoEditer.setMediaSourcePaths(this.mVideoSourceList);
        if (z11 && !CollectionUtils.isEmpty(this.mSplitScreenRects)) {
            this.mTXVideoEditer.setIsSplitScreen(true);
            this.mTXVideoEditer.setDurationControlMode(this.mDurationControlMode);
            this.mTXVideoEditer.setSplitScreenList(this.mSplitScreenRects, this.mSplitScreenCanvasWidth, this.mSplitScreenCanvasHeight);
            float[] fArr = this.mVideoVolumes;
            if (fArr != null) {
                this.mTXVideoEditer.setVideoVolumes(fArr);
            }
        }
        this.mTXVideoEditer.setVideoGenerateListener(this.mTXEditerVideoJoinerListener);
        this.mTXVideoEditer.setIsFullIFrame(this.mIsNeedEdit);
        this.mTXVideoEditer.setProfile(this.mProfile);
        this.mTXVideoEditer.setMetaData(this.mMetaData);
        this.mTXVideoEditer.generateVideo(i11, str);
    }

    public static /* synthetic */ void lambda$initWithPreview$1(TXVideoJoiner tXVideoJoiner, TXVideoEditConstants.TXPreviewParam tXPreviewParam) {
        tXVideoJoiner.mTxPreviewParam = tXPreviewParam;
        TXVideoEditer tXVideoEditer = tXVideoJoiner.mTXVideoEditer;
        if (tXVideoEditer != null) {
            tXVideoEditer.initWithPreview(tXPreviewParam);
        }
    }

    public static /* synthetic */ void lambda$notifyJoinComplete$15(TXVideoJoiner tXVideoJoiner) {
        TXVideoEditer tXVideoEditer = tXVideoJoiner.mTXVideoEditer;
        if (tXVideoEditer != null) {
            tXVideoEditer.release();
            tXVideoJoiner.mTXVideoEditer = null;
        }
    }

    public static /* synthetic */ void lambda$pausePlay$4(TXVideoJoiner tXVideoJoiner) {
        TXVideoEditer tXVideoEditer = tXVideoJoiner.mTXVideoEditer;
        if (tXVideoEditer != null) {
            tXVideoEditer.pausePlay();
        }
    }

    public static /* synthetic */ void lambda$resumePlay$5(TXVideoJoiner tXVideoJoiner) {
        TXVideoEditer tXVideoEditer = tXVideoJoiner.mTXVideoEditer;
        if (tXVideoEditer != null) {
            tXVideoEditer.resumePlay();
        }
    }

    public static /* synthetic */ void lambda$setSplitScreenList$11(TXVideoJoiner tXVideoJoiner, SplitScreenParam splitScreenParam) {
        List<TXVideoEditConstants.TXAbsoluteRect> list = splitScreenParam.rects;
        tXVideoJoiner.mSplitScreenRects = list;
        int i11 = splitScreenParam.canvasWidth;
        tXVideoJoiner.mSplitScreenCanvasWidth = i11;
        int i12 = splitScreenParam.canvasHeight;
        tXVideoJoiner.mSplitScreenCanvasHeight = i12;
        tXVideoJoiner.mDurationControlMode = splitScreenParam.durationControlMode;
        TXVideoEditer tXVideoEditer = tXVideoJoiner.mTXVideoEditer;
        if (tXVideoEditer != null) {
            tXVideoEditer.setSplitScreenList(list, i11, i12);
            tXVideoJoiner.mTXVideoEditer.setDurationControlMode(splitScreenParam.durationControlMode);
        }
    }

    public static /* synthetic */ void lambda$startPlay$3(TXVideoJoiner tXVideoJoiner) {
        List<String> list = tXVideoJoiner.mVideoSourceList;
        if (list == null || list.isEmpty()) {
            LiteavLog.m76093w(TAG, "video source is null or empty");
            return;
        }
        tXVideoJoiner.stopPlayInternal();
        TXVideoEditer tXVideoEditer = new TXVideoEditer(tXVideoJoiner.mContext, tXVideoJoiner.mSequenceTaskRunner);
        tXVideoJoiner.mTXVideoEditer = tXVideoEditer;
        tXVideoEditer.setMediaSourcePaths(tXVideoJoiner.mVideoSourceList);
        tXVideoJoiner.mTXVideoEditer.initWithPreview(tXVideoJoiner.mTxPreviewParam);
        if (!CollectionUtils.isEmpty(tXVideoJoiner.mSplitScreenRects)) {
            tXVideoJoiner.mTXVideoEditer.setIsSplitScreen(true);
            tXVideoJoiner.mTXVideoEditer.setDurationControlMode(tXVideoJoiner.mDurationControlMode);
            tXVideoJoiner.mTXVideoEditer.setSplitScreenList(tXVideoJoiner.mSplitScreenRects, tXVideoJoiner.mSplitScreenCanvasWidth, tXVideoJoiner.mSplitScreenCanvasHeight);
            float[] fArr = tXVideoJoiner.mVideoVolumes;
            if (fArr != null) {
                tXVideoJoiner.mTXVideoEditer.setVideoVolumes(fArr);
            }
        }
        tXVideoJoiner.mTXVideoEditer.setTXVideoPreviewListener(tXVideoJoiner.mTXEditerVideoPreviewListener);
        tXVideoJoiner.mTXVideoEditer.startPlayFromTime(0L, 2147483647L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void notifyJoinComplete(int i11, String str) {
        this.mSequenceTaskRunner.mo76133a(RunnableC35576cu.m79072a(this));
        TXVideoEditConstants.TXJoinerResult tXJoinerResult = new TXVideoEditConstants.TXJoinerResult();
        tXJoinerResult.descMsg = str;
        tXJoinerResult.retCode = i11;
        LiteavLog.m76087i(TAG, "TXGenerateResult descMsg = " + str + " retCode = " + i11);
        TXVideoJoinerListener tXVideoJoinerListener = this.mTXVideoJoinerListener;
        if (tXVideoJoinerListener != null) {
            tXVideoJoinerListener.onJoinComplete(tXJoinerResult);
        }
        if (i11 == 0 && !TextUtils.isEmpty(this.mVideoOutputPath) && new File(this.mVideoOutputPath).exists()) {
            UGCDataReport.reportDAU(1032, (int) new File(this.mVideoOutputPath).length(), "");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void notifyJoinProgress(float f11) {
        TXVideoJoinerListener tXVideoJoinerListener = this.mTXVideoJoinerListener;
        if (tXVideoJoinerListener != null) {
            tXVideoJoinerListener.onJoinProgress(f11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void stopPlayInternal() {
        LiteavLog.m76087i(TAG, "stopPlayInternal");
        TXVideoEditer tXVideoEditer = this.mTXVideoEditer;
        if (tXVideoEditer != null) {
            tXVideoEditer.stopPlay();
            this.mTXVideoEditer.release();
            this.mTXVideoEditer = null;
        }
    }

    public void cancel() {
        LiteavLog.m76087i(TAG, "cancel");
        this.mSequenceTaskRunner.mo76133a(RunnableC35571cp.m79067a(this));
    }

    public void initWithPreview(TXVideoEditConstants.TXPreviewParam tXPreviewParam) {
        if (tXPreviewParam == null) {
            LiteavLog.m76093w(TAG, "init with preview. param is null");
            return;
        }
        LiteavLog.m76087i(TAG, "initWithPreview videoView = " + tXPreviewParam.videoView);
        this.mSequenceTaskRunner.mo76133a(RunnableC35577cv.m79073a(this, tXPreviewParam));
    }

    public void joinVideo(int i11, String str) {
        LiteavLog.m76087i(TAG, "joinVideo videoCompressed " + i11 + " videoOutputPath = " + str);
        if (UGCLicenseChecker.isStandardFunctionSupport() || UGCLicenseChecker.isIMPluginFunctionSupport()) {
            this.mVideoOutputPath = str;
            this.mSequenceTaskRunner.mo76133a(RunnableC35569co.m79066a(this, str, i11));
        } else {
            LiteavLog.m76083e(TAG, "joinVideo is not support on smart version");
            notifyJoinComplete(-5, "licence verify failed");
        }
    }

    public void pausePlay() {
        LiteavLog.m76087i(TAG, "pausePlay");
        this.mSequenceTaskRunner.mo76133a(RunnableC35580cy.m79076a(this));
    }

    public void resumePlay() {
        LiteavLog.m76087i(TAG, "resumePlay");
        this.mSequenceTaskRunner.mo76133a(RunnableC35581cz.m79077a(this));
    }

    public void setNeedEdit(boolean z11) {
        LiteavLog.m76087i(TAG, "setNeedEdit = ".concat(String.valueOf(z11)));
        this.mSequenceTaskRunner.mo76133a(RunnableC35575ct.m79071a(this, z11));
    }

    public void setProfile(int i11) {
        LiteavLog.m76087i(TAG, "setProfile profile ".concat(String.valueOf(i11)));
        this.mSequenceTaskRunner.mo76133a(RunnableC35585dc.m79081a(this, i11));
    }

    public void setTXVideoPreviewListener(TXVideoPreviewListener tXVideoPreviewListener) {
        LiteavLog.m76087i(TAG, "setTXVideoPreviewListener");
        this.mSequenceTaskRunner.mo76133a(RunnableC35578cw.m79074a(this, tXVideoPreviewListener));
    }

    public void setVideoJoinerListener(TXVideoJoinerListener tXVideoJoinerListener) {
        LiteavLog.m76087i(TAG, "setVideoJoinerListener");
        this.mSequenceTaskRunner.mo76133a(RunnableC35584db.m79080a(this, tXVideoJoinerListener));
    }

    public void setVideoVolumes(List<Float> list) {
        LiteavLog.m76087i(TAG, "setVideoVolumes");
        this.mSequenceTaskRunner.mo76133a(RunnableC35573cr.m79069a(this, list));
    }

    public void splitJoinVideo(int i11, String str) {
        LiteavLog.m76087i(TAG, "splitJoinVideo video Compressed = " + i11 + " videoOutputPath = " + str);
        if (!UGCLicenseChecker.isStandardFunctionSupport() && !UGCLicenseChecker.isIMPluginFunctionSupport()) {
            LiteavLog.m76083e(TAG, "splitJoinVideo is not support on smart version");
            notifyJoinComplete(-5, "licence verify failed");
        } else {
            this.mVideoOutputPath = str;
            this.mSequenceTaskRunner.mo76133a(RunnableC35574cs.m79070a(this, i11, str));
            UGCDataReport.reportDAU(1031);
        }
    }

    public void startPlay() {
        LiteavLog.m76087i(TAG, "startPlay");
        this.mSequenceTaskRunner.mo76133a(RunnableC35579cx.m79075a(this));
    }

    public void stopPlay() {
        LiteavLog.m76087i(TAG, "stopPlay");
        this.mSequenceTaskRunner.mo76133a(RunnableC35583da.m79079a(this));
    }

    public TXVideoJoiner(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.mContext = applicationContext;
        ContextUtils.initApplicationContext(applicationContext);
        ContextUtils.setDataDirectorySuffix("liteav");
        this.mSequenceTaskRunner = new C34748m();
        UGCDataReport.reportDAU(1005);
    }

    public static /* synthetic */ void lambda$cancel$10(TXVideoJoiner tXVideoJoiner) {
        tXVideoJoiner.destroyRemuxJoiner();
        tXVideoJoiner.destroyVideoEditer();
    }

    public static /* synthetic */ void lambda$joinVideo$9(TXVideoJoiner tXVideoJoiner, String str, int i11) {
        if (tXVideoJoiner.startQuickJoinVideo(str)) {
            LiteavLog.m76087i(TAG, "quickJoinVideo success");
        } else {
            tXVideoJoiner.joinVideoInternal(i11, str, false);
        }
    }

    public static /* synthetic */ void lambda$setVideoVolumes$12(TXVideoJoiner tXVideoJoiner, List list) {
        tXVideoJoiner.mVideoVolumes = new float[list.size()];
        for (int i11 = 0; i11 < list.size(); i11++) {
            tXVideoJoiner.mVideoVolumes[i11] = ((Float) list.get(i11)).floatValue();
        }
        TXVideoEditer tXVideoEditer = tXVideoJoiner.mTXVideoEditer;
        if (tXVideoEditer != null) {
            tXVideoEditer.setVideoVolumes(tXVideoJoiner.mVideoVolumes);
        }
    }

    private boolean startQuickJoinVideo(String str) {
        destroyRemuxJoiner();
        List<String> list = this.mVideoSourceList;
        if (list == null || !RemuxJoiner.isConcatableWithoutReencode(list)) {
            return false;
        }
        LiteavLog.m76087i(TAG, "RemuxerJoinerChecker check is ok");
        if (this.mRemuxJoiner == null) {
            RemuxJoiner remuxJoiner = new RemuxJoiner();
            this.mRemuxJoiner = remuxJoiner;
            remuxJoiner.initialize();
        }
        this.mRemuxJoiner.stop();
        if (!this.mRemuxJoiner.setSourcePaths(this.mVideoSourceList) || !this.mRemuxJoiner.setTargetPath(str)) {
            return false;
        }
        this.mVideoOutputPath = str;
        this.mRemuxJoiner.setVideoJoinerListener(this.mRemuxJoinerListener);
        return this.mRemuxJoiner.start();
    }

    public void setMetaData(Map<String, String> map) {
        LiteavLog.m76087i(TAG, "set meta data : ".concat(String.valueOf(map)));
        this.mSequenceTaskRunner.mo76133a(RunnableC35568cn.m79065a(this, map));
    }

    public void setRecordPath(String str) {
        LiteavLog.m76087i(TAG, "setRecordPath recordPath = ".concat(String.valueOf(str)));
    }

    public int setVideoPathList(List<String> list) {
        if (CollectionUtils.isEmpty(list)) {
            LiteavLog.m76093w(TAG, "set video path list. video source list is null or empty");
            return -1;
        }
        for (String str : list) {
            if (TextUtils.isEmpty(str)) {
                return -1;
            }
            int iIsMediaSourceValid = TXVideoEditer.isMediaSourceValid(str);
            if (iIsMediaSourceValid != 0) {
                LiteavLog.m76083e(TAG, "set video path list " + str + " is illegal. valid code is " + iIsMediaSourceValid);
                return iIsMediaSourceValid;
            }
        }
        this.mSequenceTaskRunner.mo76133a(RunnableC35567cm.m79064a(this, list));
        return 0;
    }

    public void setSplitScreenList(SplitScreenParam splitScreenParam) {
        if (splitScreenParam == null) {
            LiteavLog.m76093w(TAG, "Set split screen list. param is null");
            return;
        }
        LiteavLog.m76087i(TAG, "Set split screen list canvasWidth: " + splitScreenParam.canvasWidth + " canvasHeight:  " + splitScreenParam.canvasHeight + " durationControlMode: " + splitScreenParam.durationControlMode);
        this.mSequenceTaskRunner.mo76133a(RunnableC35572cq.m79068a(this, splitScreenParam));
    }
}
