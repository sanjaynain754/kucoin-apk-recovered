package androidx.media3.exoplayer.dash;

import android.os.SystemClock;
import android.util.Pair;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.dash.manifest.BaseUrl;
import com.google.common.collect.Iterables;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;

/* JADX INFO: loaded from: classes34.dex */
@UnstableApi
public final class BaseUrlExclusionList {
    private final Map<Integer, Long> excludedPriorities;
    private final Map<String, Long> excludedServiceLocations;
    private final Random random;
    private final Map<List<Pair<String, Integer>>, BaseUrl> selectionsTaken;

    public BaseUrlExclusionList() {
        this(new Random());
    }

    private BaseUrl selectWeighted(List<BaseUrl> list) {
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            i11 += list.get(i12).weight;
        }
        int iNextInt = this.random.nextInt(i11);
        int i13 = 0;
        for (int i14 = 0; i14 < list.size(); i14++) {
            BaseUrl baseUrl = list.get(i14);
            i13 += baseUrl.weight;
            if (iNextInt < i13) {
                return baseUrl;
            }
        }
        return (BaseUrl) Iterables.getLast(list);
    }

    @VisibleForTesting
    public BaseUrlExclusionList(Random random) {
        this.selectionsTaken = new HashMap();
        this.random = random;
        this.excludedServiceLocations = new HashMap();
        this.excludedPriorities = new HashMap();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int compareBaseUrl(BaseUrl baseUrl, BaseUrl baseUrl2) {
        int iCompare = Integer.compare(baseUrl.priority, baseUrl2.priority);
        return iCompare != 0 ? iCompare : baseUrl.serviceLocation.compareTo(baseUrl2.serviceLocation);
    }

    public static int getPriorityCount(List<BaseUrl> list) {
        HashSet hashSet = new HashSet();
        for (int i11 = 0; i11 < list.size(); i11++) {
            hashSet.add(Integer.valueOf(list.get(i11).priority));
        }
        return hashSet.size();
    }

    private static <T> void removeExpiredExclusions(long j11, Map<T, Long> map) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<T, Long> entry : map.entrySet()) {
            if (entry.getValue().longValue() <= j11) {
                arrayList.add(entry.getKey());
            }
        }
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            map.remove(arrayList.get(i11));
        }
    }

    public int getPriorityCountAfterExclusion(List<BaseUrl> list) {
        HashSet hashSet = new HashSet();
        List<BaseUrl> listApplyExclusions = applyExclusions(list);
        for (int i11 = 0; i11 < listApplyExclusions.size(); i11++) {
            hashSet.add(Integer.valueOf(listApplyExclusions.get(i11).priority));
        }
        return hashSet.size();
    }

    public void reset() {
        this.excludedServiceLocations.clear();
        this.excludedPriorities.clear();
        this.selectionsTaken.clear();
    }

    private static <T> void addExclusion(T t11, long j11, Map<T, Long> map) {
        if (map.containsKey(t11)) {
            j11 = Math.max(j11, ((Long) Util.castNonNull(map.get(t11))).longValue());
        }
        map.put(t11, Long.valueOf(j11));
    }

    private List<BaseUrl> applyExclusions(List<BaseUrl> list) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        removeExpiredExclusions(jElapsedRealtime, this.excludedServiceLocations);
        removeExpiredExclusions(jElapsedRealtime, this.excludedPriorities);
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < list.size(); i11++) {
            BaseUrl baseUrl = list.get(i11);
            if (!this.excludedServiceLocations.containsKey(baseUrl.serviceLocation) && !this.excludedPriorities.containsKey(Integer.valueOf(baseUrl.priority))) {
                arrayList.add(baseUrl);
            }
        }
        return arrayList;
    }

    public void exclude(BaseUrl baseUrl, long j11) {
        long jElapsedRealtime = SystemClock.elapsedRealtime() + j11;
        addExclusion(baseUrl.serviceLocation, jElapsedRealtime, this.excludedServiceLocations);
        int i11 = baseUrl.priority;
        if (i11 != Integer.MIN_VALUE) {
            addExclusion(Integer.valueOf(i11), jElapsedRealtime, this.excludedPriorities);
        }
    }

    @Nullable
    public BaseUrl selectBaseUrl(List<BaseUrl> list) {
        List<BaseUrl> listApplyExclusions = applyExclusions(list);
        if (listApplyExclusions.size() < 2) {
            return (BaseUrl) Iterables.getFirst(listApplyExclusions, null);
        }
        Collections.sort(listApplyExclusions, new Comparator() { // from class: androidx.media3.exoplayer.dash.a
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return BaseUrlExclusionList.compareBaseUrl((BaseUrl) obj, (BaseUrl) obj2);
            }
        });
        ArrayList arrayList = new ArrayList();
        int i11 = listApplyExclusions.get(0).priority;
        for (int i12 = 0; i12 < listApplyExclusions.size(); i12++) {
            BaseUrl baseUrl = listApplyExclusions.get(i12);
            if (i11 != baseUrl.priority) {
                if (arrayList.size() != 1) {
                    break;
                }
                return listApplyExclusions.get(0);
            }
            arrayList.add(new Pair(baseUrl.serviceLocation, Integer.valueOf(baseUrl.weight)));
        }
        BaseUrl baseUrl2 = this.selectionsTaken.get(arrayList);
        if (baseUrl2 == null) {
            BaseUrl baseUrlSelectWeighted = selectWeighted(listApplyExclusions.subList(0, arrayList.size()));
            this.selectionsTaken.put(arrayList, baseUrlSelectWeighted);
            return baseUrlSelectWeighted;
        }
        return baseUrl2;
    }
}
