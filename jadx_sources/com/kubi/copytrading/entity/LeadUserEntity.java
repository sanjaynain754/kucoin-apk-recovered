package com.kubi.copytrading.entity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import java.math.BigDecimal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: CopyTradingEntity.kt */
/* JADX INFO: loaded from: classes.dex */
@Keep
@Metadata(m90083d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\f\u0010\rJ\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010\u001f\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010\u0017Jb\u0010 \u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bHÆ\u0001¢\u0006\u0002\u0010!J\u0006\u0010\"\u001a\u00020\u000bJ\u0013\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010&HÖ\u0003J\t\u0010'\u001a\u00020\u000bHÖ\u0001J\t\u0010(\u001a\u00020\u0005HÖ\u0001J\u0016\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020\u000bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0011R\u0015\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b\u0016\u0010\u0017¨\u0006."}, m90084d2 = {"Lcom/kubi/copytrading/entity/LeadUserEntity;", "Landroid/os/Parcelable;", "maxLeverage", "Ljava/math/BigDecimal;", "avatar", "", "nickName", "userId", "uid", "configId", "status", "", "<init>", "(Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "getMaxLeverage", "()Ljava/math/BigDecimal;", "getAvatar", "()Ljava/lang/String;", "getNickName", "getUserId", "getUid", "getConfigId", "getStatus", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Lcom/kubi/copytrading/entity/LeadUserEntity;", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "CopyTradingApi_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class LeadUserEntity implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<LeadUserEntity> CREATOR = new C11514a();

    @Nullable
    private final String avatar;

    @Nullable
    private final String configId;

    @Nullable
    private final BigDecimal maxLeverage;

    @Nullable
    private final String nickName;

    @Nullable
    private final Integer status;

    @Nullable
    private final String uid;

    @Nullable
    private final String userId;

    /* JADX INFO: renamed from: com.kubi.copytrading.entity.LeadUserEntity$a */
    /* JADX INFO: compiled from: CopyTradingEntity.kt */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C11514a implements Parcelable.Creator<LeadUserEntity> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final LeadUserEntity createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new LeadUserEntity((BigDecimal) parcel.readSerializable(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final LeadUserEntity[] newArray(int i11) {
            return new LeadUserEntity[i11];
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LeadUserEntity)) {
            return false;
        }
        LeadUserEntity leadUserEntity = (LeadUserEntity) other;
        return Intrinsics.areEqual(this.maxLeverage, leadUserEntity.maxLeverage) && Intrinsics.areEqual(this.avatar, leadUserEntity.avatar) && Intrinsics.areEqual(this.nickName, leadUserEntity.nickName) && Intrinsics.areEqual(this.userId, leadUserEntity.userId) && Intrinsics.areEqual(this.uid, leadUserEntity.uid) && Intrinsics.areEqual(this.configId, leadUserEntity.configId) && Intrinsics.areEqual(this.status, leadUserEntity.status);
    }

    public static /* synthetic */ LeadUserEntity copy$default(LeadUserEntity leadUserEntity, BigDecimal bigDecimal, String str, String str2, String str3, String str4, String str5, Integer num, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            bigDecimal = leadUserEntity.maxLeverage;
        }
        if ((i11 & 2) != 0) {
            str = leadUserEntity.avatar;
        }
        if ((i11 & 4) != 0) {
            str2 = leadUserEntity.nickName;
        }
        if ((i11 & 8) != 0) {
            str3 = leadUserEntity.userId;
        }
        if ((i11 & 16) != 0) {
            str4 = leadUserEntity.uid;
        }
        if ((i11 & 32) != 0) {
            str5 = leadUserEntity.configId;
        }
        if ((i11 & 64) != 0) {
            num = leadUserEntity.status;
        }
        String str6 = str5;
        Integer num2 = num;
        String str7 = str4;
        String str8 = str2;
        return leadUserEntity.copy(bigDecimal, str, str8, str3, str7, str6, num2);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final BigDecimal getMaxLeverage() {
        return this.maxLeverage;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getAvatar() {
        return this.avatar;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getNickName() {
        return this.nickName;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getUserId() {
        return this.userId;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getUid() {
        return this.uid;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getConfigId() {
        return this.configId;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Integer getStatus() {
        return this.status;
    }

    @NotNull
    public final LeadUserEntity copy(@Nullable BigDecimal maxLeverage, @Nullable String avatar, @Nullable String nickName, @Nullable String userId, @Nullable String uid, @Nullable String configId, @Nullable Integer status) {
        return new LeadUserEntity(maxLeverage, avatar, nickName, userId, uid, configId, status);
    }

    @Nullable
    public final String getAvatar() {
        return this.avatar;
    }

    @Nullable
    public final String getConfigId() {
        return this.configId;
    }

    @Nullable
    public final BigDecimal getMaxLeverage() {
        return this.maxLeverage;
    }

    @Nullable
    public final String getNickName() {
        return this.nickName;
    }

    @Nullable
    public final Integer getStatus() {
        return this.status;
    }

    @Nullable
    public final String getUid() {
        return this.uid;
    }

    @Nullable
    public final String getUserId() {
        return this.userId;
    }

    public int hashCode() {
        BigDecimal bigDecimal = this.maxLeverage;
        int iHashCode = (bigDecimal == null ? 0 : bigDecimal.hashCode()) * 31;
        String str = this.avatar;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.nickName;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.userId;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.uid;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.configId;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Integer num = this.status;
        return iHashCode6 + (num != null ? num.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "LeadUserEntity(maxLeverage=" + this.maxLeverage + ", avatar=" + this.avatar + ", nickName=" + this.nickName + ", userId=" + this.userId + ", uid=" + this.uid + ", configId=" + this.configId + ", status=" + this.status + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.maxLeverage);
        dest.writeString(this.avatar);
        dest.writeString(this.nickName);
        dest.writeString(this.userId);
        dest.writeString(this.uid);
        dest.writeString(this.configId);
        Integer num = this.status;
        if (num == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num.intValue());
        }
    }

    public LeadUserEntity(@Nullable BigDecimal bigDecimal, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable Integer num) {
        this.maxLeverage = bigDecimal;
        this.avatar = str;
        this.nickName = str2;
        this.userId = str3;
        this.uid = str4;
        this.configId = str5;
        this.status = num;
    }
}
