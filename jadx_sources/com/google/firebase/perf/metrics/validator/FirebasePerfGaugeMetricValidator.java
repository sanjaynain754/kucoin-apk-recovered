package com.google.firebase.perf.metrics.validator;

import com.google.firebase.perf.p070v1.GaugeMetric;

/* JADX INFO: loaded from: classes56.dex */
final class FirebasePerfGaugeMetricValidator extends PerfMetricValidator {
    private final GaugeMetric gaugeMetric;

    @Override // com.google.firebase.perf.metrics.validator.PerfMetricValidator
    public boolean isValidPerfMetric() {
        if (!this.gaugeMetric.hasSessionId()) {
            return false;
        }
        if (this.gaugeMetric.getCpuMetricReadingsCount() > 0 || this.gaugeMetric.getAndroidMemoryReadingsCount() > 0) {
            return true;
        }
        return this.gaugeMetric.hasGaugeMetadata() && this.gaugeMetric.getGaugeMetadata().hasMaxAppJavaHeapMemoryKb();
    }

    public FirebasePerfGaugeMetricValidator(GaugeMetric gaugeMetric) {
        this.gaugeMetric = gaugeMetric;
    }
}
