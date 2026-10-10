package com.kubi.sdk.push.api;

import com.kubi.sdk.base.entity.BaseEntity;
import com.kubi.sdk.push.entity.PushBindParam;
import i00.C38392a;
import java.util.TimeZone;
import kotlinx.coroutines.InterfaceC41709m0;
import p481ny.C42899b;
import p569qq.C43840a;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import ro.C44128b;

/* JADX INFO: compiled from: PushBindService.kt */
/* JADX INFO: loaded from: classes42.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.sdk.push.api.PushBindService$bind$2", m90122f = "PushBindService.kt", m90123i = {}, m90124l = {70}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
@SourceDebugExtension({"SMAP\nPushBindService.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PushBindService.kt\ncom/kubi/sdk/push/api/PushBindService$bind$2\n+ 2 PushIssue.kt\ncom/kubi/sdk/push/exception/PushIssueKt\n*L\n1#1,105:1\n45#2,4:106\n45#2,4:110\n*S KotlinDebug\n*F\n+ 1 PushBindService.kt\ncom/kubi/sdk/push/api/PushBindService$bind$2\n*L\n66#1:106,4\n80#1:110,4\n*E\n"})
public final class PushBindService$bind$2 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Boolean>, Object> {
    final /* synthetic */ PushBindParam $param;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PushBindService$bind$2(PushBindParam pushBindParam, Continuation<? super PushBindService$bind$2> continuation) {
        super(2, continuation);
        this.$param = pushBindParam;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PushBindService$bind$2(this.$param, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Boolean> continuation) {
        return ((PushBindService$bind$2) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        boolean z11 = false;
        try {
            if (i11 != 0) {
                if (i11 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                C44128b.m97266j("PushBindService", "start bind");
                try {
                    PushBindParam pushBindParam = this.$param;
                    String id2 = TimeZone.getDefault().getID();
                    Intrinsics.checkNotNullExpressionValue(id2, "getID(...)");
                    pushBindParam.setTimeZone(id2);
                } catch (Exception e11) {
                    if (!C42899b.m94075e(e11)) {
                        C38392a.m86573b(e11, "push", "TimeZone get failed");
                    }
                }
                PushApi pushApiM57932b = PushBindService.f47596a.m57932b();
                PushBindParam pushBindParam2 = this.$param;
                this.label = 1;
                obj = pushApiM57932b.m57938c(pushBindParam2, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            BaseEntity baseEntity = (BaseEntity) obj;
            if (baseEntity.getSuccess()) {
                C44128b.m97266j("PushBindService", "bind success=" + baseEntity.getSuccess() + " param:" + this.$param);
                z11 = true;
            } else {
                C43840a.m96550d("push bind failed! message=" + baseEntity.getMsg(), "push");
            }
        } catch (Exception e12) {
            C43840a.m96550d("bind failed! param:" + this.$param, "push");
            if (!C42899b.m94075e(e12)) {
                C38392a.m86573b(e12, "push", "bind failed!");
            }
        }
        return Boxing.boxBoolean(z11);
    }
}
