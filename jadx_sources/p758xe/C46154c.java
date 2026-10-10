package p758xe;

import com.kubi.core.biz.callauction.action.CallAuctionTradeSwitchAction;
import com.kubi.core.spot.trade.tradeSwitchAction.NormalTradeSwitchAction;
import java.util.HashMap;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import ye.InterfaceC46470a;

/* JADX INFO: renamed from: xe.c */
/* JADX INFO: compiled from: TradeTypeFactory.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R-\u0010\u0004\u001a\u001e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005j\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007`\b¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, m90084d2 = {"Lcom/kubi/core/spot/trade/TradeTypeFactory;", "", "<init>", "()V", "tradeSwitchAction", "Ljava/util/HashMap;", "", "Lcom/kubi/core/spot/trade/tradeSwitchAction/ITradeSwitchAction;", "Lkotlin/collections/HashMap;", "getTradeSwitchAction", "()Ljava/util/HashMap;", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C46154c {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C46154c f103659a = new C46154c();

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final HashMap<String, InterfaceC46470a> f103660b;

    static {
        HashMap<String, InterfaceC46470a> map = new HashMap<>();
        map.put("call_auction", new CallAuctionTradeSwitchAction());
        map.put("default_mode", new NormalTradeSwitchAction());
        f103660b = map;
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final HashMap<String, InterfaceC46470a> m101752a() {
        return f103660b;
    }
}
