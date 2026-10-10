package com.kubi.sdk.pkg.hybird;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.google.firebase.messaging.Constants;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.kubi.monitor.TechnologyEvent;
import com.kubi.sdk.pkg.task.TaskCommonKt;
import java.io.File;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlinx.coroutines.C41686h;
import o00.C42911a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p569qq.C43840a;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import rg0.C44087f;
import rg0.InterfaceC44082a;
import ro.C44128b;

/* JADX INFO: compiled from: HybridPackageManager.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\r\u0010\u000eJ%\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0010\u001a\u00020\u000fH\u0087@ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J#\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0006H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0006¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u0006¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u0006¢\u0006\u0004\b\u001c\u0010\u001dJ\r\u0010\u001e\u001a\u00020\f¢\u0006\u0004\b\u001e\u0010\u0003J#\u0010!\u001a\u00020\f2\u0006\u0010\u001f\u001a\u00020\u000f2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b!\u0010\"R\u001a\u0010&\u001a\b\u0012\u0004\u0012\u00020\n0#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010*\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006+"}, m90084d2 = {"Lcom/kubi/sdk/pkg/hybird/HybridPackageManager;", "", "<init>", "()V", "Landroid/content/Context;", "context", "", "e", "(Landroid/content/Context;)Ljava/lang/String;", "", "Lcom/kubi/sdk/pkg/hybird/a;", "offlineUrls", "", CmcdData.Factory.STREAMING_FORMAT_HLS, "(Landroid/content/Context;Ljava/util/List;)V", "", "maxSemaphore", "", "m", "(Landroid/content/Context;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", RemoteConfigConstants.RequestFieldKey.PACKAGE_NAME, "j", "(Landroid/content/Context;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "i", "(Ljava/lang/String;)Z", "name", "f", "(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;", "g", "(Ljava/lang/String;)Ljava/lang/String;", "d", "code", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "k", "(ILjava/lang/String;)V", "Ljava/util/concurrent/CopyOnWriteArraySet;", "b", "Ljava/util/concurrent/CopyOnWriteArraySet;", "sourceSet", "Lrg0/a;", "c", "Lrg0/a;", "updateLock", "Package_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nHybridPackageManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HybridPackageManager.kt\ncom/kubi/sdk/pkg/hybird/HybridPackageManager\n+ 2 TaskCommon.kt\ncom/kubi/sdk/pkg/task/TaskCommonKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 TechnologyEvent.kt\ncom/kubi/monitor/TechnologyEvent\n*L\n1#1,187:1\n62#2:188\n1#3:189\n71#4,4:190\n*S KotlinDebug\n*F\n+ 1 HybridPackageManager.kt\ncom/kubi/sdk/pkg/hybird/HybridPackageManager\n*L\n64#1:188\n181#1:190,4\n*E\n"})
public final class HybridPackageManager {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final HybridPackageManager f47391a = new HybridPackageManager();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final CopyOnWriteArraySet<OfflineUrlInfo> sourceSet = new CopyOnWriteArraySet<>();

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public static final InterfaceC44082a updateLock = C44087f.m97144b(false, 1, null);

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: e */
    public static final String m57711e(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return TaskCommonKt.m57795e(context) + File.separator + "hybrid_app";
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ void m57712l(HybridPackageManager hybridPackageManager, int i11, String str, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            str = null;
        }
        hybridPackageManager.m57720k(i11, str);
    }

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ Object m57713n(HybridPackageManager hybridPackageManager, Context context, int i11, Continuation continuation, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i11 = 0;
        }
        return hybridPackageManager.m57721m(context, i11, continuation);
    }

    /* JADX INFO: renamed from: d */
    public final void m57714d() {
        HybridVersionManager.f47398a.m57741a();
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public final String m57715f(@NotNull Context context, @NotNull String name) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(name, "name");
        String strM57745e = HybridVersionManager.f47398a.m57745e(context, name);
        C44128b.m97266j("HybridPackageManager", "getEnablePackageVersion " + name + ' ' + strM57745e);
        return strM57745e;
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public final String m57716g(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return HybridVersionManager.f47398a.m57744d(name);
    }

    /* JADX INFO: renamed from: h */
    public final void m57717h(@NotNull Context context, @NotNull List<OfflineUrlInfo> offlineUrls) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(offlineUrls, "offlineUrls");
        CopyOnWriteArraySet<OfflineUrlInfo> copyOnWriteArraySet = sourceSet;
        copyOnWriteArraySet.clear();
        copyOnWriteArraySet.addAll(offlineUrls);
    }

    /* JADX INFO: renamed from: i */
    public final boolean m57718i(@NotNull String packageName) {
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        return HybridVersionManager.f47398a.m57746f(packageName);
    }

    /* JADX INFO: renamed from: k */
    public final void m57720k(int code, String error) {
        if (error != null) {
            C43840a.m96550d(error, "package_update");
        }
        TechnologyEvent technologyEvent = TechnologyEvent.f35482a;
        TechnologyEvent.EventParametersBuilder eventParametersBuilderAcquire = TechnologyEvent.EventParametersBuilder.INSTANCE.acquire();
        eventParametersBuilderAcquire.m42391b("code", code);
        if (error != null) {
            eventParametersBuilderAcquire.m42393d("error_message", error);
        }
        TechnologyEvent.m42388d("hybrid_pkg_update_all", eventParametersBuilderAcquire);
    }

    @Nullable
    /* JADX INFO: renamed from: j */
    public final Object m57719j(@NotNull Context context, @NotNull String str, @NotNull Continuation<? super Boolean> continuation) {
        return C41686h.m91049g(C42911a.m94120b(), new HybridPackageManager$manualUpdate$2(str, context, null), continuation);
    }

    @SuppressLint({"MissingPermission"})
    @Nullable
    /* JADX INFO: renamed from: m */
    public final Object m57721m(@NotNull Context context, int i11, @NotNull Continuation<? super Boolean> continuation) {
        return C41686h.m91049g(C42911a.m94120b(), new HybridPackageManager$updateAll$2(i11, context, null), continuation);
    }
}
