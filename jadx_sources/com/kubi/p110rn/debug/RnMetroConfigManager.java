package com.kubi.p110rn.debug;

import android.content.Context;
import com.facebook.react.modules.systeminfo.AndroidInfoHelpers;
import com.facebook.react.packagerconnection.PackagerConnectionSettings;
import com.tencent.bugly.proguard.C33844oi;
import com.tencent.rmonitor.base.p144db.table.ReportDataTable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.collections.IntIterator;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.ranges.IntRange;
import p852kotlin.ranges.RangesKt;
import p852kotlin.text.StringsKt;
import y70.C46396e;

/* JADX INFO: compiled from: RnMetroConfigManager.kt */
/* JADX INFO: loaded from: classes39.dex */
@Metadata(m90083d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0017\bÆ\u0002\u0018\u00002\u00020\u0001:\u0002@AB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cJ\u0016\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u00052\u0006\u0010 \u001a\u00020\u0005J\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001a0\"J\u0006\u0010#\u001a\u00020$J\f\u0010%\u001a\b\u0012\u0004\u0012\u00020$0\"J\u000e\u0010&\u001a\u00020\u001e2\u0006\u0010'\u001a\u00020$J\u001e\u0010(\u001a\u00020\u001e2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u00052\u0006\u0010 \u001a\u00020\u0005J\u001e\u0010)\u001a\u00020\u001e2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020+J\"\u0010-\u001a\u00020\u001a2\b\u0010.\u001a\u0004\u0018\u00010\u00052\b\u0010/\u001a\u0004\u0018\u00010\u00052\u0006\u00100\u001a\u00020\u0005J.\u00101\u001a\u00020$2\b\u0010.\u001a\u0004\u0018\u00010\u00052\b\u0010/\u001a\u0004\u0018\u00010\u00052\b\u00102\u001a\u0004\u0018\u00010\u00052\b\u00103\u001a\u0004\u0018\u00010\u0005J\u001a\u00104\u001a\b\u0012\u0004\u0012\u00020\u001a0\"2\f\u00105\u001a\b\u0012\u0004\u0012\u00020\u001a0\"J\u001a\u00106\u001a\b\u0012\u0004\u0012\u00020$0\"2\f\u00107\u001a\b\u0012\u0004\u0012\u00020$0\"J\u000e\u00108\u001a\u00020\u001a2\u0006\u00109\u001a\u00020\u0005J&\u0010:\u001a\u00020+2\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020+2\u0006\u0010;\u001a\u00020\u00052\u0006\u0010<\u001a\u00020\u0005J\u0010\u0010=\u001a\u00020\u001e2\u0006\u00109\u001a\u00020\u001aH\u0002J\u0010\u0010>\u001a\u00020\u001e2\u0006\u0010'\u001a\u00020$H\u0002J\u0010\u0010?\u001a\u00020$2\u0006\u0010'\u001a\u00020$H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006B"}, m90084d2 = {"Lcom/kubi/rn/debug/RnMetroConfigManager;", "", "<init>", "()V", "LOCAL_SERVER_DEBUG_KEY", "", "CATEGORY", "KEY_HOST", "KEY_PORT", "KEY_HISTORY_HOST_PREFIX", "KEY_HISTORY_PORT_PREFIX", "KEY_LOCAL_SERVER_HOST", "KEY_LOCAL_SERVER_PORT", "KEY_LOCAL_SERVER_MODULE", "KEY_LOCAL_SERVER_PARAMS", "KEY_LOCAL_SERVER_HISTORY_HOST_PREFIX", "KEY_LOCAL_SERVER_HISTORY_PORT_PREFIX", "KEY_LOCAL_SERVER_HISTORY_MODULE_PREFIX", "KEY_LOCAL_SERVER_HISTORY_PARAMS_PREFIX", "MAX_HISTORY_COUNT", "", "DEFAULT_LOCAL_SERVER_HOST", "DEFAULT_LOCAL_SERVER_PORT", "DEFAULT_LOCAL_SERVER_MODULE", "DEFAULT_LOCAL_SERVER_PARAMS", "getCurrentHostPort", "Lcom/kubi/rn/debug/RnMetroConfigManager$HostPort;", "context", "Landroid/content/Context;", "saveCurrentHostPort", "", "host", "port", "getCurrentHostPortHistory", "", "getLocalServerConfig", "Lcom/kubi/rn/debug/RnMetroConfigManager$LocalServerConfig;", "getLocalServerConfigHistory", "saveLocalServerConfig", "config", "setReactNativeDebugServerHost", "restoreManagedHostIfNeeded", "isDebug", "", "isLocalServerDebug", "resolveStoredHostPort", "storedHost", "storedPort", "defaultHostPort", "resolveStoredLocalServerConfig", "storedModule", "storedParams", "resolveCurrentHostPortHistory", "hostPorts", "resolveLocalServerConfigHistory", "configs", "splitHostPort", "hostPort", "shouldRestoreManagedHost", "currentDebugServerHost", "managedDebugServerHost", "saveCurrentHostPortHistory", "saveLocalServerConfigHistory", "normalizeLocalServerConfig", "HostPort", "LocalServerConfig", "BReactNativeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nRnMetroConfigManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RnMetroConfigManager.kt\ncom/kubi/rn/debug/RnMetroConfigManager\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,247:1\n1563#2:248\n1634#2,3:249\n1563#2:252\n1634#2,3:253\n1#3:256\n*S KotlinDebug\n*F\n+ 1 RnMetroConfigManager.kt\ncom/kubi/rn/debug/RnMetroConfigManager\n*L\n68#1:248\n68#1:249,3\n88#1:252\n88#1:253,3\n*E\n"})
public final class RnMetroConfigManager {

    @NotNull
    private static final String CATEGORY = "rn_metro_config";

    @NotNull
    private static final String DEFAULT_LOCAL_SERVER_HOST = "localhost";

    @NotNull
    private static final String DEFAULT_LOCAL_SERVER_MODULE = "example";

    @NotNull
    private static final String DEFAULT_LOCAL_SERVER_PARAMS = "";

    @NotNull
    private static final String DEFAULT_LOCAL_SERVER_PORT = "8082";

    @NotNull
    public static final RnMetroConfigManager INSTANCE = new RnMetroConfigManager();

    @NotNull
    private static final String KEY_HISTORY_HOST_PREFIX = "history_host_";

    @NotNull
    private static final String KEY_HISTORY_PORT_PREFIX = "history_port_";

    @NotNull
    private static final String KEY_HOST = "current_host";

    @NotNull
    private static final String KEY_LOCAL_SERVER_HISTORY_HOST_PREFIX = "local_server_history_host_";

    @NotNull
    private static final String KEY_LOCAL_SERVER_HISTORY_MODULE_PREFIX = "local_server_history_module_";

    @NotNull
    private static final String KEY_LOCAL_SERVER_HISTORY_PARAMS_PREFIX = "local_server_history_params_";

    @NotNull
    private static final String KEY_LOCAL_SERVER_HISTORY_PORT_PREFIX = "local_server_history_port_";

    @NotNull
    private static final String KEY_LOCAL_SERVER_HOST = "local_server_host";

    @NotNull
    private static final String KEY_LOCAL_SERVER_MODULE = "local_server_module";

    @NotNull
    private static final String KEY_LOCAL_SERVER_PARAMS = "local_server_params";

    @NotNull
    private static final String KEY_LOCAL_SERVER_PORT = "local_server_port";

    @NotNull
    private static final String KEY_PORT = "current_port";

    @NotNull
    public static final String LOCAL_SERVER_DEBUG_KEY = "rnLocalServerDebug";
    private static final int MAX_HISTORY_COUNT = 2;

    /* JADX INFO: compiled from: RnMetroConfigManager.kt */
    @Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0006\u0010\n\u001a\u00020\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, m90084d2 = {"Lcom/kubi/rn/debug/RnMetroConfigManager$HostPort;", "", "host", "", "port", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getHost", "()Ljava/lang/String;", "getPort", "toDebugServerHost", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "BReactNativeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class HostPort {

        @NotNull
        private final String host;

        @NotNull
        private final String port;

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof HostPort)) {
                return false;
            }
            HostPort hostPort = (HostPort) other;
            return Intrinsics.areEqual(this.host, hostPort.host) && Intrinsics.areEqual(this.port, hostPort.port);
        }

        public HostPort(@NotNull String host, @NotNull String port) {
            Intrinsics.checkNotNullParameter(host, "host");
            Intrinsics.checkNotNullParameter(port, "port");
            this.host = host;
            this.port = port;
        }

        public static /* synthetic */ HostPort copy$default(HostPort hostPort, String str, String str2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = hostPort.host;
            }
            if ((i11 & 2) != 0) {
                str2 = hostPort.port;
            }
            return hostPort.copy(str, str2);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getHost() {
            return this.host;
        }

        @NotNull
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getPort() {
            return this.port;
        }

        @NotNull
        public final HostPort copy(@NotNull String host, @NotNull String port) {
            Intrinsics.checkNotNullParameter(host, "host");
            Intrinsics.checkNotNullParameter(port, "port");
            return new HostPort(host, port);
        }

        @NotNull
        public final String getHost() {
            return this.host;
        }

        @NotNull
        public final String getPort() {
            return this.port;
        }

        public int hashCode() {
            return (this.host.hashCode() * 31) + this.port.hashCode();
        }

        @NotNull
        public final String toDebugServerHost() {
            String string = StringsKt.trim((CharSequence) this.host).toString();
            String string2 = StringsKt.trim((CharSequence) this.port).toString();
            if (StringsKt.contains$default((CharSequence) string, (CharSequence) C33844oi.f71346o, false, 2, (Object) null) && !StringsKt.startsWith$default(string, "[", false, 2, (Object) null)) {
                string = '[' + string + ']';
            }
            return string + ':' + string2;
        }

        @NotNull
        public String toString() {
            return "HostPort(host=" + this.host + ", port=" + this.port + ')';
        }
    }

    /* JADX INFO: compiled from: RnMetroConfigManager.kt */
    @Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J1\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0019"}, m90084d2 = {"Lcom/kubi/rn/debug/RnMetroConfigManager$LocalServerConfig;", "", "host", "", "port", "module", ReportDataTable.COLUMN_PARAMS, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getHost", "()Ljava/lang/String;", "getPort", "getModule", "getParams", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "BReactNativeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class LocalServerConfig {

        @NotNull
        private final String host;

        @NotNull
        private final String module;

        @NotNull
        private final String params;

        @NotNull
        private final String port;

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof LocalServerConfig)) {
                return false;
            }
            LocalServerConfig localServerConfig = (LocalServerConfig) other;
            return Intrinsics.areEqual(this.host, localServerConfig.host) && Intrinsics.areEqual(this.port, localServerConfig.port) && Intrinsics.areEqual(this.module, localServerConfig.module) && Intrinsics.areEqual(this.params, localServerConfig.params);
        }

        public LocalServerConfig(@NotNull String host, @NotNull String port, @NotNull String module, @NotNull String params) {
            Intrinsics.checkNotNullParameter(host, "host");
            Intrinsics.checkNotNullParameter(port, "port");
            Intrinsics.checkNotNullParameter(module, "module");
            Intrinsics.checkNotNullParameter(params, "params");
            this.host = host;
            this.port = port;
            this.module = module;
            this.params = params;
        }

        public static /* synthetic */ LocalServerConfig copy$default(LocalServerConfig localServerConfig, String str, String str2, String str3, String str4, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = localServerConfig.host;
            }
            if ((i11 & 2) != 0) {
                str2 = localServerConfig.port;
            }
            if ((i11 & 4) != 0) {
                str3 = localServerConfig.module;
            }
            if ((i11 & 8) != 0) {
                str4 = localServerConfig.params;
            }
            return localServerConfig.copy(str, str2, str3, str4);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getHost() {
            return this.host;
        }

        @NotNull
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getPort() {
            return this.port;
        }

        @NotNull
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getModule() {
            return this.module;
        }

        @NotNull
        /* JADX INFO: renamed from: component4, reason: from getter */
        public final String getParams() {
            return this.params;
        }

        @NotNull
        public final LocalServerConfig copy(@NotNull String host, @NotNull String port, @NotNull String module, @NotNull String params) {
            Intrinsics.checkNotNullParameter(host, "host");
            Intrinsics.checkNotNullParameter(port, "port");
            Intrinsics.checkNotNullParameter(module, "module");
            Intrinsics.checkNotNullParameter(params, "params");
            return new LocalServerConfig(host, port, module, params);
        }

        @NotNull
        public final String getHost() {
            return this.host;
        }

        @NotNull
        public final String getModule() {
            return this.module;
        }

        @NotNull
        public final String getParams() {
            return this.params;
        }

        @NotNull
        public final String getPort() {
            return this.port;
        }

        public int hashCode() {
            return (((((this.host.hashCode() * 31) + this.port.hashCode()) * 31) + this.module.hashCode()) * 31) + this.params.hashCode();
        }

        @NotNull
        public String toString() {
            return "LocalServerConfig(host=" + this.host + ", port=" + this.port + ", module=" + this.module + ", params=" + this.params + ')';
        }
    }

    @NotNull
    public final List<HostPort> getCurrentHostPortHistory() {
        IntRange intRangeUntil = RangesKt.until(0, 2);
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(intRangeUntil, 10));
        Iterator<Integer> it = intRangeUntil.iterator();
        while (it.hasNext()) {
            int iNextInt = ((IntIterator) it).nextInt();
            arrayList.add(new HostPort(C46396e.m102351h(CATEGORY, KEY_HISTORY_HOST_PREFIX + iNextInt, ""), C46396e.m102351h(CATEGORY, KEY_HISTORY_PORT_PREFIX + iNextInt, "")));
        }
        return resolveCurrentHostPortHistory(arrayList);
    }

    @NotNull
    public final List<LocalServerConfig> getLocalServerConfigHistory() {
        IntRange intRangeUntil = RangesKt.until(0, 2);
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(intRangeUntil, 10));
        Iterator<Integer> it = intRangeUntil.iterator();
        while (it.hasNext()) {
            int iNextInt = ((IntIterator) it).nextInt();
            arrayList.add(new LocalServerConfig(C46396e.m102351h(CATEGORY, KEY_LOCAL_SERVER_HISTORY_HOST_PREFIX + iNextInt, ""), C46396e.m102351h(CATEGORY, KEY_LOCAL_SERVER_HISTORY_PORT_PREFIX + iNextInt, ""), C46396e.m102351h(CATEGORY, KEY_LOCAL_SERVER_HISTORY_MODULE_PREFIX + iNextInt, ""), C46396e.m102351h(CATEGORY, KEY_LOCAL_SERVER_HISTORY_PARAMS_PREFIX + iNextInt, "")));
        }
        return resolveLocalServerConfigHistory(arrayList);
    }

    @NotNull
    public final LocalServerConfig resolveStoredLocalServerConfig(@Nullable String storedHost, @Nullable String storedPort, @Nullable String storedModule, @Nullable String storedParams) {
        String string;
        String str = null;
        String string2 = storedHost != null ? StringsKt.trim((CharSequence) storedHost).toString() : null;
        if (string2 == null || string2.length() == 0) {
            string2 = null;
        }
        if (string2 == null) {
            string2 = "localhost";
        }
        String string3 = storedPort != null ? StringsKt.trim((CharSequence) storedPort).toString() : null;
        if (string3 == null || string3.length() == 0) {
            string3 = null;
        }
        if (string3 == null) {
            string3 = DEFAULT_LOCAL_SERVER_PORT;
        }
        String string4 = storedModule != null ? StringsKt.trim((CharSequence) storedModule).toString() : null;
        if (string4 != null && string4.length() != 0) {
            str = string4;
        }
        if (str == null) {
            str = DEFAULT_LOCAL_SERVER_MODULE;
        }
        if (storedParams == null || (string = StringsKt.trim((CharSequence) storedParams).toString()) == null) {
            string = "";
        }
        return new LocalServerConfig(string2, string3, str, string);
    }

    private final LocalServerConfig normalizeLocalServerConfig(LocalServerConfig config) {
        return new LocalServerConfig(StringsKt.trim((CharSequence) config.getHost()).toString(), StringsKt.trim((CharSequence) config.getPort()).toString(), StringsKt.trim((CharSequence) config.getModule()).toString(), StringsKt.trim((CharSequence) config.getParams()).toString());
    }

    @NotNull
    public final HostPort getCurrentHostPort(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        return resolveStoredHostPort(C46396e.m102351h(CATEGORY, KEY_HOST, ""), C46396e.m102351h(CATEGORY, KEY_PORT, ""), AndroidInfoHelpers.getServerHost(applicationContext));
    }

    @NotNull
    public final LocalServerConfig getLocalServerConfig() {
        return resolveStoredLocalServerConfig(C46396e.m102351h(CATEGORY, KEY_LOCAL_SERVER_HOST, "localhost"), C46396e.m102351h(CATEGORY, KEY_LOCAL_SERVER_PORT, DEFAULT_LOCAL_SERVER_PORT), C46396e.m102351h(CATEGORY, KEY_LOCAL_SERVER_MODULE, DEFAULT_LOCAL_SERVER_MODULE), C46396e.m102351h(CATEGORY, KEY_LOCAL_SERVER_PARAMS, ""));
    }

    @NotNull
    public final List<HostPort> resolveCurrentHostPortHistory(@NotNull List<HostPort> hostPorts) {
        Intrinsics.checkNotNullParameter(hostPorts, "hostPorts");
        ArrayList arrayList = new ArrayList();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (HostPort hostPort : hostPorts) {
            HostPort hostPort2 = new HostPort(StringsKt.trim((CharSequence) hostPort.getHost()).toString(), StringsKt.trim((CharSequence) hostPort.getPort()).toString());
            if (hostPort2.getHost().length() != 0 && hostPort2.getPort().length() != 0) {
                if (linkedHashSet.add(hostPort2.toDebugServerHost())) {
                    arrayList.add(hostPort2);
                }
                if (arrayList.size() == 2) {
                    break;
                }
            }
        }
        return arrayList;
    }

    @NotNull
    public final List<LocalServerConfig> resolveLocalServerConfigHistory(@NotNull List<LocalServerConfig> configs) {
        Intrinsics.checkNotNullParameter(configs, "configs");
        ArrayList arrayList = new ArrayList();
        Iterator<LocalServerConfig> it = configs.iterator();
        while (it.hasNext()) {
            LocalServerConfig localServerConfigNormalizeLocalServerConfig = normalizeLocalServerConfig(it.next());
            if (localServerConfigNormalizeLocalServerConfig.getHost().length() != 0 && localServerConfigNormalizeLocalServerConfig.getPort().length() != 0 && localServerConfigNormalizeLocalServerConfig.getModule().length() != 0) {
                if (!arrayList.contains(localServerConfigNormalizeLocalServerConfig)) {
                    arrayList.add(localServerConfigNormalizeLocalServerConfig);
                }
                if (arrayList.size() == 2) {
                    break;
                }
            }
        }
        return arrayList;
    }

    @NotNull
    public final HostPort resolveStoredHostPort(@Nullable String storedHost, @Nullable String storedPort, @NotNull String defaultHostPort) {
        Intrinsics.checkNotNullParameter(defaultHostPort, "defaultHostPort");
        HostPort hostPortSplitHostPort = splitHostPort(defaultHostPort);
        String port = null;
        String string = storedHost != null ? StringsKt.trim((CharSequence) storedHost).toString() : null;
        if (string == null || string.length() == 0) {
            string = null;
        }
        if (string == null) {
            string = hostPortSplitHostPort.getHost();
        }
        String string2 = storedPort != null ? StringsKt.trim((CharSequence) storedPort).toString() : null;
        if (string2 != null && string2.length() != 0) {
            port = string2;
        }
        if (port == null) {
            port = hostPortSplitHostPort.getPort();
        }
        return new HostPort(string, port);
    }

    public final void restoreManagedHostIfNeeded(@NotNull Context context, boolean isDebug, boolean isLocalServerDebug) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (!isDebug || isLocalServerDebug) {
            return;
        }
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        PackagerConnectionSettings packagerConnectionSettings = new PackagerConnectionSettings(applicationContext);
        String debugServerHost = getCurrentHostPort(context).toDebugServerHost();
        if (shouldRestoreManagedHost(isDebug, isLocalServerDebug, packagerConnectionSettings.getDebugServerHost(), debugServerHost)) {
            packagerConnectionSettings.setDebugServerHost(debugServerHost);
        }
    }

    public final void saveCurrentHostPort(@NotNull String host, @NotNull String port) {
        Intrinsics.checkNotNullParameter(host, "host");
        Intrinsics.checkNotNullParameter(port, "port");
        HostPort hostPort = new HostPort(StringsKt.trim((CharSequence) host).toString(), StringsKt.trim((CharSequence) port).toString());
        C46396e.m102358o(CATEGORY, KEY_HOST, hostPort.getHost());
        C46396e.m102358o(CATEGORY, KEY_PORT, hostPort.getPort());
        saveCurrentHostPortHistory(hostPort);
    }

    public final void saveLocalServerConfig(@NotNull LocalServerConfig config) {
        Intrinsics.checkNotNullParameter(config, "config");
        LocalServerConfig localServerConfigNormalizeLocalServerConfig = normalizeLocalServerConfig(config);
        C46396e.m102358o(CATEGORY, KEY_LOCAL_SERVER_HOST, localServerConfigNormalizeLocalServerConfig.getHost());
        C46396e.m102358o(CATEGORY, KEY_LOCAL_SERVER_PORT, localServerConfigNormalizeLocalServerConfig.getPort());
        C46396e.m102358o(CATEGORY, KEY_LOCAL_SERVER_MODULE, localServerConfigNormalizeLocalServerConfig.getModule());
        C46396e.m102358o(CATEGORY, KEY_LOCAL_SERVER_PARAMS, localServerConfigNormalizeLocalServerConfig.getParams());
        saveLocalServerConfigHistory(localServerConfigNormalizeLocalServerConfig);
    }

    public final void setReactNativeDebugServerHost(@NotNull Context context, @NotNull String host, @NotNull String port) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(host, "host");
        Intrinsics.checkNotNullParameter(port, "port");
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        new PackagerConnectionSettings(applicationContext).setDebugServerHost(new HostPort(host, port).toDebugServerHost());
    }

    public final boolean shouldRestoreManagedHost(boolean isDebug, boolean isLocalServerDebug, @NotNull String currentDebugServerHost, @NotNull String managedDebugServerHost) {
        Intrinsics.checkNotNullParameter(currentDebugServerHost, "currentDebugServerHost");
        Intrinsics.checkNotNullParameter(managedDebugServerHost, "managedDebugServerHost");
        return (!isDebug || isLocalServerDebug || Intrinsics.areEqual(StringsKt.trim((CharSequence) currentDebugServerHost).toString(), StringsKt.trim((CharSequence) managedDebugServerHost).toString())) ? false : true;
    }

    @NotNull
    public final HostPort splitHostPort(@NotNull String hostPort) {
        int iIndexOf$default;
        Intrinsics.checkNotNullParameter(hostPort, "hostPort");
        String string = StringsKt.trim((CharSequence) hostPort).toString();
        if (string.length() == 0) {
            return new HostPort("", "");
        }
        if (StringsKt.startsWith$default(string, "[", false, 2, (Object) null) && (iIndexOf$default = StringsKt.indexOf$default((CharSequence) string, "]", 0, false, 6, (Object) null)) > 0) {
            String strSubstring = string.substring(1, iIndexOf$default);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            String strSubstring2 = string.substring(iIndexOf$default + 1);
            Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
            return new HostPort(strSubstring, StringsKt.removePrefix(strSubstring2, (CharSequence) C33844oi.f71346o));
        }
        int iLastIndexOf$default = StringsKt.lastIndexOf$default((CharSequence) string, C33844oi.f71346o, 0, false, 6, (Object) null);
        if (iLastIndexOf$default <= 0) {
            return new HostPort(string, "");
        }
        String strSubstring3 = string.substring(0, iLastIndexOf$default);
        Intrinsics.checkNotNullExpressionValue(strSubstring3, "substring(...)");
        String strSubstring4 = string.substring(iLastIndexOf$default + 1);
        Intrinsics.checkNotNullExpressionValue(strSubstring4, "substring(...)");
        return new HostPort(strSubstring3, strSubstring4);
    }

    private RnMetroConfigManager() {
    }

    private final void saveCurrentHostPortHistory(HostPort hostPort) {
        String host;
        List<HostPort> listResolveCurrentHostPortHistory = resolveCurrentHostPortHistory(CollectionsKt.plus((Collection) CollectionsKt.listOf(hostPort), (Iterable) getCurrentHostPortHistory()));
        for (int i11 = 0; i11 < 2; i11++) {
            HostPort hostPort2 = (HostPort) CollectionsKt.getOrNull(listResolveCurrentHostPortHistory, i11);
            String str = KEY_HISTORY_HOST_PREFIX + i11;
            String port = null;
            if (hostPort2 != null) {
                host = hostPort2.getHost();
            } else {
                host = null;
            }
            String str2 = "";
            if (host == null) {
                host = "";
            }
            C46396e.m102358o(CATEGORY, str, host);
            String str3 = KEY_HISTORY_PORT_PREFIX + i11;
            if (hostPort2 != null) {
                port = hostPort2.getPort();
            }
            if (port != null) {
                str2 = port;
            }
            C46396e.m102358o(CATEGORY, str3, str2);
        }
    }

    private final void saveLocalServerConfigHistory(LocalServerConfig config) {
        String host;
        String port;
        String module;
        List<LocalServerConfig> listResolveLocalServerConfigHistory = resolveLocalServerConfigHistory(CollectionsKt.plus((Collection) CollectionsKt.listOf(config), (Iterable) getLocalServerConfigHistory()));
        for (int i11 = 0; i11 < 2; i11++) {
            LocalServerConfig localServerConfig = (LocalServerConfig) CollectionsKt.getOrNull(listResolveLocalServerConfigHistory, i11);
            String str = KEY_LOCAL_SERVER_HISTORY_HOST_PREFIX + i11;
            String params = null;
            if (localServerConfig != null) {
                host = localServerConfig.getHost();
            } else {
                host = null;
            }
            String str2 = "";
            if (host == null) {
                host = "";
            }
            C46396e.m102358o(CATEGORY, str, host);
            String str3 = KEY_LOCAL_SERVER_HISTORY_PORT_PREFIX + i11;
            if (localServerConfig != null) {
                port = localServerConfig.getPort();
            } else {
                port = null;
            }
            if (port == null) {
                port = "";
            }
            C46396e.m102358o(CATEGORY, str3, port);
            String str4 = KEY_LOCAL_SERVER_HISTORY_MODULE_PREFIX + i11;
            if (localServerConfig != null) {
                module = localServerConfig.getModule();
            } else {
                module = null;
            }
            if (module == null) {
                module = "";
            }
            C46396e.m102358o(CATEGORY, str4, module);
            String str5 = KEY_LOCAL_SERVER_HISTORY_PARAMS_PREFIX + i11;
            if (localServerConfig != null) {
                params = localServerConfig.getParams();
            }
            if (params != null) {
                str2 = params;
            }
            C46396e.m102358o(CATEGORY, str5, str2);
        }
    }
}
