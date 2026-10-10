package com.facebook.react.modules.statusbar;

import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.os.Build;
import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.facebook.fbreact.specs.NativeStatusBarManagerAndroidSpec;
import com.facebook.react.bridge.GuardedRunnable;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.common.ReactConstants;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.PixelUtil;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.views.view.WindowUtilKt;
import java.util.Arrays;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p747x3.C45999a;
import p852kotlin.Metadata;
import p852kotlin.TuplesKt;
import p852kotlin.collections.MapsKt;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.jvm.internal.StringCompanionObject;

/* JADX INFO: compiled from: StatusBarModule.kt */
/* JADX INFO: loaded from: classes45.dex */
@ReactModule(name = "StatusBarManager")
@Metadata(m90083d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0007\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0014\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007H\u0014J\b\u0010\n\u001a\u00020\u000bH\u0002J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0010\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u0011H\u0016J\u0010\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u0011H\u0016J\u0012\u0010\u0016\u001a\u00020\r2\b\u0010\u0017\u001a\u0004\u0018\u00010\bH\u0016¨\u0006\u0019"}, m90084d2 = {"Lcom/facebook/react/modules/statusbar/StatusBarModule;", "Lcom/facebook/fbreact/specs/NativeStatusBarManagerAndroidSpec;", "reactContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "getTypedExportedConstants", "", "", "", "getStatusBarHeightPx", "", "setColor", "", "colorDouble", "", "animated", "", "setTranslucent", "translucent", "setHidden", ViewProps.HIDDEN, "setStyle", TtmlNode.TAG_STYLE, "Companion", "ReactAndroid_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nStatusBarModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StatusBarModule.kt\ncom/facebook/react/modules/statusbar/StatusBarModule\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,162:1\n1#2:163\n*E\n"})
public final class StatusBarModule extends NativeStatusBarManagerAndroidSpec {

    @NotNull
    private static final String DEFAULT_BACKGROUND_COLOR_KEY = "DEFAULT_BACKGROUND_COLOR";

    @NotNull
    private static final String HEIGHT_KEY = "HEIGHT";

    @NotNull
    public static final String NAME = "StatusBarManager";

    /* JADX INFO: renamed from: com.facebook.react.modules.statusbar.StatusBarModule$setColor$1 */
    /* JADX INFO: compiled from: StatusBarModule.kt */
    @Metadata(m90083d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m90084d2 = {"com/facebook/react/modules/statusbar/StatusBarModule$setColor$1", "Lcom/facebook/react/bridge/GuardedRunnable;", "runGuarded", "", "ReactAndroid_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
    public static final class C60151 extends GuardedRunnable {
        final /* synthetic */ Activity $activity;
        final /* synthetic */ boolean $animated;
        final /* synthetic */ int $color;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C60151(Activity activity, boolean z11, int i11, ReactApplicationContext reactApplicationContext) {
            super(reactApplicationContext);
            this.$activity = activity;
            this.$animated = z11;
            this.$color = i11;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void runGuarded$lambda$0(Activity activity, ValueAnimator animator) {
            Intrinsics.checkNotNullParameter(animator, "animator");
            Window window = activity.getWindow();
            if (window != null) {
                Object animatedValue = animator.getAnimatedValue();
                Intrinsics.checkNotNull(animatedValue, "null cannot be cast to non-null type kotlin.Int");
                window.setStatusBarColor(((Integer) animatedValue).intValue());
            }
        }

        @Override // com.facebook.react.bridge.GuardedRunnable
        public void runGuarded() {
            Window window = this.$activity.getWindow();
            if (window == null) {
                return;
            }
            window.addFlags(Integer.MIN_VALUE);
            if (!this.$animated) {
                window.setStatusBarColor(this.$color);
                return;
            }
            ValueAnimator valueAnimatorOfObject = ValueAnimator.ofObject(new ArgbEvaluator(), Integer.valueOf(window.getStatusBarColor()), Integer.valueOf(this.$color));
            final Activity activity = this.$activity;
            valueAnimatorOfObject.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.facebook.react.modules.statusbar.c
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    StatusBarModule.C60151.runGuarded$lambda$0(activity, valueAnimator);
                }
            });
            valueAnimatorOfObject.setDuration(300L).setStartDelay(0L);
            valueAnimatorOfObject.start();
        }
    }

    @Override // com.facebook.fbreact.specs.NativeStatusBarManagerAndroidSpec
    public void setColor(double colorDouble, boolean animated) {
        int i11 = (int) colorDouble;
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            C45999a.m101488I(ReactConstants.TAG, "StatusBarModule: Ignored status bar change, current activity is null.");
        } else {
            UiThreadUtil.runOnUiThread(new C60151(currentActivity, animated, i11, getReactApplicationContext()));
        }
    }

    public StatusBarModule(@Nullable ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    private final float getStatusBarHeightPx() {
        Window window;
        View decorView;
        WindowInsetsCompat rootWindowInsets;
        Activity currentActivity = getCurrentActivity();
        if (currentActivity != null && (window = currentActivity.getWindow()) != null && (decorView = window.getDecorView()) != null && (rootWindowInsets = ViewCompat.getRootWindowInsets(decorView)) != null) {
            return rootWindowInsets.getInsets(WindowInsetsCompat.Type.statusBars() | WindowInsetsCompat.Type.navigationBars() | WindowInsetsCompat.Type.displayCutout()).top;
        }
        return 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setHidden$lambda$1(Activity activity, boolean z11) {
        Window window = activity.getWindow();
        if (window != null) {
            WindowUtilKt.setStatusBarVisibility(window, z11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setStyle$lambda$2(Activity activity, String str) {
        int i11;
        Window window = activity.getWindow();
        if (window != null) {
            if (Build.VERSION.SDK_INT > 30) {
                WindowInsetsController insetsController = window.getInsetsController();
                if (insetsController == null) {
                    return;
                }
                if (Intrinsics.areEqual("dark-content", str)) {
                    insetsController.setSystemBarsAppearance(8, 8);
                    return;
                } else {
                    insetsController.setSystemBarsAppearance(0, 8);
                    return;
                }
            }
            View decorView = window.getDecorView();
            Intrinsics.checkNotNullExpressionValue(decorView, "getDecorView(...)");
            int systemUiVisibility = decorView.getSystemUiVisibility();
            if (Intrinsics.areEqual("dark-content", str)) {
                i11 = systemUiVisibility | 8192;
            } else {
                i11 = systemUiVisibility & (-8193);
            }
            decorView.setSystemUiVisibility(i11);
        }
    }

    @Override // com.facebook.fbreact.specs.NativeStatusBarManagerAndroidSpec
    @NotNull
    public Map<String, Object> getTypedExportedConstants() {
        String str;
        Window window;
        Activity currentActivity = getCurrentActivity();
        if (currentActivity != null && (window = currentActivity.getWindow()) != null) {
            int statusBarColor = window.getStatusBarColor();
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            str = String.format("#%06X", Arrays.copyOf(new Object[]{Integer.valueOf(statusBarColor & 16777215)}, 1));
            Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        } else {
            str = "black";
        }
        return MapsKt.mapOf(TuplesKt.m90091to(HEIGHT_KEY, Float.valueOf(PixelUtil.toDIPFromPixel(getStatusBarHeightPx()))), TuplesKt.m90091to(DEFAULT_BACKGROUND_COLOR_KEY, str));
    }

    @Override // com.facebook.fbreact.specs.NativeStatusBarManagerAndroidSpec
    public void setHidden(final boolean hidden) {
        final Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            C45999a.m101488I(ReactConstants.TAG, "StatusBarModule: Ignored status bar change, current activity is null.");
        } else {
            UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.facebook.react.modules.statusbar.a
                @Override // java.lang.Runnable
                public final void run() {
                    StatusBarModule.setHidden$lambda$1(currentActivity, hidden);
                }
            });
        }
    }

    @Override // com.facebook.fbreact.specs.NativeStatusBarManagerAndroidSpec
    public void setStyle(@Nullable final String style) {
        final Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            C45999a.m101488I(ReactConstants.TAG, "StatusBarModule: Ignored status bar change, current activity is null.");
        } else {
            UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.facebook.react.modules.statusbar.b
                @Override // java.lang.Runnable
                public final void run() {
                    StatusBarModule.setStyle$lambda$2(currentActivity, style);
                }
            });
        }
    }

    @Override // com.facebook.fbreact.specs.NativeStatusBarManagerAndroidSpec
    public void setTranslucent(final boolean translucent) {
        final Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            C45999a.m101488I(ReactConstants.TAG, "StatusBarModule: Ignored status bar change, current activity is null.");
        } else {
            UiThreadUtil.runOnUiThread(new GuardedRunnable(getReactApplicationContext()) { // from class: com.facebook.react.modules.statusbar.StatusBarModule.setTranslucent.1
                @Override // com.facebook.react.bridge.GuardedRunnable
                public void runGuarded() {
                    Window window = currentActivity.getWindow();
                    if (window != null) {
                        WindowUtilKt.setStatusBarTranslucency(window, translucent);
                    }
                }
            });
        }
    }
}
