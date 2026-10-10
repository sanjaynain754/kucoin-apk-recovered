package io.trtc.tuikit.atomicx.theme;

import ag0.ThemeState;
import android.content.Context;
import com.kubi.sdk.BaseActivity;
import io.trtc.tuikit.atomicx.theme.tokens.ColorTokens;
import io.trtc.tuikit.atomicx.theme.tokens.DesignTokenSet;
import io.trtc.tuikit.atomicx.theme.utils.ColorAlgorithm;
import io.trtc.tuikit.atomicx.theme.utils.ThemePersistUtil;
import java.util.List;
import kotlinx.coroutines.flow.C41636g;
import kotlinx.coroutines.flow.C41679x;
import kotlinx.coroutines.flow.InterfaceC41669n;
import kotlinx.coroutines.flow.InterfaceC41678w;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ThemeStore.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013J\u000e\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0016J\u0010\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\b\u0010\u0018\u001a\u00020\u0011H\u0002J\u0010\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\u0010\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\u0016H\u0002J\b\u0010\u001c\u001a\u00020\u0011H\u0002R\u000e\u0010\u0006\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u000b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001e"}, m90084d2 = {"Lio/trtc/tuikit/atomicx/theme/ThemeStore;", "", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "appContext", "_themeState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lio/trtc/tuikit/atomicx/theme/ThemeState;", "themeState", "Lkotlinx/coroutines/flow/StateFlow;", "getThemeState", "()Lkotlinx/coroutines/flow/StateFlow;", "themePersistUtil", "Lio/trtc/tuikit/atomicx/theme/utils/ThemePersistUtil;", "setTheme", "", BaseActivity.THEME, "Lio/trtc/tuikit/atomicx/theme/Theme;", "setPrimaryColor", "hexColor", "", "updateThemeState", "loadPersistedTheme", "persistTheme", "loadTheme", "themeId", "loadThemeBasedOnSystemAppearance", "Companion", "atomic_x_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class ThemeStore {

    /* JADX INFO: renamed from: e */
    @NotNull
    public static final Companion f87316e = new Companion(null);

    /* JADX INFO: renamed from: f */
    @Nullable
    public static volatile ThemeStore f87317f;

    /* JADX INFO: renamed from: a */
    @NotNull
    public final Context f87318a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public final InterfaceC41669n<ThemeState> f87319b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public final InterfaceC41678w<ThemeState> f87320c;

    /* JADX INFO: renamed from: d */
    @NotNull
    public ThemePersistUtil f87321d;

    /* JADX INFO: compiled from: ThemeStore.kt */
    @Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\bR\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\t"}, m90084d2 = {"Lio/trtc/tuikit/atomicx/theme/ThemeStore$Companion;", "", "<init>", "()V", "instance", "Lio/trtc/tuikit/atomicx/theme/ThemeStore;", "shared", "context", "Landroid/content/Context;", "atomic_x_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @NotNull
        public final ThemeStore shared(@NotNull Context context) {
            ThemeStore themeStore;
            Intrinsics.checkNotNullParameter(context, "context");
            ThemeStore themeStore2 = ThemeStore.f87317f;
            if (themeStore2 != null) {
                return themeStore2;
            }
            synchronized (this) {
                themeStore = ThemeStore.f87317f;
                if (themeStore == null) {
                    Context applicationContext = context.getApplicationContext();
                    Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
                    themeStore = new ThemeStore(applicationContext, null);
                    ThemeStore.f87317f = themeStore;
                }
            }
            return themeStore;
        }
    }

    public /* synthetic */ ThemeStore(Context context, DefaultConstructorMarker defaultConstructorMarker) {
        this(context);
    }

    public ThemeStore(Context context) {
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        this.f87318a = applicationContext;
        InterfaceC41669n<ThemeState> interfaceC41669nM91009a = C41679x.m91009a(new ThemeState(Theme.f87312d.darkTheme(applicationContext)));
        this.f87319b = interfaceC41669nM91009a;
        this.f87320c = C41636g.m90907c(interfaceC41669nM91009a);
        this.f87321d = new ThemePersistUtil(applicationContext);
        m87981d();
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final InterfaceC41678w<ThemeState> m87980c() {
        return this.f87320c;
    }

    /* JADX INFO: renamed from: d */
    public final void m87981d() {
        String strM88029a;
        if (this.f87321d.m88032d() && (strM88029a = this.f87321d.m88029a()) != null) {
            m87982e(strM88029a);
        } else if (this.f87321d.m88031c()) {
            m87983f();
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m87982e(String str) {
        Theme themeDarkTheme = (!Intrinsics.areEqual(str, "light") && Intrinsics.areEqual(str, "dark")) ? Theme.f87312d.darkTheme(this.f87318a) : Theme.f87312d.lightTheme(this.f87318a);
        Theme theme = themeDarkTheme;
        String strM88030b = this.f87321d.m88030b();
        if (strM88030b == null) {
            m87984g(theme);
        } else {
            List<Integer> listM88020c = ColorAlgorithm.f87413a.m88020c(this.f87318a, strM88030b, str);
            m87984g(Theme.m87975b(theme, null, null, DesignTokenSet.m88014b(theme.getTokens(), null, null, Intrinsics.areEqual(str, "dark") ? ColorTokens.f87322B0.generateDarkTokens(this.f87318a, listM88020c) : ColorTokens.f87322B0.generateLightTokens(this.f87318a, listM88020c), null, null, 27, null), 3, null));
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m87984g(Theme theme) {
        this.f87319b.setValue(new ThemeState(theme));
    }

    /* JADX INFO: renamed from: f */
    public final void m87983f() {
    }
}
