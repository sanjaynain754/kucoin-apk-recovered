package com.sumsub.sns.internal.features.presentation.prooface;

import android.graphics.RectF;
import androidx.camera.core.ImageProxy;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModelKt;
import com.sumsub.sns.core.presentation.base.AbstractC28118g;
import com.sumsub.sns.core.presentation.base.AbstractC28142p0;
import com.sumsub.sns.core.presentation.base.C28075O;
import com.sumsub.sns.core.presentation.base.C28076P;
import com.sumsub.sns.core.presentation.base.C28156w;
import com.sumsub.sns.core.presentation.base.InterfaceC28077Q;
import com.sumsub.sns.internal.core.common.AbstractC28421U;
import com.sumsub.sns.internal.core.common.C28468k0;
import com.sumsub.sns.internal.core.domain.facedetector.C28559e;
import com.sumsub.sns.internal.core.presentation.android.C28651g;
import com.sumsub.sns.internal.core.presentation.screen.base.C28936t;
import com.sumsub.sns.internal.features.data.model.common.AbstractC29149l0;
import com.sumsub.sns.internal.features.data.model.common.C29070X;
import com.sumsub.sns.internal.features.data.model.common.C29124h;
import com.sumsub.sns.internal.features.data.model.prooface.C29802E;
import com.sumsub.sns.internal.features.data.model.prooface.C29803F;
import com.sumsub.sns.internal.features.data.model.prooface.C29805H;
import com.sumsub.sns.internal.features.data.repository.common.InterfaceC29953a;
import com.sumsub.sns.internal.features.data.repository.dynamic.AbstractC29971N;
import com.sumsub.sns.internal.features.data.repository.dynamic.C29967J;
import com.sumsub.sns.internal.features.data.repository.dynamic.InterfaceC29984m;
import com.sumsub.sns.internal.features.data.repository.settings.C30034c;
import com.sumsub.sns.internal.features.presentation.prooface.session.C32210f0;
import com.sumsub.sns.internal.features.presentation.prooface.session.C32239r0;
import com.sumsub.sns.internal.features.presentation.prooface.session.C32246v;
import com.sumsub.sns.internal.features.presentation.prooface.utils.AbstractC32267d;
import com.sumsub.sns.internal.features.presentation.prooface.utils.C32266c;
import com.sumsub.sns.internal.log.C33272c;
import com.sumsub.sns.internal.log.LoggerType;
import com.sumsub.sns.internal.log.logger.C33296b;
import com.sumsub.sns.internal.p125ff.C33048a;
import java.io.IOException;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.C41713n0;
import kotlinx.coroutines.InterfaceC41775x1;
import kotlinx.coroutines.flow.C41636g;
import kotlinx.coroutines.flow.C41674s;
import kotlinx.coroutines.flow.C41679x;
import kotlinx.coroutines.flow.InterfaceC41634e;
import kotlinx.coroutines.flow.InterfaceC41668m;
import kotlinx.coroutines.flow.InterfaceC41669n;
import kotlinx.coroutines.flow.InterfaceC41678w;
import kotlinx.coroutines.flow.SharingStarted;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.ArraysKt;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.reflect.KProperty;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.prooface.c2 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32072c2 extends AbstractC28142p0 {

    /* JADX INFO: renamed from: x */
    public static final /* synthetic */ KProperty[] f65257x = {AbstractC28118g.m69077a(C32072c2.class, "livenessShowSettings", "getLivenessShowSettings()Z", 0)};

    /* JADX INFO: renamed from: a */
    public final C29070X f65258a;

    /* JADX INFO: renamed from: b */
    public final C30034c f65259b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC29984m f65260c;

    /* JADX INFO: renamed from: d */
    public final C32210f0 f65261d;

    /* JADX INFO: renamed from: e */
    public final C32102i2 f65262e;

    /* JADX INFO: renamed from: f */
    public final Function1 f65263f;

    /* JADX INFO: renamed from: g */
    public final C28651g f65264g;

    /* JADX INFO: renamed from: h */
    public final C28936t f65265h;

    /* JADX INFO: renamed from: i */
    public final InterfaceC41669n f65266i;

    /* JADX INFO: renamed from: j */
    public C32239r0 f65267j;

    /* JADX INFO: renamed from: k */
    public final InterfaceC41668m f65268k;

    /* JADX INFO: renamed from: l */
    public final InterfaceC41669n f65269l;

    /* JADX INFO: renamed from: m */
    public C32074d f65270m;

    /* JADX INFO: renamed from: n */
    public final C32028P0 f65271n;

    /* JADX INFO: renamed from: o */
    public final InterfaceC41668m f65272o;

    /* JADX INFO: renamed from: p */
    public final InterfaceC41668m f65273p;

    /* JADX INFO: renamed from: q */
    public final InterfaceC41668m f65274q;

    /* JADX INFO: renamed from: r */
    public final InterfaceC41678w f65275r;

    /* JADX INFO: renamed from: s */
    public final InterfaceC41669n f65276s;

    /* JADX INFO: renamed from: t */
    public final InterfaceC41669n f65277t;

    /* JADX INFO: renamed from: u */
    public final InterfaceC41775x1 f65278u;

    /* JADX INFO: renamed from: v */
    public final C31984A1 f65279v;

    /* JADX INFO: renamed from: w */
    public final C32266c f65280w;

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public static final Object m71010a(C32072c2 c32072c2, ContinuationImpl continuationImpl) {
        C32290z1 c32290z1;
        if (continuationImpl instanceof C32290z1) {
            c32290z1 = (C32290z1) continuationImpl;
            int i11 = c32290z1.f65770c;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c32290z1.f65770c = i11 - Integer.MIN_VALUE;
            } else {
                c32290z1 = new C32290z1(c32072c2, continuationImpl);
            }
        } else {
            c32290z1 = new C32290z1(c32072c2, continuationImpl);
        }
        Object objM70045b = c32290z1.f65768a;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c32290z1.f65770c;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objM70045b);
            InterfaceC29984m interfaceC29984m = c32072c2.f65260c;
            c32290z1.f65770c = 1;
            objM70045b = ((C29967J) interfaceC29984m).m70045b(false, c32290z1);
            if (objM70045b == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objM70045b);
        }
        if (((C29124h) ((AbstractC29971N) objM70045b).m70051c()) != null) {
            return Unit.INSTANCE;
        }
        c32072c2.f65271n.m70975a(new C29803F(new IOException("Error getting config")));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0049, code lost:
    
        if (r5.m71014a(r0) == r1) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0068, code lost:
    
        if (r5 == r1) goto L28;
     */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m71012b(C32072c2 c32072c2, ContinuationImpl continuationImpl) {
        C32026O1 c32026o1;
        if (continuationImpl instanceof C32026O1) {
            c32026o1 = (C32026O1) continuationImpl;
            int i11 = c32026o1.f65106c;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c32026o1.f65106c = i11 - Integer.MIN_VALUE;
            } else {
                c32026o1 = new C32026O1(c32072c2, continuationImpl);
            }
        } else {
            c32026o1 = new C32026O1(c32072c2, continuationImpl);
        }
        Object obj = c32026o1.f65104a;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c32026o1.f65106c;
        if (i12 != 0) {
            if (i12 == 1) {
                ResultKt.throwOnFailure(obj);
                c32072c2.showProgress(false);
                return Unit.INSTANCE;
            }
            if (i12 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(obj);
        if (C33048a.f67453P.m71434a()) {
            c32026o1.f65106c = 1;
        } else {
            c32026o1.f65106c = 2;
            Object objM91130f = C41713n0.m91130f(new C32023N1(c32072c2, null), c32026o1);
            if (objM91130f != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                objM91130f = Unit.INSTANCE;
            }
        }
        return coroutine_suspended;
    }

    public C32072c2(SavedStateHandle savedStateHandle, C29070X c29070x, C30034c c30034c, InterfaceC29953a interfaceC29953a, InterfaceC29984m interfaceC29984m, C32210f0 c32210f0, C32102i2 c32102i2, Function1 function1, C28559e c28559e) {
        super(interfaceC29953a, interfaceC29984m, new C28076P(3));
        this.f65258a = c29070x;
        this.f65259b = c30034c;
        this.f65260c = interfaceC29984m;
        this.f65261d = c32210f0;
        this.f65262e = c32102i2;
        this.f65263f = function1;
        this.f65264g = new C28651g(savedStateHandle);
        this.f65265h = new C28936t(savedStateHandle, "livenessShowSettings", Boolean.valueOf(C33048a.f67480m.m71434a()), true);
        InterfaceC41669n interfaceC41669nM91009a = C41679x.m91009a(Boolean.FALSE);
        this.f65266i = interfaceC41669nM91009a;
        InterfaceC41668m interfaceC41668mM91001b = C41674s.m91001b(0, 0, null, 7, null);
        this.f65268k = interfaceC41668mM91001b;
        this.f65269l = C41679x.m91009a(C32086f1.f65298a);
        this.f65271n = new C32028P0(this);
        InterfaceC41668m interfaceC41668mM91001b2 = C41674s.m91001b(0, 0, null, 7, null);
        this.f65272o = interfaceC41668mM91001b2;
        this.f65273p = C41674s.m91001b(0, 0, null, 7, null);
        InterfaceC41668m interfaceC41668mM91001b3 = C41674s.m91001b(0, 0, null, 7, null);
        this.f65274q = interfaceC41668mM91001b3;
        this.f65275r = C41636g.m90916g0(C41636g.m90896T(C41636g.m90894R(C41636g.m90930n0(interfaceC41668mM91001b2, new C32121n1(this, null)), new C32133q1(interfaceC41668mM91001b3)), new C32137r1(null)), ViewModelKt.getViewModelScope(this), SharingStarted.INSTANCE.getEagerly(), C32013K0.f65076a);
        InterfaceC41669n interfaceC41669nM91009a2 = C41679x.m91009a(C32057Z0.f65220a);
        this.f65276s = interfaceC41669nM91009a2;
        this.f65277t = interfaceC41669nM91009a2;
        C31984A1 c31984a1 = new C31984A1(this);
        this.f65279v = c31984a1;
        this.f65280w = new C32266c(c28559e, c31984a1);
        this.f65278u = C41696j.m91104d(ViewModelKt.getViewModelScope(this), null, null, new C32001G0(this, null), 3, null);
        AbstractC28421U.m69303a(C41636g.m90892P(C41636g.m90939v(new C32020M1(new C32011J1(C41636g.m90927m(interfaceC41668mM91001b, interfaceC41669nM91009a, new C31999F1(null))))), new C32004H0(null)), ViewModelKt.getViewModelScope(this), (Function2) null);
        C41696j.m91104d(ViewModelKt.getViewModelScope(this), null, null, new C32010J0(this, null), 3, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0052, code lost:
    
        if (r5.emit(r6, r0) == r1) goto L21;
     */
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m71013c(C32072c2 c32072c2, ContinuationImpl continuationImpl) {
        C32029P1 c32029p1;
        if (continuationImpl instanceof C32029P1) {
            c32029p1 = (C32029P1) continuationImpl;
            int i11 = c32029p1.f65115c;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c32029p1.f65115c = i11 - Integer.MIN_VALUE;
            } else {
                c32029p1 = new C32029P1(c32072c2, continuationImpl);
            }
        } else {
            c32029p1 = new C32029P1(c32072c2, continuationImpl);
        }
        Object obj = c32029p1.f65113a;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c32029p1.f65115c;
        if (i12 != 0) {
            if (i12 == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                if (i12 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(obj);
        InterfaceC41669n interfaceC41669n = c32072c2.f65269l;
        C32086f1 c32086f1 = C32086f1.f65298a;
        c32029p1.f65115c = 1;
        if (interfaceC41669n.emit(c32086f1, c32029p1) != coroutine_suspended) {
        }
        return coroutine_suspended;
        InterfaceC41669n interfaceC41669n2 = c32072c2.f65276s;
        C32057Z0 c32057z0 = C32057Z0.f65220a;
        c32029p1.f65115c = 2;
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28142p0
    public final InterfaceC41634e buildViewStateFlow(C28075O c28075o) {
        return this.f65269l;
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28142p0
    public final void intent(InterfaceC28077Q interfaceC28077Q) {
        if (interfaceC28077Q instanceof InterfaceC32054Y0) {
            m71016a((InterfaceC32054Y0) interfaceC28077Q);
            return;
        }
        AbstractC32267d.m71078a("ViewModel: Unknown intent: " + interfaceC28077Q);
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28052C
    public final void onErrorCancelled(AbstractC29149l0 abstractC29149l0) {
        AbstractC32267d.m71078a("onErrorCancelled " + abstractC29149l0);
        super.onErrorCancelled(abstractC29149l0);
        this.f65271n.m70975a(C29805H.f59881a);
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28052C
    public final void onHandleError(AbstractC29149l0 abstractC29149l0) {
        AbstractC32267d.m71078a("ViewModel: onHandleError " + abstractC29149l0);
        super.onHandleError(abstractC29149l0);
        showProgress(true);
        C41696j.m91104d(ViewModelKt.getViewModelScope(this), null, null, new C32055Y1(this, null), 3, null);
    }

    /* JADX INFO: renamed from: a */
    public final void m71017a(Throwable th2) {
        if (C28468k0.f57988f) {
            fireEvent(new C28156w("Error: " + th2.getMessage()));
        }
        AbstractC32267d.m71078a("ViewModel: ERROR: " + th2.getMessage());
        C33272c c33272c = C33272c.f67812a;
        C33296b c33296bM71618b = C33272c.m71618b(ArraysKt.toList(new LoggerType[]{LoggerType.KIBANA}));
        String message = th2.getMessage();
        if (message == null) {
            message = "";
        }
        c33296bM71618b.mo68956e("Prooface", message, th2);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public final Object m71018b(ContinuationImpl continuationImpl) {
        C32067b2 c32067b2;
        Function1 function1;
        if (continuationImpl instanceof C32067b2) {
            c32067b2 = (C32067b2) continuationImpl;
            int i11 = c32067b2.f65244d;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c32067b2.f65244d = i11 - Integer.MIN_VALUE;
            } else {
                c32067b2 = new C32067b2(this, continuationImpl);
            }
        } else {
            c32067b2 = new C32067b2(this, continuationImpl);
        }
        Object obj = c32067b2.f65242b;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c32067b2.f65244d;
        if (i12 == 0) {
            ResultKt.throwOnFailure(obj);
            C32074d c32074d = this.f65270m;
            if (c32074d != null) {
                return c32074d;
            }
            Function1 function2 = this.f65263f;
            c32067b2.f65241a = function2;
            c32067b2.f65244d = 1;
            Object strings = getStrings(c32067b2);
            if (strings == coroutine_suspended) {
                return coroutine_suspended;
            }
            function1 = function2;
            obj = strings;
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            function1 = c32067b2.f65241a;
            ResultKt.throwOnFailure(obj);
        }
        C32074d c32074d2 = (C32074d) function1.invoke(obj);
        this.f65270m = c32074d2;
        return c32074d2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x005e, code lost:
    
        if (r6.emit(r2, r0) == r1) goto L21;
     */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m71014a(ContinuationImpl continuationImpl) {
        C32002G1 c32002g1;
        if (continuationImpl instanceof C32002G1) {
            c32002g1 = (C32002G1) continuationImpl;
            int i11 = c32002g1.f65056c;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c32002g1.f65056c = i11 - Integer.MIN_VALUE;
            } else {
                c32002g1 = new C32002G1(this, continuationImpl);
            }
        } else {
            c32002g1 = new C32002G1(this, continuationImpl);
        }
        Object objM71018b = c32002g1.f65054a;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c32002g1.f65056c;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objM71018b);
            c32002g1.f65056c = 1;
            objM71018b = m71018b(c32002g1);
            if (objM71018b != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i12 == 1) {
            ResultKt.throwOnFailure(objM71018b);
        } else {
            if (i12 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objM71018b);
        }
        return Unit.INSTANCE;
        C32091g1 c32091g1 = new C32091g1(((C32074d) objM71018b).f65282a.m70061a("sns_facescan_hint_facePosition"), C32246v.f65701a);
        InterfaceC41669n interfaceC41669n = this.f65269l;
        c32002g1.f65056c = 2;
    }

    /* JADX INFO: renamed from: a */
    public final void m71015a(final ImageProxy imageProxy, final RectF rectF, final float f11) {
        this.f65280w.m71077a(imageProxy, new Function1() { // from class: com.sumsub.sns.internal.features.presentation.prooface.b3
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C32072c2.m71011a(this.f65245b, imageProxy, rectF, f11, (Function0) obj);
            }
        });
    }

    /* JADX INFO: renamed from: a */
    public static final Unit m71011a(C32072c2 c32072c2, ImageProxy imageProxy, RectF rectF, float f11, Function0 function0) {
        C32239r0 c32239r0 = c32072c2.f65267j;
        if (!(c32239r0 != null ? c32239r0.f65687e.mo71054a(imageProxy, rectF, f11) : false)) {
            function0.invoke();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: a */
    public final void m71016a(InterfaceC32054Y0 interfaceC32054Y0) {
        AbstractC32267d.m71078a("ViewModel: intent: " + interfaceC32054Y0);
        if (interfaceC32054Y0 instanceof C32036S0) {
            C41696j.m91104d(ViewModelKt.getViewModelScope(this), null, null, new C31990C1(this, ((C32036S0) interfaceC32054Y0).f65148a, null), 3, null);
            return;
        }
        if (interfaceC32054Y0 instanceof C32039T0) {
            C41696j.m91104d(ViewModelKt.getViewModelScope(this), null, null, new C31993D1(this, null), 3, null);
            return;
        }
        if (interfaceC32054Y0 instanceof C32033R0) {
            Exception exc = ((C32033R0) interfaceC32054Y0).f65139a;
            this.f65271n.m70975a(new C29802E(exc));
            m71017a(exc);
            return;
        }
        if (interfaceC32054Y0 instanceof C32048W0) {
            C41696j.m91104d(ViewModelKt.getViewModelScope(this), null, null, new C32055Y1(this, null), 3, null);
            return;
        }
        if (interfaceC32054Y0 instanceof C32051X0) {
            C41696j.m91104d(ViewModelKt.getViewModelScope(this), null, null, new C32062a2(this, null), 3, null);
            return;
        }
        if (interfaceC32054Y0 instanceof C32045V0) {
            C41696j.m91104d(ViewModelKt.getViewModelScope(this), null, null, new C32055Y1(this, null), 3, null);
        } else if (interfaceC32054Y0 instanceof C32031Q0) {
            C41696j.m91104d(ViewModelKt.getViewModelScope(this), null, null, new C31987B1(this, null), 3, null);
        } else {
            if (interfaceC32054Y0 instanceof C32042U0) {
                C41696j.m91104d(ViewModelKt.getViewModelScope(this), null, null, new C31996E1(this, null), 3, null);
                return;
            }
            throw new NoWhenBranchMatchedException();
        }
    }
}
