package com.kubi.futures.trade;

import com.google.gson.reflect.TypeToken;
import com.kubi.broker.RepositoryServiceLocator;
import com.kubi.kumex.data.platform.model.FuturesAirdropProfitEntity;
import com.kubi.network.api.subscribe.model.SubscribeMessage;
import com.kubi.utils.C27099x;
import io.reactivex.functions.Consumer;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.flow.C41636g;
import kotlinx.coroutines.flow.InterfaceC41634e;
import kotlinx.coroutines.flow.InterfaceC41635f;
import kr.InterfaceC41975c;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.functions.Function3;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import ro.C44128b;

/* JADX INFO: compiled from: FuturesViewModel.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.futures.trade.FuturesViewModel$obsAirdropRealisedData$1", m90122f = "FuturesViewModel.kt", m90123i = {}, m90124l = {185}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class FuturesViewModel$obsAirdropRealisedData$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ Consumer<FuturesAirdropProfitEntity> $consumer;
    int label;

    /* JADX INFO: renamed from: com.kubi.futures.trade.FuturesViewModel$obsAirdropRealisedData$1$2 */
    /* JADX INFO: compiled from: FuturesViewModel.kt */
    @Metadata(m90083d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\u0010\u0000\u001a\u00020\u0001*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00022\u0006\u0010\u0004\u001a\u00020\u0005H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/kubi/kumex/data/platform/model/FuturesAirdropProfitEntity;", "it", ""}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.futures.trade.FuturesViewModel$obsAirdropRealisedData$1$2", m90122f = "FuturesViewModel.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C136132 extends SuspendLambda implements Function3<InterfaceC41635f<? super FuturesAirdropProfitEntity>, Throwable, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        public C136132(Continuation<? super C136132> continuation) {
            super(3, continuation);
        }

        @Override // p852kotlin.jvm.functions.Function3
        public final Object invoke(InterfaceC41635f<? super FuturesAirdropProfitEntity> interfaceC41635f, Throwable th2, Continuation<? super Unit> continuation) {
            C136132 c136132 = new C136132(continuation);
            c136132.L$0 = th2;
            return c136132.invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Throwable th2 = (Throwable) this.L$0;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            C44128b.m97264h(th2);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.kubi.futures.trade.FuturesViewModel$obsAirdropRealisedData$1$a */
    /* JADX INFO: compiled from: FuturesViewModel.kt */
    @Metadata(m90083d1 = {"\u0000\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001J\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0005\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, m90084d2 = {"com/kubi/futures/trade/FuturesViewModel$obsAirdropRealisedData$1$1", "Lcom/kubi/network/restful/core/IConverter;", "Lcom/kubi/network/api/subscribe/model/SubscribeMessage;", "Lcom/kubi/kumex/data/platform/model/FuturesAirdropProfitEntity;", "convert", "value", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nFuturesViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FuturesViewModel.kt\ncom/kubi/futures/trade/FuturesViewModel$obsAirdropRealisedData$1$1\n+ 2 GsonUtils.kt\ncom/kubi/utils/GsonUtils\n*L\n1#1,408:1\n149#2:409\n*S KotlinDebug\n*F\n+ 1 FuturesViewModel.kt\ncom/kubi/futures/trade/FuturesViewModel$obsAirdropRealisedData$1$1\n*L\n180#1:409\n*E\n"})
    public static final class C13614a implements InterfaceC41975c<SubscribeMessage, FuturesAirdropProfitEntity> {

        /* JADX INFO: renamed from: com.kubi.futures.trade.FuturesViewModel$obsAirdropRealisedData$1$a$a */
        /* JADX INFO: compiled from: GsonUtils.kt */
        @Metadata(m90083d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, m90084d2 = {"com/kubi/utils/GsonUtils$fromJson$1", "Lcom/google/gson/reflect/TypeToken;", "Utils_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
        @SourceDebugExtension({"SMAP\nGsonUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GsonUtils.kt\ncom/kubi/utils/GsonUtils$fromJson$1\n*L\n1#1,300:1\n*E\n"})
        public static final class a extends TypeToken<FuturesAirdropProfitEntity> {
        }

        @Override // kr.InterfaceC41975c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public FuturesAirdropProfitEntity convert(SubscribeMessage value) {
            Intrinsics.checkNotNullParameter(value, "value");
            if (!Intrinsics.areEqual(value.getTopic(), "/futuresTrial/airdropPosition") || !Intrinsics.areEqual(value.getSubject(), "position.profit")) {
                return null;
            }
            String data = value.getData();
            if (data == null) {
                data = "";
            }
            C27099x c27099x = C27099x.f54458a;
            return (FuturesAirdropProfitEntity) C27099x.m66914d(data, new a().getType());
        }
    }

    /* JADX INFO: renamed from: com.kubi.futures.trade.FuturesViewModel$obsAirdropRealisedData$1$b */
    /* JADX INFO: compiled from: FuturesViewModel.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C13615b<T> implements InterfaceC41635f {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Consumer<FuturesAirdropProfitEntity> f23641b;

        public C13615b(Consumer<FuturesAirdropProfitEntity> consumer) {
            this.f23641b = consumer;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC41635f
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object emit(FuturesAirdropProfitEntity futuresAirdropProfitEntity, Continuation<? super Unit> continuation) throws Exception {
            this.f23641b.accept(futuresAirdropProfitEntity);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FuturesViewModel$obsAirdropRealisedData$1(Consumer<FuturesAirdropProfitEntity> consumer, Continuation<? super FuturesViewModel$obsAirdropRealisedData$1> continuation) {
        super(2, continuation);
        this.$consumer = consumer;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new FuturesViewModel$obsAirdropRealisedData$1(this.$consumer, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((FuturesViewModel$obsAirdropRealisedData$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
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
            InterfaceC41634e interfaceC41634eM90917h = C41636g.m90917h(RepositoryServiceLocator.f19236a.m20292k().mo100568t(new C13614a()), new C136132(null));
            C13615b c13615b = new C13615b(this.$consumer);
            this.label = 1;
            if (interfaceC41634eM90917h.collect(c13615b, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
