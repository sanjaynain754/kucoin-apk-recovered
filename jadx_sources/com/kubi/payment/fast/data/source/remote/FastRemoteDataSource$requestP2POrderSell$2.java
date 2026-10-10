package com.kubi.payment.fast.data.source.remote;

import com.kubi.sdk.base.entity.BaseEntity;
import com.tencent.thumbplayer.tcmedia.core.common.TPCodecParamers;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: FastRemoteDataSource.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\n"}, m90084d2 = {"<anonymous>", "Lcom/kubi/sdk/base/entity/BaseEntity;", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.payment.fast.data.source.remote.FastRemoteDataSource$requestP2POrderSell$2", m90122f = "FastRemoteDataSource.kt", m90123i = {}, m90124l = {TPCodecParamers.TP_PROFILE_MJPEG_HUFFMAN_PROGRESSIVE_DCT}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class FastRemoteDataSource$requestP2POrderSell$2 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super BaseEntity<String>>, Object> {
    final /* synthetic */ String $adId;
    final /* synthetic */ String $businessType;
    final /* synthetic */ String $currencyAmount;
    final /* synthetic */ String $legalCurrencyAmount;
    final /* synthetic */ String $orderPrice;
    final /* synthetic */ String $payTypeCode;
    final /* synthetic */ String $url;
    final /* synthetic */ String $validationToken;
    int label;
    final /* synthetic */ FastRemoteDataSource this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FastRemoteDataSource$requestP2POrderSell$2(FastRemoteDataSource fastRemoteDataSource, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Continuation<? super FastRemoteDataSource$requestP2POrderSell$2> continuation) {
        super(2, continuation);
        this.this$0 = fastRemoteDataSource;
        this.$url = str;
        this.$validationToken = str2;
        this.$adId = str3;
        this.$currencyAmount = str4;
        this.$legalCurrencyAmount = str5;
        this.$orderPrice = str6;
        this.$payTypeCode = str7;
        this.$businessType = str8;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new FastRemoteDataSource$requestP2POrderSell$2(this.this$0, this.$url, this.$validationToken, this.$adId, this.$currencyAmount, this.$legalCurrencyAmount, this.$orderPrice, this.$payTypeCode, this.$businessType, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super BaseEntity<String>> continuation) {
        return ((FastRemoteDataSource$requestP2POrderSell$2) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
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
        String str = this.$url;
        String str2 = this.$validationToken;
        String str3 = this.$adId;
        String str4 = this.$currencyAmount;
        String str5 = this.$legalCurrencyAmount;
        String str6 = this.$orderPrice;
        String str7 = this.$payTypeCode;
        String str8 = this.$businessType;
        this.label = 1;
        Object objM46512x = fastWebService.m46512x(str, str2, str3, str4, str5, str6, str7, str8, this);
        if (objM46512x == coroutine_suspended) {
            return coroutine_suspended;
        }
        return objM46512x;
    }
}
