package org.jsoup.nodes;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import nh0.C42841b;
import oh0.C43092b;
import oh0.C43093c;
import org.jsoup.SerializationException;
import org.jsoup.parser.C43298d;

/* JADX INFO: renamed from: org.jsoup.nodes.b */
/* JADX INFO: compiled from: Attributes.java */
/* JADX INFO: loaded from: classes61.dex */
public class C43184b implements Iterable<C43183a>, Cloneable {

    /* JADX INFO: renamed from: e */
    public static final String[] f95379e = new String[0];

    /* JADX INFO: renamed from: b */
    public int f95380b = 0;

    /* JADX INFO: renamed from: c */
    public String[] f95381c;

    /* JADX INFO: renamed from: d */
    public String[] f95382d;

    /* JADX INFO: renamed from: org.jsoup.nodes.b$a */
    /* JADX INFO: compiled from: Attributes.java */
    public class a implements Iterator<C43183a> {

        /* JADX INFO: renamed from: b */
        public int f95383b = 0;

        public a() {
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public C43183a next() {
            C43184b c43184b = C43184b.this;
            String[] strArr = c43184b.f95381c;
            int i11 = this.f95383b;
            C43183a c43183a = new C43183a(strArr[i11], c43184b.f95382d[i11], c43184b);
            this.f95383b++;
            return c43183a;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            while (this.f95383b < C43184b.this.f95380b) {
                C43184b c43184b = C43184b.this;
                if (!c43184b.m94932D(c43184b.f95381c[this.f95383b])) {
                    break;
                }
                this.f95383b++;
            }
            return this.f95383b < C43184b.this.f95380b;
        }

        @Override // java.util.Iterator
        public void remove() {
            C43184b c43184b = C43184b.this;
            int i11 = this.f95383b - 1;
            this.f95383b = i11;
            c43184b.m94937K(i11);
        }
    }

    /* JADX INFO: renamed from: D */
    public final boolean m94932D(String str) {
        return str != null && str.length() > 1 && str.charAt(0) == '/';
    }

    /* JADX INFO: renamed from: F */
    public void m94933F() {
        for (int i11 = 0; i11 < this.f95380b; i11++) {
            String[] strArr = this.f95381c;
            strArr[i11] = C43092b.m94679a(strArr[i11]);
        }
    }

    public int size() {
        int i11 = 0;
        for (int i12 = 0; i12 < this.f95380b; i12++) {
            if (!m94932D(this.f95381c[i12])) {
                i11++;
            }
        }
        return i11;
    }

    /* JADX INFO: renamed from: B */
    public static String m94925B(String str) {
        return '/' + str;
    }

    /* JADX INFO: renamed from: h */
    public static String m94929h(String str) {
        return str == null ? "" : str;
    }

    /* JADX INFO: renamed from: j */
    public static String[] m94930j(String[] strArr, int i11) {
        String[] strArr2 = new String[i11];
        System.arraycopy(strArr, 0, strArr2, 0, Math.min(strArr.length, i11));
        return strArr2;
    }

    /* JADX INFO: renamed from: K */
    public final void m94937K(int i11) {
        C42841b.m93950b(i11 >= this.f95380b);
        int i12 = (this.f95380b - i11) - 1;
        if (i12 > 0) {
            String[] strArr = this.f95381c;
            int i13 = i11 + 1;
            System.arraycopy(strArr, i13, strArr, i11, i12);
            String[] strArr2 = this.f95382d;
            System.arraycopy(strArr2, i13, strArr2, i11, i12);
        }
        int i14 = this.f95380b - 1;
        this.f95380b = i14;
        this.f95381c[i14] = null;
        this.f95382d[i14] = null;
    }

    /* JADX INFO: renamed from: d */
    public C43184b m94940d(String str, String str2) {
        m94943g(this.f95380b + 1);
        String[] strArr = this.f95381c;
        int i11 = this.f95380b;
        strArr[i11] = str;
        this.f95382d[i11] = str2;
        this.f95380b = i11 + 1;
        return this;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C43184b c43184b = (C43184b) obj;
        if (this.f95380b == c43184b.f95380b && Arrays.equals(this.f95381c, c43184b.f95381c)) {
            return Arrays.equals(this.f95382d, c43184b.f95382d);
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public List<C43183a> m94942f() {
        ArrayList arrayList = new ArrayList(this.f95380b);
        for (int i11 = 0; i11 < this.f95380b; i11++) {
            if (!m94932D(this.f95381c[i11])) {
                arrayList.add(new C43183a(this.f95381c[i11], this.f95382d[i11], this));
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    /* JADX INFO: renamed from: g */
    public final void m94943g(int i11) {
        C42841b.m93951c(i11 >= this.f95380b);
        String[] strArr = this.f95381c;
        int length = strArr.length;
        if (length >= i11) {
            return;
        }
        int i12 = length >= 2 ? 2 * this.f95380b : 2;
        if (i11 <= i12) {
            i11 = i12;
        }
        this.f95381c = m94930j(strArr, i11);
        this.f95382d = m94930j(this.f95382d, i11);
    }

    public int hashCode() {
        return (((this.f95380b * 31) + Arrays.hashCode(this.f95381c)) * 31) + Arrays.hashCode(this.f95382d);
    }

    public boolean isEmpty() {
        return this.f95380b == 0;
    }

    @Override // java.lang.Iterable
    public Iterator<C43183a> iterator() {
        return new a();
    }

    /* JADX WARN: Code duplicated, block: B:6:0x000f  */
    /* JADX INFO: renamed from: t */
    public final void m94951t(Appendable appendable, Document.OutputSettings outputSettings) throws IOException {
        Appendable appendable2;
        Document.OutputSettings outputSettings2;
        int i11 = this.f95380b;
        int i12 = 0;
        while (i12 < i11) {
            if (m94932D(this.f95381c[i12])) {
                appendable2 = appendable;
                outputSettings2 = outputSettings;
            } else {
                String str = this.f95381c[i12];
                String str2 = this.f95382d[i12];
                appendable.append(' ').append(str);
                if (C43183a.m94918i(str, str2, outputSettings)) {
                    appendable2 = appendable;
                    outputSettings2 = outputSettings;
                } else {
                    appendable.append("=\"");
                    if (str2 == null) {
                        str2 = "";
                    }
                    appendable2 = appendable;
                    outputSettings2 = outputSettings;
                    Entities.m94912e(appendable2, str2, outputSettings2, true, false, false);
                    appendable2.append('\"');
                }
            }
            i12++;
            appendable = appendable2;
            outputSettings = outputSettings2;
        }
    }

    public C43184b() {
        String[] strArr = f95379e;
        this.f95381c = strArr;
        this.f95382d = strArr;
    }

    /* JADX INFO: renamed from: A */
    public final int m94931A(String str) {
        C42841b.m93957i(str);
        for (int i11 = 0; i11 < this.f95380b; i11++) {
            if (str.equalsIgnoreCase(this.f95381c[i11])) {
                return i11;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: G */
    public C43184b m94934G(String str, String str2) {
        C42841b.m93957i(str);
        int iM94952y = m94952y(str);
        if (iM94952y != -1) {
            this.f95382d[iM94952y] = str2;
            return this;
        }
        m94940d(str, str2);
        return this;
    }

    /* JADX INFO: renamed from: H */
    public C43184b m94935H(C43183a c43183a) {
        C42841b.m93957i(c43183a);
        m94934G(c43183a.getKey(), c43183a.getValue());
        c43183a.f95378d = this;
        return this;
    }

    /* JADX INFO: renamed from: I */
    public void m94936I(String str, String str2) {
        int iM94931A = m94931A(str);
        if (iM94931A != -1) {
            this.f95382d[iM94931A] = str2;
            if (!this.f95381c[iM94931A].equals(str)) {
                this.f95381c[iM94931A] = str;
                return;
            }
            return;
        }
        m94940d(str, str2);
    }

    /* JADX INFO: renamed from: N */
    public void m94938N(String str) {
        int iM94952y = m94952y(str);
        if (iM94952y != -1) {
            m94937K(iM94952y);
        }
    }

    /* JADX INFO: renamed from: O */
    public void m94939O(String str) {
        int iM94931A = m94931A(str);
        if (iM94931A != -1) {
            m94937K(iM94931A);
        }
    }

    /* JADX INFO: renamed from: e */
    public void m94941e(C43184b c43184b) {
        if (c43184b.size() != 0) {
            m94943g(this.f95380b + c43184b.f95380b);
            Iterator<C43183a> it = c43184b.iterator();
            while (it.hasNext()) {
                m94935H(it.next());
            }
        }
    }

    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public C43184b clone() {
        try {
            C43184b c43184b = (C43184b) super.clone();
            c43184b.f95380b = this.f95380b;
            this.f95381c = m94930j(this.f95381c, this.f95380b);
            this.f95382d = m94930j(this.f95382d, this.f95380b);
            return c43184b;
        } catch (CloneNotSupportedException e11) {
            throw new RuntimeException(e11);
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0037  */
    /* JADX INFO: renamed from: k */
    public int m94945k(C43298d c43298d) {
        String str;
        int i11 = 0;
        if (isEmpty()) {
            return 0;
        }
        boolean zM95187d = c43298d.m95187d();
        int i12 = 0;
        while (i11 < this.f95381c.length) {
            int i13 = i11 + 1;
            int i14 = i13;
            while (true) {
                String[] strArr = this.f95381c;
                if (i14 >= strArr.length || (str = strArr[i14]) == null) {
                    break;
                }
                if (!zM95187d || !strArr[i11].equals(str)) {
                    if (!zM95187d) {
                        String[] strArr2 = this.f95381c;
                        if (strArr2[i11].equalsIgnoreCase(strArr2[i14])) {
                            i12++;
                            m94937K(i14);
                            i14--;
                        }
                    }
                } else {
                    i12++;
                    m94937K(i14);
                    i14--;
                }
                i14++;
            }
            i11 = i13;
        }
        return i12;
    }

    /* JADX INFO: renamed from: l */
    public String m94946l(String str) {
        int iM94952y = m94952y(str);
        if (iM94952y == -1) {
            return "";
        }
        return m94929h(this.f95382d[iM94952y]);
    }

    /* JADX INFO: renamed from: m */
    public String m94947m(String str) {
        int iM94931A = m94931A(str);
        if (iM94931A == -1) {
            return "";
        }
        return m94929h(this.f95382d[iM94931A]);
    }

    /* JADX INFO: renamed from: n */
    public boolean m94948n(String str) {
        if (m94952y(str) != -1) {
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: r */
    public boolean m94949r(String str) {
        if (m94931A(str) != -1) {
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: s */
    public String m94950s() {
        StringBuilder sbM94683b = C43093c.m94683b();
        try {
            m94951t(sbM94683b, new Document("").m94813s1());
            return C43093c.m94694m(sbM94683b);
        } catch (IOException e11) {
            throw new SerializationException(e11);
        }
    }

    public String toString() {
        return m94950s();
    }

    /* JADX INFO: renamed from: y */
    public int m94952y(String str) {
        C42841b.m93957i(str);
        for (int i11 = 0; i11 < this.f95380b; i11++) {
            if (str.equals(this.f95381c[i11])) {
                return i11;
            }
        }
        return -1;
    }
}
