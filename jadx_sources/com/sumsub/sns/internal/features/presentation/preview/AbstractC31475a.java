package com.sumsub.sns.internal.features.presentation.preview;

import androidx.exifinterface.media.ExifInterface;
import com.sumsub.sns.core.presentation.base.InterfaceC28145r;
import com.sumsub.sns.internal.core.common.InterfaceC28498u0;
import com.sumsub.sns.internal.features.presentation.common.AbstractC30809H;
import com.sumsub.sns.internal.features.presentation.main.SNSAppActivity;
import com.sumsub.sns.internal.features.presentation.preview.AbstractC31512e;
import com.sumsub.sns.internal.features.presentation.preview.AbstractC31739h;
import p852kotlin.Metadata;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.preview.a */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\u000e\b\u0001\u0010\u0004*\b\u0012\u0004\u0012\u00028\u00000\u00032\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005B\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m90084d2 = {"Lcom/sumsub/sns/internal/features/presentation/preview/a;", "Lcom/sumsub/sns/internal/features/presentation/preview/e;", ExifInterface.LATITUDE_SOUTH, "Lcom/sumsub/sns/internal/features/presentation/preview/h;", "VM", "Lcom/sumsub/sns/internal/features/presentation/common/H;", "<init>", "()V", "idensic-mobile-sdk-aar_defaultRelease"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
public abstract class AbstractC31475a<S extends AbstractC31512e, VM extends AbstractC31739h> extends AbstractC30809H<S, VM> {
    @Override // com.sumsub.sns.core.presentation.base.AbstractC28133l
    public void handleEvent(InterfaceC28145r interfaceC28145r) {
        if (!(interfaceC28145r instanceof C31509b)) {
            super.handleEvent(interfaceC28145r);
            return;
        }
        InterfaceC28498u0 appListener$idensic_mobile_sdk_aar_defaultRelease = getAppListener$idensic_mobile_sdk_aar_defaultRelease();
        if (appListener$idensic_mobile_sdk_aar_defaultRelease != null) {
            ((SNSAppActivity) appListener$idensic_mobile_sdk_aar_defaultRelease).m70608a(((C31509b) interfaceC28145r).f63935a.getType());
        }
    }
}
