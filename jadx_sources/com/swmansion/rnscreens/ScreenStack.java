package com.swmansion.rnscreens;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Build;
import android.view.View;
import androidx.fragment.app.FragmentTransaction;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.devsupport.StackTraceHelper;
import com.facebook.react.uimanager.UIManagerHelper;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.swmansion.rnscreens.bottomsheet.SheetUtilsKt;
import com.swmansion.rnscreens.events.StackFinishTransitioningEvent;
import com.swmansion.rnscreens.stack.views.ChildrenDrawingOrderStrategy;
import com.swmansion.rnscreens.stack.views.ReverseFromIndex;
import com.swmansion.rnscreens.stack.views.ReverseOrder;
import com.swmansion.rnscreens.stack.views.ScreensCoordinatorLayout;
import com.swmansion.rnscreens.utils.FragmentTransactionKtKt;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.Ref;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.jvm.internal.TypeIntrinsics;
import p852kotlin.ranges.RangesKt;
import p852kotlin.sequences.Sequence;
import p852kotlin.sequences.SequencesKt;

/* JADX INFO: compiled from: ScreenStack.kt */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010#\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0006\u0018\u0000 F2\u00020\u0001:\u0002EFB\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\bJ\u0010\u0010(\u001a\u00020\b2\u0006\u0010)\u001a\u00020 H\u0014J\u0010\u0010*\u001a\u00020\u001d2\u0006\u0010+\u001a\u00020\u0016H\u0016J\u0010\u0010,\u001a\u00020\u001d2\u0006\u0010+\u001a\u00020\u0016H\u0016J\u0006\u0010-\u001a\u00020\u001dJ\b\u0010.\u001a\u00020\u001dH\u0002J\u0010\u0010/\u001a\u00020\u001d2\u0006\u00100\u001a\u000201H\u0016J\b\u00102\u001a\u00020\u001dH\u0016J\u0012\u00103\u001a\u00020\u00122\b\u00104\u001a\u0004\u0018\u000105H\u0016J\b\u00106\u001a\u00020\u001dH\u0016J\u0012\u00107\u001a\u00020\u001d2\b\u00108\u001a\u0004\u0018\u000105H\u0002J\b\u00109\u001a\u00020\u001dH\u0014J\b\u0010:\u001a\u00020\u001dH\u0002J\u0010\u0010;\u001a\u00020\u001d2\u0006\u0010<\u001a\u00020=H\u0014J \u0010>\u001a\u00020\u00122\u0006\u0010<\u001a\u00020=2\u0006\u0010?\u001a\u00020\u00162\u0006\u0010@\u001a\u00020AH\u0014J\u0014\u0010B\u001a\u00020\u001d2\n\u0010C\u001a\u00060\u000eR\u00020\u0000H\u0002J\f\u0010D\u001a\u00060\u000eR\u00020\u0000H\u0002R\u001e\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00020\b`\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\f\u001a\f\u0012\b\u0012\u00060\u000eR\u00020\u00000\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u000f\u001a\f\u0012\b\u0012\u00060\u000eR\u00020\u00000\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0017\u001a\u00020\u0012X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001f\u001a\u0004\u0018\u00010 8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"R!\u0010#\u001a\u0012\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00020\b`\t8F¢\u0006\u0006\u001a\u0004\b$\u0010%R\u0011\u0010&\u001a\u00020 8F¢\u0006\u0006\u001a\u0004\b'\u0010\"¨\u0006G"}, m90084d2 = {"Lcom/swmansion/rnscreens/ScreenStack;", "Lcom/swmansion/rnscreens/ScreenContainer;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", StackTraceHelper.STACK_KEY, "Ljava/util/ArrayList;", "Lcom/swmansion/rnscreens/ScreenStackFragmentWrapper;", "Lkotlin/collections/ArrayList;", "dismissedWrappers", "", "drawingOpPool", "", "Lcom/swmansion/rnscreens/ScreenStack$DrawingOp;", "drawingOps", "topScreenWrapper", "removalTransitionStarted", "", "childrenDrawingOrderStrategy", "Lcom/swmansion/rnscreens/stack/views/ChildrenDrawingOrderStrategy;", "disappearingTransitioningChildren", "Landroid/view/View;", "goingForward", "getGoingForward", "()Z", "setGoingForward", "(Z)V", "dismiss", "", "screenFragment", "topScreen", "Lcom/swmansion/rnscreens/Screen;", "getTopScreen", "()Lcom/swmansion/rnscreens/Screen;", "fragments", "getFragments", "()Ljava/util/ArrayList;", "rootScreen", "getRootScreen", "adapt", "screen", "startViewTransition", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "endViewTransition", "onViewAppearTransitionEnd", "dispatchOnFinishTransitioning", "removeScreenAt", "index", "", "removeAllScreens", "hasScreen", "screenFragmentWrapper", "Lcom/swmansion/rnscreens/ScreenFragmentWrapper;", "onUpdate", "turnOffA11yUnderTransparentScreen", "visibleBottom", "notifyContainerUpdate", "drawAndRelease", "dispatchDraw", "canvas", "Landroid/graphics/Canvas;", "drawChild", "child", "drawingTime", "", "performDraw", "op", "obtainDrawingOp", "DrawingOp", "Companion", "react-native-screens_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nScreenStack.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScreenStack.kt\ncom/swmansion/rnscreens/ScreenStack\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n*L\n1#1,376:1\n295#2,2:377\n1863#2,2:386\n1#3:379\n1317#4,2:380\n1317#4,2:382\n1317#4,2:384\n*S KotlinDebug\n*F\n+ 1 ScreenStack.kt\ncom/swmansion/rnscreens/ScreenStack\n*L\n53#1:377,2\n292#1:386,2\n229#1:380,2\n236#1:382,2\n244#1:384,2\n*E\n"})
public final class ScreenStack extends ScreenContainer {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final String TAG = "ScreenStack";

    @Nullable
    private ChildrenDrawingOrderStrategy childrenDrawingOrderStrategy;

    @NotNull
    private List<View> disappearingTransitioningChildren;

    @NotNull
    private final Set<ScreenStackFragmentWrapper> dismissedWrappers;

    @NotNull
    private final List<DrawingOp> drawingOpPool;

    @NotNull
    private List<DrawingOp> drawingOps;
    private boolean goingForward;
    private boolean removalTransitionStarted;

    @NotNull
    private final ArrayList<ScreenStackFragmentWrapper> stack;

    @Nullable
    private ScreenStackFragmentWrapper topScreenWrapper;

    /* JADX INFO: compiled from: ScreenStack.kt */
    @Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\f"}, m90084d2 = {"Lcom/swmansion/rnscreens/ScreenStack$Companion;", "", "<init>", "()V", "TAG", "", "needsDrawReordering", "", "fragmentWrapper", "Lcom/swmansion/rnscreens/ScreenFragmentWrapper;", "resolvedStackAnimation", "Lcom/swmansion/rnscreens/Screen$StackAnimation;", "react-native-screens_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean needsDrawReordering(ScreenFragmentWrapper fragmentWrapper, Screen.StackAnimation resolvedStackAnimation) {
            if (resolvedStackAnimation == null) {
                resolvedStackAnimation = fragmentWrapper.getScreen().getStackAnimation();
            }
            return (Build.VERSION.SDK_INT >= 33 || resolvedStackAnimation == Screen.StackAnimation.SLIDE_FROM_BOTTOM || resolvedStackAnimation == Screen.StackAnimation.FADE_FROM_BOTTOM || resolvedStackAnimation == Screen.StackAnimation.IOS_FROM_RIGHT || resolvedStackAnimation == Screen.StackAnimation.IOS_FROM_LEFT) && resolvedStackAnimation != Screen.StackAnimation.NONE;
        }
    }

    /* JADX INFO: compiled from: ScreenStack.kt */
    @Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\b\u0080\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0016\u001a\u00020\u0017R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006\u0018"}, m90084d2 = {"Lcom/swmansion/rnscreens/ScreenStack$DrawingOp;", "", "<init>", "(Lcom/swmansion/rnscreens/ScreenStack;)V", "canvas", "Landroid/graphics/Canvas;", "getCanvas", "()Landroid/graphics/Canvas;", "setCanvas", "(Landroid/graphics/Canvas;)V", "child", "Landroid/view/View;", "getChild", "()Landroid/view/View;", "setChild", "(Landroid/view/View;)V", "drawingTime", "", "getDrawingTime", "()J", "setDrawingTime", "(J)V", "draw", "", "react-native-screens_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
    public final class DrawingOp {

        @Nullable
        private Canvas canvas;

        @Nullable
        private View child;
        private long drawingTime;

        public DrawingOp() {
        }

        public final void draw() {
            ScreenStack.this.performDraw(this);
            this.canvas = null;
            this.child = null;
            this.drawingTime = 0L;
        }

        @Nullable
        public final Canvas getCanvas() {
            return this.canvas;
        }

        @Nullable
        public final View getChild() {
            return this.child;
        }

        public final long getDrawingTime() {
            return this.drawingTime;
        }

        public final void setCanvas(@Nullable Canvas canvas) {
            this.canvas = canvas;
        }

        public final void setChild(@Nullable View view) {
            this.child = view;
        }

        public final void setDrawingTime(long j11) {
            this.drawingTime = j11;
        }
    }

    /* JADX INFO: compiled from: ScreenStack.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 0, 0}, m90088xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Screen.StackPresentation.values().length];
            try {
                iArr[Screen.StackPresentation.FORM_SHEET.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private final void drawAndRelease() {
        List<DrawingOp> list = this.drawingOps;
        this.drawingOps = new ArrayList();
        for (DrawingOp drawingOp : list) {
            drawingOp.draw();
            this.drawingOpPool.add(drawingOp);
        }
    }

    private final DrawingOp obtainDrawingOp() {
        if (this.drawingOpPool.isEmpty()) {
            return new DrawingOp();
        }
        List<DrawingOp> list = this.drawingOpPool;
        return list.remove(CollectionsKt.getLastIndex(list));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean onUpdate$lambda$16$lambda$10(Ref.ObjectRef objectRef, ScreenStack screenStack, ScreenFragmentWrapper it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return !(it == objectRef.element || CollectionsKt.contains(screenStack.dismissedWrappers, it)) || it.getScreen().getActivityState() == Screen.ActivityState.INACTIVE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean onUpdate$lambda$16$lambda$12(Ref.ObjectRef objectRef, ScreenFragmentWrapper it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it != objectRef.element;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onUpdate$lambda$16$lambda$14$lambda$13(ScreenFragmentWrapper screenFragmentWrapper) {
        Screen screen;
        if (screenFragmentWrapper == null || (screen = screenFragmentWrapper.getScreen()) == null) {
            return;
        }
        screen.bringToFront();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ScreenStackFragmentWrapper onUpdate$lambda$16$lambda$15(ScreenFragmentWrapper it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (ScreenStackFragmentWrapper) it;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean onUpdate$lambda$16$lambda$9(Ref.ObjectRef objectRef, ScreenFragmentWrapper it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it != objectRef.element;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean onUpdate$lambda$2(ScreenStack screenStack, ScreenFragmentWrapper it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (CollectionsKt.contains(screenStack.dismissedWrappers, it) || it.getScreen().getActivityState() == Screen.ActivityState.INACTIVE) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean onUpdate$lambda$3(ScreenFragmentWrapper it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.isTranslucent();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean onUpdate$lambda$6(Ref.ObjectRef objectRef, ScreenStackFragmentWrapper it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it != objectRef.element && it.isTranslucent();
    }

    private final void turnOffA11yUnderTransparentScreen(ScreenFragmentWrapper visibleBottom) {
        ScreenStackFragmentWrapper screenStackFragmentWrapper;
        if (this.screenWrappers.size() > 1 && visibleBottom != null && (screenStackFragmentWrapper = this.topScreenWrapper) != null && screenStackFragmentWrapper.isTranslucent()) {
            ArrayList<ScreenFragmentWrapper> arrayList = this.screenWrappers;
            for (ScreenFragmentWrapper screenFragmentWrapper : CollectionsKt.asReversed(CollectionsKt.slice((List) arrayList, RangesKt.until(0, arrayList.size() - 1)))) {
                screenFragmentWrapper.getScreen().changeAccessibilityMode(4);
                if (Intrinsics.areEqual(screenFragmentWrapper, visibleBottom)) {
                    break;
                }
            }
        }
        Screen topScreen = getTopScreen();
        if (topScreen != null) {
            topScreen.changeAccessibilityMode(0);
        }
    }

    @Override // com.swmansion.rnscreens.ScreenContainer
    @NotNull
    public ScreenStackFragmentWrapper adapt(@NotNull Screen screen) {
        Intrinsics.checkNotNullParameter(screen, "screen");
        return WhenMappings.$EnumSwitchMapping$0[screen.getStackPresentation().ordinal()] == 1 ? new ScreenStackFragment(screen) : new ScreenStackFragment(screen);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.dispatchDraw(canvas);
        ChildrenDrawingOrderStrategy childrenDrawingOrderStrategy = this.childrenDrawingOrderStrategy;
        if (childrenDrawingOrderStrategy != null) {
            childrenDrawingOrderStrategy.apply(this.drawingOps);
        }
        drawAndRelease();
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(@NotNull Canvas canvas, @NotNull View child, long drawingTime) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(child, "child");
        List<DrawingOp> list = this.drawingOps;
        DrawingOp drawingOpObtainDrawingOp = obtainDrawingOp();
        drawingOpObtainDrawingOp.setCanvas(canvas);
        drawingOpObtainDrawingOp.setChild(child);
        drawingOpObtainDrawingOp.setDrawingTime(drawingTime);
        list.add(drawingOpObtainDrawingOp);
        return true;
    }

    @NotNull
    public final ArrayList<ScreenStackFragmentWrapper> getFragments() {
        return this.stack;
    }

    public final boolean getGoingForward() {
        return this.goingForward;
    }

    @NotNull
    public final Screen getRootScreen() {
        Object next;
        Screen screen;
        Iterator<T> it = this.screenWrappers.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (CollectionsKt.contains(this.dismissedWrappers, (ScreenFragmentWrapper) next));
        ScreenFragmentWrapper screenFragmentWrapper = (ScreenFragmentWrapper) next;
        if (screenFragmentWrapper == null || (screen = screenFragmentWrapper.getScreen()) == null) {
            throw new IllegalStateException("[RNScreens] Stack has no root screen set");
        }
        return screen;
    }

    @Override // com.swmansion.rnscreens.ScreenContainer
    @Nullable
    public Screen getTopScreen() {
        ScreenStackFragmentWrapper screenStackFragmentWrapper = this.topScreenWrapper;
        if (screenStackFragmentWrapper != null) {
            return screenStackFragmentWrapper.getScreen();
        }
        return null;
    }

    @Override // com.swmansion.rnscreens.ScreenContainer
    public void notifyContainerUpdate() {
        Iterator<T> it = this.stack.iterator();
        while (it.hasNext()) {
            ((ScreenStackFragmentWrapper) it.next()).onContainerUpdate();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [T, java.lang.Object] */
    @Override // com.swmansion.rnscreens.ScreenContainer
    public void onUpdate() {
        T t11;
        Screen.StackAnimation stackAnimation;
        boolean z11;
        Screen screen;
        ScreenStackFragmentWrapper screenStackFragmentWrapper;
        int iCount;
        T t12;
        Screen screen2;
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        final Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
        this.childrenDrawingOrderStrategy = null;
        Sequence sequenceFilter = SequencesKt.filter(CollectionsKt.asSequence(CollectionsKt.asReversedMutable(this.screenWrappers)), new Function1() { // from class: com.swmansion.rnscreens.f
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(ScreenStack.onUpdate$lambda$2(this.f68448b, (ScreenFragmentWrapper) obj));
            }
        });
        objectRef.element = SequencesKt.firstOrNull(sequenceFilter);
        ScreenFragmentWrapper screenFragmentWrapper = (ScreenFragmentWrapper) SequencesKt.firstOrNull(SequencesKt.dropWhile(sequenceFilter, new Function1() { // from class: com.swmansion.rnscreens.g
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(ScreenStack.onUpdate$lambda$3((ScreenFragmentWrapper) obj));
            }
        }));
        if (screenFragmentWrapper == null || screenFragmentWrapper == objectRef.element) {
            t11 = screenFragmentWrapper;
            t11 = 0;
        }
        t11 = screenFragmentWrapper;
        objectRef2.element = t11;
        boolean zContains = CollectionsKt.contains(this.stack, objectRef.element);
        T t13 = objectRef.element;
        ScreenStackFragmentWrapper screenStackFragmentWrapper2 = this.topScreenWrapper;
        boolean z12 = t13 != screenStackFragmentWrapper2;
        if (t13 == 0 || zContains) {
            if (t13 == 0 || screenStackFragmentWrapper2 == null || !z12) {
                stackAnimation = null;
                z11 = true;
            } else {
                stackAnimation = (screenStackFragmentWrapper2 == null || (screen = screenStackFragmentWrapper2.getScreen()) == null) ? null : screen.getStackAnimation();
                z11 = false;
            }
        } else if (screenStackFragmentWrapper2 != null) {
            z11 = (screenStackFragmentWrapper2 != null && this.screenWrappers.contains(screenStackFragmentWrapper2)) || (((ScreenFragmentWrapper) objectRef.element).getScreen().getReplaceAnimation() == Screen.ReplaceAnimation.PUSH);
            if (z11) {
                screen2 = ((ScreenFragmentWrapper) objectRef.element).getScreen();
            } else {
                ScreenStackFragmentWrapper screenStackFragmentWrapper3 = this.topScreenWrapper;
                if (screenStackFragmentWrapper3 == null || (screen2 = screenStackFragmentWrapper3.getScreen()) == null) {
                    stackAnimation = null;
                }
            }
            stackAnimation = screen2.getStackAnimation();
        } else {
            stackAnimation = Screen.StackAnimation.NONE;
            this.goingForward = true;
            z11 = true;
        }
        this.goingForward = z11;
        if (z11 && (t12 = objectRef.element) != 0 && INSTANCE.needsDrawReordering((ScreenFragmentWrapper) t12, stackAnimation) && objectRef2.element == 0) {
            this.childrenDrawingOrderStrategy = new ReverseOrder();
        } else if (objectRef.element != 0 && zContains && (screenStackFragmentWrapper = this.topScreenWrapper) != null && screenStackFragmentWrapper.isTranslucent() && !((ScreenFragmentWrapper) objectRef.element).isTranslucent() && (iCount = SequencesKt.count(SequencesKt.takeWhile(CollectionsKt.asSequence(CollectionsKt.asReversedMutable(this.stack)), new Function1() { // from class: com.swmansion.rnscreens.h
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(ScreenStack.onUpdate$lambda$6(objectRef, (ScreenStackFragmentWrapper) obj));
            }
        }))) > 1) {
            this.childrenDrawingOrderStrategy = new ReverseFromIndex(Math.max((CollectionsKt.getLastIndex(this.stack) - iCount) + 1, 0));
        }
        FragmentTransaction fragmentTransactionCreateTransaction = createTransaction();
        if (stackAnimation != null) {
            FragmentTransactionKtKt.setTweenAnimations(fragmentTransactionCreateTransaction, stackAnimation, z11);
        }
        Iterator it = SequencesKt.filter(CollectionsKt.asSequence(this.stack), new Function1() { // from class: com.swmansion.rnscreens.i
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(ScreenStack.onUpdate$lambda$16$lambda$7(this.f68451b, (ScreenStackFragmentWrapper) obj));
            }
        }).iterator();
        while (it.hasNext()) {
            fragmentTransactionCreateTransaction.remove(((ScreenStackFragmentWrapper) it.next()).getFragment());
        }
        Iterator it2 = SequencesKt.filter(SequencesKt.takeWhile(CollectionsKt.asSequence(this.screenWrappers), new Function1() { // from class: com.swmansion.rnscreens.j
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(ScreenStack.onUpdate$lambda$16$lambda$9(objectRef2, (ScreenFragmentWrapper) obj));
            }
        }), new Function1() { // from class: com.swmansion.rnscreens.k
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(ScreenStack.onUpdate$lambda$16$lambda$10(objectRef, this, (ScreenFragmentWrapper) obj));
            }
        }).iterator();
        while (it2.hasNext()) {
            fragmentTransactionCreateTransaction.remove(((ScreenFragmentWrapper) it2.next()).getFragment());
        }
        T t14 = objectRef2.element;
        if (t14 == 0 || ((ScreenFragmentWrapper) t14).getFragment().isAdded()) {
            T t15 = objectRef.element;
            if (t15 != 0 && !((ScreenFragmentWrapper) t15).getFragment().isAdded()) {
                if (SheetUtilsKt.requiresEnterTransitionPostponing(((ScreenFragmentWrapper) objectRef.element).getScreen())) {
                    ((ScreenFragmentWrapper) objectRef.element).getFragment().postponeEnterTransition();
                }
                fragmentTransactionCreateTransaction.add(getId(), ((ScreenFragmentWrapper) objectRef.element).getFragment());
            }
        } else {
            final ScreenFragmentWrapper screenFragmentWrapper2 = (ScreenFragmentWrapper) objectRef.element;
            Iterator it3 = SequencesKt.dropWhile(CollectionsKt.asSequence(this.screenWrappers), new Function1() { // from class: com.swmansion.rnscreens.l
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Boolean.valueOf(ScreenStack.onUpdate$lambda$16$lambda$12(objectRef2, (ScreenFragmentWrapper) obj));
                }
            }).iterator();
            while (it3.hasNext()) {
                fragmentTransactionCreateTransaction.add(getId(), ((ScreenFragmentWrapper) it3.next()).getFragment()).runOnCommit(new Runnable() { // from class: com.swmansion.rnscreens.m
                    @Override // java.lang.Runnable
                    public final void run() {
                        ScreenStack.onUpdate$lambda$16$lambda$14$lambda$13(screenFragmentWrapper2);
                    }
                });
            }
        }
        T t16 = objectRef.element;
        this.topScreenWrapper = t16 instanceof ScreenStackFragmentWrapper ? (ScreenStackFragmentWrapper) t16 : null;
        this.stack.clear();
        CollectionsKt.addAll(this.stack, SequencesKt.map(CollectionsKt.asSequence(this.screenWrappers), new Function1() { // from class: com.swmansion.rnscreens.n
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ScreenStack.onUpdate$lambda$16$lambda$15((ScreenFragmentWrapper) obj);
            }
        }));
        turnOffA11yUnderTransparentScreen((ScreenFragmentWrapper) objectRef2.element);
        fragmentTransactionCreateTransaction.commitNowAllowingStateLoss();
    }

    public final void onViewAppearTransitionEnd() {
        if (this.removalTransitionStarted) {
            return;
        }
        dispatchOnFinishTransitioning();
    }

    @Override // com.swmansion.rnscreens.ScreenContainer
    public void removeAllScreens() {
        this.dismissedWrappers.clear();
        super.removeAllScreens();
    }

    @Override // com.swmansion.rnscreens.ScreenContainer
    public void removeScreenAt(int index) {
        Set<ScreenStackFragmentWrapper> set = this.dismissedWrappers;
        TypeIntrinsics.asMutableCollection(set).remove(getScreenFragmentWrapperAt(index));
        super.removeScreenAt(index);
    }

    public final void setGoingForward(boolean z11) {
        this.goingForward = z11;
    }

    public ScreenStack(@Nullable Context context) {
        super(context);
        this.stack = new ArrayList<>();
        this.dismissedWrappers = new HashSet();
        this.drawingOpPool = new ArrayList();
        this.drawingOps = new ArrayList();
        this.disappearingTransitioningChildren = new ArrayList();
    }

    private final void dispatchOnFinishTransitioning() {
        int surfaceId = UIManagerHelper.getSurfaceId(this);
        Context context = getContext();
        Intrinsics.checkNotNull(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
        EventDispatcher eventDispatcherForReactTag = UIManagerHelper.getEventDispatcherForReactTag((ReactContext) context, getId());
        if (eventDispatcherForReactTag != null) {
            eventDispatcherForReactTag.dispatchEvent(new StackFinishTransitioningEvent(surfaceId, getId()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean onUpdate$lambda$16$lambda$7(ScreenStack screenStack, ScreenStackFragmentWrapper wrapper) {
        Intrinsics.checkNotNullParameter(wrapper, "wrapper");
        if (screenStack.screenWrappers.contains(wrapper) && !screenStack.dismissedWrappers.contains(wrapper)) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void performDraw(DrawingOp op2) {
        Canvas canvas = op2.getCanvas();
        Intrinsics.checkNotNull(canvas);
        super.drawChild(canvas, op2.getChild(), op2.getDrawingTime());
    }

    public final void dismiss(@NotNull ScreenStackFragmentWrapper screenFragment) {
        Intrinsics.checkNotNullParameter(screenFragment, "screenFragment");
        this.dismissedWrappers.add(screenFragment);
        performUpdatesNow();
    }

    @Override // android.view.ViewGroup
    public void endViewTransition(@NotNull View view) {
        ChildrenDrawingOrderStrategy childrenDrawingOrderStrategy;
        Intrinsics.checkNotNullParameter(view, "view");
        super.endViewTransition(view);
        this.disappearingTransitioningChildren.remove(view);
        if (this.disappearingTransitioningChildren.isEmpty() && (childrenDrawingOrderStrategy = this.childrenDrawingOrderStrategy) != null) {
            childrenDrawingOrderStrategy.disable();
        }
        if (this.removalTransitionStarted) {
            this.removalTransitionStarted = false;
            dispatchOnFinishTransitioning();
        }
    }

    @Override // com.swmansion.rnscreens.ScreenContainer
    public boolean hasScreen(@Nullable ScreenFragmentWrapper screenFragmentWrapper) {
        if (super.hasScreen(screenFragmentWrapper) && !CollectionsKt.contains(this.dismissedWrappers, screenFragmentWrapper)) {
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public void startViewTransition(@NotNull View view) {
        ChildrenDrawingOrderStrategy childrenDrawingOrderStrategy;
        Intrinsics.checkNotNullParameter(view, "view");
        if (view instanceof ScreensCoordinatorLayout) {
            super.startViewTransition(view);
            if (((ScreensCoordinatorLayout) view).getFragment().isRemoving()) {
                this.disappearingTransitioningChildren.add(view);
            }
            if (!this.disappearingTransitioningChildren.isEmpty() && (childrenDrawingOrderStrategy = this.childrenDrawingOrderStrategy) != null) {
                childrenDrawingOrderStrategy.enable();
            }
            this.removalTransitionStarted = true;
            return;
        }
        throw new IllegalStateException(("[RNScreens] Unexpected type of ScreenStack direct subview " + view.getClass()).toString());
    }
}
