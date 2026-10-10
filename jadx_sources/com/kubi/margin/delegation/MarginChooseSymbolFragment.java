package com.kubi.margin.delegation;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.kubi.data.entity.SymbolInfoEntity;
import com.kubi.data.entity.TradeItemBean;
import com.kubi.margin.R$layout;
import com.kubi.margin.entity.MarginSymbol;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.sdk.base.p113ui.OldBaseFragment;
import com.kubi.sdk.util.C24217a1;
import com.kubi.sdk.util.C24223c1;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.utils.extensions.C27024b;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27046k;
import com.tencent.qcloud.tuicore.TUIConstants;
import io.chad.library.adapter.base.BaseQuickAdapter;
import io.chad.library.adapter.base.BaseViewHolder;
import io.reactivex.Observable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Predicate;
import io.reactivex.rxkotlin.DisposableKt;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import mr.C42597a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p011a9.C0206f;
import p206dp.C36914g0;
import p752x8.AbstractC46099a;
import p768xo.InterfaceC46305f;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.comparisons.ComparisonsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KProperty;
import p852kotlin.text.StringsKt;
import w00.C45681e;

/* JADX INFO: compiled from: MarginChooseSymbolFragment.kt */
/* JADX INFO: loaded from: classes27.dex */
@Metadata(m90083d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\n\u001a\u00020\u000bH\u0014J\u001a\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010$H\u0017J\u0010\u0010%\u001a\u00020 2\u0006\u0010&\u001a\u00020'H\u0002R\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001e\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\u000e0\rj\b\u0012\u0004\u0012\u00020\u000e`\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\u000e0\rj\b\u0012\u0004\u0012\u00020\u000e`\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00130\u0012X\u0082.¢\u0006\u0002\n\u0000R\u001b\u0010\u0014\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0015\u0010\u0016R#\u0010\u0019\u001a\n \u001b*\u0004\u0018\u00010\u001a0\u001a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u0018\u001a\u0004\b\u001c\u0010\u001d¨\u0006("}, m90084d2 = {"Lcom/kubi/margin/delegation/MarginChooseSymbolFragment;", "Lcom/kubi/sdk/base/ui/OldBaseFragment;", "<init>", "()V", "bmarginFragmentSearchSymbolBinding", "Lcom/kubi/margin/databinding/BmarginFragmentSearchSymbolBinding;", "getBmarginFragmentSearchSymbolBinding", "()Lcom/kubi/margin/databinding/BmarginFragmentSearchSymbolBinding;", "bmarginFragmentSearchSymbolBinding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "getLayout", "", "srcData", "Ljava/util/ArrayList;", "Lcom/kubi/data/entity/TradeItemBean;", "Lkotlin/collections/ArrayList;", "disPlay", "value", "Lio/chad/library/adapter/base/BaseQuickAdapter;", "Lio/chad/library/adapter/base/BaseViewHolder;", "tradeType", "getTradeType", "()I", "tradeType$delegate", "Lkotlin/Lazy;", "marginApi", "Lcom/kubi/margin/api/MarginApi;", "kotlin.jvm.PlatformType", "getMarginApi", "()Lcom/kubi/margin/api/MarginApi;", "marginApi$delegate", "onViewCreated", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "doSearch", "toString", "", "MarginLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nMarginChooseSymbolFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MarginChooseSymbolFragment.kt\ncom/kubi/margin/delegation/MarginChooseSymbolFragment\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,162:1\n147#2,16:163\n1869#3:179\n774#3:180\n865#3,2:181\n1563#3:183\n1634#3,3:184\n1870#3:187\n*S KotlinDebug\n*F\n+ 1 MarginChooseSymbolFragment.kt\ncom/kubi/margin/delegation/MarginChooseSymbolFragment\n*L\n41#1:163,16\n109#1:179\n110#1:180\n110#1:181,2\n116#1:183\n116#1:184,3\n109#1:187\n*E\n"})
public final class MarginChooseSymbolFragment extends OldBaseFragment {

    /* JADX INFO: renamed from: a0 */
    public static final /* synthetic */ KProperty<Object>[] f32806a0 = {Reflection.property1(new PropertyReference1Impl(MarginChooseSymbolFragment.class, "bmarginFragmentSearchSymbolBinding", "getBmarginFragmentSearchSymbolBinding()Lcom/kubi/margin/databinding/BmarginFragmentSearchSymbolBinding;", 0))};

    /* JADX INFO: renamed from: X */
    public BaseQuickAdapter<TradeItemBean, BaseViewHolder> f32810X;

    /* JADX INFO: renamed from: U */
    @NotNull
    public final InterfaceC24293a f32807U = C45681e.m100799e(this, new Function1<MarginChooseSymbolFragment, C36914g0>() { // from class: com.kubi.margin.delegation.MarginChooseSymbolFragment$special$$inlined$viewBindingFragment$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C36914g0 invoke(@NotNull MarginChooseSymbolFragment fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C36914g0.m82697a(this.this$0.getContentView());
        }

        {
            super(1);
        }
    }, new Function1<C36914g0, Unit>() { // from class: com.kubi.margin.delegation.MarginChooseSymbolFragment$special$$inlined$viewBindingFragment$1
        public final void invoke(@NotNull C36914g0 it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C36914g0 c36914g0) {
            invoke(c36914g0);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: V */
    @NotNull
    public final ArrayList<TradeItemBean> f32808V = new ArrayList<>();

    /* JADX INFO: renamed from: W */
    @NotNull
    public final ArrayList<TradeItemBean> f32809W = new ArrayList<>();

    /* JADX INFO: renamed from: Y */
    @NotNull
    public final Lazy f32811Y = LazyKt.lazy(new Function0() { // from class: com.kubi.margin.delegation.g
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Integer.valueOf(MarginChooseSymbolFragment.m38004I3(this.f32908b));
        }
    });

    /* JADX INFO: renamed from: Z */
    @NotNull
    public final Lazy f32812Z = LazyKt.lazy(new Function0() { // from class: com.kubi.margin.delegation.h
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return MarginChooseSymbolFragment.m37998C3();
        }
    });

    /* JADX INFO: renamed from: com.kubi.margin.delegation.MarginChooseSymbolFragment$a */
    /* JADX INFO: compiled from: Comparisons.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 MarginChooseSymbolFragment.kt\ncom/kubi/margin/delegation/MarginChooseSymbolFragment\n*L\n1#1,328:1\n147#2,9:329\n*E\n"})
    public static final class C17493a<T> implements Comparator {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f32813b;

        public C17493a(String str) {
            this.f32813b = str;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t11, T t12) {
            Integer num;
            TradeItemBean tradeItemBean = (TradeItemBean) t11;
            String baseCurrencyName = tradeItemBean.getSymbolInfoEntity().getBaseCurrencyName();
            Intrinsics.checkNotNullExpressionValue(baseCurrencyName, "getBaseCurrencyName(...)");
            String string = StringsKt.trim((CharSequence) this.f32813b).toString();
            Locale locale = Locale.ROOT;
            String upperCase = string.toUpperCase(locale);
            Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
            Integer num2 = 0;
            if (StringsKt.contains$default((CharSequence) baseCurrencyName, (CharSequence) upperCase, false, 2, (Object) null)) {
                num = -1;
            } else {
                String quoteCurrencyName = tradeItemBean.getSymbolInfoEntity().getQuoteCurrencyName();
                Intrinsics.checkNotNullExpressionValue(quoteCurrencyName, "getQuoteCurrencyName(...)");
                String upperCase2 = StringsKt.trim((CharSequence) this.f32813b).toString().toUpperCase(locale);
                Intrinsics.checkNotNullExpressionValue(upperCase2, "toUpperCase(...)");
                num = StringsKt.contains$default((CharSequence) quoteCurrencyName, (CharSequence) upperCase2, false, 2, (Object) null) ? 1 : num2;
            }
            TradeItemBean tradeItemBean2 = (TradeItemBean) t12;
            String baseCurrencyName2 = tradeItemBean2.getSymbolInfoEntity().getBaseCurrencyName();
            Intrinsics.checkNotNullExpressionValue(baseCurrencyName2, "getBaseCurrencyName(...)");
            String upperCase3 = StringsKt.trim((CharSequence) this.f32813b).toString().toUpperCase(locale);
            Intrinsics.checkNotNullExpressionValue(upperCase3, "toUpperCase(...)");
            if (StringsKt.contains$default((CharSequence) baseCurrencyName2, (CharSequence) upperCase3, false, 2, (Object) null)) {
                num2 = -1;
            } else {
                String quoteCurrencyName2 = tradeItemBean2.getSymbolInfoEntity().getQuoteCurrencyName();
                Intrinsics.checkNotNullExpressionValue(quoteCurrencyName2, "getQuoteCurrencyName(...)");
                String upperCase4 = StringsKt.trim((CharSequence) this.f32813b).toString().toUpperCase(locale);
                Intrinsics.checkNotNullExpressionValue(upperCase4, "toUpperCase(...)");
                if (StringsKt.contains$default((CharSequence) quoteCurrencyName2, (CharSequence) upperCase4, false, 2, (Object) null)) {
                    num2 = 1;
                }
            }
            return ComparisonsKt.compareValues(num, num2);
        }
    }

    /* JADX INFO: renamed from: G3 */
    public static final Unit m38002G3(C36914g0 c36914g0, MarginChooseSymbolFragment marginChooseSymbolFragment) {
        TradeItemBean tradeItemBean = new TradeItemBean();
        tradeItemBean.setShowSymbol(c36914g0.f81714d.getText().toString());
        FragmentActivity activity = marginChooseSymbolFragment.getActivity();
        if (activity != null) {
            activity.setResult(-1, new Intent().putExtra("data", tradeItemBean));
        }
        FragmentActivity activity2 = marginChooseSymbolFragment.getActivity();
        if (activity2 != null) {
            activity2.finish();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: H3 */
    public static final void m38003H3(MarginChooseSymbolFragment marginChooseSymbolFragment, List list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            List listM66560c = C27024b.m66560c(((MarginSymbol) it.next()).getValue());
            ArrayList<SymbolInfoEntity> arrayList2 = new ArrayList();
            for (Object obj : listM66560c) {
                SymbolInfoEntity symbolInfoEntity = (SymbolInfoEntity) obj;
                if (marginChooseSymbolFragment.getTradeType() == 1 ? symbolInfoEntity.isMarginEnabled() : symbolInfoEntity.isIsolatedMarginEnabled()) {
                    arrayList2.add(obj);
                }
            }
            ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList2, 10));
            for (SymbolInfoEntity symbolInfoEntity2 : arrayList2) {
                TradeItemBean tradeItemBean = new TradeItemBean();
                tradeItemBean.setSymbol(symbolInfoEntity2.getSymbol());
                tradeItemBean.setShowSymbol(symbolInfoEntity2.getShowSymbol());
                arrayList3.add(tradeItemBean);
            }
            arrayList.addAll(arrayList3);
        }
        marginChooseSymbolFragment.f32808V.addAll(arrayList);
        marginChooseSymbolFragment.f32809W.addAll(arrayList);
        BaseQuickAdapter<TradeItemBean, BaseViewHolder> baseQuickAdapter = marginChooseSymbolFragment.f32810X;
        if (baseQuickAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("value");
            baseQuickAdapter = null;
        }
        baseQuickAdapter.replaceData(marginChooseSymbolFragment.f32809W);
    }

    private final int getTradeType() {
        return ((Number) this.f32811Y.getValue()).intValue();
    }

    /* JADX INFO: renamed from: w3 */
    public static final boolean m38016w3(String str, TradeItemBean it) {
        Intrinsics.checkNotNullParameter(it, "it");
        String showSymbol = it.getShowSymbol();
        Intrinsics.checkNotNullExpressionValue(showSymbol, "getShowSymbol(...)");
        Locale ENGLISH = Locale.ENGLISH;
        Intrinsics.checkNotNullExpressionValue(ENGLISH, "ENGLISH");
        String upperCase = showSymbol.toUpperCase(ENGLISH);
        Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
        String upperCase2 = str.toUpperCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(upperCase2, "toUpperCase(...)");
        return StringsKt.contains$default((CharSequence) upperCase, (CharSequence) upperCase2, false, 2, (Object) null);
    }

    /* JADX INFO: renamed from: x3 */
    public static final boolean m38017x3(Function1 function1, Object p11) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        return ((Boolean) function1.invoke(p11)).booleanValue();
    }

    /* JADX INFO: renamed from: y3 */
    public static final Unit m38018y3(MarginChooseSymbolFragment marginChooseSymbolFragment, String str, List list) {
        marginChooseSymbolFragment.f32809W.clear();
        ArrayList<TradeItemBean> arrayList = marginChooseSymbolFragment.f32809W;
        Intrinsics.checkNotNull(list);
        arrayList.addAll(CollectionsKt.sortedWith(list, new C17493a(str)));
        BaseQuickAdapter<TradeItemBean, BaseViewHolder> baseQuickAdapter = marginChooseSymbolFragment.f32810X;
        if (baseQuickAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("value");
            baseQuickAdapter = null;
        }
        baseQuickAdapter.replaceData(marginChooseSymbolFragment.f32809W);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: A3 */
    public final C36914g0 m38020A3() {
        return (C36914g0) this.f32807U.getValue(this, f32806a0[0]);
    }

    /* JADX INFO: renamed from: B3 */
    public final InterfaceC46305f m38021B3() {
        return (InterfaceC46305f) this.f32812Z.getValue();
    }

    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment
    public int getLayout() {
        return R$layout.bmargin_fragment_search_symbol;
    }

    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment, com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    @SuppressLint({"CheckResult"})
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        final C36914g0 c36914g0M38020A3 = m38020A3();
        if (c36914g0M38020A3 != null) {
            BaseTextView tvClose = c36914g0M38020A3.f81715e;
            Intrinsics.checkNotNullExpressionValue(tvClose, "tvClose");
            C27046k.m66711z(tvClose, 0L, new Function0() { // from class: com.kubi.margin.delegation.a
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return MarginChooseSymbolFragment.m38001F3(this.f32843b);
                }
            }, 1, null);
            BaseTextView tvChoose = c36914g0M38020A3.f81714d;
            Intrinsics.checkNotNullExpressionValue(tvChoose, "tvChoose");
            C27046k.m66711z(tvChoose, 0L, new Function0() { // from class: com.kubi.margin.delegation.c
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return MarginChooseSymbolFragment.m38002G3(c36914g0M38020A3, this);
                }
            }, 1, null);
            c36914g0M38020A3.f81713c.setLayoutManager(new LinearLayoutManager(this.mContext));
            MarginChooseSymbolFragment$onViewCreated$1$3 marginChooseSymbolFragment$onViewCreated$1$3 = new MarginChooseSymbolFragment$onViewCreated$1$3(this, R$layout.kucoin_item_simple_textview, this.f32809W);
            this.f32810X = marginChooseSymbolFragment$onViewCreated$1$3;
            c36914g0M38020A3.f81713c.setAdapter(marginChooseSymbolFragment$onViewCreated$1$3);
            Disposable disposableSubscribe = m38021B3().m102097h().compose(C24217a1.m58389m()).subscribe(new Consumer() { // from class: com.kubi.margin.delegation.d
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    MarginChooseSymbolFragment.m38003H3(this.f32902b, (List) obj);
                }
            }, new C24223c1(this));
            Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
            DisposableKt.addTo(disposableSubscribe, getDestroyDisposable());
            AbstractC46099a<CharSequence> abstractC46099aM784d = C0206f.m784d(c36914g0M38020A3.f81712b);
            final Function1 function1 = new Function1() { // from class: com.kubi.margin.delegation.e
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return MarginChooseSymbolFragment.m37999D3(this.f32904b, (CharSequence) obj);
                }
            };
            abstractC46099aM784d.subscribe(new Consumer() { // from class: com.kubi.margin.delegation.f
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    MarginChooseSymbolFragment.m38000E3(function1, obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: C3 */
    public static final InterfaceC46305f m37998C3() {
        return (InterfaceC46305f) C42597a.m93386b().create(InterfaceC46305f.class);
    }

    /* JADX INFO: renamed from: D3 */
    public static final Unit m37999D3(MarginChooseSymbolFragment marginChooseSymbolFragment, CharSequence charSequence) {
        marginChooseSymbolFragment.m38022v3(charSequence.toString());
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: E3 */
    public static final void m38000E3(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: F3 */
    public static final Unit m38001F3(MarginChooseSymbolFragment marginChooseSymbolFragment) {
        marginChooseSymbolFragment.preformBackPressed();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: I3 */
    public static final int m38004I3(MarginChooseSymbolFragment marginChooseSymbolFragment) {
        Integer numValueOf;
        Intent intent;
        FragmentActivity activity = marginChooseSymbolFragment.getActivity();
        if (activity != null && (intent = activity.getIntent()) != null) {
            numValueOf = Integer.valueOf(intent.getIntExtra("tradeType", 1));
        } else {
            numValueOf = null;
        }
        return C27039d.m66651k(numValueOf, 1);
    }

    /* JADX INFO: renamed from: z3 */
    public static final void m38019z3(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: v3 */
    public final void m38022v3(final String str) {
        if (TextUtils.isEmpty(str)) {
            this.f32809W.clear();
            this.f32809W.addAll(this.f32808V);
            BaseQuickAdapter<TradeItemBean, BaseViewHolder> baseQuickAdapter = this.f32810X;
            if (baseQuickAdapter == null) {
                Intrinsics.throwUninitializedPropertyAccessException("value");
                baseQuickAdapter = null;
            }
            baseQuickAdapter.replaceData(this.f32809W);
            return;
        }
        Observable observableFromIterable = Observable.fromIterable(this.f32808V);
        final Function1 function1 = new Function1() { // from class: com.kubi.margin.delegation.i
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(MarginChooseSymbolFragment.m38016w3(str, (TradeItemBean) obj));
            }
        };
        Observable observable = observableFromIterable.filter(new Predicate() { // from class: com.kubi.margin.delegation.j
            @Override // io.reactivex.functions.Predicate
            public final boolean test(Object obj) {
                return MarginChooseSymbolFragment.m38017x3(function1, obj);
            }
        }).toList().toObservable();
        final Function1 function2 = new Function1() { // from class: com.kubi.margin.delegation.k
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MarginChooseSymbolFragment.m38018y3(this.f32933b, str, (List) obj);
            }
        };
        addSubscription(observable.subscribe(new Consumer() { // from class: com.kubi.margin.delegation.b
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                MarginChooseSymbolFragment.m38019z3(function2, obj);
            }
        }));
    }
}
