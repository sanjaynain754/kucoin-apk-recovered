package com.tencent.liteav.thumbplayer;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.os.PowerManager;
import android.text.TextUtils;
import android.util.Log;
import android.view.Surface;
import android.view.SurfaceHolder;
import androidx.media3.common.C2711C;
import com.appsflyer.AppsFlyerProperties;
import com.tencent.liteav.base.system.LiteavSystemInfo;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.liteav.base.util.SoLoader;
import com.tencent.liteav.sdk.common.HouseBuilder;
import com.tencent.liteav.txcplayer.AbstractC34803a;
import com.tencent.liteav.txcplayer.C34813e;
import com.tencent.liteav.txcplayer.InterfaceC34807b;
import com.tencent.liteav.txcplayer.InterfaceC34808c;
import com.tencent.liteav.txcplayer.common.C34809a;
import com.tencent.liteav.txcplayer.common.C34810b;
import com.tencent.liteav.txcplayer.common.C34811c;
import com.tencent.liteav.txcplayer.model.C34815a;
import com.tencent.liteav.txcplayer.model.C34816b;
import com.tencent.liteav.txcplayer.model.C34817c;
import com.tencent.liteav.txcplayer.model.TXSubtitleRenderModel;
import com.tencent.liteav.txcplayer.p131a.C34804a;
import com.tencent.liteav.txcvodplayer.hlsencoder.TXCHLSEncoder;
import com.tencent.liteav.txcvodplayer.p133b.C34836c;
import com.tencent.liteav.txcvodplayer.p134c.C34841a;
import com.tencent.rtmp.TXVodConstants;
import com.tencent.thumbplayer.tcmedia.api.ITPModuleLoader;
import com.tencent.thumbplayer.tcmedia.api.ITPPlayer;
import com.tencent.thumbplayer.tcmedia.api.ITPPlayerListener;
import com.tencent.thumbplayer.tcmedia.api.TPAudioFrameBuffer;
import com.tencent.thumbplayer.tcmedia.api.TPOptionalParam;
import com.tencent.thumbplayer.tcmedia.api.TPPlayerFactory;
import com.tencent.thumbplayer.tcmedia.api.TPPlayerMgr;
import com.tencent.thumbplayer.tcmedia.api.TPProgramInfo;
import com.tencent.thumbplayer.tcmedia.api.TPSubtitleRenderModel;
import com.tencent.thumbplayer.tcmedia.api.TPTrackInfo;
import com.tencent.thumbplayer.tcmedia.api.TPVideoInfo;
import com.tencent.thumbplayer.tcmedia.api.composition.ITPMediaAsset;
import com.tencent.thumbplayer.tcmedia.api.composition.ITPMediaAssetExtraParam;
import com.tencent.thumbplayer.tcmedia.api.composition.ITPMediaAssetOrderedMap;
import com.tencent.thumbplayer.tcmedia.api.composition.ITPMediaDRMAsset;
import com.tencent.thumbplayer.tcmedia.api.composition.ITPMediaUrlAsset;
import com.tencent.thumbplayer.tcmedia.api.composition.TPMediaCompositionFactory;
import com.tencent.thumbplayer.tcmedia.api.proxy.TPDownloadParamData;
import com.tencent.thumbplayer.tcmedia.config.TPPlayerConfig;
import com.tencent.thumbplayer.tcmedia.core.common.TPSystemInfo;
import com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPDownloadProxy;
import com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.TPDLProxyInitParam;
import com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.TPDownloadProxyEnum;
import com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.TPDownloadProxyFactory;
import com.tencent.thumbplayer.tcmedia.utils.TPLogUtil;
import com.tencent.trtc.TRTCCloudDef;
import java.io.FileDescriptor;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes59.dex */
public class ThumbMediaPlayer extends AbstractC34803a implements InterfaceC34807b {
    private static int MODE_PHONE = 0;
    private static int MODE_TV = 1;
    private static final String THUMB_PLAYER_GUID = "liteav_tbplayer_android_";
    private static final int THUMB_PLAYER_PLATFORM_ID = 2330303;

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int f73667a = 0;
    private static volatile boolean mSDKInited;
    private C34813e mConfig;
    private Context mContext;
    private String mDataSource;
    private boolean mIsLooping;
    private boolean mIsPlayerReleased;
    private Map<String, Object> mPrivateConfig;
    private float mRate;
    private boolean mReuseSurfaceTexture;
    private boolean mScreenOnWhilePlaying;
    private Surface mSurface;
    private SurfaceHolder mSurfaceHolder;
    private SurfaceTexture mSurfaceTexture;
    private InterfaceC34808c mSurfaceTextureHost;
    private volatile ITPPlayer mTPPPlayer;
    private final String TAG = ThumbMediaPlayer.class.getName();
    private boolean mEnableAccurateSeek = false;
    private PowerManager.WakeLock mWakeLock = null;
    private int mBitrateIndex = -1000;
    private long mCachedBytes = 0;
    private long mBitrate = 0;
    private long mTcpSpeed = 0;
    private long mTotalFileSize = 0;
    private boolean mHasReceiveFirstVideoRenderEvent = false;
    private Object mTrtcCloud = null;
    private boolean mIsSetDefaultBufferSize = false;

    public static class TRTCCloudClassInvokeHelper {
        private static final String TAG = "com.tencent.liteav.thumbplayer.ThumbMediaPlayer$TRTCCloudClassInvokeHelper";
        private static TRTCCloudClassInvokeHelper mInstance;
        private Class mClazzTRTCAudioFrame;
        private Class mClazzTRTCCloud;
        private Field mFieldChannel;
        private Field mFieldData;
        private Field mFieldSampleRate;
        private Method mMethodMixExternalAudioFrame;

        /* JADX INFO: Access modifiers changed from: private */
        public static TRTCCloudClassInvokeHelper getInstance(Object obj) {
            if (mInstance == null) {
                mInstance = new TRTCCloudClassInvokeHelper(obj);
            }
            return mInstance;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mixExternalAudioFrame(Object obj, TPAudioFrameBuffer tPAudioFrameBuffer) {
            if (obj != null) {
                try {
                    Object objNewInstance = this.mClazzTRTCAudioFrame.newInstance();
                    this.mFieldData.set(objNewInstance, tPAudioFrameBuffer.data[0]);
                    this.mFieldSampleRate.set(objNewInstance, Integer.valueOf(tPAudioFrameBuffer.sampleRate));
                    this.mFieldChannel.set(objNewInstance, Integer.valueOf(tPAudioFrameBuffer.channels));
                    this.mMethodMixExternalAudioFrame.invoke(obj, objNewInstance);
                } catch (Exception e11) {
                    LiteavLog.m76084e(TAG, "mixExternalAudioFrame method error ", e11);
                }
            }
        }

        private TRTCCloudClassInvokeHelper(Object obj) {
            if (obj != null) {
                try {
                    this.mClazzTRTCCloud = obj.getClass();
                    this.mClazzTRTCAudioFrame = TRTCCloudDef.TRTCAudioFrame.class;
                    this.mFieldData = TRTCCloudDef.TRTCAudioFrame.class.getDeclaredField("data");
                    this.mFieldSampleRate = this.mClazzTRTCAudioFrame.getDeclaredField("sampleRate");
                    this.mFieldChannel = this.mClazzTRTCAudioFrame.getDeclaredField(AppsFlyerProperties.CHANNEL);
                    this.mMethodMixExternalAudioFrame = this.mClazzTRTCCloud.getDeclaredMethod("mixExternalAudioFrame", this.mClazzTRTCAudioFrame);
                } catch (Exception e11) {
                    LiteavLog.m76083e(TAG, "init TRTCCloudClassInvokeWrapper error: " + e11.getMessage());
                }
            }
        }
    }

    private void setSurfaceToPlayer(Surface surface) {
        this.mSurfaceHolder = null;
        this.mSurface = surface;
        this.mTPPPlayer.setSurface(surface);
        innerLogI("setSurfaceToPlayer: " + this.mSurface);
    }

    @Override // com.tencent.liteav.txcplayer.ITXVCubePlayer
    public int getVideoSarDen() {
        return 0;
    }

    @Override // com.tencent.liteav.txcplayer.ITXVCubePlayer
    public int getVideoSarNum() {
        return 0;
    }

    @Override // com.tencent.liteav.txcplayer.ITXVCubePlayer
    public boolean isPlayable() {
        return true;
    }

    @Override // com.tencent.liteav.txcplayer.ITXVCubePlayer
    public boolean isPlaying() {
        try {
            return this.mTPPPlayer.getCurrentState() == 5;
        } catch (Throwable th2) {
            th2.printStackTrace();
            return false;
        }
    }

    public void onReceiveFirstPacketReadEvent() {
        notifyOnInfo(TXVodConstants.VOD_PLAY_EVT_FIRST_VIDEO_PACKET, 0, 0, null);
    }

    @Override // com.tencent.liteav.txcplayer.ITXVCubePlayer
    public void release() {
        this.mIsPlayerReleased = true;
        releaseSurfaceTexture();
        this.mTPPPlayer.setSurface(null);
        detachTRTC();
        C34809a.m76230a().execute(new Runnable() { // from class: com.tencent.liteav.thumbplayer.ThumbMediaPlayer.1
            @Override // java.lang.Runnable
            public void run() {
                ThumbMediaPlayer.this.mTPPPlayer.release();
            }
        });
    }

    @Override // com.tencent.liteav.txcplayer.ITXVCubePlayer
    public void releaseTextureHost() {
        this.mSurfaceTextureHost = null;
    }

    @Override // com.tencent.liteav.txcplayer.ITXVCubePlayer
    public void setDataSource(Context context, Uri uri) throws IllegalStateException, IOException, SecurityException, IllegalArgumentException {
        if (isContentUri(uri.toString())) {
            this.mTPPPlayer.setDataSource(this.mContext.getContentResolver().openAssetFileDescriptor(uri, "r"));
        } else if (!isAssetFile(uri.toString())) {
            setDataSource(context, uri, null);
        } else {
            this.mTPPPlayer.setDataSource(this.mContext.getAssets().openFd(uri.toString().substring(uri.toString().indexOf("://") + 3)));
        }
    }

    public void setMaxCacheSize(int i11) {
        TPPlayerMgr.setProxyMaxStorageSizeMB(i11);
    }

    public static class TXSDKModuleLoader implements ITPModuleLoader {
        private TXSDKModuleLoader() {
        }

        @Override // com.tencent.thumbplayer.tcmedia.api.ITPModuleLoader
        public void loadLibrary(String str, String str2) {
            SoLoader.loadLibrary(str);
        }
    }

    private int checkDlType() {
        C34813e c34813e = this.mConfig;
        if (c34813e == null) {
            return 0;
        }
        int i11 = c34813e.f73737D;
        if (i11 == 1) {
            return 3;
        }
        if (i11 == 2) {
            return 5;
        }
        if (i11 != 3) {
            return i11 != 4 ? 0 : 19;
        }
        return 10;
    }

    private TPSubtitleRenderModel convertToTPSubtitleRenderModel(TXSubtitleRenderModel tXSubtitleRenderModel) {
        int i11;
        TPSubtitleRenderModel tPSubtitleRenderModel = new TPSubtitleRenderModel();
        int i12 = tXSubtitleRenderModel.canvasHeight;
        if (i12 != 0 && (i11 = tXSubtitleRenderModel.canvasWidth) != 0) {
            tPSubtitleRenderModel.canvasWidth = i11;
            tPSubtitleRenderModel.canvasHeight = i12;
            long j11 = tPSubtitleRenderModel.paramFlags;
            tPSubtitleRenderModel.paramFlags = 3 | j11;
            float f11 = tXSubtitleRenderModel.fontSize;
            if (f11 != 0.0f) {
                tPSubtitleRenderModel.fontSize = f11;
                tPSubtitleRenderModel.paramFlags = j11 | 7;
            }
            float f12 = tXSubtitleRenderModel.outlineWidth;
            if (f12 != 0.0f) {
                tPSubtitleRenderModel.outlineWidth = f12;
                tPSubtitleRenderModel.paramFlags |= 16;
            }
            float f13 = tXSubtitleRenderModel.lineSpace;
            if (f13 != 0.0f) {
                tPSubtitleRenderModel.lineSpace = f13;
                tPSubtitleRenderModel.paramFlags |= 64;
            }
        }
        float f14 = tXSubtitleRenderModel.fontScale;
        if (f14 != 0.0f) {
            tPSubtitleRenderModel.fontScale = f14;
            tPSubtitleRenderModel.paramFlags |= 2048;
        }
        String str = tXSubtitleRenderModel.familyName;
        if (str != null) {
            tPSubtitleRenderModel.familyName = str;
        }
        int i13 = tXSubtitleRenderModel.fontColor;
        if (i13 != 0) {
            tPSubtitleRenderModel.fontColor = i13;
            tPSubtitleRenderModel.paramFlags |= 8;
        }
        if (tXSubtitleRenderModel.isBondFontStyle) {
            tPSubtitleRenderModel.fontStyleFlags |= 1;
            tPSubtitleRenderModel.paramFlags |= 1024;
        }
        int i14 = tXSubtitleRenderModel.outlineColor;
        if (i14 != 0) {
            tPSubtitleRenderModel.outlineColor = i14;
            tPSubtitleRenderModel.paramFlags |= 32;
        }
        float f15 = tXSubtitleRenderModel.startMargin;
        if (f15 != 0.0f) {
            tPSubtitleRenderModel.lineSpace = f15;
            tPSubtitleRenderModel.paramFlags |= 128;
        }
        float f16 = tXSubtitleRenderModel.endMargin;
        if (f16 != 0.0f) {
            tPSubtitleRenderModel.endMargin = f16;
            tPSubtitleRenderModel.paramFlags |= 256;
        }
        float f17 = tXSubtitleRenderModel.verticalMargin;
        if (f17 != 0.0f) {
            tPSubtitleRenderModel.verticalMargin = f17;
            tPSubtitleRenderModel.paramFlags |= 512;
        }
        return tPSubtitleRenderModel;
    }

    private ITPMediaAsset handleDRMAsset(String str) {
        Map<String, Object> map = this.mPrivateConfig;
        if (map == null) {
            return null;
        }
        Object obj = map.get("TXC_DRM_ENABLE");
        if (!(obj instanceof Boolean) || !((Boolean) obj).booleanValue()) {
            return null;
        }
        Object obj2 = this.mPrivateConfig.get("TXC_DRM_KEY_URL");
        Object obj3 = this.mPrivateConfig.get("TXC_DRM_PROVISION_URL");
        if ((obj2 instanceof String) && (obj3 instanceof String)) {
            String str2 = (String) obj2;
            if (!TextUtils.isEmpty(str2)) {
                String str3 = (String) obj3;
                if (!TextUtils.isEmpty(str3)) {
                    ITPMediaDRMAsset iTPMediaDRMAssetCreateMediaDRMAsset = TPMediaCompositionFactory.createMediaDRMAsset(0, str);
                    iTPMediaDRMAssetCreateMediaDRMAsset.setDrmProperty(ITPMediaDRMAsset.TP_PLAYER_DRM_PROPERTY_PROVISION_URL, str3);
                    iTPMediaDRMAssetCreateMediaDRMAsset.setDrmProperty(ITPMediaDRMAsset.TP_PLAYER_DRM_PROPERTY_LICENSE_URL, str2);
                    iTPMediaDRMAssetCreateMediaDRMAsset.setDrmProperty(ITPMediaDRMAsset.TP_PLAYER_DRM_PROPERTY_LICENSE_STANDARDIZATION, "1");
                    return iTPMediaDRMAssetCreateMediaDRMAsset;
                }
            }
        }
        Object obj4 = this.mPrivateConfig.get("TXC_DRM_SIMPLE_AES_URL");
        if (!(obj4 instanceof String)) {
            return null;
        }
        String str4 = (String) obj4;
        if (TextUtils.isEmpty(str4)) {
            return null;
        }
        return TPMediaCompositionFactory.createMediaUrlAsset(str4);
    }

    private ITPMediaUrlAsset handleUrlAsset(String str) {
        C34813e c34813e = this.mConfig;
        if (c34813e == null || c34813e.f73745g != 1) {
            return null;
        }
        int i11 = c34813e.f73756r;
        long jResolveAdaptivePreferredResolution = resolveAdaptivePreferredResolution(c34813e.f73760v);
        String str2 = getConfig().f73738E;
        ITPMediaUrlAsset iTPMediaUrlAssetCreateMediaUrlAsset = TPMediaCompositionFactory.createMediaUrlAsset(str);
        ITPMediaAssetExtraParam iTPMediaAssetExtraParamCreateMediaAssetExtraParam = TPMediaCompositionFactory.createMediaAssetExtraParam();
        if (i11 > 0 || jResolveAdaptivePreferredResolution > 0) {
            ITPMediaAssetOrderedMap iTPMediaAssetOrderedMapCreateMediaAssetOrderedMap = TPMediaCompositionFactory.createMediaAssetOrderedMap();
            String strM76212a = C34804a.m76212a(str);
            if (!TextUtils.isEmpty(strM76212a)) {
                if (strM76212a.toLowerCase().endsWith("m3u8")) {
                    if (i11 > 0) {
                        iTPMediaAssetOrderedMapCreateMediaAssetOrderedMap.addKeyValue(ITPMediaAssetOrderedMap.TP_PLAYER_EXTRA_PARAM_HLS_TRACK_BANDWIDTH, String.valueOf(i11));
                    } else {
                        iTPMediaAssetOrderedMapCreateMediaAssetOrderedMap.addKeyValue(ITPMediaAssetOrderedMap.TP_PLAYER_EXTRA_PARAM_HLS_TRACK_LUMA_SAMPLES, String.valueOf(jResolveAdaptivePreferredResolution));
                    }
                } else if (strM76212a.toLowerCase().endsWith("mpd")) {
                    if (i11 > 0) {
                        iTPMediaAssetOrderedMapCreateMediaAssetOrderedMap.addKeyValue(ITPMediaAssetOrderedMap.TP_PLAYER_EXTRA_PARAM_DASH_TRACK_BANDWIDTH, String.valueOf(i11));
                    } else {
                        iTPMediaAssetOrderedMapCreateMediaAssetOrderedMap.addKeyValue(ITPMediaAssetOrderedMap.TP_PLAYER_EXTRA_PARAM_DASH_TRACK_LUMA_SAMPLES, String.valueOf(jResolveAdaptivePreferredResolution));
                    }
                }
                iTPMediaAssetExtraParamCreateMediaAssetExtraParam.setExtraObject(ITPMediaAssetExtraParam.TP_PLAYER_EXTRA_PARAM_PREFERRED_VIDEO, iTPMediaAssetOrderedMapCreateMediaAssetOrderedMap);
            }
        }
        if (!TextUtils.isEmpty(str2) && C34811c.m76238a(HouseBuilder.EnumC34765a.PLAYER_PREMIUM)) {
            ITPMediaAssetOrderedMap iTPMediaAssetOrderedMapCreateMediaAssetOrderedMap2 = TPMediaCompositionFactory.createMediaAssetOrderedMap();
            iTPMediaAssetOrderedMapCreateMediaAssetOrderedMap2.addKeyValue(ITPMediaAssetOrderedMap.TP_PLAYER_EXTRA_PARAM_HLS_TRACK_NAME, str2);
            iTPMediaAssetExtraParamCreateMediaAssetExtraParam.setExtraObject(ITPMediaAssetExtraParam.TP_PLAYER_EXTRA_PARAM_PREFERRED_AUDIO, iTPMediaAssetOrderedMapCreateMediaAssetOrderedMap2);
        }
        iTPMediaUrlAssetCreateMediaUrlAsset.setExtraParam(iTPMediaAssetExtraParamCreateMediaAssetExtraParam);
        return iTPMediaUrlAssetCreateMediaUrlAsset;
    }

    private void innerLogE(String str) {
        LiteavLog.m76083e(this.TAG, "[" + hashCode() + "], " + str);
    }

    private void innerLogI(String str) {
        LiteavLog.m76087i(this.TAG, "[" + hashCode() + "], " + str);
    }

    private void parseExtraConfig(Map<String, Object> map) {
        if (map == null || map.size() == 0) {
            return;
        }
        for (String str : map.keySet()) {
            Object obj = map.get(str);
            if (str.equals(TXVodConstants.VOD_USE_DOWNLOADER) && (obj instanceof Boolean)) {
                TPPlayerConfig.setP2PEnable(((Boolean) obj).booleanValue());
            } else if (str.equals(TXVodConstants.VOD_USE_DRM_L3) && (obj instanceof Boolean)) {
                this.mTPPPlayer.setPlayerOptionalParam(new TPOptionalParam().buildBoolean(510, ((Boolean) obj).booleanValue()));
            } else {
                try {
                    int i11 = Integer.parseInt(str);
                    if (obj instanceof Boolean) {
                        this.mTPPPlayer.setPlayerOptionalParam(new TPOptionalParam().buildBoolean(i11, ((Boolean) obj).booleanValue()));
                    } else if ((obj instanceof Long) || (obj instanceof Integer)) {
                        this.mTPPPlayer.setPlayerOptionalParam(new TPOptionalParam().buildLong(i11, obj instanceof Long ? ((Long) obj).longValue() : ((Integer) obj).longValue()));
                    } else if ((obj instanceof Float) || (obj instanceof Double)) {
                        this.mTPPPlayer.setPlayerOptionalParam(new TPOptionalParam().buildFloat(i11, obj instanceof Float ? ((Float) obj).floatValue() : ((Double) obj).floatValue()));
                    } else if (obj instanceof String) {
                        this.mTPPPlayer.setPlayerOptionalParam(new TPOptionalParam().buildString(i11, (String) obj));
                    } else {
                        this.mTPPPlayer.setPlayerOptionalParam(new TPOptionalParam().buildObject(i11, obj));
                    }
                } catch (Exception unused) {
                    innerLogE("key " + str + " is not id!");
                }
            }
        }
    }

    private long resolveAdaptivePreferredResolution(long j11) {
        if (this.mBitrateIndex == -1 && j11 <= 0) {
            long j12 = this.mConfig.f73758t;
            if (j12 > 0) {
                return j12;
            }
        }
        return j11;
    }

    private void setMp4EncryptionInfo(String str, boolean z11) {
        boolean z12 = true;
        if (this.mConfig.f73759u != 1 || str == null || str.isEmpty() || !C34811c.m76238a(HouseBuilder.EnumC34765a.PLAYER_PREMIUM)) {
            return;
        }
        String strM76217d = C34804a.m76217d(str);
        C34841a c34841aM76410a = C34841a.m76410a();
        synchronized (c34841aM76410a.f74013b) {
            c34841aM76410a.f74014c.add(strM76217d);
        }
        C34836c.b bVarM76415a = C34841a.m76410a().m76415a(666, strM76217d);
        if (bVarM76415a == null || TextUtils.isEmpty(bVarM76415a.f73966a)) {
            bVarM76415a = new C34836c.b();
            bVarM76415a.f73966a = TXCHLSEncoder.m76424a();
            bVarM76415a.f73967b = TXCHLSEncoder.m76424a();
        } else {
            z12 = false;
        }
        if (TextUtils.isEmpty(bVarM76415a.f73968c)) {
            bVarM76415a.f73968c = TXCHLSEncoder.m76426a(bVarM76415a.f73966a);
            bVarM76415a.f73969d = TXCHLSEncoder.m76426a(bVarM76415a.f73967b);
        }
        if (TextUtils.isEmpty(bVarM76415a.f73968c) || TextUtils.isEmpty(bVarM76415a.f73969d)) {
            return;
        }
        this.mTPPPlayer.setPlayerOptionalParam(new TPOptionalParam().buildString(184, bVarM76415a.f73966a));
        this.mTPPPlayer.setPlayerOptionalParam(new TPOptionalParam().buildString(185, bVarM76415a.f73967b));
        Map<String, String> map = this.mConfig.f73746h;
        if (map == null) {
            map = new HashMap<>();
        }
        map.put("X-Request-CipheredOverlayKey", bVarM76415a.f73968c);
        map.put("X-Request-CipheredOverlayIV", bVarM76415a.f73969d);
        map.put("X-Request-CipheredOverlayVersion", "v2");
        this.mConfig.f73746h = map;
        if (z12 && z11) {
            C34841a.m76410a().m76417a(666, strM76217d, bVarM76415a, str);
        }
    }

    @Override // com.tencent.liteav.txcplayer.ITXVCubePlayer
    public void addSubtitleSource(String str, String str2, String str3) {
        this.mTPPPlayer.addSubtitleSource(str, str3, str2);
    }

    @Override // com.tencent.liteav.txcplayer.ITXVCubePlayer
    public void attachTRTC(Object obj) {
        this.mTrtcCloud = obj;
        if (obj != null) {
            try {
                Class<?> cls = obj.getClass();
                Class cls2 = Boolean.TYPE;
                cls.getDeclaredMethod("enableMixExternalAudioFrame", cls2, cls2).invoke(this.mTrtcCloud, Boolean.FALSE, Boolean.TRUE);
                innerLogI("attachTRTC enableMixExternalAudioFrame");
                setEnableMixExternalAudioFrame();
            } catch (Exception e11) {
                innerLogE("attachTRTC exception : " + Log.getStackTraceString(e11));
            }
        }
    }

    @Override // com.tencent.liteav.txcplayer.ITXVCubePlayer
    public void deselectTrack(int i11) {
        this.mTPPPlayer.deselectTrack(i11, i11);
    }

    @Override // com.tencent.liteav.txcplayer.ITXVCubePlayer
    public void detachTRTC() {
        innerLogI("detachTRTC");
        Object obj = this.mTrtcCloud;
        if (obj != null) {
            try {
                Class<?> cls = obj.getClass();
                Class cls2 = Boolean.TYPE;
                Method declaredMethod = cls.getDeclaredMethod("enableMixExternalAudioFrame", cls2, cls2);
                Object obj2 = this.mTrtcCloud;
                Boolean bool = Boolean.FALSE;
                declaredMethod.invoke(obj2, bool, bool);
            } catch (Exception e11) {
                innerLogE("detachTRTC exception : " + Log.getStackTraceString(e11));
            }
            this.mTrtcCloud = null;
            TRTCCloudClassInvokeHelper unused = TRTCCloudClassInvokeHelper.mInstance = null;
        }
    }

    @Override // com.tencent.liteav.txcplayer.ITXVCubePlayer
    public void enableAdaptiveBitrate() {
        this.mTPPPlayer.setPlayerOptionalParam(new TPOptionalParam().buildLong(504, 1L));
        this.mBitrateIndex = -1;
    }

    @Override // com.tencent.liteav.txcplayer.ITXVCubePlayer
    public int getBitrateIndex() {
        int i11 = this.mBitrateIndex;
        if (i11 == -1) {
            return i11;
        }
        TPProgramInfo[] programInfo = this.mTPPPlayer.getProgramInfo();
        if (programInfo != null && programInfo.length > 0) {
            for (TPProgramInfo tPProgramInfo : programInfo) {
                if (tPProgramInfo.actived && !TextUtils.isEmpty(tPProgramInfo.resolution)) {
                    this.mBitrateIndex = tPProgramInfo.programId;
                    break;
                }
            }
        }
        innerLogI("getBitrateIndex ：" + this.mBitrateIndex);
        return this.mBitrateIndex;
    }

    public C34813e getConfig() {
        return this.mConfig;
    }

    @Override // com.tencent.liteav.txcplayer.ITXVCubePlayer
    public long getCurrentPosition() {
        return this.mTPPPlayer.getCurrentPositionMs();
    }

    @Override // com.tencent.liteav.txcplayer.ITXVCubePlayer
    public long getDuration() {
        ITPPlayer iTPPlayer = this.mTPPPlayer;
        if (this.mIsPlayerReleased || iTPPlayer == null) {
            return 0L;
        }
        return iTPPlayer.getDurationMs();
    }

    @Override // com.tencent.liteav.txcplayer.ITXVCubePlayer
    public C34816b getMediaInfo() {
        String[] strArrSplit;
        innerLogI("getMediaInfo");
        C34816b c34816b = new C34816b();
        c34816b.f73770a = "thumbplayer";
        c34816b.f73775f = new C34817c();
        String propertyString = this.mTPPPlayer.getPropertyString(0);
        if (propertyString != null && propertyString.length() > 0 && (strArrSplit = propertyString.split("\\n")) != null && strArrSplit.length > 0) {
            c34816b.f73775f.f73777b = getSupportedBitrates();
            int i11 = this.mBitrateIndex;
            if (i11 == -1000) {
                i11 = 0;
            }
            c34816b.f73775f.f73780e = new C34817c.a(i11);
            c34816b.f73775f.f73779d = new C34817c.a(i11);
            C34817c c34817c = c34816b.f73775f;
            c34817c.f73778c.add(c34817c.f73780e);
            C34817c c34817c2 = c34816b.f73775f;
            c34817c2.f73778c.add(c34817c2.f73779d);
            for (String str : strArrSplit) {
                if (str != null) {
                    String strTrim = str.substring(str.indexOf("=") + 1, str.length()).trim();
                    if (str.contains("ContainerFormat=")) {
                        c34816b.f73775f.f73776a = strTrim;
                    } else if (str.contains("VideoCodec=")) {
                        c34816b.f73771b = "avcodec";
                        c34816b.f73772c = strTrim;
                        c34816b.f73775f.f73779d.f73782b = strTrim;
                    } else if (str.contains("VideoProfile=")) {
                        c34816b.f73775f.f73779d.f73783c = strTrim;
                    } else if (str.contains("Width=")) {
                        c34816b.f73775f.f73779d.f73785e = Integer.valueOf(strTrim).intValue();
                    } else if (str.contains("Height=")) {
                        c34816b.f73775f.f73779d.f73786f = Integer.valueOf(strTrim).intValue();
                    } else if (str.contains("VideoBitRate=")) {
                        c34816b.f73775f.f73779d.f73784d = Integer.valueOf(strTrim).intValue();
                    } else if (str.contains("AudioCodec=")) {
                        c34816b.f73773d = "avcodec";
                        c34816b.f73774e = strTrim;
                        c34816b.f73775f.f73780e.f73782b = strTrim;
                    } else if (str.contains("AudioProfile=")) {
                        c34816b.f73775f.f73780e.f73783c = strTrim;
                    } else if (str.contains("AudioBitRate=")) {
                        c34816b.f73775f.f73780e.f73784d = Integer.valueOf(strTrim).intValue();
                    } else if (str.contains("SampleRate=")) {
                        c34816b.f73775f.f73780e.f73787g = Integer.valueOf(strTrim).intValue();
                    }
                }
            }
        }
        return c34816b;
    }

    @Override // com.tencent.liteav.txcplayer.ITXVCubePlayer
    public long getPdtTimeMs(long j11) {
        return this.mTPPPlayer.getPdtTimeMs(j11);
    }

    @Override // com.tencent.liteav.txcplayer.ITXVCubePlayer
    public long getPlayableDurationMs() {
        return this.mTPPPlayer.getPlayableDurationMs();
    }

    @Override // com.tencent.liteav.txcplayer.ITXVCubePlayer
    public long getPositionMs(long j11) {
        return this.mTPPPlayer.getPositionMs(j11);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0054 A[PHI: r0
      0x0054: PHI (r0v1 int) = (r0v0 int), (r0v4 int) binds: [B:3:0x0002, B:5:0x0006] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.tencent.liteav.txcplayer.ITXVCubePlayer
    public long getPropertyLong(int i11) throws IllegalStateException {
        int i12 = 208;
        if (i11 != 208) {
            i12 = 209;
            if (i11 != 209) {
                switch (i11) {
                    case 100:
                        i11 = 100;
                        break;
                    case 101:
                        i11 = 101;
                        break;
                    case 102:
                        i11 = 102;
                        break;
                    case 103:
                        i11 = 103;
                        break;
                    default:
                        switch (i11) {
                            case 201:
                                i11 = 201;
                                break;
                            case 202:
                                i11 = 202;
                                break;
                            case 203:
                                i11 = 203;
                                break;
                            case 204:
                                i11 = 204;
                                break;
                            case 205:
                                i11 = 205;
                                break;
                            case 206:
                                i11 = 206;
                                break;
                            default:
                                switch (i11) {
                                    case 301:
                                        return this.mBitrate;
                                    case 302:
                                        long playableDurationMs = ((this.mBitrate * (this.mTPPPlayer.getPlayableDurationMs() - this.mTPPPlayer.getCurrentPositionMs())) / 1000) / 8;
                                        if (playableDurationMs < 0) {
                                            return 0L;
                                        }
                                        return playableDurationMs;
                                    case 303:
                                        return this.mTcpSpeed;
                                }
                        }
                        break;
                }
            } else {
                i11 = i12;
            }
        } else {
            i11 = i12;
        }
        return this.mTPPPlayer.getPropertyLong(i11);
    }

    @Override // com.tencent.liteav.txcplayer.ITXVCubePlayer
    public float getRate() {
        return this.mRate;
    }

    @Override // com.tencent.liteav.txcplayer.ITXVCubePlayer
    public ArrayList<C34815a> getSupportedBitrates() {
        ArrayList<C34815a> arrayList;
        TPProgramInfo[] programInfo = this.mTPPPlayer.getProgramInfo();
        if (programInfo == null || programInfo.length <= 0) {
            arrayList = null;
        } else {
            arrayList = new ArrayList<>(programInfo.length);
            for (TPProgramInfo tPProgramInfo : programInfo) {
                if (tPProgramInfo != null) {
                    C34815a c34815a = new C34815a();
                    String[] strArrSplit = tPProgramInfo.resolution.split("x");
                    if (strArrSplit != null && strArrSplit.length == 2) {
                        c34815a.f73767b = Integer.valueOf(strArrSplit[0]).intValue();
                        c34815a.f73768c = Integer.valueOf(strArrSplit[1]).intValue();
                    }
                    int i11 = (int) tPProgramInfo.bandwidth;
                    c34815a.f73769d = i11;
                    c34815a.f73766a = tPProgramInfo.programId;
                    if (tPProgramInfo.actived) {
                        this.mBitrate = i11;
                    }
                    if ((c34815a.f73767b != 0 && c34815a.f73768c != 0) || i11 != 0) {
                        arrayList.add(c34815a);
                        innerLogI("getSupportedBitrates item index：" + c34815a.f73766a + ":width:" + c34815a.f73767b + ":height:" + c34815a.f73768c + ":bitrate:" + c34815a.f73769d);
                    }
                }
            }
        }
        innerLogI("mBitrateIndex:" + this.mBitrateIndex + ":mBitrate:" + this.mBitrate);
        return arrayList;
    }

    @Override // com.tencent.liteav.txcplayer.ITXVCubePlayer
    public Surface getSurface() {
        innerLogI("getSurface：" + this.mSurface);
        return this.mSurface;
    }

    @Override // com.tencent.liteav.txcplayer.InterfaceC34807b
    public SurfaceTexture getSurfaceTexture() {
        return this.mSurfaceTexture;
    }

    public ITPPlayer getTPPPlayer() {
        return this.mTPPPlayer;
    }

    @Override // com.tencent.liteav.txcplayer.ITXVCubePlayer
    public TPTrackInfo[] getTrackInfo() {
        return this.mTPPPlayer.getTrackInfo();
    }

    @Override // com.tencent.liteav.txcplayer.ITXVCubePlayer
    public int getVideoHeight() {
        try {
            return this.mTPPPlayer.getVideoHeight();
        } catch (Throwable th2) {
            th2.printStackTrace();
            return 0;
        }
    }

    @Override // com.tencent.liteav.txcplayer.ITXVCubePlayer
    public int getVideoWidth() {
        try {
            return this.mTPPPlayer.getVideoWidth();
        } catch (Throwable th2) {
            th2.printStackTrace();
            return 0;
        }
    }

    @Override // com.tencent.liteav.txcplayer.ITXVCubePlayer
    public boolean isLooping() {
        innerLogI("isLooping ：" + this.mIsLooping);
        return this.mIsLooping;
    }

    @Override // com.tencent.liteav.txcplayer.ITXVCubePlayer
    public void pause() throws IllegalStateException {
        this.mTPPPlayer.pause();
    }

    @Override // com.tencent.liteav.txcplayer.ITXVCubePlayer
    public void releaseSurfaceTexture() {
        SurfaceTexture surfaceTexture = this.mSurfaceTexture;
        if (surfaceTexture == null || this.mReuseSurfaceTexture) {
            return;
        }
        InterfaceC34808c interfaceC34808c = this.mSurfaceTextureHost;
        if (interfaceC34808c != null) {
            interfaceC34808c.mo76229a(surfaceTexture);
        } else {
            surfaceTexture.release();
        }
        this.mSurfaceTexture = null;
    }

    @Override // com.tencent.liteav.txcplayer.ITXVCubePlayer
    public void seekTo(long j11, boolean z11) throws IllegalStateException {
        innerLogI("seekTo msec: " + j11 + "：isAccurateSeek：" + z11);
        if (z11) {
            this.mTPPPlayer.seekTo((int) j11, 3);
        } else {
            this.mTPPPlayer.seekTo((int) j11, 1);
        }
    }

    @Override // com.tencent.liteav.txcplayer.ITXVCubePlayer
    public void selectTrack(int i11) {
        this.mTPPPlayer.selectTrack(i11, i11);
    }

    @Override // com.tencent.liteav.txcplayer.ITXVCubePlayer
    public void setAudioNormalization(float f11) {
        if (f11 < -70.0f || f11 > 0.0f) {
            if (f11 == 1.0f) {
                this.mTPPPlayer.setAudioNormalizeVolumeParams("disable");
            }
        } else {
            this.mTPPPlayer.setAudioNormalizeVolumeParams("enable,loudnorm=I=" + f11 + ":TP=-1.5:LRA=5.4:linear=1");
        }
    }

    @Override // com.tencent.liteav.txcplayer.ITXVCubePlayer
    public void setAutoMaxBitrate(int i11) {
        this.mTPPPlayer.setPlayerOptionalParam(new TPOptionalParam().buildLong(503, 0L, i11, 0L));
    }

    @Override // com.tencent.liteav.txcplayer.ITXVCubePlayer
    public void setConfig(C34813e c34813e) {
        if (c34813e == null) {
            return;
        }
        this.mConfig = c34813e;
        String strM76231a = C34810b.m76231a();
        TPPlayerConfig.setProxyDataDir(strM76231a);
        int iM76235b = C34810b.m76235b() >= 0 ? C34810b.m76235b() : this.mConfig.f73744f * 100;
        if (iM76235b > 0) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("VodCacheReserveSizeMB", iM76235b);
                TPPlayerConfig.parseHostConfig(new JSONObject().put(TPPlayerMgr.PROXY_HOST_KEY, jSONObject).toString());
            } catch (JSONException e11) {
                e11.printStackTrace();
            }
        }
        setEnableAccurateSeek(c34813e.f73747i);
        this.mTPPPlayer.setPlayerOptionalParam(new TPOptionalParam().buildLong(100, c34813e.f73753o));
        this.mTPPPlayer.setPlayerOptionalParam(new TPOptionalParam().buildBoolean(101, c34813e.f73747i));
        this.mTPPPlayer.setPlayerOptionalParam(new TPOptionalParam().buildLong(102, 1000L));
        this.mTPPPlayer.setPlayerOptionalParam(new TPOptionalParam().buildLong(117, 80000L));
        this.mTPPPlayer.setPlayerOptionalParam(new TPOptionalParam().buildLong(103, 200L));
        this.mTPPPlayer.setPlayerOptionalParam(new TPOptionalParam().buildLong(105, 1000L));
        this.mTPPPlayer.setPlayerOptionalParam(new TPOptionalParam().buildLong(106, 8000L));
        this.mTPPPlayer.setPlayerOptionalParam(new TPOptionalParam().buildLong(107, 10000L));
        this.mTPPPlayer.setPlayerOptionalParam(new TPOptionalParam().buildLong(108, (long) (c34813e.f73741c * 1000.0f)));
        this.mTPPPlayer.setPlayerOptionalParam(new TPOptionalParam().buildLong(109, c34813e.f73739a));
        this.mTPPPlayer.setPlayerOptionalParam(new TPOptionalParam().buildLong(504, c34813e.f73764z ? 1L : 0L));
        this.mTPPPlayer.setPlayerOptionalParam(new TPOptionalParam().buildString(180, c34813e.f73762x));
        this.mTPPPlayer.setPlayerOptionalParam(new TPOptionalParam().buildString(181, c34813e.f73763y));
        this.mTPPPlayer.setPlayerOptionalParam(new TPOptionalParam().buildLong(200, 80L));
        this.mTPPPlayer.setPlayerOptionalParam(new TPOptionalParam().buildBoolean(201, true));
        this.mTPPPlayer.setPlayerOptionalParam(new TPOptionalParam().buildBoolean(401, true));
        if (this.mConfig.f73745g == 0) {
            this.mTPPPlayer.setPlayerOptionalParam(new TPOptionalParam().buildLong(202, 4L));
        } else {
            this.mTPPPlayer.setPlayerOptionalParam(new TPOptionalParam().buildLong(202, 2L));
        }
        this.mTPPPlayer.setPlayerOptionalParam(new TPOptionalParam().buildLong(203, c34813e.f73742d ? 2L : 4L));
        int i11 = this.mConfig.f73757s;
        if (i11 == -1000 && (i11 = this.mBitrateIndex) == -1000) {
            i11 = -1000;
        }
        if (i11 != -1000) {
            this.mTPPPlayer.setPlayerOptionalParam(new TPOptionalParam().buildLong(132, i11));
        }
        this.mTPPPlayer.setPlayerOptionalParam(new TPOptionalParam().buildLong(133, resolveAdaptivePreferredResolution(c34813e.f73760v)));
        this.mTPPPlayer.setPlayerOptionalParam(new TPOptionalParam().buildLong(450, 1L));
        if (C34811c.m76238a(HouseBuilder.EnumC34765a.PLAYER_PREMIUM)) {
            this.mTPPPlayer.setPlayerOptionalParam(new TPOptionalParam().buildBoolean(182, true));
        } else {
            this.mTPPPlayer.setPlayerOptionalParam(new TPOptionalParam().buildBoolean(182, false));
        }
        TPPlayerConfig.setP2PEnable(true);
        ITPDownloadProxy tPDownloadProxy = TPDownloadProxyFactory.getTPDownloadProxy(THUMB_PLAYER_PLATFORM_ID);
        if (tPDownloadProxy != null) {
            tPDownloadProxy.updateStoragePath(strM76231a);
            tPDownloadProxy.setMaxStorageSizeMB(iM76235b);
        }
        Map<String, Object> map = this.mConfig.f73734A;
        if (map != null) {
            parseExtraConfig(map);
        }
        setVideoInfo(c34813e.f73755q);
        setMp4EncryptionInfo(c34813e.f73755q, !TextUtils.isEmpty(strM76231a));
    }

    @Override // com.tencent.liteav.txcplayer.ITXVCubePlayer
    public void setDisplay(SurfaceHolder surfaceHolder) {
        if (this.mSurfaceTexture != null) {
            return;
        }
        if (surfaceHolder != null) {
            this.mSurface = surfaceHolder.getSurface();
        }
        this.mSurfaceHolder = surfaceHolder;
        this.mTPPPlayer.setSurfaceHolder(surfaceHolder);
    }

    public void setEnableAccurateSeek(boolean z11) {
        this.mEnableAccurateSeek = z11;
    }

    @Override // com.tencent.liteav.txcplayer.AbstractC34803a, com.tencent.liteav.txcplayer.ITXVCubePlayer
    public void setPrivateConfig(Map<String, Object> map) {
        this.mPrivateConfig = map;
    }

    @Override // com.tencent.liteav.txcplayer.ITXVCubePlayer
    public void setSubtitleStyle(TXSubtitleRenderModel tXSubtitleRenderModel) {
        if (this.mTPPPlayer != null) {
            this.mTPPPlayer.setPlayerOptionalParam(new TPOptionalParam().buildObject(507, convertToTPSubtitleRenderModel(tXSubtitleRenderModel)));
        }
    }

    @Override // com.tencent.liteav.txcplayer.ITXVCubePlayer, com.tencent.liteav.txcplayer.InterfaceC34807b
    public void setSurfaceTexture(SurfaceTexture surfaceTexture) {
        if (this.mSurfaceTexture == surfaceTexture) {
            return;
        }
        releaseSurfaceTexture();
        this.mSurfaceTexture = surfaceTexture;
        if (surfaceTexture == null) {
            this.mSurface = null;
            setSurfaceToPlayer(null);
        } else {
            if (this.mSurface == null) {
                this.mSurface = new Surface(surfaceTexture);
            }
            setSurfaceToPlayer(this.mSurface);
        }
    }

    @Override // com.tencent.liteav.txcplayer.InterfaceC34807b
    public void setSurfaceTextureHost(InterfaceC34808c interfaceC34808c) {
        this.mSurfaceTextureHost = interfaceC34808c;
    }

    @Override // com.tencent.liteav.txcplayer.ITXVCubePlayer
    public void stop() throws IllegalStateException {
        try {
            this.mTPPPlayer.stopAsync();
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
    }

    public void updateBitrate(long j11) {
        if (j11 > 0) {
            if (this.mTotalFileSize != j11 || this.mBitrate == 0) {
                this.mTotalFileSize = j11;
                long duration = getDuration();
                if (duration <= 0 || j11 <= 0) {
                    return;
                }
                this.mBitrate = (j11 * 8000) / duration;
            }
        }
    }

    public void updateTcpSpeed(long j11) {
        this.mTcpSpeed = j11;
    }

    public ThumbMediaPlayer(Context context) {
        synchronized (ThumbMediaPlayer.class) {
            try {
                if (!mSDKInited) {
                    setTPSystemInfo();
                    setTPPLibCustomLoader();
                    TPPlayerMgr.initSdk(context, THUMB_PLAYER_GUID + context.getPackageName(), THUMB_PLAYER_PLATFORM_ID);
                    TPPlayerMgr.setDebugEnable(false);
                    mSDKInited = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (this.mTPPPlayer == null) {
            TPPlayerMgr.setDebugEnable(false);
            this.mTPPPlayer = TPPlayerFactory.createTPPlayer(context);
            ThumbMediaPlayerListener thumbMediaPlayerListener = new ThumbMediaPlayerListener(this);
            thumbMediaPlayerListener.attachToPlayer();
            innerLogI("[ITPPlayer:" + this.mTPPPlayer.hashCode() + "][ThumbMediaPlayerListener:" + thumbMediaPlayerListener.hashCode() + "], new ThumbMediaPlayer");
        }
        this.mContext = context;
    }

    public static boolean clearAllOnlineCache(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        ITPDownloadProxy tPDownloadProxy = TPDownloadProxyFactory.getTPDownloadProxy(THUMB_PLAYER_PLATFORM_ID);
        tPDownloadProxy.init(context, new TPDLProxyInitParam(THUMB_PLAYER_PLATFORM_ID, "1.0.0", THUMB_PLAYER_GUID + context.getPackageName(), str));
        if (tPDownloadProxy.clearCache(str, "", 8, -1L) != 0) {
            return false;
        }
        return true;
    }

    private boolean isAssetFile(String str) {
        if (!TextUtils.isEmpty(str) && str.toLowerCase().startsWith("asset://")) {
            return true;
        }
        return false;
    }

    private boolean isContentUri(String str) {
        if (!TextUtils.isEmpty(str) && str.toLowerCase().startsWith("content://")) {
            return true;
        }
        return false;
    }

    public static /* synthetic */ void lambda$checkSubtitle$0(ThumbMediaPlayer thumbMediaPlayer) {
        TPTrackInfo[] trackInfo = thumbMediaPlayer.getTrackInfo();
        if (trackInfo != null && trackInfo.length != 0) {
            for (int i11 = 0; i11 < trackInfo.length; i11++) {
                TPTrackInfo tPTrackInfo = trackInfo[i11];
                if (tPTrackInfo.trackType == 3 && tPTrackInfo.isInternal && tPTrackInfo.isSelected) {
                    thumbMediaPlayer.deselectTrack(i11);
                }
            }
        }
    }

    private void setEnableMixExternalAudioFrame() {
        innerLogI("setEnableMixExternalAudioFrame");
        this.mTPPPlayer.setPlayerOptionalParam(new TPOptionalParam().buildLong(404, -1L));
        this.mTPPPlayer.setPlayerOptionalParam(new TPOptionalParam().buildBoolean(120, true));
        this.mTPPPlayer.setOnAudioFrameOutputListener(new ITPPlayerListener.IOnAudioFrameOutputListener() { // from class: com.tencent.liteav.thumbplayer.ThumbMediaPlayer.2
            @Override // com.tencent.thumbplayer.tcmedia.api.ITPPlayerListener.IOnAudioFrameOutputListener
            public void onAudioFrameOut(ITPPlayer iTPPlayer, TPAudioFrameBuffer tPAudioFrameBuffer) {
                if (ThumbMediaPlayer.this.mTrtcCloud != null) {
                    TRTCCloudClassInvokeHelper.getInstance(ThumbMediaPlayer.this.mTrtcCloud).mixExternalAudioFrame(ThumbMediaPlayer.this.mTrtcCloud, tPAudioFrameBuffer);
                }
            }
        });
    }

    private void setTPPLibCustomLoader() {
        try {
            if (!TextUtils.isEmpty(SoLoader.getLibraryPath())) {
                TPPlayerMgr.setLibLoader(new TXSDKModuleLoader());
            }
        } catch (Throwable th2) {
            innerLogE("setTPPLibCustomLoader, ex = " + th2.getMessage());
        }
    }

    private void setTPSystemInfo() {
        TPSystemInfo.setProperty(TPSystemInfo.KEY_PROPERTY_MODEL, LiteavSystemInfo.getModel());
        TPSystemInfo.setProperty(TPSystemInfo.KEY_PROPERTY_MANUFACTURER, LiteavSystemInfo.getManufacturer());
        TPSystemInfo.setProperty(TPSystemInfo.KEY_PROPERTY_VERSION_RELEASE, LiteavSystemInfo.getSystemOSVersion());
        TPSystemInfo.setProperty(TPSystemInfo.KEY_PROPERTY_BOARD, LiteavSystemInfo.getBoard());
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00a8 A[PHI: r3
      0x00a8: PHI (r3v15 float) = (r3v6 float), (r3v5 float) binds: [B:38:0x00b0, B:35:0x00a6] A[DONT_GENERATE, DONT_INLINE]] */
    private void setVideoInfo(String str) {
        String strM76217d;
        long j11;
        C34813e c34813e;
        if (!TextUtils.isEmpty(str) && this.mTPPPlayer != null) {
            TPVideoInfo.Builder builder = new TPVideoInfo.Builder();
            int iCheckDlType = checkDlType();
            TPDownloadParamData tPDownloadParamData = new TPDownloadParamData(iCheckDlType);
            if (!C34804a.m76219f(str)) {
                strM76217d = C34804a.m76217d(str);
                if (iCheckDlType == 0 && strM76217d.endsWith(".mp4")) {
                    tPDownloadParamData.setDlType(10);
                }
            } else {
                String strSubstring = str.substring(0, str.indexOf("?"));
                String strSubstring2 = strSubstring.substring(strSubstring.lastIndexOf(47) + 1);
                if (iCheckDlType == 0) {
                    if (strSubstring2.endsWith("hls")) {
                        tPDownloadParamData.setDlType(3);
                    } else if (strSubstring2.endsWith("mp4")) {
                        tPDownloadParamData.setDlType(10);
                    }
                }
                TPDownloadProxyFactory.getTPDownloadProxy(THUMB_PLAYER_PLATFORM_ID).updateStoragePath(strSubstring.substring(0, strSubstring.lastIndexOf(47)));
                tPDownloadParamData.setOffline(true);
                strM76217d = strSubstring2;
            }
            builder.fileId(strM76217d);
            if (iCheckDlType == 0 && (c34813e = this.mConfig) != null && c34813e.f73764z && strM76217d.endsWith(".hls")) {
                tPDownloadParamData.setDlType(3);
            }
            HashMap map = new HashMap();
            C34813e c34813e2 = this.mConfig;
            float f11 = c34813e2.f73752n;
            if (f11 > 0.0f && !c34813e2.f73754p) {
                j11 = (long) (f11 * 1024.0f * 1024.0f);
            } else {
                f11 = c34813e2.f73751m;
                if (f11 > 0.0f) {
                    j11 = (long) (f11 * 1024.0f * 1024.0f);
                } else {
                    j11 = -1;
                }
            }
            if (j11 >= 0) {
                map.put(TPDownloadProxyEnum.DLPARAM_BUFFER_SIZE, Long.valueOf(j11));
            } else if (!c34813e2.f73754p) {
                map.put(TPDownloadProxyEnum.DLPARAM_BUFFER_SIZE, 5242880);
                this.mIsSetDefaultBufferSize = true;
            } else {
                map.put(TPDownloadProxyEnum.DLPARAM_BUFFER_SIZE, 0);
            }
            int i11 = this.mConfig.f73757s;
            if (i11 != -1000) {
                map.put(TPDownloadProxyEnum.DLPARAM_PREFERRED_BITRATE_INDEX, Integer.valueOf(i11));
            } else {
                int i12 = this.mBitrateIndex;
                if (i12 != -1000) {
                    map.put(TPDownloadProxyEnum.DLPARAM_PREFERRED_BITRATE_INDEX, Integer.valueOf(i12));
                }
            }
            long j12 = this.mConfig.f73760v;
            if (j12 > 0) {
                map.put(TPDownloadProxyEnum.DLPARAM_PREFERRED_RESOLUTION, Long.valueOf(j12));
            }
            if (this.mConfig.f73759u == 2 && C34811c.m76238a(HouseBuilder.EnumC34765a.PLAYER_PREMIUM)) {
                map.put(TPDownloadProxyEnum.DLPARAM_CACHE_NEED_ENCRYPT, Boolean.TRUE);
            }
            if (!TextUtils.isEmpty(this.mConfig.f73738E) && C34811c.m76238a(HouseBuilder.EnumC34765a.PLAYER_PREMIUM)) {
                map.put(TPDownloadProxyEnum.DLPARAM_PREFERRED_AUDIO_TRACK, this.mConfig.f73738E);
            }
            if (map.size() > 0) {
                tPDownloadParamData.setExtInfoMap(map);
            }
            builder.downloadParam(tPDownloadParamData);
            this.mTPPPlayer.setVideoInfo(builder.build());
        }
    }

    @Override // com.tencent.liteav.txcplayer.ITXVCubePlayer
    public void checkSubtitle() {
        C34809a.m76230a().execute(ThumbMediaPlayer$$Lambda$1.lambdaFactory$(this));
    }

    public void onReceiveFirstVideoRenderEvent() {
        if (getTXCVodVideoViewTargetState() != 4 && (getConfig().f73754p || this.mTPPPlayer.getCurrentState() == 5)) {
            notifyOnInfo(2026, 0, 0, null);
            notifyOnInfo(2003, 0, 0, null);
            this.mHasReceiveFirstVideoRenderEvent = false;
            return;
        }
        this.mHasReceiveFirstVideoRenderEvent = true;
    }

    @Override // com.tencent.liteav.txcplayer.ITXVCubePlayer
    public void prepareAsync() throws IllegalStateException {
        try {
            innerLogI("prepareAsync");
            this.mTPPPlayer.prepareAsync();
        } catch (Throwable th2) {
            th2.printStackTrace();
            throw new IllegalStateException(th2);
        }
    }

    @Override // com.tencent.liteav.txcplayer.ITXVCubePlayer
    public void publishAudioToNetwork() {
        innerLogI("publishAudioToNetwork");
        Object obj = this.mTrtcCloud;
        if (obj != null) {
            try {
                Class<?> cls = obj.getClass();
                Class cls2 = Boolean.TYPE;
                Method declaredMethod = cls.getDeclaredMethod("enableMixExternalAudioFrame", cls2, cls2);
                Object obj2 = this.mTrtcCloud;
                Boolean bool = Boolean.TRUE;
                declaredMethod.invoke(obj2, bool, bool);
            } catch (Exception e11) {
                innerLogE("publishAudioToNetwork exception : " + Log.getStackTraceString(e11));
            }
        }
    }

    @Override // com.tencent.liteav.txcplayer.ITXVCubePlayer
    public void reset() {
        releaseSurfaceTexture();
        this.mTPPPlayer.updateTaskInfo(TPDownloadProxyEnum.TASKINFO_PLAYER_START, Boolean.FALSE);
        if (this.mTPPPlayer != null) {
            this.mTPPPlayer.reset();
        }
    }

    @Override // com.tencent.liteav.txcplayer.ITXVCubePlayer
    public void setAudioVolume(int i11) {
        innerLogI("setAudioVolume：".concat(String.valueOf(i11)));
        if (i11 == 0) {
            this.mTPPPlayer.setOutputMute(true);
        } else {
            this.mTPPPlayer.setOutputMute(false);
            this.mTPPPlayer.setAudioGainRatio(i11 / 100.0f);
        }
        Object obj = this.mTrtcCloud;
        if (obj != null) {
            try {
                Class<?> cls = obj.getClass();
                Class cls2 = Integer.TYPE;
                cls.getDeclaredMethod("setMixExternalAudioVolume", cls2, cls2).invoke(this.mTrtcCloud, Integer.valueOf(i11), Integer.valueOf(i11));
            } catch (Exception e11) {
                innerLogE("setAudioVolume exception : " + e11.toString());
            }
        }
    }

    @Override // com.tencent.liteav.txcplayer.ITXVCubePlayer
    public void setBitrateIndex(int i11) {
        TPProgramInfo[] programInfo;
        innerLogI("setBitrateIndex：".concat(String.valueOf(i11)));
        if (this.mBitrateIndex == -1) {
            this.mTPPPlayer.setPlayerOptionalParam(new TPOptionalParam().buildLong(504, 0L));
        }
        if (i11 != -1 && (programInfo = this.mTPPPlayer.getProgramInfo()) != null && i11 >= 0 && i11 < programInfo.length) {
            this.mTPPPlayer.selectProgram(i11, 0L);
        }
        this.mBitrateIndex = i11;
    }

    @Override // com.tencent.liteav.txcplayer.ITXVCubePlayer
    public void setLogEnabled(boolean z11) {
        TPLogUtil.setDebugEnable(z11);
    }

    @Override // com.tencent.liteav.txcplayer.ITXVCubePlayer
    public void setLooping(boolean z11) {
        innerLogI("setLooping ：".concat(String.valueOf(z11)));
        this.mIsLooping = z11;
        this.mTPPPlayer.setLoopback(z11);
    }

    @Override // com.tencent.liteav.txcplayer.ITXVCubePlayer
    public void setRate(float f11) {
        innerLogI("setRate: ".concat(String.valueOf(f11)));
        this.mRate = f11;
        this.mTPPPlayer.setPlaySpeedRatio(f11);
    }

    @Override // com.tencent.liteav.txcplayer.ITXVCubePlayer
    public void setScreenOnWhilePlaying(boolean z11) {
        innerLogI("setScreenOnWhilePlaying".concat(String.valueOf(z11)));
        if (this.mScreenOnWhilePlaying != z11) {
            if (z11 && this.mSurfaceHolder == null) {
                innerLogI("setScreenOnWhilePlaying(true) is ineffective without a SurfaceHolder");
            }
            this.mScreenOnWhilePlaying = z11;
            SurfaceHolder surfaceHolder = this.mSurfaceHolder;
            if (surfaceHolder != null) {
                surfaceHolder.setKeepScreenOn(z11);
            }
        }
    }

    @Override // com.tencent.liteav.txcplayer.ITXVCubePlayer
    public void setSurface(Surface surface) {
        innerLogI("setSurface: ".concat(String.valueOf(surface)));
        if (this.mSurfaceTexture == null) {
            setSurfaceToPlayer(surface);
        }
    }

    @Override // com.tencent.liteav.txcplayer.ITXVCubePlayer
    public void setWakeMode(Context context, int i11) {
        boolean z11;
        innerLogI("setWakeMode：".concat(String.valueOf(i11)));
        PowerManager.WakeLock wakeLock = this.mWakeLock;
        if (wakeLock != null) {
            if (wakeLock.isHeld()) {
                this.mWakeLock.release();
                z11 = true;
            } else {
                z11 = false;
            }
            this.mWakeLock = null;
        } else {
            z11 = false;
        }
        PowerManager.WakeLock wakeLockNewWakeLock = ((PowerManager) context.getSystemService("power")).newWakeLock(i11 | C2711C.BUFFER_FLAG_LAST_SAMPLE, ThumbMediaPlayer.class.getName());
        this.mWakeLock = wakeLockNewWakeLock;
        wakeLockNewWakeLock.setReferenceCounted(false);
        if (z11) {
            this.mWakeLock.acquire();
        }
    }

    @Override // com.tencent.liteav.txcplayer.ITXVCubePlayer
    public void start() throws IllegalStateException {
        innerLogI("start");
        if (this.mHasReceiveFirstVideoRenderEvent) {
            notifyOnInfo(2026, 0, 0, null);
            notifyOnInfo(2003, 0, 0, null);
            this.mHasReceiveFirstVideoRenderEvent = false;
        }
        if (this.mConfig.f73751m >= 0.0f) {
            this.mTPPPlayer.updateTaskInfo(TPDownloadProxyEnum.TASKINFO_BUFFER_SIZE_BYTE, Long.valueOf((long) (this.mConfig.f73751m * 1024.0f * 1024.0f)));
        } else if (this.mIsSetDefaultBufferSize) {
            this.mTPPPlayer.updateTaskInfo(TPDownloadProxyEnum.TASKINFO_BUFFER_SIZE_BYTE, 0);
            this.mIsSetDefaultBufferSize = false;
        }
        this.mTPPPlayer.updateTaskInfo(TPDownloadProxyEnum.TASKINFO_PLAYER_START, Boolean.TRUE);
        this.mTPPPlayer.start();
    }

    @Override // com.tencent.liteav.txcplayer.ITXVCubePlayer
    public void unpublishAudioToNetwork() {
        innerLogI("unpublishAudioToNetwork");
        Object obj = this.mTrtcCloud;
        if (obj != null) {
            try {
                Class<?> cls = obj.getClass();
                Class cls2 = Boolean.TYPE;
                cls.getDeclaredMethod("enableMixExternalAudioFrame", cls2, cls2).invoke(this.mTrtcCloud, Boolean.FALSE, Boolean.TRUE);
            } catch (Exception e11) {
                innerLogE("unpublishAudioToNetwork exception : " + Log.getStackTraceString(e11));
            }
        }
    }

    @Override // com.tencent.liteav.txcplayer.ITXVCubePlayer
    public void setDataSource(Context context, Uri uri, Map<String, String> map) throws IllegalStateException, IOException, SecurityException, IllegalArgumentException {
        String string = uri.toString();
        this.mDataSource = string;
        if (C34804a.m76219f(string)) {
            string = string.substring(string.indexOf("?") + 1);
        }
        ITPMediaAsset iTPMediaAssetHandleDRMAsset = handleDRMAsset(string);
        if (iTPMediaAssetHandleDRMAsset != null) {
            ITPMediaUrlAsset iTPMediaUrlAssetHandleUrlAsset = handleUrlAsset(string);
            if (iTPMediaUrlAssetHandleUrlAsset != null) {
                iTPMediaAssetHandleDRMAsset.setExtraParam(iTPMediaUrlAssetHandleUrlAsset.getExtraParam());
            }
            if (map != null && map.size() > 0) {
                iTPMediaAssetHandleDRMAsset.setHttpHeader(map);
            }
            this.mTPPPlayer.setDataSource(iTPMediaAssetHandleDRMAsset);
            return;
        }
        ITPMediaUrlAsset iTPMediaUrlAssetHandleUrlAsset2 = handleUrlAsset(string);
        if (iTPMediaUrlAssetHandleUrlAsset2 != null) {
            if (map != null && map.size() > 0) {
                iTPMediaUrlAssetHandleUrlAsset2.setHttpHeader(map);
            }
            this.mTPPPlayer.setDataSource(iTPMediaUrlAssetHandleUrlAsset2);
            return;
        }
        this.mTPPPlayer.setDataSource(string, map);
    }

    @Override // com.tencent.liteav.txcplayer.ITXVCubePlayer
    public void setDataSource(FileDescriptor fileDescriptor) throws IllegalStateException, IOException, IllegalArgumentException {
        this.mTPPPlayer.setDataSource(ParcelFileDescriptor.dup(fileDescriptor));
    }

    @Override // com.tencent.liteav.txcplayer.ITXVCubePlayer
    public void setDataSource(String str) throws IllegalStateException, IOException, SecurityException, IllegalArgumentException {
        setDataSource(null, Uri.parse(str));
    }

    @Override // com.tencent.liteav.txcplayer.ITXVCubePlayer
    public void setAudioStreamType(int i11) {
    }

    @Override // com.tencent.liteav.txcplayer.ITXVCubePlayer
    public void setKeepInBackground(boolean z11) {
    }
}
