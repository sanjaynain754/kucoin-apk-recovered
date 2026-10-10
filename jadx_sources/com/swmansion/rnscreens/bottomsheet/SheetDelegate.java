package com.swmansion.rnscreens.bottomsheet;

import android.app.Activity;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.WindowManager;
import android.view.WindowMetrics;
import android.view.inputmethod.InputMethodManager;
import androidx.core.graphics.Insets;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.facebook.react.uimanager.ThemedReactContext;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.swmansion.rnscreens.InsetsObserverProxy;
import com.swmansion.rnscreens.KeyboardDidHide;
import com.swmansion.rnscreens.KeyboardNotVisible;
import com.swmansion.rnscreens.KeyboardState;
import com.swmansion.rnscreens.KeyboardVisible;
import com.swmansion.rnscreens.Screen;
import com.swmansion.rnscreens.ScreenContainer;
import com.swmansion.rnscreens.ScreenContentWrapper;
import com.swmansion.rnscreens.ScreenFooter;
import com.swmansion.rnscreens.ScreenStackFragment;
import com.tencent.bugly.proguard.InterfaceC33953u5;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: SheetDelegate.kt */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 G2\u00020\u00012\u00020\u0002:\u0003HIGB\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\fJ\u000f\u0010\u000e\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000e\u0010\fJ\u0017\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0011\u0010\u0017\u001a\u0004\u0018\u00010\u000fH\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001d\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ7\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00030\u001f2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00030\u001f2\b\b\u0002\u0010\"\u001a\u00020!2\b\b\u0002\u0010#\u001a\u00020\u000fH\u0000¢\u0006\u0004\b$\u0010%J\u001f\u0010*\u001a\u00020(2\u0006\u0010'\u001a\u00020\u00072\u0006\u0010)\u001a\u00020(H\u0016¢\u0006\u0004\b*\u0010+R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010,\u001a\u0004\b-\u0010.R\u0016\u0010/\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u0016\u0010\"\u001a\u00020!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u00101R$\u00103\u001a\u00020\u000f2\u0006\u00102\u001a\u00020\u000f8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R*\u00107\u001a\u00020\u000f2\u0006\u00102\u001a\u00020\u000f8\u0006@BX\u0086\u000e¢\u0006\u0012\n\u0004\b7\u00104\u0012\u0004\b9\u0010\f\u001a\u0004\b8\u00106R\u0018\u0010;\u001a\u00060:R\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0018\u0010>\u001a\u00060=R\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u001c\u0010B\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u001f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b@\u0010AR\u0014\u0010F\u001a\u00020C8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bD\u0010E¨\u0006J"}, m90084d2 = {"Lcom/swmansion/rnscreens/bottomsheet/SheetDelegate;", "Landroidx/lifecycle/LifecycleEventObserver;", "Landroidx/core/view/OnApplyWindowInsetsListener;", "Lcom/swmansion/rnscreens/Screen;", "screen", "<init>", "(Lcom/swmansion/rnscreens/Screen;)V", "Landroid/view/View;", "requireDecorView", "()Landroid/view/View;", "", "handleHostFragmentOnStart", "()V", "handleHostFragmentOnResume", "handleHostFragmentOnPause", "", "newState", "onSheetStateChanged", "(I)V", "state", "", "shouldDismissSheetInState", "(I)Z", "tryResolveContainerHeight", "()Ljava/lang/Integer;", "Landroidx/lifecycle/LifecycleOwner;", "source", "Landroidx/lifecycle/Lifecycle$Event;", "event", "onStateChanged", "(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Lifecycle$Event;)V", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior;", "behavior", "Lcom/swmansion/rnscreens/KeyboardState;", "keyboardState", "selectedDetentIndex", "configureBottomSheetBehaviour$react_native_screens_release", "(Lcom/google/android/material/bottomsheet/BottomSheetBehavior;Lcom/swmansion/rnscreens/KeyboardState;I)Lcom/google/android/material/bottomsheet/BottomSheetBehavior;", "configureBottomSheetBehaviour", "v", "Landroidx/core/view/WindowInsetsCompat;", "insets", "onApplyWindowInsets", "(Landroid/view/View;Landroidx/core/view/WindowInsetsCompat;)Landroidx/core/view/WindowInsetsCompat;", "Lcom/swmansion/rnscreens/Screen;", "getScreen", "()Lcom/swmansion/rnscreens/Screen;", "isKeyboardVisible", "Z", "Lcom/swmansion/rnscreens/KeyboardState;", "value", "lastStableDetentIndex", "I", "getLastStableDetentIndex", "()I", "lastStableState", "getLastStableState", "getLastStableState$annotations", "Lcom/swmansion/rnscreens/bottomsheet/SheetDelegate$b;", "sheetStateObserver", "Lcom/swmansion/rnscreens/bottomsheet/SheetDelegate$b;", "Lcom/swmansion/rnscreens/bottomsheet/SheetDelegate$a;", "keyboardHandlerCallback", "Lcom/swmansion/rnscreens/bottomsheet/SheetDelegate$a;", "getSheetBehavior", "()Lcom/google/android/material/bottomsheet/BottomSheetBehavior;", "sheetBehavior", "Lcom/swmansion/rnscreens/ScreenStackFragment;", "getStackFragment", "()Lcom/swmansion/rnscreens/ScreenStackFragment;", "stackFragment", "Companion", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "b", "react-native-screens_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nSheetDelegate.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SheetDelegate.kt\ncom/swmansion/rnscreens/bottomsheet/SheetDelegate\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,370:1\n1#2:371\n*E\n"})
public final class SheetDelegate implements LifecycleEventObserver, OnApplyWindowInsetsListener {

    @NotNull
    public static final String TAG = "SheetDelegate";
    private boolean isKeyboardVisible;

    @NotNull
    private final C33476a keyboardHandlerCallback;

    @NotNull
    private KeyboardState keyboardState;
    private int lastStableDetentIndex;
    private int lastStableState;

    @NotNull
    private final Screen screen;

    @NotNull
    private final C33477b sheetStateObserver;

    /* JADX INFO: renamed from: com.swmansion.rnscreens.bottomsheet.SheetDelegate$a */
    /* JADX INFO: compiled from: SheetDelegate.kt */
    @Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\r\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m90084d2 = {"Lcom/swmansion/rnscreens/bottomsheet/SheetDelegate$a;", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior$BottomSheetCallback;", "<init>", "(Lcom/swmansion/rnscreens/bottomsheet/SheetDelegate;)V", "Landroid/view/View;", "bottomSheet", "", "newState", "", "onStateChanged", "(Landroid/view/View;I)V", "", "slideOffset", "onSlide", "(Landroid/view/View;F)V", "react-native-screens_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
    public final class C33476a extends BottomSheetBehavior.BottomSheetCallback {
        public C33476a() {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public void onSlide(@NotNull View bottomSheet, float slideOffset) {
            Intrinsics.checkNotNullParameter(bottomSheet, "bottomSheet");
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public void onStateChanged(@NotNull View bottomSheet, int newState) {
            Intrinsics.checkNotNullParameter(bottomSheet, "bottomSheet");
            if (newState == 4 && WindowInsetsCompat.toWindowInsetsCompat(bottomSheet.getRootWindowInsets()).isVisible(WindowInsetsCompat.Type.ime())) {
                bottomSheet.requestFocus();
                ((InputMethodManager) SheetDelegate.this.getScreen().getReactContext().getSystemService(InputMethodManager.class)).hideSoftInputFromWindow(bottomSheet.getWindowToken(), 0);
            }
        }
    }

    /* JADX INFO: renamed from: com.swmansion.rnscreens.bottomsheet.SheetDelegate$b */
    /* JADX INFO: compiled from: SheetDelegate.kt */
    @Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\r\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m90084d2 = {"Lcom/swmansion/rnscreens/bottomsheet/SheetDelegate$b;", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior$BottomSheetCallback;", "<init>", "(Lcom/swmansion/rnscreens/bottomsheet/SheetDelegate;)V", "Landroid/view/View;", "bottomSheet", "", "newState", "", "onStateChanged", "(Landroid/view/View;I)V", "", "slideOffset", "onSlide", "(Landroid/view/View;F)V", "react-native-screens_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
    public final class C33477b extends BottomSheetBehavior.BottomSheetCallback {
        public C33477b() {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public void onSlide(@NotNull View bottomSheet, float slideOffset) {
            Intrinsics.checkNotNullParameter(bottomSheet, "bottomSheet");
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public void onStateChanged(@NotNull View bottomSheet, int newState) {
            Intrinsics.checkNotNullParameter(bottomSheet, "bottomSheet");
            SheetDelegate.this.onSheetStateChanged(newState);
        }
    }

    private final boolean shouldDismissSheetInState(int state) {
        return state == 5;
    }

    /* JADX INFO: compiled from: SheetDelegate.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 0, 0}, m90088xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Lifecycle.Event.values().length];
            try {
                iArr[Lifecycle.Event.ON_START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Lifecycle.Event.ON_RESUME.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Lifecycle.Event.ON_PAUSE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: renamed from: configureBottomSheetBehaviour$react_native_screens_release$default */
    public static /* synthetic */ BottomSheetBehavior m72120xec3b14d9(SheetDelegate sheetDelegate, BottomSheetBehavior bottomSheetBehavior, KeyboardState keyboardState, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            keyboardState = KeyboardNotVisible.INSTANCE;
        }
        if ((i12 & 4) != 0) {
            i11 = sheetDelegate.lastStableDetentIndex;
        }
        return sheetDelegate.configureBottomSheetBehaviour$react_native_screens_release(bottomSheetBehavior, keyboardState, i11);
    }

    private final BottomSheetBehavior<Screen> getSheetBehavior() {
        return this.screen.getSheetBehavior();
    }

    private final ScreenStackFragment getStackFragment() {
        Fragment fragment = this.screen.getFragment();
        Intrinsics.checkNotNull(fragment, "null cannot be cast to non-null type com.swmansion.rnscreens.ScreenStackFragment");
        return (ScreenStackFragment) fragment;
    }

    private final void handleHostFragmentOnPause() {
        InsetsObserverProxy.INSTANCE.removeOnApplyWindowInsetsListener(this);
    }

    private final void handleHostFragmentOnResume() {
        InsetsObserverProxy.INSTANCE.addOnApplyWindowInsetsListener(this);
    }

    private final void handleHostFragmentOnStart() {
        InsetsObserverProxy.INSTANCE.registerOnView(requireDecorView());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onSheetStateChanged(int newState) {
        SheetUtils sheetUtils = SheetUtils.INSTANCE;
        boolean zIsStateStable = sheetUtils.isStateStable(newState);
        if (zIsStateStable) {
            this.lastStableState = newState;
            this.lastStableDetentIndex = sheetUtils.detentIndexFromSheetState(newState, this.screen.getSheetDetents().size());
        }
        this.screen.onSheetDetentChanged$react_native_screens_release(this.lastStableDetentIndex, zIsStateStable);
        if (shouldDismissSheetInState(newState)) {
            getStackFragment().dismissSelf$react_native_screens_release();
        }
    }

    private final View requireDecorView() {
        Activity currentActivity = this.screen.getReactContext().getCurrentActivity();
        if (currentActivity == null) {
            throw new IllegalStateException("[RNScreens] Attempt to access activity on detached context");
        }
        View decorView = currentActivity.getWindow().getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView, "getDecorView(...)");
        return decorView;
    }

    private final Integer tryResolveContainerHeight() {
        WindowMetrics currentWindowMetrics;
        Rect bounds;
        DisplayMetrics displayMetrics;
        ScreenContainer container = this.screen.getContainer();
        if (container != null) {
            return Integer.valueOf(container.getHeight());
        }
        ThemedReactContext reactContext = this.screen.getReactContext();
        Resources resources = reactContext.getResources();
        if (resources != null && (displayMetrics = resources.getDisplayMetrics()) != null) {
            return Integer.valueOf(displayMetrics.heightPixels);
        }
        if (Build.VERSION.SDK_INT >= 30) {
            Object systemService = reactContext.getSystemService(InterfaceC33953u5.f72199F);
            WindowManager windowManager = systemService instanceof WindowManager ? (WindowManager) systemService : null;
            if (windowManager != null && (currentWindowMetrics = windowManager.getCurrentWindowMetrics()) != null && (bounds = currentWindowMetrics.getBounds()) != null) {
                return Integer.valueOf(bounds.height());
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x014a  */
    @NotNull
    public final BottomSheetBehavior<Screen> configureBottomSheetBehaviour$react_native_screens_release(@NotNull BottomSheetBehavior<Screen> behavior, @NotNull KeyboardState keyboardState, int selectedDetentIndex) {
        Integer numValueOf;
        Intrinsics.checkNotNullParameter(behavior, "behavior");
        Intrinsics.checkNotNullParameter(keyboardState, "keyboardState");
        Integer numTryResolveContainerHeight = tryResolveContainerHeight();
        if (numTryResolveContainerHeight == null) {
            throw new IllegalStateException("[RNScreens] Failed to find window height during bottom sheet behaviour configuration");
        }
        behavior.setHideable(true);
        behavior.setDraggable(true);
        behavior.addBottomSheetCallback(this.sheetStateObserver);
        ScreenFooter footer = this.screen.getFooter();
        if (footer != null) {
            footer.registerWithSheetBehavior(behavior);
        }
        if (keyboardState instanceof KeyboardNotVisible) {
            int size = this.screen.getSheetDetents().size();
            if (size != 1) {
                if (size == 2) {
                    return BottomSheetBehaviorExtKt.useTwoDetents(behavior, Integer.valueOf(SheetUtils.INSTANCE.sheetStateFromDetentIndex(selectedDetentIndex, this.screen.getSheetDetents().size())), Integer.valueOf((int) (this.screen.getSheetDetents().get(0).doubleValue() * ((double) numTryResolveContainerHeight.intValue()))), Integer.valueOf((int) (this.screen.getSheetDetents().get(1).doubleValue() * ((double) numTryResolveContainerHeight.intValue()))));
                }
                if (size == 3) {
                    return BottomSheetBehaviorExtKt.useThreeDetents(behavior, Integer.valueOf(SheetUtils.INSTANCE.sheetStateFromDetentIndex(selectedDetentIndex, this.screen.getSheetDetents().size())), Integer.valueOf((int) (this.screen.getSheetDetents().get(0).doubleValue() * ((double) numTryResolveContainerHeight.intValue()))), Float.valueOf((float) (this.screen.getSheetDetents().get(1).doubleValue() / this.screen.getSheetDetents().get(2).doubleValue())), Integer.valueOf((int) ((((double) 1) - this.screen.getSheetDetents().get(2).doubleValue()) * ((double) numTryResolveContainerHeight.intValue()))));
                }
                throw new IllegalStateException("[RNScreens] Invalid detent count " + this.screen.getSheetDetents().size() + ". Expected at most 3.");
            }
            if (SheetUtilsKt.isSheetFitToContents(this.screen)) {
                ScreenContentWrapper contentWrapper = this.screen.getContentWrapper();
                if (contentWrapper != null) {
                    numValueOf = Integer.valueOf(contentWrapper.getHeight());
                    if (!SheetUtilsKt.isLaidOutOrHasCachedLayout(contentWrapper)) {
                        numValueOf = null;
                    }
                } else {
                    numValueOf = null;
                }
            } else {
                numValueOf = Integer.valueOf((int) (((Number) CollectionsKt.first((List) this.screen.getSheetDetents())).doubleValue() * ((double) numTryResolveContainerHeight.intValue())));
            }
            BottomSheetBehaviorExtKt.useSingleDetent$default(behavior, numValueOf, false, 2, null);
            return behavior;
        }
        if (!(keyboardState instanceof KeyboardVisible)) {
            if (!(keyboardState instanceof KeyboardDidHide)) {
                throw new NoWhenBranchMatchedException();
            }
            behavior.removeBottomSheetCallback(this.keyboardHandlerCallback);
            int size2 = this.screen.getSheetDetents().size();
            if (size2 == 1) {
                return BottomSheetBehaviorExtKt.useSingleDetent(behavior, Integer.valueOf((int) (((Number) CollectionsKt.first((List) this.screen.getSheetDetents())).doubleValue() * ((double) numTryResolveContainerHeight.intValue()))), false);
            }
            if (size2 == 2) {
                return BottomSheetBehaviorExtKt.useTwoDetents$default(behavior, null, Integer.valueOf((int) (this.screen.getSheetDetents().get(0).doubleValue() * ((double) numTryResolveContainerHeight.intValue()))), Integer.valueOf((int) (this.screen.getSheetDetents().get(1).doubleValue() * ((double) numTryResolveContainerHeight.intValue()))), 1, null);
            }
            if (size2 == 3) {
                return BottomSheetBehaviorExtKt.useThreeDetents$default(behavior, null, Integer.valueOf((int) (this.screen.getSheetDetents().get(0).doubleValue() * ((double) numTryResolveContainerHeight.intValue()))), Float.valueOf((float) (this.screen.getSheetDetents().get(1).doubleValue() / this.screen.getSheetDetents().get(2).doubleValue())), Integer.valueOf((int) ((((double) 1) - this.screen.getSheetDetents().get(2).doubleValue()) * ((double) numTryResolveContainerHeight.intValue()))), 1, null);
            }
            throw new IllegalStateException("[RNScreens] Invalid detent count " + this.screen.getSheetDetents().size() + ". Expected at most 3.");
        }
        int size3 = this.screen.getSheetDetents().size();
        if (size3 == 1) {
            behavior.addBottomSheetCallback(this.keyboardHandlerCallback);
            return behavior;
        }
        if (size3 == 2) {
            BottomSheetBehaviorExtKt.useTwoDetents$default(behavior, 3, null, null, 6, null);
            behavior.addBottomSheetCallback(this.keyboardHandlerCallback);
            return behavior;
        }
        if (size3 == 3) {
            BottomSheetBehaviorExtKt.useThreeDetents$default(behavior, 3, null, null, null, 14, null);
            behavior.addBottomSheetCallback(this.keyboardHandlerCallback);
            return behavior;
        }
        throw new IllegalStateException("[RNScreens] Invalid detent count " + this.screen.getSheetDetents().size() + ". Expected at most 3.");
    }

    public final int getLastStableDetentIndex() {
        return this.lastStableDetentIndex;
    }

    public final int getLastStableState() {
        return this.lastStableState;
    }

    @NotNull
    public final Screen getScreen() {
        return this.screen;
    }

    public SheetDelegate(@NotNull Screen screen) {
        Intrinsics.checkNotNullParameter(screen, "screen");
        this.screen = screen;
        this.keyboardState = KeyboardNotVisible.INSTANCE;
        this.lastStableDetentIndex = screen.getSheetInitialDetentIndex();
        this.lastStableState = SheetUtils.INSTANCE.sheetStateFromDetentIndex(screen.getSheetInitialDetentIndex(), screen.getSheetDetents().size());
        C33477b c33477b = new C33477b();
        this.sheetStateObserver = c33477b;
        this.keyboardHandlerCallback = new C33476a();
        boolean z11 = screen.getFragment() instanceof ScreenStackFragment;
        Fragment fragment = screen.getFragment();
        Intrinsics.checkNotNull(fragment);
        fragment.getLifecycle().addObserver(this);
        BottomSheetBehavior<Screen> sheetBehavior = getSheetBehavior();
        if (sheetBehavior != null) {
            sheetBehavior.addBottomSheetCallback(c33477b);
            return;
        }
        throw new IllegalStateException("[RNScreens] Sheet delegate accepts screen with initialized sheet behaviour only.");
    }

    @Override // androidx.core.view.OnApplyWindowInsetsListener
    @NotNull
    public WindowInsetsCompat onApplyWindowInsets(@NotNull View v11, @NotNull WindowInsetsCompat insets) {
        Intrinsics.checkNotNullParameter(v11, "v");
        Intrinsics.checkNotNullParameter(insets, "insets");
        boolean zIsVisible = insets.isVisible(WindowInsetsCompat.Type.ime());
        Insets insets2 = insets.getInsets(WindowInsetsCompat.Type.ime());
        Intrinsics.checkNotNullExpressionValue(insets2, "getInsets(...)");
        if (zIsVisible) {
            this.isKeyboardVisible = true;
            this.keyboardState = new KeyboardVisible(insets2.bottom);
            BottomSheetBehavior<Screen> sheetBehavior = getSheetBehavior();
            if (sheetBehavior != null) {
                m72120xec3b14d9(this, sheetBehavior, this.keyboardState, 0, 4, null);
            }
            Insets insets3 = insets.getInsets(WindowInsetsCompat.Type.navigationBars());
            Intrinsics.checkNotNullExpressionValue(insets3, "getInsets(...)");
            WindowInsetsCompat windowInsetsCompatBuild = new WindowInsetsCompat.Builder(insets).setInsets(WindowInsetsCompat.Type.navigationBars(), Insets.m2370of(insets3.left, insets3.top, insets3.right, 0)).build();
            Intrinsics.checkNotNullExpressionValue(windowInsetsCompatBuild, "build(...)");
            return windowInsetsCompatBuild;
        }
        BottomSheetBehavior<Screen> sheetBehavior2 = getSheetBehavior();
        if (sheetBehavior2 != null) {
            if (this.isKeyboardVisible) {
                m72120xec3b14d9(this, sheetBehavior2, KeyboardDidHide.INSTANCE, 0, 4, null);
            } else {
                KeyboardState keyboardState = this.keyboardState;
                KeyboardNotVisible keyboardNotVisible = KeyboardNotVisible.INSTANCE;
                if (!Intrinsics.areEqual(keyboardState, keyboardNotVisible)) {
                    m72120xec3b14d9(this, sheetBehavior2, keyboardNotVisible, 0, 4, null);
                }
            }
        }
        this.keyboardState = KeyboardNotVisible.INSTANCE;
        this.isKeyboardVisible = false;
        Insets insets4 = insets.getInsets(WindowInsetsCompat.Type.navigationBars());
        Intrinsics.checkNotNullExpressionValue(insets4, "getInsets(...)");
        WindowInsetsCompat windowInsetsCompatBuild2 = new WindowInsetsCompat.Builder(insets).setInsets(WindowInsetsCompat.Type.navigationBars(), Insets.m2370of(insets4.left, insets4.top, insets4.right, 0)).build();
        Intrinsics.checkNotNullExpressionValue(windowInsetsCompatBuild2, "build(...)");
        return windowInsetsCompatBuild2;
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(@NotNull LifecycleOwner source, @NotNull Lifecycle.Event event) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(event, "event");
        int i11 = WhenMappings.$EnumSwitchMapping$0[event.ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    return;
                }
                handleHostFragmentOnPause();
                return;
            }
            handleHostFragmentOnResume();
            return;
        }
        handleHostFragmentOnStart();
    }

    public static /* synthetic */ void getLastStableState$annotations() {
    }
}
