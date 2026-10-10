package androidx.window.embedding;

import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.FunctionReferenceImpl;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: EmbeddingBackend.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90085k = 3, m90086mv = {1, 8, 0}, m90088xi = 48)
public /* synthetic */ class EmbeddingBackend$Companion$overrideDecorator$1 extends FunctionReferenceImpl implements Function1<EmbeddingBackend, EmbeddingBackend> {
    @Override // p852kotlin.jvm.functions.Function1
    @NotNull
    public final EmbeddingBackend invoke(@NotNull EmbeddingBackend p11) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        return ((EmbeddingBackendDecorator) this.receiver).decorate(p11);
    }

    public EmbeddingBackend$Companion$overrideDecorator$1(Object obj) {
        super(1, obj, EmbeddingBackendDecorator.class, "decorate", "decorate(Landroidx/window/embedding/EmbeddingBackend;)Landroidx/window/embedding/EmbeddingBackend;", 0);
    }
}
