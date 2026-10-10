package com.kubi.kumex;

import android.annotation.SuppressLint;
import android.app.Application;
import androidx.credentials.provider.CredentialEntry;
import androidx.media3.common.MimeTypes;
import com.kubi.kumex.BKumexWebSocketStartUpTask;
import com.kubi.network.socket.WebSocketClient;
import com.kubi.network.subscribe.codec.SubscribeSocketKCCodec;
import com.kubi.network.subscribe.token.SubscribeTokenConfig;
import com.kubi.network.subscribe.token.SubscribeTokenProvider;
import com.kubi.p110rn.Constants;
import com.kubi.sdk.site.C24129b;
import com.kubi.sdk.site.SiteVisibleConfigKey;
import com.kubi.sdk.startup.IStartupTask;
import com.kubi.sdk.startup.StartupOption;
import com.kubi.sdk.startup.StartupStepType;
import com.kubi.sdk.startup.StartupThreadType;
import com.kubi.user.config.UserInfo;
import com.kubi.user.model.AccountEventState;
import com.kubi.user.model.AccountState;
import com.kubi.utils.extensions.C27041f;
import er.C37237b;
import io.reactivex.Observable;
import io.reactivex.functions.Consumer;
import java.util.ArrayList;
import mr.C42597a;
import okhttp3.OkHttpClient;
import org.jetbrains.annotations.NotNull;
import p672ur.C45291a;
import p672ur.C45292b;
import p672ur.C45293c;
import p700vr.C45623a;
import p836zl.C46889e;
import p852kotlin.Metadata;
import p852kotlin.TuplesKt;
import p852kotlin.Unit;
import p852kotlin.collections.MapsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: BKumexWebSocketStartUpTask.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0003J\b\u0010\t\u001a\u00020\nH\u0002¨\u0006\u000b"}, m90084d2 = {"Lcom/kubi/kumex/BKumexWebSocketStartUpTask;", "Lcom/kubi/sdk/startup/IStartupTask;", "<init>", "()V", "run", "", MimeTypes.BASE_TYPE_APPLICATION, "Landroid/app/Application;", "initWS", "createWebSocketOkHttpClient", "Lokhttp3/OkHttpClient;", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@StartupOption(name = "b_kumex_websocket", priority = 2, stepType = StartupStepType.PreFirstPage, threadType = StartupThreadType.Main)
@SourceDebugExtension({"SMAP\nBKumexWebSocketStartUpTask.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BKumexWebSocketStartUpTask.kt\ncom/kubi/kumex/BKumexWebSocketStartUpTask\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,95:1\n1#2:96\n*E\n"})
public final class BKumexWebSocketStartUpTask implements IStartupTask {
    @SuppressLint({"CheckResult"})
    private final void initWS(Application application) {
        ArrayList<String> arrayListM103227a = C46889e.f104716a.m103227a();
        SubscribeTokenProvider subscribeTokenProvider = new SubscribeTokenProvider(new SubscribeTokenConfig(null, null, MapsKt.mapOf(TuplesKt.m90091to("isWs", CredentialEntry.TRUE_STRING), TuplesKt.m90091to(Constants.BIZ, "kumex")), null, new Function0() { // from class: wl.g
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BKumexWebSocketStartUpTask.initWS$lambda$1();
            }
        }, 11, null), null, 2, null);
        WebSocketClient webSocketClientM42867a = new WebSocketClient.C19339a().m42891y(createWebSocketOkHttpClient()).m42865A(new C45623a()).m42888v(new SubscribeSocketKCCodec(subscribeTokenProvider, arrayListM103227a)).m42886t(new C45291a("contract", 0L, 2, null)).m42890x(new C45292b("contract")).m42892z(new C45293c("contract")).m42866B(subscribeTokenProvider).m42867a(application);
        webSocketClientM42867a.connect();
        C37237b.m83284g("network/channel_futures", webSocketClientM42867a);
        Observable observableA = UserInfo.a.a();
        final Function1 function1 = new Function1() { // from class: wl.h
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BKumexWebSocketStartUpTask.initWS$lambda$3((AccountEventState) obj);
            }
        };
        observableA.subscribe(new Consumer() { // from class: wl.i
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                function1.invoke(obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String initWS$lambda$1() {
        return UserInfo.a.n() ? C27041f.m66668h(UserInfo.c().id) : "";
    }

    @Override // com.kubi.sdk.startup.IStartupTask
    public void run(@NotNull final Application application) {
        Intrinsics.checkNotNullParameter(application, "application");
        C24129b.m58033e(SiteVisibleConfigKey.Futures, new Function0() { // from class: wl.f
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BKumexWebSocketStartUpTask.run$lambda$0(this.f103329b, application);
            }
        });
    }

    private final OkHttpClient createWebSocketOkHttpClient() {
        return C42597a.m93389e().newBuilder().minWebSocketMessageToCompress(1536L).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initWS$lambda$3(AccountEventState accountEventState) {
        if (accountEventState.getState() == AccountState.SwitchAccount || accountEventState.getState() == AccountState.Login) {
            C37237b.m83279b().mo42862g();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit run$lambda$0(BKumexWebSocketStartUpTask bKumexWebSocketStartUpTask, Application application) {
        bKumexWebSocketStartUpTask.initWS(application);
        return Unit.INSTANCE;
    }
}
