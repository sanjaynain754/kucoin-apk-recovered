package com.kubi.trade.core.biz.api;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.messaging.Constants;
import com.kubi.router.core.Router;
import com.kubi.sdk.BaseFragment;
import org.jetbrains.annotations.NotNull;
import p705vx.InterfaceC45661b;
import p852kotlin.Metadata;

/* JADX INFO: compiled from: ITradeCoreService.kt */
/* JADX INFO: loaded from: classes12.dex */
@InterfaceC45661b
@Metadata(m90083d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\bg\u0018\u0000 32\u00020\u0001:\u00013J\b\u0010\u0002\u001a\u00020\u0003H&J\u0012\u0010\u0004\u001a\u00020\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H&J\u0012\u0010\u0007\u001a\u00020\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H&J\u000e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\tH&J\u0016\u0010\n\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\tH&J\u0010\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0010\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\rH&J\u001c\u0010\u0011\u001a\u00020\u000b2\u0012\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\t0\u0013H&J\b\u0010\u0014\u001a\u00020\u0015H&J.\u0010\u0016\u001a\u00020\u00172\u0014\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00192\u000e\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u001cH&J\u001e\u0010\u001d\u001a\u00020\u00172\u0014\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0019H&J\u0012\u0010\u001e\u001a\u00020\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H&J\b\u0010\u001f\u001a\u00020\u0006H&J\b\u0010 \u001a\u00020\u0006H&J\u0010\u0010!\u001a\u00020\u000b2\u0006\u0010\"\u001a\u00020#H&J\u0010\u0010$\u001a\u00020\u00032\u0006\u0010%\u001a\u00020#H&J,\u0010&\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020)0(0'2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010*\u001a\u00020\u00062\u0006\u0010+\u001a\u00020\u0006H&J$\u0010,\u001a\u00020\u000b2\u0006\u0010-\u001a\u00020.2\u0012\u0010/\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000b0\u0019H&J\u0018\u00100\u001a\u00020#2\u0006\u00101\u001a\u00020\u00062\u0006\u00102\u001a\u00020\u0006H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u00064À\u0006\u0001"}, m90084d2 = {"Lcom/kubi/trade/core/biz/api/ITradeCoreService;", "", "isUtaMode", "", "isMaintenance", "symbol", "", "allowCancelOrder", "getFavor", "", "saveNewFavor", "", "list", "Lcom/kubi/data/entity/TradeItemBean;", "isNativeFavor", "changedFavor", "tradeBean", "getMarkets", "consumer", "Lio/reactivex/functions/Consumer;", "getSpotType", "", "getMaintenanceStatus", "Lio/reactivex/disposables/Disposable;", "complete", "Lkotlin/Function1;", "Lcom/kubi/data/entity/MaintenanceEntity;", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "Lkotlin/Function0;", "getCDNMaintenanceStatus", "getMaintenance", "getMarketsSpotPageId", "getTradingPageId", "baseTradeFragmentScrollToTop", "fragment", "Lcom/kubi/sdk/BaseFragment;", "isBaseTradeFragment", "currentFragment", "getPreviewInfo", "Lio/reactivex/Observable;", "Lcom/kubi/sdk/base/entity/BaseEntity;", "Lcom/kubi/data/entity/SymbolPreviewEntity;", FirebaseAnalytics.Param.CURRENCY, "lang", "bindFlowEvent", "lifecycleOwner", "Landroidx/lifecycle/LifecycleOwner;", "block", "getRnOrderCenterFragment", "tradeType", "currentSymbol", "Companion", "TradeCoreBizApi_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface ITradeCoreService {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final Companion f51346a = Companion.f51347a;

    /* JADX INFO: compiled from: ITradeCoreService.kt */
    /* JADX INFO: loaded from: classes45.dex */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\u0006"}, m90084d2 = {"Lcom/kubi/trade/core/biz/api/ITradeCoreService$Companion;", "", "<init>", "()V", "get", "Lcom/kubi/trade/core/biz/api/ITradeCoreService;", "TradeCoreBizApi_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ Companion f51347a = new Companion();

        @NotNull
        public final ITradeCoreService get() {
            return (ITradeCoreService) Router.f46192a.m56192n(ITradeCoreService.class);
        }
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    BaseFragment mo63102a(@NotNull String str, @NotNull String str2);
}
