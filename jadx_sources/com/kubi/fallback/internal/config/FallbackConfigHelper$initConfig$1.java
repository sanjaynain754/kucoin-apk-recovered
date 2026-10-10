package com.kubi.fallback.internal.config;

import com.kubi.config.RemoteConfig;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.flow.C41636g;
import kotlinx.coroutines.flow.InterfaceC41634e;
import kotlinx.coroutines.flow.InterfaceC41635f;
import kotlinx.coroutines.rx2.RxConvertKt;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import wf.C45825b;

/* JADX INFO: compiled from: FallbackConfigHelper.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.fallback.internal.config.FallbackConfigHelper$initConfig$1", m90122f = "FallbackConfigHelper.kt", m90123i = {}, m90124l = {81}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
@SourceDebugExtension({"SMAP\nFallbackConfigHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FallbackConfigHelper.kt\ncom/kubi/fallback/internal/config/FallbackConfigHelper$initConfig$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,205:1\n17#2:206\n19#2:210\n46#3:207\n51#3:209\n105#4:208\n*S KotlinDebug\n*F\n+ 1 FallbackConfigHelper.kt\ncom/kubi/fallback/internal/config/FallbackConfigHelper$initConfig$1\n*L\n81#1:206\n81#1:210\n81#1:207\n81#1:209\n81#1:208\n*E\n"})
public final class FallbackConfigHelper$initConfig$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    int label;

    /* JADX INFO: renamed from: com.kubi.fallback.internal.config.FallbackConfigHelper$initConfig$1$2 */
    /* JADX INFO: compiled from: FallbackConfigHelper.kt */
    @Metadata(m90083d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.fallback.internal.config.FallbackConfigHelper$initConfig$1$2", m90122f = "FallbackConfigHelper.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C125952 extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {
        int label;

        public C125952(Continuation<? super C125952> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(Boolean bool, Continuation<? super Unit> continuation) {
            return ((C125952) create(bool, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C125952(continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                C45825b.f103310a.m101239b("need update config data.");
                FallbackConfigHelper.f21941a.m23766o();
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public FallbackConfigHelper$initConfig$1(Continuation<? super FallbackConfigHelper$initConfig$1> continuation) {
        super(2, continuation);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new FallbackConfigHelper$initConfig$1(continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((FallbackConfigHelper$initConfig$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
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
            final InterfaceC41634e interfaceC41634eM91205b = RxConvertKt.m91205b(RemoteConfig.m20460e());
            InterfaceC41634e<Boolean> interfaceC41634e = new InterfaceC41634e<Boolean>() { // from class: com.kubi.fallback.internal.config.FallbackConfigHelper$initConfig$1$invokeSuspend$$inlined$filter$1

                /* JADX INFO: renamed from: com.kubi.fallback.internal.config.FallbackConfigHelper$initConfig$1$invokeSuspend$$inlined$filter$1$2, reason: invalid class name */
                /* JADX INFO: compiled from: Emitters.kt */
                @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
                @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 FallbackConfigHelper.kt\ncom/kubi/fallback/internal/config/FallbackConfigHelper$initConfig$1\n*L\n1#1,49:1\n18#2:50\n19#2:52\n81#3:51\n*E\n"})
                public static final class AnonymousClass2<T> implements InterfaceC41635f {

                    /* JADX INFO: renamed from: b */
                    public final /* synthetic */ InterfaceC41635f f21951b;

                    /* JADX INFO: renamed from: com.kubi.fallback.internal.config.FallbackConfigHelper$initConfig$1$invokeSuspend$$inlined$filter$1$2$1, reason: invalid class name */
                    /* JADX INFO: loaded from: classes13.dex */
                    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
                    @DebugMetadata(m90121c = "com.kubi.fallback.internal.config.FallbackConfigHelper$initConfig$1$invokeSuspend$$inlined$filter$1$2", m90122f = "FallbackConfigHelper.kt", m90123i = {0, 0, 0, 0, 0}, m90124l = {50}, m90125m = "emit", m90126n = {"value", "$completion", "value", "$this$filter_u24lambda_u240", "$i$a$-unsafeTransform-FlowKt__TransformKt$filter$1"}, m90127s = {"L$0", "L$1", "L$2", "L$3", "I$0"})
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
                            return AnonymousClass2.this.emit(null, this);
                        }
                    }

                    public AnonymousClass2(InterfaceC41635f interfaceC41635f) {
                        this.f21951b = interfaceC41635f;
                    }

                    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                    @Override // kotlinx.coroutines.flow.InterfaceC41635f
                    public final Object emit(Object obj, Continuation continuation) {
                        AnonymousClass1 anonymousClass1;
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
                            InterfaceC41635f interfaceC41635f = this.f21951b;
                            Boolean bool = (Boolean) obj;
                            Intrinsics.checkNotNull(bool);
                            if (bool.booleanValue()) {
                                anonymousClass1.L$0 = SpillingKt.nullOutSpilledVariable(obj);
                                anonymousClass1.L$1 = SpillingKt.nullOutSpilledVariable(anonymousClass1);
                                anonymousClass1.L$2 = SpillingKt.nullOutSpilledVariable(obj);
                                anonymousClass1.L$3 = SpillingKt.nullOutSpilledVariable(interfaceC41635f);
                                anonymousClass1.I$0 = 0;
                                anonymousClass1.label = 1;
                                if (interfaceC41635f.emit(obj, anonymousClass1) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
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
                    Object objCollect = interfaceC41634eM91205b.collect(new AnonymousClass2(interfaceC41635f), continuation);
                    return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                }
            };
            C125952 c125952 = new C125952(null);
            this.label = 1;
            if (C41636g.m90925l(interfaceC41634e, c125952, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
