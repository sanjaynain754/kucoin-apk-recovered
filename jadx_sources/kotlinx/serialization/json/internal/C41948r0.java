package kotlinx.serialization.json.internal;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.exifinterface.media.ExifInterface;
import androidx.media3.exoplayer.upstream.CmcdData;
import cn.jiguang.privates.push.constants.JPushConstants;
import com.tencent.bugly.proguard.C33978va;
import kotlinx.serialization.MissingFieldException;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.encoding.AbstractC41786a;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.InterfaceC41787b;
import kotlinx.serialization.internal.AbstractC41793b;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.KotlinNothingValueException;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmField;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;
import tg0.C44956i;
import tg0.InterfaceC44949c;
import vg0.AbstractC45541n;
import vg0.InterfaceC45533f;
import xg0.AbstractC46162a;
import xg0.C46174i;
import xg0.InterfaceC46172g;
import xg0.JsonConfiguration;
import yg0.AbstractC46494a;

/* JADX INFO: renamed from: kotlinx.serialization.json.internal.r0 */
/* JADX INFO: compiled from: StreamingJsonDecoder.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000¾\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0001\n\u0002\b\u0007\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\n\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0010\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001WB1\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0013\u001a\u00020\u0012*\u0004\u0018\u00010\f2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010\u001e\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010 \u001a\u00020\u001a2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b \u0010!J\u0017\u0010#\u001a\u00020\u00122\u0006\u0010\"\u001a\u00020\u0010H\u0002¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\u001aH\u0002¢\u0006\u0004\b%\u0010\u001cJ\u000f\u0010&\u001a\u00020\u0010H\u0002¢\u0006\u0004\b&\u0010'J\u000f\u0010)\u001a\u00020(H\u0016¢\u0006\u0004\b)\u0010*J#\u0010.\u001a\u00028\u0000\"\u0004\b\u0000\u0010+2\f\u0010-\u001a\b\u0012\u0004\u0012\u00028\u00000,H\u0016¢\u0006\u0004\b.\u0010/J\u0017\u00101\u001a\u0002002\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b1\u00102J\u0017\u00103\u001a\u00020\u00152\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b3\u0010\u0017J\u000f\u00104\u001a\u00020\u0012H\u0016¢\u0006\u0004\b4\u00105J\u0011\u00107\u001a\u0004\u0018\u000106H\u0016¢\u0006\u0004\b7\u00108J=\u0010:\u001a\u00028\u0000\"\u0004\b\u0000\u0010+2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\u001a2\f\u0010-\u001a\b\u0012\u0004\u0012\u00028\u00000,2\b\u00109\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0004\b:\u0010;J\u0017\u0010<\u001a\u00020\u001a2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b<\u0010!J\u000f\u0010=\u001a\u00020\u0012H\u0016¢\u0006\u0004\b=\u00105J\u000f\u0010?\u001a\u00020>H\u0016¢\u0006\u0004\b?\u0010@J\u000f\u0010B\u001a\u00020AH\u0016¢\u0006\u0004\bB\u0010CJ\u000f\u0010D\u001a\u00020\u001aH\u0016¢\u0006\u0004\bD\u0010\u001cJ\u000f\u0010F\u001a\u00020EH\u0016¢\u0006\u0004\bF\u0010GJ\u000f\u0010I\u001a\u00020HH\u0016¢\u0006\u0004\bI\u0010JJ\u000f\u0010L\u001a\u00020KH\u0016¢\u0006\u0004\bL\u0010MJ\u000f\u0010O\u001a\u00020NH\u0016¢\u0006\u0004\bO\u0010PJ\u000f\u0010Q\u001a\u00020\u0010H\u0016¢\u0006\u0004\bQ\u0010'J\u0017\u0010S\u001a\u00020R2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\bS\u0010TJ\u0017\u0010V\u001a\u00020\u001a2\u0006\u0010U\u001a\u00020\nH\u0016¢\u0006\u0004\bV\u0010!R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bW\u0010X\u001a\u0004\bW\u0010YR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010ZR\u0014\u0010\t\u001a\u00020\b8\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010[R\u001a\u0010`\u001a\u00020\\8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010]\u001a\u0004\b^\u0010_R\u0016\u0010b\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010aR\u0018\u0010\r\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010cR\u0014\u0010f\u001a\u00020d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010eR\u0016\u0010i\u001a\u0004\u0018\u00010g8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010h¨\u0006j"}, m90084d2 = {"Lkotlinx/serialization/json/internal/r0;", "Lxg0/g;", "", "Lkotlinx/serialization/encoding/a;", "Lxg0/a;", JPushConstants.Analysis.KEY_JSON, "Lkotlinx/serialization/json/internal/WriteMode;", "mode", "Lkotlinx/serialization/json/internal/a;", "lexer", "Lvg0/f;", "descriptor", "Lkotlinx/serialization/json/internal/r0$a;", "discriminatorHolder", "<init>", "(Lxg0/a;Lkotlinx/serialization/json/internal/WriteMode;Lkotlinx/serialization/json/internal/a;Lvg0/f;Lkotlinx/serialization/json/internal/r0$a;)V", "", "unknownKey", "", "k", "(Lkotlinx/serialization/json/internal/r0$a;Ljava/lang/String;)Z", "", "j", "(Lvg0/f;)V", "c", "()V", "", "f", "()I", "index", "d", "(Lvg0/f;I)Z", "g", "(Lvg0/f;)I", "key", "i", "(Ljava/lang/String;)Z", "e", CmcdData.Factory.STREAMING_FORMAT_HLS, "()Ljava/lang/String;", "Lkotlinx/serialization/json/JsonElement;", "b", "()Lkotlinx/serialization/json/JsonElement;", ExifInterface.GPS_DIRECTION_TRUE, "Ltg0/c;", "deserializer", "decodeSerializableValue", "(Ltg0/c;)Ljava/lang/Object;", "Lkotlinx/serialization/encoding/CompositeDecoder;", "beginStructure", "(Lvg0/f;)Lkotlinx/serialization/encoding/CompositeDecoder;", "endStructure", "decodeNotNullMark", "()Z", "", "decodeNull", "()Ljava/lang/Void;", "previousValue", "decodeSerializableElement", "(Lvg0/f;ILtg0/c;Ljava/lang/Object;)Ljava/lang/Object;", "decodeElementIndex", "decodeBoolean", "", "decodeByte", "()B", "", "decodeShort", "()S", "decodeInt", "", "decodeLong", "()J", "", "decodeFloat", "()F", "", "decodeDouble", "()D", "", "decodeChar", "()C", "decodeString", "Lkotlinx/serialization/encoding/b;", "decodeInline", "(Lvg0/f;)Lkotlinx/serialization/encoding/b;", "enumDescriptor", "decodeEnum", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Lxg0/a;", "()Lxg0/a;", "Lkotlinx/serialization/json/internal/WriteMode;", "Lkotlinx/serialization/json/internal/a;", "Lyg0/a;", "Lyg0/a;", "getSerializersModule", "()Lyg0/a;", "serializersModule", "I", "currentIndex", "Lkotlinx/serialization/json/internal/r0$a;", "Lxg0/f;", "Lxg0/f;", "configuration", "Lkotlinx/serialization/json/internal/JsonElementMarker;", "Lkotlinx/serialization/json/internal/JsonElementMarker;", "elementMarker", "kotlinx-serialization-json"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nStreamingJsonDecoder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StreamingJsonDecoder.kt\nkotlinx/serialization/json/internal/StreamingJsonDecoder\n+ 2 Polymorphic.kt\nkotlinx/serialization/json/internal/PolymorphicKt\n+ 3 TreeJsonEncoder.kt\nkotlinx/serialization/json/internal/TreeJsonEncoderKt\n+ 4 AbstractJsonLexer.kt\nkotlinx/serialization/json/internal/AbstractJsonLexer\n+ 5 JsonNamesMap.kt\nkotlinx/serialization/json/internal/JsonNamesMapKt\n+ 6 StreamingJsonDecoder.kt\nkotlinx/serialization/json/internal/StreamingJsonDecoderKt\n*L\n1#1,391:1\n76#2,6:392\n82#2,9:406\n271#3,8:398\n513#4,3:415\n513#4,3:418\n133#5,18:421\n384#6,5:439\n384#6,5:444\n*S KotlinDebug\n*F\n+ 1 StreamingJsonDecoder.kt\nkotlinx/serialization/json/internal/StreamingJsonDecoder\n*L\n75#1:392,6\n75#1:406,9\n75#1:398,8\n202#1:415,3\n203#1:418,3\n215#1:421,18\n308#1:439,5\n315#1:444,5\n*E\n"})
public class C41948r0 extends AbstractC41786a implements InterfaceC46172g {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final AbstractC46162a json;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final WriteMode mode;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @JvmField
    @NotNull
    public final JsonReader lexer;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final AbstractC46494a serializersModule;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public int currentIndex;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    public a discriminatorHolder;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public final JsonConfiguration configuration;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @Nullable
    public final JsonElementMarker elementMarker;

    @Override // kotlinx.serialization.encoding.AbstractC41786a, kotlinx.serialization.encoding.InterfaceC41787b
    @Nullable
    public Void decodeNull() {
        return null;
    }

    /* JADX INFO: renamed from: k */
    public final boolean m92004k(a aVar, String str) {
        if (aVar == null || !Intrinsics.areEqual(aVar.discriminatorToSkip, str)) {
            return false;
        }
        aVar.discriminatorToSkip = null;
        return true;
    }

    /* JADX INFO: renamed from: kotlinx.serialization.json.internal.r0$a */
    /* JADX INFO: compiled from: StreamingJsonDecoder.kt */
    @Metadata(m90083d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m90084d2 = {"Lkotlinx/serialization/json/internal/r0$a;", "", "", "discriminatorToSkip", "<init>", "(Ljava/lang/String;)V", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Ljava/lang/String;", "kotlinx-serialization-json"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @JvmField
        @Nullable
        public String discriminatorToSkip;

        public a(@Nullable String str) {
            this.discriminatorToSkip = str;
        }
    }

    /* JADX INFO: renamed from: kotlinx.serialization.json.internal.r0$b */
    /* JADX INFO: compiled from: StreamingJsonDecoder.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 0, 0}, m90088xi = 48)
    public /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[WriteMode.values().length];
            try {
                iArr[WriteMode.LIST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[WriteMode.MAP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[WriteMode.POLY_OBJ.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[WriteMode.OBJ.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public C41948r0(@NotNull AbstractC46162a json, @NotNull WriteMode mode, @NotNull JsonReader lexer, @NotNull InterfaceC45533f descriptor, @Nullable a aVar) {
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(mode, "mode");
        Intrinsics.checkNotNullParameter(lexer, "lexer");
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        this.json = json;
        this.mode = mode;
        this.lexer = lexer;
        this.serializersModule = json.getSerializersModule();
        this.currentIndex = -1;
        this.discriminatorHolder = aVar;
        JsonConfiguration configuration = json.getConfiguration();
        this.configuration = configuration;
        this.elementMarker = configuration.getExplicitNulls() ? null : new JsonElementMarker(descriptor);
    }

    @Override // xg0.InterfaceC46172g
    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final AbstractC46162a getCn.jiguang.privates.push.constants.JPushConstants.Analysis.KEY_JSON java.lang.String() {
        return this.json;
    }

    @Override // xg0.InterfaceC46172g
    @NotNull
    /* JADX INFO: renamed from: b */
    public JsonElement mo91896b() {
        return new JsonTreeReader(this.json.getConfiguration(), this.lexer).m91803e();
    }

    @Override // kotlinx.serialization.encoding.AbstractC41786a, kotlinx.serialization.encoding.InterfaceC41787b
    @NotNull
    public CompositeDecoder beginStructure(@NotNull InterfaceC45533f descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        WriteMode writeModeM91875b = C41916b1.m91875b(this.json, descriptor);
        this.lexer.path.m91934c(descriptor);
        this.lexer.mo91841l(writeModeM91875b.begin);
        m91996c();
        int i11 = b.$EnumSwitchMapping$0[writeModeM91875b.ordinal()];
        if (i11 == 1 || i11 == 2 || i11 == 3) {
            return new C41948r0(this.json, writeModeM91875b, this.lexer, descriptor, this.discriminatorHolder);
        }
        return (this.mode == writeModeM91875b && this.json.getConfiguration().getExplicitNulls()) ? this : new C41948r0(this.json, writeModeM91875b, this.lexer, descriptor, this.discriminatorHolder);
    }

    /* JADX INFO: renamed from: c */
    public final void m91996c() {
        if (this.lexer.mo91819F() != 4) {
            return;
        }
        JsonReader.m91812x(this.lexer, "Unexpected leading comma", 0, null, 6, null);
        throw new KotlinNothingValueException();
    }

    /* JADX INFO: renamed from: d */
    public final boolean m91997d(InterfaceC45533f descriptor, int index) {
        String strM91820G;
        AbstractC46162a abstractC46162a = this.json;
        boolean zMo91529i = descriptor.mo91529i(index);
        InterfaceC45533f interfaceC45533fMo91525d = descriptor.mo91525d(index);
        if (zMo91529i && !interfaceC45533fMo91525d.mo91523b() && this.lexer.m91827N(true)) {
            return true;
        }
        if (!Intrinsics.areEqual(interfaceC45533fMo91525d.getCom.tencent.bugly.proguard.dh.m java.lang.String(), AbstractC45541n.b.f102629a) || ((interfaceC45533fMo91525d.mo91523b() && this.lexer.m91827N(false)) || (strM91820G = this.lexer.m91820G(this.configuration.getIsLenient())) == null)) {
            return false;
        }
        int iM91905i = C41920d0.m91905i(interfaceC45533fMo91525d, abstractC46162a, strM91820G);
        boolean z11 = !abstractC46162a.getConfiguration().getExplicitNulls() && interfaceC45533fMo91525d.mo91523b();
        if (iM91905i == -3 && (zMo91529i || z11)) {
            this.lexer.m91843o();
            return true;
        }
        return false;
    }

    @Override // kotlinx.serialization.encoding.AbstractC41786a, kotlinx.serialization.encoding.InterfaceC41787b
    public boolean decodeBoolean() {
        return this.lexer.m91836g();
    }

    @Override // kotlinx.serialization.encoding.AbstractC41786a, kotlinx.serialization.encoding.InterfaceC41787b
    public byte decodeByte() {
        long jM91842m = this.lexer.m91842m();
        byte b11 = (byte) jM91842m;
        if (jM91842m == b11) {
            return b11;
        }
        JsonReader.m91812x(this.lexer, "Failed to parse byte for input '" + jM91842m + '\'', 0, null, 6, null);
        throw new KotlinNothingValueException();
    }

    @Override // kotlinx.serialization.encoding.AbstractC41786a, kotlinx.serialization.encoding.InterfaceC41787b
    public char decodeChar() {
        String strM91845q = this.lexer.m91845q();
        if (strM91845q.length() == 1) {
            return strM91845q.charAt(0);
        }
        JsonReader.m91812x(this.lexer, "Expected single char, but got '" + strM91845q + '\'', 0, null, 6, null);
        throw new KotlinNothingValueException();
    }

    @Override // kotlinx.serialization.encoding.AbstractC41786a, kotlinx.serialization.encoding.InterfaceC41787b
    public double decodeDouble() {
        JsonReader jsonReader = this.lexer;
        String strM91845q = jsonReader.m91845q();
        try {
            double d11 = Double.parseDouble(strM91845q);
            if (this.json.getConfiguration().getAllowSpecialFloatingPointValues()) {
                return d11;
            }
            if (!Double.isInfinite(d11) && !Double.isNaN(d11)) {
                return d11;
            }
            C41915b0.m91872l(this.lexer, Double.valueOf(d11));
            throw new KotlinNothingValueException();
        } catch (IllegalArgumentException unused) {
            JsonReader.m91812x(jsonReader, "Failed to parse type 'double' for input '" + strM91845q + '\'', 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
    }

    @Override // kotlinx.serialization.encoding.CompositeDecoder
    public int decodeElementIndex(@NotNull InterfaceC45533f descriptor) {
        int iM91999f;
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        int i11 = b.$EnumSwitchMapping$0[this.mode.ordinal()];
        if (i11 != 2) {
            iM91999f = i11 != 4 ? m91998e() : m92000g(descriptor);
        } else {
            iM91999f = m91999f();
        }
        if (this.mode != WriteMode.MAP) {
            this.lexer.path.m91938g(iM91999f);
        }
        return iM91999f;
    }

    @Override // kotlinx.serialization.encoding.AbstractC41786a, kotlinx.serialization.encoding.InterfaceC41787b
    public int decodeEnum(@NotNull InterfaceC45533f enumDescriptor) {
        Intrinsics.checkNotNullParameter(enumDescriptor, "enumDescriptor");
        return C41920d0.m91906j(enumDescriptor, this.json, decodeString(), " at path " + this.lexer.path.m91932a());
    }

    @Override // kotlinx.serialization.encoding.AbstractC41786a, kotlinx.serialization.encoding.InterfaceC41787b
    public float decodeFloat() {
        JsonReader jsonReader = this.lexer;
        String strM91845q = jsonReader.m91845q();
        try {
            float f11 = Float.parseFloat(strM91845q);
            if (this.json.getConfiguration().getAllowSpecialFloatingPointValues()) {
                return f11;
            }
            if (!Float.isInfinite(f11) && !Float.isNaN(f11)) {
                return f11;
            }
            C41915b0.m91872l(this.lexer, Float.valueOf(f11));
            throw new KotlinNothingValueException();
        } catch (IllegalArgumentException unused) {
            JsonReader.m91812x(jsonReader, "Failed to parse type '" + TypedValues.Custom.S_FLOAT + "' for input '" + strM91845q + '\'', 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
    }

    @Override // kotlinx.serialization.encoding.AbstractC41786a, kotlinx.serialization.encoding.InterfaceC41787b
    @NotNull
    public InterfaceC41787b decodeInline(@NotNull InterfaceC45533f descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return C41952t0.m92009b(descriptor) ? new C41912a0(this.lexer, this.json) : super.decodeInline(descriptor);
    }

    @Override // kotlinx.serialization.encoding.AbstractC41786a, kotlinx.serialization.encoding.InterfaceC41787b
    public int decodeInt() {
        long jM91842m = this.lexer.m91842m();
        int i11 = (int) jM91842m;
        if (jM91842m == i11) {
            return i11;
        }
        JsonReader.m91812x(this.lexer, "Failed to parse int for input '" + jM91842m + '\'', 0, null, 6, null);
        throw new KotlinNothingValueException();
    }

    @Override // kotlinx.serialization.encoding.AbstractC41786a, kotlinx.serialization.encoding.InterfaceC41787b
    public long decodeLong() {
        return this.lexer.m91842m();
    }

    @Override // kotlinx.serialization.encoding.AbstractC41786a, kotlinx.serialization.encoding.InterfaceC41787b
    public boolean decodeNotNullMark() {
        JsonElementMarker jsonElementMarker = this.elementMarker;
        return ((jsonElementMarker != null ? jsonElementMarker.getIsUnmarkedNull() : false) || JsonReader.m91810O(this.lexer, false, 1, null)) ? false : true;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // kotlinx.serialization.encoding.AbstractC41786a, kotlinx.serialization.encoding.CompositeDecoder
    public <T> T decodeSerializableElement(@NotNull InterfaceC45533f descriptor, int index, @NotNull InterfaceC44949c<? extends T> deserializer, @Nullable T previousValue) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        boolean z11 = this.mode == WriteMode.MAP && (index & 1) == 0;
        if (z11) {
            this.lexer.path.m91935d();
        }
        T t11 = (T) super.decodeSerializableElement(descriptor, index, deserializer, previousValue);
        if (z11) {
            this.lexer.path.m91937f(t11);
        }
        return t11;
    }

    /* JADX WARN: Code duplicated, block: B:45:0x015a  */
    /* JADX WARN: Code duplicated, block: B:46:0x015b  */
    /* JADX WARN: Instruction removed from duplicated block: B:46:0x015b, please report this as an issue */
    @Override // kotlinx.serialization.encoding.AbstractC41786a, kotlinx.serialization.encoding.InterfaceC41787b
    public <T> T decodeSerializableValue(@NotNull InterfaceC44949c<? extends T> deserializer) {
        String message;
        JsonPrimitive jsonPrimitiveM101823l;
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        try {
            if ((deserializer instanceof AbstractC41793b) && !this.json.getConfiguration().getUseArrayPolymorphism()) {
                String strM91984c = C41944p0.m91984c(((AbstractC41793b) deserializer).getDescriptor(), this.json);
                String strMo91818E = this.lexer.mo91818E(strM91984c, this.configuration.getIsLenient());
                if (strMo91818E != null) {
                    try {
                        InterfaceC44949c interfaceC44949cM99414a = C44956i.m99414a((AbstractC41793b) deserializer, this, strMo91818E);
                        Intrinsics.checkNotNull(interfaceC44949cM99414a, "null cannot be cast to non-null type kotlinx.serialization.DeserializationStrategy<T of kotlinx.serialization.json.internal.StreamingJsonDecoder.decodeSerializableValue>");
                        this.discriminatorHolder = new a(strM91984c);
                        return (T) interfaceC44949cM99414a.deserialize(this);
                    } catch (SerializationException e11) {
                        String message2 = e11.getMessage();
                        Intrinsics.checkNotNull(message2);
                        String strRemoveSuffix = StringsKt.removeSuffix(StringsKt.substringBefore$default(message2, '\n', (String) null, 2, (Object) null), (CharSequence) C33978va.f72339h);
                        String message3 = e11.getMessage();
                        Intrinsics.checkNotNull(message3);
                        JsonReader.m91812x(this.lexer, strRemoveSuffix, 0, StringsKt.substringAfter(message3, '\n', ""), 2, null);
                        throw new KotlinNothingValueException();
                    }
                }
                if (deserializer != null && !getCn.jiguang.privates.push.constants.JPushConstants.Analysis.KEY_JSON java.lang.String().getConfiguration().getUseArrayPolymorphism()) {
                    String strM91984c2 = C41944p0.m91984c(((AbstractC41793b) deserializer).getDescriptor(), getCn.jiguang.privates.push.constants.JPushConstants.Analysis.KEY_JSON java.lang.String());
                    JsonElement jsonElementMo91896b = mo91896b();
                    String serialName = ((AbstractC41793b) deserializer).getDescriptor().getSerialName();
                    if (jsonElementMo91896b instanceof JsonObject) {
                        JsonObject jsonObject = (JsonObject) jsonElementMo91896b;
                        JsonElement jsonElement = (JsonElement) jsonObject.get(strM91984c2);
                        try {
                            InterfaceC44949c interfaceC44949cM99414a2 = C44956i.m99414a((AbstractC41793b) deserializer, this, (jsonElement == null || (jsonPrimitiveM101823l = C46174i.m101823l(jsonElement)) == null) ? null : C46174i.m101817f(jsonPrimitiveM101823l));
                            Intrinsics.checkNotNull(interfaceC44949cM99414a2, "null cannot be cast to non-null type kotlinx.serialization.DeserializationStrategy<T of kotlinx.serialization.json.internal.PolymorphicKt.decodeSerializableValuePolymorphic>");
                            return (T) C41962y0.m92021b(getCn.jiguang.privates.push.constants.JPushConstants.Analysis.KEY_JSON java.lang.String(), strM91984c2, jsonObject, interfaceC44949cM99414a2);
                        } catch (SerializationException e12) {
                            String message4 = e12.getMessage();
                            Intrinsics.checkNotNull(message4);
                            throw C41915b0.m91866f(-1, message4, jsonObject.toString());
                        }
                    }
                    throw C41915b0.m91866f(-1, "Expected " + Reflection.getOrCreateKotlinClass(JsonObject.class).getSimpleName() + ", but had " + Reflection.getOrCreateKotlinClass(jsonElementMo91896b.getClass()).getSimpleName() + " as the serialized body of " + serialName + " at element: " + this.lexer.path.m91932a(), jsonElementMo91896b.toString());
                }
                return deserializer.deserialize(this);
                message = e.getMessage();
                Intrinsics.checkNotNull(message);
                if (StringsKt.contains$default((CharSequence) message, (CharSequence) "at path", false, 2, (Object) null)) {
                    throw e;
                }
                throw new MissingFieldException(e.getMissingFields(), e.getMessage() + " at path: " + this.lexer.path.m91932a(), e);
            }
            return deserializer.deserialize(this);
        } catch (MissingFieldException e13) {
            message = e13.getMessage();
            Intrinsics.checkNotNull(message);
            if (StringsKt.contains$default((CharSequence) message, (CharSequence) "at path", false, 2, (Object) null)) {
                throw e13;
            }
            throw new MissingFieldException(e13.getMissingFields(), e13.getMessage() + " at path: " + this.lexer.path.m91932a(), e13);
        }
    }

    @Override // kotlinx.serialization.encoding.AbstractC41786a, kotlinx.serialization.encoding.InterfaceC41787b
    public short decodeShort() {
        long jM91842m = this.lexer.m91842m();
        short s11 = (short) jM91842m;
        if (jM91842m == s11) {
            return s11;
        }
        JsonReader.m91812x(this.lexer, "Failed to parse short for input '" + jM91842m + '\'', 0, null, 6, null);
        throw new KotlinNothingValueException();
    }

    @Override // kotlinx.serialization.encoding.AbstractC41786a, kotlinx.serialization.encoding.InterfaceC41787b
    @NotNull
    public String decodeString() {
        return this.configuration.getIsLenient() ? this.lexer.m91846r() : this.lexer.m91843o();
    }

    /* JADX INFO: renamed from: e */
    public final int m91998e() {
        boolean zM91826M = this.lexer.m91826M();
        if (!this.lexer.mo91834e()) {
            if (!zM91826M || this.json.getConfiguration().getAllowTrailingComma()) {
                return -1;
            }
            C41915b0.m91868h(this.lexer, "array");
            throw new KotlinNothingValueException();
        }
        int i11 = this.currentIndex;
        if (i11 != -1 && !zM91826M) {
            JsonReader.m91812x(this.lexer, "Expected end of the array or comma", 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
        int i12 = i11 + 1;
        this.currentIndex = i12;
        return i12;
    }

    @Override // kotlinx.serialization.encoding.AbstractC41786a, kotlinx.serialization.encoding.CompositeDecoder
    public void endStructure(@NotNull InterfaceC45533f descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (this.json.getConfiguration().getIgnoreUnknownKeys() && descriptor.getElementsCount() == 0) {
            m92003j(descriptor);
        }
        if (this.lexer.m91826M() && !this.json.getConfiguration().getAllowTrailingComma()) {
            C41915b0.m91868h(this.lexer, "");
            throw new KotlinNothingValueException();
        }
        this.lexer.mo91841l(this.mode.end);
        this.lexer.path.m91933b();
    }

    /* JADX INFO: renamed from: f */
    public final int m91999f() {
        int i11 = this.currentIndex;
        boolean zM91826M = false;
        boolean z11 = i11 % 2 != 0;
        if (!z11) {
            this.lexer.mo91841l(':');
        } else if (i11 != -1) {
            zM91826M = this.lexer.m91826M();
        }
        if (!this.lexer.mo91834e()) {
            if (!zM91826M || this.json.getConfiguration().getAllowTrailingComma()) {
                return -1;
            }
            C41915b0.m91869i(this.lexer, null, 1, null);
            throw new KotlinNothingValueException();
        }
        if (z11) {
            if (this.currentIndex == -1) {
                JsonReader jsonReader = this.lexer;
                int i12 = jsonReader.currentPosition;
                if (zM91826M) {
                    JsonReader.m91812x(jsonReader, "Unexpected leading comma", i12, null, 4, null);
                    throw new KotlinNothingValueException();
                }
            } else {
                JsonReader jsonReader2 = this.lexer;
                boolean z12 = zM91826M;
                int i13 = jsonReader2.currentPosition;
                if (!z12) {
                    JsonReader.m91812x(jsonReader2, "Expected comma after the key-value pair", i13, null, 4, null);
                    throw new KotlinNothingValueException();
                }
            }
        }
        int i14 = this.currentIndex + 1;
        this.currentIndex = i14;
        return i14;
    }

    /* JADX INFO: renamed from: g */
    public final int m92000g(InterfaceC45533f descriptor) {
        boolean zM91826M;
        boolean zM91826M2 = this.lexer.m91826M();
        while (true) {
            boolean z11 = true;
            if (!this.lexer.mo91834e()) {
                if (zM91826M2 && !this.json.getConfiguration().getAllowTrailingComma()) {
                    C41915b0.m91869i(this.lexer, null, 1, null);
                    throw new KotlinNothingValueException();
                }
                JsonElementMarker jsonElementMarker = this.elementMarker;
                if (jsonElementMarker != null) {
                    return jsonElementMarker.m91797d();
                }
                return -1;
            }
            String strM92001h = m92001h();
            this.lexer.mo91841l(':');
            int iM91905i = C41920d0.m91905i(descriptor, this.json, strM92001h);
            if (iM91905i == -3) {
                zM91826M = false;
            } else {
                if (!this.configuration.getCoerceInputValues() || !m91997d(descriptor, iM91905i)) {
                    JsonElementMarker jsonElementMarker2 = this.elementMarker;
                    if (jsonElementMarker2 != null) {
                        jsonElementMarker2.m91796c(iM91905i);
                    }
                    return iM91905i;
                }
                zM91826M = this.lexer.m91826M();
                z11 = false;
            }
            zM91826M2 = z11 ? m92002i(strM92001h) : zM91826M;
        }
    }

    @Override // kotlinx.serialization.encoding.InterfaceC41787b, kotlinx.serialization.encoding.CompositeDecoder
    @NotNull
    public AbstractC46494a getSerializersModule() {
        return this.serializersModule;
    }

    /* JADX INFO: renamed from: h */
    public final String m92001h() {
        return this.configuration.getIsLenient() ? this.lexer.m91846r() : this.lexer.mo91838i();
    }

    /* JADX INFO: renamed from: i */
    public final boolean m92002i(String key) {
        if (this.configuration.getIgnoreUnknownKeys() || m92004k(this.discriminatorHolder, key)) {
            this.lexer.m91822I(this.configuration.getIsLenient());
        } else {
            this.lexer.m91814A(key);
        }
        return this.lexer.m91826M();
    }

    /* JADX INFO: renamed from: j */
    public final void m92003j(InterfaceC45533f descriptor) {
        while (decodeElementIndex(descriptor) != -1) {
        }
    }
}
