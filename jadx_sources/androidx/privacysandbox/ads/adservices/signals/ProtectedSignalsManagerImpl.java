package androidx.privacysandbox.ads.adservices.signals;

import android.annotation.SuppressLint;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresExtension;
import androidx.annotation.RequiresPermission;
import androidx.annotation.RestrictTo;
import androidx.core.os.OutcomeReceiverKt;
import androidx.credentials.ExecutorC1980h;
import androidx.privacysandbox.ads.adservices.common.ExperimentalFeatures;
import kotlinx.coroutines.C41716o;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p417l0.C42014d;
import p417l0.C42015e;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugProbesKt;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: ProtectedSignalsManagerImpl.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0017\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002J\u0016\u0010\t\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\bH\u0097@¢\u0006\u0002\u0010\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m90084d2 = {"Landroidx/privacysandbox/ads/adservices/signals/ProtectedSignalsManagerImpl;", "Landroidx/privacysandbox/ads/adservices/signals/ProtectedSignalsManager;", "protectedSignalsManager", "Landroid/adservices/signals/ProtectedSignalsManager;", "(Landroid/adservices/signals/ProtectedSignalsManager;)V", "convertUpdateRequest", "Landroid/adservices/signals/UpdateSignalsRequest;", "request", "Landroidx/privacysandbox/ads/adservices/signals/UpdateSignalsRequest;", "updateSignals", "", "(Landroidx/privacysandbox/ads/adservices/signals/UpdateSignalsRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ads-adservices_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
@SuppressLint({"NewApi", "ClassVerificationFailure"})
@ExperimentalFeatures.Ext12OptIn
@RequiresExtension(extension = 1000000, version = 12)
@RestrictTo({RestrictTo.Scope.LIBRARY})
@SourceDebugExtension({"SMAP\nProtectedSignalsManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ProtectedSignalsManagerImpl.kt\nandroidx/privacysandbox/ads/adservices/signals/ProtectedSignalsManagerImpl\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,55:1\n314#2,11:56\n*S KotlinDebug\n*F\n+ 1 ProtectedSignalsManagerImpl.kt\nandroidx/privacysandbox/ads/adservices/signals/ProtectedSignalsManagerImpl\n*L\n40#1:56,11\n*E\n"})
public class ProtectedSignalsManagerImpl extends ProtectedSignalsManager {

    @NotNull
    private final android.adservices.signals.ProtectedSignalsManager protectedSignalsManager;

    @RequiresPermission("android.permission.ACCESS_ADSERVICES_PROTECTED_SIGNALS")
    @DoNotInline
    public static /* synthetic */ Object updateSignals$suspendImpl(ProtectedSignalsManagerImpl protectedSignalsManagerImpl, UpdateSignalsRequest updateSignalsRequest, Continuation<? super Unit> continuation) {
        C41716o c41716o = new C41716o(IntrinsicsKt.intercepted(continuation), 1);
        c41716o.m91142E();
        protectedSignalsManagerImpl.protectedSignalsManager.updateSignals(protectedSignalsManagerImpl.convertUpdateRequest(updateSignalsRequest), new ExecutorC1980h(), OutcomeReceiverKt.asOutcomeReceiver(c41716o));
        Object objM91171w = c41716o.m91171w();
        if (objM91171w == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return objM91171w == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM91171w : Unit.INSTANCE;
    }

    public ProtectedSignalsManagerImpl(@NotNull android.adservices.signals.ProtectedSignalsManager protectedSignalsManager) {
        Intrinsics.checkNotNullParameter(protectedSignalsManager, "protectedSignalsManager");
        this.protectedSignalsManager = protectedSignalsManager;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final android.adservices.signals.UpdateSignalsRequest convertUpdateRequest(UpdateSignalsRequest request) {
        C42015e.m92117a();
        android.adservices.signals.UpdateSignalsRequest updateSignalsRequestBuild = C42014d.m92116a(request.getUpdateUri()).build();
        Intrinsics.checkNotNullExpressionValue(updateSignalsRequestBuild, "Builder(request.updateUri).build()");
        return updateSignalsRequestBuild;
    }

    @Override // androidx.privacysandbox.ads.adservices.signals.ProtectedSignalsManager
    @RequiresPermission("android.permission.ACCESS_ADSERVICES_PROTECTED_SIGNALS")
    @DoNotInline
    @Nullable
    public Object updateSignals(@NotNull UpdateSignalsRequest updateSignalsRequest, @NotNull Continuation<? super Unit> continuation) {
        return updateSignals$suspendImpl(this, updateSignalsRequest, continuation);
    }
}
