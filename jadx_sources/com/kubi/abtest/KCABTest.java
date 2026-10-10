package com.kubi.abtest;

import androidx.annotation.Keep;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.google.gson.annotations.SerializedName;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: KCABTest.kt */
/* JADX INFO: loaded from: classes45.dex */
@Keep
@Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, m90084d2 = {"Lcom/kubi/abtest/KCABTest;", "", RemoteConfigConstants.ExperimentDescriptionFieldKey.EXPERIMENT_ID, "", "value", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getExperimentId", "()Ljava/lang/String;", "getValue", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "ABTest_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class KCABTest {

    @SerializedName(RemoteConfigConstants.ExperimentDescriptionFieldKey.EXPERIMENT_ID)
    @Nullable
    private final String experimentId;

    @SerializedName("value")
    @Nullable
    private final String value;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof KCABTest)) {
            return false;
        }
        KCABTest kCABTest = (KCABTest) other;
        return Intrinsics.areEqual(this.experimentId, kCABTest.experimentId) && Intrinsics.areEqual(this.value, kCABTest.value);
    }

    public static /* synthetic */ KCABTest copy$default(KCABTest kCABTest, String str, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = kCABTest.experimentId;
        }
        if ((i11 & 2) != 0) {
            str2 = kCABTest.value;
        }
        return kCABTest.copy(str, str2);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getExperimentId() {
        return this.experimentId;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    @NotNull
    public final KCABTest copy(@Nullable String experimentId, @Nullable String value) {
        return new KCABTest(experimentId, value);
    }

    @Nullable
    public final String getExperimentId() {
        return this.experimentId;
    }

    @Nullable
    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        String str = this.experimentId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.value;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "KCABTest(experimentId=" + this.experimentId + ", value=" + this.value + ')';
    }

    public KCABTest(@Nullable String str, @Nullable String str2) {
        this.experimentId = str;
        this.value = str2;
    }
}
