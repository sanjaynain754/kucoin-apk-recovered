package com.kubi.quotefacade.tradechance;

import android.content.Context;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.facebook.react.uimanager.ViewProps;
import com.kubi.quotefacade.R$id;
import com.kubi.quotefacade.R$layout;
import com.kubi.quotefacade.tradechance.submodule.BaseChanceChildView;
import com.kubi.quotefacade.tradechance.submodule.gembox.ChanceGemBoxView;
import com.kubi.quotefacade.tradechance.submodule.hotrank.ChanceHotrankView;
import com.kubi.quotefacade.tradechance.submodule.marketchange.ChanceChangeView;
import com.kubi.quotefacade.tradechance.submodule.plate.ChancePlateView;
import com.kubi.quotefacade.tradechance.submodule.whale.ChanceWhaleView;
import com.kubi.utils.C27100x0;
import io.chad.library.adapter.base.BaseMultiItemQuickAdapter;
import io.chad.library.adapter.base.BaseViewHolder;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: TradeChanceAdapter.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90083d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001c\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00020\u0014J\u0014\u0010\u0015\u001a\u00020\u00102\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00020\u0014J\u0018\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u0002H\u0014J\u0018\u0010\u0019\u001a\u00020\u0010*\u0006\u0012\u0002\b\u00030\t2\u0006\u0010\u0018\u001a\u00020\u0002H\u0002J\u0010\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\bH\u0002R>\u0010\u0006\u001a&\u0012\u0004\u0012\u00020\b\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t0\u0007j\u0012\u0012\u0004\u0012\u00020\b\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t`\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u001d"}, m90084d2 = {"Lcom/kubi/quotefacade/tradechance/TradeChanceAdapter;", "Lio/chad/library/adapter/base/BaseMultiItemQuickAdapter;", "Lcom/kubi/quotefacade/tradechance/ITradeChanceDataItem;", "Lio/chad/library/adapter/base/BaseViewHolder;", "<init>", "()V", "contentViews", "Ljava/util/LinkedHashMap;", "", "Lcom/kubi/quotefacade/tradechance/submodule/BaseChanceChildView;", "Lkotlin/collections/LinkedHashMap;", "getContentViews", "()Ljava/util/LinkedHashMap;", "setContentViews", "(Ljava/util/LinkedHashMap;)V", "setDatas", "", "context", "Landroid/content/Context;", "dataList", "", "refreshItems", "convert", "helper", "item", "fillData", "isShowDivider", "", ViewProps.POSITION, "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nTradeChanceAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TradeChanceAdapter.kt\ncom/kubi/quotefacade/tradechance/TradeChanceAdapter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,93:1\n1869#2,2:94\n360#2,7:96\n1869#2:103\n360#2,7:104\n1870#2:111\n*S KotlinDebug\n*F\n+ 1 TradeChanceAdapter.kt\ncom/kubi/quotefacade/tradechance/TradeChanceAdapter\n*L\n36#1:94,2\n86#1:96,7\n51#1:103\n52#1:104,7\n51#1:111\n*E\n"})
public final class TradeChanceAdapter extends BaseMultiItemQuickAdapter<ITradeChanceDataItem, BaseViewHolder> {

    /* JADX INFO: renamed from: i */
    @NotNull
    public LinkedHashMap<Integer, BaseChanceChildView<?>> f42597i;

    public TradeChanceAdapter() {
        super(null);
        int i11 = R$layout.quote_item_trade_chance_data;
        addItemType(1, i11);
        addItemType(3, i11);
        addItemType(4, i11);
        addItemType(5, i11);
        addItemType(999, R$layout.quote_item_trade_chance_footer);
        this.f42597i = new LinkedHashMap<>();
    }

    /* JADX INFO: renamed from: k */
    public static final Unit m53028k(ITradeChanceDataItem iTradeChanceDataItem, BaseChanceChildView baseChanceChildView) {
        BaseChanceChildView baseChanceChildView2;
        if (iTradeChanceDataItem instanceof ChanceDataPlate) {
            baseChanceChildView2 = baseChanceChildView instanceof ChancePlateView ? (ChancePlateView) baseChanceChildView : null;
            if (baseChanceChildView2 != null) {
                baseChanceChildView2.m53113f(((ChanceDataPlate) iTradeChanceDataItem).getEntity());
            }
        } else if (iTradeChanceDataItem instanceof ChanceDataGemBox) {
            baseChanceChildView2 = baseChanceChildView instanceof ChanceGemBoxView ? (ChanceGemBoxView) baseChanceChildView : null;
            if (baseChanceChildView2 != null) {
                baseChanceChildView2.m53113f(((ChanceDataGemBox) iTradeChanceDataItem).getEntity());
            }
        } else if (iTradeChanceDataItem instanceof ChanceDataMarketChange) {
            baseChanceChildView2 = baseChanceChildView instanceof ChanceChangeView ? (ChanceChangeView) baseChanceChildView : null;
            if (baseChanceChildView2 != null) {
                baseChanceChildView2.m53113f(((ChanceDataMarketChange) iTradeChanceDataItem).getEntityList());
            }
        } else if (iTradeChanceDataItem instanceof ChanceDataWhale) {
            baseChanceChildView2 = baseChanceChildView instanceof ChanceWhaleView ? (ChanceWhaleView) baseChanceChildView : null;
            if (baseChanceChildView2 != null) {
                baseChanceChildView2.m53113f(((ChanceDataWhale) iTradeChanceDataItem).getEntityList());
            }
        } else if (iTradeChanceDataItem instanceof ChanceDataHotRank) {
            baseChanceChildView2 = baseChanceChildView instanceof ChanceHotrankView ? (ChanceHotrankView) baseChanceChildView : null;
            if (baseChanceChildView2 != null) {
                baseChanceChildView2.m53113f(((ChanceDataHotRank) iTradeChanceDataItem).getEntity());
            }
        }
        return Unit.INSTANCE;
    }

    @Override // io.chad.library.adapter.base.BaseQuickAdapter
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public void convert(@NotNull BaseViewHolder helper, @NotNull ITradeChanceDataItem item) {
        FrameLayout frameLayout;
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(item, "item");
        if (item.getF38450c() == 999) {
            return;
        }
        helper.setGone(R$id.divider, m53033m(helper.getBindingAdapterPosition()));
        BaseChanceChildView<?> baseChanceChildView = this.f42597i.get(Integer.valueOf(item.getF38450c()));
        if (baseChanceChildView == null || (frameLayout = (FrameLayout) helper.getView(R$id.layoutContainer)) == null) {
            return;
        }
        if (frameLayout.getChildCount() == 0) {
            ViewParent parent = baseChanceChildView.getParent();
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup != null) {
                viewGroup.removeView(baseChanceChildView);
            }
            frameLayout.addView(baseChanceChildView, new FrameLayout.LayoutParams(-1, -2));
        }
        m53031j(baseChanceChildView, item);
    }

    /* JADX INFO: renamed from: j */
    public final void m53031j(final BaseChanceChildView<?> baseChanceChildView, final ITradeChanceDataItem iTradeChanceDataItem) {
        C27100x0.m66923d(new Function0() { // from class: com.kubi.quotefacade.tradechance.b
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TradeChanceAdapter.m53028k(iTradeChanceDataItem, baseChanceChildView);
            }
        });
    }

    @NotNull
    /* JADX INFO: renamed from: l */
    public final LinkedHashMap<Integer, BaseChanceChildView<?>> m53032l() {
        return this.f42597i;
    }

    /* JADX INFO: renamed from: n */
    public final void m53034n(@NotNull final List<? extends ITradeChanceDataItem> dataList) {
        Intrinsics.checkNotNullParameter(dataList, "dataList");
        C27100x0.m66923d(new Function0() { // from class: com.kubi.quotefacade.tradechance.a
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TradeChanceAdapter.m53029o(dataList, this);
            }
        });
    }

    /* JADX INFO: renamed from: p */
    public final void m53035p(@NotNull Context context, @NotNull List<? extends ITradeChanceDataItem> dataList) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(dataList, "dataList");
        for (ITradeChanceDataItem iTradeChanceDataItem : dataList) {
            if (this.f42597i.get(Integer.valueOf(iTradeChanceDataItem.getF38450c())) == null) {
                if (iTradeChanceDataItem instanceof ChanceDataPlate) {
                    this.f42597i.put(Integer.valueOf(((ChanceDataPlate) iTradeChanceDataItem).getF38450c()), new ChancePlateView(context));
                } else if (iTradeChanceDataItem instanceof ChanceDataMarketChange) {
                    this.f42597i.put(Integer.valueOf(((ChanceDataMarketChange) iTradeChanceDataItem).getF38450c()), new ChanceChangeView(context));
                } else if (iTradeChanceDataItem instanceof ChanceDataWhale) {
                    this.f42597i.put(Integer.valueOf(((ChanceDataWhale) iTradeChanceDataItem).getF38450c()), new ChanceWhaleView(context));
                }
            }
        }
        setNewData(CollectionsKt.toMutableList((Collection) dataList));
    }

    /* JADX INFO: renamed from: o */
    public static final Unit m53029o(List list, TradeChanceAdapter tradeChanceAdapter) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ITradeChanceDataItem iTradeChanceDataItem = (ITradeChanceDataItem) it.next();
            List<T> data = tradeChanceAdapter.getData();
            Intrinsics.checkNotNullExpressionValue(data, "getData(...)");
            Iterator it2 = data.iterator();
            int i11 = 0;
            while (true) {
                if (it2.hasNext()) {
                    if (((ITradeChanceDataItem) it2.next()).getF38450c() == iTradeChanceDataItem.getF38450c()) {
                        break;
                    }
                    i11++;
                } else {
                    i11 = -1;
                    break;
                }
            }
            if (i11 != -1) {
                tradeChanceAdapter.getData().set(i11, iTradeChanceDataItem);
                tradeChanceAdapter.notifyItemChanged(i11);
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: m */
    public final boolean m53033m(int i11) {
        List<T> data = getData();
        Intrinsics.checkNotNullExpressionValue(data, "getData(...)");
        Iterator it = data.iterator();
        int i12 = 0;
        while (true) {
            if (it.hasNext()) {
                if (((ITradeChanceDataItem) it.next()) instanceof ChanceDataFooter) {
                    break;
                }
                i12++;
            } else {
                i12 = -1;
                break;
            }
        }
        if (i12 != -1) {
            if (i11 == i12 - 1) {
                return false;
            }
            return true;
        }
        if (i11 == getData().size() - 1) {
            return false;
        }
        return true;
    }
}
