package com.sumsub.sns.internal.features.presentation.preview.ekyc;

import com.sumsub.sns.core.data.model.SNSException;
import com.sumsub.sns.internal.features.data.model.common.AbstractC29172p;
import com.sumsub.sns.internal.features.data.model.common.remote.response.C29614v0;
import com.sumsub.sns.internal.features.data.model.common.remote.response.EKycFlowStatus;
import com.sumsub.sns.internal.features.data.repository.applicant.C29914J;
import com.sumsub.sns.internal.features.data.repository.applicant.C29917M;
import com.sumsub.sns.internal.features.presentation.preview.AbstractC31739h;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.reflect.KProperty;
import p852kotlin.text.StringsKt;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.preview.ekyc.Z */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31537Z extends SuspendLambda implements Function1 {

    /* JADX INFO: renamed from: a */
    public C31707h0 f64029a;

    /* JADX INFO: renamed from: b */
    public CharSequence f64030b;

    /* JADX INFO: renamed from: c */
    public int f64031c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C31707h0 f64032d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31537Z(C31707h0 c31707h0, Continuation continuation) {
        super(1, continuation);
        this.f64032d = c31707h0;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new C31537Z(this.f64032d, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return new C31537Z(this.f64032d, (Continuation) obj).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:34:0x006f A[Catch: all -> 0x0031, Api -> 0x0033, TryCatch #2 {Api -> 0x0033, all -> 0x0031, blocks: (B:12:0x002d, B:30:0x0067, B:32:0x006b, B:34:0x006f, B:35:0x0071, B:17:0x0035, B:23:0x004a, B:25:0x004e, B:27:0x0054, B:20:0x003c), top: B:56:0x000b }] */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        C31707h0 c31707h0;
        String description;
        CharSequence charSequence;
        C29614v0 c29614v0;
        String strMo69754e;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f64031c;
        EKycFlowStatus eKycFlowStatus = null;
        try {
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 != 2) {
                        if (i11 != 3) {
                            if (i11 == 4) {
                                charSequence = this.f64030b;
                                c31707h0 = this.f64029a;
                                ResultKt.throwOnFailure(obj);
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            c31707h0 = this.f64029a;
                            ResultKt.throwOnFailure(obj);
                            CharSequence charSequence2 = (CharSequence) obj;
                            C31707h0 c31707h1 = this.f64032d;
                            this.f64029a = c31707h0;
                            this.f64030b = charSequence2;
                            this.f64031c = 4;
                            Object string = c31707h1.getString("sns_alert_action_dismiss", this);
                            if (string != coroutine_suspended) {
                                charSequence = charSequence2;
                                obj = string;
                            }
                            return coroutine_suspended;
                        }
                        C31723q c31723q = new C31723q(charSequence, (CharSequence) obj);
                        KProperty[] kPropertyArr = C31707h0.f64357D;
                        c31707h0.fireEvent(c31723q);
                        return Unit.INSTANCE;
                    }
                    ResultKt.throwOnFailure(obj);
                } else {
                    ResultKt.throwOnFailure(obj);
                }
                c29614v0 = (C29614v0) obj;
                C31707h0 c31707h2 = this.f64032d;
                if (c29614v0 != null) {
                    eKycFlowStatus = c29614v0.f59669a;
                }
                KProperty[] kPropertyArr2 = C31707h0.f64357D;
                c31707h2.m70813a(eKycFlowStatus);
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            C31707h0 c31707h3 = this.f64032d;
            this.f64031c = 1;
            KProperty[] kPropertyArr3 = C31707h0.f64357D;
            obj = c31707h3.m70819d(this);
            if (obj == coroutine_suspended) {
            }
            return coroutine_suspended;
            AbstractC29172p abstractC29172p = (AbstractC29172p) obj;
            if (abstractC29172p != null && (strMo69754e = abstractC29172p.mo69754e()) != null) {
                C29917M c29917m = this.f64032d.f64363i;
                this.f64031c = 2;
                obj = ((C29914J) c29917m.f60057a).f60051a.m69993e(strMo69754e, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                c29614v0 = (C29614v0) obj;
            } else {
                c29614v0 = null;
            }
            C31707h0 c31707h4 = this.f64032d;
            if (c29614v0 != null) {
                eKycFlowStatus = c29614v0.f59669a;
            }
            KProperty[] kPropertyArr4 = C31707h0.f64357D;
            c31707h4.m70813a(eKycFlowStatus);
        } catch (SNSException.Api e11) {
            C31707h0 c31707h5 = this.f64032d;
            KProperty[] kPropertyArr5 = C31707h0.f64357D;
            c31707h5.m70811a(c31707h5.m70823f(), CollectionsKt.emptyList());
            c31707h0 = this.f64032d;
            this.f64029a = c31707h0;
            this.f64031c = 3;
            if (e11.getErrorCode() != null && (description = e11.getDescription()) != null && !StringsKt.isBlank(description)) {
                obj = e11.getDescription();
            } else {
                obj = c31707h0.getString("sns_ekyc_error_common", this);
            }
            if (obj != coroutine_suspended) {
            }
            return coroutine_suspended;
        } catch (Throwable th2) {
            AbstractC31739h.m70853a(this.f64032d, th2);
        }
        return Unit.INSTANCE;
    }
}
