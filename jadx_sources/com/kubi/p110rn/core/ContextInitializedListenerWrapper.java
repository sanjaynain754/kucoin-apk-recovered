package com.kubi.p110rn.core;

import com.facebook.react.ReactInstanceManager;
import com.facebook.react.bridge.ReactContext;
import com.tencent.qcloud.tuicore.TUIConstants;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ReactInstanceHelper.kt */
/* JADX INFO: loaded from: classes39.dex */
@Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0014\u0010\u0004\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0004\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m90084d2 = {"Lcom/kubi/rn/core/ContextInitializedListenerWrapper;", "Lcom/facebook/react/ReactInstanceManager$ReactInstanceEventListener;", "manager", "Lcom/facebook/react/ReactInstanceManager;", TUIConstants.TUIChat.CALL_BACK, "Lkotlin/Function1;", "", "<init>", "(Lcom/facebook/react/ReactInstanceManager;Lkotlin/jvm/functions/Function1;)V", "onReactContextInitialized", "context", "Lcom/facebook/react/bridge/ReactContext;", "BReactNativeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class ContextInitializedListenerWrapper implements ReactInstanceManager.ReactInstanceEventListener {

    @NotNull
    private final Function1<ReactInstanceManager, Unit> callback;

    @NotNull
    private final ReactInstanceManager manager;

    /* JADX WARN: Multi-variable type inference failed */
    public ContextInitializedListenerWrapper(@NotNull ReactInstanceManager manager, @NotNull Function1<? super ReactInstanceManager, Unit> callback) {
        Intrinsics.checkNotNullParameter(manager, "manager");
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.manager = manager;
        this.callback = callback;
    }

    @Override // com.facebook.react.ReactInstanceEventListener
    public void onReactContextInitialized(@NotNull ReactContext context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.manager.removeReactInstanceEventListener(this);
        this.callback.invoke(this.manager);
    }
}
