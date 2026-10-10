package androidx.camera.featurecombinationquery;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* JADX INFO: renamed from: androidx.camera.featurecombinationquery.b */
/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class C1241b {
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ List m2096a(Collection collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        for (Object obj : collection) {
            Objects.requireNonNull(obj);
            arrayList.add(obj);
        }
        return Collections.unmodifiableList(arrayList);
    }
}
