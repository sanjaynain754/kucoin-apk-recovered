package com.kubi.kucoin.entity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import cn.jiguang.privates.push.constants.JPushConstants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: GPSEntity.kt */
/* JADX INFO: loaded from: classes18.dex */
@Keep
@Metadata(m90083d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BK\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\f\u0010\rJ\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\u0010\u0010$\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0013J\u0010\u0010%\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0013J\u0010\u0010&\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u001aJ\u000b\u0010'\u001a\u0004\u0018\u00010\u000bHÆ\u0003JR\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bHÆ\u0001¢\u0006\u0002\u0010)J\u0006\u0010*\u001a\u00020+J\u0013\u0010,\u001a\u00020\u00032\b\u0010-\u001a\u0004\u0018\u00010.HÖ\u0003J\t\u0010/\u001a\u00020+HÖ\u0001J\t\u00100\u001a\u00020\u000bHÖ\u0001J\u0016\u00101\u001a\u0002022\u0006\u00103\u001a\u0002042\u0006\u00105\u001a\u00020+R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0002\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0004\u0010\u000e\"\u0004\b\u0011\u0010\u0010R\u001e\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0016\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001e\u0010\u0007\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0016\u001a\u0004\b\u0017\u0010\u0013\"\u0004\b\u0018\u0010\u0015R\u001e\u0010\b\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001d\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!¨\u00066"}, m90084d2 = {"Lcom/kubi/kucoin/entity/GPSEntity;", "Landroid/os/Parcelable;", "isAuth", "", "isGetInfo", JPushConstants.Geofence.KEY_LATITUDE, "", JPushConstants.Geofence.KEY_LONGITUDE, "positioningTime", "", "userId", "", "<init>", "(ZZLjava/lang/Double;Ljava/lang/Double;Ljava/lang/Long;Ljava/lang/String;)V", "()Z", "setAuth", "(Z)V", "setGetInfo", "getLatitude", "()Ljava/lang/Double;", "setLatitude", "(Ljava/lang/Double;)V", "Ljava/lang/Double;", "getLongitude", "setLongitude", "getPositioningTime", "()Ljava/lang/Long;", "setPositioningTime", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "getUserId", "()Ljava/lang/String;", "setUserId", "(Ljava/lang/String;)V", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(ZZLjava/lang/Double;Ljava/lang/Double;Ljava/lang/Long;Ljava/lang/String;)Lcom/kubi/kucoin/entity/GPSEntity;", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "LLocation_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class GPSEntity implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<GPSEntity> CREATOR = new Creator();
    private boolean isAuth;
    private boolean isGetInfo;

    @Nullable
    private Double latitude;

    @Nullable
    private Double longitude;

    @Nullable
    private Long positioningTime;

    @Nullable
    private String userId;

    /* JADX INFO: compiled from: GPSEntity.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Creator implements Parcelable.Creator<GPSEntity> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final GPSEntity createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            boolean z11 = false;
            if (parcel.readInt() != 0) {
                z11 = true;
            }
            return new GPSEntity(z11, parcel.readInt() != 0, parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readInt() != 0 ? Long.valueOf(parcel.readLong()) : null, parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final GPSEntity[] newArray(int i11) {
            return new GPSEntity[i11];
        }
    }

    public GPSEntity() {
        this(false, false, null, null, null, null, 63, null);
    }

    public static /* synthetic */ GPSEntity copy$default(GPSEntity gPSEntity, boolean z11, boolean z12, Double d11, Double d12, Long l11, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = gPSEntity.isAuth;
        }
        if ((i11 & 2) != 0) {
            z12 = gPSEntity.isGetInfo;
        }
        if ((i11 & 4) != 0) {
            d11 = gPSEntity.latitude;
        }
        if ((i11 & 8) != 0) {
            d12 = gPSEntity.longitude;
        }
        if ((i11 & 16) != 0) {
            l11 = gPSEntity.positioningTime;
        }
        if ((i11 & 32) != 0) {
            str = gPSEntity.userId;
        }
        Long l12 = l11;
        String str2 = str;
        return gPSEntity.copy(z11, z12, d11, d12, l12, str2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GPSEntity)) {
            return false;
        }
        GPSEntity gPSEntity = (GPSEntity) other;
        return this.isAuth == gPSEntity.isAuth && this.isGetInfo == gPSEntity.isGetInfo && Intrinsics.areEqual((Object) this.latitude, (Object) gPSEntity.latitude) && Intrinsics.areEqual((Object) this.longitude, (Object) gPSEntity.longitude) && Intrinsics.areEqual(this.positioningTime, gPSEntity.positioningTime) && Intrinsics.areEqual(this.userId, gPSEntity.userId);
    }

    public GPSEntity(boolean z11, boolean z12, @Nullable Double d11, @Nullable Double d12, @Nullable Long l11, @Nullable String str) {
        this.isAuth = z11;
        this.isGetInfo = z12;
        this.latitude = d11;
        this.longitude = d12;
        this.positioningTime = l11;
        this.userId = str;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getIsAuth() {
        return this.isAuth;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getIsGetInfo() {
        return this.isGetInfo;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Double getLatitude() {
        return this.latitude;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Double getLongitude() {
        return this.longitude;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Long getPositioningTime() {
        return this.positioningTime;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getUserId() {
        return this.userId;
    }

    @NotNull
    public final GPSEntity copy(boolean isAuth, boolean isGetInfo, @Nullable Double latitude, @Nullable Double longitude, @Nullable Long positioningTime, @Nullable String userId) {
        return new GPSEntity(isAuth, isGetInfo, latitude, longitude, positioningTime, userId);
    }

    @Nullable
    public final Double getLatitude() {
        return this.latitude;
    }

    @Nullable
    public final Double getLongitude() {
        return this.longitude;
    }

    @Nullable
    public final Long getPositioningTime() {
        return this.positioningTime;
    }

    @Nullable
    public final String getUserId() {
        return this.userId;
    }

    public int hashCode() {
        int iHashCode = ((Boolean.hashCode(this.isAuth) * 31) + Boolean.hashCode(this.isGetInfo)) * 31;
        Double d11 = this.latitude;
        int iHashCode2 = (iHashCode + (d11 == null ? 0 : d11.hashCode())) * 31;
        Double d12 = this.longitude;
        int iHashCode3 = (iHashCode2 + (d12 == null ? 0 : d12.hashCode())) * 31;
        Long l11 = this.positioningTime;
        int iHashCode4 = (iHashCode3 + (l11 == null ? 0 : l11.hashCode())) * 31;
        String str = this.userId;
        return iHashCode4 + (str != null ? str.hashCode() : 0);
    }

    public final boolean isAuth() {
        return this.isAuth;
    }

    public final boolean isGetInfo() {
        return this.isGetInfo;
    }

    public final void setAuth(boolean z11) {
        this.isAuth = z11;
    }

    public final void setGetInfo(boolean z11) {
        this.isGetInfo = z11;
    }

    public final void setLatitude(@Nullable Double d11) {
        this.latitude = d11;
    }

    public final void setLongitude(@Nullable Double d11) {
        this.longitude = d11;
    }

    public final void setPositioningTime(@Nullable Long l11) {
        this.positioningTime = l11;
    }

    public final void setUserId(@Nullable String str) {
        this.userId = str;
    }

    @NotNull
    public String toString() {
        return "GPSEntity(isAuth=" + this.isAuth + ", isGetInfo=" + this.isGetInfo + ", latitude=" + this.latitude + ", longitude=" + this.longitude + ", positioningTime=" + this.positioningTime + ", userId=" + this.userId + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.isAuth ? 1 : 0);
        dest.writeInt(this.isGetInfo ? 1 : 0);
        Double d11 = this.latitude;
        if (d11 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeDouble(d11.doubleValue());
        }
        Double d12 = this.longitude;
        if (d12 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeDouble(d12.doubleValue());
        }
        Long l11 = this.positioningTime;
        if (l11 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeLong(l11.longValue());
        }
        dest.writeString(this.userId);
    }

    public /* synthetic */ GPSEntity(boolean z11, boolean z12, Double d11, Double d12, Long l11, String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? false : z11, (i11 & 2) != 0 ? false : z12, (i11 & 4) != 0 ? null : d11, (i11 & 8) != 0 ? null : d12, (i11 & 16) != 0 ? null : l11, (i11 & 32) != 0 ? null : str);
    }
}
