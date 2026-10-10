package xg0;

import androidx.media3.exoplayer.upstream.CmcdData;
import kotlinx.serialization.encoding.InterfaceC41787b;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.internal.C41915b0;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.ULong;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;
import p852kotlin.text.UStringsKt;
import tg0.InterfaceC44951d;
import ug0.C45236a;
import vg0.AbstractC45532e;
import vg0.C45540m;
import vg0.InterfaceC45533f;
import wg0.InterfaceC45830c;

/* JADX INFO: renamed from: xg0.v */
/* JADX INFO: compiled from: JsonElementSerializers.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\bÂ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0013\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, m90084d2 = {"Lxg0/v;", "Ltg0/d;", "Lxg0/u;", "<init>", "()V", "Lwg0/c;", "encoder", "value", "", "b", "(Lwg0/c;Lxg0/u;)V", "Lkotlinx/serialization/encoding/b;", "decoder", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Lkotlinx/serialization/encoding/b;)Lxg0/u;", "Lvg0/f;", "Lvg0/f;", "getDescriptor", "()Lvg0/f;", "descriptor", "kotlinx-serialization-json"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nJsonElementSerializers.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JsonElementSerializers.kt\nkotlinx/serialization/json/JsonLiteralSerializer\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,236:1\n1#2:237\n*E\n"})
public final class C46187v implements InterfaceC44951d<C46186u> {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C46187v f103721a = new C46187v();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final InterfaceC45533f descriptor = C45540m.m100542c("kotlinx.serialization.json.JsonLiteral", AbstractC45532e.i.f102607a);

    @Override // tg0.InterfaceC44949c
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C46186u deserialize(@NotNull InterfaceC41787b decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        JsonElement jsonElementMo91896b = C46182q.m101844d(decoder).mo91896b();
        if (jsonElementMo91896b instanceof C46186u) {
            return (C46186u) jsonElementMo91896b;
        }
        throw C41915b0.m91866f(-1, "Unexpected JSON element, expected JsonLiteral, had " + Reflection.getOrCreateKotlinClass(jsonElementMo91896b.getClass()), jsonElementMo91896b.toString());
    }

    @Override // tg0.InterfaceC44963p
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void serialize(@NotNull InterfaceC45830c encoder, @NotNull C46186u value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        C46182q.m101848h(encoder);
        if (value.getIsString()) {
            encoder.encodeString(value.getContent());
            return;
        }
        if (value.getCoerceToInlineType() != null) {
            encoder.encodeInline(value.getCoerceToInlineType()).encodeString(value.getContent());
            return;
        }
        Long longOrNull = StringsKt.toLongOrNull(value.getContent());
        if (longOrNull != null) {
            encoder.encodeLong(longOrNull.longValue());
            return;
        }
        ULong uLongOrNull = UStringsKt.toULongOrNull(value.getContent());
        if (uLongOrNull != null) {
            encoder.encodeInline(C45236a.serializer(ULong.INSTANCE).getDescriptor()).encodeLong(uLongOrNull.getData());
            return;
        }
        Double doubleOrNull = StringsKt.toDoubleOrNull(value.getContent());
        if (doubleOrNull != null) {
            encoder.encodeDouble(doubleOrNull.doubleValue());
            return;
        }
        Boolean booleanStrictOrNull = StringsKt.toBooleanStrictOrNull(value.getContent());
        if (booleanStrictOrNull != null) {
            encoder.encodeBoolean(booleanStrictOrNull.booleanValue());
        } else {
            encoder.encodeString(value.getContent());
        }
    }

    @Override // tg0.InterfaceC44951d, tg0.InterfaceC44963p, tg0.InterfaceC44949c
    @NotNull
    public InterfaceC45533f getDescriptor() {
        return descriptor;
    }
}
