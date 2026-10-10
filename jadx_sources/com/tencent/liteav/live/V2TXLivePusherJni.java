package com.tencent.liteav.live;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.opengl.EGL14;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Surface;
import android.view.SurfaceView;
import android.view.TextureView;
import com.tencent.liteav.audio.TXAudioEffectManager;
import com.tencent.liteav.audio.TXAudioEffectManagerImpl;
import com.tencent.liteav.base.ContextUtils;
import com.tencent.liteav.base.annotations.JNINamespace;
import com.tencent.liteav.base.util.C34745j;
import com.tencent.liteav.base.util.EnumC34747l;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.liteav.beauty.TXBeautyManager;
import com.tencent.liteav.beauty.TXBeautyManagerImpl;
import com.tencent.liteav.device.TXDeviceManager;
import com.tencent.liteav.device.TXDeviceManagerImpl;
import com.tencent.liteav.videobase.base.GLConstants;
import com.tencent.liteav.videobase.videobase.DisplayTarget;
import com.tencent.live2.V2TXLiveDef;
import com.tencent.live2.V2TXLivePusher;
import com.tencent.live2.V2TXLivePusherObserver;
import com.tencent.live2.impl.V2TXLiveDefInner;
import com.tencent.live2.impl.p142a.AbstractC34986b;
import com.tencent.rtmp.p148ui.TXCloudVideoView;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import javax.microedition.khronos.egl.EGLContext;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes59.dex */
@JNINamespace("liteav")
public class V2TXLivePusherJni extends V2TXLivePusher {
    private static final String TAG = "V2TXLivePusherJni";
    private TXAudioEffectManager mAudioEffectManager;
    private TXBeautyManagerImpl mBeautyManager;
    private TXDeviceManager mDeviceManager;
    private long mNativeV2TXLivePusherJni;
    private V2TXLivePusherObserver mObserver;

    private static native long nativeCreate(WeakReference<V2TXLivePusherJni> weakReference, int i11);

    private static native long nativeCreateAudioEffectManager(long j11);

    private static native long nativeCreateBeautyManager(long j11);

    private static native long nativeCreateDeviceManager(long j11);

    private static native void nativeDestroy(long j11);

    private static native int nativeEnableAudioProcessObserver(long j11, boolean z11, int i11, int i12, int i13, int i14);

    private static native int nativeEnableCustomAudioCapture(long j11, boolean z11);

    private static native int nativeEnableCustomVideoCapture(long j11, boolean z11);

    private static native int nativeEnableCustomVideoProcess(long j11, boolean z11, int i11, int i12);

    private static native void nativeEnableExtensionCallback(long j11, boolean z11);

    private static native void nativeEnableVoiceActivityDetection(long j11, boolean z11);

    private static native int nativeEnableVolumeEvaluation(long j11, int i11);

    private static native String nativeGetProperty(long j11, String str);

    private static native int nativeIsPushing(long j11);

    private static native int nativePauseAudio(long j11);

    private static native int nativePauseVideo(long j11);

    private static native int nativeResumeAudio(long j11);

    private static native int nativeResumeVideo(long j11);

    private static native int nativeSendCustomAudioFrame(long j11, byte[] bArr, int i11, int i12, long j12);

    private static native int nativeSendCustomVideoFrame(long j11, int i11, int i12, int i13, int i14, int i15, int i16, Object obj, byte[] bArr, ByteBuffer byteBuffer);

    private static native int nativeSendSeiMessage(long j11, int i11, byte[] bArr);

    private static native int nativeSetAudioQuality(long j11, int i11);

    private static native int nativeSetEncoderMirror(long j11, boolean z11);

    private static native int nativeSetMixTranscodingConfig(long j11, String str);

    private static native int nativeSetProperty(long j11, String str, Object obj);

    private static native int nativeSetRenderFillMode(long j11, int i11);

    private static native int nativeSetRenderMirror(long j11, int i11);

    private static native int nativeSetRenderRotation(long j11, int i11);

    private static native int nativeSetRenderView(long j11, DisplayTarget displayTarget);

    private static native int nativeSetVideoQuality(long j11, int i11, int i12, int i13, int i14, int i15);

    private static native int nativeSetWatermark(long j11, Bitmap bitmap, float f11, float f12, float f13);

    private static native void nativeShowDebugView(long j11, boolean z11);

    private static native int nativeSnapshot(long j11);

    private static native int nativeStartCamera(long j11, boolean z11);

    private static native int nativeStartMicrophone(long j11);

    private static native int nativeStartPush(long j11, String str);

    private static native int nativeStartRecord(long j11, String str, int i11, int i12);

    private static native int nativeStartScreenCapture(long j11);

    private static native int nativeStartSystemAudioLoopback(long j11);

    private static native int nativeStartVirtualCamera(long j11, Bitmap bitmap);

    private static native int nativeStopCamera(long j11);

    private static native int nativeStopMicrophone(long j11);

    private static native int nativeStopPush(long j11);

    private static native void nativeStopRecord(long j11);

    private static native int nativeStopScreenCapture(long j11);

    private static native int nativeStopSystemAudioLoopback(long j11);

    private static native int nativeStopVirtualCamera(long j11);

    public Object getFrameEglContext(V2TXLiveDef.V2TXLiveVideoFrame v2TXLiveVideoFrame) {
        V2TXLiveDef.V2TXLiveTexture v2TXLiveTexture;
        EGLContext eGLContext = null;
        if (v2TXLiveVideoFrame != null && (v2TXLiveTexture = v2TXLiveVideoFrame.texture) != null) {
            EGLContext eGLContext2 = v2TXLiveTexture.eglContext10;
            eGLContext = eGLContext2 != null ? eGLContext2 : null;
            android.opengl.EGLContext eGLContext3 = v2TXLiveTexture.eglContext14;
            if (eGLContext3 != null) {
                return eGLContext3;
            }
        }
        return eGLContext;
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public int setRenderView(TXCloudVideoView tXCloudVideoView) {
        return nativeSetRenderView(this.mNativeV2TXLivePusherJni, new DisplayTarget(tXCloudVideoView));
    }

    /* JADX INFO: renamed from: com.tencent.liteav.live.V2TXLivePusherJni$1 */
    public static /* synthetic */ class C347611 {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f73587a;

        /* JADX INFO: renamed from: b */
        static final /* synthetic */ int[] f73588b;

        /* JADX INFO: renamed from: c */
        static final /* synthetic */ int[] f73589c;

        /* JADX INFO: renamed from: d */
        static final /* synthetic */ int[] f73590d;

        /* JADX INFO: renamed from: e */
        static final /* synthetic */ int[] f73591e;

        /* JADX INFO: renamed from: f */
        static final /* synthetic */ int[] f73592f;

        static {
            int[] iArr = new int[GLConstants.EnumC34866a.values().length];
            f73592f = iArr;
            try {
                iArr[GLConstants.EnumC34866a.TEXTURE_2D.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f73592f[GLConstants.EnumC34866a.BYTE_ARRAY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f73592f[GLConstants.EnumC34866a.BYTE_BUFFER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[GLConstants.PixelFormatType.values().length];
            f73591e = iArr2;
            try {
                iArr2[GLConstants.PixelFormatType.I420.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f73591e[GLConstants.PixelFormatType.RGBA.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            int[] iArr3 = new int[V2TXLiveDef.V2TXLiveBufferType.values().length];
            f73590d = iArr3;
            try {
                iArr3[V2TXLiveDef.V2TXLiveBufferType.V2TXLiveBufferTypeTexture.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f73590d[V2TXLiveDef.V2TXLiveBufferType.V2TXLiveBufferTypeByteArray.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f73590d[V2TXLiveDef.V2TXLiveBufferType.V2TXLiveBufferTypeByteBuffer.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            int[] iArr4 = new int[V2TXLiveDef.V2TXLivePixelFormat.values().length];
            f73589c = iArr4;
            try {
                iArr4[V2TXLiveDef.V2TXLivePixelFormat.V2TXLivePixelFormatI420.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f73589c[V2TXLiveDef.V2TXLivePixelFormat.V2TXLivePixelFormatTexture2D.ordinal()] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            int[] iArr5 = new int[V2TXLiveDef.V2TXLiveFillMode.values().length];
            f73588b = iArr5;
            try {
                iArr5[V2TXLiveDef.V2TXLiveFillMode.V2TXLiveFillModeFill.ordinal()] = 1;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f73588b[V2TXLiveDef.V2TXLiveFillMode.V2TXLiveFillModeFit.ordinal()] = 2;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f73588b[V2TXLiveDef.V2TXLiveFillMode.V2TXLiveFillModeScaleFill.ordinal()] = 3;
            } catch (NoSuchFieldError unused13) {
            }
            int[] iArr6 = new int[V2TXLiveDef.V2TXLiveRotation.values().length];
            f73587a = iArr6;
            try {
                iArr6[V2TXLiveDef.V2TXLiveRotation.V2TXLiveRotation90.ordinal()] = 1;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f73587a[V2TXLiveDef.V2TXLiveRotation.V2TXLiveRotation180.ordinal()] = 2;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f73587a[V2TXLiveDef.V2TXLiveRotation.V2TXLiveRotation270.ordinal()] = 3;
            } catch (NoSuchFieldError unused16) {
            }
        }
    }

    private static Object getEglContextFromLiveVideoFrame(V2TXLiveDef.V2TXLiveVideoFrame v2TXLiveVideoFrame) {
        V2TXLiveDef.V2TXLiveTexture v2TXLiveTexture = v2TXLiveVideoFrame.texture;
        Object obj = v2TXLiveTexture.eglContext10;
        if (obj == null) {
            obj = null;
        }
        android.opengl.EGLContext eGLContext = v2TXLiveTexture.eglContext14;
        if (eGLContext != null) {
            obj = eGLContext;
        }
        return obj == null ? EGL14.eglGetCurrentContext() : obj;
    }

    public V2TXLiveDef.V2TXLiveVideoFrame createV2TXLiveVideoFrame(int i11, int i12, int i13, int i14, int i15, int i16, Object obj, byte[] bArr, ByteBuffer byteBuffer) {
        V2TXLiveDef.V2TXLiveVideoFrame v2TXLiveVideoFrame = new V2TXLiveDef.V2TXLiveVideoFrame();
        int i17 = C347611.f73591e[GLConstants.PixelFormatType.m76484a(i14).ordinal()];
        if (i17 == 1) {
            v2TXLiveVideoFrame.pixelFormat = V2TXLiveDef.V2TXLivePixelFormat.V2TXLivePixelFormatI420;
        } else {
            if (i17 != 2) {
                return null;
            }
            v2TXLiveVideoFrame.pixelFormat = V2TXLiveDef.V2TXLivePixelFormat.V2TXLivePixelFormatTexture2D;
        }
        int i18 = C347611.f73592f[GLConstants.EnumC34866a.m76485a(i13).ordinal()];
        if (i18 == 1) {
            v2TXLiveVideoFrame.bufferType = V2TXLiveDef.V2TXLiveBufferType.V2TXLiveBufferTypeTexture;
            V2TXLiveDef.V2TXLiveTexture v2TXLiveTexture = new V2TXLiveDef.V2TXLiveTexture();
            v2TXLiveVideoFrame.texture = v2TXLiveTexture;
            v2TXLiveTexture.textureId = i16;
            if (obj instanceof EGLContext) {
                v2TXLiveTexture.eglContext10 = (EGLContext) obj;
            } else if (obj instanceof android.opengl.EGLContext) {
                v2TXLiveTexture.eglContext14 = (android.opengl.EGLContext) obj;
            }
        } else if (i18 == 2) {
            v2TXLiveVideoFrame.bufferType = V2TXLiveDef.V2TXLiveBufferType.V2TXLiveBufferTypeByteArray;
            v2TXLiveVideoFrame.data = bArr;
        } else {
            if (i18 != 3) {
                return null;
            }
            v2TXLiveVideoFrame.bufferType = V2TXLiveDef.V2TXLiveBufferType.V2TXLiveBufferTypeByteBuffer;
            v2TXLiveVideoFrame.buffer = byteBuffer;
        }
        v2TXLiveVideoFrame.width = i11;
        v2TXLiveVideoFrame.height = i12;
        v2TXLiveVideoFrame.rotation = i15;
        return v2TXLiveVideoFrame;
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public int enableAudioProcessObserver(boolean z11, V2TXLiveDef.V2TXLiveAudioFrameObserverFormat v2TXLiveAudioFrameObserverFormat) {
        if (v2TXLiveAudioFrameObserverFormat == null) {
            return -2;
        }
        return nativeEnableAudioProcessObserver(this.mNativeV2TXLivePusherJni, z11, v2TXLiveAudioFrameObserverFormat.sampleRate, v2TXLiveAudioFrameObserverFormat.channel, v2TXLiveAudioFrameObserverFormat.samplesPerCall, v2TXLiveAudioFrameObserverFormat.mode.ordinal());
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public int enableCustomAudioCapture(boolean z11) {
        return nativeEnableCustomAudioCapture(this.mNativeV2TXLivePusherJni, z11);
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public int enableCustomVideoCapture(boolean z11) {
        return nativeEnableCustomVideoCapture(this.mNativeV2TXLivePusherJni, z11);
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public int enableCustomVideoProcess(boolean z11, V2TXLiveDef.V2TXLivePixelFormat v2TXLivePixelFormat, V2TXLiveDef.V2TXLiveBufferType v2TXLiveBufferType) {
        if (!z11) {
            return nativeEnableCustomVideoProcess(this.mNativeV2TXLivePusherJni, z11, v2TXLivePixelFormat.ordinal(), v2TXLiveBufferType.ordinal());
        }
        if ((v2TXLiveBufferType == V2TXLiveDef.V2TXLiveBufferType.V2TXLiveBufferTypeByteBuffer && v2TXLivePixelFormat == V2TXLiveDef.V2TXLivePixelFormat.V2TXLivePixelFormatI420) || (v2TXLiveBufferType == V2TXLiveDef.V2TXLiveBufferType.V2TXLiveBufferTypeTexture && v2TXLivePixelFormat == V2TXLiveDef.V2TXLivePixelFormat.V2TXLivePixelFormatTexture2D)) {
            return nativeEnableCustomVideoProcess(this.mNativeV2TXLivePusherJni, z11, v2TXLivePixelFormat.ordinal(), v2TXLiveBufferType.ordinal());
        }
        return -4;
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public void enableVoiceActivityDetection(boolean z11) {
        nativeEnableVoiceActivityDetection(this.mNativeV2TXLivePusherJni, z11);
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public int enableVolumeEvaluation(int i11) {
        return nativeEnableVolumeEvaluation(this.mNativeV2TXLivePusherJni, i11);
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public TXAudioEffectManager getAudioEffectManager() {
        return this.mAudioEffectManager;
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public TXBeautyManager getBeautyManager() {
        return this.mBeautyManager;
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public TXDeviceManager getDeviceManager() {
        return this.mDeviceManager;
    }

    public int getFrameBufferType(V2TXLiveDef.V2TXLiveVideoFrame v2TXLiveVideoFrame) {
        GLConstants.EnumC34866a enumC34866a = GLConstants.EnumC34866a.BYTE_BUFFER;
        int i11 = C347611.f73590d[v2TXLiveVideoFrame.bufferType.ordinal()];
        if (i11 == 1) {
            enumC34866a = GLConstants.EnumC34866a.TEXTURE_2D;
        } else if (i11 == 2) {
            enumC34866a = GLConstants.EnumC34866a.BYTE_ARRAY;
        }
        return enumC34866a.mValue;
    }

    public byte[] getFrameByteArray(V2TXLiveDef.V2TXLiveVideoFrame v2TXLiveVideoFrame) {
        return v2TXLiveVideoFrame.data;
    }

    public ByteBuffer getFrameByteBuffer(V2TXLiveDef.V2TXLiveVideoFrame v2TXLiveVideoFrame) {
        return v2TXLiveVideoFrame.buffer;
    }

    public int getFrameHeight(V2TXLiveDef.V2TXLiveVideoFrame v2TXLiveVideoFrame) {
        return v2TXLiveVideoFrame.height;
    }

    public int getFramePixelFormat(V2TXLiveDef.V2TXLiveVideoFrame v2TXLiveVideoFrame) {
        GLConstants.PixelFormatType pixelFormatType = GLConstants.PixelFormatType.I420;
        int i11 = C347611.f73589c[v2TXLiveVideoFrame.pixelFormat.ordinal()];
        if (i11 != 1 && i11 == 2) {
            pixelFormatType = GLConstants.PixelFormatType.RGBA;
        }
        return pixelFormatType.getValue();
    }

    public int getFrameRotation(V2TXLiveDef.V2TXLiveVideoFrame v2TXLiveVideoFrame) {
        return v2TXLiveVideoFrame.rotation;
    }

    public int getFrameTextureId(V2TXLiveDef.V2TXLiveVideoFrame v2TXLiveVideoFrame) {
        V2TXLiveDef.V2TXLiveTexture v2TXLiveTexture;
        if (v2TXLiveVideoFrame == null || (v2TXLiveTexture = v2TXLiveVideoFrame.texture) == null) {
            return -1;
        }
        return v2TXLiveTexture.textureId;
    }

    public int getFrameWidth(V2TXLiveDef.V2TXLiveVideoFrame v2TXLiveVideoFrame) {
        return v2TXLiveVideoFrame.width;
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public String getProperty(String str) {
        return nativeGetProperty(this.mNativeV2TXLivePusherJni, str);
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public int isPushing() {
        return nativeIsPushing(this.mNativeV2TXLivePusherJni);
    }

    public void onCaptureFirstAudioFrame() {
        V2TXLivePusherObserver v2TXLivePusherObserver = this.mObserver;
        if (v2TXLivePusherObserver != null) {
            v2TXLivePusherObserver.onCaptureFirstAudioFrame();
        }
    }

    public void onCaptureFirstVideoFrame() {
        V2TXLivePusherObserver v2TXLivePusherObserver = this.mObserver;
        if (v2TXLivePusherObserver != null) {
            v2TXLivePusherObserver.onCaptureFirstVideoFrame();
        }
    }

    public int onCustomPreprocessFrame(V2TXLiveDef.V2TXLiveVideoFrame v2TXLiveVideoFrame, V2TXLiveDef.V2TXLiveVideoFrame v2TXLiveVideoFrame2) {
        V2TXLivePusherObserver v2TXLivePusherObserver = this.mObserver;
        if (v2TXLivePusherObserver != null) {
            return v2TXLivePusherObserver.onProcessVideoFrame(v2TXLiveVideoFrame, v2TXLiveVideoFrame2);
        }
        return -1;
    }

    public void onError(int i11, String str, Bundle bundle) {
        V2TXLivePusherObserver v2TXLivePusherObserver = this.mObserver;
        if (v2TXLivePusherObserver != null) {
            v2TXLivePusherObserver.onError(i11, str, bundle);
        }
    }

    public void onGLContextCreated() {
        V2TXLivePusherObserver v2TXLivePusherObserver = this.mObserver;
        if (v2TXLivePusherObserver != null) {
            v2TXLivePusherObserver.onGLContextCreated();
        }
    }

    public void onGLContextDestroyed() {
        V2TXLivePusherObserver v2TXLivePusherObserver = this.mObserver;
        if (v2TXLivePusherObserver != null) {
            v2TXLivePusherObserver.onGLContextDestroyed();
        }
    }

    public void onMicrophoneVolumeUpdate(int i11) {
        V2TXLivePusherObserver v2TXLivePusherObserver = this.mObserver;
        if (v2TXLivePusherObserver != null) {
            v2TXLivePusherObserver.onMicrophoneVolumeUpdate(i11);
        }
    }

    public void onProcessAudioFrame(byte[] bArr, long j11, int i11, int i12) {
        V2TXLivePusherObserver v2TXLivePusherObserver = this.mObserver;
        if (v2TXLivePusherObserver == null) {
            return;
        }
        V2TXLiveDef.V2TXLiveAudioFrame v2TXLiveAudioFrame = new V2TXLiveDef.V2TXLiveAudioFrame();
        v2TXLiveAudioFrame.data = bArr;
        v2TXLiveAudioFrame.sampleRate = i11;
        v2TXLiveAudioFrame.channel = i12;
        v2TXLiveAudioFrame.timestamp = j11;
        v2TXLivePusherObserver.onProcessAudioFrame(v2TXLiveAudioFrame);
    }

    public void onPushStatusUpdate(int i11, String str, Bundle bundle) {
        V2TXLivePusherObserver v2TXLivePusherObserver = this.mObserver;
        V2TXLiveDef.V2TXLivePushStatus v2TXLivePushStatus = V2TXLiveDef.V2TXLivePushStatus.V2TXLivePushStatusDisconnected;
        if (i11 == 0) {
            v2TXLivePushStatus = V2TXLiveDef.V2TXLivePushStatus.V2TXLivePushStatusConnecting;
            str = "connecting to the server.";
        } else if (i11 == 1) {
            v2TXLivePushStatus = V2TXLiveDef.V2TXLivePushStatus.V2TXLivePushStatusConnectSuccess;
            str = "connected to the server successfully.";
        } else if (i11 == 2) {
            v2TXLivePushStatus = V2TXLiveDef.V2TXLivePushStatus.V2TXLivePushStatusReconnecting;
            str = "reconnecting to the server.";
        } else if (i11 == 3) {
            str = "disconnected from the server.";
        }
        if (v2TXLivePusherObserver != null) {
            v2TXLivePusherObserver.onPushStatusUpdate(v2TXLivePushStatus, str, bundle);
        }
    }

    public void onRecordBegin(int i11, String str) {
        V2TXLivePusherObserver v2TXLivePusherObserver = this.mObserver;
        if (v2TXLivePusherObserver != null) {
            v2TXLivePusherObserver.onLocalRecordBegin(i11, str);
        }
    }

    public void onRecordComplete(int i11, String str) {
        V2TXLivePusherObserver v2TXLivePusherObserver = this.mObserver;
        if (v2TXLivePusherObserver != null) {
            v2TXLivePusherObserver.onLocalRecordComplete(i11, str);
        }
    }

    public void onRecordProgress(long j11, String str) {
        V2TXLivePusherObserver v2TXLivePusherObserver = this.mObserver;
        if (v2TXLivePusherObserver != null) {
            v2TXLivePusherObserver.onLocalRecording(j11, str);
        }
    }

    public void onScreenCaptureStarted() {
        V2TXLivePusherObserver v2TXLivePusherObserver = this.mObserver;
        if (v2TXLivePusherObserver != null) {
            v2TXLivePusherObserver.onScreenCaptureStarted();
        }
    }

    public void onScreenCaptureStoped(int i11) {
        V2TXLivePusherObserver v2TXLivePusherObserver = this.mObserver;
        if (v2TXLivePusherObserver != null) {
            v2TXLivePusherObserver.onScreenCaptureStopped(i11);
        }
    }

    public void onSetMixTranscodingConfig(int i11, String str) {
        V2TXLivePusherObserver v2TXLivePusherObserver = this.mObserver;
        if (v2TXLivePusherObserver != null) {
            v2TXLivePusherObserver.onSetMixTranscodingConfig(i11, str);
        }
    }

    public void onSnapshotComplete(Bitmap bitmap) {
        V2TXLivePusherObserver v2TXLivePusherObserver = this.mObserver;
        if (v2TXLivePusherObserver != null) {
            v2TXLivePusherObserver.onSnapshotComplete(bitmap);
        }
    }

    public void onStatisticsUpdate(int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19) {
        V2TXLivePusherObserver v2TXLivePusherObserver = this.mObserver;
        if (v2TXLivePusherObserver != null) {
            V2TXLiveDef.V2TXLivePusherStatistics v2TXLivePusherStatistics = new V2TXLiveDef.V2TXLivePusherStatistics();
            v2TXLivePusherStatistics.appCpu = i11;
            v2TXLivePusherStatistics.systemCpu = i12;
            v2TXLivePusherStatistics.width = i13;
            v2TXLivePusherStatistics.height = i14;
            v2TXLivePusherStatistics.fps = i15;
            v2TXLivePusherStatistics.videoBitrate = i16;
            v2TXLivePusherStatistics.audioBitrate = i17;
            v2TXLivePusherStatistics.rtt = i18;
            v2TXLivePusherStatistics.netSpeed = i19;
            v2TXLivePusherObserver.onStatisticsUpdate(v2TXLivePusherStatistics);
        }
    }

    public void onVoiceActivityDetectionUpdate(boolean z11) {
        V2TXLivePusherObserver v2TXLivePusherObserver = this.mObserver;
        if (v2TXLivePusherObserver != null) {
            v2TXLivePusherObserver.onVoiceActivityDetectionUpdate(z11);
        }
    }

    public void onWarning(int i11, String str, Bundle bundle) {
        V2TXLivePusherObserver v2TXLivePusherObserver = this.mObserver;
        if (v2TXLivePusherObserver != null) {
            v2TXLivePusherObserver.onWarning(i11, str, bundle);
        }
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public int pauseAudio() {
        return nativePauseAudio(this.mNativeV2TXLivePusherJni);
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public int pauseVideo() {
        return nativePauseVideo(this.mNativeV2TXLivePusherJni);
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public void release() {
        TXBeautyManagerImpl tXBeautyManagerImpl = this.mBeautyManager;
        if (tXBeautyManagerImpl != null) {
            tXBeautyManagerImpl.clear();
        }
        long j11 = this.mNativeV2TXLivePusherJni;
        if (j11 != 0) {
            nativeDestroy(j11);
            this.mNativeV2TXLivePusherJni = 0L;
        }
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public int resumeAudio() {
        return nativeResumeAudio(this.mNativeV2TXLivePusherJni);
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public int resumeVideo() {
        return nativeResumeVideo(this.mNativeV2TXLivePusherJni);
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public int sendCustomAudioFrame(V2TXLiveDef.V2TXLiveAudioFrame v2TXLiveAudioFrame) {
        if (v2TXLiveAudioFrame == null) {
            return -2;
        }
        return nativeSendCustomAudioFrame(this.mNativeV2TXLivePusherJni, v2TXLiveAudioFrame.data, v2TXLiveAudioFrame.sampleRate, v2TXLiveAudioFrame.channel, v2TXLiveAudioFrame.timestamp);
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public int sendCustomVideoFrame(V2TXLiveDef.V2TXLiveVideoFrame v2TXLiveVideoFrame) {
        GLConstants.PixelFormatType pixelFormatType;
        GLConstants.EnumC34866a enumC34866a;
        Object eglContextFromLiveVideoFrame;
        if (v2TXLiveVideoFrame == null) {
            return -2;
        }
        int i11 = C347611.f73589c[v2TXLiveVideoFrame.pixelFormat.ordinal()];
        int i12 = -1;
        if (i11 == 1) {
            pixelFormatType = GLConstants.PixelFormatType.I420;
        } else {
            if (i11 != 2) {
                return -1;
            }
            pixelFormatType = GLConstants.PixelFormatType.RGBA;
        }
        int i13 = C347611.f73590d[v2TXLiveVideoFrame.bufferType.ordinal()];
        if (i13 != 1) {
            eglContextFromLiveVideoFrame = null;
            if (i13 == 2) {
                enumC34866a = GLConstants.EnumC34866a.BYTE_ARRAY;
            } else {
                if (i13 != 3) {
                    return -1;
                }
                enumC34866a = GLConstants.EnumC34866a.BYTE_BUFFER;
            }
        } else {
            enumC34866a = GLConstants.EnumC34866a.TEXTURE_2D;
            V2TXLiveDef.V2TXLiveTexture v2TXLiveTexture = v2TXLiveVideoFrame.texture;
            if (v2TXLiveTexture == null) {
                return -1;
            }
            i12 = v2TXLiveTexture.textureId;
            eglContextFromLiveVideoFrame = getEglContextFromLiveVideoFrame(v2TXLiveVideoFrame);
        }
        return nativeSendCustomVideoFrame(this.mNativeV2TXLivePusherJni, v2TXLiveVideoFrame.width, v2TXLiveVideoFrame.height, enumC34866a.mValue, pixelFormatType.getValue(), v2TXLiveVideoFrame.rotation, i12, eglContextFromLiveVideoFrame, v2TXLiveVideoFrame.data, v2TXLiveVideoFrame.buffer);
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public int sendSeiMessage(int i11, byte[] bArr) {
        return nativeSendSeiMessage(this.mNativeV2TXLivePusherJni, i11, bArr);
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public int setAudioQuality(V2TXLiveDef.V2TXLiveAudioQuality v2TXLiveAudioQuality) {
        return nativeSetAudioQuality(this.mNativeV2TXLivePusherJni, v2TXLiveAudioQuality.ordinal());
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public int setEncoderMirror(boolean z11) {
        return nativeSetEncoderMirror(this.mNativeV2TXLivePusherJni, z11);
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public int setMixTranscodingConfig(V2TXLiveDef.V2TXLiveTranscodingConfig v2TXLiveTranscodingConfig) {
        JSONObject jSONObject;
        String string = "";
        if (v2TXLiveTranscodingConfig != null) {
            JSONObject jSONObject2 = null;
            try {
                JSONObject jSONObject3 = new JSONObject();
                try {
                    jSONObject3.put("videoWidth", v2TXLiveTranscodingConfig.videoWidth);
                    jSONObject3.put("videoHeight", v2TXLiveTranscodingConfig.videoHeight);
                    jSONObject3.put("videoBitrate", v2TXLiveTranscodingConfig.videoBitrate);
                    jSONObject3.put("videoFramerate", v2TXLiveTranscodingConfig.videoFramerate);
                    jSONObject3.put("videoGOP", v2TXLiveTranscodingConfig.videoGOP);
                    jSONObject3.put("backgroundColor", v2TXLiveTranscodingConfig.backgroundColor);
                    jSONObject3.put("backgroundImage", TextUtils.isEmpty(v2TXLiveTranscodingConfig.backgroundImage) ? "" : v2TXLiveTranscodingConfig.backgroundImage);
                    jSONObject3.put("audioSampleRate", v2TXLiveTranscodingConfig.audioSampleRate);
                    jSONObject3.put("audioBitrate", v2TXLiveTranscodingConfig.audioBitrate);
                    jSONObject3.put("audioChannels", v2TXLiveTranscodingConfig.audioChannels);
                    jSONObject3.put("outputStreamId", TextUtils.isEmpty(v2TXLiveTranscodingConfig.outputStreamId) ? "" : v2TXLiveTranscodingConfig.outputStreamId);
                    JSONArray jSONArray = new JSONArray();
                    ArrayList<V2TXLiveDef.V2TXLiveMixStream> arrayList = v2TXLiveTranscodingConfig.mixStreams;
                    if (arrayList != null) {
                        for (int i11 = 0; i11 < arrayList.size(); i11++) {
                            V2TXLiveDef.V2TXLiveMixStream v2TXLiveMixStream = arrayList.get(i11);
                            JSONObject jSONObject4 = new JSONObject();
                            jSONObject4.put("userId", TextUtils.isEmpty(v2TXLiveMixStream.userId) ? "" : v2TXLiveMixStream.userId);
                            jSONObject4.put("streamId", TextUtils.isEmpty(v2TXLiveMixStream.streamId) ? "" : v2TXLiveMixStream.streamId);
                            jSONObject4.put("x", v2TXLiveMixStream.f74806x);
                            jSONObject4.put("y", v2TXLiveMixStream.f74807y);
                            jSONObject4.put("width", v2TXLiveMixStream.width);
                            jSONObject4.put("height", v2TXLiveMixStream.height);
                            jSONObject4.put("zOrder", v2TXLiveMixStream.zOrder);
                            jSONObject4.put("inputType", v2TXLiveMixStream.inputType.ordinal());
                            jSONArray.put(jSONObject4);
                        }
                    }
                    jSONObject3.put("mixStreamList", jSONArray);
                    jSONObject = jSONObject3;
                } catch (Exception e11) {
                    e = e11;
                    jSONObject2 = jSONObject3;
                    e.printStackTrace();
                    jSONObject = jSONObject2;
                }
            } catch (Exception e12) {
                e = e12;
            }
            if (jSONObject != null) {
                string = jSONObject.toString();
            }
        }
        return nativeSetMixTranscodingConfig(this.mNativeV2TXLivePusherJni, string);
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public void setObserver(V2TXLivePusherObserver v2TXLivePusherObserver) {
        this.mObserver = v2TXLivePusherObserver;
        if (v2TXLivePusherObserver == null || !(v2TXLivePusherObserver instanceof AbstractC34986b)) {
            return;
        }
        nativeEnableExtensionCallback(this.mNativeV2TXLivePusherJni, true);
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public int setRenderFillMode(V2TXLiveDef.V2TXLiveFillMode v2TXLiveFillMode) {
        GLConstants.GLScaleType gLScaleType;
        GLConstants.GLScaleType gLScaleType2 = GLConstants.GLScaleType.CENTER_CROP;
        int i11 = C347611.f73588b[v2TXLiveFillMode.ordinal()];
        if (i11 == 1) {
            gLScaleType = GLConstants.GLScaleType.CENTER_CROP;
        } else if (i11 == 2) {
            gLScaleType = GLConstants.GLScaleType.FIT_CENTER;
        } else {
            if (i11 != 3) {
                return -2;
            }
            gLScaleType = GLConstants.GLScaleType.FILL;
        }
        return nativeSetRenderFillMode(this.mNativeV2TXLivePusherJni, gLScaleType.mValue);
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public int setRenderMirror(V2TXLiveDef.V2TXLiveMirrorType v2TXLiveMirrorType) {
        return nativeSetRenderMirror(this.mNativeV2TXLivePusherJni, v2TXLiveMirrorType.ordinal());
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public int setRenderRotation(V2TXLiveDef.V2TXLiveRotation v2TXLiveRotation) {
        EnumC34747l enumC34747l;
        int i11 = C347611.f73587a[v2TXLiveRotation.ordinal()];
        if (i11 == 1) {
            enumC34747l = EnumC34747l.ROTATION_90;
        } else if (i11 != 2) {
            enumC34747l = i11 != 3 ? EnumC34747l.NORMAL : EnumC34747l.ROTATION_270;
        } else {
            enumC34747l = EnumC34747l.ROTATION_180;
        }
        return nativeSetRenderRotation(this.mNativeV2TXLivePusherJni, enumC34747l.mValue);
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public int setRenderView(TextureView textureView) {
        return nativeSetRenderView(this.mNativeV2TXLivePusherJni, new DisplayTarget(textureView));
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public int setVideoQuality(V2TXLiveDef.V2TXLiveVideoEncoderParam v2TXLiveVideoEncoderParam) {
        if (v2TXLiveVideoEncoderParam == null) {
            return -2;
        }
        return nativeSetVideoQuality(this.mNativeV2TXLivePusherJni, v2TXLiveVideoEncoderParam.videoResolution.ordinal(), v2TXLiveVideoEncoderParam.videoResolutionMode.ordinal(), v2TXLiveVideoEncoderParam.videoFps, v2TXLiveVideoEncoderParam.videoBitrate, v2TXLiveVideoEncoderParam.minVideoBitrate);
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public int setWatermark(Bitmap bitmap, float f11, float f12, float f13) {
        return nativeSetWatermark(this.mNativeV2TXLivePusherJni, bitmap, f11, f12, f13);
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public void showDebugView(boolean z11) {
        nativeShowDebugView(this.mNativeV2TXLivePusherJni, z11);
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public int snapshot() {
        return nativeSnapshot(this.mNativeV2TXLivePusherJni);
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public int startCamera(boolean z11) {
        return nativeStartCamera(this.mNativeV2TXLivePusherJni, z11);
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public int startLocalRecording(V2TXLiveDef.V2TXLiveLocalRecordingParams v2TXLiveLocalRecordingParams) {
        if (v2TXLiveLocalRecordingParams == null || TextUtils.isEmpty(v2TXLiveLocalRecordingParams.filePath)) {
            return -2;
        }
        return nativeStartRecord(this.mNativeV2TXLivePusherJni, v2TXLiveLocalRecordingParams.filePath, v2TXLiveLocalRecordingParams.recordMode.ordinal(), v2TXLiveLocalRecordingParams.interval);
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public int startMicrophone() {
        return nativeStartMicrophone(this.mNativeV2TXLivePusherJni);
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public int startPush(String str) {
        return nativeStartPush(this.mNativeV2TXLivePusherJni, str);
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public int startScreenCapture() {
        return nativeStartScreenCapture(this.mNativeV2TXLivePusherJni);
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public int startSystemAudioLoopback() {
        return nativeStartSystemAudioLoopback(this.mNativeV2TXLivePusherJni);
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public int startVirtualCamera(Bitmap bitmap) {
        return nativeStartVirtualCamera(this.mNativeV2TXLivePusherJni, bitmap);
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public int stopCamera() {
        return nativeStopCamera(this.mNativeV2TXLivePusherJni);
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public void stopLocalRecording() {
        nativeStopRecord(this.mNativeV2TXLivePusherJni);
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public int stopMicrophone() {
        return nativeStopMicrophone(this.mNativeV2TXLivePusherJni);
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public int stopPush() {
        return nativeStopPush(this.mNativeV2TXLivePusherJni);
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public int stopScreenCapture() {
        return nativeStopScreenCapture(this.mNativeV2TXLivePusherJni);
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public int stopSystemAudioLoopback() {
        return nativeStopSystemAudioLoopback(this.mNativeV2TXLivePusherJni);
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public int stopVirtualCamera() {
        return nativeStopVirtualCamera(this.mNativeV2TXLivePusherJni);
    }

    public V2TXLivePusherJni(Context context, int i11) {
        ContextUtils.initApplicationContext(context.getApplicationContext());
        ContextUtils.setDataDirectorySuffix("liteav");
        long jNativeCreate = nativeCreate(new WeakReference(this), i11);
        this.mNativeV2TXLivePusherJni = jNativeCreate;
        this.mAudioEffectManager = new TXAudioEffectManagerImpl(nativeCreateAudioEffectManager(jNativeCreate));
        this.mBeautyManager = new TXBeautyManagerImpl(nativeCreateBeautyManager(this.mNativeV2TXLivePusherJni));
        this.mDeviceManager = new TXDeviceManagerImpl(nativeCreateDeviceManager(this.mNativeV2TXLivePusherJni));
        if (context instanceof Activity) {
            C34745j.m76118a().m76124a((Activity) context);
        }
    }

    public static V2TXLivePusherJni weakToStrongReference(WeakReference<V2TXLivePusherJni> weakReference) {
        return weakReference.get();
    }

    public void finalize() throws Throwable {
        super.finalize();
        release();
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public int setProperty(String str, Object obj) {
        str.getClass();
        if (!str.equals(V2TXLiveDefInner.TXLivePropertyKey.kV2SetSurfaceSize)) {
            if (!str.equals(V2TXLiveDefInner.TXLivePropertyKey.kV2SetSurface)) {
                return nativeSetProperty(this.mNativeV2TXLivePusherJni, str, obj);
            }
            if (obj == null) {
                nativeSetRenderView(this.mNativeV2TXLivePusherJni, null);
                return 0;
            }
            if (obj instanceof Surface) {
                nativeSetRenderView(this.mNativeV2TXLivePusherJni, new DisplayTarget((Surface) obj));
                return 0;
            }
            LiteavLog.m76083e(TAG, "setProperty error, key:" + str + ", value:" + obj);
            return -2;
        }
        LiteavLog.m76087i(TAG, "set surface size is unnecessary");
        return 0;
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public int setRenderView(SurfaceView surfaceView) {
        return nativeSetRenderView(this.mNativeV2TXLivePusherJni, new DisplayTarget(surfaceView));
    }

    public void onNetworkQuality(int i11) {
    }

    public void onPushNetStatus(Bundle bundle) {
    }

    public void onUserOffline(String str) {
    }

    public void onUserOnline(String str) {
    }

    public void onEnterRoom(int i11, String str) {
    }

    public void onExitRoom(int i11, String str) {
    }

    public void onPushEvent(int i11, Bundle bundle) {
    }

    public void onUserAudioAvailable(String str, boolean z11) {
    }

    public void onUserVideoAvailable(String str, int i11, boolean z11) {
    }
}
