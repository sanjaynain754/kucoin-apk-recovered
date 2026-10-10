package com.sumsub.sns.internal.features.presentation.restrictions;

import android.os.Bundle;
import androidx.lifecycle.AbstractSavedStateViewModelFactory;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel;
import com.sumsub.sns.internal.core.common.AbstractC28437b;
import com.sumsub.sns.internal.core.common.InterfaceC28498u0;
import com.sumsub.sns.internal.core.domain.C28578h;
import com.sumsub.sns.internal.features.data.model.common.remote.response.C29586o0;
import com.sumsub.sns.internal.features.data.repository.common.InterfaceC29953a;
import com.sumsub.sns.internal.features.data.repository.dynamic.InterfaceC29984m;
import com.sumsub.sns.internal.features.presentation.main.AbstractC31275i2;
import com.sumsub.sns.internal.features.presentation.main.SNSAppActivity;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.restrictions.h */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32342h extends AbstractSavedStateViewModelFactory {

    /* JADX INFO: renamed from: a */
    public final C28578h f65900a;

    /* JADX INFO: renamed from: b */
    public final Bundle f65901b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC28498u0 f65902c;

    /* JADX INFO: renamed from: d */
    public final String f65903d;

    @Override // androidx.lifecycle.AbstractSavedStateViewModelFactory
    public final ViewModel create(String str, Class cls, SavedStateHandle savedStateHandle) {
        Bundle bundle = this.f65901b;
        C29586o0 c29586o0 = bundle != null ? (C29586o0) AbstractC28437b.m69320a(bundle, "arg_initial_state", C29586o0.class, null) : null;
        C28578h c28578h = this.f65900a;
        return new C32333C(c29586o0, c28578h.f58179q, (InterfaceC29953a) c28578h.f58168f.getValue(), (InterfaceC29984m) this.f65900a.f58180r.getValue(), new C32340f((InterfaceC29953a) this.f65900a.f58168f.getValue()), (AbstractC31275i2) ((SNSAppActivity) this.f65902c).f63147e.getValue(), new C32341g(this.f65903d));
    }

    public C32342h(C32348n c32348n, C28578h c28578h, Bundle bundle, InterfaceC28498u0 interfaceC28498u0, String str) {
        super(c32348n, bundle);
        this.f65900a = c28578h;
        this.f65901b = bundle;
        this.f65902c = interfaceC28498u0;
        this.f65903d = str;
    }
}
