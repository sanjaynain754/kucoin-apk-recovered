package com.kubi.kucoin.feature.widget;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.data.entity.TradeItemBean;
import com.kubi.kucoin.market.monitor.lib.R$drawable;
import com.kubi.kucoin.market.monitor.lib.R$id;
import com.kubi.kucoin.market.monitor.lib.R$layout;
import com.kubi.kucoin.market.monitor.lib.R$string;
import com.kubi.sdk.base.p113ui.OldBaseFragment;
import com.kubi.sdk.util.C24223c1;
import com.kubi.spot.entity.MarketsEntity;
import com.kubi.utils.extensions.C27025c;
import com.tencent.qcloud.tuicore.TUIConstants;
import f00.C37304a;
import g00.InterfaceC37760l;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.rxkotlin.DisposableKt;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p569qq.C43852m;
import p694vk.C45590s;
import p839zp.C46902a;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.comparisons.ComparisonsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: ChooseSymbolFragment.kt */
/* JADX INFO: loaded from: classes18.dex */
@Metadata(m90083d1 = {"\u00007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\r\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\n\u001a\u00020\u000bH\u0016J\b\u0010\u0011\u001a\u00020\u000bH\u0002J\b\u0010\u0012\u001a\u00020\u0013H\u0014J\u001a\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016J\b\u0010\u0019\u001a\u00020\u000bH\u0016J\u0006\u0010\u001a\u001a\u00020\u000bR\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\f\u001a\u00020\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\t\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001c"}, m90084d2 = {"Lcom/kubi/kucoin/feature/widget/ChooseSymbolChildFragment;", "Lcom/kubi/sdk/base/ui/OldBaseFragment;", "<init>", "()V", "symbols", "Lcom/kubi/spot/entity/MarketsEntity;", "getSymbols", "()Lcom/kubi/spot/entity/MarketsEntity;", "symbols$delegate", "Lkotlin/Lazy;", "showEmpty", "", "tradeListAdapter", "com/kubi/kucoin/feature/widget/ChooseSymbolChildFragment$tradeListAdapter$2$1", "getTradeListAdapter", "()Lcom/kubi/kucoin/feature/widget/ChooseSymbolChildFragment$tradeListAdapter$2$1;", "tradeListAdapter$delegate", "getRestfulData", "getLayout", "", "onViewCreated", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "lazyLoad", "notifyDataSetChanged", "Companion", "MarketMonitorLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nChooseSymbolFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ChooseSymbolFragment.kt\ncom/kubi/kucoin/feature/widget/ChooseSymbolChildFragment\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,315:1\n1011#2,2:316\n827#2:318\n855#2,2:319\n*S KotlinDebug\n*F\n+ 1 ChooseSymbolFragment.kt\ncom/kubi/kucoin/feature/widget/ChooseSymbolChildFragment\n*L\n279#1:316,2\n280#1:318\n280#1:319,2\n*E\n"})
public final class ChooseSymbolChildFragment extends OldBaseFragment {

    /* JADX INFO: renamed from: W */
    @NotNull
    public static final Companion f27778W = new Companion(null);

    /* JADX INFO: renamed from: U */
    @NotNull
    public final Lazy f27779U = LazyKt.lazy(new Function0() { // from class: com.kubi.kucoin.feature.widget.a
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return ChooseSymbolChildFragment.m32071v3(this.f27793b);
        }
    });

    /* JADX INFO: renamed from: V */
    @NotNull
    public final Lazy f27780V = LazyKt.lazy(new Function0() { // from class: com.kubi.kucoin.feature.widget.b
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return ChooseSymbolChildFragment.m32072w3(this.f27829b);
        }
    });

    /* JADX INFO: compiled from: ChooseSymbolFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, m90084d2 = {"Lcom/kubi/kucoin/feature/widget/ChooseSymbolChildFragment$Companion;", "", "<init>", "()V", "newInstance", "Lcom/kubi/kucoin/feature/widget/ChooseSymbolChildFragment;", "symbol", "Lcom/kubi/spot/entity/MarketsEntity;", "MarketMonitorLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @NotNull
        public final ChooseSymbolChildFragment newInstance(@NotNull MarketsEntity symbol) {
            Intrinsics.checkNotNullParameter(symbol, "symbol");
            Bundle bundle = new Bundle();
            bundle.putParcelable("data", symbol);
            ChooseSymbolChildFragment chooseSymbolChildFragment = new ChooseSymbolChildFragment();
            chooseSymbolChildFragment.setArguments(bundle);
            return chooseSymbolChildFragment;
        }
    }

    /* JADX INFO: renamed from: com.kubi.kucoin.feature.widget.ChooseSymbolChildFragment$a */
    /* JADX INFO: compiled from: ChooseSymbolFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0003H\u0016¨\u0006\u0007"}, m90084d2 = {"com/kubi/kucoin/feature/widget/ChooseSymbolChildFragment$getRestfulData$2", "Lcom/kubi/sdk/util/SimpleThrowableConsumer;", "accept", "", "throwable", "", "onNetError", "MarketMonitorLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C15329a extends C24223c1 {
        public C15329a() {
            super(ChooseSymbolChildFragment.this, false);
        }

        @Override // com.kubi.sdk.util.C24223c1, io.reactivex.functions.Consumer
        /* JADX INFO: renamed from: b */
        public void accept(Throwable throwable) {
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            if (ChooseSymbolChildFragment.this.isDetached() || ChooseSymbolChildFragment.this.getParentFragment() == null) {
                return;
            }
            FragmentActivity activity = ChooseSymbolChildFragment.this.getActivity();
            if (C27025c.m66566d(activity != null ? Boolean.valueOf(activity.isFinishing()) : null)) {
                return;
            }
            if (ChooseSymbolChildFragment.this.m32075s3().getData().isEmpty()) {
                ChooseSymbolChildFragment.this.showEmpty();
            }
            super.accept(throwable);
        }

        @Override // com.kubi.sdk.util.C24223c1
        /* JADX INFO: renamed from: c */
        public void mo32077c() {
            ChooseSymbolChildFragment.this.showNetWorkError();
        }
    }

    /* JADX INFO: renamed from: com.kubi.kucoin.feature.widget.ChooseSymbolChildFragment$b */
    /* JADX INFO: compiled from: Comparisons.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 ChooseSymbolFragment.kt\ncom/kubi/kucoin/feature/widget/ChooseSymbolChildFragment\n*L\n1#1,328:1\n279#2:329\n*E\n"})
    public static final class C15330b<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t11, T t12) {
            return ComparisonsKt.compareValues(Double.valueOf(-((TradeItemBean) t11).getValue()), Double.valueOf(-((TradeItemBean) t12).getValue()));
        }
    }

    /* JADX INFO: renamed from: u3 */
    public static final void m32070u3(View view) {
        InterfaceC37760l.a.m85175a(C37304a.f82764a, "MARKET", null, null, null, C43852m.m96602n("B3suspentionSetting", FirebaseAnalytics.Event.SEARCH, null, 4, null), null, null, 110, null);
    }

    /* JADX INFO: renamed from: w3 */
    public static final ChooseSymbolChildFragment$tradeListAdapter$2$1 m32072w3(ChooseSymbolChildFragment chooseSymbolChildFragment) {
        return new ChooseSymbolChildFragment$tradeListAdapter$2$1(chooseSymbolChildFragment, R$layout.market_monitor_view_item_choose_symbol);
    }

    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment
    public int getLayout() {
        return R$layout.kucoin_view_recyclerview;
    }

    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment, com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        m32075s3().bindToRecyclerView((RecyclerView) view.findViewById(R$id.recycler_view));
        showLoading();
    }

    /* JADX INFO: renamed from: r3 */
    public final MarketsEntity m32074r3() {
        return (MarketsEntity) this.f27779U.getValue();
    }

    /* JADX INFO: renamed from: s3 */
    public final ChooseSymbolChildFragment$tradeListAdapter$2$1 m32075s3() {
        return (ChooseSymbolChildFragment$tradeListAdapter$2$1) this.f27780V.getValue();
    }

    /* JADX INFO: renamed from: q3 */
    public static final void m32069q3(ChooseSymbolChildFragment chooseSymbolChildFragment, List list) {
        if (!chooseSymbolChildFragment.isDetached() && chooseSymbolChildFragment.getParentFragment() != null) {
            if (list.isEmpty()) {
                chooseSymbolChildFragment.showEmpty();
                return;
            }
            if (!chooseSymbolChildFragment.isDetached() && chooseSymbolChildFragment.getParentFragment() != null) {
                Intrinsics.checkNotNull(list);
                List mutableList = CollectionsKt.toMutableList((Collection) list);
                if (mutableList.size() > 1) {
                    CollectionsKt.sortWith(mutableList, new C15330b());
                }
                ChooseSymbolChildFragment$tradeListAdapter$2$1 chooseSymbolChildFragment$tradeListAdapter$2$1M32075s3 = chooseSymbolChildFragment.m32075s3();
                ArrayList arrayList = new ArrayList();
                for (Object obj : mutableList) {
                    if (!((TradeItemBean) obj).getSymbolInfoEntity().isPreviewEnableShow()) {
                        arrayList.add(obj);
                    }
                }
                chooseSymbolChildFragment$tradeListAdapter$2$1M32075s3.replaceData(arrayList);
                chooseSymbolChildFragment.showContent();
            }
        }
    }

    /* JADX INFO: renamed from: v3 */
    public static final MarketsEntity m32071v3(ChooseSymbolChildFragment chooseSymbolChildFragment) {
        MarketsEntity marketsEntity;
        Bundle arguments = chooseSymbolChildFragment.getArguments();
        if (arguments != null) {
            marketsEntity = (MarketsEntity) arguments.getParcelable("data");
        } else {
            marketsEntity = null;
        }
        Intrinsics.checkNotNull(marketsEntity);
        return marketsEntity;
    }

    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment
    public void lazyLoad() {
        super.lazyLoad();
        m32073p3();
    }

    /* JADX INFO: renamed from: p3 */
    public final void m32073p3() {
        Boolean boolValueOf;
        String name;
        FragmentActivity activity = getActivity();
        if (activity != null) {
            boolValueOf = Boolean.valueOf(activity.isFinishing());
        } else {
            boolValueOf = null;
        }
        if (!C27025c.m66566d(boolValueOf) && (name = m32074r3().getName()) != null && name.length() != 0) {
            Disposable disposableSubscribe = C46902a.f104768a.m103312b().mo59991b(m32074r3().getName(), true, "android/" + C45590s.f102687a.m100675Z() + "_float_chooseSymbol").subscribe(new Consumer() { // from class: com.kubi.kucoin.feature.widget.d
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    ChooseSymbolChildFragment.m32069q3(this.f27830b, (List) obj);
                }
            }, new C15329a());
            Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
            CompositeDisposable compositeDisposable = getCompositeDisposable();
            Intrinsics.checkNotNullExpressionValue(compositeDisposable, "getCompositeDisposable(...)");
            DisposableKt.addTo(disposableSubscribe, compositeDisposable);
        }
    }

    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment
    public void showEmpty() {
        if (Intrinsics.areEqual(m32074r3().getName(), "favor")) {
            super.showEmpty(R$string.fav_empty_click_add, R$drawable.ic2_common_empty, new View.OnClickListener() { // from class: com.kubi.kucoin.feature.widget.c
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ChooseSymbolChildFragment.m32070u3(view);
                }
            });
        } else {
            super.showEmpty();
        }
    }

    /* JADX INFO: renamed from: t3 */
    public final void m32076t3() {
        m32075s3().notifyDataSetChanged();
    }
}
