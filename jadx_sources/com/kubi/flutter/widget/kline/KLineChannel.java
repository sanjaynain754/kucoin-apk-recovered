package com.kubi.flutter.widget.kline;

import androidx.media3.exoplayer.rtsp.SessionDescription;
import com.appsflyer.AppsFlyerProperties;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLite;
import com.kubi.flutter.proto.kline.CandleList;
import com.kubi.flutter.proto.kline.EventMessage;
import com.kubi.flutter.proto.kline.OrderList;
import com.kubi.flutter.proto.kline.Request;
import com.kubi.flutter.proto.kline.RequestKt$Dsl;
import com.kubi.flutter.proto.kline.Response;
import com.kubi.flutter.proto.kline.ResponseKt$Dsl;
import com.kubi.flutter.proto.kline.ViewControl;
import com.kubi.flutter.widget.kline.exception.KLineMessage;
import com.kubi.flutter.widget.kline.utils.ByteBufferPool;
import com.kubi.flutter.widget.kline.utils.EventListeners;
import com.tencent.bugly.proguard.C33675gh;
import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugin.common.BinaryCodec;
import io.flutter.plugin.common.BinaryMessenger;
import java.io.IOException;
import java.nio.ByteBuffer;
import kotlinx.coroutines.C41686h;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.C41713n0;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineName;
import kotlinx.coroutines.InterfaceC41709m0;
import o00.C42911a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p481ny.C42899b;
import p499og.C43043a;
import p569qq.C43846g;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.coroutines.AbstractCoroutineContextElement;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.CoroutineContext;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;
import rg0.C44091j;
import rg0.InterfaceC44088g;
import ro.C44128b;

/* JADX INFO: compiled from: KLineChannel.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 ;2\u00020\u0001:\u0002;<B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013J&\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0016\u001a\u00020\u00172\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019H\u0086@¢\u0006\u0002\u0010\u001bJ\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u001d\u001a\u00020\u001eH\u0096@¢\u0006\u0002\u0010\u001fJ\u0018\u0010 \u001a\u0004\u0018\u00010\u00152\u0006\u0010!\u001a\u00020\"H\u0096@¢\u0006\u0002\u0010#J\u0018\u0010$\u001a\u0004\u0018\u00010\u00152\u0006\u0010%\u001a\u00020&H\u0096@¢\u0006\u0002\u0010'J\u0010\u0010(\u001a\u00020\u00112\u0006\u0010)\u001a\u00020\u000fH\u0016J\u0010\u0010*\u001a\u00020\u00112\u0006\u0010)\u001a\u00020\u000fH\u0016J\u0018\u0010+\u001a\u0004\u0018\u00010\u00152\u0006\u0010,\u001a\u00020-H\u0082@¢\u0006\u0002\u0010.J\u0016\u0010/\u001a\u00020\b2\u0006\u0010,\u001a\u00020-H\u0082@¢\u0006\u0002\u0010.J\u0016\u00100\u001a\u00020\u00152\u0006\u00101\u001a\u000202H\u0082@¢\u0006\u0002\u00103J\r\u00104\u001a\u00020\u0011H\u0000¢\u0006\u0002\b5J\f\u00106\u001a\u00020\b*\u000207H\u0002J\"\u00108\u001a\u0004\u0018\u00010\u0015*\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u00109\u001a\u00020\bH\u0082@¢\u0006\u0002\u0010:R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006="}, m90084d2 = {"Lcom/kubi/flutter/widget/kline/KLineChannel;", "Lcom/kubi/flutter/widget/kline/IKLineChannel;", "<init>", "()V", "bufferPool", "Lcom/kubi/flutter/widget/kline/utils/ByteBufferPool;", AppsFlyerProperties.CHANNEL, "Lio/flutter/plugin/common/BasicMessageChannel;", "Ljava/nio/ByteBuffer;", "sendLock", "Lkotlinx/coroutines/sync/Semaphore;", "channelScope", "Lkotlinx/coroutines/CoroutineScope;", "listeners", "Lcom/kubi/flutter/widget/kline/utils/EventListeners;", "Lcom/kubi/flutter/widget/kline/IKLineChannel$EventListener;", "bind", "", "binaryMessenger", "Lio/flutter/plugin/common/BinaryMessenger;", "update", "Lcom/kubi/flutter/proto/kline/Response;", "type", "Lcom/kubi/flutter/proto/kline/CandleList$UpdateType;", "candleItemList", "", "Lcom/kubi/flutter/proto/kline/CandleItem;", "(Lcom/kubi/flutter/proto/kline/CandleList$UpdateType;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sendControl", SessionDescription.ATTR_CONTROL, "Lcom/kubi/flutter/proto/kline/ViewControl;", "(Lcom/kubi/flutter/proto/kline/ViewControl;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sendCandleList", "candleListData", "Lcom/kubi/flutter/proto/kline/CandleList;", "(Lcom/kubi/flutter/proto/kline/CandleList;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sendOrderList", "orderListData", "Lcom/kubi/flutter/proto/kline/OrderList;", "(Lcom/kubi/flutter/proto/kline/OrderList;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "addListener", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "removeListener", C33675gh.f70005k, "request", "Lcom/kubi/flutter/proto/kline/Request;", "(Lcom/kubi/flutter/proto/kline/Request;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onReceived", "onListenerEvent", "eventMessage", "Lcom/kubi/flutter/proto/kline/EventMessage;", "(Lcom/kubi/flutter/proto/kline/EventMessage;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "close", "close$LKLineWidget_googleRelease", "toByteBuffer", "Lcom/google/protobuf/MessageLite;", "sendAsync", "message", "(Lio/flutter/plugin/common/BasicMessageChannel;Ljava/nio/ByteBuffer;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "InnerMessageHandler", "LKLineWidget_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nKLineChannel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KLineChannel.kt\ncom/kubi/flutter/widget/kline/KLineChannel\n+ 2 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt\n+ 3 RequestKt.kt\ncom/kubi/flutter/proto/kline/RequestKtKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 CandleListKt.kt\ncom/kubi/flutter/proto/kline/CandleListKtKt\n+ 6 KLineIssue.kt\ncom/kubi/flutter/widget/kline/exception/KLineIssueKt\n+ 7 EventListeners.kt\ncom/kubi/flutter/widget/kline/utils/EventListeners\n+ 8 ResponseKt.kt\ncom/kubi/flutter/proto/kline/ResponseKtKt\n*L\n1#1,227:1\n47#2,4:228\n8#3:232\n8#3:236\n8#3:248\n8#3:260\n1#4:233\n1#4:235\n1#4:237\n1#4:249\n1#4:261\n1#4:267\n8#5:234\n51#6,10:238\n51#6,10:250\n45#6,4:268\n46#7,4:262\n8#8:266\n*S KotlinDebug\n*F\n+ 1 KLineChannel.kt\ncom/kubi/flutter/widget/kline/KLineChannel\n*L\n45#1:228,4\n62#1:232\n72#1:236\n84#1:248\n97#1:260\n62#1:233\n63#1:235\n72#1:237\n84#1:249\n97#1:261\n159#1:267\n63#1:234\n81#1:238,10\n94#1:250,10\n172#1:268,4\n157#1:262,4\n159#1:266\n*E\n"})
public final class KLineChannel implements IKLineChannel {

    /* JADX INFO: renamed from: f */
    @NotNull
    public static final Companion f22320f = new Companion(null);

    /* JADX INFO: renamed from: b */
    @Nullable
    public BasicMessageChannel<ByteBuffer> f22322b;

    /* JADX INFO: renamed from: a */
    @NotNull
    public final ByteBufferPool f22321a = new ByteBufferPool();

    /* JADX INFO: renamed from: c */
    @NotNull
    public final InterfaceC44088g f22323c = C44091j.m97147a(1, 1);

    /* JADX INFO: renamed from: d */
    @NotNull
    public final InterfaceC41709m0 f22324d = C41713n0.m91125a(new CoroutineName("KLineChannel").plus(C42911a.m94120b()).plus(new C12747a(CoroutineExceptionHandler.INSTANCE)));

    /* JADX INFO: renamed from: e */
    @NotNull
    public final EventListeners<IKLineChannel.a> f22325e = new EventListeners<>();

    /* JADX INFO: compiled from: KLineChannel.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m90084d2 = {"Lcom/kubi/flutter/widget/kline/KLineChannel$Companion;", "", "<init>", "()V", "TAG", "", "LKLineWidget_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* JADX INFO: compiled from: KLineChannel.kt */
    @Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J \u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00022\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\tH\u0016¨\u0006\n"}, m90084d2 = {"Lcom/kubi/flutter/widget/kline/KLineChannel$InnerMessageHandler;", "Lio/flutter/plugin/common/BasicMessageChannel$MessageHandler;", "Ljava/nio/ByteBuffer;", "<init>", "(Lcom/kubi/flutter/widget/kline/KLineChannel;)V", "onMessage", "", "message", "reply", "Lio/flutter/plugin/common/BasicMessageChannel$Reply;", "LKLineWidget_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nKLineChannel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KLineChannel.kt\ncom/kubi/flutter/widget/kline/KLineChannel$InnerMessageHandler\n+ 2 ResponseKt.kt\ncom/kubi/flutter/proto/kline/ResponseKtKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,227:1\n8#2:228\n1#3:229\n*S KotlinDebug\n*F\n+ 1 KLineChannel.kt\ncom/kubi/flutter/widget/kline/KLineChannel$InnerMessageHandler\n*L\n217#1:228\n217#1:229\n*E\n"})
    public final class InnerMessageHandler implements BasicMessageChannel.MessageHandler<ByteBuffer> {
        public InnerMessageHandler() {
        }

        @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onMessage(@Nullable ByteBuffer byteBuffer, @NotNull BasicMessageChannel.Reply<ByteBuffer> reply) throws InvalidProtocolBufferException {
            Intrinsics.checkNotNullParameter(reply, "reply");
            if (byteBuffer != null && byteBuffer.capacity() != 0) {
                C41696j.m91104d(KLineChannel.this.f22324d, null, null, new KLineChannel$InnerMessageHandler$onMessage$2(KLineChannel.this, Request.parseFrom(byteBuffer), reply, null), 3, null);
                return;
            }
            KLineChannel kLineChannel = KLineChannel.this;
            ResponseKt$Dsl.Companion companion = ResponseKt$Dsl.f22177b;
            Response.C12705b c12705bNewBuilder = Response.newBuilder();
            Intrinsics.checkNotNullExpressionValue(c12705bNewBuilder, "newBuilder(...)");
            ResponseKt$Dsl responseKt$Dsl_create = companion._create(c12705bNewBuilder);
            responseKt$Dsl_create.m24019b(400);
            Unit unit = Unit.INSTANCE;
            reply.reply(kLineChannel.m24120s(responseKt$Dsl_create.m24018a()));
        }
    }

    /* JADX INFO: renamed from: com.kubi.flutter.widget.kline.KLineChannel$a */
    /* JADX INFO: compiled from: CoroutineExceptionHandler.kt */
    @Metadata(m90083d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t¸\u0006\u0000"}, m90084d2 = {"kotlinx/coroutines/CoroutineExceptionHandlerKt$CoroutineExceptionHandler$1", "Lkotlin/coroutines/AbstractCoroutineContextElement;", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "handleException", "", "context", "Lkotlin/coroutines/CoroutineContext;", "exception", "", "kotlinx-coroutines-core"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nCoroutineExceptionHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt$CoroutineExceptionHandler$1\n+ 2 KLineChannel.kt\ncom/kubi/flutter/widget/kline/KLineChannel\n+ 3 KLineIssue.kt\ncom/kubi/flutter/widget/kline/exception/KLineIssueKt\n*L\n1#1,49:1\n45#2:50\n45#3,4:51\n*S KotlinDebug\n*F\n+ 1 KLineChannel.kt\ncom/kubi/flutter/widget/kline/KLineChannel\n*L\n45#1:51,4\n*E\n"})
    public static final class C12747a extends AbstractCoroutineContextElement implements CoroutineExceptionHandler {
        public C12747a(CoroutineExceptionHandler.Companion companion) {
            super(companion);
        }

        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public void handleException(CoroutineContext context, Throwable exception) {
            if (!C42899b.m94075e(exception)) {
                C43043a.m94532c(exception, "channelScope unhatched");
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.kubi.flutter.widget.kline.IKLineChannel
    @Nullable
    /* JADX INFO: renamed from: a */
    public Object mo24110a(@NotNull OrderList orderList, @NotNull Continuation<? super Response> continuation) {
        KLineChannel$sendOrderList$1 kLineChannel$sendOrderList$1;
        if (continuation instanceof KLineChannel$sendOrderList$1) {
            kLineChannel$sendOrderList$1 = (KLineChannel$sendOrderList$1) continuation;
            int i11 = kLineChannel$sendOrderList$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                kLineChannel$sendOrderList$1.label = i11 - Integer.MIN_VALUE;
            } else {
                kLineChannel$sendOrderList$1 = new KLineChannel$sendOrderList$1(this, continuation);
            }
        } else {
            kLineChannel$sendOrderList$1 = new KLineChannel$sendOrderList$1(this, continuation);
        }
        Object objM24118q = kLineChannel$sendOrderList$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = kLineChannel$sendOrderList$1.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objM24118q);
            if (orderList.getOrderType() == OrderList.OrderType.UNRECOGNIZED) {
                if (StringsKt.startsWith$default("orderType is UNRECOGNIZED", "openDataPush 2 times", false, 2, (Object) null)) {
                    C43846g.m96568c(new KLineMessage("orderType is UNRECOGNIZED", "KLineChannel", true), null, 2, null);
                } else {
                    C43043a.m94533d("orderType is UNRECOGNIZED", "KLineChannel");
                }
                return null;
            }
            RequestKt$Dsl.Companion companion = RequestKt$Dsl.f22173b;
            Request.C12703b c12703bNewBuilder = Request.newBuilder();
            Intrinsics.checkNotNullExpressionValue(c12703bNewBuilder, "newBuilder(...)");
            RequestKt$Dsl requestKt$Dsl_create = companion._create(c12703bNewBuilder);
            requestKt$Dsl_create.m24013c(orderList);
            Request requestM24011a = requestKt$Dsl_create.m24011a();
            kLineChannel$sendOrderList$1.L$0 = SpillingKt.nullOutSpilledVariable(orderList);
            kLineChannel$sendOrderList$1.L$1 = SpillingKt.nullOutSpilledVariable(requestM24011a);
            kLineChannel$sendOrderList$1.label = 1;
            objM24118q = m24118q(requestM24011a, kLineChannel$sendOrderList$1);
            if (objM24118q == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objM24118q);
        }
        return (Response) objM24118q;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.kubi.flutter.widget.kline.IKLineChannel
    @Nullable
    /* JADX INFO: renamed from: b */
    public Object mo24111b(@NotNull CandleList candleList, @NotNull Continuation<? super Response> continuation) {
        KLineChannel$sendCandleList$1 kLineChannel$sendCandleList$1;
        if (continuation instanceof KLineChannel$sendCandleList$1) {
            kLineChannel$sendCandleList$1 = (KLineChannel$sendCandleList$1) continuation;
            int i11 = kLineChannel$sendCandleList$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                kLineChannel$sendCandleList$1.label = i11 - Integer.MIN_VALUE;
            } else {
                kLineChannel$sendCandleList$1 = new KLineChannel$sendCandleList$1(this, continuation);
            }
        } else {
            kLineChannel$sendCandleList$1 = new KLineChannel$sendCandleList$1(this, continuation);
        }
        Object objM24118q = kLineChannel$sendCandleList$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = kLineChannel$sendCandleList$1.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objM24118q);
            if (candleList.getUpdateType() == CandleList.UpdateType.UNRECOGNIZED) {
                if (StringsKt.startsWith$default("updateType is UNRECOGNIZED", "openDataPush 2 times", false, 2, (Object) null)) {
                    C43846g.m96568c(new KLineMessage("updateType is UNRECOGNIZED", "KLineChannel", true), null, 2, null);
                } else {
                    C43043a.m94533d("updateType is UNRECOGNIZED", "KLineChannel");
                }
                return null;
            }
            RequestKt$Dsl.Companion companion = RequestKt$Dsl.f22173b;
            Request.C12703b c12703bNewBuilder = Request.newBuilder();
            Intrinsics.checkNotNullExpressionValue(c12703bNewBuilder, "newBuilder(...)");
            RequestKt$Dsl requestKt$Dsl_create = companion._create(c12703bNewBuilder);
            requestKt$Dsl_create.m24012b(candleList);
            Request requestM24011a = requestKt$Dsl_create.m24011a();
            kLineChannel$sendCandleList$1.L$0 = SpillingKt.nullOutSpilledVariable(candleList);
            kLineChannel$sendCandleList$1.L$1 = SpillingKt.nullOutSpilledVariable(requestM24011a);
            kLineChannel$sendCandleList$1.label = 1;
            objM24118q = m24118q(requestM24011a, kLineChannel$sendCandleList$1);
            if (objM24118q == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objM24118q);
        }
        return (Response) objM24118q;
    }

    @Override // com.kubi.flutter.widget.kline.IKLineChannel
    @Nullable
    /* JADX INFO: renamed from: c */
    public Object mo24112c(@NotNull ViewControl viewControl, @NotNull Continuation<? super Response> continuation) {
        RequestKt$Dsl.Companion companion = RequestKt$Dsl.f22173b;
        Request.C12703b c12703bNewBuilder = Request.newBuilder();
        Intrinsics.checkNotNullExpressionValue(c12703bNewBuilder, "newBuilder(...)");
        RequestKt$Dsl requestKt$Dsl_create = companion._create(c12703bNewBuilder);
        requestKt$Dsl_create.m24014d(viewControl);
        return m24118q(requestKt$Dsl_create.m24011a(), continuation);
    }

    @Override // com.kubi.flutter.widget.kline.IKLineChannel
    /* JADX INFO: renamed from: d */
    public void mo24113d(@NotNull IKLineChannel.a listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f22325e.m24390b(listener);
    }

    /* JADX INFO: renamed from: m */
    public final void m24114m(@NotNull BinaryMessenger binaryMessenger) {
        Intrinsics.checkNotNullParameter(binaryMessenger, "binaryMessenger");
        C44128b.m97266j("KLineChannel", "bind");
        BasicMessageChannel<ByteBuffer> basicMessageChannel = new BasicMessageChannel<>(binaryMessenger, "kline-channel", BinaryCodec.INSTANCE_DIRECT);
        basicMessageChannel.setMessageHandler(new InnerMessageHandler());
        this.f22322b = basicMessageChannel;
    }

    /* JADX INFO: renamed from: n */
    public final void m24115n() {
        try {
            BasicMessageChannel<ByteBuffer> basicMessageChannel = this.f22322b;
            if (basicMessageChannel != null) {
                basicMessageChannel.setMessageHandler(null);
            }
            this.f22322b = null;
            this.f22325e.m24391c();
            C41713n0.m91129e(this.f22324d, null, 1, null);
        } catch (Exception e11) {
            if (C42899b.m94075e(e11)) {
                return;
            }
            C43043a.m94532c(e11, "channelScope close error");
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x008c  */
    /* JADX WARN: Code duplicated, block: B:33:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: o */
    public final Object m24116o(EventMessage eventMessage, Continuation<? super Response> continuation) {
        KLineChannel$onListenerEvent$1 kLineChannel$onListenerEvent$1;
        Object objFirstOrNull;
        Object obj;
        Response response;
        if (continuation instanceof KLineChannel$onListenerEvent$1) {
            kLineChannel$onListenerEvent$1 = (KLineChannel$onListenerEvent$1) continuation;
            int i11 = kLineChannel$onListenerEvent$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                kLineChannel$onListenerEvent$1.label = i11 - Integer.MIN_VALUE;
            } else {
                kLineChannel$onListenerEvent$1 = new KLineChannel$onListenerEvent$1(this, continuation);
            }
        } else {
            kLineChannel$onListenerEvent$1 = new KLineChannel$onListenerEvent$1(this, continuation);
        }
        Object objMo24267a = kLineChannel$onListenerEvent$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = kLineChannel$onListenerEvent$1.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objMo24267a);
            EventListeners<IKLineChannel.a> eventListeners = this.f22325e;
            synchronized (eventListeners.f22493a) {
                objFirstOrNull = CollectionsKt.firstOrNull(eventListeners.f22493a);
            }
            if (objFirstOrNull == null) {
                obj = null;
            } else {
                IKLineChannel.a aVar = (IKLineChannel.a) objFirstOrNull;
                kLineChannel$onListenerEvent$1.L$0 = SpillingKt.nullOutSpilledVariable(eventMessage);
                kLineChannel$onListenerEvent$1.L$1 = SpillingKt.nullOutSpilledVariable(eventListeners);
                kLineChannel$onListenerEvent$1.L$2 = SpillingKt.nullOutSpilledVariable(objFirstOrNull);
                kLineChannel$onListenerEvent$1.L$3 = SpillingKt.nullOutSpilledVariable(kLineChannel$onListenerEvent$1);
                kLineChannel$onListenerEvent$1.L$4 = SpillingKt.nullOutSpilledVariable(aVar);
                kLineChannel$onListenerEvent$1.I$0 = 0;
                kLineChannel$onListenerEvent$1.I$1 = 0;
                kLineChannel$onListenerEvent$1.label = 1;
                objMo24267a = aVar.mo24267a(eventMessage, kLineChannel$onListenerEvent$1);
                if (objMo24267a == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            response = (Response) obj;
            if (response == null) {
                return response;
            }
            ResponseKt$Dsl.Companion companion = ResponseKt$Dsl.f22177b;
            Response.C12705b c12705bNewBuilder = Response.newBuilder();
            Intrinsics.checkNotNullExpressionValue(c12705bNewBuilder, "newBuilder(...)");
            ResponseKt$Dsl responseKt$Dsl_create = companion._create(c12705bNewBuilder);
            responseKt$Dsl_create.m24019b(402);
            return responseKt$Dsl_create.m24018a();
        }
        if (i12 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(objMo24267a);
        obj = objMo24267a;
        response = (Response) obj;
        if (response == null) {
            return response;
        }
        ResponseKt$Dsl.Companion companion2 = ResponseKt$Dsl.f22177b;
        Response.C12705b c12705bNewBuilder2 = Response.newBuilder();
        Intrinsics.checkNotNullExpressionValue(c12705bNewBuilder2, "newBuilder(...)");
        ResponseKt$Dsl responseKt$Dsl_create2 = companion2._create(c12705bNewBuilder2);
        responseKt$Dsl_create2.m24019b(402);
        return responseKt$Dsl_create2.m24018a();
    }

    /* JADX INFO: renamed from: p */
    public final Object m24117p(Request request, Continuation<? super ByteBuffer> continuation) {
        return C41686h.m91049g(C42911a.m94120b(), new KLineChannel$onReceived$2(request, this, null), continuation);
    }

    /* JADX INFO: renamed from: q */
    public final Object m24118q(Request request, Continuation<? super Response> continuation) {
        return C41686h.m91049g(C42911a.m94120b(), new KLineChannel$send$2(this, request, null), continuation);
    }

    /* JADX INFO: renamed from: r */
    public final Object m24119r(BasicMessageChannel<ByteBuffer> basicMessageChannel, ByteBuffer byteBuffer, Continuation<? super Response> continuation) {
        return C41686h.m91049g(C42911a.m94121c(), new KLineChannel$sendAsync$2(basicMessageChannel, byteBuffer, this, null), continuation);
    }

    /* JADX INFO: renamed from: s */
    public final ByteBuffer m24120s(MessageLite messageLite) throws IOException {
        int serializedSize = messageLite.getSerializedSize();
        ByteBuffer byteBufferM24374a = this.f22321a.m24374a(serializedSize);
        messageLite.writeTo(CodedOutputStream.newInstance(byteBufferM24374a));
        byteBufferM24374a.position(serializedSize);
        return byteBufferM24374a;
    }
}
