package androidx.camera.video.internal.config;

import androidx.camera.core.impl.EncoderProfilesProxy;

/* JADX INFO: loaded from: classes23.dex */
final class AutoValue_VideoMimeInfo extends VideoMimeInfo {
    private final EncoderProfilesProxy.VideoProfileProxy compatibleVideoProfile;
    private final String mimeType;
    private final int profile;

    public static final class Builder extends VideoMimeInfo.Builder {
        private EncoderProfilesProxy.VideoProfileProxy compatibleVideoProfile;
        private String mimeType;
        private Integer profile;

        @Override // androidx.camera.video.internal.config.VideoMimeInfo.Builder, androidx.camera.video.internal.config.MimeInfo.Builder
        public VideoMimeInfo build() {
            String str = "";
            if (this.mimeType == null) {
                str = " mimeType";
            }
            if (this.profile == null) {
                str = str + " profile";
            }
            if (str.isEmpty()) {
                return new AutoValue_VideoMimeInfo(this.mimeType, this.profile.intValue(), this.compatibleVideoProfile);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // androidx.camera.video.internal.config.VideoMimeInfo.Builder
        public VideoMimeInfo.Builder setCompatibleVideoProfile(EncoderProfilesProxy.VideoProfileProxy videoProfileProxy) {
            this.compatibleVideoProfile = videoProfileProxy;
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.video.internal.config.MimeInfo.Builder
        public VideoMimeInfo.Builder setMimeType(String str) {
            if (str == null) {
                throw new NullPointerException("Null mimeType");
            }
            this.mimeType = str;
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.video.internal.config.MimeInfo.Builder
        public VideoMimeInfo.Builder setProfile(int i11) {
            this.profile = Integer.valueOf(i11);
            return this;
        }
    }

    public boolean equals(Object obj) {
        EncoderProfilesProxy.VideoProfileProxy videoProfileProxy;
        if (obj == this) {
            return true;
        }
        if (obj instanceof VideoMimeInfo) {
            VideoMimeInfo videoMimeInfo = (VideoMimeInfo) obj;
            if (this.mimeType.equals(videoMimeInfo.getMimeType()) && this.profile == videoMimeInfo.getProfile() && ((videoProfileProxy = this.compatibleVideoProfile) != null ? videoProfileProxy.equals(videoMimeInfo.getCompatibleVideoProfile()) : videoMimeInfo.getCompatibleVideoProfile() == null)) {
                return true;
            }
        }
        return false;
    }

    private AutoValue_VideoMimeInfo(String str, int i11, EncoderProfilesProxy.VideoProfileProxy videoProfileProxy) {
        this.mimeType = str;
        this.profile = i11;
        this.compatibleVideoProfile = videoProfileProxy;
    }

    @Override // androidx.camera.video.internal.config.VideoMimeInfo
    public EncoderProfilesProxy.VideoProfileProxy getCompatibleVideoProfile() {
        return this.compatibleVideoProfile;
    }

    @Override // androidx.camera.video.internal.config.MimeInfo
    public String getMimeType() {
        return this.mimeType;
    }

    @Override // androidx.camera.video.internal.config.MimeInfo
    public int getProfile() {
        return this.profile;
    }

    public int hashCode() {
        int iHashCode = (((this.mimeType.hashCode() ^ 1000003) * 1000003) ^ this.profile) * 1000003;
        EncoderProfilesProxy.VideoProfileProxy videoProfileProxy = this.compatibleVideoProfile;
        return iHashCode ^ (videoProfileProxy == null ? 0 : videoProfileProxy.hashCode());
    }

    public String toString() {
        return "VideoMimeInfo{mimeType=" + this.mimeType + ", profile=" + this.profile + ", compatibleVideoProfile=" + this.compatibleVideoProfile + "}";
    }
}
