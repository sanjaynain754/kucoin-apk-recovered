package com.kubi.payment.kucard.data.entities;

import androidx.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: KuCardEntranceConfig.kt */
/* JADX INFO: loaded from: classes33.dex */
@Keep
@Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\tJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0005HÆ\u0003J&\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0010J\u0013\u0010\u0011\u001a\u00020\u00032\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0005HÖ\u0001R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\tR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, m90084d2 = {"Lcom/kubi/payment/kucard/data/entities/KuCardEntranceConfig;", "", "hasEntrance", "", "entrancePath", "", "<init>", "(Ljava/lang/Boolean;Ljava/lang/String;)V", "getHasEntrance", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getEntrancePath", "()Ljava/lang/String;", "component1", "component2", "copy", "(Ljava/lang/Boolean;Ljava/lang/String;)Lcom/kubi/payment/kucard/data/entities/KuCardEntranceConfig;", "equals", "other", "hashCode", "", "toString", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class KuCardEntranceConfig {

    @SerializedName("entrancePath")
    @Nullable
    private final String entrancePath;

    @SerializedName("hasEntrance")
    @Nullable
    private final Boolean hasEntrance;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof KuCardEntranceConfig)) {
            return false;
        }
        KuCardEntranceConfig kuCardEntranceConfig = (KuCardEntranceConfig) other;
        return Intrinsics.areEqual(this.hasEntrance, kuCardEntranceConfig.hasEntrance) && Intrinsics.areEqual(this.entrancePath, kuCardEntranceConfig.entrancePath);
    }

    public static /* synthetic */ KuCardEntranceConfig copy$default(KuCardEntranceConfig kuCardEntranceConfig, Boolean bool, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            bool = kuCardEntranceConfig.hasEntrance;
        }
        if ((i11 & 2) != 0) {
            str = kuCardEntranceConfig.entrancePath;
        }
        return kuCardEntranceConfig.copy(bool, str);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Boolean getHasEntrance() {
        return this.hasEntrance;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getEntrancePath() {
        return this.entrancePath;
    }

    @NotNull
    public final KuCardEntranceConfig copy(@Nullable Boolean hasEntrance, @Nullable String entrancePath) {
        return new KuCardEntranceConfig(hasEntrance, entrancePath);
    }

    @Nullable
    public final String getEntrancePath() {
        return this.entrancePath;
    }

    @Nullable
    public final Boolean getHasEntrance() {
        return this.hasEntrance;
    }

    public int hashCode() {
        Boolean bool = this.hasEntrance;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        String str = this.entrancePath;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "KuCardEntranceConfig(hasEntrance=" + this.hasEntrance + ", entrancePath=" + this.entrancePath + ')';
    }

    public KuCardEntranceConfig(@Nullable Boolean bool, @Nullable String str) {
        this.hasEntrance = bool;
        this.entrancePath = str;
    }
}
