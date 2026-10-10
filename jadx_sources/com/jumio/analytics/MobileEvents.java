package com.jumio.analytics;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.nfc.NfcAdapter;
import android.os.Build;
import androidx.core.content.p020pm.PackageInfoCompat;
import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.jumio.analytics.MobileEvents;
import com.jumio.commons.log.Log;
import com.jumio.commons.utils.DeviceRotationManager;
import com.jumio.core.data.ScanMode;
import com.jumio.core.data.UploadType;
import com.jumio.core.error.Error;
import com.jumio.core.models.AdditionalDataPointsModel;
import com.jumio.core.models.AuthorizationModel;
import com.jumio.core.models.CredentialsModel;
import com.jumio.core.models.DigitalSelectionModel;
import com.jumio.core.models.InitiateModel;
import com.jumio.core.models.PhysicalSelectionModel;
import com.jumio.core.models.ReportingModel;
import com.jumio.core.models.ScanPartModel;
import com.jumio.core.models.SettingsModel;
import com.jumio.core.persistence.DataManager;
import com.jumio.core.plugins.PluginRegistryInterface;
import com.jumio.core.util.ReflectionUtil;
import com.jumio.sdk.enums.JumioScanStep;
import com.jumio.sdk.retry.JumioRetryReason;
import com.kubi.mine.lib.jsapi.KCTurboSystemSettingsModuleImpl;
import com.tencent.bugly.proguard.C33556b3;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.util.Locale;
import java.util.Map;
import jumio.core.AbstractC40664g1;
import jumio.core.AbstractC40735u2;
import jumio.core.EnumC40670h2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.collections.ArraysKt;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001c\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0001H\u0007J\u001c\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u00182\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0001H\u0007J(\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020\u001b2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0001H\u0007J0\u0010\u001c\u001a\u00020\u00132\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&H\u0007J\u0010\u0010'\u001a\u00020\u00132\u0006\u0010\u001d\u001a\u00020\u001eH\u0007J\u0010\u0010(\u001a\u00020\u00132\u0006\u0010(\u001a\u00020)H\u0007J\u001c\u0010*\u001a\u00020\u00132\u0006\u0010+\u001a\u00020\u001b2\n\b\u0002\u0010,\u001a\u0004\u0018\u00010-H\u0007J\u001c\u0010.\u001a\u00020\u00132\u0006\u0010+\u001a\u00020\u001b2\n\b\u0002\u0010,\u001a\u0004\u0018\u00010-H\u0007J\u001c\u0010/\u001a\u00020\u00132\u0006\u0010+\u001a\u00020\u001b2\n\b\u0002\u0010,\u001a\u0004\u0018\u00010-H\u0007J,\u00100\u001a\u00020\u00132\u0006\u00101\u001a\u00020\u00052\u0006\u00102\u001a\u00020\u00052\u0006\u00103\u001a\u0002042\n\b\u0002\u00105\u001a\u0004\u0018\u00010-H\u0007J\u0018\u00106\u001a\u00020\u00132\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 H\u0007J\u001c\u00107\u001a\u00020\u00132\u0006\u0010+\u001a\u00020\u001b2\n\b\u0002\u0010,\u001a\u0004\u0018\u00010-H\u0007J \u00108\u001a\u00020\u00132\u0006\u00109\u001a\u00020:2\u0006\u0010;\u001a\u00020<2\u0006\u0010=\u001a\u00020&H\u0007J\u000e\u0010>\u001a\u00020\u001b2\u0006\u0010?\u001a\u00020@R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006A"}, m90084d2 = {"Lcom/jumio/analytics/MobileEvents;", "", "<init>", "()V", "EVENTTYPE_SDKPARAMETERS", "", "EVENTTYPE_MOBILE_DEVICE_INFO", "EVENTTYPE_ALERT", "EVENTTYPE_ADDITIONAL_DATAPOINTS", "EVENTTYPE_REPORTING", "EVENTTYPE_SCANSTEP", "EVENTTYPE_USERACTION", "EVENTTYPE_SDKLIFECYCLE", "EVENTTYPE_EXCEPTION", "EVENTTYPE_NETWORKCALL", "EVENTTYPE_CV", "EVENTTYPE_MISC", "EVENTTYPE_PERFORMANCE", "lifecycle", "Lcom/jumio/analytics/AnalyticsEvent;", "lifecycleType", "Lcom/jumio/analytics/LifecycleType;", "data", "scanStep", "Lcom/jumio/sdk/enums/JumioScanStep;", "userAction", TUIConstants.TIMPush.NOTIFICATION.ACTION, "", "sdkParameters", "context", "Landroid/content/Context;", "dataManager", "Lcom/jumio/core/persistence/DataManager;", "authorizationModel", "Lcom/jumio/core/models/AuthorizationModel;", "pluginRegistryInterface", "Lcom/jumio/core/plugins/PluginRegistryInterface;", "isDefaultUI", "", "deviceInformation", "exception", "", "alert", "eventName", "metaInfo", "Lcom/jumio/analytics/MetaInfo;", "misc", "performance", "networkRequest", "requestCode", "httpCode", "roundtripTime", "", "additionalDetails", "additionalDatapoints", "cvDebugging", "reporting", "reportingModel", "Lcom/jumio/core/models/ReportingModel;", "credentialsModel", "Lcom/jumio/core/models/CredentialsModel;", "canceled", "getTypeFromScanMode", "scanMode", "Lcom/jumio/core/data/ScanMode;", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class MobileEvents {
    public static final int EVENTTYPE_ADDITIONAL_DATAPOINTS = 313;
    public static final int EVENTTYPE_ALERT = 311;
    public static final int EVENTTYPE_CV = 315;
    public static final int EVENTTYPE_EXCEPTION = 305;
    public static final int EVENTTYPE_MISC = 317;
    public static final int EVENTTYPE_MOBILE_DEVICE_INFO = 307;
    public static final int EVENTTYPE_NETWORKCALL = 309;
    public static final int EVENTTYPE_PERFORMANCE = 319;
    public static final int EVENTTYPE_REPORTING = 316;
    public static final int EVENTTYPE_SCANSTEP = 300;
    public static final int EVENTTYPE_SDKLIFECYCLE = 302;
    public static final int EVENTTYPE_SDKPARAMETERS = 306;
    public static final int EVENTTYPE_USERACTION = 301;

    @NotNull
    public static final MobileEvents INSTANCE = new MobileEvents();

    /* JADX INFO: renamed from: a */
    public static final boolean m14421a(StackTraceElement it) {
        Intrinsics.checkNotNullParameter(it, "it");
        String className = it.getClassName();
        Intrinsics.checkNotNullExpressionValue(className, "getClassName(...)");
        if (StringsKt.startsWith$default(className, "com.jumio", false, 2, (Object) null)) {
            return true;
        }
        String className2 = it.getClassName();
        Intrinsics.checkNotNullExpressionValue(className2, "getClassName(...)");
        return StringsKt.startsWith$default(className2, "jumio.", false, 2, (Object) null);
    }

    @JvmStatic
    @NotNull
    public static final AnalyticsEvent additionalDatapoints(@NotNull Context context, @NotNull DataManager dataManager) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(dataManager, "dataManager");
        return new AnalyticsEvent(313, "noValue", AdditionalDataPointsModel.m14548a((AdditionalDataPointsModel) dataManager.get(AdditionalDataPointsModel.class), context));
    }

    @JvmStatic
    @NotNull
    public static final AnalyticsEvent alert(@NotNull String eventName, @Nullable MetaInfo metaInfo) {
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        return new AnalyticsEvent(311, eventName, metaInfo);
    }

    public static /* synthetic */ AnalyticsEvent alert$default(String str, MetaInfo metaInfo, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            metaInfo = null;
        }
        return alert(str, metaInfo);
    }

    @JvmStatic
    @NotNull
    public static final AnalyticsEvent cvDebugging(@NotNull String eventName, @Nullable MetaInfo metaInfo) {
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        return new AnalyticsEvent(315, eventName, metaInfo);
    }

    public static /* synthetic */ AnalyticsEvent cvDebugging$default(String str, MetaInfo metaInfo, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            metaInfo = null;
        }
        return cvDebugging(str, metaInfo);
    }

    @JvmStatic
    @NotNull
    public static final AnalyticsEvent deviceInformation(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        NfcAdapter defaultAdapter = NfcAdapter.getDefaultAdapter(context);
        boolean z11 = false;
        String strSubstring = "4.17.0 (1)".substring(0, StringsKt.indexOf$default((CharSequence) "4.17.0 (1)", " (", 0, false, 6, (Object) null));
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        MetaInfo metaInfo = new MetaInfo();
        metaInfo.put("sdk-version", strSubstring);
        metaInfo.put(C33556b3.f69078o2, KCTurboSystemSettingsModuleImpl.PLATFORM_ANDROID);
        metaInfo.put("os-version", String.valueOf(Build.VERSION.SDK_INT));
        metaInfo.put("manufacturer", Build.MANUFACTURER);
        metaInfo.put("model", Build.MODEL);
        metaInfo.put("hasDeviceNFC", Boolean.valueOf(context.getPackageManager().hasSystemFeature("android.hardware.nfc")));
        if (defaultAdapter != null && defaultAdapter.isEnabled()) {
            z11 = true;
        }
        metaInfo.put("wasNFCenabled", Boolean.valueOf(z11));
        metaInfo.put("isTablet", Boolean.valueOf(DeviceRotationManager.INSTANCE.isTabletDevice(context)));
        return new AnalyticsEvent(307, "noValue", metaInfo);
    }

    @JvmStatic
    @NotNull
    public static final AnalyticsEvent exception(@NotNull Throwable exception) {
        Intrinsics.checkNotNullParameter(exception, "exception");
        MetaInfo metaInfo = new MetaInfo();
        metaInfo.put("message", ArraysKt.joinToString$default(AbstractC40664g1.m89254a(exception, new Function1() { // from class: d9.b
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(MobileEvents.m14421a((StackTraceElement) obj));
            }
        }), ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 62, (Object) null));
        return new AnalyticsEvent(305, "exception", metaInfo);
    }

    @JvmStatic
    @NotNull
    public static final AnalyticsEvent lifecycle(@NotNull EnumC40670h2 lifecycleType, @Nullable Object obj) {
        Error error;
        Intrinsics.checkNotNullParameter(lifecycleType, "lifecycleType");
        MetaInfo metaInfo = new MetaInfo();
        if (AbstractC40735u2.f90444a[lifecycleType.ordinal()] == 1 && (error = (Error) obj) != null) {
            metaInfo.put("code", error.getCode());
            metaInfo.put("retryPossible", Boolean.valueOf(error.isRetryable()));
        }
        return new AnalyticsEvent(302, lifecycleType.toString(), metaInfo);
    }

    public static /* synthetic */ AnalyticsEvent lifecycle$default(EnumC40670h2 enumC40670h2, Object obj, int i11, Object obj2) {
        if ((i11 & 2) != 0) {
            obj = null;
        }
        return lifecycle(enumC40670h2, obj);
    }

    @JvmStatic
    @NotNull
    public static final AnalyticsEvent misc(@NotNull String eventName, @Nullable MetaInfo metaInfo) {
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        return new AnalyticsEvent(317, eventName, metaInfo);
    }

    public static /* synthetic */ AnalyticsEvent misc$default(String str, MetaInfo metaInfo, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            metaInfo = null;
        }
        return misc(str, metaInfo);
    }

    @JvmStatic
    @NotNull
    public static final AnalyticsEvent networkRequest(int requestCode, int httpCode, long roundtripTime, @Nullable MetaInfo additionalDetails) {
        MetaInfo metaInfo = new MetaInfo();
        metaInfo.put("http", Integer.valueOf(httpCode));
        metaInfo.put("roundtrip", Long.valueOf(roundtripTime));
        if (additionalDetails != null && !additionalDetails.isEmpty()) {
            metaInfo.put("additional_details", additionalDetails);
        }
        return new AnalyticsEvent(309, StringsKt.padStart(String.valueOf(requestCode), 2, '0'), metaInfo);
    }

    public static /* synthetic */ AnalyticsEvent networkRequest$default(int i11, int i12, long j11, MetaInfo metaInfo, int i13, Object obj) {
        if ((i13 & 8) != 0) {
            metaInfo = null;
        }
        return networkRequest(i11, i12, j11, metaInfo);
    }

    @JvmStatic
    @NotNull
    public static final AnalyticsEvent performance(@NotNull String eventName, @Nullable MetaInfo metaInfo) {
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        return new AnalyticsEvent(EVENTTYPE_PERFORMANCE, eventName, metaInfo);
    }

    public static /* synthetic */ AnalyticsEvent performance$default(String str, MetaInfo metaInfo, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            metaInfo = null;
        }
        return performance(str, metaInfo);
    }

    @JvmStatic
    @NotNull
    public static final AnalyticsEvent reporting(@NotNull ReportingModel reportingModel, @NotNull CredentialsModel credentialsModel, boolean canceled) {
        Intrinsics.checkNotNullParameter(reportingModel, "reportingModel");
        Intrinsics.checkNotNullParameter(credentialsModel, "credentialsModel");
        return new AnalyticsEvent(316, "noValue", reportingModel.m14564a(credentialsModel, canceled));
    }

    @JvmStatic
    @NotNull
    public static final AnalyticsEvent scanStep(@NotNull JumioScanStep scanStep, @Nullable Object data) {
        Intrinsics.checkNotNullParameter(scanStep, "scanStep");
        MetaInfo metaInfo = new MetaInfo();
        if (data instanceof ScanPartModel) {
            ScanPartModel scanPartModel = (ScanPartModel) data;
            metaInfo.put("side", scanPartModel.getF14312a().toString());
            metaInfo.put("type", scanPartModel.getF14313b().toString());
        } else if (data instanceof JumioRetryReason) {
            metaInfo.put("retryCode", Integer.valueOf(((JumioRetryReason) data).getF14742a()));
        } else if (data instanceof MetaInfo) {
            metaInfo.putAll((Map) data);
        } else if ((data instanceof Map) || (data instanceof String)) {
            metaInfo.put("additionalData", data);
        }
        String lowerCase = scanStep.toString().toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        return new AnalyticsEvent(300, lowerCase, metaInfo);
    }

    public static /* synthetic */ AnalyticsEvent scanStep$default(JumioScanStep jumioScanStep, Object obj, int i11, Object obj2) {
        if ((i11 & 2) != 0) {
            obj = null;
        }
        return scanStep(jumioScanStep, obj);
    }

    @JvmStatic
    @NotNull
    public static final AnalyticsEvent sdkParameters(@NotNull Context context, @NotNull DataManager dataManager, @NotNull AuthorizationModel authorizationModel, @NotNull PluginRegistryInterface pluginRegistryInterface, boolean isDefaultUI) {
        String str;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(dataManager, "dataManager");
        Intrinsics.checkNotNullParameter(authorizationModel, "authorizationModel");
        Intrinsics.checkNotNullParameter(pluginRegistryInterface, "pluginRegistryInterface");
        MetaInfo metaInfo = new MetaInfo();
        metaInfo.put("dataCenter", authorizationModel.getF14183a().toString());
        metaInfo.put("modules", pluginRegistryInterface.getLinkedModulesCode());
        ReflectionUtil reflectionUtil = ReflectionUtil.INSTANCE;
        if (reflectionUtil.hasClass("com.facebook.react.ReactActivity")) {
            str = "React";
        } else if (reflectionUtil.hasClass("org.apache.cordova.CordovaActivity")) {
            str = "Cordova";
        } else {
            str = reflectionUtil.hasClass("io.flutter.embedding.android.FlutterActivity") ? "Flutter" : "Native";
        }
        metaInfo.put("platform", str);
        metaInfo.put("integration", isDefaultUI ? "DUI" : "CUI");
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            Intrinsics.checkNotNullExpressionValue(packageInfo, "getPackageInfo(...)");
            metaInfo.put(RemoteConfigConstants.RequestFieldKey.APP_VERSION, packageInfo.versionName + " (" + PackageInfoCompat.getLongVersionCode(packageInfo) + ')');
        } catch (Exception e11) {
            Log.printStackTrace(e11);
        }
        metaInfo.put("accountId", ((InitiateModel) dataManager.get(InitiateModel.class)).f14255a);
        metaInfo.put("scanMode", ((SettingsModel) dataManager.get(SettingsModel.class)).getWorkflowDefinitionKey());
        return new AnalyticsEvent(306, "noValue", metaInfo);
    }

    @JvmStatic
    @NotNull
    public static final AnalyticsEvent userAction(@NotNull String action, @Nullable JumioScanStep scanStep, @Nullable Object data) {
        Intrinsics.checkNotNullParameter(action, "action");
        MetaInfo metaInfo = new MetaInfo();
        if (data instanceof String) {
            metaInfo.put("additionalData", data);
        } else if (data instanceof PhysicalSelectionModel) {
            PhysicalSelectionModel physicalSelectionModel = (PhysicalSelectionModel) data;
            metaInfo.put("country", physicalSelectionModel.getF14323a().getF13765a());
            metaInfo.put("type", physicalSelectionModel.getF14302b().getF13814a().toString());
            metaInfo.put("idStyle", physicalSelectionModel.getF14303c().getF13809a().toString());
        } else if (data instanceof DigitalSelectionModel) {
            DigitalSelectionModel digitalSelectionModel = (DigitalSelectionModel) data;
            metaInfo.put("country", digitalSelectionModel.getF14323a().getF13765a());
            metaInfo.put("type", "DIGITAL");
            metaInfo.put("idStyle", digitalSelectionModel.getF14214b().getF13775a());
        } else if (data instanceof MetaInfo) {
            metaInfo.putAll((Map) data);
        }
        if (scanStep != null) {
            metaInfo.put(TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, scanStep.toString());
        }
        return new AnalyticsEvent(301, action, metaInfo);
    }

    public static /* synthetic */ AnalyticsEvent userAction$default(String str, JumioScanStep jumioScanStep, Object obj, int i11, Object obj2) {
        if ((i11 & 2) != 0) {
            jumioScanStep = null;
        }
        if ((i11 & 4) != 0) {
            obj = null;
        }
        return userAction(str, jumioScanStep, obj);
    }

    @NotNull
    public final String getTypeFromScanMode(@NotNull ScanMode scanMode) {
        Intrinsics.checkNotNullParameter(scanMode, "scanMode");
        switch (AbstractC40735u2.f90445b[scanMode.ordinal()]) {
            case 1:
                return "DOCFINDER";
            case 2:
                return "BARCODE_NATIVE";
            case 3:
                return "FACE_MANUAL";
            case 4:
                return "MANUAL";
            case 5:
                return "NFC";
            case 6:
                return UploadType.JUMIO_LIVENESS;
            case 7:
                return "JUMIO_PREMIUM";
            case 8:
                return "FILE";
            case 9:
                return "DIGITAL_IDENTITY";
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
