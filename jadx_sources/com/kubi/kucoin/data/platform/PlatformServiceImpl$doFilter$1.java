package com.kubi.kucoin.data.platform;

import com.kubi.kucoin.data.platform.model.CountryEntity;
import com.kubi.kucoin.data.platform.model.CountryFilterResult;
import java.util.List;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: PlatformServiceImpl.kt */
/* JADX INFO: loaded from: classes18.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.kucoin.data.platform.PlatformServiceImpl$doFilter$1", m90122f = "PlatformServiceImpl.kt", m90123i = {}, m90124l = {190}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class PlatformServiceImpl$doFilter$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function1<CountryFilterResult, Unit> $callback;
    final /* synthetic */ InterfaceC41709m0 $coroutineScope;
    final /* synthetic */ List<CountryEntity> $countryList;
    int label;
    final /* synthetic */ PlatformServiceImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public PlatformServiceImpl$doFilter$1(PlatformServiceImpl platformServiceImpl, List<CountryEntity> list, InterfaceC41709m0 interfaceC41709m0, Function1<? super CountryFilterResult, Unit> function1, Continuation<? super PlatformServiceImpl$doFilter$1> continuation) {
        super(2, continuation);
        this.this$0 = platformServiceImpl;
        this.$countryList = list;
        this.$coroutineScope = interfaceC41709m0;
        this.$callback = function1;
    }

    /* JADX INFO: renamed from: f */
    public static final Unit m32044f(PlatformServiceImpl platformServiceImpl, List list, InterfaceC41709m0 interfaceC41709m0, Function1 function1, CountryFilterResult countryFilterResult) {
        if (countryFilterResult != null) {
            PlatformServiceImpl.m31988R(interfaceC41709m0, function1, countryFilterResult);
        } else {
            PlatformServiceImpl.m31988R(interfaceC41709m0, function1, platformServiceImpl.m32040r0(list));
        }
        return Unit.INSTANCE;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PlatformServiceImpl$doFilter$1(this.this$0, this.$countryList, this.$coroutineScope, this.$callback, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((PlatformServiceImpl$doFilter$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
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
            final PlatformServiceImpl platformServiceImpl = this.this$0;
            final List<CountryEntity> list = this.$countryList;
            final InterfaceC41709m0 interfaceC41709m0 = this.$coroutineScope;
            final Function1<CountryFilterResult, Unit> function1 = this.$callback;
            Function1 function2 = new Function1() { // from class: com.kubi.kucoin.data.platform.i0
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return PlatformServiceImpl$doFilter$1.m32044f(platformServiceImpl, list, interfaceC41709m0, function1, (CountryFilterResult) obj2);
                }
            };
            this.label = 1;
            if (platformServiceImpl.m32039q0(list, function2, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
