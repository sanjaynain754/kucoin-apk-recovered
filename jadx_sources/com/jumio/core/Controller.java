package com.jumio.core;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import com.google.firebase.messaging.Constants;
import com.jumio.analytics.Analytics;
import com.jumio.analytics.AnalyticsModel;
import com.jumio.analytics.MetaInfo;
import com.jumio.analytics.MobileEvents;
import com.jumio.commons.log.Log;
import com.jumio.commons.log.LogUtils;
import com.jumio.commons.utils.DeviceRotationManager;
import com.jumio.commons.utils.FileUtil;
import com.jumio.core.api.BackendManager;
import com.jumio.core.api.calls.SettingsCall;
import com.jumio.core.camera.CameraDataSettingsModel;
import com.jumio.core.cdn.CDNFeatureModel;
import com.jumio.core.data.ScanMode;
import com.jumio.core.data.document.DefaultCountryDocumentProvider;
import com.jumio.core.enums.ErrorCase;
import com.jumio.core.environment.Environment;
import com.jumio.core.error.Error;
import com.jumio.core.extraction.liveness.extraction.LivenessDataModel;
import com.jumio.core.models.AdditionalDataPointsModel;
import com.jumio.core.models.ApiCallDataModel;
import com.jumio.core.models.AuthorizationModel;
import com.jumio.core.models.CameraChallengeModel;
import com.jumio.core.models.ConsentModel;
import com.jumio.core.models.CountryDocumentModel;
import com.jumio.core.models.CredentialDataModel;
import com.jumio.core.models.CredentialsModel;
import com.jumio.core.models.DocfinderSettingsModel;
import com.jumio.core.models.DocumentModel;
import com.jumio.core.models.FaceScanPartModel;
import com.jumio.core.models.InitiateModel;
import com.jumio.core.models.LegalStatementModel;
import com.jumio.core.models.LivenessSettingsModel;
import com.jumio.core.models.ReportingModel;
import com.jumio.core.models.ScanPartModel;
import com.jumio.core.models.SettingsModel;
import com.jumio.core.models.SupplementalImageModel;
import com.jumio.core.models.TermsOfUseModel;
import com.jumio.core.models.TimeoutModel;
import com.jumio.core.network.ApiBinding;
import com.jumio.core.network.ApiCall;
import com.jumio.core.persistence.DataManager;
import com.jumio.core.plugins.ExtractionPlugin;
import com.jumio.core.plugins.PluginRegistryInterface;
import com.jumio.core.plugins.ScanPartPlugin;
import com.jumio.core.scope.ScopeProviderInterface;
import com.jumio.core.util.LocaleUtil;
import com.jumio.core.util.LocaleUtilKt;
import com.jumio.core.util.ReflectionUtil;
import com.jumio.sdk.JumioSDK;
import com.jumio.sdk.consent.JumioConsentItem;
import com.jumio.sdk.credentials.JumioCredential;
import com.jumio.sdk.credentials.JumioCredentialCategory;
import com.jumio.sdk.credentials.JumioCredentialInfo;
import com.jumio.sdk.enums.JumioCredentialPart;
import com.jumio.sdk.enums.JumioScanMode;
import com.jumio.sdk.error.JumioError;
import com.jumio.sdk.exceptions.SDKNotConfiguredException;
import com.jumio.sdk.interfaces.JumioControllerInterface;
import com.jumio.sdk.interfaces.JumioScanPartInterface;
import com.jumio.sdk.result.JumioCredentialResult;
import com.jumio.sdk.result.JumioFaceResult;
import com.jumio.sdk.result.JumioIDResult;
import com.jumio.sdk.result.JumioImageData;
import com.jumio.sdk.result.JumioResult;
import com.jumio.sdk.scanpart.JumioScanPart;
import com.pichillilorenzo.flutter_inappwebview_android.credential_database.URLCredentialContract;
import com.sensorsdata.analytics.android.sdk.data.adapter.DbParams;
import com.tencent.bugly.proguard.InterfaceC33730j9;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import jumio.core.AbstractC40547J0;
import jumio.core.AbstractC40683k0;
import jumio.core.AbstractC40693m0;
import jumio.core.AbstractC40716q3;
import jumio.core.AbstractC40753y0;
import jumio.core.C40559L2;
import jumio.core.C40579P2;
import jumio.core.C40659f1;
import jumio.core.C40669h1;
import jumio.core.C40686k3;
import jumio.core.C40688l0;
import jumio.core.C40698n0;
import jumio.core.C40703o0;
import jumio.core.C40708p0;
import jumio.core.C40713q0;
import jumio.core.C40714q1;
import jumio.core.C40718r0;
import jumio.core.C40719r1;
import jumio.core.C40723s0;
import jumio.core.C40728t0;
import jumio.core.C40733u0;
import jumio.core.C40748x0;
import jumio.core.EnumC40613W2;
import jumio.core.EnumC40670h2;
import kotlinx.coroutines.C41686h;
import kotlinx.coroutines.C41690i;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.InterfaceC41775x1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p852kotlin.Metadata;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.Pair;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.jvm.JvmClassMappingKt;
import p852kotlin.jvm.internal.ArrayIteratorKt;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.p407io.CloseableKt;
import p852kotlin.reflect.KClass;

/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000\u0080\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B+\b\u0010\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bB-\b\u0010\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\n\u0010\u0010J\u0018\u0010M\u001a\u00020N2\u0006\u0010O\u001a\u00020B2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J \u0010P\u001a\u00020N2\u0006\u0010O\u001a\u00020B2\u0006\u0010Q\u001a\u00020R2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\u000e\u0010S\u001a\u00020N2\u0006\u0010T\u001a\u00020\rJ\u000e\u0010U\u001a\u00020N2\u0006\u0010V\u001a\u000207J\u0010\u0010W\u001a\u00020N2\u0006\u0010X\u001a\u000207H\u0002J\b\u0010Y\u001a\u00020NH\u0002J\b\u0010Z\u001a\u00020NH\u0002J\u000e\u0010\\\u001a\u00020N2\u0006\u0010]\u001a\u000203J\u0006\u0010^\u001a\u00020NJ\u0006\u0010_\u001a\u00020NJ\f\u0010`\u001a\b\u0012\u0004\u0012\u00020b0aJ\u0016\u0010c\u001a\u00020N2\u0006\u0010d\u001a\u00020b2\u0006\u0010e\u001a\u000207J\u000e\u0010f\u001a\u00020B2\u0006\u0010g\u001a\u00020hJ\u0015\u0010i\u001a\u00020N2\u0006\u0010O\u001a\u00020BH\u0000¢\u0006\u0002\bjJ.\u0010k\u001a\u00020N2$\b\u0002\u0010l\u001a\u001e\u0012\u0004\u0012\u00020n\u0012\u0004\u0012\u00020o0mj\u000e\u0012\u0004\u0012\u00020n\u0012\u0004\u0012\u00020o`pH\u0002J4\u0010q\u001a\u00020o2\"\u0010l\u001a\u001e\u0012\u0004\u0012\u00020n\u0012\u0004\u0012\u00020o0mj\u000e\u0012\u0004\u0012\u00020n\u0012\u0004\u0012\u00020o`p2\u0006\u0010O\u001a\u00020rH\u0002J \u0010s\u001a\u00020N2\u0006\u0010t\u001a\u00020o2\u0006\u0010O\u001a\u00020r2\u0006\u0010u\u001a\u00020vH\u0002J\b\u0010w\u001a\u00020NH\u0002J\u001e\u0010x\u001a\u00020N2\b\u0010]\u001a\u0004\u0018\u00010y2\f\b\u0002\u0010z\u001a\u0006\u0012\u0002\b\u00030=J\u000e\u0010{\u001a\u00020N2\u0006\u0010|\u001a\u000207J\u0010\u0010}\u001a\u00020N2\u0006\u0010|\u001a\u000207H\u0002J \u0010~\u001a\u00020N2\u000b\u0010\u007f\u001a\u0007\u0012\u0002\b\u00030\u0080\u00012\t\u0010t\u001a\u0005\u0018\u00010\u0081\u0001H\u0016J\u001b\u0010\u0082\u0001\u001a\u00020N2\t\u0010t\u001a\u0005\u0018\u00010\u0081\u0001H\u0082@¢\u0006\u0003\u0010\u0083\u0001J\u0014\u0010\u0084\u0001\u001a\u00020N2\t\u0010t\u001a\u0005\u0018\u00010\u0081\u0001H\u0002J\u0012\u0010\u0085\u0001\u001a\u00020N2\u0007\u0010\f\u001a\u00030\u0086\u0001H\u0002J\u0012\u0010\u0087\u0001\u001a\u00020N2\u0007\u0010\f\u001a\u00030\u0086\u0001H\u0002J\u0012\u0010\u0088\u0001\u001a\u00020N2\u0007\u0010\f\u001a\u00030\u0086\u0001H\u0002J\u0013\u0010\u0089\u0001\u001a\u00020N2\b\u0010\u008a\u0001\u001a\u00030\u0086\u0001H\u0002J\u0013\u0010\u008b\u0001\u001a\u00020N2\b\u0010\u008a\u0001\u001a\u00030\u0086\u0001H\u0002J\u0012\u0010\u008c\u0001\u001a\u00020N2\u0007\u0010\f\u001a\u00030\u0086\u0001H\u0002J\u0013\u0010\u008d\u0001\u001a\u00020N2\b\u0010\u008a\u0001\u001a\u00030\u0086\u0001H\u0002J\u0013\u0010\u008e\u0001\u001a\u00020N2\b\u0010\u008a\u0001\u001a\u00030\u0086\u0001H\u0002J\u0013\u0010\u008f\u0001\u001a\u00020N2\b\u0010\u008a\u0001\u001a\u00030\u0086\u0001H\u0002J\u0013\u0010\u0090\u0001\u001a\u00020N2\b\u0010\u008a\u0001\u001a\u00030\u0086\u0001H\u0002J\u0013\u0010\u0091\u0001\u001a\u00020N2\b\u0010\u008a\u0001\u001a\u00030\u0086\u0001H\u0002J\u0013\u0010\u0092\u0001\u001a\u00020N2\b\u0010\u008a\u0001\u001a\u00030\u0086\u0001H\u0002J\u0012\u0010\u0093\u0001\u001a\u00020N2\u0007\u0010\f\u001a\u00030\u0086\u0001H\u0002J\u0012\u0010\u0094\u0001\u001a\u00020N2\u0007\u0010\f\u001a\u00030\u0086\u0001H\u0002J\u0013\u0010\u0095\u0001\u001a\u00030\u0096\u00012\u0007\u0010\f\u001a\u00030\u0086\u0001H\u0002J\u0012\u0010\u0097\u0001\u001a\u00020N2\u0007\u0010\f\u001a\u00030\u0086\u0001H\u0002J\u0012\u0010\u0098\u0001\u001a\u00020N2\u0007\u0010\f\u001a\u00030\u0086\u0001H\u0002J\u001f\u0010x\u001a\u00020N2\u000b\u0010\u007f\u001a\u0007\u0012\u0002\b\u00030\u0080\u00012\b\u0010]\u001a\u0004\u0018\u00010yH\u0016R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0002\u001a\u00020\u0015X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u0011\u0010\u001a\u001a\u00020\u001b¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u001e\u001a\u00020\u001f¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0011\u0010\"\u001a\u00020#¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0011\u0010&\u001a\u00020'¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0011\u0010*\u001a\u00020+¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u0011\u0010.\u001a\u00020/¢\u0006\b\n\u0000\u001a\u0004\b0\u00101R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u00102\u001a\u0004\u0018\u000103X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u00104\u001a\u0004\u0018\u000105X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u00106\u001a\u0002078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b6\u00108R\u0014\u00109\u001a\u0002078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b:\u00108R&\u0010;\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030>0=0<8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b?\u0010@R\u001c\u0010A\u001a\u0004\u0018\u00010BX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR\u001a\u0010G\u001a\u000207X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bH\u00108\"\u0004\bI\u0010JR\u0011\u0010K\u001a\u0002078F¢\u0006\u0006\u001a\u0004\bK\u00108R\u0014\u0010L\u001a\u0002078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bL\u00108R\u0011\u0010[\u001a\u0002078F¢\u0006\u0006\u001a\u0004\b[\u00108¨\u0006\u0099\u0001"}, m90084d2 = {"Lcom/jumio/core/Controller;", "Lcom/jumio/core/network/ApiBinding;", "context", "Landroid/content/Context;", "authorizationModel", "Lcom/jumio/core/models/AuthorizationModel;", "controllerInterface", "Lcom/jumio/sdk/interfaces/JumioControllerInterface;", "customThemeId", "", "<init>", "(Landroid/content/Context;Lcom/jumio/core/models/AuthorizationModel;Lcom/jumio/sdk/interfaces/JumioControllerInterface;I)V", "data", "Landroid/os/Bundle;", "scanPartInterface", "Lcom/jumio/sdk/interfaces/JumioScanPartInterface;", "(Landroid/content/Context;Landroid/os/Bundle;Lcom/jumio/sdk/interfaces/JumioControllerInterface;Lcom/jumio/sdk/interfaces/JumioScanPartInterface;)V", "getAuthorizationModel", "()Lcom/jumio/core/models/AuthorizationModel;", "setAuthorizationModel", "(Lcom/jumio/core/models/AuthorizationModel;)V", "Lcom/jumio/core/MobileContext;", "getContext", "()Lcom/jumio/core/MobileContext;", "setContext", "(Lcom/jumio/core/MobileContext;)V", "rotationManager", "Lcom/jumio/commons/utils/DeviceRotationManager;", "getRotationManager", "()Lcom/jumio/commons/utils/DeviceRotationManager;", "dataManager", "Lcom/jumio/core/persistence/DataManager;", "getDataManager", "()Lcom/jumio/core/persistence/DataManager;", "backendManager", "Lcom/jumio/core/api/BackendManager;", "getBackendManager", "()Lcom/jumio/core/api/BackendManager;", "pluginRegistry", "Lcom/jumio/core/plugins/PluginRegistryInterface;", "getPluginRegistry", "()Lcom/jumio/core/plugins/PluginRegistryInterface;", "analytics", "Lcom/jumio/analytics/Analytics;", "getAnalytics", "()Lcom/jumio/analytics/Analytics;", "scopeProvider", "Lcom/jumio/core/scope/ScopeProviderInterface;", "getScopeProvider", "()Lcom/jumio/core/scope/ScopeProviderInterface;", "lastError", "Lcom/jumio/sdk/error/JumioError;", "initializeWorkflowJob", "Lkotlinx/coroutines/Job;", "isDefaultUi", "", "()Z", "userConsentedAllItems", "getUserConsentedAllItems", "bindingClasses", "", "Ljava/lang/Class;", "Lcom/jumio/core/network/ApiCall;", "getBindingClasses", "()[Ljava/lang/Class;", "activeCredential", "Lcom/jumio/sdk/credentials/JumioCredential;", "getActiveCredential$jumio_core_release", "()Lcom/jumio/sdk/credentials/JumioCredential;", "setActiveCredential$jumio_core_release", "(Lcom/jumio/sdk/credentials/JumioCredential;)V", "isActive", "isActive$jumio_core_release", "setActive$jumio_core_release", "(Z)V", "isConsentPreApproved", "isModelPreloaded", "restoreActiveCredential", "", URLCredentialContract.FeedEntry.TABLE_NAME, "restoreScanPart", "credentialPart", "Lcom/jumio/sdk/enums/JumioCredentialPart;", "saveState", "bundle", "persistAllData", InterfaceC33730j9.f70350a, "setup", "restore", "scheduleWorkflow", "checkWorkflow", "isComplete", "retry", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "cancel", "finish", "getUnconsentedItems", "", "Lcom/jumio/sdk/consent/JumioConsentItem;", "userConsented", "consentItem", "userConsent", "startCredential", "credentialInfo", "Lcom/jumio/sdk/credentials/JumioCredentialInfo;", "finishCredential", "finishCredential$jumio_core_release", "sdkResult", "resultMap", "Ljava/util/HashMap;", "", "Lcom/jumio/sdk/result/JumioCredentialResult;", "Lkotlin/collections/HashMap;", "ensureCredentialResult", "Lcom/jumio/core/models/CredentialDataModel;", "updateSdkResultWithImageData", DbParams.KEY_CHANNEL_RESULT, "serverSettingsModel", "Lcom/jumio/core/models/SettingsModel;", TUIConstants.TUIBeauty.METHOD_DESTROY_XMAGIC, "onError", "", "sourceClass", "reporting", "canceled", "finishSDK", "onResult", "apiCallDataModel", "Lcom/jumio/core/models/ApiCallDataModel;", "", "onSettingsCallResult", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onFinalizeCallResult", "setupTime", "Lorg/json/JSONObject;", "setupDocuments", "setupCountryDocuments", "setupTimeouts", "configurations", "setupLivenessSettings", "setupNfcSettings", "setupCameraData", "setupDocfinderSettings", "setupCDNFeatures", "setupUploadSettings", "setupSupplementalImages", "setupCameraChallenge", "setupConsent", "setupLegalStatements", "setupInitiateModel", "Lcom/jumio/core/models/InitiateModel;", "setupCredentials", "setupTermsOfUse", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nController.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Controller.kt\ncom/jumio/core/Controller\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,870:1\n1#2:871\n1557#3:872\n1628#3,3:873\n1863#3,2:876\n1863#3,2:885\n381#4,7:878\n*S KotlinDebug\n*F\n+ 1 Controller.kt\ncom/jumio/core/Controller\n*L\n396#1:872\n396#1:873,3\n496#1:876,2\n555#1:885,2\n524#1:878,7\n*E\n"})
public final class Controller implements ApiBinding {

    /* JADX INFO: renamed from: a */
    public AuthorizationModel f13600a;

    /* JADX INFO: renamed from: b */
    public MobileContext f13601b;

    /* JADX INFO: renamed from: c */
    public final DeviceRotationManager f13602c;

    /* JADX INFO: renamed from: d */
    public final DataManager f13603d;

    /* JADX INFO: renamed from: e */
    public final BackendManager f13604e;

    /* JADX INFO: renamed from: f */
    public final PluginRegistryInterface f13605f;

    /* JADX INFO: renamed from: g */
    public final Analytics f13606g;

    /* JADX INFO: renamed from: h */
    public final ScopeProviderInterface f13607h;

    /* JADX INFO: renamed from: i */
    public JumioControllerInterface f13608i;

    /* JADX INFO: renamed from: j */
    public final JumioScanPartInterface f13609j;

    /* JADX INFO: renamed from: k */
    public JumioError f13610k;

    /* JADX INFO: renamed from: l */
    public InterfaceC41775x1 f13611l;

    /* JADX INFO: renamed from: m */
    public JumioCredential f13612m;

    /* JADX INFO: renamed from: n */
    public boolean f13613n;

    public /* synthetic */ Controller(Context context, AuthorizationModel authorizationModel, JumioControllerInterface jumioControllerInterface, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, authorizationModel, jumioControllerInterface, (i12 & 8) != 0 ? 0 : i11);
    }

    /* JADX INFO: renamed from: a */
    public static JumioCredentialResult m14487a(HashMap map, CredentialDataModel credentialDataModel) {
        JumioCredentialResult jumioIDResult;
        String str = credentialDataModel.f14197a;
        Object obj = map.get(str);
        Object obj2 = obj;
        if (obj == null) {
            int i11 = AbstractC40693m0.f90326b[credentialDataModel.f14198b.ordinal()];
            if (i11 == 1) {
                jumioIDResult = new JumioIDResult(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 4194303, null);
            } else if (i11 == 2) {
                Object obj3 = credentialDataModel.f14201e.get(JumioCredentialPart.FACE);
                JumioScanMode jumioScanMode = null;
                FaceScanPartModel faceScanPartModel = obj3 instanceof FaceScanPartModel ? (FaceScanPartModel) obj3 : null;
                LivenessDataModel livenessData = faceScanPartModel != null ? faceScanPartModel.getF14243l() : null;
                JumioFaceResult jumioFaceResult = new JumioFaceResult(livenessData != null ? livenessData.getF14116e() : null);
                ScanMode type = livenessData != null ? livenessData.getF14112a() : null;
                int i12 = type == null ? -1 : AbstractC40693m0.f90325a[type.ordinal()];
                if (i12 == 1) {
                    jumioScanMode = JumioScanMode.FACE_MANUAL;
                } else if (i12 == 2) {
                    jumioScanMode = JumioScanMode.JUMIO_LIVENESS;
                } else if (i12 == 3) {
                    jumioScanMode = JumioScanMode.JUMIO_PREMIUM;
                }
                jumioFaceResult.setExtractionMode$jumio_core_release(jumioScanMode);
                jumioIDResult = jumioFaceResult;
            } else {
                if (i11 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                jumioIDResult = new JumioCredentialResult();
            }
            map.put(str, jumioIDResult);
            obj2 = jumioIDResult;
        }
        return (JumioCredentialResult) obj2;
    }

    /* JADX INFO: renamed from: b */
    public final void m14493b(boolean z11) {
        if (!JumioSDK.INSTANCE.isSupportedPlatform(this.f13601b)) {
            onError$default(this, new Error(ErrorCase.OCR_LOADING_FAILED, 0, 1, 2, null), null, 2, null);
            return;
        }
        Thread.setDefaultUncaughtExceptionHandler(new C40659f1(Thread.getDefaultUncaughtExceptionHandler()));
        CDNFeatureModel cDNFeatureModel = (CDNFeatureModel) this.f13603d.get(CDNFeatureModel.class);
        cDNFeatureModel.setDirectory(Environment.INSTANCE.getDataDirectory(this.f13601b));
        cDNFeatureModel.setAssetManager(this.f13601b.getAssets());
        cDNFeatureModel.setCdnDownloadListener(new C40748x0(this));
        if (z11) {
            return;
        }
        ReportingModel reportingModel = (ReportingModel) this.f13603d.get(ReportingModel.class);
        reportingModel.getClass();
        reportingModel.f14309f = System.currentTimeMillis();
        AbstractC40547J0.m89195a(this.f13601b, System.currentTimeMillis());
        AbstractC40547J0.m89194a((Context) this.f13601b, 0);
        if (((SettingsModel) this.f13603d.get(SettingsModel.class)).isLoaded()) {
            m14488a();
        } else {
            this.f13604e.settings(this.f13605f.getAvailablePluginNames());
        }
    }

    public final synchronized void finishCredential$jumio_core_release(@NotNull JumioCredential credential) {
        Intrinsics.checkNotNullParameter(credential, "credential");
        if (credential == this.f13612m) {
            this.f13612m = null;
            CredentialsModel credentialsModel = (CredentialsModel) this.f13603d.get(CredentialsModel.class);
            String id2 = credential.getF14676b().f14197a;
            credentialsModel.getClass();
            Intrinsics.checkNotNullParameter(id2, "id");
            if (Intrinsics.areEqual(credentialsModel.f14207c, id2)) {
                credentialsModel.f14207c = null;
            }
        }
    }

    public final void onError(@Nullable Throwable error, @NotNull Class<?> sourceClass) {
        Intrinsics.checkNotNullParameter(sourceClass, "sourceClass");
        Error errorErrorFromThrowable = this.f13604e.errorFromThrowable(error, sourceClass);
        Analytics.INSTANCE.add(MobileEvents.lifecycle(EnumC40670h2.ERROR, errorErrorFromThrowable));
        JumioError jumioError = errorErrorFromThrowable.getJumioError(this.f13601b);
        this.f13610k = jumioError;
        this.f13607h.runOnMain(new C40708p0(this, jumioError, null));
    }

    @NotNull
    public final synchronized JumioCredential startCredential(@NotNull JumioCredentialInfo credentialInfo) throws IllegalArgumentException {
        JumioCredential jumioCredentialM14554a;
        try {
            Intrinsics.checkNotNullParameter(credentialInfo, "credentialInfo");
            if (!((ConsentModel) this.f13603d.get(ConsentModel.class)).getAllConsented()) {
                throw new IllegalArgumentException("User consent is missing");
            }
            if (this.f13612m != null) {
                throw new IllegalArgumentException("Please finish the active credential first");
            }
            CredentialsModel credentialsModel = (CredentialsModel) this.f13603d.get(CredentialsModel.class);
            credentialsModel.getClass();
            Intrinsics.checkNotNullParameter(credentialInfo, "credentialInfo");
            List list = credentialsModel.f14205a;
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                CredentialDataModel credentialDataModel = (CredentialDataModel) obj;
                if (!credentialDataModel.mo14552a() && !Intrinsics.areEqual(credentialDataModel.f14197a, credentialInfo.getF14682b())) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(Integer.valueOf(((CredentialDataModel) it.next()).f14200d));
            }
            if (!arrayList2.isEmpty()) {
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    if (((Number) it2.next()).intValue() < credentialInfo.getF14683c()) {
                        throw new IllegalArgumentException(("Cannot start credential with order " + credentialInfo.getF14683c() + ". Credentials with lower order must be completed first.").toString());
                    }
                }
            }
            jumioCredentialM14554a = credentialsModel.m14554a(this, credentialInfo.getF14682b());
            if (jumioCredentialM14554a == null) {
                throw new IllegalArgumentException("Could not start credential");
            }
            this.f13612m = jumioCredentialM14554a;
            jumioCredentialM14554a.start$jumio_core_release();
        } catch (Throwable th2) {
            throw th2;
        }
        return jumioCredentialM14554a;
    }

    public Controller(@NotNull Context context, @NotNull AuthorizationModel authorizationModel, @NotNull JumioControllerInterface controllerInterface, int i11) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(authorizationModel, "authorizationModel");
        Intrinsics.checkNotNullParameter(controllerInterface, "controllerInterface");
        this.f13613n = true;
        MobileContext mobileContext = new MobileContext(context.getApplicationContext(), authorizationModel, i11);
        ServiceLocator serviceLocator = ServiceLocator.INSTANCE;
        serviceLocator.init(mobileContext);
        this.f13601b = mobileContext;
        this.f13605f = (PluginRegistryInterface) ServiceLocatorInterface.getServiceImplementation$default(serviceLocator, PluginRegistryInterface.class, null, 2, null);
        ScopeProviderInterface scopeProviderInterface = (ScopeProviderInterface) ServiceLocatorInterface.getServiceImplementation$default(serviceLocator, ScopeProviderInterface.class, null, 2, null);
        this.f13607h = scopeProviderInterface;
        this.f13602c = new DeviceRotationManager(context);
        DataManager dataManager = new DataManager();
        this.f13603d = dataManager;
        BackendManager backendManager = new BackendManager(this.f13601b, scopeProviderInterface, dataManager, authorizationModel);
        this.f13604e = backendManager;
        backendManager.addBinding(this);
        AnalyticsModel analyticsModel = new AnalyticsModel();
        dataManager.put(AnalyticsModel.class, analyticsModel);
        Analytics analytics = new Analytics(backendManager, analyticsModel);
        analytics.configure$jumio_core_release();
        analytics.add(MobileEvents.lifecycle$default(EnumC40670h2.CREATED, null, 2, null));
        this.f13606g = analytics;
        this.f13600a = authorizationModel;
        this.f13608i = controllerInterface;
        m14493b(false);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0048  */
    /* JADX WARN: Code duplicated, block: B:32:0x0083  */
    public static final boolean access$isModelPreloaded(Controller controller) {
        Object next;
        boolean zBooleanValue;
        Object next2;
        boolean zBooleanValue2;
        CredentialsModel credentialsModel = (CredentialsModel) controller.f13603d.get(CredentialsModel.class);
        Iterator it = credentialsModel.f14205a.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((CredentialDataModel) next).f14198b != JumioCredentialCategory.ID);
        if (((CredentialDataModel) next) == null) {
            zBooleanValue = true;
        } else {
            ExtractionPlugin extractionPlugin = (ExtractionPlugin) controller.f13605f.getPlugin(EnumC40613W2.DOCFINDER);
            Boolean boolValueOf = extractionPlugin != null ? Boolean.valueOf(extractionPlugin.isPreloaded(controller)) : null;
            if (boolValueOf != null) {
                zBooleanValue = boolValueOf.booleanValue();
            } else {
                zBooleanValue = true;
            }
        }
        Iterator it2 = credentialsModel.f14205a.iterator();
        do {
            if (!it2.hasNext()) {
                next2 = null;
                break;
            }
            next2 = it2.next();
        } while (((CredentialDataModel) next2).f14198b != JumioCredentialCategory.FACE);
        if (((CredentialDataModel) next2) == null) {
            zBooleanValue2 = true;
        } else {
            ExtractionPlugin extractionPlugin2 = (ExtractionPlugin) controller.f13605f.getPlugin(EnumC40613W2.JUMIO_LIVENESS);
            Boolean boolValueOf2 = extractionPlugin2 != null ? Boolean.valueOf(extractionPlugin2.isPreloaded(controller)) : null;
            if (boolValueOf2 != null) {
                zBooleanValue2 = boolValueOf2.booleanValue();
            } else {
                zBooleanValue2 = true;
            }
        }
        return zBooleanValue && zBooleanValue2;
    }

    public static final Object access$onSettingsCallResult(Controller controller, Object obj, Continuation continuation) {
        Object objM91049g = C41686h.m91049g(controller.f13607h.getF14551c(), new C40718r0(controller, obj, null), continuation);
        return objM91049g == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM91049g : Unit.INSTANCE;
    }

    public static final void access$scheduleWorkflow(Controller controller) {
        InterfaceC41775x1 interfaceC41775x1M91104d = C41696j.m91104d(controller.f13607h.getIoScope(), null, null, new C40728t0(controller, null), 3, null);
        controller.f13611l = interfaceC41775x1M91104d;
        if (interfaceC41775x1M91104d != null) {
            interfaceC41775x1M91104d.start();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void onError$default(Controller controller, Throwable th2, Class cls, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            cls = Object.class;
        }
        controller.onError(th2, (Class<?>) cls);
    }

    public final void cancel() throws SDKNotConfiguredException, IllegalArgumentException {
        JumioCredential jumioCredential = this.f13612m;
        if (jumioCredential != null) {
            jumioCredential.cancel();
        }
        InitiateModel initiateModel = (InitiateModel) this.f13603d.get(InitiateModel.class);
        String f14256b = initiateModel.getF14256b();
        String str = initiateModel.f14255a;
        JumioError jumioError = this.f13610k;
        if (jumioError == null) {
            jumioError = new Error(ErrorCase.CANCEL_TYPE_USER, 0, 0, 6, null).getJumioError(this.f13601b);
        }
        this.f13607h.runOnMain(new C40698n0(this, new JumioResult(f14256b, str, false, null, null, jumioError, 24, null), null));
        this.f13604e.cancelCall(true);
        reporting(true);
        m14491a(true);
        m14492b();
    }

    @Nullable
    /* JADX INFO: renamed from: getActiveCredential$jumio_core_release, reason: from getter */
    public final JumioCredential getF13612m() {
        return this.f13612m;
    }

    @NotNull
    /* JADX INFO: renamed from: getAnalytics, reason: from getter */
    public final Analytics getF13606g() {
        return this.f13606g;
    }

    @NotNull
    /* JADX INFO: renamed from: getAuthorizationModel, reason: from getter */
    public final AuthorizationModel getF13600a() {
        return this.f13600a;
    }

    @NotNull
    /* JADX INFO: renamed from: getBackendManager, reason: from getter */
    public final BackendManager getF13604e() {
        return this.f13604e;
    }

    @Override // com.jumio.core.network.ApiBinding
    @NotNull
    public Class<? extends ApiCall<?>>[] getBindingClasses() {
        return new Class[]{C40669h1.class, C40719r1.class, C40686k3.class, SettingsCall.class};
    }

    @NotNull
    /* JADX INFO: renamed from: getContext, reason: from getter */
    public final MobileContext getF13601b() {
        return this.f13601b;
    }

    @NotNull
    /* JADX INFO: renamed from: getDataManager, reason: from getter */
    public final DataManager getF13603d() {
        return this.f13603d;
    }

    @NotNull
    /* JADX INFO: renamed from: getPluginRegistry, reason: from getter */
    public final PluginRegistryInterface getF13605f() {
        return this.f13605f;
    }

    @NotNull
    /* JADX INFO: renamed from: getRotationManager, reason: from getter */
    public final DeviceRotationManager getF13602c() {
        return this.f13602c;
    }

    @NotNull
    /* JADX INFO: renamed from: getScopeProvider, reason: from getter */
    public final ScopeProviderInterface getF13607h() {
        return this.f13607h;
    }

    @NotNull
    public final List<JumioConsentItem> getUnconsentedItems() {
        return ((ConsentModel) this.f13603d.get(ConsentModel.class)).getNonConsentedItems();
    }

    /* JADX INFO: renamed from: isActive$jumio_core_release, reason: from getter */
    public final boolean getF13613n() {
        return this.f13613n;
    }

    public final boolean isComplete() {
        if (this.f13612m != null) {
            return false;
        }
        CredentialsModel credentialsModel = (CredentialsModel) this.f13603d.get(CredentialsModel.class);
        if (credentialsModel.f14205a.isEmpty()) {
            return false;
        }
        List list = credentialsModel.f14205a;
        if (list != null && list.isEmpty()) {
            return true;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (!((CredentialDataModel) it.next()).mo14552a()) {
                return false;
            }
        }
        return true;
    }

    public final boolean isConsentPreApproved() {
        return ((SettingsModel) this.f13603d.get(SettingsModel.class)).getSkipStartScreen();
    }

    @Override // com.jumio.core.network.ApiBinding, jumio.core.InterfaceC40662g
    public void onResult(@NotNull ApiCallDataModel<?> apiCallDataModel, @Nullable Object result) {
        Intrinsics.checkNotNullParameter(apiCallDataModel, "apiCallDataModel");
        Class<?> call = apiCallDataModel.getCall();
        if (Intrinsics.areEqual(call, SettingsCall.class)) {
            C41696j.m91104d(this.f13607h.getMainScope(), null, null, new C40713q0(this, result, null), 3, null);
            return;
        }
        if (Intrinsics.areEqual(call, C40686k3.class)) {
            return;
        }
        if (!Intrinsics.areEqual(call, C40719r1.class)) {
            if (Intrinsics.areEqual(call, C40669h1.class)) {
                Intrinsics.checkNotNull(result, "null cannot be cast to non-null type java.util.HashMap<kotlin.String, com.jumio.sdk.result.JumioCredentialResult>");
                m14490a((HashMap) result);
                return;
            }
            return;
        }
        Intrinsics.checkNotNull(result, "null cannot be cast to non-null type org.json.JSONObject");
        if (((JSONObject) result).optBoolean("extractDataExecuted", false)) {
            this.f13604e.extractData();
        } else {
            m14490a(new HashMap());
        }
    }

    public final void persistAllData(boolean stop) {
        C41696j.m91104d(this.f13607h.getIoScope(), null, null, new C40723s0(this, stop, null), 3, null);
    }

    public final void reporting(boolean canceled) {
        try {
            if (((SettingsModel) this.f13603d.get(SettingsModel.class)).isAdditionalDataPointsEnabled()) {
                Analytics.INSTANCE.add(MobileEvents.additionalDatapoints(this.f13601b, this.f13603d));
            }
        } catch (Exception e11) {
            Log.printStackTrace(e11);
        }
        try {
            Analytics.INSTANCE.add(MobileEvents.reporting((ReportingModel) this.f13603d.get(ReportingModel.class), (CredentialsModel) this.f13603d.get(CredentialsModel.class), canceled));
        } catch (Exception e12) {
            Log.printStackTrace(e12);
        }
        this.f13606g.reporting(canceled);
    }

    public final void retry(@NotNull JumioError error) {
        Intrinsics.checkNotNullParameter(error, "error");
        if (!Intrinsics.areEqual(error, this.f13610k)) {
            throw new IllegalArgumentException("Specified error is not valid");
        }
        if (!error.getF14705a()) {
            throw new IllegalArgumentException("Specified error is not retryable");
        }
        this.f13610k = null;
        JumioCredential jumioCredential = this.f13612m;
        if (!(jumioCredential != null ? Intrinsics.areEqual(jumioCredential.consumeError$jumio_core_release(error), Boolean.TRUE) : false)) {
            this.f13604e.retry();
        }
        Analytics.INSTANCE.add(MobileEvents.userAction$default("retry_error", null, null, 6, null));
    }

    public final void saveState(@NotNull Bundle bundle) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        bundle.putSerializable("Jumio1", this.f13600a);
        persistAllData(false);
    }

    public final void setActive$jumio_core_release(boolean z11) {
        this.f13613n = z11;
    }

    public final void setActiveCredential$jumio_core_release(@Nullable JumioCredential jumioCredential) {
        this.f13612m = jumioCredential;
    }

    public final void setAuthorizationModel(@NotNull AuthorizationModel authorizationModel) {
        Intrinsics.checkNotNullParameter(authorizationModel, "<set-?>");
        this.f13600a = authorizationModel;
    }

    public final void setContext(@NotNull MobileContext mobileContext) {
        Intrinsics.checkNotNullParameter(mobileContext, "<set-?>");
        this.f13601b = mobileContext;
    }

    public final void userConsented(@NotNull JumioConsentItem consentItem, boolean userConsent) {
        Intrinsics.checkNotNullParameter(consentItem, "consentItem");
        long jCurrentTimeMillis = System.currentTimeMillis();
        MetaInfo metaInfo = new MetaInfo();
        metaInfo.putAll(AbstractC40683k0.m89258a(consentItem, Long.valueOf(jCurrentTimeMillis)));
        metaInfo.put("decision", Boolean.valueOf(userConsent));
        Analytics.INSTANCE.add(MobileEvents.alert("consent", metaInfo));
        ((ConsentModel) this.f13603d.get(ConsentModel.class)).saveResult(consentItem, userConsent, jCurrentTimeMillis);
    }

    public static final void access$setupCDNFeatures(Controller controller, JSONObject jSONObject) {
        controller.getClass();
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("cdnEnc");
        if (jSONArrayOptJSONArray != null) {
            ((CDNFeatureModel) controller.f13603d.get(CDNFeatureModel.class)).setup(jSONArrayOptJSONArray);
        }
    }

    public static final void access$setupCameraChallenge(Controller controller, JSONObject jSONObject) {
        controller.getClass();
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("cameraChallenge");
        if (jSONArrayOptJSONArray != null) {
            controller.f13603d.put(CameraChallengeModel.class, CameraChallengeModel.f14190b.fromJson(jSONArrayOptJSONArray));
        }
    }

    public static final void access$setupCameraData(Controller controller, JSONObject jSONObject) {
        controller.getClass();
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("cameraData");
        if (jSONObjectOptJSONObject != null) {
            controller.f13603d.put(CameraDataSettingsModel.class, CameraDataSettingsModel.INSTANCE.fromJson(jSONObjectOptJSONObject));
        }
    }

    public static final void access$setupConsent(Controller controller, JSONObject jSONObject) {
        controller.getClass();
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("consents");
        if (jSONArrayOptJSONArray != null) {
            controller.f13603d.put(ConsentModel.class, ConsentModel.INSTANCE.fromJson(jSONArrayOptJSONArray));
        }
    }

    public static final void access$setupCountryDocuments(Controller controller, JSONObject jSONObject) {
        controller.getClass();
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("supportedCountries");
        if (jSONArrayOptJSONArray != null) {
            controller.f13603d.put(CountryDocumentModel.class, new CountryDocumentModel(new DefaultCountryDocumentProvider(jSONArrayOptJSONArray, LocaleUtil.INSTANCE.checkForLocalization(controller.f13601b))));
        }
    }

    public static final void access$setupCredentials(Controller controller, JSONObject jSONObject) throws Exception {
        CredentialsModel credentialsModelFromJson;
        Object obj;
        Object next;
        Object next2;
        ExtractionPlugin extractionPlugin;
        controller.getClass();
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("credentials");
        if (jSONArrayOptJSONArray != null && (credentialsModelFromJson = CredentialsModel.f14204d.fromJson(jSONArrayOptJSONArray)) != null) {
            controller.f13603d.put(CredentialsModel.class, credentialsModelFromJson);
            if (!credentialsModelFromJson.f14205a.isEmpty()) {
                Iterator it = credentialsModelFromJson.f14205a.iterator();
                do {
                    obj = null;
                    if (it.hasNext()) {
                        next = it.next();
                    } else {
                        next = null;
                        break;
                    }
                } while (((CredentialDataModel) next).f14198b != JumioCredentialCategory.ID);
                if (((CredentialDataModel) next) != null) {
                    ExtractionPlugin extractionPlugin2 = (ExtractionPlugin) controller.f13605f.getPlugin(EnumC40613W2.DOCFINDER);
                    if (extractionPlugin2 != null) {
                        extractionPlugin2.preload(controller);
                    }
                    ScanPartPlugin scanPartPlugin = (ScanPartPlugin) controller.f13605f.getPlugin(EnumC40613W2.NFC);
                    if (scanPartPlugin != null) {
                        scanPartPlugin.preload(controller);
                    }
                }
                Iterator it2 = credentialsModelFromJson.f14205a.iterator();
                do {
                    if (it2.hasNext()) {
                        next2 = it2.next();
                    } else {
                        next2 = null;
                        break;
                    }
                } while (((CredentialDataModel) next2).f14198b != JumioCredentialCategory.FACE);
                if (((CredentialDataModel) next2) != null && (extractionPlugin = (ExtractionPlugin) controller.f13605f.getPlugin(EnumC40613W2.JUMIO_LIVENESS)) != null) {
                    extractionPlugin.preload(controller);
                }
                for (Object obj2 : credentialsModelFromJson.f14205a) {
                    if (((CredentialDataModel) obj2).mo14553a(controller)) {
                        obj = obj2;
                        break;
                    }
                }
                if (obj == null) {
                    return;
                } else {
                    throw new Exception("Credential not supported");
                }
            }
            throw new Exception("No credentials available");
        }
        throw new Exception("No credentials available");
    }

    public static final void access$setupDocfinderSettings(Controller controller, JSONObject jSONObject) {
        controller.getClass();
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("docFinder");
        if (jSONObjectOptJSONObject != null) {
            controller.f13603d.put(DocfinderSettingsModel.class, DocfinderSettingsModel.INSTANCE.fromJson(jSONObjectOptJSONObject));
        }
    }

    public static final void access$setupDocuments(Controller controller, JSONObject jSONObject) {
        controller.getClass();
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("supportedDocumentTypes");
        if (jSONArrayOptJSONArray != null) {
            controller.f13603d.put(DocumentModel.class, DocumentModel.f14238b.fromJson(jSONArrayOptJSONArray));
        }
    }

    public static final InitiateModel access$setupInitiateModel(Controller controller, JSONObject jSONObject) throws JSONException {
        controller.getClass();
        InitiateModel initiateModelFromJson = InitiateModel.f14254e.fromJson(jSONObject);
        controller.f13603d.put(InitiateModel.class, initiateModelFromJson);
        if (Log.isFileLoggingActivated()) {
            LogUtils.INSTANCE.setSessionLogFolderName("SDK_" + initiateModelFromJson.getF14256b());
        }
        return initiateModelFromJson;
    }

    public static final void access$setupLegalStatements(Controller controller, JSONObject jSONObject) {
        controller.getClass();
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("idFoundLegalStatement");
        if (jSONObjectOptJSONObject != null) {
            controller.f13603d.put(LegalStatementModel.class, LegalStatementModel.f14259d.fromJson(jSONObjectOptJSONObject));
        }
    }

    public static final void access$setupLivenessSettings(Controller controller, JSONObject jSONObject) {
        controller.getClass();
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("jumioLiveness");
        if (jSONObjectOptJSONObject != null) {
            controller.f13603d.put(LivenessSettingsModel.class, LivenessSettingsModel.INSTANCE.fromJson(jSONObjectOptJSONObject));
        }
    }

    public static final void access$setupSupplementalImages(Controller controller, JSONObject jSONObject) {
        controller.getClass();
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("supplementalImagesV2");
        if (jSONArrayOptJSONArray != null) {
            controller.f13603d.put(SupplementalImageModel.class, SupplementalImageModel.INSTANCE.fromJson(jSONArrayOptJSONArray));
        }
    }

    public static final void access$setupTermsOfUse(Controller controller, JSONObject jSONObject) {
        TermsOfUseModel termsOfUseModelFromJson;
        controller.getClass();
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("termsOfUse");
        if (jSONObjectOptJSONObject != null && (termsOfUseModelFromJson = TermsOfUseModel.f14364b.fromJson(jSONObjectOptJSONObject)) != null) {
            controller.f13603d.put(TermsOfUseModel.class, termsOfUseModelFromJson);
        }
    }

    public static final void access$setupTimeouts(Controller controller, JSONObject jSONObject) {
        controller.getClass();
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("networkTimeouts");
        if (jSONObjectOptJSONObject != null) {
            controller.f13603d.put(TimeoutModel.class, TimeoutModel.INSTANCE.fromJson(jSONObjectOptJSONObject));
        }
    }

    public final void finish() throws IllegalArgumentException {
        if (isComplete()) {
            reporting(false);
            this.f13604e.finalizeCall();
            return;
        }
        throw new IllegalArgumentException("Workflow is not completed");
    }

    @Override // com.jumio.core.network.ApiBinding, jumio.core.InterfaceC40662g
    public void onError(@NotNull ApiCallDataModel<?> apiCallDataModel, @Nullable Throwable error) {
        Intrinsics.checkNotNullParameter(apiCallDataModel, "apiCallDataModel");
        onError(error, apiCallDataModel.getCall());
    }

    /* JADX INFO: renamed from: b */
    public final void m14492b() {
        this.f13607h.cancelAll();
        ServiceLocator.INSTANCE.destroy();
        this.f13604e.removeBinding(this);
        this.f13602c.destroy();
        this.f13605f.clearCache();
        ((CDNFeatureModel) this.f13603d.get(CDNFeatureModel.class)).clearNonCacheFiles();
        this.f13608i = null;
        this.f13611l = null;
        try {
            this.f13603d.removeAll();
        } catch (Exception e11) {
            Log.printStackTrace(e11);
        }
        try {
            File[] fileArrListFiles = new File(this.f13601b.getFilesDir(), "jumio").listFiles(new C40714q1());
            if (fileArrListFiles != null) {
                Iterator it = ArrayIteratorKt.iterator(fileArrListFiles);
                while (it.hasNext()) {
                    File file = (File) it.next();
                    if (file.isFile() && !file.delete()) {
                        file.deleteOnExit();
                    }
                }
            }
        } catch (Exception e12) {
            Log.printStackTrace(e12);
        }
        Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
        if (defaultUncaughtExceptionHandler instanceof C40659f1) {
            C40659f1 c40659f1 = (C40659f1) defaultUncaughtExceptionHandler;
            c40659f1.getClass();
            if (Thread.getDefaultUncaughtExceptionHandler() == c40659f1) {
                Thread.setDefaultUncaughtExceptionHandler(c40659f1.f90265a);
            }
        }
        this.f13613n = false;
    }

    /* JADX INFO: renamed from: a */
    public final void m14488a() {
        List<JumioConsentItem> unconsentedItems;
        KClass kotlinClass;
        String str;
        String alpha3Country;
        this.f13606g.start(((SettingsModel) this.f13603d.get(SettingsModel.class)).isAnalyticsEnabled(), 20000L, 20);
        MobileContext context = this.f13601b;
        DataManager dataManager = this.f13603d;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(dataManager, "dataManager");
        SettingsModel settingsModel = (SettingsModel) dataManager.get(SettingsModel.class);
        if (settingsModel.isAdditionalDataPointsEnabled()) {
            AdditionalDataPointsModel additionalDataPointsModel = (AdditionalDataPointsModel) dataManager.get(AdditionalDataPointsModel.class);
            try {
                Pair pairM89198d = AbstractC40547J0.m89198d(context);
                boolean zM89265a = AbstractC40716q3.m89265a(context);
                int offset = TimeZone.getDefault().getOffset(System.currentTimeMillis()) / 3600000;
                Locale locale = LocaleUtil.INSTANCE.getLocale(context);
                if (locale != null) {
                    String string = locale.toString();
                    Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                    alpha3Country = LocaleUtilKt.getAlpha3Country(locale);
                    str = string;
                } else {
                    str = "";
                    alpha3Country = str;
                }
                additionalDataPointsModel.m14549a(str, ((Number) pairM89198d.getFirst()).intValue(), ((Number) pairM89198d.getSecond()).intValue(), offset, zM89265a, alpha3Country, settingsModel.getCountryForIp(), settingsModel.getStateForIp(), AbstractC40547J0.m89196b(context));
            } catch (Exception e11) {
                Log.m14471e("Failed to build analytics data points model", e11);
            }
        }
        Analytics.Companion companion = Analytics.INSTANCE;
        companion.add(MobileEvents.deviceInformation(this.f13601b));
        MobileContext mobileContext = this.f13601b;
        DataManager dataManager2 = this.f13603d;
        AuthorizationModel authorizationModel = this.f13600a;
        PluginRegistryInterface pluginRegistryInterface = this.f13605f;
        Class<?> cls = ReflectionUtil.INSTANCE.getClass("com.jumio.defaultui.utils.DefaultUIProvider");
        companion.add(MobileEvents.sdkParameters(mobileContext, dataManager2, authorizationModel, pluginRegistryInterface, (cls == null || (kotlinClass = JvmClassMappingKt.getKotlinClass(cls)) == null) ? false : kotlinClass.isInstance(this.f13608i)));
        if (((ConsentModel) this.f13603d.get(ConsentModel.class)).getAllConsented()) {
            unconsentedItems = null;
        } else {
            unconsentedItems = getUnconsentedItems();
            MetaInfo metaInfo = new MetaInfo();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(unconsentedItems, 10));
            Iterator<T> it = unconsentedItems.iterator();
            while (it.hasNext()) {
                arrayList.add(AbstractC40683k0.m89258a((JumioConsentItem) it.next(), null));
            }
            metaInfo.put("consents", arrayList);
            Analytics.INSTANCE.add(MobileEvents.alert("consentRequired", metaInfo));
        }
        this.f13607h.runOnMain(new C40703o0(this, unconsentedItems, null));
    }

    public /* synthetic */ Controller(Context context, Bundle bundle, JumioControllerInterface jumioControllerInterface, JumioScanPartInterface jumioScanPartInterface, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, bundle, jumioControllerInterface, (i11 & 8) != 0 ? null : jumioScanPartInterface);
    }

    public Controller(@NotNull Context context, @NotNull Bundle data, @NotNull JumioControllerInterface controllerInterface, @Nullable JumioScanPartInterface jumioScanPartInterface) throws InterruptedException {
        JumioCredentialPart jumioCredentialPart;
        ScanPartPlugin scanPartPlugin;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(controllerInterface, "controllerInterface");
        this.f13613n = true;
        this.f13600a = (AuthorizationModel) AbstractC40753y0.m89270a(data);
        this.f13609j = jumioScanPartInterface;
        C40559L2 c40559l2 = new C40559L2(context);
        C41690i.m91067b(null, new C40688l0(c40559l2, null), 1, null);
        C40579P2 c40579p2 = new C40579P2(this.f13600a.getF14185c(), new File(Environment.INSTANCE.getDataDirectory(context), "tmp_store"), c40559l2);
        try {
            boolean zM89210b = c40579p2.m89210b();
            Context applicationContext = context.getApplicationContext();
            AuthorizationModel authorizationModel = this.f13600a;
            Object obj = 0;
            Object objM89209a = c40579p2.m89209a();
            if (objM89209a != null) {
                obj = objM89209a;
            }
            MobileContext mobileContext = new MobileContext(applicationContext, authorizationModel, ((Number) obj).intValue());
            ServiceLocator serviceLocator = ServiceLocator.INSTANCE;
            serviceLocator.init(mobileContext);
            this.f13601b = mobileContext;
            PluginRegistryInterface pluginRegistryInterface = (PluginRegistryInterface) ServiceLocatorInterface.getServiceImplementation$default(serviceLocator, PluginRegistryInterface.class, null, 2, null);
            this.f13605f = pluginRegistryInterface;
            ScopeProviderInterface scopeProviderInterface = (ScopeProviderInterface) ServiceLocatorInterface.getServiceImplementation$default(serviceLocator, ScopeProviderInterface.class, null, 2, null);
            this.f13607h = scopeProviderInterface;
            Object obj2 = Boolean.TRUE;
            Object objM89209a2 = c40579p2.m89209a();
            if (objM89209a2 != null) {
                obj2 = objM89209a2;
            }
            this.f13613n = ((Boolean) obj2).booleanValue();
            this.f13610k = (JumioError) c40579p2.m89209a();
            DataManager dataManager = new DataManager();
            this.f13603d = dataManager;
            BackendManager backendManager = new BackendManager(this.f13601b, scopeProviderInterface, dataManager, this.f13600a);
            this.f13604e = backendManager;
            backendManager.restore(c40579p2);
            dataManager.restore(c40579p2);
            Unit unit = Unit.INSTANCE;
            CloseableKt.closeFinally(c40579p2, null);
            this.f13602c = new DeviceRotationManager(context);
            this.f13608i = controllerInterface;
            backendManager.addBinding(this);
            Analytics analytics = new Analytics(backendManager, (AnalyticsModel) dataManager.get(AnalyticsModel.class));
            analytics.configure$jumio_core_release();
            analytics.resume();
            this.f13606g = analytics;
            if (!zM89210b) {
                onError$default(this, new Error(ErrorCase.PROCESS_CANT_BE_COMPLETED, 0, 2, 2, null), null, 2, null);
                return;
            }
            m14493b(true);
            CredentialsModel credentialsModel = (CredentialsModel) dataManager.get(CredentialsModel.class);
            String str = credentialsModel.f14207c;
            if (str != null) {
                JumioCredential jumioCredentialM14554a = credentialsModel.m14554a(this, str);
                this.f13612m = jumioCredentialM14554a;
                if (jumioCredentialM14554a != null && jumioScanPartInterface != null && (jumioCredentialPart = jumioCredentialM14554a.getF14676b().f14203g) != null) {
                    if (!jumioCredentialM14554a.getF14676b().f14202f.isEmpty() && jumioCredentialM14554a.getF14676b().f14202f.containsKey(jumioCredentialM14554a.getF14676b().f14203g)) {
                        ScanPartModel scanPartModel = (ScanPartModel) jumioCredentialM14554a.getF14676b().f14202f.get(jumioCredentialM14554a.getF14676b().f14203g);
                        if (scanPartModel != null && jumioCredentialM14554a.getF14676b().f14203g == JumioCredentialPart.NFC && (scanPartPlugin = (ScanPartPlugin) pluginRegistryInterface.getPlugin(EnumC40613W2.NFC)) != null) {
                            jumioCredentialM14554a.setActiveScanPart$jumio_core_release(new JumioScanPart(scanPartPlugin.getScanPart(jumioCredentialM14554a.getF14675a(), jumioCredentialM14554a, scanPartModel, jumioScanPartInterface)));
                        }
                    } else {
                        jumioCredentialM14554a.initScanPart(jumioCredentialPart, jumioScanPartInterface).getScanPart$jumio_core_release().restore();
                    }
                }
            }
            backendManager.retry();
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                CloseableKt.closeFinally(c40579p2, th2);
                throw th3;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m14490a(HashMap map) {
        SettingsModel settingsModel = (SettingsModel) this.f13603d.get(SettingsModel.class);
        InitiateModel initiateModel = (InitiateModel) this.f13603d.get(InitiateModel.class);
        try {
            for (CredentialDataModel credentialDataModel : ((CredentialsModel) this.f13603d.get(CredentialsModel.class)).f14205a) {
                m14489a(m14487a(map, credentialDataModel), credentialDataModel, settingsModel);
            }
        } catch (Exception e11) {
            onError$default(this, e11, null, 2, null);
        }
        JumioResult jumioResult = new JumioResult(initiateModel.getF14256b(), initiateModel.f14255a, true, ((CredentialsModel) this.f13603d.get(CredentialsModel.class)).m14555a(), map, null, 32, null);
        m14491a(false);
        this.f13607h.runOnMain(new C40733u0(this, jumioResult, null));
        m14492b();
    }

    /* JADX INFO: renamed from: a */
    public final void m14489a(JumioCredentialResult jumioCredentialResult, CredentialDataModel credentialDataModel, SettingsModel settingsModel) {
        if (settingsModel.getReturnImages()) {
            JumioImageData jumioImageData = new JumioImageData(this.f13600a);
            Collection<ScanPartModel> collectionValues = credentialDataModel.f14201e.values();
            Intrinsics.checkNotNullExpressionValue(collectionValues, "<get-values>(...)");
            for (ScanPartModel scanPartModel : collectionValues) {
                if (scanPartModel.getF14314c().getHasData()) {
                    try {
                        jumioImageData.addImage$jumio_core_release(this.f13601b, FileUtil.INSTANCE.readFile(scanPartModel.getF14314c().getData(), this.f13600a.getF14185c()), scanPartModel.getF14312a());
                    } catch (Exception e11) {
                        Log.m14470e("ImageData", "Error reading File", e11);
                    }
                }
            }
            jumioCredentialResult.setImageData$jumio_core_release(jumioImageData);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m14491a(boolean z11) {
        EnumC40670h2 enumC40670h2;
        try {
            if (z11) {
                MobileContext context = this.f13601b;
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter("Jumio05", "key");
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter("Jumio05", "key");
                int i11 = context.getSharedPreferences("Jumio01", 0).getInt("Jumio05", 0) + 1;
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter("Jumio05", "key");
                SharedPreferences sharedPreferences = context.getSharedPreferences("Jumio01", 0);
                Intrinsics.checkNotNullExpressionValue(sharedPreferences, "getSharedPreferences(...)");
                SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                editorEdit.putInt("Jumio05", i11);
                editorEdit.apply();
                enumC40670h2 = EnumC40670h2.CANCELLED;
            } else {
                MobileContext context2 = this.f13601b;
                Intrinsics.checkNotNullParameter(context2, "context");
                Intrinsics.checkNotNullParameter("Jumio04", "key");
                Intrinsics.checkNotNullParameter(context2, "context");
                Intrinsics.checkNotNullParameter("Jumio04", "key");
                int i12 = context2.getSharedPreferences("Jumio01", 0).getInt("Jumio04", 0) + 1;
                Intrinsics.checkNotNullParameter(context2, "context");
                Intrinsics.checkNotNullParameter("Jumio04", "key");
                SharedPreferences sharedPreferences2 = context2.getSharedPreferences("Jumio01", 0);
                Intrinsics.checkNotNullExpressionValue(sharedPreferences2, "getSharedPreferences(...)");
                SharedPreferences.Editor editorEdit2 = sharedPreferences2.edit();
                editorEdit2.putInt("Jumio04", i12);
                editorEdit2.apply();
                enumC40670h2 = EnumC40670h2.FINISHED;
            }
            Analytics.INSTANCE.add(MobileEvents.lifecycle$default(enumC40670h2, null, 2, null));
        } catch (Exception e11) {
            Log.printStackTrace(e11);
        }
        try {
            this.f13606g.stop();
        } catch (Exception e12) {
            Log.printStackTrace(e12);
        }
    }
}
