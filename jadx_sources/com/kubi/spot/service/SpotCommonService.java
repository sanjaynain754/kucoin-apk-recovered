package com.kubi.spot.service;

import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.data.entity.SymbolInfoEntity;
import com.kubi.resources.dialog.DialogFragmentHelper;
import com.kubi.router.core.Router;
import com.kubi.sdk.BaseFragment;
import com.kubi.sdk.site.C24129b;
import com.kubi.sdk.site.SiteVisibleConfigKey;
import com.kubi.sdk.site.info.SiteInfoManager;
import com.kubi.spot.BSpotApp;
import com.kubi.spot.SpotRemoteConfig;
import com.kubi.spot.api.ISpotCommonService;
import com.kubi.spot.business.callAuction.callAuctionProcessDialog.CallAuctionProcessContainerDialog;
import com.kubi.spot.business.callAuction.callAuctionProcessDialog.CallAuctionProcessFragment;
import com.kubi.spot.business.delegation.delegateHistory.DelegationHistoryFragment;
import com.kubi.spot.business.submit.GooglePlayScoreHelper;
import com.kubi.spot.helper.TradeManager;
import com.kubi.spot.kline.flutter.SpotSmallFlutterKlineFragment;
import com.tencent.qcloud.tuicore.TUIConstants;
import e20.InterfaceC37052c;
import eg.InterfaceC37174b;
import f00.C37304a;
import f30.C37330a;
import f30.C37333d;
import f30.C37340k;
import g00.InterfaceC37766r;
import gf.C37878b0;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p830zf.InterfaceC46789b0;
import p830zf.InterfaceC46793d0;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: com.kubi.spot.service.a, reason: from Kotlin metadata */
/* JADX INFO: compiled from: SpotCommonService.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016J\u0012\u0010\b\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016J\u0012\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0007H\u0016J\b\u0010\f\u001a\u00020\nH\u0016J\u0016\u0010\r\u001a\u00020\u00052\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\u000fH\u0016J\u0016\u0010\u0010\u001a\u00020\u00052\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\u000fH\u0016J\u0016\u0010\u0011\u001a\u00020\n2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\n0\u000fH\u0016J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\u0014\u0010\u0015\u001a\u0004\u0018\u00010\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0016J\b\u0010\u0018\u001a\u00020\nH\u0016J\b\u0010\u0019\u001a\u00020\nH\u0016J\u001c\u0010\u001a\u001a\u00020\u00052\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00050\u001cH\u0016J\u0018\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u001f\u001a\u00020\u0014H\u0016J\u001a\u0010 \u001a\u00020\u001e2\u0006\u0010!\u001a\u00020\n2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0016J\b\u0010$\u001a\u00020\u0016H\u0016J5\u0010%\u001a\u00020\u00052\u0012\u0010&\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00160'2\b\u0010(\u001a\u0004\u0018\u00010)2\b\u0010*\u001a\u0004\u0018\u00010+H\u0016¢\u0006\u0002\u0010,J\u0010\u0010-\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u0016H\u0016J\u0010\u0010.\u001a\u00020\n2\u0006\u0010/\u001a\u00020\u0016H\u0016J\b\u00100\u001a\u00020\u0014H\u0016J\b\u00101\u001a\u00020\u0014H\u0016J\u001a\u00102\u001a\u00020\u00052\b\u0010\u0017\u001a\u0004\u0018\u00010\u00162\u0006\u00103\u001a\u00020\nH\u0016J\u001a\u00104\u001a\u00020\u00052\u0006\u00105\u001a\u00020\u00162\b\u00106\u001a\u0004\u0018\u000107H\u0016J\u0012\u00108\u001a\u0004\u0018\u0001072\u0006\u00105\u001a\u00020\u0016H\u0016J\u0010\u00109\u001a\u00020\u00052\u0006\u0010:\u001a\u00020;H\u0016J\b\u0010<\u001a\u00020\u001eH\u0016J&\u0010=\u001a\u00020\u001e2\b\u0010>\u001a\u0004\u0018\u00010\u00162\b\u0010?\u001a\u0004\u0018\u00010\u00162\b\u0010@\u001a\u0004\u0018\u00010\u0016H\u0016J\b\u0010A\u001a\u00020\nH\u0016J\u0010\u0010B\u001a\u00020\u00052\u0006\u0010C\u001a\u00020\nH\u0016J\u0012\u0010D\u001a\u00020\u00052\b\u0010E\u001a\u0004\u0018\u00010\u0016H\u0016J\u0016\u0010F\u001a\u00020\u00052\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\u000fH\u0016J\b\u0010G\u001a\u00020\u0005H\u0016J\b\u0010H\u001a\u00020IH\u0016J\u0012\u0010J\u001a\u00020\n2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0016J\b\u0010K\u001a\u00020\nH\u0016J\u0016\u0010L\u001a\u00020\u00052\f\u0010M\u001a\b\u0012\u0004\u0012\u00020\u00050\u000fH\u0016J\b\u0010N\u001a\u00020\nH\u0016¨\u0006O"}, m90084d2 = {"Lcom/kubi/spot/service/SpotCommonService;", "Lcom/kubi/spot/api/ISpotCommonService;", "<init>", "()V", "flavorFAQ", "", "enterView", "Landroid/view/View;", "flavorKlinePadding", "flavorMore", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "flavorLeverageLabelVisible", "flavorComplianceInfo", "onTrue", "Lkotlin/Function0;", "flavorEtfTip", "flavorVipFee", "default", "flavorMoreShow", "", "flavorResetSymbol", "", "symbol", "flavorSupportSavingTrade", "flavorMarketTradeAnalysis", "flavorHideRankInfoView", TUIConstants.TIMPush.NOTIFICATION.ACTION, "Lkotlin/Function1;", "getSpotSmallFlutterKlineFragment", "Lcom/kubi/sdk/BaseFragment;", "precision", "getToggleSymbolsFragment", "isMarket", "tradeItemBean", "Lcom/kubi/data/entity/TradeItemBean;", "getNotifyMaintenanceEventKey", "showGooglePlayScoreWhenOrderDone", "orderParams", "", "rise", "", "activity", "Landroidx/fragment/app/FragmentActivity;", "(Ljava/util/Map;Ljava/lang/Double;Landroidx/fragment/app/FragmentActivity;)V", "jumpToSpotCoupons", "isKYC0UserError", "code", "getSpotTradeType", "getPriceUpdateInterval", "jumpSpotTradeTab", "isBuy", "saveToGlobalStorage", "key", "value", "", "getFromGlobalStorage", "jumpToSpotInformation", "symbolInfo", "Lcom/kubi/data/entity/SymbolInfoEntity;", "getCallAuctionFragment", "getDelegationHistoryFragment", "tradeType", "fromSymbol", "side", "isVerticalTradeUIPanel", "saveTradeUIPanelModel", "isVertical", "jumpToDeposit", FirebaseAnalytics.Param.CURRENCY, "flavorPriceRule", "jumpToEtfTermPage", "getCallAuctionProcessContainerDialog", "Lcom/kubi/resources/dialog/DialogFragmentHelper;", "isMatchMaintenanceCancelLimit", "isSupportGuideTab", "flavorSpotSupportFAQ", "success", "flavorMoreMenuMultiTab", "SpotLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nSpotCommonService.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SpotCommonService.kt\ncom/kubi/spot/service/SpotCommonService\n+ 2 FlavorEx.kt\ncom/kubi/kucoin/helper/FlavorExKt\n*L\n1#1,230:1\n25#2,3:231\n25#2,3:234\n17#2,2:237\n17#2,2:239\n33#2:241\n17#2,2:242\n34#2,3:244\n17#2,2:247\n17#2,2:249\n17#2,2:251\n17#2,2:253\n17#2,2:255\n17#2,2:257\n33#2:259\n17#2,2:260\n34#2,3:262\n17#2,2:265\n33#2:267\n17#2,2:268\n34#2,3:270\n17#2,2:273\n*S KotlinDebug\n*F\n+ 1 SpotCommonService.kt\ncom/kubi/spot/service/SpotCommonService\n*L\n53#1:231,3\n62#1:234,3\n69#1:237,2\n77#1:239,2\n83#1:241\n83#1:242,2\n83#1:244,3\n89#1:247,2\n93#1:249,2\n97#1:251,2\n105#1:253,2\n109#1:255,2\n113#1:257,2\n200#1:259\n200#1:260,2\n200#1:262,3\n218#1:265,2\n222#1:267\n222#1:268,2\n222#1:270,3\n228#1:273,2\n*E\n"})
public final class SpotCommonService implements ISpotCommonService {
    @Override // com.kubi.spot.api.ISpotCommonService
    /* JADX INFO: renamed from: n */
    public int mo59970n() {
        return 0;
    }

    @Override // com.kubi.spot.api.ISpotCommonService
    /* JADX INFO: renamed from: s */
    public void mo59975s(@Nullable String str, boolean z11) {
        C37330a.m83911c(str, z11, 0, 4, null);
    }

    @Override // com.kubi.spot.api.ISpotCommonService
    /* JADX INFO: renamed from: A */
    public void mo59955A() {
        C37304a c37304a = C37304a.f82764a;
        String ETF_TERM = InterfaceC37052c.f82307e;
        Intrinsics.checkNotNullExpressionValue(ETF_TERM, "ETF_TERM");
        InterfaceC37766r.a.m85190a(c37304a, ETF_TERM, null, null, null, null, null, null, 126, null);
    }

    @Override // com.kubi.spot.api.ISpotCommonService
    /* JADX INFO: renamed from: B */
    public boolean mo59956B(@NotNull Function0<Boolean> function0) {
        Intrinsics.checkNotNullParameter(function0, "default");
        Object objM56186h = Router.f46192a.m56186h(InterfaceC37174b.class, SiteInfoManager.f47913a.m58109c());
        return (objM56186h != null ? Boolean.valueOf(((InterfaceC37174b) objM56186h).m83147g()) : function0.invoke()).booleanValue();
    }

    @Override // com.kubi.spot.api.ISpotCommonService
    /* JADX INFO: renamed from: a */
    public boolean mo59957a() {
        Object objM56186h = Router.f46192a.m56186h(InterfaceC46789b0.class, SiteInfoManager.f47913a.m58109c());
        if (objM56186h != null) {
            return ((InterfaceC46789b0) objM56186h).mo103116a();
        }
        return false;
    }

    @Override // com.kubi.spot.api.ISpotCommonService
    @Nullable
    /* JADX INFO: renamed from: b */
    public String mo59958b(@Nullable String str) {
        Object objM56186h = Router.f46192a.m56186h(InterfaceC37174b.class, SiteInfoManager.f47913a.m58109c());
        return objM56186h != null ? ((InterfaceC37174b) objM56186h).m83142b(str) : false ? "BTC-THB" : str;
    }

    @Override // com.kubi.spot.api.ISpotCommonService
    /* JADX INFO: renamed from: c */
    public boolean mo59959c(@Nullable View view) {
        Object objM56186h = Router.f46192a.m56186h(InterfaceC37174b.class, SiteInfoManager.f47913a.m58109c());
        if (objM56186h != null) {
            return ((InterfaceC37174b) objM56186h).m83143c(view);
        }
        return true;
    }

    @Override // com.kubi.spot.api.ISpotCommonService
    /* JADX INFO: renamed from: d */
    public int mo59960d() {
        Object objM56186h = Router.f46192a.m56186h(InterfaceC37174b.class, SiteInfoManager.f47913a.m58109c());
        if (objM56186h != null) {
            return ((InterfaceC37174b) objM56186h).m83144d();
        }
        return 0;
    }

    @Override // com.kubi.spot.api.ISpotCommonService
    /* JADX INFO: renamed from: e */
    public boolean mo59961e() {
        return C24129b.m58030b(SiteVisibleConfigKey.Margin);
    }

    @Override // com.kubi.spot.api.ISpotCommonService
    /* JADX INFO: renamed from: f */
    public void mo59962f(@NotNull Function0<Unit> onTrue) {
        Intrinsics.checkNotNullParameter(onTrue, "onTrue");
        Object objM56186h = Router.f46192a.m56186h(InterfaceC46793d0.class, SiteInfoManager.f47913a.m58109c());
        if (objM56186h != null ? ((InterfaceC46793d0) objM56186h).m103122b() : true) {
            onTrue.invoke();
        }
    }

    @Override // com.kubi.spot.api.ISpotCommonService
    /* JADX INFO: renamed from: g */
    public void mo59963g(@NotNull String key, @Nullable Object obj) {
        Intrinsics.checkNotNullParameter(key, "key");
        C37333d.f82848a.m83918b(key, obj);
    }

    @Override // com.kubi.spot.api.ISpotCommonService
    /* JADX INFO: renamed from: h */
    public void mo59964h(@NotNull Function0<Unit> success) {
        Intrinsics.checkNotNullParameter(success, "success");
        Object objM56186h = Router.f46192a.m56186h(InterfaceC37174b.class, SiteInfoManager.f47913a.m58109c());
        if (objM56186h != null ? ((InterfaceC37174b) objM56186h).m83145e() : true) {
            success.invoke();
        }
    }

    @Override // com.kubi.spot.api.ISpotCommonService
    /* JADX INFO: renamed from: i */
    public void mo59965i(@Nullable String str) {
        C37340k.f82854a.m83929f(str);
    }

    @Override // com.kubi.spot.api.ISpotCommonService
    @Nullable
    /* JADX INFO: renamed from: j */
    public Object mo59966j(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return C37333d.f82848a.m83917a(key);
    }

    @Override // com.kubi.spot.api.ISpotCommonService
    /* JADX INFO: renamed from: k */
    public void mo59967k(@NotNull Map<String, String> orderParams, @Nullable Double d11, @Nullable FragmentActivity fragmentActivity) {
        Intrinsics.checkNotNullParameter(orderParams, "orderParams");
        GooglePlayScoreHelper googlePlayScoreHelper = new GooglePlayScoreHelper();
        googlePlayScoreHelper.m61655k(orderParams);
        googlePlayScoreHelper.m61656l(d11);
        googlePlayScoreHelper.m61657m(fragmentActivity);
    }

    @Override // com.kubi.spot.api.ISpotCommonService
    /* JADX INFO: renamed from: l */
    public boolean mo59968l() {
        return C37878b0.f85252a.m85527h(0);
    }

    @Override // com.kubi.spot.api.ISpotCommonService
    /* JADX INFO: renamed from: m */
    public int mo59969m() {
        return SpotRemoteConfig.f49637a.m59947l();
    }

    @Override // com.kubi.spot.api.ISpotCommonService
    /* JADX INFO: renamed from: o */
    public void mo59971o(@NotNull String symbol) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        BSpotApp.Companion.jumpToH5$default(BSpotApp.f49558a, "/land/fee_discount_coupons/" + symbol, null, false, 6, null);
    }

    @Override // com.kubi.spot.api.ISpotCommonService
    /* JADX INFO: renamed from: p */
    public void mo59972p(@NotNull SymbolInfoEntity symbolInfo) {
        Intrinsics.checkNotNullParameter(symbolInfo, "symbolInfo");
        C37340k.f82854a.m83930j(symbolInfo);
    }

    @Override // com.kubi.spot.api.ISpotCommonService
    /* JADX INFO: renamed from: q */
    public boolean mo59973q(@Nullable String str) {
        TradeManager tradeManager = TradeManager.f50593a;
        return tradeManager.m61840o(str) && !tradeManager.m61837h(str);
    }

    @Override // com.kubi.spot.api.ISpotCommonService
    @NotNull
    /* JADX INFO: renamed from: r */
    public BaseFragment mo59974r() {
        return new CallAuctionProcessFragment();
    }

    @Override // com.kubi.spot.api.ISpotCommonService
    /* JADX INFO: renamed from: t */
    public void mo59976t(@NotNull Function0<Unit> onTrue) {
        Intrinsics.checkNotNullParameter(onTrue, "onTrue");
        Object objM56186h = Router.f46192a.m56186h(InterfaceC37174b.class, SiteInfoManager.f47913a.m58109c());
        if (objM56186h != null ? ((InterfaceC37174b) objM56186h).m83141a() : true) {
            onTrue.invoke();
        }
    }

    @Override // com.kubi.spot.api.ISpotCommonService
    @NotNull
    /* JADX INFO: renamed from: u */
    public BaseFragment mo59977u(@NotNull String symbol, int i11) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        return SpotSmallFlutterKlineFragment.f50681e0.newInstance(symbol, i11);
    }

    @Override // com.kubi.spot.api.ISpotCommonService
    @NotNull
    /* JADX INFO: renamed from: v */
    public String mo59978v() {
        return "NOTIFY_MAINTENANCE";
    }

    @Override // com.kubi.spot.api.ISpotCommonService
    @NotNull
    /* JADX INFO: renamed from: w */
    public BaseFragment mo59979w(@Nullable String str, @Nullable String str2, @Nullable String str3) {
        return DelegationHistoryFragment.Companion.newInstance$default(DelegationHistoryFragment.f49999u0, str, str2, str3, false, 8, null);
    }

    @Override // com.kubi.spot.api.ISpotCommonService
    /* JADX INFO: renamed from: y */
    public void mo59980y(@NotNull Function0<Unit> onTrue) {
        Intrinsics.checkNotNullParameter(onTrue, "onTrue");
        Object objM56186h = Router.f46192a.m56186h(InterfaceC37174b.class, SiteInfoManager.f47913a.m58109c());
        if (objM56186h != null ? ((InterfaceC37174b) objM56186h).m83146f() : false) {
            onTrue.invoke();
        }
    }

    @Override // com.kubi.spot.api.ISpotCommonService
    @NotNull
    /* JADX INFO: renamed from: z */
    public DialogFragmentHelper mo59981z() {
        return new CallAuctionProcessContainerDialog();
    }
}
