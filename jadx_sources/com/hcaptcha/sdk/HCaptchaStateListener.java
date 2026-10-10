package com.hcaptcha.sdk;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes56.dex */
abstract class HCaptchaStateListener implements Parcelable {
    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public abstract void onFailure(HCaptchaException hCaptchaException);

    public abstract void onOpen();

    public abstract void onSuccess(String str);

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
    }
}
