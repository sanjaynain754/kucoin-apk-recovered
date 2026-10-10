package jumio.core;

import com.jumio.core.Controller;
import com.jumio.core.handler.CheckHandler;
import com.jumio.core.interfaces.ConfirmationInterface;
import com.jumio.core.models.ScanPartModel;
import com.jumio.core.models.automation.AutomationModel;
import com.jumio.core.scanpart.JVisionScanPart;
import com.jumio.core.scanpart.ScanPart;
import com.jumio.sdk.credentials.JumioDocumentCredential;
import com.jumio.sdk.enums.JumioScanStep;
import com.jumio.sdk.handler.JumioConfirmationHandler;
import com.jumio.sdk.handler.JumioRejectHandler;
import com.jumio.sdk.interfaces.JumioScanPartInterface;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: jumio.core.j0 */
/* JADX INFO: loaded from: classes61.dex */
public abstract class AbstractC40678j0 extends JVisionScanPart implements ConfirmationInterface {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC40678j0(Controller controller, JumioDocumentCredential credential, List scanPartModelList, JumioScanPartInterface scanPartInterface) {
        super(controller, credential, scanPartModelList, scanPartInterface);
        Intrinsics.checkNotNullParameter(controller, "controller");
        Intrinsics.checkNotNullParameter(credential, "credential");
        Intrinsics.checkNotNullParameter(scanPartModelList, "scanPartModelList");
        Intrinsics.checkNotNullParameter(scanPartInterface, "scanPartInterface");
    }

    @Override // com.jumio.core.scanpart.JVisionScanPart
    public final void fillCheckHandler(Function2 addImagePath) {
        Intrinsics.checkNotNullParameter(addImagePath, "addImagePath");
        CheckHandler<?> internalCheckHandler = getInternalCheckHandler();
        if (internalCheckHandler instanceof JumioRejectHandler) {
            super.fillCheckHandler(addImagePath);
            return;
        }
        if (internalCheckHandler instanceof JumioConfirmationHandler) {
            List<ScanPartModel> scanPartModelList = getScanPartModelList();
            ArrayList<ScanPartModel> arrayList = new ArrayList();
            for (Object obj : scanPartModelList) {
                AutomationModel f14319h = ((ScanPartModel) obj).getF14319h();
                if ((f14319h != null ? f14319h.getDecisionType() : null) != AutomationModel.DecisionType.REJECT) {
                    arrayList.add(obj);
                }
            }
            for (ScanPartModel scanPartModel : arrayList) {
                addImagePath.invoke(scanPartModel.getF14312a(), scanPartModel.getF14314c().getData());
            }
        }
    }

    @Override // com.jumio.core.scanpart.JVisionScanPart
    public final boolean isSupportedCheckHandler(CheckHandler checkHandler) {
        Intrinsics.checkNotNullParameter(checkHandler, "checkHandler");
        return super.isSupportedCheckHandler(checkHandler) || (checkHandler instanceof JumioConfirmationHandler);
    }

    @Override // com.jumio.core.interfaces.ConfirmationInterface
    public final void confirm() {
        if (!(getInternalCheckHandler() instanceof JumioConfirmationHandler)) {
            return;
        }
        setComplete(true);
        ScanPart.sendScanStep$default(this, JumioScanStep.CAN_FINISH, null, null, 6, null);
        CheckHandler<?> internalCheckHandler = getInternalCheckHandler();
        if (internalCheckHandler != null) {
            internalCheckHandler.detach$jumio_core_release();
        }
        setInternalCheckHandler(null);
    }

    @Override // com.jumio.core.scanpart.JVisionScanPart
    public final void retryScanParts() {
        Iterator<T> it = getScanPartModelList().iterator();
        while (it.hasNext()) {
            ((ScanPartModel) it.next()).clear();
        }
        setScanPartModel((ScanPartModel) CollectionsKt.first((List) getScanPartModelList()));
    }
}
