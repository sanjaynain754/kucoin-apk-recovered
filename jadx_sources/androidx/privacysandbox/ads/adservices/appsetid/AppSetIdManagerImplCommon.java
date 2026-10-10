package androidx.privacysandbox.ads.adservices.appsetid;

import android.annotation.SuppressLint;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresExtension;
import androidx.annotation.RestrictTo;
import androidx.core.os.OutcomeReceiverKt;
import androidx.credentials.ExecutorC1980h;
import kotlinx.coroutines.C41716o;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.DebugProbesKt;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: AppSetIdManagerImplCommon.kt */
/* JADX INFO: loaded from: classes34.dex */
@RequiresExtension.Container({@RequiresExtension(extension = 1000000, version = 4), @RequiresExtension(extension = 31, version = 9)})
@Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0017\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002J\u000e\u0010\t\u001a\u00020\u0006H\u0097@¢\u0006\u0002\u0010\nJ\u000e\u0010\u000b\u001a\u00020\bH\u0082@¢\u0006\u0002\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m90084d2 = {"Landroidx/privacysandbox/ads/adservices/appsetid/AppSetIdManagerImplCommon;", "Landroidx/privacysandbox/ads/adservices/appsetid/AppSetIdManager;", "mAppSetIdManager", "Landroid/adservices/appsetid/AppSetIdManager;", "(Landroid/adservices/appsetid/AppSetIdManager;)V", "convertResponse", "Landroidx/privacysandbox/ads/adservices/appsetid/AppSetId;", "response", "Landroid/adservices/appsetid/AppSetId;", "getAppSetId", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAppSetIdAsyncInternal", "ads-adservices_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
@SuppressLint({"ClassVerificationFailure", "NewApi"})
@RestrictTo({RestrictTo.Scope.LIBRARY})
@SourceDebugExtension({"SMAP\nAppSetIdManagerImplCommon.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AppSetIdManagerImplCommon.kt\nandroidx/privacysandbox/ads/adservices/appsetid/AppSetIdManagerImplCommon\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,53:1\n314#2,11:54\n*S KotlinDebug\n*F\n+ 1 AppSetIdManagerImplCommon.kt\nandroidx/privacysandbox/ads/adservices/appsetid/AppSetIdManagerImplCommon\n*L\n42#1:54,11\n*E\n"})
public class AppSetIdManagerImplCommon extends AppSetIdManager {

    @NotNull
    private final android.adservices.appsetid.AppSetIdManager mAppSetIdManager;

    /* JADX INFO: renamed from: androidx.privacysandbox.ads.adservices.appsetid.AppSetIdManagerImplCommon$getAppSetId$1 */
    /* JADX INFO: compiled from: AppSetIdManagerImplCommon.kt */
    @Metadata(m90085k = 3, m90086mv = {1, 8, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "androidx.privacysandbox.ads.adservices.appsetid.AppSetIdManagerImplCommon", m90122f = "AppSetIdManagerImplCommon.kt", m90123i = {}, m90124l = {38}, m90125m = "getAppSetId$suspendImpl", m90126n = {}, m90127s = {})
    public static final class C38011 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C38011(Continuation<? super C38011> continuation) {
            super(continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AppSetIdManagerImplCommon.getAppSetId$suspendImpl(AppSetIdManagerImplCommon.this, this);
        }
    }

    public AppSetIdManagerImplCommon(@NotNull android.adservices.appsetid.AppSetIdManager mAppSetIdManager) {
        Intrinsics.checkNotNullParameter(mAppSetIdManager, "mAppSetIdManager");
        this.mAppSetIdManager = mAppSetIdManager;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @DoNotInline
    public static /* synthetic */ Object getAppSetId$suspendImpl(AppSetIdManagerImplCommon appSetIdManagerImplCommon, Continuation<? super AppSetId> continuation) {
        C38011 c38011;
        if (continuation instanceof C38011) {
            c38011 = (C38011) continuation;
            int i11 = c38011.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c38011.label = i11 - Integer.MIN_VALUE;
            } else {
                c38011 = appSetIdManagerImplCommon.new C38011(continuation);
            }
        } else {
            c38011 = appSetIdManagerImplCommon.new C38011(continuation);
        }
        Object appSetIdAsyncInternal = c38011.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c38011.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(appSetIdAsyncInternal);
            c38011.L$0 = appSetIdManagerImplCommon;
            c38011.label = 1;
            appSetIdAsyncInternal = appSetIdManagerImplCommon.getAppSetIdAsyncInternal(c38011);
            if (appSetIdAsyncInternal == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            appSetIdManagerImplCommon = (AppSetIdManagerImplCommon) c38011.L$0;
            ResultKt.throwOnFailure(appSetIdAsyncInternal);
        }
        return appSetIdManagerImplCommon.convertResponse(C3806e.m3655a(appSetIdAsyncInternal));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object getAppSetIdAsyncInternal(Continuation<? super android.adservices.appsetid.AppSetId> continuation) {
        C41716o c41716o = new C41716o(IntrinsicsKt.intercepted(continuation), 1);
        c41716o.m91142E();
        this.mAppSetIdManager.getAppSetId(new ExecutorC1980h(), OutcomeReceiverKt.asOutcomeReceiver(c41716o));
        Object objM91171w = c41716o.m91171w();
        if (objM91171w == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return objM91171w;
    }

    private final AppSetId convertResponse(android.adservices.appsetid.AppSetId response) {
        if (response.getScope() == 1) {
            String id2 = response.getId();
            Intrinsics.checkNotNullExpressionValue(id2, "response.id");
            return new AppSetId(id2, 1);
        }
        String id3 = response.getId();
        Intrinsics.checkNotNullExpressionValue(id3, "response.id");
        return new AppSetId(id3, 2);
    }

    @Override // androidx.privacysandbox.ads.adservices.appsetid.AppSetIdManager
    @DoNotInline
    @Nullable
    public Object getAppSetId(@NotNull Continuation<? super AppSetId> continuation) {
        return getAppSetId$suspendImpl(this, continuation);
    }
}
