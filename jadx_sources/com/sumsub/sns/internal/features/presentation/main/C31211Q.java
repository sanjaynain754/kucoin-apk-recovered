package com.sumsub.sns.internal.features.presentation.main;

import android.os.Parcel;
import android.os.Parcelable;
import com.sumsub.sns.internal.core.presentation.intro.IntroScene;
import com.sumsub.sns.internal.features.data.model.common.C29697t2;
import com.sumsub.sns.internal.features.data.model.common.Document;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.main.Q */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31211Q extends AbstractC31234Y {

    @NotNull
    public static final Parcelable.Creator<C31211Q> CREATOR = new C31208P();

    /* JADX INFO: renamed from: c */
    public final Document f63119c;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C31211Q) && Intrinsics.areEqual(this.f63119c, ((C31211Q) obj).f63119c);
    }

    public C31211Q(Document document) {
        super(new C29697t2(document.getType().f59014a, IntroScene.SCAN_FRONTSIDE.getSceneName(), (String) null, (String) null, (Map) null, 60), 2);
        this.f63119c = document;
    }

    public final int hashCode() {
        return this.f63119c.hashCode();
    }

    public final String toString() {
        return "ProofOfAddress(doc=" + this.f63119c + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        this.f63119c.writeToParcel(parcel, i11);
    }
}
