package com.kubi.payment.channel.fiat;

import androidx.lifecycle.MutableLiveData;
import com.kubi.otc.entity.FastQuoteModel;
import com.kubi.payment.channel.data.entities.FiatInfoEntity;
import com.kubi.payment.channel.data.source.IChannelRepository;
import com.kubi.payment.util.PaymentStorageId;
import com.kubi.utils.extensions.C27024b;
import com.kubi.utils.extensions.C27025c;
import com.sensorsdata.analytics.android.sdk.data.adapter.DbParams;
import java.util.ArrayList;
import java.util.List;
import kotlinx.coroutines.InterfaceC41709m0;
import p477nt.AbstractC42878k;
import p852kotlin.Metadata;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import y70.StorageId;

/* JADX INFO: compiled from: SearchFiatViewModel.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.payment.channel.fiat.SearchFiatViewModel$loadFiatList$1", m90122f = "SearchFiatViewModel.kt", m90123i = {0, 1, 1, 1, 2, 2, 2, 2}, m90124l = {70, 77, 79}, m90125m = "invokeSuspend", m90126n = {"paramType", "paramType", DbParams.KEY_CHANNEL_RESULT, "data", "paramType", DbParams.KEY_CHANNEL_RESULT, "data", "historyFiatJson"}, m90127s = {"L$0", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3"})
@SourceDebugExtension({"SMAP\nSearchFiatViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SearchFiatViewModel.kt\ncom/kubi/payment/channel/fiat/SearchFiatViewModel$loadFiatList$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,166:1\n774#2:167\n865#2,2:168\n*S KotlinDebug\n*F\n+ 1 SearchFiatViewModel.kt\ncom/kubi/payment/channel/fiat/SearchFiatViewModel$loadFiatList$1\n*L\n72#1:167\n72#1:168,2\n*E\n"})
public final class SearchFiatViewModel$loadFiatList$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $type;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    final /* synthetic */ SearchFiatViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchFiatViewModel$loadFiatList$1(String str, SearchFiatViewModel searchFiatViewModel, Continuation<? super SearchFiatViewModel$loadFiatList$1> continuation) {
        super(2, continuation);
        this.$type = str;
        this.this$0 = searchFiatViewModel;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SearchFiatViewModel$loadFiatList$1(this.$type, this.this$0, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((SearchFiatViewModel$loadFiatList$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:41:0x011f  */
    /* JADX WARN: Code duplicated, block: B:43:0x0124  */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String str;
        String str2;
        AbstractC42878k abstractC42878k;
        List list;
        Boolean boolIsEnable;
        String str3;
        MutableLiveData mutableLiveData;
        MutableLiveData mutableLiveData2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 == 3) {
                        mutableLiveData2 = (MutableLiveData) this.L$4;
                        ResultKt.throwOnFailure(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    list = (List) this.L$2;
                    abstractC42878k = (AbstractC42878k) this.L$1;
                    str2 = (String) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    str3 = (String) obj;
                    if (str3.length() > 0) {
                        mutableLiveData = this.this$0.f38273b0;
                        SearchFiatViewModel searchFiatViewModel = this.this$0;
                        this.L$0 = SpillingKt.nullOutSpilledVariable(str2);
                        this.L$1 = SpillingKt.nullOutSpilledVariable(abstractC42878k);
                        this.L$2 = SpillingKt.nullOutSpilledVariable(list);
                        this.L$3 = SpillingKt.nullOutSpilledVariable(str3);
                        this.L$4 = mutableLiveData;
                        this.label = 3;
                        obj = searchFiatViewModel.m45831F(str3, list, this);
                        if (obj != coroutine_suspended) {
                            mutableLiveData2 = mutableLiveData;
                        }
                        return coroutine_suspended;
                    }
                    this.this$0.f38273b0.setValue(new ArrayList());
                    return Unit.INSTANCE;
                }
            } else {
                String str4 = (String) this.L$0;
                ResultKt.throwOnFailure(obj);
                str2 = str4;
            }
            mutableLiveData2.setValue(obj);
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(obj);
        if (Intrinsics.areEqual(this.$type, "fiat_withdraw")) {
            str = "WITHDRAW";
        } else {
            str = FastQuoteModel.PAY_RECHARGE;
        }
        IChannelRepository iChannelRepository = this.this$0.f38269X;
        FiatInfoEntity.Request request = new FiatInfoEntity.Request(str);
        this.L$0 = SpillingKt.nullOutSpilledVariable(str);
        this.label = 1;
        Object objMo45747o = iChannelRepository.mo45747o(request, this);
        if (objMo45747o != coroutine_suspended) {
            str2 = str;
            obj = objMo45747o;
        }
        return coroutine_suspended;
        AbstractC42878k abstractC42878k2 = (AbstractC42878k) obj;
        if (abstractC42878k2 instanceof AbstractC42878k.Success) {
            List listM66560c = C27024b.m66560c(((FiatInfoEntity.Response) ((AbstractC42878k.Success) abstractC42878k2).m94040a()).getCurrencyList());
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : listM66560c) {
                FiatInfoEntity.FiatInfo fiatInfo = (FiatInfoEntity.FiatInfo) obj2;
                if (fiatInfo != null) {
                    boolIsEnable = fiatInfo.isEnable();
                } else {
                    boolIsEnable = null;
                }
                if (C27025c.m66566d(boolIsEnable)) {
                    arrayList.add(obj2);
                }
            }
            this.this$0.f38270Y.setValue(arrayList);
            this.this$0.f38271Z = arrayList;
            SearchFiatViewModel searchFiatViewModel2 = this.this$0;
            StorageId<String> storageIdM49846x = PaymentStorageId.f40364a.m49846x(this.$type);
            this.L$0 = SpillingKt.nullOutSpilledVariable(str2);
            this.L$1 = SpillingKt.nullOutSpilledVariable(abstractC42878k2);
            this.L$2 = arrayList;
            this.label = 2;
            Object objM45828C = searchFiatViewModel2.m45828C(storageIdM49846x, this);
            if (objM45828C != coroutine_suspended) {
                abstractC42878k = abstractC42878k2;
                obj = objM45828C;
                list = arrayList;
                str3 = (String) obj;
                if (str3.length() > 0) {
                    mutableLiveData = this.this$0.f38273b0;
                    SearchFiatViewModel searchFiatViewModel3 = this.this$0;
                    this.L$0 = SpillingKt.nullOutSpilledVariable(str2);
                    this.L$1 = SpillingKt.nullOutSpilledVariable(abstractC42878k);
                    this.L$2 = SpillingKt.nullOutSpilledVariable(list);
                    this.L$3 = SpillingKt.nullOutSpilledVariable(str3);
                    this.L$4 = mutableLiveData;
                    this.label = 3;
                    obj = searchFiatViewModel3.m45831F(str3, list, this);
                    if (obj != coroutine_suspended) {
                        mutableLiveData2 = mutableLiveData;
                        mutableLiveData2.setValue(obj);
                    }
                } else {
                    this.this$0.f38273b0.setValue(new ArrayList());
                }
            }
            return coroutine_suspended;
        }
        if (abstractC42878k2 instanceof AbstractC42878k.Error) {
            this.this$0.m94035p().setValue(((AbstractC42878k.Error) abstractC42878k2).getException());
            this.this$0.f38270Y.setValue(CollectionsKt.emptyList());
        } else {
            throw new NoWhenBranchMatchedException();
        }
        return Unit.INSTANCE;
    }
}
