package com.jumio.core.extraction.barcode.scanner;

import com.jumio.core.extraction.barcode.model.BarcodeFormat;
import p852kotlin.Metadata;
import p852kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\r\u001a\u00020\f*\u00020\u000eH\u0002\u001a\f\u0010\u000f\u001a\u00020\u000e*\u00020\u0010H\u0002\"\u000e\u0010\u000b\u001a\u00020\fX\u0082T¢\u0006\u0002\n\u0000*<\b\u0002\u0010\u0000\"\u001a\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0004\u0012\u00020\u00050\u00012\u001a\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0004\u0012\u00020\u00050\u0001*4\b\u0002\u0010\u0006\"\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u0002`\u0007\u0012\u0004\u0012\u00020\u00050\u00012\u0018\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\bj\u0002`\u0007\u0012\u0004\u0012\u00020\u00050\u0001*$\b\u0002\u0010\t\"\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\n2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\n¨\u0006\u0011"}, m90084d2 = {"SuccessListener", "Lkotlin/Function2;", "", "", "Lcom/jumio/core/extraction/barcode/model/Barcode;", "", "ErrorListener", "Lkotlin/Exception;", "Ljava/lang/Exception;", "CompletionListener", "Lkotlin/Function1;", "TAG", "", "asString", "", "asVisionFormat", "Lcom/jumio/core/extraction/barcode/model/BarcodeFormat;", "jumio-barcode_release"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class GoogleVisionScannerKt {

    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[BarcodeFormat.values().length];
            try {
                iArr[BarcodeFormat.PDF_417.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BarcodeFormat.QR_CODE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final String access$asString(int i11) {
        if (i11 != 256) {
            return i11 != 2048 ? "UNKNOWN" : "PDF417";
        }
        return "QR";
    }

    public static final int access$asVisionFormat(BarcodeFormat barcodeFormat) {
        int i11 = WhenMappings.$EnumSwitchMapping$0[barcodeFormat.ordinal()];
        if (i11 == 1) {
            return 2048;
        }
        if (i11 == 2) {
            return 256;
        }
        throw new NoWhenBranchMatchedException();
    }
}
