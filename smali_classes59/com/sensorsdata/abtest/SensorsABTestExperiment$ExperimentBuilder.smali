.class public Lcom/sensorsdata/abtest/SensorsABTestExperiment$ExperimentBuilder;
.super Ljava/lang/Object;
.source "SensorsABTestExperiment.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/sensorsdata/abtest/SensorsABTestExperiment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "ExperimentBuilder"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field private final experiment:Lcom/sensorsdata/abtest/SensorsABTestExperiment;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/sensorsdata/abtest/SensorsABTestExperiment<",
            "TT;>;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>(Ljava/lang/String;Ljava/lang/Object;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "TT;)V"
        }
    .end annotation

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    new-instance v0, Lcom/sensorsdata/abtest/SensorsABTestExperiment;

    const/4 v1, 0x0

    invoke-direct {v0, p1, p2, v1}, Lcom/sensorsdata/abtest/SensorsABTestExperiment;-><init>(Ljava/lang/String;Ljava/lang/Object;Lcom/sensorsdata/abtest/SensorsABTestExperiment$1;)V

    iput-object v0, p0, Lcom/sensorsdata/abtest/SensorsABTestExperiment$ExperimentBuilder;->experiment:Lcom/sensorsdata/abtest/SensorsABTestExperiment;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/Object;Lcom/sensorsdata/abtest/SensorsABTestExperiment$1;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/sensorsdata/abtest/SensorsABTestExperiment$ExperimentBuilder;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method private addObjectProperty(Ljava/lang/String;Ljava/lang/Object;)V
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sensorsdata/abtest/SensorsABTestExperiment$ExperimentBuilder;->experiment:Lcom/sensorsdata/abtest/SensorsABTestExperiment;

    .line 3
    .line 4
    iget-object v1, v0, Lcom/sensorsdata/abtest/SensorsABTestExperiment;->properties:Ljava/util/Map;

    .line 5
    .line 6
    if-nez v1, :cond_0

    .line 7
    .line 8
    new-instance v1, Ljava/util/HashMap;

    .line 9
    .line 10
    .line 11
    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 12
    .line 13
    iput-object v1, v0, Lcom/sensorsdata/abtest/SensorsABTestExperiment;->properties:Ljava/util/Map;

    .line 14
    .line 15
    :cond_0
    iget-object v0, p0, Lcom/sensorsdata/abtest/SensorsABTestExperiment$ExperimentBuilder;->experiment:Lcom/sensorsdata/abtest/SensorsABTestExperiment;

    .line 16
    .line 17
    iget-object v0, v0, Lcom/sensorsdata/abtest/SensorsABTestExperiment;->properties:Ljava/util/Map;

    .line 18
    .line 19
    .line 20
    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 21
    return-void
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
.end method


# virtual methods
.method public addProperty(Ljava/lang/String;Ljava/lang/CharSequence;)Lcom/sensorsdata/abtest/SensorsABTestExperiment$ExperimentBuilder;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/CharSequence;",
            ")",
            "Lcom/sensorsdata/abtest/SensorsABTestExperiment$ExperimentBuilder<",
            "TT;>;"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/sensorsdata/abtest/SensorsABTestExperiment$ExperimentBuilder;->addObjectProperty(Ljava/lang/String;Ljava/lang/Object;)V

    return-object p0
.end method

.method public addProperty(Ljava/lang/String;Ljava/lang/Number;)Lcom/sensorsdata/abtest/SensorsABTestExperiment$ExperimentBuilder;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/Number;",
            ")",
            "Lcom/sensorsdata/abtest/SensorsABTestExperiment$ExperimentBuilder<",
            "TT;>;"
        }
    .end annotation

    .line 3
    invoke-direct {p0, p1, p2}, Lcom/sensorsdata/abtest/SensorsABTestExperiment$ExperimentBuilder;->addObjectProperty(Ljava/lang/String;Ljava/lang/Object;)V

    return-object p0
.end method

.method public addProperty(Ljava/lang/String;Ljava/util/Date;)Lcom/sensorsdata/abtest/SensorsABTestExperiment$ExperimentBuilder;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Date;",
            ")",
            "Lcom/sensorsdata/abtest/SensorsABTestExperiment$ExperimentBuilder<",
            "TT;>;"
        }
    .end annotation

    .line 5
    invoke-direct {p0, p1, p2}, Lcom/sensorsdata/abtest/SensorsABTestExperiment$ExperimentBuilder;->addObjectProperty(Ljava/lang/String;Ljava/lang/Object;)V

    return-object p0
.end method

.method public addProperty(Ljava/lang/String;Ljava/util/List;)Lcom/sensorsdata/abtest/SensorsABTestExperiment$ExperimentBuilder;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)",
            "Lcom/sensorsdata/abtest/SensorsABTestExperiment$ExperimentBuilder<",
            "TT;>;"
        }
    .end annotation

    .line 4
    invoke-direct {p0, p1, p2}, Lcom/sensorsdata/abtest/SensorsABTestExperiment$ExperimentBuilder;->addObjectProperty(Ljava/lang/String;Ljava/lang/Object;)V

    return-object p0
.end method

.method public addProperty(Ljava/lang/String;Z)Lcom/sensorsdata/abtest/SensorsABTestExperiment$ExperimentBuilder;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Z)",
            "Lcom/sensorsdata/abtest/SensorsABTestExperiment$ExperimentBuilder<",
            "TT;>;"
        }
    .end annotation

    .line 2
    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p2

    invoke-direct {p0, p1, p2}, Lcom/sensorsdata/abtest/SensorsABTestExperiment$ExperimentBuilder;->addObjectProperty(Ljava/lang/String;Ljava/lang/Object;)V

    return-object p0
.end method

.method public create()Lcom/sensorsdata/abtest/SensorsABTestExperiment;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/sensorsdata/abtest/SensorsABTestExperiment<",
            "TT;>;"
        }
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sensorsdata/abtest/SensorsABTestExperiment$ExperimentBuilder;->experiment:Lcom/sensorsdata/abtest/SensorsABTestExperiment;

    .line 3
    return-object v0
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
.end method

.method public setTimeoutMillSeconds(I)Lcom/sensorsdata/abtest/SensorsABTestExperiment$ExperimentBuilder;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "Lcom/sensorsdata/abtest/SensorsABTestExperiment$ExperimentBuilder<",
            "TT;>;"
        }
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sensorsdata/abtest/SensorsABTestExperiment$ExperimentBuilder;->experiment:Lcom/sensorsdata/abtest/SensorsABTestExperiment;

    .line 3
    .line 4
    iput p1, v0, Lcom/sensorsdata/abtest/SensorsABTestExperiment;->timeoutMillSeconds:I

    .line 5
    return-object p0
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
.end method
