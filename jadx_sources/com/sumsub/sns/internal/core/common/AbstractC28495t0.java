package com.sumsub.sns.internal.core.common;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import com.sumsub.sns.R$id;
import com.sumsub.sns.internal.core.analytics.Screen;
import com.sumsub.sns.internal.features.presentation.imageviewer.C31134f;
import com.sumsub.sns.internal.features.presentation.main.SNSAppActivity;
import java.io.File;
import java.io.Serializable;
import java.util.Map;

/* JADX INFO: renamed from: com.sumsub.sns.internal.core.common.t0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public abstract class AbstractC28495t0 {
    /* JADX INFO: renamed from: a */
    public static void m69386a(InterfaceC28498u0 interfaceC28498u0, File file, int i11, String str, Screen screen, Map map, int i12) {
        String str2 = (i12 & 8) != 0 ? null : "request_image_rotation";
        if ((i12 & 16) != 0) {
            screen = null;
        }
        if ((i12 & 32) != 0) {
            map = null;
        }
        SNSAppActivity sNSAppActivity = (SNSAppActivity) interfaceC28498u0;
        C31134f c31134f = new C31134f();
        Bundle bundle = new Bundle();
        bundle.putSerializable("file", file);
        bundle.putInt("rotation", i11);
        bundle.putString("arg_iddocsettype", str);
        if (screen != null) {
            bundle.putString("analyticsScreen", screen.getText());
        }
        Serializable serializable = map instanceof Serializable ? (Serializable) map : null;
        if (serializable != null) {
            bundle.putSerializable("analyticsPayload", serializable);
        }
        c31134f.setArguments(bundle);
        Fragment fragmentForResult = c31134f.forResult(str2);
        FragmentTransaction fragmentTransactionBeginTransaction = sNSAppActivity.getSupportFragmentManager().beginTransaction();
        fragmentTransactionBeginTransaction.replace(R$id.sns_container, fragmentForResult, "SNSImageViewerFragment");
        fragmentTransactionBeginTransaction.addToBackStack("SNSImageViewerFragment");
        fragmentTransactionBeginTransaction.commit();
    }
}
