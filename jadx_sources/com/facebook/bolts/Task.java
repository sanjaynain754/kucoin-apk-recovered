package com.facebook.bolts;

import androidx.exifinterface.media.ExifInterface;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.facebook.bolts.Task;
import com.google.firebase.messaging.Constants;
import com.sensorsdata.analytics.android.sdk.data.adapter.DbParams;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p524p3.C43366a;
import p524p3.C43378m;
import p524p3.InterfaceC43367b;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.JvmField;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.jvm.internal.StringCompanionObject;

/* JADX INFO: compiled from: Task.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u0000 N*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0002O&B\t\b\u0010¢\u0006\u0004\b\u0003\u0010\u0004B\u0013\b\u0012\u0012\b\u0010\u0005\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u0003\u0010\u0006B\u0011\b\u0012\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0003\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\u0004J?\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00010\u0000\"\u0004\b\u0001\u0010\f2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\r2\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014J-\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00010\u0000\"\u0004\b\u0001\u0010\f2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\r¢\u0006\u0004\b\u0015\u0010\u0016J;\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00010\u0000\"\u0004\b\u0001\u0010\f2\u0018\u0010\u000e\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00000\r2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0017\u0010\u0018JE\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00010\u0000\"\u0004\b\u0001\u0010\f2\u0018\u0010\u000e\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00000\r2\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0019\u0010\u0014J?\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00010\u0000\"\u0004\b\u0001\u0010\f2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\r2\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u001a\u0010\u0014J-\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00010\u0000\"\u0004\b\u0001\u0010\f2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\r¢\u0006\u0004\b\u001b\u0010\u0016J\r\u0010\u001c\u001a\u00020\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001e\u001a\u00020\u00072\b\u0010\u0005\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ\u001d\u0010#\u001a\u00020\u00072\u000e\u0010\"\u001a\n\u0018\u00010 j\u0004\u0018\u0001`!¢\u0006\u0004\b#\u0010$R\u0014\u0010(\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u001c\u0010-\u001a\n **\u0004\u0018\u00010)0)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0016\u00100\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\u0016\u00102\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u0010/R\u0018\u00105\u001a\u0004\u0018\u00018\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R\u001e\u00108\u001a\n\u0018\u00010 j\u0004\u0018\u0001`!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107R\u0016\u0010:\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010/R\u0018\u0010>\u001a\u0004\u0018\u00010;8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010=R*\u0010C\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020@0\r\u0018\u00010?8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u0010BR\u0011\u0010E\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\bD\u0010\u001dR\u0011\u0010G\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\bF\u0010\u001dR\u0011\u0010I\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\bH\u0010\u001dR\u0013\u0010\u0005\u001a\u0004\u0018\u00018\u00008F¢\u0006\u0006\u001a\u0004\bJ\u0010KR\u0019\u0010\"\u001a\n\u0018\u00010 j\u0004\u0018\u0001`!8F¢\u0006\u0006\u001a\u0004\bL\u0010M¨\u0006P"}, m90084d2 = {"Lcom/facebook/bolts/Task;", "TResult", "", "<init>", "()V", DbParams.KEY_CHANNEL_RESULT, "(Ljava/lang/Object;)V", "", "cancelled", "(Z)V", "", "y", "TContinuationResult", "Lp3/b;", "continuation", "Ljava/util/concurrent/Executor;", "executor", "Lp3/a;", "ct", CmcdData.Factory.STREAM_TYPE_LIVE, "(Lp3/b;Ljava/util/concurrent/Executor;Lp3/a;)Lcom/facebook/bolts/Task;", "k", "(Lp3/b;)Lcom/facebook/bolts/Task;", "n", "(Lp3/b;Ljava/util/concurrent/Executor;)Lcom/facebook/bolts/Task;", "o", "w", "v", "z", "()Z", "B", "(Ljava/lang/Object;)Z", "Ljava/lang/Exception;", "Lkotlin/Exception;", Constants.IPC_BUNDLE_KEY_SEND_ERROR, ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "(Ljava/lang/Exception;)Z", "Ljava/util/concurrent/locks/ReentrantLock;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Ljava/util/concurrent/locks/ReentrantLock;", "lock", "Ljava/util/concurrent/locks/Condition;", "kotlin.jvm.PlatformType", "b", "Ljava/util/concurrent/locks/Condition;", "condition", "c", "Z", "completeField", "d", "cancelledField", "e", "Ljava/lang/Object;", "resultField", "f", "Ljava/lang/Exception;", "errorField", "g", "errorHasBeenObserved", "Lcom/facebook/bolts/a;", CmcdData.Factory.STREAMING_FORMAT_HLS, "Lcom/facebook/bolts/a;", "unobservedErrorNotifier", "", "Ljava/lang/Void;", "i", "Ljava/util/List;", "continuations", "t", "isCompleted", CmcdData.Factory.STREAMING_FORMAT_SS, "isCancelled", "u", "isFaulted", "r", "()Ljava/lang/Object;", "q", "()Ljava/lang/Exception;", "j", "Companion", "facebook-bolts_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nTask.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Task.kt\ncom/facebook/bolts/Task\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,970:1\n1#2:971\n1855#3,2:972\n*S KotlinDebug\n*F\n+ 1 Task.kt\ncom/facebook/bolts/Task\n*L\n449#1:972,2\n*E\n"})
public final class Task<TResult> {

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: k */
    @JvmField
    @NotNull
    public static final ExecutorService f8063k;

    /* JADX INFO: renamed from: l */
    @NotNull
    public static final Executor f8064l;

    /* JADX INFO: renamed from: m */
    @JvmField
    @NotNull
    public static final Executor f8065m;

    /* JADX INFO: renamed from: n */
    @NotNull
    public static final Task<?> f8066n;

    /* JADX INFO: renamed from: o */
    @NotNull
    public static final Task<Boolean> f8067o;

    /* JADX INFO: renamed from: p */
    @NotNull
    public static final Task<Boolean> f8068p;

    /* JADX INFO: renamed from: q */
    @NotNull
    public static final Task<?> f8069q;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final ReentrantLock lock;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final Condition condition;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public boolean completeField;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public boolean cancelledField;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    public TResult resultField;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    public Exception errorField;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public boolean errorHasBeenObserved;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @Nullable
    public C5551a unobservedErrorNotifier;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @Nullable
    public List<InterfaceC43367b<TResult, Void>> continuations;

    /* JADX INFO: compiled from: Task.kt */
    @Metadata(m90083d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u001e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J]\u0010\u0011\u001a\u00020\u0010\"\u0004\b\u0001\u0010\u0004\"\u0004\b\u0002\u0010\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00010\u00062\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00010\b2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00020\n2\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012Jc\u0010\u0013\u001a\u00020\u0010\"\u0004\b\u0001\u0010\u0004\"\u0004\b\u0002\u0010\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00010\u00062\u0018\u0010\t\u001a\u0014\u0012\u0004\u0012\u00028\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\n0\b2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00020\n2\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0004\b\u0013\u0010\u0012J\u0011\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u0019\u0010\u0018\u001a\u00020\u00102\b\u0010\u0017\u001a\u0004\u0018\u00010\u0014H\u0007¢\u0006\u0004\b\u0018\u0010\u0019J%\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00010\n\"\u0004\b\u0001\u0010\u00052\b\u0010\u001a\u001a\u0004\u0018\u00018\u0001H\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ+\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00010\n\"\u0004\b\u0001\u0010\u00052\u000e\u0010\u001f\u001a\n\u0018\u00010\u001dj\u0004\u0018\u0001`\u001eH\u0007¢\u0006\u0004\b \u0010!J\u001b\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00010\n\"\u0004\b\u0001\u0010\u0005H\u0007¢\u0006\u0004\b\"\u0010#J\u001f\u0010%\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010&0\n2\u0006\u0010%\u001a\u00020$H\u0007¢\u0006\u0004\b%\u0010'J)\u0010%\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010&0\n2\u0006\u0010%\u001a\u00020$2\b\u0010(\u001a\u0004\u0018\u00010\u000eH\u0007¢\u0006\u0004\b%\u0010)J1\u0010%\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010&0\n2\u0006\u0010%\u001a\u00020$2\u0006\u0010\r\u001a\u00020*2\b\u0010(\u001a\u0004\u0018\u00010\u000eH\u0001¢\u0006\u0004\b+\u0010,J+\u0010/\u001a\b\u0012\u0004\u0012\u00028\u00010\n\"\u0004\b\u0001\u0010\u00052\u000e\u0010.\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00010-H\u0007¢\u0006\u0004\b/\u00100J5\u0010/\u001a\b\u0012\u0004\u0012\u00028\u00010\n\"\u0004\b\u0001\u0010\u00052\u000e\u0010.\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00010-2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0007¢\u0006\u0004\b/\u00101J3\u00102\u001a\b\u0012\u0004\u0012\u00028\u00010\n\"\u0004\b\u0001\u0010\u00052\u000e\u0010.\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00010-2\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b2\u00103J=\u00102\u001a\b\u0012\u0004\u0012\u00028\u00010\n\"\u0004\b\u0001\u0010\u00052\u000e\u0010.\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00010-2\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0007¢\u0006\u0004\b2\u00104J+\u00102\u001a\b\u0012\u0004\u0012\u00028\u00010\n\"\u0004\b\u0001\u0010\u00052\u000e\u0010.\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00010-H\u0007¢\u0006\u0004\b2\u00100J5\u00102\u001a\b\u0012\u0004\u0012\u00028\u00010\n\"\u0004\b\u0001\u0010\u00052\u000e\u0010.\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00010-2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0007¢\u0006\u0004\b2\u00101J5\u00107\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\n0\n\"\u0004\b\u0001\u0010\u00052\u0012\u00106\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\n05H\u0007¢\u0006\u0004\b7\u00108J+\u00109\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\n2\u0010\u00106\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n05H\u0007¢\u0006\u0004\b9\u00108J7\u0010;\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00018\u00010:0\n\"\u0004\b\u0001\u0010\u00052\u0012\u00106\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\n05H\u0007¢\u0006\u0004\b;\u00108J'\u0010<\u001a\b\u0012\u0004\u0012\u00020&0\n2\u0010\u00106\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n05H\u0007¢\u0006\u0004\b<\u00108R\u0014\u0010>\u001a\u00020=8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u0014\u0010@\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u0018\u0010B\u001a\u0006\u0012\u0002\b\u00030\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u001a\u0010E\u001a\b\u0012\u0004\u0012\u00020D0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010CR\u0018\u0010F\u001a\u0006\u0012\u0002\b\u00030\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010CR\u001a\u0010G\u001a\b\u0012\u0004\u0012\u00020D0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010CR\u0014\u0010H\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bH\u0010AR\u0018\u0010I\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010J¨\u0006K"}, m90084d2 = {"Lcom/facebook/bolts/Task$Companion;", "", "<init>", "()V", "TContinuationResult", "TResult", "Lp3/m;", "tcs", "Lp3/b;", "continuation", "Lcom/facebook/bolts/Task;", "task", "Ljava/util/concurrent/Executor;", "executor", "Lp3/a;", "ct", "", CmcdData.Factory.STREAM_TYPE_LIVE, "(Lp3/m;Lp3/b;Lcom/facebook/bolts/Task;Ljava/util/concurrent/Executor;Lp3/a;)V", "i", "Lcom/facebook/bolts/Task$a;", "getUnobservedExceptionHandler", "()Lcom/facebook/bolts/Task$a;", "eh", "setUnobservedExceptionHandler", "(Lcom/facebook/bolts/Task$a;)V", "value", "forResult", "(Ljava/lang/Object;)Lcom/facebook/bolts/Task;", "Ljava/lang/Exception;", "Lkotlin/Exception;", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "forError", "(Ljava/lang/Exception;)Lcom/facebook/bolts/Task;", "cancelled", "()Lcom/facebook/bolts/Task;", "", "delay", "Ljava/lang/Void;", "(J)Lcom/facebook/bolts/Task;", "cancellationToken", "(JLp3/a;)Lcom/facebook/bolts/Task;", "Ljava/util/concurrent/ScheduledExecutorService;", "delay$facebook_bolts_release", "(JLjava/util/concurrent/ScheduledExecutorService;Lp3/a;)Lcom/facebook/bolts/Task;", "Ljava/util/concurrent/Callable;", "callable", "callInBackground", "(Ljava/util/concurrent/Callable;)Lcom/facebook/bolts/Task;", "(Ljava/util/concurrent/Callable;Lp3/a;)Lcom/facebook/bolts/Task;", "call", "(Ljava/util/concurrent/Callable;Ljava/util/concurrent/Executor;)Lcom/facebook/bolts/Task;", "(Ljava/util/concurrent/Callable;Ljava/util/concurrent/Executor;Lp3/a;)Lcom/facebook/bolts/Task;", "", "tasks", "whenAnyResult", "(Ljava/util/Collection;)Lcom/facebook/bolts/Task;", "whenAny", "", "whenAllResult", "whenAll", "Ljava/util/concurrent/ExecutorService;", "BACKGROUND_EXECUTOR", "Ljava/util/concurrent/ExecutorService;", "IMMEDIATE_EXECUTOR", "Ljava/util/concurrent/Executor;", "TASK_CANCELLED", "Lcom/facebook/bolts/Task;", "", "TASK_FALSE", "TASK_NULL", "TASK_TRUE", "UI_THREAD_EXECUTOR", "unobservedExceptionHandler", "Lcom/facebook/bolts/Task$a;", "facebook-bolts_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: com.facebook.bolts.Task$Companion$a */
        /* JADX INFO: compiled from: Task.kt */
        @Metadata(m90083d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\"\u0004\b\u0000\u0010\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m90084d2 = {"TResult", "Lcom/facebook/bolts/Task;", "", "it", "", "b", "(Lcom/facebook/bolts/Task;)Ljava/lang/Void;"}, m90085k = 3, m90086mv = {1, 8, 0})
        @SourceDebugExtension({"SMAP\nTask.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Task.kt\ncom/facebook/bolts/Task$Companion$whenAll$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,970:1\n1#2:971\n*E\n"})
        public static final class C5548a<TTaskResult, TContinuationResult> implements InterfaceC43367b {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ ReentrantLock f8079a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ AtomicBoolean f8080b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ AtomicInteger f8081c;

            /* JADX INFO: renamed from: d */
            public final /* synthetic */ ArrayList<Exception> f8082d;

            /* JADX INFO: renamed from: e */
            public final /* synthetic */ C43378m<Void> f8083e;

            public C5548a(ReentrantLock reentrantLock, AtomicBoolean atomicBoolean, AtomicInteger atomicInteger, ArrayList<Exception> arrayList, C43378m<Void> c43378m) {
                this.f8079a = reentrantLock;
                this.f8080b = atomicBoolean;
                this.f8081c = atomicInteger;
                this.f8082d = arrayList;
                this.f8083e = c43378m;
            }

            @Override // p524p3.InterfaceC43367b
            @Nullable
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Void mo8437a(@NotNull Task<Object> it) {
                Intrinsics.checkNotNullParameter(it, "it");
                if (it.m8416u()) {
                    ReentrantLock reentrantLock = this.f8079a;
                    ArrayList<Exception> arrayList = this.f8082d;
                    reentrantLock.lock();
                    try {
                        arrayList.add(it.m8412q());
                        reentrantLock.unlock();
                    } catch (Throwable th2) {
                        reentrantLock.unlock();
                        throw th2;
                    }
                }
                if (it.m8414s()) {
                    this.f8080b.set(true);
                }
                if (this.f8081c.decrementAndGet() == 0) {
                    if (this.f8082d.size() != 0) {
                        if (this.f8082d.size() == 1) {
                            this.f8083e.m95536c(this.f8082d.get(0));
                        } else {
                            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                            String str = String.format("There were %d exceptions.", Arrays.copyOf(new Object[]{Integer.valueOf(this.f8082d.size())}, 1));
                            Intrinsics.checkNotNullExpressionValue(str, "format(format, *args)");
                            this.f8083e.m95536c(new AggregateException(str, this.f8082d));
                        }
                    } else if (this.f8080b.get()) {
                        this.f8083e.m95535b();
                    } else {
                        this.f8083e.m95537d(null);
                    }
                }
                return null;
            }
        }

        /* JADX INFO: renamed from: com.facebook.bolts.Task$Companion$b */
        /* JADX INFO: compiled from: Task.kt */
        @Metadata(m90083d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u0016\u0012\u0004\u0012\u00020\u0002\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u00030\u0001J%\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m90084d2 = {"com/facebook/bolts/Task$Companion$b", "Lp3/b;", "Ljava/lang/Void;", "", "Lcom/facebook/bolts/Task;", "task", "b", "(Lcom/facebook/bolts/Task;)Ljava/util/List;", "facebook-bolts_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
        public static final class C5549b implements InterfaceC43367b<Void, List<? extends TResult>> {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ Collection<Task<TResult>> f8084a;

            public C5549b(Collection<Task<TResult>> collection) {
                this.f8084a = collection;
            }

            @Override // p524p3.InterfaceC43367b
            @NotNull
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public List<TResult> mo8437a(@NotNull Task<Void> task) {
                Intrinsics.checkNotNullParameter(task, "task");
                if (this.f8084a.isEmpty()) {
                    return CollectionsKt.emptyList();
                }
                ArrayList arrayList = new ArrayList();
                Iterator<Task<TResult>> it = this.f8084a.iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next().m8413r());
                }
                return arrayList;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final <TResult> Task<TResult> call(@NotNull Callable<TResult> callable, @NotNull Executor executor) {
            Intrinsics.checkNotNullParameter(callable, "callable");
            Intrinsics.checkNotNullParameter(executor, "executor");
            return call(callable, executor, null);
        }

        @JvmStatic
        @NotNull
        public final <TResult> Task<TResult> callInBackground(@NotNull Callable<TResult> callable) {
            Intrinsics.checkNotNullParameter(callable, "callable");
            return call(callable, Task.f8063k, null);
        }

        @JvmStatic
        @NotNull
        public final Task<Void> delay(long delay) {
            return delay$facebook_bolts_release(delay, BoltsExecutors.INSTANCE.scheduled$facebook_bolts_release(), null);
        }

        public Companion() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: h */
        public static final void m8428h(C43366a c43366a, C43378m tcs, Callable callable) {
            Intrinsics.checkNotNullParameter(tcs, "$tcs");
            Intrinsics.checkNotNullParameter(callable, "$callable");
            try {
                tcs.m95537d(callable.call());
            } catch (CancellationException unused) {
                tcs.m95535b();
            } catch (Exception e11) {
                tcs.m95536c(e11);
            }
        }

        /* JADX INFO: renamed from: j */
        public static final void m8429j(final C43366a c43366a, final C43378m tcs, InterfaceC43367b continuation, Task task) {
            Intrinsics.checkNotNullParameter(tcs, "$tcs");
            Intrinsics.checkNotNullParameter(continuation, "$continuation");
            Intrinsics.checkNotNullParameter(task, "$task");
            try {
                Task task2 = (Task) continuation.mo8437a(task);
                if (task2 != null && task2.m8408k(new InterfaceC43367b(c43366a, tcs) { // from class: p3.l

                    /* JADX INFO: renamed from: a */
                    public final /* synthetic */ C43378m f95787a;

                    @Override // p524p3.InterfaceC43367b
                    /* JADX INFO: renamed from: a */
                    public final Object mo8437a(Task task3) {
                        return Task.Companion.m8430k(null, this.f95787a, task3);
                    }

                    {
                        this.f95787a = tcs;
                    }
                }) != null) {
                    return;
                }
                tcs.m95537d(null);
                Unit unit = Unit.INSTANCE;
            } catch (CancellationException unused) {
                tcs.m95535b();
            } catch (Exception e11) {
                tcs.m95536c(e11);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: k */
        public static final Void m8430k(C43366a c43366a, C43378m tcs, Task task) {
            Intrinsics.checkNotNullParameter(tcs, "$tcs");
            Intrinsics.checkNotNullParameter(task, "task");
            if (task.m8414s()) {
                tcs.m95535b();
                return null;
            }
            if (task.m8416u()) {
                tcs.m95536c(task.m8412q());
                return null;
            }
            tcs.m95537d(task.m8413r());
            return null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: m */
        public static final void m8431m(C43366a c43366a, C43378m tcs, InterfaceC43367b continuation, Task task) {
            Intrinsics.checkNotNullParameter(tcs, "$tcs");
            Intrinsics.checkNotNullParameter(continuation, "$continuation");
            Intrinsics.checkNotNullParameter(task, "$task");
            try {
                tcs.m95537d(continuation.mo8437a(task));
            } catch (CancellationException unused) {
                tcs.m95535b();
            } catch (Exception e11) {
                tcs.m95536c(e11);
            }
        }

        /* JADX INFO: renamed from: n */
        public static final void m8432n(C43378m tcs) {
            Intrinsics.checkNotNullParameter(tcs, "$tcs");
            tcs.m95540g(null);
        }

        /* JADX INFO: renamed from: o */
        public static final Void m8433o(AtomicBoolean isAnyTaskComplete, C43378m firstCompleted, Task it) {
            Intrinsics.checkNotNullParameter(isAnyTaskComplete, "$isAnyTaskComplete");
            Intrinsics.checkNotNullParameter(firstCompleted, "$firstCompleted");
            Intrinsics.checkNotNullParameter(it, "it");
            if (isAnyTaskComplete.compareAndSet(false, true)) {
                firstCompleted.m95537d(it);
                return null;
            }
            it.m8412q();
            return null;
        }

        /* JADX INFO: renamed from: p */
        public static final Void m8434p(AtomicBoolean isAnyTaskComplete, C43378m firstCompleted, Task it) {
            Intrinsics.checkNotNullParameter(isAnyTaskComplete, "$isAnyTaskComplete");
            Intrinsics.checkNotNullParameter(firstCompleted, "$firstCompleted");
            Intrinsics.checkNotNullParameter(it, "it");
            if (isAnyTaskComplete.compareAndSet(false, true)) {
                firstCompleted.m95537d(it);
                return null;
            }
            it.m8412q();
            return null;
        }

        @JvmStatic
        @NotNull
        public final <TResult> Task<TResult> call(@NotNull final Callable<TResult> callable, @NotNull Executor executor, @Nullable final C43366a ct2) {
            Intrinsics.checkNotNullParameter(callable, "callable");
            Intrinsics.checkNotNullParameter(executor, "executor");
            final C43378m c43378m = new C43378m();
            try {
                executor.execute(new Runnable(ct2, c43378m, callable) { // from class: p3.i

                    /* JADX INFO: renamed from: b */
                    public final /* synthetic */ C43378m f95780b;

                    /* JADX INFO: renamed from: c */
                    public final /* synthetic */ Callable f95781c;

                    @Override // java.lang.Runnable
                    public final void run() {
                        Task.Companion.m8428h(null, this.f95780b, this.f95781c);
                    }

                    {
                        this.f95780b = c43378m;
                        this.f95781c = callable;
                    }
                });
            } catch (Exception e11) {
                c43378m.m95536c(new ExecutorException(e11));
            }
            return c43378m.m95534a();
        }

        @JvmStatic
        @NotNull
        public final <TResult> Task<TResult> callInBackground(@NotNull Callable<TResult> callable, @Nullable C43366a ct2) {
            Intrinsics.checkNotNullParameter(callable, "callable");
            return call(callable, Task.f8063k, ct2);
        }

        @JvmStatic
        @NotNull
        public final Task<Void> delay(long delay, @Nullable C43366a cancellationToken) {
            return delay$facebook_bolts_release(delay, BoltsExecutors.INSTANCE.scheduled$facebook_bolts_release(), cancellationToken);
        }

        @JvmStatic
        @NotNull
        public final Task<Void> delay$facebook_bolts_release(long delay, @NotNull ScheduledExecutorService executor, @Nullable C43366a cancellationToken) {
            Intrinsics.checkNotNullParameter(executor, "executor");
            if (delay <= 0) {
                return forResult(null);
            }
            final C43378m c43378m = new C43378m();
            executor.schedule(new Runnable() { // from class: p3.h
                @Override // java.lang.Runnable
                public final void run() {
                    Task.Companion.m8432n(c43378m);
                }
            }, delay, TimeUnit.MILLISECONDS);
            return c43378m.m95534a();
        }

        @JvmStatic
        @NotNull
        public final <TResult> Task<TResult> forError(@Nullable Exception error) {
            C43378m c43378m = new C43378m();
            c43378m.m95536c(error);
            return c43378m.m95534a();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @JvmStatic
        @NotNull
        public final <TResult> Task<TResult> forResult(@Nullable TResult value) {
            if (value == 0) {
                Task<TResult> task = Task.f8066n;
                Intrinsics.checkNotNull(task, "null cannot be cast to non-null type com.facebook.bolts.Task<TResult of com.facebook.bolts.Task.Companion.forResult>");
                return task;
            }
            if (value instanceof Boolean) {
                Task<TResult> task2 = ((Boolean) value).booleanValue() ? Task.f8067o : Task.f8068p;
                Intrinsics.checkNotNull(task2, "null cannot be cast to non-null type com.facebook.bolts.Task<TResult of com.facebook.bolts.Task.Companion.forResult>");
                return task2;
            }
            C43378m c43378m = new C43378m();
            c43378m.m95537d(value);
            return c43378m.m95534a();
        }

        /* JADX INFO: renamed from: i */
        public final <TContinuationResult, TResult> void m8435i(final C43378m<TContinuationResult> tcs, final InterfaceC43367b<TResult, Task<TContinuationResult>> continuation, final Task<TResult> task, Executor executor, final C43366a ct2) {
            try {
                executor.execute(new Runnable(ct2, tcs, continuation, task) { // from class: p3.f

                    /* JADX INFO: renamed from: b */
                    public final /* synthetic */ C43378m f95774b;

                    /* JADX INFO: renamed from: c */
                    public final /* synthetic */ InterfaceC43367b f95775c;

                    /* JADX INFO: renamed from: d */
                    public final /* synthetic */ Task f95776d;

                    @Override // java.lang.Runnable
                    public final void run() {
                        Task.Companion.m8429j(null, this.f95774b, this.f95775c, this.f95776d);
                    }

                    {
                        this.f95774b = tcs;
                        this.f95775c = continuation;
                        this.f95776d = task;
                    }
                });
            } catch (Exception e11) {
                tcs.m95536c(new ExecutorException(e11));
            }
        }

        /* JADX INFO: renamed from: l */
        public final <TContinuationResult, TResult> void m8436l(final C43378m<TContinuationResult> tcs, final InterfaceC43367b<TResult, TContinuationResult> continuation, final Task<TResult> task, Executor executor, final C43366a ct2) {
            try {
                executor.execute(new Runnable(ct2, tcs, continuation, task) { // from class: p3.j

                    /* JADX INFO: renamed from: b */
                    public final /* synthetic */ C43378m f95782b;

                    /* JADX INFO: renamed from: c */
                    public final /* synthetic */ InterfaceC43367b f95783c;

                    /* JADX INFO: renamed from: d */
                    public final /* synthetic */ Task f95784d;

                    @Override // java.lang.Runnable
                    public final void run() {
                        Task.Companion.m8431m(null, this.f95782b, this.f95783c, this.f95784d);
                    }

                    {
                        this.f95782b = tcs;
                        this.f95783c = continuation;
                        this.f95784d = task;
                    }
                });
            } catch (Exception e11) {
                tcs.m95536c(new ExecutorException(e11));
            }
        }

        @JvmStatic
        @NotNull
        public final <TResult> Task<TResult> cancelled() {
            Task<TResult> task = Task.f8069q;
            Intrinsics.checkNotNull(task, "null cannot be cast to non-null type com.facebook.bolts.Task<TResult of com.facebook.bolts.Task.Companion.cancelled>");
            return task;
        }

        @JvmStatic
        @Nullable
        public final InterfaceC5550a getUnobservedExceptionHandler() {
            Task.m8401i();
            return null;
        }

        @JvmStatic
        public final void setUnobservedExceptionHandler(@Nullable InterfaceC5550a eh2) {
            Task.m8402j(eh2);
        }

        @JvmStatic
        @NotNull
        public final Task<Void> whenAll(@NotNull Collection<? extends Task<?>> tasks) {
            Intrinsics.checkNotNullParameter(tasks, "tasks");
            if (tasks.isEmpty()) {
                return forResult(null);
            }
            C43378m c43378m = new C43378m();
            ArrayList arrayList = new ArrayList();
            ReentrantLock reentrantLock = new ReentrantLock();
            AtomicInteger atomicInteger = new AtomicInteger(tasks.size());
            AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            for (Task<?> task : tasks) {
                Intrinsics.checkNotNull(task, "null cannot be cast to non-null type com.facebook.bolts.Task<kotlin.Any>");
                task.m8408k(new C5548a(reentrantLock, atomicBoolean, atomicInteger, arrayList, c43378m));
            }
            return c43378m.m95534a();
        }

        @JvmStatic
        @NotNull
        public final <TResult> Task<List<TResult>> whenAllResult(@NotNull Collection<Task<TResult>> tasks) {
            Intrinsics.checkNotNullParameter(tasks, "tasks");
            return (Task<List<TResult>>) whenAll(tasks).m8417v(new C5549b(tasks));
        }

        @JvmStatic
        @NotNull
        public final Task<Task<?>> whenAny(@NotNull Collection<? extends Task<?>> tasks) {
            Intrinsics.checkNotNullParameter(tasks, "tasks");
            if (tasks.isEmpty()) {
                return forResult(null);
            }
            final C43378m c43378m = new C43378m();
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            for (Task<?> task : tasks) {
                Intrinsics.checkNotNull(task, "null cannot be cast to non-null type com.facebook.bolts.Task<kotlin.Any>");
                task.m8408k(new InterfaceC43367b() { // from class: p3.k
                    @Override // p524p3.InterfaceC43367b
                    /* JADX INFO: renamed from: a */
                    public final Object mo8437a(Task task2) {
                        return Task.Companion.m8433o(atomicBoolean, c43378m, task2);
                    }
                });
            }
            return c43378m.m95534a();
        }

        @JvmStatic
        @NotNull
        public final <TResult> Task<Task<TResult>> whenAnyResult(@NotNull Collection<Task<TResult>> tasks) {
            Intrinsics.checkNotNullParameter(tasks, "tasks");
            if (tasks.isEmpty()) {
                return forResult(null);
            }
            final C43378m c43378m = new C43378m();
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            Iterator<Task<TResult>> it = tasks.iterator();
            while (it.hasNext()) {
                it.next().m8408k(new InterfaceC43367b() { // from class: p3.g
                    @Override // p524p3.InterfaceC43367b
                    /* JADX INFO: renamed from: a */
                    public final Object mo8437a(Task task) {
                        return Task.Companion.m8434p(atomicBoolean, c43378m, task);
                    }
                });
            }
            return c43378m.m95534a();
        }

        @JvmStatic
        @NotNull
        public final <TResult> Task<TResult> call(@NotNull Callable<TResult> callable) {
            Intrinsics.checkNotNullParameter(callable, "callable");
            return call(callable, Task.f8064l, null);
        }

        @JvmStatic
        @NotNull
        public final <TResult> Task<TResult> call(@NotNull Callable<TResult> callable, @Nullable C43366a ct2) {
            Intrinsics.checkNotNullParameter(callable, "callable");
            return call(callable, Task.f8064l, ct2);
        }
    }

    /* JADX INFO: renamed from: com.facebook.bolts.Task$a */
    /* JADX INFO: compiled from: Task.kt */
    @Metadata(m90083d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m90084d2 = {"Lcom/facebook/bolts/Task$a;", "", "facebook-bolts_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    public interface InterfaceC5550a {
    }

    public Task() {
        ReentrantLock reentrantLock = new ReentrantLock();
        this.lock = reentrantLock;
        this.condition = reentrantLock.newCondition();
        this.continuations = new ArrayList();
    }

    /* JADX INFO: renamed from: i */
    public static final /* synthetic */ InterfaceC5550a m8401i() {
        return null;
    }

    static {
        BoltsExecutors.Companion companion = BoltsExecutors.INSTANCE;
        f8063k = companion.background();
        f8064l = companion.immediate$facebook_bolts_release();
        f8065m = AndroidExecutors.INSTANCE.uiThread();
        f8066n = new Task<>((Object) null);
        f8067o = new Task<>(Boolean.TRUE);
        f8068p = new Task<>(Boolean.FALSE);
        f8069q = new Task<>(true);
    }

    /* JADX INFO: renamed from: m */
    public static final Void m8403m(C43378m tcs, InterfaceC43367b continuation, Executor executor, C43366a c43366a, Task task) {
        Intrinsics.checkNotNullParameter(tcs, "$tcs");
        Intrinsics.checkNotNullParameter(continuation, "$continuation");
        Intrinsics.checkNotNullParameter(executor, "$executor");
        Intrinsics.checkNotNullParameter(task, "task");
        INSTANCE.m8436l(tcs, continuation, task, executor, c43366a);
        return null;
    }

    /* JADX INFO: renamed from: p */
    public static final Void m8404p(C43378m tcs, InterfaceC43367b continuation, Executor executor, C43366a c43366a, Task task) {
        Intrinsics.checkNotNullParameter(tcs, "$tcs");
        Intrinsics.checkNotNullParameter(continuation, "$continuation");
        Intrinsics.checkNotNullParameter(executor, "$executor");
        Intrinsics.checkNotNullParameter(task, "task");
        INSTANCE.m8435i(tcs, continuation, task, executor, c43366a);
        return null;
    }

    /* JADX INFO: renamed from: x */
    public static final Task m8405x(C43366a c43366a, InterfaceC43367b continuation, Task task) {
        Intrinsics.checkNotNullParameter(continuation, "$continuation");
        Intrinsics.checkNotNullParameter(task, "task");
        if (task.m8416u()) {
            return INSTANCE.forError(task.m8412q());
        }
        return task.m8414s() ? INSTANCE.cancelled() : task.m8408k(continuation);
    }

    /* JADX INFO: renamed from: A */
    public final boolean m8406A(@Nullable Exception error) {
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            if (this.completeField) {
                return false;
            }
            this.completeField = true;
            this.errorField = error;
            this.errorHasBeenObserved = false;
            this.condition.signalAll();
            m8419y();
            return true;
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX INFO: renamed from: B */
    public final boolean m8407B(@Nullable TResult result) {
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            if (this.completeField) {
                return false;
            }
            this.completeField = true;
            this.resultField = result;
            this.condition.signalAll();
            m8419y();
            return true;
        } finally {
            reentrantLock.unlock();
        }
    }

    @NotNull
    /* JADX INFO: renamed from: k */
    public final <TContinuationResult> Task<TContinuationResult> m8408k(@NotNull InterfaceC43367b<TResult, TContinuationResult> continuation) {
        Intrinsics.checkNotNullParameter(continuation, "continuation");
        return m8409l(continuation, f8064l, null);
    }

    @NotNull
    /* JADX INFO: renamed from: l */
    public final <TContinuationResult> Task<TContinuationResult> m8409l(@NotNull final InterfaceC43367b<TResult, TContinuationResult> continuation, @NotNull final Executor executor, @Nullable final C43366a ct2) {
        List<InterfaceC43367b<TResult, Void>> list;
        Intrinsics.checkNotNullParameter(continuation, "continuation");
        Intrinsics.checkNotNullParameter(executor, "executor");
        final C43378m c43378m = new C43378m();
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            boolean zM8415t = m8415t();
            if (!zM8415t && (list = this.continuations) != null) {
                list.add(new InterfaceC43367b(continuation, executor, ct2) { // from class: p3.c

                    /* JADX INFO: renamed from: b */
                    public final /* synthetic */ InterfaceC43367b f95768b;

                    /* JADX INFO: renamed from: c */
                    public final /* synthetic */ Executor f95769c;

                    @Override // p524p3.InterfaceC43367b
                    /* JADX INFO: renamed from: a */
                    public final Object mo8437a(Task task) {
                        return Task.m8403m(this.f95767a, this.f95768b, this.f95769c, null, task);
                    }
                });
            }
            Unit unit = Unit.INSTANCE;
            reentrantLock.unlock();
            if (zM8415t) {
                INSTANCE.m8436l(c43378m, continuation, this, executor, ct2);
            }
            return c43378m.m95534a();
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    @NotNull
    /* JADX INFO: renamed from: n */
    public final <TContinuationResult> Task<TContinuationResult> m8410n(@NotNull InterfaceC43367b<TResult, Task<TContinuationResult>> continuation, @NotNull Executor executor) {
        Intrinsics.checkNotNullParameter(continuation, "continuation");
        Intrinsics.checkNotNullParameter(executor, "executor");
        return m8411o(continuation, executor, null);
    }

    @NotNull
    /* JADX INFO: renamed from: o */
    public final <TContinuationResult> Task<TContinuationResult> m8411o(@NotNull final InterfaceC43367b<TResult, Task<TContinuationResult>> continuation, @NotNull final Executor executor, @Nullable final C43366a ct2) {
        List<InterfaceC43367b<TResult, Void>> list;
        Intrinsics.checkNotNullParameter(continuation, "continuation");
        Intrinsics.checkNotNullParameter(executor, "executor");
        final C43378m c43378m = new C43378m();
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            boolean zM8415t = m8415t();
            if (!zM8415t && (list = this.continuations) != null) {
                list.add(new InterfaceC43367b(continuation, executor, ct2) { // from class: p3.e

                    /* JADX INFO: renamed from: b */
                    public final /* synthetic */ InterfaceC43367b f95772b;

                    /* JADX INFO: renamed from: c */
                    public final /* synthetic */ Executor f95773c;

                    @Override // p524p3.InterfaceC43367b
                    /* JADX INFO: renamed from: a */
                    public final Object mo8437a(Task task) {
                        return Task.m8404p(this.f95771a, this.f95772b, this.f95773c, null, task);
                    }
                });
            }
            Unit unit = Unit.INSTANCE;
            reentrantLock.unlock();
            if (zM8415t) {
                INSTANCE.m8435i(c43378m, continuation, this, executor, ct2);
            }
            return c43378m.m95534a();
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    @Nullable
    /* JADX INFO: renamed from: q */
    public final Exception m8412q() {
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            if (this.errorField != null) {
                this.errorHasBeenObserved = true;
            }
            return this.errorField;
        } finally {
            reentrantLock.unlock();
        }
    }

    @Nullable
    /* JADX INFO: renamed from: r */
    public final TResult m8413r() {
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            return this.resultField;
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX INFO: renamed from: s */
    public final boolean m8414s() {
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            return this.cancelledField;
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX INFO: renamed from: t */
    public final boolean m8415t() {
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            return this.completeField;
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX INFO: renamed from: u */
    public final boolean m8416u() {
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            return this.errorField != null;
        } finally {
            reentrantLock.unlock();
        }
    }

    @NotNull
    /* JADX INFO: renamed from: v */
    public final <TContinuationResult> Task<TContinuationResult> m8417v(@NotNull InterfaceC43367b<TResult, TContinuationResult> continuation) {
        Intrinsics.checkNotNullParameter(continuation, "continuation");
        return m8418w(continuation, f8064l, null);
    }

    @NotNull
    /* JADX INFO: renamed from: w */
    public final <TContinuationResult> Task<TContinuationResult> m8418w(@NotNull final InterfaceC43367b<TResult, TContinuationResult> continuation, @NotNull Executor executor, @Nullable final C43366a ct2) {
        Intrinsics.checkNotNullParameter(continuation, "continuation");
        Intrinsics.checkNotNullParameter(executor, "executor");
        return m8410n(new InterfaceC43367b(ct2, continuation) { // from class: p3.d

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ InterfaceC43367b f95770a;

            @Override // p524p3.InterfaceC43367b
            /* JADX INFO: renamed from: a */
            public final Object mo8437a(Task task) {
                return Task.m8405x(null, this.f95770a, task);
            }

            {
                this.f95770a = continuation;
            }
        }, executor);
    }

    /* JADX INFO: renamed from: y */
    public final void m8419y() {
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            List<InterfaceC43367b<TResult, Void>> list = this.continuations;
            if (list != null) {
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    try {
                        ((InterfaceC43367b) it.next()).mo8437a(this);
                    } catch (RuntimeException e11) {
                        throw e11;
                    } catch (Throwable th2) {
                        throw new RuntimeException(th2);
                    }
                }
            }
            this.continuations = null;
            Unit unit = Unit.INSTANCE;
            reentrantLock.unlock();
        } catch (Throwable th3) {
            reentrantLock.unlock();
            throw th3;
        }
    }

    /* JADX INFO: renamed from: z */
    public final boolean m8420z() {
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            if (this.completeField) {
                return false;
            }
            this.completeField = true;
            this.cancelledField = true;
            this.condition.signalAll();
            m8419y();
            return true;
        } finally {
            reentrantLock.unlock();
        }
    }

    public Task(TResult tresult) {
        ReentrantLock reentrantLock = new ReentrantLock();
        this.lock = reentrantLock;
        this.condition = reentrantLock.newCondition();
        this.continuations = new ArrayList();
        m8407B(tresult);
    }

    public Task(boolean z11) {
        ReentrantLock reentrantLock = new ReentrantLock();
        this.lock = reentrantLock;
        this.condition = reentrantLock.newCondition();
        this.continuations = new ArrayList();
        if (z11) {
            m8420z();
        } else {
            m8407B(null);
        }
    }

    /* JADX INFO: renamed from: j */
    public static final /* synthetic */ void m8402j(InterfaceC5550a interfaceC5550a) {
    }
}
