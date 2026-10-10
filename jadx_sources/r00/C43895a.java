package r00;

import com.kubi.sdk.timpush.data.repository.TimPushRepository;
import com.kubi.sdk.timpush.data.repository.TimPushRepositoryFactory;
import kotlinx.coroutines.AbstractC41697j0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.internal.Intrinsics;
import t00.InterfaceC44608b;

/* JADX INFO: renamed from: r00.a */
/* JADX INFO: compiled from: TimPushServiceLocator.kt */
/* JADX INFO: loaded from: classes43.dex */
@Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000bJ\u0006\u0010\f\u001a\u00020\u0005R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\r"}, m90084d2 = {"Lcom/kubi/sdk/timpush/data/TimPushServiceLocator;", "", "<init>", "()V", "repository", "Lcom/kubi/sdk/timpush/data/repository/TimPushRepository;", "init", "", "webService", "Lcom/kubi/sdk/timpush/data/source/remote/WebService;", "ioDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "getRepository", "LTimPush_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C43895a {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C43895a f96983a = new C43895a();

    /* JADX INFO: renamed from: b */
    @Nullable
    public static volatile TimPushRepository f96984b;

    @NotNull
    /* JADX INFO: renamed from: a */
    public final TimPushRepository m96669a() {
        TimPushRepository timPushRepository = f96984b;
        if (timPushRepository != null) {
            return timPushRepository;
        }
        throw new IllegalArgumentException("TimPushServiceLocator is not initialized. Call init(webService) first.");
    }

    /* JADX INFO: renamed from: b */
    public final void m96670b(@NotNull InterfaceC44608b webService, @NotNull AbstractC41697j0 ioDispatcher) {
        Intrinsics.checkNotNullParameter(webService, "webService");
        Intrinsics.checkNotNullParameter(ioDispatcher, "ioDispatcher");
        if (f96984b != null) {
            return;
        }
        synchronized (this) {
            if (f96984b != null) {
                return;
            }
            f96984b = TimPushRepositoryFactory.f48093a.m58252a(webService, ioDispatcher);
            Unit unit = Unit.INSTANCE;
        }
    }
}
