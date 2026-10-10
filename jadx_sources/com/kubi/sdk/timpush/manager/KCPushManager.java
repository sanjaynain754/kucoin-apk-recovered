package com.kubi.sdk.timpush.manager;

import com.kubi.sdk.timpush.exception.TimPushMessage;
import com.kubi.user.config.UserInfo;
import com.sensorsdata.analytics.android.sdk.SensorsDataAPI;
import com.tencent.qcloud.tim.push.TIMPushCallback;
import com.tencent.qcloud.tim.push.TIMPushManager;
import com.tencent.qcloud.tuicore.TUIConstants;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.C41713n0;
import kotlinx.coroutines.C41727q2;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineName;
import kotlinx.coroutines.InterfaceC41709m0;
import mr.C42597a;
import o00.C42911a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p481ny.C42899b;
import p569qq.C43846g;
import p852kotlin.Metadata;
import p852kotlin.coroutines.AbstractCoroutineContextElement;
import p852kotlin.coroutines.CoroutineContext;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import r00.C43895a;
import ro.C44128b;
import t00.InterfaceC44608b;
import u00.C45088a;

/* JADX INFO: compiled from: KCPushManager.kt */
/* JADX INFO: loaded from: classes43.dex */
@Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\t\u001a\u00020\nJ\b\u0010\u000b\u001a\u00020\nH\u0002J\u0012\u0010\f\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\u0005H\u0002J\u0006\u0010\u000e\u001a\u00020\nJ\b\u0010\u000f\u001a\u00020\nH\u0002J\u0006\u0010\u0010\u001a\u00020\nJ\u0006\u0010\u0011\u001a\u00020\nR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m90084d2 = {"Lcom/kubi/sdk/timpush/manager/KCPushManager;", "", "<init>", "()V", "PUSH_TYPE_KEY", "", "registrationID", "pushScope", "Lkotlinx/coroutines/CoroutineScope;", "initPush", "", TUIConstants.TIMPush.METHOD_GET_REGISTRATION_ID, "registerTimPushId", "registrationId", "autoBind", "bindAnonymous", "bind", "unbind", "LTimPush_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nKCPushManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KCPushManager.kt\ncom/kubi/sdk/timpush/manager/KCPushManager\n+ 2 TimPushIssue.kt\ncom/kubi/sdk/timpush/exception/TimPushIssueKt\n+ 3 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt\n*L\n1#1,156:1\n45#2,2:157\n47#3,4:159\n*S KotlinDebug\n*F\n+ 1 KCPushManager.kt\ncom/kubi/sdk/timpush/manager/KCPushManager\n*L\n75#1:157,2\n28#1:159,4\n*E\n"})
public final class KCPushManager {

    /* JADX INFO: renamed from: b */
    @Nullable
    public static String f48095b;

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final KCPushManager f48094a = new KCPushManager();

    /* JADX INFO: renamed from: c */
    @NotNull
    public static final InterfaceC41709m0 f48096c = C41713n0.m91125a(new CoroutineName("TimPush").plus(C42911a.m94120b()).plus(C41727q2.m91192b(null, 1, null)).plus(new C24204b(CoroutineExceptionHandler.INSTANCE)));

    /* JADX INFO: renamed from: com.kubi.sdk.timpush.manager.KCPushManager$a */
    /* JADX INFO: compiled from: KCPushManager.kt */
    @Metadata(m90083d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\u0016J$\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\u00022\b\u0010\n\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\u000b"}, m90084d2 = {"com/kubi/sdk/timpush/manager/KCPushManager$getRegistrationID$1", "Lcom/tencent/qcloud/tim/push/TIMPushCallback;", "", "onSuccess", "", "registrationID", "onError", "errCode", "", "errMsg", "data", "LTimPush_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nKCPushManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KCPushManager.kt\ncom/kubi/sdk/timpush/manager/KCPushManager$getRegistrationID$1\n+ 2 TimPushIssue.kt\ncom/kubi/sdk/timpush/exception/TimPushIssueKt\n*L\n1#1,156:1\n45#2,2:157\n*S KotlinDebug\n*F\n+ 1 KCPushManager.kt\ncom/kubi/sdk/timpush/manager/KCPushManager$getRegistrationID$1\n*L\n61#1:157,2\n*E\n"})
    public static final class C24203a extends TIMPushCallback<String> {
        @Override // com.tencent.qcloud.tim.push.TIMPushCallback
        public void onError(int errCode, String errMsg, String data) {
            super.onError(errCode, errMsg, data);
            C44128b.m97261e("KCPush", "getRegistrationID onError errCode:" + errCode + ",errMsg:" + errMsg + ",data:" + data);
            C43846g.m96568c(new TimPushMessage("getRegistrationID onError errCode:" + errCode + ",errMsg:" + errMsg + ",data:" + data, "TimPushHelper", false, 4, null), null, 2, null);
        }

        @Override // com.tencent.qcloud.tim.push.TIMPushCallback
        public void onSuccess(String registrationID) {
            C44128b.m97259c("KCPush", "getRegistrationID onSuccess registrationID:" + registrationID);
            KCPushManager.f48094a.m58260h(registrationID);
        }
    }

    /* JADX INFO: renamed from: com.kubi.sdk.timpush.manager.KCPushManager$b */
    /* JADX INFO: compiled from: CoroutineExceptionHandler.kt */
    @Metadata(m90083d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t¸\u0006\u0000"}, m90084d2 = {"kotlinx/coroutines/CoroutineExceptionHandlerKt$CoroutineExceptionHandler$1", "Lkotlin/coroutines/AbstractCoroutineContextElement;", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "handleException", "", "context", "Lkotlin/coroutines/CoroutineContext;", "exception", "", "kotlinx-coroutines-core"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nCoroutineExceptionHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt$CoroutineExceptionHandler$1\n+ 2 KCPushManager.kt\ncom/kubi/sdk/timpush/manager/KCPushManager\n+ 3 TimPushIssue.kt\ncom/kubi/sdk/timpush/exception/TimPushIssueKt\n*L\n1#1,49:1\n29#2:50\n30#2:55\n39#3,4:51\n*S KotlinDebug\n*F\n+ 1 KCPushManager.kt\ncom/kubi/sdk/timpush/manager/KCPushManager\n*L\n29#1:51,4\n*E\n"})
    public static final class C24204b extends AbstractCoroutineContextElement implements CoroutineExceptionHandler {
        public C24204b(CoroutineExceptionHandler.Companion companion) {
            super(companion);
        }

        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public void handleException(CoroutineContext context, Throwable exception) {
            if (!C42899b.m94075e(exception)) {
                C45088a.m99691b(exception, "push", "scope Error");
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m58255c() {
        if (UserInfo.a.n()) {
            m58256d();
        } else {
            m58257e();
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m58256d() {
        C41696j.m91104d(f48096c, null, null, new KCPushManager$bind$1(null), 3, null);
    }

    /* JADX INFO: renamed from: e */
    public final void m58257e() {
        C41696j.m91104d(f48096c, null, null, new KCPushManager$bindAnonymous$1(null), 3, null);
    }

    /* JADX INFO: renamed from: g */
    public final void m58259g() {
        C43895a c43895a = C43895a.f96983a;
        Object objCreate = C42597a.m93388d().create(InterfaceC44608b.class);
        Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
        c43895a.m96670b((InterfaceC44608b) objCreate, C42911a.m94120b());
        m58258f();
    }

    /* JADX INFO: renamed from: h */
    public final void m58260h(String str) {
        if (str == null || str.length() == 0) {
            C43846g.m96568c(new TimPushMessage("registerTimPushId registrationId is null or empty", "TimPushHelper", false, 4, null), null, 2, null);
            return;
        }
        f48095b = str;
        SensorsDataAPI.sharedInstance().profilePushId("timPushId", str);
        m58255c();
    }

    /* JADX INFO: renamed from: i */
    public final void m58261i() {
        C41696j.m91104d(f48096c, null, null, new KCPushManager$unbind$1(null), 3, null);
    }

    /* JADX INFO: renamed from: f */
    public final void m58258f() {
        TIMPushManager.getInstance().getRegistrationID(new C24203a());
    }
}
