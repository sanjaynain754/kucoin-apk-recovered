package com.kubi.unify;

import com.kubi.network.retrofit.utils.C19334f;
import com.kubi.network.retrofit.utils.RetrofitFlowExKt;
import com.kubi.unify.api.entity.UnifyHourlyRateEntity;
import i60.InterfaceC38460c;
import java.util.List;
import java.util.Map;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.flow.C41636g;
import kotlinx.coroutines.flow.InterfaceC41634e;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.MapsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.SourceDebugExtension;
import ro.C44128b;

/* JADX INFO: compiled from: UnifyGlobalDataManager.kt */
/* JADX INFO: loaded from: classes52.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.unify.UnifyGlobalDataManager$fetchUnifyHourlyRates$1", m90122f = "UnifyGlobalDataManager.kt", m90123i = {}, m90124l = {96}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
@SourceDebugExtension({"SMAP\nUnifyGlobalDataManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UnifyGlobalDataManager.kt\ncom/kubi/unify/UnifyGlobalDataManager$fetchUnifyHourlyRates$1\n+ 2 RetrofitFlowEx.kt\ncom/kubi/network/retrofit/utils/RetrofitFlowExKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,336:1\n25#2:337\n26#2:339\n1#3:338\n*S KotlinDebug\n*F\n+ 1 UnifyGlobalDataManager.kt\ncom/kubi/unify/UnifyGlobalDataManager$fetchUnifyHourlyRates$1\n*L\n102#1:337\n102#1:339\n102#1:338\n*E\n"})
public final class UnifyGlobalDataManager$fetchUnifyHourlyRates$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $currency;
    int label;

    /* JADX INFO: renamed from: com.kubi.unify.UnifyGlobalDataManager$fetchUnifyHourlyRates$1$1 */
    /* JADX INFO: compiled from: UnifyGlobalDataManager.kt */
    @Metadata(m90083d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, m90084d2 = {"<anonymous>", "", "rates", "", "Lcom/kubi/unify/api/entity/UnifyHourlyRateEntity;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.unify.UnifyGlobalDataManager$fetchUnifyHourlyRates$1$1", m90122f = "UnifyGlobalDataManager.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    @SourceDebugExtension({"SMAP\nUnifyGlobalDataManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UnifyGlobalDataManager.kt\ncom/kubi/unify/UnifyGlobalDataManager$fetchUnifyHourlyRates$1$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,336:1\n1869#2,2:337\n*S KotlinDebug\n*F\n+ 1 UnifyGlobalDataManager.kt\ncom/kubi/unify/UnifyGlobalDataManager$fetchUnifyHourlyRates$1$1\n*L\n98#1:337,2\n*E\n"})
    public static final class C264531 extends SuspendLambda implements Function2<List<? extends UnifyHourlyRateEntity>, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        public C264531(Continuation<? super C264531> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(List<? extends UnifyHourlyRateEntity> list, Continuation<? super Unit> continuation) {
            return invoke2((List<UnifyHourlyRateEntity>) list, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C264531 c264531 = new C264531(continuation);
            c264531.L$0 = obj;
            return c264531;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(List<UnifyHourlyRateEntity> list, Continuation<? super Unit> continuation) {
            return ((C264531) create(list, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            List<UnifyHourlyRateEntity> list = (List) this.L$0;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            Map mutableMap = MapsKt.toMutableMap((Map) UnifyGlobalDataManager.f53096m.getValue());
            for (UnifyHourlyRateEntity unifyHourlyRateEntity : list) {
                mutableMap.put(unifyHourlyRateEntity.getCurrency(), unifyHourlyRateEntity);
            }
            UnifyGlobalDataManager.f53096m.setValue(mutableMap);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnifyGlobalDataManager$fetchUnifyHourlyRates$1(String str, Continuation<? super UnifyGlobalDataManager$fetchUnifyHourlyRates$1> continuation) {
        super(2, continuation);
        this.$currency = str;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new UnifyGlobalDataManager$fetchUnifyHourlyRates$1(this.$currency, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((UnifyGlobalDataManager$fetchUnifyHourlyRates$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
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
            InterfaceC41634e interfaceC41634eM90881E = C41636g.m90881E(InterfaceC38460c.m86732n(UnifyGlobalDataManager.f53084a.m64882t(), this.$currency, null, 2, null));
            C264531 c264531 = new C264531(null);
            this.label = 1;
            obj = RetrofitFlowExKt.m42823d(interfaceC41634eM90881E, false, c264531, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        String str = this.$currency;
        Throwable throwable = ((C19334f) obj).getThrowable();
        if (throwable != null) {
            C44128b.m97264h(throwable);
            Map mutableMap = MapsKt.toMutableMap((Map) UnifyGlobalDataManager.f53096m.getValue());
            mutableMap.put(str, new UnifyHourlyRateEntity(str, 0, ""));
            UnifyGlobalDataManager.f53096m.setValue(mutableMap);
        }
        return Unit.INSTANCE;
    }
}
