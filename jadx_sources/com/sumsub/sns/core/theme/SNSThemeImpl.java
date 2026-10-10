package com.sumsub.sns.core.theme;

import com.p059BV.LinearGradient.LinearGradientManager;
import com.tencent.bugly.proguard.C33675gh;
import java.util.HashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0004H\u0016¢\u0006\u0004\b\n\u0010\u0007J\u001b\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\u0004H\u0016¢\u0006\u0004\b\r\u0010\u0007R \u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0012\u001a\u00020\u00118\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R \u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0010R\u001a\u0010\u0018\u001a\u00020\u00178\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR \u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0010R\u001a\u0010\u001e\u001a\u00020\u001d8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!¨\u0006\""}, m90084d2 = {"Lcom/sumsub/sns/core/theme/SNSThemeImpl;", "", "<init>", "()V", "", "Lcom/sumsub/sns/core/theme/SNSMetricElement;", "getMetrics", "()Ljava/util/Map;", "Lcom/sumsub/sns/core/theme/SNSTypographyElement;", "Lcom/sumsub/sns/core/theme/SNSThemeFont;", "getFonts", "Lcom/sumsub/sns/core/theme/SNSColorElement;", "Lcom/sumsub/sns/core/theme/SNSThemeColor;", "getColors", "Ljava/util/HashMap;", C33675gh.f70007m, "Ljava/util/HashMap;", "Lcom/sumsub/sns/core/theme/MetricsScopeImpl;", "MetricsScope", "Lcom/sumsub/sns/core/theme/MetricsScopeImpl;", "getMetricsScope$idensic_mobile_sdk_aar_defaultRelease", "()Lcom/sumsub/sns/core/theme/MetricsScopeImpl;", "fonts", "Lcom/sumsub/sns/core/theme/FontsScopeImpl;", "FontsScope", "Lcom/sumsub/sns/core/theme/FontsScopeImpl;", "getFontsScope$idensic_mobile_sdk_aar_defaultRelease", "()Lcom/sumsub/sns/core/theme/FontsScopeImpl;", LinearGradientManager.PROP_COLORS, "Lcom/sumsub/sns/core/theme/ColorsScopeImpl;", "ColorsScope", "Lcom/sumsub/sns/core/theme/ColorsScopeImpl;", "getColorsScope$idensic_mobile_sdk_aar_defaultRelease", "()Lcom/sumsub/sns/core/theme/ColorsScopeImpl;", "idensic-mobile-sdk-aar_defaultRelease"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
public final class SNSThemeImpl implements SNSTheme {

    @NotNull
    private final ColorsScopeImpl ColorsScope;

    @NotNull
    private final FontsScopeImpl FontsScope;

    @NotNull
    private final MetricsScopeImpl MetricsScope;

    @NotNull
    private final HashMap<SNSColorElement, SNSThemeColor> colors;

    @NotNull
    private final HashMap<SNSTypographyElement, SNSThemeFont> fonts;

    @NotNull
    private final HashMap<SNSMetricElement, Object> metrics;

    @Override // com.sumsub.sns.core.theme.SNSTheme
    @NotNull
    public Map<SNSColorElement, SNSThemeColor> getColors() {
        return this.colors;
    }

    @NotNull
    /* JADX INFO: renamed from: getColorsScope$idensic_mobile_sdk_aar_defaultRelease, reason: from getter */
    public final ColorsScopeImpl getColorsScope() {
        return this.ColorsScope;
    }

    @Override // com.sumsub.sns.core.theme.SNSTheme
    @NotNull
    public Map<SNSTypographyElement, SNSThemeFont> getFonts() {
        return this.fonts;
    }

    @Override // com.sumsub.sns.core.theme.SNSTheme
    @NotNull
    public Map<SNSMetricElement, Object> getMetrics() {
        return this.metrics;
    }

    @NotNull
    /* JADX INFO: renamed from: getMetricsScope$idensic_mobile_sdk_aar_defaultRelease, reason: from getter */
    public final MetricsScopeImpl getMetricsScope() {
        return this.MetricsScope;
    }

    public SNSThemeImpl() {
        HashMap<SNSMetricElement, Object> map = new HashMap<>();
        this.metrics = map;
        this.MetricsScope = new MetricsScopeImpl(map);
        HashMap<SNSTypographyElement, SNSThemeFont> map2 = new HashMap<>();
        this.fonts = map2;
        this.FontsScope = new FontsScopeImpl(map2);
        HashMap<SNSColorElement, SNSThemeColor> map3 = new HashMap<>();
        this.colors = map3;
        this.ColorsScope = new ColorsScopeImpl(map3);
    }
}
