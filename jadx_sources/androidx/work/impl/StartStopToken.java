package androidx.work.impl;

import androidx.work.impl.model.WorkGenerationalId;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: StartStopToken.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m90084d2 = {"Landroidx/work/impl/StartStopToken;", "", "id", "Landroidx/work/impl/model/WorkGenerationalId;", "(Landroidx/work/impl/model/WorkGenerationalId;)V", "getId", "()Landroidx/work/impl/model/WorkGenerationalId;", "work-runtime_release"}, m90085k = 1, m90086mv = {1, 7, 1}, m90088xi = 48)
public final class StartStopToken {

    @NotNull
    private final WorkGenerationalId id;

    public StartStopToken(@NotNull WorkGenerationalId id2) {
        Intrinsics.checkNotNullParameter(id2, "id");
        this.id = id2;
    }

    @NotNull
    public final WorkGenerationalId getId() {
        return this.id;
    }
}
