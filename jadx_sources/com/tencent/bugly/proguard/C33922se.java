package com.tencent.bugly.proguard;

import android.content.Context;
import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import com.tencent.bugly.common.utils.AndroidVersion;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.RandomAccessFile;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import org.tensorflow.lite.schema.BuiltinOptions;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.se */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public class C33922se {

    /* JADX INFO: renamed from: g */
    public static final int f71938g = 13;

    /* JADX INFO: renamed from: h */
    public static final int f71939h = 50;

    /* JADX INFO: renamed from: i */
    public static final String f71940i = "bugly_crash_processing";

    /* JADX INFO: renamed from: j */
    public static final String f71941j = "_process_record.txt";

    /* JADX INFO: renamed from: k */
    public static final String f71942k = "processing_record_lock";

    /* JADX INFO: renamed from: l */
    public static final long f71943l = 10000;

    /* JADX INFO: renamed from: m */
    public static final int f71944m = 6;

    /* JADX INFO: renamed from: n */
    public static WeakReference<C33922se> f71945n;

    /* JADX INFO: renamed from: a */
    public MappedByteBuffer f71946a;

    /* JADX INFO: renamed from: b */
    public FileChannel f71947b;

    /* JADX INFO: renamed from: c */
    public boolean f71948c = false;

    /* JADX INFO: renamed from: d */
    public boolean f71949d = false;

    /* JADX INFO: renamed from: e */
    public final C33765l2 f71950e;

    /* JADX INFO: renamed from: f */
    public final String f71951f;

    /* JADX INFO: renamed from: com.tencent.bugly.proguard.se$a */
    /* JADX INFO: compiled from: BUGLY */
    public class a implements Runnable {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Context f71952b;

        public a(Context context) {
            this.f71952b = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f71952b.getFilesDir().getAbsolutePath());
            String strM75464a = C34025xh.m75464a(sb2, File.separator, C33922se.f71940i);
            if (!C33571bi.m72592a(this.f71952b, C33922se.f71942k, 10000L)) {
                C34012x4.m75434a("Failed to lock file for uploading processing record.", new Object[0]);
                return;
            }
            File file = new File(strM75464a);
            if (!file.exists()) {
                file.mkdir();
            }
            if (file.list().length > 0) {
                C33590cg.b.f69449a.m72713d(strM75464a);
            } else {
                C34012x4.m75442d("No crash processing file exist.", new Object[0]);
            }
            C33571bi.m72609b(this.f71952b, C33922se.f71942k);
        }
    }

    /* JADX INFO: renamed from: com.tencent.bugly.proguard.se$b */
    /* JADX INFO: compiled from: BUGLY */
    public enum b {
        crashInfos,
        martianLog,
        syslogFile,
        crashState,
        mainThreadMsg,
        tombsInfo,
        anrMessage,
        traceInfo,
        oomHprof,
        asanInfo
    }

    /* JADX INFO: renamed from: com.tencent.bugly.proguard.se$c */
    /* JADX INFO: compiled from: BUGLY */
    public enum c {
        crash,
        node_1,
        node_2,
        node_3,
        node_4,
        node_5,
        node_6,
        save,
        callback
    }

    /* JADX INFO: renamed from: a */
    public static synchronized C33922se m74981a() {
        C33922se c33922se;
        try {
            WeakReference<C33922se> weakReference = f71945n;
            c33922se = weakReference != null ? weakReference.get() : null;
            if (c33922se == null) {
                c33922se = new C33922se(C33598d3.m72772c());
                f71945n = new WeakReference<>(c33922se);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return c33922se;
    }

    public C33922se(Context context) {
        C33765l2 c33765l2M73825a = C33765l2.m73825a(context);
        this.f71950e = c33765l2M73825a;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(context.getFilesDir().getAbsolutePath());
        String str = File.separator;
        sb2.append(str);
        sb2.append(f71940i);
        sb2.append(str);
        this.f71951f = C34025xh.m75464a(sb2, c33765l2M73825a.f70745f, f71941j);
    }

    /* JADX WARN: Code duplicated, block: B:57:0x0187 A[Catch: all -> 0x012c, TRY_LEAVE, TryCatch #5 {all -> 0x012c, blocks: (B:39:0x0071, B:41:0x00f6, B:43:0x00f9, B:45:0x0121, B:49:0x013e, B:51:0x0146, B:56:0x0155, B:48:0x0130, B:57:0x0187), top: B:78:0x0071, outer: #2 }] */
    /* JADX INFO: renamed from: a */
    public void m74984a(int i11, boolean z11, Throwable th2) {
        byte[] allBytes;
        RandomAccessFile randomAccessFile;
        String str;
        String string;
        if (z11) {
            if (this.f71948c) {
                this.f71949d = true;
                return;
            }
            try {
                File file = new File(this.f71951f);
                if (!file.exists()) {
                    file.createNewFile();
                }
                byte[] byteArray = new byte[0];
                if (AndroidVersion.isOverO()) {
                    allBytes = Files.readAllBytes(file.toPath());
                } else {
                    try {
                        FileInputStream fileInputStream = new FileInputStream(file);
                        try {
                            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                            byte[] bArr = new byte[4096];
                            while (true) {
                                int i12 = fileInputStream.read(bArr);
                                if (i12 == -1) {
                                    break;
                                } else {
                                    byteArrayOutputStream.write(bArr, 0, i12);
                                }
                                C34012x4.m75435a(th);
                                allBytes = byteArray;
                            }
                            byteArray = byteArrayOutputStream.toByteArray();
                            fileInputStream.close();
                        } catch (Throwable th3) {
                            try {
                                fileInputStream.close();
                                throw th3;
                            } catch (Throwable th4) {
                                th3.addSuppressed(th4);
                                throw th3;
                            }
                        }
                    } catch (Throwable th5) {
                        C34012x4.m75435a(th5);
                        allBytes = byteArray;
                        randomAccessFile = new RandomAccessFile(file, "rw");
                        try {
                            this.f71947b = randomAccessFile.getChannel();
                            str = i11 + "\t0\t0\t0000000000000000\t" + C33765l2.f70706I0 + "\t" + this.f71950e.f70745f + "\t" + this.f71950e.f70714F + "\t" + this.f71950e.f70755k + "\t" + this.f71950e.m73892o() + "\t" + this.f71950e.f70763o + "\tJAVA_CRASH#" + th2.getClass().getName() + "\t" + (((int) (System.currentTimeMillis() - this.f71950e.f70739c)) / 1000) + "\t" + this.f71950e.m73838K() + ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE;
                            if (allBytes == null) {
                                MappedByteBuffer map = this.f71947b.map(FileChannel.MapMode.READ_WRITE, 0L, str.length());
                                this.f71946a = map;
                                map.put(str.getBytes());
                                this.f71946a.force();
                            } else {
                                MappedByteBuffer map2 = this.f71947b.map(FileChannel.MapMode.READ_WRITE, 0L, str.length());
                                this.f71946a = map2;
                                map2.put(str.getBytes());
                                this.f71946a.force();
                            }
                            randomAccessFile.close();
                            this.f71948c = true;
                        } catch (Throwable th6) {
                            try {
                                randomAccessFile.close();
                                throw th6;
                            } catch (Throwable th7) {
                                th6.addSuppressed(th7);
                                throw th6;
                            }
                        }
                    }
                    allBytes = byteArray;
                }
                try {
                    randomAccessFile = new RandomAccessFile(file, "rw");
                    this.f71947b = randomAccessFile.getChannel();
                    str = i11 + "\t0\t0\t0000000000000000\t" + C33765l2.f70706I0 + "\t" + this.f71950e.f70745f + "\t" + this.f71950e.f70714F + "\t" + this.f71950e.f70755k + "\t" + this.f71950e.m73892o() + "\t" + this.f71950e.f70763o + "\tJAVA_CRASH#" + th2.getClass().getName() + "\t" + (((int) (System.currentTimeMillis() - this.f71950e.f70739c)) / 1000) + "\t" + this.f71950e.m73838K() + ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE;
                    if (allBytes == null && allBytes.length > 0) {
                        int length = allBytes.length + str.length();
                        FileChannel fileChannel = this.f71947b;
                        FileChannel.MapMode mapMode = FileChannel.MapMode.READ_WRITE;
                        MappedByteBuffer map3 = fileChannel.map(mapMode, 0L, length);
                        this.f71946a = map3;
                        map3.position(4);
                        ByteBuffer byteBufferSlice = this.f71946a.slice();
                        byteBufferSlice.limit(36);
                        if (AndroidVersion.isOverKitKat()) {
                            string = StandardCharsets.UTF_8.decode(byteBufferSlice).toString();
                        } else {
                            string = Charset.forName("UTF-8").decode(byteBufferSlice).toString();
                        }
                        if (string.equals(C33765l2.f70706I0)) {
                            this.f71949d = true;
                            this.f71947b.close();
                            randomAccessFile.close();
                            return;
                        } else {
                            this.f71946a.position(0);
                            this.f71946a.put(str.getBytes());
                            this.f71946a.position(str.length());
                            this.f71946a.put(allBytes);
                            this.f71946a.force();
                            this.f71946a = this.f71947b.map(mapMode, 0L, str.length());
                        }
                    } else {
                        MappedByteBuffer map4 = this.f71947b.map(FileChannel.MapMode.READ_WRITE, 0L, str.length());
                        this.f71946a = map4;
                        map4.put(str.getBytes());
                        this.f71946a.force();
                    }
                    randomAccessFile.close();
                } catch (Throwable th8) {
                    C34012x4.m75435a(th8);
                }
                this.f71948c = true;
            } catch (Throwable th9) {
                C34012x4.m75437b(C33799mf.m74131a("record processing file failed!\n", th9), new Object[0]);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public void m74985a(int i11, boolean z11, boolean z12) {
        if (z12 && this.f71948c && !this.f71949d) {
            try {
                MappedByteBuffer mappedByteBuffer = this.f71946a;
                if (mappedByteBuffer != null) {
                    mappedByteBuffer.put(0, Integer.toString(i11).getBytes()[0]);
                    if (z11) {
                        this.f71946a.put(2, BuiltinOptions.TransposeConvOptions);
                    }
                    this.f71946a.force();
                }
            } catch (Exception e11) {
                C34012x4.m75437b("update processing file failed!\n" + e11, new Object[0]);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public void m74983a(int i11, boolean z11) {
        if (!z11 || !this.f71948c || this.f71949d || i11 < 0 || i11 >= 16) {
            return;
        }
        try {
            MappedByteBuffer mappedByteBuffer = this.f71946a;
            if (mappedByteBuffer != null) {
                mappedByteBuffer.put(i11 + 6, BuiltinOptions.TransposeConvOptions);
                this.f71946a.force();
            }
        } catch (Throwable th2) {
            C34012x4.m75437b(C33799mf.m74131a("update attachment info in processing record failed, ", th2), new Object[0]);
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m74982a(Context context) {
        C33784m0.m74004c().m74006a(new a(context));
    }
}
