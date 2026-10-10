.class interface abstract Lcom/sensorsdata/abtest/core/IExperimentCacheAPI;
.super Ljava/lang/Object;
.source "IExperimentCacheAPI.java"


# virtual methods
.method public abstract getExperimentVariableValue(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/String;",
            "TT;)TT;"
        }
    .end annotation
.end method

.method public abstract getExperimentsFromMemoryCache(Ljava/lang/String;)Ljava/util/concurrent/ConcurrentHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/concurrent/ConcurrentHashMap<",
            "Ljava/lang/String;",
            "Lcom/sensorsdata/abtest/entity/Experiment;",
            ">;"
        }
    .end annotation
.end method

.method public abstract isFuzzyExperiments(Ljava/lang/String;)Z
.end method

.method public abstract loadExperimentsFromCache(Ljava/lang/String;)Ljava/util/concurrent/ConcurrentHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/concurrent/ConcurrentHashMap<",
            "Ljava/lang/String;",
            "Lcom/sensorsdata/abtest/entity/Experiment;",
            ">;"
        }
    .end annotation
.end method

.method public abstract loadExperimentsFromDiskCache()V
.end method

.method public abstract saveExperiments2DiskCache(Ljava/lang/String;)V
.end method

.method public abstract saveFuzzyExperiments(Lorg/json/JSONArray;)V
.end method
