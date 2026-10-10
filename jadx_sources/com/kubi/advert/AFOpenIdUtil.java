package com.kubi.advert;

import android.annotation.SuppressLint;
import com.appsflyer.AppsFlyerLib;
import com.blankj.utilcode.util.C5276j;
import com.google.firebase.messaging.Constants;
import com.kubi.advert.exception.AdvertException;
import com.kubi.network.retrofit.exception.ApiException;
import com.kubi.user.config.UserInfo;
import com.kubi.user.model.AccountEventState;
import com.kubi.user.model.AccountState;
import com.kubi.user.utils.b0;
import com.kubi.utils.C27100x0;
import io.reactivex.Observable;
import io.reactivex.functions.Consumer;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.InterfaceC41775x1;
import o00.C42911a;
import org.jetbrains.annotations.NotNull;
import p481ny.C42899b;
import p569qq.C43846g;
import p569qq.C43848i;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import ro.C44128b;
import y70.C46392a;
import y70.StorageId;

/* JADX INFO: compiled from: AFOpenIdUtil.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m90083d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u000b\u001a\u00020\u0005J\b\u0010\f\u001a\u00020\rH\u0007J\b\u0010\u000e\u001a\u00020\u000fH\u0002J\u001a\u0010\u0010\u001a\u00020\u00052\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J\u0010\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u0005H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006\u0017"}, m90084d2 = {"Lcom/kubi/advert/AFOpenIdUtil;", "", "<init>", "()V", "TAG", "", "TAG_ACCOUNT_CONTEXT", "OPEN_ID", "Lcom/kubi/utils/storage/StorageId;", "getOPEN_ID", "()Lcom/kubi/utils/storage/StorageId;", "getCurrentOpenId", "subscribeLoginState", "", "requestOpenId", "Lkotlinx/coroutines/Job;", "buildOpenIdFailMessage", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "", "openIdEmpty", "", "setOpenId", "openId", "AdvertLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nAFOpenIdUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AFOpenIdUtil.kt\ncom/kubi/advert/AFOpenIdUtil\n+ 2 StorageIdEx.kt\ncom/kubi/utils/storage/StorageIdExKt\n+ 3 AdvertIssue.kt\ncom/kubi/advert/exception/AdvertIssueKt\n*L\n1#1,125:1\n32#2:126\n23#2,2:131\n45#3,4:127\n*S KotlinDebug\n*F\n+ 1 AFOpenIdUtil.kt\ncom/kubi/advert/AFOpenIdUtil\n*L\n40#1:126\n120#1:131,2\n65#1:127,4\n*E\n"})
public final class AFOpenIdUtil {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final AFOpenIdUtil f14967a = new AFOpenIdUtil();

    /* JADX INFO: renamed from: m */
    public static final Unit m14706m(String str) {
        C44128b.m97261e("AppsFlyerOpenId", "AppsFlyer-setCustomerUserId,openId=" + str);
        C46392a.m102333p(f14967a.m14713j(), str);
        AppsFlyerLib.getInstance().setCustomerUserId(str);
        C43848i.m96583k(C5276j.m6247f(), str);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o */
    public static final Unit m14707o(AccountEventState accountEventState) {
        C44128b.m97266j("AccountContextSwitch", "refresh openId, state=" + accountEventState.getState() + ", oldUid=" + accountEventState.getPreUid());
        if (accountEventState.getState() == AccountState.Login || accountEventState.getState() == AccountState.SwitchAccount) {
            b0 b0Var = b0.a;
            b0.f(b0Var, "loginStateChanged", (String) null, false, 6, (Object) null);
            b0.f(b0Var, "fetchOpenIdStart", (String) null, false, 6, (Object) null);
            f14967a.m14714k();
        } else {
            f14967a.m14715l("");
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:6:0x000d  */
    /* JADX INFO: renamed from: h */
    public final String m14711h(Throwable th2, boolean z11) {
        String str;
        if (th2 instanceof ApiException) {
            str = ((ApiException) th2).code;
            if (str == null) {
                str = "";
            }
        } else if (z11) {
            str = "empty";
        } else {
            str = "";
        }
        String message = th2 != null ? th2.getMessage() : null;
        if (message == null) {
            message = "";
        }
        if (message.length() == 0) {
            message = z11 ? "openIdEmpty" : "";
        }
        return b0.a.b(str, message);
    }

    /* JADX INFO: renamed from: j */
    public final StorageId<String> m14713j() {
        StorageId storageId = new StorageId("advert", "OPEN_ID", null, false, 12, null);
        String strH = UserInfo.a.h();
        if (strH == null) {
            strH = "";
        }
        return storageId.m102384f(strH);
    }

    /* JADX INFO: renamed from: k */
    public final InterfaceC41775x1 m14714k() {
        return C41696j.m91104d(new AdCoroutineScope("AppsFlyerOpenId"), C42911a.m94120b(), null, new AFOpenIdUtil$requestOpenId$1(null), 2, null);
    }

    /* JADX INFO: renamed from: l */
    public final void m14715l(final String str) {
        C27100x0.m66923d(new Function0() { // from class: com.kubi.advert.e
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AFOpenIdUtil.m14706m(str);
            }
        });
    }

    @SuppressLint({"CheckResult"})
    /* JADX INFO: renamed from: n */
    public final void m14716n() {
        UserInfo userInfo = UserInfo.a;
        if (userInfo.d() == UserInfo.LoginState.Login) {
            String strM14712i = m14712i();
            if (strM14712i.length() > 0) {
                m14715l(strM14712i);
            } else {
                m14714k();
            }
        }
        Observable observableA = userInfo.a();
        final Function1 function1 = new Function1() { // from class: com.kubi.advert.a
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AFOpenIdUtil.m14707o((AccountEventState) obj);
            }
        };
        Consumer consumer = new Consumer() { // from class: com.kubi.advert.b
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                AFOpenIdUtil.m14708p(function1, obj);
            }
        };
        final Function1 function2 = new Function1() { // from class: com.kubi.advert.c
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AFOpenIdUtil.m14709q((Throwable) obj);
            }
        };
        observableA.subscribe(consumer, new Consumer() { // from class: com.kubi.advert.d
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                AFOpenIdUtil.m14710r(function2, obj);
            }
        });
        b0.f(b0.a, "loginStateChangeSubscribe", (String) null, false, 2, (Object) null);
    }

    /* JADX INFO: renamed from: p */
    public static final void m14708p(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: q */
    public static final Unit m14709q(Throwable th2) {
        Intrinsics.checkNotNull(th2);
        if (!C42899b.m94075e(th2)) {
            C43846g.m96568c(new AdvertException(th2, "AppsFlyerOpenId", false, null, 8, null), null, 2, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: r */
    public static final void m14710r(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    @NotNull
    /* JADX INFO: renamed from: i */
    public final String m14712i() {
        return C46392a.m102326h(m14713j(), "");
    }
}
