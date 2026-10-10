package com.kubi.assets.overview.ongoing;

import com.tencent.thumbplayer.tcmedia.core.player.TPNativePlayerInitConfig;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.flow.C41636g;
import kotlinx.coroutines.flow.InterfaceC41635f;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: AssetOnGoingViewModel.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.assets.overview.ongoing.AssetOnGoingViewModel$startTimer$1", m90122f = "AssetOnGoingViewModel.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class AssetOnGoingViewModel$startTimer$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ AssetOnGoingViewModel this$0;

    /* JADX INFO: renamed from: com.kubi.assets.overview.ongoing.AssetOnGoingViewModel$startTimer$1$1 */
    /* JADX INFO: compiled from: AssetOnGoingViewModel.kt */
    @Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.assets.overview.ongoing.AssetOnGoingViewModel$startTimer$1$1", m90122f = "AssetOnGoingViewModel.kt", m90123i = {0, 1}, m90124l = {TPNativePlayerInitConfig.BOOL_ENABLE_COLOR_MANAGEMENT, 408}, m90125m = "invokeSuspend", m90126n = {"$this$flow", "$this$flow"}, m90127s = {"L$0", "L$0"})
    public static final class C107531 extends SuspendLambda implements Function2<InterfaceC41635f<? super Unit>, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        public C107531(Continuation<? super C107531> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C107531 c107531 = new C107531(continuation);
            c107531.L$0 = obj;
            return c107531;
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC41635f<? super Unit> interfaceC41635f, Continuation<? super Unit> continuation) {
            return ((C107531) create(interfaceC41635f, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:11:0x0022  */
        /* JADX WARN: Code duplicated, block: B:14:0x002f  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0039 -> B:11:0x0022). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = r7.L$0
                kotlinx.coroutines.flow.f r0 = (kotlinx.coroutines.flow.InterfaceC41635f) r0
                java.lang.Object r1 = p852kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r2 = r7.label
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L1f
                if (r2 == r4) goto L1b
                if (r2 != r3) goto L13
                goto L1f
            L13:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L1b:
                p852kotlin.ResultKt.throwOnFailure(r8)
                goto L2f
            L1f:
                p852kotlin.ResultKt.throwOnFailure(r8)
            L22:
                kotlin.Unit r8 = p852kotlin.Unit.INSTANCE
                r7.L$0 = r0
                r7.label = r4
                java.lang.Object r8 = r0.emit(r8, r7)
                if (r8 != r1) goto L2f
                goto L3b
            L2f:
                r7.L$0 = r0
                r7.label = r3
                r5 = 15000(0x3a98, double:7.411E-320)
                java.lang.Object r8 = kotlinx.coroutines.DelayKt.m90350b(r5, r7)
                if (r8 != r1) goto L22
            L3b:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.kubi.assets.overview.ongoing.AssetOnGoingViewModel$startTimer$1.C107531.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: com.kubi.assets.overview.ongoing.AssetOnGoingViewModel$startTimer$1$2 */
    /* JADX INFO: compiled from: AssetOnGoingViewModel.kt */
    @Metadata(m90083d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, m90084d2 = {"<anonymous>", "", "it"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.assets.overview.ongoing.AssetOnGoingViewModel$startTimer$1$2", m90122f = "AssetOnGoingViewModel.kt", m90123i = {}, m90124l = {411}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C107542 extends SuspendLambda implements Function2<Unit, Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ AssetOnGoingViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C107542(AssetOnGoingViewModel assetOnGoingViewModel, Continuation<? super C107542> continuation) {
            super(2, continuation);
            this.this$0 = assetOnGoingViewModel;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C107542(this.this$0, continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(Unit unit, Continuation<? super Unit> continuation) {
            return ((C107542) create(unit, continuation)).invokeSuspend(Unit.INSTANCE);
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
                AssetOnGoingViewModel assetOnGoingViewModel = this.this$0;
                this.label = 1;
                if (assetOnGoingViewModel.m18728E(false, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AssetOnGoingViewModel$startTimer$1(AssetOnGoingViewModel assetOnGoingViewModel, Continuation<? super AssetOnGoingViewModel$startTimer$1> continuation) {
        super(2, continuation);
        this.this$0 = assetOnGoingViewModel;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AssetOnGoingViewModel$startTimer$1(this.this$0, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((AssetOnGoingViewModel$startTimer$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            C41636g.m90891O(C41636g.m90896T(C41636g.m90887K(new C107531(null)), new C107542(this.this$0, null)), this.this$0.f18411W);
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
