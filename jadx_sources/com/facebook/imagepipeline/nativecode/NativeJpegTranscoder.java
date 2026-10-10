package com.facebook.imagepipeline.nativecode;

import android.graphics.ColorSpace;
import androidx.annotation.VisibleForTesting;
import com.facebook.imageformat.ImageFormat;
import com.facebook.imagepipeline.common.ResizeOptions;
import com.facebook.imagepipeline.common.RotationOptions;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import p223e6.C37076a;
import p223e6.C37077b;
import p223e6.C37080e;
import p223e6.InterfaceC37078c;
import p422l5.C42054a;
import p712w3.C45702b;
import p712w3.C45708h;
import p712w3.InterfaceC45704d;
import p749x5.C46075i;

/* JADX INFO: loaded from: classes34.dex */
@InterfaceC45704d
public class NativeJpegTranscoder implements InterfaceC37078c {

    /* JADX INFO: renamed from: a */
    public boolean f9174a;

    /* JADX INFO: renamed from: b */
    public int f9175b;

    /* JADX INFO: renamed from: c */
    public boolean f9176c;

    @InterfaceC45704d
    private static native void nativeTranscodeJpeg(InputStream inputStream, OutputStream outputStream, int i11, int i12, int i13) throws IOException;

    @InterfaceC45704d
    private static native void nativeTranscodeJpegWithExifOrientation(InputStream inputStream, OutputStream outputStream, int i11, int i12, int i13) throws IOException;

    @Override // p223e6.InterfaceC37078c
    /* JADX INFO: renamed from: a */
    public boolean mo9509a(C46075i c46075i, RotationOptions rotationOptions, ResizeOptions resizeOptions) {
        if (rotationOptions == null) {
            rotationOptions = RotationOptions.m9190d();
        }
        return C37080e.m82994f(rotationOptions, resizeOptions, c46075i, this.f9174a) < 8;
    }

    @Override // p223e6.InterfaceC37078c
    /* JADX INFO: renamed from: b */
    public C37077b mo9510b(C46075i c46075i, OutputStream outputStream, RotationOptions rotationOptions, ResizeOptions resizeOptions, ImageFormat imageFormat, Integer num, ColorSpace colorSpace) throws IOException {
        if (num == null) {
            num = 85;
        }
        if (rotationOptions == null) {
            rotationOptions = RotationOptions.m9190d();
        }
        int iM82984b = C37076a.m82984b(rotationOptions, resizeOptions, c46075i, this.f9175b);
        try {
            int iM82994f = C37080e.m82994f(rotationOptions, resizeOptions, c46075i, this.f9174a);
            int iM82990a = C37080e.m82990a(iM82984b);
            if (this.f9176c) {
                iM82994f = iM82990a;
            }
            InputStream inputStreamM101579n = c46075i.m101579n();
            if (C37080e.INVERTED_EXIF_ORIENTATIONS.contains(Integer.valueOf(c46075i.m101583t()))) {
                m9508e((InputStream) C45708h.m100897h(inputStreamM101579n, "Cannot transcode from null input stream!"), outputStream, C37080e.m82992d(rotationOptions, c46075i), iM82994f, num.intValue());
            } else {
                m9507d((InputStream) C45708h.m100897h(inputStreamM101579n, "Cannot transcode from null input stream!"), outputStream, C37080e.m82993e(rotationOptions, c46075i), iM82994f, num.intValue());
            }
            C45702b.m100881b(inputStreamM101579n);
            return new C37077b(iM82984b != 1 ? 0 : 1);
        } catch (Throwable th2) {
            C45702b.m100881b(null);
            throw th2;
        }
    }

    @Override // p223e6.InterfaceC37078c
    /* JADX INFO: renamed from: c */
    public boolean mo9511c(ImageFormat imageFormat) {
        return imageFormat == C42054a.com.jumio.core.constants.ConstantsKt.FILE_TYPE_JPEG java.lang.String;
    }

    @Override // p223e6.InterfaceC37078c
    public String getIdentifier() {
        return "NativeJpegTranscoder";
    }

    public NativeJpegTranscoder(boolean z11, int i11, boolean z12, boolean z13) {
        this.f9174a = z11;
        this.f9175b = i11;
        this.f9176c = z12;
        if (z13) {
            C5663d.m9515a();
        }
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: d */
    public static void m9507d(InputStream inputStream, OutputStream outputStream, int i11, int i12, int i13) throws IOException {
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        C5663d.m9515a();
        boolean z15 = false;
        if (i12 >= 1) {
            z11 = true;
        } else {
            z11 = false;
        }
        C45708h.m100891b(Boolean.valueOf(z11));
        if (i12 <= 16) {
            z12 = true;
        } else {
            z12 = false;
        }
        C45708h.m100891b(Boolean.valueOf(z12));
        if (i13 >= 0) {
            z13 = true;
        } else {
            z13 = false;
        }
        C45708h.m100891b(Boolean.valueOf(z13));
        if (i13 <= 100) {
            z14 = true;
        } else {
            z14 = false;
        }
        C45708h.m100891b(Boolean.valueOf(z14));
        C45708h.m100891b(Boolean.valueOf(C37080e.m82997j(i11)));
        if (i12 != 8 || i11 != 0) {
            z15 = true;
        }
        C45708h.m100892c(z15, "no transformation requested");
        nativeTranscodeJpeg((InputStream) C45708h.m100896g(inputStream), (OutputStream) C45708h.m100896g(outputStream), i11, i12, i13);
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: e */
    public static void m9508e(InputStream inputStream, OutputStream outputStream, int i11, int i12, int i13) throws IOException {
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        C5663d.m9515a();
        boolean z15 = false;
        if (i12 >= 1) {
            z11 = true;
        } else {
            z11 = false;
        }
        C45708h.m100891b(Boolean.valueOf(z11));
        if (i12 <= 16) {
            z12 = true;
        } else {
            z12 = false;
        }
        C45708h.m100891b(Boolean.valueOf(z12));
        if (i13 >= 0) {
            z13 = true;
        } else {
            z13 = false;
        }
        C45708h.m100891b(Boolean.valueOf(z13));
        if (i13 <= 100) {
            z14 = true;
        } else {
            z14 = false;
        }
        C45708h.m100891b(Boolean.valueOf(z14));
        C45708h.m100891b(Boolean.valueOf(C37080e.m82996i(i11)));
        if (i12 != 8 || i11 != 1) {
            z15 = true;
        }
        C45708h.m100892c(z15, "no transformation requested");
        nativeTranscodeJpegWithExifOrientation((InputStream) C45708h.m100896g(inputStream), (OutputStream) C45708h.m100896g(outputStream), i11, i12, i13);
    }
}
