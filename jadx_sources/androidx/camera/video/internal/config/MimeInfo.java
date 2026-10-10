package androidx.camera.video.internal.config;

/* JADX INFO: loaded from: classes23.dex */
public abstract class MimeInfo {

    public static abstract class Builder<B> {
        public abstract MimeInfo build();

        public abstract B setMimeType(String str);

        public abstract B setProfile(int i11);
    }

    public abstract String getMimeType();

    public abstract int getProfile();
}
