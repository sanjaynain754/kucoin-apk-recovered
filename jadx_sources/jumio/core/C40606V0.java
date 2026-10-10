package jumio.core;

import com.jumio.core.Controller;
import com.jumio.core.models.ScanPartModel;
import com.jumio.sdk.credentials.JumioDocumentCredential;
import com.jumio.sdk.interfaces.JumioScanPartInterface;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: jumio.core.V0 */
/* JADX INFO: loaded from: classes61.dex */
public final class C40606V0 extends AbstractC40678j0 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C40606V0(Controller controller, JumioDocumentCredential credential, ScanPartModel scanPartModel, JumioScanPartInterface scanPartInterface) {
        super(controller, credential, CollectionsKt.listOf(scanPartModel), scanPartInterface);
        Intrinsics.checkNotNullParameter(controller, "controller");
        Intrinsics.checkNotNullParameter(credential, "credential");
        Intrinsics.checkNotNullParameter(scanPartModel, "scanPartModel");
        Intrinsics.checkNotNullParameter(scanPartInterface, "scanPartInterface");
    }
}
