package com.kubi.quotefacade.entity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: MarketMenuEntity.kt */
/* JADX INFO: loaded from: classes12.dex */
@Keep
@Metadata(m90083d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0017\u001a\u00020\bHÆ\u0003J\t\u0010\u0018\u001a\u00020\u0006HÆ\u0003J?\u0010\u0019\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u0006HÆ\u0001J\u0006\u0010\u001a\u001a\u00020\u0006J\u0013\u0010\u001b\u001a\u00020\b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dHÖ\u0003J\t\u0010\u001e\u001a\u00020\u0006HÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001J\u0016\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u0006R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\t\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010¨\u0006%"}, m90084d2 = {"Lcom/kubi/quotefacade/entity/EtfLevel1;", "Landroid/os/Parcelable;", "concept", "", "nameA", "priority", "", "enabled", "", "count", "<init>", "(Ljava/lang/String;Ljava/lang/String;IZI)V", "getConcept", "()Ljava/lang/String;", "getNameA", "getPriority", "()I", "getEnabled", "()Z", "getCount", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class EtfLevel1 implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<EtfLevel1> CREATOR = new C21882a();

    @Nullable
    private final String concept;
    private final int count;
    private final boolean enabled;

    @Nullable
    private final String nameA;
    private final int priority;

    /* JADX INFO: renamed from: com.kubi.quotefacade.entity.EtfLevel1$a */
    /* JADX INFO: compiled from: MarketMenuEntity.kt */
    /* JADX INFO: loaded from: classes37.dex */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C21882a implements Parcelable.Creator<EtfLevel1> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final EtfLevel1 createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new EtfLevel1(parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt() != 0, parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final EtfLevel1[] newArray(int i11) {
            return new EtfLevel1[i11];
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
        if (!(other instanceof EtfLevel1)) {
            return false;
        }
        EtfLevel1 etfLevel1 = (EtfLevel1) other;
        return Intrinsics.areEqual(this.concept, etfLevel1.concept) && Intrinsics.areEqual(this.nameA, etfLevel1.nameA) && this.priority == etfLevel1.priority && this.enabled == etfLevel1.enabled && this.count == etfLevel1.count;
    }

    public static /* synthetic */ EtfLevel1 copy$default(EtfLevel1 etfLevel1, String str, String str2, int i11, boolean z11, int i12, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = etfLevel1.concept;
        }
        if ((i13 & 2) != 0) {
            str2 = etfLevel1.nameA;
        }
        if ((i13 & 4) != 0) {
            i11 = etfLevel1.priority;
        }
        if ((i13 & 8) != 0) {
            z11 = etfLevel1.enabled;
        }
        if ((i13 & 16) != 0) {
            i12 = etfLevel1.count;
        }
        int i14 = i12;
        int i15 = i11;
        return etfLevel1.copy(str, str2, i15, z11, i14);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getConcept() {
        return this.concept;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getNameA() {
        return this.nameA;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getPriority() {
        return this.priority;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getEnabled() {
        return this.enabled;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getCount() {
        return this.count;
    }

    @NotNull
    public final EtfLevel1 copy(@Nullable String concept, @Nullable String nameA, int priority, boolean enabled, int count) {
        return new EtfLevel1(concept, nameA, priority, enabled, count);
    }

    @Nullable
    public final String getConcept() {
        return this.concept;
    }

    public final int getCount() {
        return this.count;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    @Nullable
    public final String getNameA() {
        return this.nameA;
    }

    public final int getPriority() {
        return this.priority;
    }

    public int hashCode() {
        String str = this.concept;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.nameA;
        return ((((((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + Integer.hashCode(this.priority)) * 31) + Boolean.hashCode(this.enabled)) * 31) + Integer.hashCode(this.count);
    }

    @NotNull
    public String toString() {
        return "EtfLevel1(concept=" + this.concept + ", nameA=" + this.nameA + ", priority=" + this.priority + ", enabled=" + this.enabled + ", count=" + this.count + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.concept);
        dest.writeString(this.nameA);
        dest.writeInt(this.priority);
        dest.writeInt(this.enabled ? 1 : 0);
        dest.writeInt(this.count);
    }

    public EtfLevel1(@Nullable String str, @Nullable String str2, int i11, boolean z11, int i12) {
        this.concept = str;
        this.nameA = str2;
        this.priority = i11;
        this.enabled = z11;
        this.count = i12;
    }
}
