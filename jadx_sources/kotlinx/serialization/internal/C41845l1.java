package kotlinx.serialization.internal;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.exifinterface.media.ExifInterface;
import androidx.media3.exoplayer.upstream.CmcdData;
import java.lang.ref.SoftReference;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmField;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: kotlinx.serialization.internal.l1 */
/* JADX INFO: compiled from: Caching.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001b\u0010\u0007\u001a\u00028\u00002\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\u0007\u0010\bR\u001c\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, m90084d2 = {"Lkotlinx/serialization/internal/l1;", ExifInterface.GPS_DIRECTION_TRUE, "", "<init>", "()V", "Lkotlin/Function0;", "factory", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "Ljava/lang/ref/SoftReference;", TypedValues.Custom.S_REFERENCE, "Ljava/lang/ref/SoftReference;", "kotlinx-serialization-core"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nCaching.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Caching.kt\nkotlinx/serialization/internal/MutableSoftReference\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,219:1\n1#2:220\n*E\n"})
public final class C41845l1<T> {

    @JvmField
    @NotNull
    public volatile SoftReference<T> reference = new SoftReference<>(null);

    /* JADX INFO: renamed from: a */
    public final synchronized T m91634a(@NotNull Function0<? extends T> factory) {
        Intrinsics.checkNotNullParameter(factory, "factory");
        T t11 = this.reference.get();
        if (t11 != null) {
            return t11;
        }
        T tInvoke = factory.invoke();
        this.reference = new SoftReference<>(tInvoke);
        return tInvoke;
    }
}
