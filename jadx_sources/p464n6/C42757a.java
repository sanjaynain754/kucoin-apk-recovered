package p464n6;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.VisibleForTesting;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.facebook.C5501a;
import com.facebook.internal.instrument.C5764a;
import com.facebook.internal.instrument.InstrumentData;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: n6.a */
/* JADX INFO: compiled from: CrashShieldHandler.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010#\n\u0000\n\u0002\u0010\"\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0003J!\u0010\t\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0007\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\u0007\u0010\u0010R8\u0010\u0015\u001a&\u0012\f\u0012\n \u0012*\u0004\u0018\u00010\u00010\u0001 \u0012*\u0012\u0012\f\u0012\n \u0012*\u0004\u0018\u00010\u00010\u0001\u0018\u00010\u00130\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0014R\u0016\u0010\u0017\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u0016¨\u0006\u0018"}, m90084d2 = {"Ln6/a;", "", "<init>", "()V", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "", "e", "o", "b", "(Ljava/lang/Throwable;Ljava/lang/Object;)V", "", "d", "(Ljava/lang/Object;)Z", "c", "()Z", "(Ljava/lang/Throwable;)V", "", "kotlin.jvm.PlatformType", "", "Ljava/util/Set;", "crashingObjects", "Z", "enabled", "facebook-core_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class C42757a {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C42757a f94711a = new C42757a();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public static final Set<Object> crashingObjects = Collections.newSetFromMap(new WeakHashMap());

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public static boolean enabled;

    /* JADX INFO: renamed from: n6.a$a */
    /* JADX INFO: compiled from: CrashShieldHandler.kt */
    @Metadata(m90083d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m90084d2 = {"n6/a$a", "Ljava/lang/Runnable;", "", "run", "()V", "facebook-core_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    public static final class a implements Runnable {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Throwable f94714b;

        public a(Throwable th2) {
            this.f94714b = th2;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C42757a.m93689d(this)) {
                return;
            }
            try {
                throw new RuntimeException(this.f94714b);
            } catch (Throwable th2) {
                C42757a.m93687b(th2, this);
            }
        }
    }

    @JvmStatic
    /* JADX INFO: renamed from: a */
    public static final void m93686a() {
        enabled = true;
    }

    @JvmStatic
    @VisibleForTesting
    /* JADX INFO: renamed from: c */
    public static final boolean m93688c() {
        return false;
    }

    @JvmStatic
    /* JADX INFO: renamed from: b */
    public static final void m93687b(@Nullable Throwable e11, @NotNull Object o11) {
        Intrinsics.checkNotNullParameter(o11, "o");
        if (!enabled) {
            return;
        }
        crashingObjects.add(o11);
        if (C5501a.m7803q()) {
            C5764a.m10130c(e11);
            InstrumentData.C5762a.m10125b(e11, InstrumentData.Type.CrashShield).m10121g();
        }
        m93690e(e11);
    }

    @JvmStatic
    /* JADX INFO: renamed from: d */
    public static final boolean m93689d(@NotNull Object o11) {
        Intrinsics.checkNotNullParameter(o11, "o");
        return crashingObjects.contains(o11);
    }

    @JvmStatic
    @VisibleForTesting
    /* JADX INFO: renamed from: e */
    public static final void m93690e(@Nullable Throwable e11) {
        if (m93688c()) {
            new Handler(Looper.getMainLooper()).post(new a(e11));
        }
    }
}
