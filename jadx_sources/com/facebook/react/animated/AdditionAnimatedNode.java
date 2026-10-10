package com.facebook.react.animated;

import com.facebook.react.bridge.JSApplicationCausedNativeException;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.collections.ArraysKt;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: AdditionAnimatedNode.kt */
/* JADX INFO: loaded from: classes45.dex */
@Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\n\u001a\u00020\u000bH\u0016J\b\u0010\f\u001a\u00020\rH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m90084d2 = {"Lcom/facebook/react/animated/AdditionAnimatedNode;", "Lcom/facebook/react/animated/ValueAnimatedNode;", "config", "Lcom/facebook/react/bridge/ReadableMap;", "nativeAnimatedNodesManager", "Lcom/facebook/react/animated/NativeAnimatedNodesManager;", "<init>", "(Lcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/animated/NativeAnimatedNodesManager;)V", "inputNodes", "", "update", "", "prettyPrint", "", "ReactAndroid_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nAdditionAnimatedNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AdditionAnimatedNode.kt\ncom/facebook/react/animated/AdditionAnimatedNode\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,53:1\n12862#2,3:54\n*S KotlinDebug\n*F\n+ 1 AdditionAnimatedNode.kt\ncom/facebook/react/animated/AdditionAnimatedNode\n*L\n37#1:54,3\n*E\n"})
public final class AdditionAnimatedNode extends ValueAnimatedNode {

    @NotNull
    private final int[] inputNodes;

    @NotNull
    private final NativeAnimatedNodesManager nativeAnimatedNodesManager;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdditionAnimatedNode(@NotNull ReadableMap config, @NotNull NativeAnimatedNodesManager nativeAnimatedNodesManager) {
        int[] iArr;
        super(null, 1, null);
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(nativeAnimatedNodesManager, "nativeAnimatedNodesManager");
        this.nativeAnimatedNodesManager = nativeAnimatedNodesManager;
        ReadableArray array = config.getArray("input");
        if (array == null) {
            iArr = new int[0];
        } else {
            int size = array.size();
            int[] iArr2 = new int[size];
            for (int i11 = 0; i11 < size; i11++) {
                iArr2[i11] = array.getInt(i11);
            }
            iArr = iArr2;
        }
        this.inputNodes = iArr;
    }

    @Override // com.facebook.react.animated.ValueAnimatedNode, com.facebook.react.animated.AnimatedNode
    @NotNull
    public String prettyPrint() {
        return "AdditionAnimatedNode[" + this.tag + "]: input nodes: " + ArraysKt.joinToString$default(this.inputNodes, (CharSequence) null, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 63, (Object) null) + " - super: " + super.prettyPrint();
    }

    @Override // com.facebook.react.animated.AnimatedNode
    public void update() {
        this.nodeValue = 0.0d;
        double value = 0.0d;
        for (int i11 : this.inputNodes) {
            AnimatedNode nodeById = this.nativeAnimatedNodesManager.getNodeById(i11);
            if (!(nodeById instanceof ValueAnimatedNode)) {
                throw new JSApplicationCausedNativeException("Illegal node ID set as an input for Animated.Add node");
            }
            value += ((ValueAnimatedNode) nodeById).getValue();
        }
        this.nodeValue = 0.0d + value;
    }
}
