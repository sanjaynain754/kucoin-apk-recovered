package com.facebook.imagepipeline.producers;

import com.facebook.imagepipeline.cache.InterfaceC5648f;
import org.jetbrains.annotations.NotNull;
import p006a4.AbstractC0110a;
import p547q3.InterfaceC43595a;
import p549q5.InterfaceC43619h;
import p749x5.InterfaceC46071e;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: BitmapMemoryCacheGetProducer.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u0000 \u00172\u00020\u0001:\u0001\u0018B7\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0012\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\t0\b¢\u0006\u0004\b\u000b\u0010\fJ?\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\t0\r2\u0012\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\t0\r2\u0006\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0010H\u0014¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0014H\u0014¢\u0006\u0004\b\u0017\u0010\u0016¨\u0006\u0019"}, m90084d2 = {"Lcom/facebook/imagepipeline/producers/BitmapMemoryCacheGetProducer;", "Lcom/facebook/imagepipeline/producers/h;", "Lcom/facebook/imagepipeline/cache/f;", "Lq3/a;", "Lx5/e;", "memoryCache", "Lq5/h;", "cacheKeyFactory", "Lcom/facebook/imagepipeline/producers/v0;", "La4/a;", "inputProducer", "<init>", "(Lcom/facebook/imagepipeline/cache/f;Lq5/h;Lcom/facebook/imagepipeline/producers/v0;)V", "Lcom/facebook/imagepipeline/producers/m;", "consumer", "cacheKey", "", "isMemoryCacheEnabled", "g", "(Lcom/facebook/imagepipeline/producers/m;Lq3/a;Z)Lcom/facebook/imagepipeline/producers/m;", "", "e", "()Ljava/lang/String;", "d", "Companion", "imagepipeline_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public final class BitmapMemoryCacheGetProducer extends C5697h {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BitmapMemoryCacheGetProducer(@NotNull InterfaceC5648f<InterfaceC43595a, InterfaceC46071e> memoryCache, @NotNull InterfaceC43619h cacheKeyFactory, @NotNull InterfaceC5731v0<AbstractC0110a<InterfaceC46071e>> inputProducer) {
        super(memoryCache, cacheKeyFactory, inputProducer);
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(cacheKeyFactory, "cacheKeyFactory");
        Intrinsics.checkNotNullParameter(inputProducer, "inputProducer");
    }

    @Override // com.facebook.imagepipeline.producers.C5697h
    @NotNull
    /* JADX INFO: renamed from: e */
    public String mo9522e() {
        return "BitmapMemoryCacheGetProducer";
    }

    @Override // com.facebook.imagepipeline.producers.C5697h
    @NotNull
    /* JADX INFO: renamed from: g */
    public InterfaceC5712m<AbstractC0110a<InterfaceC46071e>> mo9523g(@NotNull InterfaceC5712m<AbstractC0110a<InterfaceC46071e>> consumer, @NotNull InterfaceC43595a cacheKey, boolean isMemoryCacheEnabled) {
        Intrinsics.checkNotNullParameter(consumer, "consumer");
        Intrinsics.checkNotNullParameter(cacheKey, "cacheKey");
        return consumer;
    }

    @Override // com.facebook.imagepipeline.producers.C5697h
    @NotNull
    /* JADX INFO: renamed from: d */
    public String mo9521d() {
        return "pipe_ui";
    }
}
