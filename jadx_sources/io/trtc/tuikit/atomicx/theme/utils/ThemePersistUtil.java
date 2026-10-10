package io.trtc.tuikit.atomicx.theme.utils;

import android.content.Context;
import android.content.SharedPreferences;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: ThemePersistUtil.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\b\u001a\u0004\u0018\u00010\tJ\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\tJ\u0006\u0010\r\u001a\u00020\u000eJ\u000e\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000eJ\u0006\u0010\u0011\u001a\u00020\u000eJ\u000e\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u000eJ\b\u0010\u0014\u001a\u0004\u0018\u00010\tJ\u000e\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\tJ\u0006\u0010\u0017\u001a\u00020\u000bR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, m90084d2 = {"Lio/trtc/tuikit/atomicx/theme/utils/ThemePersistUtil;", "", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "sharedPreferences", "Landroid/content/SharedPreferences;", "getCurrentThemeId", "", "setCurrentThemeId", "", "themeId", "getUserHasManuallySetTheme", "", "setUserHasManuallySetTheme", "hasSet", "getFollowSystemAppearance", "setFollowSystemAppearance", "follow", "getCustomPrimaryColor", "setCustomPrimaryColor", "hexColor", "clearCustomPrimaryColor", "Companion", "atomic_x_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nThemePersistUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThemePersistUtil.kt\nio/trtc/tuikit/atomicx/theme/utils/ThemePersistUtil\n+ 2 SharedPreferences.kt\nandroidx/core/content/SharedPreferencesKt\n*L\n1#1,65:1\n39#2,12:66\n39#2,12:78\n39#2,12:90\n39#2,12:102\n39#2,12:114\n*S KotlinDebug\n*F\n+ 1 ThemePersistUtil.kt\nio/trtc/tuikit/atomicx/theme/utils/ThemePersistUtil\n*L\n25#1:66,12\n35#1:78,12\n45#1:90,12\n55#1:102,12\n61#1:114,12\n*E\n"})
public final class ThemePersistUtil {

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final Companion f87418b = new Companion(null);

    /* JADX INFO: renamed from: a */
    @NotNull
    public final SharedPreferences f87419a;

    /* JADX INFO: compiled from: ThemePersistUtil.kt */
    @Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\n"}, m90084d2 = {"Lio/trtc/tuikit/atomicx/theme/utils/ThemePersistUtil$Companion;", "", "<init>", "()V", "PREFS_NAME", "", "KEY_CURRENT_THEME_ID", "KEY_USER_HAS_MANUALLY_SET_THEME", "KEY_FOLLOW_SYSTEM_APPEARANCE", "KEY_CUSTOM_PRIMARY_COLOR", "atomic_x_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    public ThemePersistUtil(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        SharedPreferences sharedPreferences = context.getSharedPreferences("theme_preferences", 0);
        Intrinsics.checkNotNullExpressionValue(sharedPreferences, "getSharedPreferences(...)");
        this.f87419a = sharedPreferences;
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    public final String m88029a() {
        return this.f87419a.getString("current_theme_id", null);
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public final String m88030b() {
        return this.f87419a.getString("custom_primary_color", null);
    }

    /* JADX INFO: renamed from: c */
    public final boolean m88031c() {
        return this.f87419a.getBoolean("follow_system_appearance", true);
    }

    /* JADX INFO: renamed from: d */
    public final boolean m88032d() {
        return this.f87419a.getBoolean("user_has_manually_set_theme", false);
    }
}
