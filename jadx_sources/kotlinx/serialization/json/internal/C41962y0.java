package kotlinx.serialization.json.internal;

import androidx.exifinterface.media.ExifInterface;
import androidx.media3.exoplayer.upstream.CmcdData;
import cn.jiguang.privates.push.constants.JPushConstants;
import kotlinx.serialization.encoding.InterfaceC41787b;
import kotlinx.serialization.json.C41910a;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.jvm.internal.Intrinsics;
import tg0.InterfaceC44949c;
import xg0.AbstractC46162a;
import xg0.C46186u;

/* JADX INFO: renamed from: kotlinx.serialization.json.internal.y0 */
/* JADX INFO: compiled from: TreeJsonDecoder.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a3\u0010\u0007\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a7\u0010\f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u000b2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0000¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, m90084d2 = {ExifInterface.GPS_DIRECTION_TRUE, "Lxg0/a;", JPushConstants.Analysis.KEY_JSON, "Lkotlinx/serialization/json/JsonElement;", "element", "Ltg0/c;", "deserializer", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Lxg0/a;Lkotlinx/serialization/json/JsonElement;Ltg0/c;)Ljava/lang/Object;", "", "discriminator", "Lkotlinx/serialization/json/JsonObject;", "b", "(Lxg0/a;Ljava/lang/String;Lkotlinx/serialization/json/JsonObject;Ltg0/c;)Ljava/lang/Object;", "kotlinx-serialization-json"}, m90085k = 2, m90086mv = {2, 0, 0}, m90088xi = 48)
public final class C41962y0 {
    /* JADX INFO: renamed from: a */
    public static final <T> T m92020a(@NotNull AbstractC46162a json, @NotNull JsonElement element, @NotNull InterfaceC44949c<? extends T> deserializer) {
        InterfaceC41787b c41924f0;
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(element, "element");
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        if (element instanceof JsonObject) {
            c41924f0 = new C41932j0(json, (JsonObject) element, null, null, 12, null);
        } else if (element instanceof JsonArray) {
            c41924f0 = new C41936l0(json, (JsonArray) element);
        } else {
            if (!(element instanceof C46186u) && !Intrinsics.areEqual(element, C41910a.INSTANCE)) {
                throw new NoWhenBranchMatchedException();
            }
            c41924f0 = new C41924f0(json, (JsonPrimitive) element, null, 4, null);
        }
        return (T) c41924f0.decodeSerializableValue(deserializer);
    }

    /* JADX INFO: renamed from: b */
    public static final <T> T m92021b(@NotNull AbstractC46162a abstractC46162a, @NotNull String discriminator, @NotNull JsonObject element, @NotNull InterfaceC44949c<? extends T> deserializer) {
        Intrinsics.checkNotNullParameter(abstractC46162a, "<this>");
        Intrinsics.checkNotNullParameter(discriminator, "discriminator");
        Intrinsics.checkNotNullParameter(element, "element");
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        return (T) new C41932j0(abstractC46162a, element, discriminator, deserializer.getDescriptor()).decodeSerializableValue(deserializer);
    }
}
