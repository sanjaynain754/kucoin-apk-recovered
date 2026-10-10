package com.kubi.user.site.config;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: UserCenterSiteConfig.kt */
/* JADX INFO: loaded from: classes23.dex */
@Keep
@Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\u0010\u001a\u00020\u0011J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0011R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u001d"}, m90084d2 = {"Lcom/kubi/user/site/config/Term;", "Landroid/os/Parcelable;", "termCode", "", "termId", "version", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getTermCode", "()Ljava/lang/String;", "getTermId", "getVersion", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "UserCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class Term implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<Term> CREATOR = new C26802a();

    @Nullable
    private final String termCode;

    @Nullable
    private final String termId;

    @Nullable
    private final String version;

    /* JADX INFO: renamed from: com.kubi.user.site.config.Term$a */
    /* JADX INFO: compiled from: UserCenterSiteConfig.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C26802a implements Parcelable.Creator<Term> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Term[] newArray(int i11) {
            return new Term[i11];
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Term createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new Term(parcel.readString(), parcel.readString(), parcel.readString());
        }
    }

    public Term() {
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
        if (!(other instanceof Term)) {
            return false;
        }
        Term term = (Term) other;
        return Intrinsics.areEqual(this.termCode, term.termCode) && Intrinsics.areEqual(this.termId, term.termId) && Intrinsics.areEqual(this.version, term.version);
    }

    public Term(@Nullable String str, @Nullable String str2, @Nullable String str3) {
        this.termCode = str;
        this.termId = str2;
        this.version = str3;
    }

    public static /* synthetic */ Term copy$default(Term term, String str, String str2, String str3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = term.termCode;
        }
        if ((i11 & 2) != 0) {
            str2 = term.termId;
        }
        if ((i11 & 4) != 0) {
            str3 = term.version;
        }
        return term.copy(str, str2, str3);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTermCode() {
        return this.termCode;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTermId() {
        return this.termId;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getVersion() {
        return this.version;
    }

    @NotNull
    public final Term copy(@Nullable String termCode, @Nullable String termId, @Nullable String version) {
        return new Term(termCode, termId, version);
    }

    @Nullable
    public final String getTermCode() {
        return this.termCode;
    }

    @Nullable
    public final String getTermId() {
        return this.termId;
    }

    @Nullable
    public final String getVersion() {
        return this.version;
    }

    public int hashCode() {
        String str = this.termCode;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.termId;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.version;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "Term(termCode=" + this.termCode + ", termId=" + this.termId + ", version=" + this.version + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.termCode);
        dest.writeString(this.termId);
        dest.writeString(this.version);
    }

    public /* synthetic */ Term(String str, String str2, String str3, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : str3);
    }
}
