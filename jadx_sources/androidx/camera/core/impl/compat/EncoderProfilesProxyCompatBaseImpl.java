package androidx.camera.core.impl.compat;

import android.media.CamcorderProfile;
import androidx.camera.core.impl.EncoderProfilesProxy;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes23.dex */
class EncoderProfilesProxyCompatBaseImpl {
    public static EncoderProfilesProxy from(CamcorderProfile camcorderProfile) {
        return EncoderProfilesProxy.ImmutableEncoderProfilesProxy.create(camcorderProfile.duration, camcorderProfile.fileFormat, toAudioProfiles(camcorderProfile), toVideoProfiles(camcorderProfile));
    }

    private static List<EncoderProfilesProxy.AudioProfileProxy> toAudioProfiles(CamcorderProfile camcorderProfile) {
        ArrayList arrayList = new ArrayList();
        int i11 = camcorderProfile.audioCodec;
        arrayList.add(EncoderProfilesProxy.AudioProfileProxy.create(i11, EncoderProfilesProxy.getAudioCodecMimeType(i11), camcorderProfile.audioBitRate, camcorderProfile.audioSampleRate, camcorderProfile.audioChannels, EncoderProfilesProxy.getRequiredAudioProfile(camcorderProfile.audioCodec)));
        return arrayList;
    }

    private static List<EncoderProfilesProxy.VideoProfileProxy> toVideoProfiles(CamcorderProfile camcorderProfile) {
        ArrayList arrayList = new ArrayList();
        int i11 = camcorderProfile.videoCodec;
        arrayList.add(EncoderProfilesProxy.VideoProfileProxy.create(i11, EncoderProfilesProxy.getVideoCodecMimeType(i11), camcorderProfile.videoBitRate, camcorderProfile.videoFrameRate, camcorderProfile.videoFrameWidth, camcorderProfile.videoFrameHeight, -1, 8, 0, 0));
        return arrayList;
    }

    private EncoderProfilesProxyCompatBaseImpl() {
    }
}
