package com.kubi.flutter.widget.kline;

import com.kubi.flutter.proto.kline.LoadMoreEvent;
import com.kubi.flutter.proto.kline.Response;
import com.kubi.flutter.proto.kline.ResponseKt$Dsl;
import com.kubi.flutter.widget.kline.utils.KLineRealTimeLog;
import kotlinx.coroutines.InterfaceC41709m0;
import p481ny.C42899b;
import p499og.C43043a;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: KLineViewController.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "Lcom/kubi/flutter/proto/kline/Response;", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.flutter.widget.kline.KLineViewController$onLoadMore$2", m90122f = "KLineViewController.kt", m90123i = {1}, m90124l = {574, 580}, m90125m = "invokeSuspend", m90126n = {"response"}, m90127s = {"L$0"})
@SourceDebugExtension({"SMAP\nKLineViewController.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KLineViewController.kt\ncom/kubi/flutter/widget/kline/KLineViewController$onLoadMore$2\n+ 2 ResponseKt.kt\ncom/kubi/flutter/proto/kline/ResponseKtKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 KLineIssue.kt\ncom/kubi/flutter/widget/kline/exception/KLineIssueKt\n*L\n1#1,627:1\n8#2:628\n8#2:630\n1#3:629\n1#3:631\n45#4,4:632\n*S KotlinDebug\n*F\n+ 1 KLineViewController.kt\ncom/kubi/flutter/widget/kline/KLineViewController$onLoadMore$2\n*L\n572#1:628\n575#1:630\n572#1:629\n575#1:631\n583#1:632,4\n*E\n"})
public final class KLineViewController$onLoadMore$2 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Response>, Object> {
    final /* synthetic */ LoadMoreEvent $loadMoreEvent;
    Object L$0;
    int label;
    final /* synthetic */ KLineViewController this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KLineViewController$onLoadMore$2(LoadMoreEvent loadMoreEvent, KLineViewController kLineViewController, Continuation<? super KLineViewController$onLoadMore$2> continuation) {
        super(2, continuation);
        this.$loadMoreEvent = loadMoreEvent;
        this.this$0 = kLineViewController;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new KLineViewController$onLoadMore$2(this.$loadMoreEvent, this.this$0, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Response> continuation) {
        return ((KLineViewController$onLoadMore$2) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0070  */
    /* JADX WARN: Code duplicated, block: B:43:0x0113  */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0068, code lost:
    
        if (r12 == r0) goto L35;
     */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Response responseM24018a;
        Response response;
        Throwable th2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    response = (Response) this.L$0;
                    try {
                        ResultKt.throwOnFailure(obj);
                    } catch (Throwable th3) {
                        th2 = th3;
                        KLineRealTimeLog.f22494a.m24393a("onLoadMore_error:" + th2.getMessage());
                        if (!C42899b.m94075e(th2)) {
                            C43043a.m94532c(th2, "KLineViewController");
                        }
                    }
                    return response;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        } else {
            ResultKt.throwOnFailure(obj);
            if (this.$loadMoreEvent.getFirstTime() <= 0) {
                ResponseKt$Dsl.Companion companion = ResponseKt$Dsl.f22177b;
                Response.C12705b c12705bNewBuilder = Response.newBuilder();
                Intrinsics.checkNotNullExpressionValue(c12705bNewBuilder, "newBuilder(...)");
                ResponseKt$Dsl responseKt$Dsl_create = companion._create(c12705bNewBuilder);
                responseKt$Dsl_create.m24019b(400);
                return responseKt$Dsl_create.m24018a();
            }
            KLineDataSession kLineDataSession = (KLineDataSession) this.this$0.f22401g.get();
            if (kLineDataSession != null) {
                long firstTime = this.$loadMoreEvent.getFirstTime();
                this.label = 1;
                obj = kLineDataSession.m24170o(firstTime, this);
            } else {
                ResponseKt$Dsl.Companion companion2 = ResponseKt$Dsl.f22177b;
                Response.C12705b c12705bNewBuilder2 = Response.newBuilder();
                Intrinsics.checkNotNullExpressionValue(c12705bNewBuilder2, "newBuilder(...)");
                ResponseKt$Dsl responseKt$Dsl_create2 = companion2._create(c12705bNewBuilder2);
                responseKt$Dsl_create2.m24019b(400);
                responseM24018a = responseKt$Dsl_create2.m24018a();
                if (responseM24018a.getCode() == 400 && responseM24018a.getCode() != 500) {
                    KLineRealTimeLog.f22494a.m24393a("onLoadMore_loadHistoryOrderData, type=" + this.this$0.f22397c.getType() + ",firstTime=" + this.$loadMoreEvent.getFirstTime());
                    try {
                        KLineDataSession kLineDataSession2 = (KLineDataSession) this.this$0.f22401g.get();
                        if (kLineDataSession2 != null) {
                            IKLineDataInteractor.OrderParam orderParamM24265w = this.this$0.f22397c.m24265w();
                            long firstTime2 = this.$loadMoreEvent.getFirstTime();
                            this.L$0 = responseM24018a;
                            this.label = 2;
                            Object objM24171p = kLineDataSession2.m24171p(orderParamM24265w, firstTime2, this);
                            if (objM24171p != coroutine_suspended) {
                                response = responseM24018a;
                                obj = objM24171p;
                                return response;
                            }
                        } else {
                            return responseM24018a;
                        }
                    } catch (Throwable th4) {
                        response = responseM24018a;
                        th2 = th4;
                        KLineRealTimeLog.f22494a.m24393a("onLoadMore_error:" + th2.getMessage());
                        if (!C42899b.m94075e(th2)) {
                            C43043a.m94532c(th2, "KLineViewController");
                        }
                    }
                }
            }
            return coroutine_suspended;
        }
        responseM24018a = (Response) obj;
        if (responseM24018a == null) {
            ResponseKt$Dsl.Companion companion3 = ResponseKt$Dsl.f22177b;
            Response.C12705b c12705bNewBuilder3 = Response.newBuilder();
            Intrinsics.checkNotNullExpressionValue(c12705bNewBuilder3, "newBuilder(...)");
            ResponseKt$Dsl responseKt$Dsl_create3 = companion3._create(c12705bNewBuilder3);
            responseKt$Dsl_create3.m24019b(400);
            responseM24018a = responseKt$Dsl_create3.m24018a();
        }
        return responseM24018a.getCode() == 400 ? responseM24018a : responseM24018a;
    }
}
