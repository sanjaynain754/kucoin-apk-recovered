package com.kubi.sdk.pkg.task;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.kubi.sdk.pkg.config.PackConfigManager;
import kotlinx.coroutines.AbstractC41697j0;
import kotlinx.coroutines.AbstractC41710m1;
import kotlinx.coroutines.C41718o1;
import o00.C42917g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: PackageTaskDispatchers.kt */
/* JADX INFO: loaded from: classes41.dex */
@Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bR\u001b\u0010\f\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000b¨\u0006\r"}, m90084d2 = {"Lcom/kubi/sdk/pkg/task/PackageTaskDispatchers;", "", "<init>", "()V", "Lcom/kubi/sdk/pkg/task/DownloadPriority;", "priority", "Lkotlinx/coroutines/j0;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Lcom/kubi/sdk/pkg/task/DownloadPriority;)Lkotlinx/coroutines/j0;", "b", "Lkotlin/Lazy;", "()Lkotlinx/coroutines/j0;", "foregroundDeployDispatcher", "Package_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nPackageTaskDispatchers.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PackageTaskDispatchers.kt\ncom/kubi/sdk/pkg/task/PackageTaskDispatchers\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,26:1\n1#2:27\n*E\n"})
public final class PackageTaskDispatchers {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final PackageTaskDispatchers f47424a = new PackageTaskDispatchers();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final Lazy foregroundDeployDispatcher = LazyKt.lazy(new Function0<AbstractC41710m1>() { // from class: com.kubi.sdk.pkg.task.PackageTaskDispatchers$foregroundDeployDispatcher$2
        @Override // p852kotlin.jvm.functions.Function0
        @NotNull
        public final AbstractC41710m1 invoke() {
            return C41718o1.m91179c(C42917g.m94140f("pkg-deploy-foreground"));
        }
    });

    @Nullable
    /* JADX INFO: renamed from: a */
    public final AbstractC41697j0 m57788a(@Nullable DownloadPriority priority) {
        if (!PackConfigManager.f47378a.m57689c()) {
            return null;
        }
        AbstractC41697j0 abstractC41697j0M57789b = m57789b();
        if (priority == DownloadPriority.VERY_HIGH) {
            return abstractC41697j0M57789b;
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public final AbstractC41697j0 m57789b() {
        return (AbstractC41697j0) foregroundDeployDispatcher.getValue();
    }
}
