package com.jumio.core.api;

import android.content.Context;
import androidx.annotation.VisibleForTesting;
import com.google.firebase.messaging.Constants;
import com.jumio.ale.swig.ALECore;
import com.jumio.ale.swig.ALESettings;
import com.jumio.analytics.AnalyticsEvent;
import com.jumio.commons.log.Log;
import com.jumio.core.ServiceLocator;
import com.jumio.core.ServiceLocatorInterface;
import com.jumio.core.api.BackendManager;
import com.jumio.core.api.calls.AnalyticsCall;
import com.jumio.core.api.calls.AuthenticationCall;
import com.jumio.core.api.calls.DigitalIdentityEidasCall;
import com.jumio.core.api.calls.DigitalIdentityOutcomeCall;
import com.jumio.core.api.calls.DigitalIdentityWebViewCall;
import com.jumio.core.api.calls.ReusableIdLookupCall;
import com.jumio.core.api.calls.SettingsCall;
import com.jumio.core.api.calls.UploadCall;
import com.jumio.core.api.calls.UsabilityCall;
import com.jumio.core.enums.ErrorCase;
import com.jumio.core.environment.Environment;
import com.jumio.core.error.Error;
import com.jumio.core.interfaces.ConnectionInterface;
import com.jumio.core.models.ApiCallDataModel;
import com.jumio.core.models.AuthorizationModel;
import com.jumio.core.models.ScanPartModel;
import com.jumio.core.models.SettingsModel;
import com.jumio.core.models.TimeModel;
import com.jumio.core.models.TimeoutModel;
import com.jumio.core.network.ApiBinding;
import com.jumio.core.network.ApiCall;
import com.jumio.core.network.BackendConfigInterface;
import com.jumio.core.network.EncryptionProvider;
import com.jumio.core.network.TrustManagerInterface;
import com.jumio.core.persistence.DataManager;
import com.jumio.core.scope.ScopeProviderInterface;
import com.jumio.core.util.ConnectionChecker;
import com.jumio.core.util.DeviceUtilKt;
import com.jumio.sdk.credentials.JumioCredential;
import com.jumio.sdk.enums.JumioDataCenter;
import com.pichillilorenzo.flutter_inappwebview_android.credential_database.URLCredentialContract;
import com.sensorsdata.analytics.android.sdk.data.adapter.DbParams;
import com.tencent.bugly.proguard.C33812n7;
import com.tencent.bugly.proguard.InterfaceC33730j9;
import java.io.File;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.net.ssl.SSLException;
import jumio.core.AbstractC40505A3;
import jumio.core.AbstractC40642c;
import jumio.core.C40574O2;
import jumio.core.C40579P2;
import jumio.core.C40589R3;
import jumio.core.C40596T0;
import jumio.core.C40599T3;
import jumio.core.C40630a;
import jumio.core.C40669h1;
import jumio.core.C40672i;
import jumio.core.C40682k;
import jumio.core.C40686k3;
import jumio.core.C40719r1;
import jumio.core.InterfaceC40657f;
import jumio.core.InterfaceC40662g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.TuplesKt;
import p852kotlin.Unit;
import p852kotlin.collections.MapsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000æ\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 }2\u00020\u00012\u00020\u0002:\u0001}B'\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010:\u001a\u00020;H\u0002J\u001e\u0010<\u001a\u00020;2\n\u0010=\u001a\u0006\u0012\u0002\b\u00030>2\b\u0010?\u001a\u0004\u0018\u00010@H\u0002J\u001e\u0010A\u001a\u00020;2\n\u0010=\u001a\u0006\u0012\u0002\b\u00030>2\b\u0010B\u001a\u0004\u0018\u00010\"H\u0002J\u001e\u0010C\u001a\u00020D2\n\u0010=\u001a\u0006\u0012\u0002\b\u00030>2\b\u0010?\u001a\u0004\u0018\u00010@H\u0016J\u001e\u0010E\u001a\u00020D2\n\u0010=\u001a\u0006\u0012\u0002\b\u00030>2\b\u0010B\u001a\u0004\u0018\u00010\"H\u0016J\u0016\u0010F\u001a\u00020D2\u0006\u0010G\u001a\u00020H2\u0006\u0010I\u001a\u00020;J\u000e\u0010J\u001a\u00020D2\u0006\u0010K\u001a\u00020LJ\u000e\u0010M\u001a\u00020D2\u0006\u0010N\u001a\u00020&J\u000e\u0010O\u001a\u00020D2\u0006\u0010N\u001a\u00020&J\u000e\u0010P\u001a\u00020D2\u0006\u0010Q\u001a\u00020;J\u0006\u0010R\u001a\u00020DJ\u001a\u0010S\u001a\u00020D2\u0012\u0010T\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030U0%J\u0014\u0010(\u001a\u00020D2\f\u0010V\u001a\b\u0012\u0004\u0012\u00020+0WJ\u0016\u0010X\u001a\u00020D2\u0006\u0010Y\u001a\u00020Z2\u0006\u0010[\u001a\u00020\\JD\u0010]\u001a\u00020D2\u0006\u0010Y\u001a\u00020Z2\"\u0010^\u001a\u001e\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020\"0_j\u000e\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020\"``2\u0006\u0010a\u001a\u00020+2\b\b\u0002\u0010b\u001a\u00020+J\u001e\u0010c\u001a\u00020D2\u0006\u0010d\u001a\u00020+2\u0006\u0010a\u001a\u00020+2\u0006\u0010b\u001a\u00020+J\u0006\u0010e\u001a\u00020DJ*\u0010f\u001a\u00020D2\u0006\u0010g\u001a\u00020+2\u0006\u0010h\u001a\u00020+2\b\b\u0002\u0010i\u001a\u00020+2\b\b\u0002\u0010j\u001a\u00020;J\u000e\u0010k\u001a\u00020D2\u0006\u0010g\u001a\u00020+J\u0006\u0010l\u001a\u00020DJ\u001c\u0010m\u001a\u00020D2\f\u0010n\u001a\b\u0012\u0004\u0012\u00020o0W2\u0006\u0010p\u001a\u00020;J\u001c\u0010q\u001a\u00020D2\f\u0010n\u001a\b\u0012\u0004\u0012\u00020o0W2\u0006\u0010r\u001a\u00020;J\u0006\u0010s\u001a\u00020DJ\u0006\u0010t\u001a\u00020DJ\u000e\u0010u\u001a\u00020D2\u0006\u0010g\u001a\u00020+J\u001c\u0010v\u001a\u00020w2\b\u0010x\u001a\u0004\u0018\u00010@2\n\u0010y\u001a\u0006\u0012\u0002\b\u00030%J#\u0010z\u001a\u00020D2\n\u0010{\u001a\u0006\u0012\u0002\b\u00030>2\b\b\u0002\u0010\u001b\u001a\u00020;H\u0001¢\u0006\u0002\b|R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\u0013\u001a\u0004\u0018\u00010\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0015\u0010\u0016R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001cX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001d\u001a\u00020\u001e8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u000e\u0010!\u001a\u00020\"X\u0082\u0004¢\u0006\u0002\n\u0000R2\u0010#\u001a&\u0012\b\u0012\u0006\u0012\u0002\b\u00030%\u0012\u0004\u0012\u00020&0$j\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030%\u0012\u0004\u0012\u00020&`'X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020)X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010*\u001a\u00020+X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u0014\u0010.\u001a\u00020+X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b/\u0010-R\u0016\u00100\u001a\u0004\u0018\u0001018VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b2\u00103R\u0014\u00104\u001a\u000205X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b6\u00107R\u000e\u00108\u001a\u000209X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006~"}, m90084d2 = {"Lcom/jumio/core/api/BackendManager;", "Lcom/jumio/core/network/ApiCallSettings;", "Lcom/jumio/core/network/ApiResult;", "context", "Landroid/content/Context;", "scopeProvider", "Lcom/jumio/core/scope/ScopeProviderInterface;", "dataManager", "Lcom/jumio/core/persistence/DataManager;", "authorizationModel", "Lcom/jumio/core/models/AuthorizationModel;", "<init>", "(Landroid/content/Context;Lcom/jumio/core/scope/ScopeProviderInterface;Lcom/jumio/core/persistence/DataManager;Lcom/jumio/core/models/AuthorizationModel;)V", "getContext", "()Landroid/content/Context;", "getScopeProvider", "()Lcom/jumio/core/scope/ScopeProviderInterface;", "getDataManager", "()Lcom/jumio/core/persistence/DataManager;", "aleCore", "Lcom/jumio/ale/swig/ALECore;", "getAleCore", "()Lcom/jumio/ale/swig/ALECore;", "aleCore$delegate", "Lkotlin/Lazy;", "single", "Lcom/jumio/core/api/SingleProcessor;", "queue", "Lcom/jumio/core/api/QueueProcessor;", "timeoutModel", "Lcom/jumio/core/models/TimeoutModel;", "getTimeoutModel", "()Lcom/jumio/core/models/TimeoutModel;", "cacheLock", "", "resultBinding", "Ljava/util/HashMap;", "Ljava/lang/Class;", "Lcom/jumio/core/network/ApiBinding;", "Lkotlin/collections/HashMap;", "settings", "Lcom/jumio/core/network/BackendSettings;", "host", "", "getHost", "()Ljava/lang/String;", C33812n7.f71057p, "getUserAgent", "encryptionProvider", "Lcom/jumio/core/network/EncryptionProvider;", "getEncryptionProvider", "()Lcom/jumio/core/network/EncryptionProvider;", "trustManager", "Lcom/jumio/core/network/TrustManagerInterface;", "getTrustManager", "()Lcom/jumio/core/network/TrustManagerInterface;", "retryCount", "", "determineKeyPinning", "", "handleKeyPinningRetry", "apiCallDataModel", "Lcom/jumio/core/models/ApiCallDataModel;", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "", "checkKeyPinningFlag", DbParams.KEY_CHANNEL_RESULT, "onError", "", "onResult", "persist", "persistor", "Lcom/jumio/core/persistence/PersistenceUtil$Persist;", InterfaceC33730j9.f70350a, "restore", "restorer", "Lcom/jumio/core/persistence/PersistenceUtil$Restore;", "addBinding", "binding", "removeBinding", "cancelCall", "clearQueue", "retry", "remove", "clazz", "Lcom/jumio/core/network/ApiCall;", "availablePluginNames", "", "uploadPart", URLCredentialContract.FeedEntry.TABLE_NAME, "Lcom/jumio/sdk/credentials/JumioCredential;", "scanPartModel", "Lcom/jumio/core/models/ScanPartModel;", "uploadRawData", "parts", "Ljava/util/LinkedHashMap;", "Lkotlin/collections/LinkedHashMap;", "scanPartId", "contentId", "usability", "resultKey", "reusableIdLookup", "digitalIdentityWebView", "jwt", "diSubtype", "locale", "darkMode", "digitalIdentityOutcome", "extractData", "reporting", DbParams.TABLE_EVENTS, "Lcom/jumio/analytics/AnalyticsEvent;", "fireAndForget", "analytics", "lastCall", "finalizeCall", "authenticate", "digitalIdentityEidas", "errorFromThrowable", "Lcom/jumio/core/error/Error;", "e", "apiCallClass", "addRequest", "model", "addRequest$jumio_core_release", "Companion", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nBackendManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BackendManager.kt\ncom/jumio/core/api/BackendManager\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,428:1\n13402#2,2:429\n13402#2,2:431\n37#3:433\n36#3,3:434\n*S KotlinDebug\n*F\n+ 1 BackendManager.kt\ncom/jumio/core/api/BackendManager\n*L\n194#1:429,2\n202#1:431,2\n227#1:433\n227#1:434,3\n*E\n"})
public final class BackendManager implements InterfaceC40657f, InterfaceC40662g {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a */
    public final Context f13684a;

    /* JADX INFO: renamed from: b */
    public final ScopeProviderInterface f13685b;

    /* JADX INFO: renamed from: c */
    public final DataManager f13686c;

    /* JADX INFO: renamed from: d */
    public final AuthorizationModel f13687d;

    /* JADX INFO: renamed from: e */
    public final Lazy f13688e;

    /* JADX INFO: renamed from: f */
    public final SingleProcessor f13689f;

    /* JADX INFO: renamed from: g */
    public final QueueProcessor f13690g;

    /* JADX INFO: renamed from: h */
    public final Object f13691h;

    /* JADX INFO: renamed from: i */
    public final HashMap f13692i;

    /* JADX INFO: renamed from: j */
    public final C40682k f13693j;

    /* JADX INFO: renamed from: k */
    public final String f13694k;

    /* JADX INFO: renamed from: l */
    public final String f13695l;

    /* JADX INFO: renamed from: m */
    public final TrustManagerInterface f13696m;

    /* JADX INFO: renamed from: n */
    public int f13697n;

    @Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0004\u001a\u00020\u00052\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0007H\u0000¢\u0006\u0002\b\b¨\u0006\t"}, m90084d2 = {"Lcom/jumio/core/api/BackendManager$Companion;", "", "<init>", "()V", "requestCode", "", "sourceClass", "Ljava/lang/Class;", "requestCode$jumio_core_release", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public final int requestCode$jumio_core_release(@NotNull Class<?> sourceClass) {
            Intrinsics.checkNotNullParameter(sourceClass, "sourceClass");
            if (Intrinsics.areEqual(sourceClass, SettingsCall.class)) {
                return 1;
            }
            if (Intrinsics.areEqual(sourceClass, C40669h1.class)) {
                return 3;
            }
            if (Intrinsics.areEqual(sourceClass, UploadCall.class)) {
                return 4;
            }
            if (Intrinsics.areEqual(sourceClass, C40686k3.class)) {
                return 5;
            }
            if (Intrinsics.areEqual(sourceClass, C40719r1.class)) {
                return 6;
            }
            if (Intrinsics.areEqual(sourceClass, UsabilityCall.class)) {
                return 7;
            }
            if (Intrinsics.areEqual(sourceClass, DigitalIdentityWebViewCall.class)) {
                return 10;
            }
            if (Intrinsics.areEqual(sourceClass, DigitalIdentityOutcomeCall.class)) {
                return 11;
            }
            if (Intrinsics.areEqual(sourceClass, AuthenticationCall.class)) {
                return 12;
            }
            if (Intrinsics.areEqual(sourceClass, DigitalIdentityEidasCall.class)) {
                return 13;
            }
            return Intrinsics.areEqual(sourceClass, ReusableIdLookupCall.class) ? 14 : 0;
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* JADX WARN: Code duplicated, block: B:55:0x00c0  */
    /* JADX INFO: renamed from: a */
    public static final C40589R3 m14496a(BackendManager backendManager) {
        String str;
        Object obj;
        if (!Environment.INSTANCE.loadAleLib(backendManager.getF13684a())) {
            return null;
        }
        String str2 = AbstractC40642c.f90224a;
        String url = backendManager.f13693j.f90308a;
        Intrinsics.checkNotNullParameter(url, "url");
        try {
            Matcher matcher = Pattern.compile("^https://sdk\\.(amer|emea|apac)-1\\.(jumio\\.ai|jumiopp.link|jumio.link)/?.*$").matcher(url);
            if (matcher.matches()) {
                String strGroup = matcher.group(1);
                String str3 = "";
                if (strGroup != null) {
                    int iHashCode = strGroup.hashCode();
                    if (iHashCode != 2997721) {
                        if (iHashCode != 3000465) {
                            obj = (iHashCode == 3116868 && strGroup.equals("emea")) ? JumioDataCenter.EU : "";
                        } else if (strGroup.equals("apac")) {
                            obj = JumioDataCenter.SG;
                        }
                    } else if (strGroup.equals("amer")) {
                        obj = JumioDataCenter.US;
                    }
                }
                String strGroup2 = matcher.group(2);
                if (strGroup2 != null) {
                    int iHashCode2 = strGroup2.hashCode();
                    if (iHashCode2 != -1759325952) {
                        if (iHashCode2 != -261048658) {
                            if (iHashCode2 == 10546432 && strGroup2.equals("jumiopp.link")) {
                                str3 = "staging";
                            }
                        } else if (strGroup2.equals("jumio.ai")) {
                            str3 = "prod";
                        }
                    } else if (strGroup2.equals("jumio.link")) {
                        str3 = "test";
                    }
                }
                str = str3 + obj;
                if (str.length() == 0) {
                    str = null;
                }
            } else {
                str = null;
            }
        } catch (Exception e11) {
            Log.printStackTrace(e11);
        }
        String str4 = Environment.INSTANCE.getDataDirectory(backendManager.getF13684a()).getAbsolutePath() + "/ale/";
        if (str != null) {
            str4 = str4 + str + '/';
        }
        File file = new File(str4);
        if (!file.exists() && !file.mkdirs()) {
            return null;
        }
        ALESettings aLESettings = new ALESettings();
        aLESettings.setKeyID(backendManager.f13693j.f90309b);
        aLESettings.setPublicKey(backendManager.f13693j.f90310c);
        aLESettings.setDirectory(str4);
        return new C40589R3(aLESettings);
    }

    @Override // jumio.core.InterfaceC40657f
    @Nullable
    public synchronized EncryptionProvider getEncryptionProvider() {
        ALECore aLECore = (ALECore) this.f13688e.getValue();
        if (aLECore == null) {
            return null;
        }
        return new C40630a(aLECore, this.f13687d.getAuthorization());
    }

    public BackendManager(@NotNull Context context, @NotNull ScopeProviderInterface scopeProvider, @NotNull DataManager dataManager, @NotNull AuthorizationModel authorizationModel) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
        Intrinsics.checkNotNullParameter(dataManager, "dataManager");
        Intrinsics.checkNotNullParameter(authorizationModel, "authorizationModel");
        this.f13684a = context;
        this.f13685b = scopeProvider;
        this.f13686c = dataManager;
        this.f13687d = authorizationModel;
        this.f13688e = LazyKt.lazy(new Function0() { // from class: i9.b
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BackendManager.m14496a(this.f86420b);
            }
        });
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
        Intrinsics.checkNotNullExpressionValue(executorServiceNewSingleThreadExecutor, "newSingleThreadExecutor(...)");
        this.f13689f = new SingleProcessor(executorServiceNewSingleThreadExecutor, this, this);
        ExecutorService executorServiceNewSingleThreadExecutor2 = Executors.newSingleThreadExecutor();
        Intrinsics.checkNotNullExpressionValue(executorServiceNewSingleThreadExecutor2, "newSingleThreadExecutor(...)");
        this.f13690g = new QueueProcessor(executorServiceNewSingleThreadExecutor2, getF13685b(), this, this);
        this.f13691h = new Object();
        this.f13692i = new HashMap();
        ServiceLocator serviceLocator = ServiceLocator.INSTANCE;
        C40682k c40682k = ((BackendConfigInterface) ServiceLocatorInterface.getServiceImplementation$default(serviceLocator, BackendConfigInterface.class, null, 2, null)).get(authorizationModel.getF14183a());
        this.f13693j = c40682k;
        this.f13694k = c40682k.f90308a;
        this.f13695l = DeviceUtilKt.getDeviceUtil().userAgent(getF13684a());
        TrustManagerInterface trustManagerInterface = (TrustManagerInterface) ServiceLocatorInterface.getServiceImplementation$default(serviceLocator, TrustManagerInterface.class, null, 2, null);
        String host = new URL(getF13694k()).getHost();
        Intrinsics.checkNotNullExpressionValue(host, "getHost(...)");
        trustManagerInterface.setHostname(host);
        trustManagerInterface.setKeyPinning(new C40672i(this));
        this.f13696m = trustManagerInterface;
    }

    public static /* synthetic */ void addRequest$jumio_core_release$default(BackendManager backendManager, ApiCallDataModel apiCallDataModel, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = true;
        }
        backendManager.addRequest$jumio_core_release(apiCallDataModel, z11);
    }

    public static /* synthetic */ void digitalIdentityWebView$default(BackendManager backendManager, String str, String str2, String str3, boolean z11, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            str3 = "en-US";
        }
        if ((i11 & 8) != 0) {
            z11 = false;
        }
        backendManager.digitalIdentityWebView(str, str2, str3, z11);
    }

    public static /* synthetic */ void uploadRawData$default(BackendManager backendManager, JumioCredential jumioCredential, LinkedHashMap linkedHashMap, String str, String str2, int i11, Object obj) {
        if ((i11 & 8) != 0) {
            str2 = "";
        }
        backendManager.uploadRawData(jumioCredential, linkedHashMap, str, str2);
    }

    public final void addBinding(@NotNull ApiBinding binding) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        synchronized (this.f13691h) {
            try {
                for (Class<? extends ApiCall<?>> cls : binding.getBindingClasses()) {
                    this.f13692i.put(cls, binding);
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @VisibleForTesting(otherwise = 2)
    public final void addRequest$jumio_core_release(@NotNull ApiCallDataModel<?> model, boolean queue) {
        Intrinsics.checkNotNullParameter(model, "model");
        if (!Environment.INSTANCE.loadAleLib(getF13684a())) {
            onError(model, new Error(ErrorCase.OCR_LOADING_FAILED, 0, 0, 6, null));
            return;
        }
        if (!queue) {
            this.f13689f.m14503a(model);
            return;
        }
        QueueProcessor queueProcessor = this.f13690g;
        queueProcessor.getClass();
        Intrinsics.checkNotNullParameter(model, "c");
        synchronized (queueProcessor.f13702e) {
            try {
                queueProcessor.f13701d.add(model);
                Log.m14474i("QueueProcessor", "  item added! ".concat(model.getCall().getSimpleName()));
                if (queueProcessor.f13704g == null) {
                    queueProcessor.m14501b();
                } else {
                    Log.m14474i("QueueProcessor", "  don't proceed, a call is executing");
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void analytics(@NotNull List<AnalyticsEvent> events, boolean lastCall) {
        Intrinsics.checkNotNullParameter(events, "events");
        ApiCallDataModel<?> apiCallDataModel = new ApiCallDataModel<>(AnalyticsCall.class);
        apiCallDataModel.setTimeout(((TimeoutModel) getF13686c().get(TimeoutModel.class)).getAnalytics());
        apiCallDataModel.setFireAndForget(lastCall);
        apiCallDataModel.setIgnoreErrors(lastCall);
        apiCallDataModel.getData().put("DATA_EVENTS", new ArrayList(events));
        apiCallDataModel.getData().put("TIME_MODEL", getF13686c().get(TimeModel.class));
        addRequest$jumio_core_release(apiCallDataModel, lastCall);
    }

    public final void authenticate() {
        ApiCallDataModel apiCallDataModel = new ApiCallDataModel(AuthenticationCall.class);
        apiCallDataModel.setTimeout(((TimeoutModel) getF13686c().get(TimeoutModel.class)).getAuthentication());
        addRequest$jumio_core_release$default(this, apiCallDataModel, false, 2, null);
    }

    public final void cancelCall(boolean clearQueue) {
        this.f13690g.m14499a();
        if (clearQueue) {
            QueueProcessor queueProcessor = this.f13690g;
            synchronized (queueProcessor.f13702e) {
                queueProcessor.f13701d.clear();
                Unit unit = Unit.INSTANCE;
            }
        }
    }

    public final void digitalIdentityEidas(@NotNull String jwt) {
        Intrinsics.checkNotNullParameter(jwt, "jwt");
        ApiCallDataModel apiCallDataModel = new ApiCallDataModel(DigitalIdentityEidasCall.class);
        apiCallDataModel.getData().put("DATA_JWT", jwt);
        addRequest$jumio_core_release$default(this, apiCallDataModel, false, 2, null);
    }

    public final void digitalIdentityOutcome(@NotNull String jwt) {
        Intrinsics.checkNotNullParameter(jwt, "jwt");
        ApiCallDataModel apiCallDataModel = new ApiCallDataModel(DigitalIdentityOutcomeCall.class);
        apiCallDataModel.setTimeout(10000);
        apiCallDataModel.getData().put("DATA_JWT", jwt);
        addRequest$jumio_core_release$default(this, apiCallDataModel, false, 2, null);
    }

    public final void digitalIdentityWebView(@NotNull String jwt, @NotNull String diSubtype, @NotNull String locale, boolean darkMode) {
        Intrinsics.checkNotNullParameter(jwt, "jwt");
        Intrinsics.checkNotNullParameter(diSubtype, "diSubtype");
        Intrinsics.checkNotNullParameter(locale, "locale");
        ApiCallDataModel apiCallDataModel = new ApiCallDataModel(DigitalIdentityWebViewCall.class);
        apiCallDataModel.setTimeout(10000);
        apiCallDataModel.getData().put("DATA_JWT", jwt);
        apiCallDataModel.getData().put(DigitalIdentityWebViewCall.DATA_DI_SUBTYPE, diSubtype);
        apiCallDataModel.getData().put(DigitalIdentityWebViewCall.DATA_LOCALE, locale);
        apiCallDataModel.getData().put(DigitalIdentityWebViewCall.DATA_DARK_MODE, Boolean.valueOf(darkMode));
        addRequest$jumio_core_release$default(this, apiCallDataModel, false, 2, null);
    }

    @NotNull
    public final Error errorFromThrowable(@Nullable Throwable e11, @NotNull Class<?> apiCallClass) {
        ErrorCase errorCase;
        Intrinsics.checkNotNullParameter(apiCallClass, "apiCallClass");
        if (e11 instanceof Error) {
            return (Error) e11;
        }
        if (!((ConnectionInterface) ServiceLocator.INSTANCE.getServiceImplementation(ConnectionInterface.class, new Function0() { // from class: i9.a
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BackendManager.m14495a();
            }
        })).isConnected(getF13684a()) || (e11 instanceof C40596T0)) {
            errorCase = ErrorCase.DEVICE_IS_OFFLINE;
        } else {
            boolean z11 = e11 instanceof C40599T3;
            if (z11 && ((C40599T3) e11).f90127a == 401) {
                errorCase = ErrorCase.AUTH_FAILED;
            } else if (z11 && ((C40599T3) e11).f90127a == 305) {
                errorCase = ErrorCase.ALE_KEY_NOT_VALID;
            } else if (z11 && ((C40599T3) e11).f90127a == 412) {
                errorCase = ErrorCase.TRANSACTION_FINISHED;
            } else if (e11 instanceof SSLException) {
                errorCase = ErrorCase.CERTIFICATE_ERROR;
            } else if (z11 && ((C40599T3) e11).f90127a == 400 && Intrinsics.areEqual(apiCallClass, C40719r1.class)) {
                errorCase = ErrorCase.PROCESS_CANT_BE_COMPLETED;
            } else {
                errorCase = (z11 && ((C40599T3) e11).f90127a == 429) ? ErrorCase.BLOCKING_NETWORK_ERROR : ErrorCase.GENERAL_NETWORK_ERROR;
            }
        }
        return new Error(errorCase, INSTANCE.requestCode$jumio_core_release(apiCallClass), e11 instanceof C40599T3 ? ((C40599T3) e11).f90127a : 0);
    }

    public final void extractData() {
        ApiCallDataModel apiCallDataModel = new ApiCallDataModel(C40669h1.class);
        apiCallDataModel.setTimeout(((TimeoutModel) getF13686c().get(TimeoutModel.class)).getExtractdata());
        addRequest$jumio_core_release$default(this, apiCallDataModel, false, 2, null);
    }

    public final void finalizeCall() {
        ApiCallDataModel apiCallDataModel = new ApiCallDataModel(C40719r1.class);
        apiCallDataModel.setTimeout(((TimeoutModel) getF13686c().get(TimeoutModel.class)).getFinalize());
        addRequest$jumio_core_release$default(this, apiCallDataModel, false, 2, null);
    }

    @Override // jumio.core.InterfaceC40657f
    @NotNull
    /* JADX INFO: renamed from: getContext, reason: from getter */
    public Context getF13684a() {
        return this.f13684a;
    }

    @Override // jumio.core.InterfaceC40657f
    @NotNull
    /* JADX INFO: renamed from: getDataManager, reason: from getter */
    public DataManager getF13686c() {
        return this.f13686c;
    }

    @Override // jumio.core.InterfaceC40657f
    @NotNull
    /* JADX INFO: renamed from: getHost, reason: from getter */
    public String getF13694k() {
        return this.f13694k;
    }

    @Override // jumio.core.InterfaceC40657f
    @NotNull
    /* JADX INFO: renamed from: getScopeProvider, reason: from getter */
    public ScopeProviderInterface getF13685b() {
        return this.f13685b;
    }

    @Override // jumio.core.InterfaceC40657f
    @NotNull
    /* JADX INFO: renamed from: getTrustManager, reason: from getter */
    public TrustManagerInterface getF13696m() {
        return this.f13696m;
    }

    @Override // jumio.core.InterfaceC40657f
    @NotNull
    /* JADX INFO: renamed from: getUserAgent, reason: from getter */
    public String getF13695l() {
        return this.f13695l;
    }

    @Override // jumio.core.InterfaceC40662g
    public void onError(@NotNull ApiCallDataModel<?> apiCallDataModel, @Nullable Throwable error) {
        int i11;
        Intrinsics.checkNotNullParameter(apiCallDataModel, "apiCallDataModel");
        synchronized (this.f13691h) {
            if (Intrinsics.areEqual(apiCallDataModel.getCall(), SettingsCall.class) && (error instanceof SSLException) && (i11 = this.f13697n) < 3) {
                this.f13697n = i11 + 1;
                this.f13690g.m14502c();
                return;
            }
            if (this.f13692i.containsKey(apiCallDataModel.getCall())) {
                ApiBinding apiBinding = (ApiBinding) this.f13692i.get(apiCallDataModel.getCall());
                if (apiBinding != null) {
                    apiBinding.onError(apiCallDataModel, error);
                    Unit unit = Unit.INSTANCE;
                }
            } else {
                Log.m14467e("No error binding for ".concat(apiCallDataModel.getCall().getSimpleName()));
                Unit unit2 = Unit.INSTANCE;
            }
        }
    }

    @Override // jumio.core.InterfaceC40662g
    public void onResult(@NotNull ApiCallDataModel<?> apiCallDataModel, @Nullable Object result) {
        Intrinsics.checkNotNullParameter(apiCallDataModel, "apiCallDataModel");
        synchronized (this.f13691h) {
            try {
                if (Intrinsics.areEqual(apiCallDataModel.getCall(), SettingsCall.class)) {
                    JSONObject jSONObject = result instanceof JSONObject ? (JSONObject) result : null;
                    if (jSONObject != null && jSONObject.optBoolean("keyPinning", true) && this.f13697n >= 3) {
                        onError(apiCallDataModel, new SSLException("key pinning missmatch"));
                        return;
                    }
                }
                if (this.f13692i.containsKey(apiCallDataModel.getCall())) {
                    ApiBinding apiBinding = (ApiBinding) this.f13692i.get(apiCallDataModel.getCall());
                    if (apiBinding != null) {
                        apiBinding.onResult(apiCallDataModel, result);
                        Unit unit = Unit.INSTANCE;
                    }
                } else {
                    Log.m14482w("No result binding for ".concat(apiCallDataModel.getCall().getSimpleName()));
                    Unit unit2 = Unit.INSTANCE;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void persist(@NotNull C40574O2 persistor, boolean z11) {
        Intrinsics.checkNotNullParameter(persistor, "persistor");
        if (z11) {
            synchronized (this.f13691h) {
                this.f13692i.clear();
                Unit unit = Unit.INSTANCE;
            }
        }
        SingleProcessor singleProcessor = this.f13689f;
        singleProcessor.getClass();
        Intrinsics.checkNotNullParameter(persistor, "persistor");
        ApiCallDataModel<?> apiCallDataModel = null;
        if (z11) {
            try {
                ApiCall apiCall = singleProcessor.f13709d;
                if (apiCall != null) {
                    apiCall.removeAllSubscriber();
                }
                Future future = singleProcessor.f13710e;
                if (future != null) {
                    future.cancel(true);
                }
            } catch (Exception unused) {
            } catch (Throwable th2) {
                singleProcessor.f13710e = null;
                throw th2;
            }
            singleProcessor.f13710e = null;
            ApiCall apiCall2 = singleProcessor.f13709d;
            if (apiCall2 != null) {
                apiCallDataModel = apiCall2.getApiCallDataModel();
            }
        }
        persistor.m89207a(apiCallDataModel);
        this.f13690g.m14500a(persistor, z11);
    }

    public final void remove(@NotNull Class<? extends ApiCall<?>> clazz) {
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        QueueProcessor queueProcessor = this.f13690g;
        queueProcessor.getClass();
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        synchronized (queueProcessor.f13702e) {
            try {
                for (ApiCallDataModel apiCallDataModel : queueProcessor.f13701d) {
                    if (Intrinsics.areEqual(apiCallDataModel.getCall(), clazz)) {
                        queueProcessor.f13701d.remove(apiCallDataModel);
                    }
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void removeBinding(@NotNull ApiBinding binding) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        synchronized (this.f13691h) {
            try {
                for (Class<? extends ApiCall<?>> cls : binding.getBindingClasses()) {
                    this.f13692i.remove(cls);
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void reporting(@NotNull List<AnalyticsEvent> events, boolean fireAndForget) {
        Intrinsics.checkNotNullParameter(events, "events");
        ApiCallDataModel apiCallDataModel = new ApiCallDataModel(C40686k3.class);
        apiCallDataModel.setFireAndForget(fireAndForget);
        apiCallDataModel.setTimeout(((TimeoutModel) getF13686c().get(TimeoutModel.class)).getReporting());
        apiCallDataModel.setIgnoreErrors(fireAndForget);
        apiCallDataModel.getData().put("DATA_EVENTS", new ArrayList(events));
        apiCallDataModel.getData().put("TIME_MODEL", getF13686c().get(TimeModel.class));
        addRequest$jumio_core_release$default(this, apiCallDataModel, false, 2, null);
    }

    public final void restore(@NotNull C40579P2 restorer) {
        Intrinsics.checkNotNullParameter(restorer, "restorer");
        SingleProcessor singleProcessor = this.f13689f;
        singleProcessor.getClass();
        Intrinsics.checkNotNullParameter(restorer, "restorer");
        ApiCallDataModel apiCallDataModel = (ApiCallDataModel) restorer.m89209a();
        if (apiCallDataModel != null) {
            singleProcessor.m14503a(apiCallDataModel);
        }
        QueueProcessor queueProcessor = this.f13690g;
        queueProcessor.getClass();
        Intrinsics.checkNotNullParameter(restorer, "restorer");
        synchronized (queueProcessor.f13702e) {
            ConcurrentLinkedQueue concurrentLinkedQueue = (ConcurrentLinkedQueue) restorer.m89209a();
            if (concurrentLinkedQueue != null) {
                queueProcessor.f13701d.addAll(concurrentLinkedQueue);
            }
        }
    }

    public final void retry() {
        this.f13690g.m14501b();
    }

    public final void settings(@NotNull List<String> availablePluginNames) {
        Intrinsics.checkNotNullParameter(availablePluginNames, "availablePluginNames");
        ApiCallDataModel apiCallDataModel = new ApiCallDataModel(SettingsCall.class);
        apiCallDataModel.setTimeout(10000);
        apiCallDataModel.getData().put("DATA_AVAILABLE_PLUGIN_NAMES", availablePluginNames.toArray(new String[0]));
        addRequest$jumio_core_release$default(this, apiCallDataModel, false, 2, null);
    }

    public final void uploadPart(@NotNull JumioCredential credential, @NotNull ScanPartModel scanPartModel) {
        Intrinsics.checkNotNullParameter(credential, "credential");
        Intrinsics.checkNotNullParameter(scanPartModel, "scanPartModel");
        uploadRawData(credential, MapsKt.linkedMapOf(TuplesKt.m90091to(AbstractC40505A3.m89147a(scanPartModel), scanPartModel)), scanPartModel.getF14318g(), scanPartModel.getF14312a().name());
    }

    public final void uploadRawData(@NotNull JumioCredential credential, @NotNull LinkedHashMap<String, Object> parts, @NotNull String scanPartId, @NotNull String contentId) {
        Intrinsics.checkNotNullParameter(credential, "credential");
        Intrinsics.checkNotNullParameter(parts, "parts");
        Intrinsics.checkNotNullParameter(scanPartId, "scanPartId");
        Intrinsics.checkNotNullParameter(contentId, "contentId");
        ApiCallDataModel apiCallDataModel = new ApiCallDataModel(UploadCall.class);
        apiCallDataModel.setScanPartId(scanPartId);
        apiCallDataModel.setContentId(contentId);
        apiCallDataModel.setTimeout(((TimeoutModel) getF13686c().get(TimeoutModel.class)).getUpload());
        apiCallDataModel.getData().put(UploadCall.DATA_CREDENTIAL_ID, credential.getF14676b().f14197a);
        apiCallDataModel.getData().put(UploadCall.DATA_PARTS, parts);
        addRequest$jumio_core_release$default(this, apiCallDataModel, false, 2, null);
    }

    public final void usability(@NotNull String resultKey, @NotNull String scanPartId, @NotNull String contentId) {
        Intrinsics.checkNotNullParameter(resultKey, "resultKey");
        Intrinsics.checkNotNullParameter(scanPartId, "scanPartId");
        Intrinsics.checkNotNullParameter(contentId, "contentId");
        ApiCallDataModel apiCallDataModel = new ApiCallDataModel(UsabilityCall.class);
        apiCallDataModel.setScanPartId(scanPartId);
        apiCallDataModel.setContentId(contentId);
        apiCallDataModel.setTimeout(((TimeoutModel) getF13686c().get(TimeoutModel.class)).getUsability());
        apiCallDataModel.getData().put(UsabilityCall.DATA_RESULT_KEY, resultKey);
        addRequest$jumio_core_release$default(this, apiCallDataModel, false, 2, null);
    }

    public static final boolean access$determineKeyPinning(BackendManager backendManager) {
        SettingsModel settingsModel = (SettingsModel) backendManager.getF13686c().get(SettingsModel.class);
        if (settingsModel.isLoaded()) {
            return settingsModel.getKeyPinningEnabled();
        }
        if (backendManager.f13697n >= 3) {
            return false;
        }
        return true;
    }

    public final void reusableIdLookup() {
        String lowerCase = String.valueOf(UUID.randomUUID()).toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        String string = StringsKt.trim((CharSequence) lowerCase).toString();
        ApiCallDataModel apiCallDataModel = new ApiCallDataModel(ReusableIdLookupCall.class);
        apiCallDataModel.setTimeout(((TimeoutModel) getF13686c().get(TimeoutModel.class)).getReusableIdLookUp());
        apiCallDataModel.setIgnoreErrors(true);
        apiCallDataModel.getData().put("KEY_LOOKUP_ID", string);
        addRequest$jumio_core_release$default(this, apiCallDataModel, false, 2, null);
    }

    /* JADX INFO: renamed from: a */
    public static final ConnectionInterface m14495a() {
        return new ConnectionChecker();
    }
}
