package com.sumsub.sns.internal.features.presentation.camera.photo.document;

import com.sumsub.sns.core.widget.SNSSegmentedToggleView;
import com.sumsub.sns.internal.core.analytics.C28367f;
import com.sumsub.sns.internal.core.analytics.C28368g;
import com.sumsub.sns.internal.core.analytics.Control;
import com.sumsub.sns.internal.core.analytics.ControlAction;
import com.sumsub.sns.internal.core.analytics.Screen;
import java.util.LinkedHashMap;
import p852kotlin.collections.MapsKt;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.camera.photo.document.p */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30608p implements SNSSegmentedToggleView.OnItemSelected {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C30471K f61837a;

    public C30608p(C30471K c30471k) {
        this.f61837a = c30471k;
    }

    @Override // com.sumsub.sns.core.widget.SNSSegmentedToggleView.OnItemSelected
    public final void onSelected(int i11) {
        ((C30444C2) this.f61837a.f61477i.getValue()).m70351c(i11 == 0);
        C28367f analyticsDelegate = this.f61837a.getAnalyticsDelegate();
        C30471K c30471k = this.f61837a;
        Screen screen = c30471k.f61466G;
        Control control = Control.AutocaptureSegmentedControl;
        LinkedHashMap linkedHashMapM70391D = c30471k.m70391D();
        String f66531c = this.f61837a.getF66519e();
        analyticsDelegate.getClass();
        if (screen == Screen.Other) {
            return;
        }
        C28368g c28368gM69265a = new C28368g().m69265a(screen, f66531c, null);
        c28368gM69265a.f57846b.add(control);
        c28368gM69265a.f57846b.add(ControlAction.Changed);
        c28368gM69265a.f57847c = MapsKt.toMap(MapsKt.plus(C28367f.m69252a(screen, f66531c), linkedHashMapM70391D));
        c28368gM69265a.m69267a(false);
    }
}
