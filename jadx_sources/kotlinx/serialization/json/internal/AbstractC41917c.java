package kotlinx.serialization.json.internal;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.exifinterface.media.ExifInterface;
import androidx.media3.exoplayer.upstream.CmcdData;
import cn.jiguang.privates.push.constants.JPushConstants;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.InterfaceC41787b;
import kotlinx.serialization.internal.AbstractC41793b;
import kotlinx.serialization.internal.AbstractC41855n1;
import kotlinx.serialization.json.C41910a;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.KotlinNothingValueException;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmField;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;
import tg0.C44956i;
import tg0.InterfaceC44949c;
import vg0.AbstractC45531d;
import vg0.AbstractC45532e;
import vg0.AbstractC45541n;
import vg0.AbstractC45542o;
import vg0.InterfaceC45533f;
import xg0.AbstractC46162a;
import xg0.C46174i;
import xg0.C46186u;
import xg0.InterfaceC46172g;
import xg0.JsonConfiguration;
import yg0.AbstractC46494a;

/* JADX INFO: renamed from: kotlinx.serialization.json.internal.c */
/* JADX INFO: compiled from: TreeJsonDecoder.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000´\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0001\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\n\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\f\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b2\u0018\u00002\u00020\u00012\u00020\u0002B%\b\u0004\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ'\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0005H\u0004¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0017\u0010\u0013J#\u0010\u001b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00182\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010\u001f\u001a\u00020\u00072\u0006\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010$\u001a\u00020#2\u0006\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b$\u0010%J\u0017\u0010'\u001a\u00020&2\u0006\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b'\u0010(J\u000f\u0010*\u001a\u00020)H\u0016¢\u0006\u0004\b*\u0010+J\u0017\u0010,\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u0007H$¢\u0006\u0004\b,\u0010-J\u001f\u00100\u001a\u00020/2\u0006\u0010\u000e\u001a\u00020\u00072\u0006\u0010.\u001a\u00020!H\u0014¢\u0006\u0004\b0\u00101J\u0017\u00102\u001a\u00020)2\u0006\u0010\u000e\u001a\u00020\u0007H\u0014¢\u0006\u0004\b2\u00103J\u0017\u00105\u001a\u0002042\u0006\u0010\u000e\u001a\u00020\u0007H\u0014¢\u0006\u0004\b5\u00106J\u0017\u00108\u001a\u0002072\u0006\u0010\u000e\u001a\u00020\u0007H\u0014¢\u0006\u0004\b8\u00109J\u0017\u0010:\u001a\u00020/2\u0006\u0010\u000e\u001a\u00020\u0007H\u0014¢\u0006\u0004\b:\u0010;J\u0017\u0010=\u001a\u00020<2\u0006\u0010\u000e\u001a\u00020\u0007H\u0014¢\u0006\u0004\b=\u0010>J\u0017\u0010@\u001a\u00020?2\u0006\u0010\u000e\u001a\u00020\u0007H\u0014¢\u0006\u0004\b@\u0010AJ\u0017\u0010C\u001a\u00020B2\u0006\u0010\u000e\u001a\u00020\u0007H\u0014¢\u0006\u0004\bC\u0010DJ\u0017\u0010F\u001a\u00020E2\u0006\u0010\u000e\u001a\u00020\u0007H\u0014¢\u0006\u0004\bF\u0010GJ\u0017\u0010H\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u0007H\u0014¢\u0006\u0004\bH\u0010\u0016J\u001f\u0010K\u001a\u00020J2\u0006\u0010\u000e\u001a\u00020\u00072\u0006\u0010I\u001a\u00020!H\u0014¢\u0006\u0004\bK\u0010LJ\u0017\u0010M\u001a\u00020J2\u0006\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\bM\u0010NR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\bO\u0010P\u001a\u0004\bQ\u0010RR\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\bS\u0010T\u001a\u0004\b\u0018\u0010\u0013R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0004X\u0084\u0004¢\u0006\f\n\u0004\bU\u0010V\u001a\u0004\bW\u0010XR\u0014\u0010\\\u001a\u00020Y8\u0004X\u0085\u0004¢\u0006\u0006\n\u0004\bZ\u0010[R\u0014\u0010`\u001a\u00020]8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b^\u0010_\u0082\u0001\u0003abc¨\u0006d"}, m90084d2 = {"Lkotlinx/serialization/json/internal/c;", "Lkotlinx/serialization/internal/n1;", "Lxg0/g;", "Lxg0/a;", JPushConstants.Analysis.KEY_JSON, "Lkotlinx/serialization/json/JsonElement;", "value", "", "polymorphicDiscriminator", "<init>", "(Lxg0/a;Lkotlinx/serialization/json/JsonElement;Ljava/lang/String;)V", "Lkotlinx/serialization/json/JsonPrimitive;", "literal", "primitive", "tag", "", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "(Lkotlinx/serialization/json/JsonPrimitive;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Void;", "G", "()Lkotlinx/serialization/json/JsonElement;", "currentTag", "U", "(Ljava/lang/String;)Ljava/lang/String;", "b", ExifInterface.GPS_DIRECTION_TRUE, "Ltg0/c;", "deserializer", "decodeSerializableValue", "(Ltg0/c;)Ljava/lang/Object;", "parentName", "childName", "y", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "Lvg0/f;", "descriptor", "Lkotlinx/serialization/encoding/CompositeDecoder;", "beginStructure", "(Lvg0/f;)Lkotlinx/serialization/encoding/CompositeDecoder;", "", "endStructure", "(Lvg0/f;)V", "", "decodeNotNullMark", "()Z", "F", "(Ljava/lang/String;)Lkotlinx/serialization/json/JsonElement;", "enumDescriptor", "", "L", "(Ljava/lang/String;Lvg0/f;)I", "H", "(Ljava/lang/String;)Z", "", "I", "(Ljava/lang/String;)B", "", "Q", "(Ljava/lang/String;)S", "O", "(Ljava/lang/String;)I", "", "P", "(Ljava/lang/String;)J", "", "M", "(Ljava/lang/String;)F", "", "K", "(Ljava/lang/String;)D", "", "J", "(Ljava/lang/String;)C", "R", "inlineDescriptor", "Lkotlinx/serialization/encoding/b;", "N", "(Ljava/lang/String;Lvg0/f;)Lkotlinx/serialization/encoding/b;", "decodeInline", "(Lvg0/f;)Lkotlinx/serialization/encoding/b;", "c", "Lxg0/a;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "()Lxg0/a;", "d", "Lkotlinx/serialization/json/JsonElement;", "e", "Ljava/lang/String;", ExifInterface.LATITUDE_SOUTH, "()Ljava/lang/String;", "Lxg0/f;", "f", "Lxg0/f;", "configuration", "Lyg0/a;", "getSerializersModule", "()Lyg0/a;", "serializersModule", "Lkotlinx/serialization/json/internal/f0;", "Lkotlinx/serialization/json/internal/j0;", "Lkotlinx/serialization/json/internal/l0;", "kotlinx-serialization-json"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nTreeJsonDecoder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TreeJsonDecoder.kt\nkotlinx/serialization/json/internal/AbstractJsonTreeDecoder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Polymorphic.kt\nkotlinx/serialization/json/internal/PolymorphicKt\n+ 4 TreeJsonEncoder.kt\nkotlinx/serialization/json/internal/TreeJsonEncoderKt\n+ 5 WriteMode.kt\nkotlinx/serialization/json/internal/WriteModeKt\n*L\n1#1,334:1\n74#1:359\n74#1:373\n74#1:384\n74#1:394\n75#1:419\n75#1:428\n85#1:437\n75#1:438\n88#1:447\n75#1:448\n89#1,5:457\n88#1:462\n75#1:463\n89#1,5:472\n88#1:477\n75#1:478\n89#1,5:487\n88#1:492\n75#1:493\n89#1,5:502\n88#1:507\n75#1:508\n89#1,5:517\n88#1:522\n75#1:523\n89#1,5:532\n88#1:537\n75#1:538\n89#1,5:547\n88#1:552\n75#1:553\n89#1,5:562\n75#1:567\n85#1:576\n75#1:577\n1#2:335\n76#3,6:336\n82#3,9:350\n271#4,8:342\n271#4,8:360\n271#4,8:374\n271#4,8:385\n271#4,8:395\n271#4,8:403\n271#4,8:411\n271#4,8:420\n271#4,8:429\n271#4,8:439\n271#4,8:449\n271#4,8:464\n271#4,8:479\n271#4,8:494\n271#4,8:509\n271#4,8:524\n271#4,8:539\n271#4,8:554\n271#4,8:568\n271#4,8:578\n36#5,5:368\n41#5,2:382\n44#5:393\n*S KotlinDebug\n*F\n+ 1 TreeJsonDecoder.kt\nkotlinx/serialization/json/internal/AbstractJsonTreeDecoder\n*L\n64#1:359\n67#1:373\n68#1:384\n70#1:394\n85#1:419\n88#1:428\n105#1:437\n105#1:438\n112#1:447\n112#1:448\n112#1:457,5\n114#1:462\n114#1:463\n114#1:472,5\n120#1:477\n120#1:478\n120#1:487,5\n126#1:492\n126#1:493\n126#1:502,5\n127#1:507\n127#1:508\n127#1:517,5\n130#1:522\n130#1:523\n130#1:532,5\n137#1:537\n137#1:538\n137#1:547,5\n143#1:552\n143#1:553\n143#1:562,5\n146#1:567\n159#1:576\n159#1:577\n56#1:336,6\n56#1:350,9\n56#1:342,8\n64#1:360,8\n67#1:374,8\n68#1:385,8\n70#1:395,8\n74#1:403,8\n75#1:411,8\n85#1:420,8\n88#1:429,8\n105#1:439,8\n112#1:449,8\n114#1:464,8\n120#1:479,8\n126#1:494,8\n127#1:509,8\n130#1:524,8\n137#1:539,8\n143#1:554,8\n146#1:568,8\n159#1:578,8\n65#1:368,5\n65#1:382,2\n65#1:393\n*E\n"})
public abstract class AbstractC41917c extends AbstractC41855n1 implements InterfaceC46172g {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final AbstractC46162a json;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final JsonElement value;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    public final String polymorphicDiscriminator;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @JvmField
    @NotNull
    public final JsonConfiguration configuration;

    public /* synthetic */ AbstractC41917c(AbstractC46162a abstractC46162a, JsonElement jsonElement, String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(abstractC46162a, jsonElement, str);
    }

    @NotNull
    /* JADX INFO: renamed from: F */
    public abstract JsonElement mo91878F(@NotNull String tag);

    @NotNull
    /* JADX INFO: renamed from: T */
    public abstract JsonElement mo91892T();

    /* JADX INFO: renamed from: V */
    public final Void m91894V(JsonPrimitive literal, String primitive, String tag) {
        StringBuilder sb2;
        String str;
        if (StringsKt.startsWith$default(primitive, "i", false, 2, (Object) null)) {
            sb2 = new StringBuilder();
            str = "an ";
        } else {
            sb2 = new StringBuilder();
            str = "a ";
        }
        sb2.append(str);
        sb2.append(primitive);
        throw C41915b0.m91866f(-1, "Failed to parse literal '" + literal + "' as " + sb2.toString() + " value at element: " + m91893U(tag), m91879G().toString());
    }

    public /* synthetic */ AbstractC41917c(AbstractC46162a abstractC46162a, JsonElement jsonElement, String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(abstractC46162a, jsonElement, (i11 & 4) != 0 ? null : str, null);
    }

    @Nullable
    /* JADX INFO: renamed from: S, reason: from getter */
    public final String getPolymorphicDiscriminator() {
        return this.polymorphicDiscriminator;
    }

    @NotNull
    /* JADX INFO: renamed from: U */
    public final String m91893U(@NotNull String currentTag) {
        Intrinsics.checkNotNullParameter(currentTag, "currentTag");
        return m91650C() + '.' + currentTag;
    }

    @Override // xg0.InterfaceC46172g
    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public AbstractC46162a getJson() {
        return this.json;
    }

    @Override // kotlinx.serialization.encoding.InterfaceC41787b
    @NotNull
    public CompositeDecoder beginStructure(@NotNull InterfaceC45533f descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        JsonElement jsonElementM91879G = m91879G();
        AbstractC45541n kind = descriptor.getKind();
        if (Intrinsics.areEqual(kind, AbstractC45542o.b.f102631a) || (kind instanceof AbstractC45531d)) {
            AbstractC46162a json = getJson();
            String serialName = descriptor.getSerialName();
            if (jsonElementM91879G instanceof JsonArray) {
                return new C41936l0(json, (JsonArray) jsonElementM91879G);
            }
            throw C41915b0.m91866f(-1, "Expected " + Reflection.getOrCreateKotlinClass(JsonArray.class).getSimpleName() + ", but had " + Reflection.getOrCreateKotlinClass(jsonElementM91879G.getClass()).getSimpleName() + " as the serialized body of " + serialName + " at element: " + m91650C(), jsonElementM91879G.toString());
        }
        if (!Intrinsics.areEqual(kind, AbstractC45542o.c.f102632a)) {
            AbstractC46162a json2 = getJson();
            String serialName2 = descriptor.getSerialName();
            if (jsonElementM91879G instanceof JsonObject) {
                return new C41932j0(json2, (JsonObject) jsonElementM91879G, this.polymorphicDiscriminator, null, 8, null);
            }
            throw C41915b0.m91866f(-1, "Expected " + Reflection.getOrCreateKotlinClass(JsonObject.class).getSimpleName() + ", but had " + Reflection.getOrCreateKotlinClass(jsonElementM91879G.getClass()).getSimpleName() + " as the serialized body of " + serialName2 + " at element: " + m91650C(), jsonElementM91879G.toString());
        }
        AbstractC46162a json3 = getJson();
        InterfaceC45533f interfaceC45533fM91874a = C41916b1.m91874a(descriptor.mo91525d(0), json3.getSerializersModule());
        AbstractC45541n kind2 = interfaceC45533fM91874a.getKind();
        if ((kind2 instanceof AbstractC45532e) || Intrinsics.areEqual(kind2, AbstractC45541n.b.f102629a)) {
            AbstractC46162a json4 = getJson();
            String serialName3 = descriptor.getSerialName();
            if (jsonElementM91879G instanceof JsonObject) {
                return new C41940n0(json4, (JsonObject) jsonElementM91879G);
            }
            throw C41915b0.m91866f(-1, "Expected " + Reflection.getOrCreateKotlinClass(JsonObject.class).getSimpleName() + ", but had " + Reflection.getOrCreateKotlinClass(jsonElementM91879G.getClass()).getSimpleName() + " as the serialized body of " + serialName3 + " at element: " + m91650C(), jsonElementM91879G.toString());
        }
        if (!json3.getConfiguration().getAllowStructuredMapKeys()) {
            throw C41915b0.m91864d(interfaceC45533fM91874a);
        }
        AbstractC46162a json5 = getJson();
        String serialName4 = descriptor.getSerialName();
        if (jsonElementM91879G instanceof JsonArray) {
            return new C41936l0(json5, (JsonArray) jsonElementM91879G);
        }
        throw C41915b0.m91866f(-1, "Expected " + Reflection.getOrCreateKotlinClass(JsonArray.class).getSimpleName() + ", but had " + Reflection.getOrCreateKotlinClass(jsonElementM91879G.getClass()).getSimpleName() + " as the serialized body of " + serialName4 + " at element: " + m91650C(), jsonElementM91879G.toString());
    }

    @Override // kotlinx.serialization.internal.AbstractC41909z2, kotlinx.serialization.encoding.InterfaceC41787b
    @NotNull
    public InterfaceC41787b decodeInline(@NotNull InterfaceC45533f descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return m91770s() != null ? super.decodeInline(descriptor) : new C41924f0(getJson(), mo91892T(), this.polymorphicDiscriminator).decodeInline(descriptor);
    }

    @Override // kotlinx.serialization.internal.AbstractC41909z2, kotlinx.serialization.encoding.InterfaceC41787b
    public <T> T decodeSerializableValue(@NotNull InterfaceC44949c<? extends T> deserializer) {
        JsonPrimitive jsonPrimitiveM101823l;
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        if (!(deserializer instanceof AbstractC41793b) || getJson().getConfiguration().getUseArrayPolymorphism()) {
            return deserializer.deserialize(this);
        }
        AbstractC41793b abstractC41793b = (AbstractC41793b) deserializer;
        String strM91984c = C41944p0.m91984c(abstractC41793b.getDescriptor(), getJson());
        JsonElement jsonElementMo91896b = mo91896b();
        String serialName = abstractC41793b.getDescriptor().getSerialName();
        if (jsonElementMo91896b instanceof JsonObject) {
            JsonObject jsonObject = (JsonObject) jsonElementMo91896b;
            JsonElement jsonElement = (JsonElement) jsonObject.get(strM91984c);
            try {
                InterfaceC44949c interfaceC44949cM99414a = C44956i.m99414a((AbstractC41793b) deserializer, this, (jsonElement == null || (jsonPrimitiveM101823l = C46174i.m101823l(jsonElement)) == null) ? null : C46174i.m101817f(jsonPrimitiveM101823l));
                Intrinsics.checkNotNull(interfaceC44949cM99414a, "null cannot be cast to non-null type kotlinx.serialization.DeserializationStrategy<T of kotlinx.serialization.json.internal.PolymorphicKt.decodeSerializableValuePolymorphic>");
                return (T) C41962y0.m92021b(getJson(), strM91984c, jsonObject, interfaceC44949cM99414a);
            } catch (SerializationException e11) {
                String message = e11.getMessage();
                Intrinsics.checkNotNull(message);
                throw C41915b0.m91866f(-1, message, jsonObject.toString());
            }
        }
        throw C41915b0.m91866f(-1, "Expected " + Reflection.getOrCreateKotlinClass(JsonObject.class).getSimpleName() + ", but had " + Reflection.getOrCreateKotlinClass(jsonElementMo91896b.getClass()).getSimpleName() + " as the serialized body of " + serialName + " at element: " + m91650C(), jsonElementMo91896b.toString());
    }

    @Override // kotlinx.serialization.encoding.CompositeDecoder
    public void endStructure(@NotNull InterfaceC45533f descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
    }

    @Override // kotlinx.serialization.internal.AbstractC41855n1
    @NotNull
    /* JADX INFO: renamed from: y */
    public String mo91652y(@NotNull String parentName, @NotNull String childName) {
        Intrinsics.checkNotNullParameter(parentName, "parentName");
        Intrinsics.checkNotNullParameter(childName, "childName");
        return childName;
    }

    public AbstractC41917c(AbstractC46162a abstractC46162a, JsonElement jsonElement, String str) {
        this.json = abstractC46162a;
        this.value = jsonElement;
        this.polymorphicDiscriminator = str;
        this.configuration = getJson().getConfiguration();
    }

    @NotNull
    /* JADX INFO: renamed from: G */
    public final JsonElement m91879G() {
        JsonElement jsonElementMo91878F;
        String strM91770s = m91770s();
        if (strM91770s != null && (jsonElementMo91878F = mo91878F(strM91770s)) != null) {
            return jsonElementMo91878F;
        }
        return mo91892T();
    }

    @Override // kotlinx.serialization.internal.AbstractC41909z2
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public boolean mo91759h(@NotNull String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        JsonElement jsonElementMo91878F = mo91878F(tag);
        if (jsonElementMo91878F instanceof JsonPrimitive) {
            JsonPrimitive jsonPrimitive = (JsonPrimitive) jsonElementMo91878F;
            try {
                Boolean boolM101816e = C46174i.m101816e(jsonPrimitive);
                if (boolM101816e != null) {
                    return boolM101816e.booleanValue();
                }
                m91894V(jsonPrimitive, TypedValues.Custom.S_BOOLEAN, tag);
                throw new KotlinNothingValueException();
            } catch (IllegalArgumentException unused) {
                m91894V(jsonPrimitive, TypedValues.Custom.S_BOOLEAN, tag);
                throw new KotlinNothingValueException();
            }
        }
        throw C41915b0.m91866f(-1, "Expected " + Reflection.getOrCreateKotlinClass(JsonPrimitive.class).getSimpleName() + ", but had " + Reflection.getOrCreateKotlinClass(jsonElementMo91878F.getClass()).getSimpleName() + " as the serialized body of " + TypedValues.Custom.S_BOOLEAN + " at element: " + m91893U(tag), jsonElementMo91878F.toString());
    }

    @Override // kotlinx.serialization.internal.AbstractC41909z2
    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public byte mo91760i(@NotNull String tag) {
        Byte bValueOf;
        Intrinsics.checkNotNullParameter(tag, "tag");
        JsonElement jsonElementMo91878F = mo91878F(tag);
        if (jsonElementMo91878F instanceof JsonPrimitive) {
            JsonPrimitive jsonPrimitive = (JsonPrimitive) jsonElementMo91878F;
            try {
                int iM101821j = C46174i.m101821j(jsonPrimitive);
                if (-128 <= iM101821j && iM101821j <= 127) {
                    bValueOf = Byte.valueOf((byte) iM101821j);
                } else {
                    bValueOf = null;
                }
                if (bValueOf != null) {
                    return bValueOf.byteValue();
                }
                m91894V(jsonPrimitive, "byte", tag);
                throw new KotlinNothingValueException();
            } catch (IllegalArgumentException unused) {
                m91894V(jsonPrimitive, "byte", tag);
                throw new KotlinNothingValueException();
            }
        }
        throw C41915b0.m91866f(-1, "Expected " + Reflection.getOrCreateKotlinClass(JsonPrimitive.class).getSimpleName() + ", but had " + Reflection.getOrCreateKotlinClass(jsonElementMo91878F.getClass()).getSimpleName() + " as the serialized body of byte at element: " + m91893U(tag), jsonElementMo91878F.toString());
    }

    @Override // kotlinx.serialization.internal.AbstractC41909z2
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public char mo91761j(@NotNull String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        JsonElement jsonElementMo91878F = mo91878F(tag);
        if (jsonElementMo91878F instanceof JsonPrimitive) {
            JsonPrimitive jsonPrimitive = (JsonPrimitive) jsonElementMo91878F;
            try {
                return StringsKt.single(jsonPrimitive.getContent());
            } catch (IllegalArgumentException unused) {
                m91894V(jsonPrimitive, "char", tag);
                throw new KotlinNothingValueException();
            }
        }
        throw C41915b0.m91866f(-1, "Expected " + Reflection.getOrCreateKotlinClass(JsonPrimitive.class).getSimpleName() + ", but had " + Reflection.getOrCreateKotlinClass(jsonElementMo91878F.getClass()).getSimpleName() + " as the serialized body of char at element: " + m91893U(tag), jsonElementMo91878F.toString());
    }

    @Override // kotlinx.serialization.internal.AbstractC41909z2
    /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
    public double mo91762k(@NotNull String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        JsonElement jsonElementMo91878F = mo91878F(tag);
        if (jsonElementMo91878F instanceof JsonPrimitive) {
            JsonPrimitive jsonPrimitive = (JsonPrimitive) jsonElementMo91878F;
            try {
                double dM101818g = C46174i.m101818g(jsonPrimitive);
                if (!getJson().getConfiguration().getAllowSpecialFloatingPointValues()) {
                    if (!Double.isInfinite(dM101818g) && !Double.isNaN(dM101818g)) {
                        return dM101818g;
                    }
                    throw C41915b0.m91861a(Double.valueOf(dM101818g), tag, m91879G().toString());
                }
                return dM101818g;
            } catch (IllegalArgumentException unused) {
                m91894V(jsonPrimitive, "double", tag);
                throw new KotlinNothingValueException();
            }
        }
        throw C41915b0.m91866f(-1, "Expected " + Reflection.getOrCreateKotlinClass(JsonPrimitive.class).getSimpleName() + ", but had " + Reflection.getOrCreateKotlinClass(jsonElementMo91878F.getClass()).getSimpleName() + " as the serialized body of double at element: " + m91893U(tag), jsonElementMo91878F.toString());
    }

    @Override // kotlinx.serialization.internal.AbstractC41909z2
    /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
    public int mo91763l(@NotNull String tag, @NotNull InterfaceC45533f enumDescriptor) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(enumDescriptor, "enumDescriptor");
        AbstractC46162a json = getJson();
        JsonElement jsonElementMo91878F = mo91878F(tag);
        String serialName = enumDescriptor.getSerialName();
        if (jsonElementMo91878F instanceof JsonPrimitive) {
            return C41920d0.m91907k(enumDescriptor, json, ((JsonPrimitive) jsonElementMo91878F).getContent(), null, 4, null);
        }
        throw C41915b0.m91866f(-1, "Expected " + Reflection.getOrCreateKotlinClass(JsonPrimitive.class).getSimpleName() + ", but had " + Reflection.getOrCreateKotlinClass(jsonElementMo91878F.getClass()).getSimpleName() + " as the serialized body of " + serialName + " at element: " + m91893U(tag), jsonElementMo91878F.toString());
    }

    @Override // kotlinx.serialization.internal.AbstractC41909z2
    /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
    public float mo91764m(@NotNull String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        JsonElement jsonElementMo91878F = mo91878F(tag);
        if (jsonElementMo91878F instanceof JsonPrimitive) {
            JsonPrimitive jsonPrimitive = (JsonPrimitive) jsonElementMo91878F;
            try {
                float fM101820i = C46174i.m101820i(jsonPrimitive);
                if (!getJson().getConfiguration().getAllowSpecialFloatingPointValues()) {
                    if (!Float.isInfinite(fM101820i) && !Float.isNaN(fM101820i)) {
                        return fM101820i;
                    }
                    throw C41915b0.m91861a(Float.valueOf(fM101820i), tag, m91879G().toString());
                }
                return fM101820i;
            } catch (IllegalArgumentException unused) {
                m91894V(jsonPrimitive, TypedValues.Custom.S_FLOAT, tag);
                throw new KotlinNothingValueException();
            }
        }
        throw C41915b0.m91866f(-1, "Expected " + Reflection.getOrCreateKotlinClass(JsonPrimitive.class).getSimpleName() + ", but had " + Reflection.getOrCreateKotlinClass(jsonElementMo91878F.getClass()).getSimpleName() + " as the serialized body of " + TypedValues.Custom.S_FLOAT + " at element: " + m91893U(tag), jsonElementMo91878F.toString());
    }

    @Override // kotlinx.serialization.internal.AbstractC41909z2
    @NotNull
    /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
    public InterfaceC41787b mo91765n(@NotNull String tag, @NotNull InterfaceC45533f inlineDescriptor) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(inlineDescriptor, "inlineDescriptor");
        if (C41952t0.m92009b(inlineDescriptor)) {
            AbstractC46162a json = getJson();
            JsonElement jsonElementMo91878F = mo91878F(tag);
            String serialName = inlineDescriptor.getSerialName();
            if (jsonElementMo91878F instanceof JsonPrimitive) {
                return new C41912a0(C41956v0.m92012a(json, ((JsonPrimitive) jsonElementMo91878F).getContent()), getJson());
            }
            throw C41915b0.m91866f(-1, "Expected " + Reflection.getOrCreateKotlinClass(JsonPrimitive.class).getSimpleName() + ", but had " + Reflection.getOrCreateKotlinClass(jsonElementMo91878F.getClass()).getSimpleName() + " as the serialized body of " + serialName + " at element: " + m91893U(tag), jsonElementMo91878F.toString());
        }
        return super.mo91765n(tag, inlineDescriptor);
    }

    @Override // kotlinx.serialization.internal.AbstractC41909z2
    /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
    public int mo91766o(@NotNull String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        JsonElement jsonElementMo91878F = mo91878F(tag);
        if (jsonElementMo91878F instanceof JsonPrimitive) {
            JsonPrimitive jsonPrimitive = (JsonPrimitive) jsonElementMo91878F;
            try {
                return C46174i.m101821j(jsonPrimitive);
            } catch (IllegalArgumentException unused) {
                m91894V(jsonPrimitive, "int", tag);
                throw new KotlinNothingValueException();
            }
        }
        throw C41915b0.m91866f(-1, "Expected " + Reflection.getOrCreateKotlinClass(JsonPrimitive.class).getSimpleName() + ", but had " + Reflection.getOrCreateKotlinClass(jsonElementMo91878F.getClass()).getSimpleName() + " as the serialized body of int at element: " + m91893U(tag), jsonElementMo91878F.toString());
    }

    @Override // kotlinx.serialization.internal.AbstractC41909z2
    /* JADX INFO: renamed from: P, reason: merged with bridge method [inline-methods] */
    public long mo91767p(@NotNull String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        JsonElement jsonElementMo91878F = mo91878F(tag);
        if (jsonElementMo91878F instanceof JsonPrimitive) {
            JsonPrimitive jsonPrimitive = (JsonPrimitive) jsonElementMo91878F;
            try {
                return C46174i.m101825n(jsonPrimitive);
            } catch (IllegalArgumentException unused) {
                m91894V(jsonPrimitive, "long", tag);
                throw new KotlinNothingValueException();
            }
        }
        throw C41915b0.m91866f(-1, "Expected " + Reflection.getOrCreateKotlinClass(JsonPrimitive.class).getSimpleName() + ", but had " + Reflection.getOrCreateKotlinClass(jsonElementMo91878F.getClass()).getSimpleName() + " as the serialized body of long at element: " + m91893U(tag), jsonElementMo91878F.toString());
    }

    @Override // kotlinx.serialization.internal.AbstractC41909z2
    /* JADX INFO: renamed from: Q, reason: merged with bridge method [inline-methods] */
    public short mo91768q(@NotNull String tag) {
        Short shValueOf;
        Intrinsics.checkNotNullParameter(tag, "tag");
        JsonElement jsonElementMo91878F = mo91878F(tag);
        if (jsonElementMo91878F instanceof JsonPrimitive) {
            JsonPrimitive jsonPrimitive = (JsonPrimitive) jsonElementMo91878F;
            try {
                int iM101821j = C46174i.m101821j(jsonPrimitive);
                if (-32768 <= iM101821j && iM101821j <= 32767) {
                    shValueOf = Short.valueOf((short) iM101821j);
                } else {
                    shValueOf = null;
                }
                if (shValueOf != null) {
                    return shValueOf.shortValue();
                }
                m91894V(jsonPrimitive, "short", tag);
                throw new KotlinNothingValueException();
            } catch (IllegalArgumentException unused) {
                m91894V(jsonPrimitive, "short", tag);
                throw new KotlinNothingValueException();
            }
        }
        throw C41915b0.m91866f(-1, "Expected " + Reflection.getOrCreateKotlinClass(JsonPrimitive.class).getSimpleName() + ", but had " + Reflection.getOrCreateKotlinClass(jsonElementMo91878F.getClass()).getSimpleName() + " as the serialized body of short at element: " + m91893U(tag), jsonElementMo91878F.toString());
    }

    @Override // kotlinx.serialization.internal.AbstractC41909z2
    @NotNull
    /* JADX INFO: renamed from: R, reason: merged with bridge method [inline-methods] */
    public String mo91769r(@NotNull String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        JsonElement jsonElementMo91878F = mo91878F(tag);
        if (jsonElementMo91878F instanceof JsonPrimitive) {
            JsonPrimitive jsonPrimitive = (JsonPrimitive) jsonElementMo91878F;
            if (jsonPrimitive instanceof C46186u) {
                C46186u c46186u = (C46186u) jsonPrimitive;
                if (!c46186u.getIsString() && !getJson().getConfiguration().getIsLenient()) {
                    throw C41915b0.m91866f(-1, "String literal for key '" + tag + "' should be quoted at element: " + m91893U(tag) + ".\nUse 'isLenient = true' in 'Json {}' builder to accept non-compliant JSON.", m91879G().toString());
                }
                return c46186u.getContent();
            }
            throw C41915b0.m91866f(-1, "Expected string value for a non-null key '" + tag + "', got null literal instead at element: " + m91893U(tag), m91879G().toString());
        }
        throw C41915b0.m91866f(-1, "Expected " + Reflection.getOrCreateKotlinClass(JsonPrimitive.class).getSimpleName() + ", but had " + Reflection.getOrCreateKotlinClass(jsonElementMo91878F.getClass()).getSimpleName() + " as the serialized body of " + TypedValues.Custom.S_STRING + " at element: " + m91893U(tag), jsonElementMo91878F.toString());
    }

    @Override // xg0.InterfaceC46172g
    @NotNull
    /* JADX INFO: renamed from: b */
    public JsonElement mo91896b() {
        return m91879G();
    }

    @Override // kotlinx.serialization.encoding.InterfaceC41787b
    public boolean decodeNotNullMark() {
        return !(m91879G() instanceof C41910a);
    }

    @Override // kotlinx.serialization.encoding.InterfaceC41787b, kotlinx.serialization.encoding.CompositeDecoder
    @NotNull
    public AbstractC46494a getSerializersModule() {
        return getJson().getSerializersModule();
    }
}
