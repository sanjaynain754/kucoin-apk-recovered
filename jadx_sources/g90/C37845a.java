package g90;

import android.graphics.BitmapFactory;
import androidx.media3.exoplayer.upstream.CmcdData;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.TuplesKt;

/* JADX INFO: renamed from: g90.a */
/* JADX INFO: compiled from: BitmapSampleSizeCalculator.kt */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m90084d2 = {"Lg90/a;", "", "<init>", "()V", "Landroid/graphics/BitmapFactory$Options;", "options", "", "reqWidth", "reqHeight", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Landroid/graphics/BitmapFactory$Options;II)I", "com.opensource.svgaplayer"}, m90085k = 1, m90086mv = {1, 4, 0})
public final class C37845a {

    /* JADX INFO: renamed from: a */
    public static final C37845a f85224a = new C37845a();

    /* JADX INFO: renamed from: a */
    public final int m85404a(@NotNull BitmapFactory.Options options, int reqWidth, int reqHeight) {
        Pair pairM90091to = TuplesKt.m90091to(Integer.valueOf(options.outHeight), Integer.valueOf(options.outWidth));
        int iIntValue = ((Number) pairM90091to.component1()).intValue();
        int iIntValue2 = ((Number) pairM90091to.component2()).intValue();
        int i11 = 1;
        if (reqHeight > 0 && reqWidth > 0 && (iIntValue > reqHeight || iIntValue2 > reqWidth)) {
            int i12 = iIntValue / 2;
            int i13 = iIntValue2 / 2;
            while (i12 / i11 >= reqHeight && i13 / i11 >= reqWidth) {
                i11 *= 2;
            }
        }
        return i11;
    }
}
