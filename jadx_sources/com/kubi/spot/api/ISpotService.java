package com.kubi.spot.api;

import android.app.Activity;
import android.content.Context;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwner;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.messaging.Constants;
import com.kubi.data.entity.MaintenanceEntity;
import com.kubi.data.entity.TradeItemBean;
import com.kubi.router.core.Router;
import com.kubi.sdk.BaseFragment;
import com.kubi.sdk.base.entity.BaseEntity;
import com.kubi.spot.entity.MarketsEntity;
import com.tencent.qcloud.tuicore.TUIConstants;
import io.reactivex.Observable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p705vx.InterfaceC45661b;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import y70.StorageId;

/* JADX INFO: compiled from: ISpotService.kt */
/* JADX INFO: loaded from: classes12.dex */
@InterfaceC45661b
@Metadata(m90083d1 = {"\u0000\u009c\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0011\bg\u0018\u0000 U2\u00020\u0001:\u0001UJ\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J\u001c\u0010\u0007\u001a\u00020\b2\u0012\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u000b0\nH&J\b\u0010\f\u001a\u00020\rH&J\b\u0010\u000e\u001a\u00020\u000fH&J.\u0010\u0010\u001a\u00020\u00112\u0014\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\b\u0018\u00010\u00132\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0016H&J\u001e\u0010\u0017\u001a\u00020\u00112\u0014\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\b\u0018\u00010\u0013H&J\u0012\u0010\u0018\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J\u0010\u0010\u0019\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u001bH&J\b\u0010\u001c\u001a\u00020\u0005H&J\u0010\u0010\u001d\u001a\u00020\b2\u0006\u0010\u001e\u001a\u00020\rH&J\u0010\u0010\u001f\u001a\u00020\u00032\u0006\u0010 \u001a\u00020\rH&J,\u0010!\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020$0#0\"2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010%\u001a\u00020\u00052\u0006\u0010&\u001a\u00020\u0005H&J$\u0010'\u001a\u00020\b2\u0006\u0010(\u001a\u00020)2\u0012\u0010*\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b0\u0013H&J&\u0010+\u001a\u00020\b2\b\u0010,\u001a\u0004\u0018\u00010-2\u0006\u0010.\u001a\u00020/2\n\b\u0002\u00100\u001a\u0004\u0018\u00010\u0005H&J\u001e\u00101\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010#0\"2\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J\u001a\u00102\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u00103\u001a\u00020\u0003H&J\u001e\u00104\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020605j\b\u0012\u0004\u0012\u000206`70\"H&J\u0010\u00108\u001a\n\u0012\u0006\b\u0001\u0012\u00020:09H&J\b\u0010;\u001a\u00020\u0005H&J,\u0010<\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020/0\u000b0\"2\u0006\u0010=\u001a\u00020\u00052\u0006\u0010>\u001a\u00020\u00032\u0006\u0010?\u001a\u00020\u0005H&JG\u0010@\u001a\u00020\b2\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010A\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u00100\u001a\u0004\u0018\u00010\u00052\u0016\b\u0002\u0010B\u001a\u0010\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u00020\b\u0018\u00010\u0013H&¢\u0006\u0002\u0010CJ\u000e\u0010D\u001a\b\u0012\u0004\u0012\u00020\u00030EH&J\u0010\u0010F\u001a\u00020\u00032\u0006\u0010G\u001a\u00020/H&J\u0010\u0010H\u001a\u00020\u00032\u0006\u0010G\u001a\u00020/H&J\u0018\u0010I\u001a\u00020\b2\u0006\u0010\u001e\u001a\u00020\r2\u0006\u0010G\u001a\u00020/H&J\b\u0010J\u001a\u00020\rH&J8\u0010K\u001a\u00020\b2\u0006\u0010L\u001a\u00020-2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010M\u001a\u00020\u00032\u0006\u0010N\u001a\u00020\u00032\u0006\u0010O\u001a\u00020\u00032\u0006\u0010P\u001a\u00020\u0005H&J\b\u0010Q\u001a\u00020\u000fH&J\u0010\u0010R\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010S\u001a\u00020\u0003H&J\u0010\u0010T\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u001bH&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006VÀ\u0006\u0001"}, m90084d2 = {"Lcom/kubi/spot/api/ISpotService;", "", "isMaintenance", "", "symbol", "", "allowCancelOrder", "getMarkets", "", "consumer", "Lio/reactivex/functions/Consumer;", "", "getSpotTradeFragment", "Lcom/kubi/sdk/BaseFragment;", "getSpotType", "", "getMaintenanceStatus", "Lio/reactivex/disposables/Disposable;", "complete", "Lkotlin/Function1;", "Lcom/kubi/data/entity/MaintenanceEntity;", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "Lkotlin/Function0;", "getCDNMaintenanceStatus", "getMaintenance", "refreshButtonStatus", "childFragmentManager", "Landroidx/fragment/app/FragmentManager;", "getTradingPageId", "baseTradeFragmentScrollToTop", "fragment", "isBaseTradeFragment", "currentFragment", "getPreviewInfo", "Lio/reactivex/Observable;", "Lcom/kubi/sdk/base/entity/BaseEntity;", "Lcom/kubi/data/entity/SymbolPreviewEntity;", FirebaseAnalytics.Param.CURRENCY, "lang", "bindFlowEvent", "lifecycleOwner", "Landroidx/lifecycle/LifecycleOwner;", "block", "toMarketReady", "context", "Landroid/content/Context;", "tradeItemBean", "Lcom/kubi/data/entity/TradeItemBean;", "spmId", "addFavorSymbol", "toSpotTradeTab", "isBuy", "getTabDataList", "Ljava/util/ArrayList;", "Lcom/kubi/spot/entity/MarketsEntity;", "Lkotlin/collections/ArrayList;", "getKuCoinMarketActivity", "Ljava/lang/Class;", "Landroid/app/Activity;", "actionWidgetDeskItem", "getMarketList", "market", "isMarket", "from", "handleSymbolClick", "fromType", TUIConstants.TUIChat.CALL_BACK, "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "getLastTradeIsIsolated", "Lcom/kubi/utils/storage/StorageId;", "isSymbolCallAuction", "item", "canReserveNewCoin", "reserveNewCoin", "getAlphaTradeFragment", "jump2SpotHorizontalKlinePage", "ctx", "showHistoryOrder", "showActivityOrder", "isFrom", "klineType", "getAlphaType", "isInOfflineEffect", "isOpenMarginStructuralMerge", "showBuySellRatioDialogTip", "Companion", "SpotApi_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface ISpotService {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final Companion f49646a = Companion.f49647a;

    /* JADX INFO: compiled from: ISpotService.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\u0006"}, m90084d2 = {"Lcom/kubi/spot/api/ISpotService$Companion;", "", "<init>", "()V", "get", "Lcom/kubi/spot/api/ISpotService;", "SpotApi_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ Companion f49647a = new Companion();

        @NotNull
        public final ISpotService get() {
            return (ISpotService) Router.f46192a.m56192n(ISpotService.class);
        }
    }

    /* JADX INFO: renamed from: B */
    void mo59985B(@NotNull Consumer<List<String>> consumer);

    /* JADX INFO: renamed from: C */
    void mo59986C(@NotNull FragmentManager fragmentManager);

    @NotNull
    /* JADX INFO: renamed from: D */
    StorageId<Boolean> mo59987D();

    /* JADX INFO: renamed from: E */
    boolean mo59988E();

    @NotNull
    /* JADX INFO: renamed from: F */
    BaseFragment mo59989F();

    @NotNull
    /* JADX INFO: renamed from: a */
    Disposable mo59990a(@Nullable Function1<? super MaintenanceEntity, Unit> function1, @Nullable Function0<Unit> function0);

    @NotNull
    Observable<BaseEntity<Object>> addFavorSymbol(@Nullable String symbol);

    @NotNull
    /* JADX INFO: renamed from: b */
    Observable<List<TradeItemBean>> mo59991b(@NotNull String str, boolean z11, @NotNull String str2);

    /* JADX INFO: renamed from: c */
    boolean mo59992c(@Nullable String str);

    /* JADX INFO: renamed from: e */
    boolean mo59993e(@NotNull BaseFragment baseFragment);

    /* JADX INFO: renamed from: f */
    boolean mo59994f(@NotNull String str);

    /* JADX INFO: renamed from: h */
    boolean mo59995h(@Nullable String str);

    /* JADX INFO: renamed from: i */
    boolean mo59996i(@NotNull TradeItemBean tradeItemBean);

    @NotNull
    /* JADX INFO: renamed from: j */
    String mo59997j();

    /* JADX INFO: renamed from: k */
    void mo59998k(@Nullable Context context, @NotNull TradeItemBean tradeItemBean, @Nullable String str);

    @NotNull
    /* JADX INFO: renamed from: l */
    Class<? extends Activity> mo59999l();

    /* JADX INFO: renamed from: m */
    boolean mo60000m(@NotNull TradeItemBean tradeItemBean);

    /* JADX INFO: renamed from: n */
    void mo60001n(@NotNull String str, boolean z11);

    /* JADX INFO: renamed from: o */
    void mo60002o(@NotNull BaseFragment baseFragment);

    @NotNull
    /* JADX INFO: renamed from: p */
    Observable<ArrayList<MarketsEntity>> mo60003p();

    /* JADX INFO: renamed from: q */
    int mo60004q();

    @NotNull
    /* JADX INFO: renamed from: r */
    BaseFragment mo60005r();

    /* JADX INFO: renamed from: s */
    void mo60006s(@NotNull FragmentManager fragmentManager);

    /* JADX INFO: renamed from: t */
    void mo60007t(@NotNull Context context, @NotNull String str, boolean z11, boolean z12, boolean z13, @NotNull String str2);

    /* JADX INFO: renamed from: u */
    boolean mo60008u(@Nullable String str);

    /* JADX INFO: renamed from: v */
    void mo60009v(@Nullable String str, @Nullable Integer num, @Nullable String str2, @Nullable Function1<? super TradeItemBean, Unit> function1);

    /* JADX INFO: renamed from: w */
    int mo60010w();

    /* JADX INFO: renamed from: x */
    void mo60011x(@NotNull LifecycleOwner lifecycleOwner, @NotNull Function1<? super String, Unit> function1);

    @NotNull
    /* JADX INFO: renamed from: y */
    Disposable mo60012y(@Nullable Function1<? super MaintenanceEntity, Unit> function1);

    @NotNull
    /* JADX INFO: renamed from: z */
    String mo60013z();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: A */
    static /* synthetic */ void m59982A(ISpotService iSpotService, String str, Integer num, String str2, Function1 function1, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: handleSymbolClick");
        }
        if ((i11 & 2) != 0) {
            num = 0;
        }
        if ((i11 & 4) != 0) {
            str2 = null;
        }
        if ((i11 & 8) != 0) {
            function1 = null;
        }
        iSpotService.mo60009v(str, num, str2, function1);
    }

    /* JADX INFO: renamed from: d */
    static /* synthetic */ void m59983d(ISpotService iSpotService, Context context, TradeItemBean tradeItemBean, String str, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: toMarketReady");
        }
        if ((i11 & 4) != 0) {
            str = null;
        }
        iSpotService.mo59998k(context, tradeItemBean, str);
    }

    /* JADX INFO: renamed from: g */
    static /* synthetic */ void m59984g(ISpotService iSpotService, String str, boolean z11, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: toSpotTradeTab");
        }
        if ((i11 & 2) != 0) {
            z11 = true;
        }
        iSpotService.mo60001n(str, z11);
    }
}
