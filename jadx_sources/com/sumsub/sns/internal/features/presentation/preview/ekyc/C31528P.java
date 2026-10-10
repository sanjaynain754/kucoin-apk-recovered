package com.sumsub.sns.internal.features.presentation.preview.ekyc;

import com.sumsub.sns.core.data.listener.SNSIconHandler;
import java.util.Arrays;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.StringCompanionObject;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.preview.ekyc.P */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31528P extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public String f63997a;

    /* JADX INFO: renamed from: b */
    public String f63998b;

    /* JADX INFO: renamed from: c */
    public int f63999c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C31707h0 f64000d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31528P(C31707h0 c31707h0, Continuation continuation) {
        super(2, continuation);
        this.f64000d = c31707h0;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C31528P(this.f64000d, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C31528P(this.f64000d, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String str;
        String str2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f63999c;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    str2 = this.f63998b;
                    str = this.f63997a;
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
            }
            return new C31513A(str, null, str2, (CharSequence) obj);
        }
        ResultKt.throwOnFailure(obj);
        C31707h0 c31707h0 = this.f64000d;
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str3 = String.format("sns_confirmation_result_%s_failure_title", Arrays.copyOf(new Object[]{"ekyc"}, 1));
        this.f63999c = 1;
        obj = c31707h0.getString(str3, this);
        if (obj != coroutine_suspended) {
        }
        return coroutine_suspended;
        String str4 = (String) obj;
        if (str4 == null) {
            str4 = "Error";
        }
        str = str4;
        String imageName = SNSIconHandler.SNSResultIcons.FAILURE.getImageName();
        C31707h0 c31707h1 = this.f64000d;
        this.f63997a = str;
        this.f63998b = imageName;
        this.f63999c = 2;
        Object string = c31707h1.getString("sns_confirmation_result_action_tryAgain", this);
        if (string != coroutine_suspended) {
            str2 = imageName;
            obj = string;
            return new C31513A(str, null, str2, (CharSequence) obj);
        }
        return coroutine_suspended;
    }
}
