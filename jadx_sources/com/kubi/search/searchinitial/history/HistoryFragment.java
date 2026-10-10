package com.kubi.search.searchinitial.history;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.media3.extractor.text.ttml.TtmlNode;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.flexbox.FlexboxLayoutManager;
import com.kubi.p110rn.modules.RNH5InterActionHelperKt;
import com.kubi.resources.C22912t;
import com.kubi.sdk.BaseFragment;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.search.R$layout;
import com.kubi.search.entity.SearchHistoryBean;
import com.kubi.search.searchinitial.adapter.InitialHistoryAdapter;
import com.kubi.utils.C27100x0;
import com.kubi.utils.extensions.C27046k;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
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
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KProperty;
import q10.C43582b;
import w00.C45681e;

/* JADX INFO: compiled from: HistoryFragment.kt */
/* JADX INFO: loaded from: classes44.dex */
@Metadata(m90083d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J\u001a\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u00162\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J\u0016\u0010 \u001a\u00020\u001e2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020#0\"H\u0003J\b\u0010$\u001a\u00020\u001eH\u0016J\b\u0010%\u001a\u00020\u001eH\u0016R\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u00058@X\u0080\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\n\u001a\u00020\u000b8@X\u0080\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u001b\u0010\u0010\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u000f\u001a\u0004\b\u0012\u0010\u0013¨\u0006&"}, m90084d2 = {"Lcom/kubi/search/searchinitial/history/HistoryFragment;", "Lcom/kubi/sdk/BaseFragment;", "<init>", "()V", "binding", "Lcom/kubi/search/databinding/SearchFragmentHistoryBinding;", "getBinding$SearchLib_googleRelease", "()Lcom/kubi/search/databinding/SearchFragmentHistoryBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "vm", "Lcom/kubi/search/searchinitial/history/HistoryVM;", "getVm$SearchLib_googleRelease", "()Lcom/kubi/search/searchinitial/history/HistoryVM;", "vm$delegate", "Lkotlin/Lazy;", "historyAdapter", "Lcom/kubi/search/searchinitial/adapter/InitialHistoryAdapter;", "getHistoryAdapter", "()Lcom/kubi/search/searchinitial/adapter/InitialHistoryAdapter;", "historyAdapter$delegate", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "savedInstanceState", "Landroid/os/Bundle;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "onViewCreated", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "refreshView", "dataList", "", "Lcom/kubi/search/entity/SearchHistoryBean;", RNH5InterActionHelperKt.EVENT_NAME_ON_SHOW, RNH5InterActionHelperKt.EVENT_NAME_ON_HIDE, "SearchLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nHistoryFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HistoryFragment.kt\ncom/kubi/search/searchinitial/history/HistoryFragment\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 MviEx.kt\ncom/kubi/mvi/common/MviExKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,66:1\n147#2,16:67\n220#3,5:83\n1#4:88\n*S KotlinDebug\n*F\n+ 1 HistoryFragment.kt\ncom/kubi/search/searchinitial/history/HistoryFragment\n*L\n29#1:67,16\n30#1:83,5\n*E\n"})
public final class HistoryFragment extends BaseFragment {

    /* JADX INFO: renamed from: X */
    public static final /* synthetic */ KProperty<Object>[] f48913X = {Reflection.property1(new PropertyReference1Impl(HistoryFragment.class, "binding", "getBinding$SearchLib_googleRelease()Lcom/kubi/search/databinding/SearchFragmentHistoryBinding;", 0))};

    /* JADX INFO: renamed from: U */
    @NotNull
    public final InterfaceC24293a f48914U = C45681e.m100799e(this, new Function1<HistoryFragment, C43582b>() { // from class: com.kubi.search.searchinitial.history.HistoryFragment$special$$inlined$viewBindingFragment$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C43582b invoke(@NotNull HistoryFragment fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C43582b.m95914a(this.this$0.getContentView());
        }

        {
            super(1);
        }
    }, new Function1<C43582b, Unit>() { // from class: com.kubi.search.searchinitial.history.HistoryFragment$special$$inlined$viewBindingFragment$1
        public final void invoke(@NotNull C43582b it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C43582b c43582b) {
            invoke(c43582b);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: V */
    @NotNull
    public final Lazy f48915V = LazyKt.lazy(new Function0() { // from class: com.kubi.search.searchinitial.history.a
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return HistoryFragment.m59218w3(this.f48919b);
        }
    });

    /* JADX INFO: renamed from: W */
    @NotNull
    public final Lazy f48916W = LazyKt.lazy(new Function0() { // from class: com.kubi.search.searchinitial.history.b
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return HistoryFragment.m59214r3();
        }
    });

    /* JADX INFO: renamed from: com.kubi.search.searchinitial.history.HistoryFragment$a */
    /* JADX INFO: compiled from: HistoryFragment.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C24391a implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Function1 f48917b;

        public C24391a(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f48917b = function;
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
            return this.f48917b;
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f48917b.invoke(obj);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    /* JADX INFO: renamed from: r3 */
    public static final InitialHistoryAdapter m59214r3() {
        return new InitialHistoryAdapter();
    }

    /* JADX INFO: renamed from: t3 */
    public static final Unit m59216t3(HistoryFragment historyFragment, List list) {
        if (list != null) {
            historyFragment.m59222u3(list);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: w3 */
    public static final HistoryVM m59218w3(HistoryFragment historyFragment) {
        return (HistoryVM) new ViewModelProvider(historyFragment).get(HistoryVM.class);
    }

    @Nullable
    /* JADX INFO: renamed from: o3 */
    public final C43582b m59219o3() {
        return (C43582b) this.f48914U.getValue(this, f48913X[0]);
    }

    @Override // com.kubi.sdk.BaseFragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable Bundle savedInstanceState, @Nullable ViewGroup container) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View viewInflate = inflater.inflate(R$layout.search_fragment_history, container, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
        return viewInflate;
    }

    @Override // com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        C43582b c43582bM59219o3 = m59219o3();
        if (c43582bM59219o3 == null) {
            return;
        }
        ImageView ivHistoryClean = c43582bM59219o3.f96182b;
        Intrinsics.checkNotNullExpressionValue(ivHistoryClean, "ivHistoryClean");
        C27046k.m66711z(ivHistoryClean, 0L, new Function0() { // from class: com.kubi.search.searchinitial.history.c
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return HistoryFragment.m59215s3(this.f48920b);
            }
        }, 1, null);
        RecyclerView rvHistory = c43582bM59219o3.f96183c;
        Intrinsics.checkNotNullExpressionValue(rvHistory, "rvHistory");
        C22912t.m54409g(rvHistory, false);
        c43582bM59219o3.f96183c.setLayoutManager(new FlexboxLayoutManager(getContext(), 0));
        c43582bM59219o3.f96183c.setAdapter(m59220p3());
        m59221q3().m59234s().observe(getViewLifecycleOwner(), new C24391a(new Function1() { // from class: com.kubi.search.searchinitial.history.d
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return HistoryFragment.m59216t3(this.f48921b, (List) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: p3 */
    public final InitialHistoryAdapter m59220p3() {
        return (InitialHistoryAdapter) this.f48916W.getValue();
    }

    @NotNull
    /* JADX INFO: renamed from: q3 */
    public final HistoryVM m59221q3() {
        return (HistoryVM) this.f48915V.getValue();
    }

    @SuppressLint({"NotifyDataSetChanged"})
    /* JADX INFO: renamed from: u3 */
    public final void m59222u3(final List<SearchHistoryBean> list) {
        C27100x0.m66923d(new Function0() { // from class: com.kubi.search.searchinitial.history.e
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return HistoryFragment.m59217v3(this.f48922b, list);
            }
        });
    }

    /* JADX INFO: renamed from: s3 */
    public static final Unit m59215s3(HistoryFragment historyFragment) {
        historyFragment.m59221q3().m59232n();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: v3 */
    public static final Unit m59217v3(HistoryFragment historyFragment, List list) {
        ConstraintLayout root;
        ConstraintLayout root2;
        historyFragment.m59220p3().setNewData(list);
        historyFragment.m59220p3().notifyDataSetChanged();
        boolean zIsEmpty = list.isEmpty();
        C43582b c43582bM59219o3 = historyFragment.m59219o3();
        if (zIsEmpty) {
            if (c43582bM59219o3 != null && (root2 = c43582bM59219o3.getRoot()) != null) {
                C27046k.m66700o(root2);
            }
        } else if (c43582bM59219o3 != null && (root = c43582bM59219o3.getRoot()) != null) {
            C27046k.m66685H(root);
        }
        return Unit.INSTANCE;
    }

    @Override // com.kubi.sdk.BaseFragment
    public void onHide() {
        super.onHide();
        m59221q3().onHide();
    }

    @Override // com.kubi.sdk.BaseFragment
    public void onShow() throws Throwable {
        super.onShow();
        m59221q3().onShow();
    }
}
