package com.kubi.quotefacade.entity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: MarketMenuEntity.kt */
/* JADX INFO: loaded from: classes12.dex */
@Keep
@Metadata(m90083d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001a\u001a\u00020\bHÆ\u0003J\u0011\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nHÆ\u0003JG\u0010\u001c\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nHÆ\u0001J\u0006\u0010\u001d\u001a\u00020\u0006J\u0013\u0010\u001e\u001a\u00020\b2\b\u0010\u001f\u001a\u0004\u0018\u00010 HÖ\u0003J\t\u0010!\u001a\u00020\u0006HÖ\u0001J\t\u0010\"\u001a\u00020\u0003HÖ\u0001J\u0016\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020\u0006R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006("}, m90084d2 = {"Lcom/kubi/quotefacade/entity/FutureLevel1;", "Landroid/os/Parcelable;", "quoteCrypto", "", "nameAMultiLang", "priority", "", "enabled", "", "level2", "", "Lcom/kubi/quotefacade/entity/FutureLevel2;", "<init>", "(Ljava/lang/String;Ljava/lang/String;IZLjava/util/List;)V", "getQuoteCrypto", "()Ljava/lang/String;", "getNameAMultiLang", "getPriority", "()I", "getEnabled", "()Z", "getLevel2", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class FutureLevel1 implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<FutureLevel1> CREATOR = new C21885a();
    private final boolean enabled;

    @Nullable
    private final List<FutureLevel2> level2;

    @SerializedName("nameA_multi_lang")
    @Nullable
    private final String nameAMultiLang;
    private final int priority;

    @Nullable
    private final String quoteCrypto;

    /* JADX INFO: renamed from: com.kubi.quotefacade.entity.FutureLevel1$a */
    /* JADX INFO: compiled from: MarketMenuEntity.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C21885a implements Parcelable.Creator<FutureLevel1> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final FutureLevel1 createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            int i11 = parcel.readInt();
            boolean z11 = parcel.readInt() != 0;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                arrayList = new ArrayList(i12);
                for (int i13 = 0; i13 != i12; i13++) {
                    arrayList.add(FutureLevel2.CREATOR.createFromParcel(parcel));
                }
            }
            return new FutureLevel1(string, string2, i11, z11, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final FutureLevel1[] newArray(int i11) {
            return new FutureLevel1[i11];
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
        if (!(other instanceof FutureLevel1)) {
            return false;
        }
        FutureLevel1 futureLevel1 = (FutureLevel1) other;
        return Intrinsics.areEqual(this.quoteCrypto, futureLevel1.quoteCrypto) && Intrinsics.areEqual(this.nameAMultiLang, futureLevel1.nameAMultiLang) && this.priority == futureLevel1.priority && this.enabled == futureLevel1.enabled && Intrinsics.areEqual(this.level2, futureLevel1.level2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FutureLevel1 copy$default(FutureLevel1 futureLevel1, String str, String str2, int i11, boolean z11, List list, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = futureLevel1.quoteCrypto;
        }
        if ((i12 & 2) != 0) {
            str2 = futureLevel1.nameAMultiLang;
        }
        if ((i12 & 4) != 0) {
            i11 = futureLevel1.priority;
        }
        if ((i12 & 8) != 0) {
            z11 = futureLevel1.enabled;
        }
        if ((i12 & 16) != 0) {
            list = futureLevel1.level2;
        }
        List list2 = list;
        int i13 = i11;
        return futureLevel1.copy(str, str2, i13, z11, list2);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getQuoteCrypto() {
        return this.quoteCrypto;
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
    public final boolean getEnabled() {
        return this.enabled;
    }

    @Nullable
    public final List<FutureLevel2> component5() {
        return this.level2;
    }

    @NotNull
    public final FutureLevel1 copy(@Nullable String quoteCrypto, @Nullable String nameAMultiLang, int priority, boolean enabled, @Nullable List<FutureLevel2> level2) {
        return new FutureLevel1(quoteCrypto, nameAMultiLang, priority, enabled, level2);
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    @Nullable
    public final List<FutureLevel2> getLevel2() {
        return this.level2;
    }

    @Nullable
    public final String getNameAMultiLang() {
        return this.nameAMultiLang;
    }

    public final int getPriority() {
        return this.priority;
    }

    @Nullable
    public final String getQuoteCrypto() {
        return this.quoteCrypto;
    }

    public int hashCode() {
        String str = this.quoteCrypto;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.nameAMultiLang;
        int iHashCode2 = (((((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31) + Integer.hashCode(this.priority)) * 31) + Boolean.hashCode(this.enabled)) * 31;
        List<FutureLevel2> list = this.level2;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "FutureLevel1(quoteCrypto=" + this.quoteCrypto + ", nameAMultiLang=" + this.nameAMultiLang + ", priority=" + this.priority + ", enabled=" + this.enabled + ", level2=" + this.level2 + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.quoteCrypto);
        dest.writeString(this.nameAMultiLang);
        dest.writeInt(this.priority);
        dest.writeInt(this.enabled ? 1 : 0);
        List<FutureLevel2> list = this.level2;
        if (list == null) {
            dest.writeInt(0);
            return;
        }
        dest.writeInt(1);
        dest.writeInt(list.size());
        Iterator<FutureLevel2> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(dest, flags);
        }
    }

    public FutureLevel1(@Nullable String str, @Nullable String str2, int i11, boolean z11, @Nullable List<FutureLevel2> list) {
        this.quoteCrypto = str;
        this.nameAMultiLang = str2;
        this.priority = i11;
        this.enabled = z11;
        this.level2 = list;
    }
}
