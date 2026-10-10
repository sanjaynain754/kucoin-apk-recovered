package p744x0;

import androidx.media3.exoplayer.upstream.CmcdData;
import coil.ImageLoader;
import kotlin.InterfaceC4450g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p612s0.InterfaceC44260a;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: x0.a */
/* JADX INFO: compiled from: DelegateService.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, m90084d2 = {"Lx0/a;", "", "Lcoil/ImageLoader;", "imageLoader", "Ls0/a;", "referenceCounter", "Lb1/g;", "logger", "<init>", "(Lcoil/ImageLoader;Ls0/a;Lb1/g;)V", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Lcoil/ImageLoader;", "b", "Ls0/a;", "coil-base_release"}, m90085k = 1, m90086mv = {1, 5, 1}, m90088xi = 48)
public final class C45966a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final ImageLoader imageLoader;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC44260a referenceCounter;

    public C45966a(@NotNull ImageLoader imageLoader, @NotNull InterfaceC44260a referenceCounter, @Nullable InterfaceC4450g interfaceC4450g) {
        Intrinsics.checkNotNullParameter(imageLoader, "imageLoader");
        Intrinsics.checkNotNullParameter(referenceCounter, "referenceCounter");
        this.imageLoader = imageLoader;
        this.referenceCounter = referenceCounter;
    }
}
