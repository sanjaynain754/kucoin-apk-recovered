package com.kubi.user.protocol.entity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: SignTermItem.kt */
/* JADX INFO: loaded from: classes53.dex */
@Keep
@Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\u0010\u001a\u00020\u0011J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0011R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u001d"}, m90084d2 = {"Lcom/kubi/user/protocol/entity/SignProtocolLinkItem;", "Landroid/os/Parcelable;", "termId", "", "protocolName", "blockIdPrefix", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getTermId", "()Ljava/lang/String;", "getProtocolName", "getBlockIdPrefix", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "UserCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class SignProtocolLinkItem implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<SignProtocolLinkItem> CREATOR = new C26751a();

    @Nullable
    private final String blockIdPrefix;

    @Nullable
    private final String protocolName;

    @Nullable
    private final String termId;

    /* JADX INFO: renamed from: com.kubi.user.protocol.entity.SignProtocolLinkItem$a */
    /* JADX INFO: compiled from: SignTermItem.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C26751a implements Parcelable.Creator<SignProtocolLinkItem> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final SignProtocolLinkItem createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new SignProtocolLinkItem(parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final SignProtocolLinkItem[] newArray(int i11) {
            return new SignProtocolLinkItem[i11];
        }
    }

    public SignProtocolLinkItem() {
        this(null, null, null, 7, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SignProtocolLinkItem)) {
            return false;
        }
        SignProtocolLinkItem signProtocolLinkItem = (SignProtocolLinkItem) other;
        return Intrinsics.areEqual(this.termId, signProtocolLinkItem.termId) && Intrinsics.areEqual(this.protocolName, signProtocolLinkItem.protocolName) && Intrinsics.areEqual(this.blockIdPrefix, signProtocolLinkItem.blockIdPrefix);
    }

    public SignProtocolLinkItem(@Nullable String str, @Nullable String str2, @Nullable String str3) {
        this.termId = str;
        this.protocolName = str2;
        this.blockIdPrefix = str3;
    }

    public static /* synthetic */ SignProtocolLinkItem copy$default(SignProtocolLinkItem signProtocolLinkItem, String str, String str2, String str3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = signProtocolLinkItem.termId;
        }
        if ((i11 & 2) != 0) {
            str2 = signProtocolLinkItem.protocolName;
        }
        if ((i11 & 4) != 0) {
            str3 = signProtocolLinkItem.blockIdPrefix;
        }
        return signProtocolLinkItem.copy(str, str2, str3);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTermId() {
        return this.termId;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getProtocolName() {
        return this.protocolName;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getBlockIdPrefix() {
        return this.blockIdPrefix;
    }

    @NotNull
    public final SignProtocolLinkItem copy(@Nullable String termId, @Nullable String protocolName, @Nullable String blockIdPrefix) {
        return new SignProtocolLinkItem(termId, protocolName, blockIdPrefix);
    }

    @Nullable
    public final String getBlockIdPrefix() {
        return this.blockIdPrefix;
    }

    @Nullable
    public final String getProtocolName() {
        return this.protocolName;
    }

    @Nullable
    public final String getTermId() {
        return this.termId;
    }

    public int hashCode() {
        String str = this.termId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.protocolName;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.blockIdPrefix;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "SignProtocolLinkItem(termId=" + this.termId + ", protocolName=" + this.protocolName + ", blockIdPrefix=" + this.blockIdPrefix + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.termId);
        dest.writeString(this.protocolName);
        dest.writeString(this.blockIdPrefix);
    }

    public /* synthetic */ SignProtocolLinkItem(String str, String str2, String str3, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? "" : str, (i11 & 2) != 0 ? "" : str2, (i11 & 4) != 0 ? "" : str3);
    }
}
