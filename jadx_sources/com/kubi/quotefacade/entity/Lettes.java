package com.kubi.quotefacade.entity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: HomeMarketEntity.kt */
/* JADX INFO: loaded from: classes37.dex */
@Keep
@Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\n\u001a\u00020\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0017"}, m90084d2 = {"Lcom/kubi/quotefacade/entity/Lettes;", "Landroid/os/Parcelable;", "gmtCreated", "", "<init>", "(Ljava/lang/String;)V", "getGmtCreated", "()Ljava/lang/String;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class Lettes implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<Lettes> CREATOR = new C21900a();

    @Nullable
    private final String gmtCreated;

    /* JADX INFO: renamed from: com.kubi.quotefacade.entity.Lettes$a */
    /* JADX INFO: compiled from: HomeMarketEntity.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C21900a implements Parcelable.Creator<Lettes> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Lettes createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new Lettes(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Lettes[] newArray(int i11) {
            return new Lettes[i11];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Lettes() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof Lettes) && Intrinsics.areEqual(this.gmtCreated, ((Lettes) other).gmtCreated);
    }

    public Lettes(@Nullable String str) {
        this.gmtCreated = str;
    }

    public static /* synthetic */ Lettes copy$default(Lettes lettes, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = lettes.gmtCreated;
        }
        return lettes.copy(str);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getGmtCreated() {
        return this.gmtCreated;
    }

    @NotNull
    public final Lettes copy(@Nullable String gmtCreated) {
        return new Lettes(gmtCreated);
    }

    @Nullable
    public final String getGmtCreated() {
        return this.gmtCreated;
    }

    public int hashCode() {
        String str = this.gmtCreated;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    @NotNull
    public String toString() {
        return "Lettes(gmtCreated=" + this.gmtCreated + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.gmtCreated);
    }

    public /* synthetic */ Lettes(String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? "" : str);
    }
}
