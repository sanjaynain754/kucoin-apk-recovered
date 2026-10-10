package com.kubi.assets.search.transfer;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.kubi.assets.R$drawable;
import com.kubi.assets.R$layout;
import com.kubi.assets.R$string;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.ClearEditText;
import com.kubi.resources.widget.SwipeRefreshRecyclerView;
import com.kubi.sdk.BaseFragment;
import com.kubi.sdk.InitLoadView;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.sdk.widget.loading.WrapperLoadingView;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27046k;
import com.tencent.qcloud.tuicore.TUIConstants;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.rxkotlin.DisposableKt;
import java.util.List;
import k10.InterfaceC40863a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p011a9.C0206f;
import p569qq.C43852m;
import p637ta.C44733b4;
import p637ta.C44853r2;
import p752x8.AbstractC46099a;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Ref;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KProperty;
import ro.C44128b;
import w00.C45681e;

/* JADX INFO: compiled from: SearchCoinFragment.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002*\u0001*\u0018\u0000 52\u00020\u0001:\u00015B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0016J\b\u0010.\u001a\u00020\u000bH\u0002J\u001a\u0010/\u001a\u0002002\u0006\u00101\u001a\u00020\u001d2\b\u0010 \u001a\u0004\u0018\u00010!H\u0016J\u0010\u00102\u001a\u0002002\u0006\u00103\u001a\u000204H\u0002R\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u001b\u0010\u0010\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u000f\u001a\u0004\b\u0011\u0010\rR\u001b\u0010\u0013\u001a\u00020\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u000f\u001a\u0004\b\u0013\u0010\u0015R\u001d\u0010\u0017\u001a\u0004\u0018\u00010\u00188BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u000f\u001a\u0004\b\u0019\u0010\u001aR\u001b\u0010$\u001a\u00020%8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b(\u0010\u000f\u001a\u0004\b&\u0010'R\u001b\u0010)\u001a\u00020*8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b-\u0010\u000f\u001a\u0004\b+\u0010,¨\u00066"}, m90084d2 = {"Lcom/kubi/assets/search/transfer/SearchCoinFragment;", "Lcom/kubi/sdk/BaseFragment;", "<init>", "()V", "binding", "Lcom/kubi/assets/databinding/KucoinActivitySearchCoinBinding;", "getBinding", "()Lcom/kubi/assets/databinding/KucoinActivitySearchCoinBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "fromType", "", "getFromType", "()I", "fromType$delegate", "Lkotlin/Lazy;", "toType", "getToType", "toType$delegate", "isAdd", "", "()Z", "isAdd$delegate", "loadingView", "Lcom/kubi/sdk/widget/loading/ILoadingView;", "getLoadingView", "()Lcom/kubi/sdk/widget/loading/ILoadingView;", "loadingView$delegate", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "savedInstanceState", "Landroid/os/Bundle;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "coinModel", "Lcom/kubi/assets/search/transfer/SearchCoinViewModel;", "getCoinModel", "()Lcom/kubi/assets/search/transfer/SearchCoinViewModel;", "coinModel$delegate", "mAdapter", "com/kubi/assets/search/transfer/SearchCoinFragment$mAdapter$2$1", "getMAdapter", "()Lcom/kubi/assets/search/transfer/SearchCoinFragment$mAdapter$2$1;", "mAdapter$delegate", "getLayout", "onViewCreated", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "searchFilter", "key", "", "Companion", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nSearchCoinFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SearchCoinFragment.kt\ncom/kubi/assets/search/transfer/SearchCoinFragment\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 4 Strings.kt\nkotlin/text/StringsKt__StringsKt\n*L\n1#1,141:1\n147#2,16:142\n172#3,9:158\n106#4:167\n78#4,22:168\n*S KotlinDebug\n*F\n+ 1 SearchCoinFragment.kt\ncom/kubi/assets/search/transfer/SearchCoinFragment\n*L\n46#1:142,16\n69#1:158,9\n108#1:167\n108#1:168,22\n*E\n"})
public final class SearchCoinFragment extends BaseFragment {

    /* JADX INFO: renamed from: Z */
    @NotNull
    public final Lazy f18653Z;

    /* JADX INFO: renamed from: c0 */
    public static final /* synthetic */ KProperty<Object>[] f18647c0 = {Reflection.property1(new PropertyReference1Impl(SearchCoinFragment.class, "binding", "getBinding()Lcom/kubi/assets/databinding/KucoinActivitySearchCoinBinding;", 0))};

    /* JADX INFO: renamed from: b0 */
    @NotNull
    public static final Companion f18646b0 = new Companion(null);

    /* JADX INFO: renamed from: U */
    @NotNull
    public final InterfaceC24293a f18648U = C45681e.m100799e(this, new Function1<SearchCoinFragment, C44733b4>() { // from class: com.kubi.assets.search.transfer.SearchCoinFragment$special$$inlined$viewBindingFragment$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C44733b4 invoke(@NotNull SearchCoinFragment fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C44733b4.m98976a(this.this$0.getContentView());
        }

        {
            super(1);
        }
    }, new Function1<C44733b4, Unit>() { // from class: com.kubi.assets.search.transfer.SearchCoinFragment$special$$inlined$viewBindingFragment$1
        public final void invoke(@NotNull C44733b4 it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C44733b4 c44733b4) {
            invoke(c44733b4);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: V */
    @NotNull
    public final Lazy f18649V = LazyKt.lazy(new Function0() { // from class: com.kubi.assets.search.transfer.j
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Integer.valueOf(SearchCoinFragment.m19113v3(this.f18676b));
        }
    });

    /* JADX INFO: renamed from: W */
    @NotNull
    public final Lazy f18650W = LazyKt.lazy(new Function0() { // from class: com.kubi.assets.search.transfer.k
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Integer.valueOf(SearchCoinFragment.m19100O3(this.f18677b));
        }
    });

    /* JADX INFO: renamed from: X */
    @NotNull
    public final Lazy f18651X = LazyKt.lazy(new Function0() { // from class: com.kubi.assets.search.transfer.l
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Boolean.valueOf(SearchCoinFragment.m19089D3(this.f18678b));
        }
    });

    /* JADX INFO: renamed from: Y */
    @NotNull
    public final Lazy f18652Y = LazyKt.lazy(new Function0() { // from class: com.kubi.assets.search.transfer.b
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return SearchCoinFragment.m19090E3(this.f18670b);
        }
    });

    /* JADX INFO: renamed from: a0 */
    @NotNull
    public final Lazy f18654a0 = LazyKt.lazy(new Function0() { // from class: com.kubi.assets.search.transfer.c
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return SearchCoinFragment.m19091F3(this.f18671b);
        }
    });

    /* JADX INFO: compiled from: SearchCoinFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m90084d2 = {"Lcom/kubi/assets/search/transfer/SearchCoinFragment$Companion;", "", "<init>", "()V", "PAGE_ID", "", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: C3 */
    private final boolean m19088C3() {
        return ((Boolean) this.f18651X.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: F3 */
    public static final SearchCoinFragment$mAdapter$2$1 m19091F3(SearchCoinFragment searchCoinFragment) {
        return new SearchCoinFragment$mAdapter$2$1(searchCoinFragment, R$layout.kucoin_item_coin_list);
    }

    /* JADX INFO: renamed from: G3 */
    public static final Unit m19092G3(Throwable e11) {
        Intrinsics.checkNotNullParameter(e11, "e");
        C44128b.m97263g("SearchCoinFragment", e11);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: I3 */
    public static final Unit m19094I3(Ref.BooleanRef booleanRef, SearchCoinFragment searchCoinFragment, CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "charSequence");
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
            searchCoinFragment.m19099N3(string.subSequence(i11, length + 1).toString());
        }
        booleanRef.element = true;
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: K3 */
    public static final Unit m19096K3(SearchCoinFragment searchCoinFragment) {
        C43852m.m96591c("B1deposit", "cancel", "1", null, 8, null);
        searchCoinFragment.preformBackPressed();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: L3 */
    public static final void m19097L3(View view, boolean z11) {
        if (z11) {
            C43852m.m96591c("B1deposit", "searchButton", "1", null, 8, null);
        }
    }

    /* JADX INFO: renamed from: M3 */
    public static final void m19098M3(SearchCoinFragment searchCoinFragment, List it) {
        Intrinsics.checkNotNullParameter(it, "it");
        searchCoinFragment.m19116A3().replaceData(it);
        if (it.isEmpty()) {
            InterfaceC40863a interfaceC40863aM19115z3 = searchCoinFragment.m19115z3();
            if (interfaceC40863aM19115z3 != null) {
                interfaceC40863aM19115z3.showEmpty(R$string.no_more_data, R$drawable.ic2_common_empty, (View.OnClickListener) null);
                return;
            }
            return;
        }
        InterfaceC40863a interfaceC40863aM19115z4 = searchCoinFragment.m19115z3();
        if (interfaceC40863aM19115z4 != null) {
            interfaceC40863aM19115z4.showContent();
        }
    }

    private final int getLayout() {
        return R$layout.kucoin_activity_search_coin;
    }

    /* JADX INFO: renamed from: y3 */
    private final int m19114y3() {
        return ((Number) this.f18649V.getValue()).intValue();
    }

    /* JADX INFO: renamed from: z3 */
    private final InterfaceC40863a m19115z3() {
        return (InterfaceC40863a) this.f18652Y.getValue();
    }

    /* JADX INFO: renamed from: A3 */
    public final SearchCoinFragment$mAdapter$2$1 m19116A3() {
        return (SearchCoinFragment$mAdapter$2$1) this.f18654a0.getValue();
    }

    /* JADX INFO: renamed from: B3 */
    public final int m19117B3() {
        return ((Number) this.f18650W.getValue()).intValue();
    }

    @Override // com.kubi.sdk.BaseFragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable Bundle savedInstanceState, @Nullable ViewGroup container) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View viewInflate = inflater.inflate(getLayout(), container, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
        return viewInflate;
    }

    @Override // com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        C44853r2 c44853r2;
        BaseTextView baseTextView;
        C44853r2 c44853r3;
        ClearEditText clearEditText;
        SwipeRefreshRecyclerView swipeRefreshRecyclerView;
        C44853r2 c44853r4;
        ClearEditText clearEditText2;
        C44853r2 c44853r5;
        LinearLayout linearLayout;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        InterfaceC40863a interfaceC40863aM19115z3 = m19115z3();
        if (interfaceC40863aM19115z3 != null) {
            interfaceC40863aM19115z3.showLoading();
        }
        if (m19088C3()) {
            C44733b4 c44733b4M19118w3 = m19118w3();
            if (c44733b4M19118w3 != null && (c44853r5 = c44733b4M19118w3.f99623c) != null && (linearLayout = c44853r5.f100726d) != null) {
                C27046k.m66700o(linearLayout);
            }
        } else {
            C44733b4 c44733b4M19118w4 = m19118w3();
            if (c44733b4M19118w4 != null && (c44853r3 = c44733b4M19118w4.f99623c) != null && (clearEditText = c44853r3.f100724b) != null) {
                clearEditText.setHint(R$string.search_coin);
                final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
                AbstractC46099a<CharSequence> abstractC46099aM784d = C0206f.m784d(clearEditText);
                final Function1 function1 = new Function1() { // from class: com.kubi.assets.search.transfer.a
                    @Override // p852kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return SearchCoinFragment.m19094I3(booleanRef, this, (CharSequence) obj);
                    }
                };
                Consumer<? super CharSequence> consumer = new Consumer() { // from class: com.kubi.assets.search.transfer.d
                    @Override // io.reactivex.functions.Consumer
                    public final void accept(Object obj) {
                        SearchCoinFragment.m19095J3(function1, obj);
                    }
                };
                final Function1 function2 = new Function1() { // from class: com.kubi.assets.search.transfer.e
                    @Override // p852kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return SearchCoinFragment.m19092G3((Throwable) obj);
                    }
                };
                Disposable disposableSubscribe = abstractC46099aM784d.subscribe(consumer, new Consumer() { // from class: com.kubi.assets.search.transfer.f
                    @Override // io.reactivex.functions.Consumer
                    public final void accept(Object obj) {
                        SearchCoinFragment.m19093H3(function2, obj);
                    }
                });
                Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
                DisposableKt.addTo(disposableSubscribe, getDestroyDisposable());
            }
            C44733b4 c44733b4M19118w5 = m19118w3();
            if (c44733b4M19118w5 != null && (c44853r2 = c44733b4M19118w5.f99623c) != null && (baseTextView = c44853r2.f100725c) != null) {
                C27046k.m66711z(baseTextView, 0L, new Function0() { // from class: com.kubi.assets.search.transfer.g
                    @Override // p852kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return SearchCoinFragment.m19096K3(this.f18674b);
                    }
                }, 1, null);
            }
        }
        C44733b4 c44733b4M19118w6 = m19118w3();
        if (c44733b4M19118w6 != null && (c44853r4 = c44733b4M19118w6.f99623c) != null && (clearEditText2 = c44853r4.f100724b) != null) {
            clearEditText2.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.kubi.assets.search.transfer.h
                @Override // android.view.View.OnFocusChangeListener
                public final void onFocusChange(View view2, boolean z11) {
                    SearchCoinFragment.m19097L3(view2, z11);
                }
            });
        }
        m19116A3().setHasStableIds(true);
        C44733b4 c44733b4M19118w7 = m19118w3();
        if (c44733b4M19118w7 != null && (swipeRefreshRecyclerView = c44733b4M19118w7.f99622b) != null) {
            swipeRefreshRecyclerView.setEnabled(false);
            swipeRefreshRecyclerView.getRecyclerView().setAdapter(m19116A3());
        }
        m19119x3().m19132u(m19114y3(), m19117B3()).observe(getViewLifecycleOwner(), new Observer() { // from class: com.kubi.assets.search.transfer.i
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                SearchCoinFragment.m19098M3(this.f18675b, (List) obj);
            }
        });
    }

    /* JADX INFO: renamed from: w3 */
    public final C44733b4 m19118w3() {
        return (C44733b4) this.f18648U.getValue(this, f18647c0[0]);
    }

    /* JADX INFO: renamed from: x3 */
    public final SearchCoinViewModel m19119x3() {
        return (SearchCoinViewModel) this.f18653Z.getValue();
    }

    public SearchCoinFragment() {
        final Function0 function0 = null;
        this.f18653Z = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(SearchCoinViewModel.class), new Function0<ViewModelStore>() { // from class: com.kubi.assets.search.transfer.SearchCoinFragment$special$$inlined$activityViewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.kubi.assets.search.transfer.SearchCoinFragment$special$$inlined$activityViewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.kubi.assets.search.transfer.SearchCoinFragment$special$$inlined$activityViewModels$default$3
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

    /* JADX INFO: renamed from: D3 */
    public static final boolean m19089D3(SearchCoinFragment searchCoinFragment) {
        Boolean boolValueOf;
        Bundle arguments = searchCoinFragment.getArguments();
        if (arguments != null) {
            boolValueOf = Boolean.valueOf(arguments.getBoolean("data"));
        } else {
            boolValueOf = null;
        }
        return C27025c.m66566d(boolValueOf);
    }

    /* JADX INFO: renamed from: E3 */
    public static final InitLoadView m19090E3(SearchCoinFragment searchCoinFragment) {
        C44733b4 c44733b4M19118w3 = searchCoinFragment.m19118w3();
        if (c44733b4M19118w3 != null) {
            WrapperLoadingView wrapperLoadingViewInjectView = WrapperLoadingView.injectView(c44733b4M19118w3.f99622b);
            Intrinsics.checkNotNullExpressionValue(wrapperLoadingViewInjectView, "injectView(...)");
            return new InitLoadView(wrapperLoadingViewInjectView);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H3 */
    public static final void m19093H3(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: J3 */
    public static final void m19095J3(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: N3 */
    private final void m19099N3(String str) {
        m19119x3().m19135y(str);
    }

    /* JADX INFO: renamed from: O3 */
    public static final int m19100O3(SearchCoinFragment searchCoinFragment) {
        Integer numValueOf;
        Bundle arguments = searchCoinFragment.getArguments();
        if (arguments != null) {
            numValueOf = Integer.valueOf(arguments.getInt(TypedValues.TransitionType.S_TO, 0));
        } else {
            numValueOf = null;
        }
        return C27039d.m66650j(numValueOf);
    }

    /* JADX INFO: renamed from: v3 */
    public static final int m19113v3(SearchCoinFragment searchCoinFragment) {
        Integer numValueOf;
        Bundle arguments = searchCoinFragment.getArguments();
        if (arguments != null) {
            numValueOf = Integer.valueOf(arguments.getInt("from", 0));
        } else {
            numValueOf = null;
        }
        return C27039d.m66650j(numValueOf);
    }
}
