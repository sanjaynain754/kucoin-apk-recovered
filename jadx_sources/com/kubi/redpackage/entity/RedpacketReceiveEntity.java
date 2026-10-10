package com.kubi.redpackage.entity;

import androidx.annotation.Keep;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.math.BigDecimal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: RedpacketReceiveEntity.kt */
/* JADX INFO: loaded from: classes38.dex */
@Keep
@Metadata(m90083d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u001d\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BW\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u001f\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0013J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\nHÆ\u0003J\u0010\u0010#\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u0010\u001aJ\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003Jn\u0010%\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010&J\u0013\u0010'\u001a\u00020\u00062\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010)\u001a\u00020*HÖ\u0001J\t\u0010+\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0005\u0010\u0013R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0011R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0011R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0015\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0011¨\u0006,"}, m90084d2 = {"Lcom/kubi/redpackage/entity/RedpacketReceiveEntity;", "", "id", "", FirebaseAnalytics.Param.CURRENCY, "isSelf", "", "nickName", "sendNickName", "receiveAmount", "Ljava/math/BigDecimal;", "receiveAt", "", "resourceId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/Long;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getCurrency", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getNickName", "getSendNickName", "getReceiveAmount", "()Ljava/math/BigDecimal;", "getReceiveAt", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getResourceId", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/Long;Ljava/lang/String;)Lcom/kubi/redpackage/entity/RedpacketReceiveEntity;", "equals", "other", "hashCode", "", "toString", "RedpackageLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class RedpacketReceiveEntity {

    @Nullable
    private final String currency;

    @Nullable
    private final String id;

    @Nullable
    private final Boolean isSelf;

    @Nullable
    private final String nickName;

    @Nullable
    private final BigDecimal receiveAmount;

    @Nullable
    private final Long receiveAt;

    @Nullable
    private final String resourceId;

    @Nullable
    private final String sendNickName;

    public static /* synthetic */ RedpacketReceiveEntity copy$default(RedpacketReceiveEntity redpacketReceiveEntity, String str, String str2, Boolean bool, String str3, String str4, BigDecimal bigDecimal, Long l11, String str5, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = redpacketReceiveEntity.id;
        }
        if ((i11 & 2) != 0) {
            str2 = redpacketReceiveEntity.currency;
        }
        if ((i11 & 4) != 0) {
            bool = redpacketReceiveEntity.isSelf;
        }
        if ((i11 & 8) != 0) {
            str3 = redpacketReceiveEntity.nickName;
        }
        if ((i11 & 16) != 0) {
            str4 = redpacketReceiveEntity.sendNickName;
        }
        if ((i11 & 32) != 0) {
            bigDecimal = redpacketReceiveEntity.receiveAmount;
        }
        if ((i11 & 64) != 0) {
            l11 = redpacketReceiveEntity.receiveAt;
        }
        if ((i11 & 128) != 0) {
            str5 = redpacketReceiveEntity.resourceId;
        }
        Long l12 = l11;
        String str6 = str5;
        String str7 = str4;
        BigDecimal bigDecimal2 = bigDecimal;
        return redpacketReceiveEntity.copy(str, str2, bool, str3, str7, bigDecimal2, l12, str6);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RedpacketReceiveEntity)) {
            return false;
        }
        RedpacketReceiveEntity redpacketReceiveEntity = (RedpacketReceiveEntity) other;
        return Intrinsics.areEqual(this.id, redpacketReceiveEntity.id) && Intrinsics.areEqual(this.currency, redpacketReceiveEntity.currency) && Intrinsics.areEqual(this.isSelf, redpacketReceiveEntity.isSelf) && Intrinsics.areEqual(this.nickName, redpacketReceiveEntity.nickName) && Intrinsics.areEqual(this.sendNickName, redpacketReceiveEntity.sendNickName) && Intrinsics.areEqual(this.receiveAmount, redpacketReceiveEntity.receiveAmount) && Intrinsics.areEqual(this.receiveAt, redpacketReceiveEntity.receiveAt) && Intrinsics.areEqual(this.resourceId, redpacketReceiveEntity.resourceId);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Boolean getIsSelf() {
        return this.isSelf;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getNickName() {
        return this.nickName;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getSendNickName() {
        return this.sendNickName;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final BigDecimal getReceiveAmount() {
        return this.receiveAmount;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Long getReceiveAt() {
        return this.receiveAt;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getResourceId() {
        return this.resourceId;
    }

    @NotNull
    public final RedpacketReceiveEntity copy(@Nullable String id2, @Nullable String currency, @Nullable Boolean isSelf, @Nullable String nickName, @Nullable String sendNickName, @Nullable BigDecimal receiveAmount, @Nullable Long receiveAt, @Nullable String resourceId) {
        return new RedpacketReceiveEntity(id2, currency, isSelf, nickName, sendNickName, receiveAmount, receiveAt, resourceId);
    }

    @Nullable
    public final String getCurrency() {
        return this.currency;
    }

    @Nullable
    public final String getId() {
        return this.id;
    }

    @Nullable
    public final String getNickName() {
        return this.nickName;
    }

    @Nullable
    public final BigDecimal getReceiveAmount() {
        return this.receiveAmount;
    }

    @Nullable
    public final Long getReceiveAt() {
        return this.receiveAt;
    }

    @Nullable
    public final String getResourceId() {
        return this.resourceId;
    }

    @Nullable
    public final String getSendNickName() {
        return this.sendNickName;
    }

    public int hashCode() {
        String str = this.id;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.currency;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.isSelf;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str3 = this.nickName;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.sendNickName;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        BigDecimal bigDecimal = this.receiveAmount;
        int iHashCode6 = (iHashCode5 + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        Long l11 = this.receiveAt;
        int iHashCode7 = (iHashCode6 + (l11 == null ? 0 : l11.hashCode())) * 31;
        String str5 = this.resourceId;
        return iHashCode7 + (str5 != null ? str5.hashCode() : 0);
    }

    @Nullable
    public final Boolean isSelf() {
        return this.isSelf;
    }

    @NotNull
    public String toString() {
        return "RedpacketReceiveEntity(id=" + this.id + ", currency=" + this.currency + ", isSelf=" + this.isSelf + ", nickName=" + this.nickName + ", sendNickName=" + this.sendNickName + ", receiveAmount=" + this.receiveAmount + ", receiveAt=" + this.receiveAt + ", resourceId=" + this.resourceId + ')';
    }

    public RedpacketReceiveEntity(@Nullable String str, @Nullable String str2, @Nullable Boolean bool, @Nullable String str3, @Nullable String str4, @Nullable BigDecimal bigDecimal, @Nullable Long l11, @Nullable String str5) {
        this.id = str;
        this.currency = str2;
        this.isSelf = bool;
        this.nickName = str3;
        this.sendNickName = str4;
        this.receiveAmount = bigDecimal;
        this.receiveAt = l11;
        this.resourceId = str5;
    }
}
