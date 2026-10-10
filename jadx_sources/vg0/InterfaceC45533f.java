package vg0;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.tencent.bugly.proguard.C33612dh;
import java.lang.annotation.Annotation;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;

/* JADX INFO: renamed from: vg0.f */
/* JADX INFO: compiled from: SerialDescriptor.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0010\u001b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0012\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0004H'¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0017\u001a\u00020\u00048&X§\u0004¢\u0006\f\u0012\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u001c\u001a\u00020\u00188&X§\u0004¢\u0006\f\u0012\u0004\b\u001b\u0010\u0016\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010 \u001a\u00020\u00108VX\u0097\u0004¢\u0006\f\u0012\u0004\b\u001f\u0010\u0016\u001a\u0004\b\u001d\u0010\u001eR\u0014\u0010!\u001a\u00020\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\u001eR\u001a\u0010%\u001a\u00020\u00028&X§\u0004¢\u0006\f\u0012\u0004\b$\u0010\u0016\u001a\u0004\b\"\u0010#R \u0010)\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8VX\u0097\u0004¢\u0006\f\u0012\u0004\b(\u0010\u0016\u001a\u0004\b&\u0010'¨\u0006*"}, m90084d2 = {"Lvg0/f;", "", "", "index", "", "f", "(I)Ljava/lang/String;", "name", "c", "(Ljava/lang/String;)I", "", "", "g", "(I)Ljava/util/List;", "d", "(I)Lvg0/f;", "", "i", "(I)Z", CmcdData.Factory.STREAMING_FORMAT_HLS, "()Ljava/lang/String;", "getSerialName$annotations", "()V", "serialName", "Lvg0/n;", "getKind", "()Lvg0/n;", "getKind$annotations", C33612dh.f69618m, "b", "()Z", "isNullable$annotations", "isNullable", "isInline", "e", "()I", "getElementsCount$annotations", "elementsCount", "getAnnotations", "()Ljava/util/List;", "getAnnotations$annotations", "annotations", "kotlinx-serialization-core"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public interface InterfaceC45533f {
    /* JADX INFO: renamed from: b */
    boolean mo91523b();

    /* JADX INFO: renamed from: c */
    int mo91524c(@NotNull String name);

    @NotNull
    /* JADX INFO: renamed from: d */
    InterfaceC45533f mo91525d(int index);

    /* JADX INFO: renamed from: e */
    int getElementsCount();

    @NotNull
    /* JADX INFO: renamed from: f */
    String mo91527f(int index);

    @NotNull
    /* JADX INFO: renamed from: g */
    List<Annotation> mo91528g(int index);

    @NotNull
    List<Annotation> getAnnotations();

    @NotNull
    AbstractC45541n getKind();

    @NotNull
    /* JADX INFO: renamed from: h */
    String getSerialName();

    /* JADX INFO: renamed from: i */
    boolean mo91529i(int index);

    boolean isInline();

    /* JADX INFO: renamed from: vg0.f$a */
    /* JADX INFO: compiled from: SerialDescriptor.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 0, 0}, m90088xi = 48)
    public static final class a {
        /* JADX INFO: renamed from: b */
        public static boolean m100529b(@NotNull InterfaceC45533f interfaceC45533f) {
            return false;
        }

        /* JADX INFO: renamed from: c */
        public static boolean m100530c(@NotNull InterfaceC45533f interfaceC45533f) {
            return false;
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public static List<Annotation> m100528a(@NotNull InterfaceC45533f interfaceC45533f) {
            return CollectionsKt.emptyList();
        }
    }
}
