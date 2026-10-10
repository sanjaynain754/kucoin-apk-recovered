package com.swmansion.rnscreens.stack.views;

import com.google.firebase.perf.util.Constants;
import com.kubi.p110rn.modules.BridgeParamKeyKt;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: ChildDrawingOrderStrategyImpl.kt */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0003\b \u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\t\u001a\u00020\nH\u0016J\b\u0010\u000b\u001a\u00020\nH\u0016J\b\u0010\f\u001a\u00020\u0003H\u0016R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0005¨\u0006\r"}, m90084d2 = {"Lcom/swmansion/rnscreens/stack/views/ChildrenDrawingOrderStrategyBase;", "Lcom/swmansion/rnscreens/stack/views/ChildrenDrawingOrderStrategy;", "enabled", "", "<init>", "(Z)V", "getEnabled", "()Z", "setEnabled", BridgeParamKeyKt.RN_CONTAINER_UI_ENABLE, "", "disable", Constants.ENABLE_DISABLE, "react-native-screens_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public abstract class ChildrenDrawingOrderStrategyBase implements ChildrenDrawingOrderStrategy {
    private boolean enabled;

    public ChildrenDrawingOrderStrategyBase() {
        this(false, 1, null);
    }

    @Override // com.swmansion.rnscreens.stack.views.ChildrenDrawingOrderStrategy
    public void disable() {
        this.enabled = false;
    }

    @Override // com.swmansion.rnscreens.stack.views.ChildrenDrawingOrderStrategy
    public void enable() {
        this.enabled = true;
    }

    public ChildrenDrawingOrderStrategyBase(boolean z11) {
        this.enabled = z11;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    @Override // com.swmansion.rnscreens.stack.views.ChildrenDrawingOrderStrategy
    public boolean isEnabled() {
        return this.enabled;
    }

    public final void setEnabled(boolean z11) {
        this.enabled = z11;
    }

    public /* synthetic */ ChildrenDrawingOrderStrategyBase(boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? false : z11);
    }
}
