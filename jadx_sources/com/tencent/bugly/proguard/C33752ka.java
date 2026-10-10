package com.tencent.bugly.proguard;

import java.io.UnsupportedEncodingException;
import java.lang.reflect.Array;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.ka */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public final class C33752ka {

    /* JADX INFO: renamed from: a */
    public ByteBuffer f70613a;

    /* JADX INFO: renamed from: b */
    public String f70614b = "GBK";

    /* JADX INFO: renamed from: com.tencent.bugly.proguard.ka$a */
    /* JADX INFO: compiled from: BUGLY */
    public static class a {

        /* JADX INFO: renamed from: a */
        public byte f70615a;

        /* JADX INFO: renamed from: b */
        public int f70616b;

        /* JADX INFO: renamed from: a */
        public void m73789a() {
            this.f70615a = (byte) 0;
            this.f70616b = 0;
        }
    }

    public C33752ka() {
    }

    /* JADX INFO: renamed from: a */
    public static void m73749a(String[] strArr) {
    }

    /* JADX INFO: renamed from: b */
    public void m73784b(a aVar) {
        m73748a(aVar, this.f70613a);
    }

    /* JADX INFO: renamed from: c */
    public void m73788c() {
        a aVar = new a();
        do {
            m73748a(aVar, this.f70613a);
            m73766a(aVar.f70615a);
        } while (aVar.f70615a != 11);
    }

    /* JADX INFO: renamed from: a */
    public void m73768a(byte[] bArr) {
        ByteBuffer byteBuffer = this.f70613a;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
        this.f70613a = ByteBuffer.wrap(bArr);
    }

    /* JADX INFO: renamed from: b */
    public boolean m73785b(int i11) {
        int i12;
        try {
            a aVar = new a();
            while (true) {
                int iM73754a = m73754a(aVar);
                i12 = aVar.f70616b;
                if (i11 <= i12 || aVar.f70615a == 11) {
                    break;
                    break;
                }
                m73767a(iM73754a);
                m73766a(aVar.f70615a);
            }
            return i11 == i12;
        } catch (C33689ha | BufferUnderflowException unused) {
        }
    }

    public C33752ka(ByteBuffer byteBuffer) {
        this.f70613a = byteBuffer;
    }

    /* JADX INFO: renamed from: a */
    public static int m73748a(a aVar, ByteBuffer byteBuffer) {
        byte b11 = byteBuffer.get();
        aVar.f70615a = (byte) (b11 & 15);
        int i11 = (b11 & 240) >> 4;
        aVar.f70616b = i11;
        if (i11 != 15) {
            return 1;
        }
        aVar.f70616b = byteBuffer.get();
        return 2;
    }

    /* JADX INFO: renamed from: c */
    public Map<String, String> m73787c(int i11, boolean z11) {
        HashMap map = new HashMap();
        if (m73785b(i11)) {
            a aVar = new a();
            m73748a(aVar, this.f70613a);
            if (aVar.f70615a == 8) {
                int iM73753a = m73753a(0, 0, true);
                if (iM73753a < 0) {
                    throw new C33689ha(C33986vi.m75326a("size invalid: ", iM73753a));
                }
                for (int i12 = 0; i12 < iM73753a; i12++) {
                    map.put(m73781b(0, true), m73781b(1, true));
                }
            } else {
                throw new C33689ha("type mismatch.");
            }
        } else if (z11) {
            throw new C33689ha("require field not exist.");
        }
        return map;
    }

    public C33752ka(byte[] bArr) {
        this.f70613a = ByteBuffer.wrap(bArr);
    }

    /* JADX INFO: renamed from: b */
    public final void m73783b() {
        a aVar = new a();
        m73748a(aVar, this.f70613a);
        m73766a(aVar.f70615a);
    }

    public C33752ka(byte[] bArr, int i11) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        this.f70613a = byteBufferWrap;
        byteBufferWrap.position(i11);
    }

    /* JADX INFO: renamed from: a */
    public final int m73754a(a aVar) {
        return m73748a(aVar, this.f70613a.duplicate());
    }

    /* JADX INFO: renamed from: a */
    public final void m73767a(int i11) {
        ByteBuffer byteBuffer = this.f70613a;
        byteBuffer.position(byteBuffer.position() + i11);
    }

    /* JADX INFO: renamed from: b */
    public String m73782b(String str, int i11, boolean z11) {
        if (!m73785b(i11)) {
            if (z11) {
                throw new C33689ha("require field not exist.");
            }
            return str;
        }
        a aVar = new a();
        m73748a(aVar, this.f70613a);
        byte b11 = aVar.f70615a;
        if (b11 == 6) {
            int i12 = this.f70613a.get();
            if (i12 < 0) {
                i12 += 256;
            }
            byte[] bArr = new byte[i12];
            this.f70613a.get(bArr);
            return C33935t7.m75045a(bArr);
        }
        if (b11 == 7) {
            int i13 = this.f70613a.getInt();
            if (i13 <= 104857600 && i13 >= 0) {
                byte[] bArr2 = new byte[i13];
                this.f70613a.get(bArr2);
                return C33935t7.m75045a(bArr2);
            }
            throw new C33689ha(C33986vi.m75326a("String too long: ", i13));
        }
        throw new C33689ha("type mismatch.");
    }

    /* JADX INFO: renamed from: a */
    public final void m73766a(byte b11) {
        int i11 = 0;
        switch (b11) {
            case 0:
                m73767a(1);
                return;
            case 1:
                m73767a(2);
                return;
            case 2:
                m73767a(4);
                return;
            case 3:
                m73767a(8);
                return;
            case 4:
                m73767a(4);
                return;
            case 5:
                m73767a(8);
                return;
            case 6:
                int i12 = this.f70613a.get();
                if (i12 < 0) {
                    i12 += 256;
                }
                m73767a(i12);
                return;
            case 7:
                m73767a(this.f70613a.getInt());
                return;
            case 8:
                int iM73753a = m73753a(0, 0, true);
                while (i11 < iM73753a * 2) {
                    m73783b();
                    i11++;
                }
                return;
            case 9:
                int iM73753a2 = m73753a(0, 0, true);
                while (i11 < iM73753a2) {
                    m73783b();
                    i11++;
                }
                return;
            case 10:
                m73788c();
                return;
            case 11:
            case 12:
                return;
            case 13:
                a aVar = new a();
                m73748a(aVar, this.f70613a);
                if (aVar.f70615a == 0) {
                    m73767a(m73753a(0, 0, true));
                    return;
                }
                throw new C33689ha("skipField with invalid type, type value: " + ((int) b11) + ", " + ((int) aVar.f70615a));
            default:
                throw new C33689ha("invalid type.");
        }
    }

    /* JADX INFO: renamed from: b */
    public String m73781b(int i11, boolean z11) {
        if (!m73785b(i11)) {
            if (z11) {
                throw new C33689ha("require field not exist.");
            }
            return null;
        }
        a aVar = new a();
        m73748a(aVar, this.f70613a);
        byte b11 = aVar.f70615a;
        if (b11 == 6) {
            int i12 = this.f70613a.get();
            if (i12 < 0) {
                i12 += 256;
            }
            byte[] bArr = new byte[i12];
            this.f70613a.get(bArr);
            try {
                return new String(bArr, this.f70614b);
            } catch (UnsupportedEncodingException unused) {
                return new String(bArr);
            }
        }
        if (b11 == 7) {
            int i13 = this.f70613a.getInt();
            if (i13 <= 104857600 && i13 >= 0) {
                byte[] bArr2 = new byte[i13];
                this.f70613a.get(bArr2);
                try {
                    return new String(bArr2, this.f70614b);
                } catch (UnsupportedEncodingException unused2) {
                    return new String(bArr2);
                }
            }
            throw new C33689ha(C33986vi.m75326a("String too long: ", i13));
        }
        throw new C33689ha("type mismatch.");
    }

    /* JADX INFO: renamed from: a */
    public boolean m73769a(boolean z11, int i11, boolean z12) {
        return m73750a((byte) 0, i11, z12) != 0;
    }

    /* JADX INFO: renamed from: a */
    public byte m73750a(byte b11, int i11, boolean z11) {
        if (!m73785b(i11)) {
            if (z11) {
                throw new C33689ha("require field not exist.");
            }
            return b11;
        }
        a aVar = new a();
        m73748a(aVar, this.f70613a);
        byte b12 = aVar.f70615a;
        if (b12 == 0) {
            return this.f70613a.get();
        }
        if (b12 == 12) {
            return (byte) 0;
        }
        throw new C33689ha("type mismatch.");
    }

    /* JADX INFO: renamed from: a */
    public short m73765a(short s11, int i11, boolean z11) {
        if (!m73785b(i11)) {
            if (z11) {
                throw new C33689ha("require field not exist.");
            }
            return s11;
        }
        a aVar = new a();
        m73748a(aVar, this.f70613a);
        byte b11 = aVar.f70615a;
        if (b11 == 0) {
            return this.f70613a.get();
        }
        if (b11 == 1) {
            return this.f70613a.getShort();
        }
        if (b11 == 12) {
            return (short) 0;
        }
        throw new C33689ha("type mismatch.");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public final <T> T[] m73786b(T t11, int i11, boolean z11) {
        if (!m73785b(i11)) {
            if (z11) {
                throw new C33689ha("require field not exist.");
            }
            return null;
        }
        a aVar = new a();
        m73748a(aVar, this.f70613a);
        if (aVar.f70615a == 9) {
            int iM73753a = m73753a(0, 0, true);
            if (iM73753a >= 0) {
                T[] tArr = (T[]) ((Object[]) Array.newInstance(t11.getClass(), iM73753a));
                for (int i12 = 0; i12 < iM73753a; i12++) {
                    tArr[i12] = m73758a((Object) t11, 0, true);
                }
                return tArr;
            }
            throw new C33689ha(C33986vi.m75326a("size invalid: ", iM73753a));
        }
        throw new C33689ha("type mismatch.");
    }

    /* JADX INFO: renamed from: a */
    public int m73753a(int i11, int i12, boolean z11) {
        if (!m73785b(i12)) {
            if (z11) {
                throw new C33689ha("require field not exist.");
            }
            return i11;
        }
        a aVar = new a();
        m73748a(aVar, this.f70613a);
        byte b11 = aVar.f70615a;
        if (b11 == 0) {
            return this.f70613a.get();
        }
        if (b11 == 1) {
            return this.f70613a.getShort();
        }
        if (b11 == 2) {
            return this.f70613a.getInt();
        }
        if (b11 == 12) {
            return 0;
        }
        throw new C33689ha("type mismatch.");
    }

    /* JADX INFO: renamed from: a */
    public long m73756a(long j11, int i11, boolean z11) {
        if (!m73785b(i11)) {
            if (z11) {
                throw new C33689ha("require field not exist.");
            }
            return j11;
        }
        a aVar = new a();
        m73748a(aVar, this.f70613a);
        byte b11 = aVar.f70615a;
        if (b11 == 12) {
            return 0L;
        }
        if (b11 == 0) {
            return this.f70613a.get();
        }
        if (b11 == 1) {
            return this.f70613a.getShort();
        }
        if (b11 == 2) {
            return this.f70613a.getInt();
        }
        if (b11 == 3) {
            return this.f70613a.getLong();
        }
        throw new C33689ha("type mismatch.");
    }

    /* JADX INFO: renamed from: b */
    public JceStruct m73780b(JceStruct jceStruct, int i11, boolean z11) {
        if (!m73785b(i11)) {
            if (z11) {
                throw new C33689ha("require field not exist.");
            }
            return null;
        }
        try {
            JceStruct jceStruct2 = (JceStruct) jceStruct.getClass().newInstance();
            a aVar = new a();
            m73748a(aVar, this.f70613a);
            if (aVar.f70615a == 10) {
                jceStruct2.mo72268a(this);
                m73788c();
                return jceStruct2;
            }
            throw new C33689ha("type mismatch.");
        } catch (Exception e11) {
            throw new C33689ha(e11.getMessage());
        }
    }

    /* JADX INFO: renamed from: a */
    public float m73752a(float f11, int i11, boolean z11) {
        if (!m73785b(i11)) {
            if (z11) {
                throw new C33689ha("require field not exist.");
            }
            return f11;
        }
        a aVar = new a();
        m73748a(aVar, this.f70613a);
        byte b11 = aVar.f70615a;
        if (b11 == 4) {
            return this.f70613a.getFloat();
        }
        if (b11 == 12) {
            return 0.0f;
        }
        throw new C33689ha("type mismatch.");
    }

    /* JADX INFO: renamed from: a */
    public double m73751a(double d11, int i11, boolean z11) {
        if (!m73785b(i11)) {
            if (z11) {
                throw new C33689ha("require field not exist.");
            }
            return d11;
        }
        a aVar = new a();
        m73748a(aVar, this.f70613a);
        byte b11 = aVar.f70615a;
        if (b11 == 4) {
            return this.f70613a.getFloat();
        }
        if (b11 == 5) {
            return this.f70613a.getDouble();
        }
        if (b11 == 12) {
            return 0.0d;
        }
        throw new C33689ha("type mismatch.");
    }

    /* JADX INFO: renamed from: a */
    public String m73759a(String str, int i11, boolean z11) {
        if (!m73785b(i11)) {
            if (z11) {
                throw new C33689ha("require field not exist.");
            }
            return str;
        }
        a aVar = new a();
        m73748a(aVar, this.f70613a);
        byte b11 = aVar.f70615a;
        if (b11 == 6) {
            int i12 = this.f70613a.get();
            if (i12 < 0) {
                i12 += 256;
            }
            byte[] bArr = new byte[i12];
            this.f70613a.get(bArr);
            try {
                return new String(bArr, this.f70614b);
            } catch (UnsupportedEncodingException unused) {
                return new String(bArr);
            }
        }
        if (b11 == 7) {
            int i13 = this.f70613a.getInt();
            if (i13 <= 104857600 && i13 >= 0) {
                byte[] bArr2 = new byte[i13];
                this.f70613a.get(bArr2);
                try {
                    return new String(bArr2, this.f70614b);
                } catch (UnsupportedEncodingException unused2) {
                    return new String(bArr2);
                }
            }
            throw new C33689ha(C33986vi.m75326a("String too long: ", i13));
        }
        throw new C33689ha("type mismatch.");
    }

    /* JADX INFO: renamed from: a */
    public String[] m73777a(String[] strArr, int i11, boolean z11) {
        return (String[]) m73776a((Object[]) strArr, i11, z11);
    }

    /* JADX INFO: renamed from: a */
    public <K, V> HashMap<K, V> m73761a(Map<K, V> map, int i11, boolean z11) {
        return (HashMap) m73764a(new HashMap(), map, i11, z11);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public final <K, V> Map<K, V> m73764a(Map<K, V> map, Map<K, V> map2, int i11, boolean z11) {
        if (map2 != null && !map2.isEmpty()) {
            Map.Entry<K, V> next = map2.entrySet().iterator().next();
            K key = next.getKey();
            V value = next.getValue();
            if (m73785b(i11)) {
                a aVar = new a();
                m73748a(aVar, this.f70613a);
                if (aVar.f70615a == 8) {
                    int iM73753a = m73753a(0, 0, true);
                    if (iM73753a < 0) {
                        throw new C33689ha(C33986vi.m75326a("size invalid: ", iM73753a));
                    }
                    for (int i12 = 0; i12 < iM73753a; i12++) {
                        map.put(m73758a(key, 0, true), m73758a(value, 1, true));
                    }
                } else {
                    throw new C33689ha("type mismatch.");
                }
            } else if (z11) {
                throw new C33689ha("require field not exist.");
            }
            return map;
        }
        return new HashMap();
    }

    /* JADX INFO: renamed from: a */
    public List m73762a(int i11, boolean z11) {
        ArrayList arrayList = new ArrayList();
        if (m73785b(i11)) {
            a aVar = new a();
            m73748a(aVar, this.f70613a);
            if (aVar.f70615a == 9) {
                int iM73753a = m73753a(0, 0, true);
                if (iM73753a < 0) {
                    throw new C33689ha(C33986vi.m75326a("size invalid: ", iM73753a));
                }
                for (int i12 = 0; i12 < iM73753a; i12++) {
                    a aVar2 = new a();
                    m73748a(aVar2, this.f70613a);
                    switch (aVar2.f70615a) {
                        case 0:
                            m73767a(1);
                            break;
                        case 1:
                            m73767a(2);
                            break;
                        case 2:
                            m73767a(4);
                            break;
                        case 3:
                            m73767a(8);
                            break;
                        case 4:
                            m73767a(4);
                            break;
                        case 5:
                            m73767a(8);
                            break;
                        case 6:
                            int i13 = this.f70613a.get();
                            if (i13 < 0) {
                                i13 += 256;
                            }
                            m73767a(i13);
                            break;
                        case 7:
                            m73767a(this.f70613a.getInt());
                            break;
                        case 8:
                        case 9:
                            break;
                        case 10:
                            try {
                                JceStruct jceStruct = (JceStruct) Class.forName(JceStruct.class.getName()).getConstructor(new Class[0]).newInstance(new Object[0]);
                                jceStruct.mo72268a(this);
                                m73788c();
                                arrayList.add(jceStruct);
                            } catch (Exception e11) {
                                e11.printStackTrace();
                                throw new C33689ha("type mismatch." + e11);
                            }
                            break;
                        case 11:
                        default:
                            throw new C33689ha("type mismatch.");
                        case 12:
                            arrayList.add(new Integer(0));
                            break;
                    }
                }
            } else {
                throw new C33689ha("type mismatch.");
            }
        } else if (z11) {
            throw new C33689ha("require field not exist.");
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: a */
    public boolean[] m73779a(boolean[] zArr, int i11, boolean z11) {
        if (!m73785b(i11)) {
            if (z11) {
                throw new C33689ha("require field not exist.");
            }
            return null;
        }
        a aVar = new a();
        m73748a(aVar, this.f70613a);
        if (aVar.f70615a == 9) {
            int iM73753a = m73753a(0, 0, true);
            if (iM73753a >= 0) {
                boolean[] zArr2 = new boolean[iM73753a];
                for (int i12 = 0; i12 < iM73753a; i12++) {
                    zArr2[i12] = m73769a(zArr2[0], 0, true);
                }
                return zArr2;
            }
            throw new C33689ha(C33986vi.m75326a("size invalid: ", iM73753a));
        }
        throw new C33689ha("type mismatch.");
    }

    /* JADX INFO: renamed from: a */
    public byte[] m73770a(byte[] bArr, int i11, boolean z11) {
        if (!m73785b(i11)) {
            if (z11) {
                throw new C33689ha("require field not exist.");
            }
            return null;
        }
        a aVar = new a();
        m73748a(aVar, this.f70613a);
        byte b11 = aVar.f70615a;
        if (b11 == 9) {
            int iM73753a = m73753a(0, 0, true);
            if (iM73753a >= 0) {
                byte[] bArr2 = new byte[iM73753a];
                for (int i12 = 0; i12 < iM73753a; i12++) {
                    bArr2[i12] = m73750a(bArr2[0], 0, true);
                }
                return bArr2;
            }
            throw new C33689ha(C33986vi.m75326a("size invalid: ", iM73753a));
        }
        if (b11 == 13) {
            a aVar2 = new a();
            m73748a(aVar2, this.f70613a);
            if (aVar2.f70615a == 0) {
                int iM73753a2 = m73753a(0, 0, true);
                if (iM73753a2 >= 0) {
                    byte[] bArr3 = new byte[iM73753a2];
                    this.f70613a.get(bArr3);
                    return bArr3;
                }
                throw new C33689ha("invalid size, tag: " + i11 + ", type: " + ((int) aVar.f70615a) + ", " + ((int) aVar2.f70615a) + ", size: " + iM73753a2);
            }
            throw new C33689ha("type mismatch, tag: " + i11 + ", type: " + ((int) aVar.f70615a) + ", " + ((int) aVar2.f70615a));
        }
        throw new C33689ha("type mismatch.");
    }

    /* JADX INFO: renamed from: a */
    public short[] m73778a(short[] sArr, int i11, boolean z11) {
        if (!m73785b(i11)) {
            if (z11) {
                throw new C33689ha("require field not exist.");
            }
            return null;
        }
        a aVar = new a();
        m73748a(aVar, this.f70613a);
        if (aVar.f70615a == 9) {
            int iM73753a = m73753a(0, 0, true);
            if (iM73753a >= 0) {
                short[] sArr2 = new short[iM73753a];
                for (int i12 = 0; i12 < iM73753a; i12++) {
                    sArr2[i12] = m73765a(sArr2[0], 0, true);
                }
                return sArr2;
            }
            throw new C33689ha(C33986vi.m75326a("size invalid: ", iM73753a));
        }
        throw new C33689ha("type mismatch.");
    }

    /* JADX INFO: renamed from: a */
    public int[] m73773a(int[] iArr, int i11, boolean z11) {
        if (!m73785b(i11)) {
            if (z11) {
                throw new C33689ha("require field not exist.");
            }
            return null;
        }
        a aVar = new a();
        m73748a(aVar, this.f70613a);
        if (aVar.f70615a == 9) {
            int iM73753a = m73753a(0, 0, true);
            if (iM73753a >= 0) {
                int[] iArr2 = new int[iM73753a];
                for (int i12 = 0; i12 < iM73753a; i12++) {
                    iArr2[i12] = m73753a(iArr2[0], 0, true);
                }
                return iArr2;
            }
            throw new C33689ha(C33986vi.m75326a("size invalid: ", iM73753a));
        }
        throw new C33689ha("type mismatch.");
    }

    /* JADX INFO: renamed from: a */
    public long[] m73774a(long[] jArr, int i11, boolean z11) {
        if (!m73785b(i11)) {
            if (z11) {
                throw new C33689ha("require field not exist.");
            }
            return null;
        }
        a aVar = new a();
        m73748a(aVar, this.f70613a);
        if (aVar.f70615a == 9) {
            int iM73753a = m73753a(0, 0, true);
            if (iM73753a >= 0) {
                long[] jArr2 = new long[iM73753a];
                for (int i12 = 0; i12 < iM73753a; i12++) {
                    jArr2[i12] = m73756a(jArr2[0], 0, true);
                }
                return jArr2;
            }
            throw new C33689ha(C33986vi.m75326a("size invalid: ", iM73753a));
        }
        throw new C33689ha("type mismatch.");
    }

    /* JADX INFO: renamed from: a */
    public float[] m73772a(float[] fArr, int i11, boolean z11) {
        if (!m73785b(i11)) {
            if (z11) {
                throw new C33689ha("require field not exist.");
            }
            return null;
        }
        a aVar = new a();
        m73748a(aVar, this.f70613a);
        if (aVar.f70615a == 9) {
            int iM73753a = m73753a(0, 0, true);
            if (iM73753a >= 0) {
                float[] fArr2 = new float[iM73753a];
                for (int i12 = 0; i12 < iM73753a; i12++) {
                    fArr2[i12] = m73752a(fArr2[0], 0, true);
                }
                return fArr2;
            }
            throw new C33689ha(C33986vi.m75326a("size invalid: ", iM73753a));
        }
        throw new C33689ha("type mismatch.");
    }

    /* JADX INFO: renamed from: a */
    public double[] m73771a(double[] dArr, int i11, boolean z11) {
        if (!m73785b(i11)) {
            if (z11) {
                throw new C33689ha("require field not exist.");
            }
            return null;
        }
        a aVar = new a();
        m73748a(aVar, this.f70613a);
        if (aVar.f70615a == 9) {
            int iM73753a = m73753a(0, 0, true);
            if (iM73753a >= 0) {
                double[] dArr2 = new double[iM73753a];
                for (int i12 = 0; i12 < iM73753a; i12++) {
                    dArr2[i12] = m73751a(dArr2[0], 0, true);
                }
                return dArr2;
            }
            throw new C33689ha(C33986vi.m75326a("size invalid: ", iM73753a));
        }
        throw new C33689ha("type mismatch.");
    }

    /* JADX INFO: renamed from: a */
    public <T> T[] m73776a(T[] tArr, int i11, boolean z11) {
        if (tArr != null && tArr.length != 0) {
            return (T[]) m73786b(tArr[0], i11, z11);
        }
        throw new C33689ha("unable to get type of key and value.");
    }

    /* JADX INFO: renamed from: a */
    public <T> List<T> m73763a(List<T> list, int i11, boolean z11) {
        if (list != null && !list.isEmpty()) {
            Object[] objArrM73786b = m73786b(list.get(0), i11, z11);
            if (objArrM73786b == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            for (Object obj : objArrM73786b) {
                arrayList.add(obj);
            }
            return arrayList;
        }
        return new ArrayList();
    }

    /* JADX INFO: renamed from: a */
    public JceStruct m73757a(JceStruct jceStruct, int i11, boolean z11) {
        if (!m73785b(i11)) {
            if (z11) {
                throw new C33689ha("require field not exist.");
            }
            return null;
        }
        try {
            JceStruct jceStructM72267a = jceStruct.m72267a();
            a aVar = new a();
            m73748a(aVar, this.f70613a);
            if (aVar.f70615a == 10) {
                jceStructM72267a.mo72268a(this);
                m73788c();
                return jceStructM72267a;
            }
            throw new C33689ha("type mismatch.");
        } catch (Exception e11) {
            throw new C33689ha(e11.getMessage());
        }
    }

    /* JADX INFO: renamed from: a */
    public JceStruct[] m73775a(JceStruct[] jceStructArr, int i11, boolean z11) {
        return (JceStruct[]) m73776a((Object[]) jceStructArr, i11, z11);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public <T> Object m73758a(T t11, int i11, boolean z11) {
        if (t11 instanceof Byte) {
            return Byte.valueOf(m73750a((byte) 0, i11, z11));
        }
        if (t11 instanceof Boolean) {
            return Boolean.valueOf(m73769a(false, i11, z11));
        }
        if (t11 instanceof Short) {
            return Short.valueOf(m73765a((short) 0, i11, z11));
        }
        if (t11 instanceof Integer) {
            return Integer.valueOf(m73753a(0, i11, z11));
        }
        if (t11 instanceof Long) {
            return Long.valueOf(m73756a(0L, i11, z11));
        }
        if (t11 instanceof Float) {
            return Float.valueOf(m73752a(0.0f, i11, z11));
        }
        if (t11 instanceof Double) {
            return Double.valueOf(m73751a(0.0d, i11, z11));
        }
        if (t11 instanceof String) {
            return String.valueOf(m73781b(i11, z11));
        }
        if (t11 instanceof Map) {
            return m73761a((Map) t11, i11, z11);
        }
        if (t11 instanceof List) {
            return m73763a((List) t11, i11, z11);
        }
        if (t11 instanceof JceStruct) {
            return m73780b((JceStruct) t11, i11, z11);
        }
        if (t11.getClass().isArray()) {
            if (!(t11 instanceof byte[]) && !(t11 instanceof Byte[])) {
                if (t11 instanceof boolean[]) {
                    return m73779a((boolean[]) null, i11, z11);
                }
                if (t11 instanceof short[]) {
                    return m73778a((short[]) null, i11, z11);
                }
                if (t11 instanceof int[]) {
                    return m73773a((int[]) null, i11, z11);
                }
                if (t11 instanceof long[]) {
                    return m73774a((long[]) null, i11, z11);
                }
                if (t11 instanceof float[]) {
                    return m73772a((float[]) null, i11, z11);
                }
                if (t11 instanceof double[]) {
                    return m73771a((double[]) null, i11, z11);
                }
                return m73776a((Object[]) t11, i11, z11);
            }
            return m73770a((byte[]) null, i11, z11);
        }
        throw new C33689ha("read object error: unsupport type.");
    }

    /* JADX INFO: renamed from: a */
    public int m73755a(String str) {
        this.f70614b = str;
        return 0;
    }

    /* JADX INFO: renamed from: a */
    public ByteBuffer m73760a() {
        return this.f70613a;
    }
}
