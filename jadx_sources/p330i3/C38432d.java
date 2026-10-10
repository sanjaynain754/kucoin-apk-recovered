package p330i3;

import android.os.Build;
import android.os.Bundle;
import androidx.media3.exoplayer.upstream.CmcdData;
import cn.jiguang.privates.common.constants.JCommonConstants;
import com.facebook.C5501a;
import com.facebook.internal.C5760c;
import com.facebook.internal.FetchedAppSettings;
import com.facebook.internal.FetchedAppSettingsManager;
import com.kubi.otc.entity.OtcAd;
import com.tencent.rmonitor.base.p144db.table.ReportDataTable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Locale;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;
import p464n6.C42757a;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.Regex;
import p852kotlin.text.StringsKt;

/* JADX INFO: renamed from: i3.d */
/* JADX INFO: compiled from: MACARuleMatchingManager.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u0011\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0003J\u0019\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ)\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0007¢\u0006\u0004\b\u0010\u0010\u0011J-\u0010\u0016\u001a\u0016\u0012\u0004\u0012\u00020\b\u0018\u00010\u0014j\n\u0012\u0004\u0012\u00020\b\u0018\u0001`\u00152\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0007¢\u0006\u0004\b\u0016\u0010\u0017J#\u0010\u0019\u001a\u00020\u000f2\b\u0010\u0018\u001a\u0004\u0018\u00010\b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ\u0019\u0010\u001c\u001a\u00020\b2\b\u0010\u001b\u001a\u0004\u0018\u00010\rH\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ!\u0010\u001f\u001a\u00020\u00042\b\u0010\u001b\u001a\u0004\u0018\u00010\r2\u0006\u0010\u001e\u001a\u00020\bH\u0007¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010!\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\r2\u0006\u0010\u001e\u001a\u00020\bH\u0007¢\u0006\u0004\b!\u0010 J\u0017\u0010\"\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\rH\u0007¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\u0004H\u0002¢\u0006\u0004\b$\u0010\u0003R\u0016\u0010&\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010%R\u0018\u0010(\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010'R\u001c\u0010+\u001a\b\u0012\u0004\u0012\u00020\b0)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010*¨\u0006,"}, m90084d2 = {"Li3/d;", "", "<init>", "()V", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Lorg/json/JSONObject;", "logic", "", "c", "(Lorg/json/JSONObject;)Ljava/lang/String;", "variable", "values", "Landroid/os/Bundle;", "data", "", "j", "(Ljava/lang/String;Lorg/json/JSONObject;Landroid/os/Bundle;)Z", "Lorg/json/JSONArray;", "jsonArray", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "e", "(Lorg/json/JSONArray;)Ljava/util/ArrayList;", "ruleString", "f", "(Ljava/lang/String;Landroid/os/Bundle;)Z", ReportDataTable.COLUMN_PARAMS, "d", "(Landroid/os/Bundle;)Ljava/lang/String;", "event", CmcdData.Factory.STREAMING_FORMAT_HLS, "(Landroid/os/Bundle;Ljava/lang/String;)V", "b", "i", "(Landroid/os/Bundle;)V", "g", "Z", "enabled", "Lorg/json/JSONArray;", "MACARules", "", "[Ljava/lang/String;", "keys", "facebook-core_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nMACARuleMatchingManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MACARuleMatchingManager.kt\ncom/facebook/appevents/integrity/MACARuleMatchingManager\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,261:1\n1747#2,3:262\n1726#2,3:265\n*S KotlinDebug\n*F\n+ 1 MACARuleMatchingManager.kt\ncom/facebook/appevents/integrity/MACARuleMatchingManager\n*L\n112#1:262,3\n120#1:265,3\n*E\n"})
public final class C38432d {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public static boolean enabled;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    public static JSONArray MACARules;

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C38432d f86238a = new C38432d();

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public static String[] keys = {"event", "_locale", "_appVersion", "_deviceOS", "_platform", "_deviceModel", "_nativeAppID", "_nativeAppShortVersion", "_timezone", "_carrier", "_deviceOSTypeName", "_deviceOSVersion", "_remainingDiskGB"};

    /* JADX WARN: Code duplicated, block: B:103:0x01aa A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:104:0x01ab A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:110:0x01c0 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:111:0x01c1 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:117:0x01dc A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:118:0x01dd A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:129:0x020b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:130:0x020c A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:135:0x0219 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:136:0x021a A[Catch: all -> 0x0044, TryCatch #0 {all -> 0x0044, blocks: (B:5:0x000a, B:8:0x001d, B:11:0x0038, B:20:0x004e, B:27:0x0069, B:28:0x006e, B:30:0x0073, B:33:0x007d, B:35:0x0096, B:38:0x00a0, B:42:0x00ac, B:136:0x021a, B:139:0x0221, B:140:0x0225, B:142:0x022b, B:45:0x00b6, B:48:0x00c0, B:50:0x00d9, B:151:0x025a, B:154:0x0261, B:155:0x0265, B:157:0x026b, B:53:0x00e3, B:56:0x00ed, B:58:0x0106, B:108:0x01b6, B:61:0x0110, B:101:0x019a, B:64:0x011a, B:91:0x0174, B:67:0x0124, B:70:0x012e, B:127:0x01fb, B:73:0x0138, B:76:0x0142, B:198:0x031b, B:79:0x014c, B:115:0x01cc, B:82:0x0156, B:85:0x0160, B:122:0x01e8, B:88:0x016a, B:95:0x0186, B:98:0x0190, B:105:0x01ac, B:112:0x01c2, B:119:0x01de, B:124:0x01f1, B:131:0x020d, B:146:0x024d, B:161:0x028d, B:164:0x0297, B:168:0x02b3, B:171:0x02bd, B:173:0x02c6, B:191:0x0306, B:176:0x02cf, B:179:0x02d9, B:181:0x02e7, B:184:0x02f1, B:186:0x02fa, B:193:0x030f, B:200:0x0324, B:203:0x032d, B:23:0x005f), top: B:209:0x000a }] */
    /* JADX WARN: Code duplicated, block: B:138:0x0220 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:139:0x0221 A[Catch: all -> 0x0044, TryCatch #0 {all -> 0x0044, blocks: (B:5:0x000a, B:8:0x001d, B:11:0x0038, B:20:0x004e, B:27:0x0069, B:28:0x006e, B:30:0x0073, B:33:0x007d, B:35:0x0096, B:38:0x00a0, B:42:0x00ac, B:136:0x021a, B:139:0x0221, B:140:0x0225, B:142:0x022b, B:45:0x00b6, B:48:0x00c0, B:50:0x00d9, B:151:0x025a, B:154:0x0261, B:155:0x0265, B:157:0x026b, B:53:0x00e3, B:56:0x00ed, B:58:0x0106, B:108:0x01b6, B:61:0x0110, B:101:0x019a, B:64:0x011a, B:91:0x0174, B:67:0x0124, B:70:0x012e, B:127:0x01fb, B:73:0x0138, B:76:0x0142, B:198:0x031b, B:79:0x014c, B:115:0x01cc, B:82:0x0156, B:85:0x0160, B:122:0x01e8, B:88:0x016a, B:95:0x0186, B:98:0x0190, B:105:0x01ac, B:112:0x01c2, B:119:0x01de, B:124:0x01f1, B:131:0x020d, B:146:0x024d, B:161:0x028d, B:164:0x0297, B:168:0x02b3, B:171:0x02bd, B:173:0x02c6, B:191:0x0306, B:176:0x02cf, B:179:0x02d9, B:181:0x02e7, B:184:0x02f1, B:186:0x02fa, B:193:0x030f, B:200:0x0324, B:203:0x032d, B:23:0x005f), top: B:209:0x000a }] */
    /* JADX WARN: Code duplicated, block: B:142:0x022b A[Catch: all -> 0x0044, TryCatch #0 {all -> 0x0044, blocks: (B:5:0x000a, B:8:0x001d, B:11:0x0038, B:20:0x004e, B:27:0x0069, B:28:0x006e, B:30:0x0073, B:33:0x007d, B:35:0x0096, B:38:0x00a0, B:42:0x00ac, B:136:0x021a, B:139:0x0221, B:140:0x0225, B:142:0x022b, B:45:0x00b6, B:48:0x00c0, B:50:0x00d9, B:151:0x025a, B:154:0x0261, B:155:0x0265, B:157:0x026b, B:53:0x00e3, B:56:0x00ed, B:58:0x0106, B:108:0x01b6, B:61:0x0110, B:101:0x019a, B:64:0x011a, B:91:0x0174, B:67:0x0124, B:70:0x012e, B:127:0x01fb, B:73:0x0138, B:76:0x0142, B:198:0x031b, B:79:0x014c, B:115:0x01cc, B:82:0x0156, B:85:0x0160, B:122:0x01e8, B:88:0x016a, B:95:0x0186, B:98:0x0190, B:105:0x01ac, B:112:0x01c2, B:119:0x01de, B:124:0x01f1, B:131:0x020d, B:146:0x024d, B:161:0x028d, B:164:0x0297, B:168:0x02b3, B:171:0x02bd, B:173:0x02c6, B:191:0x0306, B:176:0x02cf, B:179:0x02d9, B:181:0x02e7, B:184:0x02f1, B:186:0x02fa, B:193:0x030f, B:200:0x0324, B:203:0x032d, B:23:0x005f), top: B:209:0x000a }] */
    /* JADX WARN: Code duplicated, block: B:157:0x026b A[Catch: all -> 0x0044, TryCatch #0 {all -> 0x0044, blocks: (B:5:0x000a, B:8:0x001d, B:11:0x0038, B:20:0x004e, B:27:0x0069, B:28:0x006e, B:30:0x0073, B:33:0x007d, B:35:0x0096, B:38:0x00a0, B:42:0x00ac, B:136:0x021a, B:139:0x0221, B:140:0x0225, B:142:0x022b, B:45:0x00b6, B:48:0x00c0, B:50:0x00d9, B:151:0x025a, B:154:0x0261, B:155:0x0265, B:157:0x026b, B:53:0x00e3, B:56:0x00ed, B:58:0x0106, B:108:0x01b6, B:61:0x0110, B:101:0x019a, B:64:0x011a, B:91:0x0174, B:67:0x0124, B:70:0x012e, B:127:0x01fb, B:73:0x0138, B:76:0x0142, B:198:0x031b, B:79:0x014c, B:115:0x01cc, B:82:0x0156, B:85:0x0160, B:122:0x01e8, B:88:0x016a, B:95:0x0186, B:98:0x0190, B:105:0x01ac, B:112:0x01c2, B:119:0x01de, B:124:0x01f1, B:131:0x020d, B:146:0x024d, B:161:0x028d, B:164:0x0297, B:168:0x02b3, B:171:0x02bd, B:173:0x02c6, B:191:0x0306, B:176:0x02cf, B:179:0x02d9, B:181:0x02e7, B:184:0x02f1, B:186:0x02fa, B:193:0x030f, B:200:0x0324, B:203:0x032d, B:23:0x005f), top: B:209:0x000a }] */
    /* JADX WARN: Code duplicated, block: B:190:0x0305 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:191:0x0306 A[Catch: all -> 0x0044, TryCatch #0 {all -> 0x0044, blocks: (B:5:0x000a, B:8:0x001d, B:11:0x0038, B:20:0x004e, B:27:0x0069, B:28:0x006e, B:30:0x0073, B:33:0x007d, B:35:0x0096, B:38:0x00a0, B:42:0x00ac, B:136:0x021a, B:139:0x0221, B:140:0x0225, B:142:0x022b, B:45:0x00b6, B:48:0x00c0, B:50:0x00d9, B:151:0x025a, B:154:0x0261, B:155:0x0265, B:157:0x026b, B:53:0x00e3, B:56:0x00ed, B:58:0x0106, B:108:0x01b6, B:61:0x0110, B:101:0x019a, B:64:0x011a, B:91:0x0174, B:67:0x0124, B:70:0x012e, B:127:0x01fb, B:73:0x0138, B:76:0x0142, B:198:0x031b, B:79:0x014c, B:115:0x01cc, B:82:0x0156, B:85:0x0160, B:122:0x01e8, B:88:0x016a, B:95:0x0186, B:98:0x0190, B:105:0x01ac, B:112:0x01c2, B:119:0x01de, B:124:0x01f1, B:131:0x020d, B:146:0x024d, B:161:0x028d, B:164:0x0297, B:168:0x02b3, B:171:0x02bd, B:173:0x02c6, B:191:0x0306, B:176:0x02cf, B:179:0x02d9, B:181:0x02e7, B:184:0x02f1, B:186:0x02fa, B:193:0x030f, B:200:0x0324, B:203:0x032d, B:23:0x005f), top: B:209:0x000a }] */
    /* JADX WARN: Code duplicated, block: B:197:0x031a A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:198:0x031b A[Catch: all -> 0x0044, TryCatch #0 {all -> 0x0044, blocks: (B:5:0x000a, B:8:0x001d, B:11:0x0038, B:20:0x004e, B:27:0x0069, B:28:0x006e, B:30:0x0073, B:33:0x007d, B:35:0x0096, B:38:0x00a0, B:42:0x00ac, B:136:0x021a, B:139:0x0221, B:140:0x0225, B:142:0x022b, B:45:0x00b6, B:48:0x00c0, B:50:0x00d9, B:151:0x025a, B:154:0x0261, B:155:0x0265, B:157:0x026b, B:53:0x00e3, B:56:0x00ed, B:58:0x0106, B:108:0x01b6, B:61:0x0110, B:101:0x019a, B:64:0x011a, B:91:0x0174, B:67:0x0124, B:70:0x012e, B:127:0x01fb, B:73:0x0138, B:76:0x0142, B:198:0x031b, B:79:0x014c, B:115:0x01cc, B:82:0x0156, B:85:0x0160, B:122:0x01e8, B:88:0x016a, B:95:0x0186, B:98:0x0190, B:105:0x01ac, B:112:0x01c2, B:119:0x01de, B:124:0x01f1, B:131:0x020d, B:146:0x024d, B:161:0x028d, B:164:0x0297, B:168:0x02b3, B:171:0x02bd, B:173:0x02c6, B:191:0x0306, B:176:0x02cf, B:179:0x02d9, B:181:0x02e7, B:184:0x02f1, B:186:0x02fa, B:193:0x030f, B:200:0x0324, B:203:0x032d, B:23:0x005f), top: B:209:0x000a }] */
    /* JADX WARN: Code duplicated, block: B:211:0x024b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:212:? A[LOOP:0: B:140:0x0225->B:212:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:214:0x028b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:215:? A[LOOP:1: B:155:0x0265->B:215:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:22:0x005d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:23:0x005f A[Catch: all -> 0x0044, TryCatch #0 {all -> 0x0044, blocks: (B:5:0x000a, B:8:0x001d, B:11:0x0038, B:20:0x004e, B:27:0x0069, B:28:0x006e, B:30:0x0073, B:33:0x007d, B:35:0x0096, B:38:0x00a0, B:42:0x00ac, B:136:0x021a, B:139:0x0221, B:140:0x0225, B:142:0x022b, B:45:0x00b6, B:48:0x00c0, B:50:0x00d9, B:151:0x025a, B:154:0x0261, B:155:0x0265, B:157:0x026b, B:53:0x00e3, B:56:0x00ed, B:58:0x0106, B:108:0x01b6, B:61:0x0110, B:101:0x019a, B:64:0x011a, B:91:0x0174, B:67:0x0124, B:70:0x012e, B:127:0x01fb, B:73:0x0138, B:76:0x0142, B:198:0x031b, B:79:0x014c, B:115:0x01cc, B:82:0x0156, B:85:0x0160, B:122:0x01e8, B:88:0x016a, B:95:0x0186, B:98:0x0190, B:105:0x01ac, B:112:0x01c2, B:119:0x01de, B:124:0x01f1, B:131:0x020d, B:146:0x024d, B:161:0x028d, B:164:0x0297, B:168:0x02b3, B:171:0x02bd, B:173:0x02c6, B:191:0x0306, B:176:0x02cf, B:179:0x02d9, B:181:0x02e7, B:184:0x02f1, B:186:0x02fa, B:193:0x030f, B:200:0x0324, B:203:0x032d, B:23:0x005f), top: B:209:0x000a }] */
    /* JADX WARN: Code duplicated, block: B:24:0x0065  */
    /* JADX WARN: Code duplicated, block: B:26:0x0068 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:93:0x0184 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:94:0x0185 A[RETURN] */
    @JvmStatic
    /* JADX INFO: renamed from: j */
    public static final boolean m86678j(@NotNull String variable, @NotNull JSONObject values, @Nullable Bundle data) {
        Object obj;
        String lowerCase;
        String lowerCase2;
        String lowerCase3;
        String lowerCase4;
        if (C42757a.m93689d(C38432d.class)) {
            return false;
        }
        try {
            Intrinsics.checkNotNullParameter(variable, "variable");
            Intrinsics.checkNotNullParameter(values, "values");
            String strM86672c = m86672c(values);
            if (strM86672c == null) {
                return false;
            }
            String string = values.get(strM86672c).toString();
            ArrayList<String> arrayListM86674e = m86674e(values.optJSONArray(strM86672c));
            if (Intrinsics.areEqual(strM86672c, "exists")) {
                return data != null && data.containsKey(variable) == Boolean.parseBoolean(string);
            }
            if (data != null) {
                String lowerCase5 = variable.toLowerCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(lowerCase5, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                obj = data.get(lowerCase5);
                if (obj == null) {
                    if (data != null) {
                        obj = data.get(variable);
                    } else {
                        obj = null;
                    }
                    if (obj == null) {
                        return false;
                    }
                }
            } else {
                if (data != null) {
                    obj = data.get(variable);
                } else {
                    obj = null;
                }
                if (obj == null) {
                    return false;
                }
            }
            switch (strM86672c.hashCode()) {
                case -1729128927:
                    if (strM86672c.equals("i_not_contains")) {
                        String string2 = obj.toString();
                        Locale locale = Locale.ROOT;
                        String lowerCase6 = string2.toLowerCase(locale);
                        Intrinsics.checkNotNullExpressionValue(lowerCase6, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                        String lowerCase7 = string.toLowerCase(locale);
                        Intrinsics.checkNotNullExpressionValue(lowerCase7, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                        return !StringsKt.contains$default((CharSequence) lowerCase6, (CharSequence) lowerCase7, false, 2, (Object) null);
                    }
                    return false;
                case -1179774633:
                    if (!strM86672c.equals("is_any")) {
                        return false;
                    }
                    if (arrayListM86674e == null) {
                        return false;
                    }
                    return arrayListM86674e.contains(obj.toString());
                case -1039699439:
                    if (!strM86672c.equals("not_in")) {
                        return false;
                    }
                    if (arrayListM86674e == null) {
                        return false;
                    }
                    return arrayListM86674e.contains(obj.toString());
                case -969266188:
                    if (strM86672c.equals("starts_with")) {
                        return StringsKt.startsWith$default(obj.toString(), string, false, 2, (Object) null);
                    }
                    return false;
                case -966353971:
                    if (strM86672c.equals("regex_match")) {
                        return new Regex(string).matches(obj.toString());
                    }
                    return false;
                case -665609109:
                    if (!strM86672c.equals("is_not_any")) {
                        return false;
                    }
                    if (arrayListM86674e == null) {
                        return false;
                    }
                    return arrayListM86674e.contains(obj.toString());
                case -567445985:
                    if (strM86672c.equals("contains")) {
                        return StringsKt.contains$default((CharSequence) obj.toString(), (CharSequence) string, false, 2, (Object) null);
                    }
                    return false;
                case -327990090:
                    if (!strM86672c.equals("i_str_neq")) {
                        return false;
                    }
                    String string3 = obj.toString();
                    Locale locale2 = Locale.ROOT;
                    String lowerCase8 = string3.toLowerCase(locale2);
                    Intrinsics.checkNotNullExpressionValue(lowerCase8, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                    String lowerCase9 = string.toLowerCase(locale2);
                    Intrinsics.checkNotNullExpressionValue(lowerCase9, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                    return !Intrinsics.areEqual(lowerCase8, lowerCase9);
                case -159812115:
                    if (!strM86672c.equals("i_is_any")) {
                        return false;
                    }
                    if (arrayListM86674e != null || arrayListM86674e.isEmpty()) {
                        return false;
                    }
                    for (String str : arrayListM86674e) {
                        Locale locale3 = Locale.ROOT;
                        lowerCase = str.toLowerCase(locale3);
                        Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                        lowerCase2 = obj.toString().toLowerCase(locale3);
                        Intrinsics.checkNotNullExpressionValue(lowerCase2, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                        if (Intrinsics.areEqual(lowerCase, lowerCase2)) {
                            return true;
                        }
                    }
                    return false;
                case -92753547:
                    if (!strM86672c.equals("i_str_not_in")) {
                        return false;
                    }
                    if (arrayListM86674e == null) {
                        return false;
                    }
                    if (arrayListM86674e.isEmpty()) {
                        return true;
                    }
                    for (String str2 : arrayListM86674e) {
                        Locale locale4 = Locale.ROOT;
                        lowerCase3 = str2.toLowerCase(locale4);
                        Intrinsics.checkNotNullExpressionValue(lowerCase3, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                        lowerCase4 = obj.toString().toLowerCase(locale4);
                        Intrinsics.checkNotNullExpressionValue(lowerCase4, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                        if (Intrinsics.areEqual(lowerCase3, lowerCase4)) {
                            return false;
                        }
                    }
                    return true;
                case 60:
                    if (!strM86672c.equals("<")) {
                        return false;
                    }
                    if (Double.parseDouble(obj.toString()) < Double.parseDouble(string)) {
                        return true;
                    }
                    return false;
                case 61:
                    if (!strM86672c.equals("=")) {
                        return false;
                    }
                    return Intrinsics.areEqual(obj.toString(), string);
                case 62:
                    if (!strM86672c.equals(">")) {
                        return false;
                    }
                    if (Double.parseDouble(obj.toString()) > Double.parseDouble(string)) {
                        return true;
                    }
                    return false;
                case 1084:
                    if (!strM86672c.equals("!=")) {
                        return false;
                    }
                    if (Intrinsics.areEqual(obj.toString(), string)) {
                        return false;
                    }
                    return true;
                case 1921:
                    if (!strM86672c.equals("<=")) {
                        return false;
                    }
                    if (Double.parseDouble(obj.toString()) <= Double.parseDouble(string)) {
                        return true;
                    }
                    return false;
                case 1952:
                    if (!strM86672c.equals("==")) {
                        return false;
                    }
                    return Intrinsics.areEqual(obj.toString(), string);
                case 1983:
                    if (!strM86672c.equals(">=")) {
                        return false;
                    }
                    if (Double.parseDouble(obj.toString()) >= Double.parseDouble(string)) {
                        return true;
                    }
                    return false;
                case 3244:
                    if (!strM86672c.equals("eq")) {
                        return false;
                    }
                    return Intrinsics.areEqual(obj.toString(), string);
                case 3294:
                    if (!strM86672c.equals("ge")) {
                        return false;
                    }
                    if (Double.parseDouble(obj.toString()) >= Double.parseDouble(string)) {
                        return true;
                    }
                    return false;
                case 3309:
                    if (!strM86672c.equals(OtcAd.TRADE_NUM_GT)) {
                        return false;
                    }
                    if (Double.parseDouble(obj.toString()) > Double.parseDouble(string)) {
                        return true;
                    }
                    return false;
                case 3365:
                    if (!strM86672c.equals("in")) {
                        return false;
                    }
                    if (arrayListM86674e == null) {
                        return false;
                    }
                    return arrayListM86674e.contains(obj.toString());
                case 3449:
                    if (!strM86672c.equals("le")) {
                        return false;
                    }
                    if (Double.parseDouble(obj.toString()) <= Double.parseDouble(string)) {
                        return true;
                    }
                    return false;
                case 3464:
                    if (!strM86672c.equals(OtcAd.TRADE_NUM_LT)) {
                        return false;
                    }
                    if (Double.parseDouble(obj.toString()) < Double.parseDouble(string)) {
                        return true;
                    }
                    return false;
                case 3511:
                    if (!strM86672c.equals("ne")) {
                        return false;
                    }
                    if (Intrinsics.areEqual(obj.toString(), string)) {
                        return true;
                    }
                    return false;
                case 102680:
                    if (!strM86672c.equals("gte")) {
                        return false;
                    }
                    if (Double.parseDouble(obj.toString()) >= Double.parseDouble(string)) {
                        return true;
                    }
                    return false;
                case 107485:
                    if (!strM86672c.equals(JCommonConstants.Network.RADIO_4G)) {
                        return false;
                    }
                    if (Double.parseDouble(obj.toString()) <= Double.parseDouble(string)) {
                        return true;
                    }
                    return false;
                case 108954:
                    if (!strM86672c.equals("neq")) {
                        return false;
                    }
                    if (Intrinsics.areEqual(obj.toString(), string)) {
                        return true;
                    }
                    return false;
                case 127966736:
                    if (!strM86672c.equals("i_str_eq")) {
                        return false;
                    }
                    String string4 = obj.toString();
                    Locale locale5 = Locale.ROOT;
                    String lowerCase10 = string4.toLowerCase(locale5);
                    Intrinsics.checkNotNullExpressionValue(lowerCase10, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                    String lowerCase11 = string.toLowerCase(locale5);
                    Intrinsics.checkNotNullExpressionValue(lowerCase11, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                    return Intrinsics.areEqual(lowerCase10, lowerCase11);
                case 127966857:
                    if (!strM86672c.equals("i_str_in")) {
                        return false;
                    }
                    if (arrayListM86674e != null) {
                        return false;
                    }
                    while (r8.hasNext()) {
                        Locale locale6 = Locale.ROOT;
                        lowerCase = str.toLowerCase(locale6);
                        Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                        lowerCase2 = obj.toString().toLowerCase(locale6);
                        Intrinsics.checkNotNullExpressionValue(lowerCase2, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                        if (Intrinsics.areEqual(lowerCase, lowerCase2)) {
                            return true;
                        }
                    }
                    return false;
                case 363990325:
                    if (!strM86672c.equals("i_contains")) {
                        return false;
                    }
                    String string5 = obj.toString();
                    Locale locale7 = Locale.ROOT;
                    String lowerCase12 = string5.toLowerCase(locale7);
                    Intrinsics.checkNotNullExpressionValue(lowerCase12, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                    String lowerCase13 = string.toLowerCase(locale7);
                    Intrinsics.checkNotNullExpressionValue(lowerCase13, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                    return StringsKt.contains$default((CharSequence) lowerCase12, (CharSequence) lowerCase13, false, 2, (Object) null);
                case 1091487233:
                    if (!strM86672c.equals("i_is_not_any")) {
                        return false;
                    }
                    if (arrayListM86674e == null) {
                        return false;
                    }
                    if (arrayListM86674e.isEmpty()) {
                        return true;
                    }
                    while (r8.hasNext()) {
                        Locale locale8 = Locale.ROOT;
                        lowerCase3 = str2.toLowerCase(locale8);
                        Intrinsics.checkNotNullExpressionValue(lowerCase3, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                        lowerCase4 = obj.toString().toLowerCase(locale8);
                        Intrinsics.checkNotNullExpressionValue(lowerCase4, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                        if (Intrinsics.areEqual(lowerCase3, lowerCase4)) {
                            return false;
                        }
                    }
                    return true;
                case 1918401035:
                    return strM86672c.equals("not_contains") && !StringsKt.contains$default((CharSequence) obj.toString(), (CharSequence) string, false, 2, (Object) null);
                case 1961112862:
                    if (!strM86672c.equals("i_starts_with")) {
                        return false;
                    }
                    String string6 = obj.toString();
                    Locale locale9 = Locale.ROOT;
                    String lowerCase14 = string6.toLowerCase(locale9);
                    Intrinsics.checkNotNullExpressionValue(lowerCase14, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                    String lowerCase15 = string.toLowerCase(locale9);
                    Intrinsics.checkNotNullExpressionValue(lowerCase15, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                    return StringsKt.startsWith$default(lowerCase14, lowerCase15, false, 2, (Object) null);
                default:
                    return false;
            }
        } catch (Throwable th2) {
            C42757a.m93687b(th2, C38432d.class);
            return false;
        }
    }

    @JvmStatic
    /* JADX INFO: renamed from: a */
    public static final void m86670a() {
        if (C42757a.m93689d(C38432d.class)) {
            return;
        }
        try {
            f86238a.m86679g();
            if (MACARules != null) {
                enabled = true;
            }
        } catch (Throwable th2) {
            C42757a.m93687b(th2, C38432d.class);
        }
    }

    @JvmStatic
    /* JADX INFO: renamed from: b */
    public static final void m86671b(@NotNull Bundle params, @NotNull String event) {
        if (C42757a.m93689d(C38432d.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(params, "params");
            Intrinsics.checkNotNullParameter(event, "event");
            params.putString("event", event);
            StringBuilder sb2 = new StringBuilder();
            C5760c c5760c = C5760c.f9649a;
            Locale localeM10095H = c5760c.m10095H();
            String language = localeM10095H != null ? localeM10095H.getLanguage() : null;
            String str = "";
            if (language == null) {
                language = "";
            }
            sb2.append(language);
            sb2.append('_');
            Locale localeM10095H2 = c5760c.m10095H();
            String country = localeM10095H2 != null ? localeM10095H2.getCountry() : null;
            if (country == null) {
                country = "";
            }
            sb2.append(country);
            params.putString("_locale", sb2.toString());
            String strM10097O = c5760c.m10097O();
            if (strM10097O == null) {
                strM10097O = "";
            }
            params.putString("_appVersion", strM10097O);
            params.putString("_deviceOS", "ANDROID");
            params.putString("_platform", "mobile");
            String str2 = Build.MODEL;
            if (str2 == null) {
                str2 = "";
            }
            params.putString("_deviceModel", str2);
            params.putString("_nativeAppID", C5501a.m7800n());
            String strM10097O2 = c5760c.m10097O();
            if (strM10097O2 != null) {
                str = strM10097O2;
            }
            params.putString("_nativeAppShortVersion", str);
            params.putString("_timezone", c5760c.m10093C());
            params.putString("_carrier", c5760c.m10114x());
            params.putString("_deviceOSTypeName", "ANDROID");
            params.putString("_deviceOSVersion", Build.VERSION.RELEASE);
            params.putLong("_remainingDiskGB", c5760c.m10113v());
        } catch (Throwable th2) {
            C42757a.m93687b(th2, C38432d.class);
        }
    }

    @JvmStatic
    @Nullable
    /* JADX INFO: renamed from: c */
    public static final String m86672c(@NotNull JSONObject logic) {
        if (C42757a.m93689d(C38432d.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(logic, "logic");
            Iterator<String> itKeys = logic.keys();
            if (itKeys.hasNext()) {
                return itKeys.next();
            }
            return null;
        } catch (Throwable th2) {
            C42757a.m93687b(th2, C38432d.class);
            return null;
        }
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: d */
    public static final String m86673d(@Nullable Bundle params) {
        String strOptString;
        if (C42757a.m93689d(C38432d.class)) {
            return null;
        }
        try {
            JSONArray jSONArray = MACARules;
            if (jSONArray == null) {
                return HttpUrl.PATH_SEGMENT_ENCODE_SET_URI;
            }
            if (jSONArray != null && jSONArray.length() == 0) {
                return HttpUrl.PATH_SEGMENT_ENCODE_SET_URI;
            }
            JSONArray jSONArray2 = MACARules;
            Intrinsics.checkNotNull(jSONArray2, "null cannot be cast to non-null type org.json.JSONArray");
            ArrayList arrayList = new ArrayList();
            int length = jSONArray2.length();
            for (int i11 = 0; i11 < length; i11++) {
                String strOptString2 = jSONArray2.optString(i11);
                if (strOptString2 != null) {
                    JSONObject jSONObject = new JSONObject(strOptString2);
                    long jOptLong = jSONObject.optLong("id");
                    if (jOptLong != 0 && (strOptString = jSONObject.optString("rule")) != null && m86675f(strOptString, params)) {
                        arrayList.add(Long.valueOf(jOptLong));
                    }
                }
            }
            String string = new JSONArray((Collection) arrayList).toString();
            Intrinsics.checkNotNullExpressionValue(string, "JSONArray(res).toString()");
            return string;
        } catch (Throwable th2) {
            C42757a.m93687b(th2, C38432d.class);
            return null;
        }
    }

    @JvmStatic
    @Nullable
    /* JADX INFO: renamed from: e */
    public static final ArrayList<String> m86674e(@Nullable JSONArray jsonArray) {
        if (C42757a.m93689d(C38432d.class) || jsonArray == null) {
            return null;
        }
        try {
            ArrayList<String> arrayList = new ArrayList<>();
            int length = jsonArray.length();
            for (int i11 = 0; i11 < length; i11++) {
                arrayList.add(jsonArray.get(i11).toString());
            }
            return arrayList;
        } catch (Throwable th2) {
            C42757a.m93687b(th2, C38432d.class);
            return null;
        }
    }

    @JvmStatic
    /* JADX INFO: renamed from: f */
    public static final boolean m86675f(@Nullable String ruleString, @Nullable Bundle data) {
        if (!C42757a.m93689d(C38432d.class) && ruleString != null && data != null) {
            try {
                JSONObject jSONObject = new JSONObject(ruleString);
                String strM86672c = m86672c(jSONObject);
                if (strM86672c == null) {
                    return false;
                }
                Object obj = jSONObject.get(strM86672c);
                int iHashCode = strM86672c.hashCode();
                if (iHashCode != 3555) {
                    if (iHashCode != 96727) {
                        if (iHashCode == 109267 && strM86672c.equals("not")) {
                            return !m86675f(obj.toString(), data);
                        }
                    } else if (strM86672c.equals("and")) {
                        JSONArray jSONArray = (JSONArray) obj;
                        if (jSONArray == null) {
                            return false;
                        }
                        int length = jSONArray.length();
                        for (int i11 = 0; i11 < length; i11++) {
                            if (!m86675f(jSONArray.get(i11).toString(), data)) {
                                return false;
                            }
                        }
                        return true;
                    }
                } else if (strM86672c.equals("or")) {
                    JSONArray jSONArray2 = (JSONArray) obj;
                    if (jSONArray2 == null) {
                        return false;
                    }
                    int length2 = jSONArray2.length();
                    for (int i12 = 0; i12 < length2; i12++) {
                        if (m86675f(jSONArray2.get(i12).toString(), data)) {
                            return true;
                        }
                    }
                    return false;
                }
                JSONObject jSONObject2 = (JSONObject) obj;
                if (jSONObject2 == null) {
                    return false;
                }
                return m86678j(strM86672c, jSONObject2, data);
            } catch (Throwable th2) {
                C42757a.m93687b(th2, C38432d.class);
            }
        }
        return false;
    }

    @JvmStatic
    /* JADX INFO: renamed from: h */
    public static final void m86676h(@Nullable Bundle params, @NotNull String event) {
        if (C42757a.m93689d(C38432d.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(event, "event");
            if (!enabled || params == null) {
                return;
            }
            try {
                m86671b(params, event);
                params.putString("_audiencePropertyIds", m86673d(params));
                params.putString("cs_maca", "1");
                m86677i(params);
            } catch (Exception unused) {
            }
        } catch (Throwable th2) {
            C42757a.m93687b(th2, C38432d.class);
        }
    }

    @JvmStatic
    /* JADX INFO: renamed from: i */
    public static final void m86677i(@NotNull Bundle params) {
        if (C42757a.m93689d(C38432d.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(params, "params");
            for (String str : keys) {
                params.remove(str);
            }
        } catch (Throwable th2) {
            C42757a.m93687b(th2, C38432d.class);
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m86679g() {
        if (!C42757a.m93689d(this)) {
            try {
                FetchedAppSettings fetchedAppSettingsM9982u = FetchedAppSettingsManager.m9982u(C5501a.m7800n(), false);
                if (fetchedAppSettingsM9982u == null) {
                    return;
                }
                MACARules = fetchedAppSettingsM9982u.getMACARuleMatchingSetting();
            } catch (Throwable th2) {
                C42757a.m93687b(th2, this);
            }
        }
    }
}
