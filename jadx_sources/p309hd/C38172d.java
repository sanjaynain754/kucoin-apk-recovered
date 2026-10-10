package p309hd;

import com.kubi.core.biz.bottomtab.Tabs;
import com.kubi.spot.api.ISpotCommonService;
import java.util.List;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;

/* JADX INFO: renamed from: hd.d */
/* JADX INFO: compiled from: TradeSettingsBean.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m90083d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u001a\b\u0010\u0000\u001a\u00020\u0001H\u0002\u001a\u000e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0002¨\u0006\u0005"}, m90084d2 = {"defaultPanelMode", "Lcom/kubi/core/base/setting/data/TradePanelModel;", "defaultTabs", "", "Lcom/kubi/core/biz/bottomtab/Tabs;", "TradeCoreBizLib_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C38172d {
    /* JADX INFO: renamed from: d */
    public static final List<Tabs> m86138d() {
        return CollectionsKt.listOf((Object[]) new Tabs[]{Tabs.a.f20192a, Tabs.b.f20194a});
    }

    /* JADX INFO: renamed from: c */
    public static final InterfaceC38170b m86137c() {
        return ISpotCommonService.f49644a.get().mo59968l() ? InterfaceC38170b.b.f85867a : InterfaceC38170b.a.f85866a;
    }
}
