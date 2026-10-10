package com.kubi.p110rn.core.biz;

import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import f00.C37304a;
import g00.InterfaceC37752d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;

/* JADX INFO: compiled from: FuturesNavigationModule.kt */
/* JADX INFO: loaded from: classes39.dex */
@Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0016J$\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\f\u001a\u00020\rH\u0007¨\u0006\u000f"}, m90084d2 = {"Lcom/kubi/rn/core/biz/FuturesNavigationModule;", "Lcom/facebook/react/bridge/ReactContextBaseJavaModule;", "reactContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "getName", "", "openFuturesAccount", "", "sourcePage", "spm", BaseJavaModule.METHOD_TYPE_PROMISE, "Lcom/facebook/react/bridge/Promise;", "Companion", "BReactNativeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nFuturesNavigationModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FuturesNavigationModule.kt\ncom/kubi/rn/core/biz/FuturesNavigationModule\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,40:1\n1#2:41\n*E\n"})
public final class FuturesNavigationModule extends ReactContextBaseJavaModule {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @Deprecated
    @NotNull
    public static final String DEFAULT_SOURCE_PAGE = "FUTURES_PAGE";

    @Deprecated
    @NotNull
    public static final String ERROR_CODE = "open_futures_account_failed";

    @Deprecated
    @NotNull
    public static final String NAME = "FuturesNavigation";

    /* JADX INFO: compiled from: FuturesNavigationModule.kt */
    @Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, m90084d2 = {"Lcom/kubi/rn/core/biz/FuturesNavigationModule$Companion;", "", "<init>", "()V", "NAME", "", "DEFAULT_SOURCE_PAGE", "ERROR_CODE", "BReactNativeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FuturesNavigationModule(@NotNull ReactApplicationContext reactContext) {
        super(reactContext);
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
    }

    @Override // com.facebook.react.bridge.NativeModule
    @NotNull
    public String getName() {
        return NAME;
    }

    @ReactMethod
    public final void openFuturesAccount(@Nullable String sourcePage, @Nullable String spm, @NotNull Promise promise) {
        Object objM103844constructorimpl;
        String string;
        Intrinsics.checkNotNullParameter(promise, "promise");
        try {
            Result.Companion companion = Result.INSTANCE;
            C37304a c37304a = C37304a.f82764a;
            String string2 = sourcePage != null ? StringsKt.trim((CharSequence) sourcePage).toString() : null;
            if (string2 == null) {
                string2 = "";
            }
            if (string2.length() == 0) {
                string2 = DEFAULT_SOURCE_PAGE;
            }
            objM103844constructorimpl = Result.m103844constructorimpl(Boolean.valueOf(InterfaceC37752d.a.m85123b(c37304a, string2, Boolean.TRUE, null, (spm == null || (string = StringsKt.trim((CharSequence) spm).toString()) == null || string.length() <= 0) ? null : string, null, null, 52, null)));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        if (Result.m103851isSuccessimpl(objM103844constructorimpl)) {
            ((Boolean) objM103844constructorimpl).getClass();
            promise.resolve(Boolean.TRUE);
        }
        Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
        if (thM103847exceptionOrNullimpl != null) {
            promise.reject(ERROR_CODE, thM103847exceptionOrNullimpl.getMessage(), thM103847exceptionOrNullimpl);
        }
    }
}
