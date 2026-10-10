package com.tencent.bugly.common.utils;

import com.tencent.bugly.proguard.C33714ie;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, m90084d2 = {"Lcom/tencent/bugly/common/utils/AndroidVersion;", "", "()V", "Companion", "bugly-pro_release"}, m90085k = 1, m90086mv = {1, 6, 0}, m90088xi = 48)
public final class AndroidVersion {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: compiled from: BUGLY */
    @Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007J\b\u0010\u0005\u001a\u00020\u0004H\u0007J\b\u0010\u0006\u001a\u00020\u0004H\u0007J\b\u0010\u0007\u001a\u00020\u0004H\u0007J\b\u0010\b\u001a\u00020\u0004H\u0007J\b\u0010\t\u001a\u00020\u0004H\u0007J\b\u0010\n\u001a\u00020\u0004H\u0007J\b\u0010\u000b\u001a\u00020\u0004H\u0007J\b\u0010\f\u001a\u00020\u0004H\u0007J\b\u0010\r\u001a\u00020\u0004H\u0007J\b\u0010\u000e\u001a\u00020\u0004H\u0007J\b\u0010\u000f\u001a\u00020\u0004H\u0007J\b\u0010\u0010\u001a\u00020\u0004H\u0007J\b\u0010\u0011\u001a\u00020\u0004H\u0007J\b\u0010\u0012\u001a\u00020\u0004H\u0007J\b\u0010\u0013\u001a\u00020\u0004H\u0007J\b\u0010\u0014\u001a\u00020\u0004H\u0007J\b\u0010\u0015\u001a\u00020\u0004H\u0007¨\u0006\u0016"}, m90084d2 = {"Lcom/tencent/bugly/common/utils/AndroidVersion$Companion;", "", "()V", "isOver33", "", "isOver34", "isOverHoneycomb", "isOverIceScreamSandwich", "isOverJellyBean", "isOverJellyBeanMr1", "isOverJellyBeanMr2", "isOverKitKat", "isOverKitKatWatch", "isOverL", "isOverLollipopMR1", "isOverM", "isOverN", "isOverO", "isOverP", "isOverQ", "isOverR", "isOverS", "bugly-pro_release"}, m90085k = 1, m90086mv = {1, 6, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final boolean isOver33() {
            if (C33714ie.m73408k().mo73415c() >= 33) {
                return true;
            }
            return false;
        }

        @JvmStatic
        public final boolean isOver34() {
            if (C33714ie.m73408k().mo73415c() >= 34) {
                return true;
            }
            return false;
        }

        @JvmStatic
        public final boolean isOverHoneycomb() {
            if (C33714ie.m73408k().mo73415c() >= 13) {
                return true;
            }
            return false;
        }

        @JvmStatic
        public final boolean isOverIceScreamSandwich() {
            if (C33714ie.m73408k().mo73415c() >= 14) {
                return true;
            }
            return false;
        }

        @JvmStatic
        public final boolean isOverJellyBean() {
            if (C33714ie.m73408k().mo73415c() >= 16) {
                return true;
            }
            return false;
        }

        @JvmStatic
        public final boolean isOverJellyBeanMr1() {
            if (C33714ie.m73408k().mo73415c() >= 17) {
                return true;
            }
            return false;
        }

        @JvmStatic
        public final boolean isOverJellyBeanMr2() {
            if (C33714ie.m73408k().mo73415c() >= 18) {
                return true;
            }
            return false;
        }

        @JvmStatic
        public final boolean isOverKitKat() {
            if (C33714ie.m73408k().mo73415c() >= 19) {
                return true;
            }
            return false;
        }

        @JvmStatic
        public final boolean isOverKitKatWatch() {
            if (C33714ie.m73408k().mo73415c() >= 20) {
                return true;
            }
            return false;
        }

        @JvmStatic
        public final boolean isOverL() {
            if (C33714ie.m73408k().mo73415c() >= 21) {
                return true;
            }
            return false;
        }

        @JvmStatic
        public final boolean isOverLollipopMR1() {
            if (C33714ie.m73408k().mo73415c() >= 22) {
                return true;
            }
            return false;
        }

        @JvmStatic
        public final boolean isOverM() {
            if (C33714ie.m73408k().mo73415c() >= 23) {
                return true;
            }
            return false;
        }

        @JvmStatic
        public final boolean isOverN() {
            if (C33714ie.m73408k().mo73415c() >= 24) {
                return true;
            }
            return false;
        }

        @JvmStatic
        public final boolean isOverO() {
            if (C33714ie.m73408k().mo73415c() >= 26) {
                return true;
            }
            return false;
        }

        @JvmStatic
        public final boolean isOverP() {
            if (C33714ie.m73408k().mo73415c() >= 28) {
                return true;
            }
            return false;
        }

        @JvmStatic
        public final boolean isOverQ() {
            if (C33714ie.m73408k().mo73415c() >= 29) {
                return true;
            }
            return false;
        }

        @JvmStatic
        public final boolean isOverR() {
            if (C33714ie.m73408k().mo73415c() >= 30) {
                return true;
            }
            return false;
        }

        @JvmStatic
        public final boolean isOverS() {
            if (C33714ie.m73408k().mo73415c() >= 31) {
                return true;
            }
            return false;
        }
    }

    @JvmStatic
    public static final boolean isOver33() {
        return INSTANCE.isOver33();
    }

    @JvmStatic
    public static final boolean isOver34() {
        return INSTANCE.isOver34();
    }

    @JvmStatic
    public static final boolean isOverHoneycomb() {
        return INSTANCE.isOverHoneycomb();
    }

    @JvmStatic
    public static final boolean isOverIceScreamSandwich() {
        return INSTANCE.isOverIceScreamSandwich();
    }

    @JvmStatic
    public static final boolean isOverJellyBean() {
        return INSTANCE.isOverJellyBean();
    }

    @JvmStatic
    public static final boolean isOverJellyBeanMr1() {
        return INSTANCE.isOverJellyBeanMr1();
    }

    @JvmStatic
    public static final boolean isOverJellyBeanMr2() {
        return INSTANCE.isOverJellyBeanMr2();
    }

    @JvmStatic
    public static final boolean isOverKitKat() {
        return INSTANCE.isOverKitKat();
    }

    @JvmStatic
    public static final boolean isOverKitKatWatch() {
        return INSTANCE.isOverKitKatWatch();
    }

    @JvmStatic
    public static final boolean isOverL() {
        return INSTANCE.isOverL();
    }

    @JvmStatic
    public static final boolean isOverLollipopMR1() {
        return INSTANCE.isOverLollipopMR1();
    }

    @JvmStatic
    public static final boolean isOverM() {
        return INSTANCE.isOverM();
    }

    @JvmStatic
    public static final boolean isOverN() {
        return INSTANCE.isOverN();
    }

    @JvmStatic
    public static final boolean isOverO() {
        return INSTANCE.isOverO();
    }

    @JvmStatic
    public static final boolean isOverP() {
        return INSTANCE.isOverP();
    }

    @JvmStatic
    public static final boolean isOverQ() {
        return INSTANCE.isOverQ();
    }

    @JvmStatic
    public static final boolean isOverR() {
        return INSTANCE.isOverR();
    }

    @JvmStatic
    public static final boolean isOverS() {
        return INSTANCE.isOverS();
    }
}
