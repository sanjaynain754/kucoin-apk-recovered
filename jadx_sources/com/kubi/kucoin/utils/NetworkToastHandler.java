package com.kubi.kucoin.utils;

import android.text.TextUtils;
import com.google.gson.JsonParseException;
import com.kubi.app.net.R$string;
import com.kubi.network.retrofit.exception.ApiException;
import com.kubi.network.retrofit.utils.InterfaceC19330b;
import com.kubi.sdk.BaseApplication;
import com.kubi.utils.C27017c;
import com.kubi.utils.C27058k0;
import com.kubi.utils.ToastCompat;
import com.kubi.utils.extensions.C27041f;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.net.ConnectException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import p795yf.C46482h;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import retrofit2.HttpException;
import ro.C44128b;

/* JADX INFO: renamed from: com.kubi.kucoin.utils.z0, reason: from Kotlin metadata */
/* JADX INFO: compiled from: NetworkToastHandler.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\tH\u0016J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\rH\u0002J\u0010\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\nH\u0002J\u001c\u0010\u0010\u001a\u00020\n2\b\u0010\u0011\u001a\u0004\u0018\u00010\n2\b\u0010\u000f\u001a\u0004\u0018\u00010\nH\u0002J*\u0010\u0012\u001a\u0004\u0018\u00010\n2\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\t¨\u0006\u0013"}, m90084d2 = {"Lcom/kubi/kucoin/utils/NetworkToastHandler;", "Lcom/kubi/network/retrofit/utils/IToastHandler;", "<init>", "()V", "handle", "", "e", "", TUIConstants.TUIChat.CALL_BACK, "Lkotlin/Function1;", "", "getServerMsg", "exception", "Lcom/kubi/network/retrofit/exception/ApiException;", "getClientMsg", "code", "getToastMsg", "msg", "getToastTips", "LAppNet_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class NetworkToastHandler implements InterfaceC19330b {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: f */
    public static /* synthetic */ String m33206f(NetworkToastHandler networkToastHandler, Throwable th2, Function1 function1, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            function1 = null;
        }
        return networkToastHandler.m33211e(th2, function1);
    }

    @Override // com.kubi.network.retrofit.utils.InterfaceC19330b
    /* JADX INFO: renamed from: a */
    public void mo33207a(@NotNull Throwable e11, @Nullable Function1<? super String, Unit> function1) {
        Intrinsics.checkNotNullParameter(e11, "e");
        if (C27058k0.f54342a.m66755e()) {
            String strM33211e = m33211e(e11, function1);
            if (!TextUtils.isEmpty(strM33211e)) {
                ToastCompat.m66441G(strM33211e, new Object[0]);
            }
            C44128b.m97261e("NETWORK_TOAST", C27041f.m66668h(e11.getMessage()));
        }
    }

    /* JADX INFO: renamed from: b */
    public final String m33208b(String str) {
        return m33210d(C27017c.f54310a.m66516f(R$string.network_error, new Object[0]), str);
    }

    /* JADX INFO: renamed from: d */
    public final String m33210d(String str, String str2) {
        return str + '(' + str2 + ')';
    }

    @Nullable
    /* JADX INFO: renamed from: e */
    public final String m33211e(@Nullable Throwable th2, @Nullable Function1<? super String, Unit> function1) {
        if (th2 instanceof ApiException) {
            ApiException apiException = (ApiException) th2;
            if (Intrinsics.areEqual(apiException.code, "-1000")) {
                return m33208b("-1000");
            }
            if (TextUtils.isEmpty(apiException.getMessage())) {
                return null;
            }
            return m33209c(apiException);
        }
        if (th2 instanceof JsonParseException) {
            String strM33208b = m33208b("-100");
            if (function1 != null) {
                function1.invoke(strM33208b);
            }
            return strM33208b;
        }
        if (th2 instanceof JSONException) {
            String strM33208b2 = m33208b("-100");
            if (function1 != null) {
                function1.invoke(strM33208b2);
            }
            return strM33208b2;
        }
        if (th2 instanceof HttpException) {
            HttpException httpException = (HttpException) th2;
            if (httpException.code() == 429) {
                return null;
            }
            String strM33208b3 = C46482h.m102544b(BaseApplication.INSTANCE.get()) ? m33208b(String.valueOf(httpException.code())) : m33208b("-101");
            if (function1 != null) {
                function1.invoke(strM33208b3);
            }
            return strM33208b3;
        }
        if (th2 instanceof ConnectException) {
            String strM33208b4 = m33208b("-102");
            if (function1 != null) {
                function1.invoke(strM33208b4);
            }
            return strM33208b4;
        }
        if (th2 instanceof SocketTimeoutException) {
            String strM33208b5 = m33208b("-1001");
            if (function1 != null) {
                function1.invoke(strM33208b5);
            }
            return strM33208b5;
        }
        if (!(th2 instanceof UnknownHostException)) {
            return null;
        }
        String strM33208b6 = m33208b("-1003");
        if (function1 != null) {
            function1.invoke(strM33208b6);
        }
        return strM33208b6;
    }

    /* JADX INFO: renamed from: c */
    public final String m33209c(ApiException apiException) {
        return m33210d(C27041f.m66668h(apiException.getMessage()), apiException.code);
    }
}
