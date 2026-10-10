package com.sumsub.sns.internal.features.presentation.prooface.session;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.util.Size;
import androidx.camera.core.ImageProxy;
import com.sumsub.sns.internal.core.common.AbstractC28396H;
import com.sumsub.sns.internal.core.common.AbstractC28421U;
import com.sumsub.sns.internal.core.common.AbstractC28488r;
import com.sumsub.sns.internal.core.common.C28433a;
import com.sumsub.sns.internal.core.domain.facedetector.AbstractC28568n;
import com.sumsub.sns.internal.core.domain.facedetector.C28555a;
import com.sumsub.sns.internal.core.domain.facedetector.C28558d;
import com.sumsub.sns.internal.core.domain.facedetector.C28564j;
import com.sumsub.sns.internal.core.domain.facedetector.C28565k;
import com.sumsub.sns.internal.core.domain.facedetector.C28566l;
import com.sumsub.sns.internal.core.domain.facedetector.C28567m;
import com.sumsub.sns.internal.features.data.model.common.AnswerType;
import com.sumsub.sns.internal.features.data.network.prooface.Liveness3dFaceRepository$LivenessRepositoryResult;
import com.sumsub.sns.internal.features.presentation.prooface.C31984A1;
import com.sumsub.sns.internal.features.presentation.prooface.utils.AbstractC32267d;
import com.sumsub.sns.internal.features.presentation.prooface.utils.C32264a;
import com.sumsub.sns.internal.features.presentation.prooface.utils.C32266c;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.flow.C41636g;
import kotlinx.coroutines.flow.C41674s;
import kotlinx.coroutines.flow.C41679x;
import kotlinx.coroutines.flow.InterfaceC41634e;
import kotlinx.coroutines.flow.InterfaceC41668m;
import kotlinx.coroutines.flow.InterfaceC41669n;
import kotlinx.coroutines.flow.InterfaceC41678w;
import kotlinx.coroutines.flow.SharingStarted;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.time.Duration;
import p852kotlin.time.DurationKt;
import p852kotlin.time.DurationUnit;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.prooface.session.N */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32169N implements InterfaceC32204d0 {

    /* JADX INFO: renamed from: q */
    public static final long f65495q;

    /* JADX INFO: renamed from: a */
    public final InterfaceC41709m0 f65496a;

    /* JADX INFO: renamed from: b */
    public final C32266c f65497b;

    /* JADX INFO: renamed from: c */
    public final C28558d f65498c;

    /* JADX INFO: renamed from: d */
    public final C32202c1 f65499d;

    /* JADX INFO: renamed from: e */
    public final C32264a f65500e;

    /* JADX INFO: renamed from: f */
    public final C31984A1 f65501f;

    /* JADX INFO: renamed from: g */
    public final InterfaceC41634e f65502g;

    /* JADX INFO: renamed from: h */
    public final InterfaceC41669n f65503h;

    /* JADX INFO: renamed from: i */
    public final InterfaceC41668m f65504i;

    /* JADX INFO: renamed from: j */
    public final C28433a f65505j;

    /* JADX INFO: renamed from: k */
    public Bitmap f65506k;

    /* JADX INFO: renamed from: l */
    public final InterfaceC41669n f65507l;

    /* JADX INFO: renamed from: m */
    public final InterfaceC41669n f65508m;

    /* JADX INFO: renamed from: n */
    public final InterfaceC41669n f65509n;

    /* JADX INFO: renamed from: o */
    public final InterfaceC41669n f65510o;

    /* JADX INFO: renamed from: p */
    public final InterfaceC41678w f65511p;

    /* JADX WARN: Code duplicated, block: B:37:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:40:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:43:0x00de  */
    /* JADX WARN: Code duplicated, block: B:46:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00f3, code lost:
    
        if (r12 == r1) goto L48;
     */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m71052a(ContinuationImpl continuationImpl) {
        C32163K c32163k;
        C32240s c32240s;
        InterfaceC41669n interfaceC41669n;
        Object objM90883G;
        Object objM90882F;
        if (continuationImpl instanceof C32163K) {
            c32163k = (C32163K) continuationImpl;
            int i11 = c32163k.f65487c;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c32163k.f65487c = i11 - Integer.MIN_VALUE;
            } else {
                c32163k = new C32163K(this, continuationImpl);
            }
        } else {
            c32163k = new C32163K(this, continuationImpl);
        }
        Object obj = c32163k.f65485a;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c32163k.f65487c;
        if (i12 == 0) {
            ResultKt.throwOnFailure(obj);
            AbstractC32267d.m71078a("ImageGathering phase: started");
            AbstractC28421U.m69303a(this.f65504i, this.f65496a, new C32165L(this));
            c32163k.f65487c = 1;
            Object objM90882F2 = C41636g.m90882F(C41636g.m90917h(C41636g.m90922j0(new C32147C(new C32153F(this.f65502g)), f65495q), new C32155G(null)), c32163k);
            if (objM90882F2 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                objM90882F2 = Unit.INSTANCE;
            }
            if (objM90882F2 != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i12 == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            if (i12 == 2) {
                ResultKt.throwOnFailure(obj);
                c32240s = new C32240s(this.f65506k, false);
                interfaceC41669n = this.f65509n;
                c32163k.f65487c = 3;
                if (interfaceC41669n.emit(c32240s, c32163k) != coroutine_suspended) {
                    C32202c1 c32202c1 = this.f65499d;
                    c32163k.f65487c = 4;
                    objM90883G = C41636g.m90883G(c32202c1.f65589l, new C32170N0(c32202c1, null), c32163k);
                    if (objM90883G != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                        objM90883G = Unit.INSTANCE;
                    }
                    if (objM90883G != coroutine_suspended) {
                        c32163k.f65487c = 5;
                        objM90882F = C41636g.m90882F(C41636g.m90881E(this.f65510o), c32163k);
                        if (objM90882F != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                            objM90882F = Unit.INSTANCE;
                        }
                    }
                }
                return coroutine_suspended;
            }
            if (i12 == 3) {
                ResultKt.throwOnFailure(obj);
                C32202c1 c32202c2 = this.f65499d;
                c32163k.f65487c = 4;
                objM90883G = C41636g.m90883G(c32202c2.f65589l, new C32170N0(c32202c2, null), c32163k);
                if (objM90883G != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    objM90883G = Unit.INSTANCE;
                }
                if (objM90883G != coroutine_suspended) {
                    c32163k.f65487c = 5;
                    objM90882F = C41636g.m90882F(C41636g.m90881E(this.f65510o), c32163k);
                    if (objM90882F != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                        objM90882F = Unit.INSTANCE;
                    }
                }
                return coroutine_suspended;
            }
            if (i12 == 4) {
                ResultKt.throwOnFailure(obj);
                c32163k.f65487c = 5;
                objM90882F = C41636g.m90882F(C41636g.m90881E(this.f65510o), c32163k);
                if (objM90882F != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    objM90882F = Unit.INSTANCE;
                }
            } else {
                if (i12 != 5) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
        }
        this.f65498c.m69417c();
        C28433a c28433a = this.f65505j;
        synchronized (c28433a) {
            try {
                Bitmap bitmap = c28433a.f57946b;
                if (bitmap != null) {
                    bitmap.recycle();
                }
                c28433a.f57946b = null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        AbstractC32267d.m71078a("ImageGathering phase: finished");
        return Unit.INSTANCE;
        this.f65498c.m69416b();
        c32163k.f65487c = 2;
        Object objM90883G2 = C41636g.m90883G(this.f65507l, new C32254z(null), c32163k);
        if (objM90883G2 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            objM90883G2 = Unit.INSTANCE;
        }
        if (objM90883G2 != coroutine_suspended) {
            c32240s = new C32240s(this.f65506k, false);
            interfaceC41669n = this.f65509n;
            c32163k.f65487c = 3;
            if (interfaceC41669n.emit(c32240s, c32163k) != coroutine_suspended) {
                C32202c1 c32202c3 = this.f65499d;
                c32163k.f65487c = 4;
                objM90883G = C41636g.m90883G(c32202c3.f65589l, new C32170N0(c32202c3, null), c32163k);
                if (objM90883G != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    objM90883G = Unit.INSTANCE;
                }
                if (objM90883G != coroutine_suspended) {
                    c32163k.f65487c = 5;
                    objM90882F = C41636g.m90882F(C41636g.m90881E(this.f65510o), c32163k);
                    if (objM90882F != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                        objM90882F = Unit.INSTANCE;
                    }
                }
            }
        }
        return coroutine_suspended;
    }

    static {
        Duration.Companion companion = Duration.INSTANCE;
        f65495q = DurationKt.toDuration(20, DurationUnit.SECONDS);
    }

    @Override // com.sumsub.sns.internal.features.presentation.prooface.session.InterfaceC32204d0
    public final InterfaceC41634e getState() {
        return this.f65511p;
    }

    public C32169N(InterfaceC41709m0 interfaceC41709m0, C32266c c32266c, C28558d c28558d, C32202c1 c32202c1, C32264a c32264a, C31984A1 c31984a1, InterfaceC41634e interfaceC41634e) {
        this.f65496a = interfaceC41709m0;
        this.f65497b = c32266c;
        this.f65498c = c28558d;
        this.f65499d = c32202c1;
        this.f65500e = c32264a;
        this.f65501f = c31984a1;
        this.f65502g = interfaceC41634e;
        C32246v c32246v = C32246v.f65701a;
        InterfaceC41669n interfaceC41669nM91009a = C41679x.m91009a(c32246v);
        this.f65503h = interfaceC41669nM91009a;
        this.f65504i = C41674s.m91001b(0, 0, null, 7, null);
        this.f65505j = new C28433a(Bitmap.Config.ARGB_8888);
        this.f65507l = C41679x.m91009a(new C32168M0(0.0f));
        AnswerType answerType = AnswerType.Ignored;
        InterfaceC41669n interfaceC41669nM91009a2 = C41679x.m91009a(answerType);
        this.f65508m = interfaceC41669nM91009a2;
        InterfaceC41669n interfaceC41669nM91009a3 = C41679x.m91009a(null);
        this.f65509n = interfaceC41669nM91009a3;
        this.f65510o = C41679x.m91009a(null);
        this.f65511p = C41636g.m90916g0(C41636g.m90931o(interfaceC41669nM91009a, interfaceC41669nM91009a2, interfaceC41669nM91009a3, c32202c1.f65591n, new C32167M(null)), interfaceC41709m0, SharingStarted.INSTANCE.getLazily(), new C32242t(c32246v, answerType));
    }

    @Override // com.sumsub.sns.internal.features.presentation.prooface.session.InterfaceC32204d0
    /* JADX INFO: renamed from: a */
    public final Object mo71051a(Liveness3dFaceRepository$LivenessRepositoryResult liveness3dFaceRepository$LivenessRepositoryResult, C32219i0 c32219i0) {
        Object objEmit = this.f65504i.emit(liveness3dFaceRepository$LivenessRepositoryResult, c32219i0);
        return objEmit == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objEmit : Unit.INSTANCE;
    }

    @Override // com.sumsub.sns.internal.features.presentation.prooface.session.InterfaceC32204d0
    /* JADX INFO: renamed from: a */
    public final boolean mo71054a(final ImageProxy imageProxy, final RectF rectF, float f11) {
        this.f65497b.m71077a(imageProxy, new Function1() { // from class: com.sumsub.sns.internal.features.presentation.prooface.session.f1
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C32169N.m71049a(imageProxy, this, rectF, (Function0) obj);
            }
        });
        return true;
    }

    /* JADX INFO: renamed from: a */
    public static final Unit m71049a(ImageProxy imageProxy, final C32169N c32169n, RectF rectF, final Function0 function0) {
        Object objM69280a = AbstractC28396H.m69280a(imageProxy, new Function2() { // from class: com.sumsub.sns.internal.features.presentation.prooface.session.g1
            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return C32169N.m71048a(this.f65623b, ((Integer) obj).intValue(), ((Integer) obj2).intValue());
            }
        });
        Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM69280a);
        if (thM103847exceptionOrNullimpl == null) {
            C28558d c28558d = c32169n.f65498c;
            C41696j.m91104d(c28558d.f58113b, c28558d.f58114c, null, new C28555a(c28558d, (Bitmap) objM69280a, rectF, new Function1() { // from class: com.sumsub.sns.internal.features.presentation.prooface.session.h1
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C32169N.m71050a(this.f65631b, function0, (AbstractC28568n) obj);
                }
            }, null), 2, null);
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("Failed to convert imageProxy to bitmap", thM103847exceptionOrNullimpl);
    }

    /* JADX INFO: renamed from: a */
    public static final Bitmap m71048a(C32169N c32169n, int i11, int i12) {
        return c32169n.f65505j.m69317a(i11, i12);
    }

    /* JADX INFO: renamed from: a */
    public static final Unit m71050a(C32169N c32169n, Function0 function0, AbstractC28568n abstractC28568n) {
        InterfaceC32252y interfaceC32252y;
        c32169n.getClass();
        try {
            InterfaceC41669n interfaceC41669n = c32169n.f65503h;
            if (abstractC28568n instanceof C28565k) {
                interfaceC32252y = C32246v.f65701a;
            } else if (abstractC28568n instanceof C28567m) {
                interfaceC32252y = C32250x.f65708a;
            } else if (abstractC28568n instanceof C28566l) {
                interfaceC32252y = C32248w.f65703a;
            } else {
                if (!(abstractC28568n instanceof C28564j)) {
                    throw new NoWhenBranchMatchedException();
                }
                interfaceC32252y = C32244u.f65698a;
            }
            interfaceC41669n.setValue(interfaceC32252y);
            if (abstractC28568n instanceof C28564j) {
                c32169n.m71053a((C28564j) abstractC28568n);
            } else if (!c32169n.f65499d.m71056a(abstractC28568n.f58130a)) {
                abstractC28568n.f58130a.recycle();
            }
        } catch (Throwable th2) {
            c32169n.f65501f.f65025a.m71017a(th2);
        }
        function0.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: a */
    public final void m71053a(C28564j c28564j) {
        Object c32168m0;
        Bitmap bitmapM69383a;
        C32202c1 c32202c1 = this.f65499d;
        c32202c1.f65579b.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (c32202c1.f65584g >= c32202c1.f65583f) {
            c32168m0 = C32162J0.f65484a;
        } else if (jCurrentTimeMillis < c32202c1.f65585h) {
            c32168m0 = C32166L0.f65489a;
        } else {
            AbstractC32267d.m71078a("SegmentSender: face segment enqueued");
            Bitmap bitmap = c28564j.f58130a;
            Size size = c28564j.f58127b;
            AbstractC32267d.m71078a("SegmentSender: enqueueSegment");
            C41696j.m91104d(c32202c1.f65578a, null, null, new C32174P0(c32202c1, bitmap, size, "OK", false, null), 3, null);
            int i11 = c32202c1.f65584g + 1;
            c32202c1.f65584g = i11;
            c32202c1.f65585h = jCurrentTimeMillis + 200;
            if (i11 == c32202c1.f65583f && i11 > 0) {
                C41696j.m91104d(c32202c1.f65578a, null, null, new C32176Q0(c32202c1, null), 3, null);
            }
            c32168m0 = new C32168M0(c32202c1.f65584g / c32202c1.f65583f);
        }
        AbstractC32267d.m71078a("ImageGathering phase: sendSegmentResult: " + c32168m0);
        if (c32168m0 instanceof C32168M0) {
            C32168M0 c32168m1 = (C32168M0) c32168m0;
            if (c32168m1.f65494a == 1.0f) {
                C32264a c32264a = this.f65500e;
                Bitmap bitmap2 = c28564j.f58130a;
                try {
                    Matrix matrix = new Matrix();
                    matrix.setScale(0.2f, 0.2f);
                    matrix.postScale(-1.0f, 1.0f);
                    bitmapM69383a = AbstractC28488r.m69383a(Bitmap.createBitmap(bitmap2, 0, 0, bitmap2.getWidth(), bitmap2.getHeight(), matrix, true));
                } catch (Throwable th2) {
                    c32264a.f65724a.f65025a.m71017a(th2);
                    bitmapM69383a = null;
                }
                this.f65506k = bitmapM69383a;
            }
            C41696j.m91104d(this.f65496a, null, null, new C32161J(this, c32168m1, null), 3, null);
            return;
        }
        if (!Intrinsics.areEqual(c32168m0, C32162J0.f65484a) && !Intrinsics.areEqual(c32168m0, C32164K0.f65488a) && !Intrinsics.areEqual(c32168m0, C32166L0.f65489a)) {
            throw new NoWhenBranchMatchedException();
        }
    }
}
