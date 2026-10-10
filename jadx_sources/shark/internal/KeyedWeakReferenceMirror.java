package shark.internal;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.tencent.qcloud.tuicore.TUIConstants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.TypeCastException;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import shark.C44455h;
import shark.C44488j;
import shark.HeapObject;
import shark.ValueHolder;

/* JADX INFO: compiled from: KeyedWeakReferenceMirror.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0000\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001fB3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\u0011\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0013\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u000e\u001a\u0004\b\u0012\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0018\u001a\u0004\b\u0014\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0018\u001a\u0004\b\r\u0010\u0019R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\u001dR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u001c\u001a\u0004\b\u001a\u0010\u001d¨\u0006 "}, m90084d2 = {"Lshark/internal/KeyedWeakReferenceMirror;", "", "Lshark/ValueHolder$h;", "referent", "", "key", TUIConstants.TUIPlugin.PLUGIN_DESCRIPTION, "", "watchDurationMillis", "retainedDurationMillis", "<init>", "(Lshark/ValueHolder$h;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;)V", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Z", "b", "()Z", "hasReferent", "g", "isRetained", "c", "Lshark/ValueHolder$h;", "d", "()Lshark/ValueHolder$h;", "Ljava/lang/String;", "()Ljava/lang/String;", "e", "f", "Ljava/lang/Long;", "()Ljava/lang/Long;", CmcdData.Factory.STREAMING_FORMAT_HLS, "Companion", "shark"}, m90085k = 1, m90086mv = {1, 4, 1})
public final class KeyedWeakReferenceMirror {

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final boolean hasReferent;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final boolean isRetained;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final ValueHolder.ReferenceHolder referent;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final String key;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public final String description;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    public final Long watchDurationMillis;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @Nullable
    public final Long retainedDurationMillis;

    /* JADX INFO: compiled from: KeyedWeakReferenceMirror.kt */
    @Metadata(m90082bv = {1, 0, 3}, m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001d\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u000bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\f"}, m90084d2 = {"Lshark/internal/KeyedWeakReferenceMirror$Companion;", "", "()V", "UNKNOWN_LEGACY", "", "fromInstance", "Lshark/internal/KeyedWeakReferenceMirror;", "weakRef", "Lshark/HeapObject$HeapInstance;", "heapDumpUptimeMillis", "", "(Lshark/HeapObject$HeapInstance;Ljava/lang/Long;)Lshark/internal/KeyedWeakReferenceMirror;", "shark"}, m90085k = 1, m90086mv = {1, 4, 1})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KeyedWeakReferenceMirror fromInstance(@NotNull HeapObject.HeapInstance weakRef, @Nullable Long heapDumpUptimeMillis) {
            Long lValueOf;
            String strM98439g;
            C44488j value;
            String strM98034p = weakRef.m98034p();
            Long lValueOf2 = null;
            if (heapDumpUptimeMillis != null) {
                long jLongValue = heapDumpUptimeMillis.longValue();
                C44455h c44455hM98028j = weakRef.m98028j(strM98034p, "watchUptimeMillis");
                if (c44455hM98028j == null) {
                    Intrinsics.throwNpe();
                }
                Long lM98434b = c44455hM98028j.getValue().m98434b();
                if (lM98434b == null) {
                    Intrinsics.throwNpe();
                }
                lValueOf = Long.valueOf(jLongValue - lM98434b.longValue());
            } else {
                lValueOf = null;
            }
            if (heapDumpUptimeMillis != null) {
                C44455h c44455hM98028j2 = weakRef.m98028j(strM98034p, "retainedUptimeMillis");
                if (c44455hM98028j2 == null) {
                    Intrinsics.throwNpe();
                }
                Long lM98434b2 = c44455hM98028j2.getValue().m98434b();
                if (lM98434b2 == null) {
                    Intrinsics.throwNpe();
                }
                long jLongValue2 = lM98434b2.longValue();
                long jLongValue3 = -1;
                if (jLongValue2 != -1) {
                    jLongValue3 = heapDumpUptimeMillis.longValue() - jLongValue2;
                }
                lValueOf2 = Long.valueOf(jLongValue3);
            }
            Long l11 = lValueOf2;
            C44455h c44455hM98028j3 = weakRef.m98028j(strM98034p, "key");
            if (c44455hM98028j3 == null) {
                Intrinsics.throwNpe();
            }
            String strM98439g2 = c44455hM98028j3.getValue().m98439g();
            if (strM98439g2 == null) {
                Intrinsics.throwNpe();
            }
            C44455h c44455hM98028j4 = weakRef.m98028j(strM98034p, TUIConstants.TUIPlugin.PLUGIN_DESCRIPTION);
            if (c44455hM98028j4 == null) {
                c44455hM98028j4 = weakRef.m98028j(strM98034p, "name");
            }
            if (c44455hM98028j4 == null || (value = c44455hM98028j4.getValue()) == null || (strM98439g = value.m98439g()) == null) {
                strM98439g = "Unknown (legacy)";
            }
            String str = strM98439g;
            C44455h c44455hM98028j5 = weakRef.m98028j("java.lang.ref.Reference", "referent");
            if (c44455hM98028j5 == null) {
                Intrinsics.throwNpe();
            }
            ValueHolder valueHolder = c44455hM98028j5.getValue().getCom.tencent.bugly.proguard.u6.i java.lang.String();
            if (valueHolder != null) {
                return new KeyedWeakReferenceMirror((ValueHolder.ReferenceHolder) valueHolder, strM98439g2, str, lValueOf, l11);
            }
            throw new TypeCastException("null cannot be cast to non-null type shark.ValueHolder.ReferenceHolder");
        }
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getHasReferent() {
        return this.hasReferent;
    }

    @NotNull
    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getKey() {
        return this.key;
    }

    @NotNull
    /* JADX INFO: renamed from: d, reason: from getter */
    public final ValueHolder.ReferenceHolder getReferent() {
        return this.referent;
    }

    @Nullable
    /* JADX INFO: renamed from: e, reason: from getter */
    public final Long getRetainedDurationMillis() {
        return this.retainedDurationMillis;
    }

    @Nullable
    /* JADX INFO: renamed from: f, reason: from getter */
    public final Long getWatchDurationMillis() {
        return this.watchDurationMillis;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final boolean getIsRetained() {
        return this.isRetained;
    }

    public KeyedWeakReferenceMirror(@NotNull ValueHolder.ReferenceHolder referenceHolder, @NotNull String str, @NotNull String str2, @Nullable Long l11, @Nullable Long l12) {
        boolean z11;
        this.referent = referenceHolder;
        this.key = str;
        this.description = str2;
        this.watchDurationMillis = l11;
        this.retainedDurationMillis = l12;
        if (referenceHolder.getValue() != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.hasReferent = z11;
        this.isRetained = l12 == null || l12 == null || l12.longValue() != -1;
    }
}
