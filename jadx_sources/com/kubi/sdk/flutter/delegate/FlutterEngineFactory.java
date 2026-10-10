package com.kubi.sdk.flutter.delegate;

import android.app.Application;
import android.content.Context;
import android.os.Build;
import com.google.gson.reflect.TypeToken;
import com.kubi.config.RemoteConfig;
import com.kubi.config.exception.KCConfigException;
import com.kubi.utils.extensions.C27025c;
import io.flutter.FlutterInjector;
import io.flutter.embedding.engine.FlutterEngine;
import io.flutter.embedding.engine.FlutterEngineGroup;
import io.flutter.embedding.engine.dart.DartExecutor;
import java.lang.reflect.Type;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p569qq.C43846g;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: com.kubi.sdk.flutter.delegate.e, reason: from Kotlin metadata */
/* JADX INFO: compiled from: FlutterEngineFactory.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J6\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\u0010\b\u0002\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00152\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0013J\b\u0010\u0017\u001a\u00020\u0007H\u0002J\u0010\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u001b\u0010\u0006\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0019"}, m90084d2 = {"Lcom/kubi/sdk/flutter/delegate/FlutterEngineFactory;", "", "<init>", "()V", "ANDROID_16_API", "", "useFlutterEngineGroup", "", "getUseFlutterEngineGroup", "()Z", "useFlutterEngineGroup$delegate", "Lkotlin/Lazy;", "flutterEngineGroup", "Lio/flutter/embedding/engine/FlutterEngineGroup;", "create", "Lio/flutter/embedding/engine/FlutterEngine;", "context", "Landroid/content/Context;", "dartEntrypointFuncName", "", "dartEntrypointFuncArgs", "", "initialRoute", "shouldUseFlutterEngineGroup", "requestFlutterEngineGroup", "LFlutter_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nFlutterEngineFactory.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FlutterEngineFactory.kt\ncom/kubi/sdk/flutter/delegate/FlutterEngineFactory\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 RemoteConfig.kt\ncom/kubi/config/RemoteConfig\n+ 4 KCConfigIssue.kt\ncom/kubi/config/exception/KCConfigIssueKt\n*L\n1#1,84:1\n1#2:85\n35#3,4:86\n39#3:92\n44#4,2:90\n*S KotlinDebug\n*F\n+ 1 FlutterEngineFactory.kt\ncom/kubi/sdk/flutter/delegate/FlutterEngineFactory\n*L\n17#1:86,4\n17#1:92\n17#1:90,2\n*E\n"})
public final class FlutterEngineFactory {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final FlutterEngineFactory f46663a = new FlutterEngineFactory();

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final Lazy f46664b = LazyKt.lazy(new Function0() { // from class: com.kubi.sdk.flutter.delegate.d
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Boolean.valueOf(FlutterEngineFactory.m56797g());
        }
    });

    /* JADX INFO: renamed from: c */
    @Nullable
    public static FlutterEngineGroup f46665c;

    /* JADX INFO: renamed from: com.kubi.sdk.flutter.delegate.e$a */
    /* JADX INFO: compiled from: RemoteConfig.kt */
    @Metadata(m90083d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, m90084d2 = {"com/kubi/config/RemoteConfig$getConfig$1", "Lcom/google/gson/reflect/TypeToken;", "Config_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nRemoteConfig.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RemoteConfig.kt\ncom/kubi/config/RemoteConfig$getConfig$1\n*L\n1#1,109:1\n*E\n"})
    public static final class a extends TypeToken<Boolean> {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: c */
    public static /* synthetic */ FlutterEngine m56796c(FlutterEngineFactory flutterEngineFactory, Context context, String str, List list, String str2, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            str = "main";
        }
        if ((i11 & 4) != 0) {
            list = null;
        }
        if ((i11 & 8) != 0) {
            str2 = null;
        }
        return flutterEngineFactory.m56798b(context, str, list, str2);
    }

    /* JADX INFO: renamed from: g */
    public static final boolean m56797g() {
        Object objM20457a;
        try {
            RemoteConfig remoteConfig = RemoteConfig.f19636a;
            Type type = new a().getType();
            Intrinsics.checkNotNullExpressionValue(type, "object : TypeToken<T>() {}.type");
            objM20457a = RemoteConfig.m20457a("android_use_flutter_engine_group", type);
        } catch (Throwable th2) {
            C43846g.m96568c(new KCConfigException(th2, "RemoteConfig", false, null, 8, null), null, 2, null);
            objM20457a = null;
        }
        return C27025c.m66567e((Boolean) objM20457a, false);
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final FlutterEngine m56798b(@NotNull Context context, @NotNull String dartEntrypointFuncName, @Nullable List<String> list, @Nullable String str) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(dartEntrypointFuncName, "dartEntrypointFuncName");
        Context applicationContext = !(context instanceof Application) ? context : null;
        if (applicationContext == null) {
            applicationContext = context.getApplicationContext();
        }
        if (m56801f()) {
            DartExecutor.DartEntrypoint dartEntrypoint = new DartExecutor.DartEntrypoint(FlutterInjector.instance().flutterLoader().findAppBundlePath(), dartEntrypointFuncName);
            Intrinsics.checkNotNull(applicationContext);
            FlutterEngine flutterEngineCreateAndRunEngine = m56800e(applicationContext).createAndRunEngine(new FlutterEngineGroup.Options(applicationContext).setDartEntrypoint(dartEntrypoint).setDartEntrypointArgs(list).setInitialRoute(str));
            Intrinsics.checkNotNullExpressionValue(flutterEngineCreateAndRunEngine, "createAndRunEngine(...)");
            return flutterEngineCreateAndRunEngine;
        }
        FlutterEngine flutterEngine = new FlutterEngine(applicationContext);
        if (str != null) {
            flutterEngine.getNavigationChannel().setInitialRoute(str);
        }
        flutterEngine.getDartExecutor().executeDartEntrypoint(new DartExecutor.DartEntrypoint(FlutterInjector.instance().flutterLoader().findAppBundlePath(), dartEntrypointFuncName), list);
        return flutterEngine;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m56799d() {
        return ((Boolean) f46664b.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: e */
    public final FlutterEngineGroup m56800e(Context context) {
        if (f46665c == null) {
            if (FlutterImpellerConfig.f46678a.m56819f()) {
                f46665c = new FlutterEngineGroup(context, FlutterShellArgsHelper.f46683a.m56820a());
            } else {
                f46665c = new FlutterEngineGroup(context);
            }
        }
        FlutterEngineGroup flutterEngineGroup = f46665c;
        Intrinsics.checkNotNull(flutterEngineGroup);
        return flutterEngineGroup;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m56801f() {
        if (!m56799d()) {
            return false;
        }
        if (FlutterAnrStopgapConfig.f46661a.m56794d() && Build.VERSION.SDK_INT == 36) {
            return false;
        }
        return true;
    }
}
