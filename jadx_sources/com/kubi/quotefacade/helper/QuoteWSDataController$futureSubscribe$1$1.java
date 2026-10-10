package com.kubi.quotefacade.helper;

import com.kubi.data.entity.WsFutureSnapshotEntity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.AbstractC41697j0;
import kotlinx.coroutines.C41686h;
import kotlinx.coroutines.InterfaceC41709m0;
import o00.C42911a;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: QuoteWSDataController.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.quotefacade.helper.QuoteWSDataController$futureSubscribe$1$1", m90122f = "QuoteWSDataController.kt", m90123i = {}, m90124l = {37}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class QuoteWSDataController$futureSubscribe$1$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ List<WsFutureSnapshotEntity> $data;
    final /* synthetic */ Function1<List<com.kubi.quotefacade.entity.WsFutureSnapshotEntity>, Unit> $function;
    int label;

    /* JADX INFO: renamed from: com.kubi.quotefacade.helper.QuoteWSDataController$futureSubscribe$1$1$1 */
    /* JADX INFO: compiled from: QuoteWSDataController.kt */
    @Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.quotefacade.helper.QuoteWSDataController$futureSubscribe$1$1$1", m90122f = "QuoteWSDataController.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    @SourceDebugExtension({"SMAP\nQuoteWSDataController.kt\nKotlin\n*S Kotlin\n*F\n+ 1 QuoteWSDataController.kt\ncom/kubi/quotefacade/helper/QuoteWSDataController$futureSubscribe$1$1$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,83:1\n1563#2:84\n1634#2,3:85\n*S KotlinDebug\n*F\n+ 1 QuoteWSDataController.kt\ncom/kubi/quotefacade/helper/QuoteWSDataController$futureSubscribe$1$1$1\n*L\n38#1:84\n38#1:85,3\n*E\n"})
    public static final class C221291 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
        final /* synthetic */ List<WsFutureSnapshotEntity> $data;
        final /* synthetic */ Function1<List<com.kubi.quotefacade.entity.WsFutureSnapshotEntity>, Unit> $function;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C221291(Function1<? super List<com.kubi.quotefacade.entity.WsFutureSnapshotEntity>, Unit> function1, List<WsFutureSnapshotEntity> list, Continuation<? super C221291> continuation) {
            super(2, continuation);
            this.$function = function1;
            this.$data = list;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C221291(this.$function, this.$data, continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
            return ((C221291) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                Function1<List<com.kubi.quotefacade.entity.WsFutureSnapshotEntity>, Unit> function1 = this.$function;
                List<WsFutureSnapshotEntity> list = this.$data;
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(C22206s2.m52113b((WsFutureSnapshotEntity) it.next()));
                }
                function1.invoke(arrayList);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public QuoteWSDataController$futureSubscribe$1$1(Function1<? super List<com.kubi.quotefacade.entity.WsFutureSnapshotEntity>, Unit> function1, List<WsFutureSnapshotEntity> list, Continuation<? super QuoteWSDataController$futureSubscribe$1$1> continuation) {
        super(2, continuation);
        this.$function = function1;
        this.$data = list;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new QuoteWSDataController$futureSubscribe$1$1(this.$function, this.$data, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((QuoteWSDataController$futureSubscribe$1$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
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
            AbstractC41697j0 abstractC41697j0M94120b = C42911a.m94120b();
            C221291 c221291 = new C221291(this.$function, this.$data, null);
            this.label = 1;
            if (C41686h.m91049g(abstractC41697j0M94120b, c221291, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
