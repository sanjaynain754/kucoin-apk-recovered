package p545q1;

import android.annotation.TargetApi;
import android.os.Build;
import android.os.StrictMode;
import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import com.tencent.bugly.proguard.C33627eb;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: q1.b */
/* JADX INFO: compiled from: DiskLruCache.java */
/* JADX INFO: loaded from: classes.dex */
public final class C43578b implements Closeable {

    /* JADX INFO: renamed from: b */
    public final File f96135b;

    /* JADX INFO: renamed from: c */
    public final File f96136c;

    /* JADX INFO: renamed from: d */
    public final File f96137d;

    /* JADX INFO: renamed from: e */
    public final File f96138e;

    /* JADX INFO: renamed from: f */
    public final int f96139f;

    /* JADX INFO: renamed from: g */
    public long f96140g;

    /* JADX INFO: renamed from: h */
    public final int f96141h;

    /* JADX INFO: renamed from: j */
    public Writer f96143j;

    /* JADX INFO: renamed from: l */
    public int f96145l;

    /* JADX INFO: renamed from: i */
    public long f96142i = 0;

    /* JADX INFO: renamed from: k */
    public final LinkedHashMap<String, d> f96144k = new LinkedHashMap<>(0, 0.75f, true);

    /* JADX INFO: renamed from: m */
    public long f96146m = 0;

    /* JADX INFO: renamed from: n */
    public final ThreadPoolExecutor f96147n = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new b(null));

    /* JADX INFO: renamed from: o */
    public final Callable<Void> f96148o = new a();

    /* JADX INFO: renamed from: q1.b$a */
    /* JADX INFO: compiled from: DiskLruCache.java */
    public class a implements Callable<Void> {
        public a() {
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void call() throws Exception {
            synchronized (C43578b.this) {
                try {
                    if (C43578b.this.f96143j == null) {
                        return null;
                    }
                    C43578b.this.m95876Q();
                    if (C43578b.this.m95883z()) {
                        C43578b.this.m95874M();
                        C43578b.this.f96145l = 0;
                    }
                    return null;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    /* JADX INFO: renamed from: q1.b$b */
    /* JADX INFO: compiled from: DiskLruCache.java */
    public static final class b implements ThreadFactory {
        public b() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public synchronized Thread newThread(Runnable runnable) {
            Thread thread;
            thread = new Thread(runnable, "glide-disk-lru-cache-thread");
            thread.setPriority(1);
            return thread;
        }

        public /* synthetic */ b(a aVar) {
            this();
        }
    }

    /* JADX INFO: renamed from: q1.b$c */
    /* JADX INFO: compiled from: DiskLruCache.java */
    public final class c {

        /* JADX INFO: renamed from: a */
        public final d f96150a;

        /* JADX INFO: renamed from: b */
        public final boolean[] f96151b;

        /* JADX INFO: renamed from: c */
        public boolean f96152c;

        public /* synthetic */ c(C43578b c43578b, d dVar, a aVar) {
            this(dVar);
        }

        public c(d dVar) {
            this.f96150a = dVar;
            this.f96151b = dVar.f96158e ? null : new boolean[C43578b.this.f96141h];
        }

        /* JADX INFO: renamed from: a */
        public void m95887a() throws IOException {
            C43578b.this.m95878o(this, false);
        }

        /* JADX INFO: renamed from: b */
        public void m95888b() {
            if (this.f96152c) {
                return;
            }
            try {
                m95887a();
            } catch (IOException unused) {
            }
        }

        /* JADX INFO: renamed from: e */
        public void m95889e() throws IOException {
            C43578b.this.m95878o(this, true);
            this.f96152c = true;
        }

        /* JADX INFO: renamed from: f */
        public File m95890f(int i11) throws IOException {
            File fileM95901k;
            synchronized (C43578b.this) {
                try {
                    if (this.f96150a.f96159f != this) {
                        throw new IllegalStateException();
                    }
                    if (!this.f96150a.f96158e) {
                        this.f96151b[i11] = true;
                    }
                    fileM95901k = this.f96150a.m95901k(i11);
                    C43578b.this.f96135b.mkdirs();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return fileM95901k;
        }
    }

    /* JADX INFO: renamed from: q1.b$d */
    /* JADX INFO: compiled from: DiskLruCache.java */
    public final class d {

        /* JADX INFO: renamed from: a */
        public final String f96154a;

        /* JADX INFO: renamed from: b */
        public final long[] f96155b;

        /* JADX INFO: renamed from: c */
        public File[] f96156c;

        /* JADX INFO: renamed from: d */
        public File[] f96157d;

        /* JADX INFO: renamed from: e */
        public boolean f96158e;

        /* JADX INFO: renamed from: f */
        public c f96159f;

        /* JADX INFO: renamed from: g */
        public long f96160g;

        public /* synthetic */ d(C43578b c43578b, String str, a aVar) {
            this(str);
        }

        /* JADX INFO: renamed from: n */
        public final void m95904n(String[] strArr) throws IOException {
            if (strArr.length != C43578b.this.f96141h) {
                throw m95903m(strArr);
            }
            for (int i11 = 0; i11 < strArr.length; i11++) {
                try {
                    this.f96155b[i11] = Long.parseLong(strArr[i11]);
                } catch (NumberFormatException unused) {
                    throw m95903m(strArr);
                }
            }
        }

        public d(String str) {
            this.f96154a = str;
            this.f96155b = new long[C43578b.this.f96141h];
            this.f96156c = new File[C43578b.this.f96141h];
            this.f96157d = new File[C43578b.this.f96141h];
            StringBuilder sb2 = new StringBuilder(str);
            sb2.append('.');
            int length = sb2.length();
            for (int i11 = 0; i11 < C43578b.this.f96141h; i11++) {
                sb2.append(i11);
                this.f96156c[i11] = new File(C43578b.this.f96135b, sb2.toString());
                sb2.append(".tmp");
                this.f96157d[i11] = new File(C43578b.this.f96135b, sb2.toString());
                sb2.setLength(length);
            }
        }

        /* JADX INFO: renamed from: j */
        public File m95900j(int i11) {
            return this.f96156c[i11];
        }

        /* JADX INFO: renamed from: k */
        public File m95901k(int i11) {
            return this.f96157d[i11];
        }

        /* JADX INFO: renamed from: l */
        public String m95902l() throws IOException {
            StringBuilder sb2 = new StringBuilder();
            for (long j11 : this.f96155b) {
                sb2.append(' ');
                sb2.append(j11);
            }
            return sb2.toString();
        }

        /* JADX INFO: renamed from: m */
        public final IOException m95903m(String[] strArr) throws IOException {
            throw new IOException("unexpected journal line: " + Arrays.toString(strArr));
        }
    }

    /* JADX INFO: renamed from: q1.b$e */
    /* JADX INFO: compiled from: DiskLruCache.java */
    public final class e {

        /* JADX INFO: renamed from: a */
        public final String f96162a;

        /* JADX INFO: renamed from: b */
        public final long f96163b;

        /* JADX INFO: renamed from: c */
        public final long[] f96164c;

        /* JADX INFO: renamed from: d */
        public final File[] f96165d;

        public /* synthetic */ e(C43578b c43578b, String str, long j11, File[] fileArr, long[] jArr, a aVar) {
            this(str, j11, fileArr, jArr);
        }

        public e(String str, long j11, File[] fileArr, long[] jArr) {
            this.f96162a = str;
            this.f96163b = j11;
            this.f96165d = fileArr;
            this.f96164c = jArr;
        }

        /* JADX INFO: renamed from: a */
        public File m95905a(int i11) {
            return this.f96165d[i11];
        }
    }

    /* JADX INFO: renamed from: M */
    public final synchronized void m95874M() throws IOException {
        try {
            Writer writer = this.f96143j;
            if (writer != null) {
                m95868n(writer);
            }
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f96137d), C43580d.f96173a));
            try {
                bufferedWriter.write("libcore.io.DiskLruCache");
                bufferedWriter.write(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
                bufferedWriter.write("1");
                bufferedWriter.write(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
                bufferedWriter.write(Integer.toString(this.f96139f));
                bufferedWriter.write(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
                bufferedWriter.write(Integer.toString(this.f96141h));
                bufferedWriter.write(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
                bufferedWriter.write(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
                for (d dVar : this.f96144k.values()) {
                    if (dVar.f96159f != null) {
                        bufferedWriter.write("DIRTY " + dVar.f96154a + '\n');
                    } else {
                        bufferedWriter.write("CLEAN " + dVar.f96154a + dVar.m95902l() + '\n');
                    }
                }
                m95868n(bufferedWriter);
                if (this.f96136c.exists()) {
                    m95859P(this.f96136c, this.f96138e, true);
                }
                m95859P(this.f96137d, this.f96136c, false);
                this.f96138e.delete();
                this.f96143j = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f96136c, true), C43580d.f96173a));
            } catch (Throwable th2) {
                m95868n(bufferedWriter);
                throw th2;
            }
        } catch (Throwable th3) {
            throw th3;
        }
    }

    /* JADX INFO: renamed from: O */
    public synchronized boolean m95875O(String str) throws IOException {
        try {
            m95877m();
            d dVar = this.f96144k.get(str);
            if (dVar != null && dVar.f96159f == null) {
                for (int i11 = 0; i11 < this.f96141h; i11++) {
                    File fileM95900j = dVar.m95900j(i11);
                    if (fileM95900j.exists() && !fileM95900j.delete()) {
                        throw new IOException("failed to delete " + fileM95900j);
                    }
                    this.f96142i -= dVar.f96155b[i11];
                    dVar.f96155b[i11] = 0;
                }
                this.f96145l++;
                this.f96143j.append((CharSequence) "REMOVE");
                this.f96143j.append(' ');
                this.f96143j.append((CharSequence) str);
                this.f96143j.append('\n');
                this.f96144k.remove(str);
                if (m95883z()) {
                    this.f96147n.submit(this.f96148o);
                }
                return true;
            }
            return false;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() throws IOException {
        try {
            if (this.f96143j == null) {
                return;
            }
            for (d dVar : new ArrayList(this.f96144k.values())) {
                if (dVar.f96159f != null) {
                    dVar.f96159f.m95887a();
                }
            }
            m95876Q();
            m95868n(this.f96143j);
            this.f96143j = null;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX INFO: renamed from: o */
    public final synchronized void m95878o(c cVar, boolean z11) throws IOException {
        d dVar = cVar.f96150a;
        if (dVar.f96159f != cVar) {
            throw new IllegalStateException();
        }
        if (z11 && !dVar.f96158e) {
            for (int i11 = 0; i11 < this.f96141h; i11++) {
                if (!cVar.f96151b[i11]) {
                    cVar.m95887a();
                    throw new IllegalStateException("Newly created entry didn't create value for index " + i11);
                }
                if (!dVar.m95901k(i11).exists()) {
                    cVar.m95887a();
                    return;
                }
            }
        }
        for (int i12 = 0; i12 < this.f96141h; i12++) {
            File fileM95901k = dVar.m95901k(i12);
            if (!z11) {
                m95869q(fileM95901k);
            } else if (fileM95901k.exists()) {
                File fileM95900j = dVar.m95900j(i12);
                fileM95901k.renameTo(fileM95900j);
                long j11 = dVar.f96155b[i12];
                long length = fileM95900j.length();
                dVar.f96155b[i12] = length;
                this.f96142i = (this.f96142i - j11) + length;
            }
        }
        this.f96145l++;
        dVar.f96159f = null;
        if (dVar.f96158e || z11) {
            dVar.f96158e = true;
            this.f96143j.append((CharSequence) "CLEAN");
            this.f96143j.append(' ');
            this.f96143j.append((CharSequence) dVar.f96154a);
            this.f96143j.append((CharSequence) dVar.m95902l());
            this.f96143j.append('\n');
            if (z11) {
                long j12 = this.f96146m;
                this.f96146m = 1 + j12;
                dVar.f96160g = j12;
            }
        } else {
            this.f96144k.remove(dVar.f96154a);
            this.f96143j.append((CharSequence) "REMOVE");
            this.f96143j.append(' ');
            this.f96143j.append((CharSequence) dVar.f96154a);
            this.f96143j.append('\n');
        }
        m95870w(this.f96143j);
        if (this.f96142i > this.f96140g || m95883z()) {
            this.f96147n.submit(this.f96148o);
        }
    }

    /* JADX INFO: renamed from: v */
    public final synchronized c m95881v(String str, long j11) throws IOException {
        m95877m();
        d dVar = this.f96144k.get(str);
        a aVar = null;
        if (j11 != -1 && (dVar == null || dVar.f96160g != j11)) {
            return null;
        }
        if (dVar == null) {
            dVar = new d(this, str, aVar);
            this.f96144k.put(str, dVar);
        } else if (dVar.f96159f != null) {
            return null;
        }
        c cVar = new c(this, dVar, aVar);
        dVar.f96159f = cVar;
        this.f96143j.append((CharSequence) "DIRTY");
        this.f96143j.append(' ');
        this.f96143j.append((CharSequence) str);
        this.f96143j.append('\n');
        m95870w(this.f96143j);
        return cVar;
    }

    /* JADX INFO: renamed from: x */
    public synchronized e m95882x(String str) throws IOException {
        Throwable th2;
        try {
            try {
                m95877m();
                d dVar = this.f96144k.get(str);
                if (dVar == null) {
                    return null;
                }
                if (!dVar.f96158e) {
                    return null;
                }
                for (File file : dVar.f96156c) {
                    try {
                        if (!file.exists()) {
                            return null;
                        }
                    } catch (Throwable th3) {
                        th2 = th3;
                    }
                }
                this.f96145l++;
                this.f96143j.append((CharSequence) "READ");
                this.f96143j.append(' ');
                this.f96143j.append((CharSequence) str);
                this.f96143j.append('\n');
                if (m95883z()) {
                    this.f96147n.submit(this.f96148o);
                }
                return new e(this, str, dVar.f96160g, dVar.f96156c, dVar.f96155b, null);
            } catch (Throwable th4) {
                th = th4;
                th2 = th;
            }
        } catch (Throwable th5) {
            th = th5;
            th2 = th;
        }
        throw th2;
    }

    public C43578b(File file, int i11, int i12, long j11) {
        this.f96135b = file;
        this.f96139f = i11;
        this.f96136c = new File(file, "journal");
        this.f96137d = new File(file, "journal.tmp");
        this.f96138e = new File(file, "journal.bkp");
        this.f96141h = i12;
        this.f96140g = j11;
    }

    /* JADX INFO: renamed from: C */
    public static C43578b m95858C(File file, int i11, int i12, long j11) throws IOException {
        if (j11 <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        if (i12 <= 0) {
            throw new IllegalArgumentException("valueCount <= 0");
        }
        File file2 = new File(file, "journal.bkp");
        if (file2.exists()) {
            File file3 = new File(file, "journal");
            if (file3.exists()) {
                file2.delete();
            } else {
                m95859P(file2, file3, false);
            }
        }
        C43578b c43578b = new C43578b(file, i11, i12, j11);
        if (c43578b.f96136c.exists()) {
            try {
                c43578b.m95872J();
                c43578b.m95871E();
                return c43578b;
            } catch (IOException e11) {
                System.out.println("DiskLruCache " + file + " is corrupt: " + e11.getMessage() + ", removing");
                c43578b.m95879p();
            }
        }
        file.mkdirs();
        C43578b c43578b2 = new C43578b(file, i11, i12, j11);
        c43578b2.m95874M();
        return c43578b2;
    }

    /* JADX INFO: renamed from: P */
    public static void m95859P(File file, File file2, boolean z11) throws IOException {
        if (z11) {
            m95869q(file2);
        }
        if (!file.renameTo(file2)) {
            throw new IOException();
        }
    }

    @TargetApi(26)
    /* JADX INFO: renamed from: n */
    public static void m95868n(Writer writer) throws IOException {
        if (Build.VERSION.SDK_INT < 26) {
            writer.close();
            return;
        }
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo().build());
        try {
            writer.close();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    @TargetApi(26)
    /* JADX INFO: renamed from: w */
    public static void m95870w(Writer writer) throws IOException {
        if (Build.VERSION.SDK_INT < 26) {
            writer.flush();
            return;
        }
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo().build());
        try {
            writer.flush();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    /* JADX INFO: renamed from: E */
    public final void m95871E() throws IOException {
        m95869q(this.f96137d);
        Iterator<d> it = this.f96144k.values().iterator();
        while (it.hasNext()) {
            d next = it.next();
            int i11 = 0;
            if (next.f96159f == null) {
                while (i11 < this.f96141h) {
                    this.f96142i += next.f96155b[i11];
                    i11++;
                }
            } else {
                next.f96159f = null;
                while (i11 < this.f96141h) {
                    m95869q(next.m95900j(i11));
                    m95869q(next.m95901k(i11));
                    i11++;
                }
                it.remove();
            }
        }
    }

    /* JADX INFO: renamed from: J */
    public final void m95872J() throws IOException {
        C43579c c43579c = new C43579c(new FileInputStream(this.f96136c), C43580d.f96173a);
        try {
            String strM95909h = c43579c.m95909h();
            String strM95909h2 = c43579c.m95909h();
            String strM95909h3 = c43579c.m95909h();
            String strM95909h4 = c43579c.m95909h();
            String strM95909h5 = c43579c.m95909h();
            if (!"libcore.io.DiskLruCache".equals(strM95909h) || !"1".equals(strM95909h2) || !Integer.toString(this.f96139f).equals(strM95909h3) || !Integer.toString(this.f96141h).equals(strM95909h4) || !"".equals(strM95909h5)) {
                throw new IOException("unexpected journal header: [" + strM95909h + ", " + strM95909h2 + ", " + strM95909h4 + ", " + strM95909h5 + "]");
            }
            int i11 = 0;
            while (true) {
                try {
                    m95873L(c43579c.m95909h());
                    i11++;
                } catch (EOFException unused) {
                    this.f96145l = i11 - this.f96144k.size();
                    if (c43579c.m95908g()) {
                        m95874M();
                    } else {
                        this.f96143j = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f96136c, true), C43580d.f96173a));
                    }
                    C43580d.m95910a(c43579c);
                    return;
                }
            }
        } catch (Throwable th2) {
            C43580d.m95910a(c43579c);
            throw th2;
        }
    }

    /* JADX INFO: renamed from: L */
    public final void m95873L(String str) throws IOException {
        String strSubstring;
        int iIndexOf = str.indexOf(32);
        if (iIndexOf == -1) {
            throw new IOException("unexpected journal line: " + str);
        }
        int i11 = iIndexOf + 1;
        int iIndexOf2 = str.indexOf(32, i11);
        if (iIndexOf2 == -1) {
            strSubstring = str.substring(i11);
            if (iIndexOf == 6 && str.startsWith("REMOVE")) {
                this.f96144k.remove(strSubstring);
                return;
            }
        } else {
            strSubstring = str.substring(i11, iIndexOf2);
        }
        d dVar = this.f96144k.get(strSubstring);
        a aVar = null;
        if (dVar == null) {
            dVar = new d(this, strSubstring, aVar);
            this.f96144k.put(strSubstring, dVar);
        }
        if (iIndexOf2 != -1 && iIndexOf == 5 && str.startsWith("CLEAN")) {
            String[] strArrSplit = str.substring(iIndexOf2 + 1).split(C33627eb.f69716f);
            dVar.f96158e = true;
            dVar.f96159f = null;
            dVar.m95904n(strArrSplit);
            return;
        }
        if (iIndexOf2 == -1 && iIndexOf == 5 && str.startsWith("DIRTY")) {
            dVar.f96159f = new c(this, dVar, aVar);
            return;
        }
        if (iIndexOf2 == -1 && iIndexOf == 4 && str.startsWith("READ")) {
            return;
        }
        throw new IOException("unexpected journal line: " + str);
    }

    /* JADX INFO: renamed from: Q */
    public final void m95876Q() throws IOException {
        while (this.f96142i > this.f96140g) {
            m95875O(this.f96144k.entrySet().iterator().next().getKey());
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m95877m() {
        if (this.f96143j == null) {
            throw new IllegalStateException("cache is closed");
        }
    }

    /* JADX INFO: renamed from: u */
    public c m95880u(String str) throws IOException {
        return m95881v(str, -1L);
    }

    /* JADX INFO: renamed from: z */
    public final boolean m95883z() {
        int i11 = this.f96145l;
        return i11 >= 2000 && i11 >= this.f96144k.size();
    }

    /* JADX INFO: renamed from: q */
    public static void m95869q(File file) throws IOException {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    /* JADX INFO: renamed from: p */
    public void m95879p() throws IOException {
        close();
        C43580d.m95911b(this.f96135b);
    }
}
