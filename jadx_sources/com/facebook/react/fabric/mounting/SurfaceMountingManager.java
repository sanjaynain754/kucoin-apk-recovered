package com.facebook.react.fabric.mounting;

import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.annotation.AnyThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.UiThread;
import androidx.collection.SparseArrayCompat;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.RetryableMountingLayerException;
import com.facebook.react.bridge.SoftAssertions;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.common.build.ReactBuildConfig;
import com.facebook.react.fabric.events.EventEmitterWrapper;
import com.facebook.react.fabric.mounting.mountitems.MountItem;
import com.facebook.react.internal.featureflags.ReactNativeFeatureFlags;
import com.facebook.react.touch.JSResponderHandler;
import com.facebook.react.uimanager.IViewGroupManager;
import com.facebook.react.uimanager.IllegalViewOperationException;
import com.facebook.react.uimanager.ReactOverflowViewWithInset;
import com.facebook.react.uimanager.ReactRoot;
import com.facebook.react.uimanager.ReactStylesDiffMap;
import com.facebook.react.uimanager.RootView;
import com.facebook.react.uimanager.RootViewManager;
import com.facebook.react.uimanager.StateWrapper;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.ViewManager;
import com.facebook.react.uimanager.ViewManagerRegistry;
import com.facebook.systrace.Systrace;
import java.util.ArrayDeque;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import p302h6.C38115a;
import p747x3.C45999a;

/* JADX INFO: loaded from: classes45.dex */
public class SurfaceMountingManager {
    private static final boolean SHOW_CHANGED_VIEW_HIERARCHIES;
    public static final String TAG = "SurfaceMountingManager";
    private JSResponderHandler mJSResponderHandler;
    private MountingManager.MountItemExecutor mMountItemExecutor;
    private RootViewManager mRootViewManager;
    private final int mSurfaceId;
    private SparseArrayCompat<Object> mTagSetForStoppedSurface;

    @Nullable
    private ThemedReactContext mThemedReactContext;
    private ViewManagerRegistry mViewManagerRegistry;
    private volatile boolean mIsStopped = false;
    private volatile boolean mRootViewAttached = false;
    private ConcurrentHashMap<Integer, ViewState> mTagToViewState = new ConcurrentHashMap<>();
    private Queue<MountItem> mOnViewAttachMountItems = new ArrayDeque();
    private final Set<Integer> mErroneouslyReaddedReactTags = new HashSet();
    private final Set<Integer> mViewsWithActiveTouches = new HashSet();
    private final Set<Integer> mViewsToDeleteAfterTouchFinishes = new HashSet();

    public static class PendingViewEvent {
        private final boolean mCanCoalesceEvent;
        private final int mEventCategory;
        private final String mEventName;

        @Nullable
        private final WritableMap mParams;

        public void dispatch(EventEmitterWrapper eventEmitterWrapper) {
            if (this.mCanCoalesceEvent) {
                eventEmitterWrapper.dispatchUnique(this.mEventName, this.mParams);
            } else {
                eventEmitterWrapper.dispatch(this.mEventName, this.mParams, this.mEventCategory);
            }
        }

        public PendingViewEvent(String str, @Nullable WritableMap writableMap, int i11, boolean z11) {
            this.mEventName = str;
            this.mParams = writableMap;
            this.mEventCategory = i11;
            this.mCanCoalesceEvent = z11;
        }
    }

    public static class ViewState {

        @Nullable
        ReadableMap mCurrentLocalData;

        @Nullable
        ReactStylesDiffMap mCurrentProps;

        @Nullable
        EventEmitterWrapper mEventEmitter;
        final boolean mIsRoot;

        @Nullable
        Queue<PendingViewEvent> mPendingEventQueue;
        final int mReactTag;

        @Nullable
        StateWrapper mStateWrapper;

        @Nullable
        View mView;

        @Nullable
        ViewManager mViewManager;

        @NonNull
        public String toString() {
            return "ViewState [" + this.mReactTag + "] - isRoot: " + this.mIsRoot + " - props: " + this.mCurrentProps + " - localData: " + this.mCurrentLocalData + " - viewManager: " + this.mViewManager + " - isLayoutOnly: " + (this.mViewManager == null);
        }

        private ViewState(int i11) {
            this(i11, null, null, false);
        }

        private ViewState(int i11, @Nullable View view, @Nullable ViewManager viewManager, boolean z11) {
            this.mCurrentProps = null;
            this.mCurrentLocalData = null;
            this.mStateWrapper = null;
            this.mEventEmitter = null;
            this.mPendingEventQueue = null;
            this.mReactTag = i11;
            this.mView = view;
            this.mIsRoot = z11;
            this.mViewManager = viewManager;
        }
    }

    @Deprecated
    public void receiveCommand(int i11, int i12, @Nullable ReadableArray readableArray) {
        if (isStopped()) {
            return;
        }
        ViewState nullableViewState = getNullableViewState(i11);
        if (nullableViewState == null) {
            throw new RetryableMountingLayerException("Unable to find viewState for tag: [" + i11 + "] for commandId: " + i12);
        }
        ViewManager viewManager = nullableViewState.mViewManager;
        if (viewManager == null) {
            throw new RetryableMountingLayerException("Unable to find viewManager for tag " + i11);
        }
        View view = nullableViewState.mView;
        if (view != null) {
            viewManager.receiveCommand(view, i12, readableArray);
            return;
        }
        throw new RetryableMountingLayerException("Unable to find viewState view for tag " + i11);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @UiThread
    public synchronized void setJSResponder(int i11, int i12, boolean z11) {
        UiThreadUtil.assertOnUiThread();
        if (isStopped()) {
            return;
        }
        if (!z11) {
            this.mJSResponderHandler.setJSResponder(i12, null);
            return;
        }
        ViewState viewState = getViewState(i11);
        View view = viewState.mView;
        if (i12 != i11 && (view instanceof ViewParent)) {
            this.mJSResponderHandler.setJSResponder(i12, (ViewParent) view);
            return;
        }
        if (view == 0) {
            SoftAssertions.assertUnreachable("Cannot find view for tag [" + i11 + "].");
            return;
        }
        if (viewState.mIsRoot) {
            SoftAssertions.assertUnreachable("Cannot block native responder on [" + i11 + "] that is a root view");
        }
        this.mJSResponderHandler.setJSResponder(i12, view.getParent());
    }

    static {
        ReactBuildConfig reactBuildConfig = ReactBuildConfig.INSTANCE;
        SHOW_CHANGED_VIEW_HIERARCHIES = false;
    }

    @UiThread
    private void executeMountItemsOnViewAttach() {
        this.mMountItemExecutor.executeItems(this.mOnViewAttachMountItems);
    }

    @Nullable
    private ViewState getNullableViewState(int i11) {
        ConcurrentHashMap<Integer, ViewState> concurrentHashMap = this.mTagToViewState;
        if (concurrentHashMap == null) {
            return null;
        }
        return concurrentHashMap.get(Integer.valueOf(i11));
    }

    @NonNull
    private static IViewGroupManager<ViewGroup> getViewGroupManager(@NonNull ViewState viewState) {
        NativeModule nativeModule = viewState.mViewManager;
        if (nativeModule != null) {
            return (IViewGroupManager) nativeModule;
        }
        throw new IllegalStateException("Unable to find ViewManager for view: " + viewState);
    }

    @NonNull
    private ViewState getViewState(int i11) {
        ViewState viewState = this.mTagToViewState.get(Integer.valueOf(i11));
        if (viewState != null) {
            return viewState;
        }
        throw new RetryableMountingLayerException("Unable to find viewState for tag " + i11 + ". Surface stopped: " + isStopped());
    }

    @UiThread
    private void onViewStateDeleted(ViewState viewState) {
        StateWrapper stateWrapper = viewState.mStateWrapper;
        if (stateWrapper != null) {
            stateWrapper.destroyState();
            viewState.mStateWrapper = null;
        }
        EventEmitterWrapper eventEmitterWrapper = viewState.mEventEmitter;
        if (eventEmitterWrapper != null) {
            eventEmitterWrapper.destroy();
            viewState.mEventEmitter = null;
        }
        ViewManager viewManager = viewState.mViewManager;
        if (viewState.mIsRoot || viewManager == null) {
            return;
        }
        viewManager.onDropViewInstance(viewState.mView);
    }

    public void attachRootView(View view, ThemedReactContext themedReactContext) {
        this.mThemedReactContext = themedReactContext;
        addRootView(view);
    }

    @UiThread
    public void createViewUnsafe(@NonNull String str, int i11, @Nullable ReadableMap readableMap, @Nullable StateWrapper stateWrapper, @Nullable EventEmitterWrapper eventEmitterWrapper, boolean z11) {
        Systrace.m10662c(0L, "SurfaceMountingManager::createViewUnsafe(" + str + ")");
        try {
            ReactStylesDiffMap reactStylesDiffMap = new ReactStylesDiffMap(readableMap);
            ViewState viewState = new ViewState(i11);
            viewState.mCurrentProps = reactStylesDiffMap;
            viewState.mStateWrapper = stateWrapper;
            viewState.mEventEmitter = eventEmitterWrapper;
            this.mTagToViewState.put(Integer.valueOf(i11), viewState);
            if (z11) {
                ViewManager viewManager = this.mViewManagerRegistry.get(str);
                viewState.mView = viewManager.createView(i11, this.mThemedReactContext, reactStylesDiffMap, stateWrapper, this.mJSResponderHandler);
                viewState.mViewManager = viewManager;
            }
        } finally {
            Systrace.m10667i(0L);
        }
    }

    @AnyThread
    public void enqueuePendingEvent(int i11, String str, boolean z11, @Nullable WritableMap writableMap, int i12) {
        final ViewState viewState;
        ConcurrentHashMap<Integer, ViewState> concurrentHashMap = this.mTagToViewState;
        if (concurrentHashMap == null || (viewState = concurrentHashMap.get(Integer.valueOf(i11))) == null) {
            return;
        }
        final PendingViewEvent pendingViewEvent = new PendingViewEvent(str, writableMap, i12, z11);
        UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.facebook.react.fabric.mounting.SurfaceMountingManager.3
            @Override // java.lang.Runnable
            public void run() {
                ViewState viewState2 = viewState;
                EventEmitterWrapper eventEmitterWrapper = viewState2.mEventEmitter;
                if (eventEmitterWrapper != null) {
                    pendingViewEvent.dispatch(eventEmitterWrapper);
                    return;
                }
                if (viewState2.mPendingEventQueue == null) {
                    viewState2.mPendingEventQueue = new LinkedList();
                }
                viewState.mPendingEventQueue.add(pendingViewEvent);
            }
        });
    }

    @Nullable
    public ThemedReactContext getContext() {
        return this.mThemedReactContext;
    }

    public int getSurfaceId() {
        return this.mSurfaceId;
    }

    public boolean getViewExists(int i11) {
        SparseArrayCompat<Object> sparseArrayCompat = this.mTagSetForStoppedSurface;
        if (sparseArrayCompat != null && sparseArrayCompat.containsKey(i11)) {
            return true;
        }
        ConcurrentHashMap<Integer, ViewState> concurrentHashMap = this.mTagToViewState;
        if (concurrentHashMap == null) {
            return false;
        }
        return concurrentHashMap.containsKey(Integer.valueOf(i11));
    }

    public boolean isRootViewAttached() {
        return this.mRootViewAttached;
    }

    public boolean isStopped() {
        return this.mIsStopped;
    }

    public void printSurfaceState() {
        C45999a.m101509o(TAG, "Views created for surface {%d}:", Integer.valueOf(getSurfaceId()));
        for (ViewState viewState : this.mTagToViewState.values()) {
            ViewManager viewManager = viewState.mViewManager;
            Integer numValueOf = null;
            String name = viewManager != null ? viewManager.getName() : null;
            View view = viewState.mView;
            View view2 = view != null ? (View) view.getParent() : null;
            if (view2 != null) {
                numValueOf = Integer.valueOf(view2.getId());
            }
            C45999a.m101509o(TAG, "<%s id=%d parentTag=%s isRoot=%b />", name, Integer.valueOf(viewState.mReactTag), numValueOf, Boolean.valueOf(viewState.mIsRoot));
        }
    }

    @UiThread
    public void scheduleMountItemOnViewAttach(MountItem mountItem) {
        this.mOnViewAttachMountItems.add(mountItem);
    }

    @AnyThread
    public void stopSurface() {
        C45999a.m101507m(TAG, "Stopping surface [" + this.mSurfaceId + "]");
        if (isStopped()) {
            return;
        }
        this.mIsStopped = true;
        for (ViewState viewState : this.mTagToViewState.values()) {
            StateWrapper stateWrapper = viewState.mStateWrapper;
            if (stateWrapper != null) {
                stateWrapper.destroyState();
                viewState.mStateWrapper = null;
            }
            EventEmitterWrapper eventEmitterWrapper = viewState.mEventEmitter;
            if (eventEmitterWrapper != null) {
                eventEmitterWrapper.destroy();
                viewState.mEventEmitter = null;
            }
        }
        Runnable runnable = new Runnable() { // from class: com.facebook.react.fabric.mounting.c
            @Override // java.lang.Runnable
            public final void run() {
                this.f9773b.lambda$stopSurface$1();
            }
        };
        if (UiThreadUtil.isOnUiThread()) {
            runnable.run();
        } else {
            UiThreadUtil.runOnUiThread(runnable);
        }
    }

    public SurfaceMountingManager(int i11, @NonNull JSResponderHandler jSResponderHandler, @NonNull ViewManagerRegistry viewManagerRegistry, @NonNull RootViewManager rootViewManager, @NonNull MountingManager.MountItemExecutor mountItemExecutor, @NonNull ThemedReactContext themedReactContext) {
        this.mSurfaceId = i11;
        this.mJSResponderHandler = jSResponderHandler;
        this.mViewManagerRegistry = viewManagerRegistry;
        this.mRootViewManager = rootViewManager;
        this.mMountItemExecutor = mountItemExecutor;
        this.mThemedReactContext = themedReactContext;
    }

    @AnyThread
    private void addRootView(@NonNull final View view) {
        if (isStopped()) {
            return;
        }
        this.mTagToViewState.put(Integer.valueOf(this.mSurfaceId), new ViewState(this.mSurfaceId, view, this.mRootViewManager, true));
        Runnable runnable = new Runnable() { // from class: com.facebook.react.fabric.mounting.b
            @Override // java.lang.Runnable
            public final void run() {
                this.f9771b.lambda$addRootView$0(view);
            }
        };
        if (UiThreadUtil.isOnUiThread()) {
            runnable.run();
        } else {
            UiThreadUtil.runOnUiThread(runnable);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ void lambda$addRootView$0(View view) {
        if (isStopped()) {
            return;
        }
        if (view.getId() == this.mSurfaceId) {
            ReactSoftExceptionLogger.logSoftException(TAG, new IllegalViewOperationException("Race condition in addRootView detected. Trying to set an id of [" + this.mSurfaceId + "] on the RootView, but that id has already been set. "));
        } else if (view.getId() != -1) {
            String str = TAG;
            C45999a.m101509o(str, "Trying to add RootTag to RootView that already has a tag: existing tag: [%d] new tag: [%d]", Integer.valueOf(view.getId()), Integer.valueOf(this.mSurfaceId));
            ReactSoftExceptionLogger.logSoftException(str, new IllegalViewOperationException("Trying to add a root view with an explicit id already set. React Native uses the id field to track react tags and will overwrite this field. If that is fine, explicitly overwrite the id field to View.NO_ID before calling addRootView."));
        }
        view.setId(this.mSurfaceId);
        if (view instanceof ReactRoot) {
            ((ReactRoot) view).setRootViewTag(this.mSurfaceId);
        }
        executeMountItemsOnViewAttach();
        this.mRootViewAttached = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$stopSurface$1() {
        if (ReactNativeFeatureFlags.enableViewRecycling()) {
            this.mViewManagerRegistry.onSurfaceStopped(this.mSurfaceId);
        }
        this.mTagSetForStoppedSurface = new SparseArrayCompat<>();
        for (Map.Entry<Integer, ViewState> entry : this.mTagToViewState.entrySet()) {
            this.mTagSetForStoppedSurface.put(entry.getKey().intValue(), this);
            onViewStateDeleted(entry.getValue());
        }
        this.mTagToViewState = null;
        this.mJSResponderHandler = null;
        this.mRootViewManager = null;
        this.mMountItemExecutor = null;
        this.mThemedReactContext = null;
        this.mOnViewAttachMountItems.clear();
        C45999a.m101507m(TAG, "Surface [" + this.mSurfaceId + "] was stopped on SurfaceMountingManager.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void logViewHierarchy(ViewGroup viewGroup, boolean z11) {
        ViewGroup viewGroup2;
        int id2;
        int id3 = viewGroup.getId();
        C45999a.m101507m(TAG, "  <ViewGroup tag=" + id3 + " class=" + viewGroup.getClass().toString() + ">");
        for (int i11 = 0; i11 < viewGroup.getChildCount(); i11++) {
            C45999a.m101507m(TAG, "     <View idx=" + i11 + " tag=" + viewGroup.getChildAt(i11).getId() + " class=" + viewGroup.getChildAt(i11).getClass().toString() + ">");
        }
        String str = TAG;
        C45999a.m101507m(str, "  </ViewGroup tag=" + id3 + ">");
        if (z11) {
            C45999a.m101507m(str, "Displaying Ancestors:");
            for (ViewParent parent = viewGroup.getParent(); parent != null; parent = parent.getParent()) {
                if (parent instanceof ViewGroup) {
                    viewGroup2 = (ViewGroup) parent;
                } else {
                    viewGroup2 = null;
                }
                if (viewGroup2 == null) {
                    id2 = -1;
                } else {
                    id2 = viewGroup2.getId();
                }
                C45999a.m101507m(TAG, "<ViewParent tag=" + id2 + " class=" + parent.getClass().toString() + ">");
            }
        }
    }

    @UiThread
    public void addViewAt(final int i11, final int i12, final int i13) {
        int id2;
        UiThreadUtil.assertOnUiThread();
        if (!isStopped()) {
            ViewState viewState = getViewState(i11);
            View view = viewState.mView;
            if (view instanceof ViewGroup) {
                final ViewGroup viewGroup = (ViewGroup) view;
                ViewState viewState2 = getViewState(i12);
                View view2 = viewState2.mView;
                if (view2 != null) {
                    boolean z11 = SHOW_CHANGED_VIEW_HIERARCHIES;
                    if (z11) {
                        C45999a.m101507m(TAG, "addViewAt: [" + i12 + "] -> [" + i11 + "] idx: " + i13 + " BEFORE");
                        logViewHierarchy(viewGroup, false);
                    }
                    ViewParent parent = view2.getParent();
                    if (parent != null) {
                        boolean z12 = parent instanceof ViewGroup;
                        if (z12) {
                            id2 = ((ViewGroup) parent).getId();
                        } else {
                            id2 = -1;
                        }
                        ReactSoftExceptionLogger.logSoftException(TAG, new IllegalStateException("addViewAt: cannot insert view [" + i12 + "] into parent [" + i11 + "]: View already has a parent: [" + id2 + "]  Parent: " + parent.getClass().getSimpleName() + " View: " + view2.getClass().getSimpleName()));
                        if (z12) {
                            ((ViewGroup) parent).removeView(view2);
                        }
                        this.mErroneouslyReaddedReactTags.add(Integer.valueOf(i12));
                    }
                    try {
                        getViewGroupManager(viewState).addView(viewGroup, view2, i13);
                        if (z11) {
                            UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.facebook.react.fabric.mounting.SurfaceMountingManager.1
                                @Override // java.lang.Runnable
                                public void run() {
                                    C45999a.m101507m(SurfaceMountingManager.TAG, "addViewAt: [" + i12 + "] -> [" + i11 + "] idx: " + i13 + " AFTER");
                                    SurfaceMountingManager.logViewHierarchy(viewGroup, false);
                                }
                            });
                            return;
                        }
                        return;
                    } catch (IllegalStateException | IndexOutOfBoundsException e11) {
                        throw new IllegalStateException("addViewAt: failed to insert view [" + i12 + "] into parent [" + i11 + "] at index " + i13, e11);
                    }
                }
                throw new IllegalStateException("Unable to find view for viewState " + viewState2 + " and tag " + i12);
            }
            String str = "Unable to add a view into a view that is not a ViewGroup. ParentTag: " + i11 + " - Tag: " + i12 + " - Index: " + i13;
            C45999a.m101507m(TAG, str);
            throw new IllegalStateException(str);
        }
    }

    @UiThread
    public void createView(@NonNull String str, int i11, @Nullable ReadableMap readableMap, @Nullable StateWrapper stateWrapper, @Nullable EventEmitterWrapper eventEmitterWrapper, boolean z11) {
        if (!isStopped()) {
            ViewState nullableViewState = getNullableViewState(i11);
            if (nullableViewState != null && nullableViewState.mView != null) {
                return;
            }
            createViewUnsafe(str, i11, readableMap, stateWrapper, eventEmitterWrapper, z11);
        }
    }

    @UiThread
    public void deleteView(int i11) {
        UiThreadUtil.assertOnUiThread();
        if (isStopped()) {
            return;
        }
        ViewState nullableViewState = getNullableViewState(i11);
        if (nullableViewState == null) {
            ReactSoftExceptionLogger.logSoftException(MountingManager.TAG, new IllegalStateException("Unable to find viewState for tag: " + i11 + " for deleteView"));
            return;
        }
        if (ReactNativeFeatureFlags.enableEventEmitterRetentionDuringGesturesOnAndroid() && this.mViewsWithActiveTouches.contains(Integer.valueOf(i11))) {
            this.mViewsToDeleteAfterTouchFinishes.add(Integer.valueOf(i11));
        } else {
            this.mTagToViewState.remove(Integer.valueOf(i11));
            onViewStateDeleted(nullableViewState);
        }
    }

    @Nullable
    @AnyThread
    public EventEmitterWrapper getEventEmitter(int i11) {
        ViewState nullableViewState = getNullableViewState(i11);
        if (nullableViewState == null) {
            return null;
        }
        return nullableViewState.mEventEmitter;
    }

    @UiThread
    public View getView(int i11) {
        View view;
        ViewState nullableViewState = getNullableViewState(i11);
        if (nullableViewState == null) {
            view = null;
        } else {
            view = nullableViewState.mView;
        }
        if (view != null) {
            return view;
        }
        throw new IllegalViewOperationException("Trying to resolve view with tag " + i11 + " which doesn't exist");
    }

    public void markActiveTouchForTag(int i11) {
        if (!ReactNativeFeatureFlags.enableEventEmitterRetentionDuringGesturesOnAndroid()) {
            return;
        }
        this.mViewsWithActiveTouches.add(Integer.valueOf(i11));
    }

    @UiThread
    public void preallocateView(@NonNull String str, int i11, @Nullable ReadableMap readableMap, @Nullable StateWrapper stateWrapper, boolean z11) {
        UiThreadUtil.assertOnUiThread();
        if (isStopped() || getNullableViewState(i11) != null) {
            return;
        }
        createViewUnsafe(str, i11, readableMap, stateWrapper, null, z11);
    }

    @UiThread
    public void removeViewAt(final int i11, final int i12, int i13) {
        int id2;
        final int i14;
        if (!isStopped()) {
            if (this.mErroneouslyReaddedReactTags.contains(Integer.valueOf(i11))) {
                ReactSoftExceptionLogger.logSoftException(TAG, new IllegalViewOperationException("removeViewAt tried to remove a React View that was actually reused. This indicates a bug in the Differ (specifically instruction ordering). [" + i11 + "]"));
                return;
            }
            UiThreadUtil.assertOnUiThread();
            ViewState nullableViewState = getNullableViewState(i12);
            if (nullableViewState == null) {
                ReactSoftExceptionLogger.logSoftException(MountingManager.TAG, new IllegalStateException("Unable to find viewState for tag: [" + i12 + "] for removeViewAt"));
                return;
            }
            View view = nullableViewState.mView;
            if (view instanceof ViewGroup) {
                final ViewGroup viewGroup = (ViewGroup) view;
                if (viewGroup != null) {
                    int i15 = 0;
                    if (SHOW_CHANGED_VIEW_HIERARCHIES) {
                        C45999a.m101507m(TAG, "removeViewAt: [" + i11 + "] -> [" + i12 + "] idx: " + i13 + " BEFORE");
                        logViewHierarchy(viewGroup, false);
                    }
                    IViewGroupManager<ViewGroup> viewGroupManager = getViewGroupManager(nullableViewState);
                    View childAt = viewGroupManager.getChildAt(viewGroup, i13);
                    if (childAt != null) {
                        id2 = childAt.getId();
                    } else {
                        id2 = -1;
                    }
                    if (id2 != i11) {
                        int childCount = viewGroup.getChildCount();
                        while (true) {
                            if (i15 < childCount) {
                                if (viewGroup.getChildAt(i15).getId() == i11) {
                                    break;
                                } else {
                                    i15++;
                                }
                            } else {
                                i15 = -1;
                                break;
                            }
                        }
                        if (i15 == -1) {
                            C45999a.m101507m(TAG, "removeViewAt: [" + i11 + "] -> [" + i12 + "] @" + i13 + ": view already removed from parent! Children in parent: " + childCount);
                            return;
                        }
                        logViewHierarchy(viewGroup, true);
                        ReactSoftExceptionLogger.logSoftException(TAG, new IllegalStateException("Tried to remove view [" + i11 + "] of parent [" + i12 + "] at index " + i13 + ", but got view tag " + id2 + " - actual index of view: " + i15));
                        i14 = i15;
                    } else {
                        i14 = i13;
                    }
                    try {
                        viewGroupManager.removeViewAt(viewGroup, i14);
                        if (SHOW_CHANGED_VIEW_HIERARCHIES) {
                            UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.facebook.react.fabric.mounting.SurfaceMountingManager.2
                                @Override // java.lang.Runnable
                                public void run() {
                                    C45999a.m101507m(SurfaceMountingManager.TAG, "removeViewAt: [" + i11 + "] -> [" + i12 + "] idx: " + i14 + " AFTER");
                                    SurfaceMountingManager.logViewHierarchy(viewGroup, false);
                                }
                            });
                            return;
                        }
                        return;
                    } catch (RuntimeException e11) {
                        int childCount2 = viewGroupManager.getChildCount(viewGroup);
                        logViewHierarchy(viewGroup, true);
                        throw new IllegalStateException("Cannot remove child at index " + i14 + " from parent ViewGroup [" + viewGroup.getId() + "], only " + childCount2 + " children in parent. Warning: childCount may be incorrect!", e11);
                    }
                }
                throw new IllegalStateException("Unable to find view for tag [" + i12 + "]");
            }
            String str = "Unable to remove a view from a view that is not a ViewGroup. ParentTag: " + i12 + " - Tag: " + i11 + " - Index: " + i13;
            C45999a.m101507m(TAG, str);
            throw new IllegalStateException(str);
        }
    }

    public void sendAccessibilityEvent(int i11, int i12) {
        if (isStopped()) {
            return;
        }
        ViewState viewState = getViewState(i11);
        if (viewState.mViewManager != null) {
            View view = viewState.mView;
            if (view != null) {
                view.sendAccessibilityEvent(i12);
                return;
            }
            throw new RetryableMountingLayerException("Unable to find viewState view for tag " + i11);
        }
        throw new RetryableMountingLayerException("Unable to find viewState manager for tag " + i11);
    }

    public void sweepActiveTouchForTag(int i11) {
        if (ReactNativeFeatureFlags.enableEventEmitterRetentionDuringGesturesOnAndroid()) {
            this.mViewsWithActiveTouches.remove(Integer.valueOf(i11));
            if (this.mViewsToDeleteAfterTouchFinishes.contains(Integer.valueOf(i11))) {
                this.mViewsToDeleteAfterTouchFinishes.remove(Integer.valueOf(i11));
                deleteView(i11);
            }
        }
    }

    @UiThread
    public void updateEventEmitter(int i11, @NonNull EventEmitterWrapper eventEmitterWrapper) {
        UiThreadUtil.assertOnUiThread();
        if (!isStopped()) {
            ViewState viewState = this.mTagToViewState.get(Integer.valueOf(i11));
            if (viewState == null) {
                viewState = new ViewState(i11);
                this.mTagToViewState.put(Integer.valueOf(i11), viewState);
            }
            EventEmitterWrapper eventEmitterWrapper2 = viewState.mEventEmitter;
            viewState.mEventEmitter = eventEmitterWrapper;
            if (eventEmitterWrapper2 != eventEmitterWrapper && eventEmitterWrapper2 != null) {
                eventEmitterWrapper2.destroy();
            }
            Queue<PendingViewEvent> queue = viewState.mPendingEventQueue;
            if (queue != null) {
                Iterator<PendingViewEvent> it = queue.iterator();
                while (it.hasNext()) {
                    it.next().dispatch(eventEmitterWrapper);
                }
                viewState.mPendingEventQueue = null;
            }
        }
    }

    @UiThread
    public void updateLayout(int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
        IViewGroupManager iViewGroupManager;
        if (!isStopped()) {
            ViewState viewState = getViewState(i11);
            if (!viewState.mIsRoot) {
                View view = viewState.mView;
                if (view != null) {
                    int i19 = 0;
                    int i21 = 1;
                    if (i18 == 1) {
                        i21 = 0;
                    } else if (i18 != 2) {
                        i21 = 2;
                    }
                    view.setLayoutDirection(i21);
                    view.measure(View.MeasureSpec.makeMeasureSpec(i15, 1073741824), View.MeasureSpec.makeMeasureSpec(i16, 1073741824));
                    ViewParent parent = view.getParent();
                    if (parent instanceof RootView) {
                        parent.requestLayout();
                    }
                    NativeModule nativeModule = getViewState(i12).mViewManager;
                    if (nativeModule != null) {
                        iViewGroupManager = (IViewGroupManager) nativeModule;
                    } else {
                        iViewGroupManager = null;
                    }
                    if (iViewGroupManager == null || !iViewGroupManager.needsCustomLayoutForChildren()) {
                        view.layout(i13, i14, i15 + i13, i16 + i14);
                    }
                    if (i17 == 0) {
                        i19 = 4;
                    }
                    if (view.getVisibility() != i19) {
                        view.setVisibility(i19);
                        return;
                    }
                    return;
                }
                throw new IllegalStateException("Unable to find View for tag: " + i11);
            }
        }
    }

    @UiThread
    public void updateOverflowInset(int i11, int i12, int i13, int i14, int i15) {
        if (!isStopped()) {
            ViewState viewState = getViewState(i11);
            if (!viewState.mIsRoot) {
                KeyEvent.Callback callback = viewState.mView;
                if (callback != null) {
                    if (callback instanceof ReactOverflowViewWithInset) {
                        ((ReactOverflowViewWithInset) callback).setOverflowInset(i12, i13, i14, i15);
                    }
                } else {
                    throw new IllegalStateException("Unable to find View for tag: " + i11);
                }
            }
        }
    }

    @UiThread
    public void updatePadding(int i11, int i12, int i13, int i14, int i15) {
        UiThreadUtil.assertOnUiThread();
        if (!isStopped()) {
            ViewState viewState = getViewState(i11);
            if (viewState.mIsRoot) {
                return;
            }
            View view = viewState.mView;
            if (view != null) {
                ViewManager viewManager = viewState.mViewManager;
                if (viewManager != null) {
                    viewManager.setPadding(view, i12, i13, i14, i15);
                    return;
                }
                throw new IllegalStateException("Unable to find ViewManager for view: " + viewState);
            }
            throw new IllegalStateException("Unable to find View for tag: " + i11);
        }
    }

    public void updateProps(int i11, ReadableMap readableMap) {
        if (isStopped()) {
            return;
        }
        ViewState viewState = getViewState(i11);
        viewState.mCurrentProps = new ReactStylesDiffMap(readableMap);
        View view = viewState.mView;
        if (view != null) {
            ((ViewManager) C38115a.m86047c(viewState.mViewManager)).updateProperties(view, viewState.mCurrentProps);
            return;
        }
        throw new IllegalStateException("Unable to find view for tag [" + i11 + "]");
    }

    @UiThread
    public void updateState(int i11, @Nullable StateWrapper stateWrapper) {
        UiThreadUtil.assertOnUiThread();
        if (!isStopped()) {
            ViewState viewState = getViewState(i11);
            StateWrapper stateWrapper2 = viewState.mStateWrapper;
            viewState.mStateWrapper = stateWrapper;
            ViewManager viewManager = viewState.mViewManager;
            if (viewManager != null) {
                Object objUpdateState = viewManager.updateState(viewState.mView, viewState.mCurrentProps, stateWrapper);
                if (objUpdateState != null) {
                    viewManager.updateExtraData(viewState.mView, objUpdateState);
                }
                if (stateWrapper2 != null) {
                    stateWrapper2.destroyState();
                    return;
                }
                return;
            }
            throw new IllegalStateException("Unable to find ViewManager for tag: " + i11);
        }
    }

    public void receiveCommand(int i11, @NonNull String str, @Nullable ReadableArray readableArray) {
        if (isStopped()) {
            return;
        }
        ViewState nullableViewState = getNullableViewState(i11);
        if (nullableViewState != null) {
            ViewManager viewManager = nullableViewState.mViewManager;
            if (viewManager != null) {
                View view = nullableViewState.mView;
                if (view != null) {
                    viewManager.receiveCommand(view, str, readableArray);
                    return;
                }
                throw new RetryableMountingLayerException("Unable to find viewState view for tag " + i11);
            }
            throw new RetryableMountingLayerException("Unable to find viewState manager for tag " + i11);
        }
        throw new RetryableMountingLayerException("Unable to find viewState for tag: " + i11 + " for commandId: " + str);
    }
}
