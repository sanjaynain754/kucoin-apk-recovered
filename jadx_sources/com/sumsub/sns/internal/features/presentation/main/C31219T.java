package com.sumsub.sns.internal.features.presentation.main;

import android.os.Parcel;
import android.os.Parcelable;
import com.sumsub.sns.internal.core.presentation.intro.IntroScene;
import com.sumsub.sns.internal.features.data.model.common.C29697t2;
import com.sumsub.sns.internal.features.data.model.common.Document;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.main.T */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31219T extends AbstractC31234Y {

    @NotNull
    public static final Parcelable.Creator<C31219T> CREATOR = new C31216S();

    /* JADX INFO: renamed from: c */
    public final Document f63151c;

    /* JADX INFO: renamed from: d */
    public final String f63152d;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C31219T)) {
            return false;
        }
        C31219T c31219t = (C31219T) obj;
        return Intrinsics.areEqual(this.f63151c, c31219t.f63151c) && Intrinsics.areEqual(this.f63152d, c31219t.f63152d);
    }

    public C31219T(Document document, String str) {
        super(new C29697t2(document.getType().f59014a, IntroScene.QUESTIONNAIRE.getSceneName(), (String) null, (String) null, (Map) null, 60));
        this.f63151c = document;
        this.f63152d = str;
    }

    public final int hashCode() {
        int iHashCode = this.f63151c.hashCode() * 31;
        String str = this.f63152d;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "Questionnaire(doc=" + this.f63151c + ", questionnaireId=" + this.f63152d + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        this.f63151c.writeToParcel(parcel, i11);
        parcel.writeString(this.f63152d);
    }
}
