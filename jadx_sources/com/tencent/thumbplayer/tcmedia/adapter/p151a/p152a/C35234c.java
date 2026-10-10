package com.tencent.thumbplayer.tcmedia.adapter.p151a.p152a;

import android.text.TextUtils;
import com.tencent.thumbplayer.tcmedia.adapter.p151a.p153b.C35240c;
import com.tencent.thumbplayer.tcmedia.api.TPSubtitleRenderModel;
import com.tencent.thumbplayer.tcmedia.core.common.TPMediaTrackInfo;
import com.tencent.thumbplayer.tcmedia.core.common.TPSubtitleFrame;
import com.tencent.thumbplayer.tcmedia.core.subtitle.ITPSubtitleParserCallback;
import com.tencent.thumbplayer.tcmedia.core.subtitle.TPNativeSubtitleRenderParams;
import com.tencent.thumbplayer.tcmedia.core.subtitle.TPSubtitleParser;
import com.tencent.thumbplayer.tcmedia.utils.C35435o;
import com.tencent.thumbplayer.tcmedia.utils.TPLogUtil;
import java.util.Map;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.tencent.thumbplayer.tcmedia.adapter.a.a.c */
/* JADX INFO: loaded from: classes62.dex */
public class C35234c implements InterfaceC35232a {

    /* JADX INFO: renamed from: b */
    TPNativeSubtitleRenderParams f75514b;

    /* JADX INFO: renamed from: c */
    private InterfaceC35232a.a f75515c;

    /* JADX INFO: renamed from: d */
    private InterfaceC35232a.d f75516d;

    /* JADX INFO: renamed from: e */
    private InterfaceC35232a.c f75517e;

    /* JADX INFO: renamed from: f */
    private InterfaceC35232a.b f75518f;

    /* JADX INFO: renamed from: g */
    private TPSubtitleParser f75519g;

    /* JADX INFO: renamed from: h */
    private String f75520h;

    /* JADX INFO: renamed from: a */
    int f75513a = 0;

    /* JADX INFO: renamed from: i */
    private Future<?> f75521i = null;

    /* JADX INFO: renamed from: j */
    private final Object f75522j = new Object();

    /* JADX INFO: renamed from: k */
    private a f75523k = a.IDLE;

    /* JADX INFO: renamed from: com.tencent.thumbplayer.tcmedia.adapter.a.a.c$a */
    public enum a {
        IDLE,
        INITED,
        PREPARED,
        STOPED,
        ERROR
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.p151a.p152a.InterfaceC35232a
    /* JADX INFO: renamed from: a */
    public void mo77365a() {
        if (this.f75523k != a.INITED) {
            TPLogUtil.m78797e("TPSysPlayerExternalSubtitle", "prepare, illegalState, state:" + this.f75523k);
            return;
        }
        TPLogUtil.m78800i("TPSysPlayerExternalSubtitle", "prepare.");
        this.f75519g.init();
        this.f75519g.loadAsync();
        TPNativeSubtitleRenderParams tPNativeSubtitleRenderParams = this.f75514b;
        if (tPNativeSubtitleRenderParams != null) {
            this.f75519g.setRenderParams(tPNativeSubtitleRenderParams);
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.p151a.p152a.InterfaceC35232a
    /* JADX INFO: renamed from: b */
    public void mo77373b() {
        if (this.f75523k == a.PREPARED) {
            TPLogUtil.m78800i("TPSysPlayerExternalSubtitle", "startAsync");
            this.f75519g.startAsync();
        } else {
            TPLogUtil.m78797e("TPSysPlayerExternalSubtitle", "startAsync, illegalState, state:" + this.f75523k);
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.p151a.p152a.InterfaceC35232a
    /* JADX INFO: renamed from: c */
    public void mo77374c() {
        if (this.f75523k == a.PREPARED) {
            TPLogUtil.m78800i("TPSysPlayerExternalSubtitle", "pauseAsync");
            this.f75519g.pauseAsync();
        } else {
            TPLogUtil.m78797e("TPSysPlayerExternalSubtitle", "pauseAsync, illegalState, state:" + this.f75523k);
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.p151a.p152a.InterfaceC35232a
    /* JADX INFO: renamed from: d */
    public void mo77375d() {
        TPLogUtil.m78800i("TPSysPlayerExternalSubtitle", "stop.");
        a aVar = this.f75523k;
        if (aVar == a.INITED || aVar == a.PREPARED || aVar == a.ERROR) {
            TPSubtitleParser tPSubtitleParser = this.f75519g;
            if (tPSubtitleParser != null) {
                try {
                    tPSubtitleParser.stop();
                    this.f75519g.unInit();
                } catch (Exception e11) {
                    TPLogUtil.m78798e("TPSysPlayerExternalSubtitle", e11);
                }
            }
            this.f75519g = null;
        }
        if (this.f75513a == 0) {
            synchronized (this.f75522j) {
                try {
                    Future<?> future = this.f75521i;
                    if (future != null) {
                        future.cancel(true);
                        this.f75521i = null;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        this.f75523k = a.STOPED;
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.p151a.p152a.InterfaceC35232a
    /* JADX INFO: renamed from: e */
    public void mo77376e() {
        TPLogUtil.m78800i("TPSysPlayerExternalSubtitle", "reset.");
        if (this.f75523k != a.IDLE) {
            TPSubtitleParser tPSubtitleParser = this.f75519g;
            if (tPSubtitleParser != null) {
                try {
                    tPSubtitleParser.stop();
                    this.f75519g.unInit();
                } catch (Exception e11) {
                    TPLogUtil.m78798e("TPSysPlayerExternalSubtitle", e11);
                }
            }
            this.f75519g = null;
        }
        synchronized (this.f75522j) {
            try {
                Future<?> future = this.f75521i;
                if (future != null) {
                    future.cancel(true);
                    this.f75521i = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f75523k = a.IDLE;
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.p151a.p152a.InterfaceC35232a
    /* JADX INFO: renamed from: f */
    public void mo77377f() {
        TPLogUtil.m78800i("TPSysPlayerExternalSubtitle", "release.");
        this.f75516d = null;
        this.f75515c = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public void m77390b(int i11) {
        InterfaceC35232a.d dVar = this.f75516d;
        InterfaceC35232a.a aVar = this.f75515c;
        if (dVar == null || aVar == null) {
            TPLogUtil.m78802w("TPSysPlayerExternalSubtitle", "subPollFunc, posLis:" + dVar + ", subLis:" + aVar);
            return;
        }
        long jMo77384a = dVar.mo77384a();
        if (jMo77384a < 0) {
            TPLogUtil.m78802w("TPSysPlayerExternalSubtitle", "subPollFunc, cur position:".concat(String.valueOf(jMo77384a)));
            return;
        }
        String subtitleText = this.f75519g.getSubtitleText(jMo77384a, i11);
        if (TextUtils.equals(this.f75520h, subtitleText)) {
            return;
        }
        this.f75520h = subtitleText;
        aVar.mo77378a(new InterfaceC35232a.e(subtitleText));
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.p151a.p152a.InterfaceC35232a
    /* JADX INFO: renamed from: a */
    public void mo77366a(int i11) {
        this.f75513a = i11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m77386a(long j11) {
        if (this.f75523k != a.INITED) {
            TPLogUtil.m78797e("TPSysPlayerExternalSubtitle", "prepare, illegalState, state:" + this.f75523k);
            return;
        }
        TPMediaTrackInfo[] trackInfo = this.f75519g.getTrackInfo();
        if (trackInfo == null || trackInfo.length <= 0) {
            TPLogUtil.m78802w("TPSysPlayerExternalSubtitle", "prepare, err, trackInfos is empty.");
            this.f75523k = a.ERROR;
            return;
        }
        if (trackInfo[0].trackType != 3) {
            this.f75523k = a.ERROR;
            TPLogUtil.m78802w("TPSysPlayerExternalSubtitle", "prepare, err, track type not match.");
            return;
        }
        this.f75519g.selectTrackAsync(0, j11);
        this.f75523k = a.PREPARED;
        if (this.f75513a == 0) {
            synchronized (this.f75522j) {
                try {
                    Future<?> future = this.f75521i;
                    if (future != null) {
                        future.cancel(true);
                        this.f75521i = null;
                    }
                    this.f75521i = C35435o.m78917a().m78925e().scheduleAtFixedRate(new Runnable() { // from class: com.tencent.thumbplayer.tcmedia.adapter.a.a.c.2
                        @Override // java.lang.Runnable
                        public void run() {
                            C35234c.this.m77390b(0);
                        }
                    }, 0L, 200L, TimeUnit.MILLISECONDS);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.p151a.p152a.InterfaceC35232a
    /* JADX INFO: renamed from: a */
    public void mo77367a(InterfaceC35232a.a aVar) {
        this.f75515c = aVar;
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.p151a.p152a.InterfaceC35232a
    /* JADX INFO: renamed from: a */
    public void mo77368a(InterfaceC35232a.b bVar) {
        this.f75518f = bVar;
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.p151a.p152a.InterfaceC35232a
    /* JADX INFO: renamed from: a */
    public void mo77369a(InterfaceC35232a.c cVar) {
        this.f75517e = cVar;
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.p151a.p152a.InterfaceC35232a
    /* JADX INFO: renamed from: a */
    public void mo77370a(InterfaceC35232a.d dVar) {
        this.f75516d = dVar;
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.p151a.p152a.InterfaceC35232a
    /* JADX INFO: renamed from: a */
    public void mo77371a(TPSubtitleRenderModel tPSubtitleRenderModel) {
        TPNativeSubtitleRenderParams tPNativeSubtitleRenderParamsM77626a = C35240c.m77626a(tPSubtitleRenderModel);
        this.f75514b = tPNativeSubtitleRenderParamsM77626a;
        TPSubtitleParser tPSubtitleParser = this.f75519g;
        if (tPSubtitleParser != null) {
            tPSubtitleParser.setRenderParams(tPNativeSubtitleRenderParamsM77626a);
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.p151a.p152a.InterfaceC35232a
    /* JADX INFO: renamed from: a */
    public void mo77372a(String str, Map<String, String> map, final long j11) {
        if (this.f75523k != a.IDLE) {
            TPLogUtil.m78797e("TPSysPlayerExternalSubtitle", "setDataSource, illegalState, state:" + this.f75523k);
        } else {
            if (TextUtils.isEmpty(str)) {
                TPLogUtil.m78797e("TPSysPlayerExternalSubtitle", "setDataSource, illegal argument, url:".concat(String.valueOf(str)));
                return;
            }
            TPLogUtil.m78800i("TPSysPlayerExternalSubtitle", "setDataSource, url: ".concat(String.valueOf(str)));
            if (this.f75519g != null) {
                TPLogUtil.m78802w("TPSysPlayerExternalSubtitle", "setDataSource, mTpSubParser != null.");
                try {
                    this.f75519g.stop();
                    this.f75519g.unInit();
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
                this.f75519g = null;
            }
            this.f75519g = new TPSubtitleParser(str, map, new ITPSubtitleParserCallback() { // from class: com.tencent.thumbplayer.tcmedia.adapter.a.a.c.1
                @Override // com.tencent.thumbplayer.tcmedia.core.subtitle.ITPSubtitleParserCallback
                public long onGetCurrentPlayPositionMs() {
                    if (C35234c.this.f75516d != null) {
                        return C35234c.this.f75516d.mo77384a();
                    }
                    return 0L;
                }

                @Override // com.tencent.thumbplayer.tcmedia.core.subtitle.ITPSubtitleParserCallback
                public void onLoadResult(int i11) {
                    TPLogUtil.m78800i("TPSysPlayerExternalSubtitle", "onLoadResult, index:".concat(String.valueOf(i11)));
                    C35234c.this.m77386a(j11);
                }

                @Override // com.tencent.thumbplayer.tcmedia.core.subtitle.ITPSubtitleParserCallback
                public void onSelectResult(int i11, long j12) {
                    TPLogUtil.m78800i("TPSysPlayerExternalSubtitle", "onSelectResult, errCode:" + i11 + ", selectOpaque:" + j12 + ", opaque =" + j11);
                    if (i11 == 0 && C35234c.this.f75517e != null) {
                        C35234c.this.f75517e.mo77383a(j11);
                    } else {
                        if (i11 == 0 || C35234c.this.f75517e == null) {
                            return;
                        }
                        C35234c.this.f75517e.mo77382a(i11, j11);
                    }
                }

                @Override // com.tencent.thumbplayer.tcmedia.core.subtitle.ITPSubtitleParserCallback
                public void onSubtitleError(int i11, int i12) {
                    TPLogUtil.m78800i("TPSysPlayerExternalSubtitle", "onSubtitleError, index:" + i11 + ", errorCode:" + i12);
                    C35234c.this.f75518f.mo77381a(i11, i12);
                }

                @Override // com.tencent.thumbplayer.tcmedia.core.subtitle.ITPSubtitleParserCallback
                public void onSubtitleFrame(TPSubtitleFrame tPSubtitleFrame) {
                    TPLogUtil.m78800i("TPSysPlayerExternalSubtitle", "onSubtitleFrame");
                    if (C35234c.this.f75515c != null) {
                        C35234c.this.f75515c.mo77379a(tPSubtitleFrame);
                    }
                }

                @Override // com.tencent.thumbplayer.tcmedia.core.subtitle.ITPSubtitleParserCallback
                public void onSubtitleNote(String str2) {
                    TPLogUtil.m78800i("TPSysPlayerExternalSubtitle", "onSubtitleNote");
                    if (C35234c.this.f75515c != null) {
                        C35234c.this.f75515c.mo77380a(str2);
                    }
                }
            }, this.f75513a);
            this.f75523k = a.INITED;
        }
    }
}
