package com.kubi.mine.api.entity;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: KycStatusEntity.kt */
/* JADX INFO: loaded from: classes12.dex */
@Keep
@Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, m90084d2 = {"Lcom/kubi/mine/api/entity/KycStatusEntity;", "", "displayType", "", "displayText", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getDisplayType", "()Ljava/lang/String;", "getDisplayText", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "MineApi_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class KycStatusEntity {

    @Nullable
    private final String displayText;

    @Nullable
    private final String displayType;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof KycStatusEntity)) {
            return false;
        }
        KycStatusEntity kycStatusEntity = (KycStatusEntity) other;
        return Intrinsics.areEqual(this.displayType, kycStatusEntity.displayType) && Intrinsics.areEqual(this.displayText, kycStatusEntity.displayText);
    }

    public static /* synthetic */ KycStatusEntity copy$default(KycStatusEntity kycStatusEntity, String str, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = kycStatusEntity.displayType;
        }
        if ((i11 & 2) != 0) {
            str2 = kycStatusEntity.displayText;
        }
        return kycStatusEntity.copy(str, str2);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getDisplayType() {
        return this.displayType;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getDisplayText() {
        return this.displayText;
    }

    @NotNull
    public final KycStatusEntity copy(@Nullable String displayType, @Nullable String displayText) {
        return new KycStatusEntity(displayType, displayText);
    }

    @Nullable
    public final String getDisplayText() {
        return this.displayText;
    }

    @Nullable
    public final String getDisplayType() {
        return this.displayType;
    }

    public int hashCode() {
        String str = this.displayType;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.displayText;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "KycStatusEntity(displayType=" + this.displayType + ", displayText=" + this.displayText + ')';
    }

    public KycStatusEntity(@Nullable String str, @Nullable String str2) {
        this.displayType = str;
        this.displayText = str2;
    }
}
