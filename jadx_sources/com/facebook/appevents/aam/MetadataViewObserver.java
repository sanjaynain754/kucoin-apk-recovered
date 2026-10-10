package com.facebook.appevents.aam;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.EditText;
import androidx.annotation.UiThread;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.facebook.appevents.InternalAppEventsLogger;
import com.facebook.appevents.aam.MetadataViewObserver;
import com.tencent.bugly.proguard.C33820nf;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p031b3.C4484b;
import p357j3.C40258g;
import p464n6.C42757a;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.Regex;
import p852kotlin.text.StringsKt;

/* JADX INFO: compiled from: MetadataViewObserver.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010#\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000 '2\u00020\u0001:\u0001(B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J#\u0010\n\u001a\u00020\t2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000e\u0010\rJ\u0017\u0010\u0010\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0012\u0010\u0011J\u0017\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00180\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001f\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010&\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010%¨\u0006)"}, m90084d2 = {"Lcom/facebook/appevents/aam/MetadataViewObserver;", "Landroid/view/ViewTreeObserver$OnGlobalFocusChangeListener;", "Landroid/app/Activity;", "activity", "<init>", "(Landroid/app/Activity;)V", "Landroid/view/View;", "oldView", "newView", "", "onGlobalFocusChanged", "(Landroid/view/View;Landroid/view/View;)V", "i", "()V", "j", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "e", "(Landroid/view/View;)V", "g", "Ljava/lang/Runnable;", "runnable", CmcdData.Factory.STREAMING_FORMAT_HLS, "(Ljava/lang/Runnable;)V", "", "", "b", "Ljava/util/Set;", "processedText", "Landroid/os/Handler;", "c", "Landroid/os/Handler;", "uiThreadHandler", "Ljava/lang/ref/WeakReference;", "d", "Ljava/lang/ref/WeakReference;", "activityWeakReference", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isTracking", "f", "Companion", "facebook-core_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class MetadataViewObserver implements ViewTreeObserver.OnGlobalFocusChangeListener {

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: g */
    @NotNull
    public static final Map<Integer, MetadataViewObserver> f7695g = new HashMap();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final Set<String> processedText;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final Handler uiThreadHandler;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final WeakReference<Activity> activityWeakReference;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public final AtomicBoolean isTracking;

    /* JADX INFO: compiled from: MetadataViewObserver.kt */
    @Metadata(m90083d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\t\u0010\bJ\u001f\u0010\r\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ3\u0010\u0011\u001a\u00020\u00062\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\u000f2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R \u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00160\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, m90084d2 = {"Lcom/facebook/appevents/aam/MetadataViewObserver$Companion;", "", "<init>", "()V", "Landroid/app/Activity;", "activity", "", "startTrackingActivity", "(Landroid/app/Activity;)V", "stopTrackingActivity", "", "key", "value", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "", TUIConstants.TUIContact.USER_DATA, "b", "(Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;)V", "", "MAX_TEXT_LENGTH", "I", "Lcom/facebook/appevents/aam/MetadataViewObserver;", "observers", "Ljava/util/Map;", "facebook-core_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nMetadataViewObserver.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MetadataViewObserver.kt\ncom/facebook/appevents/aam/MetadataViewObserver$Companion\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,165:1\n361#2,7:166\n37#3,2:173\n*S KotlinDebug\n*F\n+ 1 MetadataViewObserver.kt\ncom/facebook/appevents/aam/MetadataViewObserver$Companion\n*L\n126#1:166,7\n157#1:173,2\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @JvmStatic
        @UiThread
        public final void startTrackingActivity(@NotNull Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            int iHashCode = activity.hashCode();
            Map mapM7914b = MetadataViewObserver.m7914b();
            Integer numValueOf = Integer.valueOf(iHashCode);
            Object metadataViewObserver = mapM7914b.get(numValueOf);
            if (metadataViewObserver == null) {
                metadataViewObserver = new MetadataViewObserver(activity, null);
                mapM7914b.put(numValueOf, metadataViewObserver);
            }
            MetadataViewObserver.m7915c((MetadataViewObserver) metadataViewObserver);
        }

        @JvmStatic
        @UiThread
        public final void stopTrackingActivity(@NotNull Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            MetadataViewObserver metadataViewObserver = (MetadataViewObserver) MetadataViewObserver.m7914b().remove(Integer.valueOf(activity.hashCode()));
            if (metadataViewObserver != null) {
                MetadataViewObserver.m7916d(metadataViewObserver);
            }
        }

        /* JADX INFO: renamed from: a */
        public final String m7923a(String key, String value) {
            if (Intrinsics.areEqual("r2", key)) {
                return new Regex("[^\\d.]").replace(value, "");
            }
            return value;
        }

        /* JADX WARN: Code duplicated, block: B:17:0x0046  */
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        /* JADX INFO: renamed from: b */
        public final void m7924b(Map<String, String> userData, String key, String value) {
            switch (key.hashCode()) {
                case 3585:
                    if (key.equals("r3")) {
                        if (StringsKt.startsWith$default(value, "m", false, 2, (Object) null) || StringsKt.startsWith$default(value, "b", false, 2, (Object) null) || StringsKt.startsWith$default(value, "ge", false, 2, (Object) null)) {
                            value = "m";
                        } else {
                            value = "f";
                        }
                    }
                    break;
                case 3586:
                    if (key.equals("r4")) {
                        value = new Regex("[^a-z]+").replace(value, "");
                    }
                    break;
                case 3587:
                    if (key.equals("r5")) {
                        value = new Regex("[^a-z]+").replace(value, "");
                    }
                    break;
                case 3588:
                    if (key.equals("r6") && StringsKt.contains$default((CharSequence) value, (CharSequence) C33820nf.f71144W, false, 2, (Object) null)) {
                        value = ((String[]) new Regex(C33820nf.f71144W).split(value, 0).toArray(new String[0]))[0];
                    }
                    break;
            }
            userData.put(key, value);
        }
    }

    public /* synthetic */ MetadataViewObserver(Activity activity, DefaultConstructorMarker defaultConstructorMarker) {
        this(activity);
    }

    public MetadataViewObserver(Activity activity) {
        this.processedText = new LinkedHashSet();
        this.uiThreadHandler = new Handler(Looper.getMainLooper());
        this.activityWeakReference = new WeakReference<>(activity);
        this.isTracking = new AtomicBoolean(false);
    }

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ Map m7914b() {
        if (C42757a.m93689d(MetadataViewObserver.class)) {
            return null;
        }
        try {
            return f7695g;
        } catch (Throwable th2) {
            C42757a.m93687b(th2, MetadataViewObserver.class);
            return null;
        }
    }

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ void m7915c(MetadataViewObserver metadataViewObserver) {
        if (C42757a.m93689d(MetadataViewObserver.class)) {
            return;
        }
        try {
            metadataViewObserver.m7921i();
        } catch (Throwable th2) {
            C42757a.m93687b(th2, MetadataViewObserver.class);
        }
    }

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ void m7916d(MetadataViewObserver metadataViewObserver) {
        if (C42757a.m93689d(MetadataViewObserver.class)) {
            return;
        }
        try {
            metadataViewObserver.m7922j();
        } catch (Throwable th2) {
            C42757a.m93687b(th2, MetadataViewObserver.class);
        }
    }

    /* JADX INFO: renamed from: f */
    public static final void m7917f(View view, MetadataViewObserver this$0) {
        if (C42757a.m93689d(MetadataViewObserver.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(view, "$view");
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            if (view instanceof EditText) {
                this$0.m7919g(view);
            }
        } catch (Throwable th2) {
            C42757a.m93687b(th2, MetadataViewObserver.class);
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m7918e(final View view) {
        if (C42757a.m93689d(this)) {
            return;
        }
        try {
            m7920h(new Runnable() { // from class: b3.c
                @Override // java.lang.Runnable
                public final void run() {
                    MetadataViewObserver.m7917f(view, this);
                }
            });
        } catch (Throwable th2) {
            C42757a.m93687b(th2, this);
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m7919g(View view) {
        if (!C42757a.m93689d(this)) {
            try {
                Intrinsics.checkNotNull(view, "null cannot be cast to non-null type android.widget.EditText");
                String lowerCase = StringsKt.trim((CharSequence) ((EditText) view).getText().toString()).toString().toLowerCase();
                Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase()");
                if (lowerCase.length() != 0 && !this.processedText.contains(lowerCase) && lowerCase.length() <= 100) {
                    this.processedText.add(lowerCase);
                    HashMap map = new HashMap();
                    List<String> listM4271b = C4484b.m4271b(view);
                    List<String> listM4270a = null;
                    for (MetadataRule metadataRule : MetadataRule.INSTANCE.getRules()) {
                        Companion companion = INSTANCE;
                        String strM7923a = companion.m7923a(metadataRule.m7910c(), lowerCase);
                        if (metadataRule.m7911d().length() <= 0 || C4484b.m4273f(strM7923a, metadataRule.m7911d())) {
                            if (C4484b.m4272e(listM4271b, metadataRule.m7909b())) {
                                companion.m7924b(map, metadataRule.m7910c(), strM7923a);
                            } else {
                                if (listM4270a == null) {
                                    listM4270a = C4484b.m4270a(view);
                                }
                                if (C4484b.m4272e(listM4270a, metadataRule.m7909b())) {
                                    companion.m7924b(map, metadataRule.m7910c(), strM7923a);
                                }
                            }
                        }
                    }
                    InternalAppEventsLogger.INSTANCE.setInternalUserData(map);
                }
            } catch (Throwable th2) {
                C42757a.m93687b(th2, this);
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m7920h(Runnable runnable) {
        if (C42757a.m93689d(this)) {
            return;
        }
        try {
            if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
                runnable.run();
            } else {
                this.uiThreadHandler.post(runnable);
            }
        } catch (Throwable th2) {
            C42757a.m93687b(th2, this);
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m7921i() {
        View viewM88610e;
        if (!C42757a.m93689d(this)) {
            try {
                if (!this.isTracking.getAndSet(true) && (viewM88610e = C40258g.m88610e(this.activityWeakReference.get())) != null) {
                    ViewTreeObserver viewTreeObserver = viewM88610e.getViewTreeObserver();
                    if (viewTreeObserver.isAlive()) {
                        viewTreeObserver.addOnGlobalFocusChangeListener(this);
                    }
                }
            } catch (Throwable th2) {
                C42757a.m93687b(th2, this);
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m7922j() {
        View viewM88610e;
        if (!C42757a.m93689d(this)) {
            try {
                if (this.isTracking.getAndSet(false) && (viewM88610e = C40258g.m88610e(this.activityWeakReference.get())) != null) {
                    ViewTreeObserver viewTreeObserver = viewM88610e.getViewTreeObserver();
                    if (!viewTreeObserver.isAlive()) {
                        return;
                    }
                    viewTreeObserver.removeOnGlobalFocusChangeListener(this);
                }
            } catch (Throwable th2) {
                C42757a.m93687b(th2, this);
            }
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalFocusChangeListener
    public void onGlobalFocusChanged(@Nullable View oldView, @Nullable View newView) {
        if (!C42757a.m93689d(this)) {
            if (oldView != null) {
                try {
                    m7918e(oldView);
                } catch (Throwable th2) {
                    C42757a.m93687b(th2, this);
                    return;
                }
            }
            if (newView != null) {
                m7918e(newView);
            }
        }
    }
}
