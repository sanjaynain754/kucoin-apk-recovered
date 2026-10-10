package com.tencent.bugly.common.utils;

import android.content.Context;
import android.text.TextUtils;
import androidx.media3.datasource.cache.CacheDataSink;
import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.tencent.bugly.proguard.C33598d3;
import com.tencent.bugly.proguard.C33714ie;
import com.tencent.bugly.proguard.C33774lb;
import com.tencent.bugly.proguard.C33844oi;
import com.tencent.rmonitor.common.logger.Logger;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.RandomAccessFile;
import java.nio.MappedByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.GZIPOutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.ArraysKt;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.p407io.ByteStreamsKt;
import p852kotlin.p407io.CloseableKt;
import p852kotlin.p407io.FilesKt;
import p852kotlin.p407io.TextStreamsKt;
import p852kotlin.random.Random;
import p852kotlin.sequences.Sequence;
import p852kotlin.sequences.SequencesKt;
import p852kotlin.text.Charsets;
import p852kotlin.text.StringsKt;

/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\u0018\u0000 \u00032\u00020\u0001:\u0003\u0003\u0004\u0005B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0006"}, m90084d2 = {"Lcom/tencent/bugly/common/utils/FileUtil;", "", "()V", "Companion", "IStreamListener", "MmapFile", "bugly-pro_release"}, m90085k = 1, m90086mv = {1, 6, 0}, m90088xi = 48)
public final class FileUtil {

    @Nullable
    private static String SDPath = null;

    @NotNull
    private static final String TAG = "Bugly_FileUtil";

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static String RMONITOR_ROOT = "";

    @Nullable
    private static Context app = C33598d3.m72772c();

    /* JADX INFO: compiled from: BUGLY */
    @Metadata(m90083d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000eH\u0007J\u0012\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0004H\u0007J\u001c\u0010\u0011\u001a\u00020\u00122\b\u0010\u0014\u001a\u0004\u0018\u00010\u00042\b\u0010\u0015\u001a\u0004\u0018\u00010\u0004H\u0007J\u0012\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u000eH\u0007J\u0012\u0010\u0016\u001a\u00020\u00172\b\u0010\u0013\u001a\u0004\u0018\u00010\u0004H\u0007J\u0012\u0010\u0019\u001a\u00020\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u000eH\u0007J\n\u0010\u001b\u001a\u0004\u0018\u00010\u0004H\u0002J\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u001f\u001a\u00020\u0012H\u0007J\u0014\u0010 \u001a\u0004\u0018\u00010\u00042\b\u0010\u0013\u001a\u0004\u0018\u00010\u0004H\u0007J$\u0010!\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\"2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00042\b\u0010#\u001a\u0004\u0018\u00010\u0004H\u0007J\u0018\u0010$\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010%2\u0006\u0010&\u001a\u00020\u0004H\u0007J\u0012\u0010'\u001a\u00020(2\b\u0010\u001a\u001a\u0004\u0018\u00010\u000eH\u0007J\u0012\u0010)\u001a\u00020(2\b\u0010\u0018\u001a\u0004\u0018\u00010\u000eH\u0007J\n\u0010*\u001a\u0004\u0018\u00010\u0004H\u0002J\b\u0010+\u001a\u00020\u0004H\u0007J\b\u0010,\u001a\u00020\u0004H\u0007J\u0010\u0010-\u001a\u00020\u00122\u0006\u0010.\u001a\u00020\u0004H\u0007J\u001c\u0010/\u001a\u00020\u00042\b\b\u0002\u00100\u001a\u00020\u00042\b\b\u0002\u00101\u001a\u00020\u0004H\u0007J\u0012\u00102\u001a\u00020\u00042\b\u00103\u001a\u0004\u0018\u00010\u0004H\u0007J\u001a\u00104\u001a\u00020\u00042\u0006\u00105\u001a\u0002062\b\b\u0002\u00107\u001a\u000208H\u0007J\u001a\u00104\u001a\u00020\u00042\u0006\u00109\u001a\u00020:2\b\b\u0002\u00107\u001a\u000208H\u0007J\u001c\u0010;\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u000e2\b\u0010<\u001a\u0004\u0018\u00010=H\u0007J\u001c\u0010;\u001a\u00020\u00172\b\u0010>\u001a\u0004\u0018\u0001062\b\u0010<\u001a\u0004\u0018\u00010=H\u0007J$\u0010?\u001a\u00020\u00172\b\u0010\u0013\u001a\u0004\u0018\u00010\u00042\b\u0010@\u001a\u0004\u0018\u0001062\u0006\u0010\u001f\u001a\u00020\u0012H\u0007J$\u0010?\u001a\u00020\u00122\b\u0010\u001e\u001a\u0004\u0018\u00010\u00042\b\u0010A\u001a\u0004\u0018\u00010B2\u0006\u0010\u001f\u001a\u00020\u0012H\u0007J$\u0010?\u001a\u00020\u00122\b\u0010\u001e\u001a\u0004\u0018\u00010\u00042\b\u0010A\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u001f\u001a\u00020\u0012H\u0007J\"\u0010C\u001a\u00020\u00122\u0006\u0010&\u001a\u00020\u00042\u0006\u0010D\u001a\u00020\u00042\b\b\u0002\u0010E\u001a\u00020\u0012H\u0007J*\u0010C\u001a\u00020\u00122\u000e\u0010F\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010%2\u0006\u0010D\u001a\u00020\u00042\b\b\u0002\u0010E\u001a\u00020\u0012H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006G"}, m90084d2 = {"Lcom/tencent/bugly/common/utils/FileUtil$Companion;", "", "()V", "RMONITOR_ROOT", "", "SDPath", "TAG", "app", "Landroid/content/Context;", "getApp", "()Landroid/content/Context;", "setApp", "(Landroid/content/Context;)V", "copyFile", "Ljava/io/File;", "origin", "dist", "createFile", "", "filePath", "path", "fileName", "deleteFile", "", "file", "deleteFolder", "folder", "getExternalStorageDirectory", "getFileBufferStream", "Ljava/io/BufferedOutputStream;", "fileStr", "isAppend", "getFileParentPath", "getFiles", "Ljava/util/ArrayList;", "reg", "getFilesInDir", "", "dir", "getFolderSize", "", "getLastModifiedTime", "getProcessDir", "getRootPath", "getTempPath", "loadLibrary", "soPath", "makeTempFileName", "prefix", "suffix", "readOutputFromFile", "pathToFile", "readStream", "inputStream", "Ljava/io/InputStream;", "bufferSize", "", "inputStreamReader", "Ljava/io/InputStreamReader;", "readStreamByLine", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/tencent/bugly/common/utils/FileUtil$IStreamListener;", "stream", "writeFile", "input", "text", "", "zipFiles", "outputPath", "isGzip", "allFiles", "bugly-pro_release"}, m90085k = 1, m90086mv = {1, 6, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ String readStream$default(Companion companion, InputStream inputStream, int i11, int i12, Object obj) {
            if ((i12 & 2) != 0) {
                i11 = 4096;
            }
            return companion.readStream(inputStream, i11);
        }

        public static /* synthetic */ boolean zipFiles$default(Companion companion, List list, String str, boolean z11, int i11, Object obj) {
            if ((i11 & 4) != 0) {
                z11 = false;
            }
            return companion.zipFiles((List<String>) list, str, z11);
        }

        @JvmStatic
        public final boolean createFile(@Nullable String path, @Nullable String fileName) {
            if (path == null || fileName == null) {
                return false;
            }
            return createFile(new File(path, fileName).getAbsolutePath());
        }

        @JvmStatic
        public final void deleteFile(@Nullable File file) {
            File[] fileArrListFiles;
            if (file != null && file.exists()) {
                try {
                    if (file.isFile()) {
                        file.delete();
                        return;
                    }
                    try {
                        fileArrListFiles = file.listFiles();
                    } catch (Throwable unused) {
                        fileArrListFiles = null;
                    }
                    if (fileArrListFiles != null) {
                        for (File file2 : fileArrListFiles) {
                            FileUtil.INSTANCE.deleteFile(file2);
                        }
                    }
                    file.delete();
                } catch (Throwable unused2) {
                }
            }
        }

        /* JADX WARN: Code duplicated, block: B:20:0x0028 A[Catch: all -> 0x001e, IOException -> 0x0020, TryCatch #0 {IOException -> 0x0020, blocks: (B:7:0x0006, B:9:0x0011, B:11:0x0017, B:18:0x0022, B:22:0x002e, B:20:0x0028), top: B:31:0x0006, outer: #1 }] */
        /* JADX WARN: Code duplicated, block: B:22:0x002e A[Catch: all -> 0x001e, IOException -> 0x0020, TRY_LEAVE, TryCatch #0 {IOException -> 0x0020, blocks: (B:7:0x0006, B:9:0x0011, B:11:0x0017, B:18:0x0022, B:22:0x002e, B:20:0x0028), top: B:31:0x0006, outer: #1 }] */
        @JvmStatic
        @Nullable
        public final synchronized BufferedOutputStream getFileBufferStream(@Nullable String fileStr, boolean isAppend) {
            BufferedOutputStream bufferedOutputStream;
            if (fileStr == null) {
                return null;
            }
            try {
                try {
                    File file = new File(fileStr);
                    File parentFile = file.getParentFile();
                    if (parentFile == null || !(parentFile.exists() || parentFile.mkdirs())) {
                        bufferedOutputStream = file.createNewFile() ? new BufferedOutputStream(new FileOutputStream(fileStr, isAppend), 8192) : null;
                    } else if (!file.exists()) {
                        if (file.createNewFile()) {
                        }
                    }
                    return bufferedOutputStream;
                } catch (IOException e11) {
                    e11.printStackTrace();
                    return null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }

        @JvmStatic
        @Nullable
        public final ArrayList<File> getFiles(@Nullable String filePath, @Nullable String reg) {
            ArrayList<File> arrayList = null;
            File file = filePath != null ? new File(filePath) : null;
            if (file != null && file.exists()) {
                File[] fileArrListFiles = file.listFiles();
                arrayList = new ArrayList<>();
                if (fileArrListFiles != null) {
                    if (TextUtils.isEmpty(reg)) {
                        Collections.addAll(arrayList, Arrays.copyOf(fileArrListFiles, fileArrListFiles.length));
                        return arrayList;
                    }
                    int length = fileArrListFiles.length;
                    for (int i11 = 0; i11 < length; i11++) {
                        if (reg != null && Pattern.matches(reg, fileArrListFiles[i11].getName())) {
                            arrayList.add(fileArrListFiles[i11]);
                        }
                    }
                }
            }
            return arrayList;
        }

        @JvmStatic
        @NotNull
        public final String readOutputFromFile(@Nullable String pathToFile) {
            if (pathToFile == null) {
                return "";
            }
            File file = new File(pathToFile);
            if (file.exists() && file.canRead()) {
                try {
                    return StringsKt.trim(readStream$default(this, new FileReader(file), 0, 2, (Object) null), '\n');
                } catch (FileNotFoundException e11) {
                    e11.printStackTrace();
                }
            }
            return "";
        }

        @JvmStatic
        @NotNull
        public final String readStream(@NotNull InputStream inputStream, int bufferSize) {
            Intrinsics.checkNotNullParameter(inputStream, "inputStream");
            InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
            try {
                String stream = FileUtil.INSTANCE.readStream(inputStreamReader, bufferSize);
                Unit unit = Unit.INSTANCE;
                CloseableKt.closeFinally(inputStreamReader, null);
                return stream;
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    CloseableKt.closeFinally(inputStreamReader, th2);
                    throw th3;
                }
            }
        }

        @JvmStatic
        public final void readStreamByLine(@Nullable File file, @Nullable final IStreamListener listener) {
            if (file == null || listener == null || !file.exists()) {
                return;
            }
            try {
                FilesKt.forEachLine$default(file, null, new Function1<String, Unit>() { // from class: com.tencent.bugly.common.utils.FileUtil$Companion$readStreamByLine$1
                    @Override // p852kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(String str) {
                        invoke2(str);
                        return Unit.INSTANCE;
                    }

                    {
                        super(1);
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull String it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        listener.readLine(it);
                    }
                }, 1, null);
            } catch (Throwable th2) {
                th2.printStackTrace();
            }
        }

        @JvmStatic
        public final boolean writeFile(@Nullable String fileStr, @Nullable String text, boolean isAppend) {
            if (text == null) {
                return false;
            }
            Companion companion = FileUtil.INSTANCE;
            byte[] bytes = text.getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
            return companion.writeFile(fileStr, bytes, isAppend);
        }

        @JvmStatic
        public final boolean zipFiles(@Nullable List<String> allFiles, @NotNull String outputPath, boolean isGzip) {
            Intrinsics.checkNotNullParameter(outputPath, "outputPath");
            try {
                File file = new File(outputPath);
                FileUtil.INSTANCE.createFile(file.getAbsolutePath());
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                DeflaterOutputStream gZIPOutputStream = isGzip ? new GZIPOutputStream(new BufferedOutputStream(fileOutputStream)) : new ZipOutputStream(new BufferedOutputStream(fileOutputStream));
                if (allFiles == null) {
                    CloseableKt.closeFinally(gZIPOutputStream, null);
                    return false;
                }
                try {
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : allFiles) {
                        if (new File((String) obj).exists()) {
                            arrayList.add(obj);
                        }
                    }
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        File file2 = new File((String) it.next());
                        if (!isGzip) {
                            ZipOutputStream zipOutputStream = gZIPOutputStream instanceof ZipOutputStream ? (ZipOutputStream) gZIPOutputStream : null;
                            if (zipOutputStream != null) {
                                zipOutputStream.putNextEntry(new ZipEntry(file2.getName()));
                            }
                        }
                        FileInputStream fileInputStream = new FileInputStream(file2);
                        try {
                            ByteStreamsKt.copyTo(fileInputStream, gZIPOutputStream, CacheDataSink.DEFAULT_BUFFER_SIZE);
                            CloseableKt.closeFinally(fileInputStream, null);
                            gZIPOutputStream.flush();
                            if (!isGzip) {
                                ZipOutputStream zipOutputStream2 = gZIPOutputStream instanceof ZipOutputStream ? (ZipOutputStream) gZIPOutputStream : null;
                                if (zipOutputStream2 != null) {
                                    zipOutputStream2.closeEntry();
                                }
                            }
                        } catch (Throwable th2) {
                            try {
                                throw th2;
                            } catch (Throwable th3) {
                                CloseableKt.closeFinally(fileInputStream, th2);
                                throw th3;
                            }
                        }
                    }
                    CloseableKt.closeFinally(gZIPOutputStream, null);
                    return true;
                } catch (Throwable th4) {
                    try {
                        throw th4;
                    } catch (Throwable th5) {
                        CloseableKt.closeFinally(gZIPOutputStream, th4);
                        throw th5;
                    }
                }
            } catch (IOException e11) {
                e11.printStackTrace();
                return false;
            }
        }

        private Companion() {
        }

        private final String getProcessDir() {
            try {
                if (getApp() != null) {
                    ProcessUtil.Companion companion = ProcessUtil.INSTANCE;
                    if (!companion.isMainProcess(getApp())) {
                        String currentProcessName = companion.getCurrentProcessName(getApp());
                        byte[] bytes = currentProcessName.getBytes(Charsets.UTF_8);
                        Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
                        String strM73976a = C33774lb.m73976a(bytes);
                        if (strM73976a != null) {
                            return strM73976a;
                        }
                        if (StringsKt.contains$default((CharSequence) currentProcessName, (CharSequence) C33844oi.f71346o, false, 2, (Object) null)) {
                            String strSubstring = currentProcessName.substring(StringsKt.lastIndexOf$default((CharSequence) currentProcessName, C33844oi.f71346o, 0, false, 6, (Object) null) + 1);
                            Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String).substring(startIndex)");
                            return strSubstring;
                        }
                    }
                }
                return "main";
            } catch (Throwable th2) {
                th2.printStackTrace();
                return "main";
            }
        }

        public static /* synthetic */ String makeTempFileName$default(Companion companion, String str, String str2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = "temp";
            }
            if ((i11 & 2) != 0) {
                str2 = "zip";
            }
            return companion.makeTempFileName(str, str2);
        }

        public static /* synthetic */ String readStream$default(Companion companion, InputStreamReader inputStreamReader, int i11, int i12, Object obj) {
            if ((i12 & 2) != 0) {
                i11 = 4096;
            }
            return companion.readStream(inputStreamReader, i11);
        }

        public static /* synthetic */ boolean zipFiles$default(Companion companion, String str, String str2, boolean z11, int i11, Object obj) {
            if ((i11 & 4) != 0) {
                z11 = false;
            }
            return companion.zipFiles(str, str2, z11);
        }

        @JvmStatic
        public final boolean createFile(@Nullable String filePath) {
            if (filePath == null) {
                return false;
            }
            File file = new File(filePath);
            if (file.exists()) {
                return true;
            }
            try {
                File parentFile = file.getParentFile();
                if (parentFile != null && (parentFile.exists() || parentFile.mkdirs())) {
                    if (file.createNewFile()) {
                        return true;
                    }
                }
                return false;
            } catch (IOException e11) {
                e11.printStackTrace();
                return false;
            }
        }

        @JvmStatic
        public final void deleteFolder(@Nullable File folder) {
            if (folder == null || !folder.isDirectory()) {
                return;
            }
            File[] fileArrListFiles = folder.listFiles();
            if (fileArrListFiles != null) {
                for (File file : fileArrListFiles) {
                    if (file.isFile()) {
                        file.delete();
                    } else {
                        FileUtil.INSTANCE.deleteFolder(file);
                    }
                }
            }
            folder.delete();
        }

        @JvmStatic
        @Nullable
        public final String getFileParentPath(@Nullable String filePath) {
            if (filePath != null) {
                return new File(filePath).getParent();
            }
            return null;
        }

        @JvmStatic
        @Nullable
        public final List<String> getFilesInDir(@NotNull String dir) {
            Sequence sequenceAsSequence;
            Sequence sequenceFilter;
            Sequence sequenceFilter2;
            Sequence map;
            Intrinsics.checkNotNullParameter(dir, "dir");
            File[] fileArrListFiles = new File(dir).listFiles();
            if (fileArrListFiles == null || (sequenceAsSequence = ArraysKt.asSequence(fileArrListFiles)) == null || (sequenceFilter = SequencesKt.filter(sequenceAsSequence, new Function1<File, Boolean>() { // from class: com.tencent.bugly.common.utils.FileUtil$Companion$getFilesInDir$1
                @Override // p852kotlin.jvm.functions.Function1
                @NotNull
                public final Boolean invoke(File file) {
                    return Boolean.valueOf(file.exists());
                }
            })) == null || (sequenceFilter2 = SequencesKt.filter(sequenceFilter, new Function1<File, Boolean>() { // from class: com.tencent.bugly.common.utils.FileUtil$Companion$getFilesInDir$2
                @Override // p852kotlin.jvm.functions.Function1
                @NotNull
                public final Boolean invoke(File file) {
                    return Boolean.valueOf(file.isFile());
                }
            })) == null || (map = SequencesKt.map(sequenceFilter2, new Function1<File, String>() { // from class: com.tencent.bugly.common.utils.FileUtil$Companion$getFilesInDir$3
                @Override // p852kotlin.jvm.functions.Function1
                public final String invoke(File file) {
                    return file.getAbsolutePath();
                }
            })) == null) {
                return null;
            }
            return SequencesKt.toList(map);
        }

        @JvmStatic
        public final long getFolderSize(@Nullable File folder) {
            File[] fileArrListFiles;
            long length = 0;
            if (folder != null && folder.isDirectory() && (fileArrListFiles = folder.listFiles()) != null) {
                for (File file : fileArrListFiles) {
                    length += file.isFile() ? file.length() : FileUtil.INSTANCE.getFolderSize(file);
                }
            }
            return length;
        }

        @JvmStatic
        public final long getLastModifiedTime(@Nullable File file) {
            if (file != null) {
                return file.lastModified();
            }
            return -1L;
        }

        @JvmStatic
        public final synchronized boolean writeFile(@Nullable String fileStr, @Nullable byte[] text, boolean isAppend) {
            boolean z11;
            try {
                try {
                    BufferedOutputStream fileBufferStream = getFileBufferStream(fileStr, isAppend);
                    if (fileBufferStream != null) {
                        if (text != null) {
                            try {
                                fileBufferStream.write(text);
                                Unit unit = Unit.INSTANCE;
                            } catch (Throwable th2) {
                                try {
                                    throw th2;
                                } catch (Throwable th3) {
                                    CloseableKt.closeFinally(fileBufferStream, th2);
                                    throw th3;
                                }
                            }
                        }
                        CloseableKt.closeFinally(fileBufferStream, null);
                    }
                    z11 = true;
                } catch (IOException e11) {
                    e11.printStackTrace();
                    z11 = false;
                }
            } catch (Throwable th4) {
                throw th4;
            }
            return z11;
        }

        private final String getExternalStorageDirectory() {
            File dir;
            File externalFilesDir;
            String absolutePath;
            if (!TextUtils.isEmpty(FileUtil.SDPath)) {
                return FileUtil.SDPath;
            }
            String absolutePath2 = null;
            try {
                Context app = getApp();
                if (app != null) {
                    externalFilesDir = app.getExternalFilesDir("/Tencent/RMonitor");
                } else {
                    externalFilesDir = null;
                }
                if (externalFilesDir != null) {
                    absolutePath = externalFilesDir.getAbsolutePath();
                } else {
                    absolutePath = null;
                }
                FileUtil.SDPath = absolutePath;
            } catch (Throwable th2) {
                th2.printStackTrace();
            }
            try {
                if (FileUtil.SDPath == null) {
                    Context app2 = getApp();
                    if (app2 != null) {
                        dir = app2.getDir("Tencent_RMonitor", 0);
                    } else {
                        dir = null;
                    }
                    if (dir != null) {
                        absolutePath2 = dir.getAbsolutePath();
                    }
                    FileUtil.SDPath = absolutePath2;
                }
            } catch (Throwable th3) {
                th3.printStackTrace();
            }
            FileUtil.SDPath += File.separator + getProcessDir();
            String currentProcessName = ProcessUtil.INSTANCE.getCurrentProcessName(getApp());
            Logger.INSTANCE.mo77132i(FileUtil.TAG, "Process: " + currentProcessName + " ,SDPath: " + FileUtil.SDPath);
            String str = FileUtil.SDPath;
            if (str == null) {
                return "";
            }
            return str;
        }

        @JvmStatic
        @Nullable
        public final File copyFile(@NotNull File origin, @NotNull File dist) {
            Intrinsics.checkNotNullParameter(origin, "origin");
            Intrinsics.checkNotNullParameter(dist, "dist");
            try {
                return FilesKt.copyTo$default(origin, dist, true, 0, 4, null);
            } catch (Exception e11) {
                e11.printStackTrace();
                return null;
            }
        }

        @Nullable
        public final Context getApp() {
            return FileUtil.app;
        }

        @JvmStatic
        @NotNull
        public final String getRootPath() {
            if (FileUtil.RMONITOR_ROOT.length() == 0) {
                String externalStorageDirectory = getExternalStorageDirectory();
                if (externalStorageDirectory == null) {
                    externalStorageDirectory = "";
                }
                FileUtil.RMONITOR_ROOT = externalStorageDirectory;
            }
            return FileUtil.RMONITOR_ROOT;
        }

        @JvmStatic
        @NotNull
        public final String getTempPath() {
            String rootPath = getRootPath();
            String separator = File.separator;
            Intrinsics.checkNotNullExpressionValue(separator, "separator");
            if (StringsKt.endsWith$default(rootPath, separator, false, 2, (Object) null)) {
                return rootPath + "temp" + separator;
            }
            return rootPath + separator + "temp" + separator;
        }

        @JvmStatic
        public final boolean loadLibrary(@NotNull String soPath) {
            Intrinsics.checkNotNullParameter(soPath, "soPath");
            if (C33714ie.m73408k().mo73421i()) {
                return false;
            }
            try {
                System.loadLibrary(soPath);
                return true;
            } catch (Throwable th2) {
                th2.printStackTrace();
                return false;
            }
        }

        @JvmStatic
        @NotNull
        public final String makeTempFileName(@NotNull String prefix, @NotNull String suffix) {
            Intrinsics.checkNotNullParameter(prefix, "prefix");
            Intrinsics.checkNotNullParameter(suffix, "suffix");
            return prefix + '_' + System.currentTimeMillis() + '_' + Random.INSTANCE.nextInt(0, 1000) + '.' + suffix;
        }

        public final void setApp(@Nullable Context context) {
            FileUtil.app = context;
        }

        @JvmStatic
        public final void readStreamByLine(@Nullable InputStream stream, @Nullable final IStreamListener listener) {
            if (stream == null || listener == null) {
                return;
            }
            try {
                TextStreamsKt.forEachLine(new BufferedReader(new InputStreamReader(stream)), new Function1<String, Unit>() { // from class: com.tencent.bugly.common.utils.FileUtil$Companion$readStreamByLine$2
                    @Override // p852kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(String str) {
                        invoke2(str);
                        return Unit.INSTANCE;
                    }

                    {
                        super(1);
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull String it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        listener.readLine(it);
                    }
                });
            } catch (Throwable th2) {
                th2.printStackTrace();
            }
        }

        @JvmStatic
        @NotNull
        public final String readStream(@NotNull InputStreamReader inputStreamReader, int bufferSize) {
            Intrinsics.checkNotNullParameter(inputStreamReader, "inputStreamReader");
            StringBuffer stringBuffer = new StringBuffer(1024);
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader, bufferSize);
            try {
                try {
                    Iterator<T> it = TextStreamsKt.readLines(bufferedReader).iterator();
                    while (it.hasNext()) {
                        stringBuffer.append((String) it.next());
                        stringBuffer.append(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
                    }
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        CloseableKt.closeFinally(bufferedReader, th2);
                        throw th3;
                    }
                }
            } catch (Throwable th4) {
                th4.printStackTrace();
            }
            Unit unit = Unit.INSTANCE;
            CloseableKt.closeFinally(bufferedReader, null);
            String string = stringBuffer.toString();
            Intrinsics.checkNotNullExpressionValue(string, "sb.toString()");
            return string;
        }

        @JvmStatic
        public final void writeFile(@Nullable String filePath, @Nullable InputStream input, boolean isAppend) {
            BufferedOutputStream fileBufferStream = getFileBufferStream(filePath, isAppend);
            if (fileBufferStream != null) {
                if (input != null) {
                    try {
                        BufferedInputStream bufferedInputStream = input instanceof BufferedInputStream ? (BufferedInputStream) input : new BufferedInputStream(input, 8192);
                        try {
                            byte[] bArr = new byte[8192];
                            for (int i11 = bufferedInputStream.read(bArr); i11 > 0; i11 = bufferedInputStream.read(bArr)) {
                                fileBufferStream.write(bArr, 0, i11);
                            }
                            Unit unit = Unit.INSTANCE;
                            CloseableKt.closeFinally(bufferedInputStream, null);
                        } catch (Throwable th2) {
                            try {
                                throw th2;
                            } catch (Throwable th3) {
                                CloseableKt.closeFinally(bufferedInputStream, th2);
                                throw th3;
                            }
                        }
                    } catch (Throwable th4) {
                        try {
                            throw th4;
                        } catch (Throwable th5) {
                            CloseableKt.closeFinally(fileBufferStream, th4);
                            throw th5;
                        }
                    }
                }
                CloseableKt.closeFinally(fileBufferStream, null);
            }
        }

        @JvmStatic
        public final void deleteFile(@Nullable String filePath) {
            deleteFile(filePath != null ? new File(filePath) : null);
        }

        @JvmStatic
        public final boolean zipFiles(@NotNull String dir, @NotNull String outputPath, boolean isGzip) {
            Intrinsics.checkNotNullParameter(dir, "dir");
            Intrinsics.checkNotNullParameter(outputPath, "outputPath");
            return zipFiles(getFilesInDir(dir), outputPath, isGzip);
        }
    }

    /* JADX INFO: compiled from: BUGLY */
    @Metadata(m90083d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, m90084d2 = {"Lcom/tencent/bugly/common/utils/FileUtil$IStreamListener;", "", "readLine", "", "line", "", "bugly-pro_release"}, m90085k = 1, m90086mv = {1, 6, 0}, m90088xi = 48)
    public interface IStreamListener {
        void readLine(@NotNull String line);
    }

    /* JADX INFO: compiled from: BUGLY */
    @Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bR\u001a\u0010\t\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m90084d2 = {"Lcom/tencent/bugly/common/utils/FileUtil$MmapFile;", "", "mmapFilePath", "", "randomAccessFile", "Ljava/io/RandomAccessFile;", "byteBuffer", "Ljava/nio/MappedByteBuffer;", "(Ljava/lang/String;Ljava/io/RandomAccessFile;Ljava/nio/MappedByteBuffer;)V", "buffer", "getBuffer", "()Ljava/nio/MappedByteBuffer;", "setBuffer", "(Ljava/nio/MappedByteBuffer;)V", "file", "getFile", "()Ljava/io/RandomAccessFile;", "setFile", "(Ljava/io/RandomAccessFile;)V", "filePath", "getFilePath", "()Ljava/lang/String;", "setFilePath", "(Ljava/lang/String;)V", "bugly-pro_release"}, m90085k = 1, m90086mv = {1, 6, 0}, m90088xi = 48)
    public static final class MmapFile {

        @NotNull
        private MappedByteBuffer buffer;

        @NotNull
        private RandomAccessFile file;

        @NotNull
        private String filePath;

        @NotNull
        public final MappedByteBuffer getBuffer() {
            return this.buffer;
        }

        @NotNull
        public final RandomAccessFile getFile() {
            return this.file;
        }

        @NotNull
        public final String getFilePath() {
            return this.filePath;
        }

        public final void setBuffer(@NotNull MappedByteBuffer mappedByteBuffer) {
            Intrinsics.checkNotNullParameter(mappedByteBuffer, "<set-?>");
            this.buffer = mappedByteBuffer;
        }

        public final void setFile(@NotNull RandomAccessFile randomAccessFile) {
            Intrinsics.checkNotNullParameter(randomAccessFile, "<set-?>");
            this.file = randomAccessFile;
        }

        public final void setFilePath(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.filePath = str;
        }

        public MmapFile(@NotNull String mmapFilePath, @NotNull RandomAccessFile randomAccessFile, @NotNull MappedByteBuffer byteBuffer) {
            Intrinsics.checkNotNullParameter(mmapFilePath, "mmapFilePath");
            Intrinsics.checkNotNullParameter(randomAccessFile, "randomAccessFile");
            Intrinsics.checkNotNullParameter(byteBuffer, "byteBuffer");
            this.filePath = mmapFilePath;
            this.file = randomAccessFile;
            this.buffer = byteBuffer;
        }
    }

    @JvmStatic
    public static final boolean createFile(@Nullable String str) {
        return INSTANCE.createFile(str);
    }

    @JvmStatic
    public static final void deleteFile(@Nullable File file) {
        INSTANCE.deleteFile(file);
    }

    @JvmStatic
    @NotNull
    public static final String readStream(@NotNull InputStream inputStream, int i11) {
        return INSTANCE.readStream(inputStream, i11);
    }

    @JvmStatic
    public static final void readStreamByLine(@Nullable File file, @Nullable IStreamListener iStreamListener) {
        INSTANCE.readStreamByLine(file, iStreamListener);
    }

    @JvmStatic
    public static final void writeFile(@Nullable String str, @Nullable InputStream inputStream, boolean z11) {
        INSTANCE.writeFile(str, inputStream, z11);
    }

    @JvmStatic
    public static final boolean zipFiles(@NotNull String str, @NotNull String str2, boolean z11) {
        return INSTANCE.zipFiles(str, str2, z11);
    }

    @JvmStatic
    @Nullable
    public static final File copyFile(@NotNull File file, @NotNull File file2) {
        return INSTANCE.copyFile(file, file2);
    }

    @JvmStatic
    public static final boolean createFile(@Nullable String str, @Nullable String str2) {
        return INSTANCE.createFile(str, str2);
    }

    @JvmStatic
    public static final void deleteFile(@Nullable String str) {
        INSTANCE.deleteFile(str);
    }

    @JvmStatic
    public static final void deleteFolder(@Nullable File file) {
        INSTANCE.deleteFolder(file);
    }

    @JvmStatic
    @Nullable
    public static final synchronized BufferedOutputStream getFileBufferStream(@Nullable String str, boolean z11) {
        return INSTANCE.getFileBufferStream(str, z11);
    }

    @JvmStatic
    @Nullable
    public static final String getFileParentPath(@Nullable String str) {
        return INSTANCE.getFileParentPath(str);
    }

    @JvmStatic
    @Nullable
    public static final ArrayList<File> getFiles(@Nullable String str, @Nullable String str2) {
        return INSTANCE.getFiles(str, str2);
    }

    @JvmStatic
    @Nullable
    public static final List<String> getFilesInDir(@NotNull String str) {
        return INSTANCE.getFilesInDir(str);
    }

    @JvmStatic
    public static final long getFolderSize(@Nullable File file) {
        return INSTANCE.getFolderSize(file);
    }

    @JvmStatic
    public static final long getLastModifiedTime(@Nullable File file) {
        return INSTANCE.getLastModifiedTime(file);
    }

    @JvmStatic
    @NotNull
    public static final String getRootPath() {
        return INSTANCE.getRootPath();
    }

    @JvmStatic
    @NotNull
    public static final String getTempPath() {
        return INSTANCE.getTempPath();
    }

    @JvmStatic
    public static final boolean loadLibrary(@NotNull String str) {
        return INSTANCE.loadLibrary(str);
    }

    @JvmStatic
    @NotNull
    public static final String makeTempFileName(@NotNull String str, @NotNull String str2) {
        return INSTANCE.makeTempFileName(str, str2);
    }

    @JvmStatic
    @NotNull
    public static final String readOutputFromFile(@Nullable String str) {
        return INSTANCE.readOutputFromFile(str);
    }

    @JvmStatic
    @NotNull
    public static final String readStream(@NotNull InputStreamReader inputStreamReader, int i11) {
        return INSTANCE.readStream(inputStreamReader, i11);
    }

    @JvmStatic
    public static final void readStreamByLine(@Nullable InputStream inputStream, @Nullable IStreamListener iStreamListener) {
        INSTANCE.readStreamByLine(inputStream, iStreamListener);
    }

    @JvmStatic
    public static final boolean writeFile(@Nullable String str, @Nullable String str2, boolean z11) {
        return INSTANCE.writeFile(str, str2, z11);
    }

    @JvmStatic
    public static final boolean zipFiles(@Nullable List<String> list, @NotNull String str, boolean z11) {
        return INSTANCE.zipFiles(list, str, z11);
    }

    @JvmStatic
    public static final synchronized boolean writeFile(@Nullable String str, @Nullable byte[] bArr, boolean z11) {
        return INSTANCE.writeFile(str, bArr, z11);
    }
}
