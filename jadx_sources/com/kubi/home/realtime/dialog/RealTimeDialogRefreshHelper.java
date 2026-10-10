package com.kubi.home.realtime.dialog;

import com.kubi.home.realtime.IRealTimeData;
import com.kubi.home.realtime.RealTimeViewType;
import com.kubi.home.realtime.ViewLifecycleEvent;
import com.kubi.home.realtime.frame.manager.BasePendingRefreshHelper;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import p456mj.C42562k;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.comparisons.ComparisonsKt;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: com.kubi.home.realtime.dialog.a, reason: from Kotlin metadata */
/* JADX INFO: compiled from: RealTimeDialogRefreshHelper.kt */
/* JADX INFO: loaded from: classes15.dex */
@Metadata(m90083d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u000eJ\u0010\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\"\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\n0\u00142\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u00142\u0006\u0010\r\u001a\u00020\u000eJ\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u0014R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, m90084d2 = {"Lcom/kubi/home/realtime/dialog/RealTimeDialogRefreshHelper;", "Lcom/kubi/home/realtime/frame/manager/BasePendingRefreshHelper;", "adapter", "Lcom/kubi/home/realtime/dialog/DataListAdapter;", "<init>", "(Lcom/kubi/home/realtime/dialog/DataListAdapter;)V", "getAdapter", "()Lcom/kubi/home/realtime/dialog/DataListAdapter;", "datas", "", "Lcom/kubi/home/realtime/dialog/DataListAdapter$DataListItem;", "loadData", "", "isRealtimeV2", "", TUIConstants.TUIGroupNotePlugin.PLUGIN_GROUP_NOTE_ENABLE_NOTIFICATION, "executeUIOperations", "operations", "Lcom/kubi/home/realtime/frame/manager/BasePendingRefreshHelper$PendingOperations;", "groupAndSortData", "", "dataList", "Lcom/kubi/home/realtime/IRealTimeData;", "getCurrentData", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nRealTimeDialogRefreshHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RealTimeDialogRefreshHelper.kt\ncom/kubi/home/realtime/dialog/RealTimeDialogRefreshHelper\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 4 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,146:1\n1869#2:147\n360#2,7:148\n1870#2:155\n1869#2:156\n360#2,7:157\n774#2:164\n865#2,2:165\n360#2,7:167\n1870#2:174\n774#2:175\n865#2,2:176\n1491#2:178\n1516#2,3:179\n1519#2,3:189\n1068#2:195\n1563#2:196\n1634#2,3:197\n1068#2:201\n1491#2:202\n1516#2,3:203\n1519#2,3:213\n1068#2:219\n1563#2:220\n1634#2,3:221\n1068#2:225\n808#2,11:226\n1563#2:237\n1634#2,3:238\n382#3,7:182\n382#3,7:206\n126#4:192\n153#4,2:193\n155#4:200\n126#4:216\n153#4,2:217\n155#4:224\n*S KotlinDebug\n*F\n+ 1 RealTimeDialogRefreshHelper.kt\ncom/kubi/home/realtime/dialog/RealTimeDialogRefreshHelper\n*L\n35#1:147\n36#1:148,7\n35#1:155\n47#1:156\n48#1:157,7\n56#1:164\n56#1:165,2\n60#1:167,7\n47#1:174\n80#1:175\n80#1:176,2\n81#1:178\n81#1:179,3\n81#1:189,3\n85#1:195\n96#1:196\n96#1:197,3\n104#1:201\n110#1:202\n110#1:203,3\n110#1:213,3\n114#1:219\n124#1:220\n124#1:221,3\n132#1:225\n144#1:226,11\n144#1:237\n144#1:238,3\n81#1:182,7\n110#1:206,7\n83#1:192\n83#1:193,2\n83#1:200\n112#1:216\n112#1:217,2\n112#1:224\n*E\n"})
public final class RealTimeDialogRefreshHelper extends BasePendingRefreshHelper {

    /* JADX INFO: renamed from: i */
    @NotNull
    public final DataListAdapter f26134i;

    /* JADX INFO: renamed from: j */
    @NotNull
    public final List<DataListAdapter.AbstractC14823a> f26135j;

    /* JADX INFO: renamed from: com.kubi.home.realtime.dialog.a$a */
    /* JADX INFO: compiled from: Comparisons.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareByDescending$1\n+ 2 RealTimeDialogRefreshHelper.kt\ncom/kubi/home/realtime/dialog/RealTimeDialogRefreshHelper\n*L\n1#1,328:1\n105#2:329\n*E\n"})
    public static final class a<T> implements Comparator {
        @Override // java.util.Comparator
        public final int compare(T t11, T t12) {
            Object objFirst = CollectionsKt.first((List<? extends Object>) t12);
            Intrinsics.checkNotNull(objFirst, "null cannot be cast to non-null type com.kubi.home.realtime.dialog.DataListAdapter.DataListItem.GroupHeader");
            Long lValueOf = Long.valueOf(((DataListAdapter.AbstractC14823a.GroupHeader) objFirst).getLatestTime());
            Object objFirst2 = CollectionsKt.first((List<? extends Object>) t11);
            Intrinsics.checkNotNull(objFirst2, "null cannot be cast to non-null type com.kubi.home.realtime.dialog.DataListAdapter.DataListItem.GroupHeader");
            return ComparisonsKt.compareValues(lValueOf, Long.valueOf(((DataListAdapter.AbstractC14823a.GroupHeader) objFirst2).getLatestTime()));
        }
    }

    /* JADX INFO: renamed from: com.kubi.home.realtime.dialog.a$b */
    /* JADX INFO: compiled from: Comparisons.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareByDescending$1\n+ 2 RealTimeDialogRefreshHelper.kt\ncom/kubi/home/realtime/dialog/RealTimeDialogRefreshHelper\n*L\n1#1,328:1\n133#2:329\n*E\n"})
    public static final class b<T> implements Comparator {
        @Override // java.util.Comparator
        public final int compare(T t11, T t12) {
            Object objFirst = CollectionsKt.first((List<? extends Object>) t12);
            Intrinsics.checkNotNull(objFirst, "null cannot be cast to non-null type com.kubi.home.realtime.dialog.DataListAdapter.DataListItem.GroupHeader");
            Long lValueOf = Long.valueOf(((DataListAdapter.AbstractC14823a.GroupHeader) objFirst).getLatestTime());
            Object objFirst2 = CollectionsKt.first((List<? extends Object>) t11);
            Intrinsics.checkNotNull(objFirst2, "null cannot be cast to non-null type com.kubi.home.realtime.dialog.DataListAdapter.DataListItem.GroupHeader");
            return ComparisonsKt.compareValues(lValueOf, Long.valueOf(((DataListAdapter.AbstractC14823a.GroupHeader) objFirst2).getLatestTime()));
        }
    }

    /* JADX INFO: renamed from: com.kubi.home.realtime.dialog.a$c */
    /* JADX INFO: compiled from: Comparisons.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareByDescending$1\n+ 2 RealTimeDialogRefreshHelper.kt\ncom/kubi/home/realtime/dialog/RealTimeDialogRefreshHelper\n*L\n1#1,328:1\n85#2:329\n*E\n"})
    public static final class c<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t11, T t12) {
            return ComparisonsKt.compareValues(Long.valueOf(((IRealTimeData) t12).getAutoIncreaseId()), Long.valueOf(((IRealTimeData) t11).getAutoIncreaseId()));
        }
    }

    /* JADX INFO: renamed from: com.kubi.home.realtime.dialog.a$d */
    /* JADX INFO: compiled from: Comparisons.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareByDescending$1\n+ 2 RealTimeDialogRefreshHelper.kt\ncom/kubi/home/realtime/dialog/RealTimeDialogRefreshHelper\n*L\n1#1,328:1\n114#2:329\n*E\n"})
    public static final class d<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t11, T t12) {
            return ComparisonsKt.compareValues(Long.valueOf(((IRealTimeData) t12).getAutoIncreaseId()), Long.valueOf(((IRealTimeData) t11).getAutoIncreaseId()));
        }
    }

    public RealTimeDialogRefreshHelper(@NotNull DataListAdapter adapter) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        this.f26134i = adapter;
        this.f26135j = new ArrayList();
    }

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ void m30133n(RealTimeDialogRefreshHelper realTimeDialogRefreshHelper, boolean z11, boolean z12, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z12 = true;
        }
        realTimeDialogRefreshHelper.m30136m(z11, z12);
    }

    @Override // com.kubi.home.realtime.frame.manager.BasePendingRefreshHelper
    /* JADX INFO: renamed from: d */
    public void mo30094d(@NotNull BasePendingRefreshHelper.PendingOperations operations) {
        Intrinsics.checkNotNullParameter(operations, "operations");
        Iterator<T> it = operations.m30153c().values().iterator();
        while (true) {
            int i11 = 0;
            if (!it.hasNext()) {
                break;
            }
            IRealTimeData iRealTimeData = (IRealTimeData) it.next();
            Iterator<DataListAdapter.AbstractC14823a> it2 = this.f26135j.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    i11 = -1;
                    break;
                }
                DataListAdapter.AbstractC14823a next = it2.next();
                if ((next instanceof DataListAdapter.AbstractC14823a.DataDetail) && Intrinsics.areEqual(((DataListAdapter.AbstractC14823a.DataDetail) next).getData().getUniqueId(), iRealTimeData.getUniqueId())) {
                    break;
                } else {
                    i11++;
                }
            }
            if (i11 != -1) {
                this.f26135j.set(i11, new DataListAdapter.AbstractC14823a.DataDetail(iRealTimeData));
                this.f26134i.m30100j(this.f26135j);
            }
        }
        for (IRealTimeData iRealTimeData2 : operations.m30152b()) {
            Iterator<DataListAdapter.AbstractC14823a> it3 = this.f26135j.iterator();
            int i12 = 0;
            while (true) {
                if (!it3.hasNext()) {
                    i12 = -1;
                    break;
                }
                DataListAdapter.AbstractC14823a next2 = it3.next();
                if ((next2 instanceof DataListAdapter.AbstractC14823a.DataDetail) && Intrinsics.areEqual(((DataListAdapter.AbstractC14823a.DataDetail) next2).getData().getUniqueId(), iRealTimeData2.getUniqueId())) {
                    break;
                } else {
                    i12++;
                }
            }
            if (i12 != -1) {
                this.f26135j.remove(i12);
                List<DataListAdapter.AbstractC14823a> list = this.f26135j;
                ArrayList arrayList = new ArrayList();
                for (Object obj : list) {
                    DataListAdapter.AbstractC14823a abstractC14823a = (DataListAdapter.AbstractC14823a) obj;
                    if ((abstractC14823a instanceof DataListAdapter.AbstractC14823a.DataDetail) && ((DataListAdapter.AbstractC14823a.DataDetail) abstractC14823a).getData().getViewType() == iRealTimeData2.getViewType()) {
                        arrayList.add(obj);
                    }
                }
                if (arrayList.size() == 0) {
                    Iterator<DataListAdapter.AbstractC14823a> it4 = this.f26135j.iterator();
                    int i13 = 0;
                    while (true) {
                        if (!it4.hasNext()) {
                            i13 = -1;
                            break;
                        }
                        DataListAdapter.AbstractC14823a next3 = it4.next();
                        if ((next3 instanceof DataListAdapter.AbstractC14823a.GroupHeader) && ((DataListAdapter.AbstractC14823a.GroupHeader) next3).getViewType() == iRealTimeData2.getViewType()) {
                            break;
                        } else {
                            i13++;
                        }
                    }
                    if (i13 != -1) {
                        this.f26135j.remove(i13);
                    }
                }
                this.f26134i.m30100j(this.f26135j);
            }
        }
    }

    @NotNull
    /* JADX INFO: renamed from: k */
    public final List<IRealTimeData> m30134k() {
        List<DataListAdapter.AbstractC14823a> list = this.f26135j;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof DataListAdapter.AbstractC14823a.DataDetail) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((DataListAdapter.AbstractC14823a.DataDetail) it.next()).getData());
        }
        return arrayList2;
    }

    @NotNull
    /* JADX INFO: renamed from: l */
    public final List<DataListAdapter.AbstractC14823a> m30135l(@NotNull List<? extends IRealTimeData> dataList, boolean z11) {
        Intrinsics.checkNotNullParameter(dataList, "dataList");
        if (dataList.isEmpty()) {
            return CollectionsKt.emptyList();
        }
        if (!z11) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Object obj : dataList) {
                RealTimeViewType viewType = ((IRealTimeData) obj).getViewType();
                Object arrayList = linkedHashMap.get(viewType);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    linkedHashMap.put(viewType, arrayList);
                }
                ((List) arrayList).add(obj);
            }
            ArrayList arrayList2 = new ArrayList(linkedHashMap.size());
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                RealTimeViewType realTimeViewType = (RealTimeViewType) entry.getKey();
                List listSortedWith = CollectionsKt.sortedWith((List) entry.getValue(), new d());
                DataListAdapter.AbstractC14823a.GroupHeader groupHeader = new DataListAdapter.AbstractC14823a.GroupHeader(realTimeViewType, ((IRealTimeData) CollectionsKt.first(listSortedWith)).getAutoIncreaseId(), null, 4, null);
                ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(listSortedWith, 10));
                Iterator it = listSortedWith.iterator();
                while (it.hasNext()) {
                    arrayList3.add(new DataListAdapter.AbstractC14823a.DataDetail((IRealTimeData) it.next()));
                }
                arrayList2.add(CollectionsKt.plus((Collection) CollectionsKt.listOf(groupHeader), (Iterable) arrayList3));
            }
            return CollectionsKt.flatten(CollectionsKt.sortedWith(arrayList2, new b()));
        }
        ArrayList arrayList4 = new ArrayList();
        for (Object obj2 : dataList) {
            if (((IRealTimeData) obj2).getViewType() == RealTimeViewType.COMMON) {
                arrayList4.add(obj2);
            }
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Object obj3 : arrayList4) {
            String viewTypeV2 = ((IRealTimeData) obj3).getViewTypeV2();
            if (viewTypeV2 == null) {
                viewTypeV2 = "";
            }
            Object arrayList5 = linkedHashMap2.get(viewTypeV2);
            if (arrayList5 == null) {
                arrayList5 = new ArrayList();
                linkedHashMap2.put(viewTypeV2, arrayList5);
            }
            ((List) arrayList5).add(obj3);
        }
        ArrayList arrayList6 = new ArrayList(linkedHashMap2.size());
        for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
            String str = (String) entry2.getKey();
            List listSortedWith2 = CollectionsKt.sortedWith((List) entry2.getValue(), new c());
            DataListAdapter.AbstractC14823a.GroupHeader groupHeader2 = new DataListAdapter.AbstractC14823a.GroupHeader(RealTimeViewType.COMMON, ((IRealTimeData) CollectionsKt.first(listSortedWith2)).getAutoIncreaseId(), str);
            ArrayList arrayList7 = new ArrayList(CollectionsKt.collectionSizeOrDefault(listSortedWith2, 10));
            Iterator it2 = listSortedWith2.iterator();
            while (it2.hasNext()) {
                arrayList7.add(new DataListAdapter.AbstractC14823a.DataDetail((IRealTimeData) it2.next()));
            }
            arrayList6.add(CollectionsKt.plus((Collection) CollectionsKt.listOf(groupHeader2), (Iterable) arrayList7));
        }
        return CollectionsKt.flatten(CollectionsKt.sortedWith(arrayList6, new a()));
    }

    /* JADX INFO: renamed from: m */
    public final void m30136m(boolean z11, boolean z12) {
        List<IRealTimeData> listM93316o = C42562k.f94240a.m93316o();
        this.f26135j.clear();
        this.f26135j.addAll(m30135l(listM93316o, z11));
        this.f26134i.m30100j(this.f26135j);
        if (z12) {
            for (IRealTimeData iRealTimeData : listM93316o) {
                C42562k.f94240a.m93324x(new ViewLifecycleEvent.DialogShow(iRealTimeData, iRealTimeData.getViewType()));
            }
        }
    }
}
