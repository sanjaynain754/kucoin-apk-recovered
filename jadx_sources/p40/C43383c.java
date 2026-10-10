package p40;

import android.util.SparseArray;
import com.facebook.react.uimanager.ViewProps;
import com.kubi.sdk.BaseAdapter;
import com.kubi.sdk.DiffCallBack;
import com.kubi.sdk.ItemCallBack;
import com.kubi.sdk.RefreshCallBack;
import com.kubi.tradingbotkit.model.AllCouponsItemModel;
import com.kubi.utils.extensions.C27039d;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: p40.c */
/* JADX INFO: compiled from: GridCouponsAdapter.kt */
/* JADX INFO: loaded from: classes51.dex */
@Metadata(m90083d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\"Bm\u0012\u0010\b\u0002\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004\u0012\u0010\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00070\u0006\u0012\u0010\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t0\u0006\u0012\u0010\u0010\n\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t0\u0006\u0012\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020 H\u0016R\"\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001e\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00070\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u001e\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t0\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u001e\u0010\n\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t0\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0016R\u001c\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u001c\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001e¨\u0006#"}, m90084d2 = {"Lcom/kubi/tradingbotkit/business/coupons/adapter/GridCouponsAdapter;", "Lcom/kubi/sdk/BaseAdapter;", "Lcom/kubi/tradingbotkit/model/AllCouponsItemModel;", "data", "", "proxys", "Landroid/util/SparseArray;", "Ljava/lang/Class;", "shortCalls", "Lcom/kubi/sdk/ItemCallBack;", "longCalls", "diffCb", "Lcom/kubi/sdk/DiffCallBack;", "refreshCall", "Lcom/kubi/sdk/RefreshCallBack;", "<init>", "(Ljava/util/List;Landroid/util/SparseArray;Landroid/util/SparseArray;Landroid/util/SparseArray;Lcom/kubi/sdk/DiffCallBack;Lcom/kubi/sdk/RefreshCallBack;)V", "getData", "()Ljava/util/List;", "setData", "(Ljava/util/List;)V", "getProxys", "()Landroid/util/SparseArray;", "getShortCalls", "getLongCalls", "getDiffCb", "()Lcom/kubi/sdk/DiffCallBack;", "getRefreshCall", "()Lcom/kubi/sdk/RefreshCallBack;", "setRefreshCall", "(Lcom/kubi/sdk/RefreshCallBack;)V", "getItemViewType", "", ViewProps.POSITION, "Builder", "TradingBotKitLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C43383c extends BaseAdapter<AllCouponsItemModel> {

    /* JADX INFO: renamed from: q */
    @Nullable
    public volatile List<AllCouponsItemModel> f95818q;

    /* JADX INFO: renamed from: r */
    @NotNull
    public final SparseArray<Class<?>> f95819r;

    /* JADX INFO: renamed from: s */
    @NotNull
    public final SparseArray<ItemCallBack<?>> f95820s;

    /* JADX INFO: renamed from: t */
    @NotNull
    public final SparseArray<ItemCallBack<?>> f95821t;

    /* JADX INFO: renamed from: u */
    @Nullable
    public final DiffCallBack<AllCouponsItemModel> f95822u;

    /* JADX INFO: renamed from: v */
    @Nullable
    public RefreshCallBack f95823v;

    /* JADX INFO: renamed from: p40.c$a */
    /* JADX INFO: compiled from: GridCouponsAdapter.kt */
    @Metadata(m90083d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010!\u001a\u00020\u00002\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\fJ:\u0010\"\u001a\u00020\u00002\u0006\u0010#\u001a\u00020$2\n\u0010%\u001a\u0006\u0012\u0002\b\u00030\u00132\u000e\b\u0002\u0010&\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00172\u000e\b\u0002\u0010'\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0017J\b\u0010(\u001a\u00020)H\u0016R\"\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\"\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00130\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u001b\u0010\u0016\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00170\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0015R\u001b\u0010\u0019\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00170\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0015R\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 ¨\u0006*"}, m90084d2 = {"Lcom/kubi/tradingbotkit/business/coupons/adapter/GridCouponsAdapter$Builder;", "", "<init>", "()V", "data", "", "Lcom/kubi/tradingbotkit/model/AllCouponsItemModel;", "getData", "()Ljava/util/List;", "setData", "(Ljava/util/List;)V", "diffCb", "Lcom/kubi/sdk/DiffCallBack;", "getDiffCb", "()Lcom/kubi/sdk/DiffCallBack;", "setDiffCb", "(Lcom/kubi/sdk/DiffCallBack;)V", "proxys", "Landroid/util/SparseArray;", "Ljava/lang/Class;", "getProxys", "()Landroid/util/SparseArray;", "shortCalls", "Lcom/kubi/sdk/ItemCallBack;", "getShortCalls", "longCalls", "getLongCalls", "refreshCall", "Lcom/kubi/sdk/RefreshCallBack;", "getRefreshCall", "()Lcom/kubi/sdk/RefreshCallBack;", "setRefreshCall", "(Lcom/kubi/sdk/RefreshCallBack;)V", "setDiffCallBack", "register", "type", "", "proxy", "shortCall", "longCall", "build", "Lcom/kubi/tradingbotkit/business/coupons/adapter/GridCouponsAdapter;", "TradingBotKitLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nGridCouponsAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GridCouponsAdapter.kt\ncom/kubi/tradingbotkit/business/coupons/adapter/GridCouponsAdapter$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,65:1\n1#2:66\n*E\n"})
    public static class a {

        /* JADX INFO: renamed from: a */
        @Nullable
        public List<AllCouponsItemModel> f95824a;

        /* JADX INFO: renamed from: b */
        @Nullable
        public DiffCallBack<AllCouponsItemModel> f95825b;

        /* JADX INFO: renamed from: c */
        @NotNull
        public final SparseArray<Class<?>> f95826c = new SparseArray<>();

        /* JADX INFO: renamed from: d */
        @NotNull
        public final SparseArray<ItemCallBack<?>> f95827d = new SparseArray<>();

        /* JADX INFO: renamed from: e */
        @NotNull
        public final SparseArray<ItemCallBack<?>> f95828e = new SparseArray<>();

        /* JADX INFO: renamed from: f */
        @Nullable
        public RefreshCallBack f95829f;

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: c */
        public static /* synthetic */ a m95555c(a aVar, int i11, Class cls, ItemCallBack itemCallBack, ItemCallBack itemCallBack2, int i12, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: register");
            }
            if ((i12 & 4) != 0) {
                itemCallBack = null;
            }
            if ((i12 & 8) != 0) {
                itemCallBack2 = null;
            }
            return aVar.m95557b(i11, cls, itemCallBack, itemCallBack2);
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public C43383c m95556a() {
            return new C43383c(this.f95824a, this.f95826c, this.f95827d, this.f95828e, this.f95825b, this.f95829f);
        }

        @NotNull
        /* JADX INFO: renamed from: b */
        public final a m95557b(int i11, @NotNull Class<?> proxy, @Nullable ItemCallBack<?> itemCallBack, @Nullable ItemCallBack<?> itemCallBack2) {
            Intrinsics.checkNotNullParameter(proxy, "proxy");
            this.f95826c.put(i11, proxy);
            if (itemCallBack != null) {
                this.f95827d.put(i11, itemCallBack);
            }
            if (itemCallBack2 != null) {
                this.f95828e.put(i11, itemCallBack2);
            }
            return this;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C43383c(@Nullable List<AllCouponsItemModel> list, @NotNull SparseArray<Class<?>> proxys, @NotNull SparseArray<ItemCallBack<?>> shortCalls, @NotNull SparseArray<ItemCallBack<?>> longCalls, @Nullable DiffCallBack<AllCouponsItemModel> diffCallBack, @Nullable RefreshCallBack refreshCallBack) {
        super(list, proxys, shortCalls, longCalls, diffCallBack, refreshCallBack);
        Intrinsics.checkNotNullParameter(proxys, "proxys");
        Intrinsics.checkNotNullParameter(shortCalls, "shortCalls");
        Intrinsics.checkNotNullParameter(longCalls, "longCalls");
        this.f95818q = list;
        this.f95819r = proxys;
        this.f95820s = shortCalls;
        this.f95821t = longCalls;
        this.f95822u = diffCallBack;
        this.f95823v = refreshCallBack;
    }

    @Override // com.kubi.sdk.BaseAdapter
    @Nullable
    /* JADX INFO: renamed from: g */
    public DiffCallBack<AllCouponsItemModel> mo32189g() {
        return this.f95822u;
    }

    @Override // com.kubi.sdk.BaseAdapter
    @Nullable
    public List<AllCouponsItemModel> getData() {
        return this.f95818q;
    }

    @Override // com.kubi.sdk.BaseAdapter
    @NotNull
    /* JADX INFO: renamed from: h */
    public SparseArray<ItemCallBack<?>> mo32190h() {
        return this.f95821t;
    }

    @Override // com.kubi.sdk.BaseAdapter
    @NotNull
    /* JADX INFO: renamed from: i */
    public SparseArray<Class<?>> mo32191i() {
        return this.f95819r;
    }

    @Override // com.kubi.sdk.BaseAdapter
    @Nullable
    /* JADX INFO: renamed from: j, reason: from getter */
    public RefreshCallBack getF95823v() {
        return this.f95823v;
    }

    @Override // com.kubi.sdk.BaseAdapter
    @NotNull
    /* JADX INFO: renamed from: k */
    public SparseArray<ItemCallBack<?>> mo32193k() {
        return this.f95820s;
    }

    @Override // com.kubi.sdk.BaseAdapter
    /* JADX INFO: renamed from: q */
    public void mo32195q(@Nullable List<AllCouponsItemModel> list) {
        this.f95818q = list;
    }

    @Override // com.kubi.sdk.BaseAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int position) {
        Integer type;
        AllCouponsItemModel allCouponsItemModel;
        List<AllCouponsItemModel> data = getData();
        if (data != null && (allCouponsItemModel = data.get(position)) != null) {
            type = allCouponsItemModel.getType();
        } else {
            type = null;
        }
        return C27039d.m66651k(type, 103);
    }
}
