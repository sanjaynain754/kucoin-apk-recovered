package com.squareup.moshi;

import androidx.credentials.provider.CredentialEntry;
import java.io.EOFException;
import java.io.IOException;
import java.math.BigDecimal;
import okio.Buffer;
import okio.BufferedSource;
import okio.ByteString;

/* JADX INFO: renamed from: com.squareup.moshi.j */
/* JADX INFO: compiled from: JsonUtf8Reader.java */
/* JADX INFO: loaded from: classes59.dex */
public final class C27804j extends JsonReader {

    /* JADX INFO: renamed from: n */
    public static final ByteString f56601n = ByteString.encodeUtf8("'\\");

    /* JADX INFO: renamed from: o */
    public static final ByteString f56602o = ByteString.encodeUtf8("\"\\");

    /* JADX INFO: renamed from: p */
    public static final ByteString f56603p = ByteString.encodeUtf8("{}[]:, \n\t\r\f/\\;#=");

    /* JADX INFO: renamed from: q */
    public static final ByteString f56604q = ByteString.encodeUtf8("\n\r");

    /* JADX INFO: renamed from: r */
    public static final ByteString f56605r = ByteString.encodeUtf8("*/");

    /* JADX INFO: renamed from: h */
    public final BufferedSource f56606h;

    /* JADX INFO: renamed from: i */
    public final Buffer f56607i;

    /* JADX INFO: renamed from: j */
    public int f56608j = 0;

    /* JADX INFO: renamed from: k */
    public long f56609k;

    /* JADX INFO: renamed from: l */
    public int f56610l;

    /* JADX INFO: renamed from: m */
    public String f56611m;

    /* JADX INFO: renamed from: V */
    public final int m68693V(boolean z11) throws IOException {
        byte b11;
        while (true) {
            int i11 = 0;
            while (true) {
                int i12 = i11 + 1;
                if (!this.f56606h.request(i12)) {
                    if (z11) {
                        throw new EOFException("End of input");
                    }
                    return -1;
                }
                b11 = this.f56607i.getByte(i11);
                if (b11 == 10 || b11 == 32 || b11 == 13 || b11 == 9) {
                    i11 = i12;
                }
            }
            this.f56607i.skip(i11);
            if (b11 == 47) {
                if (this.f56606h.request(2L)) {
                    m68687P();
                    byte b12 = this.f56607i.getByte(1L);
                    if (b12 == 42) {
                        this.f56607i.readByte();
                        this.f56607i.readByte();
                        if (!m68700c0()) {
                            throw m68630O("Unterminated comment");
                        }
                    } else if (b12 == 47) {
                        this.f56607i.readByte();
                        this.f56607i.readByte();
                        m68701d0();
                    }
                }
                return b11;
            }
            if (b11 != 35) {
                return b11;
            }
            m68687P();
            m68701d0();
        }
    }

    /* JADX INFO: renamed from: W */
    public final String m68694W(ByteString byteString) throws IOException {
        StringBuilder sb2 = null;
        while (true) {
            long jIndexOfElement = this.f56606h.indexOfElement(byteString);
            if (jIndexOfElement == -1) {
                throw m68630O("Unterminated string");
            }
            if (this.f56607i.getByte(jIndexOfElement) != 92) {
                if (sb2 == null) {
                    String utf8 = this.f56607i.readUtf8(jIndexOfElement);
                    this.f56607i.readByte();
                    return utf8;
                }
                sb2.append(this.f56607i.readUtf8(jIndexOfElement));
                this.f56607i.readByte();
                return sb2.toString();
            }
            if (sb2 == null) {
                sb2 = new StringBuilder();
            }
            sb2.append(this.f56607i.readUtf8(jIndexOfElement));
            this.f56607i.readByte();
            sb2.append(m68698a0());
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f56608j = 0;
        this.f56542c[0] = 8;
        this.f56541b = 1;
        this.f56607i.clear();
        this.f56606h.close();
    }

    @Override // com.squareup.moshi.JsonReader
    /* JADX INFO: renamed from: C */
    public int mo68625C(JsonReader.C27787a c27787a) throws IOException {
        int iM68688Q = this.f56608j;
        if (iM68688Q == 0) {
            iM68688Q = m68688Q();
        }
        if (iM68688Q < 8 || iM68688Q > 11) {
            return -1;
        }
        if (iM68688Q == 11) {
            return m68690S(this.f56611m, c27787a);
        }
        int iSelect = this.f56606h.select(c27787a.f56549b);
        if (iSelect != -1) {
            this.f56608j = 0;
            int[] iArr = this.f56544e;
            int i11 = this.f56541b - 1;
            iArr[i11] = iArr[i11] + 1;
            return iSelect;
        }
        String strMo68643q = mo68643q();
        int iM68690S = m68690S(strMo68643q, c27787a);
        if (iM68690S == -1) {
            this.f56608j = 11;
            this.f56611m = strMo68643q;
            int[] iArr2 = this.f56544e;
            int i12 = this.f56541b - 1;
            iArr2[i12] = iArr2[i12] - 1;
        }
        return iM68690S;
    }

    @Override // com.squareup.moshi.JsonReader
    /* JADX INFO: renamed from: L */
    public void mo68628L() throws IOException {
        if (this.f56546g) {
            JsonReader.Token tokenMo68644v = mo68644v();
            m68692U();
            throw new JsonDataException("Cannot skip unexpected " + tokenMo68644v + " at " + getPath());
        }
        int iM68688Q = this.f56608j;
        if (iM68688Q == 0) {
            iM68688Q = m68688Q();
        }
        if (iM68688Q == 14) {
            m68702e0();
        } else if (iM68688Q == 13) {
            m68699b0(f56602o);
        } else if (iM68688Q == 12) {
            m68699b0(f56601n);
        } else if (iM68688Q != 15) {
            throw new JsonDataException("Expected a name but was " + mo68644v() + " at path " + getPath());
        }
        this.f56608j = 0;
        this.f56543d[this.f56541b - 1] = "null";
    }

    @Override // com.squareup.moshi.JsonReader
    /* JADX INFO: renamed from: M */
    public void mo68629M() throws IOException {
        if (this.f56546g) {
            throw new JsonDataException("Cannot skip unexpected " + mo68644v() + " at " + getPath());
        }
        int i11 = 0;
        do {
            int iM68688Q = this.f56608j;
            if (iM68688Q == 0) {
                iM68688Q = m68688Q();
            }
            if (iM68688Q == 3) {
                m68646x(1);
            } else {
                if (iM68688Q == 1) {
                    m68646x(3);
                } else if (iM68688Q == 4) {
                    i11--;
                    if (i11 < 0) {
                        throw new JsonDataException("Expected a value but was " + mo68644v() + " at path " + getPath());
                    }
                    this.f56541b--;
                } else if (iM68688Q == 2) {
                    i11--;
                    if (i11 < 0) {
                        throw new JsonDataException("Expected a value but was " + mo68644v() + " at path " + getPath());
                    }
                    this.f56541b--;
                } else if (iM68688Q == 14 || iM68688Q == 10) {
                    m68702e0();
                } else if (iM68688Q == 9 || iM68688Q == 13) {
                    m68699b0(f56602o);
                } else if (iM68688Q == 8 || iM68688Q == 12) {
                    m68699b0(f56601n);
                } else if (iM68688Q == 17) {
                    this.f56607i.skip(this.f56610l);
                } else if (iM68688Q == 18) {
                    throw new JsonDataException("Expected a value but was " + mo68644v() + " at path " + getPath());
                }
                this.f56608j = 0;
            }
            i11++;
            this.f56608j = 0;
        } while (i11 != 0);
        int[] iArr = this.f56544e;
        int i12 = this.f56541b;
        int i13 = i12 - 1;
        iArr[i13] = iArr[i13] + 1;
        this.f56543d[i12 - 1] = "null";
    }

    /* JADX INFO: renamed from: P */
    public final void m68687P() throws IOException {
        if (!this.f56545f) {
            throw m68630O("Use JsonReader.setLenient(true) to accept malformed JSON");
        }
    }

    /* JADX INFO: renamed from: Q */
    public final int m68688Q() throws IOException {
        int[] iArr = this.f56542c;
        int i11 = this.f56541b;
        int i12 = iArr[i11 - 1];
        if (i12 == 1) {
            iArr[i11 - 1] = 2;
        } else if (i12 == 2) {
            int iM68693V = m68693V(true);
            this.f56607i.readByte();
            if (iM68693V != 44) {
                if (iM68693V != 59) {
                    if (iM68693V != 93) {
                        throw m68630O("Unterminated array");
                    }
                    this.f56608j = 4;
                    return 4;
                }
                m68687P();
            }
        } else {
            if (i12 == 3 || i12 == 5) {
                iArr[i11 - 1] = 4;
                if (i12 == 5) {
                    int iM68693V2 = m68693V(true);
                    this.f56607i.readByte();
                    if (iM68693V2 != 44) {
                        if (iM68693V2 != 59) {
                            if (iM68693V2 != 125) {
                                throw m68630O("Unterminated object");
                            }
                            this.f56608j = 2;
                            return 2;
                        }
                        m68687P();
                    }
                }
                int iM68693V3 = m68693V(true);
                if (iM68693V3 == 34) {
                    this.f56607i.readByte();
                    this.f56608j = 13;
                    return 13;
                }
                if (iM68693V3 == 39) {
                    this.f56607i.readByte();
                    m68687P();
                    this.f56608j = 12;
                    return 12;
                }
                if (iM68693V3 != 125) {
                    m68687P();
                    if (!m68691T((char) iM68693V3)) {
                        throw m68630O("Expected name");
                    }
                    this.f56608j = 14;
                    return 14;
                }
                if (i12 == 5) {
                    throw m68630O("Expected name");
                }
                this.f56607i.readByte();
                this.f56608j = 2;
                return 2;
            }
            if (i12 == 4) {
                iArr[i11 - 1] = 5;
                int iM68693V4 = m68693V(true);
                this.f56607i.readByte();
                if (iM68693V4 != 58) {
                    if (iM68693V4 != 61) {
                        throw m68630O("Expected ':'");
                    }
                    m68687P();
                    if (this.f56606h.request(1L) && this.f56607i.getByte(0L) == 62) {
                        this.f56607i.readByte();
                    }
                }
            } else if (i12 == 6) {
                iArr[i11 - 1] = 7;
            } else if (i12 == 7) {
                if (m68693V(false) == -1) {
                    this.f56608j = 18;
                    return 18;
                }
                m68687P();
            } else {
                if (i12 == 9) {
                    throw null;
                }
                if (i12 == 8) {
                    throw new IllegalStateException("JsonReader is closed");
                }
            }
        }
        int iM68693V5 = m68693V(true);
        if (iM68693V5 == 34) {
            this.f56607i.readByte();
            this.f56608j = 9;
            return 9;
        }
        if (iM68693V5 == 39) {
            m68687P();
            this.f56607i.readByte();
            this.f56608j = 8;
            return 8;
        }
        if (iM68693V5 != 44 && iM68693V5 != 59) {
            if (iM68693V5 == 91) {
                this.f56607i.readByte();
                this.f56608j = 3;
                return 3;
            }
            if (iM68693V5 != 93) {
                if (iM68693V5 == 123) {
                    this.f56607i.readByte();
                    this.f56608j = 1;
                    return 1;
                }
                int iM68696Y = m68696Y();
                if (iM68696Y != 0) {
                    return iM68696Y;
                }
                int iM68697Z = m68697Z();
                if (iM68697Z != 0) {
                    return iM68697Z;
                }
                if (!m68691T(this.f56607i.getByte(0L))) {
                    throw m68630O("Expected value");
                }
                m68687P();
                this.f56608j = 10;
                return 10;
            }
            if (i12 == 1) {
                this.f56607i.readByte();
                this.f56608j = 4;
                return 4;
            }
        }
        if (i12 != 1 && i12 != 2) {
            throw m68630O("Unexpected value");
        }
        m68687P();
        this.f56608j = 7;
        return 7;
    }

    /* JADX INFO: renamed from: R */
    public final int m68689R(String str, JsonReader.C27787a c27787a) {
        int length = c27787a.f56548a.length;
        for (int i11 = 0; i11 < length; i11++) {
            if (str.equals(c27787a.f56548a[i11])) {
                this.f56608j = 0;
                this.f56543d[this.f56541b - 1] = str;
                return i11;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: S */
    public final int m68690S(String str, JsonReader.C27787a c27787a) {
        int length = c27787a.f56548a.length;
        for (int i11 = 0; i11 < length; i11++) {
            if (str.equals(c27787a.f56548a[i11])) {
                this.f56608j = 0;
                int[] iArr = this.f56544e;
                int i12 = this.f56541b - 1;
                iArr[i12] = iArr[i12] + 1;
                return i11;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: T */
    public final boolean m68691T(int i11) throws IOException {
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
        m68687P();
        return false;
    }

    /* JADX INFO: renamed from: U */
    public String m68692U() throws IOException {
        String strM68694W;
        int iM68688Q = this.f56608j;
        if (iM68688Q == 0) {
            iM68688Q = m68688Q();
        }
        if (iM68688Q == 14) {
            strM68694W = m68695X();
        } else if (iM68688Q == 13) {
            strM68694W = m68694W(f56602o);
        } else if (iM68688Q == 12) {
            strM68694W = m68694W(f56601n);
        } else {
            if (iM68688Q != 15) {
                throw new JsonDataException("Expected a name but was " + mo68644v() + " at path " + getPath());
            }
            strM68694W = this.f56611m;
            this.f56611m = null;
        }
        this.f56608j = 0;
        this.f56543d[this.f56541b - 1] = strM68694W;
        return strM68694W;
    }

    /* JADX INFO: renamed from: X */
    public final String m68695X() throws IOException {
        long jIndexOfElement = this.f56606h.indexOfElement(f56603p);
        return jIndexOfElement != -1 ? this.f56607i.readUtf8(jIndexOfElement) : this.f56607i.readUtf8();
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
    /* JADX INFO: renamed from: Y */
    public final int m68696Y() throws IOException {
        String str;
        String str2;
        int i11;
        byte b11 = this.f56607i.getByte(0L);
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
            if (!this.f56606h.request(i13)) {
                return 0;
            }
            byte b12 = this.f56607i.getByte(i12);
            if (b12 != str.charAt(i12) && b12 != str2.charAt(i12)) {
                return 0;
            }
            i12 = i13;
        }
        if (this.f56606h.request(length + 1) && m68691T(this.f56607i.getByte(length))) {
            return 0;
        }
        this.f56607i.skip(length);
        this.f56608j = i11;
        return i11;
    }

    /* JADX INFO: renamed from: Z */
    public final int m68697Z() throws IOException {
        long j11;
        int i11;
        boolean z11 = true;
        int i12 = 0;
        char c11 = 0;
        long j12 = 0;
        boolean z12 = false;
        while (true) {
            int i13 = i12 + 1;
            if (!this.f56606h.request(i13)) {
                j11 = 0;
                i11 = 0;
                break;
            }
            j11 = 0;
            byte b11 = this.f56607i.getByte(i12);
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
                            if (!m68691T(b11)) {
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
            this.f56609k = j12;
            this.f56607i.skip(i12);
            this.f56608j = 16;
            return 16;
        }
        if (c11 != 2 && c11 != 4 && c11 != 7) {
            return i11;
        }
        this.f56610l = i12;
        this.f56608j = 17;
        return 17;
    }

    @Override // com.squareup.moshi.JsonReader
    /* JADX INFO: renamed from: a */
    public void mo68631a() throws IOException {
        int iM68688Q = this.f56608j;
        if (iM68688Q == 0) {
            iM68688Q = m68688Q();
        }
        if (iM68688Q == 3) {
            m68646x(1);
            this.f56544e[this.f56541b - 1] = 0;
            this.f56608j = 0;
        } else {
            throw new JsonDataException("Expected BEGIN_ARRAY but was " + mo68644v() + " at path " + getPath());
        }
    }

    /* JADX INFO: renamed from: a0 */
    public final char m68698a0() throws IOException {
        int i11;
        if (!this.f56606h.request(1L)) {
            throw m68630O("Unterminated escape sequence");
        }
        byte b11 = this.f56607i.readByte();
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
            if (this.f56545f) {
                return (char) b11;
            }
            throw m68630O("Invalid escape sequence: \\" + ((char) b11));
        }
        if (!this.f56606h.request(4L)) {
            throw new EOFException("Unterminated escape sequence at path " + getPath());
        }
        char c11 = 0;
        for (int i12 = 0; i12 < 4; i12++) {
            byte b12 = this.f56607i.getByte(i12);
            char c12 = (char) (c11 << 4);
            if (b12 >= 48 && b12 <= 57) {
                i11 = b12 - 48;
            } else if (b12 >= 97 && b12 <= 102) {
                i11 = b12 - 87;
            } else {
                if (b12 < 65 || b12 > 70) {
                    throw m68630O("\\u" + this.f56607i.readUtf8(4L));
                }
                i11 = b12 - 55;
            }
            c11 = (char) (c12 + i11);
        }
        this.f56607i.skip(4L);
        return c11;
    }

    @Override // com.squareup.moshi.JsonReader
    /* JADX INFO: renamed from: b */
    public void mo68632b() throws IOException {
        int iM68688Q = this.f56608j;
        if (iM68688Q == 0) {
            iM68688Q = m68688Q();
        }
        if (iM68688Q == 1) {
            m68646x(3);
            this.f56608j = 0;
            return;
        }
        throw new JsonDataException("Expected BEGIN_OBJECT but was " + mo68644v() + " at path " + getPath());
    }

    /* JADX INFO: renamed from: b0 */
    public final void m68699b0(ByteString byteString) throws IOException {
        while (true) {
            long jIndexOfElement = this.f56606h.indexOfElement(byteString);
            if (jIndexOfElement == -1) {
                throw m68630O("Unterminated string");
            }
            if (this.f56607i.getByte(jIndexOfElement) != 92) {
                this.f56607i.skip(jIndexOfElement + 1);
                return;
            } else {
                this.f56607i.skip(jIndexOfElement + 1);
                m68698a0();
            }
        }
    }

    /* JADX INFO: renamed from: c0 */
    public final boolean m68700c0() throws IOException {
        BufferedSource bufferedSource = this.f56606h;
        ByteString byteString = f56605r;
        long jIndexOf = bufferedSource.indexOf(byteString);
        boolean z11 = jIndexOf != -1;
        Buffer buffer = this.f56607i;
        buffer.skip(z11 ? jIndexOf + ((long) byteString.size()) : buffer.size());
        return z11;
    }

    /* JADX INFO: renamed from: d0 */
    public final void m68701d0() throws IOException {
        long jIndexOfElement = this.f56606h.indexOfElement(f56604q);
        Buffer buffer = this.f56607i;
        buffer.skip(jIndexOfElement != -1 ? jIndexOfElement + 1 : buffer.size());
    }

    /* JADX INFO: renamed from: e0 */
    public final void m68702e0() throws IOException {
        long jIndexOfElement = this.f56606h.indexOfElement(f56603p);
        Buffer buffer = this.f56607i;
        if (jIndexOfElement == -1) {
            jIndexOfElement = buffer.size();
        }
        buffer.skip(jIndexOfElement);
    }

    @Override // com.squareup.moshi.JsonReader
    /* JADX INFO: renamed from: g */
    public void mo68633g() throws IOException {
        int iM68688Q = this.f56608j;
        if (iM68688Q == 0) {
            iM68688Q = m68688Q();
        }
        if (iM68688Q != 4) {
            throw new JsonDataException("Expected END_ARRAY but was " + mo68644v() + " at path " + getPath());
        }
        int i11 = this.f56541b;
        this.f56541b = i11 - 1;
        int[] iArr = this.f56544e;
        int i12 = i11 - 2;
        iArr[i12] = iArr[i12] + 1;
        this.f56608j = 0;
    }

    @Override // com.squareup.moshi.JsonReader
    /* JADX INFO: renamed from: h */
    public void mo68634h() throws IOException {
        int iM68688Q = this.f56608j;
        if (iM68688Q == 0) {
            iM68688Q = m68688Q();
        }
        if (iM68688Q != 2) {
            throw new JsonDataException("Expected END_OBJECT but was " + mo68644v() + " at path " + getPath());
        }
        int i11 = this.f56541b;
        int i12 = i11 - 1;
        this.f56541b = i12;
        this.f56543d[i12] = null;
        int[] iArr = this.f56544e;
        int i13 = i11 - 2;
        iArr[i13] = iArr[i13] + 1;
        this.f56608j = 0;
    }

    @Override // com.squareup.moshi.JsonReader
    /* JADX INFO: renamed from: j */
    public boolean mo68636j() throws IOException {
        int iM68688Q = this.f56608j;
        if (iM68688Q == 0) {
            iM68688Q = m68688Q();
        }
        return (iM68688Q == 2 || iM68688Q == 4 || iM68688Q == 18) ? false : true;
    }

    @Override // com.squareup.moshi.JsonReader
    /* JADX INFO: renamed from: l */
    public boolean mo68638l() throws IOException {
        int iM68688Q = this.f56608j;
        if (iM68688Q == 0) {
            iM68688Q = m68688Q();
        }
        if (iM68688Q == 5) {
            this.f56608j = 0;
            int[] iArr = this.f56544e;
            int i11 = this.f56541b - 1;
            iArr[i11] = iArr[i11] + 1;
            return true;
        }
        if (iM68688Q == 6) {
            this.f56608j = 0;
            int[] iArr2 = this.f56544e;
            int i12 = this.f56541b - 1;
            iArr2[i12] = iArr2[i12] + 1;
            return false;
        }
        throw new JsonDataException("Expected a boolean but was " + mo68644v() + " at path " + getPath());
    }

    @Override // com.squareup.moshi.JsonReader
    /* JADX INFO: renamed from: m */
    public double mo68639m() throws IOException {
        int iM68688Q = this.f56608j;
        if (iM68688Q == 0) {
            iM68688Q = m68688Q();
        }
        if (iM68688Q == 16) {
            this.f56608j = 0;
            int[] iArr = this.f56544e;
            int i11 = this.f56541b - 1;
            iArr[i11] = iArr[i11] + 1;
            return this.f56609k;
        }
        if (iM68688Q == 17) {
            this.f56611m = this.f56607i.readUtf8(this.f56610l);
        } else if (iM68688Q == 9) {
            this.f56611m = m68694W(f56602o);
        } else if (iM68688Q == 8) {
            this.f56611m = m68694W(f56601n);
        } else if (iM68688Q == 10) {
            this.f56611m = m68695X();
        } else if (iM68688Q != 11) {
            throw new JsonDataException("Expected a double but was " + mo68644v() + " at path " + getPath());
        }
        this.f56608j = 11;
        try {
            double d11 = Double.parseDouble(this.f56611m);
            if (this.f56545f || !(Double.isNaN(d11) || Double.isInfinite(d11))) {
                this.f56611m = null;
                this.f56608j = 0;
                int[] iArr2 = this.f56544e;
                int i12 = this.f56541b - 1;
                iArr2[i12] = iArr2[i12] + 1;
                return d11;
            }
            throw new JsonEncodingException("JSON forbids NaN and infinities: " + d11 + " at path " + getPath());
        } catch (NumberFormatException unused) {
            throw new JsonDataException("Expected a double but was " + this.f56611m + " at path " + getPath());
        }
    }

    @Override // com.squareup.moshi.JsonReader
    /* JADX INFO: renamed from: n */
    public int mo68640n() throws IOException {
        int iM68688Q = this.f56608j;
        if (iM68688Q == 0) {
            iM68688Q = m68688Q();
        }
        if (iM68688Q == 16) {
            long j11 = this.f56609k;
            int i11 = (int) j11;
            if (j11 == i11) {
                this.f56608j = 0;
                int[] iArr = this.f56544e;
                int i12 = this.f56541b - 1;
                iArr[i12] = iArr[i12] + 1;
                return i11;
            }
            throw new JsonDataException("Expected an int but was " + this.f56609k + " at path " + getPath());
        }
        if (iM68688Q == 17) {
            this.f56611m = this.f56607i.readUtf8(this.f56610l);
        } else if (iM68688Q == 9 || iM68688Q == 8) {
            String strM68694W = iM68688Q == 9 ? m68694W(f56602o) : m68694W(f56601n);
            this.f56611m = strM68694W;
            try {
                int i13 = Integer.parseInt(strM68694W);
                this.f56608j = 0;
                int[] iArr2 = this.f56544e;
                int i14 = this.f56541b - 1;
                iArr2[i14] = iArr2[i14] + 1;
                return i13;
            } catch (NumberFormatException unused) {
            }
        } else if (iM68688Q != 11) {
            throw new JsonDataException("Expected an int but was " + mo68644v() + " at path " + getPath());
        }
        this.f56608j = 11;
        try {
            double d11 = Double.parseDouble(this.f56611m);
            int i15 = (int) d11;
            if (i15 == d11) {
                this.f56611m = null;
                this.f56608j = 0;
                int[] iArr3 = this.f56544e;
                int i16 = this.f56541b - 1;
                iArr3[i16] = iArr3[i16] + 1;
                return i15;
            }
            throw new JsonDataException("Expected an int but was " + this.f56611m + " at path " + getPath());
        } catch (NumberFormatException unused2) {
            throw new JsonDataException("Expected an int but was " + this.f56611m + " at path " + getPath());
        }
    }

    @Override // com.squareup.moshi.JsonReader
    /* JADX INFO: renamed from: o */
    public long mo68641o() throws IOException {
        int iM68688Q = this.f56608j;
        if (iM68688Q == 0) {
            iM68688Q = m68688Q();
        }
        if (iM68688Q == 16) {
            this.f56608j = 0;
            int[] iArr = this.f56544e;
            int i11 = this.f56541b - 1;
            iArr[i11] = iArr[i11] + 1;
            return this.f56609k;
        }
        if (iM68688Q == 17) {
            this.f56611m = this.f56607i.readUtf8(this.f56610l);
        } else if (iM68688Q == 9 || iM68688Q == 8) {
            String strM68694W = iM68688Q == 9 ? m68694W(f56602o) : m68694W(f56601n);
            this.f56611m = strM68694W;
            try {
                long j11 = Long.parseLong(strM68694W);
                this.f56608j = 0;
                int[] iArr2 = this.f56544e;
                int i12 = this.f56541b - 1;
                iArr2[i12] = iArr2[i12] + 1;
                return j11;
            } catch (NumberFormatException unused) {
            }
        } else if (iM68688Q != 11) {
            throw new JsonDataException("Expected a long but was " + mo68644v() + " at path " + getPath());
        }
        this.f56608j = 11;
        try {
            long jLongValueExact = new BigDecimal(this.f56611m).longValueExact();
            this.f56611m = null;
            this.f56608j = 0;
            int[] iArr3 = this.f56544e;
            int i13 = this.f56541b - 1;
            iArr3[i13] = iArr3[i13] + 1;
            return jLongValueExact;
        } catch (ArithmeticException | NumberFormatException unused2) {
            throw new JsonDataException("Expected a long but was " + this.f56611m + " at path " + getPath());
        }
    }

    @Override // com.squareup.moshi.JsonReader
    /* JADX INFO: renamed from: p */
    public <T> T mo68642p() throws IOException {
        int iM68688Q = this.f56608j;
        if (iM68688Q == 0) {
            iM68688Q = m68688Q();
        }
        if (iM68688Q == 7) {
            this.f56608j = 0;
            int[] iArr = this.f56544e;
            int i11 = this.f56541b - 1;
            iArr[i11] = iArr[i11] + 1;
            return null;
        }
        throw new JsonDataException("Expected null but was " + mo68644v() + " at path " + getPath());
    }

    @Override // com.squareup.moshi.JsonReader
    /* JADX INFO: renamed from: q */
    public String mo68643q() throws IOException {
        String utf8;
        int iM68688Q = this.f56608j;
        if (iM68688Q == 0) {
            iM68688Q = m68688Q();
        }
        if (iM68688Q == 10) {
            utf8 = m68695X();
        } else if (iM68688Q == 9) {
            utf8 = m68694W(f56602o);
        } else if (iM68688Q == 8) {
            utf8 = m68694W(f56601n);
        } else if (iM68688Q == 11) {
            utf8 = this.f56611m;
            this.f56611m = null;
        } else if (iM68688Q == 16) {
            utf8 = Long.toString(this.f56609k);
        } else {
            if (iM68688Q != 17) {
                throw new JsonDataException("Expected a string but was " + mo68644v() + " at path " + getPath());
            }
            utf8 = this.f56607i.readUtf8(this.f56610l);
        }
        this.f56608j = 0;
        int[] iArr = this.f56544e;
        int i11 = this.f56541b - 1;
        iArr[i11] = iArr[i11] + 1;
        return utf8;
    }

    public String toString() {
        return "JsonReader(" + this.f56606h + ")";
    }

    @Override // com.squareup.moshi.JsonReader
    /* JADX INFO: renamed from: v */
    public JsonReader.Token mo68644v() throws IOException {
        int iM68688Q = this.f56608j;
        if (iM68688Q == 0) {
            iM68688Q = m68688Q();
        }
        switch (iM68688Q) {
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

    @Override // com.squareup.moshi.JsonReader
    /* JADX INFO: renamed from: z */
    public int mo68647z(JsonReader.C27787a c27787a) throws IOException {
        int iM68688Q = this.f56608j;
        if (iM68688Q == 0) {
            iM68688Q = m68688Q();
        }
        if (iM68688Q < 12 || iM68688Q > 15) {
            return -1;
        }
        if (iM68688Q == 15) {
            return m68689R(this.f56611m, c27787a);
        }
        int iSelect = this.f56606h.select(c27787a.f56549b);
        if (iSelect != -1) {
            this.f56608j = 0;
            this.f56543d[this.f56541b - 1] = c27787a.f56548a[iSelect];
            return iSelect;
        }
        String str = this.f56543d[this.f56541b - 1];
        String strM68692U = m68692U();
        int iM68689R = m68689R(strM68692U, c27787a);
        if (iM68689R == -1) {
            this.f56608j = 15;
            this.f56611m = strM68692U;
            this.f56543d[this.f56541b - 1] = str;
        }
        return iM68689R;
    }

    public C27804j(BufferedSource bufferedSource) {
        if (bufferedSource != null) {
            this.f56606h = bufferedSource;
            this.f56607i = bufferedSource.getBuffer();
            m68646x(6);
            return;
        }
        throw new NullPointerException("source == null");
    }

    @Override // com.squareup.moshi.JsonReader
    /* JADX INFO: renamed from: w */
    public void mo68645w() throws IOException {
        if (mo68636j()) {
            this.f56611m = m68692U();
            this.f56608j = 11;
        }
    }
}
