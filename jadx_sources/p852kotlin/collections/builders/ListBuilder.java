package p852kotlin.collections.builders;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.exifinterface.media.ExifInterface;
import androidx.media3.exoplayer.rtsp.SessionDescription;
import java.io.InvalidObjectException;
import java.io.NotSerializableException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.collections.AbstractMutableList;
import p852kotlin.collections.ArraysKt;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.jvm.internal.markers.KMutableList;
import p852kotlin.jvm.internal.markers.KMutableListIterator;

/* JADX INFO: compiled from: ListBuilder.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0000\n\u0002\b\u000e\n\u0002\u0010)\n\u0000\n\u0002\u0010+\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\b\u0011\n\u0002\u0010\u000e\n\u0002\b\u0015\b\u0000\u0018\u0000 Q*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\u00060\u0003j\u0002`\u00042\b\u0012\u0004\u0012\u0002H\u00010\u00052\u00060\u0006j\u0002`\u0007:\u0003QRSB\u0011\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013J\b\u0010\u0014\u001a\u00020\u0015H\u0002J\b\u0010\u0019\u001a\u00020\u0011H\u0016J\u0016\u0010\u001a\u001a\u00028\u00002\u0006\u0010\u001b\u001a\u00020\tH\u0096\u0002¢\u0006\u0002\u0010\u001cJ\u001e\u0010\u001d\u001a\u00028\u00002\u0006\u0010\u001b\u001a\u00020\t2\u0006\u0010\u001e\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0002\u0010\u001fJ\u0015\u0010 \u001a\u00020\t2\u0006\u0010\u001e\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010!J\u0015\u0010\"\u001a\u00020\t2\u0006\u0010\u001e\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010!J\u000f\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00000$H\u0096\u0002J\u000e\u0010%\u001a\b\u0012\u0004\u0012\u00028\u00000&H\u0016J\u0016\u0010%\u001a\b\u0012\u0004\u0012\u00028\u00000&2\u0006\u0010\u001b\u001a\u00020\tH\u0016J\u0015\u0010'\u001a\u00020\u00112\u0006\u0010\u001e\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010(J\u001d\u0010'\u001a\u00020)2\u0006\u0010\u001b\u001a\u00020\t2\u0006\u0010\u001e\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010*J\u0016\u0010+\u001a\u00020\u00112\f\u0010,\u001a\b\u0012\u0004\u0012\u00028\u00000-H\u0016J\u001e\u0010+\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\t2\f\u0010,\u001a\b\u0012\u0004\u0012\u00028\u00000-H\u0016J\b\u0010.\u001a\u00020)H\u0016J\u0015\u0010/\u001a\u00028\u00002\u0006\u0010\u001b\u001a\u00020\tH\u0016¢\u0006\u0002\u0010\u001cJ\u0015\u00100\u001a\u00020\u00112\u0006\u0010\u001e\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010(J\u0016\u00101\u001a\u00020\u00112\f\u0010,\u001a\b\u0012\u0004\u0012\u00028\u00000-H\u0016J\u0016\u00102\u001a\u00020\u00112\f\u0010,\u001a\b\u0012\u0004\u0012\u00028\u00000-H\u0016J\u001e\u00103\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u00104\u001a\u00020\t2\u0006\u00105\u001a\u00020\tH\u0016J'\u00106\u001a\b\u0012\u0004\u0012\u0002H70\r\"\u0004\b\u0001\u001072\f\u00108\u001a\b\u0012\u0004\u0012\u0002H70\rH\u0016¢\u0006\u0002\u00109J\u0015\u00106\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00150\rH\u0016¢\u0006\u0002\u0010:J\u0013\u0010;\u001a\u00020\u00112\b\u0010<\u001a\u0004\u0018\u00010\u0015H\u0096\u0002J\b\u0010=\u001a\u00020\tH\u0016J\b\u0010>\u001a\u00020?H\u0016J\b\u0010@\u001a\u00020)H\u0002J\b\u0010A\u001a\u00020)H\u0002J\u0010\u0010B\u001a\u00020)2\u0006\u0010C\u001a\u00020\tH\u0002J\u0010\u0010D\u001a\u00020)2\u0006\u0010E\u001a\u00020\tH\u0002J\u0014\u0010F\u001a\u00020\u00112\n\u0010<\u001a\u0006\u0012\u0002\b\u00030\u0013H\u0002J\u0018\u0010G\u001a\u00020)2\u0006\u0010H\u001a\u00020\t2\u0006\u0010C\u001a\u00020\tH\u0002J\u001d\u0010I\u001a\u00020)2\u0006\u0010H\u001a\u00020\t2\u0006\u0010\u001e\u001a\u00028\u0000H\u0002¢\u0006\u0002\u0010*J&\u0010J\u001a\u00020)2\u0006\u0010H\u001a\u00020\t2\f\u0010,\u001a\b\u0012\u0004\u0012\u00028\u00000-2\u0006\u0010C\u001a\u00020\tH\u0002J\u0015\u0010K\u001a\u00028\u00002\u0006\u0010H\u001a\u00020\tH\u0002¢\u0006\u0002\u0010\u001cJ\u0018\u0010L\u001a\u00020)2\u0006\u0010M\u001a\u00020\t2\u0006\u0010N\u001a\u00020\tH\u0002J.\u0010O\u001a\u00020\t2\u0006\u0010M\u001a\u00020\t2\u0006\u0010N\u001a\u00020\t2\f\u0010,\u001a\b\u0012\u0004\u0012\u00028\u00000-2\u0006\u0010P\u001a\u00020\u0011H\u0002R\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\rX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u000eR\u000e\u0010\u000f\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018¨\u0006T"}, m90084d2 = {"Lkotlin/collections/builders/ListBuilder;", ExifInterface.LONGITUDE_EAST, "", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "Lkotlin/collections/AbstractMutableList;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "initialCapacity", "", "<init>", "(I)V", "backing", "", "[Ljava/lang/Object;", SessionDescription.ATTR_LENGTH, "isReadOnly", "", "build", "", "writeReplace", "", "size", "getSize", "()I", "isEmpty", "get", "index", "(I)Ljava/lang/Object;", "set", "element", "(ILjava/lang/Object;)Ljava/lang/Object;", "indexOf", "(Ljava/lang/Object;)I", "lastIndexOf", "iterator", "", "listIterator", "", "add", "(Ljava/lang/Object;)Z", "", "(ILjava/lang/Object;)V", "addAll", "elements", "", "clear", "removeAt", "remove", "removeAll", "retainAll", "subList", "fromIndex", "toIndex", "toArray", ExifInterface.GPS_DIRECTION_TRUE, "array", "([Ljava/lang/Object;)[Ljava/lang/Object;", "()[Ljava/lang/Object;", "equals", "other", "hashCode", "toString", "", "registerModification", "checkIsMutable", "ensureExtraCapacity", "n", "ensureCapacityInternal", "minCapacity", "contentEquals", "insertAtInternal", "i", "addAtInternal", "addAllInternal", "removeAtInternal", "removeRangeInternal", "rangeOffset", "rangeLength", "retainOrRemoveAllInternal", "retain", "Companion", "Itr", "BuilderSubList", "kotlin-stdlib"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nListBuilder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ListBuilder.kt\nkotlin/collections/builders/ListBuilder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,722:1\n1#2:723\n*E\n"})
public final class ListBuilder<E> extends AbstractMutableList<E> implements List<E>, RandomAccess, Serializable, KMutableList {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private static final ListBuilder Empty;

    @NotNull
    private E[] backing;
    private boolean isReadOnly;
    private int length;

    /* JADX INFO: compiled from: ListBuilder.kt */
    @Metadata(m90083d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010)\n\u0000\n\u0002\u0010+\n\u0002\b\u0005\n\u0002\u0010\u001e\n\u0002\b\u0011\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\f\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\u00060\u0003j\u0002`\u00042\b\u0012\u0004\u0012\u0002H\u00010\u00052\u00060\u0006j\u0002`\u0007:\u0001TBC\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00010\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0000\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00010\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0013\u001a\u00020\u0014H\u0002J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\b\u0010\u001c\u001a\u00020\u001dH\u0016J\u0016\u0010\u001e\u001a\u00028\u00012\u0006\u0010\u001f\u001a\u00020\u000bH\u0096\u0002¢\u0006\u0002\u0010 J\u001e\u0010!\u001a\u00028\u00012\u0006\u0010\u001f\u001a\u00020\u000b2\u0006\u0010\"\u001a\u00028\u0001H\u0096\u0002¢\u0006\u0002\u0010#J\u0015\u0010$\u001a\u00020\u000b2\u0006\u0010\"\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010%J\u0015\u0010&\u001a\u00020\u000b2\u0006\u0010\"\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010%J\u000f\u0010'\u001a\b\u0012\u0004\u0012\u00028\u00010(H\u0096\u0002J\u000e\u0010)\u001a\b\u0012\u0004\u0012\u00028\u00010*H\u0016J\u0016\u0010)\u001a\b\u0012\u0004\u0012\u00028\u00010*2\u0006\u0010\u001f\u001a\u00020\u000bH\u0016J\u0015\u0010+\u001a\u00020\u001d2\u0006\u0010\"\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010,J\u001d\u0010+\u001a\u00020\u00162\u0006\u0010\u001f\u001a\u00020\u000b2\u0006\u0010\"\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010-J\u0016\u0010.\u001a\u00020\u001d2\f\u0010/\u001a\b\u0012\u0004\u0012\u00028\u000100H\u0016J\u001e\u0010.\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u000b2\f\u0010/\u001a\b\u0012\u0004\u0012\u00028\u000100H\u0016J\b\u00101\u001a\u00020\u0016H\u0016J\u0015\u00102\u001a\u00028\u00012\u0006\u0010\u001f\u001a\u00020\u000bH\u0016¢\u0006\u0002\u0010 J\u0015\u00103\u001a\u00020\u001d2\u0006\u0010\"\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010,J\u0016\u00104\u001a\u00020\u001d2\f\u0010/\u001a\b\u0012\u0004\u0012\u00028\u000100H\u0016J\u0016\u00105\u001a\u00020\u001d2\f\u0010/\u001a\b\u0012\u0004\u0012\u00028\u000100H\u0016J\u001e\u00106\u001a\b\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u00107\u001a\u00020\u000b2\u0006\u00108\u001a\u00020\u000bH\u0016J'\u00109\u001a\b\u0012\u0004\u0012\u0002H:0\t\"\u0004\b\u0002\u0010:2\f\u0010;\u001a\b\u0012\u0004\u0012\u0002H:0\tH\u0016¢\u0006\u0002\u0010<J\u0015\u00109\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140\tH\u0016¢\u0006\u0002\u0010=J\u0013\u0010>\u001a\u00020\u001d2\b\u0010?\u001a\u0004\u0018\u00010\u0014H\u0096\u0002J\b\u0010@\u001a\u00020\u000bH\u0016J\b\u0010A\u001a\u00020BH\u0016J\b\u0010C\u001a\u00020\u0016H\u0002J\b\u0010D\u001a\u00020\u0016H\u0002J\b\u0010E\u001a\u00020\u0016H\u0002J\u0014\u0010H\u001a\u00020\u001d2\n\u0010?\u001a\u0006\u0012\u0002\b\u00030IH\u0002J\u001d\u0010J\u001a\u00020\u00162\u0006\u0010K\u001a\u00020\u000b2\u0006\u0010\"\u001a\u00028\u0001H\u0002¢\u0006\u0002\u0010-J&\u0010L\u001a\u00020\u00162\u0006\u0010K\u001a\u00020\u000b2\f\u0010/\u001a\b\u0012\u0004\u0012\u00028\u0001002\u0006\u0010M\u001a\u00020\u000bH\u0002J\u0015\u0010N\u001a\u00028\u00012\u0006\u0010K\u001a\u00020\u000bH\u0002¢\u0006\u0002\u0010 J\u0018\u0010O\u001a\u00020\u00162\u0006\u0010P\u001a\u00020\u000b2\u0006\u0010Q\u001a\u00020\u000bH\u0002J.\u0010R\u001a\u00020\u000b2\u0006\u0010P\u001a\u00020\u000b2\u0006\u0010Q\u001a\u00020\u000b2\f\u0010/\u001a\b\u0012\u0004\u0012\u00028\u0001002\u0006\u0010S\u001a\u00020\u001dH\u0002R\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00010\tX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0012R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\r\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0000X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00010\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0019\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010F\u001a\u00020\u001d8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bF\u0010G¨\u0006U"}, m90084d2 = {"Lkotlin/collections/builders/ListBuilder$BuilderSubList;", ExifInterface.LONGITUDE_EAST, "", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "Lkotlin/collections/AbstractMutableList;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "backing", "", TypedValues.CycleType.S_WAVE_OFFSET, "", SessionDescription.ATTR_LENGTH, "parent", "root", "Lkotlin/collections/builders/ListBuilder;", "<init>", "([Ljava/lang/Object;IILkotlin/collections/builders/ListBuilder$BuilderSubList;Lkotlin/collections/builders/ListBuilder;)V", "[Ljava/lang/Object;", "writeReplace", "", "readObject", "", "input", "Ljava/io/ObjectInputStream;", "size", "getSize", "()I", "isEmpty", "", "get", "index", "(I)Ljava/lang/Object;", "set", "element", "(ILjava/lang/Object;)Ljava/lang/Object;", "indexOf", "(Ljava/lang/Object;)I", "lastIndexOf", "iterator", "", "listIterator", "", "add", "(Ljava/lang/Object;)Z", "(ILjava/lang/Object;)V", "addAll", "elements", "", "clear", "removeAt", "remove", "removeAll", "retainAll", "subList", "fromIndex", "toIndex", "toArray", ExifInterface.GPS_DIRECTION_TRUE, "array", "([Ljava/lang/Object;)[Ljava/lang/Object;", "()[Ljava/lang/Object;", "equals", "other", "hashCode", "toString", "", "registerModification", "checkForComodification", "checkIsMutable", "isReadOnly", "()Z", "contentEquals", "", "addAtInternal", "i", "addAllInternal", "n", "removeAtInternal", "removeRangeInternal", "rangeOffset", "rangeLength", "retainOrRemoveAllInternal", "retain", "Itr", "kotlin-stdlib"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class BuilderSubList<E> extends AbstractMutableList<E> implements List<E>, RandomAccess, Serializable, KMutableList {

        @NotNull
        private E[] backing;
        private int length;
        private final int offset;

        @Nullable
        private final BuilderSubList<E> parent;

        @NotNull
        private final ListBuilder<E> root;

        /* JADX INFO: compiled from: ListBuilder.kt */
        @Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010+\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0002\u0018\u0000*\u0004\b\u0002\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u001d\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u000b\u001a\u00020\fH\u0016J\t\u0010\r\u001a\u00020\fH\u0096\u0002J\b\u0010\u000e\u001a\u00020\u0006H\u0016J\b\u0010\u000f\u001a\u00020\u0006H\u0016J\r\u0010\u0010\u001a\u00028\u0002H\u0016¢\u0006\u0002\u0010\u0011J\u000e\u0010\u0012\u001a\u00028\u0002H\u0096\u0002¢\u0006\u0002\u0010\u0011J\u0015\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00028\u0002H\u0016¢\u0006\u0002\u0010\u0016J\u0015\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00028\u0002H\u0016¢\u0006\u0002\u0010\u0016J\b\u0010\u0018\u001a\u00020\u0014H\u0016J\b\u0010\u0019\u001a\u00020\u0014H\u0002R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m90084d2 = {"Lkotlin/collections/builders/ListBuilder$BuilderSubList$Itr;", ExifInterface.LONGITUDE_EAST, "", "list", "Lkotlin/collections/builders/ListBuilder$BuilderSubList;", "index", "", "<init>", "(Lkotlin/collections/builders/ListBuilder$BuilderSubList;I)V", "lastIndex", "expectedModCount", "hasPrevious", "", "hasNext", "previousIndex", "nextIndex", "previous", "()Ljava/lang/Object;", "next", "set", "", "element", "(Ljava/lang/Object;)V", "add", "remove", "checkForComodification", "kotlin-stdlib"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
        @SourceDebugExtension({"SMAP\nListBuilder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ListBuilder.kt\nkotlin/collections/builders/ListBuilder$BuilderSubList$Itr\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,722:1\n1#2:723\n*E\n"})
        public static final class Itr<E> implements ListIterator<E>, KMutableListIterator {
            private int expectedModCount;
            private int index;
            private int lastIndex;

            @NotNull
            private final BuilderSubList<E> list;

            public Itr(@NotNull BuilderSubList<E> list, int i11) {
                Intrinsics.checkNotNullParameter(list, "list");
                this.list = list;
                this.index = i11;
                this.lastIndex = -1;
                this.expectedModCount = ((AbstractList) list).modCount;
            }

            private final void checkForComodification() {
                if (((AbstractList) ((BuilderSubList) this.list).root).modCount != this.expectedModCount) {
                    throw new ConcurrentModificationException();
                }
            }

            @Override // java.util.ListIterator, java.util.Iterator
            public boolean hasNext() {
                return this.index < ((BuilderSubList) this.list).length;
            }

            @Override // java.util.ListIterator
            public boolean hasPrevious() {
                return this.index > 0;
            }

            @Override // java.util.ListIterator
            public int nextIndex() {
                return this.index;
            }

            @Override // java.util.ListIterator
            public int previousIndex() {
                return this.index - 1;
            }

            @Override // java.util.ListIterator
            public void add(E element) {
                checkForComodification();
                BuilderSubList<E> builderSubList = this.list;
                int i11 = this.index;
                this.index = i11 + 1;
                builderSubList.add(i11, element);
                this.lastIndex = -1;
                this.expectedModCount = ((AbstractList) this.list).modCount;
            }

            @Override // java.util.ListIterator, java.util.Iterator
            public E next() {
                checkForComodification();
                if (this.index < ((BuilderSubList) this.list).length) {
                    int i11 = this.index;
                    this.index = i11 + 1;
                    this.lastIndex = i11;
                    return (E) ((BuilderSubList) this.list).backing[((BuilderSubList) this.list).offset + this.lastIndex];
                }
                throw new NoSuchElementException();
            }

            @Override // java.util.ListIterator
            public E previous() {
                checkForComodification();
                int i11 = this.index;
                if (i11 > 0) {
                    int i12 = i11 - 1;
                    this.index = i12;
                    this.lastIndex = i12;
                    return (E) ((BuilderSubList) this.list).backing[((BuilderSubList) this.list).offset + this.lastIndex];
                }
                throw new NoSuchElementException();
            }

            @Override // java.util.ListIterator, java.util.Iterator
            public void remove() {
                checkForComodification();
                int i11 = this.lastIndex;
                if (i11 != -1) {
                    this.list.removeAt(i11);
                    this.index = this.lastIndex;
                    this.lastIndex = -1;
                    this.expectedModCount = ((AbstractList) this.list).modCount;
                    return;
                }
                throw new IllegalStateException("Call next() or previous() before removing element from the iterator.");
            }

            @Override // java.util.ListIterator
            public void set(E element) {
                checkForComodification();
                int i11 = this.lastIndex;
                if (i11 != -1) {
                    this.list.set(i11, element);
                    return;
                }
                throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.");
            }
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean add(E element) {
            checkIsMutable();
            checkForComodification();
            addAtInternal(this.offset + this.length, element);
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean addAll(@NotNull Collection<? extends E> elements) {
            Intrinsics.checkNotNullParameter(elements, "elements");
            checkIsMutable();
            checkForComodification();
            int size = elements.size();
            addAllInternal(this.offset + this.length, elements, size);
            return size > 0;
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
        @NotNull
        public Iterator<E> iterator() {
            return listIterator(0);
        }

        @Override // java.util.AbstractList, java.util.List
        @NotNull
        public ListIterator<E> listIterator() {
            return listIterator(0);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        @NotNull
        public <T> T[] toArray(@NotNull T[] array) {
            Intrinsics.checkNotNullParameter(array, "array");
            checkForComodification();
            int length = array.length;
            int i11 = this.length;
            if (length >= i11) {
                E[] eArr = this.backing;
                int i12 = this.offset;
                ArraysKt.copyInto(eArr, array, 0, i12, i11 + i12);
                return (T[]) CollectionsKt.terminateCollectionToArray(this.length, array);
            }
            E[] eArr2 = this.backing;
            int i13 = this.offset;
            T[] tArr = (T[]) Arrays.copyOfRange(eArr2, i13, i11 + i13, array.getClass());
            Intrinsics.checkNotNullExpressionValue(tArr, "copyOfRange(...)");
            return tArr;
        }

        public BuilderSubList(@NotNull E[] backing, int i11, int i12, @Nullable BuilderSubList<E> builderSubList, @NotNull ListBuilder<E> root) {
            Intrinsics.checkNotNullParameter(backing, "backing");
            Intrinsics.checkNotNullParameter(root, "root");
            this.backing = backing;
            this.offset = i11;
            this.length = i12;
            this.parent = builderSubList;
            this.root = root;
            ((AbstractList) this).modCount = ((AbstractList) root).modCount;
        }

        private final void checkForComodification() {
            if (((AbstractList) this.root).modCount != ((AbstractList) this).modCount) {
                throw new ConcurrentModificationException();
            }
        }

        private final boolean contentEquals(List<?> other) {
            return ListBuilderKt.subarrayContentEquals(this.backing, this.offset, this.length, other);
        }

        private final boolean isReadOnly() {
            return ((ListBuilder) this.root).isReadOnly;
        }

        private final void readObject(ObjectInputStream input) throws InvalidObjectException {
            throw new InvalidObjectException("Deserialization is supported via proxy only");
        }

        private final void registerModification() {
            ((AbstractList) this).modCount++;
        }

        private final void removeRangeInternal(int rangeOffset, int rangeLength) {
            if (rangeLength > 0) {
                registerModification();
            }
            BuilderSubList<E> builderSubList = this.parent;
            if (builderSubList != null) {
                builderSubList.removeRangeInternal(rangeOffset, rangeLength);
            } else {
                this.root.removeRangeInternal(rangeOffset, rangeLength);
            }
            this.length -= rangeLength;
        }

        private final int retainOrRemoveAllInternal(int rangeOffset, int rangeLength, Collection<? extends E> elements, boolean retain) {
            BuilderSubList<E> builderSubList = this.parent;
            int iRetainOrRemoveAllInternal = builderSubList != null ? builderSubList.retainOrRemoveAllInternal(rangeOffset, rangeLength, elements, retain) : this.root.retainOrRemoveAllInternal(rangeOffset, rangeLength, elements, retain);
            if (iRetainOrRemoveAllInternal > 0) {
                registerModification();
            }
            this.length -= iRetainOrRemoveAllInternal;
            return iRetainOrRemoveAllInternal;
        }

        @Override // java.util.AbstractList, java.util.List
        @NotNull
        public ListIterator<E> listIterator(int index) {
            checkForComodification();
            p852kotlin.collections.AbstractList.INSTANCE.checkPositionIndex$kotlin_stdlib(index, this.length);
            return new Itr(this, index);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean removeAll(@NotNull Collection<?> elements) {
            Intrinsics.checkNotNullParameter(elements, "elements");
            checkIsMutable();
            checkForComodification();
            return retainOrRemoveAllInternal(this.offset, this.length, elements, false) > 0;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean retainAll(@NotNull Collection<?> elements) {
            Intrinsics.checkNotNullParameter(elements, "elements");
            checkIsMutable();
            checkForComodification();
            return retainOrRemoveAllInternal(this.offset, this.length, elements, true) > 0;
        }

        @Override // java.util.AbstractList, java.util.List
        @NotNull
        public List<E> subList(int fromIndex, int toIndex) {
            p852kotlin.collections.AbstractList.INSTANCE.checkRangeIndexes$kotlin_stdlib(fromIndex, toIndex, this.length);
            return new BuilderSubList(this.backing, this.offset + fromIndex, toIndex - fromIndex, this, this.root);
        }

        private final void addAllInternal(int i11, Collection<? extends E> elements, int n11) {
            registerModification();
            BuilderSubList<E> builderSubList = this.parent;
            if (builderSubList == null) {
                this.root.addAllInternal(i11, elements, n11);
            } else {
                builderSubList.addAllInternal(i11, elements, n11);
            }
            this.backing = (E[]) ((ListBuilder) this.root).backing;
            this.length += n11;
        }

        private final void addAtInternal(int i11, E element) {
            registerModification();
            BuilderSubList<E> builderSubList = this.parent;
            if (builderSubList == null) {
                this.root.addAtInternal(i11, element);
            } else {
                builderSubList.addAtInternal(i11, element);
            }
            this.backing = (E[]) ((ListBuilder) this.root).backing;
            this.length++;
        }

        private final void checkIsMutable() {
            if (!isReadOnly()) {
            } else {
                throw new UnsupportedOperationException();
            }
        }

        private final E removeAtInternal(int i11) {
            E eRemoveAtInternal;
            registerModification();
            BuilderSubList<E> builderSubList = this.parent;
            if (builderSubList == null) {
                eRemoveAtInternal = (E) this.root.removeAtInternal(i11);
            } else {
                eRemoveAtInternal = builderSubList.removeAtInternal(i11);
            }
            this.length--;
            return eRemoveAtInternal;
        }

        private final Object writeReplace() throws NotSerializableException {
            if (isReadOnly()) {
                return new SerializedCollection(this, 0);
            }
            throw new NotSerializableException("The list cannot be serialized while it is being built.");
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public void clear() {
            checkIsMutable();
            checkForComodification();
            removeRangeInternal(this.offset, this.length);
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public boolean equals(@Nullable Object other) {
            checkForComodification();
            if (other != this) {
                if (!(other instanceof List) || !contentEquals((List) other)) {
                    return false;
                }
                return true;
            }
            return true;
        }

        @Override // java.util.AbstractList, java.util.List
        public E get(int index) {
            checkForComodification();
            p852kotlin.collections.AbstractList.INSTANCE.checkElementIndex$kotlin_stdlib(index, this.length);
            return this.backing[this.offset + index];
        }

        @Override // p852kotlin.collections.AbstractMutableList
        public int getSize() {
            checkForComodification();
            return this.length;
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public int hashCode() {
            checkForComodification();
            return ListBuilderKt.subarrayContentHashCode(this.backing, this.offset, this.length);
        }

        @Override // java.util.AbstractList, java.util.List
        public int indexOf(Object element) {
            checkForComodification();
            for (int i11 = 0; i11 < this.length; i11++) {
                if (Intrinsics.areEqual(this.backing[this.offset + i11], element)) {
                    return i11;
                }
            }
            return -1;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean isEmpty() {
            checkForComodification();
            if (this.length == 0) {
                return true;
            }
            return false;
        }

        @Override // java.util.AbstractList, java.util.List
        public int lastIndexOf(Object element) {
            checkForComodification();
            for (int i11 = this.length - 1; i11 >= 0; i11--) {
                if (Intrinsics.areEqual(this.backing[this.offset + i11], element)) {
                    return i11;
                }
            }
            return -1;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean remove(Object element) {
            checkIsMutable();
            checkForComodification();
            int iIndexOf = indexOf(element);
            if (iIndexOf >= 0) {
                removeAt(iIndexOf);
            }
            if (iIndexOf >= 0) {
                return true;
            }
            return false;
        }

        @Override // p852kotlin.collections.AbstractMutableList
        public E removeAt(int index) {
            checkIsMutable();
            checkForComodification();
            p852kotlin.collections.AbstractList.INSTANCE.checkElementIndex$kotlin_stdlib(index, this.length);
            return removeAtInternal(this.offset + index);
        }

        @Override // p852kotlin.collections.AbstractMutableList, java.util.AbstractList, java.util.List
        public E set(int index, E element) {
            checkIsMutable();
            checkForComodification();
            p852kotlin.collections.AbstractList.INSTANCE.checkElementIndex$kotlin_stdlib(index, this.length);
            E[] eArr = this.backing;
            int i11 = this.offset;
            E e11 = eArr[i11 + index];
            eArr[i11 + index] = element;
            return e11;
        }

        @Override // java.util.AbstractCollection
        @NotNull
        public String toString() {
            checkForComodification();
            return ListBuilderKt.subarrayContentToString(this.backing, this.offset, this.length, this);
        }

        @Override // p852kotlin.collections.AbstractMutableList, java.util.AbstractList, java.util.List
        public void add(int index, E element) {
            checkIsMutable();
            checkForComodification();
            p852kotlin.collections.AbstractList.INSTANCE.checkPositionIndex$kotlin_stdlib(index, this.length);
            addAtInternal(this.offset + index, element);
        }

        @Override // java.util.AbstractList, java.util.List
        public boolean addAll(int index, @NotNull Collection<? extends E> elements) {
            Intrinsics.checkNotNullParameter(elements, "elements");
            checkIsMutable();
            checkForComodification();
            p852kotlin.collections.AbstractList.INSTANCE.checkPositionIndex$kotlin_stdlib(index, this.length);
            int size = elements.size();
            addAllInternal(this.offset + index, elements, size);
            return size > 0;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        @NotNull
        public Object[] toArray() {
            checkForComodification();
            E[] eArr = this.backing;
            int i11 = this.offset;
            return ArraysKt.copyOfRange(eArr, i11, this.length + i11);
        }
    }

    /* JADX INFO: compiled from: ListBuilder.kt */
    @Metadata(m90083d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0007"}, m90084d2 = {"Lkotlin/collections/builders/ListBuilder$Companion;", "", "<init>", "()V", "Empty", "Lkotlin/collections/builders/ListBuilder;", "", "kotlin-stdlib"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX INFO: compiled from: ListBuilder.kt */
    @Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010+\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u001d\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u000b\u001a\u00020\fH\u0016J\t\u0010\r\u001a\u00020\fH\u0096\u0002J\b\u0010\u000e\u001a\u00020\u0006H\u0016J\b\u0010\u000f\u001a\u00020\u0006H\u0016J\r\u0010\u0010\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010\u0011J\u000e\u0010\u0012\u001a\u00028\u0001H\u0096\u0002¢\u0006\u0002\u0010\u0011J\u0015\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010\u0016J\u0015\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010\u0016J\b\u0010\u0018\u001a\u00020\u0014H\u0016J\b\u0010\u0019\u001a\u00020\u0014H\u0002R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m90084d2 = {"Lkotlin/collections/builders/ListBuilder$Itr;", ExifInterface.LONGITUDE_EAST, "", "list", "Lkotlin/collections/builders/ListBuilder;", "index", "", "<init>", "(Lkotlin/collections/builders/ListBuilder;I)V", "lastIndex", "expectedModCount", "hasPrevious", "", "hasNext", "previousIndex", "nextIndex", "previous", "()Ljava/lang/Object;", "next", "set", "", "element", "(Ljava/lang/Object;)V", "add", "remove", "checkForComodification", "kotlin-stdlib"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nListBuilder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ListBuilder.kt\nkotlin/collections/builders/ListBuilder$Itr\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,722:1\n1#2:723\n*E\n"})
    public static final class Itr<E> implements ListIterator<E>, KMutableListIterator {
        private int expectedModCount;
        private int index;
        private int lastIndex;

        @NotNull
        private final ListBuilder<E> list;

        public Itr(@NotNull ListBuilder<E> list, int i11) {
            Intrinsics.checkNotNullParameter(list, "list");
            this.list = list;
            this.index = i11;
            this.lastIndex = -1;
            this.expectedModCount = ((AbstractList) list).modCount;
        }

        private final void checkForComodification() {
            if (((AbstractList) this.list).modCount != this.expectedModCount) {
                throw new ConcurrentModificationException();
            }
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.index < ((ListBuilder) this.list).length;
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.index > 0;
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.index;
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.index - 1;
        }

        @Override // java.util.ListIterator
        public void add(E element) {
            checkForComodification();
            ListBuilder<E> listBuilder = this.list;
            int i11 = this.index;
            this.index = i11 + 1;
            listBuilder.add(i11, element);
            this.lastIndex = -1;
            this.expectedModCount = ((AbstractList) this.list).modCount;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public E next() {
            checkForComodification();
            if (this.index < ((ListBuilder) this.list).length) {
                int i11 = this.index;
                this.index = i11 + 1;
                this.lastIndex = i11;
                return (E) ((ListBuilder) this.list).backing[this.lastIndex];
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.ListIterator
        public E previous() {
            checkForComodification();
            int i11 = this.index;
            if (i11 > 0) {
                int i12 = i11 - 1;
                this.index = i12;
                this.lastIndex = i12;
                return (E) ((ListBuilder) this.list).backing[this.lastIndex];
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            checkForComodification();
            int i11 = this.lastIndex;
            if (i11 != -1) {
                this.list.removeAt(i11);
                this.index = this.lastIndex;
                this.lastIndex = -1;
                this.expectedModCount = ((AbstractList) this.list).modCount;
                return;
            }
            throw new IllegalStateException("Call next() or previous() before removing element from the iterator.");
        }

        @Override // java.util.ListIterator
        public void set(E element) {
            checkForComodification();
            int i11 = this.lastIndex;
            if (i11 != -1) {
                this.list.set(i11, element);
                return;
            }
            throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.");
        }
    }

    public ListBuilder() {
        this(0, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int retainOrRemoveAllInternal(int rangeOffset, int rangeLength, Collection<? extends E> elements, boolean retain) {
        int i11 = 0;
        int i12 = 0;
        while (i11 < rangeLength) {
            int i13 = rangeOffset + i11;
            if (elements.contains(this.backing[i13]) == retain) {
                E[] eArr = this.backing;
                i11++;
                eArr[i12 + rangeOffset] = eArr[i13];
                i12++;
            } else {
                i11++;
            }
        }
        int i14 = rangeLength - i12;
        E[] eArr2 = this.backing;
        ArraysKt.copyInto(eArr2, eArr2, rangeOffset + i12, rangeLength + rangeOffset, this.length);
        E[] eArr3 = this.backing;
        int i15 = this.length;
        ListBuilderKt.resetRange(eArr3, i15 - i14, i15);
        if (i14 > 0) {
            registerModification();
        }
        this.length -= i14;
        return i14;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(E element) {
        checkIsMutable();
        addAtInternal(this.length, element);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(@NotNull Collection<? extends E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        checkIsMutable();
        int size = elements.size();
        addAllInternal(this.length, elements, size);
        return size > 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object element) {
        for (int i11 = 0; i11 < this.length; i11++) {
            if (Intrinsics.areEqual(this.backing[i11], element)) {
                return i11;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    @NotNull
    public Iterator<E> iterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.List
    @NotNull
    public ListIterator<E> listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    @NotNull
    public <T> T[] toArray(@NotNull T[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        int length = array.length;
        int i11 = this.length;
        if (length >= i11) {
            ArraysKt.copyInto(this.backing, array, 0, 0, i11);
            return (T[]) CollectionsKt.terminateCollectionToArray(this.length, array);
        }
        T[] tArr = (T[]) Arrays.copyOfRange(this.backing, 0, i11, array.getClass());
        Intrinsics.checkNotNullExpressionValue(tArr, "copyOfRange(...)");
        return tArr;
    }

    static {
        ListBuilder listBuilder = new ListBuilder(0);
        listBuilder.isReadOnly = true;
        Empty = listBuilder;
    }

    public ListBuilder(int i11) {
        this.backing = (E[]) ListBuilderKt.arrayOfUninitializedElements(i11);
    }

    private final void checkIsMutable() {
        if (this.isReadOnly) {
            throw new UnsupportedOperationException();
        }
    }

    private final boolean contentEquals(List<?> other) {
        return ListBuilderKt.subarrayContentEquals(this.backing, 0, this.length, other);
    }

    private final void ensureCapacityInternal(int minCapacity) {
        if (minCapacity < 0) {
            throw new OutOfMemoryError();
        }
        E[] eArr = this.backing;
        if (minCapacity > eArr.length) {
            this.backing = (E[]) ListBuilderKt.copyOfUninitializedElements(this.backing, p852kotlin.collections.AbstractList.INSTANCE.newCapacity$kotlin_stdlib(eArr.length, minCapacity));
        }
    }

    private final void ensureExtraCapacity(int n11) {
        ensureCapacityInternal(this.length + n11);
    }

    private final void registerModification() {
        ((AbstractList) this).modCount++;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void removeRangeInternal(int rangeOffset, int rangeLength) {
        if (rangeLength > 0) {
            registerModification();
        }
        E[] eArr = this.backing;
        ArraysKt.copyInto(eArr, eArr, rangeOffset, rangeOffset + rangeLength, this.length);
        E[] eArr2 = this.backing;
        int i11 = this.length;
        ListBuilderKt.resetRange(eArr2, i11 - rangeLength, i11);
        this.length -= rangeLength;
    }

    private final Object writeReplace() throws NotSerializableException {
        if (this.isReadOnly) {
            return new SerializedCollection(this, 0);
        }
        throw new NotSerializableException("The list cannot be serialized while it is being built.");
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(@Nullable Object other) {
        if (other != this) {
            return (other instanceof List) && contentEquals((List) other);
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public E get(int index) {
        p852kotlin.collections.AbstractList.INSTANCE.checkElementIndex$kotlin_stdlib(index, this.length);
        return this.backing[index];
    }

    @Override // p852kotlin.collections.AbstractMutableList
    public int getSize() {
        return this.length;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        return ListBuilderKt.subarrayContentHashCode(this.backing, 0, this.length);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
        return this.length == 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public int lastIndexOf(Object element) {
        for (int i11 = this.length - 1; i11 >= 0; i11--) {
            if (Intrinsics.areEqual(this.backing[i11], element)) {
                return i11;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    @NotNull
    public ListIterator<E> listIterator(int index) {
        p852kotlin.collections.AbstractList.INSTANCE.checkPositionIndex$kotlin_stdlib(index, this.length);
        return new Itr(this, index);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean removeAll(@NotNull Collection<?> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        checkIsMutable();
        return retainOrRemoveAllInternal(0, this.length, elements, false) > 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean retainAll(@NotNull Collection<?> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        checkIsMutable();
        return retainOrRemoveAllInternal(0, this.length, elements, true) > 0;
    }

    @Override // java.util.AbstractList, java.util.List
    @NotNull
    public List<E> subList(int fromIndex, int toIndex) {
        p852kotlin.collections.AbstractList.INSTANCE.checkRangeIndexes$kotlin_stdlib(fromIndex, toIndex, this.length);
        return new BuilderSubList(this.backing, fromIndex, toIndex - fromIndex, null, this);
    }

    @Override // java.util.AbstractCollection
    @NotNull
    public String toString() {
        return ListBuilderKt.subarrayContentToString(this.backing, 0, this.length, this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void addAllInternal(int i11, Collection<? extends E> elements, int n11) {
        registerModification();
        insertAtInternal(i11, n11);
        Iterator<? extends E> it = elements.iterator();
        for (int i12 = 0; i12 < n11; i12++) {
            this.backing[i11 + i12] = it.next();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void addAtInternal(int i11, E element) {
        registerModification();
        insertAtInternal(i11, 1);
        this.backing[i11] = element;
    }

    private final void insertAtInternal(int i11, int n11) {
        ensureExtraCapacity(n11);
        E[] eArr = this.backing;
        ArraysKt.copyInto(eArr, eArr, i11 + n11, i11, this.length);
        this.length += n11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final E removeAtInternal(int i11) {
        registerModification();
        E[] eArr = this.backing;
        E e11 = eArr[i11];
        ArraysKt.copyInto(eArr, eArr, i11, i11 + 1, this.length);
        ListBuilderKt.resetAt(this.backing, this.length - 1);
        this.length--;
        return e11;
    }

    @Override // p852kotlin.collections.AbstractMutableList, java.util.AbstractList, java.util.List
    public void add(int index, E element) {
        checkIsMutable();
        p852kotlin.collections.AbstractList.INSTANCE.checkPositionIndex$kotlin_stdlib(index, this.length);
        addAtInternal(index, element);
    }

    @NotNull
    public final List<E> build() {
        checkIsMutable();
        this.isReadOnly = true;
        if (this.length > 0) {
            return this;
        }
        return Empty;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        checkIsMutable();
        removeRangeInternal(0, this.length);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object element) {
        checkIsMutable();
        int iIndexOf = indexOf(element);
        if (iIndexOf >= 0) {
            removeAt(iIndexOf);
        }
        if (iIndexOf >= 0) {
            return true;
        }
        return false;
    }

    @Override // p852kotlin.collections.AbstractMutableList
    public E removeAt(int index) {
        checkIsMutable();
        p852kotlin.collections.AbstractList.INSTANCE.checkElementIndex$kotlin_stdlib(index, this.length);
        return removeAtInternal(index);
    }

    @Override // p852kotlin.collections.AbstractMutableList, java.util.AbstractList, java.util.List
    public E set(int index, E element) {
        checkIsMutable();
        p852kotlin.collections.AbstractList.INSTANCE.checkElementIndex$kotlin_stdlib(index, this.length);
        E[] eArr = this.backing;
        E e11 = eArr[index];
        eArr[index] = element;
        return e11;
    }

    public /* synthetic */ ListBuilder(int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? 10 : i11);
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int index, @NotNull Collection<? extends E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        checkIsMutable();
        p852kotlin.collections.AbstractList.INSTANCE.checkPositionIndex$kotlin_stdlib(index, this.length);
        int size = elements.size();
        addAllInternal(index, elements, size);
        return size > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    @NotNull
    public Object[] toArray() {
        return ArraysKt.copyOfRange(this.backing, 0, this.length);
    }
}
