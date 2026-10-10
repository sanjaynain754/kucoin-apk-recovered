package kotlinx.serialization.json.internal;

import androidx.exifinterface.media.ExifInterface;
import androidx.media3.exoplayer.upstream.CmcdData;
import cn.jiguang.privates.push.constants.JPushConstants;
import com.facebook.react.uimanager.ViewProps;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.internal.C41895w0;
import kotlinx.serialization.json.C41910a;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.collections.MapsKt;
import p852kotlin.collections.SetsKt;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import vg0.AbstractC45531d;
import vg0.AbstractC45541n;
import vg0.InterfaceC45533f;
import xg0.AbstractC46162a;
import xg0.C46169d0;
import xg0.C46174i;

/* JADX INFO: renamed from: kotlinx.serialization.json.internal.j0 */
/* JADX INFO: compiled from: TreeJsonDecoder.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0013\b\u0012\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0014\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\rH\u0014¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\f\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\f\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ'\u0010 \u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u0006H\u0002¢\u0006\u0004\b \u0010!J\u001f\u0010\"\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\rH\u0002¢\u0006\u0004\b\"\u0010#R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0016\u0010\t\u001a\u0004\u0018\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0016\u0010,\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\u0016\u0010/\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.¨\u00060"}, m90084d2 = {"Lkotlinx/serialization/json/internal/j0;", "Lkotlinx/serialization/json/internal/c;", "Lxg0/a;", JPushConstants.Analysis.KEY_JSON, "Lkotlinx/serialization/json/JsonObject;", "value", "", "polymorphicDiscriminator", "Lvg0/f;", "polyDescriptor", "<init>", "(Lxg0/a;Lkotlinx/serialization/json/JsonObject;Ljava/lang/String;Lvg0/f;)V", "descriptor", "", "decodeElementIndex", "(Lvg0/f;)I", "", "decodeNotNullMark", "()Z", "index", "z", "(Lvg0/f;I)Ljava/lang/String;", "tag", "Lkotlinx/serialization/json/JsonElement;", "F", "(Ljava/lang/String;)Lkotlinx/serialization/json/JsonElement;", "Lkotlinx/serialization/encoding/CompositeDecoder;", "beginStructure", "(Lvg0/f;)Lkotlinx/serialization/encoding/CompositeDecoder;", "", "endStructure", "(Lvg0/f;)V", "X", "(Lvg0/f;ILjava/lang/String;)Z", ExifInterface.LONGITUDE_WEST, "(Lvg0/f;I)Z", "g", "Lkotlinx/serialization/json/JsonObject;", "Y", "()Lkotlinx/serialization/json/JsonObject;", CmcdData.Factory.STREAMING_FORMAT_HLS, "Lvg0/f;", "i", "I", ViewProps.POSITION, "j", "Z", "forceNull", "kotlinx-serialization-json"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nTreeJsonDecoder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TreeJsonDecoder.kt\nkotlinx/serialization/json/internal/JsonTreeDecoder\n+ 2 JsonNamesMap.kt\nkotlinx/serialization/json/internal/JsonNamesMapKt\n+ 3 JsonNamesMap.kt\nkotlinx/serialization/json/internal/JsonNamesMapKt$tryCoerceValue$1\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 TreeJsonDecoder.kt\nkotlinx/serialization/json/internal/AbstractJsonTreeDecoder\n+ 6 TreeJsonEncoder.kt\nkotlinx/serialization/json/internal/TreeJsonEncoderKt\n*L\n1#1,334:1\n125#2,22:335\n147#2,4:358\n131#3:357\n1#4:362\n74#5:363\n271#6,8:364\n*S KotlinDebug\n*F\n+ 1 TreeJsonDecoder.kt\nkotlinx/serialization/json/internal/JsonTreeDecoder\n*L\n200#1:335,22\n200#1:358,4\n200#1:357\n262#1:363\n262#1:364,8\n*E\n"})
public class C41932j0 extends AbstractC41917c {

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public final JsonObject value;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @Nullable
    public final InterfaceC45533f polyDescriptor;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public int position;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    public boolean forceNull;

    public /* synthetic */ C41932j0(AbstractC46162a abstractC46162a, JsonObject jsonObject, String str, InterfaceC45533f interfaceC45533f, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(abstractC46162a, jsonObject, (i11 & 4) != 0 ? null : str, (i11 & 8) != 0 ? null : interfaceC45533f);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C41932j0(@NotNull AbstractC46162a json, @NotNull JsonObject value, @Nullable String str, @Nullable InterfaceC45533f interfaceC45533f) {
        super(json, value, str, null);
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(value, "value");
        this.value = value;
        this.polyDescriptor = interfaceC45533f;
    }

    @Override // kotlinx.serialization.json.internal.AbstractC41917c
    @NotNull
    /* JADX INFO: renamed from: Y, reason: from getter and merged with bridge method [inline-methods] */
    public JsonObject getValue() {
        return this.value;
    }

    @Override // kotlinx.serialization.json.internal.AbstractC41917c, kotlinx.serialization.encoding.InterfaceC41787b
    @NotNull
    public CompositeDecoder beginStructure(@NotNull InterfaceC45533f descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (descriptor != this.polyDescriptor) {
            return super.beginStructure(descriptor);
        }
        AbstractC46162a json = getCn.jiguang.privates.push.constants.JPushConstants.Analysis.KEY_JSON java.lang.String();
        JsonElement jsonElementM91879G = m91879G();
        String serialName = this.polyDescriptor.getSerialName();
        if (jsonElementM91879G instanceof JsonObject) {
            return new C41932j0(json, (JsonObject) jsonElementM91879G, getPolymorphicDiscriminator(), this.polyDescriptor);
        }
        throw C41915b0.m91866f(-1, "Expected " + Reflection.getOrCreateKotlinClass(JsonObject.class).getSimpleName() + ", but had " + Reflection.getOrCreateKotlinClass(jsonElementM91879G.getClass()).getSimpleName() + " as the serialized body of " + serialName + " at element: " + m91650C(), jsonElementM91879G.toString());
    }

    @Override // kotlinx.serialization.encoding.CompositeDecoder
    public int decodeElementIndex(@NotNull InterfaceC45533f descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        while (this.position < descriptor.getElementsCount()) {
            int i11 = this.position;
            this.position = i11 + 1;
            String strMo91651t = mo91651t(descriptor, i11);
            int i12 = this.position - 1;
            this.forceNull = false;
            if (mo91892T().containsKey(strMo91651t) || m91949W(descriptor, i12)) {
                if (!this.configuration.getCoerceInputValues() || !m91950X(descriptor, i12, strMo91651t)) {
                    return i12;
                }
            }
        }
        return -1;
    }

    @Override // kotlinx.serialization.json.internal.AbstractC41917c, kotlinx.serialization.encoding.InterfaceC41787b
    public boolean decodeNotNullMark() {
        return !this.forceNull && super.decodeNotNullMark();
    }

    @Override // kotlinx.serialization.json.internal.AbstractC41917c, kotlinx.serialization.encoding.CompositeDecoder
    public void endStructure(@NotNull InterfaceC45533f descriptor) {
        Set<String> setPlus;
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (this.configuration.getIgnoreUnknownKeys() || (descriptor.getKind() instanceof AbstractC45531d)) {
            return;
        }
        C41920d0.m91909m(descriptor, getCn.jiguang.privates.push.constants.JPushConstants.Analysis.KEY_JSON java.lang.String());
        if (this.configuration.getUseAlternativeNames()) {
            Set<String> setM91741a = C41895w0.m91741a(descriptor);
            Map map = (Map) C46169d0.m101785a(getCn.jiguang.privates.push.constants.JPushConstants.Analysis.KEY_JSON java.lang.String()).m92022a(descriptor, C41920d0.m91903g());
            Set setKeySet = map != null ? map.keySet() : null;
            if (setKeySet == null) {
                setKeySet = SetsKt.emptySet();
            }
            setPlus = SetsKt.plus((Set) setM91741a, (Iterable) setKeySet);
        } else {
            setPlus = C41895w0.m91741a(descriptor);
        }
        for (String str : mo91892T().keySet()) {
            if (!setPlus.contains(str) && !Intrinsics.areEqual(str, getPolymorphicDiscriminator())) {
                throw C41915b0.m91867g(str, mo91892T().toString());
            }
        }
    }

    @Override // kotlinx.serialization.internal.AbstractC41855n1
    @NotNull
    /* JADX INFO: renamed from: z */
    public String mo91653z(@NotNull InterfaceC45533f descriptor, int index) {
        Object next;
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        C41920d0.m91909m(descriptor, getCn.jiguang.privates.push.constants.JPushConstants.Analysis.KEY_JSON java.lang.String());
        String strMo91527f = descriptor.mo91527f(index);
        if (!this.configuration.getUseAlternativeNames() || mo91892T().keySet().contains(strMo91527f)) {
            return strMo91527f;
        }
        Map<String, Integer> mapM91901e = C41920d0.m91901e(getCn.jiguang.privates.push.constants.JPushConstants.Analysis.KEY_JSON java.lang.String(), descriptor);
        Iterator<T> it = mo91892T().keySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            Integer num = mapM91901e.get((String) next);
            if (num != null && num.intValue() == index) {
                break;
            }
        }
        String str = (String) next;
        return str != null ? str : strMo91527f;
    }

    @Override // kotlinx.serialization.json.internal.AbstractC41917c
    @NotNull
    /* JADX INFO: renamed from: F */
    public JsonElement mo91878F(@NotNull String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        return (JsonElement) MapsKt.getValue(mo91892T(), tag);
    }

    /* JADX INFO: renamed from: W */
    public final boolean m91949W(InterfaceC45533f descriptor, int index) {
        boolean z11;
        if (!getCn.jiguang.privates.push.constants.JPushConstants.Analysis.KEY_JSON java.lang.String().getConfiguration().getExplicitNulls() && !descriptor.mo91529i(index) && descriptor.mo91525d(index).mo91523b()) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.forceNull = z11;
        return z11;
    }

    /* JADX INFO: renamed from: X */
    public final boolean m91950X(InterfaceC45533f descriptor, int index, String tag) {
        JsonPrimitive jsonPrimitive;
        boolean z11;
        AbstractC46162a json = getCn.jiguang.privates.push.constants.JPushConstants.Analysis.KEY_JSON java.lang.String();
        boolean zMo91529i = descriptor.mo91529i(index);
        InterfaceC45533f interfaceC45533fMo91525d = descriptor.mo91525d(index);
        if (zMo91529i && !interfaceC45533fMo91525d.mo91523b() && (mo91878F(tag) instanceof C41910a)) {
            return true;
        }
        if (!Intrinsics.areEqual(interfaceC45533fMo91525d.getKind(), AbstractC45541n.b.f102629a) || (interfaceC45533fMo91525d.mo91523b() && (mo91878F(tag) instanceof C41910a))) {
            return false;
        }
        JsonElement jsonElementMo91878F = mo91878F(tag);
        String strM101817f = null;
        if (jsonElementMo91878F instanceof JsonPrimitive) {
            jsonPrimitive = (JsonPrimitive) jsonElementMo91878F;
        } else {
            jsonPrimitive = null;
        }
        if (jsonPrimitive != null) {
            strM101817f = C46174i.m101817f(jsonPrimitive);
        }
        if (strM101817f == null) {
            return false;
        }
        int iM91905i = C41920d0.m91905i(interfaceC45533fMo91525d, json, strM101817f);
        if (!json.getConfiguration().getExplicitNulls() && interfaceC45533fMo91525d.mo91523b()) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (iM91905i == -3 && (zMo91529i || z11)) {
            return true;
        }
        return false;
    }
}
