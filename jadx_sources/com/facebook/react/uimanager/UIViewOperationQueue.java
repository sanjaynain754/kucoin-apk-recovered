package com.facebook.react.uimanager;

import android.os.SystemClock;
import android.view.View;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import androidx.annotation.UiThread;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.GuardedRunnable;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactNoCrashSoftException;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.RetryableMountingLayerException;
import com.facebook.react.bridge.SoftAssertions;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.common.ReactConstants;
import com.facebook.react.internal.featureflags.ReactNativeFeatureFlags;
import com.facebook.react.modules.core.ReactChoreographer;
import com.facebook.react.uimanager.debug.NotThreadSafeViewHierarchyUpdateDebugListener;
import com.facebook.systrace.Systrace;
import com.facebook.yoga.YogaDirection;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import p053c7.C4858a;
import p747x3.C45999a;

/* JADX INFO: loaded from: classes45.dex */
public class UIViewOperationQueue {
    public static final int DEFAULT_MIN_TIME_LEFT_IN_FRAME_FOR_NONBATCHED_OPERATION_MS = 8;
    private static final String TAG = "UIViewOperationQueue";
    private long mCreateViewCount;
    private final DispatchUIFrameCallback mDispatchUIFrameCallback;
    private final NativeViewHierarchyManager mNativeViewHierarchyManager;
    private long mNonBatchedExecutionTotalTime;
    private long mProfiledBatchBatchedExecutionTime;
    private long mProfiledBatchCommitEndTime;
    private long mProfiledBatchCommitStartTime;
    private long mProfiledBatchDispatchViewUpdatesTime;
    private long mProfiledBatchLayoutTime;
    private long mProfiledBatchNonBatchedExecutionTime;
    private long mProfiledBatchRunEndTime;
    private long mProfiledBatchRunStartTime;
    private final ReactApplicationContext mReactApplicationContext;
    private long mThreadCpuTime;
    private long mUpdatePropertiesOperationCount;

    @Nullable
    private NotThreadSafeViewHierarchyUpdateDebugListener mViewHierarchyUpdateDebugListener;
    private final int[] mMeasureBuffer = new int[4];
    private final Object mDispatchRunnablesLock = new Object();
    private final Object mNonBatchedOperationsLock = new Object();
    private ArrayList<DispatchCommandViewOperation> mViewCommandOperations = new ArrayList<>();
    private ArrayList<UIOperation> mOperations = new ArrayList<>();

    @GuardedBy("mDispatchRunnablesLock")
    private ArrayList<Runnable> mDispatchUIRunnables = new ArrayList<>();

    @GuardedBy("mNonBatchedOperationsLock")
    private ArrayDeque<UIOperation> mNonBatchedOperations = new ArrayDeque<>();
    private boolean mIsDispatchUIFrameCallbackEnqueued = false;
    private boolean mIsInIllegalUIState = false;
    private boolean mIsProfilingNextBatch = false;

    public final class ChangeJSResponderOperation extends ViewOperation {
        private final boolean mBlockNativeResponder;
        private final boolean mClearResponder;
        private final int mInitialTag;

        public ChangeJSResponderOperation(int i11, int i12, boolean z11, boolean z12) {
            super(i11);
            this.mInitialTag = i12;
            this.mClearResponder = z11;
            this.mBlockNativeResponder = z12;
        }

        @Override // com.facebook.react.uimanager.UIViewOperationQueue.UIOperation
        public void execute() {
            if (this.mClearResponder) {
                UIViewOperationQueue.this.mNativeViewHierarchyManager.clearJSResponder();
            } else {
                UIViewOperationQueue.this.mNativeViewHierarchyManager.setJSResponder(this.mTag, this.mInitialTag, this.mBlockNativeResponder);
            }
        }
    }

    public class ConfigureLayoutAnimationOperation implements UIOperation {
        private final Callback mAnimationComplete;
        private final ReadableMap mConfig;

        private ConfigureLayoutAnimationOperation(ReadableMap readableMap, Callback callback) {
            this.mConfig = readableMap;
            this.mAnimationComplete = callback;
        }

        @Override // com.facebook.react.uimanager.UIViewOperationQueue.UIOperation
        public void execute() {
            UIViewOperationQueue.this.mNativeViewHierarchyManager.configureLayoutAnimation(this.mConfig, this.mAnimationComplete);
        }
    }

    public final class CreateViewOperation extends ViewOperation {
        private final String mClassName;

        @Nullable
        private final ReactStylesDiffMap mInitialProps;
        private final ThemedReactContext mThemedContext;

        public CreateViewOperation(ThemedReactContext themedReactContext, int i11, @Nullable String str, ReactStylesDiffMap reactStylesDiffMap) {
            super(i11);
            this.mThemedContext = themedReactContext;
            this.mClassName = str;
            this.mInitialProps = reactStylesDiffMap;
            Systrace.m10670l(0L, "createView", this.mTag);
        }

        @Override // com.facebook.react.uimanager.UIViewOperationQueue.UIOperation
        public void execute() {
            Systrace.m10664f(0L, "createView", this.mTag);
            UIViewOperationQueue.this.mNativeViewHierarchyManager.createView(this.mThemedContext, this.mTag, this.mClassName, this.mInitialProps);
        }
    }

    @Deprecated
    public final class DispatchCommandOperation extends ViewOperation implements DispatchCommandViewOperation {

        @Nullable
        private final ReadableArray mArgs;
        private final int mCommand;
        private int numRetries;

        public DispatchCommandOperation(int i11, @Nullable int i12, ReadableArray readableArray) {
            super(i11);
            this.numRetries = 0;
            this.mCommand = i12;
            this.mArgs = readableArray;
        }

        @Override // com.facebook.react.uimanager.UIViewOperationQueue.UIOperation
        public void execute() {
            try {
                UIViewOperationQueue.this.mNativeViewHierarchyManager.dispatchCommand(this.mTag, this.mCommand, this.mArgs);
            } catch (Throwable th2) {
                ReactSoftExceptionLogger.logSoftException(UIViewOperationQueue.TAG, new RuntimeException("Error dispatching View Command", th2));
            }
        }

        @Override // com.facebook.react.uimanager.UIViewOperationQueue.DispatchCommandViewOperation
        public void executeWithExceptions() {
            UIViewOperationQueue.this.mNativeViewHierarchyManager.dispatchCommand(this.mTag, this.mCommand, this.mArgs);
        }

        @Override // com.facebook.react.uimanager.UIViewOperationQueue.DispatchCommandViewOperation
        @UiThread
        public int getRetries() {
            return this.numRetries;
        }

        @Override // com.facebook.react.uimanager.UIViewOperationQueue.DispatchCommandViewOperation
        @UiThread
        public void incrementRetries() {
            this.numRetries++;
        }
    }

    public interface DispatchCommandViewOperation {
        void executeWithExceptions();

        int getRetries();

        void incrementRetries();
    }

    public final class DispatchStringCommandOperation extends ViewOperation implements DispatchCommandViewOperation {

        @Nullable
        private final ReadableArray mArgs;
        private final String mCommand;
        private int numRetries;

        public DispatchStringCommandOperation(int i11, @Nullable String str, ReadableArray readableArray) {
            super(i11);
            this.numRetries = 0;
            this.mCommand = str;
            this.mArgs = readableArray;
        }

        @Override // com.facebook.react.uimanager.UIViewOperationQueue.UIOperation
        public void execute() {
            try {
                UIViewOperationQueue.this.mNativeViewHierarchyManager.dispatchCommand(this.mTag, this.mCommand, this.mArgs);
            } catch (Throwable th2) {
                ReactSoftExceptionLogger.logSoftException(UIViewOperationQueue.TAG, new RuntimeException("Error dispatching View Command", th2));
            }
        }

        @Override // com.facebook.react.uimanager.UIViewOperationQueue.DispatchCommandViewOperation
        @UiThread
        public void executeWithExceptions() {
            UIViewOperationQueue.this.mNativeViewHierarchyManager.dispatchCommand(this.mTag, this.mCommand, this.mArgs);
        }

        @Override // com.facebook.react.uimanager.UIViewOperationQueue.DispatchCommandViewOperation
        public int getRetries() {
            return this.numRetries;
        }

        @Override // com.facebook.react.uimanager.UIViewOperationQueue.DispatchCommandViewOperation
        @UiThread
        public void incrementRetries() {
            this.numRetries++;
        }
    }

    public class DispatchUIFrameCallback extends GuardedFrameCallback {
        private static final int FRAME_TIME_MS = 16;
        private final int mMinTimeLeftInFrameForNonBatchedOperationMs;

        private DispatchUIFrameCallback(ReactContext reactContext, int i11) {
            super(reactContext);
            this.mMinTimeLeftInFrameForNonBatchedOperationMs = i11;
        }

        @Override // com.facebook.react.uimanager.GuardedFrameCallback
        public void doFrameGuarded(long j11) {
            if (UIViewOperationQueue.this.mIsInIllegalUIState) {
                C45999a.m101488I(ReactConstants.TAG, "Not flushing pending UI operations because of previously thrown Exception");
                return;
            }
            Systrace.m10662c(0L, "dispatchNonBatchedUIOperations");
            try {
                dispatchPendingNonBatchedOperations(j11);
                Systrace.m10667i(0L);
                UIViewOperationQueue.this.flushPendingBatches();
                ReactChoreographer.getInstance().postFrameCallback(ReactChoreographer.CallbackType.DISPATCH_UI, this);
            } catch (Throwable th2) {
                Systrace.m10667i(0L);
                throw th2;
            }
        }

        private void dispatchPendingNonBatchedOperations(long j11) throws Exception {
            UIOperation uIOperation;
            while (16 - ((System.nanoTime() - j11) / 1000000) >= this.mMinTimeLeftInFrameForNonBatchedOperationMs) {
                synchronized (UIViewOperationQueue.this.mNonBatchedOperationsLock) {
                    try {
                        if (UIViewOperationQueue.this.mNonBatchedOperations.isEmpty()) {
                            return;
                        } else {
                            uIOperation = (UIOperation) UIViewOperationQueue.this.mNonBatchedOperations.pollFirst();
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                try {
                    long jUptimeMillis = SystemClock.uptimeMillis();
                    uIOperation.execute();
                    UIViewOperationQueue.this.mNonBatchedExecutionTotalTime += SystemClock.uptimeMillis() - jUptimeMillis;
                } catch (Exception e11) {
                    UIViewOperationQueue.this.mIsInIllegalUIState = true;
                    throw e11;
                }
            }
        }
    }

    public final class FindTargetForTouchOperation implements UIOperation {
        private final Callback mCallback;
        private final int mReactTag;
        private final float mTargetX;
        private final float mTargetY;

        @Override // com.facebook.react.uimanager.UIViewOperationQueue.UIOperation
        public void execute() {
            try {
                UIViewOperationQueue.this.mNativeViewHierarchyManager.measure(this.mReactTag, UIViewOperationQueue.this.mMeasureBuffer);
                float f11 = UIViewOperationQueue.this.mMeasureBuffer[0];
                float f12 = UIViewOperationQueue.this.mMeasureBuffer[1];
                int iFindTargetTagForTouch = UIViewOperationQueue.this.mNativeViewHierarchyManager.findTargetTagForTouch(this.mReactTag, this.mTargetX, this.mTargetY);
                try {
                    UIViewOperationQueue.this.mNativeViewHierarchyManager.measure(iFindTargetTagForTouch, UIViewOperationQueue.this.mMeasureBuffer);
                    this.mCallback.invoke(Integer.valueOf(iFindTargetTagForTouch), Float.valueOf(PixelUtil.toDIPFromPixel(UIViewOperationQueue.this.mMeasureBuffer[0] - f11)), Float.valueOf(PixelUtil.toDIPFromPixel(UIViewOperationQueue.this.mMeasureBuffer[1] - f12)), Float.valueOf(PixelUtil.toDIPFromPixel(UIViewOperationQueue.this.mMeasureBuffer[2])), Float.valueOf(PixelUtil.toDIPFromPixel(UIViewOperationQueue.this.mMeasureBuffer[3])));
                } catch (IllegalViewOperationException unused) {
                    this.mCallback.invoke(new Object[0]);
                }
            } catch (IllegalViewOperationException unused2) {
                this.mCallback.invoke(new Object[0]);
            }
        }

        private FindTargetForTouchOperation(int i11, float f11, float f12, Callback callback) {
            this.mReactTag = i11;
            this.mTargetX = f11;
            this.mTargetY = f12;
            this.mCallback = callback;
        }
    }

    public final class LayoutUpdateFinishedOperation implements UIOperation {
        private final UIImplementation.LayoutUpdateListener mListener;
        private final ReactShadowNode mNode;

        private LayoutUpdateFinishedOperation(ReactShadowNode reactShadowNode, UIImplementation.LayoutUpdateListener layoutUpdateListener) {
            this.mNode = reactShadowNode;
            this.mListener = layoutUpdateListener;
        }

        @Override // com.facebook.react.uimanager.UIViewOperationQueue.UIOperation
        public void execute() {
            this.mListener.onLayoutUpdated(this.mNode);
        }
    }

    public final class ManageChildrenOperation extends ViewOperation {

        @Nullable
        private final int[] mIndicesToRemove;

        @Nullable
        private final int[] mTagsToDelete;

        @Nullable
        private final ViewAtIndex[] mViewsToAdd;

        public ManageChildrenOperation(@Nullable int i11, @Nullable int[] iArr, @Nullable ViewAtIndex[] viewAtIndexArr, int[] iArr2) {
            super(i11);
            this.mIndicesToRemove = iArr;
            this.mViewsToAdd = viewAtIndexArr;
            this.mTagsToDelete = iArr2;
        }

        @Override // com.facebook.react.uimanager.UIViewOperationQueue.UIOperation
        public void execute() throws Throwable {
            UIViewOperationQueue.this.mNativeViewHierarchyManager.manageChildren(this.mTag, this.mIndicesToRemove, this.mViewsToAdd, this.mTagsToDelete);
        }
    }

    public final class MeasureInWindowOperation implements UIOperation {
        private final Callback mCallback;
        private final int mReactTag;

        @Override // com.facebook.react.uimanager.UIViewOperationQueue.UIOperation
        public void execute() {
            try {
                UIViewOperationQueue.this.mNativeViewHierarchyManager.measureInWindow(this.mReactTag, UIViewOperationQueue.this.mMeasureBuffer);
                this.mCallback.invoke(Float.valueOf(PixelUtil.toDIPFromPixel(UIViewOperationQueue.this.mMeasureBuffer[0])), Float.valueOf(PixelUtil.toDIPFromPixel(UIViewOperationQueue.this.mMeasureBuffer[1])), Float.valueOf(PixelUtil.toDIPFromPixel(UIViewOperationQueue.this.mMeasureBuffer[2])), Float.valueOf(PixelUtil.toDIPFromPixel(UIViewOperationQueue.this.mMeasureBuffer[3])));
            } catch (NoSuchNativeViewException unused) {
                this.mCallback.invoke(new Object[0]);
            }
        }

        private MeasureInWindowOperation(int i11, Callback callback) {
            this.mReactTag = i11;
            this.mCallback = callback;
        }
    }

    public final class MeasureOperation implements UIOperation {
        private final Callback mCallback;
        private final int mReactTag;

        @Override // com.facebook.react.uimanager.UIViewOperationQueue.UIOperation
        public void execute() {
            try {
                UIViewOperationQueue.this.mNativeViewHierarchyManager.measure(this.mReactTag, UIViewOperationQueue.this.mMeasureBuffer);
                this.mCallback.invoke(0, 0, Float.valueOf(PixelUtil.toDIPFromPixel(UIViewOperationQueue.this.mMeasureBuffer[2])), Float.valueOf(PixelUtil.toDIPFromPixel(UIViewOperationQueue.this.mMeasureBuffer[3])), Float.valueOf(PixelUtil.toDIPFromPixel(UIViewOperationQueue.this.mMeasureBuffer[0])), Float.valueOf(PixelUtil.toDIPFromPixel(UIViewOperationQueue.this.mMeasureBuffer[1])));
            } catch (NoSuchNativeViewException unused) {
                this.mCallback.invoke(new Object[0]);
            }
        }

        private MeasureOperation(int i11, Callback callback) {
            this.mReactTag = i11;
            this.mCallback = callback;
        }
    }

    public final class RemoveRootViewOperation extends ViewOperation {
        public RemoveRootViewOperation(int i11) {
            super(i11);
        }

        @Override // com.facebook.react.uimanager.UIViewOperationQueue.UIOperation
        public void execute() {
            UIViewOperationQueue.this.mNativeViewHierarchyManager.removeRootView(this.mTag);
        }
    }

    public final class SendAccessibilityEvent extends ViewOperation {
        private final int mEventType;

        private SendAccessibilityEvent(int i11, int i12) {
            super(i11);
            this.mEventType = i12;
        }

        @Override // com.facebook.react.uimanager.UIViewOperationQueue.UIOperation
        public void execute() {
            try {
                UIViewOperationQueue.this.mNativeViewHierarchyManager.sendAccessibilityEvent(this.mTag, this.mEventType);
            } catch (RetryableMountingLayerException e11) {
                ReactSoftExceptionLogger.logSoftException(UIViewOperationQueue.TAG, e11);
            }
        }
    }

    public final class SetChildrenOperation extends ViewOperation {
        private final ReadableArray mChildrenTags;

        public SetChildrenOperation(int i11, ReadableArray readableArray) {
            super(i11);
            this.mChildrenTags = readableArray;
        }

        @Override // com.facebook.react.uimanager.UIViewOperationQueue.UIOperation
        public void execute() {
            UIViewOperationQueue.this.mNativeViewHierarchyManager.setChildren(this.mTag, this.mChildrenTags);
        }
    }

    public class SetLayoutAnimationEnabledOperation implements UIOperation {
        private final boolean mEnabled;

        private SetLayoutAnimationEnabledOperation(boolean z11) {
            this.mEnabled = z11;
        }

        @Override // com.facebook.react.uimanager.UIViewOperationQueue.UIOperation
        public void execute() {
            UIViewOperationQueue.this.mNativeViewHierarchyManager.setLayoutAnimationEnabled(this.mEnabled);
        }
    }

    public class UIBlockOperation implements UIOperation {
        private final UIBlock mBlock;

        public UIBlockOperation(UIBlock uIBlock) {
            this.mBlock = uIBlock;
        }

        @Override // com.facebook.react.uimanager.UIViewOperationQueue.UIOperation
        public void execute() {
            this.mBlock.execute(UIViewOperationQueue.this.mNativeViewHierarchyManager);
        }
    }

    public interface UIOperation {
        void execute();
    }

    public final class UpdateInstanceHandleOperation extends ViewOperation {
        private final long mInstanceHandle;

        private UpdateInstanceHandleOperation(int i11, long j11) {
            super(i11);
            this.mInstanceHandle = j11;
        }

        @Override // com.facebook.react.uimanager.UIViewOperationQueue.UIOperation
        public void execute() {
            UIViewOperationQueue.this.mNativeViewHierarchyManager.updateInstanceHandle(this.mTag, this.mInstanceHandle);
        }
    }

    public final class UpdateLayoutOperation extends ViewOperation {
        private final int mHeight;
        private final YogaDirection mLayoutDirection;
        private final int mParentTag;
        private final int mWidth;

        /* JADX INFO: renamed from: mX */
        private final int f9926mX;

        /* JADX INFO: renamed from: mY */
        private final int f9927mY;

        public UpdateLayoutOperation(int i11, int i12, int i13, int i14, int i15, int i16, YogaDirection yogaDirection) {
            super(i12);
            this.mParentTag = i11;
            this.f9926mX = i13;
            this.f9927mY = i14;
            this.mWidth = i15;
            this.mHeight = i16;
            this.mLayoutDirection = yogaDirection;
            Systrace.m10670l(0L, "updateLayout", this.mTag);
        }

        @Override // com.facebook.react.uimanager.UIViewOperationQueue.UIOperation
        public void execute() throws Throwable {
            Systrace.m10664f(0L, "updateLayout", this.mTag);
            UIViewOperationQueue.this.mNativeViewHierarchyManager.updateLayout(this.mParentTag, this.mTag, this.f9926mX, this.f9927mY, this.mWidth, this.mHeight, this.mLayoutDirection);
        }
    }

    public final class UpdatePropertiesOperation extends ViewOperation {
        private final ReactStylesDiffMap mProps;

        private UpdatePropertiesOperation(int i11, ReactStylesDiffMap reactStylesDiffMap) {
            super(i11);
            this.mProps = reactStylesDiffMap;
        }

        @Override // com.facebook.react.uimanager.UIViewOperationQueue.UIOperation
        public void execute() {
            UIViewOperationQueue.this.mNativeViewHierarchyManager.updateProperties(this.mTag, this.mProps);
        }
    }

    public final class UpdateViewExtraData extends ViewOperation {
        private final Object mExtraData;

        public UpdateViewExtraData(int i11, Object obj) {
            super(i11);
            this.mExtraData = obj;
        }

        @Override // com.facebook.react.uimanager.UIViewOperationQueue.UIOperation
        public void execute() {
            UIViewOperationQueue.this.mNativeViewHierarchyManager.updateViewExtraData(this.mTag, this.mExtraData);
        }
    }

    public abstract class ViewOperation implements UIOperation {
        public int mTag;

        public ViewOperation(int i11) {
            this.mTag = i11;
        }
    }

    @Deprecated
    public void enqueueDispatchCommand(int i11, int i12, @Nullable ReadableArray readableArray) {
        this.mViewCommandOperations.add(new DispatchCommandOperation(i11, i12, readableArray));
    }

    @Deprecated
    public void enqueueUpdateLayout(int i11, int i12, int i13, int i14, int i15, int i16) {
        enqueueUpdateLayout(i11, i12, i13, i14, i15, i16, YogaDirection.INHERIT);
    }

    public void pauseFrameCallback() {
        this.mIsDispatchUIFrameCallbackEnqueued = false;
        ReactChoreographer.getInstance().removeFrameCallback(ReactChoreographer.CallbackType.DISPATCH_UI, this.mDispatchUIFrameCallback);
        flushPendingBatches();
    }

    public void profileNextBatch() {
        this.mIsProfilingNextBatch = true;
        this.mProfiledBatchCommitStartTime = 0L;
        this.mCreateViewCount = 0L;
        this.mUpdatePropertiesOperationCount = 0L;
    }

    public void resumeFrameCallback() {
        this.mIsDispatchUIFrameCallbackEnqueued = true;
        if (ReactNativeFeatureFlags.enableFabricRendererExclusively()) {
            return;
        }
        ReactChoreographer.getInstance().postFrameCallback(ReactChoreographer.CallbackType.DISPATCH_UI, this.mDispatchUIFrameCallback);
    }

    public static abstract class AnimationOperation implements UIOperation {
        protected final int mAnimationID;

        public AnimationOperation(int i11) {
            this.mAnimationID = i11;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void flushPendingBatches() {
        if (this.mIsInIllegalUIState) {
            C45999a.m101488I(ReactConstants.TAG, "Not flushing pending UI operations because of previously thrown Exception");
            return;
        }
        synchronized (this.mDispatchRunnablesLock) {
            if (this.mDispatchUIRunnables.isEmpty()) {
                return;
            }
            ArrayList<Runnable> arrayList = this.mDispatchUIRunnables;
            this.mDispatchUIRunnables = new ArrayList<>();
            long jUptimeMillis = SystemClock.uptimeMillis();
            Iterator<Runnable> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().run();
            }
            if (this.mIsProfilingNextBatch) {
                this.mProfiledBatchBatchedExecutionTime = SystemClock.uptimeMillis() - jUptimeMillis;
                this.mProfiledBatchNonBatchedExecutionTime = this.mNonBatchedExecutionTotalTime;
                this.mIsProfilingNextBatch = false;
                Systrace.m10661b(0L, "batchedExecutionTime", 0, jUptimeMillis * 1000000);
                Systrace.m10665g(0L, "batchedExecutionTime", 0);
            }
            this.mNonBatchedExecutionTotalTime = 0L;
        }
    }

    public void addRootView(int i11, View view) {
        this.mNativeViewHierarchyManager.addRootView(i11, view);
    }

    public void dispatchViewUpdates(final int i11, final long j11, final long j12) {
        ArrayList<DispatchCommandViewOperation> arrayList;
        final ArrayList<UIOperation> arrayList2;
        C4858a.m4990a(0L, "UIViewOperationQueue.dispatchViewUpdates").mo4992a("batchId", i11).mo4994c();
        try {
            final long jUptimeMillis = SystemClock.uptimeMillis();
            final long jCurrentThreadTimeMillis = SystemClock.currentThreadTimeMillis();
            ArrayDeque<UIOperation> arrayDeque = null;
            if (this.mViewCommandOperations.isEmpty()) {
                arrayList = null;
            } else {
                arrayList = this.mViewCommandOperations;
                this.mViewCommandOperations = new ArrayList<>();
            }
            if (this.mOperations.isEmpty()) {
                arrayList2 = null;
            } else {
                ArrayList<UIOperation> arrayList3 = this.mOperations;
                this.mOperations = new ArrayList<>();
                arrayList2 = arrayList3;
            }
            synchronized (this.mNonBatchedOperationsLock) {
                try {
                    if (!this.mNonBatchedOperations.isEmpty()) {
                        arrayDeque = this.mNonBatchedOperations;
                        this.mNonBatchedOperations = new ArrayDeque<>();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            NotThreadSafeViewHierarchyUpdateDebugListener notThreadSafeViewHierarchyUpdateDebugListener = this.mViewHierarchyUpdateDebugListener;
            if (notThreadSafeViewHierarchyUpdateDebugListener != null) {
                notThreadSafeViewHierarchyUpdateDebugListener.onViewHierarchyUpdateEnqueued();
            }
            final ArrayDeque<UIOperation> arrayDeque2 = arrayDeque;
            final ArrayList<DispatchCommandViewOperation> arrayList4 = arrayList;
            Runnable runnable = new Runnable() { // from class: com.facebook.react.uimanager.UIViewOperationQueue.1
                @Override // java.lang.Runnable
                public void run() {
                    C4858a.m4990a(0L, "DispatchUI").mo4992a("BatchId", i11).mo4994c();
                    try {
                        try {
                            long jUptimeMillis2 = SystemClock.uptimeMillis();
                            ArrayList<DispatchCommandViewOperation> arrayList5 = arrayList4;
                            if (arrayList5 != null) {
                                for (DispatchCommandViewOperation dispatchCommandViewOperation : arrayList5) {
                                    try {
                                        dispatchCommandViewOperation.executeWithExceptions();
                                    } catch (RetryableMountingLayerException e11) {
                                        if (dispatchCommandViewOperation.getRetries() == 0) {
                                            dispatchCommandViewOperation.incrementRetries();
                                            UIViewOperationQueue.this.mViewCommandOperations.add(dispatchCommandViewOperation);
                                        } else {
                                            ReactSoftExceptionLogger.logSoftException(UIViewOperationQueue.TAG, new ReactNoCrashSoftException(e11));
                                        }
                                    } catch (Throwable th3) {
                                        ReactSoftExceptionLogger.logSoftException(UIViewOperationQueue.TAG, th3);
                                    }
                                }
                            }
                            ArrayDeque arrayDeque3 = arrayDeque2;
                            if (arrayDeque3 != null) {
                                Iterator it = arrayDeque3.iterator();
                                while (it.hasNext()) {
                                    ((UIOperation) it.next()).execute();
                                }
                            }
                            ArrayList arrayList6 = arrayList2;
                            if (arrayList6 != null) {
                                Iterator it2 = arrayList6.iterator();
                                while (it2.hasNext()) {
                                    ((UIOperation) it2.next()).execute();
                                }
                            }
                            if (UIViewOperationQueue.this.mIsProfilingNextBatch && UIViewOperationQueue.this.mProfiledBatchCommitStartTime == 0) {
                                UIViewOperationQueue.this.mProfiledBatchCommitStartTime = j11;
                                UIViewOperationQueue.this.mProfiledBatchCommitEndTime = SystemClock.uptimeMillis();
                                UIViewOperationQueue.this.mProfiledBatchLayoutTime = j12;
                                UIViewOperationQueue.this.mProfiledBatchDispatchViewUpdatesTime = jUptimeMillis;
                                UIViewOperationQueue.this.mProfiledBatchRunStartTime = jUptimeMillis2;
                                UIViewOperationQueue uIViewOperationQueue = UIViewOperationQueue.this;
                                uIViewOperationQueue.mProfiledBatchRunEndTime = uIViewOperationQueue.mProfiledBatchCommitEndTime;
                                UIViewOperationQueue.this.mThreadCpuTime = jCurrentThreadTimeMillis;
                                Systrace.m10661b(0L, "delayBeforeDispatchViewUpdates", 0, UIViewOperationQueue.this.mProfiledBatchCommitStartTime * 1000000);
                                Systrace.m10666h(0L, "delayBeforeDispatchViewUpdates", 0, UIViewOperationQueue.this.mProfiledBatchDispatchViewUpdatesTime * 1000000);
                                Systrace.m10661b(0L, "delayBeforeBatchRunStart", 0, UIViewOperationQueue.this.mProfiledBatchDispatchViewUpdatesTime * 1000000);
                                Systrace.m10666h(0L, "delayBeforeBatchRunStart", 0, UIViewOperationQueue.this.mProfiledBatchRunStartTime * 1000000);
                            }
                            UIViewOperationQueue.this.mNativeViewHierarchyManager.clearLayoutAnimation();
                            if (UIViewOperationQueue.this.mViewHierarchyUpdateDebugListener != null) {
                                UIViewOperationQueue.this.mViewHierarchyUpdateDebugListener.onViewHierarchyUpdateFinished();
                            }
                            Systrace.m10667i(0L);
                        } catch (Exception e12) {
                            UIViewOperationQueue.this.mIsInIllegalUIState = true;
                            throw e12;
                        }
                    } catch (Throwable th4) {
                        Systrace.m10667i(0L);
                        throw th4;
                    }
                }
            };
            C4858a.m4990a(0L, "acquiring mDispatchRunnablesLock").mo4992a("batchId", i11).mo4994c();
            synchronized (this.mDispatchRunnablesLock) {
                Systrace.m10667i(0L);
                this.mDispatchUIRunnables.add(runnable);
            }
            if (!this.mIsDispatchUIFrameCallbackEnqueued) {
                UiThreadUtil.runOnUiThread(new GuardedRunnable(this.mReactApplicationContext) { // from class: com.facebook.react.uimanager.UIViewOperationQueue.2
                    @Override // com.facebook.react.bridge.GuardedRunnable
                    public void runGuarded() {
                        UIViewOperationQueue.this.flushPendingBatches();
                    }
                });
            }
            Systrace.m10667i(0L);
        } catch (Throwable th3) {
            Systrace.m10667i(0L);
            throw th3;
        }
    }

    public void enqueueClearJSResponder() {
        this.mOperations.add(new ChangeJSResponderOperation(0, 0, true, false));
    }

    public void enqueueConfigureLayoutAnimation(ReadableMap readableMap, Callback callback) {
        this.mOperations.add(new ConfigureLayoutAnimationOperation(readableMap, callback));
    }

    public void enqueueCreateView(ThemedReactContext themedReactContext, int i11, String str, @Nullable ReactStylesDiffMap reactStylesDiffMap) {
        synchronized (this.mNonBatchedOperationsLock) {
            this.mCreateViewCount++;
            this.mNonBatchedOperations.addLast(new CreateViewOperation(themedReactContext, i11, str, reactStylesDiffMap));
        }
    }

    public void enqueueFindTargetForTouch(int i11, float f11, float f12, Callback callback) {
        this.mOperations.add(new FindTargetForTouchOperation(i11, f11, f12, callback));
    }

    public void enqueueLayoutUpdateFinished(ReactShadowNode reactShadowNode, UIImplementation.LayoutUpdateListener layoutUpdateListener) {
        this.mOperations.add(new LayoutUpdateFinishedOperation(reactShadowNode, layoutUpdateListener));
    }

    public void enqueueManageChildren(int i11, @Nullable int[] iArr, @Nullable ViewAtIndex[] viewAtIndexArr, @Nullable int[] iArr2) {
        this.mOperations.add(new ManageChildrenOperation(i11, iArr, viewAtIndexArr, iArr2));
    }

    public void enqueueMeasure(int i11, Callback callback) {
        this.mOperations.add(new MeasureOperation(i11, callback));
    }

    public void enqueueMeasureInWindow(int i11, Callback callback) {
        this.mOperations.add(new MeasureInWindowOperation(i11, callback));
    }

    public void enqueueRemoveRootView(int i11) {
        this.mOperations.add(new RemoveRootViewOperation(i11));
    }

    public void enqueueSendAccessibilityEvent(int i11, int i12) {
        this.mOperations.add(new SendAccessibilityEvent(i11, i12));
    }

    public void enqueueSetChildren(int i11, ReadableArray readableArray) {
        this.mOperations.add(new SetChildrenOperation(i11, readableArray));
    }

    public void enqueueSetJSResponder(int i11, int i12, boolean z11) {
        this.mOperations.add(new ChangeJSResponderOperation(i11, i12, false, z11));
    }

    public void enqueueSetLayoutAnimationEnabled(boolean z11) {
        this.mOperations.add(new SetLayoutAnimationEnabledOperation(z11));
    }

    public void enqueueUIBlock(UIBlock uIBlock) {
        this.mOperations.add(new UIBlockOperation(uIBlock));
    }

    public void enqueueUpdateExtraData(int i11, Object obj) {
        this.mOperations.add(new UpdateViewExtraData(i11, obj));
    }

    public void enqueueUpdateInstanceHandle(int i11, long j11) {
        this.mOperations.add(new UpdateInstanceHandleOperation(i11, j11));
    }

    public void enqueueUpdateLayout(int i11, int i12, int i13, int i14, int i15, int i16, YogaDirection yogaDirection) {
        this.mOperations.add(new UpdateLayoutOperation(i11, i12, i13, i14, i15, i16, yogaDirection));
    }

    public void enqueueUpdateProperties(int i11, String str, ReactStylesDiffMap reactStylesDiffMap) {
        this.mUpdatePropertiesOperationCount++;
        this.mOperations.add(new UpdatePropertiesOperation(i11, reactStylesDiffMap));
    }

    public NativeViewHierarchyManager getNativeViewHierarchyManager() {
        return this.mNativeViewHierarchyManager;
    }

    public Map<String, Long> getProfiledBatchPerfCounters() {
        HashMap map = new HashMap();
        map.put("CommitStartTime", Long.valueOf(this.mProfiledBatchCommitStartTime));
        map.put("CommitEndTime", Long.valueOf(this.mProfiledBatchCommitEndTime));
        map.put("LayoutTime", Long.valueOf(this.mProfiledBatchLayoutTime));
        map.put("DispatchViewUpdatesTime", Long.valueOf(this.mProfiledBatchDispatchViewUpdatesTime));
        map.put("RunStartTime", Long.valueOf(this.mProfiledBatchRunStartTime));
        map.put("RunEndTime", Long.valueOf(this.mProfiledBatchRunEndTime));
        map.put("BatchedExecutionTime", Long.valueOf(this.mProfiledBatchBatchedExecutionTime));
        map.put("NonBatchedExecutionTime", Long.valueOf(this.mProfiledBatchNonBatchedExecutionTime));
        map.put("NativeModulesThreadCpuTime", Long.valueOf(this.mThreadCpuTime));
        map.put("CreateViewCount", Long.valueOf(this.mCreateViewCount));
        map.put("UpdatePropsCount", Long.valueOf(this.mUpdatePropertiesOperationCount));
        return map;
    }

    public boolean isEmpty() {
        return this.mOperations.isEmpty() && this.mViewCommandOperations.isEmpty();
    }

    public void prependUIBlock(UIBlock uIBlock) {
        this.mOperations.add(0, new UIBlockOperation(uIBlock));
    }

    public void setViewHierarchyUpdateDebugListener(@Nullable NotThreadSafeViewHierarchyUpdateDebugListener notThreadSafeViewHierarchyUpdateDebugListener) {
        this.mViewHierarchyUpdateDebugListener = notThreadSafeViewHierarchyUpdateDebugListener;
    }

    public UIViewOperationQueue(ReactApplicationContext reactApplicationContext, NativeViewHierarchyManager nativeViewHierarchyManager, int i11) {
        this.mNativeViewHierarchyManager = nativeViewHierarchyManager;
        this.mDispatchUIFrameCallback = new DispatchUIFrameCallback(reactApplicationContext, i11 == -1 ? 8 : i11);
        this.mReactApplicationContext = reactApplicationContext;
    }

    public void enqueueDispatchCommand(int i11, String str, @Nullable ReadableArray readableArray) {
        this.mViewCommandOperations.add(new DispatchStringCommandOperation(i11, str, readableArray));
    }

    public void enqueueUIOperation(UIOperation uIOperation) {
        SoftAssertions.assertNotNull(uIOperation);
        this.mOperations.add(uIOperation);
    }
}
