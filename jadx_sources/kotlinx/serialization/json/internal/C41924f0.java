package kotlinx.serialization.json.internal;

import androidx.exifinterface.media.ExifInterface;
import cn.jiguang.privates.push.constants.JPushConstants;
import kotlinx.serialization.json.JsonElement;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import vg0.InterfaceC45533f;
import xg0.AbstractC46162a;

/* JADX INFO: renamed from: kotlinx.serialization.json.internal.f0 */
/* JADX INFO: compiled from: TreeJsonDecoder.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0002\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, m90084d2 = {"Lkotlinx/serialization/json/internal/f0;", "Lkotlinx/serialization/json/internal/c;", "Lxg0/a;", JPushConstants.Analysis.KEY_JSON, "Lkotlinx/serialization/json/JsonElement;", "value", "", "polymorphicDiscriminator", "<init>", "(Lxg0/a;Lkotlinx/serialization/json/JsonElement;Ljava/lang/String;)V", "Lvg0/f;", "descriptor", "", "decodeElementIndex", "(Lvg0/f;)I", "tag", "F", "(Ljava/lang/String;)Lkotlinx/serialization/json/JsonElement;", "g", "Lkotlinx/serialization/json/JsonElement;", ExifInterface.GPS_DIRECTION_TRUE, "()Lkotlinx/serialization/json/JsonElement;", "kotlinx-serialization-json"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nTreeJsonDecoder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TreeJsonDecoder.kt\nkotlinx/serialization/json/internal/JsonPrimitiveDecoder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,334:1\n1#2:335\n*E\n"})
public final class C41924f0 extends AbstractC41917c {

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public final JsonElement value;

    public /* synthetic */ C41924f0(AbstractC46162a abstractC46162a, JsonElement jsonElement, String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(abstractC46162a, jsonElement, (i11 & 4) != 0 ? null : str);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C41924f0(@NotNull AbstractC46162a json, @NotNull JsonElement value, @Nullable String str) {
        super(json, value, str, null);
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(value, "value");
        this.value = value;
        m91773w("primitive");
    }

    @Override // kotlinx.serialization.json.internal.AbstractC41917c
    @NotNull
    /* JADX INFO: renamed from: T, reason: from getter */
    public JsonElement getValue() {
        return this.value;
    }

    @Override // kotlinx.serialization.encoding.CompositeDecoder
    public int decodeElementIndex(@NotNull InterfaceC45533f descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return 0;
    }

    @Override // kotlinx.serialization.json.internal.AbstractC41917c
    @NotNull
    /* JADX INFO: renamed from: F */
    public JsonElement mo91878F(@NotNull String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        if (tag == "primitive") {
            return getValue();
        }
        throw new IllegalArgumentException("This input can only handle primitives with 'primitive' tag");
    }
}
