package com.sumsub.sns.internal.features.presentation.verification2.phone;

import androidx.lifecycle.SavedStateHandle;
import com.sumsub.sns.core.presentation.base.AbstractC28070L;
import com.sumsub.sns.core.presentation.base.AbstractC28142p0;
import com.sumsub.sns.internal.features.data.model.common.AbstractC29172p;
import com.sumsub.sns.internal.features.data.model.common.C29070X;
import com.sumsub.sns.internal.features.domain.C30068B;
import com.sumsub.sns.internal.features.domain.C30069C;
import com.sumsub.sns.internal.features.domain.C30270n;
import kotlinx.coroutines.flow.C41679x;
import kotlinx.coroutines.flow.InterfaceC41669n;
import p852kotlin.text.StringsKt;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.verification2.phone.c */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32853c extends AbstractC28070L {

    /* JADX INFO: renamed from: j */
    public final C30069C f67224j;

    /* JADX INFO: renamed from: k */
    public final InterfaceC41669n f67225k;

    /* JADX INFO: renamed from: l */
    public final String f67226l;

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28070L
    /* JADX INFO: renamed from: a */
    public final String mo69066a() {
        return this.f67226l;
    }

    /* JADX INFO: renamed from: a */
    public final void m71353a(String str, boolean z11) {
        String str2;
        if (str == null || StringsKt.isBlank(str)) {
            str2 = null;
        } else {
            str2 = "+" + str;
        }
        this.f67225k.setValue(str2 != null ? new C32849a(str2, z11) : null);
    }

    public C32853c(AbstractC28142p0 abstractC28142p0, SavedStateHandle savedStateHandle, C29070X c29070x, String str, C30069C c30069c) {
        super(abstractC28142p0, savedStateHandle, str, c29070x);
        this.f67224j = c30069c;
        this.f67225k = C41679x.m91009a(null);
        this.f67226l = "PhoneNumber";
    }

    /* JADX INFO: renamed from: a */
    public final void m71352a(AbstractC29172p abstractC29172p, C30270n c30270n, CharSequence charSequence) {
        String str;
        String strRemovePrefix;
        this.f67224j.getClass();
        C30068B c30068bM70095a = C30069C.m70095a(abstractC29172p, c30270n);
        if (c30068bM70095a.f60407b) {
            strRemovePrefix = c30068bM70095a.f60406a;
        } else {
            C32849a c32849a = (C32849a) this.f67225k.getValue();
            if (c32849a != null) {
                str = c32849a.f67214a;
            } else {
                str = c30068bM70095a.f60406a;
            }
            strRemovePrefix = str != null ? StringsKt.removePrefix(str, (CharSequence) "+") : null;
        }
        String str2 = strRemovePrefix;
        boolean z11 = c30068bM70095a.f60407b;
        C32849a c32849a2 = (C32849a) this.f67225k.getValue();
        this.f57260h.setValue(new C32851b(str2, charSequence, z11, c30270n, c32849a2 != null ? c32849a2.f67215b : false));
    }
}
