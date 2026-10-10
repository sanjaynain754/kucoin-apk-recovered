package com.kubi.kucoin.startup;

import android.annotation.SuppressLint;
import android.app.Application;
import androidx.media3.common.MimeTypes;
import com.kubi.network.socket.WebSocketClient;
import com.kubi.network.subscribe.codec.SubscribeSocketKCCodec;
import com.kubi.network.subscribe.token.SubscribeTokenConfig;
import com.kubi.network.subscribe.token.SubscribeTokenProvider;
import com.kubi.router.core.Router;
import com.kubi.sdk.startup.IStartupTask;
import com.kubi.sdk.startup.StartupOption;
import com.kubi.sdk.startup.StartupStepType;
import com.kubi.sdk.startup.StartupThreadType;
import com.kubi.user.config.UserInfo;
import com.kubi.user.model.AccountEventState;
import er.C37237b;
import io.reactivex.Observable;
import io.reactivex.functions.Consumer;
import java.util.ArrayList;
import java.util.Iterator;
import mr.C42597a;
import okhttp3.OkHttpClient;
import org.jetbrains.annotations.NotNull;
import p672ur.C45291a;
import p672ur.C45292b;
import p672ur.C45293c;
import p700vr.C45623a;
import p764xk.InterfaceC46259g;
import p777xx.C46337a;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import ro.C44128b;

/* JADX INFO: compiled from: WebSocketStartupTask.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0017J\b\u0010\b\u001a\u00020\tH\u0002¨\u0006\u000b"}, m90084d2 = {"Lcom/kubi/kucoin/startup/WebSocketStartupTask;", "Lcom/kubi/sdk/startup/IStartupTask;", "<init>", "()V", "run", "", MimeTypes.BASE_TYPE_APPLICATION, "Landroid/app/Application;", "createWebSocketOkHttpClient", "Lokhttp3/OkHttpClient;", "Companion", "LAppNet_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@StartupOption(name = "websocket", priority = 1, stepType = StartupStepType.PreFirstPage, threadType = StartupThreadType.Main)
@SourceDebugExtension({"SMAP\nWebSocketStartupTask.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WebSocketStartupTask.kt\ncom/kubi/kucoin/startup/WebSocketStartupTask\n+ 2 KuEmitter.kt\ncom/kubi/router/emitter/KuEmitter\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,70:1\n16#2:71\n2756#3:72\n1#4:73\n1#4:74\n*S KotlinDebug\n*F\n+ 1 WebSocketStartupTask.kt\ncom/kubi/kucoin/startup/WebSocketStartupTask\n*L\n37#1:71\n37#1:72\n37#1:73\n*E\n"})
public final class WebSocketStartupTask implements IStartupTask {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @Deprecated
    @NotNull
    public static final String TAG = "AccountContextSwitch";

    /* JADX INFO: compiled from: WebSocketStartupTask.kt */
    /* JADX INFO: loaded from: classes19.dex */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m90084d2 = {"Lcom/kubi/kucoin/startup/WebSocketStartupTask$Companion;", "", "<init>", "()V", "TAG", "", "LAppNet_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String run$lambda$1() {
        return UserInfo.a.n() ? UserInfo.c().id : "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit run$lambda$3(AccountEventState accountEventState) {
        C44128b.m97266j("AccountContextSwitch", "reconnect default websocket, state=" + accountEventState.getState() + ", oldUserId=" + accountEventState.getPreUid());
        C37237b.m83278a().mo42862g();
        return Unit.INSTANCE;
    }

    @Override // com.kubi.sdk.startup.IStartupTask
    @SuppressLint({"CheckResult"})
    public void run(@NotNull Application application) {
        Intrinsics.checkNotNullParameter(application, "application");
        ArrayList arrayList = new ArrayList();
        C46337a c46337a = C46337a.f103912a;
        Iterator it = Router.f46192a.m56190l(InterfaceC46259g.class).iterator();
        while (it.hasNext()) {
            ((InterfaceC46259g) it.next()).invoke(arrayList);
        }
        SubscribeTokenProvider subscribeTokenProvider = new SubscribeTokenProvider(new SubscribeTokenConfig(null, null, null, null, new Function0() { // from class: com.kubi.kucoin.startup.l0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return WebSocketStartupTask.run$lambda$1();
            }
        }, 15, null), null, 2, null);
        WebSocketClient webSocketClientM42867a = new WebSocketClient.C19339a().m42891y(createWebSocketOkHttpClient()).m42865A(new C45623a()).m42888v(new SubscribeSocketKCCodec(subscribeTokenProvider, arrayList)).m42886t(new C45291a("push", 0L, 2, null)).m42890x(new C45292b("push")).m42892z(new C45293c("push")).m42866B(subscribeTokenProvider).m42867a(application);
        webSocketClientM42867a.connect();
        C37237b.m83284g("network/channel_default", webSocketClientM42867a);
        Observable observableA = UserInfo.a.a();
        final Function1 function1 = new Function1() { // from class: com.kubi.kucoin.startup.m0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return WebSocketStartupTask.run$lambda$3((AccountEventState) obj);
            }
        };
        observableA.subscribe(new Consumer() { // from class: com.kubi.kucoin.startup.n0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                function1.invoke(obj);
            }
        });
    }

    private final OkHttpClient createWebSocketOkHttpClient() {
        return C42597a.m93389e().newBuilder().minWebSocketMessageToCompress(1536L).build();
    }
}
