package th;

import com.google.android.gms.actions.SearchIntents;
import com.kubi.futures.data.platform.IPlatformDao;
import com.kubi.kumex.data.BKuMexDatabaseProxy;
import com.kubi.kumex.data.platform.model.DictEntity;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p236em.C37214b;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: th.i */
/* JADX INFO: compiled from: PlatformDaoWrapper.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m90083d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\n\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rJ\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rJ\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0011\u001a\u00020\u0012J\u0018\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0012H\u0002R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0017"}, m90084d2 = {"Lcom/kubi/futures/data/platform/PlatformDaoWrapper;", "", "<init>", "()V", "platformDao", "Lcom/kubi/futures/data/platform/IPlatformDao;", "getPlatformDao", "()Lcom/kubi/futures/data/platform/IPlatformDao;", "platformDao$delegate", "Lkotlin/Lazy;", "insert", "", "list", "", "Lcom/kubi/kumex/data/platform/model/DictEntity;", SearchIntents.EXTRA_QUERY, "queryByKey", "key", "", "catch", "e", "", "msg", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C44990i {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final Lazy f101371a = LazyKt.lazy(new Function0() { // from class: th.h
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return C44990i.m99540e();
        }
    });

    /* JADX INFO: renamed from: e */
    public static final IPlatformDao m99540e() {
        return BKuMexDatabaseProxy.f28810a.getInstance().mo33314h();
    }

    /* JADX INFO: renamed from: c */
    public final IPlatformDao m99542c() {
        return (IPlatformDao) this.f101371a.getValue();
    }

    /* JADX INFO: renamed from: d */
    public final void m99543d(@NotNull List<DictEntity> list) {
        Intrinsics.checkNotNullParameter(list, "list");
        try {
            m99542c().mo24890a(list);
        } catch (Throwable th2) {
            m99541b(th2, "PlatformDaoWrapper-insert-list");
        }
    }

    @Nullable
    /* JADX INFO: renamed from: f */
    public final DictEntity m99544f(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        try {
            return m99542c().mo24891b(key);
        } catch (Exception e11) {
            m99541b(e11, "PlatformDaoWrapper-queryByKey-" + key);
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m99541b(Throwable th2, String str) {
        C37214b.m83255a(th2, str);
    }
}
