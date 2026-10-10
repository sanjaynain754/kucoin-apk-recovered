package com.sensorsdata.abtest;

/* JADX INFO: loaded from: classes23.dex */
interface ISensorsABTestApi {
    <T> void asyncFetchABTest(SensorsABTestExperiment<T> sensorsABTestExperiment, OnABTestReceivedData<T> onABTestReceivedData);

    <T> void asyncFetchABTest(String str, T t11, int i11, OnABTestReceivedData<T> onABTestReceivedData);

    <T> void asyncFetchABTest(String str, T t11, OnABTestReceivedData<T> onABTestReceivedData);

    <T> void fastFetchABTest(SensorsABTestExperiment<T> sensorsABTestExperiment, OnABTestReceivedData<T> onABTestReceivedData);

    <T> void fastFetchABTest(String str, T t11, int i11, OnABTestReceivedData<T> onABTestReceivedData);

    <T> void fastFetchABTest(String str, T t11, OnABTestReceivedData<T> onABTestReceivedData);

    <T> T fetchCacheABTest(String str, T t11);
}
