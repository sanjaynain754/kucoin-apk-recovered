package com.tencent.thumbplayer.tcmedia.common;

import com.tencent.thumbplayer.tcmedia.adapter.p151a.InterfaceC35237b;
import com.tencent.thumbplayer.tcmedia.core.player.TPDynamicStatisticParams;
import com.tencent.thumbplayer.tcmedia.core.player.TPGeneralPlayFlowParams;
import com.tencent.thumbplayer.tcmedia.tplayer.p174a.p175a.InterfaceC35385a;
import com.tencent.thumbplayer.tcmedia.utils.TPLogUtil;

/* JADX INFO: renamed from: com.tencent.thumbplayer.tcmedia.common.a */
/* JADX INFO: loaded from: classes62.dex */
public class C35303a implements InterfaceC35385a {

    /* JADX INFO: renamed from: a */
    private InterfaceC35237b f75954a;

    @Override // com.tencent.thumbplayer.tcmedia.tplayer.p174a.p175a.InterfaceC35385a
    /* JADX INFO: renamed from: a */
    public TPDynamicStatisticParams mo78033a(boolean z11) {
        InterfaceC35237b interfaceC35237b = this.f75954a;
        if (interfaceC35237b == null) {
            TPLogUtil.m78797e("TPPlayerInfoGetterImpl", "playerBase is null, return default dynamic statistic params");
            return new TPDynamicStatisticParams();
        }
        TPDynamicStatisticParams tPDynamicStatisticParamsMo77462c = interfaceC35237b.mo77462c(z11);
        if (tPDynamicStatisticParamsMo77462c != null) {
            return tPDynamicStatisticParamsMo77462c;
        }
        TPLogUtil.m78797e("TPPlayerInfoGetterImpl", "cannot get params from core, return default dynamic statistic params");
        return new TPDynamicStatisticParams();
    }

    @Override // com.tencent.thumbplayer.tcmedia.tplayer.p174a.p175a.InterfaceC35385a
    /* JADX INFO: renamed from: a */
    public TPGeneralPlayFlowParams mo78034a() {
        InterfaceC35237b interfaceC35237b = this.f75954a;
        if (interfaceC35237b == null) {
            TPLogUtil.m78797e("TPPlayerInfoGetterImpl", "playerBase is null, return default general play flow params");
            return new TPGeneralPlayFlowParams();
        }
        TPGeneralPlayFlowParams tPGeneralPlayFlowParamsMo77480v = interfaceC35237b.mo77480v();
        if (tPGeneralPlayFlowParamsMo77480v != null) {
            return tPGeneralPlayFlowParamsMo77480v;
        }
        TPLogUtil.m78797e("TPPlayerInfoGetterImpl", "cannot get params from core, return default general play flow params");
        return new TPGeneralPlayFlowParams();
    }

    public C35303a(InterfaceC35237b interfaceC35237b) {
        this.f75954a = interfaceC35237b;
    }
}
