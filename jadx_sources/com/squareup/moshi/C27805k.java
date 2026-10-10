package com.squareup.moshi;

import androidx.credentials.provider.CredentialEntry;
import com.tencent.bugly.proguard.C33844oi;
import java.io.IOException;
import okio.BufferedSink;

/* JADX INFO: renamed from: com.squareup.moshi.k */
/* JADX INFO: compiled from: JsonUtf8Writer.java */
/* JADX INFO: loaded from: classes59.dex */
public final class C27805k extends AbstractC27807m {

    /* JADX INFO: renamed from: n */
    public static final String[] f56612n = new String[128];

    /* JADX INFO: renamed from: k */
    public final BufferedSink f56613k;

    /* JADX INFO: renamed from: l */
    public String f56614l = C33844oi.f71346o;

    /* JADX INFO: renamed from: m */
    public String f56615m;

    @Override // com.squareup.moshi.AbstractC27807m
    /* JADX INFO: renamed from: h */
    public AbstractC27807m mo68715h() throws IOException {
        return m68709O(1, 2, ']');
    }

    @Override // com.squareup.moshi.AbstractC27807m
    /* JADX INFO: renamed from: i */
    public AbstractC27807m mo68716i() throws IOException {
        this.f56625i = false;
        return m68709O(3, 5, '}');
    }

    static {
        for (int i11 = 0; i11 <= 31; i11++) {
            f56612n[i11] = String.format("\\u%04x", Integer.valueOf(i11));
        }
        String[] strArr = f56612n;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
    }

    /* JADX WARN: Code duplicated, block: B:16:0x002b  */
    /* JADX INFO: renamed from: R */
    public static void m68703R(BufferedSink bufferedSink, String str) throws IOException {
        String str2;
        String[] strArr = f56612n;
        bufferedSink.writeByte(34);
        int length = str.length();
        int i11 = 0;
        for (int i12 = 0; i12 < length; i12++) {
            char cCharAt = str.charAt(i12);
            if (cCharAt < 128) {
                str2 = strArr[cCharAt];
                if (str2 != null) {
                    if (i11 < i12) {
                        bufferedSink.writeUtf8(str, i11, i12);
                    }
                    bufferedSink.writeUtf8(str2);
                    i11 = i12 + 1;
                }
            } else {
                if (cCharAt == 8232) {
                    str2 = "\\u2028";
                } else if (cCharAt == 8233) {
                    str2 = "\\u2029";
                }
                if (i11 < i12) {
                    bufferedSink.writeUtf8(str, i11, i12);
                }
                bufferedSink.writeUtf8(str2);
                i11 = i12 + 1;
            }
        }
        if (i11 < length) {
            bufferedSink.writeUtf8(str, i11, length);
        }
        bufferedSink.writeByte(34);
    }

    @Override // com.squareup.moshi.AbstractC27807m
    /* JADX INFO: renamed from: C */
    public AbstractC27807m mo68704C(Number number) throws IOException {
        if (number == null) {
            return mo68718m();
        }
        String string = number.toString();
        if (!this.f56623g && (string.equals("-Infinity") || string.equals("Infinity") || string.equals("NaN"))) {
            throw new IllegalArgumentException("Numeric values must be finite, but was " + number);
        }
        if (this.f56625i) {
            this.f56625i = false;
            return mo68717l(string);
        }
        m68712S();
        m68708M();
        this.f56613k.writeUtf8(string);
        int[] iArr = this.f56621e;
        int i11 = this.f56618b - 1;
        iArr[i11] = iArr[i11] + 1;
        return this;
    }

    @Override // com.squareup.moshi.AbstractC27807m
    /* JADX INFO: renamed from: E */
    public AbstractC27807m mo68705E(String str) throws IOException {
        if (str == null) {
            return mo68718m();
        }
        if (this.f56625i) {
            this.f56625i = false;
            return mo68717l(str);
        }
        m68712S();
        m68708M();
        m68703R(this.f56613k, str);
        int[] iArr = this.f56621e;
        int i11 = this.f56618b - 1;
        iArr[i11] = iArr[i11] + 1;
        return this;
    }

    @Override // com.squareup.moshi.AbstractC27807m
    /* JADX INFO: renamed from: J */
    public AbstractC27807m mo68706J(boolean z11) throws IOException {
        if (this.f56625i) {
            throw new IllegalStateException("Boolean cannot be used as a map key in JSON at path " + getPath());
        }
        m68712S();
        m68708M();
        this.f56613k.writeUtf8(z11 ? CredentialEntry.TRUE_STRING : CredentialEntry.FALSE_STRING);
        int[] iArr = this.f56621e;
        int i11 = this.f56618b - 1;
        iArr[i11] = iArr[i11] + 1;
        return this;
    }

    /* JADX INFO: renamed from: P */
    public final void m68710P() throws IOException {
        if (this.f56622f == null) {
            return;
        }
        this.f56613k.writeByte(10);
        int i11 = this.f56618b;
        for (int i12 = 1; i12 < i11; i12++) {
            this.f56613k.writeUtf8(this.f56622f);
        }
    }

    /* JADX INFO: renamed from: Q */
    public final AbstractC27807m m68711Q(int i11, int i12, char c11) throws IOException {
        int i13 = this.f56618b;
        int i14 = this.f56626j;
        if (i13 == i14) {
            int[] iArr = this.f56619c;
            if (iArr[i13 - 1] == i11 || iArr[i13 - 1] == i12) {
                this.f56626j = ~i14;
                return this;
            }
        }
        m68708M();
        m68723g();
        m68728q(i11);
        this.f56621e[this.f56618b - 1] = 0;
        this.f56613k.writeByte(c11);
        return this;
    }

    /* JADX INFO: renamed from: S */
    public final void m68712S() throws IOException {
        if (this.f56615m != null) {
            m68707L();
            m68703R(this.f56613k, this.f56615m);
            this.f56615m = null;
        }
    }

    @Override // com.squareup.moshi.AbstractC27807m
    /* JADX INFO: renamed from: a */
    public AbstractC27807m mo68713a() throws IOException {
        if (!this.f56625i) {
            m68712S();
            return m68711Q(1, 2, '[');
        }
        throw new IllegalStateException("Array cannot be used as a map key in JSON at path " + getPath());
    }

    @Override // com.squareup.moshi.AbstractC27807m
    /* JADX INFO: renamed from: b */
    public AbstractC27807m mo68714b() throws IOException {
        if (!this.f56625i) {
            m68712S();
            return m68711Q(3, 5, '{');
        }
        throw new IllegalStateException("Object cannot be used as a map key in JSON at path " + getPath());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f56613k.close();
        int i11 = this.f56618b;
        if (i11 > 1 || (i11 == 1 && this.f56619c[i11 - 1] != 7)) {
            throw new IOException("Incomplete document");
        }
        this.f56618b = 0;
    }

    @Override // java.io.Flushable
    public void flush() throws IOException {
        if (this.f56618b == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        this.f56613k.flush();
    }

    @Override // com.squareup.moshi.AbstractC27807m
    /* JADX INFO: renamed from: l */
    public AbstractC27807m mo68717l(String str) throws IOException {
        if (str == null) {
            throw new NullPointerException("name == null");
        }
        if (this.f56618b == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        int iM68726o = m68726o();
        if ((iM68726o != 3 && iM68726o != 5) || this.f56615m != null || this.f56625i) {
            throw new IllegalStateException("Nesting problem.");
        }
        this.f56615m = str;
        this.f56620d[this.f56618b - 1] = str;
        return this;
    }

    @Override // com.squareup.moshi.AbstractC27807m
    /* JADX INFO: renamed from: m */
    public AbstractC27807m mo68718m() throws IOException {
        if (this.f56625i) {
            throw new IllegalStateException("null cannot be used as a map key in JSON at path " + getPath());
        }
        if (this.f56615m != null) {
            if (!this.f56624h) {
                this.f56615m = null;
                return this;
            }
            m68712S();
        }
        m68708M();
        this.f56613k.writeUtf8("null");
        int[] iArr = this.f56621e;
        int i11 = this.f56618b - 1;
        iArr[i11] = iArr[i11] + 1;
        return this;
    }

    @Override // com.squareup.moshi.AbstractC27807m
    /* JADX INFO: renamed from: x */
    public AbstractC27807m mo68719x(double d11) throws IOException {
        if (!this.f56623g && (Double.isNaN(d11) || Double.isInfinite(d11))) {
            throw new IllegalArgumentException("Numeric values must be finite, but was " + d11);
        }
        if (this.f56625i) {
            this.f56625i = false;
            return mo68717l(Double.toString(d11));
        }
        m68712S();
        m68708M();
        this.f56613k.writeUtf8(Double.toString(d11));
        int[] iArr = this.f56621e;
        int i11 = this.f56618b - 1;
        iArr[i11] = iArr[i11] + 1;
        return this;
    }

    @Override // com.squareup.moshi.AbstractC27807m
    /* JADX INFO: renamed from: z */
    public AbstractC27807m mo68720z(long j11) throws IOException {
        if (this.f56625i) {
            this.f56625i = false;
            return mo68717l(Long.toString(j11));
        }
        m68712S();
        m68708M();
        this.f56613k.writeUtf8(Long.toString(j11));
        int[] iArr = this.f56621e;
        int i11 = this.f56618b - 1;
        iArr[i11] = iArr[i11] + 1;
        return this;
    }

    public C27805k(BufferedSink bufferedSink) {
        if (bufferedSink != null) {
            this.f56613k = bufferedSink;
            m68728q(6);
            return;
        }
        throw new NullPointerException("sink == null");
    }

    /* JADX INFO: renamed from: L */
    public final void m68707L() throws IOException {
        int iM68726o = m68726o();
        if (iM68726o == 5) {
            this.f56613k.writeByte(44);
        } else if (iM68726o != 3) {
            throw new IllegalStateException("Nesting problem.");
        }
        m68710P();
        m68729u(4);
    }

    /* JADX INFO: renamed from: M */
    public final void m68708M() throws IOException {
        int iM68726o = m68726o();
        int i11 = 2;
        if (iM68726o != 1) {
            if (iM68726o != 2) {
                if (iM68726o != 4) {
                    if (iM68726o != 9) {
                        i11 = 7;
                        if (iM68726o != 6) {
                            if (iM68726o == 7) {
                                if (!this.f56623g) {
                                    throw new IllegalStateException("JSON must have only one top-level value.");
                                }
                            } else {
                                throw new IllegalStateException("Nesting problem.");
                            }
                        }
                    } else {
                        throw new IllegalStateException("Sink from valueSink() was not closed");
                    }
                } else {
                    this.f56613k.writeUtf8(this.f56614l);
                    i11 = 5;
                }
            } else {
                this.f56613k.writeByte(44);
                m68710P();
            }
        } else {
            m68710P();
        }
        m68729u(i11);
    }

    /* JADX INFO: renamed from: O */
    public final AbstractC27807m m68709O(int i11, int i12, char c11) throws IOException {
        int iM68726o = m68726o();
        if (iM68726o != i12 && iM68726o != i11) {
            throw new IllegalStateException("Nesting problem.");
        }
        if (this.f56615m == null) {
            int i13 = this.f56618b;
            int i14 = this.f56626j;
            if (i13 == (~i14)) {
                this.f56626j = ~i14;
                return this;
            }
            int i15 = i13 - 1;
            this.f56618b = i15;
            this.f56620d[i15] = null;
            int[] iArr = this.f56621e;
            int i16 = i13 - 2;
            iArr[i16] = iArr[i16] + 1;
            if (iM68726o == i12) {
                m68710P();
            }
            this.f56613k.writeByte(c11);
            return this;
        }
        throw new IllegalStateException("Dangling name: " + this.f56615m);
    }
}
