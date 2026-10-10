package com.jumio.core.models;

import com.jumio.commons.PersistWith;
import com.jumio.core.data.ScanMode;
import com.jumio.core.data.scan.DataState;
import com.jumio.core.extraction.liveness.extraction.LivenessDataModel;
import com.jumio.sdk.enums.JumioCredentialPart;
import jumio.core.AbstractC40689l1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u001b\u001a\u00020\u001cH\u0016R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001c\u0010\f\u001a\u0004\u0018\u00010\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0012\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0016\u001a\u00020\u0013X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0015\"\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001a\u001a\u00020\u00138VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0015¨\u0006\u001d"}, m90084d2 = {"Lcom/jumio/core/models/FaceScanPartModel;", "Lcom/jumio/core/models/ScanPartModel;", "mode", "Lcom/jumio/core/data/ScanMode;", "<init>", "(Lcom/jumio/core/data/ScanMode;)V", "livenessData", "Lcom/jumio/core/extraction/liveness/extraction/LivenessDataModel;", "getLivenessData", "()Lcom/jumio/core/extraction/liveness/extraction/LivenessDataModel;", "setLivenessData", "(Lcom/jumio/core/extraction/liveness/extraction/LivenessDataModel;)V", "lookupResult", "Lcom/jumio/core/models/ReusableIdLookupResult;", "getLookupResult", "()Lcom/jumio/core/models/ReusableIdLookupResult;", "setLookupResult", "(Lcom/jumio/core/models/ReusableIdLookupResult;)V", "uploadAndUsabilityComplete", "", "getUploadAndUsabilityComplete", "()Z", "shouldUseLookupResult", "getShouldUseLookupResult", "setShouldUseLookupResult", "(Z)V", "isComplete", "clear", "", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@PersistWith("FaceScanPartModel")
public class FaceScanPartModel extends ScanPartModel {

    /* JADX INFO: renamed from: l */
    public LivenessDataModel f14243l;

    /* JADX INFO: renamed from: m */
    public ReusableIdLookupResult f14244m;

    /* JADX INFO: renamed from: n */
    public boolean f14245n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FaceScanPartModel(@NotNull ScanMode mode) {
        super(JumioCredentialPart.FACE, mode, null, 4, null);
        Intrinsics.checkNotNullParameter(mode, "mode");
    }

    @Nullable
    /* JADX INFO: renamed from: getLivenessData, reason: from getter */
    public final LivenessDataModel getF14243l() {
        return this.f14243l;
    }

    @Nullable
    /* JADX INFO: renamed from: getLookupResult, reason: from getter */
    public final ReusableIdLookupResult getF14244m() {
        return this.f14244m;
    }

    /* JADX INFO: renamed from: getShouldUseLookupResult, reason: from getter */
    public final boolean getF14245n() {
        return this.f14245n;
    }

    public final void setLivenessData(@Nullable LivenessDataModel livenessDataModel) {
        this.f14243l = livenessDataModel;
    }

    public final void setLookupResult(@Nullable ReusableIdLookupResult reusableIdLookupResult) {
        this.f14244m = reusableIdLookupResult;
    }

    public final void setShouldUseLookupResult(boolean z11) {
        this.f14245n = z11;
    }

    @Override // com.jumio.core.models.ScanPartModel
    public void clear() {
        super.clear();
        this.f14243l = null;
    }

    public final boolean getUploadAndUsabilityComplete() {
        DataState f14115d;
        if (AbstractC40689l1.f90317a[getF14313b().ordinal()] == 1) {
            if (super.isComplete()) {
                LivenessDataModel livenessDataModel = this.f14243l;
                DataState f14115d2 = null;
                if (livenessDataModel != null) {
                    f14115d = livenessDataModel.getF14115d();
                } else {
                    f14115d = null;
                }
                if (f14115d != DataState.UPLOADED) {
                    LivenessDataModel livenessDataModel2 = this.f14243l;
                    if (livenessDataModel2 != null) {
                        f14115d2 = livenessDataModel2.getF14115d();
                    }
                    if (f14115d2 != DataState.SKIPPED) {
                        return false;
                    }
                }
                return true;
            }
            return false;
        }
        return super.isComplete();
    }

    @Override // com.jumio.core.models.ScanPartModel
    public boolean isComplete() {
        if (getUploadAndUsabilityComplete()) {
            if (!this.f14245n || this.f14244m != null) {
                return true;
            }
            return false;
        }
        return false;
    }
}
