package com.trtc.uikit.livekit.features.audiencecontainer.view.battle.widgets;

import io.trtc.tuikit.atomicxcore.api.live.BattleInfo;
import io.trtc.tuikit.atomicxcore.api.live.SeatUserInfo;
import java.util.List;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.flow.InterfaceC41635f;
import kotlinx.coroutines.flow.InterfaceC41669n;
import kotlinx.coroutines.flow.InterfaceC41678w;
import p852kotlin.KotlinNothingValueException;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: BattleInfoView.kt */
/* JADX INFO: loaded from: classes60.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.trtc.uikit.livekit.features.audiencecontainer.view.battle.widgets.BattleInfoView$addObserver$1", m90122f = "BattleInfoView.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class BattleInfoView$addObserver$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ BattleInfoView this$0;

    /* JADX INFO: renamed from: com.trtc.uikit.livekit.features.audiencecontainer.view.battle.widgets.BattleInfoView$addObserver$1$1 */
    /* JADX INFO: compiled from: BattleInfoView.kt */
    @Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.trtc.uikit.livekit.features.audiencecontainer.view.battle.widgets.BattleInfoView$addObserver$1$1", m90122f = "BattleInfoView.kt", m90123i = {}, m90124l = {66}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C362351 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ BattleInfoView this$0;

        /* JADX INFO: renamed from: com.trtc.uikit.livekit.features.audiencecontainer.view.battle.widgets.BattleInfoView$addObserver$1$1$a */
        /* JADX INFO: compiled from: BattleInfoView.kt */
        @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
        public static final class a<T> implements InterfaceC41635f {

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ BattleInfoView f78740b;

            public a(BattleInfoView battleInfoView) {
                this.f78740b = battleInfoView;
            }

            @Override // kotlinx.coroutines.flow.InterfaceC41635f
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(List<SeatUserInfo> list, Continuation<? super Unit> continuation) {
                this.f78740b.m80991D();
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C362351(BattleInfoView battleInfoView, Continuation<? super C362351> continuation) {
            super(2, continuation);
            this.this$0 = battleInfoView;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C362351(this.this$0, continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
            return ((C362351) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.label;
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            } else {
                ResultKt.throwOnFailure(obj);
                InterfaceC41678w<List<SeatUserInfo>> connected = this.this$0.getAudienceStore().m83091j().getConnected();
                a aVar = new a(this.this$0);
                this.label = 1;
                if (connected.collect(aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            throw new KotlinNothingValueException();
        }
    }

    /* JADX INFO: renamed from: com.trtc.uikit.livekit.features.audiencecontainer.view.battle.widgets.BattleInfoView$addObserver$1$2 */
    /* JADX INFO: compiled from: BattleInfoView.kt */
    @Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.trtc.uikit.livekit.features.audiencecontainer.view.battle.widgets.BattleInfoView$addObserver$1$2", m90122f = "BattleInfoView.kt", m90123i = {}, m90124l = {71}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C362362 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ BattleInfoView this$0;

        /* JADX INFO: renamed from: com.trtc.uikit.livekit.features.audiencecontainer.view.battle.widgets.BattleInfoView$addObserver$1$2$a */
        /* JADX INFO: compiled from: BattleInfoView.kt */
        @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
        public static final class a<T> implements InterfaceC41635f {

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ BattleInfoView f78741b;

            public a(BattleInfoView battleInfoView) {
                this.f78741b = battleInfoView;
            }

            @Override // kotlinx.coroutines.flow.InterfaceC41635f
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(List<SeatUserInfo> list, Continuation<? super Unit> continuation) {
                this.f78741b.m80989A();
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C362362(BattleInfoView battleInfoView, Continuation<? super C362362> continuation) {
            super(2, continuation);
            this.this$0 = battleInfoView;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C362362(this.this$0, continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
            return ((C362362) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.label;
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            } else {
                ResultKt.throwOnFailure(obj);
                InterfaceC41678w<List<SeatUserInfo>> battleUsers = this.this$0.getAudienceStore().m83087f().getBattleUsers();
                a aVar = new a(this.this$0);
                this.label = 1;
                if (battleUsers.collect(aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            throw new KotlinNothingValueException();
        }
    }

    /* JADX INFO: renamed from: com.trtc.uikit.livekit.features.audiencecontainer.view.battle.widgets.BattleInfoView$addObserver$1$3 */
    /* JADX INFO: compiled from: BattleInfoView.kt */
    @Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.trtc.uikit.livekit.features.audiencecontainer.view.battle.widgets.BattleInfoView$addObserver$1$3", m90122f = "BattleInfoView.kt", m90123i = {}, m90124l = {76}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C362373 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ BattleInfoView this$0;

        /* JADX INFO: renamed from: com.trtc.uikit.livekit.features.audiencecontainer.view.battle.widgets.BattleInfoView$addObserver$1$3$a */
        /* JADX INFO: compiled from: BattleInfoView.kt */
        @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
        public static final class a<T> implements InterfaceC41635f {

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ BattleInfoView f78742b;

            public a(BattleInfoView battleInfoView) {
                this.f78742b = battleInfoView;
            }

            @Override // kotlinx.coroutines.flow.InterfaceC41635f
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(Boolean bool, Continuation<? super Unit> continuation) {
                this.f78742b.m80993F(bool);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C362373(BattleInfoView battleInfoView, Continuation<? super C362373> continuation) {
            super(2, continuation);
            this.this$0 = battleInfoView;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C362373(this.this$0, continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
            return ((C362373) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.label;
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            } else {
                ResultKt.throwOnFailure(obj);
                InterfaceC41669n<Boolean> interfaceC41669nM83115d = this.this$0.getAudienceStore().m83102u().m83115d();
                a aVar = new a(this.this$0);
                this.label = 1;
                if (interfaceC41669nM83115d.collect(aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            throw new KotlinNothingValueException();
        }
    }

    /* JADX INFO: renamed from: com.trtc.uikit.livekit.features.audiencecontainer.view.battle.widgets.BattleInfoView$addObserver$1$4 */
    /* JADX INFO: compiled from: BattleInfoView.kt */
    @Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.trtc.uikit.livekit.features.audiencecontainer.view.battle.widgets.BattleInfoView$addObserver$1$4", m90122f = "BattleInfoView.kt", m90123i = {}, m90124l = {81}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C362384 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ BattleInfoView this$0;

        /* JADX INFO: renamed from: com.trtc.uikit.livekit.features.audiencecontainer.view.battle.widgets.BattleInfoView$addObserver$1$4$a */
        /* JADX INFO: compiled from: BattleInfoView.kt */
        @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
        public static final class a<T> implements InterfaceC41635f {

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ BattleInfoView f78743b;

            public a(BattleInfoView battleInfoView) {
                this.f78743b = battleInfoView;
            }

            /* JADX INFO: renamed from: a */
            public final Object m81004a(boolean z11, Continuation<? super Unit> continuation) {
                this.f78743b.m80992E(Boxing.boxBoolean(z11));
                return Unit.INSTANCE;
            }

            @Override // kotlinx.coroutines.flow.InterfaceC41635f
            public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                return m81004a(((Boolean) obj).booleanValue(), continuation);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C362384(BattleInfoView battleInfoView, Continuation<? super C362384> continuation) {
            super(2, continuation);
            this.this$0 = battleInfoView;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C362384(this.this$0, continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
            return ((C362384) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.label;
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            } else {
                ResultKt.throwOnFailure(obj);
                InterfaceC41669n<Boolean> interfaceC41669nM83111e = this.this$0.getMediaState().m83111e();
                a aVar = new a(this.this$0);
                this.label = 1;
                if (interfaceC41669nM83111e.collect(aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            throw new KotlinNothingValueException();
        }
    }

    /* JADX INFO: renamed from: com.trtc.uikit.livekit.features.audiencecontainer.view.battle.widgets.BattleInfoView$addObserver$1$5 */
    /* JADX INFO: compiled from: BattleInfoView.kt */
    @Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.trtc.uikit.livekit.features.audiencecontainer.view.battle.widgets.BattleInfoView$addObserver$1$5", m90122f = "BattleInfoView.kt", m90123i = {}, m90124l = {86}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C362395 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ BattleInfoView this$0;

        /* JADX INFO: renamed from: com.trtc.uikit.livekit.features.audiencecontainer.view.battle.widgets.BattleInfoView$addObserver$1$5$a */
        /* JADX INFO: compiled from: BattleInfoView.kt */
        @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
        public static final class a<T> implements InterfaceC41635f {

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ BattleInfoView f78744b;

            public a(BattleInfoView battleInfoView) {
                this.f78744b = battleInfoView;
            }

            @Override // kotlinx.coroutines.flow.InterfaceC41635f
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(BattleInfo battleInfo, Continuation<? super Unit> continuation) {
                String battleID;
                if (battleInfo != null && (battleID = battleInfo.getBattleID()) != null && battleID.length() > 0) {
                    this.f78744b.m80990B(battleInfo);
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C362395(BattleInfoView battleInfoView, Continuation<? super C362395> continuation) {
            super(2, continuation);
            this.this$0 = battleInfoView;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C362395(this.this$0, continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
            return ((C362395) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.label;
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            } else {
                ResultKt.throwOnFailure(obj);
                InterfaceC41678w<BattleInfo> currentBattleInfo = this.this$0.getBattleStore().getBattleState().getCurrentBattleInfo();
                a aVar = new a(this.this$0);
                this.label = 1;
                if (currentBattleInfo.collect(aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            throw new KotlinNothingValueException();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BattleInfoView$addObserver$1(BattleInfoView battleInfoView, Continuation<? super BattleInfoView$addObserver$1> continuation) {
        super(2, continuation);
        this.this$0 = battleInfoView;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        BattleInfoView$addObserver$1 battleInfoView$addObserver$1 = new BattleInfoView$addObserver$1(this.this$0, continuation);
        battleInfoView$addObserver$1.L$0 = obj;
        return battleInfoView$addObserver$1;
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((BattleInfoView$addObserver$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        InterfaceC41709m0 interfaceC41709m0 = (InterfaceC41709m0) this.L$0;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        C41696j.m91104d(interfaceC41709m0, null, null, new C362351(this.this$0, null), 3, null);
        C41696j.m91104d(interfaceC41709m0, null, null, new C362362(this.this$0, null), 3, null);
        C41696j.m91104d(interfaceC41709m0, null, null, new C362373(this.this$0, null), 3, null);
        C41696j.m91104d(interfaceC41709m0, null, null, new C362384(this.this$0, null), 3, null);
        C41696j.m91104d(interfaceC41709m0, null, null, new C362395(this.this$0, null), 3, null);
        return Unit.INSTANCE;
    }
}
