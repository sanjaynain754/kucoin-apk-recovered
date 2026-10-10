package p472nk;

import cn.jiguang.privates.push.constants.JPushConstants;
import com.google.gson.reflect.TypeToken;
import com.kubi.utils.C27099x;
import java.lang.reflect.Type;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.collections.MapsKt;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.text.StringsKt;

/* JADX INFO: renamed from: nk.f */
/* JADX INFO: compiled from: StorageJsonCodec.kt */
/* JADX INFO: loaded from: classes17.dex */
@Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001c\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0001\u0018\u00010\b2\u0006\u0010\n\u001a\u00020\tR\u0016\u0010\u0004\u001a\n \u0006*\u0004\u0018\u00010\u00050\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m90084d2 = {"Lcom/kubi/jsbridge/impl/storage/StorageJsonCodec;", "", "<init>", "()V", "mapType", "Ljava/lang/reflect/Type;", "kotlin.jvm.PlatformType", "decodeMap", "", "", JPushConstants.Analysis.KEY_JSON, "JsBridgeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C42849f {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C42849f f94917a = new C42849f();

    /* JADX INFO: renamed from: b */
    public static final Type f94918b = new a().getType();

    /* JADX INFO: renamed from: nk.f$a */
    /* JADX INFO: compiled from: StorageJsonCodec.kt */
    @Metadata(m90083d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000*\u0001\u0000\b\n\u0018\u00002\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00020\u0001¨\u0006\u0005"}, m90084d2 = {"com/kubi/jsbridge/impl/storage/StorageJsonCodec$mapType$1", "Lcom/google/gson/reflect/TypeToken;", "", "", "", "JsBridgeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class a extends TypeToken<Map<String, ? extends Object>> {
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    public final Map<String, Object> m93981a(@NotNull String json) {
        Intrinsics.checkNotNullParameter(json, "json");
        return StringsKt.isBlank(json) ? MapsKt.emptyMap() : (Map) C27099x.m66915e().fromJson(json, f94918b);
    }
}
