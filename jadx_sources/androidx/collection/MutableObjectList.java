package androidx.collection;

import androidx.annotation.IntRange;
import androidx.exifinterface.media.ExifInterface;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.collections.ArraysKt;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.CollectionToArray;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.jvm.internal.markers.KMutableList;
import p852kotlin.jvm.internal.markers.KMutableListIterator;
import p852kotlin.ranges.RangesKt;
import p852kotlin.sequences.Sequence;
import p852kotlin.sequences.SequencesKt;

/* JADX INFO: compiled from: ObjectList.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\u0010\u001c\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002:\u0003678B\u000f\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0013\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00028\u0000¢\u0006\u0002\u0010\u000eJ\u001d\u0010\u000b\u001a\u00020\u000f2\b\b\u0001\u0010\u0010\u001a\u00020\u00042\u0006\u0010\r\u001a\u00028\u0000¢\u0006\u0002\u0010\u0011J\u0014\u0010\u0012\u001a\u00020\f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002J\u0014\u0010\u0012\u001a\u00020\f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014J\u0019\u0010\u0012\u001a\u00020\f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0015¢\u0006\u0002\u0010\u0016J\u001e\u0010\u0012\u001a\u00020\f2\b\b\u0001\u0010\u0010\u001a\u00020\u00042\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002J#\u0010\u0012\u001a\u00020\f2\b\b\u0001\u0010\u0010\u001a\u00020\u00042\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0015¢\u0006\u0002\u0010\u0017J\u001e\u0010\u0012\u001a\u00020\f2\b\b\u0001\u0010\u0010\u001a\u00020\u00042\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0018J\u0014\u0010\u0012\u001a\u00020\f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0019J\u0014\u0010\u0012\u001a\u00020\f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u001aJ\u0014\u0010\u0012\u001a\u00020\f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u001bJ\u000e\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u001aH\u0016J\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00000\u001eJ\u0006\u0010\u001f\u001a\u00020\u000fJ\u000e\u0010 \u001a\u00020\u000f2\u0006\u0010\u0006\u001a\u00020\u0004J\u0016\u0010!\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00028\u0000H\u0086\n¢\u0006\u0002\u0010\"J\u0017\u0010!\u001a\u00020\u000f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0086\u0002J\u0017\u0010!\u001a\u00020\u000f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014H\u0086\u0002J\u001c\u0010!\u001a\u00020\u000f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0015H\u0086\u0002¢\u0006\u0002\u0010#J\u0017\u0010!\u001a\u00020\u000f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0019H\u0086\u0002J\u0017\u0010!\u001a\u00020\u000f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u001aH\u0086\u0002J\u0017\u0010!\u001a\u00020\u000f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u001bH\u0086\u0002J\u0016\u0010$\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00028\u0000H\u0086\n¢\u0006\u0002\u0010\"J\u0017\u0010$\u001a\u00020\u000f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0086\u0002J\u0017\u0010$\u001a\u00020\u000f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014H\u0086\u0002J\u001c\u0010$\u001a\u00020\u000f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0015H\u0086\u0002¢\u0006\u0002\u0010#J\u0017\u0010$\u001a\u00020\u000f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0019H\u0086\u0002J\u0017\u0010$\u001a\u00020\u000f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u001aH\u0086\u0002J\u0017\u0010$\u001a\u00020\u000f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u001bH\u0086\u0002J\u0013\u0010%\u001a\u00020\f2\u0006\u0010\r\u001a\u00028\u0000¢\u0006\u0002\u0010\u000eJ\u0014\u0010&\u001a\u00020\f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002J\u0014\u0010&\u001a\u00020\f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014J\u0019\u0010&\u001a\u00020\f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0015¢\u0006\u0002\u0010\u0016J\u0014\u0010&\u001a\u00020\f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0019J\u0014\u0010&\u001a\u00020\f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u001aJ\u0014\u0010&\u001a\u00020\f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u001bJ\u0015\u0010'\u001a\u00028\u00002\b\b\u0001\u0010\u0010\u001a\u00020\u0004¢\u0006\u0002\u0010(J/\u0010)\u001a\u00020\u000f2!\u0010*\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b,\u0012\b\b-\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\f0+H\u0086\bø\u0001\u0000J\u001a\u0010.\u001a\u00020\u000f2\b\b\u0001\u0010/\u001a\u00020\u00042\b\b\u0001\u00100\u001a\u00020\u0004J\u0014\u00101\u001a\u00020\f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002J\u0019\u00101\u001a\u00020\f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0015¢\u0006\u0002\u0010\u0016J\u0014\u00101\u001a\u00020\f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0018J\u0014\u00101\u001a\u00020\f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0019J\u0014\u00101\u001a\u00020\f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u001bJ \u00102\u001a\u00028\u00002\b\b\u0001\u0010\u0010\u001a\u00020\u00042\u0006\u0010\r\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0002\u00103J\u0010\u00104\u001a\u00020\u000f2\b\b\u0002\u00105\u001a\u00020\u0004R\u0012\u0010\u0006\u001a\u00020\u00048Æ\u0002¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\t\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u00069"}, m90084d2 = {"Landroidx/collection/MutableObjectList;", ExifInterface.LONGITUDE_EAST, "Landroidx/collection/ObjectList;", "initialCapacity", "", "(I)V", "capacity", "getCapacity", "()I", "list", "Landroidx/collection/MutableObjectList$ObjectListMutableList;", "add", "", "element", "(Ljava/lang/Object;)Z", "", "index", "(ILjava/lang/Object;)V", "addAll", "elements", "Landroidx/collection/ScatterSet;", "", "([Ljava/lang/Object;)Z", "(I[Ljava/lang/Object;)Z", "", "", "", "Lkotlin/sequences/Sequence;", "asList", "asMutableList", "", "clear", "ensureCapacity", "minusAssign", "(Ljava/lang/Object;)V", "([Ljava/lang/Object;)V", "plusAssign", "remove", "removeAll", "removeAt", "(I)Ljava/lang/Object;", "removeIf", "predicate", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "removeRange", "start", "end", "retainAll", "set", "(ILjava/lang/Object;)Ljava/lang/Object;", "trim", "minCapacity", "MutableObjectListIterator", "ObjectListMutableList", "SubList", "collection"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nObjectList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ObjectList.kt\nandroidx/collection/MutableObjectList\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ScatterSet.kt\nandroidx/collection/ScatterSet\n+ 4 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 5 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n+ 6 ObjectList.kt\nandroidx/collection/ObjectList\n+ 7 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,1618:1\n948#1,2:1641\n948#1,2:1652\n948#1,2:1656\n652#1:1659\n955#1,2:1662\n955#1,2:1669\n955#1,2:1691\n955#1,2:1701\n955#1,2:1704\n955#1,2:1708\n1864#2,3:1619\n1855#2:1651\n1856#2:1654\n1855#2:1703\n1856#2:1706\n267#3,4:1622\n237#3,7:1626\n248#3,3:1634\n251#3,2:1638\n272#3:1640\n273#3:1643\n254#3,6:1644\n274#3:1650\n267#3,4:1672\n237#3,7:1676\n248#3,3:1684\n251#3,2:1688\n272#3:1690\n273#3:1693\n254#3,6:1694\n274#3:1700\n1826#4:1633\n1688#4:1637\n1826#4:1683\n1688#4:1687\n1295#5:1655\n1296#5:1658\n1295#5:1707\n1296#5:1710\n80#6:1660\n305#6,4:1665\n310#6:1671\n75#6:1711\n75#6:1712\n75#6:1713\n75#6:1714\n75#6:1715\n75#6:1716\n75#6:1717\n75#6:1718\n13579#7:1661\n13580#7:1664\n*S KotlinDebug\n*F\n+ 1 ObjectList.kt\nandroidx/collection/MutableObjectList\n*L\n864#1:1641,2\n898#1:1652,2\n907#1:1656,2\n927#1:1659\n1050#1:1662,2\n1059#1:1669,2\n1068#1:1691,2\n1077#1:1701,2\n1086#1:1704,2\n1095#1:1708,2\n740#1:1619,3\n897#1:1651\n897#1:1654\n1085#1:1703\n1085#1:1706\n863#1:1622,4\n863#1:1626,7\n863#1:1634,3\n863#1:1638,2\n863#1:1640\n863#1:1643\n863#1:1644,6\n863#1:1650\n1067#1:1672,4\n1067#1:1676,7\n1067#1:1684,3\n1067#1:1688,2\n1067#1:1690\n1067#1:1693\n1067#1:1694,6\n1067#1:1700\n863#1:1633\n863#1:1637\n1067#1:1683\n1067#1:1687\n906#1:1655\n906#1:1658\n1094#1:1707\n1094#1:1710\n979#1:1660\n1058#1:1665,4\n1058#1:1671\n1105#1:1711\n1109#1:1712\n1159#1:1713\n1175#1:1714\n1191#1:1715\n1207#1:1716\n1223#1:1717\n1242#1:1718\n1049#1:1661\n1049#1:1664\n*E\n"})
public final class MutableObjectList<E> extends ObjectList<E> {

    @Nullable
    private ObjectListMutableList<E> list;

    /* JADX INFO: compiled from: ObjectList.kt */
    @Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010+\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u001b\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0015\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010\fJ\t\u0010\r\u001a\u00020\u000eH\u0096\u0002J\b\u0010\u000f\u001a\u00020\u000eH\u0016J\u000e\u0010\u0010\u001a\u00028\u0001H\u0096\u0002¢\u0006\u0002\u0010\u0011J\b\u0010\u0012\u001a\u00020\u0006H\u0016J\r\u0010\u0013\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010\u0011J\b\u0010\u0014\u001a\u00020\u0006H\u0016J\b\u0010\u0015\u001a\u00020\nH\u0016J\u0015\u0010\u0016\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010\fR\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0017"}, m90084d2 = {"Landroidx/collection/MutableObjectList$MutableObjectListIterator;", ExifInterface.GPS_DIRECTION_TRUE, "", "list", "", "index", "", "(Ljava/util/List;I)V", "prevIndex", "add", "", "element", "(Ljava/lang/Object;)V", "hasNext", "", "hasPrevious", "next", "()Ljava/lang/Object;", "nextIndex", "previous", "previousIndex", "remove", "set", "collection"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    public static final class MutableObjectListIterator<T> implements ListIterator<T>, KMutableListIterator {

        @NotNull
        private final List<T> list;
        private int prevIndex;

        @Override // java.util.ListIterator
        public void add(T element) {
            List<T> list = this.list;
            int i11 = this.prevIndex + 1;
            this.prevIndex = i11;
            list.add(i11, element);
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.prevIndex < this.list.size() - 1;
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.prevIndex >= 0;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public T next() {
            List<T> list = this.list;
            int i11 = this.prevIndex + 1;
            this.prevIndex = i11;
            return list.get(i11);
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.prevIndex + 1;
        }

        @Override // java.util.ListIterator
        public T previous() {
            List<T> list = this.list;
            int i11 = this.prevIndex;
            this.prevIndex = i11 - 1;
            return list.get(i11);
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.prevIndex;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            this.list.remove(this.prevIndex);
            this.prevIndex--;
        }

        @Override // java.util.ListIterator
        public void set(T element) {
            this.list.set(this.prevIndex, element);
        }

        public MutableObjectListIterator(@NotNull List<T> list, int i11) {
            Intrinsics.checkNotNullParameter(list, "list");
            this.list = list;
            this.prevIndex = i11 - 1;
        }
    }

    /* JADX INFO: compiled from: ObjectList.kt */
    @Metadata(m90083d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u001e\n\u0002\b\t\n\u0002\u0010)\n\u0002\b\u0002\n\u0002\u0010+\n\u0002\b\n\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u0013\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004¢\u0006\u0002\u0010\u0005J\u0015\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010\rJ\u001d\u0010\n\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00072\u0006\u0010\f\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010\u0010J\u001e\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u00072\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00010\u0013H\u0016J\u0016\u0010\u0011\u001a\u00020\u000b2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00010\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u000eH\u0016J\u0016\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00028\u0001H\u0096\u0002¢\u0006\u0002\u0010\rJ\u0016\u0010\u0016\u001a\u00020\u000b2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00010\u0013H\u0016J\u0016\u0010\u0017\u001a\u00028\u00012\u0006\u0010\u000f\u001a\u00020\u0007H\u0096\u0002¢\u0006\u0002\u0010\u0018J\u0015\u0010\u0019\u001a\u00020\u00072\u0006\u0010\f\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010\u001aJ\b\u0010\u001b\u001a\u00020\u000bH\u0016J\u000f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00010\u001dH\u0096\u0002J\u0015\u0010\u001e\u001a\u00020\u00072\u0006\u0010\f\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010\u001aJ\u000e\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00010 H\u0016J\u0016\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00010 2\u0006\u0010\u000f\u001a\u00020\u0007H\u0016J\u0015\u0010!\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010\rJ\u0016\u0010\"\u001a\u00020\u000b2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00010\u0013H\u0016J\u0015\u0010#\u001a\u00028\u00012\u0006\u0010\u000f\u001a\u00020\u0007H\u0016¢\u0006\u0002\u0010\u0018J\u0016\u0010$\u001a\u00020\u000b2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00010\u0013H\u0016J\u001e\u0010%\u001a\u00028\u00012\u0006\u0010\u000f\u001a\u00020\u00072\u0006\u0010\f\u001a\u00028\u0001H\u0096\u0002¢\u0006\u0002\u0010&J\u001e\u0010'\u001a\b\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010(\u001a\u00020\u00072\u0006\u0010)\u001a\u00020\u0007H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006*"}, m90084d2 = {"Landroidx/collection/MutableObjectList$ObjectListMutableList;", ExifInterface.GPS_DIRECTION_TRUE, "", "objectList", "Landroidx/collection/MutableObjectList;", "(Landroidx/collection/MutableObjectList;)V", "size", "", "getSize", "()I", "add", "", "element", "(Ljava/lang/Object;)Z", "", "index", "(ILjava/lang/Object;)V", "addAll", "elements", "", "clear", "contains", "containsAll", "get", "(I)Ljava/lang/Object;", "indexOf", "(Ljava/lang/Object;)I", "isEmpty", "iterator", "", "lastIndexOf", "listIterator", "", "remove", "removeAll", "removeAt", "retainAll", "set", "(ILjava/lang/Object;)Ljava/lang/Object;", "subList", "fromIndex", "toIndex", "collection"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    public static final class ObjectListMutableList<T> implements List<T>, KMutableList {

        @NotNull
        private final MutableObjectList<T> objectList;

        @Override // java.util.List, java.util.Collection
        public boolean add(T element) {
            return this.objectList.add(element);
        }

        @Override // java.util.List
        public boolean addAll(int index, @NotNull Collection<? extends T> elements) {
            Intrinsics.checkNotNullParameter(elements, "elements");
            return this.objectList.addAll(index, elements);
        }

        @Override // java.util.List
        @NotNull
        public ListIterator<T> listIterator() {
            return new MutableObjectListIterator(this, 0);
        }

        @Override // java.util.List
        public final /* bridge */ T remove(int i11) {
            return removeAt(i11);
        }

        @Override // java.util.List, java.util.Collection
        public Object[] toArray() {
            return CollectionToArray.toArray(this);
        }

        @Override // java.util.List
        public void add(int index, T element) {
            this.objectList.add(index, element);
        }

        @Override // java.util.List, java.util.Collection
        public boolean addAll(@NotNull Collection<? extends T> elements) {
            Intrinsics.checkNotNullParameter(elements, "elements");
            return this.objectList.addAll(elements);
        }

        @Override // java.util.List, java.util.Collection
        public void clear() {
            this.objectList.clear();
        }

        @Override // java.util.List, java.util.Collection
        public boolean contains(Object element) {
            return this.objectList.contains(element);
        }

        @Override // java.util.List, java.util.Collection
        public boolean containsAll(@NotNull Collection<? extends Object> elements) {
            Intrinsics.checkNotNullParameter(elements, "elements");
            return this.objectList.containsAll(elements);
        }

        public int getSize() {
            return this.objectList.getSize();
        }

        @Override // java.util.List
        public int indexOf(Object element) {
            return this.objectList.indexOf(element);
        }

        @Override // java.util.List, java.util.Collection
        public boolean isEmpty() {
            return this.objectList.isEmpty();
        }

        @Override // java.util.List, java.util.Collection, java.lang.Iterable
        @NotNull
        public Iterator<T> iterator() {
            return new MutableObjectListIterator(this, 0);
        }

        @Override // java.util.List
        public int lastIndexOf(Object element) {
            return this.objectList.lastIndexOf(element);
        }

        @Override // java.util.List
        @NotNull
        public ListIterator<T> listIterator(int index) {
            return new MutableObjectListIterator(this, index);
        }

        @Override // java.util.List, java.util.Collection
        public boolean remove(Object element) {
            return this.objectList.remove(element);
        }

        @Override // java.util.List, java.util.Collection
        public boolean removeAll(@NotNull Collection<? extends Object> elements) {
            Intrinsics.checkNotNullParameter(elements, "elements");
            return this.objectList.removeAll(elements);
        }

        @Override // java.util.List, java.util.Collection
        public boolean retainAll(@NotNull Collection<? extends Object> elements) {
            Intrinsics.checkNotNullParameter(elements, "elements");
            return this.objectList.retainAll((Collection<? extends T>) elements);
        }

        @Override // java.util.List, java.util.Collection
        public <T> T[] toArray(T[] array) {
            Intrinsics.checkNotNullParameter(array, "array");
            return (T[]) CollectionToArray.toArray(this, array);
        }

        public ObjectListMutableList(@NotNull MutableObjectList<T> objectList) {
            Intrinsics.checkNotNullParameter(objectList, "objectList");
            this.objectList = objectList;
        }

        @Override // java.util.List
        public T get(int index) {
            ObjectListKt.checkIndex(this, index);
            return this.objectList.get(index);
        }

        public T removeAt(int index) {
            ObjectListKt.checkIndex(this, index);
            return this.objectList.removeAt(index);
        }

        @Override // java.util.List
        public T set(int index, T element) {
            ObjectListKt.checkIndex(this, index);
            return this.objectList.set(index, element);
        }

        @Override // java.util.List, java.util.Collection
        public final /* bridge */ int size() {
            return getSize();
        }

        @Override // java.util.List
        @NotNull
        public List<T> subList(int fromIndex, int toIndex) {
            ObjectListKt.checkSubIndex(this, fromIndex, toIndex);
            return new SubList(this, fromIndex, toIndex);
        }
    }

    /* JADX INFO: compiled from: ObjectList.kt */
    @Metadata(m90083d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u001e\n\u0002\b\t\n\u0002\u0010)\n\u0002\b\u0002\n\u0002\u0010+\n\u0002\b\n\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B#\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010\u000eJ\u001d\u0010\u000b\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00052\u0006\u0010\r\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010\u0011J\u001e\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u00052\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00010\u0014H\u0016J\u0016\u0010\u0012\u001a\u00020\f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00010\u0014H\u0016J\b\u0010\u0015\u001a\u00020\u000fH\u0016J\u0016\u0010\u0016\u001a\u00020\f2\u0006\u0010\r\u001a\u00028\u0001H\u0096\u0002¢\u0006\u0002\u0010\u000eJ\u0016\u0010\u0017\u001a\u00020\f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00010\u0014H\u0016J\u0016\u0010\u0018\u001a\u00028\u00012\u0006\u0010\u0010\u001a\u00020\u0005H\u0096\u0002¢\u0006\u0002\u0010\u0019J\u0015\u0010\u001a\u001a\u00020\u00052\u0006\u0010\r\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010\u001bJ\b\u0010\u001c\u001a\u00020\fH\u0016J\u000f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00010\u001eH\u0096\u0002J\u0015\u0010\u001f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010\u001bJ\u000e\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00010!H\u0016J\u0016\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00010!2\u0006\u0010\u0010\u001a\u00020\u0005H\u0016J\u0015\u0010\"\u001a\u00020\f2\u0006\u0010\r\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010\u000eJ\u0016\u0010#\u001a\u00020\f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00010\u0014H\u0016J\u0015\u0010$\u001a\u00028\u00012\u0006\u0010\u0010\u001a\u00020\u0005H\u0016¢\u0006\u0002\u0010\u0019J\u0016\u0010%\u001a\u00020\f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00010\u0014H\u0016J\u001e\u0010&\u001a\u00028\u00012\u0006\u0010\u0010\u001a\u00020\u00052\u0006\u0010\r\u001a\u00028\u0001H\u0096\u0002¢\u0006\u0002\u0010'J\u001e\u0010(\u001a\b\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010)\u001a\u00020\u00052\u0006\u0010*\u001a\u00020\u0005H\u0016R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006+"}, m90084d2 = {"Landroidx/collection/MutableObjectList$SubList;", ExifInterface.GPS_DIRECTION_TRUE, "", "list", "start", "", "end", "(Ljava/util/List;II)V", "size", "getSize", "()I", "add", "", "element", "(Ljava/lang/Object;)Z", "", "index", "(ILjava/lang/Object;)V", "addAll", "elements", "", "clear", "contains", "containsAll", "get", "(I)Ljava/lang/Object;", "indexOf", "(Ljava/lang/Object;)I", "isEmpty", "iterator", "", "lastIndexOf", "listIterator", "", "remove", "removeAll", "removeAt", "retainAll", "set", "(ILjava/lang/Object;)Ljava/lang/Object;", "subList", "fromIndex", "toIndex", "collection"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nObjectList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ObjectList.kt\nandroidx/collection/MutableObjectList$SubList\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1618:1\n1855#2,2:1619\n1855#2,2:1621\n*S KotlinDebug\n*F\n+ 1 ObjectList.kt\nandroidx/collection/MutableObjectList$SubList\n*L\n1395#1:1619,2\n1477#1:1621,2\n*E\n"})
    public static final class SubList<T> implements List<T>, KMutableList {
        private int end;

        @NotNull
        private final List<T> list;
        private final int start;

        @Override // java.util.List, java.util.Collection
        public boolean add(T element) {
            List<T> list = this.list;
            int i11 = this.end;
            this.end = i11 + 1;
            list.add(i11, element);
            return true;
        }

        @Override // java.util.List
        public boolean addAll(int index, @NotNull Collection<? extends T> elements) {
            Intrinsics.checkNotNullParameter(elements, "elements");
            this.list.addAll(index + this.start, elements);
            this.end += elements.size();
            return elements.size() > 0;
        }

        @Override // java.util.List
        @NotNull
        public ListIterator<T> listIterator() {
            return new MutableObjectListIterator(this, 0);
        }

        @Override // java.util.List
        public final /* bridge */ T remove(int i11) {
            return removeAt(i11);
        }

        @Override // java.util.List, java.util.Collection
        public Object[] toArray() {
            return CollectionToArray.toArray(this);
        }

        @Override // java.util.List
        public void add(int index, T element) {
            this.list.add(index + this.start, element);
            this.end++;
        }

        @Override // java.util.List, java.util.Collection
        public void clear() {
            int i11 = this.end - 1;
            int i12 = this.start;
            if (i12 <= i11) {
                while (true) {
                    this.list.remove(i11);
                    if (i11 == i12) {
                        break;
                    } else {
                        i11--;
                    }
                }
            }
            this.end = this.start;
        }

        @Override // java.util.List, java.util.Collection
        public boolean contains(Object element) {
            int i11 = this.end;
            for (int i12 = this.start; i12 < i11; i12++) {
                if (Intrinsics.areEqual(this.list.get(i12), element)) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.List, java.util.Collection
        public boolean containsAll(@NotNull Collection<? extends Object> elements) {
            Intrinsics.checkNotNullParameter(elements, "elements");
            Iterator<T> it = elements.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
            return true;
        }

        public int getSize() {
            return this.end - this.start;
        }

        @Override // java.util.List
        public int indexOf(Object element) {
            int i11 = this.end;
            for (int i12 = this.start; i12 < i11; i12++) {
                if (Intrinsics.areEqual(this.list.get(i12), element)) {
                    return i12 - this.start;
                }
            }
            return -1;
        }

        @Override // java.util.List, java.util.Collection
        public boolean isEmpty() {
            return this.end == this.start;
        }

        @Override // java.util.List, java.util.Collection, java.lang.Iterable
        @NotNull
        public Iterator<T> iterator() {
            return new MutableObjectListIterator(this, 0);
        }

        @Override // java.util.List
        public int lastIndexOf(Object element) {
            int i11 = this.end - 1;
            int i12 = this.start;
            if (i12 > i11) {
                return -1;
            }
            while (!Intrinsics.areEqual(this.list.get(i11), element)) {
                if (i11 == i12) {
                    return -1;
                }
                i11--;
            }
            return i11 - this.start;
        }

        @Override // java.util.List
        @NotNull
        public ListIterator<T> listIterator(int index) {
            return new MutableObjectListIterator(this, index);
        }

        @Override // java.util.List, java.util.Collection
        public boolean remove(Object element) {
            int i11 = this.end;
            for (int i12 = this.start; i12 < i11; i12++) {
                if (Intrinsics.areEqual(this.list.get(i12), element)) {
                    this.list.remove(i12);
                    this.end--;
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.List, java.util.Collection
        public boolean removeAll(@NotNull Collection<? extends Object> elements) {
            Intrinsics.checkNotNullParameter(elements, "elements");
            int i11 = this.end;
            Iterator<T> it = elements.iterator();
            while (it.hasNext()) {
                remove(it.next());
            }
            return i11 != this.end;
        }

        @Override // java.util.List, java.util.Collection
        public boolean retainAll(@NotNull Collection<? extends Object> elements) {
            Intrinsics.checkNotNullParameter(elements, "elements");
            int i11 = this.end;
            int i12 = i11 - 1;
            int i13 = this.start;
            if (i13 <= i12) {
                while (true) {
                    if (!elements.contains(this.list.get(i12))) {
                        this.list.remove(i12);
                        this.end--;
                    }
                    if (i12 == i13) {
                        break;
                    }
                    i12--;
                }
            }
            return i11 != this.end;
        }

        @Override // java.util.List, java.util.Collection
        public <T> T[] toArray(T[] array) {
            Intrinsics.checkNotNullParameter(array, "array");
            return (T[]) CollectionToArray.toArray(this, array);
        }

        public SubList(@NotNull List<T> list, int i11, int i12) {
            Intrinsics.checkNotNullParameter(list, "list");
            this.list = list;
            this.start = i11;
            this.end = i12;
        }

        @Override // java.util.List
        public T get(int index) {
            ObjectListKt.checkIndex(this, index);
            return this.list.get(index + this.start);
        }

        public T removeAt(int index) {
            ObjectListKt.checkIndex(this, index);
            T tRemove = this.list.remove(index + this.start);
            this.end--;
            return tRemove;
        }

        @Override // java.util.List
        public T set(int index, T element) {
            ObjectListKt.checkIndex(this, index);
            return this.list.set(index + this.start, element);
        }

        @Override // java.util.List, java.util.Collection
        public final /* bridge */ int size() {
            return getSize();
        }

        @Override // java.util.List
        @NotNull
        public List<T> subList(int fromIndex, int toIndex) {
            ObjectListKt.checkSubIndex(this, fromIndex, toIndex);
            return new SubList(this, fromIndex, toIndex);
        }

        @Override // java.util.List, java.util.Collection
        public boolean addAll(@NotNull Collection<? extends T> elements) {
            Intrinsics.checkNotNullParameter(elements, "elements");
            this.list.addAll(this.end, elements);
            this.end += elements.size();
            return elements.size() > 0;
        }
    }

    public MutableObjectList() {
        this(0, 1, null);
    }

    public final boolean add(E element) {
        ensureCapacity(this._size + 1);
        Object[] objArr = this.content;
        int i11 = this._size;
        objArr[i11] = element;
        this._size = i11 + 1;
        return true;
    }

    public final boolean addAll(@IntRange(from = 0) int index, @NotNull E[] elements) {
        int i11;
        Intrinsics.checkNotNullParameter(elements, "elements");
        if (index < 0 || index > (i11 = this._size)) {
            throw new IndexOutOfBoundsException("Index " + index + " must be in 0.." + this._size);
        }
        if (elements.length == 0) {
            return false;
        }
        ensureCapacity(i11 + elements.length);
        Object[] objArr = this.content;
        int i12 = this._size;
        if (index != i12) {
            ArraysKt.copyInto(objArr, objArr, elements.length + index, index, i12);
        }
        ArraysKt.copyInto$default(elements, objArr, index, 0, 0, 12, (Object) null);
        this._size += elements.length;
        return true;
    }

    public final void minusAssign(E element) {
        remove(element);
    }

    public final void plusAssign(@NotNull ObjectList<E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        if (elements.isEmpty()) {
            return;
        }
        ensureCapacity(this._size + elements._size);
        ArraysKt.copyInto(elements.content, this.content, this._size, 0, elements._size);
        this._size += elements._size;
    }

    public final boolean removeAll(@NotNull E[] elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        int i11 = this._size;
        for (E e11 : elements) {
            remove(e11);
        }
        return i11 != this._size;
    }

    public final boolean retainAll(@NotNull E[] elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        int i11 = this._size;
        Object[] objArr = this.content;
        for (int i12 = i11 - 1; -1 < i12; i12--) {
            if (ArraysKt.indexOf(elements, objArr[i12]) < 0) {
                removeAt(i12);
            }
        }
        return i11 != this._size;
    }

    public /* synthetic */ MutableObjectList(int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? 16 : i11);
    }

    public static /* synthetic */ void trim$default(MutableObjectList mutableObjectList, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = mutableObjectList._size;
        }
        mutableObjectList.trim(i11);
    }

    @NotNull
    public final List<E> asMutableList() {
        ObjectListMutableList<E> objectListMutableList = this.list;
        if (objectListMutableList != null) {
            return objectListMutableList;
        }
        ObjectListMutableList<E> objectListMutableList2 = new ObjectListMutableList<>(this);
        this.list = objectListMutableList2;
        return objectListMutableList2;
    }

    public final void clear() {
        ArraysKt.fill(this.content, (Object) null, 0, this._size);
        this._size = 0;
    }

    public final void ensureCapacity(int capacity) {
        Object[] objArr = this.content;
        if (objArr.length < capacity) {
            Object[] objArrCopyOf = Arrays.copyOf(objArr, Math.max(capacity, (objArr.length * 3) / 2));
            Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(this, newSize)");
            this.content = objArrCopyOf;
        }
    }

    public final int getCapacity() {
        return this.content.length;
    }

    public final void minusAssign(@NotNull List<? extends E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        int size = elements.size();
        for (int i11 = 0; i11 < size; i11++) {
            remove(elements.get(i11));
        }
    }

    public final E removeAt(@IntRange(from = 0) int index) {
        int i11;
        if (index < 0 || index >= (i11 = this._size)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Index ");
            sb2.append(index);
            sb2.append(" must be in 0..");
            sb2.append(this._size - 1);
            throw new IndexOutOfBoundsException(sb2.toString());
        }
        Object[] objArr = this.content;
        E e11 = (E) objArr[index];
        if (index != i11 - 1) {
            ArraysKt.copyInto(objArr, objArr, index, index + 1, i11);
        }
        int i12 = this._size - 1;
        this._size = i12;
        objArr[i12] = null;
        return e11;
    }

    public final void removeRange(@IntRange(from = 0) int start, @IntRange(from = 0) int end) {
        int i11;
        if (start < 0 || start > (i11 = this._size) || end < 0 || end > i11) {
            throw new IndexOutOfBoundsException("Start (" + start + ") and end (" + end + ") must be in 0.." + this._size);
        }
        if (end < start) {
            throw new IllegalArgumentException("Start (" + start + ") is more than end (" + end + ')');
        }
        if (end != start) {
            if (end < i11) {
                Object[] objArr = this.content;
                ArraysKt.copyInto(objArr, objArr, start, end, i11);
            }
            int i12 = this._size;
            int i13 = i12 - (end - start);
            ArraysKt.fill(this.content, (Object) null, i13, i12);
            this._size = i13;
        }
    }

    public final E set(@IntRange(from = 0) int index, E element) {
        if (index >= 0 && index < this._size) {
            Object[] objArr = this.content;
            E e11 = (E) objArr[index];
            objArr[index] = element;
            return e11;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("set index ");
        sb2.append(index);
        sb2.append(" must be between 0 .. ");
        sb2.append(this._size - 1);
        throw new IndexOutOfBoundsException(sb2.toString());
    }

    public final void trim(int minCapacity) {
        int iMax = Math.max(minCapacity, this._size);
        Object[] objArr = this.content;
        if (objArr.length > iMax) {
            Object[] objArrCopyOf = Arrays.copyOf(objArr, iMax);
            Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(this, newSize)");
            this.content = objArrCopyOf;
        }
    }

    public MutableObjectList(int i11) {
        super(i11, null);
    }

    @Override // androidx.collection.ObjectList
    @NotNull
    public List<E> asList() {
        return asMutableList();
    }

    public final boolean remove(E element) {
        int iIndexOf = indexOf(element);
        if (iIndexOf >= 0) {
            removeAt(iIndexOf);
            return true;
        }
        return false;
    }

    public final void removeIf(@NotNull Function1<? super E, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int i11 = this._size;
        Object[] objArr = this.content;
        int i12 = 0;
        p852kotlin.ranges.IntRange intRangeUntil = RangesKt.until(0, i11);
        int first = intRangeUntil.getFirst();
        int last = intRangeUntil.getLast();
        if (first <= last) {
            while (true) {
                objArr[first - i12] = objArr[first];
                if (predicate.invoke(objArr[first]).booleanValue()) {
                    i12++;
                }
                if (first == last) {
                    break;
                } else {
                    first++;
                }
            }
        }
        ArraysKt.fill(objArr, (Object) null, i11 - i12, i11);
        this._size -= i12;
    }

    public final void add(@IntRange(from = 0) int index, E element) {
        int i11;
        if (index >= 0 && index <= (i11 = this._size)) {
            ensureCapacity(i11 + 1);
            Object[] objArr = this.content;
            int i12 = this._size;
            if (index != i12) {
                ArraysKt.copyInto(objArr, objArr, index + 1, index, i12);
            }
            objArr[index] = element;
            this._size++;
            return;
        }
        throw new IndexOutOfBoundsException("Index " + index + " must be in 0.." + this._size);
    }

    public final void minusAssign(@NotNull E[] elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        for (E e11 : elements) {
            remove(e11);
        }
    }

    public final boolean removeAll(@NotNull ObjectList<E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        int i11 = this._size;
        minusAssign((ObjectList) elements);
        return i11 != this._size;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void minusAssign(@NotNull ObjectList<E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        Object[] objArr = elements.content;
        int i11 = elements._size;
        for (int i12 = 0; i12 < i11; i12++) {
            remove(objArr[i12]);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean retainAll(@NotNull ObjectList<E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        int i11 = this._size;
        Object[] objArr = this.content;
        for (int i12 = i11 - 1; -1 < i12; i12--) {
            if (!elements.contains(objArr[i12])) {
                removeAt(i12);
            }
        }
        return i11 != this._size;
    }

    public final boolean removeAll(@NotNull ScatterSet<E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        int i11 = this._size;
        minusAssign((ScatterSet) elements);
        return i11 != this._size;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void plusAssign(@NotNull ScatterSet<E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        if (elements.isEmpty()) {
            return;
        }
        ensureCapacity(this._size + elements.get_size());
        Object[] objArr = elements.elements;
        long[] jArr = elements.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i11 = 0;
        while (true) {
            long j11 = jArr[i11];
            if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i12 = 8 - ((~(i11 - length)) >>> 31);
                for (int i13 = 0; i13 < i12; i13++) {
                    if ((255 & j11) < 128) {
                        add(objArr[(i11 << 3) + i13]);
                    }
                    j11 >>= 8;
                }
                if (i12 != 8) {
                    return;
                }
            }
            if (i11 == length) {
                return;
            } else {
                i11++;
            }
        }
    }

    public final boolean addAll(@IntRange(from = 0) int index, @NotNull Collection<? extends E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        if (index >= 0 && index <= this._size) {
            int i11 = 0;
            if (elements.isEmpty()) {
                return false;
            }
            ensureCapacity(this._size + elements.size());
            Object[] objArr = this.content;
            if (index != this._size) {
                ArraysKt.copyInto(objArr, objArr, elements.size() + index, index, this._size);
            }
            for (Object obj : elements) {
                int i12 = i11 + 1;
                if (i11 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                objArr[i11 + index] = obj;
                i11 = i12;
            }
            this._size += elements.size();
            return true;
        }
        throw new IndexOutOfBoundsException("Index " + index + " must be in 0.." + this._size);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void minusAssign(@NotNull ScatterSet<E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        Object[] objArr = elements.elements;
        long[] jArr = elements.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i11 = 0;
        while (true) {
            long j11 = jArr[i11];
            if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i12 = 8 - ((~(i11 - length)) >>> 31);
                for (int i13 = 0; i13 < i12; i13++) {
                    if ((255 & j11) < 128) {
                        remove(objArr[(i11 << 3) + i13]);
                    }
                    j11 >>= 8;
                }
                if (i12 != 8) {
                    return;
                }
            }
            if (i11 == length) {
                return;
            } else {
                i11++;
            }
        }
    }

    public final boolean removeAll(@NotNull List<? extends E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        int i11 = this._size;
        minusAssign((List) elements);
        return i11 != this._size;
    }

    public final boolean retainAll(@NotNull Collection<? extends E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        int i11 = this._size;
        Object[] objArr = this.content;
        for (int i12 = i11 - 1; -1 < i12; i12--) {
            if (!elements.contains(objArr[i12])) {
                removeAt(i12);
            }
        }
        return i11 != this._size;
    }

    public final boolean removeAll(@NotNull Iterable<? extends E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        int i11 = this._size;
        minusAssign((Iterable) elements);
        return i11 != this._size;
    }

    public final void minusAssign(@NotNull Iterable<? extends E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        Iterator<? extends E> it = elements.iterator();
        while (it.hasNext()) {
            remove(it.next());
        }
    }

    public final void plusAssign(@NotNull E[] elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        if (elements.length == 0) {
            return;
        }
        ensureCapacity(this._size + elements.length);
        ArraysKt.copyInto$default(elements, this.content, this._size, 0, 0, 12, (Object) null);
        this._size += elements.length;
    }

    public final boolean removeAll(@NotNull Sequence<? extends E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        int i11 = this._size;
        minusAssign((Sequence) elements);
        return i11 != this._size;
    }

    public final void minusAssign(@NotNull Sequence<? extends E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        Iterator<? extends E> it = elements.iterator();
        while (it.hasNext()) {
            remove(it.next());
        }
    }

    public final boolean retainAll(@NotNull Iterable<? extends E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        int i11 = this._size;
        Object[] objArr = this.content;
        for (int i12 = i11 - 1; -1 < i12; i12--) {
            if (!CollectionsKt.contains(elements, objArr[i12])) {
                removeAt(i12);
            }
        }
        return i11 != this._size;
    }

    public final void plusAssign(@NotNull List<? extends E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        if (elements.isEmpty()) {
            return;
        }
        int i11 = this._size;
        ensureCapacity(elements.size() + i11);
        Object[] objArr = this.content;
        int size = elements.size();
        for (int i12 = 0; i12 < size; i12++) {
            objArr[i12 + i11] = elements.get(i12);
        }
        this._size += elements.size();
    }

    public final boolean addAll(@IntRange(from = 0) int index, @NotNull ObjectList<E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        if (index >= 0 && index <= this._size) {
            if (elements.isEmpty()) {
                return false;
            }
            ensureCapacity(this._size + elements._size);
            Object[] objArr = this.content;
            int i11 = this._size;
            if (index != i11) {
                ArraysKt.copyInto(objArr, objArr, elements._size + index, index, i11);
            }
            ArraysKt.copyInto(elements.content, objArr, index, 0, elements._size);
            this._size += elements._size;
            return true;
        }
        throw new IndexOutOfBoundsException("Index " + index + " must be in 0.." + this._size);
    }

    public final boolean retainAll(@NotNull Sequence<? extends E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        int i11 = this._size;
        Object[] objArr = this.content;
        for (int i12 = i11 - 1; -1 < i12; i12--) {
            if (!SequencesKt.contains(elements, objArr[i12])) {
                removeAt(i12);
            }
        }
        return i11 != this._size;
    }

    public final void plusAssign(E element) {
        add(element);
    }

    public final void plusAssign(@NotNull Iterable<? extends E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        Iterator<? extends E> it = elements.iterator();
        while (it.hasNext()) {
            add(it.next());
        }
    }

    public final void plusAssign(@NotNull Sequence<? extends E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        Iterator<? extends E> it = elements.iterator();
        while (it.hasNext()) {
            add(it.next());
        }
    }

    public final boolean addAll(@NotNull ObjectList<E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        int i11 = this._size;
        plusAssign((ObjectList) elements);
        return i11 != this._size;
    }

    public final boolean addAll(@NotNull ScatterSet<E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        int i11 = this._size;
        plusAssign((ScatterSet) elements);
        return i11 != this._size;
    }

    public final boolean addAll(@NotNull E[] elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        int i11 = this._size;
        plusAssign((Object[]) elements);
        return i11 != this._size;
    }

    public final boolean addAll(@NotNull List<? extends E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        int i11 = this._size;
        plusAssign((List) elements);
        return i11 != this._size;
    }

    public final boolean addAll(@NotNull Iterable<? extends E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        int i11 = this._size;
        plusAssign((Iterable) elements);
        return i11 != this._size;
    }

    public final boolean addAll(@NotNull Sequence<? extends E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        int i11 = this._size;
        plusAssign((Sequence) elements);
        return i11 != this._size;
    }
}
