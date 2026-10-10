package jumio.core;

import com.jumio.commons.log.Log;
import com.jumio.core.Controller;
import com.jumio.core.enums.ErrorCase;
import com.jumio.core.error.Error;
import com.jumio.core.models.NfcSettingsModel;
import com.jumio.core.models.SettingsModel;
import com.jumio.core.models.TimeModel;
import com.jumio.core.models.UploadSettingsModel;
import org.json.JSONObject;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: jumio.core.r0 */
/* JADX INFO: loaded from: classes61.dex */
public final class C40718r0 extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Object f90381a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Controller f90382b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C40718r0(Controller controller, Object obj, Continuation continuation) {
        super(2, continuation);
        this.f90381a = obj;
        this.f90382b = controller;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C40718r0(this.f90382b, this.f90381a, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Object obj3 = this.f90381a;
        return new C40718r0(this.f90382b, obj3, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        try {
            Object obj2 = this.f90381a;
            JSONObject jSONObject = obj2 instanceof JSONObject ? (JSONObject) obj2 : null;
            if (jSONObject == null) {
                return Unit.INSTANCE;
            }
            this.f90382b.getF13603d().put(SettingsModel.class, SettingsModel.INSTANCE.fromJson(jSONObject));
            this.f90382b.f13603d.put(TimeModel.class, TimeModel.Companion.fromJson$default(TimeModel.INSTANCE, jSONObject, 0L, 2, null));
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("configurations");
            if (jSONObjectOptJSONObject != null) {
                Controller controller = this.f90382b;
                Controller.access$setupTimeouts(controller, jSONObjectOptJSONObject);
                Controller.access$setupLivenessSettings(controller, jSONObjectOptJSONObject);
                Controller.access$setupCameraData(controller, jSONObjectOptJSONObject);
                Controller.access$setupDocfinderSettings(controller, jSONObjectOptJSONObject);
                Controller.access$setupCDNFeatures(controller, jSONObjectOptJSONObject);
                controller.f13603d.put(UploadSettingsModel.class, UploadSettingsModel.INSTANCE.fromJson(jSONObjectOptJSONObject));
                Controller.access$setupSupplementalImages(controller, jSONObjectOptJSONObject);
                Controller.access$setupCameraChallenge(controller, jSONObjectOptJSONObject);
            }
            this.f90382b.f13603d.put(NfcSettingsModel.class, NfcSettingsModel.INSTANCE.fromJson(jSONObject));
            Controller.access$setupDocuments(this.f90382b, jSONObject);
            Controller.access$setupCountryDocuments(this.f90382b, jSONObject);
            Controller.access$setupConsent(this.f90382b, jSONObject);
            Controller.access$setupLegalStatements(this.f90382b, jSONObject);
            Controller.access$setupTermsOfUse(this.f90382b, jSONObject);
            Controller.access$setupCredentials(this.f90382b, jSONObject);
            Controller.access$setupInitiateModel(this.f90382b, jSONObject);
            if (!((SettingsModel) this.f90382b.getF13603d().get(SettingsModel.class)).getSkipStartScreen() || Controller.access$isModelPreloaded(this.f90382b)) {
                this.f90382b.m14488a();
            } else {
                Controller.access$scheduleWorkflow(this.f90382b);
            }
            return Unit.INSTANCE;
        } catch (Exception e11) {
            Log.printStackTrace(e11);
            Controller.onError$default(this.f90382b, new Error(ErrorCase.PROCESS_CANT_BE_COMPLETED, 1, 0), null, 2, null);
        }
    }
}
