package com.facebook.react.views.modal;

import com.facebook.react.uimanager.LayoutShadowNode;
import com.facebook.react.uimanager.ReactShadowNodeImpl;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Deprecated;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ModalHostShadowNode.kt */
/* JADX INFO: loaded from: classes45.dex */
@Deprecated(message = "This class is no longer used and will be removed soon.")
@Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016¨\u0006\n"}, m90084d2 = {"Lcom/facebook/react/views/modal/ModalHostShadowNode;", "Lcom/facebook/react/uimanager/LayoutShadowNode;", "<init>", "()V", "addChildAt", "", "child", "Lcom/facebook/react/uimanager/ReactShadowNodeImpl;", "i", "", "ReactAndroid_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public final class ModalHostShadowNode extends LayoutShadowNode {
    @Override // com.facebook.react.uimanager.ReactShadowNodeImpl, com.facebook.react.uimanager.ReactShadowNode
    public void addChildAt(@NotNull ReactShadowNodeImpl child, int i11) {
        Intrinsics.checkNotNullParameter(child, "child");
        super.addChildAt(child, i11);
    }
}
