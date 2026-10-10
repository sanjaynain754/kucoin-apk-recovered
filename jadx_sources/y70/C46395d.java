package y70;

import android.app.Application;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.utils.DataMapUtil;
import com.tencent.mmkv.MMKV;
import com.tencent.mmkv.MMKVHandler;
import com.tencent.mmkv.MMKVLogLevel;
import com.tencent.mmkv.MMKVRecoverStrategic;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p716w7.C45744b;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.text.Typography;
import ro.C44128b;
import v70.C45463a;

/* JADX INFO: renamed from: y70.d */
/* JADX INFO: compiled from: KVStoreConfig.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0010\u0010\u0011R$\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u000b8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R$\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00068\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\t\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, m90084d2 = {"Ly70/d;", "", "<init>", "()V", "Landroid/app/Application;", "context", "", "isDebug", "", "c", "(Landroid/app/Application;Z)V", "", "siteType", "f", "(Ljava/lang/String;)V", "standalone", "g", "(Z)V", "<set-?>", "b", "Ljava/lang/String;", "()Ljava/lang/String;", "Z", "e", "()Z", "isStandalone", "Utils_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class C46395d {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C46395d f104046a = new C46395d();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static volatile String siteType = "global";

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public static boolean isStandalone;

    /* JADX INFO: renamed from: y70.d$a */
    /* JADX INFO: compiled from: KVStoreConfig.kt */
    @Metadata(m90083d1 = {"\u00007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\u0007\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ?\u0010\u0013\u001a\u00020\u00122\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00022\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, m90084d2 = {"y70/d$a", "Lcom/tencent/mmkv/MMKVHandler;", "", "mmapID", "Lcom/tencent/mmkv/MMKVRecoverStrategic;", "onMMKVCRCCheckFail", "(Ljava/lang/String;)Lcom/tencent/mmkv/MMKVRecoverStrategic;", "onMMKVFileLengthError", "", "wantLogRedirecting", "()Z", "Lcom/tencent/mmkv/MMKVLogLevel;", FirebaseAnalytics.Param.LEVEL, "file", "", "line", "func", "message", "", "mmkvLog", "(Lcom/tencent/mmkv/MMKVLogLevel;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "Utils_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    public static final class a implements MMKVHandler {
        @Override // com.tencent.mmkv.MMKVHandler
        public boolean wantLogRedirecting() {
            return true;
        }

        /* JADX INFO: renamed from: y70.d$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: KVStoreConfig.kt */
        /* JADX INFO: loaded from: classes54.dex */
        @Metadata(m90085k = 3, m90086mv = {1, 8, 0}, m90088xi = 48)
        public /* synthetic */ class C47038a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[MMKVLogLevel.values().length];
                try {
                    iArr[MMKVLogLevel.LevelDebug.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[MMKVLogLevel.LevelInfo.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[MMKVLogLevel.LevelWarning.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[MMKVLogLevel.LevelError.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        @Override // com.tencent.mmkv.MMKVHandler
        public void mmkvLog(@Nullable MMKVLogLevel level, @Nullable String file, int line, @Nullable String func, @Nullable String message) {
            String str = Typography.less + file + ':' + line + "::" + func + "> " + message;
            int i11 = level == null ? -1 : C47038a.$EnumSwitchMapping$0[level.ordinal()];
            if (i11 == 1) {
                C44128b.m97259c("MMKVHelper", str);
                return;
            }
            if (i11 == 2) {
                C44128b.m97266j("MMKVHelper", str);
                return;
            }
            if (i11 == 3) {
                C44128b.m97270n("MMKVHelper", str);
            } else if (i11 != 4) {
                C44128b.m97268l("MMKVHelper", str);
            } else {
                C44128b.m97261e("MMKVHelper", str);
            }
        }

        @Override // com.tencent.mmkv.MMKVHandler
        @NotNull
        public MMKVRecoverStrategic onMMKVCRCCheckFail(@Nullable String mmapID) {
            C45463a.m100409b(mmapID + ":onMMKVCRCCheckFail", "KVStoreConfig");
            return MMKVRecoverStrategic.OnErrorDiscard;
        }

        @Override // com.tencent.mmkv.MMKVHandler
        @NotNull
        public MMKVRecoverStrategic onMMKVFileLengthError(@Nullable String mmapID) {
            C45463a.m100409b(mmapID + ":onMMKVFileLengthError", "KVStoreConfig");
            return MMKVRecoverStrategic.OnErrorDiscard;
        }
    }

    @JvmStatic
    /* JADX INFO: renamed from: c */
    public static final void m102338c(@NotNull final Application context, boolean isDebug) {
        Intrinsics.checkNotNullParameter(context, "context");
        MMKV.initialize(context, new MMKV.LibLoader() { // from class: y70.c
            @Override // com.tencent.mmkv.MMKV.LibLoader
            public final void loadLibrary(String str) {
                C46395d.m102339d(context, str);
            }
        });
        MMKV.setLogLevel(isDebug ? MMKVLogLevel.LevelDebug : MMKVLogLevel.LevelNone);
        MMKV.registerHandler(new a());
        C46397f.m102370k(context, isDebug);
        DataMapUtil.f54245a.m66376k(context, isDebug);
    }

    /* JADX INFO: renamed from: d */
    public static final void m102339d(Application context, String str) {
        Intrinsics.checkNotNullParameter(context, "$context");
        C45744b.m100974a(context, str);
    }

    @JvmStatic
    /* JADX INFO: renamed from: g */
    public static final void m102341g(boolean standalone) {
        isStandalone = standalone;
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final String m102342b() {
        return siteType;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m102343e() {
        return isStandalone;
    }

    @JvmStatic
    /* JADX INFO: renamed from: f */
    public static final void m102340f(@NotNull String siteType2) {
        Intrinsics.checkNotNullParameter(siteType2, "siteType");
        siteType = siteType2;
    }
}
