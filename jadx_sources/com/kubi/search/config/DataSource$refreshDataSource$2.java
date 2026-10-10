package com.kubi.search.config;

import com.kubi.search.utils.SearchExKt;
import gf.C37890n;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import java.util.List;
import kotlinx.coroutines.AwaitKt;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.InterfaceC41729r0;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: DataSource.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001*\u00020\u0003H\n"}, m90084d2 = {"<anonymous>", "", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.search.config.DataSource$refreshDataSource$2", m90122f = "DataSource.kt", m90123i = {0}, m90124l = {68}, m90125m = "invokeSuspend", m90126n = {"$this$withContext"}, m90127s = {"L$0"})
public final class DataSource$refreshDataSource$2 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super List<? extends Object>>, Object> {
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: renamed from: com.kubi.search.config.DataSource$refreshDataSource$2$1 */
    /* JADX INFO: compiled from: DataSource.kt */
    @Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "Lio/reactivex/disposables/Disposable;", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.search.config.DataSource$refreshDataSource$2$1", m90122f = "DataSource.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C243581 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Disposable>, Object> {
        int label;

        public C243581(Continuation<? super C243581> continuation) {
            super(2, continuation);
        }

        /* JADX INFO: renamed from: f */
        public static final void m59117f(List list) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("[refreshDataSource]getTradeBeanList,isFirstLoad=");
            sb2.append(DataSource.f48858d);
            sb2.append(",spotList:");
            sb2.append(list != null ? Integer.valueOf(list.size()) : null);
            SearchExKt.m59511E(sb2.toString());
            if (list != null && !list.isEmpty()) {
                DataSource dataSource = DataSource.f48855a;
                dataSource.m59114f().clear();
                dataSource.m59114f().addAll(list);
            }
            DataSource.f48858d = false;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C243581(continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Disposable> continuation) {
            return ((C243581) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                return C37890n.f85269a.mo85594g(new Consumer() { // from class: com.kubi.search.config.a
                    @Override // io.reactivex.functions.Consumer
                    public final void accept(Object obj2) {
                        DataSource$refreshDataSource$2.C243581.m59117f((List) obj2);
                    }
                }, DataSource.f48858d);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: renamed from: com.kubi.search.config.DataSource$refreshDataSource$2$2 */
    /* JADX INFO: compiled from: DataSource.kt */
    @Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.search.config.DataSource$refreshDataSource$2$2", m90122f = "DataSource.kt", m90123i = {}, m90124l = {62}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C243592 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
        int label;

        public C243592(Continuation<? super C243592> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C243592(continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
            return ((C243592) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
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
                DataSource dataSource = DataSource.f48855a;
                this.label = 1;
                obj = dataSource.m59112d(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            List list = (List) obj;
            if (!list.isEmpty()) {
                DataSource dataSource2 = DataSource.f48855a;
                dataSource2.m59113e().clear();
                dataSource2.m59113e().addAll(list);
            }
            SearchExKt.m59511E("[refreshDataSource]fetchFuturesData,futureList:" + DataSource.f48855a.m59113e().size());
            return Unit.INSTANCE;
        }
    }

    public DataSource$refreshDataSource$2(Continuation<? super DataSource$refreshDataSource$2> continuation) {
        super(2, continuation);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        InterfaceC41709m0 interfaceC41709m0 = (InterfaceC41709m0) this.L$0;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return obj;
        }
        ResultKt.throwOnFailure(obj);
        List listListOf = CollectionsKt.listOf((Object[]) new InterfaceC41729r0[]{C41696j.m91102b(interfaceC41709m0, null, null, new C243581(null), 3, null), C41696j.m91102b(interfaceC41709m0, null, null, new C243592(null), 3, null)});
        this.L$0 = SpillingKt.nullOutSpilledVariable(interfaceC41709m0);
        this.label = 1;
        Object objM90345a = AwaitKt.m90345a(listListOf, this);
        return objM90345a == coroutine_suspended ? coroutine_suspended : objM90345a;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        DataSource$refreshDataSource$2 dataSource$refreshDataSource$2 = new DataSource$refreshDataSource$2(continuation);
        dataSource$refreshDataSource$2.L$0 = obj;
        return dataSource$refreshDataSource$2;
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super List<? extends Object>> continuation) {
        return ((DataSource$refreshDataSource$2) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
