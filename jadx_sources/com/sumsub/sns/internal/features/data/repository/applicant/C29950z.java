package com.sumsub.sns.internal.features.data.repository.applicant;

import com.sumsub.sns.core.data.model.SNSException;
import com.sumsub.sns.core.data.model.SNSGeneralException;
import com.sumsub.sns.internal.features.data.model.common.AbstractC29172p;
import com.sumsub.sns.internal.features.data.model.common.C29069W2;
import com.sumsub.sns.internal.features.data.model.common.C29070X;
import com.sumsub.sns.internal.features.data.model.common.C29118g;
import com.sumsub.sns.internal.features.data.model.common.C29124h;
import com.sumsub.sns.internal.features.data.model.common.IdentitySide;
import com.sumsub.sns.internal.features.data.model.common.remote.C29227I;
import com.sumsub.sns.internal.features.data.model.common.remote.C29307Y0;
import com.sumsub.sns.internal.features.data.model.common.remote.C29310Y3;
import com.sumsub.sns.internal.features.data.model.common.remote.C29429o1;
import com.sumsub.sns.internal.features.data.model.common.remote.C29675y;
import com.sumsub.sns.internal.features.data.model.common.remote.response.C29570k0;
import com.sumsub.sns.internal.features.data.model.esign.C29733E;
import com.sumsub.sns.internal.features.data.model.esign.C29736H;
import com.sumsub.sns.internal.features.data.model.esign.C29742N;
import com.sumsub.sns.internal.features.data.model.esign.C29752Y;
import com.sumsub.sns.internal.features.data.repository.dynamic.AbstractC29971N;
import com.sumsub.sns.internal.features.data.repository.dynamic.C29967J;
import com.sumsub.sns.internal.features.data.repository.dynamic.InterfaceC29984m;
import com.sumsub.sns.internal.features.data.repository.esign.C29999b;
import com.sumsub.sns.internal.features.data.utils.InterfaceC30061a;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import kotlinx.coroutines.C41783z1;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.repository.applicant.z */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C29950z implements InterfaceC29921d {

    /* JADX INFO: renamed from: a */
    public final InterfaceC29918a f60141a;

    /* JADX INFO: renamed from: b */
    public final C29999b f60142b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC29984m f60143c;

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0059, code lost:
    
        if (((com.sumsub.sns.internal.features.data.repository.applicant.C29914J) r2).m69952a(r7, r6, r0) == r1) goto L23;
     */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m70016a(String str, ContinuationImpl continuationImpl) {
        C29943s c29943s;
        if (continuationImpl instanceof C29943s) {
            c29943s = (C29943s) continuationImpl;
            int i11 = c29943s.f60109d;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c29943s.f60109d = i11 - Integer.MIN_VALUE;
            } else {
                c29943s = new C29943s(this, continuationImpl);
            }
        } else {
            c29943s = new C29943s(this, continuationImpl);
        }
        Object objM70021b = c29943s.f60107b;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c29943s.f60109d;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objM70021b);
            c29943s.f60106a = str;
            c29943s.f60109d = 1;
            objM70021b = m70021b(c29943s);
            if (objM70021b != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i12 == 1) {
            str = c29943s.f60106a;
            ResultKt.throwOnFailure(objM70021b);
        } else {
            if (i12 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objM70021b);
        }
        return Unit.INSTANCE;
        String str2 = (String) objM70021b;
        if (str2 != null) {
            InterfaceC29918a interfaceC29918a = this.f60141a;
            c29943s.f60106a = null;
            c29943s.f60109d = 2;
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x007e  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0069, code lost:
    
        if (((com.sumsub.sns.internal.features.data.repository.applicant.C29914J) r2).m69961b(r10, r9, r0) == r1) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x008a, code lost:
    
        if (((com.sumsub.sns.internal.features.data.repository.applicant.C29914J) r2).m69953a(r10, r9, r0) == r1) goto L37;
     */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m70020b(String str, ContinuationImpl continuationImpl) {
        C29944t c29944t;
        String str2;
        if (continuationImpl instanceof C29944t) {
            c29944t = (C29944t) continuationImpl;
            int i11 = c29944t.f60113d;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c29944t.f60113d = i11 - Integer.MIN_VALUE;
            } else {
                c29944t = new C29944t(this, continuationImpl);
            }
        } else {
            c29944t = new C29944t(this, continuationImpl);
        }
        Object objM70018a = c29944t.f60111b;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c29944t.f60113d;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objM70018a);
            c29944t.f60110a = str;
            c29944t.f60113d = 1;
            objM70018a = m70018a(c29944t);
            if (objM70018a != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i12 != 1) {
            if (i12 == 2) {
                ResultKt.throwOnFailure(objM70018a);
                return Unit.INSTANCE;
            }
            if (i12 == 3) {
                str = c29944t.f60110a;
                ResultKt.throwOnFailure(objM70018a);
                str2 = (String) objM70018a;
                if (str2 != null) {
                    InterfaceC29918a interfaceC29918a = this.f60141a;
                    c29944t.f60110a = null;
                    c29944t.f60113d = 4;
                }
            } else {
                if (i12 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objM70018a);
            }
            return Unit.INSTANCE;
        }
        str = c29944t.f60110a;
        ResultKt.throwOnFailure(objM70018a);
        String str3 = (String) objM70018a;
        if (str3 != null) {
            InterfaceC29918a interfaceC29918a2 = this.f60141a;
            c29944t.f60110a = null;
            c29944t.f60113d = 2;
        } else {
            c29944t.f60110a = str;
            c29944t.f60113d = 3;
            objM70018a = m70021b(c29944t);
            if (objM70018a != coroutine_suspended) {
                str2 = (String) objM70018a;
                if (str2 != null) {
                    InterfaceC29918a interfaceC29918a3 = this.f60141a;
                    c29944t.f60110a = null;
                    c29944t.f60113d = 4;
                }
                return Unit.INSTANCE;
            }
        }
        return coroutine_suspended;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: c */
    public final Object m70022c(ContinuationImpl continuationImpl) {
        C29931g c29931g;
        if (continuationImpl instanceof C29931g) {
            c29931g = (C29931g) continuationImpl;
            int i11 = c29931g.f60071c;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c29931g.f60071c = i11 - Integer.MIN_VALUE;
            } else {
                c29931g = new C29931g(this, continuationImpl);
            }
        } else {
            c29931g = new C29931g(this, continuationImpl);
        }
        Object objM70018a = c29931g.f60069a;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c29931g.f60071c;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objM70018a);
            c29931g.f60071c = 1;
            objM70018a = m70018a(c29931g);
            if (objM70018a == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objM70018a);
        }
        return objM70018a != null ? new C29932h() : new C29933i();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x006d, code lost:
    
        if (r7 == r1) goto L33;
     */
    /* JADX INFO: renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m70023d(ContinuationImpl continuationImpl) {
        C29937m c29937m;
        C29675y c29675y;
        if (continuationImpl instanceof C29937m) {
            c29937m = (C29937m) continuationImpl;
            int i11 = c29937m.f60086c;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c29937m.f60086c = i11 - Integer.MIN_VALUE;
            } else {
                c29937m = new C29937m(this, continuationImpl);
            }
        } else {
            c29937m = new C29937m(this, continuationImpl);
        }
        Object objM70018a = c29937m.f60084a;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c29937m.f60086c;
        try {
            if (i12 == 0) {
                ResultKt.throwOnFailure(objM70018a);
                c29937m.f60086c = 1;
                objM70018a = m70018a(c29937m);
                if (objM70018a == coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i12 != 1) {
                if (i12 == 2) {
                    ResultKt.throwOnFailure(objM70018a);
                    c29675y = (C29675y) objM70018a;
                    return Result.m103844constructorimpl(c29675y);
                }
                if (i12 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objM70018a);
                c29675y = (C29675y) objM70018a;
                return Result.m103844constructorimpl(c29675y);
            }
            ResultKt.throwOnFailure(objM70018a);
            if (objM70018a != null) {
                InterfaceC29918a interfaceC29918a = this.f60141a;
                c29937m.f60086c = 2;
                objM70018a = ((C29914J) interfaceC29918a).f60051a.m69978a(c29937m);
                if (objM70018a == coroutine_suspended) {
                }
                c29675y = (C29675y) objM70018a;
                return Result.m103844constructorimpl(c29675y);
            }
            InterfaceC29918a interfaceC29918a2 = this.f60141a;
            c29937m.f60086c = 3;
            objM70018a = ((C29914J) interfaceC29918a2).f60051a.m69995f(c29937m);
            return coroutine_suspended;
        } catch (Exception e11) {
            C41783z1.m91406l(c29937m.get$context());
            Result.Companion companion = Result.INSTANCE;
            return Result.m103844constructorimpl(ResultKt.createFailure(e11));
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0052, code lost:
    
        if (r6 == r1) goto L23;
     */
    /* JADX INFO: renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m70024e(ContinuationImpl continuationImpl) {
        C29938n c29938n;
        if (continuationImpl instanceof C29938n) {
            c29938n = (C29938n) continuationImpl;
            int i11 = c29938n.f60089c;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c29938n.f60089c = i11 - Integer.MIN_VALUE;
            } else {
                c29938n = new C29938n(this, continuationImpl);
            }
        } else {
            c29938n = new C29938n(this, continuationImpl);
        }
        Object objM70021b = c29938n.f60087a;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c29938n.f60089c;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objM70021b);
            c29938n.f60089c = 1;
            objM70021b = m70021b(c29938n);
            if (objM70021b != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i12 == 1) {
            ResultKt.throwOnFailure(objM70021b);
        } else {
            if (i12 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objM70021b);
        }
        return (C29752Y) objM70021b;
        String str = (String) objM70021b;
        if (str == null) {
            return null;
        }
        C29999b c29999b = this.f60142b;
        c29938n.f60089c = 2;
        objM70021b = c29999b.f60285a.m69977a(str, c29938n);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0082  */
    /* JADX WARN: Code duplicated, block: B:41:0x0095  */
    /* JADX WARN: Code duplicated, block: B:45:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x009f, code lost:
    
        if (r9 == r1) goto L43;
     */
    /* JADX INFO: renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m70025f(ContinuationImpl continuationImpl) {
        C29945u c29945u;
        boolean zBooleanValue;
        InterfaceC29984m interfaceC29984m;
        boolean z11;
        String str;
        boolean zBooleanValue2;
        if (continuationImpl instanceof C29945u) {
            c29945u = (C29945u) continuationImpl;
            int i11 = c29945u.f60117d;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c29945u.f60117d = i11 - Integer.MIN_VALUE;
            } else {
                c29945u = new C29945u(this, continuationImpl);
            }
        } else {
            c29945u = new C29945u(this, continuationImpl);
        }
        Object objM70018a = c29945u.f60115b;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c29945u.f60117d;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objM70018a);
            c29945u.f60117d = 1;
            objM70018a = m70018a(c29945u);
            if (objM70018a != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i12 != 1) {
            if (i12 == 2) {
                ResultKt.throwOnFailure(objM70018a);
                zBooleanValue = ((Boolean) objM70018a).booleanValue();
                interfaceC29984m = this.f60143c;
                c29945u.f60114a = zBooleanValue;
                c29945u.f60117d = 3;
                if (((C29967J) interfaceC29984m).m70043a(true, (ContinuationImpl) c29945u) != coroutine_suspended) {
                    z11 = zBooleanValue;
                }
                return coroutine_suspended;
            }
            if (i12 != 3) {
                if (i12 == 4) {
                    ResultKt.throwOnFailure(objM70018a);
                    str = (String) objM70018a;
                    if (str != null) {
                        InterfaceC29918a interfaceC29918a = this.f60141a;
                        c29945u.f60117d = 5;
                        objM70018a = ((C29914J) interfaceC29918a).m69956a(str, c29945u);
                    } else {
                        zBooleanValue2 = false;
                    }
                    return Boxing.boxBoolean(zBooleanValue2);
                }
                if (i12 != 5) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objM70018a);
                zBooleanValue2 = ((Boolean) objM70018a).booleanValue();
                return Boxing.boxBoolean(zBooleanValue2);
            }
            z11 = c29945u.f60114a;
            ResultKt.throwOnFailure(objM70018a);
            return Boxing.boxBoolean(z11);
        }
        ResultKt.throwOnFailure(objM70018a);
        if (((String) objM70018a) != null) {
            InterfaceC29918a interfaceC29918a2 = this.f60141a;
            c29945u.f60117d = 2;
            objM70018a = ((C29914J) interfaceC29918a2).m69962b(c29945u);
            if (objM70018a != coroutine_suspended) {
                zBooleanValue = ((Boolean) objM70018a).booleanValue();
                interfaceC29984m = this.f60143c;
                c29945u.f60114a = zBooleanValue;
                c29945u.f60117d = 3;
                if (((C29967J) interfaceC29984m).m70043a(true, (ContinuationImpl) c29945u) != coroutine_suspended) {
                    z11 = zBooleanValue;
                    return Boxing.boxBoolean(z11);
                }
            }
        } else {
            c29945u.f60117d = 4;
            objM70018a = m70021b(c29945u);
            if (objM70018a != coroutine_suspended) {
                str = (String) objM70018a;
                if (str != null) {
                    InterfaceC29918a interfaceC29918a3 = this.f60141a;
                    c29945u.f60117d = 5;
                    objM70018a = ((C29914J) interfaceC29918a3).m69956a(str, c29945u);
                } else {
                    zBooleanValue2 = false;
                }
                return Boxing.boxBoolean(zBooleanValue2);
            }
        }
        return coroutine_suspended;
    }

    public C29950z(InterfaceC29918a interfaceC29918a, C29999b c29999b, InterfaceC29984m interfaceC29984m) {
        this.f60141a = interfaceC29918a;
        this.f60142b = c29999b;
        this.f60143c = interfaceC29984m;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m70017a(List list, ContinuationImpl continuationImpl) {
        C29939o c29939o;
        if (continuationImpl instanceof C29939o) {
            c29939o = (C29939o) continuationImpl;
            int i11 = c29939o.f60093d;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c29939o.f60093d = i11 - Integer.MIN_VALUE;
            } else {
                c29939o = new C29939o(this, continuationImpl);
            }
        } else {
            c29939o = new C29939o(this, continuationImpl);
        }
        Object objM70018a = c29939o.f60091b;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c29939o.f60093d;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objM70018a);
            c29939o.f60090a = list;
            c29939o.f60093d = 1;
            objM70018a = m70018a(c29939o);
            if (objM70018a != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i12 != 1) {
            if (i12 == 2) {
                ResultKt.throwOnFailure(objM70018a);
                return objM70018a;
            }
            if (i12 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objM70018a);
            return objM70018a;
        }
        list = c29939o.f60090a;
        ResultKt.throwOnFailure(objM70018a);
        String str = (String) objM70018a;
        if (str != null) {
            InterfaceC29918a interfaceC29918a = this.f60141a;
            c29939o.f60090a = null;
            c29939o.f60093d = 2;
            Object objM69955a = ((C29914J) interfaceC29918a).m69955a(str, list, c29939o);
            if (objM69955a != coroutine_suspended) {
                return objM69955a;
            }
        } else {
            InterfaceC29918a interfaceC29918a2 = this.f60141a;
            c29939o.f60090a = null;
            c29939o.f60093d = 3;
            Object objM69957a = ((C29914J) interfaceC29918a2).m69957a(list, c29939o);
            if (objM69957a != coroutine_suspended) {
                return objM69957a;
            }
        }
        return coroutine_suspended;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public final Object m70019b(int i11, ContinuationImpl continuationImpl) throws SNSGeneralException, IOException {
        C29936l c29936l;
        if (continuationImpl instanceof C29936l) {
            c29936l = (C29936l) continuationImpl;
            int i12 = c29936l.f60083d;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                c29936l.f60083d = i12 - Integer.MIN_VALUE;
            } else {
                c29936l = new C29936l(this, continuationImpl);
            }
        } else {
            c29936l = new C29936l(this, continuationImpl);
        }
        Object objM70021b = c29936l.f60081b;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i13 = c29936l.f60083d;
        if (i13 == 0) {
            ResultKt.throwOnFailure(objM70021b);
            c29936l.f60080a = i11;
            c29936l.f60083d = 1;
            objM70021b = m70021b(c29936l);
            if (objM70021b != coroutine_suspended) {
            }
        }
        if (i13 != 1) {
            if (i13 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objM70021b);
            return objM70021b;
        }
        i11 = c29936l.f60080a;
        ResultKt.throwOnFailure(objM70021b);
        if (((String) objM70021b) != null) {
            InterfaceC29918a interfaceC29918a = this.f60141a;
            c29936l.f60083d = 2;
            Object objM69949a = ((C29914J) interfaceC29918a).m69949a(i11, c29936l);
            return objM69949a == coroutine_suspended ? coroutine_suspended : objM69949a;
        }
        throw new SNSGeneralException("NOT supported for action", null, null, 6, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x006b, code lost:
    
        if (r7 == r1) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0088, code lost:
    
        if (r7 == r1) goto L36;
     */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m70008a(C29069W2 c29069w2, ContinuationImpl continuationImpl) {
        C29946v c29946v;
        if (continuationImpl instanceof C29946v) {
            c29946v = (C29946v) continuationImpl;
            int i11 = c29946v.f60121d;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c29946v.f60121d = i11 - Integer.MIN_VALUE;
            } else {
                c29946v = new C29946v(this, continuationImpl);
            }
        } else {
            c29946v = new C29946v(this, continuationImpl);
        }
        Object objM70018a = c29946v.f60119b;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c29946v.f60121d;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objM70018a);
            c29946v.f60118a = c29069w2;
            c29946v.f60121d = 1;
            objM70018a = m70018a(c29946v);
            if (objM70018a != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i12 != 1) {
            if (i12 == 2) {
                ResultKt.throwOnFailure(objM70018a);
                return Unit.INSTANCE;
            }
            if (i12 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objM70018a);
            return Unit.INSTANCE;
        }
        c29069w2 = c29946v.f60118a;
        ResultKt.throwOnFailure(objM70018a);
        if (((String) objM70018a) != null) {
            InterfaceC29918a interfaceC29918a = this.f60141a;
            c29946v.f60118a = null;
            c29946v.f60121d = 2;
            Object objM69980b = ((C29914J) interfaceC29918a).f60051a.m69980b(c29069w2, c29946v);
            if (objM69980b != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                objM69980b = Unit.INSTANCE;
            }
        } else {
            InterfaceC29918a interfaceC29918a2 = this.f60141a;
            c29946v.f60118a = null;
            c29946v.f60121d = 3;
            Object objM69963a = ((C29914J) interfaceC29918a2).f60051a.m69963a(c29069w2, c29946v);
            if (objM69963a != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                objM69963a = Unit.INSTANCE;
            }
        }
        return coroutine_suspended;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public final Object m70021b(ContinuationImpl continuationImpl) {
        C29930f c29930f;
        if (continuationImpl instanceof C29930f) {
            c29930f = (C29930f) continuationImpl;
            int i11 = c29930f.f60068c;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c29930f.f60068c = i11 - Integer.MIN_VALUE;
            } else {
                c29930f = new C29930f(this, continuationImpl);
            }
        } else {
            c29930f = new C29930f(this, continuationImpl);
        }
        Object objM70042a = c29930f.f60066a;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c29930f.f60068c;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objM70042a);
            InterfaceC29984m interfaceC29984m = this.f60143c;
            c29930f.f60068c = 1;
            objM70042a = ((C29967J) interfaceC29984m).m70042a(false, (Continuation) c29930f);
            if (objM70042a == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objM70042a);
        }
        AbstractC29172p abstractC29172p = (AbstractC29172p) ((AbstractC29971N) objM70042a).m70051c();
        if (abstractC29172p != null) {
            return abstractC29172p.mo69754e();
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0066, code lost:
    
        if (r7 == r1) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0081, code lost:
    
        if (r7 == r1) goto L35;
     */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m70007a(int i11, ContinuationImpl continuationImpl) {
        C29935k c29935k;
        if (continuationImpl instanceof C29935k) {
            c29935k = (C29935k) continuationImpl;
            int i12 = c29935k.f60079d;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                c29935k.f60079d = i12 - Integer.MIN_VALUE;
            } else {
                c29935k = new C29935k(this, continuationImpl);
            }
        } else {
            c29935k = new C29935k(this, continuationImpl);
        }
        Object objM70018a = c29935k.f60077b;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i13 = c29935k.f60079d;
        if (i13 == 0) {
            ResultKt.throwOnFailure(objM70018a);
            c29935k.f60076a = i11;
            c29935k.f60079d = 1;
            objM70018a = m70018a(c29935k);
            if (objM70018a != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i13 != 1) {
            if (i13 == 2) {
                ResultKt.throwOnFailure(objM70018a);
                return Unit.INSTANCE;
            }
            if (i13 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objM70018a);
            return Unit.INSTANCE;
        }
        i11 = c29935k.f60076a;
        ResultKt.throwOnFailure(objM70018a);
        if (objM70018a != null) {
            InterfaceC29918a interfaceC29918a = this.f60141a;
            c29935k.f60079d = 2;
            Object objM70000b = ((C29914J) interfaceC29918a).f60052b.m70000b(i11, c29935k);
            if (objM70000b != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                objM70000b = Unit.INSTANCE;
            }
        } else {
            InterfaceC29918a interfaceC29918a2 = this.f60141a;
            c29935k.f60079d = 3;
            Object objM70002c = ((C29914J) interfaceC29918a2).f60052b.m70002c(i11, c29935k);
            if (objM70002c != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                objM70002c = Unit.INSTANCE;
            }
        }
        return coroutine_suspended;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:42:0x010f A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0109, code lost:
    
        if (r1 == r2) goto L39;
     */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m70014a(String str, File file, String str2, IdentitySide identitySide, Map map, C29070X c29070x, InterfaceC30061a interfaceC30061a, ContinuationImpl continuationImpl) {
        C29948x c29948x;
        String str3;
        Map map2;
        C29070X c29070x2;
        String str4;
        IdentitySide identitySide2;
        InterfaceC30061a interfaceC30061a2;
        File file2;
        int i11;
        Map map3;
        String str5;
        C29070X c29070x3;
        if (continuationImpl instanceof C29948x) {
            c29948x = (C29948x) continuationImpl;
            int i12 = c29948x.f60135j;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                c29948x.f60135j = i12 - Integer.MIN_VALUE;
            } else {
                c29948x = new C29948x(this, continuationImpl);
            }
        } else {
            c29948x = new C29948x(this, continuationImpl);
        }
        C29948x c29948x2 = c29948x;
        Object objM70021b = c29948x2.f60133h;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i13 = c29948x2.f60135j;
        if (i13 == 0) {
            ResultKt.throwOnFailure(objM70021b);
            c29948x2.f60126a = str;
            c29948x2.f60127b = file;
            str3 = str2;
            c29948x2.f60128c = str3;
            c29948x2.f60129d = identitySide;
            map2 = map;
            c29948x2.f60130e = map2;
            c29070x2 = c29070x;
            c29948x2.f60131f = c29070x2;
            c29948x2.f60132g = interfaceC30061a;
            c29948x2.f60135j = 1;
            Object objM70018a = m70018a(c29948x2);
            if (objM70018a != coroutine_suspended) {
                str4 = str;
                objM70021b = objM70018a;
                identitySide2 = identitySide;
                interfaceC30061a2 = interfaceC30061a;
                file2 = file;
                i11 = 3;
            }
            return coroutine_suspended;
        }
        if (i13 == 1) {
            InterfaceC30061a interfaceC30061a3 = c29948x2.f60132g;
            C29070X c29070x4 = c29948x2.f60131f;
            Map map4 = c29948x2.f60130e;
            IdentitySide identitySide3 = c29948x2.f60129d;
            String str6 = c29948x2.f60128c;
            File file3 = c29948x2.f60127b;
            str4 = c29948x2.f60126a;
            ResultKt.throwOnFailure(objM70021b);
            interfaceC30061a2 = interfaceC30061a3;
            i11 = 3;
            file2 = file3;
            c29070x2 = c29070x4;
            identitySide2 = identitySide3;
            map2 = map4;
            str3 = str6;
        } else {
            if (i13 == 2) {
                ResultKt.throwOnFailure(objM70021b);
                return objM70021b;
            }
            if (i13 == 3) {
                InterfaceC30061a interfaceC30061a4 = c29948x2.f60132g;
                C29070X c29070x5 = c29948x2.f60131f;
                map3 = c29948x2.f60130e;
                identitySide2 = c29948x2.f60129d;
                String str7 = c29948x2.f60128c;
                File file4 = c29948x2.f60127b;
                String str8 = c29948x2.f60126a;
                ResultKt.throwOnFailure(objM70021b);
                str4 = str8;
                str5 = str7;
                c29070x3 = c29070x5;
                file2 = file4;
                interfaceC30061a2 = interfaceC30061a4;
                if (((String) objM70021b) != null) {
                    return null;
                }
                InterfaceC29918a interfaceC29918a = this.f60141a;
                c29948x2.f60126a = null;
                c29948x2.f60127b = null;
                c29948x2.f60128c = null;
                c29948x2.f60129d = null;
                c29948x2.f60130e = null;
                c29948x2.f60131f = null;
                c29948x2.f60132g = null;
                c29948x2.f60135j = 4;
                objM70021b = ((C29914J) interfaceC29918a).m69950a(str4, file2, str5, identitySide2, map3, c29070x3, interfaceC30061a2, c29948x2);
            } else {
                if (i13 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objM70021b);
            }
        }
        return (C29307Y0) objM70021b;
        if (((String) objM70021b) != null) {
            InterfaceC29918a interfaceC29918a2 = this.f60141a;
            c29948x2.f60126a = null;
            c29948x2.f60127b = null;
            c29948x2.f60128c = null;
            c29948x2.f60129d = null;
            c29948x2.f60130e = null;
            c29948x2.f60131f = null;
            c29948x2.f60132g = null;
            c29948x2.f60135j = 2;
            Object objM69960b = ((C29914J) interfaceC29918a2).m69960b(str4, file2, str3, identitySide2, map2, c29070x2, interfaceC30061a2, c29948x2);
            if (objM69960b != coroutine_suspended) {
                return objM69960b;
            }
        } else {
            map3 = map2;
            str5 = str3;
            c29070x3 = c29070x2;
            c29948x2.f60126a = str4;
            c29948x2.f60127b = file2;
            c29948x2.f60128c = str5;
            c29948x2.f60129d = identitySide2;
            c29948x2.f60130e = map3;
            c29948x2.f60131f = c29070x3;
            c29948x2.f60132g = interfaceC30061a2;
            c29948x2.f60135j = i11;
            objM70021b = m70021b(c29948x2);
            if (objM70021b != coroutine_suspended) {
                if (((String) objM70021b) != null) {
                    return null;
                }
                InterfaceC29918a interfaceC29918a3 = this.f60141a;
                c29948x2.f60126a = null;
                c29948x2.f60127b = null;
                c29948x2.f60128c = null;
                c29948x2.f60129d = null;
                c29948x2.f60130e = null;
                c29948x2.f60131f = null;
                c29948x2.f60132g = null;
                c29948x2.f60135j = 4;
                objM70021b = ((C29914J) interfaceC29918a3).m69950a(str4, file2, str5, identitySide2, map3, c29070x3, interfaceC30061a2, c29948x2);
            }
        }
        return coroutine_suspended;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x007e  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x008c, code lost:
    
        if (r10 == r1) goto L37;
     */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m70010a(C29429o1 c29429o1, ContinuationImpl continuationImpl) throws SNSException.Unknown {
        C29941q c29941q;
        String str;
        if (continuationImpl instanceof C29941q) {
            c29941q = (C29941q) continuationImpl;
            int i11 = c29941q.f60101d;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c29941q.f60101d = i11 - Integer.MIN_VALUE;
            } else {
                c29941q = new C29941q(this, continuationImpl);
            }
        } else {
            c29941q = new C29941q(this, continuationImpl);
        }
        Object objM70018a = c29941q.f60099b;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c29941q.f60101d;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objM70018a);
            c29941q.f60098a = c29429o1;
            c29941q.f60101d = 1;
            objM70018a = m70018a(c29941q);
            if (objM70018a != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i12 == 1) {
            c29429o1 = c29941q.f60098a;
            ResultKt.throwOnFailure(objM70018a);
        } else {
            if (i12 == 2) {
                ResultKt.throwOnFailure(objM70018a);
                return objM70018a;
            }
            if (i12 == 3) {
                c29429o1 = c29941q.f60098a;
                ResultKt.throwOnFailure(objM70018a);
                str = (String) objM70018a;
                if (str != null) {
                    InterfaceC29918a interfaceC29918a = this.f60141a;
                    c29941q.f60098a = null;
                    c29941q.f60101d = 4;
                    objM70018a = ((C29914J) interfaceC29918a).f60051a.m69983b(str, c29429o1, c29941q);
                }
                throw new SNSException.Unknown(new IllegalStateException("Applicant id missing"));
            }
            if (i12 != 4) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objM70018a);
        }
        C29570k0 c29570k0 = (C29570k0) objM70018a;
        if (c29570k0 != null) {
            return c29570k0;
        }
        throw new SNSException.Unknown(new IllegalStateException("Applicant id missing"));
        String str2 = (String) objM70018a;
        if (str2 != null) {
            InterfaceC29918a interfaceC29918a2 = this.f60141a;
            c29941q.f60098a = null;
            c29941q.f60101d = 2;
            Object objM69969a = ((C29914J) interfaceC29918a2).f60051a.m69969a(str2, c29429o1, c29941q);
            if (objM69969a != coroutine_suspended) {
                return objM69969a;
            }
        } else {
            c29941q.f60098a = c29429o1;
            c29941q.f60101d = 3;
            objM70018a = m70021b(c29941q);
            if (objM70018a != coroutine_suspended) {
                str = (String) objM70018a;
                if (str != null) {
                    InterfaceC29918a interfaceC29918a3 = this.f60141a;
                    c29941q.f60098a = null;
                    c29941q.f60101d = 4;
                    objM70018a = ((C29914J) interfaceC29918a3).f60051a.m69983b(str, c29429o1, c29941q);
                }
                throw new SNSException.Unknown(new IllegalStateException("Applicant id missing"));
            }
        }
        return coroutine_suspended;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x008c  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x009c, code lost:
    
        if (r12 == r1) goto L38;
     */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m70015a(String str, String str2, ContinuationImpl continuationImpl) throws SNSException.Unknown {
        C29949y c29949y;
        String str3;
        String str4;
        String str5;
        if (continuationImpl instanceof C29949y) {
            c29949y = (C29949y) continuationImpl;
            int i11 = c29949y.f60140e;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c29949y.f60140e = i11 - Integer.MIN_VALUE;
            } else {
                c29949y = new C29949y(this, continuationImpl);
            }
        } else {
            c29949y = new C29949y(this, continuationImpl);
        }
        Object objM70018a = c29949y.f60138c;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c29949y.f60140e;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objM70018a);
            c29949y.f60136a = str;
            c29949y.f60137b = str2;
            c29949y.f60140e = 1;
            objM70018a = m70018a(c29949y);
            if (objM70018a != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i12 == 1) {
            str2 = c29949y.f60137b;
            str = c29949y.f60136a;
            ResultKt.throwOnFailure(objM70018a);
        } else {
            if (i12 == 2) {
                ResultKt.throwOnFailure(objM70018a);
                return objM70018a;
            }
            if (i12 == 3) {
                str4 = c29949y.f60137b;
                str3 = c29949y.f60136a;
                ResultKt.throwOnFailure(objM70018a);
                str5 = (String) objM70018a;
                if (str5 != null) {
                    InterfaceC29918a interfaceC29918a = this.f60141a;
                    c29949y.f60136a = null;
                    c29949y.f60137b = null;
                    c29949y.f60140e = 4;
                    objM70018a = ((C29914J) interfaceC29918a).f60051a.m69976a(str5, str3, str4, c29949y);
                }
                throw new SNSException.Unknown(new IllegalStateException("Applicant id missing"));
            }
            if (i12 != 4) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objM70018a);
        }
        C29570k0 c29570k0 = (C29570k0) objM70018a;
        if (c29570k0 != null) {
            return c29570k0;
        }
        throw new SNSException.Unknown(new IllegalStateException("Applicant id missing"));
        String str6 = (String) objM70018a;
        if (str6 != null) {
            InterfaceC29918a interfaceC29918a2 = this.f60141a;
            c29949y.f60136a = null;
            c29949y.f60137b = null;
            c29949y.f60140e = 2;
            Object objM69984b = ((C29914J) interfaceC29918a2).f60051a.m69984b(str6, str, str2, c29949y);
            if (objM69984b != coroutine_suspended) {
                return objM69984b;
            }
        } else {
            c29949y.f60136a = str;
            c29949y.f60137b = str2;
            c29949y.f60140e = 3;
            objM70018a = m70021b(c29949y);
            if (objM70018a != coroutine_suspended) {
                String str7 = str2;
                str3 = str;
                str4 = str7;
                str5 = (String) objM70018a;
                if (str5 != null) {
                    InterfaceC29918a interfaceC29918a3 = this.f60141a;
                    c29949y.f60136a = null;
                    c29949y.f60137b = null;
                    c29949y.f60140e = 4;
                    objM70018a = ((C29914J) interfaceC29918a3).f60051a.m69976a(str5, str3, str4, c29949y);
                }
                throw new SNSException.Unknown(new IllegalStateException("Applicant id missing"));
            }
        }
        return coroutine_suspended;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0059, code lost:
    
        if (r7 == r1) goto L23;
     */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m70012a(C29736H c29736h, ContinuationImpl continuationImpl) {
        C29942r c29942r;
        if (continuationImpl instanceof C29942r) {
            c29942r = (C29942r) continuationImpl;
            int i11 = c29942r.f60105d;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c29942r.f60105d = i11 - Integer.MIN_VALUE;
            } else {
                c29942r = new C29942r(this, continuationImpl);
            }
        } else {
            c29942r = new C29942r(this, continuationImpl);
        }
        Object objM70021b = c29942r.f60103b;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c29942r.f60105d;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objM70021b);
            c29942r.f60102a = c29736h;
            c29942r.f60105d = 1;
            objM70021b = m70021b(c29942r);
            if (objM70021b != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i12 == 1) {
            c29736h = c29942r.f60102a;
            ResultKt.throwOnFailure(objM70021b);
        } else {
            if (i12 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objM70021b);
        }
        return (C29752Y) objM70021b;
        String str = (String) objM70021b;
        if (str == null) {
            return null;
        }
        C29999b c29999b = this.f60142b;
        c29942r.f60102a = null;
        c29942r.f60105d = 2;
        objM70021b = c29999b.f60285a.m69971a(str, c29736h, c29942r);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0059, code lost:
    
        if (r7 == r1) goto L23;
     */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m70011a(C29733E c29733e, ContinuationImpl continuationImpl) {
        C29934j c29934j;
        if (continuationImpl instanceof C29934j) {
            c29934j = (C29934j) continuationImpl;
            int i11 = c29934j.f60075d;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c29934j.f60075d = i11 - Integer.MIN_VALUE;
            } else {
                c29934j = new C29934j(this, continuationImpl);
            }
        } else {
            c29934j = new C29934j(this, continuationImpl);
        }
        Object objM70021b = c29934j.f60073b;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c29934j.f60075d;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objM70021b);
            c29934j.f60072a = c29733e;
            c29934j.f60075d = 1;
            objM70021b = m70021b(c29934j);
            if (objM70021b != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i12 == 1) {
            c29733e = c29934j.f60072a;
            ResultKt.throwOnFailure(objM70021b);
        } else {
            if (i12 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objM70021b);
        }
        return (C29752Y) objM70021b;
        String str = (String) objM70021b;
        if (str == null) {
            return null;
        }
        C29999b c29999b = this.f60142b;
        c29934j.f60072a = null;
        c29934j.f60075d = 2;
        objM70021b = c29999b.f60285a.m69970a(str, c29733e, c29934j);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0059, code lost:
    
        if (r7 == r1) goto L23;
     */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m70013a(C29742N c29742n, ContinuationImpl continuationImpl) {
        C29940p c29940p;
        if (continuationImpl instanceof C29940p) {
            c29940p = (C29940p) continuationImpl;
            int i11 = c29940p.f60097d;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c29940p.f60097d = i11 - Integer.MIN_VALUE;
            } else {
                c29940p = new C29940p(this, continuationImpl);
            }
        } else {
            c29940p = new C29940p(this, continuationImpl);
        }
        Object objM70021b = c29940p.f60095b;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c29940p.f60097d;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objM70021b);
            c29940p.f60094a = c29742n;
            c29940p.f60097d = 1;
            objM70021b = m70021b(c29940p);
            if (objM70021b != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i12 == 1) {
            c29742n = c29940p.f60094a;
            ResultKt.throwOnFailure(objM70021b);
        } else {
            if (i12 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objM70021b);
        }
        return (C29752Y) objM70021b;
        String str = (String) objM70021b;
        if (str == null) {
            return null;
        }
        C29999b c29999b = this.f60142b;
        c29940p.f60094a = null;
        c29940p.f60097d = 2;
        objM70021b = c29999b.f60285a.m69972a(str, c29742n, c29940p);
    }

    /* JADX WARN: Code duplicated, block: B:39:0x0080 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:40:0x0081 A[Catch: Exception -> 0x0030, TryCatch #0 {Exception -> 0x0030, blocks: (B:13:0x002c, B:36:0x007a, B:37:0x007c, B:44:0x0090, B:40:0x0081, B:42:0x0087, B:19:0x003b, B:32:0x0066, B:22:0x0041, B:29:0x0055, B:33:0x0069, B:25:0x0048), top: B:48:0x0024 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0077, code lost:
    
        if (r9 == r1) goto L35;
     */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m70009a(C29310Y3 c29310y3, ContinuationImpl continuationImpl) {
        C29947w c29947w;
        C29227I c29227i;
        Integer num;
        if (continuationImpl instanceof C29947w) {
            c29947w = (C29947w) continuationImpl;
            int i11 = c29947w.f60125d;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c29947w.f60125d = i11 - Integer.MIN_VALUE;
            } else {
                c29947w = new C29947w(this, continuationImpl);
            }
        } else {
            c29947w = new C29947w(this, continuationImpl);
        }
        Object objM70018a = c29947w.f60123b;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c29947w.f60125d;
        try {
            if (i12 == 0) {
                ResultKt.throwOnFailure(objM70018a);
                c29947w.f60122a = c29310y3;
                c29947w.f60125d = 1;
                objM70018a = m70018a(c29947w);
                if (objM70018a == coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i12 != 1) {
                if (i12 == 2) {
                    ResultKt.throwOnFailure(objM70018a);
                    c29227i = (C29227I) objM70018a;
                    num = c29227i.f59218a;
                    if (num == null) {
                        Result.Companion companion = Result.INSTANCE;
                        return Result.m103844constructorimpl(Unit.INSTANCE);
                    }
                    Result.Companion companion2 = Result.INSTANCE;
                    return Result.m103844constructorimpl(ResultKt.createFailure(new SNSException.Unknown(null, 1, null)));
                }
                if (i12 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objM70018a);
                c29227i = (C29227I) objM70018a;
                num = c29227i.f59218a;
                if (num == null && num.intValue() == 1) {
                    Result.Companion companion3 = Result.INSTANCE;
                    return Result.m103844constructorimpl(Unit.INSTANCE);
                }
                Result.Companion companion4 = Result.INSTANCE;
                return Result.m103844constructorimpl(ResultKt.createFailure(new SNSException.Unknown(null, 1, null)));
            }
            c29310y3 = c29947w.f60122a;
            ResultKt.throwOnFailure(objM70018a);
            if (objM70018a != null) {
                InterfaceC29918a interfaceC29918a = this.f60141a;
                c29947w.f60122a = null;
                c29947w.f60125d = 2;
                objM70018a = ((C29914J) interfaceC29918a).f60051a.m69966a(c29310y3, c29947w);
                if (objM70018a == coroutine_suspended) {
                }
                c29227i = (C29227I) objM70018a;
                num = c29227i.f59218a;
                if (num == null) {
                    Result.Companion companion5 = Result.INSTANCE;
                    return Result.m103844constructorimpl(Unit.INSTANCE);
                }
                Result.Companion companion6 = Result.INSTANCE;
                return Result.m103844constructorimpl(ResultKt.createFailure(new SNSException.Unknown(null, 1, null)));
            }
            InterfaceC29918a interfaceC29918a2 = this.f60141a;
            c29947w.f60122a = null;
            c29947w.f60125d = 3;
            objM70018a = ((C29914J) interfaceC29918a2).f60051a.m69982b(c29310y3, c29947w);
            return coroutine_suspended;
        } catch (Exception e11) {
            C41783z1.m91406l(c29947w.get$context());
            Result.Companion companion7 = Result.INSTANCE;
            return Result.m103844constructorimpl(ResultKt.createFailure(e11));
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m70018a(ContinuationImpl continuationImpl) {
        C29929e c29929e;
        C29118g c29118g;
        if (continuationImpl instanceof C29929e) {
            c29929e = (C29929e) continuationImpl;
            int i11 = c29929e.f60065c;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c29929e.f60065c = i11 - Integer.MIN_VALUE;
            } else {
                c29929e = new C29929e(this, continuationImpl);
            }
        } else {
            c29929e = new C29929e(this, continuationImpl);
        }
        Object objM70045b = c29929e.f60063a;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c29929e.f60065c;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objM70045b);
            InterfaceC29984m interfaceC29984m = this.f60143c;
            c29929e.f60065c = 1;
            objM70045b = ((C29967J) interfaceC29984m).m70045b(false, c29929e);
            if (objM70045b == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objM70045b);
        }
        C29124h c29124h = (C29124h) ((AbstractC29971N) objM70045b).m70051c();
        if (c29124h == null || (c29118g = c29124h.f59091x) == null) {
            return null;
        }
        return c29118g.f59062a;
    }
}
