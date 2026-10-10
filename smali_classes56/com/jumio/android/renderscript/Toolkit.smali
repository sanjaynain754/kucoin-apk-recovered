.class public final Lcom/jumio/android/renderscript/Toolkit;
.super Ljava/lang/Object;
.source "Toolkit.kt"

# interfaces
.implements Ljava/lang/AutoCloseable;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0010\u0014\n\u0002\u0008\u0010\n\u0002\u0010\u0015\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0006\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008%\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0007\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u0008\u0010\u0007\u001a\u00020\u0008H\u0016J<\u0010\t\u001a\u00020\u00082\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000c\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\n\u0008\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0007J,\u0010\t\u001a\u00020\u00082\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00152\n\u0008\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0007J>\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0008\u0008\u0002\u0010\u001a\u001a\u00020\u00102\n\u0008\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0007J&\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u001b\u001a\u00020\u00152\u0008\u0008\u0002\u0010\u001a\u001a\u00020\u00102\n\u0008\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0007JN\u0010&\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\r2\u0006\u0010\'\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010(\u001a\u00020\u00102\u0006\u0010)\u001a\u00020\u001d2\u0008\u0008\u0002\u0010*\u001a\u00020\u001d2\n\u0008\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0007J.\u0010&\u001a\u00020\u00152\u0006\u0010\u001b\u001a\u00020\u00152\u0006\u0010)\u001a\u00020\u001d2\u0008\u0008\u0002\u0010*\u001a\u00020\u001d2\n\u0008\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0007J<\u0010+\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010,\u001a\u00020\u001d2\n\u0008\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0007J$\u0010+\u001a\u00020\u00152\u0006\u0010\u001b\u001a\u00020\u00152\u0006\u0010,\u001a\u00020\u001d2\n\u0008\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0007J4\u0010-\u001a\u00020.2\u0006\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\n\u0008\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0007J\u001c\u0010-\u001a\u00020.2\u0006\u0010\u001b\u001a\u00020\u00152\n\u0008\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0007J@\u0010/\u001a\u00020.2\u0006\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\n\u0008\u0002\u0010,\u001a\u0004\u0018\u00010\u001d2\n\u0008\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0007J(\u0010/\u001a\u00020.2\u0006\u0010\u001b\u001a\u00020\u00152\n\u0008\u0002\u0010,\u001a\u0004\u0018\u00010\u001d2\n\u0008\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0007J4\u00100\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u00101\u001a\u0002022\n\u0008\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0007J$\u00100\u001a\u00020\u00152\u0006\u0010\u001b\u001a\u00020\u00152\u0006\u00101\u001a\u0002022\n\u0008\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0007J4\u00103\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u00104\u001a\u0002052\n\u0008\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0007J$\u00103\u001a\u00020\u00152\u0006\u0010\u001b\u001a\u00020\u00152\u0006\u00104\u001a\u0002052\n\u0008\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0007JD\u00106\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u00102\u0006\u00107\u001a\u00020\u00102\u0006\u00108\u001a\u00020\u00102\u0006\u00109\u001a\u00020\u00102\u0006\u0010:\u001a\u00020\u00102\n\u0008\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0007J,\u00106\u001a\u00020\u00152\u0006\u0010\u001b\u001a\u00020\u00152\u0006\u00109\u001a\u00020\u00102\u0006\u0010:\u001a\u00020\u00102\n\u0008\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0007J&\u0010;\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010<\u001a\u00020=J&\u0010>\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010<\u001a\u00020=J\u001a\u0010?\u001a\u00020@2\u0006\u0010\u001b\u001a\u00020\u00152\n\u0008\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013J\u001a\u0010A\u001a\u00020@2\u0006\u0010\u001b\u001a\u00020\u00152\n\u0008\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013J\u001a\u0010B\u001a\u00020\u00102\u0006\u0010\u001b\u001a\u00020\u00152\n\u0008\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013J\u0010\u0010C\u001a\u0004\u0018\u00010\r2\u0006\u0010D\u001a\u00020EJ\u0008\u0010F\u001a\u00020\u0008H\u0002J\t\u0010G\u001a\u00020\u0006H\u0082 J\u0011\u0010H\u001a\u00020\u00082\u0006\u0010\u0005\u001a\u00020\u0006H\u0082 JC\u0010I\u001a\u00020\u00082\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00102\u0006\u0010\u000c\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0082 J3\u0010J\u001a\u00020\u00082\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00152\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0082 JK\u0010K\u001a\u00020\u00082\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u00102\u0006\u0010L\u001a\u00020\r2\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0082 J3\u0010M\u001a\u00020\u00082\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u00152\u0006\u0010N\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\u00102\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0082 J[\u0010O\u001a\u00020\u00082\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\r2\u0006\u0010\'\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010L\u001a\u00020\r2\u0006\u0010(\u001a\u00020\u00102\u0006\u0010)\u001a\u00020\u001d2\u0006\u0010*\u001a\u00020\u001d2\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0082 J;\u0010P\u001a\u00020\u00082\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u00152\u0006\u0010N\u001a\u00020\u00152\u0006\u0010)\u001a\u00020\u001d2\u0006\u0010*\u001a\u00020\u001d2\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0082 JK\u0010Q\u001a\u00020\u00082\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010L\u001a\u00020\r2\u0006\u0010,\u001a\u00020\u001d2\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0082 J3\u0010R\u001a\u00020\u00082\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u00152\u0006\u0010N\u001a\u00020\u00152\u0006\u0010,\u001a\u00020\u001d2\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0082 JC\u0010S\u001a\u00020\u00082\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010L\u001a\u00020.2\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0082 J+\u0010T\u001a\u00020\u00082\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u00152\u0006\u0010L\u001a\u00020.2\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0082 JK\u0010U\u001a\u00020\u00082\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010L\u001a\u00020.2\u0006\u0010,\u001a\u00020\u001d2\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0082 J3\u0010V\u001a\u00020\u00082\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u00152\u0006\u0010L\u001a\u00020.2\u0006\u0010,\u001a\u00020\u001d2\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0082 J[\u0010W\u001a\u00020\u00082\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\r2\u0006\u0010L\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010X\u001a\u00020\r2\u0006\u0010Y\u001a\u00020\r2\u0006\u0010Z\u001a\u00020\r2\u0006\u0010[\u001a\u00020\r2\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0082 JK\u0010\\\u001a\u00020\u00082\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u00152\u0006\u0010N\u001a\u00020\u00152\u0006\u0010X\u001a\u00020\r2\u0006\u0010Y\u001a\u00020\r2\u0006\u0010Z\u001a\u00020\r2\u0006\u0010[\u001a\u00020\r2\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0082 J[\u0010]\u001a\u00020\u00082\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\r2\u0006\u0010L\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u00104\u001a\u00020\r2\u0006\u0010^\u001a\u00020\u00102\u0006\u0010_\u001a\u00020\u00102\u0006\u0010`\u001a\u00020\u00102\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0082 JK\u0010a\u001a\u00020\u00082\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u00152\u0006\u0010N\u001a\u00020\u00152\u0006\u00104\u001a\u00020\r2\u0006\u0010^\u001a\u00020\u00102\u0006\u0010_\u001a\u00020\u00102\u0006\u0010`\u001a\u00020\u00102\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0082 JS\u0010b\u001a\u00020\u00082\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u00102\u0006\u00107\u001a\u00020\u00102\u0006\u00108\u001a\u00020\u00102\u0006\u0010L\u001a\u00020\r2\u0006\u00109\u001a\u00020\u00102\u0006\u0010:\u001a\u00020\u00102\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0082 J+\u0010c\u001a\u00020\u00082\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u00152\u0006\u0010N\u001a\u00020\u00152\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0082 J9\u0010d\u001a\u00020\u00082\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\r2\u0006\u0010L\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010<\u001a\u00020\u0010H\u0082 J9\u0010e\u001a\u00020\u00082\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010N\u001a\u00020\u00152\u0006\u0010f\u001a\u00020\u0010H\u0082 J#\u0010g\u001a\u00020@2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u00152\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0082 J#\u0010h\u001a\u00020@2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u00152\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0082 J#\u0010i\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u00152\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0082 Ja\u0010j\u001a\u00020k2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010l\u001a\u00020\u00102\u0006\u0010m\u001a\u00020\u00102\u0006\u0010n\u001a\u00020o2\u0006\u0010p\u001a\u00020o2\u0006\u0010q\u001a\u00020o2\u0006\u0010r\u001a\u00020\u00102\u0006\u0010s\u001a\u00020\u00102\u0006\u0010t\u001a\u00020\u00102\u0006\u0010u\u001a\u00020\u00102\u0006\u0010v\u001a\u00020\rH\u0082 R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u001c\u001a\u00020\u001d8F\u00a2\u0006\u0006\u001a\u0004\u0008\u001e\u0010\u001fR\u0011\u0010 \u001a\u00020\u001d8F\u00a2\u0006\u0006\u001a\u0004\u0008!\u0010\u001fR\u0011\u0010\"\u001a\u00020\u001d8F\u00a2\u0006\u0006\u001a\u0004\u0008#\u0010\u001fR\u0011\u0010$\u001a\u00020\u001d8F\u00a2\u0006\u0006\u001a\u0004\u0008%\u0010\u001f\u00a8\u0006w"
    }
    d2 = {
        "Lcom/jumio/android/renderscript/Toolkit;",
        "Ljava/lang/AutoCloseable;",
        "Lkotlin/AutoCloseable;",
        "<init>",
        "()V",
        "nativeHandle",
        "",
        "close",
        "",
        "blend",
        "mode",
        "Lcom/jumio/android/renderscript/BlendingMode;",
        "sourceArray",
        "",
        "destArray",
        "sizeX",
        "",
        "sizeY",
        "restriction",
        "Lcom/jumio/android/renderscript/Range2d;",
        "sourceBitmap",
        "Landroid/graphics/Bitmap;",
        "destBitmap",
        "blur",
        "inputArray",
        "vectorSize",
        "radius",
        "inputBitmap",
        "identityMatrix",
        "",
        "getIdentityMatrix",
        "()[F",
        "greyScaleColorMatrix",
        "getGreyScaleColorMatrix",
        "rgbToYuvMatrix",
        "getRgbToYuvMatrix",
        "yuvToRgbMatrix",
        "getYuvToRgbMatrix",
        "colorMatrix",
        "inputVectorSize",
        "outputVectorSize",
        "matrix",
        "addVector",
        "convolve",
        "coefficients",
        "histogram",
        "",
        "histogramDot",
        "lut",
        "table",
        "Lcom/jumio/android/renderscript/LookupTable;",
        "lut3d",
        "cube",
        "Lcom/jumio/android/renderscript/Rgba3dArray;",
        "resize",
        "inputSizeX",
        "inputSizeY",
        "outputSizeX",
        "outputSizeY",
        "yuvToRgb",
        "format",
        "Lcom/jumio/android/renderscript/YuvFormat;",
        "yuvToRgbBitmap",
        "standardDeviation",
        "",
        "standardDeviationFast",
        "averageColor",
        "toNv21",
        "image",
        "Landroid/media/Image;",
        "validateHandle",
        "createNative",
        "destroyNative",
        "nativeBlend",
        "nativeBlendBitmap",
        "nativeBlur",
        "outputArray",
        "nativeBlurBitmap",
        "outputBitmap",
        "nativeColorMatrix",
        "nativeColorMatrixBitmap",
        "nativeConvolve",
        "nativeConvolveBitmap",
        "nativeHistogram",
        "nativeHistogramBitmap",
        "nativeHistogramDot",
        "nativeHistogramDotBitmap",
        "nativeLut",
        "red",
        "green",
        "blue",
        "alpha",
        "nativeLutBitmap",
        "nativeLut3d",
        "cubeSizeX",
        "cubeSizeY",
        "cubeSizeZ",
        "nativeLut3dBitmap",
        "nativeResize",
        "nativeResizeBitmap",
        "nativeYuvToRgb",
        "nativeYuvToRgbBitmap",
        "value",
        "nativeStandardDeviationBitmap",
        "nativeStandardDeviationBitmapFast",
        "nativeAverageColorBitmap",
        "nativeYuv420toNv21",
        "",
        "imageWidth",
        "imageHeight",
        "yByteBuffer",
        "Ljava/nio/ByteBuffer;",
        "uByteBuffer",
        "vByteBuffer",
        "yPixelStride",
        "uvPixelStride",
        "yRowStride",
        "uvRowStride",
        "nv21Output",
        "jumio-toolkit_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nToolkit.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Toolkit.kt\ncom/jumio/android/renderscript/Toolkit\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1658:1\n1#2:1659\n*E\n"
    }
.end annotation


# instance fields
.field private nativeHandle:J


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    const-string v0, "jumio-toolkit"

    .line 6
    .line 7
    .line 8
    invoke-static {v0}, Ljava/lang/System;->loadLibrary(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0}, Lcom/jumio/android/renderscript/Toolkit;->createNative()J

    .line 12
    move-result-wide v0

    .line 13
    .line 14
    iput-wide v0, p0, Lcom/jumio/android/renderscript/Toolkit;->nativeHandle:J

    .line 15
    return-void
    .line 16
.end method

.method public static synthetic averageColor$default(Lcom/jumio/android/renderscript/Toolkit;Landroid/graphics/Bitmap;Lcom/jumio/android/renderscript/Range2d;ILjava/lang/Object;)I
    .locals 0

    .line 1
    .line 2
    and-int/lit8 p3, p3, 0x2

    .line 3
    .line 4
    if-eqz p3, :cond_0

    .line 5
    const/4 p2, 0x0

    .line 6
    .line 7
    .line 8
    :cond_0
    invoke-virtual {p0, p1, p2}, Lcom/jumio/android/renderscript/Toolkit;->averageColor(Landroid/graphics/Bitmap;Lcom/jumio/android/renderscript/Range2d;)I

    .line 9
    move-result p0

    .line 10
    return p0
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
.end method

.method public static synthetic blend$default(Lcom/jumio/android/renderscript/Toolkit;Lcom/jumio/android/renderscript/BlendingMode;Landroid/graphics/Bitmap;Landroid/graphics/Bitmap;Lcom/jumio/android/renderscript/Range2d;ILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_0

    const/4 p4, 0x0

    .line 2
    :cond_0
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/jumio/android/renderscript/Toolkit;->blend(Lcom/jumio/android/renderscript/BlendingMode;Landroid/graphics/Bitmap;Landroid/graphics/Bitmap;Lcom/jumio/android/renderscript/Range2d;)V

    return-void
.end method

.method public static synthetic blend$default(Lcom/jumio/android/renderscript/Toolkit;Lcom/jumio/android/renderscript/BlendingMode;[B[BIILcom/jumio/android/renderscript/Range2d;ILjava/lang/Object;)V
    .locals 7

    and-int/lit8 p7, p7, 0x20

    if-eqz p7, :cond_0

    const/4 p6, 0x0

    :cond_0
    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move v4, p4

    move v5, p5

    move-object v6, p6

    .line 1
    invoke-virtual/range {v0 .. v6}, Lcom/jumio/android/renderscript/Toolkit;->blend(Lcom/jumio/android/renderscript/BlendingMode;[B[BIILcom/jumio/android/renderscript/Range2d;)V

    return-void
.end method

.method public static synthetic blur$default(Lcom/jumio/android/renderscript/Toolkit;Landroid/graphics/Bitmap;ILcom/jumio/android/renderscript/Range2d;ILjava/lang/Object;)Landroid/graphics/Bitmap;
    .locals 0

    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_0

    const/4 p2, 0x5

    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    const/4 p3, 0x0

    .line 2
    :cond_1
    invoke-virtual {p0, p1, p2, p3}, Lcom/jumio/android/renderscript/Toolkit;->blur(Landroid/graphics/Bitmap;ILcom/jumio/android/renderscript/Range2d;)Landroid/graphics/Bitmap;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic blur$default(Lcom/jumio/android/renderscript/Toolkit;[BIIIILcom/jumio/android/renderscript/Range2d;ILjava/lang/Object;)[B
    .locals 7

    and-int/lit8 p8, p7, 0x10

    if-eqz p8, :cond_0

    const/4 p5, 0x5

    :cond_0
    move v5, p5

    and-int/lit8 p5, p7, 0x20

    if-eqz p5, :cond_1

    const/4 p6, 0x0

    :cond_1
    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move v3, p3

    move v4, p4

    move-object v6, p6

    .line 1
    invoke-virtual/range {v0 .. v6}, Lcom/jumio/android/renderscript/Toolkit;->blur([BIIIILcom/jumio/android/renderscript/Range2d;)[B

    move-result-object p0

    return-object p0
.end method

.method public static synthetic colorMatrix$default(Lcom/jumio/android/renderscript/Toolkit;Landroid/graphics/Bitmap;[F[FLcom/jumio/android/renderscript/Range2d;ILjava/lang/Object;)Landroid/graphics/Bitmap;
    .locals 1

    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_0

    const/4 p3, 0x4

    .line 3
    new-array p3, p3, [F

    const/4 p6, 0x0

    const/4 v0, 0x0

    aput v0, p3, p6

    const/4 p6, 0x1

    aput v0, p3, p6

    const/4 p6, 0x2

    aput v0, p3, p6

    const/4 p6, 0x3

    aput v0, p3, p6

    :cond_0
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_1

    const/4 p4, 0x0

    .line 4
    :cond_1
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/jumio/android/renderscript/Toolkit;->colorMatrix(Landroid/graphics/Bitmap;[F[FLcom/jumio/android/renderscript/Range2d;)Landroid/graphics/Bitmap;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic colorMatrix$default(Lcom/jumio/android/renderscript/Toolkit;[BIIII[F[FLcom/jumio/android/renderscript/Range2d;ILjava/lang/Object;)[B
    .locals 13

    move/from16 v0, p9

    and-int/lit8 v1, v0, 0x40

    if-eqz v1, :cond_0

    const/4 v1, 0x4

    .line 1
    new-array v1, v1, [F

    const/4 v2, 0x0

    const/4 v3, 0x0

    aput v3, v1, v2

    const/4 v2, 0x1

    aput v3, v1, v2

    const/4 v2, 0x2

    aput v3, v1, v2

    const/4 v2, 0x3

    aput v3, v1, v2

    move-object v11, v1

    goto :goto_0

    :cond_0
    move-object/from16 v11, p7

    :goto_0
    and-int/lit16 v0, v0, 0x80

    if-eqz v0, :cond_1

    const/4 v0, 0x0

    move-object v12, v0

    :goto_1
    move-object v4, p0

    move-object v5, p1

    move v6, p2

    move/from16 v7, p3

    move/from16 v8, p4

    move/from16 v9, p5

    move-object/from16 v10, p6

    goto :goto_2

    :cond_1
    move-object/from16 v12, p8

    goto :goto_1

    .line 2
    :goto_2
    invoke-virtual/range {v4 .. v12}, Lcom/jumio/android/renderscript/Toolkit;->colorMatrix([BIIII[F[FLcom/jumio/android/renderscript/Range2d;)[B

    move-result-object p0

    return-object p0
.end method

.method public static synthetic convolve$default(Lcom/jumio/android/renderscript/Toolkit;Landroid/graphics/Bitmap;[FLcom/jumio/android/renderscript/Range2d;ILjava/lang/Object;)Landroid/graphics/Bitmap;
    .locals 0

    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    const/4 p3, 0x0

    .line 2
    :cond_0
    invoke-virtual {p0, p1, p2, p3}, Lcom/jumio/android/renderscript/Toolkit;->convolve(Landroid/graphics/Bitmap;[FLcom/jumio/android/renderscript/Range2d;)Landroid/graphics/Bitmap;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic convolve$default(Lcom/jumio/android/renderscript/Toolkit;[BIII[FLcom/jumio/android/renderscript/Range2d;ILjava/lang/Object;)[B
    .locals 7

    and-int/lit8 p7, p7, 0x20

    if-eqz p7, :cond_0

    const/4 p6, 0x0

    :cond_0
    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move v3, p3

    move v4, p4

    move-object v5, p5

    move-object v6, p6

    .line 1
    invoke-virtual/range {v0 .. v6}, Lcom/jumio/android/renderscript/Toolkit;->convolve([BIII[FLcom/jumio/android/renderscript/Range2d;)[B

    move-result-object p0

    return-object p0
.end method

.method private final native createNative()J
.end method

.method private final native destroyNative(J)V
.end method

.method public static synthetic histogram$default(Lcom/jumio/android/renderscript/Toolkit;Landroid/graphics/Bitmap;Lcom/jumio/android/renderscript/Range2d;ILjava/lang/Object;)[I
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    .line 2
    :cond_0
    invoke-virtual {p0, p1, p2}, Lcom/jumio/android/renderscript/Toolkit;->histogram(Landroid/graphics/Bitmap;Lcom/jumio/android/renderscript/Range2d;)[I

    move-result-object p0

    return-object p0
.end method

.method public static synthetic histogram$default(Lcom/jumio/android/renderscript/Toolkit;[BIIILcom/jumio/android/renderscript/Range2d;ILjava/lang/Object;)[I
    .locals 6

    and-int/lit8 p6, p6, 0x10

    if-eqz p6, :cond_0

    const/4 p5, 0x0

    :cond_0
    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move v3, p3

    move v4, p4

    move-object v5, p5

    .line 1
    invoke-virtual/range {v0 .. v5}, Lcom/jumio/android/renderscript/Toolkit;->histogram([BIIILcom/jumio/android/renderscript/Range2d;)[I

    move-result-object p0

    return-object p0
.end method

.method public static synthetic histogramDot$default(Lcom/jumio/android/renderscript/Toolkit;Landroid/graphics/Bitmap;[FLcom/jumio/android/renderscript/Range2d;ILjava/lang/Object;)[I
    .locals 1

    and-int/lit8 p5, p4, 0x2

    const/4 v0, 0x0

    if-eqz p5, :cond_0

    move-object p2, v0

    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    move-object p3, v0

    .line 2
    :cond_1
    invoke-virtual {p0, p1, p2, p3}, Lcom/jumio/android/renderscript/Toolkit;->histogramDot(Landroid/graphics/Bitmap;[FLcom/jumio/android/renderscript/Range2d;)[I

    move-result-object p0

    return-object p0
.end method

.method public static synthetic histogramDot$default(Lcom/jumio/android/renderscript/Toolkit;[BIII[FLcom/jumio/android/renderscript/Range2d;ILjava/lang/Object;)[I
    .locals 1

    and-int/lit8 p8, p7, 0x10

    const/4 v0, 0x0

    if-eqz p8, :cond_0

    move-object p5, v0

    :cond_0
    and-int/lit8 p7, p7, 0x20

    if-eqz p7, :cond_1

    move-object p6, v0

    .line 1
    :cond_1
    invoke-virtual/range {p0 .. p6}, Lcom/jumio/android/renderscript/Toolkit;->histogramDot([BIII[FLcom/jumio/android/renderscript/Range2d;)[I

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lut$default(Lcom/jumio/android/renderscript/Toolkit;Landroid/graphics/Bitmap;Lcom/jumio/android/renderscript/LookupTable;Lcom/jumio/android/renderscript/Range2d;ILjava/lang/Object;)Landroid/graphics/Bitmap;
    .locals 0

    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    const/4 p3, 0x0

    .line 2
    :cond_0
    invoke-virtual {p0, p1, p2, p3}, Lcom/jumio/android/renderscript/Toolkit;->lut(Landroid/graphics/Bitmap;Lcom/jumio/android/renderscript/LookupTable;Lcom/jumio/android/renderscript/Range2d;)Landroid/graphics/Bitmap;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lut$default(Lcom/jumio/android/renderscript/Toolkit;[BIILcom/jumio/android/renderscript/LookupTable;Lcom/jumio/android/renderscript/Range2d;ILjava/lang/Object;)[B
    .locals 6

    and-int/lit8 p6, p6, 0x10

    if-eqz p6, :cond_0

    const/4 p5, 0x0

    :cond_0
    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move v3, p3

    move-object v4, p4

    move-object v5, p5

    .line 1
    invoke-virtual/range {v0 .. v5}, Lcom/jumio/android/renderscript/Toolkit;->lut([BIILcom/jumio/android/renderscript/LookupTable;Lcom/jumio/android/renderscript/Range2d;)[B

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lut3d$default(Lcom/jumio/android/renderscript/Toolkit;Landroid/graphics/Bitmap;Lcom/jumio/android/renderscript/Rgba3dArray;Lcom/jumio/android/renderscript/Range2d;ILjava/lang/Object;)Landroid/graphics/Bitmap;
    .locals 0

    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    const/4 p3, 0x0

    .line 2
    :cond_0
    invoke-virtual {p0, p1, p2, p3}, Lcom/jumio/android/renderscript/Toolkit;->lut3d(Landroid/graphics/Bitmap;Lcom/jumio/android/renderscript/Rgba3dArray;Lcom/jumio/android/renderscript/Range2d;)Landroid/graphics/Bitmap;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lut3d$default(Lcom/jumio/android/renderscript/Toolkit;[BIILcom/jumio/android/renderscript/Rgba3dArray;Lcom/jumio/android/renderscript/Range2d;ILjava/lang/Object;)[B
    .locals 6

    and-int/lit8 p6, p6, 0x10

    if-eqz p6, :cond_0

    const/4 p5, 0x0

    :cond_0
    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move v3, p3

    move-object v4, p4

    move-object v5, p5

    .line 1
    invoke-virtual/range {v0 .. v5}, Lcom/jumio/android/renderscript/Toolkit;->lut3d([BIILcom/jumio/android/renderscript/Rgba3dArray;Lcom/jumio/android/renderscript/Range2d;)[B

    move-result-object p0

    return-object p0
.end method

.method private final native nativeAverageColorBitmap(JLandroid/graphics/Bitmap;Lcom/jumio/android/renderscript/Range2d;)I
.end method

.method private final native nativeBlend(JI[B[BIILcom/jumio/android/renderscript/Range2d;)V
.end method

.method private final native nativeBlendBitmap(JILandroid/graphics/Bitmap;Landroid/graphics/Bitmap;Lcom/jumio/android/renderscript/Range2d;)V
.end method

.method private final native nativeBlur(J[BIIII[BLcom/jumio/android/renderscript/Range2d;)V
.end method

.method private final native nativeBlurBitmap(JLandroid/graphics/Bitmap;Landroid/graphics/Bitmap;ILcom/jumio/android/renderscript/Range2d;)V
.end method

.method private final native nativeColorMatrix(J[BIII[BI[F[FLcom/jumio/android/renderscript/Range2d;)V
.end method

.method private final native nativeColorMatrixBitmap(JLandroid/graphics/Bitmap;Landroid/graphics/Bitmap;[F[FLcom/jumio/android/renderscript/Range2d;)V
.end method

.method private final native nativeConvolve(J[BIII[B[FLcom/jumio/android/renderscript/Range2d;)V
.end method

.method private final native nativeConvolveBitmap(JLandroid/graphics/Bitmap;Landroid/graphics/Bitmap;[FLcom/jumio/android/renderscript/Range2d;)V
.end method

.method private final native nativeHistogram(J[BIII[ILcom/jumio/android/renderscript/Range2d;)V
.end method

.method private final native nativeHistogramBitmap(JLandroid/graphics/Bitmap;[ILcom/jumio/android/renderscript/Range2d;)V
.end method

.method private final native nativeHistogramDot(J[BIII[I[FLcom/jumio/android/renderscript/Range2d;)V
.end method

.method private final native nativeHistogramDotBitmap(JLandroid/graphics/Bitmap;[I[FLcom/jumio/android/renderscript/Range2d;)V
.end method

.method private final native nativeLut(J[B[BII[B[B[B[BLcom/jumio/android/renderscript/Range2d;)V
.end method

.method private final native nativeLut3d(J[B[BII[BIIILcom/jumio/android/renderscript/Range2d;)V
.end method

.method private final native nativeLut3dBitmap(JLandroid/graphics/Bitmap;Landroid/graphics/Bitmap;[BIIILcom/jumio/android/renderscript/Range2d;)V
.end method

.method private final native nativeLutBitmap(JLandroid/graphics/Bitmap;Landroid/graphics/Bitmap;[B[B[B[BLcom/jumio/android/renderscript/Range2d;)V
.end method

.method private final native nativeResize(J[BIII[BIILcom/jumio/android/renderscript/Range2d;)V
.end method

.method private final native nativeResizeBitmap(JLandroid/graphics/Bitmap;Landroid/graphics/Bitmap;Lcom/jumio/android/renderscript/Range2d;)V
.end method

.method private final native nativeStandardDeviationBitmap(JLandroid/graphics/Bitmap;Lcom/jumio/android/renderscript/Range2d;)D
.end method

.method private final native nativeStandardDeviationBitmapFast(JLandroid/graphics/Bitmap;Lcom/jumio/android/renderscript/Range2d;)D
.end method

.method private final native nativeYuv420toNv21(JIILjava/nio/ByteBuffer;Ljava/nio/ByteBuffer;Ljava/nio/ByteBuffer;IIII[B)Z
.end method

.method private final native nativeYuvToRgb(J[B[BIII)V
.end method

.method private final native nativeYuvToRgbBitmap(J[BIILandroid/graphics/Bitmap;I)V
.end method

.method public static synthetic resize$default(Lcom/jumio/android/renderscript/Toolkit;Landroid/graphics/Bitmap;IILcom/jumio/android/renderscript/Range2d;ILjava/lang/Object;)Landroid/graphics/Bitmap;
    .locals 0

    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_0

    const/4 p4, 0x0

    .line 2
    :cond_0
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/jumio/android/renderscript/Toolkit;->resize(Landroid/graphics/Bitmap;IILcom/jumio/android/renderscript/Range2d;)Landroid/graphics/Bitmap;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic resize$default(Lcom/jumio/android/renderscript/Toolkit;[BIIIIILcom/jumio/android/renderscript/Range2d;ILjava/lang/Object;)[B
    .locals 9

    and-int/lit8 v0, p8, 0x40

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    move-object v8, v0

    :goto_0
    move-object v1, p0

    move-object v2, p1

    move v3, p2

    move v4, p3

    move v5, p4

    move v6, p5

    move v7, p6

    goto :goto_1

    :cond_0
    move-object/from16 v8, p7

    goto :goto_0

    .line 1
    :goto_1
    invoke-virtual/range {v1 .. v8}, Lcom/jumio/android/renderscript/Toolkit;->resize([BIIIIILcom/jumio/android/renderscript/Range2d;)[B

    move-result-object p0

    return-object p0
.end method

.method public static synthetic standardDeviation$default(Lcom/jumio/android/renderscript/Toolkit;Landroid/graphics/Bitmap;Lcom/jumio/android/renderscript/Range2d;ILjava/lang/Object;)D
    .locals 0

    .line 1
    .line 2
    and-int/lit8 p3, p3, 0x2

    .line 3
    .line 4
    if-eqz p3, :cond_0

    .line 5
    const/4 p2, 0x0

    .line 6
    .line 7
    .line 8
    :cond_0
    invoke-virtual {p0, p1, p2}, Lcom/jumio/android/renderscript/Toolkit;->standardDeviation(Landroid/graphics/Bitmap;Lcom/jumio/android/renderscript/Range2d;)D

    .line 9
    move-result-wide p0

    .line 10
    return-wide p0
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
.end method

.method public static synthetic standardDeviationFast$default(Lcom/jumio/android/renderscript/Toolkit;Landroid/graphics/Bitmap;Lcom/jumio/android/renderscript/Range2d;ILjava/lang/Object;)D
    .locals 0

    .line 1
    .line 2
    and-int/lit8 p3, p3, 0x2

    .line 3
    .line 4
    if-eqz p3, :cond_0

    .line 5
    const/4 p2, 0x0

    .line 6
    .line 7
    .line 8
    :cond_0
    invoke-virtual {p0, p1, p2}, Lcom/jumio/android/renderscript/Toolkit;->standardDeviationFast(Landroid/graphics/Bitmap;Lcom/jumio/android/renderscript/Range2d;)D

    .line 9
    move-result-wide p0

    .line 10
    return-wide p0
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
.end method

.method private final validateHandle()V
    .locals 4

    .line 1
    .line 2
    iget-wide v0, p0, Lcom/jumio/android/renderscript/Toolkit;->nativeHandle:J

    .line 3
    .line 4
    const-wide/16 v2, 0x0

    .line 5
    .line 6
    cmp-long v0, v0, v2

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    return-void

    .line 10
    .line 11
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 12
    .line 13
    const-string v1, "This instance of Toolkit can not be used anymore"

    .line 14
    .line 15
    .line 16
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 17
    throw v0
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
.end method


# virtual methods
.method public final averageColor(Landroid/graphics/Bitmap;Lcom/jumio/android/renderscript/Range2d;)I
    .locals 4
    .param p1    # Landroid/graphics/Bitmap;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/jumio/android/renderscript/Range2d;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "inputBitmap"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-direct {p0}, Lcom/jumio/android/renderscript/Toolkit;->validateHandle()V

    .line 9
    const/4 v0, 0x4

    .line 10
    const/4 v1, 0x0

    .line 11
    .line 12
    const-string v2, "standardDeviation"

    .line 13
    const/4 v3, 0x0

    .line 14
    .line 15
    .line 16
    invoke-static {v2, p1, v3, v0, v1}, Lcom/jumio/android/renderscript/ToolkitKt;->validateBitmap$default(Ljava/lang/String;Landroid/graphics/Bitmap;ZILjava/lang/Object;)V

    .line 17
    .line 18
    iget-wide v0, p0, Lcom/jumio/android/renderscript/Toolkit;->nativeHandle:J

    .line 19
    .line 20
    .line 21
    invoke-direct {p0, v0, v1, p1, p2}, Lcom/jumio/android/renderscript/Toolkit;->nativeAverageColorBitmap(JLandroid/graphics/Bitmap;Lcom/jumio/android/renderscript/Range2d;)I

    .line 22
    move-result p1

    .line 23
    return p1
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
.end method

.method public final blend(Lcom/jumio/android/renderscript/BlendingMode;Landroid/graphics/Bitmap;Landroid/graphics/Bitmap;)V
    .locals 8
    .param p1    # Lcom/jumio/android/renderscript/BlendingMode;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Landroid/graphics/Bitmap;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Landroid/graphics/Bitmap;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    .line 1
    const-string v0, "mode"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sourceBitmap"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "destBitmap"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v6, 0x8

    const/4 v7, 0x0

    const/4 v5, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    invoke-static/range {v1 .. v7}, Lcom/jumio/android/renderscript/Toolkit;->blend$default(Lcom/jumio/android/renderscript/Toolkit;Lcom/jumio/android/renderscript/BlendingMode;Landroid/graphics/Bitmap;Landroid/graphics/Bitmap;Lcom/jumio/android/renderscript/Range2d;ILjava/lang/Object;)V

    return-void
.end method

.method public final blend(Lcom/jumio/android/renderscript/BlendingMode;Landroid/graphics/Bitmap;Landroid/graphics/Bitmap;Lcom/jumio/android/renderscript/Range2d;)V
    .locals 10
    .param p1    # Lcom/jumio/android/renderscript/BlendingMode;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Landroid/graphics/Bitmap;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Landroid/graphics/Bitmap;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Lcom/jumio/android/renderscript/Range2d;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    const-string v0, "mode"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sourceBitmap"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "destBitmap"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    invoke-direct {p0}, Lcom/jumio/android/renderscript/Toolkit;->validateHandle()V

    .line 13
    const-string v0, "blend"

    const/4 v1, 0x0

    const/4 v2, 0x4

    const/4 v3, 0x0

    invoke-static {v0, p2, v1, v2, v3}, Lcom/jumio/android/renderscript/ToolkitKt;->validateBitmap$default(Ljava/lang/String;Landroid/graphics/Bitmap;ZILjava/lang/Object;)V

    .line 14
    invoke-static {v0, p3, v1, v2, v3}, Lcom/jumio/android/renderscript/ToolkitKt;->validateBitmap$default(Ljava/lang/String;Landroid/graphics/Bitmap;ZILjava/lang/Object;)V

    .line 15
    invoke-virtual {p2}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v1

    invoke-virtual {p3}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v2

    const-string v3, " provided."

    const-string v4, " and "

    if-ne v1, v2, :cond_1

    .line 16
    invoke-virtual {p2}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v1

    invoke-virtual {p3}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v2

    if-ne v1, v2, :cond_1

    .line 17
    invoke-virtual {p2}, Landroid/graphics/Bitmap;->getConfig()Landroid/graphics/Bitmap$Config;

    move-result-object v1

    invoke-virtual {p3}, Landroid/graphics/Bitmap;->getConfig()Landroid/graphics/Bitmap$Config;

    move-result-object v2

    if-ne v1, v2, :cond_0

    .line 18
    invoke-virtual {p2}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v1

    invoke-virtual {p2}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v2

    invoke-static {v0, v1, v2, p4}, Lcom/jumio/android/renderscript/ToolkitKt;->validateRestriction(Ljava/lang/String;IILcom/jumio/android/renderscript/Range2d;)V

    .line 19
    iget-wide v4, p0, Lcom/jumio/android/renderscript/Toolkit;->nativeHandle:J

    invoke-virtual {p1}, Lcom/jumio/android/renderscript/BlendingMode;->getValue()I

    move-result v6

    move-object v3, p0

    move-object v7, p2

    move-object v8, p3

    move-object v9, p4

    invoke-direct/range {v3 .. v9}, Lcom/jumio/android/renderscript/Toolkit;->nativeBlendBitmap(JILandroid/graphics/Bitmap;Landroid/graphics/Bitmap;Lcom/jumio/android/renderscript/Range2d;)V

    return-void

    :cond_0
    move-object v7, p2

    move-object v8, p3

    .line 20
    invoke-virtual {v7}, Landroid/graphics/Bitmap;->getConfig()Landroid/graphics/Bitmap$Config;

    move-result-object p1

    invoke-virtual {v8}, Landroid/graphics/Bitmap;->getConfig()Landroid/graphics/Bitmap$Config;

    move-result-object p2

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    const-string p4, "RenderScript Toolkit blend. Source and destination bitmaps should have the same config. "

    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 21
    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_1
    move-object v7, p2

    move-object v8, p3

    .line 22
    invoke-virtual {v7}, Landroid/graphics/Bitmap;->getWidth()I

    move-result p1

    invoke-virtual {v7}, Landroid/graphics/Bitmap;->getHeight()I

    move-result p2

    .line 23
    invoke-virtual {v8}, Landroid/graphics/Bitmap;->getWidth()I

    move-result p3

    invoke-virtual {v8}, Landroid/graphics/Bitmap;->getHeight()I

    move-result p4

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "RenderScript Toolkit blend. Source and destination bitmaps should be the same size. "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, "x"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 24
    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method public final blend(Lcom/jumio/android/renderscript/BlendingMode;[B[BII)V
    .locals 10
    .param p1    # Lcom/jumio/android/renderscript/BlendingMode;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # [B
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # [B
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    .line 2
    const-string v0, "mode"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sourceArray"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "destArray"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v8, 0x20

    const/4 v9, 0x0

    const/4 v7, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move v5, p4

    move v6, p5

    invoke-static/range {v1 .. v9}, Lcom/jumio/android/renderscript/Toolkit;->blend$default(Lcom/jumio/android/renderscript/Toolkit;Lcom/jumio/android/renderscript/BlendingMode;[B[BIILcom/jumio/android/renderscript/Range2d;ILjava/lang/Object;)V

    return-void
.end method

.method public final blend(Lcom/jumio/android/renderscript/BlendingMode;[B[BIILcom/jumio/android/renderscript/Range2d;)V
    .locals 9
    .param p1    # Lcom/jumio/android/renderscript/BlendingMode;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # [B
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # [B
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p6    # Lcom/jumio/android/renderscript/Range2d;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    const-string v0, "mode"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sourceArray"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "destArray"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    invoke-direct {p0}, Lcom/jumio/android/renderscript/Toolkit;->validateHandle()V

    .line 4
    array-length v0, p2

    mul-int v1, p4, p5

    mul-int/lit8 v1, v1, 0x4

    const-string v2, "."

    const-string v3, "*4 < "

    const-string v4, "*"

    const-string v5, "RenderScript Toolkit blend. sourceArray is too small for the given dimensions. "

    if-lt v0, v1, :cond_1

    .line 5
    array-length v0, p3

    if-lt v0, v1, :cond_0

    .line 6
    const-string v0, "blend"

    invoke-static {v0, p4, p5, p6}, Lcom/jumio/android/renderscript/ToolkitKt;->validateRestriction(Ljava/lang/String;IILcom/jumio/android/renderscript/Range2d;)V

    .line 7
    iget-wide v1, p0, Lcom/jumio/android/renderscript/Toolkit;->nativeHandle:J

    invoke-virtual {p1}, Lcom/jumio/android/renderscript/BlendingMode;->getValue()I

    move-result v3

    move-object v0, p0

    move-object v4, p2

    move-object v5, p3

    move v6, p4

    move v7, p5

    move-object v8, p6

    invoke-direct/range {v0 .. v8}, Lcom/jumio/android/renderscript/Toolkit;->nativeBlend(JI[B[BIILcom/jumio/android/renderscript/Range2d;)V

    return-void

    .line 8
    :cond_0
    array-length p1, p2

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 9
    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2

    .line 10
    :cond_1
    array-length p1, p2

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 11
    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method public final blur(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;
    .locals 7
    .param p1    # Landroid/graphics/Bitmap;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    const-string v0, "inputBitmap"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v5, 0x6

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    move-object v2, p1

    invoke-static/range {v1 .. v6}, Lcom/jumio/android/renderscript/Toolkit;->blur$default(Lcom/jumio/android/renderscript/Toolkit;Landroid/graphics/Bitmap;ILcom/jumio/android/renderscript/Range2d;ILjava/lang/Object;)Landroid/graphics/Bitmap;

    move-result-object p1

    return-object p1
.end method

.method public final blur(Landroid/graphics/Bitmap;I)Landroid/graphics/Bitmap;
    .locals 7
    .param p1    # Landroid/graphics/Bitmap;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 2
    const-string v0, "inputBitmap"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    move-object v2, p1

    move v3, p2

    invoke-static/range {v1 .. v6}, Lcom/jumio/android/renderscript/Toolkit;->blur$default(Lcom/jumio/android/renderscript/Toolkit;Landroid/graphics/Bitmap;ILcom/jumio/android/renderscript/Range2d;ILjava/lang/Object;)Landroid/graphics/Bitmap;

    move-result-object p1

    return-object p1
.end method

.method public final blur(Landroid/graphics/Bitmap;ILcom/jumio/android/renderscript/Range2d;)Landroid/graphics/Bitmap;
    .locals 10
    .param p1    # Landroid/graphics/Bitmap;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lcom/jumio/android/renderscript/Range2d;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "inputBitmap"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    invoke-direct {p0}, Lcom/jumio/android/renderscript/Toolkit;->validateHandle()V

    const/4 v0, 0x4

    const/4 v1, 0x0

    .line 19
    const-string v2, "blur"

    const/4 v3, 0x0

    invoke-static {v2, p1, v3, v0, v1}, Lcom/jumio/android/renderscript/ToolkitKt;->validateBitmap$default(Ljava/lang/String;Landroid/graphics/Bitmap;ZILjava/lang/Object;)V

    const/4 v0, 0x1

    if-gt v0, p2, :cond_0

    const/16 v0, 0x1a

    if-ge p2, v0, :cond_0

    .line 20
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v0

    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v1

    invoke-static {v2, v0, v1, p3}, Lcom/jumio/android/renderscript/ToolkitKt;->validateRestriction(Ljava/lang/String;IILcom/jumio/android/renderscript/Range2d;)V

    .line 21
    invoke-static {p1}, Lcom/jumio/android/renderscript/ToolkitKt;->createCompatibleBitmap(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;

    move-result-object v7

    .line 22
    iget-wide v4, p0, Lcom/jumio/android/renderscript/Toolkit;->nativeHandle:J

    move-object v3, p0

    move-object v6, p1

    move v8, p2

    move-object v9, p3

    invoke-direct/range {v3 .. v9}, Lcom/jumio/android/renderscript/Toolkit;->nativeBlurBitmap(JLandroid/graphics/Bitmap;Landroid/graphics/Bitmap;ILcom/jumio/android/renderscript/Range2d;)V

    return-object v7

    :cond_0
    move v8, p2

    .line 23
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string p2, "RenderScript Toolkit blur. The radius should be between 1 and 25. "

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p2, " provided."

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 24
    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method public final blur([BIII)[B
    .locals 10
    .param p1    # [B
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 3
    const-string v0, "inputArray"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v8, 0x30

    const/4 v9, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v1, p0

    move-object v2, p1

    move v3, p2

    move v4, p3

    move v5, p4

    invoke-static/range {v1 .. v9}, Lcom/jumio/android/renderscript/Toolkit;->blur$default(Lcom/jumio/android/renderscript/Toolkit;[BIIIILcom/jumio/android/renderscript/Range2d;ILjava/lang/Object;)[B

    move-result-object p1

    return-object p1
.end method

.method public final blur([BIIII)[B
    .locals 10
    .param p1    # [B
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 4
    const-string v0, "inputArray"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v8, 0x20

    const/4 v9, 0x0

    const/4 v7, 0x0

    move-object v1, p0

    move-object v2, p1

    move v3, p2

    move v4, p3

    move v5, p4

    move v6, p5

    invoke-static/range {v1 .. v9}, Lcom/jumio/android/renderscript/Toolkit;->blur$default(Lcom/jumio/android/renderscript/Toolkit;[BIIIILcom/jumio/android/renderscript/Range2d;ILjava/lang/Object;)[B

    move-result-object p1

    return-object p1
.end method

.method public final blur([BIIIILcom/jumio/android/renderscript/Range2d;)[B
    .locals 10
    .param p1    # [B
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p6    # Lcom/jumio/android/renderscript/Range2d;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "inputArray"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 5
    invoke-direct {p0}, Lcom/jumio/android/renderscript/Toolkit;->validateHandle()V

    .line 6
    const-string v0, " provided."

    const/4 v1, 0x1

    if-eq p2, v1, :cond_1

    const/4 v2, 0x4

    if-ne p2, v2, :cond_0

    goto :goto_0

    .line 7
    :cond_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "RenderScript Toolkit blur. The vectorSize should be 1 or 4. "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 8
    new-instance v1, Ljava/lang/IllegalArgumentException;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 9
    :cond_1
    :goto_0
    array-length v2, p1

    mul-int v8, p3, p4

    mul-int/2addr v8, p2

    if-lt v2, v8, :cond_3

    if-gt v1, p5, :cond_2

    const/16 v1, 0x1a

    if-ge p5, v1, :cond_2

    .line 10
    const-string v0, "blur"

    move-object/from16 v9, p6

    invoke-static {v0, p3, p4, v9}, Lcom/jumio/android/renderscript/ToolkitKt;->validateRestriction(Ljava/lang/String;IILcom/jumio/android/renderscript/Range2d;)V

    .line 11
    array-length v0, p1

    new-array v8, v0, [B

    .line 12
    iget-wide v1, p0, Lcom/jumio/android/renderscript/Toolkit;->nativeHandle:J

    move-object v0, p0

    move-object v3, p1

    move v4, p2

    move v5, p3

    move v6, p4

    move v7, p5

    .line 13
    invoke-direct/range {v0 .. v9}, Lcom/jumio/android/renderscript/Toolkit;->nativeBlur(J[BIIII[BLcom/jumio/android/renderscript/Range2d;)V

    return-object v8

    .line 14
    :cond_2
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "RenderScript Toolkit blur. The radius should be between 1 and 25. "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 15
    new-instance v1, Ljava/lang/IllegalArgumentException;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 16
    :cond_3
    array-length v0, p1

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "RenderScript Toolkit blur. inputArray is too small for the given dimensions. "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, "*"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, " < "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, "."

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 17
    new-instance v1, Ljava/lang/IllegalArgumentException;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public close()V
    .locals 5

    .line 1
    .line 2
    iget-wide v0, p0, Lcom/jumio/android/renderscript/Toolkit;->nativeHandle:J

    .line 3
    .line 4
    const-wide/16 v2, 0x0

    .line 5
    .line 6
    cmp-long v4, v0, v2

    .line 7
    .line 8
    if-eqz v4, :cond_0

    .line 9
    .line 10
    .line 11
    invoke-direct {p0, v0, v1}, Lcom/jumio/android/renderscript/Toolkit;->destroyNative(J)V

    .line 12
    .line 13
    :cond_0
    iput-wide v2, p0, Lcom/jumio/android/renderscript/Toolkit;->nativeHandle:J

    .line 14
    return-void
    .line 15
    .line 16
.end method

.method public final colorMatrix(Landroid/graphics/Bitmap;[F)Landroid/graphics/Bitmap;
    .locals 8
    .param p1    # Landroid/graphics/Bitmap;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # [F
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    const-string v0, "inputBitmap"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "matrix"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v6, 0xc

    const/4 v7, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    invoke-static/range {v1 .. v7}, Lcom/jumio/android/renderscript/Toolkit;->colorMatrix$default(Lcom/jumio/android/renderscript/Toolkit;Landroid/graphics/Bitmap;[F[FLcom/jumio/android/renderscript/Range2d;ILjava/lang/Object;)Landroid/graphics/Bitmap;

    move-result-object p1

    return-object p1
.end method

.method public final colorMatrix(Landroid/graphics/Bitmap;[F[F)Landroid/graphics/Bitmap;
    .locals 8
    .param p1    # Landroid/graphics/Bitmap;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # [F
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # [F
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 2
    const-string v0, "inputBitmap"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "matrix"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "addVector"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v6, 0x8

    const/4 v7, 0x0

    const/4 v5, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    invoke-static/range {v1 .. v7}, Lcom/jumio/android/renderscript/Toolkit;->colorMatrix$default(Lcom/jumio/android/renderscript/Toolkit;Landroid/graphics/Bitmap;[F[FLcom/jumio/android/renderscript/Range2d;ILjava/lang/Object;)Landroid/graphics/Bitmap;

    move-result-object p1

    return-object p1
.end method

.method public final colorMatrix(Landroid/graphics/Bitmap;[F[FLcom/jumio/android/renderscript/Range2d;)Landroid/graphics/Bitmap;
    .locals 11
    .param p1    # Landroid/graphics/Bitmap;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # [F
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # [F
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Lcom/jumio/android/renderscript/Range2d;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "inputBitmap"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "matrix"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "addVector"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    invoke-direct {p0}, Lcom/jumio/android/renderscript/Toolkit;->validateHandle()V

    const/4 v0, 0x0

    .line 25
    const-string v1, "colorMatrix"

    const/4 v2, 0x0

    const/4 v3, 0x4

    invoke-static {v1, p1, v2, v3, v0}, Lcom/jumio/android/renderscript/ToolkitKt;->validateBitmap$default(Ljava/lang/String;Landroid/graphics/Bitmap;ZILjava/lang/Object;)V

    .line 26
    array-length v0, p2

    const/16 v2, 0x10

    if-ne v0, v2, :cond_1

    .line 27
    array-length v0, p3

    if-ne v0, v3, :cond_0

    .line 28
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v0

    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v2

    invoke-static {v1, v0, v2, p4}, Lcom/jumio/android/renderscript/ToolkitKt;->validateRestriction(Ljava/lang/String;IILcom/jumio/android/renderscript/Range2d;)V

    .line 29
    invoke-static {p1}, Lcom/jumio/android/renderscript/ToolkitKt;->createCompatibleBitmap(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;

    move-result-object v7

    .line 30
    iget-wide v4, p0, Lcom/jumio/android/renderscript/Toolkit;->nativeHandle:J

    move-object v3, p0

    move-object v6, p1

    move-object v8, p2

    move-object v9, p3

    move-object v10, p4

    .line 31
    invoke-direct/range {v3 .. v10}, Lcom/jumio/android/renderscript/Toolkit;->nativeColorMatrixBitmap(JLandroid/graphics/Bitmap;Landroid/graphics/Bitmap;[F[FLcom/jumio/android/renderscript/Range2d;)V

    return-object v7

    .line 32
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "RenderScript Toolkit colorMatrix. addVector should have 4 entries."

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    move-object v8, p2

    .line 33
    array-length p1, v8

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "RenderScript Toolkit colorMatrix. matrix should have 16 entries. "

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, " provided."

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 34
    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method public final colorMatrix([BIIII[F)[B
    .locals 12
    .param p1    # [B
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p6    # [F
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 3
    const-string v0, "inputArray"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "matrix"

    move-object/from16 v7, p6

    invoke-static {v7, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v10, 0xc0

    const/4 v11, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    move-object v1, p0

    move-object v2, p1

    move v3, p2

    move v4, p3

    move/from16 v5, p4

    move/from16 v6, p5

    invoke-static/range {v1 .. v11}, Lcom/jumio/android/renderscript/Toolkit;->colorMatrix$default(Lcom/jumio/android/renderscript/Toolkit;[BIIII[F[FLcom/jumio/android/renderscript/Range2d;ILjava/lang/Object;)[B

    move-result-object p1

    return-object p1
.end method

.method public final colorMatrix([BIIII[F[F)[B
    .locals 12
    .param p1    # [B
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p6    # [F
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p7    # [F
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 4
    const-string v0, "inputArray"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "matrix"

    move-object/from16 v7, p6

    invoke-static {v7, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "addVector"

    move-object/from16 v8, p7

    invoke-static {v8, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v10, 0x80

    const/4 v11, 0x0

    const/4 v9, 0x0

    move-object v1, p0

    move-object v2, p1

    move v3, p2

    move v4, p3

    move/from16 v5, p4

    move/from16 v6, p5

    invoke-static/range {v1 .. v11}, Lcom/jumio/android/renderscript/Toolkit;->colorMatrix$default(Lcom/jumio/android/renderscript/Toolkit;[BIIII[F[FLcom/jumio/android/renderscript/Range2d;ILjava/lang/Object;)[B

    move-result-object p1

    return-object p1
.end method

.method public final colorMatrix([BIIII[F[FLcom/jumio/android/renderscript/Range2d;)[B
    .locals 12
    .param p1    # [B
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p6    # [F
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p7    # [F
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p8    # Lcom/jumio/android/renderscript/Range2d;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    move/from16 v6, p4

    move/from16 v8, p5

    move-object/from16 v9, p6

    move-object/from16 v10, p7

    const-string v0, "inputArray"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "matrix"

    invoke-static {v9, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "addVector"

    invoke-static {v10, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 5
    invoke-direct {p0}, Lcom/jumio/android/renderscript/Toolkit;->validateHandle()V

    .line 6
    const-string v0, " provided."

    const/4 v1, 0x1

    if-gt v1, p2, :cond_4

    const/4 v2, 0x5

    if-ge p2, v2, :cond_4

    if-gt v1, v8, :cond_3

    if-ge v8, v2, :cond_3

    .line 7
    array-length v1, p1

    mul-int v2, p3, v6

    mul-int v3, v2, p2

    if-lt v1, v3, :cond_2

    .line 8
    array-length v1, v9

    const/16 v3, 0x10

    if-ne v1, v3, :cond_1

    .line 9
    array-length v1, v10

    const/4 v3, 0x4

    if-ne v1, v3, :cond_0

    .line 10
    const-string v0, "colorMatrix"

    move-object/from16 v11, p8

    invoke-static {v0, p3, v6, v11}, Lcom/jumio/android/renderscript/ToolkitKt;->validateRestriction(Ljava/lang/String;IILcom/jumio/android/renderscript/Range2d;)V

    .line 11
    invoke-static {v8}, Lcom/jumio/android/renderscript/ToolkitKt;->paddedSize(I)I

    move-result v0

    mul-int/2addr v2, v0

    new-array v7, v2, [B

    .line 12
    iget-wide v1, p0, Lcom/jumio/android/renderscript/Toolkit;->nativeHandle:J

    move-object v0, p0

    move-object v3, p1

    move v4, p2

    move v5, p3

    .line 13
    invoke-direct/range {v0 .. v11}, Lcom/jumio/android/renderscript/Toolkit;->nativeColorMatrix(J[BIII[BI[F[FLcom/jumio/android/renderscript/Range2d;)V

    return-object v7

    .line 14
    :cond_0
    array-length p1, v10

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "RenderScript Toolkit colorMatrix. addVector should have 4 entries. "

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 15
    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2

    .line 16
    :cond_1
    array-length p1, v9

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "RenderScript Toolkit colorMatrix. matrix should have 16 entries. "

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 17
    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2

    .line 18
    :cond_2
    array-length p1, p1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "RenderScript Toolkit colorMatrix. inputArray is too small for the given dimensions. "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p3, "*"

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p2, " < "

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, "."

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 19
    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2

    .line 20
    :cond_3
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string p2, "RenderScript Toolkit colorMatrix. The outputVectorSize should be between 1 and 4. "

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 21
    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2

    .line 22
    :cond_4
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "RenderScript Toolkit colorMatrix. The inputVectorSize should be between 1 and 4. "

    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 23
    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method public final convolve(Landroid/graphics/Bitmap;[F)Landroid/graphics/Bitmap;
    .locals 7
    .param p1    # Landroid/graphics/Bitmap;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # [F
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    const-string v0, "inputBitmap"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "coefficients"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    invoke-static/range {v1 .. v6}, Lcom/jumio/android/renderscript/Toolkit;->convolve$default(Lcom/jumio/android/renderscript/Toolkit;Landroid/graphics/Bitmap;[FLcom/jumio/android/renderscript/Range2d;ILjava/lang/Object;)Landroid/graphics/Bitmap;

    move-result-object p1

    return-object p1
.end method

.method public final convolve(Landroid/graphics/Bitmap;[FLcom/jumio/android/renderscript/Range2d;)Landroid/graphics/Bitmap;
    .locals 7
    .param p1    # Landroid/graphics/Bitmap;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # [F
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lcom/jumio/android/renderscript/Range2d;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "inputBitmap"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "coefficients"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    invoke-direct {p0}, Lcom/jumio/android/renderscript/Toolkit;->validateHandle()V

    const/4 v0, 0x4

    const/4 v1, 0x0

    .line 17
    const-string v2, "convolve"

    const/4 v3, 0x0

    invoke-static {v2, p1, v3, v0, v1}, Lcom/jumio/android/renderscript/ToolkitKt;->validateBitmap$default(Ljava/lang/String;Landroid/graphics/Bitmap;ZILjava/lang/Object;)V

    .line 18
    array-length v0, p2

    const/16 v1, 0x9

    if-eq v0, v1, :cond_1

    array-length v0, p2

    const/16 v1, 0x19

    if-ne v0, v1, :cond_0

    goto :goto_0

    .line 19
    :cond_0
    array-length p1, p2

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "RenderScript Toolkit convolve. Only 3x3 or 5x5 convolutions are supported. "

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, " coefficients provided."

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 20
    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2

    .line 21
    :cond_1
    :goto_0
    invoke-static {v2, p1, p3}, Lcom/jumio/android/renderscript/ToolkitKt;->validateRestriction(Ljava/lang/String;Landroid/graphics/Bitmap;Lcom/jumio/android/renderscript/Range2d;)V

    .line 22
    invoke-static {p1}, Lcom/jumio/android/renderscript/ToolkitKt;->createCompatibleBitmap(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;

    move-result-object v4

    .line 23
    iget-wide v1, p0, Lcom/jumio/android/renderscript/Toolkit;->nativeHandle:J

    move-object v0, p0

    move-object v3, p1

    move-object v5, p2

    move-object v6, p3

    invoke-direct/range {v0 .. v6}, Lcom/jumio/android/renderscript/Toolkit;->nativeConvolveBitmap(JLandroid/graphics/Bitmap;Landroid/graphics/Bitmap;[FLcom/jumio/android/renderscript/Range2d;)V

    return-object v4
.end method

.method public final convolve([BIII[F)[B
    .locals 10
    .param p1    # [B
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p5    # [F
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 2
    const-string v0, "inputArray"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "coefficients"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v8, 0x20

    const/4 v9, 0x0

    const/4 v7, 0x0

    move-object v1, p0

    move-object v2, p1

    move v3, p2

    move v4, p3

    move v5, p4

    move-object v6, p5

    invoke-static/range {v1 .. v9}, Lcom/jumio/android/renderscript/Toolkit;->convolve$default(Lcom/jumio/android/renderscript/Toolkit;[BIII[FLcom/jumio/android/renderscript/Range2d;ILjava/lang/Object;)[B

    move-result-object p1

    return-object p1
.end method

.method public final convolve([BIII[FLcom/jumio/android/renderscript/Range2d;)[B
    .locals 10
    .param p1    # [B
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p5    # [F
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p6    # Lcom/jumio/android/renderscript/Range2d;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "inputArray"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "coefficients"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    invoke-direct {p0}, Lcom/jumio/android/renderscript/Toolkit;->validateHandle()V

    const/4 v0, 0x1

    if-gt v0, p2, :cond_3

    const/4 v0, 0x5

    if-ge p2, v0, :cond_3

    .line 4
    array-length v0, p1

    mul-int v1, p3, p4

    mul-int/2addr v1, p2

    if-lt v0, v1, :cond_2

    .line 5
    array-length v0, p5

    const/16 v1, 0x9

    if-eq v0, v1, :cond_1

    array-length v0, p5

    const/16 v1, 0x19

    if-ne v0, v1, :cond_0

    goto :goto_0

    .line 6
    :cond_0
    array-length v0, p5

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "RenderScript Toolkit convolve. Only 3x3 or 5x5 convolutions are supported. "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, " coefficients provided."

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 7
    new-instance v1, Ljava/lang/IllegalArgumentException;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 8
    :cond_1
    :goto_0
    const-string v0, "convolve"

    move-object/from16 v9, p6

    invoke-static {v0, p3, p4, v9}, Lcom/jumio/android/renderscript/ToolkitKt;->validateRestriction(Ljava/lang/String;IILcom/jumio/android/renderscript/Range2d;)V

    .line 9
    array-length v0, p1

    new-array v7, v0, [B

    .line 10
    iget-wide v1, p0, Lcom/jumio/android/renderscript/Toolkit;->nativeHandle:J

    move-object v0, p0

    move-object v3, p1

    move v4, p2

    move v5, p3

    move v6, p4

    move-object v8, p5

    .line 11
    invoke-direct/range {v0 .. v9}, Lcom/jumio/android/renderscript/Toolkit;->nativeConvolve(J[BIII[B[FLcom/jumio/android/renderscript/Range2d;)V

    return-object v7

    .line 12
    :cond_2
    array-length v0, p1

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "RenderScript Toolkit convolve. inputArray is too small for the given dimensions. "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, "*"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, " < "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, "."

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 13
    new-instance v1, Ljava/lang/IllegalArgumentException;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 14
    :cond_3
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "RenderScript Toolkit convolve. The vectorSize should be between 1 and 4. "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, " provided."

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 15
    new-instance v1, Ljava/lang/IllegalArgumentException;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public final getGreyScaleColorMatrix()[F
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    const/16 v0, 0x10

    .line 3
    .line 4
    new-array v0, v0, [F

    .line 5
    .line 6
    .line 7
    fill-array-data v0, :array_0

    .line 8
    return-object v0

    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    :array_0
    .array-data 4
        0x3e991687    # 0.299f
        0x3e991687    # 0.299f
        0x3e991687    # 0.299f
        0x0
        0x3f1645a2    # 0.587f
        0x3f1645a2    # 0.587f
        0x3f1645a2    # 0.587f
        0x0
        0x3de978d5    # 0.114f
        0x3de978d5    # 0.114f
        0x3de978d5    # 0.114f
        0x0
        0x0
        0x0
        0x0
        0x3f800000    # 1.0f
    .end array-data
.end method

.method public final getIdentityMatrix()[F
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    const/16 v0, 0x10

    .line 3
    .line 4
    new-array v0, v0, [F

    .line 5
    .line 6
    .line 7
    fill-array-data v0, :array_0

    .line 8
    return-object v0

    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    :array_0
    .array-data 4
        0x3f800000    # 1.0f
        0x0
        0x0
        0x0
        0x0
        0x3f800000    # 1.0f
        0x0
        0x0
        0x0
        0x0
        0x3f800000    # 1.0f
        0x0
        0x0
        0x0
        0x0
        0x3f800000    # 1.0f
    .end array-data
.end method

.method public final getRgbToYuvMatrix()[F
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    const/16 v0, 0x10

    .line 3
    .line 4
    new-array v0, v0, [F

    .line 5
    .line 6
    .line 7
    fill-array-data v0, :array_0

    .line 8
    return-object v0

    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    :array_0
    .array-data 4
        0x3e991687    # 0.299f
        -0x41e956c1    # -0.14713f
        0x3f1d70a4    # 0.615f
        0x0
        0x3f1645a2    # 0.587f
        -0x416c1a8b    # -0.28886f
        -0x40fc299e
        0x0
        0x3de978d5    # 0.114f
        0x3edf3b64    # 0.436f
        -0x42332df5    # -0.10001f
        0x0
        0x0
        0x0
        0x0
        0x3f800000    # 1.0f
    .end array-data
.end method

.method public final getYuvToRgbMatrix()[F
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    const/16 v0, 0x10

    .line 3
    .line 4
    new-array v0, v0, [F

    .line 5
    .line 6
    .line 7
    fill-array-data v0, :array_0

    .line 8
    return-object v0

    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    :array_0
    .array-data 4
        0x3f800000    # 1.0f
        0x3f800000    # 1.0f
        0x3f800000    # 1.0f
        0x0
        0x0
        -0x4135f06f
        0x40020e17
        0x0
        0x3f91e5f3    # 1.13983f
        -0x40eb5dcc    # -0.5806f
        0x0
        0x0
        0x0
        0x0
        0x0
        0x3f800000    # 1.0f
    .end array-data
.end method

.method public final histogram(Landroid/graphics/Bitmap;)[I
    .locals 2
    .param p1    # Landroid/graphics/Bitmap;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    const-string v0, "inputBitmap"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    const/4 v1, 0x2

    invoke-static {p0, p1, v0, v1, v0}, Lcom/jumio/android/renderscript/Toolkit;->histogram$default(Lcom/jumio/android/renderscript/Toolkit;Landroid/graphics/Bitmap;Lcom/jumio/android/renderscript/Range2d;ILjava/lang/Object;)[I

    move-result-object p1

    return-object p1
.end method

.method public final histogram(Landroid/graphics/Bitmap;Lcom/jumio/android/renderscript/Range2d;)[I
    .locals 7
    .param p1    # Landroid/graphics/Bitmap;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/jumio/android/renderscript/Range2d;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "inputBitmap"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    invoke-direct {p0}, Lcom/jumio/android/renderscript/Toolkit;->validateHandle()V

    const/4 v0, 0x4

    const/4 v1, 0x0

    .line 14
    const-string v2, "histogram"

    const/4 v3, 0x0

    invoke-static {v2, p1, v3, v0, v1}, Lcom/jumio/android/renderscript/ToolkitKt;->validateBitmap$default(Ljava/lang/String;Landroid/graphics/Bitmap;ZILjava/lang/Object;)V

    .line 15
    invoke-static {v2, p1, p2}, Lcom/jumio/android/renderscript/ToolkitKt;->validateRestriction(Ljava/lang/String;Landroid/graphics/Bitmap;Lcom/jumio/android/renderscript/Range2d;)V

    .line 16
    invoke-static {p1}, Lcom/jumio/android/renderscript/ToolkitKt;->vectorSize(Landroid/graphics/Bitmap;)I

    move-result v0

    mul-int/lit16 v0, v0, 0x100

    new-array v5, v0, [I

    .line 17
    iget-wide v2, p0, Lcom/jumio/android/renderscript/Toolkit;->nativeHandle:J

    move-object v1, p0

    move-object v4, p1

    move-object v6, p2

    invoke-direct/range {v1 .. v6}, Lcom/jumio/android/renderscript/Toolkit;->nativeHistogramBitmap(JLandroid/graphics/Bitmap;[ILcom/jumio/android/renderscript/Range2d;)V

    return-object v5
.end method

.method public final histogram([BIII)[I
    .locals 9
    .param p1    # [B
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 2
    const-string v0, "inputArray"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v7, 0x10

    const/4 v8, 0x0

    const/4 v6, 0x0

    move-object v1, p0

    move-object v2, p1

    move v3, p2

    move v4, p3

    move v5, p4

    invoke-static/range {v1 .. v8}, Lcom/jumio/android/renderscript/Toolkit;->histogram$default(Lcom/jumio/android/renderscript/Toolkit;[BIIILcom/jumio/android/renderscript/Range2d;ILjava/lang/Object;)[I

    move-result-object p1

    return-object p1
.end method

.method public final histogram([BIIILcom/jumio/android/renderscript/Range2d;)[I
    .locals 10
    .param p1    # [B
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p5    # Lcom/jumio/android/renderscript/Range2d;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "inputArray"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    invoke-direct {p0}, Lcom/jumio/android/renderscript/Toolkit;->validateHandle()V

    const/4 v0, 0x1

    if-gt v0, p2, :cond_1

    const/4 v0, 0x5

    if-ge p2, v0, :cond_1

    .line 4
    array-length v0, p1

    mul-int v1, p3, p4

    mul-int/2addr v1, p2

    if-lt v0, v1, :cond_0

    .line 5
    const-string v0, "histogram"

    invoke-static {v0, p3, p4, p5}, Lcom/jumio/android/renderscript/ToolkitKt;->validateRestriction(Ljava/lang/String;IILcom/jumio/android/renderscript/Range2d;)V

    .line 6
    invoke-static {p2}, Lcom/jumio/android/renderscript/ToolkitKt;->paddedSize(I)I

    move-result v0

    mul-int/lit16 v0, v0, 0x100

    new-array v8, v0, [I

    .line 7
    iget-wide v2, p0, Lcom/jumio/android/renderscript/Toolkit;->nativeHandle:J

    move-object v1, p0

    move-object v4, p1

    move v5, p2

    move v6, p3

    move v7, p4

    move-object v9, p5

    .line 8
    invoke-direct/range {v1 .. v9}, Lcom/jumio/android/renderscript/Toolkit;->nativeHistogram(J[BIII[ILcom/jumio/android/renderscript/Range2d;)V

    return-object v8

    :cond_0
    move-object v4, p1

    move v5, p2

    move v6, p3

    move v7, p4

    .line 9
    array-length p1, v4

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "RenderScript Toolkit histogram. inputArray is too small for the given dimensions. "

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p3, "*"

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p3, " < "

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, "."

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 10
    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_1
    move v5, p2

    .line 11
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string p2, "RenderScript Toolkit histogram. The vectorSize should be between 1 and 4. "

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p2, " provided."

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 12
    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method public final histogramDot(Landroid/graphics/Bitmap;)[I
    .locals 7
    .param p1    # Landroid/graphics/Bitmap;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    const-string v0, "inputBitmap"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v5, 0x6

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    move-object v2, p1

    invoke-static/range {v1 .. v6}, Lcom/jumio/android/renderscript/Toolkit;->histogramDot$default(Lcom/jumio/android/renderscript/Toolkit;Landroid/graphics/Bitmap;[FLcom/jumio/android/renderscript/Range2d;ILjava/lang/Object;)[I

    move-result-object p1

    return-object p1
.end method

.method public final histogramDot(Landroid/graphics/Bitmap;[F)[I
    .locals 7
    .param p1    # Landroid/graphics/Bitmap;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # [F
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 2
    const-string v0, "inputBitmap"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    invoke-static/range {v1 .. v6}, Lcom/jumio/android/renderscript/Toolkit;->histogramDot$default(Lcom/jumio/android/renderscript/Toolkit;Landroid/graphics/Bitmap;[FLcom/jumio/android/renderscript/Range2d;ILjava/lang/Object;)[I

    move-result-object p1

    return-object p1
.end method

.method public final histogramDot(Landroid/graphics/Bitmap;[FLcom/jumio/android/renderscript/Range2d;)[I
    .locals 11
    .param p1    # Landroid/graphics/Bitmap;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # [F
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p3    # Lcom/jumio/android/renderscript/Range2d;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "inputBitmap"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 17
    invoke-direct {p0}, Lcom/jumio/android/renderscript/Toolkit;->validateHandle()V

    const/4 v0, 0x0

    .line 18
    const-string v1, "histogramDot"

    const/4 v2, 0x0

    const/4 v3, 0x4

    invoke-static {v1, p1, v2, v3, v0}, Lcom/jumio/android/renderscript/ToolkitKt;->validateBitmap$default(Ljava/lang/String;Landroid/graphics/Bitmap;ZILjava/lang/Object;)V

    .line 19
    invoke-static {p1}, Lcom/jumio/android/renderscript/ToolkitKt;->vectorSize(Landroid/graphics/Bitmap;)I

    move-result v0

    invoke-static {p2, v0}, Lcom/jumio/android/renderscript/ToolkitKt;->validateHistogramDotCoefficients([FI)V

    .line 20
    invoke-static {v1, p1, p3}, Lcom/jumio/android/renderscript/ToolkitKt;->validateRestriction(Ljava/lang/String;Landroid/graphics/Bitmap;Lcom/jumio/android/renderscript/Range2d;)V

    const/16 v0, 0x100

    .line 21
    new-array v8, v0, [I

    if-nez p2, :cond_0

    .line 22
    new-array p2, v3, [F

    const v0, 0x3e991687    # 0.299f

    aput v0, p2, v2

    const/4 v0, 0x1

    const v1, 0x3f1645a2    # 0.587f

    aput v1, p2, v0

    const/4 v0, 0x2

    const v1, 0x3de978d5    # 0.114f

    aput v1, p2, v0

    const/4 v0, 0x3

    const/4 v1, 0x0

    aput v1, p2, v0

    :cond_0
    move-object v9, p2

    .line 23
    iget-wide v5, p0, Lcom/jumio/android/renderscript/Toolkit;->nativeHandle:J

    move-object v4, p0

    move-object v7, p1

    move-object v10, p3

    .line 24
    invoke-direct/range {v4 .. v10}, Lcom/jumio/android/renderscript/Toolkit;->nativeHistogramDotBitmap(JLandroid/graphics/Bitmap;[I[FLcom/jumio/android/renderscript/Range2d;)V

    return-object v8
.end method

.method public final histogramDot([BIII)[I
    .locals 10
    .param p1    # [B
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 3
    const-string v0, "inputArray"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v8, 0x30

    const/4 v9, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v1, p0

    move-object v2, p1

    move v3, p2

    move v4, p3

    move v5, p4

    invoke-static/range {v1 .. v9}, Lcom/jumio/android/renderscript/Toolkit;->histogramDot$default(Lcom/jumio/android/renderscript/Toolkit;[BIII[FLcom/jumio/android/renderscript/Range2d;ILjava/lang/Object;)[I

    move-result-object p1

    return-object p1
.end method

.method public final histogramDot([BIII[F)[I
    .locals 10
    .param p1    # [B
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p5    # [F
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 4
    const-string v0, "inputArray"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v8, 0x20

    const/4 v9, 0x0

    const/4 v7, 0x0

    move-object v1, p0

    move-object v2, p1

    move v3, p2

    move v4, p3

    move v5, p4

    move-object v6, p5

    invoke-static/range {v1 .. v9}, Lcom/jumio/android/renderscript/Toolkit;->histogramDot$default(Lcom/jumio/android/renderscript/Toolkit;[BIII[FLcom/jumio/android/renderscript/Range2d;ILjava/lang/Object;)[I

    move-result-object p1

    return-object p1
.end method

.method public final histogramDot([BIII[FLcom/jumio/android/renderscript/Range2d;)[I
    .locals 10
    .param p1    # [B
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p5    # [F
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p6    # Lcom/jumio/android/renderscript/Range2d;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v1, "inputArray"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 5
    invoke-direct {p0}, Lcom/jumio/android/renderscript/Toolkit;->validateHandle()V

    const/4 v1, 0x1

    if-gt v1, p2, :cond_2

    const/4 v2, 0x5

    if-ge p2, v2, :cond_2

    .line 6
    array-length v2, p1

    mul-int v7, p3, p4

    mul-int/2addr v7, p2

    if-lt v2, v7, :cond_1

    .line 7
    invoke-static {p5, p2}, Lcom/jumio/android/renderscript/ToolkitKt;->validateHistogramDotCoefficients([FI)V

    .line 8
    const-string v2, "histogramDot"

    move-object/from16 v9, p6

    invoke-static {v2, p3, p4, v9}, Lcom/jumio/android/renderscript/ToolkitKt;->validateRestriction(Ljava/lang/String;IILcom/jumio/android/renderscript/Range2d;)V

    const/16 v2, 0x100

    .line 9
    new-array v7, v2, [I

    if-nez p5, :cond_0

    const/4 v0, 0x4

    .line 10
    new-array v0, v0, [F

    const/4 v2, 0x0

    const v8, 0x3e991687    # 0.299f

    aput v8, v0, v2

    const v2, 0x3f1645a2    # 0.587f

    aput v2, v0, v1

    const/4 v1, 0x2

    const v2, 0x3de978d5    # 0.114f

    aput v2, v0, v1

    const/4 v1, 0x3

    const/4 v2, 0x0

    aput v2, v0, v1

    move-object v8, v0

    goto :goto_0

    :cond_0
    move-object v8, p5

    .line 11
    :goto_0
    iget-wide v1, p0, Lcom/jumio/android/renderscript/Toolkit;->nativeHandle:J

    move-object v0, p0

    move-object v3, p1

    move v4, p2

    move v5, p3

    move v6, p4

    .line 12
    invoke-direct/range {v0 .. v9}, Lcom/jumio/android/renderscript/Toolkit;->nativeHistogramDot(J[BIII[I[FLcom/jumio/android/renderscript/Range2d;)V

    return-object v7

    .line 13
    :cond_1
    array-length v0, p1

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "RenderScript Toolkit histogramDot. inputArray is too small for the given dimensions. "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, "*"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, " < "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, "."

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 14
    new-instance v1, Ljava/lang/IllegalArgumentException;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 15
    :cond_2
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "RenderScript Toolkit histogramDot. The vectorSize should be between 1 and 4. "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, " provided."

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 16
    new-instance v1, Ljava/lang/IllegalArgumentException;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public final lut(Landroid/graphics/Bitmap;Lcom/jumio/android/renderscript/LookupTable;)Landroid/graphics/Bitmap;
    .locals 7
    .param p1    # Landroid/graphics/Bitmap;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/jumio/android/renderscript/LookupTable;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    const-string v0, "inputBitmap"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "table"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    invoke-static/range {v1 .. v6}, Lcom/jumio/android/renderscript/Toolkit;->lut$default(Lcom/jumio/android/renderscript/Toolkit;Landroid/graphics/Bitmap;Lcom/jumio/android/renderscript/LookupTable;Lcom/jumio/android/renderscript/Range2d;ILjava/lang/Object;)Landroid/graphics/Bitmap;

    move-result-object p1

    return-object p1
.end method

.method public final lut(Landroid/graphics/Bitmap;Lcom/jumio/android/renderscript/LookupTable;Lcom/jumio/android/renderscript/Range2d;)Landroid/graphics/Bitmap;
    .locals 10
    .param p1    # Landroid/graphics/Bitmap;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/jumio/android/renderscript/LookupTable;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lcom/jumio/android/renderscript/Range2d;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "inputBitmap"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "table"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    invoke-direct {p0}, Lcom/jumio/android/renderscript/Toolkit;->validateHandle()V

    const/4 v0, 0x4

    const/4 v2, 0x0

    .line 16
    const-string v4, "lut"

    const/4 v5, 0x0

    invoke-static {v4, p1, v5, v0, v2}, Lcom/jumio/android/renderscript/ToolkitKt;->validateBitmap$default(Ljava/lang/String;Landroid/graphics/Bitmap;ZILjava/lang/Object;)V

    .line 17
    invoke-static {v4, p1, p3}, Lcom/jumio/android/renderscript/ToolkitKt;->validateRestriction(Ljava/lang/String;Landroid/graphics/Bitmap;Lcom/jumio/android/renderscript/Range2d;)V

    .line 18
    invoke-static {p1}, Lcom/jumio/android/renderscript/ToolkitKt;->createCompatibleBitmap(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;

    move-result-object v4

    .line 19
    iget-wide v1, p0, Lcom/jumio/android/renderscript/Toolkit;->nativeHandle:J

    .line 20
    invoke-virtual {p2}, Lcom/jumio/android/renderscript/LookupTable;->getRed()[B

    move-result-object v5

    .line 21
    invoke-virtual {p2}, Lcom/jumio/android/renderscript/LookupTable;->getGreen()[B

    move-result-object v6

    .line 22
    invoke-virtual {p2}, Lcom/jumio/android/renderscript/LookupTable;->getBlue()[B

    move-result-object v7

    .line 23
    invoke-virtual {p2}, Lcom/jumio/android/renderscript/LookupTable;->getAlpha()[B

    move-result-object v8

    move-object v0, p0

    move-object v3, p1

    move-object v9, p3

    .line 24
    invoke-direct/range {v0 .. v9}, Lcom/jumio/android/renderscript/Toolkit;->nativeLutBitmap(JLandroid/graphics/Bitmap;Landroid/graphics/Bitmap;[B[B[B[BLcom/jumio/android/renderscript/Range2d;)V

    return-object v4
.end method

.method public final lut([BIILcom/jumio/android/renderscript/LookupTable;)[B
    .locals 9
    .param p1    # [B
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Lcom/jumio/android/renderscript/LookupTable;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 2
    const-string v0, "inputArray"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "table"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v7, 0x10

    const/4 v8, 0x0

    const/4 v6, 0x0

    move-object v1, p0

    move-object v2, p1

    move v3, p2

    move v4, p3

    move-object v5, p4

    invoke-static/range {v1 .. v8}, Lcom/jumio/android/renderscript/Toolkit;->lut$default(Lcom/jumio/android/renderscript/Toolkit;[BIILcom/jumio/android/renderscript/LookupTable;Lcom/jumio/android/renderscript/Range2d;ILjava/lang/Object;)[B

    move-result-object p1

    return-object p1
.end method

.method public final lut([BIILcom/jumio/android/renderscript/LookupTable;Lcom/jumio/android/renderscript/Range2d;)[B
    .locals 12
    .param p1    # [B
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Lcom/jumio/android/renderscript/LookupTable;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p5    # Lcom/jumio/android/renderscript/Range2d;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "inputArray"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "table"

    move-object/from16 v1, p4

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    invoke-direct {p0}, Lcom/jumio/android/renderscript/Toolkit;->validateHandle()V

    .line 4
    array-length v0, p1

    mul-int v2, p2, p3

    mul-int/lit8 v2, v2, 0x4

    if-lt v0, v2, :cond_0

    .line 5
    const-string v0, "lut"

    move-object/from16 v11, p5

    invoke-static {v0, p2, p3, v11}, Lcom/jumio/android/renderscript/ToolkitKt;->validateRestriction(Ljava/lang/String;IILcom/jumio/android/renderscript/Range2d;)V

    .line 6
    array-length v0, p1

    new-array v4, v0, [B

    .line 7
    iget-wide v1, p0, Lcom/jumio/android/renderscript/Toolkit;->nativeHandle:J

    .line 8
    invoke-virtual/range {p4 .. p4}, Lcom/jumio/android/renderscript/LookupTable;->getRed()[B

    move-result-object v7

    .line 9
    invoke-virtual/range {p4 .. p4}, Lcom/jumio/android/renderscript/LookupTable;->getGreen()[B

    move-result-object v8

    .line 10
    invoke-virtual/range {p4 .. p4}, Lcom/jumio/android/renderscript/LookupTable;->getBlue()[B

    move-result-object v9

    .line 11
    invoke-virtual/range {p4 .. p4}, Lcom/jumio/android/renderscript/LookupTable;->getAlpha()[B

    move-result-object v10

    move-object v0, p0

    move-object v3, p1

    move v5, p2

    move v6, p3

    .line 12
    invoke-direct/range {v0 .. v11}, Lcom/jumio/android/renderscript/Toolkit;->nativeLut(J[B[BII[B[B[B[BLcom/jumio/android/renderscript/Range2d;)V

    return-object v4

    .line 13
    :cond_0
    array-length v0, p1

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "RenderScript Toolkit lut. inputArray is too small for the given dimensions. "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, "*"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, "*4 < "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, "."

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 14
    new-instance v1, Ljava/lang/IllegalArgumentException;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public final lut3d(Landroid/graphics/Bitmap;Lcom/jumio/android/renderscript/Rgba3dArray;)Landroid/graphics/Bitmap;
    .locals 7
    .param p1    # Landroid/graphics/Bitmap;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/jumio/android/renderscript/Rgba3dArray;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    const-string v0, "inputBitmap"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "cube"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    invoke-static/range {v1 .. v6}, Lcom/jumio/android/renderscript/Toolkit;->lut3d$default(Lcom/jumio/android/renderscript/Toolkit;Landroid/graphics/Bitmap;Lcom/jumio/android/renderscript/Rgba3dArray;Lcom/jumio/android/renderscript/Range2d;ILjava/lang/Object;)Landroid/graphics/Bitmap;

    move-result-object p1

    return-object p1
.end method

.method public final lut3d(Landroid/graphics/Bitmap;Lcom/jumio/android/renderscript/Rgba3dArray;Lcom/jumio/android/renderscript/Range2d;)Landroid/graphics/Bitmap;
    .locals 10
    .param p1    # Landroid/graphics/Bitmap;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/jumio/android/renderscript/Rgba3dArray;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lcom/jumio/android/renderscript/Range2d;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "inputBitmap"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "cube"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    invoke-direct {p0}, Lcom/jumio/android/renderscript/Toolkit;->validateHandle()V

    const/4 v0, 0x4

    const/4 v2, 0x0

    .line 17
    const-string v4, "lut3d"

    const/4 v5, 0x0

    invoke-static {v4, p1, v5, v0, v2}, Lcom/jumio/android/renderscript/ToolkitKt;->validateBitmap$default(Ljava/lang/String;Landroid/graphics/Bitmap;ZILjava/lang/Object;)V

    .line 18
    invoke-static {v4, p1, p3}, Lcom/jumio/android/renderscript/ToolkitKt;->validateRestriction(Ljava/lang/String;Landroid/graphics/Bitmap;Lcom/jumio/android/renderscript/Range2d;)V

    .line 19
    invoke-static {p1}, Lcom/jumio/android/renderscript/ToolkitKt;->createCompatibleBitmap(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;

    move-result-object v4

    .line 20
    iget-wide v1, p0, Lcom/jumio/android/renderscript/Toolkit;->nativeHandle:J

    invoke-virtual {p2}, Lcom/jumio/android/renderscript/Rgba3dArray;->getValues()[B

    move-result-object v5

    invoke-virtual {p2}, Lcom/jumio/android/renderscript/Rgba3dArray;->getSizeX()I

    move-result v6

    .line 21
    invoke-virtual {p2}, Lcom/jumio/android/renderscript/Rgba3dArray;->getSizeY()I

    move-result v7

    invoke-virtual {p2}, Lcom/jumio/android/renderscript/Rgba3dArray;->getSizeZ()I

    move-result v8

    move-object v0, p0

    move-object v3, p1

    move-object v9, p3

    .line 22
    invoke-direct/range {v0 .. v9}, Lcom/jumio/android/renderscript/Toolkit;->nativeLut3dBitmap(JLandroid/graphics/Bitmap;Landroid/graphics/Bitmap;[BIIILcom/jumio/android/renderscript/Range2d;)V

    return-object v4
.end method

.method public final lut3d([BIILcom/jumio/android/renderscript/Rgba3dArray;)[B
    .locals 9
    .param p1    # [B
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Lcom/jumio/android/renderscript/Rgba3dArray;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 2
    const-string v0, "inputArray"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "cube"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v7, 0x10

    const/4 v8, 0x0

    const/4 v6, 0x0

    move-object v1, p0

    move-object v2, p1

    move v3, p2

    move v4, p3

    move-object v5, p4

    invoke-static/range {v1 .. v8}, Lcom/jumio/android/renderscript/Toolkit;->lut3d$default(Lcom/jumio/android/renderscript/Toolkit;[BIILcom/jumio/android/renderscript/Rgba3dArray;Lcom/jumio/android/renderscript/Range2d;ILjava/lang/Object;)[B

    move-result-object p1

    return-object p1
.end method

.method public final lut3d([BIILcom/jumio/android/renderscript/Rgba3dArray;Lcom/jumio/android/renderscript/Range2d;)[B
    .locals 12
    .param p1    # [B
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Lcom/jumio/android/renderscript/Rgba3dArray;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p5    # Lcom/jumio/android/renderscript/Range2d;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "inputArray"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "cube"

    move-object/from16 v1, p4

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    invoke-direct {p0}, Lcom/jumio/android/renderscript/Toolkit;->validateHandle()V

    .line 4
    array-length v0, p1

    mul-int v2, p2, p3

    mul-int/lit8 v2, v2, 0x4

    if-lt v0, v2, :cond_1

    .line 5
    invoke-virtual {v1}, Lcom/jumio/android/renderscript/Rgba3dArray;->getSizeX()I

    move-result v0

    const/4 v2, 0x2

    if-lt v0, v2, :cond_0

    invoke-virtual {v1}, Lcom/jumio/android/renderscript/Rgba3dArray;->getSizeY()I

    move-result v0

    if-lt v0, v2, :cond_0

    invoke-virtual {v1}, Lcom/jumio/android/renderscript/Rgba3dArray;->getSizeZ()I

    move-result v0

    if-lt v0, v2, :cond_0

    .line 6
    invoke-virtual {v1}, Lcom/jumio/android/renderscript/Rgba3dArray;->getSizeX()I

    move-result v0

    const/16 v2, 0x100

    if-gt v0, v2, :cond_0

    invoke-virtual {v1}, Lcom/jumio/android/renderscript/Rgba3dArray;->getSizeY()I

    move-result v0

    if-gt v0, v2, :cond_0

    invoke-virtual {v1}, Lcom/jumio/android/renderscript/Rgba3dArray;->getSizeZ()I

    move-result v0

    if-gt v0, v2, :cond_0

    .line 7
    const-string v0, "lut3d"

    move-object/from16 v11, p5

    invoke-static {v0, p2, p3, v11}, Lcom/jumio/android/renderscript/ToolkitKt;->validateRestriction(Ljava/lang/String;IILcom/jumio/android/renderscript/Range2d;)V

    .line 8
    array-length v0, p1

    new-array v4, v0, [B

    .line 9
    iget-wide v1, p0, Lcom/jumio/android/renderscript/Toolkit;->nativeHandle:J

    invoke-virtual/range {p4 .. p4}, Lcom/jumio/android/renderscript/Rgba3dArray;->getValues()[B

    move-result-object v7

    invoke-virtual/range {p4 .. p4}, Lcom/jumio/android/renderscript/Rgba3dArray;->getSizeX()I

    move-result v8

    .line 10
    invoke-virtual/range {p4 .. p4}, Lcom/jumio/android/renderscript/Rgba3dArray;->getSizeY()I

    move-result v9

    invoke-virtual/range {p4 .. p4}, Lcom/jumio/android/renderscript/Rgba3dArray;->getSizeZ()I

    move-result v10

    move-object v0, p0

    move-object v3, p1

    move v5, p2

    move v6, p3

    .line 11
    invoke-direct/range {v0 .. v11}, Lcom/jumio/android/renderscript/Toolkit;->nativeLut3d(J[B[BII[BIIILcom/jumio/android/renderscript/Range2d;)V

    return-object v4

    .line 12
    :cond_0
    invoke-virtual/range {p4 .. p4}, Lcom/jumio/android/renderscript/Rgba3dArray;->getSizeX()I

    move-result v0

    invoke-virtual/range {p4 .. p4}, Lcom/jumio/android/renderscript/Rgba3dArray;->getSizeY()I

    move-result v1

    invoke-virtual/range {p4 .. p4}, Lcom/jumio/android/renderscript/Rgba3dArray;->getSizeZ()I

    move-result v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "RenderScript Toolkit lut3d. The dimensions of the cube should be between 2 and 256. ("

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", "

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ") provided."

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 13
    new-instance v1, Ljava/lang/IllegalArgumentException;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 14
    :cond_1
    array-length v0, p1

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "RenderScript Toolkit lut3d. inputArray is too small for the given dimensions. "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, "*"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, "*4 < "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, "."

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 15
    new-instance v1, Ljava/lang/IllegalArgumentException;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public final resize(Landroid/graphics/Bitmap;II)Landroid/graphics/Bitmap;
    .locals 8
    .param p1    # Landroid/graphics/Bitmap;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    const-string v0, "inputBitmap"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v6, 0x8

    const/4 v7, 0x0

    const/4 v5, 0x0

    move-object v1, p0

    move-object v2, p1

    move v3, p2

    move v4, p3

    invoke-static/range {v1 .. v7}, Lcom/jumio/android/renderscript/Toolkit;->resize$default(Lcom/jumio/android/renderscript/Toolkit;Landroid/graphics/Bitmap;IILcom/jumio/android/renderscript/Range2d;ILjava/lang/Object;)Landroid/graphics/Bitmap;

    move-result-object p1

    return-object p1
.end method

.method public final resize(Landroid/graphics/Bitmap;IILcom/jumio/android/renderscript/Range2d;)Landroid/graphics/Bitmap;
    .locals 7
    .param p1    # Landroid/graphics/Bitmap;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Lcom/jumio/android/renderscript/Range2d;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "inputBitmap"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    invoke-direct {p0}, Lcom/jumio/android/renderscript/Toolkit;->validateHandle()V

    const/4 v0, 0x4

    const/4 v1, 0x0

    .line 14
    const-string v2, "resize"

    const/4 v3, 0x0

    invoke-static {v2, p1, v3, v0, v1}, Lcom/jumio/android/renderscript/ToolkitKt;->validateBitmap$default(Ljava/lang/String;Landroid/graphics/Bitmap;ZILjava/lang/Object;)V

    .line 15
    invoke-static {v2, p2, p3, p4}, Lcom/jumio/android/renderscript/ToolkitKt;->validateRestriction(Ljava/lang/String;IILcom/jumio/android/renderscript/Range2d;)V

    .line 16
    sget-object v0, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-static {p2, p3, v0}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v5

    const-string p2, "createBitmap(...)"

    invoke-static {v5, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 17
    iget-wide v2, p0, Lcom/jumio/android/renderscript/Toolkit;->nativeHandle:J

    move-object v1, p0

    move-object v4, p1

    move-object v6, p4

    invoke-direct/range {v1 .. v6}, Lcom/jumio/android/renderscript/Toolkit;->nativeResizeBitmap(JLandroid/graphics/Bitmap;Landroid/graphics/Bitmap;Lcom/jumio/android/renderscript/Range2d;)V

    return-object v5
.end method

.method public final resize([BIIIII)[B
    .locals 11
    .param p1    # [B
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 2
    const-string v0, "inputArray"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v9, 0x40

    const/4 v10, 0x0

    const/4 v8, 0x0

    move-object v1, p0

    move-object v2, p1

    move v3, p2

    move v4, p3

    move v5, p4

    move/from16 v6, p5

    move/from16 v7, p6

    invoke-static/range {v1 .. v10}, Lcom/jumio/android/renderscript/Toolkit;->resize$default(Lcom/jumio/android/renderscript/Toolkit;[BIIIIILcom/jumio/android/renderscript/Range2d;ILjava/lang/Object;)[B

    move-result-object p1

    return-object p1
.end method

.method public final resize([BIIIIILcom/jumio/android/renderscript/Range2d;)[B
    .locals 11
    .param p1    # [B
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p7    # Lcom/jumio/android/renderscript/Range2d;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    move/from16 v8, p5

    move/from16 v9, p6

    const-string v0, "inputArray"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    invoke-direct {p0}, Lcom/jumio/android/renderscript/Toolkit;->validateHandle()V

    const/4 v0, 0x1

    if-gt v0, p2, :cond_1

    const/4 v0, 0x5

    if-ge p2, v0, :cond_1

    .line 4
    array-length v0, p1

    mul-int v1, p3, p4

    mul-int/2addr v1, p2

    if-lt v0, v1, :cond_0

    .line 5
    const-string v0, "resize"

    move-object/from16 v10, p7

    invoke-static {v0, v8, v9, v10}, Lcom/jumio/android/renderscript/ToolkitKt;->validateRestriction(Ljava/lang/String;IILcom/jumio/android/renderscript/Range2d;)V

    mul-int v0, v8, v9

    .line 6
    invoke-static {p2}, Lcom/jumio/android/renderscript/ToolkitKt;->paddedSize(I)I

    move-result v1

    mul-int/2addr v0, v1

    new-array v7, v0, [B

    .line 7
    iget-wide v1, p0, Lcom/jumio/android/renderscript/Toolkit;->nativeHandle:J

    move-object v0, p0

    move-object v3, p1

    move v4, p2

    move v5, p3

    move v6, p4

    .line 8
    invoke-direct/range {v0 .. v10}, Lcom/jumio/android/renderscript/Toolkit;->nativeResize(J[BIII[BIILcom/jumio/android/renderscript/Range2d;)V

    return-object v7

    .line 9
    :cond_0
    array-length p1, p1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "RenderScript Toolkit resize. inputArray is too small for the given dimensions. "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p3, "*"

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p2, " < "

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, "."

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 10
    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2

    .line 11
    :cond_1
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "RenderScript Toolkit resize. The vectorSize should be between 1 and 4. "

    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p2, " provided."

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 12
    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method public final standardDeviation(Landroid/graphics/Bitmap;Lcom/jumio/android/renderscript/Range2d;)D
    .locals 4
    .param p1    # Landroid/graphics/Bitmap;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/jumio/android/renderscript/Range2d;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "inputBitmap"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-direct {p0}, Lcom/jumio/android/renderscript/Toolkit;->validateHandle()V

    .line 9
    const/4 v0, 0x4

    .line 10
    const/4 v1, 0x0

    .line 11
    .line 12
    const-string v2, "standardDeviation"

    .line 13
    const/4 v3, 0x0

    .line 14
    .line 15
    .line 16
    invoke-static {v2, p1, v3, v0, v1}, Lcom/jumio/android/renderscript/ToolkitKt;->validateBitmap$default(Ljava/lang/String;Landroid/graphics/Bitmap;ZILjava/lang/Object;)V

    .line 17
    .line 18
    iget-wide v0, p0, Lcom/jumio/android/renderscript/Toolkit;->nativeHandle:J

    .line 19
    .line 20
    .line 21
    invoke-direct {p0, v0, v1, p1, p2}, Lcom/jumio/android/renderscript/Toolkit;->nativeStandardDeviationBitmap(JLandroid/graphics/Bitmap;Lcom/jumio/android/renderscript/Range2d;)D

    .line 22
    move-result-wide p1

    .line 23
    return-wide p1
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
.end method

.method public final standardDeviationFast(Landroid/graphics/Bitmap;Lcom/jumio/android/renderscript/Range2d;)D
    .locals 4
    .param p1    # Landroid/graphics/Bitmap;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/jumio/android/renderscript/Range2d;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "inputBitmap"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-direct {p0}, Lcom/jumio/android/renderscript/Toolkit;->validateHandle()V

    .line 9
    const/4 v0, 0x4

    .line 10
    const/4 v1, 0x0

    .line 11
    .line 12
    const-string v2, "standardDeviationFast"

    .line 13
    const/4 v3, 0x0

    .line 14
    .line 15
    .line 16
    invoke-static {v2, p1, v3, v0, v1}, Lcom/jumio/android/renderscript/ToolkitKt;->validateBitmap$default(Ljava/lang/String;Landroid/graphics/Bitmap;ZILjava/lang/Object;)V

    .line 17
    .line 18
    iget-wide v0, p0, Lcom/jumio/android/renderscript/Toolkit;->nativeHandle:J

    .line 19
    .line 20
    .line 21
    invoke-direct {p0, v0, v1, p1, p2}, Lcom/jumio/android/renderscript/Toolkit;->nativeStandardDeviationBitmapFast(JLandroid/graphics/Bitmap;Lcom/jumio/android/renderscript/Range2d;)D

    .line 22
    move-result-wide p1

    .line 23
    return-wide p1
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
.end method

.method public final toNv21(Landroid/media/Image;)[B
    .locals 14
    .param p1    # Landroid/media/Image;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    const-string v0, "image"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-direct {p0}, Lcom/jumio/android/renderscript/Toolkit;->validateHandle()V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p1}, Landroid/media/Image;->getWidth()I

    .line 12
    move-result v0

    .line 13
    .line 14
    .line 15
    invoke-virtual {p1}, Landroid/media/Image;->getHeight()I

    .line 16
    move-result v1

    .line 17
    mul-int/2addr v0, v1

    .line 18
    int-to-float v0, v0

    .line 19
    .line 20
    const/high16 v1, 0x3fc00000    # 1.5f

    .line 21
    mul-float/2addr v0, v1

    .line 22
    float-to-int v0, v0

    .line 23
    .line 24
    new-array v13, v0, [B

    .line 25
    .line 26
    iget-wide v2, p0, Lcom/jumio/android/renderscript/Toolkit;->nativeHandle:J

    .line 27
    .line 28
    .line 29
    invoke-virtual {p1}, Landroid/media/Image;->getWidth()I

    .line 30
    move-result v4

    .line 31
    .line 32
    .line 33
    invoke-virtual {p1}, Landroid/media/Image;->getHeight()I

    .line 34
    move-result v5

    .line 35
    .line 36
    .line 37
    invoke-virtual {p1}, Landroid/media/Image;->getPlanes()[Landroid/media/Image$Plane;

    .line 38
    move-result-object v0

    .line 39
    const/4 v1, 0x0

    .line 40
    .line 41
    aget-object v0, v0, v1

    .line 42
    .line 43
    .line 44
    invoke-virtual {v0}, Landroid/media/Image$Plane;->getBuffer()Ljava/nio/ByteBuffer;

    .line 45
    move-result-object v6

    .line 46
    .line 47
    const-string v0, "getBuffer(...)"

    .line 48
    .line 49
    .line 50
    invoke-static {v6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {p1}, Landroid/media/Image;->getPlanes()[Landroid/media/Image$Plane;

    .line 54
    move-result-object v7

    .line 55
    const/4 v8, 0x1

    .line 56
    .line 57
    aget-object v7, v7, v8

    .line 58
    .line 59
    .line 60
    invoke-virtual {v7}, Landroid/media/Image$Plane;->getBuffer()Ljava/nio/ByteBuffer;

    .line 61
    move-result-object v7

    .line 62
    .line 63
    .line 64
    invoke-static {v7, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    invoke-virtual {p1}, Landroid/media/Image;->getPlanes()[Landroid/media/Image$Plane;

    .line 68
    move-result-object v9

    .line 69
    const/4 v10, 0x2

    .line 70
    .line 71
    aget-object v9, v9, v10

    .line 72
    .line 73
    .line 74
    invoke-virtual {v9}, Landroid/media/Image$Plane;->getBuffer()Ljava/nio/ByteBuffer;

    .line 75
    move-result-object v9

    .line 76
    .line 77
    .line 78
    invoke-static {v9, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    invoke-virtual {p1}, Landroid/media/Image;->getPlanes()[Landroid/media/Image$Plane;

    .line 82
    move-result-object v0

    .line 83
    .line 84
    aget-object v0, v0, v1

    .line 85
    .line 86
    .line 87
    invoke-virtual {v0}, Landroid/media/Image$Plane;->getPixelStride()I

    .line 88
    move-result v0

    .line 89
    .line 90
    .line 91
    invoke-virtual {p1}, Landroid/media/Image;->getPlanes()[Landroid/media/Image$Plane;

    .line 92
    move-result-object v10

    .line 93
    .line 94
    aget-object v10, v10, v8

    .line 95
    .line 96
    .line 97
    invoke-virtual {v10}, Landroid/media/Image$Plane;->getPixelStride()I

    .line 98
    move-result v10

    .line 99
    .line 100
    .line 101
    invoke-virtual {p1}, Landroid/media/Image;->getPlanes()[Landroid/media/Image$Plane;

    .line 102
    move-result-object v11

    .line 103
    .line 104
    aget-object v1, v11, v1

    .line 105
    .line 106
    .line 107
    invoke-virtual {v1}, Landroid/media/Image$Plane;->getRowStride()I

    .line 108
    move-result v11

    .line 109
    .line 110
    .line 111
    invoke-virtual {p1}, Landroid/media/Image;->getPlanes()[Landroid/media/Image$Plane;

    .line 112
    move-result-object p1

    .line 113
    .line 114
    aget-object p1, p1, v8

    .line 115
    .line 116
    .line 117
    invoke-virtual {p1}, Landroid/media/Image$Plane;->getRowStride()I

    .line 118
    move-result v12

    .line 119
    move-object v1, p0

    .line 120
    move-object v8, v9

    .line 121
    move v9, v0

    .line 122
    .line 123
    .line 124
    invoke-direct/range {v1 .. v13}, Lcom/jumio/android/renderscript/Toolkit;->nativeYuv420toNv21(JIILjava/nio/ByteBuffer;Ljava/nio/ByteBuffer;Ljava/nio/ByteBuffer;IIII[B)Z

    .line 125
    move-result p1

    .line 126
    .line 127
    if-nez p1, :cond_0

    .line 128
    const/4 p1, 0x0

    .line 129
    return-object p1

    .line 130
    :cond_0
    return-object v13
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
.end method

.method public final yuvToRgb([BIILcom/jumio/android/renderscript/YuvFormat;)[B
    .locals 9
    .param p1    # [B
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Lcom/jumio/android/renderscript/YuvFormat;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    const-string v0, "inputArray"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    const-string v0, "format"

    .line 8
    .line 9
    .line 10
    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    invoke-direct {p0}, Lcom/jumio/android/renderscript/Toolkit;->validateHandle()V

    .line 14
    .line 15
    rem-int/lit8 v0, p2, 0x2

    .line 16
    .line 17
    if-nez v0, :cond_0

    .line 18
    .line 19
    rem-int/lit8 v0, p3, 0x2

    .line 20
    .line 21
    if-nez v0, :cond_0

    .line 22
    .line 23
    mul-int v0, p2, p3

    .line 24
    .line 25
    mul-int/lit8 v0, v0, 0x4

    .line 26
    .line 27
    new-array v5, v0, [B

    .line 28
    .line 29
    iget-wide v2, p0, Lcom/jumio/android/renderscript/Toolkit;->nativeHandle:J

    .line 30
    .line 31
    .line 32
    invoke-virtual {p4}, Lcom/jumio/android/renderscript/YuvFormat;->getValue()I

    .line 33
    move-result v8

    .line 34
    move-object v1, p0

    .line 35
    move-object v4, p1

    .line 36
    move v6, p2

    .line 37
    move v7, p3

    .line 38
    .line 39
    .line 40
    invoke-direct/range {v1 .. v8}, Lcom/jumio/android/renderscript/Toolkit;->nativeYuvToRgb(J[B[BIII)V

    .line 41
    return-object v5

    .line 42
    :cond_0
    move v6, p2

    .line 43
    move v7, p3

    .line 44
    .line 45
    new-instance p1, Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 49
    .line 50
    const-string p2, "RenderScript Toolkit yuvToRgb. Non-even dimensions are not supported. "

    .line 51
    .line 52
    .line 53
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    invoke-virtual {p1, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    const-string p2, " and "

    .line 59
    .line 60
    .line 61
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    .line 64
    invoke-virtual {p1, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 65
    .line 66
    const-string p2, " were provided."

    .line 67
    .line 68
    .line 69
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 70
    .line 71
    .line 72
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 73
    move-result-object p1

    .line 74
    .line 75
    new-instance p2, Ljava/lang/IllegalArgumentException;

    .line 76
    .line 77
    .line 78
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 79
    move-result-object p1

    .line 80
    .line 81
    .line 82
    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 83
    throw p2
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
.end method

.method public final yuvToRgbBitmap([BIILcom/jumio/android/renderscript/YuvFormat;)Landroid/graphics/Bitmap;
    .locals 9
    .param p1    # [B
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Lcom/jumio/android/renderscript/YuvFormat;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    const-string v0, "inputArray"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    const-string v0, "format"

    .line 8
    .line 9
    .line 10
    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    invoke-direct {p0}, Lcom/jumio/android/renderscript/Toolkit;->validateHandle()V

    .line 14
    .line 15
    rem-int/lit8 v0, p2, 0x2

    .line 16
    .line 17
    if-nez v0, :cond_0

    .line 18
    .line 19
    rem-int/lit8 v0, p3, 0x2

    .line 20
    .line 21
    if-nez v0, :cond_0

    .line 22
    .line 23
    sget-object v0, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    .line 24
    .line 25
    .line 26
    invoke-static {p2, p3, v0}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    .line 27
    move-result-object v7

    .line 28
    .line 29
    const-string v0, "createBitmap(...)"

    .line 30
    .line 31
    .line 32
    invoke-static {v7, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 33
    .line 34
    iget-wide v2, p0, Lcom/jumio/android/renderscript/Toolkit;->nativeHandle:J

    .line 35
    .line 36
    .line 37
    invoke-virtual {p4}, Lcom/jumio/android/renderscript/YuvFormat;->getValue()I

    .line 38
    move-result v8

    .line 39
    move-object v1, p0

    .line 40
    move-object v4, p1

    .line 41
    move v5, p2

    .line 42
    move v6, p3

    .line 43
    .line 44
    .line 45
    invoke-direct/range {v1 .. v8}, Lcom/jumio/android/renderscript/Toolkit;->nativeYuvToRgbBitmap(J[BIILandroid/graphics/Bitmap;I)V

    .line 46
    return-object v7

    .line 47
    :cond_0
    move v5, p2

    .line 48
    move v6, p3

    .line 49
    .line 50
    new-instance p1, Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 54
    .line 55
    const-string p2, "RenderScript Toolkit yuvToRgbBitmap. Non-even dimensions are not supported. "

    .line 56
    .line 57
    .line 58
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    invoke-virtual {p1, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    const-string p2, " and "

    .line 64
    .line 65
    .line 66
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    .line 69
    invoke-virtual {p1, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 70
    .line 71
    const-string p2, " were provided."

    .line 72
    .line 73
    .line 74
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 75
    .line 76
    .line 77
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 78
    move-result-object p1

    .line 79
    .line 80
    new-instance p2, Ljava/lang/IllegalArgumentException;

    .line 81
    .line 82
    .line 83
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 84
    move-result-object p1

    .line 85
    .line 86
    .line 87
    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 88
    throw p2
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
.end method
