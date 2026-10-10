package com.facebook.react.animated;

import androidx.annotation.AnyThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.UiThread;
import androidx.camera.view.C1454t;
import com.facebook.fbreact.specs.NativeAnimatedModuleSpec;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.UIManager;
import com.facebook.react.bridge.UIManagerListener;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.common.annotations.VisibleForTesting;
import com.facebook.react.internal.featureflags.ReactNativeFeatureFlags;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.modules.core.ReactChoreographer;
import com.facebook.react.uimanager.GuardedFrameCallback;
import com.facebook.react.uimanager.NativeViewHierarchyManager;
import com.facebook.react.uimanager.UIBlock;
import com.facebook.react.uimanager.UIManagerHelper;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.common.ViewUtil;
import com.tencent.bugly.proguard.C33616e0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicReference;
import p302h6.C38115a;

/* JADX INFO: loaded from: classes45.dex */
@ReactModule(name = NativeAnimatedModuleSpec.NAME)
public class NativeAnimatedModule extends NativeAnimatedModuleSpec implements LifecycleEventListener, UIManagerListener {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final boolean ANIMATED_MODULE_DEBUG = false;

    @NonNull
    private final GuardedFrameCallback mAnimatedFrameCallback;
    private boolean mBatchingControlledByJS;
    private volatile long mCurrentBatchNumber;
    private volatile long mCurrentFrameNumber;
    private boolean mEnqueuedAnimationOnFrame;
    private boolean mInitializedForFabric;
    private boolean mInitializedForNonFabric;
    private final AtomicReference<NativeAnimatedNodesManager> mNodesManager;
    private int mNumFabricAnimations;
    private int mNumNonFabricAnimations;

    @NonNull
    private final ConcurrentOperationQueue mOperations;

    @NonNull
    private final ConcurrentOperationQueue mPreOperations;
    private final ReactChoreographer mReactChoreographer;
    private int mUIManagerType;

    public enum BatchExecutionOpCodes {
        OP_CODE_CREATE_ANIMATED_NODE(1),
        OP_CODE_UPDATE_ANIMATED_NODE_CONFIG(2),
        OP_CODE_GET_VALUE(3),
        OP_START_LISTENING_TO_ANIMATED_NODE_VALUE(4),
        OP_STOP_LISTENING_TO_ANIMATED_NODE_VALUE(5),
        OP_CODE_CONNECT_ANIMATED_NODES(6),
        OP_CODE_DISCONNECT_ANIMATED_NODES(7),
        OP_CODE_START_ANIMATING_NODE(8),
        OP_CODE_STOP_ANIMATION(9),
        OP_CODE_SET_ANIMATED_NODE_VALUE(10),
        OP_CODE_SET_ANIMATED_NODE_OFFSET(11),
        OP_CODE_FLATTEN_ANIMATED_NODE_OFFSET(12),
        OP_CODE_EXTRACT_ANIMATED_NODE_OFFSET(13),
        OP_CODE_CONNECT_ANIMATED_NODE_TO_VIEW(14),
        OP_CODE_DISCONNECT_ANIMATED_NODE_FROM_VIEW(15),
        OP_CODE_RESTORE_DEFAULT_VALUES(16),
        OP_CODE_DROP_ANIMATED_NODE(17),
        OP_CODE_ADD_ANIMATED_EVENT_TO_VIEW(18),
        OP_CODE_REMOVE_ANIMATED_EVENT_FROM_VIEW(19),
        OP_CODE_ADD_LISTENER(20),
        OP_CODE_REMOVE_LISTENERS(21);

        private static BatchExecutionOpCodes[] valueMap = null;
        private final int value;

        public static BatchExecutionOpCodes fromId(int i11) {
            if (valueMap == null) {
                valueMap = values();
            }
            return valueMap[i11 - 1];
        }

        public int getValue() {
            return this.value;
        }

        BatchExecutionOpCodes(int i11) {
            this.value = i11;
        }
    }

    public class ConcurrentOperationQueue {

        @Nullable
        private UIThreadOperation mPeekedOperation;
        private final Queue<UIThreadOperation> mQueue;

        private ConcurrentOperationQueue() {
            this.mQueue = new ConcurrentLinkedQueue();
            this.mPeekedOperation = null;
        }

        @AnyThread
        public void add(UIThreadOperation uIThreadOperation) {
            this.mQueue.add(uIThreadOperation);
        }

        @AnyThread
        public boolean isEmpty() {
            return this.mQueue.isEmpty() && this.mPeekedOperation == null;
        }

        /* JADX WARN: Code duplicated, block: B:15:0x002c  */
        /* JADX WARN: Code duplicated, block: B:19:0x0037 A[LOOP:0: B:6:0x000d->B:19:0x0037, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:20:0x0034 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:22:0x002b A[SYNTHETIC] */
        @Nullable
        @UiThread
        private List<UIThreadOperation> drainQueueIntoList(long j11) {
            UIThreadOperation uIThreadOperationPoll;
            if (isEmpty()) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            while (true) {
                UIThreadOperation uIThreadOperation = this.mPeekedOperation;
                if (uIThreadOperation != null) {
                    if (uIThreadOperation.getBatchNumber() <= j11) {
                        arrayList.add(this.mPeekedOperation);
                        this.mPeekedOperation = null;
                        uIThreadOperationPoll = this.mQueue.poll();
                        if (uIThreadOperationPoll == null) {
                            if (uIThreadOperationPoll.getBatchNumber() > j11) {
                                this.mPeekedOperation = uIThreadOperationPoll;
                                return arrayList;
                            }
                            arrayList.add(uIThreadOperationPoll);
                        }
                    }
                } else {
                    uIThreadOperationPoll = this.mQueue.poll();
                    if (uIThreadOperationPoll == null) {
                        if (uIThreadOperationPoll.getBatchNumber() > j11) {
                            this.mPeekedOperation = uIThreadOperationPoll;
                            return arrayList;
                        }
                        arrayList.add(uIThreadOperationPoll);
                    }
                }
                return arrayList;
            }
        }

        @UiThread
        public void executeBatch(long j11, NativeAnimatedNodesManager nativeAnimatedNodesManager) {
            List<UIThreadOperation> listDrainQueueIntoList = drainQueueIntoList(j11);
            if (listDrainQueueIntoList != null) {
                Iterator<UIThreadOperation> it = listDrainQueueIntoList.iterator();
                while (it.hasNext()) {
                    it.next().execute(nativeAnimatedNodesManager);
                }
            }
        }
    }

    public abstract class UIThreadOperation {
        long mBatchNumber;

        public abstract void execute(NativeAnimatedNodesManager nativeAnimatedNodesManager);

        private UIThreadOperation() {
            this.mBatchNumber = -1L;
        }

        public long getBatchNumber() {
            return this.mBatchNumber;
        }

        public void setBatchNumber(long j11) {
            this.mBatchNumber = j11;
        }
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void addAnimatedEventToView(double d11, final String str, final ReadableMap readableMap) {
        final int i11 = (int) d11;
        initializeLifecycleEventListenersForViewTag(i11);
        addOperation(new UIThreadOperation() { // from class: com.facebook.react.animated.NativeAnimatedModule.21
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super();
            }

            @Override // com.facebook.react.animated.NativeAnimatedModule.UIThreadOperation
            public void execute(NativeAnimatedNodesManager nativeAnimatedNodesManager) {
                nativeAnimatedNodesManager.addAnimatedEventToView(i11, str, readableMap);
            }
        });
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void connectAnimatedNodeToView(double d11, double d12) {
        final int i11 = (int) d11;
        final int i12 = (int) d12;
        initializeLifecycleEventListenersForViewTag(i12);
        addOperation(new UIThreadOperation() { // from class: com.facebook.react.animated.NativeAnimatedModule.18
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super();
            }

            @Override // com.facebook.react.animated.NativeAnimatedModule.UIThreadOperation
            public void execute(NativeAnimatedNodesManager nativeAnimatedNodesManager) {
                nativeAnimatedNodesManager.connectAnimatedNodeToView(i11, i12);
            }
        });
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void connectAnimatedNodes(double d11, double d12) {
        final int i11 = (int) d11;
        final int i12 = (int) d12;
        addOperation(new UIThreadOperation() { // from class: com.facebook.react.animated.NativeAnimatedModule.16
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super();
            }

            @Override // com.facebook.react.animated.NativeAnimatedModule.UIThreadOperation
            public void execute(NativeAnimatedNodesManager nativeAnimatedNodesManager) {
                nativeAnimatedNodesManager.connectAnimatedNodes(i11, i12);
            }
        });
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void createAnimatedNode(double d11, final ReadableMap readableMap) {
        final int i11 = (int) d11;
        addOperation(new UIThreadOperation() { // from class: com.facebook.react.animated.NativeAnimatedModule.4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super();
            }

            @Override // com.facebook.react.animated.NativeAnimatedModule.UIThreadOperation
            public void execute(NativeAnimatedNodesManager nativeAnimatedNodesManager) {
                nativeAnimatedNodesManager.createAnimatedNode(i11, readableMap);
            }
        });
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void disconnectAnimatedNodeFromView(double d11, double d12) {
        final int i11 = (int) d11;
        final int i12 = (int) d12;
        decrementInFlightAnimationsForViewTag(i12);
        addOperation(new UIThreadOperation() { // from class: com.facebook.react.animated.NativeAnimatedModule.19
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super();
            }

            @Override // com.facebook.react.animated.NativeAnimatedModule.UIThreadOperation
            public void execute(NativeAnimatedNodesManager nativeAnimatedNodesManager) {
                nativeAnimatedNodesManager.disconnectAnimatedNodeFromView(i11, i12);
            }
        });
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void disconnectAnimatedNodes(double d11, double d12) {
        final int i11 = (int) d11;
        final int i12 = (int) d12;
        addOperation(new UIThreadOperation() { // from class: com.facebook.react.animated.NativeAnimatedModule.17
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super();
            }

            @Override // com.facebook.react.animated.NativeAnimatedModule.UIThreadOperation
            public void execute(NativeAnimatedNodesManager nativeAnimatedNodesManager) {
                nativeAnimatedNodesManager.disconnectAnimatedNodes(i11, i12);
            }
        });
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void dropAnimatedNode(double d11) {
        final int i11 = (int) d11;
        addOperation(new UIThreadOperation() { // from class: com.facebook.react.animated.NativeAnimatedModule.9
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super();
            }

            @Override // com.facebook.react.animated.NativeAnimatedModule.UIThreadOperation
            public void execute(NativeAnimatedNodesManager nativeAnimatedNodesManager) {
                nativeAnimatedNodesManager.dropAnimatedNode(i11);
            }
        });
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void extractAnimatedNodeOffset(double d11) {
        final int i11 = (int) d11;
        addOperation(new UIThreadOperation() { // from class: com.facebook.react.animated.NativeAnimatedModule.13
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super();
            }

            @Override // com.facebook.react.animated.NativeAnimatedModule.UIThreadOperation
            public void execute(NativeAnimatedNodesManager nativeAnimatedNodesManager) {
                nativeAnimatedNodesManager.extractAnimatedNodeOffset(i11);
            }
        });
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void finishOperationBatch() {
        this.mBatchingControlledByJS = false;
        this.mCurrentBatchNumber++;
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void flattenAnimatedNodeOffset(double d11) {
        final int i11 = (int) d11;
        addOperation(new UIThreadOperation() { // from class: com.facebook.react.animated.NativeAnimatedModule.12
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super();
            }

            @Override // com.facebook.react.animated.NativeAnimatedModule.UIThreadOperation
            public void execute(NativeAnimatedNodesManager nativeAnimatedNodesManager) {
                nativeAnimatedNodesManager.flattenAnimatedNodeOffset(i11);
            }
        });
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void getValue(double d11, final Callback callback) {
        final int i11 = (int) d11;
        addOperation(new UIThreadOperation() { // from class: com.facebook.react.animated.NativeAnimatedModule.23
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super();
            }

            @Override // com.facebook.react.animated.NativeAnimatedModule.UIThreadOperation
            public void execute(NativeAnimatedNodesManager nativeAnimatedNodesManager) {
                nativeAnimatedNodesManager.getValue(i11, callback);
            }
        });
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void removeAnimatedEventFromView(double d11, final String str, double d12) {
        final int i11 = (int) d11;
        final int i12 = (int) d12;
        decrementInFlightAnimationsForViewTag(i11);
        addOperation(new UIThreadOperation() { // from class: com.facebook.react.animated.NativeAnimatedModule.22
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super();
            }

            @Override // com.facebook.react.animated.NativeAnimatedModule.UIThreadOperation
            public void execute(NativeAnimatedNodesManager nativeAnimatedNodesManager) {
                nativeAnimatedNodesManager.removeAnimatedEventFromView(i11, str, i12);
            }
        });
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void restoreDefaultValues(double d11) {
        final int i11 = (int) d11;
        addPreOperation(new UIThreadOperation() { // from class: com.facebook.react.animated.NativeAnimatedModule.20
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super();
            }

            @Override // com.facebook.react.animated.NativeAnimatedModule.UIThreadOperation
            public void execute(NativeAnimatedNodesManager nativeAnimatedNodesManager) {
                nativeAnimatedNodesManager.restoreDefaultValues(i11);
            }
        });
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void setAnimatedNodeOffset(double d11, final double d12) {
        final int i11 = (int) d11;
        addOperation(new UIThreadOperation() { // from class: com.facebook.react.animated.NativeAnimatedModule.11
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super();
            }

            @Override // com.facebook.react.animated.NativeAnimatedModule.UIThreadOperation
            public void execute(NativeAnimatedNodesManager nativeAnimatedNodesManager) {
                nativeAnimatedNodesManager.setAnimatedNodeOffset(i11, d12);
            }
        });
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void setAnimatedNodeValue(double d11, final double d12) {
        final int i11 = (int) d11;
        addOperation(new UIThreadOperation() { // from class: com.facebook.react.animated.NativeAnimatedModule.10
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super();
            }

            @Override // com.facebook.react.animated.NativeAnimatedModule.UIThreadOperation
            public void execute(NativeAnimatedNodesManager nativeAnimatedNodesManager) {
                nativeAnimatedNodesManager.setAnimatedNodeValue(i11, d12);
            }
        });
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void startAnimatingNode(double d11, double d12, final ReadableMap readableMap, final Callback callback) {
        final int i11 = (int) d11;
        final int i12 = (int) d12;
        addUnbatchedOperation(new UIThreadOperation() { // from class: com.facebook.react.animated.NativeAnimatedModule.14
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super();
            }

            @Override // com.facebook.react.animated.NativeAnimatedModule.UIThreadOperation
            public void execute(NativeAnimatedNodesManager nativeAnimatedNodesManager) {
                nativeAnimatedNodesManager.startAnimatingNode(i11, i12, readableMap, callback);
            }
        });
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void startListeningToAnimatedNodeValue(double d11) {
        final int i11 = (int) d11;
        final AnimatedNodeValueListener animatedNodeValueListener = new AnimatedNodeValueListener() { // from class: com.facebook.react.animated.NativeAnimatedModule.6
            @Override // com.facebook.react.animated.AnimatedNodeValueListener
            public void onValueUpdate(double d12) {
                WritableMap writableMapCreateMap = Arguments.createMap();
                writableMapCreateMap.putInt("tag", i11);
                writableMapCreateMap.putDouble("value", d12);
                ReactApplicationContext reactApplicationContextIfActiveOrWarn = NativeAnimatedModule.this.getReactApplicationContextIfActiveOrWarn();
                if (reactApplicationContextIfActiveOrWarn != null) {
                    reactApplicationContextIfActiveOrWarn.emitDeviceEvent("onAnimatedValueUpdate", writableMapCreateMap);
                }
            }
        };
        addOperation(new UIThreadOperation() { // from class: com.facebook.react.animated.NativeAnimatedModule.7
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super();
            }

            @Override // com.facebook.react.animated.NativeAnimatedModule.UIThreadOperation
            public void execute(NativeAnimatedNodesManager nativeAnimatedNodesManager) {
                nativeAnimatedNodesManager.startListeningToAnimatedNodeValue(i11, animatedNodeValueListener);
            }
        });
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void startOperationBatch() {
        this.mBatchingControlledByJS = true;
        this.mCurrentBatchNumber++;
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void stopAnimation(double d11) {
        final int i11 = (int) d11;
        addOperation(new UIThreadOperation() { // from class: com.facebook.react.animated.NativeAnimatedModule.15
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super();
            }

            @Override // com.facebook.react.animated.NativeAnimatedModule.UIThreadOperation
            public void execute(NativeAnimatedNodesManager nativeAnimatedNodesManager) {
                nativeAnimatedNodesManager.stopAnimation(i11);
            }
        });
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void stopListeningToAnimatedNodeValue(double d11) {
        final int i11 = (int) d11;
        addOperation(new UIThreadOperation() { // from class: com.facebook.react.animated.NativeAnimatedModule.8
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super();
            }

            @Override // com.facebook.react.animated.NativeAnimatedModule.UIThreadOperation
            public void execute(NativeAnimatedNodesManager nativeAnimatedNodesManager) {
                nativeAnimatedNodesManager.stopListeningToAnimatedNodeValue(i11);
            }
        });
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void updateAnimatedNodeConfig(double d11, final ReadableMap readableMap) {
        final int i11 = (int) d11;
        addOperation(new UIThreadOperation() { // from class: com.facebook.react.animated.NativeAnimatedModule.5
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super();
            }

            @Override // com.facebook.react.animated.NativeAnimatedModule.UIThreadOperation
            public void execute(NativeAnimatedNodesManager nativeAnimatedNodesManager) {
                nativeAnimatedNodesManager.updateAnimatedNodeConfig(i11, readableMap);
            }
        });
    }

    /* JADX INFO: renamed from: com.facebook.react.animated.NativeAnimatedModule$25 */
    public static /* synthetic */ class C579825 {

        /* JADX INFO: renamed from: $SwitchMap$com$facebook$react$animated$NativeAnimatedModule$BatchExecutionOpCodes */
        static final /* synthetic */ int[] f9682xb6ab8f2a;

        static {
            int[] iArr = new int[BatchExecutionOpCodes.values().length];
            f9682xb6ab8f2a = iArr;
            try {
                iArr[BatchExecutionOpCodes.OP_CODE_GET_VALUE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f9682xb6ab8f2a[BatchExecutionOpCodes.OP_START_LISTENING_TO_ANIMATED_NODE_VALUE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f9682xb6ab8f2a[BatchExecutionOpCodes.OP_STOP_LISTENING_TO_ANIMATED_NODE_VALUE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f9682xb6ab8f2a[BatchExecutionOpCodes.OP_CODE_STOP_ANIMATION.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f9682xb6ab8f2a[BatchExecutionOpCodes.OP_CODE_FLATTEN_ANIMATED_NODE_OFFSET.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f9682xb6ab8f2a[BatchExecutionOpCodes.OP_CODE_EXTRACT_ANIMATED_NODE_OFFSET.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f9682xb6ab8f2a[BatchExecutionOpCodes.OP_CODE_RESTORE_DEFAULT_VALUES.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f9682xb6ab8f2a[BatchExecutionOpCodes.OP_CODE_DROP_ANIMATED_NODE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f9682xb6ab8f2a[BatchExecutionOpCodes.OP_CODE_ADD_LISTENER.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f9682xb6ab8f2a[BatchExecutionOpCodes.OP_CODE_REMOVE_LISTENERS.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f9682xb6ab8f2a[BatchExecutionOpCodes.OP_CODE_CREATE_ANIMATED_NODE.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f9682xb6ab8f2a[BatchExecutionOpCodes.OP_CODE_UPDATE_ANIMATED_NODE_CONFIG.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f9682xb6ab8f2a[BatchExecutionOpCodes.OP_CODE_CONNECT_ANIMATED_NODES.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f9682xb6ab8f2a[BatchExecutionOpCodes.OP_CODE_DISCONNECT_ANIMATED_NODES.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f9682xb6ab8f2a[BatchExecutionOpCodes.OP_CODE_SET_ANIMATED_NODE_VALUE.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f9682xb6ab8f2a[BatchExecutionOpCodes.OP_CODE_SET_ANIMATED_NODE_OFFSET.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f9682xb6ab8f2a[BatchExecutionOpCodes.OP_CODE_DISCONNECT_ANIMATED_NODE_FROM_VIEW.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f9682xb6ab8f2a[BatchExecutionOpCodes.OP_CODE_START_ANIMATING_NODE.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                f9682xb6ab8f2a[BatchExecutionOpCodes.OP_CODE_REMOVE_ANIMATED_EVENT_FROM_VIEW.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f9682xb6ab8f2a[BatchExecutionOpCodes.OP_CODE_CONNECT_ANIMATED_NODE_TO_VIEW.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f9682xb6ab8f2a[BatchExecutionOpCodes.OP_CODE_ADD_ANIMATED_EVENT_TO_VIEW.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
        }
    }

    private void addOperation(UIThreadOperation uIThreadOperation) {
        uIThreadOperation.setBatchNumber(this.mCurrentBatchNumber);
        this.mOperations.add(uIThreadOperation);
    }

    private void addPreOperation(UIThreadOperation uIThreadOperation) {
        uIThreadOperation.setBatchNumber(this.mCurrentBatchNumber);
        this.mPreOperations.add(uIThreadOperation);
    }

    private void addUnbatchedOperation(UIThreadOperation uIThreadOperation) {
        uIThreadOperation.setBatchNumber(-1L);
        this.mOperations.add(uIThreadOperation);
    }

    private void clearFrameCallback() {
        ((ReactChoreographer) C38115a.m86047c(this.mReactChoreographer)).removeFrameCallback(ReactChoreographer.CallbackType.NATIVE_ANIMATED_MODULE, this.mAnimatedFrameCallback);
        this.mEnqueuedAnimationOnFrame = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void enqueueFrameCallback() {
        if (this.mEnqueuedAnimationOnFrame) {
            return;
        }
        ((ReactChoreographer) C38115a.m86047c(this.mReactChoreographer)).postFrameCallback(ReactChoreographer.CallbackType.NATIVE_ANIMATED_MODULE, this.mAnimatedFrameCallback);
        this.mEnqueuedAnimationOnFrame = true;
    }

    @Override // com.facebook.react.bridge.UIManagerListener
    @UiThread
    public void didDispatchMountItems(UIManager uIManager) {
        if (this.mUIManagerType != 2) {
            return;
        }
        long j11 = this.mCurrentBatchNumber - 1;
        if (!this.mBatchingControlledByJS) {
            this.mCurrentFrameNumber++;
            if (this.mCurrentFrameNumber - this.mCurrentBatchNumber > 2) {
                this.mCurrentBatchNumber = this.mCurrentFrameNumber;
                j11 = this.mCurrentBatchNumber;
            }
        }
        this.mPreOperations.executeBatch(j11, getNodesManager());
        this.mOperations.executeBatch(j11, getNodesManager());
    }

    @Override // com.facebook.react.bridge.UIManagerListener
    public void didScheduleMountItems(UIManager uIManager) {
        this.mCurrentFrameNumber++;
    }

    @Nullable
    public NativeAnimatedNodesManager getNodesManager() {
        ReactApplicationContext reactApplicationContextIfActiveOrWarn;
        if (this.mNodesManager.get() == null && (reactApplicationContextIfActiveOrWarn = getReactApplicationContextIfActiveOrWarn()) != null) {
            C1454t.m2255a(this.mNodesManager, null, new NativeAnimatedNodesManager(reactApplicationContextIfActiveOrWarn));
        }
        return this.mNodesManager.get();
    }

    @VisibleForTesting
    public void setNodesManager(NativeAnimatedNodesManager nativeAnimatedNodesManager) {
        this.mNodesManager.set(nativeAnimatedNodesManager);
    }

    public void userDrivenScrollEnded(int i11) {
        NativeAnimatedNodesManager nativeAnimatedNodesManager = this.mNodesManager.get();
        if (nativeAnimatedNodesManager == null) {
            return;
        }
        Set<Integer> tagsOfConnectedNodes = nativeAnimatedNodesManager.getTagsOfConnectedNodes(i11, "topScrollEnded");
        if (tagsOfConnectedNodes.isEmpty()) {
            return;
        }
        WritableArray writableArrayCreateArray = Arguments.createArray();
        Iterator<Integer> it = tagsOfConnectedNodes.iterator();
        while (it.hasNext()) {
            writableArrayCreateArray.pushInt(it.next().intValue());
        }
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putArray(C33616e0.f69644s, writableArrayCreateArray);
        ReactApplicationContext reactApplicationContextIfActiveOrWarn = getReactApplicationContextIfActiveOrWarn();
        if (reactApplicationContextIfActiveOrWarn != null) {
            reactApplicationContextIfActiveOrWarn.emitDeviceEvent("onUserDrivenAnimationEnded", writableMapCreateMap);
        }
    }

    @Override // com.facebook.react.bridge.UIManagerListener
    @UiThread
    public void willDispatchViewUpdates(UIManager uIManager) {
        if ((this.mOperations.isEmpty() && this.mPreOperations.isEmpty()) || this.mUIManagerType == 2) {
            return;
        }
        final long j11 = this.mCurrentBatchNumber;
        this.mCurrentBatchNumber = 1 + j11;
        UIBlock uIBlock = new UIBlock() { // from class: com.facebook.react.animated.NativeAnimatedModule.2
            @Override // com.facebook.react.uimanager.UIBlock
            public void execute(NativeViewHierarchyManager nativeViewHierarchyManager) {
                NativeAnimatedModule.this.mPreOperations.executeBatch(j11, NativeAnimatedModule.this.getNodesManager());
            }
        };
        UIBlock uIBlock2 = new UIBlock() { // from class: com.facebook.react.animated.NativeAnimatedModule.3
            @Override // com.facebook.react.uimanager.UIBlock
            public void execute(NativeViewHierarchyManager nativeViewHierarchyManager) {
                NativeAnimatedModule.this.mOperations.executeBatch(j11, NativeAnimatedModule.this.getNodesManager());
            }
        };
        UIManagerModule uIManagerModule = (UIManagerModule) uIManager;
        uIManagerModule.prependUIBlock(uIBlock);
        uIManagerModule.addUIBlock(uIBlock2);
    }

    public NativeAnimatedModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.mOperations = new ConcurrentOperationQueue();
        this.mPreOperations = new ConcurrentOperationQueue();
        this.mNodesManager = new AtomicReference<>();
        this.mBatchingControlledByJS = false;
        this.mInitializedForFabric = false;
        this.mInitializedForNonFabric = false;
        this.mEnqueuedAnimationOnFrame = false;
        this.mUIManagerType = 1;
        this.mNumFabricAnimations = 0;
        this.mNumNonFabricAnimations = 0;
        this.mReactChoreographer = ReactChoreographer.getInstance();
        this.mAnimatedFrameCallback = new GuardedFrameCallback(reactApplicationContext) { // from class: com.facebook.react.animated.NativeAnimatedModule.1
            @Override // com.facebook.react.uimanager.GuardedFrameCallback
            public void doFrameGuarded(long j11) {
                try {
                    NativeAnimatedModule.this.mEnqueuedAnimationOnFrame = false;
                    NativeAnimatedNodesManager nodesManager = NativeAnimatedModule.this.getNodesManager();
                    if (nodesManager != null && nodesManager.hasActiveAnimations()) {
                        nodesManager.runUpdates(j11);
                    }
                    if (nodesManager != null && NativeAnimatedModule.this.mReactChoreographer != null) {
                        if (!ReactNativeFeatureFlags.lazyAnimationCallbacks() || nodesManager.hasActiveAnimations()) {
                            NativeAnimatedModule.this.enqueueFrameCallback();
                        }
                    }
                } catch (Exception e11) {
                    throw new RuntimeException(e11);
                }
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void decrementInFlightAnimationsForViewTag(int i11) {
        if (ViewUtil.getUIManagerType(i11) == 2) {
            this.mNumFabricAnimations--;
        } else {
            this.mNumNonFabricAnimations--;
        }
        int i12 = this.mNumNonFabricAnimations;
        if (i12 == 0 && this.mNumFabricAnimations > 0 && this.mUIManagerType != 2) {
            this.mUIManagerType = 2;
        } else if (this.mNumFabricAnimations == 0 && i12 > 0 && this.mUIManagerType != 1) {
            this.mUIManagerType = 1;
        }
    }

    private void initializeLifecycleEventListenersForViewTag(int i11) {
        UIManager uIManager;
        int uIManagerType = ViewUtil.getUIManagerType(i11);
        this.mUIManagerType = uIManagerType;
        if (uIManagerType == 2) {
            this.mNumFabricAnimations++;
        } else {
            this.mNumNonFabricAnimations++;
        }
        NativeAnimatedNodesManager nodesManager = getNodesManager();
        if (nodesManager != null) {
            nodesManager.initializeEventListenerForUIManagerType(this.mUIManagerType);
        } else {
            ReactSoftExceptionLogger.logSoftException(NativeAnimatedModuleSpec.NAME, new RuntimeException("initializeLifecycleEventListenersForViewTag could not get NativeAnimatedNodesManager"));
        }
        if (this.mUIManagerType == 2) {
            if (this.mInitializedForFabric) {
                return;
            }
        } else if (this.mInitializedForNonFabric) {
            return;
        }
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        if (reactApplicationContext != null && (uIManager = UIManagerHelper.getUIManager(reactApplicationContext, this.mUIManagerType)) != null) {
            uIManager.addUIManagerEventListener(this);
            if (this.mUIManagerType == 2) {
                this.mInitializedForFabric = true;
            } else {
                this.mInitializedForNonFabric = true;
            }
        }
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void initialize() {
        super.initialize();
        getReactApplicationContext().addLifecycleEventListener(this);
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void invalidate() {
        super.invalidate();
        getReactApplicationContext().removeLifecycleEventListener(this);
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostDestroy() {
        clearFrameCallback();
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostPause() {
        clearFrameCallback();
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostResume() {
        enqueueFrameCallback();
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void queueAndExecuteBatchedOperations(final ReadableArray readableArray) {
        final int size = readableArray.size();
        int i11 = 0;
        while (i11 < size) {
            int i12 = i11 + 1;
            switch (C579825.f9682xb6ab8f2a[BatchExecutionOpCodes.fromId(readableArray.getInt(i11)).ordinal()]) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                    i11 += 2;
                    continue;
                case 11:
                case 12:
                case 13:
                case 14:
                case 15:
                case 16:
                case 17:
                    i11 += 3;
                    continue;
                case 18:
                case 19:
                    break;
                case 20:
                    int i13 = i11 + 2;
                    i11 += 3;
                    initializeLifecycleEventListenersForViewTag(readableArray.getInt(i13));
                    continue;
                case 21:
                    initializeLifecycleEventListenersForViewTag(readableArray.getInt(i12));
                    break;
                default:
                    throw new IllegalArgumentException("Batch animation execution op: fetching viewTag: unknown op code");
            }
            i11 += 4;
        }
        startOperationBatch();
        addUnbatchedOperation(new UIThreadOperation() { // from class: com.facebook.react.animated.NativeAnimatedModule.24
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super();
            }

            @Override // com.facebook.react.animated.NativeAnimatedModule.UIThreadOperation
            public void execute(NativeAnimatedNodesManager nativeAnimatedNodesManager) {
                NativeAnimatedModule.this.getReactApplicationContextIfActiveOrWarn();
                int i14 = 0;
                while (i14 < size) {
                    int i15 = i14 + 1;
                    switch (C579825.f9682xb6ab8f2a[BatchExecutionOpCodes.fromId(readableArray.getInt(i14)).ordinal()]) {
                        case 1:
                            i14 += 2;
                            nativeAnimatedNodesManager.getValue(readableArray.getInt(i15), null);
                            break;
                        case 2:
                            i14 += 2;
                            final int i16 = readableArray.getInt(i15);
                            nativeAnimatedNodesManager.startListeningToAnimatedNodeValue(i16, new AnimatedNodeValueListener() { // from class: com.facebook.react.animated.NativeAnimatedModule.24.1
                                @Override // com.facebook.react.animated.AnimatedNodeValueListener
                                public void onValueUpdate(double d11) {
                                    WritableMap writableMapCreateMap = Arguments.createMap();
                                    writableMapCreateMap.putInt("tag", i16);
                                    writableMapCreateMap.putDouble("value", d11);
                                    ReactApplicationContext reactApplicationContextIfActiveOrWarn = NativeAnimatedModule.this.getReactApplicationContextIfActiveOrWarn();
                                    if (reactApplicationContextIfActiveOrWarn != null) {
                                        reactApplicationContextIfActiveOrWarn.emitDeviceEvent("onAnimatedValueUpdate", writableMapCreateMap);
                                    }
                                }
                            });
                            break;
                        case 3:
                            i14 += 2;
                            nativeAnimatedNodesManager.stopListeningToAnimatedNodeValue(readableArray.getInt(i15));
                            break;
                        case 4:
                            i14 += 2;
                            nativeAnimatedNodesManager.stopAnimation(readableArray.getInt(i15));
                            break;
                        case 5:
                            i14 += 2;
                            nativeAnimatedNodesManager.flattenAnimatedNodeOffset(readableArray.getInt(i15));
                            break;
                        case 6:
                            i14 += 2;
                            nativeAnimatedNodesManager.extractAnimatedNodeOffset(readableArray.getInt(i15));
                            break;
                        case 7:
                            i14 += 2;
                            nativeAnimatedNodesManager.restoreDefaultValues(readableArray.getInt(i15));
                            break;
                        case 8:
                            i14 += 2;
                            nativeAnimatedNodesManager.dropAnimatedNode(readableArray.getInt(i15));
                            break;
                        case 9:
                        case 10:
                            i14 += 2;
                            break;
                        case 11:
                            int i17 = i14 + 2;
                            i14 += 3;
                            nativeAnimatedNodesManager.createAnimatedNode(readableArray.getInt(i15), readableArray.getMap(i17));
                            break;
                        case 12:
                            int i18 = i14 + 2;
                            i14 += 3;
                            nativeAnimatedNodesManager.updateAnimatedNodeConfig(readableArray.getInt(i15), readableArray.getMap(i18));
                            break;
                        case 13:
                            int i19 = i14 + 2;
                            i14 += 3;
                            nativeAnimatedNodesManager.connectAnimatedNodes(readableArray.getInt(i15), readableArray.getInt(i19));
                            break;
                        case 14:
                            int i21 = i14 + 2;
                            i14 += 3;
                            nativeAnimatedNodesManager.disconnectAnimatedNodes(readableArray.getInt(i15), readableArray.getInt(i21));
                            break;
                        case 15:
                            int i22 = i14 + 2;
                            i14 += 3;
                            nativeAnimatedNodesManager.setAnimatedNodeValue(readableArray.getInt(i15), readableArray.getDouble(i22));
                            break;
                        case 16:
                            int i23 = i14 + 2;
                            i14 += 3;
                            nativeAnimatedNodesManager.setAnimatedNodeValue(readableArray.getInt(i15), readableArray.getDouble(i23));
                            break;
                        case 17:
                            int i24 = i14 + 2;
                            int i25 = readableArray.getInt(i15);
                            i14 += 3;
                            int i26 = readableArray.getInt(i24);
                            NativeAnimatedModule.this.decrementInFlightAnimationsForViewTag(i26);
                            nativeAnimatedNodesManager.disconnectAnimatedNodeFromView(i25, i26);
                            break;
                        case 18:
                            if (ReactNativeFeatureFlags.lazyAnimationCallbacks()) {
                                NativeAnimatedModule.this.enqueueFrameCallback();
                            }
                            int i27 = readableArray.getInt(i15);
                            int i28 = i14 + 3;
                            int i29 = readableArray.getInt(i14 + 2);
                            i14 += 4;
                            nativeAnimatedNodesManager.startAnimatingNode(i27, i29, readableArray.getMap(i28), null);
                            break;
                        case 19:
                            int i31 = readableArray.getInt(i15);
                            NativeAnimatedModule.this.decrementInFlightAnimationsForViewTag(i31);
                            int i32 = i14 + 3;
                            String string = readableArray.getString(i14 + 2);
                            i14 += 4;
                            nativeAnimatedNodesManager.removeAnimatedEventFromView(i31, string, readableArray.getInt(i32));
                            break;
                        case 20:
                            int i33 = i14 + 2;
                            i14 += 3;
                            nativeAnimatedNodesManager.connectAnimatedNodeToView(readableArray.getInt(i15), readableArray.getInt(i33));
                            break;
                        case 21:
                            int i34 = readableArray.getInt(i15);
                            int i35 = i14 + 3;
                            String string2 = readableArray.getString(i14 + 2);
                            i14 += 4;
                            nativeAnimatedNodesManager.addAnimatedEventToView(i34, string2, readableArray.getMap(i35));
                            break;
                        default:
                            throw new IllegalArgumentException("Batch animation execution op: unknown op code");
                    }
                }
            }
        });
        finishOperationBatch();
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void addListener(String str) {
    }

    @Override // com.facebook.react.bridge.UIManagerListener
    public void didMountItems(UIManager uIManager) {
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void removeListeners(double d11) {
    }

    @Override // com.facebook.react.bridge.UIManagerListener
    public void willMountItems(UIManager uIManager) {
    }
}
