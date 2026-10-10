package androidx.privacysandbox.ads.adservices.topics;

import android.annotation.SuppressLint;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresExtension;
import androidx.annotation.RequiresPermission;
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

/* JADX INFO: compiled from: TopicsManagerImplCommon.kt */
/* JADX INFO: loaded from: classes34.dex */
@RequiresExtension.Container({@RequiresExtension(extension = 1000000, version = 4), @RequiresExtension(extension = 31, version = 9)})
@Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0017\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0015\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0010¢\u0006\u0002\b\tJ\u0015\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0010¢\u0006\u0002\b\u000eJ\u0016\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\bH\u0097@¢\u0006\u0002\u0010\u0010J\u0016\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u0006H\u0083@¢\u0006\u0002\u0010\u0013R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, m90084d2 = {"Landroidx/privacysandbox/ads/adservices/topics/TopicsManagerImplCommon;", "Landroidx/privacysandbox/ads/adservices/topics/TopicsManager;", "mTopicsManager", "Landroid/adservices/topics/TopicsManager;", "(Landroid/adservices/topics/TopicsManager;)V", "convertRequest", "Landroid/adservices/topics/GetTopicsRequest;", "request", "Landroidx/privacysandbox/ads/adservices/topics/GetTopicsRequest;", "convertRequest$ads_adservices_release", "convertResponse", "Landroidx/privacysandbox/ads/adservices/topics/GetTopicsResponse;", "response", "Landroid/adservices/topics/GetTopicsResponse;", "convertResponse$ads_adservices_release", "getTopics", "(Landroidx/privacysandbox/ads/adservices/topics/GetTopicsRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getTopicsAsyncInternal", "getTopicsRequest", "(Landroid/adservices/topics/GetTopicsRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ads-adservices_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
@SuppressLint({"NewApi"})
@RestrictTo({RestrictTo.Scope.LIBRARY})
@SourceDebugExtension({"SMAP\nTopicsManagerImplCommon.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TopicsManagerImplCommon.kt\nandroidx/privacysandbox/ads/adservices/topics/TopicsManagerImplCommon\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,62:1\n314#2,11:63\n*S KotlinDebug\n*F\n+ 1 TopicsManagerImplCommon.kt\nandroidx/privacysandbox/ads/adservices/topics/TopicsManagerImplCommon\n*L\n46#1:63,11\n*E\n"})
public class TopicsManagerImplCommon extends TopicsManager {

    @NotNull
    private final android.adservices.topics.TopicsManager mTopicsManager;

    /* JADX INFO: renamed from: androidx.privacysandbox.ads.adservices.topics.TopicsManagerImplCommon$getTopics$1 */
    /* JADX INFO: compiled from: TopicsManagerImplCommon.kt */
    @Metadata(m90085k = 3, m90086mv = {1, 8, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "androidx.privacysandbox.ads.adservices.topics.TopicsManagerImplCommon", m90122f = "TopicsManagerImplCommon.kt", m90123i = {}, m90124l = {40}, m90125m = "getTopics$suspendImpl", m90126n = {}, m90127s = {})
    public static final class C38791 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C38791(Continuation<? super C38791> continuation) {
            super(continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return TopicsManagerImplCommon.getTopics$suspendImpl(TopicsManagerImplCommon.this, null, this);
        }
    }

    public TopicsManagerImplCommon(@NotNull android.adservices.topics.TopicsManager mTopicsManager) {
        Intrinsics.checkNotNullParameter(mTopicsManager, "mTopicsManager");
        this.mTopicsManager = mTopicsManager;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @RequiresPermission("android.permission.ACCESS_ADSERVICES_TOPICS")
    @DoNotInline
    public static /* synthetic */ Object getTopics$suspendImpl(TopicsManagerImplCommon topicsManagerImplCommon, GetTopicsRequest getTopicsRequest, Continuation<? super GetTopicsResponse> continuation) {
        C38791 c38791;
        if (continuation instanceof C38791) {
            c38791 = (C38791) continuation;
            int i11 = c38791.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c38791.label = i11 - Integer.MIN_VALUE;
            } else {
                c38791 = topicsManagerImplCommon.new C38791(continuation);
            }
        } else {
            c38791 = topicsManagerImplCommon.new C38791(continuation);
        }
        Object topicsAsyncInternal = c38791.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c38791.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(topicsAsyncInternal);
            android.adservices.topics.GetTopicsRequest getTopicsRequestConvertRequest$ads_adservices_release = topicsManagerImplCommon.convertRequest$ads_adservices_release(getTopicsRequest);
            c38791.L$0 = topicsManagerImplCommon;
            c38791.label = 1;
            topicsAsyncInternal = topicsManagerImplCommon.getTopicsAsyncInternal(getTopicsRequestConvertRequest$ads_adservices_release, c38791);
            if (topicsAsyncInternal == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            topicsManagerImplCommon = (TopicsManagerImplCommon) c38791.L$0;
            ResultKt.throwOnFailure(topicsAsyncInternal);
        }
        return topicsManagerImplCommon.convertResponse$ads_adservices_release(C3897r.m3729a(topicsAsyncInternal));
    }

    /* JADX INFO: Access modifiers changed from: private */
    @RequiresPermission("android.permission.ACCESS_ADSERVICES_TOPICS")
    public final Object getTopicsAsyncInternal(android.adservices.topics.GetTopicsRequest getTopicsRequest, Continuation<? super android.adservices.topics.GetTopicsResponse> continuation) {
        C41716o c41716o = new C41716o(IntrinsicsKt.intercepted(continuation), 1);
        c41716o.m91142E();
        this.mTopicsManager.getTopics(getTopicsRequest, new ExecutorC1980h(), OutcomeReceiverKt.asOutcomeReceiver(c41716o));
        Object objM91171w = c41716o.m91171w();
        if (objM91171w == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return objM91171w;
    }

    @NotNull
    public android.adservices.topics.GetTopicsRequest convertRequest$ads_adservices_release(@NotNull GetTopicsRequest request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return GetTopicsRequestHelper.INSTANCE.convertRequestWithoutRecordObservation$ads_adservices_release(request);
    }

    @NotNull
    public GetTopicsResponse convertResponse$ads_adservices_release(@NotNull android.adservices.topics.GetTopicsResponse response) {
        Intrinsics.checkNotNullParameter(response, "response");
        return GetTopicsResponseHelper.INSTANCE.convertResponse$ads_adservices_release(response);
    }

    @Override // androidx.privacysandbox.ads.adservices.topics.TopicsManager
    @RequiresPermission("android.permission.ACCESS_ADSERVICES_TOPICS")
    @DoNotInline
    @Nullable
    public Object getTopics(@NotNull GetTopicsRequest getTopicsRequest, @NotNull Continuation<? super GetTopicsResponse> continuation) {
        return getTopics$suspendImpl(this, getTopicsRequest, continuation);
    }
}
