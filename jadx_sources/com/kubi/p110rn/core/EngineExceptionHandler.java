package com.kubi.p110rn.core;

import androidx.camera.view.C1454t;
import com.facebook.react.bridge.JSExceptionHandler;
import com.kubi.p110rn.RNConstantKt;
import com.kubi.p110rn.exception.RNException;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.util.concurrent.atomic.AtomicReference;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p569qq.C43846g;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: ReactInstanceHelper.kt */
/* JADX INFO: loaded from: classes39.dex */
@Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0001J\u0006\u0010\u000b\u001a\u00020\fJ\u000e\u0010\r\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\u0001J\u0014\u0010\u000e\u001a\u00020\f2\n\u0010\u000f\u001a\u00060\u0010j\u0002`\u0011H\u0016R\u0016\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m90084d2 = {"Lcom/kubi/rn/core/EngineExceptionHandler;", "Lcom/facebook/react/bridge/JSExceptionHandler;", TUIConstants.TUIChat.OWNER, "<init>", "(Lcom/facebook/react/bridge/JSExceptionHandler;)V", "initializationHandler", "Ljava/util/concurrent/atomic/AtomicReference;", "ownerHandler", "beginInitialization", "", "handler", "endInitialization", "", "unbindOwner", "handleException", "e", "Ljava/lang/Exception;", "Lkotlin/Exception;", "BReactNativeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nReactInstanceHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReactInstanceHelper.kt\ncom/kubi/rn/core/EngineExceptionHandler\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 RNIssue.kt\ncom/kubi/rn/exception/RNIssueKt\n*L\n1#1,207:1\n1#2:208\n45#3,2:209\n*S KotlinDebug\n*F\n+ 1 ReactInstanceHelper.kt\ncom/kubi/rn/core/EngineExceptionHandler\n*L\n122#1:209,2\n*E\n"})
public final class EngineExceptionHandler implements JSExceptionHandler {

    @NotNull
    private final AtomicReference<JSExceptionHandler> initializationHandler;

    @NotNull
    private final AtomicReference<JSExceptionHandler> ownerHandler;

    /* JADX WARN: Multi-variable type inference failed */
    public EngineExceptionHandler() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public EngineExceptionHandler(@Nullable JSExceptionHandler jSExceptionHandler) {
        this.initializationHandler = new AtomicReference<>(null);
        this.ownerHandler = new AtomicReference<>(jSExceptionHandler);
    }

    public final boolean beginInitialization(@NotNull JSExceptionHandler handler) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        return C1454t.m2255a(this.initializationHandler, null, handler);
    }

    public final void endInitialization() {
        this.initializationHandler.set(null);
    }

    @Override // com.facebook.react.bridge.JSExceptionHandler
    public void handleException(@NotNull Exception e11) {
        Object objM103844constructorimpl;
        Unit unit;
        Object objM103844constructorimpl2;
        Object objM103844constructorimpl3;
        Unit unit2;
        Intrinsics.checkNotNullParameter(e11, "e");
        JSExceptionHandler jSExceptionHandler = this.ownerHandler.get();
        JSExceptionHandler jSExceptionHandler2 = this.initializationHandler.get();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("KRN_BUNDLE_LOAD stage=engine_exception ownerBound=");
        sb2.append(jSExceptionHandler != null);
        sb2.append(" initializationBound=");
        sb2.append(jSExceptionHandler2 != null);
        ReactInstanceHelperKt.logKrnBundleLoadError("ReactInstanceHelper", sb2.toString(), e11);
        try {
            Result.Companion companion = Result.INSTANCE;
            if (jSExceptionHandler != null) {
                jSExceptionHandler.handleException(e11);
                unit2 = Unit.INSTANCE;
            } else {
                unit2 = null;
            }
            objM103844constructorimpl = Result.m103844constructorimpl(unit2);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
        if (thM103847exceptionOrNullimpl != null) {
            ReactInstanceHelperKt.logKrnBundleLoadError("ReactInstanceHelper", "KRN_BUNDLE_LOAD stage=exception_consumer_failed target=owner", thM103847exceptionOrNullimpl);
        }
        if (jSExceptionHandler2 != null) {
            try {
                jSExceptionHandler2.handleException(e11);
                unit = Unit.INSTANCE;
            } catch (Throwable th3) {
                Result.Companion companion3 = Result.INSTANCE;
                objM103844constructorimpl2 = Result.m103844constructorimpl(ResultKt.createFailure(th3));
            }
        } else {
            unit = null;
        }
        objM103844constructorimpl2 = Result.m103844constructorimpl(unit);
        Throwable thM103847exceptionOrNullimpl2 = Result.m103847exceptionOrNullimpl(objM103844constructorimpl2);
        if (thM103847exceptionOrNullimpl2 != null) {
            ReactInstanceHelperKt.logKrnBundleLoadError("ReactInstanceHelper", "KRN_BUNDLE_LOAD stage=exception_consumer_failed target=initialization", thM103847exceptionOrNullimpl2);
        }
        try {
            C43846g.m96568c(new RNException(e11, RNConstantKt.RN_CATEGORY, false, null, 8, null), null, 2, null);
            objM103844constructorimpl3 = Result.m103844constructorimpl(Unit.INSTANCE);
        } catch (Throwable th4) {
            Result.Companion companion4 = Result.INSTANCE;
            objM103844constructorimpl3 = Result.m103844constructorimpl(ResultKt.createFailure(th4));
        }
        Throwable thM103847exceptionOrNullimpl3 = Result.m103847exceptionOrNullimpl(objM103844constructorimpl3);
        if (thM103847exceptionOrNullimpl3 != null) {
            ReactInstanceHelperKt.logKrnBundleLoadError("ReactInstanceHelper", "KRN_BUNDLE_LOAD stage=exception_consumer_failed target=categoryException", thM103847exceptionOrNullimpl3);
        }
    }

    public final boolean unbindOwner(@NotNull JSExceptionHandler owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        return C1454t.m2255a(this.ownerHandler, owner, null);
    }

    public /* synthetic */ EngineExceptionHandler(JSExceptionHandler jSExceptionHandler, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : jSExceptionHandler);
    }
}
