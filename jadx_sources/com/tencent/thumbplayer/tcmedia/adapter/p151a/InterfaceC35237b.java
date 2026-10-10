package com.tencent.thumbplayer.tcmedia.adapter.p151a;

import android.content.res.AssetFileDescriptor;
import android.os.ParcelFileDescriptor;
import android.view.Surface;
import android.view.SurfaceHolder;
import com.tencent.thumbplayer.tcmedia.api.TPCaptureCallBack;
import com.tencent.thumbplayer.tcmedia.api.TPCaptureParams;
import com.tencent.thumbplayer.tcmedia.api.TPCommonEnum;
import com.tencent.thumbplayer.tcmedia.api.TPOptionalParam;
import com.tencent.thumbplayer.tcmedia.api.TPProgramInfo;
import com.tencent.thumbplayer.tcmedia.api.TPTrackInfo;
import com.tencent.thumbplayer.tcmedia.api.composition.ITPMediaAsset;
import com.tencent.thumbplayer.tcmedia.core.player.TPDynamicStatisticParams;
import com.tencent.thumbplayer.tcmedia.core.player.TPGeneralPlayFlowParams;
import com.tencent.thumbplayer.tcmedia.p160e.C35352b;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.tencent.thumbplayer.tcmedia.adapter.a.b */
/* JADX INFO: loaded from: classes62.dex */
public interface InterfaceC35237b {
    /* JADX INFO: renamed from: a */
    void mo77422a(float f11);

    /* JADX INFO: renamed from: a */
    void mo77423a(int i11);

    /* JADX INFO: renamed from: a */
    void mo77424a(int i11, @TPCommonEnum.TPSeekMode int i12);

    /* JADX INFO: renamed from: a */
    void mo77425a(int i11, long j11);

    /* JADX INFO: renamed from: a */
    void mo77426a(AssetFileDescriptor assetFileDescriptor);

    /* JADX INFO: renamed from: a */
    void mo77427a(ParcelFileDescriptor parcelFileDescriptor);

    /* JADX INFO: renamed from: a */
    void mo77428a(Surface surface);

    /* JADX INFO: renamed from: a */
    void mo77429a(SurfaceHolder surfaceHolder);

    /* JADX INFO: renamed from: a */
    void mo77430a(C35241c.a aVar);

    /* JADX INFO: renamed from: a */
    void mo77431a(C35241c.b bVar);

    /* JADX INFO: renamed from: a */
    void mo77432a(C35241c.c cVar);

    /* JADX INFO: renamed from: a */
    void mo77433a(C35241c.d dVar);

    /* JADX INFO: renamed from: a */
    void mo77434a(C35241c.e eVar);

    /* JADX INFO: renamed from: a */
    void mo77435a(C35241c.f fVar);

    /* JADX INFO: renamed from: a */
    void mo77436a(C35241c.g gVar);

    /* JADX INFO: renamed from: a */
    void mo77437a(C35241c.h hVar);

    /* JADX INFO: renamed from: a */
    void mo77438a(C35241c.i iVar);

    /* JADX INFO: renamed from: a */
    void mo77439a(C35241c.j jVar);

    /* JADX INFO: renamed from: a */
    void mo77440a(C35241c.l lVar);

    /* JADX INFO: renamed from: a */
    void mo77441a(C35241c.m mVar);

    /* JADX INFO: renamed from: a */
    void mo77442a(C35241c.n nVar);

    /* JADX INFO: renamed from: a */
    void mo77443a(C35241c.o oVar);

    /* JADX INFO: renamed from: a */
    void mo77444a(C35241c.p pVar);

    /* JADX INFO: renamed from: a */
    void mo77445a(TPCaptureParams tPCaptureParams, TPCaptureCallBack tPCaptureCallBack);

    /* JADX INFO: renamed from: a */
    void mo77446a(TPOptionalParam tPOptionalParam);

    /* JADX INFO: renamed from: a */
    void mo77447a(ITPMediaAsset iTPMediaAsset);

    /* JADX INFO: renamed from: a */
    void mo77448a(ITPMediaAsset iTPMediaAsset, @TPCommonEnum.TPSwitchDefMode int i11, long j11);

    /* JADX INFO: renamed from: a */
    void mo77449a(C35352b c35352b);

    /* JADX INFO: renamed from: a */
    void mo77450a(String str);

    /* JADX INFO: renamed from: a */
    void mo77451a(String str, @TPCommonEnum.TPSwitchDefMode int i11, long j11);

    /* JADX INFO: renamed from: a */
    void mo77452a(String str, Map<String, String> map);

    /* JADX INFO: renamed from: a */
    void mo77453a(String str, Map<String, String> map, @TPCommonEnum.TPSwitchDefMode int i11, long j11);

    /* JADX INFO: renamed from: a */
    void mo77454a(String str, Map<String, String> map, String str2, String str3);

    /* JADX INFO: renamed from: a */
    void mo77455a(String str, Map<String, String> map, String str2, List<TPOptionalParam> list);

    /* JADX INFO: renamed from: a */
    void mo77456a(boolean z11);

    /* JADX INFO: renamed from: a */
    void mo77457a(boolean z11, long j11, long j12);

    /* JADX INFO: renamed from: b */
    long mo77458b(int i11);

    /* JADX INFO: renamed from: b */
    void mo77459b(float f11);

    /* JADX INFO: renamed from: b */
    void mo77460b(int i11, long j11);

    /* JADX INFO: renamed from: b */
    void mo77461b(boolean z11);

    /* JADX INFO: renamed from: c */
    TPDynamicStatisticParams mo77462c(boolean z11);

    /* JADX INFO: renamed from: c */
    String mo77463c(int i11);

    /* JADX INFO: renamed from: c */
    void mo77464c(int i11, long j11);

    /* JADX INFO: renamed from: g */
    void mo77465g();

    /* JADX INFO: renamed from: h */
    void mo77466h();

    /* JADX INFO: renamed from: i */
    void mo77467i();

    /* JADX INFO: renamed from: j */
    void mo77468j();

    /* JADX INFO: renamed from: k */
    void mo77469k();

    /* JADX INFO: renamed from: l */
    void mo77470l();

    /* JADX INFO: renamed from: m */
    void mo77471m();

    /* JADX INFO: renamed from: n */
    long mo77472n();

    /* JADX INFO: renamed from: o */
    long mo77473o();

    /* JADX INFO: renamed from: p */
    long mo77474p();

    /* JADX INFO: renamed from: q */
    int mo77475q();

    /* JADX INFO: renamed from: r */
    int mo77476r();

    /* JADX INFO: renamed from: s */
    TPTrackInfo[] mo77477s();

    /* JADX INFO: renamed from: t */
    TPProgramInfo[] mo77478t();

    /* JADX INFO: renamed from: u */
    long[] mo77479u();

    /* JADX INFO: renamed from: v */
    TPGeneralPlayFlowParams mo77480v();
}
