package kotlinx.serialization.json.internal;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.sensorsdata.analytics.android.sdk.data.adapter.DbParams;
import com.tencent.qcloud.tuicore.TUIConstants;
import org.jetbrains.annotations.NotNull;
import p852kotlin.KotlinNothingValueException;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.ranges.RangesKt;
import vg0.InterfaceC45533f;

/* JADX INFO: renamed from: kotlinx.serialization.json.internal.b0 */
/* JADX INFO: compiled from: JsonExceptions.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000B\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0010\u0004\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000f\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a'\u0010\t\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\t\u0010\n\u001a\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u001b\u0010\u0014\u001a\u00020\u0013*\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u001d\u0010\u0017\u001a\u00020\u0013*\u00020\u00112\b\b\u0002\u0010\u0016\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u0017\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u0019H\u0000¢\u0006\u0004\b\u001b\u0010\u001c\u001a'\u0010\u001e\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u001e\u0010\u001f\u001a'\u0010 \u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0002H\u0000¢\u0006\u0004\b \u0010!\u001a'\u0010\"\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\"\u0010#\u001a\u001f\u0010$\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H\u0000¢\u0006\u0004\b$\u0010%\u001a\u001d\u0010&\u001a\u00020\u0007*\u00020\u00072\b\b\u0002\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b&\u0010'¨\u0006("}, m90084d2 = {"", TypedValues.CycleType.S_WAVE_OFFSET, "", "message", "Lkotlinx/serialization/json/internal/JsonDecodingException;", "e", "(ILjava/lang/String;)Lkotlinx/serialization/json/internal/JsonDecodingException;", "", "input", "f", "(ILjava/lang/String;Ljava/lang/CharSequence;)Lkotlinx/serialization/json/internal/JsonDecodingException;", "", "value", "output", "Lkotlinx/serialization/json/internal/JsonEncodingException;", "b", "(Ljava/lang/Number;Ljava/lang/String;)Lkotlinx/serialization/json/internal/JsonEncodingException;", "Lkotlinx/serialization/json/internal/a;", DbParams.KEY_CHANNEL_RESULT, "", CmcdData.Factory.STREAM_TYPE_LIVE, "(Lkotlinx/serialization/json/internal/a;Ljava/lang/Number;)Ljava/lang/Void;", TUIConstants.TIMPush.NOTIFICATION.ENTITY, CmcdData.Factory.STREAMING_FORMAT_HLS, "(Lkotlinx/serialization/json/internal/a;Ljava/lang/String;)Ljava/lang/Void;", "Lvg0/f;", "keyDescriptor", "d", "(Lvg0/f;)Lkotlinx/serialization/json/internal/JsonEncodingException;", "key", "c", "(Ljava/lang/Number;Ljava/lang/String;Ljava/lang/String;)Lkotlinx/serialization/json/internal/JsonEncodingException;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Ljava/lang/Number;Ljava/lang/String;Ljava/lang/String;)Lkotlinx/serialization/json/internal/JsonDecodingException;", "m", "(Ljava/lang/Number;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "g", "(Ljava/lang/String;Ljava/lang/String;)Lkotlinx/serialization/json/internal/JsonDecodingException;", "j", "(Ljava/lang/CharSequence;I)Ljava/lang/CharSequence;", "kotlinx-serialization-json"}, m90085k = 2, m90086mv = {2, 0, 0}, m90088xi = 48)
public final class C41915b0 {
    @NotNull
    /* JADX INFO: renamed from: d */
    public static final JsonEncodingException m91864d(@NotNull InterfaceC45533f keyDescriptor) {
        Intrinsics.checkNotNullParameter(keyDescriptor, "keyDescriptor");
        return new JsonEncodingException("Value of type '" + keyDescriptor.getSerialName() + "' can't be used in JSON as a key in the map. It should have either primitive or enum kind, but its kind is '" + keyDescriptor.getKind() + "'.\nUse 'allowStructuredMapKeys = true' in 'Json {}' builder to convert such maps to [key1, value1, key2, value2,...] arrays.");
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public static final JsonDecodingException m91865e(int i11, @NotNull String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        if (i11 >= 0) {
            message = "Unexpected JSON token at offset " + i11 + ": " + message;
        }
        return new JsonDecodingException(message);
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public static final JsonDecodingException m91866f(int i11, @NotNull String message, @NotNull CharSequence input) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(input, "input");
        return m91865e(i11, message + "\nJSON input: " + ((Object) m91870j(input, i11)));
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public static final JsonDecodingException m91867g(@NotNull String key, @NotNull String input) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(input, "input");
        return m91865e(-1, "Encountered an unknown key '" + key + "'.\nUse 'ignoreUnknownKeys = true' in 'Json {}' builder to ignore unknown keys.\nCurrent input: " + ((Object) m91871k(input, 0, 1, null)));
    }

    @NotNull
    /* JADX INFO: renamed from: h */
    public static final Void m91868h(@NotNull JsonReader jsonReader, @NotNull String entity) {
        Intrinsics.checkNotNullParameter(jsonReader, "<this>");
        Intrinsics.checkNotNullParameter(entity, "entity");
        jsonReader.m91851w("Trailing comma before the end of JSON " + entity, jsonReader.currentPosition - 1, "Trailing commas are non-complaint JSON and not allowed by default. Use 'allowTrailingCommas = true' in 'Json {}' builder to support them.");
        throw new KotlinNothingValueException();
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ Void m91869i(JsonReader jsonReader, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = "object";
        }
        return m91868h(jsonReader, str);
    }

    @NotNull
    /* JADX INFO: renamed from: j */
    public static final CharSequence m91870j(@NotNull CharSequence charSequence, int i11) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        if (charSequence.length() >= 200) {
            if (i11 != -1) {
                int i12 = i11 - 30;
                int i13 = i11 + 30;
                return (i12 <= 0 ? "" : ".....") + charSequence.subSequence(RangesKt.coerceAtLeast(i12, 0), RangesKt.coerceAtMost(i13, charSequence.length())).toString() + (i13 >= charSequence.length() ? "" : ".....");
            }
            int length = charSequence.length() - 60;
            if (length > 0) {
                return "....." + charSequence.subSequence(length, charSequence.length()).toString();
            }
        }
        return charSequence;
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ CharSequence m91871k(CharSequence charSequence, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = -1;
        }
        return m91870j(charSequence, i11);
    }

    @NotNull
    /* JADX INFO: renamed from: l */
    public static final Void m91872l(@NotNull JsonReader jsonReader, @NotNull Number result) {
        Intrinsics.checkNotNullParameter(jsonReader, "<this>");
        Intrinsics.checkNotNullParameter(result, "result");
        JsonReader.m91812x(jsonReader, "Unexpected special floating-point value " + result + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification", 0, "It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'", 2, null);
        throw new KotlinNothingValueException();
    }

    /* JADX INFO: renamed from: m */
    public static final String m91873m(Number number, String str, String str2) {
        return "Unexpected special floating-point value " + number + " with key " + str + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification. It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'\nCurrent output: " + ((Object) m91871k(str2, 0, 1, null));
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public static final JsonDecodingException m91861a(@NotNull Number value, @NotNull String key, @NotNull String output) {
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(output, "output");
        return m91865e(-1, m91873m(value, key, output));
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public static final JsonEncodingException m91862b(@NotNull Number value, @NotNull String output) {
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(output, "output");
        return new JsonEncodingException("Unexpected special floating-point value " + value + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification. It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'\nCurrent output: " + ((Object) m91871k(output, 0, 1, null)));
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public static final JsonEncodingException m91863c(@NotNull Number value, @NotNull String key, @NotNull String output) {
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(output, "output");
        return new JsonEncodingException(m91873m(value, key, output));
    }
}
