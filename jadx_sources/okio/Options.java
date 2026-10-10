package okio;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.RandomAccess;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.collections.AbstractList;
import p852kotlin.collections.ArraysKt;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Options.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\u0018\u0000 \u00152\b\u0012\u0004\u0012\u00020\u00020\u00012\u00060\u0003j\u0002`\u0004:\u0001\u0015B\u001f\b\u0002\u0012\u000e\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u0011\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u000eH\u0096\u0002R\u001e\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u0006X\u0080\u0004¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\r\u001a\u00020\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0007\u001a\u00020\bX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, m90084d2 = {"Lokio/Options;", "Lkotlin/collections/AbstractList;", "Lokio/ByteString;", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "byteStrings", "", "trie", "", "([Lokio/ByteString;[I)V", "getByteStrings$okio", "()[Lokio/ByteString;", "[Lokio/ByteString;", "size", "", "getSize", "()I", "getTrie$okio", "()[I", "get", "index", "Companion", "okio"}, m90085k = 1, m90086mv = {1, 9, 0}, m90088xi = 48)
public final class Options extends AbstractList<ByteString> implements RandomAccess {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final ByteString[] byteStrings;

    @NotNull
    private final int[] trie;

    /* JADX INFO: compiled from: Options.kt */
    @Metadata(m90083d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002JT\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\r2\b\b\u0002\u0010\u0012\u001a\u00020\r2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\r0\u000fH\u0002J!\u0010\u0014\u001a\u00020\u00152\u0012\u0010\u000e\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00100\u0016\"\u00020\u0010H\u0007¢\u0006\u0002\u0010\u0017R\u0018\u0010\u0003\u001a\u00020\u0004*\u00020\u00058BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0018"}, m90084d2 = {"Lokio/Options$Companion;", "", "()V", "intCount", "", "Lokio/Buffer;", "getIntCount", "(Lokio/Buffer;)J", "buildTrieRecursive", "", "nodeOffset", "node", "byteStringOffset", "", "byteStrings", "", "Lokio/ByteString;", "fromIndex", "toIndex", "indexes", "of", "Lokio/Options;", "", "([Lokio/ByteString;)Lokio/Options;", "okio"}, m90085k = 1, m90086mv = {1, 9, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nOptions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Options.kt\nokio/Options$Companion\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 Util.kt\nokio/-SegmentedByteString\n*L\n1#1,236:1\n11065#2:237\n11400#2,3:238\n13374#2,3:243\n37#3,2:241\n1#4:246\n74#5:247\n74#5:248\n*S KotlinDebug\n*F\n+ 1 Options.kt\nokio/Options$Companion\n*L\n43#1:237\n43#1:238,3\n44#1:243,3\n43#1:241,2\n151#1:247\n208#1:248\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        private final void buildTrieRecursive(long nodeOffset, Buffer node, int byteStringOffset, List<? extends ByteString> byteStrings, int fromIndex, int toIndex, List<Integer> indexes) throws IOException {
            int i11;
            int i12;
            int i13;
            long j11;
            int i14 = byteStringOffset;
            if (fromIndex >= toIndex) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            for (int i15 = fromIndex; i15 < toIndex; i15++) {
                if (byteStrings.get(i15).size() < i14) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
            }
            ByteString byteString = byteStrings.get(fromIndex);
            ByteString byteString2 = byteStrings.get(toIndex - 1);
            if (i14 == byteString.size()) {
                int iIntValue = indexes.get(fromIndex).intValue();
                int i16 = fromIndex + 1;
                ByteString byteString3 = byteStrings.get(i16);
                i11 = i16;
                i12 = iIntValue;
                byteString = byteString3;
            } else {
                i11 = fromIndex;
                i12 = -1;
            }
            if (byteString.getByte(i14) == byteString2.getByte(i14)) {
                int iMin = Math.min(byteString.size(), byteString2.size());
                int i17 = 0;
                for (int i18 = i14; i18 < iMin && byteString.getByte(i18) == byteString2.getByte(i18); i18++) {
                    i17++;
                }
                long intCount = nodeOffset + getIntCount(node) + ((long) 2) + ((long) i17) + 1;
                node.writeInt(-i17);
                node.writeInt(i12);
                int i19 = i14 + i17;
                while (i14 < i19) {
                    node.writeInt(byteString.getByte(i14) & 255);
                    i14++;
                }
                if (i11 + 1 == toIndex) {
                    if (i19 != byteStrings.get(i11).size()) {
                        throw new IllegalStateException("Check failed.");
                    }
                    node.writeInt(indexes.get(i11).intValue());
                    return;
                } else {
                    Buffer buffer = new Buffer();
                    node.writeInt(((int) (getIntCount(buffer) + intCount)) * (-1));
                    buildTrieRecursive(intCount, buffer, i19, byteStrings, i11, toIndex, indexes);
                    node.writeAll(buffer);
                    return;
                }
            }
            int i21 = 1;
            for (int i22 = i11 + 1; i22 < toIndex; i22++) {
                if (byteStrings.get(i22 - 1).getByte(i14) != byteStrings.get(i22).getByte(i14)) {
                    i21++;
                }
            }
            long intCount2 = nodeOffset + getIntCount(node) + ((long) 2) + ((long) (i21 * 2));
            node.writeInt(i21);
            node.writeInt(i12);
            for (int i23 = i11; i23 < toIndex; i23++) {
                byte b11 = byteStrings.get(i23).getByte(i14);
                if (i23 == i11 || b11 != byteStrings.get(i23 - 1).getByte(i14)) {
                    node.writeInt(b11 & 255);
                }
            }
            Buffer buffer2 = new Buffer();
            while (i11 < toIndex) {
                byte b12 = byteStrings.get(i11).getByte(i14);
                int i24 = i11 + 1;
                int i25 = i24;
                while (true) {
                    if (i25 >= toIndex) {
                        i13 = toIndex;
                        break;
                    } else {
                        if (b12 != byteStrings.get(i25).getByte(i14)) {
                            i13 = i25;
                            break;
                        }
                        i25++;
                    }
                }
                if (i24 == i13 && i14 + 1 == byteStrings.get(i11).size()) {
                    node.writeInt(indexes.get(i11).intValue());
                    j11 = intCount2;
                } else {
                    node.writeInt(((int) (getIntCount(buffer2) + intCount2)) * (-1));
                    j11 = intCount2;
                    buildTrieRecursive(j11, buffer2, i14 + 1, byteStrings, i11, i13, indexes);
                }
                intCount2 = j11;
                i11 = i13;
            }
            node.writeAll(buffer2);
        }

        public static /* synthetic */ void buildTrieRecursive$default(Companion companion, long j11, Buffer buffer, int i11, List list, int i12, int i13, List list2, int i14, Object obj) throws IOException {
            if ((i14 & 1) != 0) {
                j11 = 0;
            }
            companion.buildTrieRecursive(j11, buffer, (i14 & 4) != 0 ? 0 : i11, list, (i14 & 16) != 0 ? 0 : i12, (i14 & 32) != 0 ? list.size() : i13, list2);
        }

        @JvmStatic
        @NotNull
        /* JADX INFO: renamed from: of */
        public final Options m94740of(@NotNull ByteString... byteStrings) throws IOException {
            Intrinsics.checkNotNullParameter(byteStrings, "byteStrings");
            DefaultConstructorMarker defaultConstructorMarker = null;
            int i11 = 0;
            if (byteStrings.length == 0) {
                return new Options(new ByteString[0], new int[]{0, -1}, defaultConstructorMarker);
            }
            List mutableList = ArraysKt.toMutableList(byteStrings);
            CollectionsKt.sort(mutableList);
            ArrayList arrayList = new ArrayList(byteStrings.length);
            for (ByteString byteString : byteStrings) {
                arrayList.add(-1);
            }
            Integer[] numArr = (Integer[]) arrayList.toArray(new Integer[0]);
            List listMutableListOf = CollectionsKt.mutableListOf(Arrays.copyOf(numArr, numArr.length));
            int length = byteStrings.length;
            int i12 = 0;
            int i13 = 0;
            while (i12 < length) {
                listMutableListOf.set(CollectionsKt.binarySearch$default(mutableList, byteStrings[i12], 0, 0, 6, (Object) null), Integer.valueOf(i13));
                i12++;
                i13++;
            }
            if (((ByteString) mutableList.get(0)).size() <= 0) {
                throw new IllegalArgumentException("the empty byte string is not a supported option");
            }
            int i14 = 0;
            while (i14 < mutableList.size()) {
                ByteString byteString2 = (ByteString) mutableList.get(i14);
                int i15 = i14 + 1;
                int i16 = i15;
                while (i16 < mutableList.size()) {
                    ByteString byteString3 = (ByteString) mutableList.get(i16);
                    if (!byteString3.startsWith(byteString2)) {
                        break;
                    }
                    if (byteString3.size() == byteString2.size()) {
                        throw new IllegalArgumentException(("duplicate option: " + byteString3).toString());
                    }
                    if (((Number) listMutableListOf.get(i16)).intValue() > ((Number) listMutableListOf.get(i14)).intValue()) {
                        mutableList.remove(i16);
                        listMutableListOf.remove(i16);
                    } else {
                        i16++;
                    }
                }
                i14 = i15;
            }
            Buffer buffer = new Buffer();
            buildTrieRecursive$default(this, 0L, buffer, 0, mutableList, 0, 0, listMutableListOf, 53, null);
            int[] iArr = new int[(int) getIntCount(buffer)];
            while (!buffer.exhausted()) {
                iArr[i11] = buffer.readInt();
                i11++;
            }
            Object[] objArrCopyOf = Arrays.copyOf(byteStrings, byteStrings.length);
            Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(this, size)");
            return new Options((ByteString[]) objArrCopyOf, iArr, defaultConstructorMarker);
        }

        private final long getIntCount(Buffer buffer) {
            return buffer.size() / ((long) 4);
        }
    }

    public /* synthetic */ Options(ByteString[] byteStringArr, int[] iArr, DefaultConstructorMarker defaultConstructorMarker) {
        this(byteStringArr, iArr);
    }

    @Override // p852kotlin.collections.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof ByteString) {
            return contains((ByteString) obj);
        }
        return false;
    }

    @Override // p852kotlin.collections.AbstractList, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof ByteString) {
            return indexOf((ByteString) obj);
        }
        return -1;
    }

    @Override // p852kotlin.collections.AbstractList, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof ByteString) {
            return lastIndexOf((ByteString) obj);
        }
        return -1;
    }

    private Options(ByteString[] byteStringArr, int[] iArr) {
        this.byteStrings = byteStringArr;
        this.trie = iArr;
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: of */
    public static final Options m94739of(@NotNull ByteString... byteStringArr) {
        return INSTANCE.m94740of(byteStringArr);
    }

    public /* bridge */ boolean contains(ByteString byteString) {
        return super.contains((Object) byteString);
    }

    @Override // p852kotlin.collections.AbstractList, java.util.List
    @NotNull
    public ByteString get(int index) {
        return this.byteStrings[index];
    }

    @NotNull
    /* JADX INFO: renamed from: getByteStrings$okio, reason: from getter */
    public final ByteString[] getByteStrings() {
        return this.byteStrings;
    }

    @Override // p852kotlin.collections.AbstractList, p852kotlin.collections.AbstractCollection
    /* JADX INFO: renamed from: getSize */
    public int get_size() {
        return this.byteStrings.length;
    }

    @NotNull
    /* JADX INFO: renamed from: getTrie$okio, reason: from getter */
    public final int[] getTrie() {
        return this.trie;
    }

    public /* bridge */ int indexOf(ByteString byteString) {
        return super.indexOf((Object) byteString);
    }

    public /* bridge */ int lastIndexOf(ByteString byteString) {
        return super.lastIndexOf((Object) byteString);
    }
}
