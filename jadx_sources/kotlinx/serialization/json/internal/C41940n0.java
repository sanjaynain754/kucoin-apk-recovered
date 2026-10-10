package kotlinx.serialization.json.internal;

import androidx.media3.exoplayer.upstream.CmcdData;
import cn.jiguang.privates.push.constants.JPushConstants;
import com.facebook.react.uimanager.ViewProps;
import java.util.List;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.collections.MapsKt;
import p852kotlin.jvm.internal.Intrinsics;
import vg0.InterfaceC45533f;
import xg0.AbstractC46162a;
import xg0.C46174i;

/* JADX INFO: renamed from: kotlinx.serialization.json.internal.n0 */
/* JADX INFO: compiled from: TreeJsonDecoder.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\t\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0014¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\fH\u0014¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\f0\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\"\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0016\u0010$\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010!¨\u0006%"}, m90084d2 = {"Lkotlinx/serialization/json/internal/n0;", "Lkotlinx/serialization/json/internal/j0;", "Lxg0/a;", JPushConstants.Analysis.KEY_JSON, "Lkotlinx/serialization/json/JsonObject;", "value", "<init>", "(Lxg0/a;Lkotlinx/serialization/json/JsonObject;)V", "Lvg0/f;", "descriptor", "", "index", "", "z", "(Lvg0/f;I)Ljava/lang/String;", "decodeElementIndex", "(Lvg0/f;)I", "tag", "Lkotlinx/serialization/json/JsonElement;", "F", "(Ljava/lang/String;)Lkotlinx/serialization/json/JsonElement;", "", "endStructure", "(Lvg0/f;)V", "k", "Lkotlinx/serialization/json/JsonObject;", "Y", "()Lkotlinx/serialization/json/JsonObject;", "", CmcdData.Factory.STREAM_TYPE_LIVE, "Ljava/util/List;", "keys", "m", "I", "size", "n", ViewProps.POSITION, "kotlinx-serialization-json"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public final class C41940n0 extends C41932j0 {

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    public final JsonObject value;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @NotNull
    public final List<String> keys;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    public final int size;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    public int position;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C41940n0(@NotNull AbstractC46162a json, @NotNull JsonObject value) {
        super(json, value, null, null, 12, null);
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(value, "value");
        this.value = value;
        List<String> list = CollectionsKt.toList(mo91892T().keySet());
        this.keys = list;
        this.size = list.size() * 2;
        this.position = -1;
    }

    @Override // kotlinx.serialization.json.internal.C41932j0, kotlinx.serialization.json.internal.AbstractC41917c
    @NotNull
    /* JADX INFO: renamed from: Y, reason: from getter and merged with bridge method [inline-methods] */
    public JsonObject getValue() {
        return this.value;
    }

    @Override // kotlinx.serialization.json.internal.C41932j0, kotlinx.serialization.encoding.CompositeDecoder
    public int decodeElementIndex(@NotNull InterfaceC45533f descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        int i11 = this.position;
        if (i11 >= this.size - 1) {
            return -1;
        }
        int i12 = i11 + 1;
        this.position = i12;
        return i12;
    }

    @Override // kotlinx.serialization.json.internal.C41932j0, kotlinx.serialization.json.internal.AbstractC41917c, kotlinx.serialization.encoding.CompositeDecoder
    public void endStructure(@NotNull InterfaceC45533f descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
    }

    @Override // kotlinx.serialization.json.internal.C41932j0, kotlinx.serialization.internal.AbstractC41855n1
    @NotNull
    /* JADX INFO: renamed from: z */
    public String mo91653z(@NotNull InterfaceC45533f descriptor, int index) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return this.keys.get(index / 2);
    }

    @Override // kotlinx.serialization.json.internal.C41932j0, kotlinx.serialization.json.internal.AbstractC41917c
    @NotNull
    /* JADX INFO: renamed from: F */
    public JsonElement mo91878F(@NotNull String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        if (this.position % 2 == 0) {
            return C46174i.m101814c(tag);
        }
        return (JsonElement) MapsKt.getValue(mo91892T(), tag);
    }
}
