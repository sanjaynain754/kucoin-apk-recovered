package com.sumsub.sns.core;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import androidx.annotation.CallSuper;
import androidx.annotation.Keep;
import androidx.camera.core.CameraInfo;
import androidx.core.content.p020pm.PackageInfoCompat;
import androidx.fragment.app.Fragment;
import com.google.android.gms.security.ProviderInstaller;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.kubi.sdk.BaseActivity;
import com.sumsub.log.logger.Logger;
import com.sumsub.sentry.AbstractC27905Y;
import com.sumsub.sns.R$style;
import com.sumsub.sns.core.data.listener.SNSCompleteHandler;
import com.sumsub.sns.core.data.listener.SNSDefaultIconHandler;
import com.sumsub.sns.core.data.listener.SNSErrorHandler;
import com.sumsub.sns.core.data.listener.SNSEventHandler;
import com.sumsub.sns.core.data.listener.SNSIconHandler;
import com.sumsub.sns.core.data.listener.SNSInstructionsViewHandler;
import com.sumsub.sns.core.data.listener.SNSStateChangedHandler;
import com.sumsub.sns.core.data.listener.SNSUrlHandler;
import com.sumsub.sns.core.data.listener.TokenExpirationHandler;
import com.sumsub.sns.core.data.model.DayNightMode;
import com.sumsub.sns.core.data.model.SNSDocumentDefinition;
import com.sumsub.sns.core.data.model.SNSException;
import com.sumsub.sns.core.data.model.SNSInitConfig;
import com.sumsub.sns.core.data.model.SNSInvalidParametersException;
import com.sumsub.sns.core.data.model.SNSSDKState;
import com.sumsub.sns.core.data.model.SNSSupportItem;
import com.sumsub.sns.core.presentation.AbstractC28047a;
import com.sumsub.sns.core.theme.SNSJsonCustomization;
import com.sumsub.sns.core.theme.SNSJsonCustomizationImpl;
import com.sumsub.sns.core.theme.SNSJsonCustomizationSource;
import com.sumsub.sns.core.theme.SNSTheme;
import com.sumsub.sns.internal.core.analytics.C28366e;
import com.sumsub.sns.internal.core.analytics.C28368g;
import com.sumsub.sns.internal.core.analytics.Domain;
import com.sumsub.sns.internal.core.analytics.Screen;
import com.sumsub.sns.internal.core.analytics.SdkEvent;
import com.sumsub.sns.internal.core.common.AbstractC28393F0;
import com.sumsub.sns.internal.core.common.AbstractC28409N0;
import com.sumsub.sns.internal.core.common.AbstractC28413P0;
import com.sumsub.sns.internal.core.common.AbstractC28416R0;
import com.sumsub.sns.internal.core.common.AbstractC28458h;
import com.sumsub.sns.internal.core.common.C28468k0;
import com.sumsub.sns.internal.core.common.SNSSession;
import com.sumsub.sns.internal.core.domain.C28578h;
import com.sumsub.sns.internal.core.exception.C28618c;
import com.sumsub.sns.internal.core.exception.SNSCallbacksLostOnRestoreException;
import com.sumsub.sns.internal.features.data.repository.analytics.C29903a;
import com.sumsub.sns.internal.features.presentation.camera.photo.C30669g;
import com.sumsub.sns.internal.features.presentation.camera.photo.document.C30468J;
import com.sumsub.sns.internal.features.presentation.camera.photo.document.C30471K;
import com.sumsub.sns.internal.features.presentation.camera.photo.selfie.C30716l;
import com.sumsub.sns.internal.features.presentation.camera.photo.selfie.C30717m;
import com.sumsub.sns.internal.features.presentation.camera.video.C30776i;
import com.sumsub.sns.internal.features.presentation.consent.C30855f;
import com.sumsub.sns.internal.features.presentation.country.picker.CountryPickerDialog;
import com.sumsub.sns.internal.features.presentation.dialogs.bottomsheet.C30915a;
import com.sumsub.sns.internal.features.presentation.exitsurvey.C31023g;
import com.sumsub.sns.internal.features.presentation.intro.C31157j;
import com.sumsub.sns.internal.features.presentation.paymentmethod.selector.C31401h;
import com.sumsub.sns.internal.features.presentation.paymentmethod.upload.C31428h;
import com.sumsub.sns.internal.features.presentation.preview.applicantdata.C31490h;
import com.sumsub.sns.internal.features.presentation.preview.photo.common.C31776f;
import com.sumsub.sns.internal.features.presentation.preview.photo.identity.C31808l;
import com.sumsub.sns.internal.features.presentation.preview.photo.mrtd.C31832F;
import com.sumsub.sns.internal.features.presentation.preview.selfie.C31947g;
import com.sumsub.sns.internal.features.presentation.prooface.SNSDefaultLiveness3dFaceFragment;
import com.sumsub.sns.internal.features.presentation.prooface.SNSLiveness3dFaceFragment;
import com.sumsub.sns.internal.features.presentation.questionnaire.SNSQuestionnaireFragment;
import com.sumsub.sns.internal.features.presentation.restrictions.C32348n;
import com.sumsub.sns.internal.features.presentation.status.C32435m;
import com.sumsub.sns.internal.features.presentation.support.C32615f;
import com.sumsub.sns.internal.features.presentation.verification.C32730p;
import com.sumsub.sns.internal.features.presentation.videoident.presentation.SNSVideoIdentFragment;
import com.sumsub.sns.internal.log.C33270a;
import com.sumsub.sns.internal.log.C33272c;
import com.sumsub.sns.internal.log.HandlerC33271b;
import com.sumsub.sns.internal.log.LoggerType;
import com.sumsub.sns.internal.log.cacher.AbstractC33277e;
import com.sumsub.sns.internal.log.cacher.C33276d;
import com.sumsub.sns.internal.log.cacher.InterfaceC33275c;
import com.sumsub.sns.internal.log.logger.C33295a;
import com.sumsub.sns.internal.log.logger.C33304j;
import com.sumsub.sns.internal.log.logger.C33305k;
import com.sumsub.sns.internal.p125ff.C33048a;
import com.sumsub.sns.internal.p125ff.core.C33050a;
import com.sumsub.sns.internal.p125ff.core.C33051b;
import com.sumsub.sns.internal.p125ff.core.C33052c;
import com.sumsub.sns.internal.p125ff.core.FeatureFlagValueType;
import com.tencent.bugly.proguard.InterfaceC33617e1;
import java.lang.ref.WeakReference;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReference;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.C41713n0;
import kotlinx.coroutines.InterfaceC41775x1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.collections.MapsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;

/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@Keep
@Metadata(m90083d1 = {"\u0000Þ\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\bÇ\u0002\u0018\u00002\u00020\u0001:\u0006\u008a\u0001\u008b\u0001\u008c\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\f\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\r\u001a\u00020\t¢\u0006\u0004\b\r\u0010\u0003J\u001a\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u000e\u001a\u00020\u0004H\u0096\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000e\u001a\u00020\u0004H\u0096\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0019\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u001a\u0010\u0018R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR$\u0010\u001f\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001d8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R$\u0010$\u001a\u00020#2\u0006\u0010\u001e\u001a\u00020#8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\"\u0010(\u001a\u00020\u00128\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R$\u0010/\u001a\u0004\u0018\u00010.8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b/\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\u0016\u00105\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u0010)R\u0016\u00106\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u0010)R\u0014\u00108\u001a\u0002078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0013\u0010=\u001a\u0004\u0018\u00010:8F¢\u0006\u0006\u001a\u0004\b;\u0010<R\u0013\u0010A\u001a\u0004\u0018\u00010>8F¢\u0006\u0006\u001a\u0004\b?\u0010@R\u0014\u0010C\u001a\u00020\u00048\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bB\u0010\u0006R\u0014\u0010E\u001a\u00020#8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bD\u0010'R\u0014\u0010G\u001a\u00020\u00048\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bF\u0010\u0006R\u0014\u0010K\u001a\u00020H8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bI\u0010JR\u0014\u0010L\u001a\u00020\u00128\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bL\u0010+R\u0014\u0010P\u001a\u00020M8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bN\u0010OR\u0016\u0010T\u001a\u0004\u0018\u00010Q8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bR\u0010SR\"\u0010X\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010U8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bV\u0010WR\u0016\u0010\\\u001a\u0004\u0018\u00010Y8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bZ\u0010[R\u0016\u0010`\u001a\u0004\u0018\u00010]8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b^\u0010_R\u0016\u0010d\u001a\u0004\u0018\u00010a8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bb\u0010cR\u0014\u0010h\u001a\u00020e8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bf\u0010gR\u0016\u0010l\u001a\u0004\u0018\u00010i8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bj\u0010kR\u0016\u0010p\u001a\u0004\u0018\u00010m8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bn\u0010oR\u0016\u0010t\u001a\u0004\u0018\u00010q8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\br\u0010sR$\u0010{\u001a\n\u0012\u0004\u0012\u00020v\u0018\u00010u8\u0016@\u0016X\u0096\u000f¢\u0006\f\u001a\u0004\bw\u0010x\"\u0004\by\u0010zR\"\u0010~\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020|\u0018\u00010U8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b}\u0010WR\u0018\u0010\u0081\u0001\u001a\u0004\u0018\u00010#8\u0016X\u0096\u0005¢\u0006\u0007\u001a\u0005\b\u007f\u0010\u0080\u0001R\u001a\u0010\u0085\u0001\u001a\u0005\u0018\u00010\u0082\u00018\u0016X\u0096\u0005¢\u0006\b\u001a\u0006\b\u0083\u0001\u0010\u0084\u0001R\u0016\u0010\u0087\u0001\u001a\u00020\u00048\u0016X\u0096\u0005¢\u0006\u0007\u001a\u0005\b\u0086\u0001\u0010\u0006R\u001c\u0010\u0089\u0001\u001a\b\u0012\u0004\u0012\u00020\u000f0u8BX\u0082\u0004¢\u0006\u0007\u001a\u0005\b\u0088\u0001\u0010x¨\u0006\u008d\u0001"}, m90084d2 = {"Lcom/sumsub/sns/core/SNSMobileSDK;", "Lcom/sumsub/sns/core/MobileSdk;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "Landroid/content/Context;", "applicationContext", "", "restore$idensic_mobile_sdk_aar_defaultRelease", "(Landroid/content/Context;)V", "restore", "shutdown", "className", "Lcom/sumsub/sns/core/SNSModule;", "getPluggedModule", "(Ljava/lang/String;)Lcom/sumsub/sns/core/SNSModule;", "", "isModuleAvailable", "(Ljava/lang/String;)Z", "Lcom/sumsub/sns/core/SNSMobileSDK$SDK;", "sdk", "start", "(Lcom/sumsub/sns/core/SNSMobileSDK$SDK;)V", "initLogger", "initFeatures", "_sdk", "Lcom/sumsub/sns/core/SNSMobileSDK$SDK;", "Lcom/sumsub/log/logger/Logger;", "value", "logTree", "Lcom/sumsub/log/logger/Logger;", "getLogTree", "()Lcom/sumsub/log/logger/Logger;", "", BaseActivity.THEME, "I", "getTheme", "()I", "xmlThemeUsed", "Z", "getXmlThemeUsed$idensic_mobile_sdk_aar_defaultRelease", "()Z", "setXmlThemeUsed$idensic_mobile_sdk_aar_defaultRelease", "(Z)V", "Lcom/sumsub/sns/core/theme/SNSJsonCustomizationSource;", "customizationSource", "Lcom/sumsub/sns/core/theme/SNSJsonCustomizationSource;", "getCustomizationSource$idensic_mobile_sdk_aar_defaultRelease", "()Lcom/sumsub/sns/core/theme/SNSJsonCustomizationSource;", "setCustomizationSource$idensic_mobile_sdk_aar_defaultRelease", "(Lcom/sumsub/sns/core/theme/SNSJsonCustomizationSource;)V", "isStartedInProcess", "isCallbacksLostReported", "Lcom/sumsub/sns/internal/core/exception/c;", "exceptionHandlerInstaller", "Lcom/sumsub/sns/internal/core/exception/c;", "Lcom/sumsub/sns/core/data/listener/SNSCompleteHandler;", "getCompleteHandler", "()Lcom/sumsub/sns/core/data/listener/SNSCompleteHandler;", "completeHandler", "Lcom/sumsub/sns/core/data/model/DayNightMode;", "getForcedDayNightMode", "()Lcom/sumsub/sns/core/data/model/DayNightMode;", "forcedDayNightMode", "getVersionName", "versionName", "getVersionCode", "versionCode", "getPackageName", RemoteConfigConstants.RequestFieldKey.PACKAGE_NAME, "Ljava/util/Locale;", "getLocale", "()Ljava/util/Locale;", "locale", "isDebug", "Lcom/sumsub/sns/core/data/model/SNSSDKState;", "getState", "()Lcom/sumsub/sns/core/data/model/SNSSDKState;", "state", "Lcom/sumsub/sns/core/data/model/SNSInitConfig;", "getConf", "()Lcom/sumsub/sns/core/data/model/SNSInitConfig;", "conf", "", "getSettings", "()Ljava/util/Map;", "settings", "Lcom/sumsub/sns/core/data/listener/TokenExpirationHandler;", "getTokenExpirationHandler", "()Lcom/sumsub/sns/core/data/listener/TokenExpirationHandler;", "tokenExpirationHandler", "Lcom/sumsub/sns/core/data/listener/SNSErrorHandler;", "getErrorHandler", "()Lcom/sumsub/sns/core/data/listener/SNSErrorHandler;", "errorHandler", "Lcom/sumsub/sns/core/data/listener/SNSStateChangedHandler;", "getStateChangedHandler", "()Lcom/sumsub/sns/core/data/listener/SNSStateChangedHandler;", "stateChangedHandler", "Lcom/sumsub/sns/core/data/listener/SNSIconHandler;", "getIconHandler", "()Lcom/sumsub/sns/core/data/listener/SNSIconHandler;", "iconHandler", "Lcom/sumsub/sns/core/data/listener/SNSEventHandler;", "getEventHandler", "()Lcom/sumsub/sns/core/data/listener/SNSEventHandler;", "eventHandler", "Lcom/sumsub/sns/core/theme/SNSJsonCustomization;", "getCustomization", "()Lcom/sumsub/sns/core/theme/SNSJsonCustomization;", "customization", "Lcom/sumsub/sns/core/data/listener/SNSInstructionsViewHandler;", "getInstructionsViewHandler", "()Lcom/sumsub/sns/core/data/listener/SNSInstructionsViewHandler;", "instructionsViewHandler", "", "Lcom/sumsub/sns/core/data/model/SNSSupportItem;", "getSupportItems", "()Ljava/util/List;", "setSupportItems", "(Ljava/util/List;)V", "supportItems", "Lcom/sumsub/sns/core/data/model/SNSDocumentDefinition;", "getPreferredDocumentsDefinitions", "preferredDocumentsDefinitions", "getAutoCloseOnApproveTimeout", "()Ljava/lang/Integer;", "autoCloseOnApproveTimeout", "Lcom/sumsub/sns/core/data/listener/SNSUrlHandler;", "getUrlHandler", "()Lcom/sumsub/sns/core/data/listener/SNSUrlHandler;", "urlHandler", "getVersion", "version", "getModules", "modules", "Builder", "SNSSDK", "SDK", "idensic-mobile-sdk-aar_defaultRelease"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nSNSMobileSDK.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SNSMobileSDK.kt\ncom/sumsub/sns/core/SNSMobileSDK\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,663:1\n1563#2:664\n1634#2,3:665\n1869#2,2:668\n1#3:670\n*S KotlinDebug\n*F\n+ 1 SNSMobileSDK.kt\ncom/sumsub/sns/core/SNSMobileSDK\n*L\n258#1:664\n258#1:665,3\n259#1:668,2\n*E\n"})
public final class SNSMobileSDK implements MobileSdk {

    @NotNull
    public static final SNSMobileSDK INSTANCE = new SNSMobileSDK();

    @Nullable
    private static SDK _sdk;

    @Nullable
    private static SNSJsonCustomizationSource customizationSource;

    @NotNull
    private static final C28618c exceptionHandlerInstaller;
    private static boolean isCallbacksLostReported;
    private static boolean isStartedInProcess;

    @NotNull
    private static Logger logTree;
    private static int theme;
    private static boolean xmlThemeUsed;
    private final /* synthetic */ C28468k0 $$delegate_0 = C28468k0.f57983a;

    /* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
    @Metadata(m90083d1 = {"\u0000Ö\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\bJ!\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u00002\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u00002\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u0016¢\u0006\u0004\b\u001b\u0010\u0019J\u0015\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ\u0015\u0010\"\u001a\u00020\u00002\u0006\u0010!\u001a\u00020 ¢\u0006\u0004\b\"\u0010#J#\u0010'\u001a\u00020\u00002\u0014\u0010&\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020%\u0018\u00010$¢\u0006\u0004\b'\u0010(J\u0015\u0010+\u001a\u00020\u00002\u0006\u0010*\u001a\u00020)¢\u0006\u0004\b+\u0010,J\r\u0010.\u001a\u00020-¢\u0006\u0004\b.\u0010/R\u001a\u00101\u001a\u0002008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R \u00106\u001a\b\u0012\u0004\u0012\u00020\u0002058\u0000X\u0080\u0004¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R$\u0010\u0005\u001a\u00020\u00042\u0006\u0010:\u001a\u00020\u00048\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b\u0005\u0010;\u001a\u0004\b<\u0010=R(\u0010\t\u001a\u0004\u0018\u00010\u00042\b\u0010:\u001a\u0004\u0018\u00010\u00048\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b\t\u0010;\u001a\u0004\b>\u0010=R(\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010:\u001a\u0004\u0018\u00010\n8\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b\u000b\u0010?\u001a\u0004\b@\u0010AR(\u0010C\u001a\u0004\u0018\u00010B2\b\u0010:\u001a\u0004\u0018\u00010B8\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\bC\u0010D\u001a\u0004\bE\u0010FR(\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010:\u001a\u0004\u0018\u00010\u000e8\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b\u000f\u0010G\u001a\u0004\bH\u0010IR(\u0010K\u001a\u0004\u0018\u00010J2\b\u0010:\u001a\u0004\u0018\u00010J8\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\bK\u0010L\u001a\u0004\bM\u0010NR(\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\u0010:\u001a\u0004\u0018\u00010\u00128\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b\u0013\u0010O\u001a\u0004\bP\u0010QR$\u0010S\u001a\u0004\u0018\u00010R8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bS\u0010T\u001a\u0004\bU\u0010V\"\u0004\bW\u0010XR(\u0010Z\u001a\u0004\u0018\u00010Y2\b\u0010:\u001a\u0004\u0018\u00010Y8\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\bZ\u0010[\u001a\u0004\b\\\u0010]R$\u0010\u001a\u001a\u00020\u00162\u0006\u0010:\u001a\u00020\u00168\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b\u001a\u0010^\u001a\u0004\b_\u0010`R$\u0010b\u001a\u0004\u0018\u00010a8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bb\u0010c\u001a\u0004\bd\u0010e\"\u0004\bf\u0010gR0\u0010j\u001a\b\u0012\u0004\u0012\u00020i0h2\f\u0010:\u001a\b\u0012\u0004\u0012\u00020i0h8\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\bj\u0010k\u001a\u0004\bl\u0010mR4\u0010o\u001a\n\u0012\u0004\u0012\u00020n\u0018\u00010h2\u000e\u0010:\u001a\n\u0012\u0004\u0012\u00020n\u0018\u00010h8\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\bo\u0010k\u001a\u0004\bp\u0010mR$\u0010q\u001a\u00020\u00162\u0006\u0010:\u001a\u00020\u00168\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\bq\u0010^\u001a\u0004\br\u0010`R$\u0010t\u001a\u00020s2\u0006\u0010:\u001a\u00020s8\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\bt\u0010u\u001a\u0004\bv\u0010wR$\u0010\u001d\u001a\u00020\u001c2\u0006\u0010:\u001a\u00020\u001c8\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b\u001d\u0010x\u001a\u0004\by\u0010zR(\u0010!\u001a\u0004\u0018\u00010)2\b\u0010:\u001a\u0004\u0018\u00010)8\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b!\u0010{\u001a\u0004\b|\u0010}R)\u0010\u007f\u001a\u0004\u0018\u00010~8\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0005\b\u007f\u0010\u0080\u0001\u001a\u0006\b\u0081\u0001\u0010\u0082\u0001\"\u0006\b\u0083\u0001\u0010\u0084\u0001R,\u0010\u0086\u0001\u001a\u0005\u0018\u00010\u0085\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b\u0086\u0001\u0010\u0087\u0001\u001a\u0006\b\u0088\u0001\u0010\u0089\u0001\"\u0006\b\u008a\u0001\u0010\u008b\u0001R7\u0010\u008c\u0001\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010$8\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b\u008c\u0001\u0010\u008d\u0001\u001a\u0006\b\u008e\u0001\u0010\u008f\u0001\"\u0006\b\u0090\u0001\u0010\u0091\u0001R7\u0010\u0092\u0001\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020%\u0018\u00010$8\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b\u0092\u0001\u0010\u008d\u0001\u001a\u0006\b\u0093\u0001\u0010\u008f\u0001\"\u0006\b\u0094\u0001\u0010\u0091\u0001R)\u0010\u0095\u0001\u001a\u0004\u0018\u00010)8\u0000@\u0000X\u0080\u000e¢\u0006\u0016\n\u0005\b\u0095\u0001\u0010{\u001a\u0005\b\u0096\u0001\u0010}\"\u0006\b\u0097\u0001\u0010\u0098\u0001R,\u0010\u009a\u0001\u001a\u0005\u0018\u00010\u0099\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b\u009a\u0001\u0010\u009b\u0001\u001a\u0006\b\u009c\u0001\u0010\u009d\u0001\"\u0006\b\u009e\u0001\u0010\u009f\u0001R,\u0010¡\u0001\u001a\u0005\u0018\u00010 \u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b¡\u0001\u0010¢\u0001\u001a\u0006\b£\u0001\u0010¤\u0001\"\u0006\b¥\u0001\u0010¦\u0001¨\u0006§\u0001"}, m90084d2 = {"Lcom/sumsub/sns/core/SNSMobileSDK$Builder;", "", "Landroid/app/Activity;", "activity", "", "url", "<init>", "(Landroid/app/Activity;Ljava/lang/String;)V", "(Landroid/app/Activity;)V", "accessToken", "Lcom/sumsub/sns/core/data/listener/TokenExpirationHandler;", "onTokenExpiration", "withAccessToken", "(Ljava/lang/String;Lcom/sumsub/sns/core/data/listener/TokenExpirationHandler;)Lcom/sumsub/sns/core/SNSMobileSDK$Builder;", "Lcom/sumsub/sns/core/data/listener/SNSCompleteHandler;", "completeHandler", "withCompleteHandler", "(Lcom/sumsub/sns/core/data/listener/SNSCompleteHandler;)Lcom/sumsub/sns/core/SNSMobileSDK$Builder;", "Lcom/sumsub/sns/core/data/listener/SNSEventHandler;", "eventHandler", "withEventHandler", "(Lcom/sumsub/sns/core/data/listener/SNSEventHandler;)Lcom/sumsub/sns/core/SNSMobileSDK$Builder;", "", "debug", "withDebug", "(Z)Lcom/sumsub/sns/core/SNSMobileSDK$Builder;", "isAnalyticsEnabled", "withAnalyticsEnabled", "Ljava/util/Locale;", "locale", "withLocale", "(Ljava/util/Locale;)Lcom/sumsub/sns/core/SNSMobileSDK$Builder;", "Lcom/sumsub/sns/core/theme/SNSTheme;", BaseActivity.THEME, "withTheme", "(Lcom/sumsub/sns/core/theme/SNSTheme;)Lcom/sumsub/sns/core/SNSMobileSDK$Builder;", "", "Lcom/sumsub/sns/core/data/model/SNSDocumentDefinition;", "definitions", "withPreferredDocumentDefinitions", "(Ljava/util/Map;)Lcom/sumsub/sns/core/SNSMobileSDK$Builder;", "", "timeInSecs", "withAutoCloseOnApprove", "(I)Lcom/sumsub/sns/core/SNSMobileSDK$Builder;", "Lcom/sumsub/sns/core/SNSMobileSDK$SDK;", "build", "()Lcom/sumsub/sns/core/SNSMobileSDK$SDK;", "Landroid/content/Context;", "applicationContext", "Landroid/content/Context;", "getApplicationContext$idensic_mobile_sdk_aar_defaultRelease", "()Landroid/content/Context;", "Ljava/lang/ref/WeakReference;", "weakActivity", "Ljava/lang/ref/WeakReference;", "getWeakActivity$idensic_mobile_sdk_aar_defaultRelease", "()Ljava/lang/ref/WeakReference;", "value", "Ljava/lang/String;", "getUrl$idensic_mobile_sdk_aar_defaultRelease", "()Ljava/lang/String;", "getAccessToken$idensic_mobile_sdk_aar_defaultRelease", "Lcom/sumsub/sns/core/data/listener/TokenExpirationHandler;", "getOnTokenExpiration$idensic_mobile_sdk_aar_defaultRelease", "()Lcom/sumsub/sns/core/data/listener/TokenExpirationHandler;", "Lcom/sumsub/sns/core/data/listener/SNSStateChangedHandler;", "stateChangedHandler", "Lcom/sumsub/sns/core/data/listener/SNSStateChangedHandler;", "getStateChangedHandler$idensic_mobile_sdk_aar_defaultRelease", "()Lcom/sumsub/sns/core/data/listener/SNSStateChangedHandler;", "Lcom/sumsub/sns/core/data/listener/SNSCompleteHandler;", "getCompleteHandler$idensic_mobile_sdk_aar_defaultRelease", "()Lcom/sumsub/sns/core/data/listener/SNSCompleteHandler;", "Lcom/sumsub/sns/core/data/listener/SNSErrorHandler;", "errorHandler", "Lcom/sumsub/sns/core/data/listener/SNSErrorHandler;", "getErrorHandler$idensic_mobile_sdk_aar_defaultRelease", "()Lcom/sumsub/sns/core/data/listener/SNSErrorHandler;", "Lcom/sumsub/sns/core/data/listener/SNSEventHandler;", "getEventHandler$idensic_mobile_sdk_aar_defaultRelease", "()Lcom/sumsub/sns/core/data/listener/SNSEventHandler;", "Lcom/sumsub/sns/core/data/listener/SNSInstructionsViewHandler;", "instructionsHandler", "Lcom/sumsub/sns/core/data/listener/SNSInstructionsViewHandler;", "getInstructionsHandler$idensic_mobile_sdk_aar_defaultRelease", "()Lcom/sumsub/sns/core/data/listener/SNSInstructionsViewHandler;", "setInstructionsHandler$idensic_mobile_sdk_aar_defaultRelease", "(Lcom/sumsub/sns/core/data/listener/SNSInstructionsViewHandler;)V", "Lcom/sumsub/sns/core/data/model/SNSInitConfig;", "conf", "Lcom/sumsub/sns/core/data/model/SNSInitConfig;", "getConf$idensic_mobile_sdk_aar_defaultRelease", "()Lcom/sumsub/sns/core/data/model/SNSInitConfig;", "Z", "isAnalyticsEnabled$idensic_mobile_sdk_aar_defaultRelease", "()Z", "Lcom/sumsub/sns/core/data/listener/SNSIconHandler;", "iconHandler", "Lcom/sumsub/sns/core/data/listener/SNSIconHandler;", "getIconHandler$idensic_mobile_sdk_aar_defaultRelease", "()Lcom/sumsub/sns/core/data/listener/SNSIconHandler;", "setIconHandler$idensic_mobile_sdk_aar_defaultRelease", "(Lcom/sumsub/sns/core/data/listener/SNSIconHandler;)V", "", "Lcom/sumsub/sns/core/SNSModule;", "modules", "Ljava/util/List;", "getModules$idensic_mobile_sdk_aar_defaultRelease", "()Ljava/util/List;", "Lcom/sumsub/sns/core/data/model/SNSSupportItem;", "supportItems", "getSupportItems$idensic_mobile_sdk_aar_defaultRelease", "isDebug", "isDebug$idensic_mobile_sdk_aar_defaultRelease", "Lcom/sumsub/log/logger/Logger;", "logTree", "Lcom/sumsub/log/logger/Logger;", "getLogTree$idensic_mobile_sdk_aar_defaultRelease", "()Lcom/sumsub/log/logger/Logger;", "Ljava/util/Locale;", "getLocale$idensic_mobile_sdk_aar_defaultRelease", "()Ljava/util/Locale;", "Ljava/lang/Integer;", "getTheme$idensic_mobile_sdk_aar_defaultRelease", "()Ljava/lang/Integer;", "Lcom/sumsub/sns/core/theme/SNSJsonCustomization;", "customization", "Lcom/sumsub/sns/core/theme/SNSJsonCustomization;", "getCustomization$idensic_mobile_sdk_aar_defaultRelease", "()Lcom/sumsub/sns/core/theme/SNSJsonCustomization;", "setCustomization$idensic_mobile_sdk_aar_defaultRelease", "(Lcom/sumsub/sns/core/theme/SNSJsonCustomization;)V", "Lcom/sumsub/sns/core/theme/SNSJsonCustomizationSource;", "customizationSource", "Lcom/sumsub/sns/core/theme/SNSJsonCustomizationSource;", "getCustomizationSource$idensic_mobile_sdk_aar_defaultRelease", "()Lcom/sumsub/sns/core/theme/SNSJsonCustomizationSource;", "setCustomizationSource$idensic_mobile_sdk_aar_defaultRelease", "(Lcom/sumsub/sns/core/theme/SNSJsonCustomizationSource;)V", "settings", "Ljava/util/Map;", "getSettings$idensic_mobile_sdk_aar_defaultRelease", "()Ljava/util/Map;", "setSettings$idensic_mobile_sdk_aar_defaultRelease", "(Ljava/util/Map;)V", "preferredDocumentsDefinitions", "getPreferredDocumentsDefinitions$idensic_mobile_sdk_aar_defaultRelease", "setPreferredDocumentsDefinitions$idensic_mobile_sdk_aar_defaultRelease", "autoCloseOnApproveTimeout", "getAutoCloseOnApproveTimeout$idensic_mobile_sdk_aar_defaultRelease", "setAutoCloseOnApproveTimeout$idensic_mobile_sdk_aar_defaultRelease", "(Ljava/lang/Integer;)V", "Lcom/sumsub/sns/core/data/model/DayNightMode;", "forcedDayNightMode", "Lcom/sumsub/sns/core/data/model/DayNightMode;", "getForcedDayNightMode$idensic_mobile_sdk_aar_defaultRelease", "()Lcom/sumsub/sns/core/data/model/DayNightMode;", "setForcedDayNightMode$idensic_mobile_sdk_aar_defaultRelease", "(Lcom/sumsub/sns/core/data/model/DayNightMode;)V", "Lcom/sumsub/sns/core/data/listener/SNSUrlHandler;", "urlHandler", "Lcom/sumsub/sns/core/data/listener/SNSUrlHandler;", "getUrlHandler$idensic_mobile_sdk_aar_defaultRelease", "()Lcom/sumsub/sns/core/data/listener/SNSUrlHandler;", "setUrlHandler$idensic_mobile_sdk_aar_defaultRelease", "(Lcom/sumsub/sns/core/data/listener/SNSUrlHandler;)V", "idensic-mobile-sdk-aar_defaultRelease"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nSNSMobileSDK.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SNSMobileSDK.kt\ncom/sumsub/sns/core/SNSMobileSDK$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,663:1\n1#2:664\n*E\n"})
    public static final class Builder {

        @Nullable
        private String accessToken;

        @NotNull
        private final Context applicationContext;

        @Nullable
        private Integer autoCloseOnApproveTimeout;

        @Nullable
        private SNSCompleteHandler completeHandler;

        @Nullable
        private SNSInitConfig conf;

        @Nullable
        private SNSJsonCustomization customization;

        @Nullable
        private SNSJsonCustomizationSource customizationSource;

        @Nullable
        private SNSErrorHandler errorHandler;

        @Nullable
        private SNSEventHandler eventHandler;

        @Nullable
        private DayNightMode forcedDayNightMode;

        @Nullable
        private SNSIconHandler iconHandler;

        @Nullable
        private SNSInstructionsViewHandler instructionsHandler;
        private boolean isAnalyticsEnabled;
        private boolean isDebug;

        @NotNull
        private Locale locale;

        @NotNull
        private Logger logTree;

        @NotNull
        private List<? extends SNSModule> modules;

        @Nullable
        private TokenExpirationHandler onTokenExpiration;

        @Nullable
        private Map<String, SNSDocumentDefinition> preferredDocumentsDefinitions;

        @Nullable
        private Map<String, String> settings;

        @Nullable
        private SNSStateChangedHandler stateChangedHandler;

        @Nullable
        private List<SNSSupportItem> supportItems;

        @Nullable
        private Integer theme;

        @NotNull
        private String url;

        @Nullable
        private SNSUrlHandler urlHandler;

        @NotNull
        private final WeakReference<Activity> weakActivity;

        public Builder(@NotNull Activity activity, @Nullable String str) {
            SNSMobileSDK.INSTANCE.isDebug();
            this.applicationContext = activity.getApplicationContext();
            this.weakActivity = new WeakReference<>(activity);
            this.url = str == null ? "https://api.sumsub.com/" : str;
            this.isAnalyticsEnabled = true;
            this.iconHandler = new SNSDefaultIconHandler();
            this.modules = CollectionsKt.emptyList();
            this.logTree = C33304j.f67900a;
            this.locale = AbstractC28458h.m69337a();
        }

        @NotNull
        public final SDK build() {
            return new SNSSDK(this);
        }

        @Nullable
        /* JADX INFO: renamed from: getAccessToken$idensic_mobile_sdk_aar_defaultRelease, reason: from getter */
        public final String getAccessToken() {
            return this.accessToken;
        }

        @NotNull
        /* JADX INFO: renamed from: getApplicationContext$idensic_mobile_sdk_aar_defaultRelease, reason: from getter */
        public final Context getApplicationContext() {
            return this.applicationContext;
        }

        @Nullable
        /* JADX INFO: renamed from: getAutoCloseOnApproveTimeout$idensic_mobile_sdk_aar_defaultRelease, reason: from getter */
        public final Integer getAutoCloseOnApproveTimeout() {
            return this.autoCloseOnApproveTimeout;
        }

        @Nullable
        /* JADX INFO: renamed from: getCompleteHandler$idensic_mobile_sdk_aar_defaultRelease, reason: from getter */
        public final SNSCompleteHandler getCompleteHandler() {
            return this.completeHandler;
        }

        @Nullable
        /* JADX INFO: renamed from: getConf$idensic_mobile_sdk_aar_defaultRelease, reason: from getter */
        public final SNSInitConfig getConf() {
            return this.conf;
        }

        @Nullable
        /* JADX INFO: renamed from: getCustomization$idensic_mobile_sdk_aar_defaultRelease, reason: from getter */
        public final SNSJsonCustomization getCustomization() {
            return this.customization;
        }

        @Nullable
        /* JADX INFO: renamed from: getCustomizationSource$idensic_mobile_sdk_aar_defaultRelease, reason: from getter */
        public final SNSJsonCustomizationSource getCustomizationSource() {
            return this.customizationSource;
        }

        @Nullable
        /* JADX INFO: renamed from: getErrorHandler$idensic_mobile_sdk_aar_defaultRelease, reason: from getter */
        public final SNSErrorHandler getErrorHandler() {
            return this.errorHandler;
        }

        @Nullable
        /* JADX INFO: renamed from: getEventHandler$idensic_mobile_sdk_aar_defaultRelease, reason: from getter */
        public final SNSEventHandler getEventHandler() {
            return this.eventHandler;
        }

        @Nullable
        /* JADX INFO: renamed from: getForcedDayNightMode$idensic_mobile_sdk_aar_defaultRelease, reason: from getter */
        public final DayNightMode getForcedDayNightMode() {
            return this.forcedDayNightMode;
        }

        @Nullable
        /* JADX INFO: renamed from: getIconHandler$idensic_mobile_sdk_aar_defaultRelease, reason: from getter */
        public final SNSIconHandler getIconHandler() {
            return this.iconHandler;
        }

        @Nullable
        /* JADX INFO: renamed from: getInstructionsHandler$idensic_mobile_sdk_aar_defaultRelease, reason: from getter */
        public final SNSInstructionsViewHandler getInstructionsHandler() {
            return this.instructionsHandler;
        }

        @NotNull
        /* JADX INFO: renamed from: getLocale$idensic_mobile_sdk_aar_defaultRelease, reason: from getter */
        public final Locale getLocale() {
            return this.locale;
        }

        @NotNull
        /* JADX INFO: renamed from: getLogTree$idensic_mobile_sdk_aar_defaultRelease, reason: from getter */
        public final Logger getLogTree() {
            return this.logTree;
        }

        @NotNull
        public final List<SNSModule> getModules$idensic_mobile_sdk_aar_defaultRelease() {
            return this.modules;
        }

        @Nullable
        /* JADX INFO: renamed from: getOnTokenExpiration$idensic_mobile_sdk_aar_defaultRelease, reason: from getter */
        public final TokenExpirationHandler getOnTokenExpiration() {
            return this.onTokenExpiration;
        }

        @Nullable
        /* JADX INFO: renamed from: getPreferredDocumentsDefinitions$idensic_mobile_sdk_aar_defaultRelease */
        public final Map<String, SNSDocumentDefinition> m69047x8cfb8a2e() {
            return this.preferredDocumentsDefinitions;
        }

        @Nullable
        public final Map<String, String> getSettings$idensic_mobile_sdk_aar_defaultRelease() {
            return this.settings;
        }

        @Nullable
        /* JADX INFO: renamed from: getStateChangedHandler$idensic_mobile_sdk_aar_defaultRelease, reason: from getter */
        public final SNSStateChangedHandler getStateChangedHandler() {
            return this.stateChangedHandler;
        }

        @Nullable
        public final List<SNSSupportItem> getSupportItems$idensic_mobile_sdk_aar_defaultRelease() {
            return this.supportItems;
        }

        @Nullable
        /* JADX INFO: renamed from: getTheme$idensic_mobile_sdk_aar_defaultRelease, reason: from getter */
        public final Integer getTheme() {
            return this.theme;
        }

        @NotNull
        /* JADX INFO: renamed from: getUrl$idensic_mobile_sdk_aar_defaultRelease, reason: from getter */
        public final String getUrl() {
            return this.url;
        }

        @Nullable
        /* JADX INFO: renamed from: getUrlHandler$idensic_mobile_sdk_aar_defaultRelease, reason: from getter */
        public final SNSUrlHandler getUrlHandler() {
            return this.urlHandler;
        }

        @NotNull
        public final WeakReference<Activity> getWeakActivity$idensic_mobile_sdk_aar_defaultRelease() {
            return this.weakActivity;
        }

        /* JADX INFO: renamed from: isAnalyticsEnabled$idensic_mobile_sdk_aar_defaultRelease, reason: from getter */
        public final boolean getIsAnalyticsEnabled() {
            return this.isAnalyticsEnabled;
        }

        /* JADX INFO: renamed from: isDebug$idensic_mobile_sdk_aar_defaultRelease, reason: from getter */
        public final boolean getIsDebug() {
            return this.isDebug;
        }

        @NotNull
        public final Builder withAccessToken(@Nullable String accessToken, @NotNull TokenExpirationHandler onTokenExpiration) {
            this.accessToken = accessToken;
            this.onTokenExpiration = onTokenExpiration;
            return this;
        }

        @NotNull
        public final Builder withAnalyticsEnabled(boolean isAnalyticsEnabled) {
            this.isAnalyticsEnabled = isAnalyticsEnabled;
            return this;
        }

        @NotNull
        public final Builder withCompleteHandler(@Nullable SNSCompleteHandler completeHandler) {
            this.completeHandler = completeHandler;
            return this;
        }

        @NotNull
        public final Builder withDebug(boolean debug) {
            this.isDebug = debug;
            return this;
        }

        @NotNull
        public final Builder withEventHandler(@Nullable SNSEventHandler eventHandler) {
            this.eventHandler = eventHandler;
            return this;
        }

        @NotNull
        public final Builder withLocale(@NotNull Locale locale) {
            this.locale = locale;
            return this;
        }

        @NotNull
        public final Builder withPreferredDocumentDefinitions(@Nullable Map<String, SNSDocumentDefinition> definitions) {
            this.preferredDocumentsDefinitions = definitions;
            return this;
        }

        @NotNull
        public final Builder withTheme(@NotNull SNSTheme theme) {
            SNSJsonCustomization sNSJsonCustomizationCreate = SNSJsonCustomization.INSTANCE.create();
            sNSJsonCustomizationCreate.loadTheme(theme);
            this.customization = sNSJsonCustomizationCreate;
            this.customizationSource = SNSJsonCustomizationSource.DSL;
            return this;
        }

        @NotNull
        public final Builder withAutoCloseOnApprove(int timeInSecs) {
            this.autoCloseOnApproveTimeout = Integer.valueOf(timeInSecs);
            return this;
        }

        public Builder(@NotNull Activity activity) {
            this(activity, null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
    @Keep
    @Metadata(m90083d1 = {"\u0000Ò\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\b'\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010i\u001a\b\u0012\u0004\u0012\u00020\u00100\u0018H\u0002J\b\u0010j\u001a\u00020kH\u0017J\u0006\u0010l\u001a\u00020kR\u0014\u0010\u0006\u001a\u00020\u0007X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u0010X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0010X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0012\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\"\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u0018X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001b\"\u0004\b\u001f\u0010 R\u0016\u0010!\u001a\u0004\u0018\u00010\"X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0016\u0010%\u001a\u0004\u0018\u00010&X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0016\u0010)\u001a\u0004\u0018\u00010*X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0016\u0010-\u001a\u0004\u0018\u00010.X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b/\u00100R\u0016\u00101\u001a\u0004\u0018\u000102X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b3\u00104R\u0016\u00105\u001a\u0004\u0018\u000106X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b7\u00108R\u0014\u00109\u001a\u00020:X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b;\u0010<R\u0014\u0010=\u001a\u00020:X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b>\u0010<R\u0014\u0010?\u001a\u00020@X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\bA\u0010BR\u0014\u0010C\u001a\u00020DX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\bE\u0010FR\u0016\u0010G\u001a\u0004\u0018\u00010HX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\bI\u0010JR\u0018\u0010K\u001a\u0004\u0018\u00010LX\u0080\u0004¢\u0006\n\n\u0002\u0010O\u001a\u0004\bM\u0010NR\u0016\u0010P\u001a\u0004\u0018\u00010QX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\bR\u0010SR\u0016\u0010T\u001a\u0004\u0018\u00010UX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\bV\u0010WR\"\u0010X\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0010\u0018\u00010YX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\bZ\u0010[R\"\u0010\\\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020]\u0018\u00010YX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b^\u0010[R\u0018\u0010_\u001a\u0004\u0018\u00010LX\u0080\u0004¢\u0006\n\n\u0002\u0010O\u001a\u0004\b`\u0010NR\u0016\u0010a\u001a\u0004\u0018\u00010bX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\bc\u0010dR\u0016\u0010e\u001a\u0004\u0018\u00010fX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\bg\u0010h¨\u0006m"}, m90084d2 = {"Lcom/sumsub/sns/core/SNSMobileSDK$SDK;", "", "builder", "Lcom/sumsub/sns/core/SNSMobileSDK$Builder;", "<init>", "(Lcom/sumsub/sns/core/SNSMobileSDK$Builder;)V", "applicationContext", "Landroid/content/Context;", "getApplicationContext$idensic_mobile_sdk_aar_defaultRelease", "()Landroid/content/Context;", "weakActivity", "Ljava/lang/ref/WeakReference;", "Landroid/app/Activity;", "getWeakActivity$idensic_mobile_sdk_aar_defaultRelease", "()Ljava/lang/ref/WeakReference;", "url", "", "getUrl$idensic_mobile_sdk_aar_defaultRelease", "()Ljava/lang/String;", "accessToken", "getAccessToken$idensic_mobile_sdk_aar_defaultRelease", "setAccessToken$idensic_mobile_sdk_aar_defaultRelease", "(Ljava/lang/String;)V", "modules", "", "Lcom/sumsub/sns/core/SNSModule;", "getModules$idensic_mobile_sdk_aar_defaultRelease", "()Ljava/util/List;", "supportItems", "Lcom/sumsub/sns/core/data/model/SNSSupportItem;", "getSupportItems$idensic_mobile_sdk_aar_defaultRelease", "setSupportItems$idensic_mobile_sdk_aar_defaultRelease", "(Ljava/util/List;)V", "onTokenExpiration", "Lcom/sumsub/sns/core/data/listener/TokenExpirationHandler;", "getOnTokenExpiration$idensic_mobile_sdk_aar_defaultRelease", "()Lcom/sumsub/sns/core/data/listener/TokenExpirationHandler;", "completeHandler", "Lcom/sumsub/sns/core/data/listener/SNSCompleteHandler;", "getCompleteHandler$idensic_mobile_sdk_aar_defaultRelease", "()Lcom/sumsub/sns/core/data/listener/SNSCompleteHandler;", "errorHandler", "Lcom/sumsub/sns/core/data/listener/SNSErrorHandler;", "getErrorHandler$idensic_mobile_sdk_aar_defaultRelease", "()Lcom/sumsub/sns/core/data/listener/SNSErrorHandler;", "eventHandler", "Lcom/sumsub/sns/core/data/listener/SNSEventHandler;", "getEventHandler$idensic_mobile_sdk_aar_defaultRelease", "()Lcom/sumsub/sns/core/data/listener/SNSEventHandler;", "iconHandler", "Lcom/sumsub/sns/core/data/listener/SNSIconHandler;", "getIconHandler$idensic_mobile_sdk_aar_defaultRelease", "()Lcom/sumsub/sns/core/data/listener/SNSIconHandler;", "instructionsViewHandler", "Lcom/sumsub/sns/core/data/listener/SNSInstructionsViewHandler;", "getInstructionsViewHandler$idensic_mobile_sdk_aar_defaultRelease", "()Lcom/sumsub/sns/core/data/listener/SNSInstructionsViewHandler;", "isDebug", "", "isDebug$idensic_mobile_sdk_aar_defaultRelease", "()Z", "isAnalyticsEnabled", "isAnalyticsEnabled$idensic_mobile_sdk_aar_defaultRelease", "logTree", "Lcom/sumsub/log/logger/Logger;", "getLogTree$idensic_mobile_sdk_aar_defaultRelease", "()Lcom/sumsub/log/logger/Logger;", "locale", "Ljava/util/Locale;", "getLocale$idensic_mobile_sdk_aar_defaultRelease", "()Ljava/util/Locale;", "conf", "Lcom/sumsub/sns/core/data/model/SNSInitConfig;", "getConf$idensic_mobile_sdk_aar_defaultRelease", "()Lcom/sumsub/sns/core/data/model/SNSInitConfig;", BaseActivity.THEME, "", "getTheme$idensic_mobile_sdk_aar_defaultRelease", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "customization", "Lcom/sumsub/sns/core/theme/SNSJsonCustomization;", "getCustomization$idensic_mobile_sdk_aar_defaultRelease", "()Lcom/sumsub/sns/core/theme/SNSJsonCustomization;", "customizationSource", "Lcom/sumsub/sns/core/theme/SNSJsonCustomizationSource;", "getCustomizationSource$idensic_mobile_sdk_aar_defaultRelease", "()Lcom/sumsub/sns/core/theme/SNSJsonCustomizationSource;", "settings", "", "getSettings$idensic_mobile_sdk_aar_defaultRelease", "()Ljava/util/Map;", "preferredDocumentsDefinitions", "Lcom/sumsub/sns/core/data/model/SNSDocumentDefinition;", "getPreferredDocumentsDefinitions$idensic_mobile_sdk_aar_defaultRelease", "autoCloseOnApproveTimeout", "getAutoCloseOnApproveTimeout$idensic_mobile_sdk_aar_defaultRelease", "forcedDayNightMode", "Lcom/sumsub/sns/core/data/model/DayNightMode;", "getForcedDayNightMode$idensic_mobile_sdk_aar_defaultRelease", "()Lcom/sumsub/sns/core/data/model/DayNightMode;", "snsUrlHandler", "Lcom/sumsub/sns/core/data/listener/SNSUrlHandler;", "getSnsUrlHandler$idensic_mobile_sdk_aar_defaultRelease", "()Lcom/sumsub/sns/core/data/listener/SNSUrlHandler;", "isParametersValid", InterfaceC33617e1.f69659h, "", "dismiss", "idensic-mobile-sdk-aar_defaultRelease"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nSNSMobileSDK.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SNSMobileSDK.kt\ncom/sumsub/sns/core/SNSMobileSDK$SDK\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,663:1\n1617#2,9:664\n1869#2:673\n1870#2:675\n1626#2:676\n1#3:674\n*S KotlinDebug\n*F\n+ 1 SNSMobileSDK.kt\ncom/sumsub/sns/core/SNSMobileSDK$SDK\n*L\n640#1:664,9\n640#1:673\n640#1:675\n640#1:676\n640#1:674\n*E\n"})
    public static abstract class SDK {

        @Nullable
        private String accessToken;

        @NotNull
        private final Context applicationContext;

        @Nullable
        private final Integer autoCloseOnApproveTimeout;

        @Nullable
        private final SNSCompleteHandler completeHandler;

        @Nullable
        private final SNSInitConfig conf;

        @Nullable
        private final SNSJsonCustomization customization;

        @Nullable
        private final SNSJsonCustomizationSource customizationSource;

        @Nullable
        private final SNSErrorHandler errorHandler;

        @Nullable
        private final SNSEventHandler eventHandler;

        @Nullable
        private final DayNightMode forcedDayNightMode;

        @Nullable
        private final SNSIconHandler iconHandler;

        @Nullable
        private final SNSInstructionsViewHandler instructionsViewHandler;
        private final boolean isAnalyticsEnabled;
        private final boolean isDebug;

        @NotNull
        private final Locale locale;

        @NotNull
        private final Logger logTree;

        @NotNull
        private final List<SNSModule> modules;

        @Nullable
        private final TokenExpirationHandler onTokenExpiration;

        @Nullable
        private final Map<String, SNSDocumentDefinition> preferredDocumentsDefinitions;

        @Nullable
        private final Map<String, String> settings;

        @Nullable
        private final SNSUrlHandler snsUrlHandler;

        @Nullable
        private List<SNSSupportItem> supportItems;

        @Nullable
        private final Integer theme;

        @NotNull
        private final String url;

        @NotNull
        private final WeakReference<Activity> weakActivity;

        private final List<String> isParametersValid() {
            ArrayList arrayList;
            ArrayList arrayList2 = new ArrayList();
            if (this.url.length() == 0) {
                arrayList2.add("Api url must be non-empty. url=" + this.url);
            }
            try {
                new URL(this.url).toURI();
            } catch (Exception unused) {
                arrayList2.add("Api url must be valid. url=" + this.url);
            }
            List<SNSSupportItem> list = this.supportItems;
            if (list != null) {
                arrayList = new ArrayList();
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    String strIsValid = ((SNSSupportItem) it.next()).isValid();
                    if (strIsValid != null) {
                        arrayList.add(strIsValid);
                    }
                }
            } else {
                arrayList = null;
            }
            ArrayList arrayList3 = arrayList;
            if (arrayList3 != null && (!arrayList3.isEmpty())) {
                arrayList2.add("Support items have invalid support items. Why are support items invalid? (" + CollectionsKt.joinToString$default(arrayList3, null, null, null, 0, null, new Function1() { // from class: com.sumsub.sns.core.t
                    @Override // p852kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return SNSMobileSDK.SDK.isParametersValid$lambda$1((String) obj);
                    }
                }, 31, null) + ")");
            }
            return arrayList2;
        }

        public final void dismiss() {
            Activity activity = this.weakActivity.get();
            if (activity != null) {
                Intent intent = new Intent("com.sumsub.sns.intent.ACTION_CLOSE");
                intent.setPackage(SNSMobileSDK.INSTANCE.getPackageName());
                activity.sendBroadcast(intent);
            }
        }

        @Nullable
        /* JADX INFO: renamed from: getAccessToken$idensic_mobile_sdk_aar_defaultRelease, reason: from getter */
        public final String getAccessToken() {
            return this.accessToken;
        }

        @NotNull
        /* JADX INFO: renamed from: getApplicationContext$idensic_mobile_sdk_aar_defaultRelease, reason: from getter */
        public final Context getApplicationContext() {
            return this.applicationContext;
        }

        @Nullable
        /* JADX INFO: renamed from: getAutoCloseOnApproveTimeout$idensic_mobile_sdk_aar_defaultRelease, reason: from getter */
        public final Integer getAutoCloseOnApproveTimeout() {
            return this.autoCloseOnApproveTimeout;
        }

        @Nullable
        /* JADX INFO: renamed from: getCompleteHandler$idensic_mobile_sdk_aar_defaultRelease, reason: from getter */
        public final SNSCompleteHandler getCompleteHandler() {
            return this.completeHandler;
        }

        @Nullable
        /* JADX INFO: renamed from: getConf$idensic_mobile_sdk_aar_defaultRelease, reason: from getter */
        public final SNSInitConfig getConf() {
            return this.conf;
        }

        @Nullable
        /* JADX INFO: renamed from: getCustomization$idensic_mobile_sdk_aar_defaultRelease, reason: from getter */
        public final SNSJsonCustomization getCustomization() {
            return this.customization;
        }

        @Nullable
        /* JADX INFO: renamed from: getCustomizationSource$idensic_mobile_sdk_aar_defaultRelease, reason: from getter */
        public final SNSJsonCustomizationSource getCustomizationSource() {
            return this.customizationSource;
        }

        @Nullable
        /* JADX INFO: renamed from: getErrorHandler$idensic_mobile_sdk_aar_defaultRelease, reason: from getter */
        public final SNSErrorHandler getErrorHandler() {
            return this.errorHandler;
        }

        @Nullable
        /* JADX INFO: renamed from: getEventHandler$idensic_mobile_sdk_aar_defaultRelease, reason: from getter */
        public final SNSEventHandler getEventHandler() {
            return this.eventHandler;
        }

        @Nullable
        /* JADX INFO: renamed from: getForcedDayNightMode$idensic_mobile_sdk_aar_defaultRelease, reason: from getter */
        public final DayNightMode getForcedDayNightMode() {
            return this.forcedDayNightMode;
        }

        @Nullable
        /* JADX INFO: renamed from: getIconHandler$idensic_mobile_sdk_aar_defaultRelease, reason: from getter */
        public final SNSIconHandler getIconHandler() {
            return this.iconHandler;
        }

        @Nullable
        /* JADX INFO: renamed from: getInstructionsViewHandler$idensic_mobile_sdk_aar_defaultRelease, reason: from getter */
        public final SNSInstructionsViewHandler getInstructionsViewHandler() {
            return this.instructionsViewHandler;
        }

        @NotNull
        /* JADX INFO: renamed from: getLocale$idensic_mobile_sdk_aar_defaultRelease, reason: from getter */
        public final Locale getLocale() {
            return this.locale;
        }

        @NotNull
        /* JADX INFO: renamed from: getLogTree$idensic_mobile_sdk_aar_defaultRelease, reason: from getter */
        public final Logger getLogTree() {
            return this.logTree;
        }

        @NotNull
        public final List<SNSModule> getModules$idensic_mobile_sdk_aar_defaultRelease() {
            return this.modules;
        }

        @Nullable
        /* JADX INFO: renamed from: getOnTokenExpiration$idensic_mobile_sdk_aar_defaultRelease, reason: from getter */
        public final TokenExpirationHandler getOnTokenExpiration() {
            return this.onTokenExpiration;
        }

        @Nullable
        /* JADX INFO: renamed from: getPreferredDocumentsDefinitions$idensic_mobile_sdk_aar_defaultRelease */
        public final Map<String, SNSDocumentDefinition> m69050x8cfb8a2e() {
            return this.preferredDocumentsDefinitions;
        }

        @Nullable
        public final Map<String, String> getSettings$idensic_mobile_sdk_aar_defaultRelease() {
            return this.settings;
        }

        @Nullable
        /* JADX INFO: renamed from: getSnsUrlHandler$idensic_mobile_sdk_aar_defaultRelease, reason: from getter */
        public final SNSUrlHandler getSnsUrlHandler() {
            return this.snsUrlHandler;
        }

        @Nullable
        public final List<SNSSupportItem> getSupportItems$idensic_mobile_sdk_aar_defaultRelease() {
            return this.supportItems;
        }

        @Nullable
        /* JADX INFO: renamed from: getTheme$idensic_mobile_sdk_aar_defaultRelease, reason: from getter */
        public final Integer getTheme() {
            return this.theme;
        }

        @NotNull
        /* JADX INFO: renamed from: getUrl$idensic_mobile_sdk_aar_defaultRelease, reason: from getter */
        public final String getUrl() {
            return this.url;
        }

        @NotNull
        public final WeakReference<Activity> getWeakActivity$idensic_mobile_sdk_aar_defaultRelease() {
            return this.weakActivity;
        }

        /* JADX INFO: renamed from: isAnalyticsEnabled$idensic_mobile_sdk_aar_defaultRelease, reason: from getter */
        public final boolean getIsAnalyticsEnabled() {
            return this.isAnalyticsEnabled;
        }

        /* JADX INFO: renamed from: isDebug$idensic_mobile_sdk_aar_defaultRelease, reason: from getter */
        public final boolean getIsDebug() {
            return this.isDebug;
        }

        public final void setAccessToken$idensic_mobile_sdk_aar_defaultRelease(@Nullable String str) {
            this.accessToken = str;
        }

        public final void setSupportItems$idensic_mobile_sdk_aar_defaultRelease(@Nullable List<SNSSupportItem> list) {
            this.supportItems = list;
        }

        public SDK(@NotNull Builder builder) throws SNSInvalidParametersException {
            String url;
            Object objM103844constructorimpl;
            int longVersionCode;
            Context applicationContext = builder.getApplicationContext();
            this.applicationContext = applicationContext;
            this.weakActivity = builder.getWeakActivity$idensic_mobile_sdk_aar_defaultRelease();
            if (StringsKt.endsWith$default((CharSequence) builder.getUrl(), '/', false, 2, (Object) null)) {
                url = builder.getUrl();
            } else {
                url = builder.getUrl() + "/";
            }
            this.url = url;
            this.accessToken = builder.getAccessToken();
            this.modules = builder.getModules$idensic_mobile_sdk_aar_defaultRelease();
            this.supportItems = builder.getSupportItems$idensic_mobile_sdk_aar_defaultRelease();
            this.onTokenExpiration = builder.getOnTokenExpiration();
            this.completeHandler = builder.getCompleteHandler();
            this.errorHandler = builder.getErrorHandler();
            this.eventHandler = builder.getEventHandler();
            this.iconHandler = builder.getIconHandler();
            this.instructionsViewHandler = builder.getInstructionsHandler();
            this.isDebug = builder.getIsDebug();
            this.isAnalyticsEnabled = builder.getIsAnalyticsEnabled();
            this.logTree = builder.getLogTree();
            this.locale = builder.getLocale();
            this.conf = builder.getConf();
            this.theme = builder.getTheme();
            this.customization = builder.getCustomization();
            this.customizationSource = builder.getCustomizationSource();
            this.settings = builder.getSettings$idensic_mobile_sdk_aar_defaultRelease();
            this.preferredDocumentsDefinitions = builder.m69047x8cfb8a2e();
            this.autoCloseOnApproveTimeout = builder.getAutoCloseOnApproveTimeout();
            this.forcedDayNightMode = builder.getForcedDayNightMode();
            this.snsUrlHandler = builder.getUrlHandler();
            List<String> listIsParametersValid = isParametersValid();
            if (listIsParametersValid.isEmpty()) {
                C28468k0 c28468k0 = C28468k0.f57983a;
                String packageName = applicationContext.getPackageName();
                try {
                    Result.Companion companion = Result.INSTANCE;
                    objM103844constructorimpl = Result.m103844constructorimpl(applicationContext.getPackageManager().getPackageInfo(applicationContext.getPackageName(), 0));
                } catch (Throwable th2) {
                    Result.Companion companion2 = Result.INSTANCE;
                    objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
                }
                PackageInfo packageInfo = (PackageInfo) (Result.m103850isFailureimpl(objM103844constructorimpl) ? null : objM103844constructorimpl);
                String str = (packageInfo == null || (str = packageInfo.versionName) == null) ? CameraInfo.IMPLEMENTATION_TYPE_UNKNOWN : str;
                Context context = this.applicationContext;
                try {
                    longVersionCode = (int) PackageInfoCompat.getLongVersionCode(context.getPackageManager().getPackageInfo(context.getPackageName(), 0));
                } catch (Exception unused) {
                    longVersionCode = -1;
                }
                C28468k0.f57986d = packageName;
                C28468k0.f57984b = str;
                C28468k0.f57985c = longVersionCode;
                ProviderInstaller.installIfNeededAsync(this.applicationContext, new ProviderInstaller.ProviderInstallListener() { // from class: com.sumsub.sns.core.SNSMobileSDK.SDK.1
                    @Override // com.google.android.gms.security.ProviderInstaller.ProviderInstallListener
                    public void onProviderInstallFailed(int errorCode, Intent resolveIntent) {
                        C33272c.f67816e.f67810a.mo68955d("SDK", "onProviderInstallFailed: " + errorCode, null);
                    }

                    @Override // com.google.android.gms.security.ProviderInstaller.ProviderInstallListener
                    public void onProviderInstalled() {
                        C33272c.f67816e.f67810a.mo68955d("SDK", "onProviderInstalled", null);
                    }
                });
                return;
            }
            throw new SNSInvalidParametersException(listIsParametersValid);
        }

        @CallSuper
        public void launch() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final CharSequence isParametersValid$lambda$1(String str) {
            return str;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
    @Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\n\u001a\u00020\u000bH\u0016R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\f"}, m90084d2 = {"Lcom/sumsub/sns/core/SNSMobileSDK$SNSSDK;", "Lcom/sumsub/sns/core/SNSMobileSDK$SDK;", "builder", "Lcom/sumsub/sns/core/SNSMobileSDK$Builder;", "<init>", "(Lcom/sumsub/sns/core/SNSMobileSDK$Builder;)V", "stateChangedHandler", "Lcom/sumsub/sns/core/data/listener/SNSStateChangedHandler;", "getStateChangedHandler$idensic_mobile_sdk_aar_defaultRelease", "()Lcom/sumsub/sns/core/data/listener/SNSStateChangedHandler;", InterfaceC33617e1.f69659h, "", "idensic-mobile-sdk-aar_defaultRelease"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
    public static final class SNSSDK extends SDK {

        @Nullable
        private final SNSStateChangedHandler stateChangedHandler;

        @Nullable
        /* JADX INFO: renamed from: getStateChangedHandler$idensic_mobile_sdk_aar_defaultRelease, reason: from getter */
        public final SNSStateChangedHandler getStateChangedHandler() {
            return this.stateChangedHandler;
        }

        public SNSSDK(@NotNull Builder builder) {
            super(builder);
            this.stateChangedHandler = builder.getStateChangedHandler();
        }

        @Override // com.sumsub.sns.core.SNSMobileSDK.SDK
        public void launch() {
            super.launch();
            SNSMobileSDK.INSTANCE.start(this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0034  */
    /* JADX WARN: Code duplicated, block: B:9:0x0023  */
    public final void restore$idensic_mobile_sdk_aar_defaultRelease(@NotNull Context applicationContext) {
        C28578h c28578h;
        AbstractC28413P0.m69296a(applicationContext, null);
        SNSSession sNSSessionM69295a = AbstractC28413P0.m69295a();
        Context applicationContext2 = applicationContext.getApplicationContext();
        AbstractC28413P0.m69296a(applicationContext2, sNSSessionM69295a);
        C28578h c28578h2 = C28578h.f58143T;
        if (c28578h2 == null) {
            c28578h2 = new C28578h(applicationContext2, sNSSessionM69295a.getSessionId(), sNSSessionM69295a.getUrl(), null);
            c28578h = C28578h.f58143T;
            if (c28578h != null) {
                c28578h.m69470a();
            }
            C28578h.f58143T = c28578h2;
        } else {
            if (!Intrinsics.areEqual(c28578h2.f58164b, sNSSessionM69295a.getSessionId())) {
                c28578h2 = null;
            }
            if (c28578h2 == null) {
                c28578h2 = new C28578h(applicationContext2, sNSSessionM69295a.getSessionId(), sNSSessionM69295a.getUrl(), null);
                c28578h = C28578h.f58143T;
                if (c28578h != null) {
                    c28578h.m69470a();
                }
                C28578h.f58143T = c28578h2;
            }
        }
        AbstractC27905Y.m68986a(applicationContext, (InterfaceC33275c) c28578h2.f58177o.getValue());
        exceptionHandlerInstaller.m69473b(applicationContext, c28578h2);
        C28468k0 c28468k0 = C28468k0.f57983a;
        C28468k0.f57990h = _sdk == null;
        if (_sdk != null || isCallbacksLostReported) {
            return;
        }
        isCallbacksLostReported = true;
        AbstractC27905Y.m68987a(new SNSCallbacksLostOnRestoreException(isStartedInProcess));
    }

    static {
        SNSJsonCustomization.INSTANCE.setDefaultJsonCustomizationProvider(new Function0() { // from class: com.sumsub.sns.core.k
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SNSMobileSDK._init_$lambda$0();
            }
        });
        C28468k0 c28468k0 = C28468k0.f57983a;
        Function0 function0 = new Function0() { // from class: com.sumsub.sns.core.b
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SNSMobileSDK._init_$lambda$1();
            }
        };
        Function0 function1 = new Function0() { // from class: com.sumsub.sns.core.c
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SNSMobileSDK._init_$lambda$2();
            }
        };
        Function0 function2 = new Function0() { // from class: com.sumsub.sns.core.d
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SNSMobileSDK._init_$lambda$3();
            }
        };
        Function0 function3 = new Function0() { // from class: com.sumsub.sns.core.e
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SNSMobileSDK._init_$lambda$4();
            }
        };
        Function0 function4 = new Function0() { // from class: com.sumsub.sns.core.f
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SNSMobileSDK._init_$lambda$5();
            }
        };
        Function0 function5 = new Function0() { // from class: com.sumsub.sns.core.g
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SNSMobileSDK._init_$lambda$6();
            }
        };
        Function0 function6 = new Function0() { // from class: com.sumsub.sns.core.h
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SNSMobileSDK._init_$lambda$7();
            }
        };
        Function0 function7 = new Function0() { // from class: com.sumsub.sns.core.i
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SNSMobileSDK._init_$lambda$8();
            }
        };
        Function1 function8 = new Function1() { // from class: com.sumsub.sns.core.j
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SNSMobileSDK._init_$lambda$10((String) obj);
            }
        };
        Function0 function9 = new Function0() { // from class: com.sumsub.sns.core.l
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SNSMobileSDK._init_$lambda$11();
            }
        };
        Function0 function10 = new Function0() { // from class: com.sumsub.sns.core.m
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SNSMobileSDK._init_$lambda$12();
            }
        };
        Function0 function11 = new Function0() { // from class: com.sumsub.sns.core.n
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SNSMobileSDK._init_$lambda$13();
            }
        };
        Function0 function12 = new Function0() { // from class: com.sumsub.sns.core.o
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SNSMobileSDK._init_$lambda$14();
            }
        };
        C28468k0.f57992j = function0;
        C28468k0.f57993k = function1;
        C28468k0.f57994l = function2;
        C28468k0.f57995m = function3;
        C28468k0.f57996n = function4;
        C28468k0.f57997o = function5;
        C28468k0.f57998p = function6;
        C28468k0.f57999q = function7;
        C28468k0.f58000r = function8;
        C28468k0.f58001s = function9;
        C28468k0.f58004v = function10;
        C28468k0.f58005w = function11;
        C28468k0.f58006x = function12;
        Function0 function13 = new Function0() { // from class: com.sumsub.sns.core.p
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SNSMobileSDK._init_$lambda$15();
            }
        };
        Function1 function14 = new Function1() { // from class: com.sumsub.sns.core.q
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SNSMobileSDK._init_$lambda$16((List) obj);
            }
        };
        C28468k0.f58002t = function13;
        C28468k0.f58003u = function14;
        ArrayList arrayList = AbstractC28047a.f57189a;
        Function1 function15 = new Function1() { // from class: com.sumsub.sns.core.r
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SNSMobileSDK._init_$lambda$17((Fragment) obj);
            }
        };
        ArrayList arrayList2 = AbstractC28047a.f57189a;
        arrayList2.add(function15);
        if (C28366e.f57839h && AbstractC28409N0.m69294a("com.sumsub.sns.videoident.BuildConfig")) {
            arrayList2.add(new Function1() { // from class: com.sumsub.sns.core.s
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return SNSMobileSDK._init_$lambda$19((Fragment) obj);
                }
            });
        }
        logTree = C33304j.f67900a;
        theme = R$style.Theme_SNSCore;
        exceptionHandlerInstaller = new C28618c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SNSJsonCustomizationImpl _init_$lambda$0() {
        return new SNSJsonCustomizationImpl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SNSInitConfig _init_$lambda$1() {
        SDK sdk = _sdk;
        if (sdk != null) {
            return sdk.getConf();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SNSModule _init_$lambda$10(String str) {
        SNSModule sNSModulePrevious;
        List<SNSModule> modules = INSTANCE.getModules();
        ListIterator<SNSModule> listIterator = modules.listIterator(modules.size());
        while (listIterator.hasPrevious()) {
            sNSModulePrevious = listIterator.previous();
            if (Intrinsics.areEqual(sNSModulePrevious.getClass().getName(), str)) {
                return sNSModulePrevious;
            }
        }
        sNSModulePrevious = null;
        return sNSModulePrevious;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SNSIconHandler _init_$lambda$11() {
        SNSIconHandler iconHandler;
        SDK sdk = _sdk;
        return (sdk == null || (iconHandler = sdk.getIconHandler()) == null) ? new SNSDefaultIconHandler() : iconHandler;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map _init_$lambda$12() {
        SDK sdk = _sdk;
        if (sdk != null) {
            return sdk.m69050x8cfb8a2e();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Integer _init_$lambda$13() {
        SDK sdk = _sdk;
        if (sdk != null) {
            return sdk.getAutoCloseOnApproveTimeout();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SNSUrlHandler _init_$lambda$14() {
        SDK sdk = _sdk;
        if (sdk != null) {
            return sdk.getSnsUrlHandler();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List _init_$lambda$15() {
        SDK sdk = _sdk;
        if (sdk != null) {
            return sdk.getSupportItems$idensic_mobile_sdk_aar_defaultRelease();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit _init_$lambda$16(List list) {
        SDK sdk = _sdk;
        if (sdk != null) {
            sdk.setSupportItems$idensic_mobile_sdk_aar_defaultRelease(list);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Screen _init_$lambda$17(Fragment fragment) {
        if (fragment instanceof C31157j) {
            return Screen.InstructionsScreen;
        }
        if (fragment instanceof C32435m) {
            return Screen.StatusScreen;
        }
        if (fragment instanceof C30915a) {
            return Screen.AgreementScreen;
        }
        if (fragment instanceof CountryPickerDialog) {
            return Screen.CountriesScreen;
        }
        if (fragment instanceof C31808l) {
            return Screen.PreviewScreen;
        }
        if (fragment instanceof C31832F) {
            return Screen.MrtdScreen;
        }
        if (fragment instanceof C31947g) {
            return Screen.PreviewScreen;
        }
        if (fragment instanceof C31490h) {
            return Screen.ApplicantDataScreen;
        }
        if (fragment instanceof C31776f) {
            return Screen.PreviewScreen;
        }
        if ((fragment instanceof SNSDefaultLiveness3dFaceFragment) || (fragment instanceof SNSLiveness3dFaceFragment)) {
            return Screen.LivenessScreen;
        }
        if (fragment instanceof C32730p) {
            return Screen.ConfirmationContactScreen;
        }
        if (fragment instanceof SNSQuestionnaireFragment) {
            return Screen.QuestionnaireScreen;
        }
        if (fragment instanceof C31023g) {
            return Screen.ExitSurveyScreen;
        }
        if (fragment instanceof C32615f) {
            return Screen.SupportScreen;
        }
        if (fragment instanceof C30669g) {
            return Screen.DocTypeSelectorScreen;
        }
        if (fragment instanceof C30716l) {
            return Screen.CameraScreen;
        }
        if (fragment instanceof C30717m) {
            return Screen.CameraScreen;
        }
        if (fragment instanceof C30471K) {
            return Screen.CameraScreen;
        }
        if (fragment instanceof C30468J) {
            return Screen.CameraScreen;
        }
        if (fragment instanceof C30776i) {
            return Screen.VideoScreen;
        }
        if (fragment instanceof C30855f) {
            return Screen.AgreementSelectorScreen;
        }
        if (fragment instanceof C32348n) {
            return Screen.RestrictionsScreen;
        }
        if (fragment instanceof C31401h) {
            return Screen.PaymentMethodsSelectorScreen;
        }
        return fragment instanceof C31428h ? Screen.PaymentMethodsBankCardUploadScreen : Screen.Other;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Screen _init_$lambda$19(Fragment fragment) {
        Screen screen = Screen.VideoidentScreen;
        if (fragment instanceof SNSVideoIdentFragment) {
            return screen;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map _init_$lambda$2() {
        SDK sdk = _sdk;
        if (sdk != null) {
            return sdk.getSettings$idensic_mobile_sdk_aar_defaultRelease();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TokenExpirationHandler _init_$lambda$3() {
        SDK sdk = _sdk;
        if (sdk != null) {
            return sdk.getOnTokenExpiration();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SNSStateChangedHandler _init_$lambda$4() {
        SDK sdk = _sdk;
        SNSSDK snssdk = sdk instanceof SNSSDK ? (SNSSDK) sdk : null;
        if (snssdk != null) {
            return snssdk.getStateChangedHandler();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SNSErrorHandler _init_$lambda$5() {
        SDK sdk = _sdk;
        if (sdk != null) {
            return sdk.getErrorHandler();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SNSEventHandler _init_$lambda$6() {
        SDK sdk = _sdk;
        if (sdk != null) {
            return sdk.getEventHandler();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SNSJsonCustomization _init_$lambda$7() {
        SDK sdk = _sdk;
        if (sdk != null) {
            return sdk.getCustomization();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SNSInstructionsViewHandler _init_$lambda$8() {
        SDK sdk = _sdk;
        if (sdk != null) {
            return sdk.getInstructionsViewHandler();
        }
        return null;
    }

    private final List<SNSModule> getModules() {
        List<SNSModule> modules$idensic_mobile_sdk_aar_defaultRelease;
        SDK sdk = _sdk;
        return (sdk == null || (modules$idensic_mobile_sdk_aar_defaultRelease = sdk.getModules$idensic_mobile_sdk_aar_defaultRelease()) == null) ? CollectionsKt.emptyList() : modules$idensic_mobile_sdk_aar_defaultRelease;
    }

    private final void initFeatures(SDK sdk) {
        C33051b c33051b = C33048a.f67466b;
        Iterator it = c33051b.f67501a.entrySet().iterator();
        while (it.hasNext()) {
            C33050a c33050a = (C33050a) ((Map.Entry) it.next()).getValue();
            c33050a.f67497d.set(null);
            c33050a.f67499f.set(null);
            c33050a.f67498e.set(null);
        }
        Iterator it2 = c33051b.f67502b.entrySet().iterator();
        while (it2.hasNext()) {
            C33050a c33050a2 = (C33050a) ((Map.Entry) it2.next()).getValue();
            c33050a2.f67497d.set(null);
            c33050a2.f67499f.set(null);
            c33050a2.f67498e.set(null);
        }
        for (Map.Entry entry : C33048a.f67468c.entrySet()) {
            C33051b c33051b2 = C33048a.f67466b;
            String str = (String) entry.getKey();
            C33050a c33050a3 = (C33050a) c33051b2.f67501a.get(str);
            if (c33050a3 == null) {
                c33050a3 = (C33050a) c33051b2.f67502b.get(str);
            }
            if (c33050a3 != null) {
                boolean zBooleanValue = ((Boolean) ((Pair) entry.getValue()).getFirst()).booleanValue();
                String str2 = (String) ((Pair) entry.getValue()).getSecond();
                AtomicReference atomicReference = c33050a3.f67499f;
                FeatureFlagValueType featureFlagValueType = FeatureFlagValueType.DEFAULT;
                atomicReference.set(new C33052c(zBooleanValue, str2));
            }
        }
        List<SNSModule> modules$idensic_mobile_sdk_aar_defaultRelease = sdk.getModules$idensic_mobile_sdk_aar_defaultRelease();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(modules$idensic_mobile_sdk_aar_defaultRelease, 10));
        Iterator<T> it3 = modules$idensic_mobile_sdk_aar_defaultRelease.iterator();
        while (it3.hasNext()) {
            arrayList.add(((SNSModule) it3.next()).getName());
        }
        C33272c.f67816e.f67810a.mo68955d("SDK", "initFeatures: " + arrayList, null);
        for (SNSModule sNSModule : sdk.getModules$idensic_mobile_sdk_aar_defaultRelease()) {
            if (sNSModule instanceof SNSProoface) {
                SNSProoface sNSProoface = (SNSProoface) sNSModule;
                C33050a.m71433a(C33048a.f67479l, sNSProoface.isDebug());
                C33050a.m71433a(C33048a.f67480m, sNSProoface.isShowSettingsDialog());
            }
            if (sNSModule instanceof SNSCoreModule) {
                SNSCoreModule sNSCoreModule = (SNSCoreModule) sNSModule;
                C33050a.m71433a(C33048a.f67478k, sNSCoreModule.isFullScreenCamera());
                C33050a.m71433a(C33048a.f67477j, sNSCoreModule.isSkipGeolocationForm());
            }
        }
    }

    private final void initLogger(SDK sdk) {
        C33272c c33272c = C33272c.f67812a;
        sdk.getIsDebug();
        C33272c.f67813b.removeMessages(0);
        C33295a c33295a = C33272c.f67816e.f67811b;
        synchronized (c33295a) {
            c33295a.f67873a.clear();
        }
        ConcurrentHashMap concurrentHashMap = C33272c.f67815d;
        concurrentHashMap.clear();
        C33305k c33305k = C33272c.f67814c;
        c33305k.f67901a.clear();
        if (sdk.getIsDebug()) {
            Logger logTree2 = sdk.getLogTree();
            if (logTree2 instanceof C33304j) {
                concurrentHashMap.put(LoggerType.LOG_CAT, logTree2);
                c33305k.f67901a.add(logTree2);
                return;
            }
            LoggerType loggerType = LoggerType.LOG_CAT;
            C33304j c33304j = C33304j.f67900a;
            concurrentHashMap.put(loggerType, c33304j);
            c33305k.f67901a.add(c33304j);
            concurrentHashMap.put(LoggerType.SDK_CLIENT, logTree2);
            c33305k.f67901a.add(logTree2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:33:0x012a A[Catch: Exception -> 0x006f, TryCatch #0 {Exception -> 0x006f, blocks: (B:16:0x0061, B:18:0x0065, B:20:0x006b, B:23:0x0073, B:25:0x007b, B:26:0x009d, B:28:0x011a, B:37:0x0140, B:33:0x012a, B:35:0x013b, B:36:0x013e), top: B:42:0x0061 }] */
    /* JADX WARN: Code duplicated, block: B:35:0x013b A[Catch: Exception -> 0x006f, TryCatch #0 {Exception -> 0x006f, blocks: (B:16:0x0061, B:18:0x0065, B:20:0x006b, B:23:0x0073, B:25:0x007b, B:26:0x009d, B:28:0x011a, B:37:0x0140, B:33:0x012a, B:35:0x013b, B:36:0x013e), top: B:42:0x0061 }] */
    public final void start(SDK sdk) {
        C28578h c28578h;
        SNSJsonCustomization customization;
        Activity activity = sdk.getWeakActivity$idensic_mobile_sdk_aar_defaultRelease().get();
        if (activity == null) {
            return;
        }
        Context applicationContext = activity.getApplicationContext();
        String url = sdk.getUrl();
        String accessToken = sdk.getAccessToken();
        if (accessToken == null) {
            accessToken = "";
        }
        String str = accessToken;
        initFeatures(sdk);
        initLogger(sdk);
        _sdk = sdk;
        isStartedInProcess = true;
        isCallbacksLostReported = false;
        C28468k0.f57990h = false;
        boolean isDebug = sdk.getIsDebug();
        Locale locale = sdk.getLocale();
        C28468k0.f57988f = isDebug;
        C28468k0.f57987e = locale;
        logTree = sdk.getLogTree();
        Integer theme2 = sdk.getTheme();
        theme = theme2 != null ? theme2.intValue() : theme;
        xmlThemeUsed = sdk.getTheme() != null;
        customizationSource = sdk.getCustomizationSource();
        try {
            SDK sdk2 = _sdk;
            if (sdk2 != null && (customization = sdk2.getCustomization()) != null) {
                customization.loadResources(applicationContext);
            }
            C29903a c29903a = C28366e.f57832a;
            boolean isAnalyticsEnabled = sdk.getIsAnalyticsEnabled();
            if (!isAnalyticsEnabled) {
                C28366e.f57839h = true;
                C28368g c28368g = new C28368g();
                SdkEvent sdkEvent = SdkEvent.TrackingDisabled;
                c28368g.f57846b.add(Domain.Sdk);
                c28368g.f57846b.add(sdkEvent);
                c28368g.f57847c = MapsKt.toMap(MapsKt.emptyMap());
                c28368g.m69267a(true);
            }
            C28366e.f57839h = isAnalyticsEnabled;
            C33272c.f67816e.f67810a.mo68955d("SDK", "starting: debug=" + sdk.getIsDebug() + " locale=" + sdk.getLocale() + " analytics=" + sdk.getIsAnalyticsEnabled() + " sdkVersion=" + C28468k0.f57991i, null);
            Intent intent = new Intent();
            intent.setClassName(getPackageName(), "com.sumsub.sns.internal.features.presentation.main.SNSAppActivity");
            SNSSession sNSSession = new SNSSession(UUID.randomUUID().toString(), url, getLocale(), isDebug(), getPackageName(), getVersionName(), getVersionCode(), theme);
            Context applicationContext2 = applicationContext.getApplicationContext();
            AbstractC28413P0.m69296a(applicationContext2, sNSSession);
            C28578h c28578h2 = C28578h.f58143T;
            if (c28578h2 == null) {
                c28578h2 = new C28578h(applicationContext2, sNSSession.getSessionId(), sNSSession.getUrl(), str);
                c28578h = C28578h.f58143T;
                if (c28578h != null) {
                    c28578h.m69470a();
                }
                C28578h.f58143T = c28578h2;
            } else {
                if (!Intrinsics.areEqual(c28578h2.f58164b, sNSSession.getSessionId())) {
                    c28578h2 = null;
                }
                if (c28578h2 == null) {
                    c28578h2 = new C28578h(applicationContext2, sNSSession.getSessionId(), sNSSession.getUrl(), str);
                    c28578h = C28578h.f58143T;
                    if (c28578h != null) {
                        c28578h.m69470a();
                    }
                    C28578h.f58143T = c28578h2;
                }
            }
            AbstractC27905Y.m68986a(applicationContext, (InterfaceC33275c) c28578h2.f58177o.getValue());
            exceptionHandlerInstaller.m69473b(applicationContext, c28578h2);
            activity.startActivity(intent);
        } catch (Exception e11) {
            C33272c.f67816e.f67810a.mo68956e("SDK", "start error!!!", e11);
            Map map = AbstractC28393F0.f57880a;
            AbstractC28393F0.m69278a(new SNSException.Unknown(e11));
        }
        C41696j.m91104d(AbstractC33277e.f67821a, null, null, new C33276d(null), 3, null);
    }

    @Override // com.sumsub.sns.core.MobileSdk
    @Nullable
    public Integer getAutoCloseOnApproveTimeout() {
        return this.$$delegate_0.getAutoCloseOnApproveTimeout();
    }

    @Nullable
    public final SNSCompleteHandler getCompleteHandler() {
        SDK sdk = _sdk;
        if (sdk != null) {
            return sdk.getCompleteHandler();
        }
        return null;
    }

    @Override // com.sumsub.sns.core.MobileSdk
    @Nullable
    public SNSInitConfig getConf() {
        return this.$$delegate_0.getConf();
    }

    @Override // com.sumsub.sns.core.MobileSdk
    @Nullable
    public SNSJsonCustomization getCustomization() {
        return this.$$delegate_0.getCustomization();
    }

    @Nullable
    public final SNSJsonCustomizationSource getCustomizationSource$idensic_mobile_sdk_aar_defaultRelease() {
        return customizationSource;
    }

    @Override // com.sumsub.sns.core.MobileSdk
    @Nullable
    public SNSErrorHandler getErrorHandler() {
        return this.$$delegate_0.getErrorHandler();
    }

    @Override // com.sumsub.sns.core.MobileSdk
    @Nullable
    public SNSEventHandler getEventHandler() {
        return this.$$delegate_0.getEventHandler();
    }

    @Nullable
    public final DayNightMode getForcedDayNightMode() {
        SDK sdk = _sdk;
        if (sdk != null) {
            return sdk.getForcedDayNightMode();
        }
        return null;
    }

    @Override // com.sumsub.sns.core.MobileSdk
    @NotNull
    public SNSIconHandler getIconHandler() {
        return this.$$delegate_0.getIconHandler();
    }

    @Override // com.sumsub.sns.core.MobileSdk
    @Nullable
    public SNSInstructionsViewHandler getInstructionsViewHandler() {
        return this.$$delegate_0.getInstructionsViewHandler();
    }

    @Override // com.sumsub.sns.core.MobileSdk
    @NotNull
    public Locale getLocale() {
        this.$$delegate_0.getClass();
        return C28468k0.f57987e;
    }

    @NotNull
    public final Logger getLogTree() {
        return logTree;
    }

    @Override // com.sumsub.sns.core.MobileSdk
    @NotNull
    public String getPackageName() {
        this.$$delegate_0.getClass();
        return C28468k0.f57986d;
    }

    @Override // com.sumsub.sns.core.MobileSdk
    @Nullable
    public SNSModule getPluggedModule(@NotNull String className) {
        return this.$$delegate_0.getPluggedModule(className);
    }

    @Override // com.sumsub.sns.core.MobileSdk
    @Nullable
    public Map<String, SNSDocumentDefinition> getPreferredDocumentsDefinitions() {
        return this.$$delegate_0.getPreferredDocumentsDefinitions();
    }

    @Override // com.sumsub.sns.core.MobileSdk
    @Nullable
    public Map<String, String> getSettings() {
        return this.$$delegate_0.getSettings();
    }

    @Override // com.sumsub.sns.core.MobileSdk
    @NotNull
    public SNSSDKState getState() {
        this.$$delegate_0.getClass();
        return C28468k0.f57989g;
    }

    @Override // com.sumsub.sns.core.MobileSdk
    @Nullable
    public SNSStateChangedHandler getStateChangedHandler() {
        return this.$$delegate_0.getStateChangedHandler();
    }

    @Override // com.sumsub.sns.core.MobileSdk
    @Nullable
    public List<SNSSupportItem> getSupportItems() {
        return this.$$delegate_0.getSupportItems();
    }

    public final int getTheme() {
        return theme;
    }

    @Override // com.sumsub.sns.core.MobileSdk
    @Nullable
    public TokenExpirationHandler getTokenExpirationHandler() {
        return this.$$delegate_0.getTokenExpirationHandler();
    }

    @Override // com.sumsub.sns.core.MobileSdk
    @Nullable
    public SNSUrlHandler getUrlHandler() {
        return this.$$delegate_0.getUrlHandler();
    }

    @Override // com.sumsub.sns.core.MobileSdk
    @NotNull
    public String getVersion() {
        this.$$delegate_0.getClass();
        return C28468k0.f57991i;
    }

    @Override // com.sumsub.sns.core.MobileSdk
    public int getVersionCode() {
        this.$$delegate_0.getClass();
        return C28468k0.f57985c;
    }

    @Override // com.sumsub.sns.core.MobileSdk
    @NotNull
    public String getVersionName() {
        this.$$delegate_0.getClass();
        return C28468k0.f57984b;
    }

    public final boolean getXmlThemeUsed$idensic_mobile_sdk_aar_defaultRelease() {
        return xmlThemeUsed;
    }

    @Override // com.sumsub.sns.core.MobileSdk
    public boolean isDebug() {
        this.$$delegate_0.getClass();
        return C28468k0.f57988f;
    }

    @Override // com.sumsub.sns.core.MobileSdk
    public boolean isModuleAvailable(@NotNull String className) {
        return this.$$delegate_0.isModuleAvailable(className);
    }

    public final void setCustomizationSource$idensic_mobile_sdk_aar_defaultRelease(@Nullable SNSJsonCustomizationSource sNSJsonCustomizationSource) {
        customizationSource = sNSJsonCustomizationSource;
    }

    @Override // com.sumsub.sns.core.MobileSdk
    public void setSupportItems(@Nullable List<SNSSupportItem> list) {
        this.$$delegate_0.getClass();
        Function1 function1 = C28468k0.f58003u;
        if (function1 != null) {
            function1.invoke(list);
        }
    }

    public final void setXmlThemeUsed$idensic_mobile_sdk_aar_defaultRelease(boolean z11) {
        xmlThemeUsed = z11;
    }

    public final void shutdown() {
        C33270a c33270a = C33272c.f67816e;
        c33270a.f67810a.mo68955d("SDK", "shutdown", null);
        c33270a.f67811b.m71625a();
        HandlerC33271b handlerC33271b = C33272c.f67813b;
        if (!handlerC33271b.hasMessages(0)) {
            handlerC33271b.sendMessageDelayed(handlerC33271b.obtainMessage(0), 10000L);
        }
        C28366e.f57838g = null;
        InterfaceC41775x1 interfaceC41775x1 = C28366e.f57837f;
        if (interfaceC41775x1 != null) {
            InterfaceC41775x1.a.m91377a(interfaceC41775x1, null, 1, null);
        }
        C28366e.f57837f = null;
        C41713n0.m91129e(AbstractC33277e.f67821a, null, 1, null);
        C28618c c28618c = exceptionHandlerInstaller;
        synchronized (c28618c.f58234a) {
            Thread.setDefaultUncaughtExceptionHandler(c28618c.f58236c);
            c28618c.f58236c = null;
            c28618c.f58235b = false;
            Unit unit = Unit.INSTANCE;
        }
        _sdk = null;
    }

    @NotNull
    public String toString() {
        String str;
        String accessToken;
        SDK sdk = _sdk;
        String strM69299a = null;
        String url = sdk != null ? sdk.getUrl() : null;
        SDK sdk2 = _sdk;
        if (sdk2 != null && (accessToken = sdk2.getAccessToken()) != null) {
            strM69299a = AbstractC28416R0.m69299a(3, accessToken);
        }
        if (getModules().isEmpty()) {
            str = "Empty";
        } else {
            str = "[" + CollectionsKt.joinToString$default(getModules(), null, null, null, 0, null, new Function1() { // from class: com.sumsub.sns.core.a
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return ((SNSModule) obj).getName();
                }
            }, 31, null) + "]";
        }
        return "SNSMobileSDK: Api Url: " + url + ", Access Token: " + strM69299a + ",Modules: " + str + ", isDebug: " + isDebug();
    }

    private SNSMobileSDK() {
    }
}
