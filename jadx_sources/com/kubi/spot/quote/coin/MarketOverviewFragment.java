package com.kubi.spot.quote.coin;

import android.content.Context;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.media3.extractor.text.ttml.TtmlNode;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.AccessToken;
import com.google.android.flexbox.FlexboxLayout;
import com.kubi.resources.C22912t;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.SuffixTextView;
import com.kubi.router.core.Router;
import com.kubi.sdk.BaseActivity;
import com.kubi.sdk.BaseFragment;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.spot.R$layout;
import com.kubi.spot.quote.market.info.CoinInfoHelper;
import com.kubi.spot.quote.market.info.CoinWrapEntity;
import com.kubi.spot.quote.market.info.MarketCoinInfo;
import com.kubi.spot.quote.market.info.MarketCoinInfoDetailFragment;
import com.kubi.spot.quote.market.info.MarketCoinInfoFAQ;
import com.kubi.spot.quote.market.info.MarketCoinInfoFAQAdapter;
import com.kubi.spot.quote.market.info.MarketCoinInfoParagraph;
import com.kubi.utils.C27051h;
import com.kubi.utils.extensions.C27024b;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.core.ViewExtKt;
import f30.C37346q;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p569qq.C43852m;
import p852kotlin.Function;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.FunctionAdapter;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KProperty;
import p852kotlin.text.StringsKt;
import t20.C44642h;
import w00.C45681e;

/* JADX INFO: compiled from: MarketOverviewFragment.kt */
/* JADX INFO: loaded from: classes47.dex */
@Metadata(m90083d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 %2\u00020\u0001:\u0001%B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J\b\u0010\u001d\u001a\u00020\u001eH\u0016J\b\u0010\u001f\u001a\u00020\u001eH\u0002J\u0010\u0010 \u001a\u00020\u001e2\u0006\u0010!\u001a\u00020\"H\u0002J\u0010\u0010#\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020\"H\u0002J\u0010\u0010$\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020\"H\u0002R\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001d\u0010\n\u001a\u0004\u0018\u00010\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u001b\u0010\u0010\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u000f\u001a\u0004\b\u0012\u0010\u0013¨\u0006&"}, m90084d2 = {"Lcom/kubi/spot/quote/coin/MarketOverviewFragment;", "Lcom/kubi/sdk/BaseFragment;", "<init>", "()V", "binding", "Lcom/kubi/spot/databinding/BkucoinFragmentMarketOverviewBinding;", "getBinding", "()Lcom/kubi/spot/databinding/BkucoinFragmentMarketOverviewBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "coin", "", "getCoin", "()Ljava/lang/String;", "coin$delegate", "Lkotlin/Lazy;", "viewModel", "Lcom/kubi/spot/quote/coin/KuCoinCoinViewModel;", "getViewModel", "()Lcom/kubi/spot/quote/coin/KuCoinCoinViewModel;", "viewModel$delegate", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "savedInstanceState", "Landroid/os/Bundle;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "onLoad", "", "initListener", "initIntro", "info", "Lcom/kubi/spot/quote/market/info/MarketCoinInfo;", "initFaq", "initRelate", "Companion", "SpotLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nMarketOverviewFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MarketOverviewFragment.kt\ncom/kubi/spot/quote/coin/MarketOverviewFragment\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,193:1\n147#2,16:194\n172#3,9:210\n827#4:219\n855#4,2:220\n827#4:222\n855#4,2:223\n827#4:225\n855#4,2:226\n827#4:228\n855#4,2:229\n774#4:231\n865#4,2:232\n827#4:234\n855#4,2:235\n827#4:237\n855#4,2:238\n*S KotlinDebug\n*F\n+ 1 MarketOverviewFragment.kt\ncom/kubi/spot/quote/coin/MarketOverviewFragment\n*L\n39#1:194,16\n50#1:210,9\n131#1:219\n131#1:220,2\n137#1:222\n137#1:223,2\n143#1:225\n143#1:226,2\n149#1:228\n149#1:229,2\n160#1:231\n160#1:232,2\n179#1:234\n179#1:235,2\n185#1:237\n185#1:238,2\n*E\n"})
public final class MarketOverviewFragment extends BaseFragment {

    /* JADX INFO: renamed from: U */
    @NotNull
    public final InterfaceC24293a f50793U = C45681e.m100799e(this, new Function1<MarketOverviewFragment, C44642h>() { // from class: com.kubi.spot.quote.coin.MarketOverviewFragment$special$$inlined$viewBindingFragment$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C44642h invoke(@NotNull MarketOverviewFragment fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C44642h.m98761a(this.this$0.getContentView());
        }

        {
            super(1);
        }
    }, new Function1<C44642h, Unit>() { // from class: com.kubi.spot.quote.coin.MarketOverviewFragment$special$$inlined$viewBindingFragment$1
        public final void invoke(@NotNull C44642h it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C44642h c44642h) {
            invoke(c44642h);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: V */
    @NotNull
    public final Lazy f50794V = LazyKt.lazy(new Function0() { // from class: com.kubi.spot.quote.coin.r
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return MarketOverviewFragment.m62210n3(this.f50859b);
        }
    });

    /* JADX INFO: renamed from: W */
    @NotNull
    public final Lazy f50795W;

    /* JADX INFO: renamed from: Y */
    public static final /* synthetic */ KProperty<Object>[] f50792Y = {Reflection.property1(new PropertyReference1Impl(MarketOverviewFragment.class, "binding", "getBinding()Lcom/kubi/spot/databinding/BkucoinFragmentMarketOverviewBinding;", 0))};

    /* JADX INFO: renamed from: X */
    @NotNull
    public static final Companion f50791X = new Companion(null);

    /* JADX INFO: compiled from: MarketOverviewFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¨\u0006\b"}, m90084d2 = {"Lcom/kubi/spot/quote/coin/MarketOverviewFragment$Companion;", "", "<init>", "()V", "newInstance", "Lcom/kubi/spot/quote/coin/MarketOverviewFragment;", "coin", "", "SpotLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @NotNull
        public final MarketOverviewFragment newInstance(@Nullable String coin) {
            MarketOverviewFragment marketOverviewFragment = new MarketOverviewFragment();
            marketOverviewFragment.setArguments(new C27051h().m66724h("coin", coin).m66717a());
            return marketOverviewFragment;
        }
    }

    /* JADX INFO: renamed from: com.kubi.spot.quote.coin.MarketOverviewFragment$a */
    /* JADX INFO: compiled from: MarketOverviewFragment.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C25469a implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Function1 f50796b;

        public C25469a(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f50796b = function;
        }

        public final boolean equals(@Nullable Object obj) {
            if ((obj instanceof Observer) && (obj instanceof FunctionAdapter)) {
                return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p852kotlin.jvm.internal.FunctionAdapter
        @NotNull
        public final Function<?> getFunctionDelegate() {
            return this.f50796b;
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f50796b.invoke(obj);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    /* JADX INFO: renamed from: w3 */
    public final void m62220w3(MarketCoinInfo marketCoinInfo) {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        ArrayList arrayList5;
        ArrayList arrayList6;
        C44642h c44642hM62216o3 = m62216o3();
        if (c44642hM62216o3 != null) {
            List<String> website = marketCoinInfo.getWebsite();
            ArrayList arrayList7 = null;
            if (website != null) {
                ArrayList arrayList8 = new ArrayList();
                for (Object obj : website) {
                    String str = (String) obj;
                    if (str != null && str.length() != 0) {
                        arrayList8.add(obj);
                    }
                }
                arrayList = arrayList8;
            } else {
                arrayList = null;
            }
            if (arrayList == null || arrayList.isEmpty()) {
                CoinInfoHelper coinInfoHelper = CoinInfoHelper.f50977a;
                Context contextRequireContext = requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                LinearLayout layoutWebsite = c44642hM62216o3.f99084h;
                Intrinsics.checkNotNullExpressionValue(layoutWebsite, "layoutWebsite");
                coinInfoHelper.m62625k(contextRequireContext, layoutWebsite);
            } else {
                CoinInfoHelper coinInfoHelper2 = CoinInfoHelper.f50977a;
                Context contextRequireContext2 = requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "requireContext(...)");
                LinearLayout layoutWebsite2 = c44642hM62216o3.f99084h;
                Intrinsics.checkNotNullExpressionValue(layoutWebsite2, "layoutWebsite");
                CoinInfoHelper.m62621m(coinInfoHelper2, contextRequireContext2, layoutWebsite2, arrayList, null, false, 24, null);
            }
            List<String> doc = marketCoinInfo.getDoc();
            if (doc != null) {
                ArrayList arrayList9 = new ArrayList();
                for (Object obj2 : doc) {
                    String str2 = (String) obj2;
                    if (str2 != null && str2.length() != 0) {
                        arrayList9.add(obj2);
                    }
                }
                arrayList2 = arrayList9;
            } else {
                arrayList2 = null;
            }
            if (arrayList2 == null || arrayList2.isEmpty()) {
                CoinInfoHelper coinInfoHelper3 = CoinInfoHelper.f50977a;
                Context contextRequireContext3 = requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext3, "requireContext(...)");
                LinearLayout layoutDoc = c44642hM62216o3.f99081e;
                Intrinsics.checkNotNullExpressionValue(layoutDoc, "layoutDoc");
                coinInfoHelper3.m62625k(contextRequireContext3, layoutDoc);
            } else {
                CoinInfoHelper coinInfoHelper4 = CoinInfoHelper.f50977a;
                Context contextRequireContext4 = requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext4, "requireContext(...)");
                LinearLayout layoutDoc2 = c44642hM62216o3.f99081e;
                Intrinsics.checkNotNullExpressionValue(layoutDoc2, "layoutDoc");
                CoinInfoHelper.m62621m(coinInfoHelper4, contextRequireContext4, layoutDoc2, arrayList2, null, false, 24, null);
            }
            List<String> explorer = marketCoinInfo.getExplorer();
            if (explorer != null) {
                ArrayList arrayList10 = new ArrayList();
                for (Object obj3 : explorer) {
                    String str3 = (String) obj3;
                    if (str3 != null && str3.length() != 0) {
                        arrayList10.add(obj3);
                    }
                }
                arrayList3 = arrayList10;
            } else {
                arrayList3 = null;
            }
            if (arrayList3 == null || arrayList3.isEmpty()) {
                CoinInfoHelper coinInfoHelper5 = CoinInfoHelper.f50977a;
                Context contextRequireContext5 = requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext5, "requireContext(...)");
                LinearLayout layoutExplorer = c44642hM62216o3.f99082f;
                Intrinsics.checkNotNullExpressionValue(layoutExplorer, "layoutExplorer");
                coinInfoHelper5.m62625k(contextRequireContext5, layoutExplorer);
            } else {
                CoinInfoHelper coinInfoHelper6 = CoinInfoHelper.f50977a;
                Context contextRequireContext6 = requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext6, "requireContext(...)");
                LinearLayout layoutExplorer2 = c44642hM62216o3.f99082f;
                Intrinsics.checkNotNullExpressionValue(layoutExplorer2, "layoutExplorer");
                CoinInfoHelper.m62621m(coinInfoHelper6, contextRequireContext6, layoutExplorer2, arrayList3, null, false, 24, null);
            }
            List<String> contract = marketCoinInfo.getContract();
            if (contract != null) {
                arrayList4 = new ArrayList();
                for (Object obj4 : contract) {
                    String str4 = (String) obj4;
                    if (str4 != null && str4.length() != 0) {
                        arrayList4.add(obj4);
                    }
                }
            } else {
                arrayList4 = null;
            }
            if (arrayList4 == null || arrayList4.isEmpty()) {
                CoinInfoHelper coinInfoHelper7 = CoinInfoHelper.f50977a;
                Context contextRequireContext7 = requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext7, "requireContext(...)");
                LinearLayout layoutContract = c44642hM62216o3.f99080d;
                Intrinsics.checkNotNullExpressionValue(layoutContract, "layoutContract");
                coinInfoHelper7.m62625k(contextRequireContext7, layoutContract);
            } else {
                CoinInfoHelper coinInfoHelper8 = CoinInfoHelper.f50977a;
                Context contextRequireContext8 = requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext8, "requireContext(...)");
                LinearLayout layoutContract2 = c44642hM62216o3.f99080d;
                Intrinsics.checkNotNullExpressionValue(layoutContract2, "layoutContract");
                coinInfoHelper8.m62624h(contextRequireContext8, layoutContract2, arrayList4, false);
            }
            List<String> codeAndCommunity = marketCoinInfo.getCodeAndCommunity();
            if (codeAndCommunity != null) {
                arrayList5 = new ArrayList();
                for (Object obj5 : codeAndCommunity) {
                    String str5 = (String) obj5;
                    if (!C27025c.m66566d(str5 != null ? Boolean.valueOf(StringsKt.contains((CharSequence) str5, (CharSequence) AccessToken.DEFAULT_GRAPH_DOMAIN, true)) : null)) {
                        if (!C27025c.m66566d(str5 != null ? Boolean.valueOf(StringsKt.contains((CharSequence) str5, (CharSequence) "twitter", true)) : null)) {
                            if (!C27025c.m66566d(str5 != null ? Boolean.valueOf(StringsKt.contains((CharSequence) str5, (CharSequence) "t.me", true)) : null)) {
                                if (!C27025c.m66566d(str5 != null ? Boolean.valueOf(StringsKt.contains((CharSequence) str5, (CharSequence) "telegram.me", true)) : null)) {
                                    if (!C27025c.m66566d(str5 != null ? Boolean.valueOf(StringsKt.contains((CharSequence) str5, (CharSequence) "medium", true)) : null)) {
                                        if (!C27025c.m66566d(str5 != null ? Boolean.valueOf(StringsKt.contains((CharSequence) str5, (CharSequence) "reddit", true)) : null)) {
                                            if (C27025c.m66566d(str5 != null ? Boolean.valueOf(StringsKt.contains((CharSequence) str5, (CharSequence) "github", true)) : null)) {
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    arrayList5.add(obj5);
                }
            } else {
                arrayList5 = null;
            }
            if (arrayList5 == null || arrayList5.isEmpty()) {
                CoinInfoHelper coinInfoHelper9 = CoinInfoHelper.f50977a;
                Context contextRequireContext9 = requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext9, "requireContext(...)");
                FlexboxLayout layoutCommunity = c44642hM62216o3.f99079c;
                Intrinsics.checkNotNullExpressionValue(layoutCommunity, "layoutCommunity");
                coinInfoHelper9.m62625k(contextRequireContext9, layoutCommunity);
            } else {
                FlexboxLayout layoutCommunity2 = c44642hM62216o3.f99079c;
                Intrinsics.checkNotNullExpressionValue(layoutCommunity2, "layoutCommunity");
                Context contextRequireContext10 = requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext10, "requireContext(...)");
                C37346q.m83934d(layoutCommunity2, contextRequireContext10, arrayList5, new Function2() { // from class: com.kubi.spot.quote.coin.t
                    @Override // p852kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj6, Object obj7) {
                        return MarketOverviewFragment.m62215x3((String) obj6, ((Integer) obj7).intValue());
                    }
                });
            }
            List<String> auditAgency = marketCoinInfo.getAuditAgency();
            if (auditAgency != null) {
                arrayList6 = new ArrayList();
                for (Object obj6 : auditAgency) {
                    String str6 = (String) obj6;
                    if (str6 != null && str6.length() != 0) {
                        arrayList6.add(obj6);
                    }
                }
            } else {
                arrayList6 = null;
            }
            if (arrayList6 == null || arrayList6.isEmpty()) {
                CoinInfoHelper coinInfoHelper10 = CoinInfoHelper.f50977a;
                Context contextRequireContext11 = requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext11, "requireContext(...)");
                FlexboxLayout layoutAudit = c44642hM62216o3.f99078b;
                Intrinsics.checkNotNullExpressionValue(layoutAudit, "layoutAudit");
                coinInfoHelper10.m62625k(contextRequireContext11, layoutAudit);
            } else {
                FlexboxLayout layoutAudit2 = c44642hM62216o3.f99078b;
                Intrinsics.checkNotNullExpressionValue(layoutAudit2, "layoutAudit");
                Context contextRequireContext12 = requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext12, "requireContext(...)");
                C37346q.m83933c(layoutAudit2, contextRequireContext12, arrayList6);
            }
            List<String> investor = marketCoinInfo.getInvestor();
            if (investor != null) {
                arrayList7 = new ArrayList();
                for (Object obj7 : investor) {
                    String str7 = (String) obj7;
                    if (str7 != null && str7.length() != 0) {
                        arrayList7.add(obj7);
                    }
                }
            }
            if (arrayList7 != null && !arrayList7.isEmpty()) {
                FlexboxLayout layoutInvestor = c44642hM62216o3.f99083g;
                Intrinsics.checkNotNullExpressionValue(layoutInvestor, "layoutInvestor");
                Context contextRequireContext13 = requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext13, "requireContext(...)");
                C37346q.m83933c(layoutInvestor, contextRequireContext13, arrayList7);
                return;
            }
            CoinInfoHelper coinInfoHelper11 = CoinInfoHelper.f50977a;
            Context contextRequireContext14 = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext14, "requireContext(...)");
            FlexboxLayout layoutInvestor2 = c44642hM62216o3.f99083g;
            Intrinsics.checkNotNullExpressionValue(layoutInvestor2, "layoutInvestor");
            coinInfoHelper11.m62625k(contextRequireContext14, layoutInvestor2);
        }
    }

    /* JADX INFO: renamed from: p3 */
    private final String m62211p3() {
        return (String) this.f50794V.getValue();
    }

    /* JADX INFO: renamed from: t3 */
    public static final void m62212t3(MarketOverviewFragment marketOverviewFragment, MarketCoinInfo marketCoinInfo, View view) {
        C43852m.m96591c("B5CoinPage", "More", null, null, 12, null);
        Context context = marketOverviewFragment.getContext();
        if (context != null) {
            BaseActivity.INSTANCE.launch(context, MarketCoinInfoDetailFragment.class, new C27051h().m66724h("coin", marketOverviewFragment.m62211p3()).m66721e("data", marketCoinInfo).m66717a());
        }
    }

    /* JADX INFO: renamed from: v3 */
    public static final Unit m62214v3(MarketOverviewFragment marketOverviewFragment, CoinWrapEntity coinWrapEntity) {
        if ((coinWrapEntity != null ? coinWrapEntity.getInfo() : null) == null) {
            return Unit.INSTANCE;
        }
        marketOverviewFragment.m62219s3(coinWrapEntity.getInfo());
        marketOverviewFragment.m62218r3(coinWrapEntity.getInfo());
        marketOverviewFragment.m62220w3(coinWrapEntity.getInfo());
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: x3 */
    public static final Unit m62215x3(String url, int i11) {
        Intrinsics.checkNotNullParameter(url, "url");
        Router.f46192a.m56184f(url).m4048k();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o3 */
    public final C44642h m62216o3() {
        return (C44642h) this.f50793U.getValue(this, f50792Y[0]);
    }

    @Override // com.kubi.sdk.BaseFragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable Bundle savedInstanceState, @Nullable ViewGroup container) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View viewInflate = inflater.inflate(R$layout.bkucoin_fragment_market_overview, (ViewGroup) null);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
        return viewInflate;
    }

    /* JADX INFO: renamed from: q3 */
    public final KuCoinCoinViewModel m62217q3() {
        return (KuCoinCoinViewModel) this.f50795W.getValue();
    }

    public MarketOverviewFragment() {
        final Function0 function0 = null;
        this.f50795W = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(KuCoinCoinViewModel.class), new Function0<ViewModelStore>() { // from class: com.kubi.spot.quote.coin.MarketOverviewFragment$special$$inlined$activityViewModels$default$1
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p852kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStore invoke() {
                ViewModelStore mViewModelStore = this.requireActivity().getMViewModelStore();
                Intrinsics.checkNotNullExpressionValue(mViewModelStore, "requireActivity().viewModelStore");
                return mViewModelStore;
            }
        }, new Function0<CreationExtras>() { // from class: com.kubi.spot.quote.coin.MarketOverviewFragment$special$$inlined$activityViewModels$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p852kotlin.jvm.functions.Function0
            @NotNull
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function1 = function0;
                if (function1 != null && (creationExtras = (CreationExtras) function1.invoke()) != null) {
                    return creationExtras;
                }
                CreationExtras defaultViewModelCreationExtras = this.requireActivity().getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "requireActivity().defaultViewModelCreationExtras");
                return defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.kubi.spot.quote.coin.MarketOverviewFragment$special$$inlined$activityViewModels$default$3
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p852kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelProvider.Factory invoke() {
                ViewModelProvider.Factory defaultViewModelProviderFactory = this.requireActivity().getDefaultViewModelProviderFactory();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "requireActivity().defaultViewModelProviderFactory");
                return defaultViewModelProviderFactory;
            }
        });
    }

    /* JADX INFO: renamed from: n3 */
    public static final String m62210n3(MarketOverviewFragment marketOverviewFragment) {
        Bundle arguments = marketOverviewFragment.getArguments();
        if (arguments != null) {
            return arguments.getString("coin");
        }
        return null;
    }

    /* JADX INFO: renamed from: u3 */
    private final void m62213u3() {
        m62217q3().m62202r().observe(this, new C25469a(new Function1() { // from class: com.kubi.spot.quote.coin.q
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MarketOverviewFragment.m62214v3(this.f50858b, (CoinWrapEntity) obj);
            }
        }));
    }

    @Override // com.kubi.sdk.BaseFragment
    public void onLoad() {
        super.onLoad();
        m62213u3();
    }

    /* JADX INFO: renamed from: r3 */
    public final void m62218r3(MarketCoinInfo marketCoinInfo) {
        RecyclerView recyclerView;
        BaseTextView baseTextView;
        RecyclerView recyclerView2;
        RecyclerView recyclerView3;
        RecyclerView recyclerView4;
        BaseTextView baseTextView2;
        List<MarketCoinInfoFAQ> faqs = marketCoinInfo.getFaqs();
        if (faqs != null && !faqs.isEmpty()) {
            C44642h c44642hM62216o3 = m62216o3();
            if (c44642hM62216o3 != null && (baseTextView2 = c44642hM62216o3.f99094r) != null) {
                ViewExtKt.m66594y(baseTextView2);
            }
            C44642h c44642hM62216o4 = m62216o3();
            if (c44642hM62216o4 != null && (recyclerView4 = c44642hM62216o4.f99093q) != null) {
                ViewExtKt.m66594y(recyclerView4);
            }
            C44642h c44642hM62216o5 = m62216o3();
            if (c44642hM62216o5 != null && (recyclerView3 = c44642hM62216o5.f99093q) != null) {
                C22912t.m54410h(recyclerView3, false, 1, null);
            }
            MarketCoinInfoFAQAdapter marketCoinInfoFAQAdapter = new MarketCoinInfoFAQAdapter();
            C44642h c44642hM62216o6 = m62216o3();
            if (c44642hM62216o6 != null && (recyclerView2 = c44642hM62216o6.f99093q) != null) {
                recyclerView2.setAdapter(marketCoinInfoFAQAdapter);
            }
            marketCoinInfoFAQAdapter.replaceData(C27024b.m66560c(marketCoinInfo.getFaqs()));
            return;
        }
        C44642h c44642hM62216o7 = m62216o3();
        if (c44642hM62216o7 != null && (baseTextView = c44642hM62216o7.f99094r) != null) {
            ViewExtKt.m66577h(baseTextView);
        }
        C44642h c44642hM62216o8 = m62216o3();
        if (c44642hM62216o8 != null && (recyclerView = c44642hM62216o8.f99093q) != null) {
            ViewExtKt.m66577h(recyclerView);
        }
    }

    /* JADX INFO: renamed from: s3 */
    public final void m62219s3(final MarketCoinInfo marketCoinInfo) {
        String text;
        C44642h c44642hM62216o3 = m62216o3();
        if (c44642hM62216o3 != null) {
            List<MarketCoinInfoParagraph> currencyIntroduction = marketCoinInfo.getCurrencyIntroduction();
            if (currencyIntroduction != null && !currencyIntroduction.isEmpty()) {
                int introFirstTitleIndex = marketCoinInfo.getIntroFirstTitleIndex();
                if (introFirstTitleIndex == -1) {
                    BaseTextView tvInfoTitle = c44642hM62216o3.f99096t;
                    Intrinsics.checkNotNullExpressionValue(tvInfoTitle, "tvInfoTitle");
                    ViewExtKt.m66577h(tvInfoTitle);
                } else {
                    BaseTextView tvInfoTitle2 = c44642hM62216o3.f99096t;
                    Intrinsics.checkNotNullExpressionValue(tvInfoTitle2, "tvInfoTitle");
                    ViewExtKt.m66594y(tvInfoTitle2);
                    BaseTextView baseTextView = c44642hM62216o3.f99096t;
                    MarketCoinInfoParagraph marketCoinInfoParagraph = marketCoinInfo.getCurrencyIntroduction().get(introFirstTitleIndex);
                    if (marketCoinInfoParagraph != null) {
                        text = marketCoinInfoParagraph.getText();
                    } else {
                        text = null;
                    }
                    baseTextView.setText(text);
                }
                SpannableStringBuilder spannableStringBuilderM62627o = CoinInfoHelper.f50977a.m62627o(marketCoinInfo.getCurrencyIntroduction(), introFirstTitleIndex);
                if (spannableStringBuilderM62627o.length() == 0) {
                    SuffixTextView tvInfoContent = c44642hM62216o3.f99095s;
                    Intrinsics.checkNotNullExpressionValue(tvInfoContent, "tvInfoContent");
                    ViewExtKt.m66577h(tvInfoContent);
                    return;
                }
                SuffixTextView tvInfoContent2 = c44642hM62216o3.f99095s;
                Intrinsics.checkNotNullExpressionValue(tvInfoContent2, "tvInfoContent");
                ViewExtKt.m66594y(tvInfoContent2);
                c44642hM62216o3.f99095s.setMovementMethod(LinkMovementMethod.getInstance());
                c44642hM62216o3.f99095s.setText(spannableStringBuilderM62627o);
                SuffixTextView suffixTextView = c44642hM62216o3.f99095s;
                boolean z11 = true;
                if (marketCoinInfo.getIntroTitleNum() <= 1) {
                    z11 = false;
                }
                suffixTextView.m54794k(z11);
                c44642hM62216o3.f99095s.onMoreClick(new View.OnClickListener() { // from class: com.kubi.spot.quote.coin.s
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        MarketOverviewFragment.m62212t3(this.f50862b, marketCoinInfo, view);
                    }
                });
                return;
            }
            BaseTextView tvInfoTitle3 = c44642hM62216o3.f99096t;
            Intrinsics.checkNotNullExpressionValue(tvInfoTitle3, "tvInfoTitle");
            ViewExtKt.m66577h(tvInfoTitle3);
            SuffixTextView tvInfoContent3 = c44642hM62216o3.f99095s;
            Intrinsics.checkNotNullExpressionValue(tvInfoContent3, "tvInfoContent");
            ViewExtKt.m66577h(tvInfoContent3);
        }
    }
}
