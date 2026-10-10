package p007a5;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.facebook.fresco.animation.bitmap.preparation.ondemandanimation.InterfaceC5611b;
import java.util.Date;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: a5.h */
/* JADX INFO: compiled from: AnimationLoaderFactory.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\r¨\u0006\u000e"}, m90084d2 = {"La5/h;", "", "Lcom/facebook/fresco/animation/bitmap/preparation/ondemandanimation/b;", "frameLoader", "Ljava/util/Date;", "insertedTime", "<init>", "(Lcom/facebook/fresco/animation/bitmap/preparation/ondemandanimation/b;Ljava/util/Date;)V", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Lcom/facebook/fresco/animation/bitmap/preparation/ondemandanimation/b;", "()Lcom/facebook/fresco/animation/bitmap/preparation/ondemandanimation/b;", "b", "Ljava/util/Date;", "()Ljava/util/Date;", "animated-drawable_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public final class C0131h {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC5611b frameLoader;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final Date insertedTime;

    public C0131h(@NotNull InterfaceC5611b frameLoader, @NotNull Date insertedTime) {
        Intrinsics.checkNotNullParameter(frameLoader, "frameLoader");
        Intrinsics.checkNotNullParameter(insertedTime, "insertedTime");
        this.frameLoader = frameLoader;
        this.insertedTime = insertedTime;
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final InterfaceC5611b getFrameLoader() {
        return this.frameLoader;
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final Date getInsertedTime() {
        return this.insertedTime;
    }
}
