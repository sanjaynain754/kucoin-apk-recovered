package p712w3;

import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: renamed from: w3.j */
/* JADX INFO: compiled from: Sets.java */
/* JADX INFO: loaded from: classes34.dex */
public final class C45710j {
    /* JADX INFO: renamed from: a */
    public static <E> CopyOnWriteArraySet<E> m100901a() {
        return new CopyOnWriteArraySet<>();
    }

    /* JADX INFO: renamed from: b */
    public static <E> Set<E> m100902b() {
        return m100903c(new IdentityHashMap());
    }

    /* JADX INFO: renamed from: c */
    public static <E> Set<E> m100903c(Map<E, Boolean> map) {
        return Collections.newSetFromMap(map);
    }
}
