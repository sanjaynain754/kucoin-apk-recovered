package shark.internal;

import androidx.media3.exoplayer.rtsp.SessionDescription;
import androidx.media3.exoplayer.upstream.CmcdData;
import java.io.IOException;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.UShort;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.collections.MapsKt;
import p852kotlin.collections.SetsKt;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.Ref;
import p852kotlin.sequences.Sequence;
import p852kotlin.sequences.SequencesKt;
import p852kotlin.text.StringsKt;
import shark.AbstractC44451d;
import shark.C44496r;
import shark.HprofHeader;
import shark.HprofRecordReader;
import shark.HprofRecordTag;
import shark.HprofVersion;
import shark.OnHprofRecordTagListener;
import shark.PrimitiveType;
import shark.StreamingHprofReader;
import shark.internal.hppc.C44482f;
import shark.internal.hppc.IntObjectPair;
import shark.internal.hppc.LongLongPair;
import shark.internal.hppc.LongLongScatterMap;
import shark.internal.hppc.LongObjectPair;
import shark.internal.hppc.LongObjectScatterMap;

/* JADX INFO: compiled from: HprofInMemoryIndex.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0019\b\u0000\u0018\u0000 92\u00020\u0001:\u0002AUB\u0097\u0001\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\t\u0012\u0006\u0010\r\u001a\u00020\t\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\u0006\u0010\u0013\u001a\u00020\u0002\u0012\u0006\u0010\u0014\u001a\u00020\u0002\u0012\u0006\u0010\u0015\u001a\u00020\u0002\u0012\u0006\u0010\u0016\u001a\u00020\u0002\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\u0006\u0010\u001b\u001a\u00020\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u001d\u0010!\u001a\u00020\u00052\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u001e¢\u0006\u0004\b!\u0010\"J\u0015\u0010#\u001a\u00020\u00052\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b#\u0010$J\u0017\u0010&\u001a\u0004\u0018\u00010\u001e2\u0006\u0010%\u001a\u00020\u0005¢\u0006\u0004\b&\u0010'J\u0019\u0010+\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020*0)0(¢\u0006\u0004\b+\u0010,J\u0019\u0010.\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020-0)0(¢\u0006\u0004\b.\u0010,J\u0019\u00100\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020/0)0(¢\u0006\u0004\b0\u0010,J\u0019\u00102\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002010)0(¢\u0006\u0004\b2\u0010,J\u0019\u00104\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002030)0(¢\u0006\u0004\b4\u0010,J\u0013\u00105\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e¢\u0006\u0004\b5\u00106J\u001d\u00109\u001a\n\u0012\u0004\u0012\u000203\u0018\u0001082\u0006\u00107\u001a\u00020\u001e¢\u0006\u0004\b9\u0010:J\u0015\u0010;\u001a\u00020\u00172\u0006\u00107\u001a\u00020\u001e¢\u0006\u0004\b;\u0010<J\u0013\u0010>\u001a\u00020**\u00020=H\u0002¢\u0006\u0004\b>\u0010?J\u0017\u0010@\u001a\u00020\u00052\u0006\u0010 \u001a\u00020\u001eH\u0002¢\u0006\u0004\b@\u0010$R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010DR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010HR\u0014\u0010\u000b\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010HR\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010HR\u0014\u0010\r\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010HR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010JR\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u0010KR\u0014\u0010\u0013\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010BR\u0014\u0010\u0014\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010BR\u0014\u0010\u0015\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010BR\u0014\u0010\u0016\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010BR\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010OR\u0017\u0010\u001a\u001a\u00020\u00198\u0006¢\u0006\f\n\u0004\b.\u0010P\u001a\u0004\bM\u0010QR\u0014\u0010\u001b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u0010BR\u0011\u0010S\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\bL\u0010RR\u0011\u0010T\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\bN\u0010R¨\u0006V"}, m90084d2 = {"Lshark/internal/HprofInMemoryIndex;", "", "", "positionSize", "Lshark/internal/hppc/LongObjectScatterMap;", "", "hprofStringCache", "Lshark/internal/hppc/LongLongScatterMap;", "classNames", "Lshark/internal/SortedBytesMap;", "classIndex", "instanceIndex", "objectArrayIndex", "primitiveArrayIndex", "", "Lshark/d;", "gcRoots", "Lshark/r;", "proguardMapping", "bytesForClassSize", "bytesForInstanceSize", "bytesForObjectArraySize", "bytesForPrimitiveArraySize", "", "useForwardSlashClassPackageSeparator", "Lshark/internal/ClassFieldsReader;", "classFieldsReader", "classFieldsIndexSize", "<init>", "(ILshark/internal/hppc/LongObjectScatterMap;Lshark/internal/hppc/LongLongScatterMap;Lshark/internal/SortedBytesMap;Lshark/internal/SortedBytesMap;Lshark/internal/SortedBytesMap;Lshark/internal/SortedBytesMap;Ljava/util/List;Lshark/r;IIIIZLshark/internal/ClassFieldsReader;I)V", "", "classId", "id", CmcdData.Factory.STREAMING_FORMAT_HLS, "(JJ)Ljava/lang/String;", "g", "(J)Ljava/lang/String;", "className", "f", "(Ljava/lang/String;)Ljava/lang/Long;", "Lkotlin/sequences/Sequence;", "Lshark/internal/hppc/d;", "Lshark/internal/h$a;", "n", "()Lkotlin/sequences/Sequence;", "Lshark/internal/h$b;", "o", "Lshark/internal/h$c;", "p", "Lshark/internal/h$d;", CmcdData.Factory.STREAMING_FORMAT_SS, "Lshark/internal/h;", "r", "i", "()Ljava/util/List;", "objectId", "Lshark/internal/hppc/b;", "q", "(J)Lshark/internal/hppc/b;", "t", "(J)Z", "Lshark/internal/b;", "u", "(Lshark/internal/b;)Lshark/internal/h$a;", "m", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "I", "b", "Lshark/internal/hppc/LongObjectScatterMap;", "c", "Lshark/internal/hppc/LongLongScatterMap;", "d", "Lshark/internal/SortedBytesMap;", "e", "Ljava/util/List;", "Lshark/r;", "j", "k", CmcdData.Factory.STREAM_TYPE_LIVE, "Z", "Lshark/internal/ClassFieldsReader;", "()Lshark/internal/ClassFieldsReader;", "()I", "classCount", "instanceCount", "Companion", "shark-graph"}, m90085k = 1, m90086mv = {1, 4, 1})
public final class HprofInMemoryIndex {

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final int positionSize;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final LongObjectScatterMap<String> hprofStringCache;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public final LongLongScatterMap classNames;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public final SortedBytesMap classIndex;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public final SortedBytesMap instanceIndex;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public final SortedBytesMap objectArrayIndex;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public final SortedBytesMap primitiveArrayIndex;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public final List<AbstractC44451d> gcRoots;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public final C44496r proguardMapping;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    public final int bytesForClassSize;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public final int bytesForInstanceSize;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    public final int bytesForObjectArraySize;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    public final int bytesForPrimitiveArraySize;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    public final boolean useForwardSlashClassPackageSeparator;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @NotNull
    public final ClassFieldsReader classFieldsReader;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    public final int classFieldsIndexSize;

    /* JADX INFO: compiled from: HprofInMemoryIndex.kt */
    @Metadata(m90083d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J5\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, m90084d2 = {"Lshark/internal/HprofInMemoryIndex$Companion;", "", "<init>", "()V", "Lshark/StreamingHprofReader;", "reader", "Lshark/HprofHeader;", "hprofHeader", "Lshark/r;", "proguardMapping", "", "Lshark/HprofRecordTag;", "indexedGcRootTags", "Lshark/internal/HprofInMemoryIndex;", "indexHprof", "(Lshark/StreamingHprofReader;Lshark/HprofHeader;Lshark/r;Ljava/util/Set;)Lshark/internal/HprofInMemoryIndex;", "", "maxValue", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(J)I", "shark-graph"}, m90085k = 1, m90086mv = {1, 4, 1})
    public static final class Companion {

        /* JADX INFO: renamed from: shark.internal.HprofInMemoryIndex$Companion$a */
        /* JADX INFO: compiled from: OnHprofRecordTagListener.kt */
        @Metadata(m90083d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J'\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b¸\u0006\u0000"}, m90084d2 = {"shark/OnHprofRecordTagListener$Companion$a", "Lshark/OnHprofRecordTagListener;", "Lshark/HprofRecordTag;", "tag", "", SessionDescription.ATTR_LENGTH, "Lshark/HprofRecordReader;", "reader", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Lshark/HprofRecordTag;JLshark/HprofRecordReader;)V", "shark-hprof"}, m90085k = 1, m90086mv = {1, 4, 1})
        public static final class C44459a implements OnHprofRecordTagListener {

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ Ref.IntRef f98332b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ Ref.LongRef f98333c;

            /* JADX INFO: renamed from: d */
            public final /* synthetic */ Ref.IntRef f98334d;

            /* JADX INFO: renamed from: e */
            public final /* synthetic */ Ref.IntRef f98335e;

            /* JADX INFO: renamed from: f */
            public final /* synthetic */ Ref.LongRef f98336f;

            /* JADX INFO: renamed from: g */
            public final /* synthetic */ Ref.IntRef f98337g;

            /* JADX INFO: renamed from: h */
            public final /* synthetic */ Ref.LongRef f98338h;

            /* JADX INFO: renamed from: i */
            public final /* synthetic */ Ref.IntRef f98339i;

            /* JADX INFO: renamed from: j */
            public final /* synthetic */ Ref.LongRef f98340j;

            public C44459a(Ref.IntRef intRef, Ref.LongRef longRef, Ref.IntRef intRef2, Ref.IntRef intRef3, Ref.LongRef longRef2, Ref.IntRef intRef4, Ref.LongRef longRef3, Ref.IntRef intRef5, Ref.LongRef longRef4) {
                this.f98332b = intRef;
                this.f98333c = longRef;
                this.f98334d = intRef2;
                this.f98335e = intRef3;
                this.f98336f = longRef2;
                this.f98337g = intRef4;
                this.f98338h = longRef3;
                this.f98339i = intRef5;
                this.f98340j = longRef4;
            }

            @Override // shark.OnHprofRecordTagListener
            /* JADX INFO: renamed from: a */
            public void mo98153a(@NotNull HprofRecordTag tag, long length, @NotNull HprofRecordReader reader) throws IOException {
                long bytesRead = reader.getBytesRead();
                int i11 = C44474g.$EnumSwitchMapping$0[tag.ordinal()];
                if (i11 != 1) {
                    if (i11 != 2) {
                        if (i11 != 3) {
                            if (i11 != 4) {
                                return;
                            }
                            this.f98339i.element++;
                            reader.m98123e0();
                            Ref.LongRef longRef = this.f98340j;
                            longRef.element = Math.max(longRef.element, reader.getBytesRead() - bytesRead);
                            return;
                        }
                        this.f98337g.element++;
                        reader.m98121d0();
                        Ref.LongRef longRef2 = this.f98338h;
                        longRef2.element = Math.max(longRef2.element, reader.getBytesRead() - bytesRead);
                        return;
                    }
                    this.f98335e.element++;
                    reader.m98119c0();
                    Ref.LongRef longRef3 = this.f98336f;
                    longRef3.element = Math.max(longRef3.element, reader.getBytesRead() - bytesRead);
                    return;
                }
                this.f98332b.element++;
                reader.m98112Y();
                long bytesRead2 = reader.getBytesRead();
                reader.m98115a0();
                reader.m98111X();
                Ref.LongRef longRef4 = this.f98333c;
                longRef4.element = Math.max(longRef4.element, reader.getBytesRead() - bytesRead);
                this.f98334d.element += (int) (reader.getBytesRead() - bytesRead2);
            }
        }

        public Companion() {
        }

        /* JADX INFO: renamed from: a */
        public final int m98239a(long maxValue) {
            int i11 = 0;
            while (maxValue != 0) {
                maxValue >>= 8;
                i11++;
            }
            return i11;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final HprofInMemoryIndex indexHprof(@NotNull StreamingHprofReader reader, @NotNull HprofHeader hprofHeader, @Nullable C44496r proguardMapping, @NotNull Set<? extends HprofRecordTag> indexedGcRootTags) {
            Ref.LongRef longRef = new Ref.LongRef();
            longRef.element = 0L;
            Ref.LongRef longRef2 = new Ref.LongRef();
            longRef2.element = 0L;
            Ref.LongRef longRef3 = new Ref.LongRef();
            longRef3.element = 0L;
            Ref.LongRef longRef4 = new Ref.LongRef();
            longRef4.element = 0L;
            Ref.IntRef intRef = new Ref.IntRef();
            intRef.element = 0;
            Ref.IntRef intRef2 = new Ref.IntRef();
            intRef2.element = 0;
            Ref.IntRef intRef3 = new Ref.IntRef();
            intRef3.element = 0;
            Ref.IntRef intRef4 = new Ref.IntRef();
            intRef4.element = 0;
            Ref.IntRef intRef5 = new Ref.IntRef();
            intRef5.element = 0;
            HprofRecordTag hprofRecordTag = HprofRecordTag.CLASS_DUMP;
            HprofRecordTag hprofRecordTag2 = HprofRecordTag.INSTANCE_DUMP;
            HprofRecordTag hprofRecordTag3 = HprofRecordTag.OBJECT_ARRAY_DUMP;
            HprofRecordTag hprofRecordTag4 = HprofRecordTag.PRIMITIVE_ARRAY_DUMP;
            Set<? extends HprofRecordTag> setOf = EnumSet.of(hprofRecordTag, hprofRecordTag2, hprofRecordTag3, hprofRecordTag4);
            Intrinsics.checkExpressionValueIsNotNull(setOf, "EnumSet.of(CLASS_DUMP, I…MP, PRIMITIVE_ARRAY_DUMP)");
            OnHprofRecordTagListener.Companion companion = OnHprofRecordTagListener.INSTANCE;
            C44460a c44460a = new C44460a(hprofHeader.getIdentifierByteSize() == 8, reader.m98155a(setOf, new C44459a(intRef, longRef, intRef5, intRef2, longRef2, intRef3, longRef3, intRef4, longRef4)), intRef.element, intRef2.element, intRef3.element, intRef4.element, m98239a(longRef.element), m98239a(longRef2.element), m98239a(longRef3.element), m98239a(longRef4.element), intRef5.element);
            EnumSet enumSetOf = EnumSet.of(HprofRecordTag.STRING_IN_UTF8, HprofRecordTag.LOAD_CLASS, hprofRecordTag, hprofRecordTag2, hprofRecordTag3, hprofRecordTag4);
            Intrinsics.checkExpressionValueIsNotNull(enumSetOf, "EnumSet.of(\n        STRI…MITIVE_ARRAY_DUMP\n      )");
            reader.m98155a(SetsKt.plus((Set) enumSetOf, (Iterable) CollectionsKt.intersect(HprofRecordTag.INSTANCE.getRootTags(), indexedGcRootTags)), c44460a);
            return c44460a.m98240b(proguardMapping, hprofHeader);
        }
    }

    /* JADX INFO: renamed from: shark.internal.HprofInMemoryIndex$a */
    /* JADX INFO: compiled from: HprofInMemoryIndex.kt */
    @Metadata(m90083d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\n\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0002\u0018\u00002\u00020\u0001B_\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\u0006\u0010\u000b\u001a\u00020\u0006\u0012\u0006\u0010\f\u001a\u00020\u0006\u0012\u0006\u0010\r\u001a\u00020\u0006\u0012\u0006\u0010\u000e\u001a\u00020\u0006\u0012\u0006\u0010\u000f\u001a\u00020\u0006¢\u0006\u0004\b\u0010\u0010\u0011J'\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001f\u0010 J\u001b\u0010\"\u001a\u00020\u0017*\u00020\u00152\u0006\u0010!\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\"\u0010#J\u000f\u0010%\u001a\u00020$H\u0002¢\u0006\u0004\b%\u0010&R\u0014\u0010(\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010'R\u0014\u0010)\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010'R\u0014\u0010*\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010'R\u001a\u0010/\u001a\b\u0012\u0004\u0012\u00020,0+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u00103\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u00107\u001a\u0002048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0016\u00109\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u0010'R\u0014\u0010=\u001a\u00020:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0014\u0010?\u001a\u00020:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010<R\u0014\u0010A\u001a\u00020:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010<R\u0014\u0010C\u001a\u00020:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010<R\u001a\u0010H\u001a\b\u0012\u0004\u0012\u00020E0D8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010GR\u0017\u0010\u000b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\bI\u0010'\u001a\u0004\bJ\u0010KR\u0017\u0010\f\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\bL\u0010'\u001a\u0004\bM\u0010KR\u0017\u0010\r\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\bN\u0010'\u001a\u0004\bO\u0010KR\u0017\u0010\u000e\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\bP\u0010'\u001a\u0004\bQ\u0010KR\u0017\u0010\u000f\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\bR\u0010'\u001a\u0004\bS\u0010K¨\u0006T"}, m90084d2 = {"Lshark/internal/HprofInMemoryIndex$a;", "Lshark/OnHprofRecordTagListener;", "", "longIdentifiers", "", "maxPosition", "", "classCount", "instanceCount", "objectArrayCount", "primitiveArrayCount", "bytesForClassSize", "bytesForInstanceSize", "bytesForObjectArraySize", "bytesForPrimitiveArraySize", "classFieldsTotalBytes", "<init>", "(ZJIIIIIIIII)V", "Lshark/HprofRecordTag;", "tag", SessionDescription.ATTR_LENGTH, "Lshark/HprofRecordReader;", "reader", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Lshark/HprofRecordTag;JLshark/HprofRecordReader;)V", "Lshark/r;", "proguardMapping", "Lshark/HprofHeader;", "hprofHeader", "Lshark/internal/HprofInMemoryIndex;", "b", "(Lshark/r;Lshark/HprofHeader;)Lshark/internal/HprofInMemoryIndex;", "byteCount", "c", "(Lshark/HprofRecordReader;I)V", "", "d", "()S", "I", "identifierSize", "positionSize", "classFieldsIndexSize", "Lshark/internal/hppc/LongObjectScatterMap;", "", "e", "Lshark/internal/hppc/LongObjectScatterMap;", "hprofStringCache", "Lshark/internal/hppc/LongLongScatterMap;", "f", "Lshark/internal/hppc/LongLongScatterMap;", "classNames", "", "g", "[B", "classFieldBytes", CmcdData.Factory.STREAMING_FORMAT_HLS, "classFieldsIndex", "Lshark/internal/m;", "i", "Lshark/internal/m;", "classIndex", "j", "instanceIndex", "k", "objectArrayIndex", CmcdData.Factory.STREAM_TYPE_LIVE, "primitiveArrayIndex", "", "Lshark/d;", "m", "Ljava/util/List;", "gcRoots", "n", "getBytesForClassSize", "()I", "o", "getBytesForInstanceSize", "p", "getBytesForObjectArraySize", "q", "getBytesForPrimitiveArraySize", "r", "getClassFieldsTotalBytes", "shark-graph"}, m90085k = 1, m90086mv = {1, 4, 1})
    public static final class C44460a implements OnHprofRecordTagListener {

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        public final int identifierSize;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        public final int positionSize;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        public final int classFieldsIndexSize;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        public final LongObjectScatterMap<String> hprofStringCache;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        public final LongLongScatterMap classNames;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        public final byte[] classFieldBytes;

        /* JADX INFO: renamed from: h, reason: from kotlin metadata */
        public int classFieldsIndex;

        /* JADX INFO: renamed from: i, reason: from kotlin metadata */
        public final C44487m classIndex;

        /* JADX INFO: renamed from: j, reason: from kotlin metadata */
        public final C44487m instanceIndex;

        /* JADX INFO: renamed from: k, reason: from kotlin metadata */
        public final C44487m objectArrayIndex;

        /* JADX INFO: renamed from: l, reason: from kotlin metadata */
        public final C44487m primitiveArrayIndex;

        /* JADX INFO: renamed from: m, reason: from kotlin metadata */
        public final List<AbstractC44451d> gcRoots;

        /* JADX INFO: renamed from: n, reason: from kotlin metadata */
        public final int bytesForClassSize;

        /* JADX INFO: renamed from: o, reason: from kotlin metadata */
        public final int bytesForInstanceSize;

        /* JADX INFO: renamed from: p, reason: from kotlin metadata */
        public final int bytesForObjectArraySize;

        /* JADX INFO: renamed from: q, reason: from kotlin metadata */
        public final int bytesForPrimitiveArraySize;

        /* JADX INFO: renamed from: r, reason: from kotlin metadata */
        public final int classFieldsTotalBytes;

        /* JADX INFO: renamed from: c */
        public final void m98241c(HprofRecordReader hprofRecordReader, int i11) {
            int i12 = 1;
            if (1 > i11) {
                return;
            }
            while (true) {
                byte[] bArr = this.classFieldBytes;
                int i13 = this.classFieldsIndex;
                this.classFieldsIndex = i13 + 1;
                bArr[i13] = hprofRecordReader.m98120d();
                if (i12 == i11) {
                    return;
                } else {
                    i12++;
                }
            }
        }

        public C44460a(boolean z11, long j11, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19) {
            this.bytesForClassSize = i15;
            this.bytesForInstanceSize = i16;
            this.bytesForObjectArraySize = i17;
            this.bytesForPrimitiveArraySize = i18;
            this.classFieldsTotalBytes = i19;
            int i21 = z11 ? 8 : 4;
            this.identifierSize = i21;
            Companion companion = HprofInMemoryIndex.INSTANCE;
            int iM98239a = companion.m98239a(j11);
            this.positionSize = iM98239a;
            int iM98239a2 = companion.m98239a(i19);
            this.classFieldsIndexSize = iM98239a2;
            this.hprofStringCache = new LongObjectScatterMap<>();
            this.classNames = new LongLongScatterMap(i11);
            this.classFieldBytes = new byte[i19];
            this.classIndex = new C44487m(iM98239a + i21 + 4 + i15 + iM98239a2, z11, i11, 0.0d, 8, null);
            this.instanceIndex = new C44487m(iM98239a + i21 + i16, z11, i12, 0.0d, 8, null);
            this.objectArrayIndex = new C44487m(i21 + iM98239a + i17, z11, i13, 0.0d, 8, null);
            this.primitiveArrayIndex = new C44487m(iM98239a + 1 + i18, z11, i14, 0.0d, 8, null);
            this.gcRoots = new ArrayList();
        }

        @Override // shark.OnHprofRecordTagListener
        /* JADX INFO: renamed from: a */
        public void mo98153a(@NotNull HprofRecordTag tag, long length, @NotNull HprofRecordReader reader) throws IOException {
            int i11 = 1;
            switch (C44473f.$EnumSwitchMapping$0[tag.ordinal()]) {
                case 1:
                    this.hprofStringCache.m98377m(reader.m98133o(), reader.m98104Q(length - ((long) this.identifierSize)));
                    return;
                case 2:
                    PrimitiveType primitiveType = PrimitiveType.INT;
                    reader.m98108U(primitiveType.getByteSize());
                    long jM98133o = reader.m98133o();
                    reader.m98108U(primitiveType.getByteSize());
                    this.classNames.m98364q(jM98133o, reader.m98133o());
                    return;
                case 3:
                    AbstractC44451d.n nVarM98099L = reader.m98099L();
                    if (nVarM98099L.getId() != 0) {
                        this.gcRoots.add(nVarM98099L);
                    }
                    Unit unit = Unit.INSTANCE;
                    return;
                case 4:
                    AbstractC44451d.e eVarM98140v = reader.m98140v();
                    if (eVarM98140v.getId() != 0) {
                        this.gcRoots.add(eVarM98140v);
                    }
                    Unit unit2 = Unit.INSTANCE;
                    return;
                case 5:
                    AbstractC44451d.f fVarM98141w = reader.m98141w();
                    if (fVarM98141w.getId() != 0) {
                        this.gcRoots.add(fVarM98141w);
                    }
                    Unit unit3 = Unit.INSTANCE;
                    return;
                case 6:
                    AbstractC44451d.d dVarM98139u = reader.m98139u();
                    if (dVarM98139u.getId() != 0) {
                        this.gcRoots.add(dVarM98139u);
                    }
                    Unit unit4 = Unit.INSTANCE;
                    return;
                case 7:
                    AbstractC44451d.i iVarM98089B = reader.m98089B();
                    if (iVarM98089B.getId() != 0) {
                        this.gcRoots.add(iVarM98089B);
                    }
                    Unit unit5 = Unit.INSTANCE;
                    return;
                case 8:
                    AbstractC44451d.k kVarM98095H = reader.m98095H();
                    if (kVarM98095H.getId() != 0) {
                        this.gcRoots.add(kVarM98095H);
                    }
                    Unit unit6 = Unit.INSTANCE;
                    return;
                case 9:
                    AbstractC44451d.l lVarM98097J = reader.m98097J();
                    if (lVarM98097J.getId() != 0) {
                        this.gcRoots.add(lVarM98097J);
                    }
                    Unit unit7 = Unit.INSTANCE;
                    return;
                case 10:
                    AbstractC44451d.h hVarM98088A = reader.m98088A();
                    if (hVarM98088A.getId() != 0) {
                        this.gcRoots.add(hVarM98088A);
                    }
                    Unit unit8 = Unit.INSTANCE;
                    return;
                case 11:
                    AbstractC44451d.m mVarM98098K = reader.m98098K();
                    if (mVarM98098K.getId() != 0) {
                        this.gcRoots.add(mVarM98098K);
                    }
                    Unit unit9 = Unit.INSTANCE;
                    return;
                case 12:
                    AbstractC44451d.c cVarM98138t = reader.m98138t();
                    if (cVarM98138t.getId() != 0) {
                        this.gcRoots.add(cVarM98138t);
                    }
                    Unit unit10 = Unit.INSTANCE;
                    return;
                case 13:
                    AbstractC44451d.b bVarM98130l = reader.m98130l();
                    if (bVarM98130l.getId() != 0) {
                        this.gcRoots.add(bVarM98130l);
                    }
                    Unit unit11 = Unit.INSTANCE;
                    return;
                case 14:
                    AbstractC44451d.a aVarM98127i = reader.m98127i();
                    if (aVarM98127i.getId() != 0) {
                        this.gcRoots.add(aVarM98127i);
                    }
                    Unit unit12 = Unit.INSTANCE;
                    return;
                case 15:
                    AbstractC44451d.j jVarM98092E = reader.m98092E();
                    if (jVarM98092E.getId() != 0) {
                        this.gcRoots.add(jVarM98092E);
                    }
                    Unit unit13 = Unit.INSTANCE;
                    return;
                case 16:
                    AbstractC44451d.p pVarM98106S = reader.m98106S();
                    if (pVarM98106S.getId() != 0) {
                        this.gcRoots.add(pVarM98106S);
                    }
                    Unit unit14 = Unit.INSTANCE;
                    return;
                case 17:
                    AbstractC44451d.g gVarM98142x = reader.m98142x();
                    if (gVarM98142x.getId() != 0) {
                        this.gcRoots.add(gVarM98142x);
                    }
                    Unit unit15 = Unit.INSTANCE;
                    return;
                case 18:
                    AbstractC44451d.o oVarM98100M = reader.m98100M();
                    if (oVarM98100M.getId() != 0) {
                        this.gcRoots.add(oVarM98100M);
                    }
                    Unit unit16 = Unit.INSTANCE;
                    return;
                case 19:
                    long bytesRead = reader.getBytesRead();
                    long jM98133o2 = reader.m98133o();
                    reader.m98108U(PrimitiveType.INT.getByteSize());
                    long jM98133o3 = reader.m98133o();
                    reader.m98108U(this.identifierSize * 5);
                    int iM98136r = reader.m98136r();
                    reader.m98110W();
                    int i12 = this.classFieldsIndex;
                    long bytesRead2 = reader.getBytesRead();
                    int i13 = 2;
                    m98241c(reader, 2);
                    int iM98242d = m98242d() & UShort.MAX_VALUE;
                    int i14 = 0;
                    while (i14 < iM98242d) {
                        m98241c(reader, this.identifierSize);
                        m98241c(reader, i11);
                        int i15 = i11;
                        int i16 = this.classFieldBytes[this.classFieldsIndex - 1] & 255;
                        if (i16 == 2) {
                            m98241c(reader, this.identifierSize);
                        } else {
                            m98241c(reader, ((Number) MapsKt.getValue(PrimitiveType.INSTANCE.getByteSizeByHprofType(), Integer.valueOf(i16))).intValue());
                        }
                        i14++;
                        i11 = i15;
                        i13 = 2;
                    }
                    int i17 = i11;
                    m98241c(reader, i13);
                    int iM98242d2 = m98242d() & UShort.MAX_VALUE;
                    for (int i18 = 0; i18 < iM98242d2; i18 += i17) {
                        m98241c(reader, this.identifierSize);
                        m98241c(reader, i17);
                    }
                    int i19 = i17;
                    int bytesRead3 = (int) (reader.getBytesRead() - bytesRead2);
                    long bytesRead4 = reader.getBytesRead() - bytesRead;
                    C44487m.a aVarM98423i = this.classIndex.m98423i(jM98133o2);
                    aVarM98423i.m98432e(bytesRead, this.positionSize);
                    aVarM98423i.m98429b(jM98133o3);
                    aVarM98423i.m98430c(iM98136r);
                    aVarM98423i.m98432e(bytesRead4, this.bytesForClassSize);
                    aVarM98423i.m98432e(i12, this.classFieldsIndexSize);
                    Unit unit17 = Unit.INSTANCE;
                    int i21 = i12 + bytesRead3;
                    if (i21 != this.classFieldsIndex) {
                        i19 = 0;
                    }
                    if (i19 != 0) {
                        return;
                    }
                    throw new IllegalArgumentException(("Expected " + this.classFieldsIndex + " to have moved by " + bytesRead3 + " and be equal to " + i21).toString());
                case 20:
                    long bytesRead5 = reader.getBytesRead();
                    long jM98133o4 = reader.m98133o();
                    reader.m98108U(PrimitiveType.INT.getByteSize());
                    long jM98133o5 = reader.m98133o();
                    reader.m98108U(reader.m98136r());
                    long bytesRead6 = reader.getBytesRead() - bytesRead5;
                    C44487m.a aVarM98423i2 = this.instanceIndex.m98423i(jM98133o4);
                    aVarM98423i2.m98432e(bytesRead5, this.positionSize);
                    aVarM98423i2.m98429b(jM98133o5);
                    aVarM98423i2.m98432e(bytesRead6, this.bytesForInstanceSize);
                    Unit unit18 = Unit.INSTANCE;
                    return;
                case 21:
                    long bytesRead7 = reader.getBytesRead();
                    long jM98133o6 = reader.m98133o();
                    reader.m98108U(PrimitiveType.INT.getByteSize());
                    int iM98136r2 = reader.m98136r();
                    long jM98133o7 = reader.m98133o();
                    reader.m98108U(this.identifierSize * iM98136r2);
                    long bytesRead8 = reader.getBytesRead() - bytesRead7;
                    C44487m.a aVarM98423i3 = this.objectArrayIndex.m98423i(jM98133o6);
                    aVarM98423i3.m98432e(bytesRead7, this.positionSize);
                    aVarM98423i3.m98429b(jM98133o7);
                    aVarM98423i3.m98432e(bytesRead8, this.bytesForObjectArraySize);
                    Unit unit19 = Unit.INSTANCE;
                    return;
                case 22:
                    long bytesRead9 = reader.getBytesRead();
                    long jM98133o8 = reader.m98133o();
                    reader.m98108U(PrimitiveType.INT.getByteSize());
                    int iM98136r3 = reader.m98136r();
                    PrimitiveType primitiveType2 = (PrimitiveType) MapsKt.getValue(PrimitiveType.INSTANCE.getPrimitiveTypeByHprofType(), Integer.valueOf(reader.m98101N()));
                    reader.m98108U(iM98136r3 * primitiveType2.getByteSize());
                    long bytesRead10 = reader.getBytesRead() - bytesRead9;
                    C44487m.a aVarM98423i4 = this.primitiveArrayIndex.m98423i(jM98133o8);
                    aVarM98423i4.m98432e(bytesRead9, this.positionSize);
                    aVarM98423i4.m98428a((byte) primitiveType2.ordinal());
                    aVarM98423i4.m98432e(bytesRead10, this.bytesForPrimitiveArraySize);
                    Unit unit20 = Unit.INSTANCE;
                    return;
                default:
                    return;
            }
        }

        @NotNull
        /* JADX INFO: renamed from: b */
        public final HprofInMemoryIndex m98240b(@Nullable C44496r proguardMapping, @NotNull HprofHeader hprofHeader) {
            if (this.classFieldsIndex == this.classFieldBytes.length) {
                return new HprofInMemoryIndex(this.positionSize, this.hprofStringCache, this.classNames, this.classIndex.m98425k(), this.instanceIndex.m98425k(), this.objectArrayIndex.m98425k(), this.primitiveArrayIndex.m98425k(), this.gcRoots, proguardMapping, this.bytesForClassSize, this.bytesForInstanceSize, this.bytesForObjectArraySize, this.bytesForPrimitiveArraySize, hprofHeader.getVersion() != HprofVersion.ANDROID, new ClassFieldsReader(this.identifierSize, this.classFieldBytes), this.classFieldsIndexSize, null);
            }
            throw new IllegalArgumentException(("Read " + this.classFieldsIndex + " into fields bytes instead of expected " + this.classFieldBytes.length).toString());
        }

        /* JADX INFO: renamed from: d */
        public final short m98242d() {
            byte[] bArr = this.classFieldBytes;
            int i11 = this.classFieldsIndex;
            return (short) ((bArr[i11 - 1] & 255) | ((bArr[i11 - 2] & 255) << 8));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public HprofInMemoryIndex(int i11, LongObjectScatterMap<String> longObjectScatterMap, LongLongScatterMap longLongScatterMap, SortedBytesMap sortedBytesMap, SortedBytesMap sortedBytesMap2, SortedBytesMap sortedBytesMap3, SortedBytesMap sortedBytesMap4, List<? extends AbstractC44451d> list, C44496r c44496r, int i12, int i13, int i14, int i15, boolean z11, ClassFieldsReader classFieldsReader, int i16) {
        this.positionSize = i11;
        this.hprofStringCache = longObjectScatterMap;
        this.classNames = longLongScatterMap;
        this.classIndex = sortedBytesMap;
        this.instanceIndex = sortedBytesMap2;
        this.objectArrayIndex = sortedBytesMap3;
        this.primitiveArrayIndex = sortedBytesMap4;
        this.gcRoots = list;
        this.proguardMapping = c44496r;
        this.bytesForClassSize = i12;
        this.bytesForInstanceSize = i13;
        this.bytesForObjectArraySize = i14;
        this.bytesForPrimitiveArraySize = i15;
        this.useForwardSlashClassPackageSeparator = z11;
        this.classFieldsReader = classFieldsReader;
        this.classFieldsIndexSize = i16;
    }

    public /* synthetic */ HprofInMemoryIndex(int i11, LongObjectScatterMap longObjectScatterMap, LongLongScatterMap longLongScatterMap, SortedBytesMap sortedBytesMap, SortedBytesMap sortedBytesMap2, SortedBytesMap sortedBytesMap3, SortedBytesMap sortedBytesMap4, List list, C44496r c44496r, int i12, int i13, int i14, int i15, boolean z11, ClassFieldsReader classFieldsReader, int i16, DefaultConstructorMarker defaultConstructorMarker) {
        this(i11, longObjectScatterMap, longLongScatterMap, sortedBytesMap, sortedBytesMap2, sortedBytesMap3, sortedBytesMap4, list, c44496r, i12, i13, i14, i15, z11, classFieldsReader, i16);
    }

    @Nullable
    /* JADX INFO: renamed from: f */
    public final Long m98223f(@NotNull String className) {
        LongObjectPair<String> next;
        LongLongPair next2;
        if (this.useForwardSlashClassPackageSeparator) {
            className = StringsKt.replace$default(className, '.', '/', false, 4, (Object) null);
        }
        Iterator<LongObjectPair<String>> it = this.hprofStringCache.m98371g().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!Intrinsics.areEqual(next.m98388b(), className));
        LongObjectPair<String> longObjectPair = next;
        Long lValueOf = longObjectPair != null ? Long.valueOf(longObjectPair.getFirst()) : null;
        if (lValueOf != null) {
            long jLongValue = lValueOf.longValue();
            Iterator<LongLongPair> it2 = this.classNames.m98354g().iterator();
            do {
                if (!it2.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it2.next();
            } while (next2.getSecond() != jLongValue);
            LongLongPair longLongPair = next2;
            if (longLongPair != null) {
                return Long.valueOf(longLongPair.getFirst());
            }
        }
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public final String m98224g(long classId) {
        String strM98230m = m98230m(this.classNames.m98356i(classId));
        return this.useForwardSlashClassPackageSeparator ? StringsKt.replace$default(strM98230m, '/', '.', false, 4, (Object) null) : strM98230m;
    }

    @NotNull
    /* JADX INFO: renamed from: i */
    public final List<AbstractC44451d> m98226i() {
        return this.gcRoots;
    }

    /* JADX INFO: renamed from: j */
    public final int m98227j() {
        return this.classIndex.getSize();
    }

    @NotNull
    /* JADX INFO: renamed from: k, reason: from getter */
    public final ClassFieldsReader getClassFieldsReader() {
        return this.classFieldsReader;
    }

    /* JADX INFO: renamed from: l */
    public final int m98229l() {
        return this.instanceIndex.getSize();
    }

    /* JADX INFO: renamed from: m */
    public final String m98230m(long id2) {
        String strM98372h = this.hprofStringCache.m98372h(id2);
        if (strM98372h != null) {
            return strM98372h;
        }
        throw new IllegalArgumentException("Hprof string " + id2 + " not in cache");
    }

    @NotNull
    /* JADX INFO: renamed from: n */
    public final Sequence<LongObjectPair<AbstractC44475h.a>> m98231n() {
        return SequencesKt.map(this.classIndex.m98295g(), new Function1<LongObjectPair<? extends C44469b>, LongObjectPair<? extends AbstractC44475h.a>>() { // from class: shark.internal.HprofInMemoryIndex$indexedClassSequence$1
            @Override // p852kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ LongObjectPair<? extends AbstractC44475h.a> invoke(LongObjectPair<? extends C44469b> longObjectPair) {
                return invoke2((LongObjectPair<C44469b>) longObjectPair);
            }

            {
                super(1);
            }

            @NotNull
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final LongObjectPair<AbstractC44475h.a> invoke2(@NotNull LongObjectPair<C44469b> longObjectPair) {
                return C44482f.m98401c(longObjectPair.getFirst(), this.this$0.m98238u(longObjectPair.m98388b()));
            }
        });
    }

    @NotNull
    /* JADX INFO: renamed from: o */
    public final Sequence<LongObjectPair<AbstractC44475h.b>> m98232o() {
        return SequencesKt.map(this.instanceIndex.m98295g(), new Function1<LongObjectPair<? extends C44469b>, LongObjectPair<? extends AbstractC44475h.b>>() { // from class: shark.internal.HprofInMemoryIndex$indexedInstanceSequence$1
            @Override // p852kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ LongObjectPair<? extends AbstractC44475h.b> invoke(LongObjectPair<? extends C44469b> longObjectPair) {
                return invoke2((LongObjectPair<C44469b>) longObjectPair);
            }

            {
                super(1);
            }

            @NotNull
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final LongObjectPair<AbstractC44475h.b> invoke2(@NotNull LongObjectPair<C44469b> longObjectPair) {
                long first = longObjectPair.getFirst();
                C44469b c44469bM98388b = longObjectPair.m98388b();
                return C44482f.m98401c(first, new AbstractC44475h.b(c44469bM98388b.m98326e(this.this$0.positionSize), c44469bM98388b.m98323b(), c44469bM98388b.m98326e(this.this$0.bytesForInstanceSize)));
            }
        });
    }

    @NotNull
    /* JADX INFO: renamed from: p */
    public final Sequence<LongObjectPair<AbstractC44475h.c>> m98233p() {
        return SequencesKt.map(this.objectArrayIndex.m98295g(), new Function1<LongObjectPair<? extends C44469b>, LongObjectPair<? extends AbstractC44475h.c>>() { // from class: shark.internal.HprofInMemoryIndex$indexedObjectArraySequence$1
            @Override // p852kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ LongObjectPair<? extends AbstractC44475h.c> invoke(LongObjectPair<? extends C44469b> longObjectPair) {
                return invoke2((LongObjectPair<C44469b>) longObjectPair);
            }

            {
                super(1);
            }

            @NotNull
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final LongObjectPair<AbstractC44475h.c> invoke2(@NotNull LongObjectPair<C44469b> longObjectPair) {
                long first = longObjectPair.getFirst();
                C44469b c44469bM98388b = longObjectPair.m98388b();
                return C44482f.m98401c(first, new AbstractC44475h.c(c44469bM98388b.m98326e(this.this$0.positionSize), c44469bM98388b.m98323b(), c44469bM98388b.m98326e(this.this$0.bytesForObjectArraySize)));
            }
        });
    }

    @Nullable
    /* JADX INFO: renamed from: q */
    public final IntObjectPair<AbstractC44475h> m98234q(long objectId) {
        int iM98299k = this.classIndex.m98299k(objectId);
        if (iM98299k >= 0) {
            return C44482f.m98399a(iM98299k, m98238u(this.classIndex.m98297i(iM98299k)));
        }
        int iM98299k2 = this.instanceIndex.m98299k(objectId);
        if (iM98299k2 >= 0) {
            C44469b c44469bM98297i = this.instanceIndex.m98297i(iM98299k2);
            return C44482f.m98399a(this.classIndex.getSize() + iM98299k2, new AbstractC44475h.b(c44469bM98297i.m98326e(this.positionSize), c44469bM98297i.m98323b(), c44469bM98297i.m98326e(this.bytesForInstanceSize)));
        }
        int iM98299k3 = this.objectArrayIndex.m98299k(objectId);
        if (iM98299k3 >= 0) {
            C44469b c44469bM98297i2 = this.objectArrayIndex.m98297i(iM98299k3);
            return C44482f.m98399a(this.classIndex.getSize() + this.instanceIndex.getSize() + iM98299k3, new AbstractC44475h.c(c44469bM98297i2.m98326e(this.positionSize), c44469bM98297i2.m98323b(), c44469bM98297i2.m98326e(this.bytesForObjectArraySize)));
        }
        int iM98299k4 = this.primitiveArrayIndex.m98299k(objectId);
        if (iM98299k4 < 0) {
            return null;
        }
        C44469b c44469bM98297i3 = this.primitiveArrayIndex.m98297i(iM98299k4);
        return C44482f.m98399a(this.classIndex.getSize() + this.instanceIndex.getSize() + iM98299k4 + this.primitiveArrayIndex.getSize(), new AbstractC44475h.d(c44469bM98297i3.m98326e(this.positionSize), PrimitiveType.values()[c44469bM98297i3.m98322a()], c44469bM98297i3.m98326e(this.bytesForPrimitiveArraySize)));
    }

    @NotNull
    /* JADX INFO: renamed from: s */
    public final Sequence<LongObjectPair<AbstractC44475h.d>> m98236s() {
        return SequencesKt.map(this.primitiveArrayIndex.m98295g(), new Function1<LongObjectPair<? extends C44469b>, LongObjectPair<? extends AbstractC44475h.d>>() { // from class: shark.internal.HprofInMemoryIndex$indexedPrimitiveArraySequence$1
            @Override // p852kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ LongObjectPair<? extends AbstractC44475h.d> invoke(LongObjectPair<? extends C44469b> longObjectPair) {
                return invoke2((LongObjectPair<C44469b>) longObjectPair);
            }

            {
                super(1);
            }

            @NotNull
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final LongObjectPair<AbstractC44475h.d> invoke2(@NotNull LongObjectPair<C44469b> longObjectPair) {
                long first = longObjectPair.getFirst();
                C44469b c44469bM98388b = longObjectPair.m98388b();
                return C44482f.m98401c(first, new AbstractC44475h.d(c44469bM98388b.m98326e(this.this$0.positionSize), PrimitiveType.values()[c44469bM98388b.m98322a()], c44469bM98388b.m98326e(this.this$0.bytesForPrimitiveArraySize)));
            }
        });
    }

    /* JADX INFO: renamed from: t */
    public final boolean m98237t(long objectId) {
        return (this.classIndex.m98296h(objectId) == null && this.instanceIndex.m98296h(objectId) == null && this.objectArrayIndex.m98296h(objectId) == null && this.primitiveArrayIndex.m98296h(objectId) == null) ? false : true;
    }

    /* JADX INFO: renamed from: u */
    public final AbstractC44475h.a m98238u(C44469b c44469b) {
        return new AbstractC44475h.a(c44469b.m98326e(this.positionSize), c44469b.m98323b(), c44469b.m98324c(), c44469b.m98326e(this.bytesForClassSize), (int) c44469b.m98326e(this.classFieldsIndexSize));
    }

    @NotNull
    /* JADX INFO: renamed from: h */
    public final String m98225h(long classId, long id2) {
        return m98230m(id2);
    }

    @NotNull
    /* JADX INFO: renamed from: r */
    public final Sequence<LongObjectPair<AbstractC44475h>> m98235r() {
        return SequencesKt.plus(SequencesKt.plus(SequencesKt.plus((Sequence) m98231n(), (Sequence) m98232o()), (Sequence) m98233p()), (Sequence) m98236s());
    }
}
