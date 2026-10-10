package com.tencent.bugly.proguard;

import androidx.annotation.RestrictTo;
import com.tencent.rmonitor.base.config.PluginCombination;
import com.tencent.rmonitor.common.logger.LogState;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.List;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.bf */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public interface InterfaceC33568bf {

    /* JADX INFO: renamed from: A */
    public static final int f69205A = 212;

    /* JADX INFO: renamed from: B */
    public static final int f69206B = 213;

    /* JADX INFO: renamed from: C */
    public static final int f69207C = 215;

    /* JADX INFO: renamed from: D */
    public static final int f69208D = 216;

    /* JADX INFO: renamed from: E */
    public static final int f69209E = 217;

    /* JADX INFO: renamed from: F */
    public static final int f69210F = 219;

    /* JADX INFO: renamed from: G */
    @Deprecated
    public static final int f69211G = C33609de.m72854a("activity_leak");

    /* JADX INFO: renamed from: H */
    @Deprecated
    public static final int f69212H = C33609de.m72854a("io");

    /* JADX INFO: renamed from: I */
    @Deprecated
    public static final int f69213I = C33609de.m72854a("db");

    /* JADX INFO: renamed from: J */
    @Deprecated
    public static final int f69214J = C33609de.m72854a("looper_stack");

    /* JADX INFO: renamed from: K */
    @Deprecated
    public static final int f69215K = C33609de.m72854a("looper_metric");

    /* JADX INFO: renamed from: L */
    @Deprecated
    public static final int f69216L = C33609de.m72854a("looper_metric");

    /* JADX INFO: renamed from: M */
    @Deprecated
    public static final int f69217M = C33609de.m72854a("fd_leak");

    /* JADX INFO: renamed from: N */
    @Deprecated
    public static final int f69218N = C33609de.m72854a("native_memory");

    /* JADX INFO: renamed from: O */
    @Deprecated
    public static final int f69219O = C33609de.m72854a("big_bitmap");

    /* JADX INFO: renamed from: P */
    @Deprecated
    public static final int f69220P = C33609de.m72854a("work_thread_lag");

    /* JADX INFO: renamed from: Q */
    @Deprecated
    public static final int f69221Q = C33609de.m72854a("traffic");

    /* JADX INFO: renamed from: R */
    @Deprecated
    public static final int f69222R = C33609de.m72854a("traffic_detail");

    /* JADX INFO: renamed from: S */
    public static final int f69223S = LogState.OFF.getValue();

    /* JADX INFO: renamed from: T */
    public static final int f69224T = LogState.ERROR.getValue();

    /* JADX INFO: renamed from: U */
    public static final int f69225U = LogState.WARN.getValue();

    /* JADX INFO: renamed from: V */
    public static final int f69226V = LogState.INFO.getValue();

    /* JADX INFO: renamed from: W */
    public static final int f69227W = LogState.DEBUG.getValue();

    /* JADX INFO: renamed from: X */
    public static final int f69228X = LogState.VERBOS.getValue();

    /* JADX INFO: renamed from: a */
    public static final int f69229a = 100;

    /* JADX INFO: renamed from: b */
    public static final int f69230b = 101;

    /* JADX INFO: renamed from: c */
    public static final int f69231c = 102;

    /* JADX INFO: renamed from: d */
    public static final int f69232d = 103;

    /* JADX INFO: renamed from: e */
    public static final int f69233e = 104;

    /* JADX INFO: renamed from: f */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @Deprecated
    public static final int f69234f = 105;

    /* JADX INFO: renamed from: g */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @Deprecated
    public static final int f69235g = 106;

    /* JADX INFO: renamed from: h */
    public static final int f69236h = 106;

    /* JADX INFO: renamed from: i */
    public static final int f69237i = 107;

    /* JADX INFO: renamed from: j */
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    @Deprecated
    public static final int f69238j = 108;

    /* JADX INFO: renamed from: k */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @Deprecated
    public static final int f69239k = 109;

    /* JADX INFO: renamed from: l */
    public static final int f69240l = 109;

    /* JADX INFO: renamed from: m */
    public static final int f69241m = 110;

    /* JADX INFO: renamed from: n */
    public static final int f69242n = 111;

    /* JADX INFO: renamed from: o */
    public static final int f69243o = 112;

    /* JADX INFO: renamed from: p */
    public static final int f69244p = 113;

    /* JADX INFO: renamed from: q */
    public static final int f69245q = 214;

    /* JADX INFO: renamed from: r */
    public static final int f69246r = 201;

    /* JADX INFO: renamed from: s */
    public static final int f69247s = 202;

    /* JADX INFO: renamed from: t */
    public static final int f69248t = 203;

    /* JADX INFO: renamed from: u */
    public static final int f69249u = 205;

    /* JADX INFO: renamed from: v */
    public static final int f69250v = 207;

    /* JADX INFO: renamed from: w */
    public static final int f69251w = 208;

    /* JADX INFO: renamed from: x */
    public static final int f69252x = 209;

    /* JADX INFO: renamed from: y */
    public static final int f69253y = 210;

    /* JADX INFO: renamed from: z */
    public static final int f69254z = 211;

    /* JADX INFO: renamed from: com.tencent.bugly.proguard.bf$a */
    /* JADX INFO: compiled from: BUGLY */
    public interface a {

        /* JADX INFO: renamed from: a */
        public static final String f69255a = "Unknown";

        /* JADX INFO: renamed from: b */
        public static final String f69256b = "Debug";

        /* JADX INFO: renamed from: c */
        public static final String f69257c = "Gray";

        /* JADX INFO: renamed from: d */
        public static final String f69258d = "Release";
    }

    /* JADX INFO: renamed from: com.tencent.bugly.proguard.bf$b */
    /* JADX INFO: compiled from: BUGLY */
    public interface b {

        /* JADX INFO: renamed from: a */
        public static final String f69259a = "looper_metric";

        /* JADX INFO: renamed from: b */
        public static final String f69260b = "looper_stack";

        /* JADX INFO: renamed from: c */
        public static final String f69261c = "db";

        /* JADX INFO: renamed from: d */
        public static final String f69262d = "io";

        /* JADX INFO: renamed from: e */
        public static final String f69263e = "work_thread_lag";

        /* JADX INFO: renamed from: f */
        public static final String f69264f = "launch_metric";

        /* JADX INFO: renamed from: g */
        public static final String f69265g = "activity_leak";

        /* JADX INFO: renamed from: h */
        public static final String f69266h = "big_bitmap";

        /* JADX INFO: renamed from: i */
        public static final String f69267i = "fd_leak";

        /* JADX INFO: renamed from: j */
        public static final String f69268j = "native_memory";

        /* JADX INFO: renamed from: k */
        public static final String f69269k = "asan";

        /* JADX INFO: renamed from: l */
        public static final String f69270l = "traffic";

        /* JADX INFO: renamed from: m */
        public static final String f69271m = "traffic_detail";

        /* JADX INFO: renamed from: n */
        public static final String f69272n = "net_quality";

        /* JADX INFO: renamed from: o */
        public static final String f69273o = "battery_metric";

        /* JADX INFO: renamed from: p */
        public static final String f69274p = "battery_ele_metric";

        /* JADX INFO: renamed from: q */
        public static final String f69275q = "battery_element";

        /* JADX INFO: renamed from: r */
        public static final String f69276r = "java_memory_ceiling_hprof";

        /* JADX INFO: renamed from: s */
        public static final String f69277s = "page_launch";

        /* JADX INFO: renamed from: t */
        public static final String f69278t = "custom_event";

        /* JADX INFO: renamed from: u */
        public static final List<String> f69279u;

        /* JADX INFO: renamed from: v */
        public static final List<String> f69280v;

        static {
            PluginCombination.Companion companion = PluginCombination.INSTANCE;
            f69279u = companion.getModeStableNames();
            f69280v = companion.getModeAllNames();
        }
    }

    /* JADX INFO: renamed from: com.tencent.bugly.proguard.bf$c */
    /* JADX INFO: compiled from: BUGLY */
    @Retention(RetentionPolicy.SOURCE)
    public @interface c {
    }

    /* JADX INFO: renamed from: com.tencent.bugly.proguard.bf$d */
    /* JADX INFO: compiled from: BUGLY */
    @Retention(RetentionPolicy.SOURCE)
    public @interface d {
    }

    /* JADX INFO: renamed from: com.tencent.bugly.proguard.bf$e */
    /* JADX INFO: compiled from: BUGLY */
    @Retention(RetentionPolicy.SOURCE)
    public @interface e {
    }
}
