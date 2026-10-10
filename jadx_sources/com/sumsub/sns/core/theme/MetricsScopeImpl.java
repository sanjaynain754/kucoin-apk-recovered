package com.sumsub.sns.core.theme;

import java.util.HashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\r\b\u0000\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\u0006\u0010\u0007R \u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\bR(\u0010\u000f\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\t8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR(\u0010\u0012\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\t8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000eR(\u0010\u0015\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\t8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u0013\u0010\f\"\u0004\b\u0014\u0010\u000e¨\u0006\u0016"}, m90084d2 = {"Lcom/sumsub/sns/core/theme/MetricsScopeImpl;", "Lcom/sumsub/sns/core/theme/MetricsScope;", "Ljava/util/HashMap;", "Lcom/sumsub/sns/core/theme/SNSMetricElement;", "", "map", "<init>", "(Ljava/util/HashMap;)V", "Ljava/util/HashMap;", "", "v", "getButtonHeight", "()Ljava/lang/Float;", "setButtonHeight", "(Ljava/lang/Float;)V", "buttonHeight", "getButtonCornerRadius", "setButtonCornerRadius", "buttonCornerRadius", "getButtonBorderWidth", "setButtonBorderWidth", "buttonBorderWidth", "idensic-mobile-sdk-aar_defaultRelease"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nSNSTheme.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SNSTheme.kt\ncom/sumsub/sns/core/theme/MetricsScopeImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,789:1\n1#2:790\n*E\n"})
public final class MetricsScopeImpl implements MetricsScope {

    @NotNull
    private final HashMap<SNSMetricElement, Object> map;

    @Override // com.sumsub.sns.core.theme.MetricsScope
    public void setButtonBorderWidth(@Nullable Float f11) {
        if (f11 != null) {
            this.map.put(SNSMetricElement.BUTTON_BORDER_WIDTH, Float.valueOf(f11.floatValue()));
        }
    }

    @Override // com.sumsub.sns.core.theme.MetricsScope
    public void setButtonCornerRadius(@Nullable Float f11) {
        if (f11 != null) {
            this.map.put(SNSMetricElement.BUTTON_CORNER_RADIUS, Float.valueOf(f11.floatValue()));
        }
    }

    @Override // com.sumsub.sns.core.theme.MetricsScope
    public void setButtonHeight(@Nullable Float f11) {
        if (f11 != null) {
            this.map.put(SNSMetricElement.BUTTON_HEIGHT, Float.valueOf(f11.floatValue()));
        }
    }

    public MetricsScopeImpl(@NotNull HashMap<SNSMetricElement, Object> map) {
        this.map = map;
    }
}
