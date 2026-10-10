package androidx.camera.featurecombinationquery;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: renamed from: androidx.camera.featurecombinationquery.c */
/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class C1242c {
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ Set m2097a(Collection collection) {
        HashSet hashSet = new HashSet(collection.size());
        for (Object obj : collection) {
            Objects.requireNonNull(obj);
            hashSet.add(obj);
        }
        return Collections.unmodifiableSet(hashSet);
    }
}
