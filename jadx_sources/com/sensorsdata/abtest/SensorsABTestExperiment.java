package com.sensorsdata.abtest;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes59.dex */
public class SensorsABTestExperiment<T> {
    protected final T defaultValue;
    protected final String paramName;
    protected Map<String, Object> properties;
    protected int timeoutMillSeconds;

    public static class ExperimentBuilder<T> {
        private final SensorsABTestExperiment<T> experiment;

        public ExperimentBuilder<T> addProperty(String str, CharSequence charSequence) {
            addObjectProperty(str, charSequence);
            return this;
        }

        private ExperimentBuilder(String str, T t11) {
            this.experiment = new SensorsABTestExperiment<>(str, t11);
        }

        private void addObjectProperty(String str, Object obj) {
            SensorsABTestExperiment<T> sensorsABTestExperiment = this.experiment;
            if (sensorsABTestExperiment.properties == null) {
                sensorsABTestExperiment.properties = new HashMap();
            }
            this.experiment.properties.put(str, obj);
        }

        public ExperimentBuilder<T> addProperty(String str, boolean z11) {
            addObjectProperty(str, Boolean.valueOf(z11));
            return this;
        }

        public SensorsABTestExperiment<T> create() {
            return this.experiment;
        }

        public ExperimentBuilder<T> setTimeoutMillSeconds(int i11) {
            this.experiment.timeoutMillSeconds = i11;
            return this;
        }

        public ExperimentBuilder<T> addProperty(String str, Number number) {
            addObjectProperty(str, number);
            return this;
        }

        public ExperimentBuilder<T> addProperty(String str, List<String> list) {
            addObjectProperty(str, list);
            return this;
        }

        public ExperimentBuilder<T> addProperty(String str, Date date) {
            addObjectProperty(str, date);
            return this;
        }
    }

    private SensorsABTestExperiment(String str, T t11) {
        this.timeoutMillSeconds = 30000;
        this.paramName = str;
        this.defaultValue = t11;
    }

    public static <T> ExperimentBuilder<T> newBuilder(String str, T t11) {
        return new ExperimentBuilder<>(str, t11);
    }

    public String toString() {
        return "SensorsABTestExperiment{paramName='" + this.paramName + "', defaultValue=" + this.defaultValue + ", properties=" + this.properties + ", timeoutMillSeconds=" + this.timeoutMillSeconds + '}';
    }
}
