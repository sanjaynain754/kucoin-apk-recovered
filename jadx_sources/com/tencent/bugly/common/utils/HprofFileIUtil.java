package com.tencent.bugly.common.utils;

import com.tencent.bugly.common.heapdump.ForkJvmHeapDumper;
import com.tencent.bugly.proguard.C33591ch;
import com.tencent.bugly.proguard.C33895r7;
import com.tencent.rmonitor.common.logger.Logger;
import java.io.File;
import java.util.Comparator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.collections.ArraysKt;
import p852kotlin.comparisons.ComparisonsKt;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, m90084d2 = {"Lcom/tencent/bugly/common/utils/HprofFileIUtil;", "", "()V", "Companion", "bugly-pro_release"}, m90085k = 1, m90086mv = {1, 6, 0}, m90088xi = 48)
public final class HprofFileIUtil {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String TAG = "Bugly_HprofFileIUtil";

    /* JADX INFO: compiled from: BUGLY */
    @Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007J\b\u0010\u000b\u001a\u00020\u0006H\u0007J\b\u0010\f\u001a\u00020\u0004H\u0007J\b\u0010\r\u001a\u00020\u0004H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m90084d2 = {"Lcom/tencent/bugly/common/utils/HprofFileIUtil$Companion;", "", "()V", "TAG", "", "deleteLastModifiedFile", "", "folder", "Ljava/io/File;", "maxSize", "", "dumpOOMHprof", "getOOMHprofPath", "getOOMHprofZipPath", "bugly-pro_release"}, m90085k = 1, m90086mv = {1, 6, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final void deleteLastModifiedFile(@NotNull File folder, long maxSize) {
            Intrinsics.checkNotNullParameter(folder, "folder");
            if (folder.isDirectory()) {
                long folderSize = FileUtil.INSTANCE.getFolderSize(folder);
                if (folderSize > maxSize) {
                    File[] fileArrListFiles = folder.listFiles();
                    List<File> listSortedWith = fileArrListFiles != null ? ArraysKt.sortedWith(fileArrListFiles, new Comparator() { // from class: com.tencent.bugly.common.utils.HprofFileIUtil$Companion$deleteLastModifiedFile$$inlined$sortedBy$1
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // java.util.Comparator
                        public final int compare(T t11, T t12) {
                            return ComparisonsKt.compareValues(Long.valueOf(((File) t11).lastModified()), Long.valueOf(((File) t12).lastModified()));
                        }
                    }) : null;
                    if (listSortedWith != null) {
                        for (File file : listSortedWith) {
                            if (folderSize > maxSize) {
                                if (file.isFile()) {
                                    folderSize -= file.length();
                                    file.delete();
                                } else if (file.isDirectory()) {
                                    FileUtil.Companion companion = FileUtil.INSTANCE;
                                    folderSize -= companion.getFolderSize(file);
                                    companion.deleteFolder(file);
                                }
                            }
                        }
                    }
                }
            }
        }

        @JvmStatic
        public final void dumpOOMHprof() {
            try {
                File file = new File(getOOMHprofPath());
                if (!file.exists()) {
                    file.mkdirs();
                }
                File file2 = new File(getOOMHprofZipPath());
                if (file2.exists()) {
                    FileUtil.INSTANCE.deleteFolder(file2);
                }
                deleteLastModifiedFile(file, 524288000L);
                ForkJvmHeapDumper forkJvmHeapDumper = new ForkJvmHeapDumper();
                String str = file.getAbsolutePath() + File.separator + C33591ch.m72746d();
                File file3 = new File(str + ".hprof");
                File file4 = new File(str + ".suc");
                if (file3.exists() && file4.exists()) {
                    return;
                }
                if (forkJvmHeapDumper.mo72144a(str + ".hprof", new C33895r7(true, 1, "")) != 0 || file4.exists()) {
                    return;
                }
                file4.createNewFile();
            } catch (Throwable th2) {
                Logger.INSTANCE.exception(HprofFileIUtil.TAG, th2);
            }
        }

        @JvmStatic
        @NotNull
        public final String getOOMHprofPath() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(FileUtil.INSTANCE.getRootPath());
            String str = File.separator;
            sb2.append(str);
            sb2.append("bugly_oom_hprof");
            sb2.append(str);
            sb2.append("hprof");
            return sb2.toString();
        }

        @JvmStatic
        @NotNull
        public final String getOOMHprofZipPath() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(FileUtil.INSTANCE.getRootPath());
            String str = File.separator;
            sb2.append(str);
            sb2.append("bugly_oom_hprof");
            sb2.append(str);
            sb2.append("zips");
            return sb2.toString();
        }
    }

    @JvmStatic
    public static final void deleteLastModifiedFile(@NotNull File file, long j11) {
        INSTANCE.deleteLastModifiedFile(file, j11);
    }

    @JvmStatic
    public static final void dumpOOMHprof() {
        INSTANCE.dumpOOMHprof();
    }

    @JvmStatic
    @NotNull
    public static final String getOOMHprofPath() {
        return INSTANCE.getOOMHprofPath();
    }

    @JvmStatic
    @NotNull
    public static final String getOOMHprofZipPath() {
        return INSTANCE.getOOMHprofZipPath();
    }
}
