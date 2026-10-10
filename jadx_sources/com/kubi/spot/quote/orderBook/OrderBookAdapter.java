package com.kubi.spot.quote.orderBook;

import android.view.View;
import android.view.ViewGroup;
import androidx.core.content.ContextCompat;
import com.blankj.utilcode.util.C5275i0;
import com.kubi.data.entity.OrderBookData;
import com.kubi.data.entity.OrderBookIndex;
import com.kubi.resources.widget.OrderBookItemView;
import com.kubi.spot.R$color;
import com.kubi.spot.R$drawable;
import com.kubi.spot.R$layout;
import com.kubi.tradebase.orderbook.OrderBookDataHelper;
import com.kubi.utils.C27021e;
import com.kubi.utils.extensions.C27039d;
import gf.C37878b0;
import io.chad.library.adapter.base.BaseQuickAdapter;
import io.chad.library.adapter.base.BaseViewHolder;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import l30.C42049b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: OrderBookAdapter.kt */
/* JADX INFO: loaded from: classes47.dex */
@Metadata(m90083d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0006\n\u0002\b\t\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0010\u0013\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B7\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\u001c\b\u0002\u0010\u0007\u001a\u0016\u0012\u0004\u0012\u00020\t\u0018\u00010\bj\n\u0012\u0004\u0012\u00020\t\u0018\u0001`\n¢\u0006\u0004\b\u000b\u0010\fJ\u0006\u00105\u001a\u000206J\u000e\u00107\u001a\u0002062\u0006\u00108\u001a\u00020-J\u000e\u00109\u001a\u0002062\u0006\u0010\u001b\u001a\u00020\u0005J\u000e\u0010:\u001a\u0002062\u0006\u0010\u001c\u001a\u00020\u001dJ\u0010\u0010;\u001a\u0002042\u0006\u0010<\u001a\u00020\u001dH\u0002J\u0014\u0010=\u001a\u0002062\f\u0010>\u001a\b\u0012\u0004\u0012\u0002010/J\u0016\u0010?\u001a\u0002062\f\u0010>\u001a\b\u0012\u0004\u0012\u00020\u00020@H\u0002J\u0016\u0010A\u001a\u0002062\f\u0010B\u001a\b\u0012\u0004\u0012\u00020\u00020@H\u0002J\u0018\u0010C\u001a\u00020D2\u0006\u0010E\u001a\u00020\u00052\u0006\u0010F\u001a\u00020GH\u0014J\u0018\u0010H\u001a\u0002062\u0006\u0010I\u001a\u00020\u00032\u0006\u0010J\u001a\u00020\u0002H\u0014J\u0018\u0010K\u001a\u0002042\u0006\u0010L\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u0005H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\"\u0010\u0007\u001a\u0016\u0012\u0004\u0012\u00020\t\u0018\u00010\bj\n\u0012\u0004\u0012\u00020\t\u0018\u0001`\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0018\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0015\"\u0004\b\u001a\u0010\u0017R\u000e\u0010\u001b\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u001e\u001a\u00020\u001dX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001a\u0010#\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u0015\"\u0004\b%\u0010\u0017R\u001a\u0010&\u001a\u00020'X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u000e\u0010,\u001a\u00020-X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00020/X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u00100\u001a\b\u0012\u0004\u0012\u0002010/X\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u00102\u001a\u0012\u0012\u0004\u0012\u00020\u001d0\bj\b\u0012\u0004\u0012\u00020\u001d`\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u00103\u001a\u0012\u0012\u0004\u0012\u0002040\bj\b\u0012\u0004\u0012\u000204`\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006M"}, m90084d2 = {"Lcom/kubi/spot/quote/orderBook/OrderBookAdapter;", "Lio/chad/library/adapter/base/BaseQuickAdapter;", "Lcom/kubi/data/entity/OrderBookData;", "Lio/chad/library/adapter/base/BaseViewHolder;", "orderBookType", "", "direction", "delegationPriceList", "Ljava/util/ArrayList;", "Lcom/kubi/data/entity/OrderBookIndex;", "Lkotlin/collections/ArrayList;", "<init>", "(IILjava/util/ArrayList;)V", "selectListener", "Lcom/kubi/resources/widget/OrderBookItemView$OnTradingSelectListener;", "getSelectListener", "()Lcom/kubi/resources/widget/OrderBookItemView$OnTradingSelectListener;", "setSelectListener", "(Lcom/kubi/resources/widget/OrderBookItemView$OnTradingSelectListener;)V", "showTotalOrSingle", "getShowTotalOrSingle", "()I", "setShowTotalOrSingle", "(I)V", "amountPrecision", "getAmountPrecision", "setAmountPrecision", "pricePrecision", "max", "", "singleMax", "getSingleMax", "()D", "setSingleMax", "(D)V", "showMaxSize", "getShowMaxSize", "setShowMaxSize", "textSize", "", "getTextSize", "()F", "setTextSize", "(F)V", "isShowLimitSize", "", "srcOrderBookDataList", "", "srcDoubleList", "", "amountTemp", "priceTemp", "", "clearData", "", "setShowLimitSize", "limitShow", "setPricePrecision", "setMax", "getPriceFormatterStr", "d", "setOrderBookDoubleList", "list", "setShowDataList", "", "calculatorAmountSize", "orderBookEntities", "getItemView", "Landroid/view/View;", "layoutResId", "parent", "Landroid/view/ViewGroup;", "convert", "helper", "item", "getRealDisplayAmount", "amount", "SpotLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nOrderBookAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OrderBookAdapter.kt\ncom/kubi/spot/quote/orderBook/OrderBookAdapter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,299:1\n774#2:300\n865#2,2:301\n1869#2,2:303\n1878#2,3:305\n1#3:308\n*S KotlinDebug\n*F\n+ 1 OrderBookAdapter.kt\ncom/kubi/spot/quote/orderBook/OrderBookAdapter\n*L\n134#1:300\n134#1:301,2\n134#1:303,2\n239#1:305,3\n*E\n"})
public final class OrderBookAdapter extends BaseQuickAdapter<OrderBookData, BaseViewHolder> {

    /* JADX INFO: renamed from: i */
    public final int f51227i;

    /* JADX INFO: renamed from: j */
    public final int f51228j;

    /* JADX INFO: renamed from: k */
    @Nullable
    public final ArrayList<OrderBookIndex> f51229k;

    /* JADX INFO: renamed from: l */
    @Nullable
    public OrderBookItemView.InterfaceC22934a f51230l;

    /* JADX INFO: renamed from: m */
    public int f51231m;

    /* JADX INFO: renamed from: n */
    public int f51232n;

    /* JADX INFO: renamed from: o */
    public int f51233o;

    /* JADX INFO: renamed from: p */
    public double f51234p;

    /* JADX INFO: renamed from: q */
    public double f51235q;

    /* JADX INFO: renamed from: r */
    public int f51236r;

    /* JADX INFO: renamed from: s */
    public float f51237s;

    /* JADX INFO: renamed from: t */
    public boolean f51238t;

    /* JADX INFO: renamed from: u */
    @NotNull
    public List<OrderBookData> f51239u;

    /* JADX INFO: renamed from: v */
    @NotNull
    public List<double[]> f51240v;

    /* JADX INFO: renamed from: w */
    @NotNull
    public final ArrayList<Double> f51241w;

    /* JADX INFO: renamed from: x */
    @NotNull
    public final ArrayList<String> f51242x;

    public /* synthetic */ OrderBookAdapter(int i11, int i12, ArrayList arrayList, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(i11, (i13 & 2) != 0 ? 0 : i12, (i13 & 4) != 0 ? null : arrayList);
    }

    public OrderBookAdapter(int i11, int i12, @Nullable ArrayList<OrderBookIndex> arrayList) {
        super(R$layout.kucoin_item_orderbook);
        this.f51227i = i11;
        this.f51228j = i12;
        this.f51229k = arrayList;
        this.f51232n = 8;
        this.f51233o = 8;
        this.f51236r = 20;
        this.f51237s = -1.0f;
        this.f51238t = true;
        this.f51239u = new ArrayList();
        this.f51240v = new ArrayList();
        this.f51241w = new ArrayList<>();
        this.f51242x = new ArrayList<>();
        setHasStableIds(true);
        this.f51231m = C37878b0.f85252a.m85531l();
    }

    /* JADX INFO: renamed from: g */
    private final void m63004g(List<? extends OrderBookData> list) {
        if (this.f51227i != 0 || this.f51228j != 0) {
            int i11 = 0;
            for (Object obj : list) {
                int i12 = i11 + 1;
                if (i11 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                OrderBookData orderBookData = (OrderBookData) obj;
                if (i11 == 0) {
                    orderBookData.totalAmount = orderBookData.displayAmount;
                } else {
                    orderBookData.totalAmount = C27021e.m66522a(orderBookData.displayAmount, list.get(i11 - 1).totalAmount);
                }
                i11 = i12;
            }
            return;
        }
        int size = list.size();
        while (true) {
            size--;
            if (-1 >= size) {
                return;
            }
            OrderBookData orderBookData2 = list.get(size);
            if (size == list.size() - 1) {
                orderBookData2.totalAmount = orderBookData2.displayAmount;
            } else {
                orderBookData2.totalAmount = C27021e.m66522a(orderBookData2.displayAmount, list.get(size + 1).totalAmount);
            }
        }
    }

    /* JADX INFO: renamed from: j */
    private final String m63005j(double d11) {
        return OrderBookDataHelper.f51601a.m63278e(new BigDecimal(String.valueOf(d11)), this.f51233o, this.f51227i != 0);
    }

    /* JADX INFO: renamed from: r */
    private final void m63006r(List<? extends OrderBookData> list) {
        boolean z11;
        if (this.f51238t) {
            int size = list.size();
            int i11 = this.f51236r;
            if (size > i11) {
                try {
                    z11 = false;
                    list = this.f51227i == 0 ? list.subList(list.size() - this.f51236r, list.size()) : list.subList(0, i11);
                } catch (Exception unused) {
                    z11 = true;
                }
                if (z11) {
                    return;
                }
            }
        }
        if (this.f51228j == 1 && this.f51227i == 0) {
            Collections.reverse(list);
        }
        m63004g(list);
        this.f51235q = 0.0d;
        Iterator<? extends OrderBookData> it = list.iterator();
        while (it.hasNext()) {
            this.f51235q = Math.max(it.next().totalAmount, this.f51235q);
        }
        replaceData(list);
    }

    @Override // io.chad.library.adapter.base.BaseQuickAdapter
    @NotNull
    public View getItemView(int layoutResId, @NotNull ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View itemView = super.getItemView(layoutResId, parent);
        Intrinsics.checkNotNull(itemView, "null cannot be cast to non-null type com.kubi.resources.widget.OrderBookItemView");
        OrderBookItemView orderBookItemView = (OrderBookItemView) itemView;
        OrderBookItemView.InterfaceC22934a interfaceC22934a = this.f51230l;
        if (interfaceC22934a != null) {
            orderBookItemView.setOnSelectListener(interfaceC22934a);
            orderBookItemView.setBackgroundResource(R$drawable.selector_orderbook_item_press);
        }
        orderBookItemView.setOrderBookType(this.f51227i);
        orderBookItemView.setDirection(this.f51228j);
        int iM6236a = C5275i0.m6236a(6.5f);
        if (this.f51228j == 1) {
            if (this.f51227i == 0) {
                orderBookItemView.setPadding(iM6236a, 0, 0, 0);
                return orderBookItemView;
            }
            orderBookItemView.setPadding(0, 0, iM6236a, 0);
        }
        return orderBookItemView;
    }

    /* JADX INFO: renamed from: h */
    public final void m63007h() {
        this.f51239u.clear();
        this.f51240v.clear();
        this.f51241w.clear();
        this.f51242x.clear();
        notifyDataSetChanged();
    }

    @Override // io.chad.library.adapter.base.BaseQuickAdapter
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public void convert(@NotNull BaseViewHolder helper, @NotNull OrderBookData item) {
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(item, "item");
        View view = helper.itemView;
        Intrinsics.checkNotNull(view, "null cannot be cast to non-null type com.kubi.resources.widget.OrderBookItemView");
        OrderBookItemView orderBookItemView = (OrderBookItemView) view;
        orderBookItemView.setAmountColor(ContextCompat.getColor(this.mContext, R$color.c_text80));
        orderBookItemView.setProgress(((float) (item.totalAmount / this.f51234p)) * 100);
        ArrayList<OrderBookIndex> arrayList = this.f51229k;
        Object obj = null;
        if (arrayList != null) {
            for (Object obj2 : arrayList) {
                OrderBookIndex orderBookIndex = (OrderBookIndex) obj2;
                if (Intrinsics.areEqual(orderBookIndex.getDisplayPrice(), item.displayPrice)) {
                    if (orderBookIndex.isBuy() == (this.f51227i == 1)) {
                        obj = obj2;
                        break;
                    }
                }
            }
            obj = (OrderBookIndex) obj;
        }
        orderBookItemView.setNeedShowPosition(obj != null);
        float f11 = this.f51237s;
        if (f11 != -1.0f) {
            orderBookItemView.setTextSize(f11);
        }
        if (this.f51231m == 1) {
            orderBookItemView.setText(item.displayPrice, m63009k(item.displayAmount, this.f51233o));
        } else {
            orderBookItemView.setText(item.displayPrice, m63009k(item.totalAmount, this.f51233o));
        }
        orderBookItemView.setTextSize(OrderBookDataHelper.f51601a.m63279f(this.f51233o));
    }

    /* JADX INFO: renamed from: k */
    public final String m63009k(double d11, int i11) {
        return C42049b.f92327a.m92253b(i11).mo92251a(d11, this.f51232n);
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final int getF51231m() {
        return this.f51231m;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final double getF51235q() {
        return this.f51235q;
    }

    /* JADX INFO: renamed from: n */
    public final void m63012n(int i11) {
        this.f51232n = i11;
    }

    /* JADX INFO: renamed from: o */
    public final void m63013o(double d11) {
        this.f51234p = d11;
        notifyDataSetChanged();
    }

    /* JADX WARN: Code duplicated, block: B:13:0x008c  */
    /* JADX INFO: renamed from: p */
    public final void m63014p(@NotNull List<double[]> list) {
        int i11;
        Intrinsics.checkNotNullParameter(list, "list");
        this.f51240v = list;
        this.f51241w.clear();
        this.f51242x.clear();
        Iterator<double[]> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            double[] next = it.next();
            this.f51241w.add(Double.valueOf(next[1]));
            this.f51242x.add(m63005j(next[0]));
        }
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        for (i11 = 0; i11 < size; i11++) {
            if (i11 != list.size() - 1) {
                int i12 = i11 + 1;
                if (Intrinsics.areEqual(this.f51242x.get(i11), this.f51242x.get(i12))) {
                    ArrayList<Double> arrayList2 = this.f51241w;
                    Double d11 = arrayList2.get(i12);
                    Intrinsics.checkNotNullExpressionValue(d11, "get(...)");
                    double dDoubleValue = d11.doubleValue();
                    Double d12 = this.f51241w.get(i11);
                    Intrinsics.checkNotNullExpressionValue(d12, "get(...)");
                    arrayList2.set(i12, Double.valueOf(C27021e.m66522a(dDoubleValue, d12.doubleValue())));
                } else {
                    OrderBookData orderBookData = new OrderBookData();
                    orderBookData.displayPrice = this.f51242x.get(i11);
                    Double d13 = this.f51241w.get(i11);
                    Intrinsics.checkNotNullExpressionValue(d13, "get(...)");
                    orderBookData.displayAmount = d13.doubleValue();
                    arrayList.add(orderBookData);
                }
            } else {
                OrderBookData orderBookData2 = new OrderBookData();
                orderBookData2.displayPrice = this.f51242x.get(i11);
                Double d14 = this.f51241w.get(i11);
                Intrinsics.checkNotNullExpressionValue(d14, "get(...)");
                orderBookData2.displayAmount = d14.doubleValue();
                arrayList.add(orderBookData2);
            }
        }
        this.f51239u = arrayList;
        m63006r(arrayList);
    }

    /* JADX INFO: renamed from: q */
    public final void m63015q(int i11) {
        this.f51233o = i11;
        ArrayList<OrderBookIndex> arrayList = this.f51229k;
        if (arrayList != null) {
            ArrayList<OrderBookIndex> arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                if (((OrderBookIndex) obj).isBuy() == (this.f51227i == 1)) {
                    arrayList2.add(obj);
                }
            }
            for (OrderBookIndex orderBookIndex : arrayList2) {
                orderBookIndex.setDisplayPrice(m63005j(C27039d.m66646f(orderBookIndex.getPrice())));
            }
        }
        m63014p(this.f51240v);
    }

    /* JADX INFO: renamed from: s */
    public final void m63016s(boolean z11) {
        this.f51238t = z11;
        m63006r(this.f51239u);
    }

    public final void setSelectListener(@Nullable OrderBookItemView.InterfaceC22934a interfaceC22934a) {
        this.f51230l = interfaceC22934a;
    }

    /* JADX INFO: renamed from: t */
    public final void m63017t(int i11) {
        this.f51236r = i11;
    }

    /* JADX INFO: renamed from: u */
    public final void m63018u(int i11) {
        this.f51231m = i11;
    }

    /* JADX INFO: renamed from: v */
    public final void m63019v(float f11) {
        this.f51237s = f11;
    }
}
