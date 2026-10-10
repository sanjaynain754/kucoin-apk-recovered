package androidx.media;

import android.media.AudioAttributes;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes34.dex */
@RequiresApi(26)
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class AudioAttributesImplApi26 extends AudioAttributesImplApi21 {

    @RequiresApi(26)
    public static class Builder extends AudioAttributesImplApi21.Builder {
        public Builder() {
        }

        public Builder(Object obj) {
            super(obj);
        }

        @Override // androidx.media.AudioAttributesImplApi21.Builder, androidx.media.AudioAttributesImpl.Builder
        @NonNull
        public AudioAttributesImpl build() {
            return new AudioAttributesImplApi26(this.mFwkBuilder.build());
        }

        @Override // androidx.media.AudioAttributesImplApi21.Builder, androidx.media.AudioAttributesImpl.Builder
        @NonNull
        public Builder setUsage(int i11) {
            this.mFwkBuilder.setUsage(i11);
            return this;
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public AudioAttributesImplApi26() {
    }

    public AudioAttributesImplApi26(AudioAttributes audioAttributes) {
        super(audioAttributes, -1);
    }

    @Override // androidx.media.AudioAttributesImplApi21, androidx.media.AudioAttributesImpl
    public int getVolumeControlStream() {
        return this.mAudioAttributes.getVolumeControlStream();
    }
}
