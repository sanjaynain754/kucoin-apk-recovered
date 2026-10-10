package com.kubi.kyc.data;

import androidx.annotation.Keep;
import com.kubi.kyc.api.KycInfoEntity;
import com.kubi.kyc.data.entity.KycClearInfoEntity;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: KycPrecheckData.kt */
/* JADX INFO: loaded from: classes21.dex */
@Keep
@Metadata(m90083d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m90084d2 = {"Lcom/kubi/kyc/data/KycPrecheckData;", "", "kycInfo", "Lcom/kubi/kyc/api/KycInfoEntity;", "clearInfo", "Lcom/kubi/kyc/data/entity/KycClearInfoEntity;", "<init>", "(Lcom/kubi/kyc/api/KycInfoEntity;Lcom/kubi/kyc/data/entity/KycClearInfoEntity;)V", "getKycInfo", "()Lcom/kubi/kyc/api/KycInfoEntity;", "getClearInfo", "()Lcom/kubi/kyc/data/entity/KycClearInfoEntity;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "KycLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class KycPrecheckData {

    @Nullable
    private final KycClearInfoEntity clearInfo;

    @Nullable
    private final KycInfoEntity kycInfo;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof KycPrecheckData)) {
            return false;
        }
        KycPrecheckData kycPrecheckData = (KycPrecheckData) other;
        return Intrinsics.areEqual(this.kycInfo, kycPrecheckData.kycInfo) && Intrinsics.areEqual(this.clearInfo, kycPrecheckData.clearInfo);
    }

    public static /* synthetic */ KycPrecheckData copy$default(KycPrecheckData kycPrecheckData, KycInfoEntity kycInfoEntity, KycClearInfoEntity kycClearInfoEntity, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            kycInfoEntity = kycPrecheckData.kycInfo;
        }
        if ((i11 & 2) != 0) {
            kycClearInfoEntity = kycPrecheckData.clearInfo;
        }
        return kycPrecheckData.copy(kycInfoEntity, kycClearInfoEntity);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final KycInfoEntity getKycInfo() {
        return this.kycInfo;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final KycClearInfoEntity getClearInfo() {
        return this.clearInfo;
    }

    @NotNull
    public final KycPrecheckData copy(@Nullable KycInfoEntity kycInfo, @Nullable KycClearInfoEntity clearInfo) {
        return new KycPrecheckData(kycInfo, clearInfo);
    }

    @Nullable
    public final KycClearInfoEntity getClearInfo() {
        return this.clearInfo;
    }

    @Nullable
    public final KycInfoEntity getKycInfo() {
        return this.kycInfo;
    }

    public int hashCode() {
        KycInfoEntity kycInfoEntity = this.kycInfo;
        int iHashCode = (kycInfoEntity == null ? 0 : kycInfoEntity.hashCode()) * 31;
        KycClearInfoEntity kycClearInfoEntity = this.clearInfo;
        return iHashCode + (kycClearInfoEntity != null ? kycClearInfoEntity.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "KycPrecheckData(kycInfo=" + this.kycInfo + ", clearInfo=" + this.clearInfo + ')';
    }

    public KycPrecheckData(@Nullable KycInfoEntity kycInfoEntity, @Nullable KycClearInfoEntity kycClearInfoEntity) {
        this.kycInfo = kycInfoEntity;
        this.clearInfo = kycClearInfoEntity;
    }
}
