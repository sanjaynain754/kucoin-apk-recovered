package com.jumio.core.scanpart;

import com.jumio.core.data.ScanMode;
import com.jumio.core.models.DigitalIdScanPartModel;
import com.jumio.core.models.ScanPartModel;
import jumio.core.AbstractC40756y3;
import jumio.core.EnumC40613W2;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\"\u0018\u0010\u0000\u001a\u00020\u0001*\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0018\u0010\u0000\u001a\u00020\u0001*\u00020\u00058BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0006¨\u0006\u0007"}, m90084d2 = {"pluginModule", "Lcom/jumio/core/plugins/PluginModule;", "Lcom/jumio/core/data/ScanMode;", "getPluginModule", "(Lcom/jumio/core/data/ScanMode;)Lcom/jumio/core/plugins/PluginModule;", "Lcom/jumio/core/models/ScanPartModel;", "(Lcom/jumio/core/models/ScanPartModel;)Lcom/jumio/core/plugins/PluginModule;", "jumio-core_release"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class ScanPartKt {
    @NotNull
    public static final EnumC40613W2 getPluginModule(@NotNull ScanMode scanMode) {
        Intrinsics.checkNotNullParameter(scanMode, "<this>");
        switch (AbstractC40756y3.f90486a[scanMode.ordinal()]) {
            case 1:
                return EnumC40613W2.DOCFINDER;
            case 2:
                return EnumC40613W2.BARCODE_NATIVE;
            case 3:
                return EnumC40613W2.FACE_MANUAL;
            case 4:
                return EnumC40613W2.MANUAL;
            case 5:
                return EnumC40613W2.NFC;
            case 6:
            case 7:
                return EnumC40613W2.JUMIO_LIVENESS;
            case 8:
                return EnumC40613W2.MANUAL;
            case 9:
                return EnumC40613W2.DIGITAL_IDENTITY;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final EnumC40613W2 access$getPluginModule(ScanPartModel scanPartModel) {
        if (scanPartModel.getF14313b() == ScanMode.FILE && (scanPartModel instanceof DigitalIdScanPartModel)) {
            return EnumC40613W2.DIGITAL_IDENTITY;
        }
        return getPluginModule(scanPartModel.getF14313b());
    }
}
