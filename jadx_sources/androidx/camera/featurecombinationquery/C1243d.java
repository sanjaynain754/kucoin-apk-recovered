package androidx.camera.featurecombinationquery;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: renamed from: androidx.camera.featurecombinationquery.d */
/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class C1243d {
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ Map m2098a(Map map) {
        HashMap map2 = new HashMap(map.size());
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            Objects.requireNonNull(key);
            Object value = entry.getValue();
            Objects.requireNonNull(value);
            map2.put(key, value);
        }
        return Collections.unmodifiableMap(map2);
    }
}
