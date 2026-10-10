package p051c5;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.facebook.drawee.drawable.C5580d;
import com.facebook.fresco.animation.frame.DropFramesFrameScheduler;
import com.tencent.bugly.proguard.InterfaceC33730j9;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p358j4.InterfaceC40267a;
import p683v4.InterfaceC45414a;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: c5.f */
/* JADX INFO: compiled from: KAnimatedDrawable2.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0005*\u00012\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000f\u001a\u00020\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0015\u0010\u0014J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0019\u0010\u0014J\u0017\u0010\u001c\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u001aH\u0014¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001e\u0010\u0012J\u000f\u0010\u001f\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001f\u0010\u0012J\u0017\u0010\"\u001a\u00020\n2\u0006\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b\"\u0010#R\u0016\u0010\u0005\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010)\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0016\u0010-\u001a\u00020*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u00101\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u00105\u001a\u0002028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104¨\u00066"}, m90084d2 = {"Lc5/f;", "Landroid/graphics/drawable/Drawable;", "Landroid/graphics/drawable/Animatable;", "Lj4/a;", "Lv4/a;", "animationBackend", "<init>", "(Lv4/a;)V", "", "alpha", "", "setAlpha", "(I)V", "Landroid/graphics/ColorFilter;", "colorFilter", "setColorFilter", "(Landroid/graphics/ColorFilter;)V", "getOpacity", "()I", "start", "()V", InterfaceC33730j9.f70350a, "", "isRunning", "()Z", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Landroid/graphics/Rect;", "bounds", "onBoundsChange", "(Landroid/graphics/Rect;)V", "getIntrinsicWidth", "getIntrinsicHeight", "Landroid/graphics/Canvas;", "canvas", "draw", "(Landroid/graphics/Canvas;)V", "b", "Lv4/a;", "Lc5/c;", "c", "Lc5/c;", "animatedFrameScheduler", "Lc5/d;", "d", "Lc5/d;", "animationListener", "Lcom/facebook/drawee/drawable/d;", "e", "Lcom/facebook/drawee/drawable/d;", "drawableProperties", "c5/f$a", "f", "Lc5/f$a;", "invalidateRunnable", "animated-drawable_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nKAnimatedDrawable2.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KAnimatedDrawable2.kt\ncom/facebook/fresco/animation/drawable/KAnimatedDrawable2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,222:1\n1#2:223\n*E\n"})
public final class C4840f extends Drawable implements Animatable, InterfaceC40267a {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public InterfaceC45414a animationBackend;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final C4837c animatedFrameScheduler;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public InterfaceC4838d animationListener;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public final C5580d drawableProperties;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public final a invalidateRunnable;

    /* JADX INFO: renamed from: c5.f$a */
    /* JADX INFO: compiled from: KAnimatedDrawable2.kt */
    @Metadata(m90083d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m90084d2 = {"c5/f$a", "Ljava/lang/Runnable;", "", "run", "()V", "animated-drawable_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
    public static final class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C4840f.this.unscheduleSelf(this);
            C4840f.this.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    public C4840f(@NotNull InterfaceC45414a animationBackend) {
        Intrinsics.checkNotNullParameter(animationBackend, "animationBackend");
        this.animationBackend = animationBackend;
        this.animatedFrameScheduler = new C4837c(new DropFramesFrameScheduler(this.animationBackend));
        this.animationListener = new C4839e();
        C5580d c5580d = new C5580d();
        c5580d.m8659a(this);
        this.drawableProperties = c5580d;
        this.invalidateRunnable = new a();
    }

    @Override // p358j4.InterfaceC40267a
    /* JADX INFO: renamed from: a */
    public void mo4953a() {
        this.animationBackend.clear();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        int iM4957a = this.animatedFrameScheduler.m4957a();
        if (iM4957a == -1) {
            iM4957a = this.animationBackend.mo4283a() - 1;
            this.animatedFrameScheduler.m4963g(false);
            this.animationListener.mo4970d(this);
        } else if (iM4957a == 0 && this.animatedFrameScheduler.m4964h()) {
            this.animationListener.mo4969c(this);
        }
        if (this.animationBackend.mo8750m(this, canvas, iM4957a)) {
            this.animationListener.mo4968b(this, iM4957a);
            this.animatedFrameScheduler.m4962f(iM4957a);
        } else {
            this.animatedFrameScheduler.m4961e();
        }
        long jM4959c = this.animatedFrameScheduler.m4959c();
        if (jM4959c != -1) {
            scheduleSelf(this.invalidateRunnable, jM4959c);
        } else {
            this.animationListener.mo4970d(this);
            this.animatedFrameScheduler.m4963g(false);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.animationBackend.mo8745d();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.animationBackend.mo8744c();
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return this.animatedFrameScheduler.getRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(@NotNull Rect bounds) {
        Intrinsics.checkNotNullParameter(bounds, "bounds");
        this.animationBackend.mo8746e(bounds);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int alpha) {
        this.drawableProperties.m8660b(alpha);
        this.animationBackend.mo8748j(alpha);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(@Nullable ColorFilter colorFilter) {
        this.drawableProperties.m8661c(colorFilter);
        this.animationBackend.mo8747f(colorFilter);
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        if (this.animationBackend.mo4283a() <= 0) {
            return;
        }
        this.animatedFrameScheduler.m4965i();
        this.animationListener.mo4967a(this);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        this.animatedFrameScheduler.m4966j();
        this.animationListener.mo4970d(this);
        unscheduleSelf(this.invalidateRunnable);
    }
}
