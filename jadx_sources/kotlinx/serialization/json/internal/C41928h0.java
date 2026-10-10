package kotlinx.serialization.json.internal;

import androidx.exifinterface.media.ExifInterface;
import androidx.media3.exoplayer.upstream.CmcdData;
import cn.jiguang.privates.push.constants.JPushConstants;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import tg0.InterfaceC44963p;
import xg0.AbstractC46162a;
import xg0.InterfaceC46183r;

/* JADX INFO: renamed from: kotlinx.serialization.json.internal.h0 */
/* JADX INFO: compiled from: JsonStreams.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a;\u0010\t\u001a\u00020\b\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00052\u0006\u0010\u0007\u001a\u00028\u0000H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m90084d2 = {ExifInterface.GPS_DIRECTION_TRUE, "Lxg0/a;", JPushConstants.Analysis.KEY_JSON, "Lkotlinx/serialization/json/internal/InternalJsonWriter;", "writer", "Ltg0/p;", "serializer", "value", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Lxg0/a;Lkotlinx/serialization/json/internal/InternalJsonWriter;Ltg0/p;Ljava/lang/Object;)V", "kotlinx-serialization-json"}, m90085k = 2, m90086mv = {2, 0, 0}, m90088xi = 48)
public final class C41928h0 {
    /* JADX INFO: renamed from: a */
    public static final <T> void m91942a(@NotNull AbstractC46162a json, @NotNull InternalJsonWriter writer, @NotNull InterfaceC44963p<? super T> serializer, T t11) {
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        new C41950s0(writer, json, WriteMode.OBJ, new InterfaceC46183r[WriteMode.getEntries().size()]).encodeSerializableValue(serializer, t11);
    }
}
