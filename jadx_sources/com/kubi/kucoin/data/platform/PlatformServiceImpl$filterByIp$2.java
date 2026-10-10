package com.kubi.kucoin.data.platform;

import com.kubi.kucoin.data.platform.model.CountryEntity;
import com.kubi.kucoin.data.platform.model.CountryFilterResult;
import com.kubi.kucoin.data.platform.model.IpCountryEntity;
import java.util.Iterator;
import java.util.List;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.text.StringsKt;

/* JADX INFO: compiled from: PlatformServiceImpl.kt */
/* JADX INFO: loaded from: classes18.dex */
@Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m90084d2 = {"<anonymous>", "", "info", "Lcom/kubi/kucoin/data/platform/model/IpCountryEntity;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.kucoin.data.platform.PlatformServiceImpl$filterByIp$2", m90122f = "PlatformServiceImpl.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class PlatformServiceImpl$filterByIp$2 extends SuspendLambda implements Function2<IpCountryEntity, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function1<CountryFilterResult, Unit> $callback;
    final /* synthetic */ List<CountryEntity> $countryList;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ PlatformServiceImpl this$0;

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(IpCountryEntity ipCountryEntity, Continuation<? super Unit> continuation) {
        return ((PlatformServiceImpl$filterByIp$2) create(ipCountryEntity, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public PlatformServiceImpl$filterByIp$2(Function1<? super CountryFilterResult, Unit> function1, PlatformServiceImpl platformServiceImpl, List<CountryEntity> list, Continuation<? super PlatformServiceImpl$filterByIp$2> continuation) {
        super(2, continuation);
        this.$callback = function1;
        this.this$0 = platformServiceImpl;
        this.$countryList = list;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        PlatformServiceImpl$filterByIp$2 platformServiceImpl$filterByIp$2 = new PlatformServiceImpl$filterByIp$2(this.$callback, this.this$0, this.$countryList, continuation);
        platformServiceImpl$filterByIp$2.L$0 = obj;
        return platformServiceImpl$filterByIp$2;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String mobileCode;
        Object next;
        IpCountryEntity ipCountryEntity = (IpCountryEntity) this.L$0;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        String countryCode = ipCountryEntity.getCountryCode();
        if (countryCode == null || countryCode.length() == 0 || (mobileCode = ipCountryEntity.getMobileCode()) == null || mobileCode.length() == 0) {
            this.$callback.invoke(null);
            return Unit.INSTANCE;
        }
        String countryCode2 = ipCountryEntity.getCountryCode();
        if (countryCode2 == null) {
            countryCode2 = "";
        }
        String mobileCode2 = ipCountryEntity.getMobileCode();
        String str = mobileCode2 != null ? mobileCode2 : "";
        if (!StringsKt.startsWith$default(str, "+", false, 2, (Object) null)) {
            str = '+' + str;
        }
        this.this$0.f27737c = countryCode2 + '-' + str;
        Iterator<T> it = this.$countryList.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            CountryEntity countryEntity = (CountryEntity) next;
            if (countryEntity.getCode().length() > 0 && Intrinsics.areEqual(countryEntity.getCode(), countryCode2) && countryEntity.getMobileCode().length() > 0 && Intrinsics.areEqual(countryEntity.getMobileCode(), str)) {
                break;
            }
        }
        CountryEntity countryEntity2 = (CountryEntity) next;
        this.$callback.invoke(countryEntity2 != null ? this.this$0.m32042v0(countryEntity2) : null);
        return Unit.INSTANCE;
    }
}
