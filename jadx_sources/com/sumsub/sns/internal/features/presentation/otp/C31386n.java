package com.sumsub.sns.internal.features.presentation.otp;

import android.os.Bundle;
import com.sumsub.sns.internal.core.presentation.screen.C28942c;
import com.sumsub.sns.internal.core.presentation.screen.C28943d;
import java.util.Arrays;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.StringCompanionObject;
import p852kotlin.reflect.KProperty;
import p852kotlin.text.StringsKt;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.otp.n */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31386n extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public int f63603a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C31389q f63604b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f63605c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ String f63606d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31386n(C31389q c31389q, String str, String str2, Continuation continuation) {
        super(2, continuation);
        this.f63604b = c31389q;
        this.f63605c = str;
        this.f63606d = str2;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C31386n(this.f63604b, this.f63605c, this.f63606d, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C31386n) create((C31383k) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String string;
        Object string2;
        C28942c c28942c;
        Integer num;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f63603a;
        if (i11 == 0) {
            ResultKt.throwOnFailure(obj);
            C31389q c31389q = this.f63604b;
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            KProperty[] kPropertyArr = C31389q.f63612d;
            Bundle bundle = c31389q.f63613a;
            if (bundle == null || (string = bundle.getString("arg_strings_key")) == null) {
                string = "default";
            }
            String str = String.format("sns_confirmation_code_%s_title", Arrays.copyOf(new Object[]{string}, 1));
            this.f63603a = 1;
            string2 = c31389q.getString(str, this);
            if (string2 == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            string2 = obj;
        }
        String str2 = (String) string2;
        String strReplace$default = StringsKt.replace$default(StringsKt.replace$default(this.f63605c, "{phone}", this.f63606d, false, 4, (Object) null), "{email}", this.f63606d, false, 4, (Object) null);
        C31389q c31389q2 = this.f63604b;
        KProperty[] kPropertyArr2 = C31389q.f63612d;
        C28943d c28943dM70704f = c31389q2.m70704f();
        int iIntValue = (c28943dM70704f == null || (c28942c = c28943dM70704f.f58845b) == null || (num = c28942c.f58842a) == null) ? 6 : num.intValue();
        C28943d c28943dM70704f2 = this.f63604b.m70704f();
        return new C31383k(iIntValue, str2, strReplace$default, null, c28943dM70704f2 != null ? c28943dM70704f2.f58846c : null, false);
    }
}
