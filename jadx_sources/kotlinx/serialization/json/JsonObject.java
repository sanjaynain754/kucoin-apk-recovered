package kotlinx.serialization.json;

import com.google.firebase.remoteconfig.RemoteConfigConstants;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Function;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.internal.C41960x0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.markers.KMappedMarker;
import tg0.InterfaceC44951d;
import tg0.InterfaceC44962o;
import xg0.C46165b0;

/* JADX INFO: compiled from: JsonElement.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\"\n\u0002\u0010&\n\u0002\b\u0007\n\u0002\u0010\u001e\n\u0002\b\u0005\b\u0007\u0018\u0000 )2\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0002:\u0001)B\u001b\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u0003H\u0096\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u0001H\u0096\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0017\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0011\u001a\u00020\u0003H\u0096\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\tH\u0096\u0001¢\u0006\u0004\b\u0019\u0010\u001aR \u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u001bR&\u0010 \u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u001d0\u001c8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00030\u001c8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b!\u0010\u001fR\u0014\u0010$\u001a\u00020\f8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b#\u0010\u000eR\u001a\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00010%8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b&\u0010'¨\u0006*"}, m90084d2 = {"Lkotlinx/serialization/json/JsonObject;", "Lkotlinx/serialization/json/JsonElement;", "", "", "content", "<init>", "(Ljava/util/Map;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "key", "b", "(Ljava/lang/String;)Z", "value", "c", "(Lkotlinx/serialization/json/JsonElement;)Z", "d", "(Ljava/lang/String;)Lkotlinx/serialization/json/JsonElement;", "isEmpty", "()Z", "Ljava/util/Map;", "", "", "e", "()Ljava/util/Set;", RemoteConfigConstants.ResponseFieldKey.ENTRIES, "f", "keys", "getSize", "size", "", "g", "()Ljava/util/Collection;", "values", "Companion", "kotlinx-serialization-json"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
@InterfaceC44962o(with = C46165b0.class)
public final class JsonObject extends JsonElement implements Map<String, JsonElement>, KMappedMarker {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final Map<String, JsonElement> content;

    /* JADX INFO: compiled from: JsonElement.kt */
    @Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m90084d2 = {"Lkotlinx/serialization/json/JsonObject$Companion;", "", "<init>", "()V", "Ltg0/d;", "Lkotlinx/serialization/json/JsonObject;", "serializer", "()Ltg0/d;", "kotlinx-serialization-json"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final InterfaceC44951d<JsonObject> serializer() {
            return C46165b0.f103669a;
        }
    }

    @Override // java.util.Map
    public boolean remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ JsonElement replace(String str, JsonElement jsonElement) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public JsonObject(@NotNull Map<String, ? extends JsonElement> content) {
        super(null);
        Intrinsics.checkNotNullParameter(content, "content");
        this.content = content;
    }

    /* JADX INFO: renamed from: i */
    public static final CharSequence m91781i(Map.Entry entry) {
        Intrinsics.checkNotNullParameter(entry, "<destruct>");
        String str = (String) entry.getKey();
        JsonElement jsonElement = (JsonElement) entry.getValue();
        StringBuilder sb2 = new StringBuilder();
        C41960x0.m92016c(sb2, str);
        sb2.append(':');
        sb2.append(jsonElement);
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    /* JADX INFO: renamed from: b */
    public boolean m91782b(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.content.containsKey(key);
    }

    @Override // java.util.Map
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ JsonElement compute(String str, BiFunction<? super String, ? super JsonElement, ? extends JsonElement> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ JsonElement computeIfAbsent(String str, Function<? super String, ? extends JsonElement> function) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ JsonElement computeIfPresent(String str, BiFunction<? super String, ? super JsonElement, ? extends JsonElement> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        if (obj instanceof String) {
            return m91782b((String) obj);
        }
        return false;
    }

    @Override // java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (obj instanceof JsonElement) {
            return m91783c((JsonElement) obj);
        }
        return false;
    }

    @Nullable
    /* JADX INFO: renamed from: d */
    public JsonElement m91784d(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.content.get(key);
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public Set<Map.Entry<String, JsonElement>> m91785e() {
        return this.content.entrySet();
    }

    @Override // java.util.Map
    public boolean equals(@Nullable Object other) {
        return Intrinsics.areEqual(this.content, other);
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public Set<String> m91786f() {
        return this.content.keySet();
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public Collection<JsonElement> m91787g() {
        return this.content.values();
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ JsonElement get(Object obj) {
        if (obj instanceof String) {
            return m91784d((String) obj);
        }
        return null;
    }

    public int getSize() {
        return this.content.size();
    }

    @Override // java.util.Map
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public JsonElement remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public int hashCode() {
        return this.content.hashCode();
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return this.content.isEmpty();
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ JsonElement merge(String str, JsonElement jsonElement, BiFunction<? super JsonElement, ? super JsonElement, ? extends JsonElement> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ JsonElement put(String str, JsonElement jsonElement) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public void putAll(Map<? extends String, ? extends JsonElement> map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ JsonElement putIfAbsent(String str, JsonElement jsonElement) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ boolean replace(String str, JsonElement jsonElement, JsonElement jsonElement2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public void replaceAll(BiFunction<? super String, ? super JsonElement, ? extends JsonElement> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @NotNull
    public String toString() {
        return CollectionsKt.joinToString$default(this.content.entrySet(), ",", "{", "}", 0, null, new Function1() { // from class: xg0.z
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return JsonObject.m91781i((Map.Entry) obj);
            }
        }, 24, null);
    }

    /* JADX INFO: renamed from: c */
    public boolean m91783c(@NotNull JsonElement value) {
        Intrinsics.checkNotNullParameter(value, "value");
        return this.content.containsValue(value);
    }

    @Override // java.util.Map
    public final /* bridge */ Set<Map.Entry<String, JsonElement>> entrySet() {
        return m91785e();
    }

    @Override // java.util.Map
    public final /* bridge */ Set<String> keySet() {
        return m91786f();
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return getSize();
    }

    @Override // java.util.Map
    public final /* bridge */ Collection<JsonElement> values() {
        return m91787g();
    }
}
