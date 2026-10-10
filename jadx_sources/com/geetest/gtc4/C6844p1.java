package com.geetest.gtc4;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* JADX INFO: renamed from: com.geetest.gtc4.p1 */
/* JADX INFO: loaded from: classes45.dex */
public final class C6844p1 {

    /* JADX INFO: renamed from: a */
    public final ByteArrayInputStream f11456a;

    /* JADX INFO: renamed from: b */
    public final C6895u7 f11457b;

    /* JADX INFO: renamed from: c */
    public final C6937z5 f11458c;

    /* JADX INFO: renamed from: d */
    public final C6826n1 f11459d;

    /* JADX INFO: renamed from: e */
    public final C6877s7 f11460e;

    /* JADX INFO: renamed from: f */
    public final C6816m0 f11461f;

    /* JADX INFO: renamed from: g */
    public final C6866r5 f11462g;

    /* JADX INFO: renamed from: h */
    public final C6850p7 f11463h;

    /* JADX INFO: renamed from: i */
    public final C6796j7 f11464i;

    /* JADX INFO: renamed from: a */
    public final AbstractC6756f3 m12690a() {
        double dPow;
        double dPow2;
        float f11;
        try {
            int i11 = this.f11456a.read();
            if (i11 == -1) {
                return null;
            }
            long j11 = 0;
            switch (AbstractC6835o1.f11446a[EnumC6848p5.ofByte(i11).ordinal()]) {
                case 1:
                    C6816m0 c6816m0 = this.f11461f;
                    long jM12658a = c6816m0.m12658a(i11);
                    if (jM12658a != -1) {
                        C6807l0 c6807l0 = new C6807l0(Math.abs((int) jM12658a));
                        while (j11 < jM12658a) {
                            AbstractC6756f3 abstractC6756f3M12690a = c6816m0.f11390b.m12690a();
                            if (abstractC6756f3M12690a == null) {
                                throw new C6853q1("Unexpected end of stream");
                            }
                            c6807l0.f11421d.add(abstractC6756f3M12690a);
                            j11++;
                        }
                        return c6807l0;
                    }
                    C6807l0 c6807l1 = new C6807l0();
                    c6807l1.f11489c = true;
                    c6816m0.f11390b.getClass();
                    while (true) {
                        AbstractC6756f3 abstractC6756f3M12690a2 = c6816m0.f11390b.m12690a();
                        if (abstractC6756f3M12690a2 == null) {
                            throw new C6853q1("Unexpected end of stream");
                        }
                        C6778h7 c6778h7 = C6778h7.f11387d;
                        if (c6778h7.equals(abstractC6756f3M12690a2)) {
                            c6807l1.f11421d.add(c6778h7);
                            return c6807l1;
                        }
                        c6807l1.f11421d.add(abstractC6756f3M12690a2);
                    }
                    break;
                case 2:
                    C6826n1 c6826n1 = this.f11459d;
                    long jM12658a2 = c6826n1.m12658a(i11);
                    if (jM12658a2 != -1) {
                        return new C6817m1(c6826n1.m12659a(jM12658a2));
                    }
                    c6826n1.f11390b.getClass();
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    while (true) {
                        AbstractC6756f3 abstractC6756f3M12690a3 = c6826n1.f11390b.m12690a();
                        if (abstractC6756f3M12690a3 == null) {
                            throw new C6853q1("Unexpected end of stream");
                        }
                        EnumC6848p5 enumC6848p5 = abstractC6756f3M12690a3.f11356a;
                        if (C6778h7.f11387d.equals(abstractC6756f3M12690a3)) {
                            return new C6817m1(byteArrayOutputStream.toByteArray());
                        }
                        if (enumC6848p5 != EnumC6848p5.BYTE_STRING) {
                            throw new C6853q1("Unexpected major type " + enumC6848p5);
                        }
                        byte[] bArr = ((C6817m1) abstractC6756f3M12690a3).f11434d;
                        if (bArr == null) {
                            bArr = null;
                        }
                        if (bArr != null) {
                            byteArrayOutputStream.write(bArr, 0, bArr.length);
                        }
                    }
                    break;
                case 3:
                    C6866r5 c6866r5 = this.f11462g;
                    long jM12658a3 = c6866r5.m12658a(i11);
                    if (jM12658a3 != -1) {
                        C6857q5 c6857q5 = new C6857q5(Math.abs((int) jM12658a3));
                        while (j11 < jM12658a3) {
                            AbstractC6756f3 abstractC6756f3M12690a4 = c6866r5.f11390b.m12690a();
                            AbstractC6756f3 abstractC6756f3M12690a5 = c6866r5.f11390b.m12690a();
                            if (abstractC6756f3M12690a4 == null || abstractC6756f3M12690a5 == null) {
                                throw new C6853q1("Unexpected end of stream");
                            }
                            c6866r5.f11390b.getClass();
                            if (c6857q5.f11473d.put(abstractC6756f3M12690a4, abstractC6756f3M12690a5) == null) {
                                c6857q5.f11474e.add(abstractC6756f3M12690a4);
                            }
                            j11++;
                        }
                        return c6857q5;
                    }
                    C6857q5 c6857q6 = new C6857q5();
                    c6857q6.f11489c = true;
                    c6866r5.f11390b.getClass();
                    while (true) {
                        AbstractC6756f3 abstractC6756f3M12690a6 = c6866r5.f11390b.m12690a();
                        if (C6778h7.f11387d.equals(abstractC6756f3M12690a6)) {
                            return c6857q6;
                        }
                        AbstractC6756f3 abstractC6756f3M12690a7 = c6866r5.f11390b.m12690a();
                        if (abstractC6756f3M12690a6 == null || abstractC6756f3M12690a7 == null) {
                            throw new C6853q1("Unexpected end of stream");
                        }
                        c6866r5.f11390b.getClass();
                        if (c6857q6.f11473d.put(abstractC6756f3M12690a6, abstractC6756f3M12690a7) == null) {
                            c6857q6.f11474e.add(abstractC6756f3M12690a6);
                        }
                    }
                    break;
                case 4:
                    return new C6929y5(C6937z5.f11567c.subtract(this.f11458c.m12660b(i11)));
                case 5:
                    return this.f11460e.m12710d(i11);
                case 6:
                    return new C6886t7(this.f11457b.m12660b(i11));
                case 7:
                    C6796j7 c6796j7 = this.f11464i;
                    c6796j7.getClass();
                    switch (AbstractC6787i7.f11398b[EnumC6805k7.ofByte(i11).ordinal()]) {
                        case 1:
                            return C6778h7.f11387d;
                        case 2:
                            int i12 = AbstractC6787i7.f11397a[EnumC6903v6.ofByte(i11).ordinal()];
                            if (i12 == 1) {
                                return C6894u6.f11526g;
                            }
                            if (i12 == 2) {
                                return C6894u6.f11527h;
                            }
                            if (i12 == 3) {
                                return C6894u6.f11528i;
                            }
                            if (i12 == 4) {
                                return C6894u6.f11529j;
                            }
                            if (i12 == 5) {
                                return new C6894u6(i11 & 31);
                            }
                            throw new C6853q1("Not implemented");
                        case 3:
                            byte[] bArrM12661c = c6796j7.f11414c.m12661c(2);
                            int i13 = (bArrM12661c[1] & 255) | ((bArrM12661c[0] & 255) << 8);
                            int i14 = (32768 & i13) >> 15;
                            int i15 = (i13 & 31744) >> 10;
                            int i16 = i13 & 1023;
                            if (i15 != 0) {
                                if (i15 != 31) {
                                    dPow = Math.pow(2.0d, i15 - 15) * ((double) (i14 == 0 ? 1 : -1));
                                    dPow2 = (((double) i16) / Math.pow(2.0d, 10.0d)) + 1.0d;
                                } else if (i16 != 0) {
                                    f11 = Float.NaN;
                                } else {
                                    f11 = (i14 == 0 ? 1 : -1) * Float.POSITIVE_INFINITY;
                                }
                                return new C6935z3(f11);
                            }
                            dPow = Math.pow(2.0d, -14.0d) * ((double) (i14 == 0 ? 1 : -1));
                            dPow2 = ((double) i16) / Math.pow(2.0d, 10.0d);
                            f11 = (float) (dPow2 * dPow);
                            return new C6935z3(f11);
                        case 4:
                            byte[] bArrM12661c2 = c6796j7.f11415d.m12661c(4);
                            return new C6912w6(Float.intBitsToFloat((bArrM12661c2[3] & 255) | ((((((bArrM12661c2[0] & 255) << 8) | (bArrM12661c2[1] & 255)) << 8) | (bArrM12661c2[2] & 255)) << 8)));
                        case 5:
                            byte[] bArrM12661c3 = c6796j7.f11416e.m12661c(8);
                            return new C6792j3(Double.longBitsToDouble((((((((((((((((long) (bArrM12661c3[0] & 255)) << 8) | ((long) (bArrM12661c3[1] & 255))) << 8) | ((long) (bArrM12661c3[2] & 255))) << 8) | ((long) (bArrM12661c3[3] & 255))) << 8) | ((long) (bArrM12661c3[4] & 255))) << 8) | ((long) (bArrM12661c3[5] & 255))) << 8) | ((long) (bArrM12661c3[6] & 255))) << 8) | ((long) (bArrM12661c3[7] & 255))));
                        case 6:
                            return new C6894u6(c6796j7.m12657a());
                        default:
                            throw new C6853q1("Not implemented");
                    }
                case 8:
                    C6841o7 c6841o7 = new C6841o7(this.f11463h.m12658a(i11));
                    AbstractC6756f3 abstractC6756f3M12690a8 = m12690a();
                    if (abstractC6756f3M12690a8 == null) {
                        throw new C6853q1("Unexpected end of stream: tag without following data item.");
                    }
                    long j12 = c6841o7.f11452c;
                    if (j12 == 30) {
                        if (!(abstractC6756f3M12690a8 instanceof C6807l0)) {
                            throw new C6853q1("Error decoding RationalNumber: not an array");
                        }
                        C6807l0 c6807l2 = (C6807l0) abstractC6756f3M12690a8;
                        if (c6807l2.f11421d.size() != 2) {
                            throw new C6853q1("Error decoding RationalNumber: array size is not 2");
                        }
                        AbstractC6756f3 abstractC6756f3 = (AbstractC6756f3) c6807l2.f11421d.get(0);
                        if (!(abstractC6756f3 instanceof AbstractC6741d6)) {
                            throw new C6853q1("Error decoding RationalNumber: first data item is not a number");
                        }
                        AbstractC6756f3 abstractC6756f4 = (AbstractC6756f3) c6807l2.f11421d.get(1);
                        if (abstractC6756f4 instanceof AbstractC6741d6) {
                            return new C6858q6((AbstractC6741d6) abstractC6756f3, (AbstractC6741d6) abstractC6756f4);
                        }
                        throw new C6853q1("Error decoding RationalNumber: second data item is not a number");
                    }
                    if (j12 == 38) {
                        if (!(abstractC6756f3M12690a8 instanceof C6807l0)) {
                            throw new C6853q1("Error decoding LanguageTaggedString: not an array");
                        }
                        C6807l0 c6807l3 = (C6807l0) abstractC6756f3M12690a8;
                        if (c6807l3.f11421d.size() != 2) {
                            throw new C6853q1("Error decoding LanguageTaggedString: array size is not 2");
                        }
                        AbstractC6756f3 abstractC6756f5 = (AbstractC6756f3) c6807l3.f11421d.get(0);
                        if (!(abstractC6756f5 instanceof C6868r7)) {
                            throw new C6853q1("Error decoding LanguageTaggedString: first data item is not an UnicodeString");
                        }
                        AbstractC6756f3 abstractC6756f6 = (AbstractC6756f3) c6807l3.f11421d.get(1);
                        if (abstractC6756f6 instanceof C6868r7) {
                            return new C6803k5((C6868r7) abstractC6756f5, (C6868r7) abstractC6756f6);
                        }
                        throw new C6853q1("Error decoding LanguageTaggedString: second data item is not an UnicodeString");
                    }
                    AbstractC6756f3 abstractC6756f7 = abstractC6756f3M12690a8;
                    while (true) {
                        C6841o7 c6841o8 = abstractC6756f7.f11357b;
                        if (c6841o8 == null) {
                            abstractC6756f7.f11357b = c6841o7;
                            return abstractC6756f3M12690a8;
                        }
                        abstractC6756f7 = c6841o8;
                    }
                    break;
                default:
                    throw new C6853q1("Not implemented major type " + i11);
            }
        } catch (IOException e11) {
            throw new C6853q1(e11);
        }
    }

    public C6844p1(ByteArrayInputStream byteArrayInputStream) {
        this.f11456a = byteArrayInputStream;
        this.f11457b = new C6895u7(this, byteArrayInputStream);
        this.f11458c = new C6937z5(this, byteArrayInputStream);
        this.f11459d = new C6826n1(this, byteArrayInputStream);
        this.f11460e = new C6877s7(this, byteArrayInputStream);
        this.f11461f = new C6816m0(this, byteArrayInputStream);
        this.f11462g = new C6866r5(this, byteArrayInputStream);
        this.f11463h = new C6850p7(this, byteArrayInputStream);
        this.f11464i = new C6796j7(this, byteArrayInputStream);
    }
}
