package com.tencent.liteav.videobase.base;

/* JADX INFO: loaded from: classes59.dex */
public interface GLConstants {

    /* JADX INFO: renamed from: a */
    public static final float[] f74123a = {1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f};

    /* JADX INFO: renamed from: b */
    public static final float[] f74124b = {1.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 1.0f};

    /* JADX INFO: renamed from: c */
    public static final float[] f74125c = {-1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f};

    /* JADX INFO: renamed from: d */
    public static final float[] f74126d = {-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f};

    /* JADX INFO: renamed from: e */
    public static final float[] f74127e = {0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f};

    /* JADX INFO: renamed from: f */
    public static final float[] f74128f = {1.0f, 0.0f, 1.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f};

    /* JADX INFO: renamed from: g */
    public static final float[] f74129g = {0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f, 0.0f};

    /* JADX INFO: renamed from: h */
    public static final float[] f74130h = {1.0f, 1.0f, 0.0f, 1.0f, 1.0f, 0.0f, 0.0f, 0.0f};

    public enum ColorRange {
        UNKNOWN(0),
        VIDEO_RANGE(1),
        FULL_RANGE(2);

        private final int mJniValue;

        public final int getValue() {
            return this.mJniValue;
        }

        ColorRange(int i11) {
            this.mJniValue = i11;
        }

        /* JADX INFO: renamed from: a */
        public static ColorRange m76481a(int i11) {
            for (ColorRange colorRange : values()) {
                if (colorRange.mJniValue == i11) {
                    return colorRange;
                }
            }
            return UNKNOWN;
        }
    }

    public enum ColorSpace {
        UNKNOWN(0),
        BT601(1),
        BT709(2);

        private final int mJniValue;

        public final int getValue() {
            return this.mJniValue;
        }

        ColorSpace(int i11) {
            this.mJniValue = i11;
        }

        /* JADX INFO: renamed from: a */
        public static ColorSpace m76482a(int i11) {
            for (ColorSpace colorSpace : values()) {
                if (colorSpace.mJniValue == i11) {
                    return colorSpace;
                }
            }
            return UNKNOWN;
        }
    }

    public enum GLScaleType {
        CENTER_CROP(0),
        FIT_CENTER(1),
        FILL(2);


        /* JADX INFO: renamed from: d */
        private static final GLScaleType[] f74142d = values();
        public int mValue;

        /* JADX INFO: renamed from: a */
        public static GLScaleType m76483a(int i11) {
            for (GLScaleType gLScaleType : f74142d) {
                if (gLScaleType.mValue == i11) {
                    return gLScaleType;
                }
            }
            return FIT_CENTER;
        }

        GLScaleType(int i11) {
            this.mValue = i11;
        }
    }

    public enum PixelFormatType {
        I420(0),
        NV12(1),
        NV21(2),
        RGB(3),
        YUY2(4),
        RGBA(5),
        BGR(6),
        YV12(7),
        BGRA(8),
        ARGB(9),
        YUV422P(10),
        UYVY(11),
        YUYV(12),
        JPG(13),
        H264(14),
        MAX(100);


        /* JADX INFO: renamed from: q */
        private static final PixelFormatType[] f74160q = values();
        private final int mJniValue;

        /* JADX INFO: renamed from: a */
        public static PixelFormatType m76484a(int i11) {
            for (PixelFormatType pixelFormatType : f74160q) {
                if (pixelFormatType.mJniValue == i11) {
                    return pixelFormatType;
                }
            }
            return null;
        }

        public final int getValue() {
            return this.mJniValue;
        }

        PixelFormatType(int i11) {
            this.mJniValue = i11;
        }
    }

    /* JADX INFO: renamed from: com.tencent.liteav.videobase.base.GLConstants$a */
    public enum EnumC34866a {
        BYTE_BUFFER(0),
        TEXTURE_2D(1),
        TEXTURE_OES(2),
        BYTE_ARRAY(3);


        /* JADX INFO: renamed from: e */
        private static final EnumC34866a[] f74166e = values();
        public int mValue;

        /* JADX INFO: renamed from: a */
        public static EnumC34866a m76485a(int i11) {
            for (EnumC34866a enumC34866a : f74166e) {
                if (enumC34866a.mValue == i11) {
                    return enumC34866a;
                }
            }
            return TEXTURE_2D;
        }

        EnumC34866a(int i11) {
            this.mValue = i11;
        }
    }
}
