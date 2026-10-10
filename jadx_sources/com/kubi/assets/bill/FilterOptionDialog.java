package com.kubi.assets.bill;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.media3.extractor.text.ttml.TtmlNode;
import androidx.recyclerview.widget.RecyclerView;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.assets.AssetExKt;
import com.kubi.assets.R$layout;
import com.kubi.resources.dialog.DialogFragmentHelper;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.button.KcPrimaryButton;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.utils.extensions.C27046k;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p637ta.C44777h0;
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
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KProperty;
import w00.C45681e;

/* JADX INFO: compiled from: FilterOptionDialog.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 '2\u00020\u0001:\u0001'B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001c\u0010\u0019\u001a\u00020\u00002\u0014\u0010\u0016\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0004\u0012\u00020\u00180\u0017J\b\u0010\u001a\u001a\u00020\u001bH\u0016J&\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0016J\u001a\u0010$\u001a\u00020\u00182\u0006\u0010%\u001a\u00020\u001d2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0016J\b\u0010&\u001a\u00020\u0018H\u0002R\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR!\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u000f\u001a\u0004\b\u0013\u0010\u0014R\u001e\u0010\u0016\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0017X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006("}, m90084d2 = {"Lcom/kubi/assets/bill/FilterOptionDialog;", "Lcom/kubi/resources/dialog/DialogFragmentHelper;", "<init>", "()V", "binding", "Lcom/kubi/assets/databinding/AssetFilterOptionsDialogBinding;", "getBinding", "()Lcom/kubi/assets/databinding/AssetFilterOptionsDialogBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "title", "", "getTitle", "()Ljava/lang/String;", "title$delegate", "Lkotlin/Lazy;", FirebaseAnalytics.Param.ITEMS, "", "Lcom/kubi/assets/bill/FilterOptionItem;", "getItems", "()Ljava/util/List;", "items$delegate", "callBack", "Lkotlin/Function1;", "", "setCallBack", "isBottomSheet", "", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "initViews", "Companion", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nFilterOptionDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FilterOptionDialog.kt\ncom/kubi/assets/bill/FilterOptionDialog\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,115:1\n143#2,20:116\n1#3:136\n1869#4,2:137\n*S KotlinDebug\n*F\n+ 1 FilterOptionDialog.kt\ncom/kubi/assets/bill/FilterOptionDialog\n*L\n45#1:116,20\n109#1:137,2\n*E\n"})
public final class FilterOptionDialog extends DialogFragmentHelper {

    /* JADX INFO: renamed from: q0 */
    @NotNull
    public final InterfaceC24293a f16693q0 = C45681e.m100799e(this, new Function1<FilterOptionDialog, C44777h0>() { // from class: com.kubi.assets.bill.FilterOptionDialog$special$$inlined$viewBindingFragment$default$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C44777h0 invoke(@NotNull FilterOptionDialog fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C44777h0.m99070a(fragment.requireView());
        }
    }, new Function1<C44777h0, Unit>() { // from class: com.kubi.assets.bill.FilterOptionDialog$special$$inlined$viewBindingFragment$default$1
        public final void invoke(@NotNull C44777h0 it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C44777h0 c44777h0) {
            invoke(c44777h0);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: r0 */
    @NotNull
    public final Lazy f16694r0 = LazyKt.lazy(new Function0() { // from class: com.kubi.assets.bill.s1
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return FilterOptionDialog.m15734v4(this.f16806b);
        }
    });

    /* JADX INFO: renamed from: s0 */
    @NotNull
    public final Lazy f16695s0 = LazyKt.lazy(new Function0() { // from class: com.kubi.assets.bill.t1
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return FilterOptionDialog.m15733t4(this.f16811b);
        }
    });

    /* JADX INFO: renamed from: t0 */
    @Nullable
    public Function1<? super String, Unit> f16696t0;

    /* JADX INFO: renamed from: v0 */
    public static final /* synthetic */ KProperty<Object>[] f16692v0 = {Reflection.property1(new PropertyReference1Impl(FilterOptionDialog.class, "binding", "getBinding()Lcom/kubi/assets/databinding/AssetFilterOptionsDialogBinding;", 0))};

    /* JADX INFO: renamed from: u0 */
    @NotNull
    public static final Companion f16691u0 = new Companion(null);

    /* JADX INFO: compiled from: FilterOptionDialog.kt */
    @Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001c\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¨\u0006\u000b"}, m90084d2 = {"Lcom/kubi/assets/bill/FilterOptionDialog$Companion;", "", "<init>", "()V", "create", "Lcom/kubi/assets/bill/FilterOptionDialog;", "title", "", FirebaseAnalytics.Param.ITEMS, "", "Lcom/kubi/assets/bill/FilterOptionItem;", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @NotNull
        public final FilterOptionDialog create(@NotNull String title, @NotNull List<FilterOptionItem> items) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(items, "items");
            FilterOptionDialog filterOptionDialog = new FilterOptionDialog();
            Bundle bundle = new Bundle();
            bundle.putString("title", title);
            bundle.putParcelableArrayList(FirebaseAnalytics.Param.ITEMS, new ArrayList<>(items));
            filterOptionDialog.setArguments(bundle);
            return filterOptionDialog;
        }
    }

    @Override // com.kubi.resources.dialog.DialogFragmentHelper, com.kubi.resources.dialog.BaseDialogFragment
    /* JADX INFO: renamed from: k3 */
    public boolean mo15372k3() {
        return true;
    }

    /* JADX INFO: renamed from: o4 */
    private final List<FilterOptionItem> m15728o4() {
        return (List) this.f16695s0.getValue();
    }

    /* JADX INFO: renamed from: p4 */
    private final String m15729p4() {
        return (String) this.f16694r0.getValue();
    }

    /* JADX INFO: renamed from: n4 */
    public final C44777h0 m15735n4() {
        return (C44777h0) this.f16693q0.getValue(this, f16692v0[0]);
    }

    @Override // com.kubi.resources.dialog.DialogFragmentHelper, androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        return getLayoutInflater().inflate(R$layout.asset_filter_options_dialog, container, false);
    }

    @Override // com.kubi.resources.dialog.BaseDialogFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        m15730q4();
    }

    @NotNull
    /* JADX INFO: renamed from: u4 */
    public final FilterOptionDialog m15736u4(@NotNull Function1<? super String, Unit> callBack) {
        Intrinsics.checkNotNullParameter(callBack, "callBack");
        this.f16696t0 = callBack;
        return this;
    }

    /* JADX INFO: renamed from: q4 */
    private final void m15730q4() {
        boolean z11;
        final C44777h0 c44777h0M15735n4 = m15735n4();
        if (c44777h0M15735n4 != null) {
            c44777h0M15735n4.f100011b.setAdapter(new FilterOptionDialog$initViews$1$1(R$layout.asset_filter_options_item, m15728o4()));
            c44777h0M15735n4.f100014e.setText(m15729p4());
            BaseTextView tvTitle = c44777h0M15735n4.f100014e;
            Intrinsics.checkNotNullExpressionValue(tvTitle, "tvTitle");
            if (m15729p4().length() > 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            AssetExKt.m15138z(tvTitle, z11);
            KcPrimaryButton tvConfirm = c44777h0M15735n4.f100012c;
            Intrinsics.checkNotNullExpressionValue(tvConfirm, "tvConfirm");
            C27046k.m66711z(tvConfirm, 0L, new Function0() { // from class: com.kubi.assets.bill.q1
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return FilterOptionDialog.m15731r4(this.f16795b);
                }
            }, 1, null);
            KcPrimaryButton tvReset = c44777h0M15735n4.f100013d;
            Intrinsics.checkNotNullExpressionValue(tvReset, "tvReset");
            C27046k.m66711z(tvReset, 0L, new Function0() { // from class: com.kubi.assets.bill.r1
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return FilterOptionDialog.m15732s4(this.f16800b, c44777h0M15735n4);
                }
            }, 1, null);
        }
    }

    /* JADX INFO: renamed from: r4 */
    public static final Unit m15731r4(FilterOptionDialog filterOptionDialog) {
        String id2;
        Object next;
        Iterator<T> it = filterOptionDialog.m15728o4().iterator();
        do {
            id2 = null;
            if (it.hasNext()) {
                next = it.next();
            } else {
                next = null;
                break;
            }
        } while (!((FilterOptionItem) next).getChecked());
        FilterOptionItem filterOptionItem = (FilterOptionItem) next;
        if (filterOptionItem != null) {
            id2 = filterOptionItem.getId();
        }
        Function1<? super String, Unit> function1 = filterOptionDialog.f16696t0;
        if (function1 != null) {
            function1.invoke(id2);
        }
        filterOptionDialog.dismiss();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: s4 */
    public static final Unit m15732s4(FilterOptionDialog filterOptionDialog, C44777h0 c44777h0) {
        Iterator<T> it = filterOptionDialog.m15728o4().iterator();
        while (it.hasNext()) {
            ((FilterOptionItem) it.next()).setChecked(false);
        }
        if (!filterOptionDialog.m15728o4().isEmpty()) {
            filterOptionDialog.m15728o4().get(0).setChecked(true);
        }
        RecyclerView.Adapter adapter = c44777h0.f100011b.getAdapter();
        if (adapter != null) {
            adapter.notifyDataSetChanged();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: t4 */
    public static final List m15733t4(FilterOptionDialog filterOptionDialog) {
        ArrayList parcelableArrayList;
        Bundle arguments = filterOptionDialog.getArguments();
        if (arguments != null) {
            parcelableArrayList = arguments.getParcelableArrayList(FirebaseAnalytics.Param.ITEMS);
        } else {
            parcelableArrayList = null;
        }
        if (parcelableArrayList == null) {
            return CollectionsKt.emptyList();
        }
        return parcelableArrayList;
    }

    /* JADX INFO: renamed from: v4 */
    public static final String m15734v4(FilterOptionDialog filterOptionDialog) {
        String string;
        Bundle arguments = filterOptionDialog.getArguments();
        if (arguments != null && (string = arguments.getString("title")) != null) {
            return string;
        }
        return "";
    }
}
