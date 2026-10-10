package com.swmansion.rnscreens.stack.views;

import com.google.firebase.perf.util.Constants;
import com.kubi.p110rn.modules.BridgeParamKeyKt;
import com.swmansion.rnscreens.ScreenStack;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;

/* JADX INFO: compiled from: ChildrenDrawingOrderStrategy.kt */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\b`\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\u0010\u0010\u0004\u001a\f\u0012\b\u0012\u00060\u0006R\u00020\u00070\u0005H&J\b\u0010\b\u001a\u00020\u0003H&J\b\u0010\t\u001a\u00020\u0003H&J\b\u0010\n\u001a\u00020\u000bH&¨\u0006\f"}, m90084d2 = {"Lcom/swmansion/rnscreens/stack/views/ChildrenDrawingOrderStrategy;", "", "apply", "", "drawingOperations", "", "Lcom/swmansion/rnscreens/ScreenStack$DrawingOp;", "Lcom/swmansion/rnscreens/ScreenStack;", BridgeParamKeyKt.RN_CONTAINER_UI_ENABLE, "disable", Constants.ENABLE_DISABLE, "", "react-native-screens_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public interface ChildrenDrawingOrderStrategy {
    void apply(@NotNull List<ScreenStack.DrawingOp> drawingOperations);

    void disable();

    void enable();

    boolean isEnabled();
}
