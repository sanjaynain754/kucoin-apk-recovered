package p034b6;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import androidx.core.util.Pools;
import androidx.media3.exoplayer.upstream.CmcdData;
import java.nio.ByteBuffer;
import org.jetbrains.annotations.NotNull;
import p008a6.InterfaceC0149i;
import p284g6.C37818c;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: b6.c */
/* JADX INFO: compiled from: OreoDecoder.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ'\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, m90084d2 = {"Lb6/c;", "Lb6/b;", "La6/i;", "bitmapPool", "Landroidx/core/util/Pools$Pool;", "Ljava/nio/ByteBuffer;", "decodeBuffers", "Lb6/f;", "platformDecoderOptions", "<init>", "(La6/i;Landroidx/core/util/Pools$Pool;Lb6/f;)V", "", "width", "height", "Landroid/graphics/BitmapFactory$Options;", "options", "d", "(IILandroid/graphics/BitmapFactory$Options;)I", CmcdData.Factory.STREAMING_FORMAT_HLS, "Lb6/f;", "getPlatformDecoderOptions", "()Lb6/f;", "imagepipeline_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
@TargetApi(26)
public final class C4494c extends AbstractC4493b {

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    public final C4497f platformDecoderOptions;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4494c(@NotNull InterfaceC0149i bitmapPool, @NotNull Pools.Pool<ByteBuffer> decodeBuffers, @NotNull C4497f platformDecoderOptions) {
        super(bitmapPool, decodeBuffers, platformDecoderOptions);
        Intrinsics.checkNotNullParameter(bitmapPool, "bitmapPool");
        Intrinsics.checkNotNullParameter(decodeBuffers, "decodeBuffers");
        Intrinsics.checkNotNullParameter(platformDecoderOptions, "platformDecoderOptions");
        this.platformDecoderOptions = platformDecoderOptions;
    }

    @Override // p034b6.AbstractC4493b
    /* JADX INFO: renamed from: d */
    public int mo4291d(int width, int height, @NotNull BitmapFactory.Options options) {
        Intrinsics.checkNotNullParameter(options, "options");
        Bitmap.Config config = options.outConfig;
        if (config == null) {
            config = Bitmap.Config.ARGB_8888;
        }
        return C37818c.m85340i(width, height, config);
    }
}
