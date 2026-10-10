package androidx.media;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.versionedparcelable.VersionedParcelable;

/* JADX INFO: loaded from: classes34.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public interface AudioAttributesImpl extends VersionedParcelable {

    public interface Builder {
        @NonNull
        AudioAttributesImpl build();

        @NonNull
        Builder setContentType(int i11);

        @NonNull
        Builder setFlags(int i11);

        @NonNull
        Builder setLegacyStreamType(int i11);

        @NonNull
        Builder setUsage(int i11);
    }

    @Nullable
    Object getAudioAttributes();

    int getContentType();

    int getFlags();

    int getLegacyStreamType();

    int getRawLegacyStreamType();

    int getUsage();

    int getVolumeControlStream();
}
