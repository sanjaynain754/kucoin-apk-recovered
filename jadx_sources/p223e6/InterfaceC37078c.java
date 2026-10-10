package p223e6;

import android.graphics.ColorSpace;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.facebook.imageformat.ImageFormat;
import com.facebook.imagepipeline.common.ResizeOptions;
import com.facebook.imagepipeline.common.RotationOptions;
import com.tencent.bugly.proguard.C33757kf;
import java.io.IOException;
import java.io.OutputStream;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p749x5.C46075i;
import p852kotlin.Metadata;

/* JADX INFO: renamed from: e6.c */
/* JADX INFO: compiled from: ImageTranscoder.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001JQ\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH&¢\u0006\u0004\b\u0011\u0010\u0012J+\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH&¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\nH&¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001c\u001a\u00020\u00198&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, m90084d2 = {"Le6/c;", "", "Lx5/i;", "encodedImage", "Ljava/io/OutputStream;", "outputStream", "Lcom/facebook/imagepipeline/common/RotationOptions;", "rotationOptions", "Lcom/facebook/imagepipeline/common/ResizeOptions;", "resizeOptions", "Lcom/facebook/imageformat/ImageFormat;", "outputFormat", "", C33757kf.f70665k, "Landroid/graphics/ColorSpace;", "colorSpace", "Le6/b;", "b", "(Lx5/i;Ljava/io/OutputStream;Lcom/facebook/imagepipeline/common/RotationOptions;Lcom/facebook/imagepipeline/common/ResizeOptions;Lcom/facebook/imageformat/ImageFormat;Ljava/lang/Integer;Landroid/graphics/ColorSpace;)Le6/b;", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Lx5/i;Lcom/facebook/imagepipeline/common/RotationOptions;Lcom/facebook/imagepipeline/common/ResizeOptions;)Z", "imageFormat", "c", "(Lcom/facebook/imageformat/ImageFormat;)Z", "", "getIdentifier", "()Ljava/lang/String;", "identifier", "imagepipeline-base_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public interface InterfaceC37078c {
    /* JADX INFO: renamed from: a */
    boolean mo9509a(@NotNull C46075i encodedImage, @Nullable RotationOptions rotationOptions, @Nullable ResizeOptions resizeOptions);

    @NotNull
    /* JADX INFO: renamed from: b */
    C37077b mo9510b(@NotNull C46075i encodedImage, @NotNull OutputStream outputStream, @Nullable RotationOptions rotationOptions, @Nullable ResizeOptions resizeOptions, @Nullable ImageFormat outputFormat, @Nullable Integer quality, @Nullable ColorSpace colorSpace) throws IOException;

    /* JADX INFO: renamed from: c */
    boolean mo9511c(@NotNull ImageFormat imageFormat);

    @NotNull
    String getIdentifier();
}
