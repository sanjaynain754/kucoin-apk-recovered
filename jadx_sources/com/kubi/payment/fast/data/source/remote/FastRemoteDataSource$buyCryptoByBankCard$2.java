package com.kubi.payment.fast.data.source.remote;

import androidx.credentials.provider.CredentialEntry;
import com.blankj.utilcode.util.C5267e0;
import com.kubi.payment.fast.data.entities.BankCard;
import com.kubi.sdk.base.entity.BaseEntity;
import java.util.Map;
import java.util.TimeZone;
import kotlinx.coroutines.InterfaceC41709m0;
import p694vk.C45590s;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.MapsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: FastRemoteDataSource.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\n"}, m90084d2 = {"<anonymous>", "Lcom/kubi/sdk/base/entity/BaseEntity;", "Lcom/kubi/payment/fast/data/entities/BankCard$BuyResponse;", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.payment.fast.data.source.remote.FastRemoteDataSource$buyCryptoByBankCard$2", m90122f = "FastRemoteDataSource.kt", m90123i = {}, m90124l = {135}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class FastRemoteDataSource$buyCryptoByBankCard$2 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super BaseEntity<BankCard.BuyResponse>>, Object> {
    final /* synthetic */ BankCard.BuyRequest $request;
    int label;
    final /* synthetic */ FastRemoteDataSource this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FastRemoteDataSource$buyCryptoByBankCard$2(FastRemoteDataSource fastRemoteDataSource, BankCard.BuyRequest buyRequest, Continuation<? super FastRemoteDataSource$buyCryptoByBankCard$2> continuation) {
        super(2, continuation);
        this.this$0 = fastRemoteDataSource;
        this.$request = buyRequest;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new FastRemoteDataSource$buyCryptoByBankCard$2(this.this$0, this.$request, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super BaseEntity<BankCard.BuyResponse>> continuation) {
        return ((FastRemoteDataSource$buyCryptoByBankCard$2) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 == 1) {
                ResultKt.throwOnFailure(obj);
                return obj;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        FastWebService fastWebService = this.this$0.f38593a;
        Map<String, String> mapMapOf = MapsKt.mapOf(new Pair("X-JAVA-ENABLED", CredentialEntry.FALSE_STRING), new Pair("X-JAVASCRIPT-ENABLED", CredentialEntry.TRUE_STRING), new Pair("X-COLOR-DEPTH", "15"), new Pair("X-ACCEPT-HEADER", "application/json"), new Pair("X-USER-AGENT", "android/" + C45590s.f102687a.m100675Z()), new Pair("X-SCREEN-HEIGHT", String.valueOf(C5267e0.m6179a() / 3)), new Pair("X-SCREEN-WIDTH", String.valueOf(C5267e0.m6180b() / 3)), new Pair("X-TIMEZONE-OFFSET", String.valueOf((TimeZone.getDefault().getRawOffset() / 3600) / 1000)));
        BankCard.BuyRequest buyRequest = this.$request;
        this.label = 1;
        Object objM46497e = fastWebService.m46497e(mapMapOf, buyRequest, this);
        if (objM46497e == coroutine_suspended) {
            return coroutine_suspended;
        }
        return objM46497e;
    }
}
