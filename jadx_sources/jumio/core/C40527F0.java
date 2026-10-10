package jumio.core;

import com.jumio.commons.camera.Camera1Manager;
import com.jumio.core.Controller;
import com.jumio.core.models.CredentialDataModel;
import com.jumio.core.models.CredentialsModel;
import com.jumio.sdk.credentials.JumioCredentialCategory;
import java.util.ArrayList;
import java.util.List;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: jumio.core.F0 */
/* JADX INFO: loaded from: classes61.dex */
public final class C40527F0 extends CredentialDataModel {

    /* JADX INFO: renamed from: h */
    public final ArrayList f89959h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C40527F0(String id2, List capabilities, ArrayList arrayList, List requiredParts, int i11) {
        super(id2, JumioCredentialCategory.FACE, capabilities, requiredParts, i11);
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(capabilities, "capabilities");
        Intrinsics.checkNotNullParameter(requiredParts, "requiredParts");
        this.f89959h = arrayList;
    }

    @Override // com.jumio.core.models.CredentialDataModel
    /* JADX INFO: renamed from: a */
    public final boolean mo14553a(Controller controller) {
        Intrinsics.checkNotNullParameter(controller, "controller");
        return !Camera1Manager.INSTANCE.hasFrontFacingCamera(controller.getF13601b()) && ((CredentialsModel) controller.getF13603d().get(CredentialsModel.class)).f14205a.isEmpty();
    }
}
