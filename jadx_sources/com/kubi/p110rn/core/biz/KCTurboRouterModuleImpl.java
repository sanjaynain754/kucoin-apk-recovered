package com.kubi.p110rn.core.biz;

import com.facebook.react.bridge.ReactApplicationContext;
import com.google.auto.service.AutoService;
import com.kubi.p110rn.core.turbo.NativeRouterTurboModuleAbs;
import com.kubi.p110rn.exception.RNMessage;
import com.kubi.router.core.Router;
import com.kubi.sdk.protocol.ProtocolException;
import d00.InterfaceC36587v;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.Ref;

/* JADX INFO: compiled from: KCTurboRouterModuleImpl.kt */
/* JADX INFO: loaded from: classes39.dex */
@Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\n\u0010\b\u001a\u0004\u0018\u00010\tH\u0002J\u0017\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\u0007H\u0016¢\u0006\u0002\u0010\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082D¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m90084d2 = {"Lcom/kubi/rn/core/biz/KCTurboRouterModuleImpl;", "Lcom/kubi/rn/core/turbo/NativeRouterTurboModuleAbs;", "ctx", "Lcom/facebook/react/bridge/ReactApplicationContext;", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "TAG", "", "bridge", "Lcom/kubi/sdk/protocol/jsapi/protocol/KCJSApiRouterModule;", "navigateTo", "", "url", "(Ljava/lang/String;)Ljava/lang/Boolean;", "BReactNativeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@AutoService({NativeRouterTurboModuleAbs.class})
public final class KCTurboRouterModuleImpl extends NativeRouterTurboModuleAbs {

    @NotNull
    private final String TAG;

    @NotNull
    private final ReactApplicationContext ctx;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KCTurboRouterModuleImpl(@NotNull ReactApplicationContext ctx) {
        super(ctx);
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        this.ctx = ctx;
        this.TAG = "KCTurboRouterModuleImpl";
    }

    private final InterfaceC36587v bridge() {
        Object objM103844constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl((InterfaceC36587v) Router.f46192a.m56192n(InterfaceC36587v.class));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        if (Result.m103850isFailureimpl(objM103844constructorimpl)) {
            objM103844constructorimpl = null;
        }
        return (InterfaceC36587v) objM103844constructorimpl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit navigateTo$lambda$1(Ref.BooleanRef booleanRef, Boolean bool, ProtocolException protocolException) {
        booleanRef.element = Intrinsics.areEqual(bool, Boolean.TRUE);
        return Unit.INSTANCE;
    }

    @Override // com.kubi.p110rn.core.turbo.NativeRouterTurboModuleAbs
    @Nullable
    public Boolean navigateTo(@NotNull String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        InterfaceC36587v interfaceC36587vBridge = bridge();
        if (interfaceC36587vBridge == null) {
            new RNMessage("navigateTo exception: common bridge service not found", this.TAG, false, 4, null);
            return null;
        }
        final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        Intrinsics.checkNotNullExpressionValue(reactApplicationContext, "getReactApplicationContext(...)");
        interfaceC36587vBridge.mo81878a(reactApplicationContext, null, KCTurboFileModuleImpl.SOURCE_RN, url, new Function2() { // from class: com.kubi.rn.core.biz.t0
            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return KCTurboRouterModuleImpl.navigateTo$lambda$1(booleanRef, (Boolean) obj, (ProtocolException) obj2);
            }
        });
        return Boolean.valueOf(booleanRef.element);
    }
}
