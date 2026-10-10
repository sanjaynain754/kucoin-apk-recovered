package p008a6;

import android.graphics.Bitmap;
import androidx.media3.exoplayer.upstream.CmcdData;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: a6.s */
/* JADX INFO: compiled from: DummyBitmapPool.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0096\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, m90084d2 = {"La6/s;", "La6/i;", "<init>", "()V", "", "size", "Landroid/graphics/Bitmap;", "g", "(I)Landroid/graphics/Bitmap;", "value", "", CmcdData.Factory.STREAMING_FORMAT_HLS, "(Landroid/graphics/Bitmap;)V", "imagepipeline_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public final class C0159s implements InterfaceC0149i {
    @Override // p819z3.InterfaceC46677f
    @NotNull
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public Bitmap get(int size) {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(1, (int) Math.ceil(((double) size) / 2.0d), Bitmap.Config.RGB_565);
        Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(...)");
        return bitmapCreateBitmap;
    }

    @Override // p819z3.InterfaceC46677f, p006a4.InterfaceC0117h
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public void release(@NotNull Bitmap value) {
        Intrinsics.checkNotNullParameter(value, "value");
        value.recycle();
    }
}
