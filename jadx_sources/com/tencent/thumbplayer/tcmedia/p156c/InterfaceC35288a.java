package com.tencent.thumbplayer.tcmedia.p156c;

import com.tencent.thumbplayer.tcmedia.adapter.p151a.C35243e;
import com.tencent.thumbplayer.tcmedia.api.TPOptionalParam;
import com.tencent.thumbplayer.tcmedia.api.TPVideoInfo;
import com.tencent.thumbplayer.tcmedia.api.composition.ITPMediaAsset;
import com.tencent.thumbplayer.tcmedia.api.proxy.ITPPlayerProxy;
import com.tencent.thumbplayer.tcmedia.api.proxy.ITPPlayerProxyListener;
import com.tencent.thumbplayer.tcmedia.api.proxy.TPDownloadParamData;
import com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPPlayListener;
import com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.TPDLProxyMsg;
import java.util.Map;

/* JADX INFO: renamed from: com.tencent.thumbplayer.tcmedia.c.a */
/* JADX INFO: loaded from: classes62.dex */
public interface InterfaceC35288a extends ITPPlayerProxy {
    /* JADX INFO: renamed from: a */
    C35243e mo77886a(long j11, String str, TPVideoInfo tPVideoInfo, Map<String, String> map);

    /* JADX INFO: renamed from: a */
    C35243e mo77887a(String str, Map<String, String> map);

    /* JADX INFO: renamed from: a */
    ITPMediaAsset mo77888a(ITPMediaAsset iTPMediaAsset);

    /* JADX INFO: renamed from: a */
    ITPMediaAsset mo77889a(ITPMediaAsset iTPMediaAsset, long j11, TPVideoInfo tPVideoInfo);

    /* JADX INFO: renamed from: a */
    String mo77890a(int i11, String str, TPDownloadParamData tPDownloadParamData);

    /* JADX INFO: renamed from: a */
    void mo77891a(float f11);

    /* JADX INFO: renamed from: a */
    void mo77892a(int i11);

    /* JADX INFO: renamed from: a */
    void mo77893a(long j11);

    /* JADX INFO: renamed from: a */
    void mo77894a(long j11, long j12);

    /* JADX INFO: renamed from: a */
    void mo77895a(TPOptionalParam tPOptionalParam);

    /* JADX INFO: renamed from: a */
    void mo77896a(TPVideoInfo tPVideoInfo);

    /* JADX INFO: renamed from: a */
    void mo77897a(ITPPlayListener iTPPlayListener);

    /* JADX INFO: renamed from: a */
    void mo77898a(String str, Object obj);

    /* JADX INFO: renamed from: a */
    void mo77899a(String str, String str2);

    /* JADX INFO: renamed from: a */
    void mo77900a(boolean z11);

    /* JADX INFO: renamed from: a */
    boolean mo77901a();

    /* JADX INFO: renamed from: a */
    byte[] mo77902a(String str, String str2, String str3);

    /* JADX INFO: renamed from: b */
    void mo77903b();

    /* JADX INFO: renamed from: c */
    boolean mo77904c();

    /* JADX INFO: renamed from: d */
    void mo77905d();

    /* JADX INFO: renamed from: e */
    void mo77906e();

    /* JADX INFO: renamed from: f */
    boolean mo77907f();

    /* JADX INFO: renamed from: g */
    String mo77908g();

    /* JADX INFO: renamed from: h */
    void mo77909h();

    /* JADX INFO: renamed from: i */
    void mo77910i();

    /* JADX INFO: renamed from: j */
    ITPPlayerProxyListener mo77911j();

    /* JADX INFO: renamed from: k */
    TPDLProxyMsg.TPPDTInfo[] mo77912k();
}
