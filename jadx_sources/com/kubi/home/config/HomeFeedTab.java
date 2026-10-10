package com.kubi.home.config;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p233ej.C37201i;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: HomeFeedConfig.kt */
/* JADX INFO: loaded from: classes15.dex */
@Keep
@Metadata(m90083d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0006\u0010\u000f\u001a\u00020\u0003J\u0006\u0010\u0010\u001a\u00020\u0005J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\rJ&\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0014J\u0006\u0010\u0015\u001a\u00020\u0016J\u0013\u0010\u0017\u001a\u00020\u00052\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0016HÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0016R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\r¨\u0006!"}, m90084d2 = {"Lcom/kubi/home/config/HomeFeedTab;", "Landroid/os/Parcelable;", "code", "", "display", "", "<init>", "(Ljava/lang/String;Ljava/lang/Boolean;)V", "getCode", "()Ljava/lang/String;", "setCode", "(Ljava/lang/String;)V", "getDisplay", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "showCode", "isDisplay", "component1", "component2", "copy", "(Ljava/lang/String;Ljava/lang/Boolean;)Lcom/kubi/home/config/HomeFeedTab;", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "HomeApi_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class HomeFeedTab implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<HomeFeedTab> CREATOR = new C14532a();

    @Nullable
    private String code;

    @Nullable
    private final Boolean display;

    /* JADX INFO: renamed from: com.kubi.home.config.HomeFeedTab$a */
    /* JADX INFO: compiled from: HomeFeedConfig.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C14532a implements Parcelable.Creator<HomeFeedTab> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final HomeFeedTab createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new HomeFeedTab(string, boolValueOf);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final HomeFeedTab[] newArray(int i11) {
            return new HomeFeedTab[i11];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public HomeFeedTab() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HomeFeedTab)) {
            return false;
        }
        HomeFeedTab homeFeedTab = (HomeFeedTab) other;
        return Intrinsics.areEqual(this.code, homeFeedTab.code) && Intrinsics.areEqual(this.display, homeFeedTab.display);
    }

    public HomeFeedTab(@Nullable String str, @Nullable Boolean bool) {
        this.code = str;
        this.display = bool;
    }

    public static /* synthetic */ HomeFeedTab copy$default(HomeFeedTab homeFeedTab, String str, Boolean bool, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = homeFeedTab.code;
        }
        if ((i11 & 2) != 0) {
            bool = homeFeedTab.display;
        }
        return homeFeedTab.copy(str, bool);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCode() {
        return this.code;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Boolean getDisplay() {
        return this.display;
    }

    @NotNull
    public final HomeFeedTab copy(@Nullable String code, @Nullable Boolean display) {
        return new HomeFeedTab(code, display);
    }

    @Nullable
    public final String getCode() {
        return this.code;
    }

    @Nullable
    public final Boolean getDisplay() {
        return this.display;
    }

    public int hashCode() {
        String str = this.code;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Boolean bool = this.display;
        return iHashCode + (bool != null ? bool.hashCode() : 0);
    }

    public final void setCode(@Nullable String str) {
        this.code = str;
    }

    @NotNull
    public final String showCode() {
        String str = this.code;
        return str == null ? "" : str;
    }

    @NotNull
    public String toString() {
        return "HomeFeedTab(code=" + this.code + ", display=" + this.display + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.code);
        Boolean bool = this.display;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(bool.booleanValue() ? 1 : 0);
        }
    }

    public /* synthetic */ HomeFeedTab(String str, Boolean bool, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? "" : str, (i11 & 2) != 0 ? Boolean.TRUE : bool);
    }

    public final boolean isDisplay() {
        if (showCode().length() > 0 && Intrinsics.areEqual(this.display, Boolean.TRUE)) {
            if (!Intrinsics.areEqual(this.code, "live") || C37201i.f82500a.m83210A()) {
                return true;
            }
            return false;
        }
        return false;
    }
}
