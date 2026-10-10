package com.sumsub.sns.internal.features.presentation.error;

import android.os.Bundle;
import androidx.lifecycle.AbstractSavedStateViewModelFactory;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel;
import com.sumsub.sns.internal.core.common.AbstractC28437b;
import com.sumsub.sns.internal.core.common.InterfaceC28498u0;
import com.sumsub.sns.internal.core.domain.C28578h;
import com.sumsub.sns.internal.features.data.model.common.AbstractC29149l0;
import com.sumsub.sns.internal.features.data.model.common.C29107e0;
import com.sumsub.sns.internal.features.data.repository.common.InterfaceC29953a;
import com.sumsub.sns.internal.features.data.repository.dynamic.InterfaceC29984m;
import com.sumsub.sns.internal.features.presentation.main.AbstractC31275i2;
import com.sumsub.sns.internal.features.presentation.main.C31252d;
import com.sumsub.sns.internal.features.presentation.main.SNSAppActivity;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.error.u */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30942u extends AbstractSavedStateViewModelFactory {

    /* JADX INFO: renamed from: a */
    public final C28578h f62499a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC28498u0 f62500b;

    /* JADX INFO: renamed from: c */
    public final Bundle f62501c;

    @Override // androidx.lifecycle.AbstractSavedStateViewModelFactory
    public final ViewModel create(String str, Class cls, SavedStateHandle savedStateHandle) {
        AbstractC29149l0 c29107e0;
        String string;
        InterfaceC28498u0 interfaceC28498u0 = this.f62500b;
        if (interfaceC28498u0 == null) {
            throw new IllegalArgumentException("SNSErrorFragment requires appListener for ErrorController");
        }
        C31252d c31252dMo70633f = ((AbstractC31275i2) ((SNSAppActivity) interfaceC28498u0).f63147e.getValue()).mo70633f();
        Bundle bundle = this.f62501c;
        if (bundle == null || (c29107e0 = (AbstractC29149l0) AbstractC28437b.m69320a(bundle, "arg_error", AbstractC29149l0.class, null)) == null) {
            c29107e0 = new C29107e0(null, null, null, 7);
        }
        AbstractC29149l0 abstractC29149l0 = c29107e0;
        Bundle bundle2 = this.f62501c;
        if (bundle2 == null || (string = bundle2.getString("arg_iddocsettype")) == null) {
            string = "TYPE_UNKNOWN";
        }
        String str2 = string;
        Bundle bundle3 = this.f62501c;
        String string2 = bundle3 != null ? bundle3.getString("arg_request_key") : null;
        C28578h c28578h = this.f62499a;
        return new C30941t(abstractC29149l0, str2, string2, c31252dMo70633f, c28578h.f58179q, (InterfaceC29953a) c28578h.f58168f.getValue(), (InterfaceC29984m) this.f62499a.f58180r.getValue());
    }

    public C30942u(C30935n c30935n, C28578h c28578h, InterfaceC28498u0 interfaceC28498u0, Bundle bundle) {
        super(c30935n, bundle);
        this.f62499a = c28578h;
        this.f62500b = interfaceC28498u0;
        this.f62501c = bundle;
    }
}
