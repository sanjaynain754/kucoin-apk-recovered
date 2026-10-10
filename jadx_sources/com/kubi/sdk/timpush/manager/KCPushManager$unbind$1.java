package com.kubi.sdk.timpush.manager;

import com.kubi.sdk.timpush.data.model.PushBinding;
import com.kubi.sdk.timpush.data.repository.TimPushRepository;
import com.kubi.sdk.timpush.exception.TimPushMessage;
import kotlinx.coroutines.InterfaceC41709m0;
import p481ny.C42899b;
import p569qq.C43846g;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.SourceDebugExtension;
import r00.C43895a;
import u00.C45088a;

/* JADX INFO: compiled from: KCPushManager.kt */
/* JADX INFO: loaded from: classes43.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.sdk.timpush.manager.KCPushManager$unbind$1", m90122f = "KCPushManager.kt", m90123i = {0}, m90124l = {150}, m90125m = "invokeSuspend", m90126n = {"pushBinding"}, m90127s = {"L$0"})
@SourceDebugExtension({"SMAP\nKCPushManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KCPushManager.kt\ncom/kubi/sdk/timpush/manager/KCPushManager$unbind$1\n+ 2 TimPushIssue.kt\ncom/kubi/sdk/timpush/exception/TimPushIssueKt\n*L\n1#1,156:1\n45#2,2:157\n39#2,4:159\n*S KotlinDebug\n*F\n+ 1 KCPushManager.kt\ncom/kubi/sdk/timpush/manager/KCPushManager$unbind$1\n*L\n144#1:157,2\n152#1:159,4\n*E\n"})
public final class KCPushManager$unbind$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    Object L$0;
    int label;

    public KCPushManager$unbind$1(Continuation<? super KCPushManager$unbind$1> continuation) {
        super(2, continuation);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new KCPushManager$unbind$1(continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((KCPushManager$unbind$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        try {
            if (i11 != 0) {
                if (i11 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                String str = KCPushManager.f48095b;
                if (str != null && str.length() != 0) {
                    PushBinding pushBinding = new PushBinding(KCPushManager.f48095b);
                    TimPushRepository timPushRepositoryM96669a = C43895a.f96983a.m96669a();
                    this.L$0 = SpillingKt.nullOutSpilledVariable(pushBinding);
                    this.label = 1;
                    if (timPushRepositoryM96669a.m58251d(pushBinding, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                C43846g.m96568c(new TimPushMessage("unbind registrationID is null or empty", "TimPushHelper", false, 4, null), null, 2, null);
                return Unit.INSTANCE;
            }
        } catch (Exception e11) {
            if (!C42899b.m94075e(e11)) {
                C45088a.m99691b(e11, "TimPushHelper", "unbind error");
            }
        }
        return Unit.INSTANCE;
    }
}
