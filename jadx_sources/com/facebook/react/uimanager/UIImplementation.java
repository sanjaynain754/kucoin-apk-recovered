package com.facebook.react.uimanager;

import android.os.SystemClock;
import android.view.View;
import androidx.annotation.Nullable;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.common.ReactConstants;
import com.facebook.react.common.build.ReactBuildConfig;
import com.facebook.react.modules.i18nmanager.I18nUtil;
import com.facebook.react.uimanager.debug.NotThreadSafeViewHierarchyUpdateDebugListener;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.facebook.systrace.Systrace;
import com.facebook.yoga.YogaDirection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p053c7.C4858a;
import p302h6.C38115a;
import p747x3.C45999a;

/* JADX INFO: loaded from: classes45.dex */
public class UIImplementation {
    protected final EventDispatcher mEventDispatcher;
    private long mLastCalculateLayoutTime;

    @Nullable
    protected LayoutUpdateListener mLayoutUpdateListener;
    private final int[] mMeasureBuffer;
    private final NativeViewHierarchyOptimizer mNativeViewHierarchyOptimizer;
    private final UIViewOperationQueue mOperationsQueue;
    protected final ReactApplicationContext mReactContext;
    protected final ShadowNodeRegistry mShadowNodeRegistry;
    private final ViewManagerRegistry mViewManagers;
    private volatile boolean mViewOperationsEnabled;
    protected Object uiImplementationThreadLock;

    public interface LayoutUpdateListener {
        void onLayoutUpdated(ReactShadowNode reactShadowNode);
    }

    public UIImplementation(ReactApplicationContext reactApplicationContext, ViewManagerRegistry viewManagerRegistry, EventDispatcher eventDispatcher, int i11) {
        this(reactApplicationContext, viewManagerRegistry, new UIViewOperationQueue(reactApplicationContext, new NativeViewHierarchyManager(viewManagerRegistry), i11), eventDispatcher);
    }

    private void measureLayoutRelativeToVerifiedAncestor(ReactShadowNode reactShadowNode, ReactShadowNode reactShadowNode2, int[] iArr) {
        int iRound;
        int iRound2;
        if (reactShadowNode == reactShadowNode2 || reactShadowNode.isVirtual()) {
            iRound = 0;
            iRound2 = 0;
        } else {
            iRound = Math.round(reactShadowNode.getLayoutX());
            iRound2 = Math.round(reactShadowNode.getLayoutY());
            for (ReactShadowNode parent = reactShadowNode.getParent(); parent != reactShadowNode2; parent = parent.getParent()) {
                C38115a.m86047c(parent);
                assertNodeDoesNotNeedCustomLayoutForChildren(parent);
                iRound += Math.round(parent.getLayoutX());
                iRound2 += Math.round(parent.getLayoutY());
            }
            assertNodeDoesNotNeedCustomLayoutForChildren(reactShadowNode2);
        }
        iArr[0] = iRound;
        iArr[1] = iRound2;
        iArr[2] = reactShadowNode.getScreenWidth();
        iArr[3] = reactShadowNode.getScreenHeight();
    }

    @Deprecated
    public void dispatchViewManagerCommand(int i11, int i12, @Nullable ReadableArray readableArray) {
        if (checkOrAssertViewExists(i11, "dispatchViewManagerCommand: " + i12)) {
            this.mOperationsQueue.enqueueDispatchCommand(i11, i12, readableArray);
        }
    }

    public void measureLayout(int i11, int i12, Callback callback, Callback callback2) {
        if (this.mViewOperationsEnabled) {
            try {
                measureLayout(i11, i12, this.mMeasureBuffer);
                callback2.invoke(Float.valueOf(PixelUtil.toDIPFromPixel(this.mMeasureBuffer[0])), Float.valueOf(PixelUtil.toDIPFromPixel(this.mMeasureBuffer[1])), Float.valueOf(PixelUtil.toDIPFromPixel(this.mMeasureBuffer[2])), Float.valueOf(PixelUtil.toDIPFromPixel(this.mMeasureBuffer[3])));
            } catch (IllegalViewOperationException e11) {
                callback.invoke(e11.getMessage());
            }
        }
    }

    public void measureLayoutRelativeToParent(int i11, Callback callback, Callback callback2) {
        if (this.mViewOperationsEnabled) {
            try {
                measureLayoutRelativeToParent(i11, this.mMeasureBuffer);
                callback2.invoke(Float.valueOf(PixelUtil.toDIPFromPixel(this.mMeasureBuffer[0])), Float.valueOf(PixelUtil.toDIPFromPixel(this.mMeasureBuffer[1])), Float.valueOf(PixelUtil.toDIPFromPixel(this.mMeasureBuffer[2])), Float.valueOf(PixelUtil.toDIPFromPixel(this.mMeasureBuffer[3])));
            } catch (IllegalViewOperationException e11) {
                callback.invoke(e11.getMessage());
            }
        }
    }

    public void onCatalystInstanceDestroyed() {
        this.mViewOperationsEnabled = false;
        this.mViewManagers.invalidate();
    }

    public void removeLayoutUpdateListener() {
        this.mLayoutUpdateListener = null;
    }

    public void updateRootView(int i11, int i12, int i13) {
        ReactShadowNode node = this.mShadowNodeRegistry.getNode(i11);
        if (node != null) {
            updateRootView(node, i12, i13);
            return;
        }
        C45999a.m101488I(ReactConstants.TAG, "Tried to update non-existent root tag: " + i11);
    }

    public UIImplementation(ReactApplicationContext reactApplicationContext, ViewManagerRegistry viewManagerRegistry, UIViewOperationQueue uIViewOperationQueue, EventDispatcher eventDispatcher) {
        this.uiImplementationThreadLock = new Object();
        ShadowNodeRegistry shadowNodeRegistry = new ShadowNodeRegistry();
        this.mShadowNodeRegistry = shadowNodeRegistry;
        this.mMeasureBuffer = new int[4];
        this.mLastCalculateLayoutTime = 0L;
        this.mViewOperationsEnabled = true;
        this.mReactContext = reactApplicationContext;
        this.mViewManagers = viewManagerRegistry;
        this.mOperationsQueue = uIViewOperationQueue;
        this.mNativeViewHierarchyOptimizer = new NativeViewHierarchyOptimizer(uIViewOperationQueue, shadowNodeRegistry);
        this.mEventDispatcher = eventDispatcher;
    }

    private void assertNodeDoesNotNeedCustomLayoutForChildren(ReactShadowNode reactShadowNode) {
        NativeModule nativeModule = (ViewManager) C38115a.m86047c(this.mViewManagers.get(reactShadowNode.getViewClass()));
        if (!(nativeModule instanceof IViewManagerWithChildren)) {
            throw new IllegalViewOperationException("Trying to use view " + reactShadowNode.getViewClass() + " as a parent, but its Manager doesn't extends ViewGroupManager");
        }
        IViewManagerWithChildren iViewManagerWithChildren = (IViewManagerWithChildren) nativeModule;
        if (iViewManagerWithChildren == null || !iViewManagerWithChildren.needsCustomLayoutForChildren()) {
            return;
        }
        throw new IllegalViewOperationException("Trying to measure a view using measureLayout/measureLayoutRelativeToParent relative to an ancestor that requires custom layout for it's children (" + reactShadowNode.getViewClass() + "). Use measure instead.");
    }

    private boolean checkOrAssertViewExists(int i11, String str) {
        if (this.mShadowNodeRegistry.getNode(i11) != null) {
            return true;
        }
        String str2 = "Unable to execute operation " + str + " on view with tag: " + i11 + ", since the view does not exist";
        if (ReactBuildConfig.DEBUG) {
            throw new IllegalViewOperationException(str2);
        }
        C45999a.m101488I(ReactConstants.TAG, str2);
        return false;
    }

    private void dispatchViewUpdatesIfNeeded() {
        if (this.mOperationsQueue.isEmpty()) {
            dispatchViewUpdates(-1);
        }
    }

    public void addUIBlock(UIBlock uIBlock) {
        this.mOperationsQueue.enqueueUIBlock(uIBlock);
    }

    public void calculateRootLayout(ReactShadowNode reactShadowNode) {
        C4858a.m4990a(0L, "cssRoot.calculateLayout").mo4992a("rootTag", reactShadowNode.getReactTag()).mo4994c();
        long jUptimeMillis = SystemClock.uptimeMillis();
        try {
            int iIntValue = reactShadowNode.getWidthMeasureSpec().intValue();
            int iIntValue2 = reactShadowNode.getHeightMeasureSpec().intValue();
            float size = Float.NaN;
            float size2 = View.MeasureSpec.getMode(iIntValue) == 0 ? Float.NaN : View.MeasureSpec.getSize(iIntValue);
            if (View.MeasureSpec.getMode(iIntValue2) != 0) {
                size = View.MeasureSpec.getSize(iIntValue2);
            }
            reactShadowNode.calculateLayout(size2, size);
        } finally {
            Systrace.m10667i(0L);
            this.mLastCalculateLayoutTime = SystemClock.uptimeMillis() - jUptimeMillis;
        }
    }

    public void clearJSResponder() {
        this.mOperationsQueue.enqueueClearJSResponder();
    }

    public void configureNextLayoutAnimation(ReadableMap readableMap, Callback callback) {
        this.mOperationsQueue.enqueueConfigureLayoutAnimation(readableMap, callback);
    }

    public ReactShadowNode createRootShadowNode() {
        ReactShadowNodeImpl reactShadowNodeImpl = new ReactShadowNodeImpl();
        if (I18nUtil.getInstance().isRTL(this.mReactContext)) {
            reactShadowNodeImpl.setLayoutDirection(YogaDirection.RTL);
        }
        reactShadowNodeImpl.setViewClassName("Root");
        return reactShadowNodeImpl;
    }

    public ReactShadowNode createShadowNode(String str) {
        return this.mViewManagers.get(str).createShadowNodeInstance(this.mReactContext);
    }

    public void createView(int i11, String str, int i12, ReadableMap readableMap) {
        ReactStylesDiffMap reactStylesDiffMap;
        if (this.mViewOperationsEnabled) {
            synchronized (this.uiImplementationThreadLock) {
                try {
                    ReactShadowNode reactShadowNodeCreateShadowNode = createShadowNode(str);
                    ReactShadowNode node = this.mShadowNodeRegistry.getNode(i12);
                    C38115a.m86048d(node, "Root node with tag " + i12 + " doesn't exist");
                    reactShadowNodeCreateShadowNode.setReactTag(i11);
                    reactShadowNodeCreateShadowNode.setViewClassName(str);
                    reactShadowNodeCreateShadowNode.setRootTag(node.getReactTag());
                    reactShadowNodeCreateShadowNode.setThemedContext(node.getThemedContext());
                    this.mShadowNodeRegistry.addNode(reactShadowNodeCreateShadowNode);
                    if (readableMap != null) {
                        reactStylesDiffMap = new ReactStylesDiffMap(readableMap);
                        reactShadowNodeCreateShadowNode.updateProperties(reactStylesDiffMap);
                    } else {
                        reactStylesDiffMap = null;
                    }
                    handleCreateView(reactShadowNodeCreateShadowNode, i12, reactStylesDiffMap);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public void dispatchViewUpdates(int i11) {
        C4858a.m4990a(0L, "UIImplementation.dispatchViewUpdates").mo4992a("batchId", i11).mo4994c();
        long jUptimeMillis = SystemClock.uptimeMillis();
        try {
            updateViewHierarchy();
            this.mNativeViewHierarchyOptimizer.onBatchComplete();
            this.mOperationsQueue.dispatchViewUpdates(i11, jUptimeMillis, this.mLastCalculateLayoutTime);
        } finally {
            Systrace.m10667i(0L);
        }
    }

    public void findSubviewIn(int i11, float f11, float f12, Callback callback) {
        this.mOperationsQueue.enqueueFindTargetForTouch(i11, f11, f12, callback);
    }

    public Map<String, Long> getProfiledBatchPerfCounters() {
        return this.mOperationsQueue.getProfiledBatchPerfCounters();
    }

    public int getRootViewNum() {
        return this.mOperationsQueue.getNativeViewHierarchyManager().getRootViewNum();
    }

    public UIViewOperationQueue getUIViewOperationQueue() {
        return this.mOperationsQueue;
    }

    public void manageChildren(int i11, @Nullable ReadableArray readableArray, @Nullable ReadableArray readableArray2, @Nullable ReadableArray readableArray3, @Nullable ReadableArray readableArray4, @Nullable ReadableArray readableArray5) {
        ReadableArray readableArray6 = readableArray;
        if (this.mViewOperationsEnabled) {
            synchronized (this.uiImplementationThreadLock) {
                try {
                    ReactShadowNode node = this.mShadowNodeRegistry.getNode(i11);
                    int size = readableArray6 == null ? 0 : readableArray6.size();
                    int size2 = readableArray3 == null ? 0 : readableArray3.size();
                    int size3 = readableArray5 == null ? 0 : readableArray5.size();
                    if (size != 0 && (readableArray2 == null || size != readableArray2.size())) {
                        throw new IllegalViewOperationException("Size of moveFrom != size of moveTo!");
                    }
                    if (size2 != 0 && (readableArray4 == null || size2 != readableArray4.size())) {
                        throw new IllegalViewOperationException("Size of addChildTags != size of addAtIndices!");
                    }
                    int i12 = size + size2;
                    ViewAtIndex[] viewAtIndexArr = new ViewAtIndex[i12];
                    int i13 = size + size3;
                    int[] iArr = new int[i13];
                    int[] iArr2 = new int[i13];
                    int[] iArr3 = new int[size3];
                    if (size > 0) {
                        C38115a.m86047c(readableArray6);
                        C38115a.m86047c(readableArray2);
                        int i14 = 0;
                        while (i14 < size) {
                            int i15 = size;
                            int i16 = readableArray6.getInt(i14);
                            int reactTag = node.getChildAt(i16).getReactTag();
                            viewAtIndexArr[i14] = new ViewAtIndex(reactTag, readableArray2.getInt(i14));
                            iArr[i14] = i16;
                            iArr2[i14] = reactTag;
                            i14++;
                            readableArray6 = readableArray;
                            size = i15;
                            i13 = i13;
                        }
                    }
                    int i17 = size;
                    int i18 = i13;
                    if (size2 > 0) {
                        C38115a.m86047c(readableArray3);
                        C38115a.m86047c(readableArray4);
                        for (int i19 = 0; i19 < size2; i19++) {
                            viewAtIndexArr[i17 + i19] = new ViewAtIndex(readableArray3.getInt(i19), readableArray4.getInt(i19));
                        }
                    }
                    if (size3 > 0) {
                        C38115a.m86047c(readableArray5);
                        for (int i21 = 0; i21 < size3; i21++) {
                            int i22 = readableArray5.getInt(i21);
                            int reactTag2 = node.getChildAt(i22).getReactTag();
                            int i23 = i17 + i21;
                            iArr[i23] = i22;
                            iArr2[i23] = reactTag2;
                            iArr3[i21] = reactTag2;
                        }
                    }
                    Arrays.sort(viewAtIndexArr, ViewAtIndex.COMPARATOR);
                    Arrays.sort(iArr);
                    int i24 = -1;
                    for (int i25 = i18 - 1; i25 >= 0; i25--) {
                        int i26 = iArr[i25];
                        if (i26 == i24) {
                            throw new IllegalViewOperationException("Repeated indices in Removal list for view tag: " + i11);
                        }
                        node.removeChildAt(i26);
                        i24 = iArr[i25];
                    }
                    for (int i27 = 0; i27 < i12; i27++) {
                        ViewAtIndex viewAtIndex = viewAtIndexArr[i27];
                        ReactShadowNode node2 = this.mShadowNodeRegistry.getNode(viewAtIndex.mTag);
                        if (node2 == null) {
                            throw new IllegalViewOperationException("Trying to add unknown view tag: " + viewAtIndex.mTag);
                        }
                        node.addChildAt(node2, viewAtIndex.mIndex);
                    }
                    this.mNativeViewHierarchyOptimizer.handleManageChildren(node, iArr, iArr2, viewAtIndexArr, iArr3);
                    for (int i28 = 0; i28 < size3; i28++) {
                        removeShadowNode(this.mShadowNodeRegistry.getNode(iArr3[i28]));
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public void measure(int i11, Callback callback) {
        if (this.mViewOperationsEnabled) {
            this.mOperationsQueue.enqueueMeasure(i11, callback);
        }
    }

    public void measureInWindow(int i11, Callback callback) {
        if (this.mViewOperationsEnabled) {
            this.mOperationsQueue.enqueueMeasureInWindow(i11, callback);
        }
    }

    public void onHostPause() {
        this.mOperationsQueue.pauseFrameCallback();
    }

    public void onHostResume() {
        this.mOperationsQueue.resumeFrameCallback();
    }

    public void prependUIBlock(UIBlock uIBlock) {
        this.mOperationsQueue.prependUIBlock(uIBlock);
    }

    public void profileNextBatch() {
        this.mOperationsQueue.profileNextBatch();
    }

    public <T extends View> void registerRootView(T t11, int i11, ThemedReactContext themedReactContext) {
        synchronized (this.uiImplementationThreadLock) {
            final ReactShadowNode reactShadowNodeCreateRootShadowNode = createRootShadowNode();
            reactShadowNodeCreateRootShadowNode.setReactTag(i11);
            reactShadowNodeCreateRootShadowNode.setThemedContext(themedReactContext);
            themedReactContext.runOnNativeModulesQueueThread(new Runnable() { // from class: com.facebook.react.uimanager.UIImplementation.1
                @Override // java.lang.Runnable
                public void run() {
                    UIImplementation.this.mShadowNodeRegistry.addRootNode(reactShadowNodeCreateRootShadowNode);
                }
            });
            this.mOperationsQueue.addRootView(i11, t11);
        }
    }

    public void removeRootShadowNode(int i11) {
        synchronized (this.uiImplementationThreadLock) {
            this.mShadowNodeRegistry.removeRootNode(i11);
        }
    }

    public void replaceExistingNonRootView(int i11, int i12) {
        if (this.mShadowNodeRegistry.isRootNode(i11) || this.mShadowNodeRegistry.isRootNode(i12)) {
            throw new IllegalViewOperationException("Trying to add or replace a root tag!");
        }
        ReactShadowNode node = this.mShadowNodeRegistry.getNode(i11);
        if (node == null) {
            throw new IllegalViewOperationException("Trying to replace unknown view tag: " + i11);
        }
        ReactShadowNode parent = node.getParent();
        if (parent == null) {
            throw new IllegalViewOperationException("Node is not attached to a parent: " + i11);
        }
        int iIndexOf = parent.indexOf(node);
        if (iIndexOf < 0) {
            throw new IllegalStateException("Didn't find child tag in parent");
        }
        WritableArray writableArrayCreateArray = Arguments.createArray();
        writableArrayCreateArray.pushInt(i12);
        WritableArray writableArrayCreateArray2 = Arguments.createArray();
        writableArrayCreateArray2.pushInt(iIndexOf);
        WritableArray writableArrayCreateArray3 = Arguments.createArray();
        writableArrayCreateArray3.pushInt(iIndexOf);
        manageChildren(parent.getReactTag(), null, null, writableArrayCreateArray, writableArrayCreateArray2, writableArrayCreateArray3);
    }

    public int resolveRootTagFromReactTag(int i11) {
        if (this.mShadowNodeRegistry.isRootNode(i11)) {
            return i11;
        }
        ReactShadowNode reactShadowNodeResolveShadowNode = resolveShadowNode(i11);
        if (reactShadowNodeResolveShadowNode != null) {
            return reactShadowNodeResolveShadowNode.getRootTag();
        }
        C45999a.m101488I(ReactConstants.TAG, "Warning : attempted to resolve a non-existent react shadow node. reactTag=" + i11);
        return 0;
    }

    public final ReactShadowNode resolveShadowNode(int i11) {
        return this.mShadowNodeRegistry.getNode(i11);
    }

    @Nullable
    public final ViewManager resolveViewManager(String str) {
        return this.mViewManagers.getViewManagerIfExists(str);
    }

    public void sendAccessibilityEvent(int i11, int i12) {
        this.mOperationsQueue.enqueueSendAccessibilityEvent(i11, i12);
    }

    public void setChildren(int i11, ReadableArray readableArray) {
        if (this.mViewOperationsEnabled) {
            synchronized (this.uiImplementationThreadLock) {
                try {
                    ReactShadowNode node = this.mShadowNodeRegistry.getNode(i11);
                    for (int i12 = 0; i12 < readableArray.size(); i12++) {
                        ReactShadowNode node2 = this.mShadowNodeRegistry.getNode(readableArray.getInt(i12));
                        if (node2 == null) {
                            throw new IllegalViewOperationException("Trying to add unknown view tag: " + readableArray.getInt(i12));
                        }
                        node.addChildAt(node2, i12);
                    }
                    this.mNativeViewHierarchyOptimizer.handleSetChildren(node, readableArray);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public void setJSResponder(int i11, boolean z11) {
        ReactShadowNode node = this.mShadowNodeRegistry.getNode(i11);
        if (node == null) {
            return;
        }
        while (node.getNativeKind() == NativeKind.NONE) {
            node = node.getParent();
        }
        this.mOperationsQueue.enqueueSetJSResponder(node.getReactTag(), i11, z11);
    }

    public void setLayoutAnimationEnabledExperimental(boolean z11) {
        this.mOperationsQueue.enqueueSetLayoutAnimationEnabled(z11);
    }

    public void setLayoutUpdateListener(LayoutUpdateListener layoutUpdateListener) {
        this.mLayoutUpdateListener = layoutUpdateListener;
    }

    public void setViewHierarchyUpdateDebugListener(@Nullable NotThreadSafeViewHierarchyUpdateDebugListener notThreadSafeViewHierarchyUpdateDebugListener) {
        this.mOperationsQueue.setViewHierarchyUpdateDebugListener(notThreadSafeViewHierarchyUpdateDebugListener);
    }

    public void setViewLocalData(int i11, Object obj) {
        ReactShadowNode node = this.mShadowNodeRegistry.getNode(i11);
        if (node != null) {
            node.setLocalData(obj);
            dispatchViewUpdatesIfNeeded();
        } else {
            C45999a.m101488I(ReactConstants.TAG, "Attempt to set local data for view with unknown tag: " + i11);
        }
    }

    public void updateInsetsPadding(int i11, int i12, int i13, int i14, int i15) {
        ReactShadowNode node = this.mShadowNodeRegistry.getNode(i11);
        if (node == null) {
            C45999a.m101488I(ReactConstants.TAG, "Tried to update size of non-existent tag: " + i11);
            return;
        }
        node.setPadding(4, i13);
        node.setPadding(1, i12);
        node.setPadding(5, i15);
        node.setPadding(3, i14);
        dispatchViewUpdatesIfNeeded();
    }

    public void updateNodeSize(int i11, int i12, int i13) {
        ReactShadowNode node = this.mShadowNodeRegistry.getNode(i11);
        if (node != null) {
            node.setStyleWidth(i12);
            node.setStyleHeight(i13);
            dispatchViewUpdatesIfNeeded();
        } else {
            C45999a.m101488I(ReactConstants.TAG, "Tried to update size of non-existent tag: " + i11);
        }
    }

    public void updateView(int i11, String str, ReadableMap readableMap) {
        if (this.mViewOperationsEnabled) {
            if (this.mViewManagers.get(str) == null) {
                throw new IllegalViewOperationException("Got unknown view type: " + str);
            }
            ReactShadowNode node = this.mShadowNodeRegistry.getNode(i11);
            if (node == null) {
                throw new IllegalViewOperationException("Trying to update non-existent view with tag " + i11);
            }
            if (readableMap != null) {
                ReactStylesDiffMap reactStylesDiffMap = new ReactStylesDiffMap(readableMap);
                node.updateProperties(reactStylesDiffMap);
                handleUpdateView(node, str, reactStylesDiffMap);
            }
        }
    }

    @Deprecated
    public void viewIsDescendantOf(int i11, int i12, Callback callback) {
        ReactShadowNode node = this.mShadowNodeRegistry.getNode(i11);
        ReactShadowNode node2 = this.mShadowNodeRegistry.getNode(i12);
        if (node == null || node2 == null) {
            callback.invoke(Boolean.FALSE);
        } else {
            callback.invoke(Boolean.valueOf(node.isDescendantOf(node2)));
        }
    }

    private void notifyOnBeforeLayoutRecursive(ReactShadowNode reactShadowNode) {
        if (!reactShadowNode.hasUpdates()) {
            return;
        }
        for (int i11 = 0; i11 < reactShadowNode.getChildCount(); i11++) {
            notifyOnBeforeLayoutRecursive(reactShadowNode.getChildAt(i11));
        }
        reactShadowNode.onBeforeLayout(this.mNativeViewHierarchyOptimizer);
    }

    private void removeShadowNodeRecursive(ReactShadowNode reactShadowNode) {
        NativeViewHierarchyOptimizer.handleRemoveNode(reactShadowNode);
        this.mShadowNodeRegistry.removeNode(reactShadowNode.getReactTag());
        for (int childCount = reactShadowNode.getChildCount() - 1; childCount >= 0; childCount--) {
            removeShadowNodeRecursive(reactShadowNode.getChildAt(childCount));
        }
        reactShadowNode.removeAndDisposeAllChildren();
    }

    public void applyUpdatesRecursive(ReactShadowNode reactShadowNode, float f11, float f12, List<ReactShadowNode> list) {
        if (!reactShadowNode.hasUpdates()) {
            return;
        }
        if (reactShadowNode.dispatchUpdatesWillChangeLayout(f11, f12) && reactShadowNode.shouldNotifyOnLayout() && !this.mShadowNodeRegistry.isRootNode(reactShadowNode.getReactTag())) {
            list.add(reactShadowNode);
        }
        Iterable<? extends ReactShadowNode> iterableCalculateLayoutOnChildren = reactShadowNode.calculateLayoutOnChildren();
        if (iterableCalculateLayoutOnChildren != null) {
            Iterator<? extends ReactShadowNode> it = iterableCalculateLayoutOnChildren.iterator();
            while (it.hasNext()) {
                applyUpdatesRecursive(it.next(), reactShadowNode.getLayoutX() + f11, reactShadowNode.getLayoutY() + f12, list);
            }
        }
        reactShadowNode.dispatchUpdates(f11, f12, this.mOperationsQueue, this.mNativeViewHierarchyOptimizer);
        reactShadowNode.markUpdateSeen();
        this.mNativeViewHierarchyOptimizer.onViewUpdatesCompleted(reactShadowNode);
    }

    public void handleCreateView(ReactShadowNode reactShadowNode, int i11, @Nullable ReactStylesDiffMap reactStylesDiffMap) {
        if (!reactShadowNode.isVirtual()) {
            this.mNativeViewHierarchyOptimizer.handleCreateView(reactShadowNode, reactShadowNode.getThemedContext(), reactStylesDiffMap);
        }
    }

    public void handleUpdateView(ReactShadowNode reactShadowNode, String str, ReactStylesDiffMap reactStylesDiffMap) {
        if (!reactShadowNode.isVirtual()) {
            this.mNativeViewHierarchyOptimizer.handleUpdateView(reactShadowNode, str, reactStylesDiffMap);
        }
    }

    public void removeRootView(int i11) {
        removeRootShadowNode(i11);
        this.mOperationsQueue.enqueueRemoveRootView(i11);
    }

    public final void removeShadowNode(ReactShadowNode reactShadowNode) {
        removeShadowNodeRecursive(reactShadowNode);
        reactShadowNode.dispose();
    }

    public void synchronouslyUpdateViewOnUIThread(int i11, ReactStylesDiffMap reactStylesDiffMap) {
        UiThreadUtil.assertOnUiThread();
        this.mOperationsQueue.getNativeViewHierarchyManager().updateProperties(i11, reactStylesDiffMap);
    }

    public void updateViewHierarchy() {
        Systrace.m10662c(0L, "UIImplementation.updateViewHierarchy");
        for (int i11 = 0; i11 < this.mShadowNodeRegistry.getRootNodeCount(); i11++) {
            try {
                ReactShadowNode node = this.mShadowNodeRegistry.getNode(this.mShadowNodeRegistry.getRootTag(i11));
                if (node.getWidthMeasureSpec() != null && node.getHeightMeasureSpec() != null) {
                    C4858a.m4990a(0L, "UIImplementation.notifyOnBeforeLayoutRecursive").mo4992a("rootTag", node.getReactTag()).mo4994c();
                    try {
                        notifyOnBeforeLayoutRecursive(node);
                        Systrace.m10667i(0L);
                        calculateRootLayout(node);
                        C4858a.m4990a(0L, "UIImplementation.applyUpdatesRecursive").mo4992a("rootTag", node.getReactTag()).mo4994c();
                        try {
                            ArrayList arrayList = new ArrayList();
                            applyUpdatesRecursive(node, 0.0f, 0.0f, arrayList);
                            for (ReactShadowNode reactShadowNode : arrayList) {
                                this.mEventDispatcher.dispatchEvent(OnLayoutEvent.obtain(-1, reactShadowNode.getReactTag(), reactShadowNode.getScreenX(), reactShadowNode.getScreenY(), reactShadowNode.getScreenWidth(), reactShadowNode.getScreenHeight()));
                            }
                            Systrace.m10667i(0L);
                            LayoutUpdateListener layoutUpdateListener = this.mLayoutUpdateListener;
                            if (layoutUpdateListener != null) {
                                this.mOperationsQueue.enqueueLayoutUpdateFinished(node, layoutUpdateListener);
                            }
                        } catch (Throwable th2) {
                            Systrace.m10667i(0L);
                            throw th2;
                        }
                    } catch (Throwable th3) {
                        Systrace.m10667i(0L);
                        throw th3;
                    }
                }
            } catch (Throwable th4) {
                Systrace.m10667i(0L);
                throw th4;
            }
        }
        Systrace.m10667i(0L);
    }

    public void dispatchViewManagerCommand(int i11, String str, @Nullable ReadableArray readableArray) {
        if (checkOrAssertViewExists(i11, "dispatchViewManagerCommand: " + str)) {
            this.mOperationsQueue.enqueueDispatchCommand(i11, str, readableArray);
        }
    }

    public void updateRootView(ReactShadowNode reactShadowNode, int i11, int i12) {
        reactShadowNode.setMeasureSpecs(i11, i12);
    }

    private void measureLayout(int i11, int i12, int[] iArr) {
        ReactShadowNode node = this.mShadowNodeRegistry.getNode(i11);
        ReactShadowNode node2 = this.mShadowNodeRegistry.getNode(i12);
        if (node == null || node2 == null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Tag ");
            if (node != null) {
                i11 = i12;
            }
            sb2.append(i11);
            sb2.append(" does not exist");
            throw new IllegalViewOperationException(sb2.toString());
        }
        if (node != node2) {
            for (ReactShadowNode parent = node.getParent(); parent != node2; parent = parent.getParent()) {
                if (parent == null) {
                    throw new IllegalViewOperationException("Tag " + i12 + " is not an ancestor of tag " + i11);
                }
            }
        }
        measureLayoutRelativeToVerifiedAncestor(node, node2, iArr);
    }

    private void measureLayoutRelativeToParent(int i11, int[] iArr) {
        ReactShadowNode node = this.mShadowNodeRegistry.getNode(i11);
        if (node != null) {
            ReactShadowNode parent = node.getParent();
            if (parent != null) {
                measureLayoutRelativeToVerifiedAncestor(node, parent, iArr);
                return;
            }
            throw new IllegalViewOperationException("View with tag " + i11 + " doesn't have a parent!");
        }
        throw new IllegalViewOperationException("No native view for tag " + i11 + " exists!");
    }

    public void onHostDestroy() {
    }
}
