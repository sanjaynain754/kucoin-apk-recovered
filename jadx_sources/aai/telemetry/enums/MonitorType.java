package aai.telemetry.enums;

import aai.O0000o0o0;
import com.sensorsdata.analytics.android.sdk.data.adapter.DbParams;
import java.io.File;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'LOG' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:399)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:364)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:349)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInvoke(EnumVisitor.java:315)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:288)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes23.dex */
public final class MonitorType {
    public static final MonitorType CRASH;
    public static final MonitorType EVENT;
    public static final MonitorType LOG;
    public static final MonitorType MIXED_EVENT;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ MonitorType[] f680b;
    public final String fileDir;
    public final String fileExtension;
    public final String logTag;
    public final int maxBatchFileCount;
    public final int minFilesForUploadTrigger;
    public final O0000o0o0 urlType;

    static {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("aai");
        String str = File.separator;
        sb2.append(str);
        sb2.append("logs");
        LOG = new MonitorType("LOG", 0, ".aailg", "", sb2.toString(), O0000o0o0.LOG, 5, 100);
        EVENT = new MonitorType("EVENT", 1, ".aailt", "", "aai" + str + DbParams.TABLE_EVENTS, O0000o0o0.SHENCE, 5, 100);
        CRASH = new MonitorType("CRASH", 2, ".aaicrash", "", "aai" + str + "crashes", O0000o0o0.CRASH, 5, 100);
        MIXED_EVENT = new MonitorType("MIXED_EVENT", 3, ".aaimixed", "", "aai" + str + "mixed", O0000o0o0.MIXED_EVENT, 10, 100);
        f680b = m829a();
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ MonitorType[] m829a() {
        return new MonitorType[]{LOG, EVENT, CRASH, MIXED_EVENT};
    }

    public static MonitorType valueOf(String str) {
        return (MonitorType) Enum.valueOf(MonitorType.class, str);
    }

    public static MonitorType[] values() {
        return (MonitorType[]) f680b.clone();
    }

    public MonitorType(String str, int i11, String str2, String str3, String str4, O0000o0o0 o0000o0o0, int i12, int i13) {
        super(str, i11);
        this.fileExtension = str2;
        this.logTag = str3;
        this.fileDir = str4;
        this.urlType = o0000o0o0;
        this.minFilesForUploadTrigger = i12;
        this.maxBatchFileCount = i13;
    }
}
