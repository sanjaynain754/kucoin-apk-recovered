.class public Lf/h$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lf/h;->y(Lg/a;Lg/e;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:Lg/a;

.field public final synthetic c:Lg/e;

.field public final synthetic d:Lf/h;


# direct methods
.method public constructor <init>(Lf/h;Lg/a;Lg/e;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 1
    .line 2
    iput-object p1, p0, Lf/h$b;->d:Lf/h;

    .line 3
    .line 4
    iput-object p2, p0, Lf/h$b;->b:Lg/a;

    .line 5
    .line 6
    iput-object p3, p0, Lf/h$b;->c:Lg/e;

    .line 7
    .line 8
    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    return-void
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
    .line 105
.end method


# virtual methods
.method public run()V
    .locals 4

    .line 1
    .line 2
    :try_start_0
    iget-object v0, p0, Lf/h$b;->b:Lg/a;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Lg/a;->a()Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, Lg/b;

    .line 9
    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    const-string v0, "eventData is null\uff0c\u4e0d\u5b58\u50a8\u672c\u6b21\u795e\u7b56\u57cb\u70b9"

    .line 13
    .line 14
    .line 15
    invoke-static {v0}, Lk/h;->g(Ljava/lang/String;)V

    .line 16
    return-void

    .line 17
    :catch_0
    move-exception v0

    .line 18
    goto :goto_0

    .line 19
    .line 20
    .line 21
    :cond_0
    invoke-static {}, Lb/b;->f()Lb/b;

    .line 22
    move-result-object v1

    .line 23
    .line 24
    iget-object v2, p0, Lf/h$b;->c:Lg/e;

    .line 25
    .line 26
    iget-object v3, p0, Lf/h$b;->d:Lf/h;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v3}, Lf/h;->n()Landroid/content/Context;

    .line 30
    move-result-object v3

    .line 31
    .line 32
    .line 33
    invoke-virtual {v1, v0, v2, v3}, Lb/b;->i(Lg/b;Lg/e;Landroid/content/Context;)V

    .line 34
    .line 35
    iget-object v1, p0, Lf/h$b;->d:Lf/h;

    .line 36
    .line 37
    sget-object v2, Laai/telemetry/enums/MonitorType;->EVENT:Laai/telemetry/enums/MonitorType;

    .line 38
    .line 39
    .line 40
    invoke-virtual {v0}, Lg/b;->f()Z

    .line 41
    move-result v0

    .line 42
    .line 43
    xor-int/lit8 v0, v0, 0x1

    .line 44
    .line 45
    .line 46
    invoke-virtual {v1, v2, v0}, Lf/l;->e(Laai/telemetry/enums/MonitorType;Z)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 47
    return-void

    .line 48
    .line 49
    :goto_0
    iget-object v1, p0, Lf/h$b;->d:Lf/h;

    .line 50
    .line 51
    iget-object v2, p0, Lf/h$b;->c:Lg/e;

    .line 52
    .line 53
    .line 54
    invoke-virtual {v1, v0, v2}, Lf/h;->I(Ljava/lang/Throwable;Lg/e;)V

    .line 55
    return-void
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
.end method
