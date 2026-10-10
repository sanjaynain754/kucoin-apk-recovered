package jumio.core;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.pdf.PdfRenderer;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import com.jumio.commons.utils.FileUtil;
import com.jumio.core.C9301R;
import com.jumio.core.MobileContext;
import com.jumio.core.constants.ConstantsKt;
import com.jumio.core.environment.Environment;
import com.jumio.core.models.AuthorizationModel;
import com.jumio.core.util.ByteArrayUtilKt;
import com.jumio.sdk.retry.JumioRetryReason;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Locale;
import p852kotlin.jdk7.AutoCloseableKt;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.StringCompanionObject;
import p852kotlin.p407io.CloseableKt;

/* JADX INFO: renamed from: jumio.core.H2 */
/* JADX INFO: loaded from: classes61.dex */
public final class C40539H2 implements InterfaceC40614W3 {

    /* JADX INFO: renamed from: a */
    public final ParcelFileDescriptor f89999a;

    /* JADX INFO: renamed from: b */
    public final long f90000b;

    /* JADX INFO: renamed from: c */
    public final String f90001c;

    /* JADX INFO: renamed from: d */
    public final String f90002d;

    /* JADX INFO: renamed from: e */
    public final byte[] f90003e;

    @Override // jumio.core.InterfaceC40614W3
    /* JADX INFO: renamed from: a */
    public final JumioRetryReason mo89185a(int i11, int i12, MobileContext context) throws IOException, ErrnoException {
        JumioRetryReason jumioRetryReason;
        Intrinsics.checkNotNullParameter(context, "context");
        long j11 = this.f90000b;
        if (j11 > i11) {
            String string = context.getString(C9301R.string.jumio_dv_retry_maximum_size_limit_exceeded);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            return new JumioRetryReason(404, string);
        }
        byte[] bArr = new byte[1024];
        int iMin = (int) Math.min(1024, j11);
        Os.pread(this.f89999a.getFileDescriptor(), bArr, 0, iMin, Math.max(0L, this.f90000b - ((long) iMin)));
        if (ByteArrayUtilKt.findSequence$default(bArr, this.f90003e, 0, 2, null) != -1) {
            throw new SecurityException("PDF Encrypted");
        }
        ParcelFileDescriptor parcelFileDescriptorDup = this.f89999a.dup();
        try {
            PdfRenderer pdfRenderer = new PdfRenderer(parcelFileDescriptorDup);
            try {
                if (pdfRenderer.getPageCount() > i12) {
                    String string2 = context.getString(C9301R.string.jumio_dv_retry_page_limit);
                    Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                    jumioRetryReason = new JumioRetryReason(403, string2);
                } else {
                    jumioRetryReason = null;
                }
                AutoCloseableKt.closeFinally(pdfRenderer, null);
                CloseableKt.closeFinally(parcelFileDescriptorDup, null);
                return jumioRetryReason;
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    AutoCloseableKt.closeFinally(pdfRenderer, th2);
                    throw th3;
                }
            }
        } catch (Throwable th4) {
            try {
                throw th4;
            } catch (Throwable th5) {
                CloseableKt.closeFinally(parcelFileDescriptorDup, th4);
                throw th5;
            }
        }
    }

    public C40539H2(ParcelFileDescriptor fileDescriptor) {
        Intrinsics.checkNotNullParameter(fileDescriptor, "fileDescriptor");
        this.f89999a = fileDescriptor;
        this.f90000b = Os.fstat(fileDescriptor.getFileDescriptor()).st_size;
        this.f90001c = ConstantsKt.MIME_TYPE_PDF;
        this.f90002d = "PDF";
        this.f90003e = ByteArrayUtilKt.byteArrayOfInts(47, 69, 110, 99, 114, 121, 112, 116);
    }

    @Override // jumio.core.InterfaceC40614W3
    /* JADX INFO: renamed from: b */
    public final Bitmap mo89188b() throws IOException {
        Bitmap bitmapCreateBitmap;
        ParcelFileDescriptor parcelFileDescriptorDup = this.f89999a.dup();
        try {
            PdfRenderer.Page pageOpenPage = new PdfRenderer(parcelFileDescriptorDup).openPage(0);
            try {
                bitmapCreateBitmap = Bitmap.createBitmap(pageOpenPage.getWidth() * 2, pageOpenPage.getHeight() * 2, Bitmap.Config.ARGB_8888);
                new Canvas(bitmapCreateBitmap).drawColor(-1);
                pageOpenPage.render(bitmapCreateBitmap, null, null, 1);
                AutoCloseableKt.closeFinally(pageOpenPage, null);
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    AutoCloseableKt.closeFinally(pageOpenPage, th2);
                    throw th3;
                }
            }
        } catch (Exception unused) {
            bitmapCreateBitmap = null;
        } catch (Throwable th4) {
            try {
                throw th4;
            } catch (Throwable th5) {
                CloseableKt.closeFinally(parcelFileDescriptorDup, th4);
                throw th5;
            }
        }
        CloseableKt.closeFinally(parcelFileDescriptorDup, null);
        return bitmapCreateBitmap;
    }

    @Override // jumio.core.InterfaceC40614W3
    /* JADX INFO: renamed from: c */
    public final void mo89189c() {
        try {
            this.f89999a.close();
        } catch (Exception unused) {
        }
    }

    @Override // jumio.core.InterfaceC40614W3
    public final String getMimeType() {
        return this.f90001c;
    }

    @Override // jumio.core.InterfaceC40614W3
    /* JADX INFO: renamed from: a */
    public final String mo89187a() {
        return this.f90002d;
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
        Os.lseek(fileDescriptor.getFileDescriptor(), 0L, OsConstants.SEEK_SET);
        if (FileUtil.INSTANCE.saveToFile(new FileInputStream(fileDescriptor.getFileDescriptor()), file, sessionKey)) {
            return file;
        }
        throw new Exception("Could not save file");
    }
}
