package com.tencent.thumbplayer.tcmedia.core.decoder;

import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.view.Surface;
import androidx.media3.common.MimeTypes;
import com.tencent.bugly.proguard.C33627eb;
import com.tencent.thumbplayer.tcmedia.core.common.TPCodecUtils;
import com.tencent.thumbplayer.tcmedia.core.common.TPNativeLog;
import com.tencent.thumbplayer.tcmedia.core.common.TPSystemInfo;
import com.tencent.thumbplayer.tcmedia.p164g.C35357a;
import com.tencent.thumbplayer.tcmedia.p164g.C35360b;
import com.tencent.thumbplayer.tcmedia.p164g.p165a.C35359b;
import com.tencent.thumbplayer.tcmedia.p164g.p173h.InterfaceC35379a;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/* JADX INFO: loaded from: classes63.dex */
public abstract class TPBaseMediaCodecDecoder implements ITPMediaCodecDecoder {
    private static final int DUMP_BYTE_BUFFER_BYTES = 100;
    private static final int DUMP_ONE_LINE_BYTES = 20;
    private static final int MEDIA_CODEC_ERROR_INDEX = -1000;
    private static long MEDIA_CODEC_INPUT_TIMEOUT_US = 2000;
    private static long MEDIA_CODEC_OUTPUT_TIMEOUT_US = 2000;
    private static final int MSG_FLUSH = 1002;
    private static final int MSG_RELEASE = 1003;
    private static final int MSG_RELEASE_OUTPUT_BUFFER = 1000;
    private static final int MSG_SET_OUTPUT_SURFACE = 1001;
    private static boolean sTMediaCodecInited;
    protected int mCodecId;
    private C35360b mCodec = null;
    protected Surface mSurface = null;
    protected boolean mStarted = false;
    private TPFrameInfo mFrameInfo = new TPFrameInfo();
    private boolean mEnableSetOutputSurfaceApi = false;
    private MediaCodec.CryptoInfo mCryptoInfo = null;
    protected MediaCrypto mMediaCrypto = null;
    protected boolean mEnableAsyncMode = false;
    private HandlerThread mDecodeThread = null;
    private AsyncDecodeHandler mDecoderHandler = null;
    private BlockingQueue<Integer> mInputQueue = new LinkedBlockingQueue();
    private BlockingQueue<TPFrameInfo> mOutputQueue = new LinkedBlockingQueue();
    private boolean mRestartCodecOnException = false;
    protected int mDrmType = -1;
    private boolean mEnableAudioPassThrough = false;
    protected boolean mEnableMediaCodecReuse = false;
    private final Object mThreadLock = new Object();
    private int mHandlerResult = 0;

    public class AsyncDecodeHandler extends Handler {
        public AsyncDecodeHandler(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            synchronized (TPBaseMediaCodecDecoder.this.mThreadLock) {
                try {
                    int iOnReleaseOutputBuffer = 0;
                    switch (message.what) {
                        case 1000:
                            iOnReleaseOutputBuffer = TPBaseMediaCodecDecoder.this.onReleaseOutputBuffer(message.arg1, message.arg2 == 1);
                            break;
                        case 1001:
                            iOnReleaseOutputBuffer = TPBaseMediaCodecDecoder.this.onSetOutputSurface((Surface) message.obj);
                            break;
                        case 1002:
                            iOnReleaseOutputBuffer = TPBaseMediaCodecDecoder.this.onFlush();
                            break;
                        case 1003:
                            iOnReleaseOutputBuffer = TPBaseMediaCodecDecoder.this.onRelease();
                            break;
                    }
                    TPBaseMediaCodecDecoder.this.handleMessageComplete(iOnReleaseOutputBuffer);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public class BufferCallback extends C35360b.a {
        private BufferCallback() {
        }

        @Override // com.tencent.thumbplayer.tcmedia.p164g.C35360b.a
        public void onError(C35360b c35360b, MediaCodec.CodecException codecException) {
            TPNativeLog.printLog(4, TPBaseMediaCodecDecoder.this.getLogTag(), "onError: " + TPBaseMediaCodecDecoder.this.getStackTrace(codecException));
            TPBaseMediaCodecDecoder.this.handleRelease();
        }

        @Override // com.tencent.thumbplayer.tcmedia.p164g.C35360b.a
        public void onInputBufferAvailable(C35360b c35360b, int i11) {
            try {
                TPBaseMediaCodecDecoder.this.mInputQueue.put(Integer.valueOf(i11));
            } catch (Exception e11) {
                TPNativeLog.printLog(3, TPBaseMediaCodecDecoder.this.getLogTag(), TPBaseMediaCodecDecoder.this.getStackTrace(e11));
            }
        }

        @Override // com.tencent.thumbplayer.tcmedia.p164g.C35360b.a
        public void onOutputBufferAvailable(C35360b c35360b, int i11, MediaCodec.BufferInfo bufferInfo) {
            try {
                TPFrameInfo tPFrameInfo = new TPFrameInfo();
                tPFrameInfo.errCode = 0;
                tPFrameInfo.bufferIndex = i11;
                tPFrameInfo.ptsUs = bufferInfo.presentationTimeUs;
                TPBaseMediaCodecDecoder.this.processOutputBuffer(c35360b, i11, bufferInfo, tPFrameInfo);
                TPBaseMediaCodecDecoder.this.mOutputQueue.put(tPFrameInfo);
            } catch (Exception e11) {
                TPNativeLog.printLog(3, TPBaseMediaCodecDecoder.this.getLogTag(), TPBaseMediaCodecDecoder.this.getStackTrace(e11));
            }
        }

        @Override // com.tencent.thumbplayer.tcmedia.p164g.C35360b.a
        public void onOutputFormatChanged(C35360b c35360b, MediaFormat mediaFormat) {
            TPBaseMediaCodecDecoder.this.processOutputFormatChanged(mediaFormat);
        }
    }

    private boolean initMediaCodecInternal() {
        try {
            List<String> mimeCandidates = getMimeCandidates();
            boolean z11 = false;
            String codecName = null;
            String str = null;
            for (int i11 = 0; i11 < mimeCandidates.size() && codecName == null; i11++) {
                str = mimeCandidates.get(i11);
                TPNativeLog.printLog(2, getLogTag(), "initMediaCodec with mime:" + str + " mDrmType:" + this.mDrmType);
                MediaCrypto mediaCrypto = this.mMediaCrypto;
                boolean zRequiresSecureDecoderComponent = mediaCrypto != null ? mediaCrypto.requiresSecureDecoderComponent(str) : false;
                if (zRequiresSecureDecoderComponent && TPCodecUtils.isInDRMLevel1Blacklist(this.mDrmType)) {
                    TPNativeLog.printLog(2, getLogTag(), "Device " + TPSystemInfo.getDeviceName() + " DrmType " + this.mDrmType + " fallback to L3.");
                    z11 = false;
                } else {
                    z11 = zRequiresSecureDecoderComponent;
                }
                codecName = getCodecName(str, z11);
                TPNativeLog.printLog(2, getLogTag(), "initMediaCodec got codecName:" + codecName + " secureComponent " + z11);
            }
            if (codecName == null) {
                TPNativeLog.printLog(4, getLogTag(), "initMediaCodec failed, codecName is null.");
                return false;
            }
            if (MimeTypes.AUDIO_DTS.equals(str)) {
                TPNativeLog.printLog(2, getLogTag(), "initMediaCodec current mime type:" + str + " is audio dts, need set input timeout to 0!");
                MEDIA_CODEC_INPUT_TIMEOUT_US = 0L;
                MEDIA_CODEC_OUTPUT_TIMEOUT_US = 0L;
            }
            C35360b c35360bM78203a = C35360b.m78203a(codecName);
            this.mCodec = c35360bM78203a;
            c35360bM78203a.m78222a(this.mEnableMediaCodecReuse && !this.mEnableAsyncMode);
            this.mCodec.m78220a(new C35359b() { // from class: com.tencent.thumbplayer.tcmedia.core.decoder.TPBaseMediaCodecDecoder.2
                @Override // com.tencent.thumbplayer.tcmedia.p164g.p165a.C35359b, com.tencent.thumbplayer.tcmedia.p164g.p165a.InterfaceC35358a
                public void onReuseCodecAPIException(String str2, Throwable th2) {
                    super.onReuseCodecAPIException(str2, th2);
                    TPMediaCodecManager.onMediaCodecException(TPBaseMediaCodecDecoder.this.mCodecId, str2);
                }

                @Override // com.tencent.thumbplayer.tcmedia.p164g.p165a.C35359b, com.tencent.thumbplayer.tcmedia.p164g.p165a.InterfaceC35358a
                public void onStarted(Boolean bool, String str2) {
                    super.onStarted(bool, str2);
                    TPMediaCodecManager.onMediaCodecReady(TPBaseMediaCodecDecoder.this.mCodecId, str2);
                }
            });
            TPNativeLog.printLog(2, getLogTag(), "initMediaCodec codec name: ".concat(codecName));
            if (this.mEnableAsyncMode) {
                TPNativeLog.printLog(2, getLogTag(), "MediaCodec EnableAsyncMode！");
                HandlerThread handlerThread = new HandlerThread("MediaCodecThread");
                this.mDecodeThread = handlerThread;
                handlerThread.start();
                this.mDecoderHandler = new AsyncDecodeHandler(this.mDecodeThread.getLooper());
                this.mCodec.m78221a(new BufferCallback(), this.mDecoderHandler);
            }
            TPMediaCodecManager.onMediaCodecReportEvent(this.mCodecId, 1);
            configCodec(this.mCodec, str);
            TPMediaCodecManager.onMediaCodecReportEvent(this.mCodecId, 2);
            TPMediaCodecManager.onMediaCodecReportEvent(this.mCodecId, 3);
            TPNativeLog.printLog(2, getLogTag(), "initMediaCodec, start codec start");
            this.mCodec.m78229e();
            TPNativeLog.printLog(2, getLogTag(), "initMediaCodec, start codec finished");
            TPMediaCodecManager.onMediaCodecReportEvent(this.mCodecId, 4);
            this.mStarted = true;
            if (this.mDrmType != -1) {
                boolean z12 = TPCodecUtils.getDecoderName(str, true) != null;
                TPMediaDrmInfo tPMediaDrmInfo = new TPMediaDrmInfo();
                tPMediaDrmInfo.supportSecureDecoder = z12;
                tPMediaDrmInfo.supportSecureDecrypt = z11;
                tPMediaDrmInfo.componentName = codecName;
                tPMediaDrmInfo.drmType = this.mDrmType;
                TPNativeLog.printLog(2, getLogTag(), "DRM Info: supportSecureDecoder: " + tPMediaDrmInfo.supportSecureDecoder + " supportSecureDecrypt:" + tPMediaDrmInfo.supportSecureDecrypt + " componentName: " + tPMediaDrmInfo.componentName + " drmType: " + tPMediaDrmInfo.drmType);
                TPMediaCodecManager.onMediaDrmInfo(this.mCodecId, tPMediaDrmInfo);
            }
            return true;
        } catch (Exception e11) {
            TPMediaCodecManager.onMediaCodecReportEvent(this.mCodecId, 4);
            TPNativeLog.printLog(4, getLogTag(), getStackTrace(e11));
            return false;
        }
    }

    public abstract void configCodec(C35360b c35360b, String str);

    public abstract String getCodecName(String str, boolean z11);

    public abstract String getLogTag();

    public abstract List<String> getMimeCandidates();

    public abstract void processMediaCodecException(Exception exc);

    public abstract void processOutputBuffer(C35360b c35360b, int i11, MediaCodec.BufferInfo bufferInfo, TPFrameInfo tPFrameInfo);

    public abstract void processOutputConfigData(C35360b c35360b, int i11, MediaCodec.BufferInfo bufferInfo, TPFrameInfo tPFrameInfo);

    public abstract void processOutputFormatChanged(MediaFormat mediaFormat);

    @Override // com.tencent.thumbplayer.tcmedia.core.decoder.ITPMediaCodecDecoder
    public boolean setParamBool(int i11, boolean z11) {
        String logTag;
        String str;
        if (i11 != 0) {
            int i12 = 3;
            if (i11 != 1) {
                if (i11 == 3) {
                    this.mEnableAudioPassThrough = z11;
                    logTag = getLogTag();
                    str = "BOOL_SET_IS_AUDIO_PASSTHROUGH mEnableAudioPassThrough:" + this.mEnableAudioPassThrough;
                    i12 = 2;
                    TPNativeLog.printLog(i12, logTag, str);
                } else {
                    if (i11 != 4) {
                        TPNativeLog.printLog(3, getLogTag(), "Unknown paramKey: ".concat(String.valueOf(i11)));
                        return false;
                    }
                    this.mEnableMediaCodecReuse = z11;
                }
            } else if (this.mStarted) {
                logTag = getLogTag();
                str = "BOOL_ENABLE_ASYNC_MODE must setup before started!";
                TPNativeLog.printLog(i12, logTag, str);
            } else {
                this.mEnableAsyncMode = z11;
            }
        } else {
            this.mEnableSetOutputSurfaceApi = z11;
        }
        return true;
    }

    @Override // com.tencent.thumbplayer.tcmedia.core.decoder.ITPMediaCodecDecoder
    public boolean setParamBytes(int i11, byte[] bArr) {
        return false;
    }

    @Override // com.tencent.thumbplayer.tcmedia.core.decoder.ITPMediaCodecDecoder
    public boolean setParamInt(int i11, int i12) {
        return false;
    }

    @Override // com.tencent.thumbplayer.tcmedia.core.decoder.ITPMediaCodecDecoder
    public boolean setParamLong(int i11, long j11) {
        return false;
    }

    @Override // com.tencent.thumbplayer.tcmedia.core.decoder.ITPMediaCodecDecoder
    public boolean setParamString(int i11, String str) {
        return false;
    }

    private int decodeAsync(byte[] bArr, boolean z11, long j11, boolean z12) {
        Integer numPoll = this.mInputQueue.poll();
        if (numPoll == null) {
            return 1;
        }
        try {
            ByteBuffer byteBufferM78226c = this.mCodec.m78226c(numPoll.intValue());
            if (byteBufferM78226c != null) {
                bufferSizeCheck(byteBufferM78226c, bArr);
                byteBufferM78226c.put(bArr);
            }
            if (!z12 || this.mCryptoInfo == null) {
                this.mCodec.m78214a(numPoll.intValue(), 0, bArr.length, j11, z11 ? 1 : 0);
            } else {
                this.mCodec.m78215a(numPoll.intValue(), 0, this.mCryptoInfo, j11, z11 ? 1 : 0);
            }
            return 0;
        } catch (Exception e11) {
            return onMediaCodecException(e11);
        }
    }

    private TPFrameInfo dequeueOutputBufferAsync() {
        this.mFrameInfo.errCode = 1;
        TPFrameInfo tPFrameInfoPoll = this.mOutputQueue.poll();
        return tPFrameInfoPoll == null ? this.mFrameInfo : tPFrameInfoPoll;
    }

    private void dumpByteArray(byte[] bArr, int i11, int i12, int i13) {
        if (bArr == null || i11 < 0 || i12 <= 0 || i11 >= bArr.length || i11 >= i12 || i13 <= 0) {
            throw new IllegalArgumentException();
        }
        if (bArr.length <= i12) {
            i12 = bArr.length;
        }
        int iMin = Math.min(i12 - i11, 100) + i11;
        StringBuilder sb2 = new StringBuilder();
        TPNativeLog.printLog(2, getLogTag(), "dumpByteArray begin:");
        int i14 = 0;
        while (i11 < iMin) {
            String hexString = Integer.toHexString(bArr[i11] & 255);
            if (hexString.length() == 1) {
                hexString = "0".concat(hexString);
            }
            sb2.append(hexString.toUpperCase());
            i14++;
            if (i14 % i13 == 0) {
                TPNativeLog.printLog(2, getLogTag(), sb2.toString());
                sb2.setLength(0);
            } else {
                sb2.append(C33627eb.f69716f);
            }
            i11++;
        }
        TPNativeLog.printLog(2, getLogTag(), "dumpByteArray end.");
    }

    private void exitDecodeThread() {
        HandlerThread handlerThread = this.mDecodeThread;
        if (handlerThread != null) {
            handlerThread.quitSafely();
            try {
                this.mDecodeThread.join();
            } catch (InterruptedException e11) {
                e11.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleMessageComplete(int i11) {
        this.mHandlerResult = i11;
        this.mThreadLock.notify();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int handleRelease() {
        C35360b c35360b = this.mCodec;
        if (c35360b == null) {
            return 101;
        }
        this.mStarted = false;
        try {
            c35360b.m78230f();
            return 0;
        } catch (Exception e11) {
            TPNativeLog.printLog(4, getLogTag(), "stop: failed!" + getStackTrace(e11));
            return 3;
        } finally {
            this.mCodec.m78231g();
            this.mCodec = null;
        }
    }

    private int handleReleaseOutputBuffer(int i11, boolean z11) {
        C35360b c35360b = this.mCodec;
        if (c35360b == null || i11 < 0) {
            return 3;
        }
        try {
            c35360b.m78216a(i11, z11);
            return 0;
        } catch (Exception e11) {
            return onMediaCodecException(e11);
        }
    }

    private int handleSignalEndOfStream(int i11) {
        try {
            this.mCodec.m78214a(i11, 0, 0, 0L, 4);
            return 0;
        } catch (Exception e11) {
            TPNativeLog.printLog(4, getLogTag(), "handleSignalEndOfStream: failed!" + getStackTrace(e11));
            return 3;
        }
    }

    private static synchronized void initTMediaCodec() {
        if (sTMediaCodecInited) {
            return;
        }
        C35357a.m78190b();
        C35357a.m78185a().m78196a(true);
        C35357a.m78185a().m78195a(new InterfaceC35379a() { // from class: com.tencent.thumbplayer.tcmedia.core.decoder.TPBaseMediaCodecDecoder.1
            @Override // com.tencent.thumbplayer.tcmedia.p164g.p173h.InterfaceC35379a
            /* JADX INFO: renamed from: d */
            public final void mo78068d(String str, String str2) {
                TPNativeLog.printLog(1, str, str2);
            }

            @Override // com.tencent.thumbplayer.tcmedia.p164g.p173h.InterfaceC35379a
            /* JADX INFO: renamed from: e */
            public final void mo78069e(String str, String str2, Throwable th2) {
                TPNativeLog.printLog(4, str, str2);
            }

            @Override // com.tencent.thumbplayer.tcmedia.p164g.p173h.InterfaceC35379a
            /* JADX INFO: renamed from: i */
            public final void mo78070i(String str, String str2) {
                TPNativeLog.printLog(2, str, str2);
            }

            @Override // com.tencent.thumbplayer.tcmedia.p164g.p173h.InterfaceC35379a
            /* JADX INFO: renamed from: v */
            public final void mo78071v(String str, String str2) {
                TPNativeLog.printLog(0, str, str2);
            }

            @Override // com.tencent.thumbplayer.tcmedia.p164g.p173h.InterfaceC35379a
            /* JADX INFO: renamed from: w */
            public final void mo78072w(String str, String str2, Throwable th2) {
                TPNativeLog.printLog(3, str, str2);
            }
        });
        sTMediaCodecInited = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int onFlush() {
        this.mInputQueue.clear();
        this.mOutputQueue.clear();
        int iHandleFlush = handleFlush();
        this.mCodec.m78229e();
        return iHandleFlush;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int onRelease() {
        this.mInputQueue.clear();
        this.mOutputQueue.clear();
        return handleRelease();
    }

    private int queueInputBuffer(byte[] bArr, long j11, boolean z11) {
        MediaCodec.CryptoInfo cryptoInfo;
        try {
            ByteBuffer[] byteBufferArrM78234j = this.mCodec.m78234j();
            int iM78210a = this.mCodec.m78210a(MEDIA_CODEC_INPUT_TIMEOUT_US);
            if (iM78210a < 0) {
                return iM78210a == -1 ? 1 : 103;
            }
            ByteBuffer byteBuffer = byteBufferArrM78234j[iM78210a];
            bufferSizeCheck(byteBuffer, bArr);
            byteBuffer.put(bArr);
            if (!z11 || (cryptoInfo = this.mCryptoInfo) == null) {
                this.mCodec.m78214a(iM78210a, 0, bArr.length, j11, 0);
                return 0;
            }
            this.mCodec.m78215a(iM78210a, 0, cryptoInfo, j11, 0);
            return 0;
        } catch (Exception e11) {
            return onMediaCodecException(e11);
        }
    }

    private int releaseOutputBufferAsync(int i11, boolean z11) {
        Message messageObtainMessage = this.mDecoderHandler.obtainMessage();
        messageObtainMessage.what = 1000;
        messageObtainMessage.arg1 = i11;
        messageObtainMessage.arg2 = z11 ? 1 : 0;
        return waitingForHandleMessage(messageObtainMessage);
    }

    private void resetFrameInfo() {
        TPFrameInfo tPFrameInfo = this.mFrameInfo;
        tPFrameInfo.bufferIndex = -1000;
        tPFrameInfo.ptsUs = -1L;
        tPFrameInfo.data = null;
        tPFrameInfo.errCode = 103;
    }

    private int signalEndOfStreamAsync() {
        Integer numPoll = this.mInputQueue.poll();
        if (numPoll == null) {
            return 1;
        }
        return handleSignalEndOfStream(numPoll.intValue());
    }

    private int waitingForHandleMessage(Message message) {
        synchronized (this.mThreadLock) {
            message.sendToTarget();
            try {
                this.mThreadLock.wait();
            } catch (InterruptedException e11) {
                e11.printStackTrace();
            }
        }
        return this.mHandlerResult;
    }

    @Override // com.tencent.thumbplayer.tcmedia.core.decoder.ITPMediaCodecDecoder
    public int decode(byte[] bArr, boolean z11, long j11, boolean z12) {
        if (!this.mStarted || this.mCodec == null) {
            return 101;
        }
        return this.mEnableAsyncMode ? decodeAsync(bArr, z11, j11, z12) : queueInputBuffer(bArr, j11, z12);
    }

    @Override // com.tencent.thumbplayer.tcmedia.core.decoder.ITPMediaCodecDecoder
    public TPFrameInfo dequeueOutputBuffer() {
        String logTag;
        String str;
        if (this.mCodec == null) {
            return this.mFrameInfo;
        }
        resetFrameInfo();
        if (this.mEnableAsyncMode) {
            return dequeueOutputBufferAsync();
        }
        MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
        try {
            int iM78211a = this.mCodec.m78211a(bufferInfo, MEDIA_CODEC_OUTPUT_TIMEOUT_US);
            if (iM78211a >= 0) {
                int i11 = bufferInfo.flags;
                if (i11 == 4) {
                    logTag = getLogTag();
                    str = "dequeueOutputBuffer: BUFFER_FLAG_END_OF_STREAM";
                    TPNativeLog.printLog(1, logTag, str);
                    this.mFrameInfo.errCode = 2;
                } else if (i11 == 2 && this.mEnableAudioPassThrough) {
                    TPNativeLog.printLog(1, getLogTag(), "dequeueOutputBuffer: BUFFER_FLAG_CODEC_CONFIG, AudioPassThrough");
                    TPFrameInfo tPFrameInfo = this.mFrameInfo;
                    tPFrameInfo.bufferIndex = iM78211a;
                    tPFrameInfo.ptsUs = bufferInfo.presentationTimeUs;
                    processOutputConfigData(this.mCodec, iM78211a, bufferInfo, tPFrameInfo);
                } else {
                    TPFrameInfo tPFrameInfo2 = this.mFrameInfo;
                    tPFrameInfo2.bufferIndex = iM78211a;
                    tPFrameInfo2.ptsUs = bufferInfo.presentationTimeUs;
                    tPFrameInfo2.errCode = 0;
                    processOutputBuffer(this.mCodec, iM78211a, bufferInfo, tPFrameInfo2);
                }
            } else {
                if (iM78211a == -2) {
                    processOutputFormatChanged(this.mCodec.m78233i());
                } else if (iM78211a != -1) {
                    if (iM78211a == -3) {
                        TPNativeLog.printLog(1, getLogTag(), "dequeueOutputBuffer: INFO_OUTPUT_BUFFERS_CHANGED!");
                    } else if (bufferInfo.flags == 4) {
                        logTag = getLogTag();
                        str = "dequeueOutputBuffer: BUFFER_FLAG_END_OF_STREAM!";
                        TPNativeLog.printLog(1, logTag, str);
                        this.mFrameInfo.errCode = 2;
                    } else {
                        TPNativeLog.printLog(4, getLogTag(), "dequeueOutputBuffer: TP_ERROR_DECODE_FAILED! index = ".concat(String.valueOf(iM78211a)));
                        this.mFrameInfo.errCode = 103;
                    }
                }
                this.mFrameInfo.errCode = 1;
            }
            return this.mFrameInfo;
        } catch (Exception e11) {
            this.mFrameInfo.errCode = onMediaCodecException(e11);
            return this.mFrameInfo;
        }
    }

    public String getStackTrace(Throwable th2) {
        StringWriter stringWriter = new StringWriter();
        th2.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    @Override // com.tencent.thumbplayer.tcmedia.core.decoder.ITPMediaCodecDecoder
    public int release() {
        return this.mEnableAsyncMode ? releaseAsync() : handleRelease();
    }

    @Override // com.tencent.thumbplayer.tcmedia.core.decoder.ITPMediaCodecDecoder
    public int releaseOutputBuffer(int i11, boolean z11) {
        if (this.mCodec == null || i11 < 0) {
            return 3;
        }
        return this.mEnableAsyncMode ? releaseOutputBufferAsync(i11, z11) : handleReleaseOutputBuffer(i11, z11);
    }

    @Override // com.tencent.thumbplayer.tcmedia.core.decoder.ITPMediaCodecDecoder
    public void setCryptoInfo(int i11, int[] iArr, int[] iArr2, byte[] bArr, byte[] bArr2, int i12, int i13, int i14) {
        if (this.mCryptoInfo == null) {
            this.mCryptoInfo = new MediaCodec.CryptoInfo();
        }
        this.mCryptoInfo.set(i11, iArr, iArr2, bArr, bArr2, i12);
        this.mCryptoInfo.setPattern(new MediaCodec.CryptoInfo.Pattern(i13, i14));
    }

    @Override // com.tencent.thumbplayer.tcmedia.core.decoder.ITPMediaCodecDecoder
    public int setOperateRate(float f11) {
        if (this.mCodec != null) {
            try {
                TPNativeLog.printLog(2, getLogTag(), "setOperateRate: ".concat(String.valueOf(f11)));
                Bundle bundle = new Bundle();
                bundle.putShort("priority", (short) 0);
                bundle.putFloat("operating-rate", f11);
                this.mCodec.m78218a(bundle);
            } catch (Exception unused) {
                TPNativeLog.printLog(3, getLogTag(), "setOperateRate: " + f11 + " failed.");
            }
        }
        return 0;
    }

    @Override // com.tencent.thumbplayer.tcmedia.core.decoder.ITPMediaCodecDecoder
    public int setOutputSurface(Surface surface) {
        return this.mEnableAsyncMode ? setOutputSurfaceAsync(surface) : handleSetOutputSurface(surface);
    }

    @Override // com.tencent.thumbplayer.tcmedia.core.decoder.ITPMediaCodecDecoder
    public boolean setParamObject(int i11, Object obj) {
        if (i11 != 300) {
            return false;
        }
        this.mMediaCrypto = (MediaCrypto) obj;
        return true;
    }

    public TPBaseMediaCodecDecoder(int i11) {
        this.mCodecId = i11;
        initTMediaCodec();
    }

    private void bufferSizeCheck(ByteBuffer byteBuffer, byte[] bArr) {
        if (byteBuffer.remaining() < bArr.length) {
            TPNativeLog.printLog(4, getLogTag(), "decodeAsync, not enough space, byteBuffer.remaining:" + byteBuffer.remaining() + ", buffer size:" + bArr.length);
            try {
                dumpByteArray(bArr, 0, 100, 20);
            } catch (Exception e11) {
                TPNativeLog.printLog(4, getLogTag(), e11.toString());
            }
        }
    }

    private int flushAsync() {
        TPNativeLog.printLog(2, getLogTag(), "flushAsync: ");
        Message messageObtainMessage = this.mDecoderHandler.obtainMessage();
        messageObtainMessage.what = 1002;
        return waitingForHandleMessage(messageObtainMessage);
    }

    private int handleFlush() {
        TPNativeLog.printLog(2, getLogTag(), "handleFlush: ");
        C35360b c35360b = this.mCodec;
        if (c35360b == null) {
            return 104;
        }
        try {
            c35360b.m78232h();
            return 0;
        } catch (Exception e11) {
            return onMediaCodecException(e11);
        }
    }

    private int handleSetOutputSurface(Surface surface) {
        TPNativeLog.printLog(2, getLogTag(), "setOutputSurface: ".concat(String.valueOf(surface)));
        Surface surface2 = this.mSurface;
        if (surface2 == surface) {
            TPNativeLog.printLog(3, getLogTag(), "setOutputSurface: set the same surface.");
            return 0;
        }
        this.mSurface = surface;
        if (this.mCodec == null) {
            return 0;
        }
        if (surface2 != null && surface != null) {
            try {
                if (surface.isValid() && this.mEnableSetOutputSurfaceApi) {
                    this.mCodec.m78219a(surface);
                    return 0;
                }
            } catch (Exception e11) {
                TPNativeLog.printLog(4, getLogTag(), "setOutputSurface onMediaCodecException:\n" + getStackTrace(e11));
            }
        }
        return 3;
    }

    private int onMediaCodecException(Exception exc) {
        TPNativeLog.printLog(4, getLogTag(), "onMediaCodecException!\n" + getStackTrace(exc));
        resetFrameInfo();
        processMediaCodecException(exc);
        if (this.mRestartCodecOnException) {
            initMediaCodecInternal();
            return 4;
        }
        handleRelease();
        return 103;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int onReleaseOutputBuffer(int i11, boolean z11) {
        return handleReleaseOutputBuffer(i11, z11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int onSetOutputSurface(Surface surface) {
        return handleSetOutputSurface(surface);
    }

    private int releaseAsync() {
        TPNativeLog.printLog(2, getLogTag(), "releaseAsync: ");
        Message messageObtainMessage = this.mDecoderHandler.obtainMessage();
        messageObtainMessage.what = 1003;
        int iWaitingForHandleMessage = waitingForHandleMessage(messageObtainMessage);
        exitDecodeThread();
        return iWaitingForHandleMessage;
    }

    private MediaCodecInfo selectCodec(String str) {
        int codecCount = MediaCodecList.getCodecCount();
        for (int i11 = 0; i11 < codecCount; i11++) {
            MediaCodecInfo codecInfoAt = MediaCodecList.getCodecInfoAt(i11);
            if (!codecInfoAt.isEncoder()) {
                for (String str2 : codecInfoAt.getSupportedTypes()) {
                    if (str2.equalsIgnoreCase(str)) {
                        return codecInfoAt;
                    }
                }
            }
        }
        return null;
    }

    private int setOutputSurfaceAsync(Surface surface) {
        TPNativeLog.printLog(2, getLogTag(), "setOutputSurfaceAsync: ".concat(String.valueOf(surface)));
        Message messageObtainMessage = this.mDecoderHandler.obtainMessage();
        messageObtainMessage.what = 1001;
        messageObtainMessage.obj = surface;
        return waitingForHandleMessage(messageObtainMessage);
    }

    @Override // com.tencent.thumbplayer.tcmedia.core.decoder.ITPMediaCodecDecoder
    public int flush() {
        TPNativeLog.printLog(2, getLogTag(), "flush: ");
        if (this.mCodec == null) {
            return 104;
        }
        if (this.mEnableAsyncMode) {
            return flushAsync();
        }
        return handleFlush();
    }

    @Override // com.tencent.thumbplayer.tcmedia.core.decoder.ITPMediaCodecDecoder
    public int signalEndOfStream() {
        TPNativeLog.printLog(2, getLogTag(), "signalEndOfStream: ");
        C35360b c35360b = this.mCodec;
        if (c35360b == null) {
            return 3;
        }
        if (this.mEnableAsyncMode) {
            return signalEndOfStreamAsync();
        }
        int iM78210a = c35360b.m78210a(MEDIA_CODEC_INPUT_TIMEOUT_US);
        if (iM78210a >= 0) {
            return handleSignalEndOfStream(iM78210a);
        }
        if (iM78210a != -1) {
            return 3;
        }
        return 1;
    }

    @Override // com.tencent.thumbplayer.tcmedia.core.decoder.ITPMediaCodecDecoder
    public boolean startDecoder() {
        return initMediaCodecInternal();
    }
}
