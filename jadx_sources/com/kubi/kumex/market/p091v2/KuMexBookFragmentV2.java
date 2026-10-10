package com.kubi.kumex.market.p091v2;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.media3.extractor.text.ttml.TtmlNode;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.blankj.utilcode.util.C5267e0;
import com.kubi.broker.RepositoryServiceLocator;
import com.kubi.futures.trade.book.BookAdapter;
import com.kubi.futures.trade.book.C13635c;
import com.kubi.futures.trade.submit.panel.premarket.g;
import com.kubi.kucoin.api.IKuFacadeService;
import com.kubi.kumex.R$array;
import com.kubi.kumex.R$layout;
import com.kubi.kumex.R$string;
import com.kubi.kumex.data.platform.model.ContractEntity;
import com.kubi.kumex.dialog.C15943u;
import com.kubi.kumex.logic.book.BookEntity;
import com.kubi.kumex.utils.ViewExKt;
import com.kubi.network.retrofit.utils.C19331c;
import com.kubi.p110rn.modules.RNH5InterActionHelperKt;
import com.kubi.resources.dialog.BaseDialogFragment;
import com.kubi.resources.dialog.DialogFragmentHelper;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.chart.depth.KuCoinDepthView;
import com.kubi.router.utils.RouteExKt;
import com.kubi.sdk.BaseFragment;
import com.kubi.sdk.util.LoadingViewUtils;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.sdk.widget.dialog.BottomSheetDialogHelper;
import com.kubi.sdk.widget.dialog.SelectEntity;
import com.kubi.utils.C27017c;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.DowngradeExKt;
import com.kubi.utils.extensions.core.C27029c;
import com.kubi.utils.extensions.core.ViewExtKt;
import com.tencent.qcloud.tuicore.TUIConstants;
import dm.C36849u1;
import fm.C37567b;
import gf.C37878b0;
import im.BookAmountConfig;
import im.C38683c;
import im.DisplayBook;
import io.chad.library.adapter.base.BaseViewHolder;
import io.reactivex.Observable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.BiConsumer;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.rxkotlin.DisposableKt;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import ki.C41050b;
import ki.InterfaceC41049a;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.flow.C41679x;
import kotlinx.coroutines.flow.InterfaceC41669n;
import o00.C42911a;
import o00.C42916f;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p236em.C37213a;
import p314hi.InterfaceC38213a;
import p429lf.C42180b;
import p801yl.C46527h0;
import p836zl.C46894j;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.ArraysKt;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KProperty;
import th.InterfaceC44980d;
import w00.C45681e;
import y70.C46392a;

/* JADX INFO: compiled from: KuMexBookFragmentV2.kt */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(m90083d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u0000 42\u00020\u0001:\u00014B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\u0010 \u001a\u0004\u0018\u00010!H\u0016J\u001a\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u001b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016J\b\u0010%\u001a\u00020#H\u0016J\b\u0010&\u001a\u00020#H\u0002J\u0010\u0010'\u001a\u00020#2\u0006\u0010(\u001a\u00020\u000eH\u0002J\b\u0010)\u001a\u00020#H\u0016J\b\u0010*\u001a\u00020#H\u0002J\b\u0010+\u001a\u00020#H\u0002J\u0010\u0010,\u001a\u00020#2\u0006\u0010-\u001a\u00020.H\u0002J\u0010\u0010/\u001a\u00020#2\u0006\u0010-\u001a\u00020.H\u0002J\b\u00100\u001a\u00020#H\u0002J\u0018\u00101\u001a\u00020#2\u0006\u00102\u001a\u0002032\u0006\u0010-\u001a\u00020.H\u0002R\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u000f\u001a\u00020\u00108BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0015\u001a\u00020\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u0014\u001a\u0004\b\u0017\u0010\u0018¨\u00065"}, m90084d2 = {"Lcom/kubi/kumex/market/v2/KuMexBookFragmentV2;", "Lcom/kubi/sdk/BaseFragment;", "<init>", "()V", "bkumexFragmentBookBinding", "Lcom/kubi/kumex/databinding/BkumexFragmentBookBinding;", "getBkumexFragmentBookBinding", "()Lcom/kubi/kumex/databinding/BkumexFragmentBookBinding;", "bkumexFragmentBookBinding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "mBookTransformer", "Lcom/kubi/kumex/logic/book/BookTransformer;", "bookFlow", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/kubi/kumex/logic/book/DisplayBook;", "contentHeight", "", "getContentHeight", "()I", "contentHeight$delegate", "Lkotlin/Lazy;", "symbol", "", "getSymbol", "()Ljava/lang/String;", "symbol$delegate", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "savedInstanceState", "Landroid/os/Bundle;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "onViewCreated", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "onLoad", "initObserver", "notifyBook", "displayBook", RNH5InterActionHelperKt.EVENT_NAME_ON_SHOW, "initListener", "subscribe", "handleAmountUnit", "contract", "Lcom/kubi/kumex/data/platform/model/ContractEntity;", "changeBookAmountConfig", "showBookPrecisionDialog", "setAmountUnit", "isTotal", "", "Companion", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nKuMexBookFragmentV2.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KuMexBookFragmentV2.kt\ncom/kubi/kumex/market/v2/KuMexBookFragmentV2\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 StorageIdEx.kt\ncom/kubi/utils/storage/StorageIdExKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,306:1\n147#2,16:307\n67#3:323\n67#3:324\n67#3:325\n58#3,2:327\n1#4:326\n*S KotlinDebug\n*F\n+ 1 KuMexBookFragmentV2.kt\ncom/kubi/kumex/market/v2/KuMexBookFragmentV2\n*L\n82#1:307,16\n158#1:323\n211#1:324\n268#1:325\n287#1:327,2\n*E\n"})
public final class KuMexBookFragmentV2 extends BaseFragment {

    /* JADX INFO: renamed from: U */
    @NotNull
    public final InterfaceC24293a f29595U = C45681e.m100799e(this, new Function1<KuMexBookFragmentV2, C36849u1>() { // from class: com.kubi.kumex.market.v2.KuMexBookFragmentV2$special$$inlined$viewBindingFragment$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C36849u1 invoke(@NotNull KuMexBookFragmentV2 fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C36849u1.m82563a(this.this$0.getContentView());
        }

        {
            super(1);
        }
    }, new Function1<C36849u1, Unit>() { // from class: com.kubi.kumex.market.v2.KuMexBookFragmentV2$special$$inlined$viewBindingFragment$1
        public final void invoke(@NotNull C36849u1 it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C36849u1 c36849u1) {
            invoke(c36849u1);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: V */
    @NotNull
    public final C38683c f29596V = new C38683c();

    /* JADX INFO: renamed from: W */
    @NotNull
    public final InterfaceC41669n<DisplayBook> f29597W = C41679x.m91009a(new DisplayBook(null, CollectionsKt.emptyList(), CollectionsKt.emptyList(), null, null, null, null, 96, null));

    /* JADX INFO: renamed from: X */
    @NotNull
    public final Lazy f29598X = LazyKt.lazy(new Function0() { // from class: com.kubi.kumex.market.v2.n
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Integer.valueOf(KuMexBookFragmentV2.m34628C3(this.f29819b));
        }
    });

    /* JADX INFO: renamed from: Y */
    @NotNull
    public final Lazy f29599Y = LazyKt.lazy(new Function0() { // from class: com.kubi.kumex.market.v2.o
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return KuMexBookFragmentV2.m34648a4(this.f29822b);
        }
    });

    /* JADX INFO: renamed from: a0 */
    public static final /* synthetic */ KProperty<Object>[] f29594a0 = {Reflection.property1(new PropertyReference1Impl(KuMexBookFragmentV2.class, "bkumexFragmentBookBinding", "getBkumexFragmentBookBinding()Lcom/kubi/kumex/databinding/BkumexFragmentBookBinding;", 0))};

    /* JADX INFO: renamed from: Z */
    @NotNull
    public static final Companion f29593Z = new Companion(null);

    /* JADX INFO: compiled from: KuMexBookFragmentV2.kt */
    @Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, m90084d2 = {"Lcom/kubi/kumex/market/v2/KuMexBookFragmentV2$Companion;", "", "<init>", "()V", "instance", "Lcom/kubi/kumex/market/v2/KuMexBookFragmentV2;", "symbol", "", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @NotNull
        public final KuMexBookFragmentV2 instance(@NotNull String symbol) {
            Intrinsics.checkNotNullParameter(symbol, "symbol");
            KuMexBookFragmentV2 kuMexBookFragmentV2 = new KuMexBookFragmentV2();
            Bundle bundle = new Bundle();
            bundle.putString("symbol", symbol);
            kuMexBookFragmentV2.setArguments(bundle);
            return kuMexBookFragmentV2;
        }
    }

    /* JADX INFO: renamed from: E3 */
    private final int m34629E3() {
        return ((Number) this.f29598X.getValue()).intValue();
    }

    /* JADX INFO: renamed from: F3 */
    private final String m34630F3() {
        return (String) this.f29599Y.getValue();
    }

    /* JADX INFO: renamed from: H3 */
    public static final Unit m34631H3(KuMexBookFragmentV2 kuMexBookFragmentV2, ContractEntity contractEntity, int i11, CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<unused var>");
        C37878b0.f85252a.m85543x(i11);
        kuMexBookFragmentV2.m34670N3(i11 == 0, contractEntity);
        kuMexBookFragmentV2.m34666B3(contractEntity);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: I3 */
    private final void m34632I3() {
        C36849u1 c36849u1M34667D3;
        final ContractEntity contractEntityM99529O;
        Context context = getContext();
        if (context == null || (c36849u1M34667D3 = m34667D3()) == null || (contractEntityM99529O = InterfaceC44980d.m99529O(RepositoryServiceLocator.f19236a.m20288g(), m34630F3(), false, 2, null)) == null) {
            return;
        }
        InterfaceC38213a interfaceC38213aM84629s = C37567b.m84629s(contractEntityM99529O);
        InterfaceC41049a interfaceC41049aM90019b = C41050b.f91264a.m90019b(contractEntityM99529O);
        c36849u1M34667D3.f81122g.setAmountPrecision(interfaceC41049aM90019b.mo90017k(interfaceC38213aM84629s));
        c36849u1M34667D3.f81123h.setText(getString(R$string.qty_stub, interfaceC41049aM90019b.mo90014h(interfaceC38213aM84629s)));
        c36849u1M34667D3.f81122g.setPricePrecision(C27039d.m66650j(Integer.valueOf(C37567b.m84618h(contractEntityM99529O))));
        int iM102323e = C46392a.m102323e(C46894j.f104736a.m103269g(C27041f.m66668h(contractEntityM99529O.getSymbol())), 0);
        BaseTextView baseTextView = c36849u1M34667D3.f81130o;
        BigDecimal bigDecimalMultiply = C27039d.m66656p(contractEntityM99529O.getTickSize()).multiply(BigDecimal.TEN.pow(iM102323e));
        Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply, "multiply(...)");
        baseTextView.setText(C42180b.m92640e(bigDecimalMultiply, null, 20, false, false, false, 0, null, 125, null));
        c36849u1M34667D3.f81131p.setText(getString(R$string.price_order, contractEntityM99529O.getQuoteCurrency()));
        C37878b0 c37878b0 = C37878b0.f85252a;
        m34670N3(c37878b0.m85530k() == 0, contractEntityM99529O);
        FrameLayout amountUnit1Layout = c36849u1M34667D3.f81118c;
        Intrinsics.checkNotNullExpressionValue(amountUnit1Layout, "amountUnit1Layout");
        FrameLayout amountUnit2Layout = c36849u1M34667D3.f81120e;
        Intrinsics.checkNotNullExpressionValue(amountUnit2Layout, "amountUnit2Layout");
        C27046k.m66681D(new View[]{amountUnit1Layout, amountUnit2Layout}, new Function0() { // from class: com.kubi.kumex.market.v2.b
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return KuMexBookFragmentV2.m34633J3(this.f29694b, contractEntityM99529O);
            }
        });
        RelativeLayout precisionLayout = c36849u1M34667D3.f81129n;
        Intrinsics.checkNotNullExpressionValue(precisionLayout, "precisionLayout");
        ViewExtKt.m66575f(precisionLayout, new Function1() { // from class: com.kubi.kumex.market.v2.c
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return KuMexBookFragmentV2.m34634K3(this.f29701b, (View) obj);
            }
        });
        this.f29596V.m87444h((int) (((m34629E3() - C27025c.m66564b(context, 245.0f)) - C27025c.m66565c(context, 67)) / C27025c.m66565c(context, C13635c.m26931a())));
        this.f29596V.m87443g(new BookAmountConfig(interfaceC38213aM84629s, interfaceC41049aM90019b, c37878b0.m85530k() == 0));
        BookAdapter bookAdapter = new BookAdapter("sell");
        c36849u1M34667D3.f81132q.setEnabled(false);
        c36849u1M34667D3.f81132q.setAdapter(bookAdapter);
        c36849u1M34667D3.f81132q.setNestedScrollingEnabled(false);
        RecyclerView sellList = c36849u1M34667D3.f81132q;
        Intrinsics.checkNotNullExpressionValue(sellList, "sellList");
        ViewExKt.m36476b(sellList);
        c36849u1M34667D3.f81132q.setLayoutManager(new LinearLayoutManager(getActivity(), 1, false));
        BookAdapter bookAdapter2 = new BookAdapter("buy");
        c36849u1M34667D3.f81121f.setEnabled(false);
        c36849u1M34667D3.f81121f.setAdapter(bookAdapter2);
        c36849u1M34667D3.f81121f.setNestedScrollingEnabled(false);
        RecyclerView buyList = c36849u1M34667D3.f81121f;
        Intrinsics.checkNotNullExpressionValue(buyList, "buyList");
        ViewExKt.m36476b(buyList);
        c36849u1M34667D3.f81121f.setLayoutManager(new LinearLayoutManager(getActivity(), 1, false));
    }

    /* JADX INFO: renamed from: K3 */
    public static final Unit m34634K3(KuMexBookFragmentV2 kuMexBookFragmentV2, View it) {
        Intrinsics.checkNotNullParameter(it, "it");
        kuMexBookFragmentV2.m34636O3();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: O3 */
    private final void m34636O3() {
        ContractEntity contractEntityM99529O = InterfaceC44980d.m99529O(RepositoryServiceLocator.f19236a.m20288g(), m34630F3(), false, 2, null);
        if (contractEntityM99529O == null) {
            return;
        }
        BigDecimal bigDecimalM66656p = C27039d.m66656p(contractEntityM99529O.getTickSize());
        int iM102323e = C46392a.m102323e(C46894j.f104736a.m103269g(m34630F3()), 0);
        final ArrayList arrayList = new ArrayList();
        int i11 = 0;
        while (i11 < 4) {
            BigDecimal bigDecimalMultiply = bigDecimalM66656p.multiply(BigDecimal.TEN.pow(i11));
            Intrinsics.checkNotNull(bigDecimalMultiply);
            arrayList.add(new SelectEntity(null, C42180b.m92640e(bigDecimalMultiply, null, 20, false, false, false, 0, null, 125, null), String.valueOf(i11), null, null, null, null, null, null, false, iM102323e == i11, null, 3065, null));
            i11++;
        }
        DialogFragmentHelper dialogFragmentHelperM58944B = BottomSheetDialogHelper.m58944B(BottomSheetDialogHelper.f48599a, arrayList, new BiConsumer() { // from class: com.kubi.kumex.market.v2.f
            @Override // io.reactivex.functions.BiConsumer
            public final void accept(Object obj, Object obj2) {
                KuMexBookFragmentV2.m34637P3(arrayList, this, (BaseViewHolder) obj, (BottomSheetDialogHelper.InterfaceC24339a) obj2);
            }
        }, false, null, null, false, 60, null);
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        dialogFragmentHelperM58944B.show(childFragmentManager, "BookPrecisionDialog");
    }

    /* JADX INFO: renamed from: Q3 */
    private final void m34638Q3() {
        g gVar = g.a;
        RepositoryServiceLocator repositoryServiceLocator = RepositoryServiceLocator.f19236a;
        if (gVar.o(InterfaceC44980d.m99529O(repositoryServiceLocator.m20288g(), m34630F3(), false, 2, null))) {
            BaseFragment.showEmptyView$default(this, R$string.asserts_no_record, 0, (View.OnClickListener) null, 6, (Object) null);
            return;
        }
        Observable<BookEntity> observableSubscribeOn = repositoryServiceLocator.m20286e().mo24801a(m34630F3(), (int) Math.pow(10.0d, C46392a.m102323e(C46894j.f104736a.m103269g(C27041f.m66668h(m34630F3())), 0))).subscribeOn(C42916f.m94127f());
        final Function1 function1 = new Function1() { // from class: com.kubi.kumex.market.v2.a
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return KuMexBookFragmentV2.m34646Y3(this.f29688b, (BookEntity) obj);
            }
        };
        Observable<BookEntity> observableDoOnNext = observableSubscribeOn.doOnNext(new Consumer() { // from class: com.kubi.kumex.market.v2.g
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                KuMexBookFragmentV2.m34647Z3(function1, obj);
            }
        });
        final Function1 function2 = new Function1() { // from class: com.kubi.kumex.market.v2.h
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return KuMexBookFragmentV2.m34639R3(this.f29791b, (BookEntity) obj);
            }
        };
        Observable observableObserveOn = observableDoOnNext.map(new Function() { // from class: com.kubi.kumex.market.v2.i
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return KuMexBookFragmentV2.m34640S3(function2, obj);
            }
        }).observeOn(C42916f.m94128g());
        final Function1 function3 = new Function1() { // from class: com.kubi.kumex.market.v2.j
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return KuMexBookFragmentV2.m34641T3(this.f29802b, (BookEntity) obj);
            }
        };
        Consumer consumer = new Consumer() { // from class: com.kubi.kumex.market.v2.k
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                KuMexBookFragmentV2.m34642U3(function3, obj);
            }
        };
        final Function1 function4 = new Function1() { // from class: com.kubi.kumex.market.v2.l
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return KuMexBookFragmentV2.m34643V3(this.f29810b, (Throwable) obj);
            }
        };
        Disposable disposableSubscribe = observableObserveOn.subscribe(consumer, new Consumer() { // from class: com.kubi.kumex.market.v2.m
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                KuMexBookFragmentV2.m34645X3(function4, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
        DisposableKt.addTo(disposableSubscribe, getVisibleDisposable());
    }

    /* JADX INFO: renamed from: R3 */
    public static final BookEntity m34639R3(KuMexBookFragmentV2 kuMexBookFragmentV2, BookEntity it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return kuMexBookFragmentV2.f29596V.m87446j(it);
    }

    /* JADX INFO: renamed from: S3 */
    public static final BookEntity m34640S3(Function1 function1, Object p11) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        return (BookEntity) function1.invoke(p11);
    }

    /* JADX INFO: renamed from: Y3 */
    public static final Unit m34646Y3(KuMexBookFragmentV2 kuMexBookFragmentV2, BookEntity bookEntity) {
        DisplayBook displayBookM87445i = kuMexBookFragmentV2.f29596V.m87445i(bookEntity);
        if (displayBookM87445i != null) {
            kuMexBookFragmentV2.f29597W.mo90855d(displayBookM87445i);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: D3 */
    public final C36849u1 m34667D3() {
        return (C36849u1) this.f29595U.getValue(this, f29594a0[0]);
    }

    /* JADX INFO: renamed from: G3 */
    public final void m34668G3(final ContractEntity contractEntity) {
        BaseDialogFragment baseDialogFragmentM33705x = C15943u.m33705x(C37878b0.f85252a.m85530k(), ArraysKt.toList(C27017c.f54310a.m66517g(R$array.kucoin_all_or_single)), new Function2() { // from class: com.kubi.kumex.market.v2.d
            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return KuMexBookFragmentV2.m34631H3(this.f29765b, contractEntity, ((Integer) obj).intValue(), (CharSequence) obj2);
            }
        });
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        baseDialogFragmentM33705x.show(childFragmentManager, "amount_unit_dialog");
    }

    @Override // com.kubi.sdk.BaseFragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable Bundle savedInstanceState, @Nullable ViewGroup container) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View viewInflate = inflater.inflate(R$layout.bkumex_fragment_book, (ViewGroup) null);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
        return viewInflate;
    }

    @Override // com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        LoadingViewUtils.f48255a.m58509b(this);
        m34632I3();
        BaseFragment.showLoadingView$default(this, 0, 0, 3, null);
    }

    /* JADX INFO: renamed from: C3 */
    public static final int m34628C3(KuMexBookFragmentV2 kuMexBookFragmentV2) {
        int iM66602e;
        Context context = kuMexBookFragmentV2.getContext();
        if (context != null) {
            iM66602e = (int) C27025c.m66564b(context, 172.0f);
        } else {
            iM66602e = C27029c.m66602e(kuMexBookFragmentV2, 172.0f);
        }
        return (C5267e0.m6182d() - IKuFacadeService.f27711a.get().mo31927f()) - iM66602e;
    }

    /* JADX INFO: renamed from: J3 */
    public static final Unit m34633J3(KuMexBookFragmentV2 kuMexBookFragmentV2, ContractEntity contractEntity) {
        kuMexBookFragmentV2.m34668G3(contractEntity);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: L3 */
    private final void m34635L3() {
        C41696j.m91104d(LifecycleOwnerKt.getLifecycleScope(this), null, null, new KuMexBookFragmentV2$initObserver$1(this, null), 3, null);
    }

    /* JADX INFO: renamed from: P3 */
    public static final void m34637P3(List list, KuMexBookFragmentV2 kuMexBookFragmentV2, BaseViewHolder baseViewHolder, BottomSheetDialogHelper.InterfaceC24339a interfaceC24339a) {
        BaseTextView baseTextView;
        int bindingAdapterPosition = baseViewHolder.getBindingAdapterPosition();
        if (bindingAdapterPosition >= 0 && bindingAdapterPosition < list.size()) {
            kuMexBookFragmentV2.getVisibleDisposable().clear();
            C46392a.m102329l(C46894j.f104736a.m103269g(kuMexBookFragmentV2.m34630F3()), DowngradeExKt.m66542l(interfaceC24339a.getValue(), 0));
            C36849u1 c36849u1M34667D3 = kuMexBookFragmentV2.m34667D3();
            if (c36849u1M34667D3 != null && (baseTextView = c36849u1M34667D3.f81130o) != null) {
                baseTextView.setText(interfaceC24339a.getLabel());
            }
            kuMexBookFragmentV2.m34638Q3();
        }
    }

    /* JADX INFO: renamed from: T3 */
    public static final Unit m34641T3(KuMexBookFragmentV2 kuMexBookFragmentV2, BookEntity bookEntity) {
        KuCoinDepthView kuCoinDepthView;
        kuMexBookFragmentV2.showContentView();
        C36849u1 c36849u1M34667D3 = kuMexBookFragmentV2.m34667D3();
        if (c36849u1M34667D3 != null && (kuCoinDepthView = c36849u1M34667D3.f81122g) != null) {
            kuCoinDepthView.m55108d(bookEntity.getBids(), bookEntity.getAsks());
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: U3 */
    public static final void m34642U3(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: V3 */
    public static final Unit m34643V3(final KuMexBookFragmentV2 kuMexBookFragmentV2, Throwable th2) {
        Intrinsics.checkNotNull(th2);
        C19331c.m42836c(th2, null, 2, null);
        BaseFragment.showFailView$default(kuMexBookFragmentV2, 0, 0, new View.OnClickListener() { // from class: com.kubi.kumex.market.v2.e
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                KuMexBookFragmentV2.m34644W3(this.f29775b, view);
            }
        }, 3, (Object) null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: W3 */
    public static final void m34644W3(KuMexBookFragmentV2 kuMexBookFragmentV2, View view) {
        kuMexBookFragmentV2.getVisibleDisposable().clear();
        kuMexBookFragmentV2.m34638Q3();
    }

    /* JADX INFO: renamed from: X3 */
    public static final void m34645X3(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: Z3 */
    public static final void m34647Z3(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: a4 */
    public static final String m34648a4(KuMexBookFragmentV2 kuMexBookFragmentV2) {
        String strM56284y;
        Bundle arguments = kuMexBookFragmentV2.getArguments();
        if (arguments != null && (strM56284y = RouteExKt.m56284y(arguments, "symbol")) != null) {
            return strM56284y;
        }
        return C46527h0.f104291a.m102677L();
    }

    /* JADX INFO: renamed from: B3 */
    public final void m34666B3(ContractEntity contractEntity) {
        C41696j.m91104d(LifecycleOwnerKt.getLifecycleScope(this), C42911a.m94119a().plus(C37213a.m83252b(getTAG() + "changeBookAmountConfig", false, 2, null)), null, new KuMexBookFragmentV2$changeBookAmountConfig$1(contractEntity, this, null), 2, null);
    }

    /* JADX INFO: renamed from: M3 */
    public final void m34669M3(DisplayBook displayBook) {
        BookAdapter bookAdapter;
        C36849u1 c36849u1M34667D3 = m34667D3();
        if (c36849u1M34667D3 != null) {
            RecyclerView.Adapter adapter = c36849u1M34667D3.f81121f.getAdapter();
            BookAdapter bookAdapter2 = null;
            if (adapter instanceof BookAdapter) {
                bookAdapter = (BookAdapter) adapter;
            } else {
                bookAdapter = null;
            }
            if (bookAdapter != null) {
                bookAdapter.m26926h(displayBook.m87451b());
            }
            RecyclerView.Adapter adapter2 = c36849u1M34667D3.f81132q.getAdapter();
            if (adapter2 instanceof BookAdapter) {
                bookAdapter2 = (BookAdapter) adapter2;
            }
            if (bookAdapter2 != null) {
                bookAdapter2.m26926h(displayBook.m87450a());
            }
        }
    }

    /* JADX INFO: renamed from: N3 */
    public final void m34670N3(boolean z11, ContractEntity contractEntity) {
        BaseTextView baseTextView;
        int i11;
        BaseTextView baseTextView2;
        int i12;
        InterfaceC38213a interfaceC38213aM84629s = C37567b.m84629s(contractEntity);
        InterfaceC41049a interfaceC41049aM90019b = C41050b.f91264a.m90019b(contractEntity);
        C36849u1 c36849u1M34667D3 = m34667D3();
        if (c36849u1M34667D3 != null && (baseTextView2 = c36849u1M34667D3.f81117b) != null) {
            if (z11) {
                i12 = R$string.total_stub;
            } else {
                i12 = R$string.qty_stub;
            }
            baseTextView2.setText(getString(i12, interfaceC41049aM90019b.mo90014h(interfaceC38213aM84629s)));
        }
        C36849u1 c36849u1M34667D4 = m34667D3();
        if (c36849u1M34667D4 != null && (baseTextView = c36849u1M34667D4.f81119d) != null) {
            if (z11) {
                i11 = R$string.total_stub;
            } else {
                i11 = R$string.qty_stub;
            }
            baseTextView.setText(getString(i11, interfaceC41049aM90019b.mo90014h(interfaceC38213aM84629s)));
        }
    }

    @Override // com.kubi.sdk.BaseFragment
    public void onLoad() {
        super.onLoad();
        m34635L3();
    }

    @Override // com.kubi.sdk.BaseFragment
    public void onShow() {
        super.onShow();
        m34638Q3();
    }
}
