package com.kubi.notice.lib.service;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import cn.jiguang.privates.push.constants.JPushConstants;
import com.blankj.utilcode.util.C5258a;
import com.blankj.utilcode.util.C5264d;
import com.blankj.utilcode.util.C5267e0;
import com.blankj.utilcode.util.C5287o0;
import com.google.gson.reflect.TypeToken;
import com.kubi.data.BeepHelper;
import com.kubi.event.api.C12572a;
import com.kubi.mvi.common.C19244f;
import com.kubi.network.retrofit.utils.RetrofitFlowExKt;
import com.kubi.network.websocket.DefaultWebSocketClient;
import com.kubi.network.websocket.model.Message;
import com.kubi.network.websocket.model.SocketRequest;
import com.kubi.notice.R$id;
import com.kubi.notice.R$layout;
import com.kubi.notice.R$mipmap;
import com.kubi.notice.R$raw;
import com.kubi.notice.R$style;
import com.kubi.notice.api.service.INoticeService;
import com.kubi.notice.lib.api.C19412c;
import com.kubi.notice.lib.api.INoticeApi;
import com.kubi.notice.lib.api.MainRedPointManager;
import com.kubi.notice.lib.entity.WsNoticeEntity;
import com.kubi.router.core.Router;
import com.kubi.router.utils.C23636b;
import com.kubi.router.utils.RouteExKt;
import com.kubi.sdk.BaseApplication;
import com.kubi.sdk.function.language.MultiLanguageManager;
import com.kubi.sdk.site.info.SiteInfoManager;
import com.kubi.utils.C27058k0;
import com.kubi.utils.C27099x;
import com.kubi.utils.DataMapUtil;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27040e;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.core.ViewExtKt;
import com.kubi.wallet.api.IWalletService;
import com.tencent.qcloud.tuicore.TUIConstants;
import er.C37237b;
import es.InterfaceC37238a;
import gs.C38009a;
import io.reactivex.Observable;
import io.reactivex.functions.Consumer;
import java.util.LinkedList;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.C41713n0;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineName;
import kotlinx.coroutines.InterfaceC41709m0;
import ls.C42295a;
import o00.C42911a;
import o00.C42916f;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import p476ns.RunnableC42867e;
import p481ny.C42899b;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.coroutines.AbstractCoroutineContextElement;
import p852kotlin.coroutines.CoroutineContext;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;
import ro.C44128b;

/* JADX INFO: compiled from: WsNoticeManager.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\r\u001a\u00020\u000eH\u0002J\b\u0010\u000f\u001a\u00020\u000eH\u0002J\b\u0010\u0017\u001a\u00020\u0018H\u0007J\b\u0010\u0019\u001a\u00020\u0018H\u0002J\b\u0010\u001a\u001a\u00020\u0018H\u0002J\u0010\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u001dH\u0003J\u000e\u0010\u001e\u001a\u00020\u00182\u0006\u0010\u001f\u001a\u00020\u0006J\u0010\u0010 \u001a\u00020\u00112\u0006\u0010\u001c\u001a\u00020\u001dH\u0002J\b\u0010!\u001a\u00020\u0018H\u0003J\u0010\u0010\"\u001a\u00020\u00182\u0006\u0010#\u001a\u00020\u0006H\u0002J\"\u0010$\u001a\u00020\u00182\u0006\u0010#\u001a\u00020\u00062\u0006\u0010%\u001a\u00020&2\b\b\u0002\u0010'\u001a\u00020&H\u0002J\u001a\u0010(\u001a\u00020\u00182\u0006\u0010#\u001a\u00020\u00062\b\b\u0002\u0010'\u001a\u00020&H\u0002J2\u0010)\u001a\u00020\u00182\u0006\u0010#\u001a\u00020\u00062\u0006\u0010*\u001a\u00020+2\u0018\u0010,\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00180-H\u0002R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u0007\u001a\u00020\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0015X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006."}, m90084d2 = {"Lcom/kubi/notice/lib/service/WsNoticeManager;", "", "<init>", "()V", "msgList", "Ljava/util/LinkedList;", "Lcom/kubi/notice/lib/entity/WsNoticeEntity;", "mNoticeApi", "Lcom/kubi/notice/lib/api/INoticeApi;", "getMNoticeApi", "()Lcom/kubi/notice/lib/api/INoticeApi;", "mNoticeApi$delegate", "Lkotlin/Lazy;", "scope", "Lkotlinx/coroutines/CoroutineScope;", "mainScope", JPushConstants.Message.KEY_FOREGROUND, "", "mXToast", "Lcom/kubi/notice/lib/ui/xtoast/XToast;", "mFuturesWebSocketClient", "Lcom/kubi/network/websocket/DefaultWebSocketClient;", "mDefaultWebSocketClient", "init", "", "subscribe", "unsubscribe", "onNoticeReceived", "message", "Lcom/kubi/network/websocket/model/Message;", "handleNotice", TUIConstants.TUIChat.NOTICE, "isNoticeTopic", "showMainNotice", "jump", TUIConstants.TIMPush.NOTIFICATION.ENTITY, "trackClick", "actionType", "", "locationId", "trackExpose", "showToast", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "clickCallBack", "Lkotlin/Function2;", "NoticeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SuppressLint({"StaticFieldLeak"})
@SourceDebugExtension({"SMAP\nWsNoticeManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WsNoticeManager.kt\ncom/kubi/notice/lib/service/WsNoticeManager\n+ 2 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt\n+ 3 FlavorEx.kt\ncom/kubi/kucoin/helper/FlavorExKt\n+ 4 NoticeIssue.kt\ncom/kubi/notice/lib/exception/NoticeIssueKt\n+ 5 GsonUtils.kt\ncom/kubi/utils/GsonUtils\n+ 6 MviEx.kt\ncom/kubi/mvi/common/MviExKt\n*L\n1#1,325:1\n47#2,4:326\n47#2,4:330\n17#3,2:334\n59#4,2:336\n61#4,2:339\n45#4,4:341\n64#4:345\n59#4,4:346\n45#4,4:350\n64#4:354\n149#5:338\n167#6,4:355\n*S KotlinDebug\n*F\n+ 1 WsNoticeManager.kt\ncom/kubi/notice/lib/service/WsNoticeManager\n*L\n70#1:326,4\n75#1:330,4\n107#1:334,2\n152#1:336,2\n152#1:339,2\n152#1:341,4\n152#1:345\n162#1:346,4\n162#1:350,4\n162#1:354\n155#1:338\n235#1:355,4\n*E\n"})
public final class WsNoticeManager {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final WsNoticeManager f36378a = new WsNoticeManager();

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final LinkedList<WsNoticeEntity> f36379b = new LinkedList<>();

    /* JADX INFO: renamed from: c */
    @NotNull
    public static final Lazy f36380c = LazyKt.lazy(new Function0() { // from class: com.kubi.notice.lib.service.c
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return WsNoticeManager.m43165B();
        }
    });

    /* JADX INFO: renamed from: d */
    public static boolean f36381d;

    /* JADX INFO: renamed from: e */
    @Nullable
    public static RunnableC42867e f36382e;

    /* JADX INFO: renamed from: f */
    @Nullable
    public static DefaultWebSocketClient f36383f;

    /* JADX INFO: renamed from: g */
    @Nullable
    public static DefaultWebSocketClient f36384g;

    /* JADX INFO: renamed from: com.kubi.notice.lib.service.WsNoticeManager$a */
    /* JADX INFO: compiled from: WsNoticeManager.kt */
    @Metadata(m90083d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0007"}, m90084d2 = {"com/kubi/notice/lib/service/WsNoticeManager$init$3", "Lcom/blankj/utilcode/util/Utils$OnAppStatusChangedListener;", "onForeground", "", "activity", "Landroid/app/Activity;", "onBackground", "NoticeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C19413a implements C5287o0.b {
        @Override // com.blankj.utilcode.util.C5287o0.b
        public void onBackground(Activity activity) {
            WsNoticeManager.f36378a.m43203Q();
            WsNoticeManager.f36381d = false;
        }

        @Override // com.blankj.utilcode.util.C5287o0.b
        public void onForeground(Activity activity) {
            WsNoticeManager.f36378a.m43200L();
            WsNoticeManager.f36381d = true;
        }
    }

    /* JADX INFO: renamed from: com.kubi.notice.lib.service.WsNoticeManager$c */
    /* JADX INFO: compiled from: GsonUtils.kt */
    /* JADX INFO: loaded from: classes30.dex */
    @Metadata(m90083d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, m90084d2 = {"com/kubi/utils/GsonUtils$fromJson$1", "Lcom/google/gson/reflect/TypeToken;", "Utils_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nGsonUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GsonUtils.kt\ncom/kubi/utils/GsonUtils$fromJson$1\n*L\n1#1,300:1\n*E\n"})
    public static final class C19415c extends TypeToken<WsNoticeEntity> {
    }

    /* JADX INFO: renamed from: com.kubi.notice.lib.service.WsNoticeManager$b */
    /* JADX INFO: compiled from: CoroutineExceptionHandler.kt */
    /* JADX INFO: loaded from: classes30.dex */
    @Metadata(m90083d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t¸\u0006\u0000"}, m90084d2 = {"kotlinx/coroutines/CoroutineExceptionHandlerKt$CoroutineExceptionHandler$1", "Lkotlin/coroutines/AbstractCoroutineContextElement;", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "handleException", "", "context", "Lkotlin/coroutines/CoroutineContext;", "exception", "", "kotlinx-coroutines-core"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nCoroutineExceptionHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt$CoroutineExceptionHandler$1\n+ 2 WsNoticeManager.kt\ncom/kubi/notice/lib/service/WsNoticeManager\n+ 3 NoticeIssue.kt\ncom/kubi/notice/lib/exception/NoticeIssueKt\n*L\n1#1,49:1\n76#2:50\n77#2:55\n45#3,4:51\n*S KotlinDebug\n*F\n+ 1 WsNoticeManager.kt\ncom/kubi/notice/lib/service/WsNoticeManager\n*L\n76#1:51,4\n*E\n"})
    public static final class C19414b extends AbstractCoroutineContextElement implements CoroutineExceptionHandler {
        public C19414b(CoroutineExceptionHandler.Companion companion) {
            super(companion);
        }

        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public void handleException(CoroutineContext context, Throwable exception) {
            if (!C42899b.m94075e(exception)) {
                C38009a.m85882c(exception, TUIConstants.TUIChat.NOTICE, "mainScope error");
            }
        }
    }

    /* JADX INFO: renamed from: com.kubi.notice.lib.service.WsNoticeManager$d */
    /* JADX INFO: compiled from: CoroutineExceptionHandler.kt */
    /* JADX INFO: loaded from: classes30.dex */
    @Metadata(m90083d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t¸\u0006\u0000"}, m90084d2 = {"kotlinx/coroutines/CoroutineExceptionHandlerKt$CoroutineExceptionHandler$1", "Lkotlin/coroutines/AbstractCoroutineContextElement;", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "handleException", "", "context", "Lkotlin/coroutines/CoroutineContext;", "exception", "", "kotlinx-coroutines-core"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nCoroutineExceptionHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt$CoroutineExceptionHandler$1\n+ 2 WsNoticeManager.kt\ncom/kubi/notice/lib/service/WsNoticeManager\n+ 3 NoticeIssue.kt\ncom/kubi/notice/lib/exception/NoticeIssueKt\n*L\n1#1,49:1\n71#2:50\n72#2:55\n45#3,4:51\n*S KotlinDebug\n*F\n+ 1 WsNoticeManager.kt\ncom/kubi/notice/lib/service/WsNoticeManager\n*L\n71#1:51,4\n*E\n"})
    public static final class C19416d extends AbstractCoroutineContextElement implements CoroutineExceptionHandler {
        public C19416d(CoroutineExceptionHandler.Companion companion) {
            super(companion);
        }

        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public void handleException(CoroutineContext context, Throwable exception) {
            if (!C42899b.m94075e(exception)) {
                C38009a.m85882c(exception, TUIConstants.TUIChat.NOTICE, "mainScope error");
            }
        }
    }

    /* JADX INFO: renamed from: B */
    public static final INoticeApi m43165B() {
        return (INoticeApi) RetrofitFlowExKt.m42820a(INoticeApi.class);
    }

    /* JADX INFO: renamed from: G */
    public static final Unit m43166G(WsNoticeEntity wsNoticeEntity, View it) throws JSONException {
        Intrinsics.checkNotNullParameter(it, "it");
        INoticeService.f36364a.get().mo43139h();
        f36378a.m43201M(wsNoticeEntity, "jumpManager", "2");
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: H */
    public static final Unit m43167H(WsNoticeEntity entity, boolean z11) throws JSONException {
        Intrinsics.checkNotNullParameter(entity, "entity");
        if (z11) {
            WsNoticeManager wsNoticeManager = f36378a;
            C41696j.m91104d(wsNoticeManager.m43197E(), C42911a.m94120b(), null, new WsNoticeManager$showMainNotice$1$3$1(entity, null), 2, null);
            wsNoticeManager.m43194A(entity);
        }
        m43170N(f36378a, entity, z11 ? "details" : "swipClose", null, 4, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: J */
    public static final Unit m43168J(Function2 function2, WsNoticeEntity wsNoticeEntity) {
        RunnableC42867e runnableC42867e = f36382e;
        if (runnableC42867e != null) {
            runnableC42867e.m94012b();
        }
        function2.invoke(wsNoticeEntity, Boolean.FALSE);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: K */
    public static final void m43169K(Function2 function2, WsNoticeEntity wsNoticeEntity, RunnableC42867e runnableC42867e, View view) {
        RunnableC42867e runnableC42867e2 = f36382e;
        if (runnableC42867e2 != null) {
            runnableC42867e2.m94012b();
        }
        function2.invoke(wsNoticeEntity, Boolean.TRUE);
    }

    /* JADX INFO: renamed from: N */
    public static /* synthetic */ void m43170N(WsNoticeManager wsNoticeManager, WsNoticeEntity wsNoticeEntity, String str, String str2, int i11, Object obj) throws JSONException {
        if ((i11 & 4) != 0) {
            str2 = "1";
        }
        wsNoticeManager.m43201M(wsNoticeEntity, str, str2);
    }

    /* JADX INFO: renamed from: P */
    public static /* synthetic */ void m43171P(WsNoticeManager wsNoticeManager, WsNoticeEntity wsNoticeEntity, String str, int i11, Object obj) throws JSONException {
        if ((i11 & 2) != 0) {
            str = "1";
        }
        wsNoticeManager.m43202O(wsNoticeEntity, str);
    }

    /* JADX INFO: renamed from: v */
    public static final Unit m43190v(Message message) {
        WsNoticeManager wsNoticeManager = f36378a;
        Intrinsics.checkNotNull(message);
        wsNoticeManager.m43196D(message);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: x */
    public static final Unit m43192x(Message message) {
        WsNoticeManager wsNoticeManager = f36378a;
        Intrinsics.checkNotNull(message);
        wsNoticeManager.m43196D(message);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: C */
    public final InterfaceC41709m0 m43195C() {
        return C41713n0.m91125a(new CoroutineName("WsNoticeManager").plus(C42911a.m94121c()).plus(new C19414b(CoroutineExceptionHandler.INSTANCE)));
    }

    @SuppressLint({"CheckResult"})
    /* JADX INFO: renamed from: D */
    public final void m43196D(Message message) {
        try {
            WsNoticeManager wsNoticeManager = f36378a;
            if (wsNoticeManager.m43207z(message)) {
                Object extension = message.getExtension();
                String str = extension instanceof String ? (String) extension : null;
                if (str == null) {
                    return;
                }
                C27099x c27099x = C27099x.f54458a;
                wsNoticeManager.m43205t((WsNoticeEntity) C27099x.m66914d(str, new C19415c().getType()));
            }
        } catch (Exception e11) {
            if (C42899b.m94075e(e11)) {
                return;
            }
            C38009a.m85882c(e11, TUIConstants.TUIChat.NOTICE, "onNoticeReceived");
        }
    }

    /* JADX INFO: renamed from: E */
    public final InterfaceC41709m0 m43197E() {
        return C41713n0.m91125a(new CoroutineName("WsNoticeManager").plus(new C19416d(CoroutineExceptionHandler.INSTANCE)));
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @SuppressLint({"CheckResult"})
    /* JADX INFO: renamed from: F */
    public final void m43198F() throws JSONException {
        final WsNoticeEntity wsNoticeEntityPollFirst;
        LinkedList<WsNoticeEntity> linkedList = f36379b;
        if (linkedList.isEmpty() || (wsNoticeEntityPollFirst = linkedList.pollFirst()) == null) {
            return;
        }
        RunnableC42867e runnableC42867e = f36382e;
        if ((runnableC42867e == null || !runnableC42867e.m94014d()) && wsNoticeEntityPollFirst.getData() != null) {
            View viewInflate = View.inflate(C23636b.m56289c(), R$layout.kucoin_view_main_alert, null);
            TextView textView = (TextView) viewInflate.findViewById(R$id.tv_notice);
            TextView textView2 = (TextView) viewInflate.findViewById(R$id.tv_alert);
            ImageView imageView = (ImageView) viewInflate.findViewById(R$id.iv_icon);
            TextView textView3 = (TextView) viewInflate.findViewById(R$id.jump_to_notice_setting);
            Intrinsics.checkNotNull(textView3);
            WsNoticeEntity.DataBean data = wsNoticeEntityPollFirst.getData();
            C19244f.m42542a(textView3, C27025c.m66566d(data != null ? data.getNeedToSetting() : null));
            ViewExtKt.m66575f(textView3, new Function1() { // from class: com.kubi.notice.lib.service.h
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return WsNoticeManager.m43166G(wsNoticeEntityPollFirst, (View) obj);
                }
            });
            if (textView2 != null) {
                WsNoticeEntity.DataBean data2 = wsNoticeEntityPollFirst.getData();
                textView2.setText(data2 != null ? data2.getTitle() : null);
            }
            if (textView != null) {
                WsNoticeEntity.DataBean data3 = wsNoticeEntityPollFirst.getData();
                textView.setText(data3 != null ? data3.getContent() : null);
            }
            if (Intrinsics.areEqual(wsNoticeEntityPollFirst.getSubject(), "notification.deposit") || Intrinsics.areEqual(wsNoticeEntityPollFirst.getSubject(), "notification.deposit.old.address")) {
                BeepHelper.m23642f("beep_income", R$raw.asset_in);
            }
            int i11 = 0;
            if (StringsKt.startsWith$default(C27041f.m66668h(wsNoticeEntityPollFirst.getSubject()), "verification.notice", false, 2, (Object) null)) {
                MainRedPointManager.f36366a.m43154o(1);
                if (NoticeDepend.f36385a.m43210b() && DataMapUtil.f54245a.m66370a("beep", true)) {
                    String subject = wsNoticeEntityPollFirst.getSubject();
                    if (subject != null) {
                        switch (subject.hashCode()) {
                            case -1599886033:
                                if (subject.equals("verification.notice.cancle.order")) {
                                    i11 = !MultiLanguageManager.m56980j() ? R$raw.cancelled : R$raw.cancelled_mandarin;
                                }
                                break;
                            case 72395620:
                                if (subject.equals("verification.notice.sellers.put.money")) {
                                    i11 = !MultiLanguageManager.m56980j() ? R$raw.received : R$raw.received_mandarin;
                                }
                                break;
                            case 565087784:
                                if (subject.equals("verification.notice.buyer.payment")) {
                                    i11 = !MultiLanguageManager.m56980j() ? R$raw.paid : R$raw.paid_mandarin;
                                }
                                break;
                            case 692799837:
                                if (subject.equals("verification.notice.new.order")) {
                                    i11 = !MultiLanguageManager.m56980j() ? R$raw.new_order : R$raw.new_order_mandarin;
                                }
                                break;
                        }
                    }
                    BeepHelper.m23642f("beep", i11);
                }
            }
            Intrinsics.checkNotNull(imageView);
            WsNoticeEntity.DataBean data4 = wsNoticeEntityPollFirst.getData();
            C19412c.m43162a(imageView, C27041f.m66668h(data4 != null ? data4.getLogo() : null), R$mipmap.ic_default_notice);
            if (C27058k0.f54342a.m66755e()) {
                WsNoticeEntity.DataBean data5 = wsNoticeEntityPollFirst.getData();
                if (!C27025c.m66566d(data5 != null ? data5.getNeedShowDialog() : null) || IWalletService.f54542a.get().mo66942b()) {
                    return;
                }
                WsNoticeEntity.DataBean data6 = wsNoticeEntityPollFirst.getData();
                if (C27025c.m66566d(data6 != null ? data6.getNeedToSetting() : null)) {
                    f36378a.m43202O(wsNoticeEntityPollFirst, "2");
                }
                WsNoticeManager wsNoticeManager = f36378a;
                Intrinsics.checkNotNull(viewInflate);
                wsNoticeManager.m43199I(wsNoticeEntityPollFirst, viewInflate, new Function2() { // from class: com.kubi.notice.lib.service.i
                    @Override // p852kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return WsNoticeManager.m43167H((WsNoticeEntity) obj, ((Boolean) obj2).booleanValue());
                    }
                });
            }
        }
    }

    /* JADX INFO: renamed from: I */
    public final void m43199I(final WsNoticeEntity wsNoticeEntity, View view, final Function2<? super WsNoticeEntity, ? super Boolean, Unit> function2) throws JSONException {
        RunnableC42867e runnableC42867e = f36382e;
        if (runnableC42867e != null) {
            runnableC42867e.m94012b();
        }
        m43171P(this, wsNoticeEntity, null, 2, null);
        Activity activityM6125h = C5258a.m6125h();
        if (activityM6125h != null) {
            RunnableC42867e runnableC42867eM94021k = new RunnableC42867e(activityM6125h).m94020j(view).m94021k(5000);
            C42295a c42295a = new C42295a();
            c42295a.m92833e(new Function0() { // from class: com.kubi.notice.lib.service.j
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return WsNoticeManager.m43168J(function2, wsNoticeEntity);
                }
            });
            RunnableC42867e runnableC42867eM94024n = runnableC42867eM94021k.m94027q(c42295a).m94025o(new RunnableC42867e.b() { // from class: com.kubi.notice.lib.service.WsNoticeManager$showToast$1$2
                @Override // p476ns.RunnableC42867e.b
                /* JADX INFO: renamed from: c */
                public void mo43208c(RunnableC42867e runnableC42867e2) {
                    super.mo43208c(runnableC42867e2);
                    C41696j.m91104d(WsNoticeManager.f36378a.m43197E(), C42911a.m94121c(), null, new WsNoticeManager$showToast$1$2$onDismiss$1(null), 2, null);
                }
            }).m94022l(48).m94028r(C5267e0.m6183e() - C27040e.m66658b(16)).m94019i(R$style.TopAnimStyle).m94024n(new RunnableC42867e.a() { // from class: com.kubi.notice.lib.service.k
                @Override // p476ns.RunnableC42867e.a
                /* JADX INFO: renamed from: a */
                public final void mo43213a(RunnableC42867e runnableC42867e2, View view2) {
                    WsNoticeManager.m43169K(function2, wsNoticeEntity, runnableC42867e2, view2);
                }
            });
            f36382e = runnableC42867eM94024n;
            if (runnableC42867eM94024n != null) {
                runnableC42867eM94024n.m94029s();
            }
        }
    }

    /* JADX INFO: renamed from: L */
    public final void m43200L() {
        DefaultWebSocketClient defaultWebSocketClient = f36384g;
        if (defaultWebSocketClient != null) {
            defaultWebSocketClient.m43108b(SocketRequest.INSTANCE.subscribe("/notice/center"));
        }
        DefaultWebSocketClient defaultWebSocketClient2 = f36383f;
        if (defaultWebSocketClient2 != null) {
            defaultWebSocketClient2.m43108b(SocketRequest.INSTANCE.subscribe("/notice-center/notices"));
        }
    }

    /* JADX INFO: renamed from: M */
    public final void m43201M(WsNoticeEntity wsNoticeEntity, String str, String str2) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        WsNoticeEntity.DataBean data = wsNoticeEntity.getData();
        jSONObject.put("postType", data != null ? data.getTemplateCode() : null);
        WsNoticeEntity.DataBean data2 = wsNoticeEntity.getData();
        jSONObject.put("messageId", data2 != null ? Integer.valueOf(data2.getId()) : null);
        jSONObject.put("actionType", str);
        Unit unit = Unit.INSTANCE;
        C19412c.m43163b("B1overallpages", "overallTips", str2, jSONObject);
    }

    /* JADX INFO: renamed from: O */
    public final void m43202O(WsNoticeEntity wsNoticeEntity, String str) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        WsNoticeEntity.DataBean data = wsNoticeEntity.getData();
        jSONObject.put("postType", data != null ? data.getTemplateCode() : null);
        WsNoticeEntity.DataBean data2 = wsNoticeEntity.getData();
        jSONObject.put("messageId", data2 != null ? Integer.valueOf(data2.getId()) : null);
        Unit unit = Unit.INSTANCE;
        C19412c.m43164c("B1overallpages", "overallTips", str, jSONObject);
    }

    /* JADX INFO: renamed from: Q */
    public final void m43203Q() {
        DefaultWebSocketClient defaultWebSocketClient = f36384g;
        if (defaultWebSocketClient != null) {
            defaultWebSocketClient.m43108b(SocketRequest.INSTANCE.unsubscribe("/notice/center"));
        }
        DefaultWebSocketClient defaultWebSocketClient2 = f36383f;
        if (defaultWebSocketClient2 != null) {
            defaultWebSocketClient2.m43108b(SocketRequest.INSTANCE.unsubscribe("/notice-center/notices"));
        }
    }

    /* JADX INFO: renamed from: s */
    public final INoticeApi m43204s() {
        return (INoticeApi) f36380c.getValue();
    }

    /* JADX INFO: renamed from: t */
    public final void m43205t(@NotNull WsNoticeEntity notice) {
        Intrinsics.checkNotNullParameter(notice, "notice");
        try {
            MainRedPointManager.f36366a.m43151k(BaseApplication.INSTANCE.get(), false);
            C12572a.m23695d("com.kubi.notice.event.NoticeEvent:app_notification", notice, 0L, 4, null);
            WsNoticeEntity.DataBean data = notice.getData();
            if (C27025c.m66566d(data != null ? Boolean.valueOf(data.getIsBox()) : null)) {
                C12572a.m23695d("com.kubi.notice.event.NoticeEvent:message_box_notification_update", null, 0L, 6, null);
            }
            f36379b.add(notice);
            C41696j.m91104d(f36378a.m43195C(), null, null, new WsNoticeManager$handleNotice$1$1(null), 3, null);
        } catch (Exception e11) {
            if (C42899b.m94075e(e11)) {
                return;
            }
            C38009a.m85882c(e11, TUIConstants.TUIChat.NOTICE, "WsNoticeManager");
        }
    }

    @SuppressLint({"CheckResult"})
    /* JADX INFO: renamed from: u */
    public final void m43206u() {
        C44128b.m97259c("WsNoticeManager", "init");
        DefaultWebSocketClient defaultWebSocketClient = new DefaultWebSocketClient(C37237b.m83278a());
        Observable<Message> observableSubscribeOn = defaultWebSocketClient.m43111e().subscribeOn(C42916f.m94127f());
        final Function1 function1 = new Function1() { // from class: com.kubi.notice.lib.service.d
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return WsNoticeManager.m43192x((Message) obj);
            }
        };
        observableSubscribeOn.subscribe(new Consumer() { // from class: com.kubi.notice.lib.service.e
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                WsNoticeManager.m43193y(function1, obj);
            }
        });
        f36384g = defaultWebSocketClient;
        Object objM56186h = Router.f46192a.m56186h(InterfaceC37238a.class, SiteInfoManager.f47913a.m58109c());
        if (objM56186h != null ? ((InterfaceC37238a) objM56186h).m83285a() : true) {
            DefaultWebSocketClient defaultWebSocketClient2 = new DefaultWebSocketClient(C37237b.m83279b());
            Observable<Message> observableSubscribeOn2 = defaultWebSocketClient2.m43111e().subscribeOn(C42916f.m94127f());
            final Function1 function2 = new Function1() { // from class: com.kubi.notice.lib.service.f
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return WsNoticeManager.m43190v((Message) obj);
                }
            };
            observableSubscribeOn2.subscribe(new Consumer() { // from class: com.kubi.notice.lib.service.g
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    WsNoticeManager.m43191w(function2, obj);
                }
            });
            f36383f = defaultWebSocketClient2;
        }
        C5264d.registerAppStatusChangedListener(new C19413a());
        m43200L();
    }

    /* JADX INFO: renamed from: w */
    public static final void m43191w(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: y */
    public static final void m43193y(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: A */
    public final void m43194A(WsNoticeEntity wsNoticeEntity) {
        String url;
        WsNoticeEntity.DataBean data = wsNoticeEntity.getData();
        String url2 = null;
        if (data != null) {
            url = data.getUrl();
        } else {
            url = null;
        }
        if (url != null && url.length() != 0) {
            WsNoticeEntity.DataBean data2 = wsNoticeEntity.getData();
            if (data2 != null) {
                url2 = data2.getUrl();
            }
            RouteExKt.m56217H(url2);
            return;
        }
        INoticeService.f36364a.get().mo43134c();
    }

    /* JADX INFO: renamed from: z */
    public final boolean m43207z(Message message) {
        if (Intrinsics.areEqual("/notice/center", message.getTopic())) {
            return true;
        }
        return Intrinsics.areEqual(message.getTopic(), "/notice-center/notices");
    }
}
