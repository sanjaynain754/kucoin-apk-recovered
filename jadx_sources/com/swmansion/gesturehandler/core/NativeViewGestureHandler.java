package com.swmansion.gesturehandler.core;

import android.content.Context;
import android.os.SystemClock;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.ScrollView;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.facebook.react.views.scroll.ReactHorizontalScrollView;
import com.facebook.react.views.scroll.ReactScrollView;
import com.facebook.react.views.swiperefresh.ReactSwipeRefreshLayout;
import com.facebook.react.views.text.ReactTextView;
import com.facebook.react.views.textinput.ReactEditText;
import com.facebook.react.views.view.ReactViewGroup;
import com.swmansion.gesturehandler.react.RNGestureHandlerButtonViewManager;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import sb0.C44375a;

/* JADX INFO: compiled from: NativeViewGestureHandler.kt */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u0000 \"2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0007#$%&'()B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0003J\u0015\u0010\b\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\u000b\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\tJ\u001b\u0010\r\u001a\u00020\u00062\n\u0010\f\u001a\u0006\u0012\u0002\b\u00030\u0001H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001b\u0010\u000f\u001a\u00020\u00062\n\u0010\f\u001a\u0006\u0012\u0002\b\u00030\u0001H\u0016¢\u0006\u0004\b\u000f\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0010\u0010\u0003J\u001f\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0011H\u0014¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0016\u0010\u0003J\u000f\u0010\u0017\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0017\u0010\u0003R\u0016\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R$\u0010\n\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u00068\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u001b\u0010\u0019\u001a\u0004\b\u001c\u0010\u001dR\u0016\u0010!\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006*"}, m90084d2 = {"Lcom/swmansion/gesturehandler/core/NativeViewGestureHandler;", "Lcom/swmansion/gesturehandler/core/GestureHandler;", "<init>", "()V", "", "o0", "", "shouldActivateOnStart", "U0", "(Z)Lcom/swmansion/gesturehandler/core/NativeViewGestureHandler;", "disallowInterruption", "T0", "handler", "J0", "(Lcom/swmansion/gesturehandler/core/GestureHandler;)Z", "I0", "j0", "Landroid/view/MotionEvent;", "event", "sourceEvent", "h0", "(Landroid/view/MotionEvent;Landroid/view/MotionEvent;)V", "g0", "k0", "N", "Z", "value", "O", "S0", "()Z", "Lcom/swmansion/gesturehandler/core/NativeViewGestureHandler$c;", "P", "Lcom/swmansion/gesturehandler/core/NativeViewGestureHandler$c;", "hook", "Q", "Companion", "c", "g", "b", "f", "e", "d", "react-native-gesture-handler_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public final class NativeViewGestureHandler extends GestureHandler<NativeViewGestureHandler> {

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: R */
    @NotNull
    public static final C33419a f68222R = new C33419a();

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    public boolean shouldActivateOnStart;

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    public boolean disallowInterruption;

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    @NotNull
    public InterfaceC33421c hook = f68222R;

    /* JADX INFO: compiled from: NativeViewGestureHandler.kt */
    @Metadata(m90083d1 = {"\u0000'\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\b\u0004*\u0001\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, m90084d2 = {"Lcom/swmansion/gesturehandler/core/NativeViewGestureHandler$Companion;", "", "<init>", "()V", "Landroid/view/View;", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/MotionEvent;", "event", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Landroid/view/View;Landroid/view/MotionEvent;)Z", "com/swmansion/gesturehandler/core/NativeViewGestureHandler$a", "defaultHook", "Lcom/swmansion/gesturehandler/core/NativeViewGestureHandler$a;", "react-native-gesture-handler_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        /* JADX INFO: renamed from: a */
        public final boolean m71885a(View view, MotionEvent event) {
            return (view instanceof ViewGroup) && ((ViewGroup) view).onInterceptTouchEvent(event);
        }
    }

    /* JADX INFO: renamed from: com.swmansion.gesturehandler.core.NativeViewGestureHandler$b */
    /* JADX INFO: compiled from: NativeViewGestureHandler.kt */
    @Metadata(m90083d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\u000f\u001a\u00020\u000e2\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0013\u0010\fJ\u000f\u0010\u0014\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0014\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u001a\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0019R\u0016\u0010\u001c\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u0016\u0010 \u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006!"}, m90084d2 = {"Lcom/swmansion/gesturehandler/core/NativeViewGestureHandler$b;", "Lcom/swmansion/gesturehandler/core/NativeViewGestureHandler$c;", "Lcom/swmansion/gesturehandler/core/NativeViewGestureHandler;", "handler", "Lcom/facebook/react/views/textinput/ReactEditText;", "editText", "<init>", "(Lcom/swmansion/gesturehandler/core/NativeViewGestureHandler;Lcom/facebook/react/views/textinput/ReactEditText;)V", "Landroid/view/MotionEvent;", "event", "", "b", "(Landroid/view/MotionEvent;)V", "Lcom/swmansion/gesturehandler/core/GestureHandler;", "", CmcdData.Factory.STREAMING_FORMAT_HLS, "(Lcom/swmansion/gesturehandler/core/GestureHandler;)Ljava/lang/Boolean;", "d", "()Z", "g", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Lcom/swmansion/gesturehandler/core/NativeViewGestureHandler;", "c", "Lcom/facebook/react/views/textinput/ReactEditText;", "", "F", "startX", "e", "startY", "", "f", "I", "touchSlopSquared", "react-native-gesture-handler_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
    public static final class C33420b implements InterfaceC33421c {

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        public final NativeViewGestureHandler handler;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        @NotNull
        public final ReactEditText editText;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        public float startX;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        public float startY;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        public int touchSlopSquared;

        @Override // com.swmansion.gesturehandler.core.NativeViewGestureHandler.InterfaceC33421c
        /* JADX INFO: renamed from: a */
        public boolean mo71886a() {
            return true;
        }

        @Override // com.swmansion.gesturehandler.core.NativeViewGestureHandler.InterfaceC33421c
        /* JADX INFO: renamed from: d */
        public boolean mo71889d() {
            return true;
        }

        public C33420b(@NotNull NativeViewGestureHandler handler, @NotNull ReactEditText editText) {
            Intrinsics.checkNotNullParameter(handler, "handler");
            Intrinsics.checkNotNullParameter(editText, "editText");
            this.handler = handler;
            this.editText = editText;
            ViewConfiguration viewConfiguration = ViewConfiguration.get(editText.getContext());
            this.touchSlopSquared = viewConfiguration.getScaledTouchSlop() * viewConfiguration.getScaledTouchSlop();
        }

        @Override // com.swmansion.gesturehandler.core.NativeViewGestureHandler.InterfaceC33421c
        /* JADX INFO: renamed from: b */
        public void mo71887b(@NotNull MotionEvent event) {
            Intrinsics.checkNotNullParameter(event, "event");
            if (((event.getX() - this.startX) * (event.getX() - this.startX)) + ((event.getY() - this.startY) * (event.getY() - this.startY)) < this.touchSlopSquared) {
                this.editText.requestFocusFromJS();
            }
        }

        @Override // com.swmansion.gesturehandler.core.NativeViewGestureHandler.InterfaceC33421c
        /* JADX INFO: renamed from: g */
        public void mo71892g(@NotNull MotionEvent event) {
            Intrinsics.checkNotNullParameter(event, "event");
            this.handler.m71778i();
            this.editText.onTouchEvent(event);
            this.startX = event.getX();
            this.startY = event.getY();
        }

        @Override // com.swmansion.gesturehandler.core.NativeViewGestureHandler.InterfaceC33421c
        @NotNull
        /* JADX INFO: renamed from: h */
        public Boolean mo71893h(@NotNull GestureHandler<?> handler) {
            Intrinsics.checkNotNullParameter(handler, "handler");
            return Boolean.valueOf(handler.getTag() > 0 && !(handler instanceof NativeViewGestureHandler));
        }

        @Override // com.swmansion.gesturehandler.core.NativeViewGestureHandler.InterfaceC33421c
        /* JADX INFO: renamed from: c */
        public boolean mo71888c(@NotNull MotionEvent motionEvent) {
            return InterfaceC33421c.a.m71896c(this, motionEvent);
        }

        @Override // com.swmansion.gesturehandler.core.NativeViewGestureHandler.InterfaceC33421c
        /* JADX INFO: renamed from: e */
        public boolean mo71890e(@NotNull View view) {
            return InterfaceC33421c.a.m71895b(this, view);
        }

        @Override // com.swmansion.gesturehandler.core.NativeViewGestureHandler.InterfaceC33421c
        @Nullable
        /* JADX INFO: renamed from: f */
        public Boolean mo71891f(@Nullable View view, @NotNull MotionEvent motionEvent) {
            return InterfaceC33421c.a.m71898e(this, view, motionEvent);
        }
    }

    /* JADX INFO: renamed from: com.swmansion.gesturehandler.core.NativeViewGestureHandler$c */
    /* JADX INFO: compiled from: NativeViewGestureHandler.kt */
    @Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0010\u001a\u0004\u0018\u00010\u00042\n\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0014\u0010\rJ\u000f\u0010\u0015\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0015\u0010\u0013J#\u0010\u0016\u001a\u0004\u0018\u00010\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m90084d2 = {"Lcom/swmansion/gesturehandler/core/NativeViewGestureHandler$c;", "", "Landroid/view/MotionEvent;", "event", "", "c", "(Landroid/view/MotionEvent;)Z", "Landroid/view/View;", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "e", "(Landroid/view/View;)Z", "", "b", "(Landroid/view/MotionEvent;)V", "Lcom/swmansion/gesturehandler/core/GestureHandler;", "handler", CmcdData.Factory.STREAMING_FORMAT_HLS, "(Lcom/swmansion/gesturehandler/core/GestureHandler;)Ljava/lang/Boolean;", "d", "()Z", "g", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "f", "(Landroid/view/View;Landroid/view/MotionEvent;)Ljava/lang/Boolean;", "react-native-gesture-handler_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
    public interface InterfaceC33421c {

        /* JADX INFO: renamed from: com.swmansion.gesturehandler.core.NativeViewGestureHandler$c$a */
        /* JADX INFO: compiled from: NativeViewGestureHandler.kt */
        @Metadata(m90085k = 3, m90086mv = {2, 0, 0}, m90088xi = 48)
        public static final class a {
            /* JADX INFO: renamed from: f */
            public static boolean m71899f(@NotNull InterfaceC33421c interfaceC33421c) {
                return false;
            }

            /* JADX INFO: renamed from: h */
            public static boolean m71901h(@NotNull InterfaceC33421c interfaceC33421c) {
                return false;
            }

            /* JADX INFO: renamed from: a */
            public static void m71894a(@NotNull InterfaceC33421c interfaceC33421c, @NotNull MotionEvent event) {
                Intrinsics.checkNotNullParameter(event, "event");
            }

            /* JADX INFO: renamed from: c */
            public static boolean m71896c(@NotNull InterfaceC33421c interfaceC33421c, @NotNull MotionEvent event) {
                Intrinsics.checkNotNullParameter(event, "event");
                return true;
            }

            /* JADX INFO: renamed from: d */
            public static void m71897d(@NotNull InterfaceC33421c interfaceC33421c, @NotNull MotionEvent event) {
                Intrinsics.checkNotNullParameter(event, "event");
            }

            @Nullable
            /* JADX INFO: renamed from: e */
            public static Boolean m71898e(@NotNull InterfaceC33421c interfaceC33421c, @Nullable View view, @NotNull MotionEvent event) {
                Intrinsics.checkNotNullParameter(event, "event");
                if (view != null) {
                    return Boolean.valueOf(view.onTouchEvent(event));
                }
                return null;
            }

            @Nullable
            /* JADX INFO: renamed from: g */
            public static Boolean m71900g(@NotNull InterfaceC33421c interfaceC33421c, @NotNull GestureHandler<?> handler) {
                Intrinsics.checkNotNullParameter(handler, "handler");
                return null;
            }

            /* JADX INFO: renamed from: b */
            public static boolean m71895b(@NotNull InterfaceC33421c interfaceC33421c, @NotNull View view) {
                Intrinsics.checkNotNullParameter(view, "view");
                return view.isPressed();
            }
        }

        /* JADX INFO: renamed from: a */
        boolean mo71886a();

        /* JADX INFO: renamed from: b */
        void mo71887b(@NotNull MotionEvent event);

        /* JADX INFO: renamed from: c */
        boolean mo71888c(@NotNull MotionEvent event);

        /* JADX INFO: renamed from: d */
        boolean mo71889d();

        /* JADX INFO: renamed from: e */
        boolean mo71890e(@NotNull View view);

        @Nullable
        /* JADX INFO: renamed from: f */
        Boolean mo71891f(@Nullable View view, @NotNull MotionEvent event);

        /* JADX INFO: renamed from: g */
        void mo71892g(@NotNull MotionEvent event);

        @Nullable
        /* JADX INFO: renamed from: h */
        Boolean mo71893h(@NotNull GestureHandler<?> handler);
    }

    /* JADX INFO: renamed from: com.swmansion.gesturehandler.core.NativeViewGestureHandler$d */
    /* JADX INFO: compiled from: NativeViewGestureHandler.kt */
    @Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m90084d2 = {"Lcom/swmansion/gesturehandler/core/NativeViewGestureHandler$d;", "Lcom/swmansion/gesturehandler/core/NativeViewGestureHandler$c;", "<init>", "()V", "Landroid/view/View;", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/MotionEvent;", "event", "", "f", "(Landroid/view/View;Landroid/view/MotionEvent;)Ljava/lang/Boolean;", "react-native-gesture-handler_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
    public static final class C33422d implements InterfaceC33421c {
        @Override // com.swmansion.gesturehandler.core.NativeViewGestureHandler.InterfaceC33421c
        @Nullable
        /* JADX INFO: renamed from: f */
        public Boolean mo71891f(@Nullable View view, @NotNull MotionEvent event) {
            Intrinsics.checkNotNullParameter(event, "event");
            if (view != null) {
                return Boolean.valueOf(view.dispatchTouchEvent(event));
            }
            return null;
        }

        @Override // com.swmansion.gesturehandler.core.NativeViewGestureHandler.InterfaceC33421c
        /* JADX INFO: renamed from: a */
        public boolean mo71886a() {
            return InterfaceC33421c.a.m71899f(this);
        }

        @Override // com.swmansion.gesturehandler.core.NativeViewGestureHandler.InterfaceC33421c
        /* JADX INFO: renamed from: b */
        public void mo71887b(@NotNull MotionEvent motionEvent) {
            InterfaceC33421c.a.m71894a(this, motionEvent);
        }

        @Override // com.swmansion.gesturehandler.core.NativeViewGestureHandler.InterfaceC33421c
        /* JADX INFO: renamed from: c */
        public boolean mo71888c(@NotNull MotionEvent motionEvent) {
            return InterfaceC33421c.a.m71896c(this, motionEvent);
        }

        @Override // com.swmansion.gesturehandler.core.NativeViewGestureHandler.InterfaceC33421c
        /* JADX INFO: renamed from: d */
        public boolean mo71889d() {
            return InterfaceC33421c.a.m71901h(this);
        }

        @Override // com.swmansion.gesturehandler.core.NativeViewGestureHandler.InterfaceC33421c
        /* JADX INFO: renamed from: e */
        public boolean mo71890e(@NotNull View view) {
            return InterfaceC33421c.a.m71895b(this, view);
        }

        @Override // com.swmansion.gesturehandler.core.NativeViewGestureHandler.InterfaceC33421c
        /* JADX INFO: renamed from: g */
        public void mo71892g(@NotNull MotionEvent motionEvent) {
            InterfaceC33421c.a.m71897d(this, motionEvent);
        }

        @Override // com.swmansion.gesturehandler.core.NativeViewGestureHandler.InterfaceC33421c
        @Nullable
        /* JADX INFO: renamed from: h */
        public Boolean mo71893h(@NotNull GestureHandler<?> gestureHandler) {
            return InterfaceC33421c.a.m71900g(this, gestureHandler);
        }
    }

    /* JADX INFO: renamed from: com.swmansion.gesturehandler.core.NativeViewGestureHandler$f */
    /* JADX INFO: compiled from: NativeViewGestureHandler.kt */
    @Metadata(m90083d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m90084d2 = {"Lcom/swmansion/gesturehandler/core/NativeViewGestureHandler$f;", "Lcom/swmansion/gesturehandler/core/NativeViewGestureHandler$c;", "Lcom/swmansion/gesturehandler/core/NativeViewGestureHandler;", "handler", "Lcom/facebook/react/views/swiperefresh/ReactSwipeRefreshLayout;", "swipeRefreshLayout", "<init>", "(Lcom/swmansion/gesturehandler/core/NativeViewGestureHandler;Lcom/facebook/react/views/swiperefresh/ReactSwipeRefreshLayout;)V", "", "d", "()Z", "Landroid/view/MotionEvent;", "event", "", "g", "(Landroid/view/MotionEvent;)V", "b", "Lcom/swmansion/gesturehandler/core/NativeViewGestureHandler;", "c", "Lcom/facebook/react/views/swiperefresh/ReactSwipeRefreshLayout;", "react-native-gesture-handler_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nNativeViewGestureHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NativeViewGestureHandler.kt\ncom/swmansion/gesturehandler/core/NativeViewGestureHandler$SwipeRefreshLayoutHook\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,319:1\n230#2,2:320\n*S KotlinDebug\n*F\n+ 1 NativeViewGestureHandler.kt\ncom/swmansion/gesturehandler/core/NativeViewGestureHandler$SwipeRefreshLayoutHook\n*L\n290#1:320,2\n*E\n"})
    public static final class C33424f implements InterfaceC33421c {

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        public final NativeViewGestureHandler handler;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        @NotNull
        public final ReactSwipeRefreshLayout swipeRefreshLayout;

        @Override // com.swmansion.gesturehandler.core.NativeViewGestureHandler.InterfaceC33421c
        /* JADX INFO: renamed from: d */
        public boolean mo71889d() {
            return true;
        }

        public C33424f(@NotNull NativeViewGestureHandler handler, @NotNull ReactSwipeRefreshLayout swipeRefreshLayout) {
            Intrinsics.checkNotNullParameter(handler, "handler");
            Intrinsics.checkNotNullParameter(swipeRefreshLayout, "swipeRefreshLayout");
            this.handler = handler;
            this.swipeRefreshLayout = swipeRefreshLayout;
        }

        @Override // com.swmansion.gesturehandler.core.NativeViewGestureHandler.InterfaceC33421c
        /* JADX INFO: renamed from: g */
        public void mo71892g(@NotNull MotionEvent event) {
            ArrayList<GestureHandler<?>> arrayListM71853s;
            Intrinsics.checkNotNullParameter(event, "event");
            View childAt = this.swipeRefreshLayout.getChildAt(0);
            GestureHandler gestureHandler = null;
            ScrollView scrollView = childAt instanceof ScrollView ? (ScrollView) childAt : null;
            if (scrollView == null) {
                return;
            }
            GestureHandlerOrchestrator orchestrator = this.handler.getOrchestrator();
            if (orchestrator != null && (arrayListM71853s = orchestrator.m71853s(scrollView)) != null) {
                Iterator<T> it = arrayListM71853s.iterator();
                do {
                    if (!it.hasNext()) {
                        throw new NoSuchElementException("Collection contains no element matching the predicate.");
                    }
                    gestureHandler = (GestureHandler) it.next();
                } while (!(gestureHandler instanceof NativeViewGestureHandler));
            }
            if (gestureHandler == null || gestureHandler.getState() != 4 || scrollView.getScrollY() <= 0) {
                return;
            }
            this.handler.m71730B();
        }

        @Override // com.swmansion.gesturehandler.core.NativeViewGestureHandler.InterfaceC33421c
        /* JADX INFO: renamed from: a */
        public boolean mo71886a() {
            return InterfaceC33421c.a.m71899f(this);
        }

        @Override // com.swmansion.gesturehandler.core.NativeViewGestureHandler.InterfaceC33421c
        /* JADX INFO: renamed from: b */
        public void mo71887b(@NotNull MotionEvent motionEvent) {
            InterfaceC33421c.a.m71894a(this, motionEvent);
        }

        @Override // com.swmansion.gesturehandler.core.NativeViewGestureHandler.InterfaceC33421c
        /* JADX INFO: renamed from: c */
        public boolean mo71888c(@NotNull MotionEvent motionEvent) {
            return InterfaceC33421c.a.m71896c(this, motionEvent);
        }

        @Override // com.swmansion.gesturehandler.core.NativeViewGestureHandler.InterfaceC33421c
        /* JADX INFO: renamed from: e */
        public boolean mo71890e(@NotNull View view) {
            return InterfaceC33421c.a.m71895b(this, view);
        }

        @Override // com.swmansion.gesturehandler.core.NativeViewGestureHandler.InterfaceC33421c
        @Nullable
        /* JADX INFO: renamed from: f */
        public Boolean mo71891f(@Nullable View view, @NotNull MotionEvent motionEvent) {
            return InterfaceC33421c.a.m71898e(this, view, motionEvent);
        }

        @Override // com.swmansion.gesturehandler.core.NativeViewGestureHandler.InterfaceC33421c
        @Nullable
        /* JADX INFO: renamed from: h */
        public Boolean mo71893h(@NotNull GestureHandler<?> gestureHandler) {
            return InterfaceC33421c.a.m71900g(this, gestureHandler);
        }
    }

    /* JADX INFO: renamed from: com.swmansion.gesturehandler.core.NativeViewGestureHandler$g */
    /* JADX INFO: compiled from: NativeViewGestureHandler.kt */
    @Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0007\u001a\u00020\u00062\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, m90084d2 = {"Lcom/swmansion/gesturehandler/core/NativeViewGestureHandler$g;", "Lcom/swmansion/gesturehandler/core/NativeViewGestureHandler$c;", "<init>", "()V", "Lcom/swmansion/gesturehandler/core/GestureHandler;", "handler", "", CmcdData.Factory.STREAMING_FORMAT_HLS, "(Lcom/swmansion/gesturehandler/core/GestureHandler;)Ljava/lang/Boolean;", "Landroid/view/View;", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "e", "(Landroid/view/View;)Z", "react-native-gesture-handler_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
    public static final class C33425g implements InterfaceC33421c {
        @Override // com.swmansion.gesturehandler.core.NativeViewGestureHandler.InterfaceC33421c
        @NotNull
        /* JADX INFO: renamed from: h */
        public Boolean mo71893h(@NotNull GestureHandler<?> handler) {
            Intrinsics.checkNotNullParameter(handler, "handler");
            return Boolean.FALSE;
        }

        @Override // com.swmansion.gesturehandler.core.NativeViewGestureHandler.InterfaceC33421c
        /* JADX INFO: renamed from: a */
        public boolean mo71886a() {
            return InterfaceC33421c.a.m71899f(this);
        }

        @Override // com.swmansion.gesturehandler.core.NativeViewGestureHandler.InterfaceC33421c
        /* JADX INFO: renamed from: b */
        public void mo71887b(@NotNull MotionEvent motionEvent) {
            InterfaceC33421c.a.m71894a(this, motionEvent);
        }

        @Override // com.swmansion.gesturehandler.core.NativeViewGestureHandler.InterfaceC33421c
        /* JADX INFO: renamed from: c */
        public boolean mo71888c(@NotNull MotionEvent motionEvent) {
            return InterfaceC33421c.a.m71896c(this, motionEvent);
        }

        @Override // com.swmansion.gesturehandler.core.NativeViewGestureHandler.InterfaceC33421c
        /* JADX INFO: renamed from: d */
        public boolean mo71889d() {
            return InterfaceC33421c.a.m71901h(this);
        }

        @Override // com.swmansion.gesturehandler.core.NativeViewGestureHandler.InterfaceC33421c
        /* JADX INFO: renamed from: e */
        public boolean mo71890e(@NotNull View view) {
            Intrinsics.checkNotNullParameter(view, "view");
            return view instanceof ReactTextView;
        }

        @Override // com.swmansion.gesturehandler.core.NativeViewGestureHandler.InterfaceC33421c
        @Nullable
        /* JADX INFO: renamed from: f */
        public Boolean mo71891f(@Nullable View view, @NotNull MotionEvent motionEvent) {
            return InterfaceC33421c.a.m71898e(this, view, motionEvent);
        }

        @Override // com.swmansion.gesturehandler.core.NativeViewGestureHandler.InterfaceC33421c
        /* JADX INFO: renamed from: g */
        public void mo71892g(@NotNull MotionEvent motionEvent) {
            InterfaceC33421c.a.m71897d(this, motionEvent);
        }
    }

    /* JADX INFO: renamed from: com.swmansion.gesturehandler.core.NativeViewGestureHandler$a */
    /* JADX INFO: compiled from: NativeViewGestureHandler.kt */
    @Metadata(m90083d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m90084d2 = {"com/swmansion/gesturehandler/core/NativeViewGestureHandler$a", "Lcom/swmansion/gesturehandler/core/NativeViewGestureHandler$c;", "react-native-gesture-handler_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
    public static final class C33419a implements InterfaceC33421c {
        @Override // com.swmansion.gesturehandler.core.NativeViewGestureHandler.InterfaceC33421c
        /* JADX INFO: renamed from: a */
        public boolean mo71886a() {
            return InterfaceC33421c.a.m71899f(this);
        }

        @Override // com.swmansion.gesturehandler.core.NativeViewGestureHandler.InterfaceC33421c
        /* JADX INFO: renamed from: b */
        public void mo71887b(MotionEvent motionEvent) {
            InterfaceC33421c.a.m71894a(this, motionEvent);
        }

        @Override // com.swmansion.gesturehandler.core.NativeViewGestureHandler.InterfaceC33421c
        /* JADX INFO: renamed from: c */
        public boolean mo71888c(MotionEvent motionEvent) {
            return InterfaceC33421c.a.m71896c(this, motionEvent);
        }

        @Override // com.swmansion.gesturehandler.core.NativeViewGestureHandler.InterfaceC33421c
        /* JADX INFO: renamed from: d */
        public boolean mo71889d() {
            return InterfaceC33421c.a.m71901h(this);
        }

        @Override // com.swmansion.gesturehandler.core.NativeViewGestureHandler.InterfaceC33421c
        /* JADX INFO: renamed from: e */
        public boolean mo71890e(View view) {
            return InterfaceC33421c.a.m71895b(this, view);
        }

        @Override // com.swmansion.gesturehandler.core.NativeViewGestureHandler.InterfaceC33421c
        /* JADX INFO: renamed from: f */
        public Boolean mo71891f(View view, MotionEvent motionEvent) {
            return InterfaceC33421c.a.m71898e(this, view, motionEvent);
        }

        @Override // com.swmansion.gesturehandler.core.NativeViewGestureHandler.InterfaceC33421c
        /* JADX INFO: renamed from: g */
        public void mo71892g(MotionEvent motionEvent) {
            InterfaceC33421c.a.m71897d(this, motionEvent);
        }

        @Override // com.swmansion.gesturehandler.core.NativeViewGestureHandler.InterfaceC33421c
        /* JADX INFO: renamed from: h */
        public Boolean mo71893h(GestureHandler<?> gestureHandler) {
            return InterfaceC33421c.a.m71900g(this, gestureHandler);
        }
    }

    /* JADX INFO: renamed from: com.swmansion.gesturehandler.core.NativeViewGestureHandler$e */
    /* JADX INFO: compiled from: NativeViewGestureHandler.kt */
    @Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m90084d2 = {"Lcom/swmansion/gesturehandler/core/NativeViewGestureHandler$e;", "Lcom/swmansion/gesturehandler/core/NativeViewGestureHandler$c;", "<init>", "()V", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "()Z", "react-native-gesture-handler_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
    public static final class C33423e implements InterfaceC33421c {
        @Override // com.swmansion.gesturehandler.core.NativeViewGestureHandler.InterfaceC33421c
        /* JADX INFO: renamed from: a */
        public boolean mo71886a() {
            return true;
        }

        @Override // com.swmansion.gesturehandler.core.NativeViewGestureHandler.InterfaceC33421c
        /* JADX INFO: renamed from: b */
        public void mo71887b(@NotNull MotionEvent motionEvent) {
            InterfaceC33421c.a.m71894a(this, motionEvent);
        }

        @Override // com.swmansion.gesturehandler.core.NativeViewGestureHandler.InterfaceC33421c
        /* JADX INFO: renamed from: c */
        public boolean mo71888c(@NotNull MotionEvent motionEvent) {
            return InterfaceC33421c.a.m71896c(this, motionEvent);
        }

        @Override // com.swmansion.gesturehandler.core.NativeViewGestureHandler.InterfaceC33421c
        /* JADX INFO: renamed from: d */
        public boolean mo71889d() {
            return InterfaceC33421c.a.m71901h(this);
        }

        @Override // com.swmansion.gesturehandler.core.NativeViewGestureHandler.InterfaceC33421c
        /* JADX INFO: renamed from: e */
        public boolean mo71890e(@NotNull View view) {
            return InterfaceC33421c.a.m71895b(this, view);
        }

        @Override // com.swmansion.gesturehandler.core.NativeViewGestureHandler.InterfaceC33421c
        @Nullable
        /* JADX INFO: renamed from: f */
        public Boolean mo71891f(@Nullable View view, @NotNull MotionEvent motionEvent) {
            return InterfaceC33421c.a.m71898e(this, view, motionEvent);
        }

        @Override // com.swmansion.gesturehandler.core.NativeViewGestureHandler.InterfaceC33421c
        /* JADX INFO: renamed from: g */
        public void mo71892g(@NotNull MotionEvent motionEvent) {
            InterfaceC33421c.a.m71897d(this, motionEvent);
        }

        @Override // com.swmansion.gesturehandler.core.NativeViewGestureHandler.InterfaceC33421c
        @Nullable
        /* JADX INFO: renamed from: h */
        public Boolean mo71893h(@NotNull GestureHandler<?> gestureHandler) {
            return InterfaceC33421c.a.m71900g(this, gestureHandler);
        }
    }

    @Override // com.swmansion.gesturehandler.core.GestureHandler
    /* JADX INFO: renamed from: I0 */
    public boolean mo71745I0(@NotNull GestureHandler<?> handler) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        return !this.disallowInterruption;
    }

    @Override // com.swmansion.gesturehandler.core.GestureHandler
    /* JADX INFO: renamed from: J0 */
    public boolean mo71747J0(@NotNull GestureHandler<?> handler) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        Boolean boolMo71893h = this.hook.mo71893h(handler);
        if (boolMo71893h != null) {
            return boolMo71893h.booleanValue();
        }
        if (super.mo71747J0(handler)) {
            return true;
        }
        if (handler instanceof NativeViewGestureHandler) {
            NativeViewGestureHandler nativeViewGestureHandler = (NativeViewGestureHandler) handler;
            if (nativeViewGestureHandler.getState() == 4 && nativeViewGestureHandler.disallowInterruption) {
                return false;
            }
        }
        boolean z11 = this.disallowInterruption;
        return !(getState() == 4 && handler.getState() == 4 && !z11) && getState() == 4 && !z11 && (!this.hook.mo71886a() || handler.getTag() > 0);
    }

    /* JADX INFO: renamed from: S0, reason: from getter */
    public final boolean getDisallowInterruption() {
        return this.disallowInterruption;
    }

    @NotNull
    /* JADX INFO: renamed from: T0 */
    public final NativeViewGestureHandler m71883T0(boolean disallowInterruption) {
        this.disallowInterruption = disallowInterruption;
        return this;
    }

    @NotNull
    /* JADX INFO: renamed from: U0 */
    public final NativeViewGestureHandler m71884U0(boolean shouldActivateOnStart) {
        this.shouldActivateOnStart = shouldActivateOnStart;
        return this;
    }

    @Override // com.swmansion.gesturehandler.core.GestureHandler
    /* JADX INFO: renamed from: h0 */
    public void mo71715h0(@NotNull MotionEvent event, @NotNull MotionEvent sourceEvent) {
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(sourceEvent, "sourceEvent");
        View view = getCom.tencent.qcloud.tuicore.TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW java.lang.String();
        Intrinsics.checkNotNull(view);
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        boolean zM97875c = C44375a.m97875c(context);
        if ((view instanceof RNGestureHandlerButtonViewManager.ButtonViewGroup) && zM97875c) {
            return;
        }
        if (event.getActionMasked() == 1) {
            if (getState() != 0 || this.hook.mo71888c(event)) {
                this.hook.mo71891f(view, event);
                if ((getState() == 0 || getState() == 2) && this.hook.mo71890e(view)) {
                    m71778i();
                }
                if (getState() == 0) {
                    m71788o();
                } else {
                    m71808z();
                }
            } else {
                m71788o();
            }
            this.hook.mo71887b(event);
            return;
        }
        if (getState() != 0 && getState() != 2) {
            if (getState() == 4) {
                this.hook.mo71891f(view, event);
                return;
            }
            return;
        }
        if (this.shouldActivateOnStart) {
            INSTANCE.m71885a(view, event);
            this.hook.mo71891f(view, event);
            m71778i();
        } else if (INSTANCE.m71885a(view, event)) {
            this.hook.mo71891f(view, event);
            m71778i();
        } else if (this.hook.mo71889d()) {
            this.hook.mo71892g(event);
        } else {
            if (getState() == 2 || !this.hook.mo71888c(event)) {
                return;
            }
            m71786n();
        }
    }

    @Override // com.swmansion.gesturehandler.core.GestureHandler
    /* JADX INFO: renamed from: k0 */
    public void mo71717k0() {
        this.hook = f68222R;
    }

    public NativeViewGestureHandler() {
        m71737E0(true);
    }

    @Override // com.swmansion.gesturehandler.core.GestureHandler
    /* JADX INFO: renamed from: g0 */
    public void mo71714g0() {
        long jUptimeMillis = SystemClock.uptimeMillis();
        MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
        motionEventObtain.setAction(3);
        InterfaceC33421c interfaceC33421c = this.hook;
        View view = getCom.tencent.qcloud.tuicore.TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW java.lang.String();
        Intrinsics.checkNotNull(motionEventObtain);
        interfaceC33421c.mo71891f(view, motionEventObtain);
        motionEventObtain.recycle();
    }

    @Override // com.swmansion.gesturehandler.core.GestureHandler
    /* JADX INFO: renamed from: j0 */
    public void mo71780j0() {
        KeyEvent.Callback callback = getCom.tencent.qcloud.tuicore.TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW java.lang.String();
        if (callback instanceof InterfaceC33421c) {
            this.hook = (InterfaceC33421c) callback;
            return;
        }
        if (callback instanceof ReactEditText) {
            this.hook = new C33420b(this, (ReactEditText) callback);
            return;
        }
        if (callback instanceof ReactSwipeRefreshLayout) {
            this.hook = new C33424f(this, (ReactSwipeRefreshLayout) callback);
            return;
        }
        if (callback instanceof ReactScrollView) {
            this.hook = new C33423e();
            return;
        }
        if (callback instanceof ReactHorizontalScrollView) {
            this.hook = new C33423e();
        } else if (callback instanceof ReactTextView) {
            this.hook = new C33425g();
        } else if (callback instanceof ReactViewGroup) {
            this.hook = new C33422d();
        }
    }

    @Override // com.swmansion.gesturehandler.core.GestureHandler
    /* JADX INFO: renamed from: o0 */
    public void mo71718o0() {
        super.mo71718o0();
        this.shouldActivateOnStart = false;
        this.disallowInterruption = false;
    }
}
