package com.kubi.p110rn.core.biz;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableMap;
import com.google.auto.service.AutoService;
import com.kubi.p110rn.core.turbo.FileActionResult;
import com.kubi.p110rn.core.turbo.NativeFileTurboModuleAbs;
import com.kubi.p110rn.core.turbo.PickFileResult;
import com.kubi.p110rn.modules.BridgeParamKeyKt;
import com.kubi.router.core.Router;
import com.kubi.sdk.protocol.ProtocolException;
import com.kubi.sdk.protocol.jsapi.protocol.KCJSApiFileFileActionResult;
import com.kubi.sdk.protocol.jsapi.protocol.KCJSApiFilePickFileResult;
import com.kubi.sdk.util.C24267r0;
import com.tencent.qcloud.tuicore.TUIConstants;
import d00.InterfaceC36570f;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: KCTurboFileModuleImpl.kt */
/* JADX INFO: loaded from: classes39.dex */
@Metadata(m90083d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000  2\u00020\u0001:\u0001 B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\n\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0002JA\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0014\u0010\u000f\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0012\u0004\u0012\u00020\t0\u0010H\u0016¢\u0006\u0002\u0010\u0012JQ\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000b2\b\u0010\u0017\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u00152\u0014\u0010\u000f\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u001b\u0012\u0004\u0012\u00020\t0\u0010H\u0016¢\u0006\u0002\u0010\u001cJD\u0010\u001d\u001a\u00020\t2\u0006\u0010\u001e\u001a\u00020\u000b2\b\u0010\u0017\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\b\u0010\u001f\u001a\u0004\u0018\u00010\u000b2\u0014\u0010\u000f\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u001b\u0012\u0004\u0012\u00020\t0\u0010H\u0016¨\u0006!"}, m90084d2 = {"Lcom/kubi/rn/core/biz/KCTurboFileModuleImpl;", "Lcom/kubi/rn/core/turbo/NativeFileTurboModuleAbs;", "ctx", "Lcom/facebook/react/bridge/ReactApplicationContext;", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "bridge", "Lcom/kubi/sdk/protocol/jsapi/protocol/KCJSApiFileModule;", "pickFile", "", "fileTypes", "", BridgeParamKeyKt.MAX_COUNT, "", "maxSize", TUIConstants.TUIChat.CALL_BACK, "Lkotlin/Function1;", "Lcom/kubi/rn/core/turbo/PickFileResult;", "(Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Lkotlin/jvm/functions/Function1;)V", "previewFile", "isRemoteUrl", "", "fileUrl", "fileName", "headers", "Lcom/facebook/react/bridge/ReadableMap;", "allowShare", "Lcom/kubi/rn/core/turbo/FileActionResult;", "(ZLjava/lang/String;Ljava/lang/String;Lcom/facebook/react/bridge/ReadableMap;Ljava/lang/Boolean;Lkotlin/jvm/functions/Function1;)V", "downloadFile", "url", "target", "Companion", "BReactNativeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@AutoService({NativeFileTurboModuleAbs.class})
public final class KCTurboFileModuleImpl extends NativeFileTurboModuleAbs {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @Deprecated
    @NotNull
    public static final String SOURCE_RN = "rn";

    /* JADX INFO: compiled from: KCTurboFileModuleImpl.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m90084d2 = {"Lcom/kubi/rn/core/biz/KCTurboFileModuleImpl$Companion;", "", "<init>", "()V", "SOURCE_RN", "", "BReactNativeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KCTurboFileModuleImpl(@NotNull ReactApplicationContext ctx) {
        super(ctx);
        Intrinsics.checkNotNullParameter(ctx, "ctx");
    }

    private final InterfaceC36570f bridge() {
        Object objM103844constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl((InterfaceC36570f) Router.f46192a.m56192n(InterfaceC36570f.class));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        if (Result.m103850isFailureimpl(objM103844constructorimpl)) {
            objM103844constructorimpl = null;
        }
        return (InterfaceC36570f) objM103844constructorimpl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit downloadFile$lambda$6(Function1 function1, KCJSApiFileFileActionResult kCJSApiFileFileActionResult, ProtocolException protocolException) {
        FileActionResult fileActionResultActionFailure;
        if (kCJSApiFileFileActionResult == null || (fileActionResultActionFailure = KCTurboFileModuleImplKt.toTurboResult(kCJSApiFileFileActionResult)) == null) {
            fileActionResultActionFailure = KCTurboFileModuleImplKt.actionFailure(KCTurboFileModuleImplKt.businessErrorOr(protocolException, "DOWNLOAD_FAILED"));
        }
        function1.invoke(fileActionResultActionFailure);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit pickFile$lambda$2(Function1 function1, KCJSApiFilePickFileResult kCJSApiFilePickFileResult, ProtocolException protocolException) {
        PickFileResult pickFileResultPickFailure;
        if (kCJSApiFilePickFileResult == null || (pickFileResultPickFailure = KCTurboFileModuleImplKt.toTurboResult(kCJSApiFilePickFileResult)) == null) {
            pickFileResultPickFailure = KCTurboFileModuleImplKt.pickFailure(KCTurboFileModuleImplKt.businessErrorOr(protocolException, "SAVE_FAILED"));
        }
        function1.invoke(pickFileResultPickFailure);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit previewFile$lambda$4(Function1 function1, KCJSApiFileFileActionResult kCJSApiFileFileActionResult, ProtocolException protocolException) {
        FileActionResult fileActionResultActionFailure;
        if (kCJSApiFileFileActionResult == null || (fileActionResultActionFailure = KCTurboFileModuleImplKt.toTurboResult(kCJSApiFileFileActionResult)) == null) {
            fileActionResultActionFailure = KCTurboFileModuleImplKt.actionFailure(KCTurboFileModuleImplKt.businessErrorOr(protocolException, "SAVE_FAILED"));
        }
        function1.invoke(fileActionResultActionFailure);
        return Unit.INSTANCE;
    }

    @Override // com.kubi.p110rn.core.turbo.NativeFileTurboModuleAbs
    public void downloadFile(@NotNull String url, @Nullable String fileName, @Nullable ReadableMap headers, @Nullable String target, @NotNull final Function1<? super FileActionResult, Unit> callback) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(callback, "callback");
        InterfaceC36570f interfaceC36570fBridge = bridge();
        if (interfaceC36570fBridge == null) {
            callback.invoke(KCTurboFileModuleImplKt.actionFailure("DOWNLOAD_FAILED"));
            return;
        }
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        Intrinsics.checkNotNullExpressionValue(reactApplicationContext, "getReactApplicationContext(...)");
        interfaceC36570fBridge.mo31715c(reactApplicationContext, null, SOURCE_RN, url, fileName, headers != null ? C24267r0.m58526j(headers) : null, target, new Function2() { // from class: com.kubi.rn.core.biz.j0
            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return KCTurboFileModuleImpl.downloadFile$lambda$6(callback, (KCJSApiFileFileActionResult) obj, (ProtocolException) obj2);
            }
        });
    }

    @Override // com.kubi.p110rn.core.turbo.NativeFileTurboModuleAbs
    public void pickFile(@Nullable String fileTypes, @Nullable Double maxCount, @Nullable Double maxSize, @NotNull final Function1<? super PickFileResult, Unit> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        InterfaceC36570f interfaceC36570fBridge = bridge();
        if (interfaceC36570fBridge == null) {
            callback.invoke(KCTurboFileModuleImplKt.pickFailure("SAVE_FAILED"));
            return;
        }
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        Intrinsics.checkNotNullExpressionValue(reactApplicationContext, "getReactApplicationContext(...)");
        interfaceC36570fBridge.mo31713a(reactApplicationContext, null, SOURCE_RN, fileTypes, maxCount != null ? Long.valueOf((long) maxCount.doubleValue()) : null, maxSize != null ? Long.valueOf((long) maxSize.doubleValue()) : null, new Function2() { // from class: com.kubi.rn.core.biz.l0
            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return KCTurboFileModuleImpl.pickFile$lambda$2(callback, (KCJSApiFilePickFileResult) obj, (ProtocolException) obj2);
            }
        });
    }

    @Override // com.kubi.p110rn.core.turbo.NativeFileTurboModuleAbs
    public void previewFile(boolean isRemoteUrl, @NotNull String fileUrl, @Nullable String fileName, @Nullable ReadableMap headers, @Nullable Boolean allowShare, @NotNull final Function1<? super FileActionResult, Unit> callback) {
        Intrinsics.checkNotNullParameter(fileUrl, "fileUrl");
        Intrinsics.checkNotNullParameter(callback, "callback");
        InterfaceC36570f interfaceC36570fBridge = bridge();
        if (interfaceC36570fBridge == null) {
            callback.invoke(KCTurboFileModuleImplKt.actionFailure("SAVE_FAILED"));
            return;
        }
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        Intrinsics.checkNotNullExpressionValue(reactApplicationContext, "getReactApplicationContext(...)");
        interfaceC36570fBridge.mo31714b(reactApplicationContext, null, SOURCE_RN, isRemoteUrl, fileUrl, fileName, headers != null ? C24267r0.m58526j(headers) : null, allowShare, new Function2() { // from class: com.kubi.rn.core.biz.k0
            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return KCTurboFileModuleImpl.previewFile$lambda$4(callback, (KCJSApiFileFileActionResult) obj, (ProtocolException) obj2);
            }
        });
    }
}
