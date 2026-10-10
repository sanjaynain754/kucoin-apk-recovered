package com.sumsub.sns.internal.features.presentation.consent;

import android.os.Parcelable;
import com.sumsub.sns.core.presentation.base.AbstractC28052C;
import com.sumsub.sns.core.presentation.base.C28135m;
import com.sumsub.sns.internal.core.common.C28494t;
import com.sumsub.sns.internal.features.data.model.common.AbstractC29172p;
import com.sumsub.sns.internal.features.data.model.common.C29131i0;
import com.sumsub.sns.internal.features.data.model.common.remote.C29332c;
import com.sumsub.sns.internal.features.data.repository.applicant.InterfaceC29921d;
import com.sumsub.sns.internal.features.data.repository.dynamic.AbstractC29971N;
import com.sumsub.sns.internal.features.data.repository.dynamic.C29967J;
import com.sumsub.sns.internal.features.data.repository.dynamic.InterfaceC29984m;
import com.sumsub.sns.internal.features.domain.C30088W;
import java.util.List;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.reflect.KProperty;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.consent.t */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30869t extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public int f62355a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f62356b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C30870u f62357c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C30870u f62358d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30869t(C30870u c30870u, Continuation continuation, C30870u c30870u2) {
        super(2, continuation);
        this.f62357c = c30870u;
        this.f62358d = c30870u2;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        C30869t c30869t = new C30869t(this.f62357c, continuation, this.f62358d);
        c30869t.f62356b = obj;
        return c30869t;
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C30869t) create((InterfaceC41709m0) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:36:0x007c  */
    /* JADX WARN: Code duplicated, block: B:44:0x0093  */
    /* JADX WARN: Code duplicated, block: B:47:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:48:0x00b2 A[Catch: all -> 0x0028, PHI: r0
      0x00b2: PHI (r0v20 java.lang.Object) = (r0v19 java.lang.Object), (r0v36 java.lang.Object) binds: [B:46:0x00af, B:18:0x0041] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {all -> 0x0028, blocks: (B:9:0x001b, B:58:0x00e8, B:60:0x00ee, B:61:0x0103, B:16:0x0037, B:51:0x00c7, B:55:0x00ce, B:62:0x0117, B:17:0x003e, B:48:0x00b2, B:20:0x0049, B:40:0x008b, B:42:0x008f, B:45:0x0095, B:21:0x004f, B:27:0x0068, B:29:0x006c, B:31:0x0072, B:37:0x007e, B:24:0x005c), top: B:67:0x000f }] */
    /* JADX WARN: Code duplicated, block: B:50:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:51:0x00c7 A[Catch: all -> 0x0028, PHI: r0 r2
      0x00c7: PHI (r0v24 com.sumsub.sns.internal.features.data.model.common.p) = 
      (r0v23 com.sumsub.sns.internal.features.data.model.common.p)
      (r0v38 com.sumsub.sns.internal.features.data.model.common.p)
     binds: [B:49:0x00c4, B:16:0x0037] A[DONT_GENERATE, DONT_INLINE]
      0x00c7: PHI (r2v2 java.lang.Object) = (r2v1 java.lang.Object), (r2v6 java.lang.Object) binds: [B:49:0x00c4, B:16:0x0037] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {all -> 0x0028, blocks: (B:9:0x001b, B:58:0x00e8, B:60:0x00ee, B:61:0x0103, B:16:0x0037, B:51:0x00c7, B:55:0x00ce, B:62:0x0117, B:17:0x003e, B:48:0x00b2, B:20:0x0049, B:40:0x008b, B:42:0x008f, B:45:0x0095, B:21:0x004f, B:27:0x0068, B:29:0x006c, B:31:0x0072, B:37:0x007e, B:24:0x005c), top: B:67:0x000f }] */
    /* JADX WARN: Code duplicated, block: B:53:0x00cb A[ADDED_TO_REGION] */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00e5, code lost:
    
        if (r0 == r6) goto L57;
     */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object objM70500a;
        String str;
        Object objM70502b;
        C29332c c29332c;
        String str2;
        Object objM70042a;
        AbstractC29172p abstractC29172p;
        Object objM70502b2;
        Object objM70108a;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f62355a;
        try {
            if (i11 == 0) {
                ResultKt.throwOnFailure(obj);
                C30870u c30870u = this.f62358d;
                this.f62355a = 1;
                objM70500a = C30870u.m70500a(c30870u, this);
                if (objM70500a == coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i11 == 1) {
                ResultKt.throwOnFailure(obj);
                objM70500a = obj;
            } else {
                if (i11 == 2) {
                    str = (String) this.f62356b;
                    ResultKt.throwOnFailure(obj);
                    objM70502b = obj;
                    c29332c = (C29332c) objM70502b;
                    if (c29332c != null || (str2 = c29332c.f59348f) == null) {
                        str2 = "";
                    }
                    C30856g c30856g = new C30856g(str, str2);
                    C30870u c30870u2 = this.f62358d;
                    KProperty[] kPropertyArr = C30870u.f62359h;
                    c30870u2.fireEvent(c30856g);
                    InterfaceC29984m interfaceC29984m = this.f62358d.f62360a;
                    this.f62356b = null;
                    this.f62355a = 3;
                    objM70042a = ((C29967J) interfaceC29984m).m70042a(false, (Continuation) this);
                    if (objM70042a == coroutine_suspended) {
                        abstractC29172p = (AbstractC29172p) ((AbstractC29971N) objM70042a).m70051c();
                        C30870u c30870u3 = this.f62358d;
                        this.f62356b = abstractC29172p;
                        this.f62355a = 4;
                        objM70502b2 = C30870u.m70502b(c30870u3, this);
                        if (objM70502b2 != coroutine_suspended) {
                            C29332c c29332c2 = (C29332c) objM70502b2;
                            if (abstractC29172p != null) {
                            }
                            AbstractC28052C.finish$default(this.f62358d, new C28494t(false), Boxing.boxBoolean(true), null, null, 12, null);
                            this.f62357c.showProgress(false);
                            return Unit.INSTANCE;
                        }
                    }
                    return coroutine_suspended;
                }
                if (i11 == 3) {
                    ResultKt.throwOnFailure(obj);
                    objM70042a = obj;
                    abstractC29172p = (AbstractC29172p) ((AbstractC29971N) objM70042a).m70051c();
                    C30870u c30870u4 = this.f62358d;
                    this.f62356b = abstractC29172p;
                    this.f62355a = 4;
                    objM70502b2 = C30870u.m70502b(c30870u4, this);
                    if (objM70502b2 != coroutine_suspended) {
                        C29332c c29332c3 = (C29332c) objM70502b2;
                        if (abstractC29172p != null) {
                        }
                        AbstractC28052C.finish$default(this.f62358d, new C28494t(false), Boxing.boxBoolean(true), null, null, 12, null);
                        this.f62357c.showProgress(false);
                        return Unit.INSTANCE;
                    }
                    return coroutine_suspended;
                }
                if (i11 == 4) {
                    abstractC29172p = (AbstractC29172p) this.f62356b;
                    ResultKt.throwOnFailure(obj);
                    objM70502b2 = obj;
                    C29332c c29332c4 = (C29332c) objM70502b2;
                    if (abstractC29172p != null || c29332c4 == null) {
                        AbstractC28052C.finish$default(this.f62358d, new C28494t(false), Boxing.boxBoolean(true), null, null, 12, null);
                    } else {
                        C30870u c30870u5 = this.f62358d;
                        AbstractC29172p abstractC29172p2 = abstractC29172p;
                        C30088W c30088w = c30870u5.f62362c;
                        InterfaceC29921d interfaceC29921d = c30870u5.f62361b;
                        List listListOf = CollectionsKt.listOf(c29332c4);
                        this.f62356b = null;
                        this.f62355a = 5;
                        objM70108a = c30088w.m70108a(interfaceC29921d, abstractC29172p2, listListOf, false, this);
                    }
                    this.f62357c.showProgress(false);
                    return Unit.INSTANCE;
                }
                if (i11 != 5) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                objM70108a = ((Result) obj).getValue();
            }
            Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM70108a);
            if (thM103847exceptionOrNullimpl != null) {
                C30870u c30870u6 = this.f62358d;
                C28135m c28135m = new C28135m(new C29131i0(thM103847exceptionOrNullimpl, (Parcelable) null, 6), "Agreements", null, null);
                KProperty[] kPropertyArr2 = C30870u.f62359h;
                c30870u6.fireEvent(c28135m);
            } else {
                AbstractC28052C.finish$default(this.f62358d, new C28494t(false), Boxing.boxBoolean(true), null, null, 12, null);
            }
            this.f62357c.showProgress(false);
            return Unit.INSTANCE;
            C30857h c30857h = (C30857h) objM70500a;
            if (c30857h == null || (str = c30857h.f62321b.f62373a) == null) {
                str = "Other";
            } else {
                if (str.length() <= 0) {
                    str = null;
                }
                if (str == null) {
                    str = "Other";
                }
            }
            C30870u c30870u7 = this.f62358d;
            this.f62356b = str;
            this.f62355a = 2;
            objM70502b = C30870u.m70502b(c30870u7, this);
            if (objM70502b != coroutine_suspended) {
                c29332c = (C29332c) objM70502b;
                if (c29332c != null) {
                    str2 = "";
                } else {
                    str2 = "";
                }
                C30856g c30856g2 = new C30856g(str, str2);
                C30870u c30870u8 = this.f62358d;
                KProperty[] kPropertyArr3 = C30870u.f62359h;
                c30870u8.fireEvent(c30856g2);
                InterfaceC29984m interfaceC29984m2 = this.f62358d.f62360a;
                this.f62356b = null;
                this.f62355a = 3;
                objM70042a = ((C29967J) interfaceC29984m2).m70042a(false, (Continuation) this);
                if (objM70042a == coroutine_suspended) {
                    abstractC29172p = (AbstractC29172p) ((AbstractC29971N) objM70042a).m70051c();
                    C30870u c30870u9 = this.f62358d;
                    this.f62356b = abstractC29172p;
                    this.f62355a = 4;
                    objM70502b2 = C30870u.m70502b(c30870u9, this);
                    if (objM70502b2 != coroutine_suspended) {
                        C29332c c29332c5 = (C29332c) objM70502b2;
                        if (abstractC29172p != null) {
                        }
                        AbstractC28052C.finish$default(this.f62358d, new C28494t(false), Boxing.boxBoolean(true), null, null, 12, null);
                        this.f62357c.showProgress(false);
                        return Unit.INSTANCE;
                    }
                }
            }
            return coroutine_suspended;
        } catch (Throwable th2) {
            this.f62357c.showProgress(false);
            throw th2;
        }
    }
}
