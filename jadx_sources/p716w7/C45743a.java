package p716w7;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import com.getkeepsafe.relinker.MissingLibraryException;
import java.io.Closeable;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* JADX INFO: renamed from: w7.a */
/* JADX INFO: compiled from: ApkLibraryInstaller.java */
/* JADX INFO: loaded from: classes.dex */
public class C45743a implements C45744b.a {
    @Override // p716w7.C45744b.a
    @SuppressLint({"SetWorldReadable"})
    /* JADX INFO: renamed from: a */
    public void mo100968a(Context context, String[] strArr, String str, File file, C45745c c45745c) throws Throwable {
        String[] strArrM100972e;
        ZipFile zipFile;
        FileOutputStream fileOutputStream;
        InputStream inputStream;
        a aVar = null;
        Closeable closeable = null;
        try {
            a aVarM100971d = m100971d(context, strArr, str, c45745c);
            try {
                if (aVarM100971d == null) {
                    try {
                        strArrM100972e = m100972e(context, str);
                    } catch (Exception e11) {
                        strArrM100972e = new String[]{e11.toString()};
                    }
                    throw new MissingLibraryException(str, strArr, strArrM100972e);
                }
                int i11 = 0;
                while (true) {
                    int i12 = i11 + 1;
                    try {
                        if (i11 >= 5) {
                            c45745c.m100987h("FATAL! Couldn't extract the library from the APK!");
                            zipFile = aVarM100971d.f103148a;
                            if (zipFile != null) {
                                break;
                            } else {
                                return;
                            }
                        }
                        c45745c.m100988i("Found %s! Extracting...", str);
                        try {
                            if (file.exists() || file.createNewFile()) {
                                try {
                                    inputStream = aVarM100971d.f103148a.getInputStream(aVarM100971d.f103149b);
                                    try {
                                        fileOutputStream = new FileOutputStream(file);
                                        try {
                                            long jM100970c = m100970c(inputStream, fileOutputStream);
                                            fileOutputStream.getFD().sync();
                                            if (jM100970c == file.length()) {
                                                m100969b(inputStream);
                                                m100969b(fileOutputStream);
                                                file.setReadable(true, false);
                                                file.setExecutable(true, false);
                                                file.setWritable(true);
                                                zipFile = aVarM100971d.f103148a;
                                                if (zipFile != null) {
                                                    break;
                                                } else {
                                                    return;
                                                }
                                            }
                                            m100969b(inputStream);
                                            m100969b(fileOutputStream);
                                        } catch (FileNotFoundException unused) {
                                            m100969b(inputStream);
                                        } catch (IOException unused2) {
                                            m100969b(inputStream);
                                        } catch (Throwable th2) {
                                            th = th2;
                                            closeable = inputStream;
                                            m100969b(closeable);
                                            m100969b(fileOutputStream);
                                            throw th;
                                        }
                                    } catch (FileNotFoundException unused3) {
                                        fileOutputStream = null;
                                    } catch (IOException unused4) {
                                        fileOutputStream = null;
                                    } catch (Throwable th3) {
                                        th = th3;
                                        fileOutputStream = null;
                                    }
                                } catch (FileNotFoundException unused5) {
                                    inputStream = null;
                                    fileOutputStream = null;
                                } catch (IOException unused6) {
                                    inputStream = null;
                                    fileOutputStream = null;
                                } catch (Throwable th4) {
                                    th = th4;
                                    fileOutputStream = null;
                                }
                            }
                        } catch (IOException unused7) {
                        }
                        i11 = i12;
                    } catch (IOException unused8) {
                        return;
                    }
                }
                zipFile.close();
            } catch (Throwable th5) {
                th = th5;
                aVar = aVarM100971d;
                if (aVar != null) {
                    try {
                        ZipFile zipFile2 = aVar.f103148a;
                        if (zipFile2 != null) {
                            zipFile2.close();
                        }
                    } catch (IOException unused9) {
                    }
                }
                throw th;
            }
        } catch (Throwable th6) {
            th = th6;
        }
    }

    /* JADX INFO: renamed from: w7.a$a */
    /* JADX INFO: compiled from: ApkLibraryInstaller.java */
    /* JADX INFO: loaded from: classes45.dex */
    public static class a {

        /* JADX INFO: renamed from: a */
        public ZipFile f103148a;

        /* JADX INFO: renamed from: b */
        public ZipEntry f103149b;

        public a(ZipFile zipFile, ZipEntry zipEntry) {
            this.f103148a = zipFile;
            this.f103149b = zipEntry;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m100969b(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final long m100970c(InputStream inputStream, OutputStream outputStream) throws IOException {
        byte[] bArr = new byte[4096];
        long j11 = 0;
        while (true) {
            int i11 = inputStream.read(bArr);
            if (i11 == -1) {
                outputStream.flush();
                return j11;
            }
            outputStream.write(bArr, 0, i11);
            j11 += (long) i11;
        }
    }

    /* JADX INFO: renamed from: d */
    public final a m100971d(Context context, String[] strArr, String str, C45745c c45745c) {
        String[] strArrM100973f = m100973f(context);
        int length = strArrM100973f.length;
        int i11 = 0;
        while (true) {
            ZipFile zipFile = null;
            if (i11 >= length) {
                return null;
            }
            String str2 = strArrM100973f[i11];
            int i12 = 0;
            while (true) {
                int i13 = i12 + 1;
                if (i12 >= 5) {
                    break;
                }
                try {
                    zipFile = new ZipFile(new File(str2), 1);
                    break;
                } catch (IOException unused) {
                    i12 = i13;
                }
            }
            if (zipFile != null) {
                int i14 = 0;
                while (true) {
                    int i15 = i14 + 1;
                    if (i14 >= 5) {
                        try {
                            zipFile.close();
                            break;
                        } catch (IOException unused2) {
                            break;
                        }
                    }
                    for (String str3 : strArr) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("lib");
                        char c11 = File.separatorChar;
                        sb2.append(c11);
                        sb2.append(str3);
                        sb2.append(c11);
                        sb2.append(str);
                        String string = sb2.toString();
                        c45745c.m100988i("Looking for %s in APK %s...", string, str2);
                        ZipEntry entry = zipFile.getEntry(string);
                        if (entry != null) {
                            return new a(zipFile, entry);
                        }
                    }
                    i14 = i15;
                }
            }
            i11++;
        }
    }

    /* JADX INFO: renamed from: e */
    public final String[] m100972e(Context context, String str) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("lib");
        char c11 = File.separatorChar;
        sb2.append(c11);
        sb2.append("([^\\");
        sb2.append(c11);
        sb2.append("]*)");
        sb2.append(c11);
        sb2.append(str);
        Pattern patternCompile = Pattern.compile(sb2.toString());
        HashSet hashSet = new HashSet();
        for (String str2 : m100973f(context)) {
            try {
                Enumeration<? extends ZipEntry> enumerationEntries = new ZipFile(new File(str2), 1).entries();
                while (enumerationEntries.hasMoreElements()) {
                    Matcher matcher = patternCompile.matcher(enumerationEntries.nextElement().getName());
                    if (matcher.matches()) {
                        hashSet.add(matcher.group(1));
                    }
                }
            } catch (IOException unused) {
            }
        }
        return (String[]) hashSet.toArray(new String[hashSet.size()]);
    }

    /* JADX INFO: renamed from: f */
    public final String[] m100973f(Context context) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        String[] strArr = applicationInfo.splitSourceDirs;
        if (strArr != null && strArr.length != 0) {
            String[] strArr2 = new String[strArr.length + 1];
            strArr2[0] = applicationInfo.sourceDir;
            System.arraycopy(strArr, 0, strArr2, 1, strArr.length);
            return strArr2;
        }
        return new String[]{applicationInfo.sourceDir};
    }
}
