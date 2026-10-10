package p70;

import af.C0296a;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.react.uimanager.ViewProps;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.p110rn.kline.KlineFlutterMiniConstants;
import com.kubi.resources.C22912t;
import com.kubi.resources.widget.BaseTextView;
import com.tencent.bugly.proguard.C33954u6;
import j30.SegmentOrder;
import java.math.BigDecimal;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p429lf.C42180b;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.Intrinsics;
import q70.C43658e;

/* JADX INFO: renamed from: p70.f */
/* JADX INFO: compiled from: SegmentOrderDetailLayout.kt */
/* JADX INFO: loaded from: classes54.dex */
@Metadata(m90083d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001eB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J@\u0010\u0011\u001a\u00020\u00122\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u0010J\u0018\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\tH\u0016J\u0018\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\tH\u0016J\u0010\u0010\u001b\u001a\u00020\u00102\u0006\u0010\u001c\u001a\u00020\u000eH\u0002J\b\u0010\u001d\u001a\u00020\tH\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001f"}, m90084d2 = {"Lcom/kubi/utaspotlib/biz/order/infodetail/SegmentOrderListAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/kubi/utaspotlib/biz/order/infodetail/SegmentOrderListAdapter$VH;", "<init>", "()V", FirebaseAnalytics.Param.ITEMS, "", "Lcom/kubi/tradebase/api/segment/SegmentOrder;", "pricePrecision", "", "qtyPrecision", "orderTypeLabel", "", KlineFlutterMiniConstants.PROP_LATEST_PRICE, "Ljava/math/BigDecimal;", "isBuy", "", "submit", "", "orders", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "onBindViewHolder", C33954u6.f72238i, ViewProps.POSITION, "showImmediateFill", FirebaseAnalytics.Param.PRICE, "getItemCount", "VH", "UtaSpotLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C43411f extends RecyclerView.Adapter<a> {

    /* JADX INFO: renamed from: j */
    public int f95847j;

    /* JADX INFO: renamed from: k */
    public int f95848k;

    /* JADX INFO: renamed from: m */
    @NotNull
    public BigDecimal f95850m;

    /* JADX INFO: renamed from: n */
    public boolean f95851n;

    /* JADX INFO: renamed from: i */
    @NotNull
    public List<SegmentOrder> f95846i = CollectionsKt.emptyList();

    /* JADX INFO: renamed from: l */
    @NotNull
    public String f95849l = "";

    /* JADX INFO: renamed from: p70.f$a */
    /* JADX INFO: compiled from: SegmentOrderDetailLayout.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m90084d2 = {"Lcom/kubi/utaspotlib/biz/order/infodetail/SegmentOrderListAdapter$VH;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "b", "Lcom/kubi/utaspotlib/databinding/UtaItemOrderSegmentConfirmOrderBinding;", "<init>", "(Lcom/kubi/utaspotlib/databinding/UtaItemOrderSegmentConfirmOrderBinding;)V", "getB", "()Lcom/kubi/utaspotlib/databinding/UtaItemOrderSegmentConfirmOrderBinding;", "UtaSpotLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class a extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: g */
        @NotNull
        public final C43658e f95852g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@NotNull C43658e b11) {
            super(b11.getRoot());
            Intrinsics.checkNotNullParameter(b11, "b");
            this.f95852g = b11;
        }

        @NotNull
        /* JADX INFO: renamed from: b, reason: from getter */
        public final C43658e getF95852g() {
            return this.f95852g;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull a holder, int i11) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        SegmentOrder segmentOrder = this.f95846i.get(i11);
        holder.getF95852g().f96370c.setText(this.f95849l);
        BaseTextView tvPrice = holder.getF95852g().f96371d;
        Intrinsics.checkNotNullExpressionValue(tvPrice, "tvPrice");
        C22912t.m54420r(tvPrice, C42180b.m92640e(segmentOrder.getPrice(), null, this.f95847j, false, false, false, 0, null, 125, null), 14.0f, 8.0f);
        BaseTextView tvQty = holder.getF95852g().f96372e;
        Intrinsics.checkNotNullExpressionValue(tvQty, "tvQty");
        C22912t.m54420r(tvQty, C42180b.m92640e(segmentOrder.getQty(), null, this.f95848k, false, false, false, 0, null, 125, null), 14.0f, 8.0f);
        BaseTextView tvImmediateFill = holder.getF95852g().f96369b;
        Intrinsics.checkNotNullExpressionValue(tvImmediateFill, "tvImmediateFill");
        C0296a.m1042d(tvImmediateFill, m95601i(segmentOrder.getPrice()));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f95846i.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public a onCreateViewHolder(@NotNull ViewGroup parent, int i11) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        C43658e c43658eM96077c = C43658e.m96077c(LayoutInflater.from(parent.getContext()), parent, false);
        Intrinsics.checkNotNullExpressionValue(c43658eM96077c, "inflate(...)");
        return new a(c43658eM96077c);
    }

    /* JADX INFO: renamed from: i */
    public final boolean m95601i(BigDecimal bigDecimal) {
        if (this.f95850m.compareTo(BigDecimal.ZERO) <= 0) {
            return false;
        }
        if (this.f95851n) {
            return bigDecimal.compareTo(this.f95850m) >= 0;
        }
        return bigDecimal.compareTo(this.f95850m) <= 0;
    }

    /* JADX INFO: renamed from: j */
    public final void m95602j(@NotNull List<SegmentOrder> orders, int i11, int i12, @NotNull String orderTypeLabel, @NotNull BigDecimal latestPrice, boolean z11) {
        Intrinsics.checkNotNullParameter(orders, "orders");
        Intrinsics.checkNotNullParameter(orderTypeLabel, "orderTypeLabel");
        Intrinsics.checkNotNullParameter(latestPrice, "latestPrice");
        this.f95846i = orders;
        this.f95847j = i11;
        this.f95848k = i12;
        this.f95849l = orderTypeLabel;
        this.f95850m = latestPrice;
        this.f95851n = z11;
        notifyDataSetChanged();
    }

    public C43411f() {
        BigDecimal ZERO = BigDecimal.ZERO;
        Intrinsics.checkNotNullExpressionValue(ZERO, "ZERO");
        this.f95850m = ZERO;
        this.f95851n = true;
    }
}
