package com.kubi.p110rn.core.pageopen;

import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;

/* JADX INFO: compiled from: KrnPageOpenRegistry.kt */
/* JADX INFO: loaded from: classes39.dex */
@Metadata(m90083d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0007\u001a\u00020\bJ\u0006\u0010\t\u001a\u00020\bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\n"}, m90084d2 = {"Lcom/kubi/rn/core/pageopen/PageOpenFirstFrameGate;", "", "<init>", "()V", "waitingVisibleAfterRender", "", "firstFrameRecorded", "onRenderReady", "Lcom/kubi/rn/core/pageopen/FirstFrameGateAction;", "onVisibleFrame", "BReactNativeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class PageOpenFirstFrameGate {
    private boolean firstFrameRecorded;
    private boolean waitingVisibleAfterRender;

    @NotNull
    public final FirstFrameGateAction onRenderReady() {
        if (this.firstFrameRecorded) {
            return FirstFrameGateAction.IGNORE;
        }
        if (this.waitingVisibleAfterRender) {
            return FirstFrameGateAction.IGNORE;
        }
        this.waitingVisibleAfterRender = true;
        return FirstFrameGateAction.REQUEST_VISIBLE_FRAME;
    }

    @NotNull
    public final FirstFrameGateAction onVisibleFrame() {
        if (this.firstFrameRecorded) {
            return FirstFrameGateAction.IGNORE;
        }
        if (!this.waitingVisibleAfterRender) {
            return FirstFrameGateAction.IGNORE;
        }
        this.waitingVisibleAfterRender = false;
        this.firstFrameRecorded = true;
        return FirstFrameGateAction.RECORD_FIRST_FRAME;
    }
}
