package r70;

import android.os.Bundle;
import com.kubi.core.biz.bottomtab.Tabs;
import com.kubi.router.utils.RouteExKt;
import gd.InterfaceC37868a;
import java.util.List;
import kotlinx.coroutines.flow.C41679x;
import kotlinx.coroutines.flow.InterfaceC41669n;
import kotlinx.coroutines.flow.InterfaceC41678w;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p309hd.InterfaceC38169a;
import p309hd.InterfaceC38170b;
import p309hd.TradeSettingsBean;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import ro.C44128b;

/* JADX INFO: renamed from: r70.a */
/* JADX INFO: compiled from: UnifiedSettingsRepo.kt */
/* JADX INFO: loaded from: classes54.dex */
@Metadata(m90083d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0012\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J\u0012\u0010\u0014\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0002J\u0012\u0010\u0015\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0002J\u0010\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\u0010\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00020\u001bH\u0016J\u000e\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001dH\u0016J\u0010\u0010\u001f\u001a\u00020\u00112\u0006\u0010 \u001a\u00020\rH\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006!"}, m90084d2 = {"Lcom/kubi/utaspotlib/repo/UnifiedSettingsRepo;", "Lcom/kubi/core/base/arch/repo/ILoginStateChange;", "Lcom/kubi/core/base/setting/ITradeSettingsRepo;", "<init>", "()V", "_settingsFlow", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/kubi/core/base/setting/data/TradeSettingsBean;", "tradeSettingsFlow", "Lkotlinx/coroutines/flow/StateFlow;", "getTradeSettingsFlow", "()Lkotlinx/coroutines/flow/StateFlow;", "supportMenuBiz", "", "menu", "Lcom/kubi/core/base/setting/MenusBiz;", "parseArguments", "", "arguments", "Landroid/os/Bundle;", "parseBottomTabArgs", "parseBuyOrSellArgs", "setTradePanelModel", "model", "Lcom/kubi/core/base/setting/data/TradePanelModel;", "setTradeDirection", "direction", "Lcom/kubi/core/base/setting/data/TradeDirection;", "supportBottomBizTab", "", "Lcom/kubi/core/biz/bottomtab/Tabs;", "onLoginChange", "isLogin", "UtaSpotLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C43938a implements InterfaceC37868a {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final InterfaceC41669n<TradeSettingsBean> f97146a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public final InterfaceC41678w<TradeSettingsBean> f97147b;

    @Override // gd.InterfaceC37868a
    @NotNull
    /* JADX INFO: renamed from: a */
    public InterfaceC41678w<TradeSettingsBean> mo85483a() {
        return this.f97147b;
    }

    @Override // gd.InterfaceC37868a
    /* JADX INFO: renamed from: b */
    public void mo85484b(@NotNull InterfaceC38169a direction) {
        Intrinsics.checkNotNullParameter(direction, "direction");
        InterfaceC41669n<TradeSettingsBean> interfaceC41669n = this.f97146a;
        interfaceC41669n.setValue(TradeSettingsBean.m86129b(interfaceC41669n.getValue(), direction, null, 0, null, 14, null));
    }

    @Override // gd.InterfaceC37868a
    /* JADX INFO: renamed from: c */
    public void mo85485c(@NotNull InterfaceC38170b model) {
        Intrinsics.checkNotNullParameter(model, "model");
        InterfaceC41669n<TradeSettingsBean> interfaceC41669n = this.f97146a;
        interfaceC41669n.setValue(TradeSettingsBean.m86129b(interfaceC41669n.getValue(), null, model, 0, null, 13, null));
        C44128b.m97258b("pittttttttt--setTradePanelModel: " + model + ", result: " + Intrinsics.areEqual(model, InterfaceC38170b.b.f85867a));
    }

    /* JADX INFO: renamed from: e */
    public final void m96884e(Bundle bundle) {
        int iIndexOf;
        String strM56284y = bundle != null ? RouteExKt.m56284y(bundle, "bottomTab") : null;
        List<Tabs> listM86132d = this.f97146a.getValue().m86132d();
        if (Intrinsics.areEqual(strM56284y, "order")) {
            iIndexOf = listM86132d.indexOf(Tabs.a.f20192a);
        } else {
            iIndexOf = Intrinsics.areEqual(strM56284y, "funds") ? listM86132d.indexOf(Tabs.b.f20194a) : 0;
        }
        int i11 = iIndexOf;
        InterfaceC41669n<TradeSettingsBean> interfaceC41669n = this.f97146a;
        interfaceC41669n.setValue(TradeSettingsBean.m86129b(interfaceC41669n.getValue(), null, null, i11, null, 11, null));
    }

    /* JADX INFO: renamed from: f */
    public final void m96885f(Bundle bundle) {
        Boolean boolM56221L;
        if (bundle != null && (boolM56221L = RouteExKt.m56221L(bundle, "isBuy")) != null) {
            InterfaceC38169a interfaceC38169a = boolM56221L.booleanValue() ? InterfaceC38169a.a.f85864a : InterfaceC38169a.b.f85865a;
            InterfaceC41669n<TradeSettingsBean> interfaceC41669n = this.f97146a;
            interfaceC41669n.setValue(TradeSettingsBean.m86129b(interfaceC41669n.getValue(), interfaceC38169a, null, 0, null, 14, null));
        }
        if (bundle != null) {
            bundle.remove("isBuy");
        }
    }

    public C43938a() {
        InterfaceC41669n<TradeSettingsBean> interfaceC41669nM91009a = C41679x.m91009a(new TradeSettingsBean(null, null, 0, null, 15, null));
        this.f97146a = interfaceC41669nM91009a;
        this.f97147b = interfaceC41669nM91009a;
    }

    @Override // gd.InterfaceC37868a
    /* JADX INFO: renamed from: d */
    public void mo85486d(@Nullable Bundle bundle) {
        m96884e(bundle);
        m96885f(bundle);
    }
}
