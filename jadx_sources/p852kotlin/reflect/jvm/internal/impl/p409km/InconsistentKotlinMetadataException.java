package p852kotlin.reflect.jvm.internal.impl.p409km;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: InconsistentKotlinMetadataException.kt */
/* JADX INFO: loaded from: classes61.dex */
public final class InconsistentKotlinMetadataException extends IllegalArgumentException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InconsistentKotlinMetadataException(@NotNull String message, @Nullable Throwable th2) {
        super(message, th2);
        Intrinsics.checkNotNullParameter(message, "message");
    }

    public /* synthetic */ InconsistentKotlinMetadataException(String str, Throwable th2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i11 & 2) != 0 ? null : th2);
    }
}
