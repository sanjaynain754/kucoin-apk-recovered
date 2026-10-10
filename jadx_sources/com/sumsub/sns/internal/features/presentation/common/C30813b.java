package com.sumsub.sns.internal.features.presentation.common;

import android.widget.EditText;
import com.sumsub.sns.core.widget.SNSTextInputLayout;
import com.sumsub.sns.internal.features.data.repository.dynamic.C29983l;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.common.b */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30813b extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public int f62246a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ AbstractC30815c f62247b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ SNSTextInputLayout f62248c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30813b(AbstractC30815c abstractC30815c, SNSTextInputLayout sNSTextInputLayout, Continuation continuation) {
        super(2, continuation);
        this.f62247b = abstractC30815c;
        this.f62248c = sNSTextInputLayout;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C30813b(this.f62247b, this.f62248c, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C30813b(this.f62247b, this.f62248c, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String strM70061a;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f62246a;
        if (i11 != 0) {
            if (i11 == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            AbstractC30815c abstractC30815c = this.f62247b;
            this.f62246a = 1;
            obj = abstractC30815c.m70480a(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        C29983l c29983l = (C29983l) obj;
        if (c29983l != null) {
            strM70061a = c29983l.m70061a("sns_countries_search_placeholder");
        } else {
            strM70061a = null;
        }
        EditText editText = this.f62248c.getEditText();
        if (editText != null) {
            editText.setHint(strM70061a);
        }
        return Unit.INSTANCE;
    }
}
