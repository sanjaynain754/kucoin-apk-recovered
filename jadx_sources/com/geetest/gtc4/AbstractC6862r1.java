package com.geetest.gtc4;

import java.nio.charset.StandardCharsets;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: renamed from: com.geetest.gtc4.r1 */
/* JADX INFO: loaded from: classes45.dex */
public abstract class AbstractC6862r1 {
    /* JADX INFO: renamed from: a */
    public static Boolean m12701a(C6857q5 c6857q5, AbstractC6756f3 abstractC6756f3) {
        EnumC6903v6 enumC6903v6 = ((C6894u6) ((AbstractC6756f3) c6857q5.f11473d.get(abstractC6756f3))).f11530e;
        EnumC6903v6 enumC6903v7 = EnumC6903v6.TRUE;
        if (enumC6903v6 == enumC6903v7 || enumC6903v6 == EnumC6903v6.FALSE) {
            return Boolean.valueOf(enumC6903v6 == enumC6903v7);
        }
        throw new RuntimeException("Only expecting boolean values for " + abstractC6756f3);
    }

    /* JADX INFO: renamed from: b */
    public static byte[] m12702b(C6857q5 c6857q5, AbstractC6756f3 abstractC6756f3) {
        byte[] bArr = ((C6817m1) ((AbstractC6756f3) c6857q5.f11473d.get(abstractC6756f3))).f11434d;
        if (bArr == null) {
            return null;
        }
        return bArr;
    }

    /* JADX INFO: renamed from: c */
    public static Date m12703c(C6857q5 c6857q5, AbstractC6756f3 abstractC6756f3) {
        return new Date(((AbstractC6741d6) ((AbstractC6756f3) c6857q5.f11473d.get(abstractC6756f3))).f11339c.longValue());
    }

    /* JADX INFO: renamed from: d */
    public static int m12704d(C6857q5 c6857q5, AbstractC6756f3 abstractC6756f3) {
        return ((AbstractC6741d6) ((AbstractC6756f3) c6857q5.f11473d.get(abstractC6756f3))).f11339c.intValue();
    }

    /* JADX INFO: renamed from: e */
    public static void m12705e(C6857q5 c6857q5, AbstractC6756f3 abstractC6756f3) {
        C6807l0 c6807l0 = (C6807l0) ((AbstractC6756f3) c6857q5.f11473d.get(abstractC6756f3));
        HashSet hashSet = new HashSet();
        Iterator it = c6807l0.f11421d.iterator();
        while (it.hasNext()) {
            hashSet.add(Integer.valueOf(((AbstractC6741d6) ((AbstractC6756f3) it.next())).f11339c.intValue()));
        }
    }

    /* JADX INFO: renamed from: f */
    public static String m12706f(C6857q5 c6857q5, AbstractC6756f3 abstractC6756f3) {
        return new String(m12702b(c6857q5, abstractC6756f3), StandardCharsets.UTF_8);
    }
}
