package com.kubi.quotefacade.entity;

import androidx.annotation.Keep;
import com.google.firebase.analytics.FirebaseAnalytics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: WidgetFearGreedEntity.kt */
/* JADX INFO: loaded from: classes12.dex */
@Keep
@Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\fJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J2\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u0013J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006\u0019"}, m90084d2 = {"Lcom/kubi/quotefacade/entity/FearGreedValueEntity;", "", "btc", "", FirebaseAnalytics.Param.SCORE, "", "status", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)V", "getBtc", "()Ljava/lang/String;", "getScore", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getStatus", "component1", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)Lcom/kubi/quotefacade/entity/FearGreedValueEntity;", "equals", "", "other", "hashCode", "toString", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class FearGreedValueEntity {

    @Nullable
    private final String btc;

    @Nullable
    private final Integer score;

    @Nullable
    private final String status;

    public FearGreedValueEntity() {
        this(null, null, null, 7, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FearGreedValueEntity)) {
            return false;
        }
        FearGreedValueEntity fearGreedValueEntity = (FearGreedValueEntity) other;
        return Intrinsics.areEqual(this.btc, fearGreedValueEntity.btc) && Intrinsics.areEqual(this.score, fearGreedValueEntity.score) && Intrinsics.areEqual(this.status, fearGreedValueEntity.status);
    }

    public FearGreedValueEntity(@Nullable String str, @Nullable Integer num, @Nullable String str2) {
        this.btc = str;
        this.score = num;
        this.status = str2;
    }

    public static /* synthetic */ FearGreedValueEntity copy$default(FearGreedValueEntity fearGreedValueEntity, String str, Integer num, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = fearGreedValueEntity.btc;
        }
        if ((i11 & 2) != 0) {
            num = fearGreedValueEntity.score;
        }
        if ((i11 & 4) != 0) {
            str2 = fearGreedValueEntity.status;
        }
        return fearGreedValueEntity.copy(str, num, str2);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getBtc() {
        return this.btc;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Integer getScore() {
        return this.score;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    @NotNull
    public final FearGreedValueEntity copy(@Nullable String btc, @Nullable Integer score, @Nullable String status) {
        return new FearGreedValueEntity(btc, score, status);
    }

    @Nullable
    public final String getBtc() {
        return this.btc;
    }

    @Nullable
    public final Integer getScore() {
        return this.score;
    }

    @Nullable
    public final String getStatus() {
        return this.status;
    }

    public int hashCode() {
        String str = this.btc;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.score;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.status;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "FearGreedValueEntity(btc=" + this.btc + ", score=" + this.score + ", status=" + this.status + ')';
    }

    public /* synthetic */ FearGreedValueEntity(String str, Integer num, String str2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : num, (i11 & 4) != 0 ? null : str2);
    }
}
