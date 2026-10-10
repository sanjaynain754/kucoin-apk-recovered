package com.sumsub.sns.internal.features.presentation.verification2.status;

import androidx.autofill.HintConstants;
import androidx.lifecycle.ViewModelKt;
import com.sumsub.sns.core.data.listener.SNSIconHandler;
import com.sumsub.sns.core.presentation.base.AbstractC28142p0;
import com.sumsub.sns.core.presentation.base.C28075O;
import com.sumsub.sns.core.presentation.base.C28076P;
import com.sumsub.sns.internal.features.data.model.common.ValidationIdentifierType;
import com.sumsub.sns.internal.features.data.repository.common.InterfaceC29953a;
import com.sumsub.sns.internal.features.data.repository.dynamic.C29983l;
import com.sumsub.sns.internal.features.data.repository.dynamic.InterfaceC29984m;
import java.util.Arrays;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.flow.C41636g;
import kotlinx.coroutines.flow.InterfaceC41634e;
import p852kotlin.jvm.internal.StringCompanionObject;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.verification2.status.k */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32892k extends AbstractC28142p0 {

    /* JADX INFO: renamed from: a */
    public final InterfaceC32889h f67292a;

    /* JADX INFO: renamed from: b */
    public final boolean f67293b;

    /* JADX INFO: renamed from: c */
    public final ValidationIdentifierType f67294c;

    public C32892k(InterfaceC32889h interfaceC32889h, boolean z11, ValidationIdentifierType validationIdentifierType, InterfaceC29953a interfaceC29953a, InterfaceC29984m interfaceC29984m) {
        super(interfaceC29953a, interfaceC29984m, new C28076P(3));
        this.f67292a = interfaceC32889h;
        this.f67293b = z11;
        this.f67294c = validationIdentifierType;
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28142p0
    public final InterfaceC41634e buildViewStateFlow(C28075O c28075o) {
        String str;
        C29983l c29983l = c28075o.f57271c;
        String str2 = this.f67294c == ValidationIdentifierType.EMAIL ? "email" : HintConstants.AUTOFILL_HINT_PHONE;
        if (this.f67293b) {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            str = String.format("sns_confirmation_result_%s_success_title", Arrays.copyOf(new Object[]{str2}, 1));
        } else {
            StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
            str = String.format("sns_confirmation_result_%s_failure_title", Arrays.copyOf(new Object[]{str2}, 1));
        }
        String strM70061a = null;
        String strM70061a2 = c29983l != null ? c29983l.m70061a(str) : null;
        String imageName = this.f67293b ? SNSIconHandler.SNSResultIcons.SUCCESS.getImageName() : SNSIconHandler.SNSResultIcons.FAILURE.getImageName();
        if (!this.f67293b && c29983l != null) {
            strM70061a = c29983l.m70061a("sns_confirmation_result_action_tryAgain");
        }
        return C41636g.m90889M(new C32890i(strM70061a2, imageName, !this.f67293b, strM70061a));
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28052C
    public final void onFirstAttach() {
        super.onFirstAttach();
        if (this.f67293b) {
            C41696j.m91104d(ViewModelKt.getViewModelScope(this), null, null, new C32891j(this, null), 3, null);
        }
    }
}
