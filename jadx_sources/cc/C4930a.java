package cc;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.kubi.config.Config;
import com.kubi.config.core.FirebaseConfig;
import com.kubi.config.core.IRemoteConfig;
import com.kubi.config.kcrc.C11417c;
import com.kubi.config.kcrc.C11425k;
import io.reactivex.Observable;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: cc.a */
/* JADX INFO: compiled from: RemoteConfigAgg.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m90083d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u000b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0015R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, m90084d2 = {"Lcc/a;", "Lcom/kubi/config/core/IRemoteConfig;", "<init>", "()V", "Lcom/kubi/config/Config;", "config", "", "b", "(Lcom/kubi/config/Config;)V", "", "name", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Ljava/lang/String;)Ljava/lang/String;", "Lio/reactivex/Observable;", "", "c", "()Lio/reactivex/Observable;", "Lcom/kubi/config/core/FirebaseConfig;", "Lcom/kubi/config/core/FirebaseConfig;", "firebaseConfig", "Lcom/kubi/config/kcrc/c;", "Lcom/kubi/config/kcrc/c;", "kcRemoteConfig", "d", "Lcom/kubi/config/Config;", "rConfig", "Config_release"}, m90085k = 1, m90086mv = {1, 7, 1}, m90088xi = 48)
public final class C4930a implements IRemoteConfig {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C4930a f5466a = new C4930a();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final FirebaseConfig firebaseConfig = new FirebaseConfig();

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public static final C11417c kcRemoteConfig = new C11417c();

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    public static Config rConfig;

    @Nullable
    /* JADX INFO: renamed from: a */
    public String m5150a(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        if (name.length() == 0) {
            return null;
        }
        Config config = rConfig;
        List<String> listM20450f = config != null ? config.m20450f() : null;
        if (listM20450f == null) {
            listM20450f = CollectionsKt.emptyList();
        }
        if (listM20450f.contains(name)) {
            String strM20466e = firebaseConfig.m20466e(name);
            C11425k.m20562a("FB", name, strM20466e);
            return strM20466e;
        }
        String strM20555a = kcRemoteConfig.m20555a(name);
        C11425k.m20562a("KC", name, strM20555a);
        return strM20555a;
    }

    /* JADX INFO: renamed from: b */
    public void m5151b(@NotNull Config config) {
        Intrinsics.checkNotNullParameter(config, "config");
        rConfig = config;
        kcRemoteConfig.m20556b(config);
        firebaseConfig.m20467f(config);
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public Observable<Boolean> m5152c() {
        Observable<Boolean> observableMergeWith = kcRemoteConfig.m20557c().mergeWith(firebaseConfig.m20470i());
        Intrinsics.checkNotNullExpressionValue(observableMergeWith, "kcRemoteConfig.observeCo…seConfig.observeConfig())");
        return observableMergeWith;
    }
}
