package com.kubi.assets.search.depositandwithdraw;

import com.kubi.assets.entity.SearchCoinEntity;
import com.kubi.data.entity.CoinInfoEntity;
import com.kubi.router.core.Router;
import com.kubi.sdk.site.info.SiteInfoManager;
import java.util.ArrayList;
import java.util.List;
import p830zf.InterfaceC46799g0;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function3;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: DepositSearchCoinVMHelper.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004H\n"}, m90084d2 = {"<anonymous>", "", "Lcom/kubi/assets/entity/SearchCoinEntity;", "coinList", "", "Lcom/kubi/data/entity/CoinInfoEntity;", "hotList", ""}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.assets.search.depositandwithdraw.DepositSearchCoinVMHelper$handleGetServerData$2", m90122f = "DepositSearchCoinVMHelper.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
@SourceDebugExtension({"SMAP\nDepositSearchCoinVMHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DepositSearchCoinVMHelper.kt\ncom/kubi/assets/search/depositandwithdraw/DepositSearchCoinVMHelper$handleGetServerData$2\n+ 2 FlavorEx.kt\ncom/kubi/kucoin/helper/FlavorExKt\n*L\n1#1,100:1\n33#2:101\n17#2,2:102\n34#2,3:104\n*S KotlinDebug\n*F\n+ 1 DepositSearchCoinVMHelper.kt\ncom/kubi/assets/search/depositandwithdraw/DepositSearchCoinVMHelper$handleGetServerData$2\n*L\n56#1:101\n56#1:102,2\n56#1:104,3\n*E\n"})
public final class DepositSearchCoinVMHelper$handleGetServerData$2 extends SuspendLambda implements Function3<List<? extends CoinInfoEntity>, List<? extends String>, Continuation<? super List<SearchCoinEntity>>, Object> {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ DepositSearchCoinVMHelper this$0;

    @Override // p852kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Object invoke(List<? extends CoinInfoEntity> list, List<? extends String> list2, Continuation<? super List<SearchCoinEntity>> continuation) {
        return invoke2(list, (List<String>) list2, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DepositSearchCoinVMHelper$handleGetServerData$2(DepositSearchCoinVMHelper depositSearchCoinVMHelper, Continuation<? super DepositSearchCoinVMHelper$handleGetServerData$2> continuation) {
        super(3, continuation);
        this.this$0 = depositSearchCoinVMHelper;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(List<? extends CoinInfoEntity> list, List<String> list2, Continuation<? super List<SearchCoinEntity>> continuation) {
        DepositSearchCoinVMHelper$handleGetServerData$2 depositSearchCoinVMHelper$handleGetServerData$2 = new DepositSearchCoinVMHelper$handleGetServerData$2(this.this$0, continuation);
        depositSearchCoinVMHelper$handleGetServerData$2.L$0 = list;
        depositSearchCoinVMHelper$handleGetServerData$2.L$1 = list2;
        return depositSearchCoinVMHelper$handleGetServerData$2.invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        List<? extends CoinInfoEntity> list = (List) this.L$0;
        List<String> list2 = (List) this.L$1;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        ArrayList arrayList = new ArrayList();
        DepositSearchCoinVMHelper depositSearchCoinVMHelper = this.this$0;
        Object objM56186h = Router.f46192a.m56186h(InterfaceC46799g0.class, SiteInfoManager.f47913a.m58109c());
        if (objM56186h != null ? ((InterfaceC46799g0) objM56186h).m103129b() : true) {
            depositSearchCoinVMHelper.m19083v(list2);
        }
        depositSearchCoinVMHelper.m18912B(list);
        return arrayList;
    }
}
