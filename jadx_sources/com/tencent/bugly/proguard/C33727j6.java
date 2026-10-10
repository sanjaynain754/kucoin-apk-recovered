package com.tencent.bugly.proguard;

import java.io.Serializable;
import java.util.List;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.j6 */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public class C33727j6 implements Serializable {

    /* JADX INFO: renamed from: b */
    public final String f70344b;

    /* JADX INFO: renamed from: c */
    public List<C33973v5> f70345c;

    /* JADX INFO: renamed from: d */
    public List<C33973v5> f70346d;

    /* JADX INFO: renamed from: a */
    public List<C33973v5> m73525a() {
        return this.f70345c;
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public List<C33973v5> m73527b() {
        return this.f70346d;
    }

    /* JADX INFO: renamed from: a */
    public void m73526a(List<C33973v5> list) {
        this.f70345c = list;
    }

    /* JADX INFO: renamed from: b */
    public void m73528b(List<C33973v5> list) {
        this.f70346d = list;
    }

    /* JADX INFO: renamed from: c */
    public String m73529c() {
        return this.f70344b;
    }

    public C33727j6(String str) {
        this.f70344b = str;
    }
}
