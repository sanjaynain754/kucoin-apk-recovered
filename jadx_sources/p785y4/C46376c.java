package p785y4;

import android.graphics.Bitmap;
import android.util.SparseArray;
import androidx.media3.exoplayer.upstream.CmcdData;
import java.util.concurrent.ExecutorService;
import org.jetbrains.annotations.NotNull;
import p006a4.AbstractC0110a;
import p526p5.AbstractC43387c;
import p683v4.InterfaceC45414a;
import p713w4.InterfaceC45718a;
import p713w4.InterfaceC45719b;
import p747x3.C45999a;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: y4.c */
/* JADX INFO: compiled from: DefaultBitmapFramePreparer.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0013B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00000\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u001a\u0010'\u001a\b\u0012\u0004\u0012\u00020$0#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006("}, m90084d2 = {"Ly4/c;", "Ly4/b;", "Lp5/c;", "platformBitmapFactory", "Lw4/b;", "bitmapFrameRenderer", "Landroid/graphics/Bitmap$Config;", "bitmapConfig", "Ljava/util/concurrent/ExecutorService;", "executorService", "<init>", "(Lp5/c;Lw4/b;Landroid/graphics/Bitmap$Config;Ljava/util/concurrent/ExecutorService;)V", "Lw4/a;", "bitmapFrameCache", "Lv4/a;", "animationBackend", "", "frameNumber", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Lw4/a;Lv4/a;I)Z", "backend", "g", "(Lv4/a;I)I", "Lp5/c;", "b", "Lw4/b;", "c", "Landroid/graphics/Bitmap$Config;", "d", "Ljava/util/concurrent/ExecutorService;", "Ljava/lang/Class;", "e", "Ljava/lang/Class;", "TAG", "Landroid/util/SparseArray;", "Ljava/lang/Runnable;", "f", "Landroid/util/SparseArray;", "pendingFrameDecodeJobs", "animated-drawable_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public final class C46376c implements InterfaceC46375b {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final AbstractC43387c platformBitmapFactory;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC45719b bitmapFrameRenderer;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final Bitmap.Config bitmapConfig;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final ExecutorService executorService;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public final Class<C46376c> TAG;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public final SparseArray<Runnable> pendingFrameDecodeJobs;

    /* JADX INFO: renamed from: y4.c$a */
    /* JADX INFO: compiled from: DefaultBitmapFramePreparer.kt */
    @Metadata(m90083d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0082\u0004\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J/\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u00062\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00122\u0006\u0010\u000e\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\b\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001b¨\u0006\u001d"}, m90084d2 = {"Ly4/c$a;", "Ljava/lang/Runnable;", "Lv4/a;", "animationBackend", "Lw4/a;", "bitmapFrameCache", "", "frameNumber", "frameId", "<init>", "(Ly4/c;Lv4/a;Lw4/a;II)V", "", "run", "()V", "frameType", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(II)Z", "La4/a;", "Landroid/graphics/Bitmap;", "bitmapReference", "b", "(ILa4/a;I)Z", "Lv4/a;", "c", "Lw4/a;", "d", "I", "e", "animated-drawable_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nDefaultBitmapFramePreparer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DefaultBitmapFramePreparer.kt\ncom/facebook/fresco/animation/bitmap/preparation/DefaultBitmapFramePreparer$FrameDecodeRunnable\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,159:1\n1#2:160\n*E\n"})
    public final class a implements Runnable {

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        public final InterfaceC45414a animationBackend;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        @NotNull
        public final InterfaceC45718a bitmapFrameCache;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        public final int frameNumber;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        public final int frameId;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ C46376c f103993f;

        /* JADX INFO: renamed from: a */
        public final boolean m102285a(int frameNumber, int frameType) {
            AbstractC0110a<Bitmap> abstractC0110aMo8764d;
            int i11 = 2;
            try {
                if (frameType == 1) {
                    abstractC0110aMo8764d = this.bitmapFrameCache.mo8764d(frameNumber, this.animationBackend.mo8744c(), this.animationBackend.mo8745d());
                } else {
                    if (frameType != 2) {
                        AbstractC0110a.m555j(null);
                        return false;
                    }
                    abstractC0110aMo8764d = this.f103993f.platformBitmapFactory.m95561b(this.animationBackend.mo8744c(), this.animationBackend.mo8745d(), this.f103993f.bitmapConfig);
                    i11 = -1;
                }
                AbstractC0110a<Bitmap> abstractC0110a = abstractC0110aMo8764d;
                boolean zM102286b = m102286b(frameNumber, abstractC0110a, frameType);
                AbstractC0110a.m555j(abstractC0110a);
                return (zM102286b || i11 == -1) ? zM102286b : m102285a(frameNumber, i11);
            } catch (RuntimeException e11) {
                C45999a.m101485F(this.f103993f.TAG, "Failed to create frame bitmap", e11);
                return false;
            } finally {
                AbstractC0110a.m555j(null);
            }
        }

        public a(@NotNull C46376c c46376c, @NotNull InterfaceC45414a animationBackend, InterfaceC45718a bitmapFrameCache, int i11, int i12) {
            Intrinsics.checkNotNullParameter(animationBackend, "animationBackend");
            Intrinsics.checkNotNullParameter(bitmapFrameCache, "bitmapFrameCache");
            this.f103993f = c46376c;
            this.animationBackend = animationBackend;
            this.bitmapFrameCache = bitmapFrameCache;
            this.frameNumber = i11;
            this.frameId = i12;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (this.bitmapFrameCache.contains(this.frameNumber)) {
                    C45999a.m101519y(this.f103993f.TAG, "Frame %d is cached already.", Integer.valueOf(this.frameNumber));
                    SparseArray sparseArray = this.f103993f.pendingFrameDecodeJobs;
                    C46376c c46376c = this.f103993f;
                    synchronized (sparseArray) {
                        c46376c.pendingFrameDecodeJobs.remove(this.frameId);
                        Unit unit = Unit.INSTANCE;
                    }
                    return;
                }
                if (m102285a(this.frameNumber, 1)) {
                    C45999a.m101519y(this.f103993f.TAG, "Prepared frame %d.", Integer.valueOf(this.frameNumber));
                } else {
                    C45999a.m101505k(this.f103993f.TAG, "Could not prepare frame %d.", Integer.valueOf(this.frameNumber));
                }
                SparseArray sparseArray2 = this.f103993f.pendingFrameDecodeJobs;
                C46376c c46376c2 = this.f103993f;
                synchronized (sparseArray2) {
                    c46376c2.pendingFrameDecodeJobs.remove(this.frameId);
                    Unit unit2 = Unit.INSTANCE;
                }
            } catch (Throwable th2) {
                SparseArray sparseArray3 = this.f103993f.pendingFrameDecodeJobs;
                C46376c c46376c3 = this.f103993f;
                synchronized (sparseArray3) {
                    c46376c3.pendingFrameDecodeJobs.remove(this.frameId);
                    Unit unit3 = Unit.INSTANCE;
                    throw th2;
                }
            }
        }

        /* JADX INFO: renamed from: b */
        public final boolean m102286b(int frameNumber, AbstractC0110a<Bitmap> bitmapReference, int frameType) {
            if (AbstractC0110a.m557o(bitmapReference) && bitmapReference != null) {
                InterfaceC45719b interfaceC45719b = this.f103993f.bitmapFrameRenderer;
                Bitmap bitmapM565l = bitmapReference.m565l();
                Intrinsics.checkNotNullExpressionValue(bitmapM565l, "get(...)");
                if (interfaceC45719b.mo8808a(frameNumber, bitmapM565l)) {
                    C45999a.m101519y(this.f103993f.TAG, "Frame %d ready.", Integer.valueOf(frameNumber));
                    synchronized (this.f103993f.pendingFrameDecodeJobs) {
                        this.bitmapFrameCache.mo8765e(frameNumber, bitmapReference, frameType);
                        Unit unit = Unit.INSTANCE;
                    }
                    return true;
                }
            }
            return false;
        }
    }

    @Override // p785y4.InterfaceC46375b
    /* JADX INFO: renamed from: a */
    public boolean mo102278a(@NotNull InterfaceC45718a bitmapFrameCache, @NotNull InterfaceC45414a animationBackend, int frameNumber) throws Throwable {
        Throwable th2;
        Intrinsics.checkNotNullParameter(bitmapFrameCache, "bitmapFrameCache");
        Intrinsics.checkNotNullParameter(animationBackend, "animationBackend");
        int iM102284g = m102284g(animationBackend, frameNumber);
        synchronized (this.pendingFrameDecodeJobs) {
            try {
                try {
                    if (this.pendingFrameDecodeJobs.get(iM102284g) != null) {
                        C45999a.m101519y(this.TAG, "Already scheduled decode job for frame %d", Integer.valueOf(frameNumber));
                        return true;
                    }
                    if (bitmapFrameCache.contains(frameNumber)) {
                        C45999a.m101519y(this.TAG, "Frame %d is cached already.", Integer.valueOf(frameNumber));
                        return true;
                    }
                    try {
                        a aVar = new a(this, animationBackend, bitmapFrameCache, frameNumber, iM102284g);
                        this.pendingFrameDecodeJobs.put(iM102284g, aVar);
                        this.executorService.execute(aVar);
                        Unit unit = Unit.INSTANCE;
                        return true;
                    } catch (Throwable th3) {
                        th = th3;
                    }
                } catch (Throwable th4) {
                    th2 = th4;
                }
            } catch (Throwable th5) {
                th = th5;
            }
            th2 = th;
            throw th2;
        }
    }

    public C46376c(@NotNull AbstractC43387c platformBitmapFactory, @NotNull InterfaceC45719b bitmapFrameRenderer, @NotNull Bitmap.Config bitmapConfig, @NotNull ExecutorService executorService) {
        Intrinsics.checkNotNullParameter(platformBitmapFactory, "platformBitmapFactory");
        Intrinsics.checkNotNullParameter(bitmapFrameRenderer, "bitmapFrameRenderer");
        Intrinsics.checkNotNullParameter(bitmapConfig, "bitmapConfig");
        Intrinsics.checkNotNullParameter(executorService, "executorService");
        this.platformBitmapFactory = platformBitmapFactory;
        this.bitmapFrameRenderer = bitmapFrameRenderer;
        this.bitmapConfig = bitmapConfig;
        this.executorService = executorService;
        this.TAG = C46376c.class;
        this.pendingFrameDecodeJobs = new SparseArray<>();
    }

    /* JADX INFO: renamed from: g */
    public final int m102284g(InterfaceC45414a backend, int frameNumber) {
        return (backend.hashCode() * 31) + frameNumber;
    }
}
