package kotlinx.coroutines.selects;

import androidx.concurrent.futures.C1481a;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.sensorsdata.analytics.android.sdk.data.adapter.DbParams;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.C41716o;
import kotlinx.coroutines.C41724q;
import kotlinx.coroutines.InterfaceC41550b1;
import kotlinx.coroutines.InterfaceC41704l;
import kotlinx.coroutines.InterfaceC41708m;
import kotlinx.coroutines.InterfaceC41784z2;
import og0.AbstractC43081x;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.PublishedApi;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.CoroutineContext;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugProbesKt;
import p852kotlin.jvm.JvmField;
import p852kotlin.jvm.JvmName;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.functions.Function3;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Select.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0011\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u00022\b\u0012\u0004\u0012\u00028\u00000\u00032\b\u0012\u0004\u0012\u00028\u00000\u0004:\u0001!B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00028\u0000H\u0082@¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\fH\u0082@¢\u0006\u0004\b\u000f\u0010\nJ\u0017\u0010\u0010\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0010\u0010\u000eJ!\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\u00042\b\u0010\u0011\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J#\u0010\u0016\u001a\u000e\u0018\u00010\u0015R\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u000b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00028\u0000H\u0082@¢\u0006\u0004\b\u0018\u0010\nJ!\u0010\u001a\u001a\u00020\f2\u0010\u0010\u0019\u001a\f0\u0015R\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00028\u0000H\u0091@¢\u0006\u0004\b\u001c\u0010\nJ2\u0010!\u001a\u00020\f*\u00020\u001d2\u001c\u0010 \u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u001f\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u001eH\u0096\u0002¢\u0006\u0004\b!\u0010\"JD\u0010&\u001a\u00020\f\"\u0004\b\u0001\u0010#*\b\u0012\u0004\u0012\u00028\u00010$2\"\u0010 \u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u001f\u0012\u0006\u0012\u0004\u0018\u00010\u00040%H\u0096\u0002¢\u0006\u0004\b&\u0010'J'\u0010*\u001a\u00020\f*\f0\u0015R\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010)\u001a\u00020(H\u0001¢\u0006\u0004\b*\u0010+J\u0017\u0010.\u001a\u00020\f2\u0006\u0010-\u001a\u00020,H\u0016¢\u0006\u0004\b.\u0010/J#\u00103\u001a\u00020\f2\n\u00101\u001a\u0006\u0012\u0002\b\u0003002\u0006\u00102\u001a\u00020\u0012H\u0016¢\u0006\u0004\b3\u00104J\u0019\u00105\u001a\u00020\f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b5\u0010\u000eJ!\u00107\u001a\u00020(2\u0006\u0010\u000b\u001a\u00020\u00042\b\u00106\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b7\u00108J\u001f\u0010:\u001a\u0002092\u0006\u0010\u000b\u001a\u00020\u00042\b\u00106\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b:\u0010;J\u0019\u0010>\u001a\u00020\f2\b\u0010=\u001a\u0004\u0018\u00010<H\u0016¢\u0006\u0004\b>\u0010?R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b>\u0010@\u001a\u0004\bA\u0010BR(\u0010E\u001a\u0014\u0012\u000e\u0012\f0\u0015R\b\u0012\u0004\u0012\u00028\u00000\u0000\u0018\u00010C8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u0010DR\u0018\u0010G\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010FR\u0016\u0010I\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u0010HR\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u0010FR\u0014\u0010L\u001a\u00020(8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bJ\u0010KR\u0011\u0010N\u001a\b\u0012\u0004\u0012\u00020\u00040M8\u0002X\u0082\u0004¨\u0006O"}, m90084d2 = {"Lkotlinx/coroutines/selects/SelectImplementation;", "R", "Lkotlinx/coroutines/l;", "Lkotlinx/coroutines/selects/c;", "", "Lkotlin/coroutines/CoroutineContext;", "context", "<init>", "(Lkotlin/coroutines/CoroutineContext;)V", "q", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "clauseObject", "", CmcdData.Factory.STREAM_TYPE_LIVE, "(Ljava/lang/Object;)V", "z", "w", "internalResult", "", "y", "(Ljava/lang/Object;Ljava/lang/Object;)I", "Lkotlinx/coroutines/selects/SelectImplementation$a;", "r", "(Ljava/lang/Object;)Lkotlinx/coroutines/selects/SelectImplementation$a;", "n", "selectedClause", "m", "(Lkotlinx/coroutines/selects/SelectImplementation$a;)V", "o", "Lkotlinx/coroutines/selects/d;", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "block", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Lkotlinx/coroutines/selects/d;Lkotlin/jvm/functions/Function1;)V", "Q", "Lkotlinx/coroutines/selects/f;", "Lkotlin/Function2;", "g", "(Lkotlinx/coroutines/selects/f;Lkotlin/jvm/functions/Function2;)V", "", "reregister", "u", "(Lkotlinx/coroutines/selects/SelectImplementation$a;Z)V", "Lkotlinx/coroutines/b1;", "disposableHandle", "d", "(Lkotlinx/coroutines/b1;)V", "Log0/x;", "segment", "index", "e", "(Log0/x;I)V", "c", DbParams.KEY_CHANNEL_RESULT, "f", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "Lkotlinx/coroutines/selects/TrySelectDetailedResult;", "x", "(Ljava/lang/Object;Ljava/lang/Object;)Lkotlinx/coroutines/selects/TrySelectDetailedResult;", "", "cause", "b", "(Ljava/lang/Throwable;)V", "Lkotlin/coroutines/CoroutineContext;", "getContext", "()Lkotlin/coroutines/CoroutineContext;", "", "Ljava/util/List;", "clauses", "Ljava/lang/Object;", "disposableHandleOrSegment", "I", "indexInSegment", "t", "()Z", "isSelected", "Lkotlinx/atomicfu/AtomicRef;", "state", "kotlinx-coroutines-core"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
@PublishedApi
@SourceDebugExtension({"SMAP\nSelect.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Select.kt\nkotlinx/coroutines/selects/SelectImplementation\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n+ 5 StackTraceRecovery.kt\nkotlinx/coroutines/internal/StackTraceRecoveryKt\n*L\n1#1,904:1\n1#2:905\n2632#3,3:906\n1863#3,2:918\n1863#3,2:926\n1863#3,2:928\n426#4,9:909\n435#4,2:920\n149#5,4:922\n*S KotlinDebug\n*F\n+ 1 Select.kt\nkotlinx/coroutines/selects/SelectImplementation\n*L\n529#1:906,3\n593#1:918,2\n749#1:926,2\n774#1:928,2\n569#1:909,9\n569#1:920,2\n734#1:922,4\n*E\n"})
public class SelectImplementation<R> implements InterfaceC41704l, InterfaceC41748c<R>, InterfaceC41754i, InterfaceC41784z2 {

    /* JADX INFO: renamed from: g */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f91818g = AtomicReferenceFieldUpdater.newUpdater(SelectImplementation.class, Object.class, "state$volatile");

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final CoroutineContext context;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    public Object disposableHandleOrSegment;
    private volatile /* synthetic */ Object state$volatile = C41755j.f91846b;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    public List<SelectImplementation<R>.C41745a> clauses = new ArrayList(2);

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public int indexInSegment = -1;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    public Object internalResult = C41755j.f91849e;

    /* JADX INFO: renamed from: kotlinx.coroutines.selects.SelectImplementation$a */
    /* JADX INFO: compiled from: Select.kt */
    @Metadata(m90083d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0004\b\u0080\u0004\u0018\u00002\u00020\u0001BÆ\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012U\u0010\u000b\u001aQ\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0002\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030\u0006¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0007\u0012\u0015\u0012\u0013\u0018\u00010\u0001¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\t0\u0003j\u0002`\n\u0012U\u0010\u000e\u001aQ\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0002\u0012\u0015\u0012\u0013\u0018\u00010\u0001¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\b\u0012\u0015\u0012\u0013\u0018\u00010\u0001¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\f\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0003j\u0002`\r\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0001\u0012\u0006\u0010\u000f\u001a\u00020\u0001\u0012u\u0010\u0014\u001aq\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030\u0006¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0007\u0012\u0015\u0012\u0013\u0018\u00010\u0001¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\b\u0012\u0015\u0012\u0013\u0018\u00010\u0001¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0010\u0012\u001e\u0012\u001c\u0012\u0004\u0012\u00020\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\t0\u0003\u0018\u00010\u0003j\u0004\u0018\u0001`\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u001b\u0010\u0019\u001a\u00020\u00182\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u00012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010\u001f\u001a\u00028\u00002\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001H\u0086@¢\u0006\u0004\b\u001f\u0010 J\r\u0010!\u001a\u00020\t¢\u0006\u0004\b!\u0010\"J?\u0010#\u001a\u001e\u0012\u0004\u0012\u00020\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\t\u0018\u00010\u00032\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u00062\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b#\u0010$R\u0014\u0010\u0002\u001a\u00020\u00018\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b#\u0010%Rc\u0010\u000b\u001aQ\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0002\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030\u0006¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0007\u0012\u0015\u0012\u0013\u0018\u00010\u0001¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\t0\u0003j\u0002`\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010&Rc\u0010\u000e\u001aQ\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0002\u0012\u0015\u0012\u0013\u0018\u00010\u0001¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\b\u0012\u0015\u0012\u0013\u0018\u00010\u0001¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\f\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0003j\u0002`\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010&R\u0016\u0010\b\u001a\u0004\u0018\u00010\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010%R\u0014\u0010\u000f\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010%R\u0083\u0001\u0010\u0014\u001aq\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030\u0006¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0007\u0012\u0015\u0012\u0013\u0018\u00010\u0001¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\b\u0012\u0015\u0012\u0013\u0018\u00010\u0001¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0010\u0012\u001e\u0012\u001c\u0012\u0004\u0012\u00020\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\t0\u0003\u0018\u00010\u0003j\u0004\u0018\u0001`\u00138\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b'\u0010&R\u0018\u0010)\u001a\u0004\u0018\u00010\u00018\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b(\u0010%R\u0016\u0010-\u001a\u00020*8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b+\u0010,¨\u0006."}, m90084d2 = {"Lkotlinx/coroutines/selects/SelectImplementation$a;", "", "clauseObject", "Lkotlin/Function3;", "Lkotlin/ParameterName;", "name", "Lkotlinx/coroutines/selects/i;", "select", "param", "", "Lkotlinx/coroutines/selects/RegistrationFunction;", "regFunc", "clauseResult", "Lkotlinx/coroutines/selects/ProcessResultFunction;", "processResFunc", "block", "internalResult", "", "Lkotlin/coroutines/CoroutineContext;", "Lkotlinx/coroutines/selects/OnCancellationConstructor;", "onCancellationConstructor", "<init>", "(Lkotlinx/coroutines/selects/SelectImplementation;Ljava/lang/Object;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function3;)V", "Lkotlinx/coroutines/selects/SelectImplementation;", "", "e", "(Lkotlinx/coroutines/selects/SelectImplementation;)Z", DbParams.KEY_CHANNEL_RESULT, "d", "(Ljava/lang/Object;)Ljava/lang/Object;", "argument", "c", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "b", "()V", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Lkotlinx/coroutines/selects/i;Ljava/lang/Object;)Lkotlin/jvm/functions/Function3;", "Ljava/lang/Object;", "Lkotlin/jvm/functions/Function3;", "f", "g", "disposableHandleOrSegment", "", CmcdData.Factory.STREAMING_FORMAT_HLS, "I", "indexInSegment", "kotlinx-coroutines-core"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nSelect.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Select.kt\nkotlinx/coroutines/selects/SelectImplementation$ClauseData\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,904:1\n1#2:905\n*E\n"})
    public final class C41745a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @JvmField
        @NotNull
        public final Object clauseObject;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        public final Function3<Object, InterfaceC41754i<?>, Object, Unit> regFunc;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        @NotNull
        public final Function3<Object, Object, Object, Object> processResFunc;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @Nullable
        public final Object param;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @NotNull
        public final Object block;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        @JvmField
        @Nullable
        public final Function3<InterfaceC41754i<?>, Object, Object, Function3<Throwable, Object, CoroutineContext, Unit>> onCancellationConstructor;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        @JvmField
        @Nullable
        public Object disposableHandleOrSegment;

        /* JADX INFO: renamed from: h, reason: from kotlin metadata */
        @JvmField
        public int indexInSegment = -1;

        /* JADX WARN: Multi-variable type inference failed */
        public C41745a(@NotNull Object obj, @NotNull Function3<Object, ? super InterfaceC41754i<?>, Object, Unit> function3, @Nullable Function3<Object, Object, Object, ? extends Object> function4, @NotNull Object obj2, @Nullable Object obj3, Function3<? super InterfaceC41754i<?>, Object, Object, ? extends Function3<? super Throwable, Object, ? super CoroutineContext, Unit>> function5) {
            this.clauseObject = obj;
            this.regFunc = function3;
            this.processResFunc = function4;
            this.param = obj2;
            this.block = obj3;
            this.onCancellationConstructor = function5;
        }

        @Nullable
        /* JADX INFO: renamed from: a */
        public final Function3<Throwable, Object, CoroutineContext, Unit> m91291a(@NotNull InterfaceC41754i<?> select, @Nullable Object internalResult) {
            Function3<InterfaceC41754i<?>, Object, Object, Function3<Throwable, Object, CoroutineContext, Unit>> function3 = this.onCancellationConstructor;
            if (function3 != null) {
                return function3.invoke(select, this.param, internalResult);
            }
            return null;
        }

        /* JADX INFO: renamed from: b */
        public final void m91292b() {
            Object obj = this.disposableHandleOrSegment;
            SelectImplementation<R> selectImplementation = SelectImplementation.this;
            if (obj instanceof AbstractC43081x) {
                ((AbstractC43081x) obj).mo90700s(this.indexInSegment, null, selectImplementation.getContext());
                return;
            }
            InterfaceC41550b1 interfaceC41550b1 = obj instanceof InterfaceC41550b1 ? (InterfaceC41550b1) obj : null;
            if (interfaceC41550b1 != null) {
                interfaceC41550b1.dispose();
            }
        }

        @Nullable
        /* JADX INFO: renamed from: c */
        public final Object m91293c(@Nullable Object obj, @NotNull Continuation<? super R> continuation) {
            Object obj2 = this.block;
            if (this.param == C41755j.m91311i()) {
                Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.coroutines.SuspendFunction0<R of kotlinx.coroutines.selects.SelectImplementation>");
                return ((Function1) obj2).invoke(continuation);
            }
            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.coroutines.SuspendFunction1<kotlin.Any?, R of kotlinx.coroutines.selects.SelectImplementation>");
            return ((Function2) obj2).invoke(obj, continuation);
        }

        @Nullable
        /* JADX INFO: renamed from: d */
        public final Object m91294d(@Nullable Object result) {
            return this.processResFunc.invoke(this.clauseObject, this.param, result);
        }

        /* JADX INFO: renamed from: e */
        public final boolean m91295e(@NotNull SelectImplementation<R> select) {
            this.regFunc.invoke(this.clauseObject, select, this.param);
            return select.internalResult == C41755j.f91849e;
        }
    }

    /* JADX INFO: renamed from: v */
    public static /* synthetic */ void m91274v(SelectImplementation selectImplementation, C41745a c41745a, boolean z11, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: register");
        }
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        selectImplementation.m91286u(c41745a, z11);
    }

    @Override // kotlinx.coroutines.selects.InterfaceC41748c
    /* JADX INFO: renamed from: a */
    public void mo91275a(@NotNull InterfaceC41749d interfaceC41749d, @NotNull Function1<? super Continuation<? super R>, ? extends Object> function1) {
        m91274v(this, new C41745a(interfaceC41749d.getClauseObject(), interfaceC41749d.mo91301c(), interfaceC41749d.mo91300b(), C41755j.m91311i(), function1, interfaceC41749d.mo91299a()), false, 1, null);
    }

    @Override // kotlinx.coroutines.selects.InterfaceC41754i
    /* JADX INFO: renamed from: c */
    public void mo91276c(@Nullable Object internalResult) {
        this.internalResult = internalResult;
    }

    @Override // kotlinx.coroutines.selects.InterfaceC41754i
    /* JADX INFO: renamed from: d */
    public void mo91277d(@NotNull InterfaceC41550b1 disposableHandle) {
        this.disposableHandleOrSegment = disposableHandle;
    }

    @Override // kotlinx.coroutines.InterfaceC41784z2
    /* JADX INFO: renamed from: e */
    public void mo90632e(@NotNull AbstractC43081x<?> segment, int index) {
        this.disposableHandleOrSegment = segment;
        this.indexInSegment = index;
    }

    @Override // kotlinx.coroutines.selects.InterfaceC41748c
    /* JADX INFO: renamed from: g */
    public <Q> void mo91279g(@NotNull InterfaceC41751f<? extends Q> interfaceC41751f, @NotNull Function2<? super Q, ? super Continuation<? super R>, ? extends Object> function2) {
        m91274v(this, new C41745a(interfaceC41751f.getClauseObject(), interfaceC41751f.mo91301c(), interfaceC41751f.mo91300b(), null, function2, interfaceC41751f.mo91299a()), false, 1, null);
    }

    @Override // kotlinx.coroutines.selects.InterfaceC41754i
    @NotNull
    public CoroutineContext getContext() {
        return this.context;
    }

    /* JADX INFO: renamed from: l */
    public final void m91280l(Object clauseObject) {
        List<SelectImplementation<R>.C41745a> list = this.clauses;
        Intrinsics.checkNotNull(list);
        if (list == null || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (((C41745a) it.next()).clauseObject == clauseObject) {
                    throw new IllegalStateException(("Cannot use select clauses on the same object: " + clauseObject).toString());
                }
            }
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m91281m(SelectImplementation<R>.C41745a selectedClause) {
        List<SelectImplementation<R>.C41745a> list = this.clauses;
        if (list == null) {
            return;
        }
        for (SelectImplementation<R>.C41745a c41745a : list) {
            if (c41745a != selectedClause) {
                c41745a.m91292b();
            }
        }
        f91818g.set(this, C41755j.f91847c);
        this.internalResult = C41755j.f91849e;
        this.clauses = null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: q */
    public final Object m91284q(Continuation<? super R> continuation) {
        SelectImplementation$doSelectSuspend$1 selectImplementation$doSelectSuspend$1;
        SelectImplementation selectImplementation;
        if (continuation instanceof SelectImplementation$doSelectSuspend$1) {
            selectImplementation$doSelectSuspend$1 = (SelectImplementation$doSelectSuspend$1) continuation;
            int i11 = selectImplementation$doSelectSuspend$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                selectImplementation$doSelectSuspend$1.label = i11 - Integer.MIN_VALUE;
            } else {
                selectImplementation$doSelectSuspend$1 = new SelectImplementation$doSelectSuspend$1(this, continuation);
            }
        } else {
            selectImplementation$doSelectSuspend$1 = new SelectImplementation$doSelectSuspend$1(this, continuation);
        }
        Object obj = selectImplementation$doSelectSuspend$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = selectImplementation$doSelectSuspend$1.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(obj);
            selectImplementation$doSelectSuspend$1.L$0 = this;
            selectImplementation$doSelectSuspend$1.label = 1;
            if (m91290z(selectImplementation$doSelectSuspend$1) != coroutine_suspended) {
                selectImplementation = this;
            }
        }
        if (i12 != 1) {
            if (i12 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return obj;
        }
        SelectImplementation selectImplementation2 = (SelectImplementation) selectImplementation$doSelectSuspend$1.L$0;
        ResultKt.throwOnFailure(obj);
        selectImplementation = selectImplementation2;
        selectImplementation$doSelectSuspend$1.L$0 = null;
        selectImplementation$doSelectSuspend$1.label = 2;
        Object objM91282n = selectImplementation.m91282n(selectImplementation$doSelectSuspend$1);
        return objM91282n == coroutine_suspended ? coroutine_suspended : objM91282n;
    }

    /* JADX INFO: renamed from: r */
    public final SelectImplementation<R>.C41745a m91285r(Object clauseObject) {
        List<SelectImplementation<R>.C41745a> list = this.clauses;
        Object obj = null;
        if (list == null) {
            return null;
        }
        for (Object obj2 : list) {
            if (((C41745a) obj2).clauseObject == clauseObject) {
                obj = obj2;
                break;
            }
        }
        SelectImplementation<R>.C41745a c41745a = (C41745a) obj;
        if (c41745a != null) {
            return c41745a;
        }
        throw new IllegalStateException(("Clause with object " + clauseObject + " is not found").toString());
    }

    /* JADX INFO: renamed from: z */
    public final Object m91290z(Continuation<? super Unit> continuation) {
        C41716o c41716o = new C41716o(IntrinsicsKt.intercepted(continuation), 1);
        c41716o.m91142E();
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f91818g;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == C41755j.f91846b) {
                if (C1481a.m2260a(f91818g, this, obj, c41716o)) {
                    C41724q.m91188c(c41716o, this);
                    break;
                }
            } else {
                if (!(obj instanceof List)) {
                    if (obj instanceof C41745a) {
                        c41716o.mo91117r(Unit.INSTANCE, ((C41745a) obj).m91291a(this, this.internalResult));
                        break;
                    }
                    throw new IllegalStateException(("unexpected state: " + obj).toString());
                }
                if (C1481a.m2260a(f91818g, this, obj, C41755j.f91846b)) {
                    Iterator it = ((Iterable) obj).iterator();
                    while (it.hasNext()) {
                        m91287w(it.next());
                    }
                }
            }
        }
        Object objM91171w = c41716o.m91171w();
        if (objM91171w == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return objM91171w == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM91171w : Unit.INSTANCE;
    }

    public SelectImplementation(@NotNull CoroutineContext coroutineContext) {
        this.context = coroutineContext;
    }

    @PublishedApi
    /* JADX INFO: renamed from: p */
    public static /* synthetic */ <R> Object m91271p(SelectImplementation<R> selectImplementation, Continuation<? super R> continuation) {
        if (selectImplementation.m91273t()) {
            return selectImplementation.m91282n(continuation);
        }
        return selectImplementation.m91284q(continuation);
    }

    /* JADX INFO: renamed from: t */
    private final boolean m91273t() {
        return f91818g.get(this) instanceof C41745a;
    }

    @Override // kotlinx.coroutines.InterfaceC41704l
    /* JADX INFO: renamed from: b */
    public void mo90501b(@Nullable Throwable cause) {
        Object obj;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f91818g;
        do {
            obj = atomicReferenceFieldUpdater.get(this);
            if (obj == C41755j.f91847c) {
                return;
            }
        } while (!C1481a.m2260a(atomicReferenceFieldUpdater, this, obj, C41755j.f91848d));
        List<SelectImplementation<R>.C41745a> list = this.clauses;
        if (list == null) {
            return;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            ((C41745a) it.next()).m91292b();
        }
        this.internalResult = C41755j.f91849e;
        this.clauses = null;
    }

    @Override // kotlinx.coroutines.selects.InterfaceC41754i
    /* JADX INFO: renamed from: f */
    public boolean mo91278f(@NotNull Object clauseObject, @Nullable Object result) {
        if (m91289y(clauseObject, result) == 0) {
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: n */
    public final Object m91282n(Continuation<? super R> continuation) {
        Object obj = f91818g.get(this);
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectImplementation.ClauseData<R of kotlinx.coroutines.selects.SelectImplementation>");
        SelectImplementation<R>.C41745a c41745a = (C41745a) obj;
        Object obj2 = this.internalResult;
        m91281m(c41745a);
        return c41745a.m91293c(c41745a.m91294d(obj2), continuation);
    }

    @PublishedApi
    @Nullable
    /* JADX INFO: renamed from: o */
    public Object m91283o(@NotNull Continuation<? super R> continuation) {
        return m91271p(this, continuation);
    }

    @JvmName(name = "register")
    /* JADX INFO: renamed from: u */
    public final void m91286u(@NotNull SelectImplementation<R>.C41745a c41745a, boolean z11) {
        if (f91818g.get(this) instanceof C41745a) {
            return;
        }
        if (!z11) {
            m91280l(c41745a.clauseObject);
        }
        if (c41745a.m91295e(this)) {
            if (!z11) {
                List<SelectImplementation<R>.C41745a> list = this.clauses;
                Intrinsics.checkNotNull(list);
                list.add(c41745a);
            }
            c41745a.disposableHandleOrSegment = this.disposableHandleOrSegment;
            c41745a.indexInSegment = this.indexInSegment;
            this.disposableHandleOrSegment = null;
            this.indexInSegment = -1;
            return;
        }
        f91818g.set(this, c41745a);
    }

    /* JADX INFO: renamed from: w */
    public final void m91287w(Object clauseObject) {
        SelectImplementation<R>.C41745a c41745aM91285r = m91285r(clauseObject);
        Intrinsics.checkNotNull(c41745aM91285r);
        c41745aM91285r.disposableHandleOrSegment = null;
        c41745aM91285r.indexInSegment = -1;
        m91286u(c41745aM91285r, true);
    }

    @NotNull
    /* JADX INFO: renamed from: x */
    public final TrySelectDetailedResult m91288x(@NotNull Object clauseObject, @Nullable Object result) {
        return C41755j.m91303a(m91289y(clauseObject, result));
    }

    /* JADX INFO: renamed from: y */
    public final int m91289y(Object clauseObject, Object internalResult) {
        while (true) {
            Object obj = f91818g.get(this);
            if (obj instanceof InterfaceC41708m) {
                SelectImplementation<R>.C41745a c41745aM91285r = m91285r(clauseObject);
                if (c41745aM91285r == null) {
                    continue;
                } else {
                    Function3<Throwable, Object, CoroutineContext, Unit> function3M91291a = c41745aM91285r.m91291a(this, internalResult);
                    if (C1481a.m2260a(f91818g, this, obj, c41745aM91285r)) {
                        this.internalResult = internalResult;
                        if (C41755j.m91312j((InterfaceC41708m) obj, function3M91291a)) {
                            return 0;
                        }
                        this.internalResult = C41755j.f91849e;
                        return 2;
                    }
                }
            } else if (!Intrinsics.areEqual(obj, C41755j.f91847c) && !(obj instanceof C41745a)) {
                if (Intrinsics.areEqual(obj, C41755j.f91848d)) {
                    return 2;
                }
                if (Intrinsics.areEqual(obj, C41755j.f91846b)) {
                    if (C1481a.m2260a(f91818g, this, obj, CollectionsKt.listOf(clauseObject))) {
                        return 1;
                    }
                } else if (obj instanceof List) {
                    if (C1481a.m2260a(f91818g, this, obj, CollectionsKt.plus((Collection<? extends Object>) obj, clauseObject))) {
                        return 1;
                    }
                } else {
                    throw new IllegalStateException(("Unexpected state: " + obj).toString());
                }
            } else {
                return 3;
            }
        }
    }
}
