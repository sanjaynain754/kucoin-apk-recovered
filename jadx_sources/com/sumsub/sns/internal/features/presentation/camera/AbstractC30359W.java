package com.sumsub.sns.internal.features.presentation.camera;

import android.util.Size;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModelKt;
import com.sumsub.log.logger.Logger;
import com.sumsub.sns.core.data.model.SNSGeneralException;
import com.sumsub.sns.core.presentation.base.AbstractC28052C;
import com.sumsub.sns.core.presentation.base.AbstractC28073M0;
import com.sumsub.sns.core.presentation.base.InterfaceC28147s;
import com.sumsub.sns.internal.core.analytics.C28366e;
import com.sumsub.sns.internal.core.analytics.GlobalStatePayload;
import com.sumsub.sns.internal.core.presentation.android.C28651g;
import com.sumsub.sns.internal.core.presentation.camera.C28732b;
import com.sumsub.sns.internal.core.presentation.helper.camera.AbstractC28881b;
import com.sumsub.sns.internal.core.presentation.helper.camera.AbstractC28885f;
import com.sumsub.sns.internal.core.presentation.intro.C28895g;
import com.sumsub.sns.internal.core.presentation.intro.IntroScene;
import com.sumsub.sns.internal.features.data.model.common.AbstractC29121g2;
import com.sumsub.sns.internal.features.data.model.common.AbstractC29172p;
import com.sumsub.sns.internal.features.data.model.common.C29054T;
import com.sumsub.sns.internal.features.data.model.common.C29070X;
import com.sumsub.sns.internal.features.data.model.common.C29107e0;
import com.sumsub.sns.internal.features.data.model.common.C29154m;
import com.sumsub.sns.internal.features.data.model.common.IdentitySide;
import com.sumsub.sns.internal.features.data.repository.analytics.C29903a;
import com.sumsub.sns.internal.features.data.repository.common.InterfaceC29953a;
import com.sumsub.sns.internal.features.data.repository.dynamic.AbstractC29971N;
import com.sumsub.sns.internal.features.data.repository.dynamic.C29967J;
import com.sumsub.sns.internal.features.data.repository.dynamic.InterfaceC29984m;
import com.sumsub.sns.internal.log.AbstractC33294e;
import com.sumsub.sns.internal.log.C33272c;
import java.io.File;
import java.util.List;
import kotlinx.coroutines.C41696j;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.camera.W */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public abstract class AbstractC30359W extends AbstractC28073M0 {

    /* JADX INFO: renamed from: V */
    public static final /* synthetic */ int f61054V = 0;

    /* JADX INFO: renamed from: a */
    public final C29070X f61055a;

    /* JADX INFO: renamed from: b */
    public final String f61056b;

    /* JADX INFO: renamed from: c */
    public final String f61057c;

    /* JADX INFO: renamed from: d */
    public final boolean f61058d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC29984m f61059e;

    /* JADX INFO: renamed from: f */
    public final SavedStateHandle f61060f;

    /* JADX INFO: renamed from: g */
    public final C28732b f61061g;

    /* JADX INFO: renamed from: h */
    public IdentitySide f61062h;

    /* JADX INFO: renamed from: i */
    public final C28651g f61063i;

    /* JADX INFO: renamed from: a */
    public final void m70246a(IdentitySide identitySide) {
        boolean z11 = this.f61062h != identitySide;
        this.f61062h = identitySide;
        this.f61060f.set("current_side", identitySide);
        if (z11) {
            C33272c.f67816e.f67810a.mo68955d("DocCapture", "setting current side to " + identitySide, null);
            C41696j.m91104d(ViewModelKt.getViewModelScope(this), null, null, new C30352O(this, null), 3, null);
        }
    }

    /* JADX INFO: renamed from: e */
    public Size mo70249e() {
        return null;
    }

    /* JADX INFO: renamed from: f */
    public C28732b mo70250f() {
        return this.f61061g;
    }

    /* JADX INFO: renamed from: g */
    public void mo70251g() {
        C33272c.f67816e.f67810a.mo68955d("DocCapture", "On take picture is clicked", null);
        fireEvent(new C30349L());
        AbstractC28073M0.updateState$default(this, false, new C30355S(null), 1, null);
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28073M0
    public final InterfaceC28147s getDefaultState() {
        return new C30351N(true, true, false, false, null);
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28073M0
    public Object onPrepare(Continuation continuation) {
        return m70243a(this, (ContinuationImpl) continuation);
    }

    public AbstractC30359W(C29070X c29070x, String str, String str2, boolean z11, InterfaceC29953a interfaceC29953a, InterfaceC29984m interfaceC29984m, SavedStateHandle savedStateHandle) {
        super(interfaceC29953a, interfaceC29984m);
        this.f61055a = c29070x;
        this.f61056b = str;
        this.f61057c = str2;
        this.f61058d = z11;
        this.f61059e = interfaceC29984m;
        this.f61060f = savedStateHandle;
        this.f61061g = new C28732b();
        this.f61063i = new C28651g(savedStateHandle);
    }

    /* JADX INFO: renamed from: a */
    public void mo70247a(C29054T c29054t) {
        AbstractC28052C.finish$default(this, null, C29054T.m69738a(c29054t, null, null, (IdentitySide) this.f61060f.get("current_side"), 1007), null, null, 13, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0085, code lost:
    
        if (r10.m70245a(r0) == r1) goto L21;
     */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object m70243a(AbstractC30359W abstractC30359W, ContinuationImpl continuationImpl) {
        C30354Q c30354q;
        if (continuationImpl instanceof C30354Q) {
            c30354q = (C30354Q) continuationImpl;
            int i11 = c30354q.f61043d;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c30354q.f61043d = i11 - Integer.MIN_VALUE;
            } else {
                c30354q = new C30354Q(abstractC30359W, continuationImpl);
            }
        } else {
            c30354q = new C30354Q(abstractC30359W, continuationImpl);
        }
        Object obj = c30354q.f61041b;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c30354q.f61043d;
        if (i12 == 0) {
            ResultKt.throwOnFailure(obj);
            c30354q.f61040a = abstractC30359W;
            c30354q.f61043d = 1;
            if (AbstractC28073M0.onPrepare$suspendImpl(abstractC30359W, c30354q) != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i12 == 1) {
            abstractC30359W = c30354q.f61040a;
            ResultKt.throwOnFailure(obj);
        } else {
            if (i12 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
        Logger.DefaultImpls.i$default(C33272c.f67812a, AbstractC33294e.m71624a(abstractC30359W), "Camera is started. Side - " + ((IdentitySide) abstractC30359W.f61060f.get("current_side")), null, 4, null);
        C29903a c29903a = C28366e.f57832a;
        C28366e.f57834c.put(GlobalStatePayload.IdDocType, abstractC30359W.f61055a.f59014a);
        c30354q.f61040a = null;
        c30354q.f61043d = 2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m70245a(ContinuationImpl continuationImpl) {
        C30357U c30357u;
        String value;
        String sceneName;
        if (continuationImpl instanceof C30357U) {
            c30357u = (C30357U) continuationImpl;
            int i11 = c30357u.f61048c;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c30357u.f61048c = i11 - Integer.MIN_VALUE;
            } else {
                c30357u = new C30357U(this, continuationImpl);
            }
        } else {
            c30357u = new C30357U(this, continuationImpl);
        }
        Object objM70042a = c30357u.f61046a;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c30357u.f61048c;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objM70042a);
            IdentitySide identitySide = (IdentitySide) this.f61060f.get("current_side");
            if (identitySide != null && (value = identitySide.getValue()) != null) {
                C29903a c29903a = C28366e.f57832a;
                C28366e.f57834c.put(GlobalStatePayload.IdDocSubType, value);
            }
            InterfaceC29984m interfaceC29984m = this.f61059e;
            c30357u.f61048c = 1;
            objM70042a = ((C29967J) interfaceC29984m).m70042a(false, (Continuation) c30357u);
            if (objM70042a == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objM70042a);
        }
        AbstractC29172p abstractC29172p = (AbstractC29172p) ((AbstractC29971N) objM70042a).m70051c();
        if (abstractC29172p == null) {
            C33272c.f67816e.f67810a.mo68956e("DocCapture", "updateInstructions: applicant null", null);
            AbstractC28052C.throwError$default(this, new C29107e0(new SNSGeneralException("Camera instructions error. Applicant null", null, null, 6, null), null, null, 6), getDocumentType(), false, null, 12, null);
            return Unit.INSTANCE;
        }
        C29070X c29070x = this.f61055a;
        String str = c29070x.f59014a;
        C29154m c29154mM69794a = abstractC29172p.m69794a(c29070x);
        if (c29154mM69794a != null && c29154mM69794a.m69792f()) {
            sceneName = IntroScene.PHOTOSELFIE.getSceneName();
        } else if (c29154mM69794a == null || !c29154mM69794a.m69791e()) {
            sceneName = ((IdentitySide) this.f61060f.get("current_side")) == IdentitySide.Back ? IntroScene.SCAN_BACKSIDE.getSceneName() : IntroScene.SCAN_FRONTSIDE.getSceneName();
        } else {
            sceneName = IntroScene.PORTRAIT_SELFIE.getSceneName();
        }
        AbstractC28073M0.updateState$default(this, false, new C30358V(this, str, abstractC29172p, sceneName, null), 1, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: a */
    public AbstractC28885f mo70244a(AbstractC29172p abstractC29172p, C28895g c28895g) {
        List listM69796b;
        String value;
        String str = this.f61056b;
        if (str == null || (listM69796b = CollectionsKt.listOf(AbstractC29121g2.m69769a(str))) == null) {
            listM69796b = abstractC29172p.m69796b(this.f61055a);
        }
        List list = listM69796b;
        IdentitySide identitySide = (IdentitySide) this.f61060f.get("current_side");
        if (identitySide != null && (value = identitySide.getValue()) != null) {
            C29903a c29903a = C28366e.f57832a;
            C28366e.f57834c.put(GlobalStatePayload.IdDocSubType, value);
        }
        return AbstractC28881b.m69665a(getStrings(), this.f61055a, abstractC29172p.m69794a(this.f61055a), c28895g, list, (IdentitySide) this.f61060f.get("current_side"));
    }

    /* JADX INFO: renamed from: a */
    public void mo70248a(File file) {
        Logger.DefaultImpls.i$default(C33272c.f67812a, AbstractC33294e.m71624a(this), "Picture is taken", null, 4, null);
        showProgress(true);
        AbstractC28073M0.updateState$default(this, false, new C30353P(null), 1, null);
        AbstractC28052C.finish$default(this, null, new C29054T(file, file, null, null, (IdentitySide) this.f61060f.get("current_side"), null, null, 1004), null, null, 13, null);
    }
}
