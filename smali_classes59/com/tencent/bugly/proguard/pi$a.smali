.class public Lcom/tencent/bugly/proguard/pi$a;
.super Ljava/lang/Object;
.source "BUGLY"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/tencent/bugly/proguard/pi;->k()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:Lcom/tencent/bugly/proguard/pi;


# direct methods
.method public constructor <init>(Lcom/tencent/bugly/proguard/pi;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/tencent/bugly/proguard/pi$a;->b:Lcom/tencent/bugly/proguard/pi;

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
    .line 25
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/bugly/proguard/pi$a;->b:Lcom/tencent/bugly/proguard/pi;

    .line 3
    .line 4
    .line 5
    invoke-static {v0}, Lcom/tencent/bugly/proguard/pi;->a(Lcom/tencent/bugly/proguard/pi;)V

    .line 6
    .line 7
    iget-object v0, p0, Lcom/tencent/bugly/proguard/pi$a;->b:Lcom/tencent/bugly/proguard/pi;

    .line 8
    const/4 v1, 0x0

    .line 9
    .line 10
    .line 11
    invoke-static {v0, v1}, Lcom/tencent/bugly/proguard/pi;->a(Lcom/tencent/bugly/proguard/pi;Z)Z

    .line 12
    .line 13
    iget-object v0, p0, Lcom/tencent/bugly/proguard/pi$a;->b:Lcom/tencent/bugly/proguard/pi;

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0}, Lcom/tencent/bugly/proguard/pi;->k()V

    .line 17
    return-void
.end method
