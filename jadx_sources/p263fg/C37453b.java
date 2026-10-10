package p263fg;

import androidx.media3.exoplayer.upstream.CmcdData;
import cn.jiguang.privates.push.constants.JPushConstants;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.text.StringsKt;

/* JADX INFO: renamed from: fg.b */
/* JADX INFO: compiled from: HttpInternalCodec.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m90084d2 = {"Lfg/b;", "", "<init>", "()V", "Lorg/json/JSONObject;", JPushConstants.Analysis.KEY_JSON, "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Lorg/json/JSONObject;)I", "component_network_release"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
public final class C37453b {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C37453b f83069a = new C37453b();

    @JvmStatic
    /* JADX INFO: renamed from: a */
    public static final int m84245a(@NotNull JSONObject json) {
        String string;
        String string2;
        Intrinsics.checkNotNullParameter(json, "json");
        Object objOpt = json.opt("success");
        Integer intOrNull = null;
        Boolean boolValueOf = (objOpt == null || (string2 = objOpt.toString()) == null) ? null : Boolean.valueOf(Boolean.parseBoolean(string2));
        Object objOpt2 = json.opt("code");
        if (objOpt2 != null && (string = objOpt2.toString()) != null) {
            intOrNull = StringsKt.toIntOrNull(string);
        }
        if (Intrinsics.areEqual(boolValueOf, Boolean.TRUE) || (intOrNull != null && intOrNull.intValue() == 200)) {
            return 200;
        }
        if (intOrNull != null) {
            return intOrNull.intValue();
        }
        return -1000;
    }
}
