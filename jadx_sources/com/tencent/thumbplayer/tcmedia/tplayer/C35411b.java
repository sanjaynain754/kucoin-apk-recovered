package com.tencent.thumbplayer.tcmedia.tplayer;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import android.util.Base64;
import android.util.SparseIntArray;
import android.view.Surface;
import android.view.SurfaceHolder;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.webkit.ProxyConfig;
import com.tencent.bugly.proguard.C33978va;
import com.tencent.bugly.proguard.InterfaceC33730j9;
import com.tencent.qcloud.tuicore.TUIConstants;
import com.tencent.rmonitor.base.p144db.table.DropFrameTable;
import com.tencent.thumbplayer.tcmedia.adapter.C35244b;
import com.tencent.thumbplayer.tcmedia.adapter.C35247e;
import com.tencent.thumbplayer.tcmedia.adapter.InterfaceC35230a;
import com.tencent.thumbplayer.tcmedia.adapter.p151a.C35241c;
import com.tencent.thumbplayer.tcmedia.adapter.p151a.C35243e;
import com.tencent.thumbplayer.tcmedia.api.ITPPlayer;
import com.tencent.thumbplayer.tcmedia.api.ITPPlayerListener;
import com.tencent.thumbplayer.tcmedia.api.TPAudioFrameBuffer;
import com.tencent.thumbplayer.tcmedia.api.TPCaptureCallBack;
import com.tencent.thumbplayer.tcmedia.api.TPCaptureParams;
import com.tencent.thumbplayer.tcmedia.api.TPErrorCode;
import com.tencent.thumbplayer.tcmedia.api.TPOptionalParam;
import com.tencent.thumbplayer.tcmedia.api.TPPlayerDetailInfo;
import com.tencent.thumbplayer.tcmedia.api.TPPlayerMsg;
import com.tencent.thumbplayer.tcmedia.api.TPPostProcessFrameBuffer;
import com.tencent.thumbplayer.tcmedia.api.TPProgramInfo;
import com.tencent.thumbplayer.tcmedia.api.TPRemoteSdpInfo;
import com.tencent.thumbplayer.tcmedia.api.TPSubtitleData;
import com.tencent.thumbplayer.tcmedia.api.TPSubtitleFrameBuffer;
import com.tencent.thumbplayer.tcmedia.api.TPTrackInfo;
import com.tencent.thumbplayer.tcmedia.api.TPVideoFrameBuffer;
import com.tencent.thumbplayer.tcmedia.api.TPVideoInfo;
import com.tencent.thumbplayer.tcmedia.api.composition.ITPMediaAsset;
import com.tencent.thumbplayer.tcmedia.api.composition.ITPMediaDRMAsset;
import com.tencent.thumbplayer.tcmedia.api.proxy.ITPPlayerProxy;
import com.tencent.thumbplayer.tcmedia.api.proxy.ITPPlayerProxyListener;
import com.tencent.thumbplayer.tcmedia.api.proxy.TPDownloadParamData;
import com.tencent.thumbplayer.tcmedia.api.report.ITPBusinessReportManager;
import com.tencent.thumbplayer.tcmedia.api.reportv2.ITPExtendReportController;
import com.tencent.thumbplayer.tcmedia.api.resourceloader.ITPAssetResourceLoaderListener;
import com.tencent.thumbplayer.tcmedia.api.richmedia.ITPRichMediaSynchronizer;
import com.tencent.thumbplayer.tcmedia.common.C35303a;
import com.tencent.thumbplayer.tcmedia.config.TPPlayerConfig;
import com.tencent.thumbplayer.tcmedia.core.common.TPCodecUtils;
import com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPPlayListener;
import com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.TPDLProxyMsg;
import com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.TPDownloadProxyEnum;
import com.tencent.thumbplayer.tcmedia.p156c.C35294c;
import com.tencent.thumbplayer.tcmedia.p156c.InterfaceC35288a;
import com.tencent.thumbplayer.tcmedia.p156c.p157a.C35290b;
import com.tencent.thumbplayer.tcmedia.p156c.p157a.InterfaceC35289a;
import com.tencent.thumbplayer.tcmedia.p159d.C35349b;
import com.tencent.thumbplayer.tcmedia.p160e.C35351a;
import com.tencent.thumbplayer.tcmedia.p160e.C35352b;
import com.tencent.thumbplayer.tcmedia.tplayer.p174a.C35403g;
import com.tencent.thumbplayer.tcmedia.tplayer.plugins.C35417c;
import com.tencent.thumbplayer.tcmedia.tplayer.plugins.InterfaceC35415a;
import com.tencent.thumbplayer.tcmedia.tplayer.plugins.InterfaceC35416b;
import com.tencent.thumbplayer.tcmedia.tplayer.plugins.report.C35418a;
import com.tencent.thumbplayer.tcmedia.tplayer.plugins.report.C35419b;
import com.tencent.thumbplayer.tcmedia.tplayer.plugins.report.C35420c;
import com.tencent.thumbplayer.tcmedia.tplayer.plugins.report.TPReportParams;
import com.tencent.thumbplayer.tcmedia.utils.C35422b;
import com.tencent.thumbplayer.tcmedia.utils.C35427g;
import com.tencent.thumbplayer.tcmedia.utils.C35430j;
import com.tencent.thumbplayer.tcmedia.utils.C35434n;
import com.tencent.thumbplayer.tcmedia.utils.C35435o;
import com.tencent.thumbplayer.tcmedia.utils.C35438r;
import io.chad.library.adapter.base.BaseQuickAdapter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: com.tencent.thumbplayer.tcmedia.tplayer.b */
/* JADX INFO: loaded from: classes64.dex */
public class C35411b implements ITPPlayer {

    /* JADX INFO: renamed from: F */
    private static final SparseIntArray f76430F;

    /* JADX INFO: renamed from: a */
    private static String f76431a = "api call:";

    /* JADX INFO: renamed from: v */
    private static AtomicInteger f76432v = new AtomicInteger(1000);

    /* JADX INFO: renamed from: A */
    private long f76433A;

    /* JADX INFO: renamed from: B */
    private int f76434B;

    /* JADX INFO: renamed from: C */
    private int f76435C;

    /* JADX INFO: renamed from: D */
    private TPDLProxyMsg.TPPDTInfo[] f76436D;

    /* JADX INFO: renamed from: E */
    private boolean f76437E;

    /* JADX INFO: renamed from: b */
    private final InterfaceC35230a f76438b;

    /* JADX INFO: renamed from: c */
    private C35412c f76439c;

    /* JADX INFO: renamed from: d */
    private InterfaceC35288a f76440d;

    /* JADX INFO: renamed from: e */
    private C35419b f76441e;

    /* JADX INFO: renamed from: f */
    private C35420c f76442f;

    /* JADX INFO: renamed from: g */
    private InterfaceC35289a f76443g;

    /* JADX INFO: renamed from: h */
    private InterfaceC35416b f76444h;

    /* JADX INFO: renamed from: i */
    private HandlerThread f76445i;

    /* JADX INFO: renamed from: j */
    private Looper f76446j;

    /* JADX INFO: renamed from: k */
    private a f76447k;

    /* JADX INFO: renamed from: l */
    private C35383a f76448l;

    /* JADX INFO: renamed from: m */
    private String f76449m;

    /* JADX INFO: renamed from: n */
    private boolean f76450n;

    /* JADX INFO: renamed from: o */
    private boolean f76451o;

    /* JADX INFO: renamed from: p */
    private int f76452p;

    /* JADX INFO: renamed from: q */
    private ArrayList<String> f76453q;

    /* JADX INFO: renamed from: r */
    private long f76454r;

    /* JADX INFO: renamed from: s */
    private long f76455s;

    /* JADX INFO: renamed from: t */
    private long f76456t;

    /* JADX INFO: renamed from: u */
    private C35351a f76457u;

    /* JADX INFO: renamed from: w */
    private AtomicInteger f76458w;

    /* JADX INFO: renamed from: x */
    private boolean f76459x;

    /* JADX INFO: renamed from: y */
    private C35403g f76460y;

    /* JADX INFO: renamed from: z */
    private Map<Long, Long> f76461z;

    /* JADX INFO: renamed from: com.tencent.thumbplayer.tcmedia.tplayer.b$a */
    public class a extends Handler {

        /* JADX INFO: renamed from: b */
        private C35411b f76463b;

        public a(C35411b c35411b) {
            this.f76463b = c35411b;
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            C35412c c35412c = C35411b.this.f76439c;
            if (c35412c == null) {
                return;
            }
            int i11 = message.what;
            if (i11 == 257) {
                C35411b.this.f76457u.m78141c("onPrepared");
                C35411b.this.m78654c(1004);
                c35412c.onPrepared(this.f76463b);
                return;
            }
            if (i11 == 1256) {
                C35411b.this.m78629a(message);
                return;
            }
            switch (i11) {
                case 260:
                    c35412c.onCompletion(this.f76463b);
                    break;
                case 261:
                    C35411b.this.m78646b(message.arg1);
                    C35414e.a aVar = (C35414e.a) message.obj;
                    if (aVar != null && !C35411b.this.f76440d.mo77904c()) {
                        c35412c.onInfo(this.f76463b, message.arg1, aVar.f76486a, aVar.f76487b, aVar.f76488c);
                    } else if (aVar != null) {
                        c35412c.onInfo(this.f76463b, message.arg1, aVar.f76486a, aVar.f76487b, aVar.f76488c);
                    }
                    break;
                case 262:
                    C35414e.a aVar2 = (C35414e.a) message.obj;
                    if (aVar2 != null) {
                        c35412c.onError(this.f76463b, message.arg1, message.arg2, aVar2.f76486a, aVar2.f76487b);
                    }
                    break;
                case TPReportParams.LIVE_STEP_PLAY /* 263 */:
                    c35412c.onSeekComplete(this.f76463b);
                    break;
                case 264:
                    C35414e.a aVar3 = (C35414e.a) message.obj;
                    if (aVar3 != null) {
                        c35412c.onVideoSizeChanged(this.f76463b, aVar3.f76486a, aVar3.f76487b);
                        C35411b.this.f76440d.mo77894a(aVar3.f76486a, aVar3.f76487b);
                    }
                    break;
                case 265:
                    c35412c.onSubtitleData(this.f76463b, (TPSubtitleData) message.obj);
                    break;
                case 266:
                    c35412c.onVideoFrameOut(this.f76463b, (TPVideoFrameBuffer) message.obj);
                    break;
                case 267:
                    c35412c.onAudioFrameOut(this.f76463b, (TPAudioFrameBuffer) message.obj);
                    break;
                case 268:
                    c35412c.onError(this.f76463b, message.arg1, message.arg2, 0L, 0L);
                    break;
                case 269:
                    c35412c.onInfo(this.f76463b, 1002, message.arg1, message.arg2, message.obj);
                    break;
                case 270:
                    c35412c.onInfo(this.f76463b, 1003, message.arg1, message.arg2, message.obj);
                    break;
                case 271:
                    c35412c.onInfo(this.f76463b, 1001, message.arg1, message.arg2, message.obj);
                    break;
                case 272:
                    c35412c.onInfo(this.f76463b, 1004, message.arg1, message.arg2, message.obj);
                    break;
                case BaseQuickAdapter.HEADER_VIEW /* 273 */:
                    c35412c.onInfo(this.f76463b, 1005, message.arg1, message.arg2, message.obj);
                    break;
                case 274:
                    c35412c.onInfo(this.f76463b, 1006, message.arg1, message.arg2, message.obj);
                    break;
                case 275:
                    c35412c.onInfo(this.f76463b, 1007, message.arg1, message.arg2, message.obj);
                    break;
                case 276:
                    c35412c.onInfo(this.f76463b, 1008, message.arg1, message.arg2, message.obj);
                    break;
                case 277:
                    c35412c.onStateChange(message.arg1, message.arg2);
                    break;
                case 278:
                    if (C35411b.this.f76438b != null) {
                        try {
                            C35411b.this.f76438b.mo77446a(new TPOptionalParam().buildLong(8000, message.arg1));
                            C35411b.this.f76457u.m78141c("MESSAGE_NOTIFY_PLAYER_SWITCH_DEFINITION bitrate:" + message.arg1);
                        } catch (IllegalStateException e11) {
                            C35411b.this.f76457u.m78137a(e11);
                        }
                    }
                    if (C35411b.this.f76451o) {
                        c35412c.onInfo(this.f76463b, 1010, message.arg1, message.arg2, message.obj);
                    }
                    break;
                case 279:
                    c35412c.onSubtitleFrameOut(this.f76463b, (TPSubtitleFrameBuffer) message.obj);
                    break;
                case 280:
                    c35412c.onStopAsyncComplete(this.f76463b);
                    break;
                case 281:
                    c35412c.onInfo(this.f76463b, 1015, message.arg1, message.arg2, message.obj);
                    break;
                case 282:
                    C35411b.this.m78653c();
                    break;
                case 283:
                    c35412c.onInfo(this.f76463b, 1016, message.arg1, message.arg2, message.obj);
                    break;
                case 284:
                    c35412c.onInfo(this.f76463b, 1017, message.arg1, message.arg2, message.obj);
                    break;
                case 285:
                    c35412c.onInfo(this.f76463b, 1018, message.arg1, message.arg2, message.obj);
                    break;
            }
        }

        public a(C35411b c35411b, Looper looper) {
            super(looper);
            this.f76463b = c35411b;
        }
    }

    /* JADX INFO: renamed from: com.tencent.thumbplayer.tcmedia.tplayer.b$b */
    public class b implements C35241c.a, C35241c.b, C35241c.c, C35241c.d, C35241c.e, C35241c.f, C35241c.h, C35241c.i, C35241c.j, C35241c.k, C35241c.l, C35241c.m, C35241c.n, C35241c.o, C35241c.p, ITPPlayListener {
        @Override // com.tencent.thumbplayer.tcmedia.adapter.p151a.C35241c.o
        /* JADX INFO: renamed from: a */
        public TPPostProcessFrameBuffer mo77481a(TPPostProcessFrameBuffer tPPostProcessFrameBuffer) {
            C35412c c35412c = C35411b.this.f76439c;
            if (c35412c != null) {
                return c35412c.onVideoProcessFrameOut(C35411b.this, tPPostProcessFrameBuffer);
            }
            return null;
        }

        @Override // com.tencent.thumbplayer.tcmedia.adapter.p151a.C35241c.b
        /* JADX INFO: renamed from: b */
        public TPPostProcessFrameBuffer mo77489b(TPPostProcessFrameBuffer tPPostProcessFrameBuffer) {
            C35412c c35412c = C35411b.this.f76439c;
            if (c35412c != null) {
                return c35412c.onAudioProcessFrameOut(C35411b.this, tPPostProcessFrameBuffer);
            }
            return null;
        }

        @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPPlayListener
        public Object getPlayInfo(long j11) {
            return null;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPPlayListener
        public Object onPlayCallback(int i11, Object obj, Object obj2, Object obj3, Object obj4) {
            C35411b c35411b;
            int i12;
            C35351a c35351a;
            String strConcat;
            C35411b c35411b2;
            int i13;
            if (i11 != 1) {
                if (i11 != 2) {
                    switch (i11) {
                        case 8:
                            C35411b.this.f76457u.m78141c("AB test info from download proxy received, key: " + obj + ", value: " + obj2);
                            HashMap map = new HashMap();
                            map.put((String) obj, Integer.valueOf((String) obj2));
                            C35411b.this.m78626a(281, 0, 0, (Object) map);
                            break;
                        case 9:
                            C35411b.this.f76457u.m78141c("onDownload Refresh M3U8");
                            c35411b2 = C35411b.this;
                            i13 = 282;
                            c35411b2.m78626a(i13, 0, 0, (Object) null);
                            break;
                        case 10:
                            C35411b.this.f76457u.m78141c("onDownload multi network card not open, current low speed");
                            c35411b2 = C35411b.this;
                            i13 = 283;
                            c35411b2.m78626a(i13, 0, 0, (Object) null);
                            break;
                        case 11:
                            obj = (String) obj;
                            C35411b.this.f76457u.m78141c("onDownload multi network use status change".concat(String.valueOf(obj)));
                            c35411b = C35411b.this;
                            i12 = 284;
                            break;
                        case 12:
                            C35411b.this.f76457u.m78141c("onDownload proxy hit cache");
                            c35411b2 = C35411b.this;
                            i13 = 285;
                            c35411b2.m78626a(i13, 0, 0, (Object) null);
                            break;
                    }
                } else {
                    if (obj3 instanceof Integer) {
                        Integer num = (Integer) obj3;
                        C35411b.this.f76457u.m78141c("onDownload suggest bitrate(bps):".concat(String.valueOf(num)));
                        C35411b.this.m78626a(278, num.intValue(), 0, (Object) null);
                        c35351a = C35411b.this.f76457u;
                        strConcat = "MESSAGE_NOTIFY_PLAYER_SWITCH_DEFINITION bitrate".concat(String.valueOf(num));
                    } else {
                        c35351a = C35411b.this.f76457u;
                        strConcat = "MESSAGE_NOTIFY_PLAYER_SWITCH_DEFINITION, err ext3.";
                    }
                    c35351a.m78141c(strConcat);
                }
                return null;
            }
            C35411b.this.f76457u.m78141c("onDownloadNoMoreData");
            c35411b = C35411b.this;
            i12 = 276;
            c35411b.m78626a(i12, 0, 0, obj);
            return null;
        }

        public b() {
        }

        @Override // com.tencent.thumbplayer.tcmedia.adapter.p151a.C35241c.d
        /* JADX INFO: renamed from: a */
        public TPRemoteSdpInfo mo77631a(String str, int i11) {
            C35412c c35412c = C35411b.this.f76439c;
            if (c35412c != null) {
                return c35412c.onSdpExchange(C35411b.this, str, i11);
            }
            return null;
        }

        @Override // com.tencent.thumbplayer.tcmedia.adapter.p151a.C35241c.c
        /* JADX INFO: renamed from: b */
        public void mo77490b() {
            C35411b.this.m78627a(111, 0, 0, (String) null, new C35427g().m78868a("etime", Long.valueOf(System.currentTimeMillis())).m78868a("reason", 0).m78869a());
            C35411b.this.m78626a(260, 0, 0, (Object) null);
        }

        @Override // com.tencent.thumbplayer.tcmedia.adapter.p151a.C35241c.j
        /* JADX INFO: renamed from: c */
        public void mo77491c() {
            C35411b.this.m78661f();
            C35411b.this.m78627a(110, 0, 0, (String) null, new C35427g().m78868a("etime", Long.valueOf(System.currentTimeMillis())).m78868a("petime", Long.valueOf(C35411b.this.getCurrentPositionMs())).m78869a());
            C35411b.this.m78626a(TPReportParams.LIVE_STEP_PLAY, 0, 0, (Object) null);
        }

        @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPPlayListener
        public long getAdvRemainTime() {
            ITPPlayerProxyListener iTPPlayerProxyListenerMo77911j = C35411b.this.f76440d.mo77911j();
            if (iTPPlayerProxyListenerMo77911j != null) {
                return iTPPlayerProxyListenerMo77911j.getAdvRemainTimeMs();
            }
            return -1L;
        }

        @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPPlayListener
        public String getContentType(int i11, String str) {
            if (C35411b.this.f76443g != null) {
                return C35411b.this.f76443g.mo77921c(i11, str);
            }
            C35411b.this.f76457u.m78143e("mAssetResourceLoader not set");
            return "";
        }

        @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPPlayListener
        public int getCurrentPlayClipNo() {
            InterfaceC35230a interfaceC35230a = C35411b.this.f76438b;
            if (interfaceC35230a != null) {
                return interfaceC35230a.mo77351a();
            }
            return 0;
        }

        @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPPlayListener
        public long[] getCurrentPlayOffset() {
            return C35411b.this.f76438b.mo77479u();
        }

        @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPPlayListener
        public long getCurrentPosition() {
            return C35411b.this.getCurrentPositionMs();
        }

        @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPPlayListener
        public String getDataFilePath(int i11, String str) {
            if (C35411b.this.f76443g != null) {
                return C35411b.this.f76443g.mo77919b(i11, str);
            }
            C35411b.this.f76457u.m78143e("mAssetResourceLoader not set");
            return "";
        }

        @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPPlayListener
        public long getDataTotalSize(int i11, String str) {
            if (C35411b.this.f76443g != null) {
                return C35411b.this.f76443g.mo77915a(i11, str);
            }
            C35411b.this.f76457u.m78143e("mAssetResourceLoader not set");
            return -1L;
        }

        @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPPlayListener
        public Object getPlayInfo(String str) {
            return null;
        }

        @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPPlayListener
        public long getPlayerBufferLength() {
            InterfaceC35230a interfaceC35230a = C35411b.this.f76438b;
            if (interfaceC35230a != null) {
                return interfaceC35230a.mo77474p() - C35411b.this.f76438b.mo77473o();
            }
            return 0L;
        }

        @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPPlayListener
        public void onDownloadCdnUrlExpired(Map<String, String> map) {
            C35411b.this.f76457u.m78141c("onDownloadCdnUrlExpired");
            C35411b.this.m78626a(275, 0, 0, (Object) map);
        }

        @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPPlayListener
        public void onDownloadCdnUrlInfoUpdate(String str, String str2, String str3, String str4) {
            C35411b.this.f76457u.m78141c("onDownloadCdnUrlInfoUpdate, url:" + str + ", cdnIp:" + str2 + ", uip:" + str3 + ", errorCodeStr:" + str4);
            TPPlayerMsg.TPCDNURLInfo tPCDNURLInfo = new TPPlayerMsg.TPCDNURLInfo();
            tPCDNURLInfo.url = str;
            tPCDNURLInfo.cdnIp = str2;
            tPCDNURLInfo.uIp = str3;
            C35411b.this.m78627a(201, 0, 0, (String) null, new C35427g().m78868a("url", str).m78868a("cdnip", str2).m78868a("cdnuip", str3).m78869a());
            C35411b.this.m78626a(270, 0, 0, (Object) tPCDNURLInfo);
        }

        @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPPlayListener
        public void onDownloadCdnUrlUpdate(String str) {
            C35411b.this.f76457u.m78141c("onDownloadCdnUrlUpdate, url:".concat(String.valueOf(str)));
            C35411b.this.m78626a(269, 0, 0, (Object) str);
        }

        @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPPlayListener
        public void onDownloadError(int i11, int i12, String str) {
            C35411b.this.f76457u.m78141c("onDownloadError, moduleID:" + i11 + ", errorCode:" + i12 + ", extInfo:" + str);
            C35411b.this.m78625a(i11, i12);
            C35411b.this.m78626a(268, i11, i12, (Object) str);
        }

        @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPPlayListener
        public void onDownloadFinish() {
            C35411b.this.f76457u.m78141c("onDownloadFinish");
            C35411b.this.m78626a(271, 0, 0, (Object) 0);
        }

        @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPPlayListener
        public void onDownloadProgressUpdate(int i11, int i12, long j11, long j12, String str) {
            long j13 = i11;
            C35411b.this.f76454r = j13;
            C35411b.this.f76455s = j11;
            C35411b.this.f76456t = j12;
            TPPlayerMsg.TPDownLoadProgressInfo tPDownLoadProgressInfo = new TPPlayerMsg.TPDownLoadProgressInfo();
            tPDownLoadProgressInfo.playableDurationMS = j13;
            tPDownLoadProgressInfo.downloadSpeedKBps = i12;
            tPDownLoadProgressInfo.currentDownloadSize = j11;
            tPDownLoadProgressInfo.totalFileSize = j12;
            tPDownLoadProgressInfo.extraInfo = str;
            C35411b.this.m78627a(200, 0, 0, (String) null, new C35427g().m78868a("speed", Integer.valueOf(i12)).m78868a("spanId", str).m78869a());
            C35411b.this.m78626a(274, 0, 0, (Object) tPDownLoadProgressInfo);
        }

        @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPPlayListener
        public void onDownloadProtocolUpdate(String str, String str2) {
            C35411b.this.f76457u.m78141c("onDownloadProtocolUpdate, protocol:" + str + ", protocolVer:" + str2);
            TPPlayerMsg.TPProtocolInfo tPProtocolInfo = new TPPlayerMsg.TPProtocolInfo();
            tPProtocolInfo.protocolVersion = str2;
            tPProtocolInfo.protocolName = str;
            C35411b.this.m78627a(202, 0, 0, (String) null, new C35427g().m78868a("proto", str).m78868a("protover", str2).m78869a());
            C35411b.this.m78626a(BaseQuickAdapter.HEADER_VIEW, 0, 0, (Object) tPProtocolInfo);
        }

        @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPPlayListener
        public void onDownloadStatusUpdate(int i11) {
            if (i11 != C35411b.this.f76452p) {
                C35411b.this.f76457u.m78141c("onDownloadStatusUpdate, status:".concat(String.valueOf(i11)));
                C35411b.this.f76452p = i11;
            }
            C35411b.this.m78626a(272, i11, 0, (Object) null);
        }

        @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPPlayListener
        public int onReadData(int i11, String str, long j11, long j12) {
            if (C35411b.this.f76443g != null) {
                return C35411b.this.f76443g.mo77918b(i11, str, j11, j12);
            }
            C35411b.this.f76457u.m78143e("mAssetResourceLoader not set");
            return -1;
        }

        @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPPlayListener
        public int onStartReadData(int i11, String str, long j11, long j12) {
            if (C35411b.this.f76443g != null) {
                return C35411b.this.f76443g.mo77914a(i11, str, j11, j12);
            }
            C35411b.this.f76457u.m78143e("mAssetResourceLoader not set");
            return -1;
        }

        @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPPlayListener
        public int onStopReadData(int i11, String str, int i12) {
            if (C35411b.this.f76443g != null) {
                return C35411b.this.f76443g.mo77913a(i11, str, i12);
            }
            C35411b.this.f76457u.m78143e("mAssetResourceLoader not set");
            return -1;
        }

        @Override // com.tencent.thumbplayer.tcmedia.adapter.p151a.C35241c.i
        /* JADX INFO: renamed from: a */
        public void mo77482a() {
            int i11;
            C35411b.this.updateTaskInfo(TPDownloadProxyEnum.TASKINFO_GET_METADATA_PLAY_OFFSET, 1);
            C35411b.this.f76440d.mo77892a(0);
            C35244b c35244bMo77363e = C35411b.this.f76438b.mo77363e();
            C35411b.this.updateTaskInfo(TPDownloadProxyEnum.TASKINFO_GET_METADATA_BITRATE_KBPS, Long.valueOf(((c35244bMo77363e.m77667g() + c35244bMo77363e.m77664f()) / 8) >> 10));
            C35411b c35411b = C35411b.this;
            c35411b.f76436D = c35411b.f76440d.mo77912k();
            String str = c35244bMo77363e.m77644a() + ProxyConfig.MATCH_ALL_SCHEMES + c35244bMo77363e.m77648b();
            TPTrackInfo[] tPTrackInfoArrMo77477s = C35411b.this.f76438b.mo77477s();
            if (tPTrackInfoArrMo77477s != null) {
                i11 = 0;
                for (TPTrackInfo tPTrackInfo : tPTrackInfoArrMo77477s) {
                    if (tPTrackInfo.trackType == 2) {
                        i11++;
                    }
                }
            } else {
                i11 = 0;
            }
            C35411b.this.m78627a(103, 0, 0, (String) null, new C35427g().m78868a("playertype", Integer.valueOf(C35411b.this.f76438b.mo77362d())).m78868a("definition", str).m78868a("rate", Long.valueOf(c35244bMo77363e.m77664f() / 8000)).m78868a(TypedValues.TransitionType.S_DURATION, Long.valueOf(c35244bMo77363e.m77674k())).m78868a("fmt", c35244bMo77363e.m77652c()).m78868a("etime", Long.valueOf(System.currentTimeMillis())).m78868a("multitrack", Boolean.valueOf(i11 > 1)).m78869a());
            C35411b.this.m78626a(257, 0, 0, (Object) null);
        }

        @Override // com.tencent.thumbplayer.tcmedia.adapter.p151a.C35241c.k
        /* JADX INFO: renamed from: b */
        public void mo77635b(int i11, int i12) {
            C35411b.this.m78626a(277, i11, i12, (Object) null);
        }

        @Override // com.tencent.thumbplayer.tcmedia.adapter.p151a.C35241c.f
        /* JADX INFO: renamed from: a */
        public void mo77483a(int i11, int i12, long j11, long j12) {
            String strMo77908g = C35411b.this.f76440d.mo77908g();
            C35411b.this.f76457u.m78141c("onError playerErrorCodeStr=".concat(String.valueOf(strMo77908g)));
            if (!TextUtils.isEmpty(strMo77908g)) {
                try {
                    i12 = Integer.parseInt(strMo77908g);
                    i11 = TPErrorCode.TP_ERROR_TYPE_DOWNLOAD_PROXY;
                } catch (Exception e11) {
                    C35411b.this.f76457u.m78137a(e11);
                }
            }
            C35411b.this.m78625a(i11, i12);
            C35411b.this.f76457u.m78141c("onError errorTypeReal=" + i11 + ", errorCodeReal=" + i12);
            C35414e.a aVar = new C35414e.a();
            aVar.f76486a = j11;
            aVar.f76487b = j12;
            C35411b.this.m78626a(262, i11, i12, (Object) aVar);
        }

        @Override // com.tencent.thumbplayer.tcmedia.adapter.p151a.C35241c.h
        /* JADX INFO: renamed from: a */
        public void mo77484a(int i11, long j11, long j12, Object obj) {
            C35411b.this.m78628a(i11, j11, j12, obj);
            if (i11 == 1011) {
                C35411b.this.m78638a(obj);
                return;
            }
            if (i11 != 1012) {
                Object objValueOf = i11 == 4 ? Long.valueOf(C35411b.this.m78642b(((Long) obj).longValue(), "async call select track")) : obj;
                C35414e.a aVar = new C35414e.a();
                aVar.f76486a = j11;
                aVar.f76487b = j12;
                aVar.f76488c = objValueOf;
                C35411b.this.m78626a(261, i11, 0, (Object) aVar);
                return;
            }
            C35411b.this.m78649b(obj);
        }

        @Override // com.tencent.thumbplayer.tcmedia.adapter.p151a.C35241c.p
        /* JADX INFO: renamed from: a */
        public void mo77485a(long j11, long j12) {
            C35414e.a aVar = new C35414e.a();
            aVar.f76486a = j11;
            aVar.f76487b = j12;
            C35411b.this.m78626a(264, 0, 0, (Object) aVar);
        }

        @Override // com.tencent.thumbplayer.tcmedia.adapter.p151a.C35241c.a
        /* JADX INFO: renamed from: a */
        public void mo77486a(TPAudioFrameBuffer tPAudioFrameBuffer) {
            C35412c c35412c = C35411b.this.f76439c;
            if (c35412c != null) {
                c35412c.onAudioFrameOut(C35411b.this, tPAudioFrameBuffer);
            }
        }

        @Override // com.tencent.thumbplayer.tcmedia.adapter.p151a.C35241c.e
        /* JADX INFO: renamed from: a */
        public void mo77633a(TPPlayerDetailInfo tPPlayerDetailInfo) {
            C35412c c35412c = C35411b.this.f76439c;
            if (c35412c != null) {
                c35412c.onDetailInfo(C35411b.this, tPPlayerDetailInfo);
            }
        }

        @Override // com.tencent.thumbplayer.tcmedia.adapter.p151a.C35241c.l
        /* JADX INFO: renamed from: a */
        public void mo77487a(TPSubtitleData tPSubtitleData) {
            C35411b.this.m78626a(265, 0, 0, (Object) tPSubtitleData);
        }

        @Override // com.tencent.thumbplayer.tcmedia.adapter.p151a.C35241c.m
        /* JADX INFO: renamed from: a */
        public void mo77636a(TPSubtitleFrameBuffer tPSubtitleFrameBuffer) {
            C35411b.this.m78626a(279, 0, 0, (Object) tPSubtitleFrameBuffer);
        }

        @Override // com.tencent.thumbplayer.tcmedia.adapter.p151a.C35241c.n
        /* JADX INFO: renamed from: a */
        public void mo77488a(TPVideoFrameBuffer tPVideoFrameBuffer) {
            C35412c c35412c = C35411b.this.f76439c;
            if (c35412c != null) {
                c35412c.onVideoFrameOut(C35411b.this, tPVideoFrameBuffer);
            }
        }

        @Override // com.tencent.thumbplayer.tcmedia.adapter.p151a.C35241c.d
        /* JADX INFO: renamed from: d */
        public void mo77632d() {
        }
    }

    public C35411b(Context context) {
        this(context, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public long m78642b(long j11, String str) {
        if (!this.f76461z.containsKey(Long.valueOf(j11))) {
            this.f76457u.m78143e(str + ", invalid uniqueId");
            return -1L;
        }
        long jLongValue = this.f76461z.get(Long.valueOf(j11)).longValue();
        this.f76457u.m78141c(str + ", convert uniqueId(" + j11 + ") => opaque(" + jLongValue + ")");
        return jLongValue;
    }

    /* JADX INFO: renamed from: d */
    private void m78656d() {
        this.f76438b.mo77469k();
        m78627a(107, 0, 0, (String) null, new C35427g().m78868a("etime", Long.valueOf(System.currentTimeMillis())).m78868a("reason", 1).m78869a());
        this.f76440d.mo77892a(5);
        this.f76440d.mo77909h();
        this.f76454r = -1L;
        this.f76455s = -1L;
        this.f76456t = -1L;
    }

    /* JADX INFO: renamed from: h */
    private boolean m78664h() {
        int iMo77359b = this.f76438b.mo77359b();
        return iMo77359b == 4 || iMo77359b == 5 || iMo77359b == 6 || iMo77359b == 7;
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.ITPPlayer
    @C35434n.b
    public void addAudioTrackSource(String str, String str2) {
        this.f76457u.m78141c(f76431a + "addAudioTrackSource, url:" + str + ", name:" + str2);
        addAudioTrackSource(str, str2, null);
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.ITPPlayer
    @C35434n.b(m78916c = true)
    public void addSubtitleSource(String str, String str2, String str3) {
        this.f76457u.m78141c(f76431a + "addSubtitleSource, url:" + str + ", mimeType:" + str2 + ", name:" + str3);
        addSubtitleSource(str, str2, str3, null);
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.ITPPlayer
    @C35434n.b
    public void seekTo(int i11) {
        this.f76457u.m78141c(f76431a + "seekTo, positionMs:" + i11);
        this.f76438b.mo77423a(i11);
        this.f76440d.mo77892a(1);
        m78627a(109, 0, 0, (String) null, new C35427g().m78868a("stime", Long.valueOf(System.currentTimeMillis())).m78868a(TUIConstants.TUIGroupNotePlugin.PLUGIN_GROUP_NOTE_FORMAT, 0).m78868a("pstime", Long.valueOf(getCurrentPositionMs())).m78869a());
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.ITPPlayer
    @C35434n.b
    public void setDataSource(AssetFileDescriptor assetFileDescriptor) {
        if (assetFileDescriptor == null) {
            throw new IllegalArgumentException("error : setDataSource , param is null");
        }
        if (this.f76438b.mo77359b() != 1) {
            throw new IllegalStateException("error : setDataSource , state invalid. current state:" + this.f76438b.mo77359b());
        }
        m78639a("", 4, false);
        this.f76457u.m78141c(f76431a + "setDataSource, AssetFileDescriptor");
        try {
            this.f76438b.mo77426a(assetFileDescriptor);
        } catch (IOException | SecurityException e11) {
            this.f76457u.m78137a(e11);
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.ITPPlayer
    @C35434n.b(m78915b = true, m78916c = true)
    public void setLoopback(boolean z11) {
        this.f76457u.m78141c(f76431a + "setLoopback, isLoopback:" + z11);
        try {
            this.f76438b.mo77461b(z11);
        } catch (Exception e11) {
            this.f76457u.m78137a(e11);
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.ITPPlayer
    @C35434n.b(m78915b = true, m78916c = true)
    public void switchDefinition(ITPMediaAsset iTPMediaAsset, long j11, TPVideoInfo tPVideoInfo) {
        this.f76457u.m78141c(f76431a + "switchDefinition, mediaAsset:" + iTPMediaAsset + ", defID:" + j11 + ", videoInfo:" + tPVideoInfo);
        switchDefinition(iTPMediaAsset, j11, tPVideoInfo, 0);
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f76430F = sparseIntArray;
        sparseIntArray.put(106, 1005);
        sparseIntArray.put(105, 1006);
    }

    public C35411b(Context context, Looper looper) {
        this(context, looper, null);
    }

    /* JADX INFO: renamed from: a */
    private int m78618a(String str) {
        if (this.f76440d.mo77901a()) {
            return 5;
        }
        return C35438r.m78938a(str);
    }

    /* JADX INFO: renamed from: e */
    private boolean m78659e() {
        return this.f76440d.mo77907f() && TPPlayerConfig.isUseP2P() && this.f76450n;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public void m78661f() {
        this.f76440d.mo77892a(this.f76438b.mo77361c() ? 0 : 5);
    }

    /* JADX INFO: renamed from: g */
    private void m78663g() {
        C35414e.a aVar = new C35414e.a();
        aVar.f76486a = m78659e() ? 1L : 0L;
        m78626a(261, 1009, 0, (Object) aVar);
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.ITPPlayer
    @C35434n.b
    public void addAudioTrackSource(String str, String str2, TPDownloadParamData tPDownloadParamData) {
        this.f76457u.m78141c(f76431a + "addAudioTrackSource, url:" + str + ", name:" + str2 + ", downloadParamData:" + tPDownloadParamData);
        if (TextUtils.isEmpty(str2) || !C35422b.m78849d(str)) {
            this.f76457u.m78143e("handleAddAudioSource, illegal argument.");
            return;
        }
        try {
            ArrayList arrayList = new ArrayList();
            TPOptionalParam tPOptionalParam = new TPOptionalParam();
            if (tPDownloadParamData != null) {
                tPOptionalParam.buildObject(0, tPDownloadParamData);
            }
            arrayList.add(tPOptionalParam);
            this.f76438b.mo77455a(str, (tPDownloadParamData == null || tPDownloadParamData.getUrlCdnidHttpHeaderList() == null || tPDownloadParamData.getUrlCdnidHttpHeaderList().isEmpty()) ? null : tPDownloadParamData.getUrlCdnidHttpHeaderList().get(0), str2, arrayList);
        } catch (Exception e11) {
            this.f76457u.m78137a(e11);
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x004c  */
    /* JADX WARN: Code duplicated, block: B:18:0x006b  */
    @Override // com.tencent.thumbplayer.tcmedia.api.ITPPlayer
    @C35434n.b(m78916c = true)
    public void addSubtitleSource(String str, String str2, String str3, TPDownloadParamData tPDownloadParamData) {
        C35411b c35411b;
        Exception exc;
        String strMo77890a;
        Map<String, String> map;
        this.f76457u.m78141c(f76431a + "addSubtitleSource, url:" + str + ", name:" + str3 + ", downloadParamData:" + tPDownloadParamData);
        try {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (!m78659e()) {
                strMo77890a = str;
                if (tPDownloadParamData != null) {
                    map = null;
                } else {
                    map = null;
                }
                this.f76438b.mo77454a(strMo77890a, map, str2, str3);
                c35411b = this;
                c35411b.m78627a(118, 0, 0, (String) null, new C35427g().m78868a("stime", Long.valueOf(jCurrentTimeMillis)).m78868a("etime", Long.valueOf(System.currentTimeMillis())).m78868a("url", str).m78868a("name", str3).m78869a());
                return;
            }
            try {
                if (C35422b.m78849d(str)) {
                    strMo77890a = this.f76440d.mo77890a(3, str, tPDownloadParamData);
                    this.f76453q.add(strMo77890a);
                } else {
                    strMo77890a = str;
                }
                if (tPDownloadParamData != null || tPDownloadParamData.getUrlCdnidHttpHeaderList() == null || tPDownloadParamData.getUrlCdnidHttpHeaderList().isEmpty()) {
                    map = null;
                } else {
                    map = tPDownloadParamData.getUrlCdnidHttpHeaderList().get(0);
                }
                this.f76438b.mo77454a(strMo77890a, map, str2, str3);
                c35411b = this;
                try {
                    c35411b.m78627a(118, 0, 0, (String) null, new C35427g().m78868a("stime", Long.valueOf(jCurrentTimeMillis)).m78868a("etime", Long.valueOf(System.currentTimeMillis())).m78868a("url", str).m78868a("name", str3).m78869a());
                    return;
                } catch (Exception e11) {
                    e = e11;
                    exc = e;
                    c35411b.f76457u.m78137a(exc);
                }
            } catch (Exception e12) {
                exc = e12;
                c35411b = this;
            }
        } catch (Exception e13) {
            e = e13;
            c35411b = this;
        }
        c35411b.f76457u.m78137a(exc);
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.ITPPlayer
    @C35434n.b(m78914a = true)
    public void captureVideo(TPCaptureParams tPCaptureParams, TPCaptureCallBack tPCaptureCallBack) {
        this.f76457u.m78141c(f76431a + "captureVideo, params:" + tPCaptureParams + ", captureCallBack:" + tPCaptureCallBack);
        try {
            this.f76438b.mo77445a(tPCaptureParams, tPCaptureCallBack);
        } catch (Exception e11) {
            this.f76457u.m78137a(e11);
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.ITPPlayer
    @C35434n.b
    public void deselectTrack(int i11, long j11) {
        this.f76457u.m78141c(f76431a + "deselectTrack, trackIndex:" + i11 + ", opaque:" + j11);
        try {
            this.f76438b.mo77460b(i11, j11);
        } catch (Exception e11) {
            this.f76457u.m78137a(e11);
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.ITPPlayer
    @C35434n.b
    public void enableTPAssetResourceLoader(ITPAssetResourceLoaderListener iTPAssetResourceLoaderListener, Looper looper) {
        if (iTPAssetResourceLoaderListener == null) {
            this.f76440d.mo77900a(false);
            return;
        }
        this.f76440d.mo77900a(true);
        InterfaceC35289a interfaceC35289a = this.f76443g;
        if (interfaceC35289a != null) {
            interfaceC35289a.mo77922c();
            this.f76443g = null;
        }
        C35290b c35290b = new C35290b(this.f76448l.m78352a(), looper);
        this.f76443g = c35290b;
        c35290b.mo77917a(iTPAssetResourceLoaderListener);
        this.f76443g.mo77916a();
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.ITPPlayer
    public int getBufferPercent() {
        if (this.f76438b.mo77472n() == 0) {
            return 0;
        }
        return (int) (((this.f76438b.mo77474p() - this.f76438b.mo77473o()) * 100.0f) / this.f76438b.mo77472n());
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.ITPPlayer
    public long getCurrentPositionMs() {
        return this.f76438b.mo77473o();
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.ITPPlayer
    public int getCurrentState() {
        return this.f76438b.mo77359b();
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.ITPPlayer
    public long getDurationMs() {
        return this.f76438b.mo77472n();
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.ITPPlayer
    public ITPExtendReportController getExtendReportController() {
        return this.f76460y;
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.ITPPlayer
    public long getPdtTimeMs(long j11) {
        TPDLProxyMsg.TPPDTInfo[] tPPDTInfoArr = this.f76436D;
        if (tPPDTInfoArr != null && tPPDTInfoArr.length != 0) {
            if (j11 >= getDurationMs()) {
                TPDLProxyMsg.TPPDTInfo[] tPPDTInfoArr2 = this.f76436D;
                return tPPDTInfoArr2[tPPDTInfoArr2.length - 1].pdtTimeEndMS;
            }
            if (j11 <= 0) {
                return this.f76436D[0].pdtTimeStartMS;
            }
            for (TPDLProxyMsg.TPPDTInfo tPPDTInfo : this.f76436D) {
                float f11 = tPPDTInfo.durationStart;
                if (j11 >= ((long) (f11 * 1000.0f)) && j11 <= ((long) (tPPDTInfo.durationEnd * 1000.0f))) {
                    return Math.min(tPPDTInfo.pdtTimeStartMS + (j11 - ((long) (f11 * 1000.0f))), tPPDTInfo.pdtTimeEndMS);
                }
            }
        }
        return -1L;
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.ITPPlayer
    public ITPPlayerProxy getPlayerProxy() {
        return this.f76440d;
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.ITPPlayer
    public int getPlayerType() {
        return this.f76438b.mo77362d();
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.ITPPlayer
    public long getPositionMs(long j11) {
        TPDLProxyMsg.TPPDTInfo[] tPPDTInfoArr = this.f76436D;
        if (tPPDTInfoArr != null && tPPDTInfoArr.length != 0) {
            if (j11 >= tPPDTInfoArr[tPPDTInfoArr.length - 1].pdtTimeEndMS) {
                return getDurationMs();
            }
            if (j11 <= tPPDTInfoArr[0].pdtTimeStartMS) {
                return 0L;
            }
            for (TPDLProxyMsg.TPPDTInfo tPPDTInfo : tPPDTInfoArr) {
                long j12 = tPPDTInfo.pdtTimeStartMS;
                if (j11 >= j12 && j11 <= tPPDTInfo.pdtTimeEndMS) {
                    return Math.min(((long) (tPPDTInfo.durationStart * 1000.0f)) + (j11 - j12), getDurationMs());
                }
            }
        }
        return -1L;
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.ITPPlayer
    public TPProgramInfo[] getProgramInfo() {
        return this.f76438b.mo77478t();
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.ITPPlayer
    public long getPropertyLong(int i11) {
        return this.f76438b.mo77458b(i11);
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.ITPPlayer
    public String getPropertyString(int i11) {
        return this.f76438b.mo77463c(i11);
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.ITPPlayer
    public ITPBusinessReportManager getReportManager() {
        C35419b c35419b = this.f76441e;
        return c35419b == null ? this.f76442f : c35419b;
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.ITPPlayer
    public TPTrackInfo[] getTrackInfo() {
        return this.f76438b.mo77477s();
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.ITPPlayer
    public int getVideoHeight() {
        return this.f76438b.mo77476r();
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.ITPPlayer
    public int getVideoWidth() {
        return this.f76438b.mo77475q();
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.ITPPlayer
    @C35434n.b
    public void pause() {
        C35411b c35411b;
        this.f76457u.m78141c(f76431a + "pause");
        this.f76438b.mo77468j();
        try {
            c35411b = this;
            try {
                c35411b.m78627a(106, 0, 0, (String) null, new C35427g().m78868a("stime", Long.valueOf(System.currentTimeMillis())).m78869a());
                c35411b.f76440d.mo77892a(5);
            } catch (Exception e11) {
                e = e11;
                c35411b.f76457u.m78137a(e);
            }
        } catch (Exception e12) {
            e = e12;
            c35411b = this;
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.ITPPlayer
    @C35434n.b
    public void pauseDownload() {
        this.f76457u.m78141c(f76431a + "pauseDownload");
        try {
            this.f76438b.mo77446a(new TPOptionalParam().buildLong(502, 0L));
        } catch (Exception e11) {
            this.f76457u.m78137a(e11);
        }
        this.f76440d.mo77909h();
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.ITPPlayer
    @C35434n.b
    public void prepareAsync() {
        C35411b c35411b;
        try {
            try {
                String str = UUID.randomUUID().toString() + System.nanoTime() + "_" + TPPlayerConfig.getPlatform();
                m78624a(1003);
                this.f76457u.m78141c(f76431a + "prepareAsync");
                C35419b c35419b = this.f76441e;
                boolean zM78793c = c35419b != null ? c35419b.m78793c() : true;
                C35403g c35403g = this.f76460y;
                if (c35403g != null) {
                    c35403g.m78578a(zM78793c);
                }
                try {
                    this.f76440d.mo77910i();
                    this.f76438b.mo77466h();
                } catch (RuntimeException e11) {
                    this.f76457u.m78137a(e11);
                }
                m78650b(str);
                try {
                    Map mapM78869a = new C35427g().m78868a("stime", Long.valueOf(System.currentTimeMillis())).m78868a("url", this.f76449m).m78868a("p2p", Boolean.valueOf(m78659e())).m78868a("flowid", str).m78869a();
                    c35411b = this;
                    try {
                        c35411b.m78627a(102, 0, 0, (String) null, mapM78869a);
                        m78663g();
                    } catch (Exception e12) {
                        e = e12;
                        try {
                            c35411b.f76457u.m78137a(e);
                        } catch (IOException e13) {
                            e = e13;
                            c35411b.f76457u.m78137a(e);
                        } catch (IllegalStateException e14) {
                            e = e14;
                            c35411b.f76457u.m78137a(e);
                        }
                    }
                } catch (Exception e15) {
                    e = e15;
                    c35411b = this;
                }
            } catch (IllegalStateException e16) {
                e = e16;
                c35411b = this;
                c35411b.f76457u.m78137a(e);
            }
        } catch (IOException e17) {
            e = e17;
            c35411b = this;
            c35411b.f76457u.m78137a(e);
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.ITPPlayer
    @C35434n.b(m78914a = true)
    public void release() {
        this.f76457u.m78141c(f76431a + "release");
        this.f76438b.mo77471m();
        m78627a(112, 0, 0, (String) null, new C35427g().m78868a("etime", Long.valueOf(System.currentTimeMillis())).m78868a("reason", 1).m78869a());
        this.f76439c.m78669a();
        this.f76440d.mo77906e();
        this.f76453q.clear();
        InterfaceC35289a interfaceC35289a = this.f76443g;
        if (interfaceC35289a != null) {
            interfaceC35289a.mo77922c();
            this.f76443g = null;
        }
        this.f76454r = -1L;
        this.f76455s = -1L;
        this.f76456t = -1L;
        C35435o.m78917a().m78921a(this.f76445i, this.f76447k);
        this.f76445i = null;
        this.f76447k = null;
        this.f76444h.mo78694c();
        C35403g c35403g = this.f76460y;
        if (c35403g != null) {
            c35403g.m78579b();
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.ITPPlayer
    @C35434n.b(m78914a = true)
    public void reset() {
        this.f76457u.m78141c(f76431a + "reset");
        if (this.f76459x) {
            this.f76457u.m78138a(String.valueOf(this.f76458w.incrementAndGet()));
            this.f76438b.mo77449a(this.f76457u.m78135a());
            this.f76439c.m78686a(this.f76457u.m78135a().m78145a());
        }
        this.f76438b.mo77470l();
        m78627a(113, 0, 0, (String) null, new C35427g().m78868a("etime", Long.valueOf(System.currentTimeMillis())).m78868a("reason", 1).m78869a());
        this.f76440d.mo77905d();
        this.f76452p = -1;
        this.f76453q.clear();
        InterfaceC35289a interfaceC35289a = this.f76443g;
        if (interfaceC35289a != null) {
            interfaceC35289a.mo77920b();
        }
        a aVar = this.f76447k;
        if (aVar != null) {
            aVar.removeCallbacksAndMessages(null);
        }
        this.f76454r = -1L;
        this.f76455s = -1L;
        this.f76456t = -1L;
        this.f76450n = true;
        this.f76451o = false;
        this.f76434B = 0;
        this.f76435C = 0;
        this.f76461z.clear();
        this.f76433A = 0L;
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.ITPPlayer
    @C35434n.b
    public void resumeDownload() {
        this.f76457u.m78141c(f76431a + "resumeDownload");
        this.f76440d.mo77910i();
        try {
            this.f76438b.mo77446a(new TPOptionalParam().buildLong(502, 1L));
        } catch (Exception e11) {
            this.f76457u.m78137a(e11);
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.ITPPlayer
    @C35434n.b
    public void seekTo(int i11, int i12) {
        this.f76457u.m78141c(f76431a + "seekTo, positionMs:" + i11 + ", mode:" + i12);
        if (i12 > 0) {
            this.f76438b.mo77424a(i11, i12);
        } else {
            this.f76438b.mo77423a(i11);
        }
        this.f76440d.mo77892a(1);
        m78627a(109, 0, 0, (String) null, new C35427g().m78868a("stime", Long.valueOf(System.currentTimeMillis())).m78868a(TUIConstants.TUIGroupNotePlugin.PLUGIN_GROUP_NOTE_FORMAT, 0).m78868a("pstime", Long.valueOf(getCurrentPositionMs())).m78869a());
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.ITPPlayer
    @C35434n.b
    public void selectProgram(int i11, long j11) {
        this.f76457u.m78141c(f76431a + "selectProgram, programIndex:" + i11 + ", opaque:" + j11);
        try {
            this.f76438b.mo77464c(i11, j11);
        } catch (Exception e11) {
            this.f76457u.m78137a(e11);
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.ITPPlayer
    @C35434n.b
    public void selectTrack(int i11, long j11) {
        C35411b c35411b;
        this.f76457u.m78141c(f76431a + "selectTrack, trackIndex:" + i11 + ", opaque:" + j11);
        try {
            long jM78619a = m78619a(j11, "selectTrack");
            TPTrackInfo[] tPTrackInfoArrMo77477s = this.f76438b.mo77477s();
            if (tPTrackInfoArrMo77477s == null || tPTrackInfoArrMo77477s.length <= i11) {
                c35411b = this;
            } else {
                c35411b = this;
                try {
                    c35411b.m78627a(122, 0, 0, (String) null, new C35427g().m78868a("opaque", Long.valueOf(jM78619a)).m78868a("tracktype", Integer.valueOf(tPTrackInfoArrMo77477s[i11].getTrackType())).m78868a("name", tPTrackInfoArrMo77477s[i11].getName()).m78868a("stime", Long.valueOf(System.currentTimeMillis())).m78869a());
                } catch (Exception e11) {
                    e = e11;
                    c35411b.f76457u.m78137a(e);
                    return;
                }
            }
            c35411b.f76438b.mo77425a(i11, jM78619a);
        } catch (Exception e12) {
            e = e12;
            c35411b = this;
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.ITPPlayer
    @C35434n.b(m78915b = true)
    public void setAudioGainRatio(float f11) {
        this.f76457u.m78141c(f76431a + "setAudioGainRatio, gainRatio:" + f11);
        try {
            this.f76438b.mo77422a(f11);
        } catch (Exception e11) {
            this.f76457u.m78137a(e11);
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.ITPPlayer
    @C35434n.b(m78915b = true)
    public void setAudioNormalizeVolumeParams(String str) {
        this.f76457u.m78141c(f76431a + "setAudioNormalizeVolumeParams, audioNormalizeVolumeParams:" + str);
        try {
            this.f76438b.mo77450a(str);
        } catch (Exception e11) {
            this.f76457u.m78137a(e11);
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.ITPPlayer
    @C35434n.b
    public void setDataSource(ParcelFileDescriptor parcelFileDescriptor) {
        if (parcelFileDescriptor == null) {
            throw new IllegalArgumentException("error : setDataSource , param is null");
        }
        if (this.f76438b.mo77359b() != 1) {
            throw new IllegalStateException("error : setDataSource , state invalid. current state:" + this.f76438b.mo77359b());
        }
        m78639a("", 4, false);
        this.f76457u.m78141c(f76431a + "setDataSource, ParcelFileDescriptor");
        try {
            this.f76438b.mo77427a(parcelFileDescriptor);
        } catch (IOException | SecurityException e11) {
            this.f76457u.m78137a(e11);
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.ITPPlayer
    @C35434n.b(m78915b = true, m78916c = true)
    public void setLoopback(boolean z11, long j11, long j12) {
        this.f76457u.m78141c(f76431a + "setLoopback, isLoopback:" + z11 + ", loopStartPositionMs:" + j11 + ", loopEndPositionMs:" + j12);
        try {
            this.f76438b.mo77457a(z11, j11, j12);
        } catch (Exception e11) {
            this.f76457u.m78137a(e11);
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.ITPPlayer
    public void setOnAudioFrameOutputListener(ITPPlayerListener.IOnAudioFrameOutputListener iOnAudioFrameOutputListener) {
        C35412c c35412c = this.f76439c;
        if (c35412c != null) {
            c35412c.m78670a(iOnAudioFrameOutputListener);
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.ITPPlayer
    public void setOnAudioProcessFrameOutputListener(ITPPlayerListener.IOnAudioProcessFrameOutputListener iOnAudioProcessFrameOutputListener) {
        C35412c c35412c = this.f76439c;
        if (c35412c != null) {
            c35412c.m78671a(iOnAudioProcessFrameOutputListener);
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.ITPPlayer
    public void setOnCompletionListener(ITPPlayerListener.IOnCompletionListener iOnCompletionListener) {
        C35412c c35412c = this.f76439c;
        if (c35412c != null) {
            c35412c.m78672a(iOnCompletionListener);
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.ITPPlayer
    public void setOnDemuxerListener(ITPPlayerListener.IOnDemuxerListener iOnDemuxerListener) {
        C35412c c35412c = this.f76439c;
        if (c35412c != null) {
            c35412c.m78673a(iOnDemuxerListener);
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.ITPPlayer
    public void setOnDetailInfoListener(ITPPlayerListener.IOnDetailInfoListener iOnDetailInfoListener) {
        C35412c c35412c = this.f76439c;
        if (c35412c != null) {
            c35412c.m78674a(iOnDetailInfoListener);
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.ITPPlayer
    public void setOnErrorListener(ITPPlayerListener.IOnErrorListener iOnErrorListener) {
        C35412c c35412c = this.f76439c;
        if (c35412c != null) {
            c35412c.m78675a(iOnErrorListener);
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.ITPPlayer
    public void setOnInfoListener(ITPPlayerListener.IOnInfoListener iOnInfoListener) {
        C35412c c35412c = this.f76439c;
        if (c35412c != null) {
            c35412c.m78676a(iOnInfoListener);
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.ITPPlayer
    public void setOnPlayerStateChangeListener(ITPPlayerListener.IOnStateChangeListener iOnStateChangeListener) {
        C35412c c35412c = this.f76439c;
        if (c35412c != null) {
            c35412c.m78679a(iOnStateChangeListener);
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.ITPPlayer
    public void setOnPreparedListener(ITPPlayerListener.IOnPreparedListener iOnPreparedListener) {
        C35412c c35412c = this.f76439c;
        if (c35412c != null) {
            c35412c.m78677a(iOnPreparedListener);
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.ITPPlayer
    public void setOnSeekCompleteListener(ITPPlayerListener.IOnSeekCompleteListener iOnSeekCompleteListener) {
        C35412c c35412c = this.f76439c;
        if (c35412c != null) {
            c35412c.m78678a(iOnSeekCompleteListener);
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.ITPPlayer
    public void setOnStopAsyncCompleteListener(ITPPlayerListener.IOnStopAsyncCompleteListener iOnStopAsyncCompleteListener) {
        C35412c c35412c = this.f76439c;
        if (c35412c != null) {
            c35412c.m78680a(iOnStopAsyncCompleteListener);
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.ITPPlayer
    public void setOnSubtitleDataListener(ITPPlayerListener.IOnSubtitleDataListener iOnSubtitleDataListener) {
        C35412c c35412c = this.f76439c;
        if (c35412c != null) {
            c35412c.m78681a(iOnSubtitleDataListener);
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.ITPPlayer
    public void setOnSubtitleFrameOutListener(ITPPlayerListener.IOnSubtitleFrameOutListener iOnSubtitleFrameOutListener) {
        C35412c c35412c = this.f76439c;
        if (c35412c != null) {
            c35412c.m78682a(iOnSubtitleFrameOutListener);
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.ITPPlayer
    public void setOnVideoFrameOutListener(ITPPlayerListener.IOnVideoFrameOutListener iOnVideoFrameOutListener) {
        C35412c c35412c = this.f76439c;
        if (c35412c != null) {
            c35412c.m78683a(iOnVideoFrameOutListener);
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.ITPPlayer
    public void setOnVideoProcessFrameOutputListener(ITPPlayerListener.IOnVideoProcessFrameOutputListener iOnVideoProcessFrameOutputListener) {
        C35412c c35412c = this.f76439c;
        if (c35412c != null) {
            c35412c.m78684a(iOnVideoProcessFrameOutputListener);
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.ITPPlayer
    public void setOnVideoSizeChangedListener(ITPPlayerListener.IOnVideoSizeChangedListener iOnVideoSizeChangedListener) {
        C35412c c35412c = this.f76439c;
        if (c35412c != null) {
            c35412c.m78685a(iOnVideoSizeChangedListener);
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.ITPPlayer
    @C35434n.b(m78915b = true)
    public void setOutputMute(boolean z11) {
        this.f76457u.m78141c(f76431a + "setOutputMute, isOutputMute:" + z11);
        try {
            this.f76438b.mo77456a(z11);
        } catch (Exception e11) {
            this.f76457u.m78137a(e11);
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.ITPPlayer
    @C35434n.b(m78915b = true)
    public void setPlaySpeedRatio(float f11) {
        this.f76457u.m78141c(f76431a + "setPlaySpeedRatio, speedRatio:" + f11);
        try {
            this.f76440d.mo77891a(f11);
            this.f76438b.mo77459b(f11);
        } catch (Exception e11) {
            this.f76457u.m78137a(e11);
        }
        m78627a(116, 0, 0, (String) null, new C35427g().m78868a(DropFrameTable.COLUMN_SCENE, Float.valueOf(f11)).m78869a());
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.ITPPlayer
    @C35434n.b
    public void setRichMediaSynchronizer(ITPRichMediaSynchronizer iTPRichMediaSynchronizer) {
        this.f76438b.mo77358a(iTPRichMediaSynchronizer);
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.ITPPlayer
    @C35434n.b
    public void setSurface(Surface surface) {
        this.f76457u.m78141c(f76431a + "setSurface, surface:" + surface);
        try {
            this.f76438b.mo77428a(surface);
        } catch (Exception e11) {
            this.f76457u.m78137a(e11);
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.ITPPlayer
    @C35434n.b
    public void setSurfaceHolder(SurfaceHolder surfaceHolder) {
        this.f76457u.m78141c(f76431a + "setSurfaceHolder, SurfaceHolder:" + surfaceHolder);
        try {
            this.f76438b.mo77429a(surfaceHolder);
        } catch (Exception e11) {
            this.f76457u.m78137a(e11);
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.ITPPlayer
    @C35434n.b(m78916c = true)
    public void setVideoInfo(TPVideoInfo tPVideoInfo) {
        if (tPVideoInfo != null) {
            try {
                m78622a(tPVideoInfo, this.f76434B, this.f76435C);
                this.f76440d.mo77896a(tPVideoInfo);
                this.f76438b.mo77357a(tPVideoInfo);
            } catch (Exception e11) {
                this.f76457u.m78137a(e11);
            }
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.ITPPlayer
    @C35434n.b
    public void start() {
        C35411b c35411b;
        this.f76457u.m78141c(f76431a + "start");
        this.f76438b.mo77467i();
        try {
            c35411b = this;
            try {
                c35411b.m78627a(104, 0, 0, (String) null, new C35427g().m78868a("stime", Long.valueOf(System.currentTimeMillis())).m78869a());
                c35411b.f76440d.mo77892a(0);
            } catch (Exception e11) {
                e = e11;
                c35411b.f76457u.m78137a(e);
            }
        } catch (Exception e12) {
            e = e12;
            c35411b = this;
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.ITPPlayer
    @C35434n.b(m78914a = true)
    public void stop() {
        this.f76457u.m78141c(f76431a + InterfaceC33730j9.f70350a);
        m78656d();
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.ITPPlayer
    @C35434n.b
    public void stopAsync() {
        try {
            this.f76457u.m78141c(f76431a + "stopAsync");
            m78656d();
            m78626a(280, 0, 0, (Object) null);
        } catch (IllegalStateException e11) {
            this.f76457u.m78137a(e11);
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.ITPPlayer
    @C35434n.b(m78915b = true, m78916c = true)
    public void switchDefinition(ITPMediaAsset iTPMediaAsset, long j11, TPVideoInfo tPVideoInfo, int i11) {
        if (!m78664h()) {
            throw new IllegalStateException("error : switchDefinition , state invalid");
        }
        this.f76457u.m78141c(f76431a + "switchDefinition, mediaAsset:" + iTPMediaAsset + ", defID:" + j11 + ", videoInfo:" + tPVideoInfo + ", mode:" + i11);
        TPVideoInfo tPVideoInfoM78622a = m78622a(tPVideoInfo, (int) getCurrentPositionMs(), this.f76435C);
        if (m78659e()) {
            iTPMediaAsset = this.f76440d.mo77889a(iTPMediaAsset, j11, tPVideoInfoM78622a);
        }
        if (iTPMediaAsset != null) {
            this.f76457u.m78141c("handleSwitchDef, proxyMediaAsset:" + iTPMediaAsset + ", defID:" + j11);
            this.f76438b.mo77360b(tPVideoInfoM78622a);
            this.f76438b.mo77448a(iTPMediaAsset, 0, j11);
            m78627a(120, 0, 0, (String) null, new C35427g().m78868a("switch", String.valueOf(j11)).m78869a());
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.ITPPlayer
    public void updateLoggerContext(C35352b c35352b) {
        if (c35352b != null) {
            this.f76459x = false;
            this.f76457u.m78136a(new C35352b(c35352b, "TPPlayer"));
            this.f76438b.mo77449a(this.f76457u.m78135a());
            this.f76439c.m78686a(this.f76457u.m78135a().m78145a());
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.ITPPlayer
    @C35434n.b
    public void updateTaskInfo(String str, Object obj) {
        InterfaceC35288a interfaceC35288a = this.f76440d;
        if (interfaceC35288a != null) {
            interfaceC35288a.mo77898a(str, obj);
        }
    }

    public C35411b(Context context, Looper looper, Looper looper2) {
        this(context, looper, looper2, null);
    }

    /* JADX INFO: renamed from: a */
    private long m78619a(long j11, String str) {
        this.f76461z.put(Long.valueOf(this.f76433A), Long.valueOf(j11));
        this.f76457u.m78141c(str + ", convert opaque(" + j11 + ") => uniqueId(" + this.f76433A + ")");
        long j12 = this.f76433A;
        this.f76433A = 1 + j12;
        return j12;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public void m78653c() {
        try {
            InterfaceC35230a interfaceC35230a = this.f76438b;
            if (interfaceC35230a != null) {
                interfaceC35230a.mo77364f();
            }
        } catch (Exception e11) {
            this.f76457u.m78143e("reopenPlayer has exception:" + e11.toString());
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.ITPPlayer
    public long getPlayableDurationMs() {
        if (m78659e()) {
            long j11 = this.f76455s;
            if (j11 > 0) {
                long j12 = this.f76456t;
                if (j12 > 0) {
                    return (long) (((j11 * 1.0d) / j12) * this.f76438b.mo77472n());
                }
            }
            return this.f76454r;
        }
        return this.f76438b.mo77474p();
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.ITPPlayer
    @C35434n.b
    public void setDataSource(ITPMediaAsset iTPMediaAsset) {
        if (iTPMediaAsset == null) {
            throw new IllegalArgumentException("error : setDataSource , param is null");
        }
        if (iTPMediaAsset instanceof ITPMediaDRMAsset) {
            ITPMediaDRMAsset iTPMediaDRMAsset = (ITPMediaDRMAsset) iTPMediaAsset;
            if (iTPMediaDRMAsset.getDrmAllProperties() == null || iTPMediaDRMAsset.getDrmAllProperties().isEmpty()) {
                throw new IllegalArgumentException("error : setDataSource , drm property is null");
            }
            if (iTPMediaDRMAsset.getDrmType() == 0 && m78659e()) {
                byte[] bArrM78640a = m78640a(TPPlayerConfig.getProxyDataDir(), iTPMediaDRMAsset.getDrmPlayUrl(), iTPMediaDRMAsset.getDrmProperty(ITPMediaDRMAsset.TP_PLAYER_DRM_PROPERTY_LICENSE_URL, ""));
                if (bArrM78640a != null && bArrM78640a.length > 0) {
                    try {
                        iTPMediaDRMAsset.setOfflineKeySetId(Base64.encodeToString(bArrM78640a, 2));
                    } catch (Exception e11) {
                        this.f76457u.m78141c("setOfflineKeySetId exception" + e11.getMessage());
                    }
                }
            }
            if (TextUtils.isEmpty(iTPMediaDRMAsset.getUrl())) {
                throw new IllegalArgumentException("error : setDataSource , drm asset url is null");
            }
        }
        if (this.f76438b.mo77359b() != 1) {
            throw new IllegalStateException("error : setDataSource , state invalid. current state:" + this.f76438b.mo77359b());
        }
        m78639a(iTPMediaAsset.getUrl(), m78618a(iTPMediaAsset.getUrl()), m78659e());
        m78624a(1000);
        this.f76457u.m78141c(f76431a + "setDataSource, ITPMediaAsset");
        this.f76449m = iTPMediaAsset.getUrl();
        if (m78659e()) {
            iTPMediaAsset = this.f76440d.mo77888a(iTPMediaAsset);
            updateTaskInfo(TPDownloadProxyEnum.TASKINFO_GET_METADATA_PLAY_OFFSET, 0);
        }
        this.f76457u.m78141c("handleSetDataSource mediaAsset=" + iTPMediaAsset.getUrl());
        try {
            this.f76438b.mo77447a(iTPMediaAsset);
        } catch (IOException | SecurityException e12) {
            this.f76457u.m78137a(e12);
        }
        m78624a(1001);
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.ITPPlayer
    @C35434n.b(m78916c = true)
    public void setPlayerOptionalParam(TPOptionalParam tPOptionalParam) {
        if (tPOptionalParam.getParamType() == 7 && !C35430j.m78897a(tPOptionalParam.getKey(), tPOptionalParam.getParamObject().objectValue)) {
            this.f76457u.m78142d("set object param failed, optional id:" + tPOptionalParam.getKey());
            return;
        }
        m78630a(tPOptionalParam);
        this.f76440d.mo77895a(tPOptionalParam);
        try {
            this.f76438b.mo77446a(tPOptionalParam);
        } catch (Exception e11) {
            this.f76457u.m78137a(e11);
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.ITPPlayer
    @C35434n.b(m78915b = true, m78916c = true)
    public void switchDefinition(String str, long j11, TPVideoInfo tPVideoInfo) {
        this.f76457u.m78141c(f76431a + "switchDefinition, defUrl:" + str + ", defID:" + j11);
        switchDefinition(str, j11, tPVideoInfo, 0);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public C35411b(Context context, Looper looper, Looper looper2, C35352b c35352b) {
        C35352b c35352b2;
        InterfaceC35415a interfaceC35415a;
        Looper looper3;
        this.f76449m = null;
        this.f76450n = true;
        this.f76451o = false;
        this.f76452p = -1;
        this.f76458w = new AtomicInteger(1000);
        this.f76459x = false;
        this.f76460y = null;
        this.f76461z = new HashMap();
        this.f76433A = 0L;
        this.f76437E = false;
        if (c35352b != null) {
            c35352b2 = new C35352b(c35352b, "TPPlayer");
        } else {
            C35352b c35352b3 = new C35352b("ThumbPlayer", String.valueOf(f76432v.incrementAndGet()), String.valueOf(this.f76458w.incrementAndGet()), "TPPlayer");
            this.f76459x = true;
            c35352b2 = c35352b3;
        }
        C35351a c35351a = new C35351a(c35352b2);
        this.f76457u = c35351a;
        c35351a.m78141c("create TPPlayer");
        this.f76448l = new C35383a(context.getApplicationContext());
        this.f76444h = new C35417c();
        if (TPPlayerConfig.isDataReportEnable() && TPPlayerConfig.isPlayerReportEnable()) {
            C35419b c35419b = new C35419b(this.f76448l.m78352a());
            this.f76441e = c35419b;
            interfaceC35415a = c35419b;
        } else {
            C35420c c35420c = new C35420c();
            this.f76442f = c35420c;
            interfaceC35415a = c35420c;
        }
        this.f76444h.mo78693a(interfaceC35415a);
        m78627a(100, 0, 0, (String) null, new C35427g().m78868a("stime", Long.valueOf(System.currentTimeMillis())).m78869a());
        b bVar = new b();
        this.f76439c = new C35412c(this.f76457u.m78139b());
        InterfaceC35230a interfaceC35230aM77761a = C35247e.m77761a(c35352b2, this.f76448l);
        this.f76438b = interfaceC35230aM77761a;
        interfaceC35230aM77761a.mo77438a((C35241c.i) bVar);
        interfaceC35230aM77761a.mo77432a((C35241c.c) bVar);
        interfaceC35230aM77761a.mo77437a((C35241c.h) bVar);
        interfaceC35230aM77761a.mo77444a((C35241c.p) bVar);
        interfaceC35230aM77761a.mo77435a((C35241c.f) bVar);
        interfaceC35230aM77761a.mo77439a((C35241c.j) bVar);
        interfaceC35230aM77761a.mo77444a((C35241c.p) bVar);
        interfaceC35230aM77761a.mo77440a((C35241c.l) bVar);
        interfaceC35230aM77761a.mo77441a((C35241c.m) bVar);
        interfaceC35230aM77761a.mo77430a((C35241c.a) bVar);
        interfaceC35230aM77761a.mo77442a((C35241c.n) bVar);
        interfaceC35230aM77761a.mo77443a((C35241c.o) bVar);
        interfaceC35230aM77761a.mo77431a((C35241c.b) bVar);
        interfaceC35230aM77761a.mo77352a((C35241c.k) bVar);
        interfaceC35230aM77761a.mo77434a((C35241c.e) bVar);
        interfaceC35230aM77761a.mo77433a((C35241c.d) bVar);
        if (looper == null || looper == Looper.getMainLooper()) {
            HandlerThread handlerThreadM78919a = C35435o.m78917a().m78919a("TP-workthread");
            this.f76445i = handlerThreadM78919a;
            looper3 = handlerThreadM78919a.getLooper();
        } else {
            looper3 = looper;
        }
        this.f76446j = looper3;
        this.f76447k = looper2 == null ? Looper.myLooper() == null ? new a(this, this.f76446j) : new a(this) : new a(this, looper2);
        m78627a(101, 0, 0, (String) null, new C35427g().m78868a("etime", Long.valueOf(System.currentTimeMillis())).m78869a());
        InterfaceC35288a interfaceC35288aM77965a = C35294c.m77965a(this.f76446j, this.f76448l);
        this.f76440d = interfaceC35288aM77965a;
        interfaceC35288aM77965a.mo77897a(bVar);
        this.f76444h.mo78693a(new C35418a());
        this.f76453q = new ArrayList<>();
        if (TPPlayerConfig.getNewReportEnable()) {
            C35403g c35403g = new C35403g(this.f76448l.m78352a());
            this.f76460y = c35403g;
            c35403g.m78577a(new C35303a(interfaceC35230aM77761a));
            this.f76460y.m78576a();
            this.f76448l.m78353b().m78133a(this.f76460y);
        }
    }

    /* JADX INFO: renamed from: b */
    private TPDownloadParamData m78645b(int i11, int i12) {
        TPDownloadParamData tPDownloadParamData = new TPDownloadParamData(0);
        tPDownloadParamData.setStarTimeMS(i11);
        tPDownloadParamData.setEndTimeMS(i12);
        return tPDownloadParamData;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public void m78654c(@TPPlayerDetailInfo.TPPlayerDetailInfoType int i11) {
        m78631a(new TPPlayerDetailInfo(i11));
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.ITPPlayer
    @C35434n.b
    public void setDataSource(String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("error : setDataSource , param is invalid");
        }
        if (this.f76438b.mo77359b() != 1) {
            throw new IllegalStateException("error : setDataSource , state invalid. current state:" + this.f76438b.mo77359b());
        }
        m78639a(str, m78618a(str), m78659e());
        m78624a(1000);
        this.f76457u.m78141c(f76431a + "setDataSource, url:" + str);
        this.f76449m = str;
        C35243e c35243e = new C35243e(str);
        this.f76457u.m78141c("handleSetDataSource originalUrl=".concat(String.valueOf(str)));
        if (m78659e()) {
            c35243e = this.f76440d.mo77887a(str, (Map<String, String>) null);
            updateTaskInfo(TPDownloadProxyEnum.TASKINFO_GET_METADATA_PLAY_OFFSET, 0);
            this.f76457u.m78141c("handleSetDataSource selfPlayerUrl=" + c35243e.m77641b());
            this.f76457u.m78141c("handleSetDataSource systemPlayerUrl=" + c35243e.m77639a());
        }
        this.f76438b.mo77353a(c35243e);
        m78624a(1001);
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.ITPPlayer
    @C35434n.b(m78915b = true, m78916c = true)
    public void switchDefinition(String str, long j11, TPVideoInfo tPVideoInfo, int i11) {
        String str2;
        long j12;
        if (!m78664h()) {
            throw new IllegalStateException("error : switchDefinition , state invalid");
        }
        this.f76457u.m78141c(f76431a + "switchDefinition, defUrl:" + str + ", defID:" + j11 + ", mode:" + i11);
        TPVideoInfo tPVideoInfoM78622a = m78622a(tPVideoInfo, (int) getCurrentPositionMs(), this.f76435C);
        C35243e c35243e = new C35243e(str);
        if (m78659e()) {
            str2 = str;
            j12 = j11;
            c35243e = this.f76440d.mo77886a(j12, str2, tPVideoInfoM78622a, null);
            this.f76457u.m78141c("switchDefinition selfPlayerUrl=" + c35243e.m77641b());
            this.f76457u.m78141c("switchDefinition systemPlayerUrl=" + c35243e.m77639a());
        } else {
            str2 = str;
            j12 = j11;
        }
        this.f76457u.m78141c("switchDefinition, proxyUrl:" + str2 + ", defID:" + j12);
        this.f76438b.mo77360b(tPVideoInfoM78622a);
        this.f76438b.mo77354a(c35243e, i11, j12);
        m78627a(120, 0, 0, (String) null, new C35427g().m78868a("switch", String.valueOf(j12)).m78869a());
    }

    /* JADX INFO: renamed from: b */
    public String m78668b() {
        return this.f76457u.m78139b();
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.ITPPlayer
    @C35434n.b
    public void setDataSource(String str, Map<String, String> map) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("error : setDataSource , param is invalid");
        }
        if (this.f76438b.mo77359b() != 1) {
            throw new IllegalStateException("error : setDataSource , state invalid. current state:" + this.f76438b.mo77359b());
        }
        m78639a(str, m78618a(str), m78659e());
        m78624a(1000);
        this.f76457u.m78141c(f76431a + "setDataSource, url:" + str + ", httpHeader:" + map);
        this.f76449m = str;
        C35243e c35243e = new C35243e(str);
        this.f76457u.m78141c("handleSetDataSource originalUrl=".concat(String.valueOf(str)));
        if (m78659e()) {
            c35243e = this.f76440d.mo77887a(str, map);
            updateTaskInfo(TPDownloadProxyEnum.TASKINFO_GET_METADATA_PLAY_OFFSET, 0);
            this.f76457u.m78141c("handleSetDataSource selfPlayerUrl=" + c35243e.m77641b());
            this.f76457u.m78141c("handleSetDataSource systemPlayerUrl=" + c35243e.m77639a());
        }
        this.f76438b.mo77355a(c35243e, map);
        m78624a(1001);
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.ITPPlayer
    @C35434n.b(m78915b = true, m78916c = true)
    public void switchDefinition(String str, long j11, TPVideoInfo tPVideoInfo, Map<String, String> map) {
        this.f76457u.m78141c(f76431a + "switchDefinition, defUrl:" + str + ", defID:" + j11 + ", videoInfo:" + tPVideoInfo + ", httpHeader:" + map);
        switchDefinition(str, j11, tPVideoInfo, map, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public void m78646b(int i11) {
        int i12 = f76430F.get(i11, -1);
        if (i12 == -1) {
            return;
        }
        m78654c(i12);
    }

    /* JADX INFO: renamed from: a */
    public Looper m78667a() {
        return this.f76446j;
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.ITPPlayer
    @C35434n.b(m78915b = true, m78916c = true)
    public void switchDefinition(String str, long j11, TPVideoInfo tPVideoInfo, Map<String, String> map, int i11) {
        if (!m78664h()) {
            throw new IllegalStateException("error : switchDefinition , state invalid");
        }
        this.f76457u.m78141c(f76431a + "switchDefinition, defUrl:" + str + ", defID:" + j11 + ", httpHeader:" + map + ", mode:" + i11);
        TPVideoInfo tPVideoInfoM78622a = m78622a(tPVideoInfo, (int) getCurrentPositionMs(), this.f76435C);
        C35243e c35243e = new C35243e(str);
        if (m78659e()) {
            c35243e = this.f76440d.mo77886a(j11, str, tPVideoInfoM78622a, map);
            this.f76457u.m78141c("switchDefinition selfPlayerUrl=" + c35243e.m77641b());
            this.f76457u.m78141c("switchDefinition systemPlayerUrl=" + c35243e.m77639a());
        }
        this.f76457u.m78141c("switchDefinition, proxyUrl:" + str + ", defID:" + j11 + ", httpHeader:" + map);
        this.f76438b.mo77360b(tPVideoInfoM78622a);
        this.f76438b.mo77356a(c35243e, map, i11, j11);
        m78627a(120, 0, 0, (String) null, new C35427g().m78868a("switch", String.valueOf(j11)).m78869a());
    }

    /* JADX INFO: renamed from: a */
    private TPVideoInfo m78622a(TPVideoInfo tPVideoInfo, int i11, int i12) {
        this.f76457u.m78141c("updateStartAndSkipEndTimeMsForDownloadParam, startTimeMs:" + i11 + ", skipEndTimeMs:" + i12);
        if (tPVideoInfo == null) {
            return new TPVideoInfo.Builder().downloadParam(m78645b(i11, i12)).build();
        }
        ArrayList<TPDownloadParamData> downloadPraramList = tPVideoInfo.getDownloadPraramList();
        if (downloadPraramList == null || downloadPraramList.isEmpty()) {
            tPVideoInfo.getBuilder().downloadParam(m78645b(i11, i12)).build();
            return tPVideoInfo;
        }
        for (TPDownloadParamData tPDownloadParamData : downloadPraramList) {
            tPDownloadParamData.setStarTimeMS(i11);
            tPDownloadParamData.setEndTimeMS(i12);
        }
        return tPVideoInfo;
    }

    /* JADX INFO: renamed from: a */
    private void m78624a(@TPPlayerDetailInfo.TPPlayerDetailInfoType int i11) {
        a aVar = this.f76447k;
        if (aVar != null) {
            Message messageObtainMessage = aVar.obtainMessage();
            messageObtainMessage.what = 1256;
            messageObtainMessage.obj = new TPPlayerDetailInfo(i11);
            this.f76447k.sendMessage(messageObtainMessage);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public void m78649b(Object obj) {
        TPDownloadParamData tPDownloadParamData;
        if (obj instanceof TPPlayerMsg.TPAudioTrackInfo) {
            if (!m78659e()) {
                this.f76457u.m78141c("handleAudioTrackProxy, proxy not enable and use orinal url");
                return;
            }
            TPPlayerMsg.TPAudioTrackInfo tPAudioTrackInfo = (TPPlayerMsg.TPAudioTrackInfo) obj;
            for (TPOptionalParam tPOptionalParam : tPAudioTrackInfo.paramData) {
                if (tPOptionalParam.getKey() == 0) {
                    tPDownloadParamData = (TPDownloadParamData) tPOptionalParam.getParamObject().objectValue;
                    String strMo77890a = this.f76440d.mo77890a(2, tPAudioTrackInfo.audioTrackUrl, tPDownloadParamData);
                    this.f76453q.add(strMo77890a);
                    tPAudioTrackInfo.proxyUrl = strMo77890a;
                }
            }
            tPDownloadParamData = null;
            String strMo77890a2 = this.f76440d.mo77890a(2, tPAudioTrackInfo.audioTrackUrl, tPDownloadParamData);
            this.f76453q.add(strMo77890a2);
            tPAudioTrackInfo.proxyUrl = strMo77890a2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m78625a(int i11, int i12) {
        m78627a(108, i11, i12, "", new C35427g().m78868a("etime", Long.valueOf(System.currentTimeMillis())).m78868a("reason", 3).m78868a("code", i11 + C33978va.f72339h + i12).m78869a());
        this.f76440d.mo77892a(3);
        this.f76440d.mo77909h();
    }

    /* JADX INFO: renamed from: b */
    private void m78650b(String str) {
        C35349b.p pVar = new C35349b.p();
        pVar.m78113a(str);
        this.f76448l.m78353b().m78134a(pVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m78626a(int i11, int i12, int i13, Object obj) {
        a aVar = this.f76447k;
        if (aVar != null) {
            Message messageObtainMessage = aVar.obtainMessage();
            messageObtainMessage.what = i11;
            messageObtainMessage.arg1 = i12;
            messageObtainMessage.arg2 = i13;
            messageObtainMessage.obj = obj;
            this.f76447k.sendMessage(messageObtainMessage);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m78627a(int i11, int i12, int i13, String str, Object obj) {
        try {
            InterfaceC35416b interfaceC35416b = this.f76444h;
            if (interfaceC35416b != null) {
                interfaceC35416b.mo78183a(i11, i12, i13, str, obj);
            }
        } catch (Exception e11) {
            this.f76457u.m78137a(e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m78628a(int i11, long j11, long j12, Object obj) {
        if (i11 == 200) {
            this.f76440d.mo77892a(4);
            m78627a(114, 0, 0, (String) null, new C35427g().m78868a("stime", Long.valueOf(System.currentTimeMillis())).m78868a(TUIConstants.TUIGroupNotePlugin.PLUGIN_GROUP_NOTE_FORMAT, 0).m78868a("ptime", Long.valueOf(getCurrentPositionMs())).m78868a("url", this.f76449m).m78869a());
            return;
        }
        if (i11 == 201) {
            m78661f();
            m78627a(115, 0, 0, (String) null, new C35427g().m78868a("etime", Long.valueOf(System.currentTimeMillis())).m78869a());
            return;
        }
        if (i11 == 3) {
            long jLongValue = obj instanceof Long ? ((Long) obj).longValue() : -1L;
            this.f76457u.m78141c("switch definition finish defId:".concat(String.valueOf(jLongValue)));
            if (jLongValue > 0) {
                this.f76440d.mo77893a(jLongValue);
            }
            m78627a(121, 0, 0, (String) null, new C35427g().m78868a("switch", String.valueOf(jLongValue)).m78869a());
            return;
        }
        if (i11 == 106) {
            m78627a(105, 0, 0, (String) null, new C35427g().m78868a("etime", Long.valueOf(System.currentTimeMillis())).m78869a());
            return;
        }
        if (i11 == 501) {
            m78627a(117, 0, 0, (String) null, obj);
            return;
        }
        if (i11 == 107) {
            m78627a(119, 0, 0, (String) null, new C35427g().m78868a("stime", Long.valueOf(System.currentTimeMillis())).m78869a());
            return;
        }
        if (i11 == 4) {
            m78627a(123, 0, 0, (String) null, new C35427g().m78868a("opaque", obj).m78868a("etime", Long.valueOf(System.currentTimeMillis())).m78868a("code", String.valueOf(j12)).m78869a());
            return;
        }
        if (i11 == 101) {
            m78627a(124, 0, 0, (String) null, new C35427g().m78868a("stime", Long.valueOf(System.currentTimeMillis())).m78869a());
            return;
        }
        if (i11 == 505 && (obj instanceof TPPlayerMsg.TPMediaDrmInfo)) {
            TPPlayerMsg.TPMediaDrmInfo tPMediaDrmInfo = (TPPlayerMsg.TPMediaDrmInfo) obj;
            this.f76457u.m78141c("TPMediaDrmInfo secureDecoder:" + tPMediaDrmInfo.supportSecureDecoder + " secureDecrypt:" + tPMediaDrmInfo.supportSecureDecrypt + " componentName:" + tPMediaDrmInfo.componentName + " drmType:" + tPMediaDrmInfo.drmType);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m78629a(Message message) {
        Object obj = message.obj;
        if (obj instanceof TPPlayerDetailInfo) {
            m78631a((TPPlayerDetailInfo) obj);
        }
    }

    /* JADX INFO: renamed from: a */
    private void m78630a(TPOptionalParam tPOptionalParam) {
        if (tPOptionalParam == null) {
            return;
        }
        if (tPOptionalParam.getKey() == 205) {
            this.f76450n = tPOptionalParam.getParamBoolean().value;
            this.f76457u.m78141c("setPlayerOptionalParam, use p2p proxy, OPTION_ID_BEFORE_BOOLEAN_USE_PROXY=" + this.f76450n);
            return;
        }
        if (tPOptionalParam.getKey() == 508) {
            this.f76451o = tPOptionalParam.getParamBoolean().value;
            return;
        }
        if (tPOptionalParam.getKey() == 100) {
            this.f76434B = (int) tPOptionalParam.getParamLong().value;
        } else if (tPOptionalParam.getKey() == 500) {
            this.f76435C = (int) tPOptionalParam.getParamLong().value;
        } else if (tPOptionalParam.getKey() == 510) {
            TPCodecUtils.enableDrmL3(tPOptionalParam.getParamBoolean().value);
        }
    }

    /* JADX INFO: renamed from: a */
    private void m78631a(TPPlayerDetailInfo tPPlayerDetailInfo) {
        C35412c c35412c = this.f76439c;
        if (c35412c != null) {
            c35412c.onDetailInfo(this, tPPlayerDetailInfo);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m78638a(Object obj) {
        TPDownloadParamData tPDownloadParamData;
        if (obj instanceof TPPlayerMsg.TPAudioTrackInfo) {
            if (!m78659e()) {
                this.f76457u.m78143e("handleSelectAudioTrack, proxy is not enable");
                return;
            }
            TPPlayerMsg.TPAudioTrackInfo tPAudioTrackInfo = (TPPlayerMsg.TPAudioTrackInfo) obj;
            this.f76457u.m78141c("handleSelectAudioTrack, audioTrack url:" + tPAudioTrackInfo.audioTrackUrl);
            if (TextUtils.isEmpty(tPAudioTrackInfo.audioTrackUrl)) {
                try {
                    this.f76440d.mo77903b();
                    return;
                } catch (Exception e11) {
                    this.f76457u.m78137a(e11);
                    return;
                }
            }
            Iterator<TPOptionalParam> it = tPAudioTrackInfo.paramData.iterator();
            while (true) {
                if (!it.hasNext()) {
                    tPDownloadParamData = null;
                    break;
                }
                TPOptionalParam next = it.next();
                if (next.getKey() == 0) {
                    tPDownloadParamData = (TPDownloadParamData) next.getParamObject().objectValue;
                    break;
                }
            }
            this.f76440d.mo77899a(tPAudioTrackInfo.audioTrackUrl, tPDownloadParamData != null ? tPDownloadParamData.getAudioTrackKeyId() : "");
        }
    }

    /* JADX INFO: renamed from: a */
    private void m78639a(String str, int i11, boolean z11) {
        C35349b.u uVar = new C35349b.u();
        uVar.m78125a(str);
        uVar.m78127b(i11);
        uVar.m78126a(z11);
        this.f76448l.m78353b().m78134a(uVar);
    }

    /* JADX INFO: renamed from: a */
    private byte[] m78640a(String str, String str2, String str3) {
        InterfaceC35288a interfaceC35288a = this.f76440d;
        if (interfaceC35288a != null) {
            return interfaceC35288a.mo77902a(str, str2, str3);
        }
        return null;
    }
}
