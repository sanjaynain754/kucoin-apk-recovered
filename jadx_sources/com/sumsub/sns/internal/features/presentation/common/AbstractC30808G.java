package com.sumsub.sns.internal.features.presentation.common;

import android.os.Parcelable;
import androidx.lifecycle.ViewModelKt;
import com.sumsub.sns.core.presentation.base.AbstractC28142p0;
import com.sumsub.sns.core.presentation.base.C28076P;
import com.sumsub.sns.core.presentation.base.InterfaceC28077Q;
import com.sumsub.sns.core.presentation.base.InterfaceC28145r;
import com.sumsub.sns.internal.features.data.model.common.C29015J;
import com.sumsub.sns.internal.features.data.model.common.C29054T;
import com.sumsub.sns.internal.features.data.repository.common.InterfaceC29953a;
import com.sumsub.sns.internal.features.data.repository.dynamic.InterfaceC29984m;
import com.sumsub.sns.internal.features.domain.documents.AbstractC30117K;
import com.sumsub.sns.internal.features.domain.documents.AbstractC30125T;
import com.sumsub.sns.internal.features.domain.documents.AbstractC30146q;
import com.sumsub.sns.internal.features.domain.documents.C30110D;
import com.sumsub.sns.internal.features.domain.documents.C30112F;
import com.sumsub.sns.internal.features.domain.documents.C30114H;
import com.sumsub.sns.internal.features.domain.documents.C30116J;
import com.sumsub.sns.internal.features.domain.documents.C30132c;
import com.sumsub.sns.internal.features.domain.utils.C30316a;
import com.sumsub.sns.internal.features.presentation.utils.C32635M;
import com.sumsub.sns.internal.features.presentation.utils.C32666q;
import com.sumsub.sns.internal.features.presentation.utils.InterfaceC32636N;
import java.io.File;
import java.util.List;
import java.util.Map;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.C41782z0;
import kotlinx.coroutines.flow.C41679x;
import kotlinx.coroutines.flow.InterfaceC41669n;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.common.G */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public abstract class AbstractC30808G extends AbstractC28142p0 implements InterfaceC32636N {

    /* JADX INFO: renamed from: V */
    public static final /* synthetic */ int f62235V = 0;

    /* JADX INFO: renamed from: a */
    public final C32635M f62236a;

    /* JADX INFO: renamed from: b */
    public final C30316a f62237b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC41669n f62238c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC41669n f62239d;

    /* JADX INFO: renamed from: a */
    public abstract Object mo70458a(AbstractC30146q abstractC30146q, Continuation continuation);

    /* JADX INFO: renamed from: a */
    public abstract Unit mo70460a(C32666q c32666q, List list);

    /* JADX INFO: renamed from: a */
    public abstract void mo70461a(int i11, File file);

    /* JADX INFO: renamed from: a */
    public final void m70462a(C29054T c29054t, C29015J c29015j, int i11) {
        C30316a.m70183b(this.f62237b, "SNSImageDocumentsAwareViewModel", "On photo pick result: " + c29054t);
        if (i11 == -1) {
            showProgress(true);
            C41696j.m91104d(ViewModelKt.getViewModelScope(this), null, null, new C30845v(c29015j, this, c29054t, null), 3, null);
        } else if (i11 == 100) {
            C41696j.m91104d(ViewModelKt.getViewModelScope(this), null, null, new C30846w(this, null), 3, null);
        }
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo70463a(C29054T c29054t, AbstractC30125T abstractC30125T, int i11);

    /* JADX INFO: renamed from: a */
    public abstract void mo70466a(String str, Throwable th2);

    /* JADX INFO: renamed from: e */
    public abstract void mo70470e();

    public AbstractC30808G(InterfaceC29953a interfaceC29953a, InterfaceC29984m interfaceC29984m, C32635M c32635m, C30316a c30316a) {
        super(interfaceC29953a, interfaceC29984m, new C28076P(3));
        this.f62236a = c32635m;
        this.f62237b = c30316a;
        InterfaceC41669n interfaceC41669nM91009a = C41679x.m91009a(null);
        this.f62238c = interfaceC41669nM91009a;
        this.f62239d = interfaceC41669nM91009a;
        c32635m.f66621m = this;
        C41696j.m91104d(ViewModelKt.getViewModelScope(this), null, null, new C30825h(this, null), 3, null);
    }

    @Override // com.sumsub.sns.internal.features.presentation.utils.InterfaceC32636N
    /* JADX INFO: renamed from: b */
    public final void mo70469b(boolean z11) {
        C30316a.m70183b(this.f62237b, "SNSImageDocumentsAwareViewModel", "showCamera, retake=" + z11);
        C41696j.m91104d(ViewModelKt.getViewModelScope(this), null, null, new C30848y(this, z11, null), 3, null);
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28142p0
    public void intent(InterfaceC28077Q interfaceC28077Q) {
        C30316a.m70183b(this.f62237b, "SNSImageDocumentsAwareViewModel", "Intent: " + interfaceC28077Q);
        if (interfaceC28077Q instanceof C30838o) {
            C30838o c30838o = (C30838o) interfaceC28077Q;
            m70468a(c30838o.f62283a, c30838o.f62284b);
            return;
        }
        if (interfaceC28077Q instanceof C30841r) {
            mo70469b(false);
            return;
        }
        if (interfaceC28077Q instanceof C30837n) {
            C30837n c30837n = (C30837n) interfaceC28077Q;
            m70462a(c30837n.f62280a, c30837n.f62281b, c30837n.f62282c);
            return;
        }
        if (interfaceC28077Q instanceof C30844u) {
            mo70470e();
            return;
        }
        if (interfaceC28077Q instanceof C30843t) {
            C41696j.m91104d(ViewModelKt.getViewModelScope(this), null, null, new C30803B(this, ((C30843t) interfaceC28077Q).f62289a, null), 3, null);
            return;
        }
        if (interfaceC28077Q instanceof C30829j) {
            C30316a.m70183b(this.f62237b, "SNSImageDocumentsAwareViewModel", "dismissBottomSheet");
            this.f62238c.setValue(null);
            return;
        }
        if (interfaceC28077Q instanceof C30831k) {
            C30831k c30831k = (C30831k) interfaceC28077Q;
            C41696j.m91104d(ViewModelKt.getViewModelScope(this), null, null, new C30802A(this, c30831k.f62271a, c30831k.f62272b, null), 3, null);
            return;
        }
        if (interfaceC28077Q instanceof C30839p) {
            m70464a(((C30839p) interfaceC28077Q).f62285a);
            return;
        }
        if (interfaceC28077Q instanceof C30835m) {
            C30835m c30835m = (C30835m) interfaceC28077Q;
            C41696j.m91104d(ViewModelKt.getViewModelScope(this), null, null, new C30849z(this, c30835m.f62276a, c30835m.f62277b, c30835m.f62278c, null), 3, null);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m70464a(AbstractC30117K abstractC30117K) {
        C30316a.m70183b(this.f62237b, "SNSImageDocumentsAwareViewModel", "onPreviewShowed, result=" + abstractC30117K);
        if (abstractC30117K instanceof C30112F) {
            this.f62236a.m71242a(((C30112F) abstractC30117K).f60545a);
            return;
        }
        if (abstractC30117K instanceof C30114H) {
            C30114H c30114h = (C30114H) abstractC30117K;
            this.f62236a.m71242a(c30114h.f60546a);
            if (c30114h.f60547b) {
                fireEvent(C30840q.f62286a);
                return;
            } else {
                mo70469b(true);
                return;
            }
        }
        if (abstractC30117K instanceof C30116J) {
            showProgress(true);
            C41696j.m91104d(ViewModelKt.getViewModelScope(this), C41782z0.m91392b(), null, new C30847x(this, null, abstractC30117K, this), 2, null);
            return;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: a */
    public final void m70465a(CharSequence charSequence, CharSequence charSequence2) {
        C30316a.m70183b(this.f62237b, "SNSImageDocumentsAwareViewModel", "showWarningBottomSheet, " + ((Object) charSequence));
        this.f62238c.setValue(new C30827i(charSequence, charSequence2));
    }

    /* JADX INFO: renamed from: a */
    public final void m70468a(boolean z11, Parcelable parcelable) {
        C30316a.m70183b(this.f62237b, "SNSImageDocumentsAwareViewModel", "On instructions showed, success=" + z11 + ", payload=" + parcelable);
        if (z11 && (parcelable instanceof InterfaceC28145r)) {
            fireEvent((InterfaceC28145r) parcelable);
        }
    }

    @Override // com.sumsub.sns.internal.features.presentation.utils.InterfaceC32636N
    /* JADX INFO: renamed from: a */
    public final Object mo70459a(C32666q c32666q, List list, ContinuationImpl continuationImpl) {
        C30316a.m70183b(this.f62237b, "SNSImageDocumentsAwareViewModel", "onDocumentsPicked, " + list);
        showProgress(false);
        C29054T c29054t = (C29054T) CollectionsKt.last(list);
        File file = c29054t.f58995b;
        boolean z11 = c29054t.f59002i;
        Map map = c32666q.f66670b;
        C32635M.f66606w.getClass();
        File file2 = c29054t.f58995b;
        C30132c c30132c = (C30132c) map.get(file2 != null ? file2.getAbsolutePath() : null);
        fireEvent(new C30842s(new C30110D(file, z11, c30132c != null ? Boxing.boxInt(c30132c.f60571a) : null)));
        C30316a.m70183b(this.f62237b, "SNSImageDocumentsAwareViewModel", "onDocumentsPicked, no issues with images");
        return Unit.INSTANCE;
    }

    @Override // com.sumsub.sns.internal.features.presentation.utils.InterfaceC32636N
    /* JADX INFO: renamed from: a */
    public final void mo70467a(boolean z11) {
        C30316a.m70183b(this.f62237b, "SNSImageDocumentsAwareViewModel", "onNothingPicked, currentResultsEmpty=" + z11);
        showProgress(false);
    }
}
