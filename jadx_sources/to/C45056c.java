package to;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.kubi.log.core.C17473a;
import java.util.Iterator;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import so.InterfaceC44532c;
import so.InterfaceC44533d;
import xg0.C46163a0;
import xg0.C46173h;

/* JADX INFO: renamed from: to.c */
/* JADX INFO: compiled from: SymbolProcessor.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J3\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\n\u0010\u000bJ3\u0010\f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, m90084d2 = {"Lto/c;", "Lso/d;", "<init>", "()V", "", "tag", "name", "data", "desc", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "b", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "Logger-core_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nSymbolProcessor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SymbolProcessor.kt\ncom/kubi/log/core/impl/SymbolProcessor\n+ 2 JsonElementBuilders.kt\nkotlinx/serialization/json/JsonElementBuildersKt\n*L\n1#1,47:1\n26#2,4:48\n*S KotlinDebug\n*F\n+ 1 SymbolProcessor.kt\ncom/kubi/log/core/impl/SymbolProcessor\n*L\n22#1:48,4\n*E\n"})
public final class C45056c implements InterfaceC44533d {
    @Override // so.InterfaceC44533d
    /* JADX INFO: renamed from: a */
    public void mo98545a(@NotNull String tag, @NotNull String name, @Nullable String data, @Nullable String desc) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(name, "name");
        Iterator<InterfaceC44532c> it = C17473a.f32591a.m37856a().m37839f().iterator();
        while (it.hasNext()) {
            it.next().log(m99653b(tag, name, data, desc));
        }
    }

    /* JADX INFO: renamed from: b */
    public final String m99653b(String tag, String name, String data, String desc) {
        C46163a0 c46163a0 = new C46163a0();
        C46173h.m101809g(c46163a0, "tag", tag);
        C46173h.m101809g(c46163a0, "name", name);
        if (data != null) {
            C46173h.m101809g(c46163a0, "data", data);
        }
        if (desc != null) {
            C46173h.m101809g(c46163a0, "decs", desc);
        }
        C46173h.m101808f(c46163a0, "logType", 6);
        return c46163a0.m101768a().toString();
    }
}
