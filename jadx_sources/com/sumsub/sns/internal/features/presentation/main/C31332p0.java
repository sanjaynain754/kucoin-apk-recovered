package com.sumsub.sns.internal.features.presentation.main;

import androidx.lifecycle.SavedStateHandle;
import com.sumsub.sns.core.data.listener.SNSEvent;
import com.sumsub.sns.core.data.model.SNSCompletionResult;
import com.sumsub.sns.internal.core.analytics.C28368g;
import com.sumsub.sns.internal.core.analytics.StepAction;
import com.sumsub.sns.internal.core.common.AbstractC28409N0;
import com.sumsub.sns.internal.core.common.AbstractC28458h;
import com.sumsub.sns.internal.core.presentation.android.AbstractC28639a;
import com.sumsub.sns.internal.core.presentation.screen.base.C28936t;
import com.sumsub.sns.internal.features.data.model.common.AbstractC29130i;
import com.sumsub.sns.internal.features.data.model.common.AbstractC29172p;
import com.sumsub.sns.internal.features.data.model.common.C28994D3;
import com.sumsub.sns.internal.features.data.model.common.C29062V;
import com.sumsub.sns.internal.features.data.model.common.C29070X;
import com.sumsub.sns.internal.features.data.model.common.C29082a;
import com.sumsub.sns.internal.features.data.model.common.C29124h;
import com.sumsub.sns.internal.features.data.model.common.C29140j3;
import com.sumsub.sns.internal.features.data.model.common.C29154m;
import com.sumsub.sns.internal.features.data.model.common.Document;
import com.sumsub.sns.internal.features.data.model.common.ReviewStatusType;
import com.sumsub.sns.internal.features.data.repository.applicant.InterfaceC29921d;
import com.sumsub.sns.internal.features.data.repository.dynamic.AbstractC29971N;
import com.sumsub.sns.internal.features.data.repository.dynamic.C29967J;
import com.sumsub.sns.internal.features.data.repository.dynamic.C29983l;
import com.sumsub.sns.internal.features.data.repository.dynamic.InterfaceC29984m;
import com.sumsub.sns.internal.features.data.repository.settings.C30034c;
import com.sumsub.sns.internal.features.domain.appdata.C30096c;
import com.sumsub.sns.internal.features.domain.appdata.C30099f;
import com.sumsub.sns.internal.features.presentation.utils.AbstractC32665p;
import com.sumsub.sns.internal.features.presentation.utils.C32641a;
import com.sumsub.sns.internal.features.presentation.utils.C32649e;
import com.sumsub.sns.internal.log.C33270a;
import com.sumsub.sns.internal.log.C33272c;
import com.sumsub.sns.internal.p125ff.C33048a;
import com.sumsub.sns.internal.p125ff.core.C33050a;
import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.InterfaceC41775x1;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.collections.MapsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.reflect.KProperty;
import p852kotlin.text.StringsKt;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.main.p0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31332p0 {

    /* JADX INFO: renamed from: u */
    public static final /* synthetic */ KProperty[] f63490u = {AbstractC28639a.m69485a(C31332p0.class, "verificationStarted", "getVerificationStarted()Z", 0)};

    /* JADX INFO: renamed from: a */
    public final InterfaceC41709m0 f63491a;

    /* JADX INFO: renamed from: b */
    public final C30099f f63492b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC29984m f63493c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC29921d f63494d;

    /* JADX INFO: renamed from: e */
    public final C30034c f63495e;

    /* JADX INFO: renamed from: f */
    public final C31292k2 f63496f;

    /* JADX INFO: renamed from: g */
    public final Function0 f63497g;

    /* JADX INFO: renamed from: h */
    public final C31165A1 f63498h;

    /* JADX INFO: renamed from: i */
    public final C31168B1 f63499i;

    /* JADX INFO: renamed from: j */
    public final C31177E1 f63500j;

    /* JADX INFO: renamed from: k */
    public final C31174D1 f63501k;

    /* JADX INFO: renamed from: l */
    public final C31171C1 f63502l;

    /* JADX INFO: renamed from: m */
    public final C31186H1 f63503m;

    /* JADX INFO: renamed from: n */
    public final Function0 f63504n;

    /* JADX INFO: renamed from: o */
    public final C31180F1 f63505o;

    /* JADX INFO: renamed from: p */
    public final C31183G1 f63506p;

    /* JADX INFO: renamed from: q */
    public final long f63507q;

    /* JADX INFO: renamed from: r */
    public InterfaceC41775x1 f63508r;

    /* JADX INFO: renamed from: s */
    public final C28936t f63509s;

    /* JADX INFO: renamed from: t */
    public Document f63510t;

    /* JADX INFO: renamed from: a */
    public static final CharSequence m70681a(Document document) {
        return document.getType().f59014a;
    }

    /* JADX WARN: Code duplicated, block: B:55:0x00f4 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:56:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:83:0x0189  */
    /* JADX WARN: Code duplicated, block: B:84:0x018b  */
    /* JADX WARN: Code duplicated, block: B:86:0x018e  */
    /* JADX WARN: Code duplicated, block: B:87:0x0190  */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0150, code lost:
    
        if (m70683a((com.sumsub.sns.internal.features.data.model.common.C29082a) r2, r12, r5) == r6) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0181, code lost:
    
        if (m70686a(r2, r12, r1, r4, r5) == r6) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01c3, code lost:
    
        if (m70697c(false, r5) == r6) goto L90;
     */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m70696b(boolean z11, ContinuationImpl continuationImpl) {
        C31269h0 c31269h0;
        boolean z12;
        Object objM70111a;
        List list;
        AbstractC29172p abstractC29172p;
        C29124h c29124h;
        boolean z13;
        Object obj;
        AbstractC29172p abstractC29172p2;
        boolean z14;
        boolean z15;
        boolean z16;
        if (continuationImpl instanceof C31269h0) {
            c31269h0 = (C31269h0) continuationImpl;
            int i11 = c31269h0.f63347g;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c31269h0.f63347g = i11 - Integer.MIN_VALUE;
            } else {
                c31269h0 = new C31269h0(this, continuationImpl);
            }
        } else {
            c31269h0 = new C31269h0(this, continuationImpl);
        }
        C31269h0 c31269h1 = c31269h0;
        Object obj2 = c31269h1.f63345e;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c31269h1.f63347g;
        if (i12 == 0) {
            ResultKt.throwOnFailure(obj2);
            C30099f c30099f = this.f63492b;
            C28936t c28936t = this.f63509s;
            KProperty kProperty = f63490u[0];
            boolean zBooleanValue = ((Boolean) c28936t.m69705a()).booleanValue();
            InterfaceC29921d interfaceC29921d = this.f63494d;
            z12 = z11;
            c31269h1.f63341a = z12;
            c31269h1.f63347g = 1;
            objM70111a = c30099f.m70111a(zBooleanValue, interfaceC29921d, c31269h1);
            if (objM70111a != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i12 != 1) {
            if (i12 != 2) {
                if (i12 == 3) {
                    ResultKt.throwOnFailure(obj2);
                    return Unit.INSTANCE;
                }
                if (i12 == 4) {
                    ResultKt.throwOnFailure(obj2);
                    return Unit.INSTANCE;
                }
                if (i12 != 5) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj2);
                return Unit.INSTANCE;
            }
            z14 = c31269h1.f63341a;
            abstractC29172p2 = c31269h1.f63344d;
            list = c31269h1.f63343c;
            obj = c31269h1.f63342b;
            ResultKt.throwOnFailure(obj2);
            c29124h = (C29124h) ((AbstractC29971N) obj2).m70052d();
            AbstractC29172p abstractC29172p3 = abstractC29172p2;
            z13 = z14;
            abstractC29172p = abstractC29172p3;
            objM70111a = obj;
            C29124h c29124h2 = c29124h;
            if (abstractC29172p != null || list == null) {
                if (abstractC29172p == null) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (list == null) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                C33272c.f67816e.f67810a.mo68955d("SNSAppViewModel2", "moveToNextDocument; applicant==null ? " + z15 + "; documents==null ? " + z16 + "; ", null);
                c31269h1.f63342b = null;
                c31269h1.f63343c = null;
                c31269h1.f63344d = null;
                c31269h1.f63347g = 3;
            } else {
                C33272c.f67816e.f67810a.mo68955d("SNSAppViewModel2", "moveToNextDocument, flowType=" + c29124h2.f59069b + ", documents: " + CollectionsKt.joinToString$default(list, null, null, null, 0, null, new Function1() { // from class: com.sumsub.sns.internal.features.presentation.main.y2
                    @Override // p852kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj3) {
                        return C31332p0.m70681a((Document) obj3);
                    }
                }, 31, null), null);
                if (AbstractC29130i.m69785k(c29124h2)) {
                    c31269h1.f63342b = null;
                    c31269h1.f63343c = null;
                    c31269h1.f63344d = null;
                    c31269h1.f63347g = 4;
                } else {
                    if (Result.m103850isFailureimpl(objM70111a)) {
                        objM70111a = null;
                    }
                    C30096c c30096c = (C30096c) objM70111a;
                    ReviewStatusType reviewStatusType = c30096c != null ? c30096c.f60498c : null;
                    boolean z17 = z13 || abstractC29172p.m69800p();
                    c31269h1.f63342b = null;
                    c31269h1.f63343c = null;
                    c31269h1.f63344d = null;
                    c31269h1.f63347g = 5;
                }
            }
            return coroutine_suspended;
        }
        boolean z18 = c31269h1.f63341a;
        ResultKt.throwOnFailure(obj2);
        objM70111a = ((Result) obj2).getValue();
        z12 = z18;
        if (!Result.m103851isSuccessimpl(objM70111a)) {
            this.f63500j.invoke((Exception) Result.m103847exceptionOrNullimpl(objM70111a), "TYPE_UNKNOWN");
            return Unit.INSTANCE;
        }
        C30096c c30096c2 = (C30096c) (Result.m103850isFailureimpl(objM70111a) ? null : objM70111a);
        list = c30096c2 != null ? c30096c2.f60497b : null;
        C30096c c30096c3 = (C30096c) (Result.m103850isFailureimpl(objM70111a) ? null : objM70111a);
        abstractC29172p = c30096c3 != null ? c30096c3.f60496a : null;
        c29124h = (C29124h) this.f63497g.invoke();
        if (c29124h == null) {
            InterfaceC29984m interfaceC29984m = this.f63493c;
            c31269h1.f63342b = objM70111a;
            c31269h1.f63343c = list;
            c31269h1.f63344d = abstractC29172p;
            c31269h1.f63341a = z12;
            c31269h1.f63347g = 2;
            Object objM70045b = ((C29967J) interfaceC29984m).m70045b(true, c31269h1);
            if (objM70045b != coroutine_suspended) {
                boolean z19 = z12;
                obj = objM70111a;
                obj2 = objM70045b;
                abstractC29172p2 = abstractC29172p;
                z14 = z19;
                c29124h = (C29124h) ((AbstractC29971N) obj2).m70052d();
                AbstractC29172p abstractC29172p4 = abstractC29172p2;
                z13 = z14;
                abstractC29172p = abstractC29172p4;
                objM70111a = obj;
                C29124h c29124h3 = c29124h;
                if (abstractC29172p != null) {
                    if (abstractC29172p == null) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    if (list == null) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    C33272c.f67816e.f67810a.mo68955d("SNSAppViewModel2", "moveToNextDocument; applicant==null ? " + z15 + "; documents==null ? " + z16 + "; ", null);
                    c31269h1.f63342b = null;
                    c31269h1.f63343c = null;
                    c31269h1.f63344d = null;
                    c31269h1.f63347g = 3;
                } else {
                    if (abstractC29172p == null) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    if (list == null) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    C33272c.f67816e.f67810a.mo68955d("SNSAppViewModel2", "moveToNextDocument; applicant==null ? " + z15 + "; documents==null ? " + z16 + "; ", null);
                    c31269h1.f63342b = null;
                    c31269h1.f63343c = null;
                    c31269h1.f63344d = null;
                    c31269h1.f63347g = 3;
                }
            }
        } else {
            z13 = z12;
            C29124h c29124h4 = c29124h;
            if (abstractC29172p != null) {
                if (abstractC29172p == null) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (list == null) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                C33272c.f67816e.f67810a.mo68955d("SNSAppViewModel2", "moveToNextDocument; applicant==null ? " + z15 + "; documents==null ? " + z16 + "; ", null);
                c31269h1.f63342b = null;
                c31269h1.f63343c = null;
                c31269h1.f63344d = null;
                c31269h1.f63347g = 3;
            } else {
                if (abstractC29172p == null) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (list == null) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                C33272c.f67816e.f67810a.mo68955d("SNSAppViewModel2", "moveToNextDocument; applicant==null ? " + z15 + "; documents==null ? " + z16 + "; ", null);
                c31269h1.f63342b = null;
                c31269h1.f63343c = null;
                c31269h1.f63344d = null;
                c31269h1.f63347g = 3;
            }
        }
        return coroutine_suspended;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0085, code lost:
    
        if (m70689a(r8, r9, r0) == r1) goto L25;
     */
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m70697c(boolean z11, ContinuationImpl continuationImpl) {
        C31290k0 c31290k0;
        if (continuationImpl instanceof C31290k0) {
            c31290k0 = (C31290k0) continuationImpl;
            int i11 = c31290k0.f63406d;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c31290k0.f63406d = i11 - Integer.MIN_VALUE;
            } else {
                c31290k0 = new C31290k0(this, continuationImpl);
            }
        } else {
            c31290k0 = new C31290k0(this, continuationImpl);
        }
        Object objM70045b = c31290k0.f63404b;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c31290k0.f63406d;
        if (i12 != 0) {
            if (i12 == 1) {
                z11 = c31290k0.f63403a;
                ResultKt.throwOnFailure(objM70045b);
            } else {
                if (i12 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objM70045b);
            }
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(objM70045b);
        C33272c.f67816e.f67810a.mo68955d("SNSAppViewModel2", "onStepComplete, isCancelled=" + z11, null);
        InterfaceC29984m interfaceC29984m = this.f63493c;
        c31290k0.f63403a = z11;
        c31290k0.f63406d = 1;
        objM70045b = ((C29967J) interfaceC29984m).m70045b(false, c31290k0);
        if (objM70045b != coroutine_suspended) {
        }
        return coroutine_suspended;
        AbstractC29971N abstractC29971N = (AbstractC29971N) objM70045b;
        Throwable thMo70049a = abstractC29971N.mo70049a();
        if (thMo70049a != null) {
            this.f63505o.invoke(thMo70049a);
            return Unit.INSTANCE;
        }
        C29124h c29124h = (C29124h) abstractC29971N.m70051c();
        c31290k0.f63406d = 2;
    }

    public C31332p0(InterfaceC41709m0 interfaceC41709m0, C30099f c30099f, InterfaceC29984m interfaceC29984m, InterfaceC29921d interfaceC29921d, C30034c c30034c, C31292k2 c31292k2, Function0 function0, C31165A1 c31165a1, C31168B1 c31168b1, C31177E1 c31177e1, C31174D1 c31174d1, C31171C1 c31171c1, C31186H1 c31186h1, Function0 function1, C31180F1 c31180f1, C31183G1 c31183g1, SavedStateHandle savedStateHandle) {
        long jLongValue;
        String str;
        Long longOrNull;
        this.f63491a = interfaceC41709m0;
        this.f63492b = c30099f;
        this.f63493c = interfaceC29984m;
        this.f63494d = interfaceC29921d;
        this.f63495e = c30034c;
        this.f63496f = c31292k2;
        this.f63497g = function0;
        this.f63498h = c31165a1;
        this.f63499i = c31168b1;
        this.f63500j = c31177e1;
        this.f63501k = c31174d1;
        this.f63502l = c31171c1;
        this.f63503m = c31186h1;
        this.f63504n = function1;
        this.f63505o = c31180f1;
        this.f63506p = c31183g1;
        C33050a c33050a = C33048a.f67449L;
        if (c33050a.m71434a() && (str = c33050a.m71435b().f67504b) != null && (longOrNull = StringsKt.toLongOrNull(str)) != null) {
            jLongValue = longOrNull.longValue();
        } else {
            jLongValue = 5000;
        }
        this.f63507q = jLongValue;
        this.f63509s = new C28936t(savedStateHandle, "VERIFICATION_STARTED", Boolean.FALSE, false);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x006f, code lost:
    
        if (m70697c(r7, r0) == r1) goto L26;
     */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m70691a(boolean z11, boolean z12, ContinuationImpl continuationImpl) {
        C31286j0 c31286j0;
        if (continuationImpl instanceof C31286j0) {
            c31286j0 = (C31286j0) continuationImpl;
            int i11 = c31286j0.f63398e;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c31286j0.f63398e = i11 - Integer.MIN_VALUE;
            } else {
                c31286j0 = new C31286j0(this, continuationImpl);
            }
        } else {
            c31286j0 = new C31286j0(this, continuationImpl);
        }
        Object obj = c31286j0.f63396c;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c31286j0.f63398e;
        if (i12 == 0) {
            ResultKt.throwOnFailure(obj);
            c31286j0.f63394a = z11;
            c31286j0.f63395b = z12;
            c31286j0.f63398e = 1;
            if (m70690a(z11, c31286j0) != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i12 == 1) {
            z12 = c31286j0.f63395b;
            z11 = c31286j0.f63394a;
            ResultKt.throwOnFailure(obj);
        } else if (i12 == 2) {
            z11 = c31286j0.f63394a;
            ResultKt.throwOnFailure(obj);
            ((Result) obj).getValue();
            c31286j0.f63398e = 3;
        } else {
            if (i12 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
        C30099f c30099f = this.f63492b;
        InterfaceC29921d interfaceC29921d = this.f63494d;
        c31286j0.f63394a = z11;
        c31286j0.f63398e = 2;
        if (c30099f.m70111a(z12, interfaceC29921d, c31286j0) != coroutine_suspended) {
            c31286j0.f63398e = 3;
        }
        return coroutine_suspended;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00bc, code lost:
    
        if (m70696b(false, r0) == r1) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0164, code lost:
    
        if (m70696b(true, r0) == r1) goto L74;
     */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m70685a(AbstractC29172p abstractC29172p, C29124h c29124h, boolean z11, boolean z12, ContinuationImpl continuationImpl) {
        C31294l0 c31294l0;
        if (continuationImpl instanceof C31294l0) {
            c31294l0 = (C31294l0) continuationImpl;
            int i11 = c31294l0.f63418g;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c31294l0.f63418g = i11 - Integer.MIN_VALUE;
            } else {
                c31294l0 = new C31294l0(this, continuationImpl);
            }
        } else {
            c31294l0 = new C31294l0(this, continuationImpl);
        }
        Object objM70688a = c31294l0.f63416e;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c31294l0.f63418g;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objM70688a);
            C33272c.f67816e.f67810a.mo68955d("SNSAppViewModel2", "proceedWithApplicantStatus: status=" + abstractC29172p.mo69762m().f59165b + ", isCancelled=" + z12, null);
            c31294l0.f63412a = abstractC29172p;
            c31294l0.f63413b = c29124h;
            c31294l0.f63414c = z11;
            c31294l0.f63415d = z12;
            c31294l0.f63418g = 1;
            objM70688a = m70688a(c31294l0);
            if (objM70688a != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i12 != 1) {
            if (i12 == 2) {
                ResultKt.throwOnFailure(objM70688a);
                return Unit.INSTANCE;
            }
            if (i12 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objM70688a);
            return Unit.INSTANCE;
        }
        z12 = c31294l0.f63415d;
        z11 = c31294l0.f63414c;
        c29124h = c31294l0.f63413b;
        abstractC29172p = c31294l0.f63412a;
        ResultKt.throwOnFailure(objM70688a);
        boolean zBooleanValue = ((Boolean) objM70688a).booleanValue();
        ReviewStatusType reviewStatusType = abstractC29172p.mo69762m().f59165b;
        ReviewStatusType reviewStatusType2 = ReviewStatusType.Init;
        if (reviewStatusType != reviewStatusType2 || !AbstractC29130i.m69778d(c29124h) || !z11 || abstractC29172p.m69797d()) {
            if (abstractC29172p.mo69762m().f59165b == reviewStatusType2 && AbstractC29130i.m69777c(c29124h) && !z11) {
                this.f63502l.invoke(SNSCompletionResult.SuccessTermination.INSTANCE);
            } else if (abstractC29172p.mo69762m().f59165b == ReviewStatusType.Pending && AbstractC29130i.m69777c(c29124h) && !zBooleanValue) {
                this.f63502l.invoke(SNSCompletionResult.SuccessTermination.INSTANCE);
            } else if (abstractC29172p.mo69762m().f59165b == ReviewStatusType.Prechecked && AbstractC29130i.m69777c(c29124h) && !zBooleanValue) {
                this.f63502l.invoke(SNSCompletionResult.SuccessTermination.INSTANCE);
            } else if ((abstractC29172p.mo69762m().f59165b == ReviewStatusType.RequiresAction || abstractC29172p.mo69762m().f59165b == ReviewStatusType.AwaitingService) && AbstractC29130i.m69777c(c29124h) && !zBooleanValue) {
                this.f63502l.invoke(SNSCompletionResult.SuccessTermination.INSTANCE);
            } else if (abstractC29172p.m69799o() && AbstractC29130i.m69775b(c29124h)) {
                this.f63502l.invoke(SNSCompletionResult.SuccessTermination.INSTANCE);
            } else if (!abstractC29172p.m69800p() || !AbstractC29130i.m69779e(c29124h)) {
                this.f63496f.f63411a.clear();
                this.f63498h.invoke(C31335q.f63516c);
            } else if (z11 && !z12) {
                c31294l0.f63412a = null;
                c31294l0.f63413b = null;
                c31294l0.f63418g = 3;
            } else {
                this.f63502l.invoke(SNSCompletionResult.SuccessTermination.INSTANCE);
            }
            return Unit.INSTANCE;
        }
        if (z12) {
            this.f63502l.invoke(SNSCompletionResult.SuccessTermination.INSTANCE);
            return Unit.INSTANCE;
        }
        c31294l0.f63412a = null;
        c31294l0.f63413b = null;
        c31294l0.f63418g = 2;
    }

    /* JADX INFO: renamed from: a */
    public final void m70692a() {
        this.f63506p.invoke(Boolean.FALSE);
        if (this.f63508r != null) {
            C33272c.f67816e.f67810a.mo68955d("SNSAppViewModel2", "cancelWaitForLevelChange", null);
        }
        InterfaceC41775x1 interfaceC41775x1 = this.f63508r;
        if (interfaceC41775x1 != null) {
            InterfaceC41775x1.a.m91377a(interfaceC41775x1, null, 1, null);
        }
        this.f63508r = null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0075, code lost:
    
        if (m70689a(false, r7, (p852kotlin.coroutines.jvm.internal.ContinuationImpl) r0) == r1) goto L29;
     */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m70684a(C29124h c29124h, ContinuationImpl continuationImpl) {
        C31257e0 c31257e0;
        if (continuationImpl instanceof C31257e0) {
            c31257e0 = (C31257e0) continuationImpl;
            int i11 = c31257e0.f63308d;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c31257e0.f63308d = i11 - Integer.MIN_VALUE;
            } else {
                c31257e0 = new C31257e0(this, continuationImpl);
            }
        } else {
            c31257e0 = new C31257e0(this, continuationImpl);
        }
        Object objM70042a = c31257e0.f63306b;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c31257e0.f63308d;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objM70042a);
            InterfaceC29984m interfaceC29984m = this.f63493c;
            c31257e0.f63305a = c29124h;
            c31257e0.f63308d = 1;
            objM70042a = ((C29967J) interfaceC29984m).m70042a(false, (Continuation) c31257e0);
            if (objM70042a != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i12 == 1) {
            c29124h = c31257e0.f63305a;
            ResultKt.throwOnFailure(objM70042a);
        } else {
            if (i12 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objM70042a);
        }
        return Unit.INSTANCE;
        AbstractC29971N abstractC29971N = (AbstractC29971N) objM70042a;
        AbstractC29172p abstractC29172p = (AbstractC29172p) abstractC29971N.m70051c();
        if (abstractC29172p == null || !(abstractC29172p instanceof C29082a)) {
            this.f63502l.invoke(new SNSCompletionResult.AbnormalTermination(abstractC29971N.mo70049a()));
            return Unit.INSTANCE;
        }
        if (c29124h != null) {
            if (((C29154m) CollectionsKt.firstOrNull(abstractC29172p.mo69760k().f59151a)) != null) {
                c31257e0.f63305a = null;
                c31257e0.f63308d = 2;
            } else {
                throw new InvalidParameterException("No doc set item found");
            }
        } else {
            throw new InvalidParameterException("Config for action is null");
        }
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:39:0x0106  */
    /* JADX WARN: Code duplicated, block: B:43:0x010f  */
    /* JADX WARN: Code duplicated, block: B:46:0x0119  */
    /* JADX WARN: Code duplicated, block: B:48:0x0125  */
    /* JADX WARN: Code duplicated, block: B:62:0x0155  */
    /* JADX WARN: Code duplicated, block: B:76:0x012d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:77:0x013b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:78:0x0139 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:79:0x0139 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:81:0x0113 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:82:0x0113 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x01ad, code lost:
    
        if (m70685a(r15, r2, r3, r4, r5) == r6) goto L69;
     */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m70689a(boolean z11, C29124h c29124h, ContinuationImpl continuationImpl) {
        C31298m0 c31298m0;
        Object objM70111a;
        C29124h c29124h2;
        List list;
        ReviewStatusType reviewStatusType;
        C32641a c32641a;
        C29124h c29124h3;
        AbstractC29172p abstractC29172p;
        boolean z12;
        C29124h c29124h4;
        AbstractC29172p abstractC29172p2;
        List list2;
        Iterator it;
        Document document;
        boolean z13;
        C31292k2 c31292k2;
        C28994D3 c28994d3;
        boolean z14 = z11;
        if (continuationImpl instanceof C31298m0) {
            c31298m0 = (C31298m0) continuationImpl;
            int i11 = c31298m0.f63433k;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c31298m0.f63433k = i11 - Integer.MIN_VALUE;
            } else {
                c31298m0 = new C31298m0(this, continuationImpl);
            }
        } else {
            c31298m0 = new C31298m0(this, continuationImpl);
        }
        C31298m0 c31298m1 = c31298m0;
        Object objInvokeSuspend = c31298m1.f63431i;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c31298m1.f63433k;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objInvokeSuspend);
            C33272c.f67816e.f67810a.mo68955d("SNSAppViewModel2", "resolveApplicantStatus: isCancelled=" + z14, null);
            C30099f c30099f = this.f63492b;
            InterfaceC29921d interfaceC29921d = this.f63494d;
            c31298m1.f63424b = c29124h;
            c31298m1.f63423a = z14;
            c31298m1.f63433k = 1;
            objM70111a = c30099f.m70111a(false, interfaceC29921d, c31298m1);
            if (objM70111a != coroutine_suspended) {
                c29124h2 = c29124h;
            }
            return coroutine_suspended;
        }
        if (i12 == 1) {
            z14 = c31298m1.f63423a;
            c29124h2 = c31298m1.f63424b;
            ResultKt.throwOnFailure(objInvokeSuspend);
            objM70111a = ((Result) objInvokeSuspend).getValue();
        } else if (i12 == 2) {
            boolean z15 = c31298m1.f63423a;
            abstractC29172p2 = c31298m1.f63430h;
            c29124h3 = c31298m1.f63429g;
            c32641a = c31298m1.f63428f;
            reviewStatusType = c31298m1.f63427e;
            list = c31298m1.f63426d;
            abstractC29172p = c31298m1.f63425c;
            C29124h c29124h5 = c31298m1.f63424b;
            ResultKt.throwOnFailure(objInvokeSuspend);
            z12 = z15;
            c29124h4 = c29124h5;
            list2 = ((C29983l) objInvokeSuspend).f60249b;
            c32641a.getClass();
            if (C32641a.m71260a(c29124h3, abstractC29172p2, list2)) {
                this.f63498h.invoke(C31297m.f63422c);
                return Unit.INSTANCE;
            }
            if (list == null && list.isEmpty()) {
                z13 = false;
            } else {
                it = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        document = (Document) it.next();
                        if (document.isSubmitted()) {
                            c31292k2 = this.f63496f;
                            if (document.isRejected()) {
                                if (!c31292k2.f63411a.contains(document.getType())) {
                                }
                            }
                        }
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                }
            }
            if (!abstractC29172p.mo69760k().f59152b && m70695a(abstractC29172p, list, reviewStatusType, z12)) {
                return Unit.INSTANCE;
            }
            c28994d3 = abstractC29172p.mo69761l().f59119c;
            if (!(c28994d3 != null ? Intrinsics.areEqual(c28994d3.f58921a, Boxing.boxBoolean(true)) : false) && !z13) {
                this.f63506p.invoke(Boolean.TRUE);
                C33272c.f67816e.f67810a.mo68955d("SNSAppViewModel2", "waiting for possible level change ...", null);
                this.f63498h.invoke(C31241a0.f63208a);
                this.f63508r = C41696j.m91104d(this.f63491a, null, null, new C31302n0(this, abstractC29172p, c29124h4, z12, null), 3, null);
                return Unit.INSTANCE;
            }
            C29124h c29124h6 = c29124h4;
            c31298m1.f63424b = null;
            c31298m1.f63425c = null;
            c31298m1.f63426d = null;
            c31298m1.f63427e = null;
            c31298m1.f63428f = null;
            c31298m1.f63429g = null;
            c31298m1.f63430h = null;
            c31298m1.f63433k = 3;
        } else {
            if (i12 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objInvokeSuspend);
        }
        return Unit.INSTANCE;
        if (c29124h2 != null && !Result.m103850isFailureimpl(objM70111a)) {
            if (this.f63508r != null) {
                C33272c.f67816e.f67810a.mo68955d("SNSAppViewModel2", "resolveApplicantStatus: waiting for level change, do nothing", null);
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(objM70111a);
            C30096c c30096c = (C30096c) objM70111a;
            AbstractC29172p abstractC29172p3 = c30096c.f60496a;
            list = c30096c.f60497b;
            reviewStatusType = c30096c.f60498c;
            c32641a = C32649e.f66642b;
            C31186H1 c31186h1 = this.f63503m;
            c31298m1.f63424b = c29124h2;
            c31298m1.f63425c = abstractC29172p3;
            c31298m1.f63426d = list;
            c31298m1.f63427e = reviewStatusType;
            c31298m1.f63428f = c32641a;
            c31298m1.f63429g = c29124h2;
            c31298m1.f63430h = abstractC29172p3;
            c31298m1.f63423a = z14;
            c31298m1.f63433k = 2;
            objInvokeSuspend = new C31186H1(c31186h1.f63049b, c31298m1).invokeSuspend(Unit.INSTANCE);
            if (objInvokeSuspend != coroutine_suspended) {
                c29124h3 = c29124h2;
                abstractC29172p = abstractC29172p3;
                z12 = z14;
                c29124h4 = c29124h3;
                abstractC29172p2 = abstractC29172p;
                list2 = ((C29983l) objInvokeSuspend).f60249b;
                c32641a.getClass();
                if (C32641a.m71260a(c29124h3, abstractC29172p2, list2)) {
                    this.f63498h.invoke(C31297m.f63422c);
                    return Unit.INSTANCE;
                }
                if (list == null) {
                    it = list.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            document = (Document) it.next();
                            if (document.isSubmitted()) {
                                c31292k2 = this.f63496f;
                                if (document.isRejected()) {
                                    if (!c31292k2.f63411a.contains(document.getType())) {
                                    }
                                }
                            }
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                    }
                } else {
                    it = list.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            document = (Document) it.next();
                            if (document.isSubmitted()) {
                                c31292k2 = this.f63496f;
                                if (document.isRejected()) {
                                    if (!c31292k2.f63411a.contains(document.getType())) {
                                    }
                                }
                            }
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                    }
                }
                if (!abstractC29172p.mo69760k().f59152b) {
                }
                c28994d3 = abstractC29172p.mo69761l().f59119c;
                if (!(c28994d3 != null ? Intrinsics.areEqual(c28994d3.f58921a, Boxing.boxBoolean(true)) : false)) {
                }
                C29124h c29124h7 = c29124h4;
                c31298m1.f63424b = null;
                c31298m1.f63425c = null;
                c31298m1.f63426d = null;
                c31298m1.f63427e = null;
                c31298m1.f63428f = null;
                c31298m1.f63429g = null;
                c31298m1.f63430h = null;
                c31298m1.f63433k = 3;
            }
            return coroutine_suspended;
        }
        boolean z16 = c29124h2 == null;
        C33272c.f67816e.f67810a.mo68955d("SNSAppViewModel2", "Config is null (" + z16 + ") or applicant update result (" + Result.m103850isFailureimpl(objM70111a) + "), going to status screen", null);
        this.f63496f.f63411a.clear();
        this.f63498h.invoke(C31335q.f63516c);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m70695a(AbstractC29172p abstractC29172p, List list, ReviewStatusType reviewStatusType, boolean z11) {
        List list2;
        if (!AbstractC28458h.m69335a(list, abstractC29172p).isEmpty() && AbstractC28458h.m69347a(abstractC29172p, reviewStatusType)) {
            C33272c.f67816e.f67810a.mo68955d("SNSAppViewModel2", "resolveApplicantStatusWithVideoIdent: applicantStatus=" + abstractC29172p.mo69762m().f59165b + ", viStatus=" + reviewStatusType, null);
            if (z11 && !abstractC29172p.m69797d()) {
                this.f63502l.invoke(SNSCompletionResult.SuccessTermination.INSTANCE);
                return true;
            }
            if (!abstractC29172p.m69797d()) {
                ArrayList arrayList = new ArrayList();
                for (Object obj : list) {
                    Document document = (Document) obj;
                    if (abstractC29172p.mo69760k().f59152b && ((list2 = abstractC29172p.mo69760k().f59154d) == null || !list2.contains(document.getType().f59014a))) {
                        arrayList.add(obj);
                    }
                }
                if (!arrayList.isEmpty()) {
                    int size = arrayList.size();
                    int i11 = 0;
                    while (i11 < size) {
                        Object obj2 = arrayList.get(i11);
                        i11++;
                        if (((Document) obj2).isRejected()) {
                        }
                    }
                }
            }
            this.f63496f.f63411a.clear();
            this.f63498h.invoke(C31335q.f63516c);
            return true;
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:42:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:45:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:54:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00a4, code lost:
    
        if (m70682a(r14, r2) == r3) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00de, code lost:
    
        if (m70687a(r0, r2) == r3) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00fe, code lost:
    
        if (m70697c(false, r2) == r3) goto L56;
     */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m70686a(AbstractC29172p abstractC29172p, List list, ReviewStatusType reviewStatusType, boolean z11, ContinuationImpl continuationImpl) {
        C31273i0 c31273i0;
        ReviewStatusType reviewStatusType2;
        boolean z12;
        List list2;
        AbstractC29172p abstractC29172p2;
        Document document;
        ArrayList arrayListM69335a;
        if (continuationImpl instanceof C31273i0) {
            c31273i0 = (C31273i0) continuationImpl;
            int i11 = c31273i0.f63365g;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c31273i0.f63365g = i11 - Integer.MIN_VALUE;
            } else {
                c31273i0 = new C31273i0(this, continuationImpl);
            }
        } else {
            c31273i0 = new C31273i0(this, continuationImpl);
        }
        Object obj = c31273i0.f63363e;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c31273i0.f63365g;
        if (i12 == 0) {
            ResultKt.throwOnFailure(obj);
            Document documentM70661a = AbstractC31259e2.m70661a(list, abstractC29172p, this.f63496f);
            if (documentM70661a != null) {
                Document document2 = this.f63510t;
                if (!Intrinsics.areEqual(document2 != null ? document2.getType() : null, documentM70661a.getType())) {
                    c31273i0.f63359a = abstractC29172p;
                    c31273i0.f63360b = documentM70661a;
                    c31273i0.f63365g = 1;
                    if (m70690a(false, (ContinuationImpl) c31273i0) != coroutine_suspended) {
                        abstractC29172p2 = abstractC29172p;
                        document = documentM70661a;
                        m70694a(abstractC29172p2, document);
                        c31273i0.f63359a = null;
                        c31273i0.f63360b = null;
                        c31273i0.f63365g = 2;
                    }
                } else {
                    c31273i0.f63359a = abstractC29172p;
                    c31273i0.f63360b = list;
                    reviewStatusType2 = reviewStatusType;
                    c31273i0.f63361c = reviewStatusType2;
                    z12 = z11;
                    c31273i0.f63362d = z12;
                    c31273i0.f63365g = 3;
                    if (m70690a(false, (ContinuationImpl) c31273i0) != coroutine_suspended) {
                        list2 = list;
                        arrayListM69335a = AbstractC28458h.m69335a(list2, abstractC29172p);
                        if (arrayListM69335a.isEmpty()) {
                            c31273i0.f63359a = null;
                            c31273i0.f63360b = null;
                            c31273i0.f63361c = null;
                            c31273i0.f63365g = 5;
                        } else {
                            c31273i0.f63359a = null;
                            c31273i0.f63360b = null;
                            c31273i0.f63361c = null;
                            c31273i0.f63365g = 5;
                        }
                    }
                }
            } else {
                c31273i0.f63359a = abstractC29172p;
                c31273i0.f63360b = list;
                reviewStatusType2 = reviewStatusType;
                c31273i0.f63361c = reviewStatusType2;
                z12 = z11;
                c31273i0.f63362d = z12;
                c31273i0.f63365g = 3;
                if (m70690a(false, (ContinuationImpl) c31273i0) != coroutine_suspended) {
                    list2 = list;
                    arrayListM69335a = AbstractC28458h.m69335a(list2, abstractC29172p);
                    if (arrayListM69335a.isEmpty()) {
                        c31273i0.f63359a = null;
                        c31273i0.f63360b = null;
                        c31273i0.f63361c = null;
                        c31273i0.f63365g = 5;
                    } else {
                        c31273i0.f63359a = null;
                        c31273i0.f63360b = null;
                        c31273i0.f63361c = null;
                        c31273i0.f63365g = 5;
                    }
                }
            }
            return coroutine_suspended;
        }
        if (i12 == 1) {
            document = (Document) c31273i0.f63360b;
            abstractC29172p2 = c31273i0.f63359a;
            ResultKt.throwOnFailure(obj);
            m70694a(abstractC29172p2, document);
            c31273i0.f63359a = null;
            c31273i0.f63360b = null;
            c31273i0.f63365g = 2;
        } else {
            if (i12 != 2) {
                if (i12 != 3) {
                    if (i12 == 4) {
                        ResultKt.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    if (i12 != 5) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
                boolean z13 = c31273i0.f63362d;
                ReviewStatusType reviewStatusType3 = c31273i0.f63361c;
                List list3 = (List) c31273i0.f63360b;
                AbstractC29172p abstractC29172p3 = c31273i0.f63359a;
                ResultKt.throwOnFailure(obj);
                reviewStatusType2 = reviewStatusType3;
                list2 = list3;
                z12 = z13;
                abstractC29172p = abstractC29172p3;
                arrayListM69335a = AbstractC28458h.m69335a(list2, abstractC29172p);
                if (arrayListM69335a.isEmpty() && AbstractC28458h.m69347a(abstractC29172p, reviewStatusType2)) {
                    if (z12) {
                        c31273i0.f63359a = null;
                        c31273i0.f63360b = null;
                        c31273i0.f63361c = null;
                        c31273i0.f63365g = 4;
                    } else {
                        this.f63496f.f63411a.clear();
                        this.f63498h.invoke(C31335q.f63516c);
                    }
                    return Unit.INSTANCE;
                }
                c31273i0.f63359a = null;
                c31273i0.f63360b = null;
                c31273i0.f63361c = null;
                c31273i0.f63365g = 5;
                return coroutine_suspended;
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x008f  */
    /* JADX WARN: Code duplicated, block: B:40:0x0098  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0089, code lost:
    
        if (m70682a(r11, r0) == r1) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x009e, code lost:
    
        if (m70697c(false, r0) == r1) goto L42;
     */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m70683a(C29082a c29082a, List list, ContinuationImpl continuationImpl) {
        C31265g0 c31265g0;
        C29082a c29082a2;
        Document document;
        if (continuationImpl instanceof C31265g0) {
            c31265g0 = (C31265g0) continuationImpl;
            int i11 = c31265g0.f63331e;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c31265g0.f63331e = i11 - Integer.MIN_VALUE;
            } else {
                c31265g0 = new C31265g0(this, continuationImpl);
            }
        } else {
            c31265g0 = new C31265g0(this, continuationImpl);
        }
        Object obj = c31265g0.f63329c;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c31265g0.f63331e;
        if (i12 == 0) {
            ResultKt.throwOnFailure(obj);
            Document documentM70661a = AbstractC31259e2.m70661a(list, c29082a, this.f63496f);
            if (documentM70661a != null) {
                Document document2 = this.f63510t;
                if (!Intrinsics.areEqual(document2 != null ? document2.getType() : null, documentM70661a.getType())) {
                    c31265g0.f63327a = c29082a;
                    c31265g0.f63328b = documentM70661a;
                    c31265g0.f63331e = 1;
                    if (m70690a(false, (ContinuationImpl) c31265g0) != coroutine_suspended) {
                        c29082a2 = c29082a;
                        document = documentM70661a;
                        m70693a(c29082a2, document);
                        c31265g0.f63327a = null;
                        c31265g0.f63328b = null;
                        c31265g0.f63331e = 2;
                    }
                } else {
                    c31265g0.f63331e = 3;
                    if (m70690a(false, (ContinuationImpl) c31265g0) != coroutine_suspended) {
                        c31265g0.f63331e = 4;
                    }
                }
            } else {
                c31265g0.f63331e = 3;
                if (m70690a(false, (ContinuationImpl) c31265g0) != coroutine_suspended) {
                    c31265g0.f63331e = 4;
                }
            }
            return coroutine_suspended;
        }
        if (i12 == 1) {
            document = c31265g0.f63328b;
            c29082a2 = c31265g0.f63327a;
            ResultKt.throwOnFailure(obj);
            m70693a(c29082a2, document);
            c31265g0.f63327a = null;
            c31265g0.f63328b = null;
            c31265g0.f63331e = 2;
        } else {
            if (i12 != 2) {
                if (i12 == 3) {
                    ResultKt.throwOnFailure(obj);
                    c31265g0.f63331e = 4;
                } else {
                    if (i12 != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m70687a(ArrayList arrayList, ContinuationImpl continuationImpl) {
        C31328o0 c31328o0;
        if (continuationImpl instanceof C31328o0) {
            c31328o0 = (C31328o0) continuationImpl;
            int i11 = c31328o0.f63487d;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c31328o0.f63487d = i11 - Integer.MIN_VALUE;
            } else {
                c31328o0 = new C31328o0(this, continuationImpl);
            }
        } else {
            c31328o0 = new C31328o0(this, continuationImpl);
        }
        Object obj = c31328o0.f63485b;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c31328o0.f63487d;
        if (i12 == 0) {
            ResultKt.throwOnFailure(obj);
            C33272c.f67816e.f67810a.mo68955d("SNSAppViewModel2", "startVideoIdentification: docs " + arrayList.size(), null);
            if (AbstractC28409N0.m69294a("com.sumsub.sns.videoident.BuildConfig")) {
                C29070X.Companion.getClass();
                Document document = new Document(C29062V.m69739a("VIDEO_IDENT"), null);
                c31328o0.f63484a = arrayList;
                c31328o0.f63487d = 1;
                if (m70682a(document, c31328o0) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                this.f63501k.invoke(Boxing.boxBoolean(false));
                this.f63500j.invoke(new Exception("VideoIdent not available"), "VIDEO_IDENT");
            }
            return Unit.INSTANCE;
        }
        if (i12 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        arrayList = c31328o0.f63484a;
        ResultKt.throwOnFailure(obj);
        this.f63498h.invoke(new C31231X(arrayList));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: a */
    public final void m70693a(C29082a c29082a, Document document) {
        C33272c.f67816e.f67810a.mo68955d("SNSAppViewModel2", "startActionStep: " + document, null);
        AbstractC31234Y abstractC31234YM71289a = AbstractC32665p.m71289a(document, c29082a, true);
        if (!abstractC31234YM71289a.f63191b) {
            this.f63500j.invoke(new IllegalArgumentException("Step " + document.getType().f59014a + " is NOT supported in actions"), document.getType().f59014a);
            return;
        }
        this.f63498h.invoke(abstractC31234YM71289a);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m70682a(Document document, ContinuationImpl continuationImpl) {
        C31249c0 c31249c0;
        Document document2;
        C31168B1 c31168b1;
        String str;
        if (continuationImpl instanceof C31249c0) {
            c31249c0 = (C31249c0) continuationImpl;
            int i11 = c31249c0.f63259f;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c31249c0.f63259f = i11 - Integer.MIN_VALUE;
            } else {
                c31249c0 = new C31249c0(this, continuationImpl);
            }
        } else {
            c31249c0 = new C31249c0(this, continuationImpl);
        }
        Object obj = c31249c0.f63257d;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c31249c0.f63259f;
        if (i12 == 0) {
            ResultKt.throwOnFailure(obj);
            this.f63510t = document;
            C28936t c28936t = this.f63509s;
            KProperty kProperty = f63490u[0];
            c28936t.f58834a.set(c28936t.f58835b, Boolean.TRUE);
            C31168B1 c31168b2 = this.f63499i;
            String str2 = document.getType().f59014a;
            C30034c c30034c = this.f63495e;
            c31249c0.f63254a = document;
            c31249c0.f63255b = str2;
            c31249c0.f63256c = c31168b2;
            c31249c0.f63259f = 1;
            Object objM70075b = c30034c.m70075b(c31249c0);
            if (objM70075b == coroutine_suspended) {
                return coroutine_suspended;
            }
            document2 = document;
            c31168b1 = c31168b2;
            obj = objM70075b;
            str = str2;
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c31168b1 = c31249c0.f63256c;
            str = c31249c0.f63255b;
            document2 = c31249c0.f63254a;
            ResultKt.throwOnFailure(obj);
        }
        c31168b1.invoke(new SNSEvent.SNSEventStepInitiated((String) obj, str));
        C28368g c28368gM69266a = new C28368g().m69266a(StepAction.Started, document2.getType().f59014a);
        c28368gM69266a.f57847c = MapsKt.emptyMap();
        c28368gM69266a.m69267a(false);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m70690a(boolean z11, ContinuationImpl continuationImpl) {
        C31253d0 c31253d0;
        Document document;
        C31168B1 c31168b1;
        if (continuationImpl instanceof C31253d0) {
            c31253d0 = (C31253d0) continuationImpl;
            int i11 = c31253d0.f63300f;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c31253d0.f63300f = i11 - Integer.MIN_VALUE;
            } else {
                c31253d0 = new C31253d0(this, continuationImpl);
            }
        } else {
            c31253d0 = new C31253d0(this, continuationImpl);
        }
        Object obj = c31253d0.f63298d;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c31253d0.f63300f;
        if (i12 == 0) {
            ResultKt.throwOnFailure(obj);
            Document document2 = this.f63510t;
            if (document2 != null) {
                this.f63510t = null;
                C28936t c28936t = this.f63509s;
                KProperty kProperty = f63490u[0];
                c28936t.f58834a.set(c28936t.f58835b, Boolean.TRUE);
                C31168B1 c31168b2 = this.f63499i;
                C30034c c30034c = this.f63495e;
                c31253d0.f63296b = document2;
                c31253d0.f63297c = c31168b2;
                c31253d0.f63295a = z11;
                c31253d0.f63300f = 1;
                Object objM70075b = c30034c.m70075b(c31253d0);
                if (objM70075b == coroutine_suspended) {
                    return coroutine_suspended;
                }
                document = document2;
                obj = objM70075b;
                c31168b1 = c31168b2;
            }
            return Unit.INSTANCE;
        }
        if (i12 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        z11 = c31253d0.f63295a;
        c31168b1 = c31253d0.f63297c;
        document = c31253d0.f63296b;
        ResultKt.throwOnFailure(obj);
        c31168b1.invoke(new SNSEvent.SNSEventStepCompleted((String) obj, document.getType().f59014a, z11, (String) this.f63504n.invoke()));
        if (!z11) {
            C28368g c28368gM69266a = new C28368g().m69266a(StepAction.Completed, document.getType().f59014a);
            c28368gM69266a.f57847c = MapsKt.emptyMap();
            c28368gM69266a.m69267a(false);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: a */
    public final void m70694a(AbstractC29172p abstractC29172p, Document document) {
        String str = "startStep for document: " + document.getType().f59014a;
        C33270a c33270a = C33272c.f67816e;
        c33270a.f67810a.mo68955d("SNSAppViewModel2", str, null);
        c33270a.f67811b.m71625a();
        c33270a.f67810a.mo68955d("SNSAppViewModel2", "startStep for document: " + document.getType().f59014a, null);
        this.f63501k.invoke(Boolean.FALSE);
        AbstractC31234Y abstractC31234YM71289a = AbstractC32665p.m71289a(document, abstractC29172p, false);
        c33270a.f67810a.mo68955d("SNSAppViewModel2", "navigation event: " + abstractC31234YM71289a + "}", null);
        this.f63498h.invoke(abstractC31234YM71289a);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m70688a(ContinuationImpl continuationImpl) {
        C31261f0 c31261f0;
        C29140j3 c29140j3Mo69761l;
        C28994D3 c28994d3;
        if (continuationImpl instanceof C31261f0) {
            c31261f0 = (C31261f0) continuationImpl;
            int i11 = c31261f0.f63317c;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c31261f0.f63317c = i11 - Integer.MIN_VALUE;
            } else {
                c31261f0 = new C31261f0(this, continuationImpl);
            }
        } else {
            c31261f0 = new C31261f0(this, continuationImpl);
        }
        Object objM70042a = c31261f0.f63315a;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c31261f0.f63317c;
        boolean zAreEqual = false;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objM70042a);
            InterfaceC29984m interfaceC29984m = this.f63493c;
            c31261f0.f63317c = 1;
            objM70042a = ((C29967J) interfaceC29984m).m70042a(false, (Continuation) c31261f0);
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
        if (abstractC29172p != null && (c29140j3Mo69761l = abstractC29172p.mo69761l()) != null && (c28994d3 = c29140j3Mo69761l.f59119c) != null) {
            zAreEqual = Intrinsics.areEqual(c28994d3.f58921a, Boxing.boxBoolean(true));
        }
        return Boxing.boxBoolean(zAreEqual);
    }
}
