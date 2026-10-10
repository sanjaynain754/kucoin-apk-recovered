package com.sumsub.sns.internal.features.domain.mrtd;

import android.nfc.tech.IsoDep;
import android.util.Base64;
import com.sumsub.sns.core.data.model.SNSException;
import com.sumsub.sns.internal.core.common.AbstractC28420T0;
import com.sumsub.sns.internal.core.domain.base.AbstractC28543c;
import com.sumsub.sns.internal.features.data.model.common.C28988C2;
import com.sumsub.sns.internal.features.data.model.common.remote.C29227I;
import com.sumsub.sns.internal.features.data.repository.applicant.C29914J;
import com.sumsub.sns.internal.features.data.repository.applicant.C29917M;
import com.sumsub.sns.internal.log.C33272c;
import com.sumsub.sns.internal.nfc.AbstractC33384m;
import com.sumsub.sns.internal.nfc.C33381j;
import com.sumsub.sns.internal.nfc.C33382k;
import com.sumsub.sns.internal.nfc.C33383l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.domain.mrtd.l */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30255l extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public int f60825a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f60826b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C30256m f60827c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ IsoDep f60828d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Function1 f60829e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30255l(C30256m c30256m, IsoDep isoDep, Function1 function1, Continuation continuation) {
        super(2, continuation);
        this.f60827c = c30256m;
        this.f60828d = isoDep;
        this.f60829e = function1;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        C30255l c30255l = new C30255l(this.f60827c, this.f60828d, this.f60829e, continuation);
        c30255l.f60826b = obj;
        return c30255l;
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C30255l) create((InterfaceC41709m0) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:57:0x0102  */
    /* JADX WARN: Code duplicated, block: B:59:0x010a  */
    /* JADX WARN: Code duplicated, block: B:62:0x0117  */
    /* JADX WARN: Code duplicated, block: B:63:0x011a  */
    /* JADX WARN: Code duplicated, block: B:65:0x011d  */
    /* JADX WARN: Code duplicated, block: B:72:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00a0, code lost:
    
        if (r15 == r0) goto L30;
     */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Throwable th2;
        Object objM103844constructorimpl;
        C30256m c30256m;
        Throwable thM103847exceptionOrNullimpl;
        String message;
        Exception exc;
        C30256m c30256m2;
        Object c30264u;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f60825a;
        Exception excM69413a = null;
        try {
            try {
                if (i11 != 0) {
                    if (i11 != 1) {
                        if (i11 == 2) {
                            ResultKt.throwOnFailure(obj);
                            this = this;
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        c30256m2 = (C30256m) this.f60826b;
                        ResultKt.throwOnFailure(obj);
                    }
                    Integer num = ((C29227I) obj).f59218a;
                    if (num != null && num.intValue() == 1) {
                        c30264u = C30266w.f60849a;
                    } else {
                        c30264u = new C30264u(new SNSException.Unknown(null, 1, null));
                    }
                    objM103844constructorimpl = Result.m103844constructorimpl(c30264u);
                    c30256m = this.f60827c;
                    thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
                    if (thM103847exceptionOrNullimpl == null) {
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
                            excM69413a = AbstractC28543c.m69413a(c30256m.f60852b, exc);
                        }
                        return new C30264u(excM69413a);
                    }
                    return objM103844constructorimpl;
                }
                ResultKt.throwOnFailure(obj);
                c30256m2 = this.f60827c;
                IsoDep isoDep = this.f60828d;
                Function1 function1 = this.f60829e;
                try {
                    Result.Companion companion = Result.INSTANCE;
                    C28988C2 c28988c2 = c30256m2.f60830c;
                    C33381j c33381j = new C33381j(isoDep, AbstractC28420T0.m69302a(c28988c2.f58917k), C30256m.m70163a(c30256m2, c28988c2.f58918l));
                    this.f60826b = c30256m2;
                    this.f60825a = 1;
                    obj = c33381j.m71678a(function1, this);
                    if (obj == coroutine_suspended) {
                    }
                    return coroutine_suspended;
                } catch (Throwable th3) {
                    th = th3;
                    th2 = th;
                    Result.Companion companion2 = Result.INSTANCE;
                    objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
                }
                AbstractC33384m abstractC33384m = (AbstractC33384m) obj;
                if (abstractC33384m instanceof C33383l) {
                    List list = ((C33383l) abstractC33384m).f68085a;
                    ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(Base64.encodeToString((byte[]) it.next(), 2));
                    }
                    C29917M c29917m = c30256m2.f60851a;
                    C28988C2 c28988c3 = c30256m2.f60830c;
                    String str = c28988c3.f58910d;
                    String str2 = c28988c3.f58909c;
                    String str3 = c28988c3.f58908b;
                    this.f60826b = null;
                    this.f60825a = 2;
                    this = this;
                    obj = ((C29914J) c29917m.f60057a).m69954a(str, str2, str3, arrayList, (String) null, (String) null, (List) null, this);
                } else {
                    this = this;
                    if (abstractC33384m instanceof C33382k) {
                        int i12 = AbstractC30254k.f60824a[((C33382k) abstractC33384m).f68084a.ordinal()];
                        if (i12 != 1) {
                            if (i12 != 2) {
                                c30264u = new C30264u(null);
                            } else {
                                c30264u = C30267x.f60850a;
                            }
                        } else {
                            c30264u = C30262s.f60846a;
                        }
                    } else {
                        throw new NoWhenBranchMatchedException();
                    }
                }
                objM103844constructorimpl = Result.m103844constructorimpl(c30264u);
            } catch (Throwable th4) {
                th = th4;
            }
        } catch (Throwable th5) {
            th2 = th5;
            Result.Companion companion3 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        c30256m = this.f60827c;
        thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
        if (thM103847exceptionOrNullimpl == null) {
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
                excM69413a = AbstractC28543c.m69413a(c30256m.f60852b, exc);
            }
            return new C30264u(excM69413a);
        }
        return objM103844constructorimpl;
    }
}
