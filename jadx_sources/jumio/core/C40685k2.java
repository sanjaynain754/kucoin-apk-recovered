package jumio.core;

import com.jumio.core.Controller;
import com.jumio.core.model.StaticModel;
import com.jumio.core.models.LegalStatementModel;
import com.jumio.core.models.ReusableIdLookupResult;
import com.jumio.core.persistence.DataManager;
import com.jumio.sdk.document.JumioLookupResult;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: jumio.core.k2 */
/* JADX INFO: loaded from: classes61.dex */
public final class C40685k2 implements StaticModel {

    /* JADX INFO: renamed from: a */
    public JumioLookupResult f90312a;

    /* JADX INFO: renamed from: b */
    public Boolean f90313b;

    /* JADX INFO: renamed from: a */
    public final void m89259a(Controller controller, boolean z11, boolean z12) {
        Intrinsics.checkNotNullParameter(controller, "controller");
        if (z11) {
            this.f90312a = null;
            this.f90313b = null;
        }
        if (z12) {
            DataManager f13603d = controller.getF13603d();
            ((ReusableIdLookupResult) f13603d.get(ReusableIdLookupResult.class)).f14311a = null;
            LegalStatementModel legalStatementModel = (LegalStatementModel) f13603d.get(LegalStatementModel.class);
            legalStatementModel.f14262c = null;
            legalStatementModel.f14261b = null;
            legalStatementModel.f14260a = "";
        }
    }
}
