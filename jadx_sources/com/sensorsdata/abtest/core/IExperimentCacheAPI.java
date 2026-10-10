package com.sensorsdata.abtest.core;

import com.sensorsdata.abtest.entity.Experiment;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes23.dex */
interface IExperimentCacheAPI {
    <T> T getExperimentVariableValue(String str, T t11);

    ConcurrentHashMap<String, Experiment> getExperimentsFromMemoryCache(String str);

    boolean isFuzzyExperiments(String str);

    ConcurrentHashMap<String, Experiment> loadExperimentsFromCache(String str);

    void loadExperimentsFromDiskCache();

    void saveExperiments2DiskCache(String str);

    void saveFuzzyExperiments(JSONArray jSONArray);
}
