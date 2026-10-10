package p785y4;

import android.graphics.Bitmap;
import androidx.media3.exoplayer.upstream.CmcdData;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p006a4.AbstractC0110a;
import p683v4.InterfaceC45414a;
import p713w4.InterfaceC45718a;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: y4.a */
/* JADX INFO: compiled from: BitmapFramePreparationStrategy.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001JA\u0010\r\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ/\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\b2\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0015\u0010\u0014J/\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00172\u0006\u0010\u0016\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, m90084d2 = {"Ly4/a;", "", "Ly4/b;", "bitmapFramePreparer", "Lw4/a;", "bitmapFrameCache", "Lv4/a;", "animationBackend", "", "lastDrawnFrameNumber", "Lkotlin/Function0;", "", "onAnimationLoaded", "d", "(Ly4/b;Lw4/a;Lv4/a;ILkotlin/jvm/functions/Function0;)V", "canvasWidth", "canvasHeight", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(IILkotlin/jvm/functions/Function0;)V", "onStop", "()V", "c", "frameNumber", "La4/a;", "Landroid/graphics/Bitmap;", "b", "(III)La4/a;", "animated-drawable_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public interface InterfaceC46374a {

    /* JADX INFO: renamed from: y4.a$a */
    /* JADX INFO: compiled from: BitmapFramePreparationStrategy.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 0, 0}, m90088xi = 48)
    public static final class a {
        @Nullable
        /* JADX INFO: renamed from: b */
        public static AbstractC0110a<Bitmap> m102273b(@NotNull InterfaceC46374a interfaceC46374a, int i11, int i12, int i13) {
            return null;
        }

        /* JADX INFO: renamed from: e */
        public static void m102276e(@NotNull InterfaceC46374a interfaceC46374a, @NotNull InterfaceC46375b bitmapFramePreparer, @NotNull InterfaceC45718a bitmapFrameCache, @NotNull InterfaceC45414a animationBackend, int i11, @Nullable Function0<Unit> function0) {
            Intrinsics.checkNotNullParameter(bitmapFramePreparer, "bitmapFramePreparer");
            Intrinsics.checkNotNullParameter(bitmapFrameCache, "bitmapFrameCache");
            Intrinsics.checkNotNullParameter(animationBackend, "animationBackend");
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: f */
        public static /* synthetic */ void m102277f(InterfaceC46374a interfaceC46374a, InterfaceC46375b interfaceC46375b, InterfaceC45718a interfaceC45718a, InterfaceC45414a interfaceC45414a, int i11, Function0 function0, int i12, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: prepareFrames");
            }
            if ((i12 & 16) != 0) {
                function0 = null;
            }
            interfaceC46374a.mo102271d(interfaceC46375b, interfaceC45718a, interfaceC45414a, i11, function0);
        }

        /* JADX INFO: renamed from: a */
        public static void m102272a(@NotNull InterfaceC46374a interfaceC46374a) {
        }

        /* JADX INFO: renamed from: c */
        public static void m102274c(@NotNull InterfaceC46374a interfaceC46374a) {
        }

        /* JADX INFO: renamed from: d */
        public static void m102275d(@NotNull InterfaceC46374a interfaceC46374a, int i11, int i12, @Nullable Function0<Unit> function0) {
        }
    }

    /* JADX INFO: renamed from: a */
    void mo102268a(int canvasWidth, int canvasHeight, @Nullable Function0<Unit> onAnimationLoaded);

    @Nullable
    /* JADX INFO: renamed from: b */
    AbstractC0110a<Bitmap> mo102269b(int frameNumber, int canvasWidth, int canvasHeight);

    /* JADX INFO: renamed from: c */
    void mo102270c();

    /* JADX INFO: renamed from: d */
    void mo102271d(@NotNull InterfaceC46375b bitmapFramePreparer, @NotNull InterfaceC45718a bitmapFrameCache, @NotNull InterfaceC45414a animationBackend, int lastDrawnFrameNumber, @Nullable Function0<Unit> onAnimationLoaded);

    void onStop();
}
