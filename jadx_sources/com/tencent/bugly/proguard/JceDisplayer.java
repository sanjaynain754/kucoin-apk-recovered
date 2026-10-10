package com.tencent.bugly.proguard;

import java.util.Collection;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public final class JceDisplayer {

    /* JADX INFO: renamed from: a */
    public StringBuilder f68767a;

    /* JADX INFO: renamed from: b */
    public int f68768b;

    public JceDisplayer(StringBuilder sb2, int i11) {
        this.f68767a = sb2;
        this.f68768b = i11;
    }

    /* JADX INFO: renamed from: a */
    public final void m72266a(String str) {
        for (int i11 = 0; i11 < this.f68768b; i11++) {
            this.f68767a.append('\t');
        }
        if (str != null) {
            StringBuilder sb2 = this.f68767a;
            sb2.append(str);
            sb2.append(": ");
        }
    }

    public JceDisplayer(StringBuilder sb2) {
        this.f68768b = 0;
        this.f68767a = sb2;
    }

    /* JADX INFO: renamed from: a */
    public JceDisplayer m72257a(boolean z11, String str) {
        m72266a(str);
        StringBuilder sb2 = this.f68767a;
        sb2.append(z11 ? 'T' : 'F');
        sb2.append('\n');
        return this;
    }

    /* JADX INFO: renamed from: a */
    public JceDisplayer m72245a(byte b11, String str) {
        m72266a(str);
        StringBuilder sb2 = this.f68767a;
        sb2.append((int) b11);
        sb2.append('\n');
        return this;
    }

    /* JADX INFO: renamed from: a */
    public JceDisplayer m72246a(char c11, String str) {
        m72266a(str);
        StringBuilder sb2 = this.f68767a;
        sb2.append(c11);
        sb2.append('\n');
        return this;
    }

    /* JADX INFO: renamed from: a */
    public JceDisplayer m72256a(short s11, String str) {
        m72266a(str);
        StringBuilder sb2 = this.f68767a;
        sb2.append((int) s11);
        sb2.append('\n');
        return this;
    }

    /* JADX INFO: renamed from: a */
    public JceDisplayer m72249a(int i11, String str) {
        m72266a(str);
        StringBuilder sb2 = this.f68767a;
        sb2.append(i11);
        sb2.append('\n');
        return this;
    }

    /* JADX INFO: renamed from: a */
    public JceDisplayer m72250a(long j11, String str) {
        m72266a(str);
        StringBuilder sb2 = this.f68767a;
        sb2.append(j11);
        sb2.append('\n');
        return this;
    }

    /* JADX INFO: renamed from: a */
    public JceDisplayer m72248a(float f11, String str) {
        m72266a(str);
        StringBuilder sb2 = this.f68767a;
        sb2.append(f11);
        sb2.append('\n');
        return this;
    }

    /* JADX INFO: renamed from: a */
    public JceDisplayer m72247a(double d11, String str) {
        m72266a(str);
        StringBuilder sb2 = this.f68767a;
        sb2.append(d11);
        sb2.append('\n');
        return this;
    }

    /* JADX INFO: renamed from: a */
    public JceDisplayer m72253a(String str, String str2) {
        m72266a(str2);
        if (str == null) {
            StringBuilder sb2 = this.f68767a;
            sb2.append("null");
            sb2.append('\n');
            return this;
        }
        StringBuilder sb3 = this.f68767a;
        sb3.append(str);
        sb3.append('\n');
        return this;
    }

    /* JADX INFO: renamed from: a */
    public JceDisplayer m72258a(byte[] bArr, String str) {
        m72266a(str);
        if (bArr == null) {
            StringBuilder sb2 = this.f68767a;
            sb2.append("null");
            sb2.append('\n');
            return this;
        }
        if (bArr.length == 0) {
            StringBuilder sb3 = this.f68767a;
            sb3.append(bArr.length);
            sb3.append(", []");
            sb3.append('\n');
            return this;
        }
        StringBuilder sb4 = this.f68767a;
        sb4.append(bArr.length);
        sb4.append(", [");
        sb4.append('\n');
        JceDisplayer jceDisplayer = new JceDisplayer(this.f68767a, this.f68768b + 1);
        for (byte b11 : bArr) {
            jceDisplayer.m72245a(b11, (String) null);
        }
        m72246a(']', (String) null);
        return this;
    }

    /* JADX INFO: renamed from: a */
    public JceDisplayer m72259a(char[] cArr, String str) {
        m72266a(str);
        if (cArr == null) {
            StringBuilder sb2 = this.f68767a;
            sb2.append("null");
            sb2.append('\n');
            return this;
        }
        if (cArr.length == 0) {
            StringBuilder sb3 = this.f68767a;
            sb3.append(cArr.length);
            sb3.append(", []");
            sb3.append('\n');
            return this;
        }
        StringBuilder sb4 = this.f68767a;
        sb4.append(cArr.length);
        sb4.append(", [");
        sb4.append('\n');
        JceDisplayer jceDisplayer = new JceDisplayer(this.f68767a, this.f68768b + 1);
        for (char c11 : cArr) {
            jceDisplayer.m72246a(c11, (String) null);
        }
        m72246a(']', (String) null);
        return this;
    }

    /* JADX INFO: renamed from: a */
    public JceDisplayer m72265a(short[] sArr, String str) {
        m72266a(str);
        if (sArr == null) {
            StringBuilder sb2 = this.f68767a;
            sb2.append("null");
            sb2.append('\n');
            return this;
        }
        if (sArr.length == 0) {
            StringBuilder sb3 = this.f68767a;
            sb3.append(sArr.length);
            sb3.append(", []");
            sb3.append('\n');
            return this;
        }
        StringBuilder sb4 = this.f68767a;
        sb4.append(sArr.length);
        sb4.append(", [");
        sb4.append('\n');
        JceDisplayer jceDisplayer = new JceDisplayer(this.f68767a, this.f68768b + 1);
        for (short s11 : sArr) {
            jceDisplayer.m72256a(s11, (String) null);
        }
        m72246a(']', (String) null);
        return this;
    }

    /* JADX INFO: renamed from: a */
    public JceDisplayer m72262a(int[] iArr, String str) {
        m72266a(str);
        if (iArr == null) {
            StringBuilder sb2 = this.f68767a;
            sb2.append("null");
            sb2.append('\n');
            return this;
        }
        if (iArr.length == 0) {
            StringBuilder sb3 = this.f68767a;
            sb3.append(iArr.length);
            sb3.append(", []");
            sb3.append('\n');
            return this;
        }
        StringBuilder sb4 = this.f68767a;
        sb4.append(iArr.length);
        sb4.append(", [");
        sb4.append('\n');
        JceDisplayer jceDisplayer = new JceDisplayer(this.f68767a, this.f68768b + 1);
        for (int i11 : iArr) {
            jceDisplayer.m72249a(i11, (String) null);
        }
        m72246a(']', (String) null);
        return this;
    }

    /* JADX INFO: renamed from: a */
    public JceDisplayer m72263a(long[] jArr, String str) {
        m72266a(str);
        if (jArr == null) {
            StringBuilder sb2 = this.f68767a;
            sb2.append("null");
            sb2.append('\n');
            return this;
        }
        if (jArr.length == 0) {
            StringBuilder sb3 = this.f68767a;
            sb3.append(jArr.length);
            sb3.append(", []");
            sb3.append('\n');
            return this;
        }
        StringBuilder sb4 = this.f68767a;
        sb4.append(jArr.length);
        sb4.append(", [");
        sb4.append('\n');
        JceDisplayer jceDisplayer = new JceDisplayer(this.f68767a, this.f68768b + 1);
        for (long j11 : jArr) {
            jceDisplayer.m72250a(j11, (String) null);
        }
        m72246a(']', (String) null);
        return this;
    }

    /* JADX INFO: renamed from: a */
    public JceDisplayer m72261a(float[] fArr, String str) {
        m72266a(str);
        if (fArr == null) {
            StringBuilder sb2 = this.f68767a;
            sb2.append("null");
            sb2.append('\n');
            return this;
        }
        if (fArr.length == 0) {
            StringBuilder sb3 = this.f68767a;
            sb3.append(fArr.length);
            sb3.append(", []");
            sb3.append('\n');
            return this;
        }
        StringBuilder sb4 = this.f68767a;
        sb4.append(fArr.length);
        sb4.append(", [");
        sb4.append('\n');
        JceDisplayer jceDisplayer = new JceDisplayer(this.f68767a, this.f68768b + 1);
        for (float f11 : fArr) {
            jceDisplayer.m72248a(f11, (String) null);
        }
        m72246a(']', (String) null);
        return this;
    }

    /* JADX INFO: renamed from: a */
    public JceDisplayer m72260a(double[] dArr, String str) {
        m72266a(str);
        if (dArr == null) {
            StringBuilder sb2 = this.f68767a;
            sb2.append("null");
            sb2.append('\n');
            return this;
        }
        if (dArr.length == 0) {
            StringBuilder sb3 = this.f68767a;
            sb3.append(dArr.length);
            sb3.append(", []");
            sb3.append('\n');
            return this;
        }
        StringBuilder sb4 = this.f68767a;
        sb4.append(dArr.length);
        sb4.append(", [");
        sb4.append('\n');
        JceDisplayer jceDisplayer = new JceDisplayer(this.f68767a, this.f68768b + 1);
        for (double d11 : dArr) {
            jceDisplayer.m72247a(d11, (String) null);
        }
        m72246a(']', (String) null);
        return this;
    }

    /* JADX INFO: renamed from: a */
    public <K, V> JceDisplayer m72255a(Map<K, V> map, String str) {
        m72266a(str);
        if (map == null) {
            StringBuilder sb2 = this.f68767a;
            sb2.append("null");
            sb2.append('\n');
            return this;
        }
        if (map.isEmpty()) {
            StringBuilder sb3 = this.f68767a;
            sb3.append(map.size());
            sb3.append(", {}");
            sb3.append('\n');
            return this;
        }
        StringBuilder sb4 = this.f68767a;
        sb4.append(map.size());
        sb4.append(", {");
        sb4.append('\n');
        JceDisplayer jceDisplayer = new JceDisplayer(this.f68767a, this.f68768b + 1);
        JceDisplayer jceDisplayer2 = new JceDisplayer(this.f68767a, this.f68768b + 2);
        for (Map.Entry<K, V> entry : map.entrySet()) {
            jceDisplayer.m72246a('(', (String) null);
            jceDisplayer2.m72252a(entry.getKey(), (String) null);
            jceDisplayer2.m72252a(entry.getValue(), (String) null);
            jceDisplayer.m72246a(')', (String) null);
        }
        m72246a('}', (String) null);
        return this;
    }

    /* JADX INFO: renamed from: a */
    public <T> JceDisplayer m72264a(T[] tArr, String str) {
        m72266a(str);
        if (tArr == null) {
            StringBuilder sb2 = this.f68767a;
            sb2.append("null");
            sb2.append('\n');
            return this;
        }
        if (tArr.length == 0) {
            StringBuilder sb3 = this.f68767a;
            sb3.append(tArr.length);
            sb3.append(", []");
            sb3.append('\n');
            return this;
        }
        StringBuilder sb4 = this.f68767a;
        sb4.append(tArr.length);
        sb4.append(", [");
        sb4.append('\n');
        JceDisplayer jceDisplayer = new JceDisplayer(this.f68767a, this.f68768b + 1);
        for (T t11 : tArr) {
            jceDisplayer.m72252a(t11, (String) null);
        }
        m72246a(']', (String) null);
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public <T> JceDisplayer m72254a(Collection<T> collection, String str) {
        if (collection == null) {
            m72266a(str);
            StringBuilder sb2 = this.f68767a;
            sb2.append("null");
            sb2.append('\t');
            return this;
        }
        return m72264a(collection.toArray(), str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public <T> JceDisplayer m72252a(T t11, String str) {
        if (t11 == 0) {
            StringBuilder sb2 = this.f68767a;
            sb2.append("null");
            sb2.append('\n');
            return this;
        }
        if (t11 instanceof Byte) {
            m72245a(((Byte) t11).byteValue(), str);
            return this;
        }
        if (t11 instanceof Boolean) {
            m72257a(((Boolean) t11).booleanValue(), str);
            return this;
        }
        if (t11 instanceof Short) {
            m72256a(((Short) t11).shortValue(), str);
            return this;
        }
        if (t11 instanceof Integer) {
            m72249a(((Integer) t11).intValue(), str);
            return this;
        }
        if (t11 instanceof Long) {
            m72250a(((Long) t11).longValue(), str);
            return this;
        }
        if (t11 instanceof Float) {
            m72248a(((Float) t11).floatValue(), str);
            return this;
        }
        if (t11 instanceof Double) {
            m72247a(((Double) t11).doubleValue(), str);
            return this;
        }
        if (t11 instanceof String) {
            m72253a((String) t11, str);
            return this;
        }
        if (t11 instanceof Map) {
            m72255a((Map) t11, str);
            return this;
        }
        if (t11 instanceof List) {
            m72254a((Collection) t11, str);
            return this;
        }
        if (t11 instanceof JceStruct) {
            m72251a((JceStruct) t11, str);
            return this;
        }
        if (t11 instanceof byte[]) {
            m72258a((byte[]) t11, str);
            return this;
        }
        if (t11 instanceof boolean[]) {
            m72252a((boolean[]) t11, str);
            return this;
        }
        if (t11 instanceof short[]) {
            m72265a((short[]) t11, str);
            return this;
        }
        if (t11 instanceof int[]) {
            m72262a((int[]) t11, str);
            return this;
        }
        if (t11 instanceof long[]) {
            m72263a((long[]) t11, str);
            return this;
        }
        if (t11 instanceof float[]) {
            m72261a((float[]) t11, str);
            return this;
        }
        if (t11 instanceof double[]) {
            m72260a((double[]) t11, str);
            return this;
        }
        if (t11.getClass().isArray()) {
            m72264a((Object[]) t11, str);
            return this;
        }
        throw new C33710ia("write object error: unsupport type.");
    }

    /* JADX INFO: renamed from: a */
    public JceDisplayer m72251a(JceStruct jceStruct, String str) {
        m72246a('{', str);
        if (jceStruct == null) {
            StringBuilder sb2 = this.f68767a;
            sb2.append('\t');
            sb2.append("null");
        } else {
            jceStruct.mo72271a(this.f68767a, this.f68768b + 1);
        }
        m72246a('}', (String) null);
        return this;
    }

    /* JADX INFO: renamed from: a */
    public static void m72244a(String[] strArr) {
        System.out.println("1.2");
    }
}
