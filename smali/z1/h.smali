.class public interface abstract Lz1/h;
.super Ljava/lang/Object;
.source "Headers.java"


# static fields
.field public static final a:Lz1/h;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public static final b:Lz1/h;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lz1/h$a;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lz1/h$a;-><init>()V

    .line 6
    .line 7
    sput-object v0, Lz1/h;->a:Lz1/h;

    .line 8
    .line 9
    new-instance v0, Lz1/j$a;

    .line 10
    .line 11
    .line 12
    invoke-direct {v0}, Lz1/j$a;-><init>()V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0}, Lz1/j$a;->c()Lz1/j;

    .line 16
    move-result-object v0

    .line 17
    .line 18
    sput-object v0, Lz1/h;->b:Lz1/h;

    .line 19
    return-void
    .line 20
    .line 21
    .line 22
.end method


# virtual methods
.method public abstract getHeaders()Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end method
