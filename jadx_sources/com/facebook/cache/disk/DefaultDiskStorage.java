package com.facebook.cache.disk;

import android.os.Environment;
import androidx.annotation.VisibleForTesting;
import com.facebook.binaryresource.FileBinaryResource;
import com.facebook.cache.common.CacheErrorLogger;
import com.facebook.common.file.FileUtils;
import com.tencent.bugly.proguard.C33978va;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p050c4.C4822d;
import p050c4.InterfaceC4819a;
import p486o3.InterfaceC42952a;
import p547q3.InterfaceC43600f;
import p682v3.C45368a;
import p682v3.InterfaceC45369b;
import p712w3.C45703c;
import p712w3.C45708h;

/* JADX INFO: loaded from: classes34.dex */
public class DefaultDiskStorage implements InterfaceC5561b {

    /* JADX INFO: renamed from: f */
    public static final Class<?> f8094f = DefaultDiskStorage.class;

    /* JADX INFO: renamed from: g */
    public static final long f8095g = TimeUnit.MINUTES.toMillis(30);

    /* JADX INFO: renamed from: a */
    public final File f8096a;

    /* JADX INFO: renamed from: b */
    public final boolean f8097b;

    /* JADX INFO: renamed from: c */
    public final File f8098c;

    /* JADX INFO: renamed from: d */
    public final CacheErrorLogger f8099d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC4819a f8100e;

    public static class IncompleteFileException extends IOException {
        public IncompleteFileException(long j11, long j12) {
            super("File was not written completely. Expected: " + j11 + ", found: " + j12);
        }
    }

    /* JADX INFO: renamed from: com.facebook.cache.disk.DefaultDiskStorage$a */
    public class C5555a implements InterfaceC45369b {

        /* JADX INFO: renamed from: a */
        public final List<InterfaceC5561b.a> f8101a;

        public C5555a() {
            this.f8101a = new ArrayList();
        }

        @Override // p682v3.InterfaceC45369b
        /* JADX INFO: renamed from: a */
        public void mo8483a(File file) {
            C5557c c5557cM8478t = DefaultDiskStorage.this.m8478t(file);
            if (c5557cM8478t == null || c5557cM8478t.f8107a != ".cnt") {
                return;
            }
            this.f8101a.add(new C5556b(c5557cM8478t.f8108b, file));
        }

        /* JADX INFO: renamed from: d */
        public List<InterfaceC5561b.a> m8486d() {
            return Collections.unmodifiableList(this.f8101a);
        }

        @Override // p682v3.InterfaceC45369b
        /* JADX INFO: renamed from: b */
        public void mo8484b(File file) {
        }

        @Override // p682v3.InterfaceC45369b
        /* JADX INFO: renamed from: c */
        public void mo8485c(File file) {
        }
    }

    /* JADX INFO: renamed from: com.facebook.cache.disk.DefaultDiskStorage$b */
    @VisibleForTesting
    public static class C5556b implements InterfaceC5561b.a {

        /* JADX INFO: renamed from: a */
        public final String f8103a;

        /* JADX INFO: renamed from: b */
        public final FileBinaryResource f8104b;

        /* JADX INFO: renamed from: c */
        public long f8105c;

        /* JADX INFO: renamed from: d */
        public long f8106d;

        public C5556b(String str, File file) {
            C45708h.m100896g(file);
            this.f8103a = (String) C45708h.m100896g(str);
            this.f8104b = FileBinaryResource.m8378b(file);
            this.f8105c = -1L;
            this.f8106d = -1L;
        }

        /* JADX INFO: renamed from: a */
        public FileBinaryResource m8487a() {
            return this.f8104b;
        }

        @Override // com.facebook.cache.disk.InterfaceC5561b.a
        public String getId() {
            return this.f8103a;
        }

        @Override // com.facebook.cache.disk.InterfaceC5561b.a
        public long getSize() {
            if (this.f8105c < 0) {
                this.f8105c = this.f8104b.size();
            }
            return this.f8105c;
        }

        @Override // com.facebook.cache.disk.InterfaceC5561b.a
        public long getTimestamp() {
            if (this.f8106d < 0) {
                this.f8106d = this.f8104b.getFile().lastModified();
            }
            return this.f8106d;
        }
    }

    /* JADX INFO: renamed from: com.facebook.cache.disk.DefaultDiskStorage$c */
    public static class C5557c {

        /* JADX INFO: renamed from: a */
        public final String f8107a;

        /* JADX INFO: renamed from: b */
        public final String f8108b;

        public C5557c(String str, String str2) {
            this.f8107a = str;
            this.f8108b = str2;
        }

        /* JADX INFO: renamed from: a */
        public File m8489a(File file) throws IOException {
            return File.createTempFile(this.f8108b + C33978va.f72339h, ".tmp", file);
        }

        /* JADX INFO: renamed from: c */
        public String m8490c(String str) {
            return str + File.separator + this.f8108b + this.f8107a;
        }

        public String toString() {
            return this.f8107a + "(" + this.f8108b + ")";
        }

        /* JADX INFO: renamed from: b */
        public static C5557c m8488b(File file) {
            String strM8463r;
            String name = file.getName();
            int iLastIndexOf = name.lastIndexOf(46);
            if (iLastIndexOf <= 0 || (strM8463r = DefaultDiskStorage.m8463r(name.substring(iLastIndexOf))) == null) {
                return null;
            }
            String strSubstring = name.substring(0, iLastIndexOf);
            if (strM8463r.equals(".tmp")) {
                int iLastIndexOf2 = strSubstring.lastIndexOf(46);
                if (iLastIndexOf2 <= 0) {
                    return null;
                }
                strSubstring = strSubstring.substring(0, iLastIndexOf2);
            }
            return new C5557c(strM8463r, strSubstring);
        }
    }

    /* JADX INFO: renamed from: com.facebook.cache.disk.DefaultDiskStorage$d */
    @VisibleForTesting
    public class C5558d implements InterfaceC5561b.b {

        /* JADX INFO: renamed from: a */
        public final String f8109a;

        /* JADX INFO: renamed from: b */
        @VisibleForTesting
        public final File f8110b;

        public C5558d(String str, File file) {
            this.f8109a = str;
            this.f8110b = file;
        }

        @Override // com.facebook.cache.disk.InterfaceC5561b.b
        /* JADX INFO: renamed from: a */
        public InterfaceC42952a mo8491a(Object obj) throws IOException {
            return m8493c(obj, DefaultDiskStorage.this.f8100e.now());
        }

        @Override // com.facebook.cache.disk.InterfaceC5561b.b
        /* JADX INFO: renamed from: b */
        public void mo8492b(InterfaceC43600f interfaceC43600f, Object obj) throws IOException {
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(this.f8110b);
                try {
                    C45703c c45703c = new C45703c(fileOutputStream);
                    interfaceC43600f.mo95955a(c45703c);
                    c45703c.flush();
                    long jM100882a = c45703c.m100882a();
                    fileOutputStream.close();
                    if (this.f8110b.length() != jM100882a) {
                        throw new IncompleteFileException(jM100882a, this.f8110b.length());
                    }
                } catch (Throwable th2) {
                    fileOutputStream.close();
                    throw th2;
                }
            } catch (FileNotFoundException e11) {
                DefaultDiskStorage.this.f8099d.mo8446a(CacheErrorLogger.CacheErrorCategory.WRITE_UPDATE_FILE_NOT_FOUND, DefaultDiskStorage.f8094f, "updateResource", e11);
                throw e11;
            }
        }

        /* JADX INFO: renamed from: c */
        public InterfaceC42952a m8493c(Object obj, long j11) throws IOException {
            CacheErrorLogger.CacheErrorCategory cacheErrorCategory;
            File fileM8475p = DefaultDiskStorage.this.m8475p(this.f8109a);
            try {
                FileUtils.m8530b(this.f8110b, fileM8475p);
                if (fileM8475p.exists()) {
                    fileM8475p.setLastModified(j11);
                }
                return FileBinaryResource.m8378b(fileM8475p);
            } catch (FileUtils.RenameException e11) {
                Throwable cause = e11.getCause();
                if (cause == null) {
                    cacheErrorCategory = CacheErrorLogger.CacheErrorCategory.WRITE_RENAME_FILE_OTHER;
                } else if (cause instanceof FileUtils.ParentDirNotFoundException) {
                    cacheErrorCategory = CacheErrorLogger.CacheErrorCategory.WRITE_RENAME_FILE_TEMPFILE_PARENT_NOT_FOUND;
                } else {
                    cacheErrorCategory = cause instanceof FileNotFoundException ? CacheErrorLogger.CacheErrorCategory.WRITE_RENAME_FILE_TEMPFILE_NOT_FOUND : CacheErrorLogger.CacheErrorCategory.WRITE_RENAME_FILE_OTHER;
                }
                DefaultDiskStorage.this.f8099d.mo8446a(cacheErrorCategory, DefaultDiskStorage.f8094f, "commit", e11);
                throw e11;
            }
        }

        @Override // com.facebook.cache.disk.InterfaceC5561b.b
        public boolean cleanUp() {
            return !this.f8110b.exists() || this.f8110b.delete();
        }
    }

    /* JADX INFO: renamed from: com.facebook.cache.disk.DefaultDiskStorage$e */
    public class C5559e implements InterfaceC45369b {

        /* JADX INFO: renamed from: a */
        public boolean f8112a;

        public C5559e() {
        }

        @Override // p682v3.InterfaceC45369b
        /* JADX INFO: renamed from: a */
        public void mo8483a(File file) {
            if (this.f8112a && m8494d(file)) {
                return;
            }
            file.delete();
        }

        @Override // p682v3.InterfaceC45369b
        /* JADX INFO: renamed from: b */
        public void mo8484b(File file) {
            if (!DefaultDiskStorage.this.f8096a.equals(file) && !this.f8112a) {
                file.delete();
            }
            if (this.f8112a && file.equals(DefaultDiskStorage.this.f8098c)) {
                this.f8112a = false;
            }
        }

        @Override // p682v3.InterfaceC45369b
        /* JADX INFO: renamed from: c */
        public void mo8485c(File file) {
            if (this.f8112a || !file.equals(DefaultDiskStorage.this.f8098c)) {
                return;
            }
            this.f8112a = true;
        }

        /* JADX INFO: renamed from: d */
        public final boolean m8494d(File file) {
            C5557c c5557cM8478t = DefaultDiskStorage.this.m8478t(file);
            if (c5557cM8478t == null) {
                return false;
            }
            String str = c5557cM8478t.f8107a;
            if (str == ".tmp") {
                return m8495e(file);
            }
            C45708h.m100898i(str == ".cnt");
            return true;
        }

        /* JADX INFO: renamed from: e */
        public final boolean m8495e(File file) {
            if (file.lastModified() > DefaultDiskStorage.this.f8100e.now() - DefaultDiskStorage.f8095g) {
                return true;
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: x */
    public static boolean m8465x(File file, CacheErrorLogger cacheErrorLogger) {
        String canonicalPath;
        try {
            File externalStorageDirectory = Environment.getExternalStorageDirectory();
            if (externalStorageDirectory == null) {
                return false;
            }
            String string = externalStorageDirectory.toString();
            try {
                canonicalPath = file.getCanonicalPath();
                try {
                    return canonicalPath.contains(string);
                } catch (IOException e11) {
                    e = e11;
                    cacheErrorLogger.mo8446a(CacheErrorLogger.CacheErrorCategory.OTHER, f8094f, "failed to read folder to check if external: " + canonicalPath, e);
                    return false;
                }
            } catch (IOException e12) {
                e = e12;
                canonicalPath = null;
            }
        } catch (Exception e13) {
            cacheErrorLogger.mo8446a(CacheErrorLogger.CacheErrorCategory.OTHER, f8094f, "failed to get the external storage directory!", e13);
            return false;
        }
    }

    @Override // com.facebook.cache.disk.InterfaceC5561b
    /* JADX INFO: renamed from: d */
    public boolean mo8470d(String str, Object obj) {
        return m8482z(str, false);
    }

    @Override // com.facebook.cache.disk.InterfaceC5561b
    /* JADX INFO: renamed from: f */
    public boolean mo8472f(String str, Object obj) {
        return m8482z(str, true);
    }

    /* JADX INFO: renamed from: r */
    public static String m8463r(String str) {
        if (".cnt".equals(str)) {
            return ".cnt";
        }
        if (".tmp".equals(str)) {
            return ".tmp";
        }
        return null;
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: w */
    public static String m8464w(int i11) {
        return String.format(null, "%s.ols%d.%d", "v2", 100, Integer.valueOf(i11));
    }

    /* JADX INFO: renamed from: A */
    public final void m8466A() {
        if (this.f8096a.exists()) {
            if (this.f8098c.exists()) {
                return;
            } else {
                C45368a.m100269b(this.f8096a);
            }
        }
        try {
            FileUtils.m8529a(this.f8098c);
        } catch (FileUtils.CreateDirectoryException unused) {
            this.f8099d.mo8446a(CacheErrorLogger.CacheErrorCategory.WRITE_CREATE_DIR, f8094f, "version directory could not be created: " + this.f8098c, null);
        }
    }

    @Override // com.facebook.cache.disk.InterfaceC5561b
    /* JADX INFO: renamed from: a */
    public void mo8467a() {
        C45368a.m100268a(this.f8096a);
    }

    @Override // com.facebook.cache.disk.InterfaceC5561b
    /* JADX INFO: renamed from: b */
    public long mo8468b(InterfaceC5561b.a aVar) {
        return m8474o(((C5556b) aVar).m8487a().getFile());
    }

    @Override // com.facebook.cache.disk.InterfaceC5561b
    /* JADX INFO: renamed from: c */
    public InterfaceC5561b.b mo8469c(String str, Object obj) throws IOException {
        C5557c c5557c = new C5557c(".tmp", str);
        File fileM8479u = m8479u(c5557c.f8108b);
        if (!fileM8479u.exists()) {
            m8481y(fileM8479u, "insert");
        }
        try {
            return new C5558d(str, c5557c.m8489a(fileM8479u));
        } catch (IOException e11) {
            this.f8099d.mo8446a(CacheErrorLogger.CacheErrorCategory.WRITE_CREATE_TEMPFILE, f8094f, "insert", e11);
            throw e11;
        }
    }

    @Override // com.facebook.cache.disk.InterfaceC5561b
    /* JADX INFO: renamed from: e */
    public void mo8471e() {
        C45368a.m100270c(this.f8096a, new C5559e());
    }

    @Override // com.facebook.cache.disk.InterfaceC5561b
    public boolean isExternal() {
        return this.f8097b;
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: p */
    public File m8475p(String str) {
        return new File(m8477s(str));
    }

    @Override // com.facebook.cache.disk.InterfaceC5561b
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public List<InterfaceC5561b.a> getEntries() throws IOException {
        C5555a c5555a = new C5555a();
        C45368a.m100270c(this.f8098c, c5555a);
        return c5555a.m8486d();
    }

    /* JADX INFO: renamed from: s */
    public final String m8477s(String str) {
        C5557c c5557c = new C5557c(".cnt", str);
        return c5557c.m8490c(m8480v(c5557c.f8108b));
    }

    /* JADX INFO: renamed from: u */
    public final File m8479u(String str) {
        return new File(m8480v(str));
    }

    public DefaultDiskStorage(File file, int i11, CacheErrorLogger cacheErrorLogger) {
        C45708h.m100896g(file);
        this.f8096a = file;
        this.f8097b = m8465x(file, cacheErrorLogger);
        this.f8098c = new File(file, m8464w(i11));
        this.f8099d = cacheErrorLogger;
        m8466A();
        this.f8100e = C4822d.m4916a();
    }

    @Override // com.facebook.cache.disk.InterfaceC5561b
    /* JADX INFO: renamed from: g */
    public InterfaceC42952a mo8473g(String str, Object obj) {
        File fileM8475p = m8475p(str);
        if (fileM8475p.exists()) {
            fileM8475p.setLastModified(this.f8100e.now());
            return FileBinaryResource.m8379c(fileM8475p);
        }
        return null;
    }

    /* JADX INFO: renamed from: o */
    public final long m8474o(File file) {
        if (!file.exists()) {
            return 0L;
        }
        long length = file.length();
        if (file.delete()) {
            return length;
        }
        return -1L;
    }

    @Override // com.facebook.cache.disk.InterfaceC5561b
    public long remove(String str) {
        return m8474o(m8475p(str));
    }

    /* JADX INFO: renamed from: t */
    public final C5557c m8478t(File file) {
        C5557c c5557cM8488b = C5557c.m8488b(file);
        if (c5557cM8488b == null || !m8479u(c5557cM8488b.f8108b).equals(file.getParentFile())) {
            return null;
        }
        return c5557cM8488b;
    }

    /* JADX INFO: renamed from: v */
    public final String m8480v(String str) {
        return this.f8098c + File.separator + String.valueOf(Math.abs(str.hashCode() % 100));
    }

    /* JADX INFO: renamed from: y */
    public final void m8481y(File file, String str) throws IOException {
        try {
            FileUtils.m8529a(file);
        } catch (FileUtils.CreateDirectoryException e11) {
            this.f8099d.mo8446a(CacheErrorLogger.CacheErrorCategory.WRITE_CREATE_DIR, f8094f, str, e11);
            throw e11;
        }
    }

    /* JADX INFO: renamed from: z */
    public final boolean m8482z(String str, boolean z11) {
        File fileM8475p = m8475p(str);
        boolean zExists = fileM8475p.exists();
        if (z11 && zExists) {
            fileM8475p.setLastModified(this.f8100e.now());
        }
        return zExists;
    }
}
