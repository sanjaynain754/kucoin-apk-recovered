package com.kubi.user.jsapi;

import androidx.fragment.app.FragmentActivity;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.kubi.user.exception.UserCenterException;
import com.kubi.user.google.GoogleSignInHelper;
import d70.C36638a;
import kotlinx.coroutines.InterfaceC41709m0;
import p481ny.C42899b;
import p569qq.C43846g;
import p852kotlin.Metadata;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.SourceDebugExtension;
import ro.C44128b;

/* JADX INFO: compiled from: KCTurboUserCenterAuth.kt */
/* JADX INFO: loaded from: classes53.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.user.jsapi.KCTurboUserCenterAuth$googleAuthorizeV2$1$1", m90122f = "KCTurboUserCenterAuth.kt", m90123i = {}, m90124l = {284}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
@SourceDebugExtension({"SMAP\nKCTurboUserCenterAuth.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KCTurboUserCenterAuth.kt\ncom/kubi/user/jsapi/KCTurboUserCenterAuth$googleAuthorizeV2$1$1\n+ 2 UserCenterIssue.kt\ncom/kubi/user/exception/UserCenterIssueKt\n*L\n1#1,347:1\n57#2,8:348\n*S KotlinDebug\n*F\n+ 1 KCTurboUserCenterAuth.kt\ncom/kubi/user/jsapi/KCTurboUserCenterAuth$googleAuthorizeV2$1$1\n*L\n298#1:348,8\n*E\n"})
public final class KCTurboUserCenterAuth$googleAuthorizeV2$1$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ FragmentActivity $activity;
    final /* synthetic */ Function1<ReadableMap, Unit> $callback;
    int label;
    final /* synthetic */ KCTurboUserCenterAuth this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public KCTurboUserCenterAuth$googleAuthorizeV2$1$1(FragmentActivity fragmentActivity, Function1<? super ReadableMap, Unit> function1, KCTurboUserCenterAuth kCTurboUserCenterAuth, Continuation<? super KCTurboUserCenterAuth$googleAuthorizeV2$1$1> continuation) {
        super(2, continuation);
        this.$activity = fragmentActivity;
        this.$callback = function1;
        this.this$0 = kCTurboUserCenterAuth;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new KCTurboUserCenterAuth$googleAuthorizeV2$1$1(this.$activity, this.$callback, this.this$0, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((KCTurboUserCenterAuth$googleAuthorizeV2$1$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        try {
            if (i11 != 0) {
                if (i11 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                GoogleSignInHelper googleSignInHelper = GoogleSignInHelper.f53659a;
                FragmentActivity fragmentActivity = this.$activity;
                this.label = 1;
                obj = googleSignInHelper.m65477a(fragmentActivity, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            GoogleSignInHelper.AbstractC26709b abstractC26709b = (GoogleSignInHelper.AbstractC26709b) obj;
            if (abstractC26709b instanceof GoogleSignInHelper.AbstractC26709b.Success) {
                Function1<ReadableMap, Unit> function1 = this.$callback;
                WritableMap writableMapCreateMap = Arguments.createMap();
                writableMapCreateMap.putMap("extInfo", this.this$0.toWritableMap(((GoogleSignInHelper.AbstractC26709b.Success) abstractC26709b).getExtInfo().m65483a()));
                function1.invoke(writableMapCreateMap);
            } else if (abstractC26709b instanceof GoogleSignInHelper.AbstractC26709b.Failure) {
                this.$callback.invoke(this.this$0.authFail(((GoogleSignInHelper.AbstractC26709b.Failure) abstractC26709b).getCode(), ((GoogleSignInHelper.AbstractC26709b.Failure) abstractC26709b).getMsg()));
            } else {
                throw new NoWhenBranchMatchedException();
            }
        } catch (Exception e11) {
            C44128b.m97262f("GoogleAuthorizeV2", "googleAuthorizeV2 exception", e11);
            if (!C42899b.m94075e(e11)) {
                if (!C36638a.m81972c(e11)) {
                    C36638a.m81973d(e11, "GoogleAuthorizeV2");
                } else {
                    C43846g.m96568c(new UserCenterException(e11, "GoogleAuthorizeV2", true, null, 8, null), null, 2, null);
                }
            }
            Function1<ReadableMap, Unit> function2 = this.$callback;
            KCTurboUserCenterAuth kCTurboUserCenterAuth = this.this$0;
            String message = e11.getMessage();
            if (message == null) {
                message = "unknown";
            }
            function2.invoke(kCTurboUserCenterAuth.authFail("google_auth_error", message));
        }
        return Unit.INSTANCE;
    }
}
