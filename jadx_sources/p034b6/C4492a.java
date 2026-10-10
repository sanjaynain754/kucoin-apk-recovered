package p034b6;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import androidx.core.util.Pools;
import java.nio.ByteBuffer;
import org.jetbrains.annotations.NotNull;
import p008a6.InterfaceC0149i;
import p284g6.C37818c;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: b6.a */
/* JADX INFO: compiled from: ArtDecoder.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ'\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m90084d2 = {"Lb6/a;", "Lb6/b;", "La6/i;", "bitmapPool", "Landroidx/core/util/Pools$Pool;", "Ljava/nio/ByteBuffer;", "decodeBuffers", "Lb6/f;", "platformDecoderOptions", "<init>", "(La6/i;Landroidx/core/util/Pools$Pool;Lb6/f;)V", "", "width", "height", "Landroid/graphics/BitmapFactory$Options;", "options", "d", "(IILandroid/graphics/BitmapFactory$Options;)I", "imagepipeline_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
@TargetApi(21)
public final class C4492a extends AbstractC4493b {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4492a(@NotNull InterfaceC0149i bitmapPool, @NotNull Pools.Pool<ByteBuffer> decodeBuffers, @NotNull C4497f platformDecoderOptions) {
        super(bitmapPool, decodeBuffers, platformDecoderOptions);
        Intrinsics.checkNotNullParameter(bitmapPool, "bitmapPool");
        Intrinsics.checkNotNullParameter(decodeBuffers, "decodeBuffers");
        Intrinsics.checkNotNullParameter(platformDecoderOptions, "platformDecoderOptions");
    }

    @Override // p034b6.AbstractC4493b
    /* JADX INFO: renamed from: d */
    public int mo4291d(int width, int height, @NotNull BitmapFactory.Options options) {
        Intrinsics.checkNotNullParameter(options, "options");
        Bitmap.Config config = options.inPreferredConfig;
        if (config != null) {
            return C37818c.m85340i(width, height, config);
        }
        throw new IllegalStateException("Required value was null.");
    }
}
