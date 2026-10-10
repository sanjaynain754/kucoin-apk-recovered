package gf0;

import androidx.annotation.NonNull;
import java.io.IOException;

/* JADX INFO: renamed from: gf0.a */
/* JADX INFO: compiled from: AppendableUtils.java */
/* JADX INFO: loaded from: classes60.dex */
public abstract class AbstractC37903a {
    /* JADX INFO: renamed from: a */
    public static void m85677a(@NonNull Appendable appendable, char c11) {
        try {
            appendable.append(c11);
        } catch (IOException e11) {
            throw new RuntimeException(e11);
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m85678b(@NonNull Appendable appendable, @NonNull CharSequence charSequence) {
        try {
            appendable.append(charSequence);
        } catch (IOException e11) {
            throw new RuntimeException(e11);
        }
    }
}
