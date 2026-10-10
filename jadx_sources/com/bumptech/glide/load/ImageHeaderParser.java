package com.bumptech.glide.load;

import androidx.annotation.NonNull;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import p710w1.InterfaceC45684b;

/* JADX INFO: loaded from: classes.dex */
public interface ImageHeaderParser {

    public enum ImageType {
        GIF(true),
        JPEG(false),
        RAW(false),
        PNG_A(true),
        PNG(false),
        WEBP_A(true),
        WEBP(false),
        UNKNOWN(false);

        private final boolean hasAlpha;

        public boolean hasAlpha() {
            return this.hasAlpha;
        }

        ImageType(boolean z11) {
            this.hasAlpha = z11;
        }
    }

    @NonNull
    /* JADX INFO: renamed from: a */
    ImageType mo4896a(@NonNull InputStream inputStream) throws IOException;

    /* JADX INFO: renamed from: b */
    int mo4897b(@NonNull InputStream inputStream, @NonNull InterfaceC45684b interfaceC45684b) throws IOException;

    @NonNull
    /* JADX INFO: renamed from: c */
    ImageType mo4898c(@NonNull ByteBuffer byteBuffer) throws IOException;
}
