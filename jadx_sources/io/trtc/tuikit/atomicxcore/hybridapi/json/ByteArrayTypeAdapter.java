package io.trtc.tuikit.atomicxcore.hybridapi.json;

import android.util.Base64;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u001a\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\f"}, m90084d2 = {"Lio/trtc/tuikit/atomicxcore/hybridapi/json/ByteArrayTypeAdapter;", "Lcom/google/gson/TypeAdapter;", "", "()V", "read", "in", "Lcom/google/gson/stream/JsonReader;", "write", "", "out", "Lcom/google/gson/stream/JsonWriter;", "value", "atomicxcore_release"}, m90085k = 1, m90086mv = {1, 9, 0}, m90088xi = 48)
final class ByteArrayTypeAdapter extends TypeAdapter<byte[]> {

    @Metadata(m90085k = 3, m90086mv = {1, 9, 0}, m90088xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[JsonToken.values().length];
            try {
                iArr[JsonToken.NULL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[JsonToken.STRING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // com.google.gson.TypeAdapter
    @Nullable
    /* JADX INFO: renamed from: read, reason: avoid collision after fix types in other method */
    public byte[] read2(@NotNull JsonReader in2) throws IOException {
        Intrinsics.checkNotNullParameter(in2, "in");
        JsonToken jsonTokenPeek = in2.peek();
        int i11 = jsonTokenPeek == null ? -1 : WhenMappings.$EnumSwitchMapping$0[jsonTokenPeek.ordinal()];
        if (i11 == 1) {
            in2.nextNull();
            return null;
        }
        if (i11 != 2) {
            in2.skipValue();
            return null;
        }
        try {
            return Base64.decode(in2.nextString(), 2);
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.google.gson.TypeAdapter
    public void write(@NotNull JsonWriter out, @Nullable byte[] value) throws IOException {
        Intrinsics.checkNotNullParameter(out, "out");
        if (value == null) {
            out.nullValue();
        } else {
            out.value(Base64.encodeToString(value, 2));
        }
    }
}
