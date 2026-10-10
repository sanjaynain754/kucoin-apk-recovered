package f30;

import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: f30.d */
/* JADX INFO: compiled from: GlobalStorage.kt */
/* JADX INFO: loaded from: classes47.dex */
@Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\u0001J\u0010\u0010\u000b\u001a\u0004\u0018\u00010\u00012\u0006\u0010\t\u001a\u00020\u0006R\u001c\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m90084d2 = {"Lcom/kubi/spot/utils/GlobalStorage;", "", "<init>", "()V", "data", "", "", "put", "", "key", "value", "get", "SpotLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C37333d {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C37333d f82848a = new C37333d();

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final Map<String, Object> f82849b = new LinkedHashMap();

    @Nullable
    /* JADX INFO: renamed from: a */
    public final Object m83917a(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return f82849b.get(key);
    }

    /* JADX INFO: renamed from: b */
    public final void m83918b(@NotNull String key, @Nullable Object obj) {
        Intrinsics.checkNotNullParameter(key, "key");
        f82849b.put(key, obj);
    }
}
