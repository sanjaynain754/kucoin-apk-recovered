package com.sumsub.sns.internal.features.presentation.preview.ekyc;

import com.sumsub.sns.core.data.listener.SNSIconHandler;
import com.sumsub.sns.internal.core.common.AbstractC28476n;
import com.sumsub.sns.internal.features.data.repository.dynamic.C29983l;
import java.io.Serializable;
import java.util.Arrays;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.StringCompanionObject;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.preview.ekyc.I */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31521I extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public CharSequence f63960a;

    /* JADX INFO: renamed from: b */
    public Serializable f63961b;

    /* JADX INFO: renamed from: c */
    public String f63962c;

    /* JADX INFO: renamed from: d */
    public int f63963d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C31707h0 f63964e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ Exception f63965f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31521I(C31707h0 c31707h0, Exception exc, Continuation continuation) {
        super(2, continuation);
        this.f63964e = c31707h0;
        this.f63965f = exc;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C31521I(this.f63964e, this.f63965f, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C31521I(this.f63964e, this.f63965f, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x008f  */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Throwable th2;
        CharSequence charSequence;
        String strM69377a;
        String imageName;
        Object string;
        String str;
        CharSequence charSequence2;
        CharSequence charSequence3;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f63963d;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 == 3) {
                        str = this.f63962c;
                        CharSequence charSequence4 = (CharSequence) this.f63961b;
                        charSequence2 = this.f63960a;
                        ResultKt.throwOnFailure(obj);
                        charSequence3 = charSequence4;
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    th2 = (Throwable) this.f63961b;
                    charSequence = this.f63960a;
                    ResultKt.throwOnFailure(obj);
                    strM69377a = AbstractC28476n.m69377a(th2, (C29983l) obj);
                    imageName = SNSIconHandler.SNSResultIcons.FAILURE.getImageName();
                    C31707h0 c31707h0 = this.f63964e;
                    this.f63960a = charSequence;
                    this.f63961b = strM69377a;
                    this.f63962c = imageName;
                    this.f63963d = 3;
                    string = c31707h0.getString("sns_confirmation_result_action_tryAgain", this);
                    if (string != coroutine_suspended) {
                        str = imageName;
                        obj = string;
                        charSequence2 = charSequence;
                        charSequence3 = strM69377a;
                    }
                    return coroutine_suspended;
                }
            } else {
                ResultKt.throwOnFailure(obj);
            }
            return new C31513A(charSequence2, charSequence3, str, (CharSequence) obj);
        }
        ResultKt.throwOnFailure(obj);
        C31707h0 c31707h1 = this.f63964e;
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str2 = String.format("sns_confirmation_result_%s_failure_title", Arrays.copyOf(new Object[]{"ekyc"}, 1));
        this.f63963d = 1;
        obj = c31707h1.getString(str2, this);
        if (obj != coroutine_suspended) {
        }
        return coroutine_suspended;
        String str3 = (String) obj;
        if (str3 == null) {
            str3 = "Error";
        }
        th2 = this.f63965f;
        C31707h0 c31707h2 = this.f63964e;
        this.f63960a = str3;
        this.f63961b = th2;
        this.f63963d = 2;
        Object strings = c31707h2.getStrings(this);
        if (strings != coroutine_suspended) {
            charSequence = str3;
            obj = strings;
            strM69377a = AbstractC28476n.m69377a(th2, (C29983l) obj);
            imageName = SNSIconHandler.SNSResultIcons.FAILURE.getImageName();
            C31707h0 c31707h3 = this.f63964e;
            this.f63960a = charSequence;
            this.f63961b = strM69377a;
            this.f63962c = imageName;
            this.f63963d = 3;
            string = c31707h3.getString("sns_confirmation_result_action_tryAgain", this);
            if (string != coroutine_suspended) {
                str = imageName;
                obj = string;
                charSequence2 = charSequence;
                charSequence3 = strM69377a;
                return new C31513A(charSequence2, charSequence3, str, (CharSequence) obj);
            }
        }
        return coroutine_suspended;
    }
}
