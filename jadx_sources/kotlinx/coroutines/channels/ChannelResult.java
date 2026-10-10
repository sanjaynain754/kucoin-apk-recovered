package kotlinx.coroutines.channels;

import androidx.exifinterface.media.ExifInterface;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.tencent.bugly.proguard.C33954u6;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.PublishedApi;
import p852kotlin.jvm.JvmField;
import p852kotlin.jvm.JvmInline;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Channel.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087@\u0018\u0000 \u001e*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002:\u0003\u001e\u0014\u001fB\u0013\b\u0001\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u0006\u0010\u0005J\u000f\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0000X\u0081\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u0012\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0019\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0013R\u0011\u0010\u001b\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0013R\u0011\u0010\u001d\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0013\u0088\u0001\u0003\u0092\u0001\u0004\u0018\u00010\u0002¨\u0006 "}, m90084d2 = {"Lkotlinx/coroutines/channels/ChannelResult;", ExifInterface.GPS_DIRECTION_TRUE, "", C33954u6.f72238i, "c", "(Ljava/lang/Object;)Ljava/lang/Object;", "f", "", "e", "(Ljava/lang/Object;)Ljava/lang/Throwable;", "", "k", "(Ljava/lang/Object;)Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Ljava/lang/Object;", "getHolder$annotations", "()V", "j", "isSuccess", "i", "isFailure", CmcdData.Factory.STREAMING_FORMAT_HLS, "isClosed", "b", "Companion", "kotlinx-coroutines-core"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
@JvmInline
@SourceDebugExtension({"SMAP\nChannel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Channel.kt\nkotlinx/coroutines/channels/ChannelResult\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1485:1\n1#2:1486\n*E\n"})
public final class ChannelResult<T> {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: c */
    @NotNull
    public static final C41560b f91509c = new C41560b();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    public final Object holder;

    /* JADX INFO: compiled from: Channel.kt */
    @Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00010\u0006\"\u0004\b\u0001\u0010\u00042\u0006\u0010\u0005\u001a\u00028\u0001H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00010\u0006\"\u0004\b\u0001\u0010\u0004H\u0007¢\u0006\u0004\b\n\u0010\u000bJ%\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00010\u0006\"\u0004\b\u0001\u0010\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0007¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, m90084d2 = {"Lkotlinx/coroutines/channels/ChannelResult$Companion;", "", "<init>", "()V", ExifInterface.LONGITUDE_EAST, "value", "Lkotlinx/coroutines/channels/ChannelResult;", "success-JP2dKIU", "(Ljava/lang/Object;)Ljava/lang/Object;", "success", "failure-PtdJZtk", "()Ljava/lang/Object;", "failure", "", "cause", "closed-JP2dKIU", "(Ljava/lang/Throwable;)Ljava/lang/Object;", "closed", "Lkotlinx/coroutines/channels/ChannelResult$b;", "failed", "Lkotlinx/coroutines/channels/ChannelResult$b;", "kotlinx-coroutines-core"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @NotNull
        /* JADX INFO: renamed from: closed-JP2dKIU, reason: not valid java name */
        public final <E> Object m105329closedJP2dKIU(@Nullable Throwable cause) {
            return ChannelResult.m90670c(new Closed(cause));
        }

        @NotNull
        /* JADX INFO: renamed from: failure-PtdJZtk, reason: not valid java name */
        public final <E> Object m105330failurePtdJZtk() {
            return ChannelResult.m90670c(ChannelResult.f91509c);
        }

        @NotNull
        /* JADX INFO: renamed from: success-JP2dKIU, reason: not valid java name */
        public final <E> Object m105331successJP2dKIU(E value) {
            return ChannelResult.m90670c(value);
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.ChannelResult$a, reason: from toString */
    /* JADX INFO: compiled from: Channel.kt */
    @Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0096\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, m90084d2 = {"Lkotlinx/coroutines/channels/ChannelResult$a;", "Lkotlinx/coroutines/channels/ChannelResult$b;", "", "cause", "<init>", "(Ljava/lang/Throwable;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Ljava/lang/Throwable;", "kotlinx-coroutines-core"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
    public static final class Closed extends C41560b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @JvmField
        @Nullable
        public final Throwable cause;

        public boolean equals(@Nullable Object other) {
            return (other instanceof Closed) && Intrinsics.areEqual(this.cause, ((Closed) other).cause);
        }

        public int hashCode() {
            Throwable th2 = this.cause;
            if (th2 != null) {
                return th2.hashCode();
            }
            return 0;
        }

        @Override // kotlinx.coroutines.channels.ChannelResult.C41560b
        @NotNull
        public String toString() {
            return "Closed(" + this.cause + ')';
        }

        public Closed(@Nullable Throwable th2) {
            this.cause = th2;
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.ChannelResult$b */
    /* JADX INFO: compiled from: Channel.kt */
    @Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0010\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m90084d2 = {"Lkotlinx/coroutines/channels/ChannelResult$b;", "", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "kotlinx-coroutines-core"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
    public static class C41560b {
        @NotNull
        public String toString() {
            return "Failed";
        }
    }

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ ChannelResult m90669b(Object obj) {
        return new ChannelResult(obj);
    }

    /* JADX INFO: renamed from: d */
    public static boolean m90671d(Object obj, Object obj2) {
        return (obj2 instanceof ChannelResult) && Intrinsics.areEqual(obj, ((ChannelResult) obj2).getHolder());
    }

    @Nullable
    /* JADX INFO: renamed from: e */
    public static final Throwable m90672e(Object obj) {
        Closed closed = obj instanceof Closed ? (Closed) obj : null;
        if (closed != null) {
            return closed.cause;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    /* JADX INFO: renamed from: f */
    public static final T m90673f(Object obj) {
        if (obj instanceof C41560b) {
            return null;
        }
        return obj;
    }

    /* JADX INFO: renamed from: g */
    public static int m90674g(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: h */
    public static final boolean m90675h(Object obj) {
        return obj instanceof Closed;
    }

    /* JADX INFO: renamed from: i */
    public static final boolean m90676i(Object obj) {
        return obj instanceof C41560b;
    }

    /* JADX INFO: renamed from: j */
    public static final boolean m90677j(Object obj) {
        return !(obj instanceof C41560b);
    }

    @NotNull
    /* JADX INFO: renamed from: k */
    public static String m90678k(Object obj) {
        if (obj instanceof Closed) {
            return ((Closed) obj).toString();
        }
        return "Value(" + obj + ')';
    }

    public boolean equals(Object other) {
        return m90671d(this.holder, other);
    }

    public int hashCode() {
        return m90674g(this.holder);
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final /* synthetic */ Object getHolder() {
        return this.holder;
    }

    @NotNull
    public String toString() {
        return m90678k(this.holder);
    }

    @PublishedApi
    public /* synthetic */ ChannelResult(Object obj) {
        this.holder = obj;
    }

    @PublishedApi
    @NotNull
    /* JADX INFO: renamed from: c */
    public static <T> Object m90670c(@Nullable Object obj) {
        return obj;
    }
}
