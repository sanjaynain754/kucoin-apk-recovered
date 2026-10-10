package com.kubi.quotefacade.widgets;

import com.kubi.quotefacade.entity.ChanceGemBoxEntity;
import com.kubi.quotefacade.entity.ChancePlateItem;
import com.kubi.quotefacade.entity.RiseFallEntity;
import com.kubi.quotefacade.entity.WidgetFearGreedEntity;
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

/* JADX INFO: compiled from: QuoteWidgetsRepo.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.quotefacade.widgets.QuoteWidgetsRepo$preloadAsync$1", m90122f = "QuoteWidgetsRepo.kt", m90123i = {0}, m90124l = {63}, m90125m = "invokeSuspend", m90126n = {"$this$launch"}, m90127s = {"L$0"})
public final class QuoteWidgetsRepo$preloadAsync$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ QuoteWidgetsRepo this$0;

    /* JADX INFO: renamed from: com.kubi.quotefacade.widgets.QuoteWidgetsRepo$preloadAsync$1$1 */
    /* JADX INFO: compiled from: QuoteWidgetsRepo.kt */
    @Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "Lcom/kubi/quotefacade/entity/ChanceGemBoxEntity;", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.quotefacade.widgets.QuoteWidgetsRepo$preloadAsync$1$1", m90122f = "QuoteWidgetsRepo.kt", m90123i = {}, m90124l = {59, 59}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C225981 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super ChanceGemBoxEntity>, Object> {
        int label;
        final /* synthetic */ QuoteWidgetsRepo this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C225981(QuoteWidgetsRepo quoteWidgetsRepo, Continuation<? super C225981> continuation) {
            super(2, continuation);
            this.this$0 = quoteWidgetsRepo;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C225981(this.this$0, continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super ChanceGemBoxEntity> continuation) {
            return ((C225981) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x0038, code lost:
        
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
                return (ChanceGemBoxEntity) obj;
            }
            ResultKt.throwOnFailure(obj);
            QuoteWidgetsRepo quoteWidgetsRepo = this.this$0;
            this.label = 1;
            obj = quoteWidgetsRepo.m53336e(this);
            if (obj != coroutine_suspended) {
            }
            return coroutine_suspended;
            ChanceGemBoxEntity chanceGemBoxEntity = (ChanceGemBoxEntity) obj;
            if (chanceGemBoxEntity == null) {
                QuoteWidgetsRepo quoteWidgetsRepo2 = this.this$0;
                this.label = 2;
                obj = quoteWidgetsRepo2.m53341j(this);
            } else {
                return chanceGemBoxEntity;
            }
        }
    }

    /* JADX INFO: renamed from: com.kubi.quotefacade.widgets.QuoteWidgetsRepo$preloadAsync$1$2 */
    /* JADX INFO: compiled from: QuoteWidgetsRepo.kt */
    @Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "Lcom/kubi/quotefacade/entity/RiseFallEntity;", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.quotefacade.widgets.QuoteWidgetsRepo$preloadAsync$1$2", m90122f = "QuoteWidgetsRepo.kt", m90123i = {}, m90124l = {60, 60}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C225992 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super RiseFallEntity>, Object> {
        int label;
        final /* synthetic */ QuoteWidgetsRepo this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C225992(QuoteWidgetsRepo quoteWidgetsRepo, Continuation<? super C225992> continuation) {
            super(2, continuation);
            this.this$0 = quoteWidgetsRepo;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C225992(this.this$0, continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super RiseFallEntity> continuation) {
            return ((C225992) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x0038, code lost:
        
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
                return (RiseFallEntity) obj;
            }
            ResultKt.throwOnFailure(obj);
            QuoteWidgetsRepo quoteWidgetsRepo = this.this$0;
            this.label = 1;
            obj = quoteWidgetsRepo.m53338g(this);
            if (obj != coroutine_suspended) {
            }
            return coroutine_suspended;
            RiseFallEntity riseFallEntity = (RiseFallEntity) obj;
            if (riseFallEntity == null) {
                QuoteWidgetsRepo quoteWidgetsRepo2 = this.this$0;
                this.label = 2;
                obj = quoteWidgetsRepo2.m53343l(this);
            } else {
                return riseFallEntity;
            }
        }
    }

    /* JADX INFO: renamed from: com.kubi.quotefacade.widgets.QuoteWidgetsRepo$preloadAsync$1$3 */
    /* JADX INFO: compiled from: QuoteWidgetsRepo.kt */
    @Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "Lcom/kubi/quotefacade/entity/WidgetFearGreedEntity;", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.quotefacade.widgets.QuoteWidgetsRepo$preloadAsync$1$3", m90122f = "QuoteWidgetsRepo.kt", m90123i = {}, m90124l = {61, 61}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C226003 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super WidgetFearGreedEntity>, Object> {
        int label;
        final /* synthetic */ QuoteWidgetsRepo this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C226003(QuoteWidgetsRepo quoteWidgetsRepo, Continuation<? super C226003> continuation) {
            super(2, continuation);
            this.this$0 = quoteWidgetsRepo;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C226003(this.this$0, continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super WidgetFearGreedEntity> continuation) {
            return ((C226003) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
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
                return (WidgetFearGreedEntity) obj;
            }
            ResultKt.throwOnFailure(obj);
            QuoteWidgetsRepo quoteWidgetsRepo = this.this$0;
            this.label = 1;
            obj = quoteWidgetsRepo.m53335d(this);
            if (obj != coroutine_suspended) {
            }
            return coroutine_suspended;
            WidgetFearGreedEntity widgetFearGreedEntity = (WidgetFearGreedEntity) obj;
            if (widgetFearGreedEntity == null) {
                QuoteWidgetsRepo quoteWidgetsRepo2 = this.this$0;
                this.label = 2;
                obj = quoteWidgetsRepo2.m53340i(null, this);
            } else {
                return widgetFearGreedEntity;
            }
        }
    }

    /* JADX INFO: renamed from: com.kubi.quotefacade.widgets.QuoteWidgetsRepo$preloadAsync$1$4 */
    /* JADX INFO: compiled from: QuoteWidgetsRepo.kt */
    @Metadata(m90083d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0001*\u00020\u0003H\n"}, m90084d2 = {"<anonymous>", "", "Lcom/kubi/quotefacade/entity/ChancePlateItem;", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.quotefacade.widgets.QuoteWidgetsRepo$preloadAsync$1$4", m90122f = "QuoteWidgetsRepo.kt", m90123i = {}, m90124l = {62, 62}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C226014 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super List<? extends ChancePlateItem>>, Object> {
        int label;
        final /* synthetic */ QuoteWidgetsRepo this$0;

        @Override // p852kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super List<? extends ChancePlateItem>> continuation) {
            return invoke2(interfaceC41709m0, (Continuation<? super List<ChancePlateItem>>) continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C226014(QuoteWidgetsRepo quoteWidgetsRepo, Continuation<? super C226014> continuation) {
            super(2, continuation);
            this.this$0 = quoteWidgetsRepo;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C226014(this.this$0, continuation);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(InterfaceC41709m0 interfaceC41709m0, Continuation<? super List<ChancePlateItem>> continuation) {
            return ((C226014) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x0038, code lost:
        
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
            QuoteWidgetsRepo quoteWidgetsRepo = this.this$0;
            this.label = 1;
            obj = quoteWidgetsRepo.m53337f(this);
            if (obj != coroutine_suspended) {
            }
            return coroutine_suspended;
            List list = (List) obj;
            if (list == null) {
                QuoteWidgetsRepo quoteWidgetsRepo2 = this.this$0;
                this.label = 2;
                obj = quoteWidgetsRepo2.m53342k(this);
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
            List listListOf = CollectionsKt.listOf((Object[]) new InterfaceC41729r0[]{C41696j.m91102b(interfaceC41709m0, null, null, new C225981(this.this$0, null), 3, null), C41696j.m91102b(interfaceC41709m0, null, null, new C225992(this.this$0, null), 3, null), C41696j.m91102b(interfaceC41709m0, null, null, new C226003(this.this$0, null), 3, null), C41696j.m91102b(interfaceC41709m0, null, null, new C226014(this.this$0, null), 3, null)});
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
    public QuoteWidgetsRepo$preloadAsync$1(QuoteWidgetsRepo quoteWidgetsRepo, Continuation<? super QuoteWidgetsRepo$preloadAsync$1> continuation) {
        super(2, continuation);
        this.this$0 = quoteWidgetsRepo;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        QuoteWidgetsRepo$preloadAsync$1 quoteWidgetsRepo$preloadAsync$1 = new QuoteWidgetsRepo$preloadAsync$1(this.this$0, continuation);
        quoteWidgetsRepo$preloadAsync$1.L$0 = obj;
        return quoteWidgetsRepo$preloadAsync$1;
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((QuoteWidgetsRepo$preloadAsync$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
