package com.facebook.appevents.suggestedevents;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.facebook.appevents.suggestedevents.ViewObserver;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.jetbrains.annotations.NotNull;
import p189d3.C36603a;
import p357j3.C40258g;
import p461n3.C42720c;
import p464n6.C42757a;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: ViewObserver.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000 \u000b2\u00020\u0001:\u0001\u0018B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\bJ\u000f\u0010\n\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\n\u0010\bJ\u000f\u0010\u000b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\bR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0019"}, m90084d2 = {"Lcom/facebook/appevents/suggestedevents/ViewObserver;", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "Landroid/app/Activity;", "activity", "<init>", "(Landroid/app/Activity;)V", "", "onGlobalLayout", "()V", "g", CmcdData.Factory.STREAMING_FORMAT_HLS, "e", "Ljava/lang/ref/WeakReference;", "b", "Ljava/lang/ref/WeakReference;", "activityWeakReference", "Landroid/os/Handler;", "c", "Landroid/os/Handler;", "uiThreadHandler", "Ljava/util/concurrent/atomic/AtomicBoolean;", "d", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isTracking", "Companion", "facebook-core_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class ViewObserver implements ViewTreeObserver.OnGlobalLayoutListener {

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: f */
    @NotNull
    public static final Map<Integer, ViewObserver> f8026f = new HashMap();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final WeakReference<Activity> activityWeakReference;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final Handler uiThreadHandler;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final AtomicBoolean isTracking;

    /* JADX INFO: compiled from: ViewObserver.kt */
    @Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0007J\u0010\u0010\f\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, m90084d2 = {"Lcom/facebook/appevents/suggestedevents/ViewObserver$Companion;", "", "()V", "MAX_TEXT_LENGTH", "", "observers", "", "Lcom/facebook/appevents/suggestedevents/ViewObserver;", "startTrackingActivity", "", "activity", "Landroid/app/Activity;", "stopTrackingActivity", "facebook-core_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nViewObserver.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ViewObserver.kt\ncom/facebook/appevents/suggestedevents/ViewObserver$Companion\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,103:1\n361#2,7:104\n*S KotlinDebug\n*F\n+ 1 ViewObserver.kt\ncom/facebook/appevents/suggestedevents/ViewObserver$Companion\n*L\n92#1:104,7\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @JvmStatic
        public final void startTrackingActivity(@NotNull Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            int iHashCode = activity.hashCode();
            Map mapM8348b = ViewObserver.m8348b();
            Integer numValueOf = Integer.valueOf(iHashCode);
            Object viewObserver = mapM8348b.get(numValueOf);
            if (viewObserver == null) {
                viewObserver = new ViewObserver(activity, null);
                mapM8348b.put(numValueOf, viewObserver);
            }
            ViewObserver.m8349c((ViewObserver) viewObserver);
        }

        @JvmStatic
        public final void stopTrackingActivity(@NotNull Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            ViewObserver viewObserver = (ViewObserver) ViewObserver.m8348b().remove(Integer.valueOf(activity.hashCode()));
            if (viewObserver != null) {
                ViewObserver.m8350d(viewObserver);
            }
        }
    }

    public /* synthetic */ ViewObserver(Activity activity, DefaultConstructorMarker defaultConstructorMarker) {
        this(activity);
    }

    public ViewObserver(Activity activity) {
        this.activityWeakReference = new WeakReference<>(activity);
        this.uiThreadHandler = new Handler(Looper.getMainLooper());
        this.isTracking = new AtomicBoolean(false);
    }

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ Map m8348b() {
        if (C42757a.m93689d(ViewObserver.class)) {
            return null;
        }
        try {
            return f8026f;
        } catch (Throwable th2) {
            C42757a.m93687b(th2, ViewObserver.class);
            return null;
        }
    }

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ void m8349c(ViewObserver viewObserver) {
        if (C42757a.m93689d(ViewObserver.class)) {
            return;
        }
        try {
            viewObserver.m8353g();
        } catch (Throwable th2) {
            C42757a.m93687b(th2, ViewObserver.class);
        }
    }

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ void m8350d(ViewObserver viewObserver) {
        if (C42757a.m93689d(ViewObserver.class)) {
            return;
        }
        try {
            viewObserver.m8354h();
        } catch (Throwable th2) {
            C42757a.m93687b(th2, ViewObserver.class);
        }
    }

    /* JADX INFO: renamed from: f */
    public static final void m8351f(ViewObserver this$0) {
        if (C42757a.m93689d(ViewObserver.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            try {
                View viewM88610e = C40258g.m88610e(this$0.activityWeakReference.get());
                Activity activity = this$0.activityWeakReference.get();
                if (viewM88610e != null && activity != null) {
                    for (View view : C42720c.m93616a(viewM88610e)) {
                        if (!C36603a.m81888g(view)) {
                            String strM93618d = C42720c.m93618d(view);
                            if (strM93618d.length() > 0 && strM93618d.length() <= 300) {
                                ViewOnClickListener.Companion companion = ViewOnClickListener.INSTANCE;
                                String localClassName = activity.getLocalClassName();
                                Intrinsics.checkNotNullExpressionValue(localClassName, "activity.localClassName");
                                companion.attachListener$facebook_core_release(view, viewM88610e, localClassName);
                            }
                        }
                    }
                }
            } catch (Exception unused) {
            }
        } catch (Throwable th2) {
            C42757a.m93687b(th2, ViewObserver.class);
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m8352e() {
        if (C42757a.m93689d(this)) {
            return;
        }
        try {
            Runnable runnable = new Runnable() { // from class: n3.e
                @Override // java.lang.Runnable
                public final void run() {
                    ViewObserver.m8351f(this.f94546b);
                }
            };
            if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
                runnable.run();
            } else {
                this.uiThreadHandler.post(runnable);
            }
        } catch (Throwable th2) {
            C42757a.m93687b(th2, this);
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m8353g() {
        View viewM88610e;
        if (!C42757a.m93689d(this)) {
            try {
                if (!this.isTracking.getAndSet(true) && (viewM88610e = C40258g.m88610e(this.activityWeakReference.get())) != null) {
                    ViewTreeObserver viewTreeObserver = viewM88610e.getViewTreeObserver();
                    if (viewTreeObserver.isAlive()) {
                        viewTreeObserver.addOnGlobalLayoutListener(this);
                        m8352e();
                    }
                }
            } catch (Throwable th2) {
                C42757a.m93687b(th2, this);
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m8354h() {
        View viewM88610e;
        if (!C42757a.m93689d(this)) {
            try {
                if (this.isTracking.getAndSet(false) && (viewM88610e = C40258g.m88610e(this.activityWeakReference.get())) != null) {
                    ViewTreeObserver viewTreeObserver = viewM88610e.getViewTreeObserver();
                    if (!viewTreeObserver.isAlive()) {
                        return;
                    }
                    viewTreeObserver.removeOnGlobalLayoutListener(this);
                }
            } catch (Throwable th2) {
                C42757a.m93687b(th2, this);
            }
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        if (C42757a.m93689d(this)) {
            return;
        }
        try {
            m8352e();
        } catch (Throwable th2) {
            C42757a.m93687b(th2, this);
        }
    }
}
