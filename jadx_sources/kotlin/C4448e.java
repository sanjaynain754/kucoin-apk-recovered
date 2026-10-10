package kotlin;

import android.content.Context;
import androidx.media3.exoplayer.upstream.CmcdData;
import java.io.File;
import okhttp3.Cache;
import org.jetbrains.annotations.NotNull;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: b1.e */
/* JADX INFO: compiled from: CoilUtils.kt */
/* JADX INFO: loaded from: classes34.dex */
@p852kotlin.Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m90084d2 = {"Lb1/e;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Lokhttp3/Cache;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Landroid/content/Context;)Lokhttp3/Cache;", "coil-base_release"}, m90085k = 1, m90086mv = {1, 5, 1}, m90088xi = 48)
public final class C4448e {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C4448e f3851a = new C4448e();

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final Cache m4237a(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        C4452i c4452i = C4452i.f3855a;
        File fileM4248g = c4452i.m4248g(context);
        return new Cache(fileM4248g, c4452i.m4244c(fileM4248g));
    }
}
