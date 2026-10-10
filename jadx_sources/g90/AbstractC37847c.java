package g90;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import androidx.exifinterface.media.ExifInterface;
import androidx.media3.exoplayer.upstream.CmcdData;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;

/* JADX INFO: renamed from: g90.c */
/* JADX INFO: compiled from: SVGABitmapDecoder.kt */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b \u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J'\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000bJ!\u0010\u000e\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0005\u001a\u00028\u00002\u0006\u0010\r\u001a\u00020\fH&¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m90084d2 = {"Lg90/c;", ExifInterface.GPS_DIRECTION_TRUE, "", "<init>", "()V", "data", "", "reqWidth", "reqHeight", "Landroid/graphics/Bitmap;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Ljava/lang/Object;II)Landroid/graphics/Bitmap;", "Landroid/graphics/BitmapFactory$Options;", "ops", "b", "(Ljava/lang/Object;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;", "com.opensource.svgaplayer"}, m90085k = 1, m90086mv = {1, 4, 0})
public abstract class AbstractC37847c<T> {
    @Nullable
    /* JADX INFO: renamed from: b */
    public abstract Bitmap mo85405b(T data, @NotNull BitmapFactory.Options ops);

    @Nullable
    /* JADX INFO: renamed from: a */
    public final Bitmap m85407a(T data, int reqWidth, int reqHeight) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = reqWidth > 0 && reqHeight > 0;
        options.inPreferredConfig = Bitmap.Config.RGB_565;
        Bitmap bitmapMo85405b = mo85405b(data, options);
        if (!options.inJustDecodeBounds) {
            return bitmapMo85405b;
        }
        options.inSampleSize = C37845a.f85224a.m85404a(options, reqWidth, reqHeight);
        options.inJustDecodeBounds = false;
        return mo85405b(data, options);
    }
}
