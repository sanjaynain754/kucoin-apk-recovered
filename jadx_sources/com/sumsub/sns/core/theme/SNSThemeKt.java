package com.sumsub.sns.core.theme;

import com.p059BV.LinearGradient.LinearGradientManager;
import com.tencent.bugly.proguard.C33675gh;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a*\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0017\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u0004¢\u0006\u0004\b\u0006\u0010\u0007\u001a*\u0010\t\u001a\u00020\u0003*\u00020\u00002\u0017\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u0004¢\u0006\u0004\b\t\u0010\u0007\u001a&\u0010\n\u001a\u00020\u00002\u0017\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u0004¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m90084d2 = {"Lcom/sumsub/sns/core/theme/SNSTheme;", "Lkotlin/Function1;", "Lcom/sumsub/sns/core/theme/MetricsScope;", "", "Lkotlin/ExtensionFunctionType;", "block", C33675gh.f70007m, "(Lcom/sumsub/sns/core/theme/SNSTheme;Lkotlin/jvm/functions/Function1;)V", "Lcom/sumsub/sns/core/theme/ColorsScope;", LinearGradientManager.PROP_COLORS, "SNSTheme", "(Lkotlin/jvm/functions/Function1;)Lcom/sumsub/sns/core/theme/SNSTheme;", "idensic-mobile-sdk-aar_defaultRelease"}, m90085k = 2, m90086mv = {2, 1, 0}, m90088xi = 48)
public final class SNSThemeKt {
    @NotNull
    public static final SNSTheme SNSTheme(@NotNull Function1<? super SNSTheme, Unit> function1) {
        SNSThemeImpl sNSThemeImpl = new SNSThemeImpl();
        function1.invoke(sNSThemeImpl);
        return sNSThemeImpl;
    }

    public static final void colors(@NotNull SNSTheme sNSTheme, @NotNull Function1<? super ColorsScope, Unit> function1) {
        function1.invoke(((SNSThemeImpl) sNSTheme).getColorsScope());
    }

    public static final void metrics(@NotNull SNSTheme sNSTheme, @NotNull Function1<? super MetricsScope, Unit> function1) {
        function1.invoke(((SNSThemeImpl) sNSTheme).getMetricsScope());
    }
}
