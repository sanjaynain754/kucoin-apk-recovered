package ag0;

import io.trtc.tuikit.atomicx.theme.Theme;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: ag0.a, reason: from toString */
/* JADX INFO: compiled from: ThemeStore.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m90084d2 = {"Lio/trtc/tuikit/atomicx/theme/ThemeState;", "", "currentTheme", "Lio/trtc/tuikit/atomicx/theme/Theme;", "<init>", "(Lio/trtc/tuikit/atomicx/theme/Theme;)V", "getCurrentTheme", "()Lio/trtc/tuikit/atomicx/theme/Theme;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "atomic_x_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class ThemeState {

    /* JADX INFO: renamed from: a, reason: from toString */
    @NotNull
    public final Theme currentTheme;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof ThemeState) && Intrinsics.areEqual(this.currentTheme, ((ThemeState) other).currentTheme);
    }

    public ThemeState(@NotNull Theme currentTheme) {
        Intrinsics.checkNotNullParameter(currentTheme, "currentTheme");
        this.currentTheme = currentTheme;
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final Theme getCurrentTheme() {
        return this.currentTheme;
    }

    public int hashCode() {
        return this.currentTheme.hashCode();
    }

    @NotNull
    public String toString() {
        return "ThemeState(currentTheme=" + this.currentTheme + ')';
    }
}
