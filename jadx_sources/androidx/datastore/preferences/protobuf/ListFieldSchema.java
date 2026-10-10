package androidx.datastore.preferences.protobuf;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@CheckReturnValue
interface ListFieldSchema {
    void makeImmutableListAt(Object obj, long j11);

    <L> void mergeListsAt(Object obj, Object obj2, long j11);

    <L> List<L> mutableListAt(Object obj, long j11);
}
