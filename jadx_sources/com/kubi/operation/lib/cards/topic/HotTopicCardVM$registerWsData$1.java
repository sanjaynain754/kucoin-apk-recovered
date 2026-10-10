package com.kubi.operation.lib.cards.topic;

import com.google.gson.reflect.TypeToken;
import com.kubi.data.entity.WsMarketSnapshotEntity;
import com.kubi.mvi.common.C19241c;
import com.kubi.operation.lib.entity.TopicCoinWsEntity;
import com.kubi.sdk.websocket.SocketTask;
import com.kubi.sdk.websocket.WebSocketException;
import com.kubi.utils.C27099x;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.InterfaceC41709m0;
import p569qq.C43846g;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import ro.C44128b;

/* JADX INFO: compiled from: HotTopicCardVM.kt */
/* JADX INFO: loaded from: classes32.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.operation.lib.cards.topic.HotTopicCardVM$registerWsData$1", m90122f = "HotTopicCardVM.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
@SourceDebugExtension({"SMAP\nHotTopicCardVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HotTopicCardVM.kt\ncom/kubi/operation/lib/cards/topic/HotTopicCardVM$registerWsData$1\n+ 2 SocketEx.kt\ncom/kubi/sdk/websocket/SocketExKt\n*L\n1#1,35:1\n31#2,11:36\n54#2:47\n*S KotlinDebug\n*F\n+ 1 HotTopicCardVM.kt\ncom/kubi/operation/lib/cards/topic/HotTopicCardVM$registerWsData$1\n*L\n28#1:36,11\n28#1:47\n*E\n"})
public final class HotTopicCardVM$registerWsData$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $symbol;
    final /* synthetic */ String $topic;
    int label;
    final /* synthetic */ HotTopicCardVM this$0;

    /* JADX INFO: renamed from: com.kubi.operation.lib.cards.topic.HotTopicCardVM$registerWsData$1$a */
    /* JADX INFO: compiled from: SocketEx.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nSocketEx.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SocketEx.kt\ncom/kubi/sdk/websocket/SocketExKt$bindSocket$1\n+ 2 MviEx.kt\ncom/kubi/mvi/common/MviExKt\n+ 3 JsonEx.kt\ncom/kubi/mvi/common/JsonExKt\n+ 4 GsonUtils.kt\ncom/kubi/utils/GsonUtils\n+ 5 HotTopicCardVM.kt\ncom/kubi/operation/lib/cards/topic/HotTopicCardVM$registerWsData$1\n+ 6 WebSocketIssue.kt\ncom/kubi/sdk/websocket/WebSocketIssueKt\n*L\n1#1,223:1\n50#2,7:224\n57#2,10:241\n36#3:231\n137#4,5:232\n29#5,4:237\n46#6,2:251\n*S KotlinDebug\n*F\n+ 1 SocketEx.kt\ncom/kubi/sdk/websocket/SocketExKt$bindSocket$1\n*L\n42#1:224,7\n42#1:241,10\n43#1:231\n43#1:232,5\n50#1:251,2\n*E\n"})
    public static final class C19475a implements Function1<String, Unit> {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f36722b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ String f36723c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ HotTopicCardVM f36724d;

        /* JADX INFO: renamed from: com.kubi.operation.lib.cards.topic.HotTopicCardVM$registerWsData$1$a$a */
        /* JADX INFO: compiled from: GsonUtils.kt */
        @Metadata(m90083d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0004"}, m90084d2 = {"com/kubi/utils/GsonUtils$fromJSONOrNull$1", "Lcom/google/gson/reflect/TypeToken;", "Utils_release", "com/kubi/mvi/common/JsonExKt$convertToObj$$inlined$fromJSONOrNull$1", "com/kubi/sdk/websocket/SocketExKt$bindSocket$1$invoke$lambda$2$$inlined$convertToObj$1"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
        @SourceDebugExtension({"SMAP\nGsonUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GsonUtils.kt\ncom/kubi/utils/GsonUtils$fromJSONOrNull$1\n*L\n1#1,195:1\n*E\n"})
        public static final class a extends TypeToken<TopicCoinWsEntity> {
        }

        /* JADX INFO: renamed from: a */
        public final void m43402a(String it) throws Throwable {
            Object objM103844constructorimpl;
            Object objM66914d;
            Intrinsics.checkNotNullParameter(it, "it");
            String str = this.f36722b;
            boolean zM42528a = C19241c.f35620a.m42528a();
            boolean z11 = !zM42528a;
            try {
                Result.Companion companion = Result.INSTANCE;
                try {
                    C27099x c27099x = C27099x.f54458a;
                    objM66914d = C27099x.m66914d(it, new a().getType());
                } catch (Throwable th2) {
                    C43846g.m96569d(th2, "GsonUtils", null, 4, null);
                    objM66914d = null;
                }
                if (objM66914d != null) {
                    TopicCoinWsEntity topicCoinWsEntity = (TopicCoinWsEntity) objM66914d;
                    if (Intrinsics.areEqual(topicCoinWsEntity.getData().getSymbolCode(), this.f36723c)) {
                        this.f36724d.m43400n().postValue(WsMarketSnapshotEntity.covertToTradeItemBean$default(topicCoinWsEntity.getData(), null, 1, null).getFormatChangeRate());
                    }
                    C44128b.m97259c("socket", "Topic->" + str + " 数据解析成功！");
                } else {
                    C44128b.m97259c("socket", "Topic->" + str + " 数据解析失败！");
                    objM66914d = Unit.INSTANCE;
                }
                objM103844constructorimpl = Result.m103844constructorimpl(objM66914d);
            } catch (Throwable th3) {
                Result.Companion companion2 = Result.INSTANCE;
                objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th3));
            }
            Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
            if (thM103847exceptionOrNullimpl != null) {
                if (zM42528a || (thM103847exceptionOrNullimpl instanceof CancellationException)) {
                    throw thM103847exceptionOrNullimpl;
                }
                C44128b.m97262f("crash_issue", "crash_issue->【Socket 发生错误:needCatch->" + z11 + (char) 12305, thM103847exceptionOrNullimpl);
            }
            Throwable thM103847exceptionOrNullimpl2 = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
            if (thM103847exceptionOrNullimpl2 != null) {
                C43846g.m96568c(new WebSocketException(thM103847exceptionOrNullimpl2, "SocketEx", false, null, 8, null), null, 2, null);
                C44128b.m97262f("socket", "topic->" + thM103847exceptionOrNullimpl2 + "->【MVI bindSocket发生错误】", thM103847exceptionOrNullimpl2);
            }
        }

        public C19475a(String str, String str2, HotTopicCardVM hotTopicCardVM) {
            this.f36722b = str;
            this.f36723c = str2;
            this.f36724d = hotTopicCardVM;
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(String str) throws Throwable {
            m43402a(str);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HotTopicCardVM$registerWsData$1(String str, HotTopicCardVM hotTopicCardVM, String str2, Continuation<? super HotTopicCardVM$registerWsData$1> continuation) {
        super(2, continuation);
        this.$topic = str;
        this.this$0 = hotTopicCardVM;
        this.$symbol = str2;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new HotTopicCardVM$registerWsData$1(this.$topic, this.this$0, this.$symbol, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((HotTopicCardVM$registerWsData$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            String str = this.$topic;
            HotTopicCardVM hotTopicCardVM = this.this$0;
            SocketTask.Companion.obtain$default(SocketTask.f48571i, str, hotTopicCardVM, null, 4, null).m58923y(null).m58911j(new C19475a(str, this.$symbol, hotTopicCardVM));
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
