package com.trtc.uikit.livekit.features.audiencecontainer.view.coguest.panel;

import io.trtc.tuikit.atomicxcore.api.live.LiveUserInfo;
import io.trtc.tuikit.atomicxcore.api.live.SeatInfo;
import io.trtc.tuikit.atomicxcore.api.live.SeatUserInfo;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.flow.C41636g;
import kotlinx.coroutines.flow.InterfaceC41634e;
import kotlinx.coroutines.flow.InterfaceC41635f;
import kotlinx.coroutines.flow.InterfaceC41678w;
import p852kotlin.KotlinNothingValueException;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: AnchorManagerDialog.kt */
/* JADX INFO: loaded from: classes60.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.trtc.uikit.livekit.features.audiencecontainer.view.coguest.panel.AnchorManagerDialog$addObserver$1", m90122f = "AnchorManagerDialog.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class AnchorManagerDialog$addObserver$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ AnchorManagerDialog this$0;

    /* JADX INFO: renamed from: com.trtc.uikit.livekit.features.audiencecontainer.view.coguest.panel.AnchorManagerDialog$addObserver$1$1 */
    /* JADX INFO: compiled from: AnchorManagerDialog.kt */
    @Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.trtc.uikit.livekit.features.audiencecontainer.view.coguest.panel.AnchorManagerDialog$addObserver$1$1", m90122f = "AnchorManagerDialog.kt", m90123i = {}, m90124l = {183}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    @SourceDebugExtension({"SMAP\nAnchorManagerDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnchorManagerDialog.kt\ncom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/AnchorManagerDialog$addObserver$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,517:1\n49#2:518\n51#2:522\n46#3:519\n51#3:521\n105#4:520\n*S KotlinDebug\n*F\n+ 1 AnchorManagerDialog.kt\ncom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/AnchorManagerDialog$addObserver$1$1\n*L\n181#1:518\n181#1:522\n181#1:519\n181#1:521\n181#1:520\n*E\n"})
    public static final class C362581 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ AnchorManagerDialog this$0;

        /* JADX INFO: renamed from: com.trtc.uikit.livekit.features.audiencecontainer.view.coguest.panel.AnchorManagerDialog$addObserver$1$1$a */
        /* JADX INFO: compiled from: AnchorManagerDialog.kt */
        @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
        public static final class a<T> implements InterfaceC41635f {

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ AnchorManagerDialog f78796b;

            public a(AnchorManagerDialog anchorManagerDialog) {
                this.f78796b = anchorManagerDialog;
            }

            @Override // kotlinx.coroutines.flow.InterfaceC41635f
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(Boolean bool, Continuation<? super Unit> continuation) {
                if (bool == null) {
                    return Unit.INSTANCE;
                }
                this.f78796b.m81076E0(!bool.booleanValue());
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C362581(AnchorManagerDialog anchorManagerDialog, Continuation<? super C362581> continuation) {
            super(2, continuation);
            this.this$0 = anchorManagerDialog;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C362581(this.this$0, continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
            return ((C362581) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
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
                final InterfaceC41678w<List<SeatInfo>> seatList = this.this$0.f78781m.m83098q().getSeatList();
                final AnchorManagerDialog anchorManagerDialog = this.this$0;
                InterfaceC41634e interfaceC41634eM90939v = C41636g.m90939v(new InterfaceC41634e<Boolean>() { // from class: com.trtc.uikit.livekit.features.audiencecontainer.view.coguest.panel.AnchorManagerDialog$addObserver$1$1$invokeSuspend$$inlined$map$1

                    /* JADX INFO: renamed from: com.trtc.uikit.livekit.features.audiencecontainer.view.coguest.panel.AnchorManagerDialog$addObserver$1$1$invokeSuspend$$inlined$map$1$2 */
                    /* JADX INFO: compiled from: Emitters.kt */
                    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
                    @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 AnchorManagerDialog.kt\ncom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/AnchorManagerDialog$addObserver$1$1\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,49:1\n50#2:50\n181#3:51\n1#4:52\n*E\n"})
                    public static final class C362592<T> implements InterfaceC41635f {

                        /* JADX INFO: renamed from: b */
                        public final /* synthetic */ InterfaceC41635f f78799b;

                        /* JADX INFO: renamed from: c */
                        public final /* synthetic */ AnchorManagerDialog f78800c;

                        /* JADX INFO: renamed from: com.trtc.uikit.livekit.features.audiencecontainer.view.coguest.panel.AnchorManagerDialog$addObserver$1$1$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
                        @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
                        @DebugMetadata(m90121c = "com.trtc.uikit.livekit.features.audiencecontainer.view.coguest.panel.AnchorManagerDialog$addObserver$1$1$invokeSuspend$$inlined$map$1$2", m90122f = "AnchorManagerDialog.kt", m90123i = {0, 0, 0, 0, 0}, m90124l = {50}, m90125m = "emit", m90126n = {"value", "$completion", "value", "$this$map_u24lambda_u245", "$i$a$-unsafeTransform-FlowKt__TransformKt$map$1"}, m90127s = {"L$0", "L$1", "L$2", "L$3", "I$0"})
                        public static final class AnonymousClass1 extends ContinuationImpl {
                            int I$0;
                            Object L$0;
                            Object L$1;
                            Object L$2;
                            Object L$3;
                            int label;
                            /* synthetic */ Object result;

                            public AnonymousClass1(Continuation continuation) {
                                super(continuation);
                            }

                            @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            public final Object invokeSuspend(Object obj) {
                                this.result = obj;
                                this.label |= Integer.MIN_VALUE;
                                return C362592.this.emit(null, this);
                            }
                        }

                        public C362592(InterfaceC41635f interfaceC41635f, AnchorManagerDialog anchorManagerDialog) {
                            this.f78799b = interfaceC41635f;
                            this.f78800c = anchorManagerDialog;
                        }

                        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                        @Override // kotlinx.coroutines.flow.InterfaceC41635f
                        public final Object emit(Object obj, Continuation continuation) {
                            AnonymousClass1 anonymousClass1;
                            Boolean boolBoxBoolean;
                            T next;
                            SeatUserInfo userInfo;
                            String userID;
                            LiveUserInfo liveUserInfo;
                            if (continuation instanceof AnonymousClass1) {
                                anonymousClass1 = (AnonymousClass1) continuation;
                                int i11 = anonymousClass1.label;
                                if ((i11 & Integer.MIN_VALUE) != 0) {
                                    anonymousClass1.label = i11 - Integer.MIN_VALUE;
                                } else {
                                    anonymousClass1 = new AnonymousClass1(continuation);
                                }
                            } else {
                                anonymousClass1 = new AnonymousClass1(continuation);
                            }
                            Object obj2 = anonymousClass1.result;
                            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            int i12 = anonymousClass1.label;
                            if (i12 == 0) {
                                ResultKt.throwOnFailure(obj2);
                                InterfaceC41635f interfaceC41635f = this.f78799b;
                                Iterator<T> it = ((List) obj).iterator();
                                do {
                                    boolBoxBoolean = null;
                                    if (!it.hasNext()) {
                                        next = (T) null;
                                        break;
                                    }
                                    next = it.next();
                                    userID = ((SeatInfo) next).getUserInfo().getUserID();
                                    liveUserInfo = this.f78800c.f78782n;
                                } while (!Intrinsics.areEqual(userID, liveUserInfo != null ? liveUserInfo.getUserID() : null));
                                SeatInfo seatInfo = next;
                                if (seatInfo != null && (userInfo = seatInfo.getUserInfo()) != null) {
                                    boolBoxBoolean = Boxing.boxBoolean(userInfo.getAllowOpenMicrophone());
                                }
                                anonymousClass1.L$0 = SpillingKt.nullOutSpilledVariable(obj);
                                anonymousClass1.L$1 = SpillingKt.nullOutSpilledVariable(anonymousClass1);
                                anonymousClass1.L$2 = SpillingKt.nullOutSpilledVariable(obj);
                                anonymousClass1.L$3 = SpillingKt.nullOutSpilledVariable(interfaceC41635f);
                                anonymousClass1.I$0 = 0;
                                anonymousClass1.label = 1;
                                if (interfaceC41635f.emit(boolBoxBoolean, anonymousClass1) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            } else {
                                if (i12 != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                ResultKt.throwOnFailure(obj2);
                            }
                            return Unit.INSTANCE;
                        }
                    }

                    @Override // kotlinx.coroutines.flow.InterfaceC41634e
                    public Object collect(InterfaceC41635f<? super Boolean> interfaceC41635f, Continuation continuation) {
                        Object objCollect = seatList.collect(new C362592(interfaceC41635f, anchorManagerDialog), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }
                });
                a aVar = new a(this.this$0);
                this.label = 1;
                if (interfaceC41634eM90939v.collect(aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.trtc.uikit.livekit.features.audiencecontainer.view.coguest.panel.AnchorManagerDialog$addObserver$1$2 */
    /* JADX INFO: compiled from: AnchorManagerDialog.kt */
    @Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.trtc.uikit.livekit.features.audiencecontainer.view.coguest.panel.AnchorManagerDialog$addObserver$1$2", m90122f = "AnchorManagerDialog.kt", m90123i = {}, m90124l = {192}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    @SourceDebugExtension({"SMAP\nAnchorManagerDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnchorManagerDialog.kt\ncom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/AnchorManagerDialog$addObserver$1$2\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,517:1\n49#2:518\n51#2:522\n46#3:519\n51#3:521\n105#4:520\n*S KotlinDebug\n*F\n+ 1 AnchorManagerDialog.kt\ncom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/AnchorManagerDialog$addObserver$1$2\n*L\n190#1:518\n190#1:522\n190#1:519\n190#1:521\n190#1:520\n*E\n"})
    public static final class C362602 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ AnchorManagerDialog this$0;

        /* JADX INFO: renamed from: com.trtc.uikit.livekit.features.audiencecontainer.view.coguest.panel.AnchorManagerDialog$addObserver$1$2$a */
        /* JADX INFO: compiled from: AnchorManagerDialog.kt */
        @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
        public static final class a<T> implements InterfaceC41635f {

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ AnchorManagerDialog f78801b;

            public a(AnchorManagerDialog anchorManagerDialog) {
                this.f78801b = anchorManagerDialog;
            }

            @Override // kotlinx.coroutines.flow.InterfaceC41635f
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(Boolean bool, Continuation<? super Unit> continuation) {
                if (bool == null) {
                    return Unit.INSTANCE;
                }
                this.f78801b.m81074B0(!bool.booleanValue());
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C362602(AnchorManagerDialog anchorManagerDialog, Continuation<? super C362602> continuation) {
            super(2, continuation);
            this.this$0 = anchorManagerDialog;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C362602(this.this$0, continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
            return ((C362602) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
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
                final InterfaceC41678w<List<SeatInfo>> seatList = this.this$0.f78781m.m83098q().getSeatList();
                final AnchorManagerDialog anchorManagerDialog = this.this$0;
                InterfaceC41634e interfaceC41634eM90939v = C41636g.m90939v(new InterfaceC41634e<Boolean>() { // from class: com.trtc.uikit.livekit.features.audiencecontainer.view.coguest.panel.AnchorManagerDialog$addObserver$1$2$invokeSuspend$$inlined$map$1

                    /* JADX INFO: renamed from: com.trtc.uikit.livekit.features.audiencecontainer.view.coguest.panel.AnchorManagerDialog$addObserver$1$2$invokeSuspend$$inlined$map$1$2 */
                    /* JADX INFO: compiled from: Emitters.kt */
                    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
                    @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 AnchorManagerDialog.kt\ncom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/AnchorManagerDialog$addObserver$1$2\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,49:1\n50#2:50\n190#3:51\n1#4:52\n*E\n"})
                    public static final class C362612<T> implements InterfaceC41635f {

                        /* JADX INFO: renamed from: b */
                        public final /* synthetic */ InterfaceC41635f f78804b;

                        /* JADX INFO: renamed from: c */
                        public final /* synthetic */ AnchorManagerDialog f78805c;

                        /* JADX INFO: renamed from: com.trtc.uikit.livekit.features.audiencecontainer.view.coguest.panel.AnchorManagerDialog$addObserver$1$2$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
                        @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
                        @DebugMetadata(m90121c = "com.trtc.uikit.livekit.features.audiencecontainer.view.coguest.panel.AnchorManagerDialog$addObserver$1$2$invokeSuspend$$inlined$map$1$2", m90122f = "AnchorManagerDialog.kt", m90123i = {0, 0, 0, 0, 0}, m90124l = {50}, m90125m = "emit", m90126n = {"value", "$completion", "value", "$this$map_u24lambda_u245", "$i$a$-unsafeTransform-FlowKt__TransformKt$map$1"}, m90127s = {"L$0", "L$1", "L$2", "L$3", "I$0"})
                        public static final class AnonymousClass1 extends ContinuationImpl {
                            int I$0;
                            Object L$0;
                            Object L$1;
                            Object L$2;
                            Object L$3;
                            int label;
                            /* synthetic */ Object result;

                            public AnonymousClass1(Continuation continuation) {
                                super(continuation);
                            }

                            @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            public final Object invokeSuspend(Object obj) {
                                this.result = obj;
                                this.label |= Integer.MIN_VALUE;
                                return C362612.this.emit(null, this);
                            }
                        }

                        public C362612(InterfaceC41635f interfaceC41635f, AnchorManagerDialog anchorManagerDialog) {
                            this.f78804b = interfaceC41635f;
                            this.f78805c = anchorManagerDialog;
                        }

                        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                        @Override // kotlinx.coroutines.flow.InterfaceC41635f
                        public final Object emit(Object obj, Continuation continuation) {
                            AnonymousClass1 anonymousClass1;
                            Boolean boolBoxBoolean;
                            T next;
                            SeatUserInfo userInfo;
                            String userID;
                            LiveUserInfo liveUserInfo;
                            if (continuation instanceof AnonymousClass1) {
                                anonymousClass1 = (AnonymousClass1) continuation;
                                int i11 = anonymousClass1.label;
                                if ((i11 & Integer.MIN_VALUE) != 0) {
                                    anonymousClass1.label = i11 - Integer.MIN_VALUE;
                                } else {
                                    anonymousClass1 = new AnonymousClass1(continuation);
                                }
                            } else {
                                anonymousClass1 = new AnonymousClass1(continuation);
                            }
                            Object obj2 = anonymousClass1.result;
                            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            int i12 = anonymousClass1.label;
                            if (i12 == 0) {
                                ResultKt.throwOnFailure(obj2);
                                InterfaceC41635f interfaceC41635f = this.f78804b;
                                Iterator<T> it = ((List) obj).iterator();
                                do {
                                    boolBoxBoolean = null;
                                    if (!it.hasNext()) {
                                        next = (T) null;
                                        break;
                                    }
                                    next = it.next();
                                    userID = ((SeatInfo) next).getUserInfo().getUserID();
                                    liveUserInfo = this.f78805c.f78782n;
                                } while (!Intrinsics.areEqual(userID, liveUserInfo != null ? liveUserInfo.getUserID() : null));
                                SeatInfo seatInfo = next;
                                if (seatInfo != null && (userInfo = seatInfo.getUserInfo()) != null) {
                                    boolBoxBoolean = Boxing.boxBoolean(userInfo.getAllowOpenCamera());
                                }
                                anonymousClass1.L$0 = SpillingKt.nullOutSpilledVariable(obj);
                                anonymousClass1.L$1 = SpillingKt.nullOutSpilledVariable(anonymousClass1);
                                anonymousClass1.L$2 = SpillingKt.nullOutSpilledVariable(obj);
                                anonymousClass1.L$3 = SpillingKt.nullOutSpilledVariable(interfaceC41635f);
                                anonymousClass1.I$0 = 0;
                                anonymousClass1.label = 1;
                                if (interfaceC41635f.emit(boolBoxBoolean, anonymousClass1) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            } else {
                                if (i12 != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                ResultKt.throwOnFailure(obj2);
                            }
                            return Unit.INSTANCE;
                        }
                    }

                    @Override // kotlinx.coroutines.flow.InterfaceC41634e
                    public Object collect(InterfaceC41635f<? super Boolean> interfaceC41635f, Continuation continuation) {
                        Object objCollect = seatList.collect(new C362612(interfaceC41635f, anchorManagerDialog), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }
                });
                a aVar = new a(this.this$0);
                this.label = 1;
                if (interfaceC41634eM90939v.collect(aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.trtc.uikit.livekit.features.audiencecontainer.view.coguest.panel.AnchorManagerDialog$addObserver$1$3 */
    /* JADX INFO: compiled from: AnchorManagerDialog.kt */
    @Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.trtc.uikit.livekit.features.audiencecontainer.view.coguest.panel.AnchorManagerDialog$addObserver$1$3", m90122f = "AnchorManagerDialog.kt", m90123i = {}, m90124l = {198}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C362623 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ AnchorManagerDialog this$0;

        /* JADX INFO: renamed from: com.trtc.uikit.livekit.features.audiencecontainer.view.coguest.panel.AnchorManagerDialog$addObserver$1$3$a */
        /* JADX INFO: compiled from: AnchorManagerDialog.kt */
        @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
        public static final class a<T> implements InterfaceC41635f {

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ AnchorManagerDialog f78806b;

            public a(AnchorManagerDialog anchorManagerDialog) {
                this.f78806b = anchorManagerDialog;
            }

            @Override // kotlinx.coroutines.flow.InterfaceC41635f
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(Set<String> set, Continuation<? super Unit> continuation) {
                this.f78806b.m81080l0(set);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C362623(AnchorManagerDialog anchorManagerDialog, Continuation<? super C362623> continuation) {
            super(2, continuation);
            this.this$0 = anchorManagerDialog;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C362623(this.this$0, continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
            return ((C362623) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
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
                InterfaceC41678w<Set<String>> interfaceC41678wM83106a = this.this$0.f78781m.m83093l().m83106a();
                a aVar = new a(this.this$0);
                this.label = 1;
                if (interfaceC41678wM83106a.collect(aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            throw new KotlinNothingValueException();
        }
    }

    /* JADX INFO: renamed from: com.trtc.uikit.livekit.features.audiencecontainer.view.coguest.panel.AnchorManagerDialog$addObserver$1$4 */
    /* JADX INFO: compiled from: AnchorManagerDialog.kt */
    @Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.trtc.uikit.livekit.features.audiencecontainer.view.coguest.panel.AnchorManagerDialog$addObserver$1$4", m90122f = "AnchorManagerDialog.kt", m90123i = {}, m90124l = {203}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C362634 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ AnchorManagerDialog this$0;

        /* JADX INFO: renamed from: com.trtc.uikit.livekit.features.audiencecontainer.view.coguest.panel.AnchorManagerDialog$addObserver$1$4$a */
        /* JADX INFO: compiled from: AnchorManagerDialog.kt */
        @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
        public static final class a<T> implements InterfaceC41635f {

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ AnchorManagerDialog f78807b;

            public a(AnchorManagerDialog anchorManagerDialog) {
                this.f78807b = anchorManagerDialog;
            }

            @Override // kotlinx.coroutines.flow.InterfaceC41635f
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(List<SeatUserInfo> list, Continuation<? super Unit> continuation) {
                this.f78807b.m81079k0(list);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C362634(AnchorManagerDialog anchorManagerDialog, Continuation<? super C362634> continuation) {
            super(2, continuation);
            this.this$0 = anchorManagerDialog;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C362634(this.this$0, continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
            return ((C362634) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
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
                InterfaceC41678w<List<SeatUserInfo>> connected = this.this$0.f78781m.m83089h().getConnected();
                a aVar = new a(this.this$0);
                this.label = 1;
                if (connected.collect(aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            throw new KotlinNothingValueException();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnchorManagerDialog$addObserver$1(AnchorManagerDialog anchorManagerDialog, Continuation<? super AnchorManagerDialog$addObserver$1> continuation) {
        super(2, continuation);
        this.this$0 = anchorManagerDialog;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        AnchorManagerDialog$addObserver$1 anchorManagerDialog$addObserver$1 = new AnchorManagerDialog$addObserver$1(this.this$0, continuation);
        anchorManagerDialog$addObserver$1.L$0 = obj;
        return anchorManagerDialog$addObserver$1;
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((AnchorManagerDialog$addObserver$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        InterfaceC41709m0 interfaceC41709m0 = (InterfaceC41709m0) this.L$0;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        C41696j.m91104d(interfaceC41709m0, null, null, new C362581(this.this$0, null), 3, null);
        C41696j.m91104d(interfaceC41709m0, null, null, new C362602(this.this$0, null), 3, null);
        C41696j.m91104d(interfaceC41709m0, null, null, new C362623(this.this$0, null), 3, null);
        C41696j.m91104d(interfaceC41709m0, null, null, new C362634(this.this$0, null), 3, null);
        return Unit.INSTANCE;
    }
}
