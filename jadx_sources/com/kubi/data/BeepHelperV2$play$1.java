package com.kubi.data;

import com.kubi.data.exception.CoinDataException;
import kotlinx.coroutines.InterfaceC41709m0;
import p481ny.C42899b;
import p569qq.C43846g;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: BeepHelperV2.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.data.BeepHelperV2$play$1", m90122f = "BeepHelperV2.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
@SourceDebugExtension({"SMAP\nBeepHelperV2.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BeepHelperV2.kt\ncom/kubi/data/BeepHelperV2$play$1\n+ 2 CoinDataIssue.kt\ncom/kubi/data/exception/CoinDataIssueKt\n*L\n1#1,90:1\n45#2,4:91\n*S KotlinDebug\n*F\n+ 1 BeepHelperV2.kt\ncom/kubi/data/BeepHelperV2$play$1\n*L\n62#1:91,4\n*E\n"})
public final class BeepHelperV2$play$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ int $raw;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BeepHelperV2$play$1(int i11, Continuation<? super BeepHelperV2$play$1> continuation) {
        super(2, continuation);
        this.$raw = i11;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BeepHelperV2$play$1(this.$raw, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((BeepHelperV2$play$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            try {
                BeepHelperV2.f21336a.m23477e(this.$raw);
            } catch (Exception e11) {
                if (!C42899b.m94075e(e11)) {
                    C43846g.m96568c(new CoinDataException(e11, "BeepHelper", false, null, 8, null), null, 2, null);
                }
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
