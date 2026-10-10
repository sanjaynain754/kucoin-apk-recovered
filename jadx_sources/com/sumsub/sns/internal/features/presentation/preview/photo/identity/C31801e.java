package com.sumsub.sns.internal.features.presentation.preview.photo.identity;

import androidx.lifecycle.SavedStateHandle;
import com.sumsub.sns.core.presentation.base.AbstractC28052C;
import com.sumsub.sns.internal.core.analytics.C28366e;
import com.sumsub.sns.internal.core.analytics.GlobalStatePayload;
import com.sumsub.sns.internal.core.common.C28468k0;
import com.sumsub.sns.internal.core.common.InterfaceC28389D0;
import com.sumsub.sns.internal.core.presentation.screen.base.C28936t;
import com.sumsub.sns.internal.features.data.model.common.AbstractC29130i;
import com.sumsub.sns.internal.features.data.model.common.AbstractC29172p;
import com.sumsub.sns.internal.features.data.model.common.C29054T;
import com.sumsub.sns.internal.features.data.model.common.C29124h;
import com.sumsub.sns.internal.features.data.model.common.Document;
import com.sumsub.sns.internal.features.data.model.common.IdentitySide;
import com.sumsub.sns.internal.features.data.repository.analytics.C29903a;
import com.sumsub.sns.internal.features.data.repository.dynamic.InterfaceC29984m;
import com.sumsub.sns.internal.features.domain.C30067A;
import com.sumsub.sns.internal.features.domain.C30071E;
import com.sumsub.sns.internal.features.domain.C30156e;
import com.sumsub.sns.internal.features.domain.C30175f;
import com.sumsub.sns.internal.features.domain.C30216h;
import com.sumsub.sns.internal.features.domain.C30311s0;
import com.sumsub.sns.internal.features.domain.C30312t;
import com.sumsub.sns.internal.features.domain.documents.C30119M;
import com.sumsub.sns.internal.features.domain.documents.C30128a;
import com.sumsub.sns.internal.features.domain.documents.DocumentSideness;
import com.sumsub.sns.internal.features.domain.mrtd.C30243e;
import com.sumsub.sns.internal.features.domain.mrtd.C30251i;
import com.sumsub.sns.internal.features.domain.utils.C30316a;
import com.sumsub.sns.internal.features.presentation.camera.photo.document.DocCapture$PreferredMode;
import com.sumsub.sns.internal.features.presentation.utils.C32635M;
import com.sumsub.sns.internal.features.presentation.utils.C32662m;
import com.sumsub.sns.internal.log.C33270a;
import com.sumsub.sns.internal.log.C33272c;
import java.util.Collection;
import java.util.List;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.reflect.KProperty;
import p852kotlin.text.StringsKt;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.preview.photo.identity.e */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31801e extends C32635M {

    /* JADX INFO: renamed from: B */
    public static final /* synthetic */ int f64621B = 0;

    /* JADX INFO: renamed from: A */
    public final C30071E f64622A;

    /* JADX INFO: renamed from: z */
    public final C30216h f64623z;

    public C31801e(Document document, SavedStateHandle savedStateHandle, InterfaceC29984m interfaceC29984m, C30312t c30312t, C30067A c30067a, C30311s0 c30311s0, InterfaceC28389D0 interfaceC28389D0, C30156e c30156e, C30243e c30243e, C30251i c30251i, C30216h c30216h, C30071E c30071e, C30316a c30316a, C32662m c32662m) {
        super(document, savedStateHandle, interfaceC29984m, c30312t, c30067a, c30311s0, interfaceC28389D0, c30156e, c30316a, c30243e, c30251i, c32662m);
        this.f64623z = c30216h;
        this.f64622A = c30071e;
    }

    @Override // com.sumsub.sns.internal.features.presentation.utils.C32635M
    /* JADX INFO: renamed from: a */
    public final void mo70719a(String str) {
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public final Object m70882b(boolean z11, ContinuationImpl continuationImpl) {
        C31800d c31800d;
        if (continuationImpl instanceof C31800d) {
            c31800d = (C31800d) continuationImpl;
            int i11 = c31800d.f64620c;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c31800d.f64620c = i11 - Integer.MIN_VALUE;
            } else {
                c31800d = new C31800d(this, continuationImpl);
            }
        } else {
            c31800d = new C31800d(this, continuationImpl);
        }
        Object objM70098a = c31800d.f64618a;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c31800d.f64620c;
        boolean z12 = false;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objM70098a);
            C33270a c33270a = C33272c.f67816e;
            c33270a.f67810a.mo68955d("DocCapture", "tryApplyPreferredDefinitions", null);
            if (z11) {
                c33270a.f67810a.mo68955d("DocCapture", "Preferred definitions will not be applied", null);
                return Boxing.boxBoolean(false);
            }
            C30071E c30071e = this.f64622A;
            Document document = this.f66609a;
            String strM71236a = m71236a();
            c31800d.f64620c = 1;
            objM70098a = c30071e.m70098a(document, strM71236a, c31800d);
            if (objM70098a == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objM70098a);
        }
        C30128a c30128a = (C30128a) objM70098a;
        if (c30128a != null) {
            m70883b(c30128a.f60567a, c30128a.f60568b, c30128a.f60569c);
            C33272c.f67816e.f67810a.mo68955d("DocCapture", "Preferred definitions applied", null);
            z12 = true;
        }
        return Boxing.boxBoolean(z12);
    }

    @Override // com.sumsub.sns.internal.features.presentation.utils.C32635M
    /* JADX INFO: renamed from: a */
    public final Object mo70878a(C29054T c29054t, ContinuationImpl continuationImpl) {
        C33272c.f67816e.f67810a.mo68955d("DocCapture", "id preview - on picker result: " + c29054t + ", shouldSkipSelector=" + m71251d(), null);
        if (c29054t != null || m71251d()) {
            Object objM71222a = C32635M.m71222a(this, c29054t, continuationImpl);
            return objM71222a == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM71222a : Unit.INSTANCE;
        }
        List mutableList = CollectionsKt.toMutableList((Collection) m71250c());
        mutableList.clear();
        m71244a(mutableList);
        IdentitySide identitySide = IdentitySide.Front;
        C28936t c28936t = this.f66620l.f66657c;
        KProperty kProperty = C32662m.f66654e[0];
        c28936t.f58834a.set(c28936t.f58835b, identitySide);
        C29903a c29903a = C28366e.f57832a;
        C28366e.f57834c.put(GlobalStatePayload.IdDocSubType, this.f66620l.m71283a().getValue());
        if (C28468k0.f57983a.getPreferredDocumentsDefinitions() == null) {
            Object objM70880a = m70880a(false, continuationImpl);
            return objM70880a == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM70880a : Unit.INSTANCE;
        }
        Object obj = this.f66621m;
        InterfaceC31802f interfaceC31802f = obj instanceof InterfaceC31802f ? (InterfaceC31802f) obj : null;
        if (interfaceC31802f != null) {
            AbstractC28052C.finish$default((C31816t) interfaceC31802f, null, null, null, null, 15, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r6v13, types: [com.sumsub.sns.core.presentation.base.C, com.sumsub.sns.internal.features.presentation.utils.N] */
    /* JADX INFO: renamed from: d */
    public final Object m70884d(ContinuationImpl continuationImpl) {
        C31798b c31798b;
        ?? r11;
        if (continuationImpl instanceof C31798b) {
            c31798b = (C31798b) continuationImpl;
            int i11 = c31798b.f64614c;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c31798b.f64614c = i11 - Integer.MIN_VALUE;
            } else {
                c31798b = new C31798b(this, continuationImpl);
            }
        } else {
            c31798b = new C31798b(this, continuationImpl);
        }
        Object objM70143a = c31798b.f64612a;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c31798b.f64614c;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objM70143a);
            String strM71236a = m71236a();
            if (strM71236a == null || StringsKt.isBlank(strM71236a) || StringsKt.isBlank(m71247b()) || Intrinsics.areEqual(m71247b(), "OTHER")) {
                C30216h c30216h = this.f64623z;
                String strM71236a2 = m71236a();
                Document document = this.f66609a;
                c31798b.f64614c = 1;
                objM70143a = c30216h.m70143a(document, strM71236a2, c31798b);
                if (objM70143a == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            C33272c.f67816e.f67810a.mo68955d("DocCapture", "showCamera, country=" + m71236a() + ", idDocType=" + m71247b(), null);
            r11 = this.f66621m;
            if (r11 != 0) {
                r11.mo70469b(false);
            }
            return Unit.INSTANCE;
        }
        if (i12 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(objM70143a);
        C30175f c30175f = (C30175f) objM70143a;
        m70883b(c30175f.f60635a, c30175f.f60636b, c30175f.f60637c);
        C33272c.f67816e.f67810a.mo68955d("DocCapture", "showCamera, country=" + m71236a() + ", idDocType=" + m71247b(), null);
        r11 = this.f66621m;
        if (r11 != 0) {
            r11.mo70469b(false);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: j */
    public final boolean m70885j() {
        if (this.f66620l.m71283a() == IdentitySide.Front) {
            return !m71250c().isEmpty();
        }
        return m71250c().size() > 1;
    }

    /* JADX INFO: renamed from: b */
    public final void m70883b(String str, String str2, DocumentSideness documentSideness) {
        C33272c.f67816e.f67810a.mo68955d("DocCapture", "applyDocumentInfo: country=" + str + ", idDocType=" + str2 + ", sideness=" + documentSideness, null);
        C28936t c28936t = this.f66628t;
        KProperty[] kPropertyArr = C32635M.f66607x;
        KProperty kProperty = kPropertyArr[6];
        c28936t.f58834a.set(c28936t.f58835b, str);
        C28936t c28936t2 = this.f66629u;
        KProperty kProperty2 = kPropertyArr[7];
        c28936t2.f58834a.set(c28936t2.f58835b, str2);
        C28936t c28936t3 = this.f66620l.f66658d;
        KProperty kProperty3 = C32662m.f66654e[1];
        c28936t3.f58834a.set(c28936t3.f58835b, documentSideness);
    }

    @Override // com.sumsub.sns.internal.features.presentation.utils.C32635M
    /* JADX INFO: renamed from: a */
    public final Object mo70879a(SuspendLambda suspendLambda) {
        C33272c.f67816e.f67810a.mo68955d("DocCapture", "onRestartStep", null);
        if (m71251d()) {
            Object objMo70879a = super.mo70879a(suspendLambda);
            return objMo70879a == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objMo70879a : Unit.INSTANCE;
        }
        IdentitySide identitySide = IdentitySide.Front;
        C28936t c28936t = this.f66620l.f66657c;
        KProperty kProperty = C32662m.f66654e[0];
        c28936t.f58834a.set(c28936t.f58835b, identitySide);
        List mutableList = CollectionsKt.toMutableList((Collection) m71250c());
        mutableList.clear();
        m71244a(mutableList);
        Object objM70880a = m70880a(true, (ContinuationImpl) suspendLambda);
        return objM70880a == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM70880a : Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0083, code lost:
    
        if (m70884d(r0) == r1) goto L21;
     */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m70881b(String str, String str2, ContinuationImpl continuationImpl) {
        C31797a c31797a;
        if (continuationImpl instanceof C31797a) {
            c31797a = (C31797a) continuationImpl;
            int i11 = c31797a.f64611e;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c31797a.f64611e = i11 - Integer.MIN_VALUE;
            } else {
                c31797a = new C31797a(this, continuationImpl);
            }
        } else {
            c31797a = new C31797a(this, continuationImpl);
        }
        Object objM70180a = c31797a.f64609c;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c31797a.f64611e;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objM70180a);
            C33272c.f67816e.f67810a.mo68955d("DocCapture", "onDocumentAndCountrySelected: c=" + str + ", t=" + str2, null);
            C30312t c30312t = this.f66612d;
            Document document = this.f66609a;
            c31797a.f64607a = str;
            c31797a.f64608b = str2;
            c31797a.f64611e = 1;
            objM70180a = c30312t.m70180a(document, str, str2, c31797a);
            if (objM70180a != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i12 == 1) {
            str2 = c31797a.f64608b;
            str = c31797a.f64607a;
            ResultKt.throwOnFailure(objM70180a);
        } else {
            if (i12 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objM70180a);
        }
        return Unit.INSTANCE;
        m70883b(str, str2, (DocumentSideness) objM70180a);
        c31797a.f64607a = null;
        c31797a.f64608b = null;
        c31797a.f64611e = 2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0090, code lost:
    
        if (m70884d(r0) == r1) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00a2, code lost:
    
        if (m70884d(r0) == r1) goto L32;
     */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m70880a(boolean z11, ContinuationImpl continuationImpl) {
        C31799c c31799c;
        if (continuationImpl instanceof C31799c) {
            c31799c = (C31799c) continuationImpl;
            int i11 = c31799c.f64617c;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c31799c.f64617c = i11 - Integer.MIN_VALUE;
            } else {
                c31799c = new C31799c(this, continuationImpl);
            }
        } else {
            c31799c = new C31799c(this, continuationImpl);
        }
        Object objM70882b = c31799c.f64615a;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c31799c.f64617c;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objM70882b);
            C33272c.f67816e.f67810a.mo68955d("DocCapture", "showDocumentTypeSelector, skipSelector=" + m71251d() + ", fromWarning=" + z11 + ", documentIsSubmitted=" + this.f66609a.isSubmitted(), null);
            c31799c.f64617c = 1;
            objM70882b = m70882b(z11, c31799c);
            if (objM70882b != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i12 != 1) {
            if (i12 == 2) {
                ResultKt.throwOnFailure(objM70882b);
                return Unit.INSTANCE;
            }
            if (i12 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objM70882b);
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(objM70882b);
        if (((Boolean) objM70882b).booleanValue()) {
            c31799c.f64617c = 2;
        } else if (m71251d()) {
            c31799c.f64617c = 3;
        } else {
            C33272c.f67816e.f67810a.mo68955d("DocCapture", "showDocumentTypeSelector, request selector", null);
            Object obj = this.f66621m;
            InterfaceC31802f interfaceC31802f = obj instanceof InterfaceC31802f ? (InterfaceC31802f) obj : null;
            if (interfaceC31802f != null) {
                String str = this.f66609a.getType().f59014a;
                C31816t c31816t = (C31816t) interfaceC31802f;
                c31816t.fireEvent(new C31810n(c31816t.f64476a.getType().f59014a, m71236a()));
            }
            return Unit.INSTANCE;
        }
        return coroutine_suspended;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x006a  */
    @Override // com.sumsub.sns.internal.features.presentation.utils.C32635M
    /* JADX INFO: renamed from: a */
    public final C30119M mo70877a(boolean z11, AbstractC29172p abstractC29172p, C29124h c29124h) {
        boolean zAreEqual;
        boolean zM71252e = m71252e();
        Document document = this.f66609a;
        List listM71253f = m71253f();
        boolean z12 = false;
        boolean z13 = true;
        if ((!AbstractC29130i.m69773a(c29124h, this.f66609a.getType().f59014a) && !this.f66609a.getType().m69748e()) || m71252e()) {
            z13 = false;
        }
        String strM71247b = !m71251d() ? m71247b() : null;
        DocCapture$PreferredMode docCapture$PreferredMode = DocCapture$PreferredMode.AUTO;
        if (this.f66620l.m71283a() == IdentitySide.Back) {
            C29054T c29054t = (C29054T) CollectionsKt.lastOrNull(m71250c());
            if (c29054t == null) {
                zAreEqual = false;
            } else {
                if (c29054t.f58998e != IdentitySide.Front) {
                    c29054t = null;
                }
                if (c29054t != null) {
                    zAreEqual = Intrinsics.areEqual(c29054t.f59000g, Boxing.boxBoolean(true));
                } else {
                    zAreEqual = false;
                }
            }
            if (zAreEqual) {
                z12 = z13;
            }
        }
        if (!z12) {
            docCapture$PreferredMode = null;
        }
        return new C30119M(zM71252e, document, listM71253f, z13, strM71247b, z11, docCapture$PreferredMode, m71236a(), m71245a(abstractC29172p, z11));
    }
}
