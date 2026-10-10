package com.kubi.user.pwd;

import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.ViewModel;
import com.kubi.data.constance.ValidationBizEnum;
import com.kubi.network.retrofit.exception.ApiException;
import com.kubi.p110rn.Constants;
import com.kubi.user.config.LoginInfoConfig;
import com.kubi.user.exception.UserCenterException;
import com.kubi.utils.C27052h0;
import com.kubi.utils.ToastCompat;
import d70.C36638a;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.C41686h;
import mr.C42597a;
import o00.C42911a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p481ny.C42899b;
import p569qq.C43846g;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import ro.C44128b;

/* JADX INFO: compiled from: SetLoginPwdVM.kt */
/* JADX INFO: loaded from: classes53.dex */
@Metadata(m90083d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0082@¢\u0006\u0002\u0010\u0011J\u001e\u0010\u0012\u001a\u00020\u00132\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\fH\u0086@¢\u0006\u0002\u0010\u0015R#\u0010\u0004\u001a\n \u0006*\u0004\u0018\u00010\u00050\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\b¨\u0006\u0017"}, m90084d2 = {"Lcom/kubi/user/pwd/SetLoginPwdVM;", "Landroidx/lifecycle/ViewModel;", "<init>", "()V", "api", "Lcom/kubi/user/api/LoginPasswordApi;", "kotlin.jvm.PlatformType", "getApi", "()Lcom/kubi/user/api/LoginPasswordApi;", "api$delegate", "Lkotlin/Lazy;", "safeValidation", "", "activity", "Landroidx/fragment/app/FragmentActivity;", Constants.BIZ, "Lcom/kubi/data/constance/ValidationBizEnum;", "(Landroidx/fragment/app/FragmentActivity;Lcom/kubi/data/constance/ValidationBizEnum;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sumitPwd", "", "pwd", "(Landroidx/fragment/app/FragmentActivity;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "UserCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nSetLoginPwdVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SetLoginPwdVM.kt\ncom/kubi/user/pwd/SetLoginPwdVM\n+ 2 UserCenterIssue.kt\ncom/kubi/user/exception/UserCenterIssueKt\n*L\n1#1,103:1\n57#2,8:104\n*S KotlinDebug\n*F\n+ 1 SetLoginPwdVM.kt\ncom/kubi/user/pwd/SetLoginPwdVM\n*L\n98#1:104,8\n*E\n"})
public final class SetLoginPwdVM extends ViewModel {

    /* JADX INFO: renamed from: W */
    @NotNull
    public static final Companion f53801W = new Companion(null);

    /* JADX INFO: renamed from: V */
    @NotNull
    public final Lazy f53802V = LazyKt.lazy(new Function0() { // from class: com.kubi.user.pwd.i
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return SetLoginPwdVM.m65722o();
        }
    });

    /* JADX INFO: compiled from: SetLoginPwdVM.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m90084d2 = {"Lcom/kubi/user/pwd/SetLoginPwdVM$Companion;", "", "<init>", "()V", "TAG", "", "UserCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: p */
    public final com.kubi.user.api.j m65723p() {
        return (com.kubi.user.api.j) this.f53802V.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00ad, code lost:
    
        if (r12.a(r11, r0, r2) == r3) goto L32;
     */
    @Nullable
    /* JADX INFO: renamed from: r */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m65725r(@NotNull FragmentActivity fragmentActivity, @NotNull String str, @NotNull Continuation<? super Boolean> continuation) {
        SetLoginPwdVM$sumitPwd$1 setLoginPwdVM$sumitPwd$1;
        String str2;
        FragmentActivity fragmentActivity2;
        if (continuation instanceof SetLoginPwdVM$sumitPwd$1) {
            setLoginPwdVM$sumitPwd$1 = (SetLoginPwdVM$sumitPwd$1) continuation;
            int i11 = setLoginPwdVM$sumitPwd$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                setLoginPwdVM$sumitPwd$1.label = i11 - Integer.MIN_VALUE;
            } else {
                setLoginPwdVM$sumitPwd$1 = new SetLoginPwdVM$sumitPwd$1(this, continuation);
            }
        } else {
            setLoginPwdVM$sumitPwd$1 = new SetLoginPwdVM$sumitPwd$1(this, continuation);
        }
        Object objM65724q = setLoginPwdVM$sumitPwd$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = setLoginPwdVM$sumitPwd$1.label;
        boolean z11 = true;
        try {
            if (i12 == 0) {
                ResultKt.throwOnFailure(objM65724q);
                ValidationBizEnum validationBizEnum = ValidationBizEnum.RV_LOGIN_PWD_SET;
                setLoginPwdVM$sumitPwd$1.L$0 = SpillingKt.nullOutSpilledVariable(fragmentActivity);
                str2 = str;
                setLoginPwdVM$sumitPwd$1.L$1 = str2;
                setLoginPwdVM$sumitPwd$1.label = 1;
                fragmentActivity2 = fragmentActivity;
                objM65724q = m65724q(fragmentActivity2, validationBizEnum, setLoginPwdVM$sumitPwd$1);
                if (objM65724q != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i12 == 1) {
                str2 = (String) setLoginPwdVM$sumitPwd$1.L$1;
                fragmentActivity2 = (FragmentActivity) setLoginPwdVM$sumitPwd$1.L$0;
                ResultKt.throwOnFailure(objM65724q);
            } else {
                if (i12 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objM65724q);
            }
            LoginInfoConfig.f0(LoginInfoConfig.a, (Function0) null, 1, (Object) null);
            return Boxing.boxBoolean(z11);
            String str3 = (String) objM65724q;
            if (str3 == null || str3.length() == 0) {
                C44128b.m97266j("SetLoginPwdVM", "validationToken is null or empty");
                return Boxing.boxBoolean(false);
            }
            String strM66729d = C27052h0.m66729d(str2, 2);
            com.kubi.user.api.j jVarM65723p = m65723p();
            Intrinsics.checkNotNull(strM66729d);
            setLoginPwdVM$sumitPwd$1.L$0 = SpillingKt.nullOutSpilledVariable(fragmentActivity2);
            setLoginPwdVM$sumitPwd$1.L$1 = SpillingKt.nullOutSpilledVariable(str2);
            setLoginPwdVM$sumitPwd$1.L$2 = SpillingKt.nullOutSpilledVariable(str3);
            setLoginPwdVM$sumitPwd$1.L$3 = SpillingKt.nullOutSpilledVariable(strM66729d);
            setLoginPwdVM$sumitPwd$1.label = 2;
        } catch (ApiException e11) {
            ToastCompat.m66441G(e11.getMessage(), new Object[0]);
            C44128b.m97263g("SetLoginPwdVM", e11);
            z11 = false;
        } catch (CancellationException unused) {
            z11 = false;
        } catch (Throwable th2) {
            if (!C42899b.m94075e(th2)) {
                if (C36638a.m81972c(th2)) {
                    C43846g.m96568c(new UserCenterException(th2, "SetLoginPwdVM", true, null, 8, null), null, 2, null);
                } else {
                    C36638a.m81973d(th2, "SetLoginPwdVM");
                }
            }
            z11 = false;
        }
    }

    /* JADX INFO: renamed from: o */
    public static final com.kubi.user.api.j m65722o() {
        return (com.kubi.user.api.j) C42597a.m93388d().create(com.kubi.user.api.j.class);
    }

    /* JADX INFO: renamed from: q */
    public final Object m65724q(FragmentActivity fragmentActivity, ValidationBizEnum validationBizEnum, Continuation<? super String> continuation) {
        return C41686h.m91049g(C42911a.m94121c(), new SetLoginPwdVM$safeValidation$2(fragmentActivity, validationBizEnum, null), continuation);
    }
}
