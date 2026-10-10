package id;

import com.kubi.search.searchresult.SearchCategory$Companion;
import com.kubi.user.config.UserInfo;
import com.kubi.utils.storage.StorageType;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import y70.StorageId;

/* JADX INFO: renamed from: id.a */
/* JADX INFO: compiled from: StorageIds.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\f\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010#\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010$\u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00078F¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00078F¢\u0006\u0006\u001a\u0004\b\r\u0010\nR\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\u00078F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\nR\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\nR\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\nR\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\nR\u0017\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\f0\u00078F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\nR\u0017\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\f0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\nR\u0017\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\f0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\nR\u0017\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\f0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\nR\u0017\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\u0007¢\u0006\b\n\u0000\u001a\u0004\b \u0010\nR\u0017\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\nR\u0017\u0010%\u001a\b\u0012\u0004\u0012\u00020\f0\u0007¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\nR\u0017\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00050\u00078F¢\u0006\u0006\u001a\u0004\b(\u0010\nR\u0017\u0010)\u001a\b\u0012\u0004\u0012\u00020\b0\u00078F¢\u0006\u0006\u001a\u0004\b*\u0010\n¨\u0006+"}, m90084d2 = {"Lcom/kubi/core/base/storage/StorageIds;", "", "<init>", "()V", "CATEGORY", "", "LATEST_SHOW_TIME_MILLIS_KEY", "Lcom/kubi/utils/storage/StorageId;", "", "getLATEST_SHOW_TIME_MILLIS_KEY", "()Lcom/kubi/utils/storage/StorageId;", "SAVING_TRADE_MODE_TAG", "", "getSAVING_TRADE_MODE_TAG", "SPOT_SCORE_YEAR", "getSPOT_SCORE_YEAR", "LAST_SYMBOL", "getLAST_SYMBOL", "LAST_MARGIN_SYMBOL", "getLAST_MARGIN_SYMBOL", "ALL_QUOTES", "getALL_QUOTES", "SHOW_MARKET_TIPS", "getSHOW_MARKET_TIPS", "lastTradeIsIsolated", "getLastTradeIsIsolated", "etfTips", "getEtfTips", "spotTradePageHideSmallFunds", "getSpotTradePageHideSmallFunds", "spotTradePageSortRule", "", "getSpotTradePageSortRule", "SYMBOL_OFFLINE_LIST", "getSYMBOL_OFFLINE_LIST", "SYMBOL_OFFLINE_TIP_DIALOG_SUPPRESS_UNTIL", "suppressKey", "SEGMENT_ORDER_TYPE_TIP_SHOWN", "getSEGMENT_ORDER_TYPE_TIP_SHOWN", "FLASH_CONVERT_MAX_POSITION", "getFLASH_CONVERT_MAX_POSITION", "FLASH_CONVERT_MAX_POSITION_TIME", "getFLASH_CONVERT_MAX_POSITION_TIME", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C38519a {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C38519a f86479a = new C38519a();

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final StorageId<String> f86480b = new StorageId<>(SearchCategory$Companion.SPOT, "lastSymbol0", null, true, 4, null);

    /* JADX INFO: renamed from: c */
    @NotNull
    public static final StorageId<String> f86481c = new StorageId<>(SearchCategory$Companion.SPOT, "lastMarginSymbol0", null, false, 12, null);

    /* JADX INFO: renamed from: d */
    @NotNull
    public static final StorageId<String> f86482d = new StorageId<>(SearchCategory$Companion.SPOT, "all_quotes_new", null, true, 4, null);

    /* JADX INFO: renamed from: e */
    @NotNull
    public static final StorageId<Boolean> f86483e = new StorageId<>(SearchCategory$Companion.SPOT, "last_trade_is_isolated", null, false, 12, null);

    /* JADX INFO: renamed from: f */
    @NotNull
    public static final StorageId<Boolean> f86484f = new StorageId<>(SearchCategory$Companion.SPOT, "etfTips", null, false, 12, null);

    /* JADX INFO: renamed from: g */
    @NotNull
    public static final StorageId<Boolean> f86485g;

    /* JADX INFO: renamed from: h */
    @NotNull
    public static final StorageId<Integer> f86486h;

    /* JADX INFO: renamed from: i */
    @NotNull
    public static final StorageId<String> f86487i;

    /* JADX INFO: renamed from: j */
    @NotNull
    public static final StorageId<Boolean> f86488j;

    static {
        StorageType storageType = StorageType.Shared;
        f86485g = new StorageId<>(SearchCategory$Companion.SPOT, "spot_trade_page_hide_small_funds", storageType, false, 8, null);
        f86486h = new StorageId<>(SearchCategory$Companion.SPOT, "spot_trade_page_sort_rule", storageType, false, 8, null);
        f86487i = new StorageId<>(SearchCategory$Companion.SPOT, "spot_symbol_offline_list", null, false, 12, null);
        f86488j = new StorageId<>(SearchCategory$Companion.SPOT, "segment_order_type_tip_shown", storageType, false, 8, null);
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final StorageId<String> m87127b() {
        return f86482d;
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final StorageId<Boolean> m87128c() {
        return f86484f;
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public final StorageId<String> m87129d() {
        StorageId storageId = new StorageId(SearchCategory$Companion.SPOT, "flash_convert_max_position", null, true, 4, null);
        String strH = UserInfo.a.h();
        if (strH == null) {
            strH = "";
        }
        return storageId.m102384f(strH);
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public final StorageId<Long> m87130e() {
        StorageId storageId = new StorageId(SearchCategory$Companion.SPOT, "flash_convert_max_position_time", null, true, 4, null);
        String strH = UserInfo.a.h();
        if (strH == null) {
            strH = "";
        }
        return storageId.m102384f(strH);
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public final StorageId<String> m87131f() {
        return f86481c;
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public final StorageId<String> m87132g() {
        return f86480b;
    }

    @NotNull
    /* JADX INFO: renamed from: h */
    public final StorageId<Long> m87133h() {
        StorageId storageId = new StorageId(SearchCategory$Companion.SPOT, "LATEST_SHOW_TIME_MILLIS", StorageType.Shared, false, 8, null);
        String strH = UserInfo.a.h();
        if (strH == null) {
            strH = "";
        }
        return storageId.m102384f(strH);
    }

    @NotNull
    /* JADX INFO: renamed from: i */
    public final StorageId<Boolean> m87134i() {
        return f86483e;
    }

    @NotNull
    /* JADX INFO: renamed from: j */
    public final StorageId<Boolean> m87135j() {
        return new StorageId<>(SearchCategory$Companion.SPOT, "SAVING_TRADE_MODE_TAG" + UserInfo.a.i(), null, true, 4, null);
    }

    @NotNull
    /* JADX INFO: renamed from: k */
    public final StorageId<Boolean> m87136k() {
        return f86488j;
    }

    @NotNull
    /* JADX INFO: renamed from: l */
    public final StorageId<Boolean> m87137l() {
        return new StorageId<>(SearchCategory$Companion.SPOT, UserInfo.a.i() + "isShowMarketTips", null, true, 4, null);
    }

    @NotNull
    /* JADX INFO: renamed from: m */
    public final StorageId<String> m87138m() {
        return new StorageId<>(SearchCategory$Companion.SPOT, "spot_score_year_" + UserInfo.a.i(), StorageType.Shared, true);
    }

    @NotNull
    /* JADX INFO: renamed from: n */
    public final StorageId<String> m87139n() {
        return f86487i;
    }

    @NotNull
    /* JADX INFO: renamed from: o */
    public final StorageId<Boolean> m87140o() {
        return f86485g;
    }

    @NotNull
    /* JADX INFO: renamed from: p */
    public final StorageId<Integer> m87141p() {
        return f86486h;
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final StorageId<Long> m87126a(@NotNull String suppressKey) {
        Intrinsics.checkNotNullParameter(suppressKey, "suppressKey");
        StorageId storageId = new StorageId(SearchCategory$Companion.SPOT, "symbol_offline_tip_dialog_suppress_until_" + suppressKey, StorageType.Shared, false, 8, null);
        String strH = UserInfo.a.h();
        if (strH == null) {
            strH = "";
        }
        return storageId.m102384f(strH);
    }
}
