package com.kubi.assets.futures.coins;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: AssetFuturesCoinsConstant.kt */
/* JADX INFO: loaded from: classes6.dex */
@Keep
@Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, m90084d2 = {"Lcom/kubi/assets/futures/coins/TrialData;", "", "trialCode", "", "<init>", "(Ljava/lang/String;)V", "getTrialCode", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class TrialData {

    @NotNull
    private final String trialCode;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof TrialData) && Intrinsics.areEqual(this.trialCode, ((TrialData) other).trialCode);
    }

    public TrialData(@NotNull String trialCode) {
        Intrinsics.checkNotNullParameter(trialCode, "trialCode");
        this.trialCode = trialCode;
    }

    public static /* synthetic */ TrialData copy$default(TrialData trialData, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = trialData.trialCode;
        }
        return trialData.copy(str);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTrialCode() {
        return this.trialCode;
    }

    @NotNull
    public final TrialData copy(@NotNull String trialCode) {
        Intrinsics.checkNotNullParameter(trialCode, "trialCode");
        return new TrialData(trialCode);
    }

    @NotNull
    public final String getTrialCode() {
        return this.trialCode;
    }

    public int hashCode() {
        return this.trialCode.hashCode();
    }

    @NotNull
    public String toString() {
        return "TrialData(trialCode=" + this.trialCode + ')';
    }
}
