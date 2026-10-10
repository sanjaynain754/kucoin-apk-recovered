package androidx.datastore.preferences.protobuf;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
final class ListFieldSchemaLite implements ListFieldSchema {
    public static <E> Internal.ProtobufList<E> getProtobufList(Object obj, long j11) {
        return (Internal.ProtobufList) UnsafeUtil.getObject(obj, j11);
    }

    @Override // androidx.datastore.preferences.protobuf.ListFieldSchema
    public void makeImmutableListAt(Object obj, long j11) {
        getProtobufList(obj, j11).makeImmutable();
    }

    @Override // androidx.datastore.preferences.protobuf.ListFieldSchema
    public <E> void mergeListsAt(Object obj, Object obj2, long j11) {
        Internal.ProtobufList protobufList = getProtobufList(obj, j11);
        Internal.ProtobufList protobufList2 = getProtobufList(obj2, j11);
        int size = protobufList.size();
        int size2 = protobufList2.size();
        if (size > 0 && size2 > 0) {
            if (!protobufList.isModifiable()) {
                protobufList = protobufList.mutableCopyWithCapacity2(size2 + size);
            }
            protobufList.addAll(protobufList2);
        }
        if (size > 0) {
            protobufList2 = protobufList;
        }
        UnsafeUtil.putObject(obj, j11, protobufList2);
    }

    @Override // androidx.datastore.preferences.protobuf.ListFieldSchema
    public <L> List<L> mutableListAt(Object obj, long j11) {
        int i11;
        Internal.ProtobufList protobufList = getProtobufList(obj, j11);
        if (!protobufList.isModifiable()) {
            int size = protobufList.size();
            if (size == 0) {
                i11 = 10;
            } else {
                i11 = size * 2;
            }
            Internal.ProtobufList protobufListMutableCopyWithCapacity2 = protobufList.mutableCopyWithCapacity2(i11);
            UnsafeUtil.putObject(obj, j11, protobufListMutableCopyWithCapacity2);
            return protobufListMutableCopyWithCapacity2;
        }
        return protobufList;
    }
}
