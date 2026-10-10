package bf0;

import com.tencent.bugly.proguard.C33627eb;
import java.util.Arrays;

/* JADX INFO: renamed from: bf0.c */
/* JADX INFO: compiled from: PersistentHashArrayMappedTrie.java */
/* JADX INFO: loaded from: classes60.dex */
public final class C4588c<K, V> {

    /* JADX INFO: renamed from: a */
    public final d<K, V> f4086a;

    /* JADX INFO: renamed from: bf0.c$a */
    /* JADX INFO: compiled from: PersistentHashArrayMappedTrie.java */
    public static final class a<K, V> implements d<K, V> {

        /* JADX INFO: renamed from: a */
        public final K[] f4087a;

        /* JADX INFO: renamed from: b */
        public final V[] f4088b;

        public a(K k11, V v11, K k12, V v12) {
            this(new Object[]{k11, k12}, new Object[]{v11, v12});
        }

        @Override // bf0.C4588c.d
        /* JADX INFO: renamed from: a */
        public V mo4476a(K k11, int i11, int i12) {
            int i13 = 0;
            while (true) {
                K[] kArr = this.f4087a;
                if (i13 >= kArr.length) {
                    return null;
                }
                if (kArr[i13] == k11) {
                    return this.f4088b[i13];
                }
                i13++;
            }
        }

        /* JADX INFO: renamed from: c */
        public final int m4478c(K k11) {
            int i11 = 0;
            while (true) {
                K[] kArr = this.f4087a;
                if (i11 >= kArr.length) {
                    return -1;
                }
                if (kArr[i11] == k11) {
                    return i11;
                }
                i11++;
            }
        }

        public a(K[] kArr, V[] vArr) {
            this.f4087a = kArr;
            this.f4088b = vArr;
        }

        @Override // bf0.C4588c.d
        /* JADX INFO: renamed from: b */
        public d<K, V> mo4477b(K k11, V v11, int i11, int i12) {
            int iHashCode = this.f4087a[0].hashCode();
            if (iHashCode != i11) {
                return b.m4479c(new c(k11, v11), i11, this, iHashCode, i12);
            }
            int iM4478c = m4478c(k11);
            if (iM4478c != -1) {
                K[] kArr = this.f4087a;
                Object[] objArrCopyOf = Arrays.copyOf(kArr, kArr.length);
                Object[] objArrCopyOf2 = Arrays.copyOf(this.f4088b, this.f4087a.length);
                objArrCopyOf[iM4478c] = k11;
                objArrCopyOf2[iM4478c] = v11;
                return new a(objArrCopyOf, objArrCopyOf2);
            }
            K[] kArr2 = this.f4087a;
            Object[] objArrCopyOf3 = Arrays.copyOf(kArr2, kArr2.length + 1);
            Object[] objArrCopyOf4 = Arrays.copyOf(this.f4088b, this.f4087a.length + 1);
            K[] kArr3 = this.f4087a;
            objArrCopyOf3[kArr3.length] = k11;
            objArrCopyOf4[kArr3.length] = v11;
            return new a(objArrCopyOf3, objArrCopyOf4);
        }

        @Override // bf0.C4588c.d
        public int size() {
            return this.f4088b.length;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("CollisionLeaf(");
            for (int i11 = 0; i11 < this.f4088b.length; i11++) {
                sb2.append("(key=");
                sb2.append(this.f4087a[i11]);
                sb2.append(" value=");
                sb2.append(this.f4088b[i11]);
                sb2.append(") ");
            }
            sb2.append(")");
            return sb2.toString();
        }
    }

    /* JADX INFO: renamed from: bf0.c$b */
    /* JADX INFO: compiled from: PersistentHashArrayMappedTrie.java */
    public static final class b<K, V> implements d<K, V> {

        /* JADX INFO: renamed from: a */
        public final int f4089a;

        /* JADX INFO: renamed from: b */
        public final d<K, V>[] f4090b;

        /* JADX INFO: renamed from: c */
        public final int f4091c;

        /* JADX INFO: renamed from: c */
        public static <K, V> d<K, V> m4479c(d<K, V> dVar, int i11, d<K, V> dVar2, int i12, int i13) {
            int iM4480e = m4480e(i11, i13);
            int iM4480e2 = m4480e(i12, i13);
            if (iM4480e == iM4480e2) {
                d dVarM4479c = m4479c(dVar, i11, dVar2, i12, i13 + 5);
                return new b(iM4480e, new d[]{dVarM4479c}, dVarM4479c.size());
            }
            if (m4481f(i11, i13) > m4481f(i12, i13)) {
                dVar2 = dVar;
                dVar = dVar2;
            }
            return new b(iM4480e | iM4480e2, new d[]{dVar, dVar2}, dVar.size() + dVar2.size());
        }

        /* JADX INFO: renamed from: f */
        public static int m4481f(int i11, int i12) {
            return (i11 >>> i12) & 31;
        }

        /* JADX INFO: renamed from: d */
        public final int m4482d(int i11) {
            return Integer.bitCount((i11 - 1) & this.f4089a);
        }

        @Override // bf0.C4588c.d
        public int size() {
            return this.f4091c;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("CompressedIndex(");
            sb2.append(String.format("bitmap=%s ", Integer.toBinaryString(this.f4089a)));
            for (d<K, V> dVar : this.f4090b) {
                sb2.append(dVar);
                sb2.append(C33627eb.f69716f);
            }
            sb2.append(")");
            return sb2.toString();
        }

        public b(int i11, d<K, V>[] dVarArr, int i12) {
            this.f4089a = i11;
            this.f4090b = dVarArr;
            this.f4091c = i12;
        }

        /* JADX INFO: renamed from: e */
        public static int m4480e(int i11, int i12) {
            return 1 << m4481f(i11, i12);
        }

        @Override // bf0.C4588c.d
        /* JADX INFO: renamed from: a */
        public V mo4476a(K k11, int i11, int i12) {
            int iM4480e = m4480e(i11, i12);
            if ((this.f4089a & iM4480e) == 0) {
                return null;
            }
            return this.f4090b[m4482d(iM4480e)].mo4476a(k11, i11, i12 + 5);
        }

        @Override // bf0.C4588c.d
        /* JADX INFO: renamed from: b */
        public d<K, V> mo4477b(K k11, V v11, int i11, int i12) {
            int iM4480e = m4480e(i11, i12);
            int iM4482d = m4482d(iM4480e);
            int i13 = this.f4089a;
            if ((i13 & iM4480e) == 0) {
                int i14 = i13 | iM4480e;
                d<K, V>[] dVarArr = this.f4090b;
                d[] dVarArr2 = new d[dVarArr.length + 1];
                System.arraycopy(dVarArr, 0, dVarArr2, 0, iM4482d);
                dVarArr2[iM4482d] = new c(k11, v11);
                d<K, V>[] dVarArr3 = this.f4090b;
                System.arraycopy(dVarArr3, iM4482d, dVarArr2, iM4482d + 1, dVarArr3.length - iM4482d);
                return new b(i14, dVarArr2, size() + 1);
            }
            d<K, V>[] dVarArr4 = this.f4090b;
            d[] dVarArr5 = (d[]) Arrays.copyOf(dVarArr4, dVarArr4.length);
            dVarArr5[iM4482d] = this.f4090b[iM4482d].mo4477b(k11, v11, i11, i12 + 5);
            return new b(this.f4089a, dVarArr5, (size() + dVarArr5[iM4482d].size()) - this.f4090b[iM4482d].size());
        }
    }

    /* JADX INFO: renamed from: bf0.c$c */
    /* JADX INFO: compiled from: PersistentHashArrayMappedTrie.java */
    public static final class c<K, V> implements d<K, V> {

        /* JADX INFO: renamed from: a */
        public final K f4092a;

        /* JADX INFO: renamed from: b */
        public final V f4093b;

        @Override // bf0.C4588c.d
        public int size() {
            return 1;
        }

        @Override // bf0.C4588c.d
        /* JADX INFO: renamed from: a */
        public V mo4476a(K k11, int i11, int i12) {
            if (this.f4092a == k11) {
                return this.f4093b;
            }
            return null;
        }

        @Override // bf0.C4588c.d
        /* JADX INFO: renamed from: b */
        public d<K, V> mo4477b(K k11, V v11, int i11, int i12) {
            int iHashCode = this.f4092a.hashCode();
            if (iHashCode != i11) {
                return b.m4479c(new c(k11, v11), i11, this, iHashCode, i12);
            }
            return this.f4092a == k11 ? new c(k11, v11) : new a(this.f4092a, this.f4093b, k11, v11);
        }

        public String toString() {
            return String.format("Leaf(key=%s value=%s)", this.f4092a, this.f4093b);
        }

        public c(K k11, V v11) {
            this.f4092a = k11;
            this.f4093b = v11;
        }
    }

    /* JADX INFO: renamed from: bf0.c$d */
    /* JADX INFO: compiled from: PersistentHashArrayMappedTrie.java */
    public interface d<K, V> {
        /* JADX INFO: renamed from: a */
        V mo4476a(K k11, int i11, int i12);

        /* JADX INFO: renamed from: b */
        d<K, V> mo4477b(K k11, V v11, int i11, int i12);

        int size();
    }

    public C4588c() {
        this(null);
    }

    public C4588c(d<K, V> dVar) {
        this.f4086a = dVar;
    }

    /* JADX INFO: renamed from: a */
    public V m4474a(K k11) {
        d<K, V> dVar = this.f4086a;
        if (dVar == null) {
            return null;
        }
        return dVar.mo4476a(k11, k11.hashCode(), 0);
    }

    /* JADX INFO: renamed from: b */
    public C4588c<K, V> m4475b(K k11, V v11) {
        d<K, V> dVar = this.f4086a;
        return dVar == null ? new C4588c<>(new c(k11, v11)) : new C4588c<>(dVar.mo4477b(k11, v11, k11.hashCode(), 0));
    }
}
