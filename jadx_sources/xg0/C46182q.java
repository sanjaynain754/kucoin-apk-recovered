package xg0;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.tencent.bugly.proguard.C33612dh;
import java.lang.annotation.Annotation;
import java.util.List;
import kotlinx.serialization.encoding.InterfaceC41787b;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.Reflection;
import vg0.AbstractC45541n;
import vg0.InterfaceC45533f;
import wg0.InterfaceC45830c;

/* JADX INFO: renamed from: xg0.q */
/* JADX INFO: compiled from: JsonElementSerializers.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0007\u0010\b\u001a\u0013\u0010\n\u001a\u00020\t*\u00020\u0005H\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a\u0013\u0010\r\u001a\u00020\f*\u00020\u0000H\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a\u001d\u0010\u0012\u001a\u00020\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m90084d2 = {"Lwg0/c;", "encoder", "", CmcdData.Factory.STREAMING_FORMAT_HLS, "(Lwg0/c;)V", "Lkotlinx/serialization/encoding/b;", "decoder", "g", "(Lkotlinx/serialization/encoding/b;)V", "Lxg0/g;", "d", "(Lkotlinx/serialization/encoding/b;)Lxg0/g;", "Lxg0/r;", "e", "(Lwg0/c;)Lxg0/r;", "Lkotlin/Function0;", "Lvg0/f;", "deferred", "f", "(Lkotlin/jvm/functions/Function0;)Lvg0/f;", "kotlinx-serialization-json"}, m90085k = 2, m90086mv = {2, 0, 0}, m90088xi = 48)
public final class C46182q {

    /* JADX INFO: renamed from: xg0.q$a */
    /* JADX INFO: compiled from: JsonElementSerializers.kt */
    @Metadata(m90083d1 = {"\u00003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0010\u001b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0016\u001a\u00020\u00018BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001d\u001a\u00020\u001a8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010 \u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f¨\u0006!"}, m90084d2 = {"xg0/q$a", "Lvg0/f;", "", "index", "", "f", "(I)Ljava/lang/String;", "name", "c", "(Ljava/lang/String;)I", "", "", "g", "(I)Ljava/util/List;", "d", "(I)Lvg0/f;", "", "i", "(I)Z", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Lkotlin/Lazy;", "()Lvg0/f;", "original", CmcdData.Factory.STREAMING_FORMAT_HLS, "()Ljava/lang/String;", "serialName", "Lvg0/n;", "getKind", "()Lvg0/n;", C33612dh.f69618m, "e", "()I", "elementsCount", "kotlinx-serialization-json"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
    public static final class a implements InterfaceC45533f {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        public final Lazy original;

        /* JADX INFO: renamed from: a */
        public final InterfaceC45533f m101849a() {
            return (InterfaceC45533f) this.original.getValue();
        }

        @Override // vg0.InterfaceC45533f
        /* JADX INFO: renamed from: c */
        public int mo91524c(String name) {
            Intrinsics.checkNotNullParameter(name, "name");
            return m101849a().mo91524c(name);
        }

        public a(Function0<? extends InterfaceC45533f> function0) {
            this.original = LazyKt.lazy(function0);
        }

        @Override // vg0.InterfaceC45533f
        /* JADX INFO: renamed from: b */
        public boolean mo91523b() {
            return InterfaceC45533f.a.m100530c(this);
        }

        @Override // vg0.InterfaceC45533f
        /* JADX INFO: renamed from: d */
        public InterfaceC45533f mo91525d(int index) {
            return m101849a().mo91525d(index);
        }

        @Override // vg0.InterfaceC45533f
        /* JADX INFO: renamed from: e */
        public int getElementsCount() {
            return m101849a().getElementsCount();
        }

        @Override // vg0.InterfaceC45533f
        /* JADX INFO: renamed from: f */
        public String mo91527f(int index) {
            return m101849a().mo91527f(index);
        }

        @Override // vg0.InterfaceC45533f
        /* JADX INFO: renamed from: g */
        public List<Annotation> mo91528g(int index) {
            return m101849a().mo91528g(index);
        }

        @Override // vg0.InterfaceC45533f
        public List<Annotation> getAnnotations() {
            return InterfaceC45533f.a.m100528a(this);
        }

        @Override // vg0.InterfaceC45533f
        public AbstractC45541n getKind() {
            return m101849a().getKind();
        }

        @Override // vg0.InterfaceC45533f
        /* JADX INFO: renamed from: h */
        public String getSerialName() {
            return m101849a().getSerialName();
        }

        @Override // vg0.InterfaceC45533f
        /* JADX INFO: renamed from: i */
        public boolean mo91529i(int index) {
            return m101849a().mo91529i(index);
        }

        @Override // vg0.InterfaceC45533f
        /* JADX INFO: renamed from: isInline */
        public boolean getIsInline() {
            return InterfaceC45533f.a.m100529b(this);
        }
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public static final InterfaceC46172g m101844d(@NotNull InterfaceC41787b interfaceC41787b) {
        Intrinsics.checkNotNullParameter(interfaceC41787b, "<this>");
        InterfaceC46172g interfaceC46172g = interfaceC41787b instanceof InterfaceC46172g ? (InterfaceC46172g) interfaceC41787b : null;
        if (interfaceC46172g != null) {
            return interfaceC46172g;
        }
        throw new IllegalStateException("This serializer can be used only with Json format.Expected Decoder to be JsonDecoder, got " + Reflection.getOrCreateKotlinClass(interfaceC41787b.getClass()));
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public static final InterfaceC46183r m101845e(@NotNull InterfaceC45830c interfaceC45830c) {
        Intrinsics.checkNotNullParameter(interfaceC45830c, "<this>");
        InterfaceC46183r interfaceC46183r = interfaceC45830c instanceof InterfaceC46183r ? (InterfaceC46183r) interfaceC45830c : null;
        if (interfaceC46183r != null) {
            return interfaceC46183r;
        }
        throw new IllegalStateException("This serializer can be used only with Json format.Expected Encoder to be JsonEncoder, got " + Reflection.getOrCreateKotlinClass(interfaceC45830c.getClass()));
    }

    /* JADX INFO: renamed from: f */
    public static final InterfaceC45533f m101846f(Function0<? extends InterfaceC45533f> function0) {
        return new a(function0);
    }

    /* JADX INFO: renamed from: g */
    public static final void m101847g(InterfaceC41787b interfaceC41787b) {
        m101844d(interfaceC41787b);
    }

    /* JADX INFO: renamed from: h */
    public static final void m101848h(InterfaceC45830c interfaceC45830c) {
        m101845e(interfaceC45830c);
    }
}
