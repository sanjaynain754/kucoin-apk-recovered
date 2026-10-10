package kotlinx.coroutines;

import androidx.concurrent.futures.C1481a;
import androidx.exifinterface.media.ExifInterface;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.sensorsdata.analytics.android.sdk.data.adapter.DbParams;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.internal.LockFreeLinkedListNode;
import kotlinx.coroutines.selects.C41752g;
import kotlinx.coroutines.selects.InterfaceC41751f;
import kotlinx.coroutines.selects.InterfaceC41754i;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Deprecated;
import p852kotlin.DeprecationLevel;
import p852kotlin.ExceptionsKt;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.CoroutineContext;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugProbesKt;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.functions.Function3;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.Ref;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.jvm.internal.TypeIntrinsics;
import p852kotlin.sequences.Sequence;
import p852kotlin.sequences.SequencesKt;

/* JADX INFO: compiled from: JobSupport.kt */
/* JADX INFO: loaded from: classes23.dex */
@Deprecated(level = DeprecationLevel.ERROR, message = "This is internal API and may be removed in the future releases")
@Metadata(m90083d1 = {"\u0000Î\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0017\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0007¶\u0001·\u0001r¸\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J#\u0010\f\u001a\u0004\u0018\u00010\n2\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\f\u0010\rJ'\u0010\u0011\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\t\u001a\u00020\b2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J%\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J!\u0010\u0019\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ!\u0010\u001b\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010 \u001a\u00020\u00142\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u000fH\u0002¢\u0006\u0004\b \u0010!J\u0017\u0010\"\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\"\u0010#J\u001d\u0010$\u001a\u00020\u0014*\u00020\u001d2\b\u0010\u001f\u001a\u0004\u0018\u00010\u000fH\u0002¢\u0006\u0004\b$\u0010!J\u0019\u0010&\u001a\u00020%2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b&\u0010'J\u0017\u0010)\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020(H\u0002¢\u0006\u0004\b)\u0010*J\u0017\u0010,\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020+H\u0002¢\u0006\u0004\b,\u0010-J\u000f\u0010.\u001a\u00020\u0004H\u0002¢\u0006\u0004\b.\u0010/J\u0010\u00100\u001a\u00020\u0014H\u0082@¢\u0006\u0004\b0\u00101J\u001b\u00102\u001a\u0004\u0018\u00010\n2\b\u0010\u001f\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b2\u00103J\u0019\u00104\u001a\u00020\u000f2\b\u0010\u001f\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b4\u00105J\u001b\u00106\u001a\u0004\u0018\u00010\n2\b\u0010\u001f\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b6\u00103J\u0019\u00107\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\t\u001a\u00020\u0017H\u0002¢\u0006\u0004\b7\u00108J\u001f\u00109\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00172\u0006\u0010\u0013\u001a\u00020\u000fH\u0002¢\u0006\u0004\b9\u0010:J%\u0010;\u001a\u0004\u0018\u00010\n2\b\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b;\u0010<J#\u0010=\u001a\u0004\u0018\u00010\n2\u0006\u0010\t\u001a\u00020\u00172\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b=\u0010>J*\u0010A\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010@\u001a\u00020?2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0082\u0010¢\u0006\u0004\bA\u0010BJ)\u0010D\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020\b2\u0006\u0010C\u001a\u00020?2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\bD\u0010EJ\u0015\u0010G\u001a\u0004\u0018\u00010?*\u00020FH\u0002¢\u0006\u0004\bG\u0010HJ\u0019\u0010J\u001a\u00020I2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\bJ\u0010KJ\u0012\u0010L\u001a\u0004\u0018\u00010\nH\u0082@¢\u0006\u0004\bL\u00101J%\u0010P\u001a\u00020\u00142\n\u0010N\u001a\u0006\u0012\u0002\b\u00030M2\b\u0010O\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\bP\u0010QJ%\u0010S\u001a\u0004\u0018\u00010\n2\b\u0010O\u001a\u0004\u0018\u00010\n2\b\u0010R\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\bS\u0010<J\u0019\u0010U\u001a\u00020\u00142\b\u0010T\u001a\u0004\u0018\u00010\u0001H\u0004¢\u0006\u0004\bU\u0010VJ\r\u0010W\u001a\u00020\u0004¢\u0006\u0004\bW\u0010/J\u000f\u0010X\u001a\u00020\u0014H\u0014¢\u0006\u0004\bX\u0010YJ\u0011\u0010\\\u001a\u00060Zj\u0002`[¢\u0006\u0004\b\\\u0010]J#\u0010_\u001a\u00060Zj\u0002`[*\u00020\u000f2\n\b\u0002\u0010^\u001a\u0004\u0018\u00010IH\u0004¢\u0006\u0004\b_\u0010`J6\u0010g\u001a\u00020f2'\u0010e\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\u000f¢\u0006\f\bb\u0012\b\bc\u0012\u0004\b\b(\u001f\u0012\u0004\u0012\u00020\u00140aj\u0002`d¢\u0006\u0004\bg\u0010hJF\u0010k\u001a\u00020f2\u0006\u0010i\u001a\u00020\u00042\u0006\u0010j\u001a\u00020\u00042'\u0010e\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\u000f¢\u0006\f\bb\u0012\b\bc\u0012\u0004\b\b(\u001f\u0012\u0004\u0012\u00020\u00140aj\u0002`d¢\u0006\u0004\bk\u0010lJ\u001f\u0010n\u001a\u00020f2\u0006\u0010j\u001a\u00020\u00042\u0006\u0010m\u001a\u00020+H\u0000¢\u0006\u0004\bn\u0010oJ\u0010\u0010p\u001a\u00020\u0014H\u0086@¢\u0006\u0004\bp\u00101J\u0017\u0010q\u001a\u00020\u00142\u0006\u0010m\u001a\u00020+H\u0000¢\u0006\u0004\bq\u0010-J\u001f\u0010r\u001a\u00020\u00142\u000e\u0010\u001f\u001a\n\u0018\u00010Zj\u0004\u0018\u0001`[H\u0016¢\u0006\u0004\br\u0010sJ\u000f\u0010t\u001a\u00020IH\u0014¢\u0006\u0004\bt\u0010uJ\u0017\u0010v\u001a\u00020\u00142\u0006\u0010\u001f\u001a\u00020\u000fH\u0016¢\u0006\u0004\bv\u0010wJ\u0015\u0010y\u001a\u00020\u00142\u0006\u0010x\u001a\u00020\u0003¢\u0006\u0004\by\u0010zJ\u0017\u0010{\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u000fH\u0016¢\u0006\u0004\b{\u0010#J\u0017\u0010|\u001a\u00020\u00042\b\u0010\u001f\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b|\u0010#J\u0019\u0010}\u001a\u00020\u00042\b\u0010\u001f\u001a\u0004\u0018\u00010\nH\u0000¢\u0006\u0004\b}\u0010~J\u0013\u0010\u007f\u001a\u00060Zj\u0002`[H\u0016¢\u0006\u0004\b\u007f\u0010]J\u001b\u0010\u0080\u0001\u001a\u00020\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0000¢\u0006\u0005\b\u0080\u0001\u0010~J\u001d\u0010\u0081\u0001\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0000¢\u0006\u0005\b\u0081\u0001\u00103J\u0019\u0010\u0083\u0001\u001a\u00030\u0082\u00012\u0006\u0010@\u001a\u00020\u0002¢\u0006\u0006\b\u0083\u0001\u0010\u0084\u0001J\u001a\u0010\u0086\u0001\u001a\u00020\u00142\u0007\u0010\u0085\u0001\u001a\u00020\u000fH\u0010¢\u0006\u0005\b\u0086\u0001\u0010wJ\u001b\u0010\u0087\u0001\u001a\u00020\u00142\b\u0010\u001f\u001a\u0004\u0018\u00010\u000fH\u0014¢\u0006\u0005\b\u0087\u0001\u0010wJ\u001a\u0010\u0088\u0001\u001a\u00020\u00042\u0007\u0010\u0085\u0001\u001a\u00020\u000fH\u0014¢\u0006\u0005\b\u0088\u0001\u0010#J\u001c\u0010\u0089\u0001\u001a\u00020\u00142\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0014¢\u0006\u0006\b\u0089\u0001\u0010\u008a\u0001J\u001c\u0010\u008b\u0001\u001a\u00020\u00142\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0014¢\u0006\u0006\b\u008b\u0001\u0010\u008a\u0001J\u0011\u0010\u008c\u0001\u001a\u00020IH\u0016¢\u0006\u0005\b\u008c\u0001\u0010uJ\u0011\u0010\u008d\u0001\u001a\u00020IH\u0007¢\u0006\u0005\b\u008d\u0001\u0010uJ\u0011\u0010\u008e\u0001\u001a\u00020IH\u0010¢\u0006\u0005\b\u008e\u0001\u0010uJ\u0014\u0010\u008f\u0001\u001a\u0004\u0018\u00010\nH\u0000¢\u0006\u0006\b\u008f\u0001\u0010\u0090\u0001J\u0014\u0010\u0091\u0001\u001a\u0004\u0018\u00010\nH\u0084@¢\u0006\u0005\b\u0091\u0001\u00101R\u001e\u0010\u0093\u0001\u001a\u0004\u0018\u00010\u000f*\u0004\u0018\u00010\n8BX\u0082\u0004¢\u0006\u0007\u001a\u0005\b\u0092\u0001\u00105R\u0019\u0010\u0097\u0001\u001a\u0007\u0012\u0002\b\u00030\u0094\u00018F¢\u0006\b\u001a\u0006\b\u0095\u0001\u0010\u0096\u0001R0\u0010\u009d\u0001\u001a\u0005\u0018\u00010\u0082\u00012\n\u0010\u0098\u0001\u001a\u0005\u0018\u00010\u0082\u00018@@@X\u0080\u000e¢\u0006\u0010\u001a\u0006\b\u0099\u0001\u0010\u009a\u0001\"\u0006\b\u009b\u0001\u0010\u009c\u0001R\u0018\u0010T\u001a\u0004\u0018\u00010\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u009e\u0001\u0010\u009f\u0001R\u0018\u0010\t\u001a\u0004\u0018\u00010\n8@X\u0080\u0004¢\u0006\b\u001a\u0006\b \u0001\u0010\u0090\u0001R\u0016\u0010¡\u0001\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b¡\u0001\u0010/R\u0013\u0010¢\u0001\u001a\u00020\u00048F¢\u0006\u0007\u001a\u0005\b¢\u0001\u0010/R\u0013\u0010£\u0001\u001a\u00020\u00048F¢\u0006\u0007\u001a\u0005\b£\u0001\u0010/R\u0016\u0010¥\u0001\u001a\u00020\u00048PX\u0090\u0004¢\u0006\u0007\u001a\u0005\b¤\u0001\u0010/R\u001b\u0010©\u0001\u001a\t\u0012\u0004\u0012\u00020\u00010¦\u00018F¢\u0006\b\u001a\u0006\b§\u0001\u0010¨\u0001R\u0016\u0010«\u0001\u001a\u00020\u00048TX\u0094\u0004¢\u0006\u0007\u001a\u0005\bª\u0001\u0010/R\u0016\u0010\u00ad\u0001\u001a\u00020\u00048PX\u0090\u0004¢\u0006\u0007\u001a\u0005\b¬\u0001\u0010/R#\u0010²\u0001\u001a\u0007\u0012\u0002\b\u00030®\u00018DX\u0084\u0004¢\u0006\u000f\u0012\u0005\b±\u0001\u0010Y\u001a\u0006\b¯\u0001\u0010°\u0001R\u0015\u0010´\u0001\u001a\u000b\u0012\u0006\u0012\u0004\u0018\u00010\n0³\u00018\u0002X\u0082\u0004R\u0016\u0010µ\u0001\u001a\f\u0012\u0007\u0012\u0005\u0018\u00010\u0082\u00010³\u00018\u0002X\u0082\u0004¨\u0006¹\u0001"}, m90084d2 = {"Lkotlinx/coroutines/JobSupport;", "Lkotlinx/coroutines/x1;", "Lkotlinx/coroutines/v;", "Lkotlinx/coroutines/j2;", "", "active", "<init>", "(Z)V", "Lkotlinx/coroutines/JobSupport$c;", "state", "", "proposedUpdate", "a0", "(Lkotlinx/coroutines/JobSupport$c;Ljava/lang/Object;)Ljava/lang/Object;", "", "", "exceptions", "d0", "(Lkotlinx/coroutines/JobSupport$c;Ljava/util/List;)Ljava/lang/Throwable;", "rootCause", "", "M", "(Ljava/lang/Throwable;Ljava/util/List;)V", "Lkotlinx/coroutines/s1;", "update", "P0", "(Lkotlinx/coroutines/s1;Ljava/lang/Object;)Z", "X", "(Lkotlinx/coroutines/s1;Ljava/lang/Object;)V", "Lkotlinx/coroutines/f2;", "list", "cause", "z0", "(Lkotlinx/coroutines/f2;Ljava/lang/Throwable;)V", "U", "(Ljava/lang/Throwable;)Z", "A0", "", "K0", "(Ljava/lang/Object;)I", "Lkotlinx/coroutines/e1;", "G0", "(Lkotlinx/coroutines/e1;)V", "Lkotlinx/coroutines/a2;", "H0", "(Lkotlinx/coroutines/a2;)V", "s0", "()Z", "t0", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", ExifInterface.GPS_DIRECTION_TRUE, "(Ljava/lang/Object;)Ljava/lang/Object;", "Z", "(Ljava/lang/Object;)Ljava/lang/Throwable;", "u0", "h0", "(Lkotlinx/coroutines/s1;)Lkotlinx/coroutines/f2;", "Q0", "(Lkotlinx/coroutines/s1;Ljava/lang/Throwable;)Z", "R0", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "S0", "(Lkotlinx/coroutines/s1;Ljava/lang/Object;)Ljava/lang/Object;", "Lkotlinx/coroutines/u;", "child", "T0", "(Lkotlinx/coroutines/JobSupport$c;Lkotlinx/coroutines/u;Ljava/lang/Object;)Z", "lastChild", "Y", "(Lkotlinx/coroutines/JobSupport$c;Lkotlinx/coroutines/u;Ljava/lang/Object;)V", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode;", "y0", "(Lkotlinx/coroutines/internal/LockFreeLinkedListNode;)Lkotlinx/coroutines/u;", "", "L0", "(Ljava/lang/Object;)Ljava/lang/String;", "P", "Lkotlinx/coroutines/selects/i;", "select", "ignoredParam", "C0", "(Lkotlinx/coroutines/selects/i;Ljava/lang/Object;)V", DbParams.KEY_CHANNEL_RESULT, "B0", "parent", "p0", "(Lkotlinx/coroutines/x1;)V", "start", "F0", "()V", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "x", "()Ljava/util/concurrent/CancellationException;", "message", "M0", "(Ljava/lang/Throwable;Ljava/lang/String;)Ljava/util/concurrent/CancellationException;", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "Lkotlinx/coroutines/CompletionHandler;", "handler", "Lkotlinx/coroutines/b1;", "j", "(Lkotlin/jvm/functions/Function1;)Lkotlinx/coroutines/b1;", "onCancelling", "invokeImmediately", "w", "(ZZLkotlin/jvm/functions/Function1;)Lkotlinx/coroutines/b1;", "node", "q0", "(ZLkotlinx/coroutines/a2;)Lkotlinx/coroutines/b1;", ExifInterface.LONGITUDE_EAST, "I0", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Ljava/util/concurrent/CancellationException;)V", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "()Ljava/lang/String;", ExifInterface.LATITUDE_SOUTH, "(Ljava/lang/Throwable;)V", "parentJob", "i", "(Lkotlinx/coroutines/j2;)V", ExifInterface.LONGITUDE_WEST, "Q", "R", "(Ljava/lang/Object;)Z", "z", "v0", "w0", "Lkotlinx/coroutines/t;", "u", "(Lkotlinx/coroutines/v;)Lkotlinx/coroutines/t;", "exception", "o0", "D0", "n0", "E0", "(Ljava/lang/Object;)V", "N", "toString", "O0", "x0", "b0", "()Ljava/lang/Object;", "O", "c0", "exceptionOrNull", "Lkotlin/coroutines/CoroutineContext$Key;", "getKey", "()Lkotlin/coroutines/CoroutineContext$Key;", "key", "value", "j0", "()Lkotlinx/coroutines/t;", "J0", "(Lkotlinx/coroutines/t;)V", "parentHandle", "i0", "()Lkotlinx/coroutines/x1;", "k0", "isActive", "isCompleted", "isCancelled", "g0", "onCancelComplete", "Lkotlin/sequences/Sequence;", "v", "()Lkotlin/sequences/Sequence;", "children", "r0", "isScopedCoroutine", "e0", "handlesException", "Lkotlinx/coroutines/selects/f;", "f0", "()Lkotlinx/coroutines/selects/f;", "getOnAwaitInternal$annotations", "onAwaitInternal", "Lkotlinx/atomicfu/AtomicRef;", "_state", "_parentHandle", "c", "b", "d", "kotlinx-coroutines-core"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nJobSupport.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JobSupport.kt\nkotlinx/coroutines/JobSupport\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Synchronized.common.kt\nkotlinx/coroutines/internal/Synchronized_commonKt\n+ 4 Synchronized.kt\nkotlinx/coroutines/internal/SynchronizedKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 6 Concurrent.kt\nkotlinx/coroutines/internal/ConcurrentKt\n+ 7 StackTraceRecovery.kt\nkotlinx/coroutines/internal/StackTraceRecoveryKt\n+ 8 LockFreeLinkedList.kt\nkotlinx/coroutines/internal/LockFreeLinkedListHead\n+ 9 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,1583:1\n732#1,3:1587\n361#1,2:1597\n363#1,5:1602\n368#1,5:1608\n373#1,2:1616\n361#1,2:1618\n363#1,5:1623\n368#1,5:1629\n373#1,2:1637\n169#1,2:1645\n734#1:1647\n536#1:1648\n169#1,2:1649\n537#1,15:1651\n169#1,2:1666\n169#1,2:1668\n169#1,2:1681\n732#1,3:1683\n732#1,3:1686\n169#1,2:1689\n732#1,3:1691\n169#1,2:1694\n169#1,2:1698\n169#1,2:1700\n536#1:1704\n169#1,2:1705\n537#1,15:1707\n1#2:1584\n1#2:1607\n1#2:1628\n29#3:1585\n29#3:1696\n29#3:1702\n16#4:1586\n16#4:1697\n16#4:1703\n295#5,2:1590\n295#5,2:1592\n23#6:1594\n159#7:1595\n159#7:1596\n149#7,4:1722\n273#8,3:1599\n276#8,3:1613\n273#8,3:1620\n276#8,3:1634\n273#8,6:1639\n426#9,11:1670\n*S KotlinDebug\n*F\n+ 1 JobSupport.kt\nkotlinx/coroutines/JobSupport\n*L\n241#1:1587,3\n324#1:1597,2\n324#1:1602,5\n324#1:1608,5\n324#1:1616,2\n357#1:1618,2\n357#1:1623,5\n357#1:1629,5\n357#1:1637,2\n377#1:1645,2\n422#1:1647\n468#1:1648\n468#1:1649,2\n468#1:1651,15\n536#1:1666,2\n579#1:1668,2\n621#1:1681,2\n648#1:1683,3\n657#1:1686,3\n721#1:1689,2\n750#1:1691,3\n763#1:1694,2\n836#1:1698,2\n858#1:1700,2\n1023#1:1704\n1023#1:1705,2\n1023#1:1707,15\n324#1:1607\n357#1:1628\n204#1:1585\n766#1:1696\n911#1:1702\n204#1:1586\n766#1:1697\n911#1:1703\n252#1:1590,2\n256#1:1592,2\n264#1:1594\n270#1:1595\n272#1:1596\n1327#1:1722,4\n324#1:1599,3\n324#1:1613,3\n357#1:1620,3\n357#1:1634,3\n362#1:1639,6\n585#1:1670,11\n*E\n"})
public class JobSupport implements InterfaceC41775x1, InterfaceC41765v, InterfaceC41699j2 {

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f91429b = AtomicReferenceFieldUpdater.newUpdater(JobSupport.class, Object.class, "_state$volatile");

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f91430c = AtomicReferenceFieldUpdater.newUpdater(JobSupport.class, Object.class, "_parentHandle$volatile");
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;

    /* JADX INFO: renamed from: kotlinx.coroutines.JobSupport$a */
    /* JADX INFO: compiled from: JobSupport.kt */
    @Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, m90084d2 = {"Lkotlinx/coroutines/JobSupport$a;", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/coroutines/o;", "Lkotlin/coroutines/Continuation;", "delegate", "Lkotlinx/coroutines/JobSupport;", "job", "<init>", "(Lkotlin/coroutines/Continuation;Lkotlinx/coroutines/JobSupport;)V", "Lkotlinx/coroutines/x1;", "parent", "", "u", "(Lkotlinx/coroutines/x1;)Ljava/lang/Throwable;", "", "L", "()Ljava/lang/String;", "j", "Lkotlinx/coroutines/JobSupport;", "kotlinx-coroutines-core"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nJobSupport.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JobSupport.kt\nkotlinx/coroutines/JobSupport$AwaitContinuation\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1583:1\n1#2:1584\n*E\n"})
    public static final class C41535a<T> extends C41716o<T> {

        /* JADX INFO: renamed from: j, reason: from kotlin metadata */
        @NotNull
        public final JobSupport job;

        public C41535a(@NotNull Continuation<? super T> continuation, @NotNull JobSupport jobSupport) {
            super(continuation, 1);
            this.job = jobSupport;
        }

        @Override // kotlinx.coroutines.C41716o
        @NotNull
        /* JADX INFO: renamed from: L */
        public String mo90447L() {
            return "AwaitContinuation";
        }

        @Override // kotlinx.coroutines.C41716o
        @NotNull
        /* JADX INFO: renamed from: u */
        public Throwable mo90448u(@NotNull InterfaceC41775x1 parent) {
            Throwable thM90458e;
            Object objM90428k0 = this.job.m90428k0();
            if (!(objM90428k0 instanceof C41537c) || (thM90458e = ((C41537c) objM90428k0).m90458e()) == null) {
                return objM90428k0 instanceof C41549b0 ? ((C41549b0) objM90428k0).cause : parent.mo90442x();
            }
            return thM90458e;
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.JobSupport$b */
    /* JADX INFO: compiled from: JobSupport.kt */
    @Metadata(m90083d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0016\u0010\t\u001a\u0004\u0018\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001c\u001a\u00020\u00198VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, m90084d2 = {"Lkotlinx/coroutines/JobSupport$b;", "Lkotlinx/coroutines/a2;", "Lkotlinx/coroutines/JobSupport;", "parent", "Lkotlinx/coroutines/JobSupport$c;", "state", "Lkotlinx/coroutines/u;", "child", "", "proposedUpdate", "<init>", "(Lkotlinx/coroutines/JobSupport;Lkotlinx/coroutines/JobSupport$c;Lkotlinx/coroutines/u;Ljava/lang/Object;)V", "", "cause", "", "v", "(Ljava/lang/Throwable;)V", "f", "Lkotlinx/coroutines/JobSupport;", "g", "Lkotlinx/coroutines/JobSupport$c;", CmcdData.Factory.STREAMING_FORMAT_HLS, "Lkotlinx/coroutines/u;", "i", "Ljava/lang/Object;", "", "u", "()Z", "onCancelling", "kotlinx-coroutines-core"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
    public static final class C41536b extends AbstractC41542a2 {

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        @NotNull
        public final JobSupport parent;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        @NotNull
        public final C41537c state;

        /* JADX INFO: renamed from: h, reason: from kotlin metadata */
        @NotNull
        public final C41761u child;

        /* JADX INFO: renamed from: i, reason: from kotlin metadata */
        @Nullable
        public final Object proposedUpdate;

        @Override // kotlinx.coroutines.AbstractC41542a2
        /* JADX INFO: renamed from: u */
        public boolean mo90449u() {
            return false;
        }

        @Override // kotlinx.coroutines.AbstractC41542a2
        /* JADX INFO: renamed from: v */
        public void mo90450v(@Nullable Throwable cause) {
            this.parent.m90413Y(this.state, this.child, this.proposedUpdate);
        }

        public C41536b(@NotNull JobSupport jobSupport, @NotNull C41537c c41537c, @NotNull C41761u c41761u, @Nullable Object obj) {
            this.parent = jobSupport;
            this.state = c41537c;
            this.child = c41761u;
            this.proposedUpdate = obj;
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.JobSupport$c */
    /* JADX INFO: compiled from: JobSupport.kt */
    @Metadata(m90083d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u00022\u00020\u0003B!\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\b0\r2\b\u0010\f\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\b¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u0019\u001a\u0012\u0012\u0004\u0012\u00020\b0\u0017j\b\u0012\u0004\u0012\u00020\b`\u0018H\u0002¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR$\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u00068F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R(\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u001e\u001a\u0004\u0018\u00010\b8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b#\u0010$\"\u0004\b%\u0010\u0013R\u0011\u0010'\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b&\u0010 R\u0011\u0010)\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b(\u0010 R\u0014\u0010*\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b*\u0010 R(\u0010/\u001a\u0004\u0018\u00010\u00012\b\u0010\u001e\u001a\u0004\u0018\u00010\u00018B@BX\u0082\u000e¢\u0006\f\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u000b\u00101\u001a\u0002008\u0002X\u0082\u0004R\u0013\u00103\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b028\u0002X\u0082\u0004R\u0013\u00104\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u0001028\u0002X\u0082\u0004¨\u00065"}, m90084d2 = {"Lkotlinx/coroutines/JobSupport$c;", "", "Lkotlinx/coroutines/internal/SynchronizedObject;", "Lkotlinx/coroutines/s1;", "Lkotlinx/coroutines/f2;", "list", "", "isCompleting", "", "rootCause", "<init>", "(Lkotlinx/coroutines/f2;ZLjava/lang/Throwable;)V", "proposedException", "", CmcdData.Factory.STREAM_TYPE_LIVE, "(Ljava/lang/Throwable;)Ljava/util/List;", "exception", "", "b", "(Ljava/lang/Throwable;)V", "", "toString", "()Ljava/lang/String;", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "c", "()Ljava/util/ArrayList;", "Lkotlinx/coroutines/f2;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "()Lkotlinx/coroutines/f2;", "value", "j", "()Z", "m", "(Z)V", "e", "()Ljava/lang/Throwable;", "o", "k", "isSealed", "i", "isCancelling", "isActive", "d", "()Ljava/lang/Object;", "n", "(Ljava/lang/Object;)V", "exceptionsHolder", "Lkotlinx/atomicfu/AtomicBoolean;", "_isCompleting", "Lkotlinx/atomicfu/AtomicRef;", "_rootCause", "_exceptionsHolder", "kotlinx-coroutines-core"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nJobSupport.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JobSupport.kt\nkotlinx/coroutines/JobSupport$Finishing\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1583:1\n1#2:1584\n*E\n"})
    public static final class C41537c implements InterfaceC41741s1 {

        /* JADX INFO: renamed from: c */
        public static final /* synthetic */ AtomicIntegerFieldUpdater f91436c = AtomicIntegerFieldUpdater.newUpdater(C41537c.class, "_isCompleting$volatile");

        /* JADX INFO: renamed from: d */
        public static final /* synthetic */ AtomicReferenceFieldUpdater f91437d = AtomicReferenceFieldUpdater.newUpdater(C41537c.class, Object.class, "_rootCause$volatile");

        /* JADX INFO: renamed from: e */
        public static final /* synthetic */ AtomicReferenceFieldUpdater f91438e = AtomicReferenceFieldUpdater.newUpdater(C41537c.class, Object.class, "_exceptionsHolder$volatile");
        private volatile /* synthetic */ Object _exceptionsHolder$volatile;
        private volatile /* synthetic */ int _isCompleting$volatile;
        private volatile /* synthetic */ Object _rootCause$volatile;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        public final C41590f2 list;

        @Override // kotlinx.coroutines.InterfaceC41741s1
        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public C41590f2 getList() {
            return this.list;
        }

        /* JADX INFO: renamed from: c */
        public final ArrayList<Throwable> m90456c() {
            return new ArrayList<>(4);
        }

        @NotNull
        public String toString() {
            return "Finishing[cancelling=" + m90459i() + ", completing=" + m90460j() + ", rootCause=" + m90458e() + ", exceptions=" + m90457d() + ", list=" + getList() + ']';
        }

        public C41537c(@NotNull C41590f2 c41590f2, boolean z11, @Nullable Throwable th2) {
            this.list = c41590f2;
            this._isCompleting$volatile = z11 ? 1 : 0;
            this._rootCause$volatile = th2;
        }

        /* JADX INFO: renamed from: b */
        public final void m90455b(@NotNull Throwable exception) {
            Throwable thM90458e = m90458e();
            if (thM90458e == null) {
                m90465o(exception);
                return;
            }
            if (exception != thM90458e) {
                Object objM90457d = m90457d();
                if (objM90457d == null) {
                    m90464n(exception);
                    return;
                }
                if (objM90457d instanceof Throwable) {
                    if (exception == objM90457d) {
                        return;
                    }
                    ArrayList<Throwable> arrayListM90456c = m90456c();
                    arrayListM90456c.add(objM90457d);
                    arrayListM90456c.add(exception);
                    m90464n(arrayListM90456c);
                    return;
                }
                if (objM90457d instanceof ArrayList) {
                    ((ArrayList) objM90457d).add(exception);
                    return;
                }
                throw new IllegalStateException(("State is " + objM90457d).toString());
            }
        }

        /* JADX INFO: renamed from: d */
        public final Object m90457d() {
            return f91438e.get(this);
        }

        @Nullable
        /* JADX INFO: renamed from: e */
        public final Throwable m90458e() {
            return (Throwable) f91437d.get(this);
        }

        /* JADX INFO: renamed from: i */
        public final boolean m90459i() {
            if (m90458e() != null) {
                return true;
            }
            return false;
        }

        @Override // kotlinx.coroutines.InterfaceC41741s1
        /* JADX INFO: renamed from: isActive */
        public boolean getIsActive() {
            if (m90458e() == null) {
                return true;
            }
            return false;
        }

        /* JADX INFO: renamed from: j */
        public final boolean m90460j() {
            if (f91436c.get(this) == 1) {
                return true;
            }
            return false;
        }

        /* JADX INFO: renamed from: k */
        public final boolean m90461k() {
            if (m90457d() == C41551b2.f91465e) {
                return true;
            }
            return false;
        }

        @NotNull
        /* JADX INFO: renamed from: l */
        public final List<Throwable> m90462l(@Nullable Throwable proposedException) {
            ArrayList<Throwable> arrayListM90456c;
            Object objM90457d = m90457d();
            if (objM90457d == null) {
                arrayListM90456c = m90456c();
            } else if (objM90457d instanceof Throwable) {
                ArrayList<Throwable> arrayListM90456c2 = m90456c();
                arrayListM90456c2.add(objM90457d);
                arrayListM90456c = arrayListM90456c2;
            } else if (objM90457d instanceof ArrayList) {
                arrayListM90456c = (ArrayList) objM90457d;
            } else {
                throw new IllegalStateException(("State is " + objM90457d).toString());
            }
            Throwable thM90458e = m90458e();
            if (thM90458e != null) {
                arrayListM90456c.add(0, thM90458e);
            }
            if (proposedException != null && !Intrinsics.areEqual(proposedException, thM90458e)) {
                arrayListM90456c.add(proposedException);
            }
            m90464n(C41551b2.f91465e);
            return arrayListM90456c;
        }

        /* JADX INFO: renamed from: m */
        public final void m90463m(boolean z11) {
            f91436c.set(this, z11 ? 1 : 0);
        }

        /* JADX INFO: renamed from: n */
        public final void m90464n(Object obj) {
            f91438e.set(this, obj);
        }

        /* JADX INFO: renamed from: o */
        public final void m90465o(@Nullable Throwable th2) {
            f91437d.set(this, th2);
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.JobSupport$d */
    /* JADX INFO: compiled from: JobSupport.kt */
    /* JADX INFO: loaded from: classes61.dex */
    @Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u0018\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u0010\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, m90084d2 = {"Lkotlinx/coroutines/JobSupport$d;", "Lkotlinx/coroutines/a2;", "Lkotlinx/coroutines/selects/i;", "select", "<init>", "(Lkotlinx/coroutines/JobSupport;Lkotlinx/coroutines/selects/i;)V", "", "cause", "", "v", "(Ljava/lang/Throwable;)V", "f", "Lkotlinx/coroutines/selects/i;", "", "u", "()Z", "onCancelling", "kotlinx-coroutines-core"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
    public final class C41538d extends AbstractC41542a2 {

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        @NotNull
        public final InterfaceC41754i<?> select;

        @Override // kotlinx.coroutines.AbstractC41542a2
        /* JADX INFO: renamed from: u */
        public boolean mo90449u() {
            return false;
        }

        public C41538d(InterfaceC41754i<?> interfaceC41754i) {
            this.select = interfaceC41754i;
        }

        @Override // kotlinx.coroutines.AbstractC41542a2
        /* JADX INFO: renamed from: v */
        public void mo90450v(@Nullable Throwable cause) {
            Object objM90428k0 = JobSupport.this.m90428k0();
            if (!(objM90428k0 instanceof C41549b0)) {
                objM90428k0 = C41551b2.m90495h(objM90428k0);
            }
            this.select.mo91278f(JobSupport.this, objM90428k0);
        }
    }

    /* JADX INFO: renamed from: A0 */
    public final void m90381A0(C41590f2 c41590f2, Throwable th2) throws Throwable {
        c41590f2.m91075f(1);
        Object objM91079j = c41590f2.m91079j();
        Intrinsics.checkNotNull(objM91079j, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
        CompletionHandlerException completionHandlerException = null;
        for (LockFreeLinkedListNode lockFreeLinkedListNodeM91080k = (LockFreeLinkedListNode) objM91079j; !Intrinsics.areEqual(lockFreeLinkedListNodeM91080k, c41590f2); lockFreeLinkedListNodeM91080k = lockFreeLinkedListNodeM91080k.m91080k()) {
            if (lockFreeLinkedListNodeM91080k instanceof AbstractC41542a2) {
                try {
                    ((AbstractC41542a2) lockFreeLinkedListNodeM91080k).mo90450v(th2);
                } catch (Throwable th3) {
                    if (completionHandlerException != null) {
                        ExceptionsKt.addSuppressed(completionHandlerException, th3);
                    } else {
                        completionHandlerException = new CompletionHandlerException("Exception in completion handler " + lockFreeLinkedListNodeM91080k + " for " + this, th3);
                        Unit unit = Unit.INSTANCE;
                    }
                }
            }
        }
        if (completionHandlerException != null) {
            mo90430o0(completionHandlerException);
        }
    }

    /* JADX INFO: renamed from: e0 */
    public boolean getHandlesException() {
        return true;
    }

    /* JADX INFO: renamed from: g0 */
    public boolean mo90422g0() {
        return false;
    }

    /* JADX INFO: renamed from: n0 */
    public boolean mo90429n0(@NotNull Throwable exception) {
        return false;
    }

    /* JADX INFO: renamed from: r0 */
    public boolean mo90433r0() {
        return false;
    }

    /* JADX INFO: renamed from: u0 */
    public final Object m90437u0(Object cause) throws Throwable {
        Throwable thM90414Z = null;
        while (true) {
            Object objM90428k0 = m90428k0();
            if (objM90428k0 instanceof C41537c) {
                synchronized (objM90428k0) {
                    if (((C41537c) objM90428k0).m90461k()) {
                        return C41551b2.f91464d;
                    }
                    boolean zM90459i = ((C41537c) objM90428k0).m90459i();
                    if (cause != null || !zM90459i) {
                        if (thM90414Z == null) {
                            thM90414Z = m90414Z(cause);
                        }
                        ((C41537c) objM90428k0).m90455b(thM90414Z);
                    }
                    Throwable thM90458e = zM90459i ? null : ((C41537c) objM90428k0).m90458e();
                    if (thM90458e != null) {
                        m90446z0(((C41537c) objM90428k0).getList(), thM90458e);
                    }
                    return C41551b2.f91461a;
                }
            }
            if (!(objM90428k0 instanceof InterfaceC41741s1)) {
                return C41551b2.f91464d;
            }
            if (thM90414Z == null) {
                thM90414Z = m90414Z(cause);
            }
            InterfaceC41741s1 interfaceC41741s1 = (InterfaceC41741s1) objM90428k0;
            if (!interfaceC41741s1.getIsActive()) {
                Object objM90404R0 = m90404R0(objM90428k0, new C41549b0(thM90414Z, false, 2, null));
                if (objM90404R0 == C41551b2.f91461a) {
                    throw new IllegalStateException(("Cannot happen in " + objM90428k0).toString());
                }
                if (objM90404R0 != C41551b2.f91463c) {
                    return objM90404R0;
                }
            } else if (m90402Q0(interfaceC41741s1, thM90414Z)) {
                return C41551b2.f91461a;
            }
        }
    }

    /* JADX INFO: renamed from: N0 */
    public static /* synthetic */ CancellationException m90378N0(JobSupport jobSupport, Throwable th2, String str, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: toCancellationException");
        }
        if ((i11 & 1) != 0) {
            str = null;
        }
        return jobSupport.m90395M0(th2, str);
    }

    /* JADX INFO: renamed from: B0 */
    public final Object m90382B0(Object ignoredParam, Object result) throws Throwable {
        if (result instanceof C41549b0) {
            throw ((C41549b0) result).cause;
        }
        return result;
    }

    /* JADX INFO: renamed from: G0 */
    public final void m90388G0(C41585e1 state) {
        C41590f2 c41590f2 = new C41590f2();
        Object c41730r1 = c41590f2;
        if (!state.getIsActive()) {
            c41730r1 = new C41730r1(c41590f2);
        }
        C1481a.m2260a(f91429b, this, state, c41730r1);
    }

    /* JADX INFO: renamed from: H0 */
    public final void m90389H0(AbstractC41542a2 state) {
        state.m91074e(new C41590f2());
        C1481a.m2260a(f91429b, this, state, state.m91080k());
    }

    /* JADX INFO: renamed from: K0 */
    public final int m90392K0(Object state) {
        if (state instanceof C41585e1) {
            if (((C41585e1) state).getIsActive()) {
                return 0;
            }
            if (!C1481a.m2260a(f91429b, this, state, C41551b2.f91467g)) {
                return -1;
            }
            mo90387F0();
            return 1;
        }
        if (!(state instanceof C41730r1)) {
            return 0;
        }
        if (!C1481a.m2260a(f91429b, this, state, ((C41730r1) state).getList())) {
            return -1;
        }
        mo90387F0();
        return 1;
    }

    /* JADX INFO: renamed from: L0 */
    public final String m90393L0(Object state) {
        if (!(state instanceof C41537c)) {
            if (state instanceof InterfaceC41741s1) {
                return ((InterfaceC41741s1) state).getIsActive() ? "Active" : "New";
            }
            return state instanceof C41549b0 ? "Cancelled" : "Completed";
        }
        C41537c c41537c = (C41537c) state;
        if (c41537c.m90459i()) {
            return "Cancelling";
        }
        return c41537c.m90460j() ? "Completing" : "Active";
    }

    @NotNull
    /* JADX INFO: renamed from: M0 */
    public final CancellationException m90395M0(@NotNull Throwable th2, @Nullable String str) {
        CancellationException jobCancellationException = th2 instanceof CancellationException ? (CancellationException) th2 : null;
        if (jobCancellationException == null) {
            if (str == null) {
                str = mo90410V();
            }
            jobCancellationException = new JobCancellationException(str, th2, this);
        }
        return jobCancellationException;
    }

    @NotNull
    /* JADX INFO: renamed from: O0 */
    public final String m90398O0() {
        return mo90443x0() + '{' + m90393L0(m90428k0()) + '}';
    }

    /* JADX INFO: renamed from: P */
    public final Object m90399P(Continuation<Object> continuation) {
        C41535a c41535a = new C41535a(IntrinsicsKt.intercepted(continuation), this);
        c41535a.m91142E();
        C41724q.m91186a(c41535a, JobKt__JobKt.m90372p(this, false, new C41703k2(c41535a), 1, null));
        Object objM91171w = c41535a.m91171w();
        if (objM91171w == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return objM91171w;
    }

    /* JADX INFO: renamed from: R0 */
    public final Object m90404R0(Object state, Object proposedUpdate) {
        if (!(state instanceof InterfaceC41741s1)) {
            return C41551b2.f91461a;
        }
        if ((!(state instanceof C41585e1) && !(state instanceof AbstractC41542a2)) || (state instanceof C41761u) || (proposedUpdate instanceof C41549b0)) {
            return m90406S0((InterfaceC41741s1) state, proposedUpdate);
        }
        return m90400P0((InterfaceC41741s1) state, proposedUpdate) ? proposedUpdate : C41551b2.f91463c;
    }

    /* JADX INFO: renamed from: T0 */
    public final boolean m90408T0(C41537c state, C41761u child, Object proposedUpdate) {
        while (C41783z1.m91409o(child.childJob, false, new C41536b(this, state, child, proposedUpdate)) == C41689h2.f91736b) {
            child = m90444y0(child);
            if (child == null) {
                return false;
            }
        }
        return true;
    }

    @NotNull
    /* JADX INFO: renamed from: V */
    public String mo90410V() {
        return "Job was cancelled";
    }

    /* JADX INFO: renamed from: W */
    public boolean mo90411W(@NotNull Throwable cause) {
        if (cause instanceof CancellationException) {
            return true;
        }
        return m90403R(cause) && getHandlesException();
    }

    /* JADX INFO: renamed from: Z */
    public final Throwable m90414Z(Object cause) {
        if (cause == null ? true : cause instanceof Throwable) {
            Throwable th2 = (Throwable) cause;
            return th2 == null ? new JobCancellationException(mo90410V(), null, this) : th2;
        }
        Intrinsics.checkNotNull(cause, "null cannot be cast to non-null type kotlinx.coroutines.ParentJob");
        return ((InterfaceC41699j2) cause).mo90445z();
    }

    @Override // kotlinx.coroutines.InterfaceC41775x1
    /* JADX INFO: renamed from: a */
    public void mo90415a(@Nullable CancellationException cause) throws Throwable {
        if (cause == null) {
            cause = new JobCancellationException(mo90410V(), null, this);
        }
        mo90405S(cause);
    }

    /* JADX INFO: renamed from: a0 */
    public final Object m90416a0(C41537c state, Object proposedUpdate) throws Throwable {
        boolean zM90459i;
        Throwable thM90419d0;
        C41549b0 c41549b0 = proposedUpdate instanceof C41549b0 ? (C41549b0) proposedUpdate : null;
        Throwable th2 = c41549b0 != null ? c41549b0.cause : null;
        synchronized (state) {
            zM90459i = state.m90459i();
            List<Throwable> listM90462l = state.m90462l(th2);
            thM90419d0 = m90419d0(state, listM90462l);
            if (thM90419d0 != null) {
                m90394M(thM90419d0, listM90462l);
            }
        }
        if (thM90419d0 != null && thM90419d0 != th2) {
            proposedUpdate = new C41549b0(thM90419d0, false, 2, null);
        }
        if (thM90419d0 != null && (m90409U(thM90419d0) || mo90429n0(thM90419d0))) {
            Intrinsics.checkNotNull(proposedUpdate, "null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally");
            ((C41549b0) proposedUpdate).m90487c();
        }
        if (!zM90459i) {
            m90384D0(thM90419d0);
        }
        mo90386E0(proposedUpdate);
        C1481a.m2260a(f91429b, this, state, C41551b2.m90494g(proposedUpdate));
        m90412X(state, proposedUpdate);
        return proposedUpdate;
    }

    /* JADX INFO: renamed from: c0 */
    public final Throwable m90418c0(Object obj) {
        C41549b0 c41549b0 = obj instanceof C41549b0 ? (C41549b0) obj : null;
        if (c41549b0 != null) {
            return c41549b0.cause;
        }
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: f0 */
    public final InterfaceC41751f<?> m90421f0() {
        JobSupport$onAwaitInternal$1 jobSupport$onAwaitInternal$1 = JobSupport$onAwaitInternal$1.INSTANCE;
        Intrinsics.checkNotNull(jobSupport$onAwaitInternal$1, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = \"clauseObject\")] kotlin.Any, @[ParameterName(name = \"select\")] kotlinx.coroutines.selects.SelectInstance<*>, @[ParameterName(name = \"param\")] kotlin.Any?, kotlin.Unit>");
        Function3 function3 = (Function3) TypeIntrinsics.beforeCheckcastToFunctionOfArity(jobSupport$onAwaitInternal$1, 3);
        JobSupport$onAwaitInternal$2 jobSupport$onAwaitInternal$2 = JobSupport$onAwaitInternal$2.INSTANCE;
        Intrinsics.checkNotNull(jobSupport$onAwaitInternal$2, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = \"clauseObject\")] kotlin.Any, @[ParameterName(name = \"param\")] kotlin.Any?, @[ParameterName(name = \"clauseResult\")] kotlin.Any?, kotlin.Any?>");
        return new C41752g(this, function3, (Function3) TypeIntrinsics.beforeCheckcastToFunctionOfArity(jobSupport$onAwaitInternal$2, 3), null, 8, null);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element
    @NotNull
    public final CoroutineContext.Key<?> getKey() {
        return InterfaceC41775x1.INSTANCE;
    }

    @Override // kotlinx.coroutines.InterfaceC41775x1
    @NotNull
    /* JADX INFO: renamed from: j */
    public final InterfaceC41550b1 mo90426j(@NotNull Function1<? super Throwable, Unit> handler) {
        return m90432q0(true, new C41771w1(handler));
    }

    /* JADX INFO: renamed from: p0 */
    public final void m90431p0(@Nullable InterfaceC41775x1 parent) {
        if (parent == null) {
            m90391J0(C41689h2.f91736b);
            return;
        }
        parent.start();
        InterfaceC41757t interfaceC41757tMo90436u = parent.mo90436u(this);
        m90391J0(interfaceC41757tMo90436u);
        if (isCompleted()) {
            interfaceC41757tMo90436u.dispose();
            m90391J0(C41689h2.f91736b);
        }
    }

    /* JADX INFO: renamed from: t0 */
    public final Object m90435t0(Continuation<? super Unit> continuation) {
        C41716o c41716o = new C41716o(IntrinsicsKt.intercepted(continuation), 1);
        c41716o.m91142E();
        C41724q.m91186a(c41716o, JobKt__JobKt.m90372p(this, false, new C41707l2(c41716o), 1, null));
        Object objM91171w = c41716o.m91171w();
        if (objM91171w == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return objM91171w == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM91171w : Unit.INSTANCE;
    }

    @NotNull
    public String toString() {
        return m90398O0() + '@' + C41717o0.m91175b(this);
    }

    @Override // kotlinx.coroutines.InterfaceC41775x1
    @NotNull
    /* JADX INFO: renamed from: u */
    public final InterfaceC41757t mo90436u(@NotNull InterfaceC41765v child) {
        C41761u c41761u = new C41761u(child);
        c41761u.m90480w(this);
        while (true) {
            Object objM90428k0 = m90428k0();
            if (objM90428k0 instanceof C41585e1) {
                C41585e1 c41585e1 = (C41585e1) objM90428k0;
                if (!c41585e1.getIsActive()) {
                    m90388G0(c41585e1);
                } else if (C1481a.m2260a(f91429b, this, objM90428k0, c41761u)) {
                    return c41761u;
                }
            } else {
                Throwable thM90458e = null;
                if (!(objM90428k0 instanceof InterfaceC41741s1)) {
                    Object objM90428k1 = m90428k0();
                    C41549b0 c41549b0 = objM90428k1 instanceof C41549b0 ? (C41549b0) objM90428k1 : null;
                    c41761u.mo90450v(c41549b0 != null ? c41549b0.cause : null);
                    return C41689h2.f91736b;
                }
                C41590f2 list = ((InterfaceC41741s1) objM90428k0).getList();
                if (list != null) {
                    if (!list.m91072c(c41761u, 7)) {
                        boolean zM91072c = list.m91072c(c41761u, 3);
                        Object objM90428k2 = m90428k0();
                        if (objM90428k2 instanceof C41537c) {
                            thM90458e = ((C41537c) objM90428k2).m90458e();
                        } else {
                            C41549b0 c41549b1 = objM90428k2 instanceof C41549b0 ? (C41549b0) objM90428k2 : null;
                            if (c41549b1 != null) {
                                thM90458e = c41549b1.cause;
                            }
                        }
                        c41761u.mo90450v(thM90458e);
                        if (!zM91072c) {
                            return C41689h2.f91736b;
                        }
                    }
                    return c41761u;
                }
                Intrinsics.checkNotNull(objM90428k0, "null cannot be cast to non-null type kotlinx.coroutines.JobNode");
                m90389H0((AbstractC41542a2) objM90428k0);
            }
        }
    }

    @Override // kotlinx.coroutines.InterfaceC41775x1
    @NotNull
    /* JADX INFO: renamed from: v */
    public final Sequence<InterfaceC41775x1> mo90438v() {
        return SequencesKt.sequence(new JobSupport$children$1(this, null));
    }

    @Override // kotlinx.coroutines.InterfaceC41775x1
    @NotNull
    /* JADX INFO: renamed from: w */
    public final InterfaceC41550b1 mo90440w(boolean onCancelling, boolean invokeImmediately, @NotNull Function1<? super Throwable, Unit> handler) {
        return m90432q0(invokeImmediately, onCancelling ? new C41767v1(handler) : new C41771w1(handler));
    }

    public JobSupport(boolean z11) {
        this._state$volatile = z11 ? C41551b2.f91467g : C41551b2.f91466f;
    }

    /* JADX INFO: renamed from: C0 */
    public final void m90383C0(InterfaceC41754i<?> select, Object ignoredParam) {
        Object objM90428k0;
        do {
            objM90428k0 = m90428k0();
            if (!(objM90428k0 instanceof InterfaceC41741s1)) {
                if (!(objM90428k0 instanceof C41549b0)) {
                    objM90428k0 = C41551b2.m90495h(objM90428k0);
                }
                select.mo91276c(objM90428k0);
                return;
            }
        } while (m90392K0(objM90428k0) < 0);
        select.mo91277d(JobKt__JobKt.m90372p(this, false, new C41538d(select), 1, null));
    }

    @Override // kotlinx.coroutines.InterfaceC41775x1
    @Nullable
    /* JADX INFO: renamed from: E */
    public final Object mo90385E(@NotNull Continuation<? super Unit> continuation) {
        if (!m90434s0()) {
            C41783z1.m91406l(continuation.get$context());
            return Unit.INSTANCE;
        }
        Object objM90435t0 = m90435t0(continuation);
        if (objM90435t0 == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            return objM90435t0;
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: I0 */
    public final void m90390I0(@NotNull AbstractC41542a2 node) {
        Object objM90428k0;
        do {
            objM90428k0 = m90428k0();
            if (objM90428k0 instanceof AbstractC41542a2) {
                if (objM90428k0 != node) {
                    return;
                }
            } else {
                if ((objM90428k0 instanceof InterfaceC41741s1) && ((InterfaceC41741s1) objM90428k0).getList() != null) {
                    node.m91083q();
                    return;
                }
                return;
            }
        } while (!C1481a.m2260a(f91429b, this, objM90428k0, C41551b2.f91467g));
    }

    /* JADX INFO: renamed from: J0 */
    public final void m90391J0(@Nullable InterfaceC41757t interfaceC41757t) {
        f91430c.set(this, interfaceC41757t);
    }

    /* JADX INFO: renamed from: M */
    public final void m90394M(Throwable rootCause, List<? extends Throwable> exceptions) {
        if (exceptions.size() > 1) {
            Set setNewSetFromMap = Collections.newSetFromMap(new IdentityHashMap(exceptions.size()));
            for (Throwable th2 : exceptions) {
                if (th2 != rootCause && th2 != rootCause && !(th2 instanceof CancellationException) && setNewSetFromMap.add(th2)) {
                    ExceptionsKt.addSuppressed(rootCause, th2);
                }
            }
        }
    }

    @Nullable
    /* JADX INFO: renamed from: O */
    public final Object m90397O(@NotNull Continuation<Object> continuation) throws Throwable {
        Object objM90428k0;
        do {
            objM90428k0 = m90428k0();
            if (!(objM90428k0 instanceof InterfaceC41741s1)) {
                if (!(objM90428k0 instanceof C41549b0)) {
                    return C41551b2.m90495h(objM90428k0);
                }
                throw ((C41549b0) objM90428k0).cause;
            }
        } while (m90392K0(objM90428k0) < 0);
        return m90399P(continuation);
    }

    /* JADX INFO: renamed from: P0 */
    public final boolean m90400P0(InterfaceC41741s1 state, Object update) throws Throwable {
        if (!C1481a.m2260a(f91429b, this, state, C41551b2.m90494g(update))) {
            return false;
        }
        m90384D0(null);
        mo90386E0(update);
        m90412X(state, update);
        return true;
    }

    /* JADX INFO: renamed from: Q */
    public final boolean m90401Q(@Nullable Throwable cause) {
        return m90403R(cause);
    }

    /* JADX INFO: renamed from: Q0 */
    public final boolean m90402Q0(InterfaceC41741s1 state, Throwable rootCause) throws Throwable {
        C41590f2 c41590f2M90423h0 = m90423h0(state);
        if (c41590f2M90423h0 == null) {
            return false;
        }
        if (!C1481a.m2260a(f91429b, this, state, new C41537c(c41590f2M90423h0, false, rootCause))) {
            return false;
        }
        m90446z0(c41590f2M90423h0, rootCause);
        return true;
    }

    /* JADX INFO: renamed from: R */
    public final boolean m90403R(@Nullable Object cause) throws Throwable {
        Object objM90437u0 = C41551b2.f91461a;
        if (mo90422g0() && (objM90437u0 = m90407T(cause)) == C41551b2.f91462b) {
            return true;
        }
        if (objM90437u0 == C41551b2.f91461a) {
            objM90437u0 = m90437u0(cause);
        }
        if (objM90437u0 == C41551b2.f91461a || objM90437u0 == C41551b2.f91462b) {
            return true;
        }
        if (objM90437u0 == C41551b2.f91464d) {
            return false;
        }
        mo90396N(objM90437u0);
        return true;
    }

    /* JADX INFO: renamed from: S */
    public void mo90405S(@NotNull Throwable cause) throws Throwable {
        m90403R(cause);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [T, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX INFO: renamed from: S0 */
    public final Object m90406S0(InterfaceC41741s1 state, Object proposedUpdate) throws Throwable {
        C41537c c41537c;
        C41549b0 c41549b0;
        C41590f2 c41590f2M90423h0 = m90423h0(state);
        if (c41590f2M90423h0 == null) {
            return C41551b2.f91463c;
        }
        ?? r11 = 0;
        if (state instanceof C41537c) {
            c41537c = (C41537c) state;
        } else {
            c41537c = null;
        }
        if (c41537c == null) {
            c41537c = new C41537c(c41590f2M90423h0, false, null);
        }
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        synchronized (c41537c) {
            if (c41537c.m90460j()) {
                return C41551b2.f91461a;
            }
            c41537c.m90463m(true);
            if (c41537c != state && !C1481a.m2260a(f91429b, this, state, c41537c)) {
                return C41551b2.f91463c;
            }
            boolean zM90459i = c41537c.m90459i();
            if (proposedUpdate instanceof C41549b0) {
                c41549b0 = (C41549b0) proposedUpdate;
            } else {
                c41549b0 = null;
            }
            if (c41549b0 != null) {
                c41537c.m90455b(c41549b0.cause);
            }
            Throwable thM90458e = c41537c.m90458e();
            if (!zM90459i) {
                r11 = thM90458e;
            }
            objectRef.element = r11;
            Unit unit = Unit.INSTANCE;
            if (r11 != 0) {
                m90446z0(c41590f2M90423h0, r11);
            }
            C41761u c41761uM90444y0 = m90444y0(c41590f2M90423h0);
            if (c41761uM90444y0 != null && m90408T0(c41537c, c41761uM90444y0, proposedUpdate)) {
                return C41551b2.f91462b;
            }
            c41590f2M90423h0.m91075f(2);
            C41761u c41761uM90444y1 = m90444y0(c41590f2M90423h0);
            if (c41761uM90444y1 != null && m90408T0(c41537c, c41761uM90444y1, proposedUpdate)) {
                return C41551b2.f91462b;
            }
            return m90416a0(c41537c, proposedUpdate);
        }
    }

    /* JADX INFO: renamed from: T */
    public final Object m90407T(Object cause) {
        Object objM90404R0;
        do {
            Object objM90428k0 = m90428k0();
            if (!(objM90428k0 instanceof InterfaceC41741s1) || ((objM90428k0 instanceof C41537c) && ((C41537c) objM90428k0).m90460j())) {
                return C41551b2.f91461a;
            }
            objM90404R0 = m90404R0(objM90428k0, new C41549b0(m90414Z(cause), false, 2, null));
        } while (objM90404R0 == C41551b2.f91463c);
        return objM90404R0;
    }

    /* JADX INFO: renamed from: U */
    public final boolean m90409U(Throwable cause) {
        if (mo90433r0()) {
            return true;
        }
        boolean z11 = cause instanceof CancellationException;
        InterfaceC41757t interfaceC41757tM90427j0 = m90427j0();
        if (interfaceC41757tM90427j0 != null && interfaceC41757tM90427j0 != C41689h2.f91736b) {
            if (interfaceC41757tM90427j0.mo91065b(cause) || z11) {
                return true;
            }
            return false;
        }
        return z11;
    }

    /* JADX INFO: renamed from: X */
    public final void m90412X(InterfaceC41741s1 state, Object update) throws Throwable {
        C41549b0 c41549b0;
        InterfaceC41757t interfaceC41757tM90427j0 = m90427j0();
        if (interfaceC41757tM90427j0 != null) {
            interfaceC41757tM90427j0.dispose();
            m90391J0(C41689h2.f91736b);
        }
        Throwable th2 = null;
        if (update instanceof C41549b0) {
            c41549b0 = (C41549b0) update;
        } else {
            c41549b0 = null;
        }
        if (c41549b0 != null) {
            th2 = c41549b0.cause;
        }
        if (state instanceof AbstractC41542a2) {
            try {
                ((AbstractC41542a2) state).mo90450v(th2);
                return;
            } catch (Throwable th3) {
                mo90430o0(new CompletionHandlerException("Exception in completion handler " + state + " for " + this, th3));
                return;
            }
        }
        C41590f2 list = state.getList();
        if (list != null) {
            m90381A0(list, th2);
        }
    }

    /* JADX INFO: renamed from: Y */
    public final void m90413Y(C41537c state, C41761u lastChild, Object proposedUpdate) {
        C41761u c41761uM90444y0 = m90444y0(lastChild);
        if (c41761uM90444y0 == null || !m90408T0(state, c41761uM90444y0, proposedUpdate)) {
            state.getList().m91075f(2);
            C41761u c41761uM90444y1 = m90444y0(lastChild);
            if (c41761uM90444y1 != null && m90408T0(state, c41761uM90444y1, proposedUpdate)) {
                return;
            }
            mo90396N(m90416a0(state, proposedUpdate));
        }
    }

    @Nullable
    /* JADX INFO: renamed from: b0 */
    public final Object m90417b0() throws Throwable {
        Object objM90428k0 = m90428k0();
        if (!(objM90428k0 instanceof InterfaceC41741s1)) {
            if (!(objM90428k0 instanceof C41549b0)) {
                return C41551b2.m90495h(objM90428k0);
            }
            throw ((C41549b0) objM90428k0).cause;
        }
        throw new IllegalStateException("This job has not completed yet");
    }

    /* JADX INFO: renamed from: d0 */
    public final Throwable m90419d0(C41537c state, List<? extends Throwable> exceptions) {
        Object next;
        Object obj = null;
        if (exceptions.isEmpty()) {
            if (!state.m90459i()) {
                return null;
            }
            return new JobCancellationException(mo90410V(), null, this);
        }
        Iterator<T> it = exceptions.iterator();
        do {
            if (it.hasNext()) {
                next = it.next();
            } else {
                next = null;
                break;
            }
        } while (((Throwable) next) instanceof CancellationException);
        Throwable th2 = (Throwable) next;
        if (th2 != null) {
            return th2;
        }
        Throwable th3 = exceptions.get(0);
        if (th3 instanceof TimeoutCancellationException) {
            for (Object obj2 : exceptions) {
                Throwable th4 = (Throwable) obj2;
                if (th4 != th3 && (th4 instanceof TimeoutCancellationException)) {
                    obj = obj2;
                    break;
                }
            }
            Throwable th5 = (Throwable) obj;
            if (th5 != null) {
                return th5;
            }
        }
        return th3;
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, p852kotlin.coroutines.CoroutineContext
    public <R> R fold(R r11, @NotNull Function2<? super R, ? super CoroutineContext.Element, ? extends R> function2) {
        return (R) InterfaceC41775x1.a.m91378b(this, r11, function2);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, p852kotlin.coroutines.CoroutineContext
    @Nullable
    public <E extends CoroutineContext.Element> E get(@NotNull CoroutineContext.Key<E> key) {
        return (E) InterfaceC41775x1.a.m91379c(this, key);
    }

    /* JADX INFO: renamed from: h0 */
    public final C41590f2 m90423h0(InterfaceC41741s1 state) {
        C41590f2 list = state.getList();
        if (list == null) {
            if (state instanceof C41585e1) {
                return new C41590f2();
            }
            if (state instanceof AbstractC41542a2) {
                m90389H0((AbstractC41542a2) state);
                return null;
            }
            throw new IllegalStateException(("State should have list: " + state).toString());
        }
        return list;
    }

    @Override // kotlinx.coroutines.InterfaceC41765v
    /* JADX INFO: renamed from: i */
    public final void mo90424i(@NotNull InterfaceC41699j2 parentJob) throws Throwable {
        m90403R(parentJob);
    }

    @Nullable
    /* JADX INFO: renamed from: i0 */
    public InterfaceC41775x1 m90425i0() {
        InterfaceC41757t interfaceC41757tM90427j0 = m90427j0();
        if (interfaceC41757tM90427j0 != null) {
            return interfaceC41757tM90427j0.getParent();
        }
        return null;
    }

    @Override // kotlinx.coroutines.InterfaceC41775x1
    public boolean isActive() {
        Object objM90428k0 = m90428k0();
        if ((objM90428k0 instanceof InterfaceC41741s1) && ((InterfaceC41741s1) objM90428k0).getIsActive()) {
            return true;
        }
        return false;
    }

    @Override // kotlinx.coroutines.InterfaceC41775x1
    public final boolean isCancelled() {
        Object objM90428k0 = m90428k0();
        if (!(objM90428k0 instanceof C41549b0)) {
            if (!(objM90428k0 instanceof C41537c) || !((C41537c) objM90428k0).m90459i()) {
                return false;
            }
            return true;
        }
        return true;
    }

    @Override // kotlinx.coroutines.InterfaceC41775x1
    public final boolean isCompleted() {
        return !(m90428k0() instanceof InterfaceC41741s1);
    }

    @Nullable
    /* JADX INFO: renamed from: j0 */
    public final InterfaceC41757t m90427j0() {
        return (InterfaceC41757t) f91430c.get(this);
    }

    @Nullable
    /* JADX INFO: renamed from: k0 */
    public final Object m90428k0() {
        return f91429b.get(this);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, p852kotlin.coroutines.CoroutineContext
    @NotNull
    public CoroutineContext minusKey(@NotNull CoroutineContext.Key<?> key) {
        return InterfaceC41775x1.a.m91380d(this, key);
    }

    @Override // p852kotlin.coroutines.CoroutineContext
    @NotNull
    public CoroutineContext plus(@NotNull CoroutineContext coroutineContext) {
        return InterfaceC41775x1.a.m91381e(this, coroutineContext);
    }

    @NotNull
    /* JADX INFO: renamed from: q0 */
    public final InterfaceC41550b1 m90432q0(boolean invokeImmediately, @NotNull AbstractC41542a2 node) {
        boolean z11;
        Throwable th2;
        C41549b0 c41549b0;
        boolean zM91072c;
        C41537c c41537c;
        Throwable thM90458e;
        node.m90480w(this);
        while (true) {
            Object objM90428k0 = m90428k0();
            z11 = true;
            th2 = null;
            if (objM90428k0 instanceof C41585e1) {
                C41585e1 c41585e1 = (C41585e1) objM90428k0;
                if (c41585e1.getIsActive()) {
                    if (C1481a.m2260a(f91429b, this, objM90428k0, node)) {
                        break;
                    }
                } else {
                    m90388G0(c41585e1);
                }
            } else if (objM90428k0 instanceof InterfaceC41741s1) {
                InterfaceC41741s1 interfaceC41741s1 = (InterfaceC41741s1) objM90428k0;
                C41590f2 list = interfaceC41741s1.getList();
                if (list == null) {
                    Intrinsics.checkNotNull(objM90428k0, "null cannot be cast to non-null type kotlinx.coroutines.JobNode");
                    m90389H0((AbstractC41542a2) objM90428k0);
                } else {
                    if (node.mo90449u()) {
                        if (interfaceC41741s1 instanceof C41537c) {
                            c41537c = (C41537c) interfaceC41741s1;
                        } else {
                            c41537c = null;
                        }
                        if (c41537c != null) {
                            thM90458e = c41537c.m90458e();
                        } else {
                            thM90458e = null;
                        }
                        if (thM90458e == null) {
                            zM91072c = list.m91072c(node, 5);
                        } else {
                            if (invokeImmediately) {
                                node.mo90450v(thM90458e);
                            }
                            return C41689h2.f91736b;
                        }
                    } else {
                        zM91072c = list.m91072c(node, 1);
                    }
                    if (zM91072c) {
                        break;
                    }
                }
            } else {
                z11 = false;
                break;
            }
        }
        if (z11) {
            return node;
        }
        if (invokeImmediately) {
            Object objM90428k1 = m90428k0();
            if (objM90428k1 instanceof C41549b0) {
                c41549b0 = (C41549b0) objM90428k1;
            } else {
                c41549b0 = null;
            }
            if (c41549b0 != null) {
                th2 = c41549b0.cause;
            }
            node.mo90450v(th2);
        }
        return C41689h2.f91736b;
    }

    /* JADX INFO: renamed from: s0 */
    public final boolean m90434s0() {
        Object objM90428k0;
        do {
            objM90428k0 = m90428k0();
            if (!(objM90428k0 instanceof InterfaceC41741s1)) {
                return false;
            }
        } while (m90392K0(objM90428k0) < 0);
        return true;
    }

    @Override // kotlinx.coroutines.InterfaceC41775x1
    public final boolean start() {
        int iM90392K0;
        do {
            iM90392K0 = m90392K0(m90428k0());
            if (iM90392K0 == 0) {
                return false;
            }
        } while (iM90392K0 != 1);
        return true;
    }

    /* JADX INFO: renamed from: v0 */
    public final boolean m90439v0(@Nullable Object proposedUpdate) {
        Object objM90404R0;
        do {
            objM90404R0 = m90404R0(m90428k0(), proposedUpdate);
            if (objM90404R0 == C41551b2.f91461a) {
                return false;
            }
            if (objM90404R0 == C41551b2.f91462b) {
                return true;
            }
        } while (objM90404R0 == C41551b2.f91463c);
        mo90396N(objM90404R0);
        return true;
    }

    @Nullable
    /* JADX INFO: renamed from: w0 */
    public final Object m90441w0(@Nullable Object proposedUpdate) {
        Object objM90404R0;
        do {
            objM90404R0 = m90404R0(m90428k0(), proposedUpdate);
            if (objM90404R0 == C41551b2.f91461a) {
                throw new IllegalStateException("Job " + this + " is already complete or completing, but is being completed with " + proposedUpdate, m90418c0(proposedUpdate));
            }
        } while (objM90404R0 == C41551b2.f91463c);
        return objM90404R0;
    }

    @Override // kotlinx.coroutines.InterfaceC41775x1
    @NotNull
    /* JADX INFO: renamed from: x */
    public final CancellationException mo90442x() {
        Object objM90428k0 = m90428k0();
        if (objM90428k0 instanceof C41537c) {
            Throwable thM90458e = ((C41537c) objM90428k0).m90458e();
            if (thM90458e != null) {
                CancellationException cancellationExceptionM90395M0 = m90395M0(thM90458e, C41717o0.m91174a(this) + " is cancelling");
                if (cancellationExceptionM90395M0 != null) {
                    return cancellationExceptionM90395M0;
                }
            }
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        }
        if (!(objM90428k0 instanceof InterfaceC41741s1)) {
            if (objM90428k0 instanceof C41549b0) {
                return m90378N0(this, ((C41549b0) objM90428k0).cause, null, 1, null);
            }
            return new JobCancellationException(C41717o0.m91174a(this) + " has completed normally", null, this);
        }
        throw new IllegalStateException(("Job is still new or active: " + this).toString());
    }

    @NotNull
    /* JADX INFO: renamed from: x0 */
    public String mo90443x0() {
        return C41717o0.m91174a(this);
    }

    /* JADX INFO: renamed from: y0 */
    public final C41761u m90444y0(LockFreeLinkedListNode lockFreeLinkedListNode) {
        while (lockFreeLinkedListNode.mo91082p()) {
            lockFreeLinkedListNode = lockFreeLinkedListNode.m91081l();
        }
        while (true) {
            lockFreeLinkedListNode = lockFreeLinkedListNode.m91080k();
            if (!lockFreeLinkedListNode.mo91082p()) {
                if (lockFreeLinkedListNode instanceof C41761u) {
                    return (C41761u) lockFreeLinkedListNode;
                }
                if (lockFreeLinkedListNode instanceof C41590f2) {
                    return null;
                }
            }
        }
    }

    @Override // kotlinx.coroutines.InterfaceC41699j2
    @NotNull
    /* JADX INFO: renamed from: z */
    public CancellationException mo90445z() {
        Throwable thM90458e;
        Object objM90428k0 = m90428k0();
        CancellationException cancellationException = null;
        if (objM90428k0 instanceof C41537c) {
            thM90458e = ((C41537c) objM90428k0).m90458e();
        } else if (objM90428k0 instanceof C41549b0) {
            thM90458e = ((C41549b0) objM90428k0).cause;
        } else if (!(objM90428k0 instanceof InterfaceC41741s1)) {
            thM90458e = null;
        } else {
            throw new IllegalStateException(("Cannot be cancelling child in this state: " + objM90428k0).toString());
        }
        if (thM90458e instanceof CancellationException) {
            cancellationException = (CancellationException) thM90458e;
        }
        if (cancellationException == null) {
            return new JobCancellationException("Parent job is " + m90393L0(objM90428k0), thM90458e, this);
        }
        return cancellationException;
    }

    /* JADX INFO: renamed from: z0 */
    public final void m90446z0(C41590f2 list, Throwable cause) throws Throwable {
        m90384D0(cause);
        list.m91075f(4);
        Object objM91079j = list.m91079j();
        Intrinsics.checkNotNull(objM91079j, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
        CompletionHandlerException completionHandlerException = null;
        for (LockFreeLinkedListNode lockFreeLinkedListNodeM91080k = (LockFreeLinkedListNode) objM91079j; !Intrinsics.areEqual(lockFreeLinkedListNodeM91080k, list); lockFreeLinkedListNodeM91080k = lockFreeLinkedListNodeM91080k.m91080k()) {
            if ((lockFreeLinkedListNodeM91080k instanceof AbstractC41542a2) && ((AbstractC41542a2) lockFreeLinkedListNodeM91080k).mo90449u()) {
                try {
                    ((AbstractC41542a2) lockFreeLinkedListNodeM91080k).mo90450v(cause);
                } catch (Throwable th2) {
                    if (completionHandlerException != null) {
                        ExceptionsKt.addSuppressed(completionHandlerException, th2);
                    } else {
                        completionHandlerException = new CompletionHandlerException("Exception in completion handler " + lockFreeLinkedListNodeM91080k + " for " + this, th2);
                        Unit unit = Unit.INSTANCE;
                    }
                }
            }
        }
        if (completionHandlerException != null) {
            mo90430o0(completionHandlerException);
        }
        m90409U(cause);
    }

    /* JADX INFO: renamed from: F0 */
    public void mo90387F0() {
    }

    /* JADX INFO: renamed from: D0 */
    public void m90384D0(@Nullable Throwable cause) {
    }

    /* JADX INFO: renamed from: E0 */
    public void mo90386E0(@Nullable Object state) {
    }

    /* JADX INFO: renamed from: N */
    public void mo90396N(@Nullable Object state) {
    }

    /* JADX INFO: renamed from: o0 */
    public void mo90430o0(@NotNull Throwable exception) throws Throwable {
        throw exception;
    }
}
