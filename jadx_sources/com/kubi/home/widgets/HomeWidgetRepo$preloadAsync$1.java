package com.kubi.home.widgets;

import com.kubi.home.entity.HomeGridNavigationEntity;
import com.kubi.home.entity.WidgetBannerEntity;
import com.kubi.home.entity.WidgetRecommendEntity;
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

/* JADX INFO: compiled from: HomeWidgetRepo.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.home.widgets.HomeWidgetRepo$preloadAsync$1", m90122f = "HomeWidgetRepo.kt", m90123i = {0}, m90124l = {46}, m90125m = "invokeSuspend", m90126n = {"$this$launch"}, m90127s = {"L$0"})
public final class HomeWidgetRepo$preloadAsync$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ HomeWidgetRepo this$0;

    /* JADX INFO: renamed from: com.kubi.home.widgets.HomeWidgetRepo$preloadAsync$1$1 */
    /* JADX INFO: compiled from: HomeWidgetRepo.kt */
    @Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "Lcom/kubi/home/entity/HomeGridNavigationEntity;", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.home.widgets.HomeWidgetRepo$preloadAsync$1$1", m90122f = "HomeWidgetRepo.kt", m90123i = {}, m90124l = {43, 43}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C150771 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super HomeGridNavigationEntity>, Object> {
        int label;
        final /* synthetic */ HomeWidgetRepo this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C150771(HomeWidgetRepo homeWidgetRepo, Continuation<? super C150771> continuation) {
            super(2, continuation);
            this.this$0 = homeWidgetRepo;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C150771(this.this$0, continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super HomeGridNavigationEntity> continuation) {
            return ((C150771) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x0039, code lost:
        
            if (r5 == r0) goto L17;
         */
        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.label;
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 == 2) {
                        ResultKt.throwOnFailure(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                }
                return (HomeGridNavigationEntity) obj;
            }
            ResultKt.throwOnFailure(obj);
            HomeWidgetRepo homeWidgetRepo = this.this$0;
            this.label = 1;
            obj = homeWidgetRepo.m31070d(this);
            if (obj != coroutine_suspended) {
            }
            return coroutine_suspended;
            HomeGridNavigationEntity homeGridNavigationEntity = (HomeGridNavigationEntity) obj;
            if (homeGridNavigationEntity == null) {
                HomeWidgetRepo homeWidgetRepo2 = this.this$0;
                this.label = 2;
                obj = homeWidgetRepo2.m31074h(null, this);
            } else {
                return homeGridNavigationEntity;
            }
        }
    }

    /* JADX INFO: renamed from: com.kubi.home.widgets.HomeWidgetRepo$preloadAsync$1$2 */
    /* JADX INFO: compiled from: HomeWidgetRepo.kt */
    @Metadata(m90083d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0001*\u00020\u0003H\n"}, m90084d2 = {"<anonymous>", "", "Lcom/kubi/home/entity/WidgetBannerEntity;", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.home.widgets.HomeWidgetRepo$preloadAsync$1$2", m90122f = "HomeWidgetRepo.kt", m90123i = {}, m90124l = {44, 44}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C150782 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super List<? extends WidgetBannerEntity>>, Object> {
        int label;
        final /* synthetic */ HomeWidgetRepo this$0;

        @Override // p852kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super List<? extends WidgetBannerEntity>> continuation) {
            return invoke2(interfaceC41709m0, (Continuation<? super List<WidgetBannerEntity>>) continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C150782(HomeWidgetRepo homeWidgetRepo, Continuation<? super C150782> continuation) {
            super(2, continuation);
            this.this$0 = homeWidgetRepo;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C150782(this.this$0, continuation);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(InterfaceC41709m0 interfaceC41709m0, Continuation<? super List<WidgetBannerEntity>> continuation) {
            return ((C150782) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x0039, code lost:
        
            if (r5 == r0) goto L17;
         */
        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.label;
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 == 2) {
                        ResultKt.throwOnFailure(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                }
                return (List) obj;
            }
            ResultKt.throwOnFailure(obj);
            HomeWidgetRepo homeWidgetRepo = this.this$0;
            this.label = 1;
            obj = homeWidgetRepo.m31069c(this);
            if (obj != coroutine_suspended) {
            }
            return coroutine_suspended;
            List list = (List) obj;
            if (list == null) {
                HomeWidgetRepo homeWidgetRepo2 = this.this$0;
                this.label = 2;
                obj = homeWidgetRepo2.m31073g(null, this);
            } else {
                return list;
            }
        }
    }

    /* JADX INFO: renamed from: com.kubi.home.widgets.HomeWidgetRepo$preloadAsync$1$3 */
    /* JADX INFO: compiled from: HomeWidgetRepo.kt */
    @Metadata(m90083d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0001*\u00020\u0003H\n"}, m90084d2 = {"<anonymous>", "", "Lcom/kubi/home/entity/WidgetRecommendEntity;", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.home.widgets.HomeWidgetRepo$preloadAsync$1$3", m90122f = "HomeWidgetRepo.kt", m90123i = {}, m90124l = {45, 45}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C150793 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super List<? extends WidgetRecommendEntity>>, Object> {
        int label;
        final /* synthetic */ HomeWidgetRepo this$0;

        @Override // p852kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super List<? extends WidgetRecommendEntity>> continuation) {
            return invoke2(interfaceC41709m0, (Continuation<? super List<WidgetRecommendEntity>>) continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C150793(HomeWidgetRepo homeWidgetRepo, Continuation<? super C150793> continuation) {
            super(2, continuation);
            this.this$0 = homeWidgetRepo;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C150793(this.this$0, continuation);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(InterfaceC41709m0 interfaceC41709m0, Continuation<? super List<WidgetRecommendEntity>> continuation) {
            return ((C150793) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x0039, code lost:
        
            if (r5 == r0) goto L17;
         */
        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.label;
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 == 2) {
                        ResultKt.throwOnFailure(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                }
                return (List) obj;
            }
            ResultKt.throwOnFailure(obj);
            HomeWidgetRepo homeWidgetRepo = this.this$0;
            this.label = 1;
            obj = homeWidgetRepo.m31071e(this);
            if (obj != coroutine_suspended) {
            }
            return coroutine_suspended;
            List list = (List) obj;
            if (list == null) {
                HomeWidgetRepo homeWidgetRepo2 = this.this$0;
                this.label = 2;
                obj = homeWidgetRepo2.m31075i(null, this);
            } else {
                return list;
            }
        }
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        InterfaceC41709m0 interfaceC41709m0 = (InterfaceC41709m0) this.L$0;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        if (i11 == 0) {
            ResultKt.throwOnFailure(obj);
            List listListOf = CollectionsKt.listOf((Object[]) new InterfaceC41729r0[]{C41696j.m91102b(interfaceC41709m0, null, null, new C150771(this.this$0, null), 3, null), C41696j.m91102b(interfaceC41709m0, null, null, new C150782(this.this$0, null), 3, null), C41696j.m91102b(interfaceC41709m0, null, null, new C150793(this.this$0, null), 3, null)});
            this.L$0 = SpillingKt.nullOutSpilledVariable(interfaceC41709m0);
            this.label = 1;
            if (AwaitKt.m90345a(listListOf, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomeWidgetRepo$preloadAsync$1(HomeWidgetRepo homeWidgetRepo, Continuation<? super HomeWidgetRepo$preloadAsync$1> continuation) {
        super(2, continuation);
        this.this$0 = homeWidgetRepo;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        HomeWidgetRepo$preloadAsync$1 homeWidgetRepo$preloadAsync$1 = new HomeWidgetRepo$preloadAsync$1(this.this$0, continuation);
        homeWidgetRepo$preloadAsync$1.L$0 = obj;
        return homeWidgetRepo$preloadAsync$1;
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((HomeWidgetRepo$preloadAsync$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
