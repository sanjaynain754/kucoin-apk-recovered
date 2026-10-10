package jumio.liveness;

import java.util.Comparator;
import p852kotlin.Pair;
import p852kotlin.comparisons.ComparisonsKt;
import p852kotlin.text.StringsKt;

/* JADX INFO: renamed from: jumio.liveness.o */
/* JADX INFO: loaded from: classes61.dex */
public final class C40798o implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return ComparisonsKt.compareValues(Integer.valueOf(Integer.parseInt(StringsKt.substringAfter$default((String) ((Pair) obj).getFirst(), "liveness_", (String) null, 2, (Object) null))), Integer.valueOf(Integer.parseInt(StringsKt.substringAfter$default((String) ((Pair) obj2).getFirst(), "liveness_", (String) null, 2, (Object) null))));
    }
}
