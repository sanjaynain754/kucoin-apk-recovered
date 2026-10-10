.class public Lcom/tencent/bugly/proguard/v1$f;
.super Ljava/lang/Object;
.source "BUGLY"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/tencent/bugly/proguard/v1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "f"
.end annotation


# instance fields
.field public b:J

.field public final synthetic c:Lcom/tencent/bugly/proguard/v1;


# direct methods
.method public constructor <init>(Lcom/tencent/bugly/proguard/v1;J)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/tencent/bugly/proguard/v1$f;->c:Lcom/tencent/bugly/proguard/v1;

    .line 3
    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    iput-wide p2, p0, Lcom/tencent/bugly/proguard/v1$f;->b:J

    .line 8
    return-void
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
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/bugly/proguard/v1$f;->c:Lcom/tencent/bugly/proguard/v1;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, v1}, Lcom/tencent/bugly/proguard/v1;->c(Z)V

    .line 7
    .line 8
    iget-object v0, p0, Lcom/tencent/bugly/proguard/v1$f;->c:Lcom/tencent/bugly/proguard/v1;

    .line 9
    .line 10
    iget-wide v1, p0, Lcom/tencent/bugly/proguard/v1$f;->b:J

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0, v1, v2}, Lcom/tencent/bugly/proguard/v1;->b(J)V

    .line 14
    return-void
    .line 15
    .line 16
    .line 17
.end method
