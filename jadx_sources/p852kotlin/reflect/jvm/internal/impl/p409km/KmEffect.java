package p852kotlin.reflect.jvm.internal.impl.p409km;

import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.contracts.ExperimentalContracts;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Contracts.kt */
/* JADX INFO: loaded from: classes61.dex */
@ExperimentalContracts
public final class KmEffect {

    @Nullable
    private KmEffectExpression conclusion;

    @NotNull
    private final List<KmEffectExpression> constructorArguments;

    @Nullable
    private KmEffectInvocationKind invocationKind;

    @NotNull
    private KmEffectType type;

    @NotNull
    public final List<KmEffectExpression> getConstructorArguments() {
        return this.constructorArguments;
    }

    public final void setConclusion(@Nullable KmEffectExpression kmEffectExpression) {
        this.conclusion = kmEffectExpression;
    }

    public KmEffect(@NotNull KmEffectType type, @Nullable KmEffectInvocationKind kmEffectInvocationKind) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.type = type;
        this.invocationKind = kmEffectInvocationKind;
        this.constructorArguments = new ArrayList(1);
    }
}
