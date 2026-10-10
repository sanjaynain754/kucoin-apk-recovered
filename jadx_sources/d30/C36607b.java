package d30;

import com.kubi.spot.business.callAuction.action.CallAuctionTradeSwitchAction;
import com.kubi.spot.business.callAuction.action.TradeTypeInfoCallAuction;
import com.kubi.spot.trade.tradeSwitchAction.NormalTradeSwitchAction;
import e30.InterfaceC37055a;
import java.util.HashMap;
import org.jetbrains.annotations.NotNull;
import p758xe.InterfaceC46152a;
import p852kotlin.Deprecated;
import p852kotlin.Metadata;

/* JADX INFO: renamed from: d30.b */
/* JADX INFO: compiled from: TradeTypeFactory.kt */
/* JADX INFO: loaded from: classes47.dex */
@Deprecated(message = "todo cassie 迁移到core层，替换为core层的TradeTypeFactory")
@Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R-\u0010\u0004\u001a\u001e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005j\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007`\b¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR-\u0010\u000b\u001a\u001e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\f0\u0005j\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\f`\b¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u000e"}, m90084d2 = {"Lcom/kubi/spot/trade/TradeTypeFactory;", "", "<init>", "()V", "tradeTypeInfo", "Ljava/util/HashMap;", "", "Lcom/kubi/core/spot/trade/ITradeTypeInfo;", "Lkotlin/collections/HashMap;", "getTradeTypeInfo", "()Ljava/util/HashMap;", "tradeSwitchAction", "Lcom/kubi/spot/trade/tradeSwitchAction/ITradeSwitchAction;", "getTradeSwitchAction", "SpotLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C36607b {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C36607b f79411a = new C36607b();

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final HashMap<String, InterfaceC46152a> f79412b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public static final HashMap<String, InterfaceC37055a> f79413c;

    static {
        HashMap<String, InterfaceC46152a> map = new HashMap<>();
        map.put("call_auction", new TradeTypeInfoCallAuction());
        map.put("default_mode", new C36608c());
        map.put("thr_mode", new C36609d());
        f79412b = map;
        HashMap<String, InterfaceC37055a> map2 = new HashMap<>();
        map2.put("call_auction", new CallAuctionTradeSwitchAction());
        map2.put("default_mode", new NormalTradeSwitchAction());
        map2.put("thr_mode", new NormalTradeSwitchAction());
        f79413c = map2;
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final HashMap<String, InterfaceC37055a> m81926a() {
        return f79413c;
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final HashMap<String, InterfaceC46152a> m81927b() {
        return f79412b;
    }
}
