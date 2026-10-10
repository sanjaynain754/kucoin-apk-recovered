package com.sumsub.sns.internal.features.presentation.preview.selfie;

import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModelKt;
import com.sumsub.log.logger.Logger;
import com.sumsub.sns.core.presentation.base.AbstractC28052C;
import com.sumsub.sns.core.presentation.base.AbstractC28073M0;
import com.sumsub.sns.core.presentation.base.InterfaceC28147s;
import com.sumsub.sns.internal.core.common.AbstractC28421U;
import com.sumsub.sns.internal.core.common.C28491s;
import com.sumsub.sns.internal.core.presentation.android.AbstractC28639a;
import com.sumsub.sns.internal.core.presentation.screen.base.C28936t;
import com.sumsub.sns.internal.features.data.model.common.AbstractC29149l0;
import com.sumsub.sns.internal.features.data.model.common.AbstractC29172p;
import com.sumsub.sns.internal.features.data.model.common.AbstractC29180q2;
import com.sumsub.sns.internal.features.data.model.common.C29124h;
import com.sumsub.sns.internal.features.data.model.common.C29131i0;
import com.sumsub.sns.internal.features.data.model.common.C29154m;
import com.sumsub.sns.internal.features.data.model.common.Document;
import com.sumsub.sns.internal.features.data.model.common.VideoRequiredType;
import com.sumsub.sns.internal.features.data.repository.common.InterfaceC29953a;
import com.sumsub.sns.internal.features.data.repository.dynamic.InterfaceC29984m;
import com.sumsub.sns.internal.features.domain.C30156e;
import com.sumsub.sns.internal.features.domain.C30319v0;
import com.sumsub.sns.internal.features.presentation.preview.AbstractC31739h;
import com.sumsub.sns.internal.features.presentation.preview.C31509b;
import com.sumsub.sns.internal.log.C33272c;
import com.sumsub.sns.internal.log.LoggerType;
import java.io.File;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.flow.InterfaceC41678w;
import p852kotlin.Unit;
import p852kotlin.collections.ArraysKt;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.reflect.KProperty;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.preview.selfie.q */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31957q extends AbstractC31739h {

    /* JADX INFO: renamed from: j */
    public static final /* synthetic */ KProperty[] f64987j = {AbstractC28639a.m69485a(C31957q.class, "idDocType", "getIdDocType()Ljava/lang/String;", 0)};

    /* JADX INFO: renamed from: g */
    public final C30319v0 f64988g;

    /* JADX INFO: renamed from: h */
    public final InterfaceC41678w f64989h;

    /* JADX INFO: renamed from: i */
    public final C28936t f64990i;

    public C31957q(Document document, SavedStateHandle savedStateHandle, InterfaceC29953a interfaceC29953a, InterfaceC29984m interfaceC29984m, C30319v0 c30319v0, C30156e c30156e) {
        super(document, savedStateHandle, interfaceC29953a, interfaceC29984m, c30156e);
        this.f64988g = c30319v0;
        this.f64989h = savedStateHandle.getStateFlow("KEY_FILE", null);
        this.f64990i = new C28936t(savedStateHandle, "KEY_ID_DOC_TYPE", "OTHER", false);
        AbstractC31959s.m70965a("Preview Selfie is created");
    }

    @Override // com.sumsub.sns.internal.features.presentation.preview.AbstractC31739h
    /* JADX INFO: renamed from: a */
    public final Object mo70740a(AbstractC29172p abstractC29172p, C29124h c29124h, Continuation continuation) {
        String str;
        AbstractC29180q2 abstractC29180q2 = (AbstractC29180q2) CollectionsKt.firstOrNull(abstractC29172p.m69796b(this.f64476a.getType()));
        if (abstractC29180q2 == null || (str = abstractC29180q2.f59176a) == null) {
            str = "OTHER";
        }
        C28936t c28936t = this.f64990i;
        KProperty kProperty = f64987j[0];
        c28936t.f58834a.set(c28936t.f58835b, str);
        if (this.f64477b.get("KEY_FILE") == null) {
            m70961a(abstractC29172p);
        } else {
            showProgress(false);
            mo70746c(true);
        }
        return Unit.INSTANCE;
    }

    @Override // com.sumsub.sns.internal.features.presentation.preview.AbstractC31739h
    /* JADX INFO: renamed from: c */
    public final void mo70746c(boolean z11) {
        AbstractC28073M0.updateState$default(this, false, new C31955o(z11, null), 1, null);
    }

    /* JADX INFO: renamed from: e */
    public final void m70963e() {
        AbstractC31959s.m70965a("Video Selfie uploaded successful. Document is " + this.f64476a.getType());
        fireEvent(new C31509b(this.f64476a));
    }

    /* JADX INFO: renamed from: f */
    public final void m70964f() {
        String str;
        File file = (File) this.f64989h.getValue();
        if (file == null || (str = (String) this.f64477b.get("KEY_PHRASE")) == null || str.length() == 0) {
            AbstractC28052C.finish$default(this, C28491s.f58027b, null, null, null, 14, null);
            return;
        }
        showProgress(true);
        AbstractC31959s.m70965a("Uploading video selfie fallback. File - " + file.getAbsolutePath() + ", Phrase - " + ((String) this.f64477b.get("KEY_PHRASE")));
        C41696j.m91104d(ViewModelKt.getViewModelScope(this), null, null, new C31956p(this, file, null), 3, null);
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28073M0
    public final InterfaceC28147s getDefaultState() {
        return new C31950j(null, null, null, null, null, false);
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28052C
    public final void onHandleError(AbstractC29149l0 abstractC29149l0) {
        AbstractC31959s.m70965a("Preview selfie error handling... " + abstractC29149l0);
        if (abstractC29149l0 instanceof C29131i0) {
            m70964f();
        } else {
            super.onHandleError(abstractC29149l0);
        }
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28073M0
    public final Object onPrepare(Continuation continuation) {
        AbstractC28421U.m69306b(this.f64989h, ViewModelKt.getViewModelScope(this), new C31952l(this, null));
        AbstractC28073M0.updateState$default(this, false, new C31953m(this, null), 1, null);
        onLoad();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: a */
    public final void m70962a(File file, String str) {
        AbstractC31959s.m70965a("onHandleVideoSelfie. File - " + (file != null ? file.getAbsolutePath() : null) + ", Phrase size - " + (str != null ? Integer.valueOf(str.length()) : null));
        if (file != null && str != null && str.length() != 0) {
            this.f64477b.set("KEY_FILE", file);
            this.f64477b.set("KEY_PHRASE", str);
            showProgress(false);
            mo70746c(true);
            return;
        }
        if (((File) this.f64989h.getValue()) == null) {
            AbstractC28052C.finish$default(this, C28491s.f58027b, null, null, null, 14, null);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m70961a(AbstractC29172p abstractC29172p) {
        if (abstractC29172p == null) {
            AbstractC31959s.m70965a("applicant null!");
            C33272c c33272c = C33272c.f67812a;
            Logger.DefaultImpls.e$default(C33272c.m71618b(ArraysKt.toList(new LoggerType[]{LoggerType.KIBANA})), "SumSubVideoSelfie", "applicant null!", null, 4, null);
            return;
        }
        C29154m c29154mM69794a = abstractC29172p.m69794a(this.f64476a.getType());
        AbstractC31959s.m70965a("showPicker: docSet=" + c29154mM69794a);
        if (Intrinsics.areEqual(c29154mM69794a != null ? c29154mM69794a.f59135d : null, VideoRequiredType.Enabled.getValue())) {
            AbstractC31959s.m70965a("showPicker: show video selfie");
            String str = this.f64476a.getType().f59014a;
            C28936t c28936t = this.f64990i;
            KProperty kProperty = f64987j[0];
            fireEvent(new C31948h(new C31949i(str, (String) c28936t.m69705a())));
        }
    }
}
