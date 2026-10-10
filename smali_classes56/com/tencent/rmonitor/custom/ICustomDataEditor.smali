.class public interface abstract Lcom/tencent/rmonitor/custom/ICustomDataEditor;
.super Ljava/lang/Object;
.source "BUGLY"

# interfaces
.implements Lcom/tencent/rmonitor/custom/IDataEditor;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/tencent/rmonitor/custom/ICustomDataEditor$b;,
        Lcom/tencent/rmonitor/custom/ICustomDataEditor$c;,
        Lcom/tencent/rmonitor/custom/ICustomDataEditor$a;
    }
.end annotation


# static fields
.field public static final NUMBER_PARAM_1:Ljava/lang/String; = "n1"

.field public static final NUMBER_PARAM_10:Ljava/lang/String; = "n10"

.field public static final NUMBER_PARAM_2:Ljava/lang/String; = "n2"

.field public static final NUMBER_PARAM_3:Ljava/lang/String; = "n3"

.field public static final NUMBER_PARAM_4:Ljava/lang/String; = "n4"

.field public static final NUMBER_PARAM_5:Ljava/lang/String; = "n5"

.field public static final NUMBER_PARAM_6:Ljava/lang/String; = "n6"

.field public static final NUMBER_PARAM_7:Ljava/lang/String; = "n7"

.field public static final NUMBER_PARAM_8:Ljava/lang/String; = "n8"

.field public static final NUMBER_PARAM_9:Ljava/lang/String; = "n9"

.field public static final NUMBER_PARAM_KEYS:[Ljava/lang/String;

.field public static final STRING_ARRAY_PARAM_1:Ljava/lang/String; = "a1"

.field public static final STRING_ARRAY_PARAM_10:Ljava/lang/String; = "a10"

.field public static final STRING_ARRAY_PARAM_2:Ljava/lang/String; = "a2"

.field public static final STRING_ARRAY_PARAM_3:Ljava/lang/String; = "a3"

.field public static final STRING_ARRAY_PARAM_4:Ljava/lang/String; = "a4"

.field public static final STRING_ARRAY_PARAM_5:Ljava/lang/String; = "a5"

.field public static final STRING_ARRAY_PARAM_6:Ljava/lang/String; = "a6"

.field public static final STRING_ARRAY_PARAM_7:Ljava/lang/String; = "a7"

.field public static final STRING_ARRAY_PARAM_8:Ljava/lang/String; = "a8"

.field public static final STRING_ARRAY_PARAM_9:Ljava/lang/String; = "a9"

.field public static final STRING_ARRAY_PARAM_KEYS:[Ljava/lang/String;

.field public static final STRING_PARAM_1:Ljava/lang/String; = "s1"

.field public static final STRING_PARAM_10:Ljava/lang/String; = "s10"

.field public static final STRING_PARAM_2:Ljava/lang/String; = "s2"

.field public static final STRING_PARAM_3:Ljava/lang/String; = "s3"

.field public static final STRING_PARAM_4:Ljava/lang/String; = "s4"

.field public static final STRING_PARAM_5:Ljava/lang/String; = "s5"

.field public static final STRING_PARAM_6:Ljava/lang/String; = "s6"

.field public static final STRING_PARAM_7:Ljava/lang/String; = "s7"

.field public static final STRING_PARAM_8:Ljava/lang/String; = "s8"

.field public static final STRING_PARAM_9:Ljava/lang/String; = "s9"

.field public static final STRING_PARAM_KEYS:[Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 11

    .line 1
    .line 2
    const-string v8, "n9"

    .line 3
    .line 4
    const-string v9, "n10"

    .line 5
    .line 6
    const-string v0, "n1"

    .line 7
    .line 8
    const-string v1, "n2"

    .line 9
    .line 10
    const-string v2, "n3"

    .line 11
    .line 12
    const-string v3, "n4"

    .line 13
    .line 14
    const-string v4, "n5"

    .line 15
    .line 16
    const-string v5, "n6"

    .line 17
    .line 18
    const-string v6, "n7"

    .line 19
    .line 20
    const-string v7, "n8"

    .line 21
    .line 22
    .line 23
    filled-new-array/range {v0 .. v9}, [Ljava/lang/String;

    .line 24
    move-result-object v0

    .line 25
    .line 26
    sput-object v0, Lcom/tencent/rmonitor/custom/ICustomDataEditor;->NUMBER_PARAM_KEYS:[Ljava/lang/String;

    .line 27
    .line 28
    const-string v9, "s9"

    .line 29
    .line 30
    const-string v10, "s10"

    .line 31
    .line 32
    const-string v1, "s1"

    .line 33
    .line 34
    const-string v2, "s2"

    .line 35
    .line 36
    const-string v3, "s3"

    .line 37
    .line 38
    const-string v4, "s4"

    .line 39
    .line 40
    const-string v5, "s5"

    .line 41
    .line 42
    const-string v6, "s6"

    .line 43
    .line 44
    const-string v7, "s7"

    .line 45
    .line 46
    const-string v8, "s8"

    .line 47
    .line 48
    .line 49
    filled-new-array/range {v1 .. v10}, [Ljava/lang/String;

    .line 50
    move-result-object v0

    .line 51
    .line 52
    sput-object v0, Lcom/tencent/rmonitor/custom/ICustomDataEditor;->STRING_PARAM_KEYS:[Ljava/lang/String;

    .line 53
    .line 54
    const-string v9, "a9"

    .line 55
    .line 56
    const-string v10, "a10"

    .line 57
    .line 58
    const-string v1, "a1"

    .line 59
    .line 60
    const-string v2, "a2"

    .line 61
    .line 62
    const-string v3, "a3"

    .line 63
    .line 64
    const-string v4, "a4"

    .line 65
    .line 66
    const-string v5, "a5"

    .line 67
    .line 68
    const-string v6, "a6"

    .line 69
    .line 70
    const-string v7, "a7"

    .line 71
    .line 72
    const-string v8, "a8"

    .line 73
    .line 74
    .line 75
    filled-new-array/range {v1 .. v10}, [Ljava/lang/String;

    .line 76
    move-result-object v0

    .line 77
    .line 78
    sput-object v0, Lcom/tencent/rmonitor/custom/ICustomDataEditor;->STRING_ARRAY_PARAM_KEYS:[Ljava/lang/String;

    .line 79
    return-void
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
.end method


# virtual methods
.method public abstract addStringToSequence(Ljava/lang/String;Ljava/lang/String;)Z
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/tencent/rmonitor/custom/ICustomDataEditor$b;
        .end annotation
    .end param
.end method

.method public abstract addStringToStringArrayParam(Ljava/lang/String;Ljava/lang/String;)Z
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/tencent/rmonitor/custom/ICustomDataEditor$b;
        .end annotation
    .end param
.end method

.method public abstract getNumberParam(Ljava/lang/String;)D
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/tencent/rmonitor/custom/ICustomDataEditor$a;
        .end annotation
    .end param
.end method

.method public abstract getStringArrayParam(Ljava/lang/String;)Ljava/util/List;
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/tencent/rmonitor/custom/ICustomDataEditor$b;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end method

.method public abstract getStringParam(Ljava/lang/String;)Ljava/lang/String;
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/tencent/rmonitor/custom/ICustomDataEditor$c;
        .end annotation
    .end param
.end method

.method public abstract putNumberParam(Ljava/lang/String;D)Z
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/tencent/rmonitor/custom/ICustomDataEditor$a;
        .end annotation
    .end param
.end method

.method public abstract putStringParam(Ljava/lang/String;Ljava/lang/String;)Z
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/tencent/rmonitor/custom/ICustomDataEditor$c;
        .end annotation
    .end param
.end method

.method public abstract removeStringFromStringArrayParam(Ljava/lang/String;Ljava/lang/String;)Z
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/tencent/rmonitor/custom/ICustomDataEditor$b;
        .end annotation
    .end param
.end method
