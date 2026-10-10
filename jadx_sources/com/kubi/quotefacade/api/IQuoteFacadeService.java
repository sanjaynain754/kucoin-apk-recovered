package com.kubi.quotefacade.api;

import android.text.SpannableStringBuilder;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwner;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.messaging.Constants;
import com.kubi.data.entity.TradeItemBean;
import com.kubi.kucoin.home.p090v2.cards.ClassMappingV2;
import com.kubi.p110rn.modules.command.impl.CheckIsFavorCommand;
import com.kubi.p110rn.p111ui.KCBridgeRejecterError;
import com.kubi.quotefacade.entity.CurrencyFilterTransferData;
import com.kubi.router.core.Router;
import com.kubi.sdk.BaseFragment;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.math.BigDecimal;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p705vx.InterfaceC45661b;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: IQuoteFacadeService.kt */
/* JADX INFO: loaded from: classes12.dex */
@InterfaceC45661b
@Metadata(m90083d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\f\bg\u0018\u0000 b2\u00020\u0001:\u0001bJ0\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005H&J\b\u0010\t\u001a\u00020\nH&J0\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005H&J\b\u0010\f\u001a\u00020\nH&J\b\u0010\r\u001a\u00020\nH&Jh\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00052:\u0010\u0017\u001a6\u0012\u0015\u0012\u0013\u0018\u00010\u0015¢\u0006\f\b\u0019\u0012\b\b\u001a\u0012\u0004\b\b(\u001b\u0012\u0015\u0012\u0013\u0018\u00010\u001c¢\u0006\f\b\u0019\u0012\b\b\u001a\u0012\u0004\b\b(\u001d\u0012\u0004\u0012\u00020\u000f0\u0018H&J\b\u0010\u001e\u001a\u00020\u0003H&J\u0012\u0010\u001f\u001a\u00020\u000f2\b\u0010 \u001a\u0004\u0018\u00010!H&J\u0012\u0010\"\u001a\u00020\u00032\b\u0010#\u001a\u0004\u0018\u00010\u0005H&J\u0010\u0010$\u001a\u00020\u000f2\u0006\u0010%\u001a\u00020\u0003H&J\u0010\u0010&\u001a\u00020\u000f2\u0006\u0010%\u001a\u00020\u0003H&J\u0010\u0010'\u001a\u00020\u000f2\u0006\u0010%\u001a\u00020\u0003H&J\u000e\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00050)H&J\u0016\u0010*\u001a\u00020\u000f2\f\u0010+\u001a\b\u0012\u0004\u0012\u00020,0)H&J\u0010\u0010-\u001a\u00020\n2\u0006\u0010.\u001a\u00020,H&J\u0010\u0010/\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u0005H&J(\u00100\u001a\u00020\u000f2\u0006\u00101\u001a\u00020,2\u0016\b\u0002\u00102\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000f\u0018\u000103H&J\u0010\u00104\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u0005H&J(\u00105\u001a\u00020\u000f2\u0006\u0010\u0006\u001a\u00020\u00052\u0016\b\u0002\u00102\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000f\u0018\u000103H&J\u0010\u00106\u001a\u00020\n2\u0006\u00107\u001a\u00020\u0005H&J\"\u00108\u001a\u00020\u000f2\u0006\u00107\u001a\u00020\u00052\u0010\b\u0002\u00109\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010)H&J\b\u0010:\u001a\u00020\nH&J(\u0010;\u001a\u00020\u000f2\u0006\u0010<\u001a\u00020\u00052\u0016\b\u0002\u0010=\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000f\u0018\u000103H&J@\u0010>\u001a\u00020\u000f2\u0006\u0010<\u001a\u00020\u00052\u0006\u0010?\u001a\u00020\n2\b\b\u0002\u0010@\u001a\u00020\n2\u0016\b\u0002\u0010=\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000f\u0018\u000103H¦@¢\u0006\u0002\u0010AJ\u0014\u0010B\u001a\b\u0012\u0004\u0012\u00020\u00050)H¦@¢\u0006\u0002\u0010CJ\u0010\u0010D\u001a\u00020\n2\u0006\u0010<\u001a\u00020\u0005H&J\u0012\u0010E\u001a\u00020\u000f2\b\u0010F\u001a\u0004\u0018\u00010\u0005H&J\u0010\u0010G\u001a\u00020\u000f2\u0006\u00101\u001a\u00020,H\u0016J\u0018\u0010G\u001a\u00020\u000f2\u0006\u00101\u001a\u00020,2\u0006\u0010H\u001a\u00020\u0005H&J\b\u0010I\u001a\u00020\nH&J\b\u0010J\u001a\u00020\nH&J\u0012\u0010K\u001a\u00020L2\b\u0010M\u001a\u0004\u0018\u00010NH&J\u0018\u0010O\u001a\u00020\u00032\u0006\u0010P\u001a\u00020\u00052\u0006\u0010Q\u001a\u00020\u0005H&J\"\u0010R\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010Q\u001a\u00020\u00052\b\b\u0002\u0010S\u001a\u00020\u0005H&J&\u0010T\u001a\u00020\n2\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010Q\u001a\u00020\u00052\n\b\u0002\u0010S\u001a\u0004\u0018\u00010\u0005H&J\b\u0010U\u001a\u00020\nH&J\b\u0010V\u001a\u00020WH&J\b\u0010X\u001a\u00020WH&J\b\u0010Y\u001a\u00020WH&J\b\u0010Z\u001a\u00020WH&J\b\u0010[\u001a\u00020WH&J\b\u0010\\\u001a\u00020WH&J\b\u0010]\u001a\u00020WH&J\b\u0010^\u001a\u00020WH&J\b\u0010_\u001a\u00020WH&J\b\u0010`\u001a\u00020WH&J\b\u0010a\u001a\u00020WH&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006cÀ\u0006\u0001"}, m90084d2 = {"Lcom/kubi/quotefacade/api/IQuoteFacadeService;", "", "getRnCoinInfoFragment", "Lcom/kubi/sdk/BaseFragment;", "sourceType", "", "symbol", TtmlNode.RUBY_BASE, "quote", "rnCoinInfoEnabled", "", "getRnRecommendFragment", "rnRecommendEnabled", "currencyFilterRemoteConfigEnabled", "openSymbolToggleDialog", "", "lifecycleOwner", "Landroidx/lifecycle/LifecycleOwner;", "childFragmentManager", "Landroidx/fragment/app/FragmentManager;", "toggleData", "Lcom/kubi/quotefacade/entity/CurrencyFilterTransferData;", "tag", TUIConstants.TUIChat.CALL_BACK, "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "data", "Lcom/kubi/rn/ui/KCBridgeRejecterError;", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "getHomeMarketFragment", "showTopMenuGuide", "parentFragment", "Landroidx/fragment/app/Fragment;", "getQuoteFavFragment", "positionType", "removeEmotionView", "marketFragment", "removeCopyTradingRnPage", "removeFeedFlutterFragment", "getFavor", "", "saveNewFavor", "list", "Lcom/kubi/data/entity/TradeItemBean;", "isFavor", "item", "isNativeFavor", "changedFavor", "tradeBean", "onAddSuccess", "Lkotlin/Function1;", "isMexFavor", "changedMexFavor", "chainHasCollected", "tokenAppendChain", "addOrDeleteChain", "deleteTokenList", "quoteMemeConfig", "changeAlphaFavorite", "tokenChain", "onSuccess", "changeAlphaFavoriteLogin", CheckIsFavorCommand.KEY_IS_FAV, "isToast", "(Ljava/lang/String;ZZLkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getFavAlphaList", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isAlphaFavorites", "jumpAlphaKline", "tokenBridgeId", "jumpCreateAlert", "tradeType", "quoteAiFeedConfig", "isAlphaEnable", "alphaCoinPrice", "Landroid/text/SpannableStringBuilder;", "currentPriceUsd", "Ljava/math/BigDecimal;", "getFeedForKlineFragment", FirebaseAnalytics.Param.CURRENCY, "klineType", "getKlineFragment", "leverTradeType", "openRnKlineDetailPage", "isShowKline", "getWidgetOfGembox", "Lcom/kubi/kucoin/home/v2/cards/ClassMappingV2;", "getWidgetOfRiseFall", "getWidgetOfRiseFallFull", "getWidgetOfFearGreed", "getWidgetOfFearGreedFull", "getWidgetOfHotSectors", "getWidgetOfHotSectorsFull", "getWidgetOfRank", "getWidgetOfFeed", "getWidgetOfCalendarDay", "getWidgetOfCalendarWeek", "Companion", "QuoteFacadeApi_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface IQuoteFacadeService {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final Companion f41383a = Companion.f41384a;

    /* JADX INFO: compiled from: IQuoteFacadeService.kt */
    @Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\t"}, m90084d2 = {"Lcom/kubi/quotefacade/api/IQuoteFacadeService$Companion;", "", "<init>", "()V", "TRADE_TYPE_SPOT", "", "TRADE_TYPE_FUTURES", "get", "Lcom/kubi/quotefacade/api/IQuoteFacadeService;", "QuoteFacadeApi_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {

        @NotNull
        public static final String TRADE_TYPE_FUTURES = "Futures";

        @NotNull
        public static final String TRADE_TYPE_SPOT = "Spot";

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ Companion f41384a = new Companion();

        @NotNull
        public final IQuoteFacadeService get() {
            return (IQuoteFacadeService) Router.f46192a.m56192n(IQuoteFacadeService.class);
        }
    }

    @NotNull
    /* JADX INFO: renamed from: A */
    ClassMappingV2 mo50676A();

    /* JADX INFO: renamed from: B */
    void mo50677B(@NotNull String str, @Nullable List<String> list);

    /* JADX INFO: renamed from: C */
    void mo50678C(@NotNull TradeItemBean tradeItemBean, @Nullable Function1<? super Boolean, Unit> function1);

    @NotNull
    /* JADX INFO: renamed from: D */
    ClassMappingV2 mo50679D();

    @Nullable
    /* JADX INFO: renamed from: E */
    Object mo50680E(@NotNull String str, boolean z11, boolean z12, @Nullable Function1<? super Boolean, Unit> function1, @NotNull Continuation<? super Unit> continuation);

    /* JADX INFO: renamed from: F */
    boolean mo50681F(@NotNull TradeItemBean tradeItemBean);

    /* JADX INFO: renamed from: G */
    boolean mo50682G(@NotNull String str);

    /* JADX INFO: renamed from: H */
    void mo50683H(@NotNull BaseFragment baseFragment);

    @NotNull
    /* JADX INFO: renamed from: K */
    ClassMappingV2 mo50684K();

    @NotNull
    /* JADX INFO: renamed from: L */
    ClassMappingV2 mo50685L();

    /* JADX INFO: renamed from: N */
    void mo50687N(@NotNull String str, @Nullable Function1<? super Boolean, Unit> function1);

    /* JADX INFO: renamed from: O */
    void mo50688O(@NotNull BaseFragment baseFragment);

    @NotNull
    /* JADX INFO: renamed from: P */
    ClassMappingV2 mo50689P();

    @NotNull
    /* JADX INFO: renamed from: Q */
    BaseFragment mo50690Q(@NotNull String str, @NotNull String str2, @Nullable String str3, @Nullable String str4);

    /* JADX INFO: renamed from: R */
    boolean mo50691R();

    /* JADX INFO: renamed from: S */
    void mo50692S(@NotNull TradeItemBean tradeItemBean, @NotNull String str);

    @NotNull
    /* JADX INFO: renamed from: T */
    SpannableStringBuilder mo50693T(@Nullable BigDecimal bigDecimal);

    @NotNull
    /* JADX INFO: renamed from: U */
    ClassMappingV2 mo50694U();

    @NotNull
    /* JADX INFO: renamed from: W */
    BaseFragment mo50695W(@NotNull String str, @NotNull String str2, @Nullable String str3, @Nullable String str4);

    /* JADX INFO: renamed from: X */
    boolean mo50696X();

    /* JADX INFO: renamed from: Y */
    boolean mo50697Y(@NotNull String str);

    /* JADX INFO: renamed from: a */
    boolean mo50698a();

    /* JADX INFO: renamed from: b */
    boolean mo50699b(@Nullable String str, @NotNull String str2, @Nullable String str3);

    @NotNull
    /* JADX INFO: renamed from: c */
    BaseFragment mo50700c();

    @NotNull
    /* JADX INFO: renamed from: d */
    ClassMappingV2 mo50701d();

    @Nullable
    /* JADX INFO: renamed from: e */
    Object mo50702e(@NotNull Continuation<? super List<String>> continuation);

    @NotNull
    /* JADX INFO: renamed from: f */
    BaseFragment mo50703f(@NotNull String str, @NotNull String str2);

    /* JADX INFO: renamed from: g */
    void mo50704g(@NotNull List<? extends TradeItemBean> list);

    /* JADX INFO: renamed from: h */
    void mo50705h(@NotNull String str, @Nullable Function1<? super Boolean, Unit> function1);

    /* JADX INFO: renamed from: i */
    boolean mo50706i();

    @NotNull
    /* JADX INFO: renamed from: j */
    List<String> mo50707j();

    /* JADX INFO: renamed from: k */
    boolean mo50708k();

    /* JADX INFO: renamed from: l */
    void mo50709l(@Nullable String str);

    /* JADX INFO: renamed from: m */
    void mo50710m(@NotNull BaseFragment baseFragment);

    @NotNull
    /* JADX INFO: renamed from: n */
    ClassMappingV2 mo50711n();

    /* JADX INFO: renamed from: o */
    boolean mo50712o();

    @NotNull
    /* JADX INFO: renamed from: p */
    BaseFragment mo50713p(@NotNull String str, @NotNull String str2, @NotNull String str3);

    /* JADX INFO: renamed from: q */
    void mo50714q(@NotNull LifecycleOwner lifecycleOwner, @NotNull FragmentManager fragmentManager, @NotNull CurrencyFilterTransferData currencyFilterTransferData, @Nullable String str, @NotNull Function2<? super CurrencyFilterTransferData, ? super KCBridgeRejecterError, Unit> function2);

    /* JADX INFO: renamed from: s */
    boolean mo50715s(@NotNull String str);

    /* JADX INFO: renamed from: u */
    boolean mo50716u(@NotNull String str);

    @NotNull
    /* JADX INFO: renamed from: v */
    ClassMappingV2 mo50717v();

    /* JADX INFO: renamed from: w */
    boolean mo50718w();

    @NotNull
    /* JADX INFO: renamed from: x */
    ClassMappingV2 mo50719x();

    @NotNull
    /* JADX INFO: renamed from: y */
    BaseFragment mo50720y(@Nullable String str);

    @NotNull
    /* JADX INFO: renamed from: z */
    ClassMappingV2 mo50721z();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: I */
    static /* synthetic */ void m50671I(IQuoteFacadeService iQuoteFacadeService, String str, Function1 function1, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: changeAlphaFavorite");
        }
        if ((i11 & 2) != 0) {
            function1 = null;
        }
        iQuoteFacadeService.mo50687N(str, function1);
    }

    /* JADX INFO: renamed from: J */
    static /* synthetic */ BaseFragment m50672J(IQuoteFacadeService iQuoteFacadeService, String str, String str2, String str3, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getKlineFragment");
        }
        if ((i11 & 4) != 0) {
            str3 = "";
        }
        return iQuoteFacadeService.mo50713p(str, str2, str3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: V */
    static /* synthetic */ Object m50673V(IQuoteFacadeService iQuoteFacadeService, String str, boolean z11, boolean z12, Function1 function1, Continuation continuation, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: changeAlphaFavoriteLogin");
        }
        if ((i11 & 4) != 0) {
            z12 = true;
        }
        boolean z13 = z12;
        if ((i11 & 8) != 0) {
            function1 = null;
        }
        return iQuoteFacadeService.mo50680E(str, z11, z13, function1, continuation);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: r */
    static /* synthetic */ void m50674r(IQuoteFacadeService iQuoteFacadeService, String str, List list, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addOrDeleteChain");
        }
        if ((i11 & 2) != 0) {
            list = CollectionsKt.emptyList();
        }
        iQuoteFacadeService.mo50677B(str, list);
    }

    /* JADX INFO: renamed from: t */
    static /* synthetic */ boolean m50675t(IQuoteFacadeService iQuoteFacadeService, String str, String str2, String str3, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: openRnKlineDetailPage");
        }
        if ((i11 & 4) != 0) {
            str3 = null;
        }
        return iQuoteFacadeService.mo50699b(str, str2, str3);
    }

    /* JADX INFO: renamed from: M */
    default void m50686M(@NotNull TradeItemBean tradeBean) {
        Intrinsics.checkNotNullParameter(tradeBean, "tradeBean");
        mo50692S(tradeBean, Companion.TRADE_TYPE_SPOT);
    }
}
