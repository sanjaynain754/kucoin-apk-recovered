package com.kubi.unify.entity;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: UnifyEntity.kt */
/* JADX INFO: loaded from: classes52.dex */
@Keep
@Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000bJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J2\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u0012J\u0013\u0010\u0013\u001a\u00020\u00052\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\u0004\u0010\u000bR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0018"}, m90084d2 = {"Lcom/kubi/unify/entity/UnifyNotEmptyErrorEntity;", "", "preCheckDesc", "", "isPassed", "", "preCheckType", "<init>", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;)V", "getPreCheckDesc", "()Ljava/lang/String;", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getPreCheckType", "component1", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;)Lcom/kubi/unify/entity/UnifyNotEmptyErrorEntity;", "equals", "other", "hashCode", "", "toString", "BUnifyAccountLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class UnifyNotEmptyErrorEntity {

    @Nullable
    private final Boolean isPassed;

    @Nullable
    private final String preCheckDesc;

    @Nullable
    private final String preCheckType;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UnifyNotEmptyErrorEntity)) {
            return false;
        }
        UnifyNotEmptyErrorEntity unifyNotEmptyErrorEntity = (UnifyNotEmptyErrorEntity) other;
        return Intrinsics.areEqual(this.preCheckDesc, unifyNotEmptyErrorEntity.preCheckDesc) && Intrinsics.areEqual(this.isPassed, unifyNotEmptyErrorEntity.isPassed) && Intrinsics.areEqual(this.preCheckType, unifyNotEmptyErrorEntity.preCheckType);
    }

    public static /* synthetic */ UnifyNotEmptyErrorEntity copy$default(UnifyNotEmptyErrorEntity unifyNotEmptyErrorEntity, String str, Boolean bool, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = unifyNotEmptyErrorEntity.preCheckDesc;
        }
        if ((i11 & 2) != 0) {
            bool = unifyNotEmptyErrorEntity.isPassed;
        }
        if ((i11 & 4) != 0) {
            str2 = unifyNotEmptyErrorEntity.preCheckType;
        }
        return unifyNotEmptyErrorEntity.copy(str, bool, str2);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getPreCheckDesc() {
        return this.preCheckDesc;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Boolean getIsPassed() {
        return this.isPassed;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getPreCheckType() {
        return this.preCheckType;
    }

    @NotNull
    public final UnifyNotEmptyErrorEntity copy(@Nullable String preCheckDesc, @Nullable Boolean isPassed, @Nullable String preCheckType) {
        return new UnifyNotEmptyErrorEntity(preCheckDesc, isPassed, preCheckType);
    }

    @Nullable
    public final String getPreCheckDesc() {
        return this.preCheckDesc;
    }

    @Nullable
    public final String getPreCheckType() {
        return this.preCheckType;
    }

    public int hashCode() {
        String str = this.preCheckDesc;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Boolean bool = this.isPassed;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        String str2 = this.preCheckType;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @Nullable
    public final Boolean isPassed() {
        return this.isPassed;
    }

    @NotNull
    public String toString() {
        return "UnifyNotEmptyErrorEntity(preCheckDesc=" + this.preCheckDesc + ", isPassed=" + this.isPassed + ", preCheckType=" + this.preCheckType + ')';
    }

    public UnifyNotEmptyErrorEntity(@Nullable String str, @Nullable Boolean bool, @Nullable String str2) {
        this.preCheckDesc = str;
        this.isPassed = bool;
        this.preCheckType = str2;
    }
}
