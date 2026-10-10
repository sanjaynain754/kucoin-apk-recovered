package p390k2;

import androidx.annotation.Nullable;
import androidx.collection.ArrayMap;
import com.bumptech.glide.load.engine.C5345e;
import com.bumptech.glide.load.engine.C5349i;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;
import p298h2.C38086g;
import p523p2.C43362i;

/* JADX INFO: renamed from: k2.c */
/* JADX INFO: compiled from: LoadPathCache.java */
/* JADX INFO: loaded from: classes.dex */
public class C40867c {

    /* JADX INFO: renamed from: c */
    public static final C5349i<?, ?, ?> f90873c = new C5349i<>(Object.class, Object.class, Object.class, Collections.singletonList(new C5345e(Object.class, Object.class, Object.class, Collections.EMPTY_LIST, new C38086g(), null)), null);

    /* JADX INFO: renamed from: a */
    public final ArrayMap<C43362i, C5349i<?, ?, ?>> f90874a = new ArrayMap<>();

    /* JADX INFO: renamed from: b */
    public final AtomicReference<C43362i> f90875b = new AtomicReference<>();

    /* JADX INFO: renamed from: b */
    public final C43362i m89443b(Class<?> cls, Class<?> cls2, Class<?> cls3) {
        C43362i andSet = this.f90875b.getAndSet(null);
        if (andSet == null) {
            andSet = new C43362i();
        }
        andSet.m95502a(cls, cls2, cls3);
        return andSet;
    }

    /* JADX INFO: renamed from: c */
    public boolean m89444c(@Nullable C5349i<?, ?, ?> c5349i) {
        return f90873c.equals(c5349i);
    }

    /* JADX INFO: renamed from: d */
    public void m89445d(Class<?> cls, Class<?> cls2, Class<?> cls3, @Nullable C5349i<?, ?, ?> c5349i) {
        synchronized (this.f90874a) {
            ArrayMap<C43362i, C5349i<?, ?, ?>> arrayMap = this.f90874a;
            C43362i c43362i = new C43362i(cls, cls2, cls3);
            if (c5349i == null) {
                c5349i = f90873c;
            }
            arrayMap.put(c43362i, c5349i);
        }
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    public <Data, TResource, Transcode> C5349i<Data, TResource, Transcode> m89442a(Class<Data> cls, Class<TResource> cls2, Class<Transcode> cls3) {
        C5349i<Data, TResource, Transcode> c5349i;
        C43362i c43362iM89443b = m89443b(cls, cls2, cls3);
        synchronized (this.f90874a) {
            c5349i = (C5349i) this.f90874a.get(c43362iM89443b);
        }
        this.f90875b.set(c43362iM89443b);
        return c5349i;
    }
}
