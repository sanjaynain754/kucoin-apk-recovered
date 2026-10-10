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

/* JADX INFO: compiled from: UtaMarginTradeCoreFragment.kt */
/* JADX INFO: loaded from: classes54.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.utaspotlib.fragment.UtaMarginTradeCoreFragment$startCollectShareBizData$1", m90122f = "UtaMarginTradeCoreFragment.kt", m90123i = {}, m90124l = {187}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class UtaMarginTradeCoreFragment$startCollectShareBizData$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ UtaMarginTradeCoreFragment this$0;

    /* JADX INFO: renamed from: com.kubi.utaspotlib.fragment.UtaMarginTradeCoreFragment$startCollectShareBizData$1$a */
    /* JADX INFO: compiled from: UtaMarginTradeCoreFragment.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nUtaMarginTradeCoreFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UtaMarginTradeCoreFragment.kt\ncom/kubi/utaspotlib/fragment/UtaMarginTradeCoreFragment$startCollectShareBizData$1$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,221:1\n1869#2,2:222\n*S KotlinDebug\n*F\n+ 1 UtaMarginTradeCoreFragment.kt\ncom/kubi/utaspotlib/fragment/UtaMarginTradeCoreFragment$startCollectShareBizData$1$1\n*L\n188#1:222,2\n*E\n"})
    public static final class C26927a<T> implements InterfaceC41635f {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ UtaMarginTradeCoreFragment f54182b;

        public C26927a(UtaMarginTradeCoreFragment utaMarginTradeCoreFragment) {
            this.f54182b = utaMarginTradeCoreFragment;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC41635f
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object emit(List<C45792a> list, Continuation<? super Unit> continuation) {
            UtaMarginTradeCoreFragment utaMarginTradeCoreFragment = this.f54182b;
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                utaMarginTradeCoreFragment.m66187P3((C45792a) it.next());
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UtaMarginTradeCoreFragment$startCollectShareBizData$1(UtaMarginTradeCoreFragment utaMarginTradeCoreFragment, Continuation<? super UtaMarginTradeCoreFragment$startCollectShareBizData$1> continuation) {
        super(2, continuation);
        this.this$0 = utaMarginTradeCoreFragment;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new UtaMarginTradeCoreFragment$startCollectShareBizData$1(this.this$0, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((UtaMarginTradeCoreFragment$startCollectShareBizData$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
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
            C26927a c26927a = new C26927a(this.this$0);
            this.label = 1;
            if (interfaceC41634eM21737p.collect(c26927a, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
