package com.kubi.sdk;

import android.util.SparseArray;
import android.view.ViewGroup;
import androidx.exifinterface.media.ExifInterface;
import androidx.paging.PagedList;
import androidx.paging.PagedListAdapter;
import androidx.recyclerview.widget.DiffUtil;
import com.facebook.react.uimanager.ViewProps;
import com.tencent.bugly.proguard.C33954u6;
import java.lang.reflect.InvocationTargetException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: com.kubi.sdk.k0, reason: from Kotlin metadata */
/* JADX INFO: compiled from: BasePageAdapter.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m90083d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u0014\u0012\u0004\u0012\u0002H\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00010\u00040\u0003:\u0001\"BK\u0012\u0010\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00070\u0006\u0012\u0010\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t0\u0006\u0012\u0010\u0010\n\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t0\u0006\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\f¢\u0006\u0004\b\r\u0010\u000eJ\u001e\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\u001e\u0010\u001a\u001a\u00020\u001b2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010\u001d\u001a\u00020\u0019H\u0016J\u0010\u0010\u001e\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u0019H\u0016J\u0018\u0010\u001f\u001a\u00020\u001b2\u000e\u0010 \u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010!H\u0016R\u001e\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00070\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001e\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t0\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u001e\u0010\n\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t0\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006#"}, m90084d2 = {"Lcom/kubi/sdk/BasePageAdapter;", ExifInterface.GPS_DIRECTION_TRUE, "", "Landroidx/paging/PagedListAdapter;", "Lcom/kubi/sdk/InnerViewHolder;", "proxys", "Landroid/util/SparseArray;", "Ljava/lang/Class;", "shortCalls", "Lcom/kubi/sdk/ItemCallBack;", "longCalls", "diffCb", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "<init>", "(Landroid/util/SparseArray;Landroid/util/SparseArray;Landroid/util/SparseArray;Landroidx/recyclerview/widget/DiffUtil$ItemCallback;)V", "getProxys", "()Landroid/util/SparseArray;", "getShortCalls", "getLongCalls", "getDiffCb", "()Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "", "onBindViewHolder", "", C33954u6.f72238i, ViewProps.POSITION, "getItemViewType", "submitList", "pagedList", "Landroidx/paging/PagedList;", "Builder", "LBase_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public class BasePageAdapter<T> extends PagedListAdapter<T, InnerViewHolder<T>> {

    /* JADX INFO: renamed from: i */
    @NotNull
    public final SparseArray<Class<?>> f46866i;

    /* JADX INFO: renamed from: j */
    @NotNull
    public final SparseArray<ItemCallBack<?>> f46867j;

    /* JADX INFO: renamed from: k */
    @NotNull
    public final SparseArray<ItemCallBack<?>> f46868k;

    /* JADX INFO: renamed from: l */
    @NotNull
    public final DiffUtil.ItemCallback<T> f46869l;

    /* JADX INFO: renamed from: com.kubi.sdk.k0$a */
    /* JADX INFO: compiled from: BasePageAdapter.kt */
    @Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u0000*\b\b\u0001\u0010\u0001*\u00020\u00022\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004JD\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\n\u0010\u0010\u001a\u0006\u0012\u0002\b\u00030\u00072\n\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\u00072\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u000b2\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u000bJ\u001c\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00010\u00152\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00010\u0017H\u0016R\u001b\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001b\u0010\n\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000b0\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\tR\u001b\u0010\r\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000b0\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\t¨\u0006\u0018"}, m90084d2 = {"Lcom/kubi/sdk/BasePageAdapter$Builder;", ExifInterface.GPS_DIRECTION_TRUE, "", "<init>", "()V", "proxys", "Landroid/util/SparseArray;", "Ljava/lang/Class;", "getProxys", "()Landroid/util/SparseArray;", "shortCalls", "Lcom/kubi/sdk/ItemCallBack;", "getShortCalls", "longCalls", "getLongCalls", "register", "cls", "proxy", "shortCall", "longCall", "build", "Lcom/kubi/sdk/BasePageAdapter;", "diffCb", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "LBase_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nBasePageAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BasePageAdapter.kt\ncom/kubi/sdk/BasePageAdapter$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,99:1\n1#2:100\n*E\n"})
    public static class a<T> {

        /* JADX INFO: renamed from: a */
        @NotNull
        public final SparseArray<Class<?>> f46870a = new SparseArray<>();

        /* JADX INFO: renamed from: b */
        @NotNull
        public final SparseArray<ItemCallBack<?>> f46871b = new SparseArray<>();

        /* JADX INFO: renamed from: c */
        @NotNull
        public final SparseArray<ItemCallBack<?>> f46872c = new SparseArray<>();

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: c */
        public static /* synthetic */ a m57044c(a aVar, Class cls, Class cls2, ItemCallBack itemCallBack, ItemCallBack itemCallBack2, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: register");
            }
            if ((i11 & 4) != 0) {
                itemCallBack = null;
            }
            if ((i11 & 8) != 0) {
                itemCallBack2 = null;
            }
            return aVar.m57046b(cls, cls2, itemCallBack, itemCallBack2);
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public BasePageAdapter<T> m57045a(@NotNull DiffUtil.ItemCallback<T> diffCb) {
            Intrinsics.checkNotNullParameter(diffCb, "diffCb");
            return new BasePageAdapter<>(this.f46870a, this.f46871b, this.f46872c, diffCb);
        }

        @NotNull
        /* JADX INFO: renamed from: b */
        public final a<T> m57046b(@NotNull Class<?> cls, @NotNull Class<?> proxy, @Nullable ItemCallBack<?> itemCallBack, @Nullable ItemCallBack<?> itemCallBack2) {
            Intrinsics.checkNotNullParameter(cls, "cls");
            Intrinsics.checkNotNullParameter(proxy, "proxy");
            this.f46870a.put(cls.getName().hashCode(), proxy);
            if (itemCallBack != null) {
                this.f46871b.put(cls.getName().hashCode(), itemCallBack);
            }
            if (itemCallBack2 != null) {
                this.f46872c.put(cls.getName().hashCode(), itemCallBack2);
            }
            return this;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BasePageAdapter(@NotNull SparseArray<Class<?>> proxys, @NotNull SparseArray<ItemCallBack<?>> shortCalls, @NotNull SparseArray<ItemCallBack<?>> longCalls, @NotNull DiffUtil.ItemCallback<T> diffCb) {
        super(diffCb);
        Intrinsics.checkNotNullParameter(proxys, "proxys");
        Intrinsics.checkNotNullParameter(shortCalls, "shortCalls");
        Intrinsics.checkNotNullParameter(longCalls, "longCalls");
        Intrinsics.checkNotNullParameter(diffCb, "diffCb");
        this.f46866i = proxys;
        this.f46867j = shortCalls;
        this.f46868k = longCalls;
        this.f46869l = diffCb;
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public SparseArray<ItemCallBack<?>> m57039g() {
        return this.f46868k;
    }

    @NotNull
    /* JADX INFO: renamed from: h */
    public SparseArray<Class<?>> m57040h() {
        return this.f46866i;
    }

    @NotNull
    /* JADX INFO: renamed from: i */
    public SparseArray<ItemCallBack<?>> m57041i() {
        return this.f46867j;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull InnerViewHolder<T> holder, int i11) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        ViewHolderProxy<T> viewHolderProxyM57940b = holder.m57940b();
        T item = getItem(i11);
        Intrinsics.checkNotNull(item);
        ViewHolderProxy.dispatchBindView$default(viewHolderProxyM57940b, item, null, 2, null);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public InnerViewHolder<T> onCreateViewHolder(@NotNull ViewGroup parent, int i11) throws IllegalAccessException, InstantiationException, InvocationTargetException {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Object objNewInstance = m57040h().get(i11).getConstructor(ViewGroup.class, ItemCallBack.class, ItemCallBack.class).newInstance(parent, m57041i().get(i11), m57039g().get(i11));
        Intrinsics.checkNotNull(objNewInstance, "null cannot be cast to non-null type com.kubi.sdk.ViewHolderProxy<T of com.kubi.sdk.BasePageAdapter>");
        return new InnerViewHolder<>(parent, (ViewHolderProxy) objNewInstance, null, 4, null);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int position) {
        T item = getItem(position);
        Intrinsics.checkNotNull(item);
        return item.getClass().getName().hashCode();
    }

    @Override // androidx.paging.PagedListAdapter
    public void submitList(@Nullable PagedList<T> pagedList) {
        super.submitList(pagedList);
        notifyDataSetChanged();
    }
}
