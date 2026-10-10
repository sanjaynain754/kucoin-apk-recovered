package kotlinx.serialization.internal;

import androidx.exifinterface.media.ExifInterface;
import androidx.media3.exoplayer.upstream.CmcdData;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: kotlinx.serialization.internal.v */
/* JADX INFO: compiled from: Caching.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u0000*\u0004\b\u0000\u0010\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0002B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J!\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u0006H\u0014¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m90084d2 = {"Lkotlinx/serialization/internal/v;", ExifInterface.GPS_DIRECTION_TRUE, "Ljava/lang/ClassValue;", "Lkotlinx/serialization/internal/l1;", "<init>", "()V", "Ljava/lang/Class;", "type", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Ljava/lang/Class;)Lkotlinx/serialization/internal/l1;", "kotlinx-serialization-core"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nCaching.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Caching.kt\nkotlinx/serialization/internal/ClassValueReferences\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,219:1\n1#2:220\n*E\n"})
public final class C41890v<T> extends ClassValue<C41845l1<T>> {
    @Override // java.lang.ClassValue
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C41845l1<T> computeValue(@NotNull Class<?> type) {
        Intrinsics.checkNotNullParameter(type, "type");
        return new C41845l1<>();
    }
}
