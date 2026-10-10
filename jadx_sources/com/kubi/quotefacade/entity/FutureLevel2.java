package com.kubi.quotefacade.entity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: MarketMenuEntity.kt */
/* JADX INFO: loaded from: classes12.dex */
@Keep
@Metadata(m90083d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0012\n\u0002\u0010\u0000\n\u0002\b\r\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BE\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\r\u0010\u000eJ\u0013\u0010\u001d\u001a\u00020\t2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0096\u0002J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0006HÆ\u0003J\t\u0010#\u001a\u00020\u0006HÆ\u0003J\t\u0010$\u001a\u00020\tHÆ\u0003J\t\u0010%\u001a\u00020\tHÆ\u0003J\u0010\u0010&\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u0010\u0019JZ\u0010'\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fHÆ\u0001¢\u0006\u0002\u0010(J\u0006\u0010)\u001a\u00020\u0006J\t\u0010*\u001a\u00020\u0006HÖ\u0001J\t\u0010+\u001a\u00020\u0003HÖ\u0001J\u0016\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020/2\u0006\u00100\u001a\u00020\u0006R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\n\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u001e\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001c\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b¨\u00061"}, m90084d2 = {"Lcom/kubi/quotefacade/entity/FutureLevel2;", "Landroid/os/Parcelable;", "concept", "", "nameAMultiLang", "priority", "", "count", "enabled", "", "hot", "time", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;IIZZLjava/lang/Long;)V", "getConcept", "()Ljava/lang/String;", "getNameAMultiLang", "getPriority", "()I", "getCount", "getEnabled", "()Z", "getHot", "getTime", "()Ljava/lang/Long;", "setTime", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "equals", "other", "", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Ljava/lang/String;Ljava/lang/String;IIZZLjava/lang/Long;)Lcom/kubi/quotefacade/entity/FutureLevel2;", "describeContents", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class FutureLevel2 implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<FutureLevel2> CREATOR = new C21886a();

    @Nullable
    private final String concept;
    private final int count;
    private final boolean enabled;
    private final boolean hot;

    @SerializedName("nameA_multi_lang")
    @Nullable
    private final String nameAMultiLang;
    private final int priority;

    @Nullable
    private Long time;

    /* JADX INFO: renamed from: com.kubi.quotefacade.entity.FutureLevel2$a */
    /* JADX INFO: compiled from: MarketMenuEntity.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C21886a implements Parcelable.Creator<FutureLevel2> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final FutureLevel2 createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            int i11 = parcel.readInt();
            int i12 = parcel.readInt();
            boolean z11 = false;
            if (parcel.readInt() != 0) {
                z11 = true;
            }
            return new FutureLevel2(string, string2, i11, i12, z11, parcel.readInt() != 0, parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()));
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final FutureLevel2[] newArray(int i11) {
            return new FutureLevel2[i11];
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
        if (!(other instanceof FutureLevel2)) {
            return false;
        }
        FutureLevel2 futureLevel2 = (FutureLevel2) other;
        return Intrinsics.areEqual(this.concept, futureLevel2.concept) && Intrinsics.areEqual(this.nameAMultiLang, futureLevel2.nameAMultiLang) && this.priority == futureLevel2.priority && this.count == futureLevel2.count && this.enabled == futureLevel2.enabled && this.hot == futureLevel2.hot;
    }

    public static /* synthetic */ FutureLevel2 copy$default(FutureLevel2 futureLevel2, String str, String str2, int i11, int i12, boolean z11, boolean z12, Long l11, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = futureLevel2.concept;
        }
        if ((i13 & 2) != 0) {
            str2 = futureLevel2.nameAMultiLang;
        }
        if ((i13 & 4) != 0) {
            i11 = futureLevel2.priority;
        }
        if ((i13 & 8) != 0) {
            i12 = futureLevel2.count;
        }
        if ((i13 & 16) != 0) {
            z11 = futureLevel2.enabled;
        }
        if ((i13 & 32) != 0) {
            z12 = futureLevel2.hot;
        }
        if ((i13 & 64) != 0) {
            l11 = futureLevel2.time;
        }
        boolean z13 = z12;
        Long l12 = l11;
        boolean z14 = z11;
        int i14 = i11;
        return futureLevel2.copy(str, str2, i14, i12, z14, z13, l12);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getConcept() {
        return this.concept;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getNameAMultiLang() {
        return this.nameAMultiLang;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getPriority() {
        return this.priority;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getCount() {
        return this.count;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getEnabled() {
        return this.enabled;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final boolean getHot() {
        return this.hot;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Long getTime() {
        return this.time;
    }

    @NotNull
    public final FutureLevel2 copy(@Nullable String concept, @Nullable String nameAMultiLang, int priority, int count, boolean enabled, boolean hot, @Nullable Long time) {
        return new FutureLevel2(concept, nameAMultiLang, priority, count, enabled, hot, time);
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

    public final boolean getHot() {
        return this.hot;
    }

    @Nullable
    public final String getNameAMultiLang() {
        return this.nameAMultiLang;
    }

    public final int getPriority() {
        return this.priority;
    }

    @Nullable
    public final Long getTime() {
        return this.time;
    }

    public int hashCode() {
        String str = this.concept;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.nameAMultiLang;
        int iHashCode2 = (((((((((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31) + Integer.hashCode(this.priority)) * 31) + Integer.hashCode(this.count)) * 31) + Boolean.hashCode(this.enabled)) * 31) + Boolean.hashCode(this.hot)) * 31;
        Long l11 = this.time;
        return iHashCode2 + (l11 != null ? l11.hashCode() : 0);
    }

    public final void setTime(@Nullable Long l11) {
        this.time = l11;
    }

    @NotNull
    public String toString() {
        return "FutureLevel2(concept=" + this.concept + ", nameAMultiLang=" + this.nameAMultiLang + ", priority=" + this.priority + ", count=" + this.count + ", enabled=" + this.enabled + ", hot=" + this.hot + ", time=" + this.time + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.concept);
        dest.writeString(this.nameAMultiLang);
        dest.writeInt(this.priority);
        dest.writeInt(this.count);
        dest.writeInt(this.enabled ? 1 : 0);
        dest.writeInt(this.hot ? 1 : 0);
        Long l11 = this.time;
        if (l11 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeLong(l11.longValue());
        }
    }

    public FutureLevel2(@Nullable String str, @Nullable String str2, int i11, int i12, boolean z11, boolean z12, @Nullable Long l11) {
        this.concept = str;
        this.nameAMultiLang = str2;
        this.priority = i11;
        this.count = i12;
        this.enabled = z11;
        this.hot = z12;
        this.time = l11;
    }
}
