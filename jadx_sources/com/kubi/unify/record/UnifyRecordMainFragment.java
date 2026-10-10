package com.kubi.unify.record;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.facebook.react.uimanager.ViewProps;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.router.utils.RouteExKt;
import com.kubi.sdk.BaseFragment;
import com.kubi.sdk.base.p113ui.BasePagingFragment;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.unify.R$id;
import com.kubi.unify.R$layout;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.core.ViewExtKt;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import l60.C42109d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p203di.AbstractC36711s;
import p203di.C36707o;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KProperty;
import w00.C45681e;

/* JADX INFO: compiled from: UnifyRecordMainFragment.kt */
/* JADX INFO: loaded from: classes52.dex */
@Metadata(m90083d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010,2\b\u0010-\u001a\u0004\u0018\u00010.H\u0016J\u001a\u0010/\u001a\u0002002\u0006\u00101\u001a\u00020(2\b\u0010+\u001a\u0004\u0018\u00010,H\u0016J\u0010\u00102\u001a\u0002002\u0006\u00103\u001a\u000204H\u0002R\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u001b\u0010\u0010\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u000f\u001a\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0015\u001a\u00020\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u000f\u001a\u0004\b\u0017\u0010\u0018R\u001d\u0010\u001a\u001a\u0004\u0018\u00010\u00168FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u000f\u001a\u0004\b\u001b\u0010\u0018R\u001d\u0010\u001d\u001a\u0004\u0018\u00010\u001e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\u000f\u001a\u0004\b\u001f\u0010 R\u001d\u0010\"\u001a\u0004\u0018\u00010#8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b&\u0010\u000f\u001a\u0004\b$\u0010%¨\u00065"}, m90084d2 = {"Lcom/kubi/unify/record/UnifyRecordMainFragment;", "Lcom/kubi/sdk/BaseFragment;", "<init>", "()V", "binding", "Lcom/kubi/unify/databinding/FragmentUnifyRecordsBinding;", "getBinding", "()Lcom/kubi/unify/databinding/FragmentUnifyRecordsBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "interestRecordFragment", "Lcom/kubi/unify/record/UnifyInterestRecordFragment;", "getInterestRecordFragment", "()Lcom/kubi/unify/record/UnifyInterestRecordFragment;", "interestRecordFragment$delegate", "Lkotlin/Lazy;", "convertRecordFragment", "Lcom/kubi/unify/record/UnifyConvertRecordFragment;", "getConvertRecordFragment", "()Lcom/kubi/unify/record/UnifyConvertRecordFragment;", "convertRecordFragment$delegate", "recordType", "", "getRecordType", "()Ljava/lang/String;", "recordType$delegate", "inputCurrency", "getInputCurrency", "inputCurrency$delegate", "bizFilter", "Lcom/kubi/unify/record/BizTypeClickFilter;", "getBizFilter", "()Lcom/kubi/unify/record/BizTypeClickFilter;", "bizFilter$delegate", "timeFilter", "Lcom/kubi/futures/history/filter/TimeClickFilter;", "getTimeFilter", "()Lcom/kubi/futures/history/filter/TimeClickFilter;", "timeFilter$delegate", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "savedInstanceState", "Landroid/os/Bundle;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "onViewCreated", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "setFromFilterGone", ViewProps.VISIBLE, "", "BUnifyAccountLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nUnifyRecordMainFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UnifyRecordMainFragment.kt\ncom/kubi/unify/record/UnifyRecordMainFragment\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,97:1\n147#2,16:98\n1869#3,2:114\n774#3:116\n865#3,2:117\n808#3,11:119\n1869#3,2:130\n*S KotlinDebug\n*F\n+ 1 UnifyRecordMainFragment.kt\ncom/kubi/unify/record/UnifyRecordMainFragment\n*L\n27#1:98,16\n57#1:114,2\n76#1:116\n76#1:117,2\n77#1:119,11\n77#1:130,2\n*E\n"})
public final class UnifyRecordMainFragment extends BaseFragment {

    /* JADX INFO: renamed from: b0 */
    public static final /* synthetic */ KProperty<Object>[] f53324b0 = {Reflection.property1(new PropertyReference1Impl(UnifyRecordMainFragment.class, "binding", "getBinding()Lcom/kubi/unify/databinding/FragmentUnifyRecordsBinding;", 0))};

    /* JADX INFO: renamed from: U */
    @NotNull
    public final InterfaceC24293a f53325U = C45681e.m100799e(this, new Function1<UnifyRecordMainFragment, C42109d>() { // from class: com.kubi.unify.record.UnifyRecordMainFragment$special$$inlined$viewBindingFragment$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C42109d invoke(@NotNull UnifyRecordMainFragment fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C42109d.m92373a(this.this$0.getContentView());
        }

        {
            super(1);
        }
    }, new Function1<C42109d, Unit>() { // from class: com.kubi.unify.record.UnifyRecordMainFragment$special$$inlined$viewBindingFragment$1
        public final void invoke(@NotNull C42109d it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C42109d c42109d) {
            invoke(c42109d);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: V */
    @NotNull
    public final Lazy f53326V = LazyKt.lazy(new Function0() { // from class: com.kubi.unify.record.r
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return UnifyRecordMainFragment.m65294B3();
        }
    });

    /* JADX INFO: renamed from: W */
    @NotNull
    public final Lazy f53327W = LazyKt.lazy(new Function0() { // from class: com.kubi.unify.record.s
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return UnifyRecordMainFragment.m65308s3();
        }
    });

    /* JADX INFO: renamed from: X */
    @NotNull
    public final Lazy f53328X = LazyKt.lazy(new Function0() { // from class: com.kubi.unify.record.t
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return UnifyRecordMainFragment.m65297E3(this.f53344b);
        }
    });

    /* JADX INFO: renamed from: Y */
    @NotNull
    public final Lazy f53329Y = LazyKt.lazy(new Function0() { // from class: com.kubi.unify.record.u
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return UnifyRecordMainFragment.m65293A3(this.f53345b);
        }
    });

    /* JADX INFO: renamed from: Z */
    @NotNull
    public final Lazy f53330Z = LazyKt.lazy(new Function0() { // from class: com.kubi.unify.record.v
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return UnifyRecordMainFragment.m65307r3(this.f53346b);
        }
    });

    /* JADX INFO: renamed from: a0 */
    @NotNull
    public final Lazy f53331a0 = LazyKt.lazy(new Function0() { // from class: com.kubi.unify.record.w
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return UnifyRecordMainFragment.m65298G3(this.f53347b);
        }
    });

    /* JADX INFO: renamed from: B3 */
    public static final UnifyInterestRecordFragment m65294B3() {
        return new UnifyInterestRecordFragment();
    }

    /* JADX INFO: renamed from: s3 */
    public static final UnifyConvertRecordFragment m65308s3() {
        return new UnifyConvertRecordFragment();
    }

    /* JADX INFO: renamed from: F3 */
    public final void m65309F3(boolean z11) {
        BaseTextView baseTextView;
        View view;
        BaseTextView baseTextView2;
        View view2;
        if (z11) {
            C42109d c42109dM65310t3 = m65310t3();
            if (c42109dM65310t3 != null && (view2 = c42109dM65310t3.f93475c) != null) {
                ViewExtKt.m66594y(view2);
            }
            C42109d c42109dM65310t4 = m65310t3();
            if (c42109dM65310t4 == null || (baseTextView2 = c42109dM65310t4.f93474b) == null) {
                return;
            }
            ViewExtKt.m66594y(baseTextView2);
            return;
        }
        C42109d c42109dM65310t5 = m65310t3();
        if (c42109dM65310t5 != null && (view = c42109dM65310t5.f93475c) != null) {
            ViewExtKt.m66577h(view);
        }
        C42109d c42109dM65310t6 = m65310t3();
        if (c42109dM65310t6 == null || (baseTextView = c42109dM65310t6.f93474b) == null) {
            return;
        }
        ViewExtKt.m66577h(baseTextView);
    }

    @Override // com.kubi.sdk.BaseFragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable Bundle savedInstanceState, @Nullable ViewGroup container) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View viewInflate = inflater.inflate(R$layout.fragment_unify_records, container, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
        return viewInflate;
    }

    @Override // com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        BizTypeClickFilter bizTypeClickFilterM65311u3 = m65311u3();
        if (bizTypeClickFilterM65311u3 != null) {
            AbstractC36711s.m82222h(bizTypeClickFilterM65311u3, null, new Function0() { // from class: com.kubi.unify.record.x
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return UnifyRecordMainFragment.m65295C3(this.f53348b);
                }
            }, 1, null);
        }
        BizTypeClickFilter bizTypeClickFilterM65311u4 = m65311u3();
        if (bizTypeClickFilterM65311u4 != null) {
            bizTypeClickFilterM65311u4.m82230m(m65315y3());
        }
        C36707o c36707oM65316z3 = m65316z3();
        if (c36707oM65316z3 != null) {
            c36707oM65316z3.m82211h(new Function0() { // from class: com.kubi.unify.record.y
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return UnifyRecordMainFragment.m65296D3(this.f53349b);
                }
            });
        }
    }

    @Nullable
    /* JADX INFO: renamed from: t3 */
    public final C42109d m65310t3() {
        return (C42109d) this.f53325U.getValue(this, f53324b0[0]);
    }

    /* JADX INFO: renamed from: u3 */
    public final BizTypeClickFilter m65311u3() {
        return (BizTypeClickFilter) this.f53330Z.getValue();
    }

    /* JADX INFO: renamed from: v3 */
    public final UnifyConvertRecordFragment m65312v3() {
        return (UnifyConvertRecordFragment) this.f53327W.getValue();
    }

    @Nullable
    /* JADX INFO: renamed from: w3 */
    public final String m65313w3() {
        return (String) this.f53329Y.getValue();
    }

    /* JADX INFO: renamed from: x3 */
    public final UnifyInterestRecordFragment m65314x3() {
        return (UnifyInterestRecordFragment) this.f53326V.getValue();
    }

    /* JADX INFO: renamed from: y3 */
    public final String m65315y3() {
        return (String) this.f53328X.getValue();
    }

    @Nullable
    /* JADX INFO: renamed from: z3 */
    public final C36707o m65316z3() {
        return (C36707o) this.f53331a0.getValue();
    }

    /* JADX INFO: renamed from: A3 */
    public static final String m65293A3(UnifyRecordMainFragment unifyRecordMainFragment) {
        Bundle arguments = unifyRecordMainFragment.getArguments();
        if (arguments != null) {
            return RouteExKt.m56284y(arguments, FirebaseAnalytics.Param.CURRENCY);
        }
        return null;
    }

    /* JADX INFO: renamed from: C3 */
    public static final Unit m65295C3(UnifyRecordMainFragment unifyRecordMainFragment) {
        String f79626c;
        FragmentTransaction fragmentTransactionBeginTransaction = unifyRecordMainFragment.getChildFragmentManager().beginTransaction();
        Intrinsics.checkNotNullExpressionValue(fragmentTransactionBeginTransaction, "beginTransaction(...)");
        List<Fragment> fragments = unifyRecordMainFragment.getChildFragmentManager().getFragments();
        Intrinsics.checkNotNullExpressionValue(fragments, "getFragments(...)");
        Iterator<T> it = fragments.iterator();
        while (it.hasNext()) {
            fragmentTransactionBeginTransaction.remove((Fragment) it.next());
        }
        fragmentTransactionBeginTransaction.commitNowAllowingStateLoss();
        BizTypeClickFilter bizTypeClickFilterM65311u3 = unifyRecordMainFragment.m65311u3();
        if (bizTypeClickFilterM65311u3 != null) {
            f79626c = bizTypeClickFilterM65311u3.getF79626c();
        } else {
            f79626c = null;
        }
        unifyRecordMainFragment.m65309F3(Intrinsics.areEqual(f79626c, "convert"));
        if (Intrinsics.areEqual(f79626c, "interest")) {
            fragmentTransactionBeginTransaction.add(R$id.fragmentContainer, unifyRecordMainFragment.m65314x3());
        } else if (Intrinsics.areEqual(f79626c, "convert")) {
            fragmentTransactionBeginTransaction.add(R$id.fragmentContainer, unifyRecordMainFragment.m65312v3());
        }
        fragmentTransactionBeginTransaction.commitNowAllowingStateLoss();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: D3 */
    public static final Unit m65296D3(UnifyRecordMainFragment unifyRecordMainFragment) {
        List<Fragment> fragments = unifyRecordMainFragment.getChildFragmentManager().getFragments();
        Intrinsics.checkNotNullExpressionValue(fragments, "getFragments(...)");
        ArrayList arrayList = new ArrayList();
        for (Object obj : fragments) {
            Fragment fragment = (Fragment) obj;
            if (fragment.isAdded() && fragment.getView() != null) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (obj2 instanceof BasePagingFragment) {
                arrayList2.add(obj2);
            }
        }
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            ((BasePagingFragment) it.next()).mo15906F3();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: E3 */
    public static final String m65297E3(UnifyRecordMainFragment unifyRecordMainFragment) {
        String strM56284y;
        Bundle arguments = unifyRecordMainFragment.getArguments();
        if (arguments != null) {
            strM56284y = RouteExKt.m56284y(arguments, "recordType");
        } else {
            strM56284y = null;
        }
        return C27041f.m66669i(strM56284y, "interest");
    }

    /* JADX INFO: renamed from: G3 */
    public static final C36707o m65298G3(UnifyRecordMainFragment unifyRecordMainFragment) {
        C42109d c42109dM65310t3 = unifyRecordMainFragment.m65310t3();
        if (c42109dM65310t3 != null) {
            BaseTextView timeFilter = c42109dM65310t3.f93481i;
            Intrinsics.checkNotNullExpressionValue(timeFilter, "timeFilter");
            View line = c42109dM65310t3.f93479g;
            Intrinsics.checkNotNullExpressionValue(line, "line");
            return new C36707o(timeFilter, line, false, 4, null);
        }
        return null;
    }

    /* JADX INFO: renamed from: r3 */
    public static final BizTypeClickFilter m65307r3(UnifyRecordMainFragment unifyRecordMainFragment) {
        C42109d c42109dM65310t3 = unifyRecordMainFragment.m65310t3();
        if (c42109dM65310t3 != null) {
            BaseTextView typeFilter = c42109dM65310t3.f93482j;
            Intrinsics.checkNotNullExpressionValue(typeFilter, "typeFilter");
            View line = c42109dM65310t3.f93479g;
            Intrinsics.checkNotNullExpressionValue(line, "line");
            return new BizTypeClickFilter(typeFilter, line);
        }
        return null;
    }
}
