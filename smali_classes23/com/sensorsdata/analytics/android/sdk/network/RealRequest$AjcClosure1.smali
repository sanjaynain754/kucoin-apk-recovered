.class public Lcom/sensorsdata/analytics/android/sdk/network/RealRequest$AjcClosure1;
.super Lorg/aspectj/runtime/internal/a;
.source "RealRequest.java"


# direct methods
.method public constructor <init>([Ljava/lang/Object;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0, p1}, Lorg/aspectj/runtime/internal/a;-><init>([Ljava/lang/Object;)V

    .line 4
    return-void
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
.end method


# virtual methods
.method public run([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    .line 2
    iget-object p1, p0, Lorg/aspectj/runtime/internal/a;->state:[Ljava/lang/Object;

    .line 3
    const/4 v0, 0x0

    .line 4
    .line 5
    aget-object v0, p1, v0

    .line 6
    .line 7
    check-cast v0, Lcom/sensorsdata/analytics/android/sdk/network/RealRequest;

    .line 8
    const/4 v1, 0x1

    .line 9
    .line 10
    aget-object v1, p1, v1

    .line 11
    .line 12
    check-cast v1, Ljava/net/HttpURLConnection;

    .line 13
    const/4 v2, 0x2

    .line 14
    .line 15
    aget-object p1, p1, v2

    .line 16
    .line 17
    check-cast p1, Lorg/aspectj/lang/a;

    .line 18
    .line 19
    .line 20
    invoke-static {v0, v1, p1}, Lcom/sensorsdata/analytics/android/sdk/network/RealRequest;->getRealResponse_aroundBody0(Lcom/sensorsdata/analytics/android/sdk/network/RealRequest;Ljava/net/HttpURLConnection;Lorg/aspectj/lang/a;)Lcom/sensorsdata/analytics/android/sdk/network/RealResponse;

    .line 21
    move-result-object p1

    .line 22
    return-object p1
    .line 23
    .line 24
.end method
