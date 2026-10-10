package com.kubi.kucoin.main.helper;

import android.app.Activity;
import android.view.View;
import android.view.Window;
import androidx.core.view.WindowCompat;
import androidx.core.view.WindowInsetsControllerCompat;
import com.blankj.utilcode.util.C5270g;
import com.kubi.kucoin.main.helper.MainStatusBarFixUtil;
import com.tencent.bugly.proguard.InterfaceC33826o0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.Ref;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: MainStatusBarFixUtil.kt */
/* JADX INFO: loaded from: classes18.dex */
@Metadata(m90083d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0006\u0010\u0011\u001a\u00020\u0012J\u0006\u0010\u0013\u001a\u00020\u0012J \u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J\u0010\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u0002\u001a\u00020\u0003H\u0002J\u0012\u0010\u001b\u001a\u00020\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0002R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\t\u001a\u0010\u0012\f\u0012\n \u000b*\u0004\u0018\u00010\u00030\u00030\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001d"}, m90084d2 = {"Lcom/kubi/kucoin/main/helper/MainStatusBarFixUtil;", "", "activity", "Landroid/app/Activity;", "isLightStatusBarProvider", "Lkotlin/Function0;", "", "<init>", "(Landroid/app/Activity;Lkotlin/jvm/functions/Function0;)V", "activityRef", "Ljava/lang/ref/WeakReference;", "kotlin.jvm.PlatformType", "pendingRunnables", "", "Ljava/lang/Runnable;", "applyToken", "", "refresh", "", "cancel", "scheduleApply", "decorView", "Landroid/view/View;", InterfaceC33826o0.f71244p, "delayMs", "", "applyStatusBarInternal", "clearPendingRunnables", "Companion", "KuFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nMainStatusBarFixUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MainStatusBarFixUtil.kt\ncom/kubi/kucoin/main/helper/MainStatusBarFixUtil\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,105:1\n13500#2,2:106\n*S KotlinDebug\n*F\n+ 1 MainStatusBarFixUtil.kt\ncom/kubi/kucoin/main/helper/MainStatusBarFixUtil\n*L\n28#1:106,2\n*E\n"})
public final class MainStatusBarFixUtil {

    /* JADX INFO: renamed from: e */
    @NotNull
    public static final Companion f27989e = new Companion(null);

    /* JADX INFO: renamed from: f */
    @NotNull
    public static final long[] f27990f = {0, 120, 300, 600, 1000};

    /* JADX INFO: renamed from: a */
    @NotNull
    public final Function0<Boolean> f27991a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public final WeakReference<Activity> f27992b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public final List<Runnable> f27993c;

    /* JADX INFO: renamed from: d */
    public int f27994d;

    /* JADX INFO: compiled from: MainStatusBarFixUtil.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0016\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m90084d2 = {"Lcom/kubi/kucoin/main/helper/MainStatusBarFixUtil$Companion;", "", "<init>", "()V", "APPLY_DELAYS", "", "KuFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    public MainStatusBarFixUtil(@NotNull Activity activity, @NotNull Function0<Boolean> isLightStatusBarProvider) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(isLightStatusBarProvider, "isLightStatusBarProvider");
        this.f27991a = isLightStatusBarProvider;
        this.f27992b = new WeakReference<>(activity);
        this.f27993c = new ArrayList();
    }

    /* JADX INFO: renamed from: g */
    public static final void m32425g(MainStatusBarFixUtil mainStatusBarFixUtil, Ref.ObjectRef objectRef, int i11) {
        Runnable runnable;
        Activity activity;
        try {
            Result.Companion companion = Result.INSTANCE;
            List<Runnable> list = mainStatusBarFixUtil.f27993c;
            T t11 = objectRef.element;
            if (t11 == 0) {
                Intrinsics.throwUninitializedPropertyAccessException("runnable");
                runnable = null;
            } else {
                runnable = (Runnable) t11;
            }
            list.remove(runnable);
            if (i11 == mainStatusBarFixUtil.f27994d && (activity = mainStatusBarFixUtil.f27992b.get()) != null && !activity.isFinishing() && !activity.isDestroyed()) {
                mainStatusBarFixUtil.m32426b(activity);
            }
            Result.m103844constructorimpl(Unit.INSTANCE);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m32426b(Activity activity) {
        View decorView;
        try {
            Result.Companion companion = Result.INSTANCE;
            Window window = activity.getWindow();
            if (window != null && (decorView = window.getDecorView()) != null) {
                boolean zBooleanValue = this.f27991a.invoke().booleanValue();
                WindowInsetsControllerCompat insetsController = WindowCompat.getInsetsController(activity.getWindow(), decorView);
                Intrinsics.checkNotNullExpressionValue(insetsController, "getInsetsController(...)");
                insetsController.setAppearanceLightStatusBars(zBooleanValue);
                int systemUiVisibility = decorView.getSystemUiVisibility() & (-8449);
                decorView.setSystemUiVisibility(Integer.valueOf(zBooleanValue ? systemUiVisibility | 8448 : (systemUiVisibility | 256) & (-8193)).intValue());
                C5270g.m6204r(activity, zBooleanValue);
                Result.m103844constructorimpl(Unit.INSTANCE);
            }
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m32427c() {
        Window window;
        try {
            Result.Companion companion = Result.INSTANCE;
            this.f27994d++;
            Activity activity = this.f27992b.get();
            m32428d((activity == null || (window = activity.getWindow()) == null) ? null : window.getDecorView());
            Result.m103844constructorimpl(Unit.INSTANCE);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m32428d(View view) {
        Iterator<Runnable> it = this.f27993c.iterator();
        while (it.hasNext()) {
            Runnable next = it.next();
            if (view != null) {
                view.removeCallbacks(next);
            }
            it.remove();
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m32429e() {
        Window window;
        View decorView;
        try {
            Result.Companion companion = Result.INSTANCE;
            Activity activity = this.f27992b.get();
            if (activity != null && !activity.isFinishing() && !activity.isDestroyed() && (window = activity.getWindow()) != null && (decorView = window.getDecorView()) != null) {
                m32428d(decorView);
                int i11 = this.f27994d + 1;
                this.f27994d = i11;
                m32426b(activity);
                for (long j11 : f27990f) {
                    m32430f(decorView, i11, j11);
                }
                Result.m103844constructorimpl(Unit.INSTANCE);
            }
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [T, ml.c] */
    /* JADX INFO: renamed from: f */
    public final void m32430f(View view, final int i11, long j11) {
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        ?? r11 = new Runnable() { // from class: ml.c
            @Override // java.lang.Runnable
            public final void run() {
                MainStatusBarFixUtil.m32425g(this.f94259b, objectRef, i11);
            }
        };
        objectRef.element = r11;
        this.f27993c.add((Runnable) r11);
        Runnable runnable = null;
        if (j11 == 0) {
            T t11 = objectRef.element;
            if (t11 == 0) {
                Intrinsics.throwUninitializedPropertyAccessException("runnable");
            } else {
                runnable = (Runnable) t11;
            }
            view.post(runnable);
            return;
        }
        T t12 = objectRef.element;
        if (t12 == 0) {
            Intrinsics.throwUninitializedPropertyAccessException("runnable");
        } else {
            runnable = (Runnable) t12;
        }
        view.postDelayed(runnable, j11);
    }
}
