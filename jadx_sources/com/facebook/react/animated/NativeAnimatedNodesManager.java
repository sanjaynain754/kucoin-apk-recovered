package com.facebook.react.animated;

import android.util.SparseArray;
import androidx.annotation.Nullable;
import androidx.annotation.UiThread;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.JSApplicationCausedNativeException;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactNoCrashSoftException;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.UIManager;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.UIManagerHelper;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.uimanager.events.Event;
import com.facebook.react.uimanager.events.EventDispatcherListener;
import com.jumio.core.extraction.ProcessingTimesRecorderKt;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import p747x3.C45999a;

/* JADX INFO: loaded from: classes45.dex */
public class NativeAnimatedNodesManager implements EventDispatcherListener {
    private static final String TAG = "NativeAnimatedNodesManager";
    private final ReactApplicationContext mReactApplicationContext;
    private final SparseArray<AnimatedNode> mAnimatedNodes = new SparseArray<>();
    private final SparseArray<AnimationDriver> mActiveAnimations = new SparseArray<>();
    private final SparseArray<AnimatedNode> mUpdatedNodes = new SparseArray<>();
    private final List<EventAnimationDriver> mEventDrivers = new ArrayList();
    private int mAnimatedGraphBFSColor = 0;
    private final List<AnimatedNode> mRunUpdateNodeList = new LinkedList();
    private boolean mEventListenerInitializedForFabric = false;
    private boolean mEventListenerInitializedForNonFabric = false;
    private boolean mWarnedAboutGraphTraversal = false;

    @UiThread
    private void stopAnimationsForNode(AnimatedNode animatedNode) {
        WritableArray writableArrayCreateArray = null;
        int i11 = 0;
        while (i11 < this.mActiveAnimations.size()) {
            AnimationDriver animationDriverValueAt = this.mActiveAnimations.valueAt(i11);
            if (animatedNode.equals(animationDriverValueAt.animatedValue)) {
                if (animationDriverValueAt.endCallback != null) {
                    WritableMap writableMapCreateMap = Arguments.createMap();
                    writableMapCreateMap.putBoolean("finished", false);
                    writableMapCreateMap.putDouble("value", animationDriverValueAt.animatedValue.nodeValue);
                    animationDriverValueAt.endCallback.invoke(writableMapCreateMap);
                } else if (this.mReactApplicationContext != null) {
                    WritableMap writableMapCreateMap2 = Arguments.createMap();
                    writableMapCreateMap2.putInt("animationId", animationDriverValueAt.id);
                    writableMapCreateMap2.putBoolean("finished", false);
                    writableMapCreateMap2.putDouble("value", animationDriverValueAt.animatedValue.nodeValue);
                    if (writableArrayCreateArray == null) {
                        writableArrayCreateArray = Arguments.createArray();
                    }
                    writableArrayCreateArray.pushMap(writableMapCreateMap2);
                }
                this.mActiveAnimations.removeAt(i11);
                i11--;
            }
            i11++;
        }
        if (writableArrayCreateArray != null) {
            this.mReactApplicationContext.emitDeviceEvent("onNativeAnimatedModuleAnimationFinished", writableArrayCreateArray);
        }
    }

    public void initializeEventListenerForUIManagerType(int i11) {
        if (i11 == 2) {
            if (this.mEventListenerInitializedForFabric) {
                return;
            }
        } else if (this.mEventListenerInitializedForNonFabric) {
            return;
        }
        UIManager uIManager = UIManagerHelper.getUIManager(this.mReactApplicationContext, i11);
        if (uIManager != null) {
            uIManager.getEventDispatcher().addListener(this);
            if (i11 == 2) {
                this.mEventListenerInitializedForFabric = true;
            } else {
                this.mEventListenerInitializedForNonFabric = true;
            }
        }
    }

    @UiThread
    public void stopAnimation(int i11) {
        WritableArray writableArrayCreateArray;
        int i12 = 0;
        while (true) {
            writableArrayCreateArray = null;
            if (i12 >= this.mActiveAnimations.size()) {
                break;
            }
            AnimationDriver animationDriverValueAt = this.mActiveAnimations.valueAt(i12);
            if (animationDriverValueAt.id == i11) {
                if (animationDriverValueAt.endCallback != null) {
                    WritableMap writableMapCreateMap = Arguments.createMap();
                    writableMapCreateMap.putBoolean("finished", false);
                    writableMapCreateMap.putDouble("value", animationDriverValueAt.animatedValue.nodeValue);
                    animationDriverValueAt.endCallback.invoke(writableMapCreateMap);
                } else if (this.mReactApplicationContext != null) {
                    WritableMap writableMapCreateMap2 = Arguments.createMap();
                    writableMapCreateMap2.putInt("animationId", animationDriverValueAt.id);
                    writableMapCreateMap2.putBoolean("finished", false);
                    writableMapCreateMap2.putDouble("value", animationDriverValueAt.animatedValue.nodeValue);
                    writableArrayCreateArray = Arguments.createArray();
                    writableArrayCreateArray.pushMap(writableMapCreateMap2);
                }
                this.mActiveAnimations.removeAt(i12);
                break;
            }
            i12++;
        }
        if (writableArrayCreateArray != null) {
            this.mReactApplicationContext.emitDeviceEvent("onNativeAnimatedModuleAnimationFinished", writableArrayCreateArray);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @UiThread
    public void handleEvent(Event event) {
        if (this.mEventDrivers.isEmpty()) {
            return;
        }
        Event.EventAnimationDriverMatchSpec eventAnimationDriverMatchSpec = event.getEventAnimationDriverMatchSpec();
        boolean z11 = false;
        for (EventAnimationDriver eventAnimationDriver : this.mEventDrivers) {
            if (eventAnimationDriverMatchSpec.match(eventAnimationDriver.viewTag, eventAnimationDriver.eventName)) {
                stopAnimationsForNode(eventAnimationDriver.valueNode);
                event.dispatchModern(eventAnimationDriver);
                this.mRunUpdateNodeList.add(eventAnimationDriver.valueNode);
                z11 = true;
            }
        }
        if (z11) {
            updateNodes(this.mRunUpdateNodeList);
            this.mRunUpdateNodeList.clear();
        }
    }

    private String normalizeEventName(String str) {
        if (!str.startsWith(ViewProps.ON)) {
            return str;
        }
        return ViewProps.TOP + str.substring(2);
    }

    @UiThread
    private void updateNodes(List<AnimatedNode> list) {
        int i11 = this.mAnimatedGraphBFSColor;
        int i12 = i11 + 1;
        this.mAnimatedGraphBFSColor = i12;
        if (i12 == 0) {
            this.mAnimatedGraphBFSColor = i11 + 2;
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        int i13 = 0;
        for (AnimatedNode animatedNode : list) {
            int i14 = animatedNode.BFSColor;
            int i15 = this.mAnimatedGraphBFSColor;
            if (i14 != i15) {
                animatedNode.BFSColor = i15;
                i13++;
                arrayDeque.add(animatedNode);
            }
        }
        while (!arrayDeque.isEmpty()) {
            AnimatedNode animatedNode2 = (AnimatedNode) arrayDeque.poll();
            if (animatedNode2.children != null) {
                for (int i16 = 0; i16 < animatedNode2.children.size(); i16++) {
                    AnimatedNode animatedNode3 = animatedNode2.children.get(i16);
                    animatedNode3.activeIncomingNodes++;
                    int i17 = animatedNode3.BFSColor;
                    int i18 = this.mAnimatedGraphBFSColor;
                    if (i17 != i18) {
                        animatedNode3.BFSColor = i18;
                        i13++;
                        arrayDeque.add(animatedNode3);
                    }
                }
            }
        }
        int i19 = this.mAnimatedGraphBFSColor;
        int i21 = i19 + 1;
        this.mAnimatedGraphBFSColor = i21;
        if (i21 == 0) {
            this.mAnimatedGraphBFSColor = i19 + 2;
        }
        int i22 = 0;
        for (AnimatedNode animatedNode4 : list) {
            if (animatedNode4.activeIncomingNodes == 0) {
                int i23 = animatedNode4.BFSColor;
                int i24 = this.mAnimatedGraphBFSColor;
                if (i23 != i24) {
                    animatedNode4.BFSColor = i24;
                    i22++;
                    arrayDeque.add(animatedNode4);
                }
            }
        }
        int i25 = 0;
        while (!arrayDeque.isEmpty()) {
            AnimatedNode animatedNode5 = (AnimatedNode) arrayDeque.poll();
            try {
                animatedNode5.update();
                if (animatedNode5 instanceof PropsAnimatedNode) {
                    ((PropsAnimatedNode) animatedNode5).updateView();
                }
            } catch (JSApplicationCausedNativeException e11) {
                C45999a.m101508n(TAG, "Native animation workaround, frame lost as result of race condition", e11);
            }
            if (animatedNode5 instanceof ValueAnimatedNode) {
                ((ValueAnimatedNode) animatedNode5).onValueUpdate();
            }
            if (animatedNode5.children != null) {
                for (int i26 = 0; i26 < animatedNode5.children.size(); i26++) {
                    AnimatedNode animatedNode6 = animatedNode5.children.get(i26);
                    int i27 = animatedNode6.activeIncomingNodes - 1;
                    animatedNode6.activeIncomingNodes = i27;
                    int i28 = animatedNode6.BFSColor;
                    int i29 = this.mAnimatedGraphBFSColor;
                    if (i28 != i29 && i27 == 0) {
                        animatedNode6.BFSColor = i29;
                        i22++;
                        arrayDeque.add(animatedNode6);
                    } else if (i28 == i29) {
                        i25++;
                    }
                }
            }
        }
        if (i13 == i22) {
            this.mWarnedAboutGraphTraversal = false;
            return;
        }
        if (this.mWarnedAboutGraphTraversal) {
            return;
        }
        this.mWarnedAboutGraphTraversal = true;
        C45999a.m101507m(TAG, "Detected animation cycle or disconnected graph. ");
        Iterator<AnimatedNode> it = list.iterator();
        while (it.hasNext()) {
            C45999a.m101507m(TAG, it.next().prettyPrintWithChildren());
        }
        IllegalStateException illegalStateException = new IllegalStateException("Looks like animated nodes graph has " + (i25 > 0 ? "cycles (" + i25 + ")" : "disconnected regions") + ", there are " + i13 + " but toposort visited only " + i22);
        boolean z11 = this.mEventListenerInitializedForFabric;
        if (z11 && i25 == 0) {
            ReactSoftExceptionLogger.logSoftException(TAG, new ReactNoCrashSoftException(illegalStateException));
        } else {
            if (!z11) {
                throw illegalStateException;
            }
            ReactSoftExceptionLogger.logSoftException(TAG, new ReactNoCrashSoftException(illegalStateException));
        }
    }

    @UiThread
    public void addAnimatedEventToView(int i11, String str, ReadableMap readableMap) {
        int i12 = readableMap.getInt("animatedValueTag");
        AnimatedNode animatedNode = this.mAnimatedNodes.get(i12);
        if (animatedNode == null) {
            throw new JSApplicationIllegalArgumentException("addAnimatedEventToView: Animated node with tag [" + i12 + "] does not exist");
        }
        if (!(animatedNode instanceof ValueAnimatedNode)) {
            throw new JSApplicationIllegalArgumentException("addAnimatedEventToView: Animated node on view [" + i11 + "] connected to event handler (" + str + ") should be of type " + ValueAnimatedNode.class.getName());
        }
        ReadableArray array = readableMap.getArray("nativeEventPath");
        ArrayList arrayList = new ArrayList(array.size());
        for (int i13 = 0; i13 < array.size(); i13++) {
            arrayList.add(array.getString(i13));
        }
        String strNormalizeEventName = normalizeEventName(str);
        this.mEventDrivers.add(new EventAnimationDriver(strNormalizeEventName, i11, arrayList, (ValueAnimatedNode) animatedNode));
        if (strNormalizeEventName.equals("topScroll")) {
            addAnimatedEventToView(i11, "topScrollEnded", readableMap);
        }
    }

    @UiThread
    public void connectAnimatedNodeToView(int i11, int i12) {
        AnimatedNode animatedNode = this.mAnimatedNodes.get(i11);
        if (animatedNode == null) {
            throw new JSApplicationIllegalArgumentException("connectAnimatedNodeToView: Animated node with tag [" + i11 + "] does not exist");
        }
        if (!(animatedNode instanceof PropsAnimatedNode)) {
            throw new JSApplicationIllegalArgumentException("connectAnimatedNodeToView: Animated node connected to view [" + i12 + "] should be of type " + PropsAnimatedNode.class.getName());
        }
        ReactApplicationContext reactApplicationContext = this.mReactApplicationContext;
        if (reactApplicationContext == null) {
            throw new IllegalStateException("connectAnimatedNodeToView: Animated node could not be connected, no ReactApplicationContext: " + i12);
        }
        UIManager uIManagerForReactTag = UIManagerHelper.getUIManagerForReactTag(reactApplicationContext, i12);
        if (uIManagerForReactTag != null) {
            ((PropsAnimatedNode) animatedNode).connectToView(i12, uIManagerForReactTag);
            this.mUpdatedNodes.put(i11, animatedNode);
        } else {
            ReactSoftExceptionLogger.logSoftException(TAG, new ReactNoCrashSoftException("connectAnimatedNodeToView: Animated node could not be connected to UIManager - uiManager disappeared for tag: " + i12));
        }
    }

    @UiThread
    public void connectAnimatedNodes(int i11, int i12) {
        AnimatedNode animatedNode = this.mAnimatedNodes.get(i11);
        if (animatedNode == null) {
            throw new JSApplicationIllegalArgumentException("connectAnimatedNodes: Animated node with tag (parent) [" + i11 + "] does not exist");
        }
        AnimatedNode animatedNode2 = this.mAnimatedNodes.get(i12);
        if (animatedNode2 != null) {
            animatedNode.addChild(animatedNode2);
            this.mUpdatedNodes.put(i12, animatedNode2);
        } else {
            throw new JSApplicationIllegalArgumentException("connectAnimatedNodes: Animated node with tag (child) [" + i12 + "] does not exist");
        }
    }

    @UiThread
    public void createAnimatedNode(int i11, ReadableMap readableMap) {
        AnimatedNode objectAnimatedNode;
        if (this.mAnimatedNodes.get(i11) != null) {
            throw new JSApplicationIllegalArgumentException("createAnimatedNode: Animated node [" + i11 + "] already exists");
        }
        String string = readableMap.getString("type");
        if (TtmlNode.TAG_STYLE.equals(string)) {
            objectAnimatedNode = new StyleAnimatedNode(readableMap, this);
        } else if ("value".equals(string)) {
            objectAnimatedNode = new ValueAnimatedNode(readableMap);
        } else if ("color".equals(string)) {
            objectAnimatedNode = new ColorAnimatedNode(readableMap, this, this.mReactApplicationContext);
        } else if ("props".equals(string)) {
            objectAnimatedNode = new PropsAnimatedNode(readableMap, this);
        } else if ("interpolation".equals(string)) {
            objectAnimatedNode = new InterpolationAnimatedNode(readableMap);
        } else if ("addition".equals(string)) {
            objectAnimatedNode = new AdditionAnimatedNode(readableMap, this);
        } else if ("subtraction".equals(string)) {
            objectAnimatedNode = new SubtractionAnimatedNode(readableMap, this);
        } else if ("division".equals(string)) {
            objectAnimatedNode = new DivisionAnimatedNode(readableMap, this);
        } else if ("multiplication".equals(string)) {
            objectAnimatedNode = new MultiplicationAnimatedNode(readableMap, this);
        } else if ("modulus".equals(string)) {
            objectAnimatedNode = new ModulusAnimatedNode(readableMap, this);
        } else if ("diffclamp".equals(string)) {
            objectAnimatedNode = new DiffClampAnimatedNode(readableMap, this);
        } else if (ViewProps.TRANSFORM.equals(string)) {
            objectAnimatedNode = new TransformAnimatedNode(readableMap, this);
        } else if ("tracking".equals(string)) {
            objectAnimatedNode = new TrackingAnimatedNode(readableMap, this);
        } else {
            if (!"object".equals(string)) {
                throw new JSApplicationIllegalArgumentException("Unsupported node type: " + string);
            }
            objectAnimatedNode = new ObjectAnimatedNode(readableMap, this);
        }
        objectAnimatedNode.tag = i11;
        this.mAnimatedNodes.put(i11, objectAnimatedNode);
        this.mUpdatedNodes.put(i11, objectAnimatedNode);
    }

    @UiThread
    public void disconnectAnimatedNodeFromView(int i11, int i12) {
        AnimatedNode animatedNode = this.mAnimatedNodes.get(i11);
        if (animatedNode == null) {
            throw new JSApplicationIllegalArgumentException("disconnectAnimatedNodeFromView: Animated node with tag [" + i11 + "] does not exist");
        }
        if (animatedNode instanceof PropsAnimatedNode) {
            ((PropsAnimatedNode) animatedNode).disconnectFromView(i12);
            return;
        }
        throw new JSApplicationIllegalArgumentException("disconnectAnimatedNodeFromView: Animated node connected to view [" + i12 + "] should be of type " + PropsAnimatedNode.class.getName());
    }

    public void disconnectAnimatedNodes(int i11, int i12) {
        AnimatedNode animatedNode = this.mAnimatedNodes.get(i11);
        if (animatedNode == null) {
            throw new JSApplicationIllegalArgumentException("disconnectAnimatedNodes: Animated node with tag (parent) [" + i11 + "] does not exist");
        }
        AnimatedNode animatedNode2 = this.mAnimatedNodes.get(i12);
        if (animatedNode2 != null) {
            animatedNode.removeChild(animatedNode2);
            this.mUpdatedNodes.put(i12, animatedNode2);
        } else {
            throw new JSApplicationIllegalArgumentException("disconnectAnimatedNodes: Animated node with tag (child) [" + i12 + "] does not exist");
        }
    }

    @UiThread
    public void dropAnimatedNode(int i11) {
        this.mAnimatedNodes.remove(i11);
        this.mUpdatedNodes.remove(i11);
    }

    @UiThread
    public void extractAnimatedNodeOffset(int i11) {
        AnimatedNode animatedNode = this.mAnimatedNodes.get(i11);
        if (animatedNode != null && (animatedNode instanceof ValueAnimatedNode)) {
            ((ValueAnimatedNode) animatedNode).extractOffset();
            return;
        }
        throw new JSApplicationIllegalArgumentException("extractAnimatedNodeOffset: Animated node [" + i11 + "] does not exist, or is not a 'value' node");
    }

    @UiThread
    public void flattenAnimatedNodeOffset(int i11) {
        AnimatedNode animatedNode = this.mAnimatedNodes.get(i11);
        if (animatedNode != null && (animatedNode instanceof ValueAnimatedNode)) {
            ((ValueAnimatedNode) animatedNode).flattenOffset();
            return;
        }
        throw new JSApplicationIllegalArgumentException("flattenAnimatedNodeOffset: Animated node [" + i11 + "] does not exist, or is not a 'value' node");
    }

    @Nullable
    public AnimatedNode getNodeById(int i11) {
        return this.mAnimatedNodes.get(i11);
    }

    public Set<Integer> getTagsOfConnectedNodes(int i11, String str) {
        int i12;
        List<AnimatedNode> list;
        HashSet hashSet = new HashSet();
        ListIterator<EventAnimationDriver> listIterator = this.mEventDrivers.listIterator();
        while (listIterator.hasNext()) {
            EventAnimationDriver next = listIterator.next();
            if (next != null && str.equals(next.eventName) && i11 == (i12 = next.viewTag)) {
                hashSet.add(Integer.valueOf(i12));
                ValueAnimatedNode valueAnimatedNode = next.valueNode;
                if (valueAnimatedNode != null && (list = valueAnimatedNode.children) != null) {
                    Iterator<AnimatedNode> it = list.iterator();
                    while (it.hasNext()) {
                        hashSet.add(Integer.valueOf(it.next().tag));
                    }
                }
            }
        }
        return hashSet;
    }

    @UiThread
    public void getValue(int i11, Callback callback) {
        AnimatedNode animatedNode = this.mAnimatedNodes.get(i11);
        if (animatedNode == null || !(animatedNode instanceof ValueAnimatedNode)) {
            throw new JSApplicationIllegalArgumentException("getValue: Animated node with tag [" + i11 + "] does not exist or is not a 'value' node");
        }
        double value = ((ValueAnimatedNode) animatedNode).getValue();
        if (callback != null) {
            callback.invoke(Double.valueOf(value));
        } else {
            if (this.mReactApplicationContext == null) {
                return;
            }
            WritableMap writableMapCreateMap = Arguments.createMap();
            writableMapCreateMap.putInt("tag", i11);
            writableMapCreateMap.putDouble("value", value);
            this.mReactApplicationContext.emitDeviceEvent("onNativeAnimatedModuleGetValue", writableMapCreateMap);
        }
    }

    public boolean hasActiveAnimations() {
        return this.mActiveAnimations.size() > 0 || this.mUpdatedNodes.size() > 0;
    }

    @UiThread
    public void restoreDefaultValues(int i11) {
        AnimatedNode animatedNode = this.mAnimatedNodes.get(i11);
        if (animatedNode == null) {
            return;
        }
        if (animatedNode instanceof PropsAnimatedNode) {
            ((PropsAnimatedNode) animatedNode).restoreDefaultValues();
            return;
        }
        throw new JSApplicationIllegalArgumentException("Animated node connected to view [?] should be of type " + PropsAnimatedNode.class.getName());
    }

    @UiThread
    public void setAnimatedNodeOffset(int i11, double d11) {
        AnimatedNode animatedNode = this.mAnimatedNodes.get(i11);
        if (animatedNode != null && (animatedNode instanceof ValueAnimatedNode)) {
            ((ValueAnimatedNode) animatedNode).offset = d11;
            this.mUpdatedNodes.put(i11, animatedNode);
        } else {
            throw new JSApplicationIllegalArgumentException("setAnimatedNodeOffset: Animated node [" + i11 + "] does not exist, or is not a 'value' node");
        }
    }

    @UiThread
    public void setAnimatedNodeValue(int i11, double d11) {
        AnimatedNode animatedNode = this.mAnimatedNodes.get(i11);
        if (animatedNode != null && (animatedNode instanceof ValueAnimatedNode)) {
            stopAnimationsForNode(animatedNode);
            ((ValueAnimatedNode) animatedNode).nodeValue = d11;
            this.mUpdatedNodes.put(i11, animatedNode);
        } else {
            throw new JSApplicationIllegalArgumentException("setAnimatedNodeValue: Animated node [" + i11 + "] does not exist, or is not a 'value' node");
        }
    }

    @UiThread
    public void startAnimatingNode(int i11, int i12, ReadableMap readableMap, Callback callback) {
        AnimationDriver decayAnimation;
        AnimatedNode animatedNode = this.mAnimatedNodes.get(i12);
        if (animatedNode == null) {
            throw new JSApplicationIllegalArgumentException("startAnimatingNode: Animated node [" + i12 + "] does not exist");
        }
        if (!(animatedNode instanceof ValueAnimatedNode)) {
            throw new JSApplicationIllegalArgumentException("startAnimatingNode: Animated node [" + i12 + "] should be of type " + ValueAnimatedNode.class.getName());
        }
        AnimationDriver animationDriver = this.mActiveAnimations.get(i11);
        if (animationDriver != null) {
            animationDriver.resetConfig(readableMap);
            return;
        }
        String string = readableMap.getString("type");
        if (ProcessingTimesRecorderKt.DEFAULT_RECORDS_LABEL.equals(string)) {
            decayAnimation = new FrameBasedAnimationDriver(readableMap);
        } else if ("spring".equals(string)) {
            decayAnimation = new SpringAnimation(readableMap);
        } else {
            if (!"decay".equals(string)) {
                throw new JSApplicationIllegalArgumentException("startAnimatingNode: Unsupported animation type [" + i12 + "]: " + string);
            }
            decayAnimation = new DecayAnimation(readableMap);
        }
        decayAnimation.id = i11;
        decayAnimation.endCallback = callback;
        decayAnimation.animatedValue = (ValueAnimatedNode) animatedNode;
        this.mActiveAnimations.put(i11, decayAnimation);
    }

    @UiThread
    public void startListeningToAnimatedNodeValue(int i11, AnimatedNodeValueListener animatedNodeValueListener) {
        AnimatedNode animatedNode = this.mAnimatedNodes.get(i11);
        if (animatedNode != null && (animatedNode instanceof ValueAnimatedNode)) {
            ((ValueAnimatedNode) animatedNode).setValueListener(animatedNodeValueListener);
            return;
        }
        throw new JSApplicationIllegalArgumentException("startListeningToAnimatedNodeValue: Animated node [" + i11 + "] does not exist, or is not a 'value' node");
    }

    @UiThread
    public void stopListeningToAnimatedNodeValue(int i11) {
        AnimatedNode animatedNode = this.mAnimatedNodes.get(i11);
        if (animatedNode != null && (animatedNode instanceof ValueAnimatedNode)) {
            ((ValueAnimatedNode) animatedNode).setValueListener(null);
            return;
        }
        throw new JSApplicationIllegalArgumentException("startListeningToAnimatedNodeValue: Animated node [" + i11 + "] does not exist, or is not a 'value' node");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @UiThread
    public void updateAnimatedNodeConfig(int i11, ReadableMap readableMap) {
        AnimatedNode animatedNode = this.mAnimatedNodes.get(i11);
        if (animatedNode == 0) {
            throw new JSApplicationIllegalArgumentException("updateAnimatedNode: Animated node [" + i11 + "] does not exist");
        }
        if (animatedNode instanceof AnimatedNodeWithUpdateableConfig) {
            stopAnimationsForNode(animatedNode);
            ((AnimatedNodeWithUpdateableConfig) animatedNode).onUpdateConfig(readableMap);
            this.mUpdatedNodes.put(i11, animatedNode);
        }
    }

    public NativeAnimatedNodesManager(ReactApplicationContext reactApplicationContext) {
        this.mReactApplicationContext = reactApplicationContext;
    }

    @Override // com.facebook.react.uimanager.events.EventDispatcherListener
    public void onEventDispatch(final Event event) {
        if (UiThreadUtil.isOnUiThread()) {
            handleEvent(event);
        } else {
            UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.facebook.react.animated.NativeAnimatedNodesManager.1
                @Override // java.lang.Runnable
                public void run() {
                    NativeAnimatedNodesManager.this.handleEvent(event);
                }
            });
        }
    }

    @UiThread
    public void removeAnimatedEventFromView(int i11, String str, int i12) {
        String strNormalizeEventName = normalizeEventName(str);
        ListIterator<EventAnimationDriver> listIterator = this.mEventDrivers.listIterator();
        while (listIterator.hasNext()) {
            EventAnimationDriver next = listIterator.next();
            if (strNormalizeEventName.equals(next.eventName) && i11 == next.viewTag && i12 == next.valueNode.tag) {
                listIterator.remove();
                break;
            }
        }
        if (strNormalizeEventName.equals("topScroll")) {
            removeAnimatedEventFromView(i11, "topScrollEnded", i12);
        }
    }

    @UiThread
    public void runUpdates(long j11) {
        UiThreadUtil.assertOnUiThread();
        for (int i11 = 0; i11 < this.mUpdatedNodes.size(); i11++) {
            this.mRunUpdateNodeList.add(this.mUpdatedNodes.valueAt(i11));
        }
        this.mUpdatedNodes.clear();
        boolean z11 = false;
        for (int i12 = 0; i12 < this.mActiveAnimations.size(); i12++) {
            AnimationDriver animationDriverValueAt = this.mActiveAnimations.valueAt(i12);
            animationDriverValueAt.runAnimationStep(j11);
            this.mRunUpdateNodeList.add(animationDriverValueAt.animatedValue);
            if (animationDriverValueAt.hasFinished) {
                z11 = true;
            }
        }
        updateNodes(this.mRunUpdateNodeList);
        this.mRunUpdateNodeList.clear();
        if (z11) {
            WritableArray writableArrayCreateArray = null;
            for (int size = this.mActiveAnimations.size() - 1; size >= 0; size--) {
                AnimationDriver animationDriverValueAt2 = this.mActiveAnimations.valueAt(size);
                if (animationDriverValueAt2.hasFinished) {
                    if (animationDriverValueAt2.endCallback != null) {
                        WritableMap writableMapCreateMap = Arguments.createMap();
                        writableMapCreateMap.putBoolean("finished", true);
                        writableMapCreateMap.putDouble("value", animationDriverValueAt2.animatedValue.nodeValue);
                        animationDriverValueAt2.endCallback.invoke(writableMapCreateMap);
                    } else if (this.mReactApplicationContext != null) {
                        WritableMap writableMapCreateMap2 = Arguments.createMap();
                        writableMapCreateMap2.putInt("animationId", animationDriverValueAt2.id);
                        writableMapCreateMap2.putBoolean("finished", true);
                        writableMapCreateMap2.putDouble("value", animationDriverValueAt2.animatedValue.nodeValue);
                        if (writableArrayCreateArray == null) {
                            writableArrayCreateArray = Arguments.createArray();
                        }
                        writableArrayCreateArray.pushMap(writableMapCreateMap2);
                    }
                    this.mActiveAnimations.removeAt(size);
                }
            }
            if (writableArrayCreateArray != null) {
                this.mReactApplicationContext.emitDeviceEvent("onNativeAnimatedModuleAnimationFinished", writableArrayCreateArray);
            }
        }
    }
}
