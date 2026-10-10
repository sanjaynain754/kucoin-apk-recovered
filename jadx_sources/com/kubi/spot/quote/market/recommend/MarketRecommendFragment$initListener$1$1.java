package com.kubi.spot.quote.market.recommend;

import android.view.View;
import android.widget.RadioButton;
import com.kubi.otc.api.IOtcService;
import com.kubi.sdk.BaseFragment;
import com.kubi.sdk.site.C24129b;
import com.kubi.sdk.site.SiteVisibleConfigKey;
import com.kubi.spot.quote.market.info.MarketCoinInfo;
import com.kubi.spot.quote.market.info.MarketCoinInfoEarn;
import com.kubi.spot.quote.market.info.MarketCoinInfoGrid;
import com.kubi.spot.quote.market.info.MarketCoinInfoQuest;
import com.kubi.spot.quote.market.info.MarketCoinInfoRecommend;
import com.kubi.spot.service.SpotDepend;
import com.kubi.utils.extensions.core.ViewExtKt;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.InterfaceC41709m0;
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
import t20.C44646j;

/* JADX INFO: compiled from: MarketRecommendFragment.kt */
/* JADX INFO: loaded from: classes47.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.spot.quote.market.recommend.MarketRecommendFragment$initListener$1$1", m90122f = "MarketRecommendFragment.kt", m90123i = {}, m90124l = {193}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
@SourceDebugExtension({"SMAP\nMarketRecommendFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MarketRecommendFragment.kt\ncom/kubi/spot/quote/market/recommend/MarketRecommendFragment$initListener$1$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,308:1\n1068#2:309\n1869#2,2:310\n*S KotlinDebug\n*F\n+ 1 MarketRecommendFragment.kt\ncom/kubi/spot/quote/market/recommend/MarketRecommendFragment$initListener$1$1\n*L\n145#1:309\n147#1:310,2\n*E\n"})
public final class MarketRecommendFragment$initListener$1$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ MarketCoinInfo $it;
    int label;
    final /* synthetic */ MarketRecommendFragment this$0;

    /* JADX INFO: renamed from: com.kubi.spot.quote.market.recommend.MarketRecommendFragment$initListener$1$1$a */
    /* JADX INFO: compiled from: Comparisons.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareByDescending$1\n+ 2 MarketRecommendFragment.kt\ncom/kubi/spot/quote/market/recommend/MarketRecommendFragment$initListener$1$1\n*L\n1#1,328:1\n146#2:329\n*E\n"})
    public static final class C25677a<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t11, T t12) {
            MarketCoinInfoQuest marketCoinInfoQuest = (MarketCoinInfoQuest) t12;
            MarketCoinInfoQuest marketCoinInfoQuest2 = (MarketCoinInfoQuest) t11;
            return ComparisonsKt.compareValues(marketCoinInfoQuest != null ? marketCoinInfoQuest.getStartTime() : null, marketCoinInfoQuest2 != null ? marketCoinInfoQuest2.getStartTime() : null);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarketRecommendFragment$initListener$1$1(MarketCoinInfo marketCoinInfo, MarketRecommendFragment marketRecommendFragment, Continuation<? super MarketRecommendFragment$initListener$1$1> continuation) {
        super(2, continuation);
        this.$it = marketCoinInfo;
        this.this$0 = marketRecommendFragment;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MarketRecommendFragment$initListener$1$1(this.$it, this.this$0, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((MarketRecommendFragment$initListener$1$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:57:0x00d3  */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        List<MarketCoinInfoQuest> questInfos;
        RadioButton radioButton;
        MarketCoinInfoGrid spotGrid;
        C44646j c44646jM62731F3;
        C44646j c44646jM62731F4;
        RadioButton radioButton2;
        RadioButton radioButton3;
        MarketCoinInfoEarn poolStakingProducts;
        RadioButton radioButton4;
        RadioButton radioButton5;
        RadioButton radioButton6;
        MarketCoinInfoGrid contractGrid;
        RadioButton radioButton7;
        RadioButton radioButton8;
        RadioButton radioButton9;
        List<MarketCoinInfoQuest> questInfos2;
        List listSortedWith;
        RadioButton radioButton10;
        RadioButton radioButton11;
        RadioButton radioButton12;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        MarketRecommendAdapter marketRecommendAdapter = null;
        if (i11 != 0) {
            if (i11 == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            MarketCoinInfoRecommend currencyReferenceRecommend = this.$it.getCurrencyReferenceRecommend();
            if (currencyReferenceRecommend != null) {
                questInfos = currencyReferenceRecommend.getQuestInfos();
            } else {
                questInfos = null;
            }
            if (questInfos == null || questInfos.isEmpty()) {
                C44646j c44646jM62731F5 = this.this$0.m62731F3();
                if (c44646jM62731F5 != null && (radioButton = c44646jM62731F5.f99138c) != null) {
                    ViewExtKt.m66577h(radioButton);
                }
            } else {
                MarketCoinInfoRecommend currencyReferenceRecommend2 = this.$it.getCurrencyReferenceRecommend();
                if (currencyReferenceRecommend2 != null && (questInfos2 = currencyReferenceRecommend2.getQuestInfos()) != null && (listSortedWith = CollectionsKt.sortedWith(questInfos2, new C25677a())) != null) {
                    MarketRecommendFragment marketRecommendFragment = this.this$0;
                    Iterator it = listSortedWith.iterator();
                    while (it.hasNext()) {
                        marketRecommendFragment.f51037X.add(new MarketRecommendEntity(0, (MarketCoinInfoQuest) it.next(), null, null, null, 28, null));
                    }
                }
                C44646j c44646jM62731F6 = this.this$0.m62731F3();
                if (c44646jM62731F6 != null && (radioButton9 = c44646jM62731F6.f99139d) != null) {
                    ViewExtKt.m66594y(radioButton9);
                }
                C44646j c44646jM62731F7 = this.this$0.m62731F3();
                if (c44646jM62731F7 != null && (radioButton8 = c44646jM62731F7.f99138c) != null) {
                    ViewExtKt.m66594y(radioButton8);
                }
            }
            MarketCoinInfoRecommend currencyReferenceRecommend3 = this.$it.getCurrencyReferenceRecommend();
            if (currencyReferenceRecommend3 != null) {
                spotGrid = currencyReferenceRecommend3.getSpotGrid();
            } else {
                spotGrid = null;
            }
            if (spotGrid == null) {
                MarketCoinInfoRecommend currencyReferenceRecommend4 = this.$it.getCurrencyReferenceRecommend();
                if (currencyReferenceRecommend4 != null) {
                    contractGrid = currencyReferenceRecommend4.getContractGrid();
                } else {
                    contractGrid = null;
                }
                if (contractGrid == null) {
                    C44646j c44646jM62731F8 = this.this$0.m62731F3();
                    if (c44646jM62731F8 != null && (radioButton7 = c44646jM62731F8.f99142g) != null) {
                        ViewExtKt.m66577h(radioButton7);
                    }
                } else {
                    if (this.$it.getCurrencyReferenceRecommend().getSpotGrid() != null) {
                        this.this$0.f51037X.add(new MarketRecommendEntity(1, null, this.$it.getCurrencyReferenceRecommend().getSpotGrid(), null, null, 26, null));
                    }
                    if (this.$it.getCurrencyReferenceRecommend().getContractGrid() != null) {
                        this.this$0.f51037X.add(new MarketRecommendEntity(2, null, this.$it.getCurrencyReferenceRecommend().getContractGrid(), null, null, 26, null));
                    }
                    c44646jM62731F3 = this.this$0.m62731F3();
                    if (c44646jM62731F3 != null) {
                        ViewExtKt.m66594y(radioButton3);
                    }
                    c44646jM62731F4 = this.this$0.m62731F3();
                    if (c44646jM62731F4 != null) {
                        ViewExtKt.m66594y(radioButton2);
                    }
                }
            } else {
                if (this.$it.getCurrencyReferenceRecommend().getSpotGrid() != null && C24129b.m58030b(SiteVisibleConfigKey.BotSpotGrid)) {
                    this.this$0.f51037X.add(new MarketRecommendEntity(1, null, this.$it.getCurrencyReferenceRecommend().getSpotGrid(), null, null, 26, null));
                }
                if (this.$it.getCurrencyReferenceRecommend().getContractGrid() != null && C24129b.m58030b(SiteVisibleConfigKey.BotFuturesContractGrid)) {
                    this.this$0.f51037X.add(new MarketRecommendEntity(2, null, this.$it.getCurrencyReferenceRecommend().getContractGrid(), null, null, 26, null));
                }
                c44646jM62731F3 = this.this$0.m62731F3();
                if (c44646jM62731F3 != null && (radioButton3 = c44646jM62731F3.f99139d) != null) {
                    ViewExtKt.m66594y(radioButton3);
                }
                c44646jM62731F4 = this.this$0.m62731F3();
                if (c44646jM62731F4 != null && (radioButton2 = c44646jM62731F4.f99142g) != null) {
                    ViewExtKt.m66594y(radioButton2);
                }
            }
            MarketCoinInfoRecommend currencyReferenceRecommend5 = this.$it.getCurrencyReferenceRecommend();
            if (currencyReferenceRecommend5 != null) {
                poolStakingProducts = currencyReferenceRecommend5.getPoolStakingProducts();
            } else {
                poolStakingProducts = null;
            }
            if (poolStakingProducts == null || !C24129b.m58030b(SiteVisibleConfigKey.Financing)) {
                C44646j c44646jM62731F9 = this.this$0.m62731F3();
                if (c44646jM62731F9 != null && (radioButton4 = c44646jM62731F9.f99140e) != null) {
                    ViewExtKt.m66577h(radioButton4);
                }
            } else {
                this.this$0.f51037X.add(new MarketRecommendEntity(3, null, null, this.$it.getCurrencyReferenceRecommend().getPoolStakingProducts(), this.$it.getCoinName(), 6, null));
                C44646j c44646jM62731F10 = this.this$0.m62731F3();
                if (c44646jM62731F10 != null && (radioButton6 = c44646jM62731F10.f99139d) != null) {
                    ViewExtKt.m66594y(radioButton6);
                }
                C44646j c44646jM62731F11 = this.this$0.m62731F3();
                if (c44646jM62731F11 != null && (radioButton5 = c44646jM62731F11.f99140e) != null) {
                    ViewExtKt.m66594y(radioButton5);
                }
            }
            IOtcService iOtcServiceM63035e = SpotDepend.f51244a.m63035e();
            String strM89965c = C41016c.m89965c();
            Intrinsics.checkNotNullExpressionValue(strM89965c, "getCurrentCurrency(...)");
            this.label = 1;
            obj = iOtcServiceM63035e.mo43954a(strM89965c, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        if (!((List) obj).contains(this.this$0.m62693H3().getSymbolInfoEntity().getBaseCurrency()) || !C24129b.m58030b(SiteVisibleConfigKey.FastTrade)) {
            C44646j c44646jM62731F12 = this.this$0.m62731F3();
            if (c44646jM62731F12 != null && (radioButton10 = c44646jM62731F12.f99141f) != null) {
                ViewExtKt.m66577h(radioButton10);
            }
        } else {
            this.this$0.f51037X.add(new MarketRecommendEntity(4, null, null, null, null, 30, null));
            C44646j c44646jM62731F13 = this.this$0.m62731F3();
            if (c44646jM62731F13 != null && (radioButton12 = c44646jM62731F13.f99139d) != null) {
                ViewExtKt.m66594y(radioButton12);
            }
            C44646j c44646jM62731F14 = this.this$0.m62731F3();
            if (c44646jM62731F14 != null && (radioButton11 = c44646jM62731F14.f99141f) != null) {
                ViewExtKt.m66594y(radioButton11);
            }
        }
        if (this.this$0.f51037X.isEmpty()) {
            BaseFragment.showEmptyView$default(this.this$0, 0, 0, (View.OnClickListener) null, 7, (Object) null);
        } else {
            this.this$0.showContentView();
            MarketRecommendAdapter marketRecommendAdapter2 = this.this$0.f51038Y;
            if (marketRecommendAdapter2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
            } else {
                marketRecommendAdapter = marketRecommendAdapter2;
            }
            marketRecommendAdapter.replaceData(this.this$0.f51037X);
            this.this$0.m62699N3();
        }
        return Unit.INSTANCE;
    }
}
