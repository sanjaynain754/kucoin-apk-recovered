package androidx.work;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import java.util.List;

/* JADX INFO: loaded from: classes34.dex */
public abstract class InputMerger {
    private static final String TAG = Logger.tagWithPrefix("InputMerger");

    @NonNull
    public abstract Data merge(@NonNull List<Data> list);

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static InputMerger fromClassName(@NonNull String str) {
        try {
            return (InputMerger) Class.forName(str).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception e11) {
            Logger.get().error(TAG, "Trouble instantiating + " + str, e11);
            return null;
        }
    }
}
