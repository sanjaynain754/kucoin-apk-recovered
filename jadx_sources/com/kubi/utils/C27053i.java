package com.kubi.utils;

import android.content.Context;
import android.os.Environment;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.kubi.utils.extensions.C27025c;
import java.io.File;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: com.kubi.utils.i */
/* JADX INFO: compiled from: CacheDataManager.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\r\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0019\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u000fH\u0002¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u000f0\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u001c¨\u0006\u001e"}, m90084d2 = {"Lcom/kubi/utils/i;", "", "<init>", "()V", "Landroid/content/Context;", "context", "", "folderName", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Landroid/content/Context;Ljava/lang/String;)V", "f", "(Landroid/content/Context;)Ljava/lang/String;", "b", "(Landroid/content/Context;)V", "Ljava/io/File;", "file", "", "d", "(Ljava/io/File;)J", "size", "e", "(J)Ljava/lang/String;", "dir", "", "c", "(Ljava/io/File;)Z", "", "Ljava/util/Set;", "otherDirs", "Utils_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nCacheDataManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CacheDataManager.kt\ncom/kubi/utils/CacheDataManager\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 4 ArrayIntrinsics.kt\nkotlin/ArrayIntrinsicsKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,127:1\n1#2:128\n18#3:129\n18#3:133\n26#4:130\n26#4:134\n1855#5,2:131\n*S KotlinDebug\n*F\n+ 1 CacheDataManager.kt\ncom/kubi/utils/CacheDataManager\n*L\n69#1:129\n117#1:133\n69#1:130\n117#1:134\n103#1:131,2\n*E\n"})
public final class C27053i {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C27053i f54338a = new C27053i();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final Set<File> otherDirs = new LinkedHashSet();

    /* JADX INFO: renamed from: a */
    public final void m66731a(@NotNull Context context, @NotNull String folderName) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(folderName, "folderName");
        File file = new File(context.getFilesDir().getAbsolutePath() + File.separator + folderName);
        if (file.isDirectory()) {
            otherDirs.add(file);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m66732b(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        m66733c(context.getCacheDir());
        Iterator<T> it = otherDirs.iterator();
        while (it.hasNext()) {
            f54338a.m66733c((File) it.next());
        }
        if (Intrinsics.areEqual(Environment.getExternalStorageState(), "mounted")) {
            m66733c(context.getExternalCacheDir());
        }
    }

    /* JADX INFO: renamed from: c */
    public final boolean m66733c(File dir) {
        if (dir != null && dir.isDirectory()) {
            String[] list = dir.list();
            if (list == null) {
                list = new String[0];
            }
            for (String str : list) {
                if (!m66733c(new File(dir, str))) {
                    return false;
                }
            }
        }
        return C27025c.m66566d(dir != null ? Boolean.valueOf(dir.delete()) : null);
    }

    /* JADX INFO: renamed from: d */
    public final long m66734d(File file) {
        File[] fileArrListFiles;
        long jM66734d = 0;
        if (file != null) {
            try {
                fileArrListFiles = file.listFiles();
            } catch (Exception e11) {
                e11.printStackTrace();
                return jM66734d;
            }
        } else {
            fileArrListFiles = null;
        }
        if (fileArrListFiles == null) {
            fileArrListFiles = new File[0];
        }
        for (File file2 : fileArrListFiles) {
            jM66734d += file2.isDirectory() ? m66734d(file2) : file2.length();
        }
        return jM66734d;
    }

    /* JADX INFO: renamed from: e */
    public final String m66735e(long size) {
        long j11 = 1024;
        long j12 = size / j11;
        StringBuilder sb2 = new StringBuilder();
        sb2.append((int) (j12 / j11));
        sb2.append('.');
        sb2.append((int) (j12 % j11));
        sb2.append('M');
        return sb2.toString();
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public final String m66736f(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        long jM66734d = m66734d(context.getCacheDir());
        Iterator<T> it = otherDirs.iterator();
        long jM66734d2 = 0;
        while (it.hasNext()) {
            jM66734d2 += f54338a.m66734d((File) it.next());
        }
        long jM66734d3 = jM66734d + jM66734d2;
        if (Intrinsics.areEqual(Environment.getExternalStorageState(), "mounted")) {
            jM66734d3 += m66734d(context.getExternalCacheDir());
        }
        return m66735e(jM66734d3);
    }
}
