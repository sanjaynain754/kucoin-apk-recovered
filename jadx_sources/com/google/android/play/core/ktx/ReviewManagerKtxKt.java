package com.google.android.play.core.ktx;

import android.app.Activity;
import androidx.annotation.NonNull;
import androidx.exifinterface.media.ExifInterface;
import com.google.android.gms.common.annotation.NoNullnessRewrite;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.android.play.core.review.ReviewInfo;
import com.google.android.play.core.review.ReviewManager;
import kotlinx.coroutines.C41716o;
import kotlinx.coroutines.channels.ChannelResult;
import kotlinx.coroutines.channels.InterfaceC41577p;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.DebugProbesKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: com.google.android.play:review-ktx@@2.0.2 */
/* JADX INFO: loaded from: classes45.dex */
@Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a$\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0086@¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0014\u0010\b\u001a\u00020\u0003*\u00020\u0000H\u0086@¢\u0006\u0004\b\b\u0010\t\u001a4\u0010\u000f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\n2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b2\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\rH\u0080@¢\u0006\u0004\b\u000f\u0010\u0010\u001a)\u0010\u0015\u001a\u00020\u0014\"\u0004\b\u0000\u0010\u0011*\b\u0012\u0004\u0012\u00028\u00000\u00122\b\b\u0001\u0010\u0013\u001a\u00028\u0000H\u0000¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, m90084d2 = {"Lcom/google/android/play/core/review/ReviewManager;", "Landroid/app/Activity;", "activity", "Lcom/google/android/play/core/review/ReviewInfo;", "reviewInfo", "", "launchReview", "(Lcom/google/android/play/core/review/ReviewManager;Landroid/app/Activity;Lcom/google/android/play/core/review/ReviewInfo;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "requestReview", "(Lcom/google/android/play/core/review/ReviewManager;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/google/android/gms/tasks/Task;", "task", "Lkotlin/Function0;", "onCanceled", "runTask", "(Lcom/google/android/gms/tasks/Task;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", ExifInterface.LONGITUDE_EAST, "Lkotlinx/coroutines/channels/p;", "element", "", "tryOffer", "(Lkotlinx/coroutines/channels/p;Ljava/lang/Object;)Z", "java.com.google.android.apps.play.store.sdk.review.ktx_playcore_review_ktx"}, m90085k = 2, m90086mv = {2, 0, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nReviewManagerKtx.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReviewManagerKtx.kt\ncom/google/android/play/core/ktx/ReviewManagerKtxKt\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,63:1\n351#2,11:64\n*S KotlinDebug\n*F\n+ 1 ReviewManagerKtx.kt\ncom/google/android/play/core/ktx/ReviewManagerKtxKt\n*L\n43#1:64,11\n*E\n"})
public final class ReviewManagerKtxKt {

    /* JADX INFO: renamed from: com.google.android.play.core.ktx.ReviewManagerKtxKt$requestReview$1 */
    /* JADX INFO: compiled from: com.google.android.play:review-ktx@@2.0.2 */
    @Metadata(m90085k = 3, m90086mv = {2, 0, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.google.android.play.core.ktx.ReviewManagerKtxKt", m90122f = "ReviewManagerKtx.kt", m90123i = {}, m90124l = {23}, m90125m = "requestReview", m90126n = {}, m90127s = {})
    public static final class C78011 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ReviewManagerKtxKt.requestReview(null, this);
        }

        public C78011(Continuation<? super C78011> continuation) {
            super(continuation);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public static final Object requestReview(@NotNull ReviewManager reviewManager, @NotNull Continuation<? super ReviewInfo> continuation) {
        C78011 c78011;
        if (continuation instanceof C78011) {
            c78011 = (C78011) continuation;
            int i11 = c78011.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c78011.label = i11 - Integer.MIN_VALUE;
            } else {
                c78011 = new C78011(continuation);
            }
        } else {
            c78011 = new C78011(continuation);
        }
        Object objRunTask$default = c78011.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c78011.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objRunTask$default);
            Task<ReviewInfo> taskRequestReviewFlow = reviewManager.requestReviewFlow();
            Intrinsics.checkNotNullExpressionValue(taskRequestReviewFlow, "requestReviewFlow(...)");
            c78011.label = 1;
            objRunTask$default = runTask$default(taskRequestReviewFlow, null, c78011, 2, null);
            if (objRunTask$default == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objRunTask$default);
        }
        Intrinsics.checkNotNull(objRunTask$default);
        return objRunTask$default;
    }

    @Nullable
    public static final <T> Object runTask(@NotNull Task<T> task, @NotNull final Function0<Unit> function0, @NotNull Continuation<? super T> continuation) {
        final C41716o c41716o = new C41716o(IntrinsicsKt.intercepted(continuation), 1);
        c41716o.m91142E();
        c41716o.mo91119t(new Function1<Throwable, Unit>() { // from class: com.google.android.play.core.ktx.ReviewManagerKtxKt$runTask$3$1
            @Override // p852kotlin.jvm.functions.Function1
            public final /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
                invoke2(th2);
                return Unit.INSTANCE;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Throwable th2) {
                function0.invoke();
            }
        });
        if (!task.isComplete()) {
            final Function1<T, Unit> function1 = new Function1<T, Unit>() { // from class: com.google.android.play.core.ktx.ReviewManagerKtxKt$runTask$3$2
                /* JADX WARN: Multi-variable type inference failed */
                @Override // p852kotlin.jvm.functions.Function1
                public final /* bridge */ /* synthetic */ Unit invoke(Object obj) {
                    invoke2(obj);
                    return Unit.INSTANCE;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(T t11) {
                    c41716o.resumeWith(Result.m103844constructorimpl(t11));
                }
            };
            task.addOnSuccessListener(new OnSuccessListener(function1) { // from class: com.google.android.play.core.ktx.ReviewManagerKtxKt$sam$com_google_android_gms_tasks_OnSuccessListener$0
                private final /* synthetic */ Function1 function;

                {
                    Intrinsics.checkNotNullParameter(function1, "function");
                    this.function = function1;
                }

                @Override // com.google.android.gms.tasks.OnSuccessListener
                public final /* synthetic */ void onSuccess(@NoNullnessRewrite(reason = "Can be null for Task<Void> but this is uncommon.") Object obj) {
                    this.function.invoke(obj);
                }
            });
            task.addOnFailureListener(new OnFailureListener() { // from class: com.google.android.play.core.ktx.ReviewManagerKtxKt$runTask$3$3
                @Override // com.google.android.gms.tasks.OnFailureListener
                public final void onFailure(Exception exception) {
                    Intrinsics.checkNotNullParameter(exception, "exception");
                    c41716o.resumeWith(Result.m103844constructorimpl(ResultKt.createFailure(exception)));
                }
            });
        } else if (task.isSuccessful()) {
            c41716o.resumeWith(Result.m103844constructorimpl(task.getResult()));
        } else {
            Exception exception = task.getException();
            Intrinsics.checkNotNull(exception);
            c41716o.resumeWith(Result.m103844constructorimpl(ResultKt.createFailure(exception)));
        }
        Object objM91171w = c41716o.m91171w();
        if (objM91171w == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return objM91171w;
    }

    public static /* synthetic */ Object runTask$default(Task task, Function0 function0, Continuation continuation, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            function0 = new Function0<Unit>() { // from class: com.google.android.play.core.ktx.ReviewManagerKtxKt.runTask.2
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // p852kotlin.jvm.functions.Function0
                public final /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            };
        }
        return runTask(task, function0, continuation);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <E> boolean tryOffer(@NotNull InterfaceC41577p<? super E> interfaceC41577p, @NonNull E e11) {
        Intrinsics.checkNotNullParameter(interfaceC41577p, "<this>");
        return ChannelResult.m90677j(interfaceC41577p.mo90594e(e11));
    }

    @Nullable
    public static final Object launchReview(@NotNull ReviewManager reviewManager, @NotNull Activity activity, @NotNull ReviewInfo reviewInfo, @NotNull Continuation<? super Unit> continuation) {
        Task<Void> taskLaunchReviewFlow = reviewManager.launchReviewFlow(activity, reviewInfo);
        Intrinsics.checkNotNullExpressionValue(taskLaunchReviewFlow, "launchReviewFlow(...)");
        Object objRunTask$default = runTask$default(taskLaunchReviewFlow, null, continuation, 2, null);
        if (objRunTask$default == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            return objRunTask$default;
        }
        return Unit.INSTANCE;
    }
}
