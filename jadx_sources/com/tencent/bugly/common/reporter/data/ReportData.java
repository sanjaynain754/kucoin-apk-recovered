package com.tencent.bugly.common.reporter.data;

import android.text.TextUtils;
import com.tencent.bugly.common.utils.FileUtil;
import com.tencent.bugly.proguard.C33591ch;
import com.tencent.bugly.proguard.C33778lf;
import com.tencent.bugly.proguard.C33820nf;
import com.tencent.bugly.proguard.C33928t0;
import com.tencent.rmonitor.base.p144db.table.ReportDataTable;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.sequences.SequencesKt;
import p852kotlin.text.StringsKt;

/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u0016\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u0019¢\u0006\u0004\bM\u0010NJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0006\u0010\u0004\u001a\u00020\u0002J\u0006\u0010\u0005\u001a\u00020\u0002J\u001e\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007J\b\u0010\r\u001a\u0004\u0018\u00010\fJ\u000e\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\fJ\u0006\u0010\u0010\u001a\u00020\u0002J\u000e\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0007J\u0006\u0010\u0013\u001a\u00020\u0007J\b\u0010\u0014\u001a\u00020\u0002H\u0016J\t\u0010\u0015\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0016HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0002HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0019HÆ\u0003J1\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u001b\u001a\u00020\u00022\b\b\u0002\u0010\u001c\u001a\u00020\u00162\b\b\u0002\u0010\u001d\u001a\u00020\u00022\b\b\u0002\u0010\u001e\u001a\u00020\u0019HÆ\u0001J\t\u0010 \u001a\u00020\u0016HÖ\u0001J\u0013\u0010#\u001a\u00020\u00072\b\u0010\"\u001a\u0004\u0018\u00010!HÖ\u0003R\"\u0010\u001b\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\"\u0010\u001c\u001a\u00020\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\"\u0010\u001d\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010$\u001a\u0004\b.\u0010&\"\u0004\b/\u0010(R\"\u0010\u001e\u001a\u00020\u00198\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\"\u00105\u001a\u00020\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b5\u0010)\u001a\u0004\b6\u0010+\"\u0004\b7\u0010-R'\u0010;\u001a\u0012\u0012\u0004\u0012\u00020908j\b\u0012\u0004\u0012\u000209`:8\u0006¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>R\u0017\u0010@\u001a\u00020?8\u0006¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\bB\u0010CR\"\u0010D\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bD\u0010E\u001a\u0004\bF\u0010G\"\u0004\bH\u0010IR\u0018\u0010J\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010KR\u0016\u0010L\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010$¨\u0006O"}, m90084d2 = {"Lcom/tencent/bugly/common/reporter/data/ReportData;", "Lcom/tencent/bugly/common/reporter/data/BaseJsonObject;", "", "zipUploadFile", "getPluginName", "getClientIdentify", "filePath", "", "delWhenSuccess", "delWhenFail", "", "addFile", "Lcom/tencent/bugly/proguard/t0;", "getAttachment", "attachment", "updateAttachment", "getUploadFilePath", "isSuccess", "checkAndDelFiles", "isCurLaunchData", "toString", "component1", "", "component2", "component3", "Lorg/json/JSONObject;", "component4", "uin", "reportType", "eventName", ReportDataTable.COLUMN_PARAMS, "copy", "hashCode", "", "other", "equals", "Ljava/lang/String;", "getUin", "()Ljava/lang/String;", "setUin", "(Ljava/lang/String;)V", "I", "getReportType", "()I", "setReportType", "(I)V", "getEventName", "setEventName", "Lorg/json/JSONObject;", "getParams", "()Lorg/json/JSONObject;", "setParams", "(Lorg/json/JSONObject;)V", "dbId", "getDbId", "setDbId", "Ljava/util/ArrayList;", "Lcom/tencent/bugly/common/reporter/data/FileInfo;", "Lkotlin/collections/ArrayList;", "fileList", "Ljava/util/ArrayList;", "getFileList", "()Ljava/util/ArrayList;", "Lcom/tencent/bugly/common/reporter/data/ReportStrategy;", "reportStrategy", "Lcom/tencent/bugly/common/reporter/data/ReportStrategy;", "getReportStrategy", "()Lcom/tencent/bugly/common/reporter/data/ReportStrategy;", "shouldRecordLinkData", "Z", "getShouldRecordLinkData", "()Z", "setShouldRecordLinkData", "(Z)V", "attachmentInfo", "Lcom/tencent/bugly/proguard/t0;", "uploadFilePath", "<init>", "(Ljava/lang/String;ILjava/lang/String;Lorg/json/JSONObject;)V", "bugly-pro_release"}, m90085k = 1, m90086mv = {1, 6, 0})
public final /* data */ class ReportData extends BaseJsonObject {

    @Nullable
    private C33928t0 attachmentInfo;
    private int dbId;

    @NotNull
    private String eventName;

    @NotNull
    private final ArrayList<FileInfo> fileList;

    @NotNull
    private JSONObject params;

    @NotNull
    private final ReportStrategy reportStrategy;
    private int reportType;
    private boolean shouldRecordLinkData;

    @NotNull
    private String uin;

    @NotNull
    private String uploadFilePath;

    public ReportData() {
        this(null, 0, null, null, 15, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReportData)) {
            return false;
        }
        ReportData reportData = (ReportData) other;
        return Intrinsics.areEqual(this.uin, reportData.uin) && this.reportType == reportData.reportType && Intrinsics.areEqual(this.eventName, reportData.eventName) && Intrinsics.areEqual(this.params, reportData.params);
    }

    public /* synthetic */ ReportData(String str, int i11, String str2, JSONObject jSONObject, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? "10000" : str, (i12 & 2) != 0 ? 1 : i11, (i12 & 4) != 0 ? "" : str2, (i12 & 8) != 0 ? new JSONObject() : jSONObject);
    }

    public static /* synthetic */ ReportData copy$default(ReportData reportData, String str, int i11, String str2, JSONObject jSONObject, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = reportData.uin;
        }
        if ((i12 & 2) != 0) {
            i11 = reportData.reportType;
        }
        if ((i12 & 4) != 0) {
            str2 = reportData.eventName;
        }
        if ((i12 & 8) != 0) {
            jSONObject = reportData.params;
        }
        return reportData.copy(str, i11, str2, jSONObject);
    }

    private final String zipUploadFile() {
        FileUtil.Companion companion = FileUtil.INSTANCE;
        File file = new File(companion.getTempPath(), FileUtil.Companion.makeTempFileName$default(companion, null, null, 3, null));
        List<String> list = SequencesKt.toList(SequencesKt.map(CollectionsKt.asSequence(this.fileList), new Function1<FileInfo, String>() { // from class: com.tencent.bugly.common.reporter.data.ReportData$zipUploadFile$allFiles$1
            @Override // p852kotlin.jvm.functions.Function1
            @NotNull
            public final String invoke(@NotNull FileInfo it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return it.getFilePath();
            }
        }));
        String absolutePath = file.getAbsolutePath();
        Intrinsics.checkNotNullExpressionValue(absolutePath, "temp.absolutePath");
        if (!companion.zipFiles(list, absolutePath, false)) {
            companion.deleteFile(file);
            return "";
        }
        String absolutePath2 = file.getAbsolutePath();
        Intrinsics.checkNotNullExpressionValue(absolutePath2, "{\n            temp.absolutePath\n        }");
        return absolutePath2;
    }

    public final void addFile(@NotNull String filePath, boolean delWhenSuccess, boolean delWhenFail) throws IllegalStateException {
        List<String> filesInDir;
        Intrinsics.checkNotNullParameter(filePath, "filePath");
        if (this.uploadFilePath.length() > 0) {
            throw new IllegalStateException(C33778lf.m73987a("can not add file[", filePath, "] after call getUploadFilePath"));
        }
        File file = new File(filePath);
        if (filePath.length() != 0 && file.exists()) {
            if (file.isFile()) {
                this.fileList.add(new FileInfo(filePath, delWhenSuccess, delWhenFail));
            } else {
                if (!file.isDirectory() || (filesInDir = FileUtil.INSTANCE.getFilesInDir(filePath)) == null) {
                    return;
                }
                Iterator<T> it = filesInDir.iterator();
                while (it.hasNext()) {
                    this.fileList.add(new FileInfo((String) it.next(), delWhenSuccess, delWhenFail));
                }
            }
        }
    }

    public final void checkAndDelFiles(boolean isSuccess) {
        if (this.fileList.size() > 1 && this.uploadFilePath.length() > 0) {
            FileUtil.INSTANCE.deleteFile(new File(this.uploadFilePath));
        }
        int size = this.fileList.size();
        for (int i11 = 0; i11 < size; i11++) {
            FileInfo fileInfo = this.fileList.get(i11);
            Intrinsics.checkNotNullExpressionValue(fileInfo, "fileList[i]");
            FileInfo fileInfo2 = fileInfo;
            if (isSuccess && fileInfo2.getDelWhenSuccess()) {
                FileUtil.INSTANCE.deleteFile(new File(fileInfo2.getFilePath()));
            } else if (!isSuccess && fileInfo2.getDelWhenFail()) {
                FileUtil.INSTANCE.deleteFile(new File(fileInfo2.getFilePath()));
            }
        }
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getUin() {
        return this.uin;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getReportType() {
        return this.reportType;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getEventName() {
        return this.eventName;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final JSONObject getParams() {
        return this.params;
    }

    @Nullable
    /* JADX INFO: renamed from: getAttachment, reason: from getter */
    public final C33928t0 getAttachmentInfo() {
        return this.attachmentInfo;
    }

    @NotNull
    public final String getClientIdentify() {
        String strM74307b = C33820nf.m74307b(this.params);
        Intrinsics.checkNotNullExpressionValue(strM74307b, "getClientIdentifyFromParam(params)");
        return strM74307b;
    }

    public final int getDbId() {
        return this.dbId;
    }

    @NotNull
    public final String getEventName() {
        return this.eventName;
    }

    @NotNull
    public final ArrayList<FileInfo> getFileList() {
        return this.fileList;
    }

    @NotNull
    public final JSONObject getParams() {
        return this.params;
    }

    @NotNull
    public final String getPluginName() {
        String strM74311e = C33820nf.m74311e(this.params);
        Intrinsics.checkNotNullExpressionValue(strM74311e, "getPluginNameFromParam(params)");
        return strM74311e;
    }

    @NotNull
    public final ReportStrategy getReportStrategy() {
        return this.reportStrategy;
    }

    public final int getReportType() {
        return this.reportType;
    }

    public final boolean getShouldRecordLinkData() {
        return this.shouldRecordLinkData;
    }

    @NotNull
    public final String getUin() {
        return this.uin;
    }

    @NotNull
    public final String getUploadFilePath() {
        String filePath;
        if (this.uploadFilePath.length() > 0) {
            return this.uploadFilePath;
        }
        if (this.fileList.isEmpty()) {
            filePath = "";
        } else {
            filePath = (this.reportType == 1 && this.fileList.size() == 1 && StringsKt.endsWith$default(this.fileList.get(0).getFilePath(), ".zip", false, 2, (Object) null)) ? this.fileList.get(0).getFilePath() : zipUploadFile();
        }
        this.uploadFilePath = filePath;
        return filePath;
    }

    public int hashCode() {
        return this.params.hashCode() + ((this.eventName.hashCode() + ((Integer.hashCode(this.reportType) + (this.uin.hashCode() * 31)) * 31)) * 31);
    }

    public final void setDbId(int i11) {
        this.dbId = i11;
    }

    public final void setEventName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.eventName = str;
    }

    public final void setParams(@NotNull JSONObject jSONObject) {
        Intrinsics.checkNotNullParameter(jSONObject, "<set-?>");
        this.params = jSONObject;
    }

    public final void setReportType(int i11) {
        this.reportType = i11;
    }

    public final void setShouldRecordLinkData(boolean z11) {
        this.shouldRecordLinkData = z11;
    }

    public final void setUin(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.uin = str;
    }

    @NotNull
    public String toString() {
        return "ReportData(pluginName='" + getPluginName() + "', clientIdentify='" + getClientIdentify() + "', dbId=" + this.dbId + ", uploadStrategy=" + this.reportStrategy.getUploadStrategy() + ')';
    }

    public final void updateAttachment(@NotNull C33928t0 attachment) {
        Intrinsics.checkNotNullParameter(attachment, "attachment");
        this.attachmentInfo = attachment;
    }

    @NotNull
    public final ReportData copy(@NotNull String uin, int reportType, @NotNull String eventName, @NotNull JSONObject params) {
        Intrinsics.checkNotNullParameter(uin, "uin");
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        Intrinsics.checkNotNullParameter(params, "params");
        return new ReportData(uin, reportType, eventName, params);
    }

    public final boolean isCurLaunchData() {
        return TextUtils.equals(C33591ch.m72746d(), C33820nf.m74312f(this.params));
    }

    public ReportData(@NotNull String uin, int i11, @NotNull String eventName, @NotNull JSONObject params) {
        Intrinsics.checkNotNullParameter(uin, "uin");
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        Intrinsics.checkNotNullParameter(params, "params");
        this.uin = uin;
        this.reportType = i11;
        this.eventName = eventName;
        this.params = params;
        this.fileList = new ArrayList<>();
        this.reportStrategy = new ReportStrategy();
        this.uploadFilePath = "";
    }
}
