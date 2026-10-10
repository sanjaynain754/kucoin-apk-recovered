package com.tencent.ugc;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import com.tencent.liteav.base.ContextUtils;
import com.tencent.liteav.base.system.LiteavSystemInfo;
import com.tencent.liteav.base.util.C34741f;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.ugc.common.MediaExtractorBuilder;
import com.tencent.ugc.common.VideoFrameRetriever;
import com.tencent.ugc.retriver.FFmpegMediaRetriever;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes2.dex */
public class TXVideoInfoReader {
    private static final int RETRY_MAX_COUNT = 3;
    private static TXVideoInfoReader sInstance;
    private final String TAG;
    private Context mContext;
    private int mCount;
    private C35474a mGenerateImageThread;
    private volatile WeakReference<OnSampleProgrocess> mListener;
    private final Handler mMainHandler;
    private final AtomicInteger mRetryTimes;

    public interface OnSampleProgrocess {
        void sampleProcess(int i11, Bitmap bitmap);
    }

    /* JADX INFO: renamed from: com.tencent.ugc.TXVideoInfoReader$a */
    public class C35474a extends Thread {

        /* JADX INFO: renamed from: b */
        private final String f76686b;

        /* JADX INFO: renamed from: c */
        private volatile Bitmap f76687c;

        /* JADX INFO: renamed from: d */
        private final int f76688d;

        public C35474a(String str) {
            this.f76688d = TXVideoInfoReader.this.mListener.hashCode();
            this.f76686b = str;
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ void m78975a(C35474a c35474a, String str) {
            TXVideoInfoReader tXVideoInfoReader = TXVideoInfoReader.this;
            tXVideoInfoReader.getSampleImages(tXVideoInfoReader.mCount, str, (OnSampleProgrocess) TXVideoInfoReader.this.mListener.get());
            TXVideoInfoReader.this.mRetryTimes.getAndIncrement();
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public final void run() {
            final OnSampleProgrocess onSampleProgrocess;
            long videoDurationMs = new FFmpegMediaRetriever().getVideoDurationMs() * 1000;
            long j11 = TXVideoInfoReader.this.mCount > 0 ? videoDurationMs / ((long) TXVideoInfoReader.this.mCount) : videoDurationMs;
            LiteavLog.m76087i("TXVideoInfoReader", "run duration = " + videoDurationMs + " count = " + TXVideoInfoReader.this.mCount);
            VideoFrameRetriever videoFrameRetriever = new VideoFrameRetriever(this.f76686b);
            final int i11 = 0;
            while (true) {
                Bitmap bitmapCopy = null;
                if (i11 >= TXVideoInfoReader.this.mCount || Thread.currentThread().isInterrupted()) {
                    break;
                }
                long j12 = ((long) i11) * j11;
                if (j12 > videoDurationMs) {
                    j12 = videoDurationMs;
                }
                final Bitmap frameAtTime = videoFrameRetriever.getFrameAtTime(j12);
                if (frameAtTime == null) {
                    LiteavLog.m76093w("TXVideoInfoReader", "getSampleImages failed!");
                    if (i11 == 0) {
                        final String str = this.f76686b;
                        if (TXVideoInfoReader.this.mRetryTimes.get() >= 3) {
                            break;
                        }
                        LiteavLog.m76087i("TXVideoInfoReader", "retry to get sample images");
                        TXVideoInfoReader.this.mMainHandler.post(new Runnable(this, str) { // from class: com.tencent.ugc.cl

                            /* JADX INFO: renamed from: a */
                            private final TXVideoInfoReader.C35474a f76903a;

                            /* JADX INFO: renamed from: b */
                            private final String f76904b;

                            @Override // java.lang.Runnable
                            public final void run() {
                                TXVideoInfoReader.C35474a.m78975a(this.f76903a, this.f76904b);
                            }

                            {
                                this.f76903a = this;
                                this.f76904b = str;
                            }
                        });
                        break;
                    }
                    if (this.f76687c != null && !this.f76687c.isRecycled()) {
                        LiteavLog.m76087i("TXVideoInfoReader", "copy last image");
                        bitmapCopy = this.f76687c.copy(this.f76687c.getConfig(), true);
                    }
                    frameAtTime = bitmapCopy;
                }
                this.f76687c = frameAtTime;
                TXVideoInfoReader.this.mRetryTimes.set(0);
                if (TXVideoInfoReader.this.mListener != null && TXVideoInfoReader.this.mCount > 0 && TXVideoInfoReader.this.mListener.hashCode() == this.f76688d && (onSampleProgrocess = (OnSampleProgrocess) TXVideoInfoReader.this.mListener.get()) != null) {
                    TXVideoInfoReader.this.mMainHandler.post(new Runnable(onSampleProgrocess, i11, frameAtTime) { // from class: com.tencent.ugc.ck

                        /* JADX INFO: renamed from: a */
                        private final TXVideoInfoReader.OnSampleProgrocess f76900a;

                        /* JADX INFO: renamed from: b */
                        private final int f76901b;

                        /* JADX INFO: renamed from: c */
                        private final Bitmap f76902c;

                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f76900a.sampleProcess(this.f76901b, this.f76902c);
                        }

                        {
                            this.f76900a = onSampleProgrocess;
                            this.f76901b = i11;
                            this.f76902c = frameAtTime;
                        }
                    });
                }
                i11++;
            }
            videoFrameRetriever.release();
            this.f76687c = null;
        }
    }

    private TXVideoInfoReader(Context context) {
        this.TAG = "TXVideoInfoReader";
        Context applicationContext = context.getApplicationContext();
        this.mContext = applicationContext;
        ContextUtils.initApplicationContext(applicationContext);
        ContextUtils.setDataDirectorySuffix("liteav");
        this.mRetryTimes = new AtomicInteger(0);
        this.mMainHandler = new Handler(Looper.getMainLooper());
    }

    @Deprecated
    public static TXVideoInfoReader getInstance() {
        if (sInstance == null) {
            sInstance = new TXVideoInfoReader();
        }
        return sInstance;
    }

    private void cancelThread() {
        C35474a c35474a = this.mGenerateImageThread;
        if (c35474a == null || !c35474a.isAlive() || this.mGenerateImageThread.isInterrupted()) {
            return;
        }
        LiteavLog.m76087i("TXVideoInfoReader", "cancelThread: thread cancel");
        this.mGenerateImageThread.interrupt();
        this.mGenerateImageThread = null;
    }

    private Bitmap getFrameAtTime(String str, long j11) {
        VideoFrameRetriever videoFrameRetriever = new VideoFrameRetriever(str);
        Bitmap frameAtTime = videoFrameRetriever.getFrameAtTime(j11);
        videoFrameRetriever.release();
        return frameAtTime;
    }

    public void cancel() {
        LiteavLog.m76087i("TXVideoInfoReader", "cancel");
        cancelThread();
        this.mMainHandler.removeCallbacksAndMessages(null);
        if (this.mListener != null) {
            this.mListener.clear();
            this.mListener = null;
        }
    }

    public void getSampleImages(int i11, String str, OnSampleProgrocess onSampleProgrocess) {
        this.mCount = i11;
        this.mListener = new WeakReference<>(onSampleProgrocess);
        if (this.mCount <= 0) {
            LiteavLog.m76093w("TXVideoInfoReader", "getSampleImages: count is not a positive number.");
            return;
        }
        if (TextUtils.isEmpty(str)) {
            LiteavLog.m76093w("TXVideoInfoReader", "getSampleImages: videoPath is empty.");
            return;
        }
        if (!C34741f.m76111a(str)) {
            LiteavLog.m76093w("TXVideoInfoReader", "getSampleImages: file is not exist.");
            return;
        }
        cancelThread();
        C35474a c35474a = new C35474a(str);
        this.mGenerateImageThread = c35474a;
        c35474a.start();
        LiteavLog.m76087i("TXVideoInfoReader", "getSampleImages: thread start");
    }

    private long getContentUrlFileSize(String str) {
        FileInputStream fileInputStream;
        Throwable th2;
        ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor;
        Uri uri = Uri.parse(str);
        try {
            Context context = this.mContext;
            if (context != null) {
                parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(uri, "r");
                try {
                    fileInputStream = new FileInputStream(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor());
                    try {
                        long jAvailable = fileInputStream.available();
                        C34741f.m76109a(parcelFileDescriptorOpenFileDescriptor);
                        C34741f.m76109a(fileInputStream);
                        return jAvailable;
                    } catch (Throwable th3) {
                        th2 = th3;
                    }
                } catch (Throwable th4) {
                    fileInputStream = null;
                    th2 = th4;
                }
            } else {
                C34741f.m76109a((Closeable) null);
                C34741f.m76109a((Closeable) null);
                return 0L;
            }
        } catch (Throwable th5) {
            fileInputStream = null;
            th2 = th5;
            parcelFileDescriptorOpenFileDescriptor = null;
        }
        try {
            LiteavLog.m76084e("TXVideoInfoReader", "getVideoFileInfo  not found , uri = ".concat(String.valueOf(uri)), th2);
            return 0L;
        } finally {
            C34741f.m76109a(parcelFileDescriptorOpenFileDescriptor);
            C34741f.m76109a(fileInputStream);
        }
    }

    public Bitmap getSampleImage(long j11, String str) {
        if (TextUtils.isEmpty(str)) {
            LiteavLog.m76093w("TXVideoInfoReader", "videoPath is null");
            return null;
        }
        if (!new File(str).exists()) {
            LiteavLog.m76093w("TXVideoInfoReader", "videoPath is not exist");
            return null;
        }
        FFmpegMediaRetriever fFmpegMediaRetriever = new FFmpegMediaRetriever();
        fFmpegMediaRetriever.setDataSource(str);
        long videoDurationMs = fFmpegMediaRetriever.getVideoDurationMs() * 1000;
        long j12 = j11 * 1000;
        if (j12 > videoDurationMs) {
            j12 = videoDurationMs;
        }
        if (videoDurationMs <= 0) {
            LiteavLog.m76093w("TXVideoInfoReader", "video duration is 0");
            return null;
        }
        Bitmap frameAtTime = getFrameAtTime(str, j12);
        if (frameAtTime == null) {
            LiteavLog.m76083e("TXVideoInfoReader", "getSampleImages failed!");
            return null;
        }
        LiteavLog.m76087i("TXVideoInfoReader", "getSampleImages bmp= " + frameAtTime + ",time= " + j12 + ",duration= " + videoDurationMs);
        return frameAtTime;
    }

    public TXVideoEditConstants.TXVideoInfo getVideoFileInfo(String str) {
        LiteavLog.m76087i("TXVideoInfoReader", "videoSource:".concat(String.valueOf(str)));
        if (LiteavSystemInfo.getSystemOSVersionInt() < 18) {
            return null;
        }
        if (TextUtils.isEmpty(str)) {
            LiteavLog.m76083e("TXVideoInfoReader", "videoSource is empty!!");
            return null;
        }
        if (!MediaExtractorBuilder.isContentUri(str)) {
            File file = new File(str);
            if (!file.exists() || !file.canRead()) {
                LiteavLog.m76083e("TXVideoInfoReader", "getVideoFileInfo  file exist = " + file.exists() + " can read = " + file.canRead());
                return null;
            }
        }
        TXVideoEditConstants.TXVideoInfo tXVideoInfo = new TXVideoEditConstants.TXVideoInfo();
        Bitmap frameAtTime = getFrameAtTime(str, -1L);
        tXVideoInfo.coverImage = frameAtTime;
        if (frameAtTime == null) {
            LiteavLog.m76093w("TXVideoInfoReader", "get cover image fail.");
        }
        FFmpegMediaRetriever fFmpegMediaRetriever = new FFmpegMediaRetriever();
        fFmpegMediaRetriever.setDataSource(str);
        tXVideoInfo.duration = fFmpegMediaRetriever.getVideoDurationMs();
        LiteavLog.m76087i("TXVideoInfoReader", "getVideoFileInfo: duration = " + tXVideoInfo.duration);
        tXVideoInfo.fps = fFmpegMediaRetriever.getFPS();
        tXVideoInfo.bitrate = (int) (fFmpegMediaRetriever.getVideoBitrate() / 1024);
        tXVideoInfo.audioSampleRate = fFmpegMediaRetriever.getSampleRate();
        int rotation = fFmpegMediaRetriever.getRotation();
        LiteavLog.m76087i("TXVideoInfoReader", "rotation: ".concat(String.valueOf(rotation)));
        if (rotation != 90 && rotation != 270) {
            tXVideoInfo.width = fFmpegMediaRetriever.getVideoWidth();
            tXVideoInfo.height = fFmpegMediaRetriever.getVideoHeight();
        } else {
            tXVideoInfo.width = fFmpegMediaRetriever.getVideoHeight();
            tXVideoInfo.height = fFmpegMediaRetriever.getVideoWidth();
        }
        tXVideoInfo.metaData = fFmpegMediaRetriever.getFileMetaData();
        if (MediaExtractorBuilder.isContentUri(str)) {
            tXVideoInfo.fileSize = getContentUrlFileSize(str);
            return tXVideoInfo;
        }
        tXVideoInfo.fileSize = new File(str).length();
        return tXVideoInfo;
    }

    public static TXVideoInfoReader getInstance(Context context) {
        if (sInstance == null) {
            sInstance = new TXVideoInfoReader(context);
        }
        return sInstance;
    }

    private TXVideoInfoReader() {
        this.TAG = "TXVideoInfoReader";
        this.mRetryTimes = new AtomicInteger(0);
        this.mMainHandler = new Handler(Looper.getMainLooper());
    }
}
