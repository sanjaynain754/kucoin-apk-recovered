package com.sumsub.sns.internal.features.presentation.verification2.code;

import androidx.lifecycle.ViewModelKt;
import com.sumsub.sns.core.presentation.base.AbstractC28142p0;
import com.sumsub.sns.core.presentation.base.C28075O;
import com.sumsub.sns.core.presentation.base.C28076P;
import com.sumsub.sns.internal.core.presentation.screen.base.C28936t;
import com.sumsub.sns.internal.features.data.model.common.ValidationIdentifierType;
import com.sumsub.sns.internal.features.data.model.common.remote.response.C29570k0;
import com.sumsub.sns.internal.features.data.model.common.remote.response.Status;
import com.sumsub.sns.internal.features.data.repository.common.InterfaceC29953a;
import com.sumsub.sns.internal.features.data.repository.dynamic.InterfaceC29984m;
import com.sumsub.sns.internal.features.domain.C30083Q;
import com.sumsub.sns.internal.features.domain.C30101b;
import com.sumsub.sns.internal.features.presentation.verification2.host.C32814J;
import com.sumsub.sns.internal.features.presentation.verification2.host.C32820d;
import com.sumsub.sns.internal.features.presentation.verification2.host.C32822f;
import com.sumsub.sns.internal.features.presentation.verification2.host.C32826j;
import com.sumsub.sns.internal.features.presentation.verification2.host.C32827k;
import com.sumsub.sns.internal.features.presentation.verification2.host.InterfaceC32823g;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.C41782z0;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.flow.C41636g;
import kotlinx.coroutines.flow.C41674s;
import kotlinx.coroutines.flow.C41679x;
import kotlinx.coroutines.flow.InterfaceC41634e;
import kotlinx.coroutines.flow.InterfaceC41668m;
import kotlinx.coroutines.flow.InterfaceC41669n;
import kotlinx.coroutines.flow.InterfaceC41673r;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.reflect.KProperty;
import p852kotlin.text.StringsKt;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.verification2.code.w */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32767w extends AbstractC28142p0 {

    /* JADX INFO: renamed from: V */
    public static final /* synthetic */ int f67058V = 0;

    /* JADX INFO: renamed from: a */
    public final InterfaceC32769y f67059a;

    /* JADX INFO: renamed from: b */
    public final String f67060b;

    /* JADX INFO: renamed from: c */
    public final ValidationIdentifierType f67061c;

    /* JADX INFO: renamed from: d */
    public final C30083Q f67062d;

    /* JADX INFO: renamed from: e */
    public final C30101b f67063e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC41669n f67064f;

    /* JADX INFO: renamed from: g */
    public final InterfaceC41668m f67065g;

    /* JADX INFO: renamed from: h */
    public final InterfaceC41673r f67066h;

    /* JADX WARN: Code duplicated, block: B:42:0x00d6 A[PHI: r8 r10
      0x00d6: PHI (r8v9 com.sumsub.sns.internal.features.presentation.verification2.code.w) = 
      (r8v0 com.sumsub.sns.internal.features.presentation.verification2.code.w)
      (r8v12 com.sumsub.sns.internal.features.presentation.verification2.code.w)
     binds: [B:40:0x00d3, B:18:0x003e] A[DONT_GENERATE, DONT_INLINE]
      0x00d6: PHI (r10v11 java.lang.Object) = (r10v10 java.lang.Object), (r10v1 java.lang.Object) binds: [B:40:0x00d3, B:18:0x003e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x007a, code lost:
    
        if (((com.sumsub.sns.internal.features.presentation.verification2.host.C32814J) r8).m71348a(r9) == r1) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00b3, code lost:
    
        if (((com.sumsub.sns.internal.features.presentation.verification2.host.C32814J) r8).m71348a(r9) == r1) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00e1, code lost:
    
        if (r8.m71338a((java.lang.CharSequence) r10, r0) == r1) goto L44;
     */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m71337a(C32767w c32767w, C29570k0 c29570k0, ContinuationImpl continuationImpl) {
        C32763s c32763s;
        if (continuationImpl instanceof C32763s) {
            c32763s = (C32763s) continuationImpl;
            int i11 = c32763s.f67039d;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c32763s.f67039d = i11 - Integer.MIN_VALUE;
            } else {
                c32763s = new C32763s(c32767w, continuationImpl);
            }
        } else {
            c32763s = new C32763s(c32767w, continuationImpl);
        }
        Object string = c32763s.f67037b;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c32763s.f67039d;
        if (i12 != 0) {
            if (i12 == 1) {
                ResultKt.throwOnFailure(string);
                return Unit.INSTANCE;
            }
            if (i12 == 2) {
                ResultKt.throwOnFailure(string);
                return Unit.INSTANCE;
            }
            if (i12 == 3) {
                ResultKt.throwOnFailure(string);
                c32763s.f67036a = c32767w;
                c32763s.f67039d = 4;
                string = c32767w.getString("sns_confirmation_code_isNotValid", c32763s);
                if (string != coroutine_suspended) {
                    c32763s.f67036a = null;
                    c32763s.f67039d = 5;
                }
                return coroutine_suspended;
            }
            if (i12 == 4) {
                c32767w = c32763s.f67036a;
                ResultKt.throwOnFailure(string);
                c32763s.f67036a = null;
                c32763s.f67039d = 5;
            } else {
                if (i12 != 5) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(string);
            }
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(string);
        String str = c29570k0.f59591f;
        if (Intrinsics.areEqual(str, Status.VERIFIED.getValue())) {
            ((C32814J) c32767w.f67059a).f67151g.m71295c(c32767w.f67060b);
            InterfaceC32769y interfaceC32769y = c32767w.f67059a;
            C32748d c32748d = C32748d.f67007a;
            c32763s.f67039d = 1;
        } else if (Intrinsics.areEqual(str, Status.REJECTED.getValue())) {
            C32827k c32827k = ((C32814J) c32767w.f67059a).f67152h;
            C32822f c32822f = new C32822f(c32767w.f67060b);
            C28936t c28936t = c32827k.f67174a;
            KProperty kProperty = C32827k.f67173c[0];
            c28936t.f58834a.set(c28936t.f58835b, c32822f);
            InterfaceC32769y interfaceC32769y2 = c32767w.f67059a;
            C32747c c32747c = C32747c.f67006a;
            c32763s.f67039d = 2;
        } else {
            InterfaceC32769y interfaceC32769y3 = c32767w.f67059a;
            C32746b c32746b = C32746b.f67005a;
            c32763s.f67039d = 3;
            if (((C32814J) interfaceC32769y3).m71348a(c32746b) != coroutine_suspended) {
                c32763s.f67036a = c32767w;
                c32763s.f67039d = 4;
                string = c32767w.getString("sns_confirmation_code_isNotValid", c32763s);
                if (string != coroutine_suspended) {
                    c32763s.f67036a = null;
                    c32763s.f67039d = 5;
                }
            }
        }
        return coroutine_suspended;
    }

    public C32767w(InterfaceC32769y interfaceC32769y, String str, ValidationIdentifierType validationIdentifierType, C30083Q c30083q, C30101b c30101b, InterfaceC29953a interfaceC29953a, InterfaceC29984m interfaceC29984m) {
        super(interfaceC29953a, interfaceC29984m, new C28076P(3));
        this.f67059a = interfaceC32769y;
        this.f67060b = str;
        this.f67061c = validationIdentifierType;
        this.f67062d = c30083q;
        this.f67063e = c30101b;
        this.f67064f = C41679x.m91009a(null);
        InterfaceC41668m interfaceC41668mM91001b = C41674s.m91001b(0, 5, null, 5, null);
        this.f67065g = interfaceC41668mM91001b;
        this.f67066h = C41636g.m90905b(interfaceC41668mM91001b);
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28142p0
    public final InterfaceC41634e buildViewStateFlow(C28075O c28075o) {
        InterfaceC41634e interfaceC41634eM71294b = ((C32814J) this.f67059a).f67151g.m71294b(this.f67060b);
        C32827k c32827k = ((C32814J) this.f67059a).f67152h;
        return C41636g.m90929n(interfaceC41634eM71294b, new C32826j(c32827k.f67175b, this.f67060b), this.f67064f, new C32762r(this, c28075o, null));
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28052C
    public final void onFirstAttach() {
        super.onFirstAttach();
        InterfaceC32823g interfaceC32823g = (InterfaceC32823g) ((C32814J) this.f67059a).f67152h.f67175b.getValue();
        if (interfaceC32823g == null || !Intrinsics.areEqual(interfaceC32823g.mo71350a(), StringsKt.trim((CharSequence) this.f67060b).toString()) || !(interfaceC32823g instanceof C32820d)) {
            String str = this.f67060b;
            String type = this.f67061c.getType();
            if (!StringsKt.isBlank(str) && !StringsKt.isBlank(type)) {
                showProgress(true);
                C41696j.m91104d(ViewModelKt.getViewModelScope(this), C41782z0.m91392b(), null, new C32765u(this, null, this, type, str), 2, null);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0055, code lost:
    
        if (r6.emit(r7, r0) == r1) goto L21;
     */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m71338a(CharSequence charSequence, ContinuationImpl continuationImpl) {
        C32766v c32766v;
        if (continuationImpl instanceof C32766v) {
            c32766v = (C32766v) continuationImpl;
            int i11 = c32766v.f67057c;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c32766v.f67057c = i11 - Integer.MIN_VALUE;
            } else {
                c32766v = new C32766v(this, continuationImpl);
            }
        } else {
            c32766v = new C32766v(this, continuationImpl);
        }
        Object obj = c32766v.f67055a;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c32766v.f67057c;
        if (i12 == 0) {
            ResultKt.throwOnFailure(obj);
            this.f67064f.setValue(charSequence);
            c32766v.f67057c = 1;
            if (DelayKt.m90350b(1000L, c32766v) != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i12 == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            if (i12 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
        InterfaceC41668m interfaceC41668m = this.f67065g;
        C32760p c32760p = C32760p.f67023a;
        c32766v.f67057c = 2;
    }
}
