package jumio.core;

import com.jumio.core.Controller;
import com.jumio.core.models.CountryDocumentModel;
import com.jumio.core.models.CredentialDataModel;
import com.jumio.sdk.credentials.JumioCredentialCategory;
import com.jumio.sdk.document.JumioDocument;
import com.jumio.sdk.document.JumioLookupResult;
import java.util.ArrayList;
import java.util.List;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: jumio.core.G0 */
/* JADX INFO: loaded from: classes61.dex */
public final class C40532G0 extends CredentialDataModel {

    /* JADX INFO: renamed from: h */
    public final ArrayList f89969h;

    /* JADX INFO: renamed from: i */
    public final ArrayList f89970i;

    /* JADX INFO: renamed from: j */
    public final C40685k2 f89971j;

    /* JADX INFO: renamed from: k */
    public String f89972k;

    /* JADX INFO: renamed from: l */
    public JumioDocument f89973l;

    @Override // com.jumio.core.models.CredentialDataModel
    /* JADX INFO: renamed from: a */
    public final boolean mo14552a() {
        C40685k2 c40685k2 = this.f89971j;
        JumioLookupResult jumioLookupResult = c40685k2.f90312a;
        return ((jumioLookupResult != null ? jumioLookupResult.getDocumentType() : null) != null && Intrinsics.areEqual(c40685k2.f90313b, Boolean.TRUE)) || super.mo14552a();
    }

    public C40532G0(String id2, List capabilities, ArrayList arrayList, ArrayList arrayList2, List requiredParts, int i11) {
        C40685k2 lookupResult = new C40685k2();
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(capabilities, "capabilities");
        Intrinsics.checkNotNullParameter(requiredParts, "requiredParts");
        Intrinsics.checkNotNullParameter(lookupResult, "lookupResult");
        super(id2, JumioCredentialCategory.ID, capabilities, requiredParts, i11);
        this.f89969h = arrayList;
        this.f89970i = arrayList2;
        this.f89971j = lookupResult;
    }

    @Override // com.jumio.core.models.CredentialDataModel
    /* JADX INFO: renamed from: a */
    public final boolean mo14553a(Controller controller) {
        Intrinsics.checkNotNullParameter(controller, "controller");
        return ((CountryDocumentModel) controller.getF13603d().get(CountryDocumentModel.class)).f14196a.getCountries().isEmpty();
    }
}
