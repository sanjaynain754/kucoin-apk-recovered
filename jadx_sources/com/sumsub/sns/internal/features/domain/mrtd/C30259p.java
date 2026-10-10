package com.sumsub.sns.internal.features.domain.mrtd;

import android.nfc.tech.IsoDep;
import com.sumsub.sns.core.data.model.SNSException;
import com.sumsub.sns.internal.core.domain.base.AbstractC28543c;
import com.sumsub.sns.internal.features.data.model.common.C28998E2;
import com.sumsub.sns.internal.features.data.model.common.remote.C29227I;
import com.sumsub.sns.internal.features.data.repository.applicant.C29914J;
import com.sumsub.sns.internal.features.data.repository.applicant.C29917M;
import com.sumsub.sns.internal.log.C33272c;
import com.sumsub.sns.internal.p125ff.C33048a;
import com.sumsub.sns.nfc.api.SNSKinegramNfcDocumentReader;
import java.util.ArrayList;
import java.util.List;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.flow.C41636g;
import kotlinx.coroutines.flow.InterfaceC41634e;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.domain.mrtd.p */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30259p extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public int f60835a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f60836b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C30261r f60837c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ IsoDep f60838d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Function1 f60839e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30259p(C30261r c30261r, IsoDep isoDep, Function1 function1, Continuation continuation) {
        super(2, continuation);
        this.f60837c = c30261r;
        this.f60838d = isoDep;
        this.f60839e = function1;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        C30259p c30259p = new C30259p(this.f60837c, this.f60838d, this.f60839e, continuation);
        c30259p.f60836b = obj;
        return c30259p;
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C30259p) create((InterfaceC41709m0) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:75:0x0118  */
    /* JADX WARN: Code duplicated, block: B:77:0x0120  */
    /* JADX WARN: Code duplicated, block: B:80:0x012d  */
    /* JADX WARN: Code duplicated, block: B:81:0x0130  */
    /* JADX WARN: Code duplicated, block: B:83:0x0133  */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objM90885I;
        SNSKinegramNfcDocumentReader.Result result;
        C30261r c30261r;
        Object c30264u;
        SNSKinegramNfcDocumentReader.ResultSuccess resultSuccess;
        String str;
        C30261r c30261r2;
        Object objM69954a;
        String data;
        Object objM103844constructorimpl;
        Throwable thM103847exceptionOrNullimpl;
        String message;
        Exception exc;
        Integer num;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f60835a;
        Exception excM69413a = null;
        try {
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 == 2) {
                        c30261r2 = (C30261r) this.f60836b;
                        try {
                            ResultKt.throwOnFailure(obj);
                            objM69954a = obj;
                            num = ((C29227I) objM69954a).f59218a;
                            if (num != null && num.intValue() == 1) {
                                c30264u = C30266w.f60849a;
                            } else {
                                c30264u = new C30264u(new SNSException.Unknown(null, 1, null));
                            }
                            objM103844constructorimpl = Result.m103844constructorimpl(c30264u);
                        } catch (Throwable th2) {
                            th = th2;
                            c30261r = c30261r2;
                            Result.Companion companion = Result.INSTANCE;
                            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th));
                            c30261r2 = c30261r;
                        }
                        thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
                        if (thM103847exceptionOrNullimpl != null) {
                            C33272c c33272c = C33272c.f67812a;
                            message = thM103847exceptionOrNullimpl.getMessage();
                            if (message == null) {
                                message = "";
                            }
                            C33272c.f67814c.mo68956e("ReadMRTDUseCase", message, thM103847exceptionOrNullimpl);
                            if (thM103847exceptionOrNullimpl instanceof Exception) {
                                exc = (Exception) thM103847exceptionOrNullimpl;
                            } else {
                                exc = null;
                            }
                            if (exc != null) {
                                excM69413a = AbstractC28543c.m69413a(c30261r2.f60852b, exc);
                            }
                            objM103844constructorimpl = new C30264u(excM69413a);
                        }
                        return (InterfaceC30265v) objM103844constructorimpl;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                objM90885I = obj;
            } else {
                ResultKt.throwOnFailure(obj);
                InterfaceC41709m0 interfaceC41709m0 = (InterfaceC41709m0) this.f60836b;
                InterfaceC41634e interfaceC41634eM90896T = C41636g.m90896T(C41636g.m90913f(new C30260q(this.f60837c, this.f60838d, null)), new C30257n(this.f60837c, this.f60839e, null));
                C30258o c30258o = new C30258o(null);
                this.f60836b = interfaceC41709m0;
                this.f60835a = 1;
                objM90885I = C41636g.m90885I(interfaceC41634eM90896T, c30258o, this);
                if (objM90885I != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            Result.Companion companion2 = Result.INSTANCE;
            if (c30264u instanceof C30266w) {
                C29917M c29917m = c30261r.f60851a;
                C28998E2 c28998e2 = c30261r.f60844c;
                String str2 = c28998e2.f58926d;
                String str3 = c28998e2.f58925c;
                String str4 = c28998e2.f58924b;
                String str5 = c28998e2.f58936n;
                this.f60836b = c30261r;
                this.f60835a = 2;
                objM69954a = ((C29914J) c29917m.f60057a).m69954a(str2, str3, str4, (ArrayList) null, str5, str, (List) null, this);
                if (objM69954a != coroutine_suspended) {
                    c30261r2 = c30261r;
                    num = ((C29227I) objM69954a).f59218a;
                    if (num != null) {
                        c30264u = C30266w.f60849a;
                    }
                    c30264u = new C30264u(new SNSException.Unknown(null, 1, null));
                }
                return coroutine_suspended;
            }
            c30261r2 = c30261r;
            objM103844constructorimpl = Result.m103844constructorimpl(c30264u);
        } catch (Throwable th3) {
            th = th3;
            Result.Companion companion3 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th));
            c30261r2 = c30261r;
        }
        SNSKinegramNfcDocumentReader.Result result2 = (SNSKinegramNfcDocumentReader.State) objM90885I;
        if (result2 != null) {
            result = result2;
        } else {
            result = null;
        }
        c30261r = this.f60837c;
        if (result != null) {
            if (result instanceof SNSKinegramNfcDocumentReader.ResultSuccess) {
                c30264u = C30266w.f60849a;
            } else if (result instanceof SNSKinegramNfcDocumentReader.ResultError) {
                SNSKinegramNfcDocumentReader.ResultError resultError = (SNSKinegramNfcDocumentReader.ResultError) result;
                if (!(resultError instanceof SNSKinegramNfcDocumentReader.ResultErrorInvalidAccessKeyValues) && !(resultError instanceof SNSKinegramNfcDocumentReader.ResultErrorAccessControlFailed)) {
                    if (resultError instanceof SNSKinegramNfcDocumentReader.ResultErrorNfcChipCommunicationFailed) {
                        c30264u = C30267x.f60850a;
                    } else {
                        c30264u = new C30264u(null);
                    }
                } else {
                    c30264u = C30262s.f60846a;
                }
            } else {
                throw new NoWhenBranchMatchedException();
            }
        } else {
            c30264u = new C30264u(null);
        }
        if (result instanceof SNSKinegramNfcDocumentReader.ResultSuccess) {
            resultSuccess = (SNSKinegramNfcDocumentReader.ResultSuccess) result;
        } else {
            resultSuccess = null;
        }
        if (resultSuccess != null && (data = resultSuccess.getData()) != null && C33048a.f67446I.m71434a()) {
            str = data;
        } else {
            str = null;
        }
        thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
        if (thM103847exceptionOrNullimpl != null) {
            C33272c c33272c2 = C33272c.f67812a;
            message = thM103847exceptionOrNullimpl.getMessage();
            if (message == null) {
                message = "";
            }
            C33272c.f67814c.mo68956e("ReadMRTDUseCase", message, thM103847exceptionOrNullimpl);
            if (thM103847exceptionOrNullimpl instanceof Exception) {
                exc = (Exception) thM103847exceptionOrNullimpl;
            } else {
                exc = null;
            }
            if (exc != null) {
                excM69413a = AbstractC28543c.m69413a(c30261r2.f60852b, exc);
            }
            objM103844constructorimpl = new C30264u(excM69413a);
        }
        return (InterfaceC30265v) objM103844constructorimpl;
    }
}
