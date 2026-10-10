package com.facebook.react.common.network;

import java.lang.reflect.Method;
import okhttp3.Call;
import okhttp3.Dispatcher;
import okhttp3.OkHttpClient;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: OkHttpCallUtil.kt */
/* JADX INFO: loaded from: classes45.dex */
@Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0001H\u0007¨\u0006\t"}, m90084d2 = {"Lcom/facebook/react/common/network/OkHttpCallUtil;", "", "<init>", "()V", "cancelTag", "", "client", "Lokhttp3/OkHttpClient;", "tag", "ReactAndroid_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public final class OkHttpCallUtil {

    @NotNull
    public static final OkHttpCallUtil INSTANCE = new OkHttpCallUtil();

    @JvmStatic
    public static final void cancelTag(@NotNull OkHttpClient client, @NotNull Object tag) {
        Intrinsics.checkNotNullParameter(client, "client");
        Intrinsics.checkNotNullParameter(tag, "tag");
        Method method = OkHttpClient.class.getMethod("dispatcher", new Class[0]);
        method.setAccessible(true);
        Object objInvoke = method.invoke(client, new Object[0]);
        Intrinsics.checkNotNull(objInvoke, "null cannot be cast to non-null type okhttp3.Dispatcher");
        Dispatcher dispatcher = (Dispatcher) objInvoke;
        for (Call call : dispatcher.queuedCalls()) {
            if (Intrinsics.areEqual(tag, call.request().tag())) {
                call.cancel();
                return;
            }
        }
        for (Call call2 : dispatcher.runningCalls()) {
            if (Intrinsics.areEqual(tag, call2.request().tag())) {
                call2.cancel();
                return;
            }
        }
    }

    private OkHttpCallUtil() {
    }
}
