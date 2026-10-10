package com.kubi.sdk.adapter;

import androidx.annotation.UiThread;
import androidx.exifinterface.media.ExifInterface;
import androidx.recyclerview.widget.AdapterListUpdateCallback;
import androidx.recyclerview.widget.AsyncDifferConfig;
import androidx.recyclerview.widget.AsyncListDiffer;
import androidx.recyclerview.widget.DiffUtil;
import com.chad.library.adapter.base.BaseMultiItemAdapter;
import com.facebook.react.uimanager.ViewProps;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.sdk.adapter.KcBaseDifferMultiAdapter;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p275fy.RunnableC37729b;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: KcBaseDifferMultiAdapter.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m90083d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u001e\n\u0002\b\u0007\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B#\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\u0004\b\u0007\u0010\bB\u0017\b\u0016\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\n¢\u0006\u0004\b\u0007\u0010\u000bB%\b\u0016\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\n\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\u0004\b\u0007\u0010\fB\u0017\b\u0016\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0004\b\u0007\u0010\rJ$\u0010\u0017\u001a\u00020\u00182\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u00062\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006H\u0016J\u0018\u0010\u001b\u001a\u00020\u00182\u000e\u0010\u001c\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0006H\u0017J\"\u0010\u001d\u001a\u00020\u00182\u000e\u0010\u001c\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00062\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0007J\"\u0010\u001b\u001a\u00020\u00182\u000e\u0010\u001c\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00062\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0003J\u001e\u0010 \u001a\u00020\u00182\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0002\u0010$J\u0015\u0010%\u001a\u00020\u00182\u0006\u0010#\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010&J\u001d\u0010%\u001a\u00020\u00182\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010$J\u0016\u0010'\u001a\u00020\u00182\f\u0010(\u001a\b\u0012\u0004\u0012\u00028\u00000)H\u0016J\u001e\u0010'\u001a\u00020\u00182\u0006\u0010!\u001a\u00020\"2\f\u0010(\u001a\b\u0012\u0004\u0012\u00028\u00000)H\u0016J\u0010\u0010*\u001a\u00020\u00182\u0006\u0010!\u001a\u00020\"H\u0016J\u0015\u0010+\u001a\u00020\u00182\u0006\u0010#\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010&J\u0018\u0010,\u001a\u00020\u00182\u0006\u0010-\u001a\u00020\"2\u0006\u0010.\u001a\u00020\"H\u0016J\u0018\u0010/\u001a\u00020\u00182\u0006\u0010-\u001a\u00020\"2\u0006\u0010.\u001a\u00020\"H\u0016R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R0\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00062\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u00068F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u00060"}, m90084d2 = {"Lcom/kubi/sdk/adapter/KcBaseDifferMultiAdapter;", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/chad/library/adapter/base/BaseMultiItemAdapter;", "config", "Landroidx/recyclerview/widget/AsyncDifferConfig;", FirebaseAnalytics.Param.ITEMS, "", "<init>", "(Landroidx/recyclerview/widget/AsyncDifferConfig;Ljava/util/List;)V", "diffCallback", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "(Landroidx/recyclerview/widget/DiffUtil$ItemCallback;)V", "(Landroidx/recyclerview/widget/DiffUtil$ItemCallback;Ljava/util/List;)V", "(Landroidx/recyclerview/widget/AsyncDifferConfig;)V", "mDiffer", "Landroidx/recyclerview/widget/AsyncListDiffer;", "mListener", "Landroidx/recyclerview/widget/AsyncListDiffer$ListListener;", "value", "getItems", "()Ljava/util/List;", "setItems", "(Ljava/util/List;)V", "onCurrentListChanged", "", "previousList", "currentList", "submitList", "list", "submitListWithCallBack", "commitCallback", "Ljava/lang/Runnable;", "set", ViewProps.POSITION, "", "data", "(ILjava/lang/Object;)V", "add", "(Ljava/lang/Object;)V", "addAll", "collection", "", "removeAt", "remove", "swap", "fromPosition", "toPosition", "move", "LBase_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public abstract class KcBaseDifferMultiAdapter<T> extends BaseMultiItemAdapter<T> {

    /* JADX INFO: renamed from: i */
    @NotNull
    public final AsyncListDiffer<T> f46450i;

    /* JADX INFO: renamed from: j */
    @NotNull
    public final AsyncListDiffer.ListListener<T> f46451j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KcBaseDifferMultiAdapter(@NotNull AsyncDifferConfig<T> config, @NotNull List<? extends T> items) {
        super(items);
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(items, "items");
        AsyncListDiffer<T> asyncListDiffer = new AsyncListDiffer<>(new AdapterListUpdateCallback(this), config);
        this.f46450i = asyncListDiffer;
        AsyncListDiffer.ListListener<T> listListener = new AsyncListDiffer.ListListener() { // from class: fy.c
            @Override // androidx.recyclerview.widget.AsyncListDiffer.ListListener
            public final void onCurrentListChanged(List list, List list2) {
                KcBaseDifferMultiAdapter.m56505l(this.f85008a, list, list2);
            }
        };
        this.f46451j = listListener;
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
    @UiThread
    public void submitList(@Nullable List<? extends T> list) {
        submitList(list, new RunnableC37729b());
    }

    /* JADX INFO: renamed from: l */
    public static final void m56505l(KcBaseDifferMultiAdapter kcBaseDifferMultiAdapter, List previousList, List currentList) {
        Intrinsics.checkNotNullParameter(previousList, "previousList");
        Intrinsics.checkNotNullParameter(currentList, "currentList");
        boolean zDisplayEmptyView = kcBaseDifferMultiAdapter.displayEmptyView(previousList);
        boolean zDisplayEmptyView2 = kcBaseDifferMultiAdapter.displayEmptyView(currentList);
        if (zDisplayEmptyView && !zDisplayEmptyView2) {
            kcBaseDifferMultiAdapter.notifyItemRemoved(0);
            kcBaseDifferMultiAdapter.getRecyclerView().scrollToPosition(0);
        } else if (zDisplayEmptyView2 && !zDisplayEmptyView) {
            kcBaseDifferMultiAdapter.notifyItemInserted(0);
        } else if (zDisplayEmptyView && zDisplayEmptyView2) {
            kcBaseDifferMultiAdapter.notifyItemChanged(0, 0);
        }
        kcBaseDifferMultiAdapter.onCurrentListChanged(previousList, currentList);
    }

    @UiThread
    private final void submitList(List<? extends T> list, Runnable commitCallback) {
        this.f46450i.submitList(list, commitCallback);
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    @NotNull
    public final List<T> getItems() {
        List<T> currentList = this.f46450i.getCurrentList();
        Intrinsics.checkNotNullExpressionValue(currentList, "getCurrentList(...)");
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

    public void onCurrentListChanged(@NotNull List<? extends T> previousList, @NotNull List<? extends T> currentList) {
        Intrinsics.checkNotNullParameter(previousList, "previousList");
        Intrinsics.checkNotNullParameter(currentList, "currentList");
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public final void setItems(@NotNull List<? extends T> value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f46450i.submitList(value, null);
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

    @UiThread
    /* JADX INFO: renamed from: m */
    public final void m56506m(@Nullable List<? extends T> list, @Nullable Runnable runnable) {
        submitList(list, runnable);
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
    public KcBaseDifferMultiAdapter(@NotNull DiffUtil.ItemCallback<T> diffCallback) {
        this(diffCallback, CollectionsKt.emptyList());
        Intrinsics.checkNotNullParameter(diffCallback, "diffCallback");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public KcBaseDifferMultiAdapter(@NotNull DiffUtil.ItemCallback<T> diffCallback, @NotNull List<? extends T> items) {
        Intrinsics.checkNotNullParameter(diffCallback, "diffCallback");
        Intrinsics.checkNotNullParameter(items, "items");
        AsyncDifferConfig<T> asyncDifferConfigBuild = new AsyncDifferConfig.Builder(diffCallback).build();
        Intrinsics.checkNotNullExpressionValue(asyncDifferConfigBuild, "build(...)");
        this(asyncDifferConfigBuild, items);
    }
}
