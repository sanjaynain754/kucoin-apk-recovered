package d30;

import android.content.Context;
import com.kubi.core.biz.callauction.CallAuctionSwitch;
import com.kubi.router.core.Router;
import com.kubi.sdk.site.info.SiteInfoManager;
import com.kubi.spot.R$color;
import com.kubi.spot.R$drawable;
import com.kubi.spot.trade.tradeSwitchAction.NormalTradeSwitchAction;
import com.kubi.tradebase.tradetype.TradeType;
import e30.InterfaceC37055a;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p758xe.InterfaceC46152a;
import p830zf.InterfaceC46793d0;
import p852kotlin.Deprecated;
import p852kotlin.Metadata;
import p852kotlin.collections.ArraysKt;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: d30.a */
/* JADX INFO: compiled from: TradeSwitch.kt */
/* JADX INFO: loaded from: classes47.dex */
@Deprecated(message = "todo cassie，要迁移为core层的TradeSwitch")
@Metadata(m90083d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\b\u001a\u00020\u0005J\u0006\u0010\t\u001a\u00020\nJ\u0006\u0010\u000b\u001a\u00020\nJ\u0006\u0010\f\u001a\u00020\rJ\u0006\u0010\u000e\u001a\u00020\u000fJ\u0016\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\nJ\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015J\u000e\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0018"}, m90084d2 = {"Lcom/kubi/spot/trade/TradeSwitch;", "", "<init>", "()V", "DEFAULT_MODE", "", "CALL_AUCTION", "THR_MODE", "getTradeTypeString", "getTradeTypeTextColor", "", "getTradeTypeBgColor", "getTradeTypeInfo", "Lcom/kubi/core/spot/trade/ITradeTypeInfo;", "getTradeAction", "Lcom/kubi/spot/trade/tradeSwitchAction/ITradeSwitchAction;", "getSupportTradeTypeTitle", "context", "Landroid/content/Context;", "index", "getSupportTradeType", "", "Lcom/kubi/tradebase/tradetype/TradeType;", "getSpotSupportTradeType", "SpotLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nTradeSwitch.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TradeSwitch.kt\ncom/kubi/spot/trade/TradeSwitch\n+ 2 FlavorEx.kt\ncom/kubi/kucoin/helper/FlavorExKt\n*L\n1#1,122:1\n17#2,2:123\n*S KotlinDebug\n*F\n+ 1 TradeSwitch.kt\ncom/kubi/spot/trade/TradeSwitch\n*L\n28#1:123,2\n*E\n"})
public final class C36606a {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C36606a f79410a = new C36606a();

    /* JADX INFO: renamed from: a */
    public final List<TradeType> m81918a() {
        return CollectionsKt.arrayListOf(TradeType.LIMIT, TradeType.MARKET, TradeType.ADVANCED_LIMIT, TradeType.LIMIT_STOP, TradeType.MARKET_STOP, TradeType.OCO, TradeType.TSO);
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final String m81920c(@NotNull Context context, int i11) {
        Intrinsics.checkNotNullParameter(context, "context");
        String[] stringArray = context.getResources().getStringArray(m81923f().mo60492a());
        Intrinsics.checkNotNullExpressionValue(stringArray, "getStringArray(...)");
        String str = (String) CollectionsKt.getOrNull(ArraysKt.toList(stringArray), i11);
        return str == null ? "" : str;
    }

    /* JADX INFO: renamed from: e */
    public final int m81922e() {
        return CallAuctionSwitch.m21636i(CallAuctionSwitch.f20317a, false, 1, null) ? R$drawable.shape_cover4_8r : R$drawable.shape_cover4_8r;
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public final String m81924g() {
        if (CallAuctionSwitch.m21636i(CallAuctionSwitch.f20317a, false, 1, null)) {
            return "call_auction";
        }
        Object objM56186h = Router.f46192a.m56186h(InterfaceC46793d0.class, SiteInfoManager.f47913a.m58109c());
        return objM56186h != null ? ((InterfaceC46793d0) objM56186h).m103121a() : true ? "default_mode" : "thr_mode";
    }

    /* JADX INFO: renamed from: h */
    public final int m81925h() {
        return CallAuctionSwitch.m21636i(CallAuctionSwitch.f20317a, false, 1, null) ? R$color.c_text40 : R$color.c_text;
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final List<TradeType> m81919b() {
        String strM81924g = m81924g();
        if (Intrinsics.areEqual(strM81924g, "call_auction")) {
            return CollectionsKt.arrayListOf(TradeType.LIMIT);
        }
        if (Intrinsics.areEqual(strM81924g, "thr_mode")) {
            return CollectionsKt.arrayListOf(TradeType.LIMIT, TradeType.MARKET, TradeType.LIMIT_STOP, TradeType.MARKET_STOP, TradeType.TSO);
        }
        return m81918a();
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public final InterfaceC37055a m81921d() {
        InterfaceC37055a interfaceC37055a = C36607b.f79411a.m81926a().get(m81924g());
        if (interfaceC37055a == null) {
            return new NormalTradeSwitchAction();
        }
        return interfaceC37055a;
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public final InterfaceC46152a m81923f() {
        InterfaceC46152a interfaceC46152a = C36607b.f79411a.m81927b().get(m81924g());
        if (interfaceC46152a == null) {
            return new C36608c();
        }
        return interfaceC46152a;
    }
}
