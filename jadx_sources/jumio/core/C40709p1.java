package jumio.core;

import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.os.ParcelFileDescriptor;
import com.jumio.commons.log.Log;
import com.jumio.core.C9301R;
import com.jumio.core.Controller;
import com.jumio.core.MobileContext;
import com.jumio.core.api.calls.UploadCall;
import com.jumio.core.api.calls.UsabilityCall;
import com.jumio.core.constants.ConstantsKt;
import com.jumio.core.data.digitaldocument.DigitalDocumentPart;
import com.jumio.core.data.scan.DataState;
import com.jumio.core.data.scan.FileDataInterface;
import com.jumio.core.handler.CheckHandler;
import com.jumio.core.interfaces.ConfirmationInterface;
import com.jumio.core.interfaces.UploadFileInterface$Companion;
import com.jumio.core.interfaces.UsabilityInterface;
import com.jumio.core.models.ApiCallDataModel;
import com.jumio.core.models.DigitalIdScanPartModel;
import com.jumio.core.models.DocumentScanPartModel;
import com.jumio.core.models.ScanPartModel;
import com.jumio.core.models.SettingsModel;
import com.jumio.core.models.automation.AutomationModel;
import com.jumio.core.network.ApiBinding;
import com.jumio.core.scanpart.ScanPart;
import com.jumio.sdk.credentials.JumioCredential;
import com.jumio.sdk.credentials.JumioDocumentCredential;
import com.jumio.sdk.enums.JumioCredentialPart;
import com.jumio.sdk.enums.JumioScanMode;
import com.jumio.sdk.enums.JumioScanStep;
import com.jumio.sdk.handler.JumioConfirmationHandler;
import com.jumio.sdk.handler.JumioRejectHandler;
import com.jumio.sdk.interfaces.JumioScanPartInterface;
import com.jumio.sdk.retry.JumioRetryReason;
import com.jumio.sdk.views.JumioAnimationView;
import com.jumio.sdk.views.JumioFileAttacher;
import java.io.File;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;
import p852kotlin.Pair;
import p852kotlin.TuplesKt;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.collections.MapsKt;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: jumio.core.p1 */
/* JADX INFO: loaded from: classes61.dex */
public final class C40709p1 extends ScanPart implements InterfaceC40671h3, ConfirmationInterface, ApiBinding, InterfaceC40694m1, UsabilityInterface {

    /* JADX INFO: renamed from: i */
    public CheckHandler f90347i;

    /* JADX INFO: renamed from: j */
    public int f90348j;

    /* JADX INFO: renamed from: k */
    public InterfaceC40614W3 f90349k;

    /* JADX INFO: renamed from: l */
    public final List f90350l;

    /* JADX INFO: renamed from: m */
    public final boolean f90351m;

    /* JADX INFO: renamed from: n */
    public final JumioScanMode f90352n;

    /* JADX INFO: renamed from: o */
    public final JumioFileAttacher.JumioFileRequirements f90353o;

    /* JADX INFO: renamed from: a */
    public final void m89262a() {
        CheckHandler checkHandler = this.f90347i;
        if (checkHandler != null) {
            checkHandler.detach$jumio_core_release();
        }
        try {
            InterfaceC40614W3 interfaceC40614W3 = this.f90349k;
            if (interfaceC40614W3 != null) {
                interfaceC40614W3.mo89189c();
            }
        } catch (Exception e11) {
            Log.printStackTrace(e11);
        }
    }

    @Override // com.jumio.core.scanpart.ScanPart
    public final boolean getHasFallback() {
        return false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C40709p1(Controller controller, JumioCredential credential, ScanPartModel scanPartModel, JumioScanPartInterface scanPartInterface) {
        Integer maxPages;
        super(controller, credential, scanPartModel, scanPartInterface);
        Intrinsics.checkNotNullParameter(controller, "controller");
        Intrinsics.checkNotNullParameter(credential, "credential");
        Intrinsics.checkNotNullParameter(scanPartModel, "scanPartModel");
        Intrinsics.checkNotNullParameter(scanPartInterface, "scanPartInterface");
        this.f90350l = CollectionsKt.mutableListOf(scanPartModel);
        this.f90351m = true;
        this.f90352n = JumioScanMode.FILE;
        List listListOf = getF14542b() instanceof JumioDocumentCredential ? CollectionsKt.listOf((Object[]) new String[]{ConstantsKt.MIME_TYPE_PDF, "image/png", "image/jpeg", "image/webp"}) : CollectionsKt.listOf(ConstantsKt.MIME_TYPE_PDF);
        int maxFileUploadSize = ((SettingsModel) controller.getF13603d().get(SettingsModel.class)).getMaxFileUploadSize();
        ScanPartModel scanPartModel2 = getScanPartModel();
        int f13797c = scanPartModel2 instanceof DocumentScanPartModel ? ((DocumentScanPartModel) scanPartModel2).f14241m.getF13797c() : (!(scanPartModel2 instanceof DigitalIdScanPartModel) || (maxPages = ((DigitalDocumentPart) CollectionsKt.first((List) ((DigitalIdScanPartModel) scanPartModel2).getParts())).getF13774c().getMaxPages()) == null) ? 30 : maxPages.intValue();
        ScanPartModel scanPartModel3 = getScanPartModel();
        this.f90353o = new JumioFileAttacher.JumioFileRequirements(listListOf, maxFileUploadSize, f13797c, scanPartModel3 instanceof DigitalIdScanPartModel ? ((DigitalDocumentPart) CollectionsKt.first((List) ((DigitalIdScanPartModel) scanPartModel3).getParts())).getF13774c().getUrl() : null);
    }

    /* JADX INFO: renamed from: b */
    public final void m89264b() {
        List<ScanPartModel> list = this.f90350l;
        ArrayList arrayList = new ArrayList();
        for (ScanPartModel scanPartModel : list) {
            AutomationModel f14319h = scanPartModel.getF14319h();
            Pair pairM90091to = null;
            if (f14319h != null) {
                if (f14319h.getDecisionType() != AutomationModel.DecisionType.REJECT) {
                    f14319h = null;
                }
                if (f14319h != null) {
                    pairM90091to = TuplesKt.m90091to(scanPartModel.getF14312a(), f14319h);
                }
            }
            if (pairM90091to != null) {
                arrayList.add(pairM90091to);
            }
        }
        Map map = MapsKt.toMap(arrayList);
        if (map.isEmpty()) {
            setComplete(true);
            ScanPart.sendScanStep$default(this, JumioScanStep.CAN_FINISH, null, null, 6, null);
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(MapsKt.mapCapacity(map.size()));
        for (Map.Entry entry : map.entrySet()) {
            linkedHashMap.put(entry.getKey(), ((AutomationModel) entry.getValue()).getRejectReason().getCode());
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(MapsKt.mapCapacity(linkedHashMap.size()));
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            linkedHashMap2.put(((JumioCredentialPart) entry2.getKey()).name(), entry2.getValue());
        }
        sendScanStep(JumioScanStep.REJECT_VIEW, linkedHashMap, linkedHashMap2);
    }

    @Override // com.jumio.core.interfaces.ConfirmationInterface
    public final void confirm() {
        CheckHandler checkHandler = this.f90347i;
        if (checkHandler == null || !(checkHandler instanceof JumioConfirmationHandler)) {
            return;
        }
        getScanPartModel().setUsability(getShouldEnableUsability());
        ScanPart.sendScanStep$default(this, JumioScanStep.PROCESSING, null, null, 6, null);
        getF14541a().getF13604e().uploadPart(getF14542b(), getScanPartModel());
        CheckHandler checkHandler2 = this.f90347i;
        if (checkHandler2 != null) {
            checkHandler2.detach$jumio_core_release();
        }
        this.f90347i = null;
    }

    @Override // com.jumio.core.network.ApiBinding
    public final Class[] getBindingClasses() {
        return new Class[]{UploadCall.class, UsabilityCall.class};
    }

    @Override // com.jumio.core.scanpart.ScanPart
    public final void getHelpAnimation(JumioAnimationView animationView) {
        Intrinsics.checkNotNullParameter(animationView, "animationView");
    }

    @Override // com.jumio.core.interfaces.UsabilityInterface
    public final List getMultipartItemsForResultKeys(ApiCallDataModel apiCallDataModel) {
        Intrinsics.checkNotNullParameter(apiCallDataModel, "apiCallDataModel");
        return Intrinsics.areEqual(apiCallDataModel.getF14175c(), getScanPartModel().getF14312a().name()) ? CollectionsKt.listOf(new C40635a4(getScanPartModel().getF14314c().getFileName(), getScanPartModel().getF14312a().name())) : CollectionsKt.emptyList();
    }

    @Override // com.jumio.core.scanpart.ScanPart
    public final JumioScanMode getScanMode() {
        return this.f90352n;
    }

    @Override // com.jumio.core.scanpart.ScanPart
    public final boolean isCancelable() {
        return this.f90351m;
    }

    @Override // com.jumio.core.network.ApiBinding, jumio.core.InterfaceC40662g
    public final void onError(ApiCallDataModel apiCallDataModel, Throwable th2) {
        Intrinsics.checkNotNullParameter(apiCallDataModel, "apiCallDataModel");
        Class call = apiCallDataModel.getCall();
        if (Intrinsics.areEqual(call, UploadCall.class)) {
            getF14541a().onError(th2, apiCallDataModel.getCall());
        } else if (Intrinsics.areEqual(call, UsabilityCall.class)) {
            getF14541a().onError(th2, apiCallDataModel.getCall());
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0077  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Iterable, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.util.ArrayList] */
    @Override // com.jumio.core.network.ApiBinding, jumio.core.InterfaceC40662g
    public final void onResult(ApiCallDataModel apiCallDataModel, Object obj) {
        ?? EmptyList;
        Intrinsics.checkNotNullParameter(apiCallDataModel, "apiCallDataModel");
        Class call = apiCallDataModel.getCall();
        if (!Intrinsics.areEqual(call, UploadCall.class)) {
            if (Intrinsics.areEqual(call, UsabilityCall.class) && (getScanPartModel() instanceof DigitalIdScanPartModel)) {
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.jumio.core.models.automation.AutomationModel");
                getScanPartModel().setAutomationModel((AutomationModel) obj);
                getScanPartModel().setDataState(apiCallDataModel.getF14175c(), DataState.UPLOADED);
                m89264b();
                return;
            }
            return;
        }
        if (!(getScanPartModel() instanceof DigitalIdScanPartModel)) {
            setComplete(true);
            getScanPartModel().setAutomationModel(new AutomationModel(null, null, null, null, null, 31, null));
            ScanPart.sendScanStep$default(this, JumioScanStep.CAN_FINISH, null, null, 6, null);
            return;
        }
        getScanPartModel().setUsability(getShouldEnableUsability());
        JSONObject jSONObject = obj instanceof JSONObject ? (JSONObject) obj : null;
        if (jSONObject == null) {
            EmptyList = CollectionsKt.emptyList();
        } else {
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("usabilityResultKeys");
            if (jSONObjectOptJSONObject != null) {
                List<C40635a4> multipartItemsForResultKeys = getMultipartItemsForResultKeys(apiCallDataModel);
                EmptyList = new ArrayList();
                for (C40635a4 c40635a4 : multipartItemsForResultKeys) {
                    String strOptString = jSONObjectOptJSONObject.optString(c40635a4.f90217a);
                    if (strOptString == null || strOptString.length() == 0) {
                        strOptString = null;
                    }
                    C40711p3 c40711p3 = strOptString == null ? null : new C40711p3(strOptString, c40635a4.f90218b);
                    if (c40711p3 != null) {
                        EmptyList.add(c40711p3);
                    }
                }
            } else {
                EmptyList = CollectionsKt.emptyList();
            }
            if (EmptyList == 0) {
                EmptyList = CollectionsKt.emptyList();
            }
        }
        if (!getShouldEnableUsability() || EmptyList.isEmpty()) {
            getScanPartModel().setAutomationModel(new AutomationModel(null, null, null, null, null, 31, null));
            getScanPartModel().setDataState(apiCallDataModel.getF14175c(), DataState.UPLOADED);
            m89264b();
        } else {
            for (C40711p3 c40711p4 : EmptyList) {
                getF14541a().getF13604e().usability(c40711p4.f90355a, apiCallDataModel.getF14174b(), c40711p4.f90356b);
            }
        }
    }

    @Override // jumio.core.InterfaceC40671h3
    public final void reject() {
        if (this.f90347i == null) {
            return;
        }
        MobileContext context = getF14541a().getF13601b();
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter("Jumio03", "key");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter("Jumio03", "key");
        int i11 = context.getSharedPreferences("Jumio01", 0).getInt("Jumio03", 0) + 1;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter("Jumio03", "key");
        SharedPreferences sharedPreferences = context.getSharedPreferences("Jumio01", 0);
        Intrinsics.checkNotNullExpressionValue(sharedPreferences, "getSharedPreferences(...)");
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        editorEdit.putInt("Jumio03", i11);
        editorEdit.apply();
        this.f90348j++;
        getScanPartModel().clear();
        CheckHandler checkHandler = this.f90347i;
        if (checkHandler != null) {
            checkHandler.detach$jumio_core_release();
        }
        this.f90347i = null;
        ScanPart.sendScanStep$default(this, JumioScanStep.ATTACH_FILE, null, null, 6, null);
    }

    @Override // com.jumio.core.scanpart.ScanPart
    public final void retry(JumioRetryReason reason) {
        Intrinsics.checkNotNullParameter(reason, "reason");
        super.retry(reason);
        ScanPart.sendScanStep$default(this, JumioScanStep.ATTACH_FILE, null, null, 6, null);
    }

    @Override // jumio.core.InterfaceC40668h0
    public final void setCheckHandler(CheckHandler checkHandler) {
        Bitmap bitmapMo89188b;
        Intrinsics.checkNotNullParameter(checkHandler, "checkHandler");
        if (checkHandler.isValidForScanStep$jumio_core_release(getScanPartModel().getF14316e()) || !((checkHandler instanceof JumioRejectHandler) || (checkHandler instanceof JumioConfirmationHandler))) {
            CheckHandler checkHandler2 = this.f90347i;
            if (checkHandler2 != checkHandler) {
                if (checkHandler2 != null) {
                    checkHandler2.detach$jumio_core_release();
                }
                this.f90347i = checkHandler;
            }
            InterfaceC40614W3 interfaceC40614W3 = this.f90349k;
            if (interfaceC40614W3 == null || (bitmapMo89188b = interfaceC40614W3.mo89188b()) == null) {
                return;
            }
            checkHandler.addBitmap$jumio_core_release(getScanPartModel().getF14312a(), bitmapMo89188b);
        }
    }

    @Override // com.jumio.core.scanpart.ScanPart
    public final void cancel() {
        super.cancel();
        reset();
        m89262a();
    }

    @Override // com.jumio.core.scanpart.ScanPart
    public final void finish() {
        m89262a();
        super.finish();
    }

    @Override // com.jumio.core.interfaces.UsabilityInterface
    public final boolean getShouldEnableUsability() {
        if (((SettingsModel) getF14541a().getF13603d().get(SettingsModel.class)).isInstantFeedbackEnabled() && this.f90348j < ((SettingsModel) getF14541a().getF13603d().get(SettingsModel.class)).getAutomationMaxRetries()) {
            return true;
        }
        return false;
    }

    @Override // com.jumio.core.scanpart.ScanPart
    public final void start() {
        super.start();
        getScanPartModel().setUsability(getShouldEnableUsability());
        ScanPart.sendScanStep$default(this, JumioScanStep.ATTACH_FILE, null, null, 6, null);
    }

    /* JADX INFO: renamed from: a */
    public final void m89263a(ParcelFileDescriptor parcelFileDescriptor) {
        int iIntValue;
        Integer maxPages;
        try {
            m89262a();
            InterfaceC40614W3 interfaceC40614W3CreateFromFile = UploadFileInterface$Companion.f14160a.createFromFile(parcelFileDescriptor);
            if (interfaceC40614W3CreateFromFile != null) {
                this.f90349k = interfaceC40614W3CreateFromFile;
                int maxFileUploadSize = ((SettingsModel) getF14541a().getF13603d().get(SettingsModel.class)).getMaxFileUploadSize();
                ScanPartModel scanPartModel = getScanPartModel();
                if (scanPartModel instanceof DocumentScanPartModel) {
                    iIntValue = ((DocumentScanPartModel) scanPartModel).f14241m.getF13797c();
                } else {
                    iIntValue = (!(scanPartModel instanceof DigitalIdScanPartModel) || (maxPages = ((DigitalDocumentPart) CollectionsKt.first((List) ((DigitalIdScanPartModel) scanPartModel).getParts())).getF13774c().getMaxPages()) == null) ? 30 : maxPages.intValue();
                }
                JumioRetryReason jumioRetryReasonMo89185a = interfaceC40614W3CreateFromFile.mo89185a(maxFileUploadSize, iIntValue, getF14541a().getF13601b());
                if (jumioRetryReasonMo89185a != null) {
                    ScanPart.sendScanStep$default(this, JumioScanStep.RETRY, jumioRetryReasonMo89185a, null, 4, null);
                    return;
                }
                getScanPartModel().clear();
                File fileMo89186a = interfaceC40614W3CreateFromFile.mo89186a(parcelFileDescriptor, getF14541a().getF13600a().getF14185c(), getF14541a().getF13601b());
                if (this.f90349k instanceof C40592S1) {
                    FileDataInterface f14314c = getScanPartModel().getF14314c();
                    EnumC40587R1 enumC40587R1 = EnumC40587R1.JPEG;
                    f14314c.setMimeType("image/webp");
                    getScanPartModel().getF14314c().setFileType(ConstantsKt.FILE_TYPE_WEBP);
                } else {
                    getScanPartModel().getF14314c().setMimeType(interfaceC40614W3CreateFromFile.getMimeType());
                    getScanPartModel().getF14314c().setFileType(interfaceC40614W3CreateFromFile.mo89187a());
                }
                FileDataInterface f14314c2 = getScanPartModel().getF14314c();
                String absolutePath = fileMo89186a.getAbsolutePath();
                Intrinsics.checkNotNullExpressionValue(absolutePath, "getAbsolutePath(...)");
                f14314c2.setData(absolutePath);
                ScanPart.sendScanStep$default(this, JumioScanStep.CONFIRMATION_VIEW, null, null, 6, null);
                return;
            }
            throw new Exception("Document not readable.");
        } catch (SecurityException unused) {
            m89262a();
            JumioScanStep jumioScanStep = JumioScanStep.RETRY;
            String string = getF14541a().getF13601b().getString(C9301R.string.jumio_dv_retry_encrypted);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            ScanPart.sendScanStep$default(this, jumioScanStep, new JumioRetryReason(402, string), null, 4, null);
        } catch (Exception unused2) {
            m89262a();
            JumioScanStep jumioScanStep2 = JumioScanStep.RETRY;
            String string2 = getF14541a().getF13601b().getString(C9301R.string.jumio_dv_retry_selected_file_cannot_be_processed);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            ScanPart.sendScanStep$default(this, jumioScanStep2, new JumioRetryReason(401, string2), null, 4, null);
        }
    }
}
