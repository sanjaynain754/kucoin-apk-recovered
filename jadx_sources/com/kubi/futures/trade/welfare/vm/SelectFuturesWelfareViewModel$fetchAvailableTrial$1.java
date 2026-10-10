package com.kubi.futures.trade.welfare.vm;

import androidx.lifecycle.MutableLiveData;
import com.kubi.broker.RepositoryServiceLocator;
import com.kubi.futures.compliance.leverage.EuropeUnlockLeverageProcessor;
import com.kubi.kumex.data.platform.model.FuturesWelfareComposeEntity;
import com.kubi.kumex.data.platform.model.FuturesWelfareComposeItemEntity;
import com.kubi.kumex.data.platform.model.FuturesWelfareTrialEntity;
import com.kubi.kumex.data.platform.model.FuturesWelfareTrialItemEntity;
import com.kubi.kumex.utils.CoroutineExKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.Metadata;
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

/* JADX INFO: compiled from: SelectFuturesWelfareViewModel.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.futures.trade.welfare.vm.SelectFuturesWelfareViewModel$fetchAvailableTrial$1", m90122f = "SelectFuturesWelfareViewModel.kt", m90123i = {}, m90124l = {488}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class SelectFuturesWelfareViewModel$fetchAvailableTrial$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $symbol;
    int label;
    final /* synthetic */ SelectFuturesWelfareViewModel this$0;

    /* JADX INFO: renamed from: com.kubi.futures.trade.welfare.vm.SelectFuturesWelfareViewModel$fetchAvailableTrial$1$1 */
    /* JADX INFO: compiled from: SelectFuturesWelfareViewModel.kt */
    @Metadata(m90083d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m90084d2 = {"<anonymous>", ""}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.futures.trade.welfare.vm.SelectFuturesWelfareViewModel$fetchAvailableTrial$1$1", m90122f = "SelectFuturesWelfareViewModel.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    @SourceDebugExtension({"SMAP\nSelectFuturesWelfareViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SelectFuturesWelfareViewModel.kt\ncom/kubi/futures/trade/welfare/vm/SelectFuturesWelfareViewModel$fetchAvailableTrial$1$1\n+ 2 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,547:1\n183#2,2:548\n1869#3,2:550\n*S KotlinDebug\n*F\n+ 1 SelectFuturesWelfareViewModel.kt\ncom/kubi/futures/trade/welfare/vm/SelectFuturesWelfareViewModel$fetchAvailableTrial$1$1\n*L\n495#1:548,2\n506#1:550,2\n*E\n"})
    public static final class C144231 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
        final /* synthetic */ String $symbol;
        int label;
        final /* synthetic */ SelectFuturesWelfareViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C144231(SelectFuturesWelfareViewModel selectFuturesWelfareViewModel, String str, Continuation<? super C144231> continuation) {
            super(1, continuation);
            this.this$0 = selectFuturesWelfareViewModel;
            this.$symbol = str;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return new C144231(this.this$0, this.$symbol, continuation);
        }

        @Override // p852kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super Unit> continuation) {
            return ((C144231) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX INFO: renamed from: f */
        public static final FuturesWelfareTrialItemEntity m28806f(FuturesWelfareComposeItemEntity futuresWelfareComposeItemEntity) {
            return futuresWelfareComposeItemEntity.toTrial();
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            List<FuturesWelfareTrialItemEntity> items;
            ArrayList<FuturesWelfareComposeItemEntity> items2;
            Sequence sequenceAsSequence;
            Sequence sequenceMapNotNull;
            Object next;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                if (this.this$0.m28802z()) {
                    FuturesWelfareComposeEntity futuresWelfareComposeEntityMo100570x = RepositoryServiceLocator.f19236a.m20292k().mo100570x();
                    if (futuresWelfareComposeEntityMo100570x != null && (items2 = futuresWelfareComposeEntityMo100570x.getItems()) != null && (sequenceAsSequence = CollectionsKt.asSequence(items2)) != null && (sequenceMapNotNull = SequencesKt.mapNotNull(sequenceAsSequence, new Function1() { // from class: com.kubi.futures.trade.welfare.vm.f
                        @Override // p852kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return SelectFuturesWelfareViewModel$fetchAvailableTrial$1.C144231.m28806f((FuturesWelfareComposeItemEntity) obj2);
                        }
                    })) != null) {
                        SelectFuturesWelfareViewModel selectFuturesWelfareViewModel = this.this$0;
                        String str = this.$symbol;
                        Iterator it = sequenceMapNotNull.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                next = it.next();
                                FuturesWelfareTrialItemEntity futuresWelfareTrialItemEntity = (FuturesWelfareTrialItemEntity) next;
                                if (Intrinsics.areEqual(futuresWelfareTrialItemEntity.getStatus(), "ACTIVATE_FINISHED") && selectFuturesWelfareViewModel.m28780A(futuresWelfareTrialItemEntity, str)) {
                                    break;
                                }
                            } else {
                                next = null;
                                break;
                            }
                        }
                        if (((FuturesWelfareTrialItemEntity) next) != null) {
                            SelectFuturesWelfareViewModel selectFuturesWelfareViewModel2 = this.this$0;
                            selectFuturesWelfareViewModel2.m28796t().postValue(Boxing.boxBoolean(false));
                            selectFuturesWelfareViewModel2.m28794r().postValue(Boxing.boxBoolean(true));
                            return Unit.INSTANCE;
                        }
                    }
                } else {
                    FuturesWelfareTrialEntity futuresWelfareTrialEntityMo100558f = RepositoryServiceLocator.f19236a.m20292k().mo100558f("ACTIVATE_FINISHED", 1, 10, "ALL");
                    if (futuresWelfareTrialEntityMo100558f != null && (items = futuresWelfareTrialEntityMo100558f.getItems()) != null) {
                        SelectFuturesWelfareViewModel selectFuturesWelfareViewModel3 = this.this$0;
                        String str2 = this.$symbol;
                        Iterator<T> it2 = items.iterator();
                        while (it2.hasNext()) {
                            if (selectFuturesWelfareViewModel3.m28780A((FuturesWelfareTrialItemEntity) it2.next(), str2)) {
                                selectFuturesWelfareViewModel3.m28796t().postValue(Boxing.boxBoolean(false));
                                selectFuturesWelfareViewModel3.m28794r().postValue(Boxing.boxBoolean(true));
                                return Unit.INSTANCE;
                            }
                        }
                    }
                }
                this.this$0.m28796t().postValue(Boxing.boxBoolean(false));
                this.this$0.m28794r().postValue(Boxing.boxBoolean(false));
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectFuturesWelfareViewModel$fetchAvailableTrial$1(SelectFuturesWelfareViewModel selectFuturesWelfareViewModel, String str, Continuation<? super SelectFuturesWelfareViewModel$fetchAvailableTrial$1> continuation) {
        super(2, continuation);
        this.this$0 = selectFuturesWelfareViewModel;
        this.$symbol = str;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SelectFuturesWelfareViewModel$fetchAvailableTrial$1(this.this$0, this.$symbol, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((SelectFuturesWelfareViewModel$fetchAvailableTrial$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: f */
    public static final Unit m28804f(SelectFuturesWelfareViewModel selectFuturesWelfareViewModel, Throwable th2) {
        MutableLiveData<Boolean> mutableLiveDataM28794r = selectFuturesWelfareViewModel.m28794r();
        Boolean bool = Boolean.FALSE;
        mutableLiveDataM28794r.postValue(bool);
        selectFuturesWelfareViewModel.m28796t().postValue(bool);
        EuropeUnlockLeverageProcessor.f22643a.m24701h();
        return Unit.INSTANCE;
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
            C144231 c144231 = new C144231(this.this$0, this.$symbol, null);
            final SelectFuturesWelfareViewModel selectFuturesWelfareViewModel = this.this$0;
            Function1 function1 = new Function1() { // from class: com.kubi.futures.trade.welfare.vm.e
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return SelectFuturesWelfareViewModel$fetchAvailableTrial$1.m28804f(selectFuturesWelfareViewModel, (Throwable) obj2);
                }
            };
            this.label = 1;
            if (CoroutineExKt.m36471a(c144231, function1, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
