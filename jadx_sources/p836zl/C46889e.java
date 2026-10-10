package p836zl;

import java.util.ArrayList;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;

/* JADX INFO: renamed from: zl.e */
/* JADX INFO: compiled from: BKuMexConstants.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010#\u001a\u0012\u0012\u0004\u0012\u00020\u00050$j\b\u0012\u0004\u0012\u00020\u0005`%R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006&"}, m90084d2 = {"Lcom/kubi/kumex/data/BKuMexTopic;", "", "<init>", "()V", "QUOTE_SNAPSHOT", "", "BOOK_SNAPSHOT", "KLINE_SNAPSHOT", "PRICE_SNAPSHOT", "TICKER_SNAPSHOT", "BALANCE_SNAPSHOT", "POSITION_SNAPSHOT", "POSITION_LIST_SNAPSHOT", "ACTIVE_ORDER_SNAPSHOT", "STOP_ORDER_SNAPSHOT", "TWAP_ORDER_SNAPSHOT", "RECENT_DEAL_SNAPSHOT", "CONTRACT_MAINTAIN", "CONTRACT_NOTICE", "CONTRACT_PRICE", "CONTRACT_MARKET_AGGREGATION_PRICE", "CONTRACT_UPDATE", "CONTRACT_CROSS_LEVERAGE", "CONTRACT_MARGIN_MODE_V2", "CONTRACT_POSITION_MODE", "TRIAL_BALANCE_SNAPSHOT", "TRIAL_POSITION_SNAPSHOT", "TRIAL_POSITION_LIST_SNAPSHOT", "TRIAL_STOP_ORDER_SNAPSHOT", "TRIAL_ACTIVE_ORDER_SNAPSHOT", "TRIAL_CONTRACT_CROSS_LEVERAGE", "TRIAL_CONTRACT_MARGIN_MODE", "TRIAL_CONTRACT_POSITION_MODE", "TRIAL_COUPON_COMING", "AIRDROP_POSITION", "getContractPrivateTopic", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C46889e {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C46889e f104716a = new C46889e();

    @NotNull
    /* JADX INFO: renamed from: a */
    public final ArrayList<String> m103227a() {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("/contractAccount/wallet");
        arrayList.add("/contract/position:%s");
        arrayList.add("/contract/positionAll");
        arrayList.add("/contractMarket/userActiveOrder");
        arrayList.add("/contractMarket/stopOrder");
        arrayList.add("/notice-center/notices");
        arrayList.add("/contract/crossLeverage");
        arrayList.add("/contract/marginModeV2");
        arrayList.add("/contract/positionMode");
        arrayList.add("/futuresTrial/wallet");
        arrayList.add("/futuresTrial/position:%s");
        arrayList.add("/futuresTrial/positionAll");
        arrayList.add("/futuresTrial/userActiveOrder");
        arrayList.add("/futuresTrial/stopOrder");
        arrayList.add("/futuresTrial/crossLeverage");
        arrayList.add("/futuresTrial/marginMode");
        arrayList.add("/futuresTrial/campaignCoupon");
        arrayList.add("/futuresTrial/positionMode");
        arrayList.add("/contractMarket/strategyOrder");
        arrayList.add("/futuresTrial/airdropPosition");
        return arrayList;
    }
}
