package kotlinx.coroutines.channels;

import androidx.concurrent.futures.C1481a;
import androidx.exifinterface.media.ExifInterface;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.google.common.primitives.Longs;
import com.tencent.bugly.proguard.C33675gh;
import com.tencent.rmonitor.custom.ICustomDataEditor;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.C41716o;
import kotlinx.coroutines.C41724q;
import kotlinx.coroutines.InterfaceC41708m;
import kotlinx.coroutines.InterfaceC41784z2;
import kotlinx.coroutines.internal.UndeliveredElementException;
import kotlinx.coroutines.selects.C41752g;
import kotlinx.coroutines.selects.InterfaceC41751f;
import kotlinx.coroutines.selects.InterfaceC41754i;
import kotlinx.coroutines.selects.SelectImplementation;
import kotlinx.coroutines.selects.TrySelectDetailedResult;
import og0.AbstractC43048c;
import og0.AbstractC43081x;
import og0.C43046b;
import og0.C43062j;
import og0.C43077t;
import og0.C43082y;
import og0.C43083z;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.ExceptionsKt;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.CoroutineContext;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.DebugProbesKt;
import p852kotlin.jvm.JvmField;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.functions.Function3;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.jvm.internal.TypeIntrinsics;
import p852kotlin.reflect.KFunction;
import p852kotlin.text.StringsKt;
import p852kotlin.time.DurationKt;

/* JADX INFO: compiled from: BufferedChannel.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000º\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b6\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0003:\u009c\u0001B3\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\"\b\u0002\u0010\b\u001a\u001c\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`\u0007¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00028\u0000H\u0082@¢\u0006\u0004\b\f\u0010\rJ6\u0010\u0013\u001a\u00020\u00062\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00028\u00002\u0006\u0010\u0012\u001a\u00020\u0011H\u0082@¢\u0006\u0004\b\u0013\u0010\u0014J)\u0010\u0016\u001a\u00020\u0006*\u00020\u00152\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\u0010\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J%\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00028\u00002\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00060\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJG\u0010 \u001a\u00020\u00032\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00028\u00002\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b \u0010!JG\u0010\"\u001a\u00020\u00032\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00028\u00002\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b\"\u0010!J\u0017\u0010$\u001a\u00020\u001e2\u0006\u0010#\u001a\u00020\u0011H\u0003¢\u0006\u0004\b$\u0010%J\u0017\u0010'\u001a\u00020\u001e2\u0006\u0010&\u001a\u00020\u0011H\u0002¢\u0006\u0004\b'\u0010%J\u001b\u0010(\u001a\u00020\u001e*\u00020\u001c2\u0006\u0010\u000b\u001a\u00028\u0000H\u0002¢\u0006\u0004\b(\u0010)J.\u0010+\u001a\u00028\u00002\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010*\u001a\u00020\u0011H\u0082@¢\u0006\u0004\b+\u0010,J)\u0010-\u001a\u00020\u0006*\u00020\u00152\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\u0010\u001a\u00020\u0003H\u0002¢\u0006\u0004\b-\u0010\u0017J\u001d\u0010.\u001a\u00020\u00062\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u0018H\u0002¢\u0006\u0004\b.\u0010/J4\u00101\u001a\b\u0012\u0004\u0012\u00028\u0000002\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010*\u001a\u00020\u0011H\u0082@¢\u0006\u0004\b1\u0010,J#\u00102\u001a\u00020\u00062\u0012\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u0000000\u0018H\u0002¢\u0006\u0004\b2\u0010/J9\u00103\u001a\u0004\u0018\u00010\u001c2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010*\u001a\u00020\u00112\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0002¢\u0006\u0004\b3\u00104J9\u00105\u001a\u0004\u0018\u00010\u001c2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010*\u001a\u00020\u00112\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0002¢\u0006\u0004\b5\u00104J)\u00106\u001a\u00020\u001e*\u00020\u001c2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\u0010\u001a\u00020\u0003H\u0002¢\u0006\u0004\b6\u00107J\u000f\u00108\u001a\u00020\u0006H\u0002¢\u0006\u0004\b8\u00109J-\u0010;\u001a\u00020\u001e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010:\u001a\u00020\u0011H\u0002¢\u0006\u0004\b;\u0010<J-\u0010=\u001a\u00020\u001e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010:\u001a\u00020\u0011H\u0002¢\u0006\u0004\b=\u0010<J\u0019\u0010?\u001a\u00020\u00062\b\b\u0002\u0010>\u001a\u00020\u0011H\u0002¢\u0006\u0004\b?\u0010@J%\u0010D\u001a\u00020\u00062\n\u0010B\u001a\u0006\u0012\u0002\b\u00030A2\b\u0010C\u001a\u0004\u0018\u00010\u001cH\u0002¢\u0006\u0004\bD\u0010EJ\u001b\u0010F\u001a\u00020\u00062\n\u0010B\u001a\u0006\u0012\u0002\b\u00030AH\u0002¢\u0006\u0004\bF\u0010GJ%\u0010I\u001a\u0004\u0018\u00010\u001c2\b\u0010C\u001a\u0004\u0018\u00010\u001c2\b\u0010H\u001a\u0004\u0018\u00010\u001cH\u0002¢\u0006\u0004\bI\u0010JJ%\u0010K\u001a\u0004\u0018\u00010\u001c2\b\u0010C\u001a\u0004\u0018\u00010\u001c2\b\u0010H\u001a\u0004\u0018\u00010\u001cH\u0002¢\u0006\u0004\bK\u0010JJ\u000f\u0010L\u001a\u00020\u0006H\u0002¢\u0006\u0004\bL\u00109J\u000f\u0010M\u001a\u00020\u0006H\u0002¢\u0006\u0004\bM\u00109J\u000f\u0010N\u001a\u00020\u0006H\u0002¢\u0006\u0004\bN\u00109J\u000f\u0010O\u001a\u00020\u0006H\u0002¢\u0006\u0004\bO\u00109J\u000f\u0010P\u001a\u00020\u0006H\u0002¢\u0006\u0004\bP\u00109J\u001d\u0010R\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010Q\u001a\u00020\u0011H\u0002¢\u0006\u0004\bR\u0010SJ\u0017\u0010T\u001a\u00020\u00062\u0006\u0010Q\u001a\u00020\u0011H\u0002¢\u0006\u0004\bT\u0010@J\u0015\u0010U\u001a\b\u0012\u0004\u0012\u00028\u00000\u000eH\u0002¢\u0006\u0004\bU\u0010VJ\u001d\u0010X\u001a\u00020\u00112\f\u0010W\u001a\b\u0012\u0004\u0012\u00028\u00000\u000eH\u0002¢\u0006\u0004\bX\u0010YJ\u001d\u0010Z\u001a\u00020\u00062\f\u0010W\u001a\b\u0012\u0004\u0012\u00028\u00000\u000eH\u0002¢\u0006\u0004\bZ\u0010[J%\u0010]\u001a\u00020\u00062\f\u0010W\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\\\u001a\u00020\u0011H\u0002¢\u0006\u0004\b]\u0010^J\u0013\u0010_\u001a\u00020\u0006*\u00020\u0015H\u0002¢\u0006\u0004\b_\u0010`J\u0013\u0010a\u001a\u00020\u0006*\u00020\u0015H\u0002¢\u0006\u0004\ba\u0010`J\u001b\u0010c\u001a\u00020\u0006*\u00020\u00152\u0006\u0010b\u001a\u00020\u001eH\u0002¢\u0006\u0004\bc\u0010dJ\u001f\u0010g\u001a\u00020\u001e2\u0006\u0010e\u001a\u00020\u00112\u0006\u0010f\u001a\u00020\u001eH\u0002¢\u0006\u0004\bg\u0010hJ-\u0010j\u001a\u00020\u001e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010i\u001a\u00020\u0011H\u0002¢\u0006\u0004\bj\u0010<J-\u0010m\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u000e2\u0006\u0010k\u001a\u00020\u00112\f\u0010l\u001a\b\u0012\u0004\u0012\u00028\u00000\u000eH\u0002¢\u0006\u0004\bm\u0010nJ-\u0010o\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u000e2\u0006\u0010k\u001a\u00020\u00112\f\u0010l\u001a\b\u0012\u0004\u0012\u00028\u00000\u000eH\u0002¢\u0006\u0004\bo\u0010nJ5\u0010q\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u000e2\u0006\u0010k\u001a\u00020\u00112\f\u0010l\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010p\u001a\u00020\u0011H\u0002¢\u0006\u0004\bq\u0010rJ%\u0010s\u001a\u00020\u00062\u0006\u0010k\u001a\u00020\u00112\f\u0010l\u001a\b\u0012\u0004\u0012\u00028\u00000\u000eH\u0002¢\u0006\u0004\bs\u0010tJ\u0017\u0010v\u001a\u00020\u00062\u0006\u0010u\u001a\u00020\u0011H\u0002¢\u0006\u0004\bv\u0010@J\u0017\u0010w\u001a\u00020\u00062\u0006\u0010u\u001a\u00020\u0011H\u0002¢\u0006\u0004\bw\u0010@JG\u0010{\u001a \u0012\u0004\u0012\u00020y\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u000000\u0012\u0004\u0012\u00020z\u0012\u0004\u0012\u00020\u00060x*\u0018\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00028\u0000`\u0007H\u0002¢\u0006\u0004\b{\u0010|J.\u0010\u007f\u001a\u00020\u00062\u0006\u0010}\u001a\u00020y2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u0000002\u0006\u0010~\u001a\u00020zH\u0002¢\u0006\u0005\b\u007f\u0010\u0080\u0001JO\u0010\u0082\u0001\u001a\u001d\u0012\u0004\u0012\u00020y\u0012\u0006\u0012\u0004\u0018\u00010\u001c\u0012\u0004\u0012\u00020z\u0012\u0004\u0012\u00020\u00060\u0081\u0001*\u0018\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00028\u0000`\u00072\u0006\u0010\u000b\u001a\u00028\u0000H\u0002¢\u0006\u0006\b\u0082\u0001\u0010\u0083\u0001JC\u0010\u0084\u0001\u001a\u001a\u0012\u0004\u0012\u00020y\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020z\u0012\u0004\u0012\u00020\u00060x*\u0018\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00028\u0000`\u0007H\u0002¢\u0006\u0005\b\u0084\u0001\u0010|J*\u0010\u0085\u0001\u001a\u00020\u00062\u0006\u0010}\u001a\u00020y2\u0006\u0010\u000b\u001a\u00028\u00002\u0006\u0010~\u001a\u00020zH\u0002¢\u0006\u0006\b\u0085\u0001\u0010\u0080\u0001J\u001a\u0010\u0086\u0001\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00028\u0000H\u0096@¢\u0006\u0005\b\u0086\u0001\u0010\rJ \u0010\u0087\u0001\u001a\b\u0012\u0004\u0012\u00020\u0006002\u0006\u0010\u000b\u001a\u00028\u0000H\u0016¢\u0006\u0006\b\u0087\u0001\u0010\u0088\u0001J \u0010\u0089\u0001\u001a\b\u0012\u0004\u0012\u00020\u0006002\u0006\u0010\u000b\u001a\u00028\u0000H\u0004¢\u0006\u0006\b\u0089\u0001\u0010\u0088\u0001J\u0011\u0010\u008a\u0001\u001a\u00020\u0006H\u0014¢\u0006\u0005\b\u008a\u0001\u00109J\u0011\u0010\u008b\u0001\u001a\u00020\u0006H\u0014¢\u0006\u0005\b\u008b\u0001\u00109J\u0013\u0010\u008c\u0001\u001a\u00028\u0000H\u0096@¢\u0006\u0006\b\u008c\u0001\u0010\u008d\u0001J\u0019\u0010\u008e\u0001\u001a\b\u0012\u0004\u0012\u00028\u000000H\u0096@¢\u0006\u0006\b\u008e\u0001\u0010\u008d\u0001J\u0018\u0010\u008f\u0001\u001a\b\u0012\u0004\u0012\u00028\u000000H\u0016¢\u0006\u0006\b\u008f\u0001\u0010\u0090\u0001J\u001a\u0010\u0092\u0001\u001a\u00020\u00062\u0007\u0010\u0091\u0001\u001a\u00020\u0011H\u0004¢\u0006\u0005\b\u0092\u0001\u0010@J\u0019\u0010\u0093\u0001\u001a\u00020\u00062\u0006\u0010i\u001a\u00020\u0011H\u0000¢\u0006\u0005\b\u0093\u0001\u0010@J\u001a\u0010\u0095\u0001\u001a\t\u0012\u0004\u0012\u00028\u00000\u0094\u0001H\u0096\u0002¢\u0006\u0006\b\u0095\u0001\u0010\u0096\u0001J\u0011\u0010\u0097\u0001\u001a\u00020\u0006H\u0014¢\u0006\u0005\b\u0097\u0001\u00109J\u001c\u0010\u0098\u0001\u001a\u00020\u001e2\b\u0010}\u001a\u0004\u0018\u00010yH\u0016¢\u0006\u0006\b\u0098\u0001\u0010\u0099\u0001J\"\u0010\u009c\u0001\u001a\u00020\u00062\u0010\u0010}\u001a\f\u0018\u00010\u009a\u0001j\u0005\u0018\u0001`\u009b\u0001¢\u0006\u0006\b\u009c\u0001\u0010\u009d\u0001J\u001c\u0010\u009e\u0001\u001a\u00020\u001e2\b\u0010}\u001a\u0004\u0018\u00010yH\u0010¢\u0006\u0006\b\u009e\u0001\u0010\u0099\u0001J%\u0010 \u0001\u001a\u00020\u001e2\b\u0010}\u001a\u0004\u0018\u00010y2\u0007\u0010\u009f\u0001\u001a\u00020\u001eH\u0014¢\u0006\u0006\b \u0001\u0010¡\u0001J:\u0010¥\u0001\u001a\u00020\u00062&\u0010¤\u0001\u001a!\u0012\u0017\u0012\u0015\u0018\u00010y¢\u0006\u000e\b¢\u0001\u0012\t\b£\u0001\u0012\u0004\b\b(}\u0012\u0004\u0012\u00020\u00060\u0005H\u0016¢\u0006\u0006\b¥\u0001\u0010¦\u0001J\u0012\u0010§\u0001\u001a\u00020\u001eH\u0000¢\u0006\u0006\b§\u0001\u0010¨\u0001J\u0013\u0010ª\u0001\u001a\u00030©\u0001H\u0016¢\u0006\u0006\bª\u0001\u0010«\u0001R\u0015\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b:\u0010¬\u0001R0\u0010\b\u001a\u001c\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`\u00078\u0000X\u0081\u0004¢\u0006\b\n\u0006\b\u00ad\u0001\u0010®\u0001R\u0098\u0001\u0010´\u0001\u001a|\u0012\u0019\u0012\u0017\u0012\u0002\b\u00030A¢\u0006\u000e\b¢\u0001\u0012\t\b£\u0001\u0012\u0004\b\b(B\u0012\u0018\u0012\u0016\u0018\u00010\u001c¢\u0006\u000f\b¢\u0001\u0012\n\b£\u0001\u0012\u0005\b\b(¯\u0001\u0012\u0018\u0012\u0016\u0018\u00010\u001c¢\u0006\u000f\b¢\u0001\u0012\n\b£\u0001\u0012\u0005\b\b(°\u0001\u0012\u001f\u0012\u001d\u0012\u0004\u0012\u00020y\u0012\u0006\u0012\u0004\u0018\u00010\u001c\u0012\u0004\u0012\u00020z\u0012\u0004\u0012\u00020\u00060\u0081\u0001\u0018\u00010\u0081\u0001j\u0005\u0018\u0001`±\u00018\u0002X\u0082\u0004¢\u0006\u000f\n\u0006\b¥\u0001\u0010²\u0001\u0012\u0005\b³\u0001\u00109R\u0017\u0010·\u0001\u001a\u00020\u00118BX\u0082\u0004¢\u0006\b\u001a\u0006\bµ\u0001\u0010¶\u0001R\u0017\u0010¹\u0001\u001a\u00020\u001e8BX\u0082\u0004¢\u0006\b\u001a\u0006\b¸\u0001\u0010¨\u0001R\u0017\u0010¼\u0001\u001a\u00020y8BX\u0082\u0004¢\u0006\b\u001a\u0006\bº\u0001\u0010»\u0001R\u001a\u0010¾\u0001\u001a\u00020\u001e*\u00020\u00118BX\u0082\u0004¢\u0006\u0007\u001a\u0005\b½\u0001\u0010%R\u001a\u0010À\u0001\u001a\u00020\u001e*\u00020\u00118BX\u0082\u0004¢\u0006\u0007\u001a\u0005\b¿\u0001\u0010%R\u0016\u0010\\\u001a\u00020\u00118@X\u0080\u0004¢\u0006\b\u001a\u0006\bÁ\u0001\u0010¶\u0001R\u0017\u0010Ã\u0001\u001a\u00020\u00118@X\u0080\u0004¢\u0006\b\u001a\u0006\bÂ\u0001\u0010¶\u0001R%\u0010È\u0001\u001a\t\u0012\u0004\u0012\u00028\u00000Ä\u00018VX\u0096\u0004¢\u0006\u000f\u0012\u0005\bÇ\u0001\u00109\u001a\u0006\bÅ\u0001\u0010Æ\u0001R+\u0010Ë\u0001\u001a\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u0000000Ä\u00018VX\u0096\u0004¢\u0006\u000f\u0012\u0005\bÊ\u0001\u00109\u001a\u0006\bÉ\u0001\u0010Æ\u0001R\u0019\u0010Í\u0001\u001a\u0004\u0018\u00010y8DX\u0084\u0004¢\u0006\b\u001a\u0006\bÌ\u0001\u0010»\u0001R\u0017\u0010Ï\u0001\u001a\u00020y8DX\u0084\u0004¢\u0006\b\u001a\u0006\bÎ\u0001\u0010»\u0001R\u0017\u0010Ñ\u0001\u001a\u00020\u001e8TX\u0094\u0004¢\u0006\b\u001a\u0006\bÐ\u0001\u0010¨\u0001R\u001e\u0010Ô\u0001\u001a\u00020\u001e8VX\u0097\u0004¢\u0006\u000f\u0012\u0005\bÓ\u0001\u00109\u001a\u0006\bÒ\u0001\u0010¨\u0001R\u001d\u0010f\u001a\u00020\u001e8VX\u0097\u0004¢\u0006\u000f\u0012\u0005\bÖ\u0001\u00109\u001a\u0006\bÕ\u0001\u0010¨\u0001R\r\u0010Ø\u0001\u001a\u00030×\u00018\u0002X\u0082\u0004R\r\u0010Ù\u0001\u001a\u00030×\u00018\u0002X\u0082\u0004R\r\u0010Ú\u0001\u001a\u00030×\u00018\u0002X\u0082\u0004R\r\u0010Û\u0001\u001a\u00030×\u00018\u0002X\u0082\u0004R\u0019\u0010Ý\u0001\u001a\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000e0Ü\u00018\u0002X\u0082\u0004R\u0019\u0010Þ\u0001\u001a\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000e0Ü\u00018\u0002X\u0082\u0004R\u0019\u0010ß\u0001\u001a\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000e0Ü\u00018\u0002X\u0082\u0004R\u0015\u0010à\u0001\u001a\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u001c0Ü\u00018\u0002X\u0082\u0004R\u0015\u0010á\u0001\u001a\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u001c0Ü\u00018\u0002X\u0082\u0004¨\u0006â\u0001"}, m90084d2 = {"Lkotlinx/coroutines/channels/BufferedChannel;", ExifInterface.LONGITUDE_EAST, "Lkotlinx/coroutines/channels/d;", "", "capacity", "Lkotlin/Function1;", "", "Lkotlinx/coroutines/internal/OnUndeliveredElement;", "onUndeliveredElement", "<init>", "(ILkotlin/jvm/functions/Function1;)V", "element", "N0", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlinx/coroutines/channels/h;", "segment", "index", "", CmcdData.Factory.STREAMING_FORMAT_SS, "h1", "(Lkotlinx/coroutines/channels/h;ILjava/lang/Object;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlinx/coroutines/z2;", "U0", "(Lkotlinx/coroutines/z2;Lkotlinx/coroutines/channels/h;I)V", "Lkotlinx/coroutines/m;", "cont", "O0", "(Ljava/lang/Object;Lkotlinx/coroutines/m;)V", "", "waiter", "", "closed", "q1", "(Lkotlinx/coroutines/channels/h;ILjava/lang/Object;JLjava/lang/Object;Z)I", "r1", "curSendersAndCloseStatus", "i1", "(J)Z", "curSenders", "P", "j1", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "r", ICustomDataEditor.STRING_ARRAY_PARAM_1, "(Lkotlinx/coroutines/channels/h;IJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "T0", "L0", "(Lkotlinx/coroutines/m;)V", "Lkotlinx/coroutines/channels/ChannelResult;", "Z0", "K0", "o1", "(Lkotlinx/coroutines/channels/h;IJLjava/lang/Object;)Ljava/lang/Object;", "p1", "k1", "(Ljava/lang/Object;Lkotlinx/coroutines/channels/h;I)Z", "Y", "()V", "b", "m1", "(Lkotlinx/coroutines/channels/h;IJ)Z", ICustomDataEditor.NUMBER_PARAM_1, "nAttempts", "s0", "(J)V", "Lkotlinx/coroutines/selects/i;", "select", "ignoredParam", "b1", "(Lkotlinx/coroutines/selects/i;Ljava/lang/Object;)V", "M0", "(Lkotlinx/coroutines/selects/i;)V", "selectResult", "V0", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "W0", "u0", "F0", "E0", "D0", ExifInterface.LONGITUDE_WEST, "sendersCur", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "(J)Lkotlinx/coroutines/channels/h;", "U", ExifInterface.LATITUDE_SOUTH, "()Lkotlinx/coroutines/channels/h;", "lastSegment", "C0", "(Lkotlinx/coroutines/channels/h;)J", "c1", "(Lkotlinx/coroutines/channels/h;)V", "sendersCounter", "R", "(Lkotlinx/coroutines/channels/h;J)V", "d1", "(Lkotlinx/coroutines/z2;)V", "e1", "receiver", "f1", "(Lkotlinx/coroutines/z2;Z)V", "sendersAndCloseStatusCur", "isClosedForReceive", "w0", "(JZ)Z", "globalIndex", "v0", "id", "startFrom", "b0", "(JLkotlinx/coroutines/channels/h;)Lkotlinx/coroutines/channels/h;", "a0", "currentBufferEndCounter", "Z", "(JLkotlinx/coroutines/channels/h;J)Lkotlinx/coroutines/channels/h;", "G0", "(JLkotlinx/coroutines/channels/h;)V", "value", "t1", ICustomDataEditor.STRING_PARAM_1, "Lkotlin/reflect/KFunction3;", "", "Lkotlin/coroutines/CoroutineContext;", "O", "(Lkotlin/jvm/functions/Function1;)Lkotlin/reflect/KFunction;", "cause", "context", "H0", "(Ljava/lang/Throwable;Ljava/lang/Object;Lkotlin/coroutines/CoroutineContext;)V", "Lkotlin/Function3;", "L", "(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lkotlin/jvm/functions/Function3;", "M", "I0", C33675gh.f70005k, "e", "(Ljava/lang/Object;)Ljava/lang/Object;", "l1", "Q0", "P0", "D", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "p", "o", "()Ljava/lang/Object;", "globalCellIndex", "X", "u1", "Lkotlinx/coroutines/channels/f;", "iterator", "()Lkotlinx/coroutines/channels/f;", "J0", "F", "(Ljava/lang/Throwable;)Z", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Ljava/util/concurrent/CancellationException;)V", "Q", "cancel", ExifInterface.GPS_DIRECTION_TRUE, "(Ljava/lang/Throwable;Z)Z", "Lkotlin/ParameterName;", "name", "handler", "d", "(Lkotlin/jvm/functions/Function1;)V", "r0", "()Z", "", "toString", "()Ljava/lang/String;", "I", "c", "Lkotlin/jvm/functions/Function1;", "param", "internalResult", "Lkotlinx/coroutines/selects/OnCancellationConstructor;", "Lkotlin/jvm/functions/Function3;", "getOnUndeliveredElementReceiveCancellationConstructor$annotations", "onUndeliveredElementReceiveCancellationConstructor", "d0", "()J", "bufferEndCounter", "B0", "isRendezvousOrUnlimited", "i0", "()Ljava/lang/Throwable;", "receiveException", "z0", "isClosedForSend0", "y0", "isClosedForReceive0", "p0", "l0", "receiversCounter", "Lkotlinx/coroutines/selects/f;", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "()Lkotlinx/coroutines/selects/f;", "getOnReceive$annotations", "onReceive", "f", "getOnReceiveCatching$annotations", "onReceiveCatching", "f0", "closeCause", "m0", "sendException", "A0", "isConflatedDropOldest", "q", "isClosedForSend$annotations", "isClosedForSend", "x0", "isClosedForReceive$annotations", "Lkotlinx/atomicfu/AtomicLong;", "sendersAndCloseStatus", "receivers", "bufferEnd", "completedExpandBuffersAndPauseFlag", "Lkotlinx/atomicfu/AtomicRef;", "sendSegment", "receiveSegment", "bufferEndSegment", "_closeCause", "closeHandler", "kotlinx-coroutines-core"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nBufferedChannel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BufferedChannel.kt\nkotlinx/coroutines/channels/BufferedChannel\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 BufferedChannel.kt\nkotlinx/coroutines/channels/BufferedChannelKt\n+ 4 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n+ 5 DispatchedTask.kt\nkotlinx/coroutines/DispatchedTaskKt\n+ 6 StackTraceRecovery.kt\nkotlinx/coroutines/internal/StackTraceRecoveryKt\n+ 7 BufferedChannel.kt\nkotlinx/coroutines/channels/BufferedChannel$sendImpl$1\n+ 8 BufferedChannel.kt\nkotlinx/coroutines/channels/BufferedChannel$receiveImpl$1\n+ 9 InlineList.kt\nkotlinx/coroutines/internal/InlineList\n+ 10 ConcurrentLinkedList.kt\nkotlinx/coroutines/internal/ConcurrentLinkedListKt\n+ 11 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,3116:1\n270#1,6:3119\n277#1,68:3126\n394#1,18:3217\n241#1:3235\n266#1,10:3236\n277#1,48:3247\n415#1:3295\n331#1,14:3296\n419#1,3:3311\n241#1:3324\n266#1,10:3325\n277#1,68:3336\n241#1:3414\n266#1,10:3415\n277#1,68:3426\n241#1:3498\n266#1,10:3499\n277#1,68:3510\n241#1:3579\n266#1,10:3580\n277#1,68:3591\n906#1,52:3661\n984#1,8:3717\n878#1:3725\n902#1,33:3726\n994#1:3759\n936#1,14:3760\n955#1,3:3775\n999#1,6:3778\n906#1,52:3792\n984#1,8:3848\n878#1:3856\n902#1,33:3857\n994#1:3890\n936#1,14:3891\n955#1,3:3906\n999#1,6:3909\n878#1:3924\n902#1,48:3925\n955#1,3:3974\n878#1:3977\n902#1,48:3978\n955#1,3:4027\n241#1:4039\n266#1,10:4040\n277#1,68:4051\n878#1:4120\n902#1,48:4121\n955#1,3:4170\n1#2:3117\n3099#3:3118\n3099#3:3125\n3099#3:3246\n3099#3:3335\n3099#3:3425\n3099#3:3497\n3099#3:3509\n3099#3:3590\n3099#3:3660\n3099#3:3923\n3099#3:4030\n3099#3:4031\n3113#3:4032\n3113#3:4033\n3112#3:4034\n3112#3:4035\n3112#3:4036\n3113#3:4037\n3112#3:4038\n3099#3:4050\n3100#3:4173\n3099#3:4174\n3099#3:4175\n3099#3:4176\n3100#3:4177\n3099#3:4178\n3100#3:4201\n3099#3:4202\n3099#3:4203\n3100#3:4204\n3099#3:4254\n3100#3:4255\n3100#3:4256\n3100#3:4274\n3100#3:4275\n426#4,9:3194\n435#4,2:3211\n444#4,4:3213\n448#4,8:3314\n426#4,9:3405\n435#4,2:3495\n444#4,4:3713\n448#4,8:3784\n444#4,4:3844\n448#4,8:3915\n204#5:3203\n205#5:3206\n204#5:3207\n205#5:3210\n57#6,2:3204\n57#6,2:3208\n57#6,2:3322\n266#7:3310\n266#7:3404\n266#7:3494\n266#7:3578\n266#7:3659\n266#7:4119\n902#8:3774\n902#8:3905\n902#8:3973\n902#8:4026\n902#8:4169\n33#9,11:4179\n33#9,11:4190\n68#10,3:4205\n42#10,8:4208\n68#10,3:4216\n42#10,8:4219\n42#10,8:4227\n68#10,3:4235\n42#10,8:4238\n42#10,8:4246\n774#11:4257\n865#11,2:4258\n2318#11,14:4260\n774#11:4276\n865#11,2:4277\n2318#11,14:4279\n774#11:4293\n865#11,2:4294\n2318#11,14:4296\n*S KotlinDebug\n*F\n+ 1 BufferedChannel.kt\nkotlinx/coroutines/channels/BufferedChannel\n*L\n110#1:3119,6\n110#1:3126,68\n151#1:3217,18\n151#1:3235\n151#1:3236,10\n151#1:3247,48\n151#1:3295\n151#1:3296,14\n151#1:3311,3\n191#1:3324\n191#1:3325,10\n191#1:3336,68\n222#1:3414\n222#1:3415,10\n222#1:3426,68\n353#1:3498\n353#1:3499,10\n353#1:3510,68\n411#1:3579\n411#1:3580,10\n411#1:3591,68\n687#1:3661,52\n716#1:3717,8\n716#1:3725\n716#1:3726,33\n716#1:3759\n716#1:3760,14\n716#1:3775,3\n716#1:3778,6\n752#1:3792,52\n768#1:3848,8\n768#1:3856\n768#1:3857,33\n768#1:3890\n768#1:3891,14\n768#1:3906,3\n768#1:3909,6\n801#1:3924\n801#1:3925,48\n801#1:3974,3\n991#1:3977\n991#1:3978,48\n991#1:4027,3\n1484#1:4039\n1484#1:4040,10\n1484#1:4051,68\n1532#1:4120\n1532#1:4121,48\n1532#1:4170,3\n67#1:3118\n110#1:3125\n151#1:3246\n191#1:3335\n222#1:3425\n275#1:3497\n353#1:3509\n411#1:3590\n626#1:3660\n791#1:3923\n1027#1:4030\n1076#1:4031\n1394#1:4032\n1396#1:4033\n1426#1:4034\n1436#1:4035\n1445#1:4036\n1446#1:4037\n1453#1:4038\n1484#1:4050\n1898#1:4173\n1900#1:4174\n1902#1:4175\n1915#1:4176\n1926#1:4177\n1927#1:4178\n2229#1:4201\n2242#1:4202\n2252#1:4203\n2255#1:4204\n2572#1:4254\n2574#1:4255\n2599#1:4256\n2661#1:4274\n2662#1:4275\n131#1:3194,9\n131#1:3211,2\n150#1:3213,4\n150#1:3314,8\n218#1:3405,9\n218#1:3495,2\n715#1:3713,4\n715#1:3784,8\n766#1:3844,4\n766#1:3915,8\n135#1:3203\n135#1:3206\n138#1:3207\n138#1:3210\n135#1:3204,2\n138#1:3208,2\n180#1:3322,2\n151#1:3310\n191#1:3404\n222#1:3494\n353#1:3578\n411#1:3659\n1484#1:4119\n716#1:3774\n768#1:3905\n801#1:3973\n991#1:4026\n1532#1:4169\n2131#1:4179,11\n2186#1:4190,11\n2394#1:4205,3\n2394#1:4208,8\n2449#1:4216,3\n2449#1:4219,8\n2468#1:4227,8\n2498#1:4235,3\n2498#1:4238,8\n2559#1:4246,8\n2608#1:4257\n2608#1:4258,2\n2609#1:4260,14\n2673#1:4276\n2673#1:4277,2\n2674#1:4279,14\n2714#1:4293\n2714#1:4294,2\n2715#1:4296,14\n*E\n"})
public class BufferedChannel<E> implements InterfaceC41565d<E> {

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ AtomicLongFieldUpdater f91472e = AtomicLongFieldUpdater.newUpdater(BufferedChannel.class, "sendersAndCloseStatus$volatile");

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ AtomicLongFieldUpdater f91473f = AtomicLongFieldUpdater.newUpdater(BufferedChannel.class, "receivers$volatile");

    /* JADX INFO: renamed from: g */
    public static final /* synthetic */ AtomicLongFieldUpdater f91474g = AtomicLongFieldUpdater.newUpdater(BufferedChannel.class, "bufferEnd$volatile");

    /* JADX INFO: renamed from: h */
    public static final /* synthetic */ AtomicLongFieldUpdater f91475h = AtomicLongFieldUpdater.newUpdater(BufferedChannel.class, "completedExpandBuffersAndPauseFlag$volatile");

    /* JADX INFO: renamed from: i */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f91476i = AtomicReferenceFieldUpdater.newUpdater(BufferedChannel.class, Object.class, "sendSegment$volatile");

    /* JADX INFO: renamed from: j */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f91477j = AtomicReferenceFieldUpdater.newUpdater(BufferedChannel.class, Object.class, "receiveSegment$volatile");

    /* JADX INFO: renamed from: k */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f91478k = AtomicReferenceFieldUpdater.newUpdater(BufferedChannel.class, Object.class, "bufferEndSegment$volatile");

    /* JADX INFO: renamed from: l */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f91479l = AtomicReferenceFieldUpdater.newUpdater(BufferedChannel.class, Object.class, "_closeCause$volatile");

    /* JADX INFO: renamed from: m */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f91480m = AtomicReferenceFieldUpdater.newUpdater(BufferedChannel.class, Object.class, "closeHandler$volatile");
    private volatile /* synthetic */ Object _closeCause$volatile;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final int capacity;
    private volatile /* synthetic */ long bufferEnd$volatile;
    private volatile /* synthetic */ Object bufferEndSegment$volatile;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @JvmField
    @Nullable
    public final Function1<E, Unit> onUndeliveredElement;
    private volatile /* synthetic */ Object closeHandler$volatile;
    private volatile /* synthetic */ long completedExpandBuffersAndPauseFlag$volatile;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    public final Function3<InterfaceC41754i<?>, Object, Object, Function3<Throwable, Object, CoroutineContext, Unit>> onUndeliveredElementReceiveCancellationConstructor;
    private volatile /* synthetic */ Object receiveSegment$volatile;
    private volatile /* synthetic */ long receivers$volatile;
    private volatile /* synthetic */ Object sendSegment$volatile;
    private volatile /* synthetic */ long sendersAndCloseStatus$volatile;

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.BufferedChannel$a */
    /* JADX INFO: compiled from: BufferedChannel.kt */
    @Metadata(m90083d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005H\u0096B¢\u0006\u0004\b\u0006\u0010\u0007J#\u0010\r\u001a\u00020\f2\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00028\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\f¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J.\u0010\u001b\u001a\u00020\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u00182\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\u0019H\u0082@¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\fH\u0002¢\u0006\u0004\b\u001d\u0010\u0015R\u0018\u0010!\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u001e\u0010%\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$¨\u0006&"}, m90084d2 = {"Lkotlinx/coroutines/channels/BufferedChannel$a;", "Lkotlinx/coroutines/channels/f;", "Lkotlinx/coroutines/z2;", "<init>", "(Lkotlinx/coroutines/channels/BufferedChannel;)V", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Log0/x;", "segment", "", "index", "", "e", "(Log0/x;I)V", "next", "()Ljava/lang/Object;", "element", "i", "(Ljava/lang/Object;)Z", "j", "()V", "g", "()Z", "Lkotlinx/coroutines/channels/h;", "", "r", "f", "(Lkotlinx/coroutines/channels/h;IJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", CmcdData.Factory.STREAMING_FORMAT_HLS, "", "b", "Ljava/lang/Object;", "receiveResult", "Lkotlinx/coroutines/o;", "c", "Lkotlinx/coroutines/o;", "continuation", "kotlinx-coroutines-core"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nBufferedChannel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BufferedChannel.kt\nkotlinx/coroutines/channels/BufferedChannel$BufferedChannelIterator\n+ 2 BufferedChannel.kt\nkotlinx/coroutines/channels/BufferedChannel\n+ 3 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n+ 4 BufferedChannel.kt\nkotlinx/coroutines/channels/BufferedChannel$receiveImpl$1\n+ 5 StackTraceRecovery.kt\nkotlinx/coroutines/internal/StackTraceRecoveryKt\n+ 6 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,3116:1\n906#2,52:3117\n984#2,8:3173\n878#2:3181\n902#2,33:3182\n994#2:3215\n936#2,14:3216\n955#2,3:3231\n999#2,6:3234\n444#3,4:3169\n448#3,8:3240\n902#4:3230\n57#5,2:3248\n57#5,2:3251\n1#6:3250\n*S KotlinDebug\n*F\n+ 1 BufferedChannel.kt\nkotlinx/coroutines/channels/BufferedChannel$BufferedChannelIterator\n*L\n1619#1:3117,52\n1657#1:3173,8\n1657#1:3181\n1657#1:3182,33\n1657#1:3215\n1657#1:3216,14\n1657#1:3231,3\n1657#1:3234,6\n1655#1:3169,4\n1655#1:3240,8\n1657#1:3230\n1693#1:3248,2\n1741#1:3251,2\n*E\n"})
    public final class C41557a implements InterfaceC41567f<E>, InterfaceC41784z2 {

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @Nullable
        public Object receiveResult = BufferedChannelKt.f91504p;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        @Nullable
        public C41716o<? super Boolean> continuation;

        public C41557a() {
        }

        @Override // kotlinx.coroutines.channels.InterfaceC41567f
        @Nullable
        /* JADX INFO: renamed from: a */
        public Object mo90631a(@NotNull Continuation<? super Boolean> continuation) throws Throwable {
            C41569h<E> c41569hM90586a0;
            boolean zM90634g = true;
            if (this.receiveResult == BufferedChannelKt.f91504p || this.receiveResult == BufferedChannelKt.m90667z()) {
                BufferedChannel<E> bufferedChannel = BufferedChannel.this;
                C41569h<E> c41569h = (C41569h) BufferedChannel.m90527j0().get(bufferedChannel);
                while (!bufferedChannel.m90625x0()) {
                    long andIncrement = BufferedChannel.m90529k0().getAndIncrement(bufferedChannel);
                    int i11 = BufferedChannelKt.f91490b;
                    long j11 = andIncrement / ((long) i11);
                    int i12 = (int) (andIncrement % ((long) i11));
                    if (c41569h.id != j11) {
                        c41569hM90586a0 = bufferedChannel.m90586a0(j11, c41569h);
                        if (c41569hM90586a0 == null) {
                            continue;
                        }
                    } else {
                        c41569hM90586a0 = c41569h;
                    }
                    Object objM90610o1 = bufferedChannel.m90610o1(c41569hM90586a0, i12, andIncrement, null);
                    if (objM90610o1 == BufferedChannelKt.f91501m) {
                        throw new IllegalStateException("unreachable");
                    }
                    if (objM90610o1 == BufferedChannelKt.f91503o) {
                        if (andIncrement < bufferedChannel.m90612p0()) {
                            c41569hM90586a0.m94549c();
                        }
                        c41569h = c41569hM90586a0;
                    } else {
                        if (objM90610o1 == BufferedChannelKt.f91502n) {
                            return m90633f(c41569hM90586a0, i12, andIncrement, continuation);
                        }
                        c41569hM90586a0.m94549c();
                        this.receiveResult = objM90610o1;
                    }
                }
                zM90634g = m90634g();
            }
            return Boxing.boxBoolean(zM90634g);
        }

        @Override // kotlinx.coroutines.InterfaceC41784z2
        /* JADX INFO: renamed from: e */
        public void mo90632e(@NotNull AbstractC43081x<?> segment, int index) {
            C41716o<? super Boolean> c41716o = this.continuation;
            if (c41716o != null) {
                c41716o.mo90632e(segment, index);
            }
        }

        /* JADX INFO: renamed from: f */
        public final Object m90633f(C41569h<E> c41569h, int i11, long j11, Continuation<? super Boolean> continuation) throws Throwable {
            Boolean boolBoxBoolean;
            C41569h c41569hM90586a0;
            BufferedChannel<E> bufferedChannel = BufferedChannel.this;
            C41716o c41716oM91187b = C41724q.m91187b(IntrinsicsKt.intercepted(continuation));
            try {
                this.continuation = c41716oM91187b;
                try {
                    Object objM90610o1 = bufferedChannel.m90610o1(c41569h, i11, j11, this);
                    if (objM90610o1 != BufferedChannelKt.f91501m) {
                        Function3 function3M90560L = null;
                        if (objM90610o1 == BufferedChannelKt.f91503o) {
                            if (j11 < bufferedChannel.m90612p0()) {
                                c41569h.m94549c();
                            }
                            C41569h c41569h2 = (C41569h) BufferedChannel.m90527j0().get(bufferedChannel);
                            while (true) {
                                if (bufferedChannel.m90625x0()) {
                                    m90635h();
                                    break;
                                }
                                long andIncrement = BufferedChannel.m90529k0().getAndIncrement(bufferedChannel);
                                int i12 = BufferedChannelKt.f91490b;
                                long j12 = andIncrement / ((long) i12);
                                int i13 = (int) (andIncrement % ((long) i12));
                                if (c41569h2.id != j12) {
                                    c41569hM90586a0 = bufferedChannel.m90586a0(j12, c41569h2);
                                    if (c41569hM90586a0 == null) {
                                    }
                                } else {
                                    c41569hM90586a0 = c41569h2;
                                }
                                Object objM90610o2 = bufferedChannel.m90610o1(c41569hM90586a0, i13, andIncrement, this);
                                if (objM90610o2 == BufferedChannelKt.f91501m) {
                                    bufferedChannel.m90574T0(this, c41569hM90586a0, i13);
                                    break;
                                }
                                if (objM90610o2 == BufferedChannelKt.f91503o) {
                                    if (andIncrement < bufferedChannel.m90612p0()) {
                                        c41569hM90586a0.m94549c();
                                    }
                                    c41569h2 = c41569hM90586a0;
                                } else {
                                    if (objM90610o2 == BufferedChannelKt.f91502n) {
                                        throw new IllegalStateException("unexpected");
                                    }
                                    c41569hM90586a0.m94549c();
                                    this.receiveResult = objM90610o2;
                                    this.continuation = null;
                                    boolBoxBoolean = Boxing.boxBoolean(true);
                                    Function1<E, Unit> function1 = bufferedChannel.onUndeliveredElement;
                                    if (function1 != null) {
                                        function3M90560L = bufferedChannel.m90560L(function1, objM90610o2);
                                    }
                                }
                            }
                        } else {
                            c41569h.m94549c();
                            this.receiveResult = objM90610o1;
                            this.continuation = null;
                            boolBoxBoolean = Boxing.boxBoolean(true);
                            Function1<E, Unit> function2 = bufferedChannel.onUndeliveredElement;
                            if (function2 != null) {
                                function3M90560L = bufferedChannel.m90560L(function2, objM90610o1);
                            }
                        }
                        c41716oM91187b.mo91117r(boolBoxBoolean, function3M90560L);
                        break;
                    }
                    bufferedChannel.m90574T0(this, c41569h, i11);
                    Object objM91171w = c41716oM91187b.m91171w();
                    if (objM91171w == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                        DebugProbesKt.probeCoroutineSuspended(continuation);
                    }
                    return objM91171w;
                } catch (Throwable th2) {
                    th = th2;
                    Throwable th3 = th;
                    c41716oM91187b.m91149N();
                    throw th3;
                }
            } catch (Throwable th4) {
                th = th4;
            }
        }

        /* JADX INFO: renamed from: h */
        public final void m90635h() {
            C41716o<? super Boolean> c41716o = this.continuation;
            Intrinsics.checkNotNull(c41716o);
            this.continuation = null;
            this.receiveResult = BufferedChannelKt.m90667z();
            Throwable thM90597f0 = BufferedChannel.this.m90597f0();
            if (thM90597f0 == null) {
                Result.Companion companion = Result.INSTANCE;
                c41716o.resumeWith(Result.m103844constructorimpl(Boolean.FALSE));
            } else {
                Result.Companion companion2 = Result.INSTANCE;
                c41716o.resumeWith(Result.m103844constructorimpl(ResultKt.createFailure(thM90597f0)));
            }
        }

        /* JADX INFO: renamed from: i */
        public final boolean m90636i(E element) {
            C41716o<? super Boolean> c41716o = this.continuation;
            Intrinsics.checkNotNull(c41716o);
            this.continuation = null;
            this.receiveResult = element;
            Boolean bool = Boolean.TRUE;
            BufferedChannel<E> bufferedChannel = BufferedChannel.this;
            Function1<E, Unit> function1 = bufferedChannel.onUndeliveredElement;
            return BufferedChannelKt.m90640B(c41716o, bool, function1 != null ? bufferedChannel.m90560L(function1, element) : null);
        }

        /* JADX INFO: renamed from: j */
        public final void m90637j() {
            C41716o<? super Boolean> c41716o = this.continuation;
            Intrinsics.checkNotNull(c41716o);
            this.continuation = null;
            this.receiveResult = BufferedChannelKt.m90667z();
            Throwable thM90597f0 = BufferedChannel.this.m90597f0();
            if (thM90597f0 == null) {
                Result.Companion companion = Result.INSTANCE;
                c41716o.resumeWith(Result.m103844constructorimpl(Boolean.FALSE));
            } else {
                Result.Companion companion2 = Result.INSTANCE;
                c41716o.resumeWith(Result.m103844constructorimpl(ResultKt.createFailure(thM90597f0)));
            }
        }

        @Override // kotlinx.coroutines.channels.InterfaceC41567f
        public E next() throws Throwable {
            E e11 = (E) this.receiveResult;
            if (e11 == BufferedChannelKt.f91504p) {
                throw new IllegalStateException("`hasNext()` has not been invoked");
            }
            this.receiveResult = BufferedChannelKt.f91504p;
            if (e11 != BufferedChannelKt.m90667z()) {
                return e11;
            }
            throw C43083z.m94649a(BufferedChannel.this.m90600i0());
        }

        /* JADX INFO: renamed from: g */
        public final boolean m90634g() throws Throwable {
            this.receiveResult = BufferedChannelKt.m90667z();
            Throwable thM90597f0 = BufferedChannel.this.m90597f0();
            if (thM90597f0 == null) {
                return false;
            }
            throw C43083z.m94649a(thM90597f0);
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.BufferedChannel$b */
    /* JADX INFO: compiled from: BufferedChannel.kt */
    @Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001J$\u0010\u0007\u001a\u00020\u00062\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0096\u0001¢\u0006\u0004\b\u0007\u0010\bR\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0010"}, m90084d2 = {"Lkotlinx/coroutines/channels/BufferedChannel$b;", "Lkotlinx/coroutines/z2;", "Log0/x;", "segment", "", "index", "", "e", "(Log0/x;I)V", "Lkotlinx/coroutines/m;", "", "c", "Lkotlinx/coroutines/m;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "()Lkotlinx/coroutines/m;", "cont", "kotlinx-coroutines-core"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
    public static final class C41558b implements InterfaceC41784z2 {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C41716o<Boolean> f91487b;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        @NotNull
        public final InterfaceC41708m<Boolean> cont;

        @NotNull
        /* JADX INFO: renamed from: a */
        public final InterfaceC41708m<Boolean> m90638a() {
            return this.cont;
        }

        @Override // kotlinx.coroutines.InterfaceC41784z2
        /* JADX INFO: renamed from: e */
        public void mo90632e(@NotNull AbstractC43081x<?> segment, int index) {
            this.f91487b.mo90632e(segment, index);
        }
    }

    /* JADX INFO: renamed from: A0 */
    public boolean mo90547A0() {
        return false;
    }

    @Override // kotlinx.coroutines.channels.InterfaceC41577p
    /* JADX INFO: renamed from: F */
    public boolean mo90553F(@Nullable Throwable cause) {
        return m90573T(cause, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: R */
    public final void m90571R(C41569h<E> lastSegment, long sendersCounter) {
        Object objM94597b = C43062j.m94597b(null, 1, null);
        loop0: while (lastSegment != null) {
            for (int i11 = BufferedChannelKt.f91490b - 1; -1 < i11; i11--) {
                if ((lastSegment.id * ((long) BufferedChannelKt.f91490b)) + ((long) i11) < sendersCounter) {
                    break loop0;
                }
                while (true) {
                    Object objM90693B = lastSegment.m90693B(i11);
                    if (objM90693B != null && objM90693B != BufferedChannelKt.f91493e) {
                        if (!(objM90693B instanceof WaiterEB)) {
                            if (!(objM90693B instanceof InterfaceC41784z2)) {
                                break;
                            }
                            if (lastSegment.m90701v(i11, objM90693B, BufferedChannelKt.m90667z())) {
                                objM94597b = C43062j.m94598c(objM94597b, objM90693B);
                                lastSegment.m90694C(i11, true);
                                break;
                            }
                        } else {
                            if (lastSegment.m90701v(i11, objM90693B, BufferedChannelKt.m90667z())) {
                                objM94597b = C43062j.m94598c(objM94597b, ((WaiterEB) objM90693B).waiter);
                                lastSegment.m90694C(i11, true);
                                break;
                            }
                        }
                    } else {
                        if (lastSegment.m90701v(i11, objM90693B, BufferedChannelKt.m90667z())) {
                            lastSegment.m94644t();
                            break;
                        }
                    }
                }
            }
            lastSegment = (C41569h) lastSegment.m94554h();
        }
        if (objM94597b != null) {
            if (!(objM94597b instanceof ArrayList)) {
                m90593d1((InterfaceC41784z2) objM94597b);
                return;
            }
            Intrinsics.checkNotNull(objM94597b, "null cannot be cast to non-null type java.util.ArrayList<E of kotlinx.coroutines.internal.InlineList>");
            ArrayList arrayList = (ArrayList) objM94597b;
            for (int size = arrayList.size() - 1; -1 < size; size--) {
                m90593d1((InterfaceC41784z2) arrayList.get(size));
            }
        }
    }

    /* JADX INFO: renamed from: Z */
    public final C41569h<E> m90583Z(long id2, C41569h<E> startFrom, long currentBufferEndCounter) {
        Object objM94537c;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f91478k;
        Function2 function2 = (Function2) BufferedChannelKt.m90666y();
        loop0: while (true) {
            objM94537c = C43046b.m94537c(startFrom, id2, function2);
            if (!C43082y.m94648c(objM94537c)) {
                AbstractC43081x abstractC43081xM94647b = C43082y.m94647b(objM94537c);
                while (true) {
                    AbstractC43081x abstractC43081x = (AbstractC43081x) atomicReferenceFieldUpdater.get(this);
                    if (abstractC43081x.id >= abstractC43081xM94647b.id) {
                        break loop0;
                    }
                    if (!abstractC43081xM94647b.m94645u()) {
                        break;
                    }
                    if (C1481a.m2260a(atomicReferenceFieldUpdater, this, abstractC43081x, abstractC43081xM94647b)) {
                        if (!abstractC43081x.m94643p()) {
                            break loop0;
                        }
                        abstractC43081x.m94558n();
                        break loop0;
                    }
                    if (abstractC43081xM94647b.m94643p()) {
                        abstractC43081xM94647b.m94558n();
                    }
                }
            } else {
                break;
            }
        }
        if (C43082y.m94648c(objM94537c)) {
            m90579W();
            m90555G0(id2, startFrom);
            m90539t0(this, 0L, 1, null);
            return null;
        }
        C41569h<E> c41569h = (C41569h) C43082y.m94647b(objM94537c);
        if (c41569h.id <= id2) {
            return c41569h;
        }
        long j11 = c41569h.id;
        int i11 = BufferedChannelKt.f91490b;
        if (f91474g.compareAndSet(this, currentBufferEndCounter + 1, j11 * ((long) i11))) {
            m90618s0((c41569h.id * ((long) i11)) - currentBufferEndCounter);
        } else {
            m90539t0(this, 0L, 1, null);
        }
        return null;
    }

    /* JADX INFO: renamed from: d1 */
    public final void m90593d1(InterfaceC41784z2 interfaceC41784z2) {
        m90598f1(interfaceC41784z2, true);
    }

    /* JADX INFO: renamed from: e1 */
    public final void m90595e1(InterfaceC41784z2 interfaceC41784z2) {
        m90598f1(interfaceC41784z2, false);
    }

    /* JADX INFO: renamed from: y0 */
    public final boolean m90626y0(long j11) {
        return m90624w0(j11, true);
    }

    /* JADX INFO: renamed from: z0 */
    public final boolean m90627z0(long j11) {
        return m90624w0(j11, false);
    }

    /* JADX INFO: renamed from: R0 */
    public static final Function3 m90512R0(final BufferedChannel bufferedChannel, final InterfaceC41754i interfaceC41754i, Object obj, final Object obj2) {
        return new Function3() { // from class: kotlinx.coroutines.channels.c
            @Override // p852kotlin.jvm.functions.Function3
            public final Object invoke(Object obj3, Object obj4, Object obj5) {
                return BufferedChannel.m90513S0(obj2, bufferedChannel, interfaceC41754i, (Throwable) obj3, obj4, (CoroutineContext) obj5);
            }
        };
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: Y0 */
    public static /* synthetic */ <E> Object m90515Y0(BufferedChannel<E> bufferedChannel, Continuation<? super ChannelResult<? extends E>> continuation) throws Throwable {
        BufferedChannel$receiveCatching$1 bufferedChannel$receiveCatching$1;
        C41569h<E> c41569h;
        if (continuation instanceof BufferedChannel$receiveCatching$1) {
            bufferedChannel$receiveCatching$1 = (BufferedChannel$receiveCatching$1) continuation;
            int i11 = bufferedChannel$receiveCatching$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                bufferedChannel$receiveCatching$1.label = i11 - Integer.MIN_VALUE;
            } else {
                bufferedChannel$receiveCatching$1 = new BufferedChannel$receiveCatching$1(bufferedChannel, continuation);
            }
        } else {
            bufferedChannel$receiveCatching$1 = new BufferedChannel$receiveCatching$1(bufferedChannel, continuation);
        }
        BufferedChannel$receiveCatching$1 bufferedChannel$receiveCatching$2 = bufferedChannel$receiveCatching$1;
        Object obj = bufferedChannel$receiveCatching$2.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = bufferedChannel$receiveCatching$2.label;
        if (i12 != 0) {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return ((ChannelResult) obj).getHolder();
        }
        ResultKt.throwOnFailure(obj);
        C41569h<E> c41569h2 = (C41569h) m90527j0().get(bufferedChannel);
        while (!bufferedChannel.m90625x0()) {
            long andIncrement = m90529k0().getAndIncrement(bufferedChannel);
            int i13 = BufferedChannelKt.f91490b;
            long j11 = andIncrement / ((long) i13);
            int i14 = (int) (andIncrement % ((long) i13));
            if (c41569h2.id != j11) {
                C41569h<E> c41569hM90586a0 = bufferedChannel.m90586a0(j11, c41569h2);
                if (c41569hM90586a0 == null) {
                    continue;
                } else {
                    c41569h = c41569hM90586a0;
                }
            } else {
                c41569h = c41569h2;
            }
            BufferedChannel<E> bufferedChannel2 = bufferedChannel;
            Object objM90610o1 = bufferedChannel2.m90610o1(c41569h, i14, andIncrement, null);
            if (objM90610o1 == BufferedChannelKt.f91501m) {
                throw new IllegalStateException("unexpected");
            }
            if (objM90610o1 != BufferedChannelKt.f91503o) {
                if (objM90610o1 != BufferedChannelKt.f91502n) {
                    c41569h.m94549c();
                    return ChannelResult.INSTANCE.m105331successJP2dKIU(objM90610o1);
                }
                bufferedChannel$receiveCatching$2.label = 1;
                Object objM90584Z0 = bufferedChannel2.m90584Z0(c41569h, i14, andIncrement, bufferedChannel$receiveCatching$2);
                return objM90584Z0 == coroutine_suspended ? coroutine_suspended : objM90584Z0;
            }
            if (andIncrement < bufferedChannel2.m90612p0()) {
                c41569h.m94549c();
            }
            bufferedChannel = bufferedChannel2;
            c41569h2 = c41569h;
        }
        return ChannelResult.INSTANCE.m105329closedJP2dKIU(bufferedChannel.m90597f0());
    }

    /* JADX INFO: renamed from: j0 */
    public static final /* synthetic */ AtomicReferenceFieldUpdater m90527j0() {
        return f91477j;
    }

    /* JADX INFO: renamed from: k0 */
    public static final /* synthetic */ AtomicLongFieldUpdater m90529k0() {
        return f91473f;
    }

    /* JADX INFO: renamed from: n0 */
    public static final /* synthetic */ AtomicReferenceFieldUpdater m90533n0() {
        return f91476i;
    }

    /* JADX INFO: renamed from: o0 */
    public static final /* synthetic */ AtomicLongFieldUpdater m90534o0() {
        return f91472e;
    }

    /* JADX INFO: renamed from: t0 */
    public static /* synthetic */ void m90539t0(BufferedChannel bufferedChannel, long j11, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: incCompletedExpandBufferAttempts");
        }
        if ((i11 & 1) != 0) {
            j11 = 1;
        }
        bufferedChannel.m90618s0(j11);
    }

    @Override // kotlinx.coroutines.channels.InterfaceC41576o
    @NotNull
    /* JADX INFO: renamed from: A */
    public InterfaceC41751f<E> mo90546A() {
        BufferedChannel$onReceive$1 bufferedChannel$onReceive$1 = BufferedChannel$onReceive$1.INSTANCE;
        Intrinsics.checkNotNull(bufferedChannel$onReceive$1, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = \"clauseObject\")] kotlin.Any, @[ParameterName(name = \"select\")] kotlinx.coroutines.selects.SelectInstance<*>, @[ParameterName(name = \"param\")] kotlin.Any?, kotlin.Unit>");
        Function3 function3 = (Function3) TypeIntrinsics.beforeCheckcastToFunctionOfArity(bufferedChannel$onReceive$1, 3);
        BufferedChannel$onReceive$2 bufferedChannel$onReceive$2 = BufferedChannel$onReceive$2.INSTANCE;
        Intrinsics.checkNotNull(bufferedChannel$onReceive$2, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = \"clauseObject\")] kotlin.Any, @[ParameterName(name = \"param\")] kotlin.Any?, @[ParameterName(name = \"clauseResult\")] kotlin.Any?, kotlin.Any?>");
        return new C41752g(this, function3, (Function3) TypeIntrinsics.beforeCheckcastToFunctionOfArity(bufferedChannel$onReceive$2, 3), this.onUndeliveredElementReceiveCancellationConstructor);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: C0 */
    public final long m90549C0(C41569h<E> lastSegment) {
        do {
            int i11 = BufferedChannelKt.f91490b;
            while (true) {
                i11--;
                if (-1 < i11) {
                    long j11 = (lastSegment.id * ((long) BufferedChannelKt.f91490b)) + ((long) i11);
                    if (j11 >= m90604l0()) {
                        while (true) {
                            Object objM90693B = lastSegment.m90693B(i11);
                            if (objM90693B != null && objM90693B != BufferedChannelKt.f91493e) {
                                if (objM90693B != BufferedChannelKt.f91492d) {
                                    break;
                                }
                                return j11;
                            }
                            if (lastSegment.m90701v(i11, objM90693B, BufferedChannelKt.m90667z())) {
                                lastSegment.m94644t();
                                break;
                            }
                        }
                    } else {
                        return -1L;
                    }
                }
            }
            lastSegment = (C41569h) lastSegment.m94554h();
        } while (lastSegment != null);
        return -1L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: G0 */
    public final void m90555G0(long id2, C41569h<E> startFrom) {
        C41569h<E> c41569h;
        C41569h<E> c41569h2;
        while (startFrom.id < id2 && (c41569h2 = (C41569h) startFrom.m94552f()) != null) {
            startFrom = c41569h2;
        }
        while (true) {
            if (!startFrom.mo94555k() || (c41569h = (C41569h) startFrom.m94552f()) == null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f91478k;
                while (true) {
                    AbstractC43081x abstractC43081x = (AbstractC43081x) atomicReferenceFieldUpdater.get(this);
                    if (abstractC43081x.id >= startFrom.id) {
                        return;
                    }
                    if (!startFrom.m94645u()) {
                        break;
                    }
                    if (C1481a.m2260a(atomicReferenceFieldUpdater, this, abstractC43081x, startFrom)) {
                        if (abstractC43081x.m94643p()) {
                            abstractC43081x.m94558n();
                            return;
                        }
                        return;
                    } else if (startFrom.m94643p()) {
                        startFrom.m94558n();
                    }
                }
            } else {
                startFrom = c41569h;
            }
        }
    }

    /* JADX INFO: renamed from: H0 */
    public final void m90556H0(Throwable cause, Object element, CoroutineContext context) {
        Function1<E, Unit> function1 = this.onUndeliveredElement;
        Intrinsics.checkNotNull(function1);
        Object objM90673f = ChannelResult.m90673f(element);
        Intrinsics.checkNotNull(objM90673f);
        C43077t.m94636a(function1, objM90673f, context);
    }

    /* JADX INFO: renamed from: I0 */
    public final void m90557I0(Throwable cause, E element, CoroutineContext context) {
        Function1<E, Unit> function1 = this.onUndeliveredElement;
        Intrinsics.checkNotNull(function1);
        C43077t.m94636a(function1, element, context);
    }

    /* JADX INFO: renamed from: K0 */
    public final void m90559K0(InterfaceC41708m<? super ChannelResult<? extends E>> cont) {
        Result.Companion companion = Result.INSTANCE;
        cont.resumeWith(Result.m103844constructorimpl(ChannelResult.m90669b(ChannelResult.INSTANCE.m105329closedJP2dKIU(m90597f0()))));
    }

    /* JADX INFO: renamed from: L */
    public final Function3<Throwable, Object, CoroutineContext, Unit> m90560L(final Function1<? super E, Unit> function1, final E e11) {
        return new Function3() { // from class: kotlinx.coroutines.channels.b
            @Override // p852kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return BufferedChannel.m90511N(function1, e11, (Throwable) obj, obj2, (CoroutineContext) obj3);
            }
        };
    }

    /* JADX INFO: renamed from: L0 */
    public final void m90561L0(InterfaceC41708m<? super E> cont) {
        Result.Companion companion = Result.INSTANCE;
        cont.resumeWith(Result.m103844constructorimpl(ResultKt.createFailure(m90600i0())));
    }

    /* JADX INFO: renamed from: M */
    public final KFunction<Unit> m90562M(Function1<? super E, Unit> function1) {
        return new BufferedChannel$bindCancellationFun$2(this);
    }

    /* JADX INFO: renamed from: N0 */
    public final Object m90564N0(E e11, Continuation<? super Unit> continuation) {
        UndeliveredElementException undeliveredElementExceptionM94638c;
        C41716o c41716o = new C41716o(IntrinsicsKt.intercepted(continuation), 1);
        c41716o.m91142E();
        Function1<E, Unit> function1 = this.onUndeliveredElement;
        if (function1 == null || (undeliveredElementExceptionM94638c = C43077t.m94638c(function1, e11, null, 2, null)) == null) {
            Throwable thM90606m0 = m90606m0();
            Result.Companion companion = Result.INSTANCE;
            c41716o.resumeWith(Result.m103844constructorimpl(ResultKt.createFailure(thM90606m0)));
        } else {
            ExceptionsKt.addSuppressed(undeliveredElementExceptionM94638c, m90606m0());
            Result.Companion companion2 = Result.INSTANCE;
            c41716o.resumeWith(Result.m103844constructorimpl(ResultKt.createFailure(undeliveredElementExceptionM94638c)));
        }
        Object objM91171w = c41716o.m91171w();
        if (objM91171w == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return objM91171w == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM91171w : Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: O */
    public final KFunction<Unit> m90565O(Function1<? super E, Unit> function1) {
        return new BufferedChannel$bindCancellationFunResult$1(this);
    }

    /* JADX INFO: renamed from: O0 */
    public final void m90566O0(E element, InterfaceC41708m<? super Unit> cont) {
        Function1<E, Unit> function1 = this.onUndeliveredElement;
        if (function1 != null) {
            C43077t.m94636a(function1, element, cont.get$context());
        }
        Throwable thM90606m0 = m90606m0();
        Result.Companion companion = Result.INSTANCE;
        cont.resumeWith(Result.m103844constructorimpl(ResultKt.createFailure(thM90606m0)));
    }

    /* JADX INFO: renamed from: Q */
    public boolean m90569Q(@Nullable Throwable cause) {
        if (cause == null) {
            cause = new CancellationException("Channel was cancelled");
        }
        return m90573T(cause, true);
    }

    /* JADX INFO: renamed from: T */
    public boolean m90573T(@Nullable Throwable cause, boolean cancel) {
        if (cancel) {
            m90551D0();
        }
        boolean zM2260a = C1481a.m2260a(f91479l, this, BufferedChannelKt.f91507s, cause);
        if (cancel) {
            m90552E0();
        } else {
            m90554F0();
        }
        m90579W();
        m90558J0();
        if (zM2260a) {
            m90621u0();
        }
        return zM2260a;
    }

    /* JADX INFO: renamed from: U0 */
    public final void m90576U0(InterfaceC41784z2 interfaceC41784z2, C41569h<E> c41569h, int i11) {
        interfaceC41784z2.mo90632e(c41569h, i11 + BufferedChannelKt.f91490b);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: Z0 */
    public final Object m90584Z0(C41569h<E> c41569h, int i11, long j11, Continuation<? super ChannelResult<? extends E>> continuation) throws Throwable {
        BufferedChannel$receiveCatchingOnNoWaiterSuspend$1 bufferedChannel$receiveCatchingOnNoWaiterSuspend$1;
        ChannelResult channelResultM90669b;
        Function3 function3;
        C41569h c41569h2;
        if (continuation instanceof BufferedChannel$receiveCatchingOnNoWaiterSuspend$1) {
            bufferedChannel$receiveCatchingOnNoWaiterSuspend$1 = (BufferedChannel$receiveCatchingOnNoWaiterSuspend$1) continuation;
            int i12 = bufferedChannel$receiveCatchingOnNoWaiterSuspend$1.label;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                bufferedChannel$receiveCatchingOnNoWaiterSuspend$1.label = i12 - Integer.MIN_VALUE;
            } else {
                bufferedChannel$receiveCatchingOnNoWaiterSuspend$1 = new BufferedChannel$receiveCatchingOnNoWaiterSuspend$1(this, continuation);
            }
        } else {
            bufferedChannel$receiveCatchingOnNoWaiterSuspend$1 = new BufferedChannel$receiveCatchingOnNoWaiterSuspend$1(this, continuation);
        }
        Object objM91171w = bufferedChannel$receiveCatchingOnNoWaiterSuspend$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i13 = bufferedChannel$receiveCatchingOnNoWaiterSuspend$1.label;
        if (i13 == 0) {
            ResultKt.throwOnFailure(objM91171w);
            bufferedChannel$receiveCatchingOnNoWaiterSuspend$1.L$0 = this;
            bufferedChannel$receiveCatchingOnNoWaiterSuspend$1.L$1 = c41569h;
            bufferedChannel$receiveCatchingOnNoWaiterSuspend$1.I$0 = i11;
            bufferedChannel$receiveCatchingOnNoWaiterSuspend$1.J$0 = j11;
            bufferedChannel$receiveCatchingOnNoWaiterSuspend$1.label = 1;
            C41716o c41716oM91187b = C41724q.m91187b(IntrinsicsKt.intercepted(bufferedChannel$receiveCatchingOnNoWaiterSuspend$1));
            try {
                Intrinsics.checkNotNull(c41716oM91187b, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuationImpl<kotlinx.coroutines.channels.ChannelResult<E of kotlinx.coroutines.channels.BufferedChannel>>");
                C41575n c41575n = new C41575n(c41716oM91187b);
                try {
                    Object objM90610o1 = m90610o1(c41569h, i11, j11, c41575n);
                    if (objM90610o1 != BufferedChannelKt.f91501m) {
                        if (objM90610o1 == BufferedChannelKt.f91503o) {
                            if (j11 < m90612p0()) {
                                c41569h.m94549c();
                            }
                            C41569h c41569h3 = (C41569h) m90527j0().get(this);
                            while (true) {
                                if (m90625x0()) {
                                    m90559K0(c41716oM91187b);
                                    break;
                                }
                                long andIncrement = m90529k0().getAndIncrement(this);
                                int i14 = BufferedChannelKt.f91490b;
                                long j12 = andIncrement / ((long) i14);
                                int i15 = (int) (andIncrement % ((long) i14));
                                if (c41569h3.id != j12) {
                                    C41569h c41569hM90586a0 = m90586a0(j12, c41569h3);
                                    if (c41569hM90586a0 != null) {
                                        c41569h2 = c41569hM90586a0;
                                    }
                                } else {
                                    c41569h2 = c41569h3;
                                }
                                Object objM90610o2 = m90610o1(c41569h2, i15, andIncrement, c41575n);
                                C41569h c41569h4 = c41569h2;
                                if (objM90610o2 == BufferedChannelKt.f91501m) {
                                    m90574T0(c41575n, c41569h4, i15);
                                    break;
                                }
                                if (objM90610o2 == BufferedChannelKt.f91503o) {
                                    if (andIncrement < m90612p0()) {
                                        c41569h4.m94549c();
                                    }
                                    c41569h3 = c41569h4;
                                } else {
                                    if (objM90610o2 == BufferedChannelKt.f91502n) {
                                        throw new IllegalStateException("unexpected");
                                    }
                                    c41569h4.m94549c();
                                    channelResultM90669b = ChannelResult.m90669b(ChannelResult.INSTANCE.m105331successJP2dKIU(objM90610o2));
                                    Function1<E, Unit> function1 = this.onUndeliveredElement;
                                    function3 = (Function3) (function1 != null ? m90565O(function1) : null);
                                }
                            }
                        } else {
                            c41569h.m94549c();
                            channelResultM90669b = ChannelResult.m90669b(ChannelResult.INSTANCE.m105331successJP2dKIU(objM90610o1));
                            Function1<E, Unit> function2 = this.onUndeliveredElement;
                            function3 = (Function3) (function2 != null ? m90565O(function2) : null);
                        }
                        c41716oM91187b.mo91117r(channelResultM90669b, function3);
                        break;
                    }
                    m90574T0(c41575n, c41569h, i11);
                    objM91171w = c41716oM91187b.m91171w();
                    if (objM91171w == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                        DebugProbesKt.probeCoroutineSuspended(bufferedChannel$receiveCatchingOnNoWaiterSuspend$1);
                    }
                    if (objM91171w == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    Throwable th3 = th;
                    c41716oM91187b.m91149N();
                    throw th3;
                }
            } catch (Throwable th4) {
                th = th4;
            }
        } else {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objM91171w);
        }
        return ((ChannelResult) objM91171w).getHolder();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: c1 */
    public final void m90590c1(C41569h<E> lastSegment) {
        Function1<E, Unit> function1 = this.onUndeliveredElement;
        UndeliveredElementException undeliveredElementExceptionM94637b = null;
        Object objM94597b = C43062j.m94597b(null, 1, null);
        loop0: do {
            for (int i11 = BufferedChannelKt.f91490b - 1; -1 < i11; i11--) {
                long j11 = (lastSegment.id * ((long) BufferedChannelKt.f91490b)) + ((long) i11);
                while (true) {
                    Object objM90693B = lastSegment.m90693B(i11);
                    if (objM90693B == BufferedChannelKt.f91497i) {
                        break loop0;
                    }
                    if (objM90693B != BufferedChannelKt.f91492d) {
                        if (objM90693B != BufferedChannelKt.f91493e && objM90693B != null) {
                            if (!(objM90693B instanceof InterfaceC41784z2) && !(objM90693B instanceof WaiterEB)) {
                                if (objM90693B != BufferedChannelKt.f91495g && objM90693B != BufferedChannelKt.f91494f) {
                                    if (objM90693B != BufferedChannelKt.f91495g) {
                                        break;
                                    }
                                } else {
                                    break loop0;
                                }
                            } else {
                                if (j11 < m90604l0()) {
                                    break loop0;
                                }
                                InterfaceC41784z2 interfaceC41784z2 = objM90693B instanceof WaiterEB ? ((WaiterEB) objM90693B).waiter : (InterfaceC41784z2) objM90693B;
                                if (lastSegment.m90701v(i11, objM90693B, BufferedChannelKt.m90667z())) {
                                    if (function1 != null) {
                                        undeliveredElementExceptionM94637b = C43077t.m94637b(function1, lastSegment.m90692A(i11), undeliveredElementExceptionM94637b);
                                    }
                                    objM94597b = C43062j.m94598c(objM94597b, interfaceC41784z2);
                                    lastSegment.m90702w(i11);
                                    lastSegment.m94644t();
                                    break;
                                }
                            }
                        } else {
                            if (lastSegment.m90701v(i11, objM90693B, BufferedChannelKt.m90667z())) {
                                lastSegment.m94644t();
                                break;
                            }
                        }
                    } else {
                        if (j11 < m90604l0()) {
                            break loop0;
                        }
                        if (lastSegment.m90701v(i11, objM90693B, BufferedChannelKt.m90667z())) {
                            if (function1 != null) {
                                undeliveredElementExceptionM94637b = C43077t.m94637b(function1, lastSegment.m90692A(i11), undeliveredElementExceptionM94637b);
                            }
                            lastSegment.m90702w(i11);
                            lastSegment.m94644t();
                            break;
                        }
                    }
                }
            }
            lastSegment = (C41569h) lastSegment.m94554h();
        } while (lastSegment != null);
        if (objM94597b != null) {
            if (objM94597b instanceof ArrayList) {
                Intrinsics.checkNotNull(objM94597b, "null cannot be cast to non-null type java.util.ArrayList<E of kotlinx.coroutines.internal.InlineList>");
                ArrayList arrayList = (ArrayList) objM94597b;
                for (int size = arrayList.size() - 1; -1 < size; size--) {
                    m90595e1((InterfaceC41784z2) arrayList.get(size));
                }
            } else {
                m90595e1((InterfaceC41784z2) objM94597b);
            }
        }
        if (undeliveredElementExceptionM94637b != null) {
            throw undeliveredElementExceptionM94637b;
        }
    }

    @Override // kotlinx.coroutines.channels.InterfaceC41576o
    @NotNull
    /* JADX INFO: renamed from: f */
    public InterfaceC41751f<ChannelResult<E>> mo90596f() {
        BufferedChannel$onReceiveCatching$1 bufferedChannel$onReceiveCatching$1 = BufferedChannel$onReceiveCatching$1.INSTANCE;
        Intrinsics.checkNotNull(bufferedChannel$onReceiveCatching$1, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = \"clauseObject\")] kotlin.Any, @[ParameterName(name = \"select\")] kotlinx.coroutines.selects.SelectInstance<*>, @[ParameterName(name = \"param\")] kotlin.Any?, kotlin.Unit>");
        Function3 function3 = (Function3) TypeIntrinsics.beforeCheckcastToFunctionOfArity(bufferedChannel$onReceiveCatching$1, 3);
        BufferedChannel$onReceiveCatching$2 bufferedChannel$onReceiveCatching$2 = BufferedChannel$onReceiveCatching$2.INSTANCE;
        Intrinsics.checkNotNull(bufferedChannel$onReceiveCatching$2, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = \"clauseObject\")] kotlin.Any, @[ParameterName(name = \"param\")] kotlin.Any?, @[ParameterName(name = \"clauseResult\")] kotlin.Any?, kotlin.Any?>");
        return new C41752g(this, function3, (Function3) TypeIntrinsics.beforeCheckcastToFunctionOfArity(bufferedChannel$onReceiveCatching$2, 3), this.onUndeliveredElementReceiveCancellationConstructor);
    }

    /* JADX INFO: renamed from: f1 */
    public final void m90598f1(InterfaceC41784z2 interfaceC41784z2, boolean z11) {
        if (interfaceC41784z2 instanceof C41558b) {
            InterfaceC41708m<Boolean> interfaceC41708mM90638a = ((C41558b) interfaceC41784z2).m90638a();
            Result.Companion companion = Result.INSTANCE;
            interfaceC41708mM90638a.resumeWith(Result.m103844constructorimpl(Boolean.FALSE));
            return;
        }
        if (interfaceC41784z2 instanceof InterfaceC41708m) {
            Continuation continuation = (Continuation) interfaceC41784z2;
            Result.Companion companion2 = Result.INSTANCE;
            continuation.resumeWith(Result.m103844constructorimpl(ResultKt.createFailure(z11 ? m90600i0() : m90606m0())));
        } else if (interfaceC41784z2 instanceof C41575n) {
            C41716o<ChannelResult<? extends E>> c41716o = ((C41575n) interfaceC41784z2).cont;
            Result.Companion companion3 = Result.INSTANCE;
            c41716o.resumeWith(Result.m103844constructorimpl(ChannelResult.m90669b(ChannelResult.INSTANCE.m105329closedJP2dKIU(m90597f0()))));
        } else if (interfaceC41784z2 instanceof C41557a) {
            ((C41557a) interfaceC41784z2).m90637j();
        } else {
            if (interfaceC41784z2 instanceof InterfaceC41754i) {
                ((InterfaceC41754i) interfaceC41784z2).mo91278f(this, BufferedChannelKt.m90667z());
                return;
            }
            throw new IllegalStateException(("Unexpected waiter: " + interfaceC41784z2).toString());
        }
    }

    @Override // kotlinx.coroutines.channels.InterfaceC41576o
    @NotNull
    public InterfaceC41567f<E> iterator() {
        return new C41557a();
    }

    /* JADX INFO: renamed from: j1 */
    public final boolean m90602j1(Object obj, E e11) {
        if (obj instanceof InterfaceC41754i) {
            return ((InterfaceC41754i) obj).mo91278f(this, e11);
        }
        if (obj instanceof C41575n) {
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.channels.ReceiveCatching<E of kotlinx.coroutines.channels.BufferedChannel>");
            C41716o<ChannelResult<? extends E>> c41716o = ((C41575n) obj).cont;
            ChannelResult channelResultM90669b = ChannelResult.m90669b(ChannelResult.INSTANCE.m105331successJP2dKIU(e11));
            Function1<E, Unit> function1 = this.onUndeliveredElement;
            return BufferedChannelKt.m90640B(c41716o, channelResultM90669b, (Function3) (function1 != null ? m90565O(function1) : null));
        }
        if (obj instanceof C41557a) {
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.channels.BufferedChannel.BufferedChannelIterator<E of kotlinx.coroutines.channels.BufferedChannel>");
            return ((C41557a) obj).m90636i(e11);
        }
        if (obj instanceof InterfaceC41708m) {
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<E of kotlinx.coroutines.channels.BufferedChannel>");
            InterfaceC41708m interfaceC41708m = (InterfaceC41708m) obj;
            Function1<E, Unit> function2 = this.onUndeliveredElement;
            return BufferedChannelKt.m90640B(interfaceC41708m, e11, (Function3) (function2 != null ? m90562M(function2) : null));
        }
        throw new IllegalStateException(("Unexpected receiver type: " + obj).toString());
    }

    /* JADX INFO: renamed from: k1 */
    public final boolean m90603k1(Object obj, C41569h<E> c41569h, int i11) {
        if (obj instanceof InterfaceC41708m) {
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
            return BufferedChannelKt.m90641C((InterfaceC41708m) obj, Unit.INSTANCE, null, 2, null);
        }
        if (obj instanceof InterfaceC41754i) {
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectImplementation<*>");
            TrySelectDetailedResult trySelectDetailedResultM91288x = ((SelectImplementation) obj).m91288x(this, Unit.INSTANCE);
            if (trySelectDetailedResultM91288x == TrySelectDetailedResult.REREGISTER) {
                c41569h.m90702w(i11);
            }
            return trySelectDetailedResultM91288x == TrySelectDetailedResult.SUCCESSFUL;
        }
        if (obj instanceof C41558b) {
            return BufferedChannelKt.m90641C(((C41558b) obj).m90638a(), Boolean.TRUE, null, 2, null);
        }
        throw new IllegalStateException(("Unexpected waiter: " + obj).toString());
    }

    @NotNull
    /* JADX INFO: renamed from: l1 */
    public final Object m90605l1(E element) {
        C41569h c41569hM90588b0;
        Object obj = BufferedChannelKt.f91492d;
        C41569h c41569h = (C41569h) m90533n0().get(this);
        while (true) {
            long andIncrement = m90534o0().getAndIncrement(this);
            long j11 = andIncrement & 1152921504606846975L;
            boolean zM90627z0 = m90627z0(andIncrement);
            int i11 = BufferedChannelKt.f91490b;
            long j12 = j11 / ((long) i11);
            int i12 = (int) (j11 % ((long) i11));
            if (c41569h.id != j12) {
                c41569hM90588b0 = m90588b0(j12, c41569h);
                if (c41569hM90588b0 == null) {
                    if (zM90627z0) {
                        return ChannelResult.INSTANCE.m105329closedJP2dKIU(m90606m0());
                    }
                }
            } else {
                c41569hM90588b0 = c41569h;
            }
            E e11 = element;
            int iM90615q1 = m90615q1(c41569hM90588b0, i12, e11, j11, obj, zM90627z0);
            c41569h = c41569hM90588b0;
            if (iM90615q1 == 0) {
                c41569h.m94549c();
                return ChannelResult.INSTANCE.m105331successJP2dKIU(Unit.INSTANCE);
            }
            if (iM90615q1 == 1) {
                return ChannelResult.INSTANCE.m105331successJP2dKIU(Unit.INSTANCE);
            }
            if (iM90615q1 == 2) {
                if (zM90627z0) {
                    c41569h.m94644t();
                    return ChannelResult.INSTANCE.m105329closedJP2dKIU(m90606m0());
                }
                InterfaceC41784z2 interfaceC41784z2 = obj instanceof InterfaceC41784z2 ? (InterfaceC41784z2) obj : null;
                if (interfaceC41784z2 != null) {
                    m90576U0(interfaceC41784z2, c41569h, i12);
                }
                m90581X((c41569h.id * ((long) i11)) + ((long) i12));
                return ChannelResult.INSTANCE.m105331successJP2dKIU(Unit.INSTANCE);
            }
            if (iM90615q1 == 3) {
                throw new IllegalStateException("unexpected");
            }
            if (iM90615q1 == 4) {
                if (j11 < m90604l0()) {
                    c41569h.m94549c();
                }
                return ChannelResult.INSTANCE.m105329closedJP2dKIU(m90606m0());
            }
            if (iM90615q1 == 5) {
                c41569h.m94549c();
            }
            element = e11;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public String toString() {
        String string;
        StringBuilder sb2 = new StringBuilder();
        int i11 = (int) (f91472e.get(this) >> 60);
        if (i11 == 2) {
            sb2.append("closed,");
        } else if (i11 == 3) {
            sb2.append("cancelled,");
        }
        sb2.append("capacity=" + this.capacity + ',');
        sb2.append("data=[");
        int i12 = 0;
        boolean z11 = true;
        List listListOf = CollectionsKt.listOf((Object[]) new C41569h[]{f91477j.get(this), f91476i.get(this), f91478k.get(this)});
        ArrayList arrayList = new ArrayList();
        for (Object obj : listListOf) {
            if (((C41569h) obj) != BufferedChannelKt.f91489a) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        Object next = it.next();
        if (it.hasNext()) {
            long j11 = ((C41569h) next).id;
            do {
                Object next2 = it.next();
                long j12 = ((C41569h) next2).id;
                if (j11 > j12) {
                    next = next2;
                    j11 = j12;
                }
            } while (it.hasNext());
        }
        C41569h c41569h = (C41569h) next;
        long jM90604l0 = m90604l0();
        long jM90612p0 = m90612p0();
        loop2: while (true) {
            int i13 = BufferedChannelKt.f91490b;
            int i14 = i12;
            while (i14 < i13) {
                long j13 = (c41569h.id * ((long) BufferedChannelKt.f91490b)) + ((long) i14);
                if (j13 >= jM90612p0 && j13 >= jM90604l0) {
                    break loop2;
                }
                Object objM90693B = c41569h.m90693B(i14);
                Object objM90692A = c41569h.m90692A(i14);
                boolean z12 = z11;
                if (objM90693B instanceof InterfaceC41708m) {
                    string = (j13 >= jM90604l0 || j13 < jM90612p0) ? (j13 >= jM90612p0 || j13 < jM90604l0) ? "cont" : C33675gh.f70005k : "receive";
                } else if (objM90693B instanceof InterfaceC41754i) {
                    string = (j13 >= jM90604l0 || j13 < jM90612p0) ? (j13 >= jM90612p0 || j13 < jM90604l0) ? "select" : "onSend" : "onReceive";
                } else if (objM90693B instanceof C41575n) {
                    string = "receiveCatching";
                } else if (objM90693B instanceof C41558b) {
                    string = "sendBroadcast";
                } else if (objM90693B instanceof WaiterEB) {
                    string = "EB(" + objM90693B + ')';
                } else if (Intrinsics.areEqual(objM90693B, BufferedChannelKt.f91494f) || Intrinsics.areEqual(objM90693B, BufferedChannelKt.f91495g)) {
                    string = "resuming_sender";
                } else {
                    if (objM90693B != null && !Intrinsics.areEqual(objM90693B, BufferedChannelKt.f91493e) && !Intrinsics.areEqual(objM90693B, BufferedChannelKt.f91497i) && !Intrinsics.areEqual(objM90693B, BufferedChannelKt.f91496h) && !Intrinsics.areEqual(objM90693B, BufferedChannelKt.f91499k) && !Intrinsics.areEqual(objM90693B, BufferedChannelKt.f91498j) && !Intrinsics.areEqual(objM90693B, BufferedChannelKt.m90667z())) {
                        string = objM90693B.toString();
                    }
                    i14++;
                    z11 = z12;
                }
                if (objM90692A != null) {
                    sb2.append('(' + string + ',' + objM90692A + "),");
                } else {
                    sb2.append(string + ',');
                }
                i14++;
                z11 = z12;
            }
            boolean z13 = z11;
            c41569h = (C41569h) c41569h.m94552f();
            if (c41569h == null) {
                break;
            }
            z11 = z13;
            i12 = 0;
        }
        if (StringsKt.last(sb2) == ',') {
            Intrinsics.checkNotNullExpressionValue(sb2.deleteCharAt(sb2.length() - 1), "deleteCharAt(...)");
        }
        sb2.append("]");
        return sb2.toString();
    }

    /* JADX INFO: renamed from: u1 */
    public final void m90622u1(long globalIndex) {
        BufferedChannel<E> bufferedChannel = this;
        if (bufferedChannel.m90548B0()) {
            return;
        }
        while (bufferedChannel.m90592d0() <= globalIndex) {
            bufferedChannel = this;
        }
        int i11 = BufferedChannelKt.f91491c;
        for (int i12 = 0; i12 < i11; i12++) {
            long jM90592d0 = bufferedChannel.m90592d0();
            if (jM90592d0 == (DurationKt.MAX_MILLIS & f91475h.get(bufferedChannel)) && jM90592d0 == bufferedChannel.m90592d0()) {
                return;
            }
        }
        AtomicLongFieldUpdater atomicLongFieldUpdater = f91475h;
        while (true) {
            long j11 = atomicLongFieldUpdater.get(bufferedChannel);
            if (atomicLongFieldUpdater.compareAndSet(bufferedChannel, j11, BufferedChannelKt.m90663v(j11 & DurationKt.MAX_MILLIS, true))) {
                break;
            } else {
                bufferedChannel = this;
            }
        }
        while (true) {
            long jM90592d1 = bufferedChannel.m90592d0();
            long j12 = f91475h.get(bufferedChannel);
            long j13 = j12 & DurationKt.MAX_MILLIS;
            boolean z11 = (Longs.MAX_POWER_OF_TWO & j12) != 0;
            if (jM90592d1 == j13 && jM90592d1 == bufferedChannel.m90592d0()) {
                break;
            }
            if (z11) {
                bufferedChannel = this;
            } else {
                bufferedChannel = this;
                f91475h.compareAndSet(bufferedChannel, j12, BufferedChannelKt.m90663v(j13, true));
            }
        }
        AtomicLongFieldUpdater atomicLongFieldUpdater2 = f91475h;
        while (true) {
            long j14 = atomicLongFieldUpdater2.get(bufferedChannel);
            boolean zCompareAndSet = atomicLongFieldUpdater2.compareAndSet(bufferedChannel, j14, BufferedChannelKt.m90663v(j14 & DurationKt.MAX_MILLIS, false));
            AtomicLongFieldUpdater atomicLongFieldUpdater3 = atomicLongFieldUpdater2;
            if (zCompareAndSet) {
                return;
            }
            atomicLongFieldUpdater2 = atomicLongFieldUpdater3;
            bufferedChannel = this;
        }
    }

    /* JADX INFO: renamed from: w0 */
    public final boolean m90624w0(long sendersAndCloseStatusCur, boolean isClosedForReceive) {
        int i11 = (int) (sendersAndCloseStatusCur >> 60);
        if (i11 == 0 || i11 == 1) {
            return false;
        }
        if (i11 == 2) {
            m90577V(sendersAndCloseStatusCur & 1152921504606846975L);
            return (isClosedForReceive && m90616r0()) ? false : true;
        }
        if (i11 == 3) {
            m90575U(sendersAndCloseStatusCur & 1152921504606846975L);
            return true;
        }
        throw new IllegalStateException(("unexpected close status: " + i11).toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BufferedChannel(int i11, @Nullable Function1<? super E, Unit> function1) {
        Function3<InterfaceC41754i<?>, Object, Object, Function3<Throwable, Object, CoroutineContext, Unit>> function3;
        this.capacity = i11;
        this.onUndeliveredElement = function1;
        if (i11 >= 0) {
            this.bufferEnd$volatile = BufferedChannelKt.m90639A(i11);
            this.completedExpandBuffersAndPauseFlag$volatile = m90592d0();
            C41569h c41569h = new C41569h(0L, null, this, 3);
            this.sendSegment$volatile = c41569h;
            this.receiveSegment$volatile = c41569h;
            if (m90548B0()) {
                c41569h = BufferedChannelKt.f91489a;
                Intrinsics.checkNotNull(c41569h, "null cannot be cast to non-null type kotlinx.coroutines.channels.ChannelSegment<E of kotlinx.coroutines.channels.BufferedChannel>");
            }
            this.bufferEndSegment$volatile = c41569h;
            if (function1 != 0) {
                function3 = new Function3() { // from class: kotlinx.coroutines.channels.a
                    @Override // p852kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        return BufferedChannel.m90512R0(this.f91513b, (InterfaceC41754i) obj, obj2, obj3);
                    }
                };
            } else {
                function3 = null;
            }
            this.onUndeliveredElementReceiveCancellationConstructor = function3;
            this._closeCause$volatile = BufferedChannelKt.f91507s;
            return;
        }
        throw new IllegalArgumentException(("Invalid channel capacity: " + i11 + ", should be >=0").toString());
    }

    /* JADX INFO: renamed from: N */
    public static final Unit m90511N(Function1 function1, Object obj, Throwable th2, Object obj2, CoroutineContext coroutineContext) {
        C43077t.m94636a(function1, obj, coroutineContext);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: S0 */
    public static final Unit m90513S0(Object obj, BufferedChannel bufferedChannel, InterfaceC41754i interfaceC41754i, Throwable th2, Object obj2, CoroutineContext coroutineContext) {
        if (obj != BufferedChannelKt.m90667z()) {
            C43077t.m94636a(bufferedChannel.onUndeliveredElement, obj, interfaceC41754i.getContext());
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: X0 */
    public static /* synthetic */ <E> Object m90514X0(BufferedChannel<E> bufferedChannel, Continuation<? super E> continuation) throws Throwable {
        C41569h<E> c41569h;
        C41569h<E> c41569h2 = (C41569h) m90527j0().get(bufferedChannel);
        while (!bufferedChannel.m90625x0()) {
            long andIncrement = m90529k0().getAndIncrement(bufferedChannel);
            int i11 = BufferedChannelKt.f91490b;
            long j11 = andIncrement / ((long) i11);
            int i12 = (int) (andIncrement % ((long) i11));
            if (c41569h2.id != j11) {
                C41569h<E> c41569hM90586a0 = bufferedChannel.m90586a0(j11, c41569h2);
                if (c41569hM90586a0 == null) {
                    continue;
                } else {
                    c41569h = c41569hM90586a0;
                }
            } else {
                c41569h = c41569h2;
            }
            BufferedChannel<E> bufferedChannel2 = bufferedChannel;
            Object objM90610o1 = bufferedChannel2.m90610o1(c41569h, i12, andIncrement, null);
            if (objM90610o1 != BufferedChannelKt.f91501m) {
                if (objM90610o1 == BufferedChannelKt.f91503o) {
                    if (andIncrement < bufferedChannel2.m90612p0()) {
                        c41569h.m94549c();
                    }
                    bufferedChannel = bufferedChannel2;
                    c41569h2 = c41569h;
                } else {
                    if (objM90610o1 == BufferedChannelKt.f91502n) {
                        return bufferedChannel2.m90587a1(c41569h, i12, andIncrement, continuation);
                    }
                    c41569h.m94549c();
                    return objM90610o1;
                }
            } else {
                throw new IllegalStateException("unexpected");
            }
        }
        throw C43083z.m94649a(bufferedChannel.m90600i0());
    }

    /* JADX INFO: renamed from: g1 */
    public static /* synthetic */ <E> Object m90522g1(BufferedChannel<E> bufferedChannel, E e11, Continuation<? super Unit> continuation) {
        C41569h<E> c41569h;
        C41569h<E> c41569h2 = (C41569h) m90533n0().get(bufferedChannel);
        while (true) {
            long andIncrement = m90534o0().getAndIncrement(bufferedChannel);
            long j11 = andIncrement & 1152921504606846975L;
            boolean zM90627z0 = bufferedChannel.m90627z0(andIncrement);
            int i11 = BufferedChannelKt.f91490b;
            long j12 = j11 / ((long) i11);
            int i12 = (int) (j11 % ((long) i11));
            if (c41569h2.id != j12) {
                C41569h<E> c41569hM90588b0 = bufferedChannel.m90588b0(j12, c41569h2);
                if (c41569hM90588b0 == null) {
                    if (zM90627z0) {
                        Object objM90564N0 = bufferedChannel.m90564N0(e11, continuation);
                        if (objM90564N0 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                            break;
                        }
                        return objM90564N0;
                    }
                } else {
                    c41569h = c41569hM90588b0;
                }
            } else {
                c41569h = c41569h2;
            }
            BufferedChannel<E> bufferedChannel2 = bufferedChannel;
            E e12 = e11;
            int iM90615q1 = bufferedChannel2.m90615q1(c41569h, i12, e12, j11, null, zM90627z0);
            if (iM90615q1 != 0) {
                if (iM90615q1 != 1) {
                    if (iM90615q1 != 2) {
                        if (iM90615q1 != 3) {
                            if (iM90615q1 != 4) {
                                if (iM90615q1 == 5) {
                                    c41569h.m94549c();
                                }
                                bufferedChannel = bufferedChannel2;
                                c41569h2 = c41569h;
                                e11 = e12;
                            } else {
                                if (j11 < bufferedChannel2.m90604l0()) {
                                    c41569h.m94549c();
                                }
                                Object objM90564N1 = bufferedChannel2.m90564N0(e12, continuation);
                                if (objM90564N1 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                                    break;
                                }
                                return objM90564N1;
                            }
                        } else {
                            Object objM90599h1 = bufferedChannel2.m90599h1(c41569h, i12, e12, j11, continuation);
                            if (objM90599h1 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                                break;
                            }
                            return objM90599h1;
                        }
                    } else {
                        if (!zM90627z0) {
                            break;
                        }
                        c41569h.m94644t();
                        Object objM90564N2 = bufferedChannel2.m90564N0(e12, continuation);
                        if (objM90564N2 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                            break;
                        }
                        return objM90564N2;
                    }
                } else {
                    break;
                }
            } else {
                c41569h.m94549c();
                break;
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: B0 */
    public final boolean m90548B0() {
        long jM90592d0 = m90592d0();
        if (jM90592d0 != 0 && jM90592d0 != Long.MAX_VALUE) {
            return false;
        }
        return true;
    }

    @Override // kotlinx.coroutines.channels.InterfaceC41576o
    @Nullable
    /* JADX INFO: renamed from: D */
    public Object mo90550D(@NotNull Continuation<? super E> continuation) {
        return m90514X0(this, continuation);
    }

    /* JADX INFO: renamed from: D0 */
    public final void m90551D0() {
        long j11;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f91472e;
        do {
            j11 = atomicLongFieldUpdater.get(this);
            if (((int) (j11 >> 60)) != 0) {
                return;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j11, BufferedChannelKt.m90664w(1152921504606846975L & j11, 1)));
    }

    /* JADX INFO: renamed from: E0 */
    public final void m90552E0() {
        long j11;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f91472e;
        do {
            j11 = atomicLongFieldUpdater.get(this);
        } while (!atomicLongFieldUpdater.compareAndSet(this, j11, BufferedChannelKt.m90664w(1152921504606846975L & j11, 3)));
    }

    /* JADX INFO: renamed from: F0 */
    public final void m90554F0() {
        long j11;
        long jM90664w;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f91472e;
        do {
            j11 = atomicLongFieldUpdater.get(this);
            int i11 = (int) (j11 >> 60);
            if (i11 == 0) {
                jM90664w = BufferedChannelKt.m90664w(1152921504606846975L & j11, 2);
            } else if (i11 == 1) {
                jM90664w = BufferedChannelKt.m90664w(1152921504606846975L & j11, 3);
            } else {
                return;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j11, jM90664w));
    }

    /* JADX INFO: renamed from: M0 */
    public final void m90563M0(InterfaceC41754i<?> select) {
        select.mo91276c(BufferedChannelKt.m90667z());
    }

    /* JADX INFO: renamed from: P */
    public final boolean m90567P(long curSenders) {
        if (curSenders >= m90592d0() && curSenders >= m90604l0() + ((long) this.capacity)) {
            return false;
        }
        return true;
    }

    /* JADX INFO: renamed from: S */
    public final C41569h<E> m90572S() {
        Object obj = f91478k.get(this);
        C41569h c41569h = (C41569h) f91476i.get(this);
        if (c41569h.id > ((C41569h) obj).id) {
            obj = c41569h;
        }
        C41569h c41569h2 = (C41569h) f91477j.get(this);
        if (c41569h2.id > ((C41569h) obj).id) {
            obj = c41569h2;
        }
        return (C41569h) C43046b.m94536b((AbstractC43048c) obj);
    }

    /* JADX INFO: renamed from: T0 */
    public final void m90574T0(InterfaceC41784z2 interfaceC41784z2, C41569h<E> c41569h, int i11) {
        m90570Q0();
        interfaceC41784z2.mo90632e(c41569h, i11);
    }

    /* JADX INFO: renamed from: U */
    public final void m90575U(long sendersCur) {
        m90590c1(m90577V(sendersCur));
    }

    /* JADX INFO: renamed from: V */
    public final C41569h<E> m90577V(long sendersCur) {
        C41569h<E> c41569hM90572S = m90572S();
        if (mo90547A0()) {
            long jM90549C0 = m90549C0(c41569hM90572S);
            if (jM90549C0 != -1) {
                m90581X(jM90549C0);
            }
        }
        m90571R(c41569hM90572S, sendersCur);
        return c41569hM90572S;
    }

    /* JADX INFO: renamed from: V0 */
    public final Object m90578V0(Object ignoredParam, Object selectResult) throws Throwable {
        if (selectResult != BufferedChannelKt.m90667z()) {
            return selectResult;
        }
        throw m90600i0();
    }

    /* JADX INFO: renamed from: W */
    public final void m90579W() {
        mo90614q();
    }

    /* JADX INFO: renamed from: W0 */
    public final Object m90580W0(Object ignoredParam, Object selectResult) {
        Object objM105331successJP2dKIU;
        if (selectResult == BufferedChannelKt.m90667z()) {
            objM105331successJP2dKIU = ChannelResult.INSTANCE.m105329closedJP2dKIU(m90597f0());
        } else {
            objM105331successJP2dKIU = ChannelResult.INSTANCE.m105331successJP2dKIU(selectResult);
        }
        return ChannelResult.m90669b(objM105331successJP2dKIU);
    }

    /* JADX INFO: renamed from: X */
    public final void m90581X(long globalCellIndex) {
        C41569h<E> c41569hM90586a0;
        UndeliveredElementException undeliveredElementExceptionM94638c;
        C41569h<E> c41569h = (C41569h) f91477j.get(this);
        while (true) {
            long j11 = f91473f.get(this);
            if (globalCellIndex < Math.max(((long) this.capacity) + j11, m90592d0())) {
                return;
            }
            if (f91473f.compareAndSet(this, j11, 1 + j11)) {
                int i11 = BufferedChannelKt.f91490b;
                long j12 = j11 / ((long) i11);
                int i12 = (int) (j11 % ((long) i11));
                if (c41569h.id != j12) {
                    c41569hM90586a0 = m90586a0(j12, c41569h);
                    if (c41569hM90586a0 == null) {
                        continue;
                    }
                } else {
                    c41569hM90586a0 = c41569h;
                }
                Object objM90610o1 = m90610o1(c41569hM90586a0, i12, j11, null);
                if (objM90610o1 == BufferedChannelKt.f91503o) {
                    if (j11 < m90612p0()) {
                        c41569hM90586a0.m94549c();
                    }
                } else {
                    c41569hM90586a0.m94549c();
                    Function1<E, Unit> function1 = this.onUndeliveredElement;
                    if (function1 != null && (undeliveredElementExceptionM94638c = C43077t.m94638c(function1, objM90610o1, null, 2, null)) != null) {
                        throw undeliveredElementExceptionM94638c;
                    }
                }
                c41569h = c41569hM90586a0;
            }
        }
    }

    /* JADX INFO: renamed from: Y */
    public final void m90582Y() {
        if (m90548B0()) {
            return;
        }
        C41569h<E> c41569h = (C41569h) f91478k.get(this);
        while (true) {
            long andIncrement = f91474g.getAndIncrement(this);
            int i11 = BufferedChannelKt.f91490b;
            long j11 = andIncrement / ((long) i11);
            if (m90612p0() <= andIncrement) {
                if (c41569h.id < j11 && c41569h.m94552f() != 0) {
                    m90555G0(j11, c41569h);
                }
                m90539t0(this, 0L, 1, null);
                return;
            }
            if (c41569h.id != j11) {
                C41569h<E> c41569hM90583Z = m90583Z(j11, c41569h, andIncrement);
                if (c41569hM90583Z == null) {
                    continue;
                } else {
                    c41569h = c41569hM90583Z;
                }
            }
            if (m90607m1(c41569h, (int) (andIncrement % ((long) i11)), andIncrement)) {
                m90539t0(this, 0L, 1, null);
                return;
            }
            m90539t0(this, 0L, 1, null);
        }
    }

    @Override // kotlinx.coroutines.channels.InterfaceC41576o
    /* JADX INFO: renamed from: a */
    public final void mo90585a(@Nullable CancellationException cause) {
        m90569Q(cause);
    }

    /* JADX INFO: renamed from: a0 */
    public final C41569h<E> m90586a0(long id2, C41569h<E> startFrom) {
        Object objM94537c;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f91477j;
        Function2 function2 = (Function2) BufferedChannelKt.m90666y();
        loop0: while (true) {
            objM94537c = C43046b.m94537c(startFrom, id2, function2);
            if (!C43082y.m94648c(objM94537c)) {
                AbstractC43081x abstractC43081xM94647b = C43082y.m94647b(objM94537c);
                while (true) {
                    AbstractC43081x abstractC43081x = (AbstractC43081x) atomicReferenceFieldUpdater.get(this);
                    if (abstractC43081x.id >= abstractC43081xM94647b.id) {
                        break loop0;
                    }
                    if (!abstractC43081xM94647b.m94645u()) {
                        break;
                    }
                    if (C1481a.m2260a(atomicReferenceFieldUpdater, this, abstractC43081x, abstractC43081xM94647b)) {
                        if (!abstractC43081x.m94643p()) {
                            break loop0;
                        }
                        abstractC43081x.m94558n();
                        break loop0;
                    }
                    if (abstractC43081xM94647b.m94643p()) {
                        abstractC43081xM94647b.m94558n();
                    }
                }
            } else {
                break;
            }
        }
        if (C43082y.m94648c(objM94537c)) {
            m90579W();
            if (startFrom.id * ((long) BufferedChannelKt.f91490b) < m90612p0()) {
                startFrom.m94549c();
            }
            return null;
        }
        C41569h<E> c41569h = (C41569h) C43082y.m94647b(objM94537c);
        if (!m90548B0() && id2 <= m90592d0() / ((long) BufferedChannelKt.f91490b)) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f91478k;
            while (true) {
                AbstractC43081x abstractC43081x2 = (AbstractC43081x) atomicReferenceFieldUpdater2.get(this);
                if (abstractC43081x2.id >= c41569h.id || !c41569h.m94645u()) {
                    break;
                }
                if (C1481a.m2260a(atomicReferenceFieldUpdater2, this, abstractC43081x2, c41569h)) {
                    if (!abstractC43081x2.m94643p()) {
                        break;
                    }
                    abstractC43081x2.m94558n();
                    break;
                }
                if (c41569h.m94643p()) {
                    c41569h.m94558n();
                }
            }
        }
        long j11 = c41569h.id;
        if (j11 > id2) {
            int i11 = BufferedChannelKt.f91490b;
            m90619s1(j11 * ((long) i11));
            if (c41569h.id * ((long) i11) < m90612p0()) {
                c41569h.m94549c();
            }
            return null;
        }
        return c41569h;
    }

    /* JADX INFO: renamed from: a1 */
    public final Object m90587a1(C41569h<E> c41569h, int i11, long j11, Continuation<? super E> continuation) {
        Function3 function3;
        C41569h c41569h2;
        C41716o c41716oM91187b = C41724q.m91187b(IntrinsicsKt.intercepted(continuation));
        try {
            Object objM90610o1 = m90610o1(c41569h, i11, j11, c41716oM91187b);
            if (objM90610o1 == BufferedChannelKt.f91501m) {
                m90574T0(c41716oM91187b, c41569h, i11);
            } else {
                KFunction kFunctionM90562M = null;
                KFunction kFunctionM90562M2 = null;
                C41716o c41716o = null;
                if (objM90610o1 == BufferedChannelKt.f91503o) {
                    if (j11 < m90612p0()) {
                        c41569h.m94549c();
                    }
                    C41569h c41569h3 = (C41569h) m90527j0().get(this);
                    while (true) {
                        if (m90625x0()) {
                            m90561L0(c41716oM91187b);
                            break;
                        }
                        long andIncrement = m90529k0().getAndIncrement(this);
                        int i12 = BufferedChannelKt.f91490b;
                        long j12 = andIncrement / ((long) i12);
                        int i13 = (int) (andIncrement % ((long) i12));
                        if (c41569h3.id != j12) {
                            C41569h c41569hM90586a0 = m90586a0(j12, c41569h3);
                            if (c41569hM90586a0 != null) {
                                c41569h2 = c41569hM90586a0;
                            }
                        } else {
                            c41569h2 = c41569h3;
                        }
                        objM90610o1 = m90610o1(c41569h2, i13, andIncrement, c41716oM91187b);
                        C41569h c41569h4 = c41569h2;
                        if (objM90610o1 == BufferedChannelKt.f91501m) {
                            if (c41716oM91187b != null) {
                                c41716o = c41716oM91187b;
                            }
                            if (c41716o == null) {
                                break;
                            }
                            m90574T0(c41716o, c41569h4, i13);
                            break;
                        }
                        if (objM90610o1 == BufferedChannelKt.f91503o) {
                            if (andIncrement < m90612p0()) {
                                c41569h4.m94549c();
                            }
                            c41569h3 = c41569h4;
                        } else if (objM90610o1 != BufferedChannelKt.f91502n) {
                            c41569h4.m94549c();
                            Function1<E, Unit> function1 = this.onUndeliveredElement;
                            if (function1 != null) {
                                kFunctionM90562M2 = m90562M(function1);
                            }
                            function3 = (Function3) kFunctionM90562M2;
                        } else {
                            throw new IllegalStateException("unexpected");
                        }
                    }
                } else {
                    c41569h.m94549c();
                    Function1<E, Unit> function2 = this.onUndeliveredElement;
                    if (function2 != null) {
                        kFunctionM90562M = m90562M(function2);
                    }
                    function3 = (Function3) kFunctionM90562M;
                }
                c41716oM91187b.mo91117r(objM90610o1, function3);
                break;
            }
            Object objM91171w = c41716oM91187b.m91171w();
            if (objM91171w == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                DebugProbesKt.probeCoroutineSuspended(continuation);
            }
            return objM91171w;
        } catch (Throwable th2) {
            c41716oM91187b.m91149N();
            throw th2;
        }
    }

    /* JADX INFO: renamed from: b0 */
    public final C41569h<E> m90588b0(long id2, C41569h<E> startFrom) {
        Object objM94537c;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f91476i;
        Function2 function2 = (Function2) BufferedChannelKt.m90666y();
        loop0: while (true) {
            objM94537c = C43046b.m94537c(startFrom, id2, function2);
            if (!C43082y.m94648c(objM94537c)) {
                AbstractC43081x abstractC43081xM94647b = C43082y.m94647b(objM94537c);
                while (true) {
                    AbstractC43081x abstractC43081x = (AbstractC43081x) atomicReferenceFieldUpdater.get(this);
                    if (abstractC43081x.id >= abstractC43081xM94647b.id) {
                        break loop0;
                    }
                    if (!abstractC43081xM94647b.m94645u()) {
                        break;
                    }
                    if (C1481a.m2260a(atomicReferenceFieldUpdater, this, abstractC43081x, abstractC43081xM94647b)) {
                        if (!abstractC43081x.m94643p()) {
                            break loop0;
                        }
                        abstractC43081x.m94558n();
                        break loop0;
                    }
                    if (abstractC43081xM94647b.m94643p()) {
                        abstractC43081xM94647b.m94558n();
                    }
                }
            } else {
                break;
            }
        }
        if (C43082y.m94648c(objM94537c)) {
            m90579W();
            if (startFrom.id * ((long) BufferedChannelKt.f91490b) < m90604l0()) {
                startFrom.m94549c();
            }
            return null;
        }
        C41569h<E> c41569h = (C41569h) C43082y.m94647b(objM94537c);
        long j11 = c41569h.id;
        if (j11 > id2) {
            int i11 = BufferedChannelKt.f91490b;
            m90620t1(j11 * ((long) i11));
            if (c41569h.id * ((long) i11) < m90604l0()) {
                c41569h.m94549c();
            }
            return null;
        }
        return c41569h;
    }

    /* JADX INFO: renamed from: b1 */
    public final void m90589b1(InterfaceC41754i<?> select, Object ignoredParam) {
        C41569h c41569h;
        InterfaceC41784z2 interfaceC41784z2;
        C41569h c41569h2 = (C41569h) m90527j0().get(this);
        while (!m90625x0()) {
            long andIncrement = m90529k0().getAndIncrement(this);
            int i11 = BufferedChannelKt.f91490b;
            long j11 = andIncrement / ((long) i11);
            int i12 = (int) (andIncrement % ((long) i11));
            if (c41569h2.id != j11) {
                C41569h c41569hM90586a0 = m90586a0(j11, c41569h2);
                if (c41569hM90586a0 == null) {
                    continue;
                } else {
                    c41569h = c41569hM90586a0;
                }
            } else {
                c41569h = c41569h2;
            }
            InterfaceC41754i<?> interfaceC41754i = select;
            Object objM90610o1 = m90610o1(c41569h, i12, andIncrement, interfaceC41754i);
            c41569h2 = c41569h;
            if (objM90610o1 == BufferedChannelKt.f91501m) {
                if (interfaceC41754i instanceof InterfaceC41784z2) {
                    interfaceC41784z2 = (InterfaceC41784z2) interfaceC41754i;
                } else {
                    interfaceC41784z2 = null;
                }
                if (interfaceC41784z2 != null) {
                    m90574T0(interfaceC41784z2, c41569h2, i12);
                    return;
                }
                return;
            }
            if (objM90610o1 == BufferedChannelKt.f91503o) {
                if (andIncrement < m90612p0()) {
                    c41569h2.m94549c();
                }
                select = interfaceC41754i;
            } else {
                if (objM90610o1 != BufferedChannelKt.f91502n) {
                    c41569h2.m94549c();
                    interfaceC41754i.mo91276c(objM90610o1);
                    return;
                }
                throw new IllegalStateException("unexpected");
            }
        }
        m90563M0(select);
    }

    @Override // kotlinx.coroutines.channels.InterfaceC41577p
    /* JADX INFO: renamed from: d */
    public void mo90591d(@NotNull Function1<? super Throwable, Unit> handler) {
        if (!C1481a.m2260a(f91480m, this, null, handler)) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f91480m;
            do {
                Object obj = atomicReferenceFieldUpdater.get(this);
                if (obj != BufferedChannelKt.f91505q) {
                    if (obj == BufferedChannelKt.f91506r) {
                        throw new IllegalStateException("Another handler was already registered and successfully invoked");
                    }
                    throw new IllegalStateException(("Another handler is already registered: " + obj).toString());
                }
            } while (!C1481a.m2260a(f91480m, this, BufferedChannelKt.f91505q, BufferedChannelKt.f91506r));
            handler.invoke(m90597f0());
        }
    }

    /* JADX INFO: renamed from: d0 */
    public final long m90592d0() {
        return f91474g.get(this);
    }

    @Override // kotlinx.coroutines.channels.InterfaceC41577p
    @NotNull
    /* JADX INFO: renamed from: e */
    public Object mo90594e(E element) {
        C41569h c41569h;
        InterfaceC41784z2 interfaceC41784z2;
        if (!m90601i1(f91472e.get(this))) {
            Object obj = BufferedChannelKt.f91498j;
            C41569h c41569h2 = (C41569h) m90533n0().get(this);
            while (true) {
                long andIncrement = m90534o0().getAndIncrement(this);
                long j11 = andIncrement & 1152921504606846975L;
                boolean zM90627z0 = m90627z0(andIncrement);
                int i11 = BufferedChannelKt.f91490b;
                long j12 = j11 / ((long) i11);
                int i12 = (int) (j11 % ((long) i11));
                if (c41569h2.id != j12) {
                    C41569h c41569hM90588b0 = m90588b0(j12, c41569h2);
                    if (c41569hM90588b0 == null) {
                        if (zM90627z0) {
                            return ChannelResult.INSTANCE.m105329closedJP2dKIU(m90606m0());
                        }
                    } else {
                        c41569h = c41569hM90588b0;
                    }
                } else {
                    c41569h = c41569h2;
                }
                int iM90615q1 = m90615q1(c41569h, i12, element, j11, obj, zM90627z0);
                c41569h2 = c41569h;
                if (iM90615q1 != 0) {
                    if (iM90615q1 != 1) {
                        if (iM90615q1 != 2) {
                            if (iM90615q1 != 3) {
                                if (iM90615q1 != 4) {
                                    if (iM90615q1 == 5) {
                                        c41569h2.m94549c();
                                    }
                                    element = element;
                                } else {
                                    if (j11 < m90604l0()) {
                                        c41569h2.m94549c();
                                    }
                                    return ChannelResult.INSTANCE.m105329closedJP2dKIU(m90606m0());
                                }
                            } else {
                                throw new IllegalStateException("unexpected");
                            }
                        } else {
                            if (zM90627z0) {
                                c41569h2.m94644t();
                                return ChannelResult.INSTANCE.m105329closedJP2dKIU(m90606m0());
                            }
                            if (obj instanceof InterfaceC41784z2) {
                                interfaceC41784z2 = (InterfaceC41784z2) obj;
                            } else {
                                interfaceC41784z2 = null;
                            }
                            if (interfaceC41784z2 != null) {
                                m90576U0(interfaceC41784z2, c41569h2, i12);
                            }
                            c41569h2.m94644t();
                            return ChannelResult.INSTANCE.m105330failurePtdJZtk();
                        }
                    } else {
                        return ChannelResult.INSTANCE.m105331successJP2dKIU(Unit.INSTANCE);
                    }
                } else {
                    c41569h2.m94549c();
                    return ChannelResult.INSTANCE.m105331successJP2dKIU(Unit.INSTANCE);
                }
            }
        } else {
            return ChannelResult.INSTANCE.m105330failurePtdJZtk();
        }
    }

    @Nullable
    /* JADX INFO: renamed from: f0 */
    public final Throwable m90597f0() {
        return (Throwable) f91479l.get(this);
    }

    /* JADX WARN: Code duplicated, block: B:62:0x0101  */
    /* JADX WARN: Code duplicated, block: B:65:0x010a A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:66:0x010b  */
    /* JADX INFO: renamed from: h1 */
    public final Object m90599h1(C41569h<E> c41569h, int i11, E e11, long j11, Continuation<? super Unit> continuation) {
        Object objM103844constructorimpl;
        Object objM91171w;
        C41569h c41569hM90588b0;
        C41716o c41716o;
        C41716o c41716oM91187b = C41724q.m91187b(IntrinsicsKt.intercepted(continuation));
        try {
            int iM90615q1 = m90615q1(c41569h, i11, e11, j11, c41716oM91187b, false);
            if (iM90615q1 != 0) {
                if (iM90615q1 != 1) {
                    if (iM90615q1 == 2) {
                        m90576U0(c41716oM91187b, c41569h, i11);
                    } else {
                        if (iM90615q1 != 4) {
                            String str = "unexpected";
                            if (iM90615q1 == 5) {
                                c41569h.m94549c();
                                C41569h c41569h2 = (C41569h) m90533n0().get(this);
                                while (true) {
                                    long andIncrement = m90534o0().getAndIncrement(this);
                                    long j12 = 1152921504606846975L & andIncrement;
                                    boolean zM90627z0 = m90627z0(andIncrement);
                                    int i12 = BufferedChannelKt.f91490b;
                                    long j13 = j12 / ((long) i12);
                                    int i13 = (int) (j12 % ((long) i12));
                                    str = str;
                                    if (c41569h2.id != j13) {
                                        c41569hM90588b0 = m90588b0(j13, c41569h2);
                                        if (c41569hM90588b0 == null) {
                                            if (zM90627z0) {
                                            }
                                        }
                                    } else {
                                        c41569hM90588b0 = c41569h2;
                                    }
                                    int iM90615q2 = m90615q1(c41569hM90588b0, i13, e11, j12, c41716oM91187b, zM90627z0);
                                    if (iM90615q2 != 0) {
                                        if (iM90615q2 != 1) {
                                            if (iM90615q2 != 2) {
                                                if (iM90615q2 != 3) {
                                                    if (iM90615q2 != 4) {
                                                        if (iM90615q2 == 5) {
                                                            c41569hM90588b0.m94549c();
                                                        }
                                                        c41569h2 = c41569hM90588b0;
                                                    } else if (j12 < m90604l0()) {
                                                        c41569hM90588b0.m94549c();
                                                    }
                                                } else {
                                                    throw new IllegalStateException(str);
                                                }
                                            } else if (zM90627z0) {
                                                c41569hM90588b0.m94644t();
                                            } else {
                                                if (c41716oM91187b != null) {
                                                    c41716o = c41716oM91187b;
                                                } else {
                                                    c41716o = null;
                                                }
                                                if (c41716o == null) {
                                                    break;
                                                }
                                                m90576U0(c41716o, c41569hM90588b0, i13);
                                                break;
                                            }
                                        } else {
                                            Result.Companion companion = Result.INSTANCE;
                                            objM103844constructorimpl = Result.m103844constructorimpl(Unit.INSTANCE);
                                        }
                                    } else {
                                        c41569hM90588b0.m94549c();
                                        Result.Companion companion2 = Result.INSTANCE;
                                        objM103844constructorimpl = Result.m103844constructorimpl(Unit.INSTANCE);
                                    }
                                }
                            } else {
                                throw new IllegalStateException("unexpected");
                            }
                        } else if (j11 < m90604l0()) {
                            c41569h.m94549c();
                        }
                        m90566O0(e11, c41716oM91187b);
                        break;
                    }
                    objM91171w = c41716oM91187b.m91171w();
                    if (objM91171w == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                        DebugProbesKt.probeCoroutineSuspended(continuation);
                    }
                    if (objM91171w == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                        return objM91171w;
                    }
                    return Unit.INSTANCE;
                }
                Result.Companion companion3 = Result.INSTANCE;
                objM103844constructorimpl = Result.m103844constructorimpl(Unit.INSTANCE);
            } else {
                c41569h.m94549c();
                Result.Companion companion4 = Result.INSTANCE;
                objM103844constructorimpl = Result.m103844constructorimpl(Unit.INSTANCE);
            }
            c41716oM91187b.resumeWith(objM103844constructorimpl);
            objM91171w = c41716oM91187b.m91171w();
            if (objM91171w == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                DebugProbesKt.probeCoroutineSuspended(continuation);
            }
            if (objM91171w == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                return objM91171w;
            }
            return Unit.INSTANCE;
        } catch (Throwable th2) {
            c41716oM91187b.m91149N();
            throw th2;
        }
    }

    /* JADX INFO: renamed from: i0 */
    public final Throwable m90600i0() {
        Throwable thM90597f0 = m90597f0();
        if (thM90597f0 == null) {
            return new ClosedReceiveChannelException("Channel was closed");
        }
        return thM90597f0;
    }

    /* JADX INFO: renamed from: i1 */
    public final boolean m90601i1(long curSendersAndCloseStatus) {
        if (m90627z0(curSendersAndCloseStatus)) {
            return false;
        }
        return !m90567P(curSendersAndCloseStatus & 1152921504606846975L);
    }

    /* JADX INFO: renamed from: l0 */
    public final long m90604l0() {
        return f91473f.get(this);
    }

    @NotNull
    /* JADX INFO: renamed from: m0 */
    public final Throwable m90606m0() {
        Throwable thM90597f0 = m90597f0();
        if (thM90597f0 == null) {
            return new ClosedSendChannelException("Channel was closed");
        }
        return thM90597f0;
    }

    /* JADX INFO: renamed from: m1 */
    public final boolean m90607m1(C41569h<E> segment, int index, long b11) {
        Object objM90693B = segment.m90693B(index);
        if ((objM90693B instanceof InterfaceC41784z2) && b11 >= f91473f.get(this) && segment.m90701v(index, objM90693B, BufferedChannelKt.f91495g)) {
            if (m90603k1(objM90693B, segment, index)) {
                segment.m90697F(index, BufferedChannelKt.f91492d);
                return true;
            }
            segment.m90697F(index, BufferedChannelKt.f91498j);
            segment.m90694C(index, false);
            return false;
        }
        return m90608n1(segment, index, b11);
    }

    /* JADX INFO: renamed from: n1 */
    public final boolean m90608n1(C41569h<E> segment, int index, long b11) {
        while (true) {
            Object objM90693B = segment.m90693B(index);
            if (objM90693B instanceof InterfaceC41784z2) {
                if (b11 < f91473f.get(this)) {
                    if (segment.m90701v(index, objM90693B, new WaiterEB((InterfaceC41784z2) objM90693B))) {
                        return true;
                    }
                } else if (segment.m90701v(index, objM90693B, BufferedChannelKt.f91495g)) {
                    if (m90603k1(objM90693B, segment, index)) {
                        segment.m90697F(index, BufferedChannelKt.f91492d);
                        return true;
                    }
                    segment.m90697F(index, BufferedChannelKt.f91498j);
                    segment.m90694C(index, false);
                    return false;
                }
            } else {
                if (objM90693B == BufferedChannelKt.f91498j) {
                    return false;
                }
                if (objM90693B == null) {
                    if (segment.m90701v(index, objM90693B, BufferedChannelKt.f91493e)) {
                        return true;
                    }
                } else {
                    if (objM90693B == BufferedChannelKt.f91492d || objM90693B == BufferedChannelKt.f91496h || objM90693B == BufferedChannelKt.f91497i || objM90693B == BufferedChannelKt.f91499k || objM90693B == BufferedChannelKt.m90667z()) {
                        return true;
                    }
                    if (objM90693B != BufferedChannelKt.f91494f) {
                        throw new IllegalStateException(("Unexpected cell state: " + objM90693B).toString());
                    }
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.coroutines.channels.InterfaceC41576o
    @NotNull
    /* JADX INFO: renamed from: o */
    public Object mo90609o() {
        C41569h c41569hM90586a0;
        InterfaceC41784z2 interfaceC41784z2;
        long j11 = f91473f.get(this);
        long j12 = f91472e.get(this);
        if (m90626y0(j12)) {
            return ChannelResult.INSTANCE.m105329closedJP2dKIU(m90597f0());
        }
        if (j11 < (j12 & 1152921504606846975L)) {
            Object obj = BufferedChannelKt.f91499k;
            C41569h c41569h = (C41569h) m90527j0().get(this);
            while (!m90625x0()) {
                long andIncrement = m90529k0().getAndIncrement(this);
                int i11 = BufferedChannelKt.f91490b;
                long j13 = andIncrement / ((long) i11);
                int i12 = (int) (andIncrement % ((long) i11));
                if (c41569h.id != j13) {
                    c41569hM90586a0 = m90586a0(j13, c41569h);
                    if (c41569hM90586a0 == null) {
                        continue;
                    }
                } else {
                    c41569hM90586a0 = c41569h;
                }
                Object objM90610o1 = m90610o1(c41569hM90586a0, i12, andIncrement, obj);
                if (objM90610o1 == BufferedChannelKt.f91501m) {
                    if (obj instanceof InterfaceC41784z2) {
                        interfaceC41784z2 = (InterfaceC41784z2) obj;
                    } else {
                        interfaceC41784z2 = null;
                    }
                    if (interfaceC41784z2 != null) {
                        m90574T0(interfaceC41784z2, c41569hM90586a0, i12);
                    }
                    m90622u1(andIncrement);
                    c41569hM90586a0.m94644t();
                    return ChannelResult.INSTANCE.m105330failurePtdJZtk();
                }
                if (objM90610o1 == BufferedChannelKt.f91503o) {
                    if (andIncrement < m90612p0()) {
                        c41569hM90586a0.m94549c();
                    }
                    c41569h = c41569hM90586a0;
                } else {
                    if (objM90610o1 != BufferedChannelKt.f91502n) {
                        c41569hM90586a0.m94549c();
                        return ChannelResult.INSTANCE.m105331successJP2dKIU(objM90610o1);
                    }
                    throw new IllegalStateException("unexpected");
                }
            }
            return ChannelResult.INSTANCE.m105329closedJP2dKIU(m90597f0());
        }
        return ChannelResult.INSTANCE.m105330failurePtdJZtk();
    }

    /* JADX INFO: renamed from: o1 */
    public final Object m90610o1(C41569h<E> segment, int index, long r11, Object waiter) {
        Object objM90693B = segment.m90693B(index);
        if (objM90693B == null) {
            if (r11 >= (f91472e.get(this) & 1152921504606846975L)) {
                if (waiter == null) {
                    return BufferedChannelKt.f91502n;
                }
                if (segment.m90701v(index, objM90693B, waiter)) {
                    m90582Y();
                    return BufferedChannelKt.f91501m;
                }
            }
        } else if (objM90693B == BufferedChannelKt.f91492d && segment.m90701v(index, objM90693B, BufferedChannelKt.f91497i)) {
            m90582Y();
            return segment.m90695D(index);
        }
        return m90613p1(segment, index, r11, waiter);
    }

    @Override // kotlinx.coroutines.channels.InterfaceC41576o
    @Nullable
    /* JADX INFO: renamed from: p */
    public Object mo90611p(@NotNull Continuation<? super ChannelResult<? extends E>> continuation) {
        return m90515Y0(this, continuation);
    }

    /* JADX INFO: renamed from: p0 */
    public final long m90612p0() {
        return f91472e.get(this) & 1152921504606846975L;
    }

    /* JADX INFO: renamed from: p1 */
    public final Object m90613p1(C41569h<E> segment, int index, long r11, Object waiter) {
        while (true) {
            Object objM90693B = segment.m90693B(index);
            if (objM90693B != null && objM90693B != BufferedChannelKt.f91493e) {
                if (objM90693B == BufferedChannelKt.f91492d) {
                    if (segment.m90701v(index, objM90693B, BufferedChannelKt.f91497i)) {
                        m90582Y();
                        return segment.m90695D(index);
                    }
                } else {
                    if (objM90693B != BufferedChannelKt.f91498j && objM90693B != BufferedChannelKt.f91496h) {
                        if (objM90693B == BufferedChannelKt.m90667z()) {
                            m90582Y();
                            return BufferedChannelKt.f91503o;
                        }
                        if (objM90693B != BufferedChannelKt.f91495g && segment.m90701v(index, objM90693B, BufferedChannelKt.f91494f)) {
                            boolean z11 = objM90693B instanceof WaiterEB;
                            if (z11) {
                                objM90693B = ((WaiterEB) objM90693B).waiter;
                            }
                            if (m90603k1(objM90693B, segment, index)) {
                                segment.m90697F(index, BufferedChannelKt.f91497i);
                                m90582Y();
                                return segment.m90695D(index);
                            }
                            segment.m90697F(index, BufferedChannelKt.f91498j);
                            segment.m90694C(index, false);
                            if (z11) {
                                m90582Y();
                            }
                            return BufferedChannelKt.f91503o;
                        }
                    }
                    return BufferedChannelKt.f91503o;
                }
            } else if (r11 < (f91472e.get(this) & 1152921504606846975L)) {
                if (segment.m90701v(index, objM90693B, BufferedChannelKt.f91496h)) {
                    m90582Y();
                    return BufferedChannelKt.f91503o;
                }
            } else {
                if (waiter == null) {
                    return BufferedChannelKt.f91502n;
                }
                if (segment.m90701v(index, objM90693B, waiter)) {
                    m90582Y();
                    return BufferedChannelKt.f91501m;
                }
            }
        }
    }

    @Override // kotlinx.coroutines.channels.InterfaceC41577p
    /* JADX INFO: renamed from: q */
    public boolean mo90614q() {
        return m90627z0(f91472e.get(this));
    }

    /* JADX INFO: renamed from: q1 */
    public final int m90615q1(C41569h<E> segment, int index, E element, long s11, Object waiter, boolean closed) {
        segment.m90698G(index, element);
        if (closed) {
            return m90617r1(segment, index, element, s11, waiter, closed);
        }
        Object objM90693B = segment.m90693B(index);
        if (objM90693B == null) {
            if (m90567P(s11)) {
                if (segment.m90701v(index, null, BufferedChannelKt.f91492d)) {
                    return 1;
                }
            } else {
                if (waiter == null) {
                    return 3;
                }
                if (segment.m90701v(index, null, waiter)) {
                    return 2;
                }
            }
        } else if (objM90693B instanceof InterfaceC41784z2) {
            segment.m90702w(index);
            if (m90602j1(objM90693B, element)) {
                segment.m90697F(index, BufferedChannelKt.f91497i);
                m90568P0();
                return 0;
            }
            if (segment.m90703x(index, BufferedChannelKt.f91499k) != BufferedChannelKt.f91499k) {
                segment.m90694C(index, true);
                return 5;
            }
            return 5;
        }
        return m90617r1(segment, index, element, s11, waiter, closed);
    }

    /* JADX INFO: renamed from: r0 */
    public final boolean m90616r0() {
        while (true) {
            C41569h<E> c41569hM90586a0 = (C41569h) f91477j.get(this);
            long jM90604l0 = m90604l0();
            if (m90612p0() <= jM90604l0) {
                return false;
            }
            int i11 = BufferedChannelKt.f91490b;
            long j11 = jM90604l0 / ((long) i11);
            if (c41569hM90586a0.id != j11 && (c41569hM90586a0 = m90586a0(j11, c41569hM90586a0)) == null) {
                if (((C41569h) f91477j.get(this)).id < j11) {
                    return false;
                }
            } else {
                c41569hM90586a0.m94549c();
                if (m90623v0(c41569hM90586a0, (int) (jM90604l0 % ((long) i11)), jM90604l0)) {
                    return true;
                }
                f91473f.compareAndSet(this, jM90604l0, 1 + jM90604l0);
            }
        }
    }

    /* JADX INFO: renamed from: r1 */
    public final int m90617r1(C41569h<E> segment, int index, E element, long s11, Object waiter, boolean closed) {
        while (true) {
            Object objM90693B = segment.m90693B(index);
            if (objM90693B == null) {
                if (m90567P(s11) && !closed) {
                    if (segment.m90701v(index, null, BufferedChannelKt.f91492d)) {
                        return 1;
                    }
                } else if (closed) {
                    if (segment.m90701v(index, null, BufferedChannelKt.f91498j)) {
                        segment.m90694C(index, false);
                        return 4;
                    }
                } else {
                    if (waiter == null) {
                        return 3;
                    }
                    if (segment.m90701v(index, null, waiter)) {
                        return 2;
                    }
                }
            } else if (objM90693B == BufferedChannelKt.f91493e) {
                if (segment.m90701v(index, objM90693B, BufferedChannelKt.f91492d)) {
                    return 1;
                }
            } else {
                if (objM90693B == BufferedChannelKt.f91499k) {
                    segment.m90702w(index);
                    return 5;
                }
                if (objM90693B == BufferedChannelKt.f91496h) {
                    segment.m90702w(index);
                    return 5;
                }
                if (objM90693B == BufferedChannelKt.m90667z()) {
                    segment.m90702w(index);
                    m90579W();
                    return 4;
                }
                segment.m90702w(index);
                if (objM90693B instanceof WaiterEB) {
                    objM90693B = ((WaiterEB) objM90693B).waiter;
                }
                if (m90602j1(objM90693B, element)) {
                    segment.m90697F(index, BufferedChannelKt.f91497i);
                    m90568P0();
                    return 0;
                }
                if (segment.m90703x(index, BufferedChannelKt.f91499k) != BufferedChannelKt.f91499k) {
                    segment.m90694C(index, true);
                }
                return 5;
            }
        }
    }

    /* JADX INFO: renamed from: s0 */
    public final void m90618s0(long nAttempts) {
        if ((f91475h.addAndGet(this, nAttempts) & Longs.MAX_POWER_OF_TWO) != 0) {
            while ((f91475h.get(this) & Longs.MAX_POWER_OF_TWO) != 0) {
            }
        }
    }

    /* JADX INFO: renamed from: s1 */
    public final void m90619s1(long value) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f91473f;
        while (true) {
            long j11 = atomicLongFieldUpdater.get(this);
            if (j11 < value) {
                long j12 = value;
                if (f91473f.compareAndSet(this, j11, j12)) {
                    return;
                } else {
                    value = j12;
                }
            } else {
                return;
            }
        }
    }

    @Override // kotlinx.coroutines.channels.InterfaceC41577p
    @Nullable
    public Object send(E e11, @NotNull Continuation<? super Unit> continuation) {
        return m90522g1(this, e11, continuation);
    }

    /* JADX INFO: renamed from: t1 */
    public final void m90620t1(long value) {
        long j11;
        long j12;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f91472e;
        do {
            j11 = atomicLongFieldUpdater.get(this);
            j12 = 1152921504606846975L & j11;
            if (j12 < value) {
            } else {
                return;
            }
        } while (!f91472e.compareAndSet(this, j11, BufferedChannelKt.m90664w(j12, (int) (j11 >> 60))));
    }

    /* JADX INFO: renamed from: u0 */
    public final void m90621u0() {
        Object obj;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f91480m;
        do {
            obj = atomicReferenceFieldUpdater.get(this);
        } while (!C1481a.m2260a(atomicReferenceFieldUpdater, this, obj, obj == null ? BufferedChannelKt.f91505q : BufferedChannelKt.f91506r));
        if (obj == null) {
            return;
        }
        ((Function1) obj).invoke(m90597f0());
    }

    /* JADX INFO: renamed from: v0 */
    public final boolean m90623v0(C41569h<E> segment, int index, long globalIndex) {
        Object objM90693B;
        do {
            objM90693B = segment.m90693B(index);
            if (objM90693B != null && objM90693B != BufferedChannelKt.f91493e) {
                if (objM90693B == BufferedChannelKt.f91492d) {
                    return true;
                }
                if (objM90693B == BufferedChannelKt.f91498j || objM90693B == BufferedChannelKt.m90667z() || objM90693B == BufferedChannelKt.f91497i || objM90693B == BufferedChannelKt.f91496h) {
                    return false;
                }
                if (objM90693B == BufferedChannelKt.f91495g) {
                    return true;
                }
                if (objM90693B == BufferedChannelKt.f91494f || globalIndex != m90604l0()) {
                    return false;
                }
                return true;
            }
        } while (!segment.m90701v(index, objM90693B, BufferedChannelKt.f91496h));
        m90582Y();
        return false;
    }

    /* JADX INFO: renamed from: x0 */
    public boolean m90625x0() {
        return m90626y0(f91472e.get(this));
    }

    /* JADX INFO: renamed from: J0 */
    public void m90558J0() {
    }

    /* JADX INFO: renamed from: P0 */
    public void m90568P0() {
    }

    /* JADX INFO: renamed from: Q0 */
    public void m90570Q0() {
    }
}
