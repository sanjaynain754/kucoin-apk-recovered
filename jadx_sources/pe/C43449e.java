package pe;

import j30.C40266c;
import j30.SegmentOrder;
import java.math.BigDecimal;
import java.util.List;
import ne.SegmentTradeInputData;
import ne.SegmentTradeInputInterceptResult;
import org.jetbrains.annotations.NotNull;
import p497oe.C43032h;
import p557qe.InterfaceC43720b;
import p557qe.InterfaceC43722d;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import ro.C44128b;

/* JADX INFO: renamed from: pe.e */
/* JADX INFO: compiled from: SegmentImmediateFillIntercept.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0016J\u0010\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u0003H\u0016J$\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00022\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0011H\u0016R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0012"}, m90084d2 = {"Lcom/kubi/core/spot/business/holder/intercept/input/SegmentImmediateFillIntercept;", "Lcom/kubi/core/spot/business/holder/intercept/taskchain/ITask;", "Lcom/kubi/core/spot/business/holder/intercept/data/SegmentTradeInputData;", "Lcom/kubi/core/spot/business/holder/intercept/data/SegmentTradeInputInterceptResult;", "<init>", "()V", "name", "", "getName", "()Ljava/lang/String;", "onPassed", "", "data", "onIntercept", "exception", "run", "dispatcher", "Lcom/kubi/core/spot/business/holder/intercept/taskchain/TaskDispatcher;", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nSegmentImmediateFillIntercept.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SegmentImmediateFillIntercept.kt\ncom/kubi/core/spot/business/holder/intercept/input/SegmentImmediateFillIntercept\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,69:1\n1761#2,3:70\n*S KotlinDebug\n*F\n+ 1 SegmentImmediateFillIntercept.kt\ncom/kubi/core/spot/business/holder/intercept/input/SegmentImmediateFillIntercept\n*L\n57#1:70,3\n*E\n"})
public final class C43449e implements InterfaceC43720b<SegmentTradeInputData, SegmentTradeInputInterceptResult> {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final String f95978a = "segmentImmediateFillCheckTask";

    @Override // p557qe.InterfaceC43720b
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void mo23274a(@NotNull SegmentTradeInputInterceptResult exception) {
        Intrinsics.checkNotNullParameter(exception, "exception");
    }

    @Override // p557qe.InterfaceC43720b
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void mo23275b(@NotNull SegmentTradeInputData data) {
        Intrinsics.checkNotNullParameter(data, "data");
    }

    @Override // p557qe.InterfaceC43720b
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public void mo23276c(@NotNull SegmentTradeInputData data, @NotNull InterfaceC43722d<SegmentTradeInputData, SegmentTradeInputInterceptResult> dispatcher) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        try {
            List<SegmentOrder> listM88647c = C40266c.f89505a.m88647c(data.getPriceMin(), data.getPriceMax(), data.getOrderCount(), data.getTotalQty(), data.getDistributionType(), data.getParentBehavior().mo22365N().getPriceIncrementPrecisionTrade(), data.getParentBehavior().mo22365N().getBaseIncrementPrecisionTrade(), (128 & 128) != 0 ? null : null);
            BigDecimal marketPrice = data.getParentBehavior().mo22356G().getMarketPrice(data.getIsBuy());
            C44128b.m97258b("SegmentImmediateFillIntercept - latestPrice: " + marketPrice + ", orders: " + listM88647c);
            if (marketPrice.compareTo(BigDecimal.ZERO) <= 0) {
                dispatcher.mo96274a(this, data);
                return;
            }
            if (listM88647c == null || !listM88647c.isEmpty()) {
                for (SegmentOrder segmentOrder : listM88647c) {
                    boolean isBuy = data.getIsBuy();
                    int iCompareTo = segmentOrder.getPrice().compareTo(marketPrice);
                    if (isBuy) {
                        if (iCompareTo >= 0) {
                            new C43032h(this).m94521c(data, dispatcher);
                            return;
                        }
                    } else if (iCompareTo <= 0) {
                        new C43032h(this).m94521c(data, dispatcher);
                        return;
                    }
                }
            }
            dispatcher.mo96274a(this, data);
        } catch (Exception unused) {
            dispatcher.mo96274a(this, data);
        }
    }
}
