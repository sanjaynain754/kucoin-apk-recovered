package com.kubi.futures.classic.cross;

import androidx.exifinterface.media.ExifInterface;
import androidx.media3.extractor.p021ts.PsExtractor;
import cm.FuturesStreamsData;
import com.kubi.kumex.data.trade.model.ComposeUserEntity;
import com.kubi.utils.extensions.C27025c;
import kotlinx.coroutines.flow.C41636g;
import kotlinx.coroutines.flow.InterfaceC41634e;
import kotlinx.coroutines.flow.InterfaceC41635f;
import p342ih.C38609v;
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
import p852kotlin.jvm.functions.Function3;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: com.kubi.futures.classic.cross.CrossBizInterfaceImpl$observeStreamKeyData$$inlined$flatMapLatest$1 */
/* JADX INFO: compiled from: Merge.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\b\u0012\u0004\u0012\u0002H\u00020\u00042\u0006\u0010\u0005\u001a\u0002H\u0003H\n¨\u0006\u0006"}, m90084d2 = {"<anonymous>", "", "R", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/coroutines/flow/FlowCollector;", "it", "kotlinx/coroutines/flow/FlowKt__MergeKt$flatMapLatest$1"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.futures.classic.cross.CrossBizInterfaceImpl$observeStreamKeyData$$inlined$flatMapLatest$1", m90122f = "CrossBizInterfaceImpl.kt", m90123i = {0, 0}, m90124l = {PsExtractor.PRIVATE_STREAM_1}, m90125m = "invokeSuspend", m90126n = {"$this$transformLatest", "it"}, m90127s = {"L$0", "L$1"})
@SourceDebugExtension({"SMAP\nMerge.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Merge.kt\nkotlinx/coroutines/flow/FlowKt__MergeKt$flatMapLatest$1\n+ 2 CrossBizInterfaceImpl.kt\ncom/kubi/futures/classic/cross/CrossBizInterfaceImpl\n+ 3 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 4 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 5 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,189:1\n179#2,2:190\n190#2,2:197\n49#3:192\n51#3:196\n46#4:193\n51#4:195\n105#5:194\n*S KotlinDebug\n*F\n+ 1 CrossBizInterfaceImpl.kt\ncom/kubi/futures/classic/cross/CrossBizInterfaceImpl\n*L\n180#1:192\n180#1:196\n180#1:193\n180#1:195\n180#1:194\n*E\n"})
public final class C12830x8cf9c673 extends SuspendLambda implements Function3<InterfaceC41635f<? super FuturesStreamsData>, Boolean, Continuation<? super Unit>, Object> {
    final /* synthetic */ C38609v $manager$inlined;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12830x8cf9c673(Continuation continuation, C38609v c38609v) {
        super(3, continuation);
        this.$manager$inlined = c38609v;
    }

    @Override // p852kotlin.jvm.functions.Function3
    public final Object invoke(InterfaceC41635f<? super FuturesStreamsData> interfaceC41635f, Boolean bool, Continuation<? super Unit> continuation) {
        C12830x8cf9c673 c12830x8cf9c673 = new C12830x8cf9c673(continuation, this.$manager$inlined);
        c12830x8cf9c673.L$0 = interfaceC41635f;
        c12830x8cf9c673.L$1 = bool;
        return c12830x8cf9c673.invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        InterfaceC41634e<FuturesStreamsData> interfaceC41634eM90889M;
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
            InterfaceC41635f interfaceC41635f = (InterfaceC41635f) this.L$0;
            Object obj2 = this.L$1;
            if (((Boolean) obj2).booleanValue()) {
                final InterfaceC41634e interfaceC41634eM90881E = C41636g.m90881E(this.$manager$inlined.m87314D());
                interfaceC41634eM90889M = new InterfaceC41634e<FuturesStreamsData>() { // from class: com.kubi.futures.classic.cross.CrossBizInterfaceImpl$observeStreamKeyData$lambda$24$$inlined$map$1

                    /* JADX INFO: renamed from: com.kubi.futures.classic.cross.CrossBizInterfaceImpl$observeStreamKeyData$lambda$24$$inlined$map$1$2, reason: invalid class name */
                    /* JADX INFO: compiled from: Emitters.kt */
                    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
                    @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 CrossBizInterfaceImpl.kt\ncom/kubi/futures/classic/cross/CrossBizInterfaceImpl\n*L\n1#1,49:1\n50#2:50\n181#3,7:51\n*E\n"})
                    public static final class AnonymousClass2<T> implements InterfaceC41635f {

                        /* JADX INFO: renamed from: b */
                        public final /* synthetic */ InterfaceC41635f f22546b;

                        /* JADX INFO: renamed from: com.kubi.futures.classic.cross.CrossBizInterfaceImpl$observeStreamKeyData$lambda$24$$inlined$map$1$2$1, reason: invalid class name */
                        @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
                        @DebugMetadata(m90121c = "com.kubi.futures.classic.cross.CrossBizInterfaceImpl$observeStreamKeyData$lambda$24$$inlined$map$1$2", m90122f = "CrossBizInterfaceImpl.kt", m90123i = {0, 0, 0, 0, 0}, m90124l = {50}, m90125m = "emit", m90126n = {"value", "$completion", "value", "$this$map_u24lambda_u245", "$i$a$-unsafeTransform-FlowKt__TransformKt$map$1"}, m90127s = {"L$0", "L$1", "L$2", "L$3", "I$0"})
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
                            this.f22546b = interfaceC41635f;
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
                                InterfaceC41635f interfaceC41635f = this.f22546b;
                                ComposeUserEntity composeUserEntity = (ComposeUserEntity) obj;
                                FuturesStreamsData futuresStreamsData = new FuturesStreamsData(C27025c.m66566d(Boxing.boxBoolean(composeUserEntity.getIsHedge())), composeUserEntity.getPositionWrapper().m5406a(), composeUserEntity.getBalanceWrapper().m5306a(), composeUserEntity.getLeverageWrapper().getLeverages(), composeUserEntity.m33455e());
                                anonymousClass1.L$0 = SpillingKt.nullOutSpilledVariable(obj);
                                anonymousClass1.L$1 = SpillingKt.nullOutSpilledVariable(anonymousClass1);
                                anonymousClass1.L$2 = SpillingKt.nullOutSpilledVariable(obj);
                                anonymousClass1.L$3 = SpillingKt.nullOutSpilledVariable(interfaceC41635f);
                                anonymousClass1.I$0 = 0;
                                anonymousClass1.label = 1;
                                if (interfaceC41635f.emit(futuresStreamsData, anonymousClass1) == coroutine_suspended) {
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
                    public Object collect(InterfaceC41635f<? super FuturesStreamsData> interfaceC41635f2, Continuation continuation) {
                        Object objCollect = interfaceC41634eM90881E.collect(new AnonymousClass2(interfaceC41635f2), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }
                };
            } else {
                interfaceC41634eM90889M = C41636g.m90889M(null);
            }
            this.L$0 = SpillingKt.nullOutSpilledVariable(interfaceC41635f);
            this.L$1 = SpillingKt.nullOutSpilledVariable(obj2);
            this.label = 1;
            if (C41636g.m90878B(interfaceC41635f, interfaceC41634eM90889M, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
