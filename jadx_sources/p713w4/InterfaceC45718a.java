package p713w4;

import android.graphics.Bitmap;
import androidx.media3.exoplayer.upstream.CmcdData;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p006a4.AbstractC0110a;
import p852kotlin.Metadata;

/* JADX INFO: renamed from: w4.a */
/* JADX INFO: compiled from: BitmapFrameCache.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\bf\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\b\u0010\u0007J/\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0002H&¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u0002H¦\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H&¢\u0006\u0004\b\u0011\u0010\u0012J-\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0014\u001a\u00020\u0002H&¢\u0006\u0004\b\u0015\u0010\u0016J-\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0014\u001a\u00020\u0002H&¢\u0006\u0004\b\u0017\u0010\u0016¨\u0006\u0018"}, m90084d2 = {"Lw4/a;", "", "", "frameNumber", "La4/a;", "Landroid/graphics/Bitmap;", "c", "(I)La4/a;", "b", "width", "height", "d", "(III)La4/a;", "", "contains", "(I)Z", "", "clear", "()V", "bitmapReference", "frameType", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(ILa4/a;I)V", "e", "animated-drawable_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public interface InterfaceC45718a {
    /* JADX INFO: renamed from: a */
    void mo8761a(int frameNumber, @NotNull AbstractC0110a<Bitmap> bitmapReference, int frameType);

    @Nullable
    /* JADX INFO: renamed from: b */
    AbstractC0110a<Bitmap> mo8762b(int frameNumber);

    @Nullable
    /* JADX INFO: renamed from: c */
    AbstractC0110a<Bitmap> mo8763c(int frameNumber);

    void clear();

    boolean contains(int frameNumber);

    @Nullable
    /* JADX INFO: renamed from: d */
    AbstractC0110a<Bitmap> mo8764d(int frameNumber, int width, int height);

    /* JADX INFO: renamed from: e */
    void mo8765e(int frameNumber, @NotNull AbstractC0110a<Bitmap> bitmapReference, int frameType);
}
