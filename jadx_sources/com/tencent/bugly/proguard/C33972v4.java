package com.tencent.bugly.proguard;

import java.io.UnsupportedEncodingException;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.v4 */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public final class C33972v4 {

    /* JADX INFO: renamed from: a */
    public String f72323a = "GBK";

    /* JADX INFO: renamed from: b */
    public ByteBuffer f72324b;

    public C33972v4(ByteBuffer byteBuffer) {
        this.f72324b = byteBuffer;
    }

    /* JADX INFO: renamed from: a */
    public int m75283a(String str) {
        this.f72323a = str;
        return 0;
    }

    /* JADX INFO: renamed from: a */
    public C33731ja m75284a() {
        try {
            C33752ka.a aVar = new C33752ka.a();
            C33752ka.m73748a(aVar, this.f72324b);
            int i11 = 0;
            switch (aVar.f70615a) {
                case 0:
                    return C33731ja.m73532a(this.f72324b.get(), aVar.f70616b);
                case 1:
                    return C33731ja.m73539a(this.f72324b.getShort(), aVar.f70616b);
                case 2:
                    return C33731ja.m73536a(this.f72324b.getInt(), aVar.f70616b);
                case 3:
                    return C33731ja.m73537a(this.f72324b.getLong(), aVar.f70616b);
                case 4:
                    return C33731ja.m73534a(this.f72324b.getFloat(), aVar.f70616b);
                case 5:
                    return C33731ja.m73533a(this.f72324b.getDouble(), aVar.f70616b);
                case 6:
                    int i12 = this.f72324b.get();
                    if (i12 < 0) {
                        i12 += 256;
                    }
                    return m75285a(aVar, i12);
                case 7:
                    return m75285a(aVar, this.f72324b.getInt());
                case 8:
                    int iMo73981f = ((AbstractC33776ld) m75284a()).mo73981f();
                    C33731ja[] c33731jaArr = new C33731ja[iMo73981f];
                    C33731ja[] c33731jaArr2 = new C33731ja[iMo73981f];
                    while (i11 < iMo73981f) {
                        c33731jaArr[i11] = m75284a();
                        c33731jaArr2[i11] = m75284a();
                        i11++;
                    }
                    return new C33837ob(c33731jaArr, c33731jaArr2, aVar.f70616b);
                case 9:
                    int iMo73981f2 = ((AbstractC33776ld) m75284a()).mo73981f();
                    C33731ja[] c33731jaArr3 = new C33731ja[iMo73981f2];
                    while (i11 < iMo73981f2) {
                        c33731jaArr3[i11] = m75284a();
                        i11++;
                    }
                    return new C34038ya(c33731jaArr3, aVar.f70616b);
                case 10:
                    ArrayList arrayList = new ArrayList();
                    while (true) {
                        C33731ja c33731jaM75284a = m75284a();
                        if (c33731jaM75284a == null) {
                            return C33731ja.m73543b((C33731ja[]) arrayList.toArray(new C33731ja[0]), aVar.f70616b);
                        }
                        arrayList.add(c33731jaM75284a);
                    }
                    break;
                case 11:
                default:
                    return null;
                case 12:
                    return C33731ja.m73535a(aVar.f70616b);
                case 13:
                    int i13 = aVar.f70616b;
                    C33752ka.m73748a(aVar, this.f72324b);
                    if (aVar.f70615a == 0) {
                        byte[] bArr = new byte[((AbstractC33776ld) m75284a()).mo73981f()];
                        this.f72324b.get(bArr);
                        return new C33618e2(bArr, i13);
                    }
                    throw new C33689ha("type mismatch, simple_list only support byte, tag: " + i13 + ", type: " + ((int) aVar.f70615a));
            }
        } catch (BufferUnderflowException unused) {
            return null;
        }
    }

    public C33972v4(byte[] bArr) {
        this.f72324b = ByteBuffer.wrap(bArr);
    }

    /* JADX INFO: renamed from: a */
    public final C33731ja m75285a(C33752ka.a aVar, int i11) {
        String str;
        byte[] bArr = new byte[i11];
        this.f72324b.get(bArr);
        try {
            str = new String(bArr, this.f72323a);
        } catch (UnsupportedEncodingException unused) {
            str = new String(bArr);
        }
        return C33731ja.m73538a(str, aVar.f70616b);
    }
}
