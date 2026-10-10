package androidx.media;

import android.media.VolumeProvider;
import android.os.Build;
import androidx.annotation.DoNotInline;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes34.dex */
public abstract class VolumeProviderCompat {
    public static final int VOLUME_CONTROL_ABSOLUTE = 2;
    public static final int VOLUME_CONTROL_FIXED = 0;
    public static final int VOLUME_CONTROL_RELATIVE = 1;
    private Callback mCallback;
    private final String mControlId;
    private final int mControlType;
    private int mCurrentVolume;
    private final int mMaxVolume;
    private VolumeProvider mVolumeProviderFwk;

    public static abstract class Callback {
        public abstract void onVolumeChanged(VolumeProviderCompat volumeProviderCompat);
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public @interface ControlType {
    }

    public VolumeProviderCompat(int i11, int i12, int i13) {
        this(i11, i12, i13, null);
    }

    @RequiresApi(21)
    public static class Api21Impl {
        private Api21Impl() {
        }

        @DoNotInline
        public static void setCurrentVolume(VolumeProvider volumeProvider, int i11) {
            volumeProvider.setCurrentVolume(i11);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public VolumeProviderCompat(int i11, int i12, int i13, @Nullable String str) {
        this.mControlType = i11;
        this.mMaxVolume = i12;
        this.mCurrentVolume = i13;
        this.mControlId = str;
    }

    public final int getCurrentVolume() {
        return this.mCurrentVolume;
    }

    public final int getMaxVolume() {
        return this.mMaxVolume;
    }

    public final int getVolumeControl() {
        return this.mControlType;
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public final String getVolumeControlId() {
        return this.mControlId;
    }

    public Object getVolumeProvider() {
        VolumeProviderCompat volumeProviderCompat;
        if (this.mVolumeProviderFwk != null) {
            volumeProviderCompat = this;
        } else if (Build.VERSION.SDK_INT >= 30) {
            volumeProviderCompat = this;
            volumeProviderCompat.mVolumeProviderFwk = new VolumeProvider(this.mControlType, this.mMaxVolume, this.mCurrentVolume, this.mControlId) { // from class: androidx.media.VolumeProviderCompat.1
                @Override // android.media.VolumeProvider
                public void onAdjustVolume(int i11) {
                    VolumeProviderCompat.this.onAdjustVolume(i11);
                }

                @Override // android.media.VolumeProvider
                public void onSetVolumeTo(int i11) {
                    VolumeProviderCompat.this.onSetVolumeTo(i11);
                }
            };
        } else {
            volumeProviderCompat = this;
            volumeProviderCompat.mVolumeProviderFwk = new VolumeProvider(volumeProviderCompat.mControlType, volumeProviderCompat.mMaxVolume, volumeProviderCompat.mCurrentVolume) { // from class: androidx.media.VolumeProviderCompat.2
                @Override // android.media.VolumeProvider
                public void onAdjustVolume(int i11) {
                    VolumeProviderCompat.this.onAdjustVolume(i11);
                }

                @Override // android.media.VolumeProvider
                public void onSetVolumeTo(int i11) {
                    VolumeProviderCompat.this.onSetVolumeTo(i11);
                }
            };
        }
        return volumeProviderCompat.mVolumeProviderFwk;
    }

    public void setCallback(Callback callback) {
        this.mCallback = callback;
    }

    public final void setCurrentVolume(int i11) {
        this.mCurrentVolume = i11;
        Api21Impl.setCurrentVolume((VolumeProvider) getVolumeProvider(), i11);
        Callback callback = this.mCallback;
        if (callback != null) {
            callback.onVolumeChanged(this);
        }
    }

    public void onAdjustVolume(int i11) {
    }

    public void onSetVolumeTo(int i11) {
    }
}
