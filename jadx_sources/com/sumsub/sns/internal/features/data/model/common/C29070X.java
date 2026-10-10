package com.sumsub.sns.internal.features.data.model.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.remoteconfig.RemoteConfigComponent;
import com.sumsub.sns.internal.features.data.repository.dynamic.C29983l;
import java.util.Arrays;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.jvm.internal.StringCompanionObject;
import p852kotlin.text.StringsKt;
import tg0.InterfaceC44962o;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.model.common.X */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@SourceDebugExtension({"SMAP\nDocumentType.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DocumentType.kt\ncom/sumsub/sns/internal/features/data/model/common/DocumentType\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,234:1\n1#2:235\n*E\n"})
@InterfaceC44962o(with = C29058U.class)
public final class C29070X implements Parcelable {

    /* JADX INFO: renamed from: a */
    public final String f59014a;

    @NotNull
    public static final C29062V Companion = new C29062V();

    @NotNull
    public static final Parcelable.Creator<C29070X> CREATOR = new C29066W();

    /* JADX INFO: renamed from: b */
    public final String m69745b(C29983l c29983l) {
        if (c29983l == null) {
            return "";
        }
        Map map = c29983l.f60248a;
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str = (String) map.get(String.format("sns_step_%s_title", Arrays.copyOf(new Object[]{this.f59014a}, 1)));
        if (str == null || str.length() == 0) {
            if (m69747d()) {
                str = (String) map.get(String.format("sns_step_%s_title", Arrays.copyOf(new Object[]{"IDENTITY"}, 1)));
            } else if (m69749f()) {
                str = (String) map.get(String.format("sns_step_%s_title", Arrays.copyOf(new Object[]{"SELFIE"}, 1)));
            } else if (m69746c()) {
                str = (String) map.get(String.format("sns_step_%s_title", Arrays.copyOf(new Object[]{"APPLICANT_DATA"}, 1)));
            } else {
                str = StringsKt.startsWith$default(this.f59014a, "QUESTIONNAIRE", false, 2, (Object) null) ? (String) map.get(String.format("sns_step_%s_title", Arrays.copyOf(new Object[]{"QUESTIONNAIRE"}, 1))) : this.f59014a;
            }
        }
        return str != null ? str : this.f59014a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C29070X) && Intrinsics.areEqual(this.f59014a, ((C29070X) obj).f59014a);
    }

    /* JADX INFO: renamed from: a */
    public final String m69743a(C29983l c29983l) {
        if (c29983l == null) {
            return "";
        }
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String strM70062a = c29983l.m70062a(String.format("sns_step_%s_prompt", Arrays.copyOf(new Object[]{this.f59014a}, 1)), String.format("sns_step_%s_prompt", Arrays.copyOf(new Object[]{this.f59014a}, 1)), String.format("sns_step_%s_prompt", Arrays.copyOf(new Object[]{RemoteConfigComponent.DEFAULTS_FILE_NAME}, 1)));
        if (strM70062a.length() <= 0) {
            strM70062a = null;
        }
        return strM70062a != null ? strM70062a : this.f59014a;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m69746c() {
        return StringsKt.startsWith$default(this.f59014a, "APPLICANT_DATA", false, 2, (Object) null);
    }

    /* JADX INFO: renamed from: d */
    public final boolean m69747d() {
        return StringsKt.startsWith$default(this.f59014a, "IDENTITY", false, 2, (Object) null);
    }

    /* JADX INFO: renamed from: e */
    public final boolean m69748e() {
        return StringsKt.startsWith$default(this.f59014a, "PROOF_OF_RESIDENCE", false, 2, (Object) null);
    }

    /* JADX INFO: renamed from: f */
    public final boolean m69749f() {
        return StringsKt.startsWith$default(this.f59014a, "SELFIE", false, 2, (Object) null);
    }

    public final int hashCode() {
        return this.f59014a.hashCode();
    }

    public final String toString() {
        return "DocumentType(value=" + this.f59014a + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        parcel.writeString(this.f59014a);
    }

    public C29070X(String str) {
        this.f59014a = str;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m69750g() {
        if (!m69747d() && !m69749f() && !m69748e() && !m69746c() && !StringsKt.startsWith$default(this.f59014a, "PHONE_VERIFICATION", false, 2, (Object) null) && !StringsKt.startsWith$default(this.f59014a, "EMAIL_VERIFICATION", false, 2, (Object) null) && !StringsKt.startsWith$default(this.f59014a, "QUESTIONNAIRE", false, 2, (Object) null) && !StringsKt.startsWith$default(this.f59014a, "E_KYC", false, 2, (Object) null) && !StringsKt.startsWith$default(this.f59014a, "PAYMENT_METHODS", false, 2, (Object) null)) {
            return false;
        }
        return true;
    }

    /* JADX INFO: renamed from: b */
    public final String m69744b() {
        return "DocType/" + this.f59014a;
    }
}
