package kotlinx.serialization.json.internal;

import androidx.media3.exoplayer.upstream.CmcdData;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlinx.serialization.json.C41910a;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;
import org.jetbrains.annotations.NotNull;
import p852kotlin.DeepRecursiveFunction;
import p852kotlin.DeepRecursiveKt;
import p852kotlin.KotlinNothingValueException;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import xg0.C46186u;
import xg0.JsonConfiguration;

/* JADX INFO: compiled from: JsonTreeReader.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\nJ \u0010\u000e\u001a\u00020\b*\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\b0\fH\u0082@¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0010\u0010\nJ\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0016\u0010\nR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001b\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001d\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001aR\u0016\u0010!\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006\""}, m90084d2 = {"Lkotlinx/serialization/json/internal/JsonTreeReader;", "", "Lxg0/f;", "configuration", "Lkotlinx/serialization/json/internal/a;", "lexer", "<init>", "(Lxg0/f;Lkotlinx/serialization/json/internal/a;)V", "Lkotlinx/serialization/json/JsonElement;", "e", "()Lkotlinx/serialization/json/JsonElement;", "i", "Lkotlin/DeepRecursiveScope;", "", CmcdData.Factory.STREAMING_FORMAT_HLS, "(Lkotlin/DeepRecursiveScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "f", "", "isString", "Lkotlinx/serialization/json/JsonPrimitive;", "j", "(Z)Lkotlinx/serialization/json/JsonPrimitive;", "g", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Lkotlinx/serialization/json/internal/a;", "b", "Z", "isLenient", "c", "trailingCommaAllowed", "", "d", "I", "stackDepth", "kotlinx-serialization-json"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nJsonTreeReader.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JsonTreeReader.kt\nkotlinx/serialization/json/internal/JsonTreeReader\n+ 2 AbstractJsonLexer.kt\nkotlinx/serialization/json/internal/AbstractJsonLexer\n*L\n1#1,121:1\n27#1,25:122\n27#1,25:147\n513#2,3:172\n*S KotlinDebug\n*F\n+ 1 JsonTreeReader.kt\nkotlinx/serialization/json/internal/JsonTreeReader\n*L\n19#1:122,25\n24#1:147,25\n64#1:172,3\n*E\n"})
public final class JsonTreeReader {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final JsonReader lexer;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final boolean isLenient;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public final boolean trailingCommaAllowed;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public int stackDepth;

    public JsonTreeReader(@NotNull JsonConfiguration configuration, @NotNull JsonReader lexer) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(lexer, "lexer");
        this.lexer = lexer;
        this.isLenient = configuration.getIsLenient();
        this.trailingCommaAllowed = configuration.getAllowTrailingComma();
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public final JsonElement m91803e() {
        byte bMo91819F = this.lexer.mo91819F();
        if (bMo91819F == 1) {
            return m91808j(true);
        }
        if (bMo91819F == 0) {
            return m91808j(false);
        }
        if (bMo91819F == 6) {
            int i11 = this.stackDepth + 1;
            this.stackDepth = i11;
            JsonElement jsonElementM91805g = i11 == 200 ? m91805g() : m91807i();
            this.stackDepth--;
            return jsonElementM91805g;
        }
        if (bMo91819F == 8) {
            return m91804f();
        }
        JsonReader.m91812x(this.lexer, "Cannot read Json element because of unexpected " + C41914b.m91860c(bMo91819F), 0, null, 6, null);
        throw new KotlinNothingValueException();
    }

    /* JADX INFO: renamed from: f */
    public final JsonElement m91804f() {
        byte bMo91839j = this.lexer.mo91839j();
        if (this.lexer.mo91819F() == 4) {
            JsonReader.m91812x(this.lexer, "Unexpected leading comma", 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
        ArrayList arrayList = new ArrayList();
        while (this.lexer.mo91834e()) {
            arrayList.add(m91803e());
            bMo91839j = this.lexer.mo91839j();
            if (bMo91839j != 4) {
                JsonReader jsonReader = this.lexer;
                boolean z11 = bMo91839j == 9;
                int i11 = jsonReader.currentPosition;
                if (!z11) {
                    JsonReader.m91812x(jsonReader, "Expected end of the array or comma", i11, null, 4, null);
                    throw new KotlinNothingValueException();
                }
            }
        }
        if (bMo91839j == 8) {
            this.lexer.m91840k((byte) 9);
        } else if (bMo91839j == 4) {
            if (!this.trailingCommaAllowed) {
                C41915b0.m91868h(this.lexer, "array");
                throw new KotlinNothingValueException();
            }
            this.lexer.m91840k((byte) 9);
        }
        return new JsonArray(arrayList);
    }

    /* JADX INFO: renamed from: g */
    public final JsonElement m91805g() {
        return (JsonElement) DeepRecursiveKt.invoke(new DeepRecursiveFunction(new JsonTreeReader$readDeepRecursive$1(this, null)), Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x006c  */
    /* JADX WARN: Code duplicated, block: B:21:0x0070  */
    /* JADX WARN: Code duplicated, block: B:22:0x0077  */
    /* JADX WARN: Code duplicated, block: B:25:0x0095 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:26:0x0096  */
    /* JADX WARN: Code duplicated, block: B:29:0x00ad A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:30:0x00af  */
    /* JADX WARN: Code duplicated, block: B:31:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:33:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0096 -> B:27:0x00a0). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: renamed from: h */
    public final java.lang.Object m91806h(p852kotlin.DeepRecursiveScope<p852kotlin.Unit, kotlinx.serialization.json.JsonElement> r20, p852kotlin.coroutines.Continuation<? super kotlinx.serialization.json.JsonElement> r21) {
        /*
            Method dump skipped, instruction units count: 255
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.serialization.json.internal.JsonTreeReader.m91806h(kotlin.DeepRecursiveScope, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: renamed from: i */
    public final JsonElement m91807i() {
        byte bM91840k = this.lexer.m91840k((byte) 6);
        if (this.lexer.mo91819F() == 4) {
            JsonReader.m91812x(this.lexer, "Unexpected leading comma", 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        while (this.lexer.mo91834e()) {
            String strM91845q = this.isLenient ? this.lexer.m91845q() : this.lexer.m91843o();
            this.lexer.m91840k((byte) 5);
            linkedHashMap.put(strM91845q, m91803e());
            bM91840k = this.lexer.mo91839j();
            if (bM91840k != 4) {
                if (bM91840k == 7) {
                    break;
                }
                JsonReader.m91812x(this.lexer, "Expected end of the object or comma", 0, null, 6, null);
                throw new KotlinNothingValueException();
            }
        }
        if (bM91840k == 6) {
            this.lexer.m91840k((byte) 7);
        } else if (bM91840k == 4) {
            if (!this.trailingCommaAllowed) {
                C41915b0.m91869i(this.lexer, null, 1, null);
                throw new KotlinNothingValueException();
            }
            this.lexer.m91840k((byte) 7);
        }
        return new JsonObject(linkedHashMap);
    }

    /* JADX INFO: renamed from: j */
    public final JsonPrimitive m91808j(boolean isString) {
        String strM91845q = (this.isLenient || !isString) ? this.lexer.m91845q() : this.lexer.m91843o();
        return (isString || !Intrinsics.areEqual(strM91845q, "null")) ? new C46186u(strM91845q, isString, null, 4, null) : C41910a.INSTANCE;
    }
}
