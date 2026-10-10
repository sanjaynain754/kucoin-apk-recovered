package com.sumsub.sns.internal.features.presentation.questionnaire;

import android.os.Bundle;
import androidx.lifecycle.AbstractSavedStateViewModelFactory;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel;
import com.sumsub.sns.internal.core.domain.C28578h;
import com.sumsub.sns.internal.features.data.repository.applicant.InterfaceC29921d;
import com.sumsub.sns.internal.features.data.repository.common.InterfaceC29953a;
import com.sumsub.sns.internal.features.data.repository.dynamic.InterfaceC29984m;
import com.sumsub.sns.internal.features.domain.C30086U;
import com.sumsub.sns.internal.features.domain.C30156e;
import com.sumsub.sns.internal.features.domain.C30157e0;
import com.sumsub.sns.internal.features.domain.C30306q;
import com.sumsub.sns.internal.features.domain.C30311s0;
import com.sumsub.sns.internal.features.domain.utils.C30316a;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.questionnaire.J */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32301J extends AbstractSavedStateViewModelFactory {

    /* JADX INFO: renamed from: a */
    public final C28578h f65821a;

    @Override // androidx.lifecycle.AbstractSavedStateViewModelFactory
    public final ViewModel create(String str, Class cls, SavedStateHandle savedStateHandle) {
        return new C32300I(savedStateHandle, new C30316a(), new C30156e((InterfaceC29953a) this.f65821a.f58168f.getValue(), (InterfaceC29984m) this.f65821a.f58180r.getValue()), new C30086U(this.f65821a), new C30157e0(), new C30311s0(this.f65821a), new C30306q((InterfaceC29953a) this.f65821a.f58168f.getValue(), (InterfaceC29921d) this.f65821a.f58169g.getValue()), (InterfaceC29953a) this.f65821a.f58168f.getValue(), (InterfaceC29921d) this.f65821a.f58169g.getValue(), (InterfaceC29984m) this.f65821a.f58180r.getValue());
    }

    public C32301J(SNSQuestionnaireFragment sNSQuestionnaireFragment, C28578h c28578h, Bundle bundle) {
        super(sNSQuestionnaireFragment, bundle);
        this.f65821a = c28578h;
    }
}
