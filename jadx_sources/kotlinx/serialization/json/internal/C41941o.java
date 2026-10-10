package kotlinx.serialization.json.internal;

import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: kotlinx.serialization.json.internal.o */
/* JADX INFO: compiled from: Composers.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m90084d2 = {"Lkotlinx/serialization/json/internal/o;", "Lkotlinx/serialization/json/internal/n;", "Lkotlinx/serialization/json/internal/InternalJsonWriter;", "writer", "", "forceQuoting", "<init>", "(Lkotlinx/serialization/json/internal/InternalJsonWriter;Z)V", "", "value", "", "n", "(Ljava/lang/String;)V", "c", "Z", "kotlinx-serialization-json"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public final class C41941o extends C41939n {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public final boolean forceQuoting;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C41941o(@NotNull InternalJsonWriter writer, boolean z11) {
        super(writer);
        Intrinsics.checkNotNullParameter(writer, "writer");
        this.forceQuoting = z11;
    }

    @Override // kotlinx.serialization.json.internal.C41939n
    /* JADX INFO: renamed from: n */
    public void mo91977n(@NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        if (this.forceQuoting) {
            super.mo91977n(value);
        } else {
            super.m91974k(value);
        }
    }
}
