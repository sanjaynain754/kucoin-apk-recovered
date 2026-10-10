package com.sumsub.sns.internal.features.data.repository.dynamic;

import com.sumsub.sns.internal.core.domain.C28576g;
import com.sumsub.sns.internal.core.domain.C28598r;
import com.sumsub.sns.internal.core.domain.InterfaceC28584k;
import com.sumsub.sns.internal.features.data.model.common.AbstractC29130i;
import com.sumsub.sns.internal.features.data.model.common.C29124h;
import com.sumsub.sns.internal.features.data.repository.common.InterfaceC29954b;
import com.sumsub.sns.internal.log.AbstractC33294e;
import com.sumsub.sns.internal.log.C33272c;
import java.util.List;
import kotlinx.coroutines.AbstractC41697j0;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.InterfaceC41729r0;
import kotlinx.coroutines.InterfaceC41775x1;
import kotlinx.coroutines.flow.C41679x;
import kotlinx.coroutines.flow.InterfaceC41669n;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.repository.dynamic.J */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C29967J implements InterfaceC29984m {

    /* JADX INFO: renamed from: m */
    public static final C29986o f60191m = new C29986o();

    /* JADX INFO: renamed from: n */
    public static final List f60192n = CollectionsKt.listOf((Object[]) new String[]{"ARG", "BRA", "ARM", "ATA", "ATF", "ATG", "AUS", "AUT", "AZE", "BDI", "BEL", "BEN"});

    /* JADX INFO: renamed from: a */
    public final InterfaceC29954b f60193a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC41709m0 f60194b;

    /* JADX INFO: renamed from: c */
    public final AbstractC41697j0 f60195c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC28584k f60196d;

    /* JADX INFO: renamed from: e */
    public final C28576g f60197e;

    /* JADX INFO: renamed from: f */
    public InterfaceC41775x1 f60198f;

    /* JADX INFO: renamed from: g */
    public InterfaceC41775x1 f60199g;

    /* JADX INFO: renamed from: h */
    public final InterfaceC41669n f60200h;

    /* JADX INFO: renamed from: i */
    public final InterfaceC41669n f60201i;

    /* JADX INFO: renamed from: j */
    public final C29978g f60202j;

    /* JADX INFO: renamed from: k */
    public final C29978g f60203k;

    /* JADX INFO: renamed from: l */
    public final C29978g f60204l;

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public static final Object m70038a(C29967J c29967j, InterfaceC41709m0 interfaceC41709m0, ContinuationImpl continuationImpl) {
        C29965H c29965h;
        if (continuationImpl instanceof C29965H) {
            c29965h = (C29965H) continuationImpl;
            int i11 = c29965h.f60187d;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c29965h.f60187d = i11 - Integer.MIN_VALUE;
            } else {
                c29965h = new C29965H(c29967j, continuationImpl);
            }
        } else {
            c29965h = new C29965H(c29967j, continuationImpl);
        }
        Object obj = c29965h.f60185b;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c29965h.f60187d;
        if (i12 == 0) {
            ResultKt.throwOnFailure(obj);
            InterfaceC41775x1 interfaceC41775x1 = c29967j.f60199g;
            if (interfaceC41775x1 != null) {
                c29965h.f60184a = interfaceC41709m0;
                c29965h.f60187d = 1;
                if (interfaceC41775x1.mo90385E(c29965h) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            interfaceC41709m0 = c29965h.f60184a;
            ResultKt.throwOnFailure(obj);
        }
        c29967j.f60199g = C41696j.m91104d(interfaceC41709m0, c29967j.f60195c, null, new C29966I(c29967j, null), 2, null);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public final Object m70045b(boolean z11, ContinuationImpl continuationImpl) {
        C29995x c29995x;
        C29967J c29967j;
        C29124h c29124h;
        if (continuationImpl instanceof C29995x) {
            c29995x = (C29995x) continuationImpl;
            int i11 = c29995x.f60277d;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c29995x.f60277d = i11 - Integer.MIN_VALUE;
            } else {
                c29995x = new C29995x(this, continuationImpl);
            }
        } else {
            c29995x = new C29995x(this, continuationImpl);
        }
        Object objM70040a = c29995x.f60275b;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c29995x.f60277d;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objM70040a);
            Object value = this.f60203k.f60236h.getValue();
            C29996y c29996y = new C29996y(this, z11, null);
            c29995x.f60274a = this;
            c29995x.f60277d = 1;
            objM70040a = m70040a(value, c29996y, c29995x);
            if (objM70040a == coroutine_suspended) {
                return coroutine_suspended;
            }
            c29967j = this;
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c29967j = c29995x.f60274a;
            ResultKt.throwOnFailure(objM70040a);
        }
        AbstractC29971N abstractC29971N = (AbstractC29971N) objM70040a;
        c29967j.getClass();
        C29979h c29979h = (C29979h) abstractC29971N.m70051c();
        if (c29979h != null && (c29124h = c29979h.f60237a) != null) {
            return new C29970M(c29124h);
        }
        if (!(abstractC29971N instanceof C29969L)) {
            return new C29968K();
        }
        C29969L c29969l = (C29969L) abstractC29971N;
        C29979h c29979h2 = (C29979h) c29969l.m70050b();
        return new C29969L(c29969l.f60205a, c29979h2 != null ? c29979h2.f60237a : null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: c */
    public final Object m70047c(boolean z11, ContinuationImpl continuationImpl) {
        C29997z c29997z;
        if (continuationImpl instanceof C29997z) {
            c29997z = (C29997z) continuationImpl;
            int i11 = c29997z.f60284c;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c29997z.f60284c = i11 - Integer.MIN_VALUE;
            } else {
                c29997z = new C29997z(this, continuationImpl);
            }
        } else {
            c29997z = new C29997z(this, continuationImpl);
        }
        Object objM70045b = c29997z.f60282a;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c29997z.f60284c;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objM70045b);
            c29997z.f60284c = 1;
            objM70045b = m70045b(z11, c29997z);
            if (objM70045b == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objM70045b);
        }
        return ((AbstractC29971N) objM70045b).m70052d();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: c */
    public final void m70048c() {
        C29980i c29980i;
        AbstractC29971N c29968k;
        AbstractC29971N c29968k2;
        AbstractC29971N c29969l;
        C29124h c29124h;
        C29124h c29124h2;
        C29979h c29979h = (C29979h) ((AbstractC29971N) this.f60203k.f60236h.getValue()).m70051c();
        boolean z11 = (c29979h == null || (c29124h2 = c29979h.f60237a) == null || !AbstractC29130i.m69785k(c29124h2)) ? false : true;
        AbstractC29971N abstractC29971N = (AbstractC29971N) this.f60202j.f60236h.getValue();
        AbstractC29971N abstractC29971N2 = (AbstractC29971N) this.f60203k.f60236h.getValue();
        AbstractC29971N abstractC29971N3 = (AbstractC29971N) this.f60204l.f60236h.getValue();
        boolean z12 = abstractC29971N2.mo70049a() != null;
        C29979h c29979h2 = (C29979h) abstractC29971N2.m70051c();
        if (c29979h2 != null && (c29124h = c29979h2.f60237a) != null) {
            c29968k = new C29970M(c29124h);
        } else if (abstractC29971N2 instanceof C29969L) {
            C29969L c29969l2 = (C29969L) abstractC29971N2;
            C29979h c29979h3 = (C29979h) c29969l2.m70050b();
            c29968k = new C29969L(c29969l2.f60205a, c29979h3 != null ? c29979h3.f60237a : null);
        } else {
            c29968k = new C29968K();
        }
        C29979h c29979h4 = (C29979h) abstractC29971N2.m70051c();
        if (c29979h4 == null) {
            if (abstractC29971N2 instanceof C29969L) {
                C29969L c29969l3 = (C29969L) abstractC29971N2;
                C29979h c29979h5 = (C29979h) c29969l3.m70050b();
                c29969l = new C29969L(c29969l3.f60205a, c29979h5 != null ? c29979h5.f60238b : null);
            } else {
                c29968k2 = new C29968K();
            }
            c29980i = new C29980i(abstractC29971N, c29968k, abstractC29971N3, c29969l, z11);
            if (c29980i.m70060a() || z12) {
                this.f60200h.setValue(c29980i);
            } else {
                C33272c.f67816e.f67810a.mo68955d("DataRepository", "updateDataFlow: skipping ...", null);
                return;
            }
        }
        c29968k2 = new C29970M(c29979h4.f60238b);
        c29969l = c29968k2;
        c29980i = new C29980i(abstractC29971N, c29968k, abstractC29971N3, c29969l, z11);
        if (c29980i.m70060a()) {
        }
        this.f60200h.setValue(c29980i);
    }

    public C29967J(InterfaceC29954b interfaceC29954b, InterfaceC41709m0 interfaceC41709m0, AbstractC41697j0 abstractC41697j0, C28598r c28598r, C28576g c28576g) {
        this.f60193a = interfaceC29954b;
        this.f60194b = interfaceC41709m0;
        this.f60195c = abstractC41697j0;
        this.f60196d = c28598r;
        this.f60197e = c28576g;
        InterfaceC41669n interfaceC41669nM91009a = C41679x.m91009a(null);
        this.f60200h = interfaceC41669nM91009a;
        this.f60201i = interfaceC41669nM91009a;
        this.f60202j = new C29978g(interfaceC41709m0, abstractC41697j0, new C29987p(this, null), AbstractC33294e.m71624a(this) + " Applicant");
        this.f60203k = new C29978g(interfaceC41709m0, abstractC41697j0, new C29988q(this, null), AbstractC33294e.m71624a(this) + " Config and FFs");
        this.f60204l = new C29978g(interfaceC41709m0, abstractC41697j0, new C29963F(this, null), AbstractC33294e.m71624a(this) + " Strings");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public final C29124h m70039a() {
        C29979h c29979h = (C29979h) ((AbstractC29971N) this.f60203k.f60236h.getValue()).m70051c();
        if (c29979h != null) {
            return c29979h.f60237a;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0082, code lost:
    
        if (kotlinx.coroutines.AwaitKt.m90346b(r1, r2) == r3) goto L28;
     */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m70041a(ContinuationImpl continuationImpl) {
        C29989r c29989r;
        if (continuationImpl instanceof C29989r) {
            c29989r = (C29989r) continuationImpl;
            int i11 = c29989r.f60262c;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c29989r.f60262c = i11 - Integer.MIN_VALUE;
            } else {
                c29989r = new C29989r(this, continuationImpl);
            }
        } else {
            c29989r = new C29989r(this, continuationImpl);
        }
        Object obj = c29989r.f60260a;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c29989r.f60262c;
        if (i12 != 0) {
            if (i12 == 1) {
                ResultKt.throwOnFailure(obj);
            } else if (i12 == 2) {
                ResultKt.throwOnFailure(obj);
                InterfaceC41729r0[] interfaceC41729r0Arr = {C41696j.m91102b(this.f60194b, null, null, new C29990s(this, null), 3, null), C41696j.m91102b(this.f60194b, null, null, new C29991t(this, null), 3, null)};
                c29989r.f60262c = 3;
            } else {
                if (i12 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            C41696j.m91104d(this.f60194b, null, null, new C29992u(this, null), 3, null);
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(obj);
        InterfaceC41775x1 interfaceC41775x1 = this.f60199g;
        if (interfaceC41775x1 != null) {
            c29989r.f60262c = 1;
            if (interfaceC41775x1.mo90385E(c29989r) != coroutine_suspended) {
            }
        }
        return coroutine_suspended;
        C29978g c29978g = this.f60203k;
        c29989r.f60262c = 2;
        if (c29978g.m70059b(c29989r) != coroutine_suspended) {
            InterfaceC41729r0[] interfaceC41729r0Arr2 = {C41696j.m91102b(this.f60194b, null, null, new C29990s(this, null), 3, null), C41696j.m91102b(this.f60194b, null, null, new C29991t(this, null), 3, null)};
            c29989r.f60262c = 3;
        }
        return coroutine_suspended;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public final Object m70044b(ContinuationImpl continuationImpl) {
        C29959B c29959b;
        if (continuationImpl instanceof C29959B) {
            c29959b = (C29959B) continuationImpl;
            int i11 = c29959b.f60167c;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c29959b.f60167c = i11 - Integer.MIN_VALUE;
            } else {
                c29959b = new C29959B(this, continuationImpl);
            }
        } else {
            c29959b = new C29959B(this, continuationImpl);
        }
        Object objM70040a = c29959b.f60165a;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c29959b.f60167c;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objM70040a);
            c29959b.f60167c = 1;
            objM70040a = m70040a(this.f60204l.f60236h.getValue(), new C29958A(this, null), c29959b);
            if (objM70040a == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objM70040a);
        }
        return ((AbstractC29971N) objM70040a).m70052d();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m70043a(boolean z11, ContinuationImpl continuationImpl) {
        C29994w c29994w;
        if (continuationImpl instanceof C29994w) {
            c29994w = (C29994w) continuationImpl;
            int i11 = c29994w.f60273c;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c29994w.f60273c = i11 - Integer.MIN_VALUE;
            } else {
                c29994w = new C29994w(this, continuationImpl);
            }
        } else {
            c29994w = new C29994w(this, continuationImpl);
        }
        Object objM70042a = c29994w.f60271a;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c29994w.f60273c;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objM70042a);
            c29994w.f60273c = 1;
            objM70042a = m70042a(z11, (Continuation) c29994w);
            if (objM70042a == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objM70042a);
        }
        return ((AbstractC29971N) objM70042a).m70052d();
    }

    /* JADX INFO: renamed from: a */
    public final Object m70042a(boolean z11, Continuation continuation) {
        return m70040a(this.f60202j.f60236h.getValue(), new C29993v(this, z11, null), continuation);
    }

    /* JADX INFO: renamed from: b */
    public final void m70046b() {
        InterfaceC41775x1 interfaceC41775x1 = this.f60198f;
        if (interfaceC41775x1 != null) {
            InterfaceC41775x1.a.m91377a(interfaceC41775x1, null, 1, null);
        }
        this.f60198f = C41696j.m91104d(this.f60194b, this.f60195c, null, new C29962E(this, null), 2, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m70040a(Object obj, Function1 function1, Continuation continuation) {
        C29964G c29964g;
        if (continuation instanceof C29964G) {
            c29964g = (C29964G) continuation;
            int i11 = c29964g.f60183d;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c29964g.f60183d = i11 - Integer.MIN_VALUE;
            } else {
                c29964g = new C29964G(this, continuation);
            }
        } else {
            c29964g = new C29964G(this, continuation);
        }
        Object objInvoke = c29964g.f60181b;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c29964g.f60183d;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objInvoke);
            c29964g.f60180a = obj;
            c29964g.f60183d = 1;
            objInvoke = function1.invoke(c29964g);
            if (objInvoke == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            obj = c29964g.f60180a;
            ResultKt.throwOnFailure(objInvoke);
        }
        if (!Intrinsics.areEqual(obj, objInvoke)) {
            m70048c();
        }
        return objInvoke;
    }
}
