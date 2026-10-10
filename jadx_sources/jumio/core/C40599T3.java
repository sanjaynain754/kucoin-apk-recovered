package jumio.core;

import java.io.IOException;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: jumio.core.T3 */
/* JADX INFO: loaded from: classes61.dex */
public final class C40599T3 extends IOException {

    /* JADX INFO: renamed from: a */
    public int f90127a;

    /* JADX INFO: renamed from: b */
    public final String f90128b;

    static {
        final DefaultConstructorMarker defaultConstructorMarker = null;
        new Object(defaultConstructorMarker) { // from class: com.jumio.commons.remote.exception.UnexpectedResponseException$Companion
        };
    }

    public C40599T3(int i11, String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        this.f90127a = i11;
        this.f90128b = message;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.f90128b;
    }
}
