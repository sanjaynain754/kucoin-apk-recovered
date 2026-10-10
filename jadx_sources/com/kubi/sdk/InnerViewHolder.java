package com.kubi.sdk;

import android.view.ViewGroup;
import androidx.exifinterface.media.ExifInterface;
import androidx.recyclerview.widget.RecyclerView;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.sdk.r2, reason: from Kotlin metadata */
/* JADX INFO: compiled from: BaseAdapter.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u000b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B)\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, m90084d2 = {"Lcom/kubi/sdk/InnerViewHolder;", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "parent", "Landroid/view/ViewGroup;", "proxy", "Lcom/kubi/sdk/ViewHolderProxy;", "tag", "", "<init>", "(Landroid/view/ViewGroup;Lcom/kubi/sdk/ViewHolderProxy;Ljava/lang/Object;)V", "getParent", "()Landroid/view/ViewGroup;", "getProxy", "()Lcom/kubi/sdk/ViewHolderProxy;", "getTag", "()Ljava/lang/Object;", "setTag", "(Ljava/lang/Object;)V", "LBase_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class InnerViewHolder<T> extends RecyclerView.ViewHolder {

    /* JADX INFO: renamed from: g */
    @NotNull
    public final ViewGroup f47610g;

    /* JADX INFO: renamed from: h */
    @NotNull
    public final ViewHolderProxy<T> f47611h;

    /* JADX INFO: renamed from: i */
    @Nullable
    public Object f47612i;

    public /* synthetic */ InnerViewHolder(ViewGroup viewGroup, ViewHolderProxy viewHolderProxy, Object obj, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(viewGroup, viewHolderProxy, (i11 & 4) != 0 ? null : obj);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InnerViewHolder(@NotNull ViewGroup parent, @NotNull ViewHolderProxy<T> proxy, @Nullable Object obj) {
        super(proxy.createView());
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(proxy, "proxy");
        this.f47610g = parent;
        this.f47611h = proxy;
        this.f47612i = obj;
        proxy.setHolder(this);
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final ViewHolderProxy<T> m57940b() {
        return this.f47611h;
    }

    @Nullable
    /* JADX INFO: renamed from: c, reason: from getter */
    public final Object getF47612i() {
        return this.f47612i;
    }

    /* JADX INFO: renamed from: d */
    public final void m57942d(@Nullable Object obj) {
        this.f47612i = obj;
    }
}
