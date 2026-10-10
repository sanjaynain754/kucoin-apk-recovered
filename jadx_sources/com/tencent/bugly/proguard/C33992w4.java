package com.tencent.bugly.proguard;

import java.nio.ByteBuffer;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.w4 */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public final class C33992w4 extends C33773la {
    public C33992w4(ByteBuffer byteBuffer) {
        super(byteBuffer);
    }

    public C33992w4(int i11) {
        super(i11);
    }

    public C33992w4() {
    }

    /* JADX INFO: renamed from: a */
    public void m75344a(C33731ja c33731ja) {
        int iM73544a = c33731ja.m73544a();
        int i11 = 0;
        if (c33731ja instanceof C34046yi) {
            m73946a(0, iM73544a);
            return;
        }
        if (c33731ja instanceof C33626ea) {
            m73946a(((C33626ea) c33731ja).m72934i(), iM73544a);
            return;
        }
        if (c33731ja instanceof C33737jg) {
            m73960a(((C33737jg) c33731ja).f70404c, iM73544a);
            return;
        }
        if (c33731ja instanceof C33639f2) {
            m73942a(((C33639f2) c33731ja).f69793c, iM73544a);
            return;
        }
        if (c33731ja instanceof C33884qg) {
            m73957a(((C33884qg) c33731ja).m74703b(), iM73544a);
            return;
        }
        if (c33731ja instanceof C33618e2) {
            m73962a(((C33618e2) c33731ja).m72886b(), iM73544a);
            return;
        }
        if (c33731ja instanceof C34038ya) {
            C34038ya c34038ya = (C34038ya) c33731ja;
            m73945a(8);
            m73970b((byte) 9, iM73544a);
            m73946a(c34038ya.f72551c.length, 0);
            C33731ja[] c33731jaArr = c34038ya.f72551c;
            int length = c33731jaArr.length;
            while (i11 < length) {
                m75344a(c33731jaArr[i11]);
                i11++;
            }
            return;
        }
        if (c33731ja instanceof C33837ob) {
            C33837ob c33837ob = (C33837ob) c33731ja;
            m73945a(8);
            m73970b((byte) 8, iM73544a);
            int length2 = c33837ob.f71326c.length;
            m73946a(length2, 0);
            while (i11 < length2) {
                m75344a(c33837ob.f71326c[i11]);
                m75344a(c33837ob.f71327d[i11]);
                i11++;
            }
            return;
        }
        if (c33731ja instanceof C33904rg) {
            m73945a(2);
            m73970b((byte) 10, iM73544a);
            for (C33731ja c33731ja2 : ((C33904rg) c33731ja).m74870b()) {
                m75344a(c33731ja2);
            }
            m73945a(2);
            m73970b((byte) 11, 0);
            return;
        }
        if (c33731ja instanceof C33669gb) {
            m73947a(((C33669gb) c33731ja).m73174i(), iM73544a);
        } else if (c33731ja instanceof C33581c7) {
            m73944a(((C33581c7) c33731ja).m72655i(), iM73544a);
        } else {
            if (c33731ja instanceof C33892r4) {
                m73943a(((C33892r4) c33731ja).m74796i(), iM73544a);
                return;
            }
            throw new C33689ha("unknow JceField type: ".concat(c33731ja.getClass().getName()));
        }
    }
}
