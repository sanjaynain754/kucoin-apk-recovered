package com.kubi.margin.config;

import androidx.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: MarginConfig.kt */
/* JADX INFO: loaded from: classes27.dex */
@Keep
@Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0007J\u001a\u0010\n\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m90084d2 = {"Lcom/kubi/margin/config/MarginConfig;", "", "isolatedPolling", "", "<init>", "(Ljava/lang/Integer;)V", "getIsolatedPolling", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "copy", "(Ljava/lang/Integer;)Lcom/kubi/margin/config/MarginConfig;", "equals", "", "other", "hashCode", "toString", "", "MarginLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class MarginConfig {

    @SerializedName("isolated_position_polling")
    @Nullable
    private final Integer isolatedPolling;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof MarginConfig) && Intrinsics.areEqual(this.isolatedPolling, ((MarginConfig) other).isolatedPolling);
    }

    public static /* synthetic */ MarginConfig copy$default(MarginConfig marginConfig, Integer num, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            num = marginConfig.isolatedPolling;
        }
        return marginConfig.copy(num);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Integer getIsolatedPolling() {
        return this.isolatedPolling;
    }

    @NotNull
    public final MarginConfig copy(@Nullable Integer isolatedPolling) {
        return new MarginConfig(isolatedPolling);
    }

    @Nullable
    public final Integer getIsolatedPolling() {
        return this.isolatedPolling;
    }

    public int hashCode() {
        Integer num = this.isolatedPolling;
        if (num == null) {
            return 0;
        }
        return num.hashCode();
    }

    @NotNull
    public String toString() {
        return "MarginConfig(isolatedPolling=" + this.isolatedPolling + ')';
    }

    public MarginConfig(@Nullable Integer num) {
        this.isolatedPolling = num;
    }
}
