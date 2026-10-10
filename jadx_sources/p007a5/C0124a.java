package p007a5;

import android.graphics.Bitmap;
import androidx.media3.exoplayer.upstream.CmcdData;
import java.io.Closeable;
import org.jetbrains.annotations.NotNull;
import p006a4.AbstractC0110a;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: a5.a */
/* JADX INFO: compiled from: AnimationBitmapFrame.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, m90084d2 = {"La5/a;", "Ljava/io/Closeable;", "", "frameNumber", "La4/a;", "Landroid/graphics/Bitmap;", "bitmap", "<init>", "(ILa4/a;)V", "", "close", "()V", "b", "I", "()I", "setFrameNumber", "(I)V", "c", "La4/a;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "()La4/a;", "animated-drawable_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public final class C0124a implements Closeable {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public int frameNumber;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final AbstractC0110a<Bitmap> bitmap;

    public C0124a(int i11, @NotNull AbstractC0110a<Bitmap> bitmap) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        this.frameNumber = i11;
        this.bitmap = bitmap;
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final AbstractC0110a<Bitmap> m590a() {
        return this.bitmap;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getFrameNumber() {
        return this.frameNumber;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.bitmap.close();
    }
}
