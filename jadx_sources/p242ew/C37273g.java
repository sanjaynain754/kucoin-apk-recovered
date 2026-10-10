package p242ew;

import android.content.Context;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Shader;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import androidx.annotation.ColorInt;
import com.kubi.resources.shimmer.mask.SkeletonShimmerDirection;
import com.tencent.bugly.proguard.InterfaceC33730j9;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p213dw.C36985a;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: ew.g */
/* JADX INFO: compiled from: SkeletonMaskShimmer.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\u0005¢\u0006\u0004\b\f\u0010\rJ\b\u0010 \u001a\u00020!H\u0016J\b\u0010\"\u001a\u00020!H\u0016J\b\u0010#\u001a\u00020!H\u0016J\b\u0010$\u001a\u00020%H\u0014J\b\u0010&\u001a\u00020!H\u0002J\b\u0010'\u001a\u00020\u0014H\u0002J\b\u0010(\u001a\u00020\u0014H\u0002R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u000e\u001a\u00020\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u0017\u001a\u00020\u00188BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u0012\u001a\u0004\b\u0019\u0010\u001aR\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u001fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006)"}, m90084d2 = {"Lcom/kubi/resources/shimmer/mask/SkeletonMaskShimmer;", "Lcom/kubi/resources/shimmer/mask/SkeletonMask;", "parent", "Landroid/view/View;", "maskColor", "", "shimmerColor", "durationInMillis", "", "shimmerDirection", "Lcom/kubi/resources/shimmer/mask/SkeletonShimmerDirection;", "shimmerAngle", "<init>", "(Landroid/view/View;IIJLcom/kubi/resources/shimmer/mask/SkeletonShimmerDirection;I)V", "refreshIntervalInMillis", "getRefreshIntervalInMillis", "()J", "refreshIntervalInMillis$delegate", "Lkotlin/Lazy;", "width", "", "matrix", "Landroid/graphics/Matrix;", "shimmerGradient", "Landroid/graphics/LinearGradient;", "getShimmerGradient", "()Landroid/graphics/LinearGradient;", "shimmerGradient$delegate", "animation", "Landroid/os/Handler;", "animationTask", "Ljava/lang/Runnable;", "invalidate", "", "start", InterfaceC33730j9.f70350a, "createPaint", "Landroid/graphics/Paint;", "updateShimmer", "currentOffset", "currentProgress", "LComponent_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nSkeletonMaskShimmer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SkeletonMaskShimmer.kt\ncom/kubi/resources/shimmer/mask/SkeletonMaskShimmer\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,111:1\n1#2:112\n*E\n"})
public final class C37273g extends AbstractC37270d {

    /* JADX INFO: renamed from: f */
    public final int f82645f;

    /* JADX INFO: renamed from: g */
    public final long f82646g;

    /* JADX INFO: renamed from: h */
    @NotNull
    public final SkeletonShimmerDirection f82647h;

    /* JADX INFO: renamed from: i */
    public final int f82648i;

    /* JADX INFO: renamed from: j */
    @NotNull
    public final Lazy f82649j;

    /* JADX INFO: renamed from: k */
    public final float f82650k;

    /* JADX INFO: renamed from: l */
    @NotNull
    public final Matrix f82651l;

    /* JADX INFO: renamed from: m */
    @NotNull
    public final Lazy f82652m;

    /* JADX INFO: renamed from: n */
    @Nullable
    public Handler f82653n;

    /* JADX INFO: renamed from: o */
    @Nullable
    public Runnable f82654o;

    /* JADX INFO: renamed from: ew.g$b */
    /* JADX INFO: compiled from: SkeletonMaskShimmer.kt */
    @Metadata(m90083d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m90084d2 = {"com/kubi/resources/shimmer/mask/SkeletonMaskShimmer$start$1", "Ljava/lang/Runnable;", "run", "", "LComponent_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                C37273g.this.m83445H();
                Handler handler = C37273g.this.f82653n;
                if (handler != null) {
                    handler.postDelayed(this, C37273g.this.m83443D());
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX INFO: renamed from: ew.g$a */
    /* JADX INFO: compiled from: SkeletonMaskShimmer.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SkeletonShimmerDirection.values().length];
            try {
                iArr[SkeletonShimmerDirection.LEFT_TO_RIGHT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SkeletonShimmerDirection.RIGHT_TO_LEFT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C37273g(@NotNull final View parent, @ColorInt int i11, @ColorInt int i12, long j11, @NotNull SkeletonShimmerDirection shimmerDirection, int i13) {
        super(parent, i11);
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(shimmerDirection, "shimmerDirection");
        this.f82645f = i12;
        this.f82646g = j11;
        this.f82647h = shimmerDirection;
        this.f82648i = i13;
        this.f82649j = LazyKt.lazy(new Function0() { // from class: ew.e
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Long.valueOf(C37273g.m83435F(parent));
            }
        });
        this.f82650k = parent.getWidth();
        this.f82651l = new Matrix();
        this.f82652m = LazyKt.lazy(new Function0() { // from class: ew.f
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C37273g.m83436G(this.f82644b);
            }
        });
    }

    /* JADX INFO: renamed from: G */
    public static final LinearGradient m83436G(C37273g c37273g) {
        double radians = (float) Math.toRadians(c37273g.f82648i);
        return new LinearGradient(0.0f, 0.0f, ((float) Math.cos(radians)) * c37273g.f82650k, ((float) Math.sin(radians)) * c37273g.f82650k, new int[]{c37273g.getF82639b(), c37273g.f82645f, c37273g.getF82639b()}, (float[]) null, Shader.TileMode.CLAMP);
    }

    /* JADX INFO: renamed from: B */
    public final float m83441B() {
        float fM83442C;
        int i11 = a.$EnumSwitchMapping$0[this.f82647h.ordinal()];
        if (i11 == 1) {
            fM83442C = m83442C();
        } else {
            if (i11 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            fM83442C = 1 - m83442C();
        }
        float f11 = this.f82650k;
        float f12 = 2 * f11;
        float f13 = -f12;
        return (fM83442C * ((f11 + f12) - f13)) + f13;
    }

    /* JADX INFO: renamed from: D */
    public final long m83443D() {
        return ((Number) this.f82649j.getValue()).longValue();
    }

    /* JADX INFO: renamed from: E */
    public final LinearGradient m83444E() {
        return (LinearGradient) this.f82652m.getValue();
    }

    /* JADX INFO: renamed from: H */
    public final void m83445H() {
        this.f82651l.setTranslate(m83441B(), 0.0f);
        m83427o().getShader().setLocalMatrix(this.f82651l);
        getF82638a().invalidate();
    }

    @Override // p242ew.AbstractC37270d
    @NotNull
    /* JADX INFO: renamed from: h */
    public Paint mo83420h() {
        Paint paint = new Paint();
        paint.setShader(m83444E());
        paint.setAntiAlias(true);
        return paint;
    }

    @Override // p242ew.InterfaceC37274h
    public void start() {
        if (this.f82653n == null) {
            this.f82653n = new Handler(Looper.getMainLooper());
            b bVar = new b();
            this.f82654o = bVar;
            Handler handler = this.f82653n;
            if (handler != null) {
                handler.post(bVar);
            }
        }
    }

    @Override // p242ew.InterfaceC37274h
    public void stop() {
        Handler handler;
        Runnable runnable = this.f82654o;
        if (runnable != null && (handler = this.f82653n) != null) {
            handler.removeCallbacks(runnable);
        }
        this.f82653n = null;
    }

    /* JADX INFO: renamed from: F */
    public static final long m83435F(View view) {
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        return (long) ((1000.0f / C36985a.m82806d(context)) * 0.9f);
    }

    /* JADX INFO: renamed from: C */
    public final float m83442C() {
        double dCurrentTimeMillis = System.currentTimeMillis();
        double d11 = this.f82646g;
        double dFloor = Math.floor(dCurrentTimeMillis / d11) * d11;
        return (float) ((dCurrentTimeMillis - dFloor) / ((d11 + dFloor) - dFloor));
    }

    @Override // p242ew.InterfaceC37274h
    public void invalidate() {
        if (C36985a.m82804b(getF82638a()) && getF82638a().getVisibility() == 0) {
            start();
        } else {
            stop();
        }
    }
}
