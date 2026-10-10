package androidx.credentials.exceptions.domerrors;

import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: DomError.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b&\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0002\u001a\u00020\u00038\u0017X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m90084d2 = {"Landroidx/credentials/exceptions/domerrors/DomError;", "", "type", "", "<init>", "(Ljava/lang/String;)V", "getType", "()Ljava/lang/String;", "credentials"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
public abstract class DomError {

    @NotNull
    private final String type;

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @VisibleForTesting(otherwise = 3)
    @NotNull
    public String getType() {
        return this.type;
    }

    public DomError(@NotNull String type) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.type = type;
    }
}
