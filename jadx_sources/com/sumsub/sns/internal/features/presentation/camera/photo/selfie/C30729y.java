package com.sumsub.sns.internal.features.presentation.camera.photo.selfie;

import androidx.lifecycle.SavedStateHandle;
import com.sumsub.log.logger.Logger;
import com.sumsub.sns.core.presentation.base.AbstractC28052C;
import com.sumsub.sns.core.presentation.base.AbstractC28142p0;
import com.sumsub.sns.core.presentation.base.C28075O;
import com.sumsub.sns.core.presentation.base.C28076P;
import com.sumsub.sns.core.presentation.base.InterfaceC28077Q;
import com.sumsub.sns.internal.core.analytics.C28366e;
import com.sumsub.sns.internal.core.analytics.GlobalStatePayload;
import com.sumsub.sns.internal.core.presentation.android.C28651g;
import com.sumsub.sns.internal.features.data.model.common.C29054T;
import com.sumsub.sns.internal.features.data.model.common.C29070X;
import com.sumsub.sns.internal.features.data.model.common.IdentitySide;
import com.sumsub.sns.internal.features.data.repository.analytics.C29903a;
import com.sumsub.sns.internal.features.data.repository.common.InterfaceC29953a;
import com.sumsub.sns.internal.features.data.repository.dynamic.InterfaceC29984m;
import com.sumsub.sns.internal.features.presentation.camera.C30388m;
import com.sumsub.sns.internal.log.AbstractC33294e;
import com.sumsub.sns.internal.log.C33272c;
import java.io.File;
import kotlinx.coroutines.flow.C41636g;
import kotlinx.coroutines.flow.InterfaceC41634e;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.camera.photo.selfie.y */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30729y extends AbstractC28142p0 {

    /* JADX INFO: renamed from: a */
    public final C29070X f62076a;

    /* JADX INFO: renamed from: b */
    public final boolean f62077b;

    /* JADX INFO: renamed from: c */
    public final C30388m f62078c;

    /* JADX INFO: renamed from: d */
    public final C30728x f62079d;

    /* JADX INFO: renamed from: e */
    public final C28651g f62080e;

    public C30729y(SavedStateHandle savedStateHandle, C29070X c29070x, InterfaceC29953a interfaceC29953a, InterfaceC29984m interfaceC29984m, String str, boolean z11) {
        super(interfaceC29953a, interfaceC29984m, new C28076P(3));
        this.f62076a = c29070x;
        this.f62077b = z11;
        this.f62078c = new C30388m(this, savedStateHandle, "Selfie", interfaceC29984m, c29070x, null, str);
        this.f62079d = new C30728x(this);
        this.f62080e = new C28651g(savedStateHandle);
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28142p0
    public final InterfaceC41634e buildViewStateFlow(C28075O c28075o) {
        Logger.DefaultImpls.i$default(C33272c.f67812a, AbstractC33294e.m71624a(this), "Camera is started. Side - " + ((IdentitySide) this.f62078c.f57253a.get("CONTROLLER_CURRENT_SIDE")), null, 4, null);
        C29903a c29903a = C28366e.f57832a;
        C28366e.f57834c.put(GlobalStatePayload.IdDocType, this.f62076a.f59014a);
        return C41636g.m90889M(new C30724t());
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28142p0
    public final void intent(InterfaceC28077Q interfaceC28077Q) {
        if (interfaceC28077Q instanceof C30722r) {
            C33272c.f67816e.f67810a.mo68955d("DocCapture", "On take picture is clicked", null);
            fireEvent(new C30718n());
        } else if (!(interfaceC28077Q instanceof C30721q)) {
            if (interfaceC28077Q instanceof C30720p) {
                AbstractC28052C.finish$default(this, null, C29054T.m69738a(((C30720p) interfaceC28077Q).f62067a, null, null, (IdentitySide) this.f62078c.f57253a.get("CONTROLLER_CURRENT_SIDE"), 1007), null, null, 13, null);
            }
        } else {
            Logger.DefaultImpls.i$default(C33272c.f67812a, AbstractC33294e.m71624a(this), "Picture is taken", null, 4, null);
            showProgress(true);
            File file = ((C30721q) interfaceC28077Q).f62068a;
            AbstractC28052C.finish$default(this, null, new C29054T(file, file, null, null, (IdentitySide) this.f62078c.f57253a.get("CONTROLLER_CURRENT_SIDE"), null, null, 1004), null, null, 13, null);
        }
    }
}
