package com.kubi.p110rn.modules.command;

import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.Promise;
import com.kubi.p110rn.RNConstantKt;
import com.kubi.p110rn.exception.RNException;
import com.kubi.p110rn.modules.BridgeUtilsKt;
import org.jetbrains.annotations.NotNull;
import p569qq.C43846g;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: IReactBridgeCommand.kt */
/* JADX INFO: loaded from: classes39.dex */
@Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\b \u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\b\u001a\u00020\tJ\b\u0010\n\u001a\u00020\tH$R\u0014\u0010\u0002\u001a\u00020\u0003X\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000b"}, m90084d2 = {"Lcom/kubi/rn/modules/command/ReactBridgeCallbackCommand;", "Lcom/kubi/rn/modules/command/IReactBridgeCommand;", BaseJavaModule.METHOD_TYPE_PROMISE, "Lcom/facebook/react/bridge/Promise;", "<init>", "(Lcom/facebook/react/bridge/Promise;)V", "getPromise", "()Lcom/facebook/react/bridge/Promise;", "execute", "", "onExecute", "BReactNativeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nIReactBridgeCommand.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IReactBridgeCommand.kt\ncom/kubi/rn/modules/command/ReactBridgeCallbackCommand\n+ 2 RNIssue.kt\ncom/kubi/rn/exception/RNIssueKt\n*L\n1#1,59:1\n45#2,2:60\n*S KotlinDebug\n*F\n+ 1 IReactBridgeCommand.kt\ncom/kubi/rn/modules/command/ReactBridgeCallbackCommand\n*L\n48#1:60,2\n*E\n"})
public abstract class ReactBridgeCallbackCommand implements IReactBridgeCommand {

    @NotNull
    private final Promise promise;

    public abstract void onExecute();

    public ReactBridgeCallbackCommand(@NotNull Promise promise) {
        Intrinsics.checkNotNullParameter(promise, "promise");
        this.promise = promise;
    }

    @NotNull
    public final Promise getPromise() {
        return this.promise;
    }

    @Override // com.kubi.p110rn.modules.command.IReactBridgeCommand
    public final void execute() {
        try {
            onExecute();
        } catch (Exception e11) {
            this.promise.reject(BridgeUtilsKt.ERROR_EXCEPTION, "Failure. e:" + e11.getMessage(), e11);
            C43846g.m96568c(new RNException(e11, RNConstantKt.RN_CATEGORY, false, null, 8, null), null, 2, null);
        }
    }
}
