package com.sumsub.sns.core.theme;

import java.util.Map;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u0003H&J\u0014\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0003H&J\u0014\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u0003H&¨\u0006\u000b"}, m90084d2 = {"Lcom/sumsub/sns/core/theme/SNSTheme;", "", "getMetrics", "", "Lcom/sumsub/sns/core/theme/SNSMetricElement;", "getFonts", "Lcom/sumsub/sns/core/theme/SNSTypographyElement;", "Lcom/sumsub/sns/core/theme/SNSThemeFont;", "getColors", "Lcom/sumsub/sns/core/theme/SNSColorElement;", "Lcom/sumsub/sns/core/theme/SNSThemeColor;", "idensic-mobile-sdk-aar_defaultRelease"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
public interface SNSTheme {
    @NotNull
    Map<SNSColorElement, SNSThemeColor> getColors();

    @NotNull
    Map<SNSTypographyElement, SNSThemeFont> getFonts();

    @NotNull
    Map<SNSMetricElement, Object> getMetrics();
}
