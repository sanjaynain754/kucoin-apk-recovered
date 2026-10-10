package com.kubi.kucoin.home.cards;

import android.util.SparseArray;
import androidx.exifinterface.media.ExifInterface;
import com.facebook.react.uimanager.ViewProps;
import com.kubi.kucoin.home.cards.BaseCardData;
import com.kubi.kucoin.home.cards.exception.CardFlowMessage;
import com.kubi.sdk.BaseAdapter;
import com.kubi.sdk.DiffCallBack;
import com.kubi.sdk.InnerViewHolder;
import com.kubi.sdk.ItemCallBack;
import com.kubi.sdk.RefreshCallBack;
import com.kubi.sdk.ViewHolderProxy;
import com.tencent.bugly.proguard.C33954u6;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p569qq.C43846g;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: com.kubi.kucoin.home.cards.c, reason: from Kotlin metadata */
/* JADX INFO: compiled from: CardAdapter.kt */
/* JADX INFO: loaded from: classes18.dex */
@Metadata(m90083d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003:\u0001+Bm\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0005\u0012\u0010\u0010\u0006\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\b0\u0007\u0012\u0010\u0010\t\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\u0007\u0012\u0010\u0010\u000b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\u0007\u0012\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020!H\u0016J\u000e\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&J\u0018\u0010'\u001a\u00020$2\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0005H\u0016J\u0016\u0010(\u001a\u00020$2\f\u0010)\u001a\b\u0012\u0004\u0012\u00028\u00000*H\u0016R\"\u0010\u0004\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0005X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001e\u0010\u0006\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\b0\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u001e\u0010\t\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u001e\u0010\u000b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0017R\u001c\u0010\f\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\rX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001f¨\u0006,"}, m90084d2 = {"Lcom/kubi/kucoin/home/cards/CardAdapter;", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/kubi/kucoin/home/cards/BaseCardData;", "Lcom/kubi/sdk/BaseAdapter;", "data", "", "proxys", "Landroid/util/SparseArray;", "Ljava/lang/Class;", "shortCalls", "Lcom/kubi/sdk/ItemCallBack;", "longCalls", "diffCb", "Lcom/kubi/sdk/DiffCallBack;", "refreshCall", "Lcom/kubi/sdk/RefreshCallBack;", "<init>", "(Ljava/util/List;Landroid/util/SparseArray;Landroid/util/SparseArray;Landroid/util/SparseArray;Lcom/kubi/sdk/DiffCallBack;Lcom/kubi/sdk/RefreshCallBack;)V", "getData", "()Ljava/util/List;", "setData", "(Ljava/util/List;)V", "getProxys", "()Landroid/util/SparseArray;", "getShortCalls", "getLongCalls", "getDiffCb", "()Lcom/kubi/sdk/DiffCallBack;", "getRefreshCall", "()Lcom/kubi/sdk/RefreshCallBack;", "setRefreshCall", "(Lcom/kubi/sdk/RefreshCallBack;)V", "getItemViewType", "", ViewProps.POSITION, "remove", "", "code", "", "refresh", "onViewRecycled", C33954u6.f72238i, "Lcom/kubi/sdk/InnerViewHolder;", "Builder", "LCardFlow_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nCardAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CardAdapter.kt\ncom/kubi/kucoin/home/cards/CardAdapter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 CardFlowIssue.kt\ncom/kubi/kucoin/home/cards/exception/CardFlowIssueKt\n*L\n1#1,95:1\n360#2,7:96\n774#2:103\n865#2:104\n866#2:107\n48#3,2:105\n*S KotlinDebug\n*F\n+ 1 CardAdapter.kt\ncom/kubi/kucoin/home/cards/CardAdapter\n*L\n35#1:96,7\n44#1:103\n44#1:104\n44#1:107\n47#1:105,2\n*E\n"})
public final class CardAdapter<T extends BaseCardData> extends BaseAdapter<T> {

    /* JADX INFO: renamed from: q */
    @Nullable
    public volatile List<T> f27870q;

    /* JADX INFO: renamed from: r */
    @NotNull
    public final SparseArray<Class<?>> f27871r;

    /* JADX INFO: renamed from: s */
    @NotNull
    public final SparseArray<ItemCallBack<?>> f27872s;

    /* JADX INFO: renamed from: t */
    @NotNull
    public final SparseArray<ItemCallBack<?>> f27873t;

    /* JADX INFO: renamed from: u */
    @Nullable
    public final DiffCallBack<T> f27874u;

    /* JADX INFO: renamed from: v */
    @Nullable
    public RefreshCallBack f27875v;

    /* JADX INFO: renamed from: com.kubi.kucoin.home.cards.c$a */
    /* JADX INFO: compiled from: CardAdapter.kt */
    @Metadata(m90083d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u0000*\b\b\u0001\u0010\u0001*\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001c\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0007J\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00010\rJ\u0018\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u001dJ@\u0010%\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010&\u001a\u00020'2\n\u0010(\u001a\u0006\u0012\u0002\b\u00030\u00142\u000e\b\u0002\u0010)\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00182\u000e\b\u0002\u0010*\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0018J\u000e\u0010+\u001a\b\u0012\u0004\u0012\u00028\u00010,H\u0016R\"\u0010\u0006\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\"\u0010\f\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0012\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00140\u0013¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u001b\u0010\u0017\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00180\u0013¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0016R\u001b\u0010\u001a\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00180\u0013¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0016R\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!¨\u0006-"}, m90084d2 = {"Lcom/kubi/kucoin/home/cards/CardAdapter$Builder;", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/kubi/kucoin/home/cards/BaseCardData;", "", "<init>", "()V", "data", "", "getData", "()Ljava/util/List;", "setData", "(Ljava/util/List;)V", "diffCb", "Lcom/kubi/sdk/DiffCallBack;", "getDiffCb", "()Lcom/kubi/sdk/DiffCallBack;", "setDiffCb", "(Lcom/kubi/sdk/DiffCallBack;)V", "proxys", "Landroid/util/SparseArray;", "Ljava/lang/Class;", "getProxys", "()Landroid/util/SparseArray;", "shortCalls", "Lcom/kubi/sdk/ItemCallBack;", "getShortCalls", "longCalls", "getLongCalls", "refreshCall", "Lcom/kubi/sdk/RefreshCallBack;", "getRefreshCall", "()Lcom/kubi/sdk/RefreshCallBack;", "setRefreshCall", "(Lcom/kubi/sdk/RefreshCallBack;)V", "setDiffCallBack", "setRefreshCallBack", "call", "register", "type", "", "proxy", "shortCall", "longCall", "build", "Lcom/kubi/kucoin/home/cards/CardAdapter;", "LCardFlow_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nCardAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CardAdapter.kt\ncom/kubi/kucoin/home/cards/CardAdapter$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,95:1\n1#2:96\n*E\n"})
    public static class a<T extends BaseCardData> {

        /* JADX INFO: renamed from: a */
        @Nullable
        public List<T> f27876a;

        /* JADX INFO: renamed from: b */
        @Nullable
        public DiffCallBack<T> f27877b;

        /* JADX INFO: renamed from: c */
        @NotNull
        public final SparseArray<Class<?>> f27878c = new SparseArray<>();

        /* JADX INFO: renamed from: d */
        @NotNull
        public final SparseArray<ItemCallBack<?>> f27879d = new SparseArray<>();

        /* JADX INFO: renamed from: e */
        @NotNull
        public final SparseArray<ItemCallBack<?>> f27880e = new SparseArray<>();

        /* JADX INFO: renamed from: f */
        @Nullable
        public RefreshCallBack f27881f;

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: c */
        public static /* synthetic */ a m32197c(a aVar, int i11, Class cls, ItemCallBack itemCallBack, ItemCallBack itemCallBack2, int i12, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: register");
            }
            if ((i12 & 4) != 0) {
                itemCallBack = null;
            }
            if ((i12 & 8) != 0) {
                itemCallBack2 = null;
            }
            return aVar.m32199b(i11, cls, itemCallBack, itemCallBack2);
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public CardAdapter<T> m32198a() {
            return new CardAdapter<>(this.f27876a, this.f27878c, this.f27879d, this.f27880e, this.f27877b, this.f27881f);
        }

        @NotNull
        /* JADX INFO: renamed from: b */
        public final a<T> m32199b(int i11, @NotNull Class<?> proxy, @Nullable ItemCallBack<?> itemCallBack, @Nullable ItemCallBack<?> itemCallBack2) {
            Intrinsics.checkNotNullParameter(proxy, "proxy");
            this.f27878c.put(i11, proxy);
            if (itemCallBack != null) {
                this.f27879d.put(i11, itemCallBack);
            }
            if (itemCallBack2 != null) {
                this.f27880e.put(i11, itemCallBack2);
            }
            return this;
        }

        @NotNull
        /* JADX INFO: renamed from: d */
        public final a<T> m32200d(@NotNull DiffCallBack<T> diffCb) {
            Intrinsics.checkNotNullParameter(diffCb, "diffCb");
            this.f27877b = diffCb;
            return this;
        }
    }

    @Override // com.kubi.sdk.BaseAdapter
    /* JADX INFO: renamed from: p */
    public void mo32194p(@Nullable List<T> list) {
        List<T> mutableList = null;
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                BaseCardData baseCardData = (BaseCardData) obj;
                if (baseCardData.getCode() == null) {
                    C43846g.m96568c(new CardFlowMessage("code null", "CardAdapter", false, 4, null), null, 2, null);
                }
                if (baseCardData.getCode() != null) {
                    arrayList.add(obj);
                }
            }
            mutableList = CollectionsKt.toMutableList((Collection) arrayList);
        }
        super.mo32194p(mutableList);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardAdapter(@Nullable List<T> list, @NotNull SparseArray<Class<?>> proxys, @NotNull SparseArray<ItemCallBack<?>> shortCalls, @NotNull SparseArray<ItemCallBack<?>> longCalls, @Nullable DiffCallBack<T> diffCallBack, @Nullable RefreshCallBack refreshCallBack) {
        super(list, proxys, shortCalls, longCalls, diffCallBack, refreshCallBack);
        Intrinsics.checkNotNullParameter(proxys, "proxys");
        Intrinsics.checkNotNullParameter(shortCalls, "shortCalls");
        Intrinsics.checkNotNullParameter(longCalls, "longCalls");
        this.f27870q = list;
        this.f27871r = proxys;
        this.f27872s = shortCalls;
        this.f27873t = longCalls;
        this.f27874u = diffCallBack;
        this.f27875v = refreshCallBack;
    }

    @Override // com.kubi.sdk.BaseAdapter
    @Nullable
    /* JADX INFO: renamed from: g */
    public DiffCallBack<T> mo32189g() {
        return this.f27874u;
    }

    @Override // com.kubi.sdk.BaseAdapter
    @Nullable
    public List<T> getData() {
        return this.f27870q;
    }

    @Override // com.kubi.sdk.BaseAdapter
    @NotNull
    /* JADX INFO: renamed from: h */
    public SparseArray<ItemCallBack<?>> mo32190h() {
        return this.f27873t;
    }

    @Override // com.kubi.sdk.BaseAdapter
    @NotNull
    /* JADX INFO: renamed from: i */
    public SparseArray<Class<?>> mo32191i() {
        return this.f27871r;
    }

    @Override // com.kubi.sdk.BaseAdapter
    @Nullable
    /* JADX INFO: renamed from: j, reason: from getter */
    public RefreshCallBack getF96710v() {
        return this.f27875v;
    }

    @Override // com.kubi.sdk.BaseAdapter
    @NotNull
    /* JADX INFO: renamed from: k */
    public SparseArray<ItemCallBack<?>> mo32193k() {
        return this.f27872s;
    }

    @Override // com.kubi.sdk.BaseAdapter
    /* JADX INFO: renamed from: q */
    public void mo32195q(@Nullable List<T> list) {
        this.f27870q = list;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public void onViewRecycled(@NotNull InnerViewHolder<T> holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        super.onViewRecycled(holder);
        ViewHolderProxy<T> viewHolderProxyM57940b = holder.m57940b();
        CardViewHolderProxy cardViewHolderProxy = viewHolderProxyM57940b instanceof CardViewHolderProxy ? (CardViewHolderProxy) viewHolderProxyM57940b : null;
        if (cardViewHolderProxy != null) {
            cardViewHolderProxy.destroyCard();
        }
    }

    @Override // com.kubi.sdk.BaseAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int position) {
        T t11;
        String code;
        List<T> data = getData();
        if (data != null && (t11 = data.get(position)) != null && (code = t11.getCode()) != null) {
            return code.hashCode();
        }
        return -1;
    }
}
