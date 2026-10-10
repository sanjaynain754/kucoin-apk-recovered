package com.facebook.cache.disk;

import java.io.IOException;
import java.util.Collection;
import p486o3.InterfaceC42952a;
import p547q3.InterfaceC43600f;

/* JADX INFO: renamed from: com.facebook.cache.disk.b */
/* JADX INFO: compiled from: DiskStorage.java */
/* JADX INFO: loaded from: classes34.dex */
public interface InterfaceC5561b {

    /* JADX INFO: renamed from: com.facebook.cache.disk.b$a */
    /* JADX INFO: compiled from: DiskStorage.java */
    public interface a {
        String getId();

        long getSize();

        long getTimestamp();
    }

    /* JADX INFO: renamed from: com.facebook.cache.disk.b$b */
    /* JADX INFO: compiled from: DiskStorage.java */
    public interface b {
        /* JADX INFO: renamed from: a */
        InterfaceC42952a mo8491a(Object obj) throws IOException;

        /* JADX INFO: renamed from: b */
        void mo8492b(InterfaceC43600f interfaceC43600f, Object obj) throws IOException;

        boolean cleanUp();
    }

    /* JADX INFO: renamed from: a */
    void mo8467a() throws IOException;

    /* JADX INFO: renamed from: b */
    long mo8468b(a aVar) throws IOException;

    /* JADX INFO: renamed from: c */
    b mo8469c(String str, Object obj) throws IOException;

    /* JADX INFO: renamed from: d */
    boolean mo8470d(String str, Object obj) throws IOException;

    /* JADX INFO: renamed from: e */
    void mo8471e();

    /* JADX INFO: renamed from: f */
    boolean mo8472f(String str, Object obj) throws IOException;

    /* JADX INFO: renamed from: g */
    InterfaceC42952a mo8473g(String str, Object obj) throws IOException;

    Collection<a> getEntries() throws IOException;

    boolean isExternal();

    long remove(String str) throws IOException;
}
