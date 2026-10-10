package com.kubi.kucoin.manager;

import com.kubi.data.exception.CoinDataException;
import kotlinx.coroutines.flow.InterfaceC41635f;
import p481ny.C42899b;
import p569qq.C43846g;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function3;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: Add missing generic type declarations: [Entity] */
/* JADX INFO: compiled from: KCSocketProvider.kt */
/* JADX INFO: loaded from: classes18.dex */
@Metadata(m90083d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003*\n\u0012\u0006\u0012\u0004\u0018\u0001H\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\n"}, m90084d2 = {"<anonymous>", "", "Entity", "", "Lkotlinx/coroutines/flow/FlowCollector;", "it", ""}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.kucoin.manager.KCSocketProvider$collectFromTopics$upstream$2", m90122f = "KCSocketProvider.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
@SourceDebugExtension({"SMAP\nKCSocketProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KCSocketProvider.kt\ncom/kubi/kucoin/manager/KCSocketProvider$collectFromTopics$upstream$2\n+ 2 CoinDataIssue.kt\ncom/kubi/data/exception/CoinDataIssueKt\n*L\n1#1,234:1\n45#2,4:235\n*S KotlinDebug\n*F\n+ 1 KCSocketProvider.kt\ncom/kubi/kucoin/manager/KCSocketProvider$collectFromTopics$upstream$2\n*L\n168#1:235,4\n*E\n"})
public final class KCSocketProvider$collectFromTopics$upstream$2<Entity> extends SuspendLambda implements Function3<InterfaceC41635f<? super Entity>, Throwable, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;

    public KCSocketProvider$collectFromTopics$upstream$2(Continuation<? super KCSocketProvider$collectFromTopics$upstream$2> continuation) {
        super(3, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function3
    public final Object invoke(InterfaceC41635f<? super Entity> interfaceC41635f, Throwable th2, Continuation<? super Unit> continuation) {
        KCSocketProvider$collectFromTopics$upstream$2 kCSocketProvider$collectFromTopics$upstream$2 = new KCSocketProvider$collectFromTopics$upstream$2(continuation);
        kCSocketProvider$collectFromTopics$upstream$2.L$0 = th2;
        return kCSocketProvider$collectFromTopics$upstream$2.invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Throwable th2 = (Throwable) this.L$0;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        if (!C42899b.m94075e(th2)) {
            C43846g.m96568c(new CoinDataException(th2, "KCSocketProvider", false, null, 8, null), null, 2, null);
        }
        return Unit.INSTANCE;
    }
}
