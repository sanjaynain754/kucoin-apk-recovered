package androidx.credentials.webauthn;

import androidx.annotation.RestrictTo;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.credentials.webauthn.Cbor;
import io.flutter.embedding.android.KeyboardMap;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import okhttp3.internal.p505ws.WebSocketProtocol;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.collections.ArraysKt;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.collections.MapsKt;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.Ref;
import p852kotlin.ranges.RangesKt;
import p852kotlin.text.Charsets;
import p852kotlin.text.StringsKt;

/* JADX INFO: compiled from: Cbor.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0002$%B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0016\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u0018J\u000e\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0001J\u0018\u0010\u001a\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u0005H\u0002J\u0018\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u0005H\u0002J\u0018\u0010\u001e\u001a\u00020\u001f2\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u0005H\u0002J\u0018\u0010 \u001a\u00020\u00182\u0006\u0010!\u001a\u00020\u00052\u0006\u0010\"\u001a\u00020#H\u0002R\u0014\u0010\u0004\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R\u0014\u0010\n\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0007R\u0014\u0010\f\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u0007R\u0014\u0010\u000e\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0007R\u0014\u0010\u0010\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0007R\u0014\u0010\u0012\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0007R\u0014\u0010\u0014\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0007¨\u0006&"}, m90084d2 = {"Landroidx/credentials/webauthn/Cbor;", "", "<init>", "()V", "TYPE_UNSIGNED_INT", "", "getTYPE_UNSIGNED_INT", "()I", "TYPE_NEGATIVE_INT", "getTYPE_NEGATIVE_INT", "TYPE_BYTE_STRING", "getTYPE_BYTE_STRING", "TYPE_TEXT_STRING", "getTYPE_TEXT_STRING", "TYPE_ARRAY", "getTYPE_ARRAY", "TYPE_MAP", "getTYPE_MAP", "TYPE_TAG", "getTYPE_TAG", "TYPE_FLOAT", "getTYPE_FLOAT", "decode", "data", "", "encode", "getType", TypedValues.CycleType.S_WAVE_OFFSET, "getArg", "Landroidx/credentials/webauthn/Cbor$Arg;", "parseItem", "Landroidx/credentials/webauthn/Cbor$Item;", "createArg", "type", "arg", "", "Item", "Arg", "credentials"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
@RestrictTo({RestrictTo.Scope.LIBRARY})
public final class Cbor {
    private final int TYPE_UNSIGNED_INT;
    private final int TYPE_NEGATIVE_INT = 1;
    private final int TYPE_BYTE_STRING = 2;
    private final int TYPE_TEXT_STRING = 3;
    private final int TYPE_ARRAY = 4;
    private final int TYPE_MAP = 5;
    private final int TYPE_TAG = 6;
    private final int TYPE_FLOAT = 7;

    /* JADX INFO: compiled from: Cbor.kt */
    @Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, m90084d2 = {"Landroidx/credentials/webauthn/Cbor$Arg;", "", "arg", "", "len", "", "<init>", "(JI)V", "getArg", "()J", "getLen", "()I", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "credentials"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
    public static final /* data */ class Arg {
        private final long arg;
        private final int len;

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Arg)) {
                return false;
            }
            Arg arg = (Arg) other;
            return this.arg == arg.arg && this.len == arg.len;
        }

        public static /* synthetic */ Arg copy$default(Arg arg, long j11, int i11, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                j11 = arg.arg;
            }
            if ((i12 & 2) != 0) {
                i11 = arg.len;
            }
            return arg.copy(j11, i11);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final long getArg() {
            return this.arg;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final int getLen() {
            return this.len;
        }

        @NotNull
        public final Arg copy(long arg, int len) {
            return new Arg(arg, len);
        }

        public final long getArg() {
            return this.arg;
        }

        public final int getLen() {
            return this.len;
        }

        public int hashCode() {
            return (Long.hashCode(this.arg) * 31) + Integer.hashCode(this.len);
        }

        @NotNull
        public String toString() {
            return "Arg(arg=" + this.arg + ", len=" + this.len + ')';
        }

        public Arg(long j11, int i11) {
            this.arg = j11;
            this.len = i11;
        }
    }

    /* JADX INFO: compiled from: Cbor.kt */
    @Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0001HÆ\u0003J\t\u0010\f\u001a\u00020\u0004HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u0004HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0004HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, m90084d2 = {"Landroidx/credentials/webauthn/Cbor$Item;", "", "item", "len", "", "<init>", "(Ljava/lang/Object;I)V", "getItem", "()Ljava/lang/Object;", "getLen", "()I", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "credentials"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
    public static final /* data */ class Item {

        @NotNull
        private final Object item;
        private final int len;

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Item)) {
                return false;
            }
            Item item = (Item) other;
            return Intrinsics.areEqual(this.item, item.item) && this.len == item.len;
        }

        public Item(@NotNull Object item, int i11) {
            Intrinsics.checkNotNullParameter(item, "item");
            this.item = item;
            this.len = i11;
        }

        public static /* synthetic */ Item copy$default(Item item, Object obj, int i11, int i12, Object obj2) {
            if ((i12 & 1) != 0) {
                obj = item.item;
            }
            if ((i12 & 2) != 0) {
                i11 = item.len;
            }
            return item.copy(obj, i11);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final Object getItem() {
            return this.item;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final int getLen() {
            return this.len;
        }

        @NotNull
        public final Item copy(@NotNull Object item, int len) {
            Intrinsics.checkNotNullParameter(item, "item");
            return new Item(item, len);
        }

        @NotNull
        public final Object getItem() {
            return this.item;
        }

        public final int getLen() {
            return this.len;
        }

        public int hashCode() {
            return (this.item.hashCode() * 31) + Integer.hashCode(this.len);
        }

        @NotNull
        public String toString() {
            return "Item(item=" + this.item + ", len=" + this.len + ')';
        }
    }

    private final byte[] createArg(int type, long arg) {
        int i11 = type << 5;
        int i12 = (int) arg;
        if (arg < 24) {
            return new byte[]{(byte) ((i11 | i12) & 255)};
        }
        if (arg <= 255) {
            return new byte[]{(byte) ((i11 | 24) & 255), (byte) (i12 & 255)};
        }
        if (arg <= WebSocketProtocol.PAYLOAD_SHORT_MAX) {
            return new byte[]{(byte) ((i11 | 25) & 255), (byte) ((i12 >> 8) & 255), (byte) (i12 & 255)};
        }
        if (arg <= KeyboardMap.kValueMask) {
            return new byte[]{(byte) ((i11 | 26) & 255), (byte) ((i12 >> 24) & 255), (byte) ((i12 >> 16) & 255), (byte) ((i12 >> 8) & 255), (byte) (i12 & 255)};
        }
        throw new IllegalArgumentException("bad Arg");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int encode$lambda$0(Ref.ObjectRef objectRef, byte[] bArr, byte[] bArr2) {
        Object obj = ((Map) objectRef.element).get(bArr);
        Intrinsics.checkNotNull(obj);
        byte[] bArr3 = (byte[]) obj;
        Object obj2 = ((Map) objectRef.element).get(bArr2);
        Intrinsics.checkNotNull(obj2);
        byte[] bArr4 = (byte[]) obj2;
        if (bArr.length > bArr2.length) {
            return 1;
        }
        if (bArr.length < bArr2.length) {
            return -1;
        }
        if (bArr3.length > bArr4.length) {
            return 1;
        }
        return bArr3.length < bArr4.length ? -1 : 0;
    }

    private final Arg getArg(byte[] data, int offset) {
        long j11 = ((long) data[offset]) & 31;
        if (j11 < 24) {
            return new Arg(j11, 1);
        }
        if (j11 == 24) {
            return new Arg(((long) data[offset + 1]) & 255, 2);
        }
        if (j11 == 25) {
            return new Arg((((long) data[offset + 2]) & 255) | ((((long) data[offset + 1]) & 255) << 8), 3);
        }
        if (j11 != 26) {
            throw new IllegalArgumentException("Bad arg");
        }
        return new Arg((((long) data[offset + 4]) & 255) | ((((long) data[offset + 1]) & 255) << 24) | ((((long) data[offset + 2]) & 255) << 16) | ((((long) data[offset + 3]) & 255) << 8), 5);
    }

    private final int getType(byte[] data, int offset) {
        return (data[offset] & 255) >> 5;
    }

    @NotNull
    public final Object decode(@NotNull byte[] data) {
        Intrinsics.checkNotNullParameter(data, "data");
        return parseItem(data, 0).getItem();
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [T, java.util.LinkedHashMap] */
    @NotNull
    public final byte[] encode(@NotNull Object data) {
        Intrinsics.checkNotNullParameter(data, "data");
        if (data instanceof Number) {
            if (data instanceof Double) {
                throw new IllegalArgumentException("Don't support doubles yet");
            }
            long jLongValue = ((Number) data).longValue();
            return jLongValue >= 0 ? createArg(this.TYPE_UNSIGNED_INT, jLongValue) : createArg(this.TYPE_NEGATIVE_INT, ((long) (-1)) - jLongValue);
        }
        if (data instanceof byte[]) {
            byte[] bArr = (byte[]) data;
            return ArraysKt.plus(createArg(this.TYPE_BYTE_STRING, bArr.length), bArr);
        }
        if (data instanceof String) {
            String str = (String) data;
            return ArraysKt.plus(createArg(this.TYPE_TEXT_STRING, str.length()), StringsKt.encodeToByteArray(str));
        }
        if (data instanceof List) {
            List list = (List) data;
            byte[] bArrCreateArg = createArg(this.TYPE_ARRAY, list.size());
            for (Object obj : list) {
                Intrinsics.checkNotNull(obj);
                bArrCreateArg = ArraysKt.plus(bArrCreateArg, encode(obj));
            }
            return bArrCreateArg;
        }
        if (!(data instanceof Map)) {
            throw new IllegalArgumentException("Bad type");
        }
        Map map = (Map) data;
        byte[] bArrCreateArg2 = createArg(this.TYPE_MAP, map.size());
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            Map map2 = (Map) objectRef.element;
            Object key = entry.getKey();
            Intrinsics.checkNotNull(key);
            byte[] bArrEncode = encode(key);
            Object value = entry.getValue();
            Intrinsics.checkNotNull(value);
            map2.put(bArrEncode, encode(value));
        }
        ArrayList arrayList = new ArrayList(((Map) objectRef.element).keySet());
        CollectionsKt.sortedWith(arrayList, new Comparator() { // from class: i0.a
            @Override // java.util.Comparator
            public final int compare(Object obj2, Object obj3) {
                return Cbor.encode$lambda$0(objectRef, (byte[]) obj2, (byte[]) obj3);
            }
        });
        Iterator it = arrayList.iterator();
        Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
        while (it.hasNext()) {
            Object next = it.next();
            Intrinsics.checkNotNullExpressionValue(next, "next(...)");
            byte[] bArr2 = (byte[]) next;
            byte[] bArrPlus = ArraysKt.plus(bArrCreateArg2, bArr2);
            Object obj2 = ((Map) objectRef.element).get(bArr2);
            Intrinsics.checkNotNull(obj2);
            bArrCreateArg2 = ArraysKt.plus(bArrPlus, (byte[]) obj2);
        }
        return bArrCreateArg2;
    }

    public final int getTYPE_ARRAY() {
        return this.TYPE_ARRAY;
    }

    public final int getTYPE_BYTE_STRING() {
        return this.TYPE_BYTE_STRING;
    }

    public final int getTYPE_FLOAT() {
        return this.TYPE_FLOAT;
    }

    public final int getTYPE_MAP() {
        return this.TYPE_MAP;
    }

    public final int getTYPE_NEGATIVE_INT() {
        return this.TYPE_NEGATIVE_INT;
    }

    public final int getTYPE_TAG() {
        return this.TYPE_TAG;
    }

    public final int getTYPE_TEXT_STRING() {
        return this.TYPE_TEXT_STRING;
    }

    public final int getTYPE_UNSIGNED_INT() {
        return this.TYPE_UNSIGNED_INT;
    }

    private final Item parseItem(byte[] data, int offset) {
        int type = getType(data, offset);
        Arg arg = getArg(data, offset);
        System.out.println((Object) ("Type " + type + ' ' + arg.getArg() + ' ' + arg.getLen()));
        if (type == this.TYPE_UNSIGNED_INT) {
            return new Item(Long.valueOf(arg.getArg()), arg.getLen());
        }
        if (type == this.TYPE_NEGATIVE_INT) {
            return new Item(Long.valueOf(((long) (-1)) - arg.getArg()), arg.getLen());
        }
        if (type == this.TYPE_BYTE_STRING) {
            return new Item(ArraysKt.sliceArray(data, RangesKt.until(arg.getLen() + offset, offset + arg.getLen() + ((int) arg.getArg()))), arg.getLen() + ((int) arg.getArg()));
        }
        if (type == this.TYPE_TEXT_STRING) {
            return new Item(new String(ArraysKt.sliceArray(data, RangesKt.until(arg.getLen() + offset, offset + arg.getLen() + ((int) arg.getArg()))), Charsets.UTF_8), arg.getLen() + ((int) arg.getArg()));
        }
        int i11 = 0;
        if (type == this.TYPE_ARRAY) {
            ArrayList arrayList = new ArrayList();
            int len = arg.getLen();
            int arg2 = (int) arg.getArg();
            while (i11 < arg2) {
                Item item = parseItem(data, offset + len);
                arrayList.add(item.getItem());
                len += item.getLen();
                i11++;
            }
            return new Item(CollectionsKt.toList(arrayList), len);
        }
        if (type == this.TYPE_MAP) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            int len2 = arg.getLen();
            int arg3 = (int) arg.getArg();
            while (i11 < arg3) {
                Item item2 = parseItem(data, offset + len2);
                int len3 = len2 + item2.getLen();
                Item item3 = parseItem(data, offset + len3);
                len2 = len3 + item3.getLen();
                linkedHashMap.put(item2.getItem(), item3.getItem());
                i11++;
            }
            return new Item(MapsKt.toMap(linkedHashMap), len2);
        }
        throw new IllegalArgumentException("Bad type");
    }
}
