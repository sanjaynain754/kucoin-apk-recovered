package xg0;

import androidx.media3.exoplayer.upstream.CmcdData;
import java.util.ArrayList;
import java.util.List;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.PublishedApi;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: xg0.b */
/* JADX INFO: compiled from: JsonElementBuilders.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0001¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0001¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\r¨\u0006\u000f"}, m90084d2 = {"Lxg0/b;", "", "<init>", "()V", "Lkotlinx/serialization/json/JsonElement;", "element", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Lkotlinx/serialization/json/JsonElement;)Z", "Lkotlinx/serialization/json/JsonArray;", "b", "()Lkotlinx/serialization/json/JsonArray;", "", "Ljava/util/List;", "content", "kotlinx-serialization-json"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public final class C46164b {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final List<JsonElement> content = new ArrayList();

    /* JADX INFO: renamed from: a */
    public final boolean m101770a(@NotNull JsonElement element) {
        Intrinsics.checkNotNullParameter(element, "element");
        this.content.add(element);
        return true;
    }

    @PublishedApi
    @NotNull
    /* JADX INFO: renamed from: b */
    public final JsonArray m101771b() {
        return new JsonArray(this.content);
    }

    @PublishedApi
    public C46164b() {
    }
}
