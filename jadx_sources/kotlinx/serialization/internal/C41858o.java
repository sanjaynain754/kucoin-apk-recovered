package kotlinx.serialization.internal;

import androidx.exifinterface.media.ExifInterface;
import androidx.media3.exoplayer.upstream.CmcdData;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.reflect.KClass;
import p852kotlin.reflect.KType;
import tg0.InterfaceC44951d;

/* JADX INFO: renamed from: kotlinx.serialization.internal.o */
/* JADX INFO: compiled from: Caching.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u00008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a;\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\"\u0004\b\u0000\u0010\u00002\u001e\u0010\u0004\u001a\u001a\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0002\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00030\u0001H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001aI\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f\"\u0004\b\u0000\u0010\u00002,\u0010\u0004\u001a(\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00030\bH\u0000¢\u0006\u0004\b\r\u0010\u000e\"\u0014\u0010\u0011\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0010¨\u0006\u0012"}, m90084d2 = {ExifInterface.GPS_DIRECTION_TRUE, "Lkotlin/Function1;", "Lkotlin/reflect/KClass;", "Ltg0/d;", "factory", "Lkotlinx/serialization/internal/s2;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Lkotlin/jvm/functions/Function1;)Lkotlinx/serialization/internal/s2;", "Lkotlin/Function2;", "", "", "Lkotlin/reflect/KType;", "Lkotlinx/serialization/internal/z1;", "b", "(Lkotlin/jvm/functions/Function2;)Lkotlinx/serialization/internal/z1;", "", "Z", "useClassValue", "kotlinx-serialization-core"}, m90085k = 2, m90086mv = {2, 0, 0}, m90088xi = 48)
public final class C41858o {

    /* JADX INFO: renamed from: a */
    public static final boolean f91994a;

    static {
        boolean z11;
        try {
            Class.forName("java.lang.ClassValue");
            z11 = true;
        } catch (Throwable unused) {
            z11 = false;
        }
        f91994a = z11;
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public static final <T> InterfaceC41881s2<T> m91658a(@NotNull Function1<? super KClass<?>, ? extends InterfaceC44951d<T>> factory) {
        Intrinsics.checkNotNullParameter(factory, "factory");
        return f91994a ? new C41882t(factory) : new C41902y(factory);
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public static final <T> InterfaceC41908z1<T> m91659b(@NotNull Function2<? super KClass<Object>, ? super List<? extends KType>, ? extends InterfaceC44951d<T>> factory) {
        Intrinsics.checkNotNullParameter(factory, "factory");
        return f91994a ? new C41886u(factory) : new C41906z(factory);
    }
}
