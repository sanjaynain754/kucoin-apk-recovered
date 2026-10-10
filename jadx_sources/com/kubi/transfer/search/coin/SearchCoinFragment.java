package com.kubi.transfer.search.coin;

import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.media3.extractor.text.ttml.TtmlNode;
import androidx.recyclerview.widget.RecyclerView;
import c60.C4849c;
import c60.C4851e;
import com.blankj.utilcode.util.KeyboardUtils;
import com.kubi.data.coin.AccountType;
import com.kubi.data.entity.CoinInfoEntity;
import com.kubi.resources.widget.AlertTipsTextView;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.ClearEditText;
import com.kubi.resources.widget.SwipeRefreshRecyclerView;
import com.kubi.sdk.BaseFragment;
import com.kubi.sdk.InitLoadView;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.sdk.widget.loading.WrapperLoadingView;
import com.kubi.transfer.C26268b;
import com.kubi.transfer.TransferHelper;
import com.kubi.transfer.TransferLog;
import com.kubi.transfer.entity.AccountCoin;
import com.kubi.transfer.lib.R$drawable;
import com.kubi.transfer.lib.R$layout;
import com.kubi.transfer.lib.R$string;
import com.kubi.transfer.search.SearchHistoryCoinAdapter;
import com.kubi.utils.C27099x;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.core.ViewExtKt;
import com.tencent.qcloud.tuicore.TUIConstants;
import g60.C37825a;
import gf.C37890n;
import io.chad.library.adapter.base.BaseQuickAdapter;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.rxkotlin.DisposableKt;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import k10.InterfaceC40863a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p011a9.C0206f;
import p569qq.C43852m;
import p752x8.AbstractC46099a;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Ref;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.jvm.internal.StringCompanionObject;
import p852kotlin.reflect.KProperty;
import w00.C45681e;

/* JADX INFO: compiled from: SearchCoinFragment.kt */
/* JADX INFO: loaded from: classes52.dex */
@Metadata(m90083d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\u0018\u0000 F2\u00020\u0001:\u0001FB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J$\u00104\u001a\u0002052\u0006\u00106\u001a\u0002072\b\u00108\u001a\u0004\u0018\u0001092\b\u0010:\u001a\u0004\u0018\u00010;H\u0016J\u001a\u0010<\u001a\u00020=2\u0006\u0010>\u001a\u0002052\b\u00108\u001a\u0004\u0018\u000109H\u0016J\u0010\u0010?\u001a\u00020=2\b\u0010@\u001a\u0004\u0018\u00010\u0007J\u0012\u0010A\u001a\u00020=2\b\u0010@\u001a\u0004\u0018\u00010\u0007H\u0002J\u0010\u0010B\u001a\u00020=2\u0006\u0010C\u001a\u00020\u0007H\u0002J\b\u0010D\u001a\u00020=H\u0002J\b\u0010E\u001a\u00020=H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u0006\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u001b\u0010\f\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000b\u001a\u0004\b\r\u0010\tR\u001d\u0010\u000f\u001a\u0004\u0018\u00010\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u000b\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00070\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u001d\u0010\u0014\u001a\u0004\u0018\u00010\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0016\u0010\u0017R\u001b\u0010\u001a\u001a\u00020\u001b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u000b\u001a\u0004\b\u001c\u0010\u001dR\u001b\u0010\u001f\u001a\u00020 8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b#\u0010\u000b\u001a\u0004\b!\u0010\"R\u000e\u0010$\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010%\u001a\u00020&8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b)\u0010\u000b\u001a\u0004\b'\u0010(R\u001d\u0010*\u001a\u0004\u0018\u00010+8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b.\u0010\u000b\u001a\u0004\b,\u0010-R\u001a\u0010/\u001a\u00020\u0005X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u00101\"\u0004\b2\u00103¨\u0006G"}, m90084d2 = {"Lcom/kubi/transfer/search/coin/SearchCoinFragment;", "Lcom/kubi/sdk/BaseFragment;", "<init>", "()V", "isClearHistory", "", "fromType", "", "getFromType", "()Ljava/lang/String;", "fromType$delegate", "Lkotlin/Lazy;", "toType", "getToType", "toType$delegate", "isMultiAccountMode", "()Ljava/lang/Boolean;", "isMultiAccountMode$delegate", "multiAccountList", "", "binding", "Lcom/kubi/transfer/lib/databinding/BtransferFragmentSearchBinding;", "getBinding", "()Lcom/kubi/transfer/lib/databinding/BtransferFragmentSearchBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "coinModel", "Lcom/kubi/transfer/search/coin/SearchCoinViewModel;", "getCoinModel", "()Lcom/kubi/transfer/search/coin/SearchCoinViewModel;", "coinModel$delegate", "mAdapter", "Lcom/kubi/transfer/search/coin/SearchCoinAdapter;", "getMAdapter", "()Lcom/kubi/transfer/search/coin/SearchCoinAdapter;", "mAdapter$delegate", "filterText", "mHistoryCoinAdapter", "Lcom/kubi/transfer/search/SearchHistoryCoinAdapter;", "getMHistoryCoinAdapter", "()Lcom/kubi/transfer/search/SearchHistoryCoinAdapter;", "mHistoryCoinAdapter$delegate", "loadingView", "Lcom/kubi/sdk/widget/loading/ILoadingView;", "getLoadingView", "()Lcom/kubi/sdk/widget/loading/ILoadingView;", "loadingView$delegate", "needLoadingView", "getNeedLoadingView", "()Z", "setNeedLoadingView", "(Z)V", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "savedInstanceState", "Landroid/os/Bundle;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "onViewCreated", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "handleClickItem", "coin", "setCoinData", "searchFilter", "key", "handleCoinList", "handleHistory", "Companion", "TransferLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nSearchCoinFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SearchCoinFragment.kt\ncom/kubi/transfer/search/coin/SearchCoinFragment\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 Strings.kt\nkotlin/text/StringsKt__StringsKt\n+ 6 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,231:1\n147#2,16:232\n172#3,9:248\n1#4:257\n106#5:258\n78#5,22:259\n295#6,2:281\n*S KotlinDebug\n*F\n+ 1 SearchCoinFragment.kt\ncom/kubi/transfer/search/coin/SearchCoinFragment\n*L\n58#1:232,16\n59#1:248,9\n93#1:258\n93#1:259,22\n151#1:281,2\n*E\n"})
public final class SearchCoinFragment extends BaseFragment {

    /* JADX INFO: renamed from: U */
    public boolean f52868U;

    /* JADX INFO: renamed from: a0 */
    @NotNull
    public final Lazy f52874a0;

    /* JADX INFO: renamed from: f0 */
    public boolean f52879f0;

    /* JADX INFO: renamed from: h0 */
    public static final /* synthetic */ KProperty<Object>[] f52867h0 = {Reflection.property1(new PropertyReference1Impl(SearchCoinFragment.class, "binding", "getBinding()Lcom/kubi/transfer/lib/databinding/BtransferFragmentSearchBinding;", 0))};

    /* JADX INFO: renamed from: g0 */
    @NotNull
    public static final Companion f52866g0 = new Companion(null);

    /* JADX INFO: renamed from: V */
    @NotNull
    public final Lazy f52869V = LazyKt.lazy(new Function0() { // from class: com.kubi.transfer.search.coin.q
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return SearchCoinFragment.m64640B3(this.f52903b);
        }
    });

    /* JADX INFO: renamed from: W */
    @NotNull
    public final Lazy f52870W = LazyKt.lazy(new Function0() { // from class: com.kubi.transfer.search.coin.r
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return SearchCoinFragment.m64660f4(this.f52904b);
        }
    });

    /* JADX INFO: renamed from: X */
    @NotNull
    public final Lazy f52871X = LazyKt.lazy(new Function0() { // from class: com.kubi.transfer.search.coin.b
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return SearchCoinFragment.m64647R3(this.f52889b);
        }
    });

    /* JADX INFO: renamed from: Y */
    @NotNull
    public List<String> f52872Y = CollectionsKt.emptyList();

    /* JADX INFO: renamed from: Z */
    @NotNull
    public final InterfaceC24293a f52873Z = C45681e.m100799e(this, new Function1<SearchCoinFragment, C4849c>() { // from class: com.kubi.transfer.search.coin.SearchCoinFragment$special$$inlined$viewBindingFragment$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C4849c invoke(@NotNull SearchCoinFragment fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C4849c.m4975a(this.this$0.getContentView());
        }

        {
            super(1);
        }
    }, new Function1<C4849c, Unit>() { // from class: com.kubi.transfer.search.coin.SearchCoinFragment$special$$inlined$viewBindingFragment$1
        public final void invoke(@NotNull C4849c it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C4849c c4849c) {
            invoke(c4849c);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: b0 */
    @NotNull
    public final Lazy f52875b0 = LazyKt.lazy(new Function0() { // from class: com.kubi.transfer.search.coin.c
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return SearchCoinFragment.m64649T3();
        }
    });

    /* JADX INFO: renamed from: c0 */
    @NotNull
    public String f52876c0 = "";

    /* JADX INFO: renamed from: d0 */
    @NotNull
    public final Lazy f52877d0 = LazyKt.lazy(new Function0() { // from class: com.kubi.transfer.search.coin.d
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return SearchCoinFragment.m64650U3();
        }
    });

    /* JADX INFO: renamed from: e0 */
    @NotNull
    public final Lazy f52878e0 = LazyKt.lazy(new Function0() { // from class: com.kubi.transfer.search.coin.e
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return SearchCoinFragment.m64648S3(this.f52890b);
        }
    });

    /* JADX INFO: compiled from: SearchCoinFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m90084d2 = {"Lcom/kubi/transfer/search/coin/SearchCoinFragment$Companion;", "", "<init>", "()V", "IS_MULTI_ACCOUNT", "", "TransferLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: a4 */
    public static final void m64656a4(SearchCoinFragment searchCoinFragment, BaseQuickAdapter baseQuickAdapter, View view, int i11) {
        Object item = baseQuickAdapter != null ? baseQuickAdapter.getItem(i11) : null;
        AccountCoin accountCoin = item instanceof AccountCoin ? (AccountCoin) item : null;
        searchCoinFragment.m64683J3(accountCoin != null ? accountCoin.getCurrencyName() : null);
    }

    /* JADX INFO: renamed from: b4 */
    public static final void m64657b4(SearchCoinFragment searchCoinFragment, BaseQuickAdapter baseQuickAdapter, View view, int i11) {
        Object item = baseQuickAdapter != null ? baseQuickAdapter.getItem(i11) : null;
        searchCoinFragment.m64683J3(item instanceof String ? (String) item : null);
        C43852m.m96591c("B1transferCoinList", "coin", null, null, 12, null);
    }

    /* JADX INFO: renamed from: c4 */
    public static final boolean m64658c4(SearchCoinFragment searchCoinFragment, TextView textView, int i11, KeyEvent keyEvent) {
        if (i11 != 3) {
            return false;
        }
        C4849c c4849cM64678C3 = searchCoinFragment.m64678C3();
        if (c4849cM64678C3 == null) {
            return true;
        }
        KeyboardUtils.m6034f(c4849cM64678C3.f4944i.f4963b);
        return true;
    }

    /* JADX INFO: renamed from: J3 */
    public final void m64683J3(@Nullable final String str) {
        String strM66677q;
        final String strM66668h = (str == null || (strM66677q = C27041f.m66677q(str)) == null) ? null : C27041f.m66668h(strM66677q);
        if ((strM66668h != null ? C37890n.f85269a.m85613u(strM66668h) : null) != null) {
            m64687e4(str);
            return;
        }
        C37890n.f85269a.mo85595j(new Consumer() { // from class: com.kubi.transfer.search.coin.g
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                SearchCoinFragment.m64643K3(this.f52892b, str, strM66668h, (List) obj);
            }
        });
        TransferLog.f52948a.m64779a((char) 35813 + str + "的coinInfo为null");
    }

    /* JADX INFO: renamed from: E3 */
    private final String m64641E3() {
        return (String) this.f52869V.getValue();
    }

    /* JADX INFO: renamed from: F3 */
    private final InterfaceC40863a m64642F3() {
        return (InterfaceC40863a) this.f52878e0.getValue();
    }

    /* JADX INFO: renamed from: M3 */
    public static final void m64644M3(SearchCoinFragment searchCoinFragment, List it) {
        Intrinsics.checkNotNullParameter(it, "it");
        searchCoinFragment.m64680G3().m64638h(it, searchCoinFragment.f52876c0);
        if (it.isEmpty()) {
            InterfaceC40863a interfaceC40863aM64642F3 = searchCoinFragment.m64642F3();
            if (interfaceC40863aM64642F3 != null) {
                interfaceC40863aM64642F3.showEmpty(R$string.common_no_data, R$drawable.ic2_common_empty, (View.OnClickListener) null);
                return;
            }
            return;
        }
        InterfaceC40863a interfaceC40863aM64642F4 = searchCoinFragment.m64642F3();
        if (interfaceC40863aM64642F4 != null) {
            interfaceC40863aM64642F4.showContent();
        }
        searchCoinFragment.m64685N3();
    }

    /* JADX INFO: renamed from: O3 */
    public static final void m64645O3(SearchCoinFragment searchCoinFragment, List list) {
        ConstraintLayout constraintLayout;
        ConstraintLayout constraintLayout2;
        if (list == null || list.isEmpty()) {
            C4849c c4849cM64678C3 = searchCoinFragment.m64678C3();
            if (c4849cM64678C3 == null || (constraintLayout = c4849cM64678C3.f4942g) == null) {
                return;
            }
            ViewExtKt.m66577h(constraintLayout);
            return;
        }
        C4849c c4849cM64678C4 = searchCoinFragment.m64678C3();
        if (c4849cM64678C4 != null && (constraintLayout2 = c4849cM64678C4.f4942g) != null) {
            ViewExtKt.m66594y(constraintLayout2);
        }
        searchCoinFragment.m64681H3().replaceData(list);
    }

    /* JADX INFO: renamed from: T3 */
    public static final SearchCoinAdapter m64649T3() {
        return new SearchCoinAdapter();
    }

    /* JADX INFO: renamed from: U3 */
    public static final SearchHistoryCoinAdapter m64650U3() {
        return new SearchHistoryCoinAdapter();
    }

    /* JADX INFO: renamed from: W3 */
    public static final Unit m64652W3(Throwable e11) {
        Intrinsics.checkNotNullParameter(e11, "e");
        TransferLog.f52948a.m64780b(e11);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: Y3 */
    public static final Unit m64654Y3(Ref.BooleanRef booleanRef, SearchCoinFragment searchCoinFragment, CharSequence charSequence) {
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
            searchCoinFragment.m64659d4(string.subSequence(i11, length + 1).toString());
        }
        booleanRef.element = true;
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: d4 */
    private final void m64659d4(String str) {
        this.f52876c0 = str;
        m64679D3().m64707G(str);
    }

    /* JADX INFO: renamed from: C3 */
    public final C4849c m64678C3() {
        return (C4849c) this.f52873Z.getValue(this, f52867h0[0]);
    }

    /* JADX INFO: renamed from: D3 */
    public final SearchCoinViewModel m64679D3() {
        return (SearchCoinViewModel) this.f52874a0.getValue();
    }

    /* JADX INFO: renamed from: G3 */
    public final SearchCoinAdapter m64680G3() {
        return (SearchCoinAdapter) this.f52875b0.getValue();
    }

    /* JADX INFO: renamed from: H3 */
    public final SearchHistoryCoinAdapter m64681H3() {
        return (SearchHistoryCoinAdapter) this.f52877d0.getValue();
    }

    /* JADX INFO: renamed from: I3 */
    public final String m64682I3() {
        return (String) this.f52870W.getValue();
    }

    /* JADX INFO: renamed from: Q3 */
    public final Boolean m64686Q3() {
        return (Boolean) this.f52871X.getValue();
    }

    /* JADX INFO: renamed from: e4 */
    public final void m64687e4(String str) {
        List mutableList;
        Intent intent = new Intent();
        intent.putExtra(AccountCoin.class.getName(), C27041f.m66668h(str));
        FragmentActivity activity = getActivity();
        if (activity != null) {
            activity.setResult(-1, intent);
        }
        if (this.f52868U) {
            mutableList = new ArrayList();
        } else {
            List<String> data = m64681H3().getData();
            Intrinsics.checkNotNullExpressionValue(data, "getData(...)");
            mutableList = CollectionsKt.toMutableList((Collection) data);
        }
        mutableList.remove(str);
        mutableList.add(0, str);
        C37825a.m85379c("coin_history", C27099x.m66919i(CollectionsKt.take(mutableList, 3), false, 2, null));
        preformBackPressed();
    }

    @Override // com.kubi.sdk.BaseFragment
    /* JADX INFO: renamed from: getNeedLoadingView, reason: from getter */
    public boolean getF19867U() {
        return this.f52879f0;
    }

    @Override // com.kubi.sdk.BaseFragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable Bundle savedInstanceState, @Nullable ViewGroup container) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View viewInflate = inflater.inflate(R$layout.btransfer_fragment_search, container, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
        return viewInflate;
    }

    @Override // com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        TextView textView;
        C4851e c4851e;
        ClearEditText clearEditText;
        TextView textView2;
        TextView textView3;
        RecyclerView recyclerView;
        SwipeRefreshRecyclerView swipeRefreshRecyclerView;
        AlertTipsTextView alertTipsTextView;
        C4851e c4851e2;
        BaseTextView baseTextView;
        C4851e c4851e3;
        ClearEditText clearEditText2;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        getTitleBar().m58934f();
        InterfaceC40863a interfaceC40863aM64642F3 = m64642F3();
        if (interfaceC40863aM64642F3 != null) {
            interfaceC40863aM64642F3.showLoading();
        }
        C4849c c4849cM64678C3 = m64678C3();
        if (c4849cM64678C3 != null && (c4851e3 = c4849cM64678C3.f4944i) != null && (clearEditText2 = c4851e3.f4963b) != null) {
            clearEditText2.setHint(R$string.search_coin);
            final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
            AbstractC46099a<CharSequence> abstractC46099aM784d = C0206f.m784d(clearEditText2);
            final Function1 function1 = new Function1() { // from class: com.kubi.transfer.search.coin.a
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return SearchCoinFragment.m64654Y3(booleanRef, this, (CharSequence) obj);
                }
            };
            Consumer<? super CharSequence> consumer = new Consumer() { // from class: com.kubi.transfer.search.coin.j
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    SearchCoinFragment.m64651V3(function1, obj);
                }
            };
            final Function1 function2 = new Function1() { // from class: com.kubi.transfer.search.coin.k
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return SearchCoinFragment.m64652W3((Throwable) obj);
                }
            };
            Disposable disposableSubscribe = abstractC46099aM784d.subscribe(consumer, new Consumer() { // from class: com.kubi.transfer.search.coin.l
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    SearchCoinFragment.m64653X3(function2, obj);
                }
            });
            Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
            DisposableKt.addTo(disposableSubscribe, getDestroyDisposable());
        }
        C4849c c4849cM64678C4 = m64678C3();
        if (c4849cM64678C4 != null && (c4851e2 = c4849cM64678C4.f4944i) != null && (baseTextView = c4851e2.f4964c) != null) {
            C27046k.m66711z(baseTextView, 0L, new Function0() { // from class: com.kubi.transfer.search.coin.m
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return SearchCoinFragment.m64655Z3(this.f52899b);
                }
            }, 1, null);
        }
        C4849c c4849cM64678C5 = m64678C3();
        if (c4849cM64678C5 != null && (alertTipsTextView = c4849cM64678C5.f4939d) != null) {
            C26268b.m64515d(alertTipsTextView, Intrinsics.areEqual(m64641E3(), "SAVINGS"));
        }
        m64680G3().setOnItemClickListener(new BaseQuickAdapter.OnItemClickListener() { // from class: com.kubi.transfer.search.coin.n
            @Override // io.chad.library.adapter.base.BaseQuickAdapter.OnItemClickListener
            public final void onItemClick(BaseQuickAdapter baseQuickAdapter, View view2, int i11) {
                SearchCoinFragment.m64656a4(this.f52900a, baseQuickAdapter, view2, i11);
            }
        });
        m64681H3().setOnItemClickListener(new BaseQuickAdapter.OnItemClickListener() { // from class: com.kubi.transfer.search.coin.o
            @Override // io.chad.library.adapter.base.BaseQuickAdapter.OnItemClickListener
            public final void onItemClick(BaseQuickAdapter baseQuickAdapter, View view2, int i11) {
                SearchCoinFragment.m64657b4(this.f52901a, baseQuickAdapter, view2, i11);
            }
        });
        C4849c c4849cM64678C6 = m64678C3();
        if (c4849cM64678C6 != null && (swipeRefreshRecyclerView = c4849cM64678C6.f4943h) != null) {
            swipeRefreshRecyclerView.setEnabled(false);
            swipeRefreshRecyclerView.getRecyclerView().setAdapter(m64680G3());
        }
        C4849c c4849cM64678C7 = m64678C3();
        if (c4849cM64678C7 != null && (recyclerView = c4849cM64678C7.f4940e) != null) {
            recyclerView.setAdapter(m64681H3());
        }
        C4849c c4849cM64678C8 = m64678C3();
        if (c4849cM64678C8 != null && (textView3 = c4849cM64678C8.f4946k) != null) {
            textView3.setText(getString(R$string.coin));
        }
        if (C27025c.m66566d(m64686Q3())) {
            C4849c c4849cM64678C9 = m64678C3();
            if (c4849cM64678C9 != null && (textView2 = c4849cM64678C9.f4945j) != null) {
                textView2.setText(getString(R$string.useful));
            }
        } else {
            C4849c c4849cM64678C10 = m64678C3();
            if (c4849cM64678C10 != null && (textView = c4849cM64678C10.f4945j) != null) {
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                String string = getString(R$string.transfer_coinlist_available);
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                AccountType accountTypeOfName = AccountType.INSTANCE.ofName(m64641E3());
                if (accountTypeOfName == null) {
                    accountTypeOfName = AccountType.MAIN;
                }
                String str = String.format(string, Arrays.copyOf(new Object[]{getString(accountTypeOfName.getStrRes())}, 1));
                Intrinsics.checkNotNullExpressionValue(str, "format(...)");
                textView.setText(str);
            }
        }
        C4849c c4849cM64678C11 = m64678C3();
        if (c4849cM64678C11 != null && (c4851e = c4849cM64678C11.f4944i) != null && (clearEditText = c4851e.f4963b) != null) {
            clearEditText.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: com.kubi.transfer.search.coin.p
                @Override // android.widget.TextView.OnEditorActionListener
                public final boolean onEditorAction(TextView textView4, int i11, KeyEvent keyEvent) {
                    return SearchCoinFragment.m64658c4(this.f52902b, textView4, i11, keyEvent);
                }
            });
        }
        m64684L3();
    }

    @Override // com.kubi.sdk.BaseFragment
    public void setNeedLoadingView(boolean z11) {
        this.f52879f0 = z11;
    }

    public SearchCoinFragment() {
        final Function0 function0 = null;
        this.f52874a0 = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(SearchCoinViewModel.class), new Function0<ViewModelStore>() { // from class: com.kubi.transfer.search.coin.SearchCoinFragment$special$$inlined$activityViewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.kubi.transfer.search.coin.SearchCoinFragment$special$$inlined$activityViewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.kubi.transfer.search.coin.SearchCoinFragment$special$$inlined$activityViewModels$default$3
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
        setPageId("B1transferCoinList");
    }

    /* JADX INFO: renamed from: B3 */
    public static final String m64640B3(SearchCoinFragment searchCoinFragment) {
        String string;
        Bundle arguments = searchCoinFragment.getArguments();
        if (arguments != null) {
            string = arguments.getString("from");
        } else {
            string = null;
        }
        return C27041f.m66668h(string);
    }

    /* JADX INFO: renamed from: K3 */
    public static final void m64643K3(SearchCoinFragment searchCoinFragment, String str, String str2, List list) {
        Object next;
        CoinInfoEntity coinInfoEntity;
        Intrinsics.checkNotNull(list);
        Iterator it = list.iterator();
        do {
            if (it.hasNext()) {
                next = it.next();
                coinInfoEntity = (CoinInfoEntity) next;
                if (Intrinsics.areEqual(coinInfoEntity.getCurrency(), str2)) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        } while (!Intrinsics.areEqual(coinInfoEntity.getCode(), str2));
        CoinInfoEntity coinInfoEntity2 = (CoinInfoEntity) next;
        if (coinInfoEntity2 == null) {
            searchCoinFragment.m64687e4(str);
            TransferLog.f52948a.m64779a((char) 35813 + str + "的无远端数据or请求失败or无缓存");
            return;
        }
        searchCoinFragment.m64687e4(coinInfoEntity2.getCurrency());
    }

    /* JADX INFO: renamed from: P3 */
    public static final Unit m64646P3(SearchCoinFragment searchCoinFragment) {
        searchCoinFragment.m64679D3().m64708w();
        searchCoinFragment.f52868U = true;
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: R3 */
    public static final Boolean m64647R3(SearchCoinFragment searchCoinFragment) {
        Bundle arguments = searchCoinFragment.getArguments();
        if (arguments != null) {
            return Boolean.valueOf(arguments.getBoolean("is_multi_account", false));
        }
        return null;
    }

    /* JADX INFO: renamed from: S3 */
    public static final InitLoadView m64648S3(SearchCoinFragment searchCoinFragment) {
        C4849c c4849cM64678C3 = searchCoinFragment.m64678C3();
        if (c4849cM64678C3 != null) {
            WrapperLoadingView wrapperLoadingViewInjectView = WrapperLoadingView.injectView(c4849cM64678C3.f4943h);
            Intrinsics.checkNotNullExpressionValue(wrapperLoadingViewInjectView, "injectView(...)");
            return new InitLoadView(wrapperLoadingViewInjectView);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V3 */
    public static final void m64651V3(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X3 */
    public static final void m64653X3(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: Z3 */
    public static final Unit m64655Z3(SearchCoinFragment searchCoinFragment) {
        searchCoinFragment.preformBackPressed();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: f4 */
    public static final String m64660f4(SearchCoinFragment searchCoinFragment) {
        String string;
        Bundle arguments = searchCoinFragment.getArguments();
        if (arguments != null) {
            string = arguments.getString(TypedValues.TransitionType.S_TO);
        } else {
            string = null;
        }
        return C27041f.m66668h(string);
    }

    /* JADX INFO: renamed from: L3 */
    public final void m64684L3() {
        List<String> listListOf;
        if (C27025c.m66566d(m64686Q3())) {
            listListOf = new TransferHelper().m64488i();
        } else {
            listListOf = CollectionsKt.listOf(m64641E3());
        }
        this.f52872Y = listListOf;
        m64679D3().m64709z(m64641E3(), this.f52872Y, m64682I3()).observe(getViewLifecycleOwner(), new Observer() { // from class: com.kubi.transfer.search.coin.f
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                SearchCoinFragment.m64644M3(this.f52891b, (List) obj);
            }
        });
    }

    /* JADX INFO: renamed from: N3 */
    public final void m64685N3() {
        ImageView imageView;
        m64679D3().m64705B().observe(getViewLifecycleOwner(), new Observer() { // from class: com.kubi.transfer.search.coin.h
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                SearchCoinFragment.m64645O3(this.f52895b, (List) obj);
            }
        });
        C4849c c4849cM64678C3 = m64678C3();
        if (c4849cM64678C3 != null && (imageView = c4849cM64678C3.f4941f) != null) {
            C27046k.m66711z(imageView, 0L, new Function0() { // from class: com.kubi.transfer.search.coin.i
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return SearchCoinFragment.m64646P3(this.f52896b);
                }
            }, 1, null);
        }
    }
}
