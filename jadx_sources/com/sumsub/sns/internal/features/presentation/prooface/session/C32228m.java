package com.sumsub.sns.internal.features.presentation.prooface.session;

import android.graphics.RectF;
import androidx.camera.core.ImageProxy;
import com.sumsub.sns.internal.core.presentation.camera.C28758x;
import com.sumsub.sns.internal.features.data.model.prooface.C29818c;
import com.sumsub.sns.internal.features.data.model.prooface.C29822f;
import com.sumsub.sns.internal.features.data.network.prooface.Liveness3dFaceRepository$LivenessRepositoryResult;
import com.sumsub.sns.internal.features.presentation.prooface.C32016L0;
import com.sumsub.sns.internal.features.presentation.prooface.utils.AbstractC32267d;
import com.tencent.bugly.proguard.C33864ph;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.flow.C41636g;
import kotlinx.coroutines.flow.C41674s;
import kotlinx.coroutines.flow.C41679x;
import kotlinx.coroutines.flow.InterfaceC41634e;
import kotlinx.coroutines.flow.InterfaceC41668m;
import kotlinx.coroutines.flow.InterfaceC41669n;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.prooface.session.m */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32228m implements InterfaceC32204d0 {

    /* JADX INFO: renamed from: a */
    public final InterfaceC41709m0 f65658a;

    /* JADX INFO: renamed from: b */
    public final C32205d1 f65659b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC41634e f65660c;

    /* JADX INFO: renamed from: d */
    public final C32230n f65661d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC41669n f65662e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC41669n f65663f;

    /* JADX INFO: renamed from: g */
    public final AtomicBoolean f65664g;

    /* JADX INFO: renamed from: h */
    public final InterfaceC41668m f65665h;

    @Override // com.sumsub.sns.internal.features.presentation.prooface.session.InterfaceC32204d0
    /* JADX INFO: renamed from: a */
    public final Object mo71051a(Liveness3dFaceRepository$LivenessRepositoryResult liveness3dFaceRepository$LivenessRepositoryResult, C32219i0 c32219i0) {
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x007d, code lost:
    
        if (r6 == r1) goto L27;
     */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m71059a(ContinuationImpl continuationImpl) {
        C32224k c32224k;
        C29818c c29818c;
        if (continuationImpl instanceof C32224k) {
            c32224k = (C32224k) continuationImpl;
            int i11 = c32224k.f65646c;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c32224k.f65646c = i11 - Integer.MIN_VALUE;
            } else {
                c32224k = new C32224k(this, continuationImpl);
            }
        } else {
            c32224k = new C32224k(this, continuationImpl);
        }
        Object objM90882F = c32224k.f65644a;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c32224k.f65646c;
        if (i12 != 0) {
            if (i12 == 1) {
                ResultKt.throwOnFailure(objM90882F);
            } else {
                if (i12 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objM90882F);
            }
            c29818c = (C29818c) objM90882F;
            AbstractC32267d.m71078a("Calibration phase: finished: " + c29818c);
            return c29818c;
        }
        ResultKt.throwOnFailure(objM90882F);
        AbstractC32267d.m71078a("Calibration phase: started");
        if (this.f65659b.f65593b) {
            C32221j c32221j = new C32221j(this.f65660c);
            c32224k.f65646c = 1;
            objM90882F = C41636g.m90882F(c32221j, c32224k);
            if (objM90882F != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        C29818c.Companion.getClass();
        c29818c = C29818c.f59895e;
        AbstractC32267d.m71078a("Calibration phase: finished: " + c29818c);
        return c29818c;
        C28758x c28758x = ((C32016L0) objM90882F).f65082a;
        if (c28758x.f58489b == c28758x.f58490c) {
            AbstractC32267d.m71078a("Calibration phase: exposure min=max, zeroCalibration");
            C29818c.Companion.getClass();
            c29818c = C29818c.f59896f;
        } else {
            c32224k.f65646c = 2;
            objM90882F = m71058a(c28758x, c32224k);
        }
        AbstractC32267d.m71078a("Calibration phase: finished: " + c29818c);
        return c29818c;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public final Object m71060b(ContinuationImpl continuationImpl) {
        C32226l c32226l;
        if (continuationImpl instanceof C32226l) {
            c32226l = (C32226l) continuationImpl;
            int i11 = c32226l.f65653c;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c32226l.f65653c = i11 - Integer.MIN_VALUE;
            } else {
                c32226l = new C32226l(this, continuationImpl);
            }
        } else {
            c32226l = new C32226l(this, continuationImpl);
        }
        Object objM90882F = c32226l.f65651a;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c32226l.f65653c;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objM90882F);
            this.f65664g.set(true);
            InterfaceC41668m interfaceC41668m = this.f65665h;
            c32226l.f65653c = 1;
            objM90882F = C41636g.m90882F(interfaceC41668m, c32226l);
            if (objM90882F == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objM90882F);
        }
        C29822f c29822f = (C29822f) objM90882F;
        this.f65664g.set(false);
        AbstractC32267d.m71078a("Calibration phase: collected: " + c29822f);
        return c29822f;
    }

    @Override // com.sumsub.sns.internal.features.presentation.prooface.session.InterfaceC32204d0
    public final InterfaceC41634e getState() {
        return this.f65663f;
    }

    public C32228m(InterfaceC41709m0 interfaceC41709m0, C32205d1 c32205d1, InterfaceC41634e interfaceC41634e, C32230n c32230n, C32194a c32194a) {
        this.f65658a = interfaceC41709m0;
        this.f65659b = c32205d1;
        this.f65660c = interfaceC41634e;
        this.f65661d = c32230n;
        InterfaceC41669n interfaceC41669nM91009a = C41679x.m91009a(C32197b.f65570a);
        this.f65662e = interfaceC41669nM91009a;
        this.f65663f = interfaceC41669nM91009a;
        this.f65664g = new AtomicBoolean(false);
        this.f65665h = C41674s.m91001b(0, 0, null, 7, null);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00af  */
    /* JADX WARN: Code duplicated, block: B:34:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:38:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:40:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:43:0x00ea A[LOOP:0: B:41:0x00e4->B:43:0x00ea, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:46:0x0101  */
    /* JADX WARN: Code duplicated, block: B:49:0x010f A[LOOP:1: B:47:0x0109->B:49:0x010f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:57:0x013d  */
    /* JADX WARN: Code duplicated, block: B:59:0x0143  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m71058a(C28758x c28758x, ContinuationImpl continuationImpl) {
        C32212g c32212g;
        C28758x c28758x2;
        C29822f c29822f;
        C29822f c29822f2;
        InterfaceC41669n interfaceC41669n;
        C32200c c32200c;
        C29822f c29822f3;
        C29822f c29822f4;
        C29822f c29822f5;
        List listListOf;
        int size;
        String str;
        Iterator it;
        float fMax;
        Iterator it2;
        float fMin;
        if (continuationImpl instanceof C32212g) {
            c32212g = (C32212g) continuationImpl;
            int i11 = c32212g.f65618e;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c32212g.f65618e = i11 - Integer.MIN_VALUE;
            } else {
                c32212g = new C32212g(this, continuationImpl);
            }
        } else {
            c32212g = new C32212g(this, continuationImpl);
        }
        Object objM71057a = c32212g.f65616c;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c32212g.f65618e;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objM71057a);
            AbstractC32267d.m71078a("Calibration phase: started. exposure: " + c28758x);
            float f11 = c28758x.f58489b;
            c32212g.f65614a = c28758x;
            c32212g.f65618e = 1;
            objM71057a = m71057a(f11, c32212g);
            if (objM71057a != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i12 == 1) {
            c28758x = (C28758x) c32212g.f65614a;
            ResultKt.throwOnFailure(objM71057a);
        } else {
            if (i12 == 2) {
                c29822f = c32212g.f65615b;
                c28758x2 = (C28758x) c32212g.f65614a;
                ResultKt.throwOnFailure(objM71057a);
                c29822f2 = (C29822f) objM71057a;
                interfaceC41669n = this.f65662e;
                c32200c = new C32200c(c28758x2.f58488a);
                c32212g.f65614a = c29822f;
                c32212g.f65615b = c29822f2;
                c32212g.f65618e = 3;
                if (interfaceC41669n.emit(c32200c, c32212g) != coroutine_suspended) {
                    c29822f3 = c29822f;
                    c29822f4 = c29822f2;
                    c32212g.f65614a = c29822f3;
                    c32212g.f65615b = c29822f4;
                    c32212g.f65618e = 4;
                    if (DelayKt.m90350b(250L, c32212g) != coroutine_suspended) {
                        c29822f5 = c29822f3;
                    }
                }
                return coroutine_suspended;
            }
            if (i12 == 3) {
                c29822f4 = c32212g.f65615b;
                c29822f3 = (C29822f) c32212g.f65614a;
                ResultKt.throwOnFailure(objM71057a);
                c32212g.f65614a = c29822f3;
                c32212g.f65615b = c29822f4;
                c32212g.f65618e = 4;
                if (DelayKt.m90350b(250L, c32212g) != coroutine_suspended) {
                    c29822f5 = c29822f3;
                }
                return coroutine_suspended;
            }
            if (i12 != 4) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c29822f4 = c32212g.f65615b;
            c29822f5 = (C29822f) c32212g.f65614a;
            ResultKt.throwOnFailure(objM71057a);
        }
        listListOf = CollectionsKt.listOf((Object[]) new C29822f[]{c29822f5, c29822f4});
        size = listListOf.size();
        str = C33864ph.f71456b;
        if (size >= 2) {
            it = listListOf.iterator();
            if (it.hasNext()) {
                fMax = ((C29822f) it.next()).f59902b;
                while (it.hasNext()) {
                    fMax = Math.max(fMax, ((C29822f) it.next()).f59902b);
                }
                it2 = listListOf.iterator();
                if (it2.hasNext()) {
                    fMin = ((C29822f) it2.next()).f59902b;
                    while (it2.hasNext()) {
                        fMin = Math.min(fMin, ((C29822f) it2.next()).f59902b);
                    }
                    if (fMax > 0.0f && (fMax - fMin) / fMax > 0.3f) {
                        str = "ok";
                    }
                } else {
                    throw new NoSuchElementException();
                }
            } else {
                throw new NoSuchElementException();
            }
        }
        C29818c c29818c = new C29818c(str, CollectionsKt.toMutableList((Collection) listListOf), 4);
        AbstractC32267d.m71078a("Calibration phase: finished");
        return c29818c;
        C29822f c29822f6 = (C29822f) objM71057a;
        float f12 = c28758x.f58490c;
        c32212g.f65614a = c28758x;
        c32212g.f65615b = c29822f6;
        c32212g.f65618e = 2;
        Object objM71057a2 = m71057a(f12, c32212g);
        if (objM71057a2 != coroutine_suspended) {
            c28758x2 = c28758x;
            c29822f = c29822f6;
            objM71057a = objM71057a2;
            c29822f2 = (C29822f) objM71057a;
            interfaceC41669n = this.f65662e;
            c32200c = new C32200c(c28758x2.f58488a);
            c32212g.f65614a = c29822f;
            c32212g.f65615b = c29822f2;
            c32212g.f65618e = 3;
            if (interfaceC41669n.emit(c32200c, c32212g) != coroutine_suspended) {
                c29822f3 = c29822f;
                c29822f4 = c29822f2;
                c32212g.f65614a = c29822f3;
                c32212g.f65615b = c29822f4;
                c32212g.f65618e = 4;
                if (DelayKt.m90350b(250L, c32212g) != coroutine_suspended) {
                    c29822f5 = c29822f3;
                    listListOf = CollectionsKt.listOf((Object[]) new C29822f[]{c29822f5, c29822f4});
                    size = listListOf.size();
                    str = C33864ph.f71456b;
                    if (size >= 2) {
                        it = listListOf.iterator();
                        if (it.hasNext()) {
                            fMax = ((C29822f) it.next()).f59902b;
                            while (it.hasNext()) {
                                fMax = Math.max(fMax, ((C29822f) it.next()).f59902b);
                            }
                            it2 = listListOf.iterator();
                            if (it2.hasNext()) {
                                fMin = ((C29822f) it2.next()).f59902b;
                                while (it2.hasNext()) {
                                    fMin = Math.min(fMin, ((C29822f) it2.next()).f59902b);
                                }
                                if (fMax > 0.0f) {
                                    str = "ok";
                                }
                            } else {
                                throw new NoSuchElementException();
                            }
                        } else {
                            throw new NoSuchElementException();
                        }
                    }
                    C29818c c29818c2 = new C29818c(str, CollectionsKt.toMutableList((Collection) listListOf), 4);
                    AbstractC32267d.m71078a("Calibration phase: finished");
                    return c29818c2;
                }
            }
        }
        return coroutine_suspended;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0066 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m71057a(float f11, ContinuationImpl continuationImpl) {
        C32206e c32206e;
        Object objM71060b;
        if (continuationImpl instanceof C32206e) {
            c32206e = (C32206e) continuationImpl;
            int i11 = c32206e.f65597c;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c32206e.f65597c = i11 - Integer.MIN_VALUE;
            } else {
                c32206e = new C32206e(this, continuationImpl);
            }
        } else {
            c32206e = new C32206e(this, continuationImpl);
        }
        Object obj = c32206e.f65595a;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c32206e.f65597c;
        if (i12 == 0) {
            ResultKt.throwOnFailure(obj);
            InterfaceC41669n interfaceC41669n = this.f65662e;
            C32200c c32200c = new C32200c(f11);
            c32206e.f65597c = 1;
            if (interfaceC41669n.emit(c32200c, c32206e) != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i12 == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            if (i12 != 2) {
                if (i12 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return obj;
            }
            ResultKt.throwOnFailure(obj);
        }
        c32206e.f65597c = 3;
        objM71060b = m71060b(c32206e);
        if (objM71060b != coroutine_suspended) {
            return coroutine_suspended;
        }
        return objM71060b;
        c32206e.f65597c = 2;
        if (DelayKt.m90350b(250L, c32206e) != coroutine_suspended) {
            c32206e.f65597c = 3;
            objM71060b = m71060b(c32206e);
            if (objM71060b != coroutine_suspended) {
                return objM71060b;
            }
        }
        return coroutine_suspended;
    }

    @Override // com.sumsub.sns.internal.features.presentation.prooface.session.InterfaceC32204d0
    /* JADX INFO: renamed from: a */
    public final boolean mo71054a(ImageProxy imageProxy, RectF rectF, float f11) {
        if (!this.f65664g.get()) {
            return false;
        }
        C29822f c29822fM71062a = this.f65661d.m71062a(imageProxy, f11);
        AbstractC32267d.m71078a("Calibration phase: processed. img.exposure: " + f11 + ", calibration: " + c29822fM71062a);
        C41696j.m91104d(this.f65658a, null, null, new C32209f(this, c29822fM71062a, null), 3, null);
        return false;
    }
}
