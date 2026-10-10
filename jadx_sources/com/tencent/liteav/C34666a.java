package com.tencent.liteav;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import android.view.Surface;
import android.view.TextureView;
import cn.jiguang.privates.analysis.constants.JAnalysisConstants;
import cn.jiguang.privates.common.constants.JCommonConstants;
import com.tencent.bugly.library.MonitorCallback;
import com.tencent.liteav.base.ContextUtils;
import com.tencent.liteav.base.datareport.Event4XReporter;
import com.tencent.liteav.base.system.LiteavSystemInfo;
import com.tencent.liteav.base.util.C34755t;
import com.tencent.liteav.base.util.CommonUtil;
import com.tencent.liteav.base.util.EnumC34747l;
import com.tencent.liteav.base.util.HttpDnsUtil;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.liteav.base.util.SoLoader;
import com.tencent.liteav.base.util.TimeUtil;
import com.tencent.liteav.sdk.common.HouseBuilder;
import com.tencent.liteav.txcplayer.C34813e;
import com.tencent.liteav.txcplayer.ITXVCubePlayer;
import com.tencent.liteav.txcplayer.InterfaceC34812d;
import com.tencent.liteav.txcplayer.common.C34810b;
import com.tencent.liteav.txcplayer.common.C34811c;
import com.tencent.liteav.txcplayer.common.VodPlayerControl;
import com.tencent.liteav.txcplayer.ext.service.RenderProcessService;
import com.tencent.liteav.txcplayer.model.C34816b;
import com.tencent.liteav.txcplayer.p131a.C34804a;
import com.tencent.liteav.txcvodplayer.TXCVodVideoView;
import com.tencent.liteav.txcvodplayer.hlsencoder.TXCHLSEncoder;
import com.tencent.liteav.txcvodplayer.p132a.C34833a;
import com.tencent.liteav.txcvodplayer.p133b.C34836c;
import com.tencent.liteav.txcvodplayer.p133b.C34837d;
import com.tencent.liteav.txcvodplayer.p134c.C34841a;
import com.tencent.liteav.txcvodplayer.renderer.C34851c;
import com.tencent.liteav.txcvodplayer.renderer.C34852d;
import com.tencent.liteav.txcvodplayer.renderer.RunnableC34853e;
import com.tencent.liteav.txcvodplayer.renderer.RunnableC34856h;
import com.tencent.liteav.txcvodplayer.renderer.TextureRenderView;
import com.tencent.liteav.videobase.base.GLConstants;
import com.tencent.liteav.videobase.frame.PixelFrame;
import com.tencent.liteav.videobase.videobase.TXCCloudVideoViewMethodInvoker;
import com.tencent.qcloud.tuicore.TUIConstants;
import com.tencent.rtmp.ITXLivePlayListener;
import com.tencent.rtmp.ITXVodPlayListener;
import com.tencent.rtmp.TXPlayInfoParams;
import com.tencent.rtmp.TXPlayerDrmBuilder;
import com.tencent.rtmp.TXTrackInfo;
import com.tencent.rtmp.TXVodConstants;
import com.tencent.rtmp.TXVodDef;
import com.tencent.rtmp.TXVodPlayConfig;
import com.tencent.rtmp.TXVodPlayer;
import com.tencent.rtmp.p148ui.TXCloudVideoView;
import com.tencent.rtmp.p148ui.TXSubtitleView;
import com.tencent.thumbplayer.tcmedia.api.TPSubtitleData;
import com.tencent.thumbplayer.tcmedia.api.TPSubtitleFrameBuffer;
import com.tencent.thumbplayer.tcmedia.api.TPTrackInfo;
import com.tencent.trtc.TRTCCloudDef;
import com.tencent.ugc.datereport.UGCDataReportDef;
import java.lang.reflect.Field;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.microedition.khronos.egl.EGLContext;

/* JADX INFO: renamed from: com.tencent.liteav.a */
/* JADX INFO: loaded from: classes59.dex */
public final class C34666a implements C34852d.a {

    /* JADX INFO: renamed from: E */
    private static final String f73268E = new String(Base64.decode("aHR0cHM6Ly9jbG91ZC50ZW5jZW50LmNvbS9hY3QvZXZlbnQvTGljZW5zZQ==", 0));

    /* JADX INFO: renamed from: A */
    public C34852d f73269A;

    /* JADX INFO: renamed from: B */
    public Object f73270B;

    /* JADX INFO: renamed from: C */
    public TXSubtitleView f73271C;

    /* JADX INFO: renamed from: F */
    private Context f73273F;

    /* JADX INFO: renamed from: G */
    private HashMap<String, String> f73274G;

    /* JADX INFO: renamed from: J */
    private long f73277J;

    /* JADX INFO: renamed from: K */
    private int f73278K;

    /* JADX INFO: renamed from: L */
    private int f73279L;

    /* JADX INFO: renamed from: M */
    private boolean f73280M;

    /* JADX INFO: renamed from: N */
    private b f73281N;

    /* JADX INFO: renamed from: O */
    private boolean f73282O;

    /* JADX INFO: renamed from: P */
    private boolean f73283P;

    /* JADX INFO: renamed from: Q */
    private C34851c f73284Q;

    /* JADX INFO: renamed from: S */
    private PixelFrame f73286S;

    /* JADX INFO: renamed from: T */
    private a f73287T;

    /* JADX INFO: renamed from: b */
    public ITXLivePlayListener f73291b;

    /* JADX INFO: renamed from: c */
    public ITXVodPlayListener f73292c;

    /* JADX INFO: renamed from: d */
    public TXVodPlayer f73293d;

    /* JADX INFO: renamed from: e */
    public TXCVodVideoView f73294e;

    /* JADX INFO: renamed from: f */
    public TXVodPlayConfig f73295f;

    /* JADX INFO: renamed from: h */
    public boolean f73297h;

    /* JADX INFO: renamed from: l */
    public Surface f73301l;

    /* JADX INFO: renamed from: n */
    public String f73303n;

    /* JADX INFO: renamed from: o */
    public final Map<String, Object> f73304o;

    /* JADX INFO: renamed from: r */
    public TXPlayInfoParams f73307r;

    /* JADX INFO: renamed from: s */
    public C34836c.b f73308s;

    /* JADX INFO: renamed from: w */
    public C34837d f73312w;

    /* JADX INFO: renamed from: x */
    public boolean f73313x;

    /* JADX INFO: renamed from: y */
    public boolean f73314y;

    /* JADX INFO: renamed from: z */
    protected float f73315z;

    /* JADX INFO: renamed from: a */
    public TXCloudVideoView f73290a = null;

    /* JADX INFO: renamed from: g */
    public C34833a f73296g = null;

    /* JADX INFO: renamed from: H */
    private boolean f73275H = false;

    /* JADX INFO: renamed from: i */
    public boolean f73298i = true;

    /* JADX INFO: renamed from: j */
    public boolean f73299j = true;

    /* JADX INFO: renamed from: k */
    public boolean f73300k = true;

    /* JADX INFO: renamed from: I */
    private float f73276I = 1.0f;

    /* JADX INFO: renamed from: m */
    public boolean f73302m = false;

    /* JADX INFO: renamed from: p */
    public int f73305p = -1000;

    /* JADX INFO: renamed from: q */
    public boolean f73306q = false;

    /* JADX INFO: renamed from: t */
    public String f73309t = "";

    /* JADX INFO: renamed from: u */
    public boolean f73310u = false;

    /* JADX INFO: renamed from: v */
    public int f73311v = -1;

    /* JADX INFO: renamed from: D */
    public int f73272D = -1;

    /* JADX INFO: renamed from: R */
    private AtomicBoolean f73285R = new AtomicBoolean(false);

    /* JADX INFO: renamed from: U */
    private InterfaceC34812d f73288U = new InterfaceC34812d() { // from class: com.tencent.liteav.a.3
        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code duplicated, block: B:127:0x0384  */
        /* JADX WARN: Code duplicated, block: B:129:0x039a  */
        /* JADX WARN: Code duplicated, block: B:133:0x03a2  */
        @Override // com.tencent.liteav.txcplayer.InterfaceC34812d
        /* JADX INFO: renamed from: a */
        public final void mo75990a(int i11, Bundle bundle) {
            C34833a c34833a;
            int iCurrentTimeMillis;
            int i12;
            String str;
            Bundle bundle2 = new Bundle(bundle);
            if (i11 == -6101) {
                C34666a.this.f73296g.m76343a(TXVodConstants.VOD_PLAY_ERR_DRM, bundle.getString(TUIConstants.TUIPlugin.PLUGIN_DESCRIPTION, ""));
            } else if (i11 == -2301) {
                C34666a.this.f73296g.m76343a(-2301, bundle.getString(TUIConstants.TUIPlugin.PLUGIN_DESCRIPTION, ""));
            } else if (i11 == 2011) {
                bundle2.putInt("EVT_PARAM1", C34666a.this.f73294e.getMetaRotationDegree());
            } else if (i11 != 2026 && i11 != 2103) {
                if (i11 != 2106) {
                    if (i11 != 2013) {
                        int i13 = 1;
                        if (i11 == 2014) {
                            c34833a = C34666a.this.f73296g;
                            if (!c34833a.f73909p && c34833a.f73905l != -1 && !c34833a.f73901h && !c34833a.f73911r) {
                                c34833a.m76348b("setLoadEnd mFirstFrame=" + c34833a.f73905l + " , mIsLoading = " + c34833a.f73910q + ",mBeginLoadTS = " + c34833a.f73898e);
                                if (c34833a.f73910q) {
                                    iCurrentTimeMillis = (int) (System.currentTimeMillis() - c34833a.f73898e);
                                    c34833a.f73907n += iCurrentTimeMillis;
                                    c34833a.f73906m++;
                                    if (c34833a.f73908o < iCurrentTimeMillis) {
                                        c34833a.f73908o = iCurrentTimeMillis;
                                    }
                                    c34833a.f73910q = false;
                                }
                            }
                            if (c34833a.f73909p) {
                                c34833a.f73909p = false;
                            }
                            C34666a.this.f73296g.m76353e();
                        } else if (i11 != 2030 && i11 != 2031) {
                            switch (i11) {
                                case TXVodConstants.VOD_PLAY_ERR_DOWNLOAD_FAIL /* -6011 */:
                                case TXVodConstants.VOD_PLAY_ERR_PROCESS_VIDEO_FAIL /* -6010 */:
                                case TXVodConstants.VOD_PLAY_ERR_RENDER_FAIL /* -6009 */:
                                case TXVodConstants.VOD_PLAY_ERR_DECODE_SUBTITLE_FAIL /* -6008 */:
                                case TXVodConstants.VOD_PLAY_ERR_DECODE_AUDIO_FAIL /* -6007 */:
                                case TXVodConstants.VOD_PLAY_ERR_DECODE_VIDEO_FAIL /* -6006 */:
                                case TXVodConstants.VOD_PLAY_ERR_DEMUXER_TIMEOUT /* -6005 */:
                                case TXVodConstants.VOD_PLAY_ERR_SYSTEM_PLAY_FAIL /* -6004 */:
                                case TXVodConstants.VOD_PLAY_ERR_DEMUXER_FAIL /* -6003 */:
                                case TXVodConstants.VOD_PLAY_ERR_GENERAL /* -6002 */:
                                case TXVodConstants.VOD_PLAY_ERR_UNKNOW /* -6001 */:
                                    C34666a.this.f73296g.m76343a(i11, bundle.getString(TUIConstants.TUIPlugin.PLUGIN_DESCRIPTION, ""));
                                    break;
                                default:
                                    switch (i11) {
                                        case -2305:
                                            C34666a.this.f73296g.m76343a(-2305, "HLS decrypt key error");
                                            break;
                                        case -2304:
                                            C34666a.this.f73296g.m76343a(-2304, "h265 decode failed");
                                            C34666a.this.f73296g.m76345a("support_hevc", "0");
                                            if (!C34666a.this.f73297h) {
                                                C34666a.m75952n(C34666a.this);
                                                C34666a c34666a = C34666a.this;
                                                c34666a.m75972a(c34666a.f73295f);
                                            }
                                            break;
                                        case -2303:
                                            C34666a.this.f73296g.m76343a(-2303, "file not found");
                                            break;
                                        default:
                                            switch (i11) {
                                                case 2002:
                                                case 2008:
                                                    break;
                                                case 2003:
                                                    Bundle bundle3 = bundle2.getBundle(JAnalysisConstants.ACCOUNT_EXTRA_ATTR);
                                                    if (bundle3 != null) {
                                                        String string = bundle3.getString("support_hevc");
                                                        if (!TextUtils.isEmpty(string)) {
                                                            C34666a.this.f73296g.m76345a("support_hevc", string);
                                                        }
                                                        bundle2.remove(JAnalysisConstants.ACCOUNT_EXTRA_ATTR);
                                                    }
                                                    C34833a c34833a2 = C34666a.this.f73296g;
                                                    int videoWidth = C34666a.this.f73294e.getVideoWidth();
                                                    int videoHeight = C34666a.this.f73294e.getVideoHeight();
                                                    c34833a2.f73878C = videoWidth;
                                                    c34833a2.f73879D = videoHeight;
                                                    C34666a.this.m75980c("onPlayEvent VOD_PLAY_EVT_RCV_FIRST_I_FRAME");
                                                    C34666a.this.f73296g.m76353e();
                                                    if (!C34666a.this.f73297h) {
                                                        C34666a.m75956r(C34666a.this);
                                                        C34666a.this.f73296g.m76352d();
                                                        Bundle bundle4 = new Bundle();
                                                        bundle4.putInt(TXVodConstants.EVT_ID, 2008);
                                                        bundle4.putLong("EVT_TIME", TimeUtil.m76097a());
                                                        bundle4.putLong("EVT_UTC_TIME", TimeUtil.m76098b());
                                                        C34816b mediaInfo = C34666a.this.f73294e.getMediaInfo();
                                                        if (mediaInfo == null || (str = mediaInfo.f73772c) == null || !str.toLowerCase().contains("hevc")) {
                                                            bundle4.putCharSequence(TUIConstants.TUIPlugin.PLUGIN_DESCRIPTION, C34666a.this.f73300k ? "Enables hardware decoding" : "Enables software decoding");
                                                            i12 = 0;
                                                        } else {
                                                            bundle4.putCharSequence(TUIConstants.TUIPlugin.PLUGIN_DESCRIPTION, C34666a.this.f73300k ? "Enables hardware decoding H265" : "Enables software decoding h265");
                                                            i12 = 1;
                                                        }
                                                        bundle4.putInt("EVT_PARAM1", C34666a.this.f73300k ? 1 : 2);
                                                        bundle4.putInt(TXVodConstants.EVT_CODEC_TYPE, i12);
                                                        if (!C34666a.this.f73300k) {
                                                            i13 = i12 != 0 ? 2 : 0;
                                                        } else if (i12 != 0) {
                                                            i13 = 3;
                                                        }
                                                        C34666a.this.f73296g.f73916w = i13;
                                                        mo75990a(2008, bundle4);
                                                        bundle2.putInt("EVT_PARAM1", C34666a.this.f73296g.f73905l);
                                                        break;
                                                    }
                                                    break;
                                                case 2004:
                                                    C34666a.this.m75980c("onPlayEvent VOD_PLAY_EVT_PLAY_BEGIN");
                                                    if (C34666a.this.f73280M) {
                                                        C34666a.this.f73296g.m76352d();
                                                    }
                                                    C34666a.this.f73280M = false;
                                                    C34666a.this.f73296g.f73911r = false;
                                                    break;
                                                case 2005:
                                                    C34833a c34833a3 = C34666a.this.f73296g;
                                                    int i14 = bundle.getInt("EVT_PLAY_DURATION", 0);
                                                    int i15 = bundle.getInt("EVT_PLAY_PROGRESS", 0);
                                                    c34833a3.f73902i = i14;
                                                    int i16 = i15 / 60;
                                                    if (i16 != c34833a3.f73903j) {
                                                        c34833a3.f73903j = i16;
                                                        if (!c34833a3.f73899f) {
                                                            c34833a3.m76347b();
                                                        }
                                                    }
                                                    break;
                                                case 2006:
                                                    C34666a.this.f73296g.m76350c();
                                                    if (C34666a.this.f73314y) {
                                                        Bundle bundle5 = new Bundle();
                                                        bundle5.putString("EVT_MSG", "loop once playback complete");
                                                        C34666a.this.m75924a(6001, bundle5);
                                                        C34666a.this.f73280M = true;
                                                        C34666a.this.f73296g.f73911r = true;
                                                        C34666a.this.f73294e.m76325c(true);
                                                        C34666a.this.f73296g.m76346a(true);
                                                        C34666a.this.m75980c("loop play");
                                                    }
                                                    break;
                                                case 2007:
                                                    C34833a c34833a4 = C34666a.this.f73296g;
                                                    if (!c34833a4.f73909p && c34833a4.f73905l != -1 && !c34833a4.f73901h && !c34833a4.f73911r) {
                                                        c34833a4.f73898e = System.currentTimeMillis();
                                                        c34833a4.f73910q = true;
                                                        c34833a4.m76348b("setLoadBegin mBeginLoadTS= " + c34833a4.f73898e);
                                                    }
                                                    break;
                                                case 2009:
                                                    if (C34666a.this.f73269A != null) {
                                                        C34852d c34852d = C34666a.this.f73269A;
                                                        c34852d.m76459a(RunnableC34856h.m76464a(c34852d, C34666a.this.f73294e.getVideoWidth(), C34666a.this.f73294e.getVideoHeight()), "setVideoSize");
                                                    }
                                                    break;
                                                default:
                                                    switch (i11) {
                                                        case TXVodConstants.VOD_PLAY_EVT_TCP_CONNECT_SUCC /* 2016 */:
                                                            C34666a.this.m75980c("onPlayEvent tcp connect success");
                                                            C34833a c34833a5 = C34666a.this.f73296g;
                                                            if (c34833a5.f73917x == 0) {
                                                                c34833a5.f73917x = (int) (System.currentTimeMillis() - c34833a5.f73895b);
                                                                c34833a5.m76348b("mTcpConnectTS = " + c34833a5.f73917x + ", mOriginBeginPlayTS = " + c34833a5.f73895b + ", " + System.currentTimeMillis());
                                                            }
                                                            break;
                                                        case TXVodConstants.VOD_PLAY_EVT_FIRST_VIDEO_PACKET /* 2017 */:
                                                            C34666a.this.m75980c("onPlayEvent first video packet");
                                                            if (!C34666a.this.f73275H) {
                                                                C34833a c34833a6 = C34666a.this.f73296g;
                                                                if (c34833a6.f73919z == 0) {
                                                                    c34833a6.f73919z = (int) (System.currentTimeMillis() - c34833a6.f73896c);
                                                                }
                                                                C34666a.m75955q(C34666a.this);
                                                            }
                                                            c34833a = C34666a.this.f73296g;
                                                            if (!c34833a.f73909p) {
                                                                c34833a.m76348b("setLoadEnd mFirstFrame=" + c34833a.f73905l + " , mIsLoading = " + c34833a.f73910q + ",mBeginLoadTS = " + c34833a.f73898e);
                                                                if (c34833a.f73910q) {
                                                                    iCurrentTimeMillis = (int) (System.currentTimeMillis() - c34833a.f73898e);
                                                                    c34833a.f73907n += iCurrentTimeMillis;
                                                                    c34833a.f73906m++;
                                                                    if (c34833a.f73908o < iCurrentTimeMillis) {
                                                                        c34833a.f73908o = iCurrentTimeMillis;
                                                                    }
                                                                    c34833a.f73910q = false;
                                                                }
                                                            }
                                                            if (c34833a.f73909p) {
                                                                c34833a.f73909p = false;
                                                            }
                                                            C34666a.this.f73296g.m76353e();
                                                            break;
                                                        case TXVodConstants.VOD_PLAY_EVT_DNS_RESOLVED /* 2018 */:
                                                            C34666a.this.m75980c("onPlayEvent dns resolved");
                                                            C34833a c34833a7 = C34666a.this.f73296g;
                                                            if (c34833a7.f73918y == 0) {
                                                                c34833a7.f73918y = (int) (System.currentTimeMillis() - c34833a7.f73895b);
                                                            }
                                                            break;
                                                        default:
                                                            if (i11 < 8000 || i11 > 8200) {
                                                                C34666a.this.m75980c("onPlayEvent miss match event ".concat(String.valueOf(i11)));
                                                                break;
                                                            }
                                                        case TXVodConstants.VOD_PLAY_EVT_SEEK_COMPLETE /* 2019 */:
                                                        case TXVodConstants.VOD_PLAY_EVT_SELECT_TRACK_COMPLETE /* 2020 */:
                                                            bundle2.putString("EVT_MSG", bundle.getString(TUIConstants.TUIPlugin.PLUGIN_DESCRIPTION, ""));
                                                            C34666a.this.m75924a(i11, bundle2);
                                                            break;
                                                    }
                                                    break;
                                            }
                                            break;
                                    }
                                    break;
                            }
                            return;
                        }
                    } else {
                        C34666a.this.m75980c("onPlayEvent VOD_PLAY_EVT_VOD_PLAY_PREPARED");
                    }
                } else if (!C34666a.this.f73297h) {
                    C34666a.m75952n(C34666a.this);
                    C34666a c34666a2 = C34666a.this;
                    c34666a2.m75972a(c34666a2.f73295f);
                }
            }
            bundle2.putString("EVT_MSG", bundle.getString(TUIConstants.TUIPlugin.PLUGIN_DESCRIPTION, ""));
            C34666a.this.m75924a(i11, bundle2);
        }

        @Override // com.tencent.liteav.txcplayer.InterfaceC34812d
        /* JADX INFO: renamed from: a */
        public final void mo75991a(Bundle bundle) {
            Bundle bundle2 = new Bundle();
            bundle2.putCharSequence("CPU_USAGE", C34755t.m76145a()[0] + "%");
            bundle2.putInt("VIDEO_FPS", (int) bundle.getFloat(MonitorCallback.EVENT_FPS));
            bundle2.putInt("VIDEO_DPS", (int) bundle.getFloat("dps"));
            bundle2.putInt("NET_SPEED", ((int) bundle.getLong("tcpSpeed")) / 1000);
            bundle2.putInt("VIDEO_CACHE", ((int) bundle.getLong("cachedBytes")) / 1000);
            bundle2.putInt("VIDEO_WIDTH", C34666a.this.f73294e.getVideoWidth());
            bundle2.putInt("VIDEO_HEIGHT", C34666a.this.f73294e.getVideoHeight());
            bundle2.putString("SERVER_IP", C34666a.this.f73294e.getServerIp());
            bundle2.putInt("VIDEO_BITRATE", (int) bundle.getLong("VIDEO_BITRATE"));
            bundle2.putInt("AUDIO_BITRATE", (int) bundle.getLong("AUDIO_BITRATE"));
            C34833a c34833a = C34666a.this.f73296g;
            String serverIp = C34666a.this.f73294e.getServerIp();
            c34833a.f73876A = serverIp;
            if (serverIp == null) {
                c34833a.f73876A = "";
            }
            C34666a.this.m75924a(15001, bundle2);
        }
    };

    /* JADX INFO: renamed from: V */
    private ITXVCubePlayer.InterfaceC34794b f73289V = new ITXVCubePlayer.InterfaceC34794b() { // from class: com.tencent.liteav.a.4
        @Override // com.tencent.liteav.txcplayer.ITXVCubePlayer.InterfaceC34794b
        /* JADX INFO: renamed from: a */
        public final void mo75992a(ITXVCubePlayer iTXVCubePlayer, TPSubtitleFrameBuffer tPSubtitleFrameBuffer) {
            Bitmap bitmap;
            if (C34666a.this.f73284Q == null) {
                C34666a.this.f73284Q = new C34851c();
            }
            C34851c c34851c = C34666a.this.f73284Q;
            if (tPSubtitleFrameBuffer == null) {
                LiteavLog.m76087i("SubtitleRender", "[renderToBitmap] subtitleFrameBuffer is null");
                bitmap = null;
            } else {
                LiteavLog.m76087i("SubtitleRender", "[renderToBitmap] subtitleFrameBuffer, trackId: " + tPSubtitleFrameBuffer.trackID + " ,width: " + tPSubtitleFrameBuffer.getSrcWidth() + ", height: " + tPSubtitleFrameBuffer.getSrcHeight());
                Bitmap bitmap2 = c34851c.f74068a;
                if (bitmap2 == null || bitmap2.getWidth() != tPSubtitleFrameBuffer.getSrcWidth() || c34851c.f74068a.getHeight() != tPSubtitleFrameBuffer.getSrcHeight()) {
                    c34851c.f74068a = Bitmap.createBitmap(tPSubtitleFrameBuffer.getSrcWidth(), tPSubtitleFrameBuffer.getSrcHeight(), Bitmap.Config.ARGB_8888);
                }
                c34851c.f74068a.copyPixelsFromBuffer(ByteBuffer.wrap(tPSubtitleFrameBuffer.getData()[0]));
                bitmap = c34851c.f74068a;
            }
            if (C34666a.this.f73271C != null) {
                C34666a.this.f73271C.show(bitmap);
            }
        }
    };

    /* JADX INFO: renamed from: com.tencent.liteav.a$a */
    public class a extends Handler {
        public a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            if (C34666a.this.f73285R.get()) {
                C34666a.this.m75934b(C34666a.this.f73286S);
                sendMessageDelayed(new Message(), 30L);
            }
        }
    }

    /* JADX INFO: renamed from: com.tencent.liteav.a$b */
    public static class b {

        /* JADX INFO: renamed from: a */
        private Class f73327a;

        /* JADX INFO: renamed from: b */
        private Class f73328b;

        /* JADX INFO: renamed from: c */
        private Class f73329c;

        /* JADX INFO: renamed from: d */
        private Field f73330d;

        /* JADX INFO: renamed from: e */
        private Field f73331e;

        /* JADX INFO: renamed from: f */
        private Field f73332f;

        /* JADX INFO: renamed from: g */
        private Field f73333g;

        /* JADX INFO: renamed from: h */
        private Field f73334h;

        /* JADX INFO: renamed from: i */
        private Field f73335i;

        /* JADX INFO: renamed from: j */
        private Field f73336j;

        /* JADX INFO: renamed from: k */
        private Field f73337k;

        /* JADX INFO: renamed from: l */
        private Field f73338l;

        /* JADX INFO: renamed from: a */
        public final void m75994a(Object obj, PixelFrame pixelFrame) {
            try {
                Object objNewInstance = this.f73328b.newInstance();
                this.f73330d.set(objNewInstance, Integer.valueOf(pixelFrame.getTextureId()));
                if (pixelFrame.getGLContext() instanceof EGLContext) {
                    this.f73331e.set(objNewInstance, pixelFrame.getGLContext());
                } else {
                    this.f73332f.set(objNewInstance, pixelFrame.getGLContext());
                }
                Object objNewInstance2 = this.f73329c.newInstance();
                this.f73333g.set(objNewInstance2, objNewInstance);
                this.f73334h.set(objNewInstance2, Integer.valueOf(pixelFrame.getWidth()));
                this.f73335i.set(objNewInstance2, Integer.valueOf(pixelFrame.getHeight()));
                this.f73336j.set(objNewInstance2, 2);
                this.f73337k.set(objNewInstance2, 3);
                this.f73338l.set(objNewInstance2, 0);
                this.f73327a.getDeclaredMethod("sendCustomVideoData", Integer.TYPE, objNewInstance2.getClass()).invoke(obj, 2, objNewInstance2);
            } catch (Exception e11) {
                LiteavLog.m76084e("TXCVodPlayer", "sendCustomVideoData method error ", e11);
            }
        }

        public b(Object obj) {
            try {
                this.f73327a = obj.getClass();
                this.f73328b = TRTCCloudDef.TRTCTexture.class;
                this.f73329c = TRTCCloudDef.TRTCVideoFrame.class;
                this.f73330d = TRTCCloudDef.TRTCTexture.class.getDeclaredField("textureId");
                this.f73331e = this.f73328b.getDeclaredField("eglContext10");
                this.f73333g = this.f73329c.getDeclaredField("texture");
                this.f73334h = this.f73329c.getDeclaredField("width");
                this.f73335i = this.f73329c.getDeclaredField("height");
                this.f73336j = this.f73329c.getDeclaredField("pixelFormat");
                this.f73337k = this.f73329c.getDeclaredField("bufferType");
                this.f73338l = this.f73329c.getDeclaredField("timestamp");
                if (LiteavSystemInfo.getSystemOSVersionInt() >= 17) {
                    this.f73332f = this.f73328b.getDeclaredField("eglContext14");
                }
            } catch (Exception e11) {
                LiteavLog.m76084e("TXCVodPlayer", "init TRTCCloudClassInvokeWrapper error ", e11);
            }
        }
    }

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ boolean m75952n(C34666a c34666a) {
        c34666a.f73300k = false;
        return false;
    }

    /* JADX INFO: renamed from: q */
    public static /* synthetic */ boolean m75955q(C34666a c34666a) {
        c34666a.f73275H = true;
        return true;
    }

    /* JADX INFO: renamed from: r */
    public static /* synthetic */ boolean m75956r(C34666a c34666a) {
        c34666a.f73297h = true;
        return true;
    }

    /* JADX INFO: renamed from: v */
    public static /* synthetic */ boolean m75960v(C34666a c34666a) {
        c34666a.f73306q = false;
        return false;
    }

    static {
        SoLoader.loadAllLibraries();
    }

    /* JADX INFO: renamed from: d */
    private void m75940d(boolean z11) {
        try {
            Object obj = this.f73270B;
            if (obj != null) {
                obj.getClass().getDeclaredMethod("enableCustomVideoCapture", Integer.TYPE, Boolean.TYPE).invoke(obj, 2, Boolean.valueOf(z11));
            }
        } catch (Exception e11) {
            m75942e("setTRTCCustomVideoCapture error " + Log.getStackTraceString(e11));
        }
    }

    /* JADX INFO: renamed from: h */
    private void m75945h() {
        if (this.f73274G.isEmpty() || this.f73296g == null) {
            return;
        }
        for (Map.Entry<String, String> entry : this.f73274G.entrySet()) {
            this.f73296g.m76345a(entry.getKey(), entry.getValue());
        }
        this.f73274G.clear();
    }

    /* JADX INFO: renamed from: e */
    public final void m75983e() {
        this.f73283P = false;
        ITXVCubePlayer iTXVCubePlayer = this.f73294e.f73835c;
        if (iTXVCubePlayer != null) {
            iTXVCubePlayer.unpublishAudioToNetwork();
        }
    }

    @Override // com.tencent.liteav.txcvodplayer.renderer.C34852d.a
    /* JADX INFO: renamed from: f */
    public final void mo75984f() {
        this.f73301l = null;
        this.f73294e.setRenderSurface(null);
    }

    /* JADX INFO: renamed from: g */
    public final void m75985g() {
        this.f73304o.put("TXC_DRM_ENABLE", Boolean.FALSE);
    }

    public C34666a(Context context) {
        this.f73273F = null;
        if (context != null) {
            Context applicationContext = context.getApplicationContext();
            this.f73273F = applicationContext;
            ContextUtils.initApplicationContext(applicationContext);
            ContextUtils.setDataDirectorySuffix("liteav");
        }
        this.f73304o = new HashMap();
        this.f73291b = null;
        this.f73292c = null;
        RenderProcessService.getInstance().checkInit(this.f73273F);
        TXCVodVideoView tXCVodVideoView = new TXCVodVideoView(this.f73273F);
        this.f73294e = tXCVodVideoView;
        tXCVodVideoView.setListener(this.f73288U);
        this.f73294e.setTXCOnSubtitleFrameDataListener(this.f73289V);
        this.f73274G = new HashMap<>();
        m75980c("[TXCVodVideoView:" + this.f73294e.hashCode() + "], new TXCVodPlayer");
    }

    /* JADX INFO: renamed from: b */
    public final void m75976b(int i11) {
        this.f73279L = i11;
        this.f73294e.setVideoRotationDegree(i11);
        C34852d c34852d = this.f73269A;
        if (c34852d != null) {
            c34852d.m76457a(EnumC34747l.m76131a(i11));
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m75979c(int i11) {
        C34833a c34833a;
        if (C34804a.m76219f(this.f73309t)) {
            return;
        }
        this.f73294e.setBitrateIndex(i11);
        this.f73305p = i11;
        if (i11 == -1 || !this.f73297h || (c34833a = this.f73296g) == null) {
            return;
        }
        c34833a.m76351c(this.f73295f.isSmoothSwitchBitrate());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public void m75942e(String str) {
        LiteavLog.m76083e("TXCVodPlayer", "[" + hashCode() + "], " + str);
    }

    /* JADX INFO: renamed from: b */
    public final void m75975b(float f11) {
        this.f73315z = f11;
        this.f73294e.setStartTime(f11);
    }

    /* JADX INFO: renamed from: d */
    public final void m75982d() {
        this.f73283P = true;
        this.f73294e.m76324c();
    }

    /* JADX INFO: renamed from: a */
    public final void m75972a(TXVodPlayConfig tXVodPlayConfig) {
        this.f73295f = tXVodPlayConfig;
        if (tXVodPlayConfig == null) {
            this.f73295f = new TXVodPlayConfig();
        }
        C34813e c34813e = new C34813e();
        c34813e.f73739a = this.f73295f.getConnectRetryCount();
        c34813e.f73740b = this.f73295f.getConnectRetryInterval();
        c34813e.f73741c = this.f73295f.getTimeout();
        c34813e.f73742d = this.f73300k;
        c34813e.f73743e = this.f73295f.getCacheFolderPath();
        c34813e.f73744f = this.f73295f.getMaxCacheItems();
        c34813e.f73745g = this.f73295f.getPlayerType();
        c34813e.f73746h = this.f73295f.getHeaders();
        c34813e.f73747i = this.f73295f.isEnableAccurateSeek();
        c34813e.f73748j = this.f73295f.isSmoothSwitchBitrate();
        c34813e.f73749k = this.f73295f.getCacheMp4ExtName();
        c34813e.f73750l = this.f73295f.getProgressInterval();
        c34813e.f73751m = this.f73295f.getMaxBufferSize();
        c34813e.f73752n = this.f73295f.getMaxPreloadSize();
        if (this.f73307r == null && this.f73308s == null) {
            c34813e.f73762x = this.f73295f.getOverlayKey();
            c34813e.f73763y = this.f73295f.getOverlayIv();
        } else {
            C34836c.b bVar = this.f73308s;
            if (bVar != null) {
                c34813e.f73762x = bVar.f73966a;
                c34813e.f73763y = bVar.f73967b;
            } else {
                c34813e.f73762x = null;
                c34813e.f73763y = null;
            }
        }
        c34813e.f73734A = this.f73295f.getExtInfoMap();
        c34813e.f73736C = this.f73295f.isEnableRenderProcess();
        c34813e.f73735B = this.f73295f.isAutoRotate();
        long j11 = this.f73277J;
        if (j11 > 0) {
            c34813e.f73760v = j11;
        } else {
            c34813e.f73760v = this.f73295f.getPreferredResolution();
        }
        c34813e.f73737D = this.f73295f.getMediaType();
        c34813e.f73754p = this.f73299j;
        c34813e.f73759u = this.f73295f.getEncryptedMp4Level();
        c34813e.f73738E = this.f73295f.getPreferredAudioTrack();
        m75980c("setConfig connectRetryCount:" + this.f73295f.getConnectRetryCount() + " ,connectRetryInterval:" + this.f73295f.getConnectRetryInterval() + " ,timeout:" + this.f73295f.getTimeout() + " ,enableHardwareDecoder:" + this.f73300k + " ,cacheFolderPath:" + this.f73295f.getCacheFolderPath() + " ,maxCacheItems:" + this.f73295f.getMaxCacheItems() + " ,enableAccurateSeek:" + this.f73295f.isEnableAccurateSeek() + " ,autoRotate:" + this.f73295f.isAutoRotate() + " ,isSmoothSwitchBitrate:" + this.f73295f.isSmoothSwitchBitrate() + " ,progressInterval:" + this.f73295f.getProgressInterval() + " ,maxBufferSize:" + this.f73295f.getMaxBufferSize() + " ,maxPreloadSize:" + this.f73295f.getMaxPreloadSize() + " ,overlayKey:" + this.f73295f.getOverlayKey() + " ,getOverlayIv:" + this.f73295f.getOverlayIv() + " ,enableRenderProcess:" + this.f73295f.isEnableRenderProcess() + " ,preferredResolution:" + this.f73295f.getPreferredResolution() + " mediaType:" + this.f73295f.getMediaType() + " ,preferredAudioTrack:" + this.f73295f.getPreferredAudioTrack() + " ,encryptedMp4Level:" + this.f73295f.getEncryptedMp4Level() + " ,header:" + this.f73295f.getHeaders() + " ,extInfoMap:" + this.f73295f.getExtInfoMap());
        this.f73294e.setConfig(c34813e);
    }

    /* JADX INFO: renamed from: c */
    public final void m75978c() {
        this.f73282O = false;
        m75940d(false);
    }

    /* JADX INFO: renamed from: d */
    private String m75938d(String str) {
        String str2;
        String str3;
        boolean z11;
        String str4;
        String string;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String[] strArrSplit;
        String str10;
        int i11;
        String str11 = str;
        String strTrim = str11.trim();
        String str12 = "";
        if (str11.contains("&oversign=")) {
            if (str11.contains("&oversign=")) {
                int iIndexOf = str11.indexOf("&oversign=");
                int iLastIndexOf = str11.lastIndexOf("&oversign=");
                String strSubstring = str11.substring(iIndexOf + 1, iLastIndexOf);
                if (TextUtils.isEmpty(strSubstring) || (strArrSplit = strSubstring.split("&")) == null || strArrSplit.length <= 0) {
                    str2 = "";
                } else {
                    String str13 = "";
                    String str14 = str13;
                    String str15 = str14;
                    String str16 = str15;
                    String str17 = str16;
                    int iIntValue = 0;
                    int i12 = 0;
                    int iIntValue2 = 0;
                    long jLongValue = 0;
                    while (i12 < strArrSplit.length) {
                        int iIndexOf2 = strArrSplit[i12].indexOf("=");
                        String[] strArr = strArrSplit;
                        if (iIndexOf2 >= 0) {
                            str10 = str12;
                            String strSubstring2 = strArr[i12].substring(0, iIndexOf2);
                            String str18 = strArr[i12];
                            i11 = i12;
                            String strSubstring3 = str18.substring(iIndexOf2 + 1, str18.length());
                            if (!TextUtils.isEmpty(strSubstring2) && !TextUtils.isEmpty(strSubstring3)) {
                                if (strSubstring2.equals("oversign")) {
                                    iIntValue2 = Integer.valueOf(strSubstring3).intValue();
                                } else if (strSubstring2.equals("o1")) {
                                    str16 = strSubstring3;
                                } else if (strSubstring2.equals("o2")) {
                                    str13 = strSubstring3;
                                } else if (strSubstring2.equals("o3")) {
                                    iIntValue = Integer.valueOf(strSubstring3).intValue();
                                } else if (strSubstring2.equals("o4")) {
                                    str14 = strSubstring3;
                                } else if (strSubstring2.equals("o5")) {
                                    str15 = strSubstring3;
                                } else if (strSubstring2.equals("o6")) {
                                    jLongValue = Long.valueOf(strSubstring3).longValue();
                                } else if (strSubstring2.equals("o7")) {
                                    str17 = strSubstring3;
                                }
                            }
                        } else {
                            str10 = str12;
                            i11 = i12;
                        }
                        i12 = i11 + 1;
                        strArrSplit = strArr;
                        str12 = str10;
                    }
                    str2 = str12;
                    if (!TextUtils.isEmpty(str14) && !TextUtils.isEmpty(str15)) {
                        String strM76425a = TXCHLSEncoder.m76425a(iIntValue2, str16, str13, iIntValue);
                        C34836c.b bVar = new C34836c.b();
                        bVar.f73966a = TXCHLSEncoder.m76428b(strM76425a, str14);
                        bVar.f73967b = TXCHLSEncoder.m76428b(strM76425a, str15);
                        this.f73308s = bVar;
                    }
                    long j11 = jLongValue;
                    if (j11 > 0) {
                        this.f73277J = j11;
                    }
                    if (!TextUtils.isEmpty(str17)) {
                        this.f73304o.put("TXC_DRM_KEY_URL", str17);
                        this.f73304o.put("TXC_DRM_PROVISION_URL", new TXPlayerDrmBuilder().getDeviceCertificateUrl());
                        this.f73304o.put("TXC_DRM_ENABLE", Boolean.TRUE);
                    }
                }
                if (iIndexOf > 0 && iIndexOf < iLastIndexOf) {
                    str11 = str11.substring(0, iIndexOf) + str11.substring(iLastIndexOf + 10);
                }
            } else {
                str2 = "";
            }
            strTrim = str11;
        } else {
            str2 = "";
        }
        if (strTrim.startsWith("http")) {
            strTrim = C34804a.m76216c(strTrim);
        }
        String strTrim2 = strTrim.trim();
        String str19 = this.f73303n;
        if (str19 != null) {
            strTrim2 = C34804a.m76213a(strTrim2, str19);
        }
        Uri uri = Uri.parse(strTrim2);
        String query = uri.getQuery();
        if (query == null || query.isEmpty()) {
            str3 = strTrim2;
            z11 = false;
            str4 = str2;
        } else {
            String[] strArrSplit2 = query.split("&");
            if (strArrSplit2.length > 0) {
                int length = strArrSplit2.length;
                str7 = str2;
                str8 = str7;
                str9 = str8;
                int i13 = 0;
                int i14 = 0;
                while (i13 < length) {
                    String str20 = strArrSplit2[i13];
                    String[] strArrSplit3 = str20.split("=");
                    String str21 = strTrim2;
                    if (strArrSplit3.length == 2) {
                        if ("spfileid".equalsIgnoreCase(strArrSplit3[0])) {
                            i14++;
                            str2 = strArrSplit3[1];
                        } else if ("spdrmtype".equalsIgnoreCase(strArrSplit3[0])) {
                            i14++;
                            str8 = strArrSplit3[1];
                        } else if ("spappid".equalsIgnoreCase(strArrSplit3[0])) {
                            i14++;
                            str9 = strArrSplit3[1];
                        } else {
                            if (!str7.isEmpty()) {
                                str7 = str7 + "&";
                            }
                            str7 = str7 + str20;
                        }
                    } else {
                        m75942e("fieldIds.length != 2");
                    }
                    i13++;
                    strTrim2 = str21;
                }
                str3 = strTrim2;
                if (i14 == 3) {
                    z11 = true;
                    str5 = "1";
                } else {
                    str5 = "0";
                    z11 = false;
                }
                str6 = str2;
            } else {
                str3 = strTrim2;
                str5 = "0";
                z11 = false;
                str6 = str2;
                str7 = str6;
                str8 = str7;
                str9 = str8;
            }
            if (z11) {
                m75980c("parsePlayUrl spfileid, " + str6 + ", spdrmtype= " + str8 + ", spappid=" + str9);
                C34833a c34833a = this.f73296g;
                c34833a.f73914u = str6;
                c34833a.f73877B = str8;
                c34833a.m76344a(str9);
                this.f73296g.f73913t = str5;
            }
            str4 = str7;
        }
        if (z11) {
            string = uri.buildUpon().clearQuery().build().toString();
            if (!str4.isEmpty()) {
                string = Uri.decode(uri.buildUpon().clearQuery().query(str4).build().toString());
            }
        } else {
            string = str3;
        }
        m75980c("parsePlayUrl url: ".concat(String.valueOf(string)));
        return string;
    }

    /* JADX INFO: renamed from: b */
    public final void m75977b(boolean z11) {
        this.f73313x = z11;
        TextureView textureViewSetByUser = TXCCloudVideoViewMethodInvoker.getTextureViewSetByUser(this.f73290a);
        if (textureViewSetByUser != null) {
            if (this.f73295f.isAutoRotate() && (this.f73294e.getMetaRotationDegree() == 90 || this.f73294e.getMetaRotationDegree() == 270)) {
                textureViewSetByUser.setScaleY(z11 ? -1.0f : 1.0f);
            } else {
                textureViewSetByUser.setScaleX(z11 ? -1.0f : 1.0f);
            }
        }
        C34833a c34833a = this.f73296g;
        if (c34833a != null) {
            c34833a.m76349b(z11);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m75981c(boolean z11) {
        if (this.f73270B == null || !this.f73282O) {
            return;
        }
        if (this.f73287T == null) {
            HandlerThread handlerThread = new HandlerThread("refreshLoopHandlerThread");
            handlerThread.start();
            this.f73287T = new a(handlerThread.getLooper());
        }
        if (z11) {
            this.f73285R.set(true);
            m75980c("enable video refresh loop");
            Message message = new Message();
            a aVar = this.f73287T;
            if (aVar != null) {
                aVar.sendMessage(message);
                return;
            }
            return;
        }
        this.f73285R.set(false);
        m75980c("disable video refresh loop");
    }

    /* JADX INFO: renamed from: b */
    public final void m75974b() {
        this.f73282O = true;
        m75940d(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public void m75934b(PixelFrame pixelFrame) {
        Object obj;
        Object obj2;
        try {
            if (this.f73282O) {
                if (this.f73281N == null && (obj2 = this.f73270B) != null) {
                    this.f73281N = new b(obj2);
                }
                b bVar = this.f73281N;
                if (bVar == null || (obj = this.f73270B) == null || pixelFrame == null) {
                    return;
                }
                bVar.m75994a(obj, pixelFrame);
            }
        } catch (Exception e11) {
            m75942e("sendCustomVideoData method error " + Log.getStackTraceString(e11));
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m75980c(String str) {
        LiteavLog.m76087i("TXCVodPlayer", "[" + hashCode() + "], " + str);
    }

    /* JADX INFO: renamed from: b */
    public static String m75932b(String str) {
        return TXCHLSEncoder.m76426a(str);
    }

    /* JADX INFO: renamed from: a */
    private void m75930a(Map<String, Object> map) {
        C34833a c34833a;
        if (map == null || map.isEmpty()) {
            return;
        }
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            if (TXVodConstants.VOD_KEY_CUSTOM_DATA.equals(key) && (value instanceof HashMap)) {
                Map map2 = (Map) value;
                for (Object obj : map2.keySet()) {
                    Object obj2 = map2.get(obj);
                    if ((obj instanceof String) && (obj2 instanceof String)) {
                        String str = (String) obj;
                        if (!TextUtils.isEmpty(str)) {
                            String str2 = (String) obj2;
                            if (!TextUtils.isEmpty(str2) && (c34833a = this.f73296g) != null) {
                                c34833a.m76345a(str, str2);
                            }
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final int m75963a(String str) {
        C34836c.b bVar;
        TXVodPlayConfig tXVodPlayConfig;
        if (str != null && !TextUtils.isEmpty(str)) {
            int i11 = this.f73305p;
            m75965a(false);
            this.f73305p = i11;
            this.f73296g = new C34833a(this.f73273F);
            m75980c("[TXCVodPlayCollection:" + this.f73296g.hashCode() + "], new TXCVodPlayCollection");
            String strM75938d = m75938d(str);
            C34833a c34833a = this.f73296g;
            c34833a.m76348b("setUrl: ".concat(String.valueOf(strM75938d)));
            c34833a.f73894a = strM75938d;
            this.f73296g.m76346a(this.f73299j);
            VodPlayerControl.nativeIncrementCheckCount();
            HouseBuilder.EnumC34768d enumC34768d = HouseBuilder.EnumC34768d.OK;
            HouseBuilder.EnumC34768d enumC34768dM76237a = C34811c.m76237a();
            if (enumC34768dM76237a != HouseBuilder.EnumC34768d.OK) {
                String str2 = "(-5," + enumC34768dM76237a.value + ")";
                m75942e("startPlay error, licence check failed" + str2 + "! click the link to apply trial licence: " + f73268E + " .Official licence requires payment.");
                Bundle bundle = new Bundle();
                bundle.putString("EVT_MSG", "VOD_PLAY_ERR_INVALID_LICENCE".concat(String.valueOf(str2)));
                m75924a(-5, bundle);
                new Event4XReporter(UGCDataReportDef.COMMAND_ID_DAU, 1004, "", true, 1).reportDau(JCommonConstants.RemoteWhat.ON_NETWORK_CONNECTED, 0, "");
                this.f73296g.m76341a();
                return -5;
            }
            this.f73309t = str;
            this.f73305p = this.f73305p;
            TXCloudVideoView tXCloudVideoView = this.f73290a;
            if (tXCloudVideoView != null) {
                tXCloudVideoView.clearLog();
                this.f73290a.setVisibility(0);
                if (TXCCloudVideoViewMethodInvoker.getTextureViewSetByUser(this.f73290a) == null) {
                    TextureRenderView textureRenderView = new TextureRenderView(this.f73290a.getContext());
                    this.f73290a.addVideoView(textureRenderView);
                    this.f73294e.setTextureRenderView(textureRenderView);
                }
                m75928a(this.f73290a, 0);
            } else {
                Surface surface = this.f73301l;
                if (surface != null) {
                    this.f73294e.setRenderSurface(surface);
                }
            }
            C34852d c34852d = this.f73269A;
            if (c34852d != null) {
                c34852d.m76459a(RunnableC34853e.m76461a(c34852d), "Start");
            }
            if (TextUtils.isEmpty(C34810b.m76231a()) && (tXVodPlayConfig = this.f73295f) != null) {
                C34810b.m76233a(tXVodPlayConfig.getCacheFolderPath());
            }
            TXVodPlayConfig tXVodPlayConfig2 = this.f73295f;
            if (tXVodPlayConfig2 != null) {
                m75930a(tXVodPlayConfig2.getExtInfoMap());
            }
            m75972a(this.f73295f);
            this.f73294e.setPrivateConfig(this.f73304o);
            this.f73297h = false;
            this.f73275H = false;
            this.f73294e.setStartTime(this.f73315z);
            this.f73294e.m76326d(this.f73298i);
            m75979c(this.f73305p);
            this.f73294e.setVideoPath(strM75938d);
            this.f73294e.setAutoPlay(this.f73299j);
            this.f73294e.setMute(this.f73310u);
            int i12 = this.f73311v;
            if (i12 >= 0) {
                this.f73294e.setAudioPlayoutVolume(i12);
            }
            this.f73294e.setAutoMaxBitrate(this.f73272D);
            m75967a(this.f73276I);
            m75976b(this.f73279L);
            m75969a(this.f73278K);
            m75977b(this.f73313x);
            this.f73294e.m76325c(false);
            this.f73296g.f73912s = this.f73294e.getPlayerType();
            if (this.f73282O) {
                m75974b();
            }
            if (this.f73283P) {
                m75982d();
            }
            m75980c(" startPlay url=" + strM75938d + " sdkVersion=" + CommonUtil.getSDKVersionStr());
            if (this.f73307r != null && (bVar = this.f73308s) != null && !TextUtils.isEmpty(bVar.f73966a)) {
                C34841a.m76410a().m76417a(this.f73307r.getAppId(), this.f73307r.getFileId(), this.f73308s, strM75938d);
            }
            try {
                Class.forName(new String(Base64.decode("Y29tLnRlbmNlbnQucWNsb3VkLnR1aXBsYXllci5jb3JlLlRVSVBsYXllckNvcmU=", 0)));
                m75973a("use_tuishort_com", "1");
            } catch (Exception unused) {
            }
            String strM76212a = C34804a.m76212a(this.f73309t);
            if (!TextUtils.isEmpty(strM76212a) && strM76212a.toLowerCase().endsWith("mpd")) {
                m75973a("use_dash", "1");
            }
            if (HttpDnsUtil.isEnableCustomHttpDNS()) {
                m75973a("use_httpdns", "1");
            }
            m75945h();
            Event4XReporter event4XReporter = new Event4XReporter(UGCDataReportDef.COMMAND_ID_DAU, 1004, "", true, 1);
            event4XReporter.reportDau(JCommonConstants.RemoteWhat.ON_NETWORK_CONNECTED, 0, "");
            C34833a c34833a2 = this.f73296g;
            c34833a2.f73915v = this.f73299j ? "autoPlay=1" : "autoPlay=0";
            c34833a2.m76341a();
            try {
                Class.forName("com.tencent.liteav.demo.play.SuperPlayerView");
                event4XReporter.reportDau(1556, 0, "");
            } catch (Exception unused2) {
            }
            return 0;
        }
        m75980c("startPlay playUrl is empty");
        return -1;
    }

    /* JADX INFO: renamed from: a */
    public static void m75928a(TXCloudVideoView tXCloudVideoView, int i11) {
        if (tXCloudVideoView == null) {
            return;
        }
        tXCloudVideoView.setVisibility(i11);
        TextureView textureViewSetByUser = TXCCloudVideoViewMethodInvoker.getTextureViewSetByUser(tXCloudVideoView);
        if (textureViewSetByUser == null) {
            return;
        }
        textureViewSetByUser.setVisibility(i11);
    }

    /* JADX INFO: renamed from: a */
    public final int m75965a(boolean z11) {
        this.f73302m = true;
        this.f73294e.m76315a();
        this.f73285R.set(false);
        a aVar = this.f73287T;
        if (aVar != null) {
            aVar.removeCallbacksAndMessages(null);
            this.f73287T.getLooper().quitSafely();
            this.f73287T = null;
        }
        this.f73277J = -1L;
        C34837d c34837d = this.f73312w;
        if (c34837d != null) {
            c34837d.m76393a(null);
            this.f73312w = null;
        }
        C34852d c34852d = this.f73269A;
        if (c34852d != null) {
            c34852d.m76460a(true);
        }
        TXCloudVideoView tXCloudVideoView = this.f73290a;
        if (tXCloudVideoView != null && TXCCloudVideoViewMethodInvoker.getTextureViewSetByUser(tXCloudVideoView) != null && z11) {
            m75928a(this.f73290a, 8);
            this.f73290a.removeVideoView();
        }
        C34833a c34833a = this.f73296g;
        if (c34833a != null) {
            c34833a.m76350c();
        }
        this.f73305p = -1000;
        C34851c c34851c = this.f73284Q;
        if (c34851c != null) {
            c34851c.m76441a();
            this.f73284Q = null;
        }
        TXSubtitleView tXSubtitleView = this.f73271C;
        if (tXSubtitleView != null) {
            tXSubtitleView.show(null);
        }
        return 0;
    }

    /* JADX INFO: renamed from: a */
    public final void m75968a(float f11, boolean z11) {
        C34833a c34833a;
        this.f73294e.m76317a((int) (f11 * 1000.0f), z11);
        if (!this.f73297h || (c34833a = this.f73296g) == null) {
            return;
        }
        c34833a.m76354f();
    }

    /* JADX INFO: renamed from: a */
    public final void m75969a(int i11) {
        this.f73278K = i11;
        if (i11 == 1) {
            this.f73294e.setRenderMode(0);
        } else {
            this.f73294e.setRenderMode(1);
        }
        C34852d c34852d = this.f73269A;
        if (c34852d != null) {
            c34852d.m76458a(GLConstants.GLScaleType.m76483a(i11));
        }
    }

    /* JADX INFO: renamed from: a */
    public final List<TXTrackInfo> m75966a() {
        TPTrackInfo[] trackInfo = this.f73294e.getTrackInfo();
        if (trackInfo != null && trackInfo.length != 0) {
            ArrayList arrayList = new ArrayList();
            m75929a(arrayList, trackInfo);
            return arrayList;
        }
        return new ArrayList(0);
    }

    /* JADX INFO: renamed from: a */
    public static List<TXTrackInfo> m75923a(List<TXTrackInfo> list, int i11) {
        ArrayList arrayList = new ArrayList();
        for (TXTrackInfo tXTrackInfo : list) {
            if (tXTrackInfo.getTrackType() == i11) {
                arrayList.add(tXTrackInfo);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: a */
    private static void m75929a(List<TXTrackInfo> list, TPTrackInfo[] tPTrackInfoArr) {
        for (int i11 = 0; i11 < tPTrackInfoArr.length; i11++) {
            TPTrackInfo tPTrackInfo = tPTrackInfoArr[i11];
            TXTrackInfo tXTrackInfo = new TXTrackInfo();
            tXTrackInfo.trackIndex = i11;
            tXTrackInfo.trackType = tPTrackInfo.trackType;
            tXTrackInfo.name = tPTrackInfo.name;
            tXTrackInfo.language = tPTrackInfo.language;
            tXTrackInfo.isSelected = tPTrackInfo.isSelected;
            tXTrackInfo.isExclusive = tPTrackInfo.isExclusive;
            tXTrackInfo.isInternal = tPTrackInfo.isInternal;
            list.add(tXTrackInfo);
        }
    }

    /* JADX INFO: renamed from: a */
    public static TXVodDef.TXVodSubtitleData m75922a(TPSubtitleData tPSubtitleData) {
        TXVodDef.TXVodSubtitleData tXVodSubtitleData = new TXVodDef.TXVodSubtitleData();
        tXVodSubtitleData.subtitleData = tPSubtitleData.subtitleData;
        tXVodSubtitleData.durationMs = tPSubtitleData.durationMs;
        tXVodSubtitleData.startPositionMs = tPSubtitleData.startPositionMs;
        tXVodSubtitleData.trackIndex = tPSubtitleData.trackIndex;
        return tXVodSubtitleData;
    }

    /* JADX INFO: renamed from: a */
    public final void m75967a(float f11) {
        this.f73276I = f11;
        this.f73294e.setRate(f11);
        C34833a c34833a = this.f73296g;
        if (c34833a != null) {
            c34833a.m76342a(f11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m75924a(int i11, Bundle bundle) {
        TXVodPlayer tXVodPlayer;
        TXVodPlayer tXVodPlayer2;
        if (i11 == 15001) {
            ITXLivePlayListener iTXLivePlayListener = this.f73291b;
            if (iTXLivePlayListener != null) {
                iTXLivePlayListener.onNetStatus(bundle);
            }
            ITXVodPlayListener iTXVodPlayListener = this.f73292c;
            if (iTXVodPlayListener == null || (tXVodPlayer2 = this.f73293d) == null) {
                return;
            }
            iTXVodPlayListener.onNetStatus(tXVodPlayer2, bundle);
            return;
        }
        ITXLivePlayListener iTXLivePlayListener2 = this.f73291b;
        if (iTXLivePlayListener2 != null) {
            iTXLivePlayListener2.onPlayEvent(i11, bundle);
        }
        ITXVodPlayListener iTXVodPlayListener2 = this.f73292c;
        if (iTXVodPlayListener2 == null || (tXVodPlayer = this.f73293d) == null) {
            return;
        }
        iTXVodPlayListener2.onPlayEvent(tXVodPlayer, i11, bundle);
    }

    @Override // com.tencent.liteav.txcvodplayer.renderer.C34852d.a
    /* JADX INFO: renamed from: a */
    public final void mo75970a(SurfaceTexture surfaceTexture) {
        Surface surface = new Surface(surfaceTexture);
        this.f73301l = surface;
        this.f73294e.setRenderSurface(surface);
    }

    @Override // com.tencent.liteav.txcvodplayer.renderer.C34852d.a
    /* JADX INFO: renamed from: a */
    public final void mo75971a(PixelFrame pixelFrame) {
        if (this.f73282O) {
            this.f73286S = pixelFrame;
            m75934b(pixelFrame);
        }
    }

    /* JADX INFO: renamed from: a */
    public final int m75964a(String str, String str2, String str3, String str4, C34836c.b bVar) {
        this.f73304o.put("TXC_DRM_KEY_URL", str2);
        this.f73304o.put("TXC_DRM_PROVISION_URL", str3);
        this.f73304o.put("TXC_DRM_SIMPLE_AES_URL", str4);
        this.f73304o.put("TXC_DRM_ENABLE", Boolean.TRUE);
        this.f73308s = bVar;
        m75973a("use_drm", "1");
        return m75963a(str);
    }

    /* JADX INFO: renamed from: a */
    public final void m75973a(String str, String str2) {
        C34833a c34833a = this.f73296g;
        if (c34833a == null) {
            this.f73274G.put(str, str2);
        } else {
            c34833a.m76345a(str, str2);
        }
    }
}
