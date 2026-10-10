package p418l1;

import android.util.Pair;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.WorkerThread;
import com.airbnb.lottie.network.FileExtension;
import com.tencent.bugly.proguard.C33978va;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import p484o1.C42924f;

/* JADX INFO: renamed from: l1.f */
/* JADX INFO: compiled from: NetworkCache.java */
/* JADX INFO: loaded from: classes34.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class C42022f {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final InterfaceC42020d f92211a;

    /* JADX INFO: renamed from: d */
    public static String m92124d(String str, int i11) {
        try {
            byte[] bArrDigest = MessageDigest.getInstance("MD5").digest(str.getBytes());
            StringBuilder sb2 = new StringBuilder();
            for (byte b11 : bArrDigest) {
                sb2.append(String.format("%02x", Byte.valueOf(b11)));
            }
            return sb2.toString();
        } catch (NoSuchAlgorithmException unused) {
            return str.substring(0, i11);
        }
    }

    @Nullable
    @WorkerThread
    /* JADX INFO: renamed from: a */
    public Pair<FileExtension, InputStream> m92125a(String str) {
        FileExtension fileExtension;
        try {
            File fileM92126c = m92126c(str);
            if (fileM92126c == null) {
                return null;
            }
            FileInputStream fileInputStream = new FileInputStream(fileM92126c);
            if (fileM92126c.getAbsolutePath().endsWith(".zip")) {
                fileExtension = FileExtension.ZIP;
            } else {
                fileExtension = fileM92126c.getAbsolutePath().endsWith(".gz") ? FileExtension.GZIP : FileExtension.JSON;
            }
            C42924f.m94156a("Cache hit for " + str + " at " + fileM92126c.getAbsolutePath());
            return new Pair<>(fileExtension, fileInputStream);
        } catch (FileNotFoundException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: f */
    public void m92128f(String str, FileExtension fileExtension) {
        File file = new File(m92127e(), m92123b(str, fileExtension, true));
        File file2 = new File(file.getAbsolutePath().replace(".temp", ""));
        boolean zRenameTo = file.renameTo(file2);
        C42924f.m94156a("Copying temp file to real file (" + file2 + ")");
        if (zRenameTo) {
            return;
        }
        C42924f.m94158c("Unable to rename cache file " + file.getAbsolutePath() + " to " + file2.getAbsolutePath() + C33978va.f72339h);
    }

    /* JADX INFO: renamed from: g */
    public File m92129g(String str, InputStream inputStream, FileExtension fileExtension) throws IOException {
        File file = new File(m92127e(), m92123b(str, fileExtension, true));
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                byte[] bArr = new byte[1024];
                while (true) {
                    int i11 = inputStream.read(bArr);
                    if (i11 == -1) {
                        fileOutputStream.flush();
                        fileOutputStream.close();
                        inputStream.close();
                        return file;
                    }
                    fileOutputStream.write(bArr, 0, i11);
                }
            } catch (Throwable th2) {
                fileOutputStream.close();
                throw th2;
            }
        } catch (Throwable th3) {
            inputStream.close();
            throw th3;
        }
    }

    /* JADX INFO: renamed from: b */
    public static String m92123b(String str, FileExtension fileExtension, boolean z11) {
        String strTempExtension = z11 ? fileExtension.tempExtension() : fileExtension.extension;
        String strReplaceAll = str.replaceAll("\\W+", "");
        int length = 242 - strTempExtension.length();
        if (strReplaceAll.length() > length) {
            strReplaceAll = m92124d(strReplaceAll, length);
        }
        return "lottie_cache_" + strReplaceAll + strTempExtension;
    }

    @Nullable
    /* JADX INFO: renamed from: c */
    public final File m92126c(String str) throws FileNotFoundException {
        File file = new File(m92127e(), m92123b(str, FileExtension.JSON, false));
        if (file.exists()) {
            return file;
        }
        File file2 = new File(m92127e(), m92123b(str, FileExtension.ZIP, false));
        if (file2.exists()) {
            return file2;
        }
        File file3 = new File(m92127e(), m92123b(str, FileExtension.GZIP, false));
        if (file3.exists()) {
            return file3;
        }
        return null;
    }

    /* JADX INFO: renamed from: e */
    public final File m92127e() {
        File fileMo5640a = this.f92211a.mo5640a();
        if (fileMo5640a.isFile()) {
            fileMo5640a.delete();
        }
        if (!fileMo5640a.exists()) {
            fileMo5640a.mkdirs();
        }
        return fileMo5640a;
    }

    public C42022f(@NonNull InterfaceC42020d interfaceC42020d) {
        this.f92211a = interfaceC42020d;
    }
}
