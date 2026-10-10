package com.sumsub.sns.internal.features.presentation.main;

import android.os.Parcel;
import android.os.Parcelable;
import com.sumsub.sns.internal.core.presentation.intro.IntroScene;
import com.sumsub.sns.internal.features.data.model.common.C29697t2;
import com.sumsub.sns.internal.features.data.model.common.Document;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.main.w */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31358w extends AbstractC31234Y {

    @NotNull
    public static final Parcelable.Creator<C31358w> CREATOR = new C31354v();

    /* JADX INFO: renamed from: c */
    public final Document f63551c;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C31358w) && Intrinsics.areEqual(this.f63551c, ((C31358w) obj).f63551c);
    }

    public C31358w(Document document) {
        super(new C29697t2(document.getType().f59014a, IntroScene.CONFIRMATION.getSceneName(), (String) null, (String) null, (Map) null, 60));
        this.f63551c = document;
    }

    public final int hashCode() {
        return this.f63551c.hashCode();
    }

    public final String toString() {
        return "ConfirmPhone(doc=" + this.f63551c + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        this.f63551c.writeToParcel(parcel, i11);
    }
}
