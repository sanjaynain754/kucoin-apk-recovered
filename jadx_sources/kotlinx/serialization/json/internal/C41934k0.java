package kotlinx.serialization.json.internal;

import androidx.exifinterface.media.ExifInterface;
import cn.jiguang.privates.push.constants.JPushConstants;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import tg0.InterfaceC44963p;
import vg0.InterfaceC45533f;
import xg0.AbstractC46162a;

/* JADX INFO: renamed from: kotlinx.serialization.json.internal.k0 */
/* JADX INFO: compiled from: TreeJsonEncoder.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010%\n\u0002\b\u0006\b\u0012\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\r\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\r\u0010\u000eJA\u0010\u0018\u001a\u00020\u0006\"\b\b\u0000\u0010\u0010*\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u00152\b\u0010\u0017\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR&\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00050\u001c8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006\""}, m90084d2 = {"Lkotlinx/serialization/json/internal/k0;", "Lkotlinx/serialization/json/internal/e;", "Lxg0/a;", JPushConstants.Analysis.KEY_JSON, "Lkotlin/Function1;", "Lkotlinx/serialization/json/JsonElement;", "", "nodeConsumer", "<init>", "(Lxg0/a;Lkotlin/jvm/functions/Function1;)V", "", "key", "element", "R", "(Ljava/lang/String;Lkotlinx/serialization/json/JsonElement;)V", "", ExifInterface.GPS_DIRECTION_TRUE, "Lvg0/f;", "descriptor", "", "index", "Ltg0/p;", "serializer", "value", "encodeNullableSerializableElement", "(Lvg0/f;ILtg0/p;Ljava/lang/Object;)V", "N", "()Lkotlinx/serialization/json/JsonElement;", "", "g", "Ljava/util/Map;", ExifInterface.LATITUDE_SOUTH, "()Ljava/util/Map;", "content", "kotlinx-serialization-json"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public class C41934k0 extends AbstractC41921e {

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public final Map<String, JsonElement> content;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C41934k0(@NotNull AbstractC46162a json, @NotNull Function1<? super JsonElement, Unit> nodeConsumer) {
        super(json, nodeConsumer, null);
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(nodeConsumer, "nodeConsumer");
        this.content = new LinkedHashMap();
    }

    @Override // kotlinx.serialization.json.internal.AbstractC41921e
    @NotNull
    /* JADX INFO: renamed from: N */
    public JsonElement mo91924N() {
        return new JsonObject(this.content);
    }

    @Override // kotlinx.serialization.json.internal.AbstractC41921e
    /* JADX INFO: renamed from: R */
    public void mo91928R(@NotNull String key, @NotNull JsonElement element) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(element, "element");
        this.content.put(key, element);
    }

    @NotNull
    /* JADX INFO: renamed from: S */
    public final Map<String, JsonElement> m91954S() {
        return this.content;
    }

    @Override // kotlinx.serialization.internal.AbstractC41792a3, wg0.InterfaceC45829b
    public <T> void encodeNullableSerializableElement(@NotNull InterfaceC45533f descriptor, int index, @NotNull InterfaceC44963p<? super T> serializer, @Nullable T value) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        if (value != null || this.configuration.getExplicitNulls()) {
            super.encodeNullableSerializableElement(descriptor, index, serializer, value);
        }
    }
}
