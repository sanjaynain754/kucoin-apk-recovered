package com.sumsub.sns.internal.features.presentation.preview.ekyc.eid.main;

import com.sumsub.sns.core.presentation.base.AbstractC28052C;
import com.sumsub.sns.internal.features.data.model.common.C29095c0;
import com.sumsub.sns.internal.features.data.model.common.C29119g0;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.preview.ekyc.eid.main.J0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31577J0 extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public String f64117a;

    /* JADX INFO: renamed from: b */
    public String f64118b;

    /* JADX INFO: renamed from: c */
    public int f64119c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C31583M0 f64120d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ String f64121e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ String f64122f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ String f64123g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Throwable f64124h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ AbstractC31595T f64125i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31577J0(C31583M0 c31583m0, String str, String str2, String str3, Throwable th2, AbstractC31595T abstractC31595T, Continuation continuation) {
        super(2, continuation);
        this.f64120d = c31583m0;
        this.f64121e = str;
        this.f64122f = str2;
        this.f64123g = str3;
        this.f64124h = th2;
        this.f64125i = abstractC31595T;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C31577J0(this.f64120d, this.f64121e, this.f64122f, this.f64123g, this.f64124h, this.f64125i, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C31577J0) create((InterfaceC41709m0) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0062  */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String str;
        String str2;
        Object string;
        String str3;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f64119c;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 == 3) {
                        str3 = this.f64118b;
                        str = this.f64117a;
                        ResultKt.throwOnFailure(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    str = this.f64117a;
                    ResultKt.throwOnFailure(obj);
                    str2 = (String) obj;
                    C31583M0 c31583m0 = this.f64120d;
                    String str4 = this.f64123g;
                    this.f64117a = str;
                    this.f64118b = str2;
                    this.f64119c = 3;
                    string = c31583m0.getString(str4, this);
                    if (string != coroutine_suspended) {
                        str3 = str2;
                        obj = string;
                    }
                    return coroutine_suspended;
                }
            } else {
                ResultKt.throwOnFailure(obj);
            }
            AbstractC28052C.throwError$default(this.f64120d, new C29119g0(this.f64124h, this.f64125i, new C29095c0(24, str, str3, (String) obj)), "E_KYC", false, null, 8, null);
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(obj);
        C31583M0 c31583m1 = this.f64120d;
        String str5 = this.f64121e;
        this.f64119c = 1;
        obj = c31583m1.getString(str5, this);
        if (obj != coroutine_suspended) {
        }
        return coroutine_suspended;
        String str6 = (String) obj;
        C31583M0 c31583m2 = this.f64120d;
        String str7 = this.f64122f;
        this.f64117a = str6;
        this.f64119c = 2;
        Object string2 = c31583m2.getString(str7, this);
        if (string2 != coroutine_suspended) {
            str = str6;
            obj = string2;
            str2 = (String) obj;
            C31583M0 c31583m3 = this.f64120d;
            String str8 = this.f64123g;
            this.f64117a = str;
            this.f64118b = str2;
            this.f64119c = 3;
            string = c31583m3.getString(str8, this);
            if (string != coroutine_suspended) {
                str3 = str2;
                obj = string;
                AbstractC28052C.throwError$default(this.f64120d, new C29119g0(this.f64124h, this.f64125i, new C29095c0(24, str, str3, (String) obj)), "E_KYC", false, null, 8, null);
                return Unit.INSTANCE;
            }
        }
        return coroutine_suspended;
    }
}
