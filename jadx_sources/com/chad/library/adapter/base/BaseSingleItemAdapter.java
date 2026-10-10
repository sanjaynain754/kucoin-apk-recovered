package com.chad.library.adapter.base;

import androidx.exifinterface.media.ExifInterface;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import com.facebook.react.uimanager.ViewProps;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.bugly.proguard.C33954u6;
import java.util.Collection;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: BaseSingleItemAdapter.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0010\b&\u0018\u0000*\u0004\b\u0000\u0010\u0001*\b\b\u0001\u0010\u0002*\u00020\u00032\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0004\u0012\u0002H\u00020\u0004B\u0011\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00018\u0000¢\u0006\u0002\u0010\u0007J\u0012\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0005H\u0016J\u001a\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010\u0010\u001a\u0004\u0018\u00010\u0005H\u0016J \u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u00122\u000e\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0015H\u0016J\u0018\u0010\u0013\u001a\u00020\u000f2\u000e\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0015H\u0016J\u0018\u0010\u0016\u001a\u00020\u00122\u000e\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0018H\u0004J\u001f\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00028\u00012\b\u0010\t\u001a\u0004\u0018\u00018\u0000H$¢\u0006\u0002\u0010\u001bJ-\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00028\u00012\b\u0010\t\u001a\u0004\u0018\u00018\u00002\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00050\u0018H\u0016¢\u0006\u0002\u0010\u001dJ'\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00028\u00012\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010\t\u001a\u0004\u0018\u00010\u0005H\u0004¢\u0006\u0002\u0010\u001eJ5\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00028\u00012\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010\t\u001a\u0004\u0018\u00010\u00052\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00050\u0018H\u0004¢\u0006\u0002\u0010\u001fJ\u0012\u0010 \u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0005H\u0016J\u0010\u0010!\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u001b\u0010\"\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010\u0010\u001a\u0004\u0018\u00010\u0005H\u0096\u0002J\u001f\u0010\f\u001a\u00020\u000f2\b\u0010#\u001a\u0004\u0018\u00018\u00002\b\u0010$\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010%J\u001a\u0010&\u001a\u00020\u000f2\u0010\u0010'\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u0018H\u0016R(\u0010\t\u001a\u0004\u0018\u00018\u00002\b\u0010\b\u001a\u0004\u0018\u00018\u00008F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\u0007R\u0012\u0010\u0006\u001a\u0004\u0018\u00018\u0000X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\r¨\u0006("}, m90084d2 = {"Lcom/chad/library/adapter/base/BaseSingleItemAdapter;", ExifInterface.GPS_DIRECTION_TRUE, "VH", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Lcom/chad/library/adapter/base/BaseQuickAdapter;", "", "mItem", "(Ljava/lang/Object;)V", "value", "item", "getItem", "()Ljava/lang/Object;", "setItem", "Ljava/lang/Object;", "add", "", "data", ViewProps.POSITION, "", "addAll", "collection", "", "getItemCount", FirebaseAnalytics.Param.ITEMS, "", "onBindViewHolder", C33954u6.f72238i, "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V", "payloads", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;Ljava/util/List;)V", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;ILjava/lang/Object;)V", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;ILjava/lang/Object;Ljava/util/List;)V", "remove", "removeAt", "set", "t", "payload", "(Ljava/lang/Object;Ljava/lang/Object;)V", "submitList", "list", "com.github.CymChad.brvah"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public abstract class BaseSingleItemAdapter<T, VH extends RecyclerView.ViewHolder> extends BaseQuickAdapter<Object, VH> {

    @Nullable
    private T mItem;

    /* JADX WARN: Illegal instructions before constructor call */
    public BaseSingleItemAdapter() {
        DefaultConstructorMarker defaultConstructorMarker = null;
        this(defaultConstructorMarker, 1, defaultConstructorMarker);
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public void add(@Nullable Object data) {
        throw new RuntimeException("Please use setItem()");
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public void addAll(@NotNull Collection<? extends Object> collection) {
        Intrinsics.checkNotNullParameter(collection, "collection");
        throw new RuntimeException("Please use setItem()");
    }

    public abstract void onBindViewHolder(@NotNull VH holder, @Nullable T item);

    public void onBindViewHolder(@NotNull VH holder, @Nullable T item, @NotNull List<? extends Object> payloads) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        onBindViewHolder(holder, item);
    }

    public final void setItem(@Nullable T t11, @Nullable Object payload) {
        this.mItem = t11;
        notifyItemChanged(0, payload);
    }

    public /* synthetic */ BaseSingleItemAdapter(Object obj, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : obj);
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public void add(int position, @Nullable Object data) {
        throw new RuntimeException("Please use setItem()");
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public void addAll(int position, @NotNull Collection<? extends Object> collection) {
        Intrinsics.checkNotNullParameter(collection, "collection");
        throw new RuntimeException("Please use setItem()");
    }

    @Nullable
    public final T getItem() {
        return this.mItem;
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public final int getItemCount(@NotNull List<? extends Object> items) {
        Intrinsics.checkNotNullParameter(items, "items");
        return 1;
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public final void onBindViewHolder(@NotNull VH holder, int position, @Nullable Object item) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        onBindViewHolder(holder, this.mItem);
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public void remove(@Nullable Object data) {
        throw new RuntimeException("Please use setItem()");
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public void removeAt(int position) {
        throw new RuntimeException("Please use setItem()");
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public void set(int position, @Nullable Object data) {
        throw new RuntimeException("Please use setItem()");
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public void submitList(@Nullable List<? extends Object> list) {
        throw new RuntimeException("Please use setItem()");
    }

    public BaseSingleItemAdapter(@Nullable T t11) {
        super(null, 1, null);
        this.mItem = t11;
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public final void onBindViewHolder(@NotNull VH holder, int position, @Nullable Object item, @NotNull List<? extends Object> payloads) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        onBindViewHolder(holder, this.mItem, payloads);
    }

    public final void setItem(@Nullable T t11) {
        this.mItem = t11;
        notifyItemChanged(0);
    }
}
