package com.kubi.assets.bill;

import com.kubi.data.entity.CoinInfoEntity;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: AccountBillSearchCoinDialog.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.assets.bill.AccountBillSearchCoinDialog$Companion$preloadCoinList$2", m90122f = "AccountBillSearchCoinDialog.kt", m90123i = {}, m90124l = {65}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
@SourceDebugExtension({"SMAP\nAccountBillSearchCoinDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AccountBillSearchCoinDialog.kt\ncom/kubi/assets/bill/AccountBillSearchCoinDialog$Companion$preloadCoinList$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,283:1\n1563#2:284\n1634#2,3:285\n*S KotlinDebug\n*F\n+ 1 AccountBillSearchCoinDialog.kt\ncom/kubi/assets/bill/AccountBillSearchCoinDialog$Companion$preloadCoinList$2\n*L\n66#1:284\n66#1:285,3\n*E\n"})
public final class AccountBillSearchCoinDialog$Companion$preloadCoinList$2 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ AccountBillRepository $repository;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AccountBillSearchCoinDialog$Companion$preloadCoinList$2(AccountBillRepository accountBillRepository, Continuation<? super AccountBillSearchCoinDialog$Companion$preloadCoinList$2> continuation) {
        super(2, continuation);
        this.$repository = accountBillRepository;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AccountBillSearchCoinDialog$Companion$preloadCoinList$2(this.$repository, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((AccountBillSearchCoinDialog$Companion$preloadCoinList$2) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objM15645j;
        Collection collectionEmptyList;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 == 1) {
                ResultKt.throwOnFailure(obj);
                objM15645j = ((Result) obj).getValue();
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            AccountBillRepository accountBillRepository = this.$repository;
            this.label = 1;
            objM15645j = accountBillRepository.m15645j(this);
            if (objM15645j == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        if (Result.m103850isFailureimpl(objM15645j)) {
            objM15645j = null;
        }
        ArrayList arrayList = (ArrayList) objM15645j;
        if (arrayList != null) {
            collectionEmptyList = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                collectionEmptyList.add(C9608h1.m15809b((CoinInfoEntity) it.next()));
            }
        } else {
            collectionEmptyList = CollectionsKt.emptyList();
        }
        AccountBillSearchCoinDialog.f16658C0.clear();
        AccountBillSearchCoinDialog.f16658C0.addAll(collectionEmptyList);
        return Unit.INSTANCE;
    }
}
