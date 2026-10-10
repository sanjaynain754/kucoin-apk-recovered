package za0;

import androidx.annotation.ColorInt;
import androidx.core.graphics.ColorUtils;
import org.jetbrains.annotations.NotNull;
import ya0.AbstractC46424c;
import ya0.C46422a;
import ya0.C46423b;

/* JADX INFO: renamed from: za0.d */
/* JADX INFO: loaded from: classes59.dex */
public final class C46745d {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C46745d f104568a = new C46745d();

    /* JADX INFO: renamed from: b */
    public final boolean m103000b(@ColorInt int i11) {
        return ColorUtils.calculateContrast(-1, i11) >= 3.0d;
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final AbstractC46424c m102999a(@ColorInt int i11) {
        if (m103000b(i11)) {
            return C46423b.f104093d;
        }
        return C46422a.f104092d;
    }
}
