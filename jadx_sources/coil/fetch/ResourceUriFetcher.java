package coil.fetch;

import android.content.Context;
import android.net.Uri;
import androidx.media3.exoplayer.upstream.CmcdData;
import coil.decode.DrawableDecoderService;
import org.jetbrains.annotations.NotNull;
import p679v0.InterfaceC45342d;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ResourceUriFetcher.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000eB\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u000f"}, m90084d2 = {"Lcoil/fetch/ResourceUriFetcher;", "Lv0/d;", "Landroid/net/Uri;", "Landroid/content/Context;", "context", "Lcoil/decode/DrawableDecoderService;", "drawableDecoder", "<init>", "(Landroid/content/Context;Lcoil/decode/DrawableDecoderService;)V", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Landroid/content/Context;", "b", "Lcoil/decode/DrawableDecoderService;", "c", "Companion", "coil-base_release"}, m90085k = 1, m90086mv = {1, 5, 1}, m90088xi = 48)
public final class ResourceUriFetcher implements InterfaceC45342d<Uri> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Context context;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final DrawableDecoderService drawableDecoder;

    public ResourceUriFetcher(@NotNull Context context, @NotNull DrawableDecoderService drawableDecoder) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(drawableDecoder, "drawableDecoder");
        this.context = context;
        this.drawableDecoder = drawableDecoder;
    }
}
