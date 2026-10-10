package kotlinx.serialization.json.internal;

import androidx.exifinterface.media.ExifInterface;
import androidx.media3.exoplayer.upstream.CmcdData;
import cn.jiguang.privates.push.constants.JPushConstants;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import vg0.InterfaceC45533f;
import xg0.AbstractC46162a;

/* JADX INFO: renamed from: kotlinx.serialization.json.internal.l0 */
/* JADX INFO: compiled from: TreeJsonDecoder.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0014¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\fH\u0014¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001d\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001a¨\u0006\u001e"}, m90084d2 = {"Lkotlinx/serialization/json/internal/l0;", "Lkotlinx/serialization/json/internal/c;", "Lxg0/a;", JPushConstants.Analysis.KEY_JSON, "Lkotlinx/serialization/json/JsonArray;", "value", "<init>", "(Lxg0/a;Lkotlinx/serialization/json/JsonArray;)V", "Lvg0/f;", "descriptor", "", "index", "", "z", "(Lvg0/f;I)Ljava/lang/String;", "tag", "Lkotlinx/serialization/json/JsonElement;", "F", "(Ljava/lang/String;)Lkotlinx/serialization/json/JsonElement;", "decodeElementIndex", "(Lvg0/f;)I", "g", "Lkotlinx/serialization/json/JsonArray;", ExifInterface.LONGITUDE_WEST, "()Lkotlinx/serialization/json/JsonArray;", CmcdData.Factory.STREAMING_FORMAT_HLS, "I", "size", "i", "currentIndex", "kotlinx-serialization-json"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public final class C41936l0 extends AbstractC41917c {

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public final JsonArray value;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public final int size;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public int currentIndex;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C41936l0(@NotNull AbstractC46162a json, @NotNull JsonArray value) {
        super(json, value, null, 4, null);
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(value, "value");
        this.value = value;
        this.size = mo91892T().size();
        this.currentIndex = -1;
    }

    @Override // kotlinx.serialization.json.internal.AbstractC41917c
    @NotNull
    /* JADX INFO: renamed from: W, reason: from getter and merged with bridge method [inline-methods] */
    public JsonArray mo91892T() {
        return this.value;
    }

    @Override // kotlinx.serialization.encoding.CompositeDecoder
    public int decodeElementIndex(@NotNull InterfaceC45533f descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        int i11 = this.currentIndex;
        if (i11 >= this.size - 1) {
            return -1;
        }
        int i12 = i11 + 1;
        this.currentIndex = i12;
        return i12;
    }

    @Override // kotlinx.serialization.internal.AbstractC41855n1
    @NotNull
    /* JADX INFO: renamed from: z */
    public String mo91653z(@NotNull InterfaceC45533f descriptor, int index) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return String.valueOf(index);
    }

    @Override // kotlinx.serialization.json.internal.AbstractC41917c
    @NotNull
    /* JADX INFO: renamed from: F */
    public JsonElement mo91878F(@NotNull String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        return mo91892T().get(Integer.parseInt(tag));
    }
}
