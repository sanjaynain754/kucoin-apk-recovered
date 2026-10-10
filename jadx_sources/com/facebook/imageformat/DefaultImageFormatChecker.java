package com.facebook.imageformat;

import androidx.media3.exoplayer.upstream.CmcdData;
import org.jetbrains.annotations.NotNull;
import org.tensorflow.lite.schema.BuiltinOptions;
import p221e4.C37072c;
import p422l5.C42054a;
import p422l5.C42056c;
import p852kotlin.Metadata;
import p852kotlin.collections.ArraysKt;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: DefaultImageFormatChecker.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \u000f2\u00020\u0001:\u0001\u0010B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0011"}, m90084d2 = {"Lcom/facebook/imageformat/DefaultImageFormatChecker;", "Lcom/facebook/imageformat/ImageFormat$a;", "<init>", "()V", "", "headerBytes", "", "headerSize", "Lcom/facebook/imageformat/ImageFormat;", "determineFormat", "([BI)Lcom/facebook/imageformat/ImageFormat;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "I", "getHeaderSize", "()I", "b", "Companion", "imagepipeline-base_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public final class DefaultImageFormatChecker implements ImageFormat.InterfaceC5635a {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: c */
    @NotNull
    public static final byte[] f8800c;

    /* JADX INFO: renamed from: d */
    public static final int f8801d;

    /* JADX INFO: renamed from: e */
    @NotNull
    public static final byte[] f8802e;

    /* JADX INFO: renamed from: f */
    public static final int f8803f;

    /* JADX INFO: renamed from: g */
    @NotNull
    public static final byte[] f8804g;

    /* JADX INFO: renamed from: h */
    @NotNull
    public static final byte[] f8805h;

    /* JADX INFO: renamed from: i */
    @NotNull
    public static final byte[] f8806i;

    /* JADX INFO: renamed from: j */
    public static final int f8807j;

    /* JADX INFO: renamed from: k */
    @NotNull
    public static final byte[] f8808k;

    /* JADX INFO: renamed from: l */
    public static final int f8809l;

    /* JADX INFO: renamed from: m */
    @NotNull
    public static final byte[] f8810m;

    /* JADX INFO: renamed from: n */
    @NotNull
    public static final byte[][] f8811n;

    /* JADX INFO: renamed from: o */
    @NotNull
    public static final byte[] f8812o;

    /* JADX INFO: renamed from: p */
    @NotNull
    public static final byte[] f8813p;

    /* JADX INFO: renamed from: q */
    public static final int f8814q;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final int headerSize;

    /* JADX INFO: compiled from: DefaultImageFormatChecker.kt */
    @Metadata(m90083d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0018\n\u0002\u0010\u0011\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000e\u0010\rJ\u001f\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000f\u0010\rJ\u001f\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0010\u0010\rJ\u001f\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0011\u0010\rJ\u001f\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0012\u0010\rJ\u001f\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0013\u0010\rR\u0014\u0010\u0014\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0019\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0015R\u0014\u0010\u001a\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018R\u0014\u0010\u001b\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0015R\u0014\u0010\u001c\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0018R\u0014\u0010\u001d\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0018R\u0014\u0010\u001e\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001e\u0010\u0015R\u0014\u0010\u001f\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0018R\u0014\u0010 \u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u0015R\u0014\u0010!\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u0018R\u0014\u0010\"\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u0015R\u0014\u0010#\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u0018R\u001a\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00040$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010'\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b'\u0010\u0015R\u0014\u0010(\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010\u0018R\u0014\u0010)\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010\u0018R\u0014\u0010*\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010\u0015¨\u0006+"}, m90084d2 = {"Lcom/facebook/imageformat/DefaultImageFormatChecker$Companion;", "", "<init>", "()V", "", "imageHeaderBytes", "", "headerSize", "Lcom/facebook/imageformat/ImageFormat;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "([BI)Lcom/facebook/imageformat/ImageFormat;", "", "g", "([BI)Z", CmcdData.Factory.STREAMING_FORMAT_HLS, "d", "b", "f", "e", "c", "SIMPLE_WEBP_HEADER_LENGTH", "I", "EXTENDED_WEBP_HEADER_LENGTH", "JPEG_HEADER", "[B", "JPEG_HEADER_LENGTH", "PNG_HEADER", "PNG_HEADER_LENGTH", "GIF_HEADER_87A", "GIF_HEADER_89A", "GIF_HEADER_LENGTH", "BMP_HEADER", "BMP_HEADER_LENGTH", "ICO_HEADER", "ICO_HEADER_LENGTH", "HEIF_HEADER_PREFIX", "", "HEIF_HEADER_SUFFIXES", "[[B", "HEIF_HEADER_LENGTH", "DNG_HEADER_II", "DNG_HEADER_MM", "DNG_HEADER_LENGTH", "imagepipeline-base_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nDefaultImageFormatChecker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DefaultImageFormatChecker.kt\ncom/facebook/imageformat/DefaultImageFormatChecker$Companion\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,282:1\n12511#2,2:283\n*S KotlinDebug\n*F\n+ 1 DefaultImageFormatChecker.kt\ncom/facebook/imageformat/DefaultImageFormatChecker$Companion\n*L\n250#1:283,2\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final ImageFormat m9085a(byte[] imageHeaderBytes, int headerSize) {
            if (!C37072c.m82975h(imageHeaderBytes, 0, headerSize)) {
                throw new IllegalStateException("Check failed.");
            }
            if (C37072c.m82974g(imageHeaderBytes, 0)) {
                return C42054a.WEBP_SIMPLE;
            }
            if (C37072c.m82973f(imageHeaderBytes, 0)) {
                return C42054a.WEBP_LOSSLESS;
            }
            if (!C37072c.m82970c(imageHeaderBytes, 0, headerSize)) {
                return ImageFormat.f8817d;
            }
            if (C37072c.m82969b(imageHeaderBytes, 0)) {
                return C42054a.WEBP_ANIMATED;
            }
            return C37072c.m82971d(imageHeaderBytes, 0) ? C42054a.WEBP_EXTENDED_WITH_ALPHA : C42054a.WEBP_EXTENDED;
        }

        /* JADX INFO: renamed from: d */
        public final boolean m9088d(byte[] imageHeaderBytes, int headerSize) {
            if (headerSize < 6) {
                return false;
            }
            return C42056c.m92264c(imageHeaderBytes, DefaultImageFormatChecker.f8804g) || C42056c.m92264c(imageHeaderBytes, DefaultImageFormatChecker.f8805h);
        }

        public Companion() {
        }

        /* JADX INFO: renamed from: e */
        public final boolean m9089e(byte[] imageHeaderBytes, int headerSize) {
            if (headerSize < 12 || imageHeaderBytes[3] < 8 || !C42056c.m92263b(imageHeaderBytes, DefaultImageFormatChecker.f8810m, 4)) {
                return false;
            }
            for (byte[] bArr : DefaultImageFormatChecker.f8811n) {
                if (C42056c.m92263b(imageHeaderBytes, bArr, 8)) {
                    return true;
                }
            }
            return false;
        }

        /* JADX INFO: renamed from: b */
        public final boolean m9086b(byte[] imageHeaderBytes, int headerSize) {
            if (headerSize < DefaultImageFormatChecker.f8806i.length) {
                return false;
            }
            return C42056c.m92264c(imageHeaderBytes, DefaultImageFormatChecker.f8806i);
        }

        /* JADX INFO: renamed from: c */
        public final boolean m9087c(byte[] imageHeaderBytes, int headerSize) {
            if (headerSize >= DefaultImageFormatChecker.f8814q) {
                if (C42056c.m92264c(imageHeaderBytes, DefaultImageFormatChecker.f8812o) || C42056c.m92264c(imageHeaderBytes, DefaultImageFormatChecker.f8813p)) {
                    return true;
                }
                return false;
            }
            return false;
        }

        /* JADX INFO: renamed from: f */
        public final boolean m9090f(byte[] imageHeaderBytes, int headerSize) {
            if (headerSize < DefaultImageFormatChecker.f8808k.length) {
                return false;
            }
            return C42056c.m92264c(imageHeaderBytes, DefaultImageFormatChecker.f8808k);
        }

        /* JADX INFO: renamed from: g */
        public final boolean m9091g(byte[] imageHeaderBytes, int headerSize) {
            if (headerSize >= DefaultImageFormatChecker.f8800c.length && C42056c.m92264c(imageHeaderBytes, DefaultImageFormatChecker.f8800c)) {
                return true;
            }
            return false;
        }

        /* JADX INFO: renamed from: h */
        public final boolean m9092h(byte[] imageHeaderBytes, int headerSize) {
            if (headerSize >= DefaultImageFormatChecker.f8802e.length && C42056c.m92264c(imageHeaderBytes, DefaultImageFormatChecker.f8802e)) {
                return true;
            }
            return false;
        }
    }

    static {
        byte[] bArr = {-1, -40, -1};
        f8800c = bArr;
        f8801d = bArr.length;
        byte[] bArr2 = {-119, BuiltinOptions.UniqueOptions, BuiltinOptions.AbsOptions, BuiltinOptions.UnidirectionalSequenceLSTMOptions, 13, 10, 26, 10};
        f8802e = bArr2;
        f8803f = bArr2.length;
        f8804g = C42056c.m92262a("GIF87a");
        f8805h = C42056c.m92262a("GIF89a");
        byte[] bArrM92262a = C42056c.m92262a("BM");
        f8806i = bArrM92262a;
        f8807j = bArrM92262a.length;
        byte[] bArr3 = {0, 0, 1, 0};
        f8808k = bArr3;
        f8809l = bArr3.length;
        f8810m = C42056c.m92262a("ftyp");
        f8811n = new byte[][]{C42056c.m92262a("heic"), C42056c.m92262a("heix"), C42056c.m92262a("hevc"), C42056c.m92262a("hevx"), C42056c.m92262a("mif1"), C42056c.m92262a("msf1")};
        byte[] bArr4 = {BuiltinOptions.RangeOptions, BuiltinOptions.RangeOptions, BuiltinOptions.NegOptions, 0};
        f8812o = bArr4;
        f8813p = new byte[]{BuiltinOptions.MirrorPadOptions, BuiltinOptions.MirrorPadOptions, 0, BuiltinOptions.NegOptions};
        f8814q = bArr4.length;
    }

    @Override // com.facebook.imageformat.ImageFormat.InterfaceC5635a
    @NotNull
    public ImageFormat determineFormat(@NotNull byte[] headerBytes, int headerSize) {
        Intrinsics.checkNotNullParameter(headerBytes, "headerBytes");
        if (C37072c.m82975h(headerBytes, 0, headerSize)) {
            return INSTANCE.m9085a(headerBytes, headerSize);
        }
        Companion companion = INSTANCE;
        if (companion.m9091g(headerBytes, headerSize)) {
            return C42054a.com.jumio.core.constants.ConstantsKt.FILE_TYPE_JPEG java.lang.String;
        }
        if (companion.m9092h(headerBytes, headerSize)) {
            return C42054a.com.jumio.core.constants.ConstantsKt.FILE_TYPE_PNG java.lang.String;
        }
        if (companion.m9088d(headerBytes, headerSize)) {
            return C42054a.GIF;
        }
        if (companion.m9086b(headerBytes, headerSize)) {
            return C42054a.BMP;
        }
        if (companion.m9090f(headerBytes, headerSize)) {
            return C42054a.ICO;
        }
        if (companion.m9089e(headerBytes, headerSize)) {
            return C42054a.HEIF;
        }
        return companion.m9087c(headerBytes, headerSize) ? C42054a.DNG : ImageFormat.f8817d;
    }

    @Override // com.facebook.imageformat.ImageFormat.InterfaceC5635a
    public int getHeaderSize() {
        return this.headerSize;
    }

    public DefaultImageFormatChecker() {
        Object objMaxOrNull = ArraysKt.maxOrNull(new Integer[]{21, 20, Integer.valueOf(f8801d), Integer.valueOf(f8803f), 6, Integer.valueOf(f8807j), Integer.valueOf(f8809l), 12});
        if (objMaxOrNull != null) {
            this.headerSize = ((Number) objMaxOrNull).intValue();
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }
}
