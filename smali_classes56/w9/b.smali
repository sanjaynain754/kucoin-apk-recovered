.class public final synthetic Lw9/b;
.super Ljava/lang/Object;
.source "R8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic b:Lcom/jumio/core/sensors/SensorProxy;


# direct methods
.method public synthetic constructor <init>(Lcom/jumio/core/sensors/SensorProxy;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    iput-object p1, p0, Lw9/b;->b:Lcom/jumio/core/sensors/SensorProxy;

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
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lw9/b;->b:Lcom/jumio/core/sensors/SensorProxy;

    .line 3
    .line 4
    check-cast p1, Landroid/hardware/SensorEvent;

    .line 5
    .line 6
    .line 7
    invoke-static {v0, p1}, Lcom/jumio/core/sensors/SensorProxy;->a(Lcom/jumio/core/sensors/SensorProxy;Landroid/hardware/SensorEvent;)Lkotlin/Unit;

    .line 8
    move-result-object p1

    .line 9
    return-object p1
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
