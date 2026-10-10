.class public interface abstract Lcom/tencent/bugly/proguard/ge$d;
.super Ljava/lang/Object;
.source "BUGLY"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/tencent/bugly/proguard/ge;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "d"
.end annotation


# virtual methods
.method public abstract a(Landroid/os/IBinder;I)V
.end method

.method public abstract a(Lcom/tencent/bugly/proguard/gi;Ljava/lang/String;Landroid/os/WorkSource;Ljava/lang/String;)V
    .param p3    # Landroid/os/WorkSource;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param
    .param p4    # Ljava/lang/String;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param
.end method
