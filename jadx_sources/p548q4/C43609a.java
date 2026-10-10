package p548q4;

import android.graphics.drawable.Animatable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p487o4.C42955b;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: q4.a */
/* JADX INFO: compiled from: ImageLoadingTimeControllerListener.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0006\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\u0011\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\b\u0010\t\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ+\u0010\u0010\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\b\u0010\r\u001a\u0004\u0018\u00010\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0017\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0019\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0016¨\u0006\u001a"}, m90084d2 = {"Lq4/a;", "Lo4/b;", "", "Lq4/b;", "imageLoadingTimeListener", "<init>", "(Lq4/b;)V", "", "id", "callerContext", "", "onSubmit", "(Ljava/lang/String;Ljava/lang/Object;)V", "imageInfo", "Landroid/graphics/drawable/Animatable;", "animatable", "onFinalImageSet", "(Ljava/lang/String;Ljava/lang/Object;Landroid/graphics/drawable/Animatable;)V", "c", "Lq4/b;", "", "d", "J", "requestSubmitTimeMs", "e", "finalImageSetTimeMs", "drawee_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public final class C43609a extends C42955b<Object> {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    public final InterfaceC43610b imageLoadingTimeListener;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public long requestSubmitTimeMs = -1;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public long finalImageSetTimeMs = -1;

    @Override // p487o4.C42955b, p487o4.InterfaceC42956c
    public void onFinalImageSet(@NotNull String id2, @Nullable Object imageInfo, @Nullable Animatable animatable) {
        Intrinsics.checkNotNullParameter(id2, "id");
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.finalImageSetTimeMs = jCurrentTimeMillis;
        InterfaceC43610b interfaceC43610b = this.imageLoadingTimeListener;
        if (interfaceC43610b != null) {
            interfaceC43610b.mo95543a(jCurrentTimeMillis - this.requestSubmitTimeMs);
        }
    }

    @Override // p487o4.C42955b, p487o4.InterfaceC42956c
    public void onSubmit(@NotNull String id2, @Nullable Object callerContext) {
        Intrinsics.checkNotNullParameter(id2, "id");
        this.requestSubmitTimeMs = System.currentTimeMillis();
    }

    public C43609a(@Nullable InterfaceC43610b interfaceC43610b) {
        this.imageLoadingTimeListener = interfaceC43610b;
    }
}
