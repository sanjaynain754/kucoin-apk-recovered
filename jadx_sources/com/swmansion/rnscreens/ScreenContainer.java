package com.swmansion.rnscreens;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.Choreographer;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.inputmethod.InputMethodManager;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.facebook.react.ReactRootView;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.modules.core.ReactChoreographer;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.UIManagerHelper;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.swmansion.rnscreens.events.ScreenDismissedEvent;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.JvmField;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: ScreenContainer.kt */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0016\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J0\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0017H\u0014J\u0010\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J\b\u0010\u001e\u001a\u00020\u0014H\u0016J\u0006\u0010!\u001a\u00020\u0014J\u0010\u0010\"\u001a\u00020\b2\u0006\u0010#\u001a\u00020$H\u0014J\u0016\u0010%\u001a\u00020\u00142\u0006\u0010#\u001a\u00020$2\u0006\u0010&\u001a\u00020\u0017J\u0010\u0010'\u001a\u00020\u00142\u0006\u0010&\u001a\u00020\u0017H\u0016J\b\u0010(\u001a\u00020\u0014H\u0016J\u000e\u0010,\u001a\u00020$2\u0006\u0010&\u001a\u00020\u0017J\u000e\u0010-\u001a\u00020\b2\u0006\u0010&\u001a\u00020\u0017J\u0010\u00101\u001a\u00020\u00142\u0006\u00102\u001a\u00020\u000bH\u0002J\u0010\u00103\u001a\u00020\u000b2\u0006\u00104\u001a\u000205H\u0002J\b\u00106\u001a\u00020\u0014H\u0002J\b\u00107\u001a\u000208H\u0004J\u0018\u00109\u001a\u00020\u00142\u0006\u0010:\u001a\u0002082\u0006\u0010;\u001a\u00020<H\u0002J\u0006\u0010=\u001a\u00020\u0014J\u0006\u0010>\u001a\u00020\u0014J\u0006\u0010?\u001a\u00020\u0014J\u0018\u0010@\u001a\u00020\u00142\u0006\u0010:\u001a\u0002082\u0006\u0010;\u001a\u00020<H\u0002J\u0012\u0010A\u001a\u0004\u0018\u00010B2\u0006\u0010C\u001a\u00020\bH\u0002J\u0012\u0010D\u001a\u00020\r2\b\u0010C\u001a\u0004\u0018\u00010\bH\u0016J\b\u0010E\u001a\u00020\u0014H\u0014J\u0010\u0010F\u001a\u00020\u00142\u0006\u0010\n\u001a\u00020\u000bH\u0002J\b\u0010G\u001a\u00020\u0014H\u0014J\u0018\u0010H\u001a\u00020\u00142\u0006\u0010I\u001a\u00020\u00172\u0006\u0010J\u001a\u00020\u0017H\u0014J\b\u0010K\u001a\u00020\u0014H\u0002J\b\u0010L\u001a\u00020\u0014H\u0004J\u0006\u0010M\u001a\u00020\u0014J\b\u0010N\u001a\u00020\u0014H\u0016J\b\u0010O\u001a\u00020\u0014H\u0014R \u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00020\b`\t8\u0004X\u0085\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0004@\u0004X\u0085\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u001f\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0011\u0010)\u001a\u00020\u00178F¢\u0006\u0006\u001a\u0004\b*\u0010+R\u0016\u0010.\u001a\u0004\u0018\u00010$8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b/\u00100¨\u0006P"}, m90084d2 = {"Lcom/swmansion/rnscreens/ScreenContainer;", "Landroid/view/ViewGroup;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "screenWrappers", "Ljava/util/ArrayList;", "Lcom/swmansion/rnscreens/ScreenFragmentWrapper;", "Lkotlin/collections/ArrayList;", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "isAttached", "", "needsUpdate", "isLayoutEnqueued", "layoutCallback", "Landroid/view/Choreographer$FrameCallback;", "parentScreenWrapper", ViewProps.ON_LAYOUT, "", "changed", CmcdData.Factory.STREAM_TYPE_LIVE, "", "t", "r", "b", "removeView", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "requestLayout", "isNested", "()Z", "onChildUpdate", "adapt", "screen", "Lcom/swmansion/rnscreens/Screen;", "addScreen", "index", "removeScreenAt", "removeAllScreens", "screenCount", "getScreenCount", "()I", "getScreenAt", "getScreenFragmentWrapperAt", "topScreen", "getTopScreen", "()Lcom/swmansion/rnscreens/Screen;", "setFragmentManager", "fm", "findFragmentManagerForReactRootView", "rootView", "Lcom/facebook/react/ReactRootView;", "setupFragmentManager", "createTransaction", "Landroidx/fragment/app/FragmentTransaction;", "attachScreen", "transaction", "fragment", "Landroidx/fragment/app/Fragment;", "attachBelowTop", "detachBelowTop", "notifyTopDetached", "detachScreen", "getActivityState", "Lcom/swmansion/rnscreens/Screen$ActivityState;", "screenFragmentWrapper", "hasScreen", "onAttachedToWindow", "removeMyFragments", "onDetachedFromWindow", "onMeasure", "widthMeasureSpec", "heightMeasureSpec", "onScreenChanged", "performUpdatesNow", "performUpdates", "onUpdate", "notifyContainerUpdate", "react-native-screens_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nScreenContainer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScreenContainer.kt\ncom/swmansion/rnscreens/ScreenContainer\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,423:1\n295#2,2:424\n1#3:426\n37#4,2:427\n*S KotlinDebug\n*F\n+ 1 ScreenContainer.kt\ncom/swmansion/rnscreens/ScreenContainer\n*L\n133#1:424,2\n381#1:427,2\n*E\n"})
public class ScreenContainer extends ViewGroup {

    @JvmField
    @Nullable
    protected FragmentManager fragmentManager;
    private boolean isAttached;
    private boolean isLayoutEnqueued;

    @NotNull
    private final Choreographer.FrameCallback layoutCallback;
    private boolean needsUpdate;

    @Nullable
    private ScreenFragmentWrapper parentScreenWrapper;

    @JvmField
    @NotNull
    protected final ArrayList<ScreenFragmentWrapper> screenWrappers;

    private final void onScreenChanged() {
        this.needsUpdate = true;
        Context context = getContext();
        Intrinsics.checkNotNull(context, "null cannot be cast to non-null type com.facebook.react.uimanager.ThemedReactContext");
        ((ThemedReactContext) context).getReactApplicationContext().runOnUiQueueThread(new Runnable() { // from class: com.swmansion.rnscreens.d
            @Override // java.lang.Runnable
            public final void run() {
                this.f68441b.performUpdates();
            }
        });
    }

    private final void setupFragmentManager() {
        boolean z11;
        Unit unit;
        ViewParent parent = this;
        while (true) {
            z11 = parent instanceof ReactRootView;
            if (z11 || (parent instanceof Screen) || parent.getParent() == null) {
                break;
            } else {
                parent = parent.getParent();
            }
        }
        if (!(parent instanceof Screen)) {
            if (!z11) {
                throw new IllegalStateException("ScreenContainer is not attached under ReactRootView");
            }
            setFragmentManager(findFragmentManagerForReactRootView((ReactRootView) parent));
            return;
        }
        ScreenFragmentWrapper fragmentWrapper = ((Screen) parent).getFragmentWrapper();
        if (fragmentWrapper != null) {
            this.parentScreenWrapper = fragmentWrapper;
            fragmentWrapper.addChildScreenContainer(this);
            FragmentManager childFragmentManager = fragmentWrapper.getFragment().getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
            setFragmentManager(childFragmentManager);
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            throw new IllegalStateException("Parent Screen does not have its Fragment attached");
        }
    }

    public final void performUpdatesNow() {
        this.needsUpdate = true;
        performUpdates();
    }

    private final void setFragmentManager(FragmentManager fm2) {
        this.fragmentManager = fm2;
        performUpdatesNow();
    }

    public final void attachBelowTop() {
        if (this.screenWrappers.size() < 2) {
            throw new RuntimeException("[RNScreens] Unable to run transition for less than 2 screens.");
        }
        FragmentTransaction fragmentTransactionCreateTransaction = createTransaction();
        Screen topScreen = getTopScreen();
        Intrinsics.checkNotNull(topScreen, "null cannot be cast to non-null type com.swmansion.rnscreens.Screen");
        Fragment fragment = topScreen.getFragment();
        Intrinsics.checkNotNull(fragment, "null cannot be cast to non-null type androidx.fragment.app.Fragment");
        detachScreen(fragmentTransactionCreateTransaction, fragment);
        ArrayList<ScreenFragmentWrapper> arrayList = this.screenWrappers;
        attachScreen(fragmentTransactionCreateTransaction, arrayList.get(arrayList.size() - 2).getFragment());
        Fragment fragment2 = topScreen.getFragment();
        Intrinsics.checkNotNull(fragment2, "null cannot be cast to non-null type androidx.fragment.app.Fragment");
        attachScreen(fragmentTransactionCreateTransaction, fragment2);
        fragmentTransactionCreateTransaction.commitNowAllowingStateLoss();
    }

    @NotNull
    public final FragmentTransaction createTransaction() {
        FragmentManager fragmentManager = this.fragmentManager;
        if (fragmentManager == null) {
            throw new IllegalArgumentException("fragment manager is null when creating transaction");
        }
        FragmentTransaction reorderingAllowed = fragmentManager.beginTransaction().setReorderingAllowed(true);
        Intrinsics.checkNotNullExpressionValue(reorderingAllowed, "setReorderingAllowed(...)");
        return reorderingAllowed;
    }

    public final void detachBelowTop() {
        if (this.screenWrappers.size() < 2) {
            throw new RuntimeException("[RNScreens] Unable to run transition for less than 2 screens.");
        }
        FragmentTransaction fragmentTransactionCreateTransaction = createTransaction();
        ArrayList<ScreenFragmentWrapper> arrayList = this.screenWrappers;
        detachScreen(fragmentTransactionCreateTransaction, arrayList.get(arrayList.size() - 2).getFragment());
        fragmentTransactionCreateTransaction.commitNowAllowingStateLoss();
    }

    @NotNull
    public final Screen getScreenAt(int index) {
        return this.screenWrappers.get(index).getScreen();
    }

    public final int getScreenCount() {
        return this.screenWrappers.size();
    }

    @NotNull
    public final ScreenFragmentWrapper getScreenFragmentWrapperAt(int index) {
        ScreenFragmentWrapper screenFragmentWrapper = this.screenWrappers.get(index);
        Intrinsics.checkNotNullExpressionValue(screenFragmentWrapper, "get(...)");
        return screenFragmentWrapper;
    }

    @Nullable
    public Screen getTopScreen() {
        Object next;
        Iterator<T> it = this.screenWrappers.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (getActivityState((ScreenFragmentWrapper) next) != Screen.ActivityState.ON_TOP);
        ScreenFragmentWrapper screenFragmentWrapper = (ScreenFragmentWrapper) next;
        if (screenFragmentWrapper != null) {
            return screenFragmentWrapper.getScreen();
        }
        return null;
    }

    public boolean hasScreen(@Nullable ScreenFragmentWrapper screenFragmentWrapper) {
        return CollectionsKt.contains(this.screenWrappers, screenFragmentWrapper);
    }

    public final boolean isNested() {
        return this.parentScreenWrapper != null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        FragmentManager fragmentManager = this.fragmentManager;
        if (fragmentManager != null && !fragmentManager.isDestroyed()) {
            removeMyFragments(fragmentManager);
            fragmentManager.executePendingTransactions();
        }
        ScreenFragmentWrapper screenFragmentWrapper = this.parentScreenWrapper;
        if (screenFragmentWrapper != null) {
            screenFragmentWrapper.removeChildScreenContainer(this);
        }
        this.parentScreenWrapper = null;
        super.onDetachedFromWindow();
        this.isAttached = false;
        int childCount = getChildCount();
        while (true) {
            childCount--;
            if (-1 >= childCount) {
                return;
            } else {
                removeViewAt(childCount);
            }
        }
    }

    public final void performUpdates() {
        FragmentManager fragmentManager;
        if (this.needsUpdate && this.isAttached && (fragmentManager = this.fragmentManager) != null) {
            if (fragmentManager == null || !fragmentManager.isDestroyed()) {
                this.needsUpdate = false;
                onUpdate();
                notifyContainerUpdate();
            }
        }
    }

    public void removeAllScreens() {
        Iterator<ScreenFragmentWrapper> it = this.screenWrappers.iterator();
        Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
        while (it.hasNext()) {
            ScreenFragmentWrapper next = it.next();
            Intrinsics.checkNotNullExpressionValue(next, "next(...)");
            next.getScreen().setContainer(null);
        }
        this.screenWrappers.clear();
        onScreenChanged();
    }

    public void removeScreenAt(int index) {
        this.screenWrappers.get(index).getScreen().setContainer(null);
        this.screenWrappers.remove(index);
        onScreenChanged();
    }

    public ScreenContainer(@Nullable Context context) {
        super(context);
        this.screenWrappers = new ArrayList<>();
        this.layoutCallback = new Choreographer.FrameCallback() { // from class: com.swmansion.rnscreens.ScreenContainer$layoutCallback$1
            @Override // android.view.Choreographer.FrameCallback
            public void doFrame(long frameTimeNanos) {
                this.this$0.isLayoutEnqueued = false;
                ScreenContainer screenContainer = this.this$0;
                screenContainer.measure(View.MeasureSpec.makeMeasureSpec(screenContainer.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(this.this$0.getHeight(), 1073741824));
                ScreenContainer screenContainer2 = this.this$0;
                screenContainer2.layout(screenContainer2.getLeft(), this.this$0.getTop(), this.this$0.getRight(), this.this$0.getBottom());
            }
        };
    }

    private final void attachScreen(FragmentTransaction transaction, Fragment fragment) {
        transaction.add(getId(), fragment);
    }

    private final void detachScreen(FragmentTransaction transaction, Fragment fragment) {
        transaction.remove(fragment);
    }

    private final FragmentManager findFragmentManagerForReactRootView(ReactRootView rootView) {
        boolean z11;
        Context context = rootView.getContext();
        while (true) {
            z11 = context instanceof FragmentActivity;
            if (z11 || !(context instanceof ContextWrapper)) {
                break;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        if (z11) {
            FragmentActivity fragmentActivity = (FragmentActivity) context;
            if (fragmentActivity.getSupportFragmentManager().getFragments().isEmpty()) {
                FragmentManager supportFragmentManager = fragmentActivity.getSupportFragmentManager();
                Intrinsics.checkNotNull(supportFragmentManager);
                return supportFragmentManager;
            }
            try {
                return FragmentManager.findFragment(rootView).getChildFragmentManager();
            } catch (IllegalStateException unused) {
                return fragmentActivity.getSupportFragmentManager();
            }
        }
        throw new IllegalStateException("In order to use RNScreens components your app's activity need to extend ReactActivity");
    }

    private final Screen.ActivityState getActivityState(ScreenFragmentWrapper screenFragmentWrapper) {
        return screenFragmentWrapper.getScreen().getActivityState();
    }

    private final void removeMyFragments(FragmentManager fragmentManager) {
        FragmentTransaction fragmentTransactionBeginTransaction = fragmentManager.beginTransaction();
        Intrinsics.checkNotNullExpressionValue(fragmentTransactionBeginTransaction, "beginTransaction(...)");
        boolean z11 = false;
        for (Fragment fragment : fragmentManager.getFragments()) {
            if ((fragment instanceof ScreenFragment) && ((ScreenFragment) fragment).getScreen().getContainer() == this) {
                fragmentTransactionBeginTransaction.remove(fragment);
                z11 = true;
            }
        }
        if (z11) {
            fragmentTransactionBeginTransaction.commitNowAllowingStateLoss();
        }
    }

    @NotNull
    public ScreenFragmentWrapper adapt(@NotNull Screen screen) {
        Intrinsics.checkNotNullParameter(screen, "screen");
        return new ScreenFragment(screen);
    }

    public final void addScreen(@NotNull Screen screen, int index) {
        Intrinsics.checkNotNullParameter(screen, "screen");
        ScreenFragmentWrapper screenFragmentWrapperAdapt = adapt(screen);
        screen.setFragmentWrapper(screenFragmentWrapperAdapt);
        this.screenWrappers.add(index, screenFragmentWrapperAdapt);
        screen.setContainer(this);
        onScreenChanged();
    }

    public void notifyContainerUpdate() {
        ScreenFragmentWrapper fragmentWrapper;
        Screen topScreen = getTopScreen();
        if (topScreen != null && (fragmentWrapper = topScreen.getFragmentWrapper()) != null) {
            fragmentWrapper.onContainerUpdate();
        }
    }

    public final void notifyTopDetached() {
        Screen topScreen = getTopScreen();
        Intrinsics.checkNotNull(topScreen, "null cannot be cast to non-null type com.swmansion.rnscreens.Screen");
        if (getContext() instanceof ReactContext) {
            int surfaceId = UIManagerHelper.getSurfaceId(getContext());
            Context context = getContext();
            Intrinsics.checkNotNull(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
            EventDispatcher eventDispatcherForReactTag = UIManagerHelper.getEventDispatcherForReactTag((ReactContext) context, topScreen.getId());
            if (eventDispatcherForReactTag != null) {
                eventDispatcherForReactTag.dispatchEvent(new ScreenDismissedEvent(surfaceId, topScreen.getId()));
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.isAttached = true;
        setupFragmentManager();
    }

    public final void onChildUpdate() {
        performUpdatesNow();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean changed, int l11, int t11, int r11, int b11) {
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            getChildAt(i11).layout(0, 0, getWidth(), getHeight());
        }
    }

    @Override // android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            getChildAt(i11).measure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    public void onUpdate() {
        boolean z11;
        FragmentTransaction fragmentTransactionCreateTransaction = createTransaction();
        FragmentManager fragmentManager = this.fragmentManager;
        if (fragmentManager != null) {
            HashSet hashSet = new HashSet(fragmentManager.getFragments());
            Iterator<ScreenFragmentWrapper> it = this.screenWrappers.iterator();
            Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
            while (it.hasNext()) {
                ScreenFragmentWrapper next = it.next();
                Intrinsics.checkNotNullExpressionValue(next, "next(...)");
                ScreenFragmentWrapper screenFragmentWrapper = next;
                if (getActivityState(screenFragmentWrapper) == Screen.ActivityState.INACTIVE && screenFragmentWrapper.getFragment().isAdded()) {
                    detachScreen(fragmentTransactionCreateTransaction, screenFragmentWrapper.getFragment());
                }
                hashSet.remove(screenFragmentWrapper.getFragment());
            }
            boolean z12 = false;
            if (!hashSet.isEmpty()) {
                for (Fragment fragment : (Fragment[]) hashSet.toArray(new Fragment[0])) {
                    if ((fragment instanceof ScreenFragment) && ((ScreenFragment) fragment).getScreen().getContainer() == null) {
                        detachScreen(fragmentTransactionCreateTransaction, fragment);
                    }
                }
            }
            if (getTopScreen() == null) {
                z11 = true;
            } else {
                z11 = false;
            }
            ArrayList arrayList = new ArrayList();
            Iterator<ScreenFragmentWrapper> it2 = this.screenWrappers.iterator();
            Intrinsics.checkNotNullExpressionValue(it2, "iterator(...)");
            while (it2.hasNext()) {
                ScreenFragmentWrapper next2 = it2.next();
                Intrinsics.checkNotNullExpressionValue(next2, "next(...)");
                ScreenFragmentWrapper screenFragmentWrapper2 = next2;
                Screen.ActivityState activityState = getActivityState(screenFragmentWrapper2);
                Screen.ActivityState activityState2 = Screen.ActivityState.INACTIVE;
                if (activityState != activityState2 && !screenFragmentWrapper2.getFragment().isAdded()) {
                    attachScreen(fragmentTransactionCreateTransaction, screenFragmentWrapper2.getFragment());
                    z12 = true;
                } else if (activityState != activityState2 && z12) {
                    detachScreen(fragmentTransactionCreateTransaction, screenFragmentWrapper2.getFragment());
                    arrayList.add(screenFragmentWrapper2);
                }
                screenFragmentWrapper2.getScreen().setTransitioning(z11);
            }
            Iterator it3 = arrayList.iterator();
            Intrinsics.checkNotNullExpressionValue(it3, "iterator(...)");
            while (it3.hasNext()) {
                Object next3 = it3.next();
                Intrinsics.checkNotNullExpressionValue(next3, "next(...)");
                attachScreen(fragmentTransactionCreateTransaction, ((ScreenFragmentWrapper) next3).getFragment());
            }
            fragmentTransactionCreateTransaction.commitNowAllowingStateLoss();
            return;
        }
        throw new IllegalArgumentException("fragment manager is null when performing update in ScreenContainer");
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (view == getFocusedChild()) {
            Object systemService = getContext().getSystemService("input_method");
            Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
            ((InputMethodManager) systemService).hideSoftInputFromWindow(getWindowToken(), 2);
        }
        super.removeView(view);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        super.requestLayout();
        if (!this.isLayoutEnqueued && this.layoutCallback != null) {
            this.isLayoutEnqueued = true;
            ReactChoreographer.INSTANCE.getInstance().postFrameCallback(ReactChoreographer.CallbackType.NATIVE_ANIMATED_MODULE, this.layoutCallback);
        }
    }
}
