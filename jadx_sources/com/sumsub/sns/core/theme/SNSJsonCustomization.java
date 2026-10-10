package com.sumsub.sns.core.theme;

import android.content.Context;
import com.kubi.sdk.BaseActivity;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\t\u0010\nJ\u0011\u0010\f\u001a\u0004\u0018\u00010\u000bH&¢\u0006\u0004\b\f\u0010\r¨\u0006\u000f"}, m90084d2 = {"Lcom/sumsub/sns/core/theme/SNSJsonCustomization;", "", "Lcom/sumsub/sns/core/theme/SNSTheme;", BaseActivity.THEME, "", "loadTheme", "(Lcom/sumsub/sns/core/theme/SNSTheme;)V", "Landroid/content/Context;", "context", "loadResources", "(Landroid/content/Context;)V", "Lcom/sumsub/sns/core/theme/SNSCustomizationTheme;", "getTheme", "()Lcom/sumsub/sns/core/theme/SNSCustomizationTheme;", "Companion", "idensic-mobile-sdk-aar_defaultRelease"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
public interface SNSJsonCustomization {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    /* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
    @Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u000b\u001a\u00020\u0006H\u0007R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\f"}, m90084d2 = {"Lcom/sumsub/sns/core/theme/SNSJsonCustomization$Companion;", "", "<init>", "()V", "defaultJsonCustomizationProvider", "Lkotlin/Function0;", "Lcom/sumsub/sns/core/theme/SNSJsonCustomization;", "getDefaultJsonCustomizationProvider", "()Lkotlin/jvm/functions/Function0;", "setDefaultJsonCustomizationProvider", "(Lkotlin/jvm/functions/Function0;)V", "create", "idensic-mobile-sdk-aar_defaultRelease"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        public static Function0<? extends SNSJsonCustomization> defaultJsonCustomizationProvider;

        @NotNull
        public final Function0<SNSJsonCustomization> getDefaultJsonCustomizationProvider() {
            Function0 function0 = defaultJsonCustomizationProvider;
            if (function0 != null) {
                return function0;
            }
            return null;
        }

        public final void setDefaultJsonCustomizationProvider(@NotNull Function0<? extends SNSJsonCustomization> function0) {
            defaultJsonCustomizationProvider = function0;
        }

        private Companion() {
        }

        @JvmStatic
        @NotNull
        public final SNSJsonCustomization create() {
            return getDefaultJsonCustomizationProvider().invoke();
        }
    }

    @Nullable
    SNSCustomizationTheme getTheme();

    void loadResources(@NotNull Context context);

    void loadTheme(@NotNull SNSTheme theme);
}
