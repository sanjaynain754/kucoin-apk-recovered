package p60;

import am.HistoryFundsParams;
import am.HistoryProfitDetailParams;
import am.HistoryProfitParams;
import am.HistoryTradeRecordParams;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.broker.MultiBizType;
import com.kubi.kumex.data.assets.model.ProfitDetailItemEntity;
import com.kubi.kumex.data.assets.model.ProfitRecordEntity;
import com.kubi.kumex.data.assets.model.ProfitShareEntity;
import com.kubi.kumex.data.assets.model.TradeRecordEntity;
import com.kubi.kumex.entity.FundsRecordEntity;
import com.kubi.sdk.PageEntity;
import com.kubi.sdk.base.entity.BasePageEntity;
import com.kubi.unify.api.entity.UnifyOrderDisplayTypeEnum;
import com.kubi.unify.api.entity.UnifySupportService;
import com.kubi.unify.entity.UnifyPageEntity;
import com.kubi.unify.unify.common.history.UnifyPositionDetailEntity;
import com.kubi.unify.unify.common.history.UnifyProfitRecordEntity;
import com.kubi.unify.unify.common.history.UnifyTradeRecordEntity;
import com.kubi.utils.extensions.C27039d;
import com.tencent.rmonitor.base.p144db.table.ReportDataTable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import mr.C42597a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p595rg.InterfaceC44074b;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.TuplesKt;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.collections.MapsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: p60.c */
/* JADX INFO: compiled from: IHistoryApiDelegate.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u000b\u001a\u00020\fH\u0016J\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0016\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u000e2\u0006\u0010\u0010\u001a\u00020\u0014H\u0016J\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u00162\u0006\u0010\u0010\u001a\u00020\u0018H\u0016J\u0016\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u000e2\u0006\u0010\u0010\u001a\u00020\u001bH\u0016J\u001a\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!H\u0016R#\u0010\u0004\u001a\n \u0006*\u0004\u0018\u00010\u00050\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\b¨\u0006\""}, m90084d2 = {"Lcom/kubi/unify/unify/common/history/IHistoryApiDelegate;", "Lcom/kubi/function/common/IMultiHistoryApi;", "<init>", "()V", "api", "Lcom/kubi/unify/unify/common/history/IHistoryApi;", "kotlin.jvm.PlatformType", "getApi", "()Lcom/kubi/unify/unify/common/history/IHistoryApi;", "api$delegate", "Lkotlin/Lazy;", "multiBizType", "Lcom/kubi/broker/MultiBizType;", "fetchProfitRecord", "Lcom/kubi/sdk/PageEntity;", "Lcom/kubi/kumex/data/assets/model/ProfitRecordEntity;", ReportDataTable.COLUMN_PARAMS, "Lcom/kubi/kumex/data/assets/model/HistoryProfitParams;", "fetchProfitDetail", "Lcom/kubi/kumex/data/assets/model/ProfitDetailItemEntity;", "Lcom/kubi/kumex/data/assets/model/HistoryProfitDetailParams;", "fetchFundsRecord", "Lcom/kubi/sdk/base/entity/BasePageEntity;", "Lcom/kubi/kumex/entity/FundsRecordEntity;", "Lcom/kubi/kumex/data/assets/model/HistoryFundsParams;", "fetchTradeRecord", "Lcom/kubi/kumex/data/assets/model/TradeRecordEntity;", "Lcom/kubi/kumex/data/assets/model/HistoryTradeRecordParams;", "fetchProfitShare", "Lcom/kubi/kumex/data/assets/model/ProfitShareEntity;", "pnlId", "", "closeTime", "", "BUnifyAccountLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nIHistoryApiDelegate.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IHistoryApiDelegate.kt\ncom/kubi/unify/unify/common/history/IHistoryApiDelegate\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,135:1\n1563#2:136\n1634#2,3:137\n1563#2:140\n1634#2,3:141\n295#2,2:144\n1563#2:146\n1634#2,3:147\n*S KotlinDebug\n*F\n+ 1 IHistoryApiDelegate.kt\ncom/kubi/unify/unify/common/history/IHistoryApiDelegate\n*L\n57#1:136\n57#1:137,3\n81#1:140\n81#1:141,3\n111#1:144,2\n121#1:146\n121#1:147,3\n*E\n"})
public final class C43394c implements InterfaceC44074b {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final Lazy f95840a = LazyKt.lazy(new Function0() { // from class: p60.b
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return C43394c.m95572a0();
        }
    });

    @Override // p595rg.InterfaceC44074b
    @NotNull
    /* JADX INFO: renamed from: K0 */
    public PageEntity<ProfitRecordEntity> mo83052K0(@NotNull HistoryProfitParams params) throws Throwable {
        List listEmptyList;
        Intrinsics.checkNotNullParameter(params, "params");
        HashMap<String, String> mapHashMapOf = MapsKt.hashMapOf(TuplesKt.m90091to("pageSize", String.valueOf(params.getPageSize())), TuplesKt.m90091to("currentPage", String.valueOf(params.getCurrentPage() + 1)));
        String currency = params.getCurrency();
        if (currency != null) {
            mapHashMapOf.put(FirebaseAnalytics.Param.CURRENCY, currency);
        }
        String symbol = params.getSymbol();
        if (symbol != null) {
            mapHashMapOf.put("symbol", symbol);
        }
        Long beginTime = params.getBeginTime();
        if (beginTime != null) {
            mapHashMapOf.put("beginTime", String.valueOf(beginTime.longValue()));
        }
        Long endTime = params.getEndTime();
        if (endTime != null) {
            mapHashMapOf.put("endTime", String.valueOf(endTime.longValue()));
        }
        UnifyPageEntity<UnifyProfitRecordEntity> unifyPageEntityM95568a = m95573x0().m95568a(mapHashMapOf);
        List<UnifyProfitRecordEntity> items = unifyPageEntityM95568a.getItems();
        if (items != null) {
            listEmptyList = new ArrayList(CollectionsKt.collectionSizeOrDefault(items, 10));
            Iterator<T> it = items.iterator();
            while (it.hasNext()) {
                listEmptyList.add(((UnifyProfitRecordEntity) it.next()).toProfitRecordEntity());
            }
        } else {
            listEmptyList = null;
        }
        if (listEmptyList == null) {
            listEmptyList = CollectionsKt.emptyList();
        }
        return new PageEntity<>(CollectionsKt.toMutableList((Collection) listEmptyList), C27039d.m66650j(unifyPageEntityM95568a.getTotalPage()) > C27039d.m66650j(unifyPageEntityM95568a.getCurrentPage()), null, C27039d.m66650j(unifyPageEntityM95568a.getCurrentPage()), -1, unifyPageEntityM95568a.getTotalNum());
    }

    @Override // p595rg.InterfaceC44074b
    @NotNull
    /* JADX INFO: renamed from: O0 */
    public PageEntity<TradeRecordEntity> mo83053O0(@NotNull HistoryTradeRecordParams params) throws Throwable {
        UnifyOrderDisplayTypeEnum next;
        Intrinsics.checkNotNullParameter(params, "params");
        HashMap map = new HashMap();
        map.put("tradeType", UnifySupportService.FUTURES.getValue());
        map.put("currentPage", String.valueOf(params.getCurrentPage()));
        map.put("pageSize", String.valueOf(params.getPageSize()));
        Long beginTime = params.getBeginTime();
        if (beginTime != null) {
            map.put("startAt", String.valueOf(beginTime.longValue()));
        }
        Long endTime = params.getEndTime();
        if (endTime != null) {
            map.put("endAt", String.valueOf(endTime.longValue()));
        }
        String symbol = params.getSymbol();
        if (symbol != null) {
            map.put("symbol", symbol);
        }
        String type = params.getType();
        List listEmptyList = null;
        if (type != null) {
            Iterator<UnifyOrderDisplayTypeEnum> it = UnifyOrderDisplayTypeEnum.getEntries().iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!Intrinsics.areEqual(next.getTradeType(), type));
            UnifyOrderDisplayTypeEnum unifyOrderDisplayTypeEnum = next;
            if (unifyOrderDisplayTypeEnum != null) {
                map.put("orderDisplayType", String.valueOf(Integer.valueOf(unifyOrderDisplayTypeEnum.getType()).intValue()));
            }
        }
        String orderId = params.getOrderId();
        if (orderId != null) {
            map.put("orderId", orderId);
        }
        UnifyPageEntity<UnifyTradeRecordEntity> unifyPageEntityM95569d = m95573x0().m95569d(map);
        List<UnifyTradeRecordEntity> items = unifyPageEntityM95569d.getItems();
        if (items != null) {
            listEmptyList = new ArrayList(CollectionsKt.collectionSizeOrDefault(items, 10));
            Iterator<T> it2 = items.iterator();
            while (it2.hasNext()) {
                listEmptyList.add(((UnifyTradeRecordEntity) it2.next()).toTradeRecordEntity());
            }
        }
        if (listEmptyList == null) {
            listEmptyList = CollectionsKt.emptyList();
        }
        return new PageEntity<>(CollectionsKt.toMutableList((Collection) listEmptyList), C27039d.m66650j(unifyPageEntityM95569d.getTotalPage()) > C27039d.m66650j(unifyPageEntityM95569d.getCurrentPage()), null, C27039d.m66650j(unifyPageEntityM95569d.getCurrentPage()) + 1, -1, unifyPageEntityM95569d.getTotalNum());
    }

    @Override // p595rg.InterfaceC44074b
    @NotNull
    /* JADX INFO: renamed from: Q0 */
    public BasePageEntity<FundsRecordEntity> mo83054Q0(@NotNull HistoryFundsParams params) {
        Intrinsics.checkNotNullParameter(params, "params");
        return new BasePageEntity<>();
    }

    @Override // p595rg.InterfaceC44074b
    @Nullable
    /* JADX INFO: renamed from: c */
    public ProfitShareEntity mo83055c(@NotNull String pnlId, long j11) {
        Intrinsics.checkNotNullParameter(pnlId, "pnlId");
        return null;
    }

    @Override // p595rg.InterfaceC44074b
    @NotNull
    /* JADX INFO: renamed from: c0 */
    public PageEntity<ProfitDetailItemEntity> mo83056c0(@NotNull HistoryProfitDetailParams params) throws Throwable {
        List listEmptyList;
        Intrinsics.checkNotNullParameter(params, "params");
        HashMap<String, String> mapHashMapOf = MapsKt.hashMapOf(TuplesKt.m90091to("positionId", params.getId()), TuplesKt.m90091to("currentPage", String.valueOf(params.getCurrentPage())), TuplesKt.m90091to("pageSize", String.valueOf(params.getPageSize())));
        String openTime = params.getOpenTime();
        if (openTime != null) {
            mapHashMapOf.put("openTime", openTime);
        }
        String closeTime = params.getCloseTime();
        if (closeTime != null) {
            mapHashMapOf.put("closeTime", closeTime);
        }
        UnifyPageEntity<UnifyPositionDetailEntity> unifyPageEntityM95570e = m95573x0().m95570e(mapHashMapOf);
        List<UnifyPositionDetailEntity> items = unifyPageEntityM95570e.getItems();
        if (items != null) {
            listEmptyList = new ArrayList(CollectionsKt.collectionSizeOrDefault(items, 10));
            Iterator<T> it = items.iterator();
            while (it.hasNext()) {
                listEmptyList.add(((UnifyPositionDetailEntity) it.next()).toProfitDetailItemEntity());
            }
        } else {
            listEmptyList = null;
        }
        if (listEmptyList == null) {
            listEmptyList = CollectionsKt.emptyList();
        }
        return new PageEntity<>(CollectionsKt.toMutableList((Collection) listEmptyList), C27039d.m66650j(unifyPageEntityM95570e.getTotalPage()) > C27039d.m66650j(unifyPageEntityM95570e.getCurrentPage()), null, C27039d.m66650j(unifyPageEntityM95570e.getCurrentPage()) + 1, -1, unifyPageEntityM95570e.getTotalNum());
    }

    @Override // p559qg.InterfaceC43729a
    @NotNull
    /* JADX INFO: renamed from: x */
    public MultiBizType mo4515x() {
        return MultiBizType.UNIFIED;
    }

    /* JADX INFO: renamed from: x0 */
    public final InterfaceC43392a m95573x0() {
        return (InterfaceC43392a) this.f95840a.getValue();
    }

    /* JADX INFO: renamed from: a0 */
    public static final InterfaceC43392a m95572a0() {
        return (InterfaceC43392a) C42597a.m93391g().create(InterfaceC43392a.class);
    }
}
