package com.kubi.unify.funds;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Observer;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.resources.dialog.DialogFragmentHelper;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.sdk.viewbindingdelegate.base.LazyViewBindingProperty;
import com.kubi.sdk.viewbindingdelegate.internal.UtilsKt;
import com.kubi.sdk.widget.dialog.BottomSheetDialogHelper;
import com.kubi.sdk.widget.dialog.SelectEntity;
import com.kubi.unify.R$color;
import com.kubi.unify.R$layout;
import com.kubi.unify.R$string;
import com.kubi.unify.UnifyStoreIds;
import com.kubi.utils.extensions.C27046k;
import io.chad.library.adapter.base.BaseViewHolder;
import io.reactivex.functions.BiConsumer;
import l60.C42114i;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Function;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
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
import w00.C45682f;
import y70.C46392a;

/* JADX INFO: compiled from: UnifyHideSmallView.kt */
/* JADX INFO: loaded from: classes52.dex */
@Metadata(m90083d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u0011\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005B\u001b\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0004\u0010\bJ\u0016\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014J\u0018\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0002R\u001d\u0010\t\u001a\u0004\u0018\u00010\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, m90084d2 = {"Lcom/kubi/unify/funds/UnifyHideSmallView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "attributeSet", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "viewBind", "Lcom/kubi/unify/databinding/ViewUnifyHideSmallBinding;", "getViewBind", "()Lcom/kubi/unify/databinding/ViewUnifyHideSmallBinding;", "viewBind$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "initView", "", "fragment", "Lcom/kubi/unify/funds/UnifyFundsInfoFragment;", "vm", "Lcom/kubi/unify/funds/UnifyFundsInfoViewModel;", "showToggleSortTypeDialog", "Companion", "BUnifyAccountLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nUnifyHideSmallView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UnifyHideSmallView.kt\ncom/kubi/unify/funds/UnifyHideSmallView\n+ 2 ViewGroupBindings.kt\ncom/kubi/sdk/viewbindingdelegate/ViewGroupBindingsKt\n+ 3 StorageIdEx.kt\ncom/kubi/utils/storage/StorageIdExKt\n*L\n1#1,95:1\n52#2:96\n80#2,7:97\n136#3:104\n32#3:105\n*S KotlinDebug\n*F\n+ 1 UnifyHideSmallView.kt\ncom/kubi/unify/funds/UnifyHideSmallView\n*L\n26#1:96\n26#1:97,7\n39#1:104\n40#1:105\n*E\n"})
public final class UnifyHideSmallView extends FrameLayout {

    /* JADX INFO: renamed from: b */
    @NotNull
    public final InterfaceC24293a f53196b;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ KProperty<Object>[] f53195d = {Reflection.property1(new PropertyReference1Impl(UnifyHideSmallView.class, "viewBind", "getViewBind()Lcom/kubi/unify/databinding/ViewUnifyHideSmallBinding;", 0))};

    /* JADX INFO: renamed from: c */
    @NotNull
    public static final Companion f53194c = new Companion(null);

    /* JADX INFO: compiled from: UnifyHideSmallView.kt */
    @Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, m90084d2 = {"Lcom/kubi/unify/funds/UnifyHideSmallView$Companion;", "", "<init>", "()V", "SORT_TYPE_DEFAULT", "", "SORT_TYPE_VALUE", "SORT_TYPE_CURRENCY", "BUnifyAccountLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: com.kubi.unify.funds.UnifyHideSmallView$a */
    /* JADX INFO: compiled from: UnifyHideSmallView.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C26528a implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Function1 f53197b;

        public C26528a(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f53197b = function;
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
            return this.f53197b;
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f53197b.invoke(obj);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public UnifyHideSmallView(@NotNull Context context) {
        this(context, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnifyHideSmallView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f53196b = new LazyViewBindingProperty(UtilsKt.m58554b(), new Function1<ViewGroup, C42114i>() { // from class: com.kubi.unify.funds.UnifyHideSmallView$special$$inlined$customViewBinding$1
            @Override // p852kotlin.jvm.functions.Function1
            @NotNull
            public final C42114i invoke(@NotNull ViewGroup viewGroup) {
                Intrinsics.checkNotNullParameter(viewGroup, "viewGroup");
                return C42114i.m92383a(C45682f.m100800a(viewGroup));
            }
        });
        LayoutInflater.from(getContext()).inflate(R$layout.view_unify_hide_small, this);
    }

    /* JADX INFO: renamed from: g */
    public static final Unit m65189g(C42114i c42114i, Boolean bool) {
        CheckBox checkBox = c42114i.f93540b;
        Intrinsics.checkNotNull(bool);
        checkBox.setChecked(bool.booleanValue());
        return Unit.INSTANCE;
    }

    private final C42114i getViewBind() {
        return (C42114i) this.f53196b.getValue(this, f53195d[0]);
    }

    /* JADX INFO: renamed from: h */
    public static final Unit m65190h(C42114i c42114i, UnifyHideSmallView unifyHideSmallView, String str) {
        if (Intrinsics.areEqual(str, "default")) {
            AppCompatImageView ivSortView = c42114i.f93541c;
            Intrinsics.checkNotNullExpressionValue(ivSortView, "ivSortView");
            C27046k.m66701p(ivSortView, unifyHideSmallView.getResources().getColor(R$color.c_icon));
        } else {
            AppCompatImageView ivSortView2 = c42114i.f93541c;
            Intrinsics.checkNotNullExpressionValue(ivSortView2, "ivSortView");
            C27046k.m66701p(ivSortView2, unifyHideSmallView.getResources().getColor(R$color.primary));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: i */
    public static final Unit m65191i(UnifyFundsInfoViewModel unifyFundsInfoViewModel, CompoundButton compoundButton, boolean z11) {
        Intrinsics.checkNotNullParameter(compoundButton, "<unused var>");
        unifyFundsInfoViewModel.m65207s(z11);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: f */
    public final void m65194f(@NotNull final UnifyFundsInfoFragment fragment, @NotNull final UnifyFundsInfoViewModel vm2) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(vm2, "vm");
        UnifyStoreIds unifyStoreIds = UnifyStoreIds.f53305a;
        vm2.m65207s(C46392a.m102322d(unifyStoreIds.m65248j(), false));
        vm2.m65208t(C46392a.m102326h(unifyStoreIds.m65251m(), "default"));
        final C42114i viewBind = getViewBind();
        if (viewBind != null) {
            vm2.m65204p().observe(fragment.getViewLifecycleOwner(), new C26528a(new Function1() { // from class: com.kubi.unify.funds.f1
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return UnifyHideSmallView.m65189g(viewBind, (Boolean) obj);
                }
            }));
            vm2.m65205q().observe(fragment.getViewLifecycleOwner(), new C26528a(new Function1() { // from class: com.kubi.unify.funds.g1
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return UnifyHideSmallView.m65190h(viewBind, this, (String) obj);
                }
            }));
            CheckBox hideSmallCheckBox = viewBind.f93540b;
            Intrinsics.checkNotNullExpressionValue(hideSmallCheckBox, "hideSmallCheckBox");
            C27046k.m66708w(hideSmallCheckBox, new Function2() { // from class: com.kubi.unify.funds.h1
                @Override // p852kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return UnifyHideSmallView.m65191i(vm2, (CompoundButton) obj, ((Boolean) obj2).booleanValue());
                }
            });
            AppCompatImageView ivSortView = viewBind.f93541c;
            Intrinsics.checkNotNullExpressionValue(ivSortView, "ivSortView");
            C27046k.m66711z(ivSortView, 0L, new Function0() { // from class: com.kubi.unify.funds.i1
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return UnifyHideSmallView.m65192j(this.f53235b, fragment, vm2);
                }
            }, 1, null);
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m65195k(UnifyFundsInfoFragment unifyFundsInfoFragment, final UnifyFundsInfoViewModel unifyFundsInfoViewModel) {
        BottomSheetDialogHelper bottomSheetDialogHelper = BottomSheetDialogHelper.f48599a;
        String string = getResources().getString(R$string.unify_sort_default);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        SelectEntity selectEntity = new SelectEntity(null, string, "default", null, null, null, null, null, null, false, Intrinsics.areEqual(unifyFundsInfoViewModel.m65205q().getValue(), "default"), null, 3065, null);
        String string2 = getResources().getString(R$string.unify_sort_value);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        SelectEntity selectEntity2 = new SelectEntity(null, string2, "value", null, null, null, null, null, null, false, Intrinsics.areEqual(unifyFundsInfoViewModel.m65205q().getValue(), "value"), null, 3065, null);
        String string3 = getResources().getString(R$string.unify_sort_name);
        Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
        DialogFragmentHelper dialogFragmentHelperM58944B = BottomSheetDialogHelper.m58944B(bottomSheetDialogHelper, CollectionsKt.listOf((Object[]) new SelectEntity[]{selectEntity, selectEntity2, new SelectEntity(null, string3, FirebaseAnalytics.Param.CURRENCY, null, null, null, null, null, null, false, Intrinsics.areEqual(unifyFundsInfoViewModel.m65205q().getValue(), FirebaseAnalytics.Param.CURRENCY), null, 3065, null)}), new BiConsumer() { // from class: com.kubi.unify.funds.j1
            @Override // io.reactivex.functions.BiConsumer
            public final void accept(Object obj, Object obj2) {
                UnifyHideSmallView.m65193l(unifyFundsInfoViewModel, (BaseViewHolder) obj, (BottomSheetDialogHelper.InterfaceC24339a) obj2);
            }
        }, false, null, null, false, 28, null);
        FragmentManager childFragmentManager = unifyFundsInfoFragment.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        dialogFragmentHelperM58944B.show(childFragmentManager, "showToggleSortTypeDialog");
    }

    /* JADX INFO: renamed from: j */
    public static final Unit m65192j(UnifyHideSmallView unifyHideSmallView, UnifyFundsInfoFragment unifyFundsInfoFragment, UnifyFundsInfoViewModel unifyFundsInfoViewModel) {
        unifyHideSmallView.m65195k(unifyFundsInfoFragment, unifyFundsInfoViewModel);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: l */
    public static final void m65193l(UnifyFundsInfoViewModel unifyFundsInfoViewModel, BaseViewHolder baseViewHolder, BottomSheetDialogHelper.InterfaceC24339a interfaceC24339a) {
        unifyFundsInfoViewModel.m65208t(interfaceC24339a.getValue());
    }
}
