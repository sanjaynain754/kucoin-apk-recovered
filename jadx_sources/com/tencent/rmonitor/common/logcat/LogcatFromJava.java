package com.tencent.rmonitor.common.logcat;

import com.tencent.bugly.proguard.C33556b3;
import com.tencent.rmonitor.common.util.FileUtil;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\n\u0010\u000b\u001a\u0004\u0018\u00010\u0005H\u0016J\u001d\u0010\f\u001a\u00020\r2\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004H\u0016¢\u0006\u0002\u0010\tR\"\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\n\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\u000f"}, m90084d2 = {"Lcom/tencent/rmonitor/common/logcat/LogcatFromJava;", "Lcom/tencent/rmonitor/common/logcat/ILogcat;", "()V", "logcatArguments", "", "", "getLogcatArguments", "()[Ljava/lang/String;", "setLogcatArguments", "([Ljava/lang/String;)V", "[Ljava/lang/String;", "getLogcatFile", "setArgs", "", "args", "bugly-pro_release"}, m90085k = 1, m90086mv = {1, 6, 0}, m90088xi = 48)
public final class LogcatFromJava implements ILogcat {

    @NotNull
    private String[] logcatArguments = {"-t", C33556b3.f68995S, "-v", "threadtime"};

    @NotNull
    public final String[] getLogcatArguments() {
        return this.logcatArguments;
    }

    @Override // com.tencent.rmonitor.common.logcat.ILogcat
    @Nullable
    public String getLogcatFile() throws IOException {
        ArrayList arrayList = new ArrayList();
        arrayList.add("logcat");
        CollectionsKt.addAll(arrayList, this.logcatArguments);
        StringBuilder sb2 = new StringBuilder();
        FileUtil.Companion companion = FileUtil.INSTANCE;
        sb2.append(companion.getRootPath());
        sb2.append("/logcat/log_");
        sb2.append(System.currentTimeMillis());
        sb2.append(".txt");
        File file = new File(sb2.toString());
        Process processStart = new ProcessBuilder(new String[0]).command(arrayList).redirectErrorStream(true).start();
        String absolutePath = file.getAbsolutePath();
        InputStream inputStream = processStart.getInputStream();
        Intrinsics.checkNotNullExpressionValue(inputStream, "process.inputStream");
        companion.writeFile(absolutePath, companion.readStream(inputStream, 8196), false);
        processStart.destroy();
        return file.getAbsolutePath();
    }

    @Override // com.tencent.rmonitor.common.logcat.ILogcat
    public void setArgs(@Nullable String[] args) {
        if (args == null) {
            args = new String[0];
        }
        this.logcatArguments = args;
    }

    public final void setLogcatArguments(@NotNull String[] strArr) {
        Intrinsics.checkNotNullParameter(strArr, "<set-?>");
        this.logcatArguments = strArr;
    }
}
