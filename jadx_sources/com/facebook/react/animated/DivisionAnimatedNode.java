package com.facebook.react.animated;

import com.facebook.react.bridge.JSApplicationCausedNativeException;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: DivisionAnimatedNode.kt */
/* JADX INFO: loaded from: classes45.dex */
@Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\n\u001a\u00020\u000bH\u0016J\b\u0010\f\u001a\u00020\rH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m90084d2 = {"Lcom/facebook/react/animated/DivisionAnimatedNode;", "Lcom/facebook/react/animated/ValueAnimatedNode;", "config", "Lcom/facebook/react/bridge/ReadableMap;", "nativeAnimatedNodesManager", "Lcom/facebook/react/animated/NativeAnimatedNodesManager;", "<init>", "(Lcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/animated/NativeAnimatedNodesManager;)V", "inputNodes", "", "update", "", "prettyPrint", "", "ReactAndroid_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nDivisionAnimatedNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DivisionAnimatedNode.kt\ncom/facebook/react/animated/DivisionAnimatedNode\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,56:1\n13504#2,3:57\n*S KotlinDebug\n*F\n+ 1 DivisionAnimatedNode.kt\ncom/facebook/react/animated/DivisionAnimatedNode\n*L\n34#1:57,3\n*E\n"})
public final class DivisionAnimatedNode extends ValueAnimatedNode {

    @NotNull
    private final int[] inputNodes;

    @NotNull
    private final NativeAnimatedNodesManager nativeAnimatedNodesManager;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DivisionAnimatedNode(@NotNull ReadableMap config, @NotNull NativeAnimatedNodesManager nativeAnimatedNodesManager) {
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
        return "DivisionAnimatedNode[" + this.tag + "]: input nodes: " + this.inputNodes + " - super: " + super.prettyPrint();
    }

    @Override // com.facebook.react.animated.AnimatedNode
    public void update() {
        int[] iArr = this.inputNodes;
        int length = iArr.length;
        int i11 = 0;
        int i12 = 0;
        while (i11 < length) {
            int i13 = i12 + 1;
            AnimatedNode nodeById = this.nativeAnimatedNodesManager.getNodeById(iArr[i11]);
            if (nodeById == null || !(nodeById instanceof ValueAnimatedNode)) {
                throw new JSApplicationCausedNativeException("Illegal node ID set as an input for Animated.divide node with Animated ID " + this.tag);
            }
            double d11 = ((ValueAnimatedNode) nodeById).nodeValue;
            if (i12 == 0) {
                this.nodeValue = d11;
            } else {
                if (d11 == 0.0d) {
                    throw new JSApplicationCausedNativeException("Detected a division by zero in Animated.divide node with Animated ID " + this.tag);
                }
                this.nodeValue /= d11;
            }
            i11++;
            i12 = i13;
        }
    }
}
