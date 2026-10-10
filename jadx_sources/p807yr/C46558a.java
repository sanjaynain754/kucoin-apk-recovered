package p807yr;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.kubi.network.api.subscribe.model.PeriodRequest;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.jvm.internal.markers.KMappedMarker;
import ro.C44128b;

/* JADX INFO: renamed from: yr.a */
/* JADX INFO: compiled from: Request.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\t\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\u0004J\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\nH\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJM\u0010\u0012\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00100\u000f\u0018\u00010\u000e* \u0012\u0004\u0012\u00020\u0002\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00100\u000f0\u000e0\r2\u0006\u0010\u0011\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J;\u0010\u0014\u001a\u0004\u0018\u00010\u0002* \u0012\u0004\u0012\u00020\u0002\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00100\u000f0\u000e0\r2\u0006\u0010\u0011\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0016\u0010\bR2\u0010\u0018\u001a \u0012\u0004\u0012\u00020\u0002\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00100\u000f0\u000e0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0017¨\u0006\u0019"}, m90084d2 = {"Lyr/a;", "", "Lcom/kubi/network/api/subscribe/model/PeriodRequest;", "<init>", "()V", "element", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Lcom/kubi/network/api/subscribe/model/PeriodRequest;)V", "clear", "", "iterator", "()Ljava/util/Iterator;", "Ljava/util/HashMap;", "", "Lkotlin/Pair;", "", "key", "c", "(Ljava/util/HashMap;Lcom/kubi/network/api/subscribe/model/PeriodRequest;)Ljava/util/List;", "b", "(Ljava/util/HashMap;Lcom/kubi/network/api/subscribe/model/PeriodRequest;)Lcom/kubi/network/api/subscribe/model/PeriodRequest;", "d", "Ljava/util/HashMap;", "queue", "network-core-subscribe_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nRequest.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Request.kt\ncom/kubi/network/subscribe/model/PeriodRequestQueue\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,154:1\n2333#2,14:155\n2333#2,14:169\n2333#2,14:183\n2333#2,14:197\n1855#2,2:212\n1#3:211\n*S KotlinDebug\n*F\n+ 1 Request.kt\ncom/kubi/network/subscribe/model/PeriodRequestQueue\n*L\n104#1:155,14\n105#1:169,14\n114#1:183,14\n115#1:197,14\n147#1:212,2\n*E\n"})
public final class C46558a implements Iterable<PeriodRequest>, KMappedMarker {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final HashMap<PeriodRequest, List<Pair<Integer, Integer>>> queue = new HashMap<>();

    /* JADX INFO: renamed from: a */
    public final synchronized void m102708a(@NotNull PeriodRequest element) {
        Object next;
        Object next2;
        Object next3;
        try {
            Intrinsics.checkNotNullParameter(element, "element");
            Object next4 = null;
            if (Intrinsics.areEqual(element.getType(), "unsubscribe")) {
                PeriodRequest periodRequestM102709b = m102709b(this.queue, element);
                if (periodRequestM102709b == null) {
                    return;
                }
                List<Pair<Integer, Integer>> listM102710c = m102710c(this.queue, periodRequestM102709b);
                if (listM102710c == null) {
                    return;
                }
                Iterator<T> it = listM102710c.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next2 = null;
                        break;
                    }
                    next2 = it.next();
                    Pair pair = (Pair) next2;
                    if (((Number) pair.getFirst()).intValue() == element.getConnectedPeriod() && ((Number) pair.getSecond()).intValue() == element.getDisconnectPeriod()) {
                        break;
                    }
                }
                Pair pair2 = (Pair) next2;
                if (pair2 == null) {
                    return;
                }
                listM102710c.remove(pair2);
                if (listM102710c.isEmpty()) {
                    this.queue.remove(periodRequestM102709b);
                } else {
                    Iterator<T> it2 = listM102710c.iterator();
                    if (it2.hasNext()) {
                        next3 = it2.next();
                        if (it2.hasNext()) {
                            int iIntValue = ((Number) ((Pair) next3).getFirst()).intValue();
                            do {
                                Object next5 = it2.next();
                                int iIntValue2 = ((Number) ((Pair) next5).getFirst()).intValue();
                                if (iIntValue > iIntValue2) {
                                    next3 = next5;
                                    iIntValue = iIntValue2;
                                }
                            } while (it2.hasNext());
                        }
                    } else {
                        next3 = null;
                    }
                    Pair pair3 = (Pair) next3;
                    periodRequestM102709b.setConnectedPeriod(pair3 != null ? ((Number) pair3.getFirst()).intValue() : Integer.MAX_VALUE);
                    Iterator<T> it3 = listM102710c.iterator();
                    if (it3.hasNext()) {
                        next4 = it3.next();
                        if (it3.hasNext()) {
                            int iIntValue3 = ((Number) ((Pair) next4).getSecond()).intValue();
                            do {
                                Object next6 = it3.next();
                                int iIntValue4 = ((Number) ((Pair) next6).getSecond()).intValue();
                                if (iIntValue3 > iIntValue4) {
                                    next4 = next6;
                                    iIntValue3 = iIntValue4;
                                }
                            } while (it3.hasNext());
                        }
                    }
                    Pair pair4 = (Pair) next4;
                    periodRequestM102709b.setDisconnectPeriod(pair4 != null ? ((Number) pair4.getSecond()).intValue() : Integer.MAX_VALUE);
                    Unit unit = Unit.INSTANCE;
                }
            } else {
                PeriodRequest periodRequestM102709b2 = m102709b(this.queue, element);
                if (periodRequestM102709b2 == null) {
                    periodRequestM102709b2 = element;
                }
                List<Pair<Integer, Integer>> listM102710c2 = m102710c(this.queue, periodRequestM102709b2);
                if (listM102710c2 == null) {
                    listM102710c2 = new ArrayList<>();
                }
                listM102710c2.add(new Pair<>(Integer.valueOf(element.getConnectedPeriod()), Integer.valueOf(element.getDisconnectPeriod())));
                this.queue.put(periodRequestM102709b2, listM102710c2);
                Iterator<T> it4 = listM102710c2.iterator();
                if (it4.hasNext()) {
                    next = it4.next();
                    if (it4.hasNext()) {
                        int iIntValue5 = ((Number) ((Pair) next).getFirst()).intValue();
                        do {
                            Object next7 = it4.next();
                            int iIntValue6 = ((Number) ((Pair) next7).getFirst()).intValue();
                            if (iIntValue5 > iIntValue6) {
                                next = next7;
                                iIntValue5 = iIntValue6;
                            }
                        } while (it4.hasNext());
                    }
                } else {
                    next = null;
                }
                Pair pair5 = (Pair) next;
                periodRequestM102709b2.setConnectedPeriod(pair5 != null ? ((Number) pair5.getFirst()).intValue() : Integer.MAX_VALUE);
                Iterator<T> it5 = listM102710c2.iterator();
                if (it5.hasNext()) {
                    next4 = it5.next();
                    if (it5.hasNext()) {
                        int iIntValue7 = ((Number) ((Pair) next4).getSecond()).intValue();
                        do {
                            Object next8 = it5.next();
                            int iIntValue8 = ((Number) ((Pair) next8).getSecond()).intValue();
                            if (iIntValue7 > iIntValue8) {
                                next4 = next8;
                                iIntValue7 = iIntValue8;
                            }
                        } while (it5.hasNext());
                    }
                }
                Pair pair6 = (Pair) next4;
                periodRequestM102709b2.setDisconnectPeriod(pair6 != null ? ((Number) pair6.getSecond()).intValue() : Integer.MAX_VALUE);
                Unit unit2 = Unit.INSTANCE;
            }
            m102711d(element);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void clear() {
        this.queue.clear();
    }

    @Override // java.lang.Iterable
    @NotNull
    public synchronized Iterator<PeriodRequest> iterator() {
        Set<PeriodRequest> setKeySet;
        setKeySet = this.queue.keySet();
        Intrinsics.checkNotNullExpressionValue(setKeySet, "queue.keys");
        return CollectionsKt.toMutableList((Collection) setKeySet).iterator();
    }

    /* JADX INFO: renamed from: d */
    public final void m102711d(PeriodRequest element) {
        StringBuffer stringBuffer = new StringBuffer();
        if (Intrinsics.areEqual(element.getType(), "subscribe")) {
            stringBuffer.append("HeartbeatRequestQueue 订阅:" + element.getId() + '\n');
        } else {
            stringBuffer.append("HeartbeatRequestQueue 取消:" + element.getId() + '\n');
        }
        Set<Map.Entry<PeriodRequest, List<Pair<Integer, Integer>>>> setEntrySet = this.queue.entrySet();
        Intrinsics.checkNotNullExpressionValue(setEntrySet, "queue.entries");
        Iterator<T> it = setEntrySet.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            stringBuffer.append("HeartbeatRequestQueue 详情:" + ((PeriodRequest) entry.getKey()).getId() + " = " + ((List) entry.getValue()).size() + '\n');
        }
        stringBuffer.append("===========================================\n");
        C44128b.m97268l("CATEGORY_SOCKET", stringBuffer.toString());
    }

    /* JADX INFO: renamed from: b */
    public final PeriodRequest m102709b(HashMap<PeriodRequest, List<Pair<Integer, Integer>>> map, PeriodRequest periodRequest) {
        Object next;
        Set<PeriodRequest> keys = map.keySet();
        Intrinsics.checkNotNullExpressionValue(keys, "keys");
        Iterator<T> it = keys.iterator();
        while (it.hasNext()) {
            next = it.next();
            if (Intrinsics.areEqual(((PeriodRequest) next).getId(), periodRequest.getId())) {
                return (PeriodRequest) next;
            }
        }
        next = null;
        return (PeriodRequest) next;
    }

    /* JADX INFO: renamed from: c */
    public final List<Pair<Integer, Integer>> m102710c(HashMap<PeriodRequest, List<Pair<Integer, Integer>>> map, PeriodRequest periodRequest) {
        PeriodRequest periodRequestM102709b = m102709b(map, periodRequest);
        if (periodRequestM102709b != null) {
            return map.get(periodRequestM102709b);
        }
        return null;
    }
}
