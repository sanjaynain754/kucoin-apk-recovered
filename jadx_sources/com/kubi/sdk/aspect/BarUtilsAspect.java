package com.kubi.sdk.aspect;

import android.content.res.Resources;
import org.aspectj.lang.InterfaceC43176b;
import org.aspectj.lang.NoAspectBoundException;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: BarUtilsAspect.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u0017\b\u0000\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\t\b\u0016¢\u0006\u0004\b\u0005\u0010\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0007J\u0010\u0010\f\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0007J\u0010\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u0004H\u0002J\u0010\u0010\u000f\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u0004H\u0002R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, m90084d2 = {"Lcom/kubi/sdk/aspect/BarUtilsAspect;", "", "densityProvider", "Lkotlin/Function0;", "", "<init>", "(Lkotlin/jvm/functions/Function0;)V", "()V", "getNavBarHeight", "", "point", "Lorg/aspectj/lang/ProceedingJoinPoint;", "getStatusBarHeight", "defaultNavBarHeightPx", "density", "defaultStatusBarHeightPx", "Companion", "LBase_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class BarUtilsAspect {

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final Companion f46461b = new Companion(null);

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ Throwable f46462c;

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ BarUtilsAspect f46463d;

    /* JADX INFO: renamed from: a */
    @NotNull
    public final Function0<Float> f46464a;

    /* JADX INFO: compiled from: BarUtilsAspect.kt */
    @Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, m90084d2 = {"Lcom/kubi/sdk/aspect/BarUtilsAspect$Companion;", "", "<init>", "()V", "DEFAULT_NAV_BAR_HEIGHT_DP", "", "DEFAULT_STATUS_BAR_HEIGHT_DP", "LBase_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    public BarUtilsAspect(@NotNull Function0<Float> densityProvider) {
        Intrinsics.checkNotNullParameter(densityProvider, "densityProvider");
        this.f46464a = densityProvider;
    }

    static {
        try {
            m56516f();
        } catch (Throwable th2) {
            f46462c = th2;
        }
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m56516f() {
        f46463d = new BarUtilsAspect();
    }

    /* JADX INFO: renamed from: g */
    public static BarUtilsAspect m56517g() {
        BarUtilsAspect barUtilsAspect = f46463d;
        if (barUtilsAspect != null) {
            return barUtilsAspect;
        }
        throw new NoAspectBoundException("com.kubi.sdk.aspect.BarUtilsAspect", f46462c);
    }

    /* JADX INFO: renamed from: h */
    public final int m56518h(float f11) {
        return (int) ((f11 * 48.0f) + 0.5f);
    }

    /* JADX INFO: renamed from: i */
    public final int m56519i(float f11) {
        return (int) ((f11 * 24.0f) + 0.5f);
    }

    /* JADX INFO: renamed from: j */
    public final int m56520j(@NotNull InterfaceC43176b point) throws Throwable {
        Intrinsics.checkNotNullParameter(point, "point");
        try {
            Object objMo82133d = point.mo82133d(point.mo82131b());
            Intrinsics.checkNotNull(objMo82133d, "null cannot be cast to non-null type kotlin.Int");
            return ((Integer) objMo82133d).intValue();
        } catch (Resources.NotFoundException unused) {
            return m56518h(((Number) this.f46464a.invoke()).floatValue());
        }
    }

    /* JADX INFO: renamed from: k */
    public final int m56521k(@NotNull InterfaceC43176b point) throws Throwable {
        Intrinsics.checkNotNullParameter(point, "point");
        try {
            Object objMo82133d = point.mo82133d(point.mo82131b());
            Intrinsics.checkNotNull(objMo82133d, "null cannot be cast to non-null type kotlin.Int");
            return ((Integer) objMo82133d).intValue();
        } catch (Resources.NotFoundException unused) {
            return m56519i(((Number) this.f46464a.invoke()).floatValue());
        }
    }

    public BarUtilsAspect() {
        this(new Function0() { // from class: com.kubi.sdk.aspect.a
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Float.valueOf(BarUtilsAspect.m56512b());
            }
        });
    }

    /* JADX INFO: renamed from: b */
    public static final float m56512b() {
        return Resources.getSystem().getDisplayMetrics().density;
    }
}
