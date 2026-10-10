package com.kubi.sdk.pkg.util;

import androidx.media3.exoplayer.upstream.CmcdData;
import java.io.File;
import java.util.List;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.flow.C41636g;
import kotlinx.coroutines.flow.InterfaceC41634e;
import kotlinx.coroutines.flow.InterfaceC41635f;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p569qq.C43840a;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.functions.Function3;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Sha1Util.kt */
/* JADX INFO: loaded from: classes41.dex */
@Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m90084d2 = {"Lkotlinx/coroutines/m0;", "", "<anonymous>", "(Lkotlinx/coroutines/m0;)Z"}, m90085k = 3, m90086mv = {1, 8, 0})
@DebugMetadata(m90121c = "com.kubi.sdk.pkg.util.Sha1Util$compareItems$2", m90122f = "Sha1Util.kt", m90123i = {}, m90124l = {58}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
@SourceDebugExtension({"SMAP\nSha1Util.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Sha1Util.kt\ncom/kubi/sdk/pkg/util/Sha1Util$compareItems$2\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,80:1\n47#2:81\n49#2:85\n50#3:82\n55#3:84\n106#4:83\n*S KotlinDebug\n*F\n+ 1 Sha1Util.kt\ncom/kubi/sdk/pkg/util/Sha1Util$compareItems$2\n*L\n47#1:81\n47#1:85\n47#1:82\n47#1:84\n47#1:83\n*E\n"})
public final class Sha1Util$compareItems$2 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Boolean>, Object> {
    final /* synthetic */ List<Sha1Util.C23977a> $items;
    int label;

    /* JADX INFO: renamed from: com.kubi.sdk.pkg.util.Sha1Util$compareItems$2$2 */
    /* JADX INFO: compiled from: Sha1Util.kt */
    @Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\u008a@"}, m90084d2 = {"<anonymous>", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "b"}, m90085k = 3, m90086mv = {1, 8, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.sdk.pkg.util.Sha1Util$compareItems$2$2", m90122f = "Sha1Util.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C239782 extends SuspendLambda implements Function3<Boolean, Boolean, Continuation<? super Boolean>, Object> {
        /* synthetic */ boolean Z$0;
        /* synthetic */ boolean Z$1;
        int label;

        public C239782(Continuation<? super C239782> continuation) {
            super(3, continuation);
        }

        @Override // p852kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Boolean bool2, Continuation<? super Boolean> continuation) {
            return invoke(bool.booleanValue(), bool2.booleanValue(), continuation);
        }

        @Nullable
        public final Object invoke(boolean z11, boolean z12, @Nullable Continuation<? super Boolean> continuation) {
            C239782 c239782 = new C239782(continuation);
            c239782.Z$0 = z11;
            c239782.Z$1 = z12;
            return c239782.invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            boolean z11;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                boolean z12 = this.Z$0;
                boolean z13 = this.Z$1;
                if (z12 && z13) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                return Boxing.boxBoolean(z11);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Sha1Util$compareItems$2(List<Sha1Util.C23977a> list, Continuation<? super Sha1Util$compareItems$2> continuation) {
        super(2, continuation);
        this.$items = list;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new Sha1Util$compareItems$2(this.$items, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull InterfaceC41709m0 interfaceC41709m0, @Nullable Continuation<? super Boolean> continuation) {
        return ((Sha1Util$compareItems$2) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 == 1) {
                ResultKt.throwOnFailure(obj);
                return obj;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        final InterfaceC41634e interfaceC41634eM90903a = C41636g.m90903a(this.$items);
        InterfaceC41634e<Boolean> interfaceC41634e = new InterfaceC41634e<Boolean>() { // from class: com.kubi.sdk.pkg.util.Sha1Util$compareItems$2$invokeSuspend$$inlined$map$1

            /* JADX INFO: renamed from: com.kubi.sdk.pkg.util.Sha1Util$compareItems$2$invokeSuspend$$inlined$map$1$2 */
            /* JADX INFO: compiled from: Collect.kt */
            @Metadata(m90083d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001b\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006"}, m90084d2 = {"kotlinx/coroutines/flow/FlowKt__CollectKt$collect$3", "Lkotlinx/coroutines/flow/f;", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
            @SourceDebugExtension({"SMAP\nCollect.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Collect.kt\nkotlinx/coroutines/flow/FlowKt__CollectKt$collect$3\n+ 2 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 3 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 4 Sha1Util.kt\ncom/kubi/sdk/pkg/util/Sha1Util$compareItems$2\n*L\n1#1,134:1\n53#2:135\n48#3:136\n48#4,9:137\n*E\n"})
            public static final class C239792 implements InterfaceC41635f<Sha1Util.C23977a> {

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ InterfaceC41635f f47475b;

                /* JADX INFO: renamed from: com.kubi.sdk.pkg.util.Sha1Util$compareItems$2$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
                @Metadata(m90085k = 3, m90086mv = {1, 8, 0}, m90088xi = 48)
                @DebugMetadata(m90121c = "com.kubi.sdk.pkg.util.Sha1Util$compareItems$2$invokeSuspend$$inlined$map$1$2", m90122f = "Sha1Util.kt", m90123i = {}, m90124l = {136}, m90125m = "emit", m90126n = {}, m90127s = {})
                public static final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @Nullable
                    public final Object invokeSuspend(@NotNull Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return C239792.this.emit(null, this);
                    }
                }

                public C239792(InterfaceC41635f interfaceC41635f) {
                    this.f47475b = interfaceC41635f;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.InterfaceC41635f
                @Nullable
                public Object emit(Sha1Util.C23977a c23977a, @NotNull Continuation continuation) {
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
                    Object obj = anonymousClass1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i12 = anonymousClass1.label;
                    if (i12 == 0) {
                        ResultKt.throwOnFailure(obj);
                        InterfaceC41635f interfaceC41635f = this.f47475b;
                        Sha1Util.C23977a c23977a2 = c23977a;
                        File file = new File(c23977a2.getPath());
                        boolean zM57838a = false;
                        if (!file.exists()) {
                            C43840a.m96549c("校验文件sha1:" + file.getPath() + " 未找到", null, 2, null);
                        } else if (c23977a2.getAndroidx.media3.exoplayer.rtsp.SessionDescription.ATTR_LENGTH java.lang.String() != file.length()) {
                            C43840a.m96549c("校验文件sha1:" + file.getPath() + " 长度不对 " + c23977a2.getAndroidx.media3.exoplayer.rtsp.SessionDescription.ATTR_LENGTH java.lang.String() + " != " + file.length(), null, 2, null);
                        } else {
                            zM57838a = Sha1Util.m57838a(c23977a2.getSha1(), file);
                        }
                        Boolean boolBoxBoolean = Boxing.boxBoolean(zM57838a);
                        anonymousClass1.label = 1;
                        if (interfaceC41635f.emit(boolBoxBoolean, anonymousClass1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i12 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                }
            }

            @Override // kotlinx.coroutines.flow.InterfaceC41634e
            @Nullable
            public Object collect(@NotNull InterfaceC41635f<? super Boolean> interfaceC41635f, @NotNull Continuation continuation) {
                Object objCollect = interfaceC41634eM90903a.collect(new C239792(interfaceC41635f), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        };
        C239782 c239782 = new C239782(null);
        this.label = 1;
        Object objM90901Y = C41636g.m90901Y(interfaceC41634e, c239782, this);
        if (objM90901Y == coroutine_suspended) {
            return coroutine_suspended;
        }
        return objM90901Y;
    }
}
