package com.facebook.cache.disk;

import androidx.annotation.VisibleForTesting;
import com.facebook.cache.common.CacheErrorLogger;
import com.facebook.common.file.FileUtils;
import java.io.File;
import java.io.IOException;
import java.util.Collection;
import p486o3.InterfaceC42952a;
import p682v3.C45368a;
import p712w3.C45708h;
import p712w3.InterfaceC45711k;
import p747x3.C45999a;

/* JADX INFO: renamed from: com.facebook.cache.disk.d */
/* JADX INFO: compiled from: DynamicDefaultDiskStorage.java */
/* JADX INFO: loaded from: classes34.dex */
public class C5563d implements InterfaceC5561b {

    /* JADX INFO: renamed from: f */
    public static final Class<?> f8142f = C5563d.class;

    /* JADX INFO: renamed from: a */
    public final int f8143a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC45711k<File> f8144b;

    /* JADX INFO: renamed from: c */
    public final String f8145c;

    /* JADX INFO: renamed from: d */
    public final CacheErrorLogger f8146d;

    /* JADX INFO: renamed from: e */
    @VisibleForTesting
    public volatile a f8147e = new a(null, null);

    @VisibleForTesting
    /* JADX INFO: renamed from: k */
    public synchronized InterfaceC5561b m8525k() throws IOException {
        try {
            if (m8526l()) {
                m8524j();
                m8523i();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return (InterfaceC5561b) C45708h.m100896g(this.f8147e.f8148a);
    }

    /* JADX INFO: renamed from: com.facebook.cache.disk.d$a */
    /* JADX INFO: compiled from: DynamicDefaultDiskStorage.java */
    @VisibleForTesting
    public static class a {

        /* JADX INFO: renamed from: a */
        public final InterfaceC5561b f8148a;

        /* JADX INFO: renamed from: b */
        public final File f8149b;

        @VisibleForTesting
        public a(File file, InterfaceC5561b interfaceC5561b) {
            this.f8148a = interfaceC5561b;
            this.f8149b = file;
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m8523i() throws IOException {
        File file = new File(this.f8144b.get(), this.f8145c);
        m8522h(file);
        this.f8147e = new a(file, new DefaultDiskStorage(file, this.f8143a, this.f8146d));
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: j */
    public void m8524j() {
        if (this.f8147e.f8148a == null || this.f8147e.f8149b == null) {
            return;
        }
        C45368a.m100269b(this.f8147e.f8149b);
    }

    /* JADX INFO: renamed from: l */
    public final boolean m8526l() {
        File file;
        a aVar = this.f8147e;
        return aVar.f8148a == null || (file = aVar.f8149b) == null || !file.exists();
    }

    public C5563d(int i11, InterfaceC45711k<File> interfaceC45711k, String str, CacheErrorLogger cacheErrorLogger) {
        this.f8143a = i11;
        this.f8146d = cacheErrorLogger;
        this.f8144b = interfaceC45711k;
        this.f8145c = str;
    }

    @Override // com.facebook.cache.disk.InterfaceC5561b
    /* JADX INFO: renamed from: a */
    public void mo8467a() throws IOException {
        m8525k().mo8467a();
    }

    @Override // com.facebook.cache.disk.InterfaceC5561b
    /* JADX INFO: renamed from: b */
    public long mo8468b(InterfaceC5561b.a aVar) throws IOException {
        return m8525k().mo8468b(aVar);
    }

    @Override // com.facebook.cache.disk.InterfaceC5561b
    /* JADX INFO: renamed from: c */
    public InterfaceC5561b.b mo8469c(String str, Object obj) throws IOException {
        return m8525k().mo8469c(str, obj);
    }

    @Override // com.facebook.cache.disk.InterfaceC5561b
    /* JADX INFO: renamed from: d */
    public boolean mo8470d(String str, Object obj) throws IOException {
        return m8525k().mo8470d(str, obj);
    }

    @Override // com.facebook.cache.disk.InterfaceC5561b
    /* JADX INFO: renamed from: e */
    public void mo8471e() {
        try {
            m8525k().mo8471e();
        } catch (IOException e11) {
            C45999a.m101504j(f8142f, "purgeUnexpectedResources", e11);
        }
    }

    @Override // com.facebook.cache.disk.InterfaceC5561b
    /* JADX INFO: renamed from: f */
    public boolean mo8472f(String str, Object obj) throws IOException {
        return m8525k().mo8472f(str, obj);
    }

    @Override // com.facebook.cache.disk.InterfaceC5561b
    /* JADX INFO: renamed from: g */
    public InterfaceC42952a mo8473g(String str, Object obj) throws IOException {
        return m8525k().mo8473g(str, obj);
    }

    @Override // com.facebook.cache.disk.InterfaceC5561b
    public Collection<InterfaceC5561b.a> getEntries() throws IOException {
        return m8525k().getEntries();
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: h */
    public void m8522h(File file) throws IOException {
        try {
            FileUtils.m8529a(file);
            C45999a.m101495a(f8142f, "Created cache directory %s", file.getAbsolutePath());
        } catch (FileUtils.CreateDirectoryException e11) {
            this.f8146d.mo8446a(CacheErrorLogger.CacheErrorCategory.WRITE_CREATE_DIR, f8142f, "createRootDirectoryIfNecessary", e11);
            throw e11;
        }
    }

    @Override // com.facebook.cache.disk.InterfaceC5561b
    public boolean isExternal() {
        try {
            return m8525k().isExternal();
        } catch (IOException unused) {
            return false;
        }
    }

    @Override // com.facebook.cache.disk.InterfaceC5561b
    public long remove(String str) throws IOException {
        return m8525k().remove(str);
    }
}
