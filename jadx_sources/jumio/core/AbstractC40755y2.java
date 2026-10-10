package jumio.core;

import com.jumio.core.Controller;
import com.jumio.core.models.ScanPartModel;
import com.jumio.core.scanpart.ScanPart;
import com.jumio.sdk.credentials.JumioCredential;
import com.jumio.sdk.enums.JumioCredentialPart;
import com.jumio.sdk.enums.JumioScanStep;
import com.jumio.sdk.interfaces.JumioScanPartInterface;
import java.io.Serializable;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: jumio.core.y2 */
/* JADX INFO: loaded from: classes61.dex */
public abstract class AbstractC40755y2 extends ScanPart {

    /* JADX INFO: renamed from: i */
    public final List f90485i;

    public final synchronized void switchToNextPart() {
        Object next;
        try {
            getF14546f().m14565a(getF14542b().getF14676b().f14197a, getScanPartModel().getF14312a());
            Iterator it = this.f90485i.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                ScanPartModel scanPartModel = (ScanPartModel) next;
                if (!Intrinsics.areEqual(scanPartModel, getScanPartModel()) && !scanPartModel.getHasData()) {
                    break;
                }
            }
            ScanPartModel scanPartModel2 = (ScanPartModel) next;
            if (scanPartModel2 != null) {
                setScanPartModel(scanPartModel2);
            }
            getF14546f().m14566b(getF14542b().getF14676b().f14197a, getScanPartModel().getF14312a());
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC40755y2(Controller controller, JumioCredential credential, List scanPartModelList, JumioScanPartInterface scanPartInterface) {
        super(controller, credential, (ScanPartModel) CollectionsKt.first(scanPartModelList), scanPartInterface);
        Intrinsics.checkNotNullParameter(controller, "controller");
        Intrinsics.checkNotNullParameter(credential, "credential");
        Intrinsics.checkNotNullParameter(scanPartModelList, "scanPartModelList");
        Intrinsics.checkNotNullParameter(scanPartInterface, "scanPartInterface");
        this.f90485i = CollectionsKt.toMutableList((Collection) scanPartModelList);
    }

    public static /* synthetic */ void updateScanPartModelList$default(AbstractC40755y2 abstractC40755y2, List list, JumioCredentialPart jumioCredentialPart, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateScanPartModelList");
        }
        if ((i11 & 2) != 0) {
            jumioCredentialPart = null;
        }
        abstractC40755y2.updateScanPartModelList(list, jumioCredentialPart);
    }

    public final boolean getAllPartsComplete() {
        List list = this.f90485i;
        if (list != null && list.isEmpty()) {
            return true;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (!((ScanPartModel) it.next()).isComplete()) {
                return false;
            }
        }
        return true;
    }

    public final boolean getAllPartsHaveImages() {
        List list = this.f90485i;
        if (list != null && list.isEmpty()) {
            return true;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (!((ScanPartModel) it.next()).getHasData()) {
                return false;
            }
        }
        return true;
    }

    public final boolean getHasNextPart() {
        List<ScanPartModel> list = this.f90485i;
        if (list != null && list.isEmpty()) {
            return false;
        }
        for (ScanPartModel scanPartModel : list) {
            if (!Intrinsics.areEqual(scanPartModel, getScanPartModel()) && !scanPartModel.getHasData()) {
                return true;
            }
        }
        return false;
    }

    @NotNull
    public final HashMap<String, Serializable> getModelData() {
        return ((ScanPartModel) this.f90485i.get(0)).getData();
    }

    @Nullable
    public final ScanPartModel getPartForId(@NotNull String id2) {
        Object next;
        Intrinsics.checkNotNullParameter(id2, "id");
        Iterator it = this.f90485i.iterator();
        while (it.hasNext()) {
            next = it.next();
            if (Intrinsics.areEqual(((ScanPartModel) next).getF14318g(), id2)) {
                return (ScanPartModel) next;
            }
        }
        next = null;
        return (ScanPartModel) next;
    }

    @NotNull
    public final List<ScanPartModel> getScanPartModelList() {
        return this.f90485i;
    }

    public final void updateScanPartModelList(@NotNull List<ScanPartModel> scanPartModelList, @Nullable JumioCredentialPart jumioCredentialPart) {
        Object next;
        Intrinsics.checkNotNullParameter(scanPartModelList, "scanPartModelList");
        List list = this.f90485i;
        list.clear();
        list.addAll(scanPartModelList);
        Iterator<T> it = scanPartModelList.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((ScanPartModel) next).getF14312a() != jumioCredentialPart);
        ScanPartModel scanPartModel = (ScanPartModel) next;
        if (scanPartModel == null) {
            scanPartModel = (ScanPartModel) CollectionsKt.first((List) scanPartModelList);
        }
        setScanPartModel(scanPartModel);
    }

    public final boolean getCurrentPartHasImage() {
        return getScanPartModel().getHasData();
    }

    @Nullable
    public final ScanPartModel getPartForSide(@NotNull String side) {
        Object next;
        Intrinsics.checkNotNullParameter(side, "side");
        Iterator it = this.f90485i.iterator();
        while (it.hasNext()) {
            next = it.next();
            String strName = ((ScanPartModel) next).getF14312a().name();
            String upperCase = side.toUpperCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
            if (Intrinsics.areEqual(strName, upperCase)) {
                return (ScanPartModel) next;
            }
        }
        next = null;
        return (ScanPartModel) next;
    }

    @Override // com.jumio.core.scanpart.ScanPart
    public void reset() {
        super.reset();
        Iterator it = this.f90485i.iterator();
        while (it.hasNext()) {
            ((ScanPartModel) it.next()).clear();
        }
    }

    @Override // com.jumio.core.scanpart.ScanPart
    public void restore() {
        int i11;
        super.restore();
        for (ScanPartModel scanPartModel : this.f90485i) {
            JumioScanStep f14316e = scanPartModel.getF14316e();
            if (f14316e == null) {
                i11 = -1;
            } else {
                i11 = AbstractC40750x2.f90469a[f14316e.ordinal()];
            }
            if (i11 != 1 && i11 != 2) {
                if (i11 == 3) {
                    setComplete(true);
                }
            } else {
                scanPartModel.setScanStep(JumioScanStep.SCAN_VIEW);
            }
        }
    }
}
