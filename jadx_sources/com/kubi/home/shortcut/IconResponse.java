package com.kubi.home.shortcut;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ShortcutResponse.kt */
/* JADX INFO: loaded from: classes15.dex */
@Keep
@Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\r\u001a\u00020\u000eJ\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u000eHÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u000eR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u001a"}, m90084d2 = {"Lcom/kubi/home/shortcut/IconResponse;", "Landroid/os/Parcelable;", "dayIcon", "", "darkIcon", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getDayIcon", "()Ljava/lang/String;", "getDarkIcon", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class IconResponse implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<IconResponse> CREATOR = new C14855a();

    @Nullable
    private final String darkIcon;

    @Nullable
    private final String dayIcon;

    /* JADX INFO: renamed from: com.kubi.home.shortcut.IconResponse$a */
    /* JADX INFO: compiled from: ShortcutResponse.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C14855a implements Parcelable.Creator<IconResponse> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final IconResponse createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new IconResponse(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final IconResponse[] newArray(int i11) {
            return new IconResponse[i11];
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
        if (!(other instanceof IconResponse)) {
            return false;
        }
        IconResponse iconResponse = (IconResponse) other;
        return Intrinsics.areEqual(this.dayIcon, iconResponse.dayIcon) && Intrinsics.areEqual(this.darkIcon, iconResponse.darkIcon);
    }

    public static /* synthetic */ IconResponse copy$default(IconResponse iconResponse, String str, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = iconResponse.dayIcon;
        }
        if ((i11 & 2) != 0) {
            str2 = iconResponse.darkIcon;
        }
        return iconResponse.copy(str, str2);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getDayIcon() {
        return this.dayIcon;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getDarkIcon() {
        return this.darkIcon;
    }

    @NotNull
    public final IconResponse copy(@Nullable String dayIcon, @Nullable String darkIcon) {
        return new IconResponse(dayIcon, darkIcon);
    }

    @Nullable
    public final String getDarkIcon() {
        return this.darkIcon;
    }

    @Nullable
    public final String getDayIcon() {
        return this.dayIcon;
    }

    public int hashCode() {
        String str = this.dayIcon;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.darkIcon;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "IconResponse(dayIcon=" + this.dayIcon + ", darkIcon=" + this.darkIcon + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.dayIcon);
        dest.writeString(this.darkIcon);
    }

    public IconResponse(@Nullable String str, @Nullable String str2) {
        this.dayIcon = str;
        this.darkIcon = str2;
    }
}
