package p852kotlin.ranges;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.exifinterface.media.ExifInterface;
import androidx.media3.exoplayer.rtsp.SessionDescription;
import java.util.NoSuchElementException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Deprecated;
import p852kotlin.DeprecatedSinceKotlin;
import p852kotlin.ExperimentalStdlibApi;
import p852kotlin.Metadata;
import p852kotlin.SinceKotlin;
import p852kotlin.WasExperimental;
import p852kotlin.internal.InlineOnly;
import p852kotlin.jvm.JvmName;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.random.Random;
import p852kotlin.random.RandomKt;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: compiled from: _Ranges.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000r\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\u0010\f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\n\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\u000f\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0007\u001a\f\u0010\u0000\u001a\u00020\u0003*\u00020\u0004H\u0007\u001a\f\u0010\u0000\u001a\u00020\u0005*\u00020\u0006H\u0007\u001a\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\u0007¢\u0006\u0002\u0010\b\u001a\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003*\u00020\u0004H\u0007¢\u0006\u0002\u0010\t\u001a\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005*\u00020\u0006H\u0007¢\u0006\u0002\u0010\n\u001a\f\u0010\u000b\u001a\u00020\u0001*\u00020\u0002H\u0007\u001a\f\u0010\u000b\u001a\u00020\u0003*\u00020\u0004H\u0007\u001a\f\u0010\u000b\u001a\u00020\u0005*\u00020\u0006H\u0007\u001a\u0013\u0010\f\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\u0007¢\u0006\u0002\u0010\b\u001a\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003*\u00020\u0004H\u0007¢\u0006\u0002\u0010\t\u001a\u0013\u0010\f\u001a\u0004\u0018\u00010\u0005*\u00020\u0006H\u0007¢\u0006\u0002\u0010\n\u001a\r\u0010\r\u001a\u00020\u0001*\u00020\u000eH\u0087\b\u001a\r\u0010\r\u001a\u00020\u0003*\u00020\u000fH\u0087\b\u001a\r\u0010\r\u001a\u00020\u0005*\u00020\u0010H\u0087\b\u001a\u0014\u0010\r\u001a\u00020\u0001*\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0011H\u0007\u001a\u0014\u0010\r\u001a\u00020\u0003*\u00020\u000f2\u0006\u0010\r\u001a\u00020\u0011H\u0007\u001a\u0014\u0010\r\u001a\u00020\u0005*\u00020\u00102\u0006\u0010\r\u001a\u00020\u0011H\u0007\u001a\u0014\u0010\u0012\u001a\u0004\u0018\u00010\u0001*\u00020\u000eH\u0087\b¢\u0006\u0002\u0010\u0013\u001a\u0014\u0010\u0012\u001a\u0004\u0018\u00010\u0003*\u00020\u000fH\u0087\b¢\u0006\u0002\u0010\u0014\u001a\u0014\u0010\u0012\u001a\u0004\u0018\u00010\u0005*\u00020\u0010H\u0087\b¢\u0006\u0002\u0010\u0015\u001a\u001b\u0010\u0012\u001a\u0004\u0018\u00010\u0001*\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0011H\u0007¢\u0006\u0002\u0010\u0016\u001a\u001b\u0010\u0012\u001a\u0004\u0018\u00010\u0003*\u00020\u000f2\u0006\u0010\r\u001a\u00020\u0011H\u0007¢\u0006\u0002\u0010\u0017\u001a\u001b\u0010\u0012\u001a\u0004\u0018\u00010\u0005*\u00020\u00102\u0006\u0010\r\u001a\u00020\u0011H\u0007¢\u0006\u0002\u0010\u0018\u001a\u001c\u0010\u0019\u001a\u00020\u001a*\u00020\u000e2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001H\u0087\n¢\u0006\u0002\u0010\u001c\u001a\u001c\u0010\u0019\u001a\u00020\u001a*\u00020\u000f2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0003H\u0087\n¢\u0006\u0002\u0010\u001d\u001a\u001c\u0010\u0019\u001a\u00020\u001a*\u00020\u00102\b\u0010\u001b\u001a\u0004\u0018\u00010\u0005H\u0087\n¢\u0006\u0002\u0010\u001e\u001a \u0010\u0019\u001a\u00020\u001a*\b\u0012\u0004\u0012\u00020\u00010\u001f2\u0006\u0010 \u001a\u00020!H\u0087\u0002¢\u0006\u0002\b\"\u001a \u0010\u0019\u001a\u00020\u001a*\b\u0012\u0004\u0012\u00020\u00030\u001f2\u0006\u0010 \u001a\u00020!H\u0087\u0002¢\u0006\u0002\b#\u001a \u0010\u0019\u001a\u00020\u001a*\b\u0012\u0004\u0012\u00020$0\u001f2\u0006\u0010 \u001a\u00020!H\u0087\u0002¢\u0006\u0002\b%\u001a \u0010\u0019\u001a\u00020\u001a*\b\u0012\u0004\u0012\u00020&0\u001f2\u0006\u0010 \u001a\u00020!H\u0087\u0002¢\u0006\u0002\b'\u001a \u0010\u0019\u001a\u00020\u001a*\b\u0012\u0004\u0012\u00020(0\u001f2\u0006\u0010 \u001a\u00020!H\u0087\u0002¢\u0006\u0002\b)\u001a \u0010\u0019\u001a\u00020\u001a*\b\u0012\u0004\u0012\u00020\u00010*2\u0006\u0010 \u001a\u00020!H\u0087\u0002¢\u0006\u0002\b\"\u001a \u0010\u0019\u001a\u00020\u001a*\b\u0012\u0004\u0012\u00020\u00030*2\u0006\u0010 \u001a\u00020!H\u0087\u0002¢\u0006\u0002\b#\u001a \u0010\u0019\u001a\u00020\u001a*\b\u0012\u0004\u0012\u00020$0*2\u0006\u0010 \u001a\u00020!H\u0087\u0002¢\u0006\u0002\b%\u001a\u0015\u0010\u0019\u001a\u00020\u001a*\u00020\u000e2\u0006\u0010 \u001a\u00020!H\u0087\n\u001a\u0015\u0010\u0019\u001a\u00020\u001a*\u00020\u000f2\u0006\u0010 \u001a\u00020!H\u0087\n\u001a \u0010\u0019\u001a\u00020\u001a*\b\u0012\u0004\u0012\u00020\u00010\u001f2\u0006\u0010 \u001a\u00020&H\u0087\u0002¢\u0006\u0002\b\"\u001a \u0010\u0019\u001a\u00020\u001a*\b\u0012\u0004\u0012\u00020\u00030\u001f2\u0006\u0010 \u001a\u00020&H\u0087\u0002¢\u0006\u0002\b#\u001a \u0010\u0019\u001a\u00020\u001a*\b\u0012\u0004\u0012\u00020!0\u001f2\u0006\u0010 \u001a\u00020&H\u0087\u0002¢\u0006\u0002\b+\u001a \u0010\u0019\u001a\u00020\u001a*\b\u0012\u0004\u0012\u00020$0\u001f2\u0006\u0010 \u001a\u00020&H\u0087\u0002¢\u0006\u0002\b%\u001a \u0010\u0019\u001a\u00020\u001a*\b\u0012\u0004\u0012\u00020(0\u001f2\u0006\u0010 \u001a\u00020&H\u0087\u0002¢\u0006\u0002\b)\u001a \u0010\u0019\u001a\u00020\u001a*\b\u0012\u0004\u0012\u00020\u00010\u001f2\u0006\u0010 \u001a\u00020(H\u0087\u0002¢\u0006\u0002\b\"\u001a \u0010\u0019\u001a\u00020\u001a*\b\u0012\u0004\u0012\u00020\u00030\u001f2\u0006\u0010 \u001a\u00020(H\u0087\u0002¢\u0006\u0002\b#\u001a \u0010\u0019\u001a\u00020\u001a*\b\u0012\u0004\u0012\u00020!0\u001f2\u0006\u0010 \u001a\u00020(H\u0087\u0002¢\u0006\u0002\b+\u001a \u0010\u0019\u001a\u00020\u001a*\b\u0012\u0004\u0012\u00020$0\u001f2\u0006\u0010 \u001a\u00020(H\u0087\u0002¢\u0006\u0002\b%\u001a \u0010\u0019\u001a\u00020\u001a*\b\u0012\u0004\u0012\u00020&0\u001f2\u0006\u0010 \u001a\u00020(H\u0087\u0002¢\u0006\u0002\b'\u001a \u0010\u0019\u001a\u00020\u001a*\b\u0012\u0004\u0012\u00020&0*2\u0006\u0010 \u001a\u00020(H\u0087\u0002¢\u0006\u0002\b'\u001a \u0010\u0019\u001a\u00020\u001a*\b\u0012\u0004\u0012\u00020\u00030\u001f2\u0006\u0010 \u001a\u00020\u0001H\u0087\u0002¢\u0006\u0002\b#\u001a \u0010\u0019\u001a\u00020\u001a*\b\u0012\u0004\u0012\u00020!0\u001f2\u0006\u0010 \u001a\u00020\u0001H\u0087\u0002¢\u0006\u0002\b+\u001a \u0010\u0019\u001a\u00020\u001a*\b\u0012\u0004\u0012\u00020$0\u001f2\u0006\u0010 \u001a\u00020\u0001H\u0087\u0002¢\u0006\u0002\b%\u001a \u0010\u0019\u001a\u00020\u001a*\b\u0012\u0004\u0012\u00020&0\u001f2\u0006\u0010 \u001a\u00020\u0001H\u0087\u0002¢\u0006\u0002\b'\u001a \u0010\u0019\u001a\u00020\u001a*\b\u0012\u0004\u0012\u00020(0\u001f2\u0006\u0010 \u001a\u00020\u0001H\u0087\u0002¢\u0006\u0002\b)\u001a \u0010\u0019\u001a\u00020\u001a*\b\u0012\u0004\u0012\u00020\u00030*2\u0006\u0010 \u001a\u00020\u0001H\u0087\u0002¢\u0006\u0002\b#\u001a \u0010\u0019\u001a\u00020\u001a*\b\u0012\u0004\u0012\u00020!0*2\u0006\u0010 \u001a\u00020\u0001H\u0087\u0002¢\u0006\u0002\b+\u001a \u0010\u0019\u001a\u00020\u001a*\b\u0012\u0004\u0012\u00020$0*2\u0006\u0010 \u001a\u00020\u0001H\u0087\u0002¢\u0006\u0002\b%\u001a\u0015\u0010\u0019\u001a\u00020\u001a*\u00020\u000f2\u0006\u0010 \u001a\u00020\u0001H\u0087\n\u001a \u0010\u0019\u001a\u00020\u001a*\b\u0012\u0004\u0012\u00020\u00010\u001f2\u0006\u0010 \u001a\u00020\u0003H\u0087\u0002¢\u0006\u0002\b\"\u001a \u0010\u0019\u001a\u00020\u001a*\b\u0012\u0004\u0012\u00020!0\u001f2\u0006\u0010 \u001a\u00020\u0003H\u0087\u0002¢\u0006\u0002\b+\u001a \u0010\u0019\u001a\u00020\u001a*\b\u0012\u0004\u0012\u00020$0\u001f2\u0006\u0010 \u001a\u00020\u0003H\u0087\u0002¢\u0006\u0002\b%\u001a \u0010\u0019\u001a\u00020\u001a*\b\u0012\u0004\u0012\u00020&0\u001f2\u0006\u0010 \u001a\u00020\u0003H\u0087\u0002¢\u0006\u0002\b'\u001a \u0010\u0019\u001a\u00020\u001a*\b\u0012\u0004\u0012\u00020(0\u001f2\u0006\u0010 \u001a\u00020\u0003H\u0087\u0002¢\u0006\u0002\b)\u001a \u0010\u0019\u001a\u00020\u001a*\b\u0012\u0004\u0012\u00020\u00010*2\u0006\u0010 \u001a\u00020\u0003H\u0087\u0002¢\u0006\u0002\b\"\u001a \u0010\u0019\u001a\u00020\u001a*\b\u0012\u0004\u0012\u00020!0*2\u0006\u0010 \u001a\u00020\u0003H\u0087\u0002¢\u0006\u0002\b+\u001a \u0010\u0019\u001a\u00020\u001a*\b\u0012\u0004\u0012\u00020$0*2\u0006\u0010 \u001a\u00020\u0003H\u0087\u0002¢\u0006\u0002\b%\u001a\u0015\u0010\u0019\u001a\u00020\u001a*\u00020\u000e2\u0006\u0010 \u001a\u00020\u0003H\u0087\n\u001a \u0010\u0019\u001a\u00020\u001a*\b\u0012\u0004\u0012\u00020\u00010\u001f2\u0006\u0010 \u001a\u00020$H\u0087\u0002¢\u0006\u0002\b\"\u001a \u0010\u0019\u001a\u00020\u001a*\b\u0012\u0004\u0012\u00020\u00030\u001f2\u0006\u0010 \u001a\u00020$H\u0087\u0002¢\u0006\u0002\b#\u001a \u0010\u0019\u001a\u00020\u001a*\b\u0012\u0004\u0012\u00020!0\u001f2\u0006\u0010 \u001a\u00020$H\u0087\u0002¢\u0006\u0002\b+\u001a \u0010\u0019\u001a\u00020\u001a*\b\u0012\u0004\u0012\u00020&0\u001f2\u0006\u0010 \u001a\u00020$H\u0087\u0002¢\u0006\u0002\b'\u001a \u0010\u0019\u001a\u00020\u001a*\b\u0012\u0004\u0012\u00020(0\u001f2\u0006\u0010 \u001a\u00020$H\u0087\u0002¢\u0006\u0002\b)\u001a \u0010\u0019\u001a\u00020\u001a*\b\u0012\u0004\u0012\u00020\u00010*2\u0006\u0010 \u001a\u00020$H\u0087\u0002¢\u0006\u0002\b\"\u001a \u0010\u0019\u001a\u00020\u001a*\b\u0012\u0004\u0012\u00020\u00030*2\u0006\u0010 \u001a\u00020$H\u0087\u0002¢\u0006\u0002\b#\u001a \u0010\u0019\u001a\u00020\u001a*\b\u0012\u0004\u0012\u00020!0*2\u0006\u0010 \u001a\u00020$H\u0087\u0002¢\u0006\u0002\b+\u001a\u0015\u0010\u0019\u001a\u00020\u001a*\u00020\u000e2\u0006\u0010 \u001a\u00020$H\u0087\n\u001a\u0015\u0010\u0019\u001a\u00020\u001a*\u00020\u000f2\u0006\u0010 \u001a\u00020$H\u0087\n\u001a\u0015\u0010,\u001a\u00020\u0002*\u00020\u00012\u0006\u0010-\u001a\u00020!H\u0086\u0004\u001a\u0015\u0010,\u001a\u00020\u0004*\u00020\u00032\u0006\u0010-\u001a\u00020!H\u0086\u0004\u001a\u0015\u0010,\u001a\u00020\u0002*\u00020!2\u0006\u0010-\u001a\u00020!H\u0086\u0004\u001a\u0015\u0010,\u001a\u00020\u0002*\u00020$2\u0006\u0010-\u001a\u00020!H\u0086\u0004\u001a\u0015\u0010,\u001a\u00020\u0006*\u00020\u00052\u0006\u0010-\u001a\u00020\u0005H\u0086\u0004\u001a\u0015\u0010,\u001a\u00020\u0002*\u00020\u00012\u0006\u0010-\u001a\u00020\u0001H\u0086\u0004\u001a\u0015\u0010,\u001a\u00020\u0004*\u00020\u00032\u0006\u0010-\u001a\u00020\u0001H\u0086\u0004\u001a\u0015\u0010,\u001a\u00020\u0002*\u00020!2\u0006\u0010-\u001a\u00020\u0001H\u0086\u0004\u001a\u0015\u0010,\u001a\u00020\u0002*\u00020$2\u0006\u0010-\u001a\u00020\u0001H\u0086\u0004\u001a\u0015\u0010,\u001a\u00020\u0004*\u00020\u00012\u0006\u0010-\u001a\u00020\u0003H\u0086\u0004\u001a\u0015\u0010,\u001a\u00020\u0004*\u00020\u00032\u0006\u0010-\u001a\u00020\u0003H\u0086\u0004\u001a\u0015\u0010,\u001a\u00020\u0004*\u00020!2\u0006\u0010-\u001a\u00020\u0003H\u0086\u0004\u001a\u0015\u0010,\u001a\u00020\u0004*\u00020$2\u0006\u0010-\u001a\u00020\u0003H\u0086\u0004\u001a\u0015\u0010,\u001a\u00020\u0002*\u00020\u00012\u0006\u0010-\u001a\u00020$H\u0086\u0004\u001a\u0015\u0010,\u001a\u00020\u0004*\u00020\u00032\u0006\u0010-\u001a\u00020$H\u0086\u0004\u001a\u0015\u0010,\u001a\u00020\u0002*\u00020!2\u0006\u0010-\u001a\u00020$H\u0086\u0004\u001a\u0015\u0010,\u001a\u00020\u0002*\u00020$2\u0006\u0010-\u001a\u00020$H\u0086\u0004\u001a\n\u0010.\u001a\u00020\u0002*\u00020\u0002\u001a\n\u0010.\u001a\u00020\u0004*\u00020\u0004\u001a\n\u0010.\u001a\u00020\u0006*\u00020\u0006\u001a\u0015\u0010/\u001a\u00020\u0002*\u00020\u00022\u0006\u0010/\u001a\u00020\u0001H\u0086\u0004\u001a\u0015\u0010/\u001a\u00020\u0004*\u00020\u00042\u0006\u0010/\u001a\u00020\u0003H\u0086\u0004\u001a\u0015\u0010/\u001a\u00020\u0006*\u00020\u00062\u0006\u0010/\u001a\u00020\u0001H\u0086\u0004\u001a\u0013\u00100\u001a\u0004\u0018\u00010!*\u00020\u0001H\u0000¢\u0006\u0002\u00101\u001a\u0013\u00100\u001a\u0004\u0018\u00010!*\u00020\u0003H\u0000¢\u0006\u0002\u00102\u001a\u0013\u00100\u001a\u0004\u0018\u00010!*\u00020$H\u0000¢\u0006\u0002\u00103\u001a\u0013\u00100\u001a\u0004\u0018\u00010!*\u00020&H\u0000¢\u0006\u0002\u00104\u001a\u0013\u00100\u001a\u0004\u0018\u00010!*\u00020(H\u0000¢\u0006\u0002\u00105\u001a\u0013\u00106\u001a\u0004\u0018\u00010\u0001*\u00020\u0003H\u0000¢\u0006\u0002\u00107\u001a\u0013\u00106\u001a\u0004\u0018\u00010\u0001*\u00020&H\u0000¢\u0006\u0002\u00108\u001a\u0013\u00106\u001a\u0004\u0018\u00010\u0001*\u00020(H\u0000¢\u0006\u0002\u00109\u001a\u0013\u0010:\u001a\u0004\u0018\u00010\u0003*\u00020&H\u0000¢\u0006\u0002\u0010;\u001a\u0013\u0010:\u001a\u0004\u0018\u00010\u0003*\u00020(H\u0000¢\u0006\u0002\u0010<\u001a\u0013\u0010=\u001a\u0004\u0018\u00010$*\u00020\u0001H\u0000¢\u0006\u0002\u0010>\u001a\u0013\u0010=\u001a\u0004\u0018\u00010$*\u00020\u0003H\u0000¢\u0006\u0002\u0010?\u001a\u0013\u0010=\u001a\u0004\u0018\u00010$*\u00020&H\u0000¢\u0006\u0002\u0010@\u001a\u0013\u0010=\u001a\u0004\u0018\u00010$*\u00020(H\u0000¢\u0006\u0002\u0010A\u001a\u0015\u0010B\u001a\u00020\u000e*\u00020\u00012\u0006\u0010-\u001a\u00020!H\u0086\u0004\u001a\u0015\u0010B\u001a\u00020\u000f*\u00020\u00032\u0006\u0010-\u001a\u00020!H\u0086\u0004\u001a\u0015\u0010B\u001a\u00020\u000e*\u00020!2\u0006\u0010-\u001a\u00020!H\u0086\u0004\u001a\u0015\u0010B\u001a\u00020\u000e*\u00020$2\u0006\u0010-\u001a\u00020!H\u0086\u0004\u001a\u0015\u0010B\u001a\u00020\u0010*\u00020\u00052\u0006\u0010-\u001a\u00020\u0005H\u0086\u0004\u001a\u0015\u0010B\u001a\u00020\u000e*\u00020\u00012\u0006\u0010-\u001a\u00020\u0001H\u0086\u0004\u001a\u0015\u0010B\u001a\u00020\u000f*\u00020\u00032\u0006\u0010-\u001a\u00020\u0001H\u0086\u0004\u001a\u0015\u0010B\u001a\u00020\u000e*\u00020!2\u0006\u0010-\u001a\u00020\u0001H\u0086\u0004\u001a\u0015\u0010B\u001a\u00020\u000e*\u00020$2\u0006\u0010-\u001a\u00020\u0001H\u0086\u0004\u001a\u0015\u0010B\u001a\u00020\u000f*\u00020\u00012\u0006\u0010-\u001a\u00020\u0003H\u0086\u0004\u001a\u0015\u0010B\u001a\u00020\u000f*\u00020\u00032\u0006\u0010-\u001a\u00020\u0003H\u0086\u0004\u001a\u0015\u0010B\u001a\u00020\u000f*\u00020!2\u0006\u0010-\u001a\u00020\u0003H\u0086\u0004\u001a\u0015\u0010B\u001a\u00020\u000f*\u00020$2\u0006\u0010-\u001a\u00020\u0003H\u0086\u0004\u001a\u0015\u0010B\u001a\u00020\u000e*\u00020\u00012\u0006\u0010-\u001a\u00020$H\u0086\u0004\u001a\u0015\u0010B\u001a\u00020\u000f*\u00020\u00032\u0006\u0010-\u001a\u00020$H\u0086\u0004\u001a\u0015\u0010B\u001a\u00020\u000e*\u00020!2\u0006\u0010-\u001a\u00020$H\u0086\u0004\u001a\u0015\u0010B\u001a\u00020\u000e*\u00020$2\u0006\u0010-\u001a\u00020$H\u0086\u0004\u001a'\u0010C\u001a\u0002HD\"\u000e\b\u0000\u0010D*\b\u0012\u0004\u0012\u0002HD0E*\u0002HD2\u0006\u0010F\u001a\u0002HD¢\u0006\u0002\u0010G\u001a\u0012\u0010C\u001a\u00020!*\u00020!2\u0006\u0010F\u001a\u00020!\u001a\u0012\u0010C\u001a\u00020$*\u00020$2\u0006\u0010F\u001a\u00020$\u001a\u0012\u0010C\u001a\u00020\u0001*\u00020\u00012\u0006\u0010F\u001a\u00020\u0001\u001a\u0012\u0010C\u001a\u00020\u0003*\u00020\u00032\u0006\u0010F\u001a\u00020\u0003\u001a\u0012\u0010C\u001a\u00020(*\u00020(2\u0006\u0010F\u001a\u00020(\u001a\u0012\u0010C\u001a\u00020&*\u00020&2\u0006\u0010F\u001a\u00020&\u001a'\u0010H\u001a\u0002HD\"\u000e\b\u0000\u0010D*\b\u0012\u0004\u0012\u0002HD0E*\u0002HD2\u0006\u0010I\u001a\u0002HD¢\u0006\u0002\u0010G\u001a\u0012\u0010H\u001a\u00020!*\u00020!2\u0006\u0010I\u001a\u00020!\u001a\u0012\u0010H\u001a\u00020$*\u00020$2\u0006\u0010I\u001a\u00020$\u001a\u0012\u0010H\u001a\u00020\u0001*\u00020\u00012\u0006\u0010I\u001a\u00020\u0001\u001a\u0012\u0010H\u001a\u00020\u0003*\u00020\u00032\u0006\u0010I\u001a\u00020\u0003\u001a\u0012\u0010H\u001a\u00020(*\u00020(2\u0006\u0010I\u001a\u00020(\u001a\u0012\u0010H\u001a\u00020&*\u00020&2\u0006\u0010I\u001a\u00020&\u001a3\u0010J\u001a\u0002HD\"\u000e\b\u0000\u0010D*\b\u0012\u0004\u0012\u0002HD0E*\u0002HD2\b\u0010F\u001a\u0004\u0018\u0001HD2\b\u0010I\u001a\u0004\u0018\u0001HD¢\u0006\u0002\u0010K\u001a\u001a\u0010J\u001a\u00020!*\u00020!2\u0006\u0010F\u001a\u00020!2\u0006\u0010I\u001a\u00020!\u001a\u001a\u0010J\u001a\u00020$*\u00020$2\u0006\u0010F\u001a\u00020$2\u0006\u0010I\u001a\u00020$\u001a\u001a\u0010J\u001a\u00020\u0001*\u00020\u00012\u0006\u0010F\u001a\u00020\u00012\u0006\u0010I\u001a\u00020\u0001\u001a\u001a\u0010J\u001a\u00020\u0003*\u00020\u00032\u0006\u0010F\u001a\u00020\u00032\u0006\u0010I\u001a\u00020\u0003\u001a\u001a\u0010J\u001a\u00020(*\u00020(2\u0006\u0010F\u001a\u00020(2\u0006\u0010I\u001a\u00020(\u001a\u001a\u0010J\u001a\u00020&*\u00020&2\u0006\u0010F\u001a\u00020&2\u0006\u0010I\u001a\u00020&\u001a/\u0010J\u001a\u0002HD\"\u000e\b\u0000\u0010D*\b\u0012\u0004\u0012\u0002HD0E*\u0002HD2\f\u0010L\u001a\b\u0012\u0004\u0012\u0002HD0MH\u0007¢\u0006\u0002\u0010N\u001a-\u0010J\u001a\u0002HD\"\u000e\b\u0000\u0010D*\b\u0012\u0004\u0012\u0002HD0E*\u0002HD2\f\u0010L\u001a\b\u0012\u0004\u0012\u0002HD0\u001f¢\u0006\u0002\u0010O\u001a\u0018\u0010J\u001a\u00020\u0001*\u00020\u00012\f\u0010L\u001a\b\u0012\u0004\u0012\u00020\u00010\u001f\u001a\u0018\u0010J\u001a\u00020\u0003*\u00020\u00032\f\u0010L\u001a\b\u0012\u0004\u0012\u00020\u00030\u001f¨\u0006P"}, m90084d2 = {"first", "", "Lkotlin/ranges/IntProgression;", "", "Lkotlin/ranges/LongProgression;", "", "Lkotlin/ranges/CharProgression;", "firstOrNull", "(Lkotlin/ranges/IntProgression;)Ljava/lang/Integer;", "(Lkotlin/ranges/LongProgression;)Ljava/lang/Long;", "(Lkotlin/ranges/CharProgression;)Ljava/lang/Character;", "last", "lastOrNull", "random", "Lkotlin/ranges/IntRange;", "Lkotlin/ranges/LongRange;", "Lkotlin/ranges/CharRange;", "Lkotlin/random/Random;", "randomOrNull", "(Lkotlin/ranges/IntRange;)Ljava/lang/Integer;", "(Lkotlin/ranges/LongRange;)Ljava/lang/Long;", "(Lkotlin/ranges/CharRange;)Ljava/lang/Character;", "(Lkotlin/ranges/IntRange;Lkotlin/random/Random;)Ljava/lang/Integer;", "(Lkotlin/ranges/LongRange;Lkotlin/random/Random;)Ljava/lang/Long;", "(Lkotlin/ranges/CharRange;Lkotlin/random/Random;)Ljava/lang/Character;", "contains", "", "element", "(Lkotlin/ranges/IntRange;Ljava/lang/Integer;)Z", "(Lkotlin/ranges/LongRange;Ljava/lang/Long;)Z", "(Lkotlin/ranges/CharRange;Ljava/lang/Character;)Z", "Lkotlin/ranges/ClosedRange;", "value", "", "intRangeContains", "longRangeContains", "", "shortRangeContains", "", "doubleRangeContains", "", "floatRangeContains", "Lkotlin/ranges/OpenEndRange;", "byteRangeContains", "downTo", TypedValues.TransitionType.S_TO, "reversed", "step", "toByteExactOrNull", "(I)Ljava/lang/Byte;", "(J)Ljava/lang/Byte;", "(S)Ljava/lang/Byte;", "(D)Ljava/lang/Byte;", "(F)Ljava/lang/Byte;", "toIntExactOrNull", "(J)Ljava/lang/Integer;", "(D)Ljava/lang/Integer;", "(F)Ljava/lang/Integer;", "toLongExactOrNull", "(D)Ljava/lang/Long;", "(F)Ljava/lang/Long;", "toShortExactOrNull", "(I)Ljava/lang/Short;", "(J)Ljava/lang/Short;", "(D)Ljava/lang/Short;", "(F)Ljava/lang/Short;", "until", "coerceAtLeast", ExifInterface.GPS_DIRECTION_TRUE, "", "minimumValue", "(Ljava/lang/Comparable;Ljava/lang/Comparable;)Ljava/lang/Comparable;", "coerceAtMost", "maximumValue", "coerceIn", "(Ljava/lang/Comparable;Ljava/lang/Comparable;Ljava/lang/Comparable;)Ljava/lang/Comparable;", SessionDescription.ATTR_RANGE, "Lkotlin/ranges/ClosedFloatingPointRange;", "(Ljava/lang/Comparable;Lkotlin/ranges/ClosedFloatingPointRange;)Ljava/lang/Comparable;", "(Ljava/lang/Comparable;Lkotlin/ranges/ClosedRange;)Ljava/lang/Comparable;", "kotlin-stdlib"}, m90085k = 5, m90086mv = {2, 2, 0}, m90088xi = 49, m90089xs = "kotlin/ranges/RangesKt")
@SourceDebugExtension({"SMAP\n_Ranges.kt\nKotlin\n*S Kotlin\n*F\n+ 1 _Ranges.kt\nkotlin/ranges/RangesKt___RangesKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1572:1\n1#2:1573\n*E\n"})
public class RangesKt___RangesKt extends RangesKt__RangesKt {
    @Deprecated(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @DeprecatedSinceKotlin(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    @JvmName(name = "byteRangeContains")
    public static final /* synthetic */ boolean byteRangeContains(ClosedRange closedRange, double d11) {
        Intrinsics.checkNotNullParameter(closedRange, "<this>");
        Byte byteExactOrNull = toByteExactOrNull(d11);
        if (byteExactOrNull != null) {
            return closedRange.contains(byteExactOrNull);
        }
        return false;
    }

    public static final byte coerceAtLeast(byte b11, byte b12) {
        return b11 < b12 ? b12 : b11;
    }

    public static final byte coerceAtMost(byte b11, byte b12) {
        return b11 > b12 ? b12 : b11;
    }

    @NotNull
    public static <T extends Comparable<? super T>> T coerceIn(@NotNull T t11, @Nullable T t12, @Nullable T t13) {
        Intrinsics.checkNotNullParameter(t11, "<this>");
        if (t12 == null || t13 == null) {
            if (t12 != null && t11.compareTo(t12) < 0) {
                return t12;
            }
            if (t13 != null && t11.compareTo(t13) > 0) {
                return t13;
            }
        } else {
            if (t12.compareTo(t13) > 0) {
                throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + t13 + " is less than minimum " + t12 + '.');
            }
            if (t11.compareTo(t12) < 0) {
                return t12;
            }
            if (t11.compareTo(t13) > 0) {
                return t13;
            }
        }
        return t11;
    }

    @SinceKotlin(version = "1.3")
    @InlineOnly
    private static final boolean contains(IntRange intRange, Integer num) {
        Intrinsics.checkNotNullParameter(intRange, "<this>");
        return num != null && intRange.contains(num.intValue());
    }

    @Deprecated(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @DeprecatedSinceKotlin(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    @JvmName(name = "doubleRangeContains")
    public static final /* synthetic */ boolean doubleRangeContains(ClosedRange closedRange, byte b11) {
        Intrinsics.checkNotNullParameter(closedRange, "<this>");
        return closedRange.contains(Double.valueOf(b11));
    }

    @NotNull
    public static final IntProgression downTo(int i11, byte b11) {
        return IntProgression.INSTANCE.fromClosedRange(i11, b11, -1);
    }

    @SinceKotlin(version = "1.7")
    public static final int first(@NotNull IntProgression intProgression) {
        Intrinsics.checkNotNullParameter(intProgression, "<this>");
        if (!intProgression.isEmpty()) {
            return intProgression.getFirst();
        }
        throw new NoSuchElementException("Progression " + intProgression + " is empty.");
    }

    @SinceKotlin(version = "1.7")
    @Nullable
    public static final Integer firstOrNull(@NotNull IntProgression intProgression) {
        Intrinsics.checkNotNullParameter(intProgression, "<this>");
        if (intProgression.isEmpty()) {
            return null;
        }
        return Integer.valueOf(intProgression.getFirst());
    }

    @Deprecated(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @DeprecatedSinceKotlin(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    @JvmName(name = "floatRangeContains")
    public static final /* synthetic */ boolean floatRangeContains(ClosedRange closedRange, byte b11) {
        Intrinsics.checkNotNullParameter(closedRange, "<this>");
        return closedRange.contains(Float.valueOf(b11));
    }

    @JvmName(name = "intRangeContains")
    public static final boolean intRangeContains(@NotNull ClosedRange<Integer> closedRange, byte b11) {
        Intrinsics.checkNotNullParameter(closedRange, "<this>");
        return closedRange.contains(Integer.valueOf(b11));
    }

    @SinceKotlin(version = "1.7")
    public static final int last(@NotNull IntProgression intProgression) {
        Intrinsics.checkNotNullParameter(intProgression, "<this>");
        if (!intProgression.isEmpty()) {
            return intProgression.getLast();
        }
        throw new NoSuchElementException("Progression " + intProgression + " is empty.");
    }

    @SinceKotlin(version = "1.7")
    @Nullable
    public static final Integer lastOrNull(@NotNull IntProgression intProgression) {
        Intrinsics.checkNotNullParameter(intProgression, "<this>");
        if (intProgression.isEmpty()) {
            return null;
        }
        return Integer.valueOf(intProgression.getLast());
    }

    @JvmName(name = "longRangeContains")
    public static final boolean longRangeContains(@NotNull ClosedRange<Long> closedRange, byte b11) {
        Intrinsics.checkNotNullParameter(closedRange, "<this>");
        return closedRange.contains(Long.valueOf(b11));
    }

    @SinceKotlin(version = "1.3")
    @InlineOnly
    private static final int random(IntRange intRange) {
        Intrinsics.checkNotNullParameter(intRange, "<this>");
        return random(intRange, Random.INSTANCE);
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final Integer randomOrNull(IntRange intRange) {
        Intrinsics.checkNotNullParameter(intRange, "<this>");
        return randomOrNull(intRange, Random.INSTANCE);
    }

    @NotNull
    public static final IntProgression reversed(@NotNull IntProgression intProgression) {
        Intrinsics.checkNotNullParameter(intProgression, "<this>");
        return IntProgression.INSTANCE.fromClosedRange(intProgression.getLast(), intProgression.getFirst(), -intProgression.getStep());
    }

    @JvmName(name = "shortRangeContains")
    public static final boolean shortRangeContains(@NotNull ClosedRange<Short> closedRange, byte b11) {
        Intrinsics.checkNotNullParameter(closedRange, "<this>");
        return closedRange.contains(Short.valueOf(b11));
    }

    @NotNull
    public static IntProgression step(@NotNull IntProgression intProgression, int i11) {
        Intrinsics.checkNotNullParameter(intProgression, "<this>");
        RangesKt__RangesKt.checkStepIsPositive(i11 > 0, Integer.valueOf(i11));
        IntProgression.Companion companion = IntProgression.INSTANCE;
        int first = intProgression.getFirst();
        int last = intProgression.getLast();
        if (intProgression.getStep() <= 0) {
            i11 = -i11;
        }
        return companion.fromClosedRange(first, last, i11);
    }

    @Nullable
    public static final Byte toByteExactOrNull(int i11) {
        if (-128 > i11 || i11 >= 128) {
            return null;
        }
        return Byte.valueOf((byte) i11);
    }

    @Nullable
    public static final Integer toIntExactOrNull(long j11) {
        if (-2147483648L > j11 || j11 >= 2147483648L) {
            return null;
        }
        return Integer.valueOf((int) j11);
    }

    @Nullable
    public static final Long toLongExactOrNull(double d11) {
        if (-9.223372036854776E18d > d11 || d11 > 9.223372036854776E18d) {
            return null;
        }
        return Long.valueOf((long) d11);
    }

    @Nullable
    public static final Short toShortExactOrNull(int i11) {
        if (-32768 > i11 || i11 >= 32768) {
            return null;
        }
        return Short.valueOf((short) i11);
    }

    @NotNull
    public static final IntRange until(int i11, byte b11) {
        return new IntRange(i11, b11 - 1);
    }

    @Deprecated(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @DeprecatedSinceKotlin(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    @JvmName(name = "byteRangeContains")
    public static final /* synthetic */ boolean byteRangeContains(ClosedRange closedRange, float f11) {
        Intrinsics.checkNotNullParameter(closedRange, "<this>");
        Byte byteExactOrNull = toByteExactOrNull(f11);
        if (byteExactOrNull != null) {
            return closedRange.contains(byteExactOrNull);
        }
        return false;
    }

    public static double coerceAtLeast(double d11, double d12) {
        return d11 < d12 ? d12 : d11;
    }

    public static double coerceAtMost(double d11, double d12) {
        return d11 > d12 ? d12 : d11;
    }

    @SinceKotlin(version = "1.3")
    @InlineOnly
    private static final boolean contains(LongRange longRange, Long l11) {
        Intrinsics.checkNotNullParameter(longRange, "<this>");
        return l11 != null && longRange.contains(l11.longValue());
    }

    @JvmName(name = "doubleRangeContains")
    public static boolean doubleRangeContains(@NotNull ClosedRange<Double> closedRange, float f11) {
        Intrinsics.checkNotNullParameter(closedRange, "<this>");
        return closedRange.contains(Double.valueOf(f11));
    }

    @NotNull
    public static final LongProgression downTo(long j11, byte b11) {
        return LongProgression.INSTANCE.fromClosedRange(j11, b11, -1L);
    }

    @SinceKotlin(version = "1.7")
    @Nullable
    public static final Long firstOrNull(@NotNull LongProgression longProgression) {
        Intrinsics.checkNotNullParameter(longProgression, "<this>");
        if (longProgression.isEmpty()) {
            return null;
        }
        return Long.valueOf(longProgression.getFirst());
    }

    @JvmName(name = "floatRangeContains")
    public static final boolean floatRangeContains(@NotNull ClosedRange<Float> closedRange, double d11) {
        Intrinsics.checkNotNullParameter(closedRange, "<this>");
        return closedRange.contains(Float.valueOf((float) d11));
    }

    @SinceKotlin(version = "1.9")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @JvmName(name = "intRangeContains")
    public static final boolean intRangeContains(@NotNull OpenEndRange<Integer> openEndRange, byte b11) {
        Intrinsics.checkNotNullParameter(openEndRange, "<this>");
        return openEndRange.contains(Integer.valueOf(b11));
    }

    @SinceKotlin(version = "1.7")
    @Nullable
    public static final Long lastOrNull(@NotNull LongProgression longProgression) {
        Intrinsics.checkNotNullParameter(longProgression, "<this>");
        if (longProgression.isEmpty()) {
            return null;
        }
        return Long.valueOf(longProgression.getLast());
    }

    @SinceKotlin(version = "1.9")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @JvmName(name = "longRangeContains")
    public static final boolean longRangeContains(@NotNull OpenEndRange<Long> openEndRange, byte b11) {
        Intrinsics.checkNotNullParameter(openEndRange, "<this>");
        return openEndRange.contains(Long.valueOf(b11));
    }

    @SinceKotlin(version = "1.3")
    @InlineOnly
    private static final long random(LongRange longRange) {
        Intrinsics.checkNotNullParameter(longRange, "<this>");
        return random(longRange, Random.INSTANCE);
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final Long randomOrNull(LongRange longRange) {
        Intrinsics.checkNotNullParameter(longRange, "<this>");
        return randomOrNull(longRange, Random.INSTANCE);
    }

    @NotNull
    public static final LongProgression reversed(@NotNull LongProgression longProgression) {
        Intrinsics.checkNotNullParameter(longProgression, "<this>");
        return LongProgression.INSTANCE.fromClosedRange(longProgression.getLast(), longProgression.getFirst(), -longProgression.getStep());
    }

    @SinceKotlin(version = "1.9")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @JvmName(name = "shortRangeContains")
    public static final boolean shortRangeContains(@NotNull OpenEndRange<Short> openEndRange, byte b11) {
        Intrinsics.checkNotNullParameter(openEndRange, "<this>");
        return openEndRange.contains(Short.valueOf(b11));
    }

    @Nullable
    public static final Byte toByteExactOrNull(long j11) {
        if (-128 > j11 || j11 >= 128) {
            return null;
        }
        return Byte.valueOf((byte) j11);
    }

    @Nullable
    public static final Integer toIntExactOrNull(double d11) {
        if (-2.147483648E9d > d11 || d11 > 2.147483647E9d) {
            return null;
        }
        return Integer.valueOf((int) d11);
    }

    @Nullable
    public static final Long toLongExactOrNull(float f11) {
        if (-9.223372E18f > f11 || f11 > 9.223372E18f) {
            return null;
        }
        return Long.valueOf((long) f11);
    }

    @Nullable
    public static final Short toShortExactOrNull(long j11) {
        if (-32768 > j11 || j11 >= 32768) {
            return null;
        }
        return Short.valueOf((short) j11);
    }

    @NotNull
    public static final LongRange until(long j11, byte b11) {
        return new LongRange(j11, ((long) b11) - 1);
    }

    @JvmName(name = "byteRangeContains")
    public static final boolean byteRangeContains(@NotNull ClosedRange<Byte> closedRange, int i11) {
        Intrinsics.checkNotNullParameter(closedRange, "<this>");
        Byte byteExactOrNull = toByteExactOrNull(i11);
        if (byteExactOrNull != null) {
            return closedRange.contains(byteExactOrNull);
        }
        return false;
    }

    public static float coerceAtLeast(float f11, float f12) {
        return f11 < f12 ? f12 : f11;
    }

    public static float coerceAtMost(float f11, float f12) {
        return f11 > f12 ? f12 : f11;
    }

    @SinceKotlin(version = "1.3")
    @InlineOnly
    private static final boolean contains(CharRange charRange, Character ch2) {
        Intrinsics.checkNotNullParameter(charRange, "<this>");
        return ch2 != null && charRange.contains(ch2.charValue());
    }

    @SinceKotlin(version = "1.9")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @JvmName(name = "doubleRangeContains")
    public static final boolean doubleRangeContains(@NotNull OpenEndRange<Double> openEndRange, float f11) {
        Intrinsics.checkNotNullParameter(openEndRange, "<this>");
        return openEndRange.contains(Double.valueOf(f11));
    }

    @NotNull
    public static final IntProgression downTo(byte b11, byte b12) {
        return IntProgression.INSTANCE.fromClosedRange(b11, b12, -1);
    }

    @SinceKotlin(version = "1.7")
    @Nullable
    public static final Character firstOrNull(@NotNull CharProgression charProgression) {
        Intrinsics.checkNotNullParameter(charProgression, "<this>");
        if (charProgression.isEmpty()) {
            return null;
        }
        return Character.valueOf(charProgression.getFirst());
    }

    @Deprecated(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @DeprecatedSinceKotlin(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    @JvmName(name = "floatRangeContains")
    public static final /* synthetic */ boolean floatRangeContains(ClosedRange closedRange, int i11) {
        Intrinsics.checkNotNullParameter(closedRange, "<this>");
        return closedRange.contains(Float.valueOf(i11));
    }

    @Deprecated(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @DeprecatedSinceKotlin(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    @JvmName(name = "intRangeContains")
    public static final /* synthetic */ boolean intRangeContains(ClosedRange closedRange, double d11) {
        Intrinsics.checkNotNullParameter(closedRange, "<this>");
        Integer intExactOrNull = toIntExactOrNull(d11);
        if (intExactOrNull != null) {
            return closedRange.contains(intExactOrNull);
        }
        return false;
    }

    @SinceKotlin(version = "1.7")
    @Nullable
    public static final Character lastOrNull(@NotNull CharProgression charProgression) {
        Intrinsics.checkNotNullParameter(charProgression, "<this>");
        if (charProgression.isEmpty()) {
            return null;
        }
        return Character.valueOf(charProgression.getLast());
    }

    @Deprecated(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @DeprecatedSinceKotlin(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    @JvmName(name = "longRangeContains")
    public static final /* synthetic */ boolean longRangeContains(ClosedRange closedRange, double d11) {
        Intrinsics.checkNotNullParameter(closedRange, "<this>");
        Long longExactOrNull = toLongExactOrNull(d11);
        if (longExactOrNull != null) {
            return closedRange.contains(longExactOrNull);
        }
        return false;
    }

    @SinceKotlin(version = "1.3")
    @InlineOnly
    private static final char random(CharRange charRange) {
        Intrinsics.checkNotNullParameter(charRange, "<this>");
        return random(charRange, Random.INSTANCE);
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final Character randomOrNull(CharRange charRange) {
        Intrinsics.checkNotNullParameter(charRange, "<this>");
        return randomOrNull(charRange, Random.INSTANCE);
    }

    @NotNull
    public static final CharProgression reversed(@NotNull CharProgression charProgression) {
        Intrinsics.checkNotNullParameter(charProgression, "<this>");
        return CharProgression.INSTANCE.fromClosedRange(charProgression.getLast(), charProgression.getFirst(), -charProgression.getStep());
    }

    @Deprecated(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @DeprecatedSinceKotlin(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    @JvmName(name = "shortRangeContains")
    public static final /* synthetic */ boolean shortRangeContains(ClosedRange closedRange, double d11) {
        Intrinsics.checkNotNullParameter(closedRange, "<this>");
        Short shortExactOrNull = toShortExactOrNull(d11);
        if (shortExactOrNull != null) {
            return closedRange.contains(shortExactOrNull);
        }
        return false;
    }

    @NotNull
    public static LongProgression step(@NotNull LongProgression longProgression, long j11) {
        Intrinsics.checkNotNullParameter(longProgression, "<this>");
        RangesKt__RangesKt.checkStepIsPositive(j11 > 0, Long.valueOf(j11));
        LongProgression.Companion companion = LongProgression.INSTANCE;
        long first = longProgression.getFirst();
        long last = longProgression.getLast();
        if (longProgression.getStep() <= 0) {
            j11 = -j11;
        }
        return companion.fromClosedRange(first, last, j11);
    }

    @Nullable
    public static final Byte toByteExactOrNull(short s11) {
        if (-128 > s11 || s11 >= 128) {
            return null;
        }
        return Byte.valueOf((byte) s11);
    }

    @Nullable
    public static final Integer toIntExactOrNull(float f11) {
        if (-2.1474836E9f > f11 || f11 > 2.1474836E9f) {
            return null;
        }
        return Integer.valueOf((int) f11);
    }

    @Nullable
    public static final Short toShortExactOrNull(double d11) {
        if (-32768.0d > d11 || d11 > 32767.0d) {
            return null;
        }
        return Short.valueOf((short) d11);
    }

    @NotNull
    public static final IntRange until(byte b11, byte b12) {
        return new IntRange(b11, b12 - 1);
    }

    @SinceKotlin(version = "1.9")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @JvmName(name = "byteRangeContains")
    public static final boolean byteRangeContains(@NotNull OpenEndRange<Byte> openEndRange, int i11) {
        Intrinsics.checkNotNullParameter(openEndRange, "<this>");
        Byte byteExactOrNull = toByteExactOrNull(i11);
        if (byteExactOrNull != null) {
            return openEndRange.contains(byteExactOrNull);
        }
        return false;
    }

    public static int coerceAtLeast(int i11, int i12) {
        return i11 < i12 ? i12 : i11;
    }

    public static int coerceAtMost(int i11, int i12) {
        return i11 > i12 ? i12 : i11;
    }

    @InlineOnly
    private static final boolean contains(IntRange intRange, byte b11) {
        Intrinsics.checkNotNullParameter(intRange, "<this>");
        return intRangeContains((ClosedRange<Integer>) intRange, b11);
    }

    @Deprecated(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @DeprecatedSinceKotlin(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    @JvmName(name = "doubleRangeContains")
    public static final /* synthetic */ boolean doubleRangeContains(ClosedRange closedRange, int i11) {
        Intrinsics.checkNotNullParameter(closedRange, "<this>");
        return closedRange.contains(Double.valueOf(i11));
    }

    @NotNull
    public static final IntProgression downTo(short s11, byte b11) {
        return IntProgression.INSTANCE.fromClosedRange(s11, b11, -1);
    }

    @SinceKotlin(version = "1.7")
    public static final long first(@NotNull LongProgression longProgression) {
        Intrinsics.checkNotNullParameter(longProgression, "<this>");
        if (!longProgression.isEmpty()) {
            return longProgression.getFirst();
        }
        throw new NoSuchElementException("Progression " + longProgression + " is empty.");
    }

    @Deprecated(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @DeprecatedSinceKotlin(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    @JvmName(name = "floatRangeContains")
    public static final /* synthetic */ boolean floatRangeContains(ClosedRange closedRange, long j11) {
        Intrinsics.checkNotNullParameter(closedRange, "<this>");
        return closedRange.contains(Float.valueOf(j11));
    }

    @Deprecated(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @DeprecatedSinceKotlin(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    @JvmName(name = "intRangeContains")
    public static final /* synthetic */ boolean intRangeContains(ClosedRange closedRange, float f11) {
        Intrinsics.checkNotNullParameter(closedRange, "<this>");
        Integer intExactOrNull = toIntExactOrNull(f11);
        if (intExactOrNull != null) {
            return closedRange.contains(intExactOrNull);
        }
        return false;
    }

    @SinceKotlin(version = "1.7")
    public static final long last(@NotNull LongProgression longProgression) {
        Intrinsics.checkNotNullParameter(longProgression, "<this>");
        if (!longProgression.isEmpty()) {
            return longProgression.getLast();
        }
        throw new NoSuchElementException("Progression " + longProgression + " is empty.");
    }

    @Deprecated(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @DeprecatedSinceKotlin(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    @JvmName(name = "longRangeContains")
    public static final /* synthetic */ boolean longRangeContains(ClosedRange closedRange, float f11) {
        Intrinsics.checkNotNullParameter(closedRange, "<this>");
        Long longExactOrNull = toLongExactOrNull(f11);
        if (longExactOrNull != null) {
            return closedRange.contains(longExactOrNull);
        }
        return false;
    }

    @SinceKotlin(version = "1.3")
    public static final int random(@NotNull IntRange intRange, @NotNull Random random) {
        Intrinsics.checkNotNullParameter(intRange, "<this>");
        Intrinsics.checkNotNullParameter(random, "random");
        try {
            return RandomKt.nextInt(random, intRange);
        } catch (IllegalArgumentException e11) {
            throw new NoSuchElementException(e11.getMessage());
        }
    }

    @SinceKotlin(version = "1.4")
    @Nullable
    public static final Integer randomOrNull(@NotNull IntRange intRange, @NotNull Random random) {
        Intrinsics.checkNotNullParameter(intRange, "<this>");
        Intrinsics.checkNotNullParameter(random, "random");
        if (intRange.isEmpty()) {
            return null;
        }
        return Integer.valueOf(RandomKt.nextInt(random, intRange));
    }

    @Deprecated(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @DeprecatedSinceKotlin(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    @JvmName(name = "shortRangeContains")
    public static final /* synthetic */ boolean shortRangeContains(ClosedRange closedRange, float f11) {
        Intrinsics.checkNotNullParameter(closedRange, "<this>");
        Short shortExactOrNull = toShortExactOrNull(f11);
        if (shortExactOrNull != null) {
            return closedRange.contains(shortExactOrNull);
        }
        return false;
    }

    @Nullable
    public static final Byte toByteExactOrNull(double d11) {
        if (-128.0d > d11 || d11 > 127.0d) {
            return null;
        }
        return Byte.valueOf((byte) d11);
    }

    @Nullable
    public static final Short toShortExactOrNull(float f11) {
        if (-32768.0f > f11 || f11 > 32767.0f) {
            return null;
        }
        return Short.valueOf((short) f11);
    }

    @NotNull
    public static final IntRange until(short s11, byte b11) {
        return new IntRange(s11, b11 - 1);
    }

    @JvmName(name = "byteRangeContains")
    public static final boolean byteRangeContains(@NotNull ClosedRange<Byte> closedRange, long j11) {
        Intrinsics.checkNotNullParameter(closedRange, "<this>");
        Byte byteExactOrNull = toByteExactOrNull(j11);
        if (byteExactOrNull != null) {
            return closedRange.contains(byteExactOrNull);
        }
        return false;
    }

    public static long coerceAtLeast(long j11, long j12) {
        return j11 < j12 ? j12 : j11;
    }

    public static long coerceAtMost(long j11, long j12) {
        return j11 > j12 ? j12 : j11;
    }

    @InlineOnly
    private static final boolean contains(LongRange longRange, byte b11) {
        Intrinsics.checkNotNullParameter(longRange, "<this>");
        return longRangeContains((ClosedRange<Long>) longRange, b11);
    }

    @Deprecated(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @DeprecatedSinceKotlin(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    @JvmName(name = "doubleRangeContains")
    public static final /* synthetic */ boolean doubleRangeContains(ClosedRange closedRange, long j11) {
        Intrinsics.checkNotNullParameter(closedRange, "<this>");
        return closedRange.contains(Double.valueOf(j11));
    }

    @NotNull
    public static final CharProgression downTo(char c11, char c12) {
        return CharProgression.INSTANCE.fromClosedRange(c11, c12, -1);
    }

    @Deprecated(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @DeprecatedSinceKotlin(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    @JvmName(name = "floatRangeContains")
    public static final /* synthetic */ boolean floatRangeContains(ClosedRange closedRange, short s11) {
        Intrinsics.checkNotNullParameter(closedRange, "<this>");
        return closedRange.contains(Float.valueOf(s11));
    }

    @JvmName(name = "intRangeContains")
    public static final boolean intRangeContains(@NotNull ClosedRange<Integer> closedRange, long j11) {
        Intrinsics.checkNotNullParameter(closedRange, "<this>");
        Integer intExactOrNull = toIntExactOrNull(j11);
        if (intExactOrNull != null) {
            return closedRange.contains(intExactOrNull);
        }
        return false;
    }

    @JvmName(name = "longRangeContains")
    public static final boolean longRangeContains(@NotNull ClosedRange<Long> closedRange, int i11) {
        Intrinsics.checkNotNullParameter(closedRange, "<this>");
        return closedRange.contains(Long.valueOf(i11));
    }

    @JvmName(name = "shortRangeContains")
    public static final boolean shortRangeContains(@NotNull ClosedRange<Short> closedRange, int i11) {
        Intrinsics.checkNotNullParameter(closedRange, "<this>");
        Short shortExactOrNull = toShortExactOrNull(i11);
        if (shortExactOrNull != null) {
            return closedRange.contains(shortExactOrNull);
        }
        return false;
    }

    @NotNull
    public static final CharProgression step(@NotNull CharProgression charProgression, int i11) {
        Intrinsics.checkNotNullParameter(charProgression, "<this>");
        RangesKt__RangesKt.checkStepIsPositive(i11 > 0, Integer.valueOf(i11));
        CharProgression.Companion companion = CharProgression.INSTANCE;
        char first = charProgression.getFirst();
        char last = charProgression.getLast();
        if (charProgression.getStep() <= 0) {
            i11 = -i11;
        }
        return companion.fromClosedRange(first, last, i11);
    }

    @Nullable
    public static final Byte toByteExactOrNull(float f11) {
        if (-128.0f > f11 || f11 > 127.0f) {
            return null;
        }
        return Byte.valueOf((byte) f11);
    }

    @NotNull
    public static final CharRange until(char c11, char c12) {
        return Intrinsics.compare((int) c12, 0) <= 0 ? CharRange.INSTANCE.getEMPTY() : new CharRange(c11, (char) (c12 - 1));
    }

    @SinceKotlin(version = "1.9")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @JvmName(name = "byteRangeContains")
    public static final boolean byteRangeContains(@NotNull OpenEndRange<Byte> openEndRange, long j11) {
        Intrinsics.checkNotNullParameter(openEndRange, "<this>");
        Byte byteExactOrNull = toByteExactOrNull(j11);
        if (byteExactOrNull != null) {
            return openEndRange.contains(byteExactOrNull);
        }
        return false;
    }

    public static final short coerceAtLeast(short s11, short s12) {
        return s11 < s12 ? s12 : s11;
    }

    public static final short coerceAtMost(short s11, short s12) {
        return s11 > s12 ? s12 : s11;
    }

    @InlineOnly
    private static final boolean contains(LongRange longRange, int i11) {
        Intrinsics.checkNotNullParameter(longRange, "<this>");
        return longRangeContains((ClosedRange<Long>) longRange, i11);
    }

    @Deprecated(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @DeprecatedSinceKotlin(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    @JvmName(name = "doubleRangeContains")
    public static final /* synthetic */ boolean doubleRangeContains(ClosedRange closedRange, short s11) {
        Intrinsics.checkNotNullParameter(closedRange, "<this>");
        return closedRange.contains(Double.valueOf(s11));
    }

    @NotNull
    public static IntProgression downTo(int i11, int i12) {
        return IntProgression.INSTANCE.fromClosedRange(i11, i12, -1);
    }

    @SinceKotlin(version = "1.9")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @JvmName(name = "intRangeContains")
    public static final boolean intRangeContains(@NotNull OpenEndRange<Integer> openEndRange, long j11) {
        Intrinsics.checkNotNullParameter(openEndRange, "<this>");
        Integer intExactOrNull = toIntExactOrNull(j11);
        if (intExactOrNull != null) {
            return openEndRange.contains(intExactOrNull);
        }
        return false;
    }

    @SinceKotlin(version = "1.9")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @JvmName(name = "longRangeContains")
    public static final boolean longRangeContains(@NotNull OpenEndRange<Long> openEndRange, int i11) {
        Intrinsics.checkNotNullParameter(openEndRange, "<this>");
        return openEndRange.contains(Long.valueOf(i11));
    }

    @SinceKotlin(version = "1.3")
    public static final long random(@NotNull LongRange longRange, @NotNull Random random) {
        Intrinsics.checkNotNullParameter(longRange, "<this>");
        Intrinsics.checkNotNullParameter(random, "random");
        try {
            return RandomKt.nextLong(random, longRange);
        } catch (IllegalArgumentException e11) {
            throw new NoSuchElementException(e11.getMessage());
        }
    }

    @SinceKotlin(version = "1.4")
    @Nullable
    public static final Long randomOrNull(@NotNull LongRange longRange, @NotNull Random random) {
        Intrinsics.checkNotNullParameter(longRange, "<this>");
        Intrinsics.checkNotNullParameter(random, "random");
        if (longRange.isEmpty()) {
            return null;
        }
        return Long.valueOf(RandomKt.nextLong(random, longRange));
    }

    @SinceKotlin(version = "1.9")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @JvmName(name = "shortRangeContains")
    public static final boolean shortRangeContains(@NotNull OpenEndRange<Short> openEndRange, int i11) {
        Intrinsics.checkNotNullParameter(openEndRange, "<this>");
        Short shortExactOrNull = toShortExactOrNull(i11);
        if (shortExactOrNull != null) {
            return openEndRange.contains(shortExactOrNull);
        }
        return false;
    }

    @JvmName(name = "byteRangeContains")
    public static final boolean byteRangeContains(@NotNull ClosedRange<Byte> closedRange, short s11) {
        Intrinsics.checkNotNullParameter(closedRange, "<this>");
        Byte byteExactOrNull = toByteExactOrNull(s11);
        if (byteExactOrNull != null) {
            return closedRange.contains(byteExactOrNull);
        }
        return false;
    }

    @NotNull
    public static <T extends Comparable<? super T>> T coerceAtLeast(@NotNull T t11, @NotNull T minimumValue) {
        Intrinsics.checkNotNullParameter(t11, "<this>");
        Intrinsics.checkNotNullParameter(minimumValue, "minimumValue");
        return t11.compareTo(minimumValue) < 0 ? minimumValue : t11;
    }

    @NotNull
    public static <T extends Comparable<? super T>> T coerceAtMost(@NotNull T t11, @NotNull T maximumValue) {
        Intrinsics.checkNotNullParameter(t11, "<this>");
        Intrinsics.checkNotNullParameter(maximumValue, "maximumValue");
        return t11.compareTo(maximumValue) > 0 ? maximumValue : t11;
    }

    public static final byte coerceIn(byte b11, byte b12, byte b13) {
        if (b12 <= b13) {
            if (b11 < b12) {
                return b12;
            }
            return b11 > b13 ? b13 : b11;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + ((int) b13) + " is less than minimum " + ((int) b12) + '.');
    }

    @InlineOnly
    private static final boolean contains(IntRange intRange, long j11) {
        Intrinsics.checkNotNullParameter(intRange, "<this>");
        return intRangeContains((ClosedRange<Integer>) intRange, j11);
    }

    @NotNull
    public static LongProgression downTo(long j11, int i11) {
        return LongProgression.INSTANCE.fromClosedRange(j11, i11, -1L);
    }

    @SinceKotlin(version = "1.7")
    public static final char first(@NotNull CharProgression charProgression) {
        Intrinsics.checkNotNullParameter(charProgression, "<this>");
        if (!charProgression.isEmpty()) {
            return charProgression.getFirst();
        }
        throw new NoSuchElementException("Progression " + charProgression + " is empty.");
    }

    @JvmName(name = "intRangeContains")
    public static final boolean intRangeContains(@NotNull ClosedRange<Integer> closedRange, short s11) {
        Intrinsics.checkNotNullParameter(closedRange, "<this>");
        return closedRange.contains(Integer.valueOf(s11));
    }

    @SinceKotlin(version = "1.7")
    public static final char last(@NotNull CharProgression charProgression) {
        Intrinsics.checkNotNullParameter(charProgression, "<this>");
        if (!charProgression.isEmpty()) {
            return charProgression.getLast();
        }
        throw new NoSuchElementException("Progression " + charProgression + " is empty.");
    }

    @JvmName(name = "longRangeContains")
    public static final boolean longRangeContains(@NotNull ClosedRange<Long> closedRange, short s11) {
        Intrinsics.checkNotNullParameter(closedRange, "<this>");
        return closedRange.contains(Long.valueOf(s11));
    }

    @JvmName(name = "shortRangeContains")
    public static final boolean shortRangeContains(@NotNull ClosedRange<Short> closedRange, long j11) {
        Intrinsics.checkNotNullParameter(closedRange, "<this>");
        Short shortExactOrNull = toShortExactOrNull(j11);
        if (shortExactOrNull != null) {
            return closedRange.contains(shortExactOrNull);
        }
        return false;
    }

    @NotNull
    public static IntRange until(int i11, int i12) {
        if (i12 <= Integer.MIN_VALUE) {
            return IntRange.INSTANCE.getEMPTY();
        }
        return new IntRange(i11, i12 - 1);
    }

    @SinceKotlin(version = "1.9")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @JvmName(name = "byteRangeContains")
    public static final boolean byteRangeContains(@NotNull OpenEndRange<Byte> openEndRange, short s11) {
        Intrinsics.checkNotNullParameter(openEndRange, "<this>");
        Byte byteExactOrNull = toByteExactOrNull(s11);
        if (byteExactOrNull != null) {
            return openEndRange.contains(byteExactOrNull);
        }
        return false;
    }

    public static final short coerceIn(short s11, short s12, short s13) {
        if (s12 <= s13) {
            if (s11 < s12) {
                return s12;
            }
            return s11 > s13 ? s13 : s11;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + ((int) s13) + " is less than minimum " + ((int) s12) + '.');
    }

    @InlineOnly
    private static final boolean contains(IntRange intRange, short s11) {
        Intrinsics.checkNotNullParameter(intRange, "<this>");
        return intRangeContains((ClosedRange<Integer>) intRange, s11);
    }

    @NotNull
    public static final IntProgression downTo(byte b11, int i11) {
        return IntProgression.INSTANCE.fromClosedRange(b11, i11, -1);
    }

    @SinceKotlin(version = "1.9")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @JvmName(name = "intRangeContains")
    public static final boolean intRangeContains(@NotNull OpenEndRange<Integer> openEndRange, short s11) {
        Intrinsics.checkNotNullParameter(openEndRange, "<this>");
        return openEndRange.contains(Integer.valueOf(s11));
    }

    @SinceKotlin(version = "1.9")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @JvmName(name = "longRangeContains")
    public static final boolean longRangeContains(@NotNull OpenEndRange<Long> openEndRange, short s11) {
        Intrinsics.checkNotNullParameter(openEndRange, "<this>");
        return openEndRange.contains(Long.valueOf(s11));
    }

    @SinceKotlin(version = "1.3")
    public static final char random(@NotNull CharRange charRange, @NotNull Random random) {
        Intrinsics.checkNotNullParameter(charRange, "<this>");
        Intrinsics.checkNotNullParameter(random, "random");
        try {
            return (char) random.nextInt(charRange.getFirst(), charRange.getLast() + 1);
        } catch (IllegalArgumentException e11) {
            throw new NoSuchElementException(e11.getMessage());
        }
    }

    @SinceKotlin(version = "1.4")
    @Nullable
    public static final Character randomOrNull(@NotNull CharRange charRange, @NotNull Random random) {
        Intrinsics.checkNotNullParameter(charRange, "<this>");
        Intrinsics.checkNotNullParameter(random, "random");
        if (charRange.isEmpty()) {
            return null;
        }
        return Character.valueOf((char) random.nextInt(charRange.getFirst(), charRange.getLast() + 1));
    }

    @SinceKotlin(version = "1.9")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @JvmName(name = "shortRangeContains")
    public static final boolean shortRangeContains(@NotNull OpenEndRange<Short> openEndRange, long j11) {
        Intrinsics.checkNotNullParameter(openEndRange, "<this>");
        Short shortExactOrNull = toShortExactOrNull(j11);
        if (shortExactOrNull != null) {
            return openEndRange.contains(shortExactOrNull);
        }
        return false;
    }

    public static int coerceIn(int i11, int i12, int i13) {
        if (i12 <= i13) {
            if (i11 < i12) {
                return i12;
            }
            return i11 > i13 ? i13 : i11;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + i13 + " is less than minimum " + i12 + '.');
    }

    @InlineOnly
    private static final boolean contains(LongRange longRange, short s11) {
        Intrinsics.checkNotNullParameter(longRange, "<this>");
        return longRangeContains((ClosedRange<Long>) longRange, s11);
    }

    @NotNull
    public static final IntProgression downTo(short s11, int i11) {
        return IntProgression.INSTANCE.fromClosedRange(s11, i11, -1);
    }

    @NotNull
    public static final LongRange until(long j11, int i11) {
        return new LongRange(j11, ((long) i11) - 1);
    }

    public static long coerceIn(long j11, long j12, long j13) {
        if (j12 <= j13) {
            if (j11 < j12) {
                return j12;
            }
            return j11 > j13 ? j13 : j11;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + j13 + " is less than minimum " + j12 + '.');
    }

    @NotNull
    public static final LongProgression downTo(int i11, long j11) {
        return LongProgression.INSTANCE.fromClosedRange(i11, j11, -1L);
    }

    @NotNull
    public static final IntRange until(byte b11, int i11) {
        if (i11 <= Integer.MIN_VALUE) {
            return IntRange.INSTANCE.getEMPTY();
        }
        return new IntRange(b11, i11 - 1);
    }

    public static float coerceIn(float f11, float f12, float f13) {
        if (f12 <= f13) {
            if (f11 < f12) {
                return f12;
            }
            return f11 > f13 ? f13 : f11;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + f13 + " is less than minimum " + f12 + '.');
    }

    @NotNull
    public static final LongProgression downTo(long j11, long j12) {
        return LongProgression.INSTANCE.fromClosedRange(j11, j12, -1L);
    }

    public static final double coerceIn(double d11, double d12, double d13) {
        if (d12 <= d13) {
            if (d11 < d12) {
                return d12;
            }
            return d11 > d13 ? d13 : d11;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + d13 + " is less than minimum " + d12 + '.');
    }

    @NotNull
    public static final LongProgression downTo(byte b11, long j11) {
        return LongProgression.INSTANCE.fromClosedRange(b11, j11, -1L);
    }

    @NotNull
    public static final IntRange until(short s11, int i11) {
        if (i11 <= Integer.MIN_VALUE) {
            return IntRange.INSTANCE.getEMPTY();
        }
        return new IntRange(s11, i11 - 1);
    }

    @SinceKotlin(version = "1.1")
    @NotNull
    public static final <T extends Comparable<? super T>> T coerceIn(@NotNull T t11, @NotNull ClosedFloatingPointRange<T> range) {
        Intrinsics.checkNotNullParameter(t11, "<this>");
        Intrinsics.checkNotNullParameter(range, "range");
        if (!range.isEmpty()) {
            if (!range.lessThanOrEquals(t11, range.getStart()) || range.lessThanOrEquals(range.getStart(), t11)) {
                return (!range.lessThanOrEquals(range.getEndInclusive(), t11) || range.lessThanOrEquals(t11, range.getEndInclusive())) ? t11 : range.getEndInclusive();
            }
            return range.getStart();
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: " + range + '.');
    }

    @NotNull
    public static final LongProgression downTo(short s11, long j11) {
        return LongProgression.INSTANCE.fromClosedRange(s11, j11, -1L);
    }

    @NotNull
    public static final IntProgression downTo(int i11, short s11) {
        return IntProgression.INSTANCE.fromClosedRange(i11, s11, -1);
    }

    @NotNull
    public static final LongRange until(int i11, long j11) {
        if (j11 <= Long.MIN_VALUE) {
            return LongRange.INSTANCE.getEMPTY();
        }
        return new LongRange(i11, j11 - 1);
    }

    @NotNull
    public static final LongProgression downTo(long j11, short s11) {
        return LongProgression.INSTANCE.fromClosedRange(j11, s11, -1L);
    }

    @NotNull
    public static final IntProgression downTo(byte b11, short s11) {
        return IntProgression.INSTANCE.fromClosedRange(b11, s11, -1);
    }

    @NotNull
    public static LongRange until(long j11, long j12) {
        if (j12 <= Long.MIN_VALUE) {
            return LongRange.INSTANCE.getEMPTY();
        }
        return new LongRange(j11, j12 - 1);
    }

    @NotNull
    public static final <T extends Comparable<? super T>> T coerceIn(@NotNull T t11, @NotNull ClosedRange<T> range) {
        Intrinsics.checkNotNullParameter(t11, "<this>");
        Intrinsics.checkNotNullParameter(range, "range");
        if (range instanceof ClosedFloatingPointRange) {
            return (T) coerceIn((Comparable) t11, (ClosedFloatingPointRange) range);
        }
        if (!range.isEmpty()) {
            if (t11.compareTo(range.getStart()) < 0) {
                return (T) range.getStart();
            }
            return t11.compareTo(range.getEndInclusive()) > 0 ? (T) range.getEndInclusive() : t11;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: " + range + '.');
    }

    @NotNull
    public static final IntProgression downTo(short s11, short s12) {
        return IntProgression.INSTANCE.fromClosedRange(s11, s12, -1);
    }

    @NotNull
    public static final LongRange until(byte b11, long j11) {
        if (j11 <= Long.MIN_VALUE) {
            return LongRange.INSTANCE.getEMPTY();
        }
        return new LongRange(b11, j11 - 1);
    }

    @NotNull
    public static final LongRange until(short s11, long j11) {
        if (j11 <= Long.MIN_VALUE) {
            return LongRange.INSTANCE.getEMPTY();
        }
        return new LongRange(s11, j11 - 1);
    }

    @NotNull
    public static final IntRange until(int i11, short s11) {
        return new IntRange(i11, s11 - 1);
    }

    public static final int coerceIn(int i11, @NotNull ClosedRange<Integer> range) {
        Intrinsics.checkNotNullParameter(range, "range");
        if (range instanceof ClosedFloatingPointRange) {
            return ((Number) coerceIn(Integer.valueOf(i11), (ClosedFloatingPointRange<Integer>) range)).intValue();
        }
        if (!range.isEmpty()) {
            if (i11 < ((Number) range.getStart()).intValue()) {
                return ((Number) range.getStart()).intValue();
            }
            return i11 > ((Number) range.getEndInclusive()).intValue() ? ((Number) range.getEndInclusive()).intValue() : i11;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: " + range + '.');
    }

    @NotNull
    public static final LongRange until(long j11, short s11) {
        return new LongRange(j11, ((long) s11) - 1);
    }

    @NotNull
    public static final IntRange until(byte b11, short s11) {
        return new IntRange(b11, s11 - 1);
    }

    @NotNull
    public static final IntRange until(short s11, short s12) {
        return new IntRange(s11, s12 - 1);
    }

    public static long coerceIn(long j11, @NotNull ClosedRange<Long> range) {
        Intrinsics.checkNotNullParameter(range, "range");
        if (range instanceof ClosedFloatingPointRange) {
            return ((Number) coerceIn(Long.valueOf(j11), (ClosedFloatingPointRange<Long>) range)).longValue();
        }
        if (!range.isEmpty()) {
            if (j11 < ((Number) range.getStart()).longValue()) {
                return ((Number) range.getStart()).longValue();
            }
            return j11 > ((Number) range.getEndInclusive()).longValue() ? ((Number) range.getEndInclusive()).longValue() : j11;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: " + range + '.');
    }
}
