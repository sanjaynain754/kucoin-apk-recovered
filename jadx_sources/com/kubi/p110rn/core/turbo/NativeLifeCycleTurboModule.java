package com.kubi.p110rn.core.turbo;

import com.facebook.react.bridge.ReactApplicationContext;
import com.google.auto.service.AutoService;
import com.kubi.event.api.C12572a;
import com.kubi.p110rn.RNConstantKt;
import java.util.LinkedHashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.jvm.internal.Intrinsics;
import ro.C44128b;

/* JADX INFO: compiled from: NativeLifeCycleTurboModule.kt */
/* JADX INFO: loaded from: classes39.dex */
@Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0004\b\u0007\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0016J-\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0002\u0010\u000e¨\u0006\u0010"}, m90084d2 = {"Lcom/kubi/rn/core/turbo/NativeLifeCycleTurboModule;", "Lcom/kubi/rn/core/turbo/NativeLifeCycleTurboModuleAbs;", "reactContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "getName", "", "pageDidMount", "", "pageType", "dclTime", "", "subPath", "(Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;)Ljava/lang/Boolean;", "Companion", "BReactNativeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@AutoService({NativeLifeCycleTurboModuleAbs.class})
public final class NativeLifeCycleTurboModule extends NativeLifeCycleTurboModuleAbs {

    @NotNull
    public static final String NAME = "LifeCycle";

    @NotNull
    private static final String TAG = "NativeLifeCycleTurboModule";

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NativeLifeCycleTurboModule(@NotNull ReactApplicationContext reactContext) {
        super(reactContext);
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
    }

    @Override // com.kubi.p110rn.core.turbo.NativeLifeCycleTurboModuleAbs, com.facebook.react.bridge.NativeModule
    @NotNull
    public String getName() {
        return "LifeCycle";
    }

    @Override // com.kubi.p110rn.core.turbo.NativeLifeCycleTurboModuleAbs
    @Nullable
    public Boolean pageDidMount(@Nullable String pageType, @Nullable Double dclTime, @Nullable String subPath) {
        Object objM103844constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("subPath", subPath == null ? "" : subPath);
            linkedHashMap.put("pageMount", Long.valueOf(System.currentTimeMillis()));
            C12572a.m23695d(RNConstantKt.SEND_PAGE_MOUNT, linkedHashMap, 0L, 4, null);
            StringBuilder sb2 = new StringBuilder();
            sb2.append("pageDidMount subPath=");
            if (subPath == null) {
                subPath = "";
            }
            sb2.append(subPath);
            sb2.append(" pageType=");
            if (pageType == null) {
                pageType = "";
            }
            sb2.append(pageType);
            sb2.append(" dclTime=");
            sb2.append(dclTime);
            C44128b.m97266j(TAG, sb2.toString());
            objM103844constructorimpl = Result.m103844constructorimpl(Boolean.TRUE);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
        if (thM103847exceptionOrNullimpl != null) {
            C44128b.m97266j(TAG, "pageDidMount failed error=" + thM103847exceptionOrNullimpl.getClass().getSimpleName() + " message=" + thM103847exceptionOrNullimpl.getMessage());
            objM103844constructorimpl = Boolean.FALSE;
        }
        return (Boolean) objM103844constructorimpl;
    }
}
