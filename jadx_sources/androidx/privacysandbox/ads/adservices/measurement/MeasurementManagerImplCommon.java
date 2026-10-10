package androidx.privacysandbox.ads.adservices.measurement;

import android.annotation.SuppressLint;
import android.net.Uri;
import android.view.InputEvent;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresExtension;
import androidx.annotation.RequiresPermission;
import androidx.annotation.RestrictTo;
import androidx.core.os.OutcomeReceiverKt;
import androidx.credentials.ExecutorC1980h;
import androidx.privacysandbox.ads.adservices.common.ExperimentalFeatures;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.C41713n0;
import kotlinx.coroutines.C41716o;
import kotlinx.coroutines.InterfaceC41709m0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p780y.C46357a;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.DebugProbesKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: MeasurementManagerImplCommon.kt */
/* JADX INFO: loaded from: classes34.dex */
@RequiresExtension.Container({@RequiresExtension(extension = 1000000, version = 5), @RequiresExtension(extension = 31, version = 9)})
@Metadata(m90083d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0017\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0097@¢\u0006\u0004\b\t\u0010\nJ\"\u0010\u000f\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0097@¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u000bH\u0097@¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u0014H\u0097@¢\u0006\u0004\b\u0016\u0010\u0017J\u0018\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u0018H\u0097@¢\u0006\u0004\b\u000f\u0010\u0019J\u0018\u0010\u001b\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u001aH\u0097@¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u001dH\u0097@¢\u0006\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0003\u001a\u00020\u00028\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\"¨\u0006#"}, m90084d2 = {"Landroidx/privacysandbox/ads/adservices/measurement/MeasurementManagerImplCommon;", "Landroidx/privacysandbox/ads/adservices/measurement/MeasurementManager;", "Ly/a;", "mMeasurementManager", "<init>", "(Ly/a;)V", "Landroidx/privacysandbox/ads/adservices/measurement/DeletionRequest;", "deletionRequest", "", "deleteRegistrations", "(Landroidx/privacysandbox/ads/adservices/measurement/DeletionRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroid/net/Uri;", "attributionSource", "Landroid/view/InputEvent;", "inputEvent", "registerSource", "(Landroid/net/Uri;Landroid/view/InputEvent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "trigger", "registerTrigger", "(Landroid/net/Uri;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/privacysandbox/ads/adservices/measurement/WebSourceRegistrationRequest;", "request", "registerWebSource", "(Landroidx/privacysandbox/ads/adservices/measurement/WebSourceRegistrationRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/privacysandbox/ads/adservices/measurement/SourceRegistrationRequest;", "(Landroidx/privacysandbox/ads/adservices/measurement/SourceRegistrationRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/privacysandbox/ads/adservices/measurement/WebTriggerRegistrationRequest;", "registerWebTrigger", "(Landroidx/privacysandbox/ads/adservices/measurement/WebTriggerRegistrationRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "getMeasurementApiStatus", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ly/a;", "getMMeasurementManager", "()Ly/a;", "ads-adservices_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
@SuppressLint({"NewApi", "ClassVerificationFailure"})
@RestrictTo({RestrictTo.Scope.LIBRARY})
@SourceDebugExtension({"SMAP\nMeasurementManagerImplCommon.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MeasurementManagerImplCommon.kt\nandroidx/privacysandbox/ads/adservices/measurement/MeasurementManagerImplCommon\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,130:1\n314#2,11:131\n314#2,11:142\n314#2,11:153\n314#2,11:164\n314#2,11:175\n314#2,11:186\n*S KotlinDebug\n*F\n+ 1 MeasurementManagerImplCommon.kt\nandroidx/privacysandbox/ads/adservices/measurement/MeasurementManagerImplCommon\n*L\n44#1:131,11\n56#1:142,11\n69#1:153,11\n81#1:164,11\n111#1:175,11\n123#1:186,11\n*E\n"})
public class MeasurementManagerImplCommon extends MeasurementManager {

    @NotNull
    private final C46357a mMeasurementManager;

    /* JADX INFO: renamed from: androidx.privacysandbox.ads.adservices.measurement.MeasurementManagerImplCommon$registerSource$4 */
    /* JADX INFO: compiled from: MeasurementManagerImplCommon.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m90084d2 = {"Lkotlinx/coroutines/m0;", "", "<anonymous>", "(Lkotlinx/coroutines/m0;)V"}, m90085k = 3, m90086mv = {1, 8, 0})
    @DebugMetadata(m90121c = "androidx.privacysandbox.ads.adservices.measurement.MeasurementManagerImplCommon$registerSource$4", m90122f = "MeasurementManagerImplCommon.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    @SourceDebugExtension({"SMAP\nMeasurementManagerImplCommon.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MeasurementManagerImplCommon.kt\nandroidx/privacysandbox/ads/adservices/measurement/MeasurementManagerImplCommon$registerSource$4\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,130:1\n1855#2,2:131\n*S KotlinDebug\n*F\n+ 1 MeasurementManagerImplCommon.kt\nandroidx/privacysandbox/ads/adservices/measurement/MeasurementManagerImplCommon$registerSource$4\n*L\n94#1:131,2\n*E\n"})
    public static final class C38494 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
        final /* synthetic */ SourceRegistrationRequest $request;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ MeasurementManagerImplCommon this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C38494(SourceRegistrationRequest sourceRegistrationRequest, MeasurementManagerImplCommon measurementManagerImplCommon, Continuation<? super C38494> continuation) {
            super(2, continuation);
            this.$request = sourceRegistrationRequest;
            this.this$0 = measurementManagerImplCommon;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C38494 c38494 = new C38494(this.$request, this.this$0, continuation);
            c38494.L$0 = obj;
            return c38494;
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
            return ((C38494) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                InterfaceC41709m0 interfaceC41709m0 = (InterfaceC41709m0) this.L$0;
                List<Uri> registrationUris = this.$request.getRegistrationUris();
                MeasurementManagerImplCommon measurementManagerImplCommon = this.this$0;
                SourceRegistrationRequest sourceRegistrationRequest = this.$request;
                Iterator<T> it = registrationUris.iterator();
                while (it.hasNext()) {
                    C41696j.m91104d(interfaceC41709m0, null, null, new MeasurementManagerImplCommon$registerSource$4$1$1(measurementManagerImplCommon, (Uri) it.next(), sourceRegistrationRequest, null), 3, null);
                }
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @RequiresPermission("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")
    @DoNotInline
    @ExperimentalFeatures.RegisterSourceOptIn
    public static /* synthetic */ Object registerSource$suspendImpl(MeasurementManagerImplCommon measurementManagerImplCommon, SourceRegistrationRequest sourceRegistrationRequest, Continuation<? super Unit> continuation) {
        Object objM91130f = C41713n0.m91130f(new C38494(sourceRegistrationRequest, measurementManagerImplCommon, null), continuation);
        return objM91130f == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM91130f : Unit.INSTANCE;
    }

    @Override // androidx.privacysandbox.ads.adservices.measurement.MeasurementManager
    @RequiresPermission("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")
    @DoNotInline
    @Nullable
    public Object registerSource(@NotNull Uri uri, @Nullable InputEvent inputEvent, @NotNull Continuation<? super Unit> continuation) {
        return registerSource$suspendImpl(this, uri, inputEvent, continuation);
    }

    public MeasurementManagerImplCommon(@NotNull C46357a mMeasurementManager) {
        Intrinsics.checkNotNullParameter(mMeasurementManager, "mMeasurementManager");
        this.mMeasurementManager = mMeasurementManager;
    }

    @DoNotInline
    public static /* synthetic */ Object deleteRegistrations$suspendImpl(MeasurementManagerImplCommon measurementManagerImplCommon, DeletionRequest deletionRequest, Continuation<? super Unit> continuation) {
        C41716o c41716o = new C41716o(IntrinsicsKt.intercepted(continuation), 1);
        c41716o.m91142E();
        measurementManagerImplCommon.getMMeasurementManager().deleteRegistrations(deletionRequest.convertToAdServices$ads_adservices_release(), new ExecutorC1980h(), OutcomeReceiverKt.asOutcomeReceiver(c41716o));
        Object objM91171w = c41716o.m91171w();
        if (objM91171w == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return objM91171w == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM91171w : Unit.INSTANCE;
    }

    @RequiresPermission("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")
    @DoNotInline
    public static /* synthetic */ Object getMeasurementApiStatus$suspendImpl(MeasurementManagerImplCommon measurementManagerImplCommon, Continuation<? super Integer> continuation) {
        C41716o c41716o = new C41716o(IntrinsicsKt.intercepted(continuation), 1);
        c41716o.m91142E();
        measurementManagerImplCommon.getMMeasurementManager().getMeasurementApiStatus(new ExecutorC1980h(), OutcomeReceiverKt.asOutcomeReceiver(c41716o));
        Object objM91171w = c41716o.m91171w();
        if (objM91171w == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return objM91171w;
    }

    @RequiresPermission("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")
    @DoNotInline
    public static /* synthetic */ Object registerSource$suspendImpl(MeasurementManagerImplCommon measurementManagerImplCommon, Uri uri, InputEvent inputEvent, Continuation<? super Unit> continuation) {
        C41716o c41716o = new C41716o(IntrinsicsKt.intercepted(continuation), 1);
        c41716o.m91142E();
        measurementManagerImplCommon.getMMeasurementManager().registerSource(uri, inputEvent, new ExecutorC1980h(), OutcomeReceiverKt.asOutcomeReceiver(c41716o));
        Object objM91171w = c41716o.m91171w();
        if (objM91171w == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return objM91171w == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM91171w : Unit.INSTANCE;
    }

    @RequiresPermission("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")
    @DoNotInline
    public static /* synthetic */ Object registerTrigger$suspendImpl(MeasurementManagerImplCommon measurementManagerImplCommon, Uri uri, Continuation<? super Unit> continuation) {
        C41716o c41716o = new C41716o(IntrinsicsKt.intercepted(continuation), 1);
        c41716o.m91142E();
        measurementManagerImplCommon.getMMeasurementManager().m102230b(uri, new ExecutorC1980h(), OutcomeReceiverKt.asOutcomeReceiver(c41716o));
        Object objM91171w = c41716o.m91171w();
        if (objM91171w == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return objM91171w == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM91171w : Unit.INSTANCE;
    }

    @RequiresPermission("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")
    @DoNotInline
    public static /* synthetic */ Object registerWebSource$suspendImpl(MeasurementManagerImplCommon measurementManagerImplCommon, WebSourceRegistrationRequest webSourceRegistrationRequest, Continuation<? super Unit> continuation) {
        C41716o c41716o = new C41716o(IntrinsicsKt.intercepted(continuation), 1);
        c41716o.m91142E();
        measurementManagerImplCommon.getMMeasurementManager().registerWebSource(webSourceRegistrationRequest.convertToAdServices$ads_adservices_release(), new ExecutorC1980h(), OutcomeReceiverKt.asOutcomeReceiver(c41716o));
        Object objM91171w = c41716o.m91171w();
        if (objM91171w == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return objM91171w == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM91171w : Unit.INSTANCE;
    }

    @RequiresPermission("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")
    @DoNotInline
    public static /* synthetic */ Object registerWebTrigger$suspendImpl(MeasurementManagerImplCommon measurementManagerImplCommon, WebTriggerRegistrationRequest webTriggerRegistrationRequest, Continuation<? super Unit> continuation) {
        C41716o c41716o = new C41716o(IntrinsicsKt.intercepted(continuation), 1);
        c41716o.m91142E();
        measurementManagerImplCommon.getMMeasurementManager().registerWebTrigger(webTriggerRegistrationRequest.convertToAdServices$ads_adservices_release(), new ExecutorC1980h(), OutcomeReceiverKt.asOutcomeReceiver(c41716o));
        Object objM91171w = c41716o.m91171w();
        if (objM91171w == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return objM91171w == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM91171w : Unit.INSTANCE;
    }

    @NotNull
    public final C46357a getMMeasurementManager() {
        return this.mMeasurementManager;
    }

    @Override // androidx.privacysandbox.ads.adservices.measurement.MeasurementManager
    @Nullable
    @RequiresPermission("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")
    @DoNotInline
    @ExperimentalFeatures.RegisterSourceOptIn
    public Object registerSource(@NotNull SourceRegistrationRequest sourceRegistrationRequest, @NotNull Continuation<? super Unit> continuation) {
        return registerSource$suspendImpl(this, sourceRegistrationRequest, continuation);
    }

    @Override // androidx.privacysandbox.ads.adservices.measurement.MeasurementManager
    @DoNotInline
    @Nullable
    public Object deleteRegistrations(@NotNull DeletionRequest deletionRequest, @NotNull Continuation<? super Unit> continuation) {
        return deleteRegistrations$suspendImpl(this, deletionRequest, continuation);
    }

    @Override // androidx.privacysandbox.ads.adservices.measurement.MeasurementManager
    @RequiresPermission("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")
    @DoNotInline
    @Nullable
    public Object getMeasurementApiStatus(@NotNull Continuation<? super Integer> continuation) {
        return getMeasurementApiStatus$suspendImpl(this, continuation);
    }

    @Override // androidx.privacysandbox.ads.adservices.measurement.MeasurementManager
    @RequiresPermission("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")
    @DoNotInline
    @Nullable
    public Object registerTrigger(@NotNull Uri uri, @NotNull Continuation<? super Unit> continuation) {
        return registerTrigger$suspendImpl(this, uri, continuation);
    }

    @Override // androidx.privacysandbox.ads.adservices.measurement.MeasurementManager
    @RequiresPermission("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")
    @DoNotInline
    @Nullable
    public Object registerWebSource(@NotNull WebSourceRegistrationRequest webSourceRegistrationRequest, @NotNull Continuation<? super Unit> continuation) {
        return registerWebSource$suspendImpl(this, webSourceRegistrationRequest, continuation);
    }

    @Override // androidx.privacysandbox.ads.adservices.measurement.MeasurementManager
    @RequiresPermission("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")
    @DoNotInline
    @Nullable
    public Object registerWebTrigger(@NotNull WebTriggerRegistrationRequest webTriggerRegistrationRequest, @NotNull Continuation<? super Unit> continuation) {
        return registerWebTrigger$suspendImpl(this, webTriggerRegistrationRequest, continuation);
    }
}
