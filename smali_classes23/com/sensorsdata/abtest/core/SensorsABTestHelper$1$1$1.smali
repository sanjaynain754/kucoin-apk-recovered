.class Lcom/sensorsdata/abtest/core/SensorsABTestHelper$1$1$1;
.super Ljava/lang/Object;
.source "SensorsABTestHelper.java"

# interfaces
.implements Lcom/sensorsdata/abtest/core/IApiCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sensorsdata/abtest/core/SensorsABTestHelper$1$1;->onTick(J)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/sensorsdata/abtest/core/IApiCallback<",
        "Ljava/util/Map<",
        "Ljava/lang/String;",
        "Lcom/sensorsdata/abtest/entity/Experiment;",
        ">;>;"
    }
.end annotation


# instance fields
.field final synthetic this$2:Lcom/sensorsdata/abtest/core/SensorsABTestHelper$1$1;


# direct methods
.method public constructor <init>(Lcom/sensorsdata/abtest/core/SensorsABTestHelper$1$1;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/sensorsdata/abtest/core/SensorsABTestHelper$1$1$1;->this$2:Lcom/sensorsdata/abtest/core/SensorsABTestHelper$1$1;

    .line 3
    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    return-void
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
.end method


# virtual methods
.method public onFailure(ILjava/lang/String;)V
    .locals 0

    .line 1
    return-void
    .line 2
    .line 3
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
    .line 18
    .line 19
    .line 20
    .line 21
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
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
.end method

.method public bridge synthetic onSuccess(Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, Ljava/util/Map;

    invoke-virtual {p0, p1}, Lcom/sensorsdata/abtest/core/SensorsABTestHelper$1$1$1;->onSuccess(Ljava/util/Map;)V

    return-void
.end method

.method public onSuccess(Ljava/util/Map;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/sensorsdata/abtest/entity/Experiment;",
            ">;)V"
        }
    .end annotation

    .line 2
    iget-object p1, p0, Lcom/sensorsdata/abtest/core/SensorsABTestHelper$1$1$1;->this$2:Lcom/sensorsdata/abtest/core/SensorsABTestHelper$1$1;

    iget-object p1, p1, Lcom/sensorsdata/abtest/core/SensorsABTestHelper$1$1;->this$1:Lcom/sensorsdata/abtest/core/SensorsABTestHelper$1;

    iget-object p1, p1, Lcom/sensorsdata/abtest/core/SensorsABTestHelper$1;->this$0:Lcom/sensorsdata/abtest/core/SensorsABTestHelper;

    invoke-static {p1}, Lcom/sensorsdata/abtest/core/SensorsABTestHelper;->access$000(Lcom/sensorsdata/abtest/core/SensorsABTestHelper;)V

    return-void
.end method
