package io.flutter.plugins.sharedpreferences;

import io.flutter.plugin.common.StandardMessageCodec;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: MessagesAsync.g.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0005\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0012\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0014J\u001a\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0005H\u0014¨\u0006\u000f"}, m90084d2 = {"Lio/flutter/plugins/sharedpreferences/MessagesAsyncPigeonCodec;", "Lio/flutter/plugin/common/StandardMessageCodec;", "<init>", "()V", "readValueOfType", "", "type", "", "buffer", "Ljava/nio/ByteBuffer;", "writeValue", "", "stream", "Ljava/io/ByteArrayOutputStream;", "value", "shared_preferences_android_release"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nMessagesAsync.g.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MessagesAsync.g.kt\nio/flutter/plugins/sharedpreferences/MessagesAsyncPigeonCodec\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,576:1\n1#2:577\n*E\n"})
class MessagesAsyncPigeonCodec extends StandardMessageCodec {
    @Override // io.flutter.plugin.common.StandardMessageCodec
    @Nullable
    public Object readValueOfType(byte type, @NotNull ByteBuffer buffer) {
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        if (type == -127) {
            Long l11 = (Long) readValue(buffer);
            if (l11 != null) {
                return StringListLookupResultType.INSTANCE.ofRaw((int) l11.longValue());
            }
            return null;
        }
        if (type == -126) {
            Object value = readValue(buffer);
            List<? extends Object> list = value instanceof List ? (List) value : null;
            if (list != null) {
                return SharedPreferencesPigeonOptions.INSTANCE.fromList(list);
            }
            return null;
        }
        if (type != -125) {
            return super.readValueOfType(type, buffer);
        }
        Object value2 = readValue(buffer);
        List<? extends Object> list2 = value2 instanceof List ? (List) value2 : null;
        if (list2 != null) {
            return StringListResult.INSTANCE.fromList(list2);
        }
        return null;
    }

    @Override // io.flutter.plugin.common.StandardMessageCodec
    public void writeValue(@NotNull ByteArrayOutputStream stream, @Nullable Object value) {
        Intrinsics.checkNotNullParameter(stream, "stream");
        if (value instanceof StringListLookupResultType) {
            stream.write(129);
            writeValue(stream, Integer.valueOf(((StringListLookupResultType) value).getRaw()));
        } else if (value instanceof SharedPreferencesPigeonOptions) {
            stream.write(130);
            writeValue(stream, ((SharedPreferencesPigeonOptions) value).toList());
        } else if (value instanceof StringListResult) {
            stream.write(131);
            writeValue(stream, ((StringListResult) value).toList());
        } else {
            super.writeValue(stream, value);
        }
    }
}
