package p852kotlin.reflect.jvm.internal.impl.p409km;

import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p852kotlin.contracts.ExperimentalContracts;

/* JADX INFO: compiled from: Contracts.kt */
/* JADX INFO: loaded from: classes61.dex */
@ExperimentalContracts
public final class KmContract {

    @NotNull
    private final List<KmEffect> effects = new ArrayList(1);

    @NotNull
    public final List<KmEffect> getEffects() {
        return this.effects;
    }
}
