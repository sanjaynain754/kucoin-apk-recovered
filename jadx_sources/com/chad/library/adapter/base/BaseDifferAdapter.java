package com.chad.library.adapter.base;

import androidx.exifinterface.media.ExifInterface;
import androidx.recyclerview.widget.AdapterListUpdateCallback;
import androidx.recyclerview.widget.AsyncDifferConfig;
import androidx.recyclerview.widget.AsyncListDiffer;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import com.facebook.react.uimanager.ViewProps;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: BaseDifferAdapter.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u0000*\u0004\b\u0000\u0010\u0001*\b\b\u0001\u0010\u0002*\u00020\u00032\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00020\u0004B\u0015\b\u0016\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\u0002\u0010\u0007B#\b\u0016\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\t¢\u0006\u0002\u0010\nB\u0015\b\u0016\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\f¢\u0006\u0002\u0010\rB!\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\f\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\t¢\u0006\u0002\u0010\u000eJ\u0015\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u001bJ\u001d\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001a\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u001eJ\u001e\u0010\u001f\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001d2\f\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00000!H\u0016J\u0016\u0010\u001f\u001a\u00020\u00192\f\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00000!H\u0016J\u0018\u0010\"\u001a\u00020\u00192\u0006\u0010#\u001a\u00020\u001d2\u0006\u0010$\u001a\u00020\u001dH\u0016J$\u0010%\u001a\u00020\u00192\f\u0010&\u001a\b\u0012\u0004\u0012\u00028\u00000\t2\f\u0010'\u001a\b\u0012\u0004\u0012\u00028\u00000\tH\u0016J\u0015\u0010(\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u001bJ\u0010\u0010)\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J\u001e\u0010*\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001a\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0002\u0010\u001eJ\u0018\u0010+\u001a\u00020\u00192\u000e\u0010,\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\tH\u0016J \u0010+\u001a\u00020\u00192\u000e\u0010,\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\t2\b\u0010-\u001a\u0004\u0018\u00010.J\u0018\u0010/\u001a\u00020\u00192\u0006\u0010#\u001a\u00020\u001d2\u0006\u0010$\u001a\u00020\u001dH\u0016R0\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\t2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\t8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u0017X\u0082\u0004¢\u0006\u0002\n\u0000¨\u00060"}, m90084d2 = {"Lcom/chad/library/adapter/base/BaseDifferAdapter;", ExifInterface.GPS_DIRECTION_TRUE, "VH", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Lcom/chad/library/adapter/base/BaseQuickAdapter;", "diffCallback", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "(Landroidx/recyclerview/widget/DiffUtil$ItemCallback;)V", FirebaseAnalytics.Param.ITEMS, "", "(Landroidx/recyclerview/widget/DiffUtil$ItemCallback;Ljava/util/List;)V", "config", "Landroidx/recyclerview/widget/AsyncDifferConfig;", "(Landroidx/recyclerview/widget/AsyncDifferConfig;)V", "(Landroidx/recyclerview/widget/AsyncDifferConfig;Ljava/util/List;)V", "value", "getItems", "()Ljava/util/List;", "setItems", "(Ljava/util/List;)V", "mDiffer", "Landroidx/recyclerview/widget/AsyncListDiffer;", "mListener", "Landroidx/recyclerview/widget/AsyncListDiffer$ListListener;", "add", "", "data", "(Ljava/lang/Object;)V", ViewProps.POSITION, "", "(ILjava/lang/Object;)V", "addAll", "collection", "", "move", "fromPosition", "toPosition", "onCurrentListChanged", "previousList", "currentList", "remove", "removeAt", "set", "submitList", "list", "commitCallback", "Ljava/lang/Runnable;", "swap", "com.github.CymChad.brvah"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public abstract class BaseDifferAdapter<T, VH extends RecyclerView.ViewHolder> extends BaseQuickAdapter<T, VH> {

    @NotNull
    private final AsyncListDiffer<T> mDiffer;

    @NotNull
    private final AsyncListDiffer.ListListener<T> mListener;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseDifferAdapter(@NotNull AsyncDifferConfig<T> config, @NotNull List<? extends T> items) {
        super(null, 1, null);
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(items, "items");
        AsyncListDiffer<T> asyncListDiffer = new AsyncListDiffer<>(new AdapterListUpdateCallback(this), config);
        this.mDiffer = asyncListDiffer;
        AsyncListDiffer.ListListener<T> listListener = new AsyncListDiffer.ListListener() { // from class: com.chad.library.adapter.base.a
            @Override // androidx.recyclerview.widget.AsyncListDiffer.ListListener
            public final void onCurrentListChanged(List list, List list2) {
                BaseDifferAdapter.mListener$lambda$0(this.f7069a, list, list2);
            }
        };
        this.mListener = listListener;
        asyncListDiffer.addListListener(listListener);
        asyncListDiffer.submitList(items);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public void add(T data) {
        List<? extends T> mutableList = CollectionsKt.toMutableList((Collection) getItems());
        mutableList.add(data);
        submitList(mutableList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public void addAll(@NotNull Collection<? extends T> collection) {
        Intrinsics.checkNotNullParameter(collection, "collection");
        List<? extends T> mutableList = CollectionsKt.toMutableList((Collection) getItems());
        mutableList.addAll(collection);
        submitList(mutableList);
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public void submitList(@Nullable List<? extends T> list) {
        this.mDiffer.submitList(list, null);
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    @NotNull
    public final List<T> getItems() {
        List<T> currentList = this.mDiffer.getCurrentList();
        Intrinsics.checkNotNullExpressionValue(currentList, "mDiffer.currentList");
        return currentList;
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public void move(int fromPosition, int toPosition) {
        if ((fromPosition < 0 || fromPosition >= getItems().size()) && (toPosition < 0 || toPosition >= getItems().size())) {
            return;
        }
        List<? extends T> mutableList = CollectionsKt.toMutableList((Collection) getItems());
        mutableList.add(toPosition, mutableList.remove(fromPosition));
        submitList(mutableList);
    }

    public final void submitList(@Nullable List<? extends T> list, @Nullable Runnable commitCallback) {
        this.mDiffer.submitList(list, commitCallback);
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public void swap(int fromPosition, int toPosition) {
        if ((fromPosition < 0 || fromPosition >= getItems().size()) && (toPosition < 0 || toPosition >= getItems().size())) {
            return;
        }
        List<? extends T> mutableList = CollectionsKt.toMutableList((Collection) getItems());
        Collections.swap(mutableList, fromPosition, toPosition);
        submitList(mutableList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void mListener$lambda$0(BaseDifferAdapter this$0, List previousList, List currentList) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(previousList, "previousList");
        Intrinsics.checkNotNullParameter(currentList, "currentList");
        boolean zDisplayEmptyView = this$0.displayEmptyView(previousList);
        boolean zDisplayEmptyView2 = this$0.displayEmptyView(currentList);
        if (zDisplayEmptyView && !zDisplayEmptyView2) {
            this$0.notifyItemRemoved(0);
            this$0.getRecyclerView().scrollToPosition(0);
        } else if (zDisplayEmptyView2 && !zDisplayEmptyView) {
            this$0.notifyItemInserted(0);
        } else if (zDisplayEmptyView && zDisplayEmptyView2) {
            this$0.notifyItemChanged(0, 0);
        }
        this$0.onCurrentListChanged(previousList, currentList);
    }

    public void onCurrentListChanged(@NotNull List<? extends T> previousList, @NotNull List<? extends T> currentList) {
        Intrinsics.checkNotNullParameter(previousList, "previousList");
        Intrinsics.checkNotNullParameter(currentList, "currentList");
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public void remove(T data) {
        List<? extends T> mutableList = CollectionsKt.toMutableList((Collection) getItems());
        mutableList.remove(data);
        submitList(mutableList);
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public void removeAt(int position) {
        if (position < getItems().size()) {
            List<? extends T> mutableList = CollectionsKt.toMutableList((Collection) getItems());
            mutableList.remove(position);
            submitList(mutableList);
        } else {
            throw new IndexOutOfBoundsException("position: " + position + ". size:" + getItems().size());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public void set(int position, T data) {
        List<? extends T> mutableList = CollectionsKt.toMutableList((Collection) getItems());
        mutableList.set(position, data);
        submitList(mutableList);
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public final void setItems(@NotNull List<? extends T> value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.mDiffer.submitList(value, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public void add(int position, T data) {
        if (position <= getItems().size() && position >= 0) {
            List<? extends T> mutableList = CollectionsKt.toMutableList((Collection) getItems());
            mutableList.add(position, data);
            submitList(mutableList);
        } else {
            throw new IndexOutOfBoundsException("position: " + position + ". size:" + getItems().size());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public void addAll(int position, @NotNull Collection<? extends T> collection) {
        Intrinsics.checkNotNullParameter(collection, "collection");
        if (position <= getItems().size() && position >= 0) {
            List<? extends T> mutableList = CollectionsKt.toMutableList((Collection) getItems());
            mutableList.addAll(position, collection);
            submitList(mutableList);
        } else {
            throw new IndexOutOfBoundsException("position: " + position + ". size:" + getItems().size());
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BaseDifferAdapter(@NotNull DiffUtil.ItemCallback<T> diffCallback) {
        this(diffCallback, CollectionsKt.emptyList());
        Intrinsics.checkNotNullParameter(diffCallback, "diffCallback");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public BaseDifferAdapter(@NotNull DiffUtil.ItemCallback<T> diffCallback, @NotNull List<? extends T> items) {
        Intrinsics.checkNotNullParameter(diffCallback, "diffCallback");
        Intrinsics.checkNotNullParameter(items, "items");
        AsyncDifferConfig<T> asyncDifferConfigBuild = new AsyncDifferConfig.Builder(diffCallback).build();
        Intrinsics.checkNotNullExpressionValue(asyncDifferConfigBuild, "Builder(diffCallback).build()");
        this(asyncDifferConfigBuild, items);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BaseDifferAdapter(@NotNull AsyncDifferConfig<T> config) {
        this(config, CollectionsKt.emptyList());
        Intrinsics.checkNotNullParameter(config, "config");
    }
}
