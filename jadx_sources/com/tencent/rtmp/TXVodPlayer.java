package com.tencent.rtmp;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.text.TextUtils;
import android.view.Surface;
import android.view.TextureView;
import com.tencent.liteav.C34666a;
import com.tencent.liteav.base.system.LiteavSystemInfo;
import com.tencent.liteav.base.util.CustomHandler;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.liteav.base.util.TimeUtil;
import com.tencent.liteav.txcplayer.C34813e;
import com.tencent.liteav.txcplayer.ITXVCubePlayer;
import com.tencent.liteav.txcplayer.common.C34809a;
import com.tencent.liteav.txcplayer.ext.service.RenderProcessService;
import com.tencent.liteav.txcplayer.model.C34815a;
import com.tencent.liteav.txcplayer.model.TXSubtitleRenderModel;
import com.tencent.liteav.txcplayer.p131a.C34804a;
import com.tencent.liteav.txcplayer.p131a.C34805b;
import com.tencent.liteav.txcvodplayer.TXCVodVideoView;
import com.tencent.liteav.txcvodplayer.p132a.C34833a;
import com.tencent.liteav.txcvodplayer.p133b.C34835b;
import com.tencent.liteav.txcvodplayer.p133b.C34836c;
import com.tencent.liteav.txcvodplayer.p133b.C34837d;
import com.tencent.liteav.txcvodplayer.p133b.C34839f;
import com.tencent.liteav.txcvodplayer.p133b.InterfaceC34838e;
import com.tencent.liteav.txcvodplayer.p134c.C34841a;
import com.tencent.liteav.txcvodplayer.renderer.C34852d;
import com.tencent.liteav.txcvodplayer.renderer.RunnableC34855g;
import com.tencent.liteav.txcvodplayer.renderer.RunnableC34859k;
import com.tencent.liteav.txcvodplayer.renderer.TextureRenderView;
import com.tencent.liteav.videobase.videobase.DisplayTarget;
import com.tencent.liteav.videobase.videobase.TXCCloudVideoViewMethodInvoker;
import com.tencent.rtmp.ITXVodPlayListener;
import com.tencent.rtmp.TXLivePlayer;
import com.tencent.rtmp.TXPlayInfoParams;
import com.tencent.rtmp.TXPlayerDrmBuilder;
import com.tencent.rtmp.TXVodConstants;
import com.tencent.rtmp.p148ui.TXCloudVideoView;
import com.tencent.rtmp.p148ui.TXSubtitleView;
import com.tencent.thumbplayer.tcmedia.api.TPSubtitleData;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes56.dex */
public class TXVodPlayer {
    public static final String TAG = "TXVodPlayer";
    private final C34666a mPlayer;

    public void seek(int i11) {
        innerLogI("seek time: ".concat(String.valueOf(i11)));
        C34666a c34666a = this.mPlayer;
        float f11 = i11;
        TXVodPlayConfig tXVodPlayConfig = c34666a.f73295f;
        c34666a.m75968a(f11, tXVodPlayConfig != null ? tXVodPlayConfig.isEnableAccurateSeek() : false);
    }

    public void setPlayerView(TXCloudVideoView tXCloudVideoView) {
        innerLogI("setPlayerView TXCloudVideoView: ".concat(String.valueOf(tXCloudVideoView)));
        C34666a c34666a = this.mPlayer;
        TXCloudVideoView tXCloudVideoView2 = c34666a.f73290a;
        if (tXCloudVideoView != tXCloudVideoView2) {
            if (tXCloudVideoView2 != null) {
                tXCloudVideoView2.removeVideoView();
                c34666a.f73294e.setRenderView(null);
            }
            if (tXCloudVideoView != null) {
                tXCloudVideoView.removeVideoView();
            }
        }
        if (tXCloudVideoView != null) {
            tXCloudVideoView.setVisibility(0);
            if (c34666a.f73269A == null || c34666a.f73270B == null) {
                if (TXCCloudVideoViewMethodInvoker.getTextureViewSetByUser(tXCloudVideoView) == null) {
                    TextureRenderView textureRenderView = new TextureRenderView(tXCloudVideoView.getContext());
                    tXCloudVideoView.addVideoView(textureRenderView);
                    c34666a.f73294e.setTextureRenderView(textureRenderView);
                }
            } else if (TXCCloudVideoViewMethodInvoker.getTextureViewSetByUser(tXCloudVideoView) == null) {
                tXCloudVideoView.addVideoView(new TextureView(tXCloudVideoView.getContext()));
                C34852d c34852d = c34666a.f73269A;
                c34852d.m76459a(RunnableC34855g.m76463a(c34852d, new DisplayTarget(tXCloudVideoView)), "setDisplayTarget");
            }
            C34666a.m75928a(tXCloudVideoView, 0);
        }
        c34666a.f73290a = tXCloudVideoView;
    }

    public int startVodPlay(String str) {
        innerLogI("startPlay url: ".concat(String.valueOf(str)));
        C34666a c34666a = this.mPlayer;
        c34666a.f73307r = null;
        if (TextUtils.equals(str, c34666a.f73309t)) {
            Object obj = c34666a.f73304o.get("TXC_DRM_ENABLE");
            if (obj instanceof Boolean ? ((Boolean) obj).booleanValue() : false) {
                return c34666a.m75964a(str, (String) c34666a.f73304o.get("TXC_DRM_KEY_URL"), new TXPlayerDrmBuilder().getDeviceCertificateUrl(), (String) c34666a.f73304o.get("TXC_DRM_SIMPLE_AES_URL"), c34666a.f73308s);
            }
        } else {
            c34666a.f73308s = null;
        }
        c34666a.m75985g();
        return c34666a.m75963a(str);
    }

    private void innerLogI(String str) {
        LiteavLog.m76087i(TAG, "[" + hashCode() + "], " + str);
    }

    public void addSubtitleSource(String str, String str2, String str3) {
        innerLogI("addSubtitleSource url: " + str + " ,name: " + str2 + " ,mimeType: " + str3);
        C34666a c34666a = this.mPlayer;
        TXCVodVideoView tXCVodVideoView = c34666a.f73294e;
        if (!TextUtils.isEmpty(str)) {
            ITXVCubePlayer iTXVCubePlayer = tXCVodVideoView.f73835c;
            if (iTXVCubePlayer != null) {
                iTXVCubePlayer.addSubtitleSource(str, str2, str3);
            }
            if (tXCVodVideoView.f73841i == null) {
                tXCVodVideoView.f73841i = new ArrayList();
            }
            tXCVodVideoView.f73841i.add(new TXCVodVideoView.C34832b(str, str2, str3));
        }
        C34833a c34833a = c34666a.f73296g;
        if (c34833a != null) {
            c34833a.m76345a("use_ex_subtitle", "1");
        }
    }

    public void attachTRTC(Object obj) {
        innerLogI("attachTRTC: ".concat(String.valueOf(obj)));
        C34666a c34666a = this.mPlayer;
        if (obj != null) {
            c34666a.f73270B = obj;
            if (c34666a.f73269A == null) {
                C34852d c34852d = new C34852d(c34666a);
                c34666a.f73269A = c34852d;
                synchronized (c34852d) {
                    try {
                        if (c34852d.f74069a != null) {
                            LiteavLog.m76093w("VodRenderer", "VodRenderer is initialized!");
                        } else {
                            LiteavLog.m76087i("VodRenderer", "initialize VodRenderer");
                            HandlerThread handlerThread = new HandlerThread("VodRenderer_" + c34852d.hashCode());
                            handlerThread.start();
                            c34852d.f74069a = new CustomHandler(handlerThread.getLooper());
                            c34852d.m76459a(RunnableC34859k.m76467a(c34852d), "initialize");
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
            TXCVodVideoView tXCVodVideoView = c34666a.f73294e;
            tXCVodVideoView.f73840h = obj;
            ITXVCubePlayer iTXVCubePlayer = tXCVodVideoView.f73835c;
            if (iTXVCubePlayer != null) {
                iTXVCubePlayer.attachTRTC(obj);
            }
        }
    }

    public void deselectTrack(int i11) {
        innerLogI("deselectTrack trackIndex: ".concat(String.valueOf(i11)));
        TXCVodVideoView tXCVodVideoView = this.mPlayer.f73294e;
        ITXVCubePlayer iTXVCubePlayer = tXCVodVideoView.f73835c;
        if (iTXVCubePlayer != null) {
            iTXVCubePlayer.deselectTrack(i11);
            tXCVodVideoView.m76320a(false, i11);
        }
    }

    public void detachTRTC() {
        innerLogI("detachTRTC");
        C34666a c34666a = this.mPlayer;
        c34666a.f73270B = null;
        C34852d c34852d = c34666a.f73269A;
        if (c34852d != null) {
            c34852d.m76460a(false);
            c34852d.m76459a(new Runnable() { // from class: com.tencent.liteav.txcvodplayer.renderer.d.1
                public AnonymousClass1() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    LiteavLog.m76087i("VodRenderer", "uninitialize VodRenderer");
                    if (C34852d.this.f74071c != null) {
                        C34852d.this.f74071c.m76662a((DisplayTarget) null, false);
                        C34852d.m76452d(C34852d.this);
                    }
                    C34852d.m76453e(C34852d.this);
                    C34852d.this.m76456a();
                    synchronized (C34852d.this) {
                        try {
                            if (C34852d.this.f74069a != null) {
                                C34852d.this.f74069a.quitLooper();
                                C34852d.m76455g(C34852d.this);
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                }
            }, "uninitialize");
            c34666a.f73269A = null;
        }
        c34666a.m75983e();
        c34666a.m75978c();
        TXCVodVideoView tXCVodVideoView = c34666a.f73294e;
        tXCVodVideoView.f73840h = null;
        ITXVCubePlayer iTXVCubePlayer = tXCVodVideoView.f73835c;
        if (iTXVCubePlayer != null) {
            iTXVCubePlayer.detachTRTC();
        }
    }

    public boolean enableHardwareDecode(boolean z11) {
        innerLogI("enableHardwareDecode: ".concat(String.valueOf(z11)));
        C34666a c34666a = this.mPlayer;
        if (z11) {
            if (LiteavSystemInfo.getSystemOSVersionInt() < 18) {
                c34666a.m75980c("enableHardwareDecode failed, android system build.version = " + LiteavSystemInfo.getSystemOSVersionInt() + ", the minimum build.version should be 18(android 4.3 or later)");
                return false;
            }
            if (LiteavSystemInfo.getManufacturer().equalsIgnoreCase("HUAWEI") && LiteavSystemInfo.getModel().equalsIgnoreCase("Che2-TL00")) {
                c34666a.m75980c("enableHardwareDecode failed, MANUFACTURER = " + LiteavSystemInfo.getManufacturer() + ", MODEL" + LiteavSystemInfo.getModel());
                return false;
            }
        }
        c34666a.f73300k = z11;
        c34666a.m75972a(c34666a.f73295f);
        return true;
    }

    public List<TXTrackInfo> getAudioTrackInfo() {
        C34666a c34666a = this.mPlayer;
        List<TXTrackInfo> listM75966a = c34666a.m75966a();
        if (listM75966a.isEmpty()) {
            return new ArrayList(0);
        }
        c34666a.m75973a("use_audiotrack", "1");
        return C34666a.m75923a(listM75966a, 2);
    }

    public int getBitrateIndex() {
        return this.mPlayer.f73294e.getBitrateIndex();
    }

    public float getBufferDuration() {
        return this.mPlayer.f73294e.getBufferDuration() / 1000.0f;
    }

    public float getCurrentPlaybackTime() {
        return this.mPlayer.f73294e.getCurrentPosition() / 1000.0f;
    }

    public float getDuration() {
        float duration = this.mPlayer.f73294e.getDuration() / 1000.0f;
        innerLogI("getDuration: ".concat(String.valueOf(duration)));
        return duration;
    }

    public int getHeight() {
        int videoHeight = this.mPlayer.f73294e.getVideoHeight();
        innerLogI("getHeight: ".concat(String.valueOf(videoHeight)));
        return videoHeight;
    }

    public float getPlayableDuration() {
        return this.mPlayer.f73294e.getBufferDuration() / 1000.0f;
    }

    public List<TXTrackInfo> getSubtitleTrackInfo() {
        C34666a c34666a = this.mPlayer;
        List<TXTrackInfo> listM75966a = c34666a.m75966a();
        if (listM75966a.isEmpty()) {
            return new ArrayList(0);
        }
        c34666a.m75973a("use_ex_subtitle", "1");
        return C34666a.m75923a(listM75966a, 3);
    }

    public ArrayList<TXBitrateItem> getSupportedBitrates() {
        ArrayList<C34815a> supportedBitrates;
        C34666a c34666a = this.mPlayer;
        ArrayList<TXBitrateItem> arrayList = new ArrayList<>();
        if (!C34804a.m76219f(c34666a.f73309t) && (supportedBitrates = c34666a.f73294e.getSupportedBitrates()) != null) {
            for (C34815a c34815a : supportedBitrates) {
                TXBitrateItem tXBitrateItem = new TXBitrateItem();
                tXBitrateItem.index = c34815a.f73766a;
                tXBitrateItem.width = c34815a.f73767b;
                tXBitrateItem.height = c34815a.f73768c;
                tXBitrateItem.bitrate = c34815a.f73769d;
                arrayList.add(tXBitrateItem);
            }
        }
        return arrayList;
    }

    public int getWidth() {
        int videoWidth = this.mPlayer.f73294e.getVideoWidth();
        innerLogI("getWidth: ".concat(String.valueOf(videoWidth)));
        return videoWidth;
    }

    public boolean isLoop() {
        return this.mPlayer.f73314y;
    }

    public boolean isPlaying() {
        TXCVodVideoView tXCVodVideoView = this.mPlayer.f73294e;
        return tXCVodVideoView.m76323b() && tXCVodVideoView.f73835c.isPlaying() && tXCVodVideoView.f73815a != 4;
    }

    public void pause() {
        innerLogI("pause");
        C34666a c34666a = this.mPlayer;
        TXCVodVideoView tXCVodVideoView = c34666a.f73294e;
        tXCVodVideoView.f73834b = 4;
        tXCVodVideoView.m76318a("pause");
        if (tXCVodVideoView.m76323b()) {
            try {
                tXCVodVideoView.f73835c.pause();
                tXCVodVideoView.f73851u.removeMessages(101, tXCVodVideoView.f73839g);
                tXCVodVideoView.f73851u.removeMessages(103);
            } catch (Exception e11) {
                tXCVodVideoView.m76321b("pause exception: " + e11.getMessage());
            }
            tXCVodVideoView.f73815a = 4;
        }
        C34833a c34833a = c34666a.f73296g;
        if (c34833a != null) {
            c34833a.m76348b("pause " + c34833a.f73904k);
            if (!c34833a.f73899f) {
                c34833a.f73904k += System.currentTimeMillis() - c34833a.f73897d;
            }
            c34833a.f73899f = true;
            c34833a.f73897d = System.currentTimeMillis();
            if (c34833a.f73905l == -1) {
                c34833a.f73900g = true;
            }
        }
        c34666a.m75981c(true);
    }

    public void publishAudio() {
        innerLogI("publishAudio");
        this.mPlayer.m75982d();
    }

    public void publishVideo() {
        innerLogI("publishVideo");
        this.mPlayer.m75974b();
    }

    public void resume() {
        innerLogI("resume");
        C34666a c34666a = this.mPlayer;
        c34666a.f73294e.setAutoPlay(true);
        c34666a.f73294e.m76325c(false);
        C34833a c34833a = c34666a.f73296g;
        if (c34833a != null) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            c34833a.f73897d = jCurrentTimeMillis;
            if (c34833a.f73900g) {
                c34833a.f73895b = jCurrentTimeMillis;
                c34833a.f73900g = false;
            }
            c34833a.m76348b("[resume], mBeginPlayTS = " + c34833a.f73897d + " ,mIsPreLoading = " + c34833a.f73900g);
            c34833a.f73899f = false;
        }
        c34666a.m75981c(false);
    }

    public void seekToPdtTime(long j11) {
        C34833a c34833a;
        innerLogI("seek pdtTimeMs: ".concat(String.valueOf(j11)));
        C34666a c34666a = this.mPlayer;
        TXCVodVideoView tXCVodVideoView = c34666a.f73294e;
        if (TXCVodVideoView.f73790j) {
            tXCVodVideoView.m76318a("seekToPdtTime:".concat(String.valueOf(j11)));
            int positionMs = (int) tXCVodVideoView.f73835c.getPositionMs(j11);
            if (positionMs >= 0) {
                int iMin = Math.min(positionMs, tXCVodVideoView.getDuration());
                C34813e c34813e = tXCVodVideoView.f73836d;
                tXCVodVideoView.m76317a(iMin, c34813e != null ? c34813e.f73747i : false);
            }
        } else {
            tXCVodVideoView.m76318a("seekToPdtTime has no advanced license! not support PDT seek.");
        }
        if (c34666a.f73297h && (c34833a = c34666a.f73296g) != null) {
            c34833a.m76354f();
        }
        c34666a.m75973a("use_pdt", "1");
    }

    public void selectTrack(int i11) {
        innerLogI("selectTrack trackIndex: ".concat(String.valueOf(i11)));
        this.mPlayer.f73294e.m76316a(i11);
    }

    public void setAudioNormalization(float f11) {
        innerLogI("setAudioNormalization: ".concat(String.valueOf(f11)));
        this.mPlayer.f73294e.setAudioNormalization(f11);
    }

    public void setAudioPlayoutVolume(int i11) {
        innerLogI("setAudioPlayoutVolume: ".concat(String.valueOf(i11)));
        C34666a c34666a = this.mPlayer;
        c34666a.f73311v = i11;
        c34666a.f73294e.setAudioPlayoutVolume(i11);
    }

    public void setAutoMaxBitrate(int i11) {
        innerLogI("setAutoMaxBitrate: ".concat(String.valueOf(i11)));
        C34666a c34666a = this.mPlayer;
        c34666a.f73272D = i11;
        c34666a.f73294e.setAutoMaxBitrate(i11);
    }

    public void setAutoPlay(boolean z11) {
        innerLogI("setAutoPlay: ".concat(String.valueOf(z11)));
        C34666a c34666a = this.mPlayer;
        c34666a.f73299j = z11;
        c34666a.f73294e.setAutoPlay(z11);
    }

    public void setBitrateIndex(int i11) {
        innerLogI("setBitrateIndex: ".concat(String.valueOf(i11)));
        this.mPlayer.m75979c(i11);
    }

    public void setConfig(TXVodPlayConfig tXVodPlayConfig) {
        this.mPlayer.m75972a(tXVodPlayConfig);
    }

    public void setLoop(boolean z11) {
        innerLogI("setLoop: ".concat(String.valueOf(z11)));
        this.mPlayer.f73314y = z11;
    }

    public void setMirror(boolean z11) {
        innerLogI("setMirror: ".concat(String.valueOf(z11)));
        this.mPlayer.m75977b(z11);
    }

    public void setMute(boolean z11) {
        innerLogI("setMute: ".concat(String.valueOf(z11)));
        C34666a c34666a = this.mPlayer;
        c34666a.f73310u = z11;
        c34666a.f73294e.setMute(z11);
    }

    public void setRate(float f11) {
        innerLogI("setRate: ".concat(String.valueOf(f11)));
        this.mPlayer.m75967a(f11);
    }

    public void setRenderMode(int i11) {
        innerLogI("setRenderMode: ".concat(String.valueOf(i11)));
        this.mPlayer.m75969a(i11);
    }

    public void setRenderRotation(int i11) {
        innerLogI("setRenderRotation: ".concat(String.valueOf(i11)));
        this.mPlayer.m75976b(i11);
    }

    public boolean setRequestAudioFocus(boolean z11) {
        innerLogI("setRequestAudioFocus: ".concat(String.valueOf(z11)));
        C34666a c34666a = this.mPlayer;
        c34666a.f73298i = z11;
        return c34666a.f73294e.m76326d(z11);
    }

    public void setStartTime(float f11) {
        innerLogI("setStartTime: ".concat(String.valueOf(f11)));
        this.mPlayer.m75975b(f11);
    }

    public void setStringOption(String str, Object obj) {
        innerLogI("setStringOption key: " + str + " ,value: " + obj);
        C34666a c34666a = this.mPlayer;
        final TXCVodVideoView tXCVodVideoView = c34666a.f73294e;
        if (!TextUtils.isEmpty(str)) {
            if ((TextUtils.equals(str, TXVodConstants.PLAYER_OPTION_PARAM_MODULE_TYPE) || TextUtils.equals(str, "PARAM_SUPER_RESOLUTION_TYPE")) && (obj instanceof Integer)) {
                tXCVodVideoView.f73845o = ((Integer) obj).intValue();
                RenderProcessService.getInstance().updateRenderProcessMode(tXCVodVideoView.f73835c, tXCVodVideoView.f73845o);
                tXCVodVideoView.m76318a("updateRenderProcessMode:" + tXCVodVideoView.f73845o);
            }
            if (TextUtils.equals(str, TXVodConstants.PLAYER_OPTION_PARAM_MODULE_CONFIG)) {
                if (obj == null) {
                    tXCVodVideoView.f73846p = null;
                } else if (obj instanceof Map) {
                    tXCVodVideoView.f73846p = (Map) obj;
                }
            }
            if (str.startsWith("MONET_AC_")) {
                RenderProcessService.getInstance().doAction(tXCVodVideoView.f73835c, str, obj);
            }
            if (TextUtils.equals(str, TXVodConstants.VOD_KEY_BACKUP_URL)) {
                if (obj == null || !(obj instanceof String)) {
                    tXCVodVideoView.f73843m = "";
                } else {
                    tXCVodVideoView.f73843m = (String) obj;
                }
                tXCVodVideoView.m76318a("setStringOption mBackupPlayUrl: " + tXCVodVideoView.f73843m);
            }
            if (TextUtils.equals(str, TXVodConstants.VOD_KEY_MIMETYPE)) {
                if (obj == null || !(obj instanceof String)) {
                    tXCVodVideoView.f73842l = false;
                } else if (((String) obj).equals("video/hevc")) {
                    tXCVodVideoView.f73842l = true;
                    if (!TXCVodVideoView.f73791k) {
                        TXCVodVideoView.f73791k = true;
                        C34809a.m76230a().execute(new Runnable() { // from class: com.tencent.liteav.txcvodplayer.TXCVodVideoView.5
                            @Override // java.lang.Runnable
                            public final void run() {
                                if (!C34805b.m76223a("video/hevc")) {
                                    TXCVodVideoView.m76287f();
                                    TXCVodVideoView.this.m76318a("not support hevc!");
                                }
                            }
                        });
                    }
                }
            }
            if (TextUtils.equals(str, TXVodConstants.VOD_KEY_BACKUP_URL_MEDIA_TYPE)) {
                if (obj instanceof Integer) {
                    tXCVodVideoView.f73844n = ((Integer) obj).intValue();
                }
                tXCVodVideoView.m76318a("setStringOption backupUrlMediaType:" + tXCVodVideoView.f73844n);
            }
        }
        if ((TextUtils.equals(str, TXVodConstants.PLAYER_OPTION_PARAM_MODULE_TYPE) || TextUtils.equals(str, "PARAM_SUPER_RESOLUTION_TYPE")) && obj != null && (obj instanceof Integer)) {
            int iIntValue = ((Integer) obj).intValue();
            if (iIntValue == 1) {
                c34666a.m75973a("use_sr", "1");
            } else if (iIntValue == 11 || iIntValue == 12) {
                c34666a.m75973a("use_vr", "1");
            }
        }
    }

    public int stopPlay(boolean z11) {
        innerLogI("stopPlay isNeedClearLastImg: ".concat(String.valueOf(z11)));
        return this.mPlayer.m75965a(z11);
    }

    public void unpublishAudio() {
        innerLogI("unpublishAudio");
        this.mPlayer.m75983e();
    }

    public void unpublishVideo() {
        innerLogI("unpublishVideo");
        this.mPlayer.m75978c();
    }

    public TXVodPlayer(Context context) {
        C34666a c34666a = new C34666a(context);
        this.mPlayer = c34666a;
        innerLogI("[TXCVodPlayer:" + c34666a.hashCode() + "], new TXVodPlayer");
    }

    public static String getEncryptedPlayKey(String str) {
        return C34666a.m75932b(str);
    }

    @Deprecated
    public void setPlayListener(ITXLivePlayListener iTXLivePlayListener) {
        innerLogI("setPlayListener: ".concat(String.valueOf(iTXLivePlayListener)));
        this.mPlayer.f73291b = iTXLivePlayListener;
    }

    public void setSubtitleStyle(TXSubtitleRenderModel tXSubtitleRenderModel) {
        String string;
        if ("setSubtitleStyle renderModel: ".concat(String.valueOf(tXSubtitleRenderModel)) != null) {
            string = tXSubtitleRenderModel.toString();
        } else {
            string = "null";
        }
        innerLogI(string);
        this.mPlayer.f73294e.setSubtitleStyle(tXSubtitleRenderModel);
    }

    public void setSubtitleView(TXSubtitleView tXSubtitleView) {
        innerLogI("setSubtitleView subtitleView: ".concat(String.valueOf(tXSubtitleView)));
        this.mPlayer.f73271C = tXSubtitleView;
    }

    public void setSurface(Surface surface) {
        innerLogI("setSurface: ".concat(String.valueOf(surface)));
        C34666a c34666a = this.mPlayer;
        c34666a.f73301l = surface;
        c34666a.f73294e.setRenderSurface(surface);
    }

    public void setToken(String str) {
        innerLogI("setToken: ".concat(String.valueOf(str)));
        this.mPlayer.f73303n = str;
    }

    public void setVodListener(ITXVodPlayListener iTXVodPlayListener) {
        innerLogI("setVodListener: ".concat(String.valueOf(iTXVodPlayListener)));
        C34666a c34666a = this.mPlayer;
        c34666a.f73293d = this;
        c34666a.f73292c = iTXVodPlayListener;
    }

    public void setVodSubtitleDataListener(final ITXVodPlayListener.ITXVodSubtitleDataListener iTXVodSubtitleDataListener) {
        innerLogI("setVodSubtitleDataListener: ".concat(String.valueOf(iTXVodSubtitleDataListener)));
        final C34666a c34666a = this.mPlayer;
        c34666a.f73294e.setTXCOnSubtitleDataListener(new ITXVCubePlayer.InterfaceC34801i() { // from class: com.tencent.liteav.a.6
            @Override // com.tencent.liteav.txcplayer.ITXVCubePlayer.InterfaceC34801i
            /* JADX INFO: renamed from: a */
            public final void mo75993a(ITXVCubePlayer iTXVCubePlayer, TPSubtitleData tPSubtitleData) {
                ITXVodPlayListener.ITXVodSubtitleDataListener iTXVodSubtitleDataListener2 = iTXVodSubtitleDataListener;
                if (iTXVodSubtitleDataListener2 != null) {
                    iTXVodSubtitleDataListener2.onSubtitleData(C34666a.m75922a(tPSubtitleData));
                }
            }
        });
    }

    public void snapshot(final TXLivePlayer.ITXSnapshotListener iTXSnapshotListener) {
        innerLogI("snapshot listener: ".concat(String.valueOf(iTXSnapshotListener)));
        final C34666a c34666a = this.mPlayer;
        if (!c34666a.f73306q && iTXSnapshotListener != null) {
            c34666a.f73306q = true;
            TextureView textureViewSetByUser = TXCCloudVideoViewMethodInvoker.getTextureViewSetByUser(c34666a.f73290a);
            if (textureViewSetByUser != null) {
                final Bitmap bitmap = textureViewSetByUser.getBitmap();
                if (bitmap != null) {
                    Matrix transform = textureViewSetByUser.getTransform(null);
                    if (c34666a.f73313x) {
                        transform.postScale(-1.0f, 1.0f);
                    }
                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), transform, true);
                    bitmap.recycle();
                    bitmap = bitmapCreateBitmap;
                }
                new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.tencent.liteav.a.5
                    @Override // java.lang.Runnable
                    public final void run() {
                        TXLivePlayer.ITXSnapshotListener iTXSnapshotListener2 = iTXSnapshotListener;
                        if (iTXSnapshotListener2 != null) {
                            iTXSnapshotListener2.onSnapshot(bitmap);
                        }
                        C34666a.m75960v(C34666a.this);
                    }
                });
                return;
            }
            c34666a.f73306q = false;
        }
    }

    public int startPlayDrm(TXPlayerDrmBuilder tXPlayerDrmBuilder) {
        String string;
        if ("startPlayDrm: ".concat(String.valueOf(tXPlayerDrmBuilder)) != null) {
            string = tXPlayerDrmBuilder.toString();
        } else {
            string = "null";
        }
        innerLogI(string);
        C34666a c34666a = this.mPlayer;
        c34666a.f73307r = null;
        if (tXPlayerDrmBuilder != null) {
            return c34666a.m75964a(tXPlayerDrmBuilder.getPlayUrl(), tXPlayerDrmBuilder.getKeyLicenseUrl(), tXPlayerDrmBuilder.getDeviceCertificateUrl(), null, null);
        }
        return -1;
    }

    public void seek(float f11) {
        innerLogI("seek time: ".concat(String.valueOf(f11)));
        C34666a c34666a = this.mPlayer;
        TXVodPlayConfig tXVodPlayConfig = c34666a.f73295f;
        c34666a.m75968a(f11, tXVodPlayConfig != null ? tXVodPlayConfig.isEnableAccurateSeek() : false);
    }

    public void seek(float f11, boolean z11) {
        innerLogI("seek time: " + f11 + " ,isAccurateSeek: " + z11);
        this.mPlayer.m75968a(f11, z11);
    }

    @Deprecated
    public int startVodPlay(TXPlayerAuthBuilder tXPlayerAuthBuilder) {
        innerLogI("startPlay [FileId=" + tXPlayerAuthBuilder.fileId + "][Timeout=" + tXPlayerAuthBuilder.timeout + "][Unique identification request=" + tXPlayerAuthBuilder.f75357us + "][Trial duration=" + tXPlayerAuthBuilder.exper + "][Sign=" + tXPlayerAuthBuilder.sign + "][player=" + hashCode() + "]");
        final C34666a c34666a = this.mPlayer;
        c34666a.f73307r = null;
        c34666a.m75985g();
        c34666a.f73308s = null;
        C34837d c34837d = new C34837d();
        c34666a.f73312w = c34837d;
        c34837d.f73984e = tXPlayerAuthBuilder.isHttps();
        c34666a.f73312w.m76393a(new InterfaceC34838e() { // from class: com.tencent.liteav.a.1
            @Override // com.tencent.liteav.txcvodplayer.p133b.InterfaceC34838e
            /* JADX INFO: renamed from: a */
            public final void mo75986a(C34837d c34837d2) {
                if (c34837d2 != C34666a.this.f73312w) {
                    return;
                }
                C34839f c34839fM76392a = c34837d2.m76392a();
                C34666a.this.m75963a(c34839fM76392a.m76399a());
                Bundle bundle = new Bundle();
                bundle.putInt(TXVodConstants.EVT_ID, 2010);
                bundle.putLong("EVT_TIME", TimeUtil.m76097a());
                bundle.putLong("EVT_UTC_TIME", TimeUtil.m76098b());
                bundle.putString("EVT_MSG", "Requested file information successfully");
                bundle.putString("EVT_PLAY_URL", c34839fM76392a.m76399a());
                bundle.putString("EVT_PLAY_COVER_URL", c34839fM76392a.m76402d());
                bundle.putString("EVT_PLAY_NAME", c34839fM76392a.m76405g());
                bundle.putString("EVT_PLAY_DESCRIPTION", c34839fM76392a.m76406h());
                if (c34839fM76392a.m76404f() != null) {
                    bundle.putInt("EVT_PLAY_DURATION", c34839fM76392a.m76404f().f74006e);
                }
                C34666a.this.m75924a(2010, bundle);
                C34666a.this.m75980c("onNetSuccess: Requested file information successfully");
            }

            @Override // com.tencent.liteav.txcvodplayer.p133b.InterfaceC34838e
            /* JADX INFO: renamed from: a */
            public final void mo75987a(C34837d c34837d2, String str, int i11) {
                if (c34837d2 != C34666a.this.f73312w) {
                    return;
                }
                Bundle bundle = new Bundle();
                bundle.putInt(TXVodConstants.EVT_ID, -2306);
                bundle.putLong("EVT_TIME", TimeUtil.m76097a());
                bundle.putLong("EVT_UTC_TIME", TimeUtil.m76098b());
                bundle.putString("EVT_MSG", str);
                bundle.putInt("EVT_PARAM1", i11);
                C34666a.this.m75924a(-2306, bundle);
                C34666a.this.m75980c("onNetFailed: eventId: -2306 description:".concat(String.valueOf(str)));
            }
        });
        c34666a.m75980c("startPlayv2 ,appid:" + tXPlayerAuthBuilder.getAppId() + " ,FileId:" + tXPlayerAuthBuilder.getFileId() + " ,Timeout:" + tXPlayerAuthBuilder.getTimeout() + " ,us:" + tXPlayerAuthBuilder.getUs() + " exper:" + tXPlayerAuthBuilder.getExper() + " ,sign" + tXPlayerAuthBuilder.getSign());
        return c34666a.f73312w.m76391a(tXPlayerAuthBuilder.getAppId(), tXPlayerAuthBuilder.getFileId(), tXPlayerAuthBuilder.getTimeout(), tXPlayerAuthBuilder.getUs(), tXPlayerAuthBuilder.getExper(), tXPlayerAuthBuilder.getSign());
    }

    public void setPlayerView(TextureRenderView textureRenderView) {
        innerLogI("setPlayerView TextureRenderView: ".concat(String.valueOf(textureRenderView)));
        this.mPlayer.f73294e.setRenderView(textureRenderView);
    }

    public void startVodPlay(final TXPlayInfoParams tXPlayInfoParams) {
        innerLogI("startPlay playInfoParams: ".concat(String.valueOf(tXPlayInfoParams)) != null ? tXPlayInfoParams.toString() : "null");
        final C34666a c34666a = this.mPlayer;
        c34666a.f73307r = tXPlayInfoParams;
        c34666a.m75985g();
        if (tXPlayInfoParams != null) {
            int i11 = c34666a.f73305p;
            c34666a.m75965a(false);
            c34666a.f73305p = i11;
            c34666a.f73302m = false;
            C34836c c34836c = new C34836c(tXPlayInfoParams);
            c34666a.m75980c("[TXCPlayInfoProtocolV4:" + c34836c.hashCode() + "], create TXCPlayInfoProtocolV4: " + tXPlayInfoParams);
            c34836c.m76376a(new C34836c.a() { // from class: com.tencent.liteav.a.2
                @Override // com.tencent.liteav.txcvodplayer.p133b.C34836c.a
                /* JADX INFO: renamed from: a */
                public final void mo75989a(C34836c c34836c2, TXPlayInfoParams tXPlayInfoParams2) {
                    C34666a.this.m75980c("onSuccess: Requested file information successfully: ".concat(String.valueOf(tXPlayInfoParams2)));
                    if (C34666a.this.f73302m) {
                        return;
                    }
                    if (C34666a.this.f73307r == null || TextUtils.equals(tXPlayInfoParams2.getFileId(), C34666a.this.f73307r.getFileId())) {
                        if ("SimpleAES".equalsIgnoreCase(c34836c2.m76388l())) {
                            C34666a.this.f73308s = c34836c2.f73947d;
                            C34841a.m76410a().m76419b();
                        } else {
                            C34666a.this.f73308s = null;
                        }
                        String strM76378b = c34836c2.m76378b();
                        String strM76375a = c34836c2.m76375a("Widevine");
                        if (TextUtils.isEmpty(strM76375a)) {
                            C34666a.this.m75985g();
                            if (!TextUtils.isEmpty(strM76378b)) {
                                String strM76213a = C34804a.m76213a(strM76378b, c34836c2.m76380d());
                                C34666a.this.f73303n = null;
                                String strM76388l = c34836c2.m76388l();
                                if (TextUtils.isEmpty(strM76388l)) {
                                    strM76388l = "plain";
                                }
                                C34666a.this.m75963a(C34804a.m76214a(strM76213a, tXPlayInfoParams2.getFileId(), strM76388l, tXPlayInfoParams2.getAppId()));
                            }
                        } else {
                            C34666a.this.f73303n = null;
                            C34666a.this.m75964a(strM76375a, c34836c2.m76389m(), new TXPlayerDrmBuilder().getDeviceCertificateUrl(), C34804a.m76213a(strM76378b, c34836c2.m76380d()), !TextUtils.isEmpty(strM76378b) ? c34836c2.f73947d : null);
                        }
                        Bundle bundle = new Bundle();
                        bundle.putInt(TXVodConstants.EVT_ID, 2010);
                        bundle.putLong("EVT_TIME", TimeUtil.m76097a());
                        bundle.putLong("EVT_UTC_TIME", TimeUtil.m76098b());
                        bundle.putString("EVT_MSG", "Requested file information successfully");
                        bundle.putString("EVT_PLAY_URL", C34666a.this.f73309t);
                        bundle.putString("EVT_PLAY_COVER_URL", c34836c2.m76379c());
                        bundle.putString("EVT_PLAY_NAME", c34836c2.m76381e());
                        bundle.putString("EVT_PLAY_DESCRIPTION", c34836c2.m76382f());
                        bundle.putInt("EVT_PLAY_DURATION", c34836c2.m76383g());
                        C34835b c34835b = c34836c2.f73946c;
                        bundle.putString(TXVodConstants.EVT_KEY_WATER_MARK_TEXT, c34835b != null ? c34835b.f73931f : null);
                        C34836c.c cVarM76385i = c34836c2.m76385i();
                        if (cVarM76385i != null) {
                            bundle.putString(TXVodConstants.EVT_IMAGESPRIT_WEBVTTURL, cVarM76385i.f73971b);
                            bundle.putStringArrayList(TXVodConstants.EVT_IMAGESPRIT_IMAGEURL_LIST, cVarM76385i.f73970a);
                        }
                        List<C34836c.d> listM76386j = c34836c2.m76386j();
                        if (listM76386j != null && !listM76386j.isEmpty()) {
                            ArrayList<String> arrayList = new ArrayList<>();
                            float[] fArr = new float[listM76386j.size()];
                            for (int i12 = 0; i12 < listM76386j.size(); i12++) {
                                arrayList.add(listM76386j.get(i12).f73972a);
                                fArr[i12] = listM76386j.get(i12).f73973b;
                            }
                            bundle.putStringArrayList(TXVodConstants.EVT_KEY_FRAME_CONTENT_LIST, arrayList);
                            bundle.putFloatArray(TXVodConstants.EVT_KEY_FRAME_TIME_LIST, fArr);
                        }
                        bundle.putString(TXVodConstants.EVT_DRM_TYPE, c34836c2.m76388l());
                        C34666a.this.m75924a(2010, bundle);
                    }
                }

                @Override // com.tencent.liteav.txcvodplayer.p133b.C34836c.a
                /* JADX INFO: renamed from: a */
                public final void mo75988a(int i12, String str) {
                    C34666a.this.m75942e("onFail: errorCode = " + i12 + " message = " + str);
                    Bundle bundle = new Bundle();
                    bundle.putInt(TXVodConstants.EVT_ID, -2306);
                    bundle.putLong("EVT_TIME", TimeUtil.m76097a());
                    bundle.putLong("EVT_UTC_TIME", TimeUtil.m76098b());
                    bundle.putString("EVT_MSG", str);
                    bundle.putInt("EVT_PARAM1", i12);
                    C34833a c34833a = new C34833a(C34666a.this.f73273F);
                    c34833a.m76344a(String.valueOf(tXPlayInfoParams.getAppId()));
                    c34833a.f73914u = tXPlayInfoParams.getFileId();
                    c34833a.f73912s = C34666a.this.f73294e.getPlayerType();
                    c34833a.m76346a(C34666a.this.f73299j);
                    if (i12 == -1) {
                        i12 = -2306;
                    }
                    c34833a.m76343a(i12, str);
                    c34833a.m76341a();
                    C34666a.this.m75924a(-2306, bundle);
                    C34666a.this.m75980c("onError: eventId: -2306 description:".concat(String.valueOf(str)));
                }
            });
        }
    }
}
