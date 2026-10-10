package com.kubi.assets.bill;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.kubi.assets.R$layout;
import com.kubi.assets.view.NonInterceptRecyclerView;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.drop.FilterType;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.sdk.viewbindingdelegate.base.LazyViewBindingProperty;
import com.kubi.sdk.viewbindingdelegate.internal.UtilsKt;
import com.kubi.utils.extensions.core.ViewExtKt;
import io.chad.library.adapter.base.BaseQuickAdapter;
import io.chad.library.adapter.base.BaseViewHolder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p637ta.C44838p1;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KProperty;
import w00.C45682f;

/* JADX INFO: compiled from: FutureRecordFilterRecyclerView.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000?\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0005*\u0001\u001a\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u001dB%\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u001c\u001a\u00020\u0006H\u0016R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001d\u0010\u0010\u001a\u0004\u0018\u00010\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00180\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0019\u001a\u00020\u001aX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u001b¨\u0006\u001e"}, m90084d2 = {"Lcom/kubi/assets/bill/FutureRecordFilterRecyclerView;", "Landroid/widget/FrameLayout;", "Lcom/kubi/assets/bill/IFilterDialogCallBack;", "context", "Landroid/content/Context;", "title", "", "data", "", "Lcom/kubi/assets/bill/FutureRecordFilterRecyclerView$FilterGroupList;", "<init>", "(Landroid/content/Context;Ljava/lang/String;Ljava/util/List;)V", "getTitle", "()Ljava/lang/String;", "getData", "()Ljava/util/List;", "binding", "Lcom/kubi/assets/databinding/AssetKumexViewFilterAssetRecyclerViewBinding;", "getBinding", "()Lcom/kubi/assets/databinding/AssetKumexViewFilterAssetRecyclerViewBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "leftAdapter", "Lio/chad/library/adapter/base/BaseQuickAdapter;", "Lio/chad/library/adapter/base/BaseViewHolder;", "rightAdapter", "com/kubi/assets/bill/FutureRecordFilterRecyclerView$rightAdapter$1", "Lcom/kubi/assets/bill/FutureRecordFilterRecyclerView$rightAdapter$1;", "getAdapterResult", "FilterGroupList", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SuppressLint({"ViewConstructor"})
@SourceDebugExtension({"SMAP\nFutureRecordFilterRecyclerView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FutureRecordFilterRecyclerView.kt\ncom/kubi/assets/bill/FutureRecordFilterRecyclerView\n+ 2 ViewGroupBindings.kt\ncom/kubi/sdk/viewbindingdelegate/ViewGroupBindingsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,104:1\n52#2:105\n80#2,7:106\n774#3:113\n865#3,2:114\n295#3,2:116\n1878#3,3:118\n1869#3,2:121\n1#4:123\n*S KotlinDebug\n*F\n+ 1 FutureRecordFilterRecyclerView.kt\ncom/kubi/assets/bill/FutureRecordFilterRecyclerView\n*L\n27#1:105\n27#1:106,7\n72#1:113\n72#1:114,2\n79#1:116,2\n83#1:118,3\n95#1:121,2\n*E\n"})
public final class FutureRecordFilterRecyclerView extends FrameLayout implements IFilterDialogCallBack {

    /* JADX INFO: renamed from: g */
    public static final /* synthetic */ KProperty<Object>[] f16717g = {Reflection.property1(new PropertyReference1Impl(FutureRecordFilterRecyclerView.class, "binding", "getBinding()Lcom/kubi/assets/databinding/AssetKumexViewFilterAssetRecyclerViewBinding;", 0))};

    /* JADX INFO: renamed from: b */
    @NotNull
    public final String f16718b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public final List<FilterGroupList> f16719c;

    /* JADX INFO: renamed from: d */
    @NotNull
    public final InterfaceC24293a f16720d;

    /* JADX INFO: renamed from: e */
    @NotNull
    public final BaseQuickAdapter<FilterGroupList, BaseViewHolder> f16721e;

    /* JADX INFO: renamed from: f */
    @NotNull
    public final FutureRecordFilterRecyclerView$rightAdapter$1 f16722f;

    /* JADX INFO: renamed from: com.kubi.assets.bill.FutureRecordFilterRecyclerView$a, reason: from toString */
    /* JADX INFO: compiled from: FutureRecordFilterRecyclerView.kt */
    @Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J-\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00032\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0005HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0002\u0010\u000b\"\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001b"}, m90084d2 = {"Lcom/kubi/assets/bill/FutureRecordFilterRecyclerView$FilterGroupList;", "", "isCheck", "", "filterName", "", "subList", "", "Lcom/kubi/resources/widget/drop/FilterType$IFilter;", "<init>", "(ZLjava/lang/String;Ljava/util/List;)V", "()Z", "setCheck", "(Z)V", "getFilterName", "()Ljava/lang/String;", "getSubList", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class FilterGroupList {

        /* JADX INFO: renamed from: a, reason: from toString */
        public boolean isCheck;

        /* JADX INFO: renamed from: b, reason: from toString */
        @NotNull
        public final String filterName;

        /* JADX INFO: renamed from: c, reason: from toString */
        @NotNull
        public final List<FilterType.InterfaceC23033b> subList;

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof FilterGroupList)) {
                return false;
            }
            FilterGroupList filterGroupList = (FilterGroupList) other;
            return this.isCheck == filterGroupList.isCheck && Intrinsics.areEqual(this.filterName, filterGroupList.filterName) && Intrinsics.areEqual(this.subList, filterGroupList.subList);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public FilterGroupList(boolean z11, @NotNull String filterName, @NotNull List<? extends FilterType.InterfaceC23033b> subList) {
            Intrinsics.checkNotNullParameter(filterName, "filterName");
            Intrinsics.checkNotNullParameter(subList, "subList");
            this.isCheck = z11;
            this.filterName = filterName;
            this.subList = subList;
        }

        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getFilterName() {
            return this.filterName;
        }

        @NotNull
        /* JADX INFO: renamed from: b */
        public final List<FilterType.InterfaceC23033b> m15790b() {
            return this.subList;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final boolean getIsCheck() {
            return this.isCheck;
        }

        /* JADX INFO: renamed from: d */
        public final void m15792d(boolean z11) {
            this.isCheck = z11;
        }

        public int hashCode() {
            return (((Boolean.hashCode(this.isCheck) * 31) + this.filterName.hashCode()) * 31) + this.subList.hashCode();
        }

        @NotNull
        public String toString() {
            return "FilterGroupList(isCheck=" + this.isCheck + ", filterName=" + this.filterName + ", subList=" + this.subList + ')';
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FutureRecordFilterRecyclerView(@NotNull Context context, @NotNull String title, @NotNull List<FilterGroupList> data) {
        int i11;
        Object next;
        List<FilterType.InterfaceC23033b> listM15790b;
        NonInterceptRecyclerView nonInterceptRecyclerView;
        RecyclerView.LayoutManager layoutManager;
        NonInterceptRecyclerView nonInterceptRecyclerView2;
        View view;
        NonInterceptRecyclerView nonInterceptRecyclerView3;
        NonInterceptRecyclerView nonInterceptRecyclerView4;
        BaseTextView baseTextView;
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(data, "data");
        this.f16718b = title;
        this.f16719c = data;
        this.f16720d = new LazyViewBindingProperty(UtilsKt.m58554b(), new Function1<ViewGroup, C44838p1>() { // from class: com.kubi.assets.bill.FutureRecordFilterRecyclerView$special$$inlined$customViewBinding$1
            @Override // p852kotlin.jvm.functions.Function1
            @NotNull
            public final C44838p1 invoke(@NotNull ViewGroup viewGroup) {
                Intrinsics.checkNotNullParameter(viewGroup, "viewGroup");
                return C44838p1.m99202a(C45682f.m100800a(viewGroup));
            }
        });
        FutureRecordFilterRecyclerView$leftAdapter$1 futureRecordFilterRecyclerView$leftAdapter$1 = new FutureRecordFilterRecyclerView$leftAdapter$1(this, R$layout.asset_kumex_item_asset_filter_left);
        this.f16721e = futureRecordFilterRecyclerView$leftAdapter$1;
        FutureRecordFilterRecyclerView$rightAdapter$1 futureRecordFilterRecyclerView$rightAdapter$1 = new FutureRecordFilterRecyclerView$rightAdapter$1(this, R$layout.asset_kumex_item_asset_filter_right);
        this.f16722f = futureRecordFilterRecyclerView$rightAdapter$1;
        LayoutInflater.from(context).inflate(R$layout.asset_kumex_view_filter_asset_recycler_view, this);
        C44838p1 binding = getBinding();
        if (binding != null && (baseTextView = binding.f100589e) != null) {
            baseTextView.setText(title);
        }
        C44838p1 binding2 = getBinding();
        if (binding2 != null && (nonInterceptRecyclerView4 = binding2.f100587c) != null) {
            nonInterceptRecyclerView4.setAdapter(futureRecordFilterRecyclerView$leftAdapter$1);
        }
        C44838p1 binding3 = getBinding();
        if (binding3 != null && (nonInterceptRecyclerView3 = binding3.f100588d) != null) {
            nonInterceptRecyclerView3.setAdapter(futureRecordFilterRecyclerView$rightAdapter$1);
        }
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = data.iterator();
        while (true) {
            boolean z11 = true;
            i11 = 0;
            if (!it.hasNext()) {
                break;
            }
            Object next2 = it.next();
            List<FilterType.InterfaceC23033b> listM15790b2 = ((FilterGroupList) next2).m15790b();
            if (listM15790b2 != null && !listM15790b2.isEmpty()) {
                z11 = false;
            }
            if (!z11) {
                arrayList.add(next2);
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        if (arrayList.size() == 1) {
            C44838p1 binding4 = getBinding();
            if (binding4 != null && (view = binding4.f100586b) != null) {
                ViewExtKt.m66577h(view);
            }
            C44838p1 binding5 = getBinding();
            if (binding5 != null && (nonInterceptRecyclerView2 = binding5.f100587c) != null) {
                ViewExtKt.m66577h(nonInterceptRecyclerView2);
            }
        }
        this.f16721e.replaceData(arrayList);
        Iterator it2 = arrayList.iterator();
        do {
            if (!it2.hasNext()) {
                next = null;
                break;
            }
            next = it2.next();
        } while (!((FilterGroupList) next).getIsCheck());
        FilterGroupList filterGroupList = (FilterGroupList) next;
        if (filterGroupList == null || (listM15790b = filterGroupList.m15790b()) == null) {
            return;
        }
        this.f16722f.replaceData(listM15790b);
        int i12 = 0;
        for (Object obj : listM15790b) {
            int i13 = i11 + 1;
            if (i11 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            if (((FilterType.InterfaceC23033b) obj).getF44546c()) {
                i12 = i11;
            }
            i11 = i13;
        }
        C44838p1 binding6 = getBinding();
        if (binding6 == null || (nonInterceptRecyclerView = binding6.f100588d) == null || (layoutManager = nonInterceptRecyclerView.getLayoutManager()) == null) {
            return;
        }
        layoutManager.scrollToPosition(i12);
    }

    private final C44838p1 getBinding() {
        return (C44838p1) this.f16720d.getValue(this, f16717g[0]);
    }

    @Override // com.kubi.assets.bill.IFilterDialogCallBack
    @NotNull
    public String getAdapterResult() {
        Object next;
        ArrayList arrayList = new ArrayList();
        List<FilterGroupList> data = this.f16721e.getData();
        Intrinsics.checkNotNullExpressionValue(data, "getData(...)");
        Iterator<T> it = data.iterator();
        while (it.hasNext()) {
            arrayList.addAll(((FilterGroupList) it.next()).m15790b());
        }
        Iterator it2 = arrayList.iterator();
        do {
            if (!it2.hasNext()) {
                next = null;
                break;
            }
            next = it2.next();
        } while (!((FilterType.InterfaceC23033b) next).getF44546c());
        FilterType.InterfaceC23033b interfaceC23033b = (FilterType.InterfaceC23033b) next;
        String f44545b = interfaceC23033b != null ? interfaceC23033b.getF44545b() : null;
        return f44545b == null ? "" : f44545b;
    }

    @NotNull
    public final List<FilterGroupList> getData() {
        return this.f16719c;
    }

    @NotNull
    /* JADX INFO: renamed from: getTitle, reason: from getter */
    public final String getF16718b() {
        return this.f16718b;
    }
}
