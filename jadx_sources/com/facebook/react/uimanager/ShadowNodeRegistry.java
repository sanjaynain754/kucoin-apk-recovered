package com.facebook.react.uimanager;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import com.facebook.react.common.SingleThreadAsserter;

/* JADX INFO: loaded from: classes45.dex */
class ShadowNodeRegistry {
    private final SparseArray<ReactShadowNode> mTagsToCSSNodes = new SparseArray<>();
    private final SparseBooleanArray mRootTags = new SparseBooleanArray();
    private final SingleThreadAsserter mThreadAsserter = new SingleThreadAsserter();

    public void addNode(ReactShadowNode reactShadowNode) {
        this.mThreadAsserter.assertNow();
        this.mTagsToCSSNodes.put(reactShadowNode.getReactTag(), reactShadowNode);
    }

    public void addRootNode(ReactShadowNode reactShadowNode) {
        this.mThreadAsserter.assertNow();
        int reactTag = reactShadowNode.getReactTag();
        this.mTagsToCSSNodes.put(reactTag, reactShadowNode);
        this.mRootTags.put(reactTag, true);
    }

    public ReactShadowNode getNode(int i11) {
        this.mThreadAsserter.assertNow();
        return this.mTagsToCSSNodes.get(i11);
    }

    public int getRootNodeCount() {
        this.mThreadAsserter.assertNow();
        return this.mRootTags.size();
    }

    public int getRootTag(int i11) {
        this.mThreadAsserter.assertNow();
        return this.mRootTags.keyAt(i11);
    }

    public boolean isRootNode(int i11) {
        this.mThreadAsserter.assertNow();
        return this.mRootTags.get(i11);
    }

    public void removeNode(int i11) {
        this.mThreadAsserter.assertNow();
        if (!this.mRootTags.get(i11)) {
            this.mTagsToCSSNodes.remove(i11);
            return;
        }
        throw new IllegalViewOperationException("Trying to remove root node " + i11 + " without using removeRootNode!");
    }

    public void removeRootNode(int i11) {
        this.mThreadAsserter.assertNow();
        if (i11 == -1) {
            return;
        }
        if (this.mRootTags.get(i11)) {
            this.mTagsToCSSNodes.remove(i11);
            this.mRootTags.delete(i11);
        } else {
            throw new IllegalViewOperationException("View with tag " + i11 + " is not registered as a root view");
        }
    }
}
