package com.kubi.payment.channel.fiat;

import androidx.lifecycle.MutableLiveData;
import com.kubi.payment.channel.data.entities.FiatInfoEntity;
import com.kubi.utils.extensions.C27025c;
import java.util.Locale;
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

/* JADX INFO: compiled from: SearchFiatViewModel.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.payment.channel.fiat.SearchFiatViewModel$searchFilter$1", m90122f = "SearchFiatViewModel.kt", m90123i = {}, m90124l = {126}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
@SourceDebugExtension({"SMAP\nSearchFiatViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SearchFiatViewModel.kt\ncom/kubi/payment/channel/fiat/SearchFiatViewModel$searchFilter$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,166:1\n17#2:167\n19#2:171\n46#3:168\n51#3:170\n105#4:169\n*S KotlinDebug\n*F\n+ 1 SearchFiatViewModel.kt\ncom/kubi/payment/channel/fiat/SearchFiatViewModel$searchFilter$1\n*L\n123#1:167\n123#1:171\n123#1:168\n123#1:170\n123#1:169\n*E\n"})
public final class SearchFiatViewModel$searchFilter$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $key;
    Object L$0;
    int label;
    final /* synthetic */ SearchFiatViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchFiatViewModel$searchFilter$1(SearchFiatViewModel searchFiatViewModel, String str, Continuation<? super SearchFiatViewModel$searchFilter$1> continuation) {
        super(2, continuation);
        this.this$0 = searchFiatViewModel;
        this.$key = str;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SearchFiatViewModel$searchFilter$1(this.this$0, this.$key, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((SearchFiatViewModel$searchFilter$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
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
            MutableLiveData mutableLiveData2 = this.this$0.f38270Y;
            final InterfaceC41634e interfaceC41634eM90903a = C41636g.m90903a(this.this$0.f38271Z);
            final String str = this.$key;
            InterfaceC41634e<FiatInfoEntity.FiatInfo> interfaceC41634e = new InterfaceC41634e<FiatInfoEntity.FiatInfo>() { // from class: com.kubi.payment.channel.fiat.SearchFiatViewModel$searchFilter$1$invokeSuspend$$inlined$filter$1

                /* JADX INFO: renamed from: com.kubi.payment.channel.fiat.SearchFiatViewModel$searchFilter$1$invokeSuspend$$inlined$filter$1$2, reason: invalid class name */
                /* JADX INFO: compiled from: Emitters.kt */
                @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
                @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 SearchFiatViewModel.kt\ncom/kubi/payment/channel/fiat/SearchFiatViewModel$searchFilter$1\n+ 4 Strings.kt\nkotlin/text/StringsKt__StringsKt\n*L\n1#1,49:1\n18#2:50\n19#2:76\n124#3,2:51\n106#4:53\n78#4,22:54\n*S KotlinDebug\n*F\n+ 1 SearchFiatViewModel.kt\ncom/kubi/payment/channel/fiat/SearchFiatViewModel$searchFilter$1\n*L\n125#1:53\n125#1:54,22\n*E\n"})
                public static final class AnonymousClass2<T> implements InterfaceC41635f {

                    /* JADX INFO: renamed from: b */
                    public final /* synthetic */ InterfaceC41635f f38276b;

                    /* JADX INFO: renamed from: c */
                    public final /* synthetic */ String f38277c;

                    /* JADX INFO: renamed from: com.kubi.payment.channel.fiat.SearchFiatViewModel$searchFilter$1$invokeSuspend$$inlined$filter$1$2$1, reason: invalid class name */
                    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
                    @DebugMetadata(m90121c = "com.kubi.payment.channel.fiat.SearchFiatViewModel$searchFilter$1$invokeSuspend$$inlined$filter$1$2", m90122f = "SearchFiatViewModel.kt", m90123i = {0, 0, 0, 0, 0}, m90124l = {50}, m90125m = "emit", m90126n = {"value", "$completion", "value", "$this$filter_u24lambda_u240", "$i$a$-unsafeTransform-FlowKt__TransformKt$filter$1"}, m90127s = {"L$0", "L$1", "L$2", "L$3", "I$0"})
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
                        this.f38276b = interfaceC41635f;
                        this.f38277c = str;
                    }

                    /* JADX WARN: Code duplicated, block: B:39:0x00bb  */
                    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
                    @Override // kotlinx.coroutines.flow.InterfaceC41635f
                    public final Object emit(Object obj, Continuation continuation) {
                        AnonymousClass1 anonymousClass1;
                        int i11;
                        String currency;
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
                        Object obj2 = anonymousClass1.result;
                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        int i13 = anonymousClass1.label;
                        int i14 = 1;
                        if (i13 == 0) {
                            ResultKt.throwOnFailure(obj2);
                            InterfaceC41635f interfaceC41635f = this.f38276b;
                            FiatInfoEntity.FiatInfo fiatInfo = (FiatInfoEntity.FiatInfo) obj;
                            Boolean boolBoxBoolean = null;
                            if (fiatInfo == null || (currency = fiatInfo.getCurrency()) == null) {
                                i11 = 1;
                            } else {
                                Locale ROOT = Locale.ROOT;
                                Intrinsics.checkNotNullExpressionValue(ROOT, "ROOT");
                                String lowerCase = currency.toLowerCase(ROOT);
                                Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                                if (lowerCase != null) {
                                    String str = this.f38277c;
                                    int length = str.length() - 1;
                                    int i15 = 0;
                                    int i16 = 0;
                                    while (true) {
                                        if (i15 > length) {
                                            i11 = i14;
                                            break;
                                        }
                                        i11 = i14;
                                        int i17 = Intrinsics.compare((int) str.charAt(i16 == 0 ? i15 : length), 32) <= 0 ? i11 : 0;
                                        if (i16 == 0) {
                                            if (i17 == 0) {
                                                i14 = i11;
                                                i16 = i14;
                                            } else {
                                                i15++;
                                            }
                                        } else {
                                            if (i17 == 0) {
                                                break;
                                            }
                                            length--;
                                        }
                                        i14 = i11;
                                    }
                                    String string = str.subSequence(i15, length + 1).toString();
                                    Locale ROOT2 = Locale.ROOT;
                                    Intrinsics.checkNotNullExpressionValue(ROOT2, "ROOT");
                                    String lowerCase2 = string.toLowerCase(ROOT2);
                                    Intrinsics.checkNotNullExpressionValue(lowerCase2, "toLowerCase(...)");
                                    boolBoxBoolean = Boxing.boxBoolean(StringsKt.contains$default((CharSequence) lowerCase, (CharSequence) lowerCase2, false, 2, (Object) null));
                                } else {
                                    i11 = 1;
                                }
                            }
                            if (C27025c.m66566d(boolBoxBoolean)) {
                                anonymousClass1.L$0 = SpillingKt.nullOutSpilledVariable(obj);
                                anonymousClass1.L$1 = SpillingKt.nullOutSpilledVariable(anonymousClass1);
                                anonymousClass1.L$2 = SpillingKt.nullOutSpilledVariable(obj);
                                anonymousClass1.L$3 = SpillingKt.nullOutSpilledVariable(interfaceC41635f);
                                anonymousClass1.I$0 = 0;
                                anonymousClass1.label = i11;
                                if (interfaceC41635f.emit(obj, anonymousClass1) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            }
                        } else {
                            if (i13 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj2);
                        }
                        return Unit.INSTANCE;
                    }
                }

                @Override // kotlinx.coroutines.flow.InterfaceC41634e
                public Object collect(InterfaceC41635f<? super FiatInfoEntity.FiatInfo> interfaceC41635f, Continuation continuation) {
                    Object objCollect = interfaceC41634eM90903a.collect(new AnonymousClass2(interfaceC41635f, str), continuation);
                    return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                }
            };
            this.L$0 = mutableLiveData2;
            this.label = 1;
            Object objM90761c = FlowKt__CollectionKt.m90761c(interfaceC41634e, null, this, 1, null);
            if (objM90761c == coroutine_suspended) {
                return coroutine_suspended;
            }
            mutableLiveData = mutableLiveData2;
            obj = objM90761c;
        }
        mutableLiveData.setValue(obj);
        return Unit.INSTANCE;
    }
}
