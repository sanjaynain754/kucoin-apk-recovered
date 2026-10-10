package com.kubi.p110rn.core.turbo;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.google.gson.reflect.TypeToken;
import com.kubi.p110rn.core.biz.KCTurboFileModuleImpl;
import com.kubi.router.core.Router;
import com.kubi.sdk.protocol.ProtocolException;
import com.kubi.sdk.protocol.jsapi.protocol.KCJSApiKrnSocketConfig;
import com.kubi.sdk.util.C24267r0;
import com.kubi.utils.C27099x;
import com.kubi.utils.extensions.core.C27029c;
import d00.InterfaceC36575j;
import java.util.HashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p569qq.C43846g;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.Ref;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: NativeKrnSocketTurboModule.kt */
/* JADX INFO: loaded from: classes39.dex */
@Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\n\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0002J\u0014\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016J\u0014\u0010\f\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\rH\u0016¨\u0006\u000e"}, m90084d2 = {"Lcom/kubi/rn/core/turbo/NativeKrnSocketTurboModule;", "Lcom/kubi/rn/core/turbo/NativeKrnSocketTurboModuleSpec;", "reactContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "socketModule", "Lcom/kubi/sdk/protocol/jsapi/protocol/KCJSApiKrnSocketModule;", "startSocketTask", "Lcom/facebook/react/bridge/WritableMap;", "p0", "Lcom/facebook/react/bridge/ReadableMap;", "endSocketTask", "", "BReactNativeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nNativeKrnSocketTurboModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NativeKrnSocketTurboModule.kt\ncom/kubi/rn/core/turbo/NativeKrnSocketTurboModule\n+ 2 JsonEx.kt\ncom/kubi/mvi/common/JsonExKt\n+ 3 GsonUtils.kt\ncom/kubi/utils/GsonUtils\n*L\n1#1,62:1\n36#2:63\n137#3,5:64\n*S KotlinDebug\n*F\n+ 1 NativeKrnSocketTurboModule.kt\ncom/kubi/rn/core/turbo/NativeKrnSocketTurboModule\n*L\n25#1:63\n25#1:64,5\n*E\n"})
public final class NativeKrnSocketTurboModule extends NativeKrnSocketTurboModuleSpec {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NativeKrnSocketTurboModule(@NotNull ReactApplicationContext reactContext) {
        super(reactContext);
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit endSocketTask$lambda$4(Ref.ObjectRef objectRef, Boolean bool, ProtocolException protocolException) {
        if (protocolException != null) {
            return Unit.INSTANCE;
        }
        objectRef.element = bool;
        return Unit.INSTANCE;
    }

    private final InterfaceC36575j socketModule() {
        Object objM103844constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl((InterfaceC36575j) Router.f46192a.m56192n(InterfaceC36575j.class));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        if (Result.m103850isFailureimpl(objM103844constructorimpl)) {
            objM103844constructorimpl = null;
        }
        return (InterfaceC36575j) objM103844constructorimpl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit startSocketTask$lambda$2(Ref.ObjectRef objectRef, String str, ProtocolException protocolException) {
        if (protocolException != null) {
            return Unit.INSTANCE;
        }
        objectRef.element = str;
        return Unit.INSTANCE;
    }

    @Override // com.kubi.p110rn.core.turbo.NativeKrnSocketTurboModuleSpec
    @Nullable
    public WritableMap endSocketTask(@Nullable String p11) {
        InterfaceC36575j interfaceC36575jSocketModule = socketModule();
        if (interfaceC36575jSocketModule == null) {
            return null;
        }
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        Intrinsics.checkNotNullExpressionValue(reactApplicationContext, "getReactApplicationContext(...)");
        if (p11 == null) {
            p11 = "";
        }
        interfaceC36575jSocketModule.mo31719a(reactApplicationContext, null, KCTurboFileModuleImpl.SOURCE_RN, p11, new Function2() { // from class: com.kubi.rn.core.turbo.y1
            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return NativeKrnSocketTurboModule.endSocketTask$lambda$4(objectRef, (Boolean) obj, (ProtocolException) obj2);
            }
        });
        return C24267r0.m58528l(objectRef.element);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.kubi.p110rn.core.turbo.NativeKrnSocketTurboModuleSpec
    @Nullable
    public WritableMap startSocketTask(@Nullable ReadableMap p11) {
        HashMap<String, Object> hashMap;
        String strM66606i;
        Object objM66914d;
        InterfaceC36575j interfaceC36575jSocketModule = socketModule();
        if (interfaceC36575jSocketModule != null && p11 != null && (hashMap = p11.toHashMap()) != null && (strM66606i = C27029c.m66606i(hashMap)) != null) {
            try {
                C27099x c27099x = C27099x.f54458a;
                objM66914d = C27099x.m66914d(strM66606i, new TypeToken<KCJSApiKrnSocketConfig>() { // from class: com.kubi.rn.core.turbo.NativeKrnSocketTurboModule$startSocketTask$$inlined$convertToObj$1
                }.getType());
            } catch (Throwable th2) {
                C43846g.m96569d(th2, "GsonUtils", null, 4, null);
                objM66914d = null;
            }
            KCJSApiKrnSocketConfig kCJSApiKrnSocketConfig = (KCJSApiKrnSocketConfig) objM66914d;
            if (kCJSApiKrnSocketConfig != null) {
                final Ref.ObjectRef objectRef = new Ref.ObjectRef();
                String str = "";
                objectRef.element = "";
                ReactApplicationContext reactApplicationContext = getReactApplicationContext();
                Intrinsics.checkNotNullExpressionValue(reactApplicationContext, "getReactApplicationContext(...)");
                interfaceC36575jSocketModule.mo31720b(reactApplicationContext, null, KCTurboFileModuleImpl.SOURCE_RN, kCJSApiKrnSocketConfig, new Function2() { // from class: com.kubi.rn.core.turbo.x1
                    @Override // p852kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return NativeKrnSocketTurboModule.startSocketTask$lambda$2(objectRef, (String) obj, (ProtocolException) obj2);
                    }
                });
                String str2 = (String) objectRef.element;
                if (str2 != null) {
                    str = str2;
                }
                return C24267r0.m58528l(str);
            }
        }
        return null;
    }
}
