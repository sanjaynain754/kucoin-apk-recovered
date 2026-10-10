package com.kubi.core.biz.callauction.mvi;

import android.text.TextUtils;
import androidx.lifecycle.ViewModelKt;
import com.google.gson.reflect.TypeToken;
import com.kubi.core.biz.callauction.CallAuctionSwitch;
import com.kubi.core.spot.entity.TradeItemBeanEquals;
import com.kubi.core.spot.entity.callAuction.CallAuctionConfigEntity;
import com.kubi.core.spot.entity.callAuction.CallAuctionEstimateInfoEntity;
import com.kubi.core.spot.entity.callAuction.WsCallAuctionEstimateInfoEntity;
import com.kubi.data.entity.SymbolInfoEntity;
import com.kubi.data.entity.SymbolPreviewEntity;
import com.kubi.data.entity.TradeItemBean;
import com.kubi.mvi.common.C19241c;
import com.kubi.mvi.state.AbstractC19291m;
import com.kubi.mvi.state.InterfaceC19282d;
import com.kubi.network.retrofit.utils.RetrofitFlowExKt;
import com.kubi.network.websocket.model.Message;
import com.kubi.p110rn.modules.RNH5InterActionHelperKt;
import com.kubi.sdk.websocket.SocketTask;
import com.kubi.sdk.websocket.WebSocketException;
import com.kubi.utils.C27099x;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.DowngradeExKt;
import g10.C37779j;
import g10.C37781l;
import gf.C37890n;
import java.math.BigDecimal;
import java.util.concurrent.CancellationException;
import je.C40394b;
import ke.CallAuctionInfo;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.InterfaceC41775x1;
import kotlinx.coroutines.flow.C41636g;
import kotlinx.coroutines.flow.InterfaceC41634e;
import mr.C42597a;
import o00.C42911a;
import okhttp3.Request;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p402kf.C41014a;
import p427ld.InterfaceC42170a;
import p428le.C42177a;
import p569qq.C43846g;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.Ref;
import p852kotlin.jvm.internal.SourceDebugExtension;
import ro.C44128b;
import ve.C45518a;

/* JADX INFO: compiled from: CallAuctionViewModel.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m90083d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0094@¢\u0006\u0002\u0010\u0017J\u0016\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u000fH\u0082@¢\u0006\u0002\u0010\u001bJ\u0018\u0010\u001c\u001a\u00020\u00142\b\b\u0002\u0010\u001d\u001a\u00020\u001eH\u0082@¢\u0006\u0002\u0010\u001fJ\u000e\u0010 \u001a\u00020\u0014H\u0082@¢\u0006\u0002\u0010!J\u0010\u0010(\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020\u000fH\u0002J\u0010\u0010)\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u000fH\u0002J\u001a\u0010*\u001a\u0004\u0018\u00010+2\u0006\u0010,\u001a\u00020-2\u0006\u0010\u001a\u001a\u00020\u000fH\u0002J\u0010\u00100\u001a\u00020\u00142\u0006\u00101\u001a\u000202H\u0002J\b\u00103\u001a\u00020\u0014H\u0002J\u000e\u00104\u001a\u00020\u0014H\u0082@¢\u0006\u0002\u0010!J\b\u00105\u001a\u00020\u0014H\u0002J\b\u00106\u001a\u00020\u0014H\u0016J\b\u00107\u001a\u00020\u0014H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R#\u0010\u0007\u001a\n \t*\u0004\u0018\u00010\b0\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\u00020\u00028TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\"\u001a\u0004\u0018\u00010#X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\u0010\u0010.\u001a\u0004\u0018\u00010/X\u0082\u000e¢\u0006\u0002\n\u0000¨\u00068"}, m90084d2 = {"Lcom/kubi/core/biz/callauction/mvi/CallAuctionViewModel;", "Lcom/kubi/mvi/state/SingleSimpleStateVM;", "Lcom/kubi/core/biz/callauction/mvi/CallAuctionContract$UIState;", "<init>", "()V", "repository", "Lcom/kubi/core/spot/business/callAuction/api/CallAuctionRepository;", "apiRequest", "Lcom/kubi/core/biz/callauction/api/ICallAuctionSocketRequest;", "kotlin.jvm.PlatformType", "getApiRequest", "()Lcom/kubi/core/biz/callauction/api/ICallAuctionSocketRequest;", "apiRequest$delegate", "Lkotlin/Lazy;", "oldTopicString", "", "initState", "getInitState", "()Lcom/kubi/core/biz/callauction/mvi/CallAuctionContract$UIState;", "dispatchIntent", "", "intent", "Lcom/kubi/mvi/state/IIntent;", "(Lcom/kubi/mvi/state/IIntent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getTradeItemBean", "Lcom/kubi/core/spot/entity/TradeItemBeanEquals;", "symbol", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "requestGetConfig", "useCountDown", "", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCallAuctionStatus", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "oldRequest", "Lokhttp3/Request;", "getOldRequest", "()Lokhttp3/Request;", "setOldRequest", "(Lokhttp3/Request;)V", "socketObserver", "getTopic", "updateCallAuctionInfo", "Lcom/kubi/core/spot/business/callAuction/bean/CallAuctionInfo;", "wsEntity", "Lcom/kubi/core/spot/entity/callAuction/WsCallAuctionEstimateInfoEntity;", "countDownJob", "Lkotlinx/coroutines/Job;", "countDown", "remainSec", "", "cancelCountDown", "gotoSecondStage", "updateSocketSymbol", RNH5InterActionHelperKt.EVENT_NAME_ON_HIDE, RNH5InterActionHelperKt.EVENT_NAME_ON_SHOW, "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nCallAuctionViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CallAuctionViewModel.kt\ncom/kubi/core/biz/callauction/mvi/CallAuctionViewModel\n+ 2 JsonEx.kt\ncom/kubi/utils/extensions/JsonExKt\n+ 3 GsonUtils.kt\ncom/kubi/utils/GsonUtils\n+ 4 SocketEx.kt\ncom/kubi/sdk/websocket/SocketExKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,332:1\n35#2,3:333\n196#3,3:336\n136#4,4:339\n140#4:344\n182#4:345\n220#4,2:346\n1#5:343\n*S KotlinDebug\n*F\n+ 1 CallAuctionViewModel.kt\ncom/kubi/core/biz/callauction/mvi/CallAuctionViewModel\n*L\n91#1:333,3\n90#1:336,3\n169#1:339,4\n169#1:344\n169#1:345\n316#1:346,2\n169#1:343\n*E\n"})
public final class CallAuctionViewModel extends AbstractC19291m<UIState> {

    /* JADX INFO: renamed from: X */
    @NotNull
    public final C40394b f20328X = new C40394b();

    /* JADX INFO: renamed from: Y */
    @NotNull
    public final Lazy f20329Y = LazyKt.lazy(new Function0() { // from class: com.kubi.core.biz.callauction.mvi.a
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return CallAuctionViewModel.m21664w();
        }
    });

    /* JADX INFO: renamed from: Z */
    @NotNull
    public String f20330Z = "";

    /* JADX INFO: renamed from: a0 */
    @Nullable
    public Request f20331a0;

    /* JADX INFO: renamed from: b0 */
    @Nullable
    public InterfaceC41775x1 f20332b0;

    /* JADX INFO: renamed from: com.kubi.core.biz.callauction.mvi.CallAuctionViewModel$a */
    /* JADX INFO: compiled from: SocketEx.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nSocketEx.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SocketEx.kt\ncom/kubi/sdk/websocket/SocketExKt$bindSocketHeartbeat$3\n+ 2 MviEx.kt\ncom/kubi/mvi/common/MviExKt\n+ 3 JsonEx.kt\ncom/kubi/mvi/common/JsonExKt\n+ 4 GsonUtils.kt\ncom/kubi/utils/GsonUtils\n+ 5 CallAuctionViewModel.kt\ncom/kubi/core/biz/callauction/mvi/CallAuctionViewModel\n+ 6 WebSocketIssue.kt\ncom/kubi/sdk/websocket/WebSocketIssueKt\n*L\n1#1,223:1\n50#2,7:224\n57#2,10:261\n36#3:231\n36#3:246\n137#4,5:232\n137#4,5:247\n175#5:237\n174#5,8:238\n187#5,9:252\n46#6,2:271\n*S KotlinDebug\n*F\n+ 1 SocketEx.kt\ncom/kubi/sdk/websocket/SocketExKt$bindSocketHeartbeat$3\n*L\n141#1:224,7\n141#1:261,10\n145#1:231\n158#1:246\n145#1:232,5\n158#1:247,5\n178#1:271,2\n*E\n"})
    public static final class C11823a implements Function1<Message, Unit> {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Function1 f20333b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ String f20334c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ String f20335d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ CallAuctionViewModel f20336e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ String f20337f;

        /* JADX INFO: renamed from: com.kubi.core.biz.callauction.mvi.CallAuctionViewModel$a$a */
        /* JADX INFO: compiled from: GsonUtils.kt */
        @Metadata(m90083d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0004"}, m90084d2 = {"com/kubi/utils/GsonUtils$fromJSONOrNull$1", "Lcom/google/gson/reflect/TypeToken;", "Utils_release", "com/kubi/mvi/common/JsonExKt$convertToObj$$inlined$fromJSONOrNull$1", "com/kubi/sdk/websocket/SocketExKt$bindSocketHeartbeat$3$invoke$lambda$6$lambda$4$$inlined$convertToObj$1"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
        @SourceDebugExtension({"SMAP\nGsonUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GsonUtils.kt\ncom/kubi/utils/GsonUtils$fromJSONOrNull$1\n*L\n1#1,195:1\n*E\n"})
        public static final class a extends TypeToken<CallAuctionEstimateInfoEntity> {
        }

        /* JADX INFO: renamed from: com.kubi.core.biz.callauction.mvi.CallAuctionViewModel$a$b */
        /* JADX INFO: compiled from: GsonUtils.kt */
        @Metadata(m90083d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0004"}, m90084d2 = {"com/kubi/utils/GsonUtils$fromJSONOrNull$1", "Lcom/google/gson/reflect/TypeToken;", "Utils_release", "com/kubi/mvi/common/JsonExKt$convertToObj$$inlined$fromJSONOrNull$1", "com/kubi/sdk/websocket/SocketExKt$bindSocketHeartbeat$3$invoke$lambda$6$lambda$4$$inlined$convertToObj$2"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
        @SourceDebugExtension({"SMAP\nGsonUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GsonUtils.kt\ncom/kubi/utils/GsonUtils$fromJSONOrNull$1\n*L\n1#1,195:1\n*E\n"})
        public static final class b extends TypeToken<WsCallAuctionEstimateInfoEntity> {
        }

        public C11823a(Function1 function1, String str, String str2, CallAuctionViewModel callAuctionViewModel, CallAuctionViewModel callAuctionViewModel2, String str3) {
            this.f20333b = function1;
            this.f20334c = str;
            this.f20335d = str2;
            this.f20336e = callAuctionViewModel;
            this.f20337f = str3;
        }

        /* JADX INFO: renamed from: a */
        public final void m21676a(Message it) throws Throwable {
            Object objM103844constructorimpl;
            Object objM66914d;
            Intrinsics.checkNotNullParameter(it, "it");
            Function1 function1 = this.f20333b;
            String str = this.f20334c;
            boolean zM42528a = C19241c.f35620a.m42528a();
            boolean z11 = !zM42528a;
            try {
                Result.Companion companion = Result.INSTANCE;
                if (((Boolean) function1.invoke(it)).booleanValue()) {
                    String data = it.getData();
                    if (data == null) {
                        objM66914d = null;
                    } else if (Intrinsics.areEqual(it.getSource(), "heartbeat")) {
                        try {
                            C27099x c27099x = C27099x.f54458a;
                            objM66914d = C27099x.m66914d(data, new a().getType());
                        } catch (Throwable th2) {
                            C43846g.m96569d(th2, "GsonUtils", null, 4, null);
                            objM66914d = null;
                        }
                        if (objM66914d != null) {
                            CallAuctionEstimateInfoEntity callAuctionEstimateInfoEntity = (CallAuctionEstimateInfoEntity) objM66914d;
                            if (TextUtils.isEmpty(callAuctionEstimateInfoEntity.getSymbol()) || Intrinsics.areEqual(callAuctionEstimateInfoEntity.getSymbol(), this.f20335d)) {
                                this.f20336e.updateState(new C11824b(new C42177a(), callAuctionEstimateInfoEntity));
                            }
                            C44128b.m97259c("socket", "Topic->heartBeat->" + str + " 数据解析成功！");
                        } else {
                            C44128b.m97259c("socket", "Topic->heartBeat->" + str + " 数据解析失败！");
                            objM66914d = Unit.INSTANCE;
                        }
                    } else {
                        try {
                            C27099x c27099x2 = C27099x.f54458a;
                            objM66914d = C27099x.m66914d(data, new b().getType());
                        } catch (Throwable th3) {
                            C43846g.m96569d(th3, "GsonUtils", null, 4, null);
                            objM66914d = null;
                        }
                        if (objM66914d != null) {
                            CallAuctionViewModel callAuctionViewModel = this.f20336e;
                            callAuctionViewModel.launchOnIO(new CallAuctionViewModel$socketObserver$3$1(callAuctionViewModel, (WsCallAuctionEstimateInfoEntity) objM66914d, this.f20337f, null));
                            C44128b.m97259c("socket", "Topic->socket->" + str + " 数据解析成功！");
                        } else {
                            C44128b.m97259c("socket", "Topic->socket->" + str + " 数据解析失败！");
                            objM66914d = Unit.INSTANCE;
                        }
                    }
                } else {
                    C44128b.m97259c("socket", "Topic->" + str + " 不满足过滤！");
                    objM66914d = Unit.INSTANCE;
                }
                objM103844constructorimpl = Result.m103844constructorimpl(objM66914d);
            } catch (Throwable th4) {
                Result.Companion companion2 = Result.INSTANCE;
                objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th4));
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
                C44128b.m97262f("socket", "topic->" + thM103847exceptionOrNullimpl2 + "->【bindSocketHeartbeat发生错误】", thM103847exceptionOrNullimpl2);
            }
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Message message) throws Throwable {
            m21676a(message);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.kubi.core.biz.callauction.mvi.CallAuctionViewModel$b */
    /* JADX INFO: compiled from: CallAuctionViewModel.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C11824b implements Function1<UIState, UIState> {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C42177a f20338b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ CallAuctionEstimateInfoEntity f20339c;

        public C11824b(C42177a c42177a, CallAuctionEstimateInfoEntity callAuctionEstimateInfoEntity) {
            this.f20338b = c42177a;
            this.f20339c = callAuctionEstimateInfoEntity;
        }

        @Override // p852kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final UIState invoke(UIState updateState) {
            Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
            return UIState.copy$default(updateState, this.f20338b.m92612a(this.f20339c), null, null, null, null, null, 62, null);
        }
    }

    /* JADX INFO: renamed from: com.kubi.core.biz.callauction.mvi.CallAuctionViewModel$dispatchIntent$1 */
    /* JADX INFO: compiled from: CallAuctionViewModel.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.core.biz.callauction.mvi.CallAuctionViewModel", m90122f = "CallAuctionViewModel.kt", m90123i = {0, 1, 2, 2, 3}, m90124l = {56, 60, 62, 73}, m90125m = "dispatchIntent", m90126n = {"intent", "intent", "intent", "tradeItemBeanEquals", "intent"}, m90127s = {"L$0", "L$0", "L$0", "L$1", "L$0"})
    public static final class C118291 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C118291(Continuation<? super C118291> continuation) {
            super(continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return CallAuctionViewModel.this.dispatchIntent(null, this);
        }
    }

    /* JADX INFO: renamed from: I */
    public static /* synthetic */ Object m21650I(CallAuctionViewModel callAuctionViewModel, boolean z11, Continuation continuation, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = true;
        }
        return callAuctionViewModel.m21670H(z11, continuation);
    }

    /* JADX INFO: renamed from: A */
    public static final UIState m21647A(InterfaceC19282d interfaceC19282d, UIState updateState) {
        Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
        return UIState.copy$default(updateState, null, null, ((CallAuctionContract$UiIntent.MockChangePhase) interfaceC19282d).getPhase(), null, null, null, 59, null);
    }

    /* JADX INFO: renamed from: B */
    private final InterfaceC42170a m21648B() {
        return (InterfaceC42170a) this.f20329Y.getValue();
    }

    /* JADX INFO: renamed from: K */
    public static final boolean m21651K(CallAuctionViewModel callAuctionViewModel, Message it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Intrinsics.areEqual(it.getSource(), "heartbeat") || Intrinsics.areEqual(it.getTopic(), callAuctionViewModel.f20330Z);
    }

    /* JADX INFO: renamed from: z */
    public static final UIState m21665z(TradeItemBeanEquals tradeItemBeanEquals, UIState updateState) {
        Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
        return UIState.copy$default(updateState, null, null, null, null, tradeItemBeanEquals, null, 47, null);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00a4, code lost:
    
        if (r9 == r0) goto L29;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: C */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m21666C(Continuation<? super Unit> continuation) {
        CallAuctionViewModel$getCallAuctionStatus$1 callAuctionViewModel$getCallAuctionStatus$1;
        int i11;
        TradeItemBeanEquals tradeItemBeanEquals;
        if (continuation instanceof CallAuctionViewModel$getCallAuctionStatus$1) {
            callAuctionViewModel$getCallAuctionStatus$1 = (CallAuctionViewModel$getCallAuctionStatus$1) continuation;
            int i12 = callAuctionViewModel$getCallAuctionStatus$1.label;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                callAuctionViewModel$getCallAuctionStatus$1.label = i12 - Integer.MIN_VALUE;
            } else {
                callAuctionViewModel$getCallAuctionStatus$1 = new CallAuctionViewModel$getCallAuctionStatus$1(this, continuation);
            }
        } else {
            callAuctionViewModel$getCallAuctionStatus$1 = new CallAuctionViewModel$getCallAuctionStatus$1(this, continuation);
        }
        CallAuctionViewModel$getCallAuctionStatus$1 callAuctionViewModel$getCallAuctionStatus$2 = callAuctionViewModel$getCallAuctionStatus$1;
        Object objM42824e = callAuctionViewModel$getCallAuctionStatus$2.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i13 = callAuctionViewModel$getCallAuctionStatus$2.label;
        if (i13 != 0) {
            if (i13 == 1) {
                i11 = callAuctionViewModel$getCallAuctionStatus$2.I$0;
                tradeItemBeanEquals = (TradeItemBeanEquals) callAuctionViewModel$getCallAuctionStatus$2.L$0;
                ResultKt.throwOnFailure(objM42824e);
            } else {
                if (i13 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objM42824e);
            }
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(objM42824e);
        TradeItemBeanEquals bean = ((UIState) getState()).getBean();
        if (bean != null) {
            callAuctionViewModel$getCallAuctionStatus$2.L$0 = bean;
            i11 = 0;
            callAuctionViewModel$getCallAuctionStatus$2.I$0 = 0;
            callAuctionViewModel$getCallAuctionStatus$2.label = 1;
            if (DelayKt.m90350b(2000L, callAuctionViewModel$getCallAuctionStatus$2) != coroutine_suspended) {
                tradeItemBeanEquals = bean;
            }
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
        C45518a.m100507a("repository.getPreviewInfo", "CallAuctionViewModel");
        C40394b c40394b = this.f20328X;
        String symbol = tradeItemBeanEquals.getSymbol();
        Intrinsics.checkNotNullExpressionValue(symbol, "getSymbol(...)");
        SymbolInfoEntity symbolInfoEntity = tradeItemBeanEquals.getSymbolInfoEntity();
        InterfaceC41634e<SymbolPreviewEntity> interfaceC41634eM89017d = c40394b.m89017d(symbol, C27041f.m66668h(symbolInfoEntity != null ? symbolInfoEntity.getBaseCurrency() : null));
        TradeItemBeanEquals tradeItemBeanEquals2 = tradeItemBeanEquals;
        CallAuctionViewModel$getCallAuctionStatus$2$1 callAuctionViewModel$getCallAuctionStatus$2$1 = new CallAuctionViewModel$getCallAuctionStatus$2$1(tradeItemBeanEquals2, this, null);
        callAuctionViewModel$getCallAuctionStatus$2.L$0 = SpillingKt.nullOutSpilledVariable(tradeItemBeanEquals2);
        callAuctionViewModel$getCallAuctionStatus$2.I$0 = i11;
        callAuctionViewModel$getCallAuctionStatus$2.label = 2;
        objM42824e = RetrofitFlowExKt.m42824e(interfaceC41634eM89017d, false, callAuctionViewModel$getCallAuctionStatus$2$1, callAuctionViewModel$getCallAuctionStatus$2, 1, null);
    }

    @Override // com.kubi.mvi.state.BaseStateVM
    @NotNull
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public UIState getInitState() {
        return new UIState(null, null, null, null, null, null, 63, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: F */
    public final Object m21668F(String str, Continuation<? super TradeItemBeanEquals> continuation) {
        CallAuctionViewModel$getTradeItemBean$1 callAuctionViewModel$getTradeItemBean$1;
        if (continuation instanceof CallAuctionViewModel$getTradeItemBean$1) {
            callAuctionViewModel$getTradeItemBean$1 = (CallAuctionViewModel$getTradeItemBean$1) continuation;
            int i11 = callAuctionViewModel$getTradeItemBean$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                callAuctionViewModel$getTradeItemBean$1.label = i11 - Integer.MIN_VALUE;
            } else {
                callAuctionViewModel$getTradeItemBean$1 = new CallAuctionViewModel$getTradeItemBean$1(this, continuation);
            }
        } else {
            callAuctionViewModel$getTradeItemBean$1 = new CallAuctionViewModel$getTradeItemBean$1(this, continuation);
        }
        Object objM90914f0 = callAuctionViewModel$getTradeItemBean$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = callAuctionViewModel$getTradeItemBean$1.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objM90914f0);
            C27099x c27099x = C27099x.f54458a;
            TradeItemBean tradeItemBeanM85603D = C37890n.f85269a.m85603D(str);
            if (tradeItemBeanM85603D == null) {
                tradeItemBeanM85603D = new TradeItemBean(str);
            }
            String strM66919i = C27099x.m66919i(tradeItemBeanM85603D, false, 2, null);
            if (strM66919i == null) {
                strM66919i = "";
            }
            InterfaceC41634e interfaceC41634eM90890N = C41636g.m90890N(C41636g.m90887K(new CallAuctionViewModel$getTradeItemBean$$inlined$fromJsonOrNull$1(strM66919i, null)), C42911a.m94120b());
            callAuctionViewModel$getTradeItemBean$1.L$0 = SpillingKt.nullOutSpilledVariable(str);
            callAuctionViewModel$getTradeItemBean$1.L$1 = SpillingKt.nullOutSpilledVariable(c27099x);
            callAuctionViewModel$getTradeItemBean$1.L$2 = SpillingKt.nullOutSpilledVariable(strM66919i);
            callAuctionViewModel$getTradeItemBean$1.I$0 = 0;
            callAuctionViewModel$getTradeItemBean$1.label = 1;
            objM90914f0 = C41636g.m90914f0(interfaceC41634eM90890N, callAuctionViewModel$getTradeItemBean$1);
            if (objM90914f0 == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objM90914f0);
        }
        TradeItemBeanEquals tradeItemBeanEquals = (TradeItemBeanEquals) objM90914f0;
        return tradeItemBeanEquals == null ? new TradeItemBeanEquals() : tradeItemBeanEquals;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00b7, code lost:
    
        if (r14 == r0) goto L25;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: H */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m21670H(boolean z11, Continuation<? super Unit> continuation) {
        CallAuctionViewModel$requestGetConfig$1 callAuctionViewModel$requestGetConfig$1;
        int i11;
        TradeItemBeanEquals tradeItemBeanEquals;
        if (continuation instanceof CallAuctionViewModel$requestGetConfig$1) {
            callAuctionViewModel$requestGetConfig$1 = (CallAuctionViewModel$requestGetConfig$1) continuation;
            int i12 = callAuctionViewModel$requestGetConfig$1.label;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                callAuctionViewModel$requestGetConfig$1.label = i12 - Integer.MIN_VALUE;
            } else {
                callAuctionViewModel$requestGetConfig$1 = new CallAuctionViewModel$requestGetConfig$1(this, continuation);
            }
        } else {
            callAuctionViewModel$requestGetConfig$1 = new CallAuctionViewModel$requestGetConfig$1(this, continuation);
        }
        CallAuctionViewModel$requestGetConfig$1 callAuctionViewModel$requestGetConfig$2 = callAuctionViewModel$requestGetConfig$1;
        Object objM42824e = callAuctionViewModel$requestGetConfig$2.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i13 = callAuctionViewModel$requestGetConfig$2.label;
        if (i13 != 0) {
            if (i13 == 1) {
                int i14 = callAuctionViewModel$requestGetConfig$2.I$0;
                boolean z12 = callAuctionViewModel$requestGetConfig$2.Z$0;
                tradeItemBeanEquals = (TradeItemBeanEquals) callAuctionViewModel$requestGetConfig$2.L$0;
                ResultKt.throwOnFailure(objM42824e);
                i11 = i14;
                z11 = z12;
            } else {
                if (i13 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objM42824e);
            }
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(objM42824e);
        C45518a.m100507a("requestGetConfig", "CallAuctionViewModel");
        TradeItemBeanEquals bean = ((UIState) getState()).getBean();
        if (bean != null) {
            C45518a.m100507a("repository.requestGetConfig", "CallAuctionViewModel");
            C40394b c40394b = this.f20328X;
            String symbol = bean.getSymbol();
            Intrinsics.checkNotNullExpressionValue(symbol, "getSymbol(...)");
            InterfaceC41634e<CallAuctionConfigEntity> interfaceC41634eM89019f = c40394b.m89019f(symbol);
            CallAuctionViewModel$requestGetConfig$2$1 callAuctionViewModel$requestGetConfig$2$1 = new CallAuctionViewModel$requestGetConfig$2$1(this, z11, null);
            callAuctionViewModel$requestGetConfig$2.L$0 = bean;
            callAuctionViewModel$requestGetConfig$2.Z$0 = z11;
            i11 = 0;
            callAuctionViewModel$requestGetConfig$2.I$0 = 0;
            callAuctionViewModel$requestGetConfig$2.label = 1;
            if (RetrofitFlowExKt.m42824e(interfaceC41634eM89019f, false, callAuctionViewModel$requestGetConfig$2$1, callAuctionViewModel$requestGetConfig$2, 1, null) != coroutine_suspended) {
                tradeItemBeanEquals = bean;
            }
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
        C45518a.m100507a("repository.requestCallAuctionInfo", "CallAuctionViewModel");
        C40394b c40394b2 = this.f20328X;
        String symbol2 = tradeItemBeanEquals.getSymbol();
        Intrinsics.checkNotNullExpressionValue(symbol2, "getSymbol(...)");
        InterfaceC41634e<CallAuctionEstimateInfoEntity> interfaceC41634eM89018e = c40394b2.m89018e(symbol2);
        CallAuctionViewModel$requestGetConfig$2$2 callAuctionViewModel$requestGetConfig$2$2 = new CallAuctionViewModel$requestGetConfig$2$2(this, null);
        callAuctionViewModel$requestGetConfig$2.L$0 = SpillingKt.nullOutSpilledVariable(tradeItemBeanEquals);
        callAuctionViewModel$requestGetConfig$2.Z$0 = z11;
        callAuctionViewModel$requestGetConfig$2.I$0 = i11;
        callAuctionViewModel$requestGetConfig$2.label = 2;
        objM42824e = RetrofitFlowExKt.m42824e(interfaceC41634eM89018e, false, callAuctionViewModel$requestGetConfig$2$2, callAuctionViewModel$requestGetConfig$2, 1, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: L */
    public final CallAuctionInfo m21672L(WsCallAuctionEstimateInfoEntity wsCallAuctionEstimateInfoEntity, String str) {
        String strM89946t;
        String strM89946t2;
        String strM89946t3;
        String strM89946t4;
        String strM89946t5;
        SymbolInfoEntity symbolInfoEntity;
        SymbolInfoEntity symbolInfoEntity2;
        SymbolInfoEntity symbolInfoEntity3;
        SymbolInfoEntity symbolInfoEntity4;
        SymbolInfoEntity symbolInfoEntity5;
        SymbolInfoEntity symbolInfoEntity6;
        CallAuctionInfo callAuctionInfo = ((UIState) getState()).getCallAuctionInfo();
        String strM89946t6 = null;
        numValueOf = null;
        Integer numValueOf = null;
        if (callAuctionInfo == null) {
            return null;
        }
        BigDecimal estimatedDealPrice = wsCallAuctionEstimateInfoEntity.getEstimatedDealPrice();
        if (estimatedDealPrice != null) {
            TradeItemBean tradeItemBeanM85603D = C37890n.f85269a.m85603D(str);
            strM89946t = C41014a.m89946t(estimatedDealPrice, null, C27039d.m66651k((tradeItemBeanM85603D == null || (symbolInfoEntity6 = tradeItemBeanM85603D.getSymbolInfoEntity()) == null) ? null : Integer.valueOf(symbolInfoEntity6.getPriceIncrementPrecision()), 8), false, false, false, false, false, null, 0, 509, null);
        } else {
            strM89946t = null;
        }
        String strM66668h = C27041f.m66668h(strM89946t);
        BigDecimal estimatedDealSize = wsCallAuctionEstimateInfoEntity.getEstimatedDealSize();
        if (estimatedDealSize != null) {
            TradeItemBean tradeItemBeanM85603D2 = C37890n.f85269a.m85603D(str);
            strM89946t2 = C41014a.m89946t(estimatedDealSize, null, C27039d.m66651k((tradeItemBeanM85603D2 == null || (symbolInfoEntity5 = tradeItemBeanM85603D2.getSymbolInfoEntity()) == null) ? null : Integer.valueOf(symbolInfoEntity5.getBaseIncrementPrecision()), 8), false, false, false, false, false, null, 0, 509, null);
        } else {
            strM89946t2 = null;
        }
        String strM66668h2 = C27041f.m66668h(strM89946t2);
        BigDecimal lowestBuyDeclaredPrice = wsCallAuctionEstimateInfoEntity.getLowestBuyDeclaredPrice();
        if (lowestBuyDeclaredPrice != null) {
            TradeItemBean tradeItemBeanM85603D3 = C37890n.f85269a.m85603D(str);
            strM89946t3 = C41014a.m89946t(lowestBuyDeclaredPrice, null, C27039d.m66651k((tradeItemBeanM85603D3 == null || (symbolInfoEntity4 = tradeItemBeanM85603D3.getSymbolInfoEntity()) == null) ? null : Integer.valueOf(symbolInfoEntity4.getPriceIncrementPrecision()), 8), false, false, false, false, false, null, 0, 509, null);
        } else {
            strM89946t3 = null;
        }
        String strM66668h3 = C27041f.m66668h(strM89946t3);
        BigDecimal highestBuyDeclaredPrice = wsCallAuctionEstimateInfoEntity.getHighestBuyDeclaredPrice();
        if (highestBuyDeclaredPrice != null) {
            TradeItemBean tradeItemBeanM85603D4 = C37890n.f85269a.m85603D(str);
            strM89946t4 = C41014a.m89946t(highestBuyDeclaredPrice, null, C27039d.m66651k((tradeItemBeanM85603D4 == null || (symbolInfoEntity3 = tradeItemBeanM85603D4.getSymbolInfoEntity()) == null) ? null : Integer.valueOf(symbolInfoEntity3.getPriceIncrementPrecision()), 8), false, false, false, false, false, null, 0, 509, null);
        } else {
            strM89946t4 = null;
        }
        String strM66668h4 = C27041f.m66668h(strM89946t4);
        BigDecimal lowestSellDeclaredPrice = wsCallAuctionEstimateInfoEntity.getLowestSellDeclaredPrice();
        if (lowestSellDeclaredPrice != null) {
            TradeItemBean tradeItemBeanM85603D5 = C37890n.f85269a.m85603D(str);
            strM89946t5 = C41014a.m89946t(lowestSellDeclaredPrice, null, C27039d.m66651k((tradeItemBeanM85603D5 == null || (symbolInfoEntity2 = tradeItemBeanM85603D5.getSymbolInfoEntity()) == null) ? null : Integer.valueOf(symbolInfoEntity2.getPriceIncrementPrecision()), 8), false, false, false, false, false, null, 0, 509, null);
        } else {
            strM89946t5 = null;
        }
        String strM66668h5 = C27041f.m66668h(strM89946t5);
        BigDecimal highestSellDeclaredPrice = wsCallAuctionEstimateInfoEntity.getHighestSellDeclaredPrice();
        if (highestSellDeclaredPrice != null) {
            TradeItemBean tradeItemBeanM85603D6 = C37890n.f85269a.m85603D(str);
            if (tradeItemBeanM85603D6 != null && (symbolInfoEntity = tradeItemBeanM85603D6.getSymbolInfoEntity()) != null) {
                numValueOf = Integer.valueOf(symbolInfoEntity.getPriceIncrementPrecision());
            }
            strM89946t6 = C41014a.m89946t(highestSellDeclaredPrice, null, C27039d.m66651k(numValueOf, 8), false, false, false, false, false, null, 0, 509, null);
        }
        return callAuctionInfo.m89903a(strM66668h, strM66668h2, strM66668h3, strM66668h4, strM66668h5, C27041f.m66668h(strM89946t6));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00a9, code lost:
    
        if (m21670H(r2, r0) == r1) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00d2, code lost:
    
        if (m21666C(r0) == r1) goto L39;
     */
    @Override // com.kubi.mvi.state.BaseStateVM
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object dispatchIntent(@NotNull final InterfaceC19282d interfaceC19282d, @NotNull Continuation<? super Unit> continuation) {
        C118291 c118291;
        TradeItemBeanEquals bean;
        if (continuation instanceof C118291) {
            c118291 = (C118291) continuation;
            int i11 = c118291.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c118291.label = i11 - Integer.MIN_VALUE;
            } else {
                c118291 = new C118291(continuation);
            }
        } else {
            c118291 = new C118291(continuation);
        }
        Object objM21668F = c118291.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c118291.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objM21668F);
            c118291.L$0 = interfaceC19282d;
            c118291.label = 1;
            if (super.dispatchIntentOnIO(interfaceC19282d, c118291) != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i12 != 1) {
            if (i12 == 2) {
                interfaceC19282d = (InterfaceC19282d) c118291.L$0;
                ResultKt.throwOnFailure(objM21668F);
                final TradeItemBeanEquals tradeItemBeanEquals = (TradeItemBeanEquals) objM21668F;
                updateState(new Function1() { // from class: com.kubi.core.biz.callauction.mvi.b
                    @Override // p852kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return CallAuctionViewModel.m21665z(tradeItemBeanEquals, (UIState) obj);
                    }
                });
                boolean useCountDown = ((CallAuctionContract$UiIntent.RequestCurrentStage) interfaceC19282d).getUseCountDown();
                c118291.L$0 = SpillingKt.nullOutSpilledVariable(interfaceC19282d);
                c118291.L$1 = SpillingKt.nullOutSpilledVariable(tradeItemBeanEquals);
                c118291.label = 3;
            } else {
                if (i12 != 3) {
                    if (i12 != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(objM21668F);
                    return Unit.INSTANCE;
                }
                ResultKt.throwOnFailure(objM21668F);
            }
            m21673M();
            return Unit.INSTANCE;
        }
        interfaceC19282d = (InterfaceC19282d) c118291.L$0;
        ResultKt.throwOnFailure(objM21668F);
        if (!(interfaceC19282d instanceof CallAuctionContract$UiIntent.RequestCurrentStage)) {
            if (interfaceC19282d instanceof CallAuctionContract$UiIntent.OnFragmentHide) {
                C45518a.m100507a("UiIntent.OnFragmentHide", "CallAuctionViewModel");
                m21674x();
            } else if (interfaceC19282d instanceof CallAuctionContract$UiIntent.GetCallAuction) {
                C45518a.m100507a("UiIntent.GetCallAuction", "CallAuctionViewModel");
                c118291.L$0 = SpillingKt.nullOutSpilledVariable(interfaceC19282d);
                c118291.label = 4;
            } else if (interfaceC19282d instanceof CallAuctionContract$UiIntent.MockChangePhase) {
                C45518a.m100507a("UiIntent.MockChangePhase", "CallAuctionViewModel");
                if (((CallAuctionContract$UiIntent.MockChangePhase) interfaceC19282d).getPhase() == CallAuctionContract$Phase.OPENING && (bean = ((UIState) getState()).getBean()) != null) {
                    CallAuctionSwitch callAuctionSwitch = CallAuctionSwitch.f20317a;
                    String symbol = bean.getSymbol();
                    Intrinsics.checkNotNullExpressionValue(symbol, "getSymbol(...)");
                    callAuctionSwitch.m21638d(symbol);
                }
                C45518a.m100507a("updateState:phase", "CallAuctionViewModel");
                updateState(new Function1() { // from class: com.kubi.core.biz.callauction.mvi.c
                    @Override // p852kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return CallAuctionViewModel.m21647A(interfaceC19282d, (UIState) obj);
                    }
                });
            }
            return Unit.INSTANCE;
        }
        C45518a.m100507a("UiIntent.RequestCurrentStage", "CallAuctionViewModel");
        String symbol2 = ((CallAuctionContract$UiIntent.RequestCurrentStage) interfaceC19282d).getSymbol();
        c118291.L$0 = interfaceC19282d;
        c118291.label = 2;
        objM21668F = m21668F(symbol2, c118291);
        if (objM21668F != coroutine_suspended) {
            final TradeItemBeanEquals tradeItemBeanEquals2 = (TradeItemBeanEquals) objM21668F;
            updateState(new Function1() { // from class: com.kubi.core.biz.callauction.mvi.b
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return CallAuctionViewModel.m21665z(tradeItemBeanEquals2, (UIState) obj);
                }
            });
            boolean useCountDown2 = ((CallAuctionContract$UiIntent.RequestCurrentStage) interfaceC19282d).getUseCountDown();
            c118291.L$0 = SpillingKt.nullOutSpilledVariable(interfaceC19282d);
            c118291.L$1 = SpillingKt.nullOutSpilledVariable(tradeItemBeanEquals2);
            c118291.label = 3;
        }
        return coroutine_suspended;
    }

    /* JADX INFO: renamed from: x */
    public final void m21674x() {
        InterfaceC41775x1 interfaceC41775x1 = this.f20332b0;
        if (interfaceC41775x1 != null) {
            if (interfaceC41775x1 != null) {
                InterfaceC41775x1.a.m91377a(interfaceC41775x1, null, 1, null);
            }
            this.f20332b0 = null;
        }
    }

    /* JADX INFO: renamed from: E */
    private final String m21649E(String str) {
        return DowngradeExKt.m66551u("/spotCallAuction/estimateOpeningPrice:%s", new Object[]{str}, null, 2, null);
    }

    /* JADX INFO: renamed from: w */
    public static final InterfaceC42170a m21664w() {
        return (InterfaceC42170a) C42597a.m93390f().create(InterfaceC42170a.class);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: G */
    public final Object m21669G(Continuation<? super Unit> continuation) {
        Object objM21650I;
        TradeItemBeanEquals bean = ((UIState) getState()).getBean();
        if (bean != null && bean.getSymbol() != null && (objM21650I = m21650I(this, false, continuation, 1, null)) == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            return objM21650I;
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: J */
    public final void m21671J(String str) {
        this.f20331a0 = m21648B().m92593c(str);
        this.f20330Z = m21649E(str);
        C45518a.m100507a("socketObserver:oldTopicString:" + this.f20330Z, "CallAuctionViewModel");
        String str2 = this.f20330Z;
        Request request = this.f20331a0;
        Function1 function1 = new Function1() { // from class: com.kubi.core.biz.callauction.mvi.d
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(CallAuctionViewModel.m21651K(this.f20343b, (Message) obj));
            }
        };
        SocketTask.Companion companion = SocketTask.f48571i;
        C37779j c37779j = new C37779j();
        c37779j.m85208e(request);
        companion.obtain(str2, this, c37779j).m58912l(new C11823a(function1, str2, str, this, this, str));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: M */
    public final void m21673M() {
        String symbol;
        TradeItemBeanEquals bean = ((UIState) getState()).getBean();
        if (bean != null && (symbol = bean.getSymbol()) != null && !Intrinsics.areEqual(this.f20330Z, m21649E(symbol))) {
            if (this.f20330Z.length() > 0) {
                C37781l.f85093a.m85213c(this.f20330Z, this);
            }
            m21671J(symbol);
        }
    }

    @Override // com.kubi.mvi.p102vm.BaseVM
    public void onHide() {
        super.onHide();
        C44128b.m97258b("---->>>> onHide");
    }

    @Override // com.kubi.mvi.p102vm.BaseVM
    public void onShow() throws Throwable {
        super.onShow();
        C44128b.m97258b("---->>>> onShow");
    }

    /* JADX INFO: renamed from: y */
    public final void m21675y(long j11) {
        m21674x();
        Ref.LongRef longRef = new Ref.LongRef();
        Ref.LongRef longRef2 = new Ref.LongRef();
        this.f20332b0 = C41696j.m91104d(ViewModelKt.getViewModelScope(this), C42911a.m94120b(), null, new CallAuctionViewModel$countDown$1(j11, new Ref.LongRef(), longRef2, longRef, 1000L, this, null), 2, null);
    }
}
