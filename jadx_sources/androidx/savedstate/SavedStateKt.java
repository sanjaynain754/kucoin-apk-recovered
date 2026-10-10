package androidx.savedstate;

import android.os.Bundle;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"androidx/savedstate/SavedStateKt__SavedStateKt", "androidx/savedstate/SavedStateKt__SavedState_androidKt"}, m90085k = 4, m90086mv = {2, 0, 0}, m90088xi = 48)
public final class SavedStateKt {
    @NotNull
    public static final Bundle savedState(@NotNull Bundle bundle, @NotNull Function1<? super SavedStateWriter, Unit> function1) {
        return SavedStateKt__SavedState_androidKt.savedState(bundle, function1);
    }

    @NotNull
    public static final Bundle savedState(@NotNull Map<String, ? extends Object> map, @NotNull Function1<? super SavedStateWriter, Unit> function1) {
        return SavedStateKt__SavedState_androidKt.savedState(map, function1);
    }

    public static final <T> T read(@NotNull Bundle bundle, @NotNull Function1<? super SavedStateReader, ? extends T> function1) {
        return (T) SavedStateKt__SavedStateKt.read(bundle, function1);
    }

    public static final <T> T write(@NotNull Bundle bundle, @NotNull Function1<? super SavedStateWriter, ? extends T> function1) {
        return (T) SavedStateKt__SavedStateKt.write(bundle, function1);
    }
}
