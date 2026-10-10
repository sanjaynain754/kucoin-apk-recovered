package com.tencent.liteav.live;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Surface;
import android.view.SurfaceView;
import android.view.TextureView;
import com.tencent.bugly.proguard.C33978va;
import com.tencent.liteav.base.ContextUtils;
import com.tencent.liteav.base.annotations.JNINamespace;
import com.tencent.liteav.base.util.EnumC34747l;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.liteav.videobase.base.GLConstants;
import com.tencent.liteav.videobase.videobase.DisplayTarget;
import com.tencent.live2.V2TXLiveDef;
import com.tencent.live2.V2TXLivePlayer;
import com.tencent.live2.V2TXLivePlayerObserver;
import com.tencent.live2.impl.V2TXLiveDefInner;
import com.tencent.live2.impl.V2TXLivePlayerImpl;
import com.tencent.live2.impl.V2TXLiveProperty;
import com.tencent.live2.impl.p142a.AbstractC34985a;
import com.tencent.rtmp.p148ui.TXCloudVideoView;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import javax.microedition.khronos.egl.EGLContext;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes59.dex */
@JNINamespace("liteav")
public class V2TXLivePlayerJni extends V2TXLivePlayer {
    private static final String TAG = "V2TXLivePlayerJni";
    private boolean mClearLastImage = true;
    protected long mNativeV2TXLivePlayerJni;
    private V2TXLivePlayerObserver mObserver;
    private V2TXLivePlayerImpl mProxy;

    private void enableExtensionCallback(boolean z11) {
        synchronized (this) {
            nativeEnableExtensionCallback(this.mNativeV2TXLivePlayerJni, z11);
        }
    }

    private static native long nativeCreate(WeakReference<V2TXLivePlayerJni> weakReference);

    private static native void nativeDestroy(long j11);

    private static native int nativeEnableCustomRendering(long j11, boolean z11, int i11, int i12);

    private static native void nativeEnableExtensionCallback(long j11, boolean z11);

    private static native int nativeEnableObserveAudioFrame(long j11, boolean z11);

    private static native int nativeEnableReceiveSeiMessage(long j11, boolean z11, int i11);

    private static native int nativeEnableVolumeEvaluation(long j11, int i11);

    private static native String nativeGetStreamList(long j11);

    private static native int nativeIsPlaying(long j11);

    private static native int nativePauseAudio(long j11);

    private static native int nativePauseVideo(long j11);

    private static native int nativeResumeAudio(long j11);

    private static native int nativeResumeVideo(long j11);

    private static native int nativeSetCacheParams(long j11, float f11, float f12);

    private static native int nativeSetPlayoutVolume(long j11, int i11);

    private static native int nativeSetProperty(long j11, String str, Object obj);

    private static native int nativeSetRenderFillMode(long j11, int i11);

    private static native int nativeSetRenderMirrorMode(long j11, boolean z11);

    private static native int nativeSetRenderRotation(long j11, int i11);

    private static native int nativeSetRenderView(long j11, DisplayTarget displayTarget);

    private static native void nativeSetSharedEGLContext(long j11, Object obj);

    private static native void nativeShowDebugView(long j11, boolean z11);

    private static native int nativeSnapshot(long j11);

    private static native int nativeStartPlay(long j11, String str);

    private static native int nativeStartRecord(long j11, String str, int i11, int i12);

    private static native int nativeStopPlay(long j11, boolean z11);

    private static native void nativeStopRecord(long j11);

    private static native int nativeSwitchStream(long j11, String str);

    @Override // com.tencent.live2.V2TXLivePlayer
    public int setCacheParams(float f11, float f12) {
        if (f11 < 0.0f || f12 < 0.0f) {
            return -2;
        }
        return nativeSetCacheParams(this.mNativeV2TXLivePlayerJni, f11, f12);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x003b  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.tencent.live2.V2TXLivePlayer
    public int setProperty(String str, Object obj) {
        byte b11;
        synchronized (this) {
            try {
                switch (str.hashCode()) {
                    case 480042124:
                        if (!str.equals(V2TXLiveDefInner.TXLivePropertyKey.kV2SetSurfaceSize)) {
                            b11 = -1;
                        } else {
                            b11 = 2;
                        }
                        break;
                    case 582452376:
                        if (!str.equals(V2TXLiveProperty.kV2ClearLastImage)) {
                            b11 = -1;
                        } else {
                            b11 = 0;
                        }
                        break;
                    case 1120433643:
                        if (!str.equals(V2TXLiveDefInner.TXLivePropertyKey.kV2SetSurface)) {
                            b11 = -1;
                        } else {
                            b11 = 1;
                        }
                        break;
                    case 1615550654:
                        if (!str.equals(V2TXLiveDefInner.TXLivePropertyKey.kV2SetOpenGLContext)) {
                            b11 = -1;
                        } else {
                            b11 = 3;
                        }
                        break;
                    default:
                        b11 = -1;
                        break;
                }
                if (b11 != 0) {
                    if (b11 == 1) {
                        if (obj == null) {
                            return nativeSetRenderView(this.mNativeV2TXLivePlayerJni, null);
                        }
                        if (obj instanceof Surface) {
                            return nativeSetRenderView(this.mNativeV2TXLivePlayerJni, new DisplayTarget((Surface) obj));
                        }
                        LiteavLog.m76083e(TAG, "setProperty error, key:" + str + ", value:" + obj);
                        return -2;
                    }
                    if (b11 == 2) {
                        LiteavLog.m76087i(TAG, "set surface size is unnecessary");
                    } else {
                        if (b11 != 3) {
                            return nativeSetProperty(this.mNativeV2TXLivePlayerJni, str, obj);
                        }
                        if (!(obj instanceof EGLContext) && !(obj instanceof android.opengl.EGLContext)) {
                            LiteavLog.m76083e(TAG, "setProperty error, key:" + str + ", value:" + obj);
                            return -2;
                        }
                        nativeSetSharedEGLContext(this.mNativeV2TXLivePlayerJni, obj);
                    }
                } else {
                    if (!(obj instanceof Boolean)) {
                        LiteavLog.m76083e(TAG, "setProperty error, key:" + str + ", value:" + obj);
                        return -2;
                    }
                    this.mClearLastImage = ((Boolean) obj).booleanValue();
                }
                return 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.tencent.live2.V2TXLivePlayer
    public int setRenderView(TXCloudVideoView tXCloudVideoView) {
        return nativeSetRenderView(this.mNativeV2TXLivePlayerJni, tXCloudVideoView != null ? new DisplayTarget(tXCloudVideoView) : null);
    }

    /* JADX INFO: renamed from: com.tencent.liteav.live.V2TXLivePlayerJni$1 */
    public static /* synthetic */ class C347601 {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f73582a;

        /* JADX INFO: renamed from: b */
        static final /* synthetic */ int[] f73583b;

        /* JADX INFO: renamed from: c */
        static final /* synthetic */ int[] f73584c;

        /* JADX INFO: renamed from: d */
        static final /* synthetic */ int[] f73585d;

        /* JADX INFO: renamed from: e */
        static final /* synthetic */ int[] f73586e;

        static {
            int[] iArr = new int[EnumC34747l.values().length];
            f73586e = iArr;
            try {
                iArr[EnumC34747l.NORMAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f73586e[EnumC34747l.ROTATION_90.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f73586e[EnumC34747l.ROTATION_180.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f73586e[EnumC34747l.ROTATION_270.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[GLConstants.EnumC34866a.values().length];
            f73585d = iArr2;
            try {
                iArr2[GLConstants.EnumC34866a.BYTE_BUFFER.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f73585d[GLConstants.EnumC34866a.BYTE_ARRAY.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f73585d[GLConstants.EnumC34866a.TEXTURE_2D.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            int[] iArr3 = new int[GLConstants.PixelFormatType.values().length];
            f73584c = iArr3;
            try {
                iArr3[GLConstants.PixelFormatType.I420.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f73584c[GLConstants.PixelFormatType.RGBA.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            int[] iArr4 = new int[V2TXLiveDef.V2TXLiveFillMode.values().length];
            f73583b = iArr4;
            try {
                iArr4[V2TXLiveDef.V2TXLiveFillMode.V2TXLiveFillModeFill.ordinal()] = 1;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f73583b[V2TXLiveDef.V2TXLiveFillMode.V2TXLiveFillModeScaleFill.ordinal()] = 2;
            } catch (NoSuchFieldError unused11) {
            }
            int[] iArr5 = new int[V2TXLiveDef.V2TXLiveRotation.values().length];
            f73582a = iArr5;
            try {
                iArr5[V2TXLiveDef.V2TXLiveRotation.V2TXLiveRotation90.ordinal()] = 1;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f73582a[V2TXLiveDef.V2TXLiveRotation.V2TXLiveRotation180.ordinal()] = 2;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f73582a[V2TXLiveDef.V2TXLiveRotation.V2TXLiveRotation270.ordinal()] = 3;
            } catch (NoSuchFieldError unused14) {
            }
        }
    }

    public static V2TXLiveDef.V2TXLivePlayerStatistics getJavaV2TXLivePlayerStatistics(int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i21, int i22, int i23, int i24, int i25, int i26, int i27) {
        V2TXLiveDef.V2TXLivePlayerStatistics v2TXLivePlayerStatistics = new V2TXLiveDef.V2TXLivePlayerStatistics();
        v2TXLivePlayerStatistics.appCpu = i11;
        v2TXLivePlayerStatistics.systemCpu = i12;
        v2TXLivePlayerStatistics.rtt = i13;
        v2TXLivePlayerStatistics.width = i14;
        v2TXLivePlayerStatistics.height = i15;
        v2TXLivePlayerStatistics.fps = i16;
        v2TXLivePlayerStatistics.videoBitrate = i17;
        v2TXLivePlayerStatistics.audioBitrate = i18;
        v2TXLivePlayerStatistics.audioPacketLoss = i19;
        v2TXLivePlayerStatistics.videoPacketLoss = i21;
        v2TXLivePlayerStatistics.jitterBufferDelay = i22;
        v2TXLivePlayerStatistics.audioTotalBlockTime = i23;
        v2TXLivePlayerStatistics.audioBlockRate = i24;
        v2TXLivePlayerStatistics.videoTotalBlockTime = i25;
        v2TXLivePlayerStatistics.videoBlockRate = i26;
        v2TXLivePlayerStatistics.netSpeed = i27;
        return v2TXLivePlayerStatistics;
    }

    private static ArrayList<V2TXLiveDef.V2TXLiveStreamInfo> getStreamListFormJsonString(String str) {
        ArrayList<V2TXLiveDef.V2TXLiveStreamInfo> arrayList = new ArrayList<>();
        if (str != null && !str.isEmpty()) {
            try {
                JSONArray jSONArray = new JSONArray(str);
                for (int i11 = 0; i11 < jSONArray.length(); i11++) {
                    JSONObject jSONObject = jSONArray.getJSONObject(i11);
                    arrayList.add(new V2TXLiveDef.V2TXLiveStreamInfo(jSONObject.getInt("width"), jSONObject.getInt("height"), jSONObject.getInt("bitrate"), (float) jSONObject.getDouble("framerate"), jSONObject.getString("url")));
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
        return arrayList;
    }

    @Override // com.tencent.live2.V2TXLivePlayer
    public int enableObserveAudioFrame(boolean z11) {
        return nativeEnableObserveAudioFrame(this.mNativeV2TXLivePlayerJni, z11);
    }

    @Override // com.tencent.live2.V2TXLivePlayer
    public int enableObserveVideoFrame(boolean z11, V2TXLiveDef.V2TXLivePixelFormat v2TXLivePixelFormat, V2TXLiveDef.V2TXLiveBufferType v2TXLiveBufferType) {
        GLConstants.PixelFormatType pixelFormatType;
        GLConstants.EnumC34866a enumC34866a;
        V2TXLiveDef.V2TXLivePixelFormat v2TXLivePixelFormat2 = V2TXLiveDef.V2TXLivePixelFormat.V2TXLivePixelFormatI420;
        if (v2TXLivePixelFormat == v2TXLivePixelFormat2 && v2TXLiveBufferType == V2TXLiveDef.V2TXLiveBufferType.V2TXLiveBufferTypeByteArray) {
            pixelFormatType = GLConstants.PixelFormatType.I420;
            enumC34866a = GLConstants.EnumC34866a.BYTE_ARRAY;
        } else if (v2TXLivePixelFormat == V2TXLiveDef.V2TXLivePixelFormat.V2TXLivePixelFormatTexture2D && v2TXLiveBufferType == V2TXLiveDef.V2TXLiveBufferType.V2TXLiveBufferTypeTexture) {
            pixelFormatType = GLConstants.PixelFormatType.RGBA;
            enumC34866a = GLConstants.EnumC34866a.TEXTURE_2D;
        } else {
            if (v2TXLivePixelFormat != v2TXLivePixelFormat2 || v2TXLiveBufferType != V2TXLiveDef.V2TXLiveBufferType.V2TXLiveBufferTypeByteBuffer) {
                LiteavLog.m76083e(TAG, "Enable custom render failed, invalid params. format:" + v2TXLivePixelFormat + " type:" + v2TXLiveBufferType);
                return -4;
            }
            pixelFormatType = GLConstants.PixelFormatType.I420;
            enumC34866a = GLConstants.EnumC34866a.BYTE_BUFFER;
        }
        return nativeEnableCustomRendering(this.mNativeV2TXLivePlayerJni, z11, pixelFormatType.getValue(), enumC34866a.ordinal());
    }

    @Override // com.tencent.live2.V2TXLivePlayer
    public int enableReceiveSeiMessage(boolean z11, int i11) {
        return nativeEnableReceiveSeiMessage(this.mNativeV2TXLivePlayerJni, z11, i11);
    }

    @Override // com.tencent.live2.V2TXLivePlayer
    public int enableVolumeEvaluation(int i11) {
        return nativeEnableVolumeEvaluation(this.mNativeV2TXLivePlayerJni, i11);
    }

    public void finalize() {
        nativeDestroy(this.mNativeV2TXLivePlayerJni);
    }

    @Override // com.tencent.live2.V2TXLivePlayer
    public ArrayList<V2TXLiveDef.V2TXLiveStreamInfo> getStreamList() {
        return getStreamListFormJsonString(nativeGetStreamList(this.mNativeV2TXLivePlayerJni));
    }

    @Override // com.tencent.live2.V2TXLivePlayer
    public int isPlaying() {
        return nativeIsPlaying(this.mNativeV2TXLivePlayerJni);
    }

    public void onAudioLoading(Bundle bundle) {
        V2TXLivePlayerObserver v2TXLivePlayerObserver = this.mObserver;
        if (v2TXLivePlayerObserver != null) {
            v2TXLivePlayerObserver.onAudioLoading(this.mProxy, bundle);
        }
    }

    public void onAudioPlaying(boolean z11, Bundle bundle) {
        V2TXLivePlayerObserver v2TXLivePlayerObserver = this.mObserver;
        if (v2TXLivePlayerObserver != null) {
            v2TXLivePlayerObserver.onAudioPlaying(this.mProxy, z11, bundle);
        }
    }

    public void onConnected(Bundle bundle) {
        V2TXLivePlayerObserver v2TXLivePlayerObserver = this.mObserver;
        if (v2TXLivePlayerObserver != null) {
            v2TXLivePlayerObserver.onConnected(this.mProxy, bundle);
        }
    }

    public void onError(int i11, String str, Bundle bundle) {
        V2TXLivePlayerObserver v2TXLivePlayerObserver = this.mObserver;
        if (v2TXLivePlayerObserver != null) {
            v2TXLivePlayerObserver.onError(this.mProxy, i11, str, bundle);
        }
    }

    public void onPlayoutAudioFrame(byte[] bArr, long j11, int i11, int i12) {
        V2TXLiveDef.V2TXLiveAudioFrame v2TXLiveAudioFrame = new V2TXLiveDef.V2TXLiveAudioFrame();
        v2TXLiveAudioFrame.data = bArr;
        v2TXLiveAudioFrame.timestamp = j11;
        v2TXLiveAudioFrame.sampleRate = i11;
        v2TXLiveAudioFrame.channel = i12;
        V2TXLivePlayerObserver v2TXLivePlayerObserver = this.mObserver;
        if (v2TXLivePlayerObserver != null) {
            v2TXLivePlayerObserver.onPlayoutAudioFrame(this.mProxy, v2TXLiveAudioFrame);
        }
    }

    public void onPlayoutVolumeUpdate(int i11) {
        V2TXLivePlayerObserver v2TXLivePlayerObserver = this.mObserver;
        if (v2TXLivePlayerObserver != null) {
            v2TXLivePlayerObserver.onPlayoutVolumeUpdate(this.mProxy, i11);
        }
    }

    public void onReceiveSeiMessage(int i11, byte[] bArr) {
        V2TXLivePlayerObserver v2TXLivePlayerObserver = this.mObserver;
        if (v2TXLivePlayerObserver != null) {
            v2TXLivePlayerObserver.onReceiveSeiMessage(this.mProxy, i11, bArr);
        }
    }

    public void onRecordBegin(int i11, String str) {
        V2TXLivePlayerObserver v2TXLivePlayerObserver = this.mObserver;
        if (v2TXLivePlayerObserver != null) {
            v2TXLivePlayerObserver.onLocalRecordBegin(this.mProxy, i11, str);
        }
    }

    public void onRecordComplete(int i11, String str) {
        V2TXLivePlayerObserver v2TXLivePlayerObserver = this.mObserver;
        if (v2TXLivePlayerObserver != null) {
            v2TXLivePlayerObserver.onLocalRecordComplete(this.mProxy, i11, str);
        }
    }

    public void onRecordProgress(long j11, String str) {
        V2TXLivePlayerObserver v2TXLivePlayerObserver = this.mObserver;
        if (v2TXLivePlayerObserver != null) {
            v2TXLivePlayerObserver.onLocalRecording(this.mProxy, j11, str);
        }
    }

    public void onRenderVideoFrame(int i11, int i12, Object obj, int i13, int i14, int i15, int i16, long j11, byte[] bArr, ByteBuffer byteBuffer) {
        V2TXLiveDef.V2TXLiveVideoFrame v2TXLiveVideoFrame = new V2TXLiveDef.V2TXLiveVideoFrame();
        GLConstants.PixelFormatType pixelFormatTypeM76484a = GLConstants.PixelFormatType.m76484a(i11);
        int i17 = C347601.f73584c[pixelFormatTypeM76484a.ordinal()];
        if (i17 == 1) {
            v2TXLiveVideoFrame.pixelFormat = V2TXLiveDef.V2TXLivePixelFormat.V2TXLivePixelFormatI420;
        } else if (i17 != 2) {
            LiteavLog.m76083e(TAG, "Invalid pixelFormat. pixelFormat:" + pixelFormatTypeM76484a + C33978va.f72339h);
        } else {
            v2TXLiveVideoFrame.pixelFormat = V2TXLiveDef.V2TXLivePixelFormat.V2TXLivePixelFormatTexture2D;
        }
        GLConstants.EnumC34866a enumC34866aM76485a = GLConstants.EnumC34866a.m76485a(i12);
        int i18 = C347601.f73585d[enumC34866aM76485a.ordinal()];
        if (i18 == 1) {
            v2TXLiveVideoFrame.bufferType = V2TXLiveDef.V2TXLiveBufferType.V2TXLiveBufferTypeByteBuffer;
        } else if (i18 == 2) {
            v2TXLiveVideoFrame.bufferType = V2TXLiveDef.V2TXLiveBufferType.V2TXLiveBufferTypeByteArray;
        } else if (i18 != 3) {
            LiteavLog.m76083e(TAG, "Invalid bufferType. bufferType:" + enumC34866aM76485a + C33978va.f72339h);
        } else {
            v2TXLiveVideoFrame.bufferType = V2TXLiveDef.V2TXLiveBufferType.V2TXLiveBufferTypeTexture;
        }
        V2TXLiveDef.V2TXLiveTexture v2TXLiveTexture = new V2TXLiveDef.V2TXLiveTexture();
        v2TXLiveTexture.textureId = i13;
        if (obj instanceof EGLContext) {
            v2TXLiveTexture.eglContext10 = (EGLContext) obj;
        } else if (obj instanceof android.opengl.EGLContext) {
            v2TXLiveTexture.eglContext14 = (android.opengl.EGLContext) obj;
        }
        v2TXLiveVideoFrame.texture = v2TXLiveTexture;
        v2TXLiveVideoFrame.data = bArr;
        v2TXLiveVideoFrame.buffer = byteBuffer;
        v2TXLiveVideoFrame.width = i14;
        v2TXLiveVideoFrame.height = i15;
        int i19 = C347601.f73586e[EnumC34747l.m76131a(i16).ordinal()];
        if (i19 == 1) {
            v2TXLiveVideoFrame.rotation = 0;
        } else if (i19 == 2) {
            v2TXLiveVideoFrame.rotation = 90;
        } else if (i19 == 3) {
            v2TXLiveVideoFrame.rotation = 180;
        } else if (i19 != 4) {
            v2TXLiveVideoFrame.rotation = 0;
        } else {
            v2TXLiveVideoFrame.rotation = 270;
        }
        V2TXLivePlayerObserver v2TXLivePlayerObserver = this.mObserver;
        if (v2TXLivePlayerObserver != null) {
            v2TXLivePlayerObserver.onRenderVideoFrame(this.mProxy, v2TXLiveVideoFrame);
        }
    }

    public void onSnapshotComplete(Bitmap bitmap) {
        V2TXLivePlayerObserver v2TXLivePlayerObserver = this.mObserver;
        if (v2TXLivePlayerObserver != null) {
            v2TXLivePlayerObserver.onSnapshotComplete(this.mProxy, bitmap);
        }
    }

    public void onStatisticsUpdate(V2TXLiveDef.V2TXLivePlayerStatistics v2TXLivePlayerStatistics) {
        V2TXLivePlayerObserver v2TXLivePlayerObserver = this.mObserver;
        if (v2TXLivePlayerObserver != null) {
            v2TXLivePlayerObserver.onStatisticsUpdate(this.mProxy, v2TXLivePlayerStatistics);
        }
    }

    public void onStreamSwitched(int i11, String str) {
        V2TXLivePlayerObserver v2TXLivePlayerObserver = this.mObserver;
        if (v2TXLivePlayerObserver != null) {
            v2TXLivePlayerObserver.onStreamSwitched(this.mProxy, str, i11);
        }
    }

    public void onVideoLoading(Bundle bundle) {
        V2TXLivePlayerObserver v2TXLivePlayerObserver = this.mObserver;
        if (v2TXLivePlayerObserver != null) {
            v2TXLivePlayerObserver.onVideoLoading(this.mProxy, bundle);
        }
    }

    public void onVideoPlaying(boolean z11, Bundle bundle) {
        V2TXLivePlayerObserver v2TXLivePlayerObserver = this.mObserver;
        if (v2TXLivePlayerObserver != null) {
            v2TXLivePlayerObserver.onVideoPlaying(this.mProxy, z11, bundle);
        }
    }

    public void onVideoResolutionChanged(int i11, int i12) {
        V2TXLivePlayerObserver v2TXLivePlayerObserver = this.mObserver;
        if (v2TXLivePlayerObserver != null) {
            v2TXLivePlayerObserver.onVideoResolutionChanged(this.mProxy, i11, i12);
        }
    }

    public void onWarning(int i11, String str, Bundle bundle) {
        V2TXLivePlayerObserver v2TXLivePlayerObserver = this.mObserver;
        if (v2TXLivePlayerObserver != null) {
            v2TXLivePlayerObserver.onWarning(this.mProxy, i11, str, bundle);
        }
    }

    @Override // com.tencent.live2.V2TXLivePlayer
    public int pauseAudio() {
        return nativePauseAudio(this.mNativeV2TXLivePlayerJni);
    }

    @Override // com.tencent.live2.V2TXLivePlayer
    public int pauseVideo() {
        return nativePauseVideo(this.mNativeV2TXLivePlayerJni);
    }

    @Override // com.tencent.live2.V2TXLivePlayer
    public int resumeAudio() {
        return nativeResumeAudio(this.mNativeV2TXLivePlayerJni);
    }

    @Override // com.tencent.live2.V2TXLivePlayer
    public int resumeVideo() {
        return nativeResumeVideo(this.mNativeV2TXLivePlayerJni);
    }

    @Override // com.tencent.live2.V2TXLivePlayer
    public void setObserver(V2TXLivePlayerObserver v2TXLivePlayerObserver) {
        this.mObserver = v2TXLivePlayerObserver;
        if (v2TXLivePlayerObserver == null || !(v2TXLivePlayerObserver instanceof AbstractC34985a)) {
            return;
        }
        enableExtensionCallback(true);
    }

    @Override // com.tencent.live2.V2TXLivePlayer
    public int setPlayoutVolume(int i11) {
        return nativeSetPlayoutVolume(this.mNativeV2TXLivePlayerJni, i11);
    }

    @Override // com.tencent.live2.V2TXLivePlayer
    public int setRenderFillMode(V2TXLiveDef.V2TXLiveFillMode v2TXLiveFillMode) {
        GLConstants.GLScaleType gLScaleType;
        int i11 = C347601.f73583b[v2TXLiveFillMode.ordinal()];
        if (i11 != 1) {
            gLScaleType = i11 != 2 ? GLConstants.GLScaleType.FIT_CENTER : GLConstants.GLScaleType.FILL;
        } else {
            gLScaleType = GLConstants.GLScaleType.CENTER_CROP;
        }
        return nativeSetRenderFillMode(this.mNativeV2TXLivePlayerJni, gLScaleType.mValue);
    }

    @Override // com.tencent.live2.V2TXLivePlayer
    public int setRenderMirrorMode(boolean z11) {
        return nativeSetRenderMirrorMode(this.mNativeV2TXLivePlayerJni, z11);
    }

    @Override // com.tencent.live2.V2TXLivePlayer
    public int setRenderRotation(V2TXLiveDef.V2TXLiveRotation v2TXLiveRotation) {
        EnumC34747l enumC34747l;
        int i11 = C347601.f73582a[v2TXLiveRotation.ordinal()];
        if (i11 == 1) {
            enumC34747l = EnumC34747l.ROTATION_90;
        } else if (i11 != 2) {
            enumC34747l = i11 != 3 ? EnumC34747l.NORMAL : EnumC34747l.ROTATION_270;
        } else {
            enumC34747l = EnumC34747l.ROTATION_180;
        }
        return nativeSetRenderRotation(this.mNativeV2TXLivePlayerJni, enumC34747l.mValue);
    }

    @Override // com.tencent.live2.V2TXLivePlayer
    public int setRenderView(TextureView textureView) {
        return nativeSetRenderView(this.mNativeV2TXLivePlayerJni, textureView != null ? new DisplayTarget(textureView) : null);
    }

    @Override // com.tencent.live2.V2TXLivePlayer
    public void showDebugView(boolean z11) {
        nativeShowDebugView(this.mNativeV2TXLivePlayerJni, z11);
    }

    @Override // com.tencent.live2.V2TXLivePlayer
    public int snapshot() {
        return nativeSnapshot(this.mNativeV2TXLivePlayerJni);
    }

    @Override // com.tencent.live2.V2TXLivePlayer
    public int startLivePlay(String str) {
        return nativeStartPlay(this.mNativeV2TXLivePlayerJni, str);
    }

    @Override // com.tencent.live2.V2TXLivePlayer
    public int startLocalRecording(V2TXLiveDef.V2TXLiveLocalRecordingParams v2TXLiveLocalRecordingParams) {
        if (v2TXLiveLocalRecordingParams == null || TextUtils.isEmpty(v2TXLiveLocalRecordingParams.filePath)) {
            return -2;
        }
        return nativeStartRecord(this.mNativeV2TXLivePlayerJni, v2TXLiveLocalRecordingParams.filePath, v2TXLiveLocalRecordingParams.recordMode.ordinal(), v2TXLiveLocalRecordingParams.interval);
    }

    @Override // com.tencent.live2.V2TXLivePlayer
    public void stopLocalRecording() {
        nativeStopRecord(this.mNativeV2TXLivePlayerJni);
    }

    @Override // com.tencent.live2.V2TXLivePlayer
    public int stopPlay() {
        return nativeStopPlay(this.mNativeV2TXLivePlayerJni, this.mClearLastImage);
    }

    public V2TXLivePlayerJni(Context context, V2TXLivePlayerImpl v2TXLivePlayerImpl) {
        this.mNativeV2TXLivePlayerJni = 0L;
        this.mProxy = v2TXLivePlayerImpl;
        ContextUtils.initApplicationContext(context.getApplicationContext());
        ContextUtils.setDataDirectorySuffix("liteav");
        this.mNativeV2TXLivePlayerJni = nativeCreate(new WeakReference(this));
    }

    public static V2TXLivePlayerJni weakToStrongReference(WeakReference<V2TXLivePlayerJni> weakReference) {
        return weakReference.get();
    }

    @Override // com.tencent.live2.V2TXLivePlayer
    public int setRenderView(SurfaceView surfaceView) {
        return nativeSetRenderView(this.mNativeV2TXLivePlayerJni, surfaceView != null ? new DisplayTarget(surfaceView) : null);
    }

    @Override // com.tencent.live2.V2TXLivePlayer
    public int switchStream(String str) {
        if (TextUtils.isEmpty(str)) {
            LiteavLog.m76083e(TAG, "Invalid params.");
            return -2;
        }
        return nativeSwitchStream(this.mNativeV2TXLivePlayerJni, str);
    }

    public void onNetworkQuality(int i11) {
    }

    public void onPlayNetStatus(Bundle bundle) {
    }

    public void onPlayEvent(int i11, Bundle bundle) {
    }
}
