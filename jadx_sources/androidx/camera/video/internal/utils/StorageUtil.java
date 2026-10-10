package androidx.camera.video.internal.utils;

import android.net.Uri;
import android.os.Environment;
import android.os.StatFs;
import androidx.camera.core.Logger;
import com.tencent.bugly.proguard.C33627eb;
import java.io.File;
import java.io.FileNotFoundException;
import java.text.DecimalFormat;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;

/* JADX INFO: compiled from: StorageUtil.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0007J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0005H\u0007J\u0010\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\rH\u0007J\u0010\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0007H\u0007J\u0014\u0010\u0010\u001a\u00020\u00112\n\u0010\u0012\u001a\u00060\u0013j\u0002`\u0014H\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0015"}, m90084d2 = {"Landroidx/camera/video/internal/utils/StorageUtil;", "", "<init>", "()V", "TAG", "", "getAvailableBytes", "", "file", "Ljava/io/File;", "path", "getAvailableBytesForMediaStoreUri", "uri", "Landroid/net/Uri;", "formatSize", "bytes", "isStorageFullException", "", "e", "Ljava/lang/Exception;", "Lkotlin/Exception;", "camera-video_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nStorageUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StorageUtil.kt\nandroidx/camera/video/internal/utils/StorageUtil\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,132:1\n1#2:133\n*E\n"})
public final class StorageUtil {

    @NotNull
    public static final StorageUtil INSTANCE = new StorageUtil();

    @NotNull
    private static final String TAG = "StorageUtil";

    @JvmStatic
    public static final long getAvailableBytes(@NotNull File file) {
        Intrinsics.checkNotNullParameter(file, "file");
        String path = file.getPath();
        Intrinsics.checkNotNullExpressionValue(path, "getPath(...)");
        return getAvailableBytes(path);
    }

    @JvmStatic
    @NotNull
    public static final String formatSize(long bytes) {
        if (bytes < 0) {
            throw new IllegalArgumentException("Bytes cannot be negative");
        }
        String[] strArr = {"B", "KB", "MB", "GB", "TB"};
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        double d11 = bytes;
        int i11 = 0;
        double d12 = d11;
        while (d12 >= 1024.0d && i11 < 4) {
            d12 /= 1024.0d;
            i11++;
        }
        if (i11 == 0) {
            return decimalFormat.format(d12) + ' ' + strArr[i11];
        }
        StringBuilder sb2 = new StringBuilder();
        while (-1 < i11) {
            double dPow = Math.pow(1024.0d, i11);
            double dFloor = Math.floor(d11 / dPow);
            if (dFloor > 0.0d) {
                sb2.append(decimalFormat.format(dFloor));
                sb2.append(C33627eb.f69716f);
                sb2.append(strArr[i11]);
                sb2.append(C33627eb.f69716f);
                d11 -= dFloor * dPow;
            }
            i11--;
        }
        return StringsKt.trim(sb2).toString();
    }

    @JvmStatic
    public static final long getAvailableBytes(@NotNull String path) {
        Intrinsics.checkNotNullParameter(path, "path");
        return new StatFs(path).getAvailableBytes();
    }

    @JvmStatic
    public static final boolean isStorageFullException(@NotNull Exception e11) {
        String message;
        Intrinsics.checkNotNullParameter(e11, "e");
        return (e11 instanceof FileNotFoundException) && (message = e11.getMessage()) != null && StringsKt.contains$default((CharSequence) message, (CharSequence) "No space left on device", false, 2, (Object) null);
    }

    private StorageUtil() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0050, code lost:
    
        if (r0.equals("external") == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0059, code lost:
    
        if (r0.equals("external_primary") != false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x005b, code lost:
    
        r3 = android.os.Environment.getExternalStorageDirectory();
        p852kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, "getExternalStorageDirectory(...)");
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0068, code lost:
    
        return getAvailableBytes(r3);
     */
    @JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final long getAvailableBytesForMediaStoreUri(@NotNull Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        if (Intrinsics.areEqual(uri.getScheme(), "content")) {
            String str = uri.getPathSegments().get(0);
            if (str != null) {
                int iHashCode = str.hashCode();
                if (iHashCode != -1921573490) {
                    if (iHashCode != -1820761141) {
                        if (iHashCode == 570410685 && str.equals("internal")) {
                            File dataDirectory = Environment.getDataDirectory();
                            Intrinsics.checkNotNullExpressionValue(dataDirectory, "getDataDirectory(...)");
                            return getAvailableBytes(dataDirectory);
                        }
                    }
                }
            }
            Logger.m1872w(TAG, "Unknown MediaStore URI: " + uri);
            return Long.MAX_VALUE;
        }
        throw new IllegalStateException(("Not a content uri: " + uri).toString());
    }
}
