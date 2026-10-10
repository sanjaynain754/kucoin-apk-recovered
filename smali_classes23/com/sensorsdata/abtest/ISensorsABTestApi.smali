.class interface abstract Lcom/sensorsdata/abtest/ISensorsABTestApi;
.super Ljava/lang/Object;
.source "ISensorsABTestApi.java"


# virtual methods
.method public abstract asyncFetchABTest(Lcom/sensorsdata/abtest/SensorsABTestExperiment;Lcom/sensorsdata/abtest/OnABTestReceivedData;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/sensorsdata/abtest/SensorsABTestExperiment<",
            "TT;>;",
            "Lcom/sensorsdata/abtest/OnABTestReceivedData<",
            "TT;>;)V"
        }
    .end annotation
.end method

.method public abstract asyncFetchABTest(Ljava/lang/String;Ljava/lang/Object;ILcom/sensorsdata/abtest/OnABTestReceivedData;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/String;",
            "TT;I",
            "Lcom/sensorsdata/abtest/OnABTestReceivedData<",
            "TT;>;)V"
        }
    .end annotation
.end method

.method public abstract asyncFetchABTest(Ljava/lang/String;Ljava/lang/Object;Lcom/sensorsdata/abtest/OnABTestReceivedData;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/String;",
            "TT;",
            "Lcom/sensorsdata/abtest/OnABTestReceivedData<",
            "TT;>;)V"
        }
    .end annotation
.end method

.method public abstract fastFetchABTest(Lcom/sensorsdata/abtest/SensorsABTestExperiment;Lcom/sensorsdata/abtest/OnABTestReceivedData;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/sensorsdata/abtest/SensorsABTestExperiment<",
            "TT;>;",
            "Lcom/sensorsdata/abtest/OnABTestReceivedData<",
            "TT;>;)V"
        }
    .end annotation
.end method

.method public abstract fastFetchABTest(Ljava/lang/String;Ljava/lang/Object;ILcom/sensorsdata/abtest/OnABTestReceivedData;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/String;",
            "TT;I",
            "Lcom/sensorsdata/abtest/OnABTestReceivedData<",
            "TT;>;)V"
        }
    .end annotation
.end method

.method public abstract fastFetchABTest(Ljava/lang/String;Ljava/lang/Object;Lcom/sensorsdata/abtest/OnABTestReceivedData;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/String;",
            "TT;",
            "Lcom/sensorsdata/abtest/OnABTestReceivedData<",
            "TT;>;)V"
        }
    .end annotation
.end method

.method public abstract fetchCacheABTest(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;
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
