package com.kubi.quotefacade.alpha.container;

import com.kubi.quotefacade.entity.ChainFilterData;
import com.kubi.utils.C27099x;
import com.kubi.utils.C27100x0;
import kotlinx.coroutines.AbstractC41697j0;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.flow.C41636g;
import kotlinx.coroutines.flow.InterfaceC41634e;
import o00.C42911a;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: AlphaContainerDialog.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90083d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m90084d2 = {"<anonymous>", ""}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.quotefacade.alpha.container.AlphaContainerDialog$alertFilterPop$1$1$1", m90122f = "AlphaContainerDialog.kt", m90123i = {0, 0, 0, 1}, m90124l = {178, 170}, m90125m = "invokeSuspend", m90126n = {"this_$iv", "json$iv", "$i$f$fromJsonOrNull", "filterData"}, m90127s = {"L$0", "L$1", "I$0", "L$0"})
@SourceDebugExtension({"SMAP\nAlphaContainerDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AlphaContainerDialog.kt\ncom/kubi/quotefacade/alpha/container/AlphaContainerDialog$alertFilterPop$1$1$1\n+ 2 GsonUtils.kt\ncom/kubi/utils/GsonUtils\n*L\n1#1,175:1\n196#2,3:176\n*S KotlinDebug\n*F\n+ 1 AlphaContainerDialog.kt\ncom/kubi/quotefacade/alpha/container/AlphaContainerDialog$alertFilterPop$1$1$1\n*L\n168#1:176,3\n*E\n"})
public final class AlphaContainerDialog$alertFilterPop$1$1$1 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
    final /* synthetic */ String $jsonChainFilter;
    final /* synthetic */ Function1<ChainFilterData, Unit> $onFiltered;
    int I$0;
    Object L$0;
    Object L$1;
    int label;

    /* JADX INFO: renamed from: com.kubi.quotefacade.alpha.container.AlphaContainerDialog$alertFilterPop$1$1$1$1 */
    /* JADX INFO: compiled from: AlphaContainerDialog.kt */
    @Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.quotefacade.alpha.container.AlphaContainerDialog$alertFilterPop$1$1$1$1", m90122f = "AlphaContainerDialog.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C216061 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
        final /* synthetic */ ChainFilterData $filterData;
        final /* synthetic */ Function1<ChainFilterData, Unit> $onFiltered;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C216061(Function1<? super ChainFilterData, Unit> function1, ChainFilterData chainFilterData, Continuation<? super C216061> continuation) {
            super(2, continuation);
            this.$onFiltered = function1;
            this.$filterData = chainFilterData;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C216061(this.$onFiltered, this.$filterData, continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
            return ((C216061) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX INFO: renamed from: f */
        public static final Unit m50384f(Function1 function1, ChainFilterData chainFilterData) {
            function1.invoke(chainFilterData);
            return Unit.INSTANCE;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                final Function1<ChainFilterData, Unit> function1 = this.$onFiltered;
                final ChainFilterData chainFilterData = this.$filterData;
                C27100x0.m66923d(new Function0() { // from class: com.kubi.quotefacade.alpha.container.l
                    @Override // p852kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return AlphaContainerDialog$alertFilterPop$1$1$1.C216061.m50384f(function1, chainFilterData);
                    }
                });
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AlphaContainerDialog$alertFilterPop$1$1$1(String str, Function1<? super ChainFilterData, Unit> function1, Continuation<? super AlphaContainerDialog$alertFilterPop$1$1$1> continuation) {
        super(1, continuation);
        this.$jsonChainFilter = str;
        this.$onFiltered = function1;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new AlphaContainerDialog$alertFilterPop$1$1$1(this.$jsonChainFilter, this.$onFiltered, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super Unit> continuation) {
        return ((AlphaContainerDialog$alertFilterPop$1$1$1) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0078, code lost:
    
        if (kotlinx.coroutines.C41686h.m91049g(r1, r3, r7) == r0) goto L17;
     */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(obj);
        C27099x c27099x = C27099x.f54458a;
        String str = this.$jsonChainFilter;
        InterfaceC41634e interfaceC41634eM90890N = C41636g.m90890N(C41636g.m90887K(new C21607xa53d31df(str, null)), C42911a.m94120b());
        this.L$0 = SpillingKt.nullOutSpilledVariable(c27099x);
        this.L$1 = SpillingKt.nullOutSpilledVariable(str);
        this.I$0 = 0;
        this.label = 1;
        obj = C41636g.m90914f0(interfaceC41634eM90890N, this);
        if (obj != coroutine_suspended) {
        }
        return coroutine_suspended;
        ChainFilterData chainFilterData = (ChainFilterData) obj;
        if (chainFilterData != null) {
            AbstractC41697j0 abstractC41697j0M94121c = C42911a.m94121c();
            C216061 c216061 = new C216061(this.$onFiltered, chainFilterData, null);
            this.L$0 = SpillingKt.nullOutSpilledVariable(chainFilterData);
            this.L$1 = null;
            this.label = 2;
        }
        return Unit.INSTANCE;
    }
}
