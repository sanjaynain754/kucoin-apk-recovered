package com.kubi.transfer.search.symbol;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.media3.extractor.text.ttml.TtmlNode;
import androidx.recyclerview.widget.RecyclerView;
import c60.C4848b;
import com.blankj.utilcode.util.KeyboardUtils;
import com.kubi.resources.widget.ClearEditText;
import com.kubi.resources.widget.SwipeRefreshRecyclerView;
import com.kubi.sdk.BaseFragment;
import com.kubi.sdk.InitLoadView;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.sdk.widget.loading.WrapperLoadingView;
import com.kubi.transfer.C26268b;
import com.kubi.transfer.TransferLog;
import com.kubi.transfer.entity.Base;
import com.kubi.transfer.entity.Quote;
import com.kubi.transfer.entity.SearchSymbolEntity;
import com.kubi.transfer.lib.R$drawable;
import com.kubi.transfer.lib.R$layout;
import com.kubi.transfer.lib.R$string;
import com.kubi.transfer.search.SearchHistoryCoinAdapter;
import com.kubi.utils.C27099x;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.core.ViewExtKt;
import com.tencent.bugly.proguard.C33820nf;
import com.tencent.qcloud.tuicore.TUIConstants;
import g60.C37825a;
import io.chad.library.adapter.base.BaseQuickAdapter;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.rxkotlin.DisposableKt;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import k10.InterfaceC40863a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p011a9.C0206f;
import p752x8.AbstractC46099a;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Ref;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KProperty;
import p852kotlin.text.StringsKt;
import w00.C45681e;

/* JADX INFO: compiled from: SearchSymbolFragment.kt */
/* JADX INFO: loaded from: classes52.dex */
@Metadata(m90083d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010.\u001a\u00020/2\u0006\u00100\u001a\u0002012\b\u00102\u001a\u0004\u0018\u0001032\b\u00104\u001a\u0004\u0018\u000105H\u0016J\u001a\u00106\u001a\u0002072\u0006\u00108\u001a\u00020/2\b\u00102\u001a\u0004\u0018\u000103H\u0016J\u0012\u00109\u001a\u0002072\b\u0010:\u001a\u0004\u0018\u00010\u0007H\u0002J\u0010\u0010;\u001a\u0002072\u0006\u0010<\u001a\u00020\u0007H\u0002J\b\u0010=\u001a\u000207H\u0002J\b\u0010>\u001a\u000207H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u0006\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u001b\u0010\f\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u000b\u001a\u0004\b\r\u0010\u000eR\u001d\u0010\u0010\u001a\u0004\u0018\u00010\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0016\u001a\u00020\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u000b\u001a\u0004\b\u0018\u0010\u0019R\u001b\u0010\u001b\u001a\u00020\u001c8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010\u000b\u001a\u0004\b\u001d\u0010\u001eR\u001b\u0010 \u001a\u00020!8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b$\u0010\u000b\u001a\u0004\b\"\u0010#R\u001d\u0010%\u001a\u0004\u0018\u00010&8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b)\u0010\u000b\u001a\u0004\b'\u0010(R\u001a\u0010*\u001a\u00020\u0005X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u000e\"\u0004\b,\u0010-¨\u0006?"}, m90084d2 = {"Lcom/kubi/transfer/search/symbol/SearchSymbolFragment;", "Lcom/kubi/sdk/BaseFragment;", "<init>", "()V", "isClearHistory", "", "mFilterSymbol", "", "getMFilterSymbol", "()Ljava/lang/String;", "mFilterSymbol$delegate", "Lkotlin/Lazy;", "mFilterFromDeposit", "getMFilterFromDeposit", "()Z", "mFilterFromDeposit$delegate", "binding", "Lcom/kubi/transfer/lib/databinding/BtransferFragmentIsolatedSearchBinding;", "getBinding", "()Lcom/kubi/transfer/lib/databinding/BtransferFragmentIsolatedSearchBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "coinModel", "Lcom/kubi/transfer/search/symbol/SearchSymbolViewModel;", "getCoinModel", "()Lcom/kubi/transfer/search/symbol/SearchSymbolViewModel;", "coinModel$delegate", "mAdapter", "Lcom/kubi/transfer/search/symbol/SearchSymbolAdapter;", "getMAdapter", "()Lcom/kubi/transfer/search/symbol/SearchSymbolAdapter;", "mAdapter$delegate", "mHistoryCoinAdapter", "Lcom/kubi/transfer/search/SearchHistoryCoinAdapter;", "getMHistoryCoinAdapter", "()Lcom/kubi/transfer/search/SearchHistoryCoinAdapter;", "mHistoryCoinAdapter$delegate", "loadingView", "Lcom/kubi/sdk/widget/loading/ILoadingView;", "getLoadingView", "()Lcom/kubi/sdk/widget/loading/ILoadingView;", "loadingView$delegate", "needLoadingView", "getNeedLoadingView", "setNeedLoadingView", "(Z)V", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "savedInstanceState", "Landroid/os/Bundle;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "onViewCreated", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "handleClickItem", "symbol", "searchFilter", "key", "handleCoinList", "handleHistory", "TransferLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nSearchSymbolFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SearchSymbolFragment.kt\ncom/kubi/transfer/search/symbol/SearchSymbolFragment\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 4 Strings.kt\nkotlin/text/StringsKt__StringsKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 6 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,184:1\n147#2,16:185\n172#3,9:201\n106#4:210\n78#4,22:211\n1#5:233\n774#6:234\n865#6,2:235\n774#6:237\n865#6,2:238\n774#6:240\n865#6,2:241\n774#6:243\n865#6,2:244\n*S KotlinDebug\n*F\n+ 1 SearchSymbolFragment.kt\ncom/kubi/transfer/search/symbol/SearchSymbolFragment\n*L\n48#1:185,16\n49#1:201,9\n78#1:210\n78#1:211,22\n137#1:234\n137#1:235,2\n139#1:237\n139#1:238,2\n164#1:240\n164#1:241,2\n171#1:243\n171#1:244,2\n*E\n"})
public final class SearchSymbolFragment extends BaseFragment {

    /* JADX INFO: renamed from: d0 */
    public static final /* synthetic */ KProperty<Object>[] f52907d0 = {Reflection.property1(new PropertyReference1Impl(SearchSymbolFragment.class, "binding", "getBinding()Lcom/kubi/transfer/lib/databinding/BtransferFragmentIsolatedSearchBinding;", 0))};

    /* JADX INFO: renamed from: U */
    public boolean f52908U;

    /* JADX INFO: renamed from: Y */
    @NotNull
    public final Lazy f52912Y;

    /* JADX INFO: renamed from: c0 */
    public boolean f52916c0;

    /* JADX INFO: renamed from: V */
    @NotNull
    public final Lazy f52909V = LazyKt.lazy(new Function0() { // from class: com.kubi.transfer.search.symbol.m
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return SearchSymbolFragment.m64728O3(this.f52936b);
        }
    });

    /* JADX INFO: renamed from: W */
    @NotNull
    public final Lazy f52910W = LazyKt.lazy(new Function0() { // from class: com.kubi.transfer.search.symbol.n
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Boolean.valueOf(SearchSymbolFragment.m64727N3(this.f52937b));
        }
    });

    /* JADX INFO: renamed from: X */
    @NotNull
    public final InterfaceC24293a f52911X = C45681e.m100799e(this, new Function1<SearchSymbolFragment, C4848b>() { // from class: com.kubi.transfer.search.symbol.SearchSymbolFragment$special$$inlined$viewBindingFragment$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C4848b invoke(@NotNull SearchSymbolFragment fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C4848b.m4973a(this.this$0.getContentView());
        }

        {
            super(1);
        }
    }, new Function1<C4848b, Unit>() { // from class: com.kubi.transfer.search.symbol.SearchSymbolFragment$special$$inlined$viewBindingFragment$1
        public final void invoke(@NotNull C4848b it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C4848b c4848b) {
            invoke(c4848b);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: Z */
    @NotNull
    public final Lazy f52913Z = LazyKt.lazy(new Function0() { // from class: com.kubi.transfer.search.symbol.o
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return SearchSymbolFragment.m64726M3();
        }
    });

    /* JADX INFO: renamed from: a0 */
    @NotNull
    public final Lazy f52914a0 = LazyKt.lazy(new Function0() { // from class: com.kubi.transfer.search.symbol.b
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return SearchSymbolFragment.m64729P3();
        }
    });

    /* JADX INFO: renamed from: b0 */
    @NotNull
    public final Lazy f52915b0 = LazyKt.lazy(new Function0() { // from class: com.kubi.transfer.search.symbol.c
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return SearchSymbolFragment.m64725L3(this.f52927b);
        }
    });

    /* JADX INFO: renamed from: U3 */
    public static final void m64734U3(SearchSymbolFragment searchSymbolFragment, BaseQuickAdapter baseQuickAdapter, View view, int i11) {
        String symbolName;
        String strReplace$default = null;
        Object item = baseQuickAdapter != null ? baseQuickAdapter.getItem(i11) : null;
        SearchSymbolEntity searchSymbolEntity = item instanceof SearchSymbolEntity ? (SearchSymbolEntity) item : null;
        if (searchSymbolEntity != null && (symbolName = searchSymbolEntity.getSymbolName()) != null) {
            strReplace$default = StringsKt.replace$default(symbolName, C33820nf.f71144W, "/", false, 4, (Object) null);
        }
        searchSymbolFragment.m64719F3(strReplace$default);
    }

    /* JADX INFO: renamed from: V3 */
    public static final void m64735V3(SearchSymbolFragment searchSymbolFragment, BaseQuickAdapter baseQuickAdapter, View view, int i11) {
        Object item = baseQuickAdapter != null ? baseQuickAdapter.getItem(i11) : null;
        searchSymbolFragment.m64719F3(item instanceof String ? (String) item : null);
    }

    /* JADX INFO: renamed from: W3 */
    public static final boolean m64736W3(SearchSymbolFragment searchSymbolFragment, TextView textView, int i11, KeyEvent keyEvent) {
        if (i11 != 3) {
            return false;
        }
        C4848b c4848bM64756y3 = searchSymbolFragment.m64756y3();
        if (c4848bM64756y3 == null) {
            return true;
        }
        KeyboardUtils.m6034f(c4848bM64756y3.f4929d);
        return true;
    }

    /* JADX INFO: renamed from: A3 */
    private final InterfaceC40863a m64717A3() {
        return (InterfaceC40863a) this.f52915b0.getValue();
    }

    /* JADX INFO: renamed from: E3 */
    private final SearchHistoryCoinAdapter m64718E3() {
        return (SearchHistoryCoinAdapter) this.f52914a0.getValue();
    }

    /* JADX INFO: renamed from: F3 */
    private final void m64719F3(String str) {
        List mutableList;
        Intent intent = new Intent();
        intent.putExtra("symbol", C27041f.m66668h(str));
        FragmentActivity activity = getActivity();
        if (activity != null) {
            activity.setResult(-1, intent);
        }
        if (this.f52908U) {
            mutableList = new ArrayList();
        } else {
            List<String> data = m64718E3().getData();
            Intrinsics.checkNotNullExpressionValue(data, "getData(...)");
            mutableList = CollectionsKt.toMutableList((Collection) data);
        }
        mutableList.remove(str);
        mutableList.add(0, str);
        C37825a.m85379c("symbol_history", C27099x.m66919i(CollectionsKt.take(mutableList, 3), false, 2, null));
        preformBackPressed();
    }

    /* JADX INFO: renamed from: H3 */
    public static final void m64721H3(SearchSymbolFragment searchSymbolFragment, List it) {
        ArrayList arrayList;
        Quote quote;
        Base base;
        Intrinsics.checkNotNullParameter(it, "it");
        if (searchSymbolFragment.m64754C3()) {
            arrayList = new ArrayList();
            for (Object obj : it) {
                SearchSymbolEntity searchSymbolEntity = (SearchSymbolEntity) obj;
                if (!TextUtils.isEmpty(searchSymbolFragment.m64755D3())) {
                    if (!Intrinsics.areEqual((searchSymbolEntity == null || (base = searchSymbolEntity.getBase()) == null) ? null : base.getCurrency(), searchSymbolFragment.m64755D3())) {
                        if (Intrinsics.areEqual((searchSymbolEntity == null || (quote = searchSymbolEntity.getQuote()) == null) ? null : quote.getCurrency(), searchSymbolFragment.m64755D3())) {
                        }
                    }
                }
                arrayList.add(obj);
            }
        } else {
            arrayList = new ArrayList();
            for (Object obj2 : it) {
                SearchSymbolEntity searchSymbolEntity2 = (SearchSymbolEntity) obj2;
                if (!TextUtils.isEmpty(searchSymbolFragment.m64755D3())) {
                    if (!Intrinsics.areEqual(searchSymbolEntity2 != null ? searchSymbolEntity2.getSymbol() : null, searchSymbolFragment.m64755D3())) {
                    }
                }
                arrayList.add(obj2);
            }
        }
        searchSymbolFragment.m64753B3().replaceData(arrayList);
        if (it.isEmpty()) {
            InterfaceC40863a interfaceC40863aM64717A3 = searchSymbolFragment.m64717A3();
            if (interfaceC40863aM64717A3 != null) {
                interfaceC40863aM64717A3.showEmpty(R$string.common_no_data, R$drawable.ic2_common_empty, (View.OnClickListener) null);
                return;
            }
            return;
        }
        InterfaceC40863a interfaceC40863aM64717A4 = searchSymbolFragment.m64717A3();
        if (interfaceC40863aM64717A4 != null) {
            interfaceC40863aM64717A4.showContent();
        }
        searchSymbolFragment.m64722I3();
    }

    /* JADX INFO: renamed from: J3 */
    public static final void m64723J3(SearchSymbolFragment searchSymbolFragment, List list) {
        ConstraintLayout constraintLayout;
        ArrayList arrayList;
        ConstraintLayout constraintLayout2;
        if (list == null || list.isEmpty()) {
            C4848b c4848bM64756y3 = searchSymbolFragment.m64756y3();
            if (c4848bM64756y3 == null || (constraintLayout = c4848bM64756y3.f4932g) == null) {
                return;
            }
            ViewExtKt.m66577h(constraintLayout);
            return;
        }
        if (searchSymbolFragment.m64754C3()) {
            arrayList = new ArrayList();
            for (Object obj : list) {
                String str = (String) obj;
                if (TextUtils.isEmpty(searchSymbolFragment.m64755D3()) || !Intrinsics.areEqual(str, StringsKt.replace$default(searchSymbolFragment.m64755D3(), C33820nf.f71144W, "/", false, 4, (Object) null))) {
                    if (str != null && StringsKt.contains$default((CharSequence) str, (CharSequence) searchSymbolFragment.m64755D3(), false, 2, (Object) null)) {
                        arrayList.add(obj);
                    }
                }
            }
        } else {
            arrayList = new ArrayList();
            for (Object obj2 : list) {
                String str2 = (String) obj2;
                if (TextUtils.isEmpty(searchSymbolFragment.m64755D3()) || !Intrinsics.areEqual(str2, StringsKt.replace$default(searchSymbolFragment.m64755D3(), C33820nf.f71144W, "/", false, 4, (Object) null))) {
                    arrayList.add(obj2);
                }
            }
        }
        C4848b c4848bM64756y4 = searchSymbolFragment.m64756y3();
        if (c4848bM64756y4 != null && (constraintLayout2 = c4848bM64756y4.f4932g) != null) {
            C26268b.m64515d(constraintLayout2, true ^ arrayList.isEmpty());
        }
        searchSymbolFragment.m64718E3().replaceData(arrayList);
    }

    /* JADX INFO: renamed from: M3 */
    public static final SearchSymbolAdapter m64726M3() {
        return new SearchSymbolAdapter();
    }

    /* JADX INFO: renamed from: P3 */
    public static final SearchHistoryCoinAdapter m64729P3() {
        return new SearchHistoryCoinAdapter();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q3 */
    public static final Unit m64730Q3(Throwable e11) {
        Intrinsics.checkNotNullParameter(e11, "e");
        TransferLog.f52948a.m64780b(e11);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: S3 */
    public static final Unit m64732S3(Ref.BooleanRef booleanRef, SearchSymbolFragment searchSymbolFragment, CharSequence charSequence) {
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
            searchSymbolFragment.m64737X3(string.subSequence(i11, length + 1).toString());
        }
        booleanRef.element = true;
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: B3 */
    public final SearchSymbolAdapter m64753B3() {
        return (SearchSymbolAdapter) this.f52913Z.getValue();
    }

    /* JADX INFO: renamed from: C3 */
    public final boolean m64754C3() {
        return ((Boolean) this.f52910W.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: D3 */
    public final String m64755D3() {
        return (String) this.f52909V.getValue();
    }

    @Override // com.kubi.sdk.BaseFragment
    /* JADX INFO: renamed from: getNeedLoadingView, reason: from getter */
    public boolean getF23125V() {
        return this.f52916c0;
    }

    @Override // com.kubi.sdk.BaseFragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable Bundle savedInstanceState, @Nullable ViewGroup container) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View viewInflate = inflater.inflate(R$layout.btransfer_fragment_isolated_search, container, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
        return viewInflate;
    }

    @Override // com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        ClearEditText clearEditText;
        RecyclerView recyclerView;
        SwipeRefreshRecyclerView swipeRefreshRecyclerView;
        ClearEditText clearEditText2;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        getTitleBar().setTitle(getString(R$string.margin_single_title));
        InterfaceC40863a interfaceC40863aM64717A3 = m64717A3();
        if (interfaceC40863aM64717A3 != null) {
            interfaceC40863aM64717A3.showLoading();
        }
        C4848b c4848bM64756y3 = m64756y3();
        if (c4848bM64756y3 != null && (clearEditText2 = c4848bM64756y3.f4929d) != null) {
            clearEditText2.setHint(R$string.search_coin);
            final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
            AbstractC46099a<CharSequence> abstractC46099aM784d = C0206f.m784d(clearEditText2);
            final Function1 function1 = new Function1() { // from class: com.kubi.transfer.search.symbol.a
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return SearchSymbolFragment.m64732S3(booleanRef, this, (CharSequence) obj);
                }
            };
            Consumer<? super CharSequence> consumer = new Consumer() { // from class: com.kubi.transfer.search.symbol.g
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    SearchSymbolFragment.m64733T3(function1, obj);
                }
            };
            final Function1 function2 = new Function1() { // from class: com.kubi.transfer.search.symbol.h
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return SearchSymbolFragment.m64730Q3((Throwable) obj);
                }
            };
            Disposable disposableSubscribe = abstractC46099aM784d.subscribe(consumer, new Consumer() { // from class: com.kubi.transfer.search.symbol.i
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    SearchSymbolFragment.m64731R3(function2, obj);
                }
            });
            Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
            DisposableKt.addTo(disposableSubscribe, getDestroyDisposable());
        }
        m64753B3().setOnItemClickListener(new BaseQuickAdapter.OnItemClickListener() { // from class: com.kubi.transfer.search.symbol.j
            @Override // io.chad.library.adapter.base.BaseQuickAdapter.OnItemClickListener
            public final void onItemClick(BaseQuickAdapter baseQuickAdapter, View view2, int i11) {
                SearchSymbolFragment.m64734U3(this.f52933a, baseQuickAdapter, view2, i11);
            }
        });
        m64718E3().setOnItemClickListener(new BaseQuickAdapter.OnItemClickListener() { // from class: com.kubi.transfer.search.symbol.k
            @Override // io.chad.library.adapter.base.BaseQuickAdapter.OnItemClickListener
            public final void onItemClick(BaseQuickAdapter baseQuickAdapter, View view2, int i11) {
                SearchSymbolFragment.m64735V3(this.f52934a, baseQuickAdapter, view2, i11);
            }
        });
        C4848b c4848bM64756y4 = m64756y3();
        if (c4848bM64756y4 != null && (swipeRefreshRecyclerView = c4848bM64756y4.f4933h) != null) {
            swipeRefreshRecyclerView.setEnabled(false);
            swipeRefreshRecyclerView.getRecyclerView().setAdapter(m64753B3());
        }
        C4848b c4848bM64756y5 = m64756y3();
        if (c4848bM64756y5 != null && (recyclerView = c4848bM64756y5.f4930e) != null) {
            recyclerView.setAdapter(m64718E3());
        }
        C4848b c4848bM64756y6 = m64756y3();
        if (c4848bM64756y6 != null && (clearEditText = c4848bM64756y6.f4929d) != null) {
            clearEditText.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: com.kubi.transfer.search.symbol.l
                @Override // android.widget.TextView.OnEditorActionListener
                public final boolean onEditorAction(TextView textView, int i11, KeyEvent keyEvent) {
                    return SearchSymbolFragment.m64736W3(this.f52935b, textView, i11, keyEvent);
                }
            });
        }
        m64720G3();
    }

    @Override // com.kubi.sdk.BaseFragment
    public void setNeedLoadingView(boolean z11) {
        this.f52916c0 = z11;
    }

    /* JADX INFO: renamed from: y3 */
    public final C4848b m64756y3() {
        return (C4848b) this.f52911X.getValue(this, f52907d0[0]);
    }

    /* JADX INFO: renamed from: z3 */
    public final SearchSymbolViewModel m64757z3() {
        return (SearchSymbolViewModel) this.f52912Y.getValue();
    }

    public SearchSymbolFragment() {
        final Function0 function0 = null;
        this.f52912Y = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(SearchSymbolViewModel.class), new Function0<ViewModelStore>() { // from class: com.kubi.transfer.search.symbol.SearchSymbolFragment$special$$inlined$activityViewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.kubi.transfer.search.symbol.SearchSymbolFragment$special$$inlined$activityViewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.kubi.transfer.search.symbol.SearchSymbolFragment$special$$inlined$activityViewModels$default$3
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

    /* JADX INFO: renamed from: G3 */
    private final void m64720G3() {
        m64757z3().m64777z().observe(getViewLifecycleOwner(), new Observer() { // from class: com.kubi.transfer.search.symbol.d
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                SearchSymbolFragment.m64721H3(this.f52928b, (List) obj);
            }
        });
    }

    /* JADX INFO: renamed from: I3 */
    private final void m64722I3() {
        ImageView imageView;
        m64757z3().m64774B().observe(getViewLifecycleOwner(), new Observer() { // from class: com.kubi.transfer.search.symbol.e
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                SearchSymbolFragment.m64723J3(this.f52929b, (List) obj);
            }
        });
        C4848b c4848bM64756y3 = m64756y3();
        if (c4848bM64756y3 != null && (imageView = c4848bM64756y3.f4931f) != null) {
            C27046k.m66711z(imageView, 0L, new Function0() { // from class: com.kubi.transfer.search.symbol.f
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return SearchSymbolFragment.m64724K3(this.f52930b);
                }
            }, 1, null);
        }
    }

    /* JADX INFO: renamed from: K3 */
    public static final Unit m64724K3(SearchSymbolFragment searchSymbolFragment) {
        searchSymbolFragment.m64757z3().m64776w();
        searchSymbolFragment.f52908U = true;
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: L3 */
    public static final InitLoadView m64725L3(SearchSymbolFragment searchSymbolFragment) {
        C4848b c4848bM64756y3 = searchSymbolFragment.m64756y3();
        if (c4848bM64756y3 != null) {
            WrapperLoadingView wrapperLoadingViewInjectView = WrapperLoadingView.injectView(c4848bM64756y3.f4933h);
            Intrinsics.checkNotNullExpressionValue(wrapperLoadingViewInjectView, "injectView(...)");
            return new InitLoadView(wrapperLoadingViewInjectView);
        }
        return null;
    }

    /* JADX INFO: renamed from: N3 */
    public static final boolean m64727N3(SearchSymbolFragment searchSymbolFragment) {
        Boolean boolValueOf;
        Bundle arguments = searchSymbolFragment.getArguments();
        if (arguments != null) {
            boolValueOf = Boolean.valueOf(arguments.getBoolean("coin"));
        } else {
            boolValueOf = null;
        }
        return C27025c.m66566d(boolValueOf);
    }

    /* JADX INFO: renamed from: O3 */
    public static final String m64728O3(SearchSymbolFragment searchSymbolFragment) {
        String string;
        Bundle arguments = searchSymbolFragment.getArguments();
        if (arguments != null) {
            string = arguments.getString("data");
        } else {
            string = null;
        }
        return C27041f.m66668h(string);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R3 */
    public static final void m64731R3(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T3 */
    public static final void m64733T3(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: X3 */
    private final void m64737X3(String str) {
        m64757z3().m64775G(str);
    }
}
