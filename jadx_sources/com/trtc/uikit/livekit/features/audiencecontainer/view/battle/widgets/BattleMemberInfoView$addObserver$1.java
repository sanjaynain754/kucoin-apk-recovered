package com.trtc.uikit.livekit.features.audiencecontainer.view.battle.widgets;

import io.trtc.tuikit.atomicxcore.api.live.SeatUserInfo;
import java.util.List;
import java.util.Map;
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

/* JADX INFO: compiled from: BattleMemberInfoView.kt */
/* JADX INFO: loaded from: classes60.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.trtc.uikit.livekit.features.audiencecontainer.view.battle.widgets.BattleMemberInfoView$addObserver$1", m90122f = "BattleMemberInfoView.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class BattleMemberInfoView$addObserver$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ BattleMemberInfoView this$0;

    /* JADX INFO: renamed from: com.trtc.uikit.livekit.features.audiencecontainer.view.battle.widgets.BattleMemberInfoView$addObserver$1$1 */
    /* JADX INFO: compiled from: BattleMemberInfoView.kt */
    @Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.trtc.uikit.livekit.features.audiencecontainer.view.battle.widgets.BattleMemberInfoView$addObserver$1$1", m90122f = "BattleMemberInfoView.kt", m90123i = {}, m90124l = {56}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C362451 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ BattleMemberInfoView this$0;

        /* JADX INFO: renamed from: com.trtc.uikit.livekit.features.audiencecontainer.view.battle.widgets.BattleMemberInfoView$addObserver$1$1$a */
        /* JADX INFO: compiled from: BattleMemberInfoView.kt */
        @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
        public static final class a<T> implements InterfaceC41635f {

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ BattleMemberInfoView f78759b;

            public a(BattleMemberInfoView battleMemberInfoView) {
                this.f78759b = battleMemberInfoView;
            }

            @Override // kotlinx.coroutines.flow.InterfaceC41635f
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(List<SeatUserInfo> list, Continuation<? super Unit> continuation) {
                BattleMemberInfoView.f78751y.m79404b("battleUsers changed: " + list);
                if (!list.isEmpty()) {
                    this.f78759b.m81022r();
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C362451(BattleMemberInfoView battleMemberInfoView, Continuation<? super C362451> continuation) {
            super(2, continuation);
            this.this$0 = battleMemberInfoView;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C362451(this.this$0, continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
            return ((C362451) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
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
                InterfaceC41678w<List<SeatUserInfo>> battleUsers = this.this$0.getAudienceStore().getF82426h().getBattleState().getBattleUsers();
                a aVar = new a(this.this$0);
                this.label = 1;
                if (battleUsers.collect(aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            throw new KotlinNothingValueException();
        }
    }

    /* JADX INFO: renamed from: com.trtc.uikit.livekit.features.audiencecontainer.view.battle.widgets.BattleMemberInfoView$addObserver$1$2 */
    /* JADX INFO: compiled from: BattleMemberInfoView.kt */
    @Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.trtc.uikit.livekit.features.audiencecontainer.view.battle.widgets.BattleMemberInfoView$addObserver$1$2", m90122f = "BattleMemberInfoView.kt", m90123i = {}, m90124l = {64}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C362462 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ BattleMemberInfoView this$0;

        /* JADX INFO: renamed from: com.trtc.uikit.livekit.features.audiencecontainer.view.battle.widgets.BattleMemberInfoView$addObserver$1$2$a */
        /* JADX INFO: compiled from: BattleMemberInfoView.kt */
        @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
        public static final class a<T> implements InterfaceC41635f {

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ BattleMemberInfoView f78760b;

            public a(BattleMemberInfoView battleMemberInfoView) {
                this.f78760b = battleMemberInfoView;
            }

            @Override // kotlinx.coroutines.flow.InterfaceC41635f
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(Map<String, Integer> map, Continuation<? super Unit> continuation) {
                BattleMemberInfoView.f78751y.m79404b("battleScore changed: " + map);
                if (!map.isEmpty()) {
                    this.f78760b.m81022r();
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C362462(BattleMemberInfoView battleMemberInfoView, Continuation<? super C362462> continuation) {
            super(2, continuation);
            this.this$0 = battleMemberInfoView;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C362462(this.this$0, continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
            return ((C362462) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
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
                InterfaceC41678w<Map<String, Integer>> battleScore = this.this$0.getAudienceStore().getF82426h().getBattleState().getBattleScore();
                a aVar = new a(this.this$0);
                this.label = 1;
                if (battleScore.collect(aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            throw new KotlinNothingValueException();
        }
    }

    /* JADX INFO: renamed from: com.trtc.uikit.livekit.features.audiencecontainer.view.battle.widgets.BattleMemberInfoView$addObserver$1$3 */
    /* JADX INFO: compiled from: BattleMemberInfoView.kt */
    @Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.trtc.uikit.livekit.features.audiencecontainer.view.battle.widgets.BattleMemberInfoView$addObserver$1$3", m90122f = "BattleMemberInfoView.kt", m90123i = {}, m90124l = {72}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C362473 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ BattleMemberInfoView this$0;

        /* JADX INFO: renamed from: com.trtc.uikit.livekit.features.audiencecontainer.view.battle.widgets.BattleMemberInfoView$addObserver$1$3$a */
        /* JADX INFO: compiled from: BattleMemberInfoView.kt */
        @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
        public static final class a<T> implements InterfaceC41635f {

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ BattleMemberInfoView f78761b;

            public a(BattleMemberInfoView battleMemberInfoView) {
                this.f78761b = battleMemberInfoView;
            }

            @Override // kotlinx.coroutines.flow.InterfaceC41635f
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(Boolean bool, Continuation<? super Unit> continuation) {
                this.f78761b.m81020n(bool);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C362473(BattleMemberInfoView battleMemberInfoView, Continuation<? super C362473> continuation) {
            super(2, continuation);
            this.this$0 = battleMemberInfoView;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C362473(this.this$0, continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
            return ((C362473) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
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

    /* JADX INFO: renamed from: com.trtc.uikit.livekit.features.audiencecontainer.view.battle.widgets.BattleMemberInfoView$addObserver$1$4 */
    /* JADX INFO: compiled from: BattleMemberInfoView.kt */
    @Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.trtc.uikit.livekit.features.audiencecontainer.view.battle.widgets.BattleMemberInfoView$addObserver$1$4", m90122f = "BattleMemberInfoView.kt", m90123i = {}, m90124l = {77}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C362484 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ BattleMemberInfoView this$0;

        /* JADX INFO: renamed from: com.trtc.uikit.livekit.features.audiencecontainer.view.battle.widgets.BattleMemberInfoView$addObserver$1$4$a */
        /* JADX INFO: compiled from: BattleMemberInfoView.kt */
        @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
        public static final class a<T> implements InterfaceC41635f {

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ BattleMemberInfoView f78762b;

            public a(BattleMemberInfoView battleMemberInfoView) {
                this.f78762b = battleMemberInfoView;
            }

            /* JADX INFO: renamed from: a */
            public final Object m81026a(boolean z11, Continuation<? super Unit> continuation) {
                this.f78762b.m81017o(Boxing.boxBoolean(z11));
                return Unit.INSTANCE;
            }

            @Override // kotlinx.coroutines.flow.InterfaceC41635f
            public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                return m81026a(((Boolean) obj).booleanValue(), continuation);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C362484(BattleMemberInfoView battleMemberInfoView, Continuation<? super C362484> continuation) {
            super(2, continuation);
            this.this$0 = battleMemberInfoView;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C362484(this.this$0, continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
            return ((C362484) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BattleMemberInfoView$addObserver$1(BattleMemberInfoView battleMemberInfoView, Continuation<? super BattleMemberInfoView$addObserver$1> continuation) {
        super(2, continuation);
        this.this$0 = battleMemberInfoView;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        BattleMemberInfoView$addObserver$1 battleMemberInfoView$addObserver$1 = new BattleMemberInfoView$addObserver$1(this.this$0, continuation);
        battleMemberInfoView$addObserver$1.L$0 = obj;
        return battleMemberInfoView$addObserver$1;
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((BattleMemberInfoView$addObserver$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        InterfaceC41709m0 interfaceC41709m0 = (InterfaceC41709m0) this.L$0;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        C41696j.m91104d(interfaceC41709m0, null, null, new C362451(this.this$0, null), 3, null);
        C41696j.m91104d(interfaceC41709m0, null, null, new C362462(this.this$0, null), 3, null);
        C41696j.m91104d(interfaceC41709m0, null, null, new C362473(this.this$0, null), 3, null);
        C41696j.m91104d(interfaceC41709m0, null, null, new C362484(this.this$0, null), 3, null);
        return Unit.INSTANCE;
    }
}
