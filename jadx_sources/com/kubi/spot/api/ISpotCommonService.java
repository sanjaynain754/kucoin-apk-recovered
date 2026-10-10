package com.kubi.spot.api;

import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.data.entity.SymbolInfoEntity;
import com.kubi.resources.dialog.DialogFragmentHelper;
import com.kubi.router.core.Router;
import com.kubi.sdk.BaseFragment;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p705vx.InterfaceC45661b;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: ISpotCommonService.kt */
/* JADX INFO: loaded from: classes12.dex */
@InterfaceC45661b
@Metadata(m90083d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0007\bg\u0018\u0000 L2\u00020\u0001:\u0001LJ\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J\u0012\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\u0005H&J\b\u0010\n\u001a\u00020\bH&J\u0016\u0010\u000b\u001a\u00020\u00032\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\rH&J\u0016\u0010\u000e\u001a\u00020\u00032\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\rH&J\u0016\u0010\u000f\u001a\u00020\b2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\b0\rH&J\b\u0010\u0011\u001a\u00020\u0012H&J\u0014\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H&J\b\u0010\u0016\u001a\u00020\bH&J\b\u0010\u0017\u001a\u00020\bH&J\u001c\u0010\u0018\u001a\u00020\u00032\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00030\u001aH&J\u0018\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u001d\u001a\u00020\u0012H&J\u001e\u0010\u001e\u001a\u00020\u001c2\b\b\u0002\u0010\u001f\u001a\u00020\b2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010!H&J\b\u0010\"\u001a\u00020\u0014H&J5\u0010#\u001a\u00020\u00032\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00140%2\b\u0010&\u001a\u0004\u0018\u00010'2\b\u0010(\u001a\u0004\u0018\u00010)H&¢\u0006\u0002\u0010*J\u0010\u0010+\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u0014H&J\u0010\u0010,\u001a\u00020\b2\u0006\u0010-\u001a\u00020\u0014H&J\b\u0010.\u001a\u00020\u0012H&J\b\u0010/\u001a\u00020\u0012H&J\u001c\u00100\u001a\u00020\u00032\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\b\u0002\u00101\u001a\u00020\bH&J\u001a\u00102\u001a\u00020\u00032\u0006\u00103\u001a\u00020\u00142\b\u00104\u001a\u0004\u0018\u00010\u0001H&J\u0012\u00105\u001a\u0004\u0018\u00010\u00012\u0006\u00103\u001a\u00020\u0014H&J\u0010\u00106\u001a\u00020\u00032\u0006\u00107\u001a\u000208H&J\b\u00109\u001a\u00020\u001cH&J&\u0010:\u001a\u00020\u001c2\b\u0010;\u001a\u0004\u0018\u00010\u00142\b\u0010<\u001a\u0004\u0018\u00010\u00142\b\u0010=\u001a\u0004\u0018\u00010\u0014H&J\b\u0010>\u001a\u00020\bH&J\u0010\u0010?\u001a\u00020\u00032\u0006\u0010@\u001a\u00020\bH&J\u0012\u0010A\u001a\u00020\u00032\b\u0010B\u001a\u0004\u0018\u00010\u0014H&J\u0016\u0010C\u001a\u00020\u00032\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\rH&J\b\u0010D\u001a\u00020\u0003H&J\b\u0010E\u001a\u00020FH&J\u0012\u0010G\u001a\u00020\b2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H&J\b\u0010H\u001a\u00020\bH&J\u0016\u0010I\u001a\u00020\u00032\f\u0010J\u001a\b\u0012\u0004\u0012\u00020\u00030\rH&J\b\u0010K\u001a\u00020\bH&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006MÀ\u0006\u0001"}, m90084d2 = {"Lcom/kubi/spot/api/ISpotCommonService;", "", "flavorFAQ", "", "enterView", "Landroid/view/View;", "flavorKlinePadding", "flavorMore", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "flavorLeverageLabelVisible", "flavorComplianceInfo", "onTrue", "Lkotlin/Function0;", "flavorEtfTip", "flavorVipFee", "default", "flavorMoreShow", "", "flavorResetSymbol", "", "symbol", "flavorSupportSavingTrade", "flavorMarketTradeAnalysis", "flavorHideRankInfoView", TUIConstants.TIMPush.NOTIFICATION.ACTION, "Lkotlin/Function1;", "getSpotSmallFlutterKlineFragment", "Lcom/kubi/sdk/BaseFragment;", "precision", "getToggleSymbolsFragment", "isMarket", "tradeItemBean", "Lcom/kubi/data/entity/TradeItemBean;", "getNotifyMaintenanceEventKey", "showGooglePlayScoreWhenOrderDone", "orderParams", "", "rise", "", "activity", "Landroidx/fragment/app/FragmentActivity;", "(Ljava/util/Map;Ljava/lang/Double;Landroidx/fragment/app/FragmentActivity;)V", "jumpToSpotCoupons", "isKYC0UserError", "code", "getSpotTradeType", "getPriceUpdateInterval", "jumpSpotTradeTab", "isBuy", "saveToGlobalStorage", "key", "value", "getFromGlobalStorage", "jumpToSpotInformation", "symbolInfo", "Lcom/kubi/data/entity/SymbolInfoEntity;", "getCallAuctionFragment", "getDelegationHistoryFragment", "tradeType", "fromSymbol", "side", "isVerticalTradeUIPanel", "saveTradeUIPanelModel", "isVertical", "jumpToDeposit", FirebaseAnalytics.Param.CURRENCY, "flavorPriceRule", "jumpToEtfTermPage", "getCallAuctionProcessContainerDialog", "Lcom/kubi/resources/dialog/DialogFragmentHelper;", "isMatchMaintenanceCancelLimit", "isSupportGuideTab", "flavorSpotSupportFAQ", "success", "flavorMoreMenuMultiTab", "Companion", "SpotApi_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface ISpotCommonService {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final Companion f49644a = Companion.f49645a;

    /* JADX INFO: compiled from: ISpotCommonService.kt */
    /* JADX INFO: loaded from: classes47.dex */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\u0006"}, m90084d2 = {"Lcom/kubi/spot/api/ISpotCommonService$Companion;", "", "<init>", "()V", "get", "Lcom/kubi/spot/api/ISpotCommonService;", "SpotApi_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ Companion f49645a = new Companion();

        @NotNull
        public final ISpotCommonService get() {
            return (ISpotCommonService) Router.f46192a.m56192n(ISpotCommonService.class);
        }
    }

    /* JADX INFO: renamed from: A */
    void mo59955A();

    /* JADX INFO: renamed from: B */
    boolean mo59956B(@NotNull Function0<Boolean> function0);

    /* JADX INFO: renamed from: a */
    boolean mo59957a();

    @Nullable
    /* JADX INFO: renamed from: b */
    String mo59958b(@Nullable String str);

    /* JADX INFO: renamed from: c */
    boolean mo59959c(@Nullable View view);

    /* JADX INFO: renamed from: d */
    int mo59960d();

    /* JADX INFO: renamed from: e */
    boolean mo59961e();

    /* JADX INFO: renamed from: f */
    void mo59962f(@NotNull Function0<Unit> function0);

    /* JADX INFO: renamed from: g */
    void mo59963g(@NotNull String str, @Nullable Object obj);

    /* JADX INFO: renamed from: h */
    void mo59964h(@NotNull Function0<Unit> function0);

    /* JADX INFO: renamed from: i */
    void mo59965i(@Nullable String str);

    @Nullable
    /* JADX INFO: renamed from: j */
    Object mo59966j(@NotNull String str);

    /* JADX INFO: renamed from: k */
    void mo59967k(@NotNull Map<String, String> map, @Nullable Double d11, @Nullable FragmentActivity fragmentActivity);

    /* JADX INFO: renamed from: l */
    boolean mo59968l();

    /* JADX INFO: renamed from: m */
    int mo59969m();

    /* JADX INFO: renamed from: n */
    int mo59970n();

    /* JADX INFO: renamed from: o */
    void mo59971o(@NotNull String str);

    /* JADX INFO: renamed from: p */
    void mo59972p(@NotNull SymbolInfoEntity symbolInfoEntity);

    /* JADX INFO: renamed from: q */
    boolean mo59973q(@Nullable String str);

    @NotNull
    /* JADX INFO: renamed from: r */
    BaseFragment mo59974r();

    /* JADX INFO: renamed from: s */
    void mo59975s(@Nullable String str, boolean z11);

    /* JADX INFO: renamed from: t */
    void mo59976t(@NotNull Function0<Unit> function0);

    @NotNull
    /* JADX INFO: renamed from: u */
    BaseFragment mo59977u(@NotNull String str, int i11);

    @NotNull
    /* JADX INFO: renamed from: v */
    String mo59978v();

    @NotNull
    /* JADX INFO: renamed from: w */
    BaseFragment mo59979w(@Nullable String str, @Nullable String str2, @Nullable String str3);

    /* JADX INFO: renamed from: y */
    void mo59980y(@NotNull Function0<Unit> function0);

    @NotNull
    /* JADX INFO: renamed from: z */
    DialogFragmentHelper mo59981z();

    /* JADX INFO: renamed from: x */
    static /* synthetic */ void m59954x(ISpotCommonService iSpotCommonService, String str, boolean z11, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: jumpSpotTradeTab");
        }
        if ((i11 & 2) != 0) {
            z11 = true;
        }
        iSpotCommonService.mo59975s(str, z11);
    }
}
