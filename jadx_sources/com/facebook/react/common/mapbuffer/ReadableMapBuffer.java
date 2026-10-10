package com.facebook.react.common.mapbuffer;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.facebook.jni.HybridData;
import com.facebook.react.uimanager.ViewProps;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p633t6.InterfaceC44695a;
import p852kotlin.Metadata;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.UShort;
import p852kotlin.collections.CollectionsKt___CollectionsKt;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.jvm.internal.markers.KMappedMarker;
import p852kotlin.ranges.IntRange;
import p852kotlin.text.Charsets;

/* JADX INFO: compiled from: ReadableMapBuffer.kt */
/* JADX INFO: loaded from: classes45.dex */
@Metadata(m90083d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010(\n\u0002\b\u0003\b\u0007\u0018\u0000 F2\u00020\u0001:\u0002EFB\u0011\b\u0013\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0012\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\u0004\u0010\bB\u0019\b\u0012\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u0004\u0010\u000bJ\t\u0010\u0012\u001a\u00020\u0007H\u0082 J\b\u0010\u0013\u001a\u00020\u0014H\u0002J\u0010\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\nH\u0002J\u0010\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\nH\u0002J\u0018\u0010\u001c\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\n2\u0006\u0010\u001e\u001a\u00020\u001aH\u0002J\u0017\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\nH\u0002¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020%2\u0006\u0010!\u001a\u00020\nH\u0002J\u0010\u0010&\u001a\u00020\n2\u0006\u0010!\u001a\u00020\nH\u0002J\u0010\u0010'\u001a\u00020(2\u0006\u0010!\u001a\u00020\nH\u0002J\u0010\u0010)\u001a\u00020*2\u0006\u0010!\u001a\u00020\nH\u0002J\u0010\u0010+\u001a\u00020,2\u0006\u0010!\u001a\u00020\nH\u0002J\u0010\u0010-\u001a\u00020\u00002\u0006\u0010.\u001a\u00020\nH\u0002J\u0016\u0010/\u001a\b\u0012\u0004\u0012\u00020\u0000002\u0006\u0010.\u001a\u00020\nH\u0002J\u0010\u00101\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\nH\u0002J\u0010\u00102\u001a\u00020*2\u0006\u0010\u001d\u001a\u00020\nH\u0016J\u0010\u00103\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\nH\u0016J\u0010\u00104\u001a\u0002052\u0006\u0010\t\u001a\u00020\nH\u0016J\u0010\u00106\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\nH\u0016J\u0010\u00107\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\nH\u0016J\u0010\u00108\u001a\u00020(2\u0006\u0010\u001d\u001a\u00020\nH\u0016J\u0010\u00109\u001a\u00020%2\u0006\u0010\u001d\u001a\u00020\nH\u0016J\u0010\u0010:\u001a\u00020,2\u0006\u0010\u001d\u001a\u00020\nH\u0016J\u0010\u0010;\u001a\u00020*2\u0006\u0010\u001d\u001a\u00020\nH\u0016J\u0010\u0010<\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\nH\u0016J\u0016\u0010=\u001a\b\u0012\u0004\u0012\u00020\u0000002\u0006\u0010\u001d\u001a\u00020\nH\u0016J\b\u0010>\u001a\u00020\nH\u0016J\u0013\u0010?\u001a\u00020*2\b\u0010@\u001a\u0004\u0018\u00010AH\u0096\u0002J\b\u0010B\u001a\u00020,H\u0016J\u000f\u0010C\u001a\b\u0012\u0004\u0012\u0002050DH\u0096\u0002R\u0012\u0010\f\u001a\u0004\u0018\u00010\u00038\u0002X\u0083\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\n@RX\u0096\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\n8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0011¨\u0006G"}, m90084d2 = {"Lcom/facebook/react/common/mapbuffer/ReadableMapBuffer;", "Lcom/facebook/react/common/mapbuffer/MapBuffer;", "hybridData", "Lcom/facebook/jni/HybridData;", "<init>", "(Lcom/facebook/jni/HybridData;)V", "buffer", "Ljava/nio/ByteBuffer;", "(Ljava/nio/ByteBuffer;)V", TypedValues.CycleType.S_WAVE_OFFSET, "", "(Ljava/nio/ByteBuffer;I)V", "mHybridData", "offsetToMapBuffer", "value", "count", "getCount", "()I", "importByteBuffer", "readHeader", "", "offsetForDynamicData", "getOffsetForDynamicData", "getBucketIndexForKey", "intKey", "readDataType", "Lcom/facebook/react/common/mapbuffer/MapBuffer$DataType;", "bucketIndex", "getTypedValueOffsetForKey", "key", "expected", "readUnsignedShort", "Lkotlin/UShort;", "bufferPosition", "readUnsignedShort-BwKQO78", "(I)S", "readDoubleValue", "", "readIntValue", "readLongValue", "", "readBooleanValue", "", "readStringValue", "", "readMapBufferValue", ViewProps.POSITION, "readMapBufferListValue", "", "getKeyOffsetForBucketIndex", "contains", "getKeyOffset", "entryAt", "Lcom/facebook/react/common/mapbuffer/MapBuffer$Entry;", "getType", "getInt", "getLong", "getDouble", "getString", "getBoolean", "getMapBuffer", "getMapBufferList", "hashCode", "equals", "other", "", "toString", "iterator", "", "MapBufferEntry", "Companion", "ReactAndroid_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nReadableMapBuffer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReadableMapBuffer.kt\ncom/facebook/react/common/mapbuffer/ReadableMapBuffer\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,344:1\n1#2:345\n*E\n"})
@InterfaceC44695a
public final class ReadableMapBuffer implements MapBuffer {
    private static final int ALIGNMENT = 254;
    private static final int BUCKET_SIZE = 12;
    private static final int HEADER_SIZE = 8;
    private static final int TYPE_OFFSET = 2;
    private static final int VALUE_OFFSET = 4;

    @NotNull
    private final ByteBuffer buffer;
    private int count;

    @Nullable
    @InterfaceC44695a
    private final HybridData mHybridData;
    private final int offsetToMapBuffer;

    /* JADX INFO: compiled from: ReadableMapBuffer.kt */
    @Metadata(m90083d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\fR\u0014\u0010\u0016\u001a\u00020\u00178VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001a\u001a\u00020\u001b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001e\u001a\u00020\u001f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b \u0010!R\u0014\u0010\"\u001a\u00020#8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b$\u0010%¨\u0006&"}, m90084d2 = {"Lcom/facebook/react/common/mapbuffer/ReadableMapBuffer$MapBufferEntry;", "Lcom/facebook/react/common/mapbuffer/MapBuffer$Entry;", "bucketOffset", "", "<init>", "(Lcom/facebook/react/common/mapbuffer/ReadableMapBuffer;I)V", "assertType", "", "expected", "Lcom/facebook/react/common/mapbuffer/MapBuffer$DataType;", "key", "getKey", "()I", "type", "getType", "()Lcom/facebook/react/common/mapbuffer/MapBuffer$DataType;", "doubleValue", "", "getDoubleValue", "()D", "intValue", "getIntValue", "longValue", "", "getLongValue", "()J", "booleanValue", "", "getBooleanValue", "()Z", "stringValue", "", "getStringValue", "()Ljava/lang/String;", "mapBufferValue", "Lcom/facebook/react/common/mapbuffer/MapBuffer;", "getMapBufferValue", "()Lcom/facebook/react/common/mapbuffer/MapBuffer;", "ReactAndroid_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
    public final class MapBufferEntry implements MapBuffer.Entry {
        private final int bucketOffset;

        public MapBufferEntry(int i11) {
            this.bucketOffset = i11;
        }

        @Override // com.facebook.react.common.mapbuffer.MapBuffer.Entry
        public boolean getBooleanValue() {
            assertType(MapBuffer.DataType.BOOL);
            return ReadableMapBuffer.this.readBooleanValue(this.bucketOffset + 4);
        }

        @Override // com.facebook.react.common.mapbuffer.MapBuffer.Entry
        public double getDoubleValue() {
            assertType(MapBuffer.DataType.DOUBLE);
            return ReadableMapBuffer.this.readDoubleValue(this.bucketOffset + 4);
        }

        @Override // com.facebook.react.common.mapbuffer.MapBuffer.Entry
        public int getIntValue() {
            assertType(MapBuffer.DataType.INT);
            return ReadableMapBuffer.this.readIntValue(this.bucketOffset + 4);
        }

        @Override // com.facebook.react.common.mapbuffer.MapBuffer.Entry
        public int getKey() {
            return ReadableMapBuffer.this.m103718readUnsignedShortBwKQO78(this.bucketOffset) & UShort.MAX_VALUE;
        }

        @Override // com.facebook.react.common.mapbuffer.MapBuffer.Entry
        public long getLongValue() {
            assertType(MapBuffer.DataType.LONG);
            return ReadableMapBuffer.this.readLongValue(this.bucketOffset + 4);
        }

        @Override // com.facebook.react.common.mapbuffer.MapBuffer.Entry
        @NotNull
        public MapBuffer getMapBufferValue() {
            assertType(MapBuffer.DataType.MAP);
            return ReadableMapBuffer.this.readMapBufferValue(this.bucketOffset + 4);
        }

        @Override // com.facebook.react.common.mapbuffer.MapBuffer.Entry
        @NotNull
        public String getStringValue() {
            assertType(MapBuffer.DataType.STRING);
            return ReadableMapBuffer.this.readStringValue(this.bucketOffset + 4);
        }

        private final void assertType(MapBuffer.DataType expected) {
            MapBuffer.DataType type = getType();
            if (expected == type) {
                return;
            }
            throw new IllegalStateException(("Expected " + expected + " for key: " + getKey() + " found " + type + " instead.").toString());
        }

        @Override // com.facebook.react.common.mapbuffer.MapBuffer.Entry
        @NotNull
        public MapBuffer.DataType getType() {
            return MapBuffer.DataType.values()[ReadableMapBuffer.this.m103718readUnsignedShortBwKQO78(this.bucketOffset + 2) & UShort.MAX_VALUE];
        }
    }

    /* JADX INFO: renamed from: com.facebook.react.common.mapbuffer.ReadableMapBuffer$iterator$1 */
    /* JADX INFO: compiled from: ReadableMapBuffer.kt */
    @Metadata(m90083d1 = {"\u0000\u001f\n\u0000\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\t\u0010\u000b\u001a\u00020\fH\u0096\u0002J\t\u0010\r\u001a\u00020\u0002H\u0096\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0006¨\u0006\u000e"}, m90084d2 = {"com/facebook/react/common/mapbuffer/ReadableMapBuffer$iterator$1", "", "Lcom/facebook/react/common/mapbuffer/MapBuffer$Entry;", "current", "", "getCurrent", "()I", "setCurrent", "(I)V", "last", "getLast", "hasNext", "", "next", "ReactAndroid_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
    public static final class C58551 implements Iterator<MapBuffer.Entry>, KMappedMarker {
        private int current;
        private final int last;

        public C58551() {
            this.last = ReadableMapBuffer.this.getCount() - 1;
        }

        public final int getCurrent() {
            return this.current;
        }

        public final int getLast() {
            return this.last;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.current <= this.last;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.util.Iterator
        public MapBuffer.Entry next() {
            ReadableMapBuffer readableMapBuffer = ReadableMapBuffer.this;
            int i11 = this.current;
            this.current = i11 + 1;
            return readableMapBuffer.new MapBufferEntry(readableMapBuffer.getKeyOffsetForBucketIndex(i11));
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public final void setCurrent(int i11) {
            this.current = i11;
        }
    }

    @InterfaceC44695a
    private ReadableMapBuffer(HybridData hybridData) {
        this.mHybridData = hybridData;
        this.buffer = importByteBuffer();
        this.offsetToMapBuffer = 0;
        readHeader();
    }

    private final native ByteBuffer importByteBuffer();

    /* JADX INFO: compiled from: ReadableMapBuffer.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 0, 0}, m90088xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MapBuffer.DataType.values().length];
            try {
                iArr[MapBuffer.DataType.BOOL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MapBuffer.DataType.INT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[MapBuffer.DataType.LONG.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[MapBuffer.DataType.DOUBLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[MapBuffer.DataType.STRING.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[MapBuffer.DataType.MAP.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        MapBufferSoLoader.staticInit();
    }

    private final int getBucketIndexForKey(int intKey) {
        IntRange kEY_RANGE$ReactAndroid_release = MapBuffer.INSTANCE.getKEY_RANGE$ReactAndroid_release();
        int first = kEY_RANGE$ReactAndroid_release.getFirst();
        if (intKey <= kEY_RANGE$ReactAndroid_release.getLast() && first <= intKey) {
            short sM104125constructorimpl = UShort.m104125constructorimpl((short) intKey);
            int count = getCount() - 1;
            int i11 = 0;
            while (i11 <= count) {
                int i12 = (i11 + count) >>> 1;
                int iM103718readUnsignedShortBwKQO78 = m103718readUnsignedShortBwKQO78(getKeyOffsetForBucketIndex(i12)) & UShort.MAX_VALUE;
                int i13 = 65535 & sM104125constructorimpl;
                if (Intrinsics.compare(iM103718readUnsignedShortBwKQO78, i13) < 0) {
                    i11 = i12 + 1;
                } else {
                    if (Intrinsics.compare(iM103718readUnsignedShortBwKQO78, i13) <= 0) {
                        return i12;
                    }
                    count = i12 - 1;
                }
            }
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getKeyOffsetForBucketIndex(int bucketIndex) {
        return this.offsetToMapBuffer + 8 + (bucketIndex * 12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final double readDoubleValue(int bufferPosition) {
        return this.buffer.getDouble(bufferPosition);
    }

    private final void readHeader() {
        if (this.buffer.getShort() != 254) {
            this.buffer.order(ByteOrder.LITTLE_ENDIAN);
        }
        this.count = m103718readUnsignedShortBwKQO78(this.buffer.position()) & UShort.MAX_VALUE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int readIntValue(int bufferPosition) {
        return this.buffer.getInt(bufferPosition);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long readLongValue(int bufferPosition) {
        return this.buffer.getLong(bufferPosition);
    }

    private final List<ReadableMapBuffer> readMapBufferListValue(int position) {
        ArrayList arrayList = new ArrayList();
        int offsetForDynamicData = getOffsetForDynamicData() + this.buffer.getInt(position);
        int i11 = this.buffer.getInt(offsetForDynamicData);
        int i12 = offsetForDynamicData + 4;
        int i13 = 0;
        while (i13 < i11) {
            int i14 = this.buffer.getInt(i12 + i13);
            int i15 = i13 + 4;
            arrayList.add(new ReadableMapBuffer(this.buffer, i12 + i15));
            i13 = i15 + i14;
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: readUnsignedShort-BwKQO78, reason: not valid java name */
    public final short m103718readUnsignedShortBwKQO78(int bufferPosition) {
        return UShort.m104125constructorimpl(this.buffer.getShort(bufferPosition));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence toString$lambda$5(MapBuffer.Entry entry) {
        Intrinsics.checkNotNullParameter(entry, "entry");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(entry.getKey());
        sb2.append('=');
        switch (WhenMappings.$EnumSwitchMapping$0[entry.getType().ordinal()]) {
            case 1:
                sb2.append(entry.getBooleanValue());
                return sb2;
            case 2:
                sb2.append(entry.getIntValue());
                return sb2;
            case 3:
                sb2.append(entry.getLongValue());
                return sb2;
            case 4:
                sb2.append(entry.getDoubleValue());
                return sb2;
            case 5:
                sb2.append('\"');
                sb2.append(entry.getStringValue());
                sb2.append('\"');
                return sb2;
            case 6:
                sb2.append(entry.getMapBufferValue().toString());
                return sb2;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    @Override // com.facebook.react.common.mapbuffer.MapBuffer
    @NotNull
    public MapBuffer.Entry entryAt(int offset) {
        return new MapBufferEntry(getKeyOffsetForBucketIndex(offset));
    }

    public boolean equals(@Nullable Object other) {
        if (!(other instanceof ReadableMapBuffer)) {
            return false;
        }
        ByteBuffer byteBuffer = this.buffer;
        ByteBuffer byteBuffer2 = ((ReadableMapBuffer) other).buffer;
        if (byteBuffer == byteBuffer2) {
            return true;
        }
        byteBuffer.rewind();
        byteBuffer2.rewind();
        return Intrinsics.areEqual(byteBuffer, byteBuffer2);
    }

    @Override // com.facebook.react.common.mapbuffer.MapBuffer
    public boolean getBoolean(int key) {
        return readBooleanValue(getTypedValueOffsetForKey(key, MapBuffer.DataType.BOOL));
    }

    @Override // com.facebook.react.common.mapbuffer.MapBuffer
    public int getCount() {
        return this.count;
    }

    @Override // com.facebook.react.common.mapbuffer.MapBuffer
    public double getDouble(int key) {
        return readDoubleValue(getTypedValueOffsetForKey(key, MapBuffer.DataType.DOUBLE));
    }

    @Override // com.facebook.react.common.mapbuffer.MapBuffer
    public int getInt(int key) {
        return readIntValue(getTypedValueOffsetForKey(key, MapBuffer.DataType.INT));
    }

    @Override // com.facebook.react.common.mapbuffer.MapBuffer
    public long getLong(int key) {
        return readLongValue(getTypedValueOffsetForKey(key, MapBuffer.DataType.LONG));
    }

    @Override // com.facebook.react.common.mapbuffer.MapBuffer
    @NotNull
    public ReadableMapBuffer getMapBuffer(int key) {
        return readMapBufferValue(getTypedValueOffsetForKey(key, MapBuffer.DataType.MAP));
    }

    @Override // com.facebook.react.common.mapbuffer.MapBuffer
    @NotNull
    public List<ReadableMapBuffer> getMapBufferList(int key) {
        return readMapBufferListValue(getTypedValueOffsetForKey(key, MapBuffer.DataType.MAP));
    }

    @Override // com.facebook.react.common.mapbuffer.MapBuffer
    @NotNull
    public String getString(int key) {
        return readStringValue(getTypedValueOffsetForKey(key, MapBuffer.DataType.STRING));
    }

    public int hashCode() {
        this.buffer.rewind();
        return this.buffer.hashCode();
    }

    @Override // java.lang.Iterable
    @NotNull
    public Iterator<MapBuffer.Entry> iterator() {
        return new C58551();
    }

    @NotNull
    public String toString() throws IOException {
        StringBuilder sb2 = new StringBuilder("{");
        CollectionsKt___CollectionsKt.joinTo(this, sb2, (124 & 2) != 0 ? ", " : null, (124 & 4) != 0 ? "" : null, (124 & 8) == 0 ? null : "", (124 & 16) != 0 ? -1 : 0, (124 & 32) != 0 ? "..." : null, (124 & 64) != 0 ? null : new Function1() { // from class: com.facebook.react.common.mapbuffer.a
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ReadableMapBuffer.toString$lambda$5((MapBuffer.Entry) obj);
            }
        });
        sb2.append('}');
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    private final int getOffsetForDynamicData() {
        return getKeyOffsetForBucketIndex(getCount());
    }

    private final int getTypedValueOffsetForKey(int key, MapBuffer.DataType expected) {
        int bucketIndexForKey = getBucketIndexForKey(key);
        if (bucketIndexForKey != -1) {
            MapBuffer.DataType dataType = readDataType(bucketIndexForKey);
            if (dataType == expected) {
                return getKeyOffsetForBucketIndex(bucketIndexForKey) + 4;
            }
            throw new IllegalStateException(("Expected " + expected + " for key: " + key + ", found " + dataType + " instead.").toString());
        }
        throw new IllegalArgumentException(("Key not found: " + key).toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean readBooleanValue(int bufferPosition) {
        if (readIntValue(bufferPosition) == 1) {
            return true;
        }
        return false;
    }

    private final MapBuffer.DataType readDataType(int bucketIndex) {
        return MapBuffer.DataType.values()[m103718readUnsignedShortBwKQO78(getKeyOffsetForBucketIndex(bucketIndex) + 2) & UShort.MAX_VALUE];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ReadableMapBuffer readMapBufferValue(int position) {
        return new ReadableMapBuffer(this.buffer, getOffsetForDynamicData() + this.buffer.getInt(position) + 4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String readStringValue(int bufferPosition) {
        int offsetForDynamicData = getOffsetForDynamicData() + this.buffer.getInt(bufferPosition);
        int i11 = this.buffer.getInt(offsetForDynamicData);
        byte[] bArr = new byte[i11];
        this.buffer.position(offsetForDynamicData + 4);
        this.buffer.get(bArr, 0, i11);
        return new String(bArr, Charsets.UTF_8);
    }

    @Override // com.facebook.react.common.mapbuffer.MapBuffer
    public boolean contains(int key) {
        if (getBucketIndexForKey(key) != -1) {
            return true;
        }
        return false;
    }

    @Override // com.facebook.react.common.mapbuffer.MapBuffer
    public int getKeyOffset(int key) {
        return getBucketIndexForKey(key);
    }

    @Override // com.facebook.react.common.mapbuffer.MapBuffer
    @NotNull
    public MapBuffer.DataType getType(int key) {
        int bucketIndexForKey = getBucketIndexForKey(key);
        if (bucketIndexForKey != -1) {
            return readDataType(bucketIndexForKey);
        }
        throw new IllegalArgumentException(("Key not found: " + key).toString());
    }

    private ReadableMapBuffer(ByteBuffer byteBuffer) {
        this.mHybridData = null;
        this.buffer = byteBuffer;
        this.offsetToMapBuffer = 0;
        readHeader();
    }

    private ReadableMapBuffer(ByteBuffer byteBuffer, int i11) {
        this.mHybridData = null;
        ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
        byteBufferDuplicate.position(i11);
        this.buffer = byteBufferDuplicate;
        this.offsetToMapBuffer = i11;
        readHeader();
    }
}
