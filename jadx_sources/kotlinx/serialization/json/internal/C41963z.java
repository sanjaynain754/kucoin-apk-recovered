package kotlinx.serialization.json.internal;

import androidx.exifinterface.media.ExifInterface;
import androidx.media3.exoplayer.upstream.CmcdData;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import vg0.InterfaceC45533f;

/* JADX INFO: renamed from: kotlinx.serialization.json.internal.z */
/* JADX INFO: compiled from: SchemaCache.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0011B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J8\u0010\u000b\u001a\u00020\n\"\b\b\u0000\u0010\u0004*\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00072\u0006\u0010\t\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b\u000b\u0010\fJ;\u0010\u000f\u001a\u00028\u0000\"\b\b\u0000\u0010\u0004*\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00072\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\r¢\u0006\u0004\b\u000f\u0010\u0010J2\u0010\u0011\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0004*\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0086\u0002¢\u0006\u0004\b\u0011\u0010\u0012R<\u0010\u0016\u001a*\u0012\u0004\u0012\u00020\u0005\u0012 \u0012\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0007\u0012\u0004\u0012\u00020\u00010\u0013j\b\u0012\u0004\u0012\u00020\u0001`\u00140\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0015¨\u0006\u0017"}, m90084d2 = {"Lkotlinx/serialization/json/internal/z;", "", "<init>", "()V", ExifInterface.GPS_DIRECTION_TRUE, "Lvg0/f;", "descriptor", "Lkotlinx/serialization/json/internal/z$a;", "key", "value", "", "c", "(Lvg0/f;Lkotlinx/serialization/json/internal/z$a;Ljava/lang/Object;)V", "Lkotlin/Function0;", "defaultValue", "b", "(Lvg0/f;Lkotlinx/serialization/json/internal/z$a;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Lvg0/f;Lkotlinx/serialization/json/internal/z$a;)Ljava/lang/Object;", "", "Lkotlinx/serialization/json/internal/DescriptorData;", "Ljava/util/Map;", "map", "kotlinx-serialization-json"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nSchemaCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SchemaCache.kt\nkotlinx/serialization/json/internal/DescriptorSchemaCache\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,53:1\n381#2,7:54\n1#3:61\n*S KotlinDebug\n*F\n+ 1 SchemaCache.kt\nkotlinx/serialization/json/internal/DescriptorSchemaCache\n*L\n25#1:54,7\n*E\n"})
public final class C41963z {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Map<InterfaceC45533f, Map<a<Object>, Object>> map = C41961y.m92019a(16);

    /* JADX INFO: renamed from: kotlinx.serialization.json.internal.z$a */
    /* JADX INFO: compiled from: SchemaCache.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m90084d2 = {"Lkotlinx/serialization/json/internal/z$a;", "", ExifInterface.GPS_DIRECTION_TRUE, "<init>", "()V", "kotlinx-serialization-json"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
    public static final class a<T> {
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    public final <T> T m92022a(@NotNull InterfaceC45533f descriptor, @NotNull a<T> key) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(key, "key");
        Map<a<Object>, Object> map = this.map.get(descriptor);
        T t11 = map != null ? (T) map.get(key) : null;
        if (t11 == null) {
            return null;
        }
        return t11;
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final <T> T m92023b(@NotNull InterfaceC45533f descriptor, @NotNull a<T> key, @NotNull Function0<? extends T> defaultValue) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        T t11 = (T) m92022a(descriptor, key);
        if (t11 != null) {
            return t11;
        }
        T tInvoke = defaultValue.invoke();
        m92024c(descriptor, key, tInvoke);
        return tInvoke;
    }

    /* JADX INFO: renamed from: c */
    public final <T> void m92024c(@NotNull InterfaceC45533f descriptor, @NotNull a<T> key, @NotNull T value) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        Map<InterfaceC45533f, Map<a<Object>, Object>> map = this.map;
        Map<a<Object>, Object> mapM92019a = map.get(descriptor);
        if (mapM92019a == null) {
            mapM92019a = C41961y.m92019a(2);
            map.put(descriptor, mapM92019a);
        }
        mapM92019a.put(key, value);
    }
}
