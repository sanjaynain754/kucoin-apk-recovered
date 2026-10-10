package com.kubi.home.v2.biz.kuming;

import com.kubi.home.api.HomeBizRepo;
import com.kubi.mvi.state.AbstractC19291m;
import com.kubi.mvi.state.InterfaceC19282d;
import com.kubi.mvi.state.InterfaceC19284f;
import java.util.concurrent.atomic.AtomicBoolean;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.SourceDebugExtension;
import sj.C44510a;
import y70.C46392a;

/* JADX INFO: compiled from: KuMiningWidgetVM.kt */
/* JADX INFO: loaded from: classes15.dex */
@Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0016\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0094@¢\u0006\u0002\u0010\u0014J\u000e\u0010\u0015\u001a\u00020\u0011H\u0082@¢\u0006\u0002\u0010\u0016R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\u00020\u00028TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0017"}, m90084d2 = {"Lcom/kubi/home/v2/biz/kuming/KuMiningWidgetVM;", "Lcom/kubi/mvi/state/SingleSimpleStateVM;", "Lcom/kubi/home/v2/biz/kuming/KuMiningWidgetContract$UIState;", "<init>", "()V", "repo", "Lcom/kubi/home/api/HomeBizRepo;", "getRepo", "()Lcom/kubi/home/api/HomeBizRepo;", "repo$delegate", "Lkotlin/Lazy;", "firstLoad", "Ljava/util/concurrent/atomic/AtomicBoolean;", "initState", "getInitState", "()Lcom/kubi/home/v2/biz/kuming/KuMiningWidgetContract$UIState;", "dispatchIntent", "", "intent", "Lcom/kubi/mvi/state/IIntent;", "(Lcom/kubi/mvi/state/IIntent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadData", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nKuMiningWidgetVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KuMiningWidgetVM.kt\ncom/kubi/home/v2/biz/kuming/KuMiningWidgetVM\n+ 2 BaseStateVM.kt\ncom/kubi/mvi/state/BaseStateVM\n+ 3 StorageIdEx.kt\ncom/kubi/utils/storage/StorageIdExKt\n+ 4 KVStore.kt\ncom/kubi/utils/storage/KVStore\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,43:1\n473#2,4:44\n153#3,2:48\n144#3,2:52\n178#4:50\n1#5:51\n*S KotlinDebug\n*F\n+ 1 KuMiningWidgetVM.kt\ncom/kubi/home/v2/biz/kuming/KuMiningWidgetVM\n*L\n26#1:44,4\n32#1:48,2\n37#1:52,2\n32#1:50\n*E\n"})
public final class KuMiningWidgetVM extends AbstractC19291m<KuMiningWidgetContract$UIState> {

    /* JADX INFO: renamed from: X */
    @NotNull
    public final Lazy f26463X = LazyKt.lazy(new Function0() { // from class: com.kubi.home.v2.biz.kuming.e
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return KuMiningWidgetVM.m30694s();
        }
    });

    /* JADX INFO: renamed from: Y */
    @NotNull
    public final AtomicBoolean f26464Y = new AtomicBoolean(true);

    /* JADX INFO: renamed from: com.kubi.home.v2.biz.kuming.KuMiningWidgetVM$dispatchIntent$1 */
    /* JADX INFO: compiled from: KuMiningWidgetVM.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.home.v2.biz.kuming.KuMiningWidgetVM", m90122f = "KuMiningWidgetVM.kt", m90123i = {0, 0, 0, 0, 0, 0}, m90124l = {26}, m90125m = "dispatchIntent", m90126n = {"intent", "this_$iv", "$this$checkIntent$iv", "it", "$i$f$checkIntent", "$i$a$-checkIntent-KuMiningWidgetVM$dispatchIntent$2"}, m90127s = {"L$0", "L$1", "L$2", "L$3", "I$0", "I$1"})
    public static final class C149681 extends ContinuationImpl {
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        public C149681(Continuation<? super C149681> continuation) {
            super(continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return KuMiningWidgetVM.this.dispatchIntent(null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: r */
    public final Object m30693r(Continuation<? super Unit> continuation) {
        KuMiningWidgetVM$loadData$1 kuMiningWidgetVM$loadData$1;
        if (continuation instanceof KuMiningWidgetVM$loadData$1) {
            kuMiningWidgetVM$loadData$1 = (KuMiningWidgetVM$loadData$1) continuation;
            int i11 = kuMiningWidgetVM$loadData$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                kuMiningWidgetVM$loadData$1.label = i11 - Integer.MIN_VALUE;
            } else {
                kuMiningWidgetVM$loadData$1 = new KuMiningWidgetVM$loadData$1(this, continuation);
            }
        } else {
            kuMiningWidgetVM$loadData$1 = new KuMiningWidgetVM$loadData$1(this, continuation);
        }
        Object objM28941d = kuMiningWidgetVM$loadData$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = kuMiningWidgetVM$loadData$1.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objM28941d);
            boolean zCompareAndSet = this.f26464Y.compareAndSet(true, false);
            if (zCompareAndSet) {
                KuMiningDataEntity kuMiningDataEntity = (KuMiningDataEntity) C46392a.f104043a.m102336j(C44510a.f98560a.m98477c(), KuMiningDataEntity.class, null);
                if (kuMiningDataEntity != null) {
                    send(new C14972d(kuMiningDataEntity));
                }
            }
            HomeBizRepo homeBizRepoM30696q = m30696q();
            kuMiningWidgetVM$loadData$1.Z$0 = zCompareAndSet;
            kuMiningWidgetVM$loadData$1.label = 1;
            objM28941d = homeBizRepoM30696q.m28941d(kuMiningWidgetVM$loadData$1);
            if (objM28941d == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objM28941d);
        }
        KuMiningDataEntity kuMiningDataEntity2 = (KuMiningDataEntity) objM28941d;
        if (kuMiningDataEntity2 != null) {
            C46392a.m102331n(C44510a.f98560a.m98477c(), kuMiningDataEntity2);
        }
        send(new C14972d(kuMiningDataEntity2));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: s */
    public static final HomeBizRepo m30694s() {
        return new HomeBizRepo();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.kubi.mvi.state.BaseStateVM
    @Nullable
    public Object dispatchIntent(@NotNull InterfaceC19282d interfaceC19282d, @NotNull Continuation<? super Unit> continuation) {
        C149681 c149681;
        if (continuation instanceof C149681) {
            c149681 = (C149681) continuation;
            int i11 = c149681.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c149681.label = i11 - Integer.MIN_VALUE;
            } else {
                c149681 = new C149681(continuation);
            }
        } else {
            c149681 = new C149681(continuation);
        }
        Object obj = c149681.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c149681.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(obj);
            if (interfaceC19282d instanceof KuMiningWidgetContract$UiIntent.LoadData) {
                c149681.L$0 = SpillingKt.nullOutSpilledVariable(interfaceC19282d);
                c149681.L$1 = SpillingKt.nullOutSpilledVariable(this);
                c149681.L$2 = interfaceC19282d;
                c149681.L$3 = SpillingKt.nullOutSpilledVariable((KuMiningWidgetContract$UiIntent.LoadData) interfaceC19282d);
                c149681.I$0 = 0;
                c149681.I$1 = 0;
                c149681.label = 1;
                if (m30693r(c149681) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.kubi.home.v2.biz.kuming.KuMiningWidgetContract$UIState] */
    @Override // com.kubi.mvi.state.BaseStateVM
    @NotNull
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public KuMiningWidgetContract$UIState getInitState() {
        return new InterfaceC19284f() { // from class: com.kubi.home.v2.biz.kuming.KuMiningWidgetContract$UIState
        };
    }

    /* JADX INFO: renamed from: q */
    public final HomeBizRepo m30696q() {
        return (HomeBizRepo) this.f26463X.getValue();
    }
}
