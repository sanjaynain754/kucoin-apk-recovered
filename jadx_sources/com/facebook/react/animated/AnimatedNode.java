package com.facebook.react.animated;

import com.tencent.bugly.proguard.C33627eb;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.JvmField;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;

/* JADX INFO: compiled from: AnimatedNode.kt */
/* JADX INFO: loaded from: classes45.dex */
@Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010!\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0003\b&\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0000J\u000e\u0010\r\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0000J\u0010\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u0000H\u0016J\u0010\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u0000H\u0016J\b\u0010\u0011\u001a\u00020\u000bH\u0016J\b\u0010\u0012\u001a\u00020\u0013H&J\u0006\u0010\u0014\u001a\u00020\u0013R\u001a\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u00058\u0000@\u0000X\u0081\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0006\u001a\u00020\u00078\u0000@\u0000X\u0081\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\b\u001a\u00020\u00078\u0000@\u0000X\u0081\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\t\u001a\u00020\u00078\u0000@\u0000X\u0081\u000e¢\u0006\u0002\n\u0000¨\u0006\u0016"}, m90084d2 = {"Lcom/facebook/react/animated/AnimatedNode;", "", "<init>", "()V", "children", "", "activeIncomingNodes", "", "BFSColor", "tag", "addChild", "", "child", "removeChild", "onAttachedToNode", "parent", "onDetachedFromNode", "update", "prettyPrint", "", "prettyPrintWithChildren", "Companion", "ReactAndroid_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nAnimatedNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnimatedNode.kt\ncom/facebook/react/animated/AnimatedNode\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,75:1\n1#2:76\n*E\n"})
public abstract class AnimatedNode {
    public static final int DEFAULT_ANIMATED_NODE_CHILD_COUNT = 1;
    public static final int INITIAL_BFS_COLOR = 0;

    @JvmField
    public int BFSColor;

    @JvmField
    public int activeIncomingNodes;

    @JvmField
    @Nullable
    public List<AnimatedNode> children;

    @JvmField
    public int tag = -1;

    @NotNull
    public abstract String prettyPrint();

    public final void addChild(@NotNull AnimatedNode child) {
        Intrinsics.checkNotNullParameter(child, "child");
        List arrayList = this.children;
        if (arrayList == null) {
            arrayList = new ArrayList(1);
            this.children = arrayList;
        }
        arrayList.add(child);
        child.onAttachedToNode(this);
    }

    public void onAttachedToNode(@NotNull AnimatedNode parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
    }

    public void onDetachedFromNode(@NotNull AnimatedNode parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
    }

    @NotNull
    public final String prettyPrintWithChildren() {
        String str;
        List<AnimatedNode> list = this.children;
        String strJoinToString$default = list != null ? CollectionsKt.joinToString$default(list, C33627eb.f69716f, null, null, 0, null, null, 62, null) : null;
        String strPrettyPrint = prettyPrint();
        if (strJoinToString$default == null || StringsKt.isBlank(strJoinToString$default)) {
            str = "";
        } else {
            str = " children: " + strJoinToString$default;
        }
        return strPrettyPrint + str;
    }

    public final void removeChild(@NotNull AnimatedNode child) {
        Intrinsics.checkNotNullParameter(child, "child");
        List<AnimatedNode> list = this.children;
        if (list == null) {
            return;
        }
        child.onDetachedFromNode(this);
        list.remove(child);
    }

    public void update() {
    }
}
