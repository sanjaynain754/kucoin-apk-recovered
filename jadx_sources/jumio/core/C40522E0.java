package jumio.core;

import com.jumio.core.Controller;
import com.jumio.core.models.CredentialDataModel;
import com.jumio.core.models.DocumentModel;
import com.jumio.sdk.credentials.JumioCredentialCategory;
import java.util.ArrayList;
import java.util.List;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: jumio.core.E0 */
/* JADX INFO: loaded from: classes61.dex */
public final class C40522E0 extends CredentialDataModel {

    /* JADX INFO: renamed from: h */
    public final ArrayList f89953h;

    /* JADX INFO: renamed from: i */
    public final ArrayList f89954i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C40522E0(String id2, List capabilities, ArrayList arrayList, ArrayList arrayList2, List requiredParts, int i11) {
        super(id2, JumioCredentialCategory.DOCUMENT, capabilities, requiredParts, i11);
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(capabilities, "capabilities");
        Intrinsics.checkNotNullParameter(requiredParts, "requiredParts");
        this.f89953h = arrayList;
        this.f89954i = arrayList2;
    }

    @Override // com.jumio.core.models.CredentialDataModel
    /* JADX INFO: renamed from: a */
    public final boolean mo14553a(Controller controller) {
        ArrayList arrayList;
        Intrinsics.checkNotNullParameter(controller, "controller");
        ArrayList arrayList2 = this.f89953h;
        if (arrayList2 != null && arrayList2.size() == 1 && (arrayList = this.f89954i) != null && arrayList.size() == 1) {
            DocumentModel documentModel = (DocumentModel) controller.getF13603d().get(DocumentModel.class);
            String code = (String) this.f89954i.get(0);
            synchronized (documentModel) {
                Intrinsics.checkNotNullParameter(code, "code");
                if (documentModel.m14556a(code) != null) {
                    return false;
                }
            }
        }
        return true;
    }
}
