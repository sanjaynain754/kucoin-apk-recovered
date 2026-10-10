package p547q3;

import androidx.media3.exoplayer.upstream.CmcdData;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p190d4.C36611b;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: q3.b */
/* JADX INFO: compiled from: CacheKeyUtil.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\n\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\f\u0010\u000b¨\u0006\r"}, m90084d2 = {"Lq3/b;", "", "<init>", "()V", "Lq3/a;", "key", "", "", "b", "(Lq3/a;)Ljava/util/List;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Lq3/a;)Ljava/lang/String;", "c", "imagepipeline-base_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public final class C43596b {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C43596b f96246a = new C43596b();

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final String m95950a(@NotNull InterfaceC43595a key) {
        Intrinsics.checkNotNullParameter(key, "key");
        try {
            if (!(key instanceof C43597c)) {
                return f96246a.m95952c(key);
            }
            List<InterfaceC43595a> listM95953d = ((C43597c) key).m95953d();
            Intrinsics.checkNotNullExpressionValue(listM95953d, "getCacheKeys(...)");
            C43596b c43596b = f96246a;
            InterfaceC43595a interfaceC43595a = listM95953d.get(0);
            Intrinsics.checkNotNullExpressionValue(interfaceC43595a, "get(...)");
            return c43596b.m95952c(interfaceC43595a);
        } catch (UnsupportedEncodingException e11) {
            throw new RuntimeException(e11);
        }
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: b */
    public static final List<String> m95951b(@NotNull InterfaceC43595a key) {
        Intrinsics.checkNotNullParameter(key, "key");
        try {
            if (!(key instanceof C43597c)) {
                ArrayList arrayList = new ArrayList(1);
                arrayList.add(key.mo8759b() ? key.mo8758a() : f96246a.m95952c(key));
                return arrayList;
            }
            List<InterfaceC43595a> listM95953d = ((C43597c) key).m95953d();
            Intrinsics.checkNotNullExpressionValue(listM95953d, "getCacheKeys(...)");
            ArrayList arrayList2 = new ArrayList(listM95953d.size());
            int size = listM95953d.size();
            for (int i11 = 0; i11 < size; i11++) {
                C43596b c43596b = f96246a;
                InterfaceC43595a interfaceC43595a = listM95953d.get(i11);
                Intrinsics.checkNotNullExpressionValue(interfaceC43595a, "get(...)");
                arrayList2.add(c43596b.m95952c(interfaceC43595a));
            }
            return arrayList2;
        } catch (UnsupportedEncodingException e11) {
            throw new RuntimeException(e11);
        }
    }

    /* JADX INFO: renamed from: c */
    public final String m95952c(InterfaceC43595a key) throws UnsupportedEncodingException {
        String strMo8758a = key.mo8758a();
        Intrinsics.checkNotNullExpressionValue(strMo8758a, "getUriString(...)");
        Charset charsetForName = Charset.forName("UTF-8");
        Intrinsics.checkNotNullExpressionValue(charsetForName, "forName(...)");
        byte[] bytes = strMo8758a.getBytes(charsetForName);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        String strM81930a = C36611b.m81930a(bytes);
        Intrinsics.checkNotNullExpressionValue(strM81930a, "makeSHA1HashBase64(...)");
        return strM81930a;
    }
}
