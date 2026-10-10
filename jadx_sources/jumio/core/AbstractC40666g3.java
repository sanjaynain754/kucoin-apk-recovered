package jumio.core;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.ranges.IntRange;

/* JADX INFO: renamed from: jumio.core.g3 */
/* JADX INFO: loaded from: classes61.dex */
public abstract class AbstractC40666g3 {
    /* JADX INFO: renamed from: a */
    public static List m89255a(int i11, C40661f3 bounds, List nonce) {
        Intrinsics.checkNotNullParameter(bounds, "bounds");
        Intrinsics.checkNotNullParameter(nonce, "nonce");
        if (i11 == 0) {
            return CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList(i11);
        int iIntValue = 0;
        for (int i12 = 0; i12 < i11; i12++) {
            arrayList.add(0);
        }
        int i13 = 0;
        for (Object obj : nonce) {
            int i14 = i13 + 1;
            if (i13 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            int i15 = i13 % i11;
            arrayList.set(i15, Integer.valueOf(((Number) arrayList.get(i15)).intValue() + ((Number) obj).intValue()));
            i13 = i14;
        }
        List mutableList = CollectionsKt.toMutableList(new IntRange(bounds.f90267a, bounds.f90268b));
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            iIntValue += ((Number) it.next()).intValue();
            arrayList2.add(mutableList.remove(iIntValue % mutableList.size()));
        }
        return arrayList2;
    }
}
