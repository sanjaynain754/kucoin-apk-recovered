package com.sumsub.sns.internal.features.presentation.preview.photo.identity;

import android.os.Parcelable;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModelKt;
import com.sumsub.sns.core.presentation.base.AbstractC28052C;
import com.sumsub.sns.internal.core.common.AbstractC28462i0;
import com.sumsub.sns.internal.core.common.C28468k0;
import com.sumsub.sns.internal.core.domain.C28547d;
import com.sumsub.sns.internal.core.presentation.android.AbstractC28639a;
import com.sumsub.sns.internal.core.presentation.screen.base.C28936t;
import com.sumsub.sns.internal.features.data.model.common.AbstractC29121g2;
import com.sumsub.sns.internal.features.data.model.common.AbstractC29172p;
import com.sumsub.sns.internal.features.data.model.common.C29124h;
import com.sumsub.sns.internal.features.data.model.common.Document;
import com.sumsub.sns.internal.features.data.repository.common.InterfaceC29953a;
import com.sumsub.sns.internal.features.data.repository.dynamic.InterfaceC29984m;
import com.sumsub.sns.internal.features.data.repository.extensions.InterfaceC30000a;
import com.sumsub.sns.internal.features.domain.C30156e;
import com.sumsub.sns.internal.features.domain.C30226m;
import com.sumsub.sns.internal.features.domain.C30270n;
import com.sumsub.sns.internal.features.domain.documents.C30150u;
import com.sumsub.sns.internal.features.domain.mrtd.C30237b;
import com.sumsub.sns.internal.features.presentation.camera.photo.document.C30554g;
import com.sumsub.sns.internal.features.presentation.preview.photo.AbstractC31770c0;
import com.sumsub.sns.internal.features.presentation.utils.C32635M;
import com.sumsub.sns.internal.features.presentation.utils.SecondSideStep;
import com.sumsub.sns.internal.log.AbstractC33294e;
import com.sumsub.sns.internal.log.C33270a;
import com.sumsub.sns.internal.log.C33272c;
import kotlinx.coroutines.C41696j;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.reflect.KProperty;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.preview.photo.identity.t */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31816t extends AbstractC31770c0 implements InterfaceC31802f {

    /* JADX INFO: renamed from: p */
    public static final /* synthetic */ KProperty[] f64649p = {AbstractC28639a.m69485a(C31816t.class, "showSelectorOnStart", "getShowSelectorOnStart()Z", 0)};

    /* JADX INFO: renamed from: m */
    public final InterfaceC30000a f64650m;

    /* JADX INFO: renamed from: n */
    public final C31801e f64651n;

    /* JADX INFO: renamed from: o */
    public final C28936t f64652o;

    public C31816t(Document document, SavedStateHandle savedStateHandle, InterfaceC29953a interfaceC29953a, InterfaceC29984m interfaceC29984m, C28547d c28547d, C30156e c30156e, C30237b c30237b, C31801e c31801e, C30150u c30150u) {
        super(document, savedStateHandle, interfaceC29953a, interfaceC29984m, c28547d, c31801e, c30150u, c30156e, c30237b);
        this.f64650m = c28547d;
        this.f64651n = c31801e;
        this.f64652o = new C28936t(savedStateHandle, "showSelectorOnStart", Boolean.TRUE, false);
        c31801e.f66621m = this;
    }

    @Override // com.sumsub.sns.internal.features.presentation.preview.photo.AbstractC31770c0, com.sumsub.sns.internal.features.presentation.preview.AbstractC31739h
    /* JADX INFO: renamed from: a */
    public final Object mo70740a(AbstractC29172p abstractC29172p, C29124h c29124h, Continuation continuation) {
        C28936t c28936t = this.f64652o;
        KProperty[] kPropertyArr = f64649p;
        KProperty kProperty = kPropertyArr[0];
        if (!((Boolean) c28936t.m69705a()).booleanValue()) {
            return Unit.INSTANCE;
        }
        C28936t c28936t2 = this.f64652o;
        KProperty kProperty2 = kPropertyArr[0];
        c28936t2.f58834a.set(c28936t2.f58835b, Boolean.FALSE);
        int i11 = C31801e.f64621B;
        Object objM70880a = this.f64651n.m70880a(false, (ContinuationImpl) continuation);
        return objM70880a == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM70880a : Unit.INSTANCE;
    }

    @Override // com.sumsub.sns.internal.features.presentation.preview.photo.AbstractC31770c0
    /* JADX INFO: renamed from: d */
    public final Object mo70866d(Continuation continuation) {
        return AbstractC28462i0.m69364a(AbstractC29121g2.m69769a(this.f64651n.m71247b()).m69801a(getStrings(), null), ((C28547d) this.f64650m).f58099a.f58163a);
    }

    @Override // com.sumsub.sns.internal.features.presentation.preview.photo.AbstractC31770c0
    /* JADX INFO: renamed from: h */
    public final SecondSideStep mo70871h() {
        return this.f64651n.m71255h();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x004c, code lost:
    
        if (m70861a((p852kotlin.coroutines.jvm.internal.ContinuationImpl) r0) == r1) goto L21;
     */
    @Override // com.sumsub.sns.core.presentation.base.AbstractC28073M0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object onPrepare(Continuation continuation) {
        C31814r c31814r;
        if (continuation instanceof C31814r) {
            c31814r = (C31814r) continuation;
            int i11 = c31814r.f64646c;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c31814r.f64646c = i11 - Integer.MIN_VALUE;
            } else {
                c31814r = new C31814r(this, (ContinuationImpl) continuation);
            }
        } else {
            c31814r = new C31814r(this, (ContinuationImpl) continuation);
        }
        Object obj = c31814r.f64644a;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c31814r.f64646c;
        if (i12 == 0) {
            ResultKt.throwOnFailure(obj);
            c31814r.f64646c = 1;
            if (AbstractC31770c0.m70856a(this, c31814r) != coroutine_suspended) {
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
        c31814r.f64646c = 2;
    }

    @Override // com.sumsub.sns.internal.features.presentation.preview.AbstractC31739h
    /* JADX INFO: renamed from: a */
    public final void mo70743a(C30270n c30270n) {
        this.f64480e = c30270n.f60854a;
        this.f64481f = c30270n.f60856c;
        C31801e c31801e = this.f64651n;
        c31801e.getClass();
        C30226m c30226m = c30270n.f60859f;
        String str = c30226m.f60756a;
        if (str == null && (str = c30226m.f60757b) == null) {
            str = c30226m.f60758c;
        }
        C28936t c28936t = c31801e.f66628t;
        KProperty kProperty = C32635M.f66607x[6];
        c28936t.f58834a.set(c28936t.f58835b, str);
    }

    /* JADX INFO: renamed from: a */
    public final void m70889a(String str, String str2) {
        C33272c.f67816e.f67810a.mo68955d("DocCapture", "onEkycSourceSelected: " + str2 + " of " + str, null);
        fireEvent(new C31809m(this.f64476a, str, str2));
    }

    @Override // com.sumsub.sns.internal.features.presentation.preview.photo.AbstractC31770c0
    /* JADX INFO: renamed from: a */
    public final void mo70862a(boolean z11, Parcelable parcelable) {
        if (!z11 && !this.f64651n.m70885j()) {
            C30554g c30554g = C30554g.f61704a;
            String strM71624a = AbstractC33294e.m71624a(c30554g);
            C33270a c33270a = C33272c.f67816e;
            c33270a.f67810a.mo68955d(strM71624a, "On instructions showed, is not success and viewModel.hasPhoto()==false", null);
            if (!this.f64651n.m71251d()) {
                this.f64651n.getClass();
                if (C28468k0.f57983a.getPreferredDocumentsDefinitions() == null) {
                    c33270a.f67810a.mo68955d(AbstractC33294e.m71624a(c30554g), "On instructions showed, restart step", null);
                    C41696j.m91104d(ViewModelKt.getViewModelScope(this), null, null, new C31815s(this, null), 3, null);
                    return;
                }
            }
            c33270a.f67810a.mo68955d(AbstractC33294e.m71624a(c30554g), "On instructions showed, finish", null);
            AbstractC28052C.finish$default(this, null, null, null, null, 15, null);
            return;
        }
        super.mo70862a(z11, parcelable);
    }
}
