package androidx.work.impl.utils;

import androidx.sqlite.p023db.SimpleSQLiteQuery;
import androidx.sqlite.p023db.SupportSQLiteQuery;
import androidx.work.WorkInfo;
import androidx.work.WorkQuery;
import androidx.work.impl.model.WorkTypeConverters;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.JvmName;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: RawQueries.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u001c\u0010\u0000\u001a\u00020\u00012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002\u001a\n\u0010\u0007\u001a\u00020\b*\u00020\t¨\u0006\n"}, m90084d2 = {"bindings", "", "builder", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "count", "", "toRawQuery", "Landroidx/sqlite/db/SupportSQLiteQuery;", "Landroidx/work/WorkQuery;", "work-runtime_release"}, m90085k = 2, m90086mv = {1, 7, 1}, m90088xi = 48)
@JvmName(name = "RawQueries")
public final class RawQueries {
    private static final void bindings(StringBuilder sb2, int i11) {
        if (i11 <= 0) {
            return;
        }
        ArrayList arrayList = new ArrayList(i11);
        for (int i12 = 0; i12 < i11; i12++) {
            arrayList.add("?");
        }
        sb2.append(CollectionsKt.joinToString$default(arrayList, ",", null, null, 0, null, null, 62, null));
    }

    @NotNull
    public static final SupportSQLiteQuery toRawQuery(@NotNull WorkQuery workQuery) {
        Intrinsics.checkNotNullParameter(workQuery, "<this>");
        ArrayList arrayList = new ArrayList();
        StringBuilder sb2 = new StringBuilder("SELECT * FROM workspec");
        List<WorkInfo.State> states = workQuery.getStates();
        Intrinsics.checkNotNullExpressionValue(states, "states");
        String str = " AND";
        String str2 = " WHERE";
        if (!states.isEmpty()) {
            List<WorkInfo.State> states2 = workQuery.getStates();
            Intrinsics.checkNotNullExpressionValue(states2, "states");
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(states2, 10));
            for (WorkInfo.State state : states2) {
                Intrinsics.checkNotNull(state);
                arrayList2.add(Integer.valueOf(WorkTypeConverters.stateToInt(state)));
            }
            sb2.append(" WHERE state IN (");
            bindings(sb2, arrayList2.size());
            sb2.append(")");
            arrayList.addAll(arrayList2);
            str2 = " AND";
        }
        List<UUID> ids = workQuery.getIds();
        Intrinsics.checkNotNullExpressionValue(ids, "ids");
        if (!ids.isEmpty()) {
            List<UUID> ids2 = workQuery.getIds();
            Intrinsics.checkNotNullExpressionValue(ids2, "ids");
            ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(ids2, 10));
            Iterator<T> it = ids2.iterator();
            while (it.hasNext()) {
                arrayList3.add(((UUID) it.next()).toString());
            }
            sb2.append(str2 + " id IN (");
            bindings(sb2, workQuery.getIds().size());
            sb2.append(")");
            arrayList.addAll(arrayList3);
            str2 = " AND";
        }
        List<String> tags = workQuery.getTags();
        Intrinsics.checkNotNullExpressionValue(tags, "tags");
        if (tags.isEmpty()) {
            str = str2;
        } else {
            sb2.append(str2 + " id IN (SELECT work_spec_id FROM worktag WHERE tag IN (");
            bindings(sb2, workQuery.getTags().size());
            sb2.append("))");
            List<String> tags2 = workQuery.getTags();
            Intrinsics.checkNotNullExpressionValue(tags2, "tags");
            arrayList.addAll(tags2);
        }
        List<String> uniqueWorkNames = workQuery.getUniqueWorkNames();
        Intrinsics.checkNotNullExpressionValue(uniqueWorkNames, "uniqueWorkNames");
        if (!uniqueWorkNames.isEmpty()) {
            sb2.append(str + " id IN (SELECT work_spec_id FROM workname WHERE name IN (");
            bindings(sb2, workQuery.getUniqueWorkNames().size());
            sb2.append("))");
            List<String> uniqueWorkNames2 = workQuery.getUniqueWorkNames();
            Intrinsics.checkNotNullExpressionValue(uniqueWorkNames2, "uniqueWorkNames");
            arrayList.addAll(uniqueWorkNames2);
        }
        sb2.append(";");
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "builder.toString()");
        return new SimpleSQLiteQuery(string, arrayList.toArray(new Object[0]));
    }
}
