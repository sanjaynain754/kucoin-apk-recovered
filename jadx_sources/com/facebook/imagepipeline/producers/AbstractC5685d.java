package com.facebook.imagepipeline.producers;

import com.facebook.imagepipeline.producers.C5677a0;
import java.util.Map;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;

/* JADX INFO: renamed from: com.facebook.imagepipeline.producers.d */
/* JADX INFO: compiled from: BaseNetworkFetcher.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\b&\u0018\u0000*\n\b\u0000\u0010\u0002*\u0004\u0018\u00010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ-\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f2\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, m90084d2 = {"Lcom/facebook/imagepipeline/producers/d;", "Lcom/facebook/imagepipeline/producers/a0;", "FETCH_STATE", "Lcom/facebook/imagepipeline/producers/p0;", "<init>", "()V", "fetchState", "", "shouldPropagate", "(Lcom/facebook/imagepipeline/producers/a0;)Z", "", "byteSize", "", "onFetchCompletion", "(Lcom/facebook/imagepipeline/producers/a0;I)V", "", "", "getExtraMap", "(Lcom/facebook/imagepipeline/producers/a0;I)Ljava/util/Map;", "imagepipeline_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public abstract class AbstractC5685d<FETCH_STATE extends C5677a0> implements InterfaceC5719p0<FETCH_STATE> {
    @Override // com.facebook.imagepipeline.producers.InterfaceC5719p0
    @Nullable
    public Map<String, String> getExtraMap(FETCH_STATE fetchState, int byteSize) {
        return null;
    }

    @Override // com.facebook.imagepipeline.producers.InterfaceC5719p0
    public boolean shouldPropagate(FETCH_STATE fetchState) {
        return true;
    }

    @Override // com.facebook.imagepipeline.producers.InterfaceC5719p0
    public void onFetchCompletion(FETCH_STATE fetchState, int byteSize) {
    }
}
