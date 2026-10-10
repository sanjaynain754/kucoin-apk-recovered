package p748x4;

import android.graphics.Bitmap;
import androidx.media3.exoplayer.upstream.CmcdData;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p006a4.AbstractC0110a;
import p713w4.InterfaceC45718a;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: x4.a */
/* JADX INFO: compiled from: NoOpCache.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\tJ/\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u0004H\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0003J-\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0015\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J-\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0015\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0018\u0010\u0017¨\u0006\u0019"}, m90084d2 = {"Lx4/a;", "Lw4/a;", "<init>", "()V", "", "frameNumber", "La4/a;", "Landroid/graphics/Bitmap;", "c", "(I)La4/a;", "b", "width", "height", "d", "(III)La4/a;", "", "contains", "(I)Z", "", "clear", "bitmapReference", "frameType", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(ILa4/a;I)V", "e", "animated-drawable_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public final class C46007a implements InterfaceC45718a {
    @Override // p713w4.InterfaceC45718a
    @Nullable
    /* JADX INFO: renamed from: b */
    public AbstractC0110a<Bitmap> mo8762b(int frameNumber) {
        return null;
    }

    @Override // p713w4.InterfaceC45718a
    @Nullable
    /* JADX INFO: renamed from: c */
    public AbstractC0110a<Bitmap> mo8763c(int frameNumber) {
        return null;
    }

    @Override // p713w4.InterfaceC45718a
    public boolean contains(int frameNumber) {
        return false;
    }

    @Override // p713w4.InterfaceC45718a
    @Nullable
    /* JADX INFO: renamed from: d */
    public AbstractC0110a<Bitmap> mo8764d(int frameNumber, int width, int height) {
        return null;
    }

    @Override // p713w4.InterfaceC45718a
    /* JADX INFO: renamed from: a */
    public void mo8761a(int frameNumber, @NotNull AbstractC0110a<Bitmap> bitmapReference, int frameType) {
        Intrinsics.checkNotNullParameter(bitmapReference, "bitmapReference");
    }

    @Override // p713w4.InterfaceC45718a
    /* JADX INFO: renamed from: e */
    public void mo8765e(int frameNumber, @NotNull AbstractC0110a<Bitmap> bitmapReference, int frameType) {
        Intrinsics.checkNotNullParameter(bitmapReference, "bitmapReference");
    }

    @Override // p713w4.InterfaceC45718a
    public void clear() {
    }
}
