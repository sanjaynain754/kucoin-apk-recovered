package com.tencent.bugly.proguard;

import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.la */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public class C33773la {

    /* JADX INFO: renamed from: a */
    public ByteBuffer f70833a;

    /* JADX INFO: renamed from: b */
    public String f70834b;

    public C33773la(ByteBuffer byteBuffer) {
        this.f70834b = "GBK";
        this.f70833a = byteBuffer;
    }

    /* JADX INFO: renamed from: a */
    public ByteBuffer m73941a() {
        return this.f70833a;
    }

    /* JADX INFO: renamed from: b */
    public byte[] m73973b() {
        byte[] bArr = new byte[this.f70833a.position()];
        System.arraycopy(this.f70833a.array(), 0, bArr, 0, this.f70833a.position());
        return bArr;
    }

    /* JADX INFO: renamed from: a */
    public void m73945a(int i11) {
        if (this.f70833a.remaining() < i11) {
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate((this.f70833a.capacity() + i11) * 2);
            byteBufferAllocate.put(this.f70833a.array(), 0, this.f70833a.position());
            this.f70833a = byteBufferAllocate;
        }
    }

    /* JADX INFO: renamed from: b */
    public void m73970b(byte b11, int i11) {
        if (i11 < 15) {
            this.f70833a.put((byte) (b11 | (i11 << 4)));
        } else {
            if (i11 < 256) {
                this.f70833a.put((byte) (b11 | 240));
                this.f70833a.put((byte) i11);
                return;
            }
            throw new C33710ia(C33986vi.m75326a("tag is too large: ", i11));
        }
    }

    /* JADX INFO: renamed from: c */
    public void m73974c(String str, int i11) {
        byte[] bArrM75047b = C33935t7.m75047b(str);
        m73945a(bArrM75047b.length + 10);
        if (bArrM75047b.length > 255) {
            m73970b((byte) 7, i11);
            this.f70833a.putInt(bArrM75047b.length);
            this.f70833a.put(bArrM75047b);
        } else {
            m73970b((byte) 6, i11);
            this.f70833a.put((byte) bArrM75047b.length);
            this.f70833a.put(bArrM75047b);
        }
    }

    public C33773la(int i11) {
        this.f70834b = "GBK";
        this.f70833a = ByteBuffer.allocate(i11);
    }

    public C33773la() {
        this(128);
    }

    /* JADX INFO: renamed from: a */
    public void m73961a(boolean z11, int i11) {
        m73942a(z11 ? (byte) 1 : (byte) 0, i11);
    }

    /* JADX INFO: renamed from: a */
    public void m73942a(byte b11, int i11) {
        m73945a(3);
        if (b11 == 0) {
            m73970b((byte) 12, i11);
        } else {
            m73970b((byte) 0, i11);
            this.f70833a.put(b11);
        }
    }

    /* JADX INFO: renamed from: b */
    public void m73971b(String str, int i11) {
        m73945a(str.length() + 10);
        byte[] bArrM75047b = C33935t7.m75047b(str);
        if (bArrM75047b.length > 255) {
            m73970b((byte) 7, i11);
            this.f70833a.putInt(bArrM75047b.length);
            this.f70833a.put(bArrM75047b);
        } else {
            m73970b((byte) 6, i11);
            this.f70833a.put((byte) bArrM75047b.length);
            this.f70833a.put(bArrM75047b);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m73960a(short s11, int i11) {
        m73945a(4);
        if (s11 >= -128 && s11 <= 127) {
            m73942a((byte) s11, i11);
        } else {
            m73970b((byte) 1, i11);
            this.f70833a.putShort(s11);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m73946a(int i11, int i12) {
        m73945a(6);
        if (i11 >= -32768 && i11 <= 32767) {
            m73960a((short) i11, i12);
        } else {
            m73970b((byte) 2, i12);
            this.f70833a.putInt(i11);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m73972b(Object[] objArr, int i11) {
        m73945a(8);
        m73970b((byte) 9, i11);
        m73946a(objArr.length, 0);
        for (Object obj : objArr) {
            m73955a(obj, 0);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m73947a(long j11, int i11) {
        m73945a(10);
        if (j11 >= -2147483648L && j11 <= 2147483647L) {
            m73946a((int) j11, i11);
        } else {
            m73970b((byte) 3, i11);
            this.f70833a.putLong(j11);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m73944a(float f11, int i11) {
        m73945a(6);
        m73970b((byte) 4, i11);
        this.f70833a.putFloat(f11);
    }

    /* JADX INFO: renamed from: a */
    public void m73943a(double d11, int i11) {
        m73945a(10);
        m73970b((byte) 5, i11);
        this.f70833a.putDouble(d11);
    }

    /* JADX INFO: renamed from: a */
    public void m73957a(String str, int i11) {
        byte[] bytes;
        try {
            bytes = str.getBytes(this.f70834b);
        } catch (UnsupportedEncodingException unused) {
            bytes = str.getBytes();
        }
        m73945a(bytes.length + 10);
        if (bytes.length > 255) {
            m73970b((byte) 7, i11);
            this.f70833a.putInt(bytes.length);
            this.f70833a.put(bytes);
        } else {
            m73970b((byte) 6, i11);
            this.f70833a.put((byte) bytes.length);
            this.f70833a.put(bytes);
        }
    }

    /* JADX INFO: renamed from: a */
    public <K, V> void m73959a(Map<K, V> map, int i11) {
        m73945a(8);
        m73970b((byte) 8, i11);
        m73946a(map == null ? 0 : map.size(), 0);
        if (map != null) {
            for (Map.Entry<K, V> entry : map.entrySet()) {
                m73955a(entry.getKey(), 0);
                m73955a(entry.getValue(), 1);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public void m73969a(boolean[] zArr, int i11) {
        m73945a(8);
        m73970b((byte) 9, i11);
        m73946a(zArr.length, 0);
        for (boolean z11 : zArr) {
            m73961a(z11, 0);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m73962a(byte[] bArr, int i11) {
        m73945a(bArr.length + 8);
        m73970b((byte) 13, i11);
        m73970b((byte) 0, 0);
        m73946a(bArr.length, 0);
        this.f70833a.put(bArr);
    }

    /* JADX INFO: renamed from: a */
    public void m73968a(short[] sArr, int i11) {
        m73945a(8);
        m73970b((byte) 9, i11);
        m73946a(sArr.length, 0);
        for (short s11 : sArr) {
            m73960a(s11, 0);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m73965a(int[] iArr, int i11) {
        m73945a(8);
        m73970b((byte) 9, i11);
        m73946a(iArr.length, 0);
        for (int i12 : iArr) {
            m73946a(i12, 0);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m73966a(long[] jArr, int i11) {
        m73945a(8);
        m73970b((byte) 9, i11);
        m73946a(jArr.length, 0);
        for (long j11 : jArr) {
            m73947a(j11, 0);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m73964a(float[] fArr, int i11) {
        m73945a(8);
        m73970b((byte) 9, i11);
        m73946a(fArr.length, 0);
        for (float f11 : fArr) {
            m73944a(f11, 0);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m73963a(double[] dArr, int i11) {
        m73945a(8);
        m73970b((byte) 9, i11);
        m73946a(dArr.length, 0);
        for (double d11 : dArr) {
            m73943a(d11, 0);
        }
    }

    /* JADX INFO: renamed from: a */
    public <T> void m73967a(T[] tArr, int i11) {
        m73972b(tArr, i11);
    }

    /* JADX INFO: renamed from: a */
    public <T> void m73958a(Collection<T> collection, int i11) {
        m73945a(8);
        m73970b((byte) 9, i11);
        m73946a(collection == null ? 0 : collection.size(), 0);
        if (collection != null) {
            Iterator<T> it = collection.iterator();
            while (it.hasNext()) {
                m73955a(it.next(), 0);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public void m73948a(JceStruct jceStruct, int i11) {
        m73945a(2);
        m73970b((byte) 10, i11);
        jceStruct.mo72269a(this);
        m73945a(2);
        m73970b((byte) 11, 0);
    }

    /* JADX INFO: renamed from: a */
    public void m73950a(Byte b11, int i11) {
        m73942a(b11.byteValue(), i11);
    }

    /* JADX INFO: renamed from: a */
    public void m73949a(Boolean bool, int i11) {
        m73961a(bool.booleanValue(), i11);
    }

    /* JADX INFO: renamed from: a */
    public void m73956a(Short sh2, int i11) {
        m73960a(sh2.shortValue(), i11);
    }

    /* JADX INFO: renamed from: a */
    public void m73953a(Integer num, int i11) {
        m73946a(num.intValue(), i11);
    }

    /* JADX INFO: renamed from: a */
    public void m73954a(Long l11, int i11) {
        m73947a(l11.longValue(), i11);
    }

    /* JADX INFO: renamed from: a */
    public void m73952a(Float f11, int i11) {
        m73944a(f11.floatValue(), i11);
    }

    /* JADX INFO: renamed from: a */
    public void m73951a(Double d11, int i11) {
        m73943a(d11.doubleValue(), i11);
    }

    /* JADX INFO: renamed from: a */
    public void m73955a(Object obj, int i11) {
        if (obj instanceof Byte) {
            m73942a(((Byte) obj).byteValue(), i11);
            return;
        }
        if (obj instanceof Boolean) {
            m73961a(((Boolean) obj).booleanValue(), i11);
            return;
        }
        if (obj instanceof Short) {
            m73960a(((Short) obj).shortValue(), i11);
            return;
        }
        if (obj instanceof Integer) {
            m73946a(((Integer) obj).intValue(), i11);
            return;
        }
        if (obj instanceof Long) {
            m73947a(((Long) obj).longValue(), i11);
            return;
        }
        if (obj instanceof Float) {
            m73944a(((Float) obj).floatValue(), i11);
            return;
        }
        if (obj instanceof Double) {
            m73943a(((Double) obj).doubleValue(), i11);
            return;
        }
        if (obj instanceof String) {
            m73957a((String) obj, i11);
            return;
        }
        if (obj instanceof Map) {
            m73959a((Map) obj, i11);
            return;
        }
        if (obj instanceof List) {
            m73958a((Collection) obj, i11);
            return;
        }
        if (obj instanceof JceStruct) {
            m73948a((JceStruct) obj, i11);
            return;
        }
        if (obj instanceof byte[]) {
            m73962a((byte[]) obj, i11);
            return;
        }
        if (obj instanceof boolean[]) {
            m73969a((boolean[]) obj, i11);
            return;
        }
        if (obj instanceof short[]) {
            m73968a((short[]) obj, i11);
            return;
        }
        if (obj instanceof int[]) {
            m73965a((int[]) obj, i11);
            return;
        }
        if (obj instanceof long[]) {
            m73966a((long[]) obj, i11);
            return;
        }
        if (obj instanceof float[]) {
            m73964a((float[]) obj, i11);
            return;
        }
        if (obj instanceof double[]) {
            m73963a((double[]) obj, i11);
            return;
        }
        if (obj.getClass().isArray()) {
            m73972b((Object[]) obj, i11);
        } else if (obj instanceof Collection) {
            m73958a((Collection) obj, i11);
        } else {
            throw new C33710ia("write object error: unsupport type. " + obj.getClass());
        }
    }

    /* JADX INFO: renamed from: a */
    public int m73940a(String str) {
        this.f70834b = str;
        return 0;
    }

    /* JADX INFO: renamed from: a */
    public static void m73939a(String[] strArr) {
        C33773la c33773la = new C33773la(128);
        c33773la.m73947a(1311768467283714885L, 0);
        System.out.println(C33935t7.m75045a(c33773la.f70833a.array()));
        System.out.println(Arrays.toString(c33773la.m73973b()));
    }
}
