package p562qj;

import android.util.SparseArray;
import androidx.exifinterface.media.ExifInterface;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.react.uimanager.ViewProps;
import com.kubi.home.exception.HomeMessage;
import com.kubi.home.v2.card.C15000n;
import com.kubi.home.v2.container.p088ui.GridItemTouchHelper;
import com.kubi.kucoin.home.p090v2.cards.BaseCardDataV2;
import com.kubi.kucoin.home.p090v2.cards.CardViewHolderProxyV2;
import com.kubi.sdk.BaseAdapter;
import com.kubi.sdk.DiffCallBack;
import com.kubi.sdk.InnerViewHolder;
import com.kubi.sdk.ItemCallBack;
import com.kubi.sdk.RefreshCallBack;
import com.kubi.sdk.ViewHolderProxy;
import com.tencent.bugly.proguard.C33954u6;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p569qq.C43846g;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: qj.a */
/* JADX INFO: compiled from: GridAdapter.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0016\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003:\u0001=Bm\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0005\u0012\u0010\u0010\u0006\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\b0\u0007\u0012\u0010\u0010\t\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\u0007\u0012\u0010\u0010\u000b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\u0007\u0012\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010'\u001a\u00020(H\u0016J\u0010\u0010)\u001a\u00020(2\u0006\u0010*\u001a\u00020(H\u0016J\u0016\u0010+\u001a\u00020,2\f\u0010-\u001a\b\u0012\u0004\u0012\u00028\u00000.H\u0016J\u0016\u0010/\u001a\u00020,2\f\u0010-\u001a\b\u0012\u0004\u0012\u00028\u00000.H\u0016J\u0016\u00100\u001a\u00020,2\u0006\u00101\u001a\u00020(2\u0006\u00102\u001a\u00020(J\u0010\u00103\u001a\u00020,2\u0006\u0010\"\u001a\u00020!H\u0016J\u0010\u00104\u001a\u00020,2\u0006\u0010\"\u001a\u00020!H\u0016J\u0006\u00105\u001a\u00020(J\u0014\u00106\u001a\u00020,2\f\u00107\u001a\b\u0012\u0004\u0012\u00028\u00000&J\u000e\u00108\u001a\u00020,2\u0006\u00109\u001a\u00020:J\u0018\u0010;\u001a\u00020,2\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0005H\u0016J\u0016\u0010<\u001a\u00020,2\f\u0010-\u001a\b\u0012\u0004\u0012\u00028\u00000.H\u0016R\"\u0010\u0004\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0005X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001e\u0010\u0006\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\b0\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u001e\u0010\t\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u001e\u0010\u000b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0017R\u001c\u0010\f\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\rX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\"\u0010\"\u001a\u0004\u0018\u00010!2\b\u0010 \u001a\u0004\u0018\u00010!@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0016\u0010%\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010&X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006>"}, m90084d2 = {"Lcom/kubi/home/v2/container/ui/GridAdapter;", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/kubi/kucoin/home/v2/cards/BaseCardDataV2;", "Lcom/kubi/sdk/BaseAdapter;", "data", "", "proxys", "Landroid/util/SparseArray;", "Ljava/lang/Class;", "shortCalls", "Lcom/kubi/sdk/ItemCallBack;", "longCalls", "diffCb", "Lcom/kubi/sdk/DiffCallBack;", "refreshCall", "Lcom/kubi/sdk/RefreshCallBack;", "<init>", "(Ljava/util/List;Landroid/util/SparseArray;Landroid/util/SparseArray;Landroid/util/SparseArray;Lcom/kubi/sdk/DiffCallBack;Lcom/kubi/sdk/RefreshCallBack;)V", "getData", "()Ljava/util/List;", "setData", "(Ljava/util/List;)V", "getProxys", "()Landroid/util/SparseArray;", "getShortCalls", "getLongCalls", "getDiffCb", "()Lcom/kubi/sdk/DiffCallBack;", "getRefreshCall", "()Lcom/kubi/sdk/RefreshCallBack;", "setRefreshCall", "(Lcom/kubi/sdk/RefreshCallBack;)V", "value", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "getRecyclerView", "()Landroidx/recyclerview/widget/RecyclerView;", "itemTouchHelper", "Lcom/kubi/home/v2/container/ui/GridItemTouchHelper;", "getItemCount", "", "getItemViewType", ViewProps.POSITION, "onViewAttachedToWindow", "", C33954u6.f72238i, "Lcom/kubi/sdk/InnerViewHolder;", "onViewDetachedFromWindow", "moveItem", "fromPosition", "toPosition", "onAttachedToRecyclerView", "onDetachedFromRecyclerView", "getFixedItemCount", "setItemTouchHelper", "touchHelper", "remove", "code", "", "refresh", "onViewRecycled", "Builder", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nGridAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GridAdapter.kt\ncom/kubi/home/v2/container/ui/GridAdapter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 HomeIssue.kt\ncom/kubi/home/exception/HomeIssueKt\n*L\n1#1,163:1\n360#2,7:164\n774#2:171\n865#2:172\n866#2:175\n51#3,2:173\n*S KotlinDebug\n*F\n+ 1 GridAdapter.kt\ncom/kubi/home/v2/container/ui/GridAdapter\n*L\n102#1:164,7\n111#1:171\n111#1:172\n111#1:175\n114#1:173,2\n*E\n"})
public class C43745a<T extends BaseCardDataV2> extends BaseAdapter<T> {

    /* JADX INFO: renamed from: q */
    @Nullable
    public volatile List<T> f96705q;

    /* JADX INFO: renamed from: r */
    @NotNull
    public final SparseArray<Class<?>> f96706r;

    /* JADX INFO: renamed from: s */
    @NotNull
    public final SparseArray<ItemCallBack<?>> f96707s;

    /* JADX INFO: renamed from: t */
    @NotNull
    public final SparseArray<ItemCallBack<?>> f96708t;

    /* JADX INFO: renamed from: u */
    @Nullable
    public final DiffCallBack<T> f96709u;

    /* JADX INFO: renamed from: v */
    @Nullable
    public RefreshCallBack f96710v;

    /* JADX INFO: renamed from: w */
    @Nullable
    public RecyclerView f96711w;

    /* JADX INFO: renamed from: x */
    @Nullable
    public GridItemTouchHelper<T> f96712x;

    /* JADX INFO: renamed from: qj.a$a */
    /* JADX INFO: compiled from: GridAdapter.kt */
    @Metadata(m90083d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u0000*\b\b\u0001\u0010\u0001*\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001c\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0007J\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00010\rJ\u0018\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u001dJ@\u0010%\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010&\u001a\u00020'2\n\u0010(\u001a\u0006\u0012\u0002\b\u00030\u00142\u000e\b\u0002\u0010)\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00182\u000e\b\u0002\u0010*\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0018J\u000e\u0010+\u001a\b\u0012\u0004\u0012\u00028\u00010,H\u0016R\"\u0010\u0006\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\"\u0010\f\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0012\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00140\u0013¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u001b\u0010\u0017\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00180\u0013¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0016R\u001b\u0010\u001a\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00180\u0013¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0016R\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!¨\u0006-"}, m90084d2 = {"Lcom/kubi/home/v2/container/ui/GridAdapter$Builder;", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/kubi/kucoin/home/v2/cards/BaseCardDataV2;", "", "<init>", "()V", "data", "", "getData", "()Ljava/util/List;", "setData", "(Ljava/util/List;)V", "diffCb", "Lcom/kubi/sdk/DiffCallBack;", "getDiffCb", "()Lcom/kubi/sdk/DiffCallBack;", "setDiffCb", "(Lcom/kubi/sdk/DiffCallBack;)V", "proxys", "Landroid/util/SparseArray;", "Ljava/lang/Class;", "getProxys", "()Landroid/util/SparseArray;", "shortCalls", "Lcom/kubi/sdk/ItemCallBack;", "getShortCalls", "longCalls", "getLongCalls", "refreshCall", "Lcom/kubi/sdk/RefreshCallBack;", "getRefreshCall", "()Lcom/kubi/sdk/RefreshCallBack;", "setRefreshCall", "(Lcom/kubi/sdk/RefreshCallBack;)V", "setDiffCallBack", "setRefreshCallBack", "call", "register", "type", "", "proxy", "shortCall", "longCall", "build", "Lcom/kubi/home/v2/container/ui/GridAdapter;", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nGridAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GridAdapter.kt\ncom/kubi/home/v2/container/ui/GridAdapter$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,163:1\n1#2:164\n*E\n"})
    public static class a<T extends BaseCardDataV2> {

        /* JADX INFO: renamed from: a */
        @Nullable
        public List<T> f96713a;

        /* JADX INFO: renamed from: b */
        @Nullable
        public DiffCallBack<T> f96714b;

        /* JADX INFO: renamed from: c */
        @NotNull
        public final SparseArray<Class<?>> f96715c = new SparseArray<>();

        /* JADX INFO: renamed from: d */
        @NotNull
        public final SparseArray<ItemCallBack<?>> f96716d = new SparseArray<>();

        /* JADX INFO: renamed from: e */
        @NotNull
        public final SparseArray<ItemCallBack<?>> f96717e = new SparseArray<>();

        /* JADX INFO: renamed from: f */
        @Nullable
        public RefreshCallBack f96718f;

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: c */
        public static /* synthetic */ a m96372c(a aVar, int i11, Class cls, ItemCallBack itemCallBack, ItemCallBack itemCallBack2, int i12, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: register");
            }
            if ((i12 & 4) != 0) {
                itemCallBack = null;
            }
            if ((i12 & 8) != 0) {
                itemCallBack2 = null;
            }
            return aVar.m96374b(i11, cls, itemCallBack, itemCallBack2);
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public C43745a<T> m96373a() {
            return new C43745a<>(this.f96713a, this.f96715c, this.f96716d, this.f96717e, this.f96714b, this.f96718f);
        }

        @NotNull
        /* JADX INFO: renamed from: b */
        public final a<T> m96374b(int i11, @NotNull Class<?> proxy, @Nullable ItemCallBack<?> itemCallBack, @Nullable ItemCallBack<?> itemCallBack2) {
            Intrinsics.checkNotNullParameter(proxy, "proxy");
            this.f96715c.put(i11, proxy);
            if (itemCallBack != null) {
                this.f96716d.put(i11, itemCallBack);
            }
            if (itemCallBack2 != null) {
                this.f96717e.put(i11, itemCallBack2);
            }
            return this;
        }

        @NotNull
        /* JADX INFO: renamed from: d */
        public final a<T> m96375d(@NotNull DiffCallBack<T> diffCb) {
            Intrinsics.checkNotNullParameter(diffCb, "diffCb");
            this.f96714b = diffCb;
            return this;
        }

        @NotNull
        /* JADX INFO: renamed from: e */
        public final a<T> m96376e(@Nullable RefreshCallBack refreshCallBack) {
            this.f96718f = refreshCallBack;
            return this;
        }
    }

    public /* synthetic */ C43745a(List list, SparseArray sparseArray, SparseArray sparseArray2, SparseArray sparseArray3, DiffCallBack diffCallBack, RefreshCallBack refreshCallBack, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : list, sparseArray, sparseArray2, sparseArray3, (i11 & 16) != 0 ? null : diffCallBack, (i11 & 32) != 0 ? null : refreshCallBack);
    }

    @Override // com.kubi.sdk.BaseAdapter
    /* JADX INFO: renamed from: p */
    public void mo32194p(@Nullable List<T> list) {
        List<T> mutableList = null;
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                BaseCardDataV2 baseCardDataV2 = (BaseCardDataV2) obj;
                if (baseCardDataV2.getCode() == null) {
                    C43846g.m96568c(new HomeMessage("code null", "CardAdapter", false, 4, null), null, 2, null);
                }
                if (baseCardDataV2.getCode() != null) {
                    arrayList.add(obj);
                }
            }
            mutableList = CollectionsKt.toMutableList((Collection) arrayList);
        }
        super.mo32194p(mutableList);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C43745a(@Nullable List<T> list, @NotNull SparseArray<Class<?>> proxys, @NotNull SparseArray<ItemCallBack<?>> shortCalls, @NotNull SparseArray<ItemCallBack<?>> longCalls, @Nullable DiffCallBack<T> diffCallBack, @Nullable RefreshCallBack refreshCallBack) {
        super(list, proxys, shortCalls, longCalls, diffCallBack, refreshCallBack);
        Intrinsics.checkNotNullParameter(proxys, "proxys");
        Intrinsics.checkNotNullParameter(shortCalls, "shortCalls");
        Intrinsics.checkNotNullParameter(longCalls, "longCalls");
        this.f96705q = list;
        this.f96706r = proxys;
        this.f96707s = shortCalls;
        this.f96708t = longCalls;
        this.f96709u = diffCallBack;
        this.f96710v = refreshCallBack;
    }

    @Override // com.kubi.sdk.BaseAdapter
    @Nullable
    /* JADX INFO: renamed from: g */
    public DiffCallBack<T> mo32189g() {
        return this.f96709u;
    }

    @Override // com.kubi.sdk.BaseAdapter
    @Nullable
    public List<T> getData() {
        return this.f96705q;
    }

    @Nullable
    /* JADX INFO: renamed from: getRecyclerView, reason: from getter */
    public final RecyclerView getF96711w() {
        return this.f96711w;
    }

    @Override // com.kubi.sdk.BaseAdapter
    @NotNull
    /* JADX INFO: renamed from: h */
    public SparseArray<ItemCallBack<?>> mo32190h() {
        return this.f96708t;
    }

    @Override // com.kubi.sdk.BaseAdapter
    @NotNull
    /* JADX INFO: renamed from: i */
    public SparseArray<Class<?>> mo32191i() {
        return this.f96706r;
    }

    @Override // com.kubi.sdk.BaseAdapter
    @Nullable
    /* JADX INFO: renamed from: j, reason: from getter */
    public RefreshCallBack getF95823v() {
        return this.f96710v;
    }

    @Override // com.kubi.sdk.BaseAdapter
    @NotNull
    /* JADX INFO: renamed from: k */
    public SparseArray<ItemCallBack<?>> mo32193k() {
        return this.f96707s;
    }

    @Override // com.kubi.sdk.BaseAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public void onViewAttachedToWindow(@NotNull InnerViewHolder<T> holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        super.onViewAttachedToWindow(holder);
        GridItemTouchHelper<T> gridItemTouchHelper = this.f96712x;
        if (gridItemTouchHelper != null) {
            gridItemTouchHelper.m30864z(holder);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onAttachedToRecyclerView(@NotNull RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        super.onAttachedToRecyclerView(recyclerView);
        this.f96711w = recyclerView;
        GridItemTouchHelper<T> gridItemTouchHelper = this.f96712x;
        if (gridItemTouchHelper != null) {
            gridItemTouchHelper.m30850H(recyclerView);
        }
    }

    @Override // com.kubi.sdk.BaseAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
    public void onDetachedFromRecyclerView(@NotNull RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        super.onDetachedFromRecyclerView(recyclerView);
        this.f96711w = null;
    }

    @Override // com.kubi.sdk.BaseAdapter
    /* JADX INFO: renamed from: q */
    public void mo32195q(@Nullable List<T> list) {
        this.f96705q = list;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public void onViewDetachedFromWindow(@NotNull InnerViewHolder<T> holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        super.onViewDetachedFromWindow(holder);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public void onViewRecycled(@NotNull InnerViewHolder<T> holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        super.onViewRecycled(holder);
        ViewHolderProxy<T> viewHolderProxyM57940b = holder.m57940b();
        CardViewHolderProxyV2 cardViewHolderProxyV2 = viewHolderProxyM57940b instanceof CardViewHolderProxyV2 ? (CardViewHolderProxyV2) viewHolderProxyM57940b : null;
        if (cardViewHolderProxyV2 != null) {
            cardViewHolderProxyV2.destroyCard();
        }
    }

    /* JADX INFO: renamed from: w */
    public final void m96371w(@NotNull GridItemTouchHelper<T> touchHelper) {
        Intrinsics.checkNotNullParameter(touchHelper, "touchHelper");
        this.f96712x = touchHelper;
    }

    @Override // com.kubi.sdk.BaseAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        List<T> data = getData();
        if (data != null) {
            return data.size();
        }
        return 0;
    }

    @Override // com.kubi.sdk.BaseAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int position) {
        T t11;
        List<T> data = getData();
        if (data != null && (t11 = data.get(position)) != null) {
            return t11.getF27926j();
        }
        return -1;
    }

    /* JADX INFO: renamed from: s */
    public final int m96367s() {
        List<T> data = getData();
        if (data != null) {
            return C15000n.m30812b(data);
        }
        return 0;
    }

    /* JADX INFO: renamed from: t */
    public final void m96368t(int i11, int i12) {
        List<T> data = getData();
        if (data == null) {
            return;
        }
        if (i11 < i12) {
            int i13 = i11;
            while (i13 < i12) {
                int i14 = i13 + 1;
                Collections.swap(data, i13, i14);
                i13 = i14;
            }
        } else {
            int i15 = i12 + 1;
            if (i15 <= i11) {
                int i16 = i11;
                while (true) {
                    Collections.swap(data, i16, i16 - 1);
                    if (i16 == i15) {
                        break;
                    } else {
                        i16--;
                    }
                }
            }
        }
        notifyItemMoved(i11, i12);
    }
}
