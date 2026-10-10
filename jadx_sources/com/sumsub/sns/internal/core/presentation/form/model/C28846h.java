package com.sumsub.sns.internal.core.presentation.form.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.sumsub.sns.internal.features.data.model.common.remote.response.C29470F;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.core.presentation.form.model.h */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28846h extends AbstractC28841e0 {

    @NotNull
    public static final Parcelable.Creator<C28846h> CREATOR = new C28844g();

    /* JADX INFO: renamed from: d */
    public final String f58670d;

    /* JADX INFO: renamed from: e */
    public final String f58671e;

    /* JADX INFO: renamed from: f */
    public final String f58672f;

    /* JADX INFO: renamed from: g */
    public final C28850j f58673g;

    /* JADX INFO: renamed from: h */
    public final FormItem$Action$Type f58674h;

    /* JADX INFO: renamed from: i */
    public final String f58675i;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C28846h)) {
            return false;
        }
        C28846h c28846h = (C28846h) obj;
        return Intrinsics.areEqual(this.f58670d, c28846h.f58670d) && Intrinsics.areEqual(this.f58671e, c28846h.f58671e) && Intrinsics.areEqual(this.f58672f, c28846h.f58672f) && Intrinsics.areEqual(this.f58673g, c28846h.f58673g) && this.f58674h == c28846h.f58674h && Intrinsics.areEqual(this.f58675i, c28846h.f58675i);
    }

    public C28846h(String str, String str2, String str3, C28850j c28850j, FormItem$Action$Type formItem$Action$Type, String str4) {
        super(new C29470F(str4, str2, (String) null, (String) null, (Boolean) null, (String) null, (String) null, (String) null, (List) null, 1020));
        this.f58670d = str;
        this.f58671e = str2;
        this.f58672f = str3;
        this.f58673g = c28850j;
        this.f58674h = formItem$Action$Type;
        this.f58675i = str4;
    }

    @Override // com.sumsub.sns.internal.core.presentation.form.model.AbstractC28841e0
    /* JADX INFO: renamed from: d */
    public final String mo69643d() {
        return this.f58670d;
    }

    public final int hashCode() {
        int iHashCode = this.f58670d.hashCode() * 31;
        String str = this.f58671e;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f58672f;
        return this.f58675i.hashCode() + ((this.f58674h.hashCode() + ((this.f58673g.hashCode() + ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Action(sectionId=" + this.f58670d + ", text=" + this.f58671e + ", iconId=" + this.f58672f + ", action=" + this.f58673g + ", type=" + this.f58674h + ", itemId=" + this.f58675i + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        parcel.writeString(this.f58670d);
        parcel.writeString(this.f58671e);
        parcel.writeString(this.f58672f);
        C28850j c28850j = this.f58673g;
        parcel.writeString(c28850j.f58677a);
        parcel.writeString(c28850j.f58678b);
        parcel.writeString(this.f58674h.name());
        parcel.writeString(this.f58675i);
    }
}
