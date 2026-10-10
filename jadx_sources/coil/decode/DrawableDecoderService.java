package coil.decode;

import androidx.media3.exoplayer.upstream.CmcdData;
import coil.bitmap.BitmapPool;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: DrawableDecoderService.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000 \b2\u00020\u0001:\u0001\tB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\n"}, m90084d2 = {"Lcoil/decode/DrawableDecoderService;", "", "Lcoil/bitmap/BitmapPool;", "bitmapPool", "<init>", "(Lcoil/bitmap/BitmapPool;)V", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Lcoil/bitmap/BitmapPool;", "b", "Companion", "coil-base_release"}, m90085k = 1, m90086mv = {1, 5, 1}, m90088xi = 48)
public final class DrawableDecoderService {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final BitmapPool bitmapPool;

    public DrawableDecoderService(@NotNull BitmapPool bitmapPool) {
        Intrinsics.checkNotNullParameter(bitmapPool, "bitmapPool");
        this.bitmapPool = bitmapPool;
    }
}
