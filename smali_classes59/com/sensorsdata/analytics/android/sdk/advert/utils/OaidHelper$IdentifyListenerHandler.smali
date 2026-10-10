.class Lcom/sensorsdata/analytics/android/sdk/advert/utils/OaidHelper$IdentifyListenerHandler;
.super Ljava/lang/Object;
.source "OaidHelper.java"

# interfaces
.implements Ljava/lang/reflect/InvocationHandler;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/sensorsdata/analytics/android/sdk/advert/utils/OaidHelper;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "IdentifyListenerHandler"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

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
.end method


# virtual methods
.method public invoke(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    .line 1
    .line 2
    :try_start_0
    const-string p1, "OnSupport"

    .line 3
    .line 4
    .line 5
    invoke-virtual {p2}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 6
    move-result-object p2

    .line 7
    .line 8
    .line 9
    invoke-virtual {p1, p2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 10
    move-result p1

    .line 11
    .line 12
    if-eqz p1, :cond_1

    .line 13
    .line 14
    .line 15
    invoke-static {}, Lcom/sensorsdata/analytics/android/sdk/advert/utils/OaidHelper;->access$100()Ljava/lang/Class;

    .line 16
    move-result-object p1

    .line 17
    .line 18
    const-string p2, "getOAID"

    .line 19
    const/4 v0, 0x0

    .line 20
    .line 21
    new-array v1, v0, [Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    invoke-virtual {p1, p2, v1}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 25
    move-result-object p1

    .line 26
    array-length p2, p3

    .line 27
    const/4 v1, 0x1

    .line 28
    .line 29
    if-ne p2, v1, :cond_0

    .line 30
    .line 31
    aget-object p2, p3, v0

    .line 32
    .line 33
    new-array p3, v0, [Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    invoke-virtual {p1, p2, p3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 37
    move-result-object p1

    .line 38
    .line 39
    check-cast p1, Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    invoke-static {p1}, Lcom/sensorsdata/analytics/android/sdk/advert/utils/OaidHelper;->access$202(Ljava/lang/String;)Ljava/lang/String;

    .line 43
    goto :goto_0

    .line 44
    .line 45
    :cond_0
    aget-object p2, p3, v1

    .line 46
    .line 47
    new-array p3, v0, [Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    invoke-virtual {p1, p2, p3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 51
    move-result-object p1

    .line 52
    .line 53
    check-cast p1, Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    invoke-static {p1}, Lcom/sensorsdata/analytics/android/sdk/advert/utils/OaidHelper;->access$202(Ljava/lang/String;)Ljava/lang/String;

    .line 57
    .line 58
    :goto_0
    const-string p1, "SA.DeviceUtils"

    .line 59
    .line 60
    new-instance p2, Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 64
    .line 65
    .line 66
    const-string/jumbo p3, "oaid:"

    .line 67
    .line 68
    .line 69
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 70
    .line 71
    .line 72
    invoke-static {}, Lcom/sensorsdata/analytics/android/sdk/advert/utils/OaidHelper;->access$200()Ljava/lang/String;

    .line 73
    move-result-object p3

    .line 74
    .line 75
    .line 76
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 77
    .line 78
    .line 79
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 80
    move-result-object p2

    .line 81
    .line 82
    .line 83
    invoke-static {p1, p2}, Lcom/sensorsdata/analytics/android/sdk/SALog;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    invoke-static {}, Lcom/sensorsdata/analytics/android/sdk/advert/utils/OaidHelper;->access$000()Ljava/util/concurrent/CountDownLatch;

    .line 87
    move-result-object p1

    .line 88
    .line 89
    .line 90
    invoke-virtual {p1}, Ljava/util/concurrent/CountDownLatch;->countDown()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 91
    goto :goto_1

    .line 92
    .line 93
    .line 94
    :catchall_0
    invoke-static {}, Lcom/sensorsdata/analytics/android/sdk/advert/utils/OaidHelper;->access$000()Ljava/util/concurrent/CountDownLatch;

    .line 95
    move-result-object p1

    .line 96
    .line 97
    .line 98
    invoke-virtual {p1}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    .line 99
    :cond_1
    :goto_1
    const/4 p1, 0x0

    .line 100
    return-object p1
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
.end method
