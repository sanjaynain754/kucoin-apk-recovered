package p342ih;

import com.kubi.broker.RepositoryServiceLocator;
import com.kubi.kumex.data.assets.model.SimpleBalanceEntity;
import com.kubi.kumex.data.platform.model.ContractEntity;
import com.kubi.kumex.data.trade.model.CrossHedgeQtyMargin;
import com.kubi.kumex.data.trade.model.CrossHedgeQtyMarginEntity;
import com.kubi.kumex.data.trade.model.CrossOrderOfSymbol;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p852kotlin.Metadata;
import p852kotlin.collections.MapsKt;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import th.InterfaceC44980d;

/* JADX INFO: renamed from: ih.t0 */
/* JADX INFO: compiled from: CrossAssetsServiceImpl.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000$\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u001a \u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0002\u001a&\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00020\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\u0002\u001a$\u0010\u0006\u001a\u00020\u0007*\b\u0012\u0004\u0012\u00020\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0002¨\u0006\r"}, m90084d2 = {"toBalanceSnapshot", "", "Lcom/kubi/kumex/data/assets/model/SimpleBalanceEntity;", "snapshot", "toBalancesSnapshot", "current", "balanceMapOfPosOrderQty", "", "", "posOrderQty", "Lcom/kubi/kumex/data/trade/model/CrossHedgeQtyMarginEntity;", "throwable", "", "KumexLib_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nCrossAssetsServiceImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CrossAssetsServiceImpl.kt\ncom/kubi/futures/classic/cross/service/CrossAssetsServiceImplKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 4 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,150:1\n1#2:151\n216#3:152\n217#3:160\n382#4,7:153\n1869#5,2:161\n*S KotlinDebug\n*F\n+ 1 CrossAssetsServiceImpl.kt\ncom/kubi/futures/classic/cross/service/CrossAssetsServiceImplKt\n*L\n132#1:152\n132#1:160\n136#1:153,7\n142#1:161,2\n*E\n"})
public final class C38606t0 {
    /* JADX INFO: renamed from: d */
    public static final void m87269d(List<SimpleBalanceEntity> list, CrossHedgeQtyMarginEntity crossHedgeQtyMarginEntity, Throwable th2) {
        String settleCurrency;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        InterfaceC44980d interfaceC44980dM20288g = RepositoryServiceLocator.f19236a.m20288g();
        Map symbols = crossHedgeQtyMarginEntity.getSymbols();
        if (symbols == null) {
            symbols = MapsKt.emptyMap();
        }
        for (Map.Entry entry : symbols.entrySet()) {
            String str = (String) entry.getKey();
            CrossOrderOfSymbol crossOrderOfSymbol = (CrossOrderOfSymbol) entry.getValue();
            ContractEntity contractEntityM99529O = InterfaceC44980d.m99529O(interfaceC44980dM20288g, str, false, 2, null);
            crossOrderOfSymbol.setContract(contractEntityM99529O);
            if (contractEntityM99529O != null && (settleCurrency = contractEntityM99529O.getSettleCurrency()) != null) {
                Object crossHedgeQtyMargin = linkedHashMap.get(settleCurrency);
                if (crossHedgeQtyMargin == null) {
                    crossHedgeQtyMargin = new CrossHedgeQtyMargin();
                    linkedHashMap.put(settleCurrency, crossHedgeQtyMargin);
                }
                ((CrossHedgeQtyMargin) crossHedgeQtyMargin).put(str, crossOrderOfSymbol);
            }
        }
        for (SimpleBalanceEntity simpleBalanceEntity : list) {
            CrossHedgeQtyMargin crossHedgeQtyMargin2 = new CrossHedgeQtyMargin();
            Map mapEmptyMap = (Map) linkedHashMap.get(simpleBalanceEntity.getCurrency());
            if (mapEmptyMap == null) {
                mapEmptyMap = MapsKt.emptyMap();
            }
            crossHedgeQtyMargin2.putAll(mapEmptyMap);
            simpleBalanceEntity.setHedgeQtyMargin(crossHedgeQtyMargin2);
            simpleBalanceEntity.setHedgeQtyMarginThrowable(th2);
        }
    }

    /* JADX INFO: renamed from: f */
    public static final List<SimpleBalanceEntity> m87271f(List<SimpleBalanceEntity> list, List<SimpleBalanceEntity> list2) {
        Object next;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (list2.size() > list.size()) {
            arrayList.addAll(list2);
            arrayList2.addAll(list);
        } else {
            arrayList.addAll(list);
            arrayList2.addAll(list2);
        }
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            SimpleBalanceEntity simpleBalanceEntity = (SimpleBalanceEntity) arrayList.get(i11);
            Iterator it = arrayList2.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!Intrinsics.areEqual(((SimpleBalanceEntity) next).getCurrency(), simpleBalanceEntity.getCurrency()));
            SimpleBalanceEntity simpleBalanceEntity2 = (SimpleBalanceEntity) next;
            if (simpleBalanceEntity2 != null && simpleBalanceEntity2.getVersion() > simpleBalanceEntity.getVersion()) {
                arrayList.set(i11, simpleBalanceEntity2);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: e */
    public static final List<SimpleBalanceEntity> m87270e(List<SimpleBalanceEntity> list, SimpleBalanceEntity simpleBalanceEntity) {
        int size = list.size();
        int i11 = -1;
        int i12 = 0;
        while (true) {
            int i13 = i12;
            int i14 = i11;
            i11 = i13;
            if (i11 < size) {
                if (Intrinsics.areEqual(list.get(i11).getCurrency(), simpleBalanceEntity.getCurrency())) {
                    break;
                }
                i12 = i11 + 1;
            } else {
                i11 = i14;
                break;
            }
        }
        if (i11 >= 0) {
            if (simpleBalanceEntity.getVersion() >= list.get(i11).getVersion()) {
                list.set(i11, simpleBalanceEntity);
            }
            return list;
        }
        list.add(simpleBalanceEntity);
        return list;
    }
}
