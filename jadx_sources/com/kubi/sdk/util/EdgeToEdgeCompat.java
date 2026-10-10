package com.kubi.sdk.util;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.widget.LinearLayout;
import androidx.annotation.ColorInt;
import androidx.core.graphics.Insets;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.WindowInsetsControllerCompat;
import androidx.media3.common.C2711C;
import com.blankj.utilcode.util.C5258a;
import com.blankj.utilcode.util.C5270g;
import com.blankj.utilcode.util.C5287o0;
import com.kubi.utils.extensions.C27046k;
import com.tencent.bugly.proguard.InterfaceC33953u5;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: EdgeToEdgeCompat.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001:\u0002\u001e\u001fB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\tJ\u000e\u0010\n\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\n\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\tJ\u0006\u0010\u000b\u001a\u00020\fJ\u0006\u0010\r\u001a\u00020\fJ\u001f\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\f¢\u0006\u0002\u0010\u0011J\u001f\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\f¢\u0006\u0002\u0010\u0012J\u000e\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\tJ\u001f\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\f¢\u0006\u0002\u0010\u0011J\u001f\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\f¢\u0006\u0002\u0010\u0012J\u000e\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\tJ\u0018\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010\u0017\u001a\u00020\fJ\u0018\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\t2\b\b\u0001\u0010\u0017\u001a\u00020\fJ\u0016\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u0019J\u0016\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\u0019J\u000e\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u0019J\u0018\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\fH\u0002J\u001f\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\f¢\u0006\u0002\u0010\u0011J\u001f\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\f¢\u0006\u0002\u0010\u0012J\u000e\u0010\u001d\u001a\u00020\u000f2\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\u001d\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\t¨\u0006 "}, m90084d2 = {"Lcom/kubi/sdk/util/EdgeToEdgeCompat;", "", "<init>", "()V", "isStatusBarVisible", "", InterfaceC33953u5.f72199F, "Landroid/view/Window;", "activity", "Landroid/app/Activity;", "isNavBarVisible", "getStatusBarHeight", "", "getNavBarHeight", "restoreSystemBarLayout", "", "bg", "(Landroid/view/Window;Ljava/lang/Integer;)V", "(Landroid/app/Activity;Ljava/lang/Integer;)V", "hideSystemBar", "restoreStatusBarLayout", "enableEdgeToEdgeStatusBar", "enableEdgeToEdgeStatusBarWithFakeBackground", "color", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "applyStatusBarInsetToView", "addFakeStatusBarBackground", "restoreNavBarLayout", "enableEdgeToEdgeNavBar", "Impl35", "Impl", "LComponent_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class EdgeToEdgeCompat {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final EdgeToEdgeCompat f48106a = new EdgeToEdgeCompat();

    /* JADX INFO: compiled from: EdgeToEdgeCompat.kt */
    @Metadata(m90083d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0012\u0018\u0000 '2\u00020\u0001:\u0001'B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\b\u0010\t\u001a\u00020\nH\u0016J\b\u0010\u000b\u001a\u00020\nH\u0016J!\u0010\f\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0002\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J!\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0002\u0010\u000fJ\u0010\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J!\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0002\u0010\u000fJ\u0010\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J(\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u00072\u0018\b\u0002\u0010\u0016\u001a\u0012\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\r0\u0017j\u0002`\u0019J.\u0010\u001a\u001a\u00020\r*\u00020\u001b2\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\u0016\u0010\u0016\u001a\u0012\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\r0\u0017j\u0002`\u0019H\u0002J\n\u0010\u001e\u001a\u0004\u0018\u00010\u0018H\u0004J\u0010\u0010\u001f\u001a\u00020\u001b2\u0006\u0010\u0006\u001a\u00020\u0007H\u0004J\u001a\u0010 \u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010!\u001a\u00020\"H\u0004J\u001a\u0010#\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010!\u001a\u00020\"H\u0004J\u0017\u0010$\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0006\u001a\u00020\u0007H\u0002¢\u0006\u0002\u0010%J\u0017\u0010&\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0006\u001a\u00020\u0007H\u0002¢\u0006\u0002\u0010%¨\u0006("}, m90084d2 = {"Lcom/kubi/sdk/util/EdgeToEdgeCompat$Impl;", "", "<init>", "()V", "isStatusBarVisible", "", InterfaceC33953u5.f72199F, "Landroid/view/Window;", "isNavBarVisible", "getStatusBarHeight", "", "getNavigationBarHeight", "restoreSystemBarLayout", "", "bg", "(Landroid/view/Window;Ljava/lang/Integer;)V", "hideSystemBar", "restoreStatusBarLayout", "enableEdgeToEdgeStatusBar", "restoreNavBarLayout", "enableEdgeToEdgeNavBar", "getWindowInsetsCompat", TUIConstants.TUIChat.CALL_BACK, "Lkotlin/Function1;", "Landroidx/core/view/WindowInsetsCompat;", "Lcom/kubi/sdk/util/WindowInsetsCallback;", "setWindowInsetsCallbackTimeout", "Landroid/view/View;", "timeout", "", "getWindowInsetsOrNull", "findRootView", "hideNavBarBgView", "retry", "Ljava/util/concurrent/atomic/AtomicInteger;", "showNavBarBgView", "getNavBarDefaultBg", "(Landroid/view/Window;)Ljava/lang/Integer;", "getStatusBarDefaultBg", "Companion", "LComponent_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nEdgeToEdgeCompat.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EdgeToEdgeCompat.kt\ncom/kubi/sdk/util/EdgeToEdgeCompat$Impl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,773:1\n1#2:774\n1869#3,2:775\n*S KotlinDebug\n*F\n+ 1 EdgeToEdgeCompat.kt\ncom/kubi/sdk/util/EdgeToEdgeCompat$Impl\n*L\n663#1:775,2\n*E\n"})
    public static class Impl {

        /* JADX INFO: renamed from: a */
        @NotNull
        public static final Companion f48107a = new Companion(null);

        /* JADX INFO: renamed from: b */
        @NotNull
        public static final AtomicReference<WindowInsetsCompat> f48108b = new AtomicReference<>(null);

        /* JADX INFO: renamed from: c */
        @NotNull
        public static final CopyOnWriteArrayList<WeakReference<Function1<WindowInsetsCompat, Unit>>> f48109c = new CopyOnWriteArrayList<>();

        /* JADX INFO: compiled from: EdgeToEdgeCompat.kt */
        @Metadata(m90083d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R*\u0010\u0007\u001a\u001e\u0012\u001a\u0012\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000b0\nj\u0002`\f0\t0\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, m90084d2 = {"Lcom/kubi/sdk/util/EdgeToEdgeCompat$Impl$Companion;", "", "<init>", "()V", "insetsRefs", "Ljava/util/concurrent/atomic/AtomicReference;", "Landroidx/core/view/WindowInsetsCompat;", "callbacks", "Ljava/util/concurrent/CopyOnWriteArrayList;", "Ljava/lang/ref/WeakReference;", "Lkotlin/Function1;", "", "Lcom/kubi/sdk/util/WindowInsetsCallback;", "LComponent_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public Companion() {
            }
        }

        /* JADX INFO: renamed from: com.kubi.sdk.util.EdgeToEdgeCompat$Impl$a */
        /* JADX INFO: compiled from: EdgeToEdgeCompat.kt */
        /* JADX INFO: loaded from: classes43.dex */
        @Metadata(m90083d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0007"}, m90084d2 = {"com/kubi/sdk/util/EdgeToEdgeCompat$Impl$setWindowInsetsCallbackTimeout$2", "Landroid/view/View$OnAttachStateChangeListener;", "onViewAttachedToWindow", "", "v", "Landroid/view/View;", "onViewDetachedFromWindow", "LComponent_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
        public static final class ViewOnAttachStateChangeListenerC24209a implements View.OnAttachStateChangeListener {

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ View f48110b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ Runnable f48111c;

            public ViewOnAttachStateChangeListenerC24209a(View view, Runnable runnable) {
                this.f48110b = view;
                this.f48111c = runnable;
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewAttachedToWindow(View v11) {
                Intrinsics.checkNotNullParameter(v11, "v");
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewDetachedFromWindow(View v11) {
                Intrinsics.checkNotNullParameter(v11, "v");
                this.f48110b.removeCallbacks(this.f48111c);
                ViewCompat.setOnApplyWindowInsetsListener(v11, null);
                v11.removeOnAttachStateChangeListener(this);
            }
        }

        /* JADX INFO: renamed from: l */
        public static final Unit m58287l(WindowInsetsCompat insets) {
            Intrinsics.checkNotNullParameter(insets, "insets");
            Insets insets2 = insets.getInsets(WindowInsetsCompat.Type.statusBars());
            Intrinsics.checkNotNullExpressionValue(insets2, "getInsets(...)");
            Insets insets3 = insets.getInsets(WindowInsetsCompat.Type.navigationBars());
            Intrinsics.checkNotNullExpressionValue(insets3, "getInsets(...)");
            if ((insets2.top > 0 || insets2.bottom > 0) && (insets3.top > 0 || insets3.bottom > 0)) {
                f48108b.set(insets);
            }
            if (insets2.top > 0 || insets2.bottom > 0 || insets3.top > 0 || insets3.bottom > 0) {
                Iterator<T> it = f48109c.iterator();
                while (it.hasNext()) {
                    Function1 function1 = (Function1) ((WeakReference) it.next()).get();
                    if (function1 != null) {
                        function1.invoke(insets);
                    }
                }
                f48109c.clear();
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: o */
        public static /* synthetic */ void m58288o(Impl impl, Window window, AtomicInteger atomicInteger, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: hideNavBarBgView");
            }
            if ((i11 & 2) != 0) {
                atomicInteger = new AtomicInteger(3);
            }
            impl.m58301n(window, atomicInteger);
        }

        /* JADX INFO: renamed from: w */
        public static /* synthetic */ void m58290w(Impl impl, View view, long j11, Function1 function1, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setWindowInsetsCallbackTimeout");
            }
            if ((i11 & 1) != 0) {
                j11 = 500;
            }
            impl.m58307v(view, j11, function1);
        }

        /* JADX INFO: renamed from: y */
        public static final WindowInsetsCompat m58292y(AtomicBoolean atomicBoolean, View view, Runnable runnable, Function1 function1, View view2, WindowInsetsCompat insets) {
            Intrinsics.checkNotNullParameter(view2, "<unused var>");
            Intrinsics.checkNotNullParameter(insets, "insets");
            if (atomicBoolean.compareAndSet(false, true)) {
                view.removeCallbacks(runnable);
                function1.invoke(insets);
            }
            return insets;
        }

        /* JADX INFO: renamed from: e */
        public void mo58293e(@NotNull Window window) {
            Intrinsics.checkNotNullParameter(window, "window");
            window.clearFlags(67108864);
            window.addFlags(Integer.MIN_VALUE);
            window.getDecorView().setSystemUiVisibility(window.getDecorView().getSystemUiVisibility() | 1280);
            window.setStatusBarColor(0);
        }

        @NotNull
        /* JADX INFO: renamed from: f */
        public final View m58294f(@NotNull Window window) {
            Intrinsics.checkNotNullParameter(window, "window");
            View decorView = window.getDecorView();
            Intrinsics.checkNotNullExpressionValue(decorView, "getDecorView(...)");
            View viewFindViewById = decorView.findViewById(R.id.content);
            while (!Intrinsics.areEqual(viewFindViewById.getParent(), decorView)) {
                Object parent = viewFindViewById.getParent();
                Intrinsics.checkNotNull(parent, "null cannot be cast to non-null type android.view.View");
                viewFindViewById = (View) parent;
            }
            Intrinsics.checkNotNull(viewFindViewById);
            return viewFindViewById;
        }

        /* JADX INFO: renamed from: k */
        public final void m58299k(@NotNull Window window, @NotNull Function1<? super WindowInsetsCompat, Unit> callback) {
            Intrinsics.checkNotNullParameter(window, "window");
            Intrinsics.checkNotNullParameter(callback, "callback");
            WindowInsetsCompat windowInsetsCompat = f48108b.get();
            if (windowInsetsCompat != null) {
                callback.invoke(windowInsetsCompat);
                return;
            }
            View decorView = window.getDecorView();
            Intrinsics.checkNotNullExpressionValue(decorView, "getDecorView(...)");
            m58290w(this, decorView, 0L, new Function1() { // from class: com.kubi.sdk.util.m
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return EdgeToEdgeCompat.Impl.m58287l((WindowInsetsCompat) obj);
                }
            }, 1, null);
            f48109c.add(new WeakReference<>(callback));
            Context context = window.getContext();
            Activity activity = context instanceof Activity ? (Activity) context : null;
            if (activity != null) {
            }
        }

        @Nullable
        /* JADX INFO: renamed from: m */
        public final WindowInsetsCompat m58300m() {
            if (Build.VERSION.SDK_INT < 30) {
                return f48108b.get();
            }
            WindowInsetsCompat windowInsetsCompat = f48108b.get();
            if (windowInsetsCompat != null) {
                return windowInsetsCompat;
            }
            WindowInsetsCompat windowInsetsCompat2 = WindowInsetsCompat.toWindowInsetsCompat(((WindowManager) C5287o0.m6331a().getSystemService(WindowManager.class)).getCurrentWindowMetrics().getWindowInsets());
            Intrinsics.checkNotNullExpressionValue(windowInsetsCompat2, "toWindowInsetsCompat(...)");
            return windowInsetsCompat2;
        }

        /* JADX INFO: renamed from: n */
        public final void m58301n(@NotNull final Window window, @NotNull final AtomicInteger retry) {
            Intrinsics.checkNotNullParameter(window, "window");
            Intrinsics.checkNotNullParameter(retry, "retry");
            View viewFindViewById = window.getDecorView().findViewById(R.id.navigationBarBackground);
            if (viewFindViewById == null && retry.getAndDecrement() > 0) {
                window.getDecorView().post(new Runnable() { // from class: com.kubi.sdk.util.l
                    @Override // java.lang.Runnable
                    public final void run() {
                        EdgeToEdgeCompat.Impl.m58289p(this.f48210b, window, retry);
                    }
                });
            } else if (viewFindViewById != null) {
                C27046k.m66700o(viewFindViewById);
            }
        }

        /* JADX INFO: renamed from: q */
        public void mo58302q(@NotNull Window window) {
            Intrinsics.checkNotNullParameter(window, "window");
            window.clearFlags(67108864);
            window.clearFlags(C2711C.BUFFER_FLAG_FIRST_SAMPLE);
            window.addFlags(Integer.MIN_VALUE);
            window.getDecorView().setSystemUiVisibility(5890);
            window.setStatusBarColor(0);
            window.setNavigationBarColor(0);
        }

        /* JADX INFO: renamed from: r */
        public boolean mo58303r(@NotNull Window window) {
            Intrinsics.checkNotNullParameter(window, "window");
            return C5270g.m6197k() && C5270g.m6196j(window);
        }

        /* JADX INFO: renamed from: s */
        public void mo58304s(@NotNull Window window, @Nullable Integer num) {
            Intrinsics.checkNotNullParameter(window, "window");
            window.clearFlags(C2711C.BUFFER_FLAG_FIRST_SAMPLE);
            window.addFlags(Integer.MIN_VALUE);
            window.getDecorView().setSystemUiVisibility((window.getDecorView().getSystemUiVisibility() | 256) & (-515));
            if (num == null) {
                num = m58295g(window);
            }
            if (num != null) {
                window.setNavigationBarColor(num.intValue());
            }
        }

        /* JADX INFO: renamed from: t */
        public void mo58305t(@NotNull Window window, @Nullable Integer num) {
            Intrinsics.checkNotNullParameter(window, "window");
            window.clearFlags(67108864);
            window.addFlags(Integer.MIN_VALUE);
            window.getDecorView().setSystemUiVisibility((window.getDecorView().getSystemUiVisibility() | 256) & (-1025));
            if (num == null) {
                num = m58297i(window);
            }
            if (num != null) {
                window.setStatusBarColor(num.intValue());
            }
        }

        /* JADX INFO: renamed from: u */
        public void mo58306u(@NotNull Window window, @Nullable Integer num) {
            Intrinsics.checkNotNullParameter(window, "window");
            window.clearFlags(67108864);
            window.clearFlags(C2711C.BUFFER_FLAG_FIRST_SAMPLE);
            window.addFlags(Integer.MIN_VALUE);
            window.getDecorView().setSystemUiVisibility(256);
            Integer numM58297i = num == null ? m58297i(window) : num;
            if (numM58297i != null) {
                window.setStatusBarColor(numM58297i.intValue());
            }
            if (num == null) {
                num = m58295g(window);
            }
            if (num != null) {
                window.setNavigationBarColor(num.intValue());
            }
        }

        /* JADX INFO: renamed from: v */
        public final void m58307v(final View view, long j11, final Function1<? super WindowInsetsCompat, Unit> function1) {
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            final Runnable runnable = new Runnable() { // from class: com.kubi.sdk.util.n
                @Override // java.lang.Runnable
                public final void run() {
                    EdgeToEdgeCompat.Impl.m58291x(this.f48251b, atomicBoolean, view, function1);
                }
            };
            view.postDelayed(runnable, j11);
            ViewCompat.setOnApplyWindowInsetsListener(view, new OnApplyWindowInsetsListener() { // from class: com.kubi.sdk.util.o
                @Override // androidx.core.view.OnApplyWindowInsetsListener
                public final WindowInsetsCompat onApplyWindowInsets(View view2, WindowInsetsCompat windowInsetsCompat) {
                    return EdgeToEdgeCompat.Impl.m58292y(atomicBoolean, view, runnable, function1, view2, windowInsetsCompat);
                }
            });
            view.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC24209a(view, runnable));
        }

        /* JADX INFO: renamed from: p */
        public static final void m58289p(Impl impl, Window window, AtomicInteger atomicInteger) {
            impl.m58301n(window, atomicInteger);
        }

        /* JADX INFO: renamed from: x */
        public static final void m58291x(Impl impl, AtomicBoolean atomicBoolean, View view, Function1 function1) {
            WindowInsetsCompat windowInsetsCompatM58300m = impl.m58300m();
            if (windowInsetsCompatM58300m != null && atomicBoolean.compareAndSet(false, true)) {
                ViewCompat.setOnApplyWindowInsetsListener(view, null);
                function1.invoke(windowInsetsCompatM58300m);
            }
        }

        /* JADX INFO: renamed from: g */
        public final Integer m58295g(Window window) {
            Drawable background;
            ColorDrawable colorDrawable;
            View viewFindViewById = window.getDecorView().findViewById(R.id.navigationBarBackground);
            if (viewFindViewById != null) {
                background = viewFindViewById.getBackground();
            } else {
                background = null;
            }
            if (background instanceof ColorDrawable) {
                colorDrawable = (ColorDrawable) background;
            } else {
                colorDrawable = null;
            }
            if (colorDrawable == null) {
                return null;
            }
            return Integer.valueOf(colorDrawable.getColor());
        }

        /* JADX INFO: renamed from: h */
        public int m58296h() {
            Integer numValueOf;
            Window window;
            View decorView;
            WindowInsets rootWindowInsets;
            Insets insets;
            WindowInsetsCompat windowInsetsCompatM58300m = m58300m();
            Integer numValueOf2 = null;
            if (windowInsetsCompatM58300m != null && (insets = windowInsetsCompatM58300m.getInsets(WindowInsetsCompat.Type.navigationBars())) != null) {
                numValueOf = Integer.valueOf(insets.bottom);
            } else {
                numValueOf = null;
            }
            if (numValueOf == null || numValueOf.intValue() == 0) {
                Activity activityM6125h = C5258a.m6125h();
                if (activityM6125h != null && (window = activityM6125h.getWindow()) != null && (decorView = window.getDecorView()) != null && (rootWindowInsets = decorView.getRootWindowInsets()) != null) {
                    numValueOf2 = Integer.valueOf(rootWindowInsets.getStableInsetBottom());
                }
                numValueOf = numValueOf2;
            }
            if (numValueOf == null || numValueOf.intValue() == 0) {
                numValueOf = Integer.valueOf(C5270g.m6191e());
            }
            return numValueOf.intValue();
        }

        /* JADX INFO: renamed from: i */
        public final Integer m58297i(Window window) {
            Drawable background;
            ColorDrawable colorDrawable;
            View viewFindViewById = window.getDecorView().findViewById(R.id.statusBarBackground);
            if (viewFindViewById != null) {
                background = viewFindViewById.getBackground();
            } else {
                background = null;
            }
            if (background instanceof ColorDrawable) {
                colorDrawable = (ColorDrawable) background;
            } else {
                colorDrawable = null;
            }
            if (colorDrawable == null) {
                return null;
            }
            return Integer.valueOf(colorDrawable.getColor());
        }

        /* JADX INFO: renamed from: j */
        public int m58298j() {
            Integer numValueOf;
            Insets insets;
            WindowInsetsCompat windowInsetsCompatM58300m = m58300m();
            if (windowInsetsCompatM58300m != null && (insets = windowInsetsCompatM58300m.getInsets(WindowInsetsCompat.Type.statusBars())) != null) {
                numValueOf = Integer.valueOf(insets.top);
            } else {
                numValueOf = null;
            }
            if (numValueOf != null && numValueOf.intValue() != 0) {
                return numValueOf.intValue();
            }
            return C5270g.m6194h();
        }
    }

    /* JADX INFO: compiled from: EdgeToEdgeCompat.kt */
    /* JADX INFO: loaded from: classes43.dex */
    @Metadata(m90083d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0002\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u001f\u0010\t\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0002\u0010\rJ\u0010\u0010\u000e\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u001f\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0002\u0010\rJ\u0010\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u001f\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0002\u0010\rJ\u0010\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u001a\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J\u0018\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\fH\u0002J\u0018\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\fH\u0002¨\u0006\u001b"}, m90084d2 = {"Lcom/kubi/sdk/util/EdgeToEdgeCompat$Impl35;", "Lcom/kubi/sdk/util/EdgeToEdgeCompat$Impl;", "<init>", "()V", "isStatusBarVisible", "", InterfaceC33953u5.f72199F, "Landroid/view/Window;", "isNavBarVisible", "restoreSystemBarLayout", "", "bg", "", "(Landroid/view/Window;Ljava/lang/Integer;)V", "hideSystemBar", "restoreStatusBarLayout", "enableEdgeToEdgeStatusBar", "restoreNavBarLayout", "enableEdgeToEdgeNavBar", "findViewByTag", "Landroid/view/View;", "tag", "", "findStatusBarView", "height", "findNavBarView", "Companion", "LComponent_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nEdgeToEdgeCompat.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EdgeToEdgeCompat.kt\ncom/kubi/sdk/util/EdgeToEdgeCompat$Impl35\n+ 2 View.kt\nandroidx/core/view/ViewKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,773:1\n254#2:774\n254#2:775\n1#3:776\n*S KotlinDebug\n*F\n+ 1 EdgeToEdgeCompat.kt\ncom/kubi/sdk/util/EdgeToEdgeCompat$Impl35\n*L\n330#1:774\n335#1:775\n*E\n"})
    public static final class Impl35 extends Impl {

        /* JADX INFO: renamed from: d */
        @NotNull
        public static final Companion f48112d = new Companion(null);

        /* JADX INFO: compiled from: EdgeToEdgeCompat.kt */
        @Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\b"}, m90084d2 = {"Lcom/kubi/sdk/util/EdgeToEdgeCompat$Impl35$Companion;", "", "<init>", "()V", "TAG_NEW_CONTENT", "", "TAG_STATUS_BAR", "TAG_NAV_BAR", "LComponent_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public Companion() {
            }
        }

        /* JADX INFO: renamed from: E */
        public static final Unit m58312E(Impl35 impl35, Window window, WindowInsetsCompat windowInsets) {
            Intrinsics.checkNotNullParameter(windowInsets, "windowInsets");
            Insets insets = windowInsets.getInsets(WindowInsetsCompat.Type.statusBars());
            Intrinsics.checkNotNullExpressionValue(insets, "getInsets(...)");
            Impl.m58288o(impl35, window, null, 2, null);
            C27046k.m66700o(impl35.m58319G(window, insets.top));
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: I */
        public static final Unit m58313I(Impl35 impl35, Window window, WindowInsetsCompat windowInsets) {
            Intrinsics.checkNotNullParameter(windowInsets, "windowInsets");
            Insets insets = windowInsets.getInsets(WindowInsetsCompat.Type.statusBars() | WindowInsetsCompat.Type.navigationBars());
            Intrinsics.checkNotNullExpressionValue(insets, "getInsets(...)");
            Impl.m58288o(impl35, window, null, 2, null);
            C27046k.m66700o(impl35.m58319G(window, insets.top));
            C27046k.m66700o(impl35.m58318F(window, insets.bottom));
            WindowInsetsControllerCompat insetsController = WindowCompat.getInsetsController(window, window.getDecorView());
            Intrinsics.checkNotNullExpressionValue(insetsController, "getInsetsController(...)");
            insetsController.setSystemBarsBehavior(2);
            insetsController.hide(WindowInsetsCompat.Type.statusBars());
            insetsController.hide(WindowInsetsCompat.Type.navigationBars());
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: J */
        public static final Unit m58314J(Impl35 impl35, Window window, Integer num, WindowInsetsCompat windowInsets) {
            Intrinsics.checkNotNullParameter(windowInsets, "windowInsets");
            Insets insets = windowInsets.getInsets(WindowInsetsCompat.Type.navigationBars());
            Intrinsics.checkNotNullExpressionValue(insets, "getInsets(...)");
            Impl.m58288o(impl35, window, null, 2, null);
            View viewM58318F = impl35.m58318F(window, insets.bottom);
            if (num != null) {
                viewM58318F.setBackgroundColor(num.intValue());
            }
            C27046k.m66685H(viewM58318F);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: K */
        public static final Unit m58315K(Impl35 impl35, Window window, Integer num, WindowInsetsCompat windowInsets) {
            Intrinsics.checkNotNullParameter(windowInsets, "windowInsets");
            Insets insets = windowInsets.getInsets(WindowInsetsCompat.Type.statusBars());
            Intrinsics.checkNotNullExpressionValue(insets, "getInsets(...)");
            Impl.m58288o(impl35, window, null, 2, null);
            View viewM58319G = impl35.m58319G(window, insets.top);
            if (num != null) {
                viewM58319G.setBackgroundColor(num.intValue());
            }
            C27046k.m66685H(viewM58319G);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: L */
        public static final Unit m58316L(Impl35 impl35, Window window, Integer num, WindowInsetsCompat windowInsets) {
            Intrinsics.checkNotNullParameter(windowInsets, "windowInsets");
            Insets insets = windowInsets.getInsets(WindowInsetsCompat.Type.statusBars() | WindowInsetsCompat.Type.navigationBars());
            Intrinsics.checkNotNullExpressionValue(insets, "getInsets(...)");
            Impl.m58288o(impl35, window, null, 2, null);
            View viewM58319G = impl35.m58319G(window, insets.top);
            if (num != null) {
                viewM58319G.setBackgroundColor(num.intValue());
            }
            C27046k.m66685H(viewM58319G);
            View viewM58318F = impl35.m58318F(window, insets.bottom);
            if (num != null) {
                viewM58318F.setBackgroundColor(num.intValue());
            }
            C27046k.m66685H(viewM58318F);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: F */
        public final View m58318F(Window window, int i11) {
            View viewM58320H = m58320H(window, "TAG_NAV_BAR");
            if (viewM58320H == null) {
                viewM58320H = new View(window.getContext());
                viewM58320H.setTag("TAG_NAV_BAR");
                View viewM58320H2 = m58320H(window, "TAG_NEW_CONTENT");
                LinearLayout linearLayout = viewM58320H2 instanceof LinearLayout ? (LinearLayout) viewM58320H2 : null;
                if (linearLayout == null) {
                    linearLayout = new LinearLayout(window.getContext());
                    View viewM58294f = m58294f(window);
                    ViewParent parent = viewM58294f.getParent();
                    Intrinsics.checkNotNull(parent, "null cannot be cast to non-null type android.view.ViewGroup");
                    ViewGroup viewGroup = (ViewGroup) parent;
                    linearLayout.setTag("TAG_NEW_CONTENT");
                    linearLayout.setOrientation(1);
                    linearLayout.setLayoutParams(viewM58294f.getLayoutParams());
                    viewGroup.removeView(viewM58294f);
                    viewGroup.addView(linearLayout, viewM58294f.getLayoutParams());
                    linearLayout.addView(viewM58294f, new LinearLayout.LayoutParams(-1, 0, 1.0f));
                }
                linearLayout.addView(viewM58320H, new LinearLayout.LayoutParams(-1, i11));
            }
            return viewM58320H;
        }

        /* JADX INFO: renamed from: G */
        public final View m58319G(Window window, int i11) {
            View viewM58320H = m58320H(window, "TAG_STATUS_BAR");
            if (viewM58320H == null) {
                viewM58320H = new View(window.getContext());
                viewM58320H.setTag("TAG_STATUS_BAR");
                View viewM58320H2 = m58320H(window, "TAG_NEW_CONTENT");
                LinearLayout linearLayout = viewM58320H2 instanceof LinearLayout ? (LinearLayout) viewM58320H2 : null;
                if (linearLayout == null) {
                    linearLayout = new LinearLayout(window.getContext());
                    View viewM58294f = m58294f(window);
                    ViewParent parent = viewM58294f.getParent();
                    Intrinsics.checkNotNull(parent, "null cannot be cast to non-null type android.view.ViewGroup");
                    ViewGroup viewGroup = (ViewGroup) parent;
                    linearLayout.setTag("TAG_NEW_CONTENT");
                    linearLayout.setOrientation(1);
                    linearLayout.setLayoutParams(viewM58294f.getLayoutParams());
                    viewGroup.removeView(viewM58294f);
                    viewGroup.addView(linearLayout, viewM58294f.getLayoutParams());
                    linearLayout.addView(viewM58294f, new LinearLayout.LayoutParams(-1, 0, 1.0f));
                }
                linearLayout.addView(viewM58320H, 0, new LinearLayout.LayoutParams(-1, i11));
            }
            return viewM58320H;
        }

        @Override // com.kubi.sdk.util.EdgeToEdgeCompat.Impl
        /* JADX INFO: renamed from: e */
        public void mo58293e(@NotNull final Window window) {
            Intrinsics.checkNotNullParameter(window, "window");
            m58299k(window, new Function1() { // from class: com.kubi.sdk.util.q
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return EdgeToEdgeCompat.Impl35.m58312E(this.f48263b, window, (WindowInsetsCompat) obj);
                }
            });
        }

        @Override // com.kubi.sdk.util.EdgeToEdgeCompat.Impl
        /* JADX INFO: renamed from: q */
        public void mo58302q(@NotNull final Window window) {
            Intrinsics.checkNotNullParameter(window, "window");
            m58299k(window, new Function1() { // from class: com.kubi.sdk.util.p
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return EdgeToEdgeCompat.Impl35.m58313I(this.f48260b, window, (WindowInsetsCompat) obj);
                }
            });
        }

        @Override // com.kubi.sdk.util.EdgeToEdgeCompat.Impl
        /* JADX INFO: renamed from: r */
        public boolean mo58303r(@NotNull Window window) {
            Intrinsics.checkNotNullParameter(window, "window");
            View viewM58320H = m58320H(window, "TAG_NAV_BAR");
            return viewM58320H != null && viewM58320H.getVisibility() == 0;
        }

        @Override // com.kubi.sdk.util.EdgeToEdgeCompat.Impl
        /* JADX INFO: renamed from: s */
        public void mo58304s(@NotNull final Window window, @Nullable final Integer num) {
            Intrinsics.checkNotNullParameter(window, "window");
            m58299k(window, new Function1() { // from class: com.kubi.sdk.util.s
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return EdgeToEdgeCompat.Impl35.m58314J(this.f48270b, window, num, (WindowInsetsCompat) obj);
                }
            });
        }

        @Override // com.kubi.sdk.util.EdgeToEdgeCompat.Impl
        /* JADX INFO: renamed from: t */
        public void mo58305t(@NotNull final Window window, @Nullable final Integer num) {
            Intrinsics.checkNotNullParameter(window, "window");
            m58299k(window, new Function1() { // from class: com.kubi.sdk.util.t
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return EdgeToEdgeCompat.Impl35.m58315K(this.f48273b, window, num, (WindowInsetsCompat) obj);
                }
            });
        }

        @Override // com.kubi.sdk.util.EdgeToEdgeCompat.Impl
        /* JADX INFO: renamed from: u */
        public void mo58306u(@NotNull final Window window, @Nullable final Integer num) {
            Intrinsics.checkNotNullParameter(window, "window");
            m58299k(window, new Function1() { // from class: com.kubi.sdk.util.r
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return EdgeToEdgeCompat.Impl35.m58316L(this.f48267b, window, num, (WindowInsetsCompat) obj);
                }
            });
        }

        /* JADX INFO: renamed from: H */
        public final View m58320H(Window window, String str) {
            return window.getDecorView().findViewWithTag(str);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m58264b(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        C27046k.m66685H(view);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.width = -1;
        layoutParams.height = f48106a.m58272j();
        view.setLayoutParams(layoutParams);
    }

    /* JADX INFO: renamed from: c */
    public final void m58265c(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Window window = activity.getWindow();
        Intrinsics.checkNotNullExpressionValue(window, "getWindow(...)");
        m58266d(window);
    }

    /* JADX INFO: renamed from: d */
    public final void m58266d(@NotNull Window window) {
        Intrinsics.checkNotNullParameter(window, "window");
        if (Build.VERSION.SDK_INT >= 35) {
            new Impl35().mo58293e(window);
        } else {
            new Impl().mo58293e(window);
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m58267e(@NotNull Activity activity, @ColorInt int i11) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Window window = activity.getWindow();
        Intrinsics.checkNotNullExpressionValue(window, "getWindow(...)");
        m58269g(window, i11);
    }

    /* JADX INFO: renamed from: f */
    public final void m58268f(@NotNull Activity activity, @NotNull View view) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(view, "view");
        Window window = activity.getWindow();
        Intrinsics.checkNotNullExpressionValue(window, "getWindow(...)");
        m58270h(window, view);
    }

    /* JADX INFO: renamed from: g */
    public final void m58269g(@NotNull Window window, @ColorInt int i11) {
        Intrinsics.checkNotNullParameter(window, "window");
        m58266d(window);
        m58263a(window, i11);
    }

    /* JADX INFO: renamed from: h */
    public final void m58270h(@NotNull Window window, @NotNull View view) {
        Intrinsics.checkNotNullParameter(window, "window");
        Intrinsics.checkNotNullParameter(view, "view");
        m58266d(window);
        m58264b(view);
    }

    /* JADX INFO: renamed from: i */
    public final int m58271i() {
        return Build.VERSION.SDK_INT >= 35 ? new Impl35().m58296h() : new Impl().m58296h();
    }

    /* JADX INFO: renamed from: j */
    public final int m58272j() {
        return Build.VERSION.SDK_INT >= 35 ? new Impl35().m58298j() : new Impl().m58298j();
    }

    /* JADX INFO: renamed from: k */
    public final void m58273k(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Window window = activity.getWindow();
        Intrinsics.checkNotNullExpressionValue(window, "getWindow(...)");
        m58274l(window);
    }

    /* JADX INFO: renamed from: l */
    public final void m58274l(@NotNull Window window) {
        Intrinsics.checkNotNullParameter(window, "window");
        if (Build.VERSION.SDK_INT >= 35) {
            new Impl35().mo58302q(window);
        } else {
            new Impl().mo58302q(window);
        }
    }

    /* JADX INFO: renamed from: m */
    public final boolean m58275m(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Window window = activity.getWindow();
        Intrinsics.checkNotNullExpressionValue(window, "getWindow(...)");
        return m58276n(window);
    }

    /* JADX INFO: renamed from: n */
    public final boolean m58276n(@NotNull Window window) {
        Intrinsics.checkNotNullParameter(window, "window");
        return Build.VERSION.SDK_INT >= 35 ? new Impl35().mo58303r(window) : new Impl().mo58303r(window);
    }

    /* JADX INFO: renamed from: o */
    public final void m58277o(@NotNull Activity activity, @Nullable Integer num) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Window window = activity.getWindow();
        Intrinsics.checkNotNullExpressionValue(window, "getWindow(...)");
        m58278p(window, num);
    }

    /* JADX INFO: renamed from: p */
    public final void m58278p(@NotNull Window window, @Nullable Integer num) {
        Intrinsics.checkNotNullParameter(window, "window");
        if (Build.VERSION.SDK_INT >= 35) {
            new Impl35().mo58304s(window, num);
        } else {
            new Impl().mo58304s(window, num);
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m58279q(@NotNull Activity activity, @Nullable Integer num) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Window window = activity.getWindow();
        Intrinsics.checkNotNullExpressionValue(window, "getWindow(...)");
        m58280r(window, num);
    }

    /* JADX INFO: renamed from: r */
    public final void m58280r(@NotNull Window window, @Nullable Integer num) {
        Intrinsics.checkNotNullParameter(window, "window");
        if (Build.VERSION.SDK_INT >= 35) {
            new Impl35().mo58305t(window, num);
        } else {
            new Impl().mo58305t(window, num);
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m58281s(@NotNull Activity activity, @Nullable Integer num) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Window window = activity.getWindow();
        Intrinsics.checkNotNullExpressionValue(window, "getWindow(...)");
        m58282t(window, num);
    }

    /* JADX INFO: renamed from: t */
    public final void m58282t(@NotNull Window window, @Nullable Integer num) {
        Intrinsics.checkNotNullParameter(window, "window");
        if (Build.VERSION.SDK_INT >= 35) {
            new Impl35().mo58306u(window, num);
        } else {
            new Impl().mo58306u(window, num);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m58263a(Window window, int i11) {
        View decorView = window.getDecorView();
        Intrinsics.checkNotNull(decorView, "null cannot be cast to non-null type android.view.ViewGroup");
        ViewGroup viewGroup = (ViewGroup) decorView;
        View viewFindViewWithTag = viewGroup.findViewWithTag("TAG_FAKE_STATUS_BAR");
        if (viewFindViewWithTag != null) {
            C27046k.m66685H(viewFindViewWithTag);
            viewFindViewWithTag.setBackgroundColor(i11);
            return;
        }
        View view = new View(window.getContext());
        view.setLayoutParams(new ViewGroup.LayoutParams(-1, C5270g.m6194h()));
        view.setBackgroundColor(i11);
        view.setTag("TAG_FAKE_STATUS_BAR");
        viewGroup.addView(view);
    }
}
