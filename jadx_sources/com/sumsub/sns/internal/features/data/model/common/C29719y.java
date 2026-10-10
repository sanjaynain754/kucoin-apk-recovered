package com.sumsub.sns.internal.features.data.model.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.sumsub.sentry.android.AbstractC27920h;
import java.util.List;
import kotlinx.serialization.internal.C41801c2;
import kotlinx.serialization.internal.C41813f;
import kotlinx.serialization.internal.C41829i0;
import kotlinx.serialization.internal.C41897w2;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.LazyThreadSafetyMode;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import tg0.InterfaceC44951d;
import tg0.InterfaceC44962o;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.model.common.y */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@SourceDebugExtension({"SMAP\nApplicantDataField.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ApplicantDataField.kt\ncom/sumsub/sns/internal/features/data/model/common/ApplicantDataField$Field\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,408:1\n1#2:409\n*E\n"})
@InterfaceC44962o
public final class C29719y extends AbstractC28990D implements Parcelable {

    /* JADX INFO: renamed from: k */
    public static final Lazy[] f59780k;

    /* JADX INFO: renamed from: b */
    public final AbstractC29103d2 f59781b;

    /* JADX INFO: renamed from: c */
    public final boolean f59782c;

    /* JADX INFO: renamed from: d */
    public final FieldType f59783d;

    /* JADX INFO: renamed from: e */
    public final String f59784e;

    /* JADX INFO: renamed from: f */
    public final List f59785f;

    /* JADX INFO: renamed from: g */
    public final AbstractC29028M0 f59786g;

    /* JADX INFO: renamed from: h */
    public final String f59787h;

    /* JADX INFO: renamed from: i */
    public final Boolean f59788i;

    /* JADX INFO: renamed from: j */
    public final String f59789j;

    @NotNull
    public static final C29709w Companion = new C29709w();

    @NotNull
    public static final Parcelable.Creator<C29719y> CREATOR = new C29714x();

    public /* synthetic */ C29719y(int i11, AbstractC29103d2 abstractC29103d2, boolean z11, FieldType fieldType, String str, List list, AbstractC29028M0 abstractC29028M0, String str2, Boolean bool, String str3) {
        if (3 != (i11 & 3)) {
            C41801c2.m91514a(i11, 3, C29704v.f59768a.getDescriptor());
        }
        this.f59781b = abstractC29103d2;
        this.f59782c = z11;
        if ((i11 & 4) == 0) {
            this.f59783d = null;
        } else {
            this.f59783d = fieldType;
        }
        if ((i11 & 8) == 0) {
            this.f59784e = null;
        } else {
            this.f59784e = str;
        }
        if ((i11 & 16) == 0) {
            this.f59785f = null;
        } else {
            this.f59785f = list;
        }
        if ((i11 & 32) == 0) {
            this.f59786g = null;
        } else {
            this.f59786g = abstractC29028M0;
        }
        if ((i11 & 64) == 0) {
            this.f59787h = null;
        } else {
            this.f59787h = str2;
        }
        if ((i11 & 128) == 0) {
            this.f59788i = null;
        } else {
            this.f59788i = bool;
        }
        if ((i11 & 256) == 0) {
            this.f59789j = null;
        } else {
            this.f59789j = str3;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C29719y)) {
            return false;
        }
        C29719y c29719y = (C29719y) obj;
        return Intrinsics.areEqual(this.f59781b, c29719y.f59781b) && this.f59782c == c29719y.f59782c && this.f59783d == c29719y.f59783d && Intrinsics.areEqual(this.f59784e, c29719y.f59784e) && Intrinsics.areEqual(this.f59785f, c29719y.f59785f) && Intrinsics.areEqual(this.f59786g, c29719y.f59786g) && Intrinsics.areEqual(this.f59787h, c29719y.f59787h) && Intrinsics.areEqual(this.f59788i, c29719y.f59788i) && Intrinsics.areEqual(this.f59789j, c29719y.f59789j);
    }

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        f59780k = new Lazy[]{null, null, LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: com.sumsub.sns.internal.features.data.model.common.n4
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C41829i0.m91592b("com.sumsub.sns.internal.features.data.model.common.FieldType", FieldType.values());
            }
        }), null, LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: com.sumsub.sns.internal.features.data.model.common.o4
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C29719y.m69912e();
            }
        }), null, null, null, null};
    }

    public /* synthetic */ C29719y(AbstractC29103d2 abstractC29103d2, boolean z11, String str, Boolean bool, int i11) {
        this(abstractC29103d2, z11, null, null, null, null, (i11 & 64) != 0 ? null : str, (i11 & 128) != 0 ? null : bool, null);
    }

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ InterfaceC44951d m69912e() {
        return new C41813f(C41897w2.f92051a);
    }

    @Override // com.sumsub.sns.internal.features.data.model.common.AbstractC28990D
    /* JADX INFO: renamed from: c */
    public final String mo69727c() {
        String strMo69715b;
        AbstractC29103d2 abstractC29103d2 = this.f59781b;
        return (abstractC29103d2 == null || (strMo69715b = abstractC29103d2.mo69715b()) == null) ? "" : strMo69715b;
    }

    public final int hashCode() {
        AbstractC29103d2 abstractC29103d2 = this.f59781b;
        int iM69001a = AbstractC27920h.m69001a(this.f59782c, (abstractC29103d2 == null ? 0 : abstractC29103d2.hashCode()) * 31, 31);
        FieldType fieldType = this.f59783d;
        int iHashCode = (iM69001a + (fieldType == null ? 0 : fieldType.hashCode())) * 31;
        String str = this.f59784e;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        List list = this.f59785f;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        AbstractC29028M0 abstractC29028M0 = this.f59786g;
        int iHashCode4 = (iHashCode3 + (abstractC29028M0 == null ? 0 : abstractC29028M0.hashCode())) * 31;
        String str2 = this.f59787h;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.f59788i;
        int iHashCode6 = (iHashCode5 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str3 = this.f59789j;
        return iHashCode6 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        return "Field(name=" + this.f59781b + ", isRequired=" + this.f59782c + ", type=" + this.f59783d + ", mask=" + this.f59784e + ", masks=" + this.f59785f + ", format=" + this.f59786g + ", placeholder=" + this.f59787h + ", isImmutableIfPresent=" + this.f59788i + ", path=" + this.f59789j + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        parcel.writeParcelable(this.f59781b, i11);
        parcel.writeInt(this.f59782c ? 1 : 0);
        FieldType fieldType = this.f59783d;
        if (fieldType == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(fieldType.name());
        }
        parcel.writeString(this.f59784e);
        parcel.writeStringList(this.f59785f);
        parcel.writeParcelable(this.f59786g, i11);
        parcel.writeString(this.f59787h);
        Boolean bool = this.f59788i;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        parcel.writeString(this.f59789j);
    }

    public C29719y(AbstractC29103d2 abstractC29103d2, boolean z11, FieldType fieldType, String str, List list, AbstractC29028M0 abstractC29028M0, String str2, Boolean bool, String str3) {
        super(0);
        this.f59781b = abstractC29103d2;
        this.f59782c = z11;
        this.f59783d = fieldType;
        this.f59784e = str;
        this.f59785f = list;
        this.f59786g = abstractC29028M0;
        this.f59787h = str2;
        this.f59788i = bool;
        this.f59789j = str3;
    }
}
