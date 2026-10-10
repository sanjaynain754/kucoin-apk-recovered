package com.swmansion.rnscreens.stack.views;

import com.swmansion.rnscreens.ScreenStack;
import io.flutter.plugin.editing.SpellCheckPlugin;
import java.util.Collections;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ChildDrawingOrderStrategyImpl.kt */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\b\u001a\u00020\t2\u0010\u0010\n\u001a\f\u0012\b\u0012\u00060\fR\u00020\r0\u000bH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000e"}, m90084d2 = {"Lcom/swmansion/rnscreens/stack/views/ReverseFromIndex;", "Lcom/swmansion/rnscreens/stack/views/ChildrenDrawingOrderStrategyBase;", SpellCheckPlugin.START_INDEX_KEY, "", "<init>", "(I)V", "getStartIndex", "()I", "apply", "", "drawingOperations", "", "Lcom/swmansion/rnscreens/ScreenStack$DrawingOp;", "Lcom/swmansion/rnscreens/ScreenStack;", "react-native-screens_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public final class ReverseFromIndex extends ChildrenDrawingOrderStrategyBase {
    private final int startIndex;

    public ReverseFromIndex(int i11) {
        super(false, 1, null);
        this.startIndex = i11;
    }

    @Override // com.swmansion.rnscreens.stack.views.ChildrenDrawingOrderStrategy
    public void apply(@NotNull List<ScreenStack.DrawingOp> drawingOperations) {
        Intrinsics.checkNotNullParameter(drawingOperations, "drawingOperations");
        if (isEnabled()) {
            int i11 = this.startIndex;
            for (int lastIndex = CollectionsKt.getLastIndex(drawingOperations); i11 < lastIndex; lastIndex--) {
                Collections.swap(drawingOperations, i11, lastIndex);
                i11++;
            }
        }
    }

    public final int getStartIndex() {
        return this.startIndex;
    }
}
