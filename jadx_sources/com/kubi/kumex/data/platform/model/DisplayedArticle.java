package com.kubi.kumex.data.platform.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: FuturesCampaignActivityEntity.kt */
/* JADX INFO: loaded from: classes20.dex */
@Keep
@Metadata(m90083d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0013\u0010\u0011\u001a\u00020\u00052\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\u0016\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001c"}, m90084d2 = {"Lcom/kubi/kumex/data/platform/model/DisplayedArticle;", "Landroid/os/Parcelable;", "id", "", "displayed", "", "<init>", "(JZ)V", "getId", "()J", "getDisplayed", "()Z", "component1", "component2", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class DisplayedArticle implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<DisplayedArticle> CREATOR = new C15798a();
    private final boolean displayed;
    private final long id;

    /* JADX INFO: renamed from: com.kubi.kumex.data.platform.model.DisplayedArticle$a */
    /* JADX INFO: compiled from: FuturesCampaignActivityEntity.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C15798a implements Parcelable.Creator<DisplayedArticle> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final DisplayedArticle createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new DisplayedArticle(parcel.readLong(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final DisplayedArticle[] newArray(int i11) {
            return new DisplayedArticle[i11];
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
        if (!(other instanceof DisplayedArticle)) {
            return false;
        }
        DisplayedArticle displayedArticle = (DisplayedArticle) other;
        return this.id == displayedArticle.id && this.displayed == displayedArticle.displayed;
    }

    public static /* synthetic */ DisplayedArticle copy$default(DisplayedArticle displayedArticle, long j11, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = displayedArticle.id;
        }
        if ((i11 & 2) != 0) {
            z11 = displayedArticle.displayed;
        }
        return displayedArticle.copy(j11, z11);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getDisplayed() {
        return this.displayed;
    }

    @NotNull
    public final DisplayedArticle copy(long id2, boolean displayed) {
        return new DisplayedArticle(id2, displayed);
    }

    public final boolean getDisplayed() {
        return this.displayed;
    }

    public final long getId() {
        return this.id;
    }

    public int hashCode() {
        return (Long.hashCode(this.id) * 31) + Boolean.hashCode(this.displayed);
    }

    @NotNull
    public String toString() {
        return "DisplayedArticle(id=" + this.id + ", displayed=" + this.displayed + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeLong(this.id);
        dest.writeInt(this.displayed ? 1 : 0);
    }

    public DisplayedArticle(long j11, boolean z11) {
        this.id = j11;
        this.displayed = z11;
    }
}
