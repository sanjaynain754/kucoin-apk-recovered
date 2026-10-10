package com.sensorsdata.abtest;

import android.content.Context;

/* JADX INFO: loaded from: classes59.dex */
public class SensorsABTestEmptyImplementation extends SensorsABTest {
    @Override // com.sensorsdata.abtest.SensorsABTest, com.sensorsdata.abtest.ISensorsABTestApi
    public <T> void asyncFetchABTest(SensorsABTestExperiment<T> sensorsABTestExperiment, OnABTestReceivedData<T> onABTestReceivedData) {
    }

    @Override // com.sensorsdata.abtest.SensorsABTest, com.sensorsdata.abtest.ISensorsABTestApi
    public <T> void fastFetchABTest(SensorsABTestExperiment<T> sensorsABTestExperiment, OnABTestReceivedData<T> onABTestReceivedData) {
    }

    @Override // com.sensorsdata.abtest.SensorsABTest, com.sensorsdata.abtest.ISensorsABTestApi
    public <T> T fetchCacheABTest(String str, T t11) {
        return null;
    }

    @Override // com.sensorsdata.abtest.SensorsABTest
    public SensorsABTestConfigOptions getConfigOptions() {
        return null;
    }

    @Override // com.sensorsdata.abtest.SensorsABTest
    public Context getContext() {
        return null;
    }

    @Override // com.sensorsdata.abtest.SensorsABTest, com.sensorsdata.abtest.ISensorsABTestApi
    public <T> void asyncFetchABTest(String str, T t11, int i11, OnABTestReceivedData<T> onABTestReceivedData) {
    }

    @Override // com.sensorsdata.abtest.SensorsABTest, com.sensorsdata.abtest.ISensorsABTestApi
    public <T> void fastFetchABTest(String str, T t11, int i11, OnABTestReceivedData<T> onABTestReceivedData) {
    }

    @Override // com.sensorsdata.abtest.SensorsABTest, com.sensorsdata.abtest.ISensorsABTestApi
    public <T> void asyncFetchABTest(String str, T t11, OnABTestReceivedData<T> onABTestReceivedData) {
    }

    @Override // com.sensorsdata.abtest.SensorsABTest, com.sensorsdata.abtest.ISensorsABTestApi
    public <T> void fastFetchABTest(String str, T t11, OnABTestReceivedData<T> onABTestReceivedData) {
    }
}
