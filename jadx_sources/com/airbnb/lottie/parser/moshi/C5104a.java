package com.airbnb.lottie.parser.moshi;

import androidx.annotation.Nullable;
import androidx.credentials.provider.CredentialEntry;
import java.io.EOFException;
import java.io.IOException;
import okio.Buffer;
import okio.BufferedSource;
import okio.ByteString;

/* JADX INFO: renamed from: com.airbnb.lottie.parser.moshi.a */
/* JADX INFO: compiled from: JsonUtf8Reader.java */
/* JADX INFO: loaded from: classes.dex */
public final class C5104a extends JsonReader {

    /* JADX INFO: renamed from: o */
    public static final ByteString f6196o = ByteString.encodeUtf8("'\\");

    /* JADX INFO: renamed from: p */
    public static final ByteString f6197p = ByteString.encodeUtf8("\"\\");

    /* JADX INFO: renamed from: q */
    public static final ByteString f6198q = ByteString.encodeUtf8("{}[]:, \n\t\r\f/\\;#=");

    /* JADX INFO: renamed from: r */
    public static final ByteString f6199r = ByteString.encodeUtf8("\n\r");

    /* JADX INFO: renamed from: s */
    public static final ByteString f6200s = ByteString.encodeUtf8("*/");

    /* JADX INFO: renamed from: i */
    public final BufferedSource f6201i;

    /* JADX INFO: renamed from: j */
    public final Buffer f6202j;

    /* JADX INFO: renamed from: k */
    public int f6203k = 0;

    /* JADX INFO: renamed from: l */
    public long f6204l;

    /* JADX INFO: renamed from: m */
    public int f6205m;

    /* JADX INFO: renamed from: n */
    @Nullable
    public String f6206n;

    /* JADX INFO: renamed from: O */
    public final int m5850O(boolean z11) throws IOException {
        byte b11;
        while (true) {
            int i11 = 0;
            while (true) {
                int i12 = i11 + 1;
                if (!this.f6201i.request(i12)) {
                    if (z11) {
                        throw new EOFException("End of input");
                    }
                    return -1;
                }
                b11 = this.f6202j.getByte(i11);
                if (b11 == 10 || b11 == 32 || b11 == 13 || b11 == 9) {
                    i11 = i12;
                }
            }
            this.f6202j.skip(i11);
            if (b11 == 47) {
                if (this.f6201i.request(2L)) {
                    m5846E();
                    byte b12 = this.f6202j.getByte(1L);
                    if (b12 == 42) {
                        this.f6202j.readByte();
                        this.f6202j.readByte();
                        if (!m5857V()) {
                            throw m5828C("Unterminated comment");
                        }
                    } else if (b12 == 47) {
                        this.f6202j.readByte();
                        this.f6202j.readByte();
                        m5858W();
                    }
                }
                return b11;
            }
            if (b11 != 35) {
                return b11;
            }
            m5846E();
            m5858W();
        }
    }

    /* JADX INFO: renamed from: P */
    public final String m5851P(ByteString byteString) throws IOException {
        StringBuilder sb2 = null;
        while (true) {
            long jIndexOfElement = this.f6201i.indexOfElement(byteString);
            if (jIndexOfElement == -1) {
                throw m5828C("Unterminated string");
            }
            if (this.f6202j.getByte(jIndexOfElement) != 92) {
                if (sb2 == null) {
                    String utf8 = this.f6202j.readUtf8(jIndexOfElement);
                    this.f6202j.readByte();
                    return utf8;
                }
                sb2.append(this.f6202j.readUtf8(jIndexOfElement));
                this.f6202j.readByte();
                return sb2.toString();
            }
            if (sb2 == null) {
                sb2 = new StringBuilder();
            }
            sb2.append(this.f6202j.readUtf8(jIndexOfElement));
            this.f6202j.readByte();
            sb2.append(m5855T());
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f6203k = 0;
        this.f6188c[0] = 8;
        this.f6187b = 1;
        this.f6202j.clear();
        this.f6201i.close();
    }

    /* JADX INFO: renamed from: E */
    public final void m5846E() throws IOException {
        if (!this.f6191f) {
            throw m5828C("Use JsonReader.setLenient(true) to accept malformed JSON");
        }
    }

    /* JADX INFO: renamed from: J */
    public final int m5847J() throws IOException {
        int[] iArr = this.f6188c;
        int i11 = this.f6187b;
        int i12 = iArr[i11 - 1];
        if (i12 == 1) {
            iArr[i11 - 1] = 2;
        } else if (i12 == 2) {
            int iM5850O = m5850O(true);
            this.f6202j.readByte();
            if (iM5850O != 44) {
                if (iM5850O != 59) {
                    if (iM5850O != 93) {
                        throw m5828C("Unterminated array");
                    }
                    this.f6203k = 4;
                    return 4;
                }
                m5846E();
            }
        } else {
            if (i12 == 3 || i12 == 5) {
                iArr[i11 - 1] = 4;
                if (i12 == 5) {
                    int iM5850O2 = m5850O(true);
                    this.f6202j.readByte();
                    if (iM5850O2 != 44) {
                        if (iM5850O2 != 59) {
                            if (iM5850O2 != 125) {
                                throw m5828C("Unterminated object");
                            }
                            this.f6203k = 2;
                            return 2;
                        }
                        m5846E();
                    }
                }
                int iM5850O3 = m5850O(true);
                if (iM5850O3 == 34) {
                    this.f6202j.readByte();
                    this.f6203k = 13;
                    return 13;
                }
                if (iM5850O3 == 39) {
                    this.f6202j.readByte();
                    m5846E();
                    this.f6203k = 12;
                    return 12;
                }
                if (iM5850O3 != 125) {
                    m5846E();
                    if (!m5849M((char) iM5850O3)) {
                        throw m5828C("Expected name");
                    }
                    this.f6203k = 14;
                    return 14;
                }
                if (i12 == 5) {
                    throw m5828C("Expected name");
                }
                this.f6202j.readByte();
                this.f6203k = 2;
                return 2;
            }
            if (i12 == 4) {
                iArr[i11 - 1] = 5;
                int iM5850O4 = m5850O(true);
                this.f6202j.readByte();
                if (iM5850O4 != 58) {
                    if (iM5850O4 != 61) {
                        throw m5828C("Expected ':'");
                    }
                    m5846E();
                    if (this.f6201i.request(1L) && this.f6202j.getByte(0L) == 62) {
                        this.f6202j.readByte();
                    }
                }
            } else if (i12 == 6) {
                iArr[i11 - 1] = 7;
            } else if (i12 == 7) {
                if (m5850O(false) == -1) {
                    this.f6203k = 18;
                    return 18;
                }
                m5846E();
            } else if (i12 == 8) {
                throw new IllegalStateException("JsonReader is closed");
            }
        }
        int iM5850O5 = m5850O(true);
        if (iM5850O5 == 34) {
            this.f6202j.readByte();
            this.f6203k = 9;
            return 9;
        }
        if (iM5850O5 == 39) {
            m5846E();
            this.f6202j.readByte();
            this.f6203k = 8;
            return 8;
        }
        if (iM5850O5 != 44 && iM5850O5 != 59) {
            if (iM5850O5 == 91) {
                this.f6202j.readByte();
                this.f6203k = 3;
                return 3;
            }
            if (iM5850O5 != 93) {
                if (iM5850O5 == 123) {
                    this.f6202j.readByte();
                    this.f6203k = 1;
                    return 1;
                }
                int iM5853R = m5853R();
                if (iM5853R != 0) {
                    return iM5853R;
                }
                int iM5854S = m5854S();
                if (iM5854S != 0) {
                    return iM5854S;
                }
                if (!m5849M(this.f6202j.getByte(0L))) {
                    throw m5828C("Expected value");
                }
                m5846E();
                this.f6203k = 10;
                return 10;
            }
            if (i12 == 1) {
                this.f6202j.readByte();
                this.f6203k = 4;
                return 4;
            }
        }
        if (i12 != 1 && i12 != 2) {
            throw m5828C("Unexpected value");
        }
        m5846E();
        this.f6203k = 7;
        return 7;
    }

    /* JADX INFO: renamed from: L */
    public final int m5848L(String str, JsonReader.C5103a c5103a) {
        int length = c5103a.f6194a.length;
        for (int i11 = 0; i11 < length; i11++) {
            if (str.equals(c5103a.f6194a[i11])) {
                this.f6203k = 0;
                this.f6189d[this.f6187b - 1] = str;
                return i11;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: M */
    public final boolean m5849M(int i11) throws IOException {
        if (i11 == 9 || i11 == 10 || i11 == 12 || i11 == 13 || i11 == 32) {
            return false;
        }
        if (i11 != 35) {
            if (i11 == 44) {
                return false;
            }
            if (i11 != 47 && i11 != 61) {
                if (i11 == 123 || i11 == 125 || i11 == 58) {
                    return false;
                }
                if (i11 != 59) {
                    switch (i11) {
                        case 91:
                        case 93:
                            return false;
                        case 92:
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        m5846E();
        return false;
    }

    /* JADX INFO: renamed from: Q */
    public final String m5852Q() throws IOException {
        long jIndexOfElement = this.f6201i.indexOfElement(f6198q);
        return jIndexOfElement != -1 ? this.f6202j.readUtf8(jIndexOfElement) : this.f6202j.readUtf8();
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: R */
    public final int m5853R() throws IOException {
        String str;
        String str2;
        int i11;
        byte b11 = this.f6202j.getByte(0L);
        if (b11 == 116 || b11 == 84) {
            str = CredentialEntry.TRUE_STRING;
            str2 = "TRUE";
            i11 = 5;
        } else if (b11 == 102 || b11 == 70) {
            str = CredentialEntry.FALSE_STRING;
            str2 = "FALSE";
            i11 = 6;
        } else {
            if (b11 != 110 && b11 != 78) {
                return 0;
            }
            str = "null";
            str2 = "NULL";
            i11 = 7;
        }
        int length = str.length();
        int i12 = 1;
        while (i12 < length) {
            int i13 = i12 + 1;
            if (!this.f6201i.request(i13)) {
                return 0;
            }
            byte b12 = this.f6202j.getByte(i12);
            if (b12 != str.charAt(i12) && b12 != str2.charAt(i12)) {
                return 0;
            }
            i12 = i13;
        }
        if (this.f6201i.request(length + 1) && m5849M(this.f6202j.getByte(length))) {
            return 0;
        }
        this.f6202j.skip(length);
        this.f6203k = i11;
        return i11;
    }

    /* JADX INFO: renamed from: S */
    public final int m5854S() throws IOException {
        long j11;
        int i11;
        boolean z11 = true;
        int i12 = 0;
        char c11 = 0;
        long j12 = 0;
        boolean z12 = false;
        while (true) {
            int i13 = i12 + 1;
            if (!this.f6201i.request(i13)) {
                j11 = 0;
                i11 = 0;
                break;
            }
            j11 = 0;
            byte b11 = this.f6202j.getByte(i12);
            i11 = 0;
            if (b11 != 43) {
                if (b11 == 69 || b11 == 101) {
                    if (c11 != 2 && c11 != 4) {
                        return 0;
                    }
                    c11 = 5;
                } else if (b11 != 45) {
                    if (b11 != 46) {
                        if (b11 < 48 || b11 > 57) {
                            if (!m5849M(b11)) {
                                break;
                            }
                            return 0;
                        }
                        if (c11 == 1 || c11 == 0) {
                            j12 = -(b11 - 48);
                            c11 = 2;
                        } else if (c11 == 2) {
                            if (j12 == 0) {
                                return 0;
                            }
                            long j13 = (10 * j12) - ((long) (b11 - 48));
                            z11 &= j12 > okio.internal.Buffer.OVERFLOW_ZONE || (j12 == okio.internal.Buffer.OVERFLOW_ZONE && j13 < j12);
                            j12 = j13;
                        } else if (c11 == 3) {
                            c11 = 4;
                        } else if (c11 == 5 || c11 == 6) {
                            c11 = 7;
                        }
                    } else {
                        if (c11 != 2) {
                            return 0;
                        }
                        c11 = 3;
                    }
                } else if (c11 == 0) {
                    c11 = 1;
                    z12 = true;
                } else if (c11 != 5) {
                    return 0;
                }
                i12 = i13;
            } else if (c11 != 5) {
                return 0;
            }
            c11 = 6;
            i12 = i13;
        }
        if (c11 == 2 && z11 && ((j12 != Long.MIN_VALUE || z12) && (j12 != j11 || !z12))) {
            if (!z12) {
                j12 = -j12;
            }
            this.f6204l = j12;
            this.f6202j.skip(i12);
            this.f6203k = 16;
            return 16;
        }
        if (c11 != 2 && c11 != 4 && c11 != 7) {
            return i11;
        }
        this.f6205m = i12;
        this.f6203k = 17;
        return 17;
    }

    /* JADX INFO: renamed from: T */
    public final char m5855T() throws IOException {
        int i11;
        if (!this.f6201i.request(1L)) {
            throw m5828C("Unterminated escape sequence");
        }
        byte b11 = this.f6202j.readByte();
        if (b11 == 10 || b11 == 34 || b11 == 39 || b11 == 47 || b11 == 92) {
            return (char) b11;
        }
        if (b11 == 98) {
            return '\b';
        }
        if (b11 == 102) {
            return '\f';
        }
        if (b11 == 110) {
            return '\n';
        }
        if (b11 == 114) {
            return '\r';
        }
        if (b11 == 116) {
            return '\t';
        }
        if (b11 != 117) {
            if (this.f6191f) {
                return (char) b11;
            }
            throw m5828C("Invalid escape sequence: \\" + ((char) b11));
        }
        if (!this.f6201i.request(4L)) {
            throw new EOFException("Unterminated escape sequence at path " + getPath());
        }
        char c11 = 0;
        for (int i12 = 0; i12 < 4; i12++) {
            byte b12 = this.f6202j.getByte(i12);
            char c12 = (char) (c11 << 4);
            if (b12 >= 48 && b12 <= 57) {
                i11 = b12 - 48;
            } else if (b12 >= 97 && b12 <= 102) {
                i11 = b12 - 87;
            } else {
                if (b12 < 65 || b12 > 70) {
                    throw m5828C("\\u" + this.f6202j.readUtf8(4L));
                }
                i11 = b12 - 55;
            }
            c11 = (char) (c12 + i11);
        }
        this.f6202j.skip(4L);
        return c11;
    }

    /* JADX INFO: renamed from: U */
    public final void m5856U(ByteString byteString) throws IOException {
        while (true) {
            long jIndexOfElement = this.f6201i.indexOfElement(byteString);
            if (jIndexOfElement == -1) {
                throw m5828C("Unterminated string");
            }
            if (this.f6202j.getByte(jIndexOfElement) != 92) {
                this.f6202j.skip(jIndexOfElement + 1);
                return;
            } else {
                this.f6202j.skip(jIndexOfElement + 1);
                m5855T();
            }
        }
    }

    /* JADX INFO: renamed from: V */
    public final boolean m5857V() throws IOException {
        BufferedSource bufferedSource = this.f6201i;
        ByteString byteString = f6200s;
        long jIndexOf = bufferedSource.indexOf(byteString);
        boolean z11 = jIndexOf != -1;
        Buffer buffer = this.f6202j;
        buffer.skip(z11 ? jIndexOf + ((long) byteString.size()) : buffer.size());
        return z11;
    }

    /* JADX INFO: renamed from: W */
    public final void m5858W() throws IOException {
        long jIndexOfElement = this.f6201i.indexOfElement(f6199r);
        Buffer buffer = this.f6202j;
        buffer.skip(jIndexOfElement != -1 ? jIndexOfElement + 1 : buffer.size());
    }

    /* JADX INFO: renamed from: X */
    public final void m5859X() throws IOException {
        long jIndexOfElement = this.f6201i.indexOfElement(f6198q);
        Buffer buffer = this.f6202j;
        if (jIndexOfElement == -1) {
            jIndexOfElement = buffer.size();
        }
        buffer.skip(jIndexOfElement);
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    /* JADX INFO: renamed from: b */
    public void mo5829b() throws IOException {
        int iM5847J = this.f6203k;
        if (iM5847J == 0) {
            iM5847J = m5847J();
        }
        if (iM5847J == 3) {
            m5840u(1);
            this.f6190e[this.f6187b - 1] = 0;
            this.f6203k = 0;
        } else {
            throw new JsonDataException("Expected BEGIN_ARRAY but was " + mo5839q() + " at path " + getPath());
        }
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    /* JADX INFO: renamed from: g */
    public void mo5830g() throws IOException {
        int iM5847J = this.f6203k;
        if (iM5847J == 0) {
            iM5847J = m5847J();
        }
        if (iM5847J == 1) {
            m5840u(3);
            this.f6203k = 0;
            return;
        }
        throw new JsonDataException("Expected BEGIN_OBJECT but was " + mo5839q() + " at path " + getPath());
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    /* JADX INFO: renamed from: h */
    public void mo5831h() throws IOException {
        int iM5847J = this.f6203k;
        if (iM5847J == 0) {
            iM5847J = m5847J();
        }
        if (iM5847J != 4) {
            throw new JsonDataException("Expected END_ARRAY but was " + mo5839q() + " at path " + getPath());
        }
        int i11 = this.f6187b;
        this.f6187b = i11 - 1;
        int[] iArr = this.f6190e;
        int i12 = i11 - 2;
        iArr[i12] = iArr[i12] + 1;
        this.f6203k = 0;
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    /* JADX INFO: renamed from: i */
    public void mo5832i() throws IOException {
        int iM5847J = this.f6203k;
        if (iM5847J == 0) {
            iM5847J = m5847J();
        }
        if (iM5847J != 2) {
            throw new JsonDataException("Expected END_OBJECT but was " + mo5839q() + " at path " + getPath());
        }
        int i11 = this.f6187b;
        int i12 = i11 - 1;
        this.f6187b = i12;
        this.f6189d[i12] = null;
        int[] iArr = this.f6190e;
        int i13 = i11 - 2;
        iArr[i13] = iArr[i13] + 1;
        this.f6203k = 0;
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    /* JADX INFO: renamed from: j */
    public boolean mo5833j() throws IOException {
        int iM5847J = this.f6203k;
        if (iM5847J == 0) {
            iM5847J = m5847J();
        }
        return (iM5847J == 2 || iM5847J == 4 || iM5847J == 18) ? false : true;
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    /* JADX INFO: renamed from: k */
    public boolean mo5834k() throws IOException {
        int iM5847J = this.f6203k;
        if (iM5847J == 0) {
            iM5847J = m5847J();
        }
        if (iM5847J == 5) {
            this.f6203k = 0;
            int[] iArr = this.f6190e;
            int i11 = this.f6187b - 1;
            iArr[i11] = iArr[i11] + 1;
            return true;
        }
        if (iM5847J == 6) {
            this.f6203k = 0;
            int[] iArr2 = this.f6190e;
            int i12 = this.f6187b - 1;
            iArr2[i12] = iArr2[i12] + 1;
            return false;
        }
        throw new JsonDataException("Expected a boolean but was " + mo5839q() + " at path " + getPath());
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    /* JADX INFO: renamed from: l */
    public double mo5835l() throws IOException {
        int iM5847J = this.f6203k;
        if (iM5847J == 0) {
            iM5847J = m5847J();
        }
        if (iM5847J == 16) {
            this.f6203k = 0;
            int[] iArr = this.f6190e;
            int i11 = this.f6187b - 1;
            iArr[i11] = iArr[i11] + 1;
            return this.f6204l;
        }
        if (iM5847J == 17) {
            this.f6206n = this.f6202j.readUtf8(this.f6205m);
        } else if (iM5847J == 9) {
            this.f6206n = m5851P(f6197p);
        } else if (iM5847J == 8) {
            this.f6206n = m5851P(f6196o);
        } else if (iM5847J == 10) {
            this.f6206n = m5852Q();
        } else if (iM5847J != 11) {
            throw new JsonDataException("Expected a double but was " + mo5839q() + " at path " + getPath());
        }
        this.f6203k = 11;
        try {
            double d11 = Double.parseDouble(this.f6206n);
            if (this.f6191f || !(Double.isNaN(d11) || Double.isInfinite(d11))) {
                this.f6206n = null;
                this.f6203k = 0;
                int[] iArr2 = this.f6190e;
                int i12 = this.f6187b - 1;
                iArr2[i12] = iArr2[i12] + 1;
                return d11;
            }
            throw new JsonEncodingException("JSON forbids NaN and infinities: " + d11 + " at path " + getPath());
        } catch (NumberFormatException unused) {
            throw new JsonDataException("Expected a double but was " + this.f6206n + " at path " + getPath());
        }
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    /* JADX INFO: renamed from: m */
    public int mo5836m() throws IOException {
        int iM5847J = this.f6203k;
        if (iM5847J == 0) {
            iM5847J = m5847J();
        }
        if (iM5847J == 16) {
            long j11 = this.f6204l;
            int i11 = (int) j11;
            if (j11 == i11) {
                this.f6203k = 0;
                int[] iArr = this.f6190e;
                int i12 = this.f6187b - 1;
                iArr[i12] = iArr[i12] + 1;
                return i11;
            }
            throw new JsonDataException("Expected an int but was " + this.f6204l + " at path " + getPath());
        }
        if (iM5847J == 17) {
            this.f6206n = this.f6202j.readUtf8(this.f6205m);
        } else if (iM5847J == 9 || iM5847J == 8) {
            String strM5851P = iM5847J == 9 ? m5851P(f6197p) : m5851P(f6196o);
            this.f6206n = strM5851P;
            try {
                int i13 = Integer.parseInt(strM5851P);
                this.f6203k = 0;
                int[] iArr2 = this.f6190e;
                int i14 = this.f6187b - 1;
                iArr2[i14] = iArr2[i14] + 1;
                return i13;
            } catch (NumberFormatException unused) {
            }
        } else if (iM5847J != 11) {
            throw new JsonDataException("Expected an int but was " + mo5839q() + " at path " + getPath());
        }
        this.f6203k = 11;
        try {
            double d11 = Double.parseDouble(this.f6206n);
            int i15 = (int) d11;
            if (i15 == d11) {
                this.f6206n = null;
                this.f6203k = 0;
                int[] iArr3 = this.f6190e;
                int i16 = this.f6187b - 1;
                iArr3[i16] = iArr3[i16] + 1;
                return i15;
            }
            throw new JsonDataException("Expected an int but was " + this.f6206n + " at path " + getPath());
        } catch (NumberFormatException unused2) {
            throw new JsonDataException("Expected an int but was " + this.f6206n + " at path " + getPath());
        }
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    /* JADX INFO: renamed from: n */
    public String mo5837n() throws IOException {
        String strM5851P;
        int iM5847J = this.f6203k;
        if (iM5847J == 0) {
            iM5847J = m5847J();
        }
        if (iM5847J == 14) {
            strM5851P = m5852Q();
        } else if (iM5847J == 13) {
            strM5851P = m5851P(f6197p);
        } else if (iM5847J == 12) {
            strM5851P = m5851P(f6196o);
        } else {
            if (iM5847J != 15) {
                throw new JsonDataException("Expected a name but was " + mo5839q() + " at path " + getPath());
            }
            strM5851P = this.f6206n;
        }
        this.f6203k = 0;
        this.f6189d[this.f6187b - 1] = strM5851P;
        return strM5851P;
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    /* JADX INFO: renamed from: o */
    public String mo5838o() throws IOException {
        String utf8;
        int iM5847J = this.f6203k;
        if (iM5847J == 0) {
            iM5847J = m5847J();
        }
        if (iM5847J == 10) {
            utf8 = m5852Q();
        } else if (iM5847J == 9) {
            utf8 = m5851P(f6197p);
        } else if (iM5847J == 8) {
            utf8 = m5851P(f6196o);
        } else if (iM5847J == 11) {
            utf8 = this.f6206n;
            this.f6206n = null;
        } else if (iM5847J == 16) {
            utf8 = Long.toString(this.f6204l);
        } else {
            if (iM5847J != 17) {
                throw new JsonDataException("Expected a string but was " + mo5839q() + " at path " + getPath());
            }
            utf8 = this.f6202j.readUtf8(this.f6205m);
        }
        this.f6203k = 0;
        int[] iArr = this.f6190e;
        int i11 = this.f6187b - 1;
        iArr[i11] = iArr[i11] + 1;
        return utf8;
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    /* JADX INFO: renamed from: q */
    public JsonReader.Token mo5839q() throws IOException {
        int iM5847J = this.f6203k;
        if (iM5847J == 0) {
            iM5847J = m5847J();
        }
        switch (iM5847J) {
            case 1:
                return JsonReader.Token.BEGIN_OBJECT;
            case 2:
                return JsonReader.Token.END_OBJECT;
            case 3:
                return JsonReader.Token.BEGIN_ARRAY;
            case 4:
                return JsonReader.Token.END_ARRAY;
            case 5:
            case 6:
                return JsonReader.Token.BOOLEAN;
            case 7:
                return JsonReader.Token.NULL;
            case 8:
            case 9:
            case 10:
            case 11:
                return JsonReader.Token.STRING;
            case 12:
            case 13:
            case 14:
            case 15:
                return JsonReader.Token.NAME;
            case 16:
            case 17:
                return JsonReader.Token.NUMBER;
            case 18:
                return JsonReader.Token.END_DOCUMENT;
            default:
                throw new AssertionError();
        }
    }

    public String toString() {
        return "JsonReader(" + this.f6201i + ")";
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    /* JADX INFO: renamed from: v */
    public int mo5841v(JsonReader.C5103a c5103a) throws IOException {
        int iM5847J = this.f6203k;
        if (iM5847J == 0) {
            iM5847J = m5847J();
        }
        if (iM5847J < 12 || iM5847J > 15) {
            return -1;
        }
        if (iM5847J == 15) {
            return m5848L(this.f6206n, c5103a);
        }
        int iSelect = this.f6201i.select(c5103a.f6195b);
        if (iSelect != -1) {
            this.f6203k = 0;
            this.f6189d[this.f6187b - 1] = c5103a.f6194a[iSelect];
            return iSelect;
        }
        String str = this.f6189d[this.f6187b - 1];
        String strMo5837n = mo5837n();
        int iM5848L = m5848L(strMo5837n, c5103a);
        if (iM5848L == -1) {
            this.f6203k = 15;
            this.f6206n = strMo5837n;
            this.f6189d[this.f6187b - 1] = str;
        }
        return iM5848L;
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    /* JADX INFO: renamed from: w */
    public void mo5842w() throws IOException {
        if (this.f6192g) {
            throw new JsonDataException("Cannot skip unexpected " + mo5839q() + " at " + getPath());
        }
        int iM5847J = this.f6203k;
        if (iM5847J == 0) {
            iM5847J = m5847J();
        }
        if (iM5847J == 14) {
            m5859X();
        } else if (iM5847J == 13) {
            m5856U(f6197p);
        } else if (iM5847J == 12) {
            m5856U(f6196o);
        } else if (iM5847J != 15) {
            throw new JsonDataException("Expected a name but was " + mo5839q() + " at path " + getPath());
        }
        this.f6203k = 0;
        this.f6189d[this.f6187b - 1] = "null";
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    /* JADX INFO: renamed from: x */
    public void mo5843x() throws IOException {
        if (this.f6192g) {
            throw new JsonDataException("Cannot skip unexpected " + mo5839q() + " at " + getPath());
        }
        int i11 = 0;
        do {
            int iM5847J = this.f6203k;
            if (iM5847J == 0) {
                iM5847J = m5847J();
            }
            if (iM5847J == 3) {
                m5840u(1);
            } else {
                if (iM5847J == 1) {
                    m5840u(3);
                } else if (iM5847J == 4) {
                    i11--;
                    if (i11 < 0) {
                        throw new JsonDataException("Expected a value but was " + mo5839q() + " at path " + getPath());
                    }
                    this.f6187b--;
                } else if (iM5847J == 2) {
                    i11--;
                    if (i11 < 0) {
                        throw new JsonDataException("Expected a value but was " + mo5839q() + " at path " + getPath());
                    }
                    this.f6187b--;
                } else if (iM5847J == 14 || iM5847J == 10) {
                    m5859X();
                } else if (iM5847J == 9 || iM5847J == 13) {
                    m5856U(f6197p);
                } else if (iM5847J == 8 || iM5847J == 12) {
                    m5856U(f6196o);
                } else if (iM5847J == 17) {
                    this.f6202j.skip(this.f6205m);
                } else if (iM5847J == 18) {
                    throw new JsonDataException("Expected a value but was " + mo5839q() + " at path " + getPath());
                }
                this.f6203k = 0;
            }
            i11++;
            this.f6203k = 0;
        } while (i11 != 0);
        int[] iArr = this.f6190e;
        int i12 = this.f6187b;
        int i13 = i12 - 1;
        iArr[i13] = iArr[i13] + 1;
        this.f6189d[i12 - 1] = "null";
    }

    public C5104a(BufferedSource bufferedSource) {
        if (bufferedSource != null) {
            this.f6201i = bufferedSource;
            this.f6202j = bufferedSource.getBufferField();
            m5840u(6);
            return;
        }
        throw new NullPointerException("source == null");
    }
}
