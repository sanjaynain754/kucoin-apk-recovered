package com.chad.library.adapter.base;

import android.content.Context;
import android.util.SparseArray;
import android.view.ViewGroup;
import androidx.exifinterface.media.ExifInterface;
import androidx.recyclerview.widget.RecyclerView;
import com.chad.library.R$id;
import com.facebook.react.uimanager.ViewProps;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.bugly.proguard.C33954u6;
import java.lang.ref.WeakReference;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: BaseMultiItemAdapter.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u00020\u00030\u0002:\u0003+,-B\u0015\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0002\u0010\u0006J2\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000\"\b\b\u0001\u0010\r*\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u000f2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u0002H\r0\u000bJ\u001e\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000b2\u0006\u0010\u0012\u001a\u00020\u0003H\u0002J\u001e\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u000f2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0014J\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u000fH\u0016J'\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u000f2\b\u0010\u001b\u001a\u0004\u0018\u00018\u0000H\u0014¢\u0006\u0002\u0010\u001cJ5\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u000f2\b\u0010\u001b\u001a\u0004\u0018\u00018\u00002\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001e0\u0005H\u0014¢\u0006\u0002\u0010\u001fJ \u0010 \u001a\u00020\u00032\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u000fH\u0014J\u0010\u0010&\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u0003H\u0016J\u001c\u0010'\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\bJ\u0010\u0010(\u001a\u00020\u001a2\u0006\u0010\u0012\u001a\u00020\u0003H\u0016J\u0010\u0010)\u001a\u00020\u001a2\u0006\u0010\u0012\u001a\u00020\u0003H\u0016J\u0010\u0010*\u001a\u00020\u001a2\u0006\u0010\u0012\u001a\u00020\u0003H\u0016R\u0016\u0010\u0007\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R \u0010\t\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00030\u000b0\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006."}, m90084d2 = {"Lcom/chad/library/adapter/base/BaseMultiItemAdapter;", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/chad/library/adapter/base/BaseQuickAdapter;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", FirebaseAnalytics.Param.ITEMS, "", "(Ljava/util/List;)V", "onItemViewTypeListener", "Lcom/chad/library/adapter/base/BaseMultiItemAdapter$OnItemViewTypeListener;", "typeViewHolders", "Landroid/util/SparseArray;", "Lcom/chad/library/adapter/base/BaseMultiItemAdapter$OnMultiItemAdapterListener;", "addItemType", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "itemViewType", "", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "findListener", C33954u6.f72238i, "getItemViewType", ViewProps.POSITION, "list", "isFullSpanItem", "", "itemType", "onBindViewHolder", "", "item", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;ILjava/lang/Object;)V", "payloads", "", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;ILjava/lang/Object;Ljava/util/List;)V", "onCreateViewHolder", "context", "Landroid/content/Context;", "parent", "Landroid/view/ViewGroup;", "viewType", "onFailedToRecycleView", "onItemViewType", "onViewAttachedToWindow", "onViewDetachedFromWindow", "onViewRecycled", "OnItemViewTypeListener", "OnMultiItem", "OnMultiItemAdapterListener", "com.github.CymChad.brvah"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public abstract class BaseMultiItemAdapter<T> extends BaseQuickAdapter<T, RecyclerView.ViewHolder> {

    @Nullable
    private OnItemViewTypeListener<T> onItemViewTypeListener;

    @NotNull
    private final SparseArray<OnMultiItemAdapterListener<T, RecyclerView.ViewHolder>> typeViewHolders;

    /* JADX INFO: compiled from: BaseMultiItemAdapter.kt */
    @Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\bæ\u0080\u0001\u0018\u0000*\u0004\b\u0001\u0010\u00012\u00020\u0002J\u001e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u0007H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0001"}, m90084d2 = {"Lcom/chad/library/adapter/base/BaseMultiItemAdapter$OnItemViewTypeListener;", ExifInterface.GPS_DIRECTION_TRUE, "", "onItemViewType", "", ViewProps.POSITION, "list", "", "com.github.CymChad.brvah"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    public interface OnItemViewTypeListener<T> {
        int onItemViewType(int position, @NotNull List<? extends T> list);
    }

    /* JADX INFO: compiled from: BaseMultiItemAdapter.kt */
    @Metadata(m90083d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u0000*\u0004\b\u0001\u0010\u0001*\b\b\u0002\u0010\u0002*\u00020\u00032\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00020\u0004B\u0005¢\u0006\u0002\u0010\u0005R\u0019\u0010\u0006\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00078F¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\b\f\u0010\rR(\u0010\u000e\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0007\u0018\u00010\u000fX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m90084d2 = {"Lcom/chad/library/adapter/base/BaseMultiItemAdapter$OnMultiItem;", ExifInterface.GPS_DIRECTION_TRUE, ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Lcom/chad/library/adapter/base/BaseMultiItemAdapter$OnMultiItemAdapterListener;", "()V", "adapter", "Lcom/chad/library/adapter/base/BaseMultiItemAdapter;", "getAdapter", "()Lcom/chad/library/adapter/base/BaseMultiItemAdapter;", "context", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "weakA", "Ljava/lang/ref/WeakReference;", "getWeakA$com_github_CymChad_brvah", "()Ljava/lang/ref/WeakReference;", "setWeakA$com_github_CymChad_brvah", "(Ljava/lang/ref/WeakReference;)V", "com.github.CymChad.brvah"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    public static abstract class OnMultiItem<T, V extends RecyclerView.ViewHolder> implements OnMultiItemAdapterListener<T, V> {

        @Nullable
        private WeakReference<BaseMultiItemAdapter<T>> weakA;

        @Nullable
        public final BaseMultiItemAdapter<T> getAdapter() {
            WeakReference<BaseMultiItemAdapter<T>> weakReference = this.weakA;
            if (weakReference != null) {
                return weakReference.get();
            }
            return null;
        }

        @Nullable
        public final Context getContext() {
            BaseMultiItemAdapter<T> baseMultiItemAdapter;
            WeakReference<BaseMultiItemAdapter<T>> weakReference = this.weakA;
            if (weakReference == null || (baseMultiItemAdapter = weakReference.get()) == null) {
                return null;
            }
            return baseMultiItemAdapter.getContext();
        }

        @Nullable
        public final WeakReference<BaseMultiItemAdapter<T>> getWeakA$com_github_CymChad_brvah() {
            return this.weakA;
        }

        public final void setWeakA$com_github_CymChad_brvah(@Nullable WeakReference<BaseMultiItemAdapter<T>> weakReference) {
            this.weakA = weakReference;
        }
    }

    /* JADX INFO: compiled from: BaseMultiItemAdapter.kt */
    @Metadata(m90083d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\bf\u0018\u0000*\u0004\b\u0001\u0010\u0001*\b\b\u0002\u0010\u0002*\u00020\u00032\u00020\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J'\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00028\u00022\u0006\u0010\f\u001a\u00020\b2\b\u0010\r\u001a\u0004\u0018\u00018\u0001H&¢\u0006\u0002\u0010\u000eJ5\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00028\u00022\u0006\u0010\f\u001a\u00020\b2\b\u0010\r\u001a\u0004\u0018\u00018\u00012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0010H\u0016¢\u0006\u0002\u0010\u0011J%\u0010\u0012\u001a\u00028\u00022\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\bH&¢\u0006\u0002\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0003H\u0016J\u0010\u0010\u001a\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0003H\u0016J\u0010\u0010\u001b\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0003H\u0016J\u0010\u0010\u001c\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0003H\u0016ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u001dÀ\u0006\u0001"}, m90084d2 = {"Lcom/chad/library/adapter/base/BaseMultiItemAdapter$OnMultiItemAdapterListener;", ExifInterface.GPS_DIRECTION_TRUE, ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "", "isFullSpanItem", "", "itemType", "", "onBind", "", C33954u6.f72238i, ViewProps.POSITION, "item", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;ILjava/lang/Object;)V", "payloads", "", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;ILjava/lang/Object;Ljava/util/List;)V", "onCreate", "context", "Landroid/content/Context;", "parent", "Landroid/view/ViewGroup;", "viewType", "(Landroid/content/Context;Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "onFailedToRecycleView", "onViewAttachedToWindow", "onViewDetachedFromWindow", "onViewRecycled", "com.github.CymChad.brvah"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    public interface OnMultiItemAdapterListener<T, V extends RecyclerView.ViewHolder> {
        default boolean isFullSpanItem(int itemType) {
            return false;
        }

        void onBind(@NotNull V holder, int position, @Nullable T item);

        default void onBind(@NotNull V holder, int position, @Nullable T item, @NotNull List<? extends Object> payloads) {
            Intrinsics.checkNotNullParameter(holder, "holder");
            Intrinsics.checkNotNullParameter(payloads, "payloads");
            onBind(holder, position, item);
        }

        @NotNull
        V onCreate(@NotNull Context context, @NotNull ViewGroup parent, int viewType);

        default boolean onFailedToRecycleView(@NotNull RecyclerView.ViewHolder holder) {
            Intrinsics.checkNotNullParameter(holder, "holder");
            return false;
        }

        default void onViewAttachedToWindow(@NotNull RecyclerView.ViewHolder holder) {
            Intrinsics.checkNotNullParameter(holder, "holder");
        }

        default void onViewDetachedFromWindow(@NotNull RecyclerView.ViewHolder holder) {
            Intrinsics.checkNotNullParameter(holder, "holder");
        }

        default void onViewRecycled(@NotNull RecyclerView.ViewHolder holder) {
            Intrinsics.checkNotNullParameter(holder, "holder");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BaseMultiItemAdapter() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public void onBindViewHolder(@NotNull RecyclerView.ViewHolder holder, int position, @Nullable T item) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        OnMultiItemAdapterListener<T, RecyclerView.ViewHolder> onMultiItemAdapterListenerFindListener = findListener(holder);
        if (onMultiItemAdapterListenerFindListener != null) {
            onMultiItemAdapterListenerFindListener.onBind(holder, position, item);
        }
    }

    public /* synthetic */ BaseMultiItemAdapter(List list, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? CollectionsKt.emptyList() : list);
    }

    private final OnMultiItemAdapterListener<T, RecyclerView.ViewHolder> findListener(RecyclerView.ViewHolder holder) {
        Object tag = holder.itemView.getTag(R$id.BaseQuickAdapter_key_multi);
        if (tag instanceof OnMultiItemAdapterListener) {
            return (OnMultiItemAdapterListener) tag;
        }
        return null;
    }

    @NotNull
    public final <V extends RecyclerView.ViewHolder> BaseMultiItemAdapter<T> addItemType(int itemViewType, @NotNull OnMultiItemAdapterListener<T, V> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        if (listener instanceof OnMultiItem) {
            ((OnMultiItem) listener).setWeakA$com_github_CymChad_brvah(new WeakReference<>(this));
        }
        this.typeViewHolders.put(itemViewType, listener);
        return this;
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public int getItemViewType(int position, @NotNull List<? extends T> list) {
        Intrinsics.checkNotNullParameter(list, "list");
        OnItemViewTypeListener<T> onItemViewTypeListener = this.onItemViewTypeListener;
        return onItemViewTypeListener != null ? onItemViewTypeListener.onItemViewType(position, list) : super.getItemViewType(position, list);
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public void onBindViewHolder(@NotNull RecyclerView.ViewHolder holder, int position, @Nullable T item, @NotNull List<? extends Object> payloads) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        if (payloads.isEmpty()) {
            onBindViewHolder(holder, position, item);
            return;
        }
        OnMultiItemAdapterListener<T, RecyclerView.ViewHolder> onMultiItemAdapterListenerFindListener = findListener(holder);
        if (onMultiItemAdapterListenerFindListener != null) {
            onMultiItemAdapterListenerFindListener.onBind(holder, position, item, payloads);
        }
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    @NotNull
    public RecyclerView.ViewHolder onCreateViewHolder(@NotNull Context context, @NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(parent, "parent");
        OnMultiItemAdapterListener<T, RecyclerView.ViewHolder> onMultiItemAdapterListener = this.typeViewHolders.get(viewType);
        if (onMultiItemAdapterListener != null) {
            Context context2 = parent.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "parent.context");
            RecyclerView.ViewHolder viewHolderOnCreate = onMultiItemAdapterListener.onCreate(context2, parent, viewType);
            viewHolderOnCreate.itemView.setTag(R$id.BaseQuickAdapter_key_multi, onMultiItemAdapterListener);
            return viewHolderOnCreate;
        }
        throw new IllegalArgumentException("ViewType: " + viewType + " not found onViewHolderListener，please use addItemType() first!");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public boolean onFailedToRecycleView(@NotNull RecyclerView.ViewHolder holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        OnMultiItemAdapterListener<T, RecyclerView.ViewHolder> onMultiItemAdapterListenerFindListener = findListener(holder);
        if (onMultiItemAdapterListenerFindListener != null) {
            return onMultiItemAdapterListenerFindListener.onFailedToRecycleView(holder);
        }
        return false;
    }

    @NotNull
    public final BaseMultiItemAdapter<T> onItemViewType(@Nullable OnItemViewTypeListener<T> listener) {
        this.onItemViewTypeListener = listener;
        return this;
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewAttachedToWindow(@NotNull RecyclerView.ViewHolder holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        super.onViewAttachedToWindow(holder);
        OnMultiItemAdapterListener<T, RecyclerView.ViewHolder> onMultiItemAdapterListenerFindListener = findListener(holder);
        if (onMultiItemAdapterListenerFindListener != null) {
            onMultiItemAdapterListenerFindListener.onViewAttachedToWindow(holder);
        }
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewDetachedFromWindow(@NotNull RecyclerView.ViewHolder holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        super.onViewDetachedFromWindow(holder);
        OnMultiItemAdapterListener<T, RecyclerView.ViewHolder> onMultiItemAdapterListenerFindListener = findListener(holder);
        if (onMultiItemAdapterListenerFindListener != null) {
            onMultiItemAdapterListenerFindListener.onViewDetachedFromWindow(holder);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewRecycled(@NotNull RecyclerView.ViewHolder holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        super.onViewRecycled(holder);
        OnMultiItemAdapterListener<T, RecyclerView.ViewHolder> onMultiItemAdapterListenerFindListener = findListener(holder);
        if (onMultiItemAdapterListenerFindListener != null) {
            onMultiItemAdapterListenerFindListener.onViewRecycled(holder);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseMultiItemAdapter(@NotNull List<? extends T> items) {
        super(items);
        Intrinsics.checkNotNullParameter(items, "items");
        this.typeViewHolders = new SparseArray<>(1);
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public boolean isFullSpanItem(int itemType) {
        OnMultiItemAdapterListener<T, RecyclerView.ViewHolder> onMultiItemAdapterListener;
        if (super.isFullSpanItem(itemType) || ((onMultiItemAdapterListener = this.typeViewHolders.get(itemType)) != null && onMultiItemAdapterListener.isFullSpanItem(itemType))) {
            return true;
        }
        return false;
    }
}
