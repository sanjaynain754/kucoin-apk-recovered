package com.jumio.core.extraction.barcode.model;

import com.google.zxing.integration.android.IntentIntegrator;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.enums.EnumEntries;
import p852kotlin.enums.EnumEntriesKt;

/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m90084d2 = {"Lcom/jumio/core/extraction/barcode/model/BarcodeFormat;", "", "<init>", "(Ljava/lang/String;I)V", IntentIntegrator.PDF_417, IntentIntegrator.QR_CODE, "jumio-barcode_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public enum BarcodeFormat {
    PDF_417,
    QR_CODE;

    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries(values());

    @NotNull
    public static EnumEntries<BarcodeFormat> getEntries() {
        return $ENTRIES;
    }
}
