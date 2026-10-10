package com.google.firebase.sessions.settings;

import android.os.Build;
import android.util.Log;
import androidx.annotation.VisibleForTesting;
import androidx.datastore.core.DataStore;
import androidx.datastore.preferences.core.Preferences;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.google.firebase.installations.FirebaseInstallationsApi;
import com.google.firebase.sessions.ApplicationInfo;
import com.google.firebase.sessions.InstallationId;
import java.util.Arrays;
import java.util.Map;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.C41713n0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.ResultKt;
import p852kotlin.TuplesKt;
import p852kotlin.Unit;
import p852kotlin.collections.MapsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.CoroutineContext;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.jvm.internal.StringCompanionObject;
import p852kotlin.text.Regex;
import p852kotlin.time.Duration;
import p852kotlin.time.DurationKt;
import p852kotlin.time.DurationUnit;
import rg0.C44087f;
import rg0.InterfaceC44082a;

/* JADX INFO: compiled from: RemoteSettings.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m90083d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0005\b\u0000\u0018\u0000 42\u00020\u0001:\u00014B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0013\u0010\u0014\u001a\u00020\u0013H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001b\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001cR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001dR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001eR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001fR\u001b\u0010%\u001a\u00020 8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0014\u0010'\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0016\u0010+\u001a\u0004\u0018\u00010\u00168VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b)\u0010*R\u001f\u0010/\u001a\u0004\u0018\u00010,8VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b-\u0010.R\u0016\u00103\u001a\u0004\u0018\u0001008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b1\u00102\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00065"}, m90084d2 = {"Lcom/google/firebase/sessions/settings/RemoteSettings;", "Lcom/google/firebase/sessions/settings/SettingsProvider;", "Lkotlin/coroutines/CoroutineContext;", "backgroundDispatcher", "Lcom/google/firebase/installations/FirebaseInstallationsApi;", "firebaseInstallationsApi", "Lcom/google/firebase/sessions/ApplicationInfo;", "appInfo", "Lcom/google/firebase/sessions/settings/CrashlyticsSettingsFetcher;", "configsFetcher", "Landroidx/datastore/core/DataStore;", "Landroidx/datastore/preferences/core/Preferences;", "dataStore", "<init>", "(Lkotlin/coroutines/CoroutineContext;Lcom/google/firebase/installations/FirebaseInstallationsApi;Lcom/google/firebase/sessions/ApplicationInfo;Lcom/google/firebase/sessions/settings/CrashlyticsSettingsFetcher;Landroidx/datastore/core/DataStore;)V", "", CmcdData.Factory.STREAMING_FORMAT_SS, "removeForwardSlashesIn", "(Ljava/lang/String;)Ljava/lang/String;", "", "updateSettings", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "isSettingsStale", "()Z", "clearCachedSettings$com_google_firebase_firebase_sessions", "()V", "clearCachedSettings", "Lkotlin/coroutines/CoroutineContext;", "Lcom/google/firebase/installations/FirebaseInstallationsApi;", "Lcom/google/firebase/sessions/ApplicationInfo;", "Lcom/google/firebase/sessions/settings/CrashlyticsSettingsFetcher;", "Lcom/google/firebase/sessions/settings/SettingsCache;", "settingsCache$delegate", "Lkotlin/Lazy;", "getSettingsCache", "()Lcom/google/firebase/sessions/settings/SettingsCache;", "settingsCache", "Lrg0/a;", "fetchInProgress", "Lrg0/a;", "getSessionEnabled", "()Ljava/lang/Boolean;", "sessionEnabled", "Lkotlin/time/Duration;", "getSessionRestartTimeout-FghU774", "()Lkotlin/time/Duration;", "sessionRestartTimeout", "", "getSamplingRate", "()Ljava/lang/Double;", "samplingRate", "Companion", "com.google.firebase-firebase-sessions"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nRemoteSettings.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RemoteSettings.kt\ncom/google/firebase/sessions/settings/RemoteSettings\n+ 2 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n*L\n1#1,164:1\n107#2,10:165\n*S KotlinDebug\n*F\n+ 1 RemoteSettings.kt\ncom/google/firebase/sessions/settings/RemoteSettings\n*L\n68#1:165,10\n*E\n"})
public final class RemoteSettings implements SettingsProvider {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @Deprecated
    @NotNull
    public static final String FORWARD_SLASH_STRING = "/";

    @Deprecated
    @NotNull
    public static final String TAG = "SessionConfigFetcher";

    @NotNull
    private final ApplicationInfo appInfo;

    @NotNull
    private final CoroutineContext backgroundDispatcher;

    @NotNull
    private final CrashlyticsSettingsFetcher configsFetcher;

    @NotNull
    private final InterfaceC44082a fetchInProgress;

    @NotNull
    private final FirebaseInstallationsApi firebaseInstallationsApi;

    /* JADX INFO: renamed from: settingsCache$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy settingsCache;

    /* JADX INFO: compiled from: RemoteSettings.kt */
    @Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m90084d2 = {"Lcom/google/firebase/sessions/settings/RemoteSettings$Companion;", "", "()V", "FORWARD_SLASH_STRING", "", "TAG", "com.google.firebase-firebase-sessions"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: com.google.firebase.sessions.settings.RemoteSettings$updateSettings$1 */
    /* JADX INFO: compiled from: RemoteSettings.kt */
    @Metadata(m90085k = 3, m90086mv = {1, 8, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.google.firebase.sessions.settings.RemoteSettings", m90122f = "RemoteSettings.kt", m90123i = {0, 0, 1, 1, 2}, m90124l = {170, 76, 94}, m90125m = "updateSettings", m90126n = {"this", "$this$withLock_u24default$iv", "this", "$this$withLock_u24default$iv", "$this$withLock_u24default$iv"}, m90127s = {"L$0", "L$1", "L$0", "L$1", "L$0"})
    public static final class C89011 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C89011(Continuation<? super C89011> continuation) {
            super(continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RemoteSettings.this.updateSettings(this);
        }
    }

    public RemoteSettings(@NotNull CoroutineContext backgroundDispatcher, @NotNull FirebaseInstallationsApi firebaseInstallationsApi, @NotNull ApplicationInfo appInfo, @NotNull CrashlyticsSettingsFetcher configsFetcher, @NotNull final DataStore<Preferences> dataStore) {
        Intrinsics.checkNotNullParameter(backgroundDispatcher, "backgroundDispatcher");
        Intrinsics.checkNotNullParameter(firebaseInstallationsApi, "firebaseInstallationsApi");
        Intrinsics.checkNotNullParameter(appInfo, "appInfo");
        Intrinsics.checkNotNullParameter(configsFetcher, "configsFetcher");
        Intrinsics.checkNotNullParameter(dataStore, "dataStore");
        this.backgroundDispatcher = backgroundDispatcher;
        this.firebaseInstallationsApi = firebaseInstallationsApi;
        this.appInfo = appInfo;
        this.configsFetcher = configsFetcher;
        this.settingsCache = LazyKt.lazy(new Function0<SettingsCache>() { // from class: com.google.firebase.sessions.settings.RemoteSettings$settingsCache$2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p852kotlin.jvm.functions.Function0
            @NotNull
            public final SettingsCache invoke() {
                return new SettingsCache(dataStore);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        });
        this.fetchInProgress = C44087f.m97144b(false, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SettingsCache getSettingsCache() {
        return (SettingsCache) this.settingsCache.getValue();
    }

    private final String removeForwardSlashesIn(String s11) {
        return new Regex("/").replace(s11, "");
    }

    @VisibleForTesting
    public final void clearCachedSettings$com_google_firebase_firebase_sessions() {
        C41696j.m91104d(C41713n0.m91125a(this.backgroundDispatcher), null, null, new RemoteSettings$clearCachedSettings$1(this, null), 3, null);
    }

    /* JADX WARN: Code duplicated, block: B:49:0x00c7 A[Catch: all -> 0x004f, TRY_LEAVE, TryCatch #2 {all -> 0x004f, blocks: (B:21:0x004a, B:47:0x00b9, B:49:0x00c7, B:52:0x00d2), top: B:64:0x004a }] */
    /* JADX WARN: Code duplicated, block: B:52:0x00d2 A[Catch: all -> 0x004f, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x004f, blocks: (B:21:0x004a, B:47:0x00b9, B:49:0x00c7, B:52:0x00d2), top: B:64:0x004a }] */
    /* JADX WARN: Code duplicated, block: B:55:0x014f  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.google.firebase.sessions.settings.SettingsProvider
    @Nullable
    public Object updateSettings(@NotNull Continuation<? super Unit> continuation) throws Throwable {
        C89011 c89011;
        InterfaceC44082a interfaceC44082a;
        RemoteSettings remoteSettings;
        InterfaceC44082a interfaceC44082a2;
        Throwable th2;
        InterfaceC44082a interfaceC44082a3;
        String fid;
        Map<String, String> mapMapOf;
        CrashlyticsSettingsFetcher crashlyticsSettingsFetcher;
        RemoteSettings$updateSettings$2$1 remoteSettings$updateSettings$2$1;
        RemoteSettings$updateSettings$2$2 remoteSettings$updateSettings$2$2;
        if (continuation instanceof C89011) {
            c89011 = (C89011) continuation;
            int i11 = c89011.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c89011.label = i11 - Integer.MIN_VALUE;
            } else {
                c89011 = new C89011(continuation);
            }
        } else {
            c89011 = new C89011(continuation);
        }
        Object obj = c89011.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c89011.label;
        try {
            if (i12 == 0) {
                ResultKt.throwOnFailure(obj);
                if (!this.fetchInProgress.mo91343b() && !getSettingsCache().hasCacheExpired$com_google_firebase_firebase_sessions()) {
                    return Unit.INSTANCE;
                }
                interfaceC44082a = this.fetchInProgress;
                c89011.L$0 = this;
                c89011.L$1 = interfaceC44082a;
                c89011.label = 1;
                if (interfaceC44082a.mo91344d(null, c89011) != coroutine_suspended) {
                    remoteSettings = this;
                }
                return coroutine_suspended;
            }
            if (i12 != 1) {
                if (i12 != 2) {
                    if (i12 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    interfaceC44082a2 = (InterfaceC44082a) c89011.L$0;
                    try {
                        ResultKt.throwOnFailure(obj);
                        Unit unit = Unit.INSTANCE;
                        interfaceC44082a2.mo91345e(null);
                        return Unit.INSTANCE;
                    } catch (Throwable th3) {
                        th2 = th3;
                        interfaceC44082a2.mo91345e(null);
                        throw th2;
                    }
                }
                interfaceC44082a3 = (InterfaceC44082a) c89011.L$1;
                remoteSettings = (RemoteSettings) c89011.L$0;
                try {
                    ResultKt.throwOnFailure(obj);
                    fid = ((InstallationId) obj).getFid();
                    if (Intrinsics.areEqual(fid, "")) {
                        Log.w(TAG, "Error getting Firebase Installation ID. Skipping this Session Event.");
                        Unit unit2 = Unit.INSTANCE;
                        interfaceC44082a3.mo91345e(null);
                        return unit2;
                    }
                    Pair pairM90091to = TuplesKt.m90091to("X-Crashlytics-Installation-ID", fid);
                    StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                    String str = String.format("%s/%s", Arrays.copyOf(new Object[]{Build.MANUFACTURER, Build.MODEL}, 2));
                    Intrinsics.checkNotNullExpressionValue(str, "format(format, *args)");
                    Pair pairM90091to2 = TuplesKt.m90091to("X-Crashlytics-Device-Model", remoteSettings.removeForwardSlashesIn(str));
                    String INCREMENTAL = Build.VERSION.INCREMENTAL;
                    Intrinsics.checkNotNullExpressionValue(INCREMENTAL, "INCREMENTAL");
                    Pair pairM90091to3 = TuplesKt.m90091to("X-Crashlytics-OS-Build-Version", remoteSettings.removeForwardSlashesIn(INCREMENTAL));
                    String RELEASE = Build.VERSION.RELEASE;
                    Intrinsics.checkNotNullExpressionValue(RELEASE, "RELEASE");
                    mapMapOf = MapsKt.mapOf(pairM90091to, pairM90091to2, pairM90091to3, TuplesKt.m90091to("X-Crashlytics-OS-Display-Version", remoteSettings.removeForwardSlashesIn(RELEASE)), TuplesKt.m90091to("X-Crashlytics-API-Client-Version", remoteSettings.appInfo.getSessionSdkVersion()));
                    Log.d(TAG, "Fetching settings from server.");
                    crashlyticsSettingsFetcher = remoteSettings.configsFetcher;
                    remoteSettings$updateSettings$2$1 = new RemoteSettings$updateSettings$2$1(remoteSettings, null);
                    remoteSettings$updateSettings$2$2 = new RemoteSettings$updateSettings$2$2(null);
                    c89011.L$0 = interfaceC44082a3;
                    c89011.L$1 = null;
                    c89011.label = 3;
                    if (crashlyticsSettingsFetcher.doConfigFetch(mapMapOf, remoteSettings$updateSettings$2$1, remoteSettings$updateSettings$2$2, c89011) != coroutine_suspended) {
                        interfaceC44082a2 = interfaceC44082a3;
                        Unit unit3 = Unit.INSTANCE;
                        interfaceC44082a2.mo91345e(null);
                        return Unit.INSTANCE;
                    }
                    return coroutine_suspended;
                } catch (Throwable th4) {
                    th2 = th4;
                    interfaceC44082a2 = interfaceC44082a3;
                    interfaceC44082a2.mo91345e(null);
                    throw th2;
                }
            }
            InterfaceC44082a interfaceC44082a4 = (InterfaceC44082a) c89011.L$1;
            remoteSettings = (RemoteSettings) c89011.L$0;
            ResultKt.throwOnFailure(obj);
            interfaceC44082a = interfaceC44082a4;
            if (!remoteSettings.getSettingsCache().hasCacheExpired$com_google_firebase_firebase_sessions()) {
                Log.d(TAG, "Remote settings cache not expired. Using cached values.");
                Unit unit4 = Unit.INSTANCE;
                interfaceC44082a.mo91345e(null);
                return unit4;
            }
            InstallationId.Companion companion = InstallationId.INSTANCE;
            FirebaseInstallationsApi firebaseInstallationsApi = remoteSettings.firebaseInstallationsApi;
            c89011.L$0 = remoteSettings;
            c89011.L$1 = interfaceC44082a;
            c89011.label = 2;
            Object objCreate = companion.create(firebaseInstallationsApi, c89011);
            if (objCreate != coroutine_suspended) {
                interfaceC44082a3 = interfaceC44082a;
                obj = objCreate;
                fid = ((InstallationId) obj).getFid();
                if (Intrinsics.areEqual(fid, "")) {
                    Log.w(TAG, "Error getting Firebase Installation ID. Skipping this Session Event.");
                    Unit unit5 = Unit.INSTANCE;
                    interfaceC44082a3.mo91345e(null);
                    return unit5;
                }
                Pair pairM90091to4 = TuplesKt.m90091to("X-Crashlytics-Installation-ID", fid);
                StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
                String str2 = String.format("%s/%s", Arrays.copyOf(new Object[]{Build.MANUFACTURER, Build.MODEL}, 2));
                Intrinsics.checkNotNullExpressionValue(str2, "format(format, *args)");
                Pair pairM90091to5 = TuplesKt.m90091to("X-Crashlytics-Device-Model", remoteSettings.removeForwardSlashesIn(str2));
                String INCREMENTAL2 = Build.VERSION.INCREMENTAL;
                Intrinsics.checkNotNullExpressionValue(INCREMENTAL2, "INCREMENTAL");
                Pair pairM90091to6 = TuplesKt.m90091to("X-Crashlytics-OS-Build-Version", remoteSettings.removeForwardSlashesIn(INCREMENTAL2));
                String RELEASE2 = Build.VERSION.RELEASE;
                Intrinsics.checkNotNullExpressionValue(RELEASE2, "RELEASE");
                mapMapOf = MapsKt.mapOf(pairM90091to4, pairM90091to5, pairM90091to6, TuplesKt.m90091to("X-Crashlytics-OS-Display-Version", remoteSettings.removeForwardSlashesIn(RELEASE2)), TuplesKt.m90091to("X-Crashlytics-API-Client-Version", remoteSettings.appInfo.getSessionSdkVersion()));
                Log.d(TAG, "Fetching settings from server.");
                crashlyticsSettingsFetcher = remoteSettings.configsFetcher;
                remoteSettings$updateSettings$2$1 = new RemoteSettings$updateSettings$2$1(remoteSettings, null);
                remoteSettings$updateSettings$2$2 = new RemoteSettings$updateSettings$2$2(null);
                c89011.L$0 = interfaceC44082a3;
                c89011.L$1 = null;
                c89011.label = 3;
                if (crashlyticsSettingsFetcher.doConfigFetch(mapMapOf, remoteSettings$updateSettings$2$1, remoteSettings$updateSettings$2$2, c89011) != coroutine_suspended) {
                    interfaceC44082a2 = interfaceC44082a3;
                    Unit unit6 = Unit.INSTANCE;
                    interfaceC44082a2.mo91345e(null);
                    return Unit.INSTANCE;
                }
            }
            return coroutine_suspended;
        } catch (Throwable th5) {
            interfaceC44082a2 = interfaceC44082a;
            th2 = th5;
            interfaceC44082a2.mo91345e(null);
            throw th2;
        }
    }

    @Override // com.google.firebase.sessions.settings.SettingsProvider
    @Nullable
    public Double getSamplingRate() {
        return getSettingsCache().sessionSamplingRate();
    }

    @Override // com.google.firebase.sessions.settings.SettingsProvider
    @Nullable
    public Boolean getSessionEnabled() {
        return getSettingsCache().sessionsEnabled();
    }

    @Override // com.google.firebase.sessions.settings.SettingsProvider
    @Nullable
    /* JADX INFO: renamed from: getSessionRestartTimeout-FghU774 */
    public Duration mo103757getSessionRestartTimeoutFghU774() {
        Integer numSessionRestartTimeout = getSettingsCache().sessionRestartTimeout();
        if (numSessionRestartTimeout != null) {
            Duration.Companion companion = Duration.INSTANCE;
            return Duration.m105185boximpl(DurationKt.toDuration(numSessionRestartTimeout.intValue(), DurationUnit.SECONDS));
        }
        return null;
    }

    @Override // com.google.firebase.sessions.settings.SettingsProvider
    public boolean isSettingsStale() {
        return getSettingsCache().hasCacheExpired$com_google_firebase_firebase_sessions();
    }
}
