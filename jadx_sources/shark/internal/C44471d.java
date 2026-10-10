package shark.internal;

import androidx.media3.exoplayer.upstream.CmcdData;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.TuplesKt;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.collections.MapsKt;
import p852kotlin.jvm.functions.Function1;
import shark.internal.hppc.C44481e;
import shark.internal.hppc.LongLongScatterMap;

/* JADX INFO: renamed from: shark.internal.d */
/* JADX INFO: compiled from: DominatorTree.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\"\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000bJG\u0010\u0012\u001a\u001a\u0012\u0004\u0012\u00020\u0006\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00110\u00102\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\f2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00020\u000e¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, m90084d2 = {"Lshark/internal/d;", "", "", "expectedElements", "<init>", "(I)V", "", "objectId", "parentObjectId", "", "c", "(JJ)Z", "", "retainedObjectIds", "Lkotlin/Function1;", "computeSize", "", "Lkotlin/Pair;", "b", "(Ljava/util/Set;Lkotlin/jvm/functions/Function1;)Ljava/util/Map;", "Lshark/internal/hppc/LongLongScatterMap;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Lshark/internal/hppc/LongLongScatterMap;", "dominated", "shark"}, m90085k = 1, m90086mv = {1, 4, 1})
public final class C44471d {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final LongLongScatterMap dominated;

    /* JADX INFO: renamed from: shark.internal.d$a */
    /* JADX INFO: compiled from: DominatorTree.kt */
    @Metadata(m90083d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m90084d2 = {"shark/internal/d$a", "Lshark/internal/hppc/LongLongScatterMap$a;", "", "key", "value", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(JJ)V", "shark"}, m90085k = 1, m90086mv = {1, 4, 1})
    public static final class a implements LongLongScatterMap.InterfaceC44476a {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Map f98423b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ Function1 f98424c;

        public a(Map map, Function1 function1) {
            this.f98423b = map;
            this.f98424c = function1;
        }

        @Override // shark.internal.hppc.LongLongScatterMap.InterfaceC44476a
        /* JADX INFO: renamed from: a */
        public void mo98333a(long key, long value) {
            int iIntValue;
            Pair pair = (Pair) this.f98423b.get(Long.valueOf(key));
            if (pair != null) {
                int iIntValue2 = ((Number) pair.component1()).intValue();
                int iIntValue3 = ((Number) pair.component2()).intValue();
                iIntValue = ((Number) this.f98424c.invoke(Long.valueOf(key))).intValue();
                this.f98423b.put(Long.valueOf(key), TuplesKt.m90091to(Integer.valueOf(iIntValue2 + iIntValue), Integer.valueOf(iIntValue3 + 1)));
            } else {
                iIntValue = -1;
            }
            if (value != 0) {
                List listMutableListOf = CollectionsKt.mutableListOf(Long.valueOf(key));
                while (value != 0) {
                    if (this.f98423b.containsKey(Long.valueOf(value))) {
                        Iterator it = listMutableListOf.iterator();
                        while (it.hasNext()) {
                            C44471d.this.dominated.m98364q(((Number) it.next()).longValue(), value);
                        }
                        if (iIntValue == -1) {
                            iIntValue = ((Number) this.f98424c.invoke(Long.valueOf(key))).intValue();
                        }
                        Pair pair2 = (Pair) MapsKt.getValue(this.f98423b, Long.valueOf(value));
                        this.f98423b.put(Long.valueOf(value), TuplesKt.m90091to(Integer.valueOf(((Number) pair2.component1()).intValue() + iIntValue), Integer.valueOf(((Number) pair2.component2()).intValue() + 1)));
                        listMutableListOf.clear();
                    } else {
                        listMutableListOf.add(Long.valueOf(value));
                    }
                    value = C44471d.this.dominated.m98356i(value);
                }
                Iterator it2 = listMutableListOf.iterator();
                while (it2.hasNext()) {
                    C44471d.this.dominated.m98364q(((Number) it2.next()).longValue(), 0L);
                }
            }
        }
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final Map<Long, Pair<Integer, Integer>> m98331b(@NotNull Set<Long> retainedObjectIds, @NotNull Function1<? super Long, Integer> computeSize) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<T> it = retainedObjectIds.iterator();
        while (it.hasNext()) {
            linkedHashMap.put(Long.valueOf(((Number) it.next()).longValue()), TuplesKt.m90091to(0, 0));
        }
        this.dominated.m98355h(new a(linkedHashMap, computeSize));
        this.dominated.m98363p();
        return linkedHashMap;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m98332c(long objectId, long parentObjectId) {
        int iM98358k = this.dominated.m98358k(objectId);
        boolean z11 = iM98358k != -1;
        if (z11) {
            long j11 = 0;
            if (parentObjectId != 0) {
                long jM98359l = this.dominated.m98359l(iM98358k);
                if (jM98359l != 0) {
                    C44481e c44481e = new C44481e(0, 1, null);
                    long jM98359l2 = jM98359l;
                    while (true) {
                        long j12 = j11;
                        if (jM98359l2 != j11) {
                            c44481e.m98389a(jM98359l2);
                            int iM98358k2 = this.dominated.m98358k(jM98359l2);
                            if (iM98358k2 == -1) {
                                throw new IllegalStateException("Did not find dominator for " + jM98359l2 + " when going through the dominator chain for " + jM98359l + ": " + c44481e);
                            }
                            jM98359l2 = this.dominated.m98359l(iM98358k2);
                            j11 = j12;
                        } else {
                            long jM98359l3 = parentObjectId;
                            while (jM98359l3 != j12 && !c44481e.m98392d(jM98359l3)) {
                                int iM98358k3 = this.dominated.m98358k(jM98359l3);
                                if (iM98358k3 == -1) {
                                    throw new IllegalStateException("Did not find dominator for " + jM98359l3 + " when going through the dominator chain for " + parentObjectId);
                                }
                                jM98359l3 = this.dominated.m98359l(iM98358k3);
                            }
                            this.dominated.m98364q(objectId, jM98359l3);
                        }
                    }
                }
                return z11;
            }
        }
        this.dominated.m98364q(objectId, parentObjectId);
        return z11;
    }

    public C44471d(int i11) {
        this.dominated = new LongLongScatterMap(i11);
    }
}
