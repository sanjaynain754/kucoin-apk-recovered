package com.kubi.payment.channel.fiat;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.RecyclerView;
import com.blankj.utilcode.util.C5267e0;
import com.kubi.otc.R$drawable;
import com.kubi.otc.R$id;
import com.kubi.otc.R$layout;
import com.kubi.otc.R$string;
import com.kubi.payment.channel.base.OldBaseChannelFragment;
import com.kubi.payment.channel.data.entities.FiatInfoEntity;
import com.kubi.payment.track.IPaymentTrack;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.NavigationBar;
import com.kubi.sdk.InitLoadView;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.sdk.widget.loading.WrapperLoadingView;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27040e;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.core.ViewExtKt;
import f00.C37304a;
import g00.InterfaceC37758j;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.rxkotlin.DisposableKt;
import java.util.List;
import k10.InterfaceC40863a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p011a9.C0206f;
import p270ft.C37596b;
import p569qq.C43852m;
import p752x8.AbstractC46099a;
import p852kotlin.Function;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.FunctionAdapter;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Ref;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KClass;
import p852kotlin.reflect.KProperty;
import ro.C44128b;
import w00.C45681e;

/* JADX INFO: compiled from: SearchFiatFragment.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0010\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000e\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00020\"H\u0016J\b\u0010#\u001a\u00020$H\u0016J\b\u0010%\u001a\u00020$H\u0002J\b\u0010&\u001a\u00020'H\u0014J\b\u0010(\u001a\u00020$H\u0014J(\u0010)\u001a\u00020$2\u0006\u0010*\u001a\u00020'2\u000e\u0010+\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010-0,2\u0006\u0010.\u001a\u00020/H\u0002J\u0010\u00100\u001a\u00020$2\u0006\u00101\u001a\u00020-H\u0002J\u000e\u00102\u001a\u00020$2\u0006\u00103\u001a\u00020\u000bJ\b\u00104\u001a\u00020$H\u0002R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0005\u0010\u0007R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\t\u001a\u0004\b\f\u0010\rR\u001b\u0010\u000f\u001a\u00020\u00108BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\t\u001a\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0014\u001a\u0004\u0018\u00010\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\t\u001a\u0004\b\u0016\u0010\u0017R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u0082\u000e¢\u0006\u0002\n\u0000R\u001d\u0010\u001b\u001a\u0004\u0018\u00010\u001c8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001d\u0010\u001e¨\u00065"}, m90084d2 = {"Lcom/kubi/payment/channel/fiat/SearchFiatFragment;", "Lcom/kubi/payment/channel/base/OldBaseChannelFragment;", "Lcom/kubi/payment/channel/fiat/SearchFiatViewModel;", "<init>", "()V", "isAdd", "", "()Z", "isAdd$delegate", "Lkotlin/Lazy;", "searchType", "", "getSearchType", "()Ljava/lang/String;", "searchType$delegate", "adapter", "com/kubi/payment/channel/fiat/SearchFiatFragment$adapter$2$1", "getAdapter", "()Lcom/kubi/payment/channel/fiat/SearchFiatFragment$adapter$2$1;", "adapter$delegate", "loadingView", "Lcom/kubi/sdk/widget/loading/ILoadingView;", "getLoadingView", "()Lcom/kubi/sdk/widget/loading/ILoadingView;", "loadingView$delegate", "headerView", "Landroid/view/View;", "binding", "Lcom/kubi/otc/databinding/BotcActivitySearchFiatBinding;", "getBinding", "()Lcom/kubi/otc/databinding/BotcActivitySearchFiatBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "viewModelClass", "Lkotlin/reflect/KClass;", "initViews", "", "initSearchView", "getLayout", "", "observeData", "setHeaderView", "itemWidth", "list", "", "Lcom/kubi/payment/channel/data/entities/FiatInfoEntity$FiatInfo;", "parentView", "Landroid/view/ViewGroup;", "jumpToPage", "item", "searchFilter", "key", "trackCheckFiats", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nSearchFiatFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SearchFiatFragment.kt\ncom/kubi/payment/channel/fiat/SearchFiatFragment\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 Strings.kt\nkotlin/text/StringsKt__StringsKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,225:1\n147#2,16:226\n1869#3,2:242\n106#4:244\n78#4,22:245\n1#5:267\n*S KotlinDebug\n*F\n+ 1 SearchFiatFragment.kt\ncom/kubi/payment/channel/fiat/SearchFiatFragment\n*L\n97#1:226,16\n171#1:242,2\n122#1:244\n122#1:245,22\n*E\n"})
public final class SearchFiatFragment extends OldBaseChannelFragment<SearchFiatViewModel> {

    /* JADX INFO: renamed from: b0 */
    public static final /* synthetic */ KProperty<Object>[] f38259b0 = {Reflection.property1(new PropertyReference1Impl(SearchFiatFragment.class, "binding", "getBinding()Lcom/kubi/otc/databinding/BotcActivitySearchFiatBinding;", 0))};

    /* JADX INFO: renamed from: Z */
    @Nullable
    public View f38264Z;

    /* JADX INFO: renamed from: V */
    @NotNull
    public final Lazy f38260V = LazyKt.lazy(new Function0() { // from class: com.kubi.payment.channel.fiat.a
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Boolean.valueOf(SearchFiatFragment.m45794V3(this.f38278b));
        }
    });

    /* JADX INFO: renamed from: W */
    @NotNull
    public final Lazy f38261W = LazyKt.lazy(new Function0() { // from class: com.kubi.payment.channel.fiat.e
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return SearchFiatFragment.m45798b4(this.f38284b);
        }
    });

    /* JADX INFO: renamed from: X */
    @NotNull
    public final Lazy f38262X = LazyKt.lazy(new Function0() { // from class: com.kubi.payment.channel.fiat.f
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return SearchFiatFragment.m45785J3(this.f38285b);
        }
    });

    /* JADX INFO: renamed from: Y */
    @NotNull
    public final Lazy f38263Y = LazyKt.lazy(new Function0() { // from class: com.kubi.payment.channel.fiat.g
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return SearchFiatFragment.m45795X3(this.f38286b);
        }
    });

    /* JADX INFO: renamed from: a0 */
    @NotNull
    public final InterfaceC24293a f38265a0 = C45681e.m100799e(this, new Function1<SearchFiatFragment, C37596b>() { // from class: com.kubi.payment.channel.fiat.SearchFiatFragment$special$$inlined$viewBindingFragment$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C37596b invoke(@NotNull SearchFiatFragment fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C37596b.m84776a(this.this$0.getContentView());
        }

        {
            super(1);
        }
    }, new Function1<C37596b, Unit>() { // from class: com.kubi.payment.channel.fiat.SearchFiatFragment$special$$inlined$viewBindingFragment$1
        public final void invoke(@NotNull C37596b it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C37596b c37596b) {
            invoke(c37596b);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: com.kubi.payment.channel.fiat.SearchFiatFragment$a */
    /* JADX INFO: compiled from: SearchFiatFragment.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C20328a implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Function1 f38266b;

        public C20328a(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f38266b = function;
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
            return this.f38266b;
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f38266b.invoke(obj);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    /* JADX INFO: renamed from: J3 */
    public static final SearchFiatFragment$adapter$2$1 m45785J3(SearchFiatFragment searchFiatFragment) {
        return new SearchFiatFragment$adapter$2$1(searchFiatFragment, R$layout.botc_item_fiat_view);
    }

    /* JADX INFO: renamed from: M3 */
    private final InterfaceC40863a m45786M3() {
        return (InterfaceC40863a) this.f38263Y.getValue();
    }

    /* JADX INFO: renamed from: R3 */
    public static final Unit m45790R3(Ref.BooleanRef booleanRef, SearchFiatFragment searchFiatFragment, CharSequence charSequence) {
        if (booleanRef.element) {
            String string = charSequence.toString();
            int length = string.length() - 1;
            int i11 = 0;
            boolean z11 = false;
            while (i11 <= length) {
                boolean z12 = Intrinsics.compare((int) string.charAt(!z11 ? i11 : length), 32) <= 0;
                if (z11) {
                    if (!z12) {
                        break;
                    }
                    length--;
                } else if (z12) {
                    i11++;
                } else {
                    z11 = true;
                }
            }
            searchFiatFragment.m45811a4(string.subSequence(i11, length + 1).toString());
        }
        booleanRef.element = true;
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: T3 */
    public static final Unit m45792T3(Throwable obj) {
        Intrinsics.checkNotNullParameter(obj, "obj");
        C44128b.m97264h(obj);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: U3 */
    private final boolean m45793U3() {
        return ((Boolean) this.f38260V.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: e4 */
    public static final Unit m45800e4(FiatInfoEntity.FiatInfo fiatInfo, SearchFiatFragment searchFiatFragment) {
        if (fiatInfo != null) {
            searchFiatFragment.m45810W3(fiatInfo);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: K3 */
    public final SearchFiatFragment$adapter$2$1 m45807K3() {
        return (SearchFiatFragment$adapter$2$1) this.f38262X.getValue();
    }

    /* JADX INFO: renamed from: L3 */
    public final C37596b m45808L3() {
        return (C37596b) this.f38265a0.getValue(this, f38259b0[0]);
    }

    /* JADX INFO: renamed from: N3 */
    public final String m45809N3() {
        return (String) this.f38261W.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a4 */
    public final void m45811a4(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        if (this.mContext == null || !isResumed()) {
            return;
        }
        ((SearchFiatViewModel) m45631m3()).m45835J(key);
    }

    /* JADX INFO: renamed from: c4 */
    public final void m45812c4(int i11, List<FiatInfoEntity.FiatInfo> list, ViewGroup viewGroup) {
        RecyclerView recyclerView;
        if (this.f38264Z == null) {
            this.f38264Z = LayoutInflater.from(this.mContext).inflate(R$layout.history_list_layout, viewGroup, false);
        }
        final View view = this.f38264Z;
        if (view != null) {
            View viewFindViewById = view.findViewById(R$id.delete_history);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
            C27046k.m66711z((ImageView) viewFindViewById, 0L, new Function0() { // from class: com.kubi.payment.channel.fiat.c
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return SearchFiatFragment.m45799d4(this.f38280b, view);
                }
            }, 1, null);
            View viewFindViewById2 = view.findViewById(R$id.grid_layout);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
            GridLayout gridLayout = (GridLayout) viewFindViewById2;
            gridLayout.removeAllViews();
            for (final FiatInfoEntity.FiatInfo fiatInfo : list) {
                View viewInflate = LayoutInflater.from(this.mContext).inflate(R$layout.history_list_layout_item, (ViewGroup) gridLayout, false);
                BaseTextView baseTextView = viewInflate instanceof BaseTextView ? (BaseTextView) viewInflate : null;
                if (baseTextView != null) {
                    baseTextView.setText(fiatInfo != null ? fiatInfo.getCurrency() : null);
                    ViewExtKt.m66595z(baseTextView, i11);
                    C27046k.m66711z(baseTextView, 0L, new Function0() { // from class: com.kubi.payment.channel.fiat.d
                        @Override // p852kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return SearchFiatFragment.m45800e4(fiatInfo, this);
                        }
                    }, 1, null);
                    gridLayout.addView(baseTextView);
                }
            }
            m45807K3().addHeaderView(view);
            C37596b c37596bM45808L3 = m45808L3();
            if (c37596bM45808L3 == null || (recyclerView = c37596bM45808L3.f83615d) == null) {
                return;
            }
            recyclerView.smoothScrollToPosition(0);
        }
    }

    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment
    public int getLayout() {
        return R$layout.botc_activity_search_fiat;
    }

    @Override // com.kubi.payment.base.BaseFragment
    @NotNull
    /* JADX INFO: renamed from: s3 */
    public KClass<SearchFiatViewModel> mo45635s3() {
        return Reflection.getOrCreateKotlinClass(SearchFiatViewModel.class);
    }

    public SearchFiatFragment() {
        setPageId("B7FiatList");
    }

    /* JADX INFO: renamed from: O3 */
    private final void m45787O3() {
        LinearLayout linearLayout;
        if (m45793U3()) {
            C37596b c37596bM45808L3 = m45808L3();
            if (c37596bM45808L3 != null && (linearLayout = c37596bM45808L3.f83616e) != null) {
                C27046k.m66700o(linearLayout);
                return;
            }
            return;
        }
        final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        C37596b c37596bM45808L4 = m45808L3();
        if (c37596bM45808L4 != null) {
            c37596bM45808L4.f83613b.setHint(R$string.search_coin);
            AbstractC46099a<CharSequence> abstractC46099aM784d = C0206f.m784d(c37596bM45808L4.f83613b);
            final Function1 function1 = new Function1() { // from class: com.kubi.payment.channel.fiat.j
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return SearchFiatFragment.m45790R3(booleanRef, this, (CharSequence) obj);
                }
            };
            Consumer<? super CharSequence> consumer = new Consumer() { // from class: com.kubi.payment.channel.fiat.k
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    SearchFiatFragment.m45791S3(function1, obj);
                }
            };
            final Function1 function2 = new Function1() { // from class: com.kubi.payment.channel.fiat.l
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return SearchFiatFragment.m45792T3((Throwable) obj);
                }
            };
            Disposable disposableSubscribe = abstractC46099aM784d.subscribe(consumer, new Consumer() { // from class: com.kubi.payment.channel.fiat.m
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    SearchFiatFragment.m45788P3(function2, obj);
                }
            });
            Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
            CompositeDisposable compositeDisposable = getCompositeDisposable();
            Intrinsics.checkNotNullExpressionValue(compositeDisposable, "getCompositeDisposable(...)");
            DisposableKt.addTo(disposableSubscribe, compositeDisposable);
            BaseTextView tvCloseAction = c37596bM45808L4.f83614c;
            Intrinsics.checkNotNullExpressionValue(tvCloseAction, "tvCloseAction");
            C27046k.m66711z(tvCloseAction, 0L, new Function0() { // from class: com.kubi.payment.channel.fiat.b
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return SearchFiatFragment.m45789Q3(this.f38279b);
                }
            }, 1, null);
        }
    }

    /* JADX INFO: renamed from: P3 */
    public static final void m45788P3(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: Q3 */
    public static final Unit m45789Q3(SearchFiatFragment searchFiatFragment) {
        searchFiatFragment.preformBackPressed();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: S3 */
    public static final void m45791S3(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: V3 */
    public static final boolean m45794V3(SearchFiatFragment searchFiatFragment) {
        Boolean boolValueOf;
        Bundle arguments = searchFiatFragment.getArguments();
        if (arguments != null) {
            boolValueOf = Boolean.valueOf(arguments.getBoolean("data"));
        } else {
            boolValueOf = null;
        }
        return C27025c.m66566d(boolValueOf);
    }

    /* JADX INFO: renamed from: X3 */
    public static final InitLoadView m45795X3(SearchFiatFragment searchFiatFragment) {
        C37596b c37596bM45808L3 = searchFiatFragment.m45808L3();
        if (c37596bM45808L3 != null) {
            WrapperLoadingView wrapperLoadingViewInjectView = WrapperLoadingView.injectView(c37596bM45808L3.f83615d);
            Intrinsics.checkNotNullExpressionValue(wrapperLoadingViewInjectView, "injectView(...)");
            return new InitLoadView(wrapperLoadingViewInjectView);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: Y3 */
    public static final Unit m45796Y3(SearchFiatFragment searchFiatFragment, List list) {
        searchFiatFragment.m45807K3().replaceData(list);
        if (list.isEmpty()) {
            InterfaceC40863a interfaceC40863aM45786M3 = searchFiatFragment.m45786M3();
            if (interfaceC40863aM45786M3 != null) {
                interfaceC40863aM45786M3.showEmpty(R$string.no_more_data, R$drawable.ic2_common_empty, (View.OnClickListener) null);
            }
            if (searchFiatFragment.isCurrentlyVisible && !((SearchFiatViewModel) searchFiatFragment.m45631m3()).getF38272a0()) {
                searchFiatFragment.m45813f4();
            }
        } else {
            InterfaceC40863a interfaceC40863aM45786M4 = searchFiatFragment.m45786M3();
            if (interfaceC40863aM45786M4 != null) {
                interfaceC40863aM45786M4.showContent();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: Z3 */
    public static final Unit m45797Z3(SearchFiatFragment searchFiatFragment, int i11, List list) {
        C37596b c37596bM45808L3 = searchFiatFragment.m45808L3();
        if (c37596bM45808L3 != null) {
            Intrinsics.checkNotNull(list);
            if (!list.isEmpty()) {
                RecyclerView viewFiatRecycler = c37596bM45808L3.f83615d;
                Intrinsics.checkNotNullExpressionValue(viewFiatRecycler, "viewFiatRecycler");
                searchFiatFragment.m45812c4(i11, list, viewFiatRecycler);
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: b4 */
    public static final String m45798b4(SearchFiatFragment searchFiatFragment) {
        String string;
        Bundle arguments = searchFiatFragment.getArguments();
        if (arguments != null) {
            string = arguments.getString("type");
        } else {
            string = null;
        }
        return C27041f.m66668h(string);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: d4 */
    public static final Unit m45799d4(SearchFiatFragment searchFiatFragment, View view) {
        ((SearchFiatViewModel) searchFiatFragment.m45631m3()).m45827B(searchFiatFragment.m45809N3());
        searchFiatFragment.m45807K3().removeHeaderView(view);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: W3 */
    public final void m45810W3(FiatInfoEntity.FiatInfo fiatInfo) {
        if (Intrinsics.areEqual(m45809N3(), "fiat_withdraw")) {
            InterfaceC37758j.a.m85159h(C37304a.f82764a, fiatInfo.getCurrency(), null, null, null, null, 30, null);
        } else {
            InterfaceC37758j.a.m85157f(C37304a.f82764a, fiatInfo.getCurrency(), null, C43852m.m96602n("B7FiatList", "fiatSelector", null, 4, null), null, null, 26, null);
        }
        ((SearchFiatViewModel) m45631m3()).m45826A(fiatInfo, m45809N3());
        preformBackPressed();
    }

    /* JADX INFO: renamed from: f4 */
    public final void m45813f4() {
        if (Intrinsics.areEqual(m45809N3(), "fiat_deposit")) {
            IPaymentTrack.m49794e(IPaymentTrack.f40346a.getTrack(), "CHECK_FIATS", false, "-10000:CHECK_FIATS", null, 10, null);
        } else {
            IPaymentTrack.m49795f(IPaymentTrack.f40346a.getTrack(), "CHECK_FIATS", false, "-10000:CHECK_FIATS", null, 10, null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.kubi.payment.base.BaseFragment
    /* JADX INFO: renamed from: n3 */
    public void mo45632n3() {
        RecyclerView recyclerView;
        NavigationBar navigationBar = getNavigationBar();
        if (navigationBar != null) {
            navigationBar.m54692c();
        }
        m45787O3();
        C37596b c37596bM45808L3 = m45808L3();
        if (c37596bM45808L3 != null && (recyclerView = c37596bM45808L3.f83615d) != null) {
            recyclerView.setAdapter(m45807K3());
        }
        ((SearchFiatViewModel) m45631m3()).m45833H(m45809N3());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.kubi.payment.base.BaseFragment
    /* JADX INFO: renamed from: o3 */
    public void mo45633o3() {
        super.mo45633o3();
        ((SearchFiatViewModel) m45631m3()).m45829D().observe(getViewLifecycleOwner(), new C20328a(new Function1() { // from class: com.kubi.payment.channel.fiat.h
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SearchFiatFragment.m45796Y3(this.f38287b, (List) obj);
            }
        }));
        final int iM6183e = (int) (((C5267e0.m6183e() - (C27040e.m66658b(16) * 2)) - (C27040e.m66658b(12) * 2)) / 3.0f);
        ((SearchFiatViewModel) m45631m3()).m45830E().observe(getViewLifecycleOwner(), new C20328a(new Function1() { // from class: com.kubi.payment.channel.fiat.i
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SearchFiatFragment.m45797Z3(this.f38288b, iM6183e, (List) obj);
            }
        }));
    }
}
