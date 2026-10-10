package sy;

import android.annotation.SuppressLint;
import android.content.Context;
import android.text.TextUtils;
import com.google.gson.JsonObject;
import com.kubi.network.socket.model.TokenEntity;
import com.kubi.network.subscribe.token.SubscribeTokenConfig;
import com.kubi.network.subscribe.token.SubscribeTokenProvider;
import com.kubi.sdk.flutter.handler.IMethodHandler;
import com.kubi.user.config.UserInfo;
import com.kubi.utils.FlowableCompat;
import com.kubi.utils.ToastCompat;
import com.sensorsdata.analytics.android.sdk.data.adapter.DbParams;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import io.reactivex.Flowable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import ro.C44128b;
import tr.InterfaceC45068c;

/* JADX INFO: renamed from: sy.g0 */
/* JADX INFO: compiled from: WebSocketTokenHandler.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m90083d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J \u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u00102\u000e\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u0012H\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, m90084d2 = {"Lcom/kubi/sdk/flutter/handler/WebSocketTokenHandler;", "Lcom/kubi/sdk/flutter/handler/IMethodHandler;", "<init>", "()V", "tokenProvider", "Lcom/kubi/network/subscribe/token/SubscribeTokenProvider;", "handleMethod", "", "context", "Landroid/content/Context;", "call", "Lio/flutter/plugin/common/MethodCall;", DbParams.KEY_CHANNEL_RESULT, "Lio/flutter/plugin/common/MethodChannel$Result;", "getWebSocketToken", "needRefresh", "", "consumer", "Lio/reactivex/functions/Consumer;", "", "LFlutter_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C44582g0 implements IMethodHandler {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C44582g0 f98864a = new C44582g0();

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final SubscribeTokenProvider f98865b = new SubscribeTokenProvider(new SubscribeTokenConfig(null, null, null, null, new Function0() { // from class: sy.z
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return C44582g0.m98674o();
        }
    }, 15, null), null, 2, null);

    /* JADX INFO: renamed from: i */
    public static final TokenEntity m98668i() {
        return InterfaceC45068c.a.m99662a(f98865b, false, 1, null);
    }

    /* JADX INFO: renamed from: j */
    public static final Unit m98669j(Consumer consumer, TokenEntity tokenEntity) throws Exception {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("pingInterval", Integer.valueOf(tokenEntity.getPingInterval()));
        jsonObject.addProperty("pingTimeout", Integer.valueOf(tokenEntity.getPingTimeout()));
        jsonObject.addProperty("url", tokenEntity.getWsUrl());
        consumer.accept(jsonObject.toString());
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: l */
    public static final Unit m98671l(Consumer consumer, Throwable th2) throws Exception {
        C44128b.m97258b("getWebSocketToken:" + th2.getMessage());
        consumer.accept(null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: n */
    public static final void m98673n(MethodChannel.Result result, String str) {
        if (str != null) {
            result.success(str);
        }
    }

    /* JADX INFO: renamed from: o */
    public static final String m98674o() {
        return UserInfo.a.n() ? UserInfo.c().id : "";
    }

    @SuppressLint({"CheckResult"})
    /* JADX INFO: renamed from: h */
    public final void m98675h(boolean z11, final Consumer<String> consumer) {
        if (z11) {
            f98865b.mo43098b();
        }
        Flowable flowableObserveOn = FlowableCompat.f54248a.m66385b(new Function0() { // from class: sy.b0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C44582g0.m98668i();
            }
        }).subscribeOn(Schedulers.m87969io()).observeOn(AndroidSchedulers.mainThread());
        final Function1 function1 = new Function1() { // from class: sy.c0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C44582g0.m98669j(consumer, (TokenEntity) obj);
            }
        };
        Consumer consumer2 = new Consumer() { // from class: sy.d0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C44582g0.m98670k(function1, obj);
            }
        };
        final Function1 function2 = new Function1() { // from class: sy.e0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C44582g0.m98671l(consumer, (Throwable) obj);
            }
        };
        flowableObserveOn.subscribe(consumer2, new Consumer() { // from class: sy.f0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C44582g0.m98672m(function2, obj);
            }
        });
    }

    @Override // com.kubi.sdk.flutter.handler.IMethodHandler
    public void handleMethod(@NotNull Context context, @NotNull MethodCall call, @NotNull final MethodChannel.Result result) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(result, "result");
        Boolean bool = (Boolean) call.argument("needRefresh");
        m98675h(bool != null ? bool.booleanValue() : false, new Consumer() { // from class: sy.a0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C44582g0.m98673n(result, (String) obj);
            }
        });
        String str = (String) call.argument("msg");
        if (TextUtils.isEmpty(str)) {
            return;
        }
        ToastCompat.m66441G(str, new Object[0]);
    }

    /* JADX INFO: renamed from: k */
    public static final void m98670k(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: m */
    public static final void m98672m(Function1 function1, Object obj) {
        function1.invoke(obj);
    }
}
