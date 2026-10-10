package p852kotlin.collections.unsigned;

import java.util.RandomAccess;
import p852kotlin.Metadata;
import p852kotlin.UInt;
import p852kotlin.UIntArray;
import p852kotlin.collections.AbstractList;
import p852kotlin.collections.ArraysKt;

/* JADX INFO: compiled from: _UArraysJvm.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00060\u0003j\u0002`\u0004J\b\u0010\t\u001a\u00020\nH\u0016J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u0006H\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0014\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0016\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\u0017"}, m90084d2 = {"kotlin/collections/unsigned/UArraysKt___UArraysJvmKt$asList$1", "Lkotlin/collections/AbstractList;", "Lkotlin/UInt;", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "size", "", "getSize", "()I", "isEmpty", "", "contains", "element", "contains-WZ4Q5Ns", "(I)Z", "get", "index", "get-pVg5ArA", "(I)I", "indexOf", "indexOf-WZ4Q5Ns", "lastIndexOf", "lastIndexOf-WZ4Q5Ns", "kotlin-stdlib"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class UArraysKt___UArraysJvmKt$asList$1 extends AbstractList<UInt> implements RandomAccess {
    final /* synthetic */ int[] $this_asList;

    public UArraysKt___UArraysJvmKt$asList$1(int[] iArr) {
        this.$this_asList = iArr;
    }

    @Override // p852kotlin.collections.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof UInt) {
            return m104352containsWZ4Q5Ns(((UInt) obj).getData());
        }
        return false;
    }

    /* JADX INFO: renamed from: contains-WZ4Q5Ns, reason: not valid java name */
    public boolean m104352containsWZ4Q5Ns(int element) {
        return UIntArray.m103995containsWZ4Q5Ns(this.$this_asList, element);
    }

    /* JADX INFO: renamed from: get-pVg5ArA, reason: not valid java name */
    public int m104353getpVg5ArA(int index) {
        return UIntArray.m103999getpVg5ArA(this.$this_asList, index);
    }

    @Override // p852kotlin.collections.AbstractList, p852kotlin.collections.AbstractCollection
    public int getSize() {
        return UIntArray.m104000getSizeimpl(this.$this_asList);
    }

    @Override // p852kotlin.collections.AbstractList, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof UInt) {
            return m104354indexOfWZ4Q5Ns(((UInt) obj).getData());
        }
        return -1;
    }

    /* JADX INFO: renamed from: indexOf-WZ4Q5Ns, reason: not valid java name */
    public int m104354indexOfWZ4Q5Ns(int element) {
        return ArraysKt.indexOf(this.$this_asList, element);
    }

    @Override // p852kotlin.collections.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        return UIntArray.m104002isEmptyimpl(this.$this_asList);
    }

    @Override // p852kotlin.collections.AbstractList, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof UInt) {
            return m104355lastIndexOfWZ4Q5Ns(((UInt) obj).getData());
        }
        return -1;
    }

    /* JADX INFO: renamed from: lastIndexOf-WZ4Q5Ns, reason: not valid java name */
    public int m104355lastIndexOfWZ4Q5Ns(int element) {
        return ArraysKt.lastIndexOf(this.$this_asList, element);
    }

    @Override // p852kotlin.collections.AbstractList, java.util.List
    public /* bridge */ /* synthetic */ Object get(int i11) {
        return UInt.m103933boximpl(m104353getpVg5ArA(i11));
    }
}
