package com.kubi.spot.business.callAuction.mvi;

import com.google.firebase.messaging.Constants;
import com.kubi.spot.exeption.SpotMessage;
import f30.C37347r;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.flow.C41636g;
import kotlinx.coroutines.flow.InterfaceC41634e;
import kotlinx.coroutines.flow.InterfaceC41635f;
import o00.C42911a;
import p569qq.C43846g;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.functions.Function3;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.Ref;
import p852kotlin.jvm.internal.SourceDebugExtension;
import ro.C44128b;

/* JADX INFO: compiled from: CallAuctionViewModel.kt */
/* JADX INFO: loaded from: classes47.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.spot.business.callAuction.mvi.CallAuctionViewModel$countDown$1", m90122f = "CallAuctionViewModel.kt", m90123i = {}, m90124l = {289}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class CallAuctionViewModel$countDown$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ Ref.LongRef $cycleCount;
    final /* synthetic */ Ref.LongRef $delayTime;
    final /* synthetic */ Ref.LongRef $firstTime;
    final /* synthetic */ long $remainSec;
    final /* synthetic */ long $timeInterval;
    int label;
    final /* synthetic */ CallAuctionViewModel this$0;

    /* JADX INFO: renamed from: com.kubi.spot.business.callAuction.mvi.CallAuctionViewModel$countDown$1$1 */
    /* JADX INFO: compiled from: CallAuctionViewModel.kt */
    @Metadata(m90083d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", ""}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.spot.business.callAuction.mvi.CallAuctionViewModel$countDown$1$1", m90122f = "CallAuctionViewModel.kt", m90123i = {0, 0, 1, 1}, m90124l = {255, 260}, m90125m = "invokeSuspend", m90126n = {"$this$flow", "num", "$this$flow", "num"}, m90127s = {"L$0", "J$0", "L$0", "J$0"})
    public static final class C247591 extends SuspendLambda implements Function2<InterfaceC41635f<? super Long>, Continuation<? super Unit>, Object> {
        final /* synthetic */ Ref.LongRef $cycleCount;
        final /* synthetic */ Ref.LongRef $delayTime;
        final /* synthetic */ Ref.LongRef $firstTime;
        final /* synthetic */ long $remainSec;
        final /* synthetic */ long $timeInterval;
        long J$0;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C247591(long j11, Ref.LongRef longRef, Ref.LongRef longRef2, Ref.LongRef longRef3, long j12, Continuation<? super C247591> continuation) {
            super(2, continuation);
            this.$remainSec = j11;
            this.$cycleCount = longRef;
            this.$firstTime = longRef2;
            this.$delayTime = longRef3;
            this.$timeInterval = j12;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C247591 c247591 = new C247591(this.$remainSec, this.$cycleCount, this.$firstTime, this.$delayTime, this.$timeInterval, continuation);
            c247591.L$0 = obj;
            return c247591;
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC41635f<? super Long> interfaceC41635f, Continuation<? super Unit> continuation) {
            return ((C247591) create(interfaceC41635f, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:13:0x0035  */
        /* JADX WARN: Code duplicated, block: B:16:0x004f A[PHI: r4 r8
          0x004f: PHI (r4v1 long) = (r4v4 long), (r4v0 long) binds: [B:14:0x004c, B:9:0x0026] A[DONT_GENERATE, DONT_INLINE]
          0x004f: PHI (r8v1 long) = (r8v2 long), (r8v5 long) binds: [B:14:0x004c, B:9:0x0026] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:18:0x0059  */
        /* JADX WARN: Code duplicated, block: B:21:0x007a  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0078 -> B:24:0x008b). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0088 -> B:24:0x008b). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r19) {
            /*
                r18 = this;
                r0 = r18
                java.lang.Object r1 = r0.L$0
                kotlinx.coroutines.flow.f r1 = (kotlinx.coroutines.flow.InterfaceC41635f) r1
                java.lang.Object r2 = p852kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r3 = r0.label
                r4 = -1
                r6 = 2
                r7 = 1
                if (r3 == 0) goto L2c
                if (r3 == r7) goto L26
                if (r3 != r6) goto L1e
                long r8 = r0.J$0
                p852kotlin.ResultKt.throwOnFailure(r19)
                r16 = r4
                goto L8b
            L1e:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r2)
                throw r1
            L26:
                long r8 = r0.J$0
                p852kotlin.ResultKt.throwOnFailure(r19)
                goto L4f
            L2c:
                p852kotlin.ResultKt.throwOnFailure(r19)
                long r8 = r0.$remainSec
            L31:
                int r3 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
                if (r3 >= 0) goto L90
                kotlin.jvm.internal.Ref$LongRef r3 = r0.$cycleCount
                long r10 = r3.element
                r12 = 1
                long r10 = r10 + r12
                r3.element = r10
                java.lang.Long r3 = p852kotlin.coroutines.jvm.internal.Boxing.boxLong(r8)
                r0.L$0 = r1
                r0.J$0 = r8
                r0.label = r7
                java.lang.Object r3 = r1.emit(r3, r0)
                if (r3 != r2) goto L4f
                goto L8a
            L4f:
                kotlin.jvm.internal.Ref$LongRef r3 = r0.$firstTime
                long r10 = r3.element
                r12 = 0
                int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
                if (r10 != 0) goto L5f
                long r10 = java.lang.System.currentTimeMillis()
                r3.element = r10
            L5f:
                kotlin.jvm.internal.Ref$LongRef r3 = r0.$delayTime
                kotlin.jvm.internal.Ref$LongRef r10 = r0.$cycleCount
                long r10 = r10.element
                long r14 = r0.$timeInterval
                long r10 = r10 * r14
                long r14 = java.lang.System.currentTimeMillis()
                r16 = r4
                kotlin.jvm.internal.Ref$LongRef r4 = r0.$firstTime
                long r4 = r4.element
                long r14 = r14 - r4
                long r10 = r10 - r14
                r3.element = r10
                int r3 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1))
                if (r3 == 0) goto L8b
                kotlin.jvm.internal.Ref$LongRef r3 = r0.$delayTime
                long r3 = r3.element
                r0.L$0 = r1
                r0.J$0 = r8
                r0.label = r6
                java.lang.Object r3 = kotlinx.coroutines.DelayKt.m90350b(r3, r0)
                if (r3 != r2) goto L8b
            L8a:
                return r2
            L8b:
                long r8 = r8 + r16
                r4 = r16
                goto L31
            L90:
                kotlin.Unit r1 = p852kotlin.Unit.INSTANCE
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.kubi.spot.business.callAuction.mvi.CallAuctionViewModel$countDown$1.C247591.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: com.kubi.spot.business.callAuction.mvi.CallAuctionViewModel$countDown$1$2 */
    /* JADX INFO: compiled from: CallAuctionViewModel.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", ""}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.spot.business.callAuction.mvi.CallAuctionViewModel$countDown$1$2", m90122f = "CallAuctionViewModel.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C247602 extends SuspendLambda implements Function2<Long, Continuation<? super Unit>, Object> {
        /* synthetic */ long J$0;
        int label;
        final /* synthetic */ CallAuctionViewModel this$0;

        public final Object invoke(long j11, Continuation<? super Unit> continuation) {
            return ((C247602) create(Long.valueOf(j11), continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C247602(CallAuctionViewModel callAuctionViewModel, Continuation<? super C247602> continuation) {
            super(2, continuation);
            this.this$0 = callAuctionViewModel;
        }

        /* JADX INFO: renamed from: f */
        public static final UIState m60569f(String str, UIState uIState) {
            return UIState.copy$default(uIState, null, null, null, str, null, null, 55, null);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C247602 c247602 = new C247602(this.this$0, continuation);
            c247602.J$0 = ((Number) obj).longValue();
            return c247602;
        }

        @Override // p852kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Long l11, Continuation<? super Unit> continuation) {
            return invoke(l11.longValue(), continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            long j11 = this.J$0;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            final String strM83941a = C37347r.m83941a(j11 * ((long) 1000));
            this.this$0.updateState(new Function1() { // from class: com.kubi.spot.business.callAuction.mvi.e
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return CallAuctionViewModel$countDown$1.C247602.m60569f(strM83941a, (UIState) obj2);
                }
            });
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.kubi.spot.business.callAuction.mvi.CallAuctionViewModel$countDown$1$3 */
    /* JADX INFO: compiled from: CallAuctionViewModel.kt */
    @Metadata(m90083d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0003\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "", Constants.IPC_BUNDLE_KEY_SEND_ERROR, ""}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.spot.business.callAuction.mvi.CallAuctionViewModel$countDown$1$3", m90122f = "CallAuctionViewModel.kt", m90123i = {0, 1, 2, 3, 4, 5}, m90124l = {270, 272, 275, 277, 280, 282}, m90125m = "invokeSuspend", m90126n = {Constants.IPC_BUNDLE_KEY_SEND_ERROR, Constants.IPC_BUNDLE_KEY_SEND_ERROR, Constants.IPC_BUNDLE_KEY_SEND_ERROR, Constants.IPC_BUNDLE_KEY_SEND_ERROR, Constants.IPC_BUNDLE_KEY_SEND_ERROR, Constants.IPC_BUNDLE_KEY_SEND_ERROR}, m90127s = {"L$0", "L$0", "L$0", "L$0", "L$0", "L$0"})
    @SourceDebugExtension({"SMAP\nCallAuctionViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CallAuctionViewModel.kt\ncom/kubi/spot/business/callAuction/mvi/CallAuctionViewModel$countDown$1$3\n+ 2 LogInfo.kt\ncom/kubi/spot/loginfo/LogInfoKt\n*L\n1#1,333:1\n8#2,2:334\n8#2,2:336\n8#2,2:338\n8#2,2:340\n*S KotlinDebug\n*F\n+ 1 CallAuctionViewModel.kt\ncom/kubi/spot/business/callAuction/mvi/CallAuctionViewModel$countDown$1$3\n*L\n266#1:334,2\n271#1:336,2\n276#1:338,2\n281#1:340,2\n*E\n"})
    public static final class C247613 extends SuspendLambda implements Function3<InterfaceC41635f<? super Long>, Throwable, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ CallAuctionViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C247613(CallAuctionViewModel callAuctionViewModel, Continuation<? super C247613> continuation) {
            super(3, continuation);
            this.this$0 = callAuctionViewModel;
        }

        @Override // p852kotlin.jvm.functions.Function3
        public final Object invoke(InterfaceC41635f<? super Long> interfaceC41635f, Throwable th2, Continuation<? super Unit> continuation) {
            C247613 c247613 = new C247613(this.this$0, continuation);
            c247613.L$0 = th2;
            return c247613.invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x008d, code lost:
        
            if (r11.m60544J(r10) == r1) goto L35;
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x00d4, code lost:
        
            if (com.kubi.spot.business.callAuction.mvi.CallAuctionViewModel.m60546L(r11, false, r10, 1, null) == r1) goto L35;
         */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x011a, code lost:
        
            if (com.kubi.spot.business.callAuction.mvi.CallAuctionViewModel.m60546L(r11, false, r10, 1, null) == r1) goto L35;
         */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Throwable th2 = (Throwable) this.L$0;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure(obj);
                    C44128b.m97266j("trade|Spot|CallAuctionViewModel", "倒计时结束");
                    if (th2 == null) {
                        if (((UIState) this.this$0.getState()).getPhase() == CallAuctionContract$Phase.Phase1) {
                            this.L$0 = SpillingKt.nullOutSpilledVariable(th2);
                            this.label = 1;
                            if (DelayKt.m90350b(1000L, this) != coroutine_suspended) {
                                C44128b.m97266j("trade|Spot|CallAuctionViewModel", "第一阶段倒计时结束");
                                CallAuctionViewModel callAuctionViewModel = this.this$0;
                                this.L$0 = SpillingKt.nullOutSpilledVariable(th2);
                                this.label = 2;
                            }
                            break;
                        } else {
                            if (((UIState) this.this$0.getState()).getPhase() == CallAuctionContract$Phase.Phase2) {
                                this.L$0 = SpillingKt.nullOutSpilledVariable(th2);
                                this.label = 3;
                                if (DelayKt.m90350b(1000L, this) != coroutine_suspended) {
                                    C44128b.m97266j("trade|Spot|CallAuctionViewModel", "第二阶段倒计时结束");
                                    CallAuctionViewModel callAuctionViewModel2 = this.this$0;
                                    this.L$0 = SpillingKt.nullOutSpilledVariable(th2);
                                    this.label = 4;
                                }
                            } else if (((UIState) this.this$0.getState()).getPhase() == CallAuctionContract$Phase.Phase3) {
                                this.L$0 = SpillingKt.nullOutSpilledVariable(th2);
                                this.label = 5;
                                if (DelayKt.m90350b(1000L, this) != coroutine_suspended) {
                                    C44128b.m97266j("trade|Spot|CallAuctionViewModel", "第三阶段倒计时结束");
                                    CallAuctionViewModel callAuctionViewModel3 = this.this$0;
                                    this.L$0 = SpillingKt.nullOutSpilledVariable(th2);
                                    this.label = 6;
                                }
                            }
                            break;
                        }
                        return coroutine_suspended;
                    }
                    return Unit.INSTANCE;
                case 1:
                    ResultKt.throwOnFailure(obj);
                    C44128b.m97266j("trade|Spot|CallAuctionViewModel", "第一阶段倒计时结束");
                    CallAuctionViewModel callAuctionViewModel4 = this.this$0;
                    this.L$0 = SpillingKt.nullOutSpilledVariable(th2);
                    this.label = 2;
                    break;
                case 2:
                case 4:
                case 6:
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                case 3:
                    ResultKt.throwOnFailure(obj);
                    C44128b.m97266j("trade|Spot|CallAuctionViewModel", "第二阶段倒计时结束");
                    CallAuctionViewModel callAuctionViewModel5 = this.this$0;
                    this.L$0 = SpillingKt.nullOutSpilledVariable(th2);
                    this.label = 4;
                    break;
                case 5:
                    ResultKt.throwOnFailure(obj);
                    C44128b.m97266j("trade|Spot|CallAuctionViewModel", "第三阶段倒计时结束");
                    CallAuctionViewModel callAuctionViewModel6 = this.this$0;
                    this.L$0 = SpillingKt.nullOutSpilledVariable(th2);
                    this.label = 6;
                    break;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    /* JADX INFO: renamed from: com.kubi.spot.business.callAuction.mvi.CallAuctionViewModel$countDown$1$4 */
    /* JADX INFO: compiled from: CallAuctionViewModel.kt */
    @Metadata(m90083d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0003\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0004\u001a\u00020\u0005H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "", "exception", ""}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.spot.business.callAuction.mvi.CallAuctionViewModel$countDown$1$4", m90122f = "CallAuctionViewModel.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    @SourceDebugExtension({"SMAP\nCallAuctionViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CallAuctionViewModel.kt\ncom/kubi/spot/business/callAuction/mvi/CallAuctionViewModel$countDown$1$4\n+ 2 SpotIssue.kt\ncom/kubi/spot/exeption/SpotIssueKt\n*L\n1#1,333:1\n52#2,2:334\n*S KotlinDebug\n*F\n+ 1 CallAuctionViewModel.kt\ncom/kubi/spot/business/callAuction/mvi/CallAuctionViewModel$countDown$1$4\n*L\n287#1:334,2\n*E\n"})
    public static final class C247624 extends SuspendLambda implements Function3<InterfaceC41635f<? super Long>, Throwable, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        public C247624(Continuation<? super C247624> continuation) {
            super(3, continuation);
        }

        @Override // p852kotlin.jvm.functions.Function3
        public final Object invoke(InterfaceC41635f<? super Long> interfaceC41635f, Throwable th2, Continuation<? super Unit> continuation) {
            C247624 c247624 = new C247624(continuation);
            c247624.L$0 = th2;
            return c247624.invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Throwable th2 = (Throwable) this.L$0;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            String message = th2.getMessage();
            if (message != null) {
                String simpleName = CallAuctionViewModel.class.getSimpleName();
                Intrinsics.checkNotNullExpressionValue(simpleName, "getSimpleName(...)");
                C43846g.m96568c(new SpotMessage(message, simpleName, false, 4, null), null, 2, null);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CallAuctionViewModel$countDown$1(long j11, Ref.LongRef longRef, Ref.LongRef longRef2, Ref.LongRef longRef3, long j12, CallAuctionViewModel callAuctionViewModel, Continuation<? super CallAuctionViewModel$countDown$1> continuation) {
        super(2, continuation);
        this.$remainSec = j11;
        this.$cycleCount = longRef;
        this.$firstTime = longRef2;
        this.$delayTime = longRef3;
        this.$timeInterval = j12;
        this.this$0 = callAuctionViewModel;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CallAuctionViewModel$countDown$1(this.$remainSec, this.$cycleCount, this.$firstTime, this.$delayTime, this.$timeInterval, this.this$0, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((CallAuctionViewModel$countDown$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
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
            InterfaceC41634e interfaceC41634eM90917h = C41636g.m90917h(C41636g.m90895S(C41636g.m90896T(C41636g.m90890N(C41636g.m90887K(new C247591(this.$remainSec, this.$cycleCount, this.$firstTime, this.$delayTime, this.$timeInterval, null)), C42911a.m94120b()), new C247602(this.this$0, null)), new C247613(this.this$0, null)), new C247624(null));
            this.label = 1;
            if (C41636g.m90923k(interfaceC41634eM90917h, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
