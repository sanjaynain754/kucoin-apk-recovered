package com.kubi.utaspotlib.fragment;

import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.flow.InterfaceC41634e;
import kotlinx.coroutines.flow.InterfaceC41635f;
import p722wd.C45792a;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: UtaSpotTradeCoreFragment.kt */
/* JADX INFO: loaded from: classes54.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.utaspotlib.fragment.UtaSpotTradeCoreFragment$startCollectShareBizData$1", m90122f = "UtaSpotTradeCoreFragment.kt", m90123i = {}, m90124l = {182}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class UtaSpotTradeCoreFragment$startCollectShareBizData$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ UtaSpotTradeCoreFragment this$0;

    /* JADX INFO: renamed from: com.kubi.utaspotlib.fragment.UtaSpotTradeCoreFragment$startCollectShareBizData$1$a */
    /* JADX INFO: compiled from: UtaSpotTradeCoreFragment.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nUtaSpotTradeCoreFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UtaSpotTradeCoreFragment.kt\ncom/kubi/utaspotlib/fragment/UtaSpotTradeCoreFragment$startCollectShareBizData$1$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,302:1\n1869#2,2:303\n*S KotlinDebug\n*F\n+ 1 UtaSpotTradeCoreFragment.kt\ncom/kubi/utaspotlib/fragment/UtaSpotTradeCoreFragment$startCollectShareBizData$1$1\n*L\n183#1:303,2\n*E\n"})
    public static final class C26931a<T> implements InterfaceC41635f {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ UtaSpotTradeCoreFragment f54190b;

        public C26931a(UtaSpotTradeCoreFragment utaSpotTradeCoreFragment) {
            this.f54190b = utaSpotTradeCoreFragment;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC41635f
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object emit(List<C45792a> list, Continuation<? super Unit> continuation) {
            UtaSpotTradeCoreFragment utaSpotTradeCoreFragment = this.f54190b;
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                utaSpotTradeCoreFragment.m66199Q3((C45792a) it.next());
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UtaSpotTradeCoreFragment$startCollectShareBizData$1(UtaSpotTradeCoreFragment utaSpotTradeCoreFragment, Continuation<? super UtaSpotTradeCoreFragment$startCollectShareBizData$1> continuation) {
        super(2, continuation);
        this.this$0 = utaSpotTradeCoreFragment;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new UtaSpotTradeCoreFragment$startCollectShareBizData$1(this.this$0, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((UtaSpotTradeCoreFragment$startCollectShareBizData$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            InterfaceC41634e<List<C45792a>> interfaceC41634eM21737p = this.this$0.m21241t3().m21737p();
            C26931a c26931a = new C26931a(this.this$0);
            this.label = 1;
            if (interfaceC41634eM21737p.collect(c26931a, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
