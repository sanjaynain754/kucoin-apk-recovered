package com.kubi.p110rn.core.biz;

import com.facebook.react.bridge.ReactApplicationContext;
import com.google.auto.service.AutoService;
import com.kubi.p110rn.core.turbo.NativeRemoteConfigTurboModuleAbs;
import com.kubi.p110rn.exception.RNMessage;
import com.kubi.router.core.Router;
import com.kubi.sdk.protocol.ProtocolException;
import d00.InterfaceC36586u;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.Ref;

/* JADX INFO: compiled from: KCTurboRemoteConfigModuleImpl.kt */
/* JADX INFO: loaded from: classes39.dex */
@Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\n\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0002J\u001a\u0010\f\u001a\u0004\u0018\u00010\u00072\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u0007H\u0016J\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0010\u001a\u00020\u0007H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u0007X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0011"}, m90084d2 = {"Lcom/kubi/rn/core/biz/KCTurboRemoteConfigModuleImpl;", "Lcom/kubi/rn/core/turbo/NativeRemoteConfigTurboModuleAbs;", "ctx", "Lcom/facebook/react/bridge/ReactApplicationContext;", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "TAG", "", "getTAG", "()Ljava/lang/String;", "commonBridge", "Lcom/kubi/sdk/protocol/jsapi/protocol/KCJSApiRemoteConfigModule;", "fastFetchAbTest", "paramName", "defaultValue", "getRemoteConfig", "key", "BReactNativeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@AutoService({NativeRemoteConfigTurboModuleAbs.class})
public final class KCTurboRemoteConfigModuleImpl extends NativeRemoteConfigTurboModuleAbs {

    @NotNull
    private final String TAG;

    @NotNull
    private final ReactApplicationContext ctx;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KCTurboRemoteConfigModuleImpl(@NotNull ReactApplicationContext ctx) {
        super(ctx);
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        this.ctx = ctx;
        this.TAG = "KCTurboRemoteConfigModuleImpl";
    }

    private final InterfaceC36586u commonBridge() {
        Object objM103844constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl((InterfaceC36586u) Router.f46192a.m56192n(InterfaceC36586u.class));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        if (Result.m103850isFailureimpl(objM103844constructorimpl)) {
            objM103844constructorimpl = null;
        }
        return (InterfaceC36586u) objM103844constructorimpl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit fastFetchAbTest$lambda$1(Ref.ObjectRef objectRef, Ref.ObjectRef objectRef2, String str, ProtocolException protocolException) {
        objectRef.element = str;
        objectRef2.element = protocolException;
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit getRemoteConfig$lambda$3(Ref.ObjectRef objectRef, String str, ProtocolException protocolException) {
        T t11 = str;
        if (str == null) {
            t11 = "";
        }
        objectRef.element = t11;
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.kubi.p110rn.core.turbo.NativeRemoteConfigTurboModuleAbs
    @Nullable
    public String fastFetchAbTest(@NotNull String paramName, @NotNull String defaultValue) {
        Intrinsics.checkNotNullParameter(paramName, "paramName");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        InterfaceC36586u interfaceC36586uCommonBridge = commonBridge();
        if (interfaceC36586uCommonBridge == null) {
            new RNMessage("fastFetchAbTest exception: common bridge service not found", this.TAG, false, 4, null);
            return null;
        }
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = "";
        final Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        Intrinsics.checkNotNullExpressionValue(reactApplicationContext, "getReactApplicationContext(...)");
        interfaceC36586uCommonBridge.mo31566a(reactApplicationContext, null, KCTurboFileModuleImpl.SOURCE_RN, paramName, defaultValue, new Function2() { // from class: com.kubi.rn.core.biz.s0
            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return KCTurboRemoteConfigModuleImpl.fastFetchAbTest$lambda$1(objectRef, objectRef2, (String) obj, (ProtocolException) obj2);
            }
        });
        ProtocolException protocolException = (ProtocolException) objectRef2.element;
        if (protocolException != null) {
            new RNMessage("fastFetchAbTest exception: " + protocolException.getMessage(), this.TAG, false, 4, null);
        }
        return (String) objectRef.element;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.kubi.p110rn.core.turbo.NativeRemoteConfigTurboModuleAbs
    @Nullable
    public String getRemoteConfig(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        InterfaceC36586u interfaceC36586uCommonBridge = commonBridge();
        if (interfaceC36586uCommonBridge == null) {
            return null;
        }
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = "";
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        Intrinsics.checkNotNullExpressionValue(reactApplicationContext, "getReactApplicationContext(...)");
        interfaceC36586uCommonBridge.mo31567b(reactApplicationContext, null, KCTurboFileModuleImpl.SOURCE_RN, key, new Function2() { // from class: com.kubi.rn.core.biz.r0
            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return KCTurboRemoteConfigModuleImpl.getRemoteConfig$lambda$3(objectRef, (String) obj, (ProtocolException) obj2);
            }
        });
        return (String) objectRef.element;
    }

    @NotNull
    public final String getTAG() {
        return this.TAG;
    }
}
