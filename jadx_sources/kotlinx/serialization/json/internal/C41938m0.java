package kotlinx.serialization.json.internal;

import cn.jiguang.privates.push.constants.JPushConstants;
import java.util.ArrayList;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import vg0.InterfaceC45533f;
import xg0.AbstractC46162a;

/* JADX INFO: renamed from: kotlinx.serialization.json.internal.m0 */
/* JADX INFO: compiled from: TreeJsonEncoder.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0014¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R$\u0010\u001b\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0017j\b\u0012\u0004\u0012\u00020\u0005`\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, m90084d2 = {"Lkotlinx/serialization/json/internal/m0;", "Lkotlinx/serialization/json/internal/e;", "Lxg0/a;", JPushConstants.Analysis.KEY_JSON, "Lkotlin/Function1;", "Lkotlinx/serialization/json/JsonElement;", "", "nodeConsumer", "<init>", "(Lxg0/a;Lkotlin/jvm/functions/Function1;)V", "Lvg0/f;", "descriptor", "", "index", "", "w", "(Lvg0/f;I)Ljava/lang/String;", "key", "element", "R", "(Ljava/lang/String;Lkotlinx/serialization/json/JsonElement;)V", "N", "()Lkotlinx/serialization/json/JsonElement;", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "g", "Ljava/util/ArrayList;", "array", "kotlinx-serialization-json"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public final class C41938m0 extends AbstractC41921e {

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public final ArrayList<JsonElement> array;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C41938m0(@NotNull AbstractC46162a json, @NotNull Function1<? super JsonElement, Unit> nodeConsumer) {
        super(json, nodeConsumer, null);
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(nodeConsumer, "nodeConsumer");
        this.array = new ArrayList<>();
    }

    @Override // kotlinx.serialization.json.internal.AbstractC41921e
    @NotNull
    /* JADX INFO: renamed from: N */
    public JsonElement mo91924N() {
        return new JsonArray(this.array);
    }

    @Override // kotlinx.serialization.json.internal.AbstractC41921e
    /* JADX INFO: renamed from: R */
    public void mo91928R(@NotNull String key, @NotNull JsonElement element) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(element, "element");
        this.array.add(Integer.parseInt(key), element);
    }

    @Override // kotlinx.serialization.json.internal.AbstractC41921e, kotlinx.serialization.internal.AbstractC41860o1
    @NotNull
    /* JADX INFO: renamed from: w */
    public String mo91668w(@NotNull InterfaceC45533f descriptor, int index) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return String.valueOf(index);
    }
}
