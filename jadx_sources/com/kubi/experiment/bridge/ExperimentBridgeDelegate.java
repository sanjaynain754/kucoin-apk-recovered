package com.kubi.experiment.bridge;

import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwnerKt;
import com.kubi.sdk.protocol.ProtocolException;
import com.tencent.qcloud.tuicore.TUIConstants;
import kotlinx.coroutines.C41696j;
import org.jetbrains.annotations.NotNull;
import p481ny.C42899b;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ExperimentBridgeDelegate.kt */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J,\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u001c\u0010\b\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0004\u0012\u00020\u00050\t¨\u0006\f"}, m90084d2 = {"Lcom/kubi/experiment/bridge/ExperimentBridgeDelegate;", "", "<init>", "()V", "getExperimentResult", "", "code", "", TUIConstants.TUIChat.CALL_BACK, "Lkotlin/Function2;", "", "Lcom/kubi/sdk/protocol/ProtocolException;", "LExperiment_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class ExperimentBridgeDelegate {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final ExperimentBridgeDelegate f21682a = new ExperimentBridgeDelegate();

    /* JADX INFO: renamed from: d */
    public static final Unit m23709d(String str, Function2 function2, FragmentActivity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        C41696j.m91104d(LifecycleOwnerKt.getLifecycleScope(activity), null, null, new ExperimentBridgeDelegate$getExperimentResult$1$1$1(str, function2, null), 3, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: e */
    public static final Unit m23710e(Function2 function2) {
        function2.invoke(null, new ProtocolException("getExperimentResult error: getTopActivity is null", null, null, false, 14, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: c */
    public final void m23711c(@NotNull final String code, @NotNull final Function2<? super Boolean, ? super ProtocolException, Unit> callback) {
        Object objM103844constructorimpl;
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(callback, "callback");
        try {
            Result.Companion companion = Result.INSTANCE;
            C42899b.m94074d(new Function1() { // from class: com.kubi.experiment.bridge.a
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return ExperimentBridgeDelegate.m23709d(code, callback, (FragmentActivity) obj);
                }
            }, new Function0() { // from class: com.kubi.experiment.bridge.b
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ExperimentBridgeDelegate.m23710e(callback);
                }
            });
            objM103844constructorimpl = Result.m103844constructorimpl(Unit.INSTANCE);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
        if (thM103847exceptionOrNullimpl != null) {
            callback.invoke(null, new ProtocolException("getExperimentResult error: " + thM103847exceptionOrNullimpl.getMessage(), null, null, false, 14, null));
        }
    }
}
