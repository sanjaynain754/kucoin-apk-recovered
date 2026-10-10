package com.kubi.kyc.turbo;

import android.app.Activity;
import android.content.Context;
import com.appsflyer.AppsFlyerProperties;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableMap;
import com.google.auto.service.AutoService;
import com.kubi.kyc.protocol.AdvancedCertificationProtocolHandler;
import com.kubi.kyc.protocol.AdvancedCertificationResult;
import com.kubi.kyc.protocol.KycBindProtocolHandler;
import com.kubi.kyc.turbo.NativeKycTurboModule;
import com.kubi.p110rn.core.turbo.NativeKycTurboModuleAbs;
import com.tencent.qcloud.tuicore.TUIConstants;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: NativeKycTurboModule.kt */
/* JADX INFO: loaded from: classes21.dex */
@Metadata(m90083d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\n\u001a\u00020\u000bH\u0016¢\u0006\u0002\u0010\fJ\r\u0010\r\u001a\u00020\u000bH\u0016¢\u0006\u0002\u0010\fJ.\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00112\u0014\u0010\u0013\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0015\u0012\u0004\u0012\u00020\u000f0\u0014H\u0016R\u0014\u0010\u0006\u001a\u00020\u00078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u0016"}, m90084d2 = {"Lcom/kubi/kyc/turbo/NativeKycTurboModule;", "Lcom/kubi/rn/core/turbo/NativeKycTurboModuleAbs;", "reactContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "bindContext", "Landroid/content/Context;", "getBindContext", "()Landroid/content/Context;", "gotoBindEmail", "", "()Ljava/lang/Boolean;", "gotoBindPhone", "openAdvancedCertification", "", AppsFlyerProperties.CHANNEL, "", "data", TUIConstants.TUIChat.CALL_BACK, "Lkotlin/Function1;", "Lcom/facebook/react/bridge/ReadableMap;", "KycLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@AutoService({NativeKycTurboModuleAbs.class})
public final class NativeKycTurboModule extends NativeKycTurboModuleAbs {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NativeKycTurboModule(@NotNull ReactApplicationContext reactContext) {
        super(reactContext);
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit openAdvancedCertification$lambda$0(Function1 function1, AdvancedCertificationResult result) {
        Intrinsics.checkNotNullParameter(result, "result");
        function1.invoke(Arguments.makeNativeMap(result.m36856a()));
        return Unit.INSTANCE;
    }

    @Override // com.kubi.p110rn.core.turbo.NativeKycTurboModuleAbs
    @NotNull
    public Boolean gotoBindEmail() {
        return Boolean.valueOf(KycBindProtocolHandler.f31261a.m36862c(getBindContext()).getSuccess());
    }

    @Override // com.kubi.p110rn.core.turbo.NativeKycTurboModuleAbs
    @NotNull
    public Boolean gotoBindPhone() {
        return Boolean.valueOf(KycBindProtocolHandler.f31261a.m36863d(getBindContext()).getSuccess());
    }

    @Override // com.kubi.p110rn.core.turbo.NativeKycTurboModuleAbs
    public void openAdvancedCertification(@NotNull String channel, @NotNull String data, @NotNull final Function1<? super ReadableMap, Unit> callback) {
        Intrinsics.checkNotNullParameter(channel, "channel");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(callback, "callback");
        AdvancedCertificationProtocolHandler.f31241a.m36846b(getBindContext(), channel, data, new Function1() { // from class: nn.a
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NativeKycTurboModule.openAdvancedCertification$lambda$0(callback, (AdvancedCertificationResult) obj);
            }
        });
    }

    private final Context getBindContext() {
        Activity currentActivity = getReactApplicationContext().getCurrentActivity();
        if (currentActivity != null) {
            return currentActivity;
        }
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        Intrinsics.checkNotNullExpressionValue(reactApplicationContext, "getReactApplicationContext(...)");
        return reactApplicationContext;
    }
}
