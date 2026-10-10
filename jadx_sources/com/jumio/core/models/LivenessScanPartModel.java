package com.jumio.core.models;

import com.jumio.commons.PersistWith;
import com.jumio.core.data.ScanMode;
import com.jumio.core.data.scan.DataState;
import com.jumio.core.extraction.liveness.extraction.LivenessDataModel;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0017\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\bR\u001a\u0010\t\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\b\"\u0004\b\n\u0010\u000bR$\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\r@TX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, m90084d2 = {"Lcom/jumio/core/models/LivenessScanPartModel;", "Lcom/jumio/core/models/FaceScanPartModel;", "mode", "Lcom/jumio/core/data/ScanMode;", "isFallbackEnabled", "", "<init>", "(Lcom/jumio/core/data/ScanMode;Z)V", "()Z", "isLivenessEnabled", "setLivenessEnabled", "(Z)V", "value", "Lcom/jumio/core/data/scan/DataState;", "dataState", "getDataState", "()Lcom/jumio/core/data/scan/DataState;", "setDataState", "(Lcom/jumio/core/data/scan/DataState;)V", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@PersistWith("LivenessScanPartModel")
public class LivenessScanPartModel extends FaceScanPartModel {

    /* JADX INFO: renamed from: o */
    public final boolean f14263o;

    /* JADX INFO: renamed from: p */
    public boolean f14264p;

    /* JADX INFO: renamed from: q */
    public DataState f14265q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LivenessScanPartModel(@NotNull ScanMode mode, boolean z11) {
        super(mode);
        Intrinsics.checkNotNullParameter(mode, "mode");
        this.f14263o = z11;
        this.f14264p = true;
        this.f14265q = DataState.TODO;
    }

    @Override // com.jumio.core.models.ScanPartModel
    @NotNull
    /* JADX INFO: renamed from: getDataState, reason: from getter */
    public DataState getF14265q() {
        return this.f14265q;
    }

    /* JADX INFO: renamed from: isFallbackEnabled, reason: from getter */
    public final boolean getF14263o() {
        return this.f14263o;
    }

    /* JADX INFO: renamed from: isLivenessEnabled, reason: from getter */
    public final boolean getF14264p() {
        return this.f14264p;
    }

    @Override // com.jumio.core.models.ScanPartModel
    public void setDataState(@NotNull DataState value) {
        LivenessDataModel f14243l;
        Intrinsics.checkNotNullParameter(value, "value");
        this.f14265q = value;
        if (getF14313b() == ScanMode.FACE_MANUAL || (f14243l = getF14243l()) == null) {
            return;
        }
        f14243l.setState(value);
    }

    public final void setLivenessEnabled(boolean z11) {
        this.f14264p = z11;
    }
}
