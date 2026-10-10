package com.kubi.otc.entity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.media3.extractor.text.ttml.TtmlNode;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: FastBean.kt */
/* JADX INFO: loaded from: classes33.dex */
@Keep
@Metadata(m90083d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\nJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J2\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0013J\u0006\u0010\u0014\u001a\u00020\u0015J\u0013\u0010\u0016\u001a\u00020\u00032\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0015HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0005HÖ\u0001J\u0016\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0015R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\r¨\u0006 "}, m90084d2 = {"Lcom/kubi/otc/entity/FastFiatCommonMode;", "Landroid/os/Parcelable;", TtmlNode.TEXT_EMPHASIS_MARK_OPEN, "", "tag", "", "tips", "<init>", "(Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;)V", "getOpen", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getTag", "()Ljava/lang/String;", "getTips", "component1", "component2", "component3", "copy", "(Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;)Lcom/kubi/otc/entity/FastFiatCommonMode;", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class FastFiatCommonMode implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<FastFiatCommonMode> CREATOR = new Creator();

    @Nullable
    private final Boolean open;

    @Nullable
    private final String tag;

    @Nullable
    private final String tips;

    /* JADX INFO: compiled from: FastBean.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Creator implements Parcelable.Creator<FastFiatCommonMode> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FastFiatCommonMode createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new FastFiatCommonMode(boolValueOf, parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FastFiatCommonMode[] newArray(int i11) {
            return new FastFiatCommonMode[i11];
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
        if (!(other instanceof FastFiatCommonMode)) {
            return false;
        }
        FastFiatCommonMode fastFiatCommonMode = (FastFiatCommonMode) other;
        return Intrinsics.areEqual(this.open, fastFiatCommonMode.open) && Intrinsics.areEqual(this.tag, fastFiatCommonMode.tag) && Intrinsics.areEqual(this.tips, fastFiatCommonMode.tips);
    }

    public static /* synthetic */ FastFiatCommonMode copy$default(FastFiatCommonMode fastFiatCommonMode, Boolean bool, String str, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            bool = fastFiatCommonMode.open;
        }
        if ((i11 & 2) != 0) {
            str = fastFiatCommonMode.tag;
        }
        if ((i11 & 4) != 0) {
            str2 = fastFiatCommonMode.tips;
        }
        return fastFiatCommonMode.copy(bool, str, str2);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Boolean getOpen() {
        return this.open;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTag() {
        return this.tag;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getTips() {
        return this.tips;
    }

    @NotNull
    public final FastFiatCommonMode copy(@Nullable Boolean open, @Nullable String tag, @Nullable String tips) {
        return new FastFiatCommonMode(open, tag, tips);
    }

    @Nullable
    public final Boolean getOpen() {
        return this.open;
    }

    @Nullable
    public final String getTag() {
        return this.tag;
    }

    @Nullable
    public final String getTips() {
        return this.tips;
    }

    public int hashCode() {
        Boolean bool = this.open;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        String str = this.tag;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.tips;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "FastFiatCommonMode(open=" + this.open + ", tag=" + this.tag + ", tips=" + this.tips + ')';
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [android.os.Parcel, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v4, types: [int] */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        ?? BooleanValue;
        Intrinsics.checkNotNullParameter(dest, "dest");
        Boolean bool = this.open;
        if (bool == null) {
            BooleanValue = 0;
        } else {
            dest.writeInt(1);
            BooleanValue = bool.booleanValue();
        }
        dest.writeInt(BooleanValue);
        dest.writeString(this.tag);
        dest.writeString(this.tips);
    }

    public FastFiatCommonMode(@Nullable Boolean bool, @Nullable String str, @Nullable String str2) {
        this.open = bool;
        this.tag = str;
        this.tips = str2;
    }
}
