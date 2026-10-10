package jumio.core;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.ParcelFileDescriptor;
import android.system.Os;
import android.system.OsConstants;
import com.jumio.commons.utils.BitmapUtilKt;
import com.jumio.core.C9301R;
import com.jumio.core.MobileContext;
import com.jumio.core.constants.ConstantsKt;
import com.jumio.core.environment.Environment;
import com.jumio.core.models.AuthorizationModel;
import com.jumio.core.scanpart.ImageUploadFile$Companion;
import com.jumio.sdk.retry.JumioRetryReason;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Locale;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.StringCompanionObject;
import p852kotlin.p407io.CloseableKt;

/* JADX INFO: renamed from: jumio.core.S1 */
/* JADX INFO: loaded from: classes61.dex */
public final class C40592S1 implements InterfaceC40614W3 {

    /* JADX INFO: renamed from: e */
    public static final ImageUploadFile$Companion f90115e = new ImageUploadFile$Companion(null);

    /* JADX INFO: renamed from: a */
    public final ParcelFileDescriptor f90116a;

    /* JADX INFO: renamed from: b */
    public final long f90117b;

    /* JADX INFO: renamed from: c */
    public final String f90118c;

    /* JADX INFO: renamed from: d */
    public final String f90119d;

    @Override // jumio.core.InterfaceC40614W3
    /* JADX INFO: renamed from: a */
    public final JumioRetryReason mo89185a(int i11, int i12, MobileContext context) throws IOException {
        Intrinsics.checkNotNullParameter(context, "context");
        if (this.f90117b > i11) {
            String string = context.getString(C9301R.string.jumio_dv_retry_maximum_size_limit_exceeded);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            return new JumioRetryReason(404, string);
        }
        ParcelFileDescriptor parcelFileDescriptorDup = this.f90116a.dup();
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeFileDescriptor(parcelFileDescriptorDup.getFileDescriptor(), null, options);
            if (options.outWidth <= 0 || options.outHeight <= 0) {
                throw new SecurityException("Selected image file cannot be processed");
            }
            CloseableKt.closeFinally(parcelFileDescriptorDup, null);
            return null;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                CloseableKt.closeFinally(parcelFileDescriptorDup, th2);
                throw th3;
            }
        }
    }

    @Override // jumio.core.InterfaceC40614W3
    /* JADX INFO: renamed from: b */
    public final Bitmap mo89188b() throws IOException {
        Bitmap bitmapDecodeFileDescriptor;
        ParcelFileDescriptor parcelFileDescriptorDup = this.f90116a.dup();
        try {
            Os.lseek(parcelFileDescriptorDup.getFileDescriptor(), 0L, OsConstants.SEEK_SET);
            bitmapDecodeFileDescriptor = BitmapFactory.decodeFileDescriptor(parcelFileDescriptorDup.getFileDescriptor());
        } catch (Exception unused) {
            bitmapDecodeFileDescriptor = null;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                CloseableKt.closeFinally(parcelFileDescriptorDup, th2);
                throw th3;
            }
        }
        CloseableKt.closeFinally(parcelFileDescriptorDup, null);
        return bitmapDecodeFileDescriptor;
    }

    @Override // jumio.core.InterfaceC40614W3
    /* JADX INFO: renamed from: c */
    public final void mo89189c() {
        try {
            this.f90116a.close();
        } catch (Exception unused) {
        }
    }

    @Override // jumio.core.InterfaceC40614W3
    public final String getMimeType() {
        return this.f90118c;
    }

    public C40592S1(ParcelFileDescriptor parcelFileDescriptor, EnumC40587R1 enumC40587R1) {
        this.f90116a = parcelFileDescriptor;
        this.f90117b = Os.fstat(parcelFileDescriptor.getFileDescriptor()).st_size;
        this.f90118c = enumC40587R1.f90107a;
        this.f90119d = enumC40587R1.f90108b;
    }

    @Override // jumio.core.InterfaceC40614W3
    /* JADX INFO: renamed from: a */
    public final String mo89187a() {
        return this.f90119d;
    }

    @Override // jumio.core.InterfaceC40614W3
    /* JADX INFO: renamed from: a */
    public final File mo89186a(ParcelFileDescriptor fileDescriptor, AuthorizationModel.SessionKey sessionKey, MobileContext context) throws Exception {
        Intrinsics.checkNotNullParameter(fileDescriptor, "fileDescriptor");
        Intrinsics.checkNotNullParameter(sessionKey, "sessionKey");
        Intrinsics.checkNotNullParameter(context, "context");
        File dataDirectory = Environment.INSTANCE.getDataDirectory(context);
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str = String.format(Locale.ENGLISH, "%s%d", Arrays.copyOf(new Object[]{ConstantsKt.TEMP_FILE_PREFIX, Long.valueOf(System.currentTimeMillis())}, 2));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        File file = new File(dataDirectory, str);
        Bitmap bitmapMo89188b = mo89188b();
        if (bitmapMo89188b != null) {
            BitmapUtilKt.saveBitmap(bitmapMo89188b, file, BitmapUtilKt.getWebpFormat(), 85, sessionKey);
            bitmapMo89188b.recycle();
            return file;
        }
        throw new Exception("Could not decode image");
    }
}
