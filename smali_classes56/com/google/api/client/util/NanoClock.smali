.class public interface abstract Lcom/google/api/client/util/NanoClock;
.super Ljava/lang/Object;
.source "NanoClock.java"


# static fields
.field public static final SYSTEM:Lcom/google/api/client/util/NanoClock;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lcom/google/api/client/util/NanoClock$1;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/google/api/client/util/NanoClock$1;-><init>()V

    .line 6
    .line 7
    sput-object v0, Lcom/google/api/client/util/NanoClock;->SYSTEM:Lcom/google/api/client/util/NanoClock;

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
.end method


# virtual methods
.method public abstract nanoTime()J
.end method
