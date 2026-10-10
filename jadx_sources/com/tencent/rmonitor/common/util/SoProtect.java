package com.tencent.rmonitor.common.util;

import android.app.Application;
import com.tencent.rmonitor.base.meta.BaseInfo;
import java.io.File;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, m90084d2 = {"Lcom/tencent/rmonitor/common/util/SoProtect;", "", "()V", "Companion", "bugly-pro_release"}, m90085k = 1, m90086mv = {1, 6, 0}, m90088xi = 48)
public final class SoProtect {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(0 == true ? 1 : 0);

    @Nullable
    private static final File soCrashFile;

    /* JADX INFO: compiled from: BUGLY */
    @Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0005\u001a\u00020\u0006H\u0007J\b\u0010\u0007\u001a\u00020\bH\u0007R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, m90084d2 = {"Lcom/tencent/rmonitor/common/util/SoProtect$Companion;", "", "()V", "soCrashFile", "Ljava/io/File;", "createRestrictFile", "", "hasApmSoCrash", "", "bugly-pro_release"}, m90085k = 1, m90086mv = {1, 6, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final void createRestrictFile() {
            File file = SoProtect.soCrashFile;
            if (file != null) {
                FileUtil.INSTANCE.writeFile(file.getAbsolutePath(), "", false);
            }
        }

        @JvmStatic
        public final boolean hasApmSoCrash() {
            File file = SoProtect.soCrashFile;
            if (file != null) {
                return file.exists();
            }
            return false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Application application = BaseInfo.app;
        soCrashFile = application != null ? new File(application.getDir("apmcrash", 0).getAbsolutePath(), "so_crash.txt") : null;
    }

    @JvmStatic
    public static final void createRestrictFile() {
        INSTANCE.createRestrictFile();
    }

    @JvmStatic
    public static final boolean hasApmSoCrash() {
        return INSTANCE.hasApmSoCrash();
    }
}
