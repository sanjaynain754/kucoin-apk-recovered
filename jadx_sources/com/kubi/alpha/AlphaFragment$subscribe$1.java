package com.kubi.alpha;

import com.kubi.data.entity.AlphaCurrencyInfoEntity;
import com.kubi.spot.entity.AlphaCoinWsEntity;
import gf.C37890n;
import java.util.ArrayList;
import java.util.Iterator;
import kotlinx.coroutines.C41713n0;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.flow.C41636g;
import kotlinx.coroutines.flow.InterfaceC41634e;
import kotlinx.coroutines.flow.InterfaceC41635f;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.functions.Function3;
import p852kotlin.jvm.internal.SourceDebugExtension;
import ro.C44128b;

/* JADX INFO: compiled from: AlphaFragment.kt */
/* JADX INFO: loaded from: classes63.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.alpha.AlphaFragment$subscribe$1", m90122f = "AlphaFragment.kt", m90123i = {0}, m90124l = {124}, m90125m = "invokeSuspend", m90126n = {"$this$launch"}, m90127s = {"L$0"})
public final class AlphaFragment$subscribe$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ AlphaFragment this$0;

    /* JADX INFO: renamed from: com.kubi.alpha.AlphaFragment$subscribe$1$1 */
    /* JADX INFO: compiled from: AlphaFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0004\u001a\u00020\u0005H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/kubi/spot/entity/AlphaCoinWsEntity;", "it", ""}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.alpha.AlphaFragment$subscribe$1$1", m90122f = "AlphaFragment.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C94081 extends SuspendLambda implements Function3<InterfaceC41635f<? super AlphaCoinWsEntity>, Throwable, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        public C94081(Continuation<? super C94081> continuation) {
            super(3, continuation);
        }

        @Override // p852kotlin.jvm.functions.Function3
        public final Object invoke(InterfaceC41635f<? super AlphaCoinWsEntity> interfaceC41635f, Throwable th2, Continuation<? super Unit> continuation) {
            C94081 c94081 = new C94081(continuation);
            c94081.L$0 = th2;
            return c94081.invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Throwable th2 = (Throwable) this.L$0;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            C44128b.m97258b("catch--->" + th2);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.kubi.alpha.AlphaFragment$subscribe$1$a */
    /* JADX INFO: compiled from: AlphaFragment.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nAlphaFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AlphaFragment.kt\ncom/kubi/alpha/AlphaFragment$subscribe$1$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,155:1\n1869#2,2:156\n*S KotlinDebug\n*F\n+ 1 AlphaFragment.kt\ncom/kubi/alpha/AlphaFragment$subscribe$1$2\n*L\n127#1:156,2\n*E\n"})
    public static final class C9409a<T> implements InterfaceC41635f {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ InterfaceC41709m0 f15347b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ AlphaFragment f15348c;

        public C9409a(InterfaceC41709m0 interfaceC41709m0, AlphaFragment alphaFragment) {
            this.f15347b = interfaceC41709m0;
            this.f15348c = alphaFragment;
        }

        /* JADX INFO: renamed from: f */
        public static final Unit m14979f(AlphaFragment alphaFragment, ArrayList arrayList) {
            if (arrayList != null) {
                Iterator<T> it = arrayList.iterator();
                while (it.hasNext()) {
                    AlphaCurrencyInfoEntity alphaCurrencyInfoEntity = (AlphaCurrencyInfoEntity) it.next();
                    C44128b.m97265i("AlphaCurrencyInfo--->" + alphaCurrencyInfoEntity.isQuoteCurrency() + ' ' + alphaCurrencyInfoEntity.getCurrencySeq());
                    AlphaChannelRegister alphaChannelRegister = alphaFragment.f15340Y;
                    Long currencySeq = alphaCurrencyInfoEntity.getCurrencySeq();
                    alphaChannelRegister.m14963e(currencySeq != null ? currencySeq.toString() : null);
                }
            }
            return Unit.INSTANCE;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC41635f
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Object emit(AlphaCoinWsEntity alphaCoinWsEntity, Continuation<? super Unit> continuation) {
            if (!C41713n0.m91132h(this.f15347b)) {
                return Unit.INSTANCE;
            }
            C37890n c37890n = C37890n.f85269a;
            final AlphaFragment alphaFragment = this.f15348c;
            c37890n.mo85593e(new Function1() { // from class: com.kubi.alpha.c
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return AlphaFragment$subscribe$1.C9409a.m14979f(alphaFragment, (ArrayList) obj);
                }
            });
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AlphaFragment$subscribe$1(AlphaFragment alphaFragment, Continuation<? super AlphaFragment$subscribe$1> continuation) {
        super(2, continuation);
        this.this$0 = alphaFragment;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        AlphaFragment$subscribe$1 alphaFragment$subscribe$1 = new AlphaFragment$subscribe$1(this.this$0, continuation);
        alphaFragment$subscribe$1.L$0 = obj;
        return alphaFragment$subscribe$1;
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((AlphaFragment$subscribe$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        InterfaceC41709m0 interfaceC41709m0 = (InterfaceC41709m0) this.L$0;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        if (i11 == 0) {
            ResultKt.throwOnFailure(obj);
            InterfaceC41634e interfaceC41634eM90917h = C41636g.m90917h(this.this$0.m14974u3().m82907c("/alphaConfig/currencyChanges"), new C94081(null));
            C9409a c9409a = new C9409a(interfaceC41709m0, this.this$0);
            this.L$0 = SpillingKt.nullOutSpilledVariable(interfaceC41709m0);
            this.label = 1;
            if (interfaceC41634eM90917h.collect(c9409a, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
