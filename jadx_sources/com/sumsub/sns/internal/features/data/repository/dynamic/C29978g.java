package com.sumsub.sns.internal.features.data.repository.dynamic;

import com.sumsub.sns.internal.features.data.model.common.AbstractC29172p;
import com.sumsub.sns.internal.log.C33272c;
import kotlinx.coroutines.AbstractC41697j0;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.InterfaceC41775x1;
import kotlinx.coroutines.flow.C41636g;
import kotlinx.coroutines.flow.C41679x;
import kotlinx.coroutines.flow.InterfaceC41669n;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function3;
import rg0.C44087f;
import rg0.InterfaceC44082a;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.repository.dynamic.g */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C29978g {

    /* JADX INFO: renamed from: a */
    public final InterfaceC41709m0 f60229a;

    /* JADX INFO: renamed from: b */
    public final AbstractC41697j0 f60230b;

    /* JADX INFO: renamed from: c */
    public final SuspendLambda f60231c;

    /* JADX INFO: renamed from: d */
    public final String f60232d;

    /* JADX INFO: renamed from: e */
    public InterfaceC41775x1 f60233e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC44082a f60234f = C44087f.m97144b(false, 1, null);

    /* JADX INFO: renamed from: g */
    public final InterfaceC41669n f60235g;

    /* JADX INFO: renamed from: h */
    public final InterfaceC41669n f60236h;

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x007f, code lost:
    
        if (r8 == r1) goto L24;
     */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m70055a(ContinuationImpl continuationImpl) {
        C29975d c29975d;
        if (continuationImpl instanceof C29975d) {
            c29975d = (C29975d) continuationImpl;
            int i11 = c29975d.f60219c;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c29975d.f60219c = i11 - Integer.MIN_VALUE;
            } else {
                c29975d = new C29975d(this, continuationImpl);
            }
        } else {
            c29975d = new C29975d(this, continuationImpl);
        }
        Object objM90882F = c29975d.f60217a;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c29975d.f60219c;
        if (i12 != 0) {
            if (i12 == 1) {
                ResultKt.throwOnFailure(objM90882F);
            } else {
                if (i12 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objM90882F);
            }
            return ((AbstractC29971N) objM90882F).m70052d();
        }
        ResultKt.throwOnFailure(objM90882F);
        Object objM70051c = ((AbstractC29971N) this.f60235g.getValue()).m70051c();
        if (objM70051c != null) {
            return objM70051c;
        }
        String str = this.f60232d;
        C33272c.f67816e.f67810a.mo68955d(str, "DataKeeper " + str + " getOrThrow, need to refresh, force=false", null);
        c29975d.f60219c = 1;
        if (m70054a((Boolean) null, c29975d) != coroutine_suspended) {
        }
        return coroutine_suspended;
        InterfaceC41669n interfaceC41669n = this.f60235g;
        c29975d.f60219c = 2;
        objM90882F = C41636g.m90882F(interfaceC41669n, c29975d);
    }

    /* JADX INFO: renamed from: b */
    public final Object m70059b(ContinuationImpl continuationImpl) {
        if (((AbstractC29971N) this.f60235g.getValue()).m70050b() != null) {
            String str = this.f60232d;
            C33272c.f67816e.f67810a.mo68955d(str, "DataKeeper " + str + " refreshIfEmpty, no need to refresh", null);
            return Unit.INSTANCE;
        }
        String str2 = this.f60232d;
        C33272c.f67816e.f67810a.mo68955d(str2, "DataKeeper " + str2 + " refreshIfEmpty, refreshing", null);
        Object objM70054a = m70054a((Boolean) null, continuationImpl);
        return objM70054a == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM70054a : Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C29978g(InterfaceC41709m0 interfaceC41709m0, AbstractC41697j0 abstractC41697j0, Function3 function3, String str) {
        this.f60229a = interfaceC41709m0;
        this.f60230b = abstractC41697j0;
        this.f60231c = (SuspendLambda) function3;
        this.f60232d = str;
        InterfaceC41669n interfaceC41669nM91009a = C41679x.m91009a(new C29968K());
        this.f60235g = interfaceC41669nM91009a;
        this.f60236h = interfaceC41669nM91009a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m70056a(boolean z11, ContinuationImpl continuationImpl) {
        C29974c c29974c;
        if (continuationImpl instanceof C29974c) {
            c29974c = (C29974c) continuationImpl;
            int i11 = c29974c.f60216c;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c29974c.f60216c = i11 - Integer.MIN_VALUE;
            } else {
                c29974c = new C29974c(this, continuationImpl);
            }
        } else {
            c29974c = new C29974c(this, continuationImpl);
        }
        Object obj = c29974c.f60214a;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c29974c.f60216c;
        if (i12 == 0) {
            ResultKt.throwOnFailure(obj);
            if (!z11) {
                AbstractC29971N abstractC29971N = (AbstractC29971N) this.f60235g.getValue();
                if (abstractC29971N.m70050b() != null) {
                    return abstractC29971N;
                }
            }
            String str = this.f60232d;
            C33272c.f67816e.f67810a.mo68955d(str, "DataKeeper " + str + " getAsResult, need to refresh, force=" + z11, null);
            c29974c.f60216c = 1;
            if (m70054a((Boolean) null, c29974c) != coroutine_suspended) {
            }
        }
        if (i12 != 1) {
            if (i12 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return obj;
        }
        ResultKt.throwOnFailure(obj);
        InterfaceC41669n interfaceC41669n = this.f60235g;
        c29974c.f60216c = 2;
        Object objM90882F = C41636g.m90882F(interfaceC41669n, c29974c);
        return objM90882F == coroutine_suspended ? coroutine_suspended : objM90882F;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00cd, code lost:
    
        if (r15.mo90385E(r0) == r1) goto L38;
     */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m70054a(Boolean bool, ContinuationImpl continuationImpl) {
        C29976e c29976e;
        InterfaceC44082a interfaceC44082a;
        Object obj;
        InterfaceC41775x1 interfaceC41775x1;
        if (continuationImpl instanceof C29976e) {
            c29976e = (C29976e) continuationImpl;
            int i11 = c29976e.f60224e;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c29976e.f60224e = i11 - Integer.MIN_VALUE;
            } else {
                c29976e = new C29976e(this, continuationImpl);
            }
        } else {
            c29976e = new C29976e(this, continuationImpl);
        }
        Object obj2 = c29976e.f60222c;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c29976e.f60224e;
        try {
            if (i12 == 0) {
                ResultKt.throwOnFailure(obj2);
                interfaceC44082a = this.f60234f;
                c29976e.f60220a = bool;
                c29976e.f60221b = interfaceC44082a;
                c29976e.f60224e = 1;
                if (interfaceC44082a.mo91344d(null, c29976e) != coroutine_suspended) {
                }
                obj = bool;
                return coroutine_suspended;
            }
            if (i12 == 1) {
                InterfaceC44082a interfaceC44082a2 = c29976e.f60221b;
                Object obj3 = c29976e.f60220a;
                ResultKt.throwOnFailure(obj2);
                interfaceC44082a = interfaceC44082a2;
                obj = obj3;
            } else {
                if (i12 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj2);
            }
            return Unit.INSTANCE;
            obj = bool;
            InterfaceC41775x1 interfaceC41775x2 = this.f60233e;
            if ((interfaceC41775x2 != null && interfaceC41775x2.isActive()) || ((interfaceC41775x1 = this.f60233e) != null && !interfaceC41775x1.isCompleted())) {
                String str = this.f60232d;
                C33272c.f67816e.f67810a.mo68955d(str, "DataKeeper " + str + " refresh: waiting for existing update job to finish", null);
            } else {
                String str2 = this.f60232d;
                C33272c.f67816e.f67810a.mo68955d(str2, "DataKeeper " + str2 + " Updating ...", null);
                this.f60233e = C41696j.m91104d(this.f60229a, this.f60230b, null, new C29977f(this, obj, null), 2, null);
            }
            Unit unit = Unit.INSTANCE;
            interfaceC44082a.mo91345e(null);
            InterfaceC41775x1 interfaceC41775x3 = this.f60233e;
            if (interfaceC41775x3 == null) {
                return unit;
            }
            c29976e.f60220a = null;
            c29976e.f60221b = null;
            c29976e.f60224e = 2;
        } catch (Throwable th2) {
            interfaceC44082a.mo91345e(null);
            throw th2;
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m70058a(AbstractC29172p abstractC29172p) {
        String str = this.f60232d;
        C33272c.f67816e.f67810a.mo68955d(str, "DataKeeper " + str + " Update", null);
        this.f60235g.setValue(new C29970M(abstractC29172p));
    }

    /* JADX INFO: renamed from: a */
    public final void m70057a() {
        String str = this.f60232d;
        C33272c.f67816e.f67810a.mo68955d(str, "DataKeeper " + str + " Cleared", null);
        this.f60235g.setValue(new C29968K());
    }
}
