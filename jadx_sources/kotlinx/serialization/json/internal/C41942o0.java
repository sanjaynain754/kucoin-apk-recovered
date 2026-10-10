package kotlinx.serialization.json.internal;

import androidx.media3.exoplayer.upstream.CmcdData;
import cn.jiguang.privates.push.constants.JPushConstants;
import java.util.Map;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import xg0.AbstractC46162a;
import xg0.C46165b0;
import xg0.C46166c;

/* JADX INFO: renamed from: kotlinx.serialization.json.internal.o0 */
/* JADX INFO: compiled from: TreeJsonEncoder.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\r\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0013\u001a\u00020\n8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0017\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, m90084d2 = {"Lkotlinx/serialization/json/internal/o0;", "Lkotlinx/serialization/json/internal/k0;", "Lxg0/a;", JPushConstants.Analysis.KEY_JSON, "Lkotlin/Function1;", "Lkotlinx/serialization/json/JsonElement;", "", "nodeConsumer", "<init>", "(Lxg0/a;Lkotlin/jvm/functions/Function1;)V", "", "key", "element", "R", "(Ljava/lang/String;Lkotlinx/serialization/json/JsonElement;)V", "N", "()Lkotlinx/serialization/json/JsonElement;", CmcdData.Factory.STREAMING_FORMAT_HLS, "Ljava/lang/String;", "tag", "", "i", "Z", "isKey", "kotlinx-serialization-json"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public final class C41942o0 extends C41934k0 {

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public String tag;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public boolean isKey;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C41942o0(@NotNull AbstractC46162a json, @NotNull Function1<? super JsonElement, Unit> nodeConsumer) {
        super(json, nodeConsumer);
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(nodeConsumer, "nodeConsumer");
        this.isKey = true;
    }

    @Override // kotlinx.serialization.json.internal.C41934k0, kotlinx.serialization.json.internal.AbstractC41921e
    @NotNull
    /* JADX INFO: renamed from: N */
    public JsonElement mo91924N() {
        return new JsonObject(m91954S());
    }

    @Override // kotlinx.serialization.json.internal.C41934k0, kotlinx.serialization.json.internal.AbstractC41921e
    /* JADX INFO: renamed from: R */
    public void mo91928R(@NotNull String key, @NotNull JsonElement element) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(element, "element");
        if (!this.isKey) {
            Map<String, JsonElement> mapM91954S = m91954S();
            String str = this.tag;
            if (str == null) {
                Intrinsics.throwUninitializedPropertyAccessException("tag");
                str = null;
            }
            mapM91954S.put(str, element);
            this.isKey = true;
            return;
        }
        if (element instanceof JsonPrimitive) {
            this.tag = ((JsonPrimitive) element).getContent();
            this.isKey = false;
        } else {
            if (element instanceof JsonObject) {
                throw C41915b0.m91864d(C46165b0.f103669a.getDescriptor());
            }
            if (!(element instanceof JsonArray)) {
                throw new NoWhenBranchMatchedException();
            }
            throw C41915b0.m91864d(C46166c.f103674a.getDescriptor());
        }
    }
}
