package com.kubi.core.spot.quote.orderBook;

import android.view.View;
import android.view.ViewGroup;
import androidx.core.content.ContextCompat;
import com.blankj.utilcode.util.C5275i0;
import com.kubi.data.entity.OrderBookData;
import com.kubi.data.entity.OrderBookIndex;
import com.kubi.resources.widget.OrderBookItemView;
import com.kubi.tradebase.orderbook.OrderBookDataHelper;
import com.kubi.tradecorebiz.R$color;
import com.kubi.tradecorebiz.R$drawable;
import com.kubi.tradecorebiz.R$layout;
import com.kubi.utils.C27021e;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27041f;
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
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m90083d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0006\n\u0002\b\t\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0010\u0013\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B7\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\u001c\b\u0002\u0010\u0007\u001a\u0016\u0012\u0004\u0012\u00020\t\u0018\u00010\bj\n\u0012\u0004\u0012\u00020\t\u0018\u0001`\n¢\u0006\u0004\b\u000b\u0010\fJ\u0006\u00105\u001a\u000206J\u000e\u00107\u001a\u0002062\u0006\u00108\u001a\u00020-J\u000e\u00109\u001a\u0002062\u0006\u0010\u001b\u001a\u00020\u0005J\u000e\u0010:\u001a\u0002062\u0006\u0010\u001c\u001a\u00020\u001dJ\u0010\u0010;\u001a\u0002042\u0006\u0010<\u001a\u00020\u001dH\u0002J\u0014\u0010=\u001a\u0002062\f\u0010>\u001a\b\u0012\u0004\u0012\u0002010/J\u0016\u0010?\u001a\u0002062\f\u0010>\u001a\b\u0012\u0004\u0012\u00020\u00020@H\u0002J.\u0010A\u001a\b\u0012\u0004\u0012\u00020\u00020@*\b\u0012\u0004\u0012\u00020\u00020@2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010B\u001a\u00020\u0005J\u0016\u0010C\u001a\u0002062\f\u0010D\u001a\b\u0012\u0004\u0012\u00020\u00020@H\u0002J\u0018\u0010E\u001a\u00020F2\u0006\u0010G\u001a\u00020\u00052\u0006\u0010H\u001a\u00020IH\u0014J\u0018\u0010J\u001a\u0002062\u0006\u0010K\u001a\u00020\u00032\u0006\u0010L\u001a\u00020\u0002H\u0014J\"\u0010M\u001a\u0002042\b\u0010N\u001a\u0004\u0018\u0001042\u0006\u0010O\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u0005H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\"\u0010\u0007\u001a\u0016\u0012\u0004\u0012\u00020\t\u0018\u00010\bj\n\u0012\u0004\u0012\u00020\t\u0018\u0001`\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0018\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0015\"\u0004\b\u001a\u0010\u0017R\u000e\u0010\u001b\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u001e\u001a\u00020\u001dX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001a\u0010#\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u0015\"\u0004\b%\u0010\u0017R\u001a\u0010&\u001a\u00020'X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u000e\u0010,\u001a\u00020-X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00020/X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u00100\u001a\b\u0012\u0004\u0012\u0002010/X\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u00102\u001a\u0012\u0012\u0004\u0012\u00020\u001d0\bj\b\u0012\u0004\u0012\u00020\u001d`\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u00103\u001a\u0012\u0012\u0004\u0012\u0002040\bj\b\u0012\u0004\u0012\u000204`\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006P"}, m90084d2 = {"Lcom/kubi/core/spot/quote/orderBook/OrderBookAdapter;", "Lio/chad/library/adapter/base/BaseQuickAdapter;", "Lcom/kubi/data/entity/OrderBookData;", "Lio/chad/library/adapter/base/BaseViewHolder;", "orderBookType", "", "direction", "delegationPriceList", "Ljava/util/ArrayList;", "Lcom/kubi/data/entity/OrderBookIndex;", "Lkotlin/collections/ArrayList;", "<init>", "(IILjava/util/ArrayList;)V", "selectListener", "Lcom/kubi/resources/widget/OrderBookItemView$OnTradingSelectListener;", "getSelectListener", "()Lcom/kubi/resources/widget/OrderBookItemView$OnTradingSelectListener;", "setSelectListener", "(Lcom/kubi/resources/widget/OrderBookItemView$OnTradingSelectListener;)V", "showTotalOrSingle", "getShowTotalOrSingle", "()I", "setShowTotalOrSingle", "(I)V", "amountPrecision", "getAmountPrecision", "setAmountPrecision", "pricePrecision", "max", "", "singleMax", "getSingleMax", "()D", "setSingleMax", "(D)V", "showMaxSize", "getShowMaxSize", "setShowMaxSize", "textSize", "", "getTextSize", "()F", "setTextSize", "(F)V", "isShowLimitSize", "", "srcOrderBookDataList", "", "srcDoubleList", "", "amountTemp", "priceTemp", "", "clearData", "", "setShowLimitSize", "limitShow", "setPricePrecision", "setMax", "getPriceFormatterStr", "d", "setOrderBookDoubleList", "list", "setShowDataList", "", "padToDisplaySize", "targetSize", "calculatorAmountSize", "orderBookEntities", "getItemView", "Landroid/view/View;", "layoutResId", "parent", "Landroid/view/ViewGroup;", "convert", "helper", "item", "getRealDisplayAmount", "displayPrice", "amount", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nOrderBookAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OrderBookAdapter.kt\ncom/kubi/core/spot/quote/orderBook/OrderBookAdapter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,336:1\n774#2:337\n865#2,2:338\n1869#2,2:340\n1878#2,3:342\n*S KotlinDebug\n*F\n+ 1 OrderBookAdapter.kt\ncom/kubi/core/spot/quote/orderBook/OrderBookAdapter\n*L\n135#1:337\n135#1:338,2\n135#1:340,2\n266#1:342,3\n*E\n"})
public final class OrderBookAdapter extends BaseQuickAdapter<OrderBookData, BaseViewHolder> {

    /* JADX INFO: renamed from: i */
    public final int f21265i;

    /* JADX INFO: renamed from: j */
    public final int f21266j;

    /* JADX INFO: renamed from: k */
    @Nullable
    public final ArrayList<OrderBookIndex> f21267k;

    /* JADX INFO: renamed from: l */
    @Nullable
    public OrderBookItemView.InterfaceC22934a f21268l;

    /* JADX INFO: renamed from: m */
    public int f21269m;

    /* JADX INFO: renamed from: n */
    public int f21270n;

    /* JADX INFO: renamed from: o */
    public int f21271o;

    /* JADX INFO: renamed from: p */
    public double f21272p;

    /* JADX INFO: renamed from: q */
    public double f21273q;

    /* JADX INFO: renamed from: r */
    public int f21274r;

    /* JADX INFO: renamed from: s */
    public float f21275s;

    /* JADX INFO: renamed from: t */
    public boolean f21276t;

    /* JADX INFO: renamed from: u */
    @NotNull
    public List<OrderBookData> f21277u;

    /* JADX INFO: renamed from: v */
    @NotNull
    public List<double[]> f21278v;

    /* JADX INFO: renamed from: w */
    @NotNull
    public final ArrayList<Double> f21279w;

    /* JADX INFO: renamed from: x */
    @NotNull
    public final ArrayList<String> f21280x;

    public /* synthetic */ OrderBookAdapter(int i11, int i12, ArrayList arrayList, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(i11, (i13 & 2) != 0 ? 0 : i12, (i13 & 4) != 0 ? null : arrayList);
    }

    public OrderBookAdapter(int i11, int i12, @Nullable ArrayList<OrderBookIndex> arrayList) {
        super(R$layout.trade_core_item_orderbook);
        this.f21265i = i11;
        this.f21266j = i12;
        this.f21267k = arrayList;
        this.f21270n = 8;
        this.f21271o = 8;
        this.f21274r = 20;
        this.f21275s = -1.0f;
        this.f21276t = true;
        this.f21277u = new ArrayList();
        this.f21278v = new ArrayList();
        this.f21279w = new ArrayList<>();
        this.f21280x = new ArrayList<>();
        setHasStableIds(true);
        this.f21269m = C37878b0.f85252a.m85531l();
    }

    /* JADX INFO: renamed from: g */
    public final void m23364g(List<? extends OrderBookData> list) {
        if (this.f21265i != 0 || this.f21266j != 0) {
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

    @Override // io.chad.library.adapter.base.BaseQuickAdapter
    @NotNull
    public View getItemView(int layoutResId, @NotNull ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View itemView = super.getItemView(layoutResId, parent);
        Intrinsics.checkNotNull(itemView, "null cannot be cast to non-null type com.kubi.resources.widget.OrderBookItemView");
        OrderBookItemView orderBookItemView = (OrderBookItemView) itemView;
        OrderBookItemView.InterfaceC22934a interfaceC22934a = this.f21268l;
        if (interfaceC22934a != null) {
            orderBookItemView.setOnSelectListener(interfaceC22934a);
            orderBookItemView.setBackgroundResource(R$drawable.selector_orderbook_item_press);
        }
        orderBookItemView.setOrderBookType(this.f21265i);
        orderBookItemView.setDirection(this.f21266j);
        int iM6236a = C5275i0.m6236a(6.5f);
        if (this.f21266j == 1) {
            if (this.f21265i == 0) {
                orderBookItemView.setPadding(iM6236a, 0, 0, 0);
                return orderBookItemView;
            }
            orderBookItemView.setPadding(0, 0, iM6236a, 0);
        }
        return orderBookItemView;
    }

    /* JADX INFO: renamed from: h */
    public final void m23365h() {
        this.f21277u.clear();
        this.f21278v.clear();
        this.f21279w.clear();
        this.f21280x.clear();
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
        orderBookItemView.setProgress(((float) (item.totalAmount / this.f21272p)) * 100);
        ArrayList<OrderBookIndex> arrayList = this.f21267k;
        Object obj = null;
        if (arrayList != null) {
            for (Object obj2 : arrayList) {
                OrderBookIndex orderBookIndex = (OrderBookIndex) obj2;
                String displayPrice = orderBookIndex.getDisplayPrice();
                if (displayPrice != null && displayPrice.length() != 0 && Intrinsics.areEqual(orderBookIndex.getDisplayPrice(), item.displayPrice)) {
                    if (orderBookIndex.isBuy() == (this.f21265i == 1)) {
                        obj = obj2;
                        break;
                    }
                }
            }
            obj = (OrderBookIndex) obj;
        }
        orderBookItemView.setNeedShowPosition(obj != null);
        float f11 = this.f21275s;
        if (f11 != -1.0f) {
            orderBookItemView.setTextSize(f11);
        }
        if (this.f21269m == 1) {
            orderBookItemView.setText(C27041f.m66669i(item.displayPrice, "--"), m23368k(item.displayPrice, item.displayAmount, this.f21271o));
        } else {
            orderBookItemView.setText(C27041f.m66669i(item.displayPrice, "--"), m23368k(item.displayPrice, item.totalAmount, this.f21271o));
        }
        orderBookItemView.setTextSize(OrderBookDataHelper.f51601a.m63279f(this.f21271o));
    }

    /* JADX INFO: renamed from: j */
    public final String m23367j(double d11) {
        return OrderBookDataHelper.f51601a.m63278e(new BigDecimal(String.valueOf(d11)), this.f21271o, this.f21265i != 0);
    }

    /* JADX INFO: renamed from: k */
    public final String m23368k(String str, double d11, int i11) {
        return (str == null || str.length() == 0) ? "--" : C42049b.f92327a.m92253b(i11).mo92251a(d11, this.f21270n);
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final int getF21269m() {
        return this.f21269m;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final double getF21273q() {
        return this.f21273q;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    /* JADX INFO: renamed from: n */
    public final List<OrderBookData> m23371n(@NotNull List<? extends OrderBookData> list, int i11, int i12, int i13) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        if (list.size() >= i13) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(list);
        if (i11 == 0 && i12 == 0) {
            CollectionsKt.reverse(arrayList);
        }
        while (arrayList.size() < i13) {
            arrayList.add(new OrderBookData());
        }
        if (i11 == 0 && i12 == 0) {
            CollectionsKt.reverse(arrayList);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: o */
    public final void m23372o(int i11) {
        this.f21270n = i11;
    }

    /* JADX INFO: renamed from: p */
    public final void m23373p(double d11) {
        this.f21272p = d11;
        notifyDataSetChanged();
    }

    /* JADX WARN: Code duplicated, block: B:13:0x008c  */
    /* JADX INFO: renamed from: q */
    public final void m23374q(@NotNull List<double[]> list) {
        int i11;
        Intrinsics.checkNotNullParameter(list, "list");
        this.f21278v = list;
        this.f21279w.clear();
        this.f21280x.clear();
        Iterator<double[]> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            double[] next = it.next();
            this.f21279w.add(Double.valueOf(next[1]));
            this.f21280x.add(m23367j(next[0]));
        }
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        for (i11 = 0; i11 < size; i11++) {
            if (i11 != list.size() - 1) {
                int i12 = i11 + 1;
                if (Intrinsics.areEqual(this.f21280x.get(i11), this.f21280x.get(i12))) {
                    ArrayList<Double> arrayList2 = this.f21279w;
                    Double d11 = arrayList2.get(i12);
                    Intrinsics.checkNotNullExpressionValue(d11, "get(...)");
                    double dDoubleValue = d11.doubleValue();
                    Double d12 = this.f21279w.get(i11);
                    Intrinsics.checkNotNullExpressionValue(d12, "get(...)");
                    arrayList2.set(i12, Double.valueOf(C27021e.m66522a(dDoubleValue, d12.doubleValue())));
                } else {
                    OrderBookData orderBookData = new OrderBookData();
                    orderBookData.displayPrice = this.f21280x.get(i11);
                    Double d13 = this.f21279w.get(i11);
                    Intrinsics.checkNotNullExpressionValue(d13, "get(...)");
                    orderBookData.displayAmount = d13.doubleValue();
                    arrayList.add(orderBookData);
                }
            } else {
                OrderBookData orderBookData2 = new OrderBookData();
                orderBookData2.displayPrice = this.f21280x.get(i11);
                Double d14 = this.f21279w.get(i11);
                Intrinsics.checkNotNullExpressionValue(d14, "get(...)");
                orderBookData2.displayAmount = d14.doubleValue();
                arrayList.add(orderBookData2);
            }
        }
        this.f21277u = arrayList;
        m23376s(arrayList);
    }

    /* JADX INFO: renamed from: r */
    public final void m23375r(int i11) {
        this.f21271o = i11;
        ArrayList<OrderBookIndex> arrayList = this.f21267k;
        if (arrayList != null) {
            ArrayList<OrderBookIndex> arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                if (((OrderBookIndex) obj).isBuy() == (this.f21265i == 1)) {
                    arrayList2.add(obj);
                }
            }
            for (OrderBookIndex orderBookIndex : arrayList2) {
                orderBookIndex.setDisplayPrice(m23367j(C27039d.m66646f(orderBookIndex.getPrice())));
            }
        }
        m23374q(this.f21278v);
    }

    /* JADX INFO: renamed from: s */
    public final void m23376s(List<? extends OrderBookData> list) {
        boolean z11;
        if (this.f21276t) {
            int size = list.size();
            int i11 = this.f21274r;
            if (size > i11) {
                try {
                    z11 = false;
                    list = this.f21265i == 0 ? list.subList(list.size() - this.f21274r, list.size()) : list.subList(0, i11);
                } catch (Exception unused) {
                    z11 = true;
                }
                if (z11) {
                    return;
                }
            }
        }
        if (this.f21266j == 1 && this.f21265i == 0) {
            Collections.reverse(list);
        }
        m23364g(list);
        this.f21273q = 0.0d;
        Iterator<? extends OrderBookData> it = list.iterator();
        while (it.hasNext()) {
            this.f21273q = Math.max(it.next().totalAmount, this.f21273q);
        }
        replaceData(m23371n(list, this.f21266j, this.f21265i, this.f21274r));
    }

    public final void setSelectListener(@Nullable OrderBookItemView.InterfaceC22934a interfaceC22934a) {
        this.f21268l = interfaceC22934a;
    }

    /* JADX INFO: renamed from: t */
    public final void m23377t(boolean z11) {
        this.f21276t = z11;
        m23376s(this.f21277u);
    }

    /* JADX INFO: renamed from: u */
    public final void m23378u(int i11) {
        this.f21274r = i11;
    }

    /* JADX INFO: renamed from: v */
    public final void m23379v(int i11) {
        this.f21269m = i11;
    }
}
