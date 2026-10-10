package com.facebook.react.common.mapbuffer;

import android.util.SparseArray;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.exifinterface.media.ExifInterface;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p633t6.InterfaceC44695a;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.jvm.internal.markers.KMappedMarker;
import p852kotlin.ranges.IntRange;

/* JADX INFO: compiled from: WritableMapBuffer.kt */
/* JADX INFO: loaded from: classes45.dex */
@Metadata(m90083d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\u0010\t\n\u0002\u0010\u0006\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010(\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0004\b\u0007\u0018\u0000 .2\u00020\u0001:\u0002-.B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0007\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bJ\u0016\u0010\u0007\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tJ\u0016\u0010\u0007\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\fJ\u0016\u0010\u0007\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\rJ\u0016\u0010\u0007\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000eJ\u0016\u0010\u0007\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0001J\u0018\u0010\u000f\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0006H\u0002J\u0010\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\tH\u0016J\u0010\u0010\u0014\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\tH\u0016J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\tH\u0016J\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\b\u001a\u00020\tH\u0016J\u0010\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\tH\u0016J\u0010\u0010\u001b\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\tH\u0016J\u0010\u0010\u001c\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\tH\u0016J\u0010\u0010\u001d\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\tH\u0016J\u0010\u0010\u001e\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00020\tH\u0016J\u0010\u0010\u001f\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\tH\u0016J\u0016\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00010!2\u0006\u0010\b\u001a\u00020\tH\u0016J(\u0010\"\u001a\u0002H#\"\u0006\b\u0000\u0010#\u0018\u00012\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u0006H\u0082\b¢\u0006\u0002\u0010$J\u0014\u0010%\u001a\u00020\u0019*\u00020\u00062\u0006\u0010\b\u001a\u00020\tH\u0002J\u000f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00160'H\u0096\u0002J\b\u0010(\u001a\u00020)H\u0003J\u0013\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00060+H\u0003¢\u0006\u0002\u0010,R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006/"}, m90084d2 = {"Lcom/facebook/react/common/mapbuffer/WritableMapBuffer;", "Lcom/facebook/react/common/mapbuffer/MapBuffer;", "<init>", "()V", "values", "Landroid/util/SparseArray;", "", "put", "key", "", "value", "", "", "", "", "putInternal", "count", "getCount", "()I", "contains", "getKeyOffset", "entryAt", "Lcom/facebook/react/common/mapbuffer/MapBuffer$Entry;", TypedValues.CycleType.S_WAVE_OFFSET, "getType", "Lcom/facebook/react/common/mapbuffer/MapBuffer$DataType;", "getBoolean", "getInt", "getLong", "getDouble", "getString", "getMapBuffer", "getMapBufferList", "", "verifyValue", ExifInterface.GPS_DIRECTION_TRUE, "(ILjava/lang/Object;)Ljava/lang/Object;", "dataType", "iterator", "", "getKeys", "", "getValues", "", "()[Ljava/lang/Object;", "MapBufferEntry", "Companion", "ReactAndroid_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nWritableMapBuffer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WritableMapBuffer.kt\ncom/facebook/react/common/mapbuffer/WritableMapBuffer\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,201:1\n131#1:203\n132#1,4:205\n131#1:209\n132#1,4:211\n131#1:215\n132#1,4:217\n131#1:221\n132#1,4:223\n131#1:227\n132#1,4:229\n131#1:233\n132#1,4:235\n131#1:239\n132#1,4:241\n1#2:202\n1#2:204\n1#2:210\n1#2:216\n1#2:222\n1#2:228\n1#2:234\n1#2:240\n*S KotlinDebug\n*F\n+ 1 WritableMapBuffer.kt\ncom/facebook/react/common/mapbuffer/WritableMapBuffer\n*L\n115#1:203\n115#1:205,4\n117#1:209\n117#1:211,4\n119#1:215\n119#1:217,4\n121#1:221\n121#1:223,4\n123#1:227\n123#1:229,4\n125#1:233\n125#1:235,4\n127#1:239\n127#1:241,4\n115#1:204\n117#1:210\n119#1:216\n121#1:222\n123#1:228\n125#1:234\n127#1:240\n*E\n"})
@InterfaceC44695a
public final class WritableMapBuffer implements MapBuffer {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private final SparseArray<Object> values = new SparseArray<>();

    /* JADX INFO: compiled from: WritableMapBuffer.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m90084d2 = {"Lcom/facebook/react/common/mapbuffer/WritableMapBuffer$Companion;", "", "<init>", "()V", "ReactAndroid_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX INFO: compiled from: WritableMapBuffer.kt */
    @Metadata(m90083d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\bR\u0014\u0010\u0013\u001a\u00020\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\u00188VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001b\u001a\u00020\u001c8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0014\u0010\u001f\u001a\u00020 8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"¨\u0006#"}, m90084d2 = {"Lcom/facebook/react/common/mapbuffer/WritableMapBuffer$MapBufferEntry;", "Lcom/facebook/react/common/mapbuffer/MapBuffer$Entry;", "index", "", "<init>", "(Lcom/facebook/react/common/mapbuffer/WritableMapBuffer;I)V", "key", "getKey", "()I", "type", "Lcom/facebook/react/common/mapbuffer/MapBuffer$DataType;", "getType", "()Lcom/facebook/react/common/mapbuffer/MapBuffer$DataType;", "booleanValue", "", "getBooleanValue", "()Z", "intValue", "getIntValue", "longValue", "", "getLongValue", "()J", "doubleValue", "", "getDoubleValue", "()D", "stringValue", "", "getStringValue", "()Ljava/lang/String;", "mapBufferValue", "Lcom/facebook/react/common/mapbuffer/MapBuffer;", "getMapBufferValue", "()Lcom/facebook/react/common/mapbuffer/MapBuffer;", "ReactAndroid_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nWritableMapBuffer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WritableMapBuffer.kt\ncom/facebook/react/common/mapbuffer/WritableMapBuffer$MapBufferEntry\n+ 2 WritableMapBuffer.kt\ncom/facebook/react/common/mapbuffer/WritableMapBuffer\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,201:1\n131#2:202\n132#2,4:204\n131#2:208\n132#2,4:210\n131#2:214\n132#2,4:216\n131#2:220\n132#2,4:222\n131#2:226\n132#2,4:228\n131#2:232\n132#2,4:234\n1#3:203\n1#3:209\n1#3:215\n1#3:221\n1#3:227\n1#3:233\n*S KotlinDebug\n*F\n+ 1 WritableMapBuffer.kt\ncom/facebook/react/common/mapbuffer/WritableMapBuffer$MapBufferEntry\n*L\n163#1:202\n163#1:204,4\n166#1:208\n166#1:210,4\n169#1:214\n169#1:216,4\n172#1:220\n172#1:222,4\n175#1:226\n175#1:228,4\n178#1:232\n178#1:234,4\n163#1:203\n166#1:209\n169#1:215\n172#1:221\n175#1:227\n178#1:233\n*E\n"})
    public final class MapBufferEntry implements MapBuffer.Entry {
        private final int index;
        private final int key;

        @NotNull
        private final MapBuffer.DataType type;

        public MapBufferEntry(int i11) {
            this.index = i11;
            this.key = WritableMapBuffer.this.values.keyAt(i11);
            Object objValueAt = WritableMapBuffer.this.values.valueAt(i11);
            Intrinsics.checkNotNullExpressionValue(objValueAt, "valueAt(...)");
            this.type = WritableMapBuffer.this.dataType(objValueAt, getKey());
        }

        @Override // com.facebook.react.common.mapbuffer.MapBuffer.Entry
        public int getKey() {
            return this.key;
        }

        @Override // com.facebook.react.common.mapbuffer.MapBuffer.Entry
        @NotNull
        public MapBuffer.DataType getType() {
            return this.type;
        }

        @Override // com.facebook.react.common.mapbuffer.MapBuffer.Entry
        public boolean getBooleanValue() {
            int key = getKey();
            Object objValueAt = WritableMapBuffer.this.values.valueAt(this.index);
            if (objValueAt != null) {
                if (objValueAt instanceof Boolean) {
                    return ((Boolean) objValueAt).booleanValue();
                }
                throw new IllegalStateException(("Expected " + Boolean.class + " for key: " + key + ", found " + objValueAt.getClass() + " instead.").toString());
            }
            throw new IllegalArgumentException(("Key not found: " + key).toString());
        }

        @Override // com.facebook.react.common.mapbuffer.MapBuffer.Entry
        public double getDoubleValue() {
            int key = getKey();
            Object objValueAt = WritableMapBuffer.this.values.valueAt(this.index);
            if (objValueAt != null) {
                if (objValueAt instanceof Double) {
                    return ((Number) objValueAt).doubleValue();
                }
                throw new IllegalStateException(("Expected " + Double.class + " for key: " + key + ", found " + objValueAt.getClass() + " instead.").toString());
            }
            throw new IllegalArgumentException(("Key not found: " + key).toString());
        }

        @Override // com.facebook.react.common.mapbuffer.MapBuffer.Entry
        public int getIntValue() {
            int key = getKey();
            Object objValueAt = WritableMapBuffer.this.values.valueAt(this.index);
            if (objValueAt != null) {
                if (objValueAt instanceof Integer) {
                    return ((Number) objValueAt).intValue();
                }
                throw new IllegalStateException(("Expected " + Integer.class + " for key: " + key + ", found " + objValueAt.getClass() + " instead.").toString());
            }
            throw new IllegalArgumentException(("Key not found: " + key).toString());
        }

        @Override // com.facebook.react.common.mapbuffer.MapBuffer.Entry
        public long getLongValue() {
            int key = getKey();
            Object objValueAt = WritableMapBuffer.this.values.valueAt(this.index);
            if (objValueAt != null) {
                if (objValueAt instanceof Long) {
                    return ((Number) objValueAt).longValue();
                }
                throw new IllegalStateException(("Expected " + Long.class + " for key: " + key + ", found " + objValueAt.getClass() + " instead.").toString());
            }
            throw new IllegalArgumentException(("Key not found: " + key).toString());
        }

        @Override // com.facebook.react.common.mapbuffer.MapBuffer.Entry
        @NotNull
        public MapBuffer getMapBufferValue() {
            int key = getKey();
            Object objValueAt = WritableMapBuffer.this.values.valueAt(this.index);
            if (objValueAt != null) {
                if (objValueAt instanceof MapBuffer) {
                    return (MapBuffer) objValueAt;
                }
                throw new IllegalStateException(("Expected " + MapBuffer.class + " for key: " + key + ", found " + objValueAt.getClass() + " instead.").toString());
            }
            throw new IllegalArgumentException(("Key not found: " + key).toString());
        }

        @Override // com.facebook.react.common.mapbuffer.MapBuffer.Entry
        @NotNull
        public String getStringValue() {
            int key = getKey();
            Object objValueAt = WritableMapBuffer.this.values.valueAt(this.index);
            if (objValueAt != null) {
                if (objValueAt instanceof String) {
                    return (String) objValueAt;
                }
                throw new IllegalStateException(("Expected " + String.class + " for key: " + key + ", found " + objValueAt.getClass() + " instead.").toString());
            }
            throw new IllegalArgumentException(("Key not found: " + key).toString());
        }
    }

    /* JADX INFO: renamed from: com.facebook.react.common.mapbuffer.WritableMapBuffer$iterator$1 */
    /* JADX INFO: compiled from: WritableMapBuffer.kt */
    @Metadata(m90083d1 = {"\u0000\u001f\n\u0000\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\t\u0010\t\u001a\u00020\nH\u0096\u0002J\t\u0010\u000b\u001a\u00020\u0002H\u0096\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\f"}, m90084d2 = {"com/facebook/react/common/mapbuffer/WritableMapBuffer$iterator$1", "", "Lcom/facebook/react/common/mapbuffer/MapBuffer$Entry;", "count", "", "getCount", "()I", "setCount", "(I)V", "hasNext", "", "next", "ReactAndroid_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
    public static final class C58561 implements Iterator<MapBuffer.Entry>, KMappedMarker {
        private int count;

        public C58561() {
        }

        public final int getCount() {
            return this.count;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.count < WritableMapBuffer.this.values.size();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.util.Iterator
        public MapBuffer.Entry next() {
            WritableMapBuffer writableMapBuffer = WritableMapBuffer.this;
            int i11 = this.count;
            this.count = i11 + 1;
            return writableMapBuffer.new MapBufferEntry(i11);
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public final void setCount(int i11) {
            this.count = i11;
        }
    }

    @NotNull
    public final WritableMapBuffer put(int key, boolean value) {
        return putInternal(key, Boolean.valueOf(value));
    }

    static {
        MapBufferSoLoader.staticInit();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final MapBuffer.DataType dataType(Object obj, int i11) {
        if (obj instanceof Boolean) {
            return MapBuffer.DataType.BOOL;
        }
        if (obj instanceof Integer) {
            return MapBuffer.DataType.INT;
        }
        if (obj instanceof Long) {
            return MapBuffer.DataType.LONG;
        }
        if (obj instanceof Double) {
            return MapBuffer.DataType.DOUBLE;
        }
        if (obj instanceof String) {
            return MapBuffer.DataType.STRING;
        }
        if (obj instanceof MapBuffer) {
            return MapBuffer.DataType.MAP;
        }
        throw new IllegalStateException("Key " + i11 + " has value of unknown type: " + obj.getClass());
    }

    @InterfaceC44695a
    private final int[] getKeys() {
        int size = this.values.size();
        int[] iArr = new int[size];
        for (int i11 = 0; i11 < size; i11++) {
            iArr[i11] = this.values.keyAt(i11);
        }
        return iArr;
    }

    @InterfaceC44695a
    private final Object[] getValues() {
        int size = this.values.size();
        Object[] objArr = new Object[size];
        for (int i11 = 0; i11 < size; i11++) {
            Object objValueAt = this.values.valueAt(i11);
            Intrinsics.checkNotNullExpressionValue(objValueAt, "valueAt(...)");
            objArr[i11] = objValueAt;
        }
        return objArr;
    }

    private final WritableMapBuffer putInternal(int key, Object value) {
        IntRange kEY_RANGE$ReactAndroid_release = MapBuffer.INSTANCE.getKEY_RANGE$ReactAndroid_release();
        int first = kEY_RANGE$ReactAndroid_release.getFirst();
        if (key > kEY_RANGE$ReactAndroid_release.getLast() || first > key) {
            throw new IllegalArgumentException("Only integers in [0;65535] range are allowed for keys.");
        }
        this.values.put(key, value);
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final /* synthetic */ <T> T verifyValue(int key, Object value) {
        if (value == 0) {
            throw new IllegalArgumentException(("Key not found: " + key).toString());
        }
        Intrinsics.reifiedOperationMarker(3, ExifInterface.GPS_DIRECTION_TRUE);
        if (value != 0) {
            return value;
        }
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        throw new IllegalStateException(("Expected " + Object.class + " for key: " + key + ", found " + value.getClass() + " instead.").toString());
    }

    @Override // com.facebook.react.common.mapbuffer.MapBuffer
    public boolean contains(int key) {
        return this.values.get(key) != null;
    }

    @Override // com.facebook.react.common.mapbuffer.MapBuffer
    @NotNull
    public MapBuffer.Entry entryAt(int offset) {
        return new MapBufferEntry(offset);
    }

    @Override // com.facebook.react.common.mapbuffer.MapBuffer
    public boolean getBoolean(int key) {
        Object obj = this.values.get(key);
        if (obj == null) {
            throw new IllegalArgumentException(("Key not found: " + key).toString());
        }
        if (obj instanceof Boolean) {
            return ((Boolean) obj).booleanValue();
        }
        throw new IllegalStateException(("Expected " + Boolean.class + " for key: " + key + ", found " + obj.getClass() + " instead.").toString());
    }

    @Override // com.facebook.react.common.mapbuffer.MapBuffer
    public int getCount() {
        return this.values.size();
    }

    @Override // com.facebook.react.common.mapbuffer.MapBuffer
    public double getDouble(int key) {
        Object obj = this.values.get(key);
        if (obj == null) {
            throw new IllegalArgumentException(("Key not found: " + key).toString());
        }
        if (obj instanceof Double) {
            return ((Number) obj).doubleValue();
        }
        throw new IllegalStateException(("Expected " + Double.class + " for key: " + key + ", found " + obj.getClass() + " instead.").toString());
    }

    @Override // com.facebook.react.common.mapbuffer.MapBuffer
    public int getInt(int key) {
        Object obj = this.values.get(key);
        if (obj == null) {
            throw new IllegalArgumentException(("Key not found: " + key).toString());
        }
        if (obj instanceof Integer) {
            return ((Number) obj).intValue();
        }
        throw new IllegalStateException(("Expected " + Integer.class + " for key: " + key + ", found " + obj.getClass() + " instead.").toString());
    }

    @Override // com.facebook.react.common.mapbuffer.MapBuffer
    public int getKeyOffset(int key) {
        return this.values.indexOfKey(key);
    }

    @Override // com.facebook.react.common.mapbuffer.MapBuffer
    public long getLong(int key) {
        Object obj = this.values.get(key);
        if (obj == null) {
            throw new IllegalArgumentException(("Key not found: " + key).toString());
        }
        if (obj instanceof Long) {
            return ((Number) obj).longValue();
        }
        throw new IllegalStateException(("Expected " + Long.class + " for key: " + key + ", found " + obj.getClass() + " instead.").toString());
    }

    @Override // com.facebook.react.common.mapbuffer.MapBuffer
    @NotNull
    public MapBuffer getMapBuffer(int key) {
        Object obj = this.values.get(key);
        if (obj == null) {
            throw new IllegalArgumentException(("Key not found: " + key).toString());
        }
        if (obj instanceof MapBuffer) {
            return (MapBuffer) obj;
        }
        throw new IllegalStateException(("Expected " + MapBuffer.class + " for key: " + key + ", found " + obj.getClass() + " instead.").toString());
    }

    @Override // com.facebook.react.common.mapbuffer.MapBuffer
    @NotNull
    public List<MapBuffer> getMapBufferList(int key) {
        Object obj = this.values.get(key);
        if (obj == null) {
            throw new IllegalArgumentException(("Key not found: " + key).toString());
        }
        if (obj instanceof List) {
            return (List) obj;
        }
        throw new IllegalStateException(("Expected " + List.class + " for key: " + key + ", found " + obj.getClass() + " instead.").toString());
    }

    @Override // com.facebook.react.common.mapbuffer.MapBuffer
    @NotNull
    public String getString(int key) {
        Object obj = this.values.get(key);
        if (obj == null) {
            throw new IllegalArgumentException(("Key not found: " + key).toString());
        }
        if (obj instanceof String) {
            return (String) obj;
        }
        throw new IllegalStateException(("Expected " + String.class + " for key: " + key + ", found " + obj.getClass() + " instead.").toString());
    }

    @Override // com.facebook.react.common.mapbuffer.MapBuffer
    @NotNull
    public MapBuffer.DataType getType(int key) {
        Object obj = this.values.get(key);
        if (obj != null) {
            return dataType(obj, key);
        }
        throw new IllegalArgumentException(("Key not found: " + key).toString());
    }

    @Override // java.lang.Iterable
    @NotNull
    public Iterator<MapBuffer.Entry> iterator() {
        return new C58561();
    }

    @NotNull
    public final WritableMapBuffer put(int key, int value) {
        return putInternal(key, Integer.valueOf(value));
    }

    @NotNull
    public final WritableMapBuffer put(int key, long value) {
        return putInternal(key, Long.valueOf(value));
    }

    @NotNull
    public final WritableMapBuffer put(int key, double value) {
        return putInternal(key, Double.valueOf(value));
    }

    @NotNull
    public final WritableMapBuffer put(int key, @NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        return putInternal(key, value);
    }

    @NotNull
    public final WritableMapBuffer put(int key, @NotNull MapBuffer value) {
        Intrinsics.checkNotNullParameter(value, "value");
        return putInternal(key, value);
    }
}
