package com.kubi.quotefacade.service;

import android.net.Uri;
import android.text.SpannableStringBuilder;
import androidx.core.os.BundleKt;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.blankj.utilcode.util.C5267e0;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.data.entity.TradeItemBean;
import com.kubi.kucoin.home.p090v2.cards.ClassMappingV2;
import com.kubi.p110rn.Constants;
import com.kubi.p110rn.api.IReactNativeService;
import com.kubi.p110rn.modules.command.impl.CheckIsFavorCommand;
import com.kubi.p110rn.p111ui.KCBridgeRejecterError;
import com.kubi.p110rn.p111ui.OnDialogDismissedListener;
import com.kubi.quotefacade.HomeMarketFragment;
import com.kubi.quotefacade.HomeMarketRnContainer;
import com.kubi.quotefacade.alert.AlertCreateFragment;
import com.kubi.quotefacade.api.IQuoteFacadeService;
import com.kubi.quotefacade.entity.AlphaItemEntity;
import com.kubi.quotefacade.entity.CurrencyFilterTransferData;
import com.kubi.quotefacade.favorites.QuoteFavoriteFragment;
import com.kubi.quotefacade.feed.FeedFragment;
import com.kubi.quotefacade.helper.C22212u1;
import com.kubi.quotefacade.helper.ChainFavCacheManager;
import com.kubi.quotefacade.helper.FavAlphaCacheManager;
import com.kubi.quotefacade.helper.FavEtfCacheManager;
import com.kubi.quotefacade.helper.FavFutureCacheManager;
import com.kubi.quotefacade.helper.FavSpotCacheManager;
import com.kubi.quotefacade.helper.QuoteConfigHelper;
import com.kubi.quotefacade.helper.QuoteExKt;
import com.kubi.quotefacade.kline.KlineFragment;
import com.kubi.quotefacade.kline.KlineRnDetailRouteHelper;
import com.kubi.quotefacade.repository.QuoteMarketRepository;
import com.kubi.quotefacade.widgets.calendar.C22620l;
import com.kubi.quotefacade.widgets.fear.C22642l;
import com.kubi.quotefacade.widgets.feed.C22645a;
import com.kubi.quotefacade.widgets.gembox.C22669j;
import com.kubi.quotefacade.widgets.rank.C22670a;
import com.kubi.quotefacade.widgets.risefall.C22674a;
import com.kubi.quotefacade.widgets.sectors.C22705a;
import com.kubi.sdk.BaseFragment;
import com.kubi.user.api.IUserService;
import com.kubi.utils.C27099x;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlinx.coroutines.C41696j;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p025av.C4397h;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: QuoteFacadeService.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J,\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\b\u0010\t\u001a\u0004\u0018\u00010\u00072\b\u0010\n\u001a\u0004\u0018\u00010\u0007H\u0016J\b\u0010\u000b\u001a\u00020\fH\u0016J,\u0010\r\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\b\u0010\t\u001a\u0004\u0018\u00010\u00072\b\u0010\n\u001a\u0004\u0018\u00010\u0007H\u0016J\b\u0010\u000e\u001a\u00020\fH\u0016J\b\u0010\u000f\u001a\u00020\fH\u0016JH\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u00072\u001c\u0010\u0019\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0017\u0012\u0006\u0012\u0004\u0018\u00010\u001b\u0012\u0004\u0012\u00020\u00110\u001aH\u0016J\b\u0010\u001c\u001a\u00020\u0005H\u0016J\u0012\u0010\u001d\u001a\u00020\u00112\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016J\u0014\u0010 \u001a\u00020\u00052\n\b\u0001\u0010!\u001a\u0004\u0018\u00010\u0007H\u0016J\u0010\u0010\"\u001a\u00020\u00112\u0006\u0010#\u001a\u00020\u0005H\u0016J\u0010\u0010$\u001a\u00020\u00112\u0006\u0010#\u001a\u00020\u0005H\u0016J\u0010\u0010%\u001a\u00020\u00112\u0006\u0010#\u001a\u00020\u0005H\u0016J\u000e\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00070'H\u0016J\u0016\u0010(\u001a\u00020\u00112\f\u0010)\u001a\b\u0012\u0004\u0012\u00020*0'H\u0016J\u0010\u0010+\u001a\u00020\f2\u0006\u0010,\u001a\u00020*H\u0016J\u0010\u0010-\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u0010\u0010.\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u0007H\u0016J&\u0010/\u001a\u00020\u00112\u0006\u00100\u001a\u00020*2\u0014\u00101\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0011\u0018\u000102H\u0016J&\u00103\u001a\u00020\u00112\u0006\u0010\b\u001a\u00020\u00072\u0014\u00101\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0011\u0018\u000102H\u0016J\u0010\u00104\u001a\u00020\f2\u0006\u00105\u001a\u00020\u0007H\u0016J \u00106\u001a\u00020\u00112\u0006\u00105\u001a\u00020\u00072\u000e\u00107\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010'H\u0016J\b\u00108\u001a\u00020\fH\u0016J&\u00109\u001a\u00020\u00112\u0006\u0010:\u001a\u00020\u00072\u0014\u0010;\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0011\u0018\u000102H\u0016J<\u0010<\u001a\u00020\u00112\u0006\u0010:\u001a\u00020\u00072\u0006\u0010=\u001a\u00020\f2\u0006\u0010>\u001a\u00020\f2\u0014\u0010;\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0011\u0018\u000102H\u0096@¢\u0006\u0002\u0010?J\u0014\u0010@\u001a\b\u0012\u0004\u0012\u00020\u00070'H\u0096@¢\u0006\u0002\u0010AJ\u0010\u0010B\u001a\u00020\f2\u0006\u0010:\u001a\u00020\u0007H\u0016J\u0012\u0010C\u001a\u00020\u00112\b\u0010D\u001a\u0004\u0018\u00010\u0007H\u0016J\u0018\u0010E\u001a\u00020\u00112\u0006\u00100\u001a\u00020*2\u0006\u0010F\u001a\u00020\u0007H\u0016J\b\u0010G\u001a\u00020\fH\u0016J\u0012\u0010H\u001a\u00020I2\b\u0010J\u001a\u0004\u0018\u00010KH\u0016J\b\u0010L\u001a\u00020\fH\u0016J\u0018\u0010M\u001a\u00020\u00052\u0006\u0010N\u001a\u00020\u00072\u0006\u0010O\u001a\u00020\u0007H\u0016J \u0010P\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010O\u001a\u00020\u00072\u0006\u0010Q\u001a\u00020\u0007H\u0016J$\u0010R\u001a\u00020\f2\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010O\u001a\u00020\u00072\b\u0010Q\u001a\u0004\u0018\u00010\u0007H\u0016J\b\u0010S\u001a\u00020\fH\u0016J\b\u0010T\u001a\u00020UH\u0016J\b\u0010V\u001a\u00020UH\u0016J\b\u0010W\u001a\u00020UH\u0016J\b\u0010X\u001a\u00020UH\u0016J\b\u0010Y\u001a\u00020UH\u0016J\b\u0010Z\u001a\u00020UH\u0016J\b\u0010[\u001a\u00020UH\u0016J\b\u0010\\\u001a\u00020UH\u0016J\b\u0010]\u001a\u00020UH\u0016J\b\u0010^\u001a\u00020UH\u0016J\b\u0010_\u001a\u00020UH\u0016¨\u0006`"}, m90084d2 = {"Lcom/kubi/quotefacade/service/QuoteFacadeService;", "Lcom/kubi/quotefacade/api/IQuoteFacadeService;", "<init>", "()V", "getRnCoinInfoFragment", "Lcom/kubi/sdk/BaseFragment;", "sourceType", "", "symbol", TtmlNode.RUBY_BASE, "quote", "rnCoinInfoEnabled", "", "getRnRecommendFragment", "rnRecommendEnabled", "currencyFilterRemoteConfigEnabled", "openSymbolToggleDialog", "", "lifecycleOwner", "Landroidx/lifecycle/LifecycleOwner;", "childFragmentManager", "Landroidx/fragment/app/FragmentManager;", "toggleData", "Lcom/kubi/quotefacade/entity/CurrencyFilterTransferData;", "tag", TUIConstants.TUIChat.CALL_BACK, "Lkotlin/Function2;", "Lcom/kubi/rn/ui/KCBridgeRejecterError;", "getHomeMarketFragment", "showTopMenuGuide", "parentFragment", "Landroidx/fragment/app/Fragment;", "getQuoteFavFragment", "positionType", "removeEmotionView", "marketFragment", "removeCopyTradingRnPage", "removeFeedFlutterFragment", "getFavor", "", "saveNewFavor", "list", "Lcom/kubi/data/entity/TradeItemBean;", "isFavor", "item", "isMexFavor", "isNativeFavor", "changedFavor", "tradeBean", "onAddSuccess", "Lkotlin/Function1;", "changedMexFavor", "chainHasCollected", "tokenAppendChain", "addOrDeleteChain", "deleteTokenList", "quoteMemeConfig", "changeAlphaFavorite", "tokenChain", "onSuccess", "changeAlphaFavoriteLogin", CheckIsFavorCommand.KEY_IS_FAV, "isToast", "(Ljava/lang/String;ZZLkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getFavAlphaList", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isAlphaFavorites", "jumpAlphaKline", "tokenBridgeId", "jumpCreateAlert", "tradeType", "isAlphaEnable", "alphaCoinPrice", "Landroid/text/SpannableStringBuilder;", "currentPriceUsd", "Ljava/math/BigDecimal;", "quoteAiFeedConfig", "getFeedForKlineFragment", FirebaseAnalytics.Param.CURRENCY, "klineType", "getKlineFragment", "leverTradeType", "openRnKlineDetailPage", "isShowKline", "getWidgetOfGembox", "Lcom/kubi/kucoin/home/v2/cards/ClassMappingV2;", "getWidgetOfRiseFall", "getWidgetOfRiseFallFull", "getWidgetOfFearGreed", "getWidgetOfFearGreedFull", "getWidgetOfHotSectors", "getWidgetOfHotSectorsFull", "getWidgetOfRank", "getWidgetOfFeed", "getWidgetOfCalendarDay", "getWidgetOfCalendarWeek", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nQuoteFacadeService.kt\nKotlin\n*S Kotlin\n*F\n+ 1 QuoteFacadeService.kt\ncom/kubi/quotefacade/service/QuoteFacadeService\n+ 2 JsonEx.kt\ncom/kubi/utils/extensions/JsonExKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,314:1\n35#2,3:315\n1563#3:318\n1634#3,3:319\n*S KotlinDebug\n*F\n+ 1 QuoteFacadeService.kt\ncom/kubi/quotefacade/service/QuoteFacadeService\n*L\n124#1:315,3\n247#1:318\n247#1:319,3\n*E\n"})
public final class QuoteFacadeService implements IQuoteFacadeService {
    /* JADX INFO: renamed from: c0 */
    public static final Unit m53018c0(TradeItemBean tradeItemBean, String str) {
        AlertCreateFragment.f41066b0.launchFragment(tradeItemBean, str);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: e0 */
    public static final Unit m53020e0(String str, KCBridgeRejecterError kCBridgeRejecterError) {
        return Unit.INSTANCE;
    }

    @Override // com.kubi.quotefacade.api.IQuoteFacadeService
    /* JADX INFO: renamed from: B */
    public void mo50677B(@NotNull String tokenAppendChain, @Nullable List<String> list) {
        Intrinsics.checkNotNullParameter(tokenAppendChain, "tokenAppendChain");
        ChainFavCacheManager chainFavCacheManager = ChainFavCacheManager.f41922a;
        chainFavCacheManager.m51774h(tokenAppendChain);
        if (list == null || list.isEmpty()) {
            return;
        }
        chainFavCacheManager.m51776j(list);
    }

    @Override // com.kubi.quotefacade.api.IQuoteFacadeService
    /* JADX INFO: renamed from: C */
    public void mo50678C(@NotNull TradeItemBean tradeBean, @Nullable Function1<? super Boolean, Unit> function1) {
        Intrinsics.checkNotNullParameter(tradeBean, "tradeBean");
        if (tradeBean.getSymbolInfoEntity().isEtfSymbol()) {
            FavEtfCacheManager.f41951a.m51892d(tradeBean, function1);
        } else {
            FavSpotCacheManager.f41993a.m51947d(tradeBean, function1);
        }
    }

    @Override // com.kubi.quotefacade.api.IQuoteFacadeService
    @Nullable
    /* JADX INFO: renamed from: E */
    public Object mo50680E(@NotNull String str, boolean z11, boolean z12, @Nullable Function1<? super Boolean, Unit> function1, @NotNull Continuation<? super Unit> continuation) {
        Object objM51820o = FavAlphaCacheManager.f41929a.m51820o(str, z11, z12, function1, continuation);
        return objM51820o == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM51820o : Unit.INSTANCE;
    }

    @Override // com.kubi.quotefacade.api.IQuoteFacadeService
    /* JADX INFO: renamed from: F */
    public boolean mo50681F(@NotNull TradeItemBean item) {
        Intrinsics.checkNotNullParameter(item, "item");
        if (IUserService.a.get().c()) {
            return item.isFavor();
        }
        String symbol = item.getSymbol();
        Intrinsics.checkNotNullExpressionValue(symbol, "getSymbol(...)");
        return mo50716u(symbol);
    }

    @Override // com.kubi.quotefacade.api.IQuoteFacadeService
    /* JADX INFO: renamed from: G */
    public boolean mo50682G(@NotNull String tokenAppendChain) {
        Intrinsics.checkNotNullParameter(tokenAppendChain, "tokenAppendChain");
        return ChainFavCacheManager.f41922a.m51778l(tokenAppendChain);
    }

    @Override // com.kubi.quotefacade.api.IQuoteFacadeService
    /* JADX INFO: renamed from: H */
    public void mo50683H(@NotNull BaseFragment marketFragment) {
        Intrinsics.checkNotNullParameter(marketFragment, "marketFragment");
        if (marketFragment instanceof HomeMarketFragment) {
            ((HomeMarketFragment) marketFragment).m50150V3();
        }
    }

    @Override // com.kubi.quotefacade.api.IQuoteFacadeService
    /* JADX INFO: renamed from: N */
    public void mo50687N(@NotNull String tokenChain, @Nullable Function1<? super Boolean, Unit> function1) {
        Intrinsics.checkNotNullParameter(tokenChain, "tokenChain");
        FavAlphaCacheManager.f41929a.m51818k(tokenChain, function1);
    }

    @Override // com.kubi.quotefacade.api.IQuoteFacadeService
    /* JADX INFO: renamed from: O */
    public void mo50688O(@NotNull BaseFragment marketFragment) {
        Intrinsics.checkNotNullParameter(marketFragment, "marketFragment");
        if (marketFragment instanceof HomeMarketFragment) {
            ((HomeMarketFragment) marketFragment).m50151W3();
        }
    }

    @Override // com.kubi.quotefacade.api.IQuoteFacadeService
    @NotNull
    /* JADX INFO: renamed from: Q */
    public BaseFragment mo50690Q(@NotNull String sourceType, @NotNull String symbol, @Nullable String str, @Nullable String str2) {
        Intrinsics.checkNotNullParameter(sourceType, "sourceType");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        IReactNativeService iReactNativeService = IReactNativeService.INSTANCE.get();
        Pair pair = new Pair(Constants.BIZ, "recommend");
        Pair pair2 = new Pair("entry", "main");
        Pair pair3 = new Pair(Constants.COMPONENT, "kucoin_recommend_rn");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("CoinRecommendation?sourceType=");
        sb2.append(sourceType);
        sb2.append("&symbol=");
        sb2.append(symbol);
        sb2.append("&base=");
        if (str == null) {
            str = "";
        }
        sb2.append(str);
        sb2.append("&quote=");
        if (str2 == null) {
            str2 = "";
        }
        sb2.append(str2);
        return iReactNativeService.getRnRootFragment(BundleKt.bundleOf(pair, pair2, pair3, new Pair("route", Uri.encode(sb2.toString()))));
    }

    @Override // com.kubi.quotefacade.api.IQuoteFacadeService
    /* JADX INFO: renamed from: R */
    public boolean mo50691R() {
        return QuoteConfigHelper.f41987a.m51939s();
    }

    @Override // com.kubi.quotefacade.api.IQuoteFacadeService
    /* JADX INFO: renamed from: S */
    public void mo50692S(@NotNull final TradeItemBean tradeBean, @NotNull final String tradeType) {
        Intrinsics.checkNotNullParameter(tradeBean, "tradeBean");
        Intrinsics.checkNotNullParameter(tradeType, "tradeType");
        IUserService.E0(IUserService.a.get(), (Map) null, new Function0() { // from class: com.kubi.quotefacade.service.d
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return QuoteFacadeService.m53018c0(tradeBean, tradeType);
            }
        }, 1, (Object) null);
    }

    @Override // com.kubi.quotefacade.api.IQuoteFacadeService
    @NotNull
    /* JADX INFO: renamed from: W */
    public BaseFragment mo50695W(@NotNull String sourceType, @NotNull String symbol, @Nullable String str, @Nullable String str2) {
        Intrinsics.checkNotNullParameter(sourceType, "sourceType");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        IReactNativeService iReactNativeService = IReactNativeService.INSTANCE.get();
        Pair pair = new Pair(Constants.BIZ, "coininfo");
        Pair pair2 = new Pair("entry", "main");
        Pair pair3 = new Pair(Constants.COMPONENT, "krn_coininfo");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Home?sourceType=");
        sb2.append(sourceType);
        sb2.append("&symbol=");
        sb2.append(symbol);
        sb2.append("&base=");
        if (str == null) {
            str = "";
        }
        sb2.append(str);
        sb2.append("&quote=");
        if (str2 == null) {
            str2 = "";
        }
        sb2.append(str2);
        return iReactNativeService.getRnRootFragment(BundleKt.bundleOf(pair, pair2, pair3, new Pair("route", Uri.encode(sb2.toString()))));
    }

    @Override // com.kubi.quotefacade.api.IQuoteFacadeService
    /* JADX INFO: renamed from: X */
    public boolean mo50696X() {
        return QuoteConfigHelper.f41987a.m51922b();
    }

    @Override // com.kubi.quotefacade.api.IQuoteFacadeService
    /* JADX INFO: renamed from: Y */
    public boolean mo50697Y(@NotNull String tokenChain) {
        Intrinsics.checkNotNullParameter(tokenChain, "tokenChain");
        return FavAlphaCacheManager.f41929a.m51826w(tokenChain);
    }

    @Override // com.kubi.quotefacade.api.IQuoteFacadeService
    /* JADX INFO: renamed from: b */
    public boolean mo50699b(@Nullable String str, @NotNull String klineType, @Nullable String str2) {
        Intrinsics.checkNotNullParameter(klineType, "klineType");
        return KlineRnDetailRouteHelper.f42151a.m52188e(str, klineType, str2);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.kubi.quotefacade.api.IQuoteFacadeService
    @Nullable
    /* JADX INFO: renamed from: e */
    public Object mo50702e(@NotNull Continuation<? super List<String>> continuation) {
        QuoteFacadeService$getFavAlphaList$1 quoteFacadeService$getFavAlphaList$1;
        if (continuation instanceof QuoteFacadeService$getFavAlphaList$1) {
            quoteFacadeService$getFavAlphaList$1 = (QuoteFacadeService$getFavAlphaList$1) continuation;
            int i11 = quoteFacadeService$getFavAlphaList$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                quoteFacadeService$getFavAlphaList$1.label = i11 - Integer.MIN_VALUE;
            } else {
                quoteFacadeService$getFavAlphaList$1 = new QuoteFacadeService$getFavAlphaList$1(this, continuation);
            }
        } else {
            quoteFacadeService$getFavAlphaList$1 = new QuoteFacadeService$getFavAlphaList$1(this, continuation);
        }
        Object objM52969D = quoteFacadeService$getFavAlphaList$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = quoteFacadeService$getFavAlphaList$1.label;
        try {
            if (i12 == 0) {
                ResultKt.throwOnFailure(objM52969D);
                QuoteMarketRepository quoteMarketRepository = new QuoteMarketRepository();
                quoteFacadeService$getFavAlphaList$1.label = 1;
                objM52969D = quoteMarketRepository.m52969D("Alpha", quoteFacadeService$getFavAlphaList$1);
                if (objM52969D == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objM52969D);
            }
            Iterable<AlphaItemEntity> iterable = (Iterable) objM52969D;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
            for (AlphaItemEntity alphaItemEntity : iterable) {
                arrayList.add(alphaItemEntity.getToken() + '-' + alphaItemEntity.getExternalChain());
            }
            return arrayList;
        } catch (Exception unused) {
            return CollectionsKt.emptyList();
        }
    }

    @Override // com.kubi.quotefacade.api.IQuoteFacadeService
    @NotNull
    /* JADX INFO: renamed from: f */
    public BaseFragment mo50703f(@NotNull String currency, @NotNull String klineType) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(klineType, "klineType");
        return FeedFragment.f41910W.instanceForKline(currency, klineType);
    }

    @Override // com.kubi.quotefacade.api.IQuoteFacadeService
    /* JADX INFO: renamed from: g */
    public void mo50704g(@NotNull List<? extends TradeItemBean> list) {
        Intrinsics.checkNotNullParameter(list, "list");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (TradeItemBean tradeItemBean : list) {
            if (tradeItemBean.getSymbolInfoEntity().isEtfSymbol()) {
                String symbol = tradeItemBean.getSymbol();
                Intrinsics.checkNotNullExpressionValue(symbol, "getSymbol(...)");
                arrayList2.add(symbol);
            } else {
                String symbol2 = tradeItemBean.getSymbol();
                Intrinsics.checkNotNullExpressionValue(symbol2, "getSymbol(...)");
                arrayList.add(symbol2);
            }
        }
        FavSpotCacheManager.f41993a.m51954o(arrayList);
        FavEtfCacheManager.f41951a.m51899o(arrayList2);
    }

    @Override // com.kubi.quotefacade.api.IQuoteFacadeService
    /* JADX INFO: renamed from: h */
    public void mo50705h(@NotNull String symbol, @Nullable Function1<? super Boolean, Unit> function1) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        FavFutureCacheManager.f41975a.m51907d(symbol, function1);
    }

    @Override // com.kubi.quotefacade.api.IQuoteFacadeService
    /* JADX INFO: renamed from: i */
    public boolean mo50706i() {
        return QuoteConfigHelper.f41987a.m51921a();
    }

    @Override // com.kubi.quotefacade.api.IQuoteFacadeService
    @NotNull
    /* JADX INFO: renamed from: j */
    public List<String> mo50707j() {
        return CollectionsKt.plus((Collection) FavSpotCacheManager.f41993a.m51949i(), (Iterable) FavEtfCacheManager.f41951a.m51893h());
    }

    @Override // com.kubi.quotefacade.api.IQuoteFacadeService
    /* JADX INFO: renamed from: m */
    public void mo50710m(@NotNull BaseFragment marketFragment) {
        Intrinsics.checkNotNullParameter(marketFragment, "marketFragment");
        if (marketFragment instanceof HomeMarketFragment) {
            ((HomeMarketFragment) marketFragment).m50152Y3();
        }
    }

    @Override // com.kubi.quotefacade.api.IQuoteFacadeService
    /* JADX INFO: renamed from: o */
    public boolean mo50712o() {
        return QuoteConfigHelper.f41987a.m51937q();
    }

    @Override // com.kubi.quotefacade.api.IQuoteFacadeService
    @NotNull
    /* JADX INFO: renamed from: p */
    public BaseFragment mo50713p(@NotNull String symbol, @NotNull String klineType, @NotNull String leverTradeType) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(klineType, "klineType");
        Intrinsics.checkNotNullParameter(leverTradeType, "leverTradeType");
        return KlineFragment.f42138V.newInstance(symbol, klineType, leverTradeType);
    }

    @Override // com.kubi.quotefacade.api.IQuoteFacadeService
    /* JADX INFO: renamed from: q */
    public void mo50714q(@NotNull final LifecycleOwner lifecycleOwner, @NotNull FragmentManager childFragmentManager, @NotNull CurrencyFilterTransferData toggleData, @Nullable String str, @NotNull final Function2<? super CurrencyFilterTransferData, ? super KCBridgeRejecterError, Unit> callback) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        Intrinsics.checkNotNullParameter(childFragmentManager, "childFragmentManager");
        Intrinsics.checkNotNullParameter(toggleData, "toggleData");
        Intrinsics.checkNotNullParameter(callback, "callback");
        int iM6182d = (int) (C5267e0.m6182d() * 0.8f);
        IReactNativeService iReactNativeService = IReactNativeService.INSTANCE.get();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("krn/router?biz=markets&entry=main&component=kucoin_markets_rn&view_height=");
        sb2.append(iM6182d);
        sb2.append("&route=");
        StringBuilder sb3 = new StringBuilder();
        sb3.append("NewMarketsPage?params=");
        String strM66919i = C27099x.m66919i(toggleData, false, 2, null);
        if (strM66919i == null) {
            strM66919i = "";
        }
        sb3.append(strM66919i);
        sb2.append(Uri.encode(sb3.toString()));
        iReactNativeService.openRnDialog(sb2.toString(), new OnDialogDismissedListener() { // from class: com.kubi.quotefacade.service.b
            @Override // com.kubi.p110rn.p111ui.OnDialogDismissedListener
            public final void onClose(String str2) {
                QuoteFacadeService.m53019d0(lifecycleOwner, callback, str2);
            }
        }, new Function2() { // from class: com.kubi.quotefacade.service.c
            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return QuoteFacadeService.m53020e0((String) obj, (KCBridgeRejecterError) obj2);
            }
        }).show(childFragmentManager, str);
    }

    @Override // com.kubi.quotefacade.api.IQuoteFacadeService
    /* JADX INFO: renamed from: s */
    public boolean mo50715s(@NotNull String symbol) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        return FavFutureCacheManager.f41975a.m51911k(symbol);
    }

    @Override // com.kubi.quotefacade.api.IQuoteFacadeService
    /* JADX INFO: renamed from: u */
    public boolean mo50716u(@NotNull String symbol) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        return FavSpotCacheManager.f41993a.m51952l(symbol) || FavEtfCacheManager.f41951a.m51897l(symbol);
    }

    @Override // com.kubi.quotefacade.api.IQuoteFacadeService
    @NotNull
    /* JADX INFO: renamed from: y */
    public BaseFragment mo50720y(@Nullable String str) {
        return QuoteFavoriteFragment.f41688f0.newInstance(str);
    }

    /* JADX INFO: renamed from: d0 */
    public static final void m53019d0(LifecycleOwner lifecycleOwner, Function2 function2, String str) {
        C41696j.m91104d(LifecycleOwnerKt.getLifecycleScope(lifecycleOwner), null, null, new QuoteFacadeService$openSymbolToggleDialog$1$1(function2, str, null), 3, null);
    }

    @Override // com.kubi.quotefacade.api.IQuoteFacadeService
    @NotNull
    /* JADX INFO: renamed from: A */
    public ClassMappingV2 mo50676A() {
        return C22674a.m53651b();
    }

    @Override // com.kubi.quotefacade.api.IQuoteFacadeService
    @NotNull
    /* JADX INFO: renamed from: D */
    public ClassMappingV2 mo50679D() {
        return C22670a.m53582a();
    }

    @Override // com.kubi.quotefacade.api.IQuoteFacadeService
    @NotNull
    /* JADX INFO: renamed from: K */
    public ClassMappingV2 mo50684K() {
        return C22705a.m53711b();
    }

    @Override // com.kubi.quotefacade.api.IQuoteFacadeService
    @NotNull
    /* JADX INFO: renamed from: L */
    public ClassMappingV2 mo50685L() {
        return C22642l.m53480b();
    }

    @Override // com.kubi.quotefacade.api.IQuoteFacadeService
    @NotNull
    /* JADX INFO: renamed from: P */
    public ClassMappingV2 mo50689P() {
        return C22620l.m53428a();
    }

    @Override // com.kubi.quotefacade.api.IQuoteFacadeService
    @NotNull
    /* JADX INFO: renamed from: T */
    public SpannableStringBuilder mo50693T(@Nullable BigDecimal bigDecimal) {
        return C22212u1.m52119a(bigDecimal);
    }

    @Override // com.kubi.quotefacade.api.IQuoteFacadeService
    @NotNull
    /* JADX INFO: renamed from: U */
    public ClassMappingV2 mo50694U() {
        return C22645a.m53551c();
    }

    @Override // com.kubi.quotefacade.api.IQuoteFacadeService
    /* JADX INFO: renamed from: a */
    public boolean mo50698a() {
        return C4397h.m4026g();
    }

    @Override // com.kubi.quotefacade.api.IQuoteFacadeService
    @NotNull
    /* JADX INFO: renamed from: c */
    public BaseFragment mo50700c() {
        if (C4397h.m4029j()) {
            return HomeMarketRnContainer.f40953Y.newInstance();
        }
        return HomeMarketFragment.f40941c0.newInstance();
    }

    @Override // com.kubi.quotefacade.api.IQuoteFacadeService
    @NotNull
    /* JADX INFO: renamed from: d */
    public ClassMappingV2 mo50701d() {
        return C22620l.m53429b();
    }

    @Override // com.kubi.quotefacade.api.IQuoteFacadeService
    /* JADX INFO: renamed from: k */
    public boolean mo50708k() {
        return C4397h.m4027h();
    }

    @Override // com.kubi.quotefacade.api.IQuoteFacadeService
    /* JADX INFO: renamed from: l */
    public void mo50709l(@Nullable String str) {
        QuoteExKt.m51866q(str);
    }

    @Override // com.kubi.quotefacade.api.IQuoteFacadeService
    @NotNull
    /* JADX INFO: renamed from: n */
    public ClassMappingV2 mo50711n() {
        return C22642l.m53479a();
    }

    @Override // com.kubi.quotefacade.api.IQuoteFacadeService
    @NotNull
    /* JADX INFO: renamed from: v */
    public ClassMappingV2 mo50717v() {
        return C22674a.m53650a();
    }

    @Override // com.kubi.quotefacade.api.IQuoteFacadeService
    /* JADX INFO: renamed from: w */
    public boolean mo50718w() {
        return C4397h.m4028i();
    }

    @Override // com.kubi.quotefacade.api.IQuoteFacadeService
    @NotNull
    /* JADX INFO: renamed from: x */
    public ClassMappingV2 mo50719x() {
        return C22705a.m53710a();
    }

    @Override // com.kubi.quotefacade.api.IQuoteFacadeService
    @NotNull
    /* JADX INFO: renamed from: z */
    public ClassMappingV2 mo50721z() {
        return C22669j.m53581a();
    }
}
