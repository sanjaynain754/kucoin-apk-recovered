package com.kubi.core.base.quote;

import com.kubi.core.base.quote.inner.SymbolConfigHandler;
import com.kubi.core.base.quote.inner.SymbolQuoteHandler;
import com.kubi.core.spot.api.SpotWSEntity;
import com.kubi.core.spot.helper.TradeManagerProxy;
import com.kubi.data.entity.MaintenanceEntity;
import com.kubi.data.entity.WsMarketSnapshotEntity;
import com.kubi.event.api.C12572a;
import com.kubi.kucoin.api.IKuFacadeService;
import com.kubi.network.restful.C19321b;
import com.kubi.sdk.BaseFragment;
import com.kubi.utils.extensions.DowngradeExKt;
import er.C37237b;
import ge.InterfaceC37871a;
import gr.C38000b;
import gr.C38006h;
import kotlinx.coroutines.flow.C41636g;
import kotlinx.coroutines.flow.InterfaceC41634e;
import kotlinx.coroutines.flow.InterfaceC41635f;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: DefaultSymbolQuoteRepo.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m90083d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\u0018\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u00132\u0006\u0010\u0017\u001a\u00020\u0018H\u0016R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\n\u001a\u00020\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u000fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001b"}, m90084d2 = {"Lcom/kubi/core/base/quote/DefaultSymbolQuoteRepo;", "Lcom/kubi/core/base/quote/ITradeSymbolQuoteDataRepo;", "<init>", "()V", "subQuoteApi", "Lcom/kubi/core/spot/api/ISpotWSDynamicTopic;", "getSubQuoteApi", "()Lcom/kubi/core/spot/api/ISpotWSDynamicTopic;", "subQuoteApi$delegate", "Lkotlin/Lazy;", "symbolQuoteHandler", "Lcom/kubi/core/base/quote/inner/SymbolQuoteHandler;", "getSymbolQuoteHandler", "()Lcom/kubi/core/base/quote/inner/SymbolQuoteHandler;", "symbolConfigHandler", "Lcom/kubi/core/base/quote/inner/SymbolConfigHandler;", "getSymbolConfigHandler", "()Lcom/kubi/core/base/quote/inner/SymbolConfigHandler;", "startSubMaintenanceStatusFlow", "Lkotlinx/coroutines/flow/Flow;", "", "fragment", "Lcom/kubi/sdk/BaseFragment;", "symbol", "", "startSubQuoteSnapshotFlow", "Lcom/kubi/data/entity/WsMarketSnapshotEntity;", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nDefaultSymbolQuoteRepo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DefaultSymbolQuoteRepo.kt\ncom/kubi/core/base/quote/DefaultSymbolQuoteRepo\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,81:1\n49#2:82\n51#2:86\n49#2:87\n51#2:91\n17#2:92\n19#2:96\n46#3:83\n51#3:85\n46#3:88\n51#3:90\n46#3:93\n51#3:95\n105#4:84\n105#4:89\n105#4:94\n*S KotlinDebug\n*F\n+ 1 DefaultSymbolQuoteRepo.kt\ncom/kubi/core/base/quote/DefaultSymbolQuoteRepo\n*L\n64#1:82\n64#1:86\n77#1:87\n77#1:91\n79#1:92\n79#1:96\n64#1:83\n64#1:85\n77#1:88\n77#1:90\n79#1:93\n79#1:95\n64#1:84\n77#1:89\n79#1:94\n*E\n"})
public final class DefaultSymbolQuoteRepo implements ITradeSymbolQuoteDataRepo {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final Lazy f20074a = LazyKt.lazy(new Function0() { // from class: com.kubi.core.base.quote.a
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return DefaultSymbolQuoteRepo.m21124i();
        }
    });

    /* JADX INFO: renamed from: b */
    @NotNull
    public final SymbolQuoteHandler f20075b = new SymbolQuoteHandler();

    /* JADX INFO: renamed from: c */
    @NotNull
    public final SymbolConfigHandler f20076c = new SymbolConfigHandler();

    /* JADX INFO: renamed from: i */
    public static final InterfaceC37871a m21124i() {
        return (InterfaceC37871a) new C19321b.a().m42777b(new C38000b(C37237b.m83278a())).m42778c(new C38006h()).m42776a().m42772b(InterfaceC37871a.class);
    }

    @Override // com.kubi.core.base.quote.ITradeSymbolQuoteDataRepo
    @NotNull
    /* JADX INFO: renamed from: b */
    public InterfaceC41634e<WsMarketSnapshotEntity> mo21126b(@NotNull final String symbol) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        final InterfaceC41634e<SpotWSEntity> interfaceC41634eM85488a = m21129f().m85488a(DowngradeExKt.m66551u("/market/snapshot_app:%s", new Object[]{symbol}, null, 2, null));
        final InterfaceC41634e interfaceC41634eM90881E = C41636g.m90881E(new InterfaceC41634e<WsMarketSnapshotEntity>() { // from class: com.kubi.core.base.quote.DefaultSymbolQuoteRepo$startSubQuoteSnapshotFlow$$inlined$map$1

            /* JADX INFO: renamed from: com.kubi.core.base.quote.DefaultSymbolQuoteRepo$startSubQuoteSnapshotFlow$$inlined$map$1$2 */
            /* JADX INFO: compiled from: Emitters.kt */
            @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
            @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 DefaultSymbolQuoteRepo.kt\ncom/kubi/core/base/quote/DefaultSymbolQuoteRepo\n*L\n1#1,49:1\n50#2:50\n77#3:51\n*E\n"})
            public static final class C116322<T> implements InterfaceC41635f {

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ InterfaceC41635f f20086b;

                /* JADX INFO: renamed from: com.kubi.core.base.quote.DefaultSymbolQuoteRepo$startSubQuoteSnapshotFlow$$inlined$map$1$2$1, reason: invalid class name */
                @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
                @DebugMetadata(m90121c = "com.kubi.core.base.quote.DefaultSymbolQuoteRepo$startSubQuoteSnapshotFlow$$inlined$map$1$2", m90122f = "DefaultSymbolQuoteRepo.kt", m90123i = {0, 0, 0, 0, 0}, m90124l = {50}, m90125m = "emit", m90126n = {"value", "$completion", "value", "$this$map_u24lambda_u245", "$i$a$-unsafeTransform-FlowKt__TransformKt$map$1"}, m90127s = {"L$0", "L$1", "L$2", "L$3", "I$0"})
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
                        return C116322.this.emit(null, this);
                    }
                }

                public C116322(InterfaceC41635f interfaceC41635f) {
                    this.f20086b = interfaceC41635f;
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
                        InterfaceC41635f interfaceC41635f = this.f20086b;
                        WsMarketSnapshotEntity data = ((SpotWSEntity) obj).getData();
                        anonymousClass1.L$0 = SpillingKt.nullOutSpilledVariable(obj);
                        anonymousClass1.L$1 = SpillingKt.nullOutSpilledVariable(anonymousClass1);
                        anonymousClass1.L$2 = SpillingKt.nullOutSpilledVariable(obj);
                        anonymousClass1.L$3 = SpillingKt.nullOutSpilledVariable(interfaceC41635f);
                        anonymousClass1.I$0 = 0;
                        anonymousClass1.label = 1;
                        if (interfaceC41635f.emit(data, anonymousClass1) == coroutine_suspended) {
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
            public Object collect(InterfaceC41635f<? super WsMarketSnapshotEntity> interfaceC41635f, Continuation continuation) {
                Object objCollect = interfaceC41634eM85488a.collect(new C116322(interfaceC41635f), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        });
        return new InterfaceC41634e<WsMarketSnapshotEntity>() { // from class: com.kubi.core.base.quote.DefaultSymbolQuoteRepo$startSubQuoteSnapshotFlow$$inlined$filter$1

            /* JADX INFO: renamed from: com.kubi.core.base.quote.DefaultSymbolQuoteRepo$startSubQuoteSnapshotFlow$$inlined$filter$1$2, reason: invalid class name */
            /* JADX INFO: compiled from: Emitters.kt */
            @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
            @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 DefaultSymbolQuoteRepo.kt\ncom/kubi/core/base/quote/DefaultSymbolQuoteRepo\n*L\n1#1,49:1\n18#2:50\n19#2:52\n79#3:51\n*E\n"})
            public static final class AnonymousClass2<T> implements InterfaceC41635f {

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ InterfaceC41635f f20083b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ String f20084c;

                /* JADX INFO: renamed from: com.kubi.core.base.quote.DefaultSymbolQuoteRepo$startSubQuoteSnapshotFlow$$inlined$filter$1$2$1, reason: invalid class name */
                @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
                @DebugMetadata(m90121c = "com.kubi.core.base.quote.DefaultSymbolQuoteRepo$startSubQuoteSnapshotFlow$$inlined$filter$1$2", m90122f = "DefaultSymbolQuoteRepo.kt", m90123i = {0, 0, 0, 0, 0}, m90124l = {50}, m90125m = "emit", m90126n = {"value", "$completion", "value", "$this$filter_u24lambda_u240", "$i$a$-unsafeTransform-FlowKt__TransformKt$filter$1"}, m90127s = {"L$0", "L$1", "L$2", "L$3", "I$0"})
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
                    this.f20083b = interfaceC41635f;
                    this.f20084c = str;
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
                        InterfaceC41635f interfaceC41635f = this.f20083b;
                        if (Intrinsics.areEqual(((WsMarketSnapshotEntity) obj).getSymbolCode(), this.f20084c)) {
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
            public Object collect(InterfaceC41635f<? super WsMarketSnapshotEntity> interfaceC41635f, Continuation continuation) {
                Object objCollect = interfaceC41634eM90881E.collect(new AnonymousClass2(interfaceC41635f, symbol), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        };
    }

    @Override // com.kubi.core.base.quote.ITradeSymbolQuoteDataRepo
    @NotNull
    /* JADX INFO: renamed from: d */
    public InterfaceC41634e<Boolean> mo21128d(@NotNull BaseFragment fragment, @NotNull final String symbol) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        C12572a.m23695d(TradeManagerProxy.f21264a.m23363c(), symbol, 0L, 4, null);
        final InterfaceC41634e<MaintenanceEntity> interfaceC41634eMo31923b = IKuFacadeService.f27711a.get().mo31923b(fragment);
        return new InterfaceC41634e<Boolean>() { // from class: com.kubi.core.base.quote.DefaultSymbolQuoteRepo$startSubMaintenanceStatusFlow$$inlined$map$1

            /* JADX INFO: renamed from: com.kubi.core.base.quote.DefaultSymbolQuoteRepo$startSubMaintenanceStatusFlow$$inlined$map$1$2, reason: invalid class name */
            /* JADX INFO: compiled from: Emitters.kt */
            @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
            @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 DefaultSymbolQuoteRepo.kt\ncom/kubi/core/base/quote/DefaultSymbolQuoteRepo\n*L\n1#1,49:1\n50#2:50\n65#3:51\n*E\n"})
            public static final class AnonymousClass2<T> implements InterfaceC41635f {

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ InterfaceC41635f f20079b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ String f20080c;

                /* JADX INFO: renamed from: com.kubi.core.base.quote.DefaultSymbolQuoteRepo$startSubMaintenanceStatusFlow$$inlined$map$1$2$1, reason: invalid class name */
                @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
                @DebugMetadata(m90121c = "com.kubi.core.base.quote.DefaultSymbolQuoteRepo$startSubMaintenanceStatusFlow$$inlined$map$1$2", m90122f = "DefaultSymbolQuoteRepo.kt", m90123i = {0, 0, 0, 0, 0}, m90124l = {50}, m90125m = "emit", m90126n = {"value", "$completion", "value", "$this$map_u24lambda_u245", "$i$a$-unsafeTransform-FlowKt__TransformKt$map$1"}, m90127s = {"L$0", "L$1", "L$2", "L$3", "I$0"})
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
                    this.f20079b = interfaceC41635f;
                    this.f20080c = str;
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
                        InterfaceC41635f interfaceC41635f = this.f20079b;
                        Boolean boolBoxBoolean = Boxing.boxBoolean(TradeManagerProxy.f21264a.m23362b(this.f20080c));
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
                Object objCollect = interfaceC41634eMo31923b.collect(new AnonymousClass2(interfaceC41635f, symbol), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        };
    }

    /* JADX INFO: renamed from: f */
    public final InterfaceC37871a m21129f() {
        return (InterfaceC37871a) this.f20074a.getValue();
    }

    @Override // com.kubi.core.base.quote.ITradeSymbolQuoteDataRepo
    @NotNull
    /* JADX INFO: renamed from: g, reason: from getter and merged with bridge method [inline-methods] */
    public SymbolConfigHandler mo21125a() {
        return this.f20076c;
    }

    @Override // com.kubi.core.base.quote.ITradeSymbolQuoteDataRepo
    @NotNull
    /* JADX INFO: renamed from: h, reason: from getter and merged with bridge method [inline-methods] */
    public SymbolQuoteHandler mo21127c() {
        return this.f20075b;
    }
}
