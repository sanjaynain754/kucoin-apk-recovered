package com.sumsub.sns.internal.core.presentation.form.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.sumsub.sns.internal.core.common.AbstractC28458h;
import com.sumsub.sns.internal.features.data.model.common.remote.response.C29470F;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.core.presentation.form.model.G */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28813G extends AbstractC28841e0 {

    @NotNull
    public static final Parcelable.Creator<C28813G> CREATOR = new C28812F();

    /* JADX INFO: renamed from: d */
    public final String f58590d;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C28813G) && Intrinsics.areEqual(this.f58590d, ((C28813G) obj).f58590d);
    }

    public C28813G(String str) {
        super(new C29470F("indent_" + AbstractC28458h.m69333a(AbstractC28841e0.f58666c), (String) null, (String) null, (String) null, (Boolean) null, (String) null, (String) null, (String) null, (List) null, 1022));
        this.f58590d = str;
    }

    @Override // com.sumsub.sns.internal.core.presentation.form.model.AbstractC28841e0
    /* JADX INFO: renamed from: d */
    public final String mo69643d() {
        return this.f58590d;
    }

    public final int hashCode() {
        return this.f58590d.hashCode();
    }

    public final String toString() {
        return "Indent(sectionId=" + this.f58590d + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        parcel.writeString(this.f58590d);
    }
}
