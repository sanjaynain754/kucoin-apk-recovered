package com.kubi.unify.account;

import com.kubi.network.retrofit.utils.C19334f;
import com.kubi.network.retrofit.utils.RetrofitFlowExKt;
import com.kubi.unify.entity.UnifyExam;
import com.kubi.utils.C27099x;
import com.kubi.utils.extensions.C27041f;
import java.util.List;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.flow.C41636g;
import kotlinx.coroutines.flow.InterfaceC41634e;
import kotlinx.coroutines.flow.InterfaceC41635f;
import o00.C42911a;
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
import p852kotlin.jvm.internal.SourceDebugExtension;
import ro.C44128b;

/* JADX INFO: compiled from: UnifyAccountViewModel.kt */
/* JADX INFO: loaded from: classes52.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.unify.account.UnifyAccountViewModel$fetchUnifyExam$1", m90122f = "UnifyAccountViewModel.kt", m90123i = {}, m90124l = {95}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
@SourceDebugExtension({"SMAP\nUnifyAccountViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UnifyAccountViewModel.kt\ncom/kubi/unify/account/UnifyAccountViewModel$fetchUnifyExam$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n+ 5 RetrofitFlowEx.kt\ncom/kubi/network/retrofit/utils/RetrofitFlowExKt\n+ 6 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,120:1\n49#2:121\n51#2:125\n46#3:122\n51#3:124\n105#4:123\n25#5:126\n26#5:128\n1#6:127\n*S KotlinDebug\n*F\n+ 1 UnifyAccountViewModel.kt\ncom/kubi/unify/account/UnifyAccountViewModel$fetchUnifyExam$1\n*L\n94#1:121\n94#1:125\n94#1:122\n94#1:124\n94#1:123\n98#1:126\n98#1:128\n98#1:127\n*E\n"})
public final class UnifyAccountViewModel$fetchUnifyExam$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ UnifyAccountViewModel this$0;

    /* JADX INFO: renamed from: com.kubi.unify.account.UnifyAccountViewModel$fetchUnifyExam$1$2 */
    /* JADX INFO: compiled from: UnifyAccountViewModel.kt */
    @Metadata(m90083d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", "", "Lcom/kubi/unify/entity/UnifyExam;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.unify.account.UnifyAccountViewModel$fetchUnifyExam$1$2", m90122f = "UnifyAccountViewModel.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C264682 extends SuspendLambda implements Function2<List<? extends UnifyExam>, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ UnifyAccountViewModel this$0;

        @Override // p852kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(List<? extends UnifyExam> list, Continuation<? super Unit> continuation) {
            return invoke2((List<UnifyExam>) list, continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C264682(UnifyAccountViewModel unifyAccountViewModel, Continuation<? super C264682> continuation) {
            super(2, continuation);
            this.this$0 = unifyAccountViewModel;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C264682 c264682 = new C264682(this.this$0, continuation);
            c264682.L$0 = obj;
            return c264682;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(List<UnifyExam> list, Continuation<? super Unit> continuation) {
            return ((C264682) create(list, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            List list = (List) this.L$0;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            this.this$0.f53114c0.setValue(list);
            this.this$0.f53108W.setValue(Boxing.boxBoolean(false));
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnifyAccountViewModel$fetchUnifyExam$1(UnifyAccountViewModel unifyAccountViewModel, Continuation<? super UnifyAccountViewModel$fetchUnifyExam$1> continuation) {
        super(2, continuation);
        this.this$0 = unifyAccountViewModel;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new UnifyAccountViewModel$fetchUnifyExam$1(this.this$0, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((UnifyAccountViewModel$fetchUnifyExam$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        UnifyAccountViewModel$fetchUnifyExam$1 unifyAccountViewModel$fetchUnifyExam$1;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 == 1) {
                ResultKt.throwOnFailure(obj);
                unifyAccountViewModel$fetchUnifyExam$1 = this;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            final InterfaceC41634e<String> interfaceC41634eM86738e = this.this$0.m64946w().m86738e();
            InterfaceC41634e<List<? extends UnifyExam>> interfaceC41634e = new InterfaceC41634e<List<? extends UnifyExam>>() { // from class: com.kubi.unify.account.UnifyAccountViewModel$fetchUnifyExam$1$invokeSuspend$$inlined$map$1

                /* JADX INFO: renamed from: com.kubi.unify.account.UnifyAccountViewModel$fetchUnifyExam$1$invokeSuspend$$inlined$map$1$2, reason: invalid class name */
                /* JADX INFO: compiled from: Emitters.kt */
                @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
                @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 UnifyAccountViewModel.kt\ncom/kubi/unify/account/UnifyAccountViewModel$fetchUnifyExam$1\n+ 4 GsonUtils.kt\ncom/kubi/utils/GsonUtils\n*L\n1#1,49:1\n50#2:50\n94#3:51\n196#4,3:52\n*S KotlinDebug\n*F\n+ 1 UnifyAccountViewModel.kt\ncom/kubi/unify/account/UnifyAccountViewModel$fetchUnifyExam$1\n*L\n94#1:52,3\n*E\n"})
                public static final class AnonymousClass2<T> implements InterfaceC41635f {

                    /* JADX INFO: renamed from: b */
                    public final /* synthetic */ InterfaceC41635f f53117b;

                    /* JADX INFO: renamed from: com.kubi.unify.account.UnifyAccountViewModel$fetchUnifyExam$1$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
                    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
                    @DebugMetadata(m90121c = "com.kubi.unify.account.UnifyAccountViewModel$fetchUnifyExam$1$invokeSuspend$$inlined$map$1$2", m90122f = "UnifyAccountViewModel.kt", m90123i = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1}, m90124l = {54, 50}, m90125m = "emit", m90126n = {"value", "$completion", "value", "$this$map_u24lambda_u245", "$completion", "it", "this_$iv", "json$iv", "$completion$iv", "$i$a$-unsafeTransform-FlowKt__TransformKt$map$1", "$i$a$-map-UnifyAccountViewModel$fetchUnifyExam$1$1", "$i$f$fromJsonOrNull", "value", "$completion", "value", "$this$map_u24lambda_u245", "$i$a$-unsafeTransform-FlowKt__TransformKt$map$1"}, m90127s = {"L$0", "L$1", "L$2", "L$3", "L$5", "L$6", "L$7", "L$8", "L$9", "I$0", "I$1", "I$2", "L$0", "L$1", "L$2", "L$3", "I$0"})
                    public static final class AnonymousClass1 extends ContinuationImpl {
                        int I$0;
                        int I$1;
                        int I$2;
                        Object L$0;
                        Object L$1;
                        Object L$2;
                        Object L$3;
                        Object L$4;
                        Object L$5;
                        Object L$6;
                        Object L$7;
                        Object L$8;
                        Object L$9;
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
                        this.f53117b = interfaceC41635f;
                    }

                    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                    /* JADX WARN: Code restructure failed: missing block: B:21:0x0104, code lost:
                    
                        if (r2.emit(r4, r0) == r1) goto L22;
                     */
                    @Override // kotlinx.coroutines.flow.InterfaceC41635f
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final Object emit(Object obj, Continuation continuation) {
                        AnonymousClass1 anonymousClass1;
                        int i11;
                        Object objM90914f0;
                        Object obj2;
                        AnonymousClass1 anonymousClass2;
                        InterfaceC41635f interfaceC41635f;
                        InterfaceC41635f interfaceC41635f2;
                        if (continuation instanceof AnonymousClass1) {
                            anonymousClass1 = (AnonymousClass1) continuation;
                            int i12 = anonymousClass1.label;
                            if ((i12 & Integer.MIN_VALUE) != 0) {
                                anonymousClass1.label = i12 - Integer.MIN_VALUE;
                            } else {
                                anonymousClass1 = new AnonymousClass1(continuation);
                            }
                        } else {
                            anonymousClass1 = new AnonymousClass1(continuation);
                        }
                        Object obj3 = anonymousClass1.result;
                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        int i13 = anonymousClass1.label;
                        if (i13 != 0) {
                            if (i13 == 1) {
                                int i14 = anonymousClass1.I$0;
                                InterfaceC41635f interfaceC41635f3 = (InterfaceC41635f) anonymousClass1.L$4;
                                InterfaceC41635f interfaceC41635f4 = (InterfaceC41635f) anonymousClass1.L$3;
                                obj2 = anonymousClass1.L$2;
                                AnonymousClass1 anonymousClass3 = (AnonymousClass1) anonymousClass1.L$1;
                                Object obj4 = anonymousClass1.L$0;
                                ResultKt.throwOnFailure(obj3);
                                i11 = i14;
                                obj = obj4;
                                anonymousClass2 = anonymousClass3;
                                interfaceC41635f = interfaceC41635f4;
                                objM90914f0 = obj3;
                                interfaceC41635f2 = interfaceC41635f3;
                            } else {
                                if (i13 != 2) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                ResultKt.throwOnFailure(obj3);
                            }
                            return Unit.INSTANCE;
                        }
                        ResultKt.throwOnFailure(obj3);
                        InterfaceC41635f interfaceC41635f5 = this.f53117b;
                        String str = (String) obj;
                        C27099x c27099x = C27099x.f54458a;
                        String strM66668h = C27041f.m66668h(str);
                        InterfaceC41634e interfaceC41634eM90890N = C41636g.m90890N(C41636g.m90887K(new C26470x36795e9a(strM66668h, null)), C42911a.m94120b());
                        anonymousClass1.L$0 = SpillingKt.nullOutSpilledVariable(obj);
                        anonymousClass1.L$1 = SpillingKt.nullOutSpilledVariable(anonymousClass1);
                        anonymousClass1.L$2 = SpillingKt.nullOutSpilledVariable(obj);
                        anonymousClass1.L$3 = SpillingKt.nullOutSpilledVariable(interfaceC41635f5);
                        anonymousClass1.L$4 = interfaceC41635f5;
                        anonymousClass1.L$5 = SpillingKt.nullOutSpilledVariable(anonymousClass1);
                        anonymousClass1.L$6 = SpillingKt.nullOutSpilledVariable(str);
                        anonymousClass1.L$7 = SpillingKt.nullOutSpilledVariable(c27099x);
                        anonymousClass1.L$8 = SpillingKt.nullOutSpilledVariable(strM66668h);
                        anonymousClass1.L$9 = SpillingKt.nullOutSpilledVariable(anonymousClass1);
                        i11 = 0;
                        anonymousClass1.I$0 = 0;
                        anonymousClass1.I$1 = 0;
                        anonymousClass1.I$2 = 0;
                        anonymousClass1.label = 1;
                        objM90914f0 = C41636g.m90914f0(interfaceC41634eM90890N, anonymousClass1);
                        if (objM90914f0 != coroutine_suspended) {
                            obj2 = obj;
                            anonymousClass2 = anonymousClass1;
                            interfaceC41635f = interfaceC41635f5;
                            interfaceC41635f2 = interfaceC41635f5;
                        }
                        return coroutine_suspended;
                        anonymousClass1.L$0 = SpillingKt.nullOutSpilledVariable(obj);
                        anonymousClass1.L$1 = SpillingKt.nullOutSpilledVariable(anonymousClass2);
                        anonymousClass1.L$2 = SpillingKt.nullOutSpilledVariable(obj2);
                        anonymousClass1.L$3 = SpillingKt.nullOutSpilledVariable(interfaceC41635f);
                        anonymousClass1.L$4 = null;
                        anonymousClass1.L$5 = null;
                        anonymousClass1.L$6 = null;
                        anonymousClass1.L$7 = null;
                        anonymousClass1.L$8 = null;
                        anonymousClass1.L$9 = null;
                        anonymousClass1.I$0 = i11;
                        anonymousClass1.label = 2;
                    }
                }

                @Override // kotlinx.coroutines.flow.InterfaceC41634e
                public Object collect(InterfaceC41635f<? super List<? extends UnifyExam>> interfaceC41635f, Continuation continuation) {
                    Object objCollect = interfaceC41634eM86738e.collect(new AnonymousClass2(interfaceC41635f), continuation);
                    return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                }
            };
            C264682 c264682 = new C264682(this.this$0, null);
            this.label = 1;
            unifyAccountViewModel$fetchUnifyExam$1 = this;
            obj = RetrofitFlowExKt.m42824e(interfaceC41634e, false, c264682, unifyAccountViewModel$fetchUnifyExam$1, 1, null);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        UnifyAccountViewModel unifyAccountViewModel = unifyAccountViewModel$fetchUnifyExam$1.this$0;
        Throwable throwable = ((C19334f) obj).getThrowable();
        if (throwable != null) {
            unifyAccountViewModel.f53108W.setValue(Boxing.boxBoolean(false));
            C44128b.m97264h(throwable);
        }
        return Unit.INSTANCE;
    }
}
