package com.jumio.android.renderscript;

import android.graphics.Bitmap;
import android.media.Image;
import androidx.webkit.ProxyConfig;
import com.tencent.bugly.proguard.C33749k7;
import com.tencent.bugly.proguard.C33978va;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.nio.ByteBuffer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmOverloads;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Toolkit.kt */
/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0014\n\u0002\b\u0010\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b%\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u0007\u001a\u00020\bH\u0016J<\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0007J,\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00152\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0007J>\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u001a\u001a\u00020\u00102\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0007J&\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u001b\u001a\u00020\u00152\b\b\u0002\u0010\u001a\u001a\u00020\u00102\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0007JN\u0010&\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\r2\u0006\u0010'\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010(\u001a\u00020\u00102\u0006\u0010)\u001a\u00020\u001d2\b\b\u0002\u0010*\u001a\u00020\u001d2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0007J.\u0010&\u001a\u00020\u00152\u0006\u0010\u001b\u001a\u00020\u00152\u0006\u0010)\u001a\u00020\u001d2\b\b\u0002\u0010*\u001a\u00020\u001d2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0007J<\u0010+\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010,\u001a\u00020\u001d2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0007J$\u0010+\u001a\u00020\u00152\u0006\u0010\u001b\u001a\u00020\u00152\u0006\u0010,\u001a\u00020\u001d2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0007J4\u0010-\u001a\u00020.2\u0006\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0007J\u001c\u0010-\u001a\u00020.2\u0006\u0010\u001b\u001a\u00020\u00152\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0007J@\u0010/\u001a\u00020.2\u0006\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u001d2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0007J(\u0010/\u001a\u00020.2\u0006\u0010\u001b\u001a\u00020\u00152\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u001d2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0007J4\u00100\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u00101\u001a\u0002022\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0007J$\u00100\u001a\u00020\u00152\u0006\u0010\u001b\u001a\u00020\u00152\u0006\u00101\u001a\u0002022\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0007J4\u00103\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u00104\u001a\u0002052\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0007J$\u00103\u001a\u00020\u00152\u0006\u0010\u001b\u001a\u00020\u00152\u0006\u00104\u001a\u0002052\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0007JD\u00106\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u00102\u0006\u00107\u001a\u00020\u00102\u0006\u00108\u001a\u00020\u00102\u0006\u00109\u001a\u00020\u00102\u0006\u0010:\u001a\u00020\u00102\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0007J,\u00106\u001a\u00020\u00152\u0006\u0010\u001b\u001a\u00020\u00152\u0006\u00109\u001a\u00020\u00102\u0006\u0010:\u001a\u00020\u00102\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0007J&\u0010;\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010<\u001a\u00020=J&\u0010>\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010<\u001a\u00020=J\u001a\u0010?\u001a\u00020@2\u0006\u0010\u001b\u001a\u00020\u00152\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013J\u001a\u0010A\u001a\u00020@2\u0006\u0010\u001b\u001a\u00020\u00152\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013J\u001a\u0010B\u001a\u00020\u00102\u0006\u0010\u001b\u001a\u00020\u00152\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013J\u0010\u0010C\u001a\u0004\u0018\u00010\r2\u0006\u0010D\u001a\u00020EJ\b\u0010F\u001a\u00020\bH\u0002J\t\u0010G\u001a\u00020\u0006H\u0082 J\u0011\u0010H\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0006H\u0082 JC\u0010I\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0082 J3\u0010J\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00152\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0082 JK\u0010K\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u00102\u0006\u0010L\u001a\u00020\r2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0082 J3\u0010M\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u00152\u0006\u0010N\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\u00102\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0082 J[\u0010O\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\r2\u0006\u0010'\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010L\u001a\u00020\r2\u0006\u0010(\u001a\u00020\u00102\u0006\u0010)\u001a\u00020\u001d2\u0006\u0010*\u001a\u00020\u001d2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0082 J;\u0010P\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u00152\u0006\u0010N\u001a\u00020\u00152\u0006\u0010)\u001a\u00020\u001d2\u0006\u0010*\u001a\u00020\u001d2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0082 JK\u0010Q\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010L\u001a\u00020\r2\u0006\u0010,\u001a\u00020\u001d2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0082 J3\u0010R\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u00152\u0006\u0010N\u001a\u00020\u00152\u0006\u0010,\u001a\u00020\u001d2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0082 JC\u0010S\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010L\u001a\u00020.2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0082 J+\u0010T\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u00152\u0006\u0010L\u001a\u00020.2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0082 JK\u0010U\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010L\u001a\u00020.2\u0006\u0010,\u001a\u00020\u001d2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0082 J3\u0010V\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u00152\u0006\u0010L\u001a\u00020.2\u0006\u0010,\u001a\u00020\u001d2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0082 J[\u0010W\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\r2\u0006\u0010L\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010X\u001a\u00020\r2\u0006\u0010Y\u001a\u00020\r2\u0006\u0010Z\u001a\u00020\r2\u0006\u0010[\u001a\u00020\r2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0082 JK\u0010\\\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u00152\u0006\u0010N\u001a\u00020\u00152\u0006\u0010X\u001a\u00020\r2\u0006\u0010Y\u001a\u00020\r2\u0006\u0010Z\u001a\u00020\r2\u0006\u0010[\u001a\u00020\r2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0082 J[\u0010]\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\r2\u0006\u0010L\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u00104\u001a\u00020\r2\u0006\u0010^\u001a\u00020\u00102\u0006\u0010_\u001a\u00020\u00102\u0006\u0010`\u001a\u00020\u00102\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0082 JK\u0010a\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u00152\u0006\u0010N\u001a\u00020\u00152\u0006\u00104\u001a\u00020\r2\u0006\u0010^\u001a\u00020\u00102\u0006\u0010_\u001a\u00020\u00102\u0006\u0010`\u001a\u00020\u00102\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0082 JS\u0010b\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u00102\u0006\u00107\u001a\u00020\u00102\u0006\u00108\u001a\u00020\u00102\u0006\u0010L\u001a\u00020\r2\u0006\u00109\u001a\u00020\u00102\u0006\u0010:\u001a\u00020\u00102\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0082 J+\u0010c\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u00152\u0006\u0010N\u001a\u00020\u00152\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0082 J9\u0010d\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\r2\u0006\u0010L\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010<\u001a\u00020\u0010H\u0082 J9\u0010e\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010N\u001a\u00020\u00152\u0006\u0010f\u001a\u00020\u0010H\u0082 J#\u0010g\u001a\u00020@2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u00152\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0082 J#\u0010h\u001a\u00020@2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u00152\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0082 J#\u0010i\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u00152\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0082 Ja\u0010j\u001a\u00020k2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010l\u001a\u00020\u00102\u0006\u0010m\u001a\u00020\u00102\u0006\u0010n\u001a\u00020o2\u0006\u0010p\u001a\u00020o2\u0006\u0010q\u001a\u00020o2\u0006\u0010r\u001a\u00020\u00102\u0006\u0010s\u001a\u00020\u00102\u0006\u0010t\u001a\u00020\u00102\u0006\u0010u\u001a\u00020\u00102\u0006\u0010v\u001a\u00020\rH\u0082 R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u001c\u001a\u00020\u001d8F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010 \u001a\u00020\u001d8F¢\u0006\u0006\u001a\u0004\b!\u0010\u001fR\u0011\u0010\"\u001a\u00020\u001d8F¢\u0006\u0006\u001a\u0004\b#\u0010\u001fR\u0011\u0010$\u001a\u00020\u001d8F¢\u0006\u0006\u001a\u0004\b%\u0010\u001f¨\u0006w"}, m90084d2 = {"Lcom/jumio/android/renderscript/Toolkit;", "Ljava/lang/AutoCloseable;", "Lkotlin/AutoCloseable;", "<init>", "()V", "nativeHandle", "", "close", "", "blend", "mode", "Lcom/jumio/android/renderscript/BlendingMode;", "sourceArray", "", "destArray", "sizeX", "", "sizeY", "restriction", "Lcom/jumio/android/renderscript/Range2d;", "sourceBitmap", "Landroid/graphics/Bitmap;", "destBitmap", "blur", "inputArray", "vectorSize", "radius", "inputBitmap", "identityMatrix", "", "getIdentityMatrix", "()[F", "greyScaleColorMatrix", "getGreyScaleColorMatrix", "rgbToYuvMatrix", "getRgbToYuvMatrix", "yuvToRgbMatrix", "getYuvToRgbMatrix", "colorMatrix", "inputVectorSize", "outputVectorSize", "matrix", "addVector", "convolve", "coefficients", C33749k7.b.f70579t, "", "histogramDot", "lut", "table", "Lcom/jumio/android/renderscript/LookupTable;", "lut3d", "cube", "Lcom/jumio/android/renderscript/Rgba3dArray;", "resize", "inputSizeX", "inputSizeY", "outputSizeX", "outputSizeY", "yuvToRgb", TUIConstants.TUIGroupNotePlugin.PLUGIN_GROUP_NOTE_FORMAT, "Lcom/jumio/android/renderscript/YuvFormat;", "yuvToRgbBitmap", "standardDeviation", "", "standardDeviationFast", "averageColor", "toNv21", "image", "Landroid/media/Image;", "validateHandle", "createNative", "destroyNative", "nativeBlend", "nativeBlendBitmap", "nativeBlur", "outputArray", "nativeBlurBitmap", "outputBitmap", "nativeColorMatrix", "nativeColorMatrixBitmap", "nativeConvolve", "nativeConvolveBitmap", "nativeHistogram", "nativeHistogramBitmap", "nativeHistogramDot", "nativeHistogramDotBitmap", "nativeLut", "red", "green", "blue", "alpha", "nativeLutBitmap", "nativeLut3d", "cubeSizeX", "cubeSizeY", "cubeSizeZ", "nativeLut3dBitmap", "nativeResize", "nativeResizeBitmap", "nativeYuvToRgb", "nativeYuvToRgbBitmap", "value", "nativeStandardDeviationBitmap", "nativeStandardDeviationBitmapFast", "nativeAverageColorBitmap", "nativeYuv420toNv21", "", "imageWidth", "imageHeight", "yByteBuffer", "Ljava/nio/ByteBuffer;", "uByteBuffer", "vByteBuffer", "yPixelStride", "uvPixelStride", "yRowStride", "uvRowStride", "nv21Output", "jumio-toolkit_release"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nToolkit.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Toolkit.kt\ncom/jumio/android/renderscript/Toolkit\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1658:1\n1#2:1659\n*E\n"})
public final class Toolkit implements AutoCloseable {
    private long nativeHandle;

    public static /* synthetic */ void blend$default(Toolkit toolkit, BlendingMode blendingMode, byte[] bArr, byte[] bArr2, int i11, int i12, Range2d range2d, int i13, Object obj) {
        if ((i13 & 32) != 0) {
            range2d = null;
        }
        toolkit.blend(blendingMode, bArr, bArr2, i11, i12, range2d);
    }

    public static /* synthetic */ byte[] blur$default(Toolkit toolkit, byte[] bArr, int i11, int i12, int i13, int i14, Range2d range2d, int i15, Object obj) {
        if ((i15 & 16) != 0) {
            i14 = 5;
        }
        int i16 = i14;
        if ((i15 & 32) != 0) {
            range2d = null;
        }
        return toolkit.blur(bArr, i11, i12, i13, i16, range2d);
    }

    public static /* synthetic */ byte[] colorMatrix$default(Toolkit toolkit, byte[] bArr, int i11, int i12, int i13, int i14, float[] fArr, float[] fArr2, Range2d range2d, int i15, Object obj) {
        return toolkit.colorMatrix(bArr, i11, i12, i13, i14, fArr, (i15 & 64) != 0 ? new float[]{0.0f, 0.0f, 0.0f, 0.0f} : fArr2, (i15 & 128) != 0 ? null : range2d);
    }

    public static /* synthetic */ byte[] convolve$default(Toolkit toolkit, byte[] bArr, int i11, int i12, int i13, float[] fArr, Range2d range2d, int i14, Object obj) {
        if ((i14 & 32) != 0) {
            range2d = null;
        }
        return toolkit.convolve(bArr, i11, i12, i13, fArr, range2d);
    }

    private final native long createNative();

    private final native void destroyNative(long nativeHandle);

    public static /* synthetic */ int[] histogram$default(Toolkit toolkit, byte[] bArr, int i11, int i12, int i13, Range2d range2d, int i14, Object obj) {
        if ((i14 & 16) != 0) {
            range2d = null;
        }
        return toolkit.histogram(bArr, i11, i12, i13, range2d);
    }

    public static /* synthetic */ int[] histogramDot$default(Toolkit toolkit, byte[] bArr, int i11, int i12, int i13, float[] fArr, Range2d range2d, int i14, Object obj) {
        if ((i14 & 16) != 0) {
            fArr = null;
        }
        if ((i14 & 32) != 0) {
            range2d = null;
        }
        return toolkit.histogramDot(bArr, i11, i12, i13, fArr, range2d);
    }

    public static /* synthetic */ byte[] lut$default(Toolkit toolkit, byte[] bArr, int i11, int i12, LookupTable lookupTable, Range2d range2d, int i13, Object obj) {
        if ((i13 & 16) != 0) {
            range2d = null;
        }
        return toolkit.lut(bArr, i11, i12, lookupTable, range2d);
    }

    public static /* synthetic */ byte[] lut3d$default(Toolkit toolkit, byte[] bArr, int i11, int i12, Rgba3dArray rgba3dArray, Range2d range2d, int i13, Object obj) {
        if ((i13 & 16) != 0) {
            range2d = null;
        }
        return toolkit.lut3d(bArr, i11, i12, rgba3dArray, range2d);
    }

    private final native int nativeAverageColorBitmap(long nativeHandle, Bitmap inputBitmap, Range2d restriction);

    private final native void nativeBlend(long nativeHandle, int mode, byte[] sourceArray, byte[] destArray, int sizeX, int sizeY, Range2d restriction);

    private final native void nativeBlendBitmap(long nativeHandle, int mode, Bitmap sourceBitmap, Bitmap destBitmap, Range2d restriction);

    private final native void nativeBlur(long nativeHandle, byte[] inputArray, int vectorSize, int sizeX, int sizeY, int radius, byte[] outputArray, Range2d restriction);

    private final native void nativeBlurBitmap(long nativeHandle, Bitmap inputBitmap, Bitmap outputBitmap, int radius, Range2d restriction);

    private final native void nativeColorMatrix(long nativeHandle, byte[] inputArray, int inputVectorSize, int sizeX, int sizeY, byte[] outputArray, int outputVectorSize, float[] matrix, float[] addVector, Range2d restriction);

    private final native void nativeColorMatrixBitmap(long nativeHandle, Bitmap inputBitmap, Bitmap outputBitmap, float[] matrix, float[] addVector, Range2d restriction);

    private final native void nativeConvolve(long nativeHandle, byte[] inputArray, int vectorSize, int sizeX, int sizeY, byte[] outputArray, float[] coefficients, Range2d restriction);

    private final native void nativeConvolveBitmap(long nativeHandle, Bitmap inputBitmap, Bitmap outputBitmap, float[] coefficients, Range2d restriction);

    private final native void nativeHistogram(long nativeHandle, byte[] inputArray, int vectorSize, int sizeX, int sizeY, int[] outputArray, Range2d restriction);

    private final native void nativeHistogramBitmap(long nativeHandle, Bitmap inputBitmap, int[] outputArray, Range2d restriction);

    private final native void nativeHistogramDot(long nativeHandle, byte[] inputArray, int vectorSize, int sizeX, int sizeY, int[] outputArray, float[] coefficients, Range2d restriction);

    private final native void nativeHistogramDotBitmap(long nativeHandle, Bitmap inputBitmap, int[] outputArray, float[] coefficients, Range2d restriction);

    private final native void nativeLut(long nativeHandle, byte[] inputArray, byte[] outputArray, int sizeX, int sizeY, byte[] red, byte[] green, byte[] blue, byte[] alpha, Range2d restriction);

    private final native void nativeLut3d(long nativeHandle, byte[] inputArray, byte[] outputArray, int sizeX, int sizeY, byte[] cube, int cubeSizeX, int cubeSizeY, int cubeSizeZ, Range2d restriction);

    private final native void nativeLut3dBitmap(long nativeHandle, Bitmap inputBitmap, Bitmap outputBitmap, byte[] cube, int cubeSizeX, int cubeSizeY, int cubeSizeZ, Range2d restriction);

    private final native void nativeLutBitmap(long nativeHandle, Bitmap inputBitmap, Bitmap outputBitmap, byte[] red, byte[] green, byte[] blue, byte[] alpha, Range2d restriction);

    private final native void nativeResize(long nativeHandle, byte[] inputArray, int vectorSize, int inputSizeX, int inputSizeY, byte[] outputArray, int outputSizeX, int outputSizeY, Range2d restriction);

    private final native void nativeResizeBitmap(long nativeHandle, Bitmap inputBitmap, Bitmap outputBitmap, Range2d restriction);

    private final native double nativeStandardDeviationBitmap(long nativeHandle, Bitmap inputBitmap, Range2d restriction);

    private final native double nativeStandardDeviationBitmapFast(long nativeHandle, Bitmap inputBitmap, Range2d restriction);

    private final native boolean nativeYuv420toNv21(long nativeHandle, int imageWidth, int imageHeight, ByteBuffer yByteBuffer, ByteBuffer uByteBuffer, ByteBuffer vByteBuffer, int yPixelStride, int uvPixelStride, int yRowStride, int uvRowStride, byte[] nv21Output);

    private final native void nativeYuvToRgb(long nativeHandle, byte[] inputArray, byte[] outputArray, int sizeX, int sizeY, int format);

    private final native void nativeYuvToRgbBitmap(long nativeHandle, byte[] inputArray, int sizeX, int sizeY, Bitmap outputBitmap, int value);

    public static /* synthetic */ byte[] resize$default(Toolkit toolkit, byte[] bArr, int i11, int i12, int i13, int i14, int i15, Range2d range2d, int i16, Object obj) {
        return toolkit.resize(bArr, i11, i12, i13, i14, i15, (i16 & 64) != 0 ? null : range2d);
    }

    @JvmOverloads
    public final void blend(@NotNull BlendingMode mode, @NotNull Bitmap sourceBitmap, @NotNull Bitmap destBitmap) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        Intrinsics.checkNotNullParameter(sourceBitmap, "sourceBitmap");
        Intrinsics.checkNotNullParameter(destBitmap, "destBitmap");
        blend$default(this, mode, sourceBitmap, destBitmap, null, 8, null);
    }

    @JvmOverloads
    @NotNull
    public final Bitmap blur(@NotNull Bitmap inputBitmap) {
        Intrinsics.checkNotNullParameter(inputBitmap, "inputBitmap");
        return blur$default(this, inputBitmap, 0, null, 6, null);
    }

    @JvmOverloads
    @NotNull
    public final Bitmap colorMatrix(@NotNull Bitmap inputBitmap, @NotNull float[] matrix) {
        Intrinsics.checkNotNullParameter(inputBitmap, "inputBitmap");
        Intrinsics.checkNotNullParameter(matrix, "matrix");
        return colorMatrix$default(this, inputBitmap, matrix, null, null, 12, null);
    }

    @JvmOverloads
    @NotNull
    public final Bitmap convolve(@NotNull Bitmap inputBitmap, @NotNull float[] coefficients) {
        Intrinsics.checkNotNullParameter(inputBitmap, "inputBitmap");
        Intrinsics.checkNotNullParameter(coefficients, "coefficients");
        return convolve$default(this, inputBitmap, coefficients, null, 4, null);
    }

    @JvmOverloads
    @NotNull
    public final int[] histogram(@NotNull Bitmap inputBitmap) {
        Intrinsics.checkNotNullParameter(inputBitmap, "inputBitmap");
        return histogram$default(this, inputBitmap, null, 2, null);
    }

    @JvmOverloads
    @NotNull
    public final int[] histogramDot(@NotNull Bitmap inputBitmap) {
        Intrinsics.checkNotNullParameter(inputBitmap, "inputBitmap");
        return histogramDot$default(this, inputBitmap, null, null, 6, null);
    }

    @JvmOverloads
    @NotNull
    public final Bitmap lut(@NotNull Bitmap inputBitmap, @NotNull LookupTable table) {
        Intrinsics.checkNotNullParameter(inputBitmap, "inputBitmap");
        Intrinsics.checkNotNullParameter(table, "table");
        return lut$default(this, inputBitmap, table, null, 4, null);
    }

    @JvmOverloads
    @NotNull
    public final Bitmap lut3d(@NotNull Bitmap inputBitmap, @NotNull Rgba3dArray cube) {
        Intrinsics.checkNotNullParameter(inputBitmap, "inputBitmap");
        Intrinsics.checkNotNullParameter(cube, "cube");
        return lut3d$default(this, inputBitmap, cube, null, 4, null);
    }

    @JvmOverloads
    @NotNull
    public final Bitmap resize(@NotNull Bitmap inputBitmap, int i11, int i12) {
        Intrinsics.checkNotNullParameter(inputBitmap, "inputBitmap");
        return resize$default(this, inputBitmap, i11, i12, null, 8, null);
    }

    public static /* synthetic */ int averageColor$default(Toolkit toolkit, Bitmap bitmap, Range2d range2d, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            range2d = null;
        }
        return toolkit.averageColor(bitmap, range2d);
    }

    public static /* synthetic */ void blend$default(Toolkit toolkit, BlendingMode blendingMode, Bitmap bitmap, Bitmap bitmap2, Range2d range2d, int i11, Object obj) {
        if ((i11 & 8) != 0) {
            range2d = null;
        }
        toolkit.blend(blendingMode, bitmap, bitmap2, range2d);
    }

    public static /* synthetic */ Bitmap blur$default(Toolkit toolkit, Bitmap bitmap, int i11, Range2d range2d, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i11 = 5;
        }
        if ((i12 & 4) != 0) {
            range2d = null;
        }
        return toolkit.blur(bitmap, i11, range2d);
    }

    public static /* synthetic */ Bitmap convolve$default(Toolkit toolkit, Bitmap bitmap, float[] fArr, Range2d range2d, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            range2d = null;
        }
        return toolkit.convolve(bitmap, fArr, range2d);
    }

    public static /* synthetic */ int[] histogram$default(Toolkit toolkit, Bitmap bitmap, Range2d range2d, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            range2d = null;
        }
        return toolkit.histogram(bitmap, range2d);
    }

    public static /* synthetic */ int[] histogramDot$default(Toolkit toolkit, Bitmap bitmap, float[] fArr, Range2d range2d, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            fArr = null;
        }
        if ((i11 & 4) != 0) {
            range2d = null;
        }
        return toolkit.histogramDot(bitmap, fArr, range2d);
    }

    public static /* synthetic */ Bitmap lut$default(Toolkit toolkit, Bitmap bitmap, LookupTable lookupTable, Range2d range2d, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            range2d = null;
        }
        return toolkit.lut(bitmap, lookupTable, range2d);
    }

    public static /* synthetic */ Bitmap lut3d$default(Toolkit toolkit, Bitmap bitmap, Rgba3dArray rgba3dArray, Range2d range2d, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            range2d = null;
        }
        return toolkit.lut3d(bitmap, rgba3dArray, range2d);
    }

    public static /* synthetic */ Bitmap resize$default(Toolkit toolkit, Bitmap bitmap, int i11, int i12, Range2d range2d, int i13, Object obj) {
        if ((i13 & 8) != 0) {
            range2d = null;
        }
        return toolkit.resize(bitmap, i11, i12, range2d);
    }

    public static /* synthetic */ double standardDeviation$default(Toolkit toolkit, Bitmap bitmap, Range2d range2d, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            range2d = null;
        }
        return toolkit.standardDeviation(bitmap, range2d);
    }

    public static /* synthetic */ double standardDeviationFast$default(Toolkit toolkit, Bitmap bitmap, Range2d range2d, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            range2d = null;
        }
        return toolkit.standardDeviationFast(bitmap, range2d);
    }

    private final void validateHandle() {
        if (this.nativeHandle == 0) {
            throw new IllegalArgumentException("This instance of Toolkit can not be used anymore");
        }
    }

    public final int averageColor(@NotNull Bitmap inputBitmap, @Nullable Range2d restriction) {
        Intrinsics.checkNotNullParameter(inputBitmap, "inputBitmap");
        validateHandle();
        ToolkitKt.validateBitmap$default("standardDeviation", inputBitmap, false, 4, null);
        return nativeAverageColorBitmap(this.nativeHandle, inputBitmap, restriction);
    }

    @JvmOverloads
    public final void blend(@NotNull BlendingMode mode, @NotNull byte[] sourceArray, @NotNull byte[] destArray, int i11, int i12) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        Intrinsics.checkNotNullParameter(sourceArray, "sourceArray");
        Intrinsics.checkNotNullParameter(destArray, "destArray");
        blend$default(this, mode, sourceArray, destArray, i11, i12, null, 32, null);
    }

    @JvmOverloads
    @NotNull
    public final Bitmap blur(@NotNull Bitmap inputBitmap, int i11) {
        Intrinsics.checkNotNullParameter(inputBitmap, "inputBitmap");
        return blur$default(this, inputBitmap, i11, null, 4, null);
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        long j11 = this.nativeHandle;
        if (j11 != 0) {
            destroyNative(j11);
        }
        this.nativeHandle = 0L;
    }

    @JvmOverloads
    @NotNull
    public final Bitmap colorMatrix(@NotNull Bitmap inputBitmap, @NotNull float[] matrix, @NotNull float[] addVector) {
        Intrinsics.checkNotNullParameter(inputBitmap, "inputBitmap");
        Intrinsics.checkNotNullParameter(matrix, "matrix");
        Intrinsics.checkNotNullParameter(addVector, "addVector");
        return colorMatrix$default(this, inputBitmap, matrix, addVector, null, 8, null);
    }

    @JvmOverloads
    @NotNull
    public final byte[] convolve(@NotNull byte[] inputArray, int i11, int i12, int i13, @NotNull float[] coefficients) {
        Intrinsics.checkNotNullParameter(inputArray, "inputArray");
        Intrinsics.checkNotNullParameter(coefficients, "coefficients");
        return convolve$default(this, inputArray, i11, i12, i13, coefficients, null, 32, null);
    }

    @NotNull
    public final float[] getGreyScaleColorMatrix() {
        return new float[]{0.299f, 0.299f, 0.299f, 0.0f, 0.587f, 0.587f, 0.587f, 0.0f, 0.114f, 0.114f, 0.114f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f};
    }

    @NotNull
    public final float[] getIdentityMatrix() {
        return new float[]{1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f};
    }

    @NotNull
    public final float[] getRgbToYuvMatrix() {
        return new float[]{0.299f, -0.14713f, 0.615f, 0.0f, 0.587f, -0.28886f, -0.51499f, 0.0f, 0.114f, 0.436f, -0.10001f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f};
    }

    @NotNull
    public final float[] getYuvToRgbMatrix() {
        return new float[]{1.0f, 1.0f, 1.0f, 0.0f, 0.0f, -0.39465f, 2.03211f, 0.0f, 1.13983f, -0.5806f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f};
    }

    @JvmOverloads
    @NotNull
    public final int[] histogram(@NotNull byte[] inputArray, int i11, int i12, int i13) {
        Intrinsics.checkNotNullParameter(inputArray, "inputArray");
        return histogram$default(this, inputArray, i11, i12, i13, null, 16, null);
    }

    @JvmOverloads
    @NotNull
    public final int[] histogramDot(@NotNull Bitmap inputBitmap, @Nullable float[] fArr) {
        Intrinsics.checkNotNullParameter(inputBitmap, "inputBitmap");
        return histogramDot$default(this, inputBitmap, fArr, null, 4, null);
    }

    @JvmOverloads
    @NotNull
    public final byte[] lut(@NotNull byte[] inputArray, int i11, int i12, @NotNull LookupTable table) {
        Intrinsics.checkNotNullParameter(inputArray, "inputArray");
        Intrinsics.checkNotNullParameter(table, "table");
        return lut$default(this, inputArray, i11, i12, table, null, 16, null);
    }

    @JvmOverloads
    @NotNull
    public final byte[] lut3d(@NotNull byte[] inputArray, int i11, int i12, @NotNull Rgba3dArray cube) {
        Intrinsics.checkNotNullParameter(inputArray, "inputArray");
        Intrinsics.checkNotNullParameter(cube, "cube");
        return lut3d$default(this, inputArray, i11, i12, cube, null, 16, null);
    }

    @JvmOverloads
    @NotNull
    public final byte[] resize(@NotNull byte[] inputArray, int i11, int i12, int i13, int i14, int i15) {
        Intrinsics.checkNotNullParameter(inputArray, "inputArray");
        return resize$default(this, inputArray, i11, i12, i13, i14, i15, null, 64, null);
    }

    public final double standardDeviation(@NotNull Bitmap inputBitmap, @Nullable Range2d restriction) {
        Intrinsics.checkNotNullParameter(inputBitmap, "inputBitmap");
        validateHandle();
        ToolkitKt.validateBitmap$default("standardDeviation", inputBitmap, false, 4, null);
        return nativeStandardDeviationBitmap(this.nativeHandle, inputBitmap, restriction);
    }

    public final double standardDeviationFast(@NotNull Bitmap inputBitmap, @Nullable Range2d restriction) {
        Intrinsics.checkNotNullParameter(inputBitmap, "inputBitmap");
        validateHandle();
        ToolkitKt.validateBitmap$default("standardDeviationFast", inputBitmap, false, 4, null);
        return nativeStandardDeviationBitmapFast(this.nativeHandle, inputBitmap, restriction);
    }

    @Nullable
    public final byte[] toNv21(@NotNull Image image) {
        Intrinsics.checkNotNullParameter(image, "image");
        validateHandle();
        byte[] bArr = new byte[(int) (image.getWidth() * image.getHeight() * 1.5f)];
        long j11 = this.nativeHandle;
        int width = image.getWidth();
        int height = image.getHeight();
        ByteBuffer buffer = image.getPlanes()[0].getBuffer();
        Intrinsics.checkNotNullExpressionValue(buffer, "getBuffer(...)");
        ByteBuffer buffer2 = image.getPlanes()[1].getBuffer();
        Intrinsics.checkNotNullExpressionValue(buffer2, "getBuffer(...)");
        ByteBuffer buffer3 = image.getPlanes()[2].getBuffer();
        Intrinsics.checkNotNullExpressionValue(buffer3, "getBuffer(...)");
        if (nativeYuv420toNv21(j11, width, height, buffer, buffer2, buffer3, image.getPlanes()[0].getPixelStride(), image.getPlanes()[1].getPixelStride(), image.getPlanes()[0].getRowStride(), image.getPlanes()[1].getRowStride(), bArr)) {
            return bArr;
        }
        return null;
    }

    @NotNull
    public final byte[] yuvToRgb(@NotNull byte[] inputArray, int sizeX, int sizeY, @NotNull YuvFormat format) {
        Intrinsics.checkNotNullParameter(inputArray, "inputArray");
        Intrinsics.checkNotNullParameter(format, "format");
        validateHandle();
        if (sizeX % 2 == 0 && sizeY % 2 == 0) {
            byte[] bArr = new byte[sizeX * sizeY * 4];
            nativeYuvToRgb(this.nativeHandle, inputArray, bArr, sizeX, sizeY, format.getValue());
            return bArr;
        }
        throw new IllegalArgumentException(("RenderScript Toolkit yuvToRgb. Non-even dimensions are not supported. " + sizeX + " and " + sizeY + " were provided.").toString());
    }

    @NotNull
    public final Bitmap yuvToRgbBitmap(@NotNull byte[] inputArray, int sizeX, int sizeY, @NotNull YuvFormat format) {
        Intrinsics.checkNotNullParameter(inputArray, "inputArray");
        Intrinsics.checkNotNullParameter(format, "format");
        validateHandle();
        if (sizeX % 2 == 0 && sizeY % 2 == 0) {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(sizeX, sizeY, Bitmap.Config.ARGB_8888);
            Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(...)");
            nativeYuvToRgbBitmap(this.nativeHandle, inputArray, sizeX, sizeY, bitmapCreateBitmap, format.getValue());
            return bitmapCreateBitmap;
        }
        throw new IllegalArgumentException(("RenderScript Toolkit yuvToRgbBitmap. Non-even dimensions are not supported. " + sizeX + " and " + sizeY + " were provided.").toString());
    }

    public Toolkit() {
        System.loadLibrary("jumio-toolkit");
        this.nativeHandle = createNative();
    }

    public static /* synthetic */ Bitmap colorMatrix$default(Toolkit toolkit, Bitmap bitmap, float[] fArr, float[] fArr2, Range2d range2d, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            fArr2 = new float[]{0.0f, 0.0f, 0.0f, 0.0f};
        }
        if ((i11 & 8) != 0) {
            range2d = null;
        }
        return toolkit.colorMatrix(bitmap, fArr, fArr2, range2d);
    }

    @JvmOverloads
    public final void blend(@NotNull BlendingMode mode, @NotNull byte[] sourceArray, @NotNull byte[] destArray, int sizeX, int sizeY, @Nullable Range2d restriction) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        Intrinsics.checkNotNullParameter(sourceArray, "sourceArray");
        Intrinsics.checkNotNullParameter(destArray, "destArray");
        validateHandle();
        int i11 = sizeX * sizeY * 4;
        if (sourceArray.length >= i11) {
            if (destArray.length >= i11) {
                ToolkitKt.validateRestriction("blend", sizeX, sizeY, restriction);
                nativeBlend(this.nativeHandle, mode.getValue(), sourceArray, destArray, sizeX, sizeY, restriction);
                return;
            }
            throw new IllegalArgumentException(("RenderScript Toolkit blend. sourceArray is too small for the given dimensions. " + sizeX + ProxyConfig.MATCH_ALL_SCHEMES + sizeY + "*4 < " + sourceArray.length + C33978va.f72339h).toString());
        }
        throw new IllegalArgumentException(("RenderScript Toolkit blend. sourceArray is too small for the given dimensions. " + sizeX + ProxyConfig.MATCH_ALL_SCHEMES + sizeY + "*4 < " + sourceArray.length + C33978va.f72339h).toString());
    }

    @JvmOverloads
    @NotNull
    public final byte[] blur(@NotNull byte[] inputArray, int i11, int i12, int i13) {
        Intrinsics.checkNotNullParameter(inputArray, "inputArray");
        return blur$default(this, inputArray, i11, i12, i13, 0, null, 48, null);
    }

    @JvmOverloads
    @NotNull
    public final byte[] colorMatrix(@NotNull byte[] inputArray, int i11, int i12, int i13, int i14, @NotNull float[] matrix) {
        Intrinsics.checkNotNullParameter(inputArray, "inputArray");
        Intrinsics.checkNotNullParameter(matrix, "matrix");
        return colorMatrix$default(this, inputArray, i11, i12, i13, i14, matrix, null, null, 192, null);
    }

    @JvmOverloads
    @NotNull
    public final byte[] convolve(@NotNull byte[] inputArray, int vectorSize, int sizeX, int sizeY, @NotNull float[] coefficients, @Nullable Range2d restriction) {
        Intrinsics.checkNotNullParameter(inputArray, "inputArray");
        Intrinsics.checkNotNullParameter(coefficients, "coefficients");
        validateHandle();
        if (1 <= vectorSize && vectorSize < 5) {
            if (inputArray.length >= sizeX * sizeY * vectorSize) {
                if (coefficients.length != 9 && coefficients.length != 25) {
                    throw new IllegalArgumentException(("RenderScript Toolkit convolve. Only 3x3 or 5x5 convolutions are supported. " + coefficients.length + " coefficients provided.").toString());
                }
                ToolkitKt.validateRestriction("convolve", sizeX, sizeY, restriction);
                byte[] bArr = new byte[inputArray.length];
                nativeConvolve(this.nativeHandle, inputArray, vectorSize, sizeX, sizeY, bArr, coefficients, restriction);
                return bArr;
            }
            throw new IllegalArgumentException(("RenderScript Toolkit convolve. inputArray is too small for the given dimensions. " + sizeX + ProxyConfig.MATCH_ALL_SCHEMES + sizeY + ProxyConfig.MATCH_ALL_SCHEMES + vectorSize + " < " + inputArray.length + C33978va.f72339h).toString());
        }
        throw new IllegalArgumentException(("RenderScript Toolkit convolve. The vectorSize should be between 1 and 4. " + vectorSize + " provided.").toString());
    }

    @JvmOverloads
    @NotNull
    public final int[] histogram(@NotNull byte[] inputArray, int vectorSize, int sizeX, int sizeY, @Nullable Range2d restriction) {
        Intrinsics.checkNotNullParameter(inputArray, "inputArray");
        validateHandle();
        if (1 <= vectorSize && vectorSize < 5) {
            if (inputArray.length >= sizeX * sizeY * vectorSize) {
                ToolkitKt.validateRestriction(C33749k7.b.f70579t, sizeX, sizeY, restriction);
                int[] iArr = new int[ToolkitKt.paddedSize(vectorSize) * 256];
                nativeHistogram(this.nativeHandle, inputArray, vectorSize, sizeX, sizeY, iArr, restriction);
                return iArr;
            }
            throw new IllegalArgumentException(("RenderScript Toolkit histogram. inputArray is too small for the given dimensions. " + sizeX + ProxyConfig.MATCH_ALL_SCHEMES + sizeY + ProxyConfig.MATCH_ALL_SCHEMES + vectorSize + " < " + inputArray.length + C33978va.f72339h).toString());
        }
        throw new IllegalArgumentException(("RenderScript Toolkit histogram. The vectorSize should be between 1 and 4. " + vectorSize + " provided.").toString());
    }

    @JvmOverloads
    @NotNull
    public final int[] histogramDot(@NotNull byte[] inputArray, int i11, int i12, int i13) {
        Intrinsics.checkNotNullParameter(inputArray, "inputArray");
        return histogramDot$default(this, inputArray, i11, i12, i13, null, null, 48, null);
    }

    @JvmOverloads
    @NotNull
    public final byte[] lut(@NotNull byte[] inputArray, int sizeX, int sizeY, @NotNull LookupTable table, @Nullable Range2d restriction) {
        Intrinsics.checkNotNullParameter(inputArray, "inputArray");
        Intrinsics.checkNotNullParameter(table, "table");
        validateHandle();
        if (inputArray.length >= sizeX * sizeY * 4) {
            ToolkitKt.validateRestriction("lut", sizeX, sizeY, restriction);
            byte[] bArr = new byte[inputArray.length];
            nativeLut(this.nativeHandle, inputArray, bArr, sizeX, sizeY, table.getRed(), table.getGreen(), table.getBlue(), table.getAlpha(), restriction);
            return bArr;
        }
        throw new IllegalArgumentException(("RenderScript Toolkit lut. inputArray is too small for the given dimensions. " + sizeX + ProxyConfig.MATCH_ALL_SCHEMES + sizeY + "*4 < " + inputArray.length + C33978va.f72339h).toString());
    }

    @JvmOverloads
    @NotNull
    public final byte[] lut3d(@NotNull byte[] inputArray, int sizeX, int sizeY, @NotNull Rgba3dArray cube, @Nullable Range2d restriction) {
        Intrinsics.checkNotNullParameter(inputArray, "inputArray");
        Intrinsics.checkNotNullParameter(cube, "cube");
        validateHandle();
        if (inputArray.length >= sizeX * sizeY * 4) {
            if (cube.getSizeX() >= 2 && cube.getSizeY() >= 2 && cube.getSizeZ() >= 2 && cube.getSizeX() <= 256 && cube.getSizeY() <= 256 && cube.getSizeZ() <= 256) {
                ToolkitKt.validateRestriction("lut3d", sizeX, sizeY, restriction);
                byte[] bArr = new byte[inputArray.length];
                nativeLut3d(this.nativeHandle, inputArray, bArr, sizeX, sizeY, cube.getValues(), cube.getSizeX(), cube.getSizeY(), cube.getSizeZ(), restriction);
                return bArr;
            }
            throw new IllegalArgumentException(("RenderScript Toolkit lut3d. The dimensions of the cube should be between 2 and 256. (" + cube.getSizeX() + ", " + cube.getSizeY() + ", " + cube.getSizeZ() + ") provided.").toString());
        }
        throw new IllegalArgumentException(("RenderScript Toolkit lut3d. inputArray is too small for the given dimensions. " + sizeX + ProxyConfig.MATCH_ALL_SCHEMES + sizeY + "*4 < " + inputArray.length + C33978va.f72339h).toString());
    }

    @JvmOverloads
    @NotNull
    public final byte[] resize(@NotNull byte[] inputArray, int vectorSize, int inputSizeX, int inputSizeY, int outputSizeX, int outputSizeY, @Nullable Range2d restriction) {
        Intrinsics.checkNotNullParameter(inputArray, "inputArray");
        validateHandle();
        if (1 <= vectorSize && vectorSize < 5) {
            if (inputArray.length >= inputSizeX * inputSizeY * vectorSize) {
                ToolkitKt.validateRestriction("resize", outputSizeX, outputSizeY, restriction);
                byte[] bArr = new byte[outputSizeX * outputSizeY * ToolkitKt.paddedSize(vectorSize)];
                nativeResize(this.nativeHandle, inputArray, vectorSize, inputSizeX, inputSizeY, bArr, outputSizeX, outputSizeY, restriction);
                return bArr;
            }
            throw new IllegalArgumentException(("RenderScript Toolkit resize. inputArray is too small for the given dimensions. " + inputSizeX + ProxyConfig.MATCH_ALL_SCHEMES + inputSizeY + ProxyConfig.MATCH_ALL_SCHEMES + vectorSize + " < " + inputArray.length + C33978va.f72339h).toString());
        }
        throw new IllegalArgumentException(("RenderScript Toolkit resize. The vectorSize should be between 1 and 4. " + vectorSize + " provided.").toString());
    }

    @JvmOverloads
    @NotNull
    public final byte[] blur(@NotNull byte[] inputArray, int i11, int i12, int i13, int i14) {
        Intrinsics.checkNotNullParameter(inputArray, "inputArray");
        return blur$default(this, inputArray, i11, i12, i13, i14, null, 32, null);
    }

    @JvmOverloads
    @NotNull
    public final byte[] colorMatrix(@NotNull byte[] inputArray, int i11, int i12, int i13, int i14, @NotNull float[] matrix, @NotNull float[] addVector) {
        Intrinsics.checkNotNullParameter(inputArray, "inputArray");
        Intrinsics.checkNotNullParameter(matrix, "matrix");
        Intrinsics.checkNotNullParameter(addVector, "addVector");
        return colorMatrix$default(this, inputArray, i11, i12, i13, i14, matrix, addVector, null, 128, null);
    }

    @JvmOverloads
    @NotNull
    public final int[] histogramDot(@NotNull byte[] inputArray, int i11, int i12, int i13, @Nullable float[] fArr) {
        Intrinsics.checkNotNullParameter(inputArray, "inputArray");
        return histogramDot$default(this, inputArray, i11, i12, i13, fArr, null, 32, null);
    }

    @JvmOverloads
    @NotNull
    public final byte[] blur(@NotNull byte[] inputArray, int vectorSize, int sizeX, int sizeY, int radius, @Nullable Range2d restriction) {
        Intrinsics.checkNotNullParameter(inputArray, "inputArray");
        validateHandle();
        if (vectorSize != 1 && vectorSize != 4) {
            throw new IllegalArgumentException(("RenderScript Toolkit blur. The vectorSize should be 1 or 4. " + vectorSize + " provided.").toString());
        }
        if (inputArray.length >= sizeX * sizeY * vectorSize) {
            if (1 <= radius && radius < 26) {
                ToolkitKt.validateRestriction("blur", sizeX, sizeY, restriction);
                byte[] bArr = new byte[inputArray.length];
                nativeBlur(this.nativeHandle, inputArray, vectorSize, sizeX, sizeY, radius, bArr, restriction);
                return bArr;
            }
            throw new IllegalArgumentException(("RenderScript Toolkit blur. The radius should be between 1 and 25. " + radius + " provided.").toString());
        }
        throw new IllegalArgumentException(("RenderScript Toolkit blur. inputArray is too small for the given dimensions. " + sizeX + ProxyConfig.MATCH_ALL_SCHEMES + sizeY + ProxyConfig.MATCH_ALL_SCHEMES + vectorSize + " < " + inputArray.length + C33978va.f72339h).toString());
    }

    @JvmOverloads
    @NotNull
    public final byte[] colorMatrix(@NotNull byte[] inputArray, int inputVectorSize, int sizeX, int sizeY, int outputVectorSize, @NotNull float[] matrix, @NotNull float[] addVector, @Nullable Range2d restriction) {
        Intrinsics.checkNotNullParameter(inputArray, "inputArray");
        Intrinsics.checkNotNullParameter(matrix, "matrix");
        Intrinsics.checkNotNullParameter(addVector, "addVector");
        validateHandle();
        if (1 > inputVectorSize || inputVectorSize >= 5) {
            throw new IllegalArgumentException(("RenderScript Toolkit colorMatrix. The inputVectorSize should be between 1 and 4. " + inputVectorSize + " provided.").toString());
        }
        if (1 <= outputVectorSize && outputVectorSize < 5) {
            int i11 = sizeX * sizeY;
            if (inputArray.length >= i11 * inputVectorSize) {
                if (matrix.length == 16) {
                    if (addVector.length == 4) {
                        ToolkitKt.validateRestriction("colorMatrix", sizeX, sizeY, restriction);
                        byte[] bArr = new byte[i11 * ToolkitKt.paddedSize(outputVectorSize)];
                        nativeColorMatrix(this.nativeHandle, inputArray, inputVectorSize, sizeX, sizeY, bArr, outputVectorSize, matrix, addVector, restriction);
                        return bArr;
                    }
                    throw new IllegalArgumentException(("RenderScript Toolkit colorMatrix. addVector should have 4 entries. " + addVector.length + " provided.").toString());
                }
                throw new IllegalArgumentException(("RenderScript Toolkit colorMatrix. matrix should have 16 entries. " + matrix.length + " provided.").toString());
            }
            throw new IllegalArgumentException(("RenderScript Toolkit colorMatrix. inputArray is too small for the given dimensions. " + sizeX + ProxyConfig.MATCH_ALL_SCHEMES + sizeY + ProxyConfig.MATCH_ALL_SCHEMES + inputVectorSize + " < " + inputArray.length + C33978va.f72339h).toString());
        }
        throw new IllegalArgumentException(("RenderScript Toolkit colorMatrix. The outputVectorSize should be between 1 and 4. " + outputVectorSize + " provided.").toString());
    }

    @JvmOverloads
    @NotNull
    public final int[] histogramDot(@NotNull byte[] inputArray, int vectorSize, int sizeX, int sizeY, @Nullable float[] coefficients, @Nullable Range2d restriction) {
        Intrinsics.checkNotNullParameter(inputArray, "inputArray");
        validateHandle();
        if (1 <= vectorSize && vectorSize < 5) {
            if (inputArray.length >= sizeX * sizeY * vectorSize) {
                ToolkitKt.validateHistogramDotCoefficients(coefficients, vectorSize);
                ToolkitKt.validateRestriction("histogramDot", sizeX, sizeY, restriction);
                int[] iArr = new int[256];
                nativeHistogramDot(this.nativeHandle, inputArray, vectorSize, sizeX, sizeY, iArr, coefficients == null ? new float[]{0.299f, 0.587f, 0.114f, 0.0f} : coefficients, restriction);
                return iArr;
            }
            throw new IllegalArgumentException(("RenderScript Toolkit histogramDot. inputArray is too small for the given dimensions. " + sizeX + ProxyConfig.MATCH_ALL_SCHEMES + sizeY + ProxyConfig.MATCH_ALL_SCHEMES + vectorSize + " < " + inputArray.length + C33978va.f72339h).toString());
        }
        throw new IllegalArgumentException(("RenderScript Toolkit histogramDot. The vectorSize should be between 1 and 4. " + vectorSize + " provided.").toString());
    }

    @JvmOverloads
    public final void blend(@NotNull BlendingMode mode, @NotNull Bitmap sourceBitmap, @NotNull Bitmap destBitmap, @Nullable Range2d restriction) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        Intrinsics.checkNotNullParameter(sourceBitmap, "sourceBitmap");
        Intrinsics.checkNotNullParameter(destBitmap, "destBitmap");
        validateHandle();
        ToolkitKt.validateBitmap$default("blend", sourceBitmap, false, 4, null);
        ToolkitKt.validateBitmap$default("blend", destBitmap, false, 4, null);
        if (sourceBitmap.getWidth() == destBitmap.getWidth() && sourceBitmap.getHeight() == destBitmap.getHeight()) {
            if (sourceBitmap.getConfig() == destBitmap.getConfig()) {
                ToolkitKt.validateRestriction("blend", sourceBitmap.getWidth(), sourceBitmap.getHeight(), restriction);
                nativeBlendBitmap(this.nativeHandle, mode.getValue(), sourceBitmap, destBitmap, restriction);
                return;
            }
            throw new IllegalArgumentException(("RenderScript Toolkit blend. Source and destination bitmaps should have the same config. " + sourceBitmap.getConfig() + " and " + destBitmap.getConfig() + " provided.").toString());
        }
        throw new IllegalArgumentException(("RenderScript Toolkit blend. Source and destination bitmaps should be the same size. " + sourceBitmap.getWidth() + "x" + sourceBitmap.getHeight() + " and " + destBitmap.getWidth() + "x" + destBitmap.getHeight() + " provided.").toString());
    }

    @JvmOverloads
    @NotNull
    public final int[] histogram(@NotNull Bitmap inputBitmap, @Nullable Range2d restriction) {
        Intrinsics.checkNotNullParameter(inputBitmap, "inputBitmap");
        validateHandle();
        ToolkitKt.validateBitmap$default(C33749k7.b.f70579t, inputBitmap, false, 4, null);
        ToolkitKt.validateRestriction(C33749k7.b.f70579t, inputBitmap, restriction);
        int[] iArr = new int[ToolkitKt.vectorSize(inputBitmap) * 256];
        nativeHistogramBitmap(this.nativeHandle, inputBitmap, iArr, restriction);
        return iArr;
    }

    @JvmOverloads
    @NotNull
    public final Bitmap resize(@NotNull Bitmap inputBitmap, int outputSizeX, int outputSizeY, @Nullable Range2d restriction) {
        Intrinsics.checkNotNullParameter(inputBitmap, "inputBitmap");
        validateHandle();
        ToolkitKt.validateBitmap$default("resize", inputBitmap, false, 4, null);
        ToolkitKt.validateRestriction("resize", outputSizeX, outputSizeY, restriction);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(outputSizeX, outputSizeY, Bitmap.Config.ARGB_8888);
        Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(...)");
        nativeResizeBitmap(this.nativeHandle, inputBitmap, bitmapCreateBitmap, restriction);
        return bitmapCreateBitmap;
    }

    @JvmOverloads
    @NotNull
    public final Bitmap lut(@NotNull Bitmap inputBitmap, @NotNull LookupTable table, @Nullable Range2d restriction) {
        Intrinsics.checkNotNullParameter(inputBitmap, "inputBitmap");
        Intrinsics.checkNotNullParameter(table, "table");
        validateHandle();
        ToolkitKt.validateBitmap$default("lut", inputBitmap, false, 4, null);
        ToolkitKt.validateRestriction("lut", inputBitmap, restriction);
        Bitmap bitmapCreateCompatibleBitmap = ToolkitKt.createCompatibleBitmap(inputBitmap);
        nativeLutBitmap(this.nativeHandle, inputBitmap, bitmapCreateCompatibleBitmap, table.getRed(), table.getGreen(), table.getBlue(), table.getAlpha(), restriction);
        return bitmapCreateCompatibleBitmap;
    }

    @JvmOverloads
    @NotNull
    public final Bitmap convolve(@NotNull Bitmap inputBitmap, @NotNull float[] coefficients, @Nullable Range2d restriction) {
        Intrinsics.checkNotNullParameter(inputBitmap, "inputBitmap");
        Intrinsics.checkNotNullParameter(coefficients, "coefficients");
        validateHandle();
        ToolkitKt.validateBitmap$default("convolve", inputBitmap, false, 4, null);
        if (coefficients.length != 9 && coefficients.length != 25) {
            throw new IllegalArgumentException(("RenderScript Toolkit convolve. Only 3x3 or 5x5 convolutions are supported. " + coefficients.length + " coefficients provided.").toString());
        }
        ToolkitKt.validateRestriction("convolve", inputBitmap, restriction);
        Bitmap bitmapCreateCompatibleBitmap = ToolkitKt.createCompatibleBitmap(inputBitmap);
        nativeConvolveBitmap(this.nativeHandle, inputBitmap, bitmapCreateCompatibleBitmap, coefficients, restriction);
        return bitmapCreateCompatibleBitmap;
    }

    @JvmOverloads
    @NotNull
    public final Bitmap lut3d(@NotNull Bitmap inputBitmap, @NotNull Rgba3dArray cube, @Nullable Range2d restriction) {
        Intrinsics.checkNotNullParameter(inputBitmap, "inputBitmap");
        Intrinsics.checkNotNullParameter(cube, "cube");
        validateHandle();
        ToolkitKt.validateBitmap$default("lut3d", inputBitmap, false, 4, null);
        ToolkitKt.validateRestriction("lut3d", inputBitmap, restriction);
        Bitmap bitmapCreateCompatibleBitmap = ToolkitKt.createCompatibleBitmap(inputBitmap);
        nativeLut3dBitmap(this.nativeHandle, inputBitmap, bitmapCreateCompatibleBitmap, cube.getValues(), cube.getSizeX(), cube.getSizeY(), cube.getSizeZ(), restriction);
        return bitmapCreateCompatibleBitmap;
    }

    @JvmOverloads
    @NotNull
    public final int[] histogramDot(@NotNull Bitmap inputBitmap, @Nullable float[] coefficients, @Nullable Range2d restriction) {
        Intrinsics.checkNotNullParameter(inputBitmap, "inputBitmap");
        validateHandle();
        ToolkitKt.validateBitmap$default("histogramDot", inputBitmap, false, 4, null);
        ToolkitKt.validateHistogramDotCoefficients(coefficients, ToolkitKt.vectorSize(inputBitmap));
        ToolkitKt.validateRestriction("histogramDot", inputBitmap, restriction);
        int[] iArr = new int[256];
        if (coefficients == null) {
            coefficients = new float[]{0.299f, 0.587f, 0.114f, 0.0f};
        }
        nativeHistogramDotBitmap(this.nativeHandle, inputBitmap, iArr, coefficients, restriction);
        return iArr;
    }

    @JvmOverloads
    @NotNull
    public final Bitmap blur(@NotNull Bitmap inputBitmap, int radius, @Nullable Range2d restriction) {
        Intrinsics.checkNotNullParameter(inputBitmap, "inputBitmap");
        validateHandle();
        ToolkitKt.validateBitmap$default("blur", inputBitmap, false, 4, null);
        if (1 <= radius && radius < 26) {
            ToolkitKt.validateRestriction("blur", inputBitmap.getWidth(), inputBitmap.getHeight(), restriction);
            Bitmap bitmapCreateCompatibleBitmap = ToolkitKt.createCompatibleBitmap(inputBitmap);
            nativeBlurBitmap(this.nativeHandle, inputBitmap, bitmapCreateCompatibleBitmap, radius, restriction);
            return bitmapCreateCompatibleBitmap;
        }
        throw new IllegalArgumentException(("RenderScript Toolkit blur. The radius should be between 1 and 25. " + radius + " provided.").toString());
    }

    @JvmOverloads
    @NotNull
    public final Bitmap colorMatrix(@NotNull Bitmap inputBitmap, @NotNull float[] matrix, @NotNull float[] addVector, @Nullable Range2d restriction) {
        Intrinsics.checkNotNullParameter(inputBitmap, "inputBitmap");
        Intrinsics.checkNotNullParameter(matrix, "matrix");
        Intrinsics.checkNotNullParameter(addVector, "addVector");
        validateHandle();
        ToolkitKt.validateBitmap$default("colorMatrix", inputBitmap, false, 4, null);
        if (matrix.length == 16) {
            if (addVector.length == 4) {
                ToolkitKt.validateRestriction("colorMatrix", inputBitmap.getWidth(), inputBitmap.getHeight(), restriction);
                Bitmap bitmapCreateCompatibleBitmap = ToolkitKt.createCompatibleBitmap(inputBitmap);
                nativeColorMatrixBitmap(this.nativeHandle, inputBitmap, bitmapCreateCompatibleBitmap, matrix, addVector, restriction);
                return bitmapCreateCompatibleBitmap;
            }
            throw new IllegalArgumentException("RenderScript Toolkit colorMatrix. addVector should have 4 entries.");
        }
        throw new IllegalArgumentException(("RenderScript Toolkit colorMatrix. matrix should have 16 entries. " + matrix.length + " provided.").toString());
    }
}
