package p334i7;

/* JADX INFO: renamed from: i7.g */
/* JADX INFO: compiled from: ReaderBasedJsonParser.java */
/* JADX INFO: loaded from: classes45.dex */
public class C38469g extends p254f7.AbstractC37385b {

    /* JADX INFO: renamed from: c0 */
    public static final int f86335c0 = 0;

    /* JADX INFO: renamed from: d0 */
    public static final int f86336d0 = 0;

    /* JADX INFO: renamed from: e0 */
    public static final int f86337e0 = 0;

    /* JADX INFO: renamed from: f0 */
    public static final int f86338f0 = 0;

    /* JADX INFO: renamed from: g0 */
    public static final int f86339g0 = 0;

    /* JADX INFO: renamed from: h0 */
    public static final int f86340h0 = 0;

    /* JADX INFO: renamed from: i0 */
    public static final int f86341i0 = 0;

    /* JADX INFO: renamed from: j0 */
    public static final int f86342j0 = 0;

    /* JADX INFO: renamed from: k0 */
    public static final int[] f86343k0 = null;

    /* JADX INFO: renamed from: S */
    public java.io.Reader f86344S;

    /* JADX INFO: renamed from: T */
    public char[] f86345T;

    /* JADX INFO: renamed from: U */
    public boolean f86346U;

    /* JADX INFO: renamed from: V */
    public com.fasterxml.jackson.core.AbstractC6304g f86347V;

    /* JADX INFO: renamed from: W */
    public final p395k7.C40936b f86348W;

    /* JADX INFO: renamed from: X */
    public final int f86349X;

    /* JADX INFO: renamed from: Y */
    public boolean f86350Y;

    /* JADX INFO: renamed from: Z */
    public long f86351Z;

    /* JADX INFO: renamed from: a0 */
    public int f86352a0;

    /* JADX INFO: renamed from: b0 */
    public int f86353b0;

    static {
            com.fasterxml.jackson.core.JsonParser$Feature r0 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_TRAILING_COMMA
            int r0 = r0.getMask()
            p334i7.C38469g.f86335c0 = r0
            com.fasterxml.jackson.core.JsonParser$Feature r0 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NUMERIC_LEADING_ZEROS
            int r0 = r0.getMask()
            p334i7.C38469g.f86336d0 = r0
            com.fasterxml.jackson.core.JsonParser$Feature r0 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS
            int r0 = r0.getMask()
            p334i7.C38469g.f86337e0 = r0
            com.fasterxml.jackson.core.JsonParser$Feature r0 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_MISSING_VALUES
            int r0 = r0.getMask()
            p334i7.C38469g.f86338f0 = r0
            com.fasterxml.jackson.core.JsonParser$Feature r0 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_SINGLE_QUOTES
            int r0 = r0.getMask()
            p334i7.C38469g.f86339g0 = r0
            com.fasterxml.jackson.core.JsonParser$Feature r0 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES
            int r0 = r0.getMask()
            p334i7.C38469g.f86340h0 = r0
            com.fasterxml.jackson.core.JsonParser$Feature r0 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_COMMENTS
            int r0 = r0.getMask()
            p334i7.C38469g.f86341i0 = r0
            com.fasterxml.jackson.core.JsonParser$Feature r0 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS
            int r0 = r0.getMask()
            p334i7.C38469g.f86342j0 = r0
            int[] r0 = com.fasterxml.jackson.core.p062io.C6308b.m10968h()
            p334i7.C38469g.f86343k0 = r0
            return
    }

    public C38469g(com.fasterxml.jackson.core.p062io.C6310d r1, int r2, java.io.Reader r3, com.fasterxml.jackson.core.AbstractC6304g r4, p395k7.C40936b r5) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.f86344S = r3
            char[] r1 = r1.m10981h()
            r0.f86345T = r1
            r1 = 0
            r0.f82963s = r1
            r0.f82964t = r1
            r0.f86347V = r4
            r0.f86348W = r5
            int r1 = r5.m89700m()
            r0.f86349X = r1
            r1 = 1
            r0.f86346U = r1
            return
    }

    public C38469g(com.fasterxml.jackson.core.p062io.C6310d r1, int r2, java.io.Reader r3, com.fasterxml.jackson.core.AbstractC6304g r4, p395k7.C40936b r5, char[] r6, int r7, int r8, boolean r9) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.f86344S = r3
            r0.f86347V = r4
            r0.f86345T = r6
            r0.f82963s = r7
            r0.f82964t = r8
            r0.f82967w = r7
            int r1 = -r7
            long r1 = (long) r1
            r0.f82965u = r1
            r0.f86348W = r5
            int r1 = r5.m89700m()
            r0.f86349X = r1
            r0.f86346U = r9
            return
    }

    /* JADX INFO: renamed from: Y1 */
    private final void m86822Y1() throws java.io.IOException {
            r4 = this;
            int r0 = r4.f82963s
            int r1 = r0 + 4
            int r2 = r4.f82964t
            if (r1 >= r2) goto L3b
            char[] r1 = r4.f86345T
            char r2 = r1[r0]
            r3 = 97
            if (r2 != r3) goto L3b
            int r2 = r0 + 1
            char r2 = r1[r2]
            r3 = 108(0x6c, float:1.51E-43)
            if (r2 != r3) goto L3b
            int r2 = r0 + 2
            char r2 = r1[r2]
            r3 = 115(0x73, float:1.61E-43)
            if (r2 != r3) goto L3b
            int r2 = r0 + 3
            char r2 = r1[r2]
            r3 = 101(0x65, float:1.42E-43)
            if (r2 != r3) goto L3b
            int r0 = r0 + 4
            char r1 = r1[r0]
            r2 = 48
            if (r1 < r2) goto L38
            r2 = 93
            if (r1 == r2) goto L38
            r2 = 125(0x7d, float:1.75E-43)
            if (r1 != r2) goto L3b
        L38:
            r4.f82963s = r0
            return
        L3b:
            java.lang.String r0 = "false"
            r1 = 1
            r4.m86847a2(r0, r1)
            return
    }

    /* JADX INFO: renamed from: Z1 */
    private final void m86823Z1() throws java.io.IOException {
            r4 = this;
            int r0 = r4.f82963s
            int r1 = r0 + 3
            int r2 = r4.f82964t
            if (r1 >= r2) goto L31
            char[] r1 = r4.f86345T
            char r2 = r1[r0]
            r3 = 117(0x75, float:1.64E-43)
            if (r2 != r3) goto L31
            int r2 = r0 + 1
            char r2 = r1[r2]
            r3 = 108(0x6c, float:1.51E-43)
            if (r2 != r3) goto L31
            int r2 = r0 + 2
            char r2 = r1[r2]
            if (r2 != r3) goto L31
            int r0 = r0 + 3
            char r1 = r1[r0]
            r2 = 48
            if (r1 < r2) goto L2e
            r2 = 93
            if (r1 == r2) goto L2e
            r2 = 125(0x7d, float:1.75E-43)
            if (r1 != r2) goto L31
        L2e:
            r4.f82963s = r0
            return
        L31:
            java.lang.String r0 = "null"
            r1 = 1
            r4.m86847a2(r0, r1)
            return
    }

    /* JADX INFO: renamed from: c2 */
    private final void m86824c2() throws java.io.IOException {
            r4 = this;
            int r0 = r4.f82963s
            int r1 = r0 + 3
            int r2 = r4.f82964t
            if (r1 >= r2) goto L33
            char[] r1 = r4.f86345T
            char r2 = r1[r0]
            r3 = 114(0x72, float:1.6E-43)
            if (r2 != r3) goto L33
            int r2 = r0 + 1
            char r2 = r1[r2]
            r3 = 117(0x75, float:1.64E-43)
            if (r2 != r3) goto L33
            int r2 = r0 + 2
            char r2 = r1[r2]
            r3 = 101(0x65, float:1.42E-43)
            if (r2 != r3) goto L33
            int r0 = r0 + 3
            char r1 = r1[r0]
            r2 = 48
            if (r1 < r2) goto L30
            r2 = 93
            if (r1 == r2) goto L30
            r2 = 125(0x7d, float:1.75E-43)
            if (r1 != r2) goto L33
        L30:
            r4.f82963s = r0
            return
        L33:
            java.lang.String r0 = "true"
            r1 = 1
            r4.m86847a2(r0, r1)
            return
    }

    /* JADX INFO: renamed from: A2 */
    public final int m86825A2() throws java.io.IOException {
            r3 = this;
        L0:
            int r0 = r3.f82963s
            int r1 = r3.f82964t
            if (r0 < r1) goto L11
            boolean r0 = r3.m86845W1()
            if (r0 != 0) goto L11
            int r0 = r3.m84071k1()
            return r0
        L11:
            char[] r0 = r3.f86345T
            int r1 = r3.f82963s
            int r2 = r1 + 1
            r3.f82963s = r2
            char r0 = r0[r1]
            r1 = 32
            if (r0 <= r1) goto L33
            r1 = 47
            if (r0 != r1) goto L27
            r3.m86868w2()
            goto L0
        L27:
            r1 = 35
            if (r0 != r1) goto L32
            boolean r1 = r3.m86826B2()
            if (r1 == 0) goto L32
            goto L0
        L32:
            return r0
        L33:
            if (r0 == r1) goto L0
            r1 = 10
            if (r0 != r1) goto L42
            int r0 = r3.f82966v
            int r0 = r0 + 1
            r3.f82966v = r0
            r3.f82967w = r2
            goto L0
        L42:
            r1 = 13
            if (r0 != r1) goto L4a
            r3.m86864s2()
            goto L0
        L4a:
            r1 = 9
            if (r0 == r1) goto L0
            r3.m84103U0(r0)
            goto L0
    }

    /* JADX INFO: renamed from: B2 */
    public final boolean m86826B2() throws java.io.IOException {
            r2 = this;
            int r0 = r2.f10027b
            int r1 = p334i7.C38469g.f86342j0
            r0 = r0 & r1
            if (r0 != 0) goto L9
            r0 = 0
            return r0
        L9:
            r2.m86869x2()
            r0 = 1
            return r0
    }

    /* JADX INFO: renamed from: C2 */
    public final void m86827C2() {
            r5 = this;
            int r0 = r5.f82963s
            long r1 = r5.f82965u
            long r3 = (long) r0
            long r1 = r1 + r3
            r5.f82968x = r1
            int r1 = r5.f82966v
            r5.f82969y = r1
            int r1 = r5.f82967w
            int r0 = r0 - r1
            r5.f82970z = r0
            return
    }

    /* JADX INFO: renamed from: D2 */
    public final void m86828D2() {
            r3 = this;
            int r0 = r3.f82963s
            long r1 = (long) r0
            r3.f86351Z = r1
            int r1 = r3.f82966v
            r3.f86352a0 = r1
            int r1 = r3.f82967w
            int r0 = r0 - r1
            r3.f86353b0 = r0
            return
    }

    /* JADX INFO: renamed from: E2 */
    public final char m86829E2() throws java.io.IOException {
            r5 = this;
            int r0 = r5.f82963s
            int r1 = r5.f82964t
            r2 = 48
            if (r0 < r1) goto Lf
            boolean r0 = r5.m86845W1()
            if (r0 != 0) goto Lf
            return r2
        Lf:
            char[] r0 = r5.f86345T
            int r1 = r5.f82963s
            char r0 = r0[r1]
            if (r0 < r2) goto L52
            r1 = 57
            if (r0 <= r1) goto L1c
            goto L52
        L1c:
            int r3 = r5.f10027b
            int r4 = p334i7.C38469g.f86336d0
            r3 = r3 & r4
            if (r3 != 0) goto L28
            java.lang.String r3 = "Leading zeroes not allowed"
            r5.m84105W0(r3)
        L28:
            int r3 = r5.f82963s
            int r3 = r3 + 1
            r5.f82963s = r3
            if (r0 != r2) goto L51
        L30:
            int r3 = r5.f82963s
            int r4 = r5.f82964t
            if (r3 < r4) goto L3e
            boolean r3 = r5.m86845W1()
            if (r3 == 0) goto L3d
            goto L3e
        L3d:
            return r0
        L3e:
            char[] r0 = r5.f86345T
            int r3 = r5.f82963s
            char r0 = r0[r3]
            if (r0 < r2) goto L50
            if (r0 <= r1) goto L49
            goto L50
        L49:
            int r3 = r3 + 1
            r5.f82963s = r3
            if (r0 == r2) goto L30
            return r0
        L50:
            return r2
        L51:
            return r0
        L52:
            return r2
    }

    /* JADX INFO: renamed from: F2 */
    public final char m86830F2() throws java.io.IOException {
            r3 = this;
            int r0 = r3.f82963s
            int r1 = r3.f82964t
            if (r0 >= r1) goto L13
            char[] r1 = r3.f86345T
            char r0 = r1[r0]
            r1 = 48
            if (r0 < r1) goto L12
            r2 = 57
            if (r0 <= r2) goto L13
        L12:
            return r1
        L13:
            char r0 = r3.m86829E2()
            return r0
    }

    /* JADX INFO: renamed from: G2 */
    public final void m86831G2(int r3) throws java.io.IOException {
            r2 = this;
            int r0 = r2.f82963s
            int r0 = r0 + 1
            r2.f82963s = r0
            r1 = 9
            if (r3 == r1) goto L26
            r1 = 10
            if (r3 == r1) goto L1e
            r0 = 13
            if (r3 == r0) goto L1a
            r0 = 32
            if (r3 == r0) goto L26
            r2.m84100R0(r3)
            return
        L1a:
            r2.m86864s2()
            return
        L1e:
            int r3 = r2.f82966v
            int r3 = r3 + 1
            r2.f82966v = r3
            r2.f82967w = r0
        L26:
            return
    }

    @java.lang.Deprecated
    /* JADX INFO: renamed from: H2 */
    public char m86832H2(java.lang.String r2) throws java.io.IOException {
            r1 = this;
            r0 = 0
            char r2 = r1.m86833I2(r2, r0)
            return r2
    }

    /* JADX INFO: renamed from: I2 */
    public char m86833I2(java.lang.String r3, com.fasterxml.jackson.core.JsonToken r4) throws java.io.IOException {
            r2 = this;
            int r0 = r2.f82963s
            int r1 = r2.f82964t
            if (r0 < r1) goto Lf
            boolean r0 = r2.m86845W1()
            if (r0 != 0) goto Lf
            r2.m84098P0(r3, r4)
        Lf:
            char[] r3 = r2.f86345T
            int r4 = r2.f82963s
            int r0 = r4 + 1
            r2.f82963s = r0
            char r3 = r3[r4]
            return r3
    }

    /* JADX INFO: renamed from: L1 */
    public final void m86834L1(java.lang.String r1, int r2, int r3) throws java.io.IOException {
            r0 = this;
            char r3 = (char) r3
            boolean r3 = java.lang.Character.isJavaIdentifierPart(r3)
            if (r3 == 0) goto Lf
            r3 = 0
            java.lang.String r1 = r1.substring(r3, r2)
            r0.m86860o2(r1)
        Lf:
            return
    }

    /* JADX INFO: renamed from: M1 */
    public final void m86835M1(int r4) throws com.fasterxml.jackson.core.JsonParseException {
            r3 = this;
            r0 = 125(0x7d, float:1.75E-43)
            r1 = 93
            if (r4 != r1) goto L20
            r3.m86827C2()
            i7.d r2 = r3.f82944A
            boolean r2 = r2.m10937f()
            if (r2 != 0) goto L14
            r3.m84080t1(r4, r0)
        L14:
            i7.d r2 = r3.f82944A
            i7.d r2 = r2.m86798l()
            r3.f82944A = r2
            com.fasterxml.jackson.core.JsonToken r2 = com.fasterxml.jackson.core.JsonToken.END_ARRAY
            r3.f82981e = r2
        L20:
            if (r4 != r0) goto L3c
            r3.m86827C2()
            i7.d r0 = r3.f82944A
            boolean r0 = r0.m10938g()
            if (r0 != 0) goto L30
            r3.m84080t1(r4, r1)
        L30:
            i7.d r4 = r3.f82944A
            i7.d r4 = r4.m86798l()
            r3.f82944A = r4
            com.fasterxml.jackson.core.JsonToken r4 = com.fasterxml.jackson.core.JsonToken.END_OBJECT
            r3.f82981e = r4
        L3c:
            return
    }

    /* JADX INFO: renamed from: N1 */
    public byte[] m86836N1(com.fasterxml.jackson.core.Base64Variant r11) throws java.io.IOException {
            r10 = this;
            com.fasterxml.jackson.core.util.c r0 = r10.m84072l1()
        L4:
            int r1 = r10.f82963s
            int r2 = r10.f82964t
            if (r1 < r2) goto Ld
            r10.m86846X1()
        Ld:
            char[] r1 = r10.f86345T
            int r2 = r10.f82963s
            int r3 = r2 + 1
            r10.f82963s = r3
            char r1 = r1[r2]
            r2 = 32
            if (r1 <= r2) goto L4
            int r2 = r11.decodeBase64Char(r1)
            r3 = 34
            if (r2 >= 0) goto L32
            if (r1 != r3) goto L2a
            byte[] r11 = r0.m11079q()
            return r11
        L2a:
            r2 = 0
            int r2 = r10.m84068h1(r11, r1, r2)
            if (r2 >= 0) goto L32
            goto L4
        L32:
            int r1 = r10.f82963s
            int r4 = r10.f82964t
            if (r1 < r4) goto L3b
            r10.m86846X1()
        L3b:
            char[] r1 = r10.f86345T
            int r4 = r10.f82963s
            int r5 = r4 + 1
            r10.f82963s = r5
            char r1 = r1[r4]
            int r4 = r11.decodeBase64Char(r1)
            r5 = 1
            if (r4 >= 0) goto L50
            int r4 = r10.m84068h1(r11, r1, r5)
        L50:
            int r1 = r2 << 6
            r1 = r1 | r4
            int r2 = r10.f82963s
            int r4 = r10.f82964t
            if (r2 < r4) goto L5c
            r10.m86846X1()
        L5c:
            char[] r2 = r10.f86345T
            int r4 = r10.f82963s
            int r6 = r4 + 1
            r10.f82963s = r6
            char r2 = r2[r4]
            int r4 = r11.decodeBase64Char(r2)
            r6 = 3
            r7 = 2
            r8 = -2
            if (r4 >= 0) goto Ld7
            if (r4 == r8) goto L8f
            if (r2 != r3) goto L8b
            int r1 = r1 >> 4
            r0.m11069b(r1)
            boolean r1 = r11.usesPadding()
            if (r1 == 0) goto L86
            int r1 = r10.f82963s
            int r1 = r1 - r5
            r10.f82963s = r1
            r10.m84073m1(r11)
        L86:
            byte[] r11 = r0.m11079q()
            return r11
        L8b:
            int r4 = r10.m84068h1(r11, r2, r7)
        L8f:
            if (r4 != r8) goto Ld7
            int r2 = r10.f82963s
            int r3 = r10.f82964t
            if (r2 < r3) goto L9a
            r10.m86846X1()
        L9a:
            char[] r2 = r10.f86345T
            int r3 = r10.f82963s
            int r4 = r3 + 1
            r10.f82963s = r4
            char r2 = r2[r3]
            boolean r3 = r11.usesPaddingChar(r2)
            if (r3 != 0) goto Ld0
            int r3 = r10.m84068h1(r11, r2, r6)
            if (r3 != r8) goto Lb1
            goto Ld0
        Lb1:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "expected padding character '"
            r0.append(r1)
            char r1 = r11.getPaddingChar()
            r0.append(r1)
            java.lang.String r1 = "'"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.IllegalArgumentException r11 = r10.m84060G1(r11, r2, r6, r0)
            throw r11
        Ld0:
            int r1 = r1 >> 4
            r0.m11069b(r1)
            goto L4
        Ld7:
            int r1 = r1 << 6
            r1 = r1 | r4
            int r2 = r10.f82963s
            int r4 = r10.f82964t
            if (r2 < r4) goto Le3
            r10.m86846X1()
        Le3:
            char[] r2 = r10.f86345T
            int r4 = r10.f82963s
            int r9 = r4 + 1
            r10.f82963s = r9
            char r2 = r2[r4]
            int r4 = r11.decodeBase64Char(r2)
            if (r4 >= 0) goto L11b
            if (r4 == r8) goto L112
            if (r2 != r3) goto L10e
            int r1 = r1 >> r7
            r0.m11071h(r1)
            boolean r1 = r11.usesPadding()
            if (r1 == 0) goto L109
            int r1 = r10.f82963s
            int r1 = r1 - r5
            r10.f82963s = r1
            r10.m84073m1(r11)
        L109:
            byte[] r11 = r0.m11079q()
            return r11
        L10e:
            int r4 = r10.m84068h1(r11, r2, r6)
        L112:
            if (r4 != r8) goto L11b
            int r1 = r1 >> 2
            r0.m11071h(r1)
            goto L4
        L11b:
            int r1 = r1 << 6
            r1 = r1 | r4
            r0.m11070g(r1)
            goto L4
    }

    /* JADX INFO: renamed from: O1 */
    public final void m86837O1() throws java.io.IOException {
            r7 = this;
            int r0 = r7.f82963s
            int r1 = r7.f82964t
            if (r0 >= r1) goto L29
            int[] r2 = p334i7.C38469g.f86343k0
            int r3 = r2.length
        L9:
            char[] r4 = r7.f86345T
            char r5 = r4[r0]
            if (r5 >= r3) goto L25
            r6 = r2[r5]
            if (r6 == 0) goto L25
            r1 = 34
            if (r5 != r1) goto L29
            com.fasterxml.jackson.core.util.i r1 = r7.f82946C
            int r2 = r7.f82963s
            int r3 = r0 - r2
            r1.m11088A(r4, r2, r3)
            int r0 = r0 + 1
            r7.f82963s = r0
            return
        L25:
            int r0 = r0 + 1
            if (r0 < r1) goto L9
        L29:
            com.fasterxml.jackson.core.util.i r1 = r7.f82946C
            char[] r2 = r7.f86345T
            int r3 = r7.f82963s
            int r4 = r0 - r3
            r1.m11119z(r2, r3, r4)
            r7.f82963s = r0
            r7.m86838P1()
            return
    }

    /* JADX INFO: renamed from: P1 */
    public void m86838P1() throws java.io.IOException {
            r7 = this;
            com.fasterxml.jackson.core.util.i r0 = r7.f82946C
            char[] r0 = r0.m11112s()
            com.fasterxml.jackson.core.util.i r1 = r7.f82946C
            int r1 = r1.m11113t()
            int[] r2 = p334i7.C38469g.f86343k0
            int r3 = r2.length
        Lf:
            int r4 = r7.f82963s
            int r5 = r7.f82964t
            if (r4 < r5) goto L22
            boolean r4 = r7.m86845W1()
            if (r4 != 0) goto L22
            java.lang.String r4 = ": was expecting closing quote for a string value"
            com.fasterxml.jackson.core.JsonToken r5 = com.fasterxml.jackson.core.JsonToken.VALUE_STRING
            r7.m84098P0(r4, r5)
        L22:
            char[] r4 = r7.f86345T
            int r5 = r7.f82963s
            int r6 = r5 + 1
            r7.f82963s = r6
            char r4 = r4[r5]
            if (r4 >= r3) goto L4f
            r5 = r2[r4]
            if (r5 == 0) goto L4f
            r5 = 34
            if (r4 != r5) goto L3c
            com.fasterxml.jackson.core.util.i r0 = r7.f82946C
            r0.m11092E(r1)
            return
        L3c:
            r5 = 92
            if (r4 != r5) goto L45
            char r4 = r7.mo84070j1()
            goto L4f
        L45:
            r5 = 32
            if (r4 >= r5) goto L4f
            java.lang.String r5 = "string value"
            r7.m84082v1(r4, r5)
        L4f:
            int r5 = r0.length
            if (r1 < r5) goto L59
            com.fasterxml.jackson.core.util.i r0 = r7.f82946C
            char[] r0 = r0.m11110p()
            r1 = 0
        L59:
            int r5 = r1 + 1
            r0[r1] = r4
            r1 = r5
            goto Lf
    }

    /* JADX INFO: renamed from: Q1 */
    public final java.lang.String m86839Q1(com.fasterxml.jackson.core.JsonToken r3) {
            r2 = this;
            if (r3 != 0) goto L4
            r3 = 0
            return r3
        L4:
            int r0 = r3.m10917id()
            r1 = 5
            if (r0 == r1) goto L21
            r1 = 6
            if (r0 == r1) goto L1a
            r1 = 7
            if (r0 == r1) goto L1a
            r1 = 8
            if (r0 == r1) goto L1a
            java.lang.String r3 = r3.asString()
            return r3
        L1a:
            com.fasterxml.jackson.core.util.i r3 = r2.f82946C
            java.lang.String r3 = r3.m11106l()
            return r3
        L21:
            i7.d r3 = r2.f82944A
            java.lang.String r3 = r3.mo10933b()
            return r3
    }

    /* JADX INFO: renamed from: R1 */
    public com.fasterxml.jackson.core.JsonToken m86840R1() throws java.io.IOException {
            r5 = this;
            com.fasterxml.jackson.core.util.i r0 = r5.f82946C
            char[] r0 = r0.m11107m()
            com.fasterxml.jackson.core.util.i r1 = r5.f82946C
            int r1 = r1.m11113t()
        Lc:
            int r2 = r5.f82963s
            int r3 = r5.f82964t
            if (r2 < r3) goto L1f
            boolean r2 = r5.m86845W1()
            if (r2 != 0) goto L1f
            java.lang.String r2 = ": was expecting closing quote for a string value"
            com.fasterxml.jackson.core.JsonToken r3 = com.fasterxml.jackson.core.JsonToken.VALUE_STRING
            r5.m84098P0(r2, r3)
        L1f:
            char[] r2 = r5.f86345T
            int r3 = r5.f82963s
            int r4 = r3 + 1
            r5.f82963s = r4
            char r2 = r2[r3]
            r3 = 92
            if (r2 > r3) goto L4c
            if (r2 != r3) goto L34
            char r2 = r5.mo84070j1()
            goto L4c
        L34:
            r3 = 39
            if (r2 > r3) goto L4c
            if (r2 != r3) goto L42
            com.fasterxml.jackson.core.util.i r0 = r5.f82946C
            r0.m11092E(r1)
            com.fasterxml.jackson.core.JsonToken r0 = com.fasterxml.jackson.core.JsonToken.VALUE_STRING
            return r0
        L42:
            r3 = 32
            if (r2 >= r3) goto L4c
            java.lang.String r3 = "string value"
            r5.m84082v1(r2, r3)
        L4c:
            int r3 = r0.length
            if (r1 < r3) goto L56
            com.fasterxml.jackson.core.util.i r0 = r5.f82946C
            char[] r0 = r0.m11110p()
            r1 = 0
        L56:
            int r3 = r1 + 1
            r0[r1] = r2
            r1 = r3
            goto Lc
    }

    /* JADX INFO: renamed from: S1 */
    public com.fasterxml.jackson.core.JsonToken m86841S1(int r10, boolean r11) throws java.io.IOException {
            r9 = this;
            r0 = 73
            if (r10 != r0) goto L8d
            int r10 = r9.f82963s
            int r0 = r9.f82964t
            if (r10 < r0) goto L15
            boolean r10 = r9.m86845W1()
            if (r10 != 0) goto L15
            com.fasterxml.jackson.core.JsonToken r10 = com.fasterxml.jackson.core.JsonToken.VALUE_NUMBER_INT
            r9.m84099Q0(r10)
        L15:
            char[] r10 = r9.f86345T
            int r0 = r9.f82963s
            int r1 = r0 + 1
            r9.f82963s = r1
            char r10 = r10[r0]
            r0 = 78
            java.lang.String r1 = "': enable JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS to allow"
            java.lang.String r2 = "Non-standard token '"
            r3 = 9218868437227405312(0x7ff0000000000000, double:Infinity)
            r5 = -4503599627370496(0xfff0000000000000, double:-Infinity)
            r7 = 3
            if (r10 != r0) goto L5b
            if (r11 == 0) goto L31
            java.lang.String r0 = "-INF"
            goto L33
        L31:
            java.lang.String r0 = "+INF"
        L33:
            r9.m86847a2(r0, r7)
            int r7 = r9.f10027b
            int r8 = p334i7.C38469g.f86337e0
            r7 = r7 & r8
            if (r7 == 0) goto L45
            if (r11 == 0) goto L40
            r3 = r5
        L40:
            com.fasterxml.jackson.core.JsonToken r10 = r9.m84062I1(r0, r3)
            return r10
        L45:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r2)
            r11.append(r0)
            r11.append(r1)
            java.lang.String r11 = r11.toString()
            r9.m84093K0(r11)
            goto L8d
        L5b:
            r0 = 110(0x6e, float:1.54E-43)
            if (r10 != r0) goto L8d
            if (r11 == 0) goto L64
            java.lang.String r0 = "-Infinity"
            goto L66
        L64:
            java.lang.String r0 = "+Infinity"
        L66:
            r9.m86847a2(r0, r7)
            int r7 = r9.f10027b
            int r8 = p334i7.C38469g.f86337e0
            r7 = r7 & r8
            if (r7 == 0) goto L78
            if (r11 == 0) goto L73
            r3 = r5
        L73:
            com.fasterxml.jackson.core.JsonToken r10 = r9.m84062I1(r0, r3)
            return r10
        L78:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r2)
            r11.append(r0)
            r11.append(r1)
            java.lang.String r11 = r11.toString()
            r9.m84093K0(r11)
        L8d:
            java.lang.String r11 = "expected digit (0-9) to follow minus sign, for valid numeric value"
            r9.m84112d1(r10, r11)
            r10 = 0
            return r10
    }

    /* JADX INFO: renamed from: T1 */
    public java.lang.String m86842T1(int r9) throws java.io.IOException {
            r8 = this;
            r0 = 39
            if (r9 != r0) goto L10
            int r0 = r8.f10027b
            int r1 = p334i7.C38469g.f86339g0
            r0 = r0 & r1
            if (r0 == 0) goto L10
            java.lang.String r9 = r8.m86851f2()
            return r9
        L10:
            int r0 = r8.f10027b
            int r1 = p334i7.C38469g.f86340h0
            r0 = r0 & r1
            if (r0 != 0) goto L1d
            java.lang.String r0 = "was expecting double-quote to start field name"
            r8.m84101S0(r9, r0)
        L1d:
            int[] r0 = com.fasterxml.jackson.core.p062io.C6308b.m10969i()
            int r1 = r0.length
            r2 = 1
            if (r9 >= r1) goto L2d
            r3 = r0[r9]
            if (r3 != 0) goto L2b
            r3 = r2
            goto L32
        L2b:
            r3 = 0
            goto L32
        L2d:
            char r3 = (char) r9
            boolean r3 = java.lang.Character.isJavaIdentifierPart(r3)
        L32:
            if (r3 != 0) goto L3a
            java.lang.String r3 = "was expecting either valid name character (for unquoted name) or double-quote (for quoted) to start field name"
            r8.m84101S0(r9, r3)
        L3a:
            int r9 = r8.f82963s
            int r3 = r8.f86349X
            int r4 = r8.f82964t
            if (r9 >= r4) goto L76
        L42:
            char[] r5 = r8.f86345T
            char r6 = r5[r9]
            if (r6 >= r1) goto L59
            r7 = r0[r6]
            if (r7 == 0) goto L6f
            int r0 = r8.f82963s
            int r0 = r0 - r2
            r8.f82963s = r9
            k7.b r1 = r8.f86348W
            int r9 = r9 - r0
            java.lang.String r9 = r1.m89699l(r5, r0, r9, r3)
            return r9
        L59:
            char r5 = (char) r6
            boolean r5 = java.lang.Character.isJavaIdentifierPart(r5)
            if (r5 != 0) goto L6f
            int r0 = r8.f82963s
            int r0 = r0 - r2
            r8.f82963s = r9
            k7.b r1 = r8.f86348W
            char[] r2 = r8.f86345T
            int r9 = r9 - r0
            java.lang.String r9 = r1.m89699l(r2, r0, r9, r3)
            return r9
        L6f:
            int r3 = r3 * 33
            int r3 = r3 + r6
            int r9 = r9 + 1
            if (r9 < r4) goto L42
        L76:
            int r1 = r8.f82963s
            int r1 = r1 - r2
            r8.f82963s = r9
            java.lang.String r9 = r8.m86843U1(r1, r3, r0)
            return r9
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    /* JADX INFO: renamed from: U */
    public com.fasterxml.jackson.core.util.C6327f<com.fasterxml.jackson.core.StreamReadCapability> mo10867U() {
            r1 = this;
            com.fasterxml.jackson.core.util.f<com.fasterxml.jackson.core.StreamReadCapability> r0 = p254f7.AbstractC37385b.f82943R
            return r0
    }

    /* JADX INFO: renamed from: U1 */
    public final java.lang.String m86843U1(int r5, int r6, int[] r7) throws java.io.IOException {
            r4 = this;
            com.fasterxml.jackson.core.util.i r0 = r4.f82946C
            char[] r1 = r4.f86345T
            int r2 = r4.f82963s
            int r2 = r2 - r5
            r0.m11088A(r1, r5, r2)
            com.fasterxml.jackson.core.util.i r5 = r4.f82946C
            char[] r5 = r5.m11112s()
            com.fasterxml.jackson.core.util.i r0 = r4.f82946C
            int r0 = r0.m11113t()
            int r1 = r7.length
        L17:
            int r2 = r4.f82963s
            int r3 = r4.f82964t
            if (r2 < r3) goto L24
            boolean r2 = r4.m86845W1()
            if (r2 != 0) goto L24
            goto L37
        L24:
            char[] r2 = r4.f86345T
            int r3 = r4.f82963s
            char r2 = r2[r3]
            if (r2 >= r1) goto L31
            r3 = r7[r2]
            if (r3 == 0) goto L51
            goto L37
        L31:
            boolean r3 = java.lang.Character.isJavaIdentifierPart(r2)
            if (r3 != 0) goto L51
        L37:
            com.fasterxml.jackson.core.util.i r5 = r4.f82946C
            r5.m11092E(r0)
            com.fasterxml.jackson.core.util.i r5 = r4.f82946C
            char[] r7 = r5.m11114u()
            int r0 = r5.m11115v()
            int r5 = r5.m11093F()
            k7.b r1 = r4.f86348W
            java.lang.String r5 = r1.m89699l(r7, r0, r5, r6)
            return r5
        L51:
            int r3 = r4.f82963s
            int r3 = r3 + 1
            r4.f82963s = r3
            int r6 = r6 * 33
            int r6 = r6 + r2
            int r3 = r0 + 1
            r5[r0] = r2
            int r0 = r5.length
            if (r3 < r0) goto L69
            com.fasterxml.jackson.core.util.i r5 = r4.f82946C
            char[] r5 = r5.m11110p()
            r0 = 0
            goto L17
        L69:
            r0 = r3
            goto L17
    }

    /* JADX INFO: renamed from: V1 */
    public com.fasterxml.jackson.core.JsonToken m86844V1(int r4) throws java.io.IOException {
            r3 = this;
            r0 = 39
            if (r4 == r0) goto L8e
            r0 = 73
            r1 = 1
            if (r4 == r0) goto L75
            r0 = 78
            if (r4 == r0) goto L5c
            r0 = 93
            if (r4 == r0) goto L3c
            r0 = 43
            if (r4 == r0) goto L1b
            r0 = 44
            if (r4 == r0) goto L45
            goto L9a
        L1b:
            int r4 = r3.f82963s
            int r0 = r3.f82964t
            if (r4 < r0) goto L2c
            boolean r4 = r3.m86845W1()
            if (r4 != 0) goto L2c
            com.fasterxml.jackson.core.JsonToken r4 = com.fasterxml.jackson.core.JsonToken.VALUE_NUMBER_INT
            r3.m84099Q0(r4)
        L2c:
            char[] r4 = r3.f86345T
            int r0 = r3.f82963s
            int r1 = r0 + 1
            r3.f82963s = r1
            char r4 = r4[r0]
            r0 = 0
            com.fasterxml.jackson.core.JsonToken r4 = r3.m86841S1(r4, r0)
            return r4
        L3c:
            i7.d r0 = r3.f82944A
            boolean r0 = r0.m10937f()
            if (r0 != 0) goto L45
            goto L9a
        L45:
            i7.d r0 = r3.f82944A
            boolean r0 = r0.m10939h()
            if (r0 != 0) goto L9a
            int r0 = r3.f10027b
            int r2 = p334i7.C38469g.f86338f0
            r0 = r0 & r2
            if (r0 == 0) goto L9a
            int r4 = r3.f82963s
            int r4 = r4 - r1
            r3.f82963s = r4
            com.fasterxml.jackson.core.JsonToken r4 = com.fasterxml.jackson.core.JsonToken.VALUE_NULL
            return r4
        L5c:
            java.lang.String r0 = "NaN"
            r3.m86847a2(r0, r1)
            int r1 = r3.f10027b
            int r2 = p334i7.C38469g.f86337e0
            r1 = r1 & r2
            if (r1 == 0) goto L6f
            r1 = 9221120237041090560(0x7ff8000000000000, double:NaN)
            com.fasterxml.jackson.core.JsonToken r4 = r3.m84062I1(r0, r1)
            return r4
        L6f:
            java.lang.String r0 = "Non-standard token 'NaN': enable JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS to allow"
            r3.m84093K0(r0)
            goto L9a
        L75:
            java.lang.String r0 = "Infinity"
            r3.m86847a2(r0, r1)
            int r1 = r3.f10027b
            int r2 = p334i7.C38469g.f86337e0
            r1 = r1 & r2
            if (r1 == 0) goto L88
            r1 = 9218868437227405312(0x7ff0000000000000, double:Infinity)
            com.fasterxml.jackson.core.JsonToken r4 = r3.m84062I1(r0, r1)
            return r4
        L88:
            java.lang.String r0 = "Non-standard token 'Infinity': enable JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS to allow"
            r3.m84093K0(r0)
            goto L9a
        L8e:
            int r0 = r3.f10027b
            int r1 = p334i7.C38469g.f86339g0
            r0 = r0 & r1
            if (r0 == 0) goto L9a
            com.fasterxml.jackson.core.JsonToken r4 = r3.m86840R1()
            return r4
        L9a:
            boolean r0 = java.lang.Character.isJavaIdentifierStart(r4)
            if (r0 == 0) goto Lb9
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = ""
            r0.append(r1)
            char r1 = (char) r4
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = r3.m84083w1()
            r3.m86861p2(r0, r1)
        Lb9:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "expected a valid value "
            r0.append(r1)
            java.lang.String r1 = r3.m84084x1()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r3.m84101S0(r4, r0)
            r4 = 0
            return r4
    }

    @Override // p254f7.AbstractC37386c, com.fasterxml.jackson.core.JsonParser
    /* JADX INFO: renamed from: W */
    public final java.lang.String mo10869W() throws java.io.IOException {
            r2 = this;
            com.fasterxml.jackson.core.JsonToken r0 = r2.f82981e
            com.fasterxml.jackson.core.JsonToken r1 = com.fasterxml.jackson.core.JsonToken.VALUE_STRING
            if (r0 != r1) goto L17
            boolean r0 = r2.f86350Y
            if (r0 == 0) goto L10
            r0 = 0
            r2.f86350Y = r0
            r2.m86837O1()
        L10:
            com.fasterxml.jackson.core.util.i r0 = r2.f82946C
            java.lang.String r0 = r0.m11106l()
            return r0
        L17:
            java.lang.String r0 = r2.m86839Q1(r0)
            return r0
    }

    /* JADX INFO: renamed from: W1 */
    public boolean m86845W1() throws java.io.IOException {
            r7 = this;
            java.io.Reader r0 = r7.f86344S
            r1 = 0
            if (r0 == 0) goto L45
            char[] r2 = r7.f86345T
            int r3 = r2.length
            int r0 = r0.read(r2, r1, r3)
            if (r0 <= 0) goto L26
            int r2 = r7.f82964t
            long r3 = r7.f82965u
            long r5 = (long) r2
            long r3 = r3 + r5
            r7.f82965u = r3
            int r3 = r7.f82967w
            int r3 = r3 - r2
            r7.f82967w = r3
            long r2 = r7.f86351Z
            long r2 = r2 - r5
            r7.f86351Z = r2
            r7.f82963s = r1
            r7.f82964t = r0
            r0 = 1
            return r0
        L26:
            r7.mo84066f1()
            if (r0 == 0) goto L2c
            goto L45
        L2c:
            java.io.IOException r0 = new java.io.IOException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Reader returned 0 characters when trying to read "
            r1.append(r2)
            int r2 = r7.f82964t
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L45:
            return r1
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    /* JADX INFO: renamed from: X */
    public final char[] mo10870X() throws java.io.IOException {
            r4 = this;
            com.fasterxml.jackson.core.JsonToken r0 = r4.f82981e
            if (r0 == 0) goto L5a
            int r0 = r0.m10917id()
            r1 = 5
            r2 = 0
            if (r0 == r1) goto L2d
            r1 = 6
            if (r0 == r1) goto L1d
            r1 = 7
            if (r0 == r1) goto L26
            r1 = 8
            if (r0 == r1) goto L26
            com.fasterxml.jackson.core.JsonToken r0 = r4.f82981e
            char[] r0 = r0.asCharArray()
            return r0
        L1d:
            boolean r0 = r4.f86350Y
            if (r0 == 0) goto L26
            r4.f86350Y = r2
            r4.m86837O1()
        L26:
            com.fasterxml.jackson.core.util.i r0 = r4.f82946C
            char[] r0 = r0.m11114u()
            return r0
        L2d:
            boolean r0 = r4.f82948E
            if (r0 != 0) goto L57
            i7.d r0 = r4.f82944A
            java.lang.String r0 = r0.mo10933b()
            int r1 = r0.length()
            char[] r3 = r4.f82947D
            if (r3 != 0) goto L48
            com.fasterxml.jackson.core.io.d r3 = r4.f82961q
            char[] r3 = r3.m10979f(r1)
            r4.f82947D = r3
            goto L4f
        L48:
            int r3 = r3.length
            if (r3 >= r1) goto L4f
            char[] r3 = new char[r1]
            r4.f82947D = r3
        L4f:
            char[] r3 = r4.f82947D
            r0.getChars(r2, r1, r3, r2)
            r0 = 1
            r4.f82948E = r0
        L57:
            char[] r0 = r4.f82947D
            return r0
        L5a:
            r0 = 0
            return r0
    }

    /* JADX INFO: renamed from: X1 */
    public void m86846X1() throws java.io.IOException {
            r1 = this;
            boolean r0 = r1.m86845W1()
            if (r0 != 0) goto L9
            r1.m84097O0()
        L9:
            return
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    /* JADX INFO: renamed from: Y */
    public final int mo10871Y() throws java.io.IOException {
            r3 = this;
            com.fasterxml.jackson.core.JsonToken r0 = r3.f82981e
            r1 = 0
            if (r0 == 0) goto L39
            int r0 = r0.m10917id()
            r2 = 5
            if (r0 == r2) goto L2e
            r2 = 6
            if (r0 == r2) goto L1e
            r1 = 7
            if (r0 == r1) goto L27
            r1 = 8
            if (r0 == r1) goto L27
            com.fasterxml.jackson.core.JsonToken r0 = r3.f82981e
            char[] r0 = r0.asCharArray()
            int r0 = r0.length
            return r0
        L1e:
            boolean r0 = r3.f86350Y
            if (r0 == 0) goto L27
            r3.f86350Y = r1
            r3.m86837O1()
        L27:
            com.fasterxml.jackson.core.util.i r0 = r3.f82946C
            int r0 = r0.m11093F()
            return r0
        L2e:
            i7.d r0 = r3.f82944A
            java.lang.String r0 = r0.mo10933b()
            int r0 = r0.length()
            return r0
        L39:
            return r1
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    /* JADX INFO: renamed from: Z */
    public final int mo10872Z() throws java.io.IOException {
            r3 = this;
            com.fasterxml.jackson.core.JsonToken r0 = r3.f82981e
            r1 = 0
            if (r0 == 0) goto L24
            int r0 = r0.m10917id()
            r2 = 6
            if (r0 == r2) goto L14
            r2 = 7
            if (r0 == r2) goto L1d
            r2 = 8
            if (r0 == r2) goto L1d
            goto L24
        L14:
            boolean r0 = r3.f86350Y
            if (r0 == 0) goto L1d
            r3.f86350Y = r1
            r3.m86837O1()
        L1d:
            com.fasterxml.jackson.core.util.i r0 = r3.f82946C
            int r0 = r0.m11115v()
            return r0
        L24:
            return r1
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    /* JADX INFO: renamed from: a0 */
    public com.fasterxml.jackson.core.JsonLocation mo10874a0() {
            r15 = this;
            com.fasterxml.jackson.core.JsonToken r0 = r15.f82981e
            com.fasterxml.jackson.core.JsonToken r1 = com.fasterxml.jackson.core.JsonToken.FIELD_NAME
            r2 = 1
            if (r0 != r1) goto L1f
            long r0 = r15.f82965u
            long r4 = r15.f86351Z
            long r4 = r4 - r2
            long r10 = r0 + r4
            com.fasterxml.jackson.core.JsonLocation r6 = new com.fasterxml.jackson.core.JsonLocation
            com.fasterxml.jackson.core.io.ContentReference r7 = r15.m84067g1()
            int r12 = r15.f86352a0
            int r13 = r15.f86353b0
            r8 = -1
            r6.<init>(r7, r8, r10, r12, r13)
            return r6
        L1f:
            com.fasterxml.jackson.core.JsonLocation r7 = new com.fasterxml.jackson.core.JsonLocation
            com.fasterxml.jackson.core.io.ContentReference r8 = r15.m84067g1()
            long r0 = r15.f82968x
            long r11 = r0 - r2
            int r13 = r15.f82969y
            int r14 = r15.f82970z
            r9 = -1
            r7.<init>(r8, r9, r11, r13, r14)
            return r7
    }

    /* JADX INFO: renamed from: a2 */
    public final void m86847a2(java.lang.String r4, int r5) throws java.io.IOException {
            r3 = this;
            int r0 = r4.length()
            int r1 = r3.f82963s
            int r1 = r1 + r0
            int r2 = r3.f82964t
            if (r1 < r2) goto Lf
            r3.m86848b2(r4, r5)
            return
        Lf:
            char[] r1 = r3.f86345T
            int r2 = r3.f82963s
            char r1 = r1[r2]
            char r2 = r4.charAt(r5)
            if (r1 == r2) goto L23
            r1 = 0
            java.lang.String r1 = r4.substring(r1, r5)
            r3.m86860o2(r1)
        L23:
            int r1 = r3.f82963s
            int r1 = r1 + 1
            r3.f82963s = r1
            int r5 = r5 + 1
            if (r5 < r0) goto Lf
            char[] r0 = r3.f86345T
            char r0 = r0[r1]
            r1 = 48
            if (r0 < r1) goto L40
            r1 = 93
            if (r0 == r1) goto L40
            r1 = 125(0x7d, float:1.75E-43)
            if (r0 == r1) goto L40
            r3.m86834L1(r4, r5, r0)
        L40:
            return
    }

    /* JADX INFO: renamed from: b2 */
    public final void m86848b2(java.lang.String r4, int r5) throws java.io.IOException {
            r3 = this;
            int r0 = r4.length()
        L4:
            int r1 = r3.f82963s
            int r2 = r3.f82964t
            if (r1 < r2) goto L10
            boolean r1 = r3.m86845W1()
            if (r1 == 0) goto L1c
        L10:
            char[] r1 = r3.f86345T
            int r2 = r3.f82963s
            char r1 = r1[r2]
            char r2 = r4.charAt(r5)
            if (r1 == r2) goto L24
        L1c:
            r1 = 0
            java.lang.String r1 = r4.substring(r1, r5)
            r3.m86860o2(r1)
        L24:
            int r1 = r3.f82963s
            int r1 = r1 + 1
            r3.f82963s = r1
            int r5 = r5 + 1
            if (r5 < r0) goto L4
            int r0 = r3.f82964t
            if (r1 < r0) goto L39
            boolean r0 = r3.m86845W1()
            if (r0 != 0) goto L39
            goto L4e
        L39:
            char[] r0 = r3.f86345T
            int r1 = r3.f82963s
            char r0 = r0[r1]
            r1 = 48
            if (r0 < r1) goto L4e
            r1 = 93
            if (r0 == r1) goto L4e
            r1 = 125(0x7d, float:1.75E-43)
            if (r0 == r1) goto L4e
            r3.m86834L1(r4, r5, r0)
        L4e:
            return
    }

    /* JADX INFO: renamed from: d2 */
    public final com.fasterxml.jackson.core.JsonToken m86849d2() {
            r4 = this;
            r0 = 0
            r4.f82948E = r0
            com.fasterxml.jackson.core.JsonToken r0 = r4.f82945B
            r1 = 0
            r4.f82945B = r1
            com.fasterxml.jackson.core.JsonToken r1 = com.fasterxml.jackson.core.JsonToken.START_ARRAY
            if (r0 != r1) goto L19
            i7.d r1 = r4.f82944A
            int r2 = r4.f82969y
            int r3 = r4.f82970z
            i7.d r1 = r1.m86799m(r2, r3)
            r4.f82944A = r1
            goto L29
        L19:
            com.fasterxml.jackson.core.JsonToken r1 = com.fasterxml.jackson.core.JsonToken.START_OBJECT
            if (r0 != r1) goto L29
            i7.d r1 = r4.f82944A
            int r2 = r4.f82969y
            int r3 = r4.f82970z
            i7.d r1 = r1.m86800n(r2, r3)
            r4.f82944A = r1
        L29:
            r4.f82981e = r0
            return r0
    }

    /* JADX INFO: renamed from: e2 */
    public final com.fasterxml.jackson.core.JsonToken m86850e2(int r4) throws java.io.IOException {
            r3 = this;
            r0 = 34
            r1 = 1
            if (r4 != r0) goto Lc
            r3.f86350Y = r1
            com.fasterxml.jackson.core.JsonToken r4 = com.fasterxml.jackson.core.JsonToken.VALUE_STRING
            r3.f82981e = r4
            return r4
        Lc:
            r0 = 91
            if (r4 == r0) goto L8c
            r0 = 102(0x66, float:1.43E-43)
            if (r4 == r0) goto L82
            r0 = 110(0x6e, float:1.54E-43)
            if (r4 == r0) goto L78
            r0 = 116(0x74, float:1.63E-43)
            if (r4 == r0) goto L6d
            r0 = 123(0x7b, float:1.72E-43)
            if (r4 == r0) goto L5c
            switch(r4) {
                case 44: goto L3c;
                case 45: goto L35;
                case 46: goto L2e;
                default: goto L23;
            }
        L23:
            switch(r4) {
                case 48: goto L27;
                case 49: goto L27;
                case 50: goto L27;
                case 51: goto L27;
                case 52: goto L27;
                case 53: goto L27;
                case 54: goto L27;
                case 55: goto L27;
                case 56: goto L27;
                case 57: goto L27;
                default: goto L26;
            }
        L26:
            goto L55
        L27:
            com.fasterxml.jackson.core.JsonToken r4 = r3.m86858m2(r4)
            r3.f82981e = r4
            return r4
        L2e:
            com.fasterxml.jackson.core.JsonToken r4 = r3.m86853h2()
            r3.f82981e = r4
            return r4
        L35:
            com.fasterxml.jackson.core.JsonToken r4 = r3.m86856k2()
            r3.f82981e = r4
            return r4
        L3c:
            i7.d r0 = r3.f82944A
            boolean r0 = r0.m10939h()
            if (r0 != 0) goto L55
            int r0 = r3.f10027b
            int r2 = p334i7.C38469g.f86338f0
            r0 = r0 & r2
            if (r0 == 0) goto L55
            int r4 = r3.f82963s
            int r4 = r4 - r1
            r3.f82963s = r4
            com.fasterxml.jackson.core.JsonToken r4 = com.fasterxml.jackson.core.JsonToken.VALUE_NULL
            r3.f82981e = r4
            return r4
        L55:
            com.fasterxml.jackson.core.JsonToken r4 = r3.m86844V1(r4)
            r3.f82981e = r4
            return r4
        L5c:
            i7.d r4 = r3.f82944A
            int r0 = r3.f82969y
            int r1 = r3.f82970z
            i7.d r4 = r4.m86800n(r0, r1)
            r3.f82944A = r4
            com.fasterxml.jackson.core.JsonToken r4 = com.fasterxml.jackson.core.JsonToken.START_OBJECT
            r3.f82981e = r4
            return r4
        L6d:
            java.lang.String r4 = "true"
            r3.m86847a2(r4, r1)
            com.fasterxml.jackson.core.JsonToken r4 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE
            r3.f82981e = r4
            return r4
        L78:
            java.lang.String r4 = "null"
            r3.m86847a2(r4, r1)
            com.fasterxml.jackson.core.JsonToken r4 = com.fasterxml.jackson.core.JsonToken.VALUE_NULL
            r3.f82981e = r4
            return r4
        L82:
            java.lang.String r4 = "false"
            r3.m86847a2(r4, r1)
            com.fasterxml.jackson.core.JsonToken r4 = com.fasterxml.jackson.core.JsonToken.VALUE_FALSE
            r3.f82981e = r4
            return r4
        L8c:
            i7.d r4 = r3.f82944A
            int r0 = r3.f82969y
            int r1 = r3.f82970z
            i7.d r4 = r4.m86799m(r0, r1)
            r3.f82944A = r4
            com.fasterxml.jackson.core.JsonToken r4 = com.fasterxml.jackson.core.JsonToken.START_ARRAY
            r3.f82981e = r4
            return r4
    }

    @Override // p254f7.AbstractC37385b
    /* JADX INFO: renamed from: f1 */
    public void mo84066f1() throws java.io.IOException {
            r1 = this;
            java.io.Reader r0 = r1.f86344S
            if (r0 == 0) goto L1c
            com.fasterxml.jackson.core.io.d r0 = r1.f82961q
            boolean r0 = r0.m10987n()
            if (r0 != 0) goto L14
            com.fasterxml.jackson.core.JsonParser$Feature r0 = com.fasterxml.jackson.core.JsonParser.Feature.AUTO_CLOSE_SOURCE
            boolean r0 = r1.m10894m0(r0)
            if (r0 == 0) goto L19
        L14:
            java.io.Reader r0 = r1.f86344S
            r0.close()
        L19:
            r0 = 0
            r1.f86344S = r0
        L1c:
            return
    }

    /* JADX INFO: renamed from: f2 */
    public java.lang.String m86851f2() throws java.io.IOException {
            r8 = this;
            int r0 = r8.f82963s
            int r1 = r8.f86349X
            int r2 = r8.f82964t
            r3 = 39
            if (r0 >= r2) goto L2f
            int[] r4 = p334i7.C38469g.f86343k0
            int r5 = r4.length
        Ld:
            char[] r6 = r8.f86345T
            char r7 = r6[r0]
            if (r7 != r3) goto L21
            int r2 = r8.f82963s
            int r3 = r0 + 1
            r8.f82963s = r3
            k7.b r3 = r8.f86348W
            int r0 = r0 - r2
            java.lang.String r0 = r3.m89699l(r6, r2, r0, r1)
            return r0
        L21:
            if (r7 >= r5) goto L28
            r6 = r4[r7]
            if (r6 == 0) goto L28
            goto L2f
        L28:
            int r1 = r1 * 33
            int r1 = r1 + r7
            int r0 = r0 + 1
            if (r0 < r2) goto Ld
        L2f:
            int r2 = r8.f82963s
            r8.f82963s = r0
            java.lang.String r0 = r8.m86855j2(r2, r1, r3)
            return r0
    }

    @Override // p254f7.AbstractC37386c, com.fasterxml.jackson.core.JsonParser
    /* JADX INFO: renamed from: g0 */
    public final java.lang.String mo10882g0() throws java.io.IOException {
            r2 = this;
            com.fasterxml.jackson.core.JsonToken r0 = r2.f82981e
            com.fasterxml.jackson.core.JsonToken r1 = com.fasterxml.jackson.core.JsonToken.VALUE_STRING
            if (r0 != r1) goto L17
            boolean r0 = r2.f86350Y
            if (r0 == 0) goto L10
            r0 = 0
            r2.f86350Y = r0
            r2.m86837O1()
        L10:
            com.fasterxml.jackson.core.util.i r0 = r2.f82946C
            java.lang.String r0 = r0.m11106l()
            return r0
        L17:
            com.fasterxml.jackson.core.JsonToken r1 = com.fasterxml.jackson.core.JsonToken.FIELD_NAME
            if (r0 != r1) goto L20
            java.lang.String r0 = r2.mo10910w()
            return r0
        L20:
            r0 = 0
            java.lang.String r0 = super.mo10884h0(r0)
            return r0
    }

    /* JADX INFO: renamed from: g2 */
    public final com.fasterxml.jackson.core.JsonToken m86852g2(int r10, int r11, int r12, boolean r13, int r14) throws java.io.IOException {
            r9 = this;
            int r0 = r9.f82964t
            r1 = 46
            r2 = 57
            r3 = 48
            r4 = 0
            if (r10 != r1) goto L2d
            r10 = r4
        Lc:
            if (r12 < r0) goto L13
            com.fasterxml.jackson.core.JsonToken r10 = r9.m86857l2(r13, r11)
            return r10
        L13:
            char[] r1 = r9.f86345T
            int r5 = r12 + 1
            char r12 = r1[r12]
            if (r12 < r3) goto L22
            if (r12 <= r2) goto L1e
            goto L22
        L1e:
            int r10 = r10 + 1
            r12 = r5
            goto Lc
        L22:
            if (r10 != 0) goto L29
            java.lang.String r1 = "Decimal point not followed by a digit"
            r9.m84112d1(r12, r1)
        L29:
            r8 = r12
            r12 = r10
            r10 = r8
            goto L2f
        L2d:
            r5 = r12
            r12 = r4
        L2f:
            r1 = 101(0x65, float:1.42E-43)
            if (r10 == r1) goto L37
            r1 = 69
            if (r10 != r1) goto L7d
        L37:
            if (r5 < r0) goto L40
            r9.f82963s = r11
            com.fasterxml.jackson.core.JsonToken r10 = r9.m86857l2(r13, r11)
            return r10
        L40:
            char[] r10 = r9.f86345T
            int r1 = r5 + 1
            char r6 = r10[r5]
            r7 = 45
            if (r6 == r7) goto L52
            r7 = 43
            if (r6 != r7) goto L4f
            goto L52
        L4f:
            r5 = r1
            r10 = r6
            goto L5f
        L52:
            if (r1 < r0) goto L5b
            r9.f82963s = r11
            com.fasterxml.jackson.core.JsonToken r10 = r9.m86857l2(r13, r11)
            return r10
        L5b:
            int r5 = r5 + 2
            char r10 = r10[r1]
        L5f:
            if (r10 > r2) goto L76
            if (r10 < r3) goto L76
            int r4 = r4 + 1
            if (r5 < r0) goto L6e
            r9.f82963s = r11
            com.fasterxml.jackson.core.JsonToken r10 = r9.m86857l2(r13, r11)
            return r10
        L6e:
            char[] r10 = r9.f86345T
            int r1 = r5 + 1
            char r10 = r10[r5]
            r5 = r1
            goto L5f
        L76:
            if (r4 != 0) goto L7d
            java.lang.String r0 = "Exponent indicator not followed by a digit"
            r9.m84112d1(r10, r0)
        L7d:
            int r5 = r5 + (-1)
            r9.f82963s = r5
            i7.d r0 = r9.f82944A
            boolean r0 = r0.m10939h()
            if (r0 == 0) goto L8c
            r9.m86831G2(r10)
        L8c:
            int r5 = r5 - r11
            com.fasterxml.jackson.core.util.i r10 = r9.f82946C
            char[] r0 = r9.f86345T
            r10.m11088A(r0, r11, r5)
            com.fasterxml.jackson.core.JsonToken r10 = r9.m84063J1(r13, r14, r12, r4)
            return r10
    }

    @Override // p254f7.AbstractC37386c, com.fasterxml.jackson.core.JsonParser
    /* JADX INFO: renamed from: h0 */
    public final java.lang.String mo10884h0(java.lang.String r3) throws java.io.IOException {
            r2 = this;
            com.fasterxml.jackson.core.JsonToken r0 = r2.f82981e
            com.fasterxml.jackson.core.JsonToken r1 = com.fasterxml.jackson.core.JsonToken.VALUE_STRING
            if (r0 != r1) goto L17
            boolean r3 = r2.f86350Y
            if (r3 == 0) goto L10
            r3 = 0
            r2.f86350Y = r3
            r2.m86837O1()
        L10:
            com.fasterxml.jackson.core.util.i r3 = r2.f82946C
            java.lang.String r3 = r3.m11106l()
            return r3
        L17:
            com.fasterxml.jackson.core.JsonToken r1 = com.fasterxml.jackson.core.JsonToken.FIELD_NAME
            if (r0 != r1) goto L20
            java.lang.String r3 = r2.mo10910w()
            return r3
        L20:
            java.lang.String r3 = super.mo10884h0(r3)
            return r3
    }

    /* JADX INFO: renamed from: h2 */
    public final com.fasterxml.jackson.core.JsonToken m86853h2() throws java.io.IOException {
            r7 = this;
            com.fasterxml.jackson.core.json.JsonReadFeature r0 = com.fasterxml.jackson.core.json.JsonReadFeature.ALLOW_LEADING_DECIMAL_POINT_FOR_NUMBERS
            com.fasterxml.jackson.core.JsonParser$Feature r0 = r0.mappedFeature()
            boolean r0 = r7.m10894m0(r0)
            if (r0 != 0) goto L13
            r0 = 46
            com.fasterxml.jackson.core.JsonToken r0 = r7.m86844V1(r0)
            return r0
        L13:
            int r4 = r7.f82963s
            int r3 = r4 + (-1)
            r5 = 0
            r6 = 0
            r2 = 46
            r1 = r7
            com.fasterxml.jackson.core.JsonToken r0 = r1.m86852g2(r2, r3, r4, r5, r6)
            return r0
    }

    /* JADX INFO: renamed from: i2 */
    public final java.lang.String m86854i2() throws java.io.IOException {
            r7 = this;
            int r0 = r7.f82963s
            int r1 = r7.f86349X
            int[] r2 = p334i7.C38469g.f86343k0
        L6:
            int r3 = r7.f82964t
            r4 = 34
            if (r0 >= r3) goto L2d
            char[] r3 = r7.f86345T
            char r5 = r3[r0]
            int r6 = r2.length
            if (r5 >= r6) goto L27
            r6 = r2[r5]
            if (r6 == 0) goto L27
            if (r5 != r4) goto L2d
            int r2 = r7.f82963s
            int r4 = r0 + 1
            r7.f82963s = r4
            k7.b r4 = r7.f86348W
            int r0 = r0 - r2
            java.lang.String r0 = r4.m89699l(r3, r2, r0, r1)
            return r0
        L27:
            int r1 = r1 * 33
            int r1 = r1 + r5
            int r0 = r0 + 1
            goto L6
        L2d:
            int r2 = r7.f82963s
            r7.f82963s = r0
            java.lang.String r0 = r7.m86855j2(r2, r1, r4)
            return r0
    }

    @Override // p254f7.AbstractC37385b
    /* JADX INFO: renamed from: j1 */
    public char mo84070j1() throws java.io.IOException {
            r6 = this;
            int r0 = r6.f82963s
            int r1 = r6.f82964t
            java.lang.String r2 = " in character escape sequence"
            if (r0 < r1) goto L13
            boolean r0 = r6.m86845W1()
            if (r0 != 0) goto L13
            com.fasterxml.jackson.core.JsonToken r0 = com.fasterxml.jackson.core.JsonToken.VALUE_STRING
            r6.m84098P0(r2, r0)
        L13:
            char[] r0 = r6.f86345T
            int r1 = r6.f82963s
            int r3 = r1 + 1
            r6.f82963s = r3
            char r0 = r0[r1]
            r1 = 34
            if (r0 == r1) goto L87
            r1 = 47
            if (r0 == r1) goto L87
            r1 = 92
            if (r0 == r1) goto L87
            r1 = 98
            if (r0 == r1) goto L85
            r1 = 102(0x66, float:1.43E-43)
            if (r0 == r1) goto L82
            r1 = 110(0x6e, float:1.54E-43)
            if (r0 == r1) goto L7f
            r1 = 114(0x72, float:1.6E-43)
            if (r0 == r1) goto L7c
            r1 = 116(0x74, float:1.63E-43)
            if (r0 == r1) goto L79
            r1 = 117(0x75, float:1.64E-43)
            if (r0 == r1) goto L46
            char r0 = r6.m84074n1(r0)
            return r0
        L46:
            r0 = 0
            r1 = r0
        L48:
            r3 = 4
            if (r0 >= r3) goto L77
            int r3 = r6.f82963s
            int r4 = r6.f82964t
            if (r3 < r4) goto L5c
            boolean r3 = r6.m86845W1()
            if (r3 != 0) goto L5c
            com.fasterxml.jackson.core.JsonToken r3 = com.fasterxml.jackson.core.JsonToken.VALUE_STRING
            r6.m84098P0(r2, r3)
        L5c:
            char[] r3 = r6.f86345T
            int r4 = r6.f82963s
            int r5 = r4 + 1
            r6.f82963s = r5
            char r3 = r3[r4]
            int r4 = com.fasterxml.jackson.core.p062io.C6308b.m10962b(r3)
            if (r4 >= 0) goto L71
            java.lang.String r5 = "expected a hex-digit for character escape sequence"
            r6.m84101S0(r3, r5)
        L71:
            int r1 = r1 << 4
            r1 = r1 | r4
            int r0 = r0 + 1
            goto L48
        L77:
            char r0 = (char) r1
            return r0
        L79:
            r0 = 9
            return r0
        L7c:
            r0 = 13
            return r0
        L7f:
            r0 = 10
            return r0
        L82:
            r0 = 12
            return r0
        L85:
            r0 = 8
        L87:
            return r0
    }

    /* JADX INFO: renamed from: j2 */
    public final java.lang.String m86855j2(int r5, int r6, int r7) throws java.io.IOException {
            r4 = this;
            com.fasterxml.jackson.core.util.i r0 = r4.f82946C
            char[] r1 = r4.f86345T
            int r2 = r4.f82963s
            int r2 = r2 - r5
            r0.m11088A(r1, r5, r2)
            com.fasterxml.jackson.core.util.i r5 = r4.f82946C
            char[] r5 = r5.m11112s()
            com.fasterxml.jackson.core.util.i r0 = r4.f82946C
            int r0 = r0.m11113t()
        L16:
            int r1 = r4.f82963s
            int r2 = r4.f82964t
            if (r1 < r2) goto L29
            boolean r1 = r4.m86845W1()
            if (r1 != 0) goto L29
            java.lang.String r1 = " in field name"
            com.fasterxml.jackson.core.JsonToken r2 = com.fasterxml.jackson.core.JsonToken.FIELD_NAME
            r4.m84098P0(r1, r2)
        L29:
            char[] r1 = r4.f86345T
            int r2 = r4.f82963s
            int r3 = r2 + 1
            r4.f82963s = r3
            char r1 = r1[r2]
            r2 = 92
            if (r1 > r2) goto L65
            if (r1 != r2) goto L3e
            char r1 = r4.mo84070j1()
            goto L65
        L3e:
            if (r1 > r7) goto L65
            if (r1 != r7) goto L5c
            com.fasterxml.jackson.core.util.i r5 = r4.f82946C
            r5.m11092E(r0)
            com.fasterxml.jackson.core.util.i r5 = r4.f82946C
            char[] r7 = r5.m11114u()
            int r0 = r5.m11115v()
            int r5 = r5.m11093F()
            k7.b r1 = r4.f86348W
            java.lang.String r5 = r1.m89699l(r7, r0, r5, r6)
            return r5
        L5c:
            r2 = 32
            if (r1 >= r2) goto L65
            java.lang.String r2 = "name"
            r4.m84082v1(r1, r2)
        L65:
            int r6 = r6 * 33
            int r6 = r6 + r1
            int r2 = r0 + 1
            r5[r0] = r1
            int r0 = r5.length
            if (r2 < r0) goto L77
            com.fasterxml.jackson.core.util.i r5 = r4.f82946C
            char[] r5 = r5.m11110p()
            r0 = 0
            goto L16
        L77:
            r0 = r2
            goto L16
    }

    /* JADX INFO: renamed from: k2 */
    public final com.fasterxml.jackson.core.JsonToken m86856k2() throws java.io.IOException {
            r9 = this;
            int r0 = r9.f82963s
            int r3 = r0 + (-1)
            int r1 = r9.f82964t
            r2 = 1
            if (r0 < r1) goto Le
            com.fasterxml.jackson.core.JsonToken r0 = r9.m86857l2(r2, r3)
            return r0
        Le:
            char[] r4 = r9.f86345T
            int r5 = r0 + 1
            char r0 = r4[r0]
            r4 = 57
            if (r0 > r4) goto L1c
            r6 = 48
            if (r0 >= r6) goto L1e
        L1c:
            r1 = r9
            goto L70
        L1e:
            if (r0 != r6) goto L25
            com.fasterxml.jackson.core.JsonToken r0 = r9.m86857l2(r2, r3)
            return r0
        L25:
            r0 = r6
            r6 = r2
        L27:
            if (r5 < r1) goto L2e
            com.fasterxml.jackson.core.JsonToken r0 = r9.m86857l2(r2, r3)
            return r0
        L2e:
            char[] r7 = r9.f86345T
            r8 = r4
            int r4 = r5 + 1
            char r7 = r7[r5]
            if (r7 < r0) goto L3f
            if (r7 <= r8) goto L3a
            goto L3f
        L3a:
            int r6 = r6 + 1
            r5 = r4
            r4 = r8
            goto L27
        L3f:
            r0 = 46
            if (r7 == r0) goto L66
            r0 = 101(0x65, float:1.42E-43)
            if (r7 == r0) goto L66
            r0 = 69
            if (r7 != r0) goto L4c
            goto L66
        L4c:
            r9.f82963s = r5
            i7.d r0 = r9.f82944A
            boolean r0 = r0.m10939h()
            if (r0 == 0) goto L59
            r9.m86831G2(r7)
        L59:
            int r5 = r5 - r3
            com.fasterxml.jackson.core.util.i r0 = r9.f82946C
            char[] r1 = r9.f86345T
            r0.m11088A(r1, r3, r5)
            com.fasterxml.jackson.core.JsonToken r0 = r9.m84064K1(r2, r6)
            return r0
        L66:
            r9.f82963s = r4
            r5 = 1
            r1 = r9
            r2 = r7
            com.fasterxml.jackson.core.JsonToken r0 = r1.m86852g2(r2, r3, r4, r5, r6)
            return r0
        L70:
            r1.f82963s = r5
            com.fasterxml.jackson.core.JsonToken r0 = r9.m86841S1(r0, r2)
            return r0
    }

    /* JADX INFO: renamed from: l2 */
    public final com.fasterxml.jackson.core.JsonToken m86857l2(boolean r14, int r15) throws java.io.IOException {
            r13 = this;
            if (r14 == 0) goto L4
            int r15 = r15 + 1
        L4:
            r13.f82963s = r15
            com.fasterxml.jackson.core.util.i r15 = r13.f82946C
            char[] r15 = r15.m11107m()
            r0 = 45
            r1 = 0
            r2 = 1
            if (r14 == 0) goto L16
            r15[r1] = r0
            r3 = r2
            goto L17
        L16:
            r3 = r1
        L17:
            int r4 = r13.f82963s
            int r5 = r13.f82964t
            if (r4 >= r5) goto L26
            char[] r5 = r13.f86345T
            int r6 = r4 + 1
            r13.f82963s = r6
            char r4 = r5[r4]
            goto L2e
        L26:
            java.lang.String r4 = "No digit following minus sign"
            com.fasterxml.jackson.core.JsonToken r5 = com.fasterxml.jackson.core.JsonToken.VALUE_NUMBER_INT
            char r4 = r13.m86833I2(r4, r5)
        L2e:
            r5 = 48
            if (r4 != r5) goto L36
            char r4 = r13.m86830F2()
        L36:
            r6 = r1
        L37:
            r7 = 57
            if (r4 < r5) goto L69
            if (r4 > r7) goto L69
            int r6 = r6 + 1
            int r8 = r15.length
            if (r3 < r8) goto L49
            com.fasterxml.jackson.core.util.i r15 = r13.f82946C
            char[] r15 = r15.m11110p()
            r3 = r1
        L49:
            int r8 = r3 + 1
            r15[r3] = r4
            int r3 = r13.f82963s
            int r4 = r13.f82964t
            if (r3 < r4) goto L5d
            boolean r3 = r13.m86845W1()
            if (r3 != 0) goto L5d
            r4 = r1
            r3 = r8
            r8 = r2
            goto L6a
        L5d:
            char[] r3 = r13.f86345T
            int r4 = r13.f82963s
            int r7 = r4 + 1
            r13.f82963s = r7
            char r4 = r3[r4]
            r3 = r8
            goto L37
        L69:
            r8 = r1
        L6a:
            if (r6 != 0) goto L71
            com.fasterxml.jackson.core.JsonToken r14 = r13.m86841S1(r4, r14)
            return r14
        L71:
            r9 = 46
            if (r4 != r9) goto Lbc
            int r9 = r15.length
            if (r3 < r9) goto L7f
            com.fasterxml.jackson.core.util.i r15 = r13.f82946C
            char[] r15 = r15.m11110p()
            r3 = r1
        L7f:
            int r9 = r3 + 1
            r15[r3] = r4
            r3 = r9
            r9 = r1
        L85:
            int r10 = r13.f82963s
            int r11 = r13.f82964t
            if (r10 < r11) goto L93
            boolean r10 = r13.m86845W1()
            if (r10 != 0) goto L93
            r8 = r2
            goto Lb4
        L93:
            char[] r4 = r13.f86345T
            int r10 = r13.f82963s
            int r11 = r10 + 1
            r13.f82963s = r11
            char r4 = r4[r10]
            if (r4 < r5) goto Lb4
            if (r4 <= r7) goto La2
            goto Lb4
        La2:
            int r9 = r9 + 1
            int r10 = r15.length
            if (r3 < r10) goto Lae
            com.fasterxml.jackson.core.util.i r15 = r13.f82946C
            char[] r15 = r15.m11110p()
            r3 = r1
        Lae:
            int r10 = r3 + 1
            r15[r3] = r4
            r3 = r10
            goto L85
        Lb4:
            if (r9 != 0) goto Lbd
            java.lang.String r10 = "Decimal point not followed by a digit"
            r13.m84112d1(r4, r10)
            goto Lbd
        Lbc:
            r9 = r1
        Lbd:
            r10 = 101(0x65, float:1.42E-43)
            if (r4 == r10) goto Lc5
            r10 = 69
            if (r4 != r10) goto L14d
        Lc5:
            int r10 = r15.length
            if (r3 < r10) goto Lcf
            com.fasterxml.jackson.core.util.i r15 = r13.f82946C
            char[] r15 = r15.m11110p()
            r3 = r1
        Lcf:
            int r10 = r3 + 1
            r15[r3] = r4
            int r3 = r13.f82963s
            int r4 = r13.f82964t
            java.lang.String r11 = "expected a digit for number exponent"
            if (r3 >= r4) goto Le4
            char[] r4 = r13.f86345T
            int r12 = r3 + 1
            r13.f82963s = r12
            char r3 = r4[r3]
            goto Le8
        Le4:
            char r3 = r13.m86832H2(r11)
        Le8:
            if (r3 == r0) goto Lf2
            r0 = 43
            if (r3 != r0) goto Lef
            goto Lf2
        Lef:
            r0 = r1
            r4 = r3
            goto L115
        Lf2:
            int r0 = r15.length
            if (r10 < r0) goto Lfc
            com.fasterxml.jackson.core.util.i r15 = r13.f82946C
            char[] r15 = r15.m11110p()
            r10 = r1
        Lfc:
            int r0 = r10 + 1
            r15[r10] = r3
            int r3 = r13.f82963s
            int r4 = r13.f82964t
            if (r3 >= r4) goto L10f
            char[] r4 = r13.f86345T
            int r10 = r3 + 1
            r13.f82963s = r10
            char r3 = r4[r3]
            goto L113
        L10f:
            char r3 = r13.m86832H2(r11)
        L113:
            r10 = r0
            goto Lef
        L115:
            if (r4 > r7) goto L144
            if (r4 < r5) goto L144
            int r0 = r0 + 1
            int r3 = r15.length
            if (r10 < r3) goto L125
            com.fasterxml.jackson.core.util.i r15 = r13.f82946C
            char[] r15 = r15.m11110p()
            r10 = r1
        L125:
            int r3 = r10 + 1
            r15[r10] = r4
            int r10 = r13.f82963s
            int r11 = r13.f82964t
            if (r10 < r11) goto L138
            boolean r10 = r13.m86845W1()
            if (r10 != 0) goto L138
            r8 = r2
        L136:
            r1 = r0
            goto L146
        L138:
            char[] r4 = r13.f86345T
            int r10 = r13.f82963s
            int r11 = r10 + 1
            r13.f82963s = r11
            char r4 = r4[r10]
            r10 = r3
            goto L115
        L144:
            r3 = r10
            goto L136
        L146:
            if (r1 != 0) goto L14d
            java.lang.String r15 = "Exponent indicator not followed by a digit"
            r13.m84112d1(r4, r15)
        L14d:
            if (r8 != 0) goto L15f
            int r15 = r13.f82963s
            int r15 = r15 - r2
            r13.f82963s = r15
            i7.d r15 = r13.f82944A
            boolean r15 = r15.m10939h()
            if (r15 == 0) goto L15f
            r13.m86831G2(r4)
        L15f:
            com.fasterxml.jackson.core.util.i r15 = r13.f82946C
            r15.m11092E(r3)
            com.fasterxml.jackson.core.JsonToken r14 = r13.m84061H1(r14, r6, r9, r1)
            return r14
    }

    /* JADX INFO: renamed from: m2 */
    public final com.fasterxml.jackson.core.JsonToken m86858m2(int r9) throws java.io.IOException {
            r8 = this;
            int r0 = r8.f82963s
            int r3 = r0 + (-1)
            int r1 = r8.f82964t
            r2 = 0
            r4 = 48
            if (r9 != r4) goto L10
            com.fasterxml.jackson.core.JsonToken r9 = r8.m86857l2(r2, r3)
            return r9
        L10:
            r9 = 1
            r6 = r9
        L12:
            if (r0 < r1) goto L1b
            r8.f82963s = r3
            com.fasterxml.jackson.core.JsonToken r9 = r8.m86857l2(r2, r3)
            return r9
        L1b:
            char[] r9 = r8.f86345T
            r5 = r4
            int r4 = r0 + 1
            char r9 = r9[r0]
            if (r9 < r5) goto L2e
            r7 = 57
            if (r9 <= r7) goto L29
            goto L2e
        L29:
            int r6 = r6 + 1
            r0 = r4
            r4 = r5
            goto L12
        L2e:
            r1 = 46
            if (r9 == r1) goto L55
            r1 = 101(0x65, float:1.42E-43)
            if (r9 == r1) goto L55
            r1 = 69
            if (r9 != r1) goto L3b
            goto L55
        L3b:
            r8.f82963s = r0
            i7.d r1 = r8.f82944A
            boolean r1 = r1.m10939h()
            if (r1 == 0) goto L48
            r8.m86831G2(r9)
        L48:
            int r0 = r0 - r3
            com.fasterxml.jackson.core.util.i r9 = r8.f82946C
            char[] r1 = r8.f86345T
            r9.m11088A(r1, r3, r0)
            com.fasterxml.jackson.core.JsonToken r9 = r8.m84064K1(r2, r6)
            return r9
        L55:
            r8.f82963s = r4
            r5 = 0
            r1 = r8
            r2 = r9
            com.fasterxml.jackson.core.JsonToken r9 = r1.m86852g2(r2, r3, r4, r5, r6)
            return r9
    }

    /* JADX INFO: renamed from: n2 */
    public int m86859n2(com.fasterxml.jackson.core.Base64Variant r18, java.io.OutputStream r19, byte[] r20) throws java.io.IOException {
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            r3 = r20
            int r4 = r3.length
            r5 = 3
            int r4 = r4 - r5
            r6 = 0
            r7 = r6
            r8 = r7
        Le:
            int r9 = r0.f82963s
            int r10 = r0.f82964t
            if (r9 < r10) goto L17
            r0.m86846X1()
        L17:
            char[] r9 = r0.f86345T
            int r10 = r0.f82963s
            int r11 = r10 + 1
            r0.f82963s = r11
            char r9 = r9[r10]
            r10 = 32
            if (r9 <= r10) goto Le
            int r10 = r1.decodeBase64Char(r9)
            r11 = 34
            if (r10 >= 0) goto L38
            if (r9 != r11) goto L31
            goto L124
        L31:
            int r10 = r0.m84068h1(r1, r9, r6)
            if (r10 >= 0) goto L38
            goto Le
        L38:
            if (r7 <= r4) goto L3f
            int r8 = r8 + r7
            r2.write(r3, r6, r7)
            r7 = r6
        L3f:
            int r9 = r0.f82963s
            int r12 = r0.f82964t
            if (r9 < r12) goto L48
            r0.m86846X1()
        L48:
            char[] r9 = r0.f86345T
            int r12 = r0.f82963s
            int r13 = r12 + 1
            r0.f82963s = r13
            char r9 = r9[r12]
            int r12 = r1.decodeBase64Char(r9)
            r13 = 1
            if (r12 >= 0) goto L5d
            int r12 = r0.m84068h1(r1, r9, r13)
        L5d:
            int r9 = r10 << 6
            r9 = r9 | r12
            int r10 = r0.f82963s
            int r12 = r0.f82964t
            if (r10 < r12) goto L69
            r0.m86846X1()
        L69:
            char[] r10 = r0.f86345T
            int r12 = r0.f82963s
            int r14 = r12 + 1
            r0.f82963s = r14
            char r10 = r10[r12]
            int r12 = r1.decodeBase64Char(r10)
            r14 = -2
            r15 = 2
            if (r12 >= 0) goto Le6
            if (r12 == r14) goto L9b
            if (r10 != r11) goto L97
            int r4 = r9 >> 4
            int r5 = r7 + 1
            byte r4 = (byte) r4
            r3[r7] = r4
            boolean r4 = r1.usesPadding()
            if (r4 == 0) goto L94
            int r4 = r0.f82963s
            int r4 = r4 - r13
            r0.f82963s = r4
            r17.m84073m1(r18)
        L94:
            r7 = r5
            goto L124
        L97:
            int r12 = r0.m84068h1(r1, r10, r15)
        L9b:
            if (r12 != r14) goto Le6
            int r10 = r0.f82963s
            int r11 = r0.f82964t
            if (r10 < r11) goto La6
            r0.m86846X1()
        La6:
            char[] r10 = r0.f86345T
            int r11 = r0.f82963s
            int r12 = r11 + 1
            r0.f82963s = r12
            char r10 = r10[r11]
            boolean r11 = r1.usesPaddingChar(r10)
            if (r11 != 0) goto Ldc
            int r11 = r0.m84068h1(r1, r10, r5)
            if (r11 != r14) goto Lbd
            goto Ldc
        Lbd:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "expected padding character '"
            r2.append(r3)
            char r3 = r1.getPaddingChar()
            r2.append(r3)
            java.lang.String r3 = "'"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.lang.IllegalArgumentException r1 = r0.m84060G1(r1, r10, r5, r2)
            throw r1
        Ldc:
            int r9 = r9 >> 4
            int r10 = r7 + 1
            byte r9 = (byte) r9
            r3[r7] = r9
            r7 = r10
            goto Le
        Le6:
            int r9 = r9 << 6
            r9 = r9 | r12
            int r10 = r0.f82963s
            int r12 = r0.f82964t
            if (r10 < r12) goto Lf2
            r0.m86846X1()
        Lf2:
            char[] r10 = r0.f86345T
            int r12 = r0.f82963s
            r16 = r13
            int r13 = r12 + 1
            r0.f82963s = r13
            char r10 = r10[r12]
            int r12 = r1.decodeBase64Char(r10)
            if (r12 >= 0) goto L143
            if (r12 == r14) goto L131
            if (r10 != r11) goto L12d
            int r4 = r9 >> 2
            int r5 = r7 + 1
            int r9 = r9 >> 10
            byte r9 = (byte) r9
            r3[r7] = r9
            int r7 = r7 + r15
            byte r4 = (byte) r4
            r3[r5] = r4
            boolean r4 = r1.usesPadding()
            if (r4 == 0) goto L124
            int r4 = r0.f82963s
            int r4 = r4 + (-1)
            r0.f82963s = r4
            r17.m84073m1(r18)
        L124:
            r0.f86350Y = r6
            if (r7 <= 0) goto L12c
            int r8 = r8 + r7
            r2.write(r3, r6, r7)
        L12c:
            return r8
        L12d:
            int r12 = r0.m84068h1(r1, r10, r5)
        L131:
            if (r12 != r14) goto L143
            int r10 = r9 >> 2
            int r11 = r7 + 1
            int r9 = r9 >> 10
            byte r9 = (byte) r9
            r3[r7] = r9
            int r7 = r7 + 2
            byte r9 = (byte) r10
            r3[r11] = r9
            goto Le
        L143:
            int r9 = r9 << 6
            r9 = r9 | r12
            int r10 = r7 + 1
            int r11 = r9 >> 16
            byte r11 = (byte) r11
            r3[r7] = r11
            int r11 = r7 + 2
            int r12 = r9 >> 8
            byte r12 = (byte) r12
            r3[r10] = r12
            int r7 = r7 + 3
            byte r9 = (byte) r9
            r3[r11] = r9
            goto Le
    }

    /* JADX INFO: renamed from: o2 */
    public void m86860o2(java.lang.String r2) throws java.io.IOException {
            r1 = this;
            java.lang.String r0 = r1.m84083w1()
            r1.m86861p2(r2, r0)
            return
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    /* JADX INFO: renamed from: p */
    public byte[] mo10899p(com.fasterxml.jackson.core.Base64Variant r4) throws java.io.IOException {
            r3 = this;
            com.fasterxml.jackson.core.JsonToken r0 = r3.f82981e
            com.fasterxml.jackson.core.JsonToken r1 = com.fasterxml.jackson.core.JsonToken.VALUE_EMBEDDED_OBJECT
            if (r0 != r1) goto Lb
            byte[] r1 = r3.f82950G
            if (r1 == 0) goto Lb
            return r1
        Lb:
            com.fasterxml.jackson.core.JsonToken r1 = com.fasterxml.jackson.core.JsonToken.VALUE_STRING
            if (r0 == r1) goto L2a
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Current token ("
            r0.append(r1)
            com.fasterxml.jackson.core.JsonToken r1 = r3.f82981e
            r0.append(r1)
            java.lang.String r1 = ") not VALUE_STRING or VALUE_EMBEDDED_OBJECT, can not access as binary"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r3.m84093K0(r0)
        L2a:
            boolean r0 = r3.f86350Y
            if (r0 == 0) goto L5b
            byte[] r0 = r3.m86836N1(r4)     // Catch: java.lang.IllegalArgumentException -> L38
            r3.f82950G = r0     // Catch: java.lang.IllegalArgumentException -> L38
            r4 = 0
            r3.f86350Y = r4
            goto L70
        L38:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Failed to decode VALUE_STRING as base64 ("
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = "): "
            r1.append(r4)
            java.lang.String r4 = r0.getMessage()
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            com.fasterxml.jackson.core.JsonParseException r4 = r3.m10873a(r4)
            throw r4
        L5b:
            byte[] r0 = r3.f82950G
            if (r0 != 0) goto L70
            com.fasterxml.jackson.core.util.c r0 = r3.m84072l1()
            java.lang.String r1 = r3.mo10869W()
            r3.m84089E0(r1, r0, r4)
            byte[] r4 = r0.m11079q()
            r3.f82950G = r4
        L70:
            byte[] r4 = r3.f82950G
            return r4
    }

    /* JADX INFO: renamed from: p2 */
    public void m86861p2(java.lang.String r3, java.lang.String r4) throws java.io.IOException {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r3)
        L5:
            int r3 = r2.f82963s
            int r1 = r2.f82964t
            if (r3 < r1) goto L11
            boolean r3 = r2.m86845W1()
            if (r3 == 0) goto L34
        L11:
            char[] r3 = r2.f86345T
            int r1 = r2.f82963s
            char r3 = r3[r1]
            boolean r1 = java.lang.Character.isJavaIdentifierPart(r3)
            if (r1 != 0) goto L1e
            goto L34
        L1e:
            int r1 = r2.f82963s
            int r1 = r1 + 1
            r2.f82963s = r1
            r0.append(r3)
            int r3 = r0.length()
            r1 = 256(0x100, float:3.59E-43)
            if (r3 < r1) goto L5
            java.lang.String r3 = "..."
            r0.append(r3)
        L34:
            java.lang.String r3 = "Unrecognized token '%s': was expecting %s"
            r2.m84095M0(r3, r0, r4)
            return
    }

    /* JADX INFO: renamed from: q2 */
    public final int m86862q2() throws java.io.IOException {
            r3 = this;
        L0:
            int r0 = r3.f82963s
            int r1 = r3.f82964t
            if (r0 < r1) goto L2e
            boolean r0 = r3.m86845W1()
            if (r0 == 0) goto Ld
            goto L2e
        Ld:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Unexpected end-of-input within/between "
            r0.append(r1)
            i7.d r1 = r3.f82944A
            java.lang.String r1 = r1.m10941j()
            r0.append(r1)
            java.lang.String r1 = " entries"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.fasterxml.jackson.core.JsonParseException r0 = r3.m10873a(r0)
            throw r0
        L2e:
            char[] r0 = r3.f86345T
            int r1 = r3.f82963s
            int r2 = r1 + 1
            r3.f82963s = r2
            char r0 = r0[r1]
            r1 = 32
            if (r0 <= r1) goto L50
            r1 = 47
            if (r0 != r1) goto L44
            r3.m86868w2()
            goto L0
        L44:
            r1 = 35
            if (r0 != r1) goto L4f
            boolean r1 = r3.m86826B2()
            if (r1 == 0) goto L4f
            goto L0
        L4f:
            return r0
        L50:
            if (r0 >= r1) goto L0
            r1 = 10
            if (r0 != r1) goto L5f
            int r0 = r3.f82966v
            int r0 = r0 + 1
            r3.f82966v = r0
            r3.f82967w = r2
            goto L0
        L5f:
            r1 = 13
            if (r0 != r1) goto L67
            r3.m86864s2()
            goto L0
        L67:
            r1 = 9
            if (r0 == r1) goto L0
            r3.m84103U0(r0)
            goto L0
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    /* JADX INFO: renamed from: r0 */
    public java.lang.String mo10903r0() throws java.io.IOException {
            r7 = this;
            r0 = 0
            r7.f82951H = r0
            com.fasterxml.jackson.core.JsonToken r0 = r7.f82981e
            com.fasterxml.jackson.core.JsonToken r1 = com.fasterxml.jackson.core.JsonToken.FIELD_NAME
            r2 = 0
            if (r0 != r1) goto Le
            r7.m86849d2()
            return r2
        Le:
            boolean r0 = r7.f86350Y
            if (r0 == 0) goto L15
            r7.m86870y2()
        L15:
            int r0 = r7.m86871z2()
            if (r0 >= 0) goto L21
            r7.close()
            r7.f82981e = r2
            return r2
        L21:
            r7.f82950G = r2
            r3 = 93
            if (r0 == r3) goto Lcc
            r4 = 125(0x7d, float:1.75E-43)
            if (r0 != r4) goto L2d
            goto Lcc
        L2d:
            i7.d r5 = r7.f82944A
            boolean r5 = r5.m86801p()
            if (r5 == 0) goto L48
            int r0 = r7.m86867v2(r0)
            int r5 = r7.f10027b
            int r6 = p334i7.C38469g.f86335c0
            r5 = r5 & r6
            if (r5 == 0) goto L48
            if (r0 == r3) goto L44
            if (r0 != r4) goto L48
        L44:
            r7.m86835M1(r0)
            return r2
        L48:
            i7.d r3 = r7.f82944A
            boolean r3 = r3.m10938g()
            if (r3 != 0) goto L57
            r7.m86827C2()
            r7.m86850e2(r0)
            return r2
        L57:
            r7.m86828D2()
            r2 = 34
            if (r0 != r2) goto L63
            java.lang.String r0 = r7.m86854i2()
            goto L67
        L63:
            java.lang.String r0 = r7.m86842T1(r0)
        L67:
            i7.d r3 = r7.f82944A
            r3.m86805t(r0)
            r7.f82981e = r1
            int r1 = r7.m86865t2()
            r7.m86827C2()
            if (r1 != r2) goto L7f
            r1 = 1
            r7.f86350Y = r1
            com.fasterxml.jackson.core.JsonToken r1 = com.fasterxml.jackson.core.JsonToken.VALUE_STRING
            r7.f82945B = r1
            return r0
        L7f:
            r2 = 45
            if (r1 == r2) goto Lc5
            r2 = 46
            if (r1 == r2) goto Lc0
            r2 = 91
            if (r1 == r2) goto Lbd
            r2 = 102(0x66, float:1.43E-43)
            if (r1 == r2) goto Lb7
            r2 = 110(0x6e, float:1.54E-43)
            if (r1 == r2) goto Lb1
            r2 = 116(0x74, float:1.63E-43)
            if (r1 == r2) goto Lab
            r2 = 123(0x7b, float:1.72E-43)
            if (r1 == r2) goto La8
            switch(r1) {
                case 48: goto La3;
                case 49: goto La3;
                case 50: goto La3;
                case 51: goto La3;
                case 52: goto La3;
                case 53: goto La3;
                case 54: goto La3;
                case 55: goto La3;
                case 56: goto La3;
                case 57: goto La3;
                default: goto L9e;
            }
        L9e:
            com.fasterxml.jackson.core.JsonToken r1 = r7.m86844V1(r1)
            goto Lc9
        La3:
            com.fasterxml.jackson.core.JsonToken r1 = r7.m86858m2(r1)
            goto Lc9
        La8:
            com.fasterxml.jackson.core.JsonToken r1 = com.fasterxml.jackson.core.JsonToken.START_OBJECT
            goto Lc9
        Lab:
            r7.m86824c2()
            com.fasterxml.jackson.core.JsonToken r1 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE
            goto Lc9
        Lb1:
            r7.m86823Z1()
            com.fasterxml.jackson.core.JsonToken r1 = com.fasterxml.jackson.core.JsonToken.VALUE_NULL
            goto Lc9
        Lb7:
            r7.m86822Y1()
            com.fasterxml.jackson.core.JsonToken r1 = com.fasterxml.jackson.core.JsonToken.VALUE_FALSE
            goto Lc9
        Lbd:
            com.fasterxml.jackson.core.JsonToken r1 = com.fasterxml.jackson.core.JsonToken.START_ARRAY
            goto Lc9
        Lc0:
            com.fasterxml.jackson.core.JsonToken r1 = r7.m86853h2()
            goto Lc9
        Lc5:
            com.fasterxml.jackson.core.JsonToken r1 = r7.m86856k2()
        Lc9:
            r7.f82945B = r1
            return r0
        Lcc:
            r7.m86835M1(r0)
            return r2
    }

    /* JADX INFO: renamed from: r2 */
    public final void m86863r2() throws java.io.IOException {
            r3 = this;
        L0:
            int r0 = r3.f82963s
            int r1 = r3.f82964t
            if (r0 < r1) goto Lc
            boolean r0 = r3.m86845W1()
            if (r0 == 0) goto L26
        Lc:
            char[] r0 = r3.f86345T
            int r1 = r3.f82963s
            int r2 = r1 + 1
            r3.f82963s = r2
            char r0 = r0[r1]
            r1 = 42
            if (r0 > r1) goto L0
            if (r0 != r1) goto L3c
            int r0 = r3.f82964t
            if (r2 < r0) goto L2d
            boolean r0 = r3.m86845W1()
            if (r0 != 0) goto L2d
        L26:
            java.lang.String r0 = " in a comment"
            r1 = 0
            r3.m84098P0(r0, r1)
            return
        L2d:
            char[] r0 = r3.f86345T
            int r1 = r3.f82963s
            char r0 = r0[r1]
            r2 = 47
            if (r0 != r2) goto L0
            int r1 = r1 + 1
            r3.f82963s = r1
            return
        L3c:
            r1 = 32
            if (r0 >= r1) goto L0
            r1 = 10
            if (r0 != r1) goto L4d
            int r0 = r3.f82966v
            int r0 = r0 + 1
            r3.f82966v = r0
            r3.f82967w = r2
            goto L0
        L4d:
            r1 = 13
            if (r0 != r1) goto L55
            r3.m86864s2()
            goto L0
        L55:
            r1 = 9
            if (r0 == r1) goto L0
            r3.m84103U0(r0)
            goto L0
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    /* JADX INFO: renamed from: s0 */
    public final java.lang.String mo10904s0() throws java.io.IOException {
            r4 = this;
            com.fasterxml.jackson.core.JsonToken r0 = r4.f82981e
            com.fasterxml.jackson.core.JsonToken r1 = com.fasterxml.jackson.core.JsonToken.FIELD_NAME
            r2 = 0
            if (r0 != r1) goto L46
            r0 = 0
            r4.f82948E = r0
            com.fasterxml.jackson.core.JsonToken r1 = r4.f82945B
            r4.f82945B = r2
            r4.f82981e = r1
            com.fasterxml.jackson.core.JsonToken r3 = com.fasterxml.jackson.core.JsonToken.VALUE_STRING
            if (r1 != r3) goto L24
            boolean r1 = r4.f86350Y
            if (r1 == 0) goto L1d
            r4.f86350Y = r0
            r4.m86837O1()
        L1d:
            com.fasterxml.jackson.core.util.i r0 = r4.f82946C
            java.lang.String r0 = r0.m11106l()
            return r0
        L24:
            com.fasterxml.jackson.core.JsonToken r0 = com.fasterxml.jackson.core.JsonToken.START_ARRAY
            if (r1 != r0) goto L35
            i7.d r0 = r4.f82944A
            int r1 = r4.f82969y
            int r3 = r4.f82970z
            i7.d r0 = r0.m86799m(r1, r3)
            r4.f82944A = r0
            goto L45
        L35:
            com.fasterxml.jackson.core.JsonToken r0 = com.fasterxml.jackson.core.JsonToken.START_OBJECT
            if (r1 != r0) goto L45
            i7.d r0 = r4.f82944A
            int r1 = r4.f82969y
            int r3 = r4.f82970z
            i7.d r0 = r0.m86800n(r1, r3)
            r4.f82944A = r0
        L45:
            return r2
        L46:
            com.fasterxml.jackson.core.JsonToken r0 = r4.mo10905t0()
            com.fasterxml.jackson.core.JsonToken r1 = com.fasterxml.jackson.core.JsonToken.VALUE_STRING
            if (r0 != r1) goto L53
            java.lang.String r0 = r4.mo10869W()
            return r0
        L53:
            return r2
    }

    @Override // p254f7.AbstractC37385b
    /* JADX INFO: renamed from: s1 */
    public void mo84079s1() throws java.io.IOException {
            r2 = this;
            super.mo84079s1()
            k7.b r0 = r2.f86348W
            r0.m89705r()
            boolean r0 = r2.f86346U
            if (r0 == 0) goto L18
            char[] r0 = r2.f86345T
            if (r0 == 0) goto L18
            r1 = 0
            r2.f86345T = r1
            com.fasterxml.jackson.core.io.d r1 = r2.f82961q
            r1.m10992s(r0)
        L18:
            return
    }

    /* JADX INFO: renamed from: s2 */
    public final void m86864s2() throws java.io.IOException {
            r3 = this;
            int r0 = r3.f82963s
            int r1 = r3.f82964t
            if (r0 < r1) goto Lc
            boolean r0 = r3.m86845W1()
            if (r0 == 0) goto L1a
        Lc:
            char[] r0 = r3.f86345T
            int r1 = r3.f82963s
            char r0 = r0[r1]
            r2 = 10
            if (r0 != r2) goto L1a
            int r1 = r1 + 1
            r3.f82963s = r1
        L1a:
            int r0 = r3.f82966v
            int r0 = r0 + 1
            r3.f82966v = r0
            int r0 = r3.f82963s
            r3.f82967w = r0
            return
    }

    @Override // p254f7.AbstractC37386c, com.fasterxml.jackson.core.JsonParser
    /* JADX INFO: renamed from: t0 */
    public final com.fasterxml.jackson.core.JsonToken mo10905t0() throws java.io.IOException {
            r6 = this;
            com.fasterxml.jackson.core.JsonToken r0 = r6.f82981e
            com.fasterxml.jackson.core.JsonToken r1 = com.fasterxml.jackson.core.JsonToken.FIELD_NAME
            if (r0 != r1) goto Lb
            com.fasterxml.jackson.core.JsonToken r0 = r6.m86849d2()
            return r0
        Lb:
            r0 = 0
            r6.f82951H = r0
            boolean r0 = r6.f86350Y
            if (r0 == 0) goto L15
            r6.m86870y2()
        L15:
            int r0 = r6.m86871z2()
            r2 = 0
            if (r0 >= 0) goto L22
            r6.close()
            r6.f82981e = r2
            return r2
        L22:
            r6.f82950G = r2
            r2 = 93
            if (r0 == r2) goto Lf1
            r3 = 125(0x7d, float:1.75E-43)
            if (r0 != r3) goto L2e
            goto Lf1
        L2e:
            i7.d r4 = r6.f82944A
            boolean r4 = r4.m86801p()
            if (r4 == 0) goto L4b
            int r0 = r6.m86867v2(r0)
            int r4 = r6.f10027b
            int r5 = p334i7.C38469g.f86335c0
            r4 = r4 & r5
            if (r4 == 0) goto L4b
            if (r0 == r2) goto L45
            if (r0 != r3) goto L4b
        L45:
            r6.m86835M1(r0)
            com.fasterxml.jackson.core.JsonToken r0 = r6.f82981e
            return r0
        L4b:
            i7.d r2 = r6.f82944A
            boolean r2 = r2.m10938g()
            r4 = 34
            if (r2 == 0) goto L6e
            r6.m86828D2()
            if (r0 != r4) goto L5f
            java.lang.String r0 = r6.m86854i2()
            goto L63
        L5f:
            java.lang.String r0 = r6.m86842T1(r0)
        L63:
            i7.d r5 = r6.f82944A
            r5.m86805t(r0)
            r6.f82981e = r1
            int r0 = r6.m86865t2()
        L6e:
            r6.m86827C2()
            if (r0 == r4) goto Le2
            r1 = 91
            if (r0 == r1) goto Ld1
            r1 = 102(0x66, float:1.43E-43)
            if (r0 == r1) goto Lcb
            r1 = 110(0x6e, float:1.54E-43)
            if (r0 == r1) goto Lc5
            r1 = 116(0x74, float:1.63E-43)
            if (r0 == r1) goto Lbf
            r1 = 123(0x7b, float:1.72E-43)
            if (r0 == r1) goto Lae
            if (r0 == r3) goto La8
            r1 = 45
            if (r0 == r1) goto La3
            r1 = 46
            if (r0 == r1) goto L9e
            switch(r0) {
                case 48: goto L99;
                case 49: goto L99;
                case 50: goto L99;
                case 51: goto L99;
                case 52: goto L99;
                case 53: goto L99;
                case 54: goto L99;
                case 55: goto L99;
                case 56: goto L99;
                case 57: goto L99;
                default: goto L94;
            }
        L94:
            com.fasterxml.jackson.core.JsonToken r0 = r6.m86844V1(r0)
            goto Le7
        L99:
            com.fasterxml.jackson.core.JsonToken r0 = r6.m86858m2(r0)
            goto Le7
        L9e:
            com.fasterxml.jackson.core.JsonToken r0 = r6.m86853h2()
            goto Le7
        La3:
            com.fasterxml.jackson.core.JsonToken r0 = r6.m86856k2()
            goto Le7
        La8:
            java.lang.String r1 = "expected a value"
            r6.m84101S0(r0, r1)
            goto Lbf
        Lae:
            if (r2 != 0) goto Lbc
            i7.d r0 = r6.f82944A
            int r1 = r6.f82969y
            int r3 = r6.f82970z
            i7.d r0 = r0.m86800n(r1, r3)
            r6.f82944A = r0
        Lbc:
            com.fasterxml.jackson.core.JsonToken r0 = com.fasterxml.jackson.core.JsonToken.START_OBJECT
            goto Le7
        Lbf:
            r6.m86824c2()
            com.fasterxml.jackson.core.JsonToken r0 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE
            goto Le7
        Lc5:
            r6.m86823Z1()
            com.fasterxml.jackson.core.JsonToken r0 = com.fasterxml.jackson.core.JsonToken.VALUE_NULL
            goto Le7
        Lcb:
            r6.m86822Y1()
            com.fasterxml.jackson.core.JsonToken r0 = com.fasterxml.jackson.core.JsonToken.VALUE_FALSE
            goto Le7
        Ld1:
            if (r2 != 0) goto Ldf
            i7.d r0 = r6.f82944A
            int r1 = r6.f82969y
            int r3 = r6.f82970z
            i7.d r0 = r0.m86799m(r1, r3)
            r6.f82944A = r0
        Ldf:
            com.fasterxml.jackson.core.JsonToken r0 = com.fasterxml.jackson.core.JsonToken.START_ARRAY
            goto Le7
        Le2:
            r0 = 1
            r6.f86350Y = r0
            com.fasterxml.jackson.core.JsonToken r0 = com.fasterxml.jackson.core.JsonToken.VALUE_STRING
        Le7:
            if (r2 == 0) goto Lee
            r6.f82945B = r0
            com.fasterxml.jackson.core.JsonToken r0 = r6.f82981e
            return r0
        Lee:
            r6.f82981e = r0
            return r0
        Lf1:
            r6.m86835M1(r0)
            com.fasterxml.jackson.core.JsonToken r0 = r6.f82981e
            return r0
    }

    /* JADX INFO: renamed from: t2 */
    public final int m86865t2() throws java.io.IOException {
            r10 = this;
            int r0 = r10.f82963s
            int r1 = r0 + 4
            int r2 = r10.f82964t
            r3 = 0
            if (r1 < r2) goto Le
            int r0 = r10.m86866u2(r3)
            return r0
        Le:
            char[] r1 = r10.f86345T
            char r2 = r1[r0]
            r4 = 58
            r5 = 9
            r6 = 35
            r7 = 47
            r8 = 32
            r9 = 1
            if (r2 != r4) goto L56
            int r2 = r0 + 1
            r10.f82963s = r2
            char r2 = r1[r2]
            if (r2 <= r8) goto L36
            if (r2 == r7) goto L31
            if (r2 != r6) goto L2c
            goto L31
        L2c:
            int r0 = r0 + 2
            r10.f82963s = r0
            return r2
        L31:
            int r0 = r10.m86866u2(r9)
            return r0
        L36:
            if (r2 == r8) goto L3a
            if (r2 != r5) goto L51
        L3a:
            int r2 = r0 + 2
            r10.f82963s = r2
            char r1 = r1[r2]
            if (r1 <= r8) goto L51
            if (r1 == r7) goto L4c
            if (r1 != r6) goto L47
            goto L4c
        L47:
            int r0 = r0 + 3
            r10.f82963s = r0
            return r1
        L4c:
            int r0 = r10.m86866u2(r9)
            return r0
        L51:
            int r0 = r10.m86866u2(r9)
            return r0
        L56:
            if (r2 == r8) goto L5a
            if (r2 != r5) goto L5f
        L5a:
            int r0 = r0 + r9
            r10.f82963s = r0
            char r2 = r1[r0]
        L5f:
            if (r2 != r4) goto L9a
            int r0 = r10.f82963s
            int r2 = r0 + 1
            r10.f82963s = r2
            char r2 = r1[r2]
            if (r2 <= r8) goto L7a
            if (r2 == r7) goto L75
            if (r2 != r6) goto L70
            goto L75
        L70:
            int r0 = r0 + 2
            r10.f82963s = r0
            return r2
        L75:
            int r0 = r10.m86866u2(r9)
            return r0
        L7a:
            if (r2 == r8) goto L7e
            if (r2 != r5) goto L95
        L7e:
            int r2 = r0 + 2
            r10.f82963s = r2
            char r1 = r1[r2]
            if (r1 <= r8) goto L95
            if (r1 == r7) goto L90
            if (r1 != r6) goto L8b
            goto L90
        L8b:
            int r0 = r0 + 3
            r10.f82963s = r0
            return r1
        L90:
            int r0 = r10.m86866u2(r9)
            return r0
        L95:
            int r0 = r10.m86866u2(r9)
            return r0
        L9a:
            int r0 = r10.m86866u2(r3)
            return r0
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    /* JADX INFO: renamed from: u */
    public com.fasterxml.jackson.core.AbstractC6304g mo10906u() {
            r1 = this;
            com.fasterxml.jackson.core.g r0 = r1.f86347V
            return r0
    }

    /* JADX INFO: renamed from: u2 */
    public final int m86866u2(boolean r5) throws java.io.IOException {
            r4 = this;
        L0:
            int r0 = r4.f82963s
            int r1 = r4.f82964t
            if (r0 < r1) goto L2f
            boolean r0 = r4.m86845W1()
            if (r0 == 0) goto Ld
            goto L2f
        Ld:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r0 = " within/between "
            r5.append(r0)
            i7.d r0 = r4.f82944A
            java.lang.String r0 = r0.m10941j()
            r5.append(r0)
            java.lang.String r0 = " entries"
            r5.append(r0)
            java.lang.String r5 = r5.toString()
            r0 = 0
            r4.m84098P0(r5, r0)
            r5 = -1
            return r5
        L2f:
            char[] r0 = r4.f86345T
            int r1 = r4.f82963s
            int r2 = r1 + 1
            r4.f82963s = r2
            char r0 = r0[r1]
            r1 = 32
            r3 = 1
            if (r0 <= r1) goto L60
            r1 = 47
            if (r0 != r1) goto L46
            r4.m86868w2()
            goto L0
        L46:
            r1 = 35
            if (r0 != r1) goto L51
            boolean r1 = r4.m86826B2()
            if (r1 == 0) goto L51
            goto L0
        L51:
            if (r5 == 0) goto L54
            return r0
        L54:
            r5 = 58
            if (r0 == r5) goto L5e
            java.lang.String r5 = "was expecting a colon to separate field name and value"
            r4.m84101S0(r0, r5)
        L5e:
            r5 = r3
            goto L0
        L60:
            if (r0 >= r1) goto L0
            r1 = 10
            if (r0 != r1) goto L6e
            int r0 = r4.f82966v
            int r0 = r0 + r3
            r4.f82966v = r0
            r4.f82967w = r2
            goto L0
        L6e:
            r1 = 13
            if (r0 != r1) goto L76
            r4.m86864s2()
            goto L0
        L76:
            r1 = 9
            if (r0 == r1) goto L0
            r4.m84103U0(r0)
            goto L0
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    /* JADX INFO: renamed from: v */
    public com.fasterxml.jackson.core.JsonLocation mo10908v() {
            r9 = this;
            int r0 = r9.f82963s
            int r1 = r9.f82967w
            int r0 = r0 - r1
            int r8 = r0 + 1
            com.fasterxml.jackson.core.JsonLocation r1 = new com.fasterxml.jackson.core.JsonLocation
            com.fasterxml.jackson.core.io.ContentReference r2 = r9.m84067g1()
            long r3 = r9.f82965u
            int r0 = r9.f82963s
            long r5 = (long) r0
            long r5 = r5 + r3
            int r7 = r9.f82966v
            r3 = -1
            r1.<init>(r2, r3, r5, r7, r8)
            return r1
    }

    /* JADX INFO: renamed from: v2 */
    public final int m86867v2(int r4) throws java.io.IOException {
            r3 = this;
            r0 = 44
            if (r4 == r0) goto L24
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "was expecting comma to separate "
            r0.append(r1)
            i7.d r1 = r3.f82944A
            java.lang.String r1 = r1.m10941j()
            r0.append(r1)
            java.lang.String r1 = " entries"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r3.m84101S0(r4, r0)
        L24:
            int r4 = r3.f82963s
            int r0 = r3.f82964t
            if (r4 >= r0) goto L66
            char[] r0 = r3.f86345T
            int r1 = r4 + 1
            r3.f82963s = r1
            char r0 = r0[r4]
            r2 = 32
            if (r0 <= r2) goto L47
            r1 = 47
            if (r0 == r1) goto L40
            r1 = 35
            if (r0 != r1) goto L3f
            goto L40
        L3f:
            return r0
        L40:
            r3.f82963s = r4
            int r4 = r3.m86862q2()
            return r4
        L47:
            if (r0 >= r2) goto L24
            r4 = 10
            if (r0 != r4) goto L56
            int r4 = r3.f82966v
            int r4 = r4 + 1
            r3.f82966v = r4
            r3.f82967w = r1
            goto L24
        L56:
            r4 = 13
            if (r0 != r4) goto L5e
            r3.m86864s2()
            goto L24
        L5e:
            r4 = 9
            if (r0 == r4) goto L24
            r3.m84103U0(r0)
            goto L24
        L66:
            int r4 = r3.m86862q2()
            return r4
    }

    /* JADX INFO: renamed from: w2 */
    public final void m86868w2() throws java.io.IOException {
            r4 = this;
            int r0 = r4.f10027b
            int r1 = p334i7.C38469g.f86341i0
            r0 = r0 & r1
            r1 = 47
            if (r0 != 0) goto Le
            java.lang.String r0 = "maybe a (non-standard) comment? (not recognized as one since Feature 'ALLOW_COMMENTS' not enabled for parser)"
            r4.m84101S0(r1, r0)
        Le:
            int r0 = r4.f82963s
            int r2 = r4.f82964t
            if (r0 < r2) goto L20
            boolean r0 = r4.m86845W1()
            if (r0 != 0) goto L20
            java.lang.String r0 = " in a comment"
            r2 = 0
            r4.m84098P0(r0, r2)
        L20:
            char[] r0 = r4.f86345T
            int r2 = r4.f82963s
            int r3 = r2 + 1
            r4.f82963s = r3
            char r0 = r0[r2]
            if (r0 != r1) goto L30
            r4.m86869x2()
            return
        L30:
            r1 = 42
            if (r0 != r1) goto L38
            r4.m86863r2()
            return
        L38:
            java.lang.String r1 = "was expecting either '*' or '/' for a comment"
            r4.m84101S0(r0, r1)
            return
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    /* JADX INFO: renamed from: x0 */
    public int mo10913x0(com.fasterxml.jackson.core.Base64Variant r3, java.io.OutputStream r4) throws java.io.IOException {
            r2 = this;
            boolean r0 = r2.f86350Y
            if (r0 == 0) goto L22
            com.fasterxml.jackson.core.JsonToken r0 = r2.f82981e
            com.fasterxml.jackson.core.JsonToken r1 = com.fasterxml.jackson.core.JsonToken.VALUE_STRING
            if (r0 == r1) goto Lb
            goto L22
        Lb:
            com.fasterxml.jackson.core.io.d r0 = r2.f82961q
            byte[] r0 = r0.m10977d()
            int r3 = r2.m86859n2(r3, r4, r0)     // Catch: java.lang.Throwable -> L1b
            com.fasterxml.jackson.core.io.d r4 = r2.f82961q
            r4.m10988o(r0)
            return r3
        L1b:
            r3 = move-exception
            com.fasterxml.jackson.core.io.d r4 = r2.f82961q
            r4.m10988o(r0)
            throw r3
        L22:
            byte[] r3 = r2.mo10899p(r3)
            r4.write(r3)
            int r3 = r3.length
            return r3
    }

    /* JADX INFO: renamed from: x2 */
    public final void m86869x2() throws java.io.IOException {
            r3 = this;
        L0:
            int r0 = r3.f82963s
            int r1 = r3.f82964t
            if (r0 < r1) goto Le
            boolean r0 = r3.m86845W1()
            if (r0 == 0) goto Ld
            goto Le
        Ld:
            return
        Le:
            char[] r0 = r3.f86345T
            int r1 = r3.f82963s
            int r2 = r1 + 1
            r3.f82963s = r2
            char r0 = r0[r1]
            r1 = 32
            if (r0 >= r1) goto L0
            r1 = 10
            if (r0 != r1) goto L29
            int r0 = r3.f82966v
            int r0 = r0 + 1
            r3.f82966v = r0
            r3.f82967w = r2
            return
        L29:
            r1 = 13
            if (r0 != r1) goto L31
            r3.m86864s2()
            return
        L31:
            r1 = 9
            if (r0 == r1) goto L0
            r3.m84103U0(r0)
            goto L0
    }

    /* JADX INFO: renamed from: y2 */
    public final void m86870y2() throws java.io.IOException {
            r5 = this;
            r0 = 0
            r5.f86350Y = r0
            int r0 = r5.f82963s
            int r1 = r5.f82964t
            char[] r2 = r5.f86345T
        L9:
            if (r0 < r1) goto L1e
            r5.f82963s = r0
            boolean r0 = r5.m86845W1()
            if (r0 != 0) goto L1a
            java.lang.String r0 = ": was expecting closing quote for a string value"
            com.fasterxml.jackson.core.JsonToken r1 = com.fasterxml.jackson.core.JsonToken.VALUE_STRING
            r5.m84098P0(r0, r1)
        L1a:
            int r0 = r5.f82963s
            int r1 = r5.f82964t
        L1e:
            int r3 = r0 + 1
            char r0 = r2[r0]
            r4 = 92
            if (r0 > r4) goto L47
            if (r0 != r4) goto L32
            r5.f82963s = r3
            r5.mo84070j1()
            int r0 = r5.f82963s
            int r1 = r5.f82964t
            goto L9
        L32:
            r4 = 34
            if (r0 > r4) goto L47
            if (r0 != r4) goto L3b
            r5.f82963s = r3
            return
        L3b:
            r4 = 32
            if (r0 >= r4) goto L47
            r5.f82963s = r3
            java.lang.String r4 = "string value"
            r5.m84082v1(r0, r4)
        L47:
            r0 = r3
            goto L9
    }

    /* JADX INFO: renamed from: z2 */
    public final int m86871z2() throws java.io.IOException {
            r9 = this;
            int r0 = r9.f82963s
            int r1 = r9.f82964t
            if (r0 < r1) goto L11
            boolean r0 = r9.m86845W1()
            if (r0 != 0) goto L11
            int r0 = r9.m84071k1()
            return r0
        L11:
            char[] r0 = r9.f86345T
            int r1 = r9.f82963s
            int r2 = r1 + 1
            r9.f82963s = r2
            char r0 = r0[r1]
            r3 = 35
            r4 = 47
            r5 = 32
            if (r0 <= r5) goto L30
            if (r0 == r4) goto L29
            if (r0 != r3) goto L28
            goto L29
        L28:
            return r0
        L29:
            r9.f82963s = r1
            int r0 = r9.m86825A2()
            return r0
        L30:
            r1 = 9
            r6 = 13
            r7 = 10
            if (r0 == r5) goto L4e
            if (r0 != r7) goto L43
            int r0 = r9.f82966v
            int r0 = r0 + 1
            r9.f82966v = r0
            r9.f82967w = r2
            goto L4e
        L43:
            if (r0 != r6) goto L49
            r9.m86864s2()
            goto L4e
        L49:
            if (r0 == r1) goto L4e
            r9.m84103U0(r0)
        L4e:
            int r0 = r9.f82963s
            int r2 = r9.f82964t
            if (r0 >= r2) goto L84
            char[] r2 = r9.f86345T
            int r8 = r0 + 1
            r9.f82963s = r8
            char r2 = r2[r0]
            if (r2 <= r5) goto L6b
            if (r2 == r4) goto L64
            if (r2 != r3) goto L63
            goto L64
        L63:
            return r2
        L64:
            r9.f82963s = r0
            int r0 = r9.m86825A2()
            return r0
        L6b:
            if (r2 == r5) goto L4e
            if (r2 != r7) goto L78
            int r0 = r9.f82966v
            int r0 = r0 + 1
            r9.f82966v = r0
            r9.f82967w = r8
            goto L4e
        L78:
            if (r2 != r6) goto L7e
            r9.m86864s2()
            goto L4e
        L7e:
            if (r2 == r1) goto L4e
            r9.m84103U0(r2)
            goto L4e
        L84:
            int r0 = r9.m86825A2()
            return r0
    }
}
