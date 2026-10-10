package xg0;

import kotlinx.serialization.encoding.InterfaceC41787b;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.PublishedApi;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import tg0.InterfaceC44951d;
import vg0.AbstractC45531d;
import vg0.C45528a;
import vg0.C45540m;
import vg0.InterfaceC45533f;
import wg0.InterfaceC45830c;

/* JADX INFO: renamed from: xg0.p */
/* JADX INFO: compiled from: JsonElementSerializers.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\bÁ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0014\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, m90084d2 = {"Lxg0/p;", "Ltg0/d;", "Lkotlinx/serialization/json/JsonElement;", "<init>", "()V", "Lwg0/c;", "encoder", "value", "", "n", "(Lwg0/c;Lkotlinx/serialization/json/JsonElement;)V", "Lkotlinx/serialization/encoding/b;", "decoder", "m", "(Lkotlinx/serialization/encoding/b;)Lkotlinx/serialization/json/JsonElement;", "Lvg0/f;", "b", "Lvg0/f;", "getDescriptor", "()Lvg0/f;", "descriptor", "kotlinx-serialization-json"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
@PublishedApi
public final class C46181p implements InterfaceC44951d<JsonElement> {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C46181p f103715a = new C46181p();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final InterfaceC45533f descriptor = C45540m.m100547h("kotlinx.serialization.json.JsonElement", AbstractC45531d.b.f102598a, new InterfaceC45533f[0], new Function1() { // from class: xg0.j
        @Override // p852kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return C46181p.m101833g((C45528a) obj);
        }
    });

    /* JADX INFO: renamed from: g */
    public static final Unit m101833g(C45528a buildSerialDescriptor) {
        Intrinsics.checkNotNullParameter(buildSerialDescriptor, "$this$buildSerialDescriptor");
        C45528a.m100517b(buildSerialDescriptor, "JsonPrimitive", C46182q.m101846f(new Function0() { // from class: xg0.k
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C46181p.m101834h();
            }
        }), null, false, 12, null);
        C45528a.m100517b(buildSerialDescriptor, "JsonNull", C46182q.m101846f(new Function0() { // from class: xg0.l
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C46181p.m101835i();
            }
        }), null, false, 12, null);
        C45528a.m100517b(buildSerialDescriptor, "JsonLiteral", C46182q.m101846f(new Function0() { // from class: xg0.m
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C46181p.m101836j();
            }
        }), null, false, 12, null);
        C45528a.m100517b(buildSerialDescriptor, "JsonObject", C46182q.m101846f(new Function0() { // from class: xg0.n
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C46181p.m101837k();
            }
        }), null, false, 12, null);
        C45528a.m100517b(buildSerialDescriptor, "JsonArray", C46182q.m101846f(new Function0() { // from class: xg0.o
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C46181p.m101838l();
            }
        }), null, false, 12, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: h */
    public static final InterfaceC45533f m101834h() {
        return C46167c0.f103679a.getDescriptor();
    }

    /* JADX INFO: renamed from: i */
    public static final InterfaceC45533f m101835i() {
        return C46190y.f103723a.getDescriptor();
    }

    /* JADX INFO: renamed from: j */
    public static final InterfaceC45533f m101836j() {
        return C46187v.f103721a.getDescriptor();
    }

    /* JADX INFO: renamed from: k */
    public static final InterfaceC45533f m101837k() {
        return C46165b0.f103669a.getDescriptor();
    }

    /* JADX INFO: renamed from: l */
    public static final InterfaceC45533f m101838l() {
        return C46166c.f103674a.getDescriptor();
    }

    @Override // tg0.InterfaceC44951d, tg0.InterfaceC44963p, tg0.InterfaceC44949c
    @NotNull
    public InterfaceC45533f getDescriptor() {
        return descriptor;
    }

    @Override // tg0.InterfaceC44949c
    @NotNull
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public JsonElement deserialize(@NotNull InterfaceC41787b decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return C46182q.m101844d(decoder).mo91896b();
    }

    @Override // tg0.InterfaceC44963p
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public void serialize(@NotNull InterfaceC45830c encoder, @NotNull JsonElement value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        C46182q.m101848h(encoder);
        if (value instanceof JsonPrimitive) {
            encoder.encodeSerializableValue(C46167c0.f103679a, value);
        } else if (value instanceof JsonObject) {
            encoder.encodeSerializableValue(C46165b0.f103669a, value);
        } else {
            if (!(value instanceof JsonArray)) {
                throw new NoWhenBranchMatchedException();
            }
            encoder.encodeSerializableValue(C46166c.f103674a, value);
        }
    }
}
