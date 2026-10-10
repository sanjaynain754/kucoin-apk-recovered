package com.facebook.imagepipeline.transcoder;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.ColorSpace;
import android.graphics.Matrix;
import android.os.Build;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.facebook.imageformat.ImageFormat;
import com.facebook.imagepipeline.common.ResizeOptions;
import com.facebook.imagepipeline.common.RotationOptions;
import com.tencent.bugly.proguard.C33757kf;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.io.OutputStream;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p223e6.C37076a;
import p223e6.C37077b;
import p223e6.C37080e;
import p223e6.InterfaceC37078c;
import p422l5.C42054a;
import p747x3.C45999a;
import p749x5.C46075i;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: SimpleImageTranscoder.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u0000 \u001d2\u00020\u0001:\u0001&B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007JQ\u0010\u0016\u001a\u00020\u00152\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u0012\u001a\u0004\u0018\u00010\u00042\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J+\u0010\u0018\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\b2\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ)\u0010\u001d\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u001fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010 R\u001a\u0010%\u001a\u00020!8\u0016X\u0096D¢\u0006\f\n\u0004\b\u001b\u0010\"\u001a\u0004\b#\u0010$¨\u0006'"}, m90084d2 = {"Lcom/facebook/imagepipeline/transcoder/SimpleImageTranscoder;", "Le6/c;", "", "resizingEnabled", "", "maxBitmapSize", "<init>", "(ZI)V", "Lx5/i;", "encodedImage", "Ljava/io/OutputStream;", "outputStream", "Lcom/facebook/imagepipeline/common/RotationOptions;", "rotationOptions", "Lcom/facebook/imagepipeline/common/ResizeOptions;", "resizeOptions", "Lcom/facebook/imageformat/ImageFormat;", "outputFormat", C33757kf.f70665k, "Landroid/graphics/ColorSpace;", "colorSpace", "Le6/b;", "b", "(Lx5/i;Ljava/io/OutputStream;Lcom/facebook/imagepipeline/common/RotationOptions;Lcom/facebook/imagepipeline/common/ResizeOptions;Lcom/facebook/imageformat/ImageFormat;Ljava/lang/Integer;Landroid/graphics/ColorSpace;)Le6/b;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Lx5/i;Lcom/facebook/imagepipeline/common/RotationOptions;Lcom/facebook/imagepipeline/common/ResizeOptions;)Z", "imageFormat", "c", "(Lcom/facebook/imageformat/ImageFormat;)Z", "d", "(Lx5/i;Lcom/facebook/imagepipeline/common/RotationOptions;Lcom/facebook/imagepipeline/common/ResizeOptions;)I", "Z", "I", "", "Ljava/lang/String;", "getIdentifier", "()Ljava/lang/String;", "identifier", "Companion", "imagepipeline_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public final class SimpleImageTranscoder implements InterfaceC37078c {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final boolean resizingEnabled;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final int maxBitmapSize;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final String identifier = "SimpleImageTranscoder";

    /* JADX INFO: compiled from: SimpleImageTranscoder.kt */
    @Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, m90084d2 = {"Lcom/facebook/imagepipeline/transcoder/SimpleImageTranscoder$Companion;", "", "<init>", "()V", "Lcom/facebook/imageformat/ImageFormat;", TUIConstants.TUIGroupNotePlugin.PLUGIN_GROUP_NOTE_FORMAT, "Landroid/graphics/Bitmap$CompressFormat;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Lcom/facebook/imageformat/ImageFormat;)Landroid/graphics/Bitmap$CompressFormat;", "", "TAG", "Ljava/lang/String;", "imagepipeline_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        /* JADX INFO: renamed from: a */
        public final Bitmap.CompressFormat m9897a(ImageFormat format) {
            if (format == null) {
                return Bitmap.CompressFormat.JPEG;
            }
            if (format == C42054a.JPEG) {
                return Bitmap.CompressFormat.JPEG;
            }
            if (format == C42054a.PNG) {
                return Bitmap.CompressFormat.PNG;
            }
            return C42054a.m92260a(format) ? Bitmap.CompressFormat.WEBP : Bitmap.CompressFormat.JPEG;
        }
    }

    @Override // p223e6.InterfaceC37078c
    /* JADX INFO: renamed from: a */
    public boolean mo9509a(@NotNull C46075i encodedImage, @Nullable RotationOptions rotationOptions, @Nullable ResizeOptions resizeOptions) {
        Intrinsics.checkNotNullParameter(encodedImage, "encodedImage");
        if (rotationOptions == null) {
            rotationOptions = RotationOptions.INSTANCE.autoRotate();
        }
        return this.resizingEnabled && C37076a.m82984b(rotationOptions, resizeOptions, encodedImage, this.maxBitmapSize) > 1;
    }

    @Override // p223e6.InterfaceC37078c
    @NotNull
    /* JADX INFO: renamed from: b */
    public C37077b mo9510b(@NotNull C46075i encodedImage, @NotNull OutputStream outputStream, @Nullable RotationOptions rotationOptions, @Nullable ResizeOptions resizeOptions, @Nullable ImageFormat outputFormat, @Nullable Integer quality, @Nullable ColorSpace colorSpace) throws Throwable {
        Bitmap bitmapCreateBitmap;
        Intrinsics.checkNotNullParameter(encodedImage, "encodedImage");
        Intrinsics.checkNotNullParameter(outputStream, "outputStream");
        Integer num = quality == null ? 85 : quality;
        RotationOptions rotationOptionsAutoRotate = rotationOptions == null ? RotationOptions.INSTANCE.autoRotate() : rotationOptions;
        int iM9896d = m9896d(encodedImage, rotationOptionsAutoRotate, resizeOptions);
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inSampleSize = iM9896d;
        if (colorSpace != null && Build.VERSION.SDK_INT >= 26) {
            options.inPreferredColorSpace = colorSpace;
        }
        try {
            Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(encodedImage.m101579n(), null, options);
            if (bitmapDecodeStream == null) {
                C45999a.m101507m("SimpleImageTranscoder", "Couldn't decode the EncodedImage InputStream ! ");
                return new C37077b(2);
            }
            Matrix matrixM82995g = C37080e.m82995g(encodedImage, rotationOptionsAutoRotate);
            if (matrixM82995g != null) {
                try {
                    bitmapCreateBitmap = Bitmap.createBitmap(bitmapDecodeStream, 0, 0, bitmapDecodeStream.getWidth(), bitmapDecodeStream.getHeight(), matrixM82995g, false);
                } catch (OutOfMemoryError e11) {
                    e = e11;
                    bitmapCreateBitmap = bitmapDecodeStream;
                    C45999a.m101508n("SimpleImageTranscoder", "Out-Of-Memory during transcode", e);
                    C37077b c37077b = new C37077b(2);
                    bitmapCreateBitmap.recycle();
                    bitmapDecodeStream.recycle();
                    return c37077b;
                } catch (Throwable th2) {
                    th = th2;
                    bitmapCreateBitmap = bitmapDecodeStream;
                    bitmapCreateBitmap.recycle();
                    bitmapDecodeStream.recycle();
                    throw th;
                }
            } else {
                bitmapCreateBitmap = bitmapDecodeStream;
            }
            try {
                try {
                    bitmapCreateBitmap.compress(INSTANCE.m9897a(outputFormat), num.intValue(), outputStream);
                    C37077b c37077b2 = new C37077b(iM9896d > 1 ? 0 : 1);
                    bitmapCreateBitmap.recycle();
                    bitmapDecodeStream.recycle();
                    return c37077b2;
                } catch (OutOfMemoryError e12) {
                    e = e12;
                    C45999a.m101508n("SimpleImageTranscoder", "Out-Of-Memory during transcode", e);
                    C37077b c37077b3 = new C37077b(2);
                    bitmapCreateBitmap.recycle();
                    bitmapDecodeStream.recycle();
                    return c37077b3;
                }
            } catch (Throwable th3) {
                th = th3;
                bitmapCreateBitmap.recycle();
                bitmapDecodeStream.recycle();
                throw th;
            }
        } catch (OutOfMemoryError e13) {
            C45999a.m101508n("SimpleImageTranscoder", "Out-Of-Memory during transcode", e13);
            return new C37077b(2);
        }
    }

    @Override // p223e6.InterfaceC37078c
    /* JADX INFO: renamed from: c */
    public boolean mo9511c(@NotNull ImageFormat imageFormat) {
        Intrinsics.checkNotNullParameter(imageFormat, "imageFormat");
        return imageFormat == C42054a.HEIF || imageFormat == C42054a.JPEG;
    }

    /* JADX INFO: renamed from: d */
    public final int m9896d(C46075i encodedImage, RotationOptions rotationOptions, ResizeOptions resizeOptions) {
        if (this.resizingEnabled) {
            return C37076a.m82984b(rotationOptions, resizeOptions, encodedImage, this.maxBitmapSize);
        }
        return 1;
    }

    @Override // p223e6.InterfaceC37078c
    @NotNull
    public String getIdentifier() {
        return this.identifier;
    }

    public SimpleImageTranscoder(boolean z11, int i11) {
        this.resizingEnabled = z11;
        this.maxBitmapSize = i11;
    }
}
