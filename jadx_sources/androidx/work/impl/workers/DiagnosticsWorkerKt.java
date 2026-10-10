package androidx.work.impl.workers;

import androidx.work.Logger;
import androidx.work.impl.model.SystemIdInfo;
import androidx.work.impl.model.SystemIdInfoDao;
import androidx.work.impl.model.WorkNameDao;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.model.WorkSpecKt;
import androidx.work.impl.model.WorkTagDao;
import com.tencent.bugly.proguard.C33616e0;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: DiagnosticsWorker.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u00002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\u001a/\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00012\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\u0001H\u0002¢\u0006\u0002\u0010\t\u001a.\u0010\n\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u0012H\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, m90084d2 = {"TAG", "", "workSpecRow", "workSpec", "Landroidx/work/impl/model/WorkSpec;", "name", "systemId", "", C33616e0.f69644s, "(Landroidx/work/impl/model/WorkSpec;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)Ljava/lang/String;", "workSpecRows", "workNameDao", "Landroidx/work/impl/model/WorkNameDao;", "workTagDao", "Landroidx/work/impl/model/WorkTagDao;", "systemIdInfoDao", "Landroidx/work/impl/model/SystemIdInfoDao;", "workSpecs", "", "work-runtime_release"}, m90085k = 2, m90086mv = {1, 7, 1}, m90088xi = 48)
public final class DiagnosticsWorkerKt {

    @NotNull
    private static final String TAG;

    static {
        String strTagWithPrefix = Logger.tagWithPrefix("DiagnosticsWrkr");
        Intrinsics.checkNotNullExpressionValue(strTagWithPrefix, "tagWithPrefix(\"DiagnosticsWrkr\")");
        TAG = strTagWithPrefix;
    }

    private static final String workSpecRow(WorkSpec workSpec, String str, Integer num, String str2) {
        return '\n' + workSpec.id + "\t " + workSpec.workerClassName + "\t " + num + "\t " + workSpec.state.name() + "\t " + str + "\t " + str2 + '\t';
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String workSpecRows(WorkNameDao workNameDao, WorkTagDao workTagDao, SystemIdInfoDao systemIdInfoDao, List<WorkSpec> list) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("\n Id \t Class Name\t Job Id\t State\t Unique Name\t Tags\t");
        for (WorkSpec workSpec : list) {
            SystemIdInfo systemIdInfo = systemIdInfoDao.getSystemIdInfo(WorkSpecKt.generationalId(workSpec));
            sb2.append(workSpecRow(workSpec, CollectionsKt.joinToString$default(workNameDao.getNamesForWorkSpecId(workSpec.id), ",", null, null, 0, null, null, 62, null), systemIdInfo != null ? Integer.valueOf(systemIdInfo.systemId) : null, CollectionsKt.joinToString$default(workTagDao.getTagsForWorkSpecId(workSpec.id), ",", null, null, 0, null, null, 62, null)));
        }
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }
}
