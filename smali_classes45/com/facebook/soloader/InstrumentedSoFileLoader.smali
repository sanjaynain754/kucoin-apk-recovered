.class public Lcom/facebook/soloader/InstrumentedSoFileLoader;
.super Ljava/lang/Object;
.source "InstrumentedSoFileLoader.java"

# interfaces
.implements Lcom/facebook/soloader/SoFileLoader;


# instance fields
.field private final mDelegate:Lcom/facebook/soloader/SoFileLoader;


# direct methods
.method public constructor <init>(Lcom/facebook/soloader/SoFileLoader;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    iput-object p1, p0, Lcom/facebook/soloader/InstrumentedSoFileLoader;->mDelegate:Lcom/facebook/soloader/SoFileLoader;

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
.end method


# virtual methods
.method public load(Ljava/lang/String;I)V
    .locals 2
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "CatchGeneralException",
            "EmptyCatchBlock"
        }
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/facebook/soloader/InstrumentedSoFileLoader;->mDelegate:Lcom/facebook/soloader/SoFileLoader;

    .line 3
    .line 4
    const-string v1, "load"

    .line 5
    .line 6
    .line 7
    invoke-static {v0, v1, p2}, Lcom/facebook/soloader/observer/ObserverHolder;->onSoFileLoaderLoadStart(Lcom/facebook/soloader/SoFileLoader;Ljava/lang/String;I)V

    .line 8
    .line 9
    :try_start_0
    iget-object v0, p0, Lcom/facebook/soloader/InstrumentedSoFileLoader;->mDelegate:Lcom/facebook/soloader/SoFileLoader;

    .line 10
    .line 11
    .line 12
    invoke-interface {v0, p1, p2}, Lcom/facebook/soloader/SoFileLoader;->load(Ljava/lang/String;I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 13
    const/4 p1, 0x0

    .line 14
    .line 15
    .line 16
    invoke-static {p1}, Lcom/facebook/soloader/observer/ObserverHolder;->onSoFileLoaderLoadEnd(Ljava/lang/Throwable;)V

    .line 17
    return-void

    .line 18
    :catchall_0
    move-exception p1

    .line 19
    :try_start_1
    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 20
    :catchall_1
    move-exception p2

    .line 21
    .line 22
    .line 23
    invoke-static {p1}, Lcom/facebook/soloader/observer/ObserverHolder;->onSoFileLoaderLoadEnd(Ljava/lang/Throwable;)V

    .line 24
    throw p2
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

.method public loadBytes(Ljava/lang/String;Lcom/facebook/soloader/ElfByteChannel;I)V
    .locals 2
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "CatchGeneralException",
            "EmptyCatchBlock"
        }
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/facebook/soloader/InstrumentedSoFileLoader;->mDelegate:Lcom/facebook/soloader/SoFileLoader;

    .line 3
    .line 4
    const-string v1, "loadBytes"

    .line 5
    .line 6
    .line 7
    invoke-static {v0, v1, p3}, Lcom/facebook/soloader/observer/ObserverHolder;->onSoFileLoaderLoadStart(Lcom/facebook/soloader/SoFileLoader;Ljava/lang/String;I)V

    .line 8
    .line 9
    :try_start_0
    iget-object v0, p0, Lcom/facebook/soloader/InstrumentedSoFileLoader;->mDelegate:Lcom/facebook/soloader/SoFileLoader;

    .line 10
    .line 11
    .line 12
    invoke-interface {v0, p1, p2, p3}, Lcom/facebook/soloader/SoFileLoader;->loadBytes(Ljava/lang/String;Lcom/facebook/soloader/ElfByteChannel;I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 13
    const/4 p1, 0x0

    .line 14
    .line 15
    .line 16
    invoke-static {p1}, Lcom/facebook/soloader/observer/ObserverHolder;->onSoFileLoaderLoadEnd(Ljava/lang/Throwable;)V

    .line 17
    return-void

    .line 18
    :catchall_0
    move-exception p1

    .line 19
    :try_start_1
    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 20
    :catchall_1
    move-exception p2

    .line 21
    .line 22
    .line 23
    invoke-static {p1}, Lcom/facebook/soloader/observer/ObserverHolder;->onSoFileLoaderLoadEnd(Ljava/lang/Throwable;)V

    .line 24
    throw p2
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
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
.end method
