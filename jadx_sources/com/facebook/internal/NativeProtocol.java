package com.facebook.internal;

import android.content.ContentResolver;
import android.content.Intent;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.facebook.C5501a;
import com.facebook.internal.NativeProtocol;
import com.google.firebase.messaging.Constants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicBoolean;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p464n6.C42757a;
import p852kotlin.Metadata;
import p852kotlin.collections.ArraysKt;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: NativeProtocol.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001:\u00065&)\u000b6\bB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002¢\u0006\u0004\b\b\u0010\u0007J!\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u0012H\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0013\u001a\u00020\u0012H\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u0012H\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u001cH\u0007¢\u0006\u0004\b\u001d\u0010\u0003J\u001d\u0010 \u001a\b\u0012\u0004\u0012\u00020\r0\u001f2\u0006\u0010\u001e\u001a\u00020\u0005H\u0002¢\u0006\u0004\b \u0010!J\u0017\u0010#\u001a\u00020\"2\u0006\u0010\u001e\u001a\u00020\u0005H\u0002¢\u0006\u0004\b#\u0010$R\u001c\u0010(\u001a\n %*\u0004\u0018\u00010\n0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u001a\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u001a\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010*R&\u0010.\u001a\u0014\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010-R\u0014\u00101\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u00100R\u001a\u00104\u001a\b\u0012\u0004\u0012\u00020\r028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u00103¨\u00067"}, m90084d2 = {"Lcom/facebook/internal/NativeProtocol;", "", "<init>", "()V", "", "Lcom/facebook/internal/NativeProtocol$d;", "f", "()Ljava/util/List;", "e", "", "", "d", "()Ljava/util/Map;", "", "version", "", CmcdData.Factory.STREAM_TYPE_LIVE, "(I)Z", "Landroid/content/Intent;", "intent", "j", "(Landroid/content/Intent;)I", "Landroid/os/Bundle;", "i", "(Landroid/content/Intent;)Landroid/os/Bundle;", "resultIntent", "k", "(Landroid/content/Intent;)Z", "", "m", "appInfo", "Ljava/util/TreeSet;", CmcdData.Factory.STREAMING_FORMAT_HLS, "(Lcom/facebook/internal/NativeProtocol$d;)Ljava/util/TreeSet;", "Landroid/net/Uri;", "g", "(Lcom/facebook/internal/NativeProtocol$d;)Landroid/net/Uri;", "kotlin.jvm.PlatformType", "b", "Ljava/lang/String;", "TAG", "c", "Ljava/util/List;", "facebookAppInfoList", "effectCameraAppInfoList", "Ljava/util/Map;", "actionToAppInfoMap", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "protocolVersionsAsyncUpdating", "", "[Ljava/lang/Integer;", "KNOWN_PROTOCOL_VERSIONS", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "ProtocolVersionQueryResult", "facebook-core_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nNativeProtocol.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NativeProtocol.kt\ncom/facebook/internal/NativeProtocol\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,908:1\n1603#2,9:909\n1855#2:918\n1856#2:920\n1612#2:921\n1#3:919\n*S KotlinDebug\n*F\n+ 1 NativeProtocol.kt\ncom/facebook/internal/NativeProtocol\n*L\n396#1:909,9\n396#1:918\n396#1:920\n396#1:921\n396#1:919\n*E\n"})
public final class NativeProtocol {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final NativeProtocol f9627a;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public static final String TAG;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public static final List<AbstractC5756d> facebookAppInfoList;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public static final List<AbstractC5756d> effectCameraAppInfoList;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public static final Map<String, List<AbstractC5756d>> actionToAppInfoMap;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public static final AtomicBoolean protocolVersionsAsyncUpdating;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public static final Integer[] KNOWN_PROTOCOL_VERSIONS;

    /* JADX INFO: compiled from: NativeProtocol.kt */
    @Metadata(m90083d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\b\u0018\u0000 \u00112\u00020\u0001:\u0001\u0012B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R(\u0010\n\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR$\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u000b8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0013"}, m90084d2 = {"Lcom/facebook/internal/NativeProtocol$ProtocolVersionQueryResult;", "", "<init>", "()V", "Lcom/facebook/internal/NativeProtocol$d;", "<set-?>", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Lcom/facebook/internal/NativeProtocol$d;", "getAppInfo", "()Lcom/facebook/internal/NativeProtocol$d;", "appInfo", "", "b", "I", "getProtocolVersion", "()I", "protocolVersion", "c", "Companion", "facebook-core_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    public static final class ProtocolVersionQueryResult {

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @Nullable
        public AbstractC5756d appInfo;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        public int protocolVersion;

        /* JADX INFO: compiled from: NativeProtocol.kt */
        @Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, m90084d2 = {"Lcom/facebook/internal/NativeProtocol$ProtocolVersionQueryResult$Companion;", "", "<init>", "()V", "Lcom/facebook/internal/NativeProtocol$d;", "nativeAppInfo", "", "protocolVersion", "Lcom/facebook/internal/NativeProtocol$ProtocolVersionQueryResult;", "create", "(Lcom/facebook/internal/NativeProtocol$d;I)Lcom/facebook/internal/NativeProtocol$ProtocolVersionQueryResult;", "createEmpty", "()Lcom/facebook/internal/NativeProtocol$ProtocolVersionQueryResult;", "facebook-core_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public Companion() {
            }

            @JvmStatic
            @NotNull
            public final ProtocolVersionQueryResult create(@Nullable AbstractC5756d nativeAppInfo, int protocolVersion) {
                ProtocolVersionQueryResult protocolVersionQueryResult = new ProtocolVersionQueryResult(null);
                protocolVersionQueryResult.appInfo = nativeAppInfo;
                protocolVersionQueryResult.protocolVersion = protocolVersion;
                return protocolVersionQueryResult;
            }

            @JvmStatic
            @NotNull
            public final ProtocolVersionQueryResult createEmpty() {
                ProtocolVersionQueryResult protocolVersionQueryResult = new ProtocolVersionQueryResult(null);
                protocolVersionQueryResult.protocolVersion = -1;
                return protocolVersionQueryResult;
            }
        }

        public /* synthetic */ ProtocolVersionQueryResult(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public ProtocolVersionQueryResult() {
        }
    }

    /* JADX INFO: renamed from: com.facebook.internal.NativeProtocol$a */
    /* JADX INFO: compiled from: NativeProtocol.kt */
    @Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m90084d2 = {"Lcom/facebook/internal/NativeProtocol$a;", "Lcom/facebook/internal/NativeProtocol$d;", "<init>", "()V", "", "b", "()Ljava/lang/String;", "facebook-core_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    public static final class C5753a extends AbstractC5756d {
        @Override // com.facebook.internal.NativeProtocol.AbstractC5756d
        @NotNull
        /* JADX INFO: renamed from: b */
        public String mo10018b() {
            return "com.facebook.arstudio.player";
        }
    }

    /* JADX INFO: renamed from: com.facebook.internal.NativeProtocol$b */
    /* JADX INFO: compiled from: NativeProtocol.kt */
    @Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\u0003J\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m90084d2 = {"Lcom/facebook/internal/NativeProtocol$b;", "Lcom/facebook/internal/NativeProtocol$d;", "<init>", "()V", "", "b", "()Ljava/lang/String;", "", "c", "", "d", "()Z", "facebook-core_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    public static final class C5754b extends AbstractC5756d {
        @Override // com.facebook.internal.NativeProtocol.AbstractC5756d
        @NotNull
        /* JADX INFO: renamed from: b */
        public String mo10018b() {
            return "com.facebook.katana";
        }

        @Override // com.facebook.internal.NativeProtocol.AbstractC5756d
        /* JADX INFO: renamed from: c */
        public void mo10019c() {
            if (m10020d()) {
                Log.w(NativeProtocol.m10004c(), "Apps that target Android API 30+ (Android 11+) cannot call Facebook native apps unless the package visibility needs are declared. Please follow https://developers.facebook.com/docs/android/troubleshooting/#faq_267321845055988 to make the declaration.");
            }
        }

        /* JADX INFO: renamed from: d */
        public final boolean m10020d() {
            if (C5501a.m7799m().getApplicationInfo().targetSdkVersion >= 30) {
                return true;
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: com.facebook.internal.NativeProtocol$c */
    /* JADX INFO: compiled from: NativeProtocol.kt */
    @Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m90084d2 = {"Lcom/facebook/internal/NativeProtocol$c;", "Lcom/facebook/internal/NativeProtocol$d;", "<init>", "()V", "", "b", "()Ljava/lang/String;", "facebook-core_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    public static final class C5755c extends AbstractC5756d {
        @Override // com.facebook.internal.NativeProtocol.AbstractC5756d
        @NotNull
        /* JADX INFO: renamed from: b */
        public String mo10018b() {
            return "com.facebook.orca";
        }
    }

    /* JADX INFO: renamed from: com.facebook.internal.NativeProtocol$e */
    /* JADX INFO: compiled from: NativeProtocol.kt */
    @Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m90084d2 = {"Lcom/facebook/internal/NativeProtocol$e;", "Lcom/facebook/internal/NativeProtocol$d;", "<init>", "()V", "", "b", "()Ljava/lang/String;", "facebook-core_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    public static final class C5757e extends AbstractC5756d {
        @Override // com.facebook.internal.NativeProtocol.AbstractC5756d
        @NotNull
        /* JADX INFO: renamed from: b */
        public String mo10018b() {
            return "com.facebook.wakizashi";
        }
    }

    static {
        NativeProtocol nativeProtocol = new NativeProtocol();
        f9627a = nativeProtocol;
        TAG = NativeProtocol.class.getName();
        facebookAppInfoList = nativeProtocol.m10013f();
        effectCameraAppInfoList = nativeProtocol.m10012e();
        actionToAppInfoMap = nativeProtocol.m10011d();
        protocolVersionsAsyncUpdating = new AtomicBoolean(false);
        KNOWN_PROTOCOL_VERSIONS = new Integer[]{20210906, 20171115, 20170417, 20170411, 20170213, 20161017, 20160327, 20150702, 20150401, 20141218, 20141107, 20141028, 20141001, 20140701, 20140324, 20140313, 20140204, 20131107, 20131024, 20130618, 20130502, 20121101};
    }

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ TreeSet m10003b(NativeProtocol nativeProtocol, AbstractC5756d abstractC5756d) {
        if (C42757a.m93689d(NativeProtocol.class)) {
            return null;
        }
        try {
            return nativeProtocol.m10015h(abstractC5756d);
        } catch (Throwable th2) {
            C42757a.m93687b(th2, NativeProtocol.class);
            return null;
        }
    }

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ String m10004c() {
        if (C42757a.m93689d(NativeProtocol.class)) {
            return null;
        }
        try {
            return TAG;
        } catch (Throwable th2) {
            C42757a.m93687b(th2, NativeProtocol.class);
            return null;
        }
    }

    @JvmStatic
    @Nullable
    /* JADX INFO: renamed from: i */
    public static final Bundle m10005i(@NotNull Intent intent) {
        if (C42757a.m93689d(NativeProtocol.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(intent, "intent");
            if (m10008l(m10006j(intent))) {
                return intent.getBundleExtra("com.facebook.platform.protocol.BRIDGE_ARGS");
            }
            return null;
        } catch (Throwable th2) {
            C42757a.m93687b(th2, NativeProtocol.class);
            return null;
        }
    }

    @JvmStatic
    /* JADX INFO: renamed from: j */
    public static final int m10006j(@NotNull Intent intent) {
        if (C42757a.m93689d(NativeProtocol.class)) {
            return 0;
        }
        try {
            Intrinsics.checkNotNullParameter(intent, "intent");
            return intent.getIntExtra("com.facebook.platform.protocol.PROTOCOL_VERSION", 0);
        } catch (Throwable th2) {
            C42757a.m93687b(th2, NativeProtocol.class);
            return 0;
        }
    }

    @JvmStatic
    /* JADX INFO: renamed from: k */
    public static final boolean m10007k(@NotNull Intent resultIntent) {
        if (C42757a.m93689d(NativeProtocol.class)) {
            return false;
        }
        try {
            Intrinsics.checkNotNullParameter(resultIntent, "resultIntent");
            Bundle bundleM10005i = m10005i(resultIntent);
            return bundleM10005i != null ? bundleM10005i.containsKey(Constants.IPC_BUNDLE_KEY_SEND_ERROR) : resultIntent.hasExtra("com.facebook.platform.status.ERROR_TYPE");
        } catch (Throwable th2) {
            C42757a.m93687b(th2, NativeProtocol.class);
            return false;
        }
    }

    @JvmStatic
    /* JADX INFO: renamed from: l */
    public static final boolean m10008l(int version) {
        if (C42757a.m93689d(NativeProtocol.class)) {
            return false;
        }
        try {
            return ArraysKt.contains(KNOWN_PROTOCOL_VERSIONS, Integer.valueOf(version)) && version >= 20140701;
        } catch (Throwable th2) {
            C42757a.m93687b(th2, NativeProtocol.class);
            return false;
        }
    }

    @JvmStatic
    /* JADX INFO: renamed from: m */
    public static final void m10009m() {
        if (C42757a.m93689d(NativeProtocol.class)) {
            return;
        }
        try {
            if (protocolVersionsAsyncUpdating.compareAndSet(false, true)) {
                C5501a.m7806t().execute(new Runnable() { // from class: i6.l
                    @Override // java.lang.Runnable
                    public final void run() {
                        NativeProtocol.m10010n();
                    }
                });
            }
        } catch (Throwable th2) {
            C42757a.m93687b(th2, NativeProtocol.class);
        }
    }

    /* JADX INFO: renamed from: n */
    public static final void m10010n() {
        if (C42757a.m93689d(NativeProtocol.class)) {
            return;
        }
        try {
            try {
                Iterator<AbstractC5756d> it = facebookAppInfoList.iterator();
                while (it.hasNext()) {
                    it.next().m10021a(true);
                }
                protocolVersionsAsyncUpdating.set(false);
            } catch (Throwable th2) {
                protocolVersionsAsyncUpdating.set(false);
                throw th2;
            }
        } catch (Throwable th3) {
            C42757a.m93687b(th3, NativeProtocol.class);
        }
    }

    /* JADX INFO: renamed from: d */
    public final Map<String, List<AbstractC5756d>> m10011d() {
        if (C42757a.m93689d(this)) {
            return null;
        }
        try {
            HashMap map = new HashMap();
            ArrayList arrayList = new ArrayList();
            arrayList.add(new C5755c());
            List<AbstractC5756d> list = facebookAppInfoList;
            map.put("com.facebook.platform.action.request.OGACTIONPUBLISH_DIALOG", list);
            map.put("com.facebook.platform.action.request.FEED_DIALOG", list);
            map.put("com.facebook.platform.action.request.LIKE_DIALOG", list);
            map.put("com.facebook.platform.action.request.APPINVITES_DIALOG", list);
            map.put("com.facebook.platform.action.request.MESSAGE_DIALOG", arrayList);
            map.put("com.facebook.platform.action.request.OGMESSAGEPUBLISH_DIALOG", arrayList);
            map.put("com.facebook.platform.action.request.CAMERA_EFFECT", effectCameraAppInfoList);
            map.put("com.facebook.platform.action.request.SHARE_STORY", list);
            return map;
        } catch (Throwable th2) {
            C42757a.m93687b(th2, this);
            return null;
        }
    }

    /* JADX INFO: renamed from: e */
    public final List<AbstractC5756d> m10012e() {
        if (C42757a.m93689d(this)) {
            return null;
        }
        try {
            ArrayList arrayListArrayListOf = CollectionsKt.arrayListOf(new C5753a());
            arrayListArrayListOf.addAll(m10013f());
            return arrayListArrayListOf;
        } catch (Throwable th2) {
            C42757a.m93687b(th2, this);
            return null;
        }
    }

    /* JADX INFO: renamed from: f */
    public final List<AbstractC5756d> m10013f() {
        if (C42757a.m93689d(this)) {
            return null;
        }
        try {
            return CollectionsKt.arrayListOf(new C5754b(), new C5757e());
        } catch (Throwable th2) {
            C42757a.m93687b(th2, this);
            return null;
        }
    }

    /* JADX INFO: renamed from: g */
    public final Uri m10014g(AbstractC5756d appInfo) {
        if (C42757a.m93689d(this)) {
            return null;
        }
        try {
            Uri uri = Uri.parse("content://" + appInfo.mo10018b() + ".provider.PlatformProvider/versions");
            Intrinsics.checkNotNullExpressionValue(uri, "parse(CONTENT_SCHEME + a…ATFORM_PROVIDER_VERSIONS)");
            return uri;
        } catch (Throwable th2) {
            C42757a.m93687b(th2, this);
            return null;
        }
    }

    /* JADX INFO: renamed from: h */
    public final TreeSet<Integer> m10015h(AbstractC5756d appInfo) {
        Throwable th2;
        Cursor cursor;
        ProviderInfo providerInfoResolveContentProvider;
        Cursor cursorQuery;
        if (C42757a.m93689d(this)) {
            return null;
        }
        try {
            TreeSet<Integer> treeSet = new TreeSet<>();
            ContentResolver contentResolver = C5501a.m7799m().getContentResolver();
            String[] strArr = {"version"};
            Uri uriM10014g = m10014g(appInfo);
            try {
                try {
                    providerInfoResolveContentProvider = C5501a.m7799m().getPackageManager().resolveContentProvider(appInfo.mo10018b() + ".provider.PlatformProvider", 0);
                } catch (RuntimeException e11) {
                    Log.e(TAG, "Failed to query content resolver.", e11);
                    providerInfoResolveContentProvider = null;
                }
                if (providerInfoResolveContentProvider != null) {
                    try {
                        try {
                            cursorQuery = contentResolver.query(uriM10014g, strArr, null, null, null);
                        } catch (NullPointerException unused) {
                            Log.e(TAG, "Failed to query content resolver.");
                            cursorQuery = null;
                        }
                    } catch (IllegalArgumentException unused2) {
                        Log.e(TAG, "Failed to query content resolver.");
                        cursorQuery = null;
                    } catch (SecurityException unused3) {
                        Log.e(TAG, "Failed to query content resolver.");
                        cursorQuery = null;
                    }
                    if (cursorQuery != null) {
                        while (cursorQuery.moveToNext()) {
                            try {
                                treeSet.add(Integer.valueOf(cursorQuery.getInt(cursorQuery.getColumnIndex("version"))));
                            } catch (Throwable th3) {
                                cursor = cursorQuery;
                                th2 = th3;
                                if (cursor != null) {
                                    cursor.close();
                                    throw th2;
                                }
                                throw th2;
                            }
                        }
                    }
                } else {
                    cursorQuery = null;
                }
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                return treeSet;
            } catch (Throwable th4) {
                th2 = th4;
                cursor = null;
            }
        } catch (Throwable th5) {
            C42757a.m93687b(th5, this);
            return null;
        }
    }

    /* JADX INFO: renamed from: com.facebook.internal.NativeProtocol$d */
    /* JADX INFO: compiled from: NativeProtocol.kt */
    @Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\u0003J\u0015\u0010\u000b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fR\u001e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u000f¨\u0006\u0011"}, m90084d2 = {"Lcom/facebook/internal/NativeProtocol$d;", "", "<init>", "()V", "", "b", "()Ljava/lang/String;", "", "c", "", "force", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Z)V", "Ljava/util/TreeSet;", "", "Ljava/util/TreeSet;", "availableVersions", "facebook-core_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    public static abstract class AbstractC5756d {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @Nullable
        public TreeSet<Integer> availableVersions;

        /* JADX WARN: Code duplicated, block: B:12:0x0012 A[Catch: all -> 0x0010, TryCatch #0 {all -> 0x0010, blocks: (B:4:0x0003, B:7:0x0009, B:13:0x001a, B:15:0x001e, B:17:0x0024, B:12:0x0012), top: B:22:0x0003 }] */
        /* JADX INFO: renamed from: a */
        public final synchronized void m10021a(boolean force) {
            if (force) {
                this.availableVersions = NativeProtocol.m10003b(NativeProtocol.f9627a, this);
            } else {
                try {
                    TreeSet<Integer> treeSet = this.availableVersions;
                    if (treeSet == null || treeSet == null || treeSet.isEmpty()) {
                        this.availableVersions = NativeProtocol.m10003b(NativeProtocol.f9627a, this);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            TreeSet<Integer> treeSet2 = this.availableVersions;
            if (treeSet2 == null || treeSet2.isEmpty()) {
                mo10019c();
            }
        }

        @NotNull
        /* JADX INFO: renamed from: b */
        public abstract String mo10018b();

        /* JADX INFO: renamed from: c */
        public void mo10019c() {
        }
    }
}
