package p758xe;

import com.kubi.core.biz.callauction.CallAuctionSwitch;
import com.kubi.core.spot.trade.tradeSwitchAction.NormalTradeSwitchAction;
import com.kubi.tradecorebiz.R$color;
import com.kubi.tradecorebiz.R$drawable;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import ye.InterfaceC46470a;

/* JADX INFO: renamed from: xe.b */
/* JADX INFO: compiled from: TradeSwitch.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ\u000e\u0010\u000b\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ\u0010\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\t\u001a\u00020\nJ\u0012\u0010\u000e\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\nH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000f"}, m90084d2 = {"Lcom/kubi/core/spot/trade/TradeSwitch;", "", "<init>", "()V", "DEFAULT_MODE", "", "CALL_AUCTION", "getTradeTypeTextColor", "", "isMargin", "", "getTradeTypeBgColor", "getTradeAction", "Lcom/kubi/core/spot/trade/tradeSwitchAction/ITradeSwitchAction;", "getTradeTypeString", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C46153b {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C46153b f103658a = new C46153b();

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ InterfaceC46470a m101747b(C46153b c46153b, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        return c46153b.m101748a(z11);
    }

    /* JADX INFO: renamed from: c */
    public final int m101749c(boolean z11) {
        return CallAuctionSwitch.f20317a.m21642h(z11) ? R$drawable.shape_cover4_8r : R$drawable.shape_cover4_8r;
    }

    /* JADX INFO: renamed from: d */
    public final String m101750d(boolean z11) {
        return CallAuctionSwitch.f20317a.m21642h(z11) ? "call_auction" : "default_mode";
    }

    /* JADX INFO: renamed from: e */
    public final int m101751e(boolean z11) {
        return CallAuctionSwitch.f20317a.m21642h(z11) ? R$color.c_text40 : R$color.c_text;
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final InterfaceC46470a m101748a(boolean z11) {
        InterfaceC46470a interfaceC46470a = C46154c.f103659a.m101752a().get(m101750d(z11));
        if (interfaceC46470a == null) {
            return new NormalTradeSwitchAction();
        }
        return interfaceC46470a;
    }
}
