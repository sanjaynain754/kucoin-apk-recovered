package com.kubi.sdk.pkg.util;

import android.content.Context;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.tencent.bugly.proguard.C33978va;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p569qq.C43840a;
import p569qq.C43846g;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.p407io.FilesKt;
import p852kotlin.text.StringsKt;
import ro.C44128b;

/* JADX INFO: renamed from: com.kubi.sdk.pkg.util.a */
/* JADX INFO: compiled from: FileUtil.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u000e¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u000e¢\u0006\u0004\b\u0014\u0010\u0013J\u0015\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0015\u0010\u0016J\u001d\u0010\u0019\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u0006¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001c\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\u0006¢\u0006\u0004\b\u001c\u0010\u001dJ\u001b\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00060\u001e2\u0006\u0010\u001b\u001a\u00020\u0006¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010\"\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010!\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\"\u0010\u001aJ\u001f\u0010&\u001a\u00020\t2\u0006\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020\u000eH\u0002¢\u0006\u0004\b&\u0010'J\u0019\u0010)\u001a\u00020\t2\b\u0010%\u001a\u0004\u0018\u00010(H\u0002¢\u0006\u0004\b)\u0010*¨\u0006+"}, m90084d2 = {"Lcom/kubi/sdk/pkg/util/a;", "", "<init>", "()V", "Ljava/io/InputStream;", "input", "", "name", "outPathString", "", "j", "(Ljava/io/InputStream;Ljava/lang/String;Ljava/lang/String;)Z", "Landroid/content/Context;", "context", "Ljava/io/File;", "c", "(Landroid/content/Context;)Ljava/io/File;", "dir", "b", "(Ljava/io/File;)Z", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, CmcdData.Factory.STREAMING_FORMAT_HLS, "(Ljava/io/InputStream;)Ljava/lang/String;", "fileName", "intendedDir", "f", "(Ljava/lang/String;Ljava/lang/String;)Z", "path", "d", "(Ljava/lang/String;)Z", "", "e", "(Ljava/lang/String;)[Ljava/lang/String;", "szName", "g", "Ljava/util/zip/ZipInputStream;", "inZip", "file", "k", "(Ljava/util/zip/ZipInputStream;Ljava/io/File;)Z", "Ljava/io/Closeable;", "i", "(Ljava/io/Closeable;)Z", "Package_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nFileUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FileUtil.kt\ncom/kubi/sdk/pkg/util/FileUtil\n+ 2 PackageException.kt\ncom/kubi/sdk/pkg/util/PackageExceptionKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 ArrayIntrinsics.kt\nkotlin/ArrayIntrinsicsKt\n*L\n1#1,368:1\n22#2,2:369\n22#2,2:371\n22#2,2:373\n22#2,2:375\n1#3:377\n26#4:378\n*S KotlinDebug\n*F\n+ 1 FileUtil.kt\ncom/kubi/sdk/pkg/util/FileUtil\n*L\n47#1:369,2\n100#1:371,2\n155#1:373,2\n202#1:375,2\n364#1:378\n*E\n"})
public final class C23984a {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C23984a f47488a = new C23984a();

    /* JADX INFO: renamed from: i */
    public final boolean m57870i(Closeable file) {
        if (file == null) {
            return true;
        }
        try {
            file.close();
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: k */
    public final boolean m57872k(ZipInputStream inZip, File file) {
        Throwable th2;
        Closeable closeable;
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                byte[] bArr = new byte[1024];
                while (true) {
                    int i11 = inZip.read(bArr);
                    if (i11 == -1) {
                        m57870i(fileOutputStream);
                        return true;
                    }
                    fileOutputStream.write(bArr, 0, i11);
                    fileOutputStream.flush();
                }
            } catch (Throwable th3) {
                th2 = th3;
                closeable = fileOutputStream;
                try {
                    C43846g.m96568c(new PackageException(th2, "FileUtil", false, null, 8, null), null, 2, null);
                    return false;
                } finally {
                    m57870i(closeable);
                }
            }
        } catch (Throwable th4) {
            th2 = th4;
            closeable = null;
        }
    }

    /* JADX INFO: renamed from: a */
    public final boolean m57862a(@NotNull File dir) {
        String[] list;
        Intrinsics.checkNotNullParameter(dir, "dir");
        if (dir.isDirectory() && (list = dir.list()) != null) {
            int length = list.length;
            for (int i11 = 0; i11 < length && m57863b(new File(dir, list[i11])); i11++) {
            }
            return false;
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m57863b(@NotNull File dir) {
        Intrinsics.checkNotNullParameter(dir, "dir");
        return FilesKt.deleteRecursively(dir);
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final File m57864c(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        File filesDir = context.getFilesDir();
        if (filesDir != null) {
            return filesDir;
        }
        return new File("/data/data/" + context.getPackageName() + "/file/");
    }

    /* JADX INFO: renamed from: d */
    public final boolean m57865d(@NotNull String path) {
        Intrinsics.checkNotNullParameter(path, "path");
        return new File(path).exists();
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public final String[] m57866e(@NotNull String path) {
        Intrinsics.checkNotNullParameter(path, "path");
        String[] list = new File(path).list();
        return list == null ? new String[0] : list;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m57867f(@NotNull String fileName, @NotNull String intendedDir) throws IOException {
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        Intrinsics.checkNotNullParameter(intendedDir, "intendedDir");
        String canonicalFN = new File(fileName).getCanonicalPath();
        String canonicalID = new File(intendedDir).getCanonicalPath();
        Intrinsics.checkNotNullExpressionValue(canonicalFN, "canonicalFN");
        Intrinsics.checkNotNullExpressionValue(canonicalID, "canonicalID");
        return StringsKt.startsWith$default(canonicalFN, canonicalID, false, 2, (Object) null);
    }

    /* JADX INFO: renamed from: g */
    public final boolean m57868g(String outPathString, String szName) {
        File file = new File(outPathString + File.separator + szName);
        File parentFile = file.getParentFile();
        if (parentFile == null || parentFile.exists() || parentFile.mkdirs()) {
            return file.createNewFile();
        }
        return false;
    }

    @NotNull
    /* JADX INFO: renamed from: h */
    public final String m57869h(@NotNull InputStream input) throws Throwable {
        Intrinsics.checkNotNullParameter(input, "input");
        StringBuffer stringBuffer = new StringBuffer();
        Closeable closeable = null;
        try {
            try {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(input, "UTF-8"));
                while (true) {
                    try {
                        String line = bufferedReader.readLine();
                        if (line == null) {
                            m57870i(bufferedReader);
                            String string = stringBuffer.toString();
                            Intrinsics.checkNotNullExpressionValue(string, "buffer.toString()");
                            return string;
                        }
                        stringBuffer.append(line);
                    } catch (IOException e11) {
                        closeable = bufferedReader;
                        throw e11;
                    } catch (Throwable th2) {
                        th = th2;
                        closeable = bufferedReader;
                        m57870i(closeable);
                        throw th;
                    }
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (IOException e12) {
            throw e12;
        }
    }

    /* JADX INFO: renamed from: j */
    public final boolean m57871j(@NotNull InputStream input, @Nullable String name, @NotNull String outPathString) {
        Throwable th2;
        Closeable closeable;
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(outPathString, "outPathString");
        try {
            ZipInputStream zipInputStream = new ZipInputStream(input);
            while (true) {
                try {
                    ZipEntry nextEntry = zipInputStream.getNextEntry();
                    if (nextEntry == null) {
                        m57870i(zipInputStream);
                        return true;
                    }
                    String name2 = nextEntry.getName();
                    Intrinsics.checkNotNullExpressionValue(name2, "nextEntry.name");
                    String strReplace$default = StringsKt.replace$default(name2, name + '/', "", false, 4, (Object) null);
                    if (!m57867f(strReplace$default, C33978va.f72339h)) {
                        C44128b.m97260d("File is outside extraction target directory.");
                        m57870i(zipInputStream);
                        return false;
                    }
                    if (!nextEntry.isDirectory()) {
                        File file = new File(outPathString + File.separator + strReplace$default);
                        if (!file.exists() && !m57868g(outPathString, strReplace$default)) {
                            C43840a.m96548b("解压 创建覆盖文件 失败", "package_deploy");
                            m57870i(zipInputStream);
                            return false;
                        }
                        if (!m57872k(zipInputStream, file)) {
                            C43840a.m96548b("解压 执行文件覆盖 失败", "package_deploy");
                            m57870i(zipInputStream);
                            return false;
                        }
                    } else if (strReplace$default.length() != 0) {
                        String strSubstring = strReplace$default.substring(0, strReplace$default.length() - 1);
                        Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                        File file2 = new File(outPathString + File.separator + strSubstring);
                        if (!file2.exists() && !file2.mkdirs()) {
                            C43840a.m96548b("解压 创建目录 失败", "package_deploy");
                            m57870i(zipInputStream);
                            return false;
                        }
                    }
                } catch (Throwable th3) {
                    th2 = th3;
                    closeable = zipInputStream;
                    try {
                        C43846g.m96568c(new PackageException(th2, "FileUtil", false, null, 8, null), null, 2, null);
                        return false;
                    } finally {
                        m57870i(closeable);
                    }
                }
            }
        } catch (Throwable th4) {
            th2 = th4;
            closeable = null;
        }
    }
}
