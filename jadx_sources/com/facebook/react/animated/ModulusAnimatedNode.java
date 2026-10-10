package com.facebook.react.animated;

import com.facebook.react.bridge.JSApplicationCausedNativeException;
import com.facebook.react.bridge.ReadableMap;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ModulusAnimatedNode.kt */
/* JADX INFO: loaded from: classes45.dex */
@Metadata(m90083d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\u000fH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m90084d2 = {"Lcom/facebook/react/animated/ModulusAnimatedNode;", "Lcom/facebook/react/animated/ValueAnimatedNode;", "config", "Lcom/facebook/react/bridge/ReadableMap;", "nativeAnimatedNodesManager", "Lcom/facebook/react/animated/NativeAnimatedNodesManager;", "<init>", "(Lcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/animated/NativeAnimatedNodesManager;)V", "inputNode", "", "modulus", "", "update", "", "prettyPrint", "", "ReactAndroid_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public final class ModulusAnimatedNode extends ValueAnimatedNode {
    private final int inputNode;
    private final double modulus;

    @NotNull
    private final NativeAnimatedNodesManager nativeAnimatedNodesManager;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ModulusAnimatedNode(@NotNull ReadableMap config, @NotNull NativeAnimatedNodesManager nativeAnimatedNodesManager) {
        super(null, 1, null);
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(nativeAnimatedNodesManager, "nativeAnimatedNodesManager");
        this.nativeAnimatedNodesManager = nativeAnimatedNodesManager;
        this.inputNode = config.getInt("input");
        this.modulus = config.getDouble("modulus");
    }

    @Override // com.facebook.react.animated.ValueAnimatedNode, com.facebook.react.animated.AnimatedNode
    @NotNull
    public String prettyPrint() {
        return "NativeAnimatedNodesManager[" + this.tag + "] inputNode: " + this.inputNode + " modulus: " + this.modulus + " super: " + super.prettyPrint();
    }

    @Override // com.facebook.react.animated.AnimatedNode
    public void update() {
        AnimatedNode nodeById = this.nativeAnimatedNodesManager.getNodeById(this.inputNode);
        if (!(nodeById instanceof ValueAnimatedNode)) {
            throw new JSApplicationCausedNativeException("Illegal node ID set as an input for Animated.modulus node");
        }
        double value = ((ValueAnimatedNode) nodeById).getValue();
        double d11 = this.modulus;
        this.nodeValue = ((value % d11) + d11) % d11;
    }
}
