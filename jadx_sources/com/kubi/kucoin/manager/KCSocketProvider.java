package com.kubi.kucoin.manager;

import com.kubi.data.exception.CoinDataException;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlinx.coroutines.C41686h;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.flow.C41636g;
import kotlinx.coroutines.flow.InterfaceC41634e;
import kotlinx.coroutines.flow.InterfaceC41635f;
import o00.C42911a;
import org.jetbrains.annotations.NotNull;
import p481ny.C42899b;
import p569qq.C43846g;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.collections.MapsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;

/* JADX INFO: compiled from: KCSocketProvider.kt */
/* JADX INFO: loaded from: classes18.dex */
@Metadata(m90083d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0005\u0018\u0000 &*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003:\u0001&B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J>\u0010\u0014\u001a\u00020\u00152\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u00192\u001e\u0010\u001a\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00028\u00000\u001c\u0012\u0004\u0012\u00020\u00150\u001bJ>\u0010\u001d\u001a\u00020\u00152\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u00192\u001e\u0010\u001a\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00028\u00000\u001c\u0012\u0004\u0012\u00020\u00150\u001bJ\u0006\u0010\u001e\u001a\u00020\u0015J\b\u0010\u001f\u001a\u00020\u0015H\u0016JR\u0010 \u001a\u00020\u00152\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00130\"2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u001e\u0010\u001a\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00028\u00000\u001c\u0012\u0004\u0012\u00020\u00150\u001bH\u0082@¢\u0006\u0002\u0010#J\u001c\u0010$\u001a\u00020\u00152\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u0017H\u0082@¢\u0006\u0002\u0010%R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\t\"\u0004\b\u000e\u0010\u000bR\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00028\u00000\u0012X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006'"}, m90084d2 = {"Lcom/kubi/kucoin/manager/KCSocketProvider;", "Entity", "", "Ljava/io/Closeable;", "<init>", "()V", "defaultPageMaxSize", "", "getDefaultPageMaxSize", "()I", "setDefaultPageMaxSize", "(I)V", "defaultBatchMaxLimit", "getDefaultBatchMaxLimit", "setDefaultBatchMaxLimit", "scope", "Lcom/kubi/kucoin/manager/KCSocketProviderScope;", "cacheMap", "Ljava/util/concurrent/ConcurrentHashMap;", "", "subscribe", "", "descriptor", "Lcom/kubi/kucoin/manager/KCSocketTopicDescriptor;", "bufferTime", "", "onData", "Lkotlin/Function1;", "", "subscribeBatch", "unSubscribe", "close", "collectFromTopics", "topics", "", "(Ljava/util/List;Lcom/kubi/kucoin/manager/KCSocketTopicDescriptor;JLkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchHttpFallback", "(Lcom/kubi/kucoin/manager/KCSocketTopicDescriptor;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "LDataProvider_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nKCSocketProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KCSocketProvider.kt\ncom/kubi/kucoin/manager/KCSocketProvider\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 4 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 5 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n+ 6 CoinDataIssue.kt\ncom/kubi/data/exception/CoinDataIssueKt\n*L\n1#1,234:1\n774#2:235\n865#2,2:236\n1563#2:238\n1634#2,3:239\n1563#2:242\n1634#2,3:243\n49#3:246\n51#3:250\n17#3:251\n19#3:255\n46#4:247\n51#4:249\n46#4:252\n51#4:254\n105#5:248\n105#5:253\n45#6,4:256\n*S KotlinDebug\n*F\n+ 1 KCSocketProvider.kt\ncom/kubi/kucoin/manager/KCSocketProvider\n*L\n121#1:235\n121#1:236,2\n128#1:238\n128#1:239,3\n166#1:242\n166#1:243,3\n179#1:246\n179#1:250\n180#1:251\n180#1:255\n179#1:247\n179#1:249\n180#1:252\n180#1:254\n179#1:248\n180#1:253\n200#1:256,4\n*E\n"})
public final class KCSocketProvider<Entity> implements Closeable {

    /* JADX INFO: renamed from: f */
    @NotNull
    public static final Companion f28071f = new Companion(null);

    /* JADX INFO: renamed from: b */
    public int f28072b = 80;

    /* JADX INFO: renamed from: c */
    public int f28073c = 600;

    /* JADX INFO: renamed from: d */
    @NotNull
    public final KCSocketProviderScope f28074d = new KCSocketProviderScope(C42911a.m94120b());

    /* JADX INFO: renamed from: e */
    @NotNull
    public final ConcurrentHashMap<String, Entity> f28075e = new ConcurrentHashMap<>();

    /* JADX INFO: compiled from: KCSocketProvider.kt */
    @Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m90084d2 = {"Lcom/kubi/kucoin/manager/KCSocketProvider$Companion;", "", "<init>", "()V", "TAG", "", "PAGE_MAX_SIZE", "", "BATCH_MAX_LIMIT", "DEFAULT_BUFFER_TIME", "", "LDataProvider_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: h */
    public final Object m32511h(List<String> list, KCSocketTopicDescriptor<Entity> kCSocketTopicDescriptor, long j11, final Function1<? super Map<String, ? extends Entity>, Unit> function1, Continuation<? super Unit> continuation) {
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(kCSocketTopicDescriptor.mo32500b((String) it.next()));
        }
        final InterfaceC41634e interfaceC41634eM90896T = C41636g.m90896T(C41636g.m90917h(C41636g.m90893Q(arrayList), new KCSocketProvider$collectFromTopics$upstream$2(null)), new KCSocketProvider$collectFromTopics$upstream$3(this, kCSocketTopicDescriptor, null));
        if (j11 > 0) {
            interfaceC41634eM90896T = C41636g.m90906b0(interfaceC41634eM90896T, j11);
        }
        final InterfaceC41634e<Map<String, ? extends Entity>> interfaceC41634e = new InterfaceC41634e<Map<String, ? extends Entity>>() { // from class: com.kubi.kucoin.manager.KCSocketProvider$collectFromTopics$$inlined$map$1

            /* JADX INFO: renamed from: com.kubi.kucoin.manager.KCSocketProvider$collectFromTopics$$inlined$map$1$2 */
            /* JADX INFO: compiled from: Emitters.kt */
            @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
            @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 KCSocketProvider.kt\ncom/kubi/kucoin/manager/KCSocketProvider\n*L\n1#1,49:1\n50#2:50\n179#3:51\n*E\n"})
            public static final class C154752<T> implements InterfaceC41635f {

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ InterfaceC41635f f28080b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ KCSocketProvider f28081c;

                /* JADX INFO: renamed from: com.kubi.kucoin.manager.KCSocketProvider$collectFromTopics$$inlined$map$1$2$1, reason: invalid class name */
                @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
                @DebugMetadata(m90121c = "com.kubi.kucoin.manager.KCSocketProvider$collectFromTopics$$inlined$map$1$2", m90122f = "KCSocketProvider.kt", m90123i = {0, 0, 0, 0, 0}, m90124l = {50}, m90125m = "emit", m90126n = {"value", "$completion", "value", "$this$map_u24lambda_u245", "$i$a$-unsafeTransform-FlowKt__TransformKt$map$1"}, m90127s = {"L$0", "L$1", "L$2", "L$3", "I$0"})
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
                        return C154752.this.emit(null, this);
                    }
                }

                public C154752(InterfaceC41635f interfaceC41635f, KCSocketProvider kCSocketProvider) {
                    this.f28080b = interfaceC41635f;
                    this.f28081c = kCSocketProvider;
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
                        InterfaceC41635f interfaceC41635f = this.f28080b;
                        Map map = MapsKt.toMap(this.f28081c.f28075e);
                        anonymousClass1.L$0 = SpillingKt.nullOutSpilledVariable(obj);
                        anonymousClass1.L$1 = SpillingKt.nullOutSpilledVariable(anonymousClass1);
                        anonymousClass1.L$2 = SpillingKt.nullOutSpilledVariable(obj);
                        anonymousClass1.L$3 = SpillingKt.nullOutSpilledVariable(interfaceC41635f);
                        anonymousClass1.I$0 = 0;
                        anonymousClass1.label = 1;
                        if (interfaceC41635f.emit(map, anonymousClass1) == coroutine_suspended) {
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
            public Object collect(InterfaceC41635f interfaceC41635f, Continuation continuation2) {
                Object objCollect = interfaceC41634eM90896T.collect(new C154752(interfaceC41635f, this), continuation2);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        };
        Object objCollect = new InterfaceC41634e<Map<String, ? extends Entity>>() { // from class: com.kubi.kucoin.manager.KCSocketProvider$collectFromTopics$$inlined$filter$1

            /* JADX INFO: renamed from: com.kubi.kucoin.manager.KCSocketProvider$collectFromTopics$$inlined$filter$1$2 */
            /* JADX INFO: compiled from: Emitters.kt */
            @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
            @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 KCSocketProvider.kt\ncom/kubi/kucoin/manager/KCSocketProvider\n*L\n1#1,49:1\n18#2:50\n19#2:52\n180#3:51\n*E\n"})
            public static final class C154742<T> implements InterfaceC41635f {

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ InterfaceC41635f f28077b;

                /* JADX INFO: renamed from: com.kubi.kucoin.manager.KCSocketProvider$collectFromTopics$$inlined$filter$1$2$1, reason: invalid class name */
                @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
                @DebugMetadata(m90121c = "com.kubi.kucoin.manager.KCSocketProvider$collectFromTopics$$inlined$filter$1$2", m90122f = "KCSocketProvider.kt", m90123i = {0, 0, 0, 0, 0}, m90124l = {50}, m90125m = "emit", m90126n = {"value", "$completion", "value", "$this$filter_u24lambda_u240", "$i$a$-unsafeTransform-FlowKt__TransformKt$filter$1"}, m90127s = {"L$0", "L$1", "L$2", "L$3", "I$0"})
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
                        return C154742.this.emit(null, this);
                    }
                }

                public C154742(InterfaceC41635f interfaceC41635f) {
                    this.f28077b = interfaceC41635f;
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
                        InterfaceC41635f interfaceC41635f = this.f28077b;
                        if (!((Map) obj).isEmpty()) {
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
            public Object collect(InterfaceC41635f interfaceC41635f, Continuation continuation2) {
                Object objCollect2 = interfaceC41634e.collect(new C154742(interfaceC41635f), continuation2);
                return objCollect2 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect2 : Unit.INSTANCE;
            }
        }.collect(new InterfaceC41635f() { // from class: com.kubi.kucoin.manager.KCSocketProvider$collectFromTopics$4

            /* JADX INFO: renamed from: com.kubi.kucoin.manager.KCSocketProvider$collectFromTopics$4$1 */
            /* JADX INFO: compiled from: KCSocketProvider.kt */
            @Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
            @DebugMetadata(m90121c = "com.kubi.kucoin.manager.KCSocketProvider$collectFromTopics$4$1", m90122f = "KCSocketProvider.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
            public static final class C154761 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
                final /* synthetic */ Function1<Map<String, ? extends Entity>, Unit> $onData;
                final /* synthetic */ Map<String, Entity> $snapshot;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public C154761(Function1<? super Map<String, ? extends Entity>, Unit> function1, Map<String, ? extends Entity> map, Continuation<? super C154761> continuation) {
                    super(2, continuation);
                    this.$onData = function1;
                    this.$snapshot = map;
                }

                @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new C154761(this.$onData, this.$snapshot, continuation);
                }

                @Override // p852kotlin.jvm.functions.Function2
                public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
                    return ((C154761) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* JADX WARN: Type inference fix 'apply assigned field type' failed
                java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
                	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                 */
                @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.$onData.invoke(this.$snapshot);
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }

            @Override // kotlinx.coroutines.flow.InterfaceC41635f
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(Map<String, ? extends Entity> map, Continuation<? super Unit> continuation2) {
                Object objM91049g = C41686h.m91049g(C42911a.m94121c(), new C154761(function1, map, null), continuation2);
                if (objM91049g == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    return objM91049g;
                }
                return Unit.INSTANCE;
            }
        }, continuation);
        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: i */
    public final Object m32512i(KCSocketTopicDescriptor<Entity> kCSocketTopicDescriptor, Continuation<? super Unit> continuation) {
        KCSocketProvider$fetchHttpFallback$1 kCSocketProvider$fetchHttpFallback$1;
        if (continuation instanceof KCSocketProvider$fetchHttpFallback$1) {
            kCSocketProvider$fetchHttpFallback$1 = (KCSocketProvider$fetchHttpFallback$1) continuation;
            int i11 = kCSocketProvider$fetchHttpFallback$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                kCSocketProvider$fetchHttpFallback$1.label = i11 - Integer.MIN_VALUE;
            } else {
                kCSocketProvider$fetchHttpFallback$1 = new KCSocketProvider$fetchHttpFallback$1(this, continuation);
            }
        } else {
            kCSocketProvider$fetchHttpFallback$1 = new KCSocketProvider$fetchHttpFallback$1(this, continuation);
        }
        Object objInvoke = kCSocketProvider$fetchHttpFallback$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = kCSocketProvider$fetchHttpFallback$1.label;
        try {
            if (i12 == 0) {
                ResultKt.throwOnFailure(objInvoke);
                Function1<Continuation<? super Map<String, ? extends Entity>>, Object> function1M32604f = kCSocketTopicDescriptor.m32604f();
                if (function1M32604f == null) {
                    return Unit.INSTANCE;
                }
                kCSocketProvider$fetchHttpFallback$1.L$0 = SpillingKt.nullOutSpilledVariable(kCSocketTopicDescriptor);
                kCSocketProvider$fetchHttpFallback$1.L$1 = SpillingKt.nullOutSpilledVariable(function1M32604f);
                kCSocketProvider$fetchHttpFallback$1.label = 1;
                objInvoke = function1M32604f.invoke(kCSocketProvider$fetchHttpFallback$1);
                if (objInvoke == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objInvoke);
            }
            Map<? extends String, ? extends Entity> map = (Map) objInvoke;
            if (map == null) {
                return Unit.INSTANCE;
            }
            this.f28075e.putAll(map);
            return Unit.INSTANCE;
        } catch (Exception e11) {
            if (!C42899b.m94075e(e11)) {
                C43846g.m96568c(new CoinDataException(e11, "KCSocketProvider", false, null, 8, null), null, 2, null);
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m32513j(@NotNull KCSocketTopicDescriptor<Entity> descriptor, long j11, @NotNull Function1<? super Map<String, ? extends Entity>, Unit> onData) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(onData, "onData");
        this.f28074d.close();
        this.f28075e.clear();
        C41696j.m91104d(this.f28074d, null, null, new KCSocketProvider$subscribe$1(this, descriptor, j11, onData, null), 3, null);
    }

    /* JADX INFO: renamed from: k */
    public final void m32514k(@NotNull KCSocketTopicDescriptor<Entity> descriptor, long j11, @NotNull Function1<? super Map<String, ? extends Entity>, Unit> onData) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(onData, "onData");
        this.f28074d.close();
        this.f28075e.clear();
        String strMo32499a = descriptor.mo32499a();
        if (strMo32499a == null) {
            strMo32499a = "";
        }
        List listSplit$default = StringsKt.split$default((CharSequence) strMo32499a, new String[]{","}, false, 0, 6, (Object) null);
        List arrayList = new ArrayList();
        for (Object obj : listSplit$default) {
            if (((String) obj).length() > 0) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        int size = arrayList.size();
        int i11 = this.f28073c;
        if (size > i11) {
            arrayList = CollectionsKt.take(arrayList, i11);
        }
        List listChunked = CollectionsKt.chunked(arrayList, this.f28072b);
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(listChunked, 10));
        Iterator it = listChunked.iterator();
        while (it.hasNext()) {
            arrayList2.add(descriptor.mo32502e() + CollectionsKt.joinToString$default((List) it.next(), ",", null, null, 0, null, null, 62, null));
        }
        C41696j.m91104d(this.f28074d, null, null, new KCSocketProvider$subscribeBatch$1(this, descriptor, arrayList2, j11, onData, null), 3, null);
    }

    /* JADX INFO: renamed from: l */
    public final void m32515l() {
        this.f28074d.close();
        this.f28075e.clear();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        m32515l();
    }
}
