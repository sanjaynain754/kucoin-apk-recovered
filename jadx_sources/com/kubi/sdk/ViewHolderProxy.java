package com.kubi.sdk;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.bugly.proguard.C33954u6;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.sdk.n3, reason: from Kotlin metadata */
/* JADX INFO: compiled from: BaseAdapter.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B/\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0006\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ'\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00028\u00002\u0012\b\u0002\u0010!\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\"¢\u0006\u0002\u0010#J\b\u0010$\u001a\u00020%H&J\u0015\u0010&\u001a\u00020\u001f2\u0006\u0010 \u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0013J)\u0010&\u001a\u00020\u001f2\u0006\u0010 \u001a\u00028\u00002\u0012\b\u0002\u0010'\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\"H\u0016¢\u0006\u0002\u0010#J\b\u0010(\u001a\u00020\u001fH\u0016R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0005\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0007\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u001e\u0010\u000f\u001a\u0004\u0018\u00018\u0000X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0014\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0015\u001a\u00020\u0016X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u0002X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0011\"\u0004\b\u001d\u0010\u0013¨\u0006)"}, m90084d2 = {"Lcom/kubi/sdk/ViewHolderProxy;", "D", "", "parent", "Landroid/view/ViewGroup;", "shortCall", "Lcom/kubi/sdk/ItemCallBack;", "longCall", "<init>", "(Landroid/view/ViewGroup;Lcom/kubi/sdk/ItemCallBack;Lcom/kubi/sdk/ItemCallBack;)V", "getParent", "()Landroid/view/ViewGroup;", "getShortCall", "()Lcom/kubi/sdk/ItemCallBack;", "getLongCall", "data", "getData", "()Ljava/lang/Object;", "setData", "(Ljava/lang/Object;)V", "Ljava/lang/Object;", C33954u6.f72238i, "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "getHolder", "()Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "setHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V", "adapterExtraData", "getAdapterExtraData", "setAdapterExtraData", "dispatchBindView", "", "d", "payloads", "", "(Ljava/lang/Object;Ljava/util/List;)V", "createView", "Landroid/view/View;", "bindView", "payload", "onViewAttachedToWindow", "LBase_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public abstract class ViewHolderProxy<D> {

    @Nullable
    private Object adapterExtraData;

    @Nullable
    private D data;
    public RecyclerView.ViewHolder holder;

    @Nullable
    private final ItemCallBack<?> longCall;

    @NotNull
    private final ViewGroup parent;

    @Nullable
    private final ItemCallBack<?> shortCall;

    public ViewHolderProxy(@NotNull ViewGroup parent, @Nullable ItemCallBack<?> itemCallBack, @Nullable ItemCallBack<?> itemCallBack2) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        this.parent = parent;
        this.shortCall = itemCallBack;
        this.longCall = itemCallBack2;
    }

    public void bindView(D d11) {
    }

    @NotNull
    public abstract View createView();

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void bindView$default(ViewHolderProxy viewHolderProxy, Object obj, List list, int i11, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: bindView");
        }
        if ((i11 & 2) != 0) {
            list = null;
        }
        viewHolderProxy.bindView(obj, list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void dispatchBindView$default(ViewHolderProxy viewHolderProxy, Object obj, List list, int i11, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: dispatchBindView");
        }
        if ((i11 & 2) != 0) {
            list = null;
        }
        viewHolderProxy.dispatchBindView(obj, list);
    }

    public void bindView(D d11, @Nullable List<? extends Object> payload) {
    }

    public final void dispatchBindView(D d11, @Nullable List<? extends Object> payloads) {
        this.data = d11;
        if (payloads != null) {
            bindView(d11, payloads);
        } else {
            bindView(d11);
        }
    }

    @Nullable
    public final Object getAdapterExtraData() {
        return this.adapterExtraData;
    }

    @Nullable
    public final D getData() {
        return this.data;
    }

    @NotNull
    public final RecyclerView.ViewHolder getHolder() {
        RecyclerView.ViewHolder viewHolder = this.holder;
        if (viewHolder != null) {
            return viewHolder;
        }
        Intrinsics.throwUninitializedPropertyAccessException(C33954u6.f72238i);
        return null;
    }

    @Nullable
    public ItemCallBack<?> getLongCall() {
        return this.longCall;
    }

    @NotNull
    public ViewGroup getParent() {
        return this.parent;
    }

    @Nullable
    public ItemCallBack<?> getShortCall() {
        return this.shortCall;
    }

    public final void setAdapterExtraData(@Nullable Object obj) {
        this.adapterExtraData = obj;
    }

    public final void setData(@Nullable D d11) {
        this.data = d11;
    }

    public final void setHolder(@NotNull RecyclerView.ViewHolder viewHolder) {
        Intrinsics.checkNotNullParameter(viewHolder, "<set-?>");
        this.holder = viewHolder;
    }

    public /* synthetic */ ViewHolderProxy(ViewGroup viewGroup, ItemCallBack itemCallBack, ItemCallBack itemCallBack2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(viewGroup, (i11 & 2) != 0 ? null : itemCallBack, (i11 & 4) != 0 ? null : itemCallBack2);
    }

    public void onViewAttachedToWindow() {
    }
}
