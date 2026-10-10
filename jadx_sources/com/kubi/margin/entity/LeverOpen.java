package com.kubi.margin.entity;

import android.os.Parcel;
import android.os.Parcelable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: LeverBean.kt */
/* JADX INFO: loaded from: classes27.dex */
@Metadata(m90083d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0007J\u001a\u0010\n\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u000bJ\u0006\u0010\f\u001a\u00020\rJ\u0013\u0010\u000e\u001a\u00020\u00032\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\rHÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\u0016\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\rR\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0019"}, m90084d2 = {"Lcom/kubi/margin/entity/LeverOpen;", "Landroid/os/Parcelable;", "hasFreshmanPackage", "", "<init>", "(Ljava/lang/Boolean;)V", "getHasFreshmanPackage", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "copy", "(Ljava/lang/Boolean;)Lcom/kubi/margin/entity/LeverOpen;", "describeContents", "", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "MarginLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class LeverOpen implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<LeverOpen> CREATOR = new C17619a();

    @Nullable
    private final Boolean hasFreshmanPackage;

    /* JADX INFO: renamed from: com.kubi.margin.entity.LeverOpen$a */
    /* JADX INFO: compiled from: LeverBean.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C17619a implements Parcelable.Creator<LeverOpen> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final LeverOpen createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new LeverOpen(boolValueOf);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final LeverOpen[] newArray(int i11) {
            return new LeverOpen[i11];
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
        return (other instanceof LeverOpen) && Intrinsics.areEqual(this.hasFreshmanPackage, ((LeverOpen) other).hasFreshmanPackage);
    }

    public static /* synthetic */ LeverOpen copy$default(LeverOpen leverOpen, Boolean bool, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            bool = leverOpen.hasFreshmanPackage;
        }
        return leverOpen.copy(bool);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Boolean getHasFreshmanPackage() {
        return this.hasFreshmanPackage;
    }

    @NotNull
    public final LeverOpen copy(@Nullable Boolean hasFreshmanPackage) {
        return new LeverOpen(hasFreshmanPackage);
    }

    @Nullable
    public final Boolean getHasFreshmanPackage() {
        return this.hasFreshmanPackage;
    }

    public int hashCode() {
        Boolean bool = this.hasFreshmanPackage;
        if (bool == null) {
            return 0;
        }
        return bool.hashCode();
    }

    @NotNull
    public String toString() {
        return "LeverOpen(hasFreshmanPackage=" + this.hasFreshmanPackage + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        Boolean bool = this.hasFreshmanPackage;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(bool.booleanValue() ? 1 : 0);
        }
    }

    public LeverOpen(@Nullable Boolean bool) {
        this.hasFreshmanPackage = bool;
    }
}
