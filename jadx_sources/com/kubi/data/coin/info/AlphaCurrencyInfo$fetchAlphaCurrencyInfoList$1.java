package com.kubi.data.coin.info;

import com.kubi.data.entity.AlphaCurrencyEntity;
import com.kubi.data.entity.AlphaCurrencyInfoEntity;
import com.kubi.network.retrofit.utils.C19334f;
import com.kubi.network.retrofit.utils.RetrofitFlowExKt;
import java.util.ArrayList;
import kotlinx.coroutines.AbstractC41697j0;
import kotlinx.coroutines.C41686h;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.flow.InterfaceC41634e;
import o00.C42911a;
import p569qq.C43840a;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import ro.C44128b;
import y70.C46392a;

/* JADX INFO: compiled from: AlphaCurrencyInfo.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.data.coin.info.AlphaCurrencyInfo$fetchAlphaCurrencyInfoList$1", m90122f = "AlphaCurrencyInfo.kt", m90123i = {1, 1, 1, 1, 1, 1}, m90124l = {64, 76}, m90125m = "invokeSuspend", m90126n = {"$this$onFail$iv", "it$iv", "it", "$i$f$onFail", "$i$a$-let-RetrofitFlowExKt$onFail$1$iv", "$i$a$-onFail-AlphaCurrencyInfo$fetchAlphaCurrencyInfoList$1$2"}, m90127s = {"L$0", "L$1", "L$2", "I$0", "I$1", "I$2"})
@SourceDebugExtension({"SMAP\nAlphaCurrencyInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AlphaCurrencyInfo.kt\ncom/kubi/data/coin/info/AlphaCurrencyInfo$fetchAlphaCurrencyInfoList$1\n+ 2 RetrofitFlowEx.kt\ncom/kubi/network/retrofit/utils/RetrofitFlowExKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,157:1\n25#2:158\n26#2:160\n1#3:159\n*S KotlinDebug\n*F\n+ 1 AlphaCurrencyInfo.kt\ncom/kubi/data/coin/info/AlphaCurrencyInfo$fetchAlphaCurrencyInfoList$1\n*L\n74#1:158\n74#1:160\n74#1:159\n*E\n"})
public final class AlphaCurrencyInfo$fetchAlphaCurrencyInfoList$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function1<ArrayList<AlphaCurrencyInfoEntity>, Unit> $callback;
    final /* synthetic */ long $timeline;
    int I$0;
    int I$1;
    int I$2;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;

    /* JADX INFO: renamed from: com.kubi.data.coin.info.AlphaCurrencyInfo$fetchAlphaCurrencyInfoList$1$1 */
    /* JADX INFO: compiled from: AlphaCurrencyInfo.kt */
    @Metadata(m90083d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", "Lcom/kubi/data/entity/AlphaCurrencyEntity;", "kotlin.jvm.PlatformType"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.data.coin.info.AlphaCurrencyInfo$fetchAlphaCurrencyInfoList$1$1", m90122f = "AlphaCurrencyInfo.kt", m90123i = {0}, m90124l = {71}, m90125m = "invokeSuspend", m90126n = {"it"}, m90127s = {"L$0"})
    @SourceDebugExtension({"SMAP\nAlphaCurrencyInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AlphaCurrencyInfo.kt\ncom/kubi/data/coin/info/AlphaCurrencyInfo$fetchAlphaCurrencyInfoList$1$1\n+ 2 StorageIdEx.kt\ncom/kubi/utils/storage/StorageIdExKt\n*L\n1#1,157:1\n75#2,2:158\n*S KotlinDebug\n*F\n+ 1 AlphaCurrencyInfo.kt\ncom/kubi/data/coin/info/AlphaCurrencyInfo$fetchAlphaCurrencyInfoList$1$1\n*L\n67#1:158,2\n*E\n"})
    public static final class C124901 extends SuspendLambda implements Function2<AlphaCurrencyEntity, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function1<ArrayList<AlphaCurrencyInfoEntity>, Unit> $callback;
        final /* synthetic */ long $timeline;
        /* synthetic */ Object L$0;
        int label;

        /* JADX INFO: renamed from: com.kubi.data.coin.info.AlphaCurrencyInfo$fetchAlphaCurrencyInfoList$1$1$1, reason: invalid class name */
        /* JADX INFO: compiled from: AlphaCurrencyInfo.kt */
        @Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
        @DebugMetadata(m90121c = "com.kubi.data.coin.info.AlphaCurrencyInfo$fetchAlphaCurrencyInfoList$1$1$1", m90122f = "AlphaCurrencyInfo.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
            final /* synthetic */ Function1<ArrayList<AlphaCurrencyInfoEntity>, Unit> $callback;
            final /* synthetic */ AlphaCurrencyEntity $it;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public AnonymousClass1(Function1<? super ArrayList<AlphaCurrencyInfoEntity>, Unit> function1, AlphaCurrencyEntity alphaCurrencyEntity, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$callback = function1;
                this.$it = alphaCurrencyEntity;
            }

            @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.$callback, this.$it, continuation);
            }

            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    Function1<ArrayList<AlphaCurrencyInfoEntity>, Unit> function1 = this.$callback;
                    if (function1 != null) {
                        function1.invoke(this.$it.getCurrencies());
                    }
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(AlphaCurrencyEntity alphaCurrencyEntity, Continuation<? super Unit> continuation) {
            return ((C124901) create(alphaCurrencyEntity, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C124901(long j11, Function1<? super ArrayList<AlphaCurrencyInfoEntity>, Unit> function1, Continuation<? super C124901> continuation) {
            super(2, continuation);
            this.$timeline = j11;
            this.$callback = function1;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C124901 c124901 = new C124901(this.$timeline, this.$callback, continuation);
            c124901.L$0 = obj;
            return c124901;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            AlphaCurrencyEntity alphaCurrencyEntity = (AlphaCurrencyEntity) this.L$0;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.label;
            if (i11 == 0) {
                ResultKt.throwOnFailure(obj);
                if (alphaCurrencyEntity.getTimeline() != null && alphaCurrencyEntity.getTimeline().longValue() > this.$timeline) {
                    C46392a.m102330m(AlphaCurrencyInfo.f21431d, alphaCurrencyEntity.getTimeline().longValue());
                }
                AlphaCurrencyInfo.f21428a.m23491g(alphaCurrencyEntity.getCurrencies());
                C43840a.m96551e("fetchAlphaCurrencyInfoList section3", null, 2, null);
                AbstractC41697j0 abstractC41697j0M94121c = C42911a.m94121c();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$callback, alphaCurrencyEntity, null);
                this.L$0 = SpillingKt.nullOutSpilledVariable(alphaCurrencyEntity);
                this.label = 1;
                if (C41686h.m91049g(abstractC41697j0M94121c, anonymousClass1, this) == coroutine_suspended) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AlphaCurrencyInfo$fetchAlphaCurrencyInfoList$1(long j11, Function1<? super ArrayList<AlphaCurrencyInfoEntity>, Unit> function1, Continuation<? super AlphaCurrencyInfo$fetchAlphaCurrencyInfoList$1> continuation) {
        super(2, continuation);
        this.$timeline = j11;
        this.$callback = function1;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AlphaCurrencyInfo$fetchAlphaCurrencyInfoList$1(this.$timeline, this.$callback, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((AlphaCurrencyInfo$fetchAlphaCurrencyInfoList$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0088, code lost:
    
        if (kotlinx.coroutines.C41686h.m91049g(r6, r7, r9) == r0) goto L17;
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
        InterfaceC41634e<AlphaCurrencyEntity> interfaceC41634eM85558e = AlphaCurrencyInfo.f21428a.m23498o().m85558e(Boxing.boxLong(this.$timeline));
        Intrinsics.checkNotNullExpressionValue(interfaceC41634eM85558e, "getAlphaCurrencies(...)");
        C124901 c124901 = new C124901(this.$timeline, this.$callback, null);
        this.label = 1;
        obj = RetrofitFlowExKt.m42823d(interfaceC41634eM85558e, false, c124901, this);
        if (obj != coroutine_suspended) {
        }
        return coroutine_suspended;
        C19334f c19334f = (C19334f) obj;
        Function1<ArrayList<AlphaCurrencyInfoEntity>, Unit> function1 = this.$callback;
        Throwable throwable = c19334f.getThrowable();
        if (throwable != null) {
            C44128b.m97263g("AlphaCurrencyInfo", throwable);
            AbstractC41697j0 abstractC41697j0M94121c = C42911a.m94121c();
            AlphaCurrencyInfo$fetchAlphaCurrencyInfoList$1$2$1 alphaCurrencyInfo$fetchAlphaCurrencyInfoList$1$2$1 = new AlphaCurrencyInfo$fetchAlphaCurrencyInfoList$1$2$1(function1, null);
            this.L$0 = c19334f;
            this.L$1 = SpillingKt.nullOutSpilledVariable(throwable);
            this.L$2 = SpillingKt.nullOutSpilledVariable(throwable);
            this.I$0 = 0;
            this.I$1 = 0;
            this.I$2 = 0;
            this.label = 2;
        }
        return Unit.INSTANCE;
    }
}
