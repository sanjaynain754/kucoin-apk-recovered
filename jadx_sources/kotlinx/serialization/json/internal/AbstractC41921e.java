package kotlinx.serialization.json.internal;

import androidx.exifinterface.media.ExifInterface;
import androidx.media3.exoplayer.upstream.CmcdData;
import cn.jiguang.privates.push.constants.JPushConstants;
import io.flutter.embedding.android.KeyboardMap;
import kotlinx.serialization.internal.AbstractC41793b;
import kotlinx.serialization.internal.AbstractC41860o1;
import kotlinx.serialization.json.C41910a;
import kotlinx.serialization.json.ClassDiscriminatorMode;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.KotlinNothingValueException;
import p852kotlin.Metadata;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.UByte;
import p852kotlin.UInt;
import p852kotlin.ULong;
import p852kotlin.UShort;
import p852kotlin.Unit;
import p852kotlin.jvm.JvmField;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import tg0.C44956i;
import tg0.InterfaceC44963p;
import vg0.AbstractC45531d;
import vg0.AbstractC45532e;
import vg0.AbstractC45541n;
import vg0.AbstractC45542o;
import vg0.InterfaceC45533f;
import wg0.AbstractC45828a;
import wg0.InterfaceC45829b;
import wg0.InterfaceC45830c;
import xg0.AbstractC46162a;
import xg0.C46174i;
import xg0.C46181p;
import xg0.C46186u;
import xg0.InterfaceC46183r;
import xg0.JsonConfiguration;
import yg0.AbstractC46494a;

/* JADX INFO: renamed from: kotlinx.serialization.json.internal.e */
/* JADX INFO: compiled from: TreeJsonEncoder.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000°\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\n\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\f\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0002\r\u0012\b3\u0018\u00002\u00020\u00012\u00020\u0002B%\b\u0004\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0013\u001a\u00020\u00122\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u0016H\u0014¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u001f\u0010\"\u001a\u00020\u000b2\u0006\u0010 \u001a\u00020\u000b2\u0006\u0010!\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\"\u0010#J\u001f\u0010%\u001a\u00020\u00072\u0006\u0010$\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u0006H&¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\u0006H&¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020\u0007H\u0016¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\u0007H\u0016¢\u0006\u0004\b+\u0010*J\u0017\u0010,\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000bH\u0014¢\u0006\u0004\b,\u0010-J\u001f\u0010/\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010.\u001a\u00020\u0016H\u0014¢\u0006\u0004\b/\u00100J\u001f\u00102\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010.\u001a\u000201H\u0014¢\u0006\u0004\b2\u00103J\u001f\u00105\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010.\u001a\u000204H\u0014¢\u0006\u0004\b5\u00106J\u001f\u00108\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010.\u001a\u000207H\u0014¢\u0006\u0004\b8\u00109J\u001f\u0010;\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010.\u001a\u00020:H\u0014¢\u0006\u0004\b;\u0010<J+\u0010@\u001a\u00020\u0007\"\u0004\b\u0000\u0010=2\f\u0010?\u001a\b\u0012\u0004\u0012\u00028\u00000>2\u0006\u0010.\u001a\u00028\u0000H\u0016¢\u0006\u0004\b@\u0010AJ\u001f\u0010C\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010.\u001a\u00020BH\u0014¢\u0006\u0004\bC\u0010DJ\u001f\u0010E\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010.\u001a\u00020\u001dH\u0014¢\u0006\u0004\bE\u0010FJ\u001f\u0010H\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010.\u001a\u00020GH\u0014¢\u0006\u0004\bH\u0010IJ\u001f\u0010J\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010.\u001a\u00020\u000bH\u0014¢\u0006\u0004\bJ\u0010KJ'\u0010N\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010L\u001a\u00020\u00102\u0006\u0010M\u001a\u00020\u0016H\u0014¢\u0006\u0004\bN\u0010OJ\u001f\u0010Q\u001a\u00020P2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u0010H\u0014¢\u0006\u0004\bQ\u0010RJ\u0017\u0010S\u001a\u00020P2\u0006\u0010\u0015\u001a\u00020\u0010H\u0016¢\u0006\u0004\bS\u0010TJ\u0017\u0010V\u001a\u00020U2\u0006\u0010\u0015\u001a\u00020\u0010H\u0016¢\u0006\u0004\bV\u0010WJ\u0017\u0010X\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u0010H\u0014¢\u0006\u0004\bX\u0010YR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u001b\u0010Z\u001a\u0004\b[\u0010\\R&\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00058\u0004X\u0084\u0004¢\u0006\f\n\u0004\b]\u0010^\u001a\u0004\b_\u0010`R\u0014\u0010d\u001a\u00020a8\u0004X\u0085\u0004¢\u0006\u0006\n\u0004\bb\u0010cR\u0018\u0010g\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\be\u0010fR\u0018\u0010i\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bh\u0010fR\u0011\u0010m\u001a\u00020j8F¢\u0006\u0006\u001a\u0004\bk\u0010l\u0082\u0001\u0003nop¨\u0006q"}, m90084d2 = {"Lkotlinx/serialization/json/internal/e;", "Lkotlinx/serialization/internal/o1;", "Lxg0/r;", "Lxg0/a;", JPushConstants.Analysis.KEY_JSON, "Lkotlin/Function1;", "Lkotlinx/serialization/json/JsonElement;", "", "nodeConsumer", "<init>", "(Lxg0/a;Lkotlin/jvm/functions/Function1;)V", "", "tag", "kotlinx/serialization/json/internal/e$b", "Q", "(Ljava/lang/String;)Lkotlinx/serialization/json/internal/e$b;", "Lvg0/f;", "inlineDescriptor", "kotlinx/serialization/json/internal/e$a", "P", "(Ljava/lang/String;Lvg0/f;)Lkotlinx/serialization/json/internal/e$a;", "descriptor", "", "index", "w", "(Lvg0/f;I)Ljava/lang/String;", "element", "b", "(Lkotlinx/serialization/json/JsonElement;)V", "", "shouldEncodeElementDefault", "(Lvg0/f;I)Z", "parentName", "childName", "v", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "key", "R", "(Ljava/lang/String;Lkotlinx/serialization/json/JsonElement;)V", "N", "()Lkotlinx/serialization/json/JsonElement;", "encodeNotNullMark", "()V", "encodeNull", "K", "(Ljava/lang/String;)V", "value", "I", "(Ljava/lang/String;I)V", "", "C", "(Ljava/lang/String;B)V", "", "L", "(Ljava/lang/String;S)V", "", "J", "(Ljava/lang/String;J)V", "", "G", "(Ljava/lang/String;F)V", ExifInterface.GPS_DIRECTION_TRUE, "Ltg0/p;", "serializer", "encodeSerializableValue", "(Ltg0/p;Ljava/lang/Object;)V", "", ExifInterface.LONGITUDE_EAST, "(Ljava/lang/String;D)V", "B", "(Ljava/lang/String;Z)V", "", "D", "(Ljava/lang/String;C)V", "M", "(Ljava/lang/String;Ljava/lang/String;)V", "enumDescriptor", "ordinal", "F", "(Ljava/lang/String;Lvg0/f;I)V", "Lwg0/c;", "H", "(Ljava/lang/String;Lvg0/f;)Lwg0/c;", "encodeInline", "(Lvg0/f;)Lwg0/c;", "Lwg0/b;", "beginStructure", "(Lvg0/f;)Lwg0/b;", "p", "(Lvg0/f;)V", "Lxg0/a;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "()Lxg0/a;", "c", "Lkotlin/jvm/functions/Function1;", "O", "()Lkotlin/jvm/functions/Function1;", "Lxg0/f;", "d", "Lxg0/f;", "configuration", "e", "Ljava/lang/String;", "polymorphicDiscriminator", "f", "polymorphicSerialName", "Lyg0/a;", "getSerializersModule", "()Lyg0/a;", "serializersModule", "Lkotlinx/serialization/json/internal/g0;", "Lkotlinx/serialization/json/internal/k0;", "Lkotlinx/serialization/json/internal/m0;", "kotlinx-serialization-json"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nTreeJsonEncoder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TreeJsonEncoder.kt\nkotlinx/serialization/json/internal/AbstractJsonTreeEncoder\n+ 2 Polymorphic.kt\nkotlinx/serialization/json/internal/PolymorphicKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 WriteMode.kt\nkotlinx/serialization/json/internal/WriteModeKt\n*L\n1#1,280:1\n21#2,12:281\n35#2,13:294\n1#3:293\n36#4,9:307\n*S KotlinDebug\n*F\n+ 1 TreeJsonEncoder.kt\nkotlinx/serialization/json/internal/AbstractJsonTreeEncoder\n*L\n84#1:281,12\n84#1:294,13\n84#1:293\n154#1:307,9\n*E\n"})
public abstract class AbstractC41921e extends AbstractC41860o1 implements InterfaceC46183r {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final AbstractC46162a json;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final Function1<JsonElement, Unit> nodeConsumer;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @JvmField
    @NotNull
    public final JsonConfiguration configuration;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    public String polymorphicDiscriminator;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    public String polymorphicSerialName;

    /* JADX INFO: renamed from: kotlinx.serialization.json.internal.e$a */
    /* JADX INFO: compiled from: TreeJsonEncoder.kt */
    @Metadata(m90083d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u000b"}, m90084d2 = {"kotlinx/serialization/json/internal/e$a", "Lwg0/a;", "", "value", "", "encodeString", "(Ljava/lang/String;)V", "Lyg0/a;", "getSerializersModule", "()Lyg0/a;", "serializersModule", "kotlinx-serialization-json"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
    public static final class a extends AbstractC45828a {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f92105b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ InterfaceC45533f f92106c;

        public a(String str, InterfaceC45533f interfaceC45533f) {
            this.f92105b = str;
            this.f92106c = interfaceC45533f;
        }

        @Override // wg0.InterfaceC45830c
        public AbstractC46494a getSerializersModule() {
            return AbstractC41921e.this.getCn.jiguang.privates.push.constants.JPushConstants.Analysis.KEY_JSON java.lang.String().getSerializersModule();
        }

        @Override // wg0.AbstractC45828a, wg0.InterfaceC45830c
        public void encodeString(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            AbstractC41921e.this.mo91928R(this.f92105b, new C46186u(value, false, this.f92106c));
        }
    }

    /* JADX INFO: renamed from: kotlinx.serialization.json.internal.e$b */
    /* JADX INFO: compiled from: TreeJsonEncoder.kt */
    @Metadata(m90083d1 = {"\u0000?\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\n\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0019\u001a\u00020\u00148\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, m90084d2 = {"kotlinx/serialization/json/internal/e$b", "Lwg0/a;", "", CmcdData.Factory.STREAMING_FORMAT_SS, "", "c", "(Ljava/lang/String;)V", "", "value", "encodeInt", "(I)V", "", "encodeLong", "(J)V", "", "encodeByte", "(B)V", "", "encodeShort", "(S)V", "Lyg0/a;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Lyg0/a;", "getSerializersModule", "()Lyg0/a;", "serializersModule", "kotlinx-serialization-json"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
    public static final class b extends AbstractC45828a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        public final AbstractC46494a serializersModule;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ String f92109c;

        public b(String str) {
            this.f92109c = str;
            this.serializersModule = AbstractC41921e.this.getCn.jiguang.privates.push.constants.JPushConstants.Analysis.KEY_JSON java.lang.String().getSerializersModule();
        }

        /* JADX INFO: renamed from: c */
        public final void m91931c(String s11) {
            Intrinsics.checkNotNullParameter(s11, "s");
            AbstractC41921e.this.mo91928R(this.f92109c, new C46186u(s11, false, null, 4, null));
        }

        @Override // wg0.InterfaceC45830c
        public AbstractC46494a getSerializersModule() {
            return this.serializersModule;
        }

        @Override // wg0.AbstractC45828a, wg0.InterfaceC45830c
        public void encodeByte(byte value) {
            m91931c(UByte.m103906toStringimpl(UByte.m103862constructorimpl(value)));
        }

        @Override // wg0.AbstractC45828a, wg0.InterfaceC45830c
        public void encodeInt(int value) {
            m91931c(Long.toString(((long) UInt.m103939constructorimpl(value)) & KeyboardMap.kValueMask, 10));
        }

        @Override // wg0.AbstractC45828a, wg0.InterfaceC45830c
        public void encodeLong(long value) {
            m91931c(C41927h.m91941a(ULong.m104018constructorimpl(value), 10));
        }

        @Override // wg0.AbstractC45828a, wg0.InterfaceC45830c
        public void encodeShort(short value) {
            m91931c(UShort.m104169toStringimpl(UShort.m104125constructorimpl(value)));
        }
    }

    public /* synthetic */ AbstractC41921e(AbstractC46162a abstractC46162a, Function1 function1, DefaultConstructorMarker defaultConstructorMarker) {
        this(abstractC46162a, function1);
    }

    @NotNull
    /* JADX INFO: renamed from: N */
    public abstract JsonElement mo91924N();

    /* JADX INFO: renamed from: R */
    public abstract void mo91928R(@NotNull String key, @NotNull JsonElement element);

    /* JADX WARN: Multi-variable type inference failed */
    public AbstractC41921e(AbstractC46162a abstractC46162a, Function1<? super JsonElement, Unit> function1) {
        this.json = abstractC46162a;
        this.nodeConsumer = function1;
        this.configuration = abstractC46162a.getConfiguration();
    }

    /* JADX INFO: renamed from: A */
    public static final Unit m91910A(AbstractC41921e abstractC41921e, JsonElement node) {
        Intrinsics.checkNotNullParameter(node, "node");
        abstractC41921e.mo91928R(abstractC41921e.m91478q(), node);
        return Unit.INSTANCE;
    }

    @NotNull
    /* JADX INFO: renamed from: O */
    public final Function1<JsonElement, Unit> m91925O() {
        return this.nodeConsumer;
    }

    /* JADX INFO: renamed from: P */
    public final a m91926P(String tag, InterfaceC45533f inlineDescriptor) {
        return new a(tag, inlineDescriptor);
    }

    /* JADX INFO: renamed from: Q */
    public final b m91927Q(String tag) {
        return new b(tag);
    }

    @Override // xg0.InterfaceC46183r
    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final AbstractC46162a getCn.jiguang.privates.push.constants.JPushConstants.Analysis.KEY_JSON java.lang.String() {
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

    @Override // wg0.InterfaceC45830c
    @NotNull
    public InterfaceC45829b beginStructure(@NotNull InterfaceC45533f descriptor) {
        AbstractC41921e c41938m0;
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Function1<JsonElement, Unit> function1 = m91479r() == null ? this.nodeConsumer : new Function1() { // from class: kotlinx.serialization.json.internal.d
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AbstractC41921e.m91910A(this.f92096b, (JsonElement) obj);
            }
        };
        AbstractC45541n kind = descriptor.getKind();
        if (Intrinsics.areEqual(kind, AbstractC45542o.b.f102631a) || (kind instanceof AbstractC45531d)) {
            c41938m0 = new C41938m0(this.json, function1);
        } else if (Intrinsics.areEqual(kind, AbstractC45542o.c.f102632a)) {
            AbstractC46162a abstractC46162a = this.json;
            InterfaceC45533f interfaceC45533fM91874a = C41916b1.m91874a(descriptor.mo91525d(0), abstractC46162a.getSerializersModule());
            AbstractC45541n kind2 = interfaceC45533fM91874a.getKind();
            if ((kind2 instanceof AbstractC45532e) || Intrinsics.areEqual(kind2, AbstractC45541n.b.f102629a)) {
                c41938m0 = new C41942o0(this.json, function1);
            } else {
                if (!abstractC46162a.getConfiguration().getAllowStructuredMapKeys()) {
                    throw C41915b0.m91864d(interfaceC45533fM91874a);
                }
                c41938m0 = new C41938m0(this.json, function1);
            }
        } else {
            c41938m0 = new C41934k0(this.json, function1);
        }
        String str = this.polymorphicDiscriminator;
        if (str != null) {
            if (c41938m0 instanceof C41942o0) {
                C41942o0 c41942o0 = (C41942o0) c41938m0;
                c41942o0.mo91928R("key", C46174i.m101814c(str));
                String serialName = this.polymorphicSerialName;
                if (serialName == null) {
                    serialName = descriptor.getSerialName();
                }
                c41942o0.mo91928R("value", C46174i.m101814c(serialName));
            } else {
                String serialName2 = this.polymorphicSerialName;
                if (serialName2 == null) {
                    serialName2 = descriptor.getSerialName();
                }
                c41938m0.mo91928R(str, C46174i.m101814c(serialName2));
            }
            this.polymorphicDiscriminator = null;
            this.polymorphicSerialName = null;
        }
        return c41938m0;
    }

    @Override // kotlinx.serialization.internal.AbstractC41792a3, wg0.InterfaceC45830c
    @NotNull
    public InterfaceC45830c encodeInline(@NotNull InterfaceC45533f descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (m91479r() == null) {
            return new C41926g0(this.json, this.nodeConsumer).encodeInline(descriptor);
        }
        if (this.polymorphicDiscriminator != null) {
            this.polymorphicSerialName = descriptor.getSerialName();
        }
        return super.encodeInline(descriptor);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0087  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.AbstractC41792a3, wg0.InterfaceC45830c
    public <T> void encodeSerializableValue(@NotNull InterfaceC44963p<? super T> serializer, T value) {
        String strM91984c;
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        if (m91479r() == null && C41913a1.m91855c(C41916b1.m91874a(serializer.getDescriptor(), getSerializersModule()))) {
            new C41926g0(this.json, this.nodeConsumer).encodeSerializableValue(serializer, value);
            return;
        }
        if (getCn.jiguang.privates.push.constants.JPushConstants.Analysis.KEY_JSON java.lang.String().getConfiguration().getUseArrayPolymorphism()) {
            serializer.serialize(this, value);
            return;
        }
        boolean z11 = serializer instanceof AbstractC41793b;
        if (!z11) {
            int i11 = C41944p0.a.$EnumSwitchMapping$0[getCn.jiguang.privates.push.constants.JPushConstants.Analysis.KEY_JSON java.lang.String().getConfiguration().getClassDiscriminatorMode().ordinal()];
            if (i11 != 1 && i11 != 2) {
                if (i11 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                AbstractC45541n kind = serializer.getDescriptor().getKind();
                strM91984c = (Intrinsics.areEqual(kind, AbstractC45542o.a.f102630a) || Intrinsics.areEqual(kind, AbstractC45542o.d.f102633a)) ? C41944p0.m91984c(serializer.getDescriptor(), getCn.jiguang.privates.push.constants.JPushConstants.Analysis.KEY_JSON java.lang.String()) : null;
            }
        } else if (getCn.jiguang.privates.push.constants.JPushConstants.Analysis.KEY_JSON java.lang.String().getConfiguration().getClassDiscriminatorMode() != ClassDiscriminatorMode.NONE) {
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

    @Override // wg0.InterfaceC45830c
    @NotNull
    public final AbstractC46494a getSerializersModule() {
        return this.json.getSerializersModule();
    }

    @Override // kotlinx.serialization.internal.AbstractC41792a3
    /* JADX INFO: renamed from: p */
    public void mo91477p(@NotNull InterfaceC45533f descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        this.nodeConsumer.invoke(mo91924N());
    }

    @Override // wg0.InterfaceC45829b
    public boolean shouldEncodeElementDefault(@NotNull InterfaceC45533f descriptor, int index) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return this.configuration.getEncodeDefaults();
    }

    @Override // kotlinx.serialization.internal.AbstractC41860o1
    @NotNull
    /* JADX INFO: renamed from: v */
    public String mo91667v(@NotNull String parentName, @NotNull String childName) {
        Intrinsics.checkNotNullParameter(parentName, "parentName");
        Intrinsics.checkNotNullParameter(childName, "childName");
        return childName;
    }

    @Override // kotlinx.serialization.internal.AbstractC41860o1
    @NotNull
    /* JADX INFO: renamed from: w */
    public String mo91668w(@NotNull InterfaceC45533f descriptor, int index) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return C41920d0.m91904h(descriptor, this.json, index);
    }

    @Override // kotlinx.serialization.internal.AbstractC41792a3
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public void mo91466e(@NotNull String tag, boolean value) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        mo91928R(tag, C46174i.m101812a(Boolean.valueOf(value)));
    }

    @Override // kotlinx.serialization.internal.AbstractC41792a3
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public void mo91467f(@NotNull String tag, byte value) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        mo91928R(tag, C46174i.m101813b(Byte.valueOf(value)));
    }

    @Override // kotlinx.serialization.internal.AbstractC41792a3
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public void mo91468g(@NotNull String tag, char value) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        mo91928R(tag, C46174i.m101814c(String.valueOf(value)));
    }

    @Override // kotlinx.serialization.internal.AbstractC41792a3
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public void mo91469h(@NotNull String tag, double value) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        mo91928R(tag, C46174i.m101813b(Double.valueOf(value)));
        if (!this.configuration.getAllowSpecialFloatingPointValues()) {
            if (!Double.isInfinite(value) && !Double.isNaN(value)) {
            } else {
                throw C41915b0.m91863c(Double.valueOf(value), tag, mo91924N().toString());
            }
        }
    }

    @Override // kotlinx.serialization.internal.AbstractC41792a3
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public void mo91470i(@NotNull String tag, @NotNull InterfaceC45533f enumDescriptor, int ordinal) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(enumDescriptor, "enumDescriptor");
        mo91928R(tag, C46174i.m101814c(enumDescriptor.mo91527f(ordinal)));
    }

    @Override // kotlinx.serialization.internal.AbstractC41792a3
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public void mo91471j(@NotNull String tag, float value) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        mo91928R(tag, C46174i.m101813b(Float.valueOf(value)));
        if (!this.configuration.getAllowSpecialFloatingPointValues()) {
            if (!Float.isInfinite(value) && !Float.isNaN(value)) {
            } else {
                throw C41915b0.m91863c(Float.valueOf(value), tag, mo91924N().toString());
            }
        }
    }

    @Override // kotlinx.serialization.internal.AbstractC41792a3
    @NotNull
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public InterfaceC45830c mo91472k(@NotNull String tag, @NotNull InterfaceC45533f inlineDescriptor) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(inlineDescriptor, "inlineDescriptor");
        if (C41952t0.m92009b(inlineDescriptor)) {
            return m91927Q(tag);
        }
        if (C41952t0.m92008a(inlineDescriptor)) {
            return m91926P(tag, inlineDescriptor);
        }
        return super.mo91472k(tag, inlineDescriptor);
    }

    @Override // kotlinx.serialization.internal.AbstractC41792a3
    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public void mo91473l(@NotNull String tag, int value) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        mo91928R(tag, C46174i.m101813b(Integer.valueOf(value)));
    }

    @Override // kotlinx.serialization.internal.AbstractC41792a3
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public void mo91474m(@NotNull String tag, long value) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        mo91928R(tag, C46174i.m101813b(Long.valueOf(value)));
    }

    /* JADX INFO: renamed from: K */
    public void m91921K(@NotNull String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        mo91928R(tag, C41910a.INSTANCE);
    }

    @Override // kotlinx.serialization.internal.AbstractC41792a3
    /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
    public void mo91475n(@NotNull String tag, short value) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        mo91928R(tag, C46174i.m101813b(Short.valueOf(value)));
    }

    @Override // kotlinx.serialization.internal.AbstractC41792a3
    /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
    public void mo91476o(@NotNull String tag, @NotNull String value) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(value, "value");
        mo91928R(tag, C46174i.m101814c(value));
    }

    @Override // wg0.InterfaceC45830c
    public void encodeNull() {
        String strM91479r = m91479r();
        if (strM91479r == null) {
            this.nodeConsumer.invoke(C41910a.INSTANCE);
        } else {
            m91921K(strM91479r);
        }
    }

    @Override // wg0.InterfaceC45830c
    public void encodeNotNullMark() {
    }
}
