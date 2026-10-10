package com.facebook.imageformat;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.facebook.imageformat.ImageFormatChecker;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p712w3.C45701a;
import p712w3.C45702b;
import p712w3.C45713m;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.LazyThreadSafetyMode;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: ImageFormatChecker.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00192\u00020\u0001:\u0001\u001aB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\u00020\u00072\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000f\u0010\u0003R\u0016\u0010\u0013\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u001e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0017¨\u0006\u001b"}, m90084d2 = {"Lcom/facebook/imageformat/ImageFormatChecker;", "", "<init>", "()V", "", "Lcom/facebook/imageformat/ImageFormat$a;", "customImageFormatCheckers", "", "g", "(Ljava/util/List;)V", "Ljava/io/InputStream;", "is", "Lcom/facebook/imageformat/ImageFormat;", "c", "(Ljava/io/InputStream;)Lcom/facebook/imageformat/ImageFormat;", CmcdData.Factory.STREAMING_FORMAT_HLS, "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "I", "maxHeaderLength", "b", "Ljava/util/List;", "Lcom/facebook/imageformat/DefaultImageFormatChecker;", "Lcom/facebook/imageformat/DefaultImageFormatChecker;", "defaultFormatChecker", "d", "Companion", "imagepipeline-base_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nImageFormatChecker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ImageFormatChecker.kt\ncom/facebook/imageformat/ImageFormatChecker\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,152:1\n1863#2,2:153\n*S KotlinDebug\n*F\n+ 1 ImageFormatChecker.kt\ncom/facebook/imageformat/ImageFormatChecker\n*L\n42#1:153,2\n*E\n"})
public final class ImageFormatChecker {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: e */
    @NotNull
    public static final Lazy<ImageFormatChecker> f8821e = LazyKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, new Function0() { // from class: l5.b
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return ImageFormatChecker.m9098f();
        }
    });

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public int maxHeaderLength;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public List<? extends ImageFormat.InterfaceC5635a> customImageFormatCheckers;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final DefaultImageFormatChecker defaultFormatChecker = new DefaultImageFormatChecker();

    /* JADX INFO: compiled from: ImageFormatChecker.kt */
    @Metadata(m90083d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\t\u0010\bJ\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0007¢\u0006\u0004\b\u0007\u0010\fJ'\u0010\u0011\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0018\u001a\u00020\u00138GX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, m90084d2 = {"Lcom/facebook/imageformat/ImageFormatChecker$Companion;", "", "<init>", "()V", "Ljava/io/InputStream;", "is", "Lcom/facebook/imageformat/ImageFormat;", "getImageFormat", "(Ljava/io/InputStream;)Lcom/facebook/imageformat/ImageFormat;", "getImageFormat_WrapIOException", "", "filename", "(Ljava/lang/String;)Lcom/facebook/imageformat/ImageFormat;", "", "maxHeaderLength", "", "imageHeaderBytes", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(ILjava/io/InputStream;[B)I", "Lcom/facebook/imageformat/ImageFormatChecker;", "instance$delegate", "Lkotlin/Lazy;", "getInstance", "()Lcom/facebook/imageformat/ImageFormatChecker;", "instance", "imagepipeline-base_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final int m9102a(int maxHeaderLength, InputStream is2, byte[] imageHeaderBytes) throws IOException {
            if (imageHeaderBytes.length < maxHeaderLength) {
                throw new IllegalStateException("Check failed.");
            }
            if (!is2.markSupported()) {
                return C45701a.m100879b(is2, imageHeaderBytes, 0, maxHeaderLength);
            }
            try {
                is2.mark(maxHeaderLength);
                return C45701a.m100879b(is2, imageHeaderBytes, 0, maxHeaderLength);
            } finally {
                is2.reset();
            }
        }

        @JvmStatic
        @NotNull
        public final ImageFormat getImageFormat(@NotNull InputStream is2) throws IOException {
            Intrinsics.checkNotNullParameter(is2, "is");
            return getInstance().m9099c(is2);
        }

        public Companion() {
        }

        @JvmStatic
        @NotNull
        public final ImageFormat getImageFormat(@Nullable String filename) throws Throwable {
            FileInputStream fileInputStream = null;
            try {
                try {
                    FileInputStream fileInputStream2 = new FileInputStream(filename);
                    try {
                        ImageFormat imageFormat = getImageFormat(fileInputStream2);
                        C45702b.m100881b(fileInputStream2);
                        return imageFormat;
                    } catch (IOException unused) {
                        fileInputStream = fileInputStream2;
                        ImageFormat imageFormat2 = ImageFormat.f8817d;
                        C45702b.m100881b(fileInputStream);
                        return imageFormat2;
                    } catch (Throwable th2) {
                        th = th2;
                        fileInputStream = fileInputStream2;
                        C45702b.m100881b(fileInputStream);
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            } catch (IOException unused2) {
            }
        }

        @JvmStatic
        @NotNull
        public final ImageFormat getImageFormat_WrapIOException(@NotNull InputStream is2) {
            Intrinsics.checkNotNullParameter(is2, "is");
            try {
                return getImageFormat(is2);
            } catch (IOException e11) {
                throw C45713m.m100908a(e11);
            }
        }

        @JvmStatic
        @NotNull
        public final ImageFormatChecker getInstance() {
            return (ImageFormatChecker) ImageFormatChecker.f8821e.getValue();
        }
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: d */
    public static final ImageFormat m9096d(@NotNull InputStream inputStream) {
        return INSTANCE.getImageFormat_WrapIOException(inputStream);
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: e */
    public static final ImageFormatChecker m9097e() {
        return INSTANCE.getInstance();
    }

    /* JADX INFO: renamed from: f */
    public static final ImageFormatChecker m9098f() {
        return new ImageFormatChecker();
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final ImageFormat m9099c(@NotNull InputStream is2) throws IOException {
        Intrinsics.checkNotNullParameter(is2, "is");
        int i11 = this.maxHeaderLength;
        byte[] bArr = new byte[i11];
        int iM9102a = INSTANCE.m9102a(i11, is2, bArr);
        ImageFormat imageFormatDetermineFormat = this.defaultFormatChecker.determineFormat(bArr, iM9102a);
        if (imageFormatDetermineFormat != ImageFormat.f8817d) {
            return imageFormatDetermineFormat;
        }
        List<? extends ImageFormat.InterfaceC5635a> list = this.customImageFormatCheckers;
        if (list != null) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                ImageFormat imageFormatDetermineFormat2 = ((ImageFormat.InterfaceC5635a) it.next()).determineFormat(bArr, iM9102a);
                if (imageFormatDetermineFormat2 != ImageFormat.f8817d) {
                    return imageFormatDetermineFormat2;
                }
            }
        }
        return ImageFormat.f8817d;
    }

    /* JADX INFO: renamed from: g */
    public final void m9100g(@Nullable List<? extends ImageFormat.InterfaceC5635a> customImageFormatCheckers) {
        this.customImageFormatCheckers = customImageFormatCheckers;
        m9101h();
    }

    /* JADX INFO: renamed from: h */
    public final void m9101h() {
        this.maxHeaderLength = this.defaultFormatChecker.getHeaderSize();
        List<? extends ImageFormat.InterfaceC5635a> list = this.customImageFormatCheckers;
        if (list != null) {
            Intrinsics.checkNotNull(list);
            Iterator<? extends ImageFormat.InterfaceC5635a> it = list.iterator();
            while (it.hasNext()) {
                this.maxHeaderLength = Math.max(this.maxHeaderLength, it.next().getHeaderSize());
            }
        }
    }

    public ImageFormatChecker() {
        m9101h();
    }
}
