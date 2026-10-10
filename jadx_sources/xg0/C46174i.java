package xg0;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.media3.exoplayer.upstream.CmcdData;
import kotlinx.serialization.internal.C41879s0;
import kotlinx.serialization.json.C41910a;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonPrimitive;
import kotlinx.serialization.json.internal.C41954u0;
import kotlinx.serialization.json.internal.C41960x0;
import kotlinx.serialization.json.internal.JsonDecodingException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.KotlinNothingValueException;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.jvm.internal.StringCompanionObject;
import p852kotlin.text.StringsKt;
import ug0.C45236a;
import vg0.InterfaceC45533f;

/* JADX INFO: renamed from: xg0.i */
/* JADX INFO: compiled from: JsonElement.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000T\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0004\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\n\u001a\u0017\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0006\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0017\u0010\t\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\n\u001a\u001b\u0010\u000e\u001a\u00020\r*\u00020\u000b2\u0006\u0010\f\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000e\u0010\u000f\"\u001a\u0010\u0014\u001a\u00020\u00108\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0015\u0010\u0017\u001a\u00020\u0002*\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016\"\u0015\u0010\u001b\u001a\u00020\u0018*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a\"\u0017\u0010\u001e\u001a\u0004\u0018\u00010\u0018*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d\"\u0015\u0010\"\u001a\u00020\u001f*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b \u0010!\"\u0017\u0010%\u001a\u0004\u0018\u00010\u001f*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b#\u0010$\"\u0015\u0010)\u001a\u00020&*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b'\u0010(\"\u0017\u0010,\u001a\u0004\u0018\u00010&*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b*\u0010+\"\u0015\u00100\u001a\u00020-*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b.\u0010/\"\u0017\u00103\u001a\u0004\u0018\u00010\u0000*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b1\u00102\"\u0017\u00106\u001a\u0004\u0018\u00010\b*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b4\u00105¨\u00067"}, m90084d2 = {"", "value", "Lkotlinx/serialization/json/JsonPrimitive;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Ljava/lang/Boolean;)Lkotlinx/serialization/json/JsonPrimitive;", "", "b", "(Ljava/lang/Number;)Lkotlinx/serialization/json/JsonPrimitive;", "", "c", "(Ljava/lang/String;)Lkotlinx/serialization/json/JsonPrimitive;", "Lkotlinx/serialization/json/JsonElement;", "element", "", "d", "(Lkotlinx/serialization/json/JsonElement;Ljava/lang/String;)Ljava/lang/Void;", "Lvg0/f;", "Lvg0/f;", "m", "()Lvg0/f;", "jsonUnquotedLiteralDescriptor", CmcdData.Factory.STREAM_TYPE_LIVE, "(Lkotlinx/serialization/json/JsonElement;)Lkotlinx/serialization/json/JsonPrimitive;", "jsonPrimitive", "", "j", "(Lkotlinx/serialization/json/JsonPrimitive;)I", "int", "k", "(Lkotlinx/serialization/json/JsonPrimitive;)Ljava/lang/Integer;", "intOrNull", "", "n", "(Lkotlinx/serialization/json/JsonPrimitive;)J", "long", "o", "(Lkotlinx/serialization/json/JsonPrimitive;)Ljava/lang/Long;", "longOrNull", "", "g", "(Lkotlinx/serialization/json/JsonPrimitive;)D", "double", CmcdData.Factory.STREAMING_FORMAT_HLS, "(Lkotlinx/serialization/json/JsonPrimitive;)Ljava/lang/Double;", "doubleOrNull", "", "i", "(Lkotlinx/serialization/json/JsonPrimitive;)F", TypedValues.Custom.S_FLOAT, "e", "(Lkotlinx/serialization/json/JsonPrimitive;)Ljava/lang/Boolean;", "booleanOrNull", "f", "(Lkotlinx/serialization/json/JsonPrimitive;)Ljava/lang/String;", "contentOrNull", "kotlinx-serialization-json"}, m90085k = 2, m90086mv = {2, 0, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nJsonElement.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JsonElement.kt\nkotlinx/serialization/json/JsonElementKt\n*L\n1#1,348:1\n338#1,4:349\n330#1,4:353\n338#1,4:357\n330#1,4:361\n*S KotlinDebug\n*F\n+ 1 JsonElement.kt\nkotlinx/serialization/json/JsonElementKt\n*L\n259#1:349,4\n269#1:353,4\n278#1:357,4\n285#1:361,4\n*E\n"})
public final class C46174i {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final InterfaceC45533f f103714a = C41879s0.m91713a("kotlinx.serialization.json.JsonUnquotedLiteral", C45236a.serializer(StringCompanionObject.INSTANCE));

    @NotNull
    /* JADX INFO: renamed from: a */
    public static final JsonPrimitive m101812a(@Nullable Boolean bool) {
        return bool == null ? C41910a.INSTANCE : new C46186u(bool, false, null, 4, null);
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public static final JsonPrimitive m101813b(@Nullable Number number) {
        return number == null ? C41910a.INSTANCE : new C46186u(number, false, null, 4, null);
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public static final JsonPrimitive m101814c(@Nullable String str) {
        return str == null ? C41910a.INSTANCE : new C46186u(str, true, null, 4, null);
    }

    /* JADX INFO: renamed from: d */
    public static final Void m101815d(JsonElement jsonElement, String str) {
        throw new IllegalArgumentException("Element " + Reflection.getOrCreateKotlinClass(jsonElement.getClass()) + " is not a " + str);
    }

    @Nullable
    /* JADX INFO: renamed from: e */
    public static final Boolean m101816e(@NotNull JsonPrimitive jsonPrimitive) {
        Intrinsics.checkNotNullParameter(jsonPrimitive, "<this>");
        return C41960x0.m92017d(jsonPrimitive.getContent());
    }

    @Nullable
    /* JADX INFO: renamed from: f */
    public static final String m101817f(@NotNull JsonPrimitive jsonPrimitive) {
        Intrinsics.checkNotNullParameter(jsonPrimitive, "<this>");
        if (jsonPrimitive instanceof C41910a) {
            return null;
        }
        return jsonPrimitive.getContent();
    }

    /* JADX INFO: renamed from: g */
    public static final double m101818g(@NotNull JsonPrimitive jsonPrimitive) {
        Intrinsics.checkNotNullParameter(jsonPrimitive, "<this>");
        return Double.parseDouble(jsonPrimitive.getContent());
    }

    @Nullable
    /* JADX INFO: renamed from: h */
    public static final Double m101819h(@NotNull JsonPrimitive jsonPrimitive) {
        Intrinsics.checkNotNullParameter(jsonPrimitive, "<this>");
        return StringsKt.toDoubleOrNull(jsonPrimitive.getContent());
    }

    /* JADX INFO: renamed from: i */
    public static final float m101820i(@NotNull JsonPrimitive jsonPrimitive) {
        Intrinsics.checkNotNullParameter(jsonPrimitive, "<this>");
        return Float.parseFloat(jsonPrimitive.getContent());
    }

    /* JADX INFO: renamed from: j */
    public static final int m101821j(@NotNull JsonPrimitive jsonPrimitive) {
        Intrinsics.checkNotNullParameter(jsonPrimitive, "<this>");
        try {
            long jM91842m = new C41954u0(jsonPrimitive.getContent()).m91842m();
            if (-2147483648L <= jM91842m && jM91842m <= 2147483647L) {
                return (int) jM91842m;
            }
            throw new NumberFormatException(jsonPrimitive.getContent() + " is not an Int");
        } catch (JsonDecodingException e11) {
            throw new NumberFormatException(e11.getMessage());
        }
    }

    @Nullable
    /* JADX INFO: renamed from: k */
    public static final Integer m101822k(@NotNull JsonPrimitive jsonPrimitive) {
        Long lValueOf;
        Intrinsics.checkNotNullParameter(jsonPrimitive, "<this>");
        try {
            lValueOf = Long.valueOf(new C41954u0(jsonPrimitive.getContent()).m91842m());
        } catch (JsonDecodingException unused) {
            lValueOf = null;
        }
        if (lValueOf != null) {
            long jLongValue = lValueOf.longValue();
            if (-2147483648L <= jLongValue && jLongValue <= 2147483647L) {
                return Integer.valueOf((int) jLongValue);
            }
        }
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: l */
    public static final JsonPrimitive m101823l(@NotNull JsonElement jsonElement) {
        Intrinsics.checkNotNullParameter(jsonElement, "<this>");
        JsonPrimitive jsonPrimitive = jsonElement instanceof JsonPrimitive ? (JsonPrimitive) jsonElement : null;
        if (jsonPrimitive != null) {
            return jsonPrimitive;
        }
        m101815d(jsonElement, "JsonPrimitive");
        throw new KotlinNothingValueException();
    }

    @NotNull
    /* JADX INFO: renamed from: m */
    public static final InterfaceC45533f m101824m() {
        return f103714a;
    }

    /* JADX INFO: renamed from: n */
    public static final long m101825n(@NotNull JsonPrimitive jsonPrimitive) {
        Intrinsics.checkNotNullParameter(jsonPrimitive, "<this>");
        try {
            return new C41954u0(jsonPrimitive.getContent()).m91842m();
        } catch (JsonDecodingException e11) {
            throw new NumberFormatException(e11.getMessage());
        }
    }

    @Nullable
    /* JADX INFO: renamed from: o */
    public static final Long m101826o(@NotNull JsonPrimitive jsonPrimitive) {
        Intrinsics.checkNotNullParameter(jsonPrimitive, "<this>");
        try {
            return Long.valueOf(new C41954u0(jsonPrimitive.getContent()).m91842m());
        } catch (JsonDecodingException unused) {
            return null;
        }
    }
}
