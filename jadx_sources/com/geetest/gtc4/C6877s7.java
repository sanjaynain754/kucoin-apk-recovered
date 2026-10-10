package com.geetest.gtc4;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.nio.charset.StandardCharsets;

/* JADX INFO: renamed from: com.geetest.gtc4.s7 */
/* JADX INFO: loaded from: classes45.dex */
public final class C6877s7 extends AbstractC6780i0 {
    public C6877s7(C6844p1 c6844p1, ByteArrayInputStream byteArrayInputStream) {
        super(c6844p1, byteArrayInputStream);
    }

    /* JADX INFO: renamed from: d */
    public final C6868r7 m12710d(int i11) throws C6853q1 {
        long jM12658a = m12658a(i11);
        if (jM12658a == -1) {
            this.f11390b.getClass();
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            while (true) {
                AbstractC6756f3 abstractC6756f3M12690a = this.f11390b.m12690a();
                if (abstractC6756f3M12690a != null) {
                    EnumC6848p5 enumC6848p5 = abstractC6756f3M12690a.f11356a;
                    if (C6778h7.f11387d.equals(abstractC6756f3M12690a)) {
                        return new C6868r7(new String(byteArrayOutputStream.toByteArray(), StandardCharsets.UTF_8));
                    }
                    if (enumC6848p5 == EnumC6848p5.UNICODE_STRING) {
                        String str = ((C6868r7) abstractC6756f3M12690a).f11484d;
                        if (str == null) {
                            str = "null";
                        }
                        byte[] bytes = str.getBytes(StandardCharsets.UTF_8);
                        byteArrayOutputStream.write(bytes, 0, bytes.length);
                    } else {
                        throw new C6853q1("Unexpected major type " + enumC6848p5);
                    }
                } else {
                    throw new C6853q1("Unexpected end of stream");
                }
            }
        } else {
            return new C6868r7(new String(m12659a(jM12658a), StandardCharsets.UTF_8));
        }
    }
}
