package p027b;

import aai.telemetry.enums.MonitorType;
import android.content.Context;
import java.io.File;
import java.io.FileOutputStream;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: renamed from: b.d */
/* JADX INFO: loaded from: classes23.dex */
public abstract class AbstractC4406d {

    /* JADX INFO: renamed from: a */
    public final MonitorType f3843a = mo4059c();

    /* JADX INFO: renamed from: b */
    public ExecutorService f3844b = Executors.newCachedThreadPool();

    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public File m4068d(String str, byte[] bArr, Context context) {
        if (bArr == null) {
            return null;
        }
        try {
            String str2 = str.toLowerCase(Locale.ENGLISH) + "_" + System.currentTimeMillis() + this.f3843a.fileExtension;
            File file = new File(context.getFilesDir(), this.f3843a.fileDir);
            if (!file.exists()) {
                file.mkdirs();
            }
            File file2 = new File(file, str2);
            FileOutputStream fileOutputStream = new FileOutputStream(file2);
            fileOutputStream.write(bArr);
            fileOutputStream.close();
            return file2;
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: c */
    public abstract MonitorType mo4059c();

    /* JADX INFO: renamed from: e */
    public void m4069e(final String str, final byte[] bArr, final Context context) {
        this.f3844b.submit(new Runnable() { // from class: b.c
            @Override // java.lang.Runnable
            public final void run() {
                this.f3839b.m4068d(str, bArr, context);
            }
        });
    }
}
