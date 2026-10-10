package com.sumsub.sns.internal.features.presentation.prooface.session;

import com.sumsub.sns.internal.core.common.C28422U0;
import com.sumsub.sns.internal.core.domain.facedetector.C28558d;
import com.sumsub.sns.internal.features.data.model.prooface.C29818c;
import com.sumsub.sns.internal.features.data.network.prooface.C29886a;
import com.sumsub.sns.internal.features.data.network.prooface.C29900o;
import com.sumsub.sns.internal.features.data.network.prooface.InterfaceC29887b;
import com.sumsub.sns.internal.features.data.network.prooface.Liveness3dFaceRepository$LivenessRepositoryResult;
import com.sumsub.sns.internal.features.data.repository.common.InterfaceC29953a;
import com.sumsub.sns.internal.features.presentation.prooface.C31984A1;
import com.sumsub.sns.internal.features.presentation.prooface.utils.AbstractC32267d;
import com.sumsub.sns.internal.features.presentation.prooface.utils.C32264a;
import com.sumsub.sns.internal.features.presentation.prooface.utils.C32266c;
import com.sumsub.sns.internal.fingerprint.C33062c;
import com.sumsub.sns.internal.log.C33272c;
import com.sumsub.sns.internal.util.camera.C33394d;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.C41685g2;
import kotlinx.coroutines.C41686h;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.C41713n0;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.flow.C41636g;
import kotlinx.coroutines.flow.C41679x;
import kotlinx.coroutines.flow.InterfaceC41669n;
import kotlinx.coroutines.flow.InterfaceC41678w;
import kotlinx.coroutines.flow.SharingStarted;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.prooface.session.r0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32239r0 {

    /* JADX INFO: renamed from: a */
    public final InterfaceC41709m0 f65683a;

    /* JADX INFO: renamed from: b */
    public final C29900o f65684b;

    /* JADX INFO: renamed from: c */
    public final C28558d f65685c;

    /* JADX INFO: renamed from: d */
    public final C32207e0 f65686d;

    /* JADX INFO: renamed from: e */
    public InterfaceC32204d0 f65687e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC41669n f65688f;

    /* JADX INFO: renamed from: g */
    public final InterfaceC41678w f65689g;

    /* JADX INFO: renamed from: h */
    public final C32208e1 f65690h;

    /* JADX WARN: Code duplicated, block: B:35:0x008b  */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0099, code lost:
    
        if (r8 == r1) goto L37;
     */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m71064a(C32239r0 c32239r0, Continuation continuation) {
        C32213g0 c32213g0;
        Object obj;
        C32205d1 c32205d1;
        c32239r0.getClass();
        if (continuation instanceof C32213g0) {
            c32213g0 = (C32213g0) continuation;
            int i11 = c32213g0.f65622d;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c32213g0.f65622d = i11 - Integer.MIN_VALUE;
            } else {
                c32213g0 = new C32213g0(c32239r0, continuation);
            }
        } else {
            c32213g0 = new C32213g0(c32239r0, continuation);
        }
        Object objM71069a = c32213g0.f65620b;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c32213g0.f65622d;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objM71069a);
            c32213g0.f65622d = 1;
            objM71069a = c32239r0.m71069a(c32213g0);
            if (objM71069a != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i12 == 1) {
            ResultKt.throwOnFailure(objM71069a);
        } else {
            if (i12 == 2) {
                obj = c32213g0.f65619a;
                ResultKt.throwOnFailure(objM71069a);
                c32205d1 = ((C32173P) obj).f65517a;
                c32213g0.f65619a = null;
                c32213g0.f65622d = 3;
                if (c32239r0.m71067a(c32205d1, (C29818c) objM71069a, c32213g0) != coroutine_suspended) {
                    C32208e1 c32208e1 = c32239r0.f65690h;
                    c32213g0.f65622d = 4;
                    objM71069a = C41636g.m90882F(C41636g.m90881E(c32208e1.f65603a), c32213g0);
                }
                return coroutine_suspended;
            }
            if (i12 == 3) {
                ResultKt.throwOnFailure(objM71069a);
                C32208e1 c32208e2 = c32239r0.f65690h;
                c32213g0.f65622d = 4;
                objM71069a = C41636g.m90882F(C41636g.m90881E(c32208e2.f65603a), c32213g0);
            } else {
                if (i12 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objM71069a);
            }
        }
        return (InterfaceC32150D0) objM71069a;
        obj = (InterfaceC32175Q) objM71069a;
        if (Intrinsics.areEqual(obj, C32171O.f65514a)) {
            return C32144A0.f65435a;
        }
        if (!(obj instanceof C32173P)) {
            throw new NoWhenBranchMatchedException();
        }
        C32173P c32173p = (C32173P) obj;
        C32205d1 c32205d2 = c32173p.f65517a;
        c32213g0.f65619a = c32173p;
        c32213g0.f65622d = 2;
        objM71069a = c32239r0.m71068a(c32205d2, c32213g0);
        if (objM71069a != coroutine_suspended) {
            c32205d1 = ((C32173P) obj).f65517a;
            c32213g0.f65619a = null;
            c32213g0.f65622d = 3;
            if (c32239r0.m71067a(c32205d1, (C29818c) objM71069a, c32213g0) != coroutine_suspended) {
                C32208e1 c32208e3 = c32239r0.f65690h;
                c32213g0.f65622d = 4;
                objM71069a = C41636g.m90882F(C41636g.m90881E(c32208e3.f65603a), c32213g0);
            }
        }
        return coroutine_suspended;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0092  */
    /* JADX WARN: Code duplicated, block: B:35:0x0094 A[Catch: all -> 0x0046, Exception -> 0x0051, CancellationException -> 0x0054, PHI: r2
      0x0094: PHI (r2v8 com.sumsub.sns.internal.features.presentation.prooface.session.D0) = 
      (r2v7 com.sumsub.sns.internal.features.presentation.prooface.session.D0)
      (r2v10 com.sumsub.sns.internal.features.presentation.prooface.session.D0)
     binds: [B:33:0x0090, B:21:0x004d] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #1 {CancellationException -> 0x0054, blocks: (B:21:0x004d, B:35:0x0094, B:26:0x0057, B:32:0x007f, B:29:0x0063), top: B:57:0x0021, outer: #0 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x00bb A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:54:0x010b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Instruction removed from duplicated block: B:35:0x0094, please report this as an issue */
    /* JADX INFO: renamed from: b */
    public final Object m71071b(ContinuationImpl continuationImpl) throws Throwable {
        C32227l0 c32227l0;
        Exception exc;
        InterfaceC32150D0 interfaceC32150D0;
        InterfaceC32204d0 c32232o;
        C41685g2 c41685g2;
        C32229m0 c32229m0;
        if (continuationImpl instanceof C32227l0) {
            c32227l0 = (C32227l0) continuationImpl;
            int i11 = c32227l0.f65657d;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c32227l0.f65657d = i11 - Integer.MIN_VALUE;
            } else {
                c32227l0 = new C32227l0(this, continuationImpl);
            }
        } else {
            c32227l0 = new C32227l0(this, continuationImpl);
        }
        Object objM91130f = c32227l0.f65655b;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        try {
            try {
                try {
                    switch (c32227l0.f65657d) {
                        case 0:
                            ResultKt.throwOnFailure(objM91130f);
                            AbstractC32267d.m71078a("LivenessSessionHandler: Session started");
                            C32231n0 c32231n0 = new C32231n0(this);
                            C32233o0 c32233o0 = new C32233o0(this.f65690h);
                            c32227l0.f65657d = 1;
                            objM91130f = C41713n0.m91130f(new C32249w0(c32231n0, c32233o0, null), c32227l0);
                            if (objM91130f != coroutine_suspended) {
                                interfaceC32150D0 = (InterfaceC32150D0) objM91130f;
                                c32232o = new C32232o();
                                c32227l0.f65654a = interfaceC32150D0;
                                c32227l0.f65657d = 2;
                                if (m71066a(c32232o, c32227l0) == coroutine_suspended) {
                                    AbstractC32267d.m71078a("LivenessSessionHandler: Session finished: " + interfaceC32150D0);
                                    c41685g2 = C41685g2.f91735b;
                                    c32229m0 = new C32229m0(this, null);
                                    c32227l0.f65654a = interfaceC32150D0;
                                    c32227l0.f65657d = 3;
                                    if (C41686h.m91049g(c41685g2, c32229m0, c32227l0) == coroutine_suspended) {
                                        return interfaceC32150D0;
                                    }
                                }
                            }
                            return coroutine_suspended;
                        case 1:
                            ResultKt.throwOnFailure(objM91130f);
                            interfaceC32150D0 = (InterfaceC32150D0) objM91130f;
                            c32232o = new C32232o();
                            c32227l0.f65654a = interfaceC32150D0;
                            c32227l0.f65657d = 2;
                            if (m71066a(c32232o, c32227l0) == coroutine_suspended) {
                                AbstractC32267d.m71078a("LivenessSessionHandler: Session finished: " + interfaceC32150D0);
                                c41685g2 = C41685g2.f91735b;
                                c32229m0 = new C32229m0(this, null);
                                c32227l0.f65654a = interfaceC32150D0;
                                c32227l0.f65657d = 3;
                                if (C41686h.m91049g(c41685g2, c32229m0, c32227l0) == coroutine_suspended) {
                                    return interfaceC32150D0;
                                }
                            }
                            return coroutine_suspended;
                        case 2:
                            interfaceC32150D0 = (InterfaceC32150D0) c32227l0.f65654a;
                            ResultKt.throwOnFailure(objM91130f);
                            AbstractC32267d.m71078a("LivenessSessionHandler: Session finished: " + interfaceC32150D0);
                            c41685g2 = C41685g2.f91735b;
                            c32229m0 = new C32229m0(this, null);
                            c32227l0.f65654a = interfaceC32150D0;
                            c32227l0.f65657d = 3;
                            if (C41686h.m91049g(c41685g2, c32229m0, c32227l0) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            return interfaceC32150D0;
                        case 3:
                        case 5:
                            InterfaceC32150D0 interfaceC32150D1 = (InterfaceC32150D0) c32227l0.f65654a;
                            ResultKt.throwOnFailure(objM91130f);
                            return interfaceC32150D1;
                        case 4:
                            exc = (Exception) c32227l0.f65654a;
                            ResultKt.throwOnFailure(objM91130f);
                            C33272c.f67816e.f67810a.mo68955d("Prooface", "LivenessSessionHandler: Session error: ", exc);
                            Object c32255z0 = exc instanceof C32152E0 ? C32144A0.f65435a : new C32255z0(exc);
                            C41685g2 c41685g3 = C41685g2.f91735b;
                            C32229m0 c32229m1 = new C32229m0(this, null);
                            c32227l0.f65654a = c32255z0;
                            c32227l0.f65657d = 5;
                            if (C41686h.m91049g(c41685g3, c32229m1, c32227l0) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            return c32255z0;
                        case 6:
                            Throwable th2 = (Throwable) c32227l0.f65654a;
                            ResultKt.throwOnFailure(objM91130f);
                            throw th2;
                        default:
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } catch (CancellationException e11) {
                    throw e11;
                }
            } catch (Exception e12) {
                exc = e12;
                InterfaceC32204d0 c32232o2 = new C32232o();
                c32227l0.f65654a = exc;
                c32227l0.f65657d = 4;
                if (m71066a(c32232o2, c32227l0) == coroutine_suspended) {
                }
            }
        } catch (Throwable th3) {
            C41685g2 c41685g4 = C41685g2.f91735b;
            C32229m0 c32229m2 = new C32229m0(this, null);
            c32227l0.f65654a = th3;
            c32227l0.f65657d = 6;
            if (C41686h.m91049g(c41685g4, c32229m2, c32227l0) != coroutine_suspended) {
                throw th3;
            }
        }
    }

    public C32239r0(InterfaceC41709m0 interfaceC41709m0, C29900o c29900o, C28558d c28558d, C32207e0 c32207e0) {
        this.f65683a = interfaceC41709m0;
        this.f65684b = c29900o;
        this.f65685c = c28558d;
        this.f65686d = c32207e0;
        C32238r c32238r = new C32238r();
        this.f65687e = c32238r;
        InterfaceC41669n interfaceC41669nM91009a = C41679x.m91009a(c32238r);
        this.f65688f = interfaceC41669nM91009a;
        this.f65689g = C41636g.m90916g0(C41636g.m90930n0(interfaceC41669nM91009a, new C32237q0(null)), interfaceC41709m0, SharingStarted.INSTANCE.getEagerly(), C32201c0.f65577a);
        this.f65690h = new C32208e1();
    }

    /* JADX WARN: Code duplicated, block: B:29:0x007a A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m71069a(ContinuationImpl continuationImpl) {
        C32216h0 c32216h0;
        C32198b0 c32198b0;
        Object objM71055a;
        if (continuationImpl instanceof C32216h0) {
            c32216h0 = (C32216h0) continuationImpl;
            int i11 = c32216h0.f65630d;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c32216h0.f65630d = i11 - Integer.MIN_VALUE;
            } else {
                c32216h0 = new C32216h0(this, continuationImpl);
            }
        } else {
            c32216h0 = new C32216h0(this, continuationImpl);
        }
        Object obj = c32216h0.f65628b;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c32216h0.f65630d;
        if (i12 == 0) {
            ResultKt.throwOnFailure(obj);
            AbstractC32267d.m71078a("LivenessSessionHandler: init Liveness Session");
            C32198b0 c32198b1 = new C32198b0();
            c32216h0.f65627a = c32198b1;
            c32216h0.f65630d = 1;
            if (m71066a(c32198b1, c32216h0) != coroutine_suspended) {
                c32198b0 = c32198b1;
            }
            return coroutine_suspended;
        }
        if (i12 == 1) {
            c32198b0 = c32216h0.f65627a;
            ResultKt.throwOnFailure(obj);
        } else {
            if (i12 != 2) {
                if (i12 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return obj;
            }
            c32198b0 = c32216h0.f65627a;
            ResultKt.throwOnFailure(obj);
        }
        c32216h0.f65627a = null;
        c32216h0.f65630d = 3;
        objM71055a = c32198b0.m71055a(c32216h0);
        if (objM71055a != coroutine_suspended) {
            return coroutine_suspended;
        }
        return objM71055a;
        C29900o c29900o = this.f65684b;
        InterfaceC29887b interfaceC29887b = new InterfaceC29887b() { // from class: com.sumsub.sns.internal.features.presentation.prooface.session.j1
            @Override // com.sumsub.sns.internal.features.data.network.prooface.InterfaceC29887b
            /* JADX INFO: renamed from: a */
            public final void mo69942a(Liveness3dFaceRepository$LivenessRepositoryResult liveness3dFaceRepository$LivenessRepositoryResult) {
                C32239r0.m71065a(this.f65643a, liveness3dFaceRepository$LivenessRepositoryResult);
            }
        };
        c32216h0.f65627a = c32198b0;
        c32216h0.f65630d = 2;
        if (c29900o.m69943a(interfaceC29887b, c32216h0) != coroutine_suspended) {
            c32216h0.f65627a = null;
            c32216h0.f65630d = 3;
            objM71055a = c32198b0.m71055a(c32216h0);
            if (objM71055a != coroutine_suspended) {
                return objM71055a;
            }
        }
        return coroutine_suspended;
    }

    /* JADX INFO: renamed from: a */
    public static final void m71065a(C32239r0 c32239r0, Liveness3dFaceRepository$LivenessRepositoryResult liveness3dFaceRepository$LivenessRepositoryResult) {
        c32239r0.m71070a(liveness3dFaceRepository$LivenessRepositoryResult);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m71068a(C32205d1 c32205d1, ContinuationImpl continuationImpl) {
        C32222j0 c32222j0;
        C32228m c32228m;
        if (continuationImpl instanceof C32222j0) {
            c32222j0 = (C32222j0) continuationImpl;
            int i11 = c32222j0.f65642d;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c32222j0.f65642d = i11 - Integer.MIN_VALUE;
            } else {
                c32222j0 = new C32222j0(this, continuationImpl);
            }
        } else {
            c32222j0 = new C32222j0(this, continuationImpl);
        }
        Object obj = c32222j0.f65640b;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c32222j0.f65642d;
        if (i12 == 0) {
            ResultKt.throwOnFailure(obj);
            C32207e0 c32207e0 = this.f65686d;
            C32228m c32228m2 = new C32228m(c32207e0.f65598a, c32205d1, c32207e0.f65599b, new C32230n(), new C32194a());
            c32222j0.f65639a = c32228m2;
            c32222j0.f65642d = 1;
            if (m71066a(c32228m2, c32222j0) != coroutine_suspended) {
                c32228m = c32228m2;
            }
        }
        if (i12 != 1) {
            if (i12 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return obj;
        }
        c32228m = c32222j0.f65639a;
        ResultKt.throwOnFailure(obj);
        c32222j0.f65639a = null;
        c32222j0.f65642d = 2;
        Object objM71059a = c32228m.m71059a(c32222j0);
        return objM71059a == coroutine_suspended ? coroutine_suspended : objM71059a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00cf, code lost:
    
        if (r1.m71052a(r3) == r4) goto L22;
     */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m71067a(C32205d1 c32205d1, C29818c c29818c, ContinuationImpl continuationImpl) throws NoSuchAlgorithmException {
        C32225k0 c32225k0;
        C32169N c32169n;
        if (continuationImpl instanceof C32225k0) {
            c32225k0 = (C32225k0) continuationImpl;
            int i11 = c32225k0.f65650d;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c32225k0.f65650d = i11 - Integer.MIN_VALUE;
            } else {
                c32225k0 = new C32225k0(this, continuationImpl);
            }
        } else {
            c32225k0 = new C32225k0(this, continuationImpl);
        }
        Object obj = c32225k0.f65648b;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c32225k0.f65650d;
        if (i12 == 0) {
            ResultKt.throwOnFailure(obj);
            C32207e0 c32207e0 = this.f65686d;
            C29886a c29886a = new C29886a();
            c29886a.m69940a(c32205d1.f65592a);
            C32202c1 c32202c1 = new C32202c1(c32207e0.f65598a, new C28422U0(), c32207e0.f65600c.f65607a, new C32156G0(c32207e0.f65600c.f65609c.f58188z, c29886a, c32205d1.f65592a, c32207e0.f65601d, new C32236q((C33062c) c32207e0.f65600c.f65609c.f58186x.getValue(), (InterfaceC29953a) c32207e0.f65600c.f65609c.f58168f.getValue(), (C33394d) c32207e0.f65600c.f65609c.f58187y.getValue())), c29818c, c32205d1.f65594c);
            InterfaceC41709m0 interfaceC41709m0 = c32207e0.f65598a;
            C32266c c32266c = c32207e0.f65602e;
            C28558d c28558d = c32207e0.f65600c.f65608b;
            C31984A1 c31984a1 = c32207e0.f65601d;
            C32169N c32169n2 = new C32169N(interfaceC41709m0, c32266c, c28558d, c32202c1, new C32264a(c31984a1), c31984a1, c32207e0.f65599b);
            c32225k0.f65647a = c32169n2;
            c32225k0.f65650d = 1;
            if (m71066a(c32169n2, c32225k0) != coroutine_suspended) {
                c32169n = c32169n2;
            }
            return coroutine_suspended;
        }
        if (i12 == 1) {
            c32169n = c32225k0.f65647a;
            ResultKt.throwOnFailure(obj);
        } else {
            if (i12 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
        c32225k0.f65647a = null;
        c32225k0.f65650d = 2;
    }

    /* JADX INFO: renamed from: a */
    public final void m71070a(Liveness3dFaceRepository$LivenessRepositoryResult liveness3dFaceRepository$LivenessRepositoryResult) {
        AbstractC32267d.m71078a("LivenessSessionHandler: received LivenessRepository message: " + liveness3dFaceRepository$LivenessRepositoryResult);
        C41696j.m91104d(this.f65683a, null, null, new C32219i0(this, liveness3dFaceRepository$LivenessRepositoryResult, null), 3, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m71066a(InterfaceC32204d0 interfaceC32204d0, ContinuationImpl continuationImpl) {
        C32235p0 c32235p0;
        if (continuationImpl instanceof C32235p0) {
            c32235p0 = (C32235p0) continuationImpl;
            int i11 = c32235p0.f65675d;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c32235p0.f65675d = i11 - Integer.MIN_VALUE;
            } else {
                c32235p0 = new C32235p0(this, continuationImpl);
            }
        } else {
            c32235p0 = new C32235p0(this, continuationImpl);
        }
        Object obj = c32235p0.f65673b;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c32235p0.f65675d;
        if (i12 == 0) {
            ResultKt.throwOnFailure(obj);
            this.f65687e = interfaceC32204d0;
            InterfaceC41669n interfaceC41669n = this.f65688f;
            c32235p0.f65672a = interfaceC32204d0;
            c32235p0.f65675d = 1;
            if (interfaceC41669n.emit(interfaceC32204d0, c32235p0) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            interfaceC32204d0 = c32235p0.f65672a;
            ResultKt.throwOnFailure(obj);
        }
        AbstractC32267d.m71078a("LivenessSessionHandler: phase: " + interfaceC32204d0);
        return Unit.INSTANCE;
    }
}
