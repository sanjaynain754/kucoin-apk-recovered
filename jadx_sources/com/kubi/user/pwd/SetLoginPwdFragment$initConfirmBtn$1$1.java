package com.kubi.user.pwd;

import androidx.fragment.app.FragmentActivity;
import c70.C4865d;
import com.kubi.user.R$string;
import com.kubi.utils.ToastCompat;
import kotlinx.coroutines.InterfaceC41709m0;
import p569qq.C43852m;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: SetLoginPwdFragment.kt */
/* JADX INFO: loaded from: classes53.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.user.pwd.SetLoginPwdFragment$initConfirmBtn$1$1", m90122f = "SetLoginPwdFragment.kt", m90123i = {}, m90124l = {92}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class SetLoginPwdFragment$initConfirmBtn$1$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ FragmentActivity $activity;
    final /* synthetic */ C4865d $binding;
    final /* synthetic */ String $pwd;
    int label;
    final /* synthetic */ SetLoginPwdFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SetLoginPwdFragment$initConfirmBtn$1$1(C4865d c4865d, SetLoginPwdFragment setLoginPwdFragment, FragmentActivity fragmentActivity, String str, Continuation<? super SetLoginPwdFragment$initConfirmBtn$1$1> continuation) {
        super(2, continuation);
        this.$binding = c4865d;
        this.this$0 = setLoginPwdFragment;
        this.$activity = fragmentActivity;
        this.$pwd = str;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SetLoginPwdFragment$initConfirmBtn$1$1(this.$binding, this.this$0, this.$activity, this.$pwd, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((SetLoginPwdFragment$initConfirmBtn$1$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String str;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            this.$binding.f5061b.f5100c.setEnabled(false);
            this.$binding.f5062c.f5100c.setEnabled(false);
            this.$binding.f5063d.m55043o();
            SetLoginPwdVM setLoginPwdVMM65720u3 = this.this$0.m65720u3();
            FragmentActivity fragmentActivity = this.$activity;
            String str2 = this.$pwd;
            this.label = 1;
            obj = setLoginPwdVMM65720u3.m65725r(fragmentActivity, str2, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        this.$binding.f5063d.mo28851l();
        this.$binding.f5061b.f5100c.setEnabled(true);
        this.$binding.f5062c.f5100c.setEnabled(true);
        if (zBooleanValue) {
            str = "success";
        } else {
            str = "failed";
        }
        C43852m.m96591c("B1setLoginPassword", "submit", str, null, 8, null);
        if (zBooleanValue) {
            ToastCompat.m66437C(R$string.common_setting_successful);
            this.this$0.preformBackPressed();
        }
        return Unit.INSTANCE;
    }
}
