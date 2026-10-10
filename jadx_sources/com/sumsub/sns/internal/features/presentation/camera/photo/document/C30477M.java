package com.sumsub.sns.internal.features.presentation.camera.photo.document;

import com.sumsub.sentry.android.AbstractC27920h;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.camera.photo.document.M */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30477M {

    /* JADX INFO: renamed from: a */
    public final String f61511a;

    /* JADX INFO: renamed from: b */
    public final boolean f61512b;

    /* JADX INFO: renamed from: c */
    public final SNSPhotoDocumentPickerViewModel$AutoCaptureHint$State f61513c;

    public C30477M(String str, boolean z11, SNSPhotoDocumentPickerViewModel$AutoCaptureHint$State sNSPhotoDocumentPickerViewModel$AutoCaptureHint$State) {
        this.f61511a = str;
        this.f61512b = z11;
        this.f61513c = sNSPhotoDocumentPickerViewModel$AutoCaptureHint$State;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C30477M)) {
            return false;
        }
        C30477M c30477m = (C30477M) obj;
        return Intrinsics.areEqual(this.f61511a, c30477m.f61511a) && this.f61512b == c30477m.f61512b && this.f61513c == c30477m.f61513c;
    }

    public final int hashCode() {
        return this.f61513c.hashCode() + AbstractC27920h.m69001a(this.f61512b, this.f61511a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "AutoCaptureHint(hint=" + this.f61511a + ", loading=" + this.f61512b + ", state=" + this.f61513c + ")";
    }

    public C30477M() {
        SNSPhotoDocumentPickerViewModel$AutoCaptureHint$State sNSPhotoDocumentPickerViewModel$AutoCaptureHint$State = SNSPhotoDocumentPickerViewModel$AutoCaptureHint$State.DEFAULT;
        this.f61511a = "";
        this.f61512b = false;
        this.f61513c = sNSPhotoDocumentPickerViewModel$AutoCaptureHint$State;
    }
}
