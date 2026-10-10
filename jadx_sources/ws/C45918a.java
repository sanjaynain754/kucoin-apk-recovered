package ws;

import java.util.List;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: ws.a */
/* JADX INFO: compiled from: NewUserStatusInfoEntity.kt */
/* JADX INFO: loaded from: classes32.dex */
@Metadata(m90083d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\u0002\u001a*\u0010\u0000\u001a\u00020\u00012\u0010\u0010\u0002\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u00032\u0010\u0010\u0005\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0003¨\u0006\u0006"}, m90084d2 = {"isListChanged", "", "listA", "", "", "listB", "OperationLib_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nNewUserStatusInfoEntity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NewUserStatusInfoEntity.kt\ncom/kubi/operation/lib/entity/NewUserStatusInfoEntityKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,90:1\n1878#2,3:91\n*S KotlinDebug\n*F\n+ 1 NewUserStatusInfoEntity.kt\ncom/kubi/operation/lib/entity/NewUserStatusInfoEntityKt\n*L\n86#1:91,3\n*E\n"})
public final class C45918a {
    /* JADX INFO: renamed from: a */
    public static final boolean m101369a(@Nullable List<? extends Object> list, @Nullable List<? extends Object> list2) {
        Integer numValueOf;
        Integer numValueOf2;
        Object orNull;
        if (Intrinsics.areEqual(list, list2)) {
            return false;
        }
        if (list != null) {
            numValueOf = Integer.valueOf(list.size());
        } else {
            numValueOf = null;
        }
        if (list2 != null) {
            numValueOf2 = Integer.valueOf(list2.size());
        } else {
            numValueOf2 = null;
        }
        if (!Intrinsics.areEqual(numValueOf, numValueOf2)) {
            return true;
        }
        if (list != null) {
            int i11 = 0;
            for (Object obj : list) {
                int i12 = i11 + 1;
                if (i11 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                if (list2 != null) {
                    orNull = CollectionsKt.getOrNull(list2, i11);
                } else {
                    orNull = null;
                }
                if (!Intrinsics.areEqual(orNull, obj)) {
                    return true;
                }
                i11 = i12;
            }
        }
        return false;
    }
}
