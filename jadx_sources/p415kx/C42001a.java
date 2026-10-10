package p415kx;

import android.text.TextUtils;
import androidx.exifinterface.media.ExifInterface;
import com.google.gson.Gson;
import com.kubi.restful.AbstractC23185a;
import com.tencent.bugly.proguard.C33590cg;
import java.lang.reflect.Type;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: kx.a */
/* JADX INFO: compiled from: MemoryProxy.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\fJ/\u0010\u0011\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R \u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, m90084d2 = {"Lkx/a;", "Lcom/kubi/restful/a;", "<init>", "()V", "", "key", "", "value", "", "f", "(Ljava/lang/String;Ljava/lang/Object;)Z", "e", "(Ljava/lang/String;)Z", ExifInterface.GPS_DIRECTION_TRUE, "default", "Ljava/lang/reflect/Type;", "type", "g", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/reflect/Type;)Ljava/lang/Object;", "Lcom/google/gson/Gson;", "b", "Lcom/google/gson/Gson;", "gson", "Ljava/util/concurrent/ConcurrentHashMap;", "c", "Ljava/util/concurrent/ConcurrentHashMap;", C33590cg.f69440j, "Restful_release"}, m90085k = 1, m90086mv = {1, 4, 2})
public class C42001a extends AbstractC23185a {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final Gson gson = new Gson();

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public final ConcurrentHashMap<String, Object> cache = new ConcurrentHashMap<>();

    @Override // com.kubi.restful.AbstractC23185a
    /* JADX INFO: renamed from: e */
    public boolean mo55652e(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.cache.remove(key);
        return true;
    }

    @Override // com.kubi.restful.AbstractC23185a
    /* JADX INFO: renamed from: f */
    public boolean mo55653f(@NotNull String key, @NotNull Object value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        this.cache.put(key, value);
        return true;
    }

    @Override // com.kubi.restful.AbstractC23185a
    @Nullable
    /* JADX INFO: renamed from: g */
    public <T> T mo55654g(@NotNull String key, @NotNull String str, @NotNull Type type) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(str, "default");
        Intrinsics.checkNotNullParameter(type, "type");
        T t11 = (T) this.cache.get(key);
        return (t11 != null || TextUtils.isEmpty(str)) ? t11 : (T) this.gson.fromJson(str, type);
    }
}
