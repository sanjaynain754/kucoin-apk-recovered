package p713w4;

import android.graphics.Bitmap;
import android.graphics.Rect;
import androidx.media3.exoplayer.upstream.CmcdData;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;

/* JADX INFO: renamed from: w4.b */
/* JADX INFO: compiled from: BitmapFrameRenderer.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\bf\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tH&¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u000f¨\u0006\u0013"}, m90084d2 = {"Lw4/b;", "", "", "frameNumber", "Landroid/graphics/Bitmap;", "targetBitmap", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(ILandroid/graphics/Bitmap;)Z", "Landroid/graphics/Rect;", "bounds", "", "e", "(Landroid/graphics/Rect;)V", "c", "()I", "intrinsicWidth", "d", "intrinsicHeight", "animated-drawable_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public interface InterfaceC45719b {
    /* JADX INFO: renamed from: a */
    boolean mo8808a(int frameNumber, @NotNull Bitmap targetBitmap);

    /* JADX INFO: renamed from: c */
    int mo8809c();

    /* JADX INFO: renamed from: d */
    int mo8810d();

    /* JADX INFO: renamed from: e */
    void mo8811e(@Nullable Rect bounds);
}
