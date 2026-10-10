package p034b6;

import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import android.graphics.Rect;
import androidx.media3.exoplayer.rtsp.SessionDescription;
import androidx.media3.exoplayer.upstream.CmcdData;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p006a4.AbstractC0110a;
import p749x5.C46075i;
import p852kotlin.Metadata;

/* JADX INFO: renamed from: b6.d */
/* JADX INFO: compiled from: PlatformDecoder.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J;\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH&¢\u0006\u0004\b\f\u0010\rJC\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\t\u001a\u0004\u0018\u00010\bH&¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m90084d2 = {"Lb6/d;", "", "Lx5/i;", "encodedImage", "Landroid/graphics/Bitmap$Config;", "bitmapConfig", "Landroid/graphics/Rect;", "regionToDecode", "Landroid/graphics/ColorSpace;", "colorSpace", "La4/a;", "Landroid/graphics/Bitmap;", "b", "(Lx5/i;Landroid/graphics/Bitmap$Config;Landroid/graphics/Rect;Landroid/graphics/ColorSpace;)La4/a;", "", SessionDescription.ATTR_LENGTH, CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Lx5/i;Landroid/graphics/Bitmap$Config;Landroid/graphics/Rect;ILandroid/graphics/ColorSpace;)La4/a;", "imagepipeline_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public interface InterfaceC4495d {
    @Nullable
    /* JADX INFO: renamed from: a */
    AbstractC0110a<Bitmap> mo4293a(@NotNull C46075i encodedImage, @NotNull Bitmap.Config bitmapConfig, @Nullable Rect regionToDecode, int length, @Nullable ColorSpace colorSpace);

    @Nullable
    /* JADX INFO: renamed from: b */
    AbstractC0110a<Bitmap> mo4294b(@NotNull C46075i encodedImage, @NotNull Bitmap.Config bitmapConfig, @Nullable Rect regionToDecode, @Nullable ColorSpace colorSpace);
}
