package vf0;

import io.opencensus.trace.Status;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import tf0.C44941b;

/* JADX INFO: renamed from: vf0.c */
/* JADX INFO: compiled from: SampledSpanStore.java */
/* JADX INFO: loaded from: classes60.dex */
public abstract class AbstractC45526c {

    /* JADX INFO: renamed from: vf0.c$b */
    /* JADX INFO: compiled from: SampledSpanStore.java */
    public static final class b extends AbstractC45526c {

        /* JADX INFO: renamed from: b */
        public static final c f102584b;

        /* JADX INFO: renamed from: a */
        public final Set<String> f102585a;

        public b() {
            this.f102585a = new HashSet();
        }

        static {
            Map map = Collections.EMPTY_MAP;
            f102584b = c.m100516a(map, map);
        }

        @Override // vf0.AbstractC45526c
        /* JADX INFO: renamed from: b */
        public void mo100515b(Collection<String> collection) {
            C44941b.m99389b(collection, "spanNames");
            synchronized (this.f102585a) {
                this.f102585a.addAll(collection);
            }
        }
    }

    /* JADX INFO: renamed from: vf0.c$c */
    /* JADX INFO: compiled from: SampledSpanStore.java */
    public static abstract class c {
        /* JADX INFO: renamed from: b */
        public abstract Map<Status.CanonicalCode, Integer> mo100510b();

        /* JADX INFO: renamed from: c */
        public abstract Map<Object, Integer> mo100511c();

        /* JADX INFO: renamed from: a */
        public static c m100516a(Map<Object, Integer> map, Map<Status.CanonicalCode, Integer> map2) {
            return new C45524a(Collections.unmodifiableMap(new HashMap((Map) C44941b.m99389b(map, "numbersOfLatencySampledSpans"))), Collections.unmodifiableMap(new HashMap((Map) C44941b.m99389b(map2, "numbersOfErrorSampledSpans"))));
        }
    }

    @Deprecated
    /* JADX INFO: renamed from: b */
    public abstract void mo100515b(Collection<String> collection);

    /* JADX INFO: renamed from: a */
    public static AbstractC45526c m100514a() {
        return new b();
    }
}
