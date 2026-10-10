.class public final Ly70/a;
.super Ljava/lang/Object;
.source "KVStore.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0008\n\u0002\u0010\u0008\n\u0002\u0008\u0004\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0010\t\n\u0002\u0008\u0004\n\u0002\u0010\"\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0008\u0006\n\u0002\u0010\u0011\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u00c6\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J#\u0010\u0007\u001a\u00020\u0000\"\u0004\u0008\u0000\u0010\u00042\u000c\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0005H\u0007\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J#\u0010\n\u001a\u00020\t\"\u0004\u0008\u0000\u0010\u00042\u000c\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0005H\u0007\u00a2\u0006\u0004\u0008\n\u0010\u000bJ%\u0010\r\u001a\u00020\u00002\u000c\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\t0\u00052\u0006\u0010\u000c\u001a\u00020\tH\u0007\u00a2\u0006\u0004\u0008\r\u0010\u000eJ%\u0010\u0010\u001a\u00020\t2\u000c\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\t0\u00052\u0006\u0010\u000f\u001a\u00020\tH\u0007\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J%\u0010\u0013\u001a\u00020\u00002\u000c\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00120\u00052\u0006\u0010\u000c\u001a\u00020\u0012H\u0007\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J%\u0010\u0015\u001a\u00020\u00122\u000c\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00120\u00052\u0006\u0010\u000f\u001a\u00020\u0012H\u0007\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J%\u0010\u0018\u001a\u00020\u00002\u000c\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00170\u00052\u0006\u0010\u000c\u001a\u00020\u0017H\u0007\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J%\u0010\u001a\u001a\u00020\u00172\u000c\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00170\u00052\u0006\u0010\u000f\u001a\u00020\u0017H\u0007\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ%\u0010\u001d\u001a\u00020\u00002\u000c\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u001c0\u00052\u0006\u0010\u000c\u001a\u00020\u001cH\u0007\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ%\u0010\u001f\u001a\u00020\u001c2\u000c\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u001c0\u00052\u0006\u0010\u000f\u001a\u00020\u001cH\u0007\u00a2\u0006\u0004\u0008\u001f\u0010 J1\u0010\"\u001a\u00020\u00002\u0012\u0010\u0006\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00170!0\u00052\u000c\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u00170!H\u0007\u00a2\u0006\u0004\u0008\"\u0010#J7\u0010$\u001a\u0008\u0012\u0004\u0012\u00020\u00170!2\u0012\u0010\u0006\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00170!0\u00052\u000c\u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00020\u00170!H\u0007\u00a2\u0006\u0004\u0008$\u0010%J/\u0010\'\u001a\u00020\u0000\"\u0008\u0008\u0000\u0010\u0004*\u00020&2\u000c\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u00052\u0006\u0010\u000c\u001a\u00020&H\u0007\u00a2\u0006\u0004\u0008\'\u0010(J;\u0010+\u001a\u00020\u0000\"\u0008\u0008\u0000\u0010\u0004*\u00020&2\u0012\u0010\u0006\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00028\u00000)0\u00052\u000c\u0010*\u001a\u0008\u0012\u0004\u0012\u00028\u00000)H\u0007\u00a2\u0006\u0004\u0008+\u0010,JC\u0010-\u001a\u0008\u0012\u0004\u0012\u00028\u00000)\"\u0008\u0008\u0000\u0010\u0004*\u00020&2\u0012\u0010\u0006\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00028\u00000)0\u00052\u000e\u0008\u0002\u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00028\u00000)H\u0007\u00a2\u0006\u0004\u0008-\u0010.J!\u00101\u001a\u000c\u0012\u0006\u0008\u0001\u0012\u00020\u0017\u0018\u0001002\u0006\u0010/\u001a\u00020\u0017H\u0007\u00a2\u0006\u0004\u00081\u00102J\u0017\u00104\u001a\u0002032\u0006\u0010/\u001a\u00020\u0017H\u0007\u00a2\u0006\u0004\u00084\u00105J?\u00108\u001a\u0004\u0018\u00018\u0000\"\u0008\u0008\u0000\u0010\u0004*\u00020&2\u000c\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u00052\u000c\u00107\u001a\u0008\u0012\u0004\u0012\u00028\u0000062\u0008\u0010\u000f\u001a\u0004\u0018\u00018\u0000\u00a2\u0006\u0004\u00088\u00109\u00a8\u0006:"
    }
    d2 = {
        "Ly70/a;",
        "",
        "<init>",
        "()V",
        "T",
        "Ly70/g;",
        "sid",
        "r",
        "(Ly70/g;)Ly70/a;",
        "",
        "b",
        "(Ly70/g;)Z",
        "value",
        "k",
        "(Ly70/g;Z)Ly70/a;",
        "defaultValue",
        "d",
        "(Ly70/g;Z)Z",
        "",
        "l",
        "(Ly70/g;I)Ly70/a;",
        "e",
        "(Ly70/g;I)I",
        "",
        "p",
        "(Ly70/g;Ljava/lang/String;)Ly70/a;",
        "h",
        "(Ly70/g;Ljava/lang/String;)Ljava/lang/String;",
        "",
        "m",
        "(Ly70/g;J)Ly70/a;",
        "f",
        "(Ly70/g;J)J",
        "",
        "q",
        "(Ly70/g;Ljava/util/Set;)Ly70/a;",
        "i",
        "(Ly70/g;Ljava/util/Set;)Ljava/util/Set;",
        "Landroid/os/Parcelable;",
        "n",
        "(Ly70/g;Landroid/os/Parcelable;)Ly70/a;",
        "",
        "list",
        "o",
        "(Ly70/g;Ljava/util/List;)Ly70/a;",
        "g",
        "(Ly70/g;Ljava/util/List;)Ljava/util/List;",
        "category",
        "",
        "c",
        "(Ljava/lang/String;)[Ljava/lang/String;",
        "",
        "a",
        "(Ljava/lang/String;)V",
        "Ljava/lang/Class;",
        "clazz",
        "j",
        "(Ly70/g;Ljava/lang/Class;Landroid/os/Parcelable;)Landroid/os/Parcelable;",
        "Utils_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nKVStore.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KVStore.kt\ncom/kubi/utils/storage/KVStore\n+ 2 KVStoreCompat.kt\ncom/kubi/utils/storage/KVStoreCompat\n+ 3 StorageId.kt\ncom/kubi/utils/storage/StorageId\n*L\n1#1,238:1\n144#2:239\n13#2,2:240\n145#2,5:242\n21#2:247\n13#2,10:248\n30#2:258\n13#2,2:259\n31#2,2:261\n105#2:263\n13#2,2:264\n106#2,15:266\n13#2:281\n121#2,17:282\n30#2:299\n13#2,2:300\n31#2,2:302\n105#2:304\n13#2,2:305\n106#2,15:307\n13#2:322\n121#2,17:323\n30#2:340\n13#2,2:341\n31#2,2:343\n105#2:345\n13#2,2:346\n106#2,15:348\n13#2:363\n121#2,17:364\n30#2:381\n13#2,2:382\n31#2,2:384\n105#2:386\n13#2,2:387\n106#2,15:389\n13#2:404\n121#2,17:405\n30#2:422\n13#2,2:423\n31#2,2:425\n105#2:427\n13#2,2:428\n106#2,15:430\n13#2:445\n121#2,17:446\n30#2:463\n13#2,2:464\n31#2,2:466\n105#2:468\n13#2,2:469\n106#2,15:471\n13#2:486\n121#2,17:487\n30#2:505\n13#2,2:506\n31#2,2:508\n39#2:510\n13#2,2:511\n40#2,4:513\n13#2:517\n44#2,12:518\n66#2:531\n13#2,2:532\n68#2,8:534\n13#2:542\n76#2,16:543\n30#2:559\n13#2,2:560\n31#2,2:562\n105#2:564\n13#2,2:565\n106#2,15:567\n13#2:582\n121#2,17:583\n53#3:504\n53#3:530\n*S KotlinDebug\n*F\n+ 1 KVStore.kt\ncom/kubi/utils/storage/KVStore\n*L\n21#1:239\n21#1:240,2\n21#1:242,5\n30#1:247\n30#1:248,10\n43#1:258\n43#1:259,2\n43#1:261,2\n58#1:263\n58#1:264,2\n58#1:266,15\n58#1:281\n58#1:282,17\n69#1:299\n69#1:300,2\n69#1:302,2\n81#1:304\n81#1:305,2\n81#1:307,15\n81#1:322\n81#1:323,17\n92#1:340\n92#1:341,2\n92#1:343,2\n104#1:345\n104#1:346,2\n104#1:348,15\n104#1:363\n104#1:364,17\n112#1:381\n112#1:382,2\n112#1:384,2\n121#1:386\n121#1:387,2\n121#1:389,15\n121#1:404\n121#1:405,17\n130#1:422\n130#1:423,2\n130#1:425,2\n140#1:427\n140#1:428,2\n140#1:430,15\n140#1:445\n140#1:446,17\n148#1:463\n148#1:464,2\n148#1:466,2\n157#1:468\n157#1:469,2\n157#1:471,15\n157#1:486\n157#1:487,17\n166#1:505\n166#1:506,2\n166#1:508,2\n183#1:510\n183#1:511,2\n183#1:513,4\n183#1:517\n183#1:518,12\n199#1:531\n199#1:532,2\n199#1:534,8\n199#1:542\n199#1:543,16\n208#1:559\n208#1:560,2\n208#1:562,2\n218#1:564\n218#1:565,2\n218#1:567,15\n218#1:582\n218#1:583,17\n166#1:504\n191#1:530\n*E\n"
    }
.end annotation


# static fields
.field public static final a:Ly70/a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    .line 2
    new-instance v0, Ly70/a;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Ly70/a;-><init>()V

    .line 6
    .line 7
    sput-object v0, Ly70/a;->a:Ly70/a;

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
.end method

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
    .line 18
    .line 19
    .line 20
.end method

.method public static final a(Ljava/lang/String;)V
    .locals 1
    .param p0    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    .line 1
    .line 2
    const-string v0, "category"

    .line 3
    .line 4
    .line 5
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-static {p0}, Ly70/f;->a(Ljava/lang/String;)Lkotlin/Unit;

    .line 9
    return-void
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
.end method

.method public static final b(Ly70/g;)Z
    .locals 2
    .param p0    # Ly70/g;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ly70/g<",
            "TT;>;)Z"
        }
    .end annotation

    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    .line 1
    .line 2
    .line 3
    const-string/jumbo v0, "sid"

    .line 4
    .line 5
    .line 6
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    .line 8
    sget-object v0, Ly70/b;->a:Ly70/b;

    .line 9
    .line 10
    sget-object v0, Ly70/d;->a:Ly70/d;

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0}, Ly70/d;->b()Ljava/lang/String;

    .line 14
    move-result-object v1

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0}, Ly70/d;->e()Z

    .line 18
    move-result v0

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0, v1, v0}, Ly70/g;->e(Ljava/lang/String;Z)Ljava/lang/String;

    .line 22
    move-result-object v0

    .line 23
    .line 24
    .line 25
    invoke-virtual {p0}, Ly70/g;->b()Ljava/lang/String;

    .line 26
    move-result-object p0

    .line 27
    .line 28
    .line 29
    invoke-static {v0, p0}, Ly70/f;->b(Ljava/lang/String;Ljava/lang/String;)Z

    .line 30
    move-result p0

    .line 31
    return p0
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
.end method

.method public static final c(Ljava/lang/String;)[Ljava/lang/String;
    .locals 1
    .param p0    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    const-string v0, "category"

    .line 3
    .line 4
    .line 5
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-static {p0}, Ly70/f;->c(Ljava/lang/String;)[Ljava/lang/String;

    .line 9
    move-result-object p0

    .line 10
    return-object p0
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
.end method

.method public static final d(Ly70/g;Z)Z
    .locals 5
    .param p0    # Ly70/g;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ly70/g<",
            "Ljava/lang/Boolean;",
            ">;Z)Z"
        }
    .end annotation

    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    .line 1
    .line 2
    .line 3
    const-string/jumbo v0, "sid"

    .line 4
    .line 5
    .line 6
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    .line 8
    sget-object v0, Ly70/b;->a:Ly70/b;

    .line 9
    .line 10
    sget-object v0, Ly70/d;->a:Ly70/d;

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0}, Ly70/d;->b()Ljava/lang/String;

    .line 14
    move-result-object v1

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0}, Ly70/d;->e()Z

    .line 18
    move-result v2

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0, v1, v2}, Ly70/g;->e(Ljava/lang/String;Z)Ljava/lang/String;

    .line 22
    move-result-object v1

    .line 23
    .line 24
    .line 25
    invoke-virtual {p0}, Ly70/g;->d()Z

    .line 26
    move-result v2

    .line 27
    .line 28
    if-nez v2, :cond_0

    .line 29
    .line 30
    .line 31
    invoke-virtual {p0}, Ly70/g;->b()Ljava/lang/String;

    .line 32
    move-result-object p0

    .line 33
    .line 34
    .line 35
    :goto_0
    invoke-static {v1, p0, p1}, Ly70/f;->d(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 36
    move-result p0

    .line 37
    return p0

    .line 38
    .line 39
    .line 40
    :cond_0
    invoke-virtual {p0}, Ly70/g;->b()Ljava/lang/String;

    .line 41
    move-result-object v2

    .line 42
    .line 43
    .line 44
    invoke-static {v1, v2}, Ly70/f;->b(Ljava/lang/String;Ljava/lang/String;)Z

    .line 45
    move-result v2

    .line 46
    .line 47
    if-eqz v2, :cond_1

    .line 48
    .line 49
    .line 50
    invoke-virtual {p0}, Ly70/g;->b()Ljava/lang/String;

    .line 51
    move-result-object p0

    .line 52
    goto :goto_0

    .line 53
    .line 54
    .line 55
    :cond_1
    invoke-virtual {p0}, Ly70/g;->c()Lcom/kubi/utils/storage/StorageType;

    .line 56
    move-result-object v2

    .line 57
    .line 58
    sget-object v3, Lcom/kubi/utils/storage/StorageType;->Shared:Lcom/kubi/utils/storage/StorageType;

    .line 59
    .line 60
    .line 61
    const-string/jumbo v4, "mmkv.default"

    .line 62
    .line 63
    if-ne v2, v3, :cond_2

    .line 64
    .line 65
    .line 66
    invoke-virtual {p0}, Ly70/g;->b()Ljava/lang/String;

    .line 67
    move-result-object v0

    .line 68
    .line 69
    .line 70
    invoke-static {v4, v0}, Ly70/f;->b(Ljava/lang/String;Ljava/lang/String;)Z

    .line 71
    move-result v0

    .line 72
    .line 73
    if-eqz v0, :cond_4

    .line 74
    .line 75
    .line 76
    invoke-virtual {p0}, Ly70/g;->b()Ljava/lang/String;

    .line 77
    move-result-object v0

    .line 78
    .line 79
    .line 80
    invoke-static {v4, v0, p1}, Ly70/f;->d(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 81
    move-result p1

    .line 82
    .line 83
    .line 84
    invoke-virtual {p0}, Ly70/g;->b()Ljava/lang/String;

    .line 85
    move-result-object v0

    .line 86
    .line 87
    .line 88
    invoke-static {v1, v0, p1}, Ly70/f;->l(Ljava/lang/String;Ljava/lang/String;Z)Ly70/f;

    .line 89
    .line 90
    .line 91
    invoke-virtual {p0}, Ly70/g;->b()Ljava/lang/String;

    .line 92
    move-result-object p0

    .line 93
    .line 94
    .line 95
    invoke-static {v4, p0}, Ly70/f;->r(Ljava/lang/String;Ljava/lang/String;)Ly70/f;

    .line 96
    return p1

    .line 97
    .line 98
    .line 99
    :cond_2
    invoke-virtual {v0}, Ly70/d;->b()Ljava/lang/String;

    .line 100
    move-result-object v0

    .line 101
    .line 102
    const-string v2, "global"

    .line 103
    .line 104
    .line 105
    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 106
    move-result v0

    .line 107
    .line 108
    if-eqz v0, :cond_4

    .line 109
    .line 110
    .line 111
    invoke-virtual {p0}, Ly70/g;->a()Ljava/lang/String;

    .line 112
    move-result-object v0

    .line 113
    .line 114
    .line 115
    invoke-virtual {p0}, Ly70/g;->b()Ljava/lang/String;

    .line 116
    move-result-object v2

    .line 117
    .line 118
    .line 119
    invoke-static {v0, v2}, Ly70/f;->b(Ljava/lang/String;Ljava/lang/String;)Z

    .line 120
    move-result v0

    .line 121
    .line 122
    if-eqz v0, :cond_3

    .line 123
    .line 124
    .line 125
    invoke-virtual {p0}, Ly70/g;->a()Ljava/lang/String;

    .line 126
    move-result-object v0

    .line 127
    .line 128
    .line 129
    invoke-virtual {p0}, Ly70/g;->b()Ljava/lang/String;

    .line 130
    move-result-object v2

    .line 131
    .line 132
    .line 133
    invoke-static {v0, v2, p1}, Ly70/f;->d(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 134
    move-result p1

    .line 135
    .line 136
    .line 137
    invoke-virtual {p0}, Ly70/g;->b()Ljava/lang/String;

    .line 138
    move-result-object v0

    .line 139
    .line 140
    .line 141
    invoke-static {v1, v0, p1}, Ly70/f;->l(Ljava/lang/String;Ljava/lang/String;Z)Ly70/f;

    .line 142
    .line 143
    .line 144
    invoke-virtual {p0}, Ly70/g;->a()Ljava/lang/String;

    .line 145
    move-result-object v0

    .line 146
    .line 147
    .line 148
    invoke-virtual {p0}, Ly70/g;->b()Ljava/lang/String;

    .line 149
    move-result-object p0

    .line 150
    .line 151
    .line 152
    invoke-static {v0, p0}, Ly70/f;->r(Ljava/lang/String;Ljava/lang/String;)Ly70/f;

    .line 153
    return p1

    .line 154
    .line 155
    .line 156
    :cond_3
    invoke-virtual {p0}, Ly70/g;->b()Ljava/lang/String;

    .line 157
    move-result-object v0

    .line 158
    .line 159
    .line 160
    invoke-static {v4, v0}, Ly70/f;->b(Ljava/lang/String;Ljava/lang/String;)Z

    .line 161
    move-result v0

    .line 162
    .line 163
    if-eqz v0, :cond_4

    .line 164
    .line 165
    .line 166
    invoke-virtual {p0}, Ly70/g;->b()Ljava/lang/String;

    .line 167
    move-result-object v0

    .line 168
    .line 169
    .line 170
    invoke-static {v4, v0, p1}, Ly70/f;->d(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 171
    move-result p1

    .line 172
    .line 173
    .line 174
    invoke-virtual {p0}, Ly70/g;->b()Ljava/lang/String;

    .line 175
    move-result-object v0

    .line 176
    .line 177
    .line 178
    invoke-static {v1, v0, p1}, Ly70/f;->l(Ljava/lang/String;Ljava/lang/String;Z)Ly70/f;

    .line 179
    .line 180
    .line 181
    invoke-virtual {p0}, Ly70/g;->b()Ljava/lang/String;

    .line 182
    move-result-object p0

    .line 183
    .line 184
    .line 185
    invoke-static {v4, p0}, Ly70/f;->r(Ljava/lang/String;Ljava/lang/String;)Ly70/f;

    .line 186
    :cond_4
    return p1
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
.end method

.method public static final e(Ly70/g;I)I
    .locals 5
    .param p0    # Ly70/g;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ly70/g<",
            "Ljava/lang/Integer;",
            ">;I)I"
        }
    .end annotation

    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    .line 1
    .line 2
    .line 3
    const-string/jumbo v0, "sid"

    .line 4
    .line 5
    .line 6
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    .line 8
    sget-object v0, Ly70/b;->a:Ly70/b;

    .line 9
    .line 10
    sget-object v0, Ly70/d;->a:Ly70/d;

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0}, Ly70/d;->b()Ljava/lang/String;

    .line 14
    move-result-object v1

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0}, Ly70/d;->e()Z

    .line 18
    move-result v2

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0, v1, v2}, Ly70/g;->e(Ljava/lang/String;Z)Ljava/lang/String;

    .line 22
    move-result-object v1

    .line 23
    .line 24
    .line 25
    invoke-virtual {p0}, Ly70/g;->d()Z

    .line 26
    move-result v2

    .line 27
    .line 28
    if-nez v2, :cond_0

    .line 29
    .line 30
    .line 31
    invoke-virtual {p0}, Ly70/g;->b()Ljava/lang/String;

    .line 32
    move-result-object p0

    .line 33
    .line 34
    .line 35
    :goto_0
    invoke-static {v1, p0, p1}, Ly70/f;->e(Ljava/lang/String;Ljava/lang/String;I)I

    .line 36
    move-result p0

    .line 37
    return p0

    .line 38
    .line 39
    .line 40
    :cond_0
    invoke-virtual {p0}, Ly70/g;->b()Ljava/lang/String;

    .line 41
    move-result-object v2

    .line 42
    .line 43
    .line 44
    invoke-static {v1, v2}, Ly70/f;->b(Ljava/lang/String;Ljava/lang/String;)Z

    .line 45
    move-result v2

    .line 46
    .line 47
    if-eqz v2, :cond_1

    .line 48
    .line 49
    .line 50
    invoke-virtual {p0}, Ly70/g;->b()Ljava/lang/String;

    .line 51
    move-result-object p0

    .line 52
    goto :goto_0

    .line 53
    .line 54
    .line 55
    :cond_1
    invoke-virtual {p0}, Ly70/g;->c()Lcom/kubi/utils/storage/StorageType;

    .line 56
    move-result-object v2

    .line 57
    .line 58
    sget-object v3, Lcom/kubi/utils/storage/StorageType;->Shared:Lcom/kubi/utils/storage/StorageType;

    .line 59
    .line 60
    .line 61
    const-string/jumbo v4, "mmkv.default"

    .line 62
    .line 63
    if-ne v2, v3, :cond_2

    .line 64
    .line 65
    .line 66
    invoke-virtual {p0}, Ly70/g;->b()Ljava/lang/String;

    .line 67
    move-result-object v0

    .line 68
    .line 69
    .line 70
    invoke-static {v4, v0}, Ly70/f;->b(Ljava/lang/String;Ljava/lang/String;)Z

    .line 71
    move-result v0

    .line 72
    .line 73
    if-eqz v0, :cond_4

    .line 74
    .line 75
    .line 76
    invoke-virtual {p0}, Ly70/g;->b()Ljava/lang/String;

    .line 77
    move-result-object v0

    .line 78
    .line 79
    .line 80
    invoke-static {v4, v0, p1}, Ly70/f;->e(Ljava/lang/String;Ljava/lang/String;I)I

    .line 81
    move-result p1

    .line 82
    .line 83
    .line 84
    invoke-virtual {p0}, Ly70/g;->b()Ljava/lang/String;

    .line 85
    move-result-object v0

    .line 86
    .line 87
    .line 88
    invoke-static {v1, v0, p1}, Ly70/f;->m(Ljava/lang/String;Ljava/lang/String;I)Ly70/f;

    .line 89
    .line 90
    .line 91
    invoke-virtual {p0}, Ly70/g;->b()Ljava/lang/String;

    .line 92
    move-result-object p0

    .line 93
    .line 94
    .line 95
    invoke-static {v4, p0}, Ly70/f;->r(Ljava/lang/String;Ljava/lang/String;)Ly70/f;

    .line 96
    return p1

    .line 97
    .line 98
    .line 99
    :cond_2
    invoke-virtual {v0}, Ly70/d;->b()Ljava/lang/String;

    .line 100
    move-result-object v0

    .line 101
    .line 102
    const-string v2, "global"

    .line 103
    .line 104
    .line 105
    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 106
    move-result v0

    .line 107
    .line 108
    if-eqz v0, :cond_4

    .line 109
    .line 110
    .line 111
    invoke-virtual {p0}, Ly70/g;->a()Ljava/lang/String;

    .line 112
    move-result-object v0

    .line 113
    .line 114
    .line 115
    invoke-virtual {p0}, Ly70/g;->b()Ljava/lang/String;

    .line 116
    move-result-object v2

    .line 117
    .line 118
    .line 119
    invoke-static {v0, v2}, Ly70/f;->b(Ljava/lang/String;Ljava/lang/String;)Z

    .line 120
    move-result v0

    .line 121
    .line 122
    if-eqz v0, :cond_3

    .line 123
    .line 124
    .line 125
    invoke-virtual {p0}, Ly70/g;->a()Ljava/lang/String;

    .line 126
    move-result-object v0

    .line 127
    .line 128
    .line 129
    invoke-virtual {p0}, Ly70/g;->b()Ljava/lang/String;

    .line 130
    move-result-object v2

    .line 131
    .line 132
    .line 133
    invoke-static {v0, v2, p1}, Ly70/f;->e(Ljava/lang/String;Ljava/lang/String;I)I

    .line 134
    move-result p1

    .line 135
    .line 136
    .line 137
    invoke-virtual {p0}, Ly70/g;->b()Ljava/lang/String;

    .line 138
    move-result-object v0

    .line 139
    .line 140
    .line 141
    invoke-static {v1, v0, p1}, Ly70/f;->m(Ljava/lang/String;Ljava/lang/String;I)Ly70/f;

    .line 142
    .line 143
    .line 144
    invoke-virtual {p0}, Ly70/g;->a()Ljava/lang/String;

    .line 145
    move-result-object v0

    .line 146
    .line 147
    .line 148
    invoke-virtual {p0}, Ly70/g;->b()Ljava/lang/String;

    .line 149
    move-result-object p0

    .line 150
    .line 151
    .line 152
    invoke-static {v0, p0}, Ly70/f;->r(Ljava/lang/String;Ljava/lang/String;)Ly70/f;

    .line 153
    return p1

    .line 154
    .line 155
    .line 156
    :cond_3
    invoke-virtual {p0}, Ly70/g;->b()Ljava/lang/String;

    .line 157
    move-result-object v0

    .line 158
    .line 159
    .line 160
    invoke-static {v4, v0}, Ly70/f;->b(Ljava/lang/String;Ljava/lang/String;)Z

    .line 161
    move-result v0

    .line 162
    .line 163
    if-eqz v0, :cond_4

    .line 164
    .line 165
    .line 166
    invoke-virtual {p0}, Ly70/g;->b()Ljava/lang/String;

    .line 167
    move-result-object v0

    .line 168
    .line 169
    .line 170
    invoke-static {v4, v0, p1}, Ly70/f;->e(Ljava/lang/String;Ljava/lang/String;I)I

    .line 171
    move-result p1

    .line 172
    .line 173
    .line 174
    invoke-virtual {p0}, Ly70/g;->b()Ljava/lang/String;

    .line 175
    move-result-object v0

    .line 176
    .line 177
    .line 178
    invoke-static {v1, v0, p1}, Ly70/f;->m(Ljava/lang/String;Ljava/lang/String;I)Ly70/f;

    .line 179
    .line 180
    .line 181
    invoke-virtual {p0}, Ly70/g;->b()Ljava/lang/String;

    .line 182
    move-result-object p0

    .line 183
    .line 184
    .line 185
    invoke-static {v4, p0}, Ly70/f;->r(Ljava/lang/String;Ljava/lang/String;)Ly70/f;

    .line 186
    :cond_4
    return p1
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
.end method

.method public static final f(Ly70/g;J)J
    .locals 5
    .param p0    # Ly70/g;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ly70/g<",
            "Ljava/lang/Long;",
            ">;J)J"
        }
    .end annotation

    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    .line 1
    .line 2
    .line 3
    const-string/jumbo v0, "sid"

    .line 4
    .line 5
    .line 6
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    .line 8
    sget-object v0, Ly70/b;->a:Ly70/b;

    .line 9
    .line 10
    sget-object v0, Ly70/d;->a:Ly70/d;

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0}, Ly70/d;->b()Ljava/lang/String;

    .line 14
    move-result-object v1

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0}, Ly70/d;->e()Z

    .line 18
    move-result v2

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0, v1, v2}, Ly70/g;->e(Ljava/lang/String;Z)Ljava/lang/String;

    .line 22
    move-result-object v1

    .line 23
    .line 24
    .line 25
    invoke-virtual {p0}, Ly70/g;->d()Z

    .line 26
    move-result v2

    .line 27
    .line 28
    if-nez v2, :cond_0

    .line 29
    .line 30
    .line 31
    invoke-virtual {p0}, Ly70/g;->b()Ljava/lang/String;

    .line 32
    move-result-object p0

    .line 33
    .line 34
    .line 35
    :goto_0
    invoke-static {v1, p0, p1, p2}, Ly70/f;->f(Ljava/lang/String;Ljava/lang/String;J)J

    .line 36
    move-result-wide p0

    .line 37
    return-wide p0

    .line 38
    .line 39
    .line 40
    :cond_0
    invoke-virtual {p0}, Ly70/g;->b()Ljava/lang/String;

    .line 41
    move-result-object v2

    .line 42
    .line 43
    .line 44
    invoke-static {v1, v2}, Ly70/f;->b(Ljava/lang/String;Ljava/lang/String;)Z

    .line 45
    move-result v2

    .line 46
    .line 47
    if-eqz v2, :cond_1

    .line 48
    .line 49
    .line 50
    invoke-virtual {p0}, Ly70/g;->b()Ljava/lang/String;

    .line 51
    move-result-object p0

    .line 52
    goto :goto_0

    .line 53
    .line 54
    .line 55
    :cond_1
    invoke-virtual {p0}, Ly70/g;->c()Lcom/kubi/utils/storage/StorageType;

    .line 56
    move-result-object v2

    .line 57
    .line 58
    sget-object v3, Lcom/kubi/utils/storage/StorageType;->Shared:Lcom/kubi/utils/storage/StorageType;

    .line 59
    .line 60
    .line 61
    const-string/jumbo v4, "mmkv.default"

    .line 62
    .line 63
    if-ne v2, v3, :cond_2

    .line 64
    .line 65
    .line 66
    invoke-virtual {p0}, Ly70/g;->b()Ljava/lang/String;

    .line 67
    move-result-object v0

    .line 68
    .line 69
    .line 70
    invoke-static {v4, v0}, Ly70/f;->b(Ljava/lang/String;Ljava/lang/String;)Z

    .line 71
    move-result v0

    .line 72
    .line 73
    if-eqz v0, :cond_4

    .line 74
    .line 75
    .line 76
    invoke-virtual {p0}, Ly70/g;->b()Ljava/lang/String;

    .line 77
    move-result-object v0

    .line 78
    .line 79
    .line 80
    invoke-static {v4, v0, p1, p2}, Ly70/f;->f(Ljava/lang/String;Ljava/lang/String;J)J

    .line 81
    move-result-wide p1

    .line 82
    .line 83
    .line 84
    invoke-virtual {p0}, Ly70/g;->b()Ljava/lang/String;

    .line 85
    move-result-object v0

    .line 86
    .line 87
    .line 88
    invoke-static {v1, v0, p1, p2}, Ly70/f;->n(Ljava/lang/String;Ljava/lang/String;J)Ly70/f;

    .line 89
    .line 90
    .line 91
    invoke-virtual {p0}, Ly70/g;->b()Ljava/lang/String;

    .line 92
    move-result-object p0

    .line 93
    .line 94
    .line 95
    invoke-static {v4, p0}, Ly70/f;->r(Ljava/lang/String;Ljava/lang/String;)Ly70/f;

    .line 96
    return-wide p1

    .line 97
    .line 98
    .line 99
    :cond_2
    invoke-virtual {v0}, Ly70/d;->b()Ljava/lang/String;

    .line 100
    move-result-object v0

    .line 101
    .line 102
    const-string v2, "global"

    .line 103
    .line 104
    .line 105
    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 106
    move-result v0

    .line 107
    .line 108
    if-eqz v0, :cond_4

    .line 109
    .line 110
    .line 111
    invoke-virtual {p0}, Ly70/g;->a()Ljava/lang/String;

    .line 112
    move-result-object v0

    .line 113
    .line 114
    .line 115
    invoke-virtual {p0}, Ly70/g;->b()Ljava/lang/String;

    .line 116
    move-result-object v2

    .line 117
    .line 118
    .line 119
    invoke-static {v0, v2}, Ly70/f;->b(Ljava/lang/String;Ljava/lang/String;)Z

    .line 120
    move-result v0

    .line 121
    .line 122
    if-eqz v0, :cond_3

    .line 123
    .line 124
    .line 125
    invoke-virtual {p0}, Ly70/g;->a()Ljava/lang/String;

    .line 126
    move-result-object v0

    .line 127
    .line 128
    .line 129
    invoke-virtual {p0}, Ly70/g;->b()Ljava/lang/String;

    .line 130
    move-result-object v2

    .line 131
    .line 132
    .line 133
    invoke-static {v0, v2, p1, p2}, Ly70/f;->f(Ljava/lang/String;Ljava/lang/String;J)J

    .line 134
    move-result-wide p1

    .line 135
    .line 136
    .line 137
    invoke-virtual {p0}, Ly70/g;->b()Ljava/lang/String;

    .line 138
    move-result-object v0

    .line 139
    .line 140
    .line 141
    invoke-static {v1, v0, p1, p2}, Ly70/f;->n(Ljava/lang/String;Ljava/lang/String;J)Ly70/f;

    .line 142
    .line 143
    .line 144
    invoke-virtual {p0}, Ly70/g;->a()Ljava/lang/String;

    .line 145
    move-result-object v0

    .line 146
    .line 147
    .line 148
    invoke-virtual {p0}, Ly70/g;->b()Ljava/lang/String;

    .line 149
    move-result-object p0

    .line 150
    .line 151
    .line 152
    invoke-static {v0, p0}, Ly70/f;->r(Ljava/lang/String;Ljava/lang/String;)Ly70/f;

    .line 153
    return-wide p1

    .line 154
    .line 155
    .line 156
    :cond_3
    invoke-virtual {p0}, Ly70/g;->b()Ljava/lang/String;

    .line 157
    move-result-object v0

    .line 158
    .line 159
    .line 160
    invoke-static {v4, v0}, Ly70/f;->b(Ljava/lang/String;Ljava/lang/String;)Z

    .line 161
    move-result v0

    .line 162
    .line 163
    if-eqz v0, :cond_4

    .line 164
    .line 165
    .line 166
    invoke-virtual {p0}, Ly70/g;->b()Ljava/lang/String;

    .line 167
    move-result-object v0

    .line 168
    .line 169
    .line 170
    invoke-static {v4, v0, p1, p2}, Ly70/f;->f(Ljava/lang/String;Ljava/lang/String;J)J

    .line 171
    move-result-wide p1

    .line 172
    .line 173
    .line 174
    invoke-virtual {p0}, Ly70/g;->b()Ljava/lang/String;

    .line 175
    move-result-object v0

    .line 176
    .line 177
    .line 178
    invoke-static {v1, v0, p1, p2}, Ly70/f;->n(Ljava/lang/String;Ljava/lang/String;J)Ly70/f;

    .line 179
    .line 180
    .line 181
    invoke-virtual {p0}, Ly70/g;->b()Ljava/lang/String;

    .line 182
    move-result-object p0

    .line 183
    .line 184
    .line 185
    invoke-static {v4, p0}, Ly70/f;->r(Ljava/lang/String;Ljava/lang/String;)Ly70/f;

    .line 186
    :cond_4
    return-wide p1
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
.end method

.method public static final g(Ly70/g;Ljava/util/List;)Ljava/util/List;
    .locals 6
    .param p0    # Ly70/g;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Landroid/os/Parcelable;",
            ">(",
            "Ly70/g<",
            "Ljava/util/List<",
            "TT;>;>;",
            "Ljava/util/List<",
            "+TT;>;)",
            "Ljava/util/List<",
            "TT;>;"
        }
    .end annotation

    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    .line 3
    const-string/jumbo v0, "sid"

    .line 4
    .line 5
    .line 6
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    .line 8
    const-string v0, "defaultValue"

    .line 9
    .line 10
    .line 11
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    sget-object v0, Ly70/b;->a:Ly70/b;

    .line 14
    .line 15
    sget-object v0, Ly70/d;->a:Ly70/d;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0}, Ly70/d;->b()Ljava/lang/String;

    .line 19
    move-result-object v1

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0}, Ly70/d;->e()Z

    .line 23
    move-result v2

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0, v1, v2}, Ly70/g;->e(Ljava/lang/String;Z)Ljava/lang/String;

    .line 27
    move-result-object v1

    .line 28
    .line 29
    .line 30
    invoke-virtual {p0}, Ly70/g;->d()Z

    .line 31
    move-result v2

    .line 32
    .line 33
    const-class v3, Lcom/kubi/utils/storage/WrapperList;

    .line 34
    const/4 v4, 0x0

    .line 35
    .line 36
    if-eqz v2, :cond_3

    .line 37
    .line 38
    .line 39
    invoke-virtual {p0}, Ly70/g;->b()Ljava/lang/String;

    .line 40
    move-result-object v2

    .line 41
    .line 42
    .line 43
    invoke-static {v1, v2}, Ly70/f;->b(Ljava/lang/String;Ljava/lang/String;)Z

    .line 44
    move-result v2

    .line 45
    .line 46
    if-eqz v2, :cond_0

    .line 47
    goto :goto_0

    .line 48
    .line 49
    .line 50
    :cond_0
    invoke-virtual {p0}, Ly70/g;->c()Lcom/kubi/utils/storage/StorageType;

    .line 51
    move-result-object v2

    .line 52
    .line 53
    sget-object v5, Lcom/kubi/utils/storage/StorageType;->Shared:Lcom/kubi/utils/storage/StorageType;

    .line 54
    .line 55
    if-ne v2, v5, :cond_1

    .line 56
    goto :goto_1

    .line 57
    .line 58
    .line 59
    :cond_1
    invoke-virtual {v0}, Ly70/d;->b()Ljava/lang/String;

    .line 60
    move-result-object v0

    .line 61
    .line 62
    const-string v2, "global"

    .line 63
    .line 64
    .line 65
    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 66
    move-result v0

    .line 67
    .line 68
    if-eqz v0, :cond_4

    .line 69
    .line 70
    .line 71
    invoke-virtual {p0}, Ly70/g;->a()Ljava/lang/String;

    .line 72
    move-result-object v0

    .line 73
    .line 74
    .line 75
    invoke-virtual {p0}, Ly70/g;->b()Ljava/lang/String;

    .line 76
    move-result-object v2

    .line 77
    .line 78
    .line 79
    invoke-static {v0, v2}, Ly70/f;->b(Ljava/lang/String;Ljava/lang/String;)Z

    .line 80
    move-result v0

    .line 81
    .line 82
    if-eqz v0, :cond_4

    .line 83
    .line 84
    .line 85
    invoke-virtual {p0}, Ly70/g;->a()Ljava/lang/String;

    .line 86
    move-result-object v0

    .line 87
    .line 88
    .line 89
    invoke-virtual {p0}, Ly70/g;->b()Ljava/lang/String;

    .line 90
    move-result-object v2

    .line 91
    .line 92
    .line 93
    invoke-static {v0, v2, v3, v4}, Ly70/f;->h(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Class;Landroid/os/Parcelable;)Landroid/os/Parcelable;

    .line 94
    move-result-object v0

    .line 95
    .line 96
    check-cast v0, Lcom/kubi/utils/storage/WrapperList;

    .line 97
    .line 98
    if-eqz v0, :cond_2

    .line 99
    .line 100
    .line 101
    invoke-virtual {v0}, Lcom/kubi/utils/storage/WrapperList;->getJsonList()Ljava/util/List;

    .line 102
    move-result-object v4

    .line 103
    .line 104
    :cond_2
    if-eqz v4, :cond_4

    .line 105
    .line 106
    .line 107
    invoke-virtual {p0}, Ly70/g;->b()Ljava/lang/String;

    .line 108
    move-result-object p1

    .line 109
    .line 110
    .line 111
    invoke-static {v1, p1, v0}, Ly70/f;->o(Ljava/lang/String;Ljava/lang/String;Landroid/os/Parcelable;)Ly70/f;

    .line 112
    .line 113
    .line 114
    invoke-virtual {p0}, Ly70/g;->a()Ljava/lang/String;

    .line 115
    move-result-object p1

    .line 116
    .line 117
    .line 118
    invoke-virtual {p0}, Ly70/g;->b()Ljava/lang/String;

    .line 119
    move-result-object p0

    .line 120
    .line 121
    .line 122
    invoke-static {p1, p0}, Ly70/f;->r(Ljava/lang/String;Ljava/lang/String;)Ly70/f;

    .line 123
    return-object v4

    .line 124
    .line 125
    .line 126
    :cond_3
    :goto_0
    invoke-virtual {p0}, Ly70/g;->b()Ljava/lang/String;

    .line 127
    move-result-object p0

    .line 128
    .line 129
    .line 130
    invoke-static {v1, p0, v3, v4}, Ly70/f;->h(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Class;Landroid/os/Parcelable;)Landroid/os/Parcelable;

    .line 131
    move-result-object p0

    .line 132
    .line 133
    check-cast p0, Lcom/kubi/utils/storage/WrapperList;

    .line 134
    .line 135
    if-nez p0, :cond_5

    .line 136
    :cond_4
    :goto_1
    return-object p1

    .line 137
    .line 138
    .line 139
    :cond_5
    invoke-virtual {p0}, Lcom/kubi/utils/storage/WrapperList;->getJsonList()Ljava/util/List;

    .line 140
    move-result-object p0

    .line 141
    .line 142
    .line 143
    const-string/jumbo p1, "null cannot be cast to non-null type kotlin.collections.List<T of com.kubi.utils.storage.KVStoreCompat.getObjListReal>"

    .line 144
    .line 145
    .line 146
    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 147
    return-object p0
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
.end method

.method public static final h(Ly70/g;Ljava/lang/String;)Ljava/lang/String;
    .locals 5
    .param p0    # Ly70/g;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ly70/g<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/String;",
            ")",
            "Ljava/lang/String;"
        }
    .end annotation

    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    .line 3
    const-string/jumbo v0, "sid"

    .line 4
    .line 5
    .line 6
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    .line 8
    const-string v0, "defaultValue"

    .line 9
    .line 10
    .line 11
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    sget-object v0, Ly70/b;->a:Ly70/b;

    .line 14
    .line 15
    sget-object v0, Ly70/d;->a:Ly70/d;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0}, Ly70/d;->b()Ljava/lang/String;

    .line 19
    move-result-object v1

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0}, Ly70/d;->e()Z

    .line 23
    move-result v2

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0, v1, v2}, Ly70/g;->e(Ljava/lang/String;Z)Ljava/lang/String;

    .line 27
    move-result-object v1

    .line 28
    .line 29
    .line 30
    invoke-virtual {p0}, Ly70/g;->d()Z

    .line 31
    move-result v2

    .line 32
    .line 33
    if-nez v2, :cond_0

    .line 34
    .line 35
    .line 36
    invoke-virtual {p0}, Ly70/g;->b()Ljava/lang/String;

    .line 37
    move-result-object p0

    .line 38
    .line 39
    .line 40
    :goto_0
    invoke-static {v1, p0, p1}, Ly70/f;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 41
    move-result-object p0

    .line 42
    return-object p0

    .line 43
    .line 44
    .line 45
    :cond_0
    invoke-virtual {p0}, Ly70/g;->b()Ljava/lang/String;

    .line 46
    move-result-object v2

    .line 47
    .line 48
    .line 49
    invoke-static {v1, v2}, Ly70/f;->b(Ljava/lang/String;Ljava/lang/String;)Z

    .line 50
    move-result v2

    .line 51
    .line 52
    if-eqz v2, :cond_1

    .line 53
    .line 54
    .line 55
    invoke-virtual {p0}, Ly70/g;->b()Ljava/lang/String;

    .line 56
    move-result-object p0

    .line 57
    goto :goto_0

    .line 58
    .line 59
    .line 60
    :cond_1
    invoke-virtual {p0}, Ly70/g;->c()Lcom/kubi/utils/storage/StorageType;

    .line 61
    move-result-object v2

    .line 62
    .line 63
    sget-object v3, Lcom/kubi/utils/storage/StorageType;->Shared:Lcom/kubi/utils/storage/StorageType;

    .line 64
    .line 65
    .line 66
    const-string/jumbo v4, "mmkv.default"

    .line 67
    .line 68
    if-ne v2, v3, :cond_2

    .line 69
    .line 70
    .line 71
    invoke-virtual {p0}, Ly70/g;->b()Ljava/lang/String;

    .line 72
    move-result-object v0

    .line 73
    .line 74
    .line 75
    invoke-static {v4, v0}, Ly70/f;->b(Ljava/lang/String;Ljava/lang/String;)Z

    .line 76
    move-result v0

    .line 77
    .line 78
    if-eqz v0, :cond_4

    .line 79
    .line 80
    .line 81
    invoke-virtual {p0}, Ly70/g;->b()Ljava/lang/String;

    .line 82
    move-result-object v0

    .line 83
    .line 84
    .line 85
    invoke-static {v4, v0, p1}, Ly70/f;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 86
    move-result-object p1

    .line 87
    .line 88
    .line 89
    invoke-virtual {p0}, Ly70/g;->b()Ljava/lang/String;

    .line 90
    move-result-object v0

    .line 91
    .line 92
    .line 93
    invoke-static {v1, v0, p1}, Ly70/f;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ly70/f;

    .line 94
    .line 95
    .line 96
    invoke-virtual {p0}, Ly70/g;->b()Ljava/lang/String;

    .line 97
    move-result-object p0

    .line 98
    .line 99
    .line 100
    invoke-static {v4, p0}, Ly70/f;->r(Ljava/lang/String;Ljava/lang/String;)Ly70/f;

    .line 101
    return-object p1

    .line 102
    .line 103
    .line 104
    :cond_2
    invoke-virtual {v0}, Ly70/d;->b()Ljava/lang/String;

    .line 105
    move-result-object v0

    .line 106
    .line 107
    const-string v2, "global"

    .line 108
    .line 109
    .line 110
    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 111
    move-result v0

    .line 112
    .line 113
    if-eqz v0, :cond_4

    .line 114
    .line 115
    .line 116
    invoke-virtual {p0}, Ly70/g;->a()Ljava/lang/String;

    .line 117
    move-result-object v0

    .line 118
    .line 119
    .line 120
    invoke-virtual {p0}, Ly70/g;->b()Ljava/lang/String;

    .line 121
    move-result-object v2

    .line 122
    .line 123
    .line 124
    invoke-static {v0, v2}, Ly70/f;->b(Ljava/lang/String;Ljava/lang/String;)Z

    .line 125
    move-result v0

    .line 126
    .line 127
    if-eqz v0, :cond_3

    .line 128
    .line 129
    .line 130
    invoke-virtual {p0}, Ly70/g;->a()Ljava/lang/String;

    .line 131
    move-result-object v0

    .line 132
    .line 133
    .line 134
    invoke-virtual {p0}, Ly70/g;->b()Ljava/lang/String;

    .line 135
    move-result-object v2

    .line 136
    .line 137
    .line 138
    invoke-static {v0, v2, p1}, Ly70/f;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 139
    move-result-object p1

    .line 140
    .line 141
    .line 142
    invoke-virtual {p0}, Ly70/g;->b()Ljava/lang/String;

    .line 143
    move-result-object v0

    .line 144
    .line 145
    .line 146
    invoke-static {v1, v0, p1}, Ly70/f;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ly70/f;

    .line 147
    .line 148
    .line 149
    invoke-virtual {p0}, Ly70/g;->a()Ljava/lang/String;

    .line 150
    move-result-object v0

    .line 151
    .line 152
    .line 153
    invoke-virtual {p0}, Ly70/g;->b()Ljava/lang/String;

    .line 154
    move-result-object p0

    .line 155
    .line 156
    .line 157
    invoke-static {v0, p0}, Ly70/f;->r(Ljava/lang/String;Ljava/lang/String;)Ly70/f;

    .line 158
    return-object p1

    .line 159
    .line 160
    .line 161
    :cond_3
    invoke-virtual {p0}, Ly70/g;->b()Ljava/lang/String;

    .line 162
    move-result-object v0

    .line 163
    .line 164
    .line 165
    invoke-static {v4, v0}, Ly70/f;->b(Ljava/lang/String;Ljava/lang/String;)Z

    .line 166
    move-result v0

    .line 167
    .line 168
    if-eqz v0, :cond_4

    .line 169
    .line 170
    .line 171
    invoke-virtual {p0}, Ly70/g;->b()Ljava/lang/String;

    .line 172
    move-result-object v0

    .line 173
    .line 174
    .line 175
    invoke-static {v4, v0, p1}, Ly70/f;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 176
    move-result-object p1

    .line 177
    .line 178
    .line 179
    invoke-virtual {p0}, Ly70/g;->b()Ljava/lang/String;

    .line 180
    move-result-object v0

    .line 181
    .line 182
    .line 183
    invoke-static {v1, v0, p1}, Ly70/f;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ly70/f;

    .line 184
    .line 185
    .line 186
    invoke-virtual {p0}, Ly70/g;->b()Ljava/lang/String;

    .line 187
    move-result-object p0

    .line 188
    .line 189
    .line 190
    invoke-static {v4, p0}, Ly70/f;->r(Ljava/lang/String;Ljava/lang/String;)Ly70/f;

    .line 191
    :cond_4
    return-object p1
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
.end method

.method public static final i(Ly70/g;Ljava/util/Set;)Ljava/util/Set;
    .locals 5
    .param p0    # Ly70/g;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # Ljava/util/Set;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ly70/g<",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;>;",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    .line 3
    const-string/jumbo v0, "sid"

    .line 4
    .line 5
    .line 6
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    .line 8
    const-string v0, "defaultValue"

    .line 9
    .line 10
    .line 11
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    sget-object v0, Ly70/b;->a:Ly70/b;

    .line 14
    .line 15
    sget-object v0, Ly70/d;->a:Ly70/d;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0}, Ly70/d;->b()Ljava/lang/String;

    .line 19
    move-result-object v1

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0}, Ly70/d;->e()Z

    .line 23
    move-result v2

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0, v1, v2}, Ly70/g;->e(Ljava/lang/String;Z)Ljava/lang/String;

    .line 27
    move-result-object v1

    .line 28
    .line 29
    .line 30
    invoke-virtual {p0}, Ly70/g;->d()Z

    .line 31
    move-result v2

    .line 32
    .line 33
    if-nez v2, :cond_0

    .line 34
    .line 35
    .line 36
    invoke-virtual {p0}, Ly70/g;->b()Ljava/lang/String;

    .line 37
    move-result-object p0

    .line 38
    .line 39
    .line 40
    :goto_0
    invoke-static {v1, p0, p1}, Ly70/f;->j(Ljava/lang/String;Ljava/lang/String;Ljava/util/Set;)Ljava/util/Set;

    .line 41
    move-result-object p0

    .line 42
    return-object p0

    .line 43
    .line 44
    .line 45
    :cond_0
    invoke-virtual {p0}, Ly70/g;->b()Ljava/lang/String;

    .line 46
    move-result-object v2

    .line 47
    .line 48
    .line 49
    invoke-static {v1, v2}, Ly70/f;->b(Ljava/lang/String;Ljava/lang/String;)Z

    .line 50
    move-result v2

    .line 51
    .line 52
    if-eqz v2, :cond_1

    .line 53
    .line 54
    .line 55
    invoke-virtual {p0}, Ly70/g;->b()Ljava/lang/String;

    .line 56
    move-result-object p0

    .line 57
    goto :goto_0

    .line 58
    .line 59
    .line 60
    :cond_1
    invoke-virtual {p0}, Ly70/g;->c()Lcom/kubi/utils/storage/StorageType;

    .line 61
    move-result-object v2

    .line 62
    .line 63
    sget-object v3, Lcom/kubi/utils/storage/StorageType;->Shared:Lcom/kubi/utils/storage/StorageType;

    .line 64
    .line 65
    .line 66
    const-string/jumbo v4, "mmkv.default"

    .line 67
    .line 68
    if-ne v2, v3, :cond_2

    .line 69
    .line 70
    .line 71
    invoke-virtual {p0}, Ly70/g;->b()Ljava/lang/String;

    .line 72
    move-result-object v0

    .line 73
    .line 74
    .line 75
    invoke-static {v4, v0}, Ly70/f;->b(Ljava/lang/String;Ljava/lang/String;)Z

    .line 76
    move-result v0

    .line 77
    .line 78
    if-eqz v0, :cond_4

    .line 79
    .line 80
    .line 81
    invoke-virtual {p0}, Ly70/g;->b()Ljava/lang/String;

    .line 82
    move-result-object v0

    .line 83
    .line 84
    .line 85
    invoke-static {v4, v0, p1}, Ly70/f;->j(Ljava/lang/String;Ljava/lang/String;Ljava/util/Set;)Ljava/util/Set;

    .line 86
    move-result-object p1

    .line 87
    .line 88
    .line 89
    invoke-virtual {p0}, Ly70/g;->b()Ljava/lang/String;

    .line 90
    move-result-object v0

    .line 91
    .line 92
    .line 93
    invoke-static {v1, v0, p1}, Ly70/f;->q(Ljava/lang/String;Ljava/lang/String;Ljava/util/Set;)Ly70/f;

    .line 94
    .line 95
    .line 96
    invoke-virtual {p0}, Ly70/g;->b()Ljava/lang/String;

    .line 97
    move-result-object p0

    .line 98
    .line 99
    .line 100
    invoke-static {v4, p0}, Ly70/f;->r(Ljava/lang/String;Ljava/lang/String;)Ly70/f;

    .line 101
    return-object p1

    .line 102
    .line 103
    .line 104
    :cond_2
    invoke-virtual {v0}, Ly70/d;->b()Ljava/lang/String;

    .line 105
    move-result-object v0

    .line 106
    .line 107
    const-string v2, "global"

    .line 108
    .line 109
    .line 110
    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 111
    move-result v0

    .line 112
    .line 113
    if-eqz v0, :cond_4

    .line 114
    .line 115
    .line 116
    invoke-virtual {p0}, Ly70/g;->a()Ljava/lang/String;

    .line 117
    move-result-object v0

    .line 118
    .line 119
    .line 120
    invoke-virtual {p0}, Ly70/g;->b()Ljava/lang/String;

    .line 121
    move-result-object v2

    .line 122
    .line 123
    .line 124
    invoke-static {v0, v2}, Ly70/f;->b(Ljava/lang/String;Ljava/lang/String;)Z

    .line 125
    move-result v0

    .line 126
    .line 127
    if-eqz v0, :cond_3

    .line 128
    .line 129
    .line 130
    invoke-virtual {p0}, Ly70/g;->a()Ljava/lang/String;

    .line 131
    move-result-object v0

    .line 132
    .line 133
    .line 134
    invoke-virtual {p0}, Ly70/g;->b()Ljava/lang/String;

    .line 135
    move-result-object v2

    .line 136
    .line 137
    .line 138
    invoke-static {v0, v2, p1}, Ly70/f;->j(Ljava/lang/String;Ljava/lang/String;Ljava/util/Set;)Ljava/util/Set;

    .line 139
    move-result-object p1

    .line 140
    .line 141
    .line 142
    invoke-virtual {p0}, Ly70/g;->b()Ljava/lang/String;

    .line 143
    move-result-object v0

    .line 144
    .line 145
    .line 146
    invoke-static {v1, v0, p1}, Ly70/f;->q(Ljava/lang/String;Ljava/lang/String;Ljava/util/Set;)Ly70/f;

    .line 147
    .line 148
    .line 149
    invoke-virtual {p0}, Ly70/g;->a()Ljava/lang/String;

    .line 150
    move-result-object v0

    .line 151
    .line 152
    .line 153
    invoke-virtual {p0}, Ly70/g;->b()Ljava/lang/String;

    .line 154
    move-result-object p0

    .line 155
    .line 156
    .line 157
    invoke-static {v0, p0}, Ly70/f;->r(Ljava/lang/String;Ljava/lang/String;)Ly70/f;

    .line 158
    return-object p1

    .line 159
    .line 160
    .line 161
    :cond_3
    invoke-virtual {p0}, Ly70/g;->b()Ljava/lang/String;

    .line 162
    move-result-object v0

    .line 163
    .line 164
    .line 165
    invoke-static {v4, v0}, Ly70/f;->b(Ljava/lang/String;Ljava/lang/String;)Z

    .line 166
    move-result v0

    .line 167
    .line 168
    if-eqz v0, :cond_4

    .line 169
    .line 170
    .line 171
    invoke-virtual {p0}, Ly70/g;->b()Ljava/lang/String;

    .line 172
    move-result-object v0

    .line 173
    .line 174
    .line 175
    invoke-static {v4, v0, p1}, Ly70/f;->j(Ljava/lang/String;Ljava/lang/String;Ljava/util/Set;)Ljava/util/Set;

    .line 176
    move-result-object p1

    .line 177
    .line 178
    .line 179
    invoke-virtual {p0}, Ly70/g;->b()Ljava/lang/String;

    .line 180
    move-result-object v0

    .line 181
    .line 182
    .line 183
    invoke-static {v1, v0, p1}, Ly70/f;->q(Ljava/lang/String;Ljava/lang/String;Ljava/util/Set;)Ly70/f;

    .line 184
    .line 185
    .line 186
    invoke-virtual {p0}, Ly70/g;->b()Ljava/lang/String;

    .line 187
    move-result-object p0

    .line 188
    .line 189
    .line 190
    invoke-static {v4, p0}, Ly70/f;->r(Ljava/lang/String;Ljava/lang/String;)Ly70/f;

    .line 191
    :cond_4
    return-object p1
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
.end method

.method public static final k(Ly70/g;Z)Ly70/a;
    .locals 2
    .param p0    # Ly70/g;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ly70/g<",
            "Ljava/lang/Boolean;",
            ">;Z)",
            "Ly70/a;"
        }
    .end annotation

    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    .line 3
    const-string/jumbo v0, "sid"

    .line 4
    .line 5
    .line 6
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    .line 8
    sget-object v0, Ly70/b;->a:Ly70/b;

    .line 9
    .line 10
    sget-object v0, Ly70/d;->a:Ly70/d;

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0}, Ly70/d;->b()Ljava/lang/String;

    .line 14
    move-result-object v1

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0}, Ly70/d;->e()Z

    .line 18
    move-result v0

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0, v1, v0}, Ly70/g;->e(Ljava/lang/String;Z)Ljava/lang/String;

    .line 22
    move-result-object v0

    .line 23
    .line 24
    .line 25
    invoke-virtual {p0}, Ly70/g;->b()Ljava/lang/String;

    .line 26
    move-result-object p0

    .line 27
    .line 28
    .line 29
    invoke-static {v0, p0, p1}, Ly70/f;->l(Ljava/lang/String;Ljava/lang/String;Z)Ly70/f;

    .line 30
    .line 31
    sget-object p0, Ly70/a;->a:Ly70/a;

    .line 32
    return-object p0
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

.method public static final l(Ly70/g;I)Ly70/a;
    .locals 2
    .param p0    # Ly70/g;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ly70/g<",
            "Ljava/lang/Integer;",
            ">;I)",
            "Ly70/a;"
        }
    .end annotation

    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    .line 3
    const-string/jumbo v0, "sid"

    .line 4
    .line 5
    .line 6
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    .line 8
    sget-object v0, Ly70/b;->a:Ly70/b;

    .line 9
    .line 10
    sget-object v0, Ly70/d;->a:Ly70/d;

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0}, Ly70/d;->b()Ljava/lang/String;

    .line 14
    move-result-object v1

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0}, Ly70/d;->e()Z

    .line 18
    move-result v0

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0, v1, v0}, Ly70/g;->e(Ljava/lang/String;Z)Ljava/lang/String;

    .line 22
    move-result-object v0

    .line 23
    .line 24
    .line 25
    invoke-virtual {p0}, Ly70/g;->b()Ljava/lang/String;

    .line 26
    move-result-object p0

    .line 27
    .line 28
    .line 29
    invoke-static {v0, p0, p1}, Ly70/f;->m(Ljava/lang/String;Ljava/lang/String;I)Ly70/f;

    .line 30
    .line 31
    sget-object p0, Ly70/a;->a:Ly70/a;

    .line 32
    return-object p0
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

.method public static final m(Ly70/g;J)Ly70/a;
    .locals 2
    .param p0    # Ly70/g;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ly70/g<",
            "Ljava/lang/Long;",
            ">;J)",
            "Ly70/a;"
        }
    .end annotation

    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    .line 3
    const-string/jumbo v0, "sid"

    .line 4
    .line 5
    .line 6
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    .line 8
    sget-object v0, Ly70/b;->a:Ly70/b;

    .line 9
    .line 10
    sget-object v0, Ly70/d;->a:Ly70/d;

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0}, Ly70/d;->b()Ljava/lang/String;

    .line 14
    move-result-object v1

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0}, Ly70/d;->e()Z

    .line 18
    move-result v0

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0, v1, v0}, Ly70/g;->e(Ljava/lang/String;Z)Ljava/lang/String;

    .line 22
    move-result-object v0

    .line 23
    .line 24
    .line 25
    invoke-virtual {p0}, Ly70/g;->b()Ljava/lang/String;

    .line 26
    move-result-object p0

    .line 27
    .line 28
    .line 29
    invoke-static {v0, p0, p1, p2}, Ly70/f;->n(Ljava/lang/String;Ljava/lang/String;J)Ly70/f;

    .line 30
    .line 31
    sget-object p0, Ly70/a;->a:Ly70/a;

    .line 32
    return-object p0
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

.method public static final n(Ly70/g;Landroid/os/Parcelable;)Ly70/a;
    .locals 4
    .param p0    # Ly70/g;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # Landroid/os/Parcelable;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Landroid/os/Parcelable;",
            ">(",
            "Ly70/g<",
            "TT;>;",
            "Landroid/os/Parcelable;",
            ")",
            "Ly70/a;"
        }
    .end annotation

    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    .line 3
    const-string/jumbo v0, "sid"

    .line 4
    .line 5
    .line 6
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    const-string/jumbo v0, "value"

    .line 10
    .line 11
    .line 12
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    .line 14
    new-instance v0, Ly70/g;

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0}, Ly70/g;->a()Ljava/lang/String;

    .line 18
    move-result-object v1

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0}, Ly70/g;->b()Ljava/lang/String;

    .line 22
    move-result-object v2

    .line 23
    .line 24
    .line 25
    invoke-virtual {p0}, Ly70/g;->c()Lcom/kubi/utils/storage/StorageType;

    .line 26
    move-result-object v3

    .line 27
    .line 28
    .line 29
    invoke-virtual {p0}, Ly70/g;->d()Z

    .line 30
    move-result p0

    .line 31
    .line 32
    .line 33
    invoke-direct {v0, v1, v2, v3, p0}, Ly70/g;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/kubi/utils/storage/StorageType;Z)V

    .line 34
    .line 35
    sget-object p0, Ly70/b;->a:Ly70/b;

    .line 36
    .line 37
    sget-object p0, Ly70/d;->a:Ly70/d;

    .line 38
    .line 39
    .line 40
    invoke-virtual {p0}, Ly70/d;->b()Ljava/lang/String;

    .line 41
    move-result-object v1

    .line 42
    .line 43
    .line 44
    invoke-virtual {p0}, Ly70/d;->e()Z

    .line 45
    move-result p0

    .line 46
    .line 47
    .line 48
    invoke-virtual {v0, v1, p0}, Ly70/g;->e(Ljava/lang/String;Z)Ljava/lang/String;

    .line 49
    move-result-object p0

    .line 50
    .line 51
    .line 52
    invoke-virtual {v0}, Ly70/g;->b()Ljava/lang/String;

    .line 53
    move-result-object v0

    .line 54
    .line 55
    .line 56
    invoke-static {p0, v0, p1}, Ly70/f;->o(Ljava/lang/String;Ljava/lang/String;Landroid/os/Parcelable;)Ly70/f;

    .line 57
    .line 58
    sget-object p0, Ly70/a;->a:Ly70/a;

    .line 59
    return-object p0
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
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
.end method

.method public static final o(Ly70/g;Ljava/util/List;)Ly70/a;
    .locals 4
    .param p0    # Ly70/g;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Landroid/os/Parcelable;",
            ">(",
            "Ly70/g<",
            "Ljava/util/List<",
            "TT;>;>;",
            "Ljava/util/List<",
            "+TT;>;)",
            "Ly70/a;"
        }
    .end annotation

    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    .line 3
    const-string/jumbo v0, "sid"

    .line 4
    .line 5
    .line 6
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    const-string/jumbo v0, "list"

    .line 10
    .line 11
    .line 12
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    .line 14
    new-instance v0, Ly70/g;

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0}, Ly70/g;->a()Ljava/lang/String;

    .line 18
    move-result-object v1

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0}, Ly70/g;->b()Ljava/lang/String;

    .line 22
    move-result-object v2

    .line 23
    .line 24
    .line 25
    invoke-virtual {p0}, Ly70/g;->c()Lcom/kubi/utils/storage/StorageType;

    .line 26
    move-result-object v3

    .line 27
    .line 28
    .line 29
    invoke-virtual {p0}, Ly70/g;->d()Z

    .line 30
    move-result p0

    .line 31
    .line 32
    .line 33
    invoke-direct {v0, v1, v2, v3, p0}, Ly70/g;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/kubi/utils/storage/StorageType;Z)V

    .line 34
    .line 35
    new-instance p0, Lcom/kubi/utils/storage/WrapperList;

    .line 36
    .line 37
    .line 38
    invoke-direct {p0, p1}, Lcom/kubi/utils/storage/WrapperList;-><init>(Ljava/util/List;)V

    .line 39
    .line 40
    .line 41
    invoke-static {v0, p0}, Ly70/a;->n(Ly70/g;Landroid/os/Parcelable;)Ly70/a;

    .line 42
    move-result-object p0

    .line 43
    return-object p0
    .line 44
    .line 45
.end method

.method public static final p(Ly70/g;Ljava/lang/String;)Ly70/a;
    .locals 2
    .param p0    # Ly70/g;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ly70/g<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/String;",
            ")",
            "Ly70/a;"
        }
    .end annotation

    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    .line 3
    const-string/jumbo v0, "sid"

    .line 4
    .line 5
    .line 6
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    const-string/jumbo v0, "value"

    .line 10
    .line 11
    .line 12
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    .line 14
    sget-object v0, Ly70/b;->a:Ly70/b;

    .line 15
    .line 16
    sget-object v0, Ly70/d;->a:Ly70/d;

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0}, Ly70/d;->b()Ljava/lang/String;

    .line 20
    move-result-object v1

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0}, Ly70/d;->e()Z

    .line 24
    move-result v0

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0, v1, v0}, Ly70/g;->e(Ljava/lang/String;Z)Ljava/lang/String;

    .line 28
    move-result-object v0

    .line 29
    .line 30
    .line 31
    invoke-virtual {p0}, Ly70/g;->b()Ljava/lang/String;

    .line 32
    move-result-object p0

    .line 33
    .line 34
    .line 35
    invoke-static {v0, p0, p1}, Ly70/f;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ly70/f;

    .line 36
    .line 37
    sget-object p0, Ly70/a;->a:Ly70/a;

    .line 38
    return-object p0
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
.end method

.method public static final q(Ly70/g;Ljava/util/Set;)Ly70/a;
    .locals 2
    .param p0    # Ly70/g;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # Ljava/util/Set;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ly70/g<",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;>;",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;)",
            "Ly70/a;"
        }
    .end annotation

    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    .line 3
    const-string/jumbo v0, "sid"

    .line 4
    .line 5
    .line 6
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    const-string/jumbo v0, "value"

    .line 10
    .line 11
    .line 12
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    .line 14
    sget-object v0, Ly70/b;->a:Ly70/b;

    .line 15
    .line 16
    sget-object v0, Ly70/d;->a:Ly70/d;

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0}, Ly70/d;->b()Ljava/lang/String;

    .line 20
    move-result-object v1

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0}, Ly70/d;->e()Z

    .line 24
    move-result v0

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0, v1, v0}, Ly70/g;->e(Ljava/lang/String;Z)Ljava/lang/String;

    .line 28
    move-result-object v0

    .line 29
    .line 30
    .line 31
    invoke-virtual {p0}, Ly70/g;->b()Ljava/lang/String;

    .line 32
    move-result-object p0

    .line 33
    .line 34
    .line 35
    invoke-static {v0, p0, p1}, Ly70/f;->q(Ljava/lang/String;Ljava/lang/String;Ljava/util/Set;)Ly70/f;

    .line 36
    .line 37
    sget-object p0, Ly70/a;->a:Ly70/a;

    .line 38
    return-object p0
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
.end method

.method public static final r(Ly70/g;)Ly70/a;
    .locals 2
    .param p0    # Ly70/g;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ly70/g<",
            "TT;>;)",
            "Ly70/a;"
        }
    .end annotation

    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    .line 3
    const-string/jumbo v0, "sid"

    .line 4
    .line 5
    .line 6
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    .line 8
    sget-object v0, Ly70/b;->a:Ly70/b;

    .line 9
    .line 10
    sget-object v0, Ly70/d;->a:Ly70/d;

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0}, Ly70/d;->b()Ljava/lang/String;

    .line 14
    move-result-object v1

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0}, Ly70/d;->e()Z

    .line 18
    move-result v0

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0, v1, v0}, Ly70/g;->e(Ljava/lang/String;Z)Ljava/lang/String;

    .line 22
    move-result-object v0

    .line 23
    .line 24
    .line 25
    invoke-virtual {p0}, Ly70/g;->b()Ljava/lang/String;

    .line 26
    move-result-object v1

    .line 27
    .line 28
    .line 29
    invoke-static {v0, v1}, Ly70/f;->r(Ljava/lang/String;Ljava/lang/String;)Ly70/f;

    .line 30
    .line 31
    .line 32
    invoke-virtual {p0}, Ly70/g;->d()Z

    .line 33
    move-result v0

    .line 34
    .line 35
    if-eqz v0, :cond_0

    .line 36
    .line 37
    sget-object v0, Lcom/kubi/utils/DataMapUtil;->a:Lcom/kubi/utils/DataMapUtil;

    .line 38
    .line 39
    .line 40
    invoke-virtual {p0}, Ly70/g;->b()Ljava/lang/String;

    .line 41
    move-result-object p0

    .line 42
    .line 43
    .line 44
    invoke-virtual {v0, p0}, Lcom/kubi/utils/DataMapUtil;->p(Ljava/lang/String;)Lcom/kubi/utils/DataMapUtil;

    .line 45
    .line 46
    :cond_0
    sget-object p0, Ly70/a;->a:Ly70/a;

    .line 47
    return-object p0
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
.end method


# virtual methods
.method public final j(Ly70/g;Ljava/lang/Class;Landroid/os/Parcelable;)Landroid/os/Parcelable;
    .locals 4
    .param p1    # Ly70/g;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/Class;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Landroid/os/Parcelable;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Landroid/os/Parcelable;",
            ">(",
            "Ly70/g<",
            "TT;>;",
            "Ljava/lang/Class<",
            "TT;>;TT;)TT;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    .line 3
    const-string/jumbo v0, "sid"

    .line 4
    .line 5
    .line 6
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    .line 8
    const-string v0, "clazz"

    .line 9
    .line 10
    .line 11
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    sget-object v0, Ly70/b;->a:Ly70/b;

    .line 14
    .line 15
    sget-object v0, Ly70/d;->a:Ly70/d;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0}, Ly70/d;->b()Ljava/lang/String;

    .line 19
    move-result-object v1

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0}, Ly70/d;->e()Z

    .line 23
    move-result v2

    .line 24
    .line 25
    .line 26
    invoke-virtual {p1, v1, v2}, Ly70/g;->e(Ljava/lang/String;Z)Ljava/lang/String;

    .line 27
    move-result-object v1

    .line 28
    .line 29
    .line 30
    invoke-virtual {p1}, Ly70/g;->d()Z

    .line 31
    move-result v2

    .line 32
    .line 33
    if-eqz v2, :cond_3

    .line 34
    .line 35
    .line 36
    invoke-virtual {p1}, Ly70/g;->b()Ljava/lang/String;

    .line 37
    move-result-object v2

    .line 38
    .line 39
    .line 40
    invoke-static {v1, v2}, Ly70/f;->b(Ljava/lang/String;Ljava/lang/String;)Z

    .line 41
    move-result v2

    .line 42
    .line 43
    if-eqz v2, :cond_0

    .line 44
    goto :goto_1

    .line 45
    .line 46
    .line 47
    :cond_0
    invoke-virtual {p1}, Ly70/g;->c()Lcom/kubi/utils/storage/StorageType;

    .line 48
    move-result-object v2

    .line 49
    .line 50
    sget-object v3, Lcom/kubi/utils/storage/StorageType;->Shared:Lcom/kubi/utils/storage/StorageType;

    .line 51
    .line 52
    if-ne v2, v3, :cond_1

    .line 53
    goto :goto_0

    .line 54
    .line 55
    .line 56
    :cond_1
    invoke-virtual {v0}, Ly70/d;->b()Ljava/lang/String;

    .line 57
    move-result-object v0

    .line 58
    .line 59
    const-string v2, "global"

    .line 60
    .line 61
    .line 62
    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 63
    move-result v0

    .line 64
    .line 65
    if-eqz v0, :cond_2

    .line 66
    .line 67
    .line 68
    invoke-virtual {p1}, Ly70/g;->a()Ljava/lang/String;

    .line 69
    move-result-object v0

    .line 70
    .line 71
    .line 72
    invoke-virtual {p1}, Ly70/g;->b()Ljava/lang/String;

    .line 73
    move-result-object v2

    .line 74
    .line 75
    .line 76
    invoke-static {v0, v2}, Ly70/f;->b(Ljava/lang/String;Ljava/lang/String;)Z

    .line 77
    move-result v0

    .line 78
    .line 79
    if-eqz v0, :cond_2

    .line 80
    .line 81
    .line 82
    invoke-virtual {p1}, Ly70/g;->a()Ljava/lang/String;

    .line 83
    move-result-object v0

    .line 84
    .line 85
    .line 86
    invoke-virtual {p1}, Ly70/g;->b()Ljava/lang/String;

    .line 87
    move-result-object v2

    .line 88
    .line 89
    .line 90
    invoke-static {v0, v2, p2, p3}, Ly70/f;->h(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Class;Landroid/os/Parcelable;)Landroid/os/Parcelable;

    .line 91
    move-result-object p2

    .line 92
    .line 93
    .line 94
    invoke-virtual {p1}, Ly70/g;->b()Ljava/lang/String;

    .line 95
    move-result-object p3

    .line 96
    .line 97
    .line 98
    const-string/jumbo v0, "null cannot be cast to non-null type android.os.Parcelable"

    .line 99
    .line 100
    .line 101
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 102
    .line 103
    .line 104
    invoke-static {v1, p3, p2}, Ly70/f;->o(Ljava/lang/String;Ljava/lang/String;Landroid/os/Parcelable;)Ly70/f;

    .line 105
    .line 106
    .line 107
    invoke-virtual {p1}, Ly70/g;->a()Ljava/lang/String;

    .line 108
    move-result-object p3

    .line 109
    .line 110
    .line 111
    invoke-virtual {p1}, Ly70/g;->b()Ljava/lang/String;

    .line 112
    move-result-object p1

    .line 113
    .line 114
    .line 115
    invoke-static {p3, p1}, Ly70/f;->r(Ljava/lang/String;Ljava/lang/String;)Ly70/f;

    .line 116
    return-object p2

    .line 117
    :cond_2
    :goto_0
    return-object p3

    .line 118
    .line 119
    .line 120
    :cond_3
    :goto_1
    invoke-virtual {p1}, Ly70/g;->b()Ljava/lang/String;

    .line 121
    move-result-object p1

    .line 122
    .line 123
    .line 124
    invoke-static {v1, p1, p2, p3}, Ly70/f;->h(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Class;Landroid/os/Parcelable;)Landroid/os/Parcelable;

    .line 125
    move-result-object p1

    .line 126
    return-object p1
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
.end method
