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
@Metadata(m90083d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u001e\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B[\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\f\u0010\rJ\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010#\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u0015J\u0010\u0010$\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010\u001aJb\u0010%\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bHÆ\u0001¢\u0006\u0002\u0010&J\u0006\u0010'\u001a\u00020\u000bJ\u0013\u0010(\u001a\u00020\t2\b\u0010)\u001a\u0004\u0018\u00010*HÖ\u0003J\t\u0010+\u001a\u00020\u000bHÖ\u0001J\t\u0010,\u001a\u00020\u0003HÖ\u0001J\u0016\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u0002002\u0006\u00101\u001a\u00020\u000bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u001e\u0010\b\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0018\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001e\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001d\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001c¨\u00062"}, m90084d2 = {"Lcom/kubi/user/protocol/entity/SignProtocolContentItem;", "Landroid/os/Parcelable;", "termId", "", "protocolTitle", "protocolName", "protocolTips", "blockIdPrefix", "hasRead", "", "lastWebViewScrollY", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Integer;)V", "getTermId", "()Ljava/lang/String;", "getProtocolTitle", "getProtocolName", "getProtocolTips", "getBlockIdPrefix", "getHasRead", "()Ljava/lang/Boolean;", "setHasRead", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getLastWebViewScrollY", "()Ljava/lang/Integer;", "setLastWebViewScrollY", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Integer;)Lcom/kubi/user/protocol/entity/SignProtocolContentItem;", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "UserCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class SignProtocolContentItem implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<SignProtocolContentItem> CREATOR = new C26750a();

    @Nullable
    private final String blockIdPrefix;

    @Nullable
    private Boolean hasRead;

    @Nullable
    private Integer lastWebViewScrollY;

    @Nullable
    private final String protocolName;

    @Nullable
    private final String protocolTips;

    @Nullable
    private final String protocolTitle;

    @Nullable
    private final String termId;

    /* JADX INFO: renamed from: com.kubi.user.protocol.entity.SignProtocolContentItem$a */
    /* JADX INFO: compiled from: SignTermItem.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C26750a implements Parcelable.Creator<SignProtocolContentItem> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final SignProtocolContentItem createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new SignProtocolContentItem(string, string2, string3, string4, string5, boolValueOf, parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final SignProtocolContentItem[] newArray(int i11) {
            return new SignProtocolContentItem[i11];
        }
    }

    public SignProtocolContentItem() {
        this(null, null, null, null, null, null, null, 127, null);
    }

    public static /* synthetic */ SignProtocolContentItem copy$default(SignProtocolContentItem signProtocolContentItem, String str, String str2, String str3, String str4, String str5, Boolean bool, Integer num, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = signProtocolContentItem.termId;
        }
        if ((i11 & 2) != 0) {
            str2 = signProtocolContentItem.protocolTitle;
        }
        if ((i11 & 4) != 0) {
            str3 = signProtocolContentItem.protocolName;
        }
        if ((i11 & 8) != 0) {
            str4 = signProtocolContentItem.protocolTips;
        }
        if ((i11 & 16) != 0) {
            str5 = signProtocolContentItem.blockIdPrefix;
        }
        if ((i11 & 32) != 0) {
            bool = signProtocolContentItem.hasRead;
        }
        if ((i11 & 64) != 0) {
            num = signProtocolContentItem.lastWebViewScrollY;
        }
        Boolean bool2 = bool;
        Integer num2 = num;
        String str6 = str5;
        String str7 = str3;
        return signProtocolContentItem.copy(str, str2, str7, str4, str6, bool2, num2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SignProtocolContentItem)) {
            return false;
        }
        SignProtocolContentItem signProtocolContentItem = (SignProtocolContentItem) other;
        return Intrinsics.areEqual(this.termId, signProtocolContentItem.termId) && Intrinsics.areEqual(this.protocolTitle, signProtocolContentItem.protocolTitle) && Intrinsics.areEqual(this.protocolName, signProtocolContentItem.protocolName) && Intrinsics.areEqual(this.protocolTips, signProtocolContentItem.protocolTips) && Intrinsics.areEqual(this.blockIdPrefix, signProtocolContentItem.blockIdPrefix) && Intrinsics.areEqual(this.hasRead, signProtocolContentItem.hasRead) && Intrinsics.areEqual(this.lastWebViewScrollY, signProtocolContentItem.lastWebViewScrollY);
    }

    public SignProtocolContentItem(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable Boolean bool, @Nullable Integer num) {
        this.termId = str;
        this.protocolTitle = str2;
        this.protocolName = str3;
        this.protocolTips = str4;
        this.blockIdPrefix = str5;
        this.hasRead = bool;
        this.lastWebViewScrollY = num;
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTermId() {
        return this.termId;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getProtocolTitle() {
        return this.protocolTitle;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getProtocolName() {
        return this.protocolName;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getProtocolTips() {
        return this.protocolTips;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getBlockIdPrefix() {
        return this.blockIdPrefix;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Boolean getHasRead() {
        return this.hasRead;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Integer getLastWebViewScrollY() {
        return this.lastWebViewScrollY;
    }

    @NotNull
    public final SignProtocolContentItem copy(@Nullable String termId, @Nullable String protocolTitle, @Nullable String protocolName, @Nullable String protocolTips, @Nullable String blockIdPrefix, @Nullable Boolean hasRead, @Nullable Integer lastWebViewScrollY) {
        return new SignProtocolContentItem(termId, protocolTitle, protocolName, protocolTips, blockIdPrefix, hasRead, lastWebViewScrollY);
    }

    @Nullable
    public final String getBlockIdPrefix() {
        return this.blockIdPrefix;
    }

    @Nullable
    public final Boolean getHasRead() {
        return this.hasRead;
    }

    @Nullable
    public final Integer getLastWebViewScrollY() {
        return this.lastWebViewScrollY;
    }

    @Nullable
    public final String getProtocolName() {
        return this.protocolName;
    }

    @Nullable
    public final String getProtocolTips() {
        return this.protocolTips;
    }

    @Nullable
    public final String getProtocolTitle() {
        return this.protocolTitle;
    }

    @Nullable
    public final String getTermId() {
        return this.termId;
    }

    public int hashCode() {
        String str = this.termId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.protocolTitle;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.protocolName;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.protocolTips;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.blockIdPrefix;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Boolean bool = this.hasRead;
        int iHashCode6 = (iHashCode5 + (bool == null ? 0 : bool.hashCode())) * 31;
        Integer num = this.lastWebViewScrollY;
        return iHashCode6 + (num != null ? num.hashCode() : 0);
    }

    public final void setHasRead(@Nullable Boolean bool) {
        this.hasRead = bool;
    }

    public final void setLastWebViewScrollY(@Nullable Integer num) {
        this.lastWebViewScrollY = num;
    }

    @NotNull
    public String toString() {
        return "SignProtocolContentItem(termId=" + this.termId + ", protocolTitle=" + this.protocolTitle + ", protocolName=" + this.protocolName + ", protocolTips=" + this.protocolTips + ", blockIdPrefix=" + this.blockIdPrefix + ", hasRead=" + this.hasRead + ", lastWebViewScrollY=" + this.lastWebViewScrollY + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.termId);
        dest.writeString(this.protocolTitle);
        dest.writeString(this.protocolName);
        dest.writeString(this.protocolTips);
        dest.writeString(this.blockIdPrefix);
        Boolean bool = this.hasRead;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(bool.booleanValue() ? 1 : 0);
        }
        Integer num = this.lastWebViewScrollY;
        if (num == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num.intValue());
        }
    }

    public /* synthetic */ SignProtocolContentItem(String str, String str2, String str3, String str4, String str5, Boolean bool, Integer num, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? "" : str, (i11 & 2) != 0 ? "" : str2, (i11 & 4) != 0 ? "" : str3, (i11 & 8) != 0 ? "" : str4, (i11 & 16) != 0 ? "" : str5, (i11 & 32) != 0 ? Boolean.FALSE : bool, (i11 & 64) != 0 ? 0 : num);
    }
}
