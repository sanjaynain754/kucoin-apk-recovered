package kotlinx.serialization.json.internal;

import androidx.media3.exoplayer.upstream.CmcdData;
import cn.jiguang.privates.push.constants.JPushConstants;
import kotlinx.serialization.encoding.AbstractC41786a;
import org.jetbrains.annotations.NotNull;
import p852kotlin.KotlinNothingValueException;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.UStringsKt;
import vg0.InterfaceC45533f;
import xg0.AbstractC46162a;
import yg0.AbstractC46494a;

/* JADX INFO: renamed from: kotlinx.serialization.json.internal.a0 */
/* JADX INFO: compiled from: StreamingJsonDecoder.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\n\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001f\u001a\u00020\u001a8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006 "}, m90084d2 = {"Lkotlinx/serialization/json/internal/a0;", "Lkotlinx/serialization/encoding/a;", "Lkotlinx/serialization/json/internal/a;", "lexer", "Lxg0/a;", JPushConstants.Analysis.KEY_JSON, "<init>", "(Lkotlinx/serialization/json/internal/a;Lxg0/a;)V", "Lvg0/f;", "descriptor", "", "decodeElementIndex", "(Lvg0/f;)I", "decodeInt", "()I", "", "decodeLong", "()J", "", "decodeByte", "()B", "", "decodeShort", "()S", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Lkotlinx/serialization/json/internal/a;", "Lyg0/a;", "b", "Lyg0/a;", "getSerializersModule", "()Lyg0/a;", "serializersModule", "kotlinx-serialization-json"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nStreamingJsonDecoder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StreamingJsonDecoder.kt\nkotlinx/serialization/json/internal/JsonDecoderForUnsignedTypes\n+ 2 StreamingJsonDecoder.kt\nkotlinx/serialization/json/internal/StreamingJsonDecoderKt\n*L\n1#1,391:1\n384#2,5:392\n384#2,5:397\n384#2,5:402\n384#2,5:407\n*S KotlinDebug\n*F\n+ 1 StreamingJsonDecoder.kt\nkotlinx/serialization/json/internal/JsonDecoderForUnsignedTypes\n*L\n377#1:392,5\n378#1:397,5\n379#1:402,5\n380#1:407,5\n*E\n"})
public final class C41912a0 extends AbstractC41786a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final JsonReader lexer;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final AbstractC46494a serializersModule;

    public C41912a0(@NotNull JsonReader lexer, @NotNull AbstractC46162a json) {
        Intrinsics.checkNotNullParameter(lexer, "lexer");
        Intrinsics.checkNotNullParameter(json, "json");
        this.lexer = lexer;
        this.serializersModule = json.getSerializersModule();
    }

    @Override // kotlinx.serialization.encoding.AbstractC41786a, kotlinx.serialization.encoding.InterfaceC41787b
    public byte decodeByte() {
        JsonReader jsonReader = this.lexer;
        String strM91845q = jsonReader.m91845q();
        try {
            return UStringsKt.toUByte(strM91845q);
        } catch (IllegalArgumentException unused) {
            JsonReader.m91812x(jsonReader, "Failed to parse type 'UByte' for input '" + strM91845q + '\'', 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
    }

    @Override // kotlinx.serialization.encoding.CompositeDecoder
    public int decodeElementIndex(@NotNull InterfaceC45533f descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        throw new IllegalStateException("unsupported");
    }

    @Override // kotlinx.serialization.encoding.AbstractC41786a, kotlinx.serialization.encoding.InterfaceC41787b
    public int decodeInt() {
        JsonReader jsonReader = this.lexer;
        String strM91845q = jsonReader.m91845q();
        try {
            return UStringsKt.toUInt(strM91845q);
        } catch (IllegalArgumentException unused) {
            JsonReader.m91812x(jsonReader, "Failed to parse type 'UInt' for input '" + strM91845q + '\'', 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
    }

    @Override // kotlinx.serialization.encoding.AbstractC41786a, kotlinx.serialization.encoding.InterfaceC41787b
    public long decodeLong() {
        JsonReader jsonReader = this.lexer;
        String strM91845q = jsonReader.m91845q();
        try {
            return UStringsKt.toULong(strM91845q);
        } catch (IllegalArgumentException unused) {
            JsonReader.m91812x(jsonReader, "Failed to parse type 'ULong' for input '" + strM91845q + '\'', 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
    }

    @Override // kotlinx.serialization.encoding.AbstractC41786a, kotlinx.serialization.encoding.InterfaceC41787b
    public short decodeShort() {
        JsonReader jsonReader = this.lexer;
        String strM91845q = jsonReader.m91845q();
        try {
            return UStringsKt.toUShort(strM91845q);
        } catch (IllegalArgumentException unused) {
            JsonReader.m91812x(jsonReader, "Failed to parse type 'UShort' for input '" + strM91845q + '\'', 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
    }

    @Override // kotlinx.serialization.encoding.InterfaceC41787b, kotlinx.serialization.encoding.CompositeDecoder
    @NotNull
    public AbstractC46494a getSerializersModule() {
        return this.serializersModule;
    }
}
