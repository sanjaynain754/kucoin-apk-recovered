package com.kubi.margin.market.recommend;

import android.view.View;
import android.widget.RadioButton;
import com.kubi.margin.market.info.MarketCoinInfo;
import com.kubi.margin.market.info.MarketCoinInfoQuest;
import com.kubi.margin.market.info.MarketCoinInfoRecommend;
import com.kubi.otc.api.IOtcService;
import com.kubi.sdk.BaseFragment;
import com.kubi.sdk.site.C24129b;
import com.kubi.sdk.site.SiteVisibleConfigKey;
import com.kubi.utils.extensions.core.ViewExtKt;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.InterfaceC41709m0;
import mp.C42579a;
import p206dp.C36904b0;
import p402kf.C41016c;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.comparisons.ComparisonsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: MarginMarketRecommendFragment.kt */
/* JADX INFO: loaded from: classes27.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.margin.market.recommend.MarginMarketRecommendFragment$initListener$1$1$1", m90122f = "MarginMarketRecommendFragment.kt", m90123i = {}, m90124l = {202}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
@SourceDebugExtension({"SMAP\nMarginMarketRecommendFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MarginMarketRecommendFragment.kt\ncom/kubi/margin/market/recommend/MarginMarketRecommendFragment$initListener$1$1$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,323:1\n1068#2:324\n1869#2,2:325\n*S KotlinDebug\n*F\n+ 1 MarginMarketRecommendFragment.kt\ncom/kubi/margin/market/recommend/MarginMarketRecommendFragment$initListener$1$1$1\n*L\n155#1:324\n157#1:325,2\n*E\n"})
public final class MarginMarketRecommendFragment$initListener$1$1$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ C36904b0 $bmarginFragmentMarketRecommendBinding;
    final /* synthetic */ MarketCoinInfo $it;
    int label;
    final /* synthetic */ MarginMarketRecommendFragment this$0;

    /* JADX INFO: renamed from: com.kubi.margin.market.recommend.MarginMarketRecommendFragment$initListener$1$1$1$a */
    /* JADX INFO: compiled from: Comparisons.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareByDescending$1\n+ 2 MarginMarketRecommendFragment.kt\ncom/kubi/margin/market/recommend/MarginMarketRecommendFragment$initListener$1$1$1\n*L\n1#1,328:1\n156#2:329\n*E\n"})
    public static final class C17954a<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t11, T t12) {
            MarketCoinInfoQuest marketCoinInfoQuest = (MarketCoinInfoQuest) t12;
            MarketCoinInfoQuest marketCoinInfoQuest2 = (MarketCoinInfoQuest) t11;
            return ComparisonsKt.compareValues(marketCoinInfoQuest != null ? marketCoinInfoQuest.getStartTime() : null, marketCoinInfoQuest2 != null ? marketCoinInfoQuest2.getStartTime() : null);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarginMarketRecommendFragment$initListener$1$1$1(MarketCoinInfo marketCoinInfo, C36904b0 c36904b0, MarginMarketRecommendFragment marginMarketRecommendFragment, Continuation<? super MarginMarketRecommendFragment$initListener$1$1$1> continuation) {
        super(2, continuation);
        this.$it = marketCoinInfo;
        this.$bmarginFragmentMarketRecommendBinding = c36904b0;
        this.this$0 = marginMarketRecommendFragment;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MarginMarketRecommendFragment$initListener$1$1$1(this.$it, this.$bmarginFragmentMarketRecommendBinding, this.this$0, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((MarginMarketRecommendFragment$initListener$1$1$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:74:0x0219  */
    /* JADX WARN: Code duplicated, block: B:75:0x0224  */
    /* JADX WARN: Code duplicated, block: B:77:0x0231  */
    /* JADX WARN: Code duplicated, block: B:78:0x0237  */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objMo43954a;
        List<MarketCoinInfoQuest> questInfos;
        List listSortedWith;
        MarginMarketRecommendAdapter marginMarketRecommendAdapter;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        MarginMarketRecommendAdapter marginMarketRecommendAdapter2 = null;
        if (i11 == 0) {
            ResultKt.throwOnFailure(obj);
            MarketCoinInfoRecommend currencyReferenceRecommend = this.$it.getCurrencyReferenceRecommend();
            List<MarketCoinInfoQuest> questInfos2 = currencyReferenceRecommend != null ? currencyReferenceRecommend.getQuestInfos() : null;
            if (questInfos2 == null || questInfos2.isEmpty()) {
                RadioButton rbActivity = this.$bmarginFragmentMarketRecommendBinding.f81591c;
                Intrinsics.checkNotNullExpressionValue(rbActivity, "rbActivity");
                ViewExtKt.m66577h(rbActivity);
            } else {
                MarketCoinInfoRecommend currencyReferenceRecommend2 = this.$it.getCurrencyReferenceRecommend();
                if (currencyReferenceRecommend2 != null && (questInfos = currencyReferenceRecommend2.getQuestInfos()) != null && (listSortedWith = CollectionsKt.sortedWith(questInfos, new C17954a())) != null) {
                    MarginMarketRecommendFragment marginMarketRecommendFragment = this.this$0;
                    Iterator it = listSortedWith.iterator();
                    while (it.hasNext()) {
                        marginMarketRecommendFragment.f33416X.add(new MarginMarketRecommendEntity(0, (MarketCoinInfoQuest) it.next(), null, null, null, 28, null));
                    }
                }
                RadioButton rbAll = this.$bmarginFragmentMarketRecommendBinding.f81592d;
                Intrinsics.checkNotNullExpressionValue(rbAll, "rbAll");
                ViewExtKt.m66594y(rbAll);
                RadioButton rbActivity2 = this.$bmarginFragmentMarketRecommendBinding.f81591c;
                Intrinsics.checkNotNullExpressionValue(rbActivity2, "rbActivity");
                ViewExtKt.m66594y(rbActivity2);
            }
            MarketCoinInfoRecommend currencyReferenceRecommend3 = this.$it.getCurrencyReferenceRecommend();
            if ((currencyReferenceRecommend3 != null ? currencyReferenceRecommend3.getSpotGrid() : null) != null) {
                if (this.$it.getCurrencyReferenceRecommend().getSpotGrid() != null && C24129b.m58030b(SiteVisibleConfigKey.BotSpotGrid)) {
                    this.this$0.f33416X.add(new MarginMarketRecommendEntity(1, null, this.$it.getCurrencyReferenceRecommend().getSpotGrid(), null, null, 26, null));
                }
                if (this.$it.getCurrencyReferenceRecommend().getContractGrid() != null && C24129b.m58030b(SiteVisibleConfigKey.BotFuturesContractGrid)) {
                    this.this$0.f33416X.add(new MarginMarketRecommendEntity(2, null, this.$it.getCurrencyReferenceRecommend().getContractGrid(), null, null, 26, null));
                }
                RadioButton rbAll2 = this.$bmarginFragmentMarketRecommendBinding.f81592d;
                Intrinsics.checkNotNullExpressionValue(rbAll2, "rbAll");
                ViewExtKt.m66594y(rbAll2);
                RadioButton rbRobot = this.$bmarginFragmentMarketRecommendBinding.f81595g;
                Intrinsics.checkNotNullExpressionValue(rbRobot, "rbRobot");
                ViewExtKt.m66594y(rbRobot);
            } else {
                MarketCoinInfoRecommend currencyReferenceRecommend4 = this.$it.getCurrencyReferenceRecommend();
                if ((currencyReferenceRecommend4 != null ? currencyReferenceRecommend4.getContractGrid() : null) != null) {
                    if (this.$it.getCurrencyReferenceRecommend().getSpotGrid() != null) {
                        this.this$0.f33416X.add(new MarginMarketRecommendEntity(1, null, this.$it.getCurrencyReferenceRecommend().getSpotGrid(), null, null, 26, null));
                    }
                    if (this.$it.getCurrencyReferenceRecommend().getContractGrid() != null) {
                        this.this$0.f33416X.add(new MarginMarketRecommendEntity(2, null, this.$it.getCurrencyReferenceRecommend().getContractGrid(), null, null, 26, null));
                    }
                    RadioButton rbAll3 = this.$bmarginFragmentMarketRecommendBinding.f81592d;
                    Intrinsics.checkNotNullExpressionValue(rbAll3, "rbAll");
                    ViewExtKt.m66594y(rbAll3);
                    RadioButton rbRobot2 = this.$bmarginFragmentMarketRecommendBinding.f81595g;
                    Intrinsics.checkNotNullExpressionValue(rbRobot2, "rbRobot");
                    ViewExtKt.m66594y(rbRobot2);
                } else {
                    RadioButton rbRobot3 = this.$bmarginFragmentMarketRecommendBinding.f81595g;
                    Intrinsics.checkNotNullExpressionValue(rbRobot3, "rbRobot");
                    ViewExtKt.m66577h(rbRobot3);
                }
            }
            MarketCoinInfoRecommend currencyReferenceRecommend5 = this.$it.getCurrencyReferenceRecommend();
            if ((currencyReferenceRecommend5 != null ? currencyReferenceRecommend5.getPoolStakingProducts() : null) == null || !C24129b.m58030b(SiteVisibleConfigKey.Financing)) {
                RadioButton rbEarn = this.$bmarginFragmentMarketRecommendBinding.f81593e;
                Intrinsics.checkNotNullExpressionValue(rbEarn, "rbEarn");
                ViewExtKt.m66577h(rbEarn);
            } else {
                this.this$0.f33416X.add(new MarginMarketRecommendEntity(3, null, null, this.$it.getCurrencyReferenceRecommend().getPoolStakingProducts(), this.$it.getCoinName(), 6, null));
                RadioButton rbAll4 = this.$bmarginFragmentMarketRecommendBinding.f81592d;
                Intrinsics.checkNotNullExpressionValue(rbAll4, "rbAll");
                ViewExtKt.m66594y(rbAll4);
                RadioButton rbEarn2 = this.$bmarginFragmentMarketRecommendBinding.f81593e;
                Intrinsics.checkNotNullExpressionValue(rbEarn2, "rbEarn");
                ViewExtKt.m66594y(rbEarn2);
            }
            if (C24129b.m58030b(SiteVisibleConfigKey.FastTrade)) {
                IOtcService iOtcServiceM93344d = C42579a.f94275a.m93344d();
                String strM89965c = C41016c.m89965c();
                Intrinsics.checkNotNullExpressionValue(strM89965c, "getCurrentCurrency(...)");
                this.label = 1;
                objMo43954a = iOtcServiceM93344d.mo43954a(strM89965c, this);
                if (objMo43954a == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            if (this.this$0.f33416X.isEmpty()) {
                BaseFragment.showEmptyView$default(this.this$0, 0, 0, (View.OnClickListener) null, 7, (Object) null);
            } else {
                this.this$0.showContentView();
                marginMarketRecommendAdapter = this.this$0.f33417Y;
                if (marginMarketRecommendAdapter == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
                } else {
                    marginMarketRecommendAdapter2 = marginMarketRecommendAdapter;
                }
                marginMarketRecommendAdapter2.replaceData(this.this$0.f33416X);
                this.this$0.m39189M3();
            }
            return Unit.INSTANCE;
        }
        if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        objMo43954a = obj;
        if (((List) objMo43954a).contains(this.this$0.m39183G3().getSymbolInfoEntity().getBaseCurrency())) {
            this.this$0.f33416X.add(new MarginMarketRecommendEntity(4, null, null, null, null, 30, null));
            RadioButton rbAll5 = this.$bmarginFragmentMarketRecommendBinding.f81592d;
            Intrinsics.checkNotNullExpressionValue(rbAll5, "rbAll");
            ViewExtKt.m66594y(rbAll5);
            RadioButton rbOtc = this.$bmarginFragmentMarketRecommendBinding.f81594f;
            Intrinsics.checkNotNullExpressionValue(rbOtc, "rbOtc");
            ViewExtKt.m66594y(rbOtc);
        } else {
            RadioButton rbOtc2 = this.$bmarginFragmentMarketRecommendBinding.f81594f;
            Intrinsics.checkNotNullExpressionValue(rbOtc2, "rbOtc");
            ViewExtKt.m66577h(rbOtc2);
        }
        if (this.this$0.f33416X.isEmpty()) {
            BaseFragment.showEmptyView$default(this.this$0, 0, 0, (View.OnClickListener) null, 7, (Object) null);
        } else {
            this.this$0.showContentView();
            marginMarketRecommendAdapter = this.this$0.f33417Y;
            if (marginMarketRecommendAdapter == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
            } else {
                marginMarketRecommendAdapter2 = marginMarketRecommendAdapter;
            }
            marginMarketRecommendAdapter2.replaceData(this.this$0.f33416X);
            this.this$0.m39189M3();
        }
        return Unit.INSTANCE;
    }
}
