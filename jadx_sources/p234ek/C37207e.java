package p234ek;

import androidx.exifinterface.media.ExifInterface;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.tencent.bugly.proguard.C33616e0;
import java.util.HashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: ek.e */
/* JADX INFO: compiled from: InterpretRequest.kt */
/* JADX INFO: loaded from: classes16.dex */
@Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\b\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00062\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0001¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000e\u0010\u0010R0\u0010\u0014\u001a\u001e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\u0011j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0001`\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0013¨\u0006\u0015"}, m90084d2 = {"Lek/e;", "", "", "host", "<init>", "(Ljava/lang/String;)V", ExifInterface.GPS_DIRECTION_TRUE, "tag", "b", "(Ljava/lang/String;)Ljava/lang/Object;", "value", "", "c", "(Ljava/lang/String;Ljava/lang/Object;)V", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Ljava/lang/String;", "()Ljava/lang/String;", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "Ljava/util/HashMap;", C33616e0.f69644s, "httpdns_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class C37207e {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final String host;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final HashMap<String, Object> tags;

    public C37207e(@NotNull String host) {
        Intrinsics.checkNotNullParameter(host, "host");
        this.host = host;
        this.tags = new HashMap<>();
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getHost() {
        return this.host;
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public final <T> T m83245b(@NotNull String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        T t11 = (T) this.tags.get(tag);
        if (t11 == null) {
            return null;
        }
        return t11;
    }

    /* JADX INFO: renamed from: c */
    public final void m83246c(@NotNull String tag, @NotNull Object value) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(value, "value");
        this.tags.put(tag, value);
    }
}
