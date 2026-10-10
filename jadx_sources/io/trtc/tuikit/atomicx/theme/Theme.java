package io.trtc.tuikit.atomicx.theme;

import android.content.Context;
import io.trtc.tuikit.atomicx.theme.tokens.DesignTokenSet;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ThemeStore.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0019"}, m90084d2 = {"Lio/trtc/tuikit/atomicx/theme/Theme;", "", "id", "", "displayName", "tokens", "Lio/trtc/tuikit/atomicx/theme/tokens/DesignTokenSet;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lio/trtc/tuikit/atomicx/theme/tokens/DesignTokenSet;)V", "getId", "()Ljava/lang/String;", "getDisplayName", "getTokens", "()Lio/trtc/tuikit/atomicx/theme/tokens/DesignTokenSet;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "Companion", "atomic_x_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class Theme {

    /* JADX INFO: renamed from: d */
    @NotNull
    public static final Companion f87312d = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from toString */
    @NotNull
    public final String id;

    /* JADX INFO: renamed from: b, reason: from toString */
    @NotNull
    public final String displayName;

    /* JADX INFO: renamed from: c, reason: from toString */
    @NotNull
    public final DesignTokenSet tokens;

    /* JADX INFO: compiled from: ThemeStore.kt */
    @Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\t"}, m90084d2 = {"Lio/trtc/tuikit/atomicx/theme/Theme$Companion;", "", "<init>", "()V", "lightTheme", "Lio/trtc/tuikit/atomicx/theme/Theme;", "context", "Landroid/content/Context;", "darkTheme", "atomic_x_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @NotNull
        public final Theme darkTheme(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return new Theme("dark", "Dark", DesignTokenSet.f87404f.defaultDark(context));
        }

        @NotNull
        public final Theme lightTheme(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return new Theme("light", "Light", DesignTokenSet.f87404f.defaultLight(context));
        }
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Theme)) {
            return false;
        }
        Theme theme = (Theme) other;
        return Intrinsics.areEqual(this.id, theme.id) && Intrinsics.areEqual(this.displayName, theme.displayName) && Intrinsics.areEqual(this.tokens, theme.tokens);
    }

    public Theme(@NotNull String id2, @NotNull String displayName, @NotNull DesignTokenSet tokens) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(displayName, "displayName");
        Intrinsics.checkNotNullParameter(tokens, "tokens");
        this.id = id2;
        this.displayName = displayName;
        this.tokens = tokens;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ Theme m87975b(Theme theme, String str, String str2, DesignTokenSet designTokenSet, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = theme.id;
        }
        if ((i11 & 2) != 0) {
            str2 = theme.displayName;
        }
        if ((i11 & 4) != 0) {
            designTokenSet = theme.tokens;
        }
        return theme.m87976a(str, str2, designTokenSet);
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final Theme m87976a(@NotNull String id2, @NotNull String displayName, @NotNull DesignTokenSet tokens) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(displayName, "displayName");
        Intrinsics.checkNotNullParameter(tokens, "tokens");
        return new Theme(id2, displayName, tokens);
    }

    @NotNull
    /* JADX INFO: renamed from: c, reason: from getter */
    public final DesignTokenSet getTokens() {
        return this.tokens;
    }

    public int hashCode() {
        return (((this.id.hashCode() * 31) + this.displayName.hashCode()) * 31) + this.tokens.hashCode();
    }

    @NotNull
    public String toString() {
        return "Theme(id=" + this.id + ", displayName=" + this.displayName + ", tokens=" + this.tokens + ')';
    }
}
