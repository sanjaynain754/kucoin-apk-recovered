package com.fasterxml.jackson.core;

import com.fasterxml.jackson.core.p062io.C6308b;

/* JADX INFO: renamed from: com.fasterxml.jackson.core.f */
/* JADX INFO: compiled from: JsonStreamContext.java */
/* JADX INFO: loaded from: classes45.dex */
public abstract class AbstractC6302f {

    /* JADX INFO: renamed from: a */
    public int f10050a;

    /* JADX INFO: renamed from: b */
    public int f10051b;

    public AbstractC6302f() {
    }

    /* JADX INFO: renamed from: b */
    public abstract String mo10933b();

    /* JADX INFO: renamed from: c */
    public abstract Object mo10934c();

    /* JADX INFO: renamed from: e */
    public abstract AbstractC6302f mo10936e();

    /* JADX INFO: renamed from: i */
    public abstract void mo10940i(Object obj);

    public AbstractC6302f(AbstractC6302f abstractC6302f) {
        this.f10050a = abstractC6302f.f10050a;
        this.f10051b = abstractC6302f.f10051b;
    }

    /* JADX INFO: renamed from: a */
    public final int m10932a() {
        int i11 = this.f10051b;
        if (i11 < 0) {
            return 0;
        }
        return i11;
    }

    /* JADX INFO: renamed from: d */
    public final int m10935d() {
        return this.f10051b + 1;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m10937f() {
        return this.f10050a == 1;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m10938g() {
        return this.f10050a == 2;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m10939h() {
        return this.f10050a == 0;
    }

    /* JADX INFO: renamed from: j */
    public String m10941j() {
        int i11 = this.f10050a;
        if (i11 == 0) {
            return "root";
        }
        if (i11 != 1) {
            return i11 != 2 ? "?" : "Object";
        }
        return "Array";
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(64);
        int i11 = this.f10050a;
        if (i11 == 0) {
            sb2.append("/");
        } else if (i11 != 1) {
            sb2.append('{');
            String strMo10933b = mo10933b();
            if (strMo10933b != null) {
                sb2.append('\"');
                C6308b.m10961a(sb2, strMo10933b);
                sb2.append('\"');
            } else {
                sb2.append('?');
            }
            sb2.append('}');
        } else {
            sb2.append('[');
            sb2.append(m10932a());
            sb2.append(']');
        }
        return sb2.toString();
    }

    public AbstractC6302f(int i11, int i12) {
        this.f10050a = i11;
        this.f10051b = i12;
    }
}
