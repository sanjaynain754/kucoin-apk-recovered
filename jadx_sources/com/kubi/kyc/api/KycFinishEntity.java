package com.kubi.kyc.api;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.appsflyer.AppsFlyerProperties;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: KycEntity.kt */
/* JADX INFO: loaded from: classes21.dex */
@Keep
@Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u001f\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\r\u001a\u00020\u000eJ\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u000eHÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u001a"}, m90084d2 = {"Lcom/kubi/kyc/api/KycFinishEntity;", "Landroid/os/Parcelable;", AppsFlyerProperties.CHANNEL, "", "ekycflowId", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getChannel", "()Ljava/lang/String;", "getEkycflowId", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "KycApi_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class KycFinishEntity implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<KycFinishEntity> CREATOR = new C17089a();

    @NotNull
    private final String channel;

    @Nullable
    private final String ekycflowId;

    /* JADX INFO: renamed from: com.kubi.kyc.api.KycFinishEntity$a */
    /* JADX INFO: compiled from: KycEntity.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C17089a implements Parcelable.Creator<KycFinishEntity> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final KycFinishEntity createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new KycFinishEntity(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final KycFinishEntity[] newArray(int i11) {
            return new KycFinishEntity[i11];
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
        if (!(other instanceof KycFinishEntity)) {
            return false;
        }
        KycFinishEntity kycFinishEntity = (KycFinishEntity) other;
        return Intrinsics.areEqual(this.channel, kycFinishEntity.channel) && Intrinsics.areEqual(this.ekycflowId, kycFinishEntity.ekycflowId);
    }

    public KycFinishEntity(@NotNull String channel, @Nullable String str) {
        Intrinsics.checkNotNullParameter(channel, "channel");
        this.channel = channel;
        this.ekycflowId = str;
    }

    public static /* synthetic */ KycFinishEntity copy$default(KycFinishEntity kycFinishEntity, String str, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = kycFinishEntity.channel;
        }
        if ((i11 & 2) != 0) {
            str2 = kycFinishEntity.ekycflowId;
        }
        return kycFinishEntity.copy(str, str2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getChannel() {
        return this.channel;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getEkycflowId() {
        return this.ekycflowId;
    }

    @NotNull
    public final KycFinishEntity copy(@NotNull String channel, @Nullable String ekycflowId) {
        Intrinsics.checkNotNullParameter(channel, "channel");
        return new KycFinishEntity(channel, ekycflowId);
    }

    @NotNull
    public final String getChannel() {
        return this.channel;
    }

    @Nullable
    public final String getEkycflowId() {
        return this.ekycflowId;
    }

    public int hashCode() {
        int iHashCode = this.channel.hashCode() * 31;
        String str = this.ekycflowId;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public String toString() {
        return "KycFinishEntity(channel=" + this.channel + ", ekycflowId=" + this.ekycflowId + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.channel);
        dest.writeString(this.ekycflowId);
    }
}
