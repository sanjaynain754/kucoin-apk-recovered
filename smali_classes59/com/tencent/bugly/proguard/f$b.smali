.class public Lcom/tencent/bugly/proguard/f$b;
.super Landroid/app/Instrumentation;
.source "BUGLY"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/tencent/bugly/proguard/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "b"
.end annotation


# instance fields
.field public final synthetic a:Lcom/tencent/bugly/proguard/f;


# direct methods
.method public constructor <init>(Lcom/tencent/bugly/proguard/f;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/tencent/bugly/proguard/f$b;->a:Lcom/tencent/bugly/proguard/f;

    invoke-direct {p0}, Landroid/app/Instrumentation;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lcom/tencent/bugly/proguard/f;Lcom/tencent/bugly/proguard/f$a;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Lcom/tencent/bugly/proguard/f$b;-><init>(Lcom/tencent/bugly/proguard/f;)V

    return-void
.end method


# virtual methods
.method public callActivityOnDestroy(Landroid/app/Activity;)V
    .locals 1
    .param p1    # Landroid/app/Activity;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/tencent/bugly/proguard/f;->d()Landroid/app/Instrumentation;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0, p1}, Landroid/app/Instrumentation;->callActivityOnDestroy(Landroid/app/Activity;)V

    .line 8
    .line 9
    iget-object v0, p0, Lcom/tencent/bugly/proguard/f$b;->a:Lcom/tencent/bugly/proguard/f;

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0, p1}, Lcom/tencent/bugly/proguard/v0;->a(Landroid/app/Activity;)V

    .line 13
    return-void
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
