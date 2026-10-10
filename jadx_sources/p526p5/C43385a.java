package p526p5;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import androidx.media3.exoplayer.upstream.CmcdData;
import org.jetbrains.annotations.NotNull;
import p006a4.AbstractC0110a;
import p008a6.InterfaceC0149i;
import p284g6.C37818c;
import p617s5.C44315a;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: p5.a */
/* JADX INFO: compiled from: ArtBitmapFactory.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J-\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, m90084d2 = {"Lp5/a;", "Lp5/c;", "La6/i;", "bitmapPool", "Ls5/a;", "closeableReferenceFactory", "<init>", "(La6/i;Ls5/a;)V", "", "width", "height", "Landroid/graphics/Bitmap$Config;", "bitmapConfig", "La4/a;", "Landroid/graphics/Bitmap;", "d", "(IILandroid/graphics/Bitmap$Config;)La4/a;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "La6/i;", "b", "Ls5/a;", "imagepipeline_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
@TargetApi(21)
public final class C43385a extends AbstractC43387c {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC0149i bitmapPool;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final C44315a closeableReferenceFactory;

    public C43385a(@NotNull InterfaceC0149i bitmapPool, @NotNull C44315a closeableReferenceFactory) {
        Intrinsics.checkNotNullParameter(bitmapPool, "bitmapPool");
        Intrinsics.checkNotNullParameter(closeableReferenceFactory, "closeableReferenceFactory");
        this.bitmapPool = bitmapPool;
        this.closeableReferenceFactory = closeableReferenceFactory;
    }

    @Override // p526p5.AbstractC43387c
    @NotNull
    /* JADX INFO: renamed from: d */
    public AbstractC0110a<Bitmap> mo95559d(int width, int height, @NotNull Bitmap.Config bitmapConfig) {
        Intrinsics.checkNotNullParameter(bitmapConfig, "bitmapConfig");
        Bitmap bitmap = this.bitmapPool.get(C37818c.m85340i(width, height, bitmapConfig));
        if (bitmap.getAllocationByteCount() < width * height * C37818c.m85339h(bitmapConfig)) {
            throw new IllegalStateException("Check failed.");
        }
        bitmap.reconfigure(width, height, bitmapConfig);
        AbstractC0110a<Bitmap> abstractC0110aM97777c = this.closeableReferenceFactory.m97777c(bitmap, this.bitmapPool);
        Intrinsics.checkNotNullExpressionValue(abstractC0110aM97777c, "create(...)");
        return abstractC0110aM97777c;
    }
}
