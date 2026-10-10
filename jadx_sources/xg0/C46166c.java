package xg0;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.tencent.bugly.proguard.C33612dh;
import java.lang.annotation.Annotation;
import java.util.List;
import kotlinx.serialization.encoding.InterfaceC41787b;
import kotlinx.serialization.json.JsonArray;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.PublishedApi;
import p852kotlin.jvm.internal.Intrinsics;
import tg0.InterfaceC44951d;
import ug0.C45236a;
import vg0.AbstractC45541n;
import vg0.InterfaceC45533f;
import wg0.InterfaceC45830c;

/* JADX INFO: renamed from: xg0.c */
/* JADX INFO: compiled from: JsonElementSerializers.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\bÁ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\rB\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0013\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, m90084d2 = {"Lxg0/c;", "Ltg0/d;", "Lkotlinx/serialization/json/JsonArray;", "<init>", "()V", "Lwg0/c;", "encoder", "value", "", "b", "(Lwg0/c;Lkotlinx/serialization/json/JsonArray;)V", "Lkotlinx/serialization/encoding/b;", "decoder", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Lkotlinx/serialization/encoding/b;)Lkotlinx/serialization/json/JsonArray;", "Lvg0/f;", "Lvg0/f;", "getDescriptor", "()Lvg0/f;", "descriptor", "kotlinx-serialization-json"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
@PublishedApi
public final class C46166c implements InterfaceC44951d<JsonArray> {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C46166c f103674a = new C46166c();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final InterfaceC45533f descriptor = a.f103676b;

    /* JADX INFO: renamed from: xg0.c$a */
    /* JADX INFO: compiled from: JsonElementSerializers.kt */
    @Metadata(m90083d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0010\u001b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000e\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0097\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0006H\u0097\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u0005\u001a\u00020\u0004H\u0097\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0004H\u0097\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u0004H\u0097\u0001¢\u0006\u0004\b\u0013\u0010\u0014R \u0010\u0019\u001a\u00020\u00068\u0016X\u0097D¢\u0006\u0012\n\u0004\b\n\u0010\u0015\u0012\u0004\b\u0018\u0010\u0003\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001d\u001a\u00020\u001a8\u0016X\u0097\u0005¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010 \u001a\u00020\u00128VX\u0097\u0005¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u0014\u0010!\u001a\u00020\u00128VX\u0096\u0005¢\u0006\u0006\u001a\u0004\b!\u0010\u001fR\u0014\u0010$\u001a\u00020\u00048\u0016X\u0097\u0005¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u001a\u0010'\u001a\b\u0012\u0004\u0012\u00020\r0\f8VX\u0097\u0005¢\u0006\u0006\u001a\u0004\b%\u0010&¨\u0006("}, m90084d2 = {"Lxg0/c$a;", "Lvg0/f;", "<init>", "()V", "", "index", "", "f", "(I)Ljava/lang/String;", "name", "c", "(Ljava/lang/String;)I", "", "", "g", "(I)Ljava/util/List;", "d", "(I)Lvg0/f;", "", "i", "(I)Z", "Ljava/lang/String;", CmcdData.Factory.STREAMING_FORMAT_HLS, "()Ljava/lang/String;", "getSerialName$annotations", "serialName", "Lvg0/n;", "getKind", "()Lvg0/n;", C33612dh.f69618m, "b", "()Z", "isNullable", "isInline", "e", "()I", "elementsCount", "getAnnotations", "()Ljava/util/List;", "annotations", "kotlinx-serialization-json"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
    public static final class a implements InterfaceC45533f {

        /* JADX INFO: renamed from: b */
        @NotNull
        public static final a f103676b = new a();

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        @NotNull
        public static final String serialName = "kotlinx.serialization.json.JsonArray";

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ InterfaceC45533f f103678a = C45236a.m99956h(C46181p.f103715a).getDescriptor();

        @Override // vg0.InterfaceC45533f
        /* JADX INFO: renamed from: b */
        public boolean mo91523b() {
            return this.f103678a.mo91523b();
        }

        @Override // vg0.InterfaceC45533f
        /* JADX INFO: renamed from: c */
        public int mo91524c(@NotNull String name) {
            Intrinsics.checkNotNullParameter(name, "name");
            return this.f103678a.mo91524c(name);
        }

        @Override // vg0.InterfaceC45533f
        @NotNull
        /* JADX INFO: renamed from: d */
        public InterfaceC45533f mo91525d(int index) {
            return this.f103678a.mo91525d(index);
        }

        @Override // vg0.InterfaceC45533f
        /* JADX INFO: renamed from: e */
        public int getElementsCount() {
            return this.f103678a.getElementsCount();
        }

        @Override // vg0.InterfaceC45533f
        @NotNull
        /* JADX INFO: renamed from: f */
        public String mo91527f(int index) {
            return this.f103678a.mo91527f(index);
        }

        @Override // vg0.InterfaceC45533f
        @NotNull
        /* JADX INFO: renamed from: g */
        public List<Annotation> mo91528g(int index) {
            return this.f103678a.mo91528g(index);
        }

        @Override // vg0.InterfaceC45533f
        @NotNull
        public List<Annotation> getAnnotations() {
            return this.f103678a.getAnnotations();
        }

        @Override // vg0.InterfaceC45533f
        @NotNull
        public AbstractC45541n getKind() {
            return this.f103678a.getKind();
        }

        @Override // vg0.InterfaceC45533f
        @NotNull
        /* JADX INFO: renamed from: h */
        public String getSerialName() {
            return serialName;
        }

        @Override // vg0.InterfaceC45533f
        /* JADX INFO: renamed from: i */
        public boolean mo91529i(int index) {
            return this.f103678a.mo91529i(index);
        }

        @Override // vg0.InterfaceC45533f
        /* JADX INFO: renamed from: isInline */
        public boolean getIsInline() {
            return this.f103678a.getIsInline();
        }
    }

    @Override // tg0.InterfaceC44949c
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public JsonArray deserialize(@NotNull InterfaceC41787b decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        C46182q.m101847g(decoder);
        return new JsonArray((List) C45236a.m99956h(C46181p.f103715a).deserialize(decoder));
    }

    @Override // tg0.InterfaceC44963p
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void serialize(@NotNull InterfaceC45830c encoder, @NotNull JsonArray value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        C46182q.m101848h(encoder);
        C45236a.m99956h(C46181p.f103715a).serialize(encoder, value);
    }

    @Override // tg0.InterfaceC44951d, tg0.InterfaceC44963p, tg0.InterfaceC44949c
    @NotNull
    public InterfaceC45533f getDescriptor() {
        return descriptor;
    }
}
