package com.kubi.network.api.subscribe.utils;

import androidx.exifinterface.media.ExifInterface;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.kubi.network.api.model.NetworkMessage;
import com.kubi.network.api.subscribe.model.PeriodRequest;
import com.kubi.network.api.subscribe.model.SubscribeMessage;
import com.kubi.network.api.subscribe.model.SubscribeRequest;
import com.kubi.network.restful.utils.OptionalCompat;
import er.InterfaceC37236a;
import io.reactivex.Observable;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlinx.coroutines.flow.C41636g;
import kotlinx.coroutines.flow.InterfaceC41634e;
import kotlinx.coroutines.flow.InterfaceC41635f;
import kotlinx.coroutines.flow.InterfaceC41668m;
import kotlinx.coroutines.rx2.RxConvertKt;
import kr.InterfaceC41975c;
import okhttp3.Request;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Deprecated;
import p852kotlin.Metadata;
import p852kotlin.ReplaceWith;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import ro.C44128b;

/* JADX INFO: compiled from: ChannelUtils.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\u001a+\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\b\u001a\u001f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000b\u001aw\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\"\b\b\u0000\u0010\r*\u00020\f\"\b\b\u0001\u0010\u000e*\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\t2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00028\u00000\u00102\u0010\b\u0002\u0010\u0013\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00122\u0016\b\u0002\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0010H\u0007¢\u0006\u0004\b\u0015\u0010\u0016\u001a-\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00060\u0017*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0007¢\u0006\u0004\b\u0018\u0010\u0019\u001a!\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00060\u0017*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\tH\u0007¢\u0006\u0004\b\u001a\u0010\u001b\u001a-\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u0017\"\b\b\u0000\u0010\u001c*\u00020\f2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0007¢\u0006\u0004\b\u001e\u0010\u001f\u001a-\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010 \u001a\u00020\t2\u0006\u0010!\u001a\u00020\tH\u0002¢\u0006\u0004\b\"\u0010#¨\u0006$"}, m90084d2 = {"Ler/a;", "", "topic", "Lokhttp3/Request;", "request", "Lkotlinx/coroutines/flow/e;", "Lcom/kubi/network/api/subscribe/model/SubscribeMessage;", "e", "(Ler/a;Ljava/lang/String;Lokhttp3/Request;)Lkotlinx/coroutines/flow/e;", "Lcom/kubi/network/api/subscribe/model/SubscribeRequest;", "d", "(Ler/a;Lcom/kubi/network/api/subscribe/model/SubscribeRequest;)Lkotlinx/coroutines/flow/e;", "", ExifInterface.LONGITUDE_WEST, "H", "client", "Lkr/c;", "wConverter", "Lkotlinx/coroutines/flow/m;", "hFlow", "hConverter", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Ler/a;Lcom/kubi/network/api/subscribe/model/SubscribeRequest;Lkr/c;Lkotlinx/coroutines/flow/m;Lkr/c;)Lkotlinx/coroutines/flow/e;", "Lio/reactivex/Observable;", "g", "(Ler/a;Ljava/lang/String;Lokhttp3/Request;)Lio/reactivex/Observable;", "f", "(Ler/a;Lcom/kubi/network/api/subscribe/model/SubscribeRequest;)Lio/reactivex/Observable;", ExifInterface.GPS_DIRECTION_TRUE, "flow", "b", "(Lkotlinx/coroutines/flow/e;)Lio/reactivex/Observable;", "subscribe", "unsubscribe", "i", "(Ler/a;Lcom/kubi/network/api/subscribe/model/SubscribeRequest;Lcom/kubi/network/api/subscribe/model/SubscribeRequest;)Lkotlinx/coroutines/flow/e;", "network-adapter-subscribe_release"}, m90085k = 2, m90086mv = {1, 8, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nChannelUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ChannelUtils.kt\ncom/kubi/network/api/subscribe/utils/ChannelUtilsKt\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,280:1\n68#1,9:281\n88#1,9:290\n68#1,9:299\n88#1,9:308\n88#1,9:317\n58#1,19:341\n88#1,9:360\n58#1,19:369\n88#1,9:388\n73#1,4:397\n88#1,9:401\n73#1,4:410\n88#1,9:414\n94#1,3:423\n47#2:326\n49#2:330\n20#2:331\n22#2:335\n47#2:336\n49#2:340\n47#2:426\n49#2:430\n35#2:431\n20#2:432\n22#2:436\n20#2:437\n22#2:444\n50#3:327\n55#3:329\n50#3:332\n55#3:334\n50#3:337\n55#3:339\n50#3:427\n55#3:429\n50#3:433\n55#3:435\n50#3,6:438\n106#4:328\n106#4:333\n106#4:338\n106#4:428\n106#4:434\n*S KotlinDebug\n*F\n+ 1 ChannelUtils.kt\ncom/kubi/network/api/subscribe/utils/ChannelUtilsKt\n*L\n58#1:281,9\n58#1:290,9\n58#1:299,9\n58#1:308,9\n73#1:317,9\n172#1:341,19\n172#1:360,9\n172#1:369,19\n172#1:388,9\n188#1:397,4\n188#1:401,9\n188#1:410,4\n188#1:414,9\n206#1:423,3\n125#1:326\n125#1:330\n132#1:331\n132#1:335\n134#1:336\n134#1:340\n247#1:426\n247#1:430\n249#1:431\n249#1:432\n249#1:436\n249#1:437\n249#1:444\n125#1:327\n125#1:329\n132#1:332\n132#1:334\n134#1:337\n134#1:339\n247#1:427\n247#1:429\n249#1:433\n249#1:435\n249#1:438,6\n125#1:328\n132#1:333\n134#1:338\n247#1:428\n249#1:434\n*E\n"})
public final class ChannelUtilsKt {
    @Deprecated(message = "此为内部方法，不对外暴露使用", replaceWith = @ReplaceWith(expression = "getSubscribeFlow(request: SubscribeRequest, wConverter: IConverter<SubscribeMessage, W>? = null, hFlow: MutableSharedFlow<H>? = null, hConverter: IConverter<SubscribeMessage, H>? = null)", imports = {}))
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final <W, H> InterfaceC41634e<W> m42737a(@NotNull InterfaceC37236a client, @NotNull SubscribeRequest request, @NotNull final InterfaceC41975c<SubscribeMessage, W> wConverter, @Nullable final InterfaceC41668m<H> interfaceC41668m, @Nullable final InterfaceC41975c<SubscribeMessage, H> interfaceC41975c) throws IllegalArgumentException {
        Intrinsics.checkNotNullParameter(client, "client");
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(wConverter, "wConverter");
        final InterfaceC41634e<SubscribeMessage> interfaceC41634eM42740d = m42740d(client, request);
        final InterfaceC41634e<OptionalCompat<W>> interfaceC41634e = new InterfaceC41634e<OptionalCompat<W>>() { // from class: com.kubi.network.api.subscribe.utils.ChannelUtilsKt$_getSubscribeFlow$$inlined$map$1

            /* JADX INFO: renamed from: com.kubi.network.api.subscribe.utils.ChannelUtilsKt$_getSubscribeFlow$$inlined$map$1$2 */
            /* JADX INFO: compiled from: Collect.kt */
            @Metadata(m90083d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001b\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006"}, m90084d2 = {"kotlinx/coroutines/flow/FlowKt__CollectKt$collect$3", "Lkotlinx/coroutines/flow/f;", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
            @SourceDebugExtension({"SMAP\nCollect.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Collect.kt\nkotlinx/coroutines/flow/FlowKt__CollectKt$collect$3\n+ 2 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 3 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 4 ChannelUtils.kt\ncom/kubi/network/api/subscribe/utils/ChannelUtilsKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,134:1\n53#2:135\n48#3:136\n126#4,4:137\n130#4:142\n1#5:141\n*E\n"})
            public static final class C193102 implements InterfaceC41635f<SubscribeMessage> {

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ InterfaceC41635f f35822b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ InterfaceC41975c f35823c;

                /* JADX INFO: renamed from: d */
                public final /* synthetic */ InterfaceC41975c f35824d;

                /* JADX INFO: renamed from: e */
                public final /* synthetic */ InterfaceC41668m f35825e;

                /* JADX INFO: renamed from: com.kubi.network.api.subscribe.utils.ChannelUtilsKt$_getSubscribeFlow$$inlined$map$1$2$1, reason: invalid class name */
                /* JADX INFO: loaded from: classes63.dex */
                @Metadata(m90085k = 3, m90086mv = {1, 8, 0}, m90088xi = 48)
                @DebugMetadata(m90121c = "com.kubi.network.api.subscribe.utils.ChannelUtilsKt$_getSubscribeFlow$$inlined$map$1$2", m90122f = "ChannelUtils.kt", m90123i = {}, m90124l = {136}, m90125m = "emit", m90126n = {}, m90127s = {})
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
                        return C193102.this.emit(null, this);
                    }
                }

                public C193102(InterfaceC41635f interfaceC41635f, InterfaceC41975c interfaceC41975c, InterfaceC41975c interfaceC41975c2, InterfaceC41668m interfaceC41668m) {
                    this.f35822b = interfaceC41635f;
                    this.f35823c = interfaceC41975c;
                    this.f35824d = interfaceC41975c2;
                    this.f35825e = interfaceC41668m;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.InterfaceC41635f
                @Nullable
                public Object emit(SubscribeMessage subscribeMessage, @NotNull Continuation continuation) throws IOException {
                    AnonymousClass1 anonymousClass1;
                    Object objConvert;
                    Object objConvert2;
                    InterfaceC41668m interfaceC41668m;
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
                        InterfaceC41635f interfaceC41635f = this.f35822b;
                        SubscribeMessage subscribeMessage2 = subscribeMessage;
                        OptionalCompat.Companion companion = OptionalCompat.INSTANCE;
                        if (subscribeMessage2.isSocketMessage()) {
                            objConvert = this.f35823c.convert(subscribeMessage2);
                        } else {
                            InterfaceC41975c interfaceC41975c = this.f35824d;
                            if (interfaceC41975c != null && (objConvert2 = interfaceC41975c.convert(subscribeMessage2)) != null && (interfaceC41668m = this.f35825e) != null) {
                                Boxing.boxBoolean(interfaceC41668m.mo90855d(objConvert2));
                            }
                            objConvert = null;
                        }
                        OptionalCompat optionalCompatFromNullable = companion.fromNullable(objConvert);
                        anonymousClass1.label = 1;
                        if (interfaceC41635f.emit(optionalCompatFromNullable, anonymousClass1) == coroutine_suspended) {
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
            public Object collect(@NotNull InterfaceC41635f interfaceC41635f, @NotNull Continuation continuation) {
                Object objCollect = interfaceC41634eM42740d.collect(new C193102(interfaceC41635f, wConverter, interfaceC41975c, interfaceC41668m), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        };
        final InterfaceC41634e<OptionalCompat<W>> interfaceC41634e2 = new InterfaceC41634e<OptionalCompat<W>>() { // from class: com.kubi.network.api.subscribe.utils.ChannelUtilsKt$_getSubscribeFlow$$inlined$filter$1

            /* JADX INFO: renamed from: com.kubi.network.api.subscribe.utils.ChannelUtilsKt$_getSubscribeFlow$$inlined$filter$1$2 */
            /* JADX INFO: compiled from: Collect.kt */
            @Metadata(m90083d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001b\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006"}, m90084d2 = {"kotlinx/coroutines/flow/FlowKt__CollectKt$collect$3", "Lkotlinx/coroutines/flow/f;", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
            @SourceDebugExtension({"SMAP\nCollect.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Collect.kt\nkotlinx/coroutines/flow/FlowKt__CollectKt$collect$3\n+ 2 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 3 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 4 ChannelUtils.kt\ncom/kubi/network/api/subscribe/utils/ChannelUtilsKt\n*L\n1#1,134:1\n53#2:135\n21#3:136\n22#3:138\n133#4:137\n*E\n"})
            public static final class C193092 implements InterfaceC41635f<OptionalCompat<W>> {

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ InterfaceC41635f f35817b;

                /* JADX INFO: renamed from: com.kubi.network.api.subscribe.utils.ChannelUtilsKt$_getSubscribeFlow$$inlined$filter$1$2$1, reason: invalid class name */
                /* JADX INFO: loaded from: classes63.dex */
                @Metadata(m90085k = 3, m90086mv = {1, 8, 0}, m90088xi = 48)
                @DebugMetadata(m90121c = "com.kubi.network.api.subscribe.utils.ChannelUtilsKt$_getSubscribeFlow$$inlined$filter$1$2", m90122f = "ChannelUtils.kt", m90123i = {}, m90124l = {136}, m90125m = "emit", m90126n = {}, m90127s = {})
                public static final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    Object L$1;
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
                        return C193092.this.emit(null, this);
                    }
                }

                public C193092(InterfaceC41635f interfaceC41635f) {
                    this.f35817b = interfaceC41635f;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.InterfaceC41635f
                @Nullable
                public Object emit(Object obj, @NotNull Continuation continuation) {
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
                        InterfaceC41635f interfaceC41635f = this.f35817b;
                        if (((OptionalCompat) obj).m42785b()) {
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
            @Nullable
            public Object collect(@NotNull InterfaceC41635f interfaceC41635f, @NotNull Continuation continuation) {
                Object objCollect = interfaceC41634e.collect(new C193092(interfaceC41635f), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        };
        return C41636g.m90890N(new InterfaceC41634e<W>() { // from class: com.kubi.network.api.subscribe.utils.ChannelUtilsKt$_getSubscribeFlow$$inlined$map$2

            /* JADX INFO: renamed from: com.kubi.network.api.subscribe.utils.ChannelUtilsKt$_getSubscribeFlow$$inlined$map$2$2 */
            /* JADX INFO: compiled from: Collect.kt */
            @Metadata(m90083d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001b\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006"}, m90084d2 = {"kotlinx/coroutines/flow/FlowKt__CollectKt$collect$3", "Lkotlinx/coroutines/flow/f;", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
            @SourceDebugExtension({"SMAP\nCollect.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Collect.kt\nkotlinx/coroutines/flow/FlowKt__CollectKt$collect$3\n+ 2 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 3 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 4 ChannelUtils.kt\ncom/kubi/network/api/subscribe/utils/ChannelUtilsKt\n*L\n1#1,134:1\n53#2:135\n48#3:136\n135#4:137\n*E\n"})
            public static final class C193112 implements InterfaceC41635f<OptionalCompat<W>> {

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ InterfaceC41635f f35827b;

                /* JADX INFO: renamed from: com.kubi.network.api.subscribe.utils.ChannelUtilsKt$_getSubscribeFlow$$inlined$map$2$2$1, reason: invalid class name */
                /* JADX INFO: loaded from: classes63.dex */
                @Metadata(m90085k = 3, m90086mv = {1, 8, 0}, m90088xi = 48)
                @DebugMetadata(m90121c = "com.kubi.network.api.subscribe.utils.ChannelUtilsKt$_getSubscribeFlow$$inlined$map$2$2", m90122f = "ChannelUtils.kt", m90123i = {}, m90124l = {136}, m90125m = "emit", m90126n = {}, m90127s = {})
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
                        return C193112.this.emit(null, this);
                    }
                }

                public C193112(InterfaceC41635f interfaceC41635f) {
                    this.f35827b = interfaceC41635f;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.InterfaceC41635f
                @Nullable
                public Object emit(Object obj, @NotNull Continuation continuation) {
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
                        InterfaceC41635f interfaceC41635f = this.f35827b;
                        Object objM42784a = ((OptionalCompat) obj).m42784a();
                        anonymousClass1.label = 1;
                        if (interfaceC41635f.emit(objM42784a, anonymousClass1) == coroutine_suspended) {
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
            @Nullable
            public Object collect(@NotNull InterfaceC41635f interfaceC41635f, @NotNull Continuation continuation) {
                Object objCollect = interfaceC41634e2.collect(new C193112(interfaceC41635f), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        }, C19319e.m42764c());
    }

    @Deprecated(message = "此为内部方法，不对外暴露使用", replaceWith = @ReplaceWith(expression = "getSubscribeFlow(request: SubscribeRequest, wConverter: IConverter<SubscribeMessage, W>? = null, hFlow: MutableSharedFlow<H>? = null, hConverter: IConverter<SubscribeMessage, H>? = null)", imports = {}))
    @NotNull
    /* JADX INFO: renamed from: b */
    public static final <T> Observable<T> m42738b(@NotNull InterfaceC41634e<? extends T> flow) {
        Intrinsics.checkNotNullParameter(flow, "flow");
        Observable<T> observableObserveOn = RxConvertKt.m91207d(flow, null, 1, null).subscribeOn(C19319e.m42763b()).observeOn(C19319e.m42765d());
        Intrinsics.checkNotNullExpressionValue(observableObserveOn, "flow.asObservable().subs…Pool.getSingleExecutor())");
        return observableObserveOn;
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public static final InterfaceC41634e<SubscribeMessage> m42740d(@NotNull InterfaceC37236a interfaceC37236a, @NotNull SubscribeRequest request) throws IllegalArgumentException {
        Intrinsics.checkNotNullParameter(interfaceC37236a, "<this>");
        Intrinsics.checkNotNullParameter(request, "request");
        return C19315a.f35838a.m42746a(interfaceC37236a, request);
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public static final InterfaceC41634e<SubscribeMessage> m42741e(@NotNull InterfaceC37236a interfaceC37236a, @NotNull String topic, @Nullable Request request) throws IllegalArgumentException {
        Intrinsics.checkNotNullParameter(interfaceC37236a, "<this>");
        Intrinsics.checkNotNullParameter(topic, "topic");
        return m42740d(interfaceC37236a, SubscribeRequest.INSTANCE.subscribe(topic, request));
    }

    @Deprecated(message = "建议直接使用Flow方式", replaceWith = @ReplaceWith(expression = "getSubscribeFlow()", imports = {}))
    @NotNull
    /* JADX INFO: renamed from: f */
    public static final Observable<SubscribeMessage> m42742f(@NotNull InterfaceC37236a interfaceC37236a, @NotNull SubscribeRequest request) throws IllegalArgumentException {
        Intrinsics.checkNotNullParameter(interfaceC37236a, "<this>");
        Intrinsics.checkNotNullParameter(request, "request");
        return m42738b(m42740d(interfaceC37236a, request));
    }

    @Deprecated(message = "建议直接使用Flow方式", replaceWith = @ReplaceWith(expression = "getSubscribeFlow()", imports = {}))
    @NotNull
    /* JADX INFO: renamed from: g */
    public static final Observable<SubscribeMessage> m42743g(@NotNull InterfaceC37236a interfaceC37236a, @NotNull String topic, @Nullable Request request) throws IllegalArgumentException {
        Intrinsics.checkNotNullParameter(interfaceC37236a, "<this>");
        Intrinsics.checkNotNullParameter(topic, "topic");
        return m42738b(m42741e(interfaceC37236a, topic, request));
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ Observable m42744h(InterfaceC37236a interfaceC37236a, String str, Request request, int i11, Object obj) throws IllegalArgumentException {
        if ((i11 & 2) != 0) {
            request = null;
        }
        return m42743g(interfaceC37236a, str, request);
    }

    /* JADX INFO: renamed from: i */
    public static final InterfaceC41634e<SubscribeMessage> m42745i(InterfaceC37236a interfaceC37236a, final SubscribeRequest subscribeRequest, SubscribeRequest subscribeRequest2) {
        PeriodRequest period = subscribeRequest.getPeriod();
        boolean z11 = false;
        if (period != null && period.getWaitPeriodResult()) {
            z11 = true;
        }
        final AtomicBoolean atomicBoolean = new AtomicBoolean(z11);
        final InterfaceC41634e<NetworkMessage<?>> interfaceC41634eMo42859d = interfaceC37236a.mo42859d();
        final InterfaceC41634e<Object> interfaceC41634e = new InterfaceC41634e<Object>() { // from class: com.kubi.network.api.subscribe.utils.ChannelUtilsKt$subscribeFlow$$inlined$map$1

            /* JADX INFO: renamed from: com.kubi.network.api.subscribe.utils.ChannelUtilsKt$subscribeFlow$$inlined$map$1$2 */
            /* JADX INFO: compiled from: Collect.kt */
            @Metadata(m90083d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001b\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006"}, m90084d2 = {"kotlinx/coroutines/flow/FlowKt__CollectKt$collect$3", "Lkotlinx/coroutines/flow/f;", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
            @SourceDebugExtension({"SMAP\nCollect.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Collect.kt\nkotlinx/coroutines/flow/FlowKt__CollectKt$collect$3\n+ 2 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 3 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 4 ChannelUtils.kt\ncom/kubi/network/api/subscribe/utils/ChannelUtilsKt\n*L\n1#1,134:1\n53#2:135\n48#3:136\n248#4:137\n*E\n"})
            public static final class C193142 implements InterfaceC41635f<NetworkMessage<?>> {

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ InterfaceC41635f f35837b;

                /* JADX INFO: renamed from: com.kubi.network.api.subscribe.utils.ChannelUtilsKt$subscribeFlow$$inlined$map$1$2$1, reason: invalid class name */
                @Metadata(m90085k = 3, m90086mv = {1, 8, 0}, m90088xi = 48)
                @DebugMetadata(m90121c = "com.kubi.network.api.subscribe.utils.ChannelUtilsKt$subscribeFlow$$inlined$map$1$2", m90122f = "ChannelUtils.kt", m90123i = {}, m90124l = {136}, m90125m = "emit", m90126n = {}, m90127s = {})
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
                        return C193142.this.emit(null, this);
                    }
                }

                public C193142(InterfaceC41635f interfaceC41635f) {
                    this.f35837b = interfaceC41635f;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.InterfaceC41635f
                @Nullable
                public Object emit(NetworkMessage<?> networkMessage, @NotNull Continuation continuation) {
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
                        InterfaceC41635f interfaceC41635f = this.f35837b;
                        Object data = networkMessage.getData();
                        anonymousClass1.label = 1;
                        if (interfaceC41635f.emit(data, anonymousClass1) == coroutine_suspended) {
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
            public Object collect(@NotNull InterfaceC41635f<? super Object> interfaceC41635f, @NotNull Continuation continuation) {
                Object objCollect = interfaceC41634eMo42859d.collect(new C193142(interfaceC41635f), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        };
        final InterfaceC41634e<Object> interfaceC41634e2 = new InterfaceC41634e<Object>() { // from class: com.kubi.network.api.subscribe.utils.ChannelUtilsKt$subscribeFlow$$inlined$filterIsInstance$1

            /* JADX INFO: renamed from: com.kubi.network.api.subscribe.utils.ChannelUtilsKt$subscribeFlow$$inlined$filterIsInstance$1$2 */
            /* JADX INFO: compiled from: Collect.kt */
            @Metadata(m90083d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001b\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006"}, m90084d2 = {"kotlinx/coroutines/flow/FlowKt__CollectKt$collect$3", "Lkotlinx/coroutines/flow/f;", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
            @SourceDebugExtension({"SMAP\nCollect.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Collect.kt\nkotlinx/coroutines/flow/FlowKt__CollectKt$collect$3\n+ 2 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 3 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n*L\n1#1,134:1\n53#2:135\n21#3:136\n35#3:137\n22#3:138\n*E\n"})
            public static final class C193132 implements InterfaceC41635f<Object> {

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ InterfaceC41635f f35835b;

                /* JADX INFO: renamed from: com.kubi.network.api.subscribe.utils.ChannelUtilsKt$subscribeFlow$$inlined$filterIsInstance$1$2$1, reason: invalid class name */
                @Metadata(m90085k = 3, m90086mv = {1, 8, 0}, m90088xi = 48)
                @DebugMetadata(m90121c = "com.kubi.network.api.subscribe.utils.ChannelUtilsKt$subscribeFlow$$inlined$filterIsInstance$1$2", m90122f = "ChannelUtils.kt", m90123i = {}, m90124l = {137}, m90125m = "emit", m90126n = {}, m90127s = {})
                public static final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    Object L$1;
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
                        return C193132.this.emit(null, this);
                    }
                }

                public C193132(InterfaceC41635f interfaceC41635f) {
                    this.f35835b = interfaceC41635f;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.InterfaceC41635f
                @Nullable
                public Object emit(Object obj, @NotNull Continuation continuation) {
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
                        InterfaceC41635f interfaceC41635f = this.f35835b;
                        if (obj instanceof SubscribeMessage) {
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
            @Nullable
            public Object collect(@NotNull InterfaceC41635f<? super Object> interfaceC41635f, @NotNull Continuation continuation) {
                Object objCollect = interfaceC41634e.collect(new C193132(interfaceC41635f), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        };
        return C41636g.m90890N(C41636g.m90895S(C41636g.m90897U(C41636g.m90890N(new InterfaceC41634e<SubscribeMessage>() { // from class: com.kubi.network.api.subscribe.utils.ChannelUtilsKt$subscribeFlow$$inlined$filter$1

            /* JADX INFO: renamed from: com.kubi.network.api.subscribe.utils.ChannelUtilsKt$subscribeFlow$$inlined$filter$1$2 */
            /* JADX INFO: compiled from: Collect.kt */
            @Metadata(m90083d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001b\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006"}, m90084d2 = {"kotlinx/coroutines/flow/FlowKt__CollectKt$collect$3", "Lkotlinx/coroutines/flow/f;", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
            @SourceDebugExtension({"SMAP\nCollect.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Collect.kt\nkotlinx/coroutines/flow/FlowKt__CollectKt$collect$3\n+ 2 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 3 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 4 ChannelUtils.kt\ncom/kubi/network/api/subscribe/utils/ChannelUtilsKt\n*L\n1#1,134:1\n53#2:135\n21#3:136\n22#3:154\n250#4,17:137\n*E\n"})
            public static final class C193122 implements InterfaceC41635f<SubscribeMessage> {

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ InterfaceC41635f f35831b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ AtomicBoolean f35832c;

                /* JADX INFO: renamed from: d */
                public final /* synthetic */ SubscribeRequest f35833d;

                /* JADX INFO: renamed from: com.kubi.network.api.subscribe.utils.ChannelUtilsKt$subscribeFlow$$inlined$filter$1$2$1, reason: invalid class name */
                @Metadata(m90085k = 3, m90086mv = {1, 8, 0}, m90088xi = 48)
                @DebugMetadata(m90121c = "com.kubi.network.api.subscribe.utils.ChannelUtilsKt$subscribeFlow$$inlined$filter$1$2", m90122f = "ChannelUtils.kt", m90123i = {}, m90124l = {136}, m90125m = "emit", m90126n = {}, m90127s = {})
                public static final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    Object L$1;
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
                        return C193122.this.emit(null, this);
                    }
                }

                public C193122(InterfaceC41635f interfaceC41635f, AtomicBoolean atomicBoolean, SubscribeRequest subscribeRequest) {
                    this.f35831b = interfaceC41635f;
                    this.f35832c = atomicBoolean;
                    this.f35833d = subscribeRequest;
                }

                /* JADX WARN: Code duplicated, block: B:35:0x00c4 A[RETURN] */
                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.InterfaceC41635f
                @Nullable
                public Object emit(SubscribeMessage subscribeMessage, @NotNull Continuation continuation) throws WaitPeriodException {
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
                        InterfaceC41635f interfaceC41635f = this.f35831b;
                        SubscribeMessage subscribeMessage2 = subscribeMessage;
                        if (!subscribeMessage2.isSocketMessage()) {
                            String id2 = subscribeMessage2.getId();
                            PeriodRequest period = this.f35833d.getPeriod();
                            if (Intrinsics.areEqual(id2, period != null ? period.getId() : null)) {
                                if (!(subscribeMessage2.getExtension() instanceof Throwable)) {
                                    this.f35832c.set(false);
                                    anonymousClass1.label = 1;
                                    if (interfaceC41635f.emit(subscribeMessage, anonymousClass1) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                } else {
                                    if (this.f35832c.get()) {
                                        throw new WaitPeriodException("period: " + this.f35833d.getPeriod().getRequest().url().encodedPath() + ", topic: " + this.f35833d.getTopic(), (Throwable) subscribeMessage2.getExtension());
                                    }
                                    C44128b.m97259c("ChannelUtils", "ignore error");
                                }
                            }
                        } else if (!this.f35832c.get()) {
                            anonymousClass1.label = 1;
                            if (interfaceC41635f.emit(subscribeMessage, anonymousClass1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
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
            public Object collect(@NotNull InterfaceC41635f<? super SubscribeMessage> interfaceC41635f, @NotNull Continuation continuation) {
                Object objCollect = interfaceC41634e2.collect(new C193122(interfaceC41635f, atomicBoolean, subscribeRequest), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        }, C19319e.m42764c()), new ChannelUtilsKt$subscribeFlow$3(interfaceC37236a, subscribeRequest, null)), new ChannelUtilsKt$subscribeFlow$4(interfaceC37236a, subscribeRequest2, null)), C19319e.m42762a());
    }
}
