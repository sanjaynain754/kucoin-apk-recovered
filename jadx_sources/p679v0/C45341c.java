package p679v0;

import android.graphics.drawable.Drawable;
import androidx.media3.exoplayer.upstream.CmcdData;
import coil.decode.DrawableDecoderService;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: v0.c */
/* JADX INFO: compiled from: DrawableFetcher.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\t"}, m90084d2 = {"Lv0/c;", "Lv0/d;", "Landroid/graphics/drawable/Drawable;", "Lcoil/decode/DrawableDecoderService;", "drawableDecoder", "<init>", "(Lcoil/decode/DrawableDecoderService;)V", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Lcoil/decode/DrawableDecoderService;", "coil-base_release"}, m90085k = 1, m90086mv = {1, 5, 1}, m90088xi = 48)
public final class C45341c implements InterfaceC45342d<Drawable> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final DrawableDecoderService drawableDecoder;

    public C45341c(@NotNull DrawableDecoderService drawableDecoder) {
        Intrinsics.checkNotNullParameter(drawableDecoder, "drawableDecoder");
        this.drawableDecoder = drawableDecoder;
    }
}
