package com.trtc.uikit.livekit.p180kc.data.entity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.kubi.search.searchresult.SearchCategory$Companion;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: LiveEntranceConfigEntity.kt */
/* JADX INFO: loaded from: classes60.dex */
@Keep
@Metadata(m90083d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\bJ\u0010\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\bJ&\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u000eJ\u0006\u0010\u000f\u001a\u00020\u0010J\u0013\u0010\u0011\u001a\u00020\u00032\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\u0016\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0010R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\n\u0010\b¨\u0006\u001c"}, m90084d2 = {"Lcom/trtc/uikit/livekit/kc/data/entity/LiveEntranceConfigEntity;", "Landroid/os/Parcelable;", ClickCardReport.ReportData.CARD_TYPE_FUTURE, "", SearchCategory$Companion.WEB3, "<init>", "(Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "getFuture", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getWeb3", "component1", "component2", "copy", "(Ljava/lang/Boolean;Ljava/lang/Boolean;)Lcom/trtc/uikit/livekit/kc/data/entity/LiveEntranceConfigEntity;", "describeContents", "", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class LiveEntranceConfigEntity implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<LiveEntranceConfigEntity> CREATOR = new C36401a();

    @SerializedName(ClickCardReport.ReportData.CARD_TYPE_FUTURE)
    @Nullable
    private final Boolean future;

    @SerializedName(SearchCategory$Companion.WEB3)
    @Nullable
    private final Boolean web3;

    /* JADX INFO: renamed from: com.trtc.uikit.livekit.kc.data.entity.LiveEntranceConfigEntity$a */
    /* JADX INFO: compiled from: LiveEntranceConfigEntity.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C36401a implements Parcelable.Creator<LiveEntranceConfigEntity> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final LiveEntranceConfigEntity createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            Boolean boolValueOf2 = null;
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() != 0) {
                boolValueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new LiveEntranceConfigEntity(boolValueOf, boolValueOf2);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final LiveEntranceConfigEntity[] newArray(int i11) {
            return new LiveEntranceConfigEntity[i11];
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
        if (!(other instanceof LiveEntranceConfigEntity)) {
            return false;
        }
        LiveEntranceConfigEntity liveEntranceConfigEntity = (LiveEntranceConfigEntity) other;
        return Intrinsics.areEqual(this.future, liveEntranceConfigEntity.future) && Intrinsics.areEqual(this.web3, liveEntranceConfigEntity.web3);
    }

    public static /* synthetic */ LiveEntranceConfigEntity copy$default(LiveEntranceConfigEntity liveEntranceConfigEntity, Boolean bool, Boolean bool2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            bool = liveEntranceConfigEntity.future;
        }
        if ((i11 & 2) != 0) {
            bool2 = liveEntranceConfigEntity.web3;
        }
        return liveEntranceConfigEntity.copy(bool, bool2);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Boolean getFuture() {
        return this.future;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Boolean getWeb3() {
        return this.web3;
    }

    @NotNull
    public final LiveEntranceConfigEntity copy(@Nullable Boolean future, @Nullable Boolean web3) {
        return new LiveEntranceConfigEntity(future, web3);
    }

    @Nullable
    public final Boolean getFuture() {
        return this.future;
    }

    @Nullable
    public final Boolean getWeb3() {
        return this.web3;
    }

    public int hashCode() {
        Boolean bool = this.future;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.web3;
        return iHashCode + (bool2 != null ? bool2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "LiveEntranceConfigEntity(future=" + this.future + ", web3=" + this.web3 + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        Boolean bool = this.future;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(bool.booleanValue() ? 1 : 0);
        }
        Boolean bool2 = this.web3;
        if (bool2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(bool2.booleanValue() ? 1 : 0);
        }
    }

    public LiveEntranceConfigEntity(@Nullable Boolean bool, @Nullable Boolean bool2) {
        this.future = bool;
        this.web3 = bool2;
    }
}
