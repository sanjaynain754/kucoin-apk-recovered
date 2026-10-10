package com.jumio.core.models;

import com.jumio.commons.PersistWith;
import com.jumio.core.data.ScanMode;
import com.jumio.core.extraction.liveness.extraction.LivenessDataModel;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\n"}, m90084d2 = {"Lcom/jumio/core/models/AuthenticationScanPartModel;", "Lcom/jumio/core/models/LivenessScanPartModel;", "mode", "Lcom/jumio/core/data/ScanMode;", "isFallbackEnabled", "", "<init>", "(Lcom/jumio/core/data/ScanMode;Z)V", "isComplete", "()Z", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@PersistWith("AuthenticationScanPartModel")
public final class AuthenticationScanPartModel extends LivenessScanPartModel {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuthenticationScanPartModel(@NotNull ScanMode mode, boolean z11) {
        super(mode, z11);
        Intrinsics.checkNotNullParameter(mode, "mode");
    }

    @Override // com.jumio.core.models.FaceScanPartModel, com.jumio.core.models.ScanPartModel
    public final boolean isComplete() {
        Boolean f14116e;
        LivenessDataModel f14243l = getF14243l();
        if (f14243l != null) {
            f14116e = f14243l.getF14116e();
        } else {
            f14116e = null;
        }
        if (f14116e != null) {
            return true;
        }
        return false;
    }
}
