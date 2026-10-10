package androidx.privacysandbox.ads.adservices.java.signals;

import android.content.Context;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresPermission;
import androidx.privacysandbox.ads.adservices.java.internal.CoroutineAdapterKt;
import androidx.privacysandbox.ads.adservices.signals.ProtectedSignalsManager;
import androidx.privacysandbox.ads.adservices.signals.UpdateSignalsRequest;
import com.google.common.util.concurrent.ListenableFuture;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.C41713n0;
import kotlinx.coroutines.C41782z0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: ProtectedSignalsManagerFutures.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u0000 \b2\u00020\u0001:\u0002\b\tB\u0007\b\u0000¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u0007H'¨\u0006\n"}, m90084d2 = {"Landroidx/privacysandbox/ads/adservices/java/signals/ProtectedSignalsManagerFutures;", "", "()V", "updateSignalsAsync", "Lcom/google/common/util/concurrent/ListenableFuture;", "", "request", "Landroidx/privacysandbox/ads/adservices/signals/UpdateSignalsRequest;", "Companion", "JavaImpl", "ads-adservices-java_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public abstract class ProtectedSignalsManagerFutures {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: compiled from: ProtectedSignalsManagerFutures.kt */
    @Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, m90084d2 = {"Landroidx/privacysandbox/ads/adservices/java/signals/ProtectedSignalsManagerFutures$Companion;", "", "()V", "from", "Landroidx/privacysandbox/ads/adservices/java/signals/ProtectedSignalsManagerFutures;", "context", "Landroid/content/Context;", "ads-adservices-java_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nProtectedSignalsManagerFutures.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ProtectedSignalsManagerFutures.kt\nandroidx/privacysandbox/ads/adservices/java/signals/ProtectedSignalsManagerFutures$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,129:1\n1#2:130\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        @Nullable
        public final ProtectedSignalsManagerFutures from(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            ProtectedSignalsManager protectedSignalsManagerObtain = ProtectedSignalsManager.INSTANCE.obtain(context);
            if (protectedSignalsManagerObtain != null) {
                return new JavaImpl(protectedSignalsManagerObtain);
            }
            return null;
        }
    }

    /* JADX INFO: compiled from: ProtectedSignalsManagerFutures.kt */
    @Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\tH\u0017R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m90084d2 = {"Landroidx/privacysandbox/ads/adservices/java/signals/ProtectedSignalsManagerFutures$JavaImpl;", "Landroidx/privacysandbox/ads/adservices/java/signals/ProtectedSignalsManagerFutures;", "mProtectedSignalsManager", "Landroidx/privacysandbox/ads/adservices/signals/ProtectedSignalsManager;", "(Landroidx/privacysandbox/ads/adservices/signals/ProtectedSignalsManager;)V", "updateSignalsAsync", "Lcom/google/common/util/concurrent/ListenableFuture;", "", "request", "Landroidx/privacysandbox/ads/adservices/signals/UpdateSignalsRequest;", "ads-adservices-java_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    public static final class JavaImpl extends ProtectedSignalsManagerFutures {

        @Nullable
        private final ProtectedSignalsManager mProtectedSignalsManager;

        public JavaImpl(@Nullable ProtectedSignalsManager protectedSignalsManager) {
            this.mProtectedSignalsManager = protectedSignalsManager;
        }

        @Override // androidx.privacysandbox.ads.adservices.java.signals.ProtectedSignalsManagerFutures
        @RequiresPermission("android.permission.ACCESS_ADSERVICES_PROTECTED_SIGNALS")
        @DoNotInline
        @NotNull
        public ListenableFuture<Unit> updateSignalsAsync(@NotNull UpdateSignalsRequest request) {
            Intrinsics.checkNotNullParameter(request, "request");
            return CoroutineAdapterKt.asListenableFuture$default(C41696j.m91102b(C41713n0.m91125a(C41782z0.m91391a()), null, null, new ProtectedSignalsManagerFutures$JavaImpl$updateSignalsAsync$1(this, request, null), 3, null), null, 1, null);
        }
    }

    @RequiresPermission("android.permission.ACCESS_ADSERVICES_PROTECTED_SIGNALS")
    @NotNull
    public abstract ListenableFuture<Unit> updateSignalsAsync(@NotNull UpdateSignalsRequest request);

    @JvmStatic
    @Nullable
    public static final ProtectedSignalsManagerFutures from(@NotNull Context context) {
        return INSTANCE.from(context);
    }
}
