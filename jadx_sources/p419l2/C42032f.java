package p419l2;

import android.graphics.Bitmap;
import androidx.annotation.CheckResult;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p628t1.InterfaceC44610b;
import p628t1.InterfaceC44616h;
import p680v1.AbstractC45352c;

/* JADX INFO: renamed from: l2.f */
/* JADX INFO: compiled from: RequestOptions.java */
/* JADX INFO: loaded from: classes.dex */
public class C42032f extends AbstractC42027a<C42032f> {

    /* JADX INFO: renamed from: B */
    @Nullable
    public static C42032f f92310B;

    /* JADX INFO: renamed from: C */
    @Nullable
    public static C42032f f92311C;

    /* JADX INFO: renamed from: D */
    @Nullable
    public static C42032f f92312D;

    /* JADX INFO: renamed from: E */
    @Nullable
    public static C42032f f92313E;

    @NonNull
    @CheckResult
    /* JADX INFO: renamed from: s0 */
    public static C42032f m92235s0(@NonNull InterfaceC44616h<Bitmap> interfaceC44616h) {
        return new C42032f().mo92213o0(interfaceC44616h);
    }

    @NonNull
    @CheckResult
    /* JADX INFO: renamed from: t0 */
    public static C42032f m92236t0() {
        if (f92312D == null) {
            f92312D = new C42032f().mo92193e().mo92187b();
        }
        return f92312D;
    }

    @NonNull
    @CheckResult
    /* JADX INFO: renamed from: u0 */
    public static C42032f m92237u0(@NonNull Class<?> cls) {
        return new C42032f().mo92196g(cls);
    }

    @NonNull
    @CheckResult
    /* JADX INFO: renamed from: v0 */
    public static C42032f m92238v0(@NonNull AbstractC45352c abstractC45352c) {
        return new C42032f().mo92200i(abstractC45352c);
    }

    @NonNull
    @CheckResult
    /* JADX INFO: renamed from: w0 */
    public static C42032f m92239w0() {
        if (f92313E == null) {
            f92313E = new C42032f().mo92202j().mo92187b();
        }
        return f92313E;
    }

    @NonNull
    @CheckResult
    /* JADX INFO: renamed from: x0 */
    public static C42032f m92240x0(@NonNull InterfaceC44610b interfaceC44610b) {
        return new C42032f().mo92203j0(interfaceC44610b);
    }

    @NonNull
    @CheckResult
    /* JADX INFO: renamed from: y0 */
    public static C42032f m92241y0(boolean z11) {
        if (z11) {
            if (f92310B == null) {
                f92310B = new C42032f().mo92207l0(true).mo92187b();
            }
            return f92310B;
        }
        if (f92311C == null) {
            f92311C = new C42032f().mo92207l0(false).mo92187b();
        }
        return f92311C;
    }
}
