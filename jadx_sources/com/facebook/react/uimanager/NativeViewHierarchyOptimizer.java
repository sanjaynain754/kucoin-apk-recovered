package com.facebook.react.uimanager;

import android.util.SparseBooleanArray;
import androidx.annotation.Nullable;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import p302h6.C38115a;
import p747x3.C45999a;

/* JADX INFO: loaded from: classes45.dex */
public class NativeViewHierarchyOptimizer {
    private static final boolean ENABLED = true;
    private static final String TAG = "NativeViewHierarchyOptimizer";
    private final ShadowNodeRegistry mShadowNodeRegistry;
    private final SparseBooleanArray mTagsWithLayoutVisited = new SparseBooleanArray();
    private final UIViewOperationQueue mUIViewOperationQueue;

    private static boolean isLayoutOnlyAndCollapsable(@Nullable ReactStylesDiffMap reactStylesDiffMap) {
        if (reactStylesDiffMap == null) {
            return true;
        }
        if (reactStylesDiffMap.hasKey(ViewProps.COLLAPSABLE) && !reactStylesDiffMap.getBoolean(ViewProps.COLLAPSABLE, true)) {
            return false;
        }
        ReadableMapKeySetIterator readableMapKeySetIteratorKeySetIterator = reactStylesDiffMap.mBackingMap.keySetIterator();
        while (readableMapKeySetIteratorKeySetIterator.hasNextKey()) {
            if (!ViewProps.isLayoutOnly(reactStylesDiffMap.mBackingMap, readableMapKeySetIteratorKeySetIterator.nextKey())) {
                return false;
            }
        }
        return true;
    }

    public void handleManageChildren(ReactShadowNode reactShadowNode, int[] iArr, int[] iArr2, ViewAtIndex[] viewAtIndexArr, int[] iArr3) {
        boolean z11;
        for (int i11 : iArr2) {
            int i12 = 0;
            while (true) {
                if (i12 >= iArr3.length) {
                    z11 = false;
                    break;
                } else {
                    if (iArr3[i12] == i11) {
                        z11 = true;
                        break;
                    }
                    i12++;
                }
            }
            removeNodeFromParent(this.mShadowNodeRegistry.getNode(i11), z11);
        }
        for (ViewAtIndex viewAtIndex : viewAtIndexArr) {
            addNodeToNode(reactShadowNode, this.mShadowNodeRegistry.getNode(viewAtIndex.mTag), viewAtIndex.mIndex);
        }
    }

    public void handleSetChildren(ReactShadowNode reactShadowNode, ReadableArray readableArray) {
        for (int i11 = 0; i11 < readableArray.size(); i11++) {
            addNodeToNode(reactShadowNode, this.mShadowNodeRegistry.getNode(readableArray.getInt(i11)), i11);
        }
    }

    public static class NodeIndexPair {
        public final int index;
        public final ReactShadowNode node;

        public NodeIndexPair(ReactShadowNode reactShadowNode, int i11) {
            this.node = reactShadowNode;
            this.index = i11;
        }
    }

    public void onBatchComplete() {
        this.mTagsWithLayoutVisited.clear();
    }

    public void onViewUpdatesCompleted(ReactShadowNode reactShadowNode) {
        this.mTagsWithLayoutVisited.clear();
    }

    public NativeViewHierarchyOptimizer(UIViewOperationQueue uIViewOperationQueue, ShadowNodeRegistry shadowNodeRegistry) {
        this.mUIViewOperationQueue = uIViewOperationQueue;
        this.mShadowNodeRegistry = shadowNodeRegistry;
    }

    private void addGrandchildren(ReactShadowNode reactShadowNode, ReactShadowNode reactShadowNode2, int i11) {
        boolean z11;
        boolean z12;
        if (reactShadowNode2.getNativeKind() != NativeKind.PARENT) {
            z11 = true;
        } else {
            z11 = false;
        }
        C38115a.m86045a(z11);
        for (int i12 = 0; i12 < reactShadowNode2.getChildCount(); i12++) {
            ReactShadowNode childAt = reactShadowNode2.getChildAt(i12);
            if (childAt.getNativeParent() == null) {
                z12 = true;
            } else {
                z12 = false;
            }
            C38115a.m86045a(z12);
            int nativeChildCount = reactShadowNode.getNativeChildCount();
            if (childAt.getNativeKind() == NativeKind.NONE) {
                addNonNativeChild(reactShadowNode, childAt, i11);
            } else {
                addNativeChild(reactShadowNode, childAt, i11);
            }
            i11 += reactShadowNode.getNativeChildCount() - nativeChildCount;
        }
    }

    private void addNativeChild(ReactShadowNode reactShadowNode, ReactShadowNode reactShadowNode2, int i11) {
        reactShadowNode.addNativeChildAt(reactShadowNode2, i11);
        this.mUIViewOperationQueue.enqueueManageChildren(reactShadowNode.getReactTag(), null, new ViewAtIndex[]{new ViewAtIndex(reactShadowNode2.getReactTag(), i11)}, null);
        if (reactShadowNode2.getNativeKind() != NativeKind.PARENT) {
            addGrandchildren(reactShadowNode, reactShadowNode2, i11 + 1);
        }
    }

    private void addNodeToNode(ReactShadowNode reactShadowNode, ReactShadowNode reactShadowNode2, int i11) {
        int nativeOffsetForChild = reactShadowNode.getNativeOffsetForChild(reactShadowNode.getChildAt(i11));
        if (reactShadowNode.getNativeKind() != NativeKind.PARENT) {
            NodeIndexPair nodeIndexPairWalkUpUntilNativeKindIsParent = walkUpUntilNativeKindIsParent(reactShadowNode, nativeOffsetForChild);
            if (nodeIndexPairWalkUpUntilNativeKindIsParent == null) {
                return;
            }
            ReactShadowNode reactShadowNode3 = nodeIndexPairWalkUpUntilNativeKindIsParent.node;
            nativeOffsetForChild = nodeIndexPairWalkUpUntilNativeKindIsParent.index;
            reactShadowNode = reactShadowNode3;
        }
        if (reactShadowNode2.getNativeKind() != NativeKind.NONE) {
            addNativeChild(reactShadowNode, reactShadowNode2, nativeOffsetForChild);
        } else {
            addNonNativeChild(reactShadowNode, reactShadowNode2, nativeOffsetForChild);
        }
    }

    private void addNonNativeChild(ReactShadowNode reactShadowNode, ReactShadowNode reactShadowNode2, int i11) {
        addGrandchildren(reactShadowNode, reactShadowNode2, i11);
    }

    private void applyLayoutBase(ReactShadowNode reactShadowNode) {
        int reactTag = reactShadowNode.getReactTag();
        if (this.mTagsWithLayoutVisited.get(reactTag)) {
            return;
        }
        this.mTagsWithLayoutVisited.put(reactTag, true);
        int screenX = reactShadowNode.getScreenX();
        int screenY = reactShadowNode.getScreenY();
        for (ReactShadowNode parent = reactShadowNode.getParent(); parent != null && parent.getNativeKind() != NativeKind.PARENT; parent = parent.getParent()) {
            if (!parent.isVirtual()) {
                screenX += Math.round(parent.getLayoutX());
                screenY += Math.round(parent.getLayoutY());
            }
        }
        applyLayoutRecursive(reactShadowNode, screenX, screenY);
    }

    private void applyLayoutRecursive(ReactShadowNode reactShadowNode, int i11, int i12) {
        if (reactShadowNode.getNativeKind() != NativeKind.NONE && reactShadowNode.getNativeParent() != null) {
            this.mUIViewOperationQueue.enqueueUpdateLayout(reactShadowNode.getLayoutParent().getReactTag(), reactShadowNode.getReactTag(), i11, i12, reactShadowNode.getScreenWidth(), reactShadowNode.getScreenHeight(), reactShadowNode.getLayoutDirection());
            return;
        }
        for (int i13 = 0; i13 < reactShadowNode.getChildCount(); i13++) {
            ReactShadowNode childAt = reactShadowNode.getChildAt(i13);
            int reactTag = childAt.getReactTag();
            if (!this.mTagsWithLayoutVisited.get(reactTag)) {
                this.mTagsWithLayoutVisited.put(reactTag, true);
                applyLayoutRecursive(childAt, childAt.getScreenX() + i11, childAt.getScreenY() + i12);
            }
        }
    }

    public static void assertNodeSupportedWithoutOptimizer(ReactShadowNode reactShadowNode) {
        boolean z11;
        if (reactShadowNode.getNativeKind() != NativeKind.LEAF) {
            z11 = true;
        } else {
            z11 = false;
        }
        C38115a.m86046b(z11, "Nodes with NativeKind.LEAF are not supported when the optimizer is disabled");
    }

    public static void handleRemoveNode(ReactShadowNode reactShadowNode) {
        reactShadowNode.removeAllNativeChildren();
    }

    private void removeNodeFromParent(ReactShadowNode reactShadowNode, boolean z11) {
        int[] iArr;
        if (reactShadowNode.getNativeKind() != NativeKind.PARENT) {
            for (int childCount = reactShadowNode.getChildCount() - 1; childCount >= 0; childCount--) {
                removeNodeFromParent(reactShadowNode.getChildAt(childCount), z11);
            }
        }
        ReactShadowNode nativeParent = reactShadowNode.getNativeParent();
        if (nativeParent != null) {
            int iIndexOfNativeChild = nativeParent.indexOfNativeChild(reactShadowNode);
            nativeParent.removeNativeChildAt(iIndexOfNativeChild);
            UIViewOperationQueue uIViewOperationQueue = this.mUIViewOperationQueue;
            int reactTag = nativeParent.getReactTag();
            int[] iArr2 = {iIndexOfNativeChild};
            if (z11) {
                iArr = new int[]{reactShadowNode.getReactTag()};
            } else {
                iArr = null;
            }
            uIViewOperationQueue.enqueueManageChildren(reactTag, iArr2, null, iArr);
        }
    }

    private void transitionLayoutOnlyViewToNativeView(ReactShadowNode reactShadowNode, @Nullable ReactStylesDiffMap reactStylesDiffMap) {
        boolean z11;
        ReactShadowNode parent = reactShadowNode.getParent();
        if (parent == null) {
            reactShadowNode.setIsLayoutOnly(false);
            return;
        }
        int iIndexOf = parent.indexOf(reactShadowNode);
        parent.removeChildAt(iIndexOf);
        removeNodeFromParent(reactShadowNode, false);
        reactShadowNode.setIsLayoutOnly(false);
        this.mUIViewOperationQueue.enqueueCreateView(reactShadowNode.getThemedContext(), reactShadowNode.getReactTag(), reactShadowNode.getViewClass(), reactStylesDiffMap);
        parent.addChildAt(reactShadowNode, iIndexOf);
        addNodeToNode(parent, reactShadowNode, iIndexOf);
        for (int i11 = 0; i11 < reactShadowNode.getChildCount(); i11++) {
            addNodeToNode(reactShadowNode, reactShadowNode.getChildAt(i11), i11);
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Transitioning LayoutOnlyView - tag: ");
        sb2.append(reactShadowNode.getReactTag());
        sb2.append(" - rootTag: ");
        sb2.append(reactShadowNode.getRootTag());
        sb2.append(" - hasProps: ");
        boolean z12 = true;
        if (reactStylesDiffMap != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        sb2.append(z11);
        sb2.append(" - tagsWithLayout.size: ");
        sb2.append(this.mTagsWithLayoutVisited.size());
        C45999a.m101513s(TAG, sb2.toString());
        if (this.mTagsWithLayoutVisited.size() != 0) {
            z12 = false;
        }
        C38115a.m86045a(z12);
        applyLayoutBase(reactShadowNode);
        for (int i12 = 0; i12 < reactShadowNode.getChildCount(); i12++) {
            applyLayoutBase(reactShadowNode.getChildAt(i12));
        }
        this.mTagsWithLayoutVisited.clear();
    }

    private NodeIndexPair walkUpUntilNativeKindIsParent(ReactShadowNode reactShadowNode, int i11) {
        int i12;
        while (reactShadowNode.getNativeKind() != NativeKind.PARENT) {
            ReactShadowNode parent = reactShadowNode.getParent();
            if (parent == null) {
                return null;
            }
            if (reactShadowNode.getNativeKind() == NativeKind.LEAF) {
                i12 = 1;
            } else {
                i12 = 0;
            }
            i11 = i11 + i12 + parent.getNativeOffsetForChild(reactShadowNode);
            reactShadowNode = parent;
        }
        return new NodeIndexPair(reactShadowNode, i11);
    }

    public void handleCreateView(ReactShadowNode reactShadowNode, ThemedReactContext themedReactContext, @Nullable ReactStylesDiffMap reactStylesDiffMap) {
        boolean z11;
        if (reactShadowNode.getViewClass().equals("RCTView") && isLayoutOnlyAndCollapsable(reactStylesDiffMap)) {
            z11 = true;
        } else {
            z11 = false;
        }
        reactShadowNode.setIsLayoutOnly(z11);
        if (reactShadowNode.getNativeKind() != NativeKind.NONE) {
            this.mUIViewOperationQueue.enqueueCreateView(themedReactContext, reactShadowNode.getReactTag(), reactShadowNode.getViewClass(), reactStylesDiffMap);
        }
    }

    public void handleForceViewToBeNonLayoutOnly(ReactShadowNode reactShadowNode) {
        if (reactShadowNode.isLayoutOnly()) {
            transitionLayoutOnlyViewToNativeView(reactShadowNode, null);
        }
    }

    public void handleUpdateLayout(ReactShadowNode reactShadowNode) {
        applyLayoutBase(reactShadowNode);
    }

    public void handleUpdateView(ReactShadowNode reactShadowNode, String str, ReactStylesDiffMap reactStylesDiffMap) {
        if (reactShadowNode.isLayoutOnly() && !isLayoutOnlyAndCollapsable(reactStylesDiffMap)) {
            transitionLayoutOnlyViewToNativeView(reactShadowNode, reactStylesDiffMap);
        } else if (!reactShadowNode.isLayoutOnly()) {
            this.mUIViewOperationQueue.enqueueUpdateProperties(reactShadowNode.getReactTag(), str, reactStylesDiffMap);
        }
    }
}
