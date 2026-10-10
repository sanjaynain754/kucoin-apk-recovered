package com.fasterxml.jackson.core.util;

import androidx.credentials.provider.CredentialEntry;
import java.lang.ref.SoftReference;

/* JADX INFO: renamed from: com.fasterxml.jackson.core.util.b */
/* JADX INFO: compiled from: BufferRecyclers.java */
/* JADX INFO: loaded from: classes45.dex */
public class C6323b {

    /* JADX INFO: renamed from: a */
    public static final C6331j f10152a;

    /* JADX INFO: renamed from: b */
    public static final ThreadLocal<SoftReference<C6322a>> f10153b;

    /* JADX INFO: renamed from: a */
    public static C6322a m11066a() {
        ThreadLocal<SoftReference<C6322a>> threadLocal = f10153b;
        SoftReference<C6322a> softReference = threadLocal.get();
        C6322a c6322a = softReference == null ? null : softReference.get();
        if (c6322a == null) {
            c6322a = new C6322a();
            C6331j c6331j = f10152a;
            threadLocal.set(c6331j != null ? c6331j.m11122c(c6322a) : new SoftReference<>(c6322a));
        }
        return c6322a;
    }

    static {
        boolean zEquals;
        C6331j c6331jM11120a;
        try {
            zEquals = CredentialEntry.TRUE_STRING.equals(System.getProperty("com.fasterxml.jackson.core.util.BufferRecyclers.trackReusableBuffers"));
        } catch (SecurityException unused) {
            zEquals = false;
        }
        if (zEquals) {
            c6331jM11120a = C6331j.m11120a();
        } else {
            c6331jM11120a = null;
        }
        f10152a = c6331jM11120a;
        f10153b = new ThreadLocal<>();
    }
}
