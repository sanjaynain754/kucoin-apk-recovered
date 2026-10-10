package com.jumio.core.extraction.barcode.vision;

import android.app.Activity;
import android.app.Dialog;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.mlkit.vision.barcode.BarcodeScannerOptions;
import com.google.mlkit.vision.barcode.BarcodeScanning;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.enums.EnumEntries;
import p852kotlin.enums.EnumEntriesKt;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\nB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t¨\u0006\u000b"}, m90084d2 = {"Lcom/jumio/core/extraction/barcode/vision/GoogleVision;", "", "<init>", "()V", "isOperational", "Lcom/jumio/core/extraction/barcode/vision/GoogleVision$Status;", "activity", "Landroid/app/Activity;", "requestCode", "", "Status", "jumio-barcode_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class GoogleVision {

    @NotNull
    public static final GoogleVision INSTANCE = new GoogleVision();

    @Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m90084d2 = {"Lcom/jumio/core/extraction/barcode/vision/GoogleVision$Status;", "", "<init>", "(Ljava/lang/String;I)V", "OPERATIONAL", "NOT_OPERATIONAL", "DIALOG_PENDING", "jumio-barcode_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public enum Status {
        OPERATIONAL,
        NOT_OPERATIONAL,
        DIALOG_PENDING;

        private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries(values());

        @NotNull
        public static EnumEntries<Status> getEntries() {
            return $ENTRIES;
        }
    }

    @NotNull
    public final Status isOperational(@NotNull Activity activity, int requestCode) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        try {
            GoogleApiAvailability googleApiAvailability = GoogleApiAvailability.getInstance();
            Intrinsics.checkNotNullExpressionValue(googleApiAvailability, "getInstance(...)");
            int iIsGooglePlayServicesAvailable = googleApiAvailability.isGooglePlayServicesAvailable(activity);
            if (iIsGooglePlayServicesAvailable == 0) {
                BarcodeScannerOptions barcodeScannerOptionsBuild = new BarcodeScannerOptions.Builder().setBarcodeFormats(2048, -1).build();
                Intrinsics.checkNotNullExpressionValue(barcodeScannerOptionsBuild, "build(...)");
                BarcodeScanning.getClient(barcodeScannerOptionsBuild).close();
                return Status.OPERATIONAL;
            }
            if (!googleApiAvailability.isUserResolvableError(iIsGooglePlayServicesAvailable)) {
                return Status.NOT_OPERATIONAL;
            }
            Dialog errorDialog = googleApiAvailability.getErrorDialog(activity, iIsGooglePlayServicesAvailable, requestCode);
            if (errorDialog != null) {
                errorDialog.setCancelable(false);
                errorDialog.show();
            }
            return Status.DIALOG_PENDING;
        } catch (Exception unused) {
            return Status.NOT_OPERATIONAL;
        }
    }

    private GoogleVision() {
    }
}
