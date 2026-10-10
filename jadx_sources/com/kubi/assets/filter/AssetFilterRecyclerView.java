package com.kubi.assets.filter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
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
import p637ta.C44905y5;
import p852kotlin.Metadata;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KProperty;
import w00.C45682f;

/* JADX INFO: compiled from: AssetFilterRecyclerView.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000?\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0005*\u0001\u001a\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u001dB%\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u001c\u001a\u00020\u0006H\u0016R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001d\u0010\u0010\u001a\u0004\u0018\u00010\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00180\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0019\u001a\u00020\u001aX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u001b¨\u0006\u001e"}, m90084d2 = {"Lcom/kubi/assets/filter/AssetFilterRecyclerView;", "Landroid/widget/FrameLayout;", "Lcom/kubi/assets/filter/IFilterDialogCallBack;", "context", "Landroid/content/Context;", "title", "", "data", "", "Lcom/kubi/assets/filter/AssetFilterRecyclerView$FilterGroupList;", "<init>", "(Landroid/content/Context;Ljava/lang/String;Ljava/util/List;)V", "getTitle", "()Ljava/lang/String;", "getData", "()Ljava/util/List;", "binding", "Lcom/kubi/assets/databinding/ViewFilterAssetRecyclerViewBinding;", "getBinding", "()Lcom/kubi/assets/databinding/ViewFilterAssetRecyclerViewBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "leftAdapter", "Lio/chad/library/adapter/base/BaseQuickAdapter;", "Lio/chad/library/adapter/base/BaseViewHolder;", "rightAdapter", "com/kubi/assets/filter/AssetFilterRecyclerView$rightAdapter$1", "Lcom/kubi/assets/filter/AssetFilterRecyclerView$rightAdapter$1;", "getAdapterResult", "FilterGroupList", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SuppressLint({"ViewConstructor"})
@SourceDebugExtension({"SMAP\nAssetFilterRecyclerView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AssetFilterRecyclerView.kt\ncom/kubi/assets/filter/AssetFilterRecyclerView\n+ 2 ViewGroupBindings.kt\ncom/kubi/sdk/viewbindingdelegate/ViewGroupBindingsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,100:1\n52#2:101\n80#2,7:102\n774#3:109\n865#3,2:110\n295#3,2:112\n1869#3,2:115\n1#4:114\n*S KotlinDebug\n*F\n+ 1 AssetFilterRecyclerView.kt\ncom/kubi/assets/filter/AssetFilterRecyclerView\n*L\n29#1:101\n29#1:102,7\n76#1:109\n76#1:110,2\n83#1:112,2\n89#1:115,2\n*E\n"})
public final class AssetFilterRecyclerView extends FrameLayout implements IFilterDialogCallBack {

    /* JADX INFO: renamed from: g */
    public static final /* synthetic */ KProperty<Object>[] f17339g = {Reflection.property1(new PropertyReference1Impl(AssetFilterRecyclerView.class, "binding", "getBinding()Lcom/kubi/assets/databinding/ViewFilterAssetRecyclerViewBinding;", 0))};

    /* JADX INFO: renamed from: b */
    @NotNull
    public final String f17340b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public final List<FilterGroupList> f17341c;

    /* JADX INFO: renamed from: d */
    @NotNull
    public final InterfaceC24293a f17342d;

    /* JADX INFO: renamed from: e */
    @NotNull
    public final BaseQuickAdapter<FilterGroupList, BaseViewHolder> f17343e;

    /* JADX INFO: renamed from: f */
    @NotNull
    public final AssetFilterRecyclerView$rightAdapter$1 f17344f;

    /* JADX INFO: renamed from: com.kubi.assets.filter.AssetFilterRecyclerView$a, reason: from toString */
    /* JADX INFO: compiled from: AssetFilterRecyclerView.kt */
    @Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J-\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00032\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0005HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0002\u0010\u000b\"\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001b"}, m90084d2 = {"Lcom/kubi/assets/filter/AssetFilterRecyclerView$FilterGroupList;", "", "isCheck", "", "filterName", "", "subList", "", "Lcom/kubi/resources/widget/drop/FilterType$IFilter;", "<init>", "(ZLjava/lang/String;Ljava/util/List;)V", "()Z", "setCheck", "(Z)V", "getFilterName", "()Ljava/lang/String;", "getSubList", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
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
        public final List<FilterType.InterfaceC23033b> m16594b() {
            return this.subList;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final boolean getIsCheck() {
            return this.isCheck;
        }

        /* JADX INFO: renamed from: d */
        public final void m16596d(boolean z11) {
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
    public AssetFilterRecyclerView(@NotNull Context context, @NotNull String title, @NotNull List<FilterGroupList> data) {
        Object next;
        List<FilterType.InterfaceC23033b> listM16594b;
        NonInterceptRecyclerView nonInterceptRecyclerView;
        View view;
        NonInterceptRecyclerView nonInterceptRecyclerView2;
        NonInterceptRecyclerView nonInterceptRecyclerView3;
        BaseTextView baseTextView;
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(data, "data");
        this.f17340b = title;
        this.f17341c = data;
        this.f17342d = new LazyViewBindingProperty(UtilsKt.m58554b(), new Function1<ViewGroup, C44905y5>() { // from class: com.kubi.assets.filter.AssetFilterRecyclerView$special$$inlined$customViewBinding$1
            @Override // p852kotlin.jvm.functions.Function1
            @NotNull
            public final C44905y5 invoke(@NotNull ViewGroup viewGroup) {
                Intrinsics.checkNotNullParameter(viewGroup, "viewGroup");
                return C44905y5.m99334a(C45682f.m100800a(viewGroup));
            }
        });
        AssetFilterRecyclerView$leftAdapter$1 assetFilterRecyclerView$leftAdapter$1 = new AssetFilterRecyclerView$leftAdapter$1(this, R$layout.item_asset_filter_left);
        this.f17343e = assetFilterRecyclerView$leftAdapter$1;
        AssetFilterRecyclerView$rightAdapter$1 assetFilterRecyclerView$rightAdapter$1 = new AssetFilterRecyclerView$rightAdapter$1(this, R$layout.item_asset_filter_right);
        this.f17344f = assetFilterRecyclerView$rightAdapter$1;
        LayoutInflater.from(context).inflate(R$layout.view_filter_asset_recycler_view, this);
        C44905y5 binding = getBinding();
        if (binding != null && (baseTextView = binding.f101200e) != null) {
            baseTextView.setText(title);
        }
        C44905y5 binding2 = getBinding();
        if (binding2 != null && (nonInterceptRecyclerView3 = binding2.f101198c) != null) {
            nonInterceptRecyclerView3.setAdapter(assetFilterRecyclerView$leftAdapter$1);
        }
        C44905y5 binding3 = getBinding();
        if (binding3 != null && (nonInterceptRecyclerView2 = binding3.f101199d) != null) {
            nonInterceptRecyclerView2.setAdapter(assetFilterRecyclerView$rightAdapter$1);
        }
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = data.iterator();
        while (true) {
            boolean z11 = true;
            if (!it.hasNext()) {
                break;
            }
            Object next2 = it.next();
            List<FilterType.InterfaceC23033b> listM16594b2 = ((FilterGroupList) next2).m16594b();
            if (listM16594b2 != null && !listM16594b2.isEmpty()) {
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
            C44905y5 binding4 = getBinding();
            if (binding4 != null && (view = binding4.f101197b) != null) {
                ViewExtKt.m66577h(view);
            }
            C44905y5 binding5 = getBinding();
            if (binding5 != null && (nonInterceptRecyclerView = binding5.f101198c) != null) {
                ViewExtKt.m66577h(nonInterceptRecyclerView);
            }
        }
        this.f17343e.replaceData(arrayList);
        Iterator it2 = arrayList.iterator();
        do {
            if (!it2.hasNext()) {
                next = null;
                break;
            }
            next = it2.next();
        } while (!((FilterGroupList) next).getIsCheck());
        FilterGroupList filterGroupList = (FilterGroupList) next;
        if (filterGroupList == null || (listM16594b = filterGroupList.m16594b()) == null) {
            return;
        }
        this.f17344f.replaceData(listM16594b);
    }

    private final C44905y5 getBinding() {
        return (C44905y5) this.f17342d.getValue(this, f17339g[0]);
    }

    @Override // com.kubi.assets.filter.IFilterDialogCallBack
    @NotNull
    public String getAdapterResult() {
        Object next;
        ArrayList arrayList = new ArrayList();
        List<FilterGroupList> data = this.f17343e.getData();
        Intrinsics.checkNotNullExpressionValue(data, "getData(...)");
        Iterator<T> it = data.iterator();
        while (it.hasNext()) {
            arrayList.addAll(((FilterGroupList) it.next()).m16594b());
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
        return this.f17341c;
    }

    @NotNull
    /* JADX INFO: renamed from: getTitle, reason: from getter */
    public final String getF17340b() {
        return this.f17340b;
    }
}
