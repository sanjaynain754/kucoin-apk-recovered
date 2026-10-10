package androidx.camera.core.impl.compat;

import android.media.CamcorderProfile;
import android.media.EncoderProfiles;
import android.os.Build;
import androidx.annotation.RequiresApi;
import androidx.camera.core.Logger;
import androidx.camera.core.impl.EncoderProfilesProxy;

/* JADX INFO: loaded from: classes23.dex */
public final class EncoderProfilesProxyCompat {
    private static final String TAG = "EncoderProfilesProxyCompat";

    @RequiresApi(31)
    public static EncoderProfilesProxy from(EncoderProfiles encoderProfiles) {
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 33) {
            return EncoderProfilesProxyCompatApi33Impl.from(encoderProfiles);
        }
        if (i11 >= 31) {
            return EncoderProfilesProxyCompatApi31Impl.from(encoderProfiles);
        }
        throw new RuntimeException("Unable to call from(EncoderProfiles) on API " + i11 + ". Version 31 or higher required.");
    }

    private EncoderProfilesProxyCompat() {
    }

    public static EncoderProfilesProxy from(CamcorderProfile camcorderProfile) {
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 31) {
            Logger.m1872w(TAG, "Should use from(EncoderProfiles) on API " + i11 + "instead. CamcorderProfile is deprecated on API 31.");
        }
        return EncoderProfilesProxyCompatBaseImpl.from(camcorderProfile);
    }
}
