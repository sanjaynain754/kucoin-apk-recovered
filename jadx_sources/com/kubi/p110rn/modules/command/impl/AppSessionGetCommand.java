package com.kubi.p110rn.modules.command.impl;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.WritableMap;
import com.kubi.host.HostManager;
import com.kubi.p110rn.modules.command.ReactBridgeCallbackCommand;
import com.kubi.p110rn.service.ReactDepend;
import com.kubi.sdk.util.C24267r0;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: AppSessionGetCommand.kt */
/* JADX INFO: loaded from: classes39.dex */
@Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0014¨\u0006\b"}, m90084d2 = {"Lcom/kubi/rn/modules/command/impl/AppSessionGetCommand;", "Lcom/kubi/rn/modules/command/ReactBridgeCallbackCommand;", BaseJavaModule.METHOD_TYPE_PROMISE, "Lcom/facebook/react/bridge/Promise;", "<init>", "(Lcom/facebook/react/bridge/Promise;)V", "onExecute", "", "BReactNativeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class AppSessionGetCommand extends ReactBridgeCallbackCommand {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppSessionGetCommand(@NotNull Promise promise) {
        super(promise);
        Intrinsics.checkNotNullParameter(promise, "promise");
    }

    @Override // com.kubi.p110rn.modules.command.ReactBridgeCallbackCommand
    public void onExecute() {
        C24267r0.m58521e("get rn session");
        String strMo36740c = ReactDepend.INSTANCE.webService().mo36740c(HostManager.a.m());
        if (strMo36740c == null) {
            strMo36740c = "";
        }
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putString("session", strMo36740c);
        C24267r0.m58520d(writableMapCreateMap);
        getPromise().resolve(writableMapCreateMap);
    }
}
