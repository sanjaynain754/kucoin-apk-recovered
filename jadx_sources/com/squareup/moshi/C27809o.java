package com.squareup.moshi;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import ob0.C43012b;

/* JADX INFO: renamed from: com.squareup.moshi.o */
/* JADX INFO: compiled from: Moshi.java */
/* JADX INFO: loaded from: classes59.dex */
public final class C27809o {

    /* JADX INFO: renamed from: e */
    public static final List<AbstractC27800f.d> f56630e;

    /* JADX INFO: renamed from: a */
    public final List<AbstractC27800f.d> f56631a;

    /* JADX INFO: renamed from: b */
    public final int f56632b;

    /* JADX INFO: renamed from: c */
    public final ThreadLocal<c> f56633c = new ThreadLocal<>();

    /* JADX INFO: renamed from: d */
    public final Map<Object, AbstractC27800f<?>> f56634d = new LinkedHashMap();

    /* JADX INFO: renamed from: com.squareup.moshi.o$a */
    /* JADX INFO: compiled from: Moshi.java */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public final List<AbstractC27800f.d> f56635a = new ArrayList();

        /* JADX INFO: renamed from: b */
        public int f56636b = 0;

        /* JADX INFO: renamed from: a */
        public C27809o m68741a() {
            return new C27809o(this);
        }
    }

    /* JADX INFO: renamed from: com.squareup.moshi.o$b */
    /* JADX INFO: compiled from: Moshi.java */
    public static final class b<T> extends AbstractC27800f<T> {

        /* JADX INFO: renamed from: a */
        public final Type f56637a;

        /* JADX INFO: renamed from: b */
        public final String f56638b;

        /* JADX INFO: renamed from: c */
        public final Object f56639c;

        /* JADX INFO: renamed from: d */
        public AbstractC27800f<T> f56640d;

        @Override // com.squareup.moshi.AbstractC27800f
        /* JADX INFO: renamed from: b */
        public T mo68666b(JsonReader jsonReader) throws IOException {
            AbstractC27800f<T> abstractC27800f = this.f56640d;
            if (abstractC27800f != null) {
                return abstractC27800f.mo68666b(jsonReader);
            }
            throw new IllegalStateException("JsonAdapter isn't ready");
        }

        @Override // com.squareup.moshi.AbstractC27800f
        /* JADX INFO: renamed from: f */
        public void mo68667f(AbstractC27807m abstractC27807m, T t11) throws IOException {
            AbstractC27800f<T> abstractC27800f = this.f56640d;
            if (abstractC27800f == null) {
                throw new IllegalStateException("JsonAdapter isn't ready");
            }
            abstractC27800f.mo68667f(abstractC27807m, t11);
        }

        public String toString() {
            AbstractC27800f<T> abstractC27800f = this.f56640d;
            return abstractC27800f != null ? abstractC27800f.toString() : super.toString();
        }

        public b(Type type, String str, Object obj) {
            this.f56637a = type;
            this.f56638b = str;
            this.f56639c = obj;
        }
    }

    /* JADX INFO: renamed from: com.squareup.moshi.o$c */
    /* JADX INFO: compiled from: Moshi.java */
    public final class c {

        /* JADX INFO: renamed from: a */
        public final List<b<?>> f56641a = new ArrayList();

        /* JADX INFO: renamed from: b */
        public final Deque<b<?>> f56642b = new ArrayDeque();

        /* JADX INFO: renamed from: c */
        public boolean f56643c;

        public c() {
        }

        /* JADX INFO: renamed from: a */
        public <T> void m68742a(AbstractC27800f<T> abstractC27800f) {
            this.f56642b.getLast().f56640d = abstractC27800f;
        }

        /* JADX INFO: renamed from: b */
        public IllegalArgumentException m68743b(IllegalArgumentException illegalArgumentException) {
            if (!this.f56643c) {
                this.f56643c = true;
                if (this.f56642b.size() != 1 || this.f56642b.getFirst().f56638b != null) {
                    StringBuilder sb2 = new StringBuilder(illegalArgumentException.getMessage());
                    Iterator<b<?>> itDescendingIterator = this.f56642b.descendingIterator();
                    while (itDescendingIterator.hasNext()) {
                        b<?> next = itDescendingIterator.next();
                        sb2.append("\nfor ");
                        sb2.append(next.f56637a);
                        if (next.f56638b != null) {
                            sb2.append(' ');
                            sb2.append(next.f56638b);
                        }
                    }
                    return new IllegalArgumentException(sb2.toString(), illegalArgumentException);
                }
            }
            return illegalArgumentException;
        }

        /* JADX INFO: renamed from: c */
        public void m68744c(boolean z11) {
            this.f56642b.removeLast();
            if (this.f56642b.isEmpty()) {
                C27809o.this.f56633c.remove();
                if (z11) {
                    synchronized (C27809o.this.f56634d) {
                        try {
                            int size = this.f56641a.size();
                            for (int i11 = 0; i11 < size; i11++) {
                                b<?> bVar = this.f56641a.get(i11);
                                AbstractC27800f<T> abstractC27800f = (AbstractC27800f) C27809o.this.f56634d.put(bVar.f56639c, bVar.f56640d);
                                if (abstractC27800f != 0) {
                                    bVar.f56640d = abstractC27800f;
                                    C27809o.this.f56634d.put(bVar.f56639c, abstractC27800f);
                                }
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                }
            }
        }

        /* JADX INFO: renamed from: d */
        public <T> AbstractC27800f<T> m68745d(Type type, String str, Object obj) {
            int size = this.f56641a.size();
            for (int i11 = 0; i11 < size; i11++) {
                b<?> bVar = this.f56641a.get(i11);
                if (bVar.f56639c.equals(obj)) {
                    this.f56642b.add(bVar);
                    AbstractC27800f<T> abstractC27800f = (AbstractC27800f<T>) bVar.f56640d;
                    return abstractC27800f != null ? abstractC27800f : bVar;
                }
            }
            b<?> bVar2 = new b<>(type, str, obj);
            this.f56641a.add(bVar2);
            this.f56642b.add(bVar2);
            return null;
        }
    }

    /* JADX INFO: renamed from: e */
    public <T> AbstractC27800f<T> m68738e(Type type, Set<? extends Annotation> set) {
        return m68739f(type, set, null);
    }

    static {
        ArrayList arrayList = new ArrayList(5);
        f56630e = arrayList;
        arrayList.add(C27810p.f56645a);
        arrayList.add(AbstractC27798d.f56593b);
        arrayList.add(C27808n.f56627c);
        arrayList.add(C27795a.f56573c);
        arrayList.add(C27797c.f56586d);
    }

    /* JADX INFO: renamed from: c */
    public <T> AbstractC27800f<T> m68736c(Class<T> cls) {
        return m68738e(cls, C43012b.f95182a);
    }

    /* JADX INFO: renamed from: d */
    public <T> AbstractC27800f<T> m68737d(Type type) {
        return m68738e(type, C43012b.f95182a);
    }

    /* JADX INFO: renamed from: f */
    public <T> AbstractC27800f<T> m68739f(Type type, Set<? extends Annotation> set, String str) {
        if (type == null) {
            throw new NullPointerException("type == null");
        }
        if (set == null) {
            throw new NullPointerException("annotations == null");
        }
        Type typeM94472l = C43012b.m94472l(C43012b.m94461a(type));
        Object objM68740g = m68740g(typeM94472l, set);
        synchronized (this.f56634d) {
            try {
                AbstractC27800f<T> abstractC27800f = (AbstractC27800f) this.f56634d.get(objM68740g);
                if (abstractC27800f != null) {
                    return abstractC27800f;
                }
                c cVar = this.f56633c.get();
                if (cVar == null) {
                    cVar = new c();
                    this.f56633c.set(cVar);
                }
                AbstractC27800f<T> abstractC27800fM68745d = cVar.m68745d(typeM94472l, str, objM68740g);
                try {
                    if (abstractC27800fM68745d != null) {
                        cVar.m68744c(false);
                        return abstractC27800fM68745d;
                    }
                    try {
                        int size = this.f56631a.size();
                        for (int i11 = 0; i11 < size; i11++) {
                            AbstractC27800f<T> abstractC27800f2 = (AbstractC27800f<T>) this.f56631a.get(i11).mo68668a(typeM94472l, set, this);
                            if (abstractC27800f2 != null) {
                                cVar.m68742a(abstractC27800f2);
                                cVar.m68744c(true);
                                return abstractC27800f2;
                            }
                        }
                        throw new IllegalArgumentException("No JsonAdapter for " + C43012b.m94477q(typeM94472l, set));
                    } catch (IllegalArgumentException e11) {
                        throw cVar.m68743b(e11);
                    }
                } catch (Throwable th2) {
                    cVar.m68744c(false);
                    throw th2;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public C27809o(a aVar) {
        int size = aVar.f56635a.size();
        List<AbstractC27800f.d> list = f56630e;
        ArrayList arrayList = new ArrayList(size + list.size());
        arrayList.addAll(aVar.f56635a);
        arrayList.addAll(list);
        this.f56631a = Collections.unmodifiableList(arrayList);
        this.f56632b = aVar.f56636b;
    }

    /* JADX INFO: renamed from: g */
    public final Object m68740g(Type type, Set<? extends Annotation> set) {
        if (set.isEmpty()) {
            return type;
        }
        return Arrays.asList(type, set);
    }
}
