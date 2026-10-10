package com.facebook.imagepipeline.producers;

import java.util.Map;

/* JADX INFO: renamed from: com.facebook.imagepipeline.producers.z0 */
/* JADX INFO: compiled from: ProducerListener.java */
/* JADX INFO: loaded from: classes34.dex */
public interface InterfaceC5739z0 {
    void onProducerEvent(String str, String str2, String str3);

    void onProducerFinishWithCancellation(String str, String str2, Map<String, String> map);

    void onProducerFinishWithFailure(String str, String str2, Throwable th2, Map<String, String> map);

    void onProducerFinishWithSuccess(String str, String str2, Map<String, String> map);

    void onProducerStart(String str, String str2);

    void onUltimateProducerReached(String str, String str2, boolean z11);

    boolean requiresExtraMap(String str);
}
