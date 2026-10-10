package com.kubi.copytrading;

import com.kubi.copytrading.entity.LeadUserEntity;
import com.kubi.copytrading.futures.FutureCopyTradingConfig;
import com.kubi.network.retrofit.utils.RetrofitFlowExKt;
import com.kubi.utils.C27099x;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.flow.InterfaceC41634e;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import y70.C46396e;

/* JADX INFO: compiled from: CopyTradingConfig.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.copytrading.CopyTradingConfig$fetchCopytdAccountInfo$1", m90122f = "CopyTradingConfig.kt", m90123i = {}, m90124l = {137}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class CopyTradingConfig$fetchCopytdAccountInfo$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    int label;

    /* JADX INFO: renamed from: com.kubi.copytrading.CopyTradingConfig$fetchCopytdAccountInfo$1$1 */
    /* JADX INFO: compiled from: CopyTradingConfig.kt */
    @Metadata(m90083d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", "", "Lcom/kubi/copytrading/entity/LeadUserEntity;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.copytrading.CopyTradingConfig$fetchCopytdAccountInfo$1$1", m90122f = "CopyTradingConfig.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    @SourceDebugExtension({"SMAP\nCopyTradingConfig.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CopyTradingConfig.kt\ncom/kubi/copytrading/CopyTradingConfig$fetchCopytdAccountInfo$1$1\n+ 2 JsonEx.kt\ncom/kubi/utils/extensions/JsonExKt\n+ 3 MMKVHelper.kt\ncom/kubi/utils/storage/MMKVHelperKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,310:1\n35#2,3:311\n211#3,2:314\n1#4:316\n*S KotlinDebug\n*F\n+ 1 CopyTradingConfig.kt\ncom/kubi/copytrading/CopyTradingConfig$fetchCopytdAccountInfo$1$1\n*L\n140#1:311,3\n140#1:314,2\n*E\n"})
    public static final class C114331 extends SuspendLambda implements Function2<List<? extends LeadUserEntity>, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        public C114331(Continuation<? super C114331> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(List<? extends LeadUserEntity> list, Continuation<? super Unit> continuation) {
            return invoke2((List<LeadUserEntity>) list, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C114331 c114331 = new C114331(continuation);
            c114331.L$0 = obj;
            return c114331;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(List<LeadUserEntity> list, Continuation<? super Unit> continuation) {
            return ((C114331) create(list, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            String strM66919i;
            Object next;
            String uid;
            LeadUserEntity leadUserEntity;
            List list = (List) this.L$0;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            CopyTradingConfig.f19714e.clear();
            CopyTradingConfig.f19714e.addAll(list);
            CopyOnWriteArrayList copyOnWriteArrayList = CopyTradingConfig.f19714e;
            if (copyOnWriteArrayList == null || (strM66919i = C27099x.m66919i(copyOnWriteArrayList, false, 2, null)) == null) {
                strM66919i = "";
            }
            C46396e.m102358o("copyTrading", CopyTradingConfig.f19710a.m20603t(), strM66919i);
            if (CopyTradingConfig.f19715f == null) {
                CopyTradingConfig.f19715f = (LeadUserEntity) CollectionsKt.firstOrNull((List) CopyTradingConfig.f19714e);
            }
            Iterator it = CopyTradingConfig.f19714e.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                uid = ((LeadUserEntity) next).getUid();
                leadUserEntity = CopyTradingConfig.f19715f;
            } while (!Intrinsics.areEqual(uid, leadUserEntity != null ? leadUserEntity.getUid() : null));
            LeadUserEntity leadUserEntity2 = (LeadUserEntity) next;
            if (leadUserEntity2 == null) {
                leadUserEntity2 = (LeadUserEntity) CollectionsKt.firstOrNull((List) CopyTradingConfig.f19714e);
            }
            Pair pair = new Pair(CopyTradingConfig.f19715f, leadUserEntity2);
            CopyTradingConfig.f19715f = leadUserEntity2;
            CopyTradingConfig.f19713d.setValue(pair);
            String strM20876k = FutureCopyTradingConfig.f19902a.m20876k();
            String str = strM20876k.length() > 0 ? strM20876k : null;
            if (str != null) {
                CopyTradingConfig.f19710a.m20598o(str);
            }
            return Unit.INSTANCE;
        }
    }

    public CopyTradingConfig$fetchCopytdAccountInfo$1(Continuation<? super CopyTradingConfig$fetchCopytdAccountInfo$1> continuation) {
        super(2, continuation);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CopyTradingConfig$fetchCopytdAccountInfo$1(continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((CopyTradingConfig$fetchCopytdAccountInfo$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
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
            InterfaceC41634e<List<LeadUserEntity>> interfaceC41634eM20829h = CopyTradingConfig.f19710a.m20601r().m20829h();
            C114331 c114331 = new C114331(null);
            this.label = 1;
            if (RetrofitFlowExKt.m42823d(interfaceC41634eM20829h, false, c114331, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
