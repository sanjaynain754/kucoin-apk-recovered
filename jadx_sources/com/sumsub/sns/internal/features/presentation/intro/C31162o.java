package com.sumsub.sns.internal.features.presentation.intro;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractSavedStateViewModelFactory;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel;
import com.sumsub.sns.core.presentation.base.AbstractC28133l;
import com.sumsub.sns.internal.core.domain.C28578h;
import com.sumsub.sns.internal.features.data.repository.common.InterfaceC29953a;
import com.sumsub.sns.internal.features.data.repository.dynamic.InterfaceC29984m;
import com.sumsub.sns.internal.features.presentation.main.instructions.C31283h;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Set;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.intro.o */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31162o extends AbstractSavedStateViewModelFactory {

    /* JADX INFO: renamed from: a */
    public final C31157j f63009a;

    /* JADX INFO: renamed from: b */
    public final C28578h f63010b;

    @Override // androidx.lifecycle.AbstractSavedStateViewModelFactory
    public final ViewModel create(String str, Class cls, SavedStateHandle savedStateHandle) {
        String string;
        Fragment parentFragment = this.f63009a.getParentFragment();
        AbstractC28133l abstractC28133l = parentFragment instanceof AbstractC28133l ? (AbstractC28133l) parentFragment : null;
        Object viewModel$idensic_mobile_sdk_aar_defaultRelease = abstractC28133l != null ? abstractC28133l.getViewModel$idensic_mobile_sdk_aar_defaultRelease() : null;
        InterfaceC31150c interfaceC31150c = viewModel$idensic_mobile_sdk_aar_defaultRelease instanceof InterfaceC31150c ? (InterfaceC31150c) viewModel$idensic_mobile_sdk_aar_defaultRelease : null;
        Bundle arguments = this.f63009a.getArguments();
        C28578h c28578h = this.f63010b;
        C31283h c31283h = new C31283h(savedStateHandle, (InterfaceC29984m) c28578h.f58180r.getValue(), (Set) c28578h.f58162S.getValue());
        Serializable serializable = arguments != null ? arguments.getSerializable("sns_param_analytics_payload") : null;
        HashMap map = serializable instanceof HashMap ? (HashMap) serializable : null;
        if (map == null) {
            map = new HashMap();
        }
        HashMap map2 = map;
        if (arguments == null || (string = arguments.getString("sns_param_step")) == null) {
            string = "TYPE_UNKNOWN";
        }
        String str2 = string;
        String string2 = arguments != null ? arguments.getString("sns_param_document_type") : null;
        String string3 = arguments != null ? arguments.getString("sns_param_scene") : null;
        String str3 = string3 == null ? "" : string3;
        String string4 = arguments != null ? arguments.getString("sns_param_country_code") : null;
        return new C31161n(str2, string2, str3, string4 == null ? "" : string4, arguments != null ? arguments.getBoolean("sns_param_cancel_on_back") : false, interfaceC31150c, c31283h, map2, (InterfaceC29953a) this.f63010b.f58168f.getValue(), (InterfaceC29984m) this.f63010b.f58180r.getValue());
    }

    public C31162o(C31157j c31157j, C28578h c28578h) {
        super(c31157j, c31157j.getArguments());
        this.f63009a = c31157j;
        this.f63010b = c28578h;
    }
}
