package com.sumsub.sns.internal.features.domain.documents;

import android.os.Parcel;
import android.os.Parcelable;
import com.sumsub.sentry.android.AbstractC27920h;
import com.sumsub.sns.internal.features.data.model.common.Document;
import com.sumsub.sns.internal.features.data.model.common.IdentitySide;
import com.sumsub.sns.internal.features.presentation.camera.photo.document.DocCapture$PreferredMode;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.domain.documents.M */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30119M implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<C30119M> CREATOR = new C30118L();

    /* JADX INFO: renamed from: a */
    public final boolean f60550a;

    /* JADX INFO: renamed from: b */
    public final Document f60551b;

    /* JADX INFO: renamed from: c */
    public final List f60552c;

    /* JADX INFO: renamed from: d */
    public final boolean f60553d;

    /* JADX INFO: renamed from: e */
    public final String f60554e;

    /* JADX INFO: renamed from: f */
    public final boolean f60555f;

    /* JADX INFO: renamed from: g */
    public final DocCapture$PreferredMode f60556g;

    /* JADX INFO: renamed from: h */
    public final String f60557h;

    /* JADX INFO: renamed from: i */
    public final boolean f60558i;

    public C30119M(boolean z11, Document document, List list, boolean z12, String str, boolean z13, DocCapture$PreferredMode docCapture$PreferredMode, String str2, boolean z14) {
        this.f60550a = z11;
        this.f60551b = document;
        this.f60552c = list;
        this.f60553d = z12;
        this.f60554e = str;
        this.f60555f = z13;
        this.f60556g = docCapture$PreferredMode;
        this.f60557h = str2;
        this.f60558i = z14;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C30119M)) {
            return false;
        }
        C30119M c30119m = (C30119M) obj;
        return this.f60550a == c30119m.f60550a && Intrinsics.areEqual(this.f60551b, c30119m.f60551b) && Intrinsics.areEqual(this.f60552c, c30119m.f60552c) && this.f60553d == c30119m.f60553d && Intrinsics.areEqual(this.f60554e, c30119m.f60554e) && this.f60555f == c30119m.f60555f && this.f60556g == c30119m.f60556g && Intrinsics.areEqual(this.f60557h, c30119m.f60557h) && this.f60558i == c30119m.f60558i;
    }

    public final int hashCode() {
        int iM69001a = AbstractC27920h.m69001a(this.f60553d, (this.f60552c.hashCode() + ((this.f60551b.hashCode() + (Boolean.hashCode(this.f60550a) * 31)) * 31)) * 31, 31);
        String str = this.f60554e;
        int iM69001a2 = AbstractC27920h.m69001a(this.f60555f, (iM69001a + (str == null ? 0 : str.hashCode())) * 31, 31);
        DocCapture$PreferredMode docCapture$PreferredMode = this.f60556g;
        int iHashCode = (iM69001a2 + (docCapture$PreferredMode == null ? 0 : docCapture$PreferredMode.hashCode())) * 31;
        String str2 = this.f60557h;
        return Boolean.hashCode(this.f60558i) + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "PickerRequest(isSeamless=" + this.f60550a + ", document=" + this.f60551b + ", sides=" + this.f60552c + ", gallery=" + this.f60553d + ", identityType=" + this.f60554e + ", retake=" + this.f60555f + ", preferredMode=" + this.f60556g + ", countryCode=" + this.f60557h + ", allowInPlaceUpload=" + this.f60558i + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        parcel.writeInt(this.f60550a ? 1 : 0);
        this.f60551b.writeToParcel(parcel, i11);
        List list = this.f60552c;
        parcel.writeInt(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            parcel.writeString(((IdentitySide) it.next()).name());
        }
        parcel.writeInt(this.f60553d ? 1 : 0);
        parcel.writeString(this.f60554e);
        parcel.writeInt(this.f60555f ? 1 : 0);
        DocCapture$PreferredMode docCapture$PreferredMode = this.f60556g;
        if (docCapture$PreferredMode == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(docCapture$PreferredMode.name());
        }
        parcel.writeString(this.f60557h);
        parcel.writeInt(this.f60558i ? 1 : 0);
    }

    public /* synthetic */ C30119M(boolean z11, Document document, List list, boolean z12, boolean z13, DocCapture$PreferredMode docCapture$PreferredMode, String str, boolean z14, int i11) {
        this(z11, document, list, z12, (String) null, z13, docCapture$PreferredMode, str, (i11 & 256) != 0 ? false : z14);
    }
}
