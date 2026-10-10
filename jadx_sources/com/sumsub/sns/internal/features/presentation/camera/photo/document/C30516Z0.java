package com.sumsub.sns.internal.features.presentation.camera.photo.document;

import com.sumsub.sentry.android.AbstractC27920h;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.camera.photo.document.Z0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30516Z0 {

    /* JADX INFO: renamed from: a */
    public final String f61624a;

    /* JADX INFO: renamed from: b */
    public final boolean f61625b;

    /* JADX INFO: renamed from: c */
    public final SNSPhotoDocumentPickerViewModel2$AutoCaptureHint$State f61626c;

    public C30516Z0(String str, boolean z11, SNSPhotoDocumentPickerViewModel2$AutoCaptureHint$State sNSPhotoDocumentPickerViewModel2$AutoCaptureHint$State) {
        this.f61624a = str;
        this.f61625b = z11;
        this.f61626c = sNSPhotoDocumentPickerViewModel2$AutoCaptureHint$State;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C30516Z0)) {
            return false;
        }
        C30516Z0 c30516z0 = (C30516Z0) obj;
        return Intrinsics.areEqual(this.f61624a, c30516z0.f61624a) && this.f61625b == c30516z0.f61625b && this.f61626c == c30516z0.f61626c;
    }

    public final int hashCode() {
        return this.f61626c.hashCode() + AbstractC27920h.m69001a(this.f61625b, this.f61624a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "AutoCaptureHint(hint=" + this.f61624a + ", loading=" + this.f61625b + ", state=" + this.f61626c + ")";
    }

    public C30516Z0(String str, int i11) {
        str = (i11 & 1) != 0 ? "" : str;
        SNSPhotoDocumentPickerViewModel2$AutoCaptureHint$State sNSPhotoDocumentPickerViewModel2$AutoCaptureHint$State = SNSPhotoDocumentPickerViewModel2$AutoCaptureHint$State.DEFAULT;
        this.f61624a = str;
        this.f61625b = false;
        this.f61626c = sNSPhotoDocumentPickerViewModel2$AutoCaptureHint$State;
    }
}
