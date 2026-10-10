package kotlinx.serialization.json.internal;

import androidx.exifinterface.media.ExifInterface;
import androidx.media3.exoplayer.upstream.CmcdData;
import cn.jiguang.privates.push.constants.JPushConstants;
import kotlinx.serialization.internal.AbstractC41793b;
import kotlinx.serialization.json.ClassDiscriminatorMode;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.KotlinNothingValueException;
import p852kotlin.Metadata;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import tg0.C44956i;
import tg0.InterfaceC44963p;
import vg0.AbstractC45541n;
import vg0.AbstractC45542o;
import vg0.InterfaceC45533f;
import wg0.AbstractC45828a;
import wg0.InterfaceC45829b;
import wg0.InterfaceC45830c;
import xg0.AbstractC46162a;
import xg0.C46181p;
import xg0.InterfaceC46183r;
import xg0.JsonConfiguration;
import yg0.AbstractC46494a;

/* JADX INFO: renamed from: kotlinx.serialization.json.internal.s0 */
/* JADX INFO: compiled from: StreamingJsonEncoder.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000¸\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\n\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B1\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0010\u0010\n\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fB1\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u000e\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\t¢\u0006\u0004\b\u000b\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ+\u0010 \u001a\u00020\u0012\"\u0004\b\u0000\u0010\u001c2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u001d2\u0006\u0010\u001f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b \u0010!J\u0017\u0010#\u001a\u00020\"2\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b#\u0010$J\u0017\u0010%\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b%\u0010&J\u001f\u0010'\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b'\u0010\u001bJA\u0010)\u001a\u00020\u0012\"\b\b\u0000\u0010\u001c*\u00020(2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00172\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u001d2\b\u0010\u001f\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0004\b)\u0010*J\u0017\u0010,\u001a\u00020+2\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b,\u0010-J\u000f\u0010.\u001a\u00020\u0012H\u0016¢\u0006\u0004\b.\u0010/J\u0017\u00100\u001a\u00020\u00122\u0006\u0010\u001f\u001a\u00020\u0019H\u0016¢\u0006\u0004\b0\u00101J\u0017\u00103\u001a\u00020\u00122\u0006\u0010\u001f\u001a\u000202H\u0016¢\u0006\u0004\b3\u00104J\u0017\u00106\u001a\u00020\u00122\u0006\u0010\u001f\u001a\u000205H\u0016¢\u0006\u0004\b6\u00107J\u0017\u00108\u001a\u00020\u00122\u0006\u0010\u001f\u001a\u00020\u0017H\u0016¢\u0006\u0004\b8\u00109J\u0017\u0010;\u001a\u00020\u00122\u0006\u0010\u001f\u001a\u00020:H\u0016¢\u0006\u0004\b;\u0010<J\u0017\u0010>\u001a\u00020\u00122\u0006\u0010\u001f\u001a\u00020=H\u0016¢\u0006\u0004\b>\u0010?J\u0017\u0010A\u001a\u00020\u00122\u0006\u0010\u001f\u001a\u00020@H\u0016¢\u0006\u0004\bA\u0010BJ\u0017\u0010D\u001a\u00020\u00122\u0006\u0010\u001f\u001a\u00020CH\u0016¢\u0006\u0004\bD\u0010EJ\u0017\u0010G\u001a\u00020\u00122\u0006\u0010\u001f\u001a\u00020FH\u0016¢\u0006\u0004\bG\u0010HJ\u001f\u0010J\u001a\u00020\u00122\u0006\u0010I\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\bJ\u0010KJ\u001f\u0010N\u001a\u00020\u00122\u0006\u0010L\u001a\u00020F2\u0006\u0010M\u001a\u00020FH\u0002¢\u0006\u0004\bN\u0010OR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010QR\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010R\u001a\u0004\bP\u0010SR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010TR\u001e\u0010\n\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u0010VR\u001a\u0010\\\u001a\u00020W8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bX\u0010Y\u001a\u0004\bZ\u0010[R\u0014\u0010`\u001a\u00020]8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b^\u0010_R\u0016\u0010c\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\ba\u0010bR\u0018\u0010f\u001a\u0004\u0018\u00010F8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bd\u0010eR\u0018\u0010h\u001a\u0004\u0018\u00010F8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bg\u0010e¨\u0006i"}, m90084d2 = {"Lkotlinx/serialization/json/internal/s0;", "Lxg0/r;", "Lwg0/a;", "Lkotlinx/serialization/json/internal/n;", "composer", "Lxg0/a;", JPushConstants.Analysis.KEY_JSON, "Lkotlinx/serialization/json/internal/WriteMode;", "mode", "", "modeReuseCache", "<init>", "(Lkotlinx/serialization/json/internal/n;Lxg0/a;Lkotlinx/serialization/json/internal/WriteMode;[Lxg0/r;)V", "Lkotlinx/serialization/json/internal/InternalJsonWriter;", "output", "(Lkotlinx/serialization/json/internal/InternalJsonWriter;Lxg0/a;Lkotlinx/serialization/json/internal/WriteMode;[Lxg0/r;)V", "Lkotlinx/serialization/json/JsonElement;", "element", "", "b", "(Lkotlinx/serialization/json/JsonElement;)V", "Lvg0/f;", "descriptor", "", "index", "", "shouldEncodeElementDefault", "(Lvg0/f;I)Z", ExifInterface.GPS_DIRECTION_TRUE, "Ltg0/p;", "serializer", "value", "encodeSerializableValue", "(Ltg0/p;Ljava/lang/Object;)V", "Lwg0/b;", "beginStructure", "(Lvg0/f;)Lwg0/b;", "endStructure", "(Lvg0/f;)V", "encodeElement", "", "encodeNullableSerializableElement", "(Lvg0/f;ILtg0/p;Ljava/lang/Object;)V", "Lwg0/c;", "encodeInline", "(Lvg0/f;)Lwg0/c;", "encodeNull", "()V", "encodeBoolean", "(Z)V", "", "encodeByte", "(B)V", "", "encodeShort", "(S)V", "encodeInt", "(I)V", "", "encodeLong", "(J)V", "", "encodeFloat", "(F)V", "", "encodeDouble", "(D)V", "", "encodeChar", "(C)V", "", "encodeString", "(Ljava/lang/String;)V", "enumDescriptor", "encodeEnum", "(Lvg0/f;I)V", "discriminator", "serialName", "c", "(Ljava/lang/String;Ljava/lang/String;)V", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Lkotlinx/serialization/json/internal/n;", "Lxg0/a;", "()Lxg0/a;", "Lkotlinx/serialization/json/internal/WriteMode;", "d", "[Lxg0/r;", "Lyg0/a;", "e", "Lyg0/a;", "getSerializersModule", "()Lyg0/a;", "serializersModule", "Lxg0/f;", "f", "Lxg0/f;", "configuration", "g", "Z", "forceQuoting", CmcdData.Factory.STREAMING_FORMAT_HLS, "Ljava/lang/String;", "polymorphicDiscriminator", "i", "polymorphicSerialName", "kotlinx-serialization-json"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nStreamingJsonEncoder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StreamingJsonEncoder.kt\nkotlinx/serialization/json/internal/StreamingJsonEncoder\n+ 2 Polymorphic.kt\nkotlinx/serialization/json/internal/PolymorphicKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,232:1\n178#1,2:259\n178#1,2:261\n21#2,12:233\n35#2,13:246\n1#3:245\n1#3:263\n*S KotlinDebug\n*F\n+ 1 StreamingJsonEncoder.kt\nkotlinx/serialization/json/internal/StreamingJsonEncoder\n*L\n168#1:259,2\n169#1:261,2\n68#1:233,12\n68#1:246,13\n68#1:245\n*E\n"})
public final class C41950s0 extends AbstractC45828a implements InterfaceC46183r {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final C41939n composer;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final AbstractC46162a json;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final WriteMode mode;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    public final InterfaceC46183r[] modeReuseCache;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public final AbstractC46494a serializersModule;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public final JsonConfiguration configuration;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public boolean forceQuoting;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @Nullable
    public String polymorphicDiscriminator;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @Nullable
    public String polymorphicSerialName;

    public C41950s0(@NotNull C41939n composer, @NotNull AbstractC46162a json, @NotNull WriteMode mode, @Nullable InterfaceC46183r[] interfaceC46183rArr) {
        Intrinsics.checkNotNullParameter(composer, "composer");
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(mode, "mode");
        this.composer = composer;
        this.json = json;
        this.mode = mode;
        this.modeReuseCache = interfaceC46183rArr;
        this.serializersModule = getJson().getSerializersModule();
        this.configuration = getJson().getConfiguration();
        int iOrdinal = mode.ordinal();
        if (interfaceC46183rArr != null) {
            InterfaceC46183r interfaceC46183r = interfaceC46183rArr[iOrdinal];
            if (interfaceC46183r == null && interfaceC46183r == this) {
                return;
            }
            interfaceC46183rArr[iOrdinal] = this;
        }
    }

    /* JADX INFO: renamed from: kotlinx.serialization.json.internal.s0$a */
    /* JADX INFO: compiled from: StreamingJsonEncoder.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 0, 0}, m90088xi = 48)
    public /* synthetic */ class a {
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
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // xg0.InterfaceC46183r
    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public AbstractC46162a getJson() {
        return this.json;
    }

    @Override // xg0.InterfaceC46183r
    /* JADX INFO: renamed from: b */
    public void mo91930b(@NotNull JsonElement element) {
        Intrinsics.checkNotNullParameter(element, "element");
        if (this.polymorphicDiscriminator == null || (element instanceof JsonObject)) {
            encodeSerializableValue(C46181p.f103715a, element);
        } else {
            C41944p0.m91985d(this.polymorphicSerialName, element);
            throw new KotlinNothingValueException();
        }
    }

    @Override // wg0.AbstractC45828a, wg0.InterfaceC45830c
    @NotNull
    public InterfaceC45829b beginStructure(@NotNull InterfaceC45533f descriptor) {
        InterfaceC46183r interfaceC46183r;
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        WriteMode writeModeM91875b = C41916b1.m91875b(getJson(), descriptor);
        char c11 = writeModeM91875b.begin;
        if (c11 != 0) {
            this.composer.m91969f(c11);
            this.composer.mo91965b();
        }
        String str = this.polymorphicDiscriminator;
        if (str != null) {
            String serialName = this.polymorphicSerialName;
            if (serialName == null) {
                serialName = descriptor.getSerialName();
            }
            m92006c(str, serialName);
            this.polymorphicDiscriminator = null;
            this.polymorphicSerialName = null;
        }
        if (this.mode == writeModeM91875b) {
            return this;
        }
        InterfaceC46183r[] interfaceC46183rArr = this.modeReuseCache;
        return (interfaceC46183rArr == null || (interfaceC46183r = interfaceC46183rArr[writeModeM91875b.ordinal()]) == null) ? new C41950s0(this.composer, getJson(), writeModeM91875b, this.modeReuseCache) : interfaceC46183r;
    }

    /* JADX INFO: renamed from: c */
    public final void m92006c(String discriminator, String serialName) {
        this.composer.mo91966c();
        encodeString(discriminator);
        this.composer.m91969f(':');
        this.composer.mo91979p();
        encodeString(serialName);
    }

    @Override // wg0.AbstractC45828a, wg0.InterfaceC45830c
    public void encodeBoolean(boolean value) {
        if (this.forceQuoting) {
            encodeString(String.valueOf(value));
        } else {
            this.composer.m91976m(value);
        }
    }

    @Override // wg0.AbstractC45828a, wg0.InterfaceC45830c
    public void encodeByte(byte value) {
        if (this.forceQuoting) {
            encodeString(String.valueOf((int) value));
        } else {
            this.composer.mo91968e(value);
        }
    }

    @Override // wg0.AbstractC45828a, wg0.InterfaceC45830c
    public void encodeDouble(double value) {
        if (this.forceQuoting) {
            encodeString(String.valueOf(value));
        } else {
            this.composer.m91970g(value);
        }
        if (this.configuration.getAllowSpecialFloatingPointValues()) {
            return;
        }
        if (Double.isInfinite(value) || Double.isNaN(value)) {
            throw C41915b0.m91862b(Double.valueOf(value), this.composer.writer.toString());
        }
    }

    @Override // wg0.AbstractC45828a
    public boolean encodeElement(@NotNull InterfaceC45533f descriptor, int index) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        int i11 = a.$EnumSwitchMapping$0[this.mode.ordinal()];
        if (i11 != 1) {
            boolean z11 = false;
            if (i11 != 2) {
                if (i11 != 3) {
                    if (!this.composer.getWritingFirst()) {
                        this.composer.m91969f(',');
                    }
                    this.composer.mo91966c();
                    encodeString(C41920d0.m91904h(descriptor, getJson(), index));
                    this.composer.m91969f(':');
                    this.composer.mo91979p();
                } else {
                    if (index == 0) {
                        this.forceQuoting = true;
                    }
                    if (index == 1) {
                        this.composer.m91969f(',');
                        this.composer.mo91979p();
                        this.forceQuoting = false;
                    }
                }
            } else if (this.composer.getWritingFirst()) {
                this.forceQuoting = true;
                this.composer.mo91966c();
            } else {
                if (index % 2 == 0) {
                    this.composer.m91969f(',');
                    this.composer.mo91966c();
                    z11 = true;
                } else {
                    this.composer.m91969f(':');
                    this.composer.mo91979p();
                }
                this.forceQuoting = z11;
            }
        } else {
            if (!this.composer.getWritingFirst()) {
                this.composer.m91969f(',');
            }
            this.composer.mo91966c();
        }
        return true;
    }

    @Override // wg0.AbstractC45828a, wg0.InterfaceC45830c
    public void encodeEnum(@NotNull InterfaceC45533f enumDescriptor, int index) {
        Intrinsics.checkNotNullParameter(enumDescriptor, "enumDescriptor");
        encodeString(enumDescriptor.mo91527f(index));
    }

    @Override // wg0.AbstractC45828a, wg0.InterfaceC45830c
    public void encodeFloat(float value) {
        if (this.forceQuoting) {
            encodeString(String.valueOf(value));
        } else {
            this.composer.m91971h(value);
        }
        if (this.configuration.getAllowSpecialFloatingPointValues()) {
            return;
        }
        if (Float.isInfinite(value) || Float.isNaN(value)) {
            throw C41915b0.m91862b(Float.valueOf(value), this.composer.writer.toString());
        }
    }

    @Override // wg0.AbstractC45828a, wg0.InterfaceC45830c
    @NotNull
    public InterfaceC45830c encodeInline(@NotNull InterfaceC45533f descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (C41952t0.m92009b(descriptor)) {
            C41939n c41955v = this.composer;
            if (!(c41955v instanceof C41955v)) {
                c41955v = new C41955v(c41955v.writer, this.forceQuoting);
            }
            return new C41950s0(c41955v, getJson(), this.mode, (InterfaceC46183r[]) null);
        }
        if (C41952t0.m92008a(descriptor)) {
            C41939n c41941o = this.composer;
            if (!(c41941o instanceof C41941o)) {
                c41941o = new C41941o(c41941o.writer, this.forceQuoting);
            }
            return new C41950s0(c41941o, getJson(), this.mode, (InterfaceC46183r[]) null);
        }
        if (this.polymorphicDiscriminator == null) {
            return super.encodeInline(descriptor);
        }
        this.polymorphicSerialName = descriptor.getSerialName();
        return this;
    }

    @Override // wg0.AbstractC45828a, wg0.InterfaceC45830c
    public void encodeInt(int value) {
        if (this.forceQuoting) {
            encodeString(String.valueOf(value));
        } else {
            this.composer.mo91972i(value);
        }
    }

    @Override // wg0.AbstractC45828a, wg0.InterfaceC45830c
    public void encodeLong(long value) {
        if (this.forceQuoting) {
            encodeString(String.valueOf(value));
        } else {
            this.composer.mo91973j(value);
        }
    }

    @Override // wg0.AbstractC45828a, wg0.InterfaceC45830c
    public void encodeNull() {
        this.composer.m91974k("null");
    }

    @Override // wg0.AbstractC45828a, wg0.InterfaceC45829b
    public <T> void encodeNullableSerializableElement(@NotNull InterfaceC45533f descriptor, int index, @NotNull InterfaceC44963p<? super T> serializer, @Nullable T value) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        if (value != null || this.configuration.getExplicitNulls()) {
            super.encodeNullableSerializableElement(descriptor, index, serializer, value);
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0061  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // wg0.AbstractC45828a, wg0.InterfaceC45830c
    public <T> void encodeSerializableValue(@NotNull InterfaceC44963p<? super T> serializer, T value) {
        String strM91984c;
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        if (getJson().getConfiguration().getUseArrayPolymorphism()) {
            serializer.serialize(this, value);
            return;
        }
        boolean z11 = serializer instanceof AbstractC41793b;
        if (!z11) {
            int i11 = C41944p0.a.$EnumSwitchMapping$0[getJson().getConfiguration().getClassDiscriminatorMode().ordinal()];
            if (i11 != 1 && i11 != 2) {
                if (i11 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                AbstractC45541n kind = serializer.getDescriptor().getKind();
                strM91984c = (Intrinsics.areEqual(kind, AbstractC45542o.a.f102630a) || Intrinsics.areEqual(kind, AbstractC45542o.d.f102633a)) ? C41944p0.m91984c(serializer.getDescriptor(), getJson()) : null;
            }
        } else if (getJson().getConfiguration().getClassDiscriminatorMode() != ClassDiscriminatorMode.NONE) {
        }
        if (z11) {
            AbstractC41793b abstractC41793b = (AbstractC41793b) serializer;
            if (value == 0) {
                throw new IllegalArgumentException(("Value for serializer " + abstractC41793b.getDescriptor() + " should always be non-null. Please report issue to the kotlinx.serialization tracker.").toString());
            }
            InterfaceC44963p<? super T> interfaceC44963pM99415b = C44956i.m99415b(abstractC41793b, this, value);
            if (strM91984c != null) {
                C41944p0.m91986e(serializer, interfaceC44963pM99415b, strM91984c);
            }
            C41944p0.m91983b(interfaceC44963pM99415b.getDescriptor().getKind());
            Intrinsics.checkNotNull(interfaceC44963pM99415b, "null cannot be cast to non-null type kotlinx.serialization.SerializationStrategy<T of kotlinx.serialization.json.internal.PolymorphicKt.encodePolymorphically>");
            serializer = interfaceC44963pM99415b;
        }
        if (strM91984c != null) {
            String serialName = serializer.getDescriptor().getSerialName();
            this.polymorphicDiscriminator = strM91984c;
            this.polymorphicSerialName = serialName;
        }
        serializer.serialize(this, value);
    }

    @Override // wg0.AbstractC45828a, wg0.InterfaceC45830c
    public void encodeShort(short value) {
        if (this.forceQuoting) {
            encodeString(String.valueOf((int) value));
        } else {
            this.composer.mo91975l(value);
        }
    }

    @Override // wg0.AbstractC45828a, wg0.InterfaceC45829b
    public void endStructure(@NotNull InterfaceC45533f descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (this.mode.end != 0) {
            this.composer.mo91980q();
            this.composer.mo91967d();
            this.composer.m91969f(this.mode.end);
        }
    }

    @Override // wg0.InterfaceC45830c
    @NotNull
    public AbstractC46494a getSerializersModule() {
        return this.serializersModule;
    }

    @Override // wg0.AbstractC45828a, wg0.InterfaceC45829b
    public boolean shouldEncodeElementDefault(@NotNull InterfaceC45533f descriptor, int index) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return this.configuration.getEncodeDefaults();
    }

    @Override // wg0.AbstractC45828a, wg0.InterfaceC45830c
    public void encodeChar(char value) {
        encodeString(String.valueOf(value));
    }

    @Override // wg0.AbstractC45828a, wg0.InterfaceC45830c
    public void encodeString(@NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.composer.mo91977n(value);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C41950s0(@NotNull InternalJsonWriter output, @NotNull AbstractC46162a json, @NotNull WriteMode mode, @NotNull InterfaceC46183r[] modeReuseCache) {
        this(C41959x.m92013a(output, json), json, mode, modeReuseCache);
        Intrinsics.checkNotNullParameter(output, "output");
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(mode, "mode");
        Intrinsics.checkNotNullParameter(modeReuseCache, "modeReuseCache");
    }
}
