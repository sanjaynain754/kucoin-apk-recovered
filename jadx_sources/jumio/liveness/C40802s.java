package jumio.liveness;

import com.jumio.analytics.MetaInfo;
import com.jumio.liveness.DaClient;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import p852kotlin.Pair;
import p852kotlin.TuplesKt;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.collections.MapsKt;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.ranges.RangesKt;

/* JADX INFO: renamed from: jumio.liveness.s */
/* JADX INFO: loaded from: classes61.dex */
public final class C40802s {

    /* JADX INFO: renamed from: a */
    public String f90646a;

    /* JADX INFO: renamed from: b */
    public Long f90647b;

    /* JADX INFO: renamed from: c */
    public final LinkedHashMap f90648c = new LinkedHashMap();

    /* JADX INFO: renamed from: a */
    public final synchronized MetaInfo m89300a(EnumC40801r distance) {
        MetaInfo metaInfo;
        LinkedHashMap linkedHashMap;
        try {
            Intrinsics.checkNotNullParameter(distance, "distance");
            metaInfo = new MetaInfo();
            long jCurrentTimeMillis = System.currentTimeMillis();
            String str = this.f90646a;
            if (str != null) {
                Long l11 = (Long) this.f90648c.get(str);
                long jLongValue = l11 != null ? l11.longValue() : 0L;
                Long l12 = this.f90647b;
                if (l12 != null) {
                    this.f90648c.put(str, Long.valueOf((jCurrentTimeMillis - l12.longValue()) + jLongValue));
                }
            }
            this.f90647b = Long.valueOf(jCurrentTimeMillis);
            if (this.f90648c.isEmpty()) {
                linkedHashMap = null;
            } else {
                Set<Map.Entry> setEntrySet = this.f90648c.entrySet();
                linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(setEntrySet, 10)), 16));
                for (Map.Entry entry : setEntrySet) {
                    Pair pairM90091to = TuplesKt.m90091to(entry.getKey(), Double.valueOf(((Number) entry.getValue()).doubleValue() / 1000.0d));
                    linkedHashMap.put(pairM90091to.getFirst(), pairM90091to.getSecond());
                }
            }
            if (linkedHashMap != null) {
                metaInfo.put("extractionStates", linkedHashMap);
            }
            metaInfo.put(DaClient.ATTR_DISTANCE, distance.toString());
            m89301a();
        } catch (Throwable th2) {
            throw th2;
        }
        return metaInfo;
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m89301a() {
        this.f90646a = null;
        this.f90647b = null;
        this.f90648c.clear();
    }
}
