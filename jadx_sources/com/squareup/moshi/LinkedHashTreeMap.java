package com.squareup.moshi;

import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* JADX INFO: loaded from: classes59.dex */
final class LinkedHashTreeMap<K, V> extends AbstractMap<K, V> implements Serializable {
    static final /* synthetic */ boolean $assertionsDisabled = false;

    /* JADX INFO: renamed from: b */
    public static final Comparator<Comparable> f56550b = new C27788a();
    Comparator<? super K> comparator;
    private LinkedHashTreeMap<K, V>.C27791d entrySet;
    final C27794g<K, V> header;
    private LinkedHashTreeMap<K, V>.C27792e keySet;
    int modCount;
    int size;
    C27794g<K, V>[] table;
    int threshold;

    /* JADX INFO: renamed from: com.squareup.moshi.LinkedHashTreeMap$b */
    public static final class C27789b<K, V> {

        /* JADX INFO: renamed from: a */
        public C27794g<K, V> f56551a;

        /* JADX INFO: renamed from: b */
        public int f56552b;

        /* JADX INFO: renamed from: c */
        public int f56553c;

        /* JADX INFO: renamed from: d */
        public int f56554d;

        /* JADX INFO: renamed from: a */
        public void m68657a(C27794g<K, V> c27794g) {
            c27794g.f56566d = null;
            c27794g.f56564b = null;
            c27794g.f56565c = null;
            c27794g.f56572j = 1;
            int i11 = this.f56552b;
            if (i11 > 0) {
                int i12 = this.f56554d;
                if ((i12 & 1) == 0) {
                    this.f56554d = i12 + 1;
                    this.f56552b = i11 - 1;
                    this.f56553c++;
                }
            }
            c27794g.f56564b = this.f56551a;
            this.f56551a = c27794g;
            int i13 = this.f56554d;
            int i14 = i13 + 1;
            this.f56554d = i14;
            int i15 = this.f56552b;
            if (i15 > 0 && (i14 & 1) == 0) {
                this.f56554d = i13 + 2;
                this.f56552b = i15 - 1;
                this.f56553c++;
            }
            int i16 = 4;
            while (true) {
                int i17 = i16 - 1;
                if ((this.f56554d & i17) != i17) {
                    return;
                }
                int i18 = this.f56553c;
                if (i18 == 0) {
                    C27794g<K, V> c27794g2 = this.f56551a;
                    C27794g<K, V> c27794g3 = c27794g2.f56564b;
                    C27794g<K, V> c27794g4 = c27794g3.f56564b;
                    c27794g3.f56564b = c27794g4.f56564b;
                    this.f56551a = c27794g3;
                    c27794g3.f56565c = c27794g4;
                    c27794g3.f56566d = c27794g2;
                    c27794g3.f56572j = c27794g2.f56572j + 1;
                    c27794g4.f56564b = c27794g3;
                    c27794g2.f56564b = c27794g3;
                } else if (i18 == 1) {
                    C27794g<K, V> c27794g5 = this.f56551a;
                    C27794g<K, V> c27794g6 = c27794g5.f56564b;
                    this.f56551a = c27794g6;
                    c27794g6.f56566d = c27794g5;
                    c27794g6.f56572j = c27794g5.f56572j + 1;
                    c27794g5.f56564b = c27794g6;
                    this.f56553c = 0;
                } else if (i18 == 2) {
                    this.f56553c = 0;
                }
                i16 *= 2;
            }
        }

        /* JADX INFO: renamed from: c */
        public C27794g<K, V> m68659c() {
            C27794g<K, V> c27794g = this.f56551a;
            if (c27794g.f56564b == null) {
                return c27794g;
            }
            throw new IllegalStateException();
        }

        /* JADX INFO: renamed from: b */
        public void m68658b(int i11) {
            this.f56552b = ((Integer.highestOneBit(i11) * 2) - 1) - i11;
            this.f56554d = 0;
            this.f56553c = 0;
            this.f56551a = null;
        }
    }

    /* JADX INFO: renamed from: com.squareup.moshi.LinkedHashTreeMap$c */
    public static class C27790c<K, V> {

        /* JADX INFO: renamed from: a */
        public C27794g<K, V> f56555a;

        /* JADX INFO: renamed from: b */
        public void m68661b(C27794g<K, V> c27794g) {
            C27794g<K, V> c27794g2 = null;
            while (c27794g != null) {
                c27794g.f56564b = c27794g2;
                c27794g2 = c27794g;
                c27794g = c27794g.f56565c;
            }
            this.f56555a = c27794g2;
        }

        /* JADX INFO: renamed from: a */
        public C27794g<K, V> m68660a() {
            C27794g<K, V> c27794g = this.f56555a;
            if (c27794g == null) {
                return null;
            }
            C27794g<K, V> c27794g2 = c27794g.f56564b;
            c27794g.f56564b = null;
            C27794g<K, V> c27794g3 = c27794g.f56566d;
            while (true) {
                C27794g<K, V> c27794g4 = c27794g2;
                c27794g2 = c27794g3;
                if (c27794g2 == null) {
                    this.f56555a = c27794g4;
                    return c27794g;
                }
                c27794g2.f56564b = c27794g4;
                c27794g3 = c27794g2.f56565c;
            }
        }
    }

    /* JADX INFO: renamed from: com.squareup.moshi.LinkedHashTreeMap$d */
    public final class C27791d extends AbstractSet<Map.Entry<K, V>> {

        /* JADX INFO: renamed from: com.squareup.moshi.LinkedHashTreeMap$d$a */
        public class a extends LinkedHashTreeMap<K, V>.AbstractC27793f<Map.Entry<K, V>> {
            public a() {
                super();
            }

            @Override // java.util.Iterator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public Map.Entry<K, V> next() {
                return m68663a();
            }
        }

        public C27791d() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            LinkedHashTreeMap.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return (obj instanceof Map.Entry) && LinkedHashTreeMap.this.findByEntry((Map.Entry) obj) != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return new a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            C27794g<K, V> c27794gFindByEntry;
            if (!(obj instanceof Map.Entry) || (c27794gFindByEntry = LinkedHashTreeMap.this.findByEntry((Map.Entry) obj)) == null) {
                return false;
            }
            LinkedHashTreeMap.this.removeInternal(c27794gFindByEntry, true);
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return LinkedHashTreeMap.this.size;
        }
    }

    /* JADX INFO: renamed from: com.squareup.moshi.LinkedHashTreeMap$e */
    public final class C27792e extends AbstractSet<K> {

        /* JADX INFO: renamed from: com.squareup.moshi.LinkedHashTreeMap$e$a */
        public class a extends LinkedHashTreeMap<K, V>.AbstractC27793f<K> {
            public a() {
                super();
            }

            @Override // java.util.Iterator
            public K next() {
                return m68663a().f56569g;
            }
        }

        public C27792e() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            LinkedHashTreeMap.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return LinkedHashTreeMap.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<K> iterator() {
            return new a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            return LinkedHashTreeMap.this.removeInternalByKey(obj) != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return LinkedHashTreeMap.this.size;
        }
    }

    /* JADX INFO: renamed from: com.squareup.moshi.LinkedHashTreeMap$f */
    public abstract class AbstractC27793f<T> implements Iterator<T> {

        /* JADX INFO: renamed from: b */
        public C27794g<K, V> f56560b;

        /* JADX INFO: renamed from: c */
        public C27794g<K, V> f56561c = null;

        /* JADX INFO: renamed from: d */
        public int f56562d;

        public AbstractC27793f() {
            this.f56560b = LinkedHashTreeMap.this.header.f56567e;
            this.f56562d = LinkedHashTreeMap.this.modCount;
        }

        /* JADX INFO: renamed from: a */
        public final C27794g<K, V> m68663a() {
            C27794g<K, V> c27794g = this.f56560b;
            LinkedHashTreeMap linkedHashTreeMap = LinkedHashTreeMap.this;
            if (c27794g == linkedHashTreeMap.header) {
                throw new NoSuchElementException();
            }
            if (linkedHashTreeMap.modCount != this.f56562d) {
                throw new ConcurrentModificationException();
            }
            this.f56560b = c27794g.f56567e;
            this.f56561c = c27794g;
            return c27794g;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f56560b != LinkedHashTreeMap.this.header;
        }

        @Override // java.util.Iterator
        public final void remove() {
            C27794g<K, V> c27794g = this.f56561c;
            if (c27794g == null) {
                throw new IllegalStateException();
            }
            LinkedHashTreeMap.this.removeInternal(c27794g, true);
            this.f56561c = null;
            this.f56562d = LinkedHashTreeMap.this.modCount;
        }
    }

    /* JADX INFO: renamed from: com.squareup.moshi.LinkedHashTreeMap$g */
    public static final class C27794g<K, V> implements Map.Entry<K, V> {

        /* JADX INFO: renamed from: b */
        public C27794g<K, V> f56564b;

        /* JADX INFO: renamed from: c */
        public C27794g<K, V> f56565c;

        /* JADX INFO: renamed from: d */
        public C27794g<K, V> f56566d;

        /* JADX INFO: renamed from: e */
        public C27794g<K, V> f56567e;

        /* JADX INFO: renamed from: f */
        public C27794g<K, V> f56568f;

        /* JADX INFO: renamed from: g */
        public final K f56569g;

        /* JADX INFO: renamed from: h */
        public final int f56570h;

        /* JADX INFO: renamed from: i */
        public V f56571i;

        /* JADX INFO: renamed from: j */
        public int f56572j;

        public C27794g() {
            this.f56569g = null;
            this.f56570h = -1;
            this.f56568f = this;
            this.f56567e = this;
        }

        /* JADX INFO: renamed from: a */
        public C27794g<K, V> m68664a() {
            C27794g<K, V> c27794g = this;
            for (C27794g<K, V> c27794g2 = this.f56565c; c27794g2 != null; c27794g2 = c27794g2.f56565c) {
                c27794g = c27794g2;
            }
            return c27794g;
        }

        /* JADX INFO: renamed from: b */
        public C27794g<K, V> m68665b() {
            C27794g<K, V> c27794g = this;
            for (C27794g<K, V> c27794g2 = this.f56566d; c27794g2 != null; c27794g2 = c27794g2.f56566d) {
                c27794g = c27794g2;
            }
            return c27794g;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                K k11 = this.f56569g;
                if (k11 != null ? k11.equals(entry.getKey()) : entry.getKey() == null) {
                    V v11 = this.f56571i;
                    if (v11 == null) {
                        if (entry.getValue() == null) {
                            return true;
                        }
                    } else if (v11.equals(entry.getValue())) {
                        return true;
                    }
                }
            }
            return false;
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.f56569g;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.f56571i;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            K k11 = this.f56569g;
            int iHashCode = k11 == null ? 0 : k11.hashCode();
            V v11 = this.f56571i;
            return iHashCode ^ (v11 != null ? v11.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        public V setValue(V v11) {
            V v12 = this.f56571i;
            this.f56571i = v11;
            return v12;
        }

        public String toString() {
            return this.f56569g + "=" + this.f56571i;
        }

        public C27794g(C27794g<K, V> c27794g, K k11, int i11, C27794g<K, V> c27794g2, C27794g<K, V> c27794g3) {
            this.f56564b = c27794g;
            this.f56569g = k11;
            this.f56570h = i11;
            this.f56572j = 1;
            this.f56567e = c27794g2;
            this.f56568f = c27794g3;
            c27794g3.f56567e = this;
            c27794g2.f56568f = this;
        }
    }

    public LinkedHashTreeMap() {
        this(null);
    }

    public static <K, V> C27794g<K, V>[] doubleCapacity(C27794g<K, V>[] c27794gArr) {
        int length = c27794gArr.length;
        C27794g<K, V>[] c27794gArr2 = new C27794g[length * 2];
        C27790c c27790c = new C27790c();
        C27789b c27789b = new C27789b();
        C27789b c27789b2 = new C27789b();
        for (int i11 = 0; i11 < length; i11++) {
            C27794g<K, V> c27794g = c27794gArr[i11];
            if (c27794g != null) {
                c27790c.m68661b(c27794g);
                int i12 = 0;
                int i13 = 0;
                while (true) {
                    C27794g<K, V> c27794gM68660a = c27790c.m68660a();
                    if (c27794gM68660a == null) {
                        break;
                    }
                    if ((c27794gM68660a.f56570h & length) == 0) {
                        i12++;
                    } else {
                        i13++;
                    }
                }
                c27789b.m68658b(i12);
                c27789b2.m68658b(i13);
                c27790c.m68661b(c27794g);
                while (true) {
                    C27794g<K, V> c27794gM68660a2 = c27790c.m68660a();
                    if (c27794gM68660a2 == null) {
                        break;
                    }
                    if ((c27794gM68660a2.f56570h & length) == 0) {
                        c27789b.m68657a(c27794gM68660a2);
                    } else {
                        c27789b2.m68657a(c27794gM68660a2);
                    }
                }
                c27794gArr2[i11] = i12 > 0 ? c27789b.m68659c() : null;
                c27794gArr2[i11 + length] = i13 > 0 ? c27789b2.m68659c() : null;
            }
        }
        return c27794gArr2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C27794g<K, V> findByObject(Object obj) {
        if (obj != 0) {
            try {
                return find(obj, false);
            } catch (ClassCastException unused) {
            }
        }
        return null;
    }

    public void removeInternal(C27794g<K, V> c27794g, boolean z11) {
        int i11;
        if (z11) {
            C27794g<K, V> c27794g2 = c27794g.f56568f;
            c27794g2.f56567e = c27794g.f56567e;
            c27794g.f56567e.f56568f = c27794g2;
            c27794g.f56568f = null;
            c27794g.f56567e = null;
        }
        C27794g<K, V> c27794g3 = c27794g.f56565c;
        C27794g<K, V> c27794g4 = c27794g.f56566d;
        C27794g<K, V> c27794g5 = c27794g.f56564b;
        int i12 = 0;
        if (c27794g3 == null || c27794g4 == null) {
            if (c27794g3 != null) {
                m68653d(c27794g, c27794g3);
                c27794g.f56565c = null;
            } else if (c27794g4 != null) {
                m68653d(c27794g, c27794g4);
                c27794g.f56566d = null;
            } else {
                m68653d(c27794g, null);
            }
            m68652c(c27794g5, false);
            this.size--;
            this.modCount++;
            return;
        }
        C27794g<K, V> c27794gM68665b = c27794g3.f56572j > c27794g4.f56572j ? c27794g3.m68665b() : c27794g4.m68664a();
        removeInternal(c27794gM68665b, false);
        C27794g<K, V> c27794g6 = c27794g.f56565c;
        if (c27794g6 != null) {
            i11 = c27794g6.f56572j;
            c27794gM68665b.f56565c = c27794g6;
            c27794g6.f56564b = c27794gM68665b;
            c27794g.f56565c = null;
        } else {
            i11 = 0;
        }
        C27794g<K, V> c27794g7 = c27794g.f56566d;
        if (c27794g7 != null) {
            i12 = c27794g7.f56572j;
            c27794gM68665b.f56566d = c27794g7;
            c27794g7.f56564b = c27794gM68665b;
            c27794g.f56566d = null;
        }
        c27794gM68665b.f56572j = Math.max(i11, i12) + 1;
        m68653d(c27794g, c27794gM68665b);
    }

    /* JADX INFO: renamed from: com.squareup.moshi.LinkedHashTreeMap$a */
    public class C27788a implements Comparator<Comparable> {
        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(Comparable comparable, Comparable comparable2) {
            return comparable.compareTo(comparable2);
        }
    }

    public LinkedHashTreeMap(Comparator<? super K> comparator) {
        this.size = 0;
        this.modCount = 0;
        this.comparator = comparator == null ? f56550b : comparator;
        this.header = new C27794g<>();
        C27794g<K, V>[] c27794gArr = new C27794g[16];
        this.table = c27794gArr;
        this.threshold = (c27794gArr.length / 2) + (c27794gArr.length / 4);
    }

    /* JADX INFO: renamed from: g */
    public static int m68649g(int i11) {
        int i12 = i11 ^ ((i11 >>> 20) ^ (i11 >>> 12));
        return (i12 >>> 4) ^ ((i12 >>> 7) ^ i12);
    }

    private Object writeReplace() throws ObjectStreamException {
        return new LinkedHashMap(this);
    }

    /* JADX INFO: renamed from: a */
    public final void m68650a() {
        C27794g<K, V>[] c27794gArrDoubleCapacity = doubleCapacity(this.table);
        this.table = c27794gArrDoubleCapacity;
        this.threshold = (c27794gArrDoubleCapacity.length / 2) + (c27794gArrDoubleCapacity.length / 4);
    }

    /* JADX INFO: renamed from: b */
    public final boolean m68651b(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    /* JADX INFO: renamed from: c */
    public final void m68652c(C27794g<K, V> c27794g, boolean z11) {
        while (c27794g != null) {
            C27794g<K, V> c27794g2 = c27794g.f56565c;
            C27794g<K, V> c27794g3 = c27794g.f56566d;
            int i11 = c27794g2 != null ? c27794g2.f56572j : 0;
            int i12 = c27794g3 != null ? c27794g3.f56572j : 0;
            int i13 = i11 - i12;
            if (i13 == -2) {
                C27794g<K, V> c27794g4 = c27794g3.f56565c;
                C27794g<K, V> c27794g5 = c27794g3.f56566d;
                int i14 = (c27794g4 != null ? c27794g4.f56572j : 0) - (c27794g5 != null ? c27794g5.f56572j : 0);
                if (i14 == -1 || (i14 == 0 && !z11)) {
                    m68654e(c27794g);
                } else {
                    m68655f(c27794g3);
                    m68654e(c27794g);
                }
                if (z11) {
                    return;
                }
            } else if (i13 == 2) {
                C27794g<K, V> c27794g6 = c27794g2.f56565c;
                C27794g<K, V> c27794g7 = c27794g2.f56566d;
                int i15 = (c27794g6 != null ? c27794g6.f56572j : 0) - (c27794g7 != null ? c27794g7.f56572j : 0);
                if (i15 == 1 || (i15 == 0 && !z11)) {
                    m68655f(c27794g);
                } else {
                    m68654e(c27794g2);
                    m68655f(c27794g);
                }
                if (z11) {
                    return;
                }
            } else if (i13 == 0) {
                c27794g.f56572j = i11 + 1;
                if (z11) {
                    return;
                }
            } else {
                c27794g.f56572j = Math.max(i11, i12) + 1;
                if (!z11) {
                    return;
                }
            }
            c27794g = c27794g.f56564b;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        Arrays.fill(this.table, (Object) null);
        this.size = 0;
        this.modCount++;
        C27794g<K, V> c27794g = this.header;
        C27794g<K, V> c27794g2 = c27794g.f56567e;
        while (c27794g2 != c27794g) {
            C27794g<K, V> c27794g3 = c27794g2.f56567e;
            c27794g2.f56568f = null;
            c27794g2.f56567e = null;
            c27794g2 = c27794g3;
        }
        c27794g.f56568f = c27794g;
        c27794g.f56567e = c27794g;
    }

    /* JADX INFO: renamed from: d */
    public final void m68653d(C27794g<K, V> c27794g, C27794g<K, V> c27794g2) {
        C27794g<K, V> c27794g3 = c27794g.f56564b;
        c27794g.f56564b = null;
        if (c27794g2 != null) {
            c27794g2.f56564b = c27794g3;
        }
        if (c27794g3 == null) {
            int i11 = c27794g.f56570h;
            C27794g<K, V>[] c27794gArr = this.table;
            c27794gArr[i11 & (c27794gArr.length - 1)] = c27794g2;
        } else if (c27794g3.f56565c == c27794g) {
            c27794g3.f56565c = c27794g2;
        } else {
            c27794g3.f56566d = c27794g2;
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m68654e(C27794g<K, V> c27794g) {
        C27794g<K, V> c27794g2 = c27794g.f56565c;
        C27794g<K, V> c27794g3 = c27794g.f56566d;
        C27794g<K, V> c27794g4 = c27794g3.f56565c;
        C27794g<K, V> c27794g5 = c27794g3.f56566d;
        c27794g.f56566d = c27794g4;
        if (c27794g4 != null) {
            c27794g4.f56564b = c27794g;
        }
        m68653d(c27794g, c27794g3);
        c27794g3.f56565c = c27794g;
        c27794g.f56564b = c27794g3;
        int iMax = Math.max(c27794g2 != null ? c27794g2.f56572j : 0, c27794g4 != null ? c27794g4.f56572j : 0) + 1;
        c27794g.f56572j = iMax;
        c27794g3.f56572j = Math.max(iMax, c27794g5 != null ? c27794g5.f56572j : 0) + 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        LinkedHashTreeMap<K, V>.C27791d c27791d = this.entrySet;
        if (c27791d != null) {
            return c27791d;
        }
        LinkedHashTreeMap<K, V>.C27791d c27791d2 = new C27791d();
        this.entrySet = c27791d2;
        return c27791d2;
    }

    /* JADX INFO: renamed from: f */
    public final void m68655f(C27794g<K, V> c27794g) {
        C27794g<K, V> c27794g2 = c27794g.f56565c;
        C27794g<K, V> c27794g3 = c27794g.f56566d;
        C27794g<K, V> c27794g4 = c27794g2.f56565c;
        C27794g<K, V> c27794g5 = c27794g2.f56566d;
        c27794g.f56565c = c27794g5;
        if (c27794g5 != null) {
            c27794g5.f56564b = c27794g;
        }
        m68653d(c27794g, c27794g2);
        c27794g2.f56566d = c27794g;
        c27794g.f56564b = c27794g2;
        int iMax = Math.max(c27794g3 != null ? c27794g3.f56572j : 0, c27794g5 != null ? c27794g5.f56572j : 0) + 1;
        c27794g.f56572j = iMax;
        c27794g2.f56572j = Math.max(iMax, c27794g4 != null ? c27794g4.f56572j : 0) + 1;
    }

    public C27794g<K, V> find(K k11, boolean z11) {
        int iCompareTo;
        C27794g<K, V> c27794g;
        Comparator<? super K> comparator = this.comparator;
        C27794g<K, V>[] c27794gArr = this.table;
        int iM68649g = m68649g(k11.hashCode());
        int length = (c27794gArr.length - 1) & iM68649g;
        C27794g<K, V> c27794g2 = c27794gArr[length];
        if (c27794g2 != null) {
            Comparable comparable = comparator == f56550b ? (Comparable) k11 : null;
            while (true) {
                iCompareTo = comparable != null ? comparable.compareTo(c27794g2.f56569g) : comparator.compare(k11, c27794g2.f56569g);
                if (iCompareTo == 0) {
                    return c27794g2;
                }
                C27794g<K, V> c27794g3 = iCompareTo < 0 ? c27794g2.f56565c : c27794g2.f56566d;
                if (c27794g3 == null) {
                    break;
                }
                c27794g2 = c27794g3;
            }
        } else {
            iCompareTo = 0;
        }
        int i11 = iCompareTo;
        if (!z11) {
            return null;
        }
        C27794g<K, V> c27794g4 = this.header;
        if (c27794g2 != null) {
            C27794g<K, V> c27794g5 = c27794g2;
            c27794g = new C27794g<>(c27794g5, k11, iM68649g, c27794g4, c27794g4.f56568f);
            if (i11 < 0) {
                c27794g5.f56565c = c27794g;
            } else {
                c27794g5.f56566d = c27794g;
            }
            m68652c(c27794g5, true);
        } else {
            if (comparator == f56550b && !(k11 instanceof Comparable)) {
                throw new ClassCastException(k11.getClass().getName() + " is not Comparable");
            }
            c27794g = new C27794g<>(c27794g2, k11, iM68649g, c27794g4, c27794g4.f56568f);
            c27794gArr[length] = c27794g;
        }
        int i12 = this.size;
        this.size = i12 + 1;
        if (i12 > this.threshold) {
            m68650a();
        }
        this.modCount++;
        return c27794g;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<K> keySet() {
        LinkedHashTreeMap<K, V>.C27792e c27792e = this.keySet;
        if (c27792e != null) {
            return c27792e;
        }
        LinkedHashTreeMap<K, V>.C27792e c27792e2 = new C27792e();
        this.keySet = c27792e2;
        return c27792e2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V put(K k11, V v11) {
        if (k11 == null) {
            throw new NullPointerException("key == null");
        }
        C27794g<K, V> c27794gFind = find(k11, true);
        V v12 = c27794gFind.f56571i;
        c27794gFind.f56571i = v11;
        return v12;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.size;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        if (findByObject(obj) != null) {
            return true;
        }
        return false;
    }

    public C27794g<K, V> findByEntry(Map.Entry<?, ?> entry) {
        C27794g<K, V> c27794gFindByObject = findByObject(entry.getKey());
        if (c27794gFindByObject != null && m68651b(c27794gFindByObject.f56571i, entry.getValue())) {
            return c27794gFindByObject;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        C27794g<K, V> c27794gFindByObject = findByObject(obj);
        if (c27794gFindByObject != null) {
            return c27794gFindByObject.f56571i;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        C27794g<K, V> c27794gRemoveInternalByKey = removeInternalByKey(obj);
        if (c27794gRemoveInternalByKey != null) {
            return c27794gRemoveInternalByKey.f56571i;
        }
        return null;
    }

    public C27794g<K, V> removeInternalByKey(Object obj) {
        C27794g<K, V> c27794gFindByObject = findByObject(obj);
        if (c27794gFindByObject != null) {
            removeInternal(c27794gFindByObject, true);
        }
        return c27794gFindByObject;
    }
}
