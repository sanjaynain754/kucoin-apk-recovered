package com.kubi.transfer.search.symbol;

import androidx.lifecycle.MutableLiveData;
import com.kubi.transfer.entity.SearchSymbolEntity;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27041f;
import com.tencent.bugly.proguard.C33820nf;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.flow.C41636g;
import kotlinx.coroutines.flow.FlowKt__CollectionKt;
import kotlinx.coroutines.flow.InterfaceC41634e;
import kotlinx.coroutines.flow.InterfaceC41635f;
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
import p852kotlin.text.StringsKt;

/* JADX INFO: compiled from: SearchSymbolViewModel.kt */
/* JADX INFO: loaded from: classes52.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.transfer.search.symbol.SearchSymbolViewModel$searchFilter$1", m90122f = "SearchSymbolViewModel.kt", m90123i = {}, m90124l = {72}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
@SourceDebugExtension({"SMAP\nSearchSymbolViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SearchSymbolViewModel.kt\ncom/kubi/transfer/search/symbol/SearchSymbolViewModel$searchFilter$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,85:1\n17#2:86\n19#2:90\n46#3:87\n51#3:89\n105#4:88\n*S KotlinDebug\n*F\n+ 1 SearchSymbolViewModel.kt\ncom/kubi/transfer/search/symbol/SearchSymbolViewModel$searchFilter$1\n*L\n69#1:86\n69#1:90\n69#1:87\n69#1:89\n69#1:88\n*E\n"})
public final class SearchSymbolViewModel$searchFilter$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $key;
    Object L$0;
    int label;
    final /* synthetic */ SearchSymbolViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchSymbolViewModel$searchFilter$1(SearchSymbolViewModel searchSymbolViewModel, String str, Continuation<? super SearchSymbolViewModel$searchFilter$1> continuation) {
        super(2, continuation);
        this.this$0 = searchSymbolViewModel;
        this.$key = str;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SearchSymbolViewModel$searchFilter$1(this.this$0, this.$key, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((SearchSymbolViewModel$searchFilter$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        MutableLiveData mutableLiveData;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 == 1) {
                mutableLiveData = (MutableLiveData) this.L$0;
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            MutableLiveData mutableLiveDataM64758A = this.this$0.m64758A();
            final InterfaceC41634e interfaceC41634eM90903a = C41636g.m90903a(this.this$0.m64760D());
            final String str = this.$key;
            InterfaceC41634e<SearchSymbolEntity> interfaceC41634e = new InterfaceC41634e<SearchSymbolEntity>() { // from class: com.kubi.transfer.search.symbol.SearchSymbolViewModel$searchFilter$1$invokeSuspend$$inlined$filter$1

                /* JADX INFO: renamed from: com.kubi.transfer.search.symbol.SearchSymbolViewModel$searchFilter$1$invokeSuspend$$inlined$filter$1$2, reason: invalid class name */
                /* JADX INFO: compiled from: Emitters.kt */
                @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
                @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 SearchSymbolViewModel.kt\ncom/kubi/transfer/search/symbol/SearchSymbolViewModel$searchFilter$1\n+ 4 Strings.kt\nkotlin/text/StringsKt__StringsKt\n*L\n1#1,49:1\n18#2:50\n19#2:76\n70#3,2:51\n106#4:53\n78#4,22:54\n*S KotlinDebug\n*F\n+ 1 SearchSymbolViewModel.kt\ncom/kubi/transfer/search/symbol/SearchSymbolViewModel$searchFilter$1\n*L\n71#1:53\n71#1:54,22\n*E\n"})
                public static final class AnonymousClass2<T> implements InterfaceC41635f {

                    /* JADX INFO: renamed from: b */
                    public final /* synthetic */ InterfaceC41635f f52923b;

                    /* JADX INFO: renamed from: c */
                    public final /* synthetic */ String f52924c;

                    /* JADX INFO: renamed from: com.kubi.transfer.search.symbol.SearchSymbolViewModel$searchFilter$1$invokeSuspend$$inlined$filter$1$2$1, reason: invalid class name */
                    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
                    @DebugMetadata(m90121c = "com.kubi.transfer.search.symbol.SearchSymbolViewModel$searchFilter$1$invokeSuspend$$inlined$filter$1$2", m90122f = "SearchSymbolViewModel.kt", m90123i = {0, 0, 0, 0, 0}, m90124l = {50}, m90125m = "emit", m90126n = {"value", "$completion", "value", "$this$filter_u24lambda_u240", "$i$a$-unsafeTransform-FlowKt__TransformKt$filter$1"}, m90127s = {"L$0", "L$1", "L$2", "L$3", "I$0"})
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

                    public AnonymousClass2(InterfaceC41635f interfaceC41635f, String str) {
                        this.f52923b = interfaceC41635f;
                        this.f52924c = str;
                    }

                    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                    @Override // kotlinx.coroutines.flow.InterfaceC41635f
                    public final Object emit(Object obj, Continuation continuation) {
                        AnonymousClass1 anonymousClass1;
                        String symbolName;
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
                            InterfaceC41635f interfaceC41635f = this.f52923b;
                            SearchSymbolEntity searchSymbolEntity = (SearchSymbolEntity) obj;
                            String strM66668h = C27041f.m66668h((searchSymbolEntity == null || (symbolName = searchSymbolEntity.getSymbolName()) == null) ? null : StringsKt.replace$default(symbolName, C33820nf.f71144W, "/", false, 4, (Object) null));
                            String str = this.f52924c;
                            int length = str.length() - 1;
                            int i13 = 0;
                            boolean z11 = false;
                            while (i13 <= length) {
                                boolean z12 = Intrinsics.compare((int) str.charAt(!z11 ? i13 : length), 32) <= 0;
                                if (z11) {
                                    if (!z12) {
                                        break;
                                    }
                                    length--;
                                } else if (z12) {
                                    i13++;
                                } else {
                                    z11 = true;
                                }
                            }
                            if (C27025c.m66566d(Boxing.boxBoolean(StringsKt.contains((CharSequence) strM66668h, (CharSequence) str.subSequence(i13, length + 1).toString(), true)))) {
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
                public Object collect(InterfaceC41635f<? super SearchSymbolEntity> interfaceC41635f, Continuation continuation) {
                    Object objCollect = interfaceC41634eM90903a.collect(new AnonymousClass2(interfaceC41635f, str), continuation);
                    return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                }
            };
            this.L$0 = mutableLiveDataM64758A;
            this.label = 1;
            Object objM90761c = FlowKt__CollectionKt.m90761c(interfaceC41634e, null, this, 1, null);
            if (objM90761c == coroutine_suspended) {
                return coroutine_suspended;
            }
            mutableLiveData = mutableLiveDataM64758A;
            obj = objM90761c;
        }
        mutableLiveData.setValue(obj);
        return Unit.INSTANCE;
    }
}
