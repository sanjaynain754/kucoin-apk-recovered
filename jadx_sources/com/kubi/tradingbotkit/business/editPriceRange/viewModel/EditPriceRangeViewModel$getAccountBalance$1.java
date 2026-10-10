package com.kubi.tradingbotkit.business.editPriceRange.viewModel;

import com.kubi.network.retrofit.utils.C19334f;
import com.kubi.network.retrofit.utils.RetrofitFlowExKt;
import com.kubi.tradingbotkit.entity.CurrencyBalanceEntity;
import com.kubi.tradingbotkit.exeption.BotMessage;
import com.kubi.tradingbotkit.model.CurrencyBalanceModel;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.flow.InterfaceC41634e;
import kotlinx.coroutines.flow.InterfaceC41635f;
import p569qq.C43846g;
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
import p852kotlin.jvm.internal.SourceDebugExtension;
import q50.C43633a;

/* JADX INFO: compiled from: EditPriceRangeViewModel.kt */
/* JADX INFO: loaded from: classes51.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.tradingbotkit.business.editPriceRange.viewModel.EditPriceRangeViewModel$getAccountBalance$1", m90122f = "EditPriceRangeViewModel.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class EditPriceRangeViewModel$getAccountBalance$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $quoteCurrency;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ EditPriceRangeViewModel this$0;

    /* JADX INFO: renamed from: com.kubi.tradingbotkit.business.editPriceRange.viewModel.EditPriceRangeViewModel$getAccountBalance$1$1 */
    /* JADX INFO: compiled from: EditPriceRangeViewModel.kt */
    @Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.tradingbotkit.business.editPriceRange.viewModel.EditPriceRangeViewModel$getAccountBalance$1$1", m90122f = "EditPriceRangeViewModel.kt", m90123i = {}, m90124l = {120}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    @SourceDebugExtension({"SMAP\nEditPriceRangeViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EditPriceRangeViewModel.kt\ncom/kubi/tradingbotkit/business/editPriceRange/viewModel/EditPriceRangeViewModel$getAccountBalance$1$1\n+ 2 TradingBotIssue.kt\ncom/kubi/tradingbotkit/exeption/TradingBotIssueKt\n+ 3 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 4 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 5 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n+ 6 RetrofitFlowEx.kt\ncom/kubi/network/retrofit/utils/RetrofitFlowExKt\n+ 7 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,227:1\n51#2,2:228\n49#3:230\n51#3:234\n46#4:231\n51#4:233\n105#5:232\n25#6:235\n26#6:237\n1#7:236\n*S KotlinDebug\n*F\n+ 1 EditPriceRangeViewModel.kt\ncom/kubi/tradingbotkit/business/editPriceRange/viewModel/EditPriceRangeViewModel$getAccountBalance$1$1\n*L\n109#1:228,2\n117#1:230\n117#1:234\n117#1:231\n117#1:233\n117#1:232\n122#1:235\n122#1:237\n122#1:236\n*E\n"})
    public static final class C261601 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $quoteCurrency;
        int label;
        final /* synthetic */ EditPriceRangeViewModel this$0;

        /* JADX INFO: renamed from: com.kubi.tradingbotkit.business.editPriceRange.viewModel.EditPriceRangeViewModel$getAccountBalance$1$1$2, reason: invalid class name */
        /* JADX INFO: compiled from: EditPriceRangeViewModel.kt */
        @Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", "Lcom/kubi/tradingbotkit/model/CurrencyBalanceModel;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
        @DebugMetadata(m90121c = "com.kubi.tradingbotkit.business.editPriceRange.viewModel.EditPriceRangeViewModel$getAccountBalance$1$1$2", m90122f = "EditPriceRangeViewModel.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
        public static final class AnonymousClass2 extends SuspendLambda implements Function2<CurrencyBalanceModel, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ EditPriceRangeViewModel this$0;

            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(CurrencyBalanceModel currencyBalanceModel, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(currencyBalanceModel, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(EditPriceRangeViewModel editPriceRangeViewModel, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = editPriceRangeViewModel;
            }

            @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
                anonymousClass2.L$0 = obj;
                return anonymousClass2;
            }

            @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CurrencyBalanceModel currencyBalanceModel = (CurrencyBalanceModel) this.L$0;
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                this.this$0.m64051M().setValue(currencyBalanceModel);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C261601(String str, EditPriceRangeViewModel editPriceRangeViewModel, Continuation<? super C261601> continuation) {
            super(2, continuation);
            this.$quoteCurrency = str;
            this.this$0 = editPriceRangeViewModel;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C261601(this.$quoteCurrency, this.this$0, continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
            return ((C261601) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            C261601 c261601;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.label;
            if (i11 != 0) {
                if (i11 == 1) {
                    ResultKt.throwOnFailure(obj);
                    c261601 = this;
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                String str = this.$quoteCurrency;
                if (str == null || str.length() == 0) {
                    C43846g.m96568c(new BotMessage("EditPriceRangeViewModel：quoteCurrency is empty", "v1/account/currency-balance", false, 4, null), null, 2, null);
                }
                final InterfaceC41634e interfaceC41634eB = this.this$0.getF52378W().b("TRADE", this.$quoteCurrency);
                InterfaceC41634e<CurrencyBalanceModel> interfaceC41634e = new InterfaceC41634e<CurrencyBalanceModel>() { // from class: com.kubi.tradingbotkit.business.editPriceRange.viewModel.EditPriceRangeViewModel$getAccountBalance$1$1$invokeSuspend$$inlined$map$1

                    /* JADX INFO: renamed from: com.kubi.tradingbotkit.business.editPriceRange.viewModel.EditPriceRangeViewModel$getAccountBalance$1$1$invokeSuspend$$inlined$map$1$2, reason: invalid class name */
                    /* JADX INFO: compiled from: Emitters.kt */
                    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
                    @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 EditPriceRangeViewModel.kt\ncom/kubi/tradingbotkit/business/editPriceRange/viewModel/EditPriceRangeViewModel$getAccountBalance$1$1\n*L\n1#1,49:1\n50#2:50\n118#3,2:51\n*E\n"})
                    public static final class AnonymousClass2<T> implements InterfaceC41635f {

                        /* JADX INFO: renamed from: b */
                        public final /* synthetic */ InterfaceC41635f f52395b;

                        /* JADX INFO: renamed from: com.kubi.tradingbotkit.business.editPriceRange.viewModel.EditPriceRangeViewModel$getAccountBalance$1$1$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
                        @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
                        @DebugMetadata(m90121c = "com.kubi.tradingbotkit.business.editPriceRange.viewModel.EditPriceRangeViewModel$getAccountBalance$1$1$invokeSuspend$$inlined$map$1$2", m90122f = "EditPriceRangeViewModel.kt", m90123i = {0, 0, 0, 0, 0}, m90124l = {50}, m90125m = "emit", m90126n = {"value", "$completion", "value", "$this$map_u24lambda_u245", "$i$a$-unsafeTransform-FlowKt__TransformKt$map$1"}, m90127s = {"L$0", "L$1", "L$2", "L$3", "I$0"})
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
                            this.f52395b = interfaceC41635f;
                        }

                        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                        @Override // kotlinx.coroutines.flow.InterfaceC41635f
                        public final Object emit(Object obj, Continuation continuation) throws IllegalAccessException {
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
                                InterfaceC41635f interfaceC41635f = this.f52395b;
                                CurrencyBalanceModel currencyBalanceModelM96029a = new C43633a().m96029a((CurrencyBalanceEntity) obj);
                                anonymousClass1.L$0 = SpillingKt.nullOutSpilledVariable(obj);
                                anonymousClass1.L$1 = SpillingKt.nullOutSpilledVariable(anonymousClass1);
                                anonymousClass1.L$2 = SpillingKt.nullOutSpilledVariable(obj);
                                anonymousClass1.L$3 = SpillingKt.nullOutSpilledVariable(interfaceC41635f);
                                anonymousClass1.I$0 = 0;
                                anonymousClass1.label = 1;
                                if (interfaceC41635f.emit(currencyBalanceModelM96029a, anonymousClass1) == coroutine_suspended) {
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
                    public Object collect(InterfaceC41635f<? super CurrencyBalanceModel> interfaceC41635f, Continuation continuation) {
                        Object objCollect = interfaceC41634eB.collect(new AnonymousClass2(interfaceC41635f), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }
                };
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, null);
                this.label = 1;
                c261601 = this;
                obj = RetrofitFlowExKt.m42824e(interfaceC41634e, false, anonymousClass2, c261601, 1, null);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            EditPriceRangeViewModel editPriceRangeViewModel = c261601.this$0;
            Throwable throwable = ((C19334f) obj).getThrowable();
            if (throwable != null) {
                editPriceRangeViewModel.m64056U(throwable);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EditPriceRangeViewModel$getAccountBalance$1(String str, EditPriceRangeViewModel editPriceRangeViewModel, Continuation<? super EditPriceRangeViewModel$getAccountBalance$1> continuation) {
        super(2, continuation);
        this.$quoteCurrency = str;
        this.this$0 = editPriceRangeViewModel;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        EditPriceRangeViewModel$getAccountBalance$1 editPriceRangeViewModel$getAccountBalance$1 = new EditPriceRangeViewModel$getAccountBalance$1(this.$quoteCurrency, this.this$0, continuation);
        editPriceRangeViewModel$getAccountBalance$1.L$0 = obj;
        return editPriceRangeViewModel$getAccountBalance$1;
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((EditPriceRangeViewModel$getAccountBalance$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        InterfaceC41709m0 interfaceC41709m0 = (InterfaceC41709m0) this.L$0;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        C41696j.m91104d(interfaceC41709m0, null, null, new C261601(this.$quoteCurrency, this.this$0, null), 3, null);
        return Unit.INSTANCE;
    }
}
