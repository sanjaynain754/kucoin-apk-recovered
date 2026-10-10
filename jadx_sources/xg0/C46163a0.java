package xg0;

import androidx.media3.exoplayer.upstream.CmcdData;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.PublishedApi;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: xg0.a0 */
/* JADX INFO: compiled from: JsonElementBuilders.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0001¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0001¢\u0006\u0004\b\u000b\u0010\fR \u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u000e¨\u0006\u0010"}, m90084d2 = {"Lxg0/a0;", "", "<init>", "()V", "", "key", "Lkotlinx/serialization/json/JsonElement;", "element", "b", "(Ljava/lang/String;Lkotlinx/serialization/json/JsonElement;)Lkotlinx/serialization/json/JsonElement;", "Lkotlinx/serialization/json/JsonObject;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "()Lkotlinx/serialization/json/JsonObject;", "", "Ljava/util/Map;", "content", "kotlinx-serialization-json"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public final class C46163a0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Map<String, JsonElement> content = new LinkedHashMap();

    @PublishedApi
    @NotNull
    /* JADX INFO: renamed from: a */
    public final JsonObject m101768a() {
        return new JsonObject(this.content);
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public final JsonElement m101769b(@NotNull String key, @NotNull JsonElement element) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(element, "element");
        return this.content.put(key, element);
    }

    @PublishedApi
    public C46163a0() {
    }
}
