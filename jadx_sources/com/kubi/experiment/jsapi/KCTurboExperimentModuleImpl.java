package com.kubi.experiment.jsapi;

import com.facebook.react.bridge.ReactApplicationContext;
import com.google.auto.service.AutoService;
import com.kubi.experiment.jsapi.KCTurboExperimentModuleImpl;
import com.kubi.p110rn.core.biz.KCTurboFileModuleImpl;
import com.kubi.p110rn.core.turbo.NativeExperimentTurboModuleAbs;
import com.kubi.router.core.Router;
import com.kubi.sdk.protocol.ProtocolException;
import com.kubi.utils.extensions.C27025c;
import com.tencent.qcloud.tuicore.TUIConstants;
import d00.InterfaceC36568e;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import ro.C44128b;

/* JADX INFO: compiled from: KCTurboExperimentModuleImpl.kt */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\n\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0002J&\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0014\u0010\f\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\u0004\u0012\u00020\t0\rH\u0016¨\u0006\u000f"}, m90084d2 = {"Lcom/kubi/experiment/jsapi/KCTurboExperimentModuleImpl;", "Lcom/kubi/rn/core/turbo/NativeExperimentTurboModuleAbs;", "ctx", "Lcom/facebook/react/bridge/ReactApplicationContext;", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "bridge", "Lcom/kubi/sdk/protocol/jsapi/protocol/KCJSApiExperimentModule;", "getExperimentResult", "", "code", "", TUIConstants.TUIChat.CALL_BACK, "Lkotlin/Function1;", "", "LExperiment_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@AutoService({NativeExperimentTurboModuleAbs.class})
public final class KCTurboExperimentModuleImpl extends NativeExperimentTurboModuleAbs {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KCTurboExperimentModuleImpl(@NotNull ReactApplicationContext ctx) {
        super(ctx);
        Intrinsics.checkNotNullParameter(ctx, "ctx");
    }

    private final InterfaceC36568e bridge() {
        Object objM103844constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl((InterfaceC36568e) Router.f46192a.m56192n(InterfaceC36568e.class));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        if (Result.m103850isFailureimpl(objM103844constructorimpl)) {
            objM103844constructorimpl = null;
        }
        return (InterfaceC36568e) objM103844constructorimpl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getExperimentResult$lambda$2(Function1 function1, Boolean bool, ProtocolException protocolException) {
        if (protocolException != null) {
            C44128b.m97265i("getExperimentResult error: " + protocolException.getMessage());
            function1.invoke(Boolean.FALSE);
        } else {
            function1.invoke(Boolean.valueOf(C27025c.m66566d(bool)));
        }
        return Unit.INSTANCE;
    }

    @Override // com.kubi.p110rn.core.turbo.NativeExperimentTurboModuleAbs
    public void getExperimentResult(@NotNull String code, @NotNull final Function1<? super Boolean, Unit> callback) {
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(callback, "callback");
        InterfaceC36568e interfaceC36568eBridge = bridge();
        if (interfaceC36568eBridge == null) {
            callback.invoke(null);
            return;
        }
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        Intrinsics.checkNotNullExpressionValue(reactApplicationContext, "getReactApplicationContext(...)");
        interfaceC36568eBridge.mo81858a(reactApplicationContext, null, KCTurboFileModuleImpl.SOURCE_RN, code, new Function2() { // from class: rf.b
            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return KCTurboExperimentModuleImpl.getExperimentResult$lambda$2(callback, (Boolean) obj, (ProtocolException) obj2);
            }
        });
    }
}
