package com.tencent.liteav.txcvodplayer;

import android.content.Context;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.View;
import android.widget.FrameLayout;
import androidx.webkit.ProxyConfig;
import cn.jiguang.privates.analysis.constants.JAnalysisConstants;
import com.tencent.bugly.library.MonitorCallback;
import com.tencent.bugly.proguard.C33978va;
import com.tencent.bugly.proguard.InterfaceC33730j9;
import com.tencent.liteav.base.Log;
import com.tencent.liteav.base.system.LiteavSystemInfo;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.liteav.sdk.common.HouseBuilder;
import com.tencent.liteav.txcplayer.C34813e;
import com.tencent.liteav.txcplayer.C34814f;
import com.tencent.liteav.txcplayer.ITXVCubePlayer;
import com.tencent.liteav.txcplayer.InterfaceC34812d;
import com.tencent.liteav.txcplayer.common.C34811c;
import com.tencent.liteav.txcplayer.ext.service.RenderProcessService;
import com.tencent.liteav.txcplayer.model.C34815a;
import com.tencent.liteav.txcplayer.model.C34816b;
import com.tencent.liteav.txcplayer.model.TXSubtitleRenderModel;
import com.tencent.liteav.txcvodplayer.renderer.InterfaceC34849a;
import com.tencent.liteav.txcvodplayer.renderer.SurfaceRenderView;
import com.tencent.liteav.txcvodplayer.renderer.TextureRenderView;
import com.tencent.qcloud.tuicore.TUIConstants;
import com.tencent.rtmp.TXVodConstants;
import com.tencent.thumbplayer.tcmedia.api.TPPlayerMsg;
import com.tencent.thumbplayer.tcmedia.api.TPSubtitleData;
import com.tencent.thumbplayer.tcmedia.api.TPSubtitleFrameBuffer;
import com.tencent.thumbplayer.tcmedia.api.TPTrackInfo;
import java.io.FileNotFoundException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes59.dex */
public class TXCVodVideoView extends FrameLayout {

    /* JADX INFO: renamed from: af */
    private static volatile boolean f73788af = true;

    /* JADX INFO: renamed from: ag */
    private static volatile boolean f73789ag;

    /* JADX INFO: renamed from: j */
    public static volatile boolean f73790j;

    /* JADX INFO: renamed from: k */
    public static volatile boolean f73791k;

    /* JADX INFO: renamed from: A */
    private int f73792A;

    /* JADX INFO: renamed from: B */
    private int f73793B;

    /* JADX INFO: renamed from: C */
    private long f73794C;

    /* JADX INFO: renamed from: D */
    private long f73795D;

    /* JADX INFO: renamed from: E */
    private int f73796E;

    /* JADX INFO: renamed from: F */
    private boolean f73797F;

    /* JADX INFO: renamed from: G */
    private Context f73798G;

    /* JADX INFO: renamed from: H */
    private Map<String, Object> f73799H;

    /* JADX INFO: renamed from: I */
    private InterfaceC34849a f73800I;

    /* JADX INFO: renamed from: J */
    private int f73801J;

    /* JADX INFO: renamed from: K */
    private int f73802K;

    /* JADX INFO: renamed from: L */
    private String f73803L;

    /* JADX INFO: renamed from: M */
    private float f73804M;

    /* JADX INFO: renamed from: N */
    private long f73805N;

    /* JADX INFO: renamed from: O */
    private long f73806O;

    /* JADX INFO: renamed from: P */
    private volatile boolean f73807P;

    /* JADX INFO: renamed from: Q */
    private int f73808Q;

    /* JADX INFO: renamed from: R */
    private int f73809R;

    /* JADX INFO: renamed from: S */
    private float f73810S;

    /* JADX INFO: renamed from: T */
    private boolean f73811T;

    /* JADX INFO: renamed from: U */
    private int f73812U;

    /* JADX INFO: renamed from: V */
    private int f73813V;

    /* JADX INFO: renamed from: W */
    private int f73814W;

    /* JADX INFO: renamed from: a */
    public int f73815a;

    /* JADX INFO: renamed from: aa */
    private int f73816aa;

    /* JADX INFO: renamed from: ab */
    private boolean f73817ab;

    /* JADX INFO: renamed from: ac */
    private ITXVCubePlayer.InterfaceC34794b f73818ac;

    /* JADX INFO: renamed from: ad */
    private TXSubtitleRenderModel f73819ad;

    /* JADX INFO: renamed from: ae */
    private ITXVCubePlayer.InterfaceC34801i f73820ae;

    /* JADX INFO: renamed from: ah */
    private String f73821ah;

    /* JADX INFO: renamed from: ai */
    private int f73822ai;

    /* JADX INFO: renamed from: aj */
    private CopyOnWriteArrayList<TPTrackInfo> f73823aj;

    /* JADX INFO: renamed from: ak */
    private ITXVCubePlayer.InterfaceC34796d f73824ak;

    /* JADX INFO: renamed from: al */
    private ITXVCubePlayer.InterfaceC34798f f73825al;

    /* JADX INFO: renamed from: am */
    private int f73826am;

    /* JADX INFO: renamed from: an */
    private ITXVCubePlayer.InterfaceC34797e f73827an;

    /* JADX INFO: renamed from: ao */
    private ITXVCubePlayer.InterfaceC34800h f73828ao;

    /* JADX INFO: renamed from: ap */
    private ITXVCubePlayer.InterfaceC34801i f73829ap;

    /* JADX INFO: renamed from: aq */
    private ITXVCubePlayer.InterfaceC34794b f73830aq;

    /* JADX INFO: renamed from: ar */
    private int f73831ar;

    /* JADX INFO: renamed from: as */
    private InterfaceC34812d f73832as;

    /* JADX INFO: renamed from: at */
    private boolean f73833at;

    /* JADX INFO: renamed from: b */
    public int f73834b;

    /* JADX INFO: renamed from: c */
    public ITXVCubePlayer f73835c;

    /* JADX INFO: renamed from: d */
    public C34813e f73836d;

    /* JADX INFO: renamed from: e */
    protected boolean f73837e;

    /* JADX INFO: renamed from: f */
    protected final int f73838f;

    /* JADX INFO: renamed from: g */
    public Object f73839g;

    /* JADX INFO: renamed from: h */
    public Object f73840h;

    /* JADX INFO: renamed from: i */
    public List<C34832b> f73841i;

    /* JADX INFO: renamed from: l */
    public boolean f73842l;

    /* JADX INFO: renamed from: m */
    public String f73843m;

    /* JADX INFO: renamed from: n */
    public int f73844n;

    /* JADX INFO: renamed from: o */
    public int f73845o;

    /* JADX INFO: renamed from: p */
    public Map<String, Object> f73846p;

    /* JADX INFO: renamed from: q */
    ITXVCubePlayer.InterfaceC34802j f73847q;

    /* JADX INFO: renamed from: r */
    ITXVCubePlayer.InterfaceC34799g f73848r;

    /* JADX INFO: renamed from: s */
    RenderProcessService.IRenderServiceEventListener f73849s;

    /* JADX INFO: renamed from: t */
    InterfaceC34849a.a f73850t;

    /* JADX INFO: renamed from: u */
    public Handler f73851u;

    /* JADX INFO: renamed from: v */
    private InterfaceC34849a.b f73852v;

    /* JADX INFO: renamed from: w */
    private int f73853w;

    /* JADX INFO: renamed from: x */
    private int f73854x;

    /* JADX INFO: renamed from: y */
    private int f73855y;

    /* JADX INFO: renamed from: z */
    private int f73856z;

    /* JADX INFO: renamed from: com.tencent.liteav.txcvodplayer.TXCVodVideoView$a */
    public static class HandlerC34831a extends Handler {

        /* JADX INFO: renamed from: a */
        private final WeakReference<TXCVodVideoView> f73871a;

        /* JADX INFO: renamed from: b */
        private final int f73872b;

        /* JADX INFO: renamed from: a */
        private void m76335a(TXCVodVideoView tXCVodVideoView, boolean z11) {
            if (tXCVodVideoView == null || tXCVodVideoView.f73832as == null) {
                return;
            }
            long currentPosition = tXCVodVideoView.getCurrentPosition();
            Bundle bundle = new Bundle();
            long bufferDuration = tXCVodVideoView.getBufferDuration();
            long duration = tXCVodVideoView.getDuration();
            if (z11) {
                currentPosition = duration;
            }
            bundle.putInt("EVT_PLAY_PROGRESS", (int) (currentPosition / 1000));
            bundle.putInt("EVT_PLAY_DURATION", (int) (duration / 1000));
            bundle.putInt(TXVodConstants.EVT_PLAYABLE_DURATION, (int) (bufferDuration / 1000));
            bundle.putInt("EVT_PLAY_PROGRESS_MS", (int) currentPosition);
            bundle.putInt("EVT_PLAY_DURATION_MS", (int) duration);
            bundle.putInt("EVT_PLAYABLE_DURATION_MS", (int) bufferDuration);
            if (TXCVodVideoView.f73790j && tXCVodVideoView.f73835c != null) {
                bundle.putLong(TXVodConstants.EVT_PLAY_PDT_TIME_MS, tXCVodVideoView.f73835c.getPdtTimeMs(currentPosition));
            }
            if (tXCVodVideoView.f73835c != null) {
                bundle.putFloat("EVT_PLAYABLE_RATE", tXCVodVideoView.f73835c.getRate());
            }
            if (tXCVodVideoView.f73835c != null) {
                if (tXCVodVideoView.f73836d.f73750l <= 0) {
                    tXCVodVideoView.f73836d.f73750l = 500;
                }
                removeMessages(103);
                if (!z11) {
                    sendEmptyMessageDelayed(103, tXCVodVideoView.f73836d.f73750l);
                }
            }
            tXCVodVideoView.f73832as.mo75990a(2005, bundle);
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            TXCVodVideoView tXCVodVideoView = this.f73871a.get();
            if (tXCVodVideoView == null || tXCVodVideoView.f73832as == null) {
                return;
            }
            switch (message.what) {
                case 100:
                    if (tXCVodVideoView.f73835c != null) {
                        try {
                            float propertyLong = tXCVodVideoView.f73835c.getPropertyLong(206);
                            long currentPosition = tXCVodVideoView.f73835c.getCurrentPosition();
                            float propertyLong2 = currentPosition > 0 ? (tXCVodVideoView.f73835c.getPropertyLong(208) * 1000) / currentPosition : 0.0f;
                            long propertyLong3 = tXCVodVideoView.f73835c.getPropertyLong(302);
                            long propertyLong4 = tXCVodVideoView.f73835c.getPropertyLong(301);
                            long propertyLong5 = tXCVodVideoView.f73835c.getPropertyLong(303);
                            Bundle bundle = new Bundle();
                            long propertyLong6 = tXCVodVideoView.f73835c.getPropertyLong(202);
                            long propertyLong7 = tXCVodVideoView.f73835c.getPropertyLong(101);
                            bundle.putLong("VIDEO_BITRATE", propertyLong6);
                            bundle.putLong("AUDIO_BITRATE", propertyLong7);
                            bundle.putFloat(MonitorCallback.EVENT_FPS, propertyLong);
                            bundle.putFloat("dps", propertyLong2);
                            bundle.putLong("cachedBytes", propertyLong3);
                            bundle.putLong("bitRate", propertyLong4);
                            bundle.putLong("tcpSpeed", propertyLong5);
                            tXCVodVideoView.f73832as.mo75991a(bundle);
                            removeMessages(100);
                            sendEmptyMessageDelayed(100, 500L);
                        } catch (Exception e11) {
                            LiteavLog.m76083e("TXCVodVideoView", "MSG_UPDATE_NET_STATUS exception : " + e11.getMessage());
                            return;
                        }
                        break;
                    }
                    break;
                case 101:
                    int i11 = message.arg1;
                    if (i11 == 2003) {
                        TXCVodVideoView.m76243B(tXCVodVideoView);
                    } else if (i11 == 2006) {
                        m76335a(tXCVodVideoView, true);
                    } else if (i11 == 2019 && tXCVodVideoView.f73834b == 3 && tXCVodVideoView.f73815a != 3) {
                        tXCVodVideoView.m76255a(2004, 0, "Playback started");
                        tXCVodVideoView.f73815a = 3;
                        sendEmptyMessage(100);
                        sendEmptyMessage(103);
                    }
                    tXCVodVideoView.f73832as.mo75990a(i11, message.getData());
                    RenderProcessService.getInstance().sendPlayerEventToPlugin(tXCVodVideoView.f73835c, i11, message.getData());
                    break;
                case 102:
                    tXCVodVideoView.m76283e(true);
                    tXCVodVideoView.m76255a(2103, 0, "VOD network reconnected");
                    break;
                case 103:
                    m76335a(tXCVodVideoView, false);
                    break;
            }
        }

        public HandlerC34831a(TXCVodVideoView tXCVodVideoView, Looper looper) {
            super(looper);
            this.f73872b = 500;
            this.f73871a = new WeakReference<>(tXCVodVideoView);
        }
    }

    public TXCVodVideoView(Context context) {
        super(context);
        this.f73815a = 0;
        this.f73834b = 0;
        this.f73852v = null;
        this.f73835c = null;
        this.f73797F = false;
        this.f73804M = 1.0f;
        this.f73837e = true;
        this.f73838f = 2;
        this.f73807P = false;
        this.f73808Q = -1;
        this.f73809R = 100;
        this.f73810S = -100.0f;
        this.f73811T = false;
        this.f73812U = -1000;
        this.f73813V = -1;
        this.f73814W = -1000;
        this.f73816aa = -1;
        this.f73839g = new Object();
        this.f73840h = null;
        this.f73842l = false;
        this.f73844n = 0;
        this.f73845o = -1;
        this.f73846p = null;
        this.f73822ai = -1;
        this.f73847q = new ITXVCubePlayer.InterfaceC34802j() { // from class: com.tencent.liteav.txcvodplayer.TXCVodVideoView.7
            @Override // com.tencent.liteav.txcplayer.ITXVCubePlayer.InterfaceC34802j
            /* JADX INFO: renamed from: a */
            public final void mo76211a(ITXVCubePlayer iTXVCubePlayer, int i11, int i12, String str) {
                boolean z11 = (TXCVodVideoView.this.f73854x != i12 && Math.abs(TXCVodVideoView.this.f73854x - i12) > 16) || (TXCVodVideoView.this.f73853w != i11 && Math.abs(TXCVodVideoView.this.f73853w - i11) > 16);
                TXCVodVideoView.this.f73853w = iTXVCubePlayer.getVideoWidth();
                TXCVodVideoView.this.f73854x = iTXVCubePlayer.getVideoHeight();
                TXCVodVideoView.this.f73801J = iTXVCubePlayer.getVideoSarNum();
                TXCVodVideoView.this.f73802K = iTXVCubePlayer.getVideoSarDen();
                ArrayList<C34815a> supportedBitrates = TXCVodVideoView.this.getSupportedBitrates();
                if (supportedBitrates != null) {
                    long j11 = 2147483647L;
                    for (C34815a c34815a : supportedBitrates) {
                        long jAbs = Math.abs((TXCVodVideoView.this.f73853w * TXCVodVideoView.this.f73854x) - (c34815a.f73767b * c34815a.f73768c));
                        if (jAbs < j11) {
                            TXCVodVideoView.this.f73805N = ((long) c34815a.f73767b) * ((long) c34815a.f73768c);
                            j11 = jAbs;
                        }
                    }
                }
                long propertyLong = TXCVodVideoView.this.f73835c.getPropertyLong(205);
                TXCVodVideoView.this.m76318a("OnVideoSizeChangedListener width:" + TXCVodVideoView.this.f73853w + ":height:" + TXCVodVideoView.this.f73854x + ":SarNum:" + TXCVodVideoView.this.f73801J + ":SarDen:" + TXCVodVideoView.this.f73802K + ":videoRotationDegree:" + propertyLong);
                if (TXCVodVideoView.this.f73853w != 0 && TXCVodVideoView.this.f73854x != 0) {
                    if (TXCVodVideoView.this.f73800I != null) {
                        TXCVodVideoView.this.f73800I.mo76430a(TXCVodVideoView.this.f73853w, TXCVodVideoView.this.f73854x);
                        TXCVodVideoView.this.f73800I.mo76433b(TXCVodVideoView.this.f73801J, TXCVodVideoView.this.f73802K);
                    }
                    TXCVodVideoView.this.requestLayout();
                }
                if (!z11) {
                    if (TXCVodVideoView.this.f73797F || str == null) {
                        return;
                    }
                    Message message = new Message();
                    message.what = 101;
                    message.arg1 = 2009;
                    Bundle bundle = new Bundle();
                    String str2 = i11 + "," + i12 + "," + str;
                    bundle.putString(TUIConstants.TUIPlugin.PLUGIN_DESCRIPTION, "Resolution change:" + TXCVodVideoView.this.f73853w + ProxyConfig.MATCH_ALL_SCHEMES + TXCVodVideoView.this.f73854x + " Crop(width,height,crop_left,crop_top,crop_right,crop_bottom):(" + str2 + ")");
                    bundle.putInt("EVT_PARAM1", TXCVodVideoView.this.f73853w);
                    bundle.putInt("EVT_PARAM2", TXCVodVideoView.this.f73854x);
                    bundle.putString("EVT_PARAM3", str2);
                    bundle.putLong(TXVodConstants.EVT_KEY_VIDEO_ROTATION, propertyLong);
                    message.setData(bundle);
                    if (TXCVodVideoView.this.f73851u != null) {
                        TXCVodVideoView.this.f73851u.sendMessage(message);
                        return;
                    }
                    return;
                }
                Message message2 = new Message();
                message2.what = 101;
                message2.arg1 = 2009;
                Bundle bundle2 = new Bundle();
                bundle2.putInt("EVT_PARAM1", TXCVodVideoView.this.f73853w);
                bundle2.putInt("EVT_PARAM2", TXCVodVideoView.this.f73854x);
                if (TXCVodVideoView.this.f73797F || str == null) {
                    bundle2.putString(TUIConstants.TUIPlugin.PLUGIN_DESCRIPTION, "Resolution change:" + TXCVodVideoView.this.f73853w + ProxyConfig.MATCH_ALL_SCHEMES + TXCVodVideoView.this.f73854x);
                } else {
                    String str3 = i11 + "," + i12 + "," + str;
                    bundle2.putString(TUIConstants.TUIPlugin.PLUGIN_DESCRIPTION, "Resolution change:" + TXCVodVideoView.this.f73853w + ProxyConfig.MATCH_ALL_SCHEMES + TXCVodVideoView.this.f73854x + " Crop(width,height,crop_left,crop_top,crop_right,crop_bottom):(" + str3 + ")");
                    bundle2.putString("EVT_PARAM3", str3);
                }
                bundle2.putLong(TXVodConstants.EVT_KEY_VIDEO_ROTATION, propertyLong);
                message2.setData(bundle2);
                if (TXCVodVideoView.this.f73851u != null) {
                    TXCVodVideoView.this.f73851u.sendMessage(message2);
                }
            }
        };
        this.f73848r = new ITXVCubePlayer.InterfaceC34799g() { // from class: com.tencent.liteav.txcvodplayer.TXCVodVideoView.8
            @Override // com.tencent.liteav.txcplayer.ITXVCubePlayer.InterfaceC34799g
            /* JADX INFO: renamed from: a */
            public final void mo76209a(ITXVCubePlayer iTXVCubePlayer) {
                if (RenderProcessService.getInstance().setSurfaceBufferSize(iTXVCubePlayer)) {
                    TXCVodVideoView.this.m76318a("setSurfaceBufferSize succeed");
                }
                if (C34811c.m76238a(HouseBuilder.EnumC34765a.PLAYER_PREMIUM)) {
                    TXCVodVideoView.m76280d();
                    TXCVodVideoView.this.m76318a("has advanced license!");
                }
                if (!TXCVodVideoView.f73790j) {
                    TXCVodVideoView.this.f73835c.checkSubtitle();
                }
                TXCVodVideoView.m76298j(TXCVodVideoView.this);
                if (TXCVodVideoView.this.f73815a == 1) {
                    TXCVodVideoView.this.m76255a(2013, 0, "VOD ready(EVT_VOD_PLAY_PREPARED)");
                    if (!TXCVodVideoView.this.f73836d.f73754p) {
                        TXCVodVideoView.this.f73834b = 4;
                    } else if (TXCVodVideoView.this.f73834b != 4) {
                        TXCVodVideoView.this.f73834b = 3;
                    }
                    TXCVodVideoView.this.f73815a = 2;
                }
                TXCVodVideoView.m76301m(TXCVodVideoView.this);
                if (TXCVodVideoView.this.f73815a == -1) {
                    TXCVodVideoView.this.f73815a = 3;
                    TXCVodVideoView.this.f73834b = 3;
                }
                TXCVodVideoView.this.f73853w = iTXVCubePlayer.getVideoWidth();
                TXCVodVideoView.this.f73854x = iTXVCubePlayer.getVideoHeight();
                if (TXCVodVideoView.this.f73853w != 0 && TXCVodVideoView.this.f73854x != 0 && TXCVodVideoView.this.f73800I != null) {
                    TXCVodVideoView.this.f73800I.mo76430a(TXCVodVideoView.this.f73853w, TXCVodVideoView.this.f73854x);
                    TXCVodVideoView.this.f73800I.mo76433b(TXCVodVideoView.this.f73801J, TXCVodVideoView.this.f73802K);
                }
                if (TXCVodVideoView.this.f73834b == 3) {
                    TXCVodVideoView.this.m76325c(false);
                }
            }
        };
        this.f73824ak = new ITXVCubePlayer.InterfaceC34796d() { // from class: com.tencent.liteav.txcvodplayer.TXCVodVideoView.9
            @Override // com.tencent.liteav.txcplayer.ITXVCubePlayer.InterfaceC34796d
            /* JADX INFO: renamed from: a */
            public final void mo76206a() {
                TXCVodVideoView.this.f73815a = 5;
                TXCVodVideoView.this.f73834b = 5;
                TXCVodVideoView.this.m76255a(2006, 0, "Playback completed");
            }
        };
        this.f73825al = new ITXVCubePlayer.InterfaceC34798f() { // from class: com.tencent.liteav.txcvodplayer.TXCVodVideoView.10
            @Override // com.tencent.liteav.txcplayer.ITXVCubePlayer.InterfaceC34798f
            /* JADX INFO: renamed from: a */
            public final boolean mo76208a(int i11, int i12, int i13, Object obj) {
                if (i11 == -2303) {
                    TXCVodVideoView.this.f73815a = -1;
                    TXCVodVideoView.this.f73834b = -1;
                    TXCVodVideoView.this.m76255a(i11, 0, "file not found");
                    TXCVodVideoView.this.m76315a();
                    return true;
                }
                if (i11 == 1006) {
                    if (!TextUtils.isEmpty(TXCVodVideoView.this.f73803L) || obj == null || !(obj instanceof TPPlayerMsg.TPDownLoadProgressInfo)) {
                        return true;
                    }
                    try {
                        TXCVodVideoView.this.f73803L = new JSONObject(((TPPlayerMsg.TPDownLoadProgressInfo) obj).extraInfo).optString("cdnip");
                        return true;
                    } catch (Exception e11) {
                        e11.printStackTrace();
                        return true;
                    }
                }
                if (i11 == 2007) {
                    TXCVodVideoView.this.m76255a(i11, 0, "Buffer started");
                    return true;
                }
                if (i11 == 2011) {
                    TXCVodVideoView.this.m76318a("EVT_VIDEO_CHANGE_ROTATION: ".concat(String.valueOf(i12)));
                    TXCVodVideoView.this.f73793B = i12;
                    if (TXCVodVideoView.this.f73836d.f73735B && TXCVodVideoView.this.f73793B > 0) {
                        TXCVodVideoView tXCVodVideoView = TXCVodVideoView.this;
                        tXCVodVideoView.f73792A = tXCVodVideoView.f73793B;
                        if (TXCVodVideoView.this.f73800I != null) {
                            TXCVodVideoView.this.f73800I.setVideoRotation(TXCVodVideoView.this.f73792A);
                        }
                    }
                    TXCVodVideoView tXCVodVideoView2 = TXCVodVideoView.this;
                    String str = "Video angle " + TXCVodVideoView.this.f73793B;
                    int unused = TXCVodVideoView.this.f73793B;
                    tXCVodVideoView2.m76255a(2011, 0, str);
                    return true;
                }
                TPPlayerMsg.TPVideoSeiInfo tPVideoSeiInfo = null;
                str = null;
                String str2 = null;
                tPVideoSeiInfo = null;
                if (i11 == 2014) {
                    TXCVodVideoView.this.m76255a(i11, 0, "Buffer ended");
                    if (i12 != 0) {
                        String str3 = TXCVodVideoView.this.f73836d.f73755q;
                        if (TextUtils.isEmpty(str3) && str3.endsWith("m3u8")) {
                            return true;
                        }
                    }
                    if (TXCVodVideoView.this.f73834b != 3) {
                        return true;
                    }
                    TXCVodVideoView tXCVodVideoView3 = TXCVodVideoView.this;
                    tXCVodVideoView3.m76256a(2004, 0, "Playback started", (Bundle) null, tXCVodVideoView3.f73839g);
                    TXCVodVideoView.this.f73815a = 3;
                    TXCVodVideoView.this.f73851u.sendEmptyMessage(100);
                    TXCVodVideoView.this.f73851u.sendEmptyMessage(103);
                    return true;
                }
                if (i11 == 2020) {
                    int iLongValue = (int) ((obj == null || !(obj instanceof Long)) ? -1L : ((Long) obj).longValue());
                    TXCVodVideoView.m76261a(TXCVodVideoView.this, iLongValue, i13);
                    TXCVodVideoView.m76274b(TXCVodVideoView.this, iLongValue, i13);
                    return true;
                }
                if (i11 == 2026) {
                    TXCVodVideoView.this.m76255a(i11, 0, "Audio first play");
                    return true;
                }
                if (i11 == 2030) {
                    if (!TXCVodVideoView.f73790j) {
                        return false;
                    }
                    if (obj != null && (obj instanceof TPPlayerMsg.TPVideoSeiInfo)) {
                        tPVideoSeiInfo = (TPPlayerMsg.TPVideoSeiInfo) obj;
                    }
                    if (tPVideoSeiInfo == null) {
                        TXCVodVideoView.this.m76321b("VOD_PLAY_EVT_VIDEO_SEI, seiInfo is null");
                        return false;
                    }
                    Bundle bundle = new Bundle();
                    bundle.putInt(TXVodConstants.EVT_KEY_SEI_TYPE, tPVideoSeiInfo.videoSeiType);
                    bundle.putInt(TXVodConstants.EVT_KEY_SEI_SIZE, tPVideoSeiInfo.seiDataSize);
                    bundle.putByteArray(TXVodConstants.EVT_KEY_SEI_DATA, tPVideoSeiInfo.seiData);
                    TXCVodVideoView.this.m76257a(TXVodConstants.VOD_PLAY_EVT_VIDEO_SEI, bundle);
                    return true;
                }
                if (i11 == 2002) {
                    TXCVodVideoView.this.m76255a(i11, 0, "hit cache");
                    return true;
                }
                if (i11 == 2003) {
                    TXCVodVideoView.this.m76318a("EVT_RENDER_FIRST_I_FRAME");
                    if (TXCVodVideoView.this.f73842l) {
                        Bundle bundle2 = new Bundle();
                        if (TextUtils.isEmpty(TXCVodVideoView.this.f73843m) || !TXCVodVideoView.this.f73843m.equals(TXCVodVideoView.this.f73836d.f73755q)) {
                            bundle2.putString("support_hevc", "1");
                        } else {
                            bundle2.putString("support_hevc", "0");
                        }
                        TXCVodVideoView.this.m76256a(i11, 0, "VOD displayed the first frame", bundle2, Boolean.FALSE);
                    } else {
                        TXCVodVideoView.this.m76255a(i11, 0, "VOD displayed the first frame");
                    }
                    TXCVodVideoView tXCVodVideoView4 = TXCVodVideoView.this;
                    tXCVodVideoView4.setRate(tXCVodVideoView4.f73804M);
                    TXCVodVideoView.m76305q(TXCVodVideoView.this);
                    return true;
                }
                switch (i11) {
                    case TXVodConstants.VOD_PLAY_EVT_TCP_CONNECT_SUCC /* 2016 */:
                        if (obj != null && (obj instanceof String)) {
                            TXCVodVideoView.this.f73803L = (String) obj;
                        }
                        String str4 = "TCP Connect ServerIp:" + TXCVodVideoView.this.f73803L + ",port:" + i12 + ",error:" + i13;
                        TXCVodVideoView.this.m76318a(str4);
                        if (i13 != 0) {
                            return true;
                        }
                        TXCVodVideoView.this.m76255a(i11, 0, str4);
                        return true;
                    case TXVodConstants.VOD_PLAY_EVT_FIRST_VIDEO_PACKET /* 2017 */:
                        TXCVodVideoView.this.m76255a(i11, 0, "Video data received");
                        return true;
                    case TXVodConstants.VOD_PLAY_EVT_DNS_RESOLVED /* 2018 */:
                        if (obj != null && (obj instanceof String)) {
                            str2 = (String) obj;
                        }
                        String str5 = "dns resolved url:" + str2 + ",error:" + i12;
                        TXCVodVideoView.this.m76318a(str5);
                        if (i12 != 0) {
                            return true;
                        }
                        TXCVodVideoView.this.m76255a(i11, 0, str5);
                        return true;
                    default:
                        return true;
                }
            }
        };
        this.f73827an = new ITXVCubePlayer.InterfaceC34797e() { // from class: com.tencent.liteav.txcvodplayer.TXCVodVideoView.11
            @Override // com.tencent.liteav.txcplayer.ITXVCubePlayer.InterfaceC34797e
            /* JADX INFO: renamed from: a */
            public final boolean mo76207a(int i11, int i12) {
                TXCVodVideoView.this.m76321b("[onError] vodErrorEvent: " + i11 + " ,errorCode: " + i12);
                TXCVodVideoView.this.f73815a = -1;
                if (i11 == -6101) {
                    TXCVodVideoView.this.f73834b = -1;
                    if (TXCVodVideoView.this.f73799H != null) {
                        Object obj = TXCVodVideoView.this.f73799H.get("TXC_DRM_SIMPLE_AES_URL");
                        if ((obj instanceof String) && !TextUtils.isEmpty((String) obj)) {
                            TXCVodVideoView.this.f73799H.put("TXC_DRM_KEY_URL", null);
                            TXCVodVideoView.this.f73799H.put("TXC_DRM_PROVISION_URL", null);
                            if (!TXCVodVideoView.this.m76290g()) {
                                TXCVodVideoView.this.m76322b(false);
                            }
                            return true;
                        }
                    }
                    TXCVodVideoView.this.m76255a(TXVodConstants.VOD_PLAY_ERR_DRM, i12, "DRM play failed cause by " + i12 + C33978va.f72339h);
                    return true;
                }
                if (i11 != -6004) {
                    switch (i11) {
                        case TXVodConstants.VOD_PLAY_ERR_PROCESS_VIDEO_FAIL /* -6010 */:
                        case TXVodConstants.VOD_PLAY_ERR_RENDER_FAIL /* -6009 */:
                        case TXVodConstants.VOD_PLAY_ERR_DECODE_SUBTITLE_FAIL /* -6008 */:
                        case TXVodConstants.VOD_PLAY_ERR_DECODE_AUDIO_FAIL /* -6007 */:
                            break;
                        case TXVodConstants.VOD_PLAY_ERR_DECODE_VIDEO_FAIL /* -6006 */:
                            TXCVodVideoView.this.f73834b = -1;
                            TXCVodVideoView.m76313y(TXCVodVideoView.this);
                            break;
                        default:
                            switch (i11) {
                                case -2305:
                                    TXCVodVideoView.this.f73834b = -1;
                                    TXCVodVideoView.m76314z(TXCVodVideoView.this);
                                    break;
                                case -2304:
                                    TXCVodVideoView.this.f73834b = -1;
                                    TXCVodVideoView.m76312x(TXCVodVideoView.this);
                                    break;
                                case -2303:
                                    TXCVodVideoView.this.f73834b = -1;
                                    TXCVodVideoView.this.m76255a(-2303, i12, "The file does not exist");
                                    TXCVodVideoView.this.m76315a();
                                    break;
                                default:
                                    long currentPosition = TXCVodVideoView.this.getCurrentPosition() - TXCVodVideoView.this.f73806O;
                                    if (currentPosition < 0 || currentPosition > 500) {
                                        TXCVodVideoView.m76243B(TXCVodVideoView.this);
                                    }
                                    TXCVodVideoView tXCVodVideoView = TXCVodVideoView.this;
                                    tXCVodVideoView.f73806O = tXCVodVideoView.getCurrentPosition();
                                    if (TXCVodVideoView.m76244C(TXCVodVideoView.this) >= TXCVodVideoView.this.f73836d.f73739a) {
                                        TXCVodVideoView.this.f73834b = -1;
                                        TXCVodVideoView.this.m76255a(-2301, i12, "Disconnected from the network. Playback error");
                                        TXCVodVideoView.this.m76315a();
                                    } else {
                                        if (TXCVodVideoView.this.f73834b != 4) {
                                            TXCVodVideoView.this.f73834b = -1;
                                        }
                                        if (TXCVodVideoView.this.f73851u != null) {
                                            if (TXCVodVideoView.this.f73822ai != -1) {
                                                TXCVodVideoView tXCVodVideoView2 = TXCVodVideoView.this;
                                                TXCVodVideoView.m76274b(tXCVodVideoView2, tXCVodVideoView2.f73822ai, i11);
                                            }
                                            TXCVodVideoView.this.f73851u.sendEmptyMessageDelayed(102, (long) (TXCVodVideoView.this.f73836d.f73740b * 1000.0f));
                                        }
                                    }
                                    break;
                            }
                            break;
                    }
                    return true;
                }
                TXCVodVideoView.this.f73834b = -1;
                TXCVodVideoView.this.m76255a(i11, i12, TXCVodVideoView.m76272b(i11));
                TXCVodVideoView.this.m76315a();
                return true;
            }
        };
        this.f73828ao = new ITXVCubePlayer.InterfaceC34800h() { // from class: com.tencent.liteav.txcvodplayer.TXCVodVideoView.12
            @Override // com.tencent.liteav.txcplayer.ITXVCubePlayer.InterfaceC34800h
            /* JADX INFO: renamed from: a */
            public final void mo76210a() {
                TXCVodVideoView.m76246E(TXCVodVideoView.this);
                TXCVodVideoView.this.m76255a(TXVodConstants.VOD_PLAY_EVT_SEEK_COMPLETE, 0, "seek complete");
            }
        };
        this.f73829ap = new ITXVCubePlayer.InterfaceC34801i() { // from class: com.tencent.liteav.txcvodplayer.TXCVodVideoView.13
            @Override // com.tencent.liteav.txcplayer.ITXVCubePlayer.InterfaceC34801i
            /* JADX INFO: renamed from: a */
            public final void mo75993a(ITXVCubePlayer iTXVCubePlayer, TPSubtitleData tPSubtitleData) {
                if (TXCVodVideoView.f73790j && TXCVodVideoView.this.f73820ae != null) {
                    TXCVodVideoView.this.f73820ae.mo75993a(iTXVCubePlayer, tPSubtitleData);
                }
            }
        };
        this.f73830aq = new ITXVCubePlayer.InterfaceC34794b() { // from class: com.tencent.liteav.txcvodplayer.TXCVodVideoView.2
            @Override // com.tencent.liteav.txcplayer.ITXVCubePlayer.InterfaceC34794b
            /* JADX INFO: renamed from: a */
            public final void mo75992a(ITXVCubePlayer iTXVCubePlayer, TPSubtitleFrameBuffer tPSubtitleFrameBuffer) {
                if (tPSubtitleFrameBuffer == null || TXCVodVideoView.this.f73818ac == null) {
                    return;
                }
                TXCVodVideoView.this.f73818ac.mo75992a(iTXVCubePlayer, tPSubtitleFrameBuffer);
            }
        };
        this.f73849s = new RenderProcessService.IRenderServiceEventListener() { // from class: com.tencent.liteav.txcvodplayer.TXCVodVideoView.3
            @Override // com.tencent.liteav.txcplayer.ext.service.RenderProcessService.IRenderServiceEventListener
            public final void onRenderServiceEvent(ITXVCubePlayer iTXVCubePlayer, int i11, Bundle bundle) {
                TXCVodVideoView.this.m76257a(i11, bundle);
            }
        };
        this.f73850t = new InterfaceC34849a.a() { // from class: com.tencent.liteav.txcvodplayer.TXCVodVideoView.4
            @Override // com.tencent.liteav.txcvodplayer.renderer.InterfaceC34849a.a
            /* JADX INFO: renamed from: a */
            public final void mo76332a(InterfaceC34849a.b bVar, int i11, int i12) {
                if (bVar.mo76327a() != TXCVodVideoView.this.f73800I) {
                    TXCVodVideoView.this.m76321b("onSurfaceChanged: unmatched render callback");
                    return;
                }
                TXCVodVideoView.this.m76318a("onSurfaceChanged");
                TXCVodVideoView.this.f73855y = i11;
                TXCVodVideoView.this.f73856z = i12;
                boolean z11 = true;
                boolean z12 = TXCVodVideoView.this.f73834b == 3;
                if (TXCVodVideoView.this.f73800I.mo76432a() && (TXCVodVideoView.this.f73853w != i11 || TXCVodVideoView.this.f73854x != i12)) {
                    z11 = false;
                }
                if (TXCVodVideoView.this.f73835c != null && z12 && z11 && TXCVodVideoView.this.f73834b == 3) {
                    TXCVodVideoView.this.m76325c(false);
                }
            }

            @Override // com.tencent.liteav.txcvodplayer.renderer.InterfaceC34849a.a
            /* JADX INFO: renamed from: b */
            public final void mo76334b(InterfaceC34849a.b bVar) {
                if (bVar.mo76327a() != TXCVodVideoView.this.f73800I) {
                    TXCVodVideoView.this.m76321b("onSurfaceDestroyed: unmatched render callback");
                    return;
                }
                TXCVodVideoView.this.m76318a("onSurfaceDestroyed");
                TXCVodVideoView.this.f73797F = false;
                TXCVodVideoView.this.f73852v = null;
                if (TXCVodVideoView.this.f73835c != null) {
                    TXCVodVideoView.this.f73835c.setSurface(null);
                }
                TXCVodVideoView.this.m76319a(false);
            }

            @Override // com.tencent.liteav.txcvodplayer.renderer.InterfaceC34849a.a
            /* JADX INFO: renamed from: a */
            public final void mo76331a(InterfaceC34849a.b bVar) {
                if (bVar.mo76327a() != TXCVodVideoView.this.f73800I) {
                    TXCVodVideoView.this.m76321b("onSurfaceCreated: unmatched render callback");
                    return;
                }
                TXCVodVideoView.this.m76318a("onSurfaceCreated");
                TXCVodVideoView.this.f73797F = true;
                TXCVodVideoView.this.f73852v = bVar;
                if (TXCVodVideoView.this.f73835c == null) {
                    TXCVodVideoView.this.m76290g();
                } else {
                    TXCVodVideoView tXCVodVideoView = TXCVodVideoView.this;
                    tXCVodVideoView.m76260a(tXCVodVideoView.f73835c, bVar);
                }
            }

            @Override // com.tencent.liteav.txcvodplayer.renderer.InterfaceC34849a.a
            /* JADX INFO: renamed from: a */
            public final boolean mo76333a(MotionEvent motionEvent) {
                return RenderProcessService.getInstance().onTouchEvent(TXCVodVideoView.this.f73835c, motionEvent);
            }
        };
        this.f73831ar = 0;
        this.f73833at = false;
        m76258a(context);
    }

    /* JADX INFO: renamed from: B */
    public static /* synthetic */ int m76243B(TXCVodVideoView tXCVodVideoView) {
        tXCVodVideoView.f73826am = 0;
        return 0;
    }

    /* JADX INFO: renamed from: E */
    public static /* synthetic */ boolean m76246E(TXCVodVideoView tXCVodVideoView) {
        tXCVodVideoView.f73807P = false;
        return false;
    }

    /* JADX INFO: renamed from: q */
    public static /* synthetic */ boolean m76305q(TXCVodVideoView tXCVodVideoView) {
        tXCVodVideoView.f73817ab = true;
        return true;
    }

    public C34816b getMediaInfo() {
        try {
            ITXVCubePlayer iTXVCubePlayer = this.f73835c;
            if (iTXVCubePlayer == null) {
                return null;
            }
            return iTXVCubePlayer.getMediaInfo();
        } catch (Throwable th2) {
            th2.printStackTrace();
            return null;
        }
    }

    public int getPlayerType() {
        return 2;
    }

    /* JADX INFO: renamed from: com.tencent.liteav.txcvodplayer.TXCVodVideoView$b */
    public static class C34832b {

        /* JADX INFO: renamed from: a */
        public String f73873a;

        /* JADX INFO: renamed from: b */
        public String f73874b;

        /* JADX INFO: renamed from: c */
        public String f73875c;

        public C34832b(String str, String str2, String str3) {
            this.f73873a = str;
            this.f73874b = str2;
            this.f73875c = str3;
        }
    }

    /* JADX INFO: renamed from: C */
    public static /* synthetic */ int m76244C(TXCVodVideoView tXCVodVideoView) {
        int i11 = tXCVodVideoView.f73826am;
        tXCVodVideoView.f73826am = i11 + 1;
        return i11;
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ void m76298j(TXCVodVideoView tXCVodVideoView) {
        TPTrackInfo[] trackInfo;
        if (!f73790j || tXCVodVideoView.f73823aj.isEmpty() || (trackInfo = tXCVodVideoView.getTrackInfo()) == null || trackInfo.length == 0) {
            return;
        }
        for (int i11 = 0; i11 < trackInfo.length; i11++) {
            TPTrackInfo tPTrackInfo = trackInfo[i11];
            Iterator<TPTrackInfo> it = tXCVodVideoView.f73823aj.iterator();
            while (it.hasNext()) {
                if (TextUtils.equals(tPTrackInfo.name, it.next().name) && !tPTrackInfo.isSelected) {
                    tXCVodVideoView.m76316a(i11);
                    tXCVodVideoView.m76318a("select external subtitle track on prepared when replay, index: " + i11 + " ,name:" + tPTrackInfo.name + " ,vod=" + tXCVodVideoView.hashCode());
                }
            }
        }
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ long m76301m(TXCVodVideoView tXCVodVideoView) {
        tXCVodVideoView.f73795D = 0L;
        return 0L;
    }

    public int getBitrateIndex() {
        int i11 = this.f73812U;
        if (i11 == -1) {
            return i11;
        }
        ITXVCubePlayer iTXVCubePlayer = this.f73835c;
        if (iTXVCubePlayer != null) {
            this.f73812U = iTXVCubePlayer.getBitrateIndex();
        }
        return this.f73812U;
    }

    public long getBufferDuration() {
        ITXVCubePlayer iTXVCubePlayer = this.f73835c;
        if (iTXVCubePlayer == null) {
            return 0L;
        }
        long playableDurationMs = iTXVCubePlayer.getPlayableDurationMs();
        long currentPosition = getCurrentPosition();
        if (this.f73815a == 3) {
            this.f73794C = currentPosition;
        }
        if (playableDurationMs < currentPosition) {
            playableDurationMs = currentPosition;
        }
        return Math.abs(((long) getDuration()) - playableDurationMs) < 1000 ? getDuration() : playableDurationMs;
    }

    public long getCurrentPosition() {
        int i11;
        if (this.f73807P && (i11 = this.f73808Q) >= 0) {
            return i11;
        }
        long currentPosition = this.f73795D;
        if (currentPosition <= 0) {
            ITXVCubePlayer iTXVCubePlayer = this.f73835c;
            currentPosition = iTXVCubePlayer != null ? iTXVCubePlayer.getCurrentPosition() : 0L;
        }
        if (this.f73836d.f73747i) {
            return currentPosition;
        }
        int i12 = this.f73808Q;
        return currentPosition < ((long) i12) ? i12 : currentPosition;
    }

    public int getDuration() {
        int duration;
        ITXVCubePlayer iTXVCubePlayer = this.f73835c;
        if (iTXVCubePlayer != null && (duration = (int) iTXVCubePlayer.getDuration()) > 0) {
            this.f73796E = duration;
        }
        return this.f73796E;
    }

    public int getMetaRotationDegree() {
        return this.f73793B;
    }

    public String getServerIp() {
        return this.f73803L;
    }

    public ArrayList<C34815a> getSupportedBitrates() {
        try {
            ITXVCubePlayer iTXVCubePlayer = this.f73835c;
            return iTXVCubePlayer != null ? iTXVCubePlayer.getSupportedBitrates() : new ArrayList<>();
        } catch (Throwable th2) {
            th2.printStackTrace();
            return new ArrayList<>();
        }
    }

    public TPTrackInfo[] getTrackInfo() {
        ITXVCubePlayer iTXVCubePlayer = this.f73835c;
        if (iTXVCubePlayer != null) {
            return iTXVCubePlayer.getTrackInfo();
        }
        return null;
    }

    public int getVideoHeight() {
        return this.f73854x;
    }

    public int getVideoWidth() {
        return this.f73853w;
    }

    public void setAudioNormalization(float f11) {
        if (C34811c.m76238a(HouseBuilder.EnumC34765a.PLAYER_PREMIUM)) {
            float f12 = this.f73810S;
            if (f12 == f11) {
                return;
            }
            boolean z11 = f12 == 1.0f;
            this.f73810S = f11;
            m76318a("setAudioNormalization: ".concat(String.valueOf(f11)));
            ITXVCubePlayer iTXVCubePlayer = this.f73835c;
            if (iTXVCubePlayer != null) {
                iTXVCubePlayer.setAudioNormalization(f11);
                if (z11 || this.f73795D != 0) {
                    return;
                }
                long currentPosition = this.f73835c.getCurrentPosition();
                if (currentPosition > 0) {
                    ITXVCubePlayer iTXVCubePlayer2 = this.f73835c;
                    C34813e c34813e = this.f73836d;
                    iTXVCubePlayer2.seekTo(currentPosition, c34813e != null ? c34813e.f73747i : false);
                }
            }
        }
    }

    public void setAudioPlayoutVolume(int i11) {
        if (i11 > 0) {
            this.f73809R = i11;
        }
        ITXVCubePlayer iTXVCubePlayer = this.f73835c;
        if (iTXVCubePlayer != null) {
            iTXVCubePlayer.setAudioVolume(i11);
        }
    }

    public void setAutoMaxBitrate(int i11) {
        this.f73816aa = i11;
        ITXVCubePlayer iTXVCubePlayer = this.f73835c;
        if (iTXVCubePlayer == null || i11 <= 0) {
            return;
        }
        iTXVCubePlayer.setAutoMaxBitrate(i11);
    }

    public void setAutoPlay(boolean z11) {
        this.f73836d.f73754p = z11;
    }

    public void setConfig(C34813e c34813e) {
        C34813e c34813e2 = this.f73836d;
        String str = c34813e2 != null ? c34813e2.f73755q : null;
        if (c34813e != null) {
            this.f73836d = c34813e;
            if (TextUtils.isEmpty(str)) {
                return;
            }
            this.f73836d.f73755q = str;
        }
    }

    public void setListener(InterfaceC34812d interfaceC34812d) {
        this.f73832as = interfaceC34812d;
    }

    public void setMute(boolean z11) {
        this.f73811T = z11;
        ITXVCubePlayer iTXVCubePlayer = this.f73835c;
        if (iTXVCubePlayer == null) {
            return;
        }
        if (z11) {
            iTXVCubePlayer.setAudioVolume(0);
        } else {
            iTXVCubePlayer.setAudioVolume(this.f73809R);
        }
    }

    public void setPrivateConfig(Map<String, Object> map) {
        this.f73799H = map;
        ITXVCubePlayer iTXVCubePlayer = this.f73835c;
        if (iTXVCubePlayer != null) {
            iTXVCubePlayer.setPrivateConfig(map);
        }
    }

    public void setRender(int i11) {
        if (i11 == 0) {
            setRenderView(null);
            return;
        }
        if (i11 == 1) {
            setRenderView(new SurfaceRenderView(this.f73798G));
            return;
        }
        if (i11 != 2) {
            m76318a(String.format(Locale.getDefault(), "invalid render %d\n", Integer.valueOf(i11)));
            return;
        }
        TextureRenderView textureRenderView = new TextureRenderView(this.f73798G);
        if (this.f73835c != null) {
            textureRenderView.getSurfaceHolder().mo76328a(this.f73835c);
            textureRenderView.mo76430a(this.f73835c.getVideoWidth(), this.f73835c.getVideoHeight());
            textureRenderView.mo76433b(this.f73835c.getVideoSarNum(), this.f73835c.getVideoSarDen());
            textureRenderView.setAspectRatio(this.f73831ar);
        }
        setRenderView(textureRenderView);
    }

    public void setRenderMode(int i11) {
        this.f73831ar = i11;
        InterfaceC34849a interfaceC34849a = this.f73800I;
        if (interfaceC34849a != null) {
            interfaceC34849a.setAspectRatio(i11);
        }
        InterfaceC34849a interfaceC34849a2 = this.f73800I;
        if (interfaceC34849a2 != null) {
            interfaceC34849a2.setVideoRotation(this.f73792A);
        }
    }

    public void setRenderSurface(final Surface surface) {
        InterfaceC34849a.b bVar = new InterfaceC34849a.b() { // from class: com.tencent.liteav.txcvodplayer.TXCVodVideoView.1
            @Override // com.tencent.liteav.txcvodplayer.renderer.InterfaceC34849a.b
            /* JADX INFO: renamed from: a */
            public final void mo76328a(ITXVCubePlayer iTXVCubePlayer) {
                iTXVCubePlayer.setSurface(surface);
            }

            @Override // com.tencent.liteav.txcvodplayer.renderer.InterfaceC34849a.b
            /* JADX INFO: renamed from: b */
            public final Surface mo76329b() {
                return null;
            }

            @Override // com.tencent.liteav.txcvodplayer.renderer.InterfaceC34849a.b
            /* JADX INFO: renamed from: a */
            public final InterfaceC34849a mo76327a() {
                return TXCVodVideoView.this.f73800I;
            }

            @Override // com.tencent.liteav.txcvodplayer.renderer.InterfaceC34849a.b
            /* JADX INFO: renamed from: c */
            public final Surface mo76330c() {
                return surface;
            }
        };
        this.f73852v = bVar;
        ITXVCubePlayer iTXVCubePlayer = this.f73835c;
        if (iTXVCubePlayer != null) {
            m76260a(iTXVCubePlayer, bVar);
        }
    }

    public void setStartTime(float f11) {
        this.f73795D = (long) (f11 * 1000.0f);
    }

    public void setSubtitleStyle(TXSubtitleRenderModel tXSubtitleRenderModel) {
        this.f73819ad = tXSubtitleRenderModel;
        ITXVCubePlayer iTXVCubePlayer = this.f73835c;
        if (iTXVCubePlayer != null) {
            iTXVCubePlayer.setSubtitleStyle(tXSubtitleRenderModel);
        }
    }

    public void setTXCOnSubtitleDataListener(ITXVCubePlayer.InterfaceC34801i interfaceC34801i) {
        this.f73820ae = interfaceC34801i;
    }

    public void setTXCOnSubtitleFrameDataListener(ITXVCubePlayer.InterfaceC34794b interfaceC34794b) {
        this.f73818ac = interfaceC34794b;
    }

    public void setVideoRotationDegree(int i11) {
        if (i11 != 0 && i11 != 90 && i11 != 180 && i11 != 270) {
            if (i11 != 360) {
                m76321b("not support degree ".concat(String.valueOf(i11)));
                return;
            }
            i11 = 0;
        }
        this.f73792A = i11;
        InterfaceC34849a interfaceC34849a = this.f73800I;
        if (interfaceC34849a != null) {
            interfaceC34849a.setVideoRotation(i11);
        }
        InterfaceC34849a interfaceC34849a2 = this.f73800I;
        if (interfaceC34849a2 != null) {
            interfaceC34849a2.setAspectRatio(this.f73831ar);
        }
    }

    public void setVideoURI(Uri uri) {
        if (uri != null) {
            this.f73836d.f73755q = uri.toString();
            if (f73790j && this.f73842l && !TextUtils.isEmpty(this.f73843m) && !f73788af && f73789ag) {
                C34813e c34813e = this.f73836d;
                c34813e.f73737D = this.f73844n;
                c34813e.f73755q = this.f73843m;
                m76292h();
            }
        }
        this.f73796E = 0;
        this.f73808Q = -1;
        this.f73826am = 0;
        this.f73803L = null;
        m76318a("setVideoURI: ".concat(String.valueOf(uri)));
        m76290g();
        requestLayout();
        invalidate();
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ boolean m76280d() {
        f73790j = true;
        return true;
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ boolean m76287f() {
        f73788af = false;
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public boolean m76290g() {
        ITXVCubePlayer iTXVCubePlayer;
        m76318a("openVideo");
        if (TextUtils.isEmpty(this.f73836d.f73755q)) {
            return false;
        }
        m76322b(false);
        if (this.f73837e) {
            ((AudioManager) this.f73798G.getSystemService("audio")).requestAudioFocus(null, 3, 2);
        }
        try {
            this.f73835c = C34814f.m76240a(this.f73798G);
            m76318a("[ThumbMediaPlayer:" + this.f73835c.hashCode() + "] , createMediaPlayer");
            Object obj = this.f73840h;
            if (obj != null && (iTXVCubePlayer = this.f73835c) != null) {
                iTXVCubePlayer.attachTRTC(obj);
            }
            if (this.f73845o < 0 && !this.f73836d.f73736C) {
                this.f73835c.setEnableRenderProcess(false);
            } else {
                this.f73835c.setEnableRenderProcess(true);
            }
            C34813e c34813e = this.f73836d;
            String str = c34813e.f73755q;
            c34813e.f73753o = this.f73795D;
            int i11 = this.f73814W;
            if (i11 >= 0) {
                c34813e.f73757s = i11;
            }
            int i12 = this.f73813V;
            if (i12 >= 0) {
                c34813e.f73756r = i12;
            }
            long j11 = this.f73805N;
            if (j11 > 0) {
                c34813e.f73758t = j11;
            }
            int i13 = this.f73812U;
            if (i13 == -1) {
                c34813e.f73764z = true;
                this.f73835c.enableAdaptiveBitrate();
            } else {
                c34813e.f73764z = false;
                this.f73835c.setBitrateIndex(i13);
            }
            if (!TextUtils.isEmpty(this.f73821ah)) {
                this.f73836d.f73738E = this.f73821ah;
            }
            this.f73835c.setPrivateConfig(this.f73799H);
            this.f73835c.setConfig(this.f73836d);
            int i14 = this.f73816aa;
            if (i14 > 0) {
                this.f73835c.setAutoMaxBitrate(i14);
            }
            if (this.f73836d.f73746h != null) {
                this.f73835c.setDataSource(this.f73798G, Uri.parse(str), this.f73836d.f73746h);
            } else {
                this.f73835c.setDataSource(str);
            }
            List<C34832b> list = this.f73841i;
            if (list != null && !list.isEmpty()) {
                for (C34832b c34832b : this.f73841i) {
                    this.f73835c.addSubtitleSource(c34832b.f73873a, c34832b.f73874b, c34832b.f73875c);
                }
            }
            TXSubtitleRenderModel tXSubtitleRenderModel = this.f73819ad;
            if (tXSubtitleRenderModel != null) {
                this.f73835c.setSubtitleStyle(tXSubtitleRenderModel);
            }
            this.f73835c.setOnPreparedListener(this.f73848r);
            this.f73835c.setOnVideoSizeChangedListener(this.f73847q);
            this.f73835c.setOnCompletionListener(this.f73824ak);
            this.f73835c.setOnErrorListener(this.f73827an);
            this.f73835c.setOnInfoListener(this.f73825al);
            this.f73835c.setOnSeekCompleteListener(this.f73828ao);
            this.f73835c.setOnSubtitleDataListener(this.f73829ap);
            this.f73835c.setOnGetTXCVodVideoViewTargetState(new ITXVCubePlayer.InterfaceC34793a() { // from class: com.tencent.liteav.txcvodplayer.TXCVodVideoView.6
                @Override // com.tencent.liteav.txcplayer.ITXVCubePlayer.InterfaceC34793a
                /* JADX INFO: renamed from: a */
                public final int mo76205a() {
                    return TXCVodVideoView.this.f73834b;
                }
            });
            this.f73835c.setOnSubtitleFrameDataListener(this.f73830aq);
            m76260a(this.f73835c, this.f73852v);
            this.f73835c.setAudioStreamType(3);
            this.f73835c.setScreenOnWhilePlaying(true);
            this.f73835c.prepareAsync();
            this.f73835c.setAudioVolume(this.f73809R);
            float f11 = this.f73810S;
            if (f11 != -100.0f) {
                this.f73835c.setAudioNormalization(f11);
            }
            setMute(this.f73811T);
            this.f73815a = 1;
        } catch (FileNotFoundException unused) {
            this.f73815a = -1;
            this.f73834b = -1;
            this.f73827an.mo76207a(-2303, -2303);
        } catch (Exception e11) {
            m76321b(Log.getStackTraceString(e11));
            this.f73815a = -1;
            this.f73834b = -1;
            this.f73827an.mo76207a(TXVodConstants.VOD_PLAY_ERR_UNKNOW, 0);
        }
        return true;
    }

    /* JADX INFO: renamed from: h */
    private void m76292h() {
        m76255a(2031, 0, "Vod HEVC downgrade playback");
    }

    /* JADX INFO: renamed from: i */
    private void m76296i() {
        ITXVCubePlayer iTXVCubePlayer = this.f73835c;
        if (iTXVCubePlayer != null) {
            iTXVCubePlayer.setOnPreparedListener(null);
            this.f73835c.setOnVideoSizeChangedListener(null);
            this.f73835c.setOnCompletionListener(null);
            this.f73835c.setOnErrorListener(null);
            this.f73835c.setOnInfoListener(null);
            this.f73835c.setOnBufferingUpdateListener(null);
            this.f73835c.setOnSeekCompleteListener(null);
            this.f73835c.setOnSubtitleDataListener(null);
            this.f73835c.setOnGetTXCVodVideoViewTargetState(null);
            this.f73835c.setOnSubtitleFrameDataListener(null);
        }
    }

    /* JADX INFO: renamed from: x */
    public static /* synthetic */ void m76312x(TXCVodVideoView tXCVodVideoView) {
        tXCVodVideoView.m76318a("onHevcVideoDecoderError");
        f73789ag = true;
        if (!f73790j) {
            f73790j = C34811c.m76238a(HouseBuilder.EnumC34765a.PLAYER_PREMIUM);
            tXCVodVideoView.m76318a("has advanced license!");
        }
        if (f73790j && !TextUtils.isEmpty(tXCVodVideoView.f73843m) && !tXCVodVideoView.f73836d.f73755q.equals(tXCVodVideoView.f73843m)) {
            C34813e c34813e = tXCVodVideoView.f73836d;
            c34813e.f73755q = tXCVodVideoView.f73843m;
            c34813e.f73737D = tXCVodVideoView.f73844n;
            long j11 = c34813e.f73753o;
            if (j11 > 0) {
                tXCVodVideoView.f73795D = j11;
            }
            tXCVodVideoView.m76292h();
            if (!tXCVodVideoView.m76290g()) {
                tXCVodVideoView.m76322b(false);
                return;
            }
            return;
        }
        tXCVodVideoView.m76255a(-2304, 0, "Vod H265 decoding failed");
    }

    /* JADX INFO: renamed from: y */
    public static /* synthetic */ void m76313y(TXCVodVideoView tXCVodVideoView) {
        tXCVodVideoView.m76318a("onError onVideoDecoderError");
        if (tXCVodVideoView.f73815a != 4 && f73790j && !TextUtils.isEmpty(tXCVodVideoView.f73843m) && !tXCVodVideoView.f73836d.f73755q.equals(tXCVodVideoView.f73843m)) {
            C34813e c34813e = tXCVodVideoView.f73836d;
            c34813e.f73755q = tXCVodVideoView.f73843m;
            c34813e.f73737D = tXCVodVideoView.f73844n;
            long j11 = c34813e.f73753o;
            if (j11 > 0) {
                tXCVodVideoView.f73795D = j11;
            }
            tXCVodVideoView.m76292h();
            if (!tXCVodVideoView.m76290g()) {
                tXCVodVideoView.m76322b(false);
                return;
            }
            return;
        }
        if (!tXCVodVideoView.f73817ab && tXCVodVideoView.f73836d.f73742d) {
            if (Math.min(tXCVodVideoView.f73854x, tXCVodVideoView.f73853w) < 1080) {
                C34813e c34813e2 = tXCVodVideoView.f73836d;
                if (c34813e2.f73742d) {
                    c34813e2.f73742d = false;
                    tXCVodVideoView.m76283e(false);
                    return;
                }
                return;
            }
            return;
        }
        tXCVodVideoView.m76255a(TXVodConstants.VOD_PLAY_ERR_DECODE_VIDEO_FAIL, 0, "VOD decoding failed");
    }

    /* JADX INFO: renamed from: z */
    public static /* synthetic */ void m76314z(TXCVodVideoView tXCVodVideoView) {
        tXCVodVideoView.m76318a("onHLSKeyError");
        tXCVodVideoView.m76255a(-2305, 0, "HLS decypt key get failed");
        ITXVCubePlayer iTXVCubePlayer = tXCVodVideoView.f73835c;
        if (iTXVCubePlayer != null) {
            try {
                iTXVCubePlayer.stop();
            } catch (Exception e11) {
                tXCVodVideoView.m76321b("onHLSKeyError stop Exception: " + e11.getMessage());
            }
            tXCVodVideoView.f73835c.release();
            tXCVodVideoView.f73835c = null;
        }
        tXCVodVideoView.f73815a = -1;
        tXCVodVideoView.f73834b = -1;
    }

    public void setBitrateIndex(int i11) {
        m76318a("setBitrateIndex: ".concat(String.valueOf(i11)));
        if (getBitrateIndex() != i11 && i11 != -1000) {
            this.f73812U = i11;
            if (this.f73815a != 5) {
                try {
                    ArrayList<C34815a> supportedBitrates = getSupportedBitrates();
                    if (supportedBitrates != null && supportedBitrates.size() > 0 && i11 != -1) {
                        for (C34815a c34815a : supportedBitrates) {
                            if (c34815a != null && c34815a.f73766a == i11) {
                                this.f73813V = c34815a.f73769d;
                                this.f73814W = i11;
                                break;
                            }
                        }
                    }
                    ITXVCubePlayer iTXVCubePlayer = this.f73835c;
                    if (iTXVCubePlayer != null) {
                        if (this.f73836d.f73748j && i11 != -1 && iTXVCubePlayer.getBitrateIndex() != -1) {
                            this.f73835c.setBitrateIndex(i11);
                        } else {
                            m76283e(false);
                        }
                    }
                } catch (Throwable th2) {
                    th2.printStackTrace();
                }
            }
        }
    }

    public void setRate(float f11) {
        m76318a("setRate: ".concat(String.valueOf(f11)));
        ITXVCubePlayer iTXVCubePlayer = this.f73835c;
        if (iTXVCubePlayer != null) {
            iTXVCubePlayer.setRate(f11);
        }
        this.f73804M = f11;
    }

    public void setRenderView(InterfaceC34849a interfaceC34849a) {
        int i11;
        int i12;
        m76318a("setRenderView: ".concat(String.valueOf(interfaceC34849a)));
        if (this.f73800I != null) {
            ITXVCubePlayer iTXVCubePlayer = this.f73835c;
            if (iTXVCubePlayer != null) {
                iTXVCubePlayer.setDisplay(null);
            }
            View view = this.f73800I.getView();
            this.f73800I.mo76434b(this.f73850t);
            this.f73800I = null;
            if (view.getParent() == this) {
                removeView(view);
            }
        }
        if (interfaceC34849a == null) {
            this.f73852v = null;
            ITXVCubePlayer iTXVCubePlayer2 = this.f73835c;
            if (iTXVCubePlayer2 != null) {
                iTXVCubePlayer2.setSurface(null);
            }
            m76319a(true);
            return;
        }
        this.f73800I = interfaceC34849a;
        interfaceC34849a.setAspectRatio(this.f73831ar);
        int i13 = this.f73853w;
        if (i13 > 0 && (i12 = this.f73854x) > 0) {
            interfaceC34849a.mo76430a(i13, i12);
        }
        int i14 = this.f73801J;
        if (i14 > 0 && (i11 = this.f73802K) > 0) {
            interfaceC34849a.mo76433b(i14, i11);
        }
        View view2 = this.f73800I.getView();
        view2.setLayoutParams(new FrameLayout.LayoutParams(-2, -2, 17));
        if (view2.getParent() == null) {
            addView(view2);
        }
        this.f73800I.mo76431a(this.f73850t);
        this.f73800I.setVideoRotation(this.f73792A);
    }

    public void setTextureRenderView(TextureRenderView textureRenderView) {
        m76318a("setTextureRenderView: ".concat(String.valueOf(textureRenderView)));
        if (this.f73835c != null) {
            textureRenderView.getSurfaceHolder().mo76328a(this.f73835c);
            textureRenderView.mo76430a(this.f73835c.getVideoWidth(), this.f73835c.getVideoHeight());
            textureRenderView.mo76433b(this.f73835c.getVideoSarNum(), this.f73835c.getVideoSarDen());
            textureRenderView.setAspectRatio(this.f73831ar);
        }
        setRenderView(textureRenderView);
    }

    public void setVideoPath(String str) {
        setVideoURI(Uri.parse(str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:11:0x0026  */
    /* JADX WARN: Code duplicated, block: B:20:0x0047  */
    /* JADX WARN: Code duplicated, block: B:22:0x004b  */
    /* JADX INFO: renamed from: e */
    public void m76283e(boolean z11) {
        int i11;
        ITXVCubePlayer iTXVCubePlayer;
        int i12;
        m76318a("replay, isFromErrorState = ".concat(String.valueOf(z11)));
        if (z11) {
            long j11 = this.f73794C;
            if (j11 > 0) {
                this.f73795D = j11;
                if (this.f73807P && (i12 = this.f73808Q) >= 0) {
                    this.f73795D = i12;
                }
            } else if (this.f73795D != 0 && (iTXVCubePlayer = this.f73835c) != null) {
                if (this.f73796E > 0) {
                    long currentPosition = (int) iTXVCubePlayer.getCurrentPosition();
                    this.f73795D = currentPosition;
                    int i13 = this.f73808Q;
                    if (currentPosition < i13) {
                        this.f73795D = i13;
                    }
                }
            } else if (this.f73807P && (i11 = this.f73808Q) >= 0) {
                this.f73795D = i11;
            }
        } else if (this.f73795D != 0) {
            if (this.f73807P) {
                this.f73795D = i11;
            }
        } else if (this.f73807P) {
            this.f73795D = i11;
        }
        if (m76290g()) {
            return;
        }
        m76322b(false);
    }

    /* JADX INFO: renamed from: c */
    public final void m76325c(boolean z11) {
        TXCVodVideoView tXCVodVideoView;
        m76318a("start isLoop:".concat(String.valueOf(z11)));
        if (m76323b()) {
            try {
                if (this.f73815a == 3 || this.f73807P) {
                    tXCVodVideoView = this;
                } else {
                    this.f73815a = 3;
                    if (z11) {
                        tXCVodVideoView = this;
                    } else {
                        tXCVodVideoView = this;
                        try {
                            tXCVodVideoView.m76256a(2004, 0, "Playback started", (Bundle) null, this.f73839g);
                        } catch (Exception e11) {
                            e = e11;
                            m76321b("start exception: " + e.getMessage());
                        }
                    }
                    Handler handler = tXCVodVideoView.f73851u;
                    if (handler != null) {
                        handler.sendEmptyMessage(100);
                        tXCVodVideoView.f73851u.sendEmptyMessage(103);
                    }
                }
                tXCVodVideoView.f73835c.start();
            } catch (Exception e12) {
                e = e12;
                tXCVodVideoView = this;
            }
        } else {
            tXCVodVideoView = this;
        }
        tXCVodVideoView.f73834b = 3;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m76326d(boolean z11) {
        if (this.f73815a != 0) {
            return false;
        }
        this.f73837e = z11;
        return true;
    }

    /* JADX INFO: renamed from: b */
    public final void m76322b(boolean z11) {
        if (this.f73835c != null) {
            m76318a("release player " + this.f73835c);
            m76259a(this.f73835c);
            this.f73835c.release();
            m76296i();
            this.f73835c = null;
            this.f73815a = 0;
            this.f73807P = false;
            this.f73808Q = -1;
            if (z11) {
                this.f73834b = 0;
                this.f73853w = 0;
                this.f73854x = 0;
                this.f73804M = 1.0f;
                this.f73817ab = false;
                this.f73812U = -1000;
                this.f73813V = -1;
                this.f73814W = -1000;
                List<C34832b> list = this.f73841i;
                if (list != null) {
                    list.clear();
                }
                this.f73794C = 0L;
                this.f73822ai = -1;
                this.f73821ah = null;
                this.f73823aj.clear();
            }
            if (this.f73837e && LiteavSystemInfo.getSystemOSVersionInt() >= 8) {
                ((AudioManager) this.f73798G.getSystemService("audio")).abandonAudioFocus(null);
            }
            this.f73807P = false;
            this.f73808Q = -1;
        }
    }

    /* JADX INFO: renamed from: a */
    private void m76258a(Context context) {
        this.f73798G = context.getApplicationContext();
        this.f73836d = new C34813e();
        this.f73823aj = new CopyOnWriteArrayList<>();
        m76318a("new TXCVodVideoView");
        setRender(0);
        this.f73853w = 0;
        this.f73854x = 0;
        setFocusable(true);
        setFocusableInTouchMode(true);
        requestFocus();
        this.f73815a = 0;
        this.f73834b = 0;
        Looper mainLooper = Looper.getMainLooper();
        if (mainLooper != null) {
            this.f73851u = new HandlerC34831a(this, mainLooper);
        } else {
            this.f73851u = null;
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m76324c() {
        ITXVCubePlayer iTXVCubePlayer = this.f73835c;
        if (iTXVCubePlayer != null) {
            iTXVCubePlayer.publishAudioToNetwork();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m76260a(ITXVCubePlayer iTXVCubePlayer, InterfaceC34849a.b bVar) {
        if (iTXVCubePlayer == null) {
            return;
        }
        if (bVar == null) {
            iTXVCubePlayer.setDisplay(null);
            return;
        }
        m76318a("bindSurfaceHolder");
        Surface surfaceMo76330c = bVar.mo76330c();
        if (surfaceMo76330c == null) {
            surfaceMo76330c = bVar.mo76329b();
        }
        if (!RenderProcessService.getInstance().connectPlayer(iTXVCubePlayer, surfaceMo76330c, this.f73845o, this.f73846p)) {
            bVar.mo76328a(iTXVCubePlayer);
            return;
        }
        if (iTXVCubePlayer.getVideoWidth() > 0) {
            RenderProcessService.getInstance().setSurfaceBufferSize(iTXVCubePlayer);
        }
        RenderProcessService.getInstance().setRenderServiceEventListener(iTXVCubePlayer, this.f73849s);
    }

    /* JADX INFO: renamed from: b */
    public final boolean m76323b() {
        int i11;
        return (this.f73835c == null || (i11 = this.f73815a) == -1 || i11 == 0 || i11 == 1) ? false : true;
    }

    /* JADX INFO: renamed from: a */
    public final void m76319a(boolean z11) {
        if (this.f73835c != null) {
            m76318a("releaseWithoutStop needClearLastImg:".concat(String.valueOf(z11)));
            this.f73835c.setDisplay(null);
            this.f73835c.releaseTextureHost();
            if (z11) {
                this.f73835c.setSurfaceTexture(null);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m76321b(String str) {
        LiteavLog.m76083e("TXCVodVideoView", "[" + hashCode() + "], " + str);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m76274b(TXCVodVideoView tXCVodVideoView, int i11, int i12) {
        Bundle bundle = new Bundle();
        bundle.putInt(TXVodConstants.EVT_KEY_SELECT_TRACK_INDEX, i11);
        bundle.putInt(TXVodConstants.EVT_KEY_SELECT_TRACK_ERROR_CODE, i12);
        bundle.putString(TUIConstants.TUIPlugin.PLUGIN_DESCRIPTION, "Select Track Complete");
        tXCVodVideoView.m76318a("VOD_PLAY_EVT_SELECT_TRACK_COMPLETE, trackIndex=" + i11 + " ,errorCode=" + i12 + " ,vod=" + tXCVodVideoView.hashCode());
        tXCVodVideoView.m76257a(TXVodConstants.VOD_PLAY_EVT_SELECT_TRACK_COMPLETE, bundle);
    }

    public TXCVodVideoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f73815a = 0;
        this.f73834b = 0;
        this.f73852v = null;
        this.f73835c = null;
        this.f73797F = false;
        this.f73804M = 1.0f;
        this.f73837e = true;
        this.f73838f = 2;
        this.f73807P = false;
        this.f73808Q = -1;
        this.f73809R = 100;
        this.f73810S = -100.0f;
        this.f73811T = false;
        this.f73812U = -1000;
        this.f73813V = -1;
        this.f73814W = -1000;
        this.f73816aa = -1;
        this.f73839g = new Object();
        this.f73840h = null;
        this.f73842l = false;
        this.f73844n = 0;
        this.f73845o = -1;
        this.f73846p = null;
        this.f73822ai = -1;
        this.f73847q = new ITXVCubePlayer.InterfaceC34802j() { // from class: com.tencent.liteav.txcvodplayer.TXCVodVideoView.7
            @Override // com.tencent.liteav.txcplayer.ITXVCubePlayer.InterfaceC34802j
            /* JADX INFO: renamed from: a */
            public final void mo76211a(ITXVCubePlayer iTXVCubePlayer, int i11, int i12, String str) {
                boolean z11 = (TXCVodVideoView.this.f73854x != i12 && Math.abs(TXCVodVideoView.this.f73854x - i12) > 16) || (TXCVodVideoView.this.f73853w != i11 && Math.abs(TXCVodVideoView.this.f73853w - i11) > 16);
                TXCVodVideoView.this.f73853w = iTXVCubePlayer.getVideoWidth();
                TXCVodVideoView.this.f73854x = iTXVCubePlayer.getVideoHeight();
                TXCVodVideoView.this.f73801J = iTXVCubePlayer.getVideoSarNum();
                TXCVodVideoView.this.f73802K = iTXVCubePlayer.getVideoSarDen();
                ArrayList<C34815a> supportedBitrates = TXCVodVideoView.this.getSupportedBitrates();
                if (supportedBitrates != null) {
                    long j11 = 2147483647L;
                    for (C34815a c34815a : supportedBitrates) {
                        long jAbs = Math.abs((TXCVodVideoView.this.f73853w * TXCVodVideoView.this.f73854x) - (c34815a.f73767b * c34815a.f73768c));
                        if (jAbs < j11) {
                            TXCVodVideoView.this.f73805N = ((long) c34815a.f73767b) * ((long) c34815a.f73768c);
                            j11 = jAbs;
                        }
                    }
                }
                long propertyLong = TXCVodVideoView.this.f73835c.getPropertyLong(205);
                TXCVodVideoView.this.m76318a("OnVideoSizeChangedListener width:" + TXCVodVideoView.this.f73853w + ":height:" + TXCVodVideoView.this.f73854x + ":SarNum:" + TXCVodVideoView.this.f73801J + ":SarDen:" + TXCVodVideoView.this.f73802K + ":videoRotationDegree:" + propertyLong);
                if (TXCVodVideoView.this.f73853w != 0 && TXCVodVideoView.this.f73854x != 0) {
                    if (TXCVodVideoView.this.f73800I != null) {
                        TXCVodVideoView.this.f73800I.mo76430a(TXCVodVideoView.this.f73853w, TXCVodVideoView.this.f73854x);
                        TXCVodVideoView.this.f73800I.mo76433b(TXCVodVideoView.this.f73801J, TXCVodVideoView.this.f73802K);
                    }
                    TXCVodVideoView.this.requestLayout();
                }
                if (!z11) {
                    if (TXCVodVideoView.this.f73797F || str == null) {
                        return;
                    }
                    Message message = new Message();
                    message.what = 101;
                    message.arg1 = 2009;
                    Bundle bundle = new Bundle();
                    String str2 = i11 + "," + i12 + "," + str;
                    bundle.putString(TUIConstants.TUIPlugin.PLUGIN_DESCRIPTION, "Resolution change:" + TXCVodVideoView.this.f73853w + ProxyConfig.MATCH_ALL_SCHEMES + TXCVodVideoView.this.f73854x + " Crop(width,height,crop_left,crop_top,crop_right,crop_bottom):(" + str2 + ")");
                    bundle.putInt("EVT_PARAM1", TXCVodVideoView.this.f73853w);
                    bundle.putInt("EVT_PARAM2", TXCVodVideoView.this.f73854x);
                    bundle.putString("EVT_PARAM3", str2);
                    bundle.putLong(TXVodConstants.EVT_KEY_VIDEO_ROTATION, propertyLong);
                    message.setData(bundle);
                    if (TXCVodVideoView.this.f73851u != null) {
                        TXCVodVideoView.this.f73851u.sendMessage(message);
                        return;
                    }
                    return;
                }
                Message message2 = new Message();
                message2.what = 101;
                message2.arg1 = 2009;
                Bundle bundle2 = new Bundle();
                bundle2.putInt("EVT_PARAM1", TXCVodVideoView.this.f73853w);
                bundle2.putInt("EVT_PARAM2", TXCVodVideoView.this.f73854x);
                if (TXCVodVideoView.this.f73797F || str == null) {
                    bundle2.putString(TUIConstants.TUIPlugin.PLUGIN_DESCRIPTION, "Resolution change:" + TXCVodVideoView.this.f73853w + ProxyConfig.MATCH_ALL_SCHEMES + TXCVodVideoView.this.f73854x);
                } else {
                    String str3 = i11 + "," + i12 + "," + str;
                    bundle2.putString(TUIConstants.TUIPlugin.PLUGIN_DESCRIPTION, "Resolution change:" + TXCVodVideoView.this.f73853w + ProxyConfig.MATCH_ALL_SCHEMES + TXCVodVideoView.this.f73854x + " Crop(width,height,crop_left,crop_top,crop_right,crop_bottom):(" + str3 + ")");
                    bundle2.putString("EVT_PARAM3", str3);
                }
                bundle2.putLong(TXVodConstants.EVT_KEY_VIDEO_ROTATION, propertyLong);
                message2.setData(bundle2);
                if (TXCVodVideoView.this.f73851u != null) {
                    TXCVodVideoView.this.f73851u.sendMessage(message2);
                }
            }
        };
        this.f73848r = new ITXVCubePlayer.InterfaceC34799g() { // from class: com.tencent.liteav.txcvodplayer.TXCVodVideoView.8
            @Override // com.tencent.liteav.txcplayer.ITXVCubePlayer.InterfaceC34799g
            /* JADX INFO: renamed from: a */
            public final void mo76209a(ITXVCubePlayer iTXVCubePlayer) {
                if (RenderProcessService.getInstance().setSurfaceBufferSize(iTXVCubePlayer)) {
                    TXCVodVideoView.this.m76318a("setSurfaceBufferSize succeed");
                }
                if (C34811c.m76238a(HouseBuilder.EnumC34765a.PLAYER_PREMIUM)) {
                    TXCVodVideoView.m76280d();
                    TXCVodVideoView.this.m76318a("has advanced license!");
                }
                if (!TXCVodVideoView.f73790j) {
                    TXCVodVideoView.this.f73835c.checkSubtitle();
                }
                TXCVodVideoView.m76298j(TXCVodVideoView.this);
                if (TXCVodVideoView.this.f73815a == 1) {
                    TXCVodVideoView.this.m76255a(2013, 0, "VOD ready(EVT_VOD_PLAY_PREPARED)");
                    if (!TXCVodVideoView.this.f73836d.f73754p) {
                        TXCVodVideoView.this.f73834b = 4;
                    } else if (TXCVodVideoView.this.f73834b != 4) {
                        TXCVodVideoView.this.f73834b = 3;
                    }
                    TXCVodVideoView.this.f73815a = 2;
                }
                TXCVodVideoView.m76301m(TXCVodVideoView.this);
                if (TXCVodVideoView.this.f73815a == -1) {
                    TXCVodVideoView.this.f73815a = 3;
                    TXCVodVideoView.this.f73834b = 3;
                }
                TXCVodVideoView.this.f73853w = iTXVCubePlayer.getVideoWidth();
                TXCVodVideoView.this.f73854x = iTXVCubePlayer.getVideoHeight();
                if (TXCVodVideoView.this.f73853w != 0 && TXCVodVideoView.this.f73854x != 0 && TXCVodVideoView.this.f73800I != null) {
                    TXCVodVideoView.this.f73800I.mo76430a(TXCVodVideoView.this.f73853w, TXCVodVideoView.this.f73854x);
                    TXCVodVideoView.this.f73800I.mo76433b(TXCVodVideoView.this.f73801J, TXCVodVideoView.this.f73802K);
                }
                if (TXCVodVideoView.this.f73834b == 3) {
                    TXCVodVideoView.this.m76325c(false);
                }
            }
        };
        this.f73824ak = new ITXVCubePlayer.InterfaceC34796d() { // from class: com.tencent.liteav.txcvodplayer.TXCVodVideoView.9
            @Override // com.tencent.liteav.txcplayer.ITXVCubePlayer.InterfaceC34796d
            /* JADX INFO: renamed from: a */
            public final void mo76206a() {
                TXCVodVideoView.this.f73815a = 5;
                TXCVodVideoView.this.f73834b = 5;
                TXCVodVideoView.this.m76255a(2006, 0, "Playback completed");
            }
        };
        this.f73825al = new ITXVCubePlayer.InterfaceC34798f() { // from class: com.tencent.liteav.txcvodplayer.TXCVodVideoView.10
            @Override // com.tencent.liteav.txcplayer.ITXVCubePlayer.InterfaceC34798f
            /* JADX INFO: renamed from: a */
            public final boolean mo76208a(int i11, int i12, int i13, Object obj) {
                if (i11 == -2303) {
                    TXCVodVideoView.this.f73815a = -1;
                    TXCVodVideoView.this.f73834b = -1;
                    TXCVodVideoView.this.m76255a(i11, 0, "file not found");
                    TXCVodVideoView.this.m76315a();
                    return true;
                }
                if (i11 == 1006) {
                    if (!TextUtils.isEmpty(TXCVodVideoView.this.f73803L) || obj == null || !(obj instanceof TPPlayerMsg.TPDownLoadProgressInfo)) {
                        return true;
                    }
                    try {
                        TXCVodVideoView.this.f73803L = new JSONObject(((TPPlayerMsg.TPDownLoadProgressInfo) obj).extraInfo).optString("cdnip");
                        return true;
                    } catch (Exception e11) {
                        e11.printStackTrace();
                        return true;
                    }
                }
                if (i11 == 2007) {
                    TXCVodVideoView.this.m76255a(i11, 0, "Buffer started");
                    return true;
                }
                if (i11 == 2011) {
                    TXCVodVideoView.this.m76318a("EVT_VIDEO_CHANGE_ROTATION: ".concat(String.valueOf(i12)));
                    TXCVodVideoView.this.f73793B = i12;
                    if (TXCVodVideoView.this.f73836d.f73735B && TXCVodVideoView.this.f73793B > 0) {
                        TXCVodVideoView tXCVodVideoView = TXCVodVideoView.this;
                        tXCVodVideoView.f73792A = tXCVodVideoView.f73793B;
                        if (TXCVodVideoView.this.f73800I != null) {
                            TXCVodVideoView.this.f73800I.setVideoRotation(TXCVodVideoView.this.f73792A);
                        }
                    }
                    TXCVodVideoView tXCVodVideoView2 = TXCVodVideoView.this;
                    String str = "Video angle " + TXCVodVideoView.this.f73793B;
                    int unused = TXCVodVideoView.this.f73793B;
                    tXCVodVideoView2.m76255a(2011, 0, str);
                    return true;
                }
                TPPlayerMsg.TPVideoSeiInfo tPVideoSeiInfo = null;
                str2 = null;
                String str2 = null;
                tPVideoSeiInfo = null;
                if (i11 == 2014) {
                    TXCVodVideoView.this.m76255a(i11, 0, "Buffer ended");
                    if (i12 != 0) {
                        String str3 = TXCVodVideoView.this.f73836d.f73755q;
                        if (TextUtils.isEmpty(str3) && str3.endsWith("m3u8")) {
                            return true;
                        }
                    }
                    if (TXCVodVideoView.this.f73834b != 3) {
                        return true;
                    }
                    TXCVodVideoView tXCVodVideoView3 = TXCVodVideoView.this;
                    tXCVodVideoView3.m76256a(2004, 0, "Playback started", (Bundle) null, tXCVodVideoView3.f73839g);
                    TXCVodVideoView.this.f73815a = 3;
                    TXCVodVideoView.this.f73851u.sendEmptyMessage(100);
                    TXCVodVideoView.this.f73851u.sendEmptyMessage(103);
                    return true;
                }
                if (i11 == 2020) {
                    int iLongValue = (int) ((obj == null || !(obj instanceof Long)) ? -1L : ((Long) obj).longValue());
                    TXCVodVideoView.m76261a(TXCVodVideoView.this, iLongValue, i13);
                    TXCVodVideoView.m76274b(TXCVodVideoView.this, iLongValue, i13);
                    return true;
                }
                if (i11 == 2026) {
                    TXCVodVideoView.this.m76255a(i11, 0, "Audio first play");
                    return true;
                }
                if (i11 == 2030) {
                    if (!TXCVodVideoView.f73790j) {
                        return false;
                    }
                    if (obj != null && (obj instanceof TPPlayerMsg.TPVideoSeiInfo)) {
                        tPVideoSeiInfo = (TPPlayerMsg.TPVideoSeiInfo) obj;
                    }
                    if (tPVideoSeiInfo == null) {
                        TXCVodVideoView.this.m76321b("VOD_PLAY_EVT_VIDEO_SEI, seiInfo is null");
                        return false;
                    }
                    Bundle bundle = new Bundle();
                    bundle.putInt(TXVodConstants.EVT_KEY_SEI_TYPE, tPVideoSeiInfo.videoSeiType);
                    bundle.putInt(TXVodConstants.EVT_KEY_SEI_SIZE, tPVideoSeiInfo.seiDataSize);
                    bundle.putByteArray(TXVodConstants.EVT_KEY_SEI_DATA, tPVideoSeiInfo.seiData);
                    TXCVodVideoView.this.m76257a(TXVodConstants.VOD_PLAY_EVT_VIDEO_SEI, bundle);
                    return true;
                }
                if (i11 == 2002) {
                    TXCVodVideoView.this.m76255a(i11, 0, "hit cache");
                    return true;
                }
                if (i11 == 2003) {
                    TXCVodVideoView.this.m76318a("EVT_RENDER_FIRST_I_FRAME");
                    if (TXCVodVideoView.this.f73842l) {
                        Bundle bundle2 = new Bundle();
                        if (TextUtils.isEmpty(TXCVodVideoView.this.f73843m) || !TXCVodVideoView.this.f73843m.equals(TXCVodVideoView.this.f73836d.f73755q)) {
                            bundle2.putString("support_hevc", "1");
                        } else {
                            bundle2.putString("support_hevc", "0");
                        }
                        TXCVodVideoView.this.m76256a(i11, 0, "VOD displayed the first frame", bundle2, Boolean.FALSE);
                    } else {
                        TXCVodVideoView.this.m76255a(i11, 0, "VOD displayed the first frame");
                    }
                    TXCVodVideoView tXCVodVideoView4 = TXCVodVideoView.this;
                    tXCVodVideoView4.setRate(tXCVodVideoView4.f73804M);
                    TXCVodVideoView.m76305q(TXCVodVideoView.this);
                    return true;
                }
                switch (i11) {
                    case TXVodConstants.VOD_PLAY_EVT_TCP_CONNECT_SUCC /* 2016 */:
                        if (obj != null && (obj instanceof String)) {
                            TXCVodVideoView.this.f73803L = (String) obj;
                        }
                        String str4 = "TCP Connect ServerIp:" + TXCVodVideoView.this.f73803L + ",port:" + i12 + ",error:" + i13;
                        TXCVodVideoView.this.m76318a(str4);
                        if (i13 != 0) {
                            return true;
                        }
                        TXCVodVideoView.this.m76255a(i11, 0, str4);
                        return true;
                    case TXVodConstants.VOD_PLAY_EVT_FIRST_VIDEO_PACKET /* 2017 */:
                        TXCVodVideoView.this.m76255a(i11, 0, "Video data received");
                        return true;
                    case TXVodConstants.VOD_PLAY_EVT_DNS_RESOLVED /* 2018 */:
                        if (obj != null && (obj instanceof String)) {
                            str2 = (String) obj;
                        }
                        String str5 = "dns resolved url:" + str2 + ",error:" + i12;
                        TXCVodVideoView.this.m76318a(str5);
                        if (i12 != 0) {
                            return true;
                        }
                        TXCVodVideoView.this.m76255a(i11, 0, str5);
                        return true;
                    default:
                        return true;
                }
            }
        };
        this.f73827an = new ITXVCubePlayer.InterfaceC34797e() { // from class: com.tencent.liteav.txcvodplayer.TXCVodVideoView.11
            @Override // com.tencent.liteav.txcplayer.ITXVCubePlayer.InterfaceC34797e
            /* JADX INFO: renamed from: a */
            public final boolean mo76207a(int i11, int i12) {
                TXCVodVideoView.this.m76321b("[onError] vodErrorEvent: " + i11 + " ,errorCode: " + i12);
                TXCVodVideoView.this.f73815a = -1;
                if (i11 == -6101) {
                    TXCVodVideoView.this.f73834b = -1;
                    if (TXCVodVideoView.this.f73799H != null) {
                        Object obj = TXCVodVideoView.this.f73799H.get("TXC_DRM_SIMPLE_AES_URL");
                        if ((obj instanceof String) && !TextUtils.isEmpty((String) obj)) {
                            TXCVodVideoView.this.f73799H.put("TXC_DRM_KEY_URL", null);
                            TXCVodVideoView.this.f73799H.put("TXC_DRM_PROVISION_URL", null);
                            if (!TXCVodVideoView.this.m76290g()) {
                                TXCVodVideoView.this.m76322b(false);
                            }
                            return true;
                        }
                    }
                    TXCVodVideoView.this.m76255a(TXVodConstants.VOD_PLAY_ERR_DRM, i12, "DRM play failed cause by " + i12 + C33978va.f72339h);
                    return true;
                }
                if (i11 != -6004) {
                    switch (i11) {
                        case TXVodConstants.VOD_PLAY_ERR_PROCESS_VIDEO_FAIL /* -6010 */:
                        case TXVodConstants.VOD_PLAY_ERR_RENDER_FAIL /* -6009 */:
                        case TXVodConstants.VOD_PLAY_ERR_DECODE_SUBTITLE_FAIL /* -6008 */:
                        case TXVodConstants.VOD_PLAY_ERR_DECODE_AUDIO_FAIL /* -6007 */:
                            break;
                        case TXVodConstants.VOD_PLAY_ERR_DECODE_VIDEO_FAIL /* -6006 */:
                            TXCVodVideoView.this.f73834b = -1;
                            TXCVodVideoView.m76313y(TXCVodVideoView.this);
                            break;
                        default:
                            switch (i11) {
                                case -2305:
                                    TXCVodVideoView.this.f73834b = -1;
                                    TXCVodVideoView.m76314z(TXCVodVideoView.this);
                                    break;
                                case -2304:
                                    TXCVodVideoView.this.f73834b = -1;
                                    TXCVodVideoView.m76312x(TXCVodVideoView.this);
                                    break;
                                case -2303:
                                    TXCVodVideoView.this.f73834b = -1;
                                    TXCVodVideoView.this.m76255a(-2303, i12, "The file does not exist");
                                    TXCVodVideoView.this.m76315a();
                                    break;
                                default:
                                    long currentPosition = TXCVodVideoView.this.getCurrentPosition() - TXCVodVideoView.this.f73806O;
                                    if (currentPosition < 0 || currentPosition > 500) {
                                        TXCVodVideoView.m76243B(TXCVodVideoView.this);
                                    }
                                    TXCVodVideoView tXCVodVideoView = TXCVodVideoView.this;
                                    tXCVodVideoView.f73806O = tXCVodVideoView.getCurrentPosition();
                                    if (TXCVodVideoView.m76244C(TXCVodVideoView.this) >= TXCVodVideoView.this.f73836d.f73739a) {
                                        TXCVodVideoView.this.f73834b = -1;
                                        TXCVodVideoView.this.m76255a(-2301, i12, "Disconnected from the network. Playback error");
                                        TXCVodVideoView.this.m76315a();
                                    } else {
                                        if (TXCVodVideoView.this.f73834b != 4) {
                                            TXCVodVideoView.this.f73834b = -1;
                                        }
                                        if (TXCVodVideoView.this.f73851u != null) {
                                            if (TXCVodVideoView.this.f73822ai != -1) {
                                                TXCVodVideoView tXCVodVideoView2 = TXCVodVideoView.this;
                                                TXCVodVideoView.m76274b(tXCVodVideoView2, tXCVodVideoView2.f73822ai, i11);
                                            }
                                            TXCVodVideoView.this.f73851u.sendEmptyMessageDelayed(102, (long) (TXCVodVideoView.this.f73836d.f73740b * 1000.0f));
                                        }
                                    }
                                    break;
                            }
                            break;
                    }
                    return true;
                }
                TXCVodVideoView.this.f73834b = -1;
                TXCVodVideoView.this.m76255a(i11, i12, TXCVodVideoView.m76272b(i11));
                TXCVodVideoView.this.m76315a();
                return true;
            }
        };
        this.f73828ao = new ITXVCubePlayer.InterfaceC34800h() { // from class: com.tencent.liteav.txcvodplayer.TXCVodVideoView.12
            @Override // com.tencent.liteav.txcplayer.ITXVCubePlayer.InterfaceC34800h
            /* JADX INFO: renamed from: a */
            public final void mo76210a() {
                TXCVodVideoView.m76246E(TXCVodVideoView.this);
                TXCVodVideoView.this.m76255a(TXVodConstants.VOD_PLAY_EVT_SEEK_COMPLETE, 0, "seek complete");
            }
        };
        this.f73829ap = new ITXVCubePlayer.InterfaceC34801i() { // from class: com.tencent.liteav.txcvodplayer.TXCVodVideoView.13
            @Override // com.tencent.liteav.txcplayer.ITXVCubePlayer.InterfaceC34801i
            /* JADX INFO: renamed from: a */
            public final void mo75993a(ITXVCubePlayer iTXVCubePlayer, TPSubtitleData tPSubtitleData) {
                if (TXCVodVideoView.f73790j && TXCVodVideoView.this.f73820ae != null) {
                    TXCVodVideoView.this.f73820ae.mo75993a(iTXVCubePlayer, tPSubtitleData);
                }
            }
        };
        this.f73830aq = new ITXVCubePlayer.InterfaceC34794b() { // from class: com.tencent.liteav.txcvodplayer.TXCVodVideoView.2
            @Override // com.tencent.liteav.txcplayer.ITXVCubePlayer.InterfaceC34794b
            /* JADX INFO: renamed from: a */
            public final void mo75992a(ITXVCubePlayer iTXVCubePlayer, TPSubtitleFrameBuffer tPSubtitleFrameBuffer) {
                if (tPSubtitleFrameBuffer == null || TXCVodVideoView.this.f73818ac == null) {
                    return;
                }
                TXCVodVideoView.this.f73818ac.mo75992a(iTXVCubePlayer, tPSubtitleFrameBuffer);
            }
        };
        this.f73849s = new RenderProcessService.IRenderServiceEventListener() { // from class: com.tencent.liteav.txcvodplayer.TXCVodVideoView.3
            @Override // com.tencent.liteav.txcplayer.ext.service.RenderProcessService.IRenderServiceEventListener
            public final void onRenderServiceEvent(ITXVCubePlayer iTXVCubePlayer, int i11, Bundle bundle) {
                TXCVodVideoView.this.m76257a(i11, bundle);
            }
        };
        this.f73850t = new InterfaceC34849a.a() { // from class: com.tencent.liteav.txcvodplayer.TXCVodVideoView.4
            @Override // com.tencent.liteav.txcvodplayer.renderer.InterfaceC34849a.a
            /* JADX INFO: renamed from: a */
            public final void mo76332a(InterfaceC34849a.b bVar, int i11, int i12) {
                if (bVar.mo76327a() != TXCVodVideoView.this.f73800I) {
                    TXCVodVideoView.this.m76321b("onSurfaceChanged: unmatched render callback");
                    return;
                }
                TXCVodVideoView.this.m76318a("onSurfaceChanged");
                TXCVodVideoView.this.f73855y = i11;
                TXCVodVideoView.this.f73856z = i12;
                boolean z11 = true;
                boolean z12 = TXCVodVideoView.this.f73834b == 3;
                if (TXCVodVideoView.this.f73800I.mo76432a() && (TXCVodVideoView.this.f73853w != i11 || TXCVodVideoView.this.f73854x != i12)) {
                    z11 = false;
                }
                if (TXCVodVideoView.this.f73835c != null && z12 && z11 && TXCVodVideoView.this.f73834b == 3) {
                    TXCVodVideoView.this.m76325c(false);
                }
            }

            @Override // com.tencent.liteav.txcvodplayer.renderer.InterfaceC34849a.a
            /* JADX INFO: renamed from: b */
            public final void mo76334b(InterfaceC34849a.b bVar) {
                if (bVar.mo76327a() != TXCVodVideoView.this.f73800I) {
                    TXCVodVideoView.this.m76321b("onSurfaceDestroyed: unmatched render callback");
                    return;
                }
                TXCVodVideoView.this.m76318a("onSurfaceDestroyed");
                TXCVodVideoView.this.f73797F = false;
                TXCVodVideoView.this.f73852v = null;
                if (TXCVodVideoView.this.f73835c != null) {
                    TXCVodVideoView.this.f73835c.setSurface(null);
                }
                TXCVodVideoView.this.m76319a(false);
            }

            @Override // com.tencent.liteav.txcvodplayer.renderer.InterfaceC34849a.a
            /* JADX INFO: renamed from: a */
            public final void mo76331a(InterfaceC34849a.b bVar) {
                if (bVar.mo76327a() != TXCVodVideoView.this.f73800I) {
                    TXCVodVideoView.this.m76321b("onSurfaceCreated: unmatched render callback");
                    return;
                }
                TXCVodVideoView.this.m76318a("onSurfaceCreated");
                TXCVodVideoView.this.f73797F = true;
                TXCVodVideoView.this.f73852v = bVar;
                if (TXCVodVideoView.this.f73835c == null) {
                    TXCVodVideoView.this.m76290g();
                } else {
                    TXCVodVideoView tXCVodVideoView = TXCVodVideoView.this;
                    tXCVodVideoView.m76260a(tXCVodVideoView.f73835c, bVar);
                }
            }

            @Override // com.tencent.liteav.txcvodplayer.renderer.InterfaceC34849a.a
            /* JADX INFO: renamed from: a */
            public final boolean mo76333a(MotionEvent motionEvent) {
                return RenderProcessService.getInstance().onTouchEvent(TXCVodVideoView.this.f73835c, motionEvent);
            }
        };
        this.f73831ar = 0;
        this.f73833at = false;
        m76258a(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m76315a() {
        Handler handler = this.f73851u;
        if (handler != null) {
            handler.removeMessages(102);
            this.f73851u.removeMessages(100);
            this.f73851u.removeMessages(103);
        }
        ITXVCubePlayer iTXVCubePlayer = this.f73835c;
        if (iTXVCubePlayer != null) {
            try {
                iTXVCubePlayer.stop();
                this.f73836d.f73755q = null;
                m76322b(true);
            } catch (Exception e11) {
                m76321b("stop exception: " + e11.getMessage());
            }
        }
        m76318a(InterfaceC33730j9.f70350a);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ String m76272b(int i11) {
        if (i11 != -6101) {
            switch (i11) {
                case TXVodConstants.VOD_PLAY_ERR_DOWNLOAD_FAIL /* -6011 */:
                    return "DOWNLOAD_FAIL";
                case TXVodConstants.VOD_PLAY_ERR_PROCESS_VIDEO_FAIL /* -6010 */:
                    return "PROCESS_VIDEO_FAIL";
                case TXVodConstants.VOD_PLAY_ERR_RENDER_FAIL /* -6009 */:
                    return "RENDER_FAIL";
                case TXVodConstants.VOD_PLAY_ERR_DECODE_SUBTITLE_FAIL /* -6008 */:
                    return "DECODE_SUBTITLE_FAIL";
                case TXVodConstants.VOD_PLAY_ERR_DECODE_AUDIO_FAIL /* -6007 */:
                    return "DECODE_AUDIO_FAIL";
                case TXVodConstants.VOD_PLAY_ERR_DECODE_VIDEO_FAIL /* -6006 */:
                    return "DECODE_VIDEO_FAIL";
                case TXVodConstants.VOD_PLAY_ERR_DEMUXER_TIMEOUT /* -6005 */:
                    return "DEMUXER_TIMEOUT";
                case TXVodConstants.VOD_PLAY_ERR_SYSTEM_PLAY_FAIL /* -6004 */:
                    return "SYSTEM_PLAY_FAIL";
                case TXVodConstants.VOD_PLAY_ERR_DEMUXER_FAIL /* -6003 */:
                    return "DEMUXER_FAIL";
                case TXVodConstants.VOD_PLAY_ERR_GENERAL /* -6002 */:
                    return "ERR_GENERAL";
                default:
                    return "ERR_UNKNOW";
            }
        }
        return "PLAY_ERR_DRM";
    }

    /* JADX INFO: renamed from: a */
    public final void m76317a(int i11, boolean z11) {
        m76318a("seek to " + i11 + ", isAccurateSeek=" + z11);
        int iMin = Math.min(i11, getDuration());
        if (iMin >= 0 && m76323b()) {
            try {
                this.f73808Q = iMin;
                this.f73835c.seekTo(iMin, z11);
                this.f73807P = true;
                if (this.f73815a == 5) {
                    this.f73834b = 3;
                }
            } catch (Exception e11) {
                m76321b("seekTo Exception : " + e11.getMessage());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m76256a(int i11, int i12, String str, Bundle bundle, Object obj) {
        if ((i11 == -2304 || i11 == 2106) && this.f73833at) {
            return;
        }
        Message message = new Message();
        message.what = 101;
        message.obj = obj;
        Bundle bundle2 = new Bundle();
        message.arg1 = i11;
        String str2 = "(" + i11 + "," + i12 + ")-" + str;
        bundle2.putString(TUIConstants.TUIPlugin.PLUGIN_DESCRIPTION, str2);
        bundle2.putInt(TXVodConstants.EVT_ERROR_CODE, i12);
        if (bundle != null) {
            bundle2.putBundle(JAnalysisConstants.ACCOUNT_EXTRA_ATTR, bundle);
        }
        message.setData(bundle2);
        Handler handler = this.f73851u;
        if (handler != null) {
            handler.sendMessage(message);
            m76318a("sendSimpleEvent ".concat(String.valueOf(str2)));
        }
        this.f73833at = i11 == -2304 || i11 == 2106;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m76255a(int i11, int i12, String str) {
        m76256a(i11, i12, str, (Bundle) null, Boolean.FALSE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m76257a(int i11, Bundle bundle) {
        InterfaceC34812d interfaceC34812d = this.f73832as;
        if (interfaceC34812d != null) {
            interfaceC34812d.mo75990a(i11, bundle);
        }
    }

    public TXCVodVideoView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.f73815a = 0;
        this.f73834b = 0;
        this.f73852v = null;
        this.f73835c = null;
        this.f73797F = false;
        this.f73804M = 1.0f;
        this.f73837e = true;
        this.f73838f = 2;
        this.f73807P = false;
        this.f73808Q = -1;
        this.f73809R = 100;
        this.f73810S = -100.0f;
        this.f73811T = false;
        this.f73812U = -1000;
        this.f73813V = -1;
        this.f73814W = -1000;
        this.f73816aa = -1;
        this.f73839g = new Object();
        this.f73840h = null;
        this.f73842l = false;
        this.f73844n = 0;
        this.f73845o = -1;
        this.f73846p = null;
        this.f73822ai = -1;
        this.f73847q = new ITXVCubePlayer.InterfaceC34802j() { // from class: com.tencent.liteav.txcvodplayer.TXCVodVideoView.7
            @Override // com.tencent.liteav.txcplayer.ITXVCubePlayer.InterfaceC34802j
            /* JADX INFO: renamed from: a */
            public final void mo76211a(ITXVCubePlayer iTXVCubePlayer, int i12, int i13, String str) {
                boolean z11 = (TXCVodVideoView.this.f73854x != i13 && Math.abs(TXCVodVideoView.this.f73854x - i13) > 16) || (TXCVodVideoView.this.f73853w != i12 && Math.abs(TXCVodVideoView.this.f73853w - i12) > 16);
                TXCVodVideoView.this.f73853w = iTXVCubePlayer.getVideoWidth();
                TXCVodVideoView.this.f73854x = iTXVCubePlayer.getVideoHeight();
                TXCVodVideoView.this.f73801J = iTXVCubePlayer.getVideoSarNum();
                TXCVodVideoView.this.f73802K = iTXVCubePlayer.getVideoSarDen();
                ArrayList<C34815a> supportedBitrates = TXCVodVideoView.this.getSupportedBitrates();
                if (supportedBitrates != null) {
                    long j11 = 2147483647L;
                    for (C34815a c34815a : supportedBitrates) {
                        long jAbs = Math.abs((TXCVodVideoView.this.f73853w * TXCVodVideoView.this.f73854x) - (c34815a.f73767b * c34815a.f73768c));
                        if (jAbs < j11) {
                            TXCVodVideoView.this.f73805N = ((long) c34815a.f73767b) * ((long) c34815a.f73768c);
                            j11 = jAbs;
                        }
                    }
                }
                long propertyLong = TXCVodVideoView.this.f73835c.getPropertyLong(205);
                TXCVodVideoView.this.m76318a("OnVideoSizeChangedListener width:" + TXCVodVideoView.this.f73853w + ":height:" + TXCVodVideoView.this.f73854x + ":SarNum:" + TXCVodVideoView.this.f73801J + ":SarDen:" + TXCVodVideoView.this.f73802K + ":videoRotationDegree:" + propertyLong);
                if (TXCVodVideoView.this.f73853w != 0 && TXCVodVideoView.this.f73854x != 0) {
                    if (TXCVodVideoView.this.f73800I != null) {
                        TXCVodVideoView.this.f73800I.mo76430a(TXCVodVideoView.this.f73853w, TXCVodVideoView.this.f73854x);
                        TXCVodVideoView.this.f73800I.mo76433b(TXCVodVideoView.this.f73801J, TXCVodVideoView.this.f73802K);
                    }
                    TXCVodVideoView.this.requestLayout();
                }
                if (!z11) {
                    if (TXCVodVideoView.this.f73797F || str == null) {
                        return;
                    }
                    Message message = new Message();
                    message.what = 101;
                    message.arg1 = 2009;
                    Bundle bundle = new Bundle();
                    String str2 = i12 + "," + i13 + "," + str;
                    bundle.putString(TUIConstants.TUIPlugin.PLUGIN_DESCRIPTION, "Resolution change:" + TXCVodVideoView.this.f73853w + ProxyConfig.MATCH_ALL_SCHEMES + TXCVodVideoView.this.f73854x + " Crop(width,height,crop_left,crop_top,crop_right,crop_bottom):(" + str2 + ")");
                    bundle.putInt("EVT_PARAM1", TXCVodVideoView.this.f73853w);
                    bundle.putInt("EVT_PARAM2", TXCVodVideoView.this.f73854x);
                    bundle.putString("EVT_PARAM3", str2);
                    bundle.putLong(TXVodConstants.EVT_KEY_VIDEO_ROTATION, propertyLong);
                    message.setData(bundle);
                    if (TXCVodVideoView.this.f73851u != null) {
                        TXCVodVideoView.this.f73851u.sendMessage(message);
                        return;
                    }
                    return;
                }
                Message message2 = new Message();
                message2.what = 101;
                message2.arg1 = 2009;
                Bundle bundle2 = new Bundle();
                bundle2.putInt("EVT_PARAM1", TXCVodVideoView.this.f73853w);
                bundle2.putInt("EVT_PARAM2", TXCVodVideoView.this.f73854x);
                if (TXCVodVideoView.this.f73797F || str == null) {
                    bundle2.putString(TUIConstants.TUIPlugin.PLUGIN_DESCRIPTION, "Resolution change:" + TXCVodVideoView.this.f73853w + ProxyConfig.MATCH_ALL_SCHEMES + TXCVodVideoView.this.f73854x);
                } else {
                    String str3 = i12 + "," + i13 + "," + str;
                    bundle2.putString(TUIConstants.TUIPlugin.PLUGIN_DESCRIPTION, "Resolution change:" + TXCVodVideoView.this.f73853w + ProxyConfig.MATCH_ALL_SCHEMES + TXCVodVideoView.this.f73854x + " Crop(width,height,crop_left,crop_top,crop_right,crop_bottom):(" + str3 + ")");
                    bundle2.putString("EVT_PARAM3", str3);
                }
                bundle2.putLong(TXVodConstants.EVT_KEY_VIDEO_ROTATION, propertyLong);
                message2.setData(bundle2);
                if (TXCVodVideoView.this.f73851u != null) {
                    TXCVodVideoView.this.f73851u.sendMessage(message2);
                }
            }
        };
        this.f73848r = new ITXVCubePlayer.InterfaceC34799g() { // from class: com.tencent.liteav.txcvodplayer.TXCVodVideoView.8
            @Override // com.tencent.liteav.txcplayer.ITXVCubePlayer.InterfaceC34799g
            /* JADX INFO: renamed from: a */
            public final void mo76209a(ITXVCubePlayer iTXVCubePlayer) {
                if (RenderProcessService.getInstance().setSurfaceBufferSize(iTXVCubePlayer)) {
                    TXCVodVideoView.this.m76318a("setSurfaceBufferSize succeed");
                }
                if (C34811c.m76238a(HouseBuilder.EnumC34765a.PLAYER_PREMIUM)) {
                    TXCVodVideoView.m76280d();
                    TXCVodVideoView.this.m76318a("has advanced license!");
                }
                if (!TXCVodVideoView.f73790j) {
                    TXCVodVideoView.this.f73835c.checkSubtitle();
                }
                TXCVodVideoView.m76298j(TXCVodVideoView.this);
                if (TXCVodVideoView.this.f73815a == 1) {
                    TXCVodVideoView.this.m76255a(2013, 0, "VOD ready(EVT_VOD_PLAY_PREPARED)");
                    if (!TXCVodVideoView.this.f73836d.f73754p) {
                        TXCVodVideoView.this.f73834b = 4;
                    } else if (TXCVodVideoView.this.f73834b != 4) {
                        TXCVodVideoView.this.f73834b = 3;
                    }
                    TXCVodVideoView.this.f73815a = 2;
                }
                TXCVodVideoView.m76301m(TXCVodVideoView.this);
                if (TXCVodVideoView.this.f73815a == -1) {
                    TXCVodVideoView.this.f73815a = 3;
                    TXCVodVideoView.this.f73834b = 3;
                }
                TXCVodVideoView.this.f73853w = iTXVCubePlayer.getVideoWidth();
                TXCVodVideoView.this.f73854x = iTXVCubePlayer.getVideoHeight();
                if (TXCVodVideoView.this.f73853w != 0 && TXCVodVideoView.this.f73854x != 0 && TXCVodVideoView.this.f73800I != null) {
                    TXCVodVideoView.this.f73800I.mo76430a(TXCVodVideoView.this.f73853w, TXCVodVideoView.this.f73854x);
                    TXCVodVideoView.this.f73800I.mo76433b(TXCVodVideoView.this.f73801J, TXCVodVideoView.this.f73802K);
                }
                if (TXCVodVideoView.this.f73834b == 3) {
                    TXCVodVideoView.this.m76325c(false);
                }
            }
        };
        this.f73824ak = new ITXVCubePlayer.InterfaceC34796d() { // from class: com.tencent.liteav.txcvodplayer.TXCVodVideoView.9
            @Override // com.tencent.liteav.txcplayer.ITXVCubePlayer.InterfaceC34796d
            /* JADX INFO: renamed from: a */
            public final void mo76206a() {
                TXCVodVideoView.this.f73815a = 5;
                TXCVodVideoView.this.f73834b = 5;
                TXCVodVideoView.this.m76255a(2006, 0, "Playback completed");
            }
        };
        this.f73825al = new ITXVCubePlayer.InterfaceC34798f() { // from class: com.tencent.liteav.txcvodplayer.TXCVodVideoView.10
            @Override // com.tencent.liteav.txcplayer.ITXVCubePlayer.InterfaceC34798f
            /* JADX INFO: renamed from: a */
            public final boolean mo76208a(int i12, int i13, int i14, Object obj) {
                if (i12 == -2303) {
                    TXCVodVideoView.this.f73815a = -1;
                    TXCVodVideoView.this.f73834b = -1;
                    TXCVodVideoView.this.m76255a(i12, 0, "file not found");
                    TXCVodVideoView.this.m76315a();
                    return true;
                }
                if (i12 == 1006) {
                    if (!TextUtils.isEmpty(TXCVodVideoView.this.f73803L) || obj == null || !(obj instanceof TPPlayerMsg.TPDownLoadProgressInfo)) {
                        return true;
                    }
                    try {
                        TXCVodVideoView.this.f73803L = new JSONObject(((TPPlayerMsg.TPDownLoadProgressInfo) obj).extraInfo).optString("cdnip");
                        return true;
                    } catch (Exception e11) {
                        e11.printStackTrace();
                        return true;
                    }
                }
                if (i12 == 2007) {
                    TXCVodVideoView.this.m76255a(i12, 0, "Buffer started");
                    return true;
                }
                if (i12 == 2011) {
                    TXCVodVideoView.this.m76318a("EVT_VIDEO_CHANGE_ROTATION: ".concat(String.valueOf(i13)));
                    TXCVodVideoView.this.f73793B = i13;
                    if (TXCVodVideoView.this.f73836d.f73735B && TXCVodVideoView.this.f73793B > 0) {
                        TXCVodVideoView tXCVodVideoView = TXCVodVideoView.this;
                        tXCVodVideoView.f73792A = tXCVodVideoView.f73793B;
                        if (TXCVodVideoView.this.f73800I != null) {
                            TXCVodVideoView.this.f73800I.setVideoRotation(TXCVodVideoView.this.f73792A);
                        }
                    }
                    TXCVodVideoView tXCVodVideoView2 = TXCVodVideoView.this;
                    String str = "Video angle " + TXCVodVideoView.this.f73793B;
                    int unused = TXCVodVideoView.this.f73793B;
                    tXCVodVideoView2.m76255a(2011, 0, str);
                    return true;
                }
                TPPlayerMsg.TPVideoSeiInfo tPVideoSeiInfo = null;
                str2 = null;
                String str2 = null;
                tPVideoSeiInfo = null;
                if (i12 == 2014) {
                    TXCVodVideoView.this.m76255a(i12, 0, "Buffer ended");
                    if (i13 != 0) {
                        String str3 = TXCVodVideoView.this.f73836d.f73755q;
                        if (TextUtils.isEmpty(str3) && str3.endsWith("m3u8")) {
                            return true;
                        }
                    }
                    if (TXCVodVideoView.this.f73834b != 3) {
                        return true;
                    }
                    TXCVodVideoView tXCVodVideoView3 = TXCVodVideoView.this;
                    tXCVodVideoView3.m76256a(2004, 0, "Playback started", (Bundle) null, tXCVodVideoView3.f73839g);
                    TXCVodVideoView.this.f73815a = 3;
                    TXCVodVideoView.this.f73851u.sendEmptyMessage(100);
                    TXCVodVideoView.this.f73851u.sendEmptyMessage(103);
                    return true;
                }
                if (i12 == 2020) {
                    int iLongValue = (int) ((obj == null || !(obj instanceof Long)) ? -1L : ((Long) obj).longValue());
                    TXCVodVideoView.m76261a(TXCVodVideoView.this, iLongValue, i14);
                    TXCVodVideoView.m76274b(TXCVodVideoView.this, iLongValue, i14);
                    return true;
                }
                if (i12 == 2026) {
                    TXCVodVideoView.this.m76255a(i12, 0, "Audio first play");
                    return true;
                }
                if (i12 == 2030) {
                    if (!TXCVodVideoView.f73790j) {
                        return false;
                    }
                    if (obj != null && (obj instanceof TPPlayerMsg.TPVideoSeiInfo)) {
                        tPVideoSeiInfo = (TPPlayerMsg.TPVideoSeiInfo) obj;
                    }
                    if (tPVideoSeiInfo == null) {
                        TXCVodVideoView.this.m76321b("VOD_PLAY_EVT_VIDEO_SEI, seiInfo is null");
                        return false;
                    }
                    Bundle bundle = new Bundle();
                    bundle.putInt(TXVodConstants.EVT_KEY_SEI_TYPE, tPVideoSeiInfo.videoSeiType);
                    bundle.putInt(TXVodConstants.EVT_KEY_SEI_SIZE, tPVideoSeiInfo.seiDataSize);
                    bundle.putByteArray(TXVodConstants.EVT_KEY_SEI_DATA, tPVideoSeiInfo.seiData);
                    TXCVodVideoView.this.m76257a(TXVodConstants.VOD_PLAY_EVT_VIDEO_SEI, bundle);
                    return true;
                }
                if (i12 == 2002) {
                    TXCVodVideoView.this.m76255a(i12, 0, "hit cache");
                    return true;
                }
                if (i12 == 2003) {
                    TXCVodVideoView.this.m76318a("EVT_RENDER_FIRST_I_FRAME");
                    if (TXCVodVideoView.this.f73842l) {
                        Bundle bundle2 = new Bundle();
                        if (TextUtils.isEmpty(TXCVodVideoView.this.f73843m) || !TXCVodVideoView.this.f73843m.equals(TXCVodVideoView.this.f73836d.f73755q)) {
                            bundle2.putString("support_hevc", "1");
                        } else {
                            bundle2.putString("support_hevc", "0");
                        }
                        TXCVodVideoView.this.m76256a(i12, 0, "VOD displayed the first frame", bundle2, Boolean.FALSE);
                    } else {
                        TXCVodVideoView.this.m76255a(i12, 0, "VOD displayed the first frame");
                    }
                    TXCVodVideoView tXCVodVideoView4 = TXCVodVideoView.this;
                    tXCVodVideoView4.setRate(tXCVodVideoView4.f73804M);
                    TXCVodVideoView.m76305q(TXCVodVideoView.this);
                    return true;
                }
                switch (i12) {
                    case TXVodConstants.VOD_PLAY_EVT_TCP_CONNECT_SUCC /* 2016 */:
                        if (obj != null && (obj instanceof String)) {
                            TXCVodVideoView.this.f73803L = (String) obj;
                        }
                        String str4 = "TCP Connect ServerIp:" + TXCVodVideoView.this.f73803L + ",port:" + i13 + ",error:" + i14;
                        TXCVodVideoView.this.m76318a(str4);
                        if (i14 != 0) {
                            return true;
                        }
                        TXCVodVideoView.this.m76255a(i12, 0, str4);
                        return true;
                    case TXVodConstants.VOD_PLAY_EVT_FIRST_VIDEO_PACKET /* 2017 */:
                        TXCVodVideoView.this.m76255a(i12, 0, "Video data received");
                        return true;
                    case TXVodConstants.VOD_PLAY_EVT_DNS_RESOLVED /* 2018 */:
                        if (obj != null && (obj instanceof String)) {
                            str2 = (String) obj;
                        }
                        String str5 = "dns resolved url:" + str2 + ",error:" + i13;
                        TXCVodVideoView.this.m76318a(str5);
                        if (i13 != 0) {
                            return true;
                        }
                        TXCVodVideoView.this.m76255a(i12, 0, str5);
                        return true;
                    default:
                        return true;
                }
            }
        };
        this.f73827an = new ITXVCubePlayer.InterfaceC34797e() { // from class: com.tencent.liteav.txcvodplayer.TXCVodVideoView.11
            @Override // com.tencent.liteav.txcplayer.ITXVCubePlayer.InterfaceC34797e
            /* JADX INFO: renamed from: a */
            public final boolean mo76207a(int i12, int i13) {
                TXCVodVideoView.this.m76321b("[onError] vodErrorEvent: " + i12 + " ,errorCode: " + i13);
                TXCVodVideoView.this.f73815a = -1;
                if (i12 == -6101) {
                    TXCVodVideoView.this.f73834b = -1;
                    if (TXCVodVideoView.this.f73799H != null) {
                        Object obj = TXCVodVideoView.this.f73799H.get("TXC_DRM_SIMPLE_AES_URL");
                        if ((obj instanceof String) && !TextUtils.isEmpty((String) obj)) {
                            TXCVodVideoView.this.f73799H.put("TXC_DRM_KEY_URL", null);
                            TXCVodVideoView.this.f73799H.put("TXC_DRM_PROVISION_URL", null);
                            if (!TXCVodVideoView.this.m76290g()) {
                                TXCVodVideoView.this.m76322b(false);
                            }
                            return true;
                        }
                    }
                    TXCVodVideoView.this.m76255a(TXVodConstants.VOD_PLAY_ERR_DRM, i13, "DRM play failed cause by " + i13 + C33978va.f72339h);
                    return true;
                }
                if (i12 != -6004) {
                    switch (i12) {
                        case TXVodConstants.VOD_PLAY_ERR_PROCESS_VIDEO_FAIL /* -6010 */:
                        case TXVodConstants.VOD_PLAY_ERR_RENDER_FAIL /* -6009 */:
                        case TXVodConstants.VOD_PLAY_ERR_DECODE_SUBTITLE_FAIL /* -6008 */:
                        case TXVodConstants.VOD_PLAY_ERR_DECODE_AUDIO_FAIL /* -6007 */:
                            break;
                        case TXVodConstants.VOD_PLAY_ERR_DECODE_VIDEO_FAIL /* -6006 */:
                            TXCVodVideoView.this.f73834b = -1;
                            TXCVodVideoView.m76313y(TXCVodVideoView.this);
                            break;
                        default:
                            switch (i12) {
                                case -2305:
                                    TXCVodVideoView.this.f73834b = -1;
                                    TXCVodVideoView.m76314z(TXCVodVideoView.this);
                                    break;
                                case -2304:
                                    TXCVodVideoView.this.f73834b = -1;
                                    TXCVodVideoView.m76312x(TXCVodVideoView.this);
                                    break;
                                case -2303:
                                    TXCVodVideoView.this.f73834b = -1;
                                    TXCVodVideoView.this.m76255a(-2303, i13, "The file does not exist");
                                    TXCVodVideoView.this.m76315a();
                                    break;
                                default:
                                    long currentPosition = TXCVodVideoView.this.getCurrentPosition() - TXCVodVideoView.this.f73806O;
                                    if (currentPosition < 0 || currentPosition > 500) {
                                        TXCVodVideoView.m76243B(TXCVodVideoView.this);
                                    }
                                    TXCVodVideoView tXCVodVideoView = TXCVodVideoView.this;
                                    tXCVodVideoView.f73806O = tXCVodVideoView.getCurrentPosition();
                                    if (TXCVodVideoView.m76244C(TXCVodVideoView.this) >= TXCVodVideoView.this.f73836d.f73739a) {
                                        TXCVodVideoView.this.f73834b = -1;
                                        TXCVodVideoView.this.m76255a(-2301, i13, "Disconnected from the network. Playback error");
                                        TXCVodVideoView.this.m76315a();
                                    } else {
                                        if (TXCVodVideoView.this.f73834b != 4) {
                                            TXCVodVideoView.this.f73834b = -1;
                                        }
                                        if (TXCVodVideoView.this.f73851u != null) {
                                            if (TXCVodVideoView.this.f73822ai != -1) {
                                                TXCVodVideoView tXCVodVideoView2 = TXCVodVideoView.this;
                                                TXCVodVideoView.m76274b(tXCVodVideoView2, tXCVodVideoView2.f73822ai, i12);
                                            }
                                            TXCVodVideoView.this.f73851u.sendEmptyMessageDelayed(102, (long) (TXCVodVideoView.this.f73836d.f73740b * 1000.0f));
                                        }
                                    }
                                    break;
                            }
                            break;
                    }
                    return true;
                }
                TXCVodVideoView.this.f73834b = -1;
                TXCVodVideoView.this.m76255a(i12, i13, TXCVodVideoView.m76272b(i12));
                TXCVodVideoView.this.m76315a();
                return true;
            }
        };
        this.f73828ao = new ITXVCubePlayer.InterfaceC34800h() { // from class: com.tencent.liteav.txcvodplayer.TXCVodVideoView.12
            @Override // com.tencent.liteav.txcplayer.ITXVCubePlayer.InterfaceC34800h
            /* JADX INFO: renamed from: a */
            public final void mo76210a() {
                TXCVodVideoView.m76246E(TXCVodVideoView.this);
                TXCVodVideoView.this.m76255a(TXVodConstants.VOD_PLAY_EVT_SEEK_COMPLETE, 0, "seek complete");
            }
        };
        this.f73829ap = new ITXVCubePlayer.InterfaceC34801i() { // from class: com.tencent.liteav.txcvodplayer.TXCVodVideoView.13
            @Override // com.tencent.liteav.txcplayer.ITXVCubePlayer.InterfaceC34801i
            /* JADX INFO: renamed from: a */
            public final void mo75993a(ITXVCubePlayer iTXVCubePlayer, TPSubtitleData tPSubtitleData) {
                if (TXCVodVideoView.f73790j && TXCVodVideoView.this.f73820ae != null) {
                    TXCVodVideoView.this.f73820ae.mo75993a(iTXVCubePlayer, tPSubtitleData);
                }
            }
        };
        this.f73830aq = new ITXVCubePlayer.InterfaceC34794b() { // from class: com.tencent.liteav.txcvodplayer.TXCVodVideoView.2
            @Override // com.tencent.liteav.txcplayer.ITXVCubePlayer.InterfaceC34794b
            /* JADX INFO: renamed from: a */
            public final void mo75992a(ITXVCubePlayer iTXVCubePlayer, TPSubtitleFrameBuffer tPSubtitleFrameBuffer) {
                if (tPSubtitleFrameBuffer == null || TXCVodVideoView.this.f73818ac == null) {
                    return;
                }
                TXCVodVideoView.this.f73818ac.mo75992a(iTXVCubePlayer, tPSubtitleFrameBuffer);
            }
        };
        this.f73849s = new RenderProcessService.IRenderServiceEventListener() { // from class: com.tencent.liteav.txcvodplayer.TXCVodVideoView.3
            @Override // com.tencent.liteav.txcplayer.ext.service.RenderProcessService.IRenderServiceEventListener
            public final void onRenderServiceEvent(ITXVCubePlayer iTXVCubePlayer, int i12, Bundle bundle) {
                TXCVodVideoView.this.m76257a(i12, bundle);
            }
        };
        this.f73850t = new InterfaceC34849a.a() { // from class: com.tencent.liteav.txcvodplayer.TXCVodVideoView.4
            @Override // com.tencent.liteav.txcvodplayer.renderer.InterfaceC34849a.a
            /* JADX INFO: renamed from: a */
            public final void mo76332a(InterfaceC34849a.b bVar, int i12, int i13) {
                if (bVar.mo76327a() != TXCVodVideoView.this.f73800I) {
                    TXCVodVideoView.this.m76321b("onSurfaceChanged: unmatched render callback");
                    return;
                }
                TXCVodVideoView.this.m76318a("onSurfaceChanged");
                TXCVodVideoView.this.f73855y = i12;
                TXCVodVideoView.this.f73856z = i13;
                boolean z11 = true;
                boolean z12 = TXCVodVideoView.this.f73834b == 3;
                if (TXCVodVideoView.this.f73800I.mo76432a() && (TXCVodVideoView.this.f73853w != i12 || TXCVodVideoView.this.f73854x != i13)) {
                    z11 = false;
                }
                if (TXCVodVideoView.this.f73835c != null && z12 && z11 && TXCVodVideoView.this.f73834b == 3) {
                    TXCVodVideoView.this.m76325c(false);
                }
            }

            @Override // com.tencent.liteav.txcvodplayer.renderer.InterfaceC34849a.a
            /* JADX INFO: renamed from: b */
            public final void mo76334b(InterfaceC34849a.b bVar) {
                if (bVar.mo76327a() != TXCVodVideoView.this.f73800I) {
                    TXCVodVideoView.this.m76321b("onSurfaceDestroyed: unmatched render callback");
                    return;
                }
                TXCVodVideoView.this.m76318a("onSurfaceDestroyed");
                TXCVodVideoView.this.f73797F = false;
                TXCVodVideoView.this.f73852v = null;
                if (TXCVodVideoView.this.f73835c != null) {
                    TXCVodVideoView.this.f73835c.setSurface(null);
                }
                TXCVodVideoView.this.m76319a(false);
            }

            @Override // com.tencent.liteav.txcvodplayer.renderer.InterfaceC34849a.a
            /* JADX INFO: renamed from: a */
            public final void mo76331a(InterfaceC34849a.b bVar) {
                if (bVar.mo76327a() != TXCVodVideoView.this.f73800I) {
                    TXCVodVideoView.this.m76321b("onSurfaceCreated: unmatched render callback");
                    return;
                }
                TXCVodVideoView.this.m76318a("onSurfaceCreated");
                TXCVodVideoView.this.f73797F = true;
                TXCVodVideoView.this.f73852v = bVar;
                if (TXCVodVideoView.this.f73835c == null) {
                    TXCVodVideoView.this.m76290g();
                } else {
                    TXCVodVideoView tXCVodVideoView = TXCVodVideoView.this;
                    tXCVodVideoView.m76260a(tXCVodVideoView.f73835c, bVar);
                }
            }

            @Override // com.tencent.liteav.txcvodplayer.renderer.InterfaceC34849a.a
            /* JADX INFO: renamed from: a */
            public final boolean mo76333a(MotionEvent motionEvent) {
                return RenderProcessService.getInstance().onTouchEvent(TXCVodVideoView.this.f73835c, motionEvent);
            }
        };
        this.f73831ar = 0;
        this.f73833at = false;
        m76258a(context);
    }

    /* JADX INFO: renamed from: a */
    private static void m76259a(ITXVCubePlayer iTXVCubePlayer) {
        if (iTXVCubePlayer != null) {
            RenderProcessService.getInstance().stopRenderProcess(iTXVCubePlayer);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m76316a(int i11) {
        TPTrackInfo[] trackInfo = getTrackInfo();
        if (trackInfo != null && i11 >= 0 && i11 < trackInfo.length) {
            TPTrackInfo tPTrackInfo = trackInfo[i11];
            if (tPTrackInfo.trackType == 3 && tPTrackInfo.isInternal && !f73790j) {
                return;
            }
        }
        ITXVCubePlayer iTXVCubePlayer = this.f73835c;
        if (iTXVCubePlayer != null) {
            iTXVCubePlayer.selectTrack(i11);
            m76320a(true, i11);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m76320a(boolean z11, int i11) {
        TPTrackInfo[] trackInfo = getTrackInfo();
        if (trackInfo == null || trackInfo.length == 0 || i11 < 0 || i11 >= trackInfo.length) {
            return;
        }
        TPTrackInfo tPTrackInfo = trackInfo[i11];
        if (z11) {
            if (tPTrackInfo.getTrackType() == 2) {
                this.f73822ai = i11;
                m76318a("[recordStartSelectTrackInfo] selectingAudioTrack: " + this.f73822ai + " ,vod=" + hashCode());
                return;
            }
            return;
        }
        if (tPTrackInfo.getTrackType() == 2 && this.f73822ai == i11) {
            this.f73822ai = -1;
            return;
        }
        if (tPTrackInfo.getTrackType() == 3 && this.f73823aj.contains(tPTrackInfo)) {
            this.f73823aj.remove(tPTrackInfo);
            m76318a("[recordStartSelectTrackInfo], deselect subtitle track:" + tPTrackInfo.getName() + " ,vod=" + hashCode());
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m76318a(String str) {
        LiteavLog.m76087i("TXCVodVideoView", "[" + hashCode() + "], " + str);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m76261a(TXCVodVideoView tXCVodVideoView, int i11, int i12) {
        TPTrackInfo[] trackInfo;
        if (i12 != 0 || (trackInfo = tXCVodVideoView.getTrackInfo()) == null || trackInfo.length == 0 || i11 < 0 || i11 >= trackInfo.length) {
            return;
        }
        TPTrackInfo tPTrackInfo = trackInfo[i11];
        if (tPTrackInfo.getTrackType() == 2) {
            tXCVodVideoView.f73821ah = tPTrackInfo.getName();
            tXCVodVideoView.f73822ai = -1;
            tXCVodVideoView.m76318a("[recordSelectTrackCompleteInfo] audio track name: " + tXCVodVideoView.f73821ah + " ,vod=" + tXCVodVideoView.hashCode());
            return;
        }
        if (tPTrackInfo.getTrackType() != 3 || tXCVodVideoView.f73823aj.contains(tPTrackInfo)) {
            return;
        }
        tXCVodVideoView.f73823aj.add(tPTrackInfo);
        tXCVodVideoView.m76318a("[recordSelectTrackCompleteInfo] subtitle track name: " + tPTrackInfo.getName() + " ,vod=" + tXCVodVideoView.hashCode());
    }
}
