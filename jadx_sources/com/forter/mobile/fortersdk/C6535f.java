package com.forter.mobile.fortersdk;

import java.util.ArrayList;

/* JADX INFO: renamed from: com.forter.mobile.fortersdk.f */
/* JADX INFO: loaded from: classes.dex */
public final class C6535f {

    /* JADX INFO: renamed from: a */
    public final ArrayList<String> f10946a = new ArrayList<>();

    /* JADX INFO: renamed from: b */
    public final ArrayList<String> f10947b = new ArrayList<>();

    /* JADX INFO: renamed from: b */
    public final boolean m12249b(String str) {
        return this.f10947b.contains(str);
    }

    /* JADX INFO: renamed from: c */
    public final boolean m12250c(String str) {
        return this.f10946a.contains(str);
    }

    public C6535f(C6540g c6540g) {
        ArrayList<String> arrayList;
        if (c6540g != null && c6540g.f10952b.equalsIgnoreCase("event")) {
            for (C6545h c6545h : c6540g.f10954d) {
                if (AbstractC6518b3.m12172f(c6545h.f10960b)) {
                    arrayList = this.f10947b;
                } else {
                    arrayList = this.f10946a;
                }
                arrayList.add(c6545h.f10959a);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final boolean m12248a(String str) {
        if (!m12250c(str)) {
            return true;
        }
        return false;
    }
}
