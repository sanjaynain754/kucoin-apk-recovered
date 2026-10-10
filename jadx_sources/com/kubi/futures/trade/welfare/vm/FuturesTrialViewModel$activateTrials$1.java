package com.kubi.futures.trade.welfare.vm;

import com.kubi.broker.RepositoryServiceLocator;
import com.kubi.futures.data.trial.LeadTradingActivateTrialRequest;
import com.kubi.kumex.data.platform.model.FuturesWelfareComposeEntity;
import com.kubi.kumex.data.platform.model.FuturesWelfareComposeItemEntity;
import com.kubi.kumex.data.platform.model.FuturesWelfareTrialEntity;
import com.kubi.kumex.data.platform.model.FuturesWelfareTrialItemEntity;
import com.kubi.kumex.service.KuMexDepend;
import com.kubi.network.retrofit.exception.ApiException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.InterfaceC41709m0;
import p692vh.InterfaceC45544a;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.sequences.Sequence;
import p852kotlin.sequences.SequencesKt;
import p852kotlin.text.StringsKt;

/* JADX INFO: compiled from: FuturesTrialViewModel.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.futures.trade.welfare.vm.FuturesTrialViewModel$activateTrials$1", m90122f = "FuturesTrialViewModel.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
@SourceDebugExtension({"SMAP\nFuturesTrialViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FuturesTrialViewModel.kt\ncom/kubi/futures/trade/welfare/vm/FuturesTrialViewModel$activateTrials$1\n+ 2 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n*L\n1#1,305:1\n183#2,2:306\n*S KotlinDebug\n*F\n+ 1 FuturesTrialViewModel.kt\ncom/kubi/futures/trade/welfare/vm/FuturesTrialViewModel$activateTrials$1\n*L\n154#1:306,2\n*E\n"})
public final class FuturesTrialViewModel$activateTrials$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $code;
    final /* synthetic */ boolean $forceActivate;
    int label;
    final /* synthetic */ FuturesTrialViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FuturesTrialViewModel$activateTrials$1(boolean z11, FuturesTrialViewModel futuresTrialViewModel, String str, Continuation<? super FuturesTrialViewModel$activateTrials$1> continuation) {
        super(2, continuation);
        this.$forceActivate = z11;
        this.this$0 = futuresTrialViewModel;
        this.$code = str;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new FuturesTrialViewModel$activateTrials$1(this.$forceActivate, this.this$0, this.$code, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((FuturesTrialViewModel$activateTrials$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final FuturesWelfareTrialItemEntity m28775f(FuturesWelfareComposeItemEntity futuresWelfareComposeItemEntity) {
        return futuresWelfareComposeItemEntity.toTrial();
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        FuturesWelfareTrialEntity futuresWelfareTrialEntityMo100558f;
        List<FuturesWelfareTrialItemEntity> items;
        FuturesWelfareComposeEntity futuresWelfareComposeEntityMo100570x;
        FuturesWelfareTrialItemEntity futuresWelfareTrialItemEntity;
        ArrayList<FuturesWelfareComposeItemEntity> items2;
        Sequence sequenceAsSequence;
        Sequence sequenceMapNotNull;
        Object next;
        FuturesWelfareTrialItemEntity futuresWelfareTrialItemEntity2;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            if (KuMexDepend.f30378a.m35900b().mo20635p()) {
                if (!this.$forceActivate) {
                    futuresWelfareComposeEntityMo100570x = RepositoryServiceLocator.f19236a.m20292k().mo100570x();
                } else {
                    futuresWelfareComposeEntityMo100570x = null;
                }
                if (futuresWelfareComposeEntityMo100570x != null && (items2 = futuresWelfareComposeEntityMo100570x.getItems()) != null && (sequenceAsSequence = CollectionsKt.asSequence(items2)) != null && (sequenceMapNotNull = SequencesKt.mapNotNull(sequenceAsSequence, new Function1() { // from class: com.kubi.futures.trade.welfare.vm.c
                    @Override // p852kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return FuturesTrialViewModel$activateTrials$1.m28775f((FuturesWelfareComposeItemEntity) obj2);
                    }
                })) != null) {
                    Iterator it = sequenceMapNotNull.iterator();
                    do {
                        if (it.hasNext()) {
                            next = it.next();
                            futuresWelfareTrialItemEntity2 = (FuturesWelfareTrialItemEntity) next;
                            if (Intrinsics.areEqual(futuresWelfareTrialItemEntity2.getStatus(), "ACTIVATE_FINISHED")) {
                                break;
                            }
                        } else {
                            next = null;
                            break;
                        }
                    } while (!Intrinsics.areEqual(futuresWelfareTrialItemEntity2.getStatus(), "ACTIVATE"));
                    futuresWelfareTrialItemEntity = (FuturesWelfareTrialItemEntity) next;
                } else {
                    futuresWelfareTrialItemEntity = null;
                }
                if (futuresWelfareTrialItemEntity != null) {
                    this.this$0.m28766s().postValue(new Pair<>(Boxing.boxBoolean(false), futuresWelfareTrialItemEntity));
                } else {
                    Long longOrNull = StringsKt.toLongOrNull(this.$code);
                    if (longOrNull == null) {
                        this.this$0.m28770w().postValue(Boxing.boxBoolean(false));
                        return Unit.INSTANCE;
                    }
                    try {
                        RepositoryServiceLocator.f19236a.m20292k().mo100553A(new LeadTradingActivateTrialRequest(longOrNull.longValue(), null, 2, null));
                        this.this$0.m28766s().postValue(new Pair<>(Boxing.boxBoolean(true), null));
                        this.this$0.m28770w().postValue(Boxing.boxBoolean(false));
                    } catch (ApiException e11) {
                        this.this$0.m28755A().postValue(e11);
                        this.this$0.m28770w().postValue(Boxing.boxBoolean(false));
                        this.this$0.m28761j(e11);
                    }
                }
                return Unit.INSTANCE;
            }
            if (!this.$forceActivate) {
                futuresWelfareTrialEntityMo100558f = RepositoryServiceLocator.f19236a.m20292k().mo100558f("ACTIVATE_FINISHED", 1, 10, "ALL");
            } else {
                futuresWelfareTrialEntityMo100558f = null;
            }
            if (futuresWelfareTrialEntityMo100558f != null && (items = futuresWelfareTrialEntityMo100558f.getItems()) != null && !items.isEmpty()) {
                this.this$0.m28766s().postValue(new Pair<>(Boxing.boxBoolean(false), futuresWelfareTrialEntityMo100558f.getItems().get(0)));
            } else {
                try {
                    InterfaceC45544a.m100551n(RepositoryServiceLocator.f19236a.m20292k(), this.$code, null, 2, null);
                    this.this$0.m28766s().postValue(new Pair<>(Boxing.boxBoolean(true), null));
                    this.this$0.m28770w().postValue(Boxing.boxBoolean(false));
                } catch (ApiException e12) {
                    this.this$0.m28755A().postValue(e12);
                    this.this$0.m28770w().postValue(Boxing.boxBoolean(false));
                    this.this$0.m28761j(e12);
                }
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
