package com.kubi.user.jsapi;

import android.annotation.SuppressLint;
import android.content.Intent;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwnerKt;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.google.auto.service.AutoService;
import com.google.firebase.messaging.Constants;
import com.kubi.credential.exception.GetCredentialException;
import com.kubi.network.retrofit.exception.ApiException;
import com.kubi.otc.entity.OtcAd;
import com.kubi.p110rn.core.turbo.NativeAuthTurboModuleAbs;
import com.kubi.router.utils.RouteExKt;
import com.kubi.safe.api.service.ISafeService;
import com.kubi.sdk.base.entity.BaseEntity;
import com.kubi.sdk.site.C24129b;
import com.kubi.sdk.site.SiteVisibleConfigKey;
import com.kubi.user.exception.UserCenterExtAccountMessage;
import com.kubi.user.google.GoogleSignInAvailability;
import com.tencent.qcloud.tuicore.TUIConstants;
import cy.InterfaceC36555b;
import f00.C37304a;
import g00.InterfaceC37764p;
import io.reactivex.Observable;
import io.reactivex.functions.Consumer;
import java.util.HashMap;
import java.util.Map;
import kotlinx.coroutines.C41696j;
import o00.C42916f;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p481ny.C42899b;
import p569qq.C43846g;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;
import ro.C44128b;

/* JADX INFO: compiled from: KCTurboUserCenterAuth.kt */
/* JADX INFO: loaded from: classes53.dex */
@Metadata(m90083d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\u0002\b\u0007\u0018\u0000 $2\u00020\u0001:\u0001$B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001e\u0010\u0006\u001a\u00020\u00072\u0014\u0010\b\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0004\u0012\u00020\u00070\tH\u0016J\u001e\u0010\u000b\u001a\u00020\u00072\u0014\u0010\b\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0004\u0012\u00020\u00070\tH\u0016J0\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0014\u0010\b\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0012\u0004\u0012\u00020\u00070\tH\u0017J0\u0010\u0011\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0014\u0010\b\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0004\u0012\u00020\u00070\tH\u0017J\u000f\u0010\u0012\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0002\u0010\u0013J&\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u000e2\u0014\u0010\b\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\u0004\u0012\u00020\u00070\tH\u0016J&\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u000e2\u0014\u0010\b\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0004\u0012\u00020\u00070\tH\u0016J\u001e\u0010\u0017\u001a\u00020\u00072\u0014\u0010\b\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0004\u0012\u00020\u00070\tH\u0016J\u001e\u0010\u0018\u001a\u00020\u00072\u0014\u0010\b\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0004\u0012\u00020\u00070\tH\u0016J\u000f\u0010\u0019\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0002\u0010\u0013J\u001e\u0010\u001a\u001a\u00020\u00072\u0014\u0010\b\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0004\u0012\u00020\u00070\tH\u0016J\u0018\u0010\u001b\u001a\u00020\n*\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e0\u001cH\u0002J\u0018\u0010\u001d\u001a\u00020\u001e*\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e0\u001cH\u0002J\u0018\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u000e2\u0006\u0010!\u001a\u00020\u000eH\u0002J\f\u0010\"\u001a\u00020\u001e*\u00020#H\u0002¨\u0006%"}, m90084d2 = {"Lcom/kubi/user/jsapi/KCTurboUserCenterAuth;", "Lcom/kubi/rn/core/turbo/NativeAuthTurboModuleAbs;", "ctx", "Lcom/facebook/react/bridge/ReactApplicationContext;", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "appleAuthorize", "", TUIConstants.TUIChat.CALL_BACK, "Lkotlin/Function1;", "Lcom/facebook/react/bridge/ReadableMap;", "appleAuthorizeV2", "captchaAuthorize", "bizType", "", "overrideHeaderAppToken", "", "captchaAuthorizeV2", "isPasskeyEnabled", "()Ljava/lang/Boolean;", "passkeyAuthorize", "options", "passkeyAuthorizeV2", "telegramAuthorize", "telegramAuthorizeV2", "isGoogleSignInAvailable", "googleAuthorizeV2", "toReadableMap", "", "toWritableMap", "Lcom/facebook/react/bridge/WritableMap;", "authFail", "code", "msg", "toAuthFailMap", "", "Companion", "UserCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@AutoService({NativeAuthTurboModuleAbs.class})
@SourceDebugExtension({"SMAP\nKCTurboUserCenterAuth.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KCTurboUserCenterAuth.kt\ncom/kubi/user/jsapi/KCTurboUserCenterAuth\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 4 UserCenterIssue.kt\ncom/kubi/user/exception/UserCenterIssueKt\n*L\n1#1,347:1\n1#2:348\n216#3,2:349\n76#4,2:351\n*S KotlinDebug\n*F\n+ 1 KCTurboUserCenterAuth.kt\ncom/kubi/user/jsapi/KCTurboUserCenterAuth\n*L\n317#1:349,2\n305#1:351,2\n*E\n"})
public final class KCTurboUserCenterAuth extends NativeAuthTurboModuleAbs {

    @Deprecated
    @NotNull
    public static final String CODE_PASSKEY_CREDENTIAL_EMPTY = "84723";

    @NotNull
    private static final Companion Companion = new Companion(null);

    @Deprecated
    @NotNull
    public static final String MSG_NO_ACTIVITY = "no_activity";

    @Deprecated
    @NotNull
    public static final String MSG_PASSKEY_CREDENTIAL_EMPTY = "credential_empty";

    /* JADX INFO: compiled from: KCTurboUserCenterAuth.kt */
    @Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, m90084d2 = {"Lcom/kubi/user/jsapi/KCTurboUserCenterAuth$Companion;", "", "<init>", "()V", "CODE_PASSKEY_CREDENTIAL_EMPTY", "", "MSG_PASSKEY_CREDENTIAL_EMPTY", "MSG_NO_ACTIVITY", "UserCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit captchaAuthorize$lambda$3(Function1 function1, Throwable th2) {
        function1.invoke(null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit passkeyAuthorize$lambda$11(Function1 function1) {
        function1.invoke(null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void telegramAuthorize$lambda$14(Function1 function1, KCTurboUserCenterAuth kCTurboUserCenterAuth, int i11, Intent intent) {
        if (i11 != 0) {
            function1.invoke(null);
        } else {
            HashMap map = intent != null ? (HashMap) RouteExKt.m56276u(intent, "user") : null;
            function1.invoke(map != null ? kCTurboUserCenterAuth.toReadableMap(map) : null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void telegramAuthorizeV2$lambda$18(Function1 function1, KCTurboUserCenterAuth kCTurboUserCenterAuth, int i11, Intent intent) {
        String str = null;
        HashMap map = intent != null ? (HashMap) RouteExKt.m56276u(intent, "user") : null;
        if (i11 == 0 && map != null && !map.isEmpty()) {
            WritableMap writableMapCreateMap = Arguments.createMap();
            writableMapCreateMap.putMap("extInfo", kCTurboUserCenterAuth.toWritableMap(map));
            function1.invoke(writableMapCreateMap);
            return;
        }
        if (i11 != 1) {
            function1.invoke(kCTurboUserCenterAuth.authFail(OtcAd.KYC_NOT_PASS, "user_cancel"));
            return;
        }
        String strM56282x = intent != null ? RouteExKt.m56282x(intent, Constants.IPC_BUNDLE_KEY_SEND_ERROR, "") : null;
        if (strM56282x == null) {
            strM56282x = "";
        }
        String strM56282x2 = intent != null ? RouteExKt.m56282x(intent, "errorCode", "") : null;
        String str2 = strM56282x2 != null ? strM56282x2 : "";
        if (str2.length() > 0 && !Intrinsics.areEqual(str2, OtcAd.KYC_NOT_PASS)) {
            str = str2;
        }
        if (str == null) {
            str = "telegram_auth_error";
        }
        if (strM56282x.length() == 0) {
            strM56282x = "telegram_auth_error";
        }
        function1.invoke(kCTurboUserCenterAuth.authFail(str, strM56282x));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KCTurboUserCenterAuth(@NotNull ReactApplicationContext ctx) {
        super(ctx);
        Intrinsics.checkNotNullParameter(ctx, "ctx");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit captchaAuthorize$lambda$1(Function1 function1, BaseEntity baseEntity) {
        function1.invoke(Boolean.TRUE);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit googleAuthorizeV2$lambda$19(Function1 function1, KCTurboUserCenterAuth kCTurboUserCenterAuth, FragmentActivity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        C41696j.m91104d(LifecycleOwnerKt.getLifecycleScope(activity), null, null, new KCTurboUserCenterAuth$googleAuthorizeV2$1$1(activity, function1, kCTurboUserCenterAuth, null), 3, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit googleAuthorizeV2$lambda$20(Function1 function1, KCTurboUserCenterAuth kCTurboUserCenterAuth) {
        C44128b.m97261e("GoogleAuthorizeV2", "googleAuthorizeV2 no_activity");
        C43846g.m96568c(new UserCenterExtAccountMessage(MSG_NO_ACTIVITY, "GoogleAuthorizeV2", false, 4, null), null, 2, null);
        function1.invoke(kCTurboUserCenterAuth.authFail(OtcAd.KYC_NOT_PASS, MSG_NO_ACTIVITY));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit passkeyAuthorize$lambda$10(String str, Function1 function1, FragmentActivity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        C41696j.m91104d(LifecycleOwnerKt.getLifecycleScope(activity), null, null, new KCTurboUserCenterAuth$passkeyAuthorize$1$1(activity, str, function1, null), 3, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit passkeyAuthorizeV2$lambda$12(String str, Function1 function1, KCTurboUserCenterAuth kCTurboUserCenterAuth, FragmentActivity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        C41696j.m91104d(LifecycleOwnerKt.getLifecycleScope(activity), null, null, new KCTurboUserCenterAuth$passkeyAuthorizeV2$1$1(activity, str, function1, kCTurboUserCenterAuth, null), 3, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit passkeyAuthorizeV2$lambda$13(Function1 function1, KCTurboUserCenterAuth kCTurboUserCenterAuth) {
        function1.invoke(kCTurboUserCenterAuth.authFail(OtcAd.KYC_NOT_PASS, MSG_NO_ACTIVITY));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final WritableMap toAuthFailMap(Throwable th2) {
        boolean z11 = th2 instanceof GetCredentialException;
        String str = OtcAd.KYC_NOT_PASS;
        if (z11 && Intrinsics.areEqual(((GetCredentialException) th2).getType(), "android.credentials.GetCredentialException.TYPE_USER_CANCELED")) {
            return authFail(OtcAd.KYC_NOT_PASS, "user_cancel");
        }
        String message = th2.getMessage();
        if (message == null) {
            message = "";
        }
        if (StringsKt.contains((CharSequence) message, (CharSequence) "user cancel", true)) {
            return authFail(OtcAd.KYC_NOT_PASS, message.length() != 0 ? message : "user_cancel");
        }
        if (th2 instanceof ApiException) {
            String str2 = ((ApiException) th2).code;
            String str3 = str2 != null ? str2 : "";
            if (str3.length() != 0) {
                str = str3;
            }
            return authFail(str, message);
        }
        if (!(th2 instanceof GetCredentialException)) {
            if (message.length() == 0) {
                message = "unknown";
            }
            return authFail(OtcAd.KYC_NOT_PASS, message);
        }
        GetCredentialException getCredentialException = (GetCredentialException) th2;
        String type = getCredentialException.getType();
        if (type.length() != 0) {
            str = type;
        }
        if (message.length() == 0) {
            message = getCredentialException.getType();
        }
        return authFail(str, message);
    }

    @Override // com.kubi.p110rn.core.turbo.NativeAuthTurboModuleAbs
    public void appleAuthorize(@NotNull Function1<? super ReadableMap, Unit> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        callback.invoke(null);
    }

    @Override // com.kubi.p110rn.core.turbo.NativeAuthTurboModuleAbs
    public void appleAuthorizeV2(@NotNull Function1<? super ReadableMap, Unit> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        callback.invoke(authFail(OtcAd.KYC_NOT_PASS, "not_supported"));
    }

    @Override // com.kubi.p110rn.core.turbo.NativeAuthTurboModuleAbs
    @SuppressLint({"CheckResult"})
    public void captchaAuthorize(@NotNull String bizType, @Nullable String overrideHeaderAppToken, @NotNull final Function1<? super Boolean, Unit> callback) {
        Intrinsics.checkNotNullParameter(bizType, "bizType");
        Intrinsics.checkNotNullParameter(callback, "callback");
        BaseEntity baseEntity = new BaseEntity();
        baseEntity.setCode("40011");
        ISafeService iSafeService = ISafeService.f46324a.get();
        Observable observableJust = Observable.just(baseEntity);
        Intrinsics.checkNotNullExpressionValue(observableJust, "just(...)");
        Observable observableObserveOn = ISafeService.m56308n(iSafeService, bizType, observableJust, null, overrideHeaderAppToken, 4, null).observeOn(C42916f.m94128g());
        final Function1 function1 = new Function1() { // from class: com.kubi.user.jsapi.h
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return KCTurboUserCenterAuth.captchaAuthorize$lambda$1(callback, (BaseEntity) obj);
            }
        };
        Consumer consumer = new Consumer() { // from class: com.kubi.user.jsapi.i
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                function1.invoke(obj);
            }
        };
        final Function1 function2 = new Function1() { // from class: com.kubi.user.jsapi.j
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return KCTurboUserCenterAuth.captchaAuthorize$lambda$3(callback, (Throwable) obj);
            }
        };
        observableObserveOn.subscribe(consumer, new Consumer() { // from class: com.kubi.user.jsapi.k
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                function2.invoke(obj);
            }
        });
    }

    @Override // com.kubi.p110rn.core.turbo.NativeAuthTurboModuleAbs
    @SuppressLint({"CheckResult"})
    public void captchaAuthorizeV2(@NotNull String bizType, @Nullable String overrideHeaderAppToken, @NotNull final Function1<? super ReadableMap, Unit> callback) {
        Intrinsics.checkNotNullParameter(bizType, "bizType");
        Intrinsics.checkNotNullParameter(callback, "callback");
        BaseEntity baseEntity = new BaseEntity();
        baseEntity.setCode("40011");
        ISafeService iSafeService = ISafeService.f46324a.get();
        Observable observableJust = Observable.just(baseEntity);
        Intrinsics.checkNotNullExpressionValue(observableJust, "just(...)");
        Observable observableObserveOn = ISafeService.m56308n(iSafeService, bizType, observableJust, null, overrideHeaderAppToken, 4, null).observeOn(C42916f.m94128g());
        final Function1 function1 = new Function1() { // from class: com.kubi.user.jsapi.s
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return KCTurboUserCenterAuth.captchaAuthorizeV2$lambda$6(callback, (BaseEntity) obj);
            }
        };
        Consumer consumer = new Consumer() { // from class: com.kubi.user.jsapi.t
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                function1.invoke(obj);
            }
        };
        final Function1 function2 = new Function1() { // from class: com.kubi.user.jsapi.u
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return KCTurboUserCenterAuth.captchaAuthorizeV2$lambda$8(callback, this, (Throwable) obj);
            }
        };
        observableObserveOn.subscribe(consumer, new Consumer() { // from class: com.kubi.user.jsapi.v
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                function2.invoke(obj);
            }
        });
    }

    @Override // com.kubi.p110rn.core.turbo.NativeAuthTurboModuleAbs
    public void googleAuthorizeV2(@NotNull final Function1<? super ReadableMap, Unit> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        C42899b.m94074d(new Function1() { // from class: com.kubi.user.jsapi.l
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return KCTurboUserCenterAuth.googleAuthorizeV2$lambda$19(callback, this, (FragmentActivity) obj);
            }
        }, new Function0() { // from class: com.kubi.user.jsapi.m
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return KCTurboUserCenterAuth.googleAuthorizeV2$lambda$20(callback, this);
            }
        });
    }

    @Override // com.kubi.p110rn.core.turbo.NativeAuthTurboModuleAbs
    @Nullable
    public Boolean isGoogleSignInAvailable() {
        try {
            GoogleSignInAvailability googleSignInAvailability = GoogleSignInAvailability.f53666a;
            ReactApplicationContext reactApplicationContext = getReactApplicationContext();
            Intrinsics.checkNotNullExpressionValue(reactApplicationContext, "getReactApplicationContext(...)");
            return Boolean.valueOf(googleSignInAvailability.m65489b(reactApplicationContext));
        } catch (Exception unused) {
            return Boolean.FALSE;
        }
    }

    @Override // com.kubi.p110rn.core.turbo.NativeAuthTurboModuleAbs
    @Nullable
    public Boolean isPasskeyEnabled() {
        try {
            return Boolean.valueOf(com.kubi.user.loginv2.p.a.e() && C24129b.m58030b(SiteVisibleConfigKey.PassKey));
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.kubi.p110rn.core.turbo.NativeAuthTurboModuleAbs
    public void passkeyAuthorize(@NotNull final String options, @NotNull final Function1<? super String, Unit> callback) {
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(callback, "callback");
        C42899b.m94074d(new Function1() { // from class: com.kubi.user.jsapi.q
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return KCTurboUserCenterAuth.passkeyAuthorize$lambda$10(options, callback, (FragmentActivity) obj);
            }
        }, new Function0() { // from class: com.kubi.user.jsapi.r
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return KCTurboUserCenterAuth.passkeyAuthorize$lambda$11(callback);
            }
        });
    }

    @Override // com.kubi.p110rn.core.turbo.NativeAuthTurboModuleAbs
    public void passkeyAuthorizeV2(@NotNull final String options, @NotNull final Function1<? super ReadableMap, Unit> callback) {
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(callback, "callback");
        C42899b.m94074d(new Function1() { // from class: com.kubi.user.jsapi.o
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return KCTurboUserCenterAuth.passkeyAuthorizeV2$lambda$12(options, callback, this, (FragmentActivity) obj);
            }
        }, new Function0() { // from class: com.kubi.user.jsapi.p
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return KCTurboUserCenterAuth.passkeyAuthorizeV2$lambda$13(callback, this);
            }
        });
    }

    @Override // com.kubi.p110rn.core.turbo.NativeAuthTurboModuleAbs
    public void telegramAuthorize(@NotNull final Function1<? super ReadableMap, Unit> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        InterfaceC37764p.a.m85186g(C37304a.f82764a, null, null, new InterfaceC36555b() { // from class: com.kubi.user.jsapi.g
            @Override // cy.InterfaceC36555b
            /* JADX INFO: renamed from: a */
            public final void mo4404a(int i11, Intent intent) {
                KCTurboUserCenterAuth.telegramAuthorize$lambda$14(callback, this, i11, intent);
            }
        }, 3, null);
    }

    @Override // com.kubi.p110rn.core.turbo.NativeAuthTurboModuleAbs
    public void telegramAuthorizeV2(@NotNull final Function1<? super ReadableMap, Unit> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        InterfaceC37764p.a.m85186g(C37304a.f82764a, null, null, new InterfaceC36555b() { // from class: com.kubi.user.jsapi.n
            @Override // cy.InterfaceC36555b
            /* JADX INFO: renamed from: a */
            public final void mo4404a(int i11, Intent intent) {
                KCTurboUserCenterAuth.telegramAuthorizeV2$lambda$18(callback, this, i11, intent);
            }
        }, 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final WritableMap authFail(String code, String msg) {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putString("code", code);
        writableMapCreateMap.putString("msg", msg);
        Intrinsics.checkNotNullExpressionValue(writableMapCreateMap, "apply(...)");
        return writableMapCreateMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit captchaAuthorizeV2$lambda$6(Function1 function1, BaseEntity baseEntity) {
        function1.invoke(Arguments.createMap());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit captchaAuthorizeV2$lambda$8(Function1 function1, KCTurboUserCenterAuth kCTurboUserCenterAuth, Throwable th2) {
        Intrinsics.checkNotNull(th2);
        function1.invoke(kCTurboUserCenterAuth.toAuthFailMap(th2));
        return Unit.INSTANCE;
    }

    private final ReadableMap toReadableMap(Map<String, String> map) {
        return toWritableMap(map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final WritableMap toWritableMap(Map<String, String> map) {
        WritableMap writableMapCreateMap = Arguments.createMap();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            writableMapCreateMap.putString(entry.getKey(), entry.getValue());
        }
        Intrinsics.checkNotNullExpressionValue(writableMapCreateMap, "apply(...)");
        return writableMapCreateMap;
    }
}
